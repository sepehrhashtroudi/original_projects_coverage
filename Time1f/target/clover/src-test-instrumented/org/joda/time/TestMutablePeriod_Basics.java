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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.base.BasePeriod;

/**
 * This class is a Junit unit test for MutableDuration.
 *
 * @author Stephen Colebourne
 */
public class TestMutablePeriod_Basics extends TestCase {static class __CLR4_4_1v67v67lc8azvy6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,40501,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1v67v67lc8azvy6.R.inc(40399);
        __CLR4_4_1v67v67lc8azvy6.R.inc(40400);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1v67v67lc8azvy6.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1v67v67lc8azvy6.R.inc(40401);
        __CLR4_4_1v67v67lc8azvy6.R.inc(40402);return new TestSuite(TestMutablePeriod_Basics.class);
    }finally{__CLR4_4_1v67v67lc8azvy6.R.flushNeeded();}}

    public TestMutablePeriod_Basics(String name) {
        super(name);__CLR4_4_1v67v67lc8azvy6.R.inc(40404);try{__CLR4_4_1v67v67lc8azvy6.R.inc(40403);
    }finally{__CLR4_4_1v67v67lc8azvy6.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1v67v67lc8azvy6.R.inc(40405);
        __CLR4_4_1v67v67lc8azvy6.R.inc(40406);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1v67v67lc8azvy6.R.inc(40407);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1v67v67lc8azvy6.R.inc(40408);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1v67v67lc8azvy6.R.inc(40409);originalLocale = Locale.getDefault();
        __CLR4_4_1v67v67lc8azvy6.R.inc(40410);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1v67v67lc8azvy6.R.inc(40411);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1v67v67lc8azvy6.R.inc(40412);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1v67v67lc8azvy6.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1v67v67lc8azvy6.R.inc(40413);
        __CLR4_4_1v67v67lc8azvy6.R.inc(40414);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1v67v67lc8azvy6.R.inc(40415);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1v67v67lc8azvy6.R.inc(40416);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1v67v67lc8azvy6.R.inc(40417);Locale.setDefault(originalLocale);
        __CLR4_4_1v67v67lc8azvy6.R.inc(40418);originalDateTimeZone = null;
        __CLR4_4_1v67v67lc8azvy6.R.inc(40419);originalTimeZone = null;
        __CLR4_4_1v67v67lc8azvy6.R.inc(40420);originalLocale = null;
    }finally{__CLR4_4_1v67v67lc8azvy6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testTest() {__CLR4_4_1v67v67lc8azvy6.R.globalSliceStart(getClass().getName(),40421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqjv6t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v67v67lc8azvy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v67v67lc8azvy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Basics.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40421,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqjv6t(){try{__CLR4_4_1v67v67lc8azvy6.R.inc(40421);
        __CLR4_4_1v67v67lc8azvy6.R.inc(40422);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
        __CLR4_4_1v67v67lc8azvy6.R.inc(40423);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        __CLR4_4_1v67v67lc8azvy6.R.inc(40424);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }finally{__CLR4_4_1v67v67lc8azvy6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetPeriodType() {__CLR4_4_1v67v67lc8azvy6.R.globalSliceStart(getClass().getName(),40425);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ivat1iv6x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v67v67lc8azvy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v67v67lc8azvy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Basics.testGetPeriodType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40425,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ivat1iv6x(){try{__CLR4_4_1v67v67lc8azvy6.R.inc(40425);
        __CLR4_4_1v67v67lc8azvy6.R.inc(40426);MutablePeriod test = new MutablePeriod();
        __CLR4_4_1v67v67lc8azvy6.R.inc(40427);assertEquals(PeriodType.standard(), test.getPeriodType());
    }finally{__CLR4_4_1v67v67lc8azvy6.R.flushNeeded();}}

    public void testGetMethods() {__CLR4_4_1v67v67lc8azvy6.R.globalSliceStart(getClass().getName(),40428);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12sjdmzv70();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v67v67lc8azvy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v67v67lc8azvy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Basics.testGetMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40428,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12sjdmzv70(){try{__CLR4_4_1v67v67lc8azvy6.R.inc(40428);
        __CLR4_4_1v67v67lc8azvy6.R.inc(40429);MutablePeriod test = new MutablePeriod();
        __CLR4_4_1v67v67lc8azvy6.R.inc(40430);assertEquals(0, test.getYears());
        __CLR4_4_1v67v67lc8azvy6.R.inc(40431);assertEquals(0, test.getMonths());
        __CLR4_4_1v67v67lc8azvy6.R.inc(40432);assertEquals(0, test.getDays());
        __CLR4_4_1v67v67lc8azvy6.R.inc(40433);assertEquals(0, test.getWeeks());
        __CLR4_4_1v67v67lc8azvy6.R.inc(40434);assertEquals(0, test.getDays());
        __CLR4_4_1v67v67lc8azvy6.R.inc(40435);assertEquals(0, test.getHours());
        __CLR4_4_1v67v67lc8azvy6.R.inc(40436);assertEquals(0, test.getMinutes());
        __CLR4_4_1v67v67lc8azvy6.R.inc(40437);assertEquals(0, test.getSeconds());
        __CLR4_4_1v67v67lc8azvy6.R.inc(40438);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1v67v67lc8azvy6.R.flushNeeded();}}

    public void testEqualsHashCode() {__CLR4_4_1v67v67lc8azvy6.R.globalSliceStart(getClass().getName(),40439);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5in77v7b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v67v67lc8azvy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v67v67lc8azvy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Basics.testEqualsHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40439,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5in77v7b(){try{__CLR4_4_1v67v67lc8azvy6.R.inc(40439);
        __CLR4_4_1v67v67lc8azvy6.R.inc(40440);MutablePeriod test1 = new MutablePeriod(123L);
        __CLR4_4_1v67v67lc8azvy6.R.inc(40441);MutablePeriod test2 = new MutablePeriod(123L);
        __CLR4_4_1v67v67lc8azvy6.R.inc(40442);assertEquals(true, test1.equals(test2));
        __CLR4_4_1v67v67lc8azvy6.R.inc(40443);assertEquals(true, test2.equals(test1));
        __CLR4_4_1v67v67lc8azvy6.R.inc(40444);assertEquals(true, test1.equals(test1));
        __CLR4_4_1v67v67lc8azvy6.R.inc(40445);assertEquals(true, test2.equals(test2));
        __CLR4_4_1v67v67lc8azvy6.R.inc(40446);assertEquals(true, test1.hashCode() == test2.hashCode());
        __CLR4_4_1v67v67lc8azvy6.R.inc(40447);assertEquals(true, test1.hashCode() == test1.hashCode());
        __CLR4_4_1v67v67lc8azvy6.R.inc(40448);assertEquals(true, test2.hashCode() == test2.hashCode());
        
        __CLR4_4_1v67v67lc8azvy6.R.inc(40449);MutablePeriod test3 = new MutablePeriod(321L);
        __CLR4_4_1v67v67lc8azvy6.R.inc(40450);assertEquals(false, test1.equals(test3));
        __CLR4_4_1v67v67lc8azvy6.R.inc(40451);assertEquals(false, test2.equals(test3));
        __CLR4_4_1v67v67lc8azvy6.R.inc(40452);assertEquals(false, test3.equals(test1));
        __CLR4_4_1v67v67lc8azvy6.R.inc(40453);assertEquals(false, test3.equals(test2));
        __CLR4_4_1v67v67lc8azvy6.R.inc(40454);assertEquals(false, test1.hashCode() == test3.hashCode());
        __CLR4_4_1v67v67lc8azvy6.R.inc(40455);assertEquals(false, test2.hashCode() == test3.hashCode());
        
        __CLR4_4_1v67v67lc8azvy6.R.inc(40456);assertEquals(false, test1.equals("Hello"));
        __CLR4_4_1v67v67lc8azvy6.R.inc(40457);assertEquals(true, test1.equals(new MockMutablePeriod(123L)));
        __CLR4_4_1v67v67lc8azvy6.R.inc(40458);assertEquals(false, test1.equals(new Period(123L, PeriodType.dayTime())));
    }finally{__CLR4_4_1v67v67lc8azvy6.R.flushNeeded();}}
    
    class MockMutablePeriod extends BasePeriod {
        public MockMutablePeriod(long value) {
            super(value, null, null);__CLR4_4_1v67v67lc8azvy6.R.inc(40460);try{__CLR4_4_1v67v67lc8azvy6.R.inc(40459);
        }finally{__CLR4_4_1v67v67lc8azvy6.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    public void testSerialization() throws Exception {__CLR4_4_1v67v67lc8azvy6.R.globalSliceStart(getClass().getName(),40461);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on9v7x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v67v67lc8azvy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v67v67lc8azvy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Basics.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40461,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on9v7x() throws Exception{try{__CLR4_4_1v67v67lc8azvy6.R.inc(40461);
        __CLR4_4_1v67v67lc8azvy6.R.inc(40462);MutablePeriod test = new MutablePeriod(123L);
        
        __CLR4_4_1v67v67lc8azvy6.R.inc(40463);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1v67v67lc8azvy6.R.inc(40464);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1v67v67lc8azvy6.R.inc(40465);oos.writeObject(test);
        __CLR4_4_1v67v67lc8azvy6.R.inc(40466);byte[] bytes = baos.toByteArray();
        __CLR4_4_1v67v67lc8azvy6.R.inc(40467);oos.close();
        
        __CLR4_4_1v67v67lc8azvy6.R.inc(40468);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1v67v67lc8azvy6.R.inc(40469);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1v67v67lc8azvy6.R.inc(40470);MutablePeriod result = (MutablePeriod) ois.readObject();
        __CLR4_4_1v67v67lc8azvy6.R.inc(40471);ois.close();
        
        __CLR4_4_1v67v67lc8azvy6.R.inc(40472);assertEquals(test, result);
    }finally{__CLR4_4_1v67v67lc8azvy6.R.flushNeeded();}}

//    //-----------------------------------------------------------------------
//    public void testAddTo1() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, 1);
//        expected = ISOChronology.getInstance().months().add(expected, 2);
//        expected = ISOChronology.getInstance().weeks().add(expected, 3);
//        expected = ISOChronology.getInstance().days().add(expected, 4);
//        expected = ISOChronology.getInstance().hours().add(expected, 5);
//        expected = ISOChronology.getInstance().minutes().add(expected, 6);
//        expected = ISOChronology.getInstance().seconds().add(expected, 7);
//        expected = ISOChronology.getInstance().millis().add(expected, 8);
//        
//        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
//        long added = test.addTo(TEST_TIME_NOW, 1);
//        assertEquals(expected, added);
//    }
//    
//    public void testAddTo2() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, -2);
//        expected = ISOChronology.getInstance().months().add(expected, -4);
//        expected = ISOChronology.getInstance().weeks().add(expected, -6);
//        expected = ISOChronology.getInstance().days().add(expected, -8);
//        expected = ISOChronology.getInstance().hours().add(expected, -10);
//        expected = ISOChronology.getInstance().minutes().add(expected, -12);
//        expected = ISOChronology.getInstance().seconds().add(expected, -14);
//        expected = ISOChronology.getInstance().millis().add(expected, -16);
//        
//        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
//        long added = test.addTo(TEST_TIME_NOW, -2);
//        assertEquals(expected, added);
//    }
//    
//    public void testAddTo3() {
//        long expected = TEST_TIME_NOW;
//        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
//        long added = test.addTo(TEST_TIME_NOW, 0);
//        assertEquals(expected, added);
//    }
//    
//    public void testAddTo4() {
//        long expected = TEST_TIME_NOW + 100L;
//        MutablePeriod test = new MutablePeriod(100L);
//        long added = test.addTo(TEST_TIME_NOW, 1);
//        assertEquals(expected, added);
//    }
//    
//    //-----------------------------------------------------------------------
//    public void testAddToWithChronology1() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, 1);
//        expected = ISOChronology.getInstance().months().add(expected, 2);
//        expected = ISOChronology.getInstance().weeks().add(expected, 3);
//        expected = ISOChronology.getInstance().days().add(expected, 4);
//        expected = ISOChronology.getInstance().hours().add(expected, 5);
//        expected = ISOChronology.getInstance().minutes().add(expected, 6);
//        expected = ISOChronology.getInstance().seconds().add(expected, 7);
//        expected = ISOChronology.getInstance().millis().add(expected, 8);
//        
//        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
//        long added = test.addTo(TEST_TIME_NOW, 1, ISOChronology.getInstance());
//        assertEquals(expected, added);
//    }
//    
//    public void testAddToWithChronology2() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstanceUTC().years().add(expected, -2);
//        expected = ISOChronology.getInstanceUTC().months().add(expected, -4);
//        expected = ISOChronology.getInstanceUTC().weeks().add(expected, -6);
//        expected = ISOChronology.getInstanceUTC().days().add(expected, -8);
//        expected = ISOChronology.getInstanceUTC().hours().add(expected, -10);
//        expected = ISOChronology.getInstanceUTC().minutes().add(expected, -12);
//        expected = ISOChronology.getInstanceUTC().seconds().add(expected, -14);
//        expected = ISOChronology.getInstanceUTC().millis().add(expected, -16);
//        
//        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        long added = test.addTo(TEST_TIME_NOW, -2, ISOChronology.getInstanceUTC());  // chrono specified so use it
//        assertEquals(expected, added);
//    }
//    
//    public void testAddToWithChronology3() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, -2);
//        expected = ISOChronology.getInstance().months().add(expected, -4);
//        expected = ISOChronology.getInstance().weeks().add(expected, -6);
//        expected = ISOChronology.getInstance().days().add(expected, -8);
//        expected = ISOChronology.getInstance().hours().add(expected, -10);
//        expected = ISOChronology.getInstance().minutes().add(expected, -12);
//        expected = ISOChronology.getInstance().seconds().add(expected, -14);
//        expected = ISOChronology.getInstance().millis().add(expected, -16);
//        
//        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        long added = test.addTo(TEST_TIME_NOW, -2, null);  // no chrono so use default
//        assertEquals(expected, added);
//    }
//    
//    //-----------------------------------------------------------------------
//    public void testAddToRI1() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, 1);
//        expected = ISOChronology.getInstance().months().add(expected, 2);
//        expected = ISOChronology.getInstance().weeks().add(expected, 3);
//        expected = ISOChronology.getInstance().days().add(expected, 4);
//        expected = ISOChronology.getInstance().hours().add(expected, 5);
//        expected = ISOChronology.getInstance().minutes().add(expected, 6);
//        expected = ISOChronology.getInstance().seconds().add(expected, 7);
//        expected = ISOChronology.getInstance().millis().add(expected, 8);
//        
//        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
//        DateTime added = test.addTo(new Instant(), 1);  // Instant has no time zone, use default
//        assertEquals(expected, added.getMillis());
//        assertEquals(ISOChronology.getInstance(), added.getChronology());
//    }
//    
//    public void testAddToRI2() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, -2);
//        expected = ISOChronology.getInstance().months().add(expected, -4);
//        expected = ISOChronology.getInstance().weeks().add(expected, -6);
//        expected = ISOChronology.getInstance().days().add(expected, -8);
//        expected = ISOChronology.getInstance().hours().add(expected, -10);
//        expected = ISOChronology.getInstance().minutes().add(expected, -12);
//        expected = ISOChronology.getInstance().seconds().add(expected, -14);
//        expected = ISOChronology.getInstance().millis().add(expected, -16);
//        
//        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        DateTime added = test.addTo(new Instant(), -2);  // Instant has no time zone, use default
//        assertEquals(expected, added.getMillis());
//        assertEquals(ISOChronology.getInstance(), added.getChronology());
//    }
//    
//    public void testAddToRI3() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstanceUTC().years().add(expected, -2);
//        expected = ISOChronology.getInstanceUTC().months().add(expected, -4);
//        expected = ISOChronology.getInstanceUTC().weeks().add(expected, -6);
//        expected = ISOChronology.getInstanceUTC().days().add(expected, -8);
//        expected = ISOChronology.getInstanceUTC().hours().add(expected, -10);
//        expected = ISOChronology.getInstanceUTC().minutes().add(expected, -12);
//        expected = ISOChronology.getInstanceUTC().seconds().add(expected, -14);
//        expected = ISOChronology.getInstanceUTC().millis().add(expected, -16);
//        
//        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        DateTime added = test.addTo(new DateTime(ISOChronology.getInstanceUTC()), -2);  // DateTime has UTC time zone
//        assertEquals(expected, added.getMillis());
//        assertEquals(ISOChronology.getInstanceUTC(), added.getChronology());
//    }
//    
//    public void testAddToRI4() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance(PARIS).years().add(expected, -2);
//        expected = ISOChronology.getInstance(PARIS).months().add(expected, -4);
//        expected = ISOChronology.getInstance(PARIS).weeks().add(expected, -6);
//        expected = ISOChronology.getInstance(PARIS).days().add(expected, -8);
//        expected = ISOChronology.getInstance(PARIS).hours().add(expected, -10);
//        expected = ISOChronology.getInstance(PARIS).minutes().add(expected, -12);
//        expected = ISOChronology.getInstance(PARIS).seconds().add(expected, -14);
//        expected = ISOChronology.getInstance(PARIS).millis().add(expected, -16);
//        
//        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        DateTime added = test.addTo(new DateTime(PARIS), -2);  // DateTime has PARIS time zone
//        assertEquals(expected, added.getMillis());
//        assertEquals(ISOChronology.getInstance(PARIS), added.getChronology());
//    }
//    
//    public void testAddToRI5() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, -2);
//        expected = ISOChronology.getInstance().months().add(expected, -4);
//        expected = ISOChronology.getInstance().weeks().add(expected, -6);
//        expected = ISOChronology.getInstance().days().add(expected, -8);
//        expected = ISOChronology.getInstance().hours().add(expected, -10);
//        expected = ISOChronology.getInstance().minutes().add(expected, -12);
//        expected = ISOChronology.getInstance().seconds().add(expected, -14);
//        expected = ISOChronology.getInstance().millis().add(expected, -16);
//        
//        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        DateTime added = test.addTo(null, -2);  // null has no time zone, use default
//        assertEquals(expected, added.getMillis());
//        assertEquals(ISOChronology.getInstance(), added.getChronology());
//    }
//    
//    //-----------------------------------------------------------------------
//    public void testAddIntoRWI1() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, 1);
//        expected = ISOChronology.getInstance().months().add(expected, 2);
//        expected = ISOChronology.getInstance().weeks().add(expected, 3);
//        expected = ISOChronology.getInstance().days().add(expected, 4);
//        expected = ISOChronology.getInstance().hours().add(expected, 5);
//        expected = ISOChronology.getInstance().minutes().add(expected, 6);
//        expected = ISOChronology.getInstance().seconds().add(expected, 7);
//        expected = ISOChronology.getInstance().millis().add(expected, 8);
//        
//        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
//        MutableDateTime mdt = new MutableDateTime();
//        test.addInto(mdt, 1);
//        assertEquals(expected, mdt.getMillis());
//    }
//    
//    public void testAddIntoRWI2() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, -2);
//        expected = ISOChronology.getInstance().months().add(expected, -4);
//        expected = ISOChronology.getInstance().weeks().add(expected, -6);
//        expected = ISOChronology.getInstance().days().add(expected, -8);
//        expected = ISOChronology.getInstance().hours().add(expected, -10);
//        expected = ISOChronology.getInstance().minutes().add(expected, -12);
//        expected = ISOChronology.getInstance().seconds().add(expected, -14);
//        expected = ISOChronology.getInstance().millis().add(expected, -16);
//        
//        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        MutableDateTime mdt = new MutableDateTime();
//        test.addInto(mdt, -2);  // MutableDateTime has a chronology, use it
//        assertEquals(expected, mdt.getMillis());
//    }
//    
//    public void testAddIntoRWI3() {
//        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
//        try {
//            test.addInto(null, 1);
//            fail();
//        } catch (IllegalArgumentException ex) {}
//    }
    
    //-----------------------------------------------------------------------
    public void testToString() {__CLR4_4_1v67v67lc8azvy6.R.globalSliceStart(getClass().getName(),40473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdidv89();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v67v67lc8azvy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v67v67lc8azvy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Basics.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40473,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdidv89(){try{__CLR4_4_1v67v67lc8azvy6.R.inc(40473);
        __CLR4_4_1v67v67lc8azvy6.R.inc(40474);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_1v67v67lc8azvy6.R.inc(40475);assertEquals("P1Y2M3W4DT5H6M7.008S", test.toString());
        
        __CLR4_4_1v67v67lc8azvy6.R.inc(40476);test = new MutablePeriod(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_1v67v67lc8azvy6.R.inc(40477);assertEquals("PT0S", test.toString());
        
        __CLR4_4_1v67v67lc8azvy6.R.inc(40478);test = new MutablePeriod(12345L);
        __CLR4_4_1v67v67lc8azvy6.R.inc(40479);assertEquals("PT12.345S", test.toString());
    }finally{__CLR4_4_1v67v67lc8azvy6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToPeriod() {__CLR4_4_1v67v67lc8azvy6.R.globalSliceStart(getClass().getName(),40480);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cvhk17v8g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v67v67lc8azvy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v67v67lc8azvy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Basics.testToPeriod",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40480,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cvhk17v8g(){try{__CLR4_4_1v67v67lc8azvy6.R.inc(40480);
        __CLR4_4_1v67v67lc8azvy6.R.inc(40481);MutablePeriod test = new MutablePeriod(123L);
        __CLR4_4_1v67v67lc8azvy6.R.inc(40482);Period result = test.toPeriod();
        __CLR4_4_1v67v67lc8azvy6.R.inc(40483);assertEquals(test, result);
    }finally{__CLR4_4_1v67v67lc8azvy6.R.flushNeeded();}}

    public void testToMutablePeriod() {__CLR4_4_1v67v67lc8azvy6.R.globalSliceStart(getClass().getName(),40484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13v2j33v8k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v67v67lc8azvy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v67v67lc8azvy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Basics.testToMutablePeriod",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40484,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13v2j33v8k(){try{__CLR4_4_1v67v67lc8azvy6.R.inc(40484);
        __CLR4_4_1v67v67lc8azvy6.R.inc(40485);MutablePeriod test = new MutablePeriod(123L);
        __CLR4_4_1v67v67lc8azvy6.R.inc(40486);MutablePeriod result = test.toMutablePeriod();
        __CLR4_4_1v67v67lc8azvy6.R.inc(40487);assertEquals(test, result);
    }finally{__CLR4_4_1v67v67lc8azvy6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
//    public void testToDurationMillisFrom() {
//        MutablePeriod test = new MutablePeriod(123L);
//        assertEquals(123L, test.toDurationMillisFrom(0L, null));
//    }

    public void testToDurationFrom() {__CLR4_4_1v67v67lc8azvy6.R.globalSliceStart(getClass().getName(),40488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nkq832v8o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v67v67lc8azvy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v67v67lc8azvy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Basics.testToDurationFrom",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40488,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nkq832v8o(){try{__CLR4_4_1v67v67lc8azvy6.R.inc(40488);
        __CLR4_4_1v67v67lc8azvy6.R.inc(40489);MutablePeriod test = new MutablePeriod(123L);
        __CLR4_4_1v67v67lc8azvy6.R.inc(40490);assertEquals(new Duration(123L), test.toDurationFrom(new Instant(0L)));
    }finally{__CLR4_4_1v67v67lc8azvy6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testCopy() {__CLR4_4_1v67v67lc8azvy6.R.globalSliceStart(getClass().getName(),40491);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ukax6av8r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v67v67lc8azvy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v67v67lc8azvy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Basics.testCopy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40491,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ukax6av8r(){try{__CLR4_4_1v67v67lc8azvy6.R.inc(40491);
        __CLR4_4_1v67v67lc8azvy6.R.inc(40492);MutablePeriod test = new MutablePeriod(123L);
        __CLR4_4_1v67v67lc8azvy6.R.inc(40493);MutablePeriod copy = test.copy();
        __CLR4_4_1v67v67lc8azvy6.R.inc(40494);assertEquals(test.getPeriodType(), copy.getPeriodType());
        __CLR4_4_1v67v67lc8azvy6.R.inc(40495);assertEquals(test, copy);
    }finally{__CLR4_4_1v67v67lc8azvy6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testClone() {__CLR4_4_1v67v67lc8azvy6.R.globalSliceStart(getClass().getName(),40496);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1csyejyv8w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1v67v67lc8azvy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1v67v67lc8azvy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Basics.testClone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40496,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1csyejyv8w(){try{__CLR4_4_1v67v67lc8azvy6.R.inc(40496);
        __CLR4_4_1v67v67lc8azvy6.R.inc(40497);MutablePeriod test = new MutablePeriod(123L);
        __CLR4_4_1v67v67lc8azvy6.R.inc(40498);MutablePeriod copy = (MutablePeriod) test.clone();
        __CLR4_4_1v67v67lc8azvy6.R.inc(40499);assertEquals(test.getPeriodType(), copy.getPeriodType());
        __CLR4_4_1v67v67lc8azvy6.R.inc(40500);assertEquals(test, copy);
    }finally{__CLR4_4_1v67v67lc8azvy6.R.flushNeeded();}}
    
}
