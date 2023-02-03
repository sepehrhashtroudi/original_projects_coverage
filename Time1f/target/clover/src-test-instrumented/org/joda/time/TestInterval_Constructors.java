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
package org.joda.time;

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.IntervalConverter;

/**
 * This class is a JUnit test for Interval.
 *
 * @author Stephen Colebourne
 */
public class TestInterval_Constructors extends TestCase {static class __CLR4_4_1nronrolc8azv0h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,31246,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
            
//    // 2002-04-05
//    private long TEST_TIME1 =
//            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
//            + 12L * DateTimeConstants.MILLIS_PER_HOUR
//            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
//        
//    // 2003-05-06
//    private long TEST_TIME2 =
//            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
//            + 14L * DateTimeConstants.MILLIS_PER_HOUR
//            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
    
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1nronrolc8azv0h.R.inc(30804);
        __CLR4_4_1nronrolc8azv0h.R.inc(30805);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1nronrolc8azv0h.R.inc(30806);
        __CLR4_4_1nronrolc8azv0h.R.inc(30807);return new TestSuite(TestInterval_Constructors.class);
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    public TestInterval_Constructors(String name) {
        super(name);__CLR4_4_1nronrolc8azv0h.R.inc(30809);try{__CLR4_4_1nronrolc8azv0h.R.inc(30808);
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1nronrolc8azv0h.R.inc(30810);
        __CLR4_4_1nronrolc8azv0h.R.inc(30811);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1nronrolc8azv0h.R.inc(30812);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1nronrolc8azv0h.R.inc(30813);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1nronrolc8azv0h.R.inc(30814);originalLocale = Locale.getDefault();
        __CLR4_4_1nronrolc8azv0h.R.inc(30815);DateTimeZone.setDefault(PARIS);
        __CLR4_4_1nronrolc8azv0h.R.inc(30816);TimeZone.setDefault(PARIS.toTimeZone());
        __CLR4_4_1nronrolc8azv0h.R.inc(30817);Locale.setDefault(Locale.FRANCE);
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1nronrolc8azv0h.R.inc(30818);
        __CLR4_4_1nronrolc8azv0h.R.inc(30819);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1nronrolc8azv0h.R.inc(30820);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1nronrolc8azv0h.R.inc(30821);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1nronrolc8azv0h.R.inc(30822);Locale.setDefault(originalLocale);
        __CLR4_4_1nronrolc8azv0h.R.inc(30823);originalDateTimeZone = null;
        __CLR4_4_1nronrolc8azv0h.R.inc(30824);originalTimeZone = null;
        __CLR4_4_1nronrolc8azv0h.R.inc(30825);originalLocale = null;
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testParse_noFormatter() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),30826);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o2oqvinsa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testParse_noFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30826,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o2oqvinsa() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(30826);
        __CLR4_4_1nronrolc8azv0h.R.inc(30827);DateTime start = new DateTime(2010, 6, 30, 12, 30, ISOChronology.getInstance(PARIS));
        __CLR4_4_1nronrolc8azv0h.R.inc(30828);DateTime end = new DateTime(2010, 7, 1, 14, 30, ISOChronology.getInstance(PARIS));
        __CLR4_4_1nronrolc8azv0h.R.inc(30829);assertEquals(new Interval(start, end), Interval.parse("2010-06-30T12:30/2010-07-01T14:30"));
        __CLR4_4_1nronrolc8azv0h.R.inc(30830);assertEquals(new Interval(start, end), Interval.parse("2010-06-30T12:30/P1DT2H"));
        __CLR4_4_1nronrolc8azv0h.R.inc(30831);assertEquals(new Interval(start, end), Interval.parse("P1DT2H/2010-07-01T14:30"));
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_long_long1() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),30832);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15ifbf4nsg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_long_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30832,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15ifbf4nsg() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(30832);
        __CLR4_4_1nronrolc8azv0h.R.inc(30833);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1nronrolc8azv0h.R.inc(30834);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1nronrolc8azv0h.R.inc(30835);Interval test = new Interval(dt1.getMillis(), dt2.getMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(30836);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(30837);assertEquals(dt2.getMillis(), test.getEndMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(30838);assertEquals(ISOChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    public void testConstructor_long_long2() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),30839);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_129fcmnnsn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_long_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30839,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_129fcmnnsn() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(30839);
        __CLR4_4_1nronrolc8azv0h.R.inc(30840);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1nronrolc8azv0h.R.inc(30841);Interval test = new Interval(dt1.getMillis(), dt1.getMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(30842);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(30843);assertEquals(dt1.getMillis(), test.getEndMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(30844);assertEquals(ISOChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    public void testConstructor_long_long3() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),30845);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zkm5unst();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_long_long3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30845,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zkm5unst() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(30845);
        __CLR4_4_1nronrolc8azv0h.R.inc(30846);DateTime dt1 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1nronrolc8azv0h.R.inc(30847);DateTime dt2 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1nronrolc8azv0h.R.inc(30848);try {
            __CLR4_4_1nronrolc8azv0h.R.inc(30849);new Interval(dt1.getMillis(), dt2.getMillis());
            __CLR4_4_1nronrolc8azv0h.R.inc(30850);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_long_long_Zone() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),30851);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lms506nsz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_long_long_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30851,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lms506nsz() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(30851);
        __CLR4_4_1nronrolc8azv0h.R.inc(30852);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1nronrolc8azv0h.R.inc(30853);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1nronrolc8azv0h.R.inc(30854);Interval test = new Interval(dt1.getMillis(), dt2.getMillis(), LONDON);
        __CLR4_4_1nronrolc8azv0h.R.inc(30855);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(30856);assertEquals(dt2.getMillis(), test.getEndMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(30857);assertEquals(ISOChronology.getInstance(LONDON), test.getChronology());
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    public void testConstructor_long_long_nullZone() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),30858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17bv70xnt6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_long_long_nullZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30858,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17bv70xnt6() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(30858);
        __CLR4_4_1nronrolc8azv0h.R.inc(30859);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1nronrolc8azv0h.R.inc(30860);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1nronrolc8azv0h.R.inc(30861);Interval test = new Interval(dt1.getMillis(), dt2.getMillis(), (DateTimeZone) null);
        __CLR4_4_1nronrolc8azv0h.R.inc(30862);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(30863);assertEquals(dt2.getMillis(), test.getEndMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(30864);assertEquals(ISOChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_long_long_Chronology() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),30865);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1simh3qntd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_long_long_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30865,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1simh3qntd() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(30865);
        __CLR4_4_1nronrolc8azv0h.R.inc(30866);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1nronrolc8azv0h.R.inc(30867);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1nronrolc8azv0h.R.inc(30868);Interval test = new Interval(dt1.getMillis(), dt2.getMillis(), GJChronology.getInstance());
        __CLR4_4_1nronrolc8azv0h.R.inc(30869);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(30870);assertEquals(dt2.getMillis(), test.getEndMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(30871);assertEquals(GJChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    public void testConstructor_long_long_nullChronology() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),30872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1delt37ntk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_long_long_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30872,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1delt37ntk() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(30872);
        __CLR4_4_1nronrolc8azv0h.R.inc(30873);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1nronrolc8azv0h.R.inc(30874);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1nronrolc8azv0h.R.inc(30875);Interval test = new Interval(dt1.getMillis(), dt2.getMillis(), (Chronology) null);
        __CLR4_4_1nronrolc8azv0h.R.inc(30876);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(30877);assertEquals(dt2.getMillis(), test.getEndMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(30878);assertEquals(ISOChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_RI_RI1() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),30879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n7qodsntr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30879,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n7qodsntr() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(30879);
        __CLR4_4_1nronrolc8azv0h.R.inc(30880);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1nronrolc8azv0h.R.inc(30881);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1nronrolc8azv0h.R.inc(30882);Interval test = new Interval(dt1, dt2);
        __CLR4_4_1nronrolc8azv0h.R.inc(30883);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(30884);assertEquals(dt2.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    public void testConstructor_RI_RI2() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),30885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jyqplbntx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30885,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jyqplbntx() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(30885);
        __CLR4_4_1nronrolc8azv0h.R.inc(30886);Instant dt1 = new Instant(new DateTime(2004, 6, 9, 0, 0, 0, 0));
        __CLR4_4_1nronrolc8azv0h.R.inc(30887);Instant dt2 = new Instant(new DateTime(2005, 7, 10, 1, 1, 1, 1));
        __CLR4_4_1nronrolc8azv0h.R.inc(30888);Interval test = new Interval(dt1, dt2);
        __CLR4_4_1nronrolc8azv0h.R.inc(30889);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(30890);assertEquals(dt2.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    public void testConstructor_RI_RI3() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),30891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gpqqsunu3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RI3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30891,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gpqqsunu3() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(30891);
        __CLR4_4_1nronrolc8azv0h.R.inc(30892);Interval test = new Interval((ReadableInstant) null, (ReadableInstant) null);
        __CLR4_4_1nronrolc8azv0h.R.inc(30893);assertEquals(TEST_TIME_NOW, test.getStartMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(30894);assertEquals(TEST_TIME_NOW, test.getEndMillis());
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    public void testConstructor_RI_RI4() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),30895);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dgqs0dnu7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RI4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30895,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dgqs0dnu7() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(30895);
        __CLR4_4_1nronrolc8azv0h.R.inc(30896);DateTime dt1 = new DateTime(2000, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1nronrolc8azv0h.R.inc(30897);Interval test = new Interval(dt1, (ReadableInstant) null);
        __CLR4_4_1nronrolc8azv0h.R.inc(30898);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(30899);assertEquals(TEST_TIME_NOW, test.getEndMillis());
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    public void testConstructor_RI_RI5() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),30900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a7qt7wnuc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RI5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30900,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a7qt7wnuc() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(30900);
        __CLR4_4_1nronrolc8azv0h.R.inc(30901);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1nronrolc8azv0h.R.inc(30902);Interval test = new Interval((ReadableInstant) null, dt2);
        __CLR4_4_1nronrolc8azv0h.R.inc(30903);assertEquals(TEST_TIME_NOW, test.getStartMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(30904);assertEquals(dt2.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    public void testConstructor_RI_RI6() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),30905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16yquffnuh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RI6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30905,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16yquffnuh() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(30905);
        __CLR4_4_1nronrolc8azv0h.R.inc(30906);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1nronrolc8azv0h.R.inc(30907);Interval test = new Interval(dt1, dt1);
        __CLR4_4_1nronrolc8azv0h.R.inc(30908);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(30909);assertEquals(dt1.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    public void testConstructor_RI_RI7() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),30910);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13pqvmynum();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RI7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30910,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13pqvmynum() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(30910);
        __CLR4_4_1nronrolc8azv0h.R.inc(30911);DateTime dt1 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1nronrolc8azv0h.R.inc(30912);DateTime dt2 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1nronrolc8azv0h.R.inc(30913);try {
            __CLR4_4_1nronrolc8azv0h.R.inc(30914);new Interval(dt1, dt2);
            __CLR4_4_1nronrolc8azv0h.R.inc(30915);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    public void testConstructor_RI_RI_chronoStart() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),30916);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19vt4flnus();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RI_chronoStart",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30916,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19vt4flnus() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(30916);
        __CLR4_4_1nronrolc8azv0h.R.inc(30917);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0, GJChronology.getInstance());
        __CLR4_4_1nronrolc8azv0h.R.inc(30918);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1nronrolc8azv0h.R.inc(30919);Interval test = new Interval(dt1, dt2);
        __CLR4_4_1nronrolc8azv0h.R.inc(30920);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(30921);assertEquals(dt2.getMillis(), test.getEndMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(30922);assertEquals(GJChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    public void testConstructor_RI_RI_chronoEnd() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),30923);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xdrdpknuz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RI_chronoEnd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30923,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xdrdpknuz() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(30923);
        __CLR4_4_1nronrolc8azv0h.R.inc(30924);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1nronrolc8azv0h.R.inc(30925);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1, GJChronology.getInstance());
        __CLR4_4_1nronrolc8azv0h.R.inc(30926);Interval test = new Interval(dt1, dt2);
        __CLR4_4_1nronrolc8azv0h.R.inc(30927);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(30928);assertEquals(dt2.getMillis(), test.getEndMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(30929);assertEquals(ISOChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    public void testConstructor_RI_RI_zones() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),30930);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fcap5jnv6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RI_zones",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30930,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fcap5jnv6() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(30930);
        __CLR4_4_1nronrolc8azv0h.R.inc(30931);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0, LONDON);
        __CLR4_4_1nronrolc8azv0h.R.inc(30932);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1, PARIS);
        __CLR4_4_1nronrolc8azv0h.R.inc(30933);Interval test = new Interval(dt1, dt2);
        __CLR4_4_1nronrolc8azv0h.R.inc(30934);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(30935);assertEquals(dt2.getMillis(), test.getEndMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(30936);assertEquals(ISOChronology.getInstance(LONDON), test.getChronology());
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    public void testConstructor_RI_RI_instant() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),30937);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1volvchnvd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RI_instant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30937,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1volvchnvd() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(30937);
        __CLR4_4_1nronrolc8azv0h.R.inc(30938);Instant dt1 = new Instant(12345678L);
        __CLR4_4_1nronrolc8azv0h.R.inc(30939);Instant dt2 = new Instant(22345678L);
        __CLR4_4_1nronrolc8azv0h.R.inc(30940);Interval test = new Interval(dt1, dt2);
        __CLR4_4_1nronrolc8azv0h.R.inc(30941);assertEquals(12345678L, test.getStartMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(30942);assertEquals(22345678L, test.getEndMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(30943);assertEquals(ISOChronology.getInstanceUTC(), test.getChronology());
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_RI_RP1() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),30944);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sa2iifnvk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RP1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30944,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sa2iifnvk() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(30944);
        __CLR4_4_1nronrolc8azv0h.R.inc(30945);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1nronrolc8azv0h.R.inc(30946);Period dur = new Period(0, 6, 0, 0, 1, 0, 0, 0);
        __CLR4_4_1nronrolc8azv0h.R.inc(30947);long result = TEST_TIME_NOW;
        __CLR4_4_1nronrolc8azv0h.R.inc(30948);result = ISOChronology.getInstance().months().add(result, 6);
        __CLR4_4_1nronrolc8azv0h.R.inc(30949);result = ISOChronology.getInstance().hours().add(result, 1);
        
        __CLR4_4_1nronrolc8azv0h.R.inc(30950);Interval test = new Interval(dt, dur);
        __CLR4_4_1nronrolc8azv0h.R.inc(30951);assertEquals(dt.getMillis(), test.getStartMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(30952);assertEquals(result, test.getEndMillis());
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    public void testConstructor_RI_RP2() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),30953);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p12jpynvt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RP2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30953,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p12jpynvt() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(30953);
        __CLR4_4_1nronrolc8azv0h.R.inc(30954);Instant dt = new Instant(new DateTime(TEST_TIME_NOW));
        __CLR4_4_1nronrolc8azv0h.R.inc(30955);Period dur = new Period(0, 6, 0, 3, 1, 0, 0, 0);
        __CLR4_4_1nronrolc8azv0h.R.inc(30956);long result = TEST_TIME_NOW;
        __CLR4_4_1nronrolc8azv0h.R.inc(30957);result = ISOChronology.getInstanceUTC().months().add(result, 6);
        __CLR4_4_1nronrolc8azv0h.R.inc(30958);result = ISOChronology.getInstanceUTC().days().add(result, 3);
        __CLR4_4_1nronrolc8azv0h.R.inc(30959);result = ISOChronology.getInstanceUTC().hours().add(result, 1);
        
        __CLR4_4_1nronrolc8azv0h.R.inc(30960);Interval test = new Interval(dt, dur);
        __CLR4_4_1nronrolc8azv0h.R.inc(30961);assertEquals(dt.getMillis(), test.getStartMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(30962);assertEquals(result, test.getEndMillis());
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    public void testConstructor_RI_RP3() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),30963);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ls2kxhnw3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RP3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30963,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ls2kxhnw3() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(30963);
        __CLR4_4_1nronrolc8azv0h.R.inc(30964);DateTime dt = new DateTime(TEST_TIME_NOW, CopticChronology.getInstanceUTC());
        __CLR4_4_1nronrolc8azv0h.R.inc(30965);Period dur = new Period(0, 6, 0, 3, 1, 0, 0, 0, PeriodType.standard());
        __CLR4_4_1nronrolc8azv0h.R.inc(30966);long result = TEST_TIME_NOW;
        __CLR4_4_1nronrolc8azv0h.R.inc(30967);result = CopticChronology.getInstanceUTC().months().add(result, 6);
        __CLR4_4_1nronrolc8azv0h.R.inc(30968);result = CopticChronology.getInstanceUTC().days().add(result, 3);
        __CLR4_4_1nronrolc8azv0h.R.inc(30969);result = CopticChronology.getInstanceUTC().hours().add(result, 1);
        
        __CLR4_4_1nronrolc8azv0h.R.inc(30970);Interval test = new Interval(dt, dur);
        __CLR4_4_1nronrolc8azv0h.R.inc(30971);assertEquals(dt.getMillis(), test.getStartMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(30972);assertEquals(result, test.getEndMillis());
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    public void testConstructor_RI_RP4() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),30973);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ij2m50nwd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RP4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30973,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ij2m50nwd() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(30973);
        __CLR4_4_1nronrolc8azv0h.R.inc(30974);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1nronrolc8azv0h.R.inc(30975);Period dur = new Period(1 * DateTimeConstants.MILLIS_PER_HOUR + 23L);
        __CLR4_4_1nronrolc8azv0h.R.inc(30976);long result = TEST_TIME_NOW;
        __CLR4_4_1nronrolc8azv0h.R.inc(30977);result = ISOChronology.getInstance().hours().add(result, 1);
        __CLR4_4_1nronrolc8azv0h.R.inc(30978);result = ISOChronology.getInstance().millis().add(result, 23);
        
        __CLR4_4_1nronrolc8azv0h.R.inc(30979);Interval test = new Interval(dt, dur);
        __CLR4_4_1nronrolc8azv0h.R.inc(30980);assertEquals(dt.getMillis(), test.getStartMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(30981);assertEquals(result, test.getEndMillis());
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    public void testConstructor_RI_RP5() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),30982);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fa2ncjnwm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RP5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30982,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fa2ncjnwm() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(30982);
        __CLR4_4_1nronrolc8azv0h.R.inc(30983);Interval test = new Interval((ReadableInstant) null, (ReadablePeriod) null);
        __CLR4_4_1nronrolc8azv0h.R.inc(30984);assertEquals(TEST_TIME_NOW, test.getStartMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(30985);assertEquals(TEST_TIME_NOW, test.getEndMillis());
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    public void testConstructor_RI_RP6() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),30986);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c12ok2nwq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RP6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30986,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c12ok2nwq() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(30986);
        __CLR4_4_1nronrolc8azv0h.R.inc(30987);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1nronrolc8azv0h.R.inc(30988);Interval test = new Interval(dt, (ReadablePeriod) null);
        __CLR4_4_1nronrolc8azv0h.R.inc(30989);assertEquals(dt.getMillis(), test.getStartMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(30990);assertEquals(dt.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    public void testConstructor_RI_RP7() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),30991);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18s2prlnwv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RP7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30991,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18s2prlnwv() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(30991);
        __CLR4_4_1nronrolc8azv0h.R.inc(30992);Period dur = new Period(0, 6, 0, 0, 1, 0, 0, 0);
        __CLR4_4_1nronrolc8azv0h.R.inc(30993);long result = TEST_TIME_NOW;
        __CLR4_4_1nronrolc8azv0h.R.inc(30994);result = ISOChronology.getInstance().monthOfYear().add(result, 6);
        __CLR4_4_1nronrolc8azv0h.R.inc(30995);result = ISOChronology.getInstance().hourOfDay().add(result, 1);
        
        __CLR4_4_1nronrolc8azv0h.R.inc(30996);Interval test = new Interval((ReadableInstant) null, dur);
        __CLR4_4_1nronrolc8azv0h.R.inc(30997);assertEquals(TEST_TIME_NOW, test.getStartMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(30998);assertEquals(result, test.getEndMillis());
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    public void testConstructor_RI_RP8() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),30999);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15j2qz4nx3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RP8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30999,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15j2qz4nx3() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(30999);
        __CLR4_4_1nronrolc8azv0h.R.inc(31000);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1nronrolc8azv0h.R.inc(31001);Period dur = new Period(0, 0, 0, 0, 0, 0, 0, -1);
        __CLR4_4_1nronrolc8azv0h.R.inc(31002);try {
            __CLR4_4_1nronrolc8azv0h.R.inc(31003);new Interval(dt, dur);
            __CLR4_4_1nronrolc8azv0h.R.inc(31004);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_RP_RI1() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),31005);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zb8gc7nx9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RP_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31005,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zb8gc7nx9() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(31005);
        __CLR4_4_1nronrolc8azv0h.R.inc(31006);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1nronrolc8azv0h.R.inc(31007);Period dur = new Period(0, 6, 0, 0, 1, 0, 0, 0);
        __CLR4_4_1nronrolc8azv0h.R.inc(31008);long result = TEST_TIME_NOW;
        __CLR4_4_1nronrolc8azv0h.R.inc(31009);result = ISOChronology.getInstance().months().add(result, -6);
        __CLR4_4_1nronrolc8azv0h.R.inc(31010);result = ISOChronology.getInstance().hours().add(result, -1);
        
        __CLR4_4_1nronrolc8azv0h.R.inc(31011);Interval test = new Interval(dur, dt);
        __CLR4_4_1nronrolc8azv0h.R.inc(31012);assertEquals(result, test.getStartMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(31013);assertEquals(dt.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    public void testConstructor_RP_RI2() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),31014);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wgvmugnxi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RP_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31014,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wgvmugnxi() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(31014);
        __CLR4_4_1nronrolc8azv0h.R.inc(31015);Instant dt = new Instant(new DateTime(TEST_TIME_NOW));
        __CLR4_4_1nronrolc8azv0h.R.inc(31016);Period dur = new Period(0, 6, 0, 3, 1, 0, 0, 0);
        __CLR4_4_1nronrolc8azv0h.R.inc(31017);long result = TEST_TIME_NOW;
        __CLR4_4_1nronrolc8azv0h.R.inc(31018);result = ISOChronology.getInstanceUTC().months().add(result, -6);
        __CLR4_4_1nronrolc8azv0h.R.inc(31019);result = ISOChronology.getInstanceUTC().days().add(result, -3);
        __CLR4_4_1nronrolc8azv0h.R.inc(31020);result = ISOChronology.getInstanceUTC().hours().add(result, -1);
        
        __CLR4_4_1nronrolc8azv0h.R.inc(31021);Interval test = new Interval(dur, dt);
        __CLR4_4_1nronrolc8azv0h.R.inc(31022);assertEquals(result, test.getStartMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(31023);assertEquals(dt.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    public void testConstructor_RP_RI3() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),31024);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t7vo1znxs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RP_RI3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31024,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t7vo1znxs() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(31024);
        __CLR4_4_1nronrolc8azv0h.R.inc(31025);DateTime dt = new DateTime(TEST_TIME_NOW, CopticChronology.getInstanceUTC());
        __CLR4_4_1nronrolc8azv0h.R.inc(31026);Period dur = new Period(0, 6, 0, 3, 1, 0, 0, 0, PeriodType.standard());
        __CLR4_4_1nronrolc8azv0h.R.inc(31027);long result = TEST_TIME_NOW;
        __CLR4_4_1nronrolc8azv0h.R.inc(31028);result = CopticChronology.getInstanceUTC().months().add(result, -6);
        __CLR4_4_1nronrolc8azv0h.R.inc(31029);result = CopticChronology.getInstanceUTC().days().add(result, -3);
        __CLR4_4_1nronrolc8azv0h.R.inc(31030);result = CopticChronology.getInstanceUTC().hours().add(result, -1);
        
        __CLR4_4_1nronrolc8azv0h.R.inc(31031);Interval test = new Interval(dur, dt);
        __CLR4_4_1nronrolc8azv0h.R.inc(31032);assertEquals(result, test.getStartMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(31033);assertEquals(dt.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    public void testConstructor_RP_RI4() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),31034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pyvp9iny2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RP_RI4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31034,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pyvp9iny2() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(31034);
        __CLR4_4_1nronrolc8azv0h.R.inc(31035);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1nronrolc8azv0h.R.inc(31036);Period dur = new Period(1 * DateTimeConstants.MILLIS_PER_HOUR + 23L);
        __CLR4_4_1nronrolc8azv0h.R.inc(31037);long result = TEST_TIME_NOW;
        __CLR4_4_1nronrolc8azv0h.R.inc(31038);result = ISOChronology.getInstance().hours().add(result, -1);
        __CLR4_4_1nronrolc8azv0h.R.inc(31039);result = ISOChronology.getInstance().millis().add(result, -23);
        
        __CLR4_4_1nronrolc8azv0h.R.inc(31040);Interval test = new Interval(dur, dt);
        __CLR4_4_1nronrolc8azv0h.R.inc(31041);assertEquals(result, test.getStartMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(31042);assertEquals(dt.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    public void testConstructor_RP_RI5() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),31043);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mpvqh1nyb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RP_RI5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31043,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mpvqh1nyb() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(31043);
        __CLR4_4_1nronrolc8azv0h.R.inc(31044);Interval test = new Interval((ReadablePeriod) null, (ReadableInstant) null);
        __CLR4_4_1nronrolc8azv0h.R.inc(31045);assertEquals(TEST_TIME_NOW, test.getStartMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(31046);assertEquals(TEST_TIME_NOW, test.getEndMillis());
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    public void testConstructor_RP_RI6() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),31047);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jgvroknyf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RP_RI6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31047,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jgvroknyf() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(31047);
        __CLR4_4_1nronrolc8azv0h.R.inc(31048);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1nronrolc8azv0h.R.inc(31049);Interval test = new Interval((ReadablePeriod) null, dt);
        __CLR4_4_1nronrolc8azv0h.R.inc(31050);assertEquals(dt.getMillis(), test.getStartMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(31051);assertEquals(dt.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    public void testConstructor_RP_RI7() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),31052);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g7vsw3nyk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RP_RI7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31052,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g7vsw3nyk() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(31052);
        __CLR4_4_1nronrolc8azv0h.R.inc(31053);Period dur = new Period(0, 6, 0, 0, 1, 0, 0, 0);
        __CLR4_4_1nronrolc8azv0h.R.inc(31054);long result = TEST_TIME_NOW;
        __CLR4_4_1nronrolc8azv0h.R.inc(31055);result = ISOChronology.getInstance().monthOfYear().add(result, -6);
        __CLR4_4_1nronrolc8azv0h.R.inc(31056);result = ISOChronology.getInstance().hourOfDay().add(result, -1);
        
        __CLR4_4_1nronrolc8azv0h.R.inc(31057);Interval test = new Interval(dur, (ReadableInstant) null);
        __CLR4_4_1nronrolc8azv0h.R.inc(31058);assertEquals(result, test.getStartMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(31059);assertEquals(TEST_TIME_NOW, test.getEndMillis());
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    public void testConstructor_RP_RI8() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),31060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cyvu3mnys();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RP_RI8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31060,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cyvu3mnys() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(31060);
        __CLR4_4_1nronrolc8azv0h.R.inc(31061);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1nronrolc8azv0h.R.inc(31062);Period dur = new Period(0, 0, 0, 0, 0, 0, 0, -1);
        __CLR4_4_1nronrolc8azv0h.R.inc(31063);try {
            __CLR4_4_1nronrolc8azv0h.R.inc(31064);new Interval(dur, dt);
            __CLR4_4_1nronrolc8azv0h.R.inc(31065);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_RI_RD1() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),31066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tqt357nyy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RD1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31066,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tqt357nyy() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(31066);
        __CLR4_4_1nronrolc8azv0h.R.inc(31067);long result = TEST_TIME_NOW;
        __CLR4_4_1nronrolc8azv0h.R.inc(31068);result = ISOChronology.getInstance().months().add(result, 6);
        __CLR4_4_1nronrolc8azv0h.R.inc(31069);result = ISOChronology.getInstance().hours().add(result, 1);
        
        __CLR4_4_1nronrolc8azv0h.R.inc(31070);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1nronrolc8azv0h.R.inc(31071);Duration dur = new Duration(result - TEST_TIME_NOW);
        
        __CLR4_4_1nronrolc8azv0h.R.inc(31072);Interval test = new Interval(dt, dur);
        __CLR4_4_1nronrolc8azv0h.R.inc(31073);assertEquals(dt.getMillis(), test.getStartMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(31074);assertEquals(result, test.getEndMillis());
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    public void testConstructor_RI_RD2() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),31075);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qht4cqnz7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RD2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31075,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qht4cqnz7() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(31075);
        __CLR4_4_1nronrolc8azv0h.R.inc(31076);Interval test = new Interval((ReadableInstant) null, (ReadableDuration) null);
        __CLR4_4_1nronrolc8azv0h.R.inc(31077);assertEquals(TEST_TIME_NOW, test.getStartMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(31078);assertEquals(TEST_TIME_NOW, test.getEndMillis());
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    public void testConstructor_RI_RD3() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),31079);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n8t5k9nzb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RD3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31079,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n8t5k9nzb() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(31079);
        __CLR4_4_1nronrolc8azv0h.R.inc(31080);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1nronrolc8azv0h.R.inc(31081);Interval test = new Interval(dt, (ReadableDuration) null);
        __CLR4_4_1nronrolc8azv0h.R.inc(31082);assertEquals(dt.getMillis(), test.getStartMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(31083);assertEquals(dt.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    public void testConstructor_RI_RD4() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),31084);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jzt6rsnzg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RD4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31084,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jzt6rsnzg() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(31084);
        __CLR4_4_1nronrolc8azv0h.R.inc(31085);long result = TEST_TIME_NOW;
        __CLR4_4_1nronrolc8azv0h.R.inc(31086);result = ISOChronology.getInstance().monthOfYear().add(result, 6);
        __CLR4_4_1nronrolc8azv0h.R.inc(31087);result = ISOChronology.getInstance().hourOfDay().add(result, 1);
        
        __CLR4_4_1nronrolc8azv0h.R.inc(31088);Duration dur = new Duration(result - TEST_TIME_NOW);
        
        __CLR4_4_1nronrolc8azv0h.R.inc(31089);Interval test = new Interval((ReadableInstant) null, dur);
        __CLR4_4_1nronrolc8azv0h.R.inc(31090);assertEquals(TEST_TIME_NOW, test.getStartMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(31091);assertEquals(result, test.getEndMillis());
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    public void testConstructor_RI_RD5() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),31092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gqt7zbnzo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RD5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31092,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gqt7zbnzo() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(31092);
        __CLR4_4_1nronrolc8azv0h.R.inc(31093);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1nronrolc8azv0h.R.inc(31094);Duration dur = new Duration(-1);
        __CLR4_4_1nronrolc8azv0h.R.inc(31095);try {
            __CLR4_4_1nronrolc8azv0h.R.inc(31096);new Interval(dt, dur);
            __CLR4_4_1nronrolc8azv0h.R.inc(31097);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_RD_RI1() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),31098);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_160dzxnnzu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RD_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31098,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_160dzxnnzu() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(31098);
        __CLR4_4_1nronrolc8azv0h.R.inc(31099);long result = TEST_TIME_NOW;
        __CLR4_4_1nronrolc8azv0h.R.inc(31100);result = ISOChronology.getInstance().months().add(result, -6);
        __CLR4_4_1nronrolc8azv0h.R.inc(31101);result = ISOChronology.getInstance().hours().add(result, -1);
        
        __CLR4_4_1nronrolc8azv0h.R.inc(31102);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1nronrolc8azv0h.R.inc(31103);Duration dur = new Duration(TEST_TIME_NOW - result);
        
        __CLR4_4_1nronrolc8azv0h.R.inc(31104);Interval test = new Interval(dur, dt);
        __CLR4_4_1nronrolc8azv0h.R.inc(31105);assertEquals(result, test.getStartMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(31106);assertEquals(dt.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    public void testConstructor_RD_RI2() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),31107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_199dyq4o03();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RD_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31107,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_199dyq4o03() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(31107);
        __CLR4_4_1nronrolc8azv0h.R.inc(31108);Interval test = new Interval((ReadableDuration) null, (ReadableInstant) null);
        __CLR4_4_1nronrolc8azv0h.R.inc(31109);assertEquals(TEST_TIME_NOW, test.getStartMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(31110);assertEquals(TEST_TIME_NOW, test.getEndMillis());
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    public void testConstructor_RD_RI3() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),31111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cidxilo07();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RD_RI3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31111,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cidxilo07() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(31111);
        __CLR4_4_1nronrolc8azv0h.R.inc(31112);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1nronrolc8azv0h.R.inc(31113);Interval test = new Interval((ReadableDuration) null, dt);
        __CLR4_4_1nronrolc8azv0h.R.inc(31114);assertEquals(dt.getMillis(), test.getStartMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(31115);assertEquals(dt.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    public void testConstructor_RD_RI4() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),31116);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1frdwb2o0c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RD_RI4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31116,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1frdwb2o0c() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(31116);
        __CLR4_4_1nronrolc8azv0h.R.inc(31117);long result = TEST_TIME_NOW;
        __CLR4_4_1nronrolc8azv0h.R.inc(31118);result = ISOChronology.getInstance().monthOfYear().add(result, -6);
        __CLR4_4_1nronrolc8azv0h.R.inc(31119);result = ISOChronology.getInstance().hourOfDay().add(result, -1);
        
        __CLR4_4_1nronrolc8azv0h.R.inc(31120);Duration dur = new Duration(TEST_TIME_NOW - result);
        
        __CLR4_4_1nronrolc8azv0h.R.inc(31121);Interval test = new Interval(dur, (ReadableInstant) null);
        __CLR4_4_1nronrolc8azv0h.R.inc(31122);assertEquals(result, test.getStartMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(31123);assertEquals(TEST_TIME_NOW, test.getEndMillis());
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    public void testConstructor_RD_RI5() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),31124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j0dv3jo0k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RD_RI5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31124,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j0dv3jo0k() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(31124);
        __CLR4_4_1nronrolc8azv0h.R.inc(31125);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1nronrolc8azv0h.R.inc(31126);Duration dur = new Duration(-1);
        __CLR4_4_1nronrolc8azv0h.R.inc(31127);try {
            __CLR4_4_1nronrolc8azv0h.R.inc(31128);new Interval(dur, dt);
            __CLR4_4_1nronrolc8azv0h.R.inc(31129);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor_Object1() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),31130);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19oqxcyo0q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_Object1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31130,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19oqxcyo0q() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(31130);
        __CLR4_4_1nronrolc8azv0h.R.inc(31131);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1nronrolc8azv0h.R.inc(31132);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1nronrolc8azv0h.R.inc(31133);Interval test = new Interval(dt1.toString() + '/' + dt2.toString());
        __CLR4_4_1nronrolc8azv0h.R.inc(31134);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(31135);assertEquals(dt2.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    public void testConstructor_Object2() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),31136);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cxqw5fo0w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_Object2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31136,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cxqw5fo0w() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(31136);
        __CLR4_4_1nronrolc8azv0h.R.inc(31137);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1nronrolc8azv0h.R.inc(31138);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1nronrolc8azv0h.R.inc(31139);Interval base = new Interval(dt1, dt2);
        
        __CLR4_4_1nronrolc8azv0h.R.inc(31140);Interval test = new Interval(base);
        __CLR4_4_1nronrolc8azv0h.R.inc(31141);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(31142);assertEquals(dt2.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    public void testConstructor_Object3() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),31143);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g6quxwo13();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_Object3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31143,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g6quxwo13() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(31143);
        __CLR4_4_1nronrolc8azv0h.R.inc(31144);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1nronrolc8azv0h.R.inc(31145);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1nronrolc8azv0h.R.inc(31146);MutableInterval base = new MutableInterval(dt1, dt2);
        
        __CLR4_4_1nronrolc8azv0h.R.inc(31147);Interval test = new Interval(base);
        __CLR4_4_1nronrolc8azv0h.R.inc(31148);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(31149);assertEquals(dt2.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    public void testConstructor_Object4() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),31150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jfqtqdo1a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_Object4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31150,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jfqtqdo1a() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(31150);
        __CLR4_4_1nronrolc8azv0h.R.inc(31151);MockInterval base = new MockInterval();
        __CLR4_4_1nronrolc8azv0h.R.inc(31152);Interval test = new Interval(base);
        __CLR4_4_1nronrolc8azv0h.R.inc(31153);assertEquals(base.getStartMillis(), test.getStartMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(31154);assertEquals(base.getEndMillis(), test.getEndMillis());
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    public void testConstructor_Object5() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),31155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1moqsiuo1f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_Object5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31155,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1moqsiuo1f() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(31155);
        __CLR4_4_1nronrolc8azv0h.R.inc(31156);IntervalConverter oldConv = ConverterManager.getInstance().getIntervalConverter("");
        __CLR4_4_1nronrolc8azv0h.R.inc(31157);IntervalConverter conv = new IntervalConverter() {
            public boolean isReadableInterval(Object object, Chronology chrono) {try{__CLR4_4_1nronrolc8azv0h.R.inc(31158);
                __CLR4_4_1nronrolc8azv0h.R.inc(31159);return false;
            }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}
            public void setInto(ReadWritableInterval interval, Object object, Chronology chrono) {try{__CLR4_4_1nronrolc8azv0h.R.inc(31160);
                __CLR4_4_1nronrolc8azv0h.R.inc(31161);interval.setChronology(chrono);
                __CLR4_4_1nronrolc8azv0h.R.inc(31162);interval.setInterval(1234L, 5678L);
            }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}
            public Class<?> getSupportedType() {try{__CLR4_4_1nronrolc8azv0h.R.inc(31163);
                __CLR4_4_1nronrolc8azv0h.R.inc(31164);return String.class;
            }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}
        };
        __CLR4_4_1nronrolc8azv0h.R.inc(31165);try {
            __CLR4_4_1nronrolc8azv0h.R.inc(31166);ConverterManager.getInstance().addIntervalConverter(conv);
            __CLR4_4_1nronrolc8azv0h.R.inc(31167);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
            __CLR4_4_1nronrolc8azv0h.R.inc(31168);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
            __CLR4_4_1nronrolc8azv0h.R.inc(31169);Interval test = new Interval(dt1.toString() + '/' + dt2.toString());
            __CLR4_4_1nronrolc8azv0h.R.inc(31170);assertEquals(1234L, test.getStartMillis());
            __CLR4_4_1nronrolc8azv0h.R.inc(31171);assertEquals(5678L, test.getEndMillis());
        } finally {
            __CLR4_4_1nronrolc8azv0h.R.inc(31172);ConverterManager.getInstance().addIntervalConverter(oldConv);
        }
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    public void testConstructor_Object6() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),31173);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pxqrbbo1x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_Object6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31173,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pxqrbbo1x() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(31173);
        __CLR4_4_1nronrolc8azv0h.R.inc(31174);IntervalConverter oldConv = ConverterManager.getInstance().getIntervalConverter(new Interval(0L, 0L));
        __CLR4_4_1nronrolc8azv0h.R.inc(31175);IntervalConverter conv = new IntervalConverter() {
            public boolean isReadableInterval(Object object, Chronology chrono) {try{__CLR4_4_1nronrolc8azv0h.R.inc(31176);
                __CLR4_4_1nronrolc8azv0h.R.inc(31177);return false;
            }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}
            public void setInto(ReadWritableInterval interval, Object object, Chronology chrono) {try{__CLR4_4_1nronrolc8azv0h.R.inc(31178);
                __CLR4_4_1nronrolc8azv0h.R.inc(31179);interval.setChronology(chrono);
                __CLR4_4_1nronrolc8azv0h.R.inc(31180);interval.setInterval(1234L, 5678L);
            }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}
            public Class<?> getSupportedType() {try{__CLR4_4_1nronrolc8azv0h.R.inc(31181);
                __CLR4_4_1nronrolc8azv0h.R.inc(31182);return ReadableInterval.class;
            }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}
        };
        __CLR4_4_1nronrolc8azv0h.R.inc(31183);try {
            __CLR4_4_1nronrolc8azv0h.R.inc(31184);ConverterManager.getInstance().addIntervalConverter(conv);
            __CLR4_4_1nronrolc8azv0h.R.inc(31185);Interval base = new Interval(-1000L, 1000L);
            __CLR4_4_1nronrolc8azv0h.R.inc(31186);Interval test = new Interval(base);
            __CLR4_4_1nronrolc8azv0h.R.inc(31187);assertEquals(1234L, test.getStartMillis());
            __CLR4_4_1nronrolc8azv0h.R.inc(31188);assertEquals(5678L, test.getEndMillis());
        } finally {
            __CLR4_4_1nronrolc8azv0h.R.inc(31189);ConverterManager.getInstance().addIntervalConverter(oldConv);
        }
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    class MockInterval implements ReadableInterval {
        public Chronology getChronology() {try{__CLR4_4_1nronrolc8azv0h.R.inc(31190);
            __CLR4_4_1nronrolc8azv0h.R.inc(31191);return ISOChronology.getInstance();
        }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}
        public long getStartMillis() {try{__CLR4_4_1nronrolc8azv0h.R.inc(31192);
            __CLR4_4_1nronrolc8azv0h.R.inc(31193);return 1234L;
        }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}
        public DateTime getStart() {try{__CLR4_4_1nronrolc8azv0h.R.inc(31194);
            __CLR4_4_1nronrolc8azv0h.R.inc(31195);return new DateTime(1234L);
        }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}
        public long getEndMillis() {try{__CLR4_4_1nronrolc8azv0h.R.inc(31196);
            __CLR4_4_1nronrolc8azv0h.R.inc(31197);return 5678L;
        }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}
        public DateTime getEnd() {try{__CLR4_4_1nronrolc8azv0h.R.inc(31198);
            __CLR4_4_1nronrolc8azv0h.R.inc(31199);return new DateTime(5678L);
        }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}
        public long toDurationMillis() {try{__CLR4_4_1nronrolc8azv0h.R.inc(31200);
            __CLR4_4_1nronrolc8azv0h.R.inc(31201);return (5678L - 1234L);
        }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}
        public Duration toDuration() {try{__CLR4_4_1nronrolc8azv0h.R.inc(31202);
            __CLR4_4_1nronrolc8azv0h.R.inc(31203);return new Duration(5678L - 1234L);
        }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}
        public boolean contains(long millisInstant) {try{__CLR4_4_1nronrolc8azv0h.R.inc(31204);
            __CLR4_4_1nronrolc8azv0h.R.inc(31205);return false;
        }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}
        public boolean containsNow() {try{__CLR4_4_1nronrolc8azv0h.R.inc(31206);
            __CLR4_4_1nronrolc8azv0h.R.inc(31207);return false;
        }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}
        public boolean contains(ReadableInstant instant) {try{__CLR4_4_1nronrolc8azv0h.R.inc(31208);
            __CLR4_4_1nronrolc8azv0h.R.inc(31209);return false;
        }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}
        public boolean contains(ReadableInterval interval) {try{__CLR4_4_1nronrolc8azv0h.R.inc(31210);
            __CLR4_4_1nronrolc8azv0h.R.inc(31211);return false;
        }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}
        public boolean overlaps(ReadableInterval interval) {try{__CLR4_4_1nronrolc8azv0h.R.inc(31212);
            __CLR4_4_1nronrolc8azv0h.R.inc(31213);return false;
        }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}
        public boolean isBefore(ReadableInstant instant) {try{__CLR4_4_1nronrolc8azv0h.R.inc(31214);
            __CLR4_4_1nronrolc8azv0h.R.inc(31215);return false;
        }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}
        public boolean isBefore(ReadableInterval interval) {try{__CLR4_4_1nronrolc8azv0h.R.inc(31216);
            __CLR4_4_1nronrolc8azv0h.R.inc(31217);return false;
        }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}
        public boolean isAfter(ReadableInstant instant) {try{__CLR4_4_1nronrolc8azv0h.R.inc(31218);
            __CLR4_4_1nronrolc8azv0h.R.inc(31219);return false;
        }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}
        public boolean isAfter(ReadableInterval interval) {try{__CLR4_4_1nronrolc8azv0h.R.inc(31220);
            __CLR4_4_1nronrolc8azv0h.R.inc(31221);return false;
        }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}
        public Interval toInterval() {try{__CLR4_4_1nronrolc8azv0h.R.inc(31222);
            __CLR4_4_1nronrolc8azv0h.R.inc(31223);return null;
        }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}
        public MutableInterval toMutableInterval() {try{__CLR4_4_1nronrolc8azv0h.R.inc(31224);
            __CLR4_4_1nronrolc8azv0h.R.inc(31225);return null;
        }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}
        public Period toPeriod() {try{__CLR4_4_1nronrolc8azv0h.R.inc(31226);
            __CLR4_4_1nronrolc8azv0h.R.inc(31227);return null;
        }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}
        public Period toPeriod(PeriodType type) {try{__CLR4_4_1nronrolc8azv0h.R.inc(31228);
            __CLR4_4_1nronrolc8azv0h.R.inc(31229);return null;
        }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    public void testConstructor_Object_Chronology1() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),31230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pmfigno3i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_Object_Chronology1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31230,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pmfigno3i() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(31230);
        __CLR4_4_1nronrolc8azv0h.R.inc(31231);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1nronrolc8azv0h.R.inc(31232);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1nronrolc8azv0h.R.inc(31233);Interval base = new Interval(dt1, dt2);
        
        __CLR4_4_1nronrolc8azv0h.R.inc(31234);Interval test = new Interval(base, BuddhistChronology.getInstance());
        __CLR4_4_1nronrolc8azv0h.R.inc(31235);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(31236);assertEquals(dt2.getMillis(), test.getEndMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(31237);assertEquals(BuddhistChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

    public void testConstructor_Object_Chronology2() throws Throwable {__CLR4_4_1nronrolc8azv0h.R.globalSliceStart(getClass().getName(),31238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1svfh94o3q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1nronrolc8azv0h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1nronrolc8azv0h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_Object_Chronology2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31238,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1svfh94o3q() throws Throwable{try{__CLR4_4_1nronrolc8azv0h.R.inc(31238);
        __CLR4_4_1nronrolc8azv0h.R.inc(31239);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1nronrolc8azv0h.R.inc(31240);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1nronrolc8azv0h.R.inc(31241);Interval base = new Interval(dt1, dt2);
        
        __CLR4_4_1nronrolc8azv0h.R.inc(31242);Interval test = new Interval(base, null);
        __CLR4_4_1nronrolc8azv0h.R.inc(31243);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(31244);assertEquals(dt2.getMillis(), test.getEndMillis());
        __CLR4_4_1nronrolc8azv0h.R.inc(31245);assertEquals(ISOChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1nronrolc8azv0h.R.flushNeeded();}}

}
