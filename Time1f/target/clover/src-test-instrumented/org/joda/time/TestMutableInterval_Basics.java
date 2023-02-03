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
package org.joda.time;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.base.AbstractInterval;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for Instant.
 *
 * @author Stephen Colebourne
 */
public class TestMutableInterval_Basics extends TestCase {static class __CLR4_4_1uglugllc8azvvp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,39765,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    
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

    public static void main(String[] args) {try{__CLR4_4_1uglugllc8azvvp.R.inc(39477);
        __CLR4_4_1uglugllc8azvvp.R.inc(39478);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1uglugllc8azvvp.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1uglugllc8azvvp.R.inc(39479);
        __CLR4_4_1uglugllc8azvvp.R.inc(39480);return new TestSuite(TestMutableInterval_Basics.class);
    }finally{__CLR4_4_1uglugllc8azvvp.R.flushNeeded();}}

    public TestMutableInterval_Basics(String name) {
        super(name);__CLR4_4_1uglugllc8azvvp.R.inc(39482);try{__CLR4_4_1uglugllc8azvvp.R.inc(39481);
    }finally{__CLR4_4_1uglugllc8azvvp.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1uglugllc8azvvp.R.inc(39483);
        __CLR4_4_1uglugllc8azvvp.R.inc(39484);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1uglugllc8azvvp.R.inc(39485);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1uglugllc8azvvp.R.inc(39486);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1uglugllc8azvvp.R.inc(39487);originalLocale = Locale.getDefault();
        __CLR4_4_1uglugllc8azvvp.R.inc(39488);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1uglugllc8azvvp.R.inc(39489);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1uglugllc8azvvp.R.inc(39490);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1uglugllc8azvvp.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1uglugllc8azvvp.R.inc(39491);
        __CLR4_4_1uglugllc8azvvp.R.inc(39492);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1uglugllc8azvvp.R.inc(39493);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1uglugllc8azvvp.R.inc(39494);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1uglugllc8azvvp.R.inc(39495);Locale.setDefault(originalLocale);
        __CLR4_4_1uglugllc8azvvp.R.inc(39496);originalDateTimeZone = null;
        __CLR4_4_1uglugllc8azvvp.R.inc(39497);originalTimeZone = null;
        __CLR4_4_1uglugllc8azvvp.R.inc(39498);originalLocale = null;
    }finally{__CLR4_4_1uglugllc8azvvp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testTest() {__CLR4_4_1uglugllc8azvvp.R.globalSliceStart(getClass().getName(),39499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqjuh7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uglugllc8azvvp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uglugllc8azvvp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39499,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqjuh7(){try{__CLR4_4_1uglugllc8azvvp.R.inc(39499);
        __CLR4_4_1uglugllc8azvvp.R.inc(39500);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
        __CLR4_4_1uglugllc8azvvp.R.inc(39501);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        __CLR4_4_1uglugllc8azvvp.R.inc(39502);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }finally{__CLR4_4_1uglugllc8azvvp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetMillis() {__CLR4_4_1uglugllc8azvvp.R.globalSliceStart(getClass().getName(),39503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18msyj5uhb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uglugllc8azvvp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uglugllc8azvvp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testGetMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39503,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18msyj5uhb(){try{__CLR4_4_1uglugllc8azvvp.R.inc(39503);
        __CLR4_4_1uglugllc8azvvp.R.inc(39504);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1uglugllc8azvvp.R.inc(39505);assertEquals(TEST_TIME1, test.getStartMillis());
        __CLR4_4_1uglugllc8azvvp.R.inc(39506);assertEquals(TEST_TIME1, test.getStart().getMillis());
        __CLR4_4_1uglugllc8azvvp.R.inc(39507);assertEquals(TEST_TIME2, test.getEndMillis());
        __CLR4_4_1uglugllc8azvvp.R.inc(39508);assertEquals(TEST_TIME2, test.getEnd().getMillis());
        __CLR4_4_1uglugllc8azvvp.R.inc(39509);assertEquals(TEST_TIME2 - TEST_TIME1, test.toDurationMillis());
        __CLR4_4_1uglugllc8azvvp.R.inc(39510);assertEquals(TEST_TIME2 - TEST_TIME1, test.toDuration().getMillis());
    }finally{__CLR4_4_1uglugllc8azvvp.R.flushNeeded();}}

    public void testGetDuration1() {__CLR4_4_1uglugllc8azvvp.R.globalSliceStart(getClass().getName(),39511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m16ym8uhj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uglugllc8azvvp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uglugllc8azvvp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testGetDuration1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39511,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m16ym8uhj(){try{__CLR4_4_1uglugllc8azvvp.R.inc(39511);
        __CLR4_4_1uglugllc8azvvp.R.inc(39512);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1uglugllc8azvvp.R.inc(39513);assertEquals(TEST_TIME2 - TEST_TIME1, test.toDurationMillis());
        __CLR4_4_1uglugllc8azvvp.R.inc(39514);assertEquals(TEST_TIME2 - TEST_TIME1, test.toDuration().getMillis());
    }finally{__CLR4_4_1uglugllc8azvvp.R.flushNeeded();}}

    public void testGetDuration2() {__CLR4_4_1uglugllc8azvvp.R.globalSliceStart(getClass().getName(),39515);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1is6ztruhn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uglugllc8azvvp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uglugllc8azvvp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testGetDuration2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39515,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1is6ztruhn(){try{__CLR4_4_1uglugllc8azvvp.R.inc(39515);
        __CLR4_4_1uglugllc8azvvp.R.inc(39516);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME1);
        __CLR4_4_1uglugllc8azvvp.R.inc(39517);assertSame(Duration.ZERO, test.toDuration());
    }finally{__CLR4_4_1uglugllc8azvvp.R.flushNeeded();}}

    public void testEqualsHashCode() {__CLR4_4_1uglugllc8azvvp.R.globalSliceStart(getClass().getName(),39518);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5in77uhq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uglugllc8azvvp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uglugllc8azvvp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testEqualsHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39518,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5in77uhq(){try{__CLR4_4_1uglugllc8azvvp.R.inc(39518);
        __CLR4_4_1uglugllc8azvvp.R.inc(39519);MutableInterval test1 = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1uglugllc8azvvp.R.inc(39520);MutableInterval test2 = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1uglugllc8azvvp.R.inc(39521);assertEquals(true, test1.equals(test2));
        __CLR4_4_1uglugllc8azvvp.R.inc(39522);assertEquals(true, test2.equals(test1));
        __CLR4_4_1uglugllc8azvvp.R.inc(39523);assertEquals(true, test1.equals(test1));
        __CLR4_4_1uglugllc8azvvp.R.inc(39524);assertEquals(true, test2.equals(test2));
        __CLR4_4_1uglugllc8azvvp.R.inc(39525);assertEquals(true, test1.hashCode() == test2.hashCode());
        __CLR4_4_1uglugllc8azvvp.R.inc(39526);assertEquals(true, test1.hashCode() == test1.hashCode());
        __CLR4_4_1uglugllc8azvvp.R.inc(39527);assertEquals(true, test2.hashCode() == test2.hashCode());
        
        __CLR4_4_1uglugllc8azvvp.R.inc(39528);MutableInterval test3 = new MutableInterval(TEST_TIME_NOW, TEST_TIME2);
        __CLR4_4_1uglugllc8azvvp.R.inc(39529);assertEquals(false, test1.equals(test3));
        __CLR4_4_1uglugllc8azvvp.R.inc(39530);assertEquals(false, test2.equals(test3));
        __CLR4_4_1uglugllc8azvvp.R.inc(39531);assertEquals(false, test3.equals(test1));
        __CLR4_4_1uglugllc8azvvp.R.inc(39532);assertEquals(false, test3.equals(test2));
        __CLR4_4_1uglugllc8azvvp.R.inc(39533);assertEquals(false, test1.hashCode() == test3.hashCode());
        __CLR4_4_1uglugllc8azvvp.R.inc(39534);assertEquals(false, test2.hashCode() == test3.hashCode());
        
        __CLR4_4_1uglugllc8azvvp.R.inc(39535);MutableInterval test4 = new MutableInterval(TEST_TIME1, TEST_TIME2, GJChronology.getInstance());
        __CLR4_4_1uglugllc8azvvp.R.inc(39536);assertEquals(true, test4.equals(test4));
        __CLR4_4_1uglugllc8azvvp.R.inc(39537);assertEquals(false, test1.equals(test4));
        __CLR4_4_1uglugllc8azvvp.R.inc(39538);assertEquals(false, test2.equals(test4));
        __CLR4_4_1uglugllc8azvvp.R.inc(39539);assertEquals(false, test4.equals(test1));
        __CLR4_4_1uglugllc8azvvp.R.inc(39540);assertEquals(false, test4.equals(test2));
        __CLR4_4_1uglugllc8azvvp.R.inc(39541);assertEquals(false, test1.hashCode() == test4.hashCode());
        __CLR4_4_1uglugllc8azvvp.R.inc(39542);assertEquals(false, test2.hashCode() == test4.hashCode());
        
        __CLR4_4_1uglugllc8azvvp.R.inc(39543);MutableInterval test5 = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1uglugllc8azvvp.R.inc(39544);assertEquals(true, test1.equals(test5));
        __CLR4_4_1uglugllc8azvvp.R.inc(39545);assertEquals(true, test2.equals(test5));
        __CLR4_4_1uglugllc8azvvp.R.inc(39546);assertEquals(false, test3.equals(test5));
        __CLR4_4_1uglugllc8azvvp.R.inc(39547);assertEquals(true, test5.equals(test1));
        __CLR4_4_1uglugllc8azvvp.R.inc(39548);assertEquals(true, test5.equals(test2));
        __CLR4_4_1uglugllc8azvvp.R.inc(39549);assertEquals(false, test5.equals(test3));
        __CLR4_4_1uglugllc8azvvp.R.inc(39550);assertEquals(true, test1.hashCode() == test5.hashCode());
        __CLR4_4_1uglugllc8azvvp.R.inc(39551);assertEquals(true, test2.hashCode() == test5.hashCode());
        __CLR4_4_1uglugllc8azvvp.R.inc(39552);assertEquals(false, test3.hashCode() == test5.hashCode());
        
        __CLR4_4_1uglugllc8azvvp.R.inc(39553);assertEquals(false, test1.equals("Hello"));
        __CLR4_4_1uglugllc8azvvp.R.inc(39554);assertEquals(true, test1.equals(new MockInterval()));
        __CLR4_4_1uglugllc8azvvp.R.inc(39555);assertEquals(false, test1.equals(new DateTime(TEST_TIME1)));
    }finally{__CLR4_4_1uglugllc8azvvp.R.flushNeeded();}}
    
    class MockInterval extends AbstractInterval {
        public MockInterval() {
            super();__CLR4_4_1uglugllc8azvvp.R.inc(39557);try{__CLR4_4_1uglugllc8azvvp.R.inc(39556);
        }finally{__CLR4_4_1uglugllc8azvvp.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1uglugllc8azvvp.R.inc(39558);
            __CLR4_4_1uglugllc8azvvp.R.inc(39559);return ISOChronology.getInstance();
        }finally{__CLR4_4_1uglugllc8azvvp.R.flushNeeded();}}
        public long getStartMillis() {try{__CLR4_4_1uglugllc8azvvp.R.inc(39560);
            __CLR4_4_1uglugllc8azvvp.R.inc(39561);return TEST_TIME1;
        }finally{__CLR4_4_1uglugllc8azvvp.R.flushNeeded();}}
        public long getEndMillis() {try{__CLR4_4_1uglugllc8azvvp.R.inc(39562);
            __CLR4_4_1uglugllc8azvvp.R.inc(39563);return TEST_TIME2;
        }finally{__CLR4_4_1uglugllc8azvvp.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    public void testContains_long() {__CLR4_4_1uglugllc8azvvp.R.globalSliceStart(getClass().getName(),39564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1651dm9uj0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uglugllc8azvvp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uglugllc8azvvp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testContains_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39564,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1651dm9uj0(){try{__CLR4_4_1uglugllc8azvvp.R.inc(39564);
        __CLR4_4_1uglugllc8azvvp.R.inc(39565);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1uglugllc8azvvp.R.inc(39566);assertEquals(true, test.contains(TEST_TIME1));
        __CLR4_4_1uglugllc8azvvp.R.inc(39567);assertEquals(false, test.contains(TEST_TIME1 - 1));
        __CLR4_4_1uglugllc8azvvp.R.inc(39568);assertEquals(true, test.contains(TEST_TIME1 + (TEST_TIME2 - TEST_TIME1) / 2));
        __CLR4_4_1uglugllc8azvvp.R.inc(39569);assertEquals(false, test.contains(TEST_TIME2));
        __CLR4_4_1uglugllc8azvvp.R.inc(39570);assertEquals(true, test.contains(TEST_TIME2 - 1));
    }finally{__CLR4_4_1uglugllc8azvvp.R.flushNeeded();}}

    public void testContainsNow() {__CLR4_4_1uglugllc8azvvp.R.globalSliceStart(getClass().getName(),39571);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ee80lwuj7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uglugllc8azvvp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uglugllc8azvvp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testContainsNow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39571,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ee80lwuj7(){try{__CLR4_4_1uglugllc8azvvp.R.inc(39571);
        __CLR4_4_1uglugllc8azvvp.R.inc(39572);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        
        __CLR4_4_1uglugllc8azvvp.R.inc(39573);DateTimeUtils.setCurrentMillisFixed(TEST_TIME1);
        __CLR4_4_1uglugllc8azvvp.R.inc(39574);assertEquals(true, test.containsNow());
        __CLR4_4_1uglugllc8azvvp.R.inc(39575);DateTimeUtils.setCurrentMillisFixed(TEST_TIME1 - 1);
        __CLR4_4_1uglugllc8azvvp.R.inc(39576);assertEquals(false, test.containsNow());
        __CLR4_4_1uglugllc8azvvp.R.inc(39577);DateTimeUtils.setCurrentMillisFixed(TEST_TIME1 + (TEST_TIME2 - TEST_TIME1) / 2);
        __CLR4_4_1uglugllc8azvvp.R.inc(39578);assertEquals(true, test.containsNow());
        __CLR4_4_1uglugllc8azvvp.R.inc(39579);DateTimeUtils.setCurrentMillisFixed(TEST_TIME2);
        __CLR4_4_1uglugllc8azvvp.R.inc(39580);assertEquals(false, test.containsNow());
        __CLR4_4_1uglugllc8azvvp.R.inc(39581);DateTimeUtils.setCurrentMillisFixed(TEST_TIME2 - 1);
        __CLR4_4_1uglugllc8azvvp.R.inc(39582);assertEquals(true, test.containsNow());
    }finally{__CLR4_4_1uglugllc8azvvp.R.flushNeeded();}}

    public void testContains_RI() {__CLR4_4_1uglugllc8azvvp.R.globalSliceStart(getClass().getName(),39583);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13g4e8cujj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uglugllc8azvvp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uglugllc8azvvp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testContains_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39583,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13g4e8cujj(){try{__CLR4_4_1uglugllc8azvvp.R.inc(39583);
        __CLR4_4_1uglugllc8azvvp.R.inc(39584);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1uglugllc8azvvp.R.inc(39585);assertEquals(true, test.contains(new Instant(TEST_TIME1)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39586);assertEquals(false, test.contains(new Instant(TEST_TIME1 - 1)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39587);assertEquals(true, test.contains(new Instant(TEST_TIME1 + (TEST_TIME2 - TEST_TIME1) / 2)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39588);assertEquals(false, test.contains(new Instant(TEST_TIME2)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39589);assertEquals(true, test.contains(new Instant(TEST_TIME2 - 1)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39590);assertEquals(true, test.contains((ReadableInstant) null));
    }finally{__CLR4_4_1uglugllc8azvvp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testContains_RInterval() {__CLR4_4_1uglugllc8azvvp.R.globalSliceStart(getClass().getName(),39591);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13h7jbkujr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uglugllc8azvvp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uglugllc8azvvp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testContains_RInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39591,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13h7jbkujr(){try{__CLR4_4_1uglugllc8azvvp.R.inc(39591);
        __CLR4_4_1uglugllc8azvvp.R.inc(39592);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        
        __CLR4_4_1uglugllc8azvvp.R.inc(39593);assertEquals(true, test.contains(new Interval(TEST_TIME1, TEST_TIME1)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39594);assertEquals(false, test.contains(new Interval(TEST_TIME1 - 1, TEST_TIME1)));
        
        __CLR4_4_1uglugllc8azvvp.R.inc(39595);assertEquals(true, test.contains(new Interval(TEST_TIME1, TEST_TIME1 + 1)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39596);assertEquals(false, test.contains(new Interval(TEST_TIME1 - 1, TEST_TIME1 + 1)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39597);assertEquals(true, test.contains(new Interval(TEST_TIME1 + 1, TEST_TIME1 + 1)));
        
        __CLR4_4_1uglugllc8azvvp.R.inc(39598);assertEquals(true, test.contains(new Interval(TEST_TIME1, TEST_TIME2)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39599);assertEquals(false, test.contains(new Interval(TEST_TIME1 - 1, TEST_TIME2)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39600);assertEquals(true, test.contains(new Interval(TEST_TIME1 + (TEST_TIME2 - TEST_TIME1) / 2, TEST_TIME2)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39601);assertEquals(false, test.contains(new Interval(TEST_TIME2, TEST_TIME2)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39602);assertEquals(true, test.contains(new Interval(TEST_TIME2 - 1, TEST_TIME2)));
        
        __CLR4_4_1uglugllc8azvvp.R.inc(39603);assertEquals(true, test.contains(new Interval(TEST_TIME1, TEST_TIME2 - 1)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39604);assertEquals(false, test.contains(new Interval(TEST_TIME1 - 1, TEST_TIME2 - 1)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39605);assertEquals(true, test.contains(new Interval(TEST_TIME1 + (TEST_TIME2 - TEST_TIME1) / 2, TEST_TIME2 - 1)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39606);assertEquals(true, test.contains(new Interval(TEST_TIME2 - 1, TEST_TIME2 - 1)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39607);assertEquals(true, test.contains(new Interval(TEST_TIME2 - 2, TEST_TIME2 - 1)));
        
        __CLR4_4_1uglugllc8azvvp.R.inc(39608);assertEquals(false, test.contains(new Interval(TEST_TIME1, TEST_TIME2 + 1)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39609);assertEquals(false, test.contains(new Interval(TEST_TIME1 - 1, TEST_TIME2 + 1)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39610);assertEquals(false, test.contains(new Interval(TEST_TIME1 + (TEST_TIME2 - TEST_TIME1) / 2, TEST_TIME2 + 1)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39611);assertEquals(false, test.contains(new Interval(TEST_TIME2, TEST_TIME2 + 1)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39612);assertEquals(false, test.contains(new Interval(TEST_TIME2 - 1, TEST_TIME2 + 1)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39613);assertEquals(false, test.contains(new Interval(TEST_TIME1 - 2, TEST_TIME1 - 1)));
        
        __CLR4_4_1uglugllc8azvvp.R.inc(39614);assertEquals(true, test.contains((ReadableInterval) null));
    }finally{__CLR4_4_1uglugllc8azvvp.R.flushNeeded();}}

    public void testOverlaps_RInterval() {__CLR4_4_1uglugllc8azvvp.R.globalSliceStart(getClass().getName(),39615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hyewlfukf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uglugllc8azvvp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uglugllc8azvvp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testOverlaps_RInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39615,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hyewlfukf(){try{__CLR4_4_1uglugllc8azvvp.R.inc(39615);
        __CLR4_4_1uglugllc8azvvp.R.inc(39616);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        
        __CLR4_4_1uglugllc8azvvp.R.inc(39617);assertEquals(false, test.overlaps(new Interval(TEST_TIME1, TEST_TIME1)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39618);assertEquals(false, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME1)));
        
        __CLR4_4_1uglugllc8azvvp.R.inc(39619);assertEquals(true, test.overlaps(new Interval(TEST_TIME1, TEST_TIME1 + 1)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39620);assertEquals(true, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME1 + 1)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39621);assertEquals(true, test.overlaps(new Interval(TEST_TIME1 + 1, TEST_TIME1 + 1)));
        
        __CLR4_4_1uglugllc8azvvp.R.inc(39622);assertEquals(true, test.overlaps(new Interval(TEST_TIME1, TEST_TIME2)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39623);assertEquals(true, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME2)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39624);assertEquals(true, test.overlaps(new Interval(TEST_TIME1 + (TEST_TIME2 - TEST_TIME1) / 2, TEST_TIME2)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39625);assertEquals(false, test.overlaps(new Interval(TEST_TIME2, TEST_TIME2)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39626);assertEquals(true, test.overlaps(new Interval(TEST_TIME2 - 1, TEST_TIME2)));
        
        __CLR4_4_1uglugllc8azvvp.R.inc(39627);assertEquals(true, test.overlaps(new Interval(TEST_TIME1, TEST_TIME2 + 1)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39628);assertEquals(true, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME2 + 1)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39629);assertEquals(true, test.overlaps(new Interval(TEST_TIME1 + (TEST_TIME2 - TEST_TIME1) / 2, TEST_TIME2 + 1)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39630);assertEquals(false, test.overlaps(new Interval(TEST_TIME2, TEST_TIME2 + 1)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39631);assertEquals(true, test.overlaps(new Interval(TEST_TIME2 - 1, TEST_TIME2 + 1)));
        
        __CLR4_4_1uglugllc8azvvp.R.inc(39632);assertEquals(false, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME1 - 1)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39633);assertEquals(false, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME1)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39634);assertEquals(true, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME1 + 1)));
        
        __CLR4_4_1uglugllc8azvvp.R.inc(39635);assertEquals(true, test.overlaps((ReadableInterval) null));
        
        __CLR4_4_1uglugllc8azvvp.R.inc(39636);MutableInterval empty = new MutableInterval(TEST_TIME1, TEST_TIME1);
        __CLR4_4_1uglugllc8azvvp.R.inc(39637);assertEquals(false, empty.overlaps(empty));
        __CLR4_4_1uglugllc8azvvp.R.inc(39638);assertEquals(false, empty.overlaps(test));
        __CLR4_4_1uglugllc8azvvp.R.inc(39639);assertEquals(false, test.overlaps(empty));
    }finally{__CLR4_4_1uglugllc8azvvp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testIsBefore_long() {__CLR4_4_1uglugllc8azvvp.R.globalSliceStart(getClass().getName(),39640);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ie6mpzul4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uglugllc8azvvp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uglugllc8azvvp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testIsBefore_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39640,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ie6mpzul4(){try{__CLR4_4_1uglugllc8azvvp.R.inc(39640);
        __CLR4_4_1uglugllc8azvvp.R.inc(39641);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        
        __CLR4_4_1uglugllc8azvvp.R.inc(39642);assertEquals(false, test.isBefore(TEST_TIME1 - 1));
        __CLR4_4_1uglugllc8azvvp.R.inc(39643);assertEquals(false, test.isBefore(TEST_TIME1));
        __CLR4_4_1uglugllc8azvvp.R.inc(39644);assertEquals(false, test.isBefore(TEST_TIME1 + 1));
        
        __CLR4_4_1uglugllc8azvvp.R.inc(39645);assertEquals(false, test.isBefore(TEST_TIME2 - 1));
        __CLR4_4_1uglugllc8azvvp.R.inc(39646);assertEquals(true, test.isBefore(TEST_TIME2));
        __CLR4_4_1uglugllc8azvvp.R.inc(39647);assertEquals(true, test.isBefore(TEST_TIME2 + 1));
    }finally{__CLR4_4_1uglugllc8azvvp.R.flushNeeded();}}

    public void testIsBeforeNow() {__CLR4_4_1uglugllc8azvvp.R.globalSliceStart(getClass().getName(),39648);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nh1we6ulc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uglugllc8azvvp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uglugllc8azvvp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testIsBeforeNow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39648,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nh1we6ulc(){try{__CLR4_4_1uglugllc8azvvp.R.inc(39648);
        __CLR4_4_1uglugllc8azvvp.R.inc(39649);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        
        __CLR4_4_1uglugllc8azvvp.R.inc(39650);DateTimeUtils.setCurrentMillisFixed(TEST_TIME2 - 1);
        __CLR4_4_1uglugllc8azvvp.R.inc(39651);assertEquals(false, test.isBeforeNow());
        __CLR4_4_1uglugllc8azvvp.R.inc(39652);DateTimeUtils.setCurrentMillisFixed(TEST_TIME2);
        __CLR4_4_1uglugllc8azvvp.R.inc(39653);assertEquals(true, test.isBeforeNow());
        __CLR4_4_1uglugllc8azvvp.R.inc(39654);DateTimeUtils.setCurrentMillisFixed(TEST_TIME2 + 1);
        __CLR4_4_1uglugllc8azvvp.R.inc(39655);assertEquals(true, test.isBeforeNow());
    }finally{__CLR4_4_1uglugllc8azvvp.R.flushNeeded();}}

    public void testIsBefore_RI() {__CLR4_4_1uglugllc8azvvp.R.globalSliceStart(getClass().getName(),39656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15mphjyulk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uglugllc8azvvp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uglugllc8azvvp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testIsBefore_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39656,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15mphjyulk(){try{__CLR4_4_1uglugllc8azvvp.R.inc(39656);
        __CLR4_4_1uglugllc8azvvp.R.inc(39657);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        
        __CLR4_4_1uglugllc8azvvp.R.inc(39658);assertEquals(false, test.isBefore(new Instant(TEST_TIME1 - 1)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39659);assertEquals(false, test.isBefore(new Instant(TEST_TIME1)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39660);assertEquals(false, test.isBefore(new Instant(TEST_TIME1 + 1)));
        
        __CLR4_4_1uglugllc8azvvp.R.inc(39661);assertEquals(false, test.isBefore(new Instant(TEST_TIME2 - 1)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39662);assertEquals(true, test.isBefore(new Instant(TEST_TIME2)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39663);assertEquals(true, test.isBefore(new Instant(TEST_TIME2 + 1)));
        
        __CLR4_4_1uglugllc8azvvp.R.inc(39664);assertEquals(false, test.isBefore((ReadableInstant) null));
    }finally{__CLR4_4_1uglugllc8azvvp.R.flushNeeded();}}

    public void testIsBefore_RInterval() {__CLR4_4_1uglugllc8azvvp.R.globalSliceStart(getClass().getName(),39665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14qlycmult();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uglugllc8azvvp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uglugllc8azvvp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testIsBefore_RInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39665,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14qlycmult(){try{__CLR4_4_1uglugllc8azvvp.R.inc(39665);
        __CLR4_4_1uglugllc8azvvp.R.inc(39666);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        
        __CLR4_4_1uglugllc8azvvp.R.inc(39667);assertEquals(false, test.isBefore(new Interval(Long.MIN_VALUE, TEST_TIME1 - 1)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39668);assertEquals(false, test.isBefore(new Interval(Long.MIN_VALUE, TEST_TIME1)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39669);assertEquals(false, test.isBefore(new Interval(Long.MIN_VALUE, TEST_TIME1 + 1)));
        
        __CLR4_4_1uglugllc8azvvp.R.inc(39670);assertEquals(false, test.isBefore(new Interval(TEST_TIME2 - 1, Long.MAX_VALUE)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39671);assertEquals(true, test.isBefore(new Interval(TEST_TIME2, Long.MAX_VALUE)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39672);assertEquals(true, test.isBefore(new Interval(TEST_TIME2 + 1, Long.MAX_VALUE)));
        
        __CLR4_4_1uglugllc8azvvp.R.inc(39673);assertEquals(false, test.isBefore((ReadableInterval) null));
    }finally{__CLR4_4_1uglugllc8azvvp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testIsAfter_long() {__CLR4_4_1uglugllc8azvvp.R.globalSliceStart(getClass().getName(),39674);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ehltpaum2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uglugllc8azvvp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uglugllc8azvvp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testIsAfter_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39674,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ehltpaum2(){try{__CLR4_4_1uglugllc8azvvp.R.inc(39674);
        __CLR4_4_1uglugllc8azvvp.R.inc(39675);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        
        __CLR4_4_1uglugllc8azvvp.R.inc(39676);assertEquals(true, test.isAfter(TEST_TIME1 - 1));
        __CLR4_4_1uglugllc8azvvp.R.inc(39677);assertEquals(false, test.isAfter(TEST_TIME1));
        __CLR4_4_1uglugllc8azvvp.R.inc(39678);assertEquals(false, test.isAfter(TEST_TIME1 + 1));
        
        __CLR4_4_1uglugllc8azvvp.R.inc(39679);assertEquals(false, test.isAfter(TEST_TIME2 - 1));
        __CLR4_4_1uglugllc8azvvp.R.inc(39680);assertEquals(false, test.isAfter(TEST_TIME2));
        __CLR4_4_1uglugllc8azvvp.R.inc(39681);assertEquals(false, test.isAfter(TEST_TIME2 + 1));
    }finally{__CLR4_4_1uglugllc8azvvp.R.flushNeeded();}}

    public void testIsAfterNow() {__CLR4_4_1uglugllc8azvvp.R.globalSliceStart(getClass().getName(),39682);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15bglzxuma();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uglugllc8azvvp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uglugllc8azvvp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testIsAfterNow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39682,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15bglzxuma(){try{__CLR4_4_1uglugllc8azvvp.R.inc(39682);
        __CLR4_4_1uglugllc8azvvp.R.inc(39683);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        
        __CLR4_4_1uglugllc8azvvp.R.inc(39684);DateTimeUtils.setCurrentMillisFixed(TEST_TIME1 - 1);
        __CLR4_4_1uglugllc8azvvp.R.inc(39685);assertEquals(true, test.isAfterNow());
        __CLR4_4_1uglugllc8azvvp.R.inc(39686);DateTimeUtils.setCurrentMillisFixed(TEST_TIME1);
        __CLR4_4_1uglugllc8azvvp.R.inc(39687);assertEquals(false, test.isAfterNow());
        __CLR4_4_1uglugllc8azvvp.R.inc(39688);DateTimeUtils.setCurrentMillisFixed(TEST_TIME1 + 1);
        __CLR4_4_1uglugllc8azvvp.R.inc(39689);assertEquals(false, test.isAfterNow());
    }finally{__CLR4_4_1uglugllc8azvvp.R.flushNeeded();}}

    public void testIsAfter_RI() {__CLR4_4_1uglugllc8azvvp.R.globalSliceStart(getClass().getName(),39690);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n5t0u5umi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uglugllc8azvvp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uglugllc8azvvp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testIsAfter_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39690,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n5t0u5umi(){try{__CLR4_4_1uglugllc8azvvp.R.inc(39690);
        __CLR4_4_1uglugllc8azvvp.R.inc(39691);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        
        __CLR4_4_1uglugllc8azvvp.R.inc(39692);assertEquals(true, test.isAfter(new Instant(TEST_TIME1 - 1)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39693);assertEquals(false, test.isAfter(new Instant(TEST_TIME1)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39694);assertEquals(false, test.isAfter(new Instant(TEST_TIME1 + 1)));
        
        __CLR4_4_1uglugllc8azvvp.R.inc(39695);assertEquals(false, test.isAfter(new Instant(TEST_TIME2 - 1)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39696);assertEquals(false, test.isAfter(new Instant(TEST_TIME2)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39697);assertEquals(false, test.isAfter(new Instant(TEST_TIME2 + 1)));
        
        __CLR4_4_1uglugllc8azvvp.R.inc(39698);assertEquals(false, test.isAfter((ReadableInstant) null));
    }finally{__CLR4_4_1uglugllc8azvvp.R.flushNeeded();}}

    public void testIsAfter_RInterval() {__CLR4_4_1uglugllc8azvvp.R.globalSliceStart(getClass().getName(),39699);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q8rfvlumr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uglugllc8azvvp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uglugllc8azvvp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testIsAfter_RInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39699,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q8rfvlumr(){try{__CLR4_4_1uglugllc8azvvp.R.inc(39699);
        __CLR4_4_1uglugllc8azvvp.R.inc(39700);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        
        __CLR4_4_1uglugllc8azvvp.R.inc(39701);assertEquals(true, test.isAfter(new Interval(Long.MIN_VALUE, TEST_TIME1 - 1)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39702);assertEquals(true, test.isAfter(new Interval(Long.MIN_VALUE, TEST_TIME1)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39703);assertEquals(false, test.isAfter(new Interval(Long.MIN_VALUE, TEST_TIME1 + 1)));
        
        __CLR4_4_1uglugllc8azvvp.R.inc(39704);assertEquals(false, test.isAfter(new Interval(TEST_TIME2 - 1, Long.MAX_VALUE)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39705);assertEquals(false, test.isAfter(new Interval(TEST_TIME2, Long.MAX_VALUE)));
        __CLR4_4_1uglugllc8azvvp.R.inc(39706);assertEquals(false, test.isAfter(new Interval(TEST_TIME2 + 1, Long.MAX_VALUE)));
        
        __CLR4_4_1uglugllc8azvvp.R.inc(39707);assertEquals(false, test.isAfter((ReadableInterval) null));
    }finally{__CLR4_4_1uglugllc8azvvp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToInterval1() {__CLR4_4_1uglugllc8azvvp.R.globalSliceStart(getClass().getName(),39708);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11u3ccmun0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uglugllc8azvvp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uglugllc8azvvp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testToInterval1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39708,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11u3ccmun0(){try{__CLR4_4_1uglugllc8azvvp.R.inc(39708);
        __CLR4_4_1uglugllc8azvvp.R.inc(39709);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);
        __CLR4_4_1uglugllc8azvvp.R.inc(39710);Interval result = test.toInterval();
        __CLR4_4_1uglugllc8azvvp.R.inc(39711);assertEquals(test, result);
    }finally{__CLR4_4_1uglugllc8azvvp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToMutableInterval1() {__CLR4_4_1uglugllc8azvvp.R.globalSliceStart(getClass().getName(),39712);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ukyyfaun4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uglugllc8azvvp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uglugllc8azvvp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testToMutableInterval1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39712,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ukyyfaun4(){try{__CLR4_4_1uglugllc8azvvp.R.inc(39712);
        __CLR4_4_1uglugllc8azvvp.R.inc(39713);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);
        __CLR4_4_1uglugllc8azvvp.R.inc(39714);MutableInterval result = test.toMutableInterval();
        __CLR4_4_1uglugllc8azvvp.R.inc(39715);assertEquals(test, result);
        __CLR4_4_1uglugllc8azvvp.R.inc(39716);assertNotSame(test, result);
    }finally{__CLR4_4_1uglugllc8azvvp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToPeriod() {__CLR4_4_1uglugllc8azvvp.R.globalSliceStart(getClass().getName(),39717);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cvhk17un9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uglugllc8azvvp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uglugllc8azvvp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testToPeriod",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39717,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cvhk17un9(){try{__CLR4_4_1uglugllc8azvvp.R.inc(39717);
        __CLR4_4_1uglugllc8azvvp.R.inc(39718);DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10, COPTIC_PARIS);
        __CLR4_4_1uglugllc8azvvp.R.inc(39719);DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18, COPTIC_PARIS);
        __CLR4_4_1uglugllc8azvvp.R.inc(39720);MutableInterval base = new MutableInterval(dt1, dt2);
        
        __CLR4_4_1uglugllc8azvvp.R.inc(39721);Period test = base.toPeriod();
        __CLR4_4_1uglugllc8azvvp.R.inc(39722);Period expected = new Period(dt1, dt2, PeriodType.standard());
        __CLR4_4_1uglugllc8azvvp.R.inc(39723);assertEquals(expected, test);
    }finally{__CLR4_4_1uglugllc8azvvp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToPeriod_PeriodType1() {__CLR4_4_1uglugllc8azvvp.R.globalSliceStart(getClass().getName(),39724);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iiup2sung();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uglugllc8azvvp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uglugllc8azvvp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testToPeriod_PeriodType1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39724,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iiup2sung(){try{__CLR4_4_1uglugllc8azvvp.R.inc(39724);
        __CLR4_4_1uglugllc8azvvp.R.inc(39725);DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10, COPTIC_PARIS);
        __CLR4_4_1uglugllc8azvvp.R.inc(39726);DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18, COPTIC_PARIS);
        __CLR4_4_1uglugllc8azvvp.R.inc(39727);MutableInterval base = new MutableInterval(dt1, dt2);
        
        __CLR4_4_1uglugllc8azvvp.R.inc(39728);Period test = base.toPeriod(null);
        __CLR4_4_1uglugllc8azvvp.R.inc(39729);Period expected = new Period(dt1, dt2, PeriodType.standard());
        __CLR4_4_1uglugllc8azvvp.R.inc(39730);assertEquals(expected, test);
    }finally{__CLR4_4_1uglugllc8azvvp.R.flushNeeded();}}

    public void testToPeriod_PeriodType2() {__CLR4_4_1uglugllc8azvvp.R.globalSliceStart(getClass().getName(),39731);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f9uqabunn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uglugllc8azvvp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uglugllc8azvvp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testToPeriod_PeriodType2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39731,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f9uqabunn(){try{__CLR4_4_1uglugllc8azvvp.R.inc(39731);
        __CLR4_4_1uglugllc8azvvp.R.inc(39732);DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10);
        __CLR4_4_1uglugllc8azvvp.R.inc(39733);DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18);
        __CLR4_4_1uglugllc8azvvp.R.inc(39734);MutableInterval base = new MutableInterval(dt1, dt2);
        
        __CLR4_4_1uglugllc8azvvp.R.inc(39735);Period test = base.toPeriod(PeriodType.yearWeekDayTime());
        __CLR4_4_1uglugllc8azvvp.R.inc(39736);Period expected = new Period(dt1, dt2, PeriodType.yearWeekDayTime());
        __CLR4_4_1uglugllc8azvvp.R.inc(39737);assertEquals(expected, test);
    }finally{__CLR4_4_1uglugllc8azvvp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSerialization() throws Exception {__CLR4_4_1uglugllc8azvvp.R.globalSliceStart(getClass().getName(),39738);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on9unu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uglugllc8azvvp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uglugllc8azvvp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39738,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on9unu() throws Exception{try{__CLR4_4_1uglugllc8azvvp.R.inc(39738);
        __CLR4_4_1uglugllc8azvvp.R.inc(39739);MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2);
        
        __CLR4_4_1uglugllc8azvvp.R.inc(39740);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1uglugllc8azvvp.R.inc(39741);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1uglugllc8azvvp.R.inc(39742);oos.writeObject(test);
        __CLR4_4_1uglugllc8azvvp.R.inc(39743);byte[] bytes = baos.toByteArray();
        __CLR4_4_1uglugllc8azvvp.R.inc(39744);oos.close();
        
        __CLR4_4_1uglugllc8azvvp.R.inc(39745);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1uglugllc8azvvp.R.inc(39746);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1uglugllc8azvvp.R.inc(39747);MutableInterval result = (MutableInterval) ois.readObject();
        __CLR4_4_1uglugllc8azvvp.R.inc(39748);ois.close();
        
        __CLR4_4_1uglugllc8azvvp.R.inc(39749);assertEquals(test, result);
    }finally{__CLR4_4_1uglugllc8azvvp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString() {__CLR4_4_1uglugllc8azvvp.R.globalSliceStart(getClass().getName(),39750);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdiduo6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uglugllc8azvvp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uglugllc8azvvp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39750,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdiduo6(){try{__CLR4_4_1uglugllc8azvvp.R.inc(39750);
        __CLR4_4_1uglugllc8azvvp.R.inc(39751);DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10, DateTimeZone.UTC);
        __CLR4_4_1uglugllc8azvvp.R.inc(39752);DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18, DateTimeZone.UTC);
        __CLR4_4_1uglugllc8azvvp.R.inc(39753);MutableInterval test = new MutableInterval(dt1, dt2);
        __CLR4_4_1uglugllc8azvvp.R.inc(39754);assertEquals("2004-06-09T07:08:09.010Z/2005-08-13T12:14:16.018Z", test.toString());
    }finally{__CLR4_4_1uglugllc8azvvp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testCopy() {__CLR4_4_1uglugllc8azvvp.R.globalSliceStart(getClass().getName(),39755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ukax6auob();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uglugllc8azvvp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uglugllc8azvvp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testCopy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39755,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ukax6auob(){try{__CLR4_4_1uglugllc8azvvp.R.inc(39755);
        __CLR4_4_1uglugllc8azvvp.R.inc(39756);MutableInterval test = new MutableInterval(123L, 456L, COPTIC_PARIS);
        __CLR4_4_1uglugllc8azvvp.R.inc(39757);MutableInterval cloned = test.copy();
        __CLR4_4_1uglugllc8azvvp.R.inc(39758);assertEquals(test, cloned);
        __CLR4_4_1uglugllc8azvvp.R.inc(39759);assertNotSame(test, cloned);
    }finally{__CLR4_4_1uglugllc8azvvp.R.flushNeeded();}}
    public void testClone() {__CLR4_4_1uglugllc8azvvp.R.globalSliceStart(getClass().getName(),39760);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1csyejyuog();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uglugllc8azvvp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uglugllc8azvvp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Basics.testClone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39760,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1csyejyuog(){try{__CLR4_4_1uglugllc8azvvp.R.inc(39760);
        __CLR4_4_1uglugllc8azvvp.R.inc(39761);MutableInterval test = new MutableInterval(123L, 456L, COPTIC_PARIS);
        __CLR4_4_1uglugllc8azvvp.R.inc(39762);MutableInterval cloned = (MutableInterval) test.clone();
        __CLR4_4_1uglugllc8azvvp.R.inc(39763);assertEquals(test, cloned);
        __CLR4_4_1uglugllc8azvvp.R.inc(39764);assertNotSame(test, cloned);
    }finally{__CLR4_4_1uglugllc8azvvp.R.flushNeeded();}}


}
