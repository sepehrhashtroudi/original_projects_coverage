/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2009 Stephen Colebourne
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

import org.joda.time.base.AbstractDuration;
import org.joda.time.base.BaseDuration;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for Duration.
 *
 * @author Stephen Colebourne
 */
public class TestDuration_Basics extends TestCase {static class __CLR4_4_1ly9ly9lc8azuq8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,28936,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

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

    public static void main(String[] args) {try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28449);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28450);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28451);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28452);return new TestSuite(TestDuration_Basics.class);
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    public TestDuration_Basics(String name) {
        super(name);__CLR4_4_1ly9ly9lc8azuq8.R.inc(28454);try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28453);
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28455);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28456);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28457);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28458);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28459);originalLocale = Locale.getDefault();
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28460);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28461);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28462);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28463);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28464);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28465);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28466);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28467);Locale.setDefault(originalLocale);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28468);originalDateTimeZone = null;
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28469);originalTimeZone = null;
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28470);originalLocale = null;
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testTest() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqjlyv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28471,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqjlyv(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28471);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28472);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28473);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28474);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetMillis() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28475);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18msyj5lyz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testGetMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28475,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18msyj5lyz(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28475);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28476);Duration test = new Duration(0L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28477);assertEquals(0, test.getMillis());
        
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28478);test = new Duration(1234567890L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28479);assertEquals(1234567890L, test.getMillis());
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    public void testEqualsHashCode() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28480);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5in77lz4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testEqualsHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28480,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5in77lz4(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28480);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28481);Duration test1 = new Duration(123L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28482);Duration test2 = new Duration(123L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28483);assertEquals(true, test1.equals(test2));
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28484);assertEquals(true, test2.equals(test1));
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28485);assertEquals(true, test1.equals(test1));
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28486);assertEquals(true, test2.equals(test2));
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28487);assertEquals(true, test1.hashCode() == test2.hashCode());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28488);assertEquals(true, test1.hashCode() == test1.hashCode());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28489);assertEquals(true, test2.hashCode() == test2.hashCode());
        
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28490);Duration test3 = new Duration(321L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28491);assertEquals(false, test1.equals(test3));
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28492);assertEquals(false, test2.equals(test3));
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28493);assertEquals(false, test3.equals(test1));
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28494);assertEquals(false, test3.equals(test2));
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28495);assertEquals(false, test1.hashCode() == test3.hashCode());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28496);assertEquals(false, test2.hashCode() == test3.hashCode());
        
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28497);assertEquals(false, test1.equals("Hello"));
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28498);assertEquals(true, test1.equals(new MockDuration(123L)));
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}
    
    class MockDuration extends AbstractDuration {
        private final long iValue;
        public MockDuration(long value) {
            super();__CLR4_4_1ly9ly9lc8azuq8.R.inc(28500);try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28499);
            __CLR4_4_1ly9ly9lc8azuq8.R.inc(28501);iValue = value;
        }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}
        public long getMillis() {try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28502);
            __CLR4_4_1ly9ly9lc8azuq8.R.inc(28503);return iValue;
        }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}
    }

    public void testCompareTo() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28504);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pz6vfvlzs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testCompareTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28504,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pz6vfvlzs(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28504);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28505);Duration test1 = new Duration(123L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28506);Duration test1a = new Duration(123L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28507);assertEquals(0, test1.compareTo(test1a));
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28508);assertEquals(0, test1a.compareTo(test1));
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28509);assertEquals(0, test1.compareTo(test1));
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28510);assertEquals(0, test1a.compareTo(test1a));
        
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28511);Duration test2 = new Duration(321L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28512);assertEquals(-1, test1.compareTo(test2));
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28513);assertEquals(+1, test2.compareTo(test1));
        
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28514);assertEquals(+1, test2.compareTo(new MockDuration(123L)));
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28515);assertEquals(0, test1.compareTo(new MockDuration(123L)));
        
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28516);try {
            __CLR4_4_1ly9ly9lc8azuq8.R.inc(28517);test1.compareTo(null);
            __CLR4_4_1ly9ly9lc8azuq8.R.inc(28518);fail();
        } catch (NullPointerException ex) {}
