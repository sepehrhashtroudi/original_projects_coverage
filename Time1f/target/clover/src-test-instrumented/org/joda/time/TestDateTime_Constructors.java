/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2010 Stephen Colebourne
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

import java.util.Date;
import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.MockZeroNullIntegerConverter;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for DateTime.
 *
 * @author Stephen Colebourne
 */
public class TestDateTime_Constructors extends TestCase {static class __CLR4_4_1kllklllc8azuki{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,27083,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
        
    private DateTimeZone zone = null;
    private Locale locale = null;

    public static void main(String[] args) {try{__CLR4_4_1kllklllc8azuki.R.inc(26697);
        __CLR4_4_1kllklllc8azuki.R.inc(26698);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1kllklllc8azuki.R.inc(26699);
        __CLR4_4_1kllklllc8azuki.R.inc(26700);return new TestSuite(TestDateTime_Constructors.class);
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    public TestDateTime_Constructors(String name) {
        super(name);__CLR4_4_1kllklllc8azuki.R.inc(26702);try{__CLR4_4_1kllklllc8azuki.R.inc(26701);
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1kllklllc8azuki.R.inc(26703);
        __CLR4_4_1kllklllc8azuki.R.inc(26704);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1kllklllc8azuki.R.inc(26705);zone = DateTimeZone.getDefault();
        __CLR4_4_1kllklllc8azuki.R.inc(26706);locale = Locale.getDefault();
        __CLR4_4_1kllklllc8azuki.R.inc(26707);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1kllklllc8azuki.R.inc(26708);java.util.TimeZone.setDefault(LONDON.toTimeZone());
        __CLR4_4_1kllklllc8azuki.R.inc(26709);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1kllklllc8azuki.R.inc(26710);
        __CLR4_4_1kllklllc8azuki.R.inc(26711);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1kllklllc8azuki.R.inc(26712);DateTimeZone.setDefault(zone);
        __CLR4_4_1kllklllc8azuki.R.inc(26713);java.util.TimeZone.setDefault(zone.toTimeZone());
        __CLR4_4_1kllklllc8azuki.R.inc(26714);Locale.setDefault(locale);
        __CLR4_4_1kllklllc8azuki.R.inc(26715);zone = null;
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testTest() {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26716);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqjkm4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26716,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqjkm4(){try{__CLR4_4_1kllklllc8azuki.R.inc(26716);
        __CLR4_4_1kllklllc8azuki.R.inc(26717);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
        __CLR4_4_1kllklllc8azuki.R.inc(26718);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        __CLR4_4_1kllklllc8azuki.R.inc(26719);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test now ()
     */
    public void test_now() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26720);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16qxg0km8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.test_now",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26720,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16qxg0km8() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26720);
        __CLR4_4_1kllklllc8azuki.R.inc(26721);DateTime test = DateTime.now();
        __CLR4_4_1kllklllc8azuki.R.inc(26722);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(26723);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    /**
     * Test now (DateTimeZone)
     */
    public void test_now_DateTimeZone() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26724);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yqbptokmc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.test_now_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26724,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yqbptokmc() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26724);
        __CLR4_4_1kllklllc8azuki.R.inc(26725);DateTime test = DateTime.now(PARIS);
        __CLR4_4_1kllklllc8azuki.R.inc(26726);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(26727);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    /**
     * Test now (DateTimeZone=null)
     */
    public void test_now_nullDateTimeZone() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26728);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1odm0k5kmg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.test_now_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26728,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1odm0k5kmg() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26728);
        __CLR4_4_1kllklllc8azuki.R.inc(26729);try {
            __CLR4_4_1kllklllc8azuki.R.inc(26730);DateTime.now((DateTimeZone) null);
            __CLR4_4_1kllklllc8azuki.R.inc(26731);fail();
        } catch (NullPointerException ex) {}
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    /**
     * Test now (Chronology)
     */
    public void test_now_Chronology() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26732);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16n9ve3kmk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.test_now_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26732,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16n9ve3kmk() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26732);
        __CLR4_4_1kllklllc8azuki.R.inc(26733);DateTime test = DateTime.now(GregorianChronology.getInstance());
        __CLR4_4_1kllklllc8azuki.R.inc(26734);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(26735);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    /**
     * Test now (Chronology=null)
     */
    public void test_now_nullChronology() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ge4g1wkmo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.test_now_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26736,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ge4g1wkmo() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26736);
        __CLR4_4_1kllklllc8azuki.R.inc(26737);try {
            __CLR4_4_1kllklllc8azuki.R.inc(26738);DateTime.now((Chronology) null);
            __CLR4_4_1kllklllc8azuki.R.inc(26739);fail();
        } catch (NullPointerException ex) {}
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testParse_noFormatter() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26740);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o2oqvikms();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testParse_noFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26740,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o2oqvikms() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26740);
        __CLR4_4_1kllklllc8azuki.R.inc(26741);assertEquals(new DateTime(2010, 6, 30, 1, 20, ISOChronology.getInstance(DateTimeZone.forOffsetHours(2))), DateTime.parse("2010-06-30T01:20+02:00"));
        __CLR4_4_1kllklllc8azuki.R.inc(26742);assertEquals(new DateTime(2010, 1, 2, 14, 50, ISOChronology.getInstance(LONDON)), DateTime.parse("2010-002T14:50"));
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    public void testParse_formatter() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15wvtnxkmv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testParse_formatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26743,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15wvtnxkmv() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26743);
        __CLR4_4_1kllklllc8azuki.R.inc(26744);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy--dd MM HH").withChronology(ISOChronology.getInstance(PARIS));
        __CLR4_4_1kllklllc8azuki.R.inc(26745);assertEquals(new DateTime(2010, 6, 30, 13, 0, ISOChronology.getInstance(PARIS)), DateTime.parse("2010--30 06 13", f));
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */
    public void testConstructor() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26746);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uefs8hkmy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26746,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uefs8hkmy() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26746);
        __CLR4_4_1kllklllc8azuki.R.inc(26747);DateTime test = new DateTime();
        __CLR4_4_1kllklllc8azuki.R.inc(26748);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(26749);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    /**
     * Test constructor (DateTimeZone)
     */
    public void testConstructor_DateTimeZone() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26750);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z4m1k5kn2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26750,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z4m1k5kn2() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26750);
        __CLR4_4_1kllklllc8azuki.R.inc(26751);DateTime test = new DateTime(PARIS);
        __CLR4_4_1kllklllc8azuki.R.inc(26752);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(26753);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    /**
     * Test constructor (DateTimeZone=null)
     */
    public void testConstructor_nullDateTimeZone() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26754);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17zs1rokn6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26754,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17zs1rokn6() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26754);
        __CLR4_4_1kllklllc8azuki.R.inc(26755);DateTime test = new DateTime((DateTimeZone) null);
        __CLR4_4_1kllklllc8azuki.R.inc(26756);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(26757);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    /**
     * Test constructor (Chronology)
     */
    public void testConstructor_Chronology() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15931tikna();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26758,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15931tikna() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26758);
        __CLR4_4_1kllklllc8azuki.R.inc(26759);DateTime test = new DateTime(GregorianChronology.getInstance());
        __CLR4_4_1kllklllc8azuki.R.inc(26760);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(26761);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    /**
     * Test constructor (Chronology=null)
     */
    public void testConstructor_nullChronology() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26762);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15qcb6rkne();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26762,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15qcb6rkne() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26762);
        __CLR4_4_1kllklllc8azuki.R.inc(26763);DateTime test = new DateTime((Chronology) null);
        __CLR4_4_1kllklllc8azuki.R.inc(26764);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(26765);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor (long)
     */
    public void testConstructor_long1() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26766);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wi13crkni();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26766,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wi13crkni() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26766);
        __CLR4_4_1kllklllc8azuki.R.inc(26767);DateTime test = new DateTime(TEST_TIME1);
        __CLR4_4_1kllklllc8azuki.R.inc(26768);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(26769);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    /**
     * Test constructor (long)
     */
    public void testConstructor_long2() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t914kaknm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26770,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t914kaknm() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26770);
        __CLR4_4_1kllklllc8azuki.R.inc(26771);DateTime test = new DateTime(TEST_TIME2);
        __CLR4_4_1kllklllc8azuki.R.inc(26772);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(26773);assertEquals(TEST_TIME2, test.getMillis());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    /**
     * Test constructor (long, DateTimeZone)
     */
    public void testConstructor_long1_DateTimeZone() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26774);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mej2a9knq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_long1_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26774,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mej2a9knq() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26774);
        __CLR4_4_1kllklllc8azuki.R.inc(26775);DateTime test = new DateTime(TEST_TIME1, PARIS);
        __CLR4_4_1kllklllc8azuki.R.inc(26776);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(26777);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    /**
     * Test constructor (long, DateTimeZone)
     */
    public void testConstructor_long2_DateTimeZone() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s1hd9qknu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_long2_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26778,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s1hd9qknu() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26778);
        __CLR4_4_1kllklllc8azuki.R.inc(26779);DateTime test = new DateTime(TEST_TIME2, PARIS);
        __CLR4_4_1kllklllc8azuki.R.inc(26780);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(26781);assertEquals(TEST_TIME2, test.getMillis());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    /**
     * Test constructor (long, DateTimeZone=null)
     */
    public void testConstructor_long_nullDateTimeZone() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26782);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uv35a9kny();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_long_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26782,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uv35a9kny() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26782);
        __CLR4_4_1kllklllc8azuki.R.inc(26783);DateTime test = new DateTime(TEST_TIME1, (DateTimeZone) null);
        __CLR4_4_1kllklllc8azuki.R.inc(26784);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(26785);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    /**
     * Test constructor (long, Chronology)
     */
    public void testConstructor_long1_Chronology() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26786);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_115wn5sko2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_long1_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26786,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_115wn5sko2() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26786);
        __CLR4_4_1kllklllc8azuki.R.inc(26787);DateTime test = new DateTime(TEST_TIME1, GregorianChronology.getInstance());
        __CLR4_4_1kllklllc8azuki.R.inc(26788);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(26789);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    /**
     * Test constructor (long, Chronology)
     */
    public void testConstructor_long2_Chronology() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26790);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14nqmkhko6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_long2_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26790,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14nqmkhko6() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26790);
        __CLR4_4_1kllklllc8azuki.R.inc(26791);DateTime test = new DateTime(TEST_TIME2, GregorianChronology.getInstance());
        __CLR4_4_1kllklllc8azuki.R.inc(26792);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(26793);assertEquals(TEST_TIME2, test.getMillis());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    /**
     * Test constructor (long, Chronology=null)
     */
    public void testConstructor_long_nullChronology() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nnhckukoa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_long_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26794,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nnhckukoa() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26794);
        __CLR4_4_1kllklllc8azuki.R.inc(26795);DateTime test = new DateTime(TEST_TIME1, (Chronology) null);
        __CLR4_4_1kllklllc8azuki.R.inc(26796);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(26797);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object)
     */
    public void testConstructor_Object() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26798);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eplcebkoe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_Object",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26798,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eplcebkoe() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26798);
        __CLR4_4_1kllklllc8azuki.R.inc(26799);Date date = new Date(TEST_TIME1);
        __CLR4_4_1kllklllc8azuki.R.inc(26800);DateTime test = new DateTime(date);
        __CLR4_4_1kllklllc8azuki.R.inc(26801);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(26802);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    /**
     * Test constructor (Object)
     */
    public void testConstructor_invalidObject() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x7unaykoj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_invalidObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26803,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x7unaykoj() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26803);
        __CLR4_4_1kllklllc8azuki.R.inc(26804);try {
            __CLR4_4_1kllklllc8azuki.R.inc(26805);new DateTime(new Object());
            __CLR4_4_1kllklllc8azuki.R.inc(26806);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    /**
     * Test constructor (Object=null)
     */
    public void testConstructor_nullObject() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lt59ukkon();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_nullObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26807,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lt59ukkon() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26807);
        __CLR4_4_1kllklllc8azuki.R.inc(26808);DateTime test = new DateTime((Object) null);
        __CLR4_4_1kllklllc8azuki.R.inc(26809);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(26810);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    /**
     * Test constructor (Object=null)
     */
    public void testConstructor_badconverterObject() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1opptygkor();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_badconverterObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26811,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1opptygkor() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26811);
        __CLR4_4_1kllklllc8azuki.R.inc(26812);try {
            __CLR4_4_1kllklllc8azuki.R.inc(26813);ConverterManager.getInstance().addInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
            __CLR4_4_1kllklllc8azuki.R.inc(26814);DateTime test = new DateTime(new Integer(0));
            __CLR4_4_1kllklllc8azuki.R.inc(26815);assertEquals(ISOChronology.getInstance(), test.getChronology());
            __CLR4_4_1kllklllc8azuki.R.inc(26816);assertEquals(0L, test.getMillis());
        } finally {
            __CLR4_4_1kllklllc8azuki.R.inc(26817);ConverterManager.getInstance().removeInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
        }
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    public void testConstructor_ObjectString1() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26818);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11c2b5dkoy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_ObjectString1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26818,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11c2b5dkoy() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26818);
        __CLR4_4_1kllklllc8azuki.R.inc(26819);DateTime test = new DateTime("1972-12-03");
        __CLR4_4_1kllklllc8azuki.R.inc(26820);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(26821);assertEquals(1972, test.getYear());
        __CLR4_4_1kllklllc8azuki.R.inc(26822);assertEquals(12, test.getMonthOfYear());
        __CLR4_4_1kllklllc8azuki.R.inc(26823);assertEquals(3, test.getDayOfMonth());
        __CLR4_4_1kllklllc8azuki.R.inc(26824);assertEquals(0, test.getHourOfDay());
        __CLR4_4_1kllklllc8azuki.R.inc(26825);assertEquals(0, test.getMinuteOfHour());
        __CLR4_4_1kllklllc8azuki.R.inc(26826);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1kllklllc8azuki.R.inc(26827);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    public void testConstructor_ObjectString2() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26828);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14l29xukp8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_ObjectString2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26828,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14l29xukp8() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26828);
        __CLR4_4_1kllklllc8azuki.R.inc(26829);DateTime test = new DateTime("2006-06-03T+14:00");
        __CLR4_4_1kllklllc8azuki.R.inc(26830);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(26831);assertEquals(2006, test.getYear());
        __CLR4_4_1kllklllc8azuki.R.inc(26832);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1kllklllc8azuki.R.inc(26833);assertEquals(2, test.getDayOfMonth());  // timezone
        __CLR4_4_1kllklllc8azuki.R.inc(26834);assertEquals(11, test.getHourOfDay());  // test zone is +1, so shift back (14 - 1) hours from midnight
        __CLR4_4_1kllklllc8azuki.R.inc(26835);assertEquals(0, test.getMinuteOfHour());
        __CLR4_4_1kllklllc8azuki.R.inc(26836);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1kllklllc8azuki.R.inc(26837);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    public void testConstructor_ObjectString3() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26838);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17u28qbkpi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_ObjectString3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26838,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17u28qbkpi() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26838);
        __CLR4_4_1kllklllc8azuki.R.inc(26839);DateTime test = new DateTime("1972-12-03T10:20:30.040");
        __CLR4_4_1kllklllc8azuki.R.inc(26840);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(26841);assertEquals(1972, test.getYear());
        __CLR4_4_1kllklllc8azuki.R.inc(26842);assertEquals(12, test.getMonthOfYear());
        __CLR4_4_1kllklllc8azuki.R.inc(26843);assertEquals(3, test.getDayOfMonth());
        __CLR4_4_1kllklllc8azuki.R.inc(26844);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1kllklllc8azuki.R.inc(26845);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1kllklllc8azuki.R.inc(26846);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1kllklllc8azuki.R.inc(26847);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    public void testConstructor_ObjectString4() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26848);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b327iskps();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_ObjectString4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26848,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b327iskps() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26848);
        __CLR4_4_1kllklllc8azuki.R.inc(26849);DateTime test = new DateTime("2006-06-03T10:20:30.040+14:00");
        __CLR4_4_1kllklllc8azuki.R.inc(26850);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(26851);assertEquals(2006, test.getYear());
        __CLR4_4_1kllklllc8azuki.R.inc(26852);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1kllklllc8azuki.R.inc(26853);assertEquals(2, test.getDayOfMonth());  // timezone
        __CLR4_4_1kllklllc8azuki.R.inc(26854);assertEquals(21, test.getHourOfDay());  // test zone is +1, so shift back (14 - 1) hours from 10am
        __CLR4_4_1kllklllc8azuki.R.inc(26855);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1kllklllc8azuki.R.inc(26856);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1kllklllc8azuki.R.inc(26857);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    public void testConstructor_ObjectString5() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ec26b9kq2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_ObjectString5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26858,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ec26b9kq2() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26858);
        __CLR4_4_1kllklllc8azuki.R.inc(26859);DateTime test = new DateTime("T10:20:30.040");
        __CLR4_4_1kllklllc8azuki.R.inc(26860);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(26861);assertEquals(1970, test.getYear());
        __CLR4_4_1kllklllc8azuki.R.inc(26862);assertEquals(1, test.getMonthOfYear());
        __CLR4_4_1kllklllc8azuki.R.inc(26863);assertEquals(1, test.getDayOfMonth());
        __CLR4_4_1kllklllc8azuki.R.inc(26864);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1kllklllc8azuki.R.inc(26865);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1kllklllc8azuki.R.inc(26866);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1kllklllc8azuki.R.inc(26867);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    public void testConstructor_ObjectString6() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26868);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hl253qkqc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_ObjectString6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26868,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hl253qkqc() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26868);
        __CLR4_4_1kllklllc8azuki.R.inc(26869);DateTime test = new DateTime("T10:20:30.040+14:00");
        __CLR4_4_1kllklllc8azuki.R.inc(26870);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(26871);assertEquals(1969, test.getYear());  // timezone
        __CLR4_4_1kllklllc8azuki.R.inc(26872);assertEquals(12, test.getMonthOfYear());  // timezone
        __CLR4_4_1kllklllc8azuki.R.inc(26873);assertEquals(31, test.getDayOfMonth());  // timezone
        __CLR4_4_1kllklllc8azuki.R.inc(26874);assertEquals(21, test.getHourOfDay());  // test zone is +1, so shift back (14 - 1) hours from 10am
        __CLR4_4_1kllklllc8azuki.R.inc(26875);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1kllklllc8azuki.R.inc(26876);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1kllklllc8azuki.R.inc(26877);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    public void testConstructor_ObjectString7() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26878);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ku23w7kqm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_ObjectString7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26878,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ku23w7kqm() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26878);
        __CLR4_4_1kllklllc8azuki.R.inc(26879);DateTime test = new DateTime("10");
        __CLR4_4_1kllklllc8azuki.R.inc(26880);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(26881);assertEquals(10, test.getYear());
        __CLR4_4_1kllklllc8azuki.R.inc(26882);assertEquals(1, test.getMonthOfYear());
        __CLR4_4_1kllklllc8azuki.R.inc(26883);assertEquals(1, test.getDayOfMonth());
        __CLR4_4_1kllklllc8azuki.R.inc(26884);assertEquals(0, test.getHourOfDay());
        __CLR4_4_1kllklllc8azuki.R.inc(26885);assertEquals(0, test.getMinuteOfHour());
        __CLR4_4_1kllklllc8azuki.R.inc(26886);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1kllklllc8azuki.R.inc(26887);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    public void testConstructor_ObjectStringEx1() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26888);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11daulekqw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_ObjectStringEx1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26888,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11daulekqw() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26888);
        __CLR4_4_1kllklllc8azuki.R.inc(26889);try {
            __CLR4_4_1kllklllc8azuki.R.inc(26890);new DateTime("10:20:30.040");
            __CLR4_4_1kllklllc8azuki.R.inc(26891);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    public void testConstructor_ObjectStringEx2() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26892);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11vp473kr0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_ObjectStringEx2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26892,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11vp473kr0() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26892);
        __CLR4_4_1kllklllc8azuki.R.inc(26893);try {
            __CLR4_4_1kllklllc8azuki.R.inc(26894);new DateTime("10:20:30.040+14:00");
            __CLR4_4_1kllklllc8azuki.R.inc(26895);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object, DateTimeZone)
     */
    public void testConstructor_Object_DateTimeZone() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26896);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pk74vrkr4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_Object_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26896,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pk74vrkr4() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26896);
        __CLR4_4_1kllklllc8azuki.R.inc(26897);Date date = new Date(TEST_TIME1);
        __CLR4_4_1kllklllc8azuki.R.inc(26898);DateTime test = new DateTime(date, PARIS);
        __CLR4_4_1kllklllc8azuki.R.inc(26899);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(26900);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    /**
     * Test constructor (Object, DateTimeZone)
     */
    public void testConstructor_invalidObject_DateTimeZone() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26901);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1un7r02kr9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_invalidObject_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26901,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1un7r02kr9() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26901);
        __CLR4_4_1kllklllc8azuki.R.inc(26902);try {
            __CLR4_4_1kllklllc8azuki.R.inc(26903);new DateTime(new Object(), PARIS);
            __CLR4_4_1kllklllc8azuki.R.inc(26904);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    /**
     * Test constructor (Object=null, DateTimeZone)
     */
    public void testConstructor_nullObject_DateTimeZone() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wxoowgkrd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_nullObject_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26905,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wxoowgkrd() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26905);
        __CLR4_4_1kllklllc8azuki.R.inc(26906);DateTime test = new DateTime((Object) null, PARIS);
        __CLR4_4_1kllklllc8azuki.R.inc(26907);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(26908);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    /**
     * Test constructor (Object, DateTimeZone=null)
     */
    public void testConstructor_Object_nullDateTimeZone() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26909);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_151w5y6krh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_Object_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26909,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_151w5y6krh() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26909);
        __CLR4_4_1kllklllc8azuki.R.inc(26910);Date date = new Date(TEST_TIME1);
        __CLR4_4_1kllklllc8azuki.R.inc(26911);DateTime test = new DateTime(date, (DateTimeZone) null);
        __CLR4_4_1kllklllc8azuki.R.inc(26912);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(26913);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    /**
     * Test constructor (Object=null, DateTimeZone=null)
     */
    public void testConstructor_nullObject_nullDateTimeZone() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hv60h5krm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_nullObject_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26914,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hv60h5krm() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26914);
        __CLR4_4_1kllklllc8azuki.R.inc(26915);DateTime test = new DateTime((Object) null, (DateTimeZone) null);
        __CLR4_4_1kllklllc8azuki.R.inc(26916);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(26917);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    /**
     * Test constructor (Object, DateTimeZone)
     */
    public void testConstructor_badconverterObject_DateTimeZone() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bp24vwkrq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_badconverterObject_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26918,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bp24vwkrq() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26918);
        __CLR4_4_1kllklllc8azuki.R.inc(26919);try {
            __CLR4_4_1kllklllc8azuki.R.inc(26920);ConverterManager.getInstance().addInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
            __CLR4_4_1kllklllc8azuki.R.inc(26921);DateTime test = new DateTime(new Integer(0), GregorianChronology.getInstance());
            __CLR4_4_1kllklllc8azuki.R.inc(26922);assertEquals(ISOChronology.getInstance(), test.getChronology());
            __CLR4_4_1kllklllc8azuki.R.inc(26923);assertEquals(0L, test.getMillis());
        } finally {
            __CLR4_4_1kllklllc8azuki.R.inc(26924);ConverterManager.getInstance().removeInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
        }
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    /**
     * Test constructor (Object, Chronology)
     */
    public void testConstructor_Object_Chronology() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26925);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vmnvd4krx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26925,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vmnvd4krx() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26925);
        __CLR4_4_1kllklllc8azuki.R.inc(26926);Date date = new Date(TEST_TIME1);
        __CLR4_4_1kllklllc8azuki.R.inc(26927);DateTime test = new DateTime(date, GregorianChronology.getInstance());
        __CLR4_4_1kllklllc8azuki.R.inc(26928);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(26929);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    /**
     * Test constructor (Object, Chronology)
     */
    public void testConstructor_invalidObject_Chronology() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26930);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fl36oxks2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_invalidObject_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26930,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fl36oxks2() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26930);
        __CLR4_4_1kllklllc8azuki.R.inc(26931);try {
            __CLR4_4_1kllklllc8azuki.R.inc(26932);new DateTime(new Object(), GregorianChronology.getInstance());
            __CLR4_4_1kllklllc8azuki.R.inc(26933);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    /**
     * Test constructor (Object=null, Chronology)
     */
    public void testConstructor_nullObject_Chronology() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26934);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14q0uynks6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_nullObject_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26934,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14q0uynks6() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26934);
        __CLR4_4_1kllklllc8azuki.R.inc(26935);DateTime test = new DateTime((Object) null, GregorianChronology.getInstance());
        __CLR4_4_1kllklllc8azuki.R.inc(26936);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(26937);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    /**
     * Test constructor (Object, Chronology=null)
     */
    public void testConstructor_Object_nullChronology() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26938);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yccijzksa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_Object_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26938,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yccijzksa() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26938);
        __CLR4_4_1kllklllc8azuki.R.inc(26939);Date date = new Date(TEST_TIME1);
        __CLR4_4_1kllklllc8azuki.R.inc(26940);DateTime test = new DateTime(date, (Chronology) null);
        __CLR4_4_1kllklllc8azuki.R.inc(26941);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(26942);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    /**
     * Test constructor (Object=null, Chronology=null)
     */
    public void testConstructor_nullObject_nullChronology() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26943);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14dtve0ksf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_nullObject_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26943,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14dtve0ksf() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26943);
        __CLR4_4_1kllklllc8azuki.R.inc(26944);DateTime test = new DateTime((Object) null, (Chronology) null);
        __CLR4_4_1kllklllc8azuki.R.inc(26945);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(26946);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    /**
     * Test constructor (Object, Chronology)
     */
    public void testConstructor_badconverterObject_Chronology() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26947);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pyoqybksj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_badconverterObject_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26947,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pyoqybksj() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26947);
        __CLR4_4_1kllklllc8azuki.R.inc(26948);try {
            __CLR4_4_1kllklllc8azuki.R.inc(26949);ConverterManager.getInstance().addInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
            __CLR4_4_1kllklllc8azuki.R.inc(26950);DateTime test = new DateTime(new Integer(0), GregorianChronology.getInstance());
            __CLR4_4_1kllklllc8azuki.R.inc(26951);assertEquals(ISOChronology.getInstance(), test.getChronology());
            __CLR4_4_1kllklllc8azuki.R.inc(26952);assertEquals(0L, test.getMillis());
        } finally {
            __CLR4_4_1kllklllc8azuki.R.inc(26953);ConverterManager.getInstance().removeInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
        }
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor (int, int, int, int, int)
     */
    public void testConstructor_int_int_int_int_int() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14wtbr5ksq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_int_int_int_int_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26954,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14wtbr5ksq() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26954);
        __CLR4_4_1kllklllc8azuki.R.inc(26955);DateTime test = new DateTime(2002, 6, 9, 1, 0);  // +01:00
        __CLR4_4_1kllklllc8azuki.R.inc(26956);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(26957);assertEquals(LONDON, test.getZone());
        __CLR4_4_1kllklllc8azuki.R.inc(26958);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, int, int, DateTimeZone)
     */
    public void testConstructor_int_int_int_int_int_DateTimeZone() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26959);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bpglf9ksv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_int_int_int_int_int_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26959,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bpglf9ksv() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26959);
        __CLR4_4_1kllklllc8azuki.R.inc(26960);DateTime test = new DateTime(2002, 6, 9, 2, 0, PARIS);  // +02:00
        __CLR4_4_1kllklllc8azuki.R.inc(26961);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(26962);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, int, int, DateTimeZone=null)
     */
    public void testConstructor_int_int_int_int_int_nullDateTimeZone() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26963);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iltt0cksz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_int_int_int_int_int_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26963,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iltt0cksz() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26963);
        __CLR4_4_1kllklllc8azuki.R.inc(26964);DateTime test = new DateTime(2002, 6, 9, 1, 0, (DateTimeZone) null);  // +01:00
        __CLR4_4_1kllklllc8azuki.R.inc(26965);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(26966);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, int, int, Chronology)
     */
    public void testConstructor_int_int_int_int_int_Chronology() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26967);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1paqltmkt3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_int_int_int_int_int_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26967,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1paqltmkt3() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26967);
        __CLR4_4_1kllklllc8azuki.R.inc(26968);DateTime test = new DateTime(2002, 6, 9, 1, 0, GregorianChronology.getInstance());  // +01:00
        __CLR4_4_1kllklllc8azuki.R.inc(26969);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(26970);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, int, int, Chronology=null)
     */
    public void testConstructor_int_int_int_int_int_nullChronology() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13lxch9kt7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_int_int_int_int_int_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26971,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13lxch9kt7() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26971);
        __CLR4_4_1kllklllc8azuki.R.inc(26972);DateTime test = new DateTime(2002, 6, 9, 1, 0, (Chronology) null);  // +01:00
        __CLR4_4_1kllklllc8azuki.R.inc(26973);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(26974);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor (int, int, int, int, int, int)
     */
    public void testConstructor_int_int_int_int_int_int() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26975);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tj7janktb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_int_int_int_int_int_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26975,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tj7janktb() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26975);
        __CLR4_4_1kllklllc8azuki.R.inc(26976);DateTime test = new DateTime(2002, 6, 9, 1, 0, 0);  // +01:00
        __CLR4_4_1kllklllc8azuki.R.inc(26977);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(26978);assertEquals(LONDON, test.getZone());
        __CLR4_4_1kllklllc8azuki.R.inc(26979);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, int, int, int, DateTimeZone)
     */
    public void testConstructor_int_int_int_int_int_int_DateTimeZone() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26980);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hk51dxktg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_int_int_int_int_int_int_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26980,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hk51dxktg() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26980);
        __CLR4_4_1kllklllc8azuki.R.inc(26981);DateTime test = new DateTime(2002, 6, 9, 2, 0, 0, PARIS);  // +02:00
        __CLR4_4_1kllklllc8azuki.R.inc(26982);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(26983);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, int, int, int, DateTimeZone=null)
     */
    public void testConstructor_int_int_int_int_int_int_nullDateTimeZone() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26984);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rzpiqcktk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_int_int_int_int_int_int_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26984,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rzpiqcktk() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26984);
        __CLR4_4_1kllklllc8azuki.R.inc(26985);DateTime test = new DateTime(2002, 6, 9, 1, 0, 0, (DateTimeZone) null);  // +01:00
        __CLR4_4_1kllklllc8azuki.R.inc(26986);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(26987);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, int, int, int, Chronology)
     */
    public void testConstructor_int_int_int_int_int_int_Chronology() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26988);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w5zd4akto();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_int_int_int_int_int_int_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26988,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w5zd4akto() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26988);
        __CLR4_4_1kllklllc8azuki.R.inc(26989);DateTime test = new DateTime(2002, 6, 9, 1, 0, 0, GregorianChronology.getInstance());  // +01:00
        __CLR4_4_1kllklllc8azuki.R.inc(26990);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(26991);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, int, int, int, Chronology=null)
     */
    public void testConstructor_int_int_int_int_int_int_nullChronology() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26992);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g4j4u5kts();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_int_int_int_int_int_int_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26992,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g4j4u5kts() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26992);
        __CLR4_4_1kllklllc8azuki.R.inc(26993);DateTime test = new DateTime(2002, 6, 9, 1, 0, 0, (Chronology) null);  // +01:00
        __CLR4_4_1kllklllc8azuki.R.inc(26994);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(26995);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor (int, int, int)
     */
    public void testConstructor_int_int_int_int_int_int_int() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),26996);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ofcjttktw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_int_int_int_int_int_int_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26996,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ofcjttktw() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(26996);
        __CLR4_4_1kllklllc8azuki.R.inc(26997);DateTime test = new DateTime(2002, 6, 9, 1, 0, 0, 0);  // +01:00
        __CLR4_4_1kllklllc8azuki.R.inc(26998);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(26999);assertEquals(LONDON, test.getZone());
        __CLR4_4_1kllklllc8azuki.R.inc(27000);assertEquals(TEST_TIME_NOW, test.getMillis());
        __CLR4_4_1kllklllc8azuki.R.inc(27001);try {
            __CLR4_4_1kllklllc8azuki.R.inc(27002);new DateTime(Integer.MIN_VALUE, 6, 9, 0, 0, 0, 0);
            __CLR4_4_1kllklllc8azuki.R.inc(27003);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1kllklllc8azuki.R.inc(27004);try {
            __CLR4_4_1kllklllc8azuki.R.inc(27005);new DateTime(Integer.MAX_VALUE, 6, 9, 0, 0, 0, 0);
            __CLR4_4_1kllklllc8azuki.R.inc(27006);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1kllklllc8azuki.R.inc(27007);try {
            __CLR4_4_1kllklllc8azuki.R.inc(27008);new DateTime(2002, 0, 9, 0, 0, 0, 0);
            __CLR4_4_1kllklllc8azuki.R.inc(27009);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1kllklllc8azuki.R.inc(27010);try {
            __CLR4_4_1kllklllc8azuki.R.inc(27011);new DateTime(2002, 13, 9, 0, 0, 0, 0);
            __CLR4_4_1kllklllc8azuki.R.inc(27012);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1kllklllc8azuki.R.inc(27013);try {
            __CLR4_4_1kllklllc8azuki.R.inc(27014);new DateTime(2002, 6, 0, 0, 0, 0, 0);
            __CLR4_4_1kllklllc8azuki.R.inc(27015);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1kllklllc8azuki.R.inc(27016);try {
            __CLR4_4_1kllklllc8azuki.R.inc(27017);new DateTime(2002, 6, 31, 0, 0, 0, 0);
            __CLR4_4_1kllklllc8azuki.R.inc(27018);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1kllklllc8azuki.R.inc(27019);new DateTime(2002, 7, 31, 0, 0, 0, 0);
        __CLR4_4_1kllklllc8azuki.R.inc(27020);try {
            __CLR4_4_1kllklllc8azuki.R.inc(27021);new DateTime(2002, 7, 32, 0, 0, 0, 0);
            __CLR4_4_1kllklllc8azuki.R.inc(27022);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, DateTimeZone)
     */
    public void testConstructor_int_int_int_int_int_int_int_DateTimeZone() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),27023);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t1eacrkun();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_int_int_int_int_int_int_int_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27023,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t1eacrkun() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(27023);
        __CLR4_4_1kllklllc8azuki.R.inc(27024);DateTime test = new DateTime(2002, 6, 9, 2, 0, 0, 0, PARIS);  // +02:00
        __CLR4_4_1kllklllc8azuki.R.inc(27025);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(27026);assertEquals(TEST_TIME_NOW, test.getMillis());
        __CLR4_4_1kllklllc8azuki.R.inc(27027);try {
            __CLR4_4_1kllklllc8azuki.R.inc(27028);new DateTime(Integer.MIN_VALUE, 6, 9, 0, 0, 0, 0, PARIS);
            __CLR4_4_1kllklllc8azuki.R.inc(27029);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1kllklllc8azuki.R.inc(27030);try {
            __CLR4_4_1kllklllc8azuki.R.inc(27031);new DateTime(Integer.MAX_VALUE, 6, 9, 0, 0, 0, 0, PARIS);
            __CLR4_4_1kllklllc8azuki.R.inc(27032);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1kllklllc8azuki.R.inc(27033);try {
            __CLR4_4_1kllklllc8azuki.R.inc(27034);new DateTime(2002, 0, 9, 0, 0, 0, 0, PARIS);
            __CLR4_4_1kllklllc8azuki.R.inc(27035);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1kllklllc8azuki.R.inc(27036);try {
            __CLR4_4_1kllklllc8azuki.R.inc(27037);new DateTime(2002, 13, 9, 0, 0, 0, 0, PARIS);
            __CLR4_4_1kllklllc8azuki.R.inc(27038);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1kllklllc8azuki.R.inc(27039);try {
            __CLR4_4_1kllklllc8azuki.R.inc(27040);new DateTime(2002, 6, 0, 0, 0, 0, 0, PARIS);
            __CLR4_4_1kllklllc8azuki.R.inc(27041);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1kllklllc8azuki.R.inc(27042);try {
            __CLR4_4_1kllklllc8azuki.R.inc(27043);new DateTime(2002, 6, 31, 0, 0, 0, 0, PARIS);
            __CLR4_4_1kllklllc8azuki.R.inc(27044);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1kllklllc8azuki.R.inc(27045);new DateTime(2002, 7, 31, 0, 0, 0, 0, PARIS);
        __CLR4_4_1kllklllc8azuki.R.inc(27046);try {
            __CLR4_4_1kllklllc8azuki.R.inc(27047);new DateTime(2002, 7, 32, 0, 0, 0, 0, PARIS);
            __CLR4_4_1kllklllc8azuki.R.inc(27048);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, DateTimeZone=null)
     */
    public void testConstructor_int_int_int_int_int_int_int_nullDateTimeZone() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),27049);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ent58ckvd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_int_int_int_int_int_int_int_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27049,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ent58ckvd() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(27049);
        __CLR4_4_1kllklllc8azuki.R.inc(27050);DateTime test = new DateTime(2002, 6, 9, 1, 0, 0, 0, (DateTimeZone) null);  // +01:00
        __CLR4_4_1kllklllc8azuki.R.inc(27051);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(27052);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, Chronology)
     */
    public void testConstructor_int_int_int_int_int_int_int_Chronology() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),27053);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jndkrekvh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_int_int_int_int_int_int_int_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27053,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jndkrekvh() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(27053);
        __CLR4_4_1kllklllc8azuki.R.inc(27054);DateTime test = new DateTime(2002, 6, 9, 1, 0, 0, 0, GregorianChronology.getInstance());  // +01:00
        __CLR4_4_1kllklllc8azuki.R.inc(27055);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(27056);assertEquals(TEST_TIME_NOW, test.getMillis());
        __CLR4_4_1kllklllc8azuki.R.inc(27057);try {
            __CLR4_4_1kllklllc8azuki.R.inc(27058);new DateTime(Integer.MIN_VALUE, 6, 9, 0, 0, 0, 0, GregorianChronology.getInstance());
            __CLR4_4_1kllklllc8azuki.R.inc(27059);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1kllklllc8azuki.R.inc(27060);try {
            __CLR4_4_1kllklllc8azuki.R.inc(27061);new DateTime(Integer.MAX_VALUE, 6, 9, 0, 0, 0, 0, GregorianChronology.getInstance());
            __CLR4_4_1kllklllc8azuki.R.inc(27062);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1kllklllc8azuki.R.inc(27063);try {
            __CLR4_4_1kllklllc8azuki.R.inc(27064);new DateTime(2002, 0, 9, 0, 0, 0, 0, GregorianChronology.getInstance());
            __CLR4_4_1kllklllc8azuki.R.inc(27065);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1kllklllc8azuki.R.inc(27066);try {
            __CLR4_4_1kllklllc8azuki.R.inc(27067);new DateTime(2002, 13, 9, 0, 0, 0, 0, GregorianChronology.getInstance());
            __CLR4_4_1kllklllc8azuki.R.inc(27068);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1kllklllc8azuki.R.inc(27069);try {
            __CLR4_4_1kllklllc8azuki.R.inc(27070);new DateTime(2002, 6, 0, 0, 0, 0, 0, GregorianChronology.getInstance());
            __CLR4_4_1kllklllc8azuki.R.inc(27071);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1kllklllc8azuki.R.inc(27072);try {
            __CLR4_4_1kllklllc8azuki.R.inc(27073);new DateTime(2002, 6, 31, 0, 0, 0, 0, GregorianChronology.getInstance());
            __CLR4_4_1kllklllc8azuki.R.inc(27074);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1kllklllc8azuki.R.inc(27075);new DateTime(2002, 7, 31, 0, 0, 0, 0, GregorianChronology.getInstance());
        __CLR4_4_1kllklllc8azuki.R.inc(27076);try {
            __CLR4_4_1kllklllc8azuki.R.inc(27077);new DateTime(2002, 7, 32, 0, 0, 0, 0, GregorianChronology.getInstance());
            __CLR4_4_1kllklllc8azuki.R.inc(27078);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, Chronology=null)
     */
    public void testConstructor_int_int_int_int_int_int_int_nullChronology() throws Throwable {__CLR4_4_1kllklllc8azuki.R.globalSliceStart(getClass().getName(),27079);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fbepkjkw7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kllklllc8azuki.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kllklllc8azuki.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Constructors.testConstructor_int_int_int_int_int_int_int_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27079,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fbepkjkw7() throws Throwable{try{__CLR4_4_1kllklllc8azuki.R.inc(27079);
        __CLR4_4_1kllklllc8azuki.R.inc(27080);DateTime test = new DateTime(2002, 6, 9, 1, 0, 0, 0, (Chronology) null);  // +01:00
        __CLR4_4_1kllklllc8azuki.R.inc(27081);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1kllklllc8azuki.R.inc(27082);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1kllklllc8azuki.R.flushNeeded();}}

}
