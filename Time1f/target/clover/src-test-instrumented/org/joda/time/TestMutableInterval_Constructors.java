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
package org.joda.time;

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.IntervalConverter;

/**
 * This class is a JUnit test for Interval.
 *
 * @author Stephen Colebourne
 */
public class TestMutableInterval_Constructors extends TestCase {static class __CLR4_4_1uoluollc8azvwz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,40187,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    
    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    long y2003days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365 + 365;
    
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    // 2002-04-05
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 2003-05-06
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
    
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1uoluollc8azvwz.R.inc(39765);
        __CLR4_4_1uoluollc8azvwz.R.inc(39766);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1uoluollc8azvwz.R.inc(39767);
        __CLR4_4_1uoluollc8azvwz.R.inc(39768);return new TestSuite(TestMutableInterval_Constructors.class);
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    public TestMutableInterval_Constructors(String name) {
        super(name);__CLR4_4_1uoluollc8azvwz.R.inc(39770);try{__CLR4_4_1uoluollc8azvwz.R.inc(39769);
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1uoluollc8azvwz.R.inc(39771);
        __CLR4_4_1uoluollc8azvwz.R.inc(39772);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1uoluollc8azvwz.R.inc(39773);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1uoluollc8azvwz.R.inc(39774);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1uoluollc8azvwz.R.inc(39775);originalLocale = Locale.getDefault();
        __CLR4_4_1uoluollc8azvwz.R.inc(39776);DateTimeZone.setDefault(PARIS);
        __CLR4_4_1uoluollc8azvwz.R.inc(39777);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1uoluollc8azvwz.R.inc(39778);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1uoluollc8azvwz.R.inc(39779);
        __CLR4_4_1uoluollc8azvwz.R.inc(39780);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1uoluollc8azvwz.R.inc(39781);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1uoluollc8azvwz.R.inc(39782);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1uoluollc8azvwz.R.inc(39783);Locale.setDefault(originalLocale);
        __CLR4_4_1uoluollc8azvwz.R.inc(39784);originalDateTimeZone = null;
        __CLR4_4_1uoluollc8azvwz.R.inc(39785);originalTimeZone = null;
        __CLR4_4_1uoluollc8azvwz.R.inc(39786);originalLocale = null;
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testTest() {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),39787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqjup7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39787,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqjup7(){try{__CLR4_4_1uoluollc8azvwz.R.inc(39787);
        __CLR4_4_1uoluollc8azvwz.R.inc(39788);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
        __CLR4_4_1uoluollc8azvwz.R.inc(39789);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        __CLR4_4_1uoluollc8azvwz.R.inc(39790);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testParse_noFormatter() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),39791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o2oqviupb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testParse_noFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39791,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o2oqviupb() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(39791);
        __CLR4_4_1uoluollc8azvwz.R.inc(39792);DateTime start = new DateTime(2010, 6, 30, 12, 30, ISOChronology.getInstance(PARIS));
        __CLR4_4_1uoluollc8azvwz.R.inc(39793);DateTime end = new DateTime(2010, 7, 1, 14, 30, ISOChronology.getInstance(PARIS));
        __CLR4_4_1uoluollc8azvwz.R.inc(39794);assertEquals(new MutableInterval(start, end), MutableInterval.parse("2010-06-30T12:30/2010-07-01T14:30"));
        __CLR4_4_1uoluollc8azvwz.R.inc(39795);assertEquals(new MutableInterval(start, end), MutableInterval.parse("2010-06-30T12:30/P1DT2H"));
        __CLR4_4_1uoluollc8azvwz.R.inc(39796);assertEquals(new MutableInterval(start, end), MutableInterval.parse("P1DT2H/2010-07-01T14:30"));
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),39797);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uefs8huph();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39797,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uefs8huph() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(39797);
        __CLR4_4_1uoluollc8azvwz.R.inc(39798);MutableInterval test = new MutableInterval();
        __CLR4_4_1uoluollc8azvwz.R.inc(39799);assertEquals(0L, test.getStartMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(39800);assertEquals(0L, test.getEndMillis());
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_long_long1() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),39801);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15ifbf4upl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_long_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39801,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15ifbf4upl() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(39801);
        __CLR4_4_1uoluollc8azvwz.R.inc(39802);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1uoluollc8azvwz.R.inc(39803);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1uoluollc8azvwz.R.inc(39804);MutableInterval test = new MutableInterval(dt1.getMillis(), dt2.getMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(39805);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(39806);assertEquals(dt2.getMillis(), test.getEndMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(39807);assertEquals(ISOChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    public void testConstructor_long_long2() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),39808);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_129fcmnups();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_long_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39808,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_129fcmnups() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(39808);
        __CLR4_4_1uoluollc8azvwz.R.inc(39809);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1uoluollc8azvwz.R.inc(39810);MutableInterval test = new MutableInterval(dt1.getMillis(), dt1.getMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(39811);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(39812);assertEquals(dt1.getMillis(), test.getEndMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(39813);assertEquals(ISOChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    public void testConstructor_long_long3() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),39814);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zkm5uupy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_long_long3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39814,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zkm5uupy() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(39814);
        __CLR4_4_1uoluollc8azvwz.R.inc(39815);DateTime dt1 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1uoluollc8azvwz.R.inc(39816);DateTime dt2 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1uoluollc8azvwz.R.inc(39817);try {
            __CLR4_4_1uoluollc8azvwz.R.inc(39818);new MutableInterval(dt1.getMillis(), dt2.getMillis());
            __CLR4_4_1uoluollc8azvwz.R.inc(39819);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_long_long_Chronology1() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),39820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16cacpuq4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_long_long_Chronology1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39820,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16cacpuq4() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(39820);
        __CLR4_4_1uoluollc8azvwz.R.inc(39821);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1uoluollc8azvwz.R.inc(39822);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1uoluollc8azvwz.R.inc(39823);MutableInterval test = new MutableInterval(dt1.getMillis(), dt2.getMillis(), GJChronology.getInstance());
        __CLR4_4_1uoluollc8azvwz.R.inc(39824);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(39825);assertEquals(dt2.getMillis(), test.getEndMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(39826);assertEquals(GJChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    public void testConstructor_long_long_Chronology2() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),39827);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13fc956uqb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_long_long_Chronology2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39827,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13fc956uqb() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(39827);
        __CLR4_4_1uoluollc8azvwz.R.inc(39828);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1uoluollc8azvwz.R.inc(39829);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1uoluollc8azvwz.R.inc(39830);MutableInterval test = new MutableInterval(dt1.getMillis(), dt2.getMillis(), null);
        __CLR4_4_1uoluollc8azvwz.R.inc(39831);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(39832);assertEquals(dt2.getMillis(), test.getEndMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(39833);assertEquals(ISOChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_RI_RI1() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),39834);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n7qodsuqi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39834,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n7qodsuqi() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(39834);
        __CLR4_4_1uoluollc8azvwz.R.inc(39835);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1uoluollc8azvwz.R.inc(39836);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1uoluollc8azvwz.R.inc(39837);MutableInterval test = new MutableInterval(dt1, dt2);
        __CLR4_4_1uoluollc8azvwz.R.inc(39838);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(39839);assertEquals(dt2.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    public void testConstructor_RI_RI2() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),39840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jyqplbuqo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39840,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jyqplbuqo() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(39840);
        __CLR4_4_1uoluollc8azvwz.R.inc(39841);Instant dt1 = new Instant(new DateTime(2004, 6, 9, 0, 0, 0, 0));
        __CLR4_4_1uoluollc8azvwz.R.inc(39842);Instant dt2 = new Instant(new DateTime(2005, 7, 10, 1, 1, 1, 1));
        __CLR4_4_1uoluollc8azvwz.R.inc(39843);MutableInterval test = new MutableInterval(dt1, dt2);
        __CLR4_4_1uoluollc8azvwz.R.inc(39844);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(39845);assertEquals(dt2.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    public void testConstructor_RI_RI3() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),39846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gpqqsuuqu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RI3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39846,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gpqqsuuqu() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(39846);
        __CLR4_4_1uoluollc8azvwz.R.inc(39847);MutableInterval test = new MutableInterval((ReadableInstant) null, (ReadableInstant) null);
        __CLR4_4_1uoluollc8azvwz.R.inc(39848);assertEquals(TEST_TIME_NOW, test.getStartMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(39849);assertEquals(TEST_TIME_NOW, test.getEndMillis());
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    public void testConstructor_RI_RI4() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),39850);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dgqs0duqy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RI4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39850,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dgqs0duqy() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(39850);
        __CLR4_4_1uoluollc8azvwz.R.inc(39851);DateTime dt1 = new DateTime(2000, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1uoluollc8azvwz.R.inc(39852);MutableInterval test = new MutableInterval(dt1, (ReadableInstant) null);
        __CLR4_4_1uoluollc8azvwz.R.inc(39853);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(39854);assertEquals(TEST_TIME_NOW, test.getEndMillis());
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    public void testConstructor_RI_RI5() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),39855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a7qt7wur3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RI5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39855,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a7qt7wur3() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(39855);
        __CLR4_4_1uoluollc8azvwz.R.inc(39856);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1uoluollc8azvwz.R.inc(39857);MutableInterval test = new MutableInterval((ReadableInstant) null, dt2);
        __CLR4_4_1uoluollc8azvwz.R.inc(39858);assertEquals(TEST_TIME_NOW, test.getStartMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(39859);assertEquals(dt2.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    public void testConstructor_RI_RI6() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),39860);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16yquffur8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RI6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39860,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16yquffur8() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(39860);
        __CLR4_4_1uoluollc8azvwz.R.inc(39861);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1uoluollc8azvwz.R.inc(39862);MutableInterval test = new MutableInterval(dt1, dt1);
        __CLR4_4_1uoluollc8azvwz.R.inc(39863);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(39864);assertEquals(dt1.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    public void testConstructor_RI_RI7() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),39865);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13pqvmyurd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RI7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39865,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13pqvmyurd() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(39865);
        __CLR4_4_1uoluollc8azvwz.R.inc(39866);DateTime dt1 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1uoluollc8azvwz.R.inc(39867);DateTime dt2 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1uoluollc8azvwz.R.inc(39868);try {
            __CLR4_4_1uoluollc8azvwz.R.inc(39869);new MutableInterval(dt1, dt2);
            __CLR4_4_1uoluollc8azvwz.R.inc(39870);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    public void testConstructor_RI_RI8() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),39871);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gqwuhurj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RI8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39871,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gqwuhurj() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(39871);
        __CLR4_4_1uoluollc8azvwz.R.inc(39872);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0, GJChronology.getInstance());
        __CLR4_4_1uoluollc8azvwz.R.inc(39873);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1uoluollc8azvwz.R.inc(39874);MutableInterval test = new MutableInterval(dt1, dt2);
        __CLR4_4_1uoluollc8azvwz.R.inc(39875);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(39876);assertEquals(dt2.getMillis(), test.getEndMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(39877);assertEquals(GJChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    public void testConstructor_RI_RI9() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),39878);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12s91y0urq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RI9",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39878,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12s91y0urq() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(39878);
        __CLR4_4_1uoluollc8azvwz.R.inc(39879);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1uoluollc8azvwz.R.inc(39880);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1, GJChronology.getInstance());
        __CLR4_4_1uoluollc8azvwz.R.inc(39881);MutableInterval test = new MutableInterval(dt1, dt2);
        __CLR4_4_1uoluollc8azvwz.R.inc(39882);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(39883);assertEquals(dt2.getMillis(), test.getEndMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(39884);assertEquals(ISOChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_RI_RP1() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),39885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sa2iifurx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RP1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39885,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sa2iifurx() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(39885);
        __CLR4_4_1uoluollc8azvwz.R.inc(39886);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1uoluollc8azvwz.R.inc(39887);Period dur = new Period(0, 6, 0, 0, 1, 0, 0, 0);
        __CLR4_4_1uoluollc8azvwz.R.inc(39888);long result = TEST_TIME_NOW;
        __CLR4_4_1uoluollc8azvwz.R.inc(39889);result = ISOChronology.getInstance().months().add(result, 6);
        __CLR4_4_1uoluollc8azvwz.R.inc(39890);result = ISOChronology.getInstance().hours().add(result, 1);
        
        __CLR4_4_1uoluollc8azvwz.R.inc(39891);MutableInterval test = new MutableInterval(dt, dur);
        __CLR4_4_1uoluollc8azvwz.R.inc(39892);assertEquals(dt.getMillis(), test.getStartMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(39893);assertEquals(result, test.getEndMillis());
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    public void testConstructor_RI_RP2() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),39894);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p12jpyus6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RP2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39894,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p12jpyus6() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(39894);
        __CLR4_4_1uoluollc8azvwz.R.inc(39895);Instant dt = new Instant(new DateTime(TEST_TIME_NOW));
        __CLR4_4_1uoluollc8azvwz.R.inc(39896);Period dur = new Period(0, 6, 0, 3, 1, 0, 0, 0);
        __CLR4_4_1uoluollc8azvwz.R.inc(39897);long result = TEST_TIME_NOW;
        __CLR4_4_1uoluollc8azvwz.R.inc(39898);result = ISOChronology.getInstanceUTC().months().add(result, 6);
        __CLR4_4_1uoluollc8azvwz.R.inc(39899);result = ISOChronology.getInstanceUTC().days().add(result, 3);
        __CLR4_4_1uoluollc8azvwz.R.inc(39900);result = ISOChronology.getInstanceUTC().hours().add(result, 1);
        
        __CLR4_4_1uoluollc8azvwz.R.inc(39901);MutableInterval test = new MutableInterval(dt, dur);
        __CLR4_4_1uoluollc8azvwz.R.inc(39902);assertEquals(dt.getMillis(), test.getStartMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(39903);assertEquals(result, test.getEndMillis());
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    public void testConstructor_RI_RP3() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),39904);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ls2kxhusg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RP3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39904,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ls2kxhusg() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(39904);
        __CLR4_4_1uoluollc8azvwz.R.inc(39905);DateTime dt = new DateTime(TEST_TIME_NOW, ISOChronology.getInstanceUTC());
        __CLR4_4_1uoluollc8azvwz.R.inc(39906);Period dur = new Period(0, 6, 0, 3, 1, 0, 0, 0, PeriodType.standard());
        __CLR4_4_1uoluollc8azvwz.R.inc(39907);long result = TEST_TIME_NOW;
        __CLR4_4_1uoluollc8azvwz.R.inc(39908);result = ISOChronology.getInstanceUTC().months().add(result, 6);
        __CLR4_4_1uoluollc8azvwz.R.inc(39909);result = ISOChronology.getInstanceUTC().days().add(result, 3);
        __CLR4_4_1uoluollc8azvwz.R.inc(39910);result = ISOChronology.getInstanceUTC().hours().add(result, 1);
        
        __CLR4_4_1uoluollc8azvwz.R.inc(39911);MutableInterval test = new MutableInterval(dt, dur);
        __CLR4_4_1uoluollc8azvwz.R.inc(39912);assertEquals(dt.getMillis(), test.getStartMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(39913);assertEquals(result, test.getEndMillis());
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    public void testConstructor_RI_RP4() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),39914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ij2m50usq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RP4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39914,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ij2m50usq() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(39914);
        __CLR4_4_1uoluollc8azvwz.R.inc(39915);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1uoluollc8azvwz.R.inc(39916);Period dur = new Period(1 * DateTimeConstants.MILLIS_PER_HOUR + 23L);
        __CLR4_4_1uoluollc8azvwz.R.inc(39917);long result = TEST_TIME_NOW;
        __CLR4_4_1uoluollc8azvwz.R.inc(39918);result = ISOChronology.getInstance().hours().add(result, 1);
        __CLR4_4_1uoluollc8azvwz.R.inc(39919);result = ISOChronology.getInstance().millis().add(result, 23);
        
        __CLR4_4_1uoluollc8azvwz.R.inc(39920);MutableInterval test = new MutableInterval(dt, dur);
        __CLR4_4_1uoluollc8azvwz.R.inc(39921);assertEquals(dt.getMillis(), test.getStartMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(39922);assertEquals(result, test.getEndMillis());
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    public void testConstructor_RI_RP5() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),39923);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fa2ncjusz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RP5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39923,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fa2ncjusz() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(39923);
        __CLR4_4_1uoluollc8azvwz.R.inc(39924);MutableInterval test = new MutableInterval((ReadableInstant) null, (ReadablePeriod) null);
        __CLR4_4_1uoluollc8azvwz.R.inc(39925);assertEquals(TEST_TIME_NOW, test.getStartMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(39926);assertEquals(TEST_TIME_NOW, test.getEndMillis());
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    public void testConstructor_RI_RP6() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),39927);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c12ok2ut3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RP6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39927,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c12ok2ut3() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(39927);
        __CLR4_4_1uoluollc8azvwz.R.inc(39928);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1uoluollc8azvwz.R.inc(39929);MutableInterval test = new MutableInterval(dt, (ReadablePeriod) null);
        __CLR4_4_1uoluollc8azvwz.R.inc(39930);assertEquals(dt.getMillis(), test.getStartMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(39931);assertEquals(dt.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    public void testConstructor_RI_RP7() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),39932);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18s2prlut8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RP7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39932,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18s2prlut8() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(39932);
        __CLR4_4_1uoluollc8azvwz.R.inc(39933);Period dur = new Period(0, 6, 0, 0, 1, 0, 0, 0);
        __CLR4_4_1uoluollc8azvwz.R.inc(39934);long result = TEST_TIME_NOW;
        __CLR4_4_1uoluollc8azvwz.R.inc(39935);result = ISOChronology.getInstance().monthOfYear().add(result, 6);
        __CLR4_4_1uoluollc8azvwz.R.inc(39936);result = ISOChronology.getInstance().hourOfDay().add(result, 1);
        
        __CLR4_4_1uoluollc8azvwz.R.inc(39937);MutableInterval test = new MutableInterval((ReadableInstant) null, dur);
        __CLR4_4_1uoluollc8azvwz.R.inc(39938);assertEquals(TEST_TIME_NOW, test.getStartMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(39939);assertEquals(result, test.getEndMillis());
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    public void testConstructor_RI_RP8() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),39940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15j2qz4utg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RP8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39940,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15j2qz4utg() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(39940);
        __CLR4_4_1uoluollc8azvwz.R.inc(39941);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1uoluollc8azvwz.R.inc(39942);Period dur = new Period(0, 0, 0, 0, 0, 0, 0, -1);
        __CLR4_4_1uoluollc8azvwz.R.inc(39943);try {
            __CLR4_4_1uoluollc8azvwz.R.inc(39944);new MutableInterval(dt, dur);
            __CLR4_4_1uoluollc8azvwz.R.inc(39945);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_RP_RI1() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),39946);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zb8gc7utm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RP_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39946,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zb8gc7utm() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(39946);
        __CLR4_4_1uoluollc8azvwz.R.inc(39947);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1uoluollc8azvwz.R.inc(39948);Period dur = new Period(0, 6, 0, 0, 1, 0, 0, 0);
        __CLR4_4_1uoluollc8azvwz.R.inc(39949);long result = TEST_TIME_NOW;
        __CLR4_4_1uoluollc8azvwz.R.inc(39950);result = ISOChronology.getInstance().months().add(result, -6);
        __CLR4_4_1uoluollc8azvwz.R.inc(39951);result = ISOChronology.getInstance().hours().add(result, -1);
        
        __CLR4_4_1uoluollc8azvwz.R.inc(39952);MutableInterval test = new MutableInterval(dur, dt);
        __CLR4_4_1uoluollc8azvwz.R.inc(39953);assertEquals(result, test.getStartMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(39954);assertEquals(dt.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    public void testConstructor_RP_RI2() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),39955);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wgvmugutv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RP_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39955,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wgvmugutv() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(39955);
        __CLR4_4_1uoluollc8azvwz.R.inc(39956);Instant dt = new Instant(new DateTime(TEST_TIME_NOW));
        __CLR4_4_1uoluollc8azvwz.R.inc(39957);Period dur = new Period(0, 6, 0, 3, 1, 0, 0, 0);
        __CLR4_4_1uoluollc8azvwz.R.inc(39958);long result = TEST_TIME_NOW;
        __CLR4_4_1uoluollc8azvwz.R.inc(39959);result = ISOChronology.getInstanceUTC().months().add(result, -6);
        __CLR4_4_1uoluollc8azvwz.R.inc(39960);result = ISOChronology.getInstanceUTC().days().add(result, -3);
        __CLR4_4_1uoluollc8azvwz.R.inc(39961);result = ISOChronology.getInstanceUTC().hours().add(result, -1);
        
        __CLR4_4_1uoluollc8azvwz.R.inc(39962);MutableInterval test = new MutableInterval(dur, dt);
        __CLR4_4_1uoluollc8azvwz.R.inc(39963);assertEquals(result, test.getStartMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(39964);assertEquals(dt.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    public void testConstructor_RP_RI3() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),39965);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t7vo1zuu5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RP_RI3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39965,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t7vo1zuu5() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(39965);
        __CLR4_4_1uoluollc8azvwz.R.inc(39966);DateTime dt = new DateTime(TEST_TIME_NOW, ISOChronology.getInstanceUTC());
        __CLR4_4_1uoluollc8azvwz.R.inc(39967);Period dur = new Period(0, 6, 0, 3, 1, 0, 0, 0, PeriodType.standard());
        __CLR4_4_1uoluollc8azvwz.R.inc(39968);long result = TEST_TIME_NOW;
        __CLR4_4_1uoluollc8azvwz.R.inc(39969);result = ISOChronology.getInstanceUTC().months().add(result, -6);
        __CLR4_4_1uoluollc8azvwz.R.inc(39970);result = ISOChronology.getInstanceUTC().days().add(result, -3);
        __CLR4_4_1uoluollc8azvwz.R.inc(39971);result = ISOChronology.getInstanceUTC().hours().add(result, -1);
        
        __CLR4_4_1uoluollc8azvwz.R.inc(39972);MutableInterval test = new MutableInterval(dur, dt);
        __CLR4_4_1uoluollc8azvwz.R.inc(39973);assertEquals(result, test.getStartMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(39974);assertEquals(dt.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    public void testConstructor_RP_RI4() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),39975);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pyvp9iuuf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RP_RI4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39975,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pyvp9iuuf() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(39975);
        __CLR4_4_1uoluollc8azvwz.R.inc(39976);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1uoluollc8azvwz.R.inc(39977);Period dur = new Period(1 * DateTimeConstants.MILLIS_PER_HOUR + 23L);
        __CLR4_4_1uoluollc8azvwz.R.inc(39978);long result = TEST_TIME_NOW;
        __CLR4_4_1uoluollc8azvwz.R.inc(39979);result = ISOChronology.getInstance().hours().add(result, -1);
        __CLR4_4_1uoluollc8azvwz.R.inc(39980);result = ISOChronology.getInstance().millis().add(result, -23);
        
        __CLR4_4_1uoluollc8azvwz.R.inc(39981);MutableInterval test = new MutableInterval(dur, dt);
        __CLR4_4_1uoluollc8azvwz.R.inc(39982);assertEquals(result, test.getStartMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(39983);assertEquals(dt.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    public void testConstructor_RP_RI5() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),39984);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mpvqh1uuo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RP_RI5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39984,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mpvqh1uuo() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(39984);
        __CLR4_4_1uoluollc8azvwz.R.inc(39985);MutableInterval test = new MutableInterval((ReadablePeriod) null, (ReadableInstant) null);
        __CLR4_4_1uoluollc8azvwz.R.inc(39986);assertEquals(TEST_TIME_NOW, test.getStartMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(39987);assertEquals(TEST_TIME_NOW, test.getEndMillis());
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    public void testConstructor_RP_RI6() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),39988);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jgvrokuus();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RP_RI6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39988,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jgvrokuus() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(39988);
        __CLR4_4_1uoluollc8azvwz.R.inc(39989);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1uoluollc8azvwz.R.inc(39990);MutableInterval test = new MutableInterval((ReadablePeriod) null, dt);
        __CLR4_4_1uoluollc8azvwz.R.inc(39991);assertEquals(dt.getMillis(), test.getStartMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(39992);assertEquals(dt.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    public void testConstructor_RP_RI7() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),39993);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g7vsw3uux();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RP_RI7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39993,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g7vsw3uux() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(39993);
        __CLR4_4_1uoluollc8azvwz.R.inc(39994);Period dur = new Period(0, 6, 0, 0, 1, 0, 0, 0);
        __CLR4_4_1uoluollc8azvwz.R.inc(39995);long result = TEST_TIME_NOW;
        __CLR4_4_1uoluollc8azvwz.R.inc(39996);result = ISOChronology.getInstance().monthOfYear().add(result, -6);
        __CLR4_4_1uoluollc8azvwz.R.inc(39997);result = ISOChronology.getInstance().hourOfDay().add(result, -1);
        
        __CLR4_4_1uoluollc8azvwz.R.inc(39998);MutableInterval test = new MutableInterval(dur, (ReadableInstant) null);
        __CLR4_4_1uoluollc8azvwz.R.inc(39999);assertEquals(result, test.getStartMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(40000);assertEquals(TEST_TIME_NOW, test.getEndMillis());
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    public void testConstructor_RP_RI8() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),40001);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cyvu3muv5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RP_RI8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40001,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cyvu3muv5() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(40001);
        __CLR4_4_1uoluollc8azvwz.R.inc(40002);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1uoluollc8azvwz.R.inc(40003);Period dur = new Period(0, 0, 0, 0, 0, 0, 0, -1);
        __CLR4_4_1uoluollc8azvwz.R.inc(40004);try {
            __CLR4_4_1uoluollc8azvwz.R.inc(40005);new MutableInterval(dur, dt);
            __CLR4_4_1uoluollc8azvwz.R.inc(40006);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_RI_RD1() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),40007);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tqt357uvb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RD1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40007,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tqt357uvb() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(40007);
        __CLR4_4_1uoluollc8azvwz.R.inc(40008);long result = TEST_TIME_NOW;
        __CLR4_4_1uoluollc8azvwz.R.inc(40009);result = ISOChronology.getInstance().months().add(result, 6);
        __CLR4_4_1uoluollc8azvwz.R.inc(40010);result = ISOChronology.getInstance().hours().add(result, 1);
        
        __CLR4_4_1uoluollc8azvwz.R.inc(40011);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1uoluollc8azvwz.R.inc(40012);Duration dur = new Duration(result - TEST_TIME_NOW);
        
        __CLR4_4_1uoluollc8azvwz.R.inc(40013);MutableInterval test = new MutableInterval(dt, dur);
        __CLR4_4_1uoluollc8azvwz.R.inc(40014);assertEquals(dt.getMillis(), test.getStartMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(40015);assertEquals(result, test.getEndMillis());
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    public void testConstructor_RI_RD2() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),40016);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qht4cquvk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RD2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40016,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qht4cquvk() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(40016);
        __CLR4_4_1uoluollc8azvwz.R.inc(40017);MutableInterval test = new MutableInterval((ReadableInstant) null, (ReadableDuration) null);
        __CLR4_4_1uoluollc8azvwz.R.inc(40018);assertEquals(TEST_TIME_NOW, test.getStartMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(40019);assertEquals(TEST_TIME_NOW, test.getEndMillis());
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    public void testConstructor_RI_RD3() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),40020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n8t5k9uvo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RD3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40020,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n8t5k9uvo() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(40020);
        __CLR4_4_1uoluollc8azvwz.R.inc(40021);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1uoluollc8azvwz.R.inc(40022);MutableInterval test = new MutableInterval(dt, (ReadableDuration) null);
        __CLR4_4_1uoluollc8azvwz.R.inc(40023);assertEquals(dt.getMillis(), test.getStartMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(40024);assertEquals(dt.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    public void testConstructor_RI_RD4() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),40025);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jzt6rsuvt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RD4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40025,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jzt6rsuvt() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(40025);
        __CLR4_4_1uoluollc8azvwz.R.inc(40026);long result = TEST_TIME_NOW;
        __CLR4_4_1uoluollc8azvwz.R.inc(40027);result = ISOChronology.getInstance().monthOfYear().add(result, 6);
        __CLR4_4_1uoluollc8azvwz.R.inc(40028);result = ISOChronology.getInstance().hourOfDay().add(result, 1);
        
        __CLR4_4_1uoluollc8azvwz.R.inc(40029);Duration dur = new Duration(result - TEST_TIME_NOW);
        
        __CLR4_4_1uoluollc8azvwz.R.inc(40030);MutableInterval test = new MutableInterval((ReadableInstant) null, dur);
        __CLR4_4_1uoluollc8azvwz.R.inc(40031);assertEquals(TEST_TIME_NOW, test.getStartMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(40032);assertEquals(result, test.getEndMillis());
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    public void testConstructor_RI_RD5() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),40033);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gqt7zbuw1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RD5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40033,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gqt7zbuw1() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(40033);
        __CLR4_4_1uoluollc8azvwz.R.inc(40034);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1uoluollc8azvwz.R.inc(40035);Duration dur = new Duration(-1);
        __CLR4_4_1uoluollc8azvwz.R.inc(40036);try {
            __CLR4_4_1uoluollc8azvwz.R.inc(40037);new MutableInterval(dt, dur);
            __CLR4_4_1uoluollc8azvwz.R.inc(40038);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_RD_RI1() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),40039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_160dzxnuw7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RD_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40039,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_160dzxnuw7() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(40039);
        __CLR4_4_1uoluollc8azvwz.R.inc(40040);long result = TEST_TIME_NOW;
        __CLR4_4_1uoluollc8azvwz.R.inc(40041);result = ISOChronology.getInstance().months().add(result, -6);
        __CLR4_4_1uoluollc8azvwz.R.inc(40042);result = ISOChronology.getInstance().hours().add(result, -1);
        
        __CLR4_4_1uoluollc8azvwz.R.inc(40043);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1uoluollc8azvwz.R.inc(40044);Duration dur = new Duration(TEST_TIME_NOW - result);
        
        __CLR4_4_1uoluollc8azvwz.R.inc(40045);MutableInterval test = new MutableInterval(dur, dt);
        __CLR4_4_1uoluollc8azvwz.R.inc(40046);assertEquals(result, test.getStartMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(40047);assertEquals(dt.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    public void testConstructor_RD_RI2() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),40048);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_199dyq4uwg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RD_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40048,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_199dyq4uwg() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(40048);
        __CLR4_4_1uoluollc8azvwz.R.inc(40049);MutableInterval test = new MutableInterval((ReadableDuration) null, (ReadableInstant) null);
        __CLR4_4_1uoluollc8azvwz.R.inc(40050);assertEquals(TEST_TIME_NOW, test.getStartMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(40051);assertEquals(TEST_TIME_NOW, test.getEndMillis());
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    public void testConstructor_RD_RI3() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),40052);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cidxiluwk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RD_RI3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40052,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cidxiluwk() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(40052);
        __CLR4_4_1uoluollc8azvwz.R.inc(40053);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1uoluollc8azvwz.R.inc(40054);MutableInterval test = new MutableInterval((ReadableDuration) null, dt);
        __CLR4_4_1uoluollc8azvwz.R.inc(40055);assertEquals(dt.getMillis(), test.getStartMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(40056);assertEquals(dt.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    public void testConstructor_RD_RI4() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),40057);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1frdwb2uwp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RD_RI4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40057,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1frdwb2uwp() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(40057);
        __CLR4_4_1uoluollc8azvwz.R.inc(40058);long result = TEST_TIME_NOW;
        __CLR4_4_1uoluollc8azvwz.R.inc(40059);result = ISOChronology.getInstance().monthOfYear().add(result, -6);
        __CLR4_4_1uoluollc8azvwz.R.inc(40060);result = ISOChronology.getInstance().hourOfDay().add(result, -1);
        
        __CLR4_4_1uoluollc8azvwz.R.inc(40061);Duration dur = new Duration(TEST_TIME_NOW - result);
        
        __CLR4_4_1uoluollc8azvwz.R.inc(40062);MutableInterval test = new MutableInterval(dur, (ReadableInstant) null);
        __CLR4_4_1uoluollc8azvwz.R.inc(40063);assertEquals(result, test.getStartMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(40064);assertEquals(TEST_TIME_NOW, test.getEndMillis());
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    public void testConstructor_RD_RI5() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),40065);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j0dv3juwx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RD_RI5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40065,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j0dv3juwx() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(40065);
        __CLR4_4_1uoluollc8azvwz.R.inc(40066);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1uoluollc8azvwz.R.inc(40067);Duration dur = new Duration(-1);
        __CLR4_4_1uoluollc8azvwz.R.inc(40068);try {
            __CLR4_4_1uoluollc8azvwz.R.inc(40069);new MutableInterval(dur, dt);
            __CLR4_4_1uoluollc8azvwz.R.inc(40070);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_Object1() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),40071);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19oqxcyux3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_Object1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40071,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19oqxcyux3() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(40071);
        __CLR4_4_1uoluollc8azvwz.R.inc(40072);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1uoluollc8azvwz.R.inc(40073);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1uoluollc8azvwz.R.inc(40074);MutableInterval test = new MutableInterval(dt1.toString() + '/' + dt2.toString());
        __CLR4_4_1uoluollc8azvwz.R.inc(40075);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(40076);assertEquals(dt2.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    public void testConstructor_Object2() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),40077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cxqw5fux9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_Object2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40077,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cxqw5fux9() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(40077);
        __CLR4_4_1uoluollc8azvwz.R.inc(40078);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1uoluollc8azvwz.R.inc(40079);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1uoluollc8azvwz.R.inc(40080);MutableInterval base = new MutableInterval(dt1, dt2);
        
        __CLR4_4_1uoluollc8azvwz.R.inc(40081);MutableInterval test = new MutableInterval(base);
        __CLR4_4_1uoluollc8azvwz.R.inc(40082);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(40083);assertEquals(dt2.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    public void testConstructor_Object3() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),40084);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g6quxwuxg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_Object3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40084,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g6quxwuxg() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(40084);
        __CLR4_4_1uoluollc8azvwz.R.inc(40085);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1uoluollc8azvwz.R.inc(40086);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1uoluollc8azvwz.R.inc(40087);Interval base = new Interval(dt1, dt2);
        
        __CLR4_4_1uoluollc8azvwz.R.inc(40088);MutableInterval test = new MutableInterval(base);
        __CLR4_4_1uoluollc8azvwz.R.inc(40089);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(40090);assertEquals(dt2.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    public void testConstructor_Object4() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),40091);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jfqtqduxn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_Object4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40091,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jfqtqduxn() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(40091);
        __CLR4_4_1uoluollc8azvwz.R.inc(40092);MockInterval base = new MockInterval();
        __CLR4_4_1uoluollc8azvwz.R.inc(40093);MutableInterval test = new MutableInterval(base);
        __CLR4_4_1uoluollc8azvwz.R.inc(40094);assertEquals(base.getStartMillis(), test.getStartMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(40095);assertEquals(base.getEndMillis(), test.getEndMillis());
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    public void testConstructor_Object5() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),40096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1moqsiuuxs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_Object5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40096,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1moqsiuuxs() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(40096);
        __CLR4_4_1uoluollc8azvwz.R.inc(40097);IntervalConverter oldConv = ConverterManager.getInstance().getIntervalConverter("");
        __CLR4_4_1uoluollc8azvwz.R.inc(40098);IntervalConverter conv = new IntervalConverter() {
            public boolean isReadableInterval(Object object, Chronology chrono) {try{__CLR4_4_1uoluollc8azvwz.R.inc(40099);
                __CLR4_4_1uoluollc8azvwz.R.inc(40100);return false;
            }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}
            public void setInto(ReadWritableInterval interval, Object object, Chronology chrono) {try{__CLR4_4_1uoluollc8azvwz.R.inc(40101);
                __CLR4_4_1uoluollc8azvwz.R.inc(40102);interval.setChronology(chrono);
                __CLR4_4_1uoluollc8azvwz.R.inc(40103);interval.setInterval(1234L, 5678L);
            }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}
            public Class<?> getSupportedType() {try{__CLR4_4_1uoluollc8azvwz.R.inc(40104);
                __CLR4_4_1uoluollc8azvwz.R.inc(40105);return String.class;
            }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}
        };
        __CLR4_4_1uoluollc8azvwz.R.inc(40106);try {
            __CLR4_4_1uoluollc8azvwz.R.inc(40107);ConverterManager.getInstance().addIntervalConverter(conv);
            __CLR4_4_1uoluollc8azvwz.R.inc(40108);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
            __CLR4_4_1uoluollc8azvwz.R.inc(40109);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
            __CLR4_4_1uoluollc8azvwz.R.inc(40110);MutableInterval test = new MutableInterval(dt1.toString() + '/' + dt2.toString());
            __CLR4_4_1uoluollc8azvwz.R.inc(40111);assertEquals(1234L, test.getStartMillis());
            __CLR4_4_1uoluollc8azvwz.R.inc(40112);assertEquals(5678L, test.getEndMillis());
        } finally {
            __CLR4_4_1uoluollc8azvwz.R.inc(40113);ConverterManager.getInstance().addIntervalConverter(oldConv);
        }
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    public void testConstructor_Object6() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),40114);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pxqrbbuya();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_Object6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40114,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pxqrbbuya() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(40114);
        __CLR4_4_1uoluollc8azvwz.R.inc(40115);IntervalConverter oldConv = ConverterManager.getInstance().getIntervalConverter(new MutableInterval(0L, 0L));
        __CLR4_4_1uoluollc8azvwz.R.inc(40116);IntervalConverter conv = new IntervalConverter() {
            public boolean isReadableInterval(Object object, Chronology chrono) {try{__CLR4_4_1uoluollc8azvwz.R.inc(40117);
                __CLR4_4_1uoluollc8azvwz.R.inc(40118);return false;
            }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}
            public void setInto(ReadWritableInterval interval, Object object, Chronology chrono) {try{__CLR4_4_1uoluollc8azvwz.R.inc(40119);
                __CLR4_4_1uoluollc8azvwz.R.inc(40120);interval.setChronology(chrono);
                __CLR4_4_1uoluollc8azvwz.R.inc(40121);interval.setInterval(1234L, 5678L);
            }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}
            public Class<?> getSupportedType() {try{__CLR4_4_1uoluollc8azvwz.R.inc(40122);
                __CLR4_4_1uoluollc8azvwz.R.inc(40123);return ReadableInterval.class;
            }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}
        };
        __CLR4_4_1uoluollc8azvwz.R.inc(40124);try {
            __CLR4_4_1uoluollc8azvwz.R.inc(40125);ConverterManager.getInstance().addIntervalConverter(conv);
            __CLR4_4_1uoluollc8azvwz.R.inc(40126);Interval base = new Interval(-1000L, 1000L);
            __CLR4_4_1uoluollc8azvwz.R.inc(40127);MutableInterval test = new MutableInterval(base);
            __CLR4_4_1uoluollc8azvwz.R.inc(40128);assertEquals(1234L, test.getStartMillis());
            __CLR4_4_1uoluollc8azvwz.R.inc(40129);assertEquals(5678L, test.getEndMillis());
        } finally {
            __CLR4_4_1uoluollc8azvwz.R.inc(40130);ConverterManager.getInstance().addIntervalConverter(oldConv);
        }
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    class MockInterval implements ReadableInterval {
        public Chronology getChronology() {try{__CLR4_4_1uoluollc8azvwz.R.inc(40131);
            __CLR4_4_1uoluollc8azvwz.R.inc(40132);return ISOChronology.getInstance();
        }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}
        public long getStartMillis() {try{__CLR4_4_1uoluollc8azvwz.R.inc(40133);
            __CLR4_4_1uoluollc8azvwz.R.inc(40134);return 1234L;
        }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}
        public DateTime getStart() {try{__CLR4_4_1uoluollc8azvwz.R.inc(40135);
            __CLR4_4_1uoluollc8azvwz.R.inc(40136);return new DateTime(1234L);
        }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}
        public long getEndMillis() {try{__CLR4_4_1uoluollc8azvwz.R.inc(40137);
            __CLR4_4_1uoluollc8azvwz.R.inc(40138);return 5678L;
        }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}
        public DateTime getEnd() {try{__CLR4_4_1uoluollc8azvwz.R.inc(40139);
            __CLR4_4_1uoluollc8azvwz.R.inc(40140);return new DateTime(5678L);
        }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}
        public long toDurationMillis() {try{__CLR4_4_1uoluollc8azvwz.R.inc(40141);
            __CLR4_4_1uoluollc8azvwz.R.inc(40142);return (5678L - 1234L);
        }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}
        public Duration toDuration() {try{__CLR4_4_1uoluollc8azvwz.R.inc(40143);
            __CLR4_4_1uoluollc8azvwz.R.inc(40144);return new Duration(5678L - 1234L);
        }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}
        public boolean contains(long millisInstant) {try{__CLR4_4_1uoluollc8azvwz.R.inc(40145);
            __CLR4_4_1uoluollc8azvwz.R.inc(40146);return false;
        }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}
        public boolean containsNow() {try{__CLR4_4_1uoluollc8azvwz.R.inc(40147);
            __CLR4_4_1uoluollc8azvwz.R.inc(40148);return false;
        }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}
        public boolean contains(ReadableInstant instant) {try{__CLR4_4_1uoluollc8azvwz.R.inc(40149);
            __CLR4_4_1uoluollc8azvwz.R.inc(40150);return false;
        }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}
        public boolean contains(ReadableInterval interval) {try{__CLR4_4_1uoluollc8azvwz.R.inc(40151);
            __CLR4_4_1uoluollc8azvwz.R.inc(40152);return false;
        }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}
        public boolean overlaps(ReadableInterval interval) {try{__CLR4_4_1uoluollc8azvwz.R.inc(40153);
            __CLR4_4_1uoluollc8azvwz.R.inc(40154);return false;
        }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}
        public boolean isBefore(ReadableInstant instant) {try{__CLR4_4_1uoluollc8azvwz.R.inc(40155);
            __CLR4_4_1uoluollc8azvwz.R.inc(40156);return false;
        }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}
        public boolean isBefore(ReadableInterval interval) {try{__CLR4_4_1uoluollc8azvwz.R.inc(40157);
            __CLR4_4_1uoluollc8azvwz.R.inc(40158);return false;
        }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}
        public boolean isAfter(ReadableInstant instant) {try{__CLR4_4_1uoluollc8azvwz.R.inc(40159);
            __CLR4_4_1uoluollc8azvwz.R.inc(40160);return false;
        }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}
        public boolean isAfter(ReadableInterval interval) {try{__CLR4_4_1uoluollc8azvwz.R.inc(40161);
            __CLR4_4_1uoluollc8azvwz.R.inc(40162);return false;
        }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}
        public Interval toInterval() {try{__CLR4_4_1uoluollc8azvwz.R.inc(40163);
            __CLR4_4_1uoluollc8azvwz.R.inc(40164);return null;
        }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}
        public MutableInterval toMutableInterval() {try{__CLR4_4_1uoluollc8azvwz.R.inc(40165);
            __CLR4_4_1uoluollc8azvwz.R.inc(40166);return null;
        }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}
        public Period toPeriod() {try{__CLR4_4_1uoluollc8azvwz.R.inc(40167);
            __CLR4_4_1uoluollc8azvwz.R.inc(40168);return null;
        }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}
        public Period toPeriod(PeriodType type) {try{__CLR4_4_1uoluollc8azvwz.R.inc(40169);
            __CLR4_4_1uoluollc8azvwz.R.inc(40170);return null;
        }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    public void testConstructor_Object_Chronology1() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),40171);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pmfignuzv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_Object_Chronology1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40171,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pmfignuzv() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(40171);
        __CLR4_4_1uoluollc8azvwz.R.inc(40172);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1uoluollc8azvwz.R.inc(40173);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1uoluollc8azvwz.R.inc(40174);Interval base = new Interval(dt1, dt2);
        
        __CLR4_4_1uoluollc8azvwz.R.inc(40175);MutableInterval test = new MutableInterval(base, BuddhistChronology.getInstance());
        __CLR4_4_1uoluollc8azvwz.R.inc(40176);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(40177);assertEquals(dt2.getMillis(), test.getEndMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(40178);assertEquals(BuddhistChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

    public void testConstructor_Object_Chronology2() throws Throwable {__CLR4_4_1uoluollc8azvwz.R.globalSliceStart(getClass().getName(),40179);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1svfh94v03();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uoluollc8azvwz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uoluollc8azvwz.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_Object_Chronology2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40179,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1svfh94v03() throws Throwable{try{__CLR4_4_1uoluollc8azvwz.R.inc(40179);
        __CLR4_4_1uoluollc8azvwz.R.inc(40180);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1uoluollc8azvwz.R.inc(40181);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1uoluollc8azvwz.R.inc(40182);Interval base = new Interval(dt1, dt2);
        
        __CLR4_4_1uoluollc8azvwz.R.inc(40183);MutableInterval test = new MutableInterval(base, null);
        __CLR4_4_1uoluollc8azvwz.R.inc(40184);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(40185);assertEquals(dt2.getMillis(), test.getEndMillis());
        __CLR4_4_1uoluollc8azvwz.R.inc(40186);assertEquals(ISOChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1uoluollc8azvwz.R.flushNeeded();}}

}
