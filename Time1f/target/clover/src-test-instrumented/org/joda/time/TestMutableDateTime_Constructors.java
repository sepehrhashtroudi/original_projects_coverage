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
 * This class is a Junit unit test for MutableDateTime.
 *
 * @author Stephen Colebourne
 */
public class TestMutableDateTime_Constructors extends TestCase {static class __CLR4_4_1tirtirlc8azvrm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,38525,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1tirtirlc8azvrm.R.inc(38259);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38260);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1tirtirlc8azvrm.R.inc(38261);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38262);return new TestSuite(TestMutableDateTime_Constructors.class);
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    public TestMutableDateTime_Constructors(String name) {
        super(name);__CLR4_4_1tirtirlc8azvrm.R.inc(38264);try{__CLR4_4_1tirtirlc8azvrm.R.inc(38263);
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1tirtirlc8azvrm.R.inc(38265);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38266);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38267);zone = DateTimeZone.getDefault();
        __CLR4_4_1tirtirlc8azvrm.R.inc(38268);locale = Locale.getDefault();
        __CLR4_4_1tirtirlc8azvrm.R.inc(38269);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38270);java.util.TimeZone.setDefault(LONDON.toTimeZone());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38271);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1tirtirlc8azvrm.R.inc(38272);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38273);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1tirtirlc8azvrm.R.inc(38274);DateTimeZone.setDefault(zone);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38275);java.util.TimeZone.setDefault(zone.toTimeZone());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38276);Locale.setDefault(locale);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38277);zone = null;
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testTest() {__CLR4_4_1tirtirlc8azvrm.R.globalSliceStart(getClass().getName(),38278);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqjtja();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tirtirlc8azvrm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tirtirlc8azvrm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38278,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqjtja(){try{__CLR4_4_1tirtirlc8azvrm.R.inc(38278);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38279);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38280);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38281);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test now ()
     */
    public void test_now() throws Throwable {__CLR4_4_1tirtirlc8azvrm.R.globalSliceStart(getClass().getName(),38282);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16qxg0tje();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tirtirlc8azvrm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tirtirlc8azvrm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.test_now",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38282,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16qxg0tje() throws Throwable{try{__CLR4_4_1tirtirlc8azvrm.R.inc(38282);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38283);MutableDateTime test = MutableDateTime.now();
        __CLR4_4_1tirtirlc8azvrm.R.inc(38284);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38285);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    /**
     * Test now (DateTimeZone)
     */
    public void test_now_DateTimeZone() throws Throwable {__CLR4_4_1tirtirlc8azvrm.R.globalSliceStart(getClass().getName(),38286);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yqbptotji();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tirtirlc8azvrm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tirtirlc8azvrm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.test_now_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38286,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yqbptotji() throws Throwable{try{__CLR4_4_1tirtirlc8azvrm.R.inc(38286);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38287);MutableDateTime test = MutableDateTime.now(PARIS);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38288);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38289);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    /**
     * Test now (DateTimeZone=null)
     */
    public void test_now_nullDateTimeZone() throws Throwable {__CLR4_4_1tirtirlc8azvrm.R.globalSliceStart(getClass().getName(),38290);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1odm0k5tjm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tirtirlc8azvrm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tirtirlc8azvrm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.test_now_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38290,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1odm0k5tjm() throws Throwable{try{__CLR4_4_1tirtirlc8azvrm.R.inc(38290);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38291);try {
            __CLR4_4_1tirtirlc8azvrm.R.inc(38292);MutableDateTime.now((DateTimeZone) null);
            __CLR4_4_1tirtirlc8azvrm.R.inc(38293);fail();
        } catch (NullPointerException ex) {}
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    /**
     * Test now (Chronology)
     */
    public void test_now_Chronology() throws Throwable {__CLR4_4_1tirtirlc8azvrm.R.globalSliceStart(getClass().getName(),38294);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16n9ve3tjq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tirtirlc8azvrm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tirtirlc8azvrm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.test_now_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38294,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16n9ve3tjq() throws Throwable{try{__CLR4_4_1tirtirlc8azvrm.R.inc(38294);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38295);MutableDateTime test = MutableDateTime.now(GregorianChronology.getInstance());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38296);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38297);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    /**
     * Test now (Chronology=null)
     */
    public void test_now_nullChronology() throws Throwable {__CLR4_4_1tirtirlc8azvrm.R.globalSliceStart(getClass().getName(),38298);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ge4g1wtju();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tirtirlc8azvrm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tirtirlc8azvrm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.test_now_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38298,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ge4g1wtju() throws Throwable{try{__CLR4_4_1tirtirlc8azvrm.R.inc(38298);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38299);try {
            __CLR4_4_1tirtirlc8azvrm.R.inc(38300);MutableDateTime.now((Chronology) null);
            __CLR4_4_1tirtirlc8azvrm.R.inc(38301);fail();
        } catch (NullPointerException ex) {}
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testParse_noFormatter() throws Throwable {__CLR4_4_1tirtirlc8azvrm.R.globalSliceStart(getClass().getName(),38302);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o2oqvitjy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tirtirlc8azvrm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tirtirlc8azvrm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testParse_noFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38302,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o2oqvitjy() throws Throwable{try{__CLR4_4_1tirtirlc8azvrm.R.inc(38302);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38303);assertEquals(new MutableDateTime(2010, 6, 30, 1, 20, 0, 0, ISOChronology.getInstance(DateTimeZone.forOffsetHours(2))), MutableDateTime.parse("2010-06-30T01:20+02:00"));
        __CLR4_4_1tirtirlc8azvrm.R.inc(38304);assertEquals(new MutableDateTime(2010, 1, 2, 14, 50, 0, 0, ISOChronology.getInstance(LONDON)), MutableDateTime.parse("2010-002T14:50"));
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    public void testParse_formatter() throws Throwable {__CLR4_4_1tirtirlc8azvrm.R.globalSliceStart(getClass().getName(),38305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15wvtnxtk1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tirtirlc8azvrm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tirtirlc8azvrm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testParse_formatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38305,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15wvtnxtk1() throws Throwable{try{__CLR4_4_1tirtirlc8azvrm.R.inc(38305);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38306);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy--dd MM HH").withChronology(ISOChronology.getInstance(PARIS));
        __CLR4_4_1tirtirlc8azvrm.R.inc(38307);assertEquals(new MutableDateTime(2010, 6, 30, 13, 0, 0, 0, ISOChronology.getInstance(PARIS)), MutableDateTime.parse("2010--30 06 13", f));
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */
    public void testConstructor() throws Throwable {__CLR4_4_1tirtirlc8azvrm.R.globalSliceStart(getClass().getName(),38308);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uefs8htk4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tirtirlc8azvrm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tirtirlc8azvrm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38308,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uefs8htk4() throws Throwable{try{__CLR4_4_1tirtirlc8azvrm.R.inc(38308);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38309);MutableDateTime test = new MutableDateTime();
        __CLR4_4_1tirtirlc8azvrm.R.inc(38310);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38311);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    /**
     * Test constructor (DateTimeZone)
     */
    public void testConstructor_DateTimeZone() throws Throwable {__CLR4_4_1tirtirlc8azvrm.R.globalSliceStart(getClass().getName(),38312);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z4m1k5tk8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tirtirlc8azvrm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tirtirlc8azvrm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38312,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z4m1k5tk8() throws Throwable{try{__CLR4_4_1tirtirlc8azvrm.R.inc(38312);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38313);MutableDateTime test = new MutableDateTime(PARIS);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38314);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38315);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    /**
     * Test constructor (DateTimeZone=null)
     */
    public void testConstructor_nullDateTimeZone() throws Throwable {__CLR4_4_1tirtirlc8azvrm.R.globalSliceStart(getClass().getName(),38316);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17zs1rotkc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tirtirlc8azvrm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tirtirlc8azvrm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38316,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17zs1rotkc() throws Throwable{try{__CLR4_4_1tirtirlc8azvrm.R.inc(38316);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38317);MutableDateTime test = new MutableDateTime((DateTimeZone) null);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38318);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38319);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    /**
     * Test constructor (Chronology)
     */
    public void testConstructor_Chronology() throws Throwable {__CLR4_4_1tirtirlc8azvrm.R.globalSliceStart(getClass().getName(),38320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15931titkg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tirtirlc8azvrm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tirtirlc8azvrm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38320,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15931titkg() throws Throwable{try{__CLR4_4_1tirtirlc8azvrm.R.inc(38320);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38321);MutableDateTime test = new MutableDateTime(GregorianChronology.getInstance());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38322);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38323);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    /**
     * Test constructor (Chronology=null)
     */
    public void testConstructor_nullChronology() throws Throwable {__CLR4_4_1tirtirlc8azvrm.R.globalSliceStart(getClass().getName(),38324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15qcb6rtkk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tirtirlc8azvrm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tirtirlc8azvrm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38324,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15qcb6rtkk() throws Throwable{try{__CLR4_4_1tirtirlc8azvrm.R.inc(38324);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38325);MutableDateTime test = new MutableDateTime((Chronology) null);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38326);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38327);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor (long)
     */
    public void testConstructor_long1() throws Throwable {__CLR4_4_1tirtirlc8azvrm.R.globalSliceStart(getClass().getName(),38328);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wi13crtko();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tirtirlc8azvrm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tirtirlc8azvrm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38328,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wi13crtko() throws Throwable{try{__CLR4_4_1tirtirlc8azvrm.R.inc(38328);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38329);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38330);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38331);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    /**
     * Test constructor (long)
     */
    public void testConstructor_long2() throws Throwable {__CLR4_4_1tirtirlc8azvrm.R.globalSliceStart(getClass().getName(),38332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t914katks();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tirtirlc8azvrm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tirtirlc8azvrm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38332,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t914katks() throws Throwable{try{__CLR4_4_1tirtirlc8azvrm.R.inc(38332);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38333);MutableDateTime test = new MutableDateTime(TEST_TIME2);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38334);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38335);assertEquals(TEST_TIME2, test.getMillis());
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    /**
     * Test constructor (long, DateTimeZone)
     */
    public void testConstructor_long1_DateTimeZone() throws Throwable {__CLR4_4_1tirtirlc8azvrm.R.globalSliceStart(getClass().getName(),38336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mej2a9tkw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tirtirlc8azvrm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tirtirlc8azvrm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_long1_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38336,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mej2a9tkw() throws Throwable{try{__CLR4_4_1tirtirlc8azvrm.R.inc(38336);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38337);MutableDateTime test = new MutableDateTime(TEST_TIME1, PARIS);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38338);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38339);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    /**
     * Test constructor (long, DateTimeZone)
     */
    public void testConstructor_long2_DateTimeZone() throws Throwable {__CLR4_4_1tirtirlc8azvrm.R.globalSliceStart(getClass().getName(),38340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s1hd9qtl0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tirtirlc8azvrm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tirtirlc8azvrm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_long2_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38340,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s1hd9qtl0() throws Throwable{try{__CLR4_4_1tirtirlc8azvrm.R.inc(38340);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38341);MutableDateTime test = new MutableDateTime(TEST_TIME2, PARIS);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38342);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38343);assertEquals(TEST_TIME2, test.getMillis());
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    /**
     * Test constructor (long, DateTimeZone=null)
     */
    public void testConstructor_long_nullDateTimeZone() throws Throwable {__CLR4_4_1tirtirlc8azvrm.R.globalSliceStart(getClass().getName(),38344);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uv35a9tl4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tirtirlc8azvrm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tirtirlc8azvrm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_long_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38344,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uv35a9tl4() throws Throwable{try{__CLR4_4_1tirtirlc8azvrm.R.inc(38344);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38345);MutableDateTime test = new MutableDateTime(TEST_TIME1, (DateTimeZone) null);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38346);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38347);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    /**
     * Test constructor (long, Chronology)
     */
    public void testConstructor_long1_Chronology() throws Throwable {__CLR4_4_1tirtirlc8azvrm.R.globalSliceStart(getClass().getName(),38348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_115wn5stl8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tirtirlc8azvrm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tirtirlc8azvrm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_long1_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38348,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_115wn5stl8() throws Throwable{try{__CLR4_4_1tirtirlc8azvrm.R.inc(38348);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38349);MutableDateTime test = new MutableDateTime(TEST_TIME1, GregorianChronology.getInstance());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38350);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38351);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    /**
     * Test constructor (long, Chronology)
     */
    public void testConstructor_long2_Chronology() throws Throwable {__CLR4_4_1tirtirlc8azvrm.R.globalSliceStart(getClass().getName(),38352);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14nqmkhtlc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tirtirlc8azvrm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tirtirlc8azvrm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_long2_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38352,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14nqmkhtlc() throws Throwable{try{__CLR4_4_1tirtirlc8azvrm.R.inc(38352);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38353);MutableDateTime test = new MutableDateTime(TEST_TIME2, GregorianChronology.getInstance());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38354);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38355);assertEquals(TEST_TIME2, test.getMillis());
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    /**
     * Test constructor (long, Chronology=null)
     */
    public void testConstructor_long_nullChronology() throws Throwable {__CLR4_4_1tirtirlc8azvrm.R.globalSliceStart(getClass().getName(),38356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nnhckutlg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tirtirlc8azvrm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tirtirlc8azvrm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_long_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38356,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nnhckutlg() throws Throwable{try{__CLR4_4_1tirtirlc8azvrm.R.inc(38356);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38357);MutableDateTime test = new MutableDateTime(TEST_TIME1, (Chronology) null);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38358);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38359);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object)
     */
    public void testConstructor_Object() throws Throwable {__CLR4_4_1tirtirlc8azvrm.R.globalSliceStart(getClass().getName(),38360);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eplcebtlk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tirtirlc8azvrm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tirtirlc8azvrm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_Object",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38360,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eplcebtlk() throws Throwable{try{__CLR4_4_1tirtirlc8azvrm.R.inc(38360);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38361);Date date = new Date(TEST_TIME1);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38362);MutableDateTime test = new MutableDateTime(date);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38363);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38364);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    /**
     * Test constructor (Object)
     */
    public void testConstructor_invalidObject() throws Throwable {__CLR4_4_1tirtirlc8azvrm.R.globalSliceStart(getClass().getName(),38365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x7unaytlp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tirtirlc8azvrm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tirtirlc8azvrm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_invalidObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38365,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x7unaytlp() throws Throwable{try{__CLR4_4_1tirtirlc8azvrm.R.inc(38365);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38366);try {
            __CLR4_4_1tirtirlc8azvrm.R.inc(38367);new MutableDateTime(new Object());
            __CLR4_4_1tirtirlc8azvrm.R.inc(38368);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    /**
     * Test constructor (Object=null)
     */
    public void testConstructor_nullObject() throws Throwable {__CLR4_4_1tirtirlc8azvrm.R.globalSliceStart(getClass().getName(),38369);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lt59uktlt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tirtirlc8azvrm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tirtirlc8azvrm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_nullObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38369,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lt59uktlt() throws Throwable{try{__CLR4_4_1tirtirlc8azvrm.R.inc(38369);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38370);MutableDateTime test = new MutableDateTime((Object) null);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38371);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38372);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    /**
     * Test constructor (Object=null)
     */
    public void testConstructor_badconverterObject() throws Throwable {__CLR4_4_1tirtirlc8azvrm.R.globalSliceStart(getClass().getName(),38373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1opptygtlx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tirtirlc8azvrm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tirtirlc8azvrm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_badconverterObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38373,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1opptygtlx() throws Throwable{try{__CLR4_4_1tirtirlc8azvrm.R.inc(38373);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38374);try {
            __CLR4_4_1tirtirlc8azvrm.R.inc(38375);ConverterManager.getInstance().addInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
            __CLR4_4_1tirtirlc8azvrm.R.inc(38376);MutableDateTime test = new MutableDateTime(new Integer(0));
            __CLR4_4_1tirtirlc8azvrm.R.inc(38377);assertEquals(ISOChronology.getInstance(), test.getChronology());
            __CLR4_4_1tirtirlc8azvrm.R.inc(38378);assertEquals(0L, test.getMillis());
        } finally {
            __CLR4_4_1tirtirlc8azvrm.R.inc(38379);ConverterManager.getInstance().removeInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
        }
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    /**
     * Test constructor (Object, DateTimeZone)
     */
    public void testConstructor_Object_DateTimeZone() throws Throwable {__CLR4_4_1tirtirlc8azvrm.R.globalSliceStart(getClass().getName(),38380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pk74vrtm4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tirtirlc8azvrm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tirtirlc8azvrm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_Object_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38380,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pk74vrtm4() throws Throwable{try{__CLR4_4_1tirtirlc8azvrm.R.inc(38380);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38381);Date date = new Date(TEST_TIME1);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38382);MutableDateTime test = new MutableDateTime(date, PARIS);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38383);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38384);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    /**
     * Test constructor (Object, DateTimeZone)
     */
    public void testConstructor_invalidObject_DateTimeZone() throws Throwable {__CLR4_4_1tirtirlc8azvrm.R.globalSliceStart(getClass().getName(),38385);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1un7r02tm9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tirtirlc8azvrm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tirtirlc8azvrm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_invalidObject_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38385,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1un7r02tm9() throws Throwable{try{__CLR4_4_1tirtirlc8azvrm.R.inc(38385);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38386);try {
            __CLR4_4_1tirtirlc8azvrm.R.inc(38387);new MutableDateTime(new Object(), PARIS);
            __CLR4_4_1tirtirlc8azvrm.R.inc(38388);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    /**
     * Test constructor (Object=null, DateTimeZone)
     */
    public void testConstructor_nullObject_DateTimeZone() throws Throwable {__CLR4_4_1tirtirlc8azvrm.R.globalSliceStart(getClass().getName(),38389);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wxoowgtmd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tirtirlc8azvrm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tirtirlc8azvrm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_nullObject_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38389,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wxoowgtmd() throws Throwable{try{__CLR4_4_1tirtirlc8azvrm.R.inc(38389);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38390);MutableDateTime test = new MutableDateTime((Object) null, PARIS);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38391);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38392);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    /**
     * Test constructor (Object, DateTimeZone=null)
     */
    public void testConstructor_Object_nullDateTimeZone() throws Throwable {__CLR4_4_1tirtirlc8azvrm.R.globalSliceStart(getClass().getName(),38393);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_151w5y6tmh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tirtirlc8azvrm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tirtirlc8azvrm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_Object_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38393,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_151w5y6tmh() throws Throwable{try{__CLR4_4_1tirtirlc8azvrm.R.inc(38393);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38394);Date date = new Date(TEST_TIME1);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38395);MutableDateTime test = new MutableDateTime(date, (DateTimeZone) null);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38396);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38397);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    /**
     * Test constructor (Object=null, DateTimeZone=null)
     */
    public void testConstructor_nullObject_nullDateTimeZone() throws Throwable {__CLR4_4_1tirtirlc8azvrm.R.globalSliceStart(getClass().getName(),38398);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hv60h5tmm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tirtirlc8azvrm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tirtirlc8azvrm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_nullObject_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38398,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hv60h5tmm() throws Throwable{try{__CLR4_4_1tirtirlc8azvrm.R.inc(38398);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38399);MutableDateTime test = new MutableDateTime((Object) null, (DateTimeZone) null);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38400);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38401);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    /**
     * Test constructor (Object, DateTimeZone)
     */
    public void testConstructor_badconverterObject_DateTimeZone() throws Throwable {__CLR4_4_1tirtirlc8azvrm.R.globalSliceStart(getClass().getName(),38402);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bp24vwtmq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tirtirlc8azvrm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tirtirlc8azvrm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_badconverterObject_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38402,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bp24vwtmq() throws Throwable{try{__CLR4_4_1tirtirlc8azvrm.R.inc(38402);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38403);try {
            __CLR4_4_1tirtirlc8azvrm.R.inc(38404);ConverterManager.getInstance().addInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
            __CLR4_4_1tirtirlc8azvrm.R.inc(38405);MutableDateTime test = new MutableDateTime(new Integer(0), GregorianChronology.getInstance());
            __CLR4_4_1tirtirlc8azvrm.R.inc(38406);assertEquals(ISOChronology.getInstance(), test.getChronology());
            __CLR4_4_1tirtirlc8azvrm.R.inc(38407);assertEquals(0L, test.getMillis());
        } finally {
            __CLR4_4_1tirtirlc8azvrm.R.inc(38408);ConverterManager.getInstance().removeInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
        }
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    /**
     * Test constructor (Object, Chronology)
     */
    public void testConstructor_Object_Chronology() throws Throwable {__CLR4_4_1tirtirlc8azvrm.R.globalSliceStart(getClass().getName(),38409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vmnvd4tmx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tirtirlc8azvrm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tirtirlc8azvrm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38409,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vmnvd4tmx() throws Throwable{try{__CLR4_4_1tirtirlc8azvrm.R.inc(38409);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38410);Date date = new Date(TEST_TIME1);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38411);MutableDateTime test = new MutableDateTime(date, GregorianChronology.getInstance());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38412);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38413);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    /**
     * Test constructor (Object, Chronology)
     */
    public void testConstructor_invalidObject_Chronology() throws Throwable {__CLR4_4_1tirtirlc8azvrm.R.globalSliceStart(getClass().getName(),38414);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fl36oxtn2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tirtirlc8azvrm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tirtirlc8azvrm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_invalidObject_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38414,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fl36oxtn2() throws Throwable{try{__CLR4_4_1tirtirlc8azvrm.R.inc(38414);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38415);try {
            __CLR4_4_1tirtirlc8azvrm.R.inc(38416);new MutableDateTime(new Object(), GregorianChronology.getInstance());
            __CLR4_4_1tirtirlc8azvrm.R.inc(38417);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    /**
     * Test constructor (Object=null, Chronology)
     */
    public void testConstructor_nullObject_Chronology() throws Throwable {__CLR4_4_1tirtirlc8azvrm.R.globalSliceStart(getClass().getName(),38418);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14q0uyntn6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tirtirlc8azvrm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tirtirlc8azvrm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_nullObject_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38418,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14q0uyntn6() throws Throwable{try{__CLR4_4_1tirtirlc8azvrm.R.inc(38418);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38419);MutableDateTime test = new MutableDateTime((Object) null, GregorianChronology.getInstance());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38420);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38421);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    /**
     * Test constructor (Object, Chronology=null)
     */
    public void testConstructor_Object_nullChronology() throws Throwable {__CLR4_4_1tirtirlc8azvrm.R.globalSliceStart(getClass().getName(),38422);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yccijztna();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tirtirlc8azvrm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tirtirlc8azvrm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_Object_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38422,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yccijztna() throws Throwable{try{__CLR4_4_1tirtirlc8azvrm.R.inc(38422);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38423);Date date = new Date(TEST_TIME1);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38424);MutableDateTime test = new MutableDateTime(date, (Chronology) null);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38425);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38426);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    /**
     * Test constructor (Object=null, Chronology=null)
     */
    public void testConstructor_nullObject_nullChronology() throws Throwable {__CLR4_4_1tirtirlc8azvrm.R.globalSliceStart(getClass().getName(),38427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14dtve0tnf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tirtirlc8azvrm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tirtirlc8azvrm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_nullObject_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38427,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14dtve0tnf() throws Throwable{try{__CLR4_4_1tirtirlc8azvrm.R.inc(38427);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38428);MutableDateTime test = new MutableDateTime((Object) null, (Chronology) null);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38429);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38430);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    /**
     * Test constructor (Object, Chronology)
     */
    public void testConstructor_badconverterObject_Chronology() throws Throwable {__CLR4_4_1tirtirlc8azvrm.R.globalSliceStart(getClass().getName(),38431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pyoqybtnj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tirtirlc8azvrm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tirtirlc8azvrm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_badconverterObject_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38431,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pyoqybtnj() throws Throwable{try{__CLR4_4_1tirtirlc8azvrm.R.inc(38431);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38432);try {
            __CLR4_4_1tirtirlc8azvrm.R.inc(38433);ConverterManager.getInstance().addInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
            __CLR4_4_1tirtirlc8azvrm.R.inc(38434);MutableDateTime test = new MutableDateTime(new Integer(0), GregorianChronology.getInstance());
            __CLR4_4_1tirtirlc8azvrm.R.inc(38435);assertEquals(ISOChronology.getInstance(), test.getChronology());
            __CLR4_4_1tirtirlc8azvrm.R.inc(38436);assertEquals(0L, test.getMillis());
        } finally {
            __CLR4_4_1tirtirlc8azvrm.R.inc(38437);ConverterManager.getInstance().removeInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
        }
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor (int, int, int)
     */
    public void testConstructor_int_int_int_int_int_int_int() throws Throwable {__CLR4_4_1tirtirlc8azvrm.R.globalSliceStart(getClass().getName(),38438);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ofcjtttnq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tirtirlc8azvrm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tirtirlc8azvrm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_int_int_int_int_int_int_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38438,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ofcjtttnq() throws Throwable{try{__CLR4_4_1tirtirlc8azvrm.R.inc(38438);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38439);MutableDateTime test = new MutableDateTime(2002, 6, 9, 1, 0, 0, 0);  // +01:00
        __CLR4_4_1tirtirlc8azvrm.R.inc(38440);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38441);assertEquals(LONDON, test.getZone());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38442);assertEquals(TEST_TIME_NOW, test.getMillis());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38443);try {
            __CLR4_4_1tirtirlc8azvrm.R.inc(38444);new MutableDateTime(Integer.MIN_VALUE, 6, 9, 0, 0, 0, 0);
            __CLR4_4_1tirtirlc8azvrm.R.inc(38445);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1tirtirlc8azvrm.R.inc(38446);try {
            __CLR4_4_1tirtirlc8azvrm.R.inc(38447);new MutableDateTime(Integer.MAX_VALUE, 6, 9, 0, 0, 0, 0);
            __CLR4_4_1tirtirlc8azvrm.R.inc(38448);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1tirtirlc8azvrm.R.inc(38449);try {
            __CLR4_4_1tirtirlc8azvrm.R.inc(38450);new MutableDateTime(2002, 0, 9, 0, 0, 0, 0);
            __CLR4_4_1tirtirlc8azvrm.R.inc(38451);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1tirtirlc8azvrm.R.inc(38452);try {
            __CLR4_4_1tirtirlc8azvrm.R.inc(38453);new MutableDateTime(2002, 13, 9, 0, 0, 0, 0);
            __CLR4_4_1tirtirlc8azvrm.R.inc(38454);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1tirtirlc8azvrm.R.inc(38455);try {
            __CLR4_4_1tirtirlc8azvrm.R.inc(38456);new MutableDateTime(2002, 6, 0, 0, 0, 0, 0);
            __CLR4_4_1tirtirlc8azvrm.R.inc(38457);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1tirtirlc8azvrm.R.inc(38458);try {
            __CLR4_4_1tirtirlc8azvrm.R.inc(38459);new MutableDateTime(2002, 6, 31, 0, 0, 0, 0);
            __CLR4_4_1tirtirlc8azvrm.R.inc(38460);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1tirtirlc8azvrm.R.inc(38461);new MutableDateTime(2002, 7, 31, 0, 0, 0, 0);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38462);try {
            __CLR4_4_1tirtirlc8azvrm.R.inc(38463);new MutableDateTime(2002, 7, 32, 0, 0, 0, 0);
            __CLR4_4_1tirtirlc8azvrm.R.inc(38464);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, DateTimeZone)
     */
    public void testConstructor_int_int_int_int_int_int_int_DateTimeZone() throws Throwable {__CLR4_4_1tirtirlc8azvrm.R.globalSliceStart(getClass().getName(),38465);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t1eacrtoh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tirtirlc8azvrm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tirtirlc8azvrm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_int_int_int_int_int_int_int_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38465,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t1eacrtoh() throws Throwable{try{__CLR4_4_1tirtirlc8azvrm.R.inc(38465);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38466);MutableDateTime test = new MutableDateTime(2002, 6, 9, 2, 0, 0, 0, PARIS);  // +02:00
        __CLR4_4_1tirtirlc8azvrm.R.inc(38467);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38468);assertEquals(TEST_TIME_NOW, test.getMillis());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38469);try {
            __CLR4_4_1tirtirlc8azvrm.R.inc(38470);new MutableDateTime(Integer.MIN_VALUE, 6, 9, 0, 0, 0, 0, PARIS);
            __CLR4_4_1tirtirlc8azvrm.R.inc(38471);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1tirtirlc8azvrm.R.inc(38472);try {
            __CLR4_4_1tirtirlc8azvrm.R.inc(38473);new MutableDateTime(Integer.MAX_VALUE, 6, 9, 0, 0, 0, 0, PARIS);
            __CLR4_4_1tirtirlc8azvrm.R.inc(38474);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1tirtirlc8azvrm.R.inc(38475);try {
            __CLR4_4_1tirtirlc8azvrm.R.inc(38476);new MutableDateTime(2002, 0, 9, 0, 0, 0, 0, PARIS);
            __CLR4_4_1tirtirlc8azvrm.R.inc(38477);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1tirtirlc8azvrm.R.inc(38478);try {
            __CLR4_4_1tirtirlc8azvrm.R.inc(38479);new MutableDateTime(2002, 13, 9, 0, 0, 0, 0, PARIS);
            __CLR4_4_1tirtirlc8azvrm.R.inc(38480);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1tirtirlc8azvrm.R.inc(38481);try {
            __CLR4_4_1tirtirlc8azvrm.R.inc(38482);new MutableDateTime(2002, 6, 0, 0, 0, 0, 0, PARIS);
            __CLR4_4_1tirtirlc8azvrm.R.inc(38483);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1tirtirlc8azvrm.R.inc(38484);try {
            __CLR4_4_1tirtirlc8azvrm.R.inc(38485);new MutableDateTime(2002, 6, 31, 0, 0, 0, 0, PARIS);
            __CLR4_4_1tirtirlc8azvrm.R.inc(38486);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1tirtirlc8azvrm.R.inc(38487);new MutableDateTime(2002, 7, 31, 0, 0, 0, 0, PARIS);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38488);try {
            __CLR4_4_1tirtirlc8azvrm.R.inc(38489);new MutableDateTime(2002, 7, 32, 0, 0, 0, 0, PARIS);
            __CLR4_4_1tirtirlc8azvrm.R.inc(38490);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, DateTimeZone=null)
     */
    public void testConstructor_int_int_int_int_int_int_int_nullDateTimeZone() throws Throwable {__CLR4_4_1tirtirlc8azvrm.R.globalSliceStart(getClass().getName(),38491);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ent58ctp7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tirtirlc8azvrm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tirtirlc8azvrm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_int_int_int_int_int_int_int_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38491,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ent58ctp7() throws Throwable{try{__CLR4_4_1tirtirlc8azvrm.R.inc(38491);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38492);MutableDateTime test = new MutableDateTime(2002, 6, 9, 1, 0, 0, 0, (DateTimeZone) null);  // +01:00
        __CLR4_4_1tirtirlc8azvrm.R.inc(38493);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38494);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, Chronology)
     */
    public void testConstructor_int_int_int_int_int_int_int_Chronology() throws Throwable {__CLR4_4_1tirtirlc8azvrm.R.globalSliceStart(getClass().getName(),38495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jndkretpb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tirtirlc8azvrm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tirtirlc8azvrm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_int_int_int_int_int_int_int_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38495,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jndkretpb() throws Throwable{try{__CLR4_4_1tirtirlc8azvrm.R.inc(38495);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38496);MutableDateTime test = new MutableDateTime(2002, 6, 9, 1, 0, 0, 0, GregorianChronology.getInstance());  // +01:00
        __CLR4_4_1tirtirlc8azvrm.R.inc(38497);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38498);assertEquals(TEST_TIME_NOW, test.getMillis());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38499);try {
            __CLR4_4_1tirtirlc8azvrm.R.inc(38500);new MutableDateTime(Integer.MIN_VALUE, 6, 9, 0, 0, 0, 0, GregorianChronology.getInstance());
            __CLR4_4_1tirtirlc8azvrm.R.inc(38501);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1tirtirlc8azvrm.R.inc(38502);try {
            __CLR4_4_1tirtirlc8azvrm.R.inc(38503);new MutableDateTime(Integer.MAX_VALUE, 6, 9, 0, 0, 0, 0, GregorianChronology.getInstance());
            __CLR4_4_1tirtirlc8azvrm.R.inc(38504);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1tirtirlc8azvrm.R.inc(38505);try {
            __CLR4_4_1tirtirlc8azvrm.R.inc(38506);new MutableDateTime(2002, 0, 9, 0, 0, 0, 0, GregorianChronology.getInstance());
            __CLR4_4_1tirtirlc8azvrm.R.inc(38507);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1tirtirlc8azvrm.R.inc(38508);try {
            __CLR4_4_1tirtirlc8azvrm.R.inc(38509);new MutableDateTime(2002, 13, 9, 0, 0, 0, 0, GregorianChronology.getInstance());
            __CLR4_4_1tirtirlc8azvrm.R.inc(38510);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1tirtirlc8azvrm.R.inc(38511);try {
            __CLR4_4_1tirtirlc8azvrm.R.inc(38512);new MutableDateTime(2002, 6, 0, 0, 0, 0, 0, GregorianChronology.getInstance());
            __CLR4_4_1tirtirlc8azvrm.R.inc(38513);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1tirtirlc8azvrm.R.inc(38514);try {
            __CLR4_4_1tirtirlc8azvrm.R.inc(38515);new MutableDateTime(2002, 6, 31, 0, 0, 0, 0, GregorianChronology.getInstance());
            __CLR4_4_1tirtirlc8azvrm.R.inc(38516);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1tirtirlc8azvrm.R.inc(38517);new MutableDateTime(2002, 7, 31, 0, 0, 0, 0, GregorianChronology.getInstance());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38518);try {
            __CLR4_4_1tirtirlc8azvrm.R.inc(38519);new MutableDateTime(2002, 7, 32, 0, 0, 0, 0, GregorianChronology.getInstance());
            __CLR4_4_1tirtirlc8azvrm.R.inc(38520);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, Chronology=null)
     */
    public void testConstructor_int_int_int_int_int_int_int_nullChronology() throws Throwable {__CLR4_4_1tirtirlc8azvrm.R.globalSliceStart(getClass().getName(),38521);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fbepkjtq1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tirtirlc8azvrm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tirtirlc8azvrm.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_int_int_int_int_int_int_int_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38521,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fbepkjtq1() throws Throwable{try{__CLR4_4_1tirtirlc8azvrm.R.inc(38521);
        __CLR4_4_1tirtirlc8azvrm.R.inc(38522);MutableDateTime test = new MutableDateTime(2002, 6, 9, 1, 0, 0, 0, (Chronology) null);  // +01:00
        __CLR4_4_1tirtirlc8azvrm.R.inc(38523);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1tirtirlc8azvrm.R.inc(38524);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1tirtirlc8azvrm.R.flushNeeded();}}

}
