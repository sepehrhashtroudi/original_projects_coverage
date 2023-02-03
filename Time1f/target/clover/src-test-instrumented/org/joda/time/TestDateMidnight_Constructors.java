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

import java.util.Date;
import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.MockZeroNullIntegerConverter;
import org.joda.time.format.DateTimeFormat;

/**
 * This class is a Junit unit test for DateMidnight.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestDateMidnight_Constructors extends TestCase {static class __CLR4_4_1hlxhlxlc8azu72{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,23105,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
    private long TEST_TIME_NOW_UTC =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
    private long TEST_TIME_NOW_LONDON =
            TEST_TIME_NOW_UTC - DateTimeConstants.MILLIS_PER_HOUR;
    private long TEST_TIME_NOW_PARIS =
            TEST_TIME_NOW_UTC - 2*DateTimeConstants.MILLIS_PER_HOUR;
    
    // 2002-04-05
    private long TEST_TIME1_UTC =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
    private long TEST_TIME1_LONDON =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            - DateTimeConstants.MILLIS_PER_HOUR;
    private long TEST_TIME1_PARIS =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            - 2*DateTimeConstants.MILLIS_PER_HOUR;
    
    // 2003-05-06
    private long TEST_TIME2_UTC =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
    private long TEST_TIME2_LONDON =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
             - DateTimeConstants.MILLIS_PER_HOUR;
    private long TEST_TIME2_PARIS =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
             - 2*DateTimeConstants.MILLIS_PER_HOUR;
    
    private DateTimeZone zone = null;
    private Locale locale = null;

    public static void main(String[] args) {try{__CLR4_4_1hlxhlxlc8azu72.R.inc(22821);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22822);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1hlxhlxlc8azu72.R.inc(22823);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22824);return new TestSuite(TestDateMidnight_Constructors.class);
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    public TestDateMidnight_Constructors(String name) {
        super(name);__CLR4_4_1hlxhlxlc8azu72.R.inc(22826);try{__CLR4_4_1hlxhlxlc8azu72.R.inc(22825);
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1hlxhlxlc8azu72.R.inc(22827);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22828);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW_UTC);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22829);zone = DateTimeZone.getDefault();
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22830);locale = Locale.getDefault();
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22831);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22832);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1hlxhlxlc8azu72.R.inc(22833);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22834);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22835);DateTimeZone.setDefault(zone);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22836);Locale.setDefault(locale);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22837);zone = null;
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testTest() {__CLR4_4_1hlxhlxlc8azu72.R.globalSliceStart(getClass().getName(),22838);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqjhme();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlxhlxlc8azu72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlxhlxlc8azu72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22838,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqjhme(){try{__CLR4_4_1hlxhlxlc8azu72.R.inc(22838);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22839);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW_UTC).toString());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22840);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1_UTC).toString());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22841);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2_UTC).toString());
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test now ()
     */
    public void test_now() throws Throwable {__CLR4_4_1hlxhlxlc8azu72.R.globalSliceStart(getClass().getName(),22842);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16qxg0hmi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlxhlxlc8azu72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlxhlxlc8azu72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.test_now",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22842,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16qxg0hmi() throws Throwable{try{__CLR4_4_1hlxhlxlc8azu72.R.inc(22842);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22843);DateMidnight test = DateMidnight.now();
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22844);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22845);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22846);assertEquals(2002, test.getYear());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22847);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22848);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    /**
     * Test now (DateTimeZone)
     */
    public void test_now_DateTimeZone() throws Throwable {__CLR4_4_1hlxhlxlc8azu72.R.globalSliceStart(getClass().getName(),22849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yqbptohmp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlxhlxlc8azu72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlxhlxlc8azu72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.test_now_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22849,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yqbptohmp() throws Throwable{try{__CLR4_4_1hlxhlxlc8azu72.R.inc(22849);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22850);DateMidnight test = DateMidnight.now(PARIS);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22851);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22852);assertEquals(TEST_TIME_NOW_PARIS, test.getMillis());
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    /**
     * Test now (DateTimeZone=null)
     */
    public void test_now_nullDateTimeZone() throws Throwable {__CLR4_4_1hlxhlxlc8azu72.R.globalSliceStart(getClass().getName(),22853);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1odm0k5hmt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlxhlxlc8azu72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlxhlxlc8azu72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.test_now_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22853,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1odm0k5hmt() throws Throwable{try{__CLR4_4_1hlxhlxlc8azu72.R.inc(22853);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22854);try {
            __CLR4_4_1hlxhlxlc8azu72.R.inc(22855);DateMidnight.now((DateTimeZone) null);
            __CLR4_4_1hlxhlxlc8azu72.R.inc(22856);fail();
        } catch (NullPointerException ex) {}
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    /**
     * Test now (Chronology)
     */
    public void test_now_Chronology() throws Throwable {__CLR4_4_1hlxhlxlc8azu72.R.globalSliceStart(getClass().getName(),22857);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16n9ve3hmx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlxhlxlc8azu72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlxhlxlc8azu72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.test_now_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22857,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16n9ve3hmx() throws Throwable{try{__CLR4_4_1hlxhlxlc8azu72.R.inc(22857);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22858);DateMidnight test = DateMidnight.now(GregorianChronology.getInstance());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22859);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22860);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis());
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    /**
     * Test now (Chronology=null)
     */
    public void test_now_nullChronology() throws Throwable {__CLR4_4_1hlxhlxlc8azu72.R.globalSliceStart(getClass().getName(),22861);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ge4g1whn1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlxhlxlc8azu72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlxhlxlc8azu72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.test_now_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22861,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ge4g1whn1() throws Throwable{try{__CLR4_4_1hlxhlxlc8azu72.R.inc(22861);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22862);try {
            __CLR4_4_1hlxhlxlc8azu72.R.inc(22863);DateMidnight.now((Chronology) null);
            __CLR4_4_1hlxhlxlc8azu72.R.inc(22864);fail();
        } catch (NullPointerException ex) {}
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testParse_noFormatter() throws Throwable {__CLR4_4_1hlxhlxlc8azu72.R.globalSliceStart(getClass().getName(),22865);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o2oqvihn5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlxhlxlc8azu72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlxhlxlc8azu72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testParse_noFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22865,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o2oqvihn5() throws Throwable{try{__CLR4_4_1hlxhlxlc8azu72.R.inc(22865);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22866);assertEquals(new DateMidnight(2010, 6, 30, ISOChronology.getInstance(LONDON)), DateMidnight.parse("2010-06-30"));
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22867);assertEquals(new DateMidnight(2010, 1, 2, ISOChronology.getInstance(LONDON)), DateMidnight.parse("2010-002"));
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    public void testParse_formatter() throws Throwable {__CLR4_4_1hlxhlxlc8azu72.R.globalSliceStart(getClass().getName(),22868);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15wvtnxhn8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlxhlxlc8azu72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlxhlxlc8azu72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testParse_formatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22868,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15wvtnxhn8() throws Throwable{try{__CLR4_4_1hlxhlxlc8azu72.R.inc(22868);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22869);assertEquals(new DateMidnight(2010, 6, 30, ISOChronology.getInstance(LONDON)), DateMidnight.parse("2010--30 06", DateTimeFormat.forPattern("yyyy--dd MM")));
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */
    public void testConstructor() throws Throwable {__CLR4_4_1hlxhlxlc8azu72.R.globalSliceStart(getClass().getName(),22870);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uefs8hhna();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlxhlxlc8azu72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlxhlxlc8azu72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22870,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uefs8hhna() throws Throwable{try{__CLR4_4_1hlxhlxlc8azu72.R.inc(22870);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22871);DateMidnight test = new DateMidnight();
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22872);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22873);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22874);assertEquals(2002, test.getYear());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22875);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22876);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    /**
     * Test constructor (DateTimeZone)
     */
    public void testConstructor_DateTimeZone() throws Throwable {__CLR4_4_1hlxhlxlc8azu72.R.globalSliceStart(getClass().getName(),22877);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z4m1k5hnh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlxhlxlc8azu72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlxhlxlc8azu72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22877,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z4m1k5hnh() throws Throwable{try{__CLR4_4_1hlxhlxlc8azu72.R.inc(22877);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22878);DateMidnight test = new DateMidnight(PARIS);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22879);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22880);assertEquals(TEST_TIME_NOW_PARIS, test.getMillis());
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    /**
     * Test constructor (DateTimeZone=null)
     */
    public void testConstructor_nullDateTimeZone() throws Throwable {__CLR4_4_1hlxhlxlc8azu72.R.globalSliceStart(getClass().getName(),22881);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17zs1rohnl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlxhlxlc8azu72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlxhlxlc8azu72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22881,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17zs1rohnl() throws Throwable{try{__CLR4_4_1hlxhlxlc8azu72.R.inc(22881);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22882);DateMidnight test = new DateMidnight((DateTimeZone) null);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22883);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22884);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis());
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    /**
     * Test constructor (Chronology)
     */
    public void testConstructor_Chronology() throws Throwable {__CLR4_4_1hlxhlxlc8azu72.R.globalSliceStart(getClass().getName(),22885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15931tihnp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlxhlxlc8azu72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlxhlxlc8azu72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22885,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15931tihnp() throws Throwable{try{__CLR4_4_1hlxhlxlc8azu72.R.inc(22885);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22886);DateMidnight test = new DateMidnight(GregorianChronology.getInstance());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22887);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22888);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis());
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    /**
     * Test constructor (Chronology=null)
     */
    public void testConstructor_nullChronology() throws Throwable {__CLR4_4_1hlxhlxlc8azu72.R.globalSliceStart(getClass().getName(),22889);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15qcb6rhnt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlxhlxlc8azu72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlxhlxlc8azu72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22889,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15qcb6rhnt() throws Throwable{try{__CLR4_4_1hlxhlxlc8azu72.R.inc(22889);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22890);DateMidnight test = new DateMidnight((Chronology) null);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22891);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22892);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis());
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor (long)
     */
    public void testConstructor_long1() throws Throwable {__CLR4_4_1hlxhlxlc8azu72.R.globalSliceStart(getClass().getName(),22893);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wi13crhnx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlxhlxlc8azu72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlxhlxlc8azu72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22893,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wi13crhnx() throws Throwable{try{__CLR4_4_1hlxhlxlc8azu72.R.inc(22893);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22894);DateMidnight test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22895);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22896);assertEquals(TEST_TIME1_LONDON, test.getMillis());
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    /**
     * Test constructor (long)
     */
    public void testConstructor_long2() throws Throwable {__CLR4_4_1hlxhlxlc8azu72.R.globalSliceStart(getClass().getName(),22897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t914kaho1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlxhlxlc8azu72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlxhlxlc8azu72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22897,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t914kaho1() throws Throwable{try{__CLR4_4_1hlxhlxlc8azu72.R.inc(22897);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22898);DateMidnight test = new DateMidnight(TEST_TIME2_UTC);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22899);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22900);assertEquals(TEST_TIME2_LONDON, test.getMillis());
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    /**
     * Test constructor (long, DateTimeZone)
     */
    public void testConstructor_long1_DateTimeZone() throws Throwable {__CLR4_4_1hlxhlxlc8azu72.R.globalSliceStart(getClass().getName(),22901);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mej2a9ho5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlxhlxlc8azu72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlxhlxlc8azu72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_long1_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22901,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mej2a9ho5() throws Throwable{try{__CLR4_4_1hlxhlxlc8azu72.R.inc(22901);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22902);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, PARIS);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22903);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22904);assertEquals(TEST_TIME1_PARIS, test.getMillis());
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    /**
     * Test constructor (long, DateTimeZone)
     */
    public void testConstructor_long2_DateTimeZone() throws Throwable {__CLR4_4_1hlxhlxlc8azu72.R.globalSliceStart(getClass().getName(),22905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s1hd9qho9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlxhlxlc8azu72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlxhlxlc8azu72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_long2_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22905,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s1hd9qho9() throws Throwable{try{__CLR4_4_1hlxhlxlc8azu72.R.inc(22905);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22906);DateMidnight test = new DateMidnight(TEST_TIME2_UTC, PARIS);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22907);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22908);assertEquals(TEST_TIME2_PARIS, test.getMillis());
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    /**
     * Test constructor (long, DateTimeZone=null)
     */
    public void testConstructor_long_nullDateTimeZone() throws Throwable {__CLR4_4_1hlxhlxlc8azu72.R.globalSliceStart(getClass().getName(),22909);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uv35a9hod();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlxhlxlc8azu72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlxhlxlc8azu72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_long_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22909,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uv35a9hod() throws Throwable{try{__CLR4_4_1hlxhlxlc8azu72.R.inc(22909);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22910);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, (DateTimeZone) null);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22911);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22912);assertEquals(TEST_TIME1_LONDON, test.getMillis());
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    /**
     * Test constructor (long, Chronology)
     */
    public void testConstructor_long1_Chronology() throws Throwable {__CLR4_4_1hlxhlxlc8azu72.R.globalSliceStart(getClass().getName(),22913);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_115wn5shoh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlxhlxlc8azu72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlxhlxlc8azu72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_long1_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22913,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_115wn5shoh() throws Throwable{try{__CLR4_4_1hlxhlxlc8azu72.R.inc(22913);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22914);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, GregorianChronology.getInstance());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22915);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22916);assertEquals(TEST_TIME1_LONDON, test.getMillis());
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    /**
     * Test constructor (long, Chronology)
     */
    public void testConstructor_long2_Chronology() throws Throwable {__CLR4_4_1hlxhlxlc8azu72.R.globalSliceStart(getClass().getName(),22917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14nqmkhhol();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlxhlxlc8azu72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlxhlxlc8azu72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_long2_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22917,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14nqmkhhol() throws Throwable{try{__CLR4_4_1hlxhlxlc8azu72.R.inc(22917);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22918);DateMidnight test = new DateMidnight(TEST_TIME2_UTC, GregorianChronology.getInstance());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22919);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22920);assertEquals(TEST_TIME2_LONDON, test.getMillis());
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    /**
     * Test constructor (long, Chronology=null)
     */
    public void testConstructor_long_nullChronology() throws Throwable {__CLR4_4_1hlxhlxlc8azu72.R.globalSliceStart(getClass().getName(),22921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nnhckuhop();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlxhlxlc8azu72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlxhlxlc8azu72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_long_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22921,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nnhckuhop() throws Throwable{try{__CLR4_4_1hlxhlxlc8azu72.R.inc(22921);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22922);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, (Chronology) null);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22923);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22924);assertEquals(TEST_TIME1_LONDON, test.getMillis());
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object)
     */
    public void testConstructor_Object() throws Throwable {__CLR4_4_1hlxhlxlc8azu72.R.globalSliceStart(getClass().getName(),22925);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eplcebhot();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlxhlxlc8azu72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlxhlxlc8azu72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_Object",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22925,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eplcebhot() throws Throwable{try{__CLR4_4_1hlxhlxlc8azu72.R.inc(22925);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22926);Date date = new Date(TEST_TIME1_UTC);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22927);DateMidnight test = new DateMidnight(date);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22928);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22929);assertEquals(TEST_TIME1_LONDON, test.getMillis());
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    /**
     * Test constructor (Object)
     */
    public void testConstructor_invalidObject() throws Throwable {__CLR4_4_1hlxhlxlc8azu72.R.globalSliceStart(getClass().getName(),22930);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x7unayhoy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlxhlxlc8azu72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlxhlxlc8azu72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_invalidObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22930,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x7unayhoy() throws Throwable{try{__CLR4_4_1hlxhlxlc8azu72.R.inc(22930);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22931);try {
            __CLR4_4_1hlxhlxlc8azu72.R.inc(22932);new DateMidnight(new Object());
            __CLR4_4_1hlxhlxlc8azu72.R.inc(22933);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    /**
     * Test constructor (Object=null)
     */
    public void testConstructor_nullObject() throws Throwable {__CLR4_4_1hlxhlxlc8azu72.R.globalSliceStart(getClass().getName(),22934);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lt59ukhp2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlxhlxlc8azu72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlxhlxlc8azu72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_nullObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22934,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lt59ukhp2() throws Throwable{try{__CLR4_4_1hlxhlxlc8azu72.R.inc(22934);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22935);DateMidnight test = new DateMidnight((Object) null);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22936);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22937);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis());
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    /**
     * Test constructor (Object=null)
     */
    public void testConstructor_badconverterObject() throws Throwable {__CLR4_4_1hlxhlxlc8azu72.R.globalSliceStart(getClass().getName(),22938);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1opptyghp6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlxhlxlc8azu72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlxhlxlc8azu72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_badconverterObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22938,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1opptyghp6() throws Throwable{try{__CLR4_4_1hlxhlxlc8azu72.R.inc(22938);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22939);try {
            __CLR4_4_1hlxhlxlc8azu72.R.inc(22940);ConverterManager.getInstance().addInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
            __CLR4_4_1hlxhlxlc8azu72.R.inc(22941);DateMidnight test = new DateMidnight(new Integer(0));
            __CLR4_4_1hlxhlxlc8azu72.R.inc(22942);assertEquals(ISOChronology.getInstance(), test.getChronology());
            __CLR4_4_1hlxhlxlc8azu72.R.inc(22943);assertEquals(0L - DateTimeConstants.MILLIS_PER_HOUR, test.getMillis());
        } finally {
            __CLR4_4_1hlxhlxlc8azu72.R.inc(22944);ConverterManager.getInstance().removeInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
        }
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    /**
     * Test constructor (Object, DateTimeZone)
     */
    public void testConstructor_Object_DateTimeZone() throws Throwable {__CLR4_4_1hlxhlxlc8azu72.R.globalSliceStart(getClass().getName(),22945);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pk74vrhpd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlxhlxlc8azu72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlxhlxlc8azu72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_Object_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22945,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pk74vrhpd() throws Throwable{try{__CLR4_4_1hlxhlxlc8azu72.R.inc(22945);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22946);Date date = new Date(TEST_TIME1_UTC);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22947);DateMidnight test = new DateMidnight(date, PARIS);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22948);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22949);assertEquals(TEST_TIME1_PARIS, test.getMillis());
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    /**
     * Test constructor (Object, DateTimeZone)
     */
    public void testConstructor_invalidObject_DateTimeZone() throws Throwable {__CLR4_4_1hlxhlxlc8azu72.R.globalSliceStart(getClass().getName(),22950);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1un7r02hpi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlxhlxlc8azu72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlxhlxlc8azu72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_invalidObject_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22950,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1un7r02hpi() throws Throwable{try{__CLR4_4_1hlxhlxlc8azu72.R.inc(22950);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22951);try {
            __CLR4_4_1hlxhlxlc8azu72.R.inc(22952);new DateMidnight(new Object(), PARIS);
            __CLR4_4_1hlxhlxlc8azu72.R.inc(22953);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    /**
     * Test constructor (Object=null, DateTimeZone)
     */
    public void testConstructor_nullObject_DateTimeZone() throws Throwable {__CLR4_4_1hlxhlxlc8azu72.R.globalSliceStart(getClass().getName(),22954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wxoowghpm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlxhlxlc8azu72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlxhlxlc8azu72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_nullObject_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22954,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wxoowghpm() throws Throwable{try{__CLR4_4_1hlxhlxlc8azu72.R.inc(22954);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22955);DateMidnight test = new DateMidnight((Object) null, PARIS);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22956);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22957);assertEquals(TEST_TIME_NOW_PARIS, test.getMillis());
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    /**
     * Test constructor (Object, DateTimeZone=null)
     */
    public void testConstructor_Object_nullDateTimeZone() throws Throwable {__CLR4_4_1hlxhlxlc8azu72.R.globalSliceStart(getClass().getName(),22958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_151w5y6hpq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlxhlxlc8azu72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlxhlxlc8azu72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_Object_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22958,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_151w5y6hpq() throws Throwable{try{__CLR4_4_1hlxhlxlc8azu72.R.inc(22958);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22959);Date date = new Date(TEST_TIME1_UTC);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22960);DateMidnight test = new DateMidnight(date, (DateTimeZone) null);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22961);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22962);assertEquals(TEST_TIME1_LONDON, test.getMillis());
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    /**
     * Test constructor (Object=null, DateTimeZone=null)
     */
    public void testConstructor_nullObject_nullDateTimeZone() throws Throwable {__CLR4_4_1hlxhlxlc8azu72.R.globalSliceStart(getClass().getName(),22963);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hv60h5hpv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlxhlxlc8azu72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlxhlxlc8azu72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_nullObject_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22963,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hv60h5hpv() throws Throwable{try{__CLR4_4_1hlxhlxlc8azu72.R.inc(22963);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22964);DateMidnight test = new DateMidnight((Object) null, (DateTimeZone) null);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22965);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22966);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis());
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    /**
     * Test constructor (Object, DateTimeZone)
     */
    public void testConstructor_badconverterObject_DateTimeZone() throws Throwable {__CLR4_4_1hlxhlxlc8azu72.R.globalSliceStart(getClass().getName(),22967);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bp24vwhpz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlxhlxlc8azu72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlxhlxlc8azu72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_badconverterObject_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22967,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bp24vwhpz() throws Throwable{try{__CLR4_4_1hlxhlxlc8azu72.R.inc(22967);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22968);try {
            __CLR4_4_1hlxhlxlc8azu72.R.inc(22969);ConverterManager.getInstance().addInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
            __CLR4_4_1hlxhlxlc8azu72.R.inc(22970);DateMidnight test = new DateMidnight(new Integer(0), GregorianChronology.getInstance());
            __CLR4_4_1hlxhlxlc8azu72.R.inc(22971);assertEquals(ISOChronology.getInstance(), test.getChronology());
            __CLR4_4_1hlxhlxlc8azu72.R.inc(22972);assertEquals(0L - DateTimeConstants.MILLIS_PER_HOUR, test.getMillis());
        } finally {
            __CLR4_4_1hlxhlxlc8azu72.R.inc(22973);ConverterManager.getInstance().removeInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
        }
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    /**
     * Test constructor (Object, Chronology)
     */
    public void testConstructor_Object_Chronology() throws Throwable {__CLR4_4_1hlxhlxlc8azu72.R.globalSliceStart(getClass().getName(),22974);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vmnvd4hq6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlxhlxlc8azu72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlxhlxlc8azu72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22974,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vmnvd4hq6() throws Throwable{try{__CLR4_4_1hlxhlxlc8azu72.R.inc(22974);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22975);Date date = new Date(TEST_TIME1_UTC);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22976);DateMidnight test = new DateMidnight(date, GregorianChronology.getInstance());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22977);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22978);assertEquals(TEST_TIME1_LONDON, test.getMillis());
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    /**
     * Test constructor (Object, Chronology)
     */
    public void testConstructor_invalidObject_Chronology() throws Throwable {__CLR4_4_1hlxhlxlc8azu72.R.globalSliceStart(getClass().getName(),22979);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fl36oxhqb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlxhlxlc8azu72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlxhlxlc8azu72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_invalidObject_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22979,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fl36oxhqb() throws Throwable{try{__CLR4_4_1hlxhlxlc8azu72.R.inc(22979);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22980);try {
            __CLR4_4_1hlxhlxlc8azu72.R.inc(22981);new DateMidnight(new Object(), GregorianChronology.getInstance());
            __CLR4_4_1hlxhlxlc8azu72.R.inc(22982);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    /**
     * Test constructor (Object=null, Chronology)
     */
    public void testConstructor_nullObject_Chronology() throws Throwable {__CLR4_4_1hlxhlxlc8azu72.R.globalSliceStart(getClass().getName(),22983);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14q0uynhqf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlxhlxlc8azu72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlxhlxlc8azu72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_nullObject_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22983,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14q0uynhqf() throws Throwable{try{__CLR4_4_1hlxhlxlc8azu72.R.inc(22983);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22984);DateMidnight test = new DateMidnight((Object) null, GregorianChronology.getInstance());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22985);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22986);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis());
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    /**
     * Test constructor (Object, Chronology=null)
     */
    public void testConstructor_Object_nullChronology() throws Throwable {__CLR4_4_1hlxhlxlc8azu72.R.globalSliceStart(getClass().getName(),22987);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yccijzhqj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlxhlxlc8azu72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlxhlxlc8azu72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_Object_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22987,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yccijzhqj() throws Throwable{try{__CLR4_4_1hlxhlxlc8azu72.R.inc(22987);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22988);Date date = new Date(TEST_TIME1_UTC);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22989);DateMidnight test = new DateMidnight(date, (Chronology) null);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22990);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22991);assertEquals(TEST_TIME1_LONDON, test.getMillis());
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    /**
     * Test constructor (Object=null, Chronology=null)
     */
    public void testConstructor_nullObject_nullChronology() throws Throwable {__CLR4_4_1hlxhlxlc8azu72.R.globalSliceStart(getClass().getName(),22992);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14dtve0hqo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlxhlxlc8azu72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlxhlxlc8azu72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_nullObject_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22992,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14dtve0hqo() throws Throwable{try{__CLR4_4_1hlxhlxlc8azu72.R.inc(22992);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22993);DateMidnight test = new DateMidnight((Object) null, (Chronology) null);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22994);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22995);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis());
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    /**
     * Test constructor (Object, Chronology)
     */
    public void testConstructor_badconverterObject_Chronology() throws Throwable {__CLR4_4_1hlxhlxlc8azu72.R.globalSliceStart(getClass().getName(),22996);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pyoqybhqs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlxhlxlc8azu72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlxhlxlc8azu72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_badconverterObject_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22996,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pyoqybhqs() throws Throwable{try{__CLR4_4_1hlxhlxlc8azu72.R.inc(22996);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(22997);try {
            __CLR4_4_1hlxhlxlc8azu72.R.inc(22998);ConverterManager.getInstance().addInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
            __CLR4_4_1hlxhlxlc8azu72.R.inc(22999);DateMidnight test = new DateMidnight(new Integer(0), GregorianChronology.getInstance());
            __CLR4_4_1hlxhlxlc8azu72.R.inc(23000);assertEquals(ISOChronology.getInstance(), test.getChronology());
            __CLR4_4_1hlxhlxlc8azu72.R.inc(23001);assertEquals(0L - DateTimeConstants.MILLIS_PER_HOUR, test.getMillis());
        } finally {
            __CLR4_4_1hlxhlxlc8azu72.R.inc(23002);ConverterManager.getInstance().removeInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
        }
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor (int, int, int)
     */
    public void testConstructor_int_int_int() throws Throwable {__CLR4_4_1hlxhlxlc8azu72.R.globalSliceStart(getClass().getName(),23003);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bd9uqnhqz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlxhlxlc8azu72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlxhlxlc8azu72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_int_int_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23003,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bd9uqnhqz() throws Throwable{try{__CLR4_4_1hlxhlxlc8azu72.R.inc(23003);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23004);DateMidnight test = new DateMidnight(2002, 6, 9);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23005);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23006);assertEquals(LONDON, test.getZone());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23007);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23008);assertEquals(2002, test.getYear());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23009);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23010);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23011);try {
            __CLR4_4_1hlxhlxlc8azu72.R.inc(23012);new DateMidnight(Integer.MIN_VALUE, 6, 9);
            __CLR4_4_1hlxhlxlc8azu72.R.inc(23013);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23014);try {
            __CLR4_4_1hlxhlxlc8azu72.R.inc(23015);new DateMidnight(Integer.MAX_VALUE, 6, 9);
            __CLR4_4_1hlxhlxlc8azu72.R.inc(23016);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23017);try {
            __CLR4_4_1hlxhlxlc8azu72.R.inc(23018);new DateMidnight(2002, 0, 9);
            __CLR4_4_1hlxhlxlc8azu72.R.inc(23019);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23020);try {
            __CLR4_4_1hlxhlxlc8azu72.R.inc(23021);new DateMidnight(2002, 13, 9);
            __CLR4_4_1hlxhlxlc8azu72.R.inc(23022);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23023);try {
            __CLR4_4_1hlxhlxlc8azu72.R.inc(23024);new DateMidnight(2002, 6, 0);
            __CLR4_4_1hlxhlxlc8azu72.R.inc(23025);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23026);try {
            __CLR4_4_1hlxhlxlc8azu72.R.inc(23027);new DateMidnight(2002, 6, 31);
            __CLR4_4_1hlxhlxlc8azu72.R.inc(23028);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23029);new DateMidnight(2002, 7, 31);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23030);try {
            __CLR4_4_1hlxhlxlc8azu72.R.inc(23031);new DateMidnight(2002, 7, 32);
            __CLR4_4_1hlxhlxlc8azu72.R.inc(23032);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, DateTimeZone)
     */
    public void testConstructor_int_int_int_DateTimeZone() throws Throwable {__CLR4_4_1hlxhlxlc8azu72.R.globalSliceStart(getClass().getName(),23033);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tzpqz9hrt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlxhlxlc8azu72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlxhlxlc8azu72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_int_int_int_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23033,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tzpqz9hrt() throws Throwable{try{__CLR4_4_1hlxhlxlc8azu72.R.inc(23033);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23034);DateMidnight test = new DateMidnight(2002, 6, 9, PARIS);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23035);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23036);assertEquals(TEST_TIME_NOW_PARIS, test.getMillis());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23037);assertEquals(2002, test.getYear());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23038);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23039);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23040);try {
            __CLR4_4_1hlxhlxlc8azu72.R.inc(23041);new DateMidnight(Integer.MIN_VALUE, 6, 9, PARIS);
            __CLR4_4_1hlxhlxlc8azu72.R.inc(23042);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23043);try {
            __CLR4_4_1hlxhlxlc8azu72.R.inc(23044);new DateMidnight(Integer.MAX_VALUE, 6, 9, PARIS);
            __CLR4_4_1hlxhlxlc8azu72.R.inc(23045);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23046);try {
            __CLR4_4_1hlxhlxlc8azu72.R.inc(23047);new DateMidnight(2002, 0, 9, PARIS);
            __CLR4_4_1hlxhlxlc8azu72.R.inc(23048);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23049);try {
            __CLR4_4_1hlxhlxlc8azu72.R.inc(23050);new DateMidnight(2002, 13, 9, PARIS);
            __CLR4_4_1hlxhlxlc8azu72.R.inc(23051);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23052);try {
            __CLR4_4_1hlxhlxlc8azu72.R.inc(23053);new DateMidnight(2002, 6, 0, PARIS);
            __CLR4_4_1hlxhlxlc8azu72.R.inc(23054);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23055);try {
            __CLR4_4_1hlxhlxlc8azu72.R.inc(23056);new DateMidnight(2002, 6, 31, PARIS);
            __CLR4_4_1hlxhlxlc8azu72.R.inc(23057);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23058);new DateMidnight(2002, 7, 31, PARIS);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23059);try {
            __CLR4_4_1hlxhlxlc8azu72.R.inc(23060);new DateMidnight(2002, 7, 32, PARIS);
            __CLR4_4_1hlxhlxlc8azu72.R.inc(23061);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, DateTimeZone=null)
     */
    public void testConstructor_int_int_int_nullDateTimeZone() throws Throwable {__CLR4_4_1hlxhlxlc8azu72.R.globalSliceStart(getClass().getName(),23062);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_180awskhsm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlxhlxlc8azu72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlxhlxlc8azu72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_int_int_int_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23062,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_180awskhsm() throws Throwable{try{__CLR4_4_1hlxhlxlc8azu72.R.inc(23062);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23063);DateMidnight test = new DateMidnight(2002, 6, 9, (DateTimeZone) null);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23064);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23065);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23066);assertEquals(2002, test.getYear());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23067);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23068);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, Chronology)
     */
    public void testConstructor_int_int_int_Chronology() throws Throwable {__CLR4_4_1hlxhlxlc8azu72.R.globalSliceStart(getClass().getName(),23069);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o62uzqhst();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlxhlxlc8azu72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlxhlxlc8azu72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_int_int_int_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23069,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o62uzqhst() throws Throwable{try{__CLR4_4_1hlxhlxlc8azu72.R.inc(23069);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23070);DateMidnight test = new DateMidnight(2002, 6, 9, GregorianChronology.getInstance());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23071);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23072);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23073);assertEquals(2002, test.getYear());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23074);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23075);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23076);try {
            __CLR4_4_1hlxhlxlc8azu72.R.inc(23077);new DateMidnight(Integer.MIN_VALUE, 6, 9, GregorianChronology.getInstance());
            __CLR4_4_1hlxhlxlc8azu72.R.inc(23078);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23079);try {
            __CLR4_4_1hlxhlxlc8azu72.R.inc(23080);new DateMidnight(Integer.MAX_VALUE, 6, 9, GregorianChronology.getInstance());
            __CLR4_4_1hlxhlxlc8azu72.R.inc(23081);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23082);try {
            __CLR4_4_1hlxhlxlc8azu72.R.inc(23083);new DateMidnight(2002, 0, 9, GregorianChronology.getInstance());
            __CLR4_4_1hlxhlxlc8azu72.R.inc(23084);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23085);try {
            __CLR4_4_1hlxhlxlc8azu72.R.inc(23086);new DateMidnight(2002, 13, 9, GregorianChronology.getInstance());
            __CLR4_4_1hlxhlxlc8azu72.R.inc(23087);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23088);try {
            __CLR4_4_1hlxhlxlc8azu72.R.inc(23089);new DateMidnight(2002, 6, 0, GregorianChronology.getInstance());
            __CLR4_4_1hlxhlxlc8azu72.R.inc(23090);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23091);try {
            __CLR4_4_1hlxhlxlc8azu72.R.inc(23092);new DateMidnight(2002, 6, 31, GregorianChronology.getInstance());
            __CLR4_4_1hlxhlxlc8azu72.R.inc(23093);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23094);new DateMidnight(2002, 7, 31, GregorianChronology.getInstance());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23095);try {
            __CLR4_4_1hlxhlxlc8azu72.R.inc(23096);new DateMidnight(2002, 7, 32, GregorianChronology.getInstance());
            __CLR4_4_1hlxhlxlc8azu72.R.inc(23097);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, Chronology=null)
     */
    public void testConstructor_int_int_int_nullChronology() throws Throwable {__CLR4_4_1hlxhlxlc8azu72.R.globalSliceStart(getClass().getName(),23098);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uph3gthtm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hlxhlxlc8azu72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hlxhlxlc8azu72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_int_int_int_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23098,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uph3gthtm() throws Throwable{try{__CLR4_4_1hlxhlxlc8azu72.R.inc(23098);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23099);DateMidnight test = new DateMidnight(2002, 6, 9, (Chronology) null);
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23100);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23101);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23102);assertEquals(2002, test.getYear());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23103);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1hlxhlxlc8azu72.R.inc(23104);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_1hlxhlxlc8azu72.R.flushNeeded();}}

}