//        try {
//            test1.compareTo(new Long(123L));
//            fail();
//        } catch (ClassCastException ex) {}
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    public void testIsEqual() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28519);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s9e1z3m07();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testIsEqual",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28519,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s9e1z3m07(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28519);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28520);Duration test1 = new Duration(123L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28521);Duration test1a = new Duration(123L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28522);assertEquals(true, test1.isEqual(test1a));
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28523);assertEquals(true, test1a.isEqual(test1));
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28524);assertEquals(true, test1.isEqual(test1));
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28525);assertEquals(true, test1a.isEqual(test1a));
        
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28526);Duration test2 = new Duration(321L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28527);assertEquals(false, test1.isEqual(test2));
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28528);assertEquals(false, test2.isEqual(test1));
        
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28529);assertEquals(false, test2.isEqual(new MockDuration(123L)));
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28530);assertEquals(true, test1.isEqual(new MockDuration(123L)));
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28531);assertEquals(false, test1.isEqual(null));
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28532);assertEquals(true, new Duration(0L).isEqual(null));
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}
    
    public void testIsBefore() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28533);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11rmvj2m0l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testIsBefore",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28533,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11rmvj2m0l(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28533);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28534);Duration test1 = new Duration(123L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28535);Duration test1a = new Duration(123L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28536);assertEquals(false, test1.isShorterThan(test1a));
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28537);assertEquals(false, test1a.isShorterThan(test1));
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28538);assertEquals(false, test1.isShorterThan(test1));
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28539);assertEquals(false, test1a.isShorterThan(test1a));
        
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28540);Duration test2 = new Duration(321L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28541);assertEquals(true, test1.isShorterThan(test2));
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28542);assertEquals(false, test2.isShorterThan(test1));
        
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28543);assertEquals(false, test2.isShorterThan(new MockDuration(123L)));
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28544);assertEquals(false, test1.isShorterThan(new MockDuration(123L)));
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28545);assertEquals(false, test1.isShorterThan(null));
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28546);assertEquals(false, new Duration(0L).isShorterThan(null));
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}
    
    public void testIsAfter() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28547);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ax1icnm0z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testIsAfter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28547,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ax1icnm0z(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28547);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28548);Duration test1 = new Duration(123L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28549);Duration test1a = new Duration(123L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28550);assertEquals(false, test1.isLongerThan(test1a));
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28551);assertEquals(false, test1a.isLongerThan(test1));
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28552);assertEquals(false, test1.isLongerThan(test1));
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28553);assertEquals(false, test1a.isLongerThan(test1a));
        
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28554);Duration test2 = new Duration(321L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28555);assertEquals(false, test1.isLongerThan(test2));
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28556);assertEquals(true, test2.isLongerThan(test1));
        
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28557);assertEquals(true, test2.isLongerThan(new MockDuration(123L)));
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28558);assertEquals(false, test1.isLongerThan(new MockDuration(123L)));
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28559);assertEquals(true, test1.isLongerThan(null));
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28560);assertEquals(false, new Duration(0L).isLongerThan(null));
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testSerialization() throws Exception {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on9m1d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28561,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on9m1d() throws Exception{try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28561);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28562);Duration test = new Duration(123L);
        
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28563);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28564);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28565);oos.writeObject(test);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28566);byte[] bytes = baos.toByteArray();
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28567);oos.close();
        
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28568);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28569);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28570);Duration result = (Duration) ois.readObject();
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28571);ois.close();
        
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28572);assertEquals(test, result);
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetStandardSeconds() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28573);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xedhmjm1p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testGetStandardSeconds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28573,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xedhmjm1p(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28573);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28574);Duration test = new Duration(0L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28575);assertEquals(0, test.getStandardSeconds());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28576);test = new Duration(1L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28577);assertEquals(0, test.getStandardSeconds());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28578);test = new Duration(999L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28579);assertEquals(0, test.getStandardSeconds());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28580);test = new Duration(1000L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28581);assertEquals(1, test.getStandardSeconds());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28582);test = new Duration(1001L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28583);assertEquals(1, test.getStandardSeconds());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28584);test = new Duration(1999L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28585);assertEquals(1, test.getStandardSeconds());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28586);test = new Duration(2000L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28587);assertEquals(2, test.getStandardSeconds());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28588);test = new Duration(-1L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28589);assertEquals(0, test.getStandardSeconds());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28590);test = new Duration(-999L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28591);assertEquals(0, test.getStandardSeconds());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28592);test = new Duration(-1000L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28593);assertEquals(-1, test.getStandardSeconds());
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28594);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdidm2a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28594,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdidm2a(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28594);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28595);long length = (365L + 2L * 30L + 3L * 7L + 4L) * DateTimeConstants.MILLIS_PER_DAY +
            5L * DateTimeConstants.MILLIS_PER_HOUR +
            6L * DateTimeConstants.MILLIS_PER_MINUTE +
            7L * DateTimeConstants.MILLIS_PER_SECOND + 845L;
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28596);Duration test = new Duration(length);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28597);assertEquals("PT" + (length / 1000) + "." + (length % 1000) + "S", test.toString());
        
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28598);assertEquals("PT0S", new Duration(0L).toString());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28599);assertEquals("PT10S", new Duration(10000L).toString());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28600);assertEquals("PT1S", new Duration(1000L).toString());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28601);assertEquals("PT12.345S", new Duration(12345L).toString());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28602);assertEquals("PT-12.345S", new Duration(-12345L).toString());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28603);assertEquals("PT-1.123S", new Duration(-1123L).toString());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28604);assertEquals("PT-0.123S", new Duration(-123L).toString());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28605);assertEquals("PT-0.012S", new Duration(-12L).toString());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28606);assertEquals("PT-0.001S", new Duration(-1L).toString());
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToDuration1() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28607);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t6q9xlm2n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToDuration1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28607,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t6q9xlm2n(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28607);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28608);Duration test = new Duration(123L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28609);Duration result = test.toDuration();
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28610);assertSame(test, result);
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}
    
    public void testToDuration2() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28611);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pxqb54m2r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToDuration2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28611,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pxqb54m2r(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28611);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28612);MockDuration test = new MockDuration(123L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28613);Duration result = test.toDuration();
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28614);assertNotSame(test, result);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28615);assertEquals(test, result);
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToStandardDays() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28616);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eftdm0m2w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToStandardDays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28616,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eftdm0m2w(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28616);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28617);Duration test = new Duration(0L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28618);assertEquals(Days.days(0), test.toStandardDays());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28619);test = new Duration(1L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28620);assertEquals(Days.days(0), test.toStandardDays());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28621);test = new Duration(24 * 60 * 60000L - 1);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28622);assertEquals(Days.days(0), test.toStandardDays());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28623);test = new Duration(24 * 60 * 60000L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28624);assertEquals(Days.days(1), test.toStandardDays());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28625);test = new Duration(24 * 60 * 60000L + 1);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28626);assertEquals(Days.days(1), test.toStandardDays());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28627);test = new Duration(2 * 24 * 60 * 60000L - 1);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28628);assertEquals(Days.days(1), test.toStandardDays());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28629);test = new Duration(2 * 24 * 60 * 60000L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28630);assertEquals(Days.days(2), test.toStandardDays());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28631);test = new Duration(-1L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28632);assertEquals(Days.days(0), test.toStandardDays());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28633);test = new Duration(-24 * 60 * 60000L + 1);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28634);assertEquals(Days.days(0), test.toStandardDays());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28635);test = new Duration(-24 * 60 * 60000L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28636);assertEquals(Days.days(-1), test.toStandardDays());
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    public void testToStandardDays_overflow() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28637);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cz48ufm3h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToStandardDays_overflow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28637,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cz48ufm3h(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28637);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28638);Duration test = new Duration((((long) Integer.MAX_VALUE) + 1) * 24L * 60L * 60000L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28639);try {
            __CLR4_4_1ly9ly9lc8azuq8.R.inc(28640);test.toStandardDays();
            __CLR4_4_1ly9ly9lc8azuq8.R.inc(28641);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToStandardHours() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ikk7gm3m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToStandardHours",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28642,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ikk7gm3m(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28642);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28643);Duration test = new Duration(0L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28644);assertEquals(Hours.hours(0), test.toStandardHours());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28645);test = new Duration(1L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28646);assertEquals(Hours.hours(0), test.toStandardHours());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28647);test = new Duration(3600000L - 1);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28648);assertEquals(Hours.hours(0), test.toStandardHours());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28649);test = new Duration(3600000L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28650);assertEquals(Hours.hours(1), test.toStandardHours());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28651);test = new Duration(3600000L + 1);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28652);assertEquals(Hours.hours(1), test.toStandardHours());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28653);test = new Duration(2 * 3600000L - 1);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28654);assertEquals(Hours.hours(1), test.toStandardHours());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28655);test = new Duration(2 * 3600000L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28656);assertEquals(Hours.hours(2), test.toStandardHours());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28657);test = new Duration(-1L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28658);assertEquals(Hours.hours(0), test.toStandardHours());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28659);test = new Duration(-3600000L + 1);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28660);assertEquals(Hours.hours(0), test.toStandardHours());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28661);test = new Duration(-3600000L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28662);assertEquals(Hours.hours(-1), test.toStandardHours());
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    public void testToStandardHours_overflow() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28663);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gymaxpm47();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToStandardHours_overflow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28663,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gymaxpm47(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28663);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28664);Duration test = new Duration(((long) Integer.MAX_VALUE) * 3600000L + 3600000L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28665);try {
            __CLR4_4_1ly9ly9lc8azuq8.R.inc(28666);test.toStandardHours();
            __CLR4_4_1ly9ly9lc8azuq8.R.inc(28667);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToStandardMinutes() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28668);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r0kt44m4c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToStandardMinutes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28668,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r0kt44m4c(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28668);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28669);Duration test = new Duration(0L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28670);assertEquals(Minutes.minutes(0), test.toStandardMinutes());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28671);test = new Duration(1L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28672);assertEquals(Minutes.minutes(0), test.toStandardMinutes());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28673);test = new Duration(60000L - 1);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28674);assertEquals(Minutes.minutes(0), test.toStandardMinutes());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28675);test = new Duration(60000L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28676);assertEquals(Minutes.minutes(1), test.toStandardMinutes());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28677);test = new Duration(60000L + 1);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28678);assertEquals(Minutes.minutes(1), test.toStandardMinutes());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28679);test = new Duration(2 * 60000L - 1);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28680);assertEquals(Minutes.minutes(1), test.toStandardMinutes());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28681);test = new Duration(2 * 60000L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28682);assertEquals(Minutes.minutes(2), test.toStandardMinutes());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28683);test = new Duration(-1L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28684);assertEquals(Minutes.minutes(0), test.toStandardMinutes());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28685);test = new Duration(-60000L + 1);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28686);assertEquals(Minutes.minutes(0), test.toStandardMinutes());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28687);test = new Duration(-60000L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28688);assertEquals(Minutes.minutes(-1), test.toStandardMinutes());
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    public void testToStandardMinutes_overflow() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mpi1g3m4x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToStandardMinutes_overflow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28689,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mpi1g3m4x(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28689);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28690);Duration test = new Duration(((long) Integer.MAX_VALUE) * 60000L + 60000L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28691);try {
            __CLR4_4_1ly9ly9lc8azuq8.R.inc(28692);test.toStandardMinutes();
            __CLR4_4_1ly9ly9lc8azuq8.R.inc(28693);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToStandardSeconds() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1emeoqsm52();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToStandardSeconds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28694,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1emeoqsm52(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28694);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28695);Duration test = new Duration(0L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28696);assertEquals(Seconds.seconds(0), test.toStandardSeconds());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28697);test = new Duration(1L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28698);assertEquals(Seconds.seconds(0), test.toStandardSeconds());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28699);test = new Duration(999L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28700);assertEquals(Seconds.seconds(0), test.toStandardSeconds());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28701);test = new Duration(1000L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28702);assertEquals(Seconds.seconds(1), test.toStandardSeconds());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28703);test = new Duration(1001L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28704);assertEquals(Seconds.seconds(1), test.toStandardSeconds());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28705);test = new Duration(1999L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28706);assertEquals(Seconds.seconds(1), test.toStandardSeconds());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28707);test = new Duration(2000L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28708);assertEquals(Seconds.seconds(2), test.toStandardSeconds());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28709);test = new Duration(-1L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28710);assertEquals(Seconds.seconds(0), test.toStandardSeconds());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28711);test = new Duration(-999L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28712);assertEquals(Seconds.seconds(0), test.toStandardSeconds());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28713);test = new Duration(-1000L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28714);assertEquals(Seconds.seconds(-1), test.toStandardSeconds());
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    public void testToStandardSeconds_overflow() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28715);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1laykzxm5n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToStandardSeconds_overflow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28715,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1laykzxm5n(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28715);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28716);Duration test = new Duration(((long) Integer.MAX_VALUE) * 1000L + 1000L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28717);try {
            __CLR4_4_1ly9ly9lc8azuq8.R.inc(28718);test.toStandardSeconds();
            __CLR4_4_1ly9ly9lc8azuq8.R.inc(28719);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToPeriod() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28720);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cvhk17m5s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriod",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28720,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cvhk17m5s(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28720);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28721);DateTimeZone zone = DateTimeZone.getDefault();
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28722);try {
            __CLR4_4_1ly9ly9lc8azuq8.R.inc(28723);DateTimeZone.setDefault(DateTimeZone.forID("Europe/Paris"));
            __CLR4_4_1ly9ly9lc8azuq8.R.inc(28724);long length =
                (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
                5L * DateTimeConstants.MILLIS_PER_HOUR +
                6L * DateTimeConstants.MILLIS_PER_MINUTE +
                7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
            __CLR4_4_1ly9ly9lc8azuq8.R.inc(28725);Duration dur = new Duration(length);
            __CLR4_4_1ly9ly9lc8azuq8.R.inc(28726);Period test = dur.toPeriod();
            __CLR4_4_1ly9ly9lc8azuq8.R.inc(28727);assertEquals(0, test.getYears());  // (4 + (3 * 7) + (2 * 30) + 365) == 450
            __CLR4_4_1ly9ly9lc8azuq8.R.inc(28728);assertEquals(0, test.getMonths());
            __CLR4_4_1ly9ly9lc8azuq8.R.inc(28729);assertEquals(0, test.getWeeks());
            __CLR4_4_1ly9ly9lc8azuq8.R.inc(28730);assertEquals(0, test.getDays());
            __CLR4_4_1ly9ly9lc8azuq8.R.inc(28731);assertEquals((450 * 24) + 5, test.getHours());
            __CLR4_4_1ly9ly9lc8azuq8.R.inc(28732);assertEquals(6, test.getMinutes());
            __CLR4_4_1ly9ly9lc8azuq8.R.inc(28733);assertEquals(7, test.getSeconds());
            __CLR4_4_1ly9ly9lc8azuq8.R.inc(28734);assertEquals(8, test.getMillis());
        } finally {
            __CLR4_4_1ly9ly9lc8azuq8.R.inc(28735);DateTimeZone.setDefault(zone);
        }
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    public void testToPeriod_fixedZone() throws Throwable {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tl9022m68();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriod_fixedZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28736,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tl9022m68() throws Throwable{try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28736);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28737);DateTimeZone zone = DateTimeZone.getDefault();
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28738);try {
            __CLR4_4_1ly9ly9lc8azuq8.R.inc(28739);DateTimeZone.setDefault(DateTimeZone.forOffsetHours(2));
            __CLR4_4_1ly9ly9lc8azuq8.R.inc(28740);long length =
                (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
                5L * DateTimeConstants.MILLIS_PER_HOUR +
                6L * DateTimeConstants.MILLIS_PER_MINUTE +
                7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
            __CLR4_4_1ly9ly9lc8azuq8.R.inc(28741);Duration dur = new Duration(length);
            __CLR4_4_1ly9ly9lc8azuq8.R.inc(28742);Period test = dur.toPeriod();
            __CLR4_4_1ly9ly9lc8azuq8.R.inc(28743);assertEquals(0, test.getYears());  // (4 + (3 * 7) + (2 * 30) + 365) == 450
            __CLR4_4_1ly9ly9lc8azuq8.R.inc(28744);assertEquals(0, test.getMonths());
            __CLR4_4_1ly9ly9lc8azuq8.R.inc(28745);assertEquals(0, test.getWeeks());
            __CLR4_4_1ly9ly9lc8azuq8.R.inc(28746);assertEquals(0, test.getDays());
            __CLR4_4_1ly9ly9lc8azuq8.R.inc(28747);assertEquals((450 * 24) + 5, test.getHours());
            __CLR4_4_1ly9ly9lc8azuq8.R.inc(28748);assertEquals(6, test.getMinutes());
            __CLR4_4_1ly9ly9lc8azuq8.R.inc(28749);assertEquals(7, test.getSeconds());
            __CLR4_4_1ly9ly9lc8azuq8.R.inc(28750);assertEquals(8, test.getMillis());
        } finally {
            __CLR4_4_1ly9ly9lc8azuq8.R.inc(28751);DateTimeZone.setDefault(zone);
        }
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToPeriod_PeriodType() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28752);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18qw3n1m6o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriod_PeriodType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28752,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18qw3n1m6o(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28752);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28753);long length =
            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
            5L * DateTimeConstants.MILLIS_PER_HOUR +
            6L * DateTimeConstants.MILLIS_PER_MINUTE +
            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28754);Duration test = new Duration(length);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28755);Period result = test.toPeriod(PeriodType.standard().withMillisRemoved());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28756);assertEquals(new Period(test, PeriodType.standard().withMillisRemoved()), result);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28757);assertEquals(new Period(test.getMillis(), PeriodType.standard().withMillisRemoved()), result);
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToPeriod_Chronology() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x3hzjkm6u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriod_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28758,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x3hzjkm6u(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28758);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28759);long length =
            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
            5L * DateTimeConstants.MILLIS_PER_HOUR +
            6L * DateTimeConstants.MILLIS_PER_MINUTE +
            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28760);Duration test = new Duration(length);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28761);Period result = test.toPeriod(ISOChronology.getInstanceUTC());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28762);assertEquals(new Period(test, ISOChronology.getInstanceUTC()), result);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28763);assertEquals(new Period(test.getMillis(), ISOChronology.getInstanceUTC()), result);
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToPeriod_PeriodType_Chronology() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28764);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mvctlam70();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriod_PeriodType_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28764,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mvctlam70(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28764);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28765);long length =
            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
            5L * DateTimeConstants.MILLIS_PER_HOUR +
            6L * DateTimeConstants.MILLIS_PER_MINUTE +
            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28766);Duration test = new Duration(length);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28767);Period result = test.toPeriod(PeriodType.standard().withMillisRemoved(), ISOChronology.getInstanceUTC());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28768);assertEquals(new Period(test, PeriodType.standard().withMillisRemoved(), ISOChronology.getInstanceUTC()), result);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28769);assertEquals(new Period(test.getMillis(), PeriodType.standard().withMillisRemoved(), ISOChronology.getInstanceUTC()), result);
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToPeriodFrom() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oimx27m76();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriodFrom",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28770,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oimx27m76(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28770);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28771);long length =
            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
            5L * DateTimeConstants.MILLIS_PER_HOUR +
            6L * DateTimeConstants.MILLIS_PER_MINUTE +
            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28772);Duration test = new Duration(length);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28773);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28774);Period result = test.toPeriodFrom(dt);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28775);assertEquals(new Period(dt, test), result);
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToPeriodFrom_PeriodType() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28776);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wha9mfm7c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriodFrom_PeriodType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28776,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wha9mfm7c(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28776);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28777);long length =
            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
            5L * DateTimeConstants.MILLIS_PER_HOUR +
            6L * DateTimeConstants.MILLIS_PER_MINUTE +
            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28778);Duration test = new Duration(length);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28779);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28780);Period result = test.toPeriodFrom(dt, PeriodType.standard().withMillisRemoved());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28781);assertEquals(new Period(dt, test, PeriodType.standard().withMillisRemoved()), result);
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToPeriodTo() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28782);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17og55cm7i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriodTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28782,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17og55cm7i(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28782);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28783);long length =
            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
            5L * DateTimeConstants.MILLIS_PER_HOUR +
            6L * DateTimeConstants.MILLIS_PER_MINUTE +
            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28784);Duration test = new Duration(length);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28785);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28786);Period result = test.toPeriodTo(dt);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28787);assertEquals(new Period(test, dt), result);
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToPeriodTo_PeriodType() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28788);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x3ugvsm7o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToPeriodTo_PeriodType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28788,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x3ugvsm7o(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28788);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28789);long length =
            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
            5L * DateTimeConstants.MILLIS_PER_HOUR +
            6L * DateTimeConstants.MILLIS_PER_MINUTE +
            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28790);Duration test = new Duration(length);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28791);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28792);Period result = test.toPeriodTo(dt, PeriodType.standard().withMillisRemoved());
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28793);assertEquals(new Period(test, dt, PeriodType.standard().withMillisRemoved()), result);
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToIntervalFrom() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14up6n1m7u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToIntervalFrom",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28794,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14up6n1m7u(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28794);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28795);long length =
            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
            5L * DateTimeConstants.MILLIS_PER_HOUR +
            6L * DateTimeConstants.MILLIS_PER_MINUTE +
            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28796);Duration test = new Duration(length);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28797);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28798);Interval result = test.toIntervalFrom(dt);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28799);assertEquals(new Interval(dt, test), result);
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToIntervalTo() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bhtktom80();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testToIntervalTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28800,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bhtktom80(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28800);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28801);long length =
            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
            5L * DateTimeConstants.MILLIS_PER_HOUR +
            6L * DateTimeConstants.MILLIS_PER_MINUTE +
            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28802);Duration test = new Duration(length);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28803);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28804);Interval result = test.toIntervalTo(dt);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28805);assertEquals(new Interval(test, dt), result);
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithMillis1() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28806);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iq74e2m86();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithMillis1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28806,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iq74e2m86(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28806);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28807);Duration test = new Duration(123L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28808);Duration result = test.withMillis(123L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28809);assertSame(test, result);
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    public void testWithMillis2() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lz736jm8a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithMillis2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28810,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lz736jm8a(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28810);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28811);Duration test = new Duration(123L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28812);Duration result = test.withMillis(1234567890L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28813);assertEquals(1234567890L, result.getMillis());
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithDurationAdded_long_int1() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28814);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15x9qv3m8e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithDurationAdded_long_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28814,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15x9qv3m8e(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28814);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28815);Duration test = new Duration(123L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28816);Duration result = test.withDurationAdded(8000L, 1);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28817);assertEquals(8123L, result.getMillis());
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    public void testWithDurationAdded_long_int2() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28818);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12o9s2mm8i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithDurationAdded_long_int2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28818,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12o9s2mm8i(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28818);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28819);Duration test = new Duration(123L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28820);Duration result = test.withDurationAdded(8000L, 2);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28821);assertEquals(16123L, result.getMillis());
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    public void testWithDurationAdded_long_int3() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28822);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kq6pvm8m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithDurationAdded_long_int3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28822,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kq6pvm8m(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28822);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28823);Duration test = new Duration(123L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28824);Duration result = test.withDurationAdded(8000L, -1);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28825);assertEquals((123L - 8000L), result.getMillis());
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    public void testWithDurationAdded_long_int4() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28826);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13tq5icm8q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithDurationAdded_long_int4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28826,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13tq5icm8q(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28826);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28827);Duration test = new Duration(123L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28828);Duration result = test.withDurationAdded(0L, 1);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28829);assertSame(test, result);
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    public void testWithDurationAdded_long_int5() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_172q4atm8u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithDurationAdded_long_int5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28830,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_172q4atm8u(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28830);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28831);Duration test = new Duration(123L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28832);Duration result = test.withDurationAdded(8000L, 0);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28833);assertSame(test, result);
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPlus_long1() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28834);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x1g32hm8y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testPlus_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28834,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x1g32hm8y(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28834);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28835);Duration test = new Duration(123L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28836);Duration result = test.plus(8000L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28837);assertEquals(8123L, result.getMillis());
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    public void testPlus_long2() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28838);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yqo046m92();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testPlus_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28838,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yqo046m92(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28838);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28839);Duration test = new Duration(123L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28840);Duration result = test.plus(0L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28841);assertSame(test, result);
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testMinus_long1() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28842);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1897ts5m96();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMinus_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28842,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1897ts5m96(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28842);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28843);Duration test = new Duration(123L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28844);Duration result = test.minus(8000L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28845);assertEquals(123L - 8000L, result.getMillis());
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    public void testMinus_long2() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1507uzom9a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMinus_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28846,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1507uzom9a(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28846);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28847);Duration test = new Duration(123L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28848);Duration result = test.minus(0L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28849);assertSame(test, result);
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testMultipliedBy_long1() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28850);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gr9difm9e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMultipliedBy_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28850,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gr9difm9e(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28850);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28851);Duration test = new Duration(123L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28852);Duration result = test.multipliedBy(2L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28853);assertEquals(246L, result.getMillis());
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    public void testMultipliedBy_long2() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1di9epym9i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMultipliedBy_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28854,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1di9epym9i(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28854);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28855);Duration test = new Duration(123L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28856);Duration result = test.multipliedBy(1L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28857);assertSame(test, result);
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testDividedBy_long1() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oczpjhm9m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testDividedBy_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28858,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oczpjhm9m(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28858);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28859);Duration test = new Duration(246L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28860);Duration result = test.dividedBy(2L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28861);assertEquals(123L, result.getMillis());
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    public void testDividedBy_long2() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28862);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rlzobym9q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testDividedBy_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28862,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rlzobym9q(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28862);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28863);Duration test = new Duration(123L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28864);Duration result = test.dividedBy(1L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28865);assertSame(test, result);
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testNegated_long1() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28866);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1islf8tm9u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testNegated_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28866,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1islf8tm9u(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28866);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28867);Duration test = new Duration(246L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28868);Duration result = test.negated();
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28869);assertEquals(-246L, result.getMillis());
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    public void testNegated_long2() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28870);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m1le1am9y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testNegated_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28870,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m1le1am9y(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28870);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28871);Duration test = new Duration(-246L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28872);Duration result = test.negated();
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28873);assertEquals(246L, result.getMillis());
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    public void testNegated_long3() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1palctrma2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testNegated_long3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28874,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1palctrma2(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28874);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28875);Duration test = new Duration(Long.MIN_VALUE);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28876);try {
            __CLR4_4_1ly9ly9lc8azuq8.R.inc(28877);test.negated();
            __CLR4_4_1ly9ly9lc8azuq8.R.inc(28878);fail();
        } catch(ArithmeticException e) {
            // expected
        }
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithDurationAdded_RD_int1() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_115dkc5ma7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithDurationAdded_RD_int1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28879,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_115dkc5ma7(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28879);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28880);Duration test = new Duration(123L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28881);Duration result = test.withDurationAdded(new Duration(8000L), 1);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28882);assertEquals(8123L, result.getMillis());
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    public void testWithDurationAdded_RD_int2() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28883);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_123megcmab();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithDurationAdded_RD_int2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28883,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_123megcmab(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28883);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28884);Duration test = new Duration(123L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28885);Duration result = test.withDurationAdded(new Duration(8000L), 2);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28886);assertEquals(16123L, result.getMillis());
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    public void testWithDurationAdded_RD_int3() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28887);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15cmd8tmaf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithDurationAdded_RD_int3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28887,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15cmd8tmaf(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28887);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28888);Duration test = new Duration(123L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28889);Duration result = test.withDurationAdded(new Duration(8000L), -1);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28890);assertEquals((123L - 8000L), result.getMillis());
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    public void testWithDurationAdded_RD_int4() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18lmc1amaj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithDurationAdded_RD_int4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28891,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18lmc1amaj(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28891);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28892);Duration test = new Duration(123L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28893);Duration result = test.withDurationAdded(new Duration(0L), 1);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28894);assertSame(test, result);
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    public void testWithDurationAdded_RD_int5() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28895);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bumatrman();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithDurationAdded_RD_int5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28895,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bumatrman(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28895);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28896);Duration test = new Duration(123L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28897);Duration result = test.withDurationAdded(new Duration(8000L), 0);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28898);assertSame(test, result);
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    public void testWithDurationAdded_RD_int6() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28899);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f3m9m8mar();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testWithDurationAdded_RD_int6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28899,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f3m9m8mar(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28899);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28900);Duration test = new Duration(123L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28901);Duration result = test.withDurationAdded(null, 0);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28902);assertSame(test, result);
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPlus_RD1() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w57dznmav();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testPlus_RD1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28903,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w57dznmav(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28903);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28904);Duration test = new Duration(123L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28905);Duration result = test.plus(new Duration(8000L));
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28906);assertEquals(8123L, result.getMillis());
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    public void testPlus_RD2() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ze7cs4maz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testPlus_RD2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28907,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ze7cs4maz(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28907);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28908);Duration test = new Duration(123L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28909);Duration result = test.plus(new Duration(0L));
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28910);assertSame(test, result);
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    public void testPlus_RD3() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wdwqejmb3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testPlus_RD3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28911,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wdwqejmb3(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28911);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28912);Duration test = new Duration(123L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28913);Duration result = test.plus(null);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28914);assertSame(test, result);
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testMinus_RD1() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28915);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_151ruh1mb7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMinus_RD1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28915,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_151ruh1mb7(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28915);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28916);Duration test = new Duration(123L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28917);Duration result = test.minus(new Duration(8000L));
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28918);assertEquals(123L - 8000L, result.getMillis());
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    public void testMinus_RD2() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28919);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18art9imbb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMinus_RD2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28919,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18art9imbb(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28919);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28920);Duration test = new Duration(123L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28921);Duration result = test.minus(new Duration(0L));
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28922);assertSame(test, result);
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    public void testMinus_RD3() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28923);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bjrs1zmbf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMinus_RD3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28923,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bjrs1zmbf(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28923);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28924);Duration test = new Duration(123L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28925);Duration result = test.minus(null);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28926);assertSame(test, result);
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testMutableDuration() {__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceStart(getClass().getName(),28927);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ug5v73mbj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ly9ly9lc8azuq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ly9ly9lc8azuq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Basics.testMutableDuration",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28927,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ug5v73mbj(){try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28927);
        // no MutableDuration, so...
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28928);MockMutableDuration test = new MockMutableDuration(123L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28929);assertEquals(123L, test.getMillis());
        
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28930);test.setMillis(2345L);
        __CLR4_4_1ly9ly9lc8azuq8.R.inc(28931);assertEquals(2345L, test.getMillis());
    }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}

    static class MockMutableDuration extends BaseDuration {
        public MockMutableDuration(long duration) {
            super(duration);__CLR4_4_1ly9ly9lc8azuq8.R.inc(28933);try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28932);
        }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}
        public void setMillis(long duration) {try{__CLR4_4_1ly9ly9lc8azuq8.R.inc(28934);
            __CLR4_4_1ly9ly9lc8azuq8.R.inc(28935);super.setMillis(duration);
        }finally{__CLR4_4_1ly9ly9lc8azuq8.R.flushNeeded();}}
    }

}
