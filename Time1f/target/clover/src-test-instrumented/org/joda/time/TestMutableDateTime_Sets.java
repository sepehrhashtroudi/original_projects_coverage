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

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a JUnit test for MutableDateTime.
 *
 * @author Stephen Colebourne
 */
public class TestMutableDateTime_Sets extends TestCase {static class __CLR4_4_1u51u51lc8azvug{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,39477,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1u51u51lc8azvug.R.inc(39061);
        __CLR4_4_1u51u51lc8azvug.R.inc(39062);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1u51u51lc8azvug.R.inc(39063);
        __CLR4_4_1u51u51lc8azvug.R.inc(39064);return new TestSuite(TestMutableDateTime_Sets.class);
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    public TestMutableDateTime_Sets(String name) {
        super(name);__CLR4_4_1u51u51lc8azvug.R.inc(39066);try{__CLR4_4_1u51u51lc8azvug.R.inc(39065);
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1u51u51lc8azvug.R.inc(39067);
        __CLR4_4_1u51u51lc8azvug.R.inc(39068);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1u51u51lc8azvug.R.inc(39069);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1u51u51lc8azvug.R.inc(39070);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1u51u51lc8azvug.R.inc(39071);originalLocale = Locale.getDefault();
        __CLR4_4_1u51u51lc8azvug.R.inc(39072);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1u51u51lc8azvug.R.inc(39073);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1u51u51lc8azvug.R.inc(39074);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1u51u51lc8azvug.R.inc(39075);
        __CLR4_4_1u51u51lc8azvug.R.inc(39076);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1u51u51lc8azvug.R.inc(39077);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1u51u51lc8azvug.R.inc(39078);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1u51u51lc8azvug.R.inc(39079);Locale.setDefault(originalLocale);
        __CLR4_4_1u51u51lc8azvug.R.inc(39080);originalDateTimeZone = null;
        __CLR4_4_1u51u51lc8azvug.R.inc(39081);originalTimeZone = null;
        __CLR4_4_1u51u51lc8azvug.R.inc(39082);originalLocale = null;
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testTest() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39083);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqju5n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39083,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqju5n(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39083);
        __CLR4_4_1u51u51lc8azvug.R.inc(39084);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
        __CLR4_4_1u51u51lc8azvug.R.inc(39085);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        __CLR4_4_1u51u51lc8azvug.R.inc(39086);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetMillis_long1() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39087);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_191g4a5u5r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMillis_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39087,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_191g4a5u5r(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39087);
        __CLR4_4_1u51u51lc8azvug.R.inc(39088);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1u51u51lc8azvug.R.inc(39089);test.setMillis(TEST_TIME2);
        __CLR4_4_1u51u51lc8azvug.R.inc(39090);assertEquals(TEST_TIME2, test.getMillis());
        __CLR4_4_1u51u51lc8azvug.R.inc(39091);assertEquals(ISOChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetChronology_Chronology1() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lgonbru5w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetChronology_Chronology1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39092,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lgonbru5w(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39092);
        __CLR4_4_1u51u51lc8azvug.R.inc(39093);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1u51u51lc8azvug.R.inc(39094);test.setChronology(GregorianChronology.getInstance(PARIS));
        __CLR4_4_1u51u51lc8azvug.R.inc(39095);assertEquals(TEST_TIME1, test.getMillis());
        __CLR4_4_1u51u51lc8azvug.R.inc(39096);assertEquals(GregorianChronology.getInstance(PARIS), test.getChronology());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}        

    public void testSetChronology_Chronology2() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39097);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i7oojau61();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetChronology_Chronology2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39097,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i7oojau61(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39097);
        __CLR4_4_1u51u51lc8azvug.R.inc(39098);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1u51u51lc8azvug.R.inc(39099);test.setChronology(null);
        __CLR4_4_1u51u51lc8azvug.R.inc(39100);assertEquals(TEST_TIME1, test.getMillis());
        __CLR4_4_1u51u51lc8azvug.R.inc(39101);assertEquals(ISOChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetZone_DateTimeZone1() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xfu442u66();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetZone_DateTimeZone1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39102,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xfu442u66(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39102);
        __CLR4_4_1u51u51lc8azvug.R.inc(39103);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1u51u51lc8azvug.R.inc(39104);test.setZone(PARIS);
        __CLR4_4_1u51u51lc8azvug.R.inc(39105);assertEquals(TEST_TIME1, test.getMillis());
        __CLR4_4_1u51u51lc8azvug.R.inc(39106);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}        

    public void testSetZone_DateTimeZone2() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u6u5blu6b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetZone_DateTimeZone2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39107,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u6u5blu6b(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39107);
        __CLR4_4_1u51u51lc8azvug.R.inc(39108);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1u51u51lc8azvug.R.inc(39109);test.setZone(null);
        __CLR4_4_1u51u51lc8azvug.R.inc(39110);assertEquals(TEST_TIME1, test.getMillis());
        __CLR4_4_1u51u51lc8azvug.R.inc(39111);assertEquals(ISOChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}        

    //-----------------------------------------------------------------------
    public void testSetZoneRetainFields_DateTimeZone1() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xi37vwu6g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetZoneRetainFields_DateTimeZone1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39112,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xi37vwu6g(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39112);
        __CLR4_4_1u51u51lc8azvug.R.inc(39113);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1u51u51lc8azvug.R.inc(39114);test.setZoneRetainFields(PARIS);
        __CLR4_4_1u51u51lc8azvug.R.inc(39115);assertEquals(TEST_TIME1 - DateTimeConstants.MILLIS_PER_HOUR, test.getMillis());
        __CLR4_4_1u51u51lc8azvug.R.inc(39116);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}        

    public void testSetZoneRetainFields_DateTimeZone2() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ya0varu6l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetZoneRetainFields_DateTimeZone2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39117,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ya0varu6l(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39117);
        __CLR4_4_1u51u51lc8azvug.R.inc(39118);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1u51u51lc8azvug.R.inc(39119);test.setZoneRetainFields(null);
        __CLR4_4_1u51u51lc8azvug.R.inc(39120);assertEquals(TEST_TIME1, test.getMillis());
        __CLR4_4_1u51u51lc8azvug.R.inc(39121);assertEquals(ISOChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}        

    public void testSetZoneRetainFields_DateTimeZone3() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39122);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v10wiau6q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetZoneRetainFields_DateTimeZone3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39122,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v10wiau6q(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39122);
        __CLR4_4_1u51u51lc8azvug.R.inc(39123);MutableDateTime test = new MutableDateTime(TEST_TIME1, GregorianChronology.getInstance(PARIS));
        __CLR4_4_1u51u51lc8azvug.R.inc(39124);test.setZoneRetainFields(null);
        __CLR4_4_1u51u51lc8azvug.R.inc(39125);assertEquals(TEST_TIME1 + DateTimeConstants.MILLIS_PER_HOUR, test.getMillis());
        __CLR4_4_1u51u51lc8azvug.R.inc(39126);assertEquals(GregorianChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}        

    public void testSetZoneRetainFields_DateTimeZone4() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39127);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rs0xptu6v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetZoneRetainFields_DateTimeZone4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39127,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rs0xptu6v(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39127);
        __CLR4_4_1u51u51lc8azvug.R.inc(39128);Chronology chrono = new MockNullZoneChronology();
        __CLR4_4_1u51u51lc8azvug.R.inc(39129);MutableDateTime test = new MutableDateTime(TEST_TIME1, chrono);
        __CLR4_4_1u51u51lc8azvug.R.inc(39130);test.setZoneRetainFields(PARIS);
        __CLR4_4_1u51u51lc8azvug.R.inc(39131);assertEquals(TEST_TIME1 - DateTimeConstants.MILLIS_PER_HOUR, test.getMillis());
        __CLR4_4_1u51u51lc8azvug.R.inc(39132);assertSame(chrono, test.getChronology());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}        

    //-----------------------------------------------------------------------
    public void testSetMillis_RI1() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39133);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p8b6qwu71();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMillis_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39133,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p8b6qwu71(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39133);
        __CLR4_4_1u51u51lc8azvug.R.inc(39134);MutableDateTime test = new MutableDateTime(TEST_TIME1, BuddhistChronology.getInstance());
        __CLR4_4_1u51u51lc8azvug.R.inc(39135);test.setMillis(new Instant(TEST_TIME2));
        __CLR4_4_1u51u51lc8azvug.R.inc(39136);assertEquals(TEST_TIME2, test.getMillis());
        __CLR4_4_1u51u51lc8azvug.R.inc(39137);assertEquals(BuddhistChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    public void testSetMillis_RI2() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39138);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lzb7yfu76();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMillis_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39138,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lzb7yfu76(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39138);
        __CLR4_4_1u51u51lc8azvug.R.inc(39139);MutableDateTime test = new MutableDateTime(TEST_TIME1, BuddhistChronology.getInstance());
        __CLR4_4_1u51u51lc8azvug.R.inc(39140);test.setMillis(null);
        __CLR4_4_1u51u51lc8azvug.R.inc(39141);assertEquals(TEST_TIME_NOW, test.getMillis());
        __CLR4_4_1u51u51lc8azvug.R.inc(39142);assertEquals(BuddhistChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSet_DateTimeFieldType_int1() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39143);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13wf19eu7b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSet_DateTimeFieldType_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39143,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13wf19eu7b(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39143);
        __CLR4_4_1u51u51lc8azvug.R.inc(39144);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1u51u51lc8azvug.R.inc(39145);test.set(DateTimeFieldType.year(), 2010);
        __CLR4_4_1u51u51lc8azvug.R.inc(39146);assertEquals(2010, test.getYear());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    public void testSet_DateTimeFieldType_int2() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39147);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nf2gxu7f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSet_DateTimeFieldType_int2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39147,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nf2gxu7f(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39147);
        __CLR4_4_1u51u51lc8azvug.R.inc(39148);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1u51u51lc8azvug.R.inc(39149);try {
            __CLR4_4_1u51u51lc8azvug.R.inc(39150);test.set(null, 0);
            __CLR4_4_1u51u51lc8azvug.R.inc(39151);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1u51u51lc8azvug.R.inc(39152);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    public void testSet_DateTimeFieldType_int3() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12lkwbku7l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSet_DateTimeFieldType_int3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39153,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12lkwbku7l(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39153);
        __CLR4_4_1u51u51lc8azvug.R.inc(39154);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1u51u51lc8azvug.R.inc(39155);try {
            __CLR4_4_1u51u51lc8azvug.R.inc(39156);test.set(DateTimeFieldType.monthOfYear(), 13);
            __CLR4_4_1u51u51lc8azvug.R.inc(39157);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1u51u51lc8azvug.R.inc(39158);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetDate_int_int_int1() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39159);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nqr65yu7r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDate_int_int_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39159,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nqr65yu7r(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39159);
        __CLR4_4_1u51u51lc8azvug.R.inc(39160);MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501);
        __CLR4_4_1u51u51lc8azvug.R.inc(39161);test.setDate(2010, 12, 3);
        __CLR4_4_1u51u51lc8azvug.R.inc(39162);assertEquals(2010, test.getYear());
        __CLR4_4_1u51u51lc8azvug.R.inc(39163);assertEquals(12, test.getMonthOfYear());
        __CLR4_4_1u51u51lc8azvug.R.inc(39164);assertEquals(3, test.getDayOfMonth());
        __CLR4_4_1u51u51lc8azvug.R.inc(39165);assertEquals(12, test.getHourOfDay());
        __CLR4_4_1u51u51lc8azvug.R.inc(39166);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_1u51u51lc8azvug.R.inc(39167);assertEquals(48, test.getSecondOfMinute());
        __CLR4_4_1u51u51lc8azvug.R.inc(39168);assertEquals(501, test.getMillisOfSecond());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    public void testSetDate_int_int_int2() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1khr7dhu81();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDate_int_int_int2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39169,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1khr7dhu81(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39169);
        __CLR4_4_1u51u51lc8azvug.R.inc(39170);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1u51u51lc8azvug.R.inc(39171);try {
            __CLR4_4_1u51u51lc8azvug.R.inc(39172);test.setDate(2010, 13, 3);
            __CLR4_4_1u51u51lc8azvug.R.inc(39173);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1u51u51lc8azvug.R.inc(39174);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetDate_long1() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aynyd7u87();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDate_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39175,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aynyd7u87(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39175);
        __CLR4_4_1u51u51lc8azvug.R.inc(39176);long setter = new DateTime(2010, 12, 3, 5, 7, 9, 501).getMillis();
        __CLR4_4_1u51u51lc8azvug.R.inc(39177);MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501);
        __CLR4_4_1u51u51lc8azvug.R.inc(39178);test.setDate(setter);
        __CLR4_4_1u51u51lc8azvug.R.inc(39179);assertEquals(2010, test.getYear());
        __CLR4_4_1u51u51lc8azvug.R.inc(39180);assertEquals(12, test.getMonthOfYear());
        __CLR4_4_1u51u51lc8azvug.R.inc(39181);assertEquals(3, test.getDayOfMonth());
        __CLR4_4_1u51u51lc8azvug.R.inc(39182);assertEquals(12, test.getHourOfDay());
        __CLR4_4_1u51u51lc8azvug.R.inc(39183);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_1u51u51lc8azvug.R.inc(39184);assertEquals(48, test.getSecondOfMinute());
        __CLR4_4_1u51u51lc8azvug.R.inc(39185);assertEquals(501, test.getMillisOfSecond());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetDate_RI1() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39186);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1psg874u8i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDate_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39186,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1psg874u8i(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39186);
        __CLR4_4_1u51u51lc8azvug.R.inc(39187);DateTime setter = new DateTime(2010, 12, 3, 5, 7, 9, 501);
        __CLR4_4_1u51u51lc8azvug.R.inc(39188);MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501);
        __CLR4_4_1u51u51lc8azvug.R.inc(39189);test.setDate(setter);
        __CLR4_4_1u51u51lc8azvug.R.inc(39190);assertEquals(2010, test.getYear());
        __CLR4_4_1u51u51lc8azvug.R.inc(39191);assertEquals(12, test.getMonthOfYear());
        __CLR4_4_1u51u51lc8azvug.R.inc(39192);assertEquals(3, test.getDayOfMonth());
        __CLR4_4_1u51u51lc8azvug.R.inc(39193);assertEquals(12, test.getHourOfDay());
        __CLR4_4_1u51u51lc8azvug.R.inc(39194);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_1u51u51lc8azvug.R.inc(39195);assertEquals(48, test.getSecondOfMinute());
        __CLR4_4_1u51u51lc8azvug.R.inc(39196);assertEquals(501, test.getMillisOfSecond());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    public void testSetDate_RI2() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39197);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t1g6zlu8t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDate_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39197,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t1g6zlu8t(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39197);
        __CLR4_4_1u51u51lc8azvug.R.inc(39198);MutableDateTime test = new MutableDateTime(2010, 7, 8, 12, 24, 48, 501);
        __CLR4_4_1u51u51lc8azvug.R.inc(39199);test.setDate(null);  // sets to TEST_TIME_NOW
        __CLR4_4_1u51u51lc8azvug.R.inc(39200);assertEquals(2002, test.getYear());
        __CLR4_4_1u51u51lc8azvug.R.inc(39201);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1u51u51lc8azvug.R.inc(39202);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1u51u51lc8azvug.R.inc(39203);assertEquals(12, test.getHourOfDay());
        __CLR4_4_1u51u51lc8azvug.R.inc(39204);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_1u51u51lc8azvug.R.inc(39205);assertEquals(48, test.getSecondOfMinute());
        __CLR4_4_1u51u51lc8azvug.R.inc(39206);assertEquals(501, test.getMillisOfSecond());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    public void testSetDate_RI_same() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39207);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xsc3dgu93();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDate_RI_same",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39207,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xsc3dgu93(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39207);
        __CLR4_4_1u51u51lc8azvug.R.inc(39208);MutableDateTime setter = new MutableDateTime(2010, 12, 3, 2, 24, 48, 501, DateTimeZone.forID("America/Los_Angeles"));
        __CLR4_4_1u51u51lc8azvug.R.inc(39209);MutableDateTime test = new MutableDateTime(2010, 12, 3, 2, 24, 48, 501, DateTimeZone.forID("America/Los_Angeles"));
        __CLR4_4_1u51u51lc8azvug.R.inc(39210);test.setDate(setter);
        __CLR4_4_1u51u51lc8azvug.R.inc(39211);assertEquals(2010, test.getYear());
        __CLR4_4_1u51u51lc8azvug.R.inc(39212);assertEquals(12, test.getMonthOfYear());
        __CLR4_4_1u51u51lc8azvug.R.inc(39213);assertEquals(3, test.getDayOfMonth());
        __CLR4_4_1u51u51lc8azvug.R.inc(39214);assertEquals(2, test.getHourOfDay());
        __CLR4_4_1u51u51lc8azvug.R.inc(39215);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_1u51u51lc8azvug.R.inc(39216);assertEquals(48, test.getSecondOfMinute());
        __CLR4_4_1u51u51lc8azvug.R.inc(39217);assertEquals(501, test.getMillisOfSecond());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    public void testSetDate_RI_different1() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39218);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yzmonau9e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDate_RI_different1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39218,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yzmonau9e(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39218);
        __CLR4_4_1u51u51lc8azvug.R.inc(39219);MutableDateTime setter = new MutableDateTime(2010, 12, 1, 0, 0, 0, 0, DateTimeZone.forID("America/Los_Angeles"));
        __CLR4_4_1u51u51lc8azvug.R.inc(39220);MutableDateTime test = new MutableDateTime(2010, 12, 3, 2, 24, 48, 501, DateTimeZone.forID("Europe/Moscow"));
        __CLR4_4_1u51u51lc8azvug.R.inc(39221);test.setDate(setter);
        __CLR4_4_1u51u51lc8azvug.R.inc(39222);assertEquals(2010, test.getYear());
        __CLR4_4_1u51u51lc8azvug.R.inc(39223);assertEquals(12, test.getMonthOfYear());
        __CLR4_4_1u51u51lc8azvug.R.inc(39224);assertEquals(1, test.getDayOfMonth());
        __CLR4_4_1u51u51lc8azvug.R.inc(39225);assertEquals(2, test.getHourOfDay());
        __CLR4_4_1u51u51lc8azvug.R.inc(39226);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_1u51u51lc8azvug.R.inc(39227);assertEquals(48, test.getSecondOfMinute());
        __CLR4_4_1u51u51lc8azvug.R.inc(39228);assertEquals(501, test.getMillisOfSecond());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    public void testSetDate_RI_different2() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39229);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wshejdu9p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDate_RI_different2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39229,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wshejdu9p(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39229);
        __CLR4_4_1u51u51lc8azvug.R.inc(39230);MutableDateTime setter = new MutableDateTime(2010, 12, 1, 0, 0, 0, 0, DateTimeZone.forID("Europe/Moscow"));
        __CLR4_4_1u51u51lc8azvug.R.inc(39231);MutableDateTime test = new MutableDateTime(2010, 12, 3, 2, 24, 48, 501, DateTimeZone.forID("America/Los_Angeles"));
        __CLR4_4_1u51u51lc8azvug.R.inc(39232);test.setDate(setter);
        __CLR4_4_1u51u51lc8azvug.R.inc(39233);assertEquals(2010, test.getYear());
        __CLR4_4_1u51u51lc8azvug.R.inc(39234);assertEquals(12, test.getMonthOfYear());
        __CLR4_4_1u51u51lc8azvug.R.inc(39235);assertEquals(1, test.getDayOfMonth());
        __CLR4_4_1u51u51lc8azvug.R.inc(39236);assertEquals(2, test.getHourOfDay());
        __CLR4_4_1u51u51lc8azvug.R.inc(39237);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_1u51u51lc8azvug.R.inc(39238);assertEquals(48, test.getSecondOfMinute());
        __CLR4_4_1u51u51lc8azvug.R.inc(39239);assertEquals(501, test.getMillisOfSecond());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetTime_int_int_int_int1() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39240);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ij3yitua0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetTime_int_int_int_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39240,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ij3yitua0(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39240);
        __CLR4_4_1u51u51lc8azvug.R.inc(39241);MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501);
        __CLR4_4_1u51u51lc8azvug.R.inc(39242);test.setTime(5, 6, 7, 8);
        __CLR4_4_1u51u51lc8azvug.R.inc(39243);assertEquals(2002, test.getYear());
        __CLR4_4_1u51u51lc8azvug.R.inc(39244);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1u51u51lc8azvug.R.inc(39245);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1u51u51lc8azvug.R.inc(39246);assertEquals(5, test.getHourOfDay());
        __CLR4_4_1u51u51lc8azvug.R.inc(39247);assertEquals(6, test.getMinuteOfHour());
        __CLR4_4_1u51u51lc8azvug.R.inc(39248);assertEquals(7, test.getSecondOfMinute());
        __CLR4_4_1u51u51lc8azvug.R.inc(39249);assertEquals(8, test.getMillisOfSecond());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    public void testSetTime_int_int_int2() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39250);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p9vytouaa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetTime_int_int_int2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39250,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p9vytouaa(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39250);
        __CLR4_4_1u51u51lc8azvug.R.inc(39251);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1u51u51lc8azvug.R.inc(39252);try {
            __CLR4_4_1u51u51lc8azvug.R.inc(39253);test.setTime(60, 6, 7, 8);
            __CLR4_4_1u51u51lc8azvug.R.inc(39254);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1u51u51lc8azvug.R.inc(39255);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetTime_long1() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1psflx6uag();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetTime_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39256,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1psflx6uag(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39256);
        __CLR4_4_1u51u51lc8azvug.R.inc(39257);long setter = new DateTime(2010, 12, 3, 5, 7, 9, 11).getMillis();
        __CLR4_4_1u51u51lc8azvug.R.inc(39258);MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501);
        __CLR4_4_1u51u51lc8azvug.R.inc(39259);test.setTime(setter);
        __CLR4_4_1u51u51lc8azvug.R.inc(39260);assertEquals(2002, test.getYear());
        __CLR4_4_1u51u51lc8azvug.R.inc(39261);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1u51u51lc8azvug.R.inc(39262);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1u51u51lc8azvug.R.inc(39263);assertEquals(5, test.getHourOfDay());
        __CLR4_4_1u51u51lc8azvug.R.inc(39264);assertEquals(7, test.getMinuteOfHour());
        __CLR4_4_1u51u51lc8azvug.R.inc(39265);assertEquals(9, test.getSecondOfMinute());
        __CLR4_4_1u51u51lc8azvug.R.inc(39266);assertEquals(11, test.getMillisOfSecond());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetTime_RI1() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j7h2gxuar();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetTime_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39267,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j7h2gxuar(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39267);
        __CLR4_4_1u51u51lc8azvug.R.inc(39268);DateTime setter = new DateTime(2010, 12, 3, 5, 7, 9, 11);
        __CLR4_4_1u51u51lc8azvug.R.inc(39269);MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501);
        __CLR4_4_1u51u51lc8azvug.R.inc(39270);test.setTime(setter);
        __CLR4_4_1u51u51lc8azvug.R.inc(39271);assertEquals(2002, test.getYear());
        __CLR4_4_1u51u51lc8azvug.R.inc(39272);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1u51u51lc8azvug.R.inc(39273);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1u51u51lc8azvug.R.inc(39274);assertEquals(5, test.getHourOfDay());
        __CLR4_4_1u51u51lc8azvug.R.inc(39275);assertEquals(7, test.getMinuteOfHour());
        __CLR4_4_1u51u51lc8azvug.R.inc(39276);assertEquals(9, test.getSecondOfMinute());
        __CLR4_4_1u51u51lc8azvug.R.inc(39277);assertEquals(11, test.getMillisOfSecond());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    public void testSetTime_RI2() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39278);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fyh3ogub2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetTime_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39278,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fyh3ogub2(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39278);
        __CLR4_4_1u51u51lc8azvug.R.inc(39279);MutableDateTime test = new MutableDateTime(2010, 7, 8, 12, 24, 48, 501);
        __CLR4_4_1u51u51lc8azvug.R.inc(39280);test.setTime(null);  // sets to TEST_TIME_NOW, which has no time part
        __CLR4_4_1u51u51lc8azvug.R.inc(39281);assertEquals(2010, test.getYear());
        __CLR4_4_1u51u51lc8azvug.R.inc(39282);assertEquals(7, test.getMonthOfYear());
        __CLR4_4_1u51u51lc8azvug.R.inc(39283);assertEquals(8, test.getDayOfMonth());
        __CLR4_4_1u51u51lc8azvug.R.inc(39284);assertEquals(new DateTime(TEST_TIME_NOW).getHourOfDay(), test.getHourOfDay());
        __CLR4_4_1u51u51lc8azvug.R.inc(39285);assertEquals(new DateTime(TEST_TIME_NOW).getMinuteOfHour(), test.getMinuteOfHour());
        __CLR4_4_1u51u51lc8azvug.R.inc(39286);assertEquals(new DateTime(TEST_TIME_NOW).getSecondOfMinute(), test.getSecondOfMinute());
        __CLR4_4_1u51u51lc8azvug.R.inc(39287);assertEquals(new DateTime(TEST_TIME_NOW).getMillisOfSecond(), test.getMillisOfSecond());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    public void testSetTime_Object3() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39288);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19v9puvubc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetTime_Object3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39288,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19v9puvubc(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39288);
        __CLR4_4_1u51u51lc8azvug.R.inc(39289);DateTime temp = new DateTime(2010, 12, 3, 5, 7, 9, 11);
        __CLR4_4_1u51u51lc8azvug.R.inc(39290);DateTime setter = new DateTime(temp.getMillis(), new MockNullZoneChronology());
        __CLR4_4_1u51u51lc8azvug.R.inc(39291);MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501);
        __CLR4_4_1u51u51lc8azvug.R.inc(39292);test.setTime(setter);
        __CLR4_4_1u51u51lc8azvug.R.inc(39293);assertEquals(2002, test.getYear());
        __CLR4_4_1u51u51lc8azvug.R.inc(39294);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1u51u51lc8azvug.R.inc(39295);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1u51u51lc8azvug.R.inc(39296);assertEquals(5, test.getHourOfDay());
        __CLR4_4_1u51u51lc8azvug.R.inc(39297);assertEquals(7, test.getMinuteOfHour());
        __CLR4_4_1u51u51lc8azvug.R.inc(39298);assertEquals(9, test.getSecondOfMinute());
        __CLR4_4_1u51u51lc8azvug.R.inc(39299);assertEquals(11, test.getMillisOfSecond());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetDateTime_int_int_int_int_int_int_int1() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18wtfdpubo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDateTime_int_int_int_int_int_int_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39300,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18wtfdpubo(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39300);
        __CLR4_4_1u51u51lc8azvug.R.inc(39301);MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501);
        __CLR4_4_1u51u51lc8azvug.R.inc(39302);test.setDateTime(2010, 12, 3, 5, 6, 7, 8);
        __CLR4_4_1u51u51lc8azvug.R.inc(39303);assertEquals(2010, test.getYear());
        __CLR4_4_1u51u51lc8azvug.R.inc(39304);assertEquals(12, test.getMonthOfYear());
        __CLR4_4_1u51u51lc8azvug.R.inc(39305);assertEquals(3, test.getDayOfMonth());
        __CLR4_4_1u51u51lc8azvug.R.inc(39306);assertEquals(5, test.getHourOfDay());
        __CLR4_4_1u51u51lc8azvug.R.inc(39307);assertEquals(6, test.getMinuteOfHour());
        __CLR4_4_1u51u51lc8azvug.R.inc(39308);assertEquals(7, test.getSecondOfMinute());
        __CLR4_4_1u51u51lc8azvug.R.inc(39309);assertEquals(8, test.getMillisOfSecond());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}
    
    public void testSetDateTime_int_int_int_int_int_int_int2() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c5te66uby();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDateTime_int_int_int_int_int_int_int2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39310,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c5te66uby(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39310);
        __CLR4_4_1u51u51lc8azvug.R.inc(39311);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1u51u51lc8azvug.R.inc(39312);try {
            __CLR4_4_1u51u51lc8azvug.R.inc(39313);test.setDateTime(2010, 13, 3, 5, 6, 7, 8);
            __CLR4_4_1u51u51lc8azvug.R.inc(39314);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1u51u51lc8azvug.R.inc(39315);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetYear_int1() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39316);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16uv1nfuc4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetYear_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39316,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16uv1nfuc4(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39316);
        __CLR4_4_1u51u51lc8azvug.R.inc(39317);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1u51u51lc8azvug.R.inc(39318);test.setYear(2010);
        __CLR4_4_1u51u51lc8azvug.R.inc(39319);assertEquals("2010-06-09T05:06:07.008+01:00", test.toString());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetMonthOfYear_int1() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vwabtwuc8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMonthOfYear_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39320,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vwabtwuc8(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39320);
        __CLR4_4_1u51u51lc8azvug.R.inc(39321);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1u51u51lc8azvug.R.inc(39322);test.setMonthOfYear(12);
        __CLR4_4_1u51u51lc8azvug.R.inc(39323);assertEquals("2002-12-09T05:06:07.008Z", test.toString());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    public void testSetMonthOfYear_int_dstOverlapSummer_addZero() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_177dn3hucc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMonthOfYear_int_dstOverlapSummer_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39324,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_177dn3hucc(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39324);
        __CLR4_4_1u51u51lc8azvug.R.inc(39325);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1u51u51lc8azvug.R.inc(39326);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
        __CLR4_4_1u51u51lc8azvug.R.inc(39327);test.setMonthOfYear(10);
        __CLR4_4_1u51u51lc8azvug.R.inc(39328);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    public void testSetMonthOfYear_int_dstOverlapWinter_addZero() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39329);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19l8a65uch();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMonthOfYear_int_dstOverlapWinter_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39329,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19l8a65uch(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39329);
        __CLR4_4_1u51u51lc8azvug.R.inc(39330);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1u51u51lc8azvug.R.inc(39331);test.addHours(1);
        __CLR4_4_1u51u51lc8azvug.R.inc(39332);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
        __CLR4_4_1u51u51lc8azvug.R.inc(39333);test.setMonthOfYear(10);
        __CLR4_4_1u51u51lc8azvug.R.inc(39334);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    public void testSetMonthOfYear_int2() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39335);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z5aamducn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMonthOfYear_int2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39335,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z5aamducn(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39335);
        __CLR4_4_1u51u51lc8azvug.R.inc(39336);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1u51u51lc8azvug.R.inc(39337);try {
            __CLR4_4_1u51u51lc8azvug.R.inc(39338);test.setMonthOfYear(13);
            __CLR4_4_1u51u51lc8azvug.R.inc(39339);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1u51u51lc8azvug.R.inc(39340);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetDayOfMonth_int1() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39341);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17cs3hnuct();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDayOfMonth_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39341,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17cs3hnuct(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39341);
        __CLR4_4_1u51u51lc8azvug.R.inc(39342);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1u51u51lc8azvug.R.inc(39343);test.setDayOfMonth(17);
        __CLR4_4_1u51u51lc8azvug.R.inc(39344);assertEquals("2002-06-17T05:06:07.008+01:00", test.toString());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    public void testSetDayOfMonth_int2() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1als2a4ucx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDayOfMonth_int2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39345,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1als2a4ucx(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39345);
        __CLR4_4_1u51u51lc8azvug.R.inc(39346);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1u51u51lc8azvug.R.inc(39347);try {
            __CLR4_4_1u51u51lc8azvug.R.inc(39348);test.setDayOfMonth(31);
            __CLR4_4_1u51u51lc8azvug.R.inc(39349);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1u51u51lc8azvug.R.inc(39350);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    public void testSetDayOfMonth_int_dstOverlapSummer_addZero() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39351);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17w72wkud3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDayOfMonth_int_dstOverlapSummer_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39351,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17w72wkud3(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39351);
        __CLR4_4_1u51u51lc8azvug.R.inc(39352);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1u51u51lc8azvug.R.inc(39353);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
        __CLR4_4_1u51u51lc8azvug.R.inc(39354);test.setDayOfMonth(30);
        __CLR4_4_1u51u51lc8azvug.R.inc(39355);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    public void testSetDayOfMonth_int_dstOverlapWinter_addZero() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18weud2ud8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDayOfMonth_int_dstOverlapWinter_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39356,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18weud2ud8(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39356);
        __CLR4_4_1u51u51lc8azvug.R.inc(39357);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1u51u51lc8azvug.R.inc(39358);test.addHours(1);
        __CLR4_4_1u51u51lc8azvug.R.inc(39359);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
        __CLR4_4_1u51u51lc8azvug.R.inc(39360);test.setDayOfMonth(30);
        __CLR4_4_1u51u51lc8azvug.R.inc(39361);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetDayOfYear_int1() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39362);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rpdbjsude();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDayOfYear_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39362,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rpdbjsude(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39362);
        __CLR4_4_1u51u51lc8azvug.R.inc(39363);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1u51u51lc8azvug.R.inc(39364);test.setDayOfYear(3);
        __CLR4_4_1u51u51lc8azvug.R.inc(39365);assertEquals("2002-01-03T05:06:07.008Z", test.toString());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    public void testSetDayOfYear_int_dstOverlapSummer_addZero() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39366);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jra39tudi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDayOfYear_int_dstOverlapSummer_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39366,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jra39tudi(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39366);
        __CLR4_4_1u51u51lc8azvug.R.inc(39367);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1u51u51lc8azvug.R.inc(39368);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
        __CLR4_4_1u51u51lc8azvug.R.inc(39369);test.setDayOfYear(303);
        __CLR4_4_1u51u51lc8azvug.R.inc(39370);assertEquals("2011-10-30T02:30:00.000+02:00", test.toString());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    public void testSetDayOfYear_int_dstOverlapWinter_addZero() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12yo607udn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDayOfYear_int_dstOverlapWinter_addZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39371,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12yo607udn(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39371);
        __CLR4_4_1u51u51lc8azvug.R.inc(39372);MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin"));
        __CLR4_4_1u51u51lc8azvug.R.inc(39373);test.addHours(1);
        __CLR4_4_1u51u51lc8azvug.R.inc(39374);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
        __CLR4_4_1u51u51lc8azvug.R.inc(39375);test.setDayOfYear(303);
        __CLR4_4_1u51u51lc8azvug.R.inc(39376);assertEquals("2011-10-30T02:30:00.000+01:00", test.toString());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    public void testSetDayOfYear_int2() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39377);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ogdcrbudt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDayOfYear_int2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39377,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ogdcrbudt(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39377);
        __CLR4_4_1u51u51lc8azvug.R.inc(39378);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1u51u51lc8azvug.R.inc(39379);try {
            __CLR4_4_1u51u51lc8azvug.R.inc(39380);test.setDayOfYear(366);
            __CLR4_4_1u51u51lc8azvug.R.inc(39381);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1u51u51lc8azvug.R.inc(39382);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetWeekyear_int1() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39383);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wdcbmhudz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetWeekyear_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39383,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wdcbmhudz(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39383);
        __CLR4_4_1u51u51lc8azvug.R.inc(39384);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1u51u51lc8azvug.R.inc(39385);test.setWeekyear(2001);
        __CLR4_4_1u51u51lc8azvug.R.inc(39386);assertEquals("2001-06-10T05:06:07.008+01:00", test.toString());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetWeekOfWeekyear_int1() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39387);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jgj68sue3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetWeekOfWeekyear_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39387,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jgj68sue3(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39387);
        __CLR4_4_1u51u51lc8azvug.R.inc(39388);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1u51u51lc8azvug.R.inc(39389);test.setWeekOfWeekyear(2);
        __CLR4_4_1u51u51lc8azvug.R.inc(39390);assertEquals("2002-01-13T05:06:07.008Z", test.toString());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    public void testSetWeekOfWeekyear_int2() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39391);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mpj519ue7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetWeekOfWeekyear_int2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39391,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mpj519ue7(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39391);
        __CLR4_4_1u51u51lc8azvug.R.inc(39392);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1u51u51lc8azvug.R.inc(39393);try {
            __CLR4_4_1u51u51lc8azvug.R.inc(39394);test.setWeekOfWeekyear(53);
            __CLR4_4_1u51u51lc8azvug.R.inc(39395);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1u51u51lc8azvug.R.inc(39396);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetDayOfWeek_int1() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39397);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15jvob5ued();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDayOfWeek_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39397,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15jvob5ued(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39397);
        __CLR4_4_1u51u51lc8azvug.R.inc(39398);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1u51u51lc8azvug.R.inc(39399);test.setDayOfWeek(5);
        __CLR4_4_1u51u51lc8azvug.R.inc(39400);assertEquals("2002-06-07T05:06:07.008+01:00", test.toString());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    public void testSetDayOfWeek_int2() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39401);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18svn3mueh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetDayOfWeek_int2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39401,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18svn3mueh(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39401);
        __CLR4_4_1u51u51lc8azvug.R.inc(39402);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1u51u51lc8azvug.R.inc(39403);try {
            __CLR4_4_1u51u51lc8azvug.R.inc(39404);test.setDayOfWeek(8);
            __CLR4_4_1u51u51lc8azvug.R.inc(39405);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1u51u51lc8azvug.R.inc(39406);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetHourOfDay_int1() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39407);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14722evuen();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetHourOfDay_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39407,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14722evuen(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39407);
        __CLR4_4_1u51u51lc8azvug.R.inc(39408);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1u51u51lc8azvug.R.inc(39409);test.setHourOfDay(13);
        __CLR4_4_1u51u51lc8azvug.R.inc(39410);assertEquals("2002-06-09T13:06:07.008+01:00", test.toString());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    public void testSetHourOfDay_int2() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39411);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17g217cuer();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetHourOfDay_int2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39411,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17g217cuer(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39411);
        __CLR4_4_1u51u51lc8azvug.R.inc(39412);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1u51u51lc8azvug.R.inc(39413);try {
            __CLR4_4_1u51u51lc8azvug.R.inc(39414);test.setHourOfDay(24);
            __CLR4_4_1u51u51lc8azvug.R.inc(39415);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1u51u51lc8azvug.R.inc(39416);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetMinuteOfHour_int1() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zejqnruex();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMinuteOfHour_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39417,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zejqnruex(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39417);
        __CLR4_4_1u51u51lc8azvug.R.inc(39418);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1u51u51lc8azvug.R.inc(39419);test.setMinuteOfHour(13);
        __CLR4_4_1u51u51lc8azvug.R.inc(39420);assertEquals("2002-06-09T05:13:07.008+01:00", test.toString());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    public void testSetMinuteOfHour_int2() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w5jrvauf1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMinuteOfHour_int2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39421,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w5jrvauf1(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39421);
        __CLR4_4_1u51u51lc8azvug.R.inc(39422);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1u51u51lc8azvug.R.inc(39423);try {
            __CLR4_4_1u51u51lc8azvug.R.inc(39424);test.setMinuteOfHour(60);
            __CLR4_4_1u51u51lc8azvug.R.inc(39425);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1u51u51lc8azvug.R.inc(39426);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetMinuteOfDay_int1() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gbf5spuf7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMinuteOfDay_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39427,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gbf5spuf7(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39427);
        __CLR4_4_1u51u51lc8azvug.R.inc(39428);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1u51u51lc8azvug.R.inc(39429);test.setMinuteOfDay(13);
        __CLR4_4_1u51u51lc8azvug.R.inc(39430);assertEquals("2002-06-09T00:13:07.008+01:00", test.toString());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    public void testSetMinuteOfDay_int2() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d2f708ufb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMinuteOfDay_int2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39431,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d2f708ufb(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39431);
        __CLR4_4_1u51u51lc8azvug.R.inc(39432);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1u51u51lc8azvug.R.inc(39433);try {
            __CLR4_4_1u51u51lc8azvug.R.inc(39434);test.setMinuteOfDay(24 * 60);
            __CLR4_4_1u51u51lc8azvug.R.inc(39435);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1u51u51lc8azvug.R.inc(39436);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetSecondOfMinute_int1() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39437);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hlcpzbufh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetSecondOfMinute_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39437,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hlcpzbufh(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39437);
        __CLR4_4_1u51u51lc8azvug.R.inc(39438);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1u51u51lc8azvug.R.inc(39439);test.setSecondOfMinute(13);
        __CLR4_4_1u51u51lc8azvug.R.inc(39440);assertEquals("2002-06-09T05:06:13.008+01:00", test.toString());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    public void testSetSecondOfMinute_int2() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39441);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eccr6uufl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetSecondOfMinute_int2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39441,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eccr6uufl(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39441);
        __CLR4_4_1u51u51lc8azvug.R.inc(39442);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1u51u51lc8azvug.R.inc(39443);try {
            __CLR4_4_1u51u51lc8azvug.R.inc(39444);test.setSecondOfMinute(60);
            __CLR4_4_1u51u51lc8azvug.R.inc(39445);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1u51u51lc8azvug.R.inc(39446);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetSecondOfDay_int1() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ap89qfufr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetSecondOfDay_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39447,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ap89qfufr(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39447);
        __CLR4_4_1u51u51lc8azvug.R.inc(39448);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1u51u51lc8azvug.R.inc(39449);test.setSecondOfDay(13);
        __CLR4_4_1u51u51lc8azvug.R.inc(39450);assertEquals("2002-06-09T00:00:13.008+01:00", test.toString());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    public void testSetSecondOfDay_int2() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dy88iwufv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetSecondOfDay_int2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39451,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dy88iwufv(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39451);
        __CLR4_4_1u51u51lc8azvug.R.inc(39452);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1u51u51lc8azvug.R.inc(39453);try {
            __CLR4_4_1u51u51lc8azvug.R.inc(39454);test.setSecondOfDay(24 * 60 * 60);
            __CLR4_4_1u51u51lc8azvug.R.inc(39455);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1u51u51lc8azvug.R.inc(39456);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetMilliOfSecond_int1() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39457);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15cwvc0ug1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMilliOfSecond_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39457,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15cwvc0ug1(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39457);
        __CLR4_4_1u51u51lc8azvug.R.inc(39458);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1u51u51lc8azvug.R.inc(39459);test.setMillisOfSecond(13);
        __CLR4_4_1u51u51lc8azvug.R.inc(39460);assertEquals("2002-06-09T05:06:07.013+01:00", test.toString());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    public void testSetMilliOfSecond_int2() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39461);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18lwu4hug5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMilliOfSecond_int2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39461,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18lwu4hug5(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39461);
        __CLR4_4_1u51u51lc8azvug.R.inc(39462);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1u51u51lc8azvug.R.inc(39463);try {
            __CLR4_4_1u51u51lc8azvug.R.inc(39464);test.setMillisOfSecond(1000);
            __CLR4_4_1u51u51lc8azvug.R.inc(39465);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1u51u51lc8azvug.R.inc(39466);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSetMilliOfDay_int1() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_155v9i8ugb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMilliOfDay_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39467,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_155v9i8ugb(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39467);
        __CLR4_4_1u51u51lc8azvug.R.inc(39468);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1u51u51lc8azvug.R.inc(39469);test.setMillisOfDay(13);
        __CLR4_4_1u51u51lc8azvug.R.inc(39470);assertEquals("2002-06-09T00:00:00.013+01:00", test.toString());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

    public void testSetMilliOfDay_int2() {__CLR4_4_1u51u51lc8azvug.R.globalSliceStart(getClass().getName(),39471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11wvaprugf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u51u51lc8azvug.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u51u51lc8azvug.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Sets.testSetMilliOfDay_int2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39471,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11wvaprugf(){try{__CLR4_4_1u51u51lc8azvug.R.inc(39471);
        __CLR4_4_1u51u51lc8azvug.R.inc(39472);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1u51u51lc8azvug.R.inc(39473);try {
            __CLR4_4_1u51u51lc8azvug.R.inc(39474);test.setMillisOfDay(24 * 60 * 60 * 1000);
            __CLR4_4_1u51u51lc8azvug.R.inc(39475);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1u51u51lc8azvug.R.inc(39476);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString());
    }finally{__CLR4_4_1u51u51lc8azvug.R.flushNeeded();}}

}
