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
import java.lang.reflect.Modifier;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.base.AbstractInstant;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for Instant.
 *
 * @author Stephen Colebourne
 */
public class TestInstant_Basics extends TestCase {static class __CLR4_4_1mrtmrtlc8azut9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,29884,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1mrtmrtlc8azut9.R.inc(29513);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29514);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1mrtmrtlc8azut9.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1mrtmrtlc8azut9.R.inc(29515);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29516);return new TestSuite(TestInstant_Basics.class);
    }finally{__CLR4_4_1mrtmrtlc8azut9.R.flushNeeded();}}

    public TestInstant_Basics(String name) {
        super(name);__CLR4_4_1mrtmrtlc8azut9.R.inc(29518);try{__CLR4_4_1mrtmrtlc8azut9.R.inc(29517);
    }finally{__CLR4_4_1mrtmrtlc8azut9.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1mrtmrtlc8azut9.R.inc(29519);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29520);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29521);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29522);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29523);originalLocale = Locale.getDefault();
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29524);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29525);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29526);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1mrtmrtlc8azut9.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1mrtmrtlc8azut9.R.inc(29527);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29528);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29529);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29530);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29531);Locale.setDefault(originalLocale);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29532);originalDateTimeZone = null;
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29533);originalTimeZone = null;
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29534);originalLocale = null;
    }finally{__CLR4_4_1mrtmrtlc8azut9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testTest() {__CLR4_4_1mrtmrtlc8azut9.R.globalSliceStart(getClass().getName(),29535);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqjmsf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrtmrtlc8azut9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrtmrtlc8azut9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29535,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqjmsf(){try{__CLR4_4_1mrtmrtlc8azut9.R.inc(29535);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29536);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29537);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29538);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }finally{__CLR4_4_1mrtmrtlc8azut9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGet_DateTimeFieldType() {__CLR4_4_1mrtmrtlc8azut9.R.globalSliceStart(getClass().getName(),29539);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cyir3vmsj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrtmrtlc8azut9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrtmrtlc8azut9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testGet_DateTimeFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29539,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cyir3vmsj(){try{__CLR4_4_1mrtmrtlc8azut9.R.inc(29539);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29540);Instant test = new Instant();  // 2002-06-09
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29541);assertEquals(1, test.get(DateTimeFieldType.era()));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29542);assertEquals(20, test.get(DateTimeFieldType.centuryOfEra()));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29543);assertEquals(2, test.get(DateTimeFieldType.yearOfCentury()));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29544);assertEquals(2002, test.get(DateTimeFieldType.yearOfEra()));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29545);assertEquals(2002, test.get(DateTimeFieldType.year()));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29546);assertEquals(6, test.get(DateTimeFieldType.monthOfYear()));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29547);assertEquals(9, test.get(DateTimeFieldType.dayOfMonth()));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29548);assertEquals(2002, test.get(DateTimeFieldType.weekyear()));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29549);assertEquals(23, test.get(DateTimeFieldType.weekOfWeekyear()));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29550);assertEquals(7, test.get(DateTimeFieldType.dayOfWeek()));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29551);assertEquals(160, test.get(DateTimeFieldType.dayOfYear()));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29552);assertEquals(0, test.get(DateTimeFieldType.halfdayOfDay()));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29553);assertEquals(0, test.get(DateTimeFieldType.hourOfHalfday()));  // UTC zone
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29554);assertEquals(24, test.get(DateTimeFieldType.clockhourOfDay()));  // UTC zone
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29555);assertEquals(12, test.get(DateTimeFieldType.clockhourOfHalfday()));  // UTC zone
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29556);assertEquals(0, test.get(DateTimeFieldType.hourOfDay()));  // UTC zone
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29557);assertEquals(0, test.get(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29558);assertEquals(0, test.get(DateTimeFieldType.minuteOfDay()));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29559);assertEquals(0, test.get(DateTimeFieldType.secondOfMinute()));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29560);assertEquals(0, test.get(DateTimeFieldType.secondOfDay()));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29561);assertEquals(0, test.get(DateTimeFieldType.millisOfSecond()));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29562);assertEquals(0, test.get(DateTimeFieldType.millisOfDay()));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29563);try {
            __CLR4_4_1mrtmrtlc8azut9.R.inc(29564);test.get((DateTimeFieldType) null);
            __CLR4_4_1mrtmrtlc8azut9.R.inc(29565);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1mrtmrtlc8azut9.R.flushNeeded();}}

    public void testGet_DateTimeField() {__CLR4_4_1mrtmrtlc8azut9.R.globalSliceStart(getClass().getName(),29566);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zggkkrmta();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrtmrtlc8azut9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrtmrtlc8azut9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testGet_DateTimeField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29566,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zggkkrmta(){try{__CLR4_4_1mrtmrtlc8azut9.R.inc(29566);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29567);Instant test = new Instant();  // 2002-06-09
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29568);assertEquals(1, test.get(ISOChronology.getInstance().era()));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29569);assertEquals(20, test.get(ISOChronology.getInstance().centuryOfEra()));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29570);assertEquals(2, test.get(ISOChronology.getInstance().yearOfCentury()));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29571);assertEquals(2002, test.get(ISOChronology.getInstance().yearOfEra()));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29572);assertEquals(2002, test.get(ISOChronology.getInstance().year()));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29573);assertEquals(6, test.get(ISOChronology.getInstance().monthOfYear()));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29574);assertEquals(9, test.get(ISOChronology.getInstance().dayOfMonth()));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29575);assertEquals(2002, test.get(ISOChronology.getInstance().weekyear()));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29576);assertEquals(23, test.get(ISOChronology.getInstance().weekOfWeekyear()));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29577);assertEquals(7, test.get(ISOChronology.getInstance().dayOfWeek()));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29578);assertEquals(160, test.get(ISOChronology.getInstance().dayOfYear()));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29579);assertEquals(0, test.get(ISOChronology.getInstance().halfdayOfDay()));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29580);assertEquals(1, test.get(ISOChronology.getInstance().hourOfHalfday()));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29581);assertEquals(1, test.get(ISOChronology.getInstance().clockhourOfDay()));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29582);assertEquals(1, test.get(ISOChronology.getInstance().clockhourOfHalfday()));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29583);assertEquals(1, test.get(ISOChronology.getInstance().hourOfDay()));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29584);assertEquals(0, test.get(ISOChronology.getInstance().minuteOfHour()));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29585);assertEquals(60, test.get(ISOChronology.getInstance().minuteOfDay()));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29586);assertEquals(0, test.get(ISOChronology.getInstance().secondOfMinute()));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29587);assertEquals(60 * 60, test.get(ISOChronology.getInstance().secondOfDay()));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29588);assertEquals(0, test.get(ISOChronology.getInstance().millisOfSecond()));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29589);assertEquals(60 * 60 * 1000, test.get(ISOChronology.getInstance().millisOfDay()));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29590);try {
            __CLR4_4_1mrtmrtlc8azut9.R.inc(29591);test.get((DateTimeField) null);
            __CLR4_4_1mrtmrtlc8azut9.R.inc(29592);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1mrtmrtlc8azut9.R.flushNeeded();}}

    public void testGetMethods() {__CLR4_4_1mrtmrtlc8azut9.R.globalSliceStart(getClass().getName(),29593);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12sjdmzmu1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrtmrtlc8azut9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrtmrtlc8azut9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testGetMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29593,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12sjdmzmu1(){try{__CLR4_4_1mrtmrtlc8azut9.R.inc(29593);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29594);Instant test = new Instant();
        
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29595);assertEquals(ISOChronology.getInstanceUTC(), test.getChronology());
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29596);assertEquals(DateTimeZone.UTC, test.getZone());
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29597);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1mrtmrtlc8azut9.R.flushNeeded();}}

    public void testEqualsHashCode() {__CLR4_4_1mrtmrtlc8azut9.R.globalSliceStart(getClass().getName(),29598);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5in77mu6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrtmrtlc8azut9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrtmrtlc8azut9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testEqualsHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29598,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5in77mu6(){try{__CLR4_4_1mrtmrtlc8azut9.R.inc(29598);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29599);Instant test1 = new Instant(TEST_TIME1);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29600);Instant test2 = new Instant(TEST_TIME1);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29601);assertEquals(true, test1.equals(test2));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29602);assertEquals(true, test2.equals(test1));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29603);assertEquals(true, test1.equals(test1));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29604);assertEquals(true, test2.equals(test2));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29605);assertEquals(true, test1.hashCode() == test2.hashCode());
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29606);assertEquals(true, test1.hashCode() == test1.hashCode());
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29607);assertEquals(true, test2.hashCode() == test2.hashCode());
        
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29608);Instant test3 = new Instant(TEST_TIME2);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29609);assertEquals(false, test1.equals(test3));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29610);assertEquals(false, test2.equals(test3));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29611);assertEquals(false, test3.equals(test1));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29612);assertEquals(false, test3.equals(test2));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29613);assertEquals(false, test1.hashCode() == test3.hashCode());
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29614);assertEquals(false, test2.hashCode() == test3.hashCode());
        
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29615);assertEquals(false, test1.equals("Hello"));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29616);assertEquals(true, test1.equals(new MockInstant()));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29617);assertEquals(false, test1.equals(new DateTime(TEST_TIME1)));
    }finally{__CLR4_4_1mrtmrtlc8azut9.R.flushNeeded();}}
    
    class MockInstant extends AbstractInstant {
        public String toString() {try{__CLR4_4_1mrtmrtlc8azut9.R.inc(29618);
            __CLR4_4_1mrtmrtlc8azut9.R.inc(29619);return null;
        }finally{__CLR4_4_1mrtmrtlc8azut9.R.flushNeeded();}}
        public long getMillis() {try{__CLR4_4_1mrtmrtlc8azut9.R.inc(29620);
            __CLR4_4_1mrtmrtlc8azut9.R.inc(29621);return TEST_TIME1;
        }finally{__CLR4_4_1mrtmrtlc8azut9.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1mrtmrtlc8azut9.R.inc(29622);
            __CLR4_4_1mrtmrtlc8azut9.R.inc(29623);return ISOChronology.getInstanceUTC();
        }finally{__CLR4_4_1mrtmrtlc8azut9.R.flushNeeded();}}
    }

    public void testCompareTo() {__CLR4_4_1mrtmrtlc8azut9.R.globalSliceStart(getClass().getName(),29624);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pz6vfvmuw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrtmrtlc8azut9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrtmrtlc8azut9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testCompareTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29624,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pz6vfvmuw(){try{__CLR4_4_1mrtmrtlc8azut9.R.inc(29624);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29625);Instant test1 = new Instant(TEST_TIME1);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29626);Instant test1a = new Instant(TEST_TIME1);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29627);assertEquals(0, test1.compareTo(test1a));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29628);assertEquals(0, test1a.compareTo(test1));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29629);assertEquals(0, test1.compareTo(test1));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29630);assertEquals(0, test1a.compareTo(test1a));
        
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29631);Instant test2 = new Instant(TEST_TIME2);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29632);assertEquals(-1, test1.compareTo(test2));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29633);assertEquals(+1, test2.compareTo(test1));
        
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29634);DateTime test3 = new DateTime(TEST_TIME2, GregorianChronology.getInstance(PARIS));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29635);assertEquals(-1, test1.compareTo(test3));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29636);assertEquals(+1, test3.compareTo(test1));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29637);assertEquals(0, test3.compareTo(test2));
        
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29638);assertEquals(+1, test2.compareTo(new MockInstant()));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29639);assertEquals(0, test1.compareTo(new MockInstant()));
        
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29640);try {
            __CLR4_4_1mrtmrtlc8azut9.R.inc(29641);test1.compareTo(null);
            __CLR4_4_1mrtmrtlc8azut9.R.inc(29642);fail();
        } catch (NullPointerException ex) {}
//        try {
//            test1.compareTo(new Date());
//            fail();
//        } catch (ClassCastException ex) {}
    }finally{__CLR4_4_1mrtmrtlc8azut9.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testIsEqual_long() {__CLR4_4_1mrtmrtlc8azut9.R.globalSliceStart(getClass().getName(),29643);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w2rxu2mvf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrtmrtlc8azut9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrtmrtlc8azut9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testIsEqual_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29643,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w2rxu2mvf(){try{__CLR4_4_1mrtmrtlc8azut9.R.inc(29643);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29644);assertEquals(false, new Instant(TEST_TIME1).isEqual(TEST_TIME2));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29645);assertEquals(true, new Instant(TEST_TIME1).isEqual(TEST_TIME1));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29646);assertEquals(false, new Instant(TEST_TIME2).isEqual(TEST_TIME1));
    }finally{__CLR4_4_1mrtmrtlc8azut9.R.flushNeeded();}}
    
    public void testIsEqualNow() {__CLR4_4_1mrtmrtlc8azut9.R.globalSliceStart(getClass().getName(),29647);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17sfjzvmvj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrtmrtlc8azut9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrtmrtlc8azut9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testIsEqualNow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29647,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17sfjzvmvj(){try{__CLR4_4_1mrtmrtlc8azut9.R.inc(29647);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29648);assertEquals(false, new Instant(TEST_TIME_NOW - 1).isEqualNow());
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29649);assertEquals(true, new Instant(TEST_TIME_NOW).isEqualNow());
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29650);assertEquals(false, new Instant(TEST_TIME_NOW + 1).isEqualNow());
    }finally{__CLR4_4_1mrtmrtlc8azut9.R.flushNeeded();}}
    
    public void testIsEqual_RI() {__CLR4_4_1mrtmrtlc8azut9.R.globalSliceStart(getClass().getName(),29651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a1wuudmvn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrtmrtlc8azut9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrtmrtlc8azut9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testIsEqual_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29651,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a1wuudmvn(){try{__CLR4_4_1mrtmrtlc8azut9.R.inc(29651);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29652);Instant test1 = new Instant(TEST_TIME1);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29653);Instant test1a = new Instant(TEST_TIME1);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29654);assertEquals(true, test1.isEqual(test1a));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29655);assertEquals(true, test1a.isEqual(test1));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29656);assertEquals(true, test1.isEqual(test1));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29657);assertEquals(true, test1a.isEqual(test1a));
        
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29658);Instant test2 = new Instant(TEST_TIME2);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29659);assertEquals(false, test1.isEqual(test2));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29660);assertEquals(false, test2.isEqual(test1));
        
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29661);DateTime test3 = new DateTime(TEST_TIME2, GregorianChronology.getInstance(PARIS));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29662);assertEquals(false, test1.isEqual(test3));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29663);assertEquals(false, test3.isEqual(test1));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29664);assertEquals(true, test3.isEqual(test2));
        
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29665);assertEquals(false, test2.isEqual(new MockInstant()));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29666);assertEquals(true, test1.isEqual(new MockInstant()));
        
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29667);assertEquals(false, new Instant(TEST_TIME_NOW + 1).isEqual(null));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29668);assertEquals(true, new Instant(TEST_TIME_NOW).isEqual(null));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29669);assertEquals(false, new Instant(TEST_TIME_NOW - 1).isEqual(null));
    }finally{__CLR4_4_1mrtmrtlc8azut9.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testIsBefore_long() {__CLR4_4_1mrtmrtlc8azut9.R.globalSliceStart(getClass().getName(),29670);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ie6mpzmw6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrtmrtlc8azut9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrtmrtlc8azut9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testIsBefore_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29670,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ie6mpzmw6(){try{__CLR4_4_1mrtmrtlc8azut9.R.inc(29670);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29671);assertEquals(true, new Instant(TEST_TIME1).isBefore(TEST_TIME2));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29672);assertEquals(false, new Instant(TEST_TIME1).isBefore(TEST_TIME1));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29673);assertEquals(false, new Instant(TEST_TIME2).isBefore(TEST_TIME1));
    }finally{__CLR4_4_1mrtmrtlc8azut9.R.flushNeeded();}}
    
    public void testIsBeforeNow() {__CLR4_4_1mrtmrtlc8azut9.R.globalSliceStart(getClass().getName(),29674);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nh1we6mwa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrtmrtlc8azut9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrtmrtlc8azut9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testIsBeforeNow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29674,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nh1we6mwa(){try{__CLR4_4_1mrtmrtlc8azut9.R.inc(29674);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29675);assertEquals(true, new Instant(TEST_TIME_NOW - 1).isBeforeNow());
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29676);assertEquals(false, new Instant(TEST_TIME_NOW).isBeforeNow());
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29677);assertEquals(false, new Instant(TEST_TIME_NOW + 1).isBeforeNow());
    }finally{__CLR4_4_1mrtmrtlc8azut9.R.flushNeeded();}}
    
    public void testIsBefore_RI() {__CLR4_4_1mrtmrtlc8azut9.R.globalSliceStart(getClass().getName(),29678);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15mphjymwe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrtmrtlc8azut9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrtmrtlc8azut9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testIsBefore_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29678,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15mphjymwe(){try{__CLR4_4_1mrtmrtlc8azut9.R.inc(29678);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29679);Instant test1 = new Instant(TEST_TIME1);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29680);Instant test1a = new Instant(TEST_TIME1);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29681);assertEquals(false, test1.isBefore(test1a));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29682);assertEquals(false, test1a.isBefore(test1));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29683);assertEquals(false, test1.isBefore(test1));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29684);assertEquals(false, test1a.isBefore(test1a));
        
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29685);Instant test2 = new Instant(TEST_TIME2);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29686);assertEquals(true, test1.isBefore(test2));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29687);assertEquals(false, test2.isBefore(test1));
        
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29688);DateTime test3 = new DateTime(TEST_TIME2, GregorianChronology.getInstance(PARIS));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29689);assertEquals(true, test1.isBefore(test3));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29690);assertEquals(false, test3.isBefore(test1));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29691);assertEquals(false, test3.isBefore(test2));
        
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29692);assertEquals(false, test2.isBefore(new MockInstant()));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29693);assertEquals(false, test1.isBefore(new MockInstant()));
        
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29694);assertEquals(false, new Instant(TEST_TIME_NOW + 1).isBefore(null));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29695);assertEquals(false, new Instant(TEST_TIME_NOW).isBefore(null));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29696);assertEquals(true, new Instant(TEST_TIME_NOW - 1).isBefore(null));
    }finally{__CLR4_4_1mrtmrtlc8azut9.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testIsAfter_long() {__CLR4_4_1mrtmrtlc8azut9.R.globalSliceStart(getClass().getName(),29697);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ehltpamwx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrtmrtlc8azut9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrtmrtlc8azut9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testIsAfter_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29697,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ehltpamwx(){try{__CLR4_4_1mrtmrtlc8azut9.R.inc(29697);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29698);assertEquals(false, new Instant(TEST_TIME1).isAfter(TEST_TIME2));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29699);assertEquals(false, new Instant(TEST_TIME1).isAfter(TEST_TIME1));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29700);assertEquals(true, new Instant(TEST_TIME2).isAfter(TEST_TIME1));
    }finally{__CLR4_4_1mrtmrtlc8azut9.R.flushNeeded();}}
    
    public void testIsAfterNow() {__CLR4_4_1mrtmrtlc8azut9.R.globalSliceStart(getClass().getName(),29701);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15bglzxmx1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrtmrtlc8azut9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrtmrtlc8azut9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testIsAfterNow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29701,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15bglzxmx1(){try{__CLR4_4_1mrtmrtlc8azut9.R.inc(29701);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29702);assertEquals(false, new Instant(TEST_TIME_NOW - 1).isAfterNow());
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29703);assertEquals(false, new Instant(TEST_TIME_NOW).isAfterNow());
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29704);assertEquals(true, new Instant(TEST_TIME_NOW + 1).isAfterNow());
    }finally{__CLR4_4_1mrtmrtlc8azut9.R.flushNeeded();}}
    
    public void testIsAfter_RI() {__CLR4_4_1mrtmrtlc8azut9.R.globalSliceStart(getClass().getName(),29705);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n5t0u5mx5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrtmrtlc8azut9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrtmrtlc8azut9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testIsAfter_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29705,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n5t0u5mx5(){try{__CLR4_4_1mrtmrtlc8azut9.R.inc(29705);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29706);Instant test1 = new Instant(TEST_TIME1);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29707);Instant test1a = new Instant(TEST_TIME1);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29708);assertEquals(false, test1.isAfter(test1a));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29709);assertEquals(false, test1a.isAfter(test1));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29710);assertEquals(false, test1.isAfter(test1));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29711);assertEquals(false, test1a.isAfter(test1a));
        
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29712);Instant test2 = new Instant(TEST_TIME2);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29713);assertEquals(false, test1.isAfter(test2));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29714);assertEquals(true, test2.isAfter(test1));
        
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29715);DateTime test3 = new DateTime(TEST_TIME2, GregorianChronology.getInstance(PARIS));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29716);assertEquals(false, test1.isAfter(test3));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29717);assertEquals(true, test3.isAfter(test1));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29718);assertEquals(false, test3.isAfter(test2));
        
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29719);assertEquals(true, test2.isAfter(new MockInstant()));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29720);assertEquals(false, test1.isAfter(new MockInstant()));
        
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29721);assertEquals(true, new Instant(TEST_TIME_NOW + 1).isAfter(null));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29722);assertEquals(false, new Instant(TEST_TIME_NOW).isAfter(null));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29723);assertEquals(false, new Instant(TEST_TIME_NOW - 1).isAfter(null));
    }finally{__CLR4_4_1mrtmrtlc8azut9.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testSerialization() throws Exception {__CLR4_4_1mrtmrtlc8azut9.R.globalSliceStart(getClass().getName(),29724);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on9mxo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrtmrtlc8azut9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrtmrtlc8azut9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29724,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on9mxo() throws Exception{try{__CLR4_4_1mrtmrtlc8azut9.R.inc(29724);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29725);Instant test = new Instant(TEST_TIME_NOW);
        
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29726);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29727);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29728);oos.writeObject(test);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29729);byte[] bytes = baos.toByteArray();
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29730);oos.close();
        
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29731);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29732);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29733);Instant result = (Instant) ois.readObject();
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29734);ois.close();
        
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29735);assertEquals(test, result);
    }finally{__CLR4_4_1mrtmrtlc8azut9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString() {__CLR4_4_1mrtmrtlc8azut9.R.globalSliceStart(getClass().getName(),29736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdidmy0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrtmrtlc8azut9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrtmrtlc8azut9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29736,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdidmy0(){try{__CLR4_4_1mrtmrtlc8azut9.R.inc(29736);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29737);Instant test = new Instant(TEST_TIME_NOW);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29738);assertEquals("2002-06-09T00:00:00.000Z", test.toString());
    }finally{__CLR4_4_1mrtmrtlc8azut9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToInstant() {__CLR4_4_1mrtmrtlc8azut9.R.globalSliceStart(getClass().getName(),29739);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yip9h7my3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrtmrtlc8azut9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrtmrtlc8azut9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToInstant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29739,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yip9h7my3(){try{__CLR4_4_1mrtmrtlc8azut9.R.inc(29739);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29740);Instant test = new Instant(TEST_TIME1);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29741);Instant result = test.toInstant();
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29742);assertSame(test, result);
    }finally{__CLR4_4_1mrtmrtlc8azut9.R.flushNeeded();}}

    public void testToDateTime() {__CLR4_4_1mrtmrtlc8azut9.R.globalSliceStart(getClass().getName(),29743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hmtfovmy7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrtmrtlc8azut9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrtmrtlc8azut9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29743,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hmtfovmy7(){try{__CLR4_4_1mrtmrtlc8azut9.R.inc(29743);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29744);Instant test = new Instant(TEST_TIME1);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29745);DateTime result = test.toDateTime();
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29746);assertEquals(TEST_TIME1, result.getMillis());
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29747);assertEquals(ISOChronology.getInstance(), result.getChronology());
    }finally{__CLR4_4_1mrtmrtlc8azut9.R.flushNeeded();}}

    public void testToDateTimeISO() {__CLR4_4_1mrtmrtlc8azut9.R.globalSliceStart(getClass().getName(),29748);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1udmnxgmyc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrtmrtlc8azut9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrtmrtlc8azut9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToDateTimeISO",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29748,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1udmnxgmyc(){try{__CLR4_4_1mrtmrtlc8azut9.R.inc(29748);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29749);Instant test = new Instant(TEST_TIME1);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29750);DateTime result = test.toDateTimeISO();
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29751);assertSame(DateTime.class, result.getClass());
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29752);assertSame(ISOChronology.class, result.getChronology().getClass());
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29753);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29754);assertEquals(ISOChronology.getInstance(), result.getChronology());
    }finally{__CLR4_4_1mrtmrtlc8azut9.R.flushNeeded();}}

    public void testToDateTime_DateTimeZone() {__CLR4_4_1mrtmrtlc8azut9.R.globalSliceStart(getClass().getName(),29755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14hynetmyj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrtmrtlc8azut9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrtmrtlc8azut9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToDateTime_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29755,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14hynetmyj(){try{__CLR4_4_1mrtmrtlc8azut9.R.inc(29755);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29756);Instant test = new Instant(TEST_TIME1);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29757);DateTime result = test.toDateTime(LONDON);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29758);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29759);assertEquals(ISOChronology.getInstance(LONDON), result.getChronology());

        __CLR4_4_1mrtmrtlc8azut9.R.inc(29760);test = new Instant(TEST_TIME1);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29761);result = test.toDateTime(PARIS);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29762);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29763);assertEquals(ISOChronology.getInstance(PARIS), result.getChronology());

        __CLR4_4_1mrtmrtlc8azut9.R.inc(29764);test = new Instant(TEST_TIME1);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29765);result = test.toDateTime((DateTimeZone) null);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29766);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29767);assertEquals(ISOChronology.getInstance(), result.getChronology());
    }finally{__CLR4_4_1mrtmrtlc8azut9.R.flushNeeded();}}

    public void testToDateTime_Chronology() {__CLR4_4_1mrtmrtlc8azut9.R.globalSliceStart(getClass().getName(),29768);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fzqjjemyw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrtmrtlc8azut9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrtmrtlc8azut9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToDateTime_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29768,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fzqjjemyw(){try{__CLR4_4_1mrtmrtlc8azut9.R.inc(29768);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29769);Instant test = new Instant(TEST_TIME1);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29770);DateTime result = test.toDateTime(ISOChronology.getInstance());
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29771);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29772);assertEquals(ISOChronology.getInstance(), result.getChronology());

        __CLR4_4_1mrtmrtlc8azut9.R.inc(29773);test = new Instant(TEST_TIME1);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29774);result = test.toDateTime(GregorianChronology.getInstance(PARIS));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29775);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29776);assertEquals(GregorianChronology.getInstance(PARIS), result.getChronology());

        __CLR4_4_1mrtmrtlc8azut9.R.inc(29777);test = new Instant(TEST_TIME1);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29778);result = test.toDateTime((Chronology) null);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29779);assertEquals(ISOChronology.getInstance(), result.getChronology());
    }finally{__CLR4_4_1mrtmrtlc8azut9.R.flushNeeded();}}

    public void testToMutableDateTime() {__CLR4_4_1mrtmrtlc8azut9.R.globalSliceStart(getClass().getName(),29780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c071a3mz8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrtmrtlc8azut9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrtmrtlc8azut9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToMutableDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29780,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c071a3mz8(){try{__CLR4_4_1mrtmrtlc8azut9.R.inc(29780);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29781);Instant test = new Instant(TEST_TIME1);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29782);MutableDateTime result = test.toMutableDateTime();
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29783);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29784);assertEquals(ISOChronology.getInstance(), result.getChronology());
    }finally{__CLR4_4_1mrtmrtlc8azut9.R.flushNeeded();}}

    public void testToMutableDateTimeISO() {__CLR4_4_1mrtmrtlc8azut9.R.globalSliceStart(getClass().getName(),29785);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c7exd4mzd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrtmrtlc8azut9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrtmrtlc8azut9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToMutableDateTimeISO",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29785,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c7exd4mzd(){try{__CLR4_4_1mrtmrtlc8azut9.R.inc(29785);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29786);Instant test = new Instant(TEST_TIME1);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29787);MutableDateTime result = test.toMutableDateTimeISO();
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29788);assertSame(MutableDateTime.class, result.getClass());
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29789);assertSame(ISOChronology.class, result.getChronology().getClass());
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29790);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29791);assertEquals(ISOChronology.getInstance(), result.getChronology());
    }finally{__CLR4_4_1mrtmrtlc8azut9.R.flushNeeded();}}

    public void testToMutableDateTime_DateTimeZone() {__CLR4_4_1mrtmrtlc8azut9.R.globalSliceStart(getClass().getName(),29792);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j0i321mzk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrtmrtlc8azut9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrtmrtlc8azut9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToMutableDateTime_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29792,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j0i321mzk(){try{__CLR4_4_1mrtmrtlc8azut9.R.inc(29792);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29793);Instant test = new Instant(TEST_TIME1);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29794);MutableDateTime result = test.toMutableDateTime(LONDON);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29795);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29796);assertEquals(ISOChronology.getInstance(), result.getChronology());

        __CLR4_4_1mrtmrtlc8azut9.R.inc(29797);test = new Instant(TEST_TIME1);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29798);result = test.toMutableDateTime(PARIS);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29799);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29800);assertEquals(ISOChronology.getInstance(PARIS), result.getChronology());

        __CLR4_4_1mrtmrtlc8azut9.R.inc(29801);test = new Instant(TEST_TIME1);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29802);result = test.toMutableDateTime((DateTimeZone) null);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29803);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29804);assertEquals(ISOChronology.getInstance(), result.getChronology());
    }finally{__CLR4_4_1mrtmrtlc8azut9.R.flushNeeded();}}

    public void testToMutableDateTime_Chronology() {__CLR4_4_1mrtmrtlc8azut9.R.globalSliceStart(getClass().getName(),29805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yi6xe2mzx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrtmrtlc8azut9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrtmrtlc8azut9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToMutableDateTime_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29805,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yi6xe2mzx(){try{__CLR4_4_1mrtmrtlc8azut9.R.inc(29805);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29806);Instant test = new Instant(TEST_TIME1);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29807);MutableDateTime result = test.toMutableDateTime(ISOChronology.getInstance());
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29808);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29809);assertEquals(ISOChronology.getInstance(), result.getChronology());

        __CLR4_4_1mrtmrtlc8azut9.R.inc(29810);test = new Instant(TEST_TIME1);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29811);result = test.toMutableDateTime(GregorianChronology.getInstance(PARIS));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29812);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29813);assertEquals(GregorianChronology.getInstance(PARIS), result.getChronology());

        __CLR4_4_1mrtmrtlc8azut9.R.inc(29814);test = new Instant(TEST_TIME1);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29815);result = test.toMutableDateTime((Chronology) null);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29816);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29817);assertEquals(ISOChronology.getInstance(), result.getChronology());
    }finally{__CLR4_4_1mrtmrtlc8azut9.R.flushNeeded();}}

    public void testToDate() {__CLR4_4_1mrtmrtlc8azut9.R.globalSliceStart(getClass().getName(),29818);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wvdkgyn0a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrtmrtlc8azut9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrtmrtlc8azut9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29818,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wvdkgyn0a(){try{__CLR4_4_1mrtmrtlc8azut9.R.inc(29818);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29819);Instant test = new Instant(TEST_TIME1);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29820);Date result = test.toDate();
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29821);assertEquals(test.getMillis(), result.getTime());
    }finally{__CLR4_4_1mrtmrtlc8azut9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithMillis_long() {__CLR4_4_1mrtmrtlc8azut9.R.globalSliceStart(getClass().getName(),29822);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n9ypzwn0e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrtmrtlc8azut9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrtmrtlc8azut9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testWithMillis_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29822,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n9ypzwn0e(){try{__CLR4_4_1mrtmrtlc8azut9.R.inc(29822);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29823);Instant test = new Instant(TEST_TIME1);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29824);Instant result = test.withMillis(TEST_TIME2);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29825);assertEquals(TEST_TIME2, result.getMillis());
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29826);assertEquals(test.getChronology(), result.getChronology());
        
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29827);test = new Instant(TEST_TIME1);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29828);result = test.withMillis(TEST_TIME1);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29829);assertSame(test, result);
    }finally{__CLR4_4_1mrtmrtlc8azut9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithDurationAdded_long_int() {__CLR4_4_1mrtmrtlc8azut9.R.globalSliceStart(getClass().getName(),29830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q11w3in0m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrtmrtlc8azut9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrtmrtlc8azut9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testWithDurationAdded_long_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29830,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q11w3in0m(){try{__CLR4_4_1mrtmrtlc8azut9.R.inc(29830);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29831);Instant test = new Instant(TEST_TIME1);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29832);Instant result = test.withDurationAdded(123456789L, 1);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29833);Instant expected = new Instant(TEST_TIME1 + 123456789L);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29834);assertEquals(expected, result);
        
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29835);result = test.withDurationAdded(123456789L, 0);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29836);assertSame(test, result);
        
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29837);result = test.withDurationAdded(123456789L, 2);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29838);expected = new Instant(TEST_TIME1 + (2L * 123456789L));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29839);assertEquals(expected, result);
        
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29840);result = test.withDurationAdded(123456789L, -3);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29841);expected = new Instant(TEST_TIME1 - (3L * 123456789L));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29842);assertEquals(expected, result);
    }finally{__CLR4_4_1mrtmrtlc8azut9.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testWithDurationAdded_RD_int() {__CLR4_4_1mrtmrtlc8azut9.R.globalSliceStart(getClass().getName(),29843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hcnxxon0z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrtmrtlc8azut9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrtmrtlc8azut9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testWithDurationAdded_RD_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29843,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hcnxxon0z(){try{__CLR4_4_1mrtmrtlc8azut9.R.inc(29843);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29844);Instant test = new Instant(TEST_TIME1);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29845);Instant result = test.withDurationAdded(new Duration(123456789L), 1);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29846);Instant expected = new Instant(TEST_TIME1 + 123456789L);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29847);assertEquals(expected, result);
        
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29848);result = test.withDurationAdded(null, 1);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29849);assertSame(test, result);
        
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29850);result = test.withDurationAdded(new Duration(123456789L), 0);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29851);assertSame(test, result);
        
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29852);result = test.withDurationAdded(new Duration(123456789L), 2);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29853);expected = new Instant(TEST_TIME1 + (2L * 123456789L));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29854);assertEquals(expected, result);
        
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29855);result = test.withDurationAdded(new Duration(123456789L), -3);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29856);expected = new Instant(TEST_TIME1 - (3L * 123456789L));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29857);assertEquals(expected, result);
    }finally{__CLR4_4_1mrtmrtlc8azut9.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------    
    public void testPlus_long() {__CLR4_4_1mrtmrtlc8azut9.R.globalSliceStart(getClass().getName(),29858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14dfcomn1e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrtmrtlc8azut9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrtmrtlc8azut9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testPlus_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29858,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14dfcomn1e(){try{__CLR4_4_1mrtmrtlc8azut9.R.inc(29858);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29859);Instant test = new Instant(TEST_TIME1);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29860);Instant result = test.plus(123456789L);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29861);Instant expected = new Instant(TEST_TIME1 + 123456789L);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29862);assertEquals(expected, result);
    }finally{__CLR4_4_1mrtmrtlc8azut9.R.flushNeeded();}}
    
    public void testPlus_RD() {__CLR4_4_1mrtmrtlc8azut9.R.globalSliceStart(getClass().getName(),29863);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_121wcz0n1j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrtmrtlc8azut9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrtmrtlc8azut9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testPlus_RD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29863,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_121wcz0n1j(){try{__CLR4_4_1mrtmrtlc8azut9.R.inc(29863);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29864);Instant test = new Instant(TEST_TIME1);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29865);Instant result = test.plus(new Duration(123456789L));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29866);Instant expected = new Instant(TEST_TIME1 + 123456789L);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29867);assertEquals(expected, result);
        
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29868);result = test.plus((ReadableDuration) null);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29869);assertSame(test, result);
    }finally{__CLR4_4_1mrtmrtlc8azut9.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------    
    public void testMinus_long() {__CLR4_4_1mrtmrtlc8azut9.R.globalSliceStart(getClass().getName(),29870);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gse7d0n1q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrtmrtlc8azut9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrtmrtlc8azut9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testMinus_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29870,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gse7d0n1q(){try{__CLR4_4_1mrtmrtlc8azut9.R.inc(29870);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29871);Instant test = new Instant(TEST_TIME1);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29872);Instant result = test.minus(123456789L);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29873);Instant expected = new Instant(TEST_TIME1 - 123456789L);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29874);assertEquals(expected, result);
    }finally{__CLR4_4_1mrtmrtlc8azut9.R.flushNeeded();}}
    
    public void testMinus_RD() {__CLR4_4_1mrtmrtlc8azut9.R.globalSliceStart(getClass().getName(),29875);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uyrr3un1v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrtmrtlc8azut9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrtmrtlc8azut9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testMinus_RD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29875,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uyrr3un1v(){try{__CLR4_4_1mrtmrtlc8azut9.R.inc(29875);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29876);Instant test = new Instant(TEST_TIME1);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29877);Instant result = test.minus(new Duration(123456789L));
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29878);Instant expected = new Instant(TEST_TIME1 - 123456789L);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29879);assertEquals(expected, result);
        
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29880);result = test.minus((ReadableDuration) null);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29881);assertSame(test, result);
    }finally{__CLR4_4_1mrtmrtlc8azut9.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testImmutable() {__CLR4_4_1mrtmrtlc8azut9.R.globalSliceStart(getClass().getName(),29882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1origfdn22();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1mrtmrtlc8azut9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1mrtmrtlc8azut9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testImmutable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29882,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1origfdn22(){try{__CLR4_4_1mrtmrtlc8azut9.R.inc(29882);
        __CLR4_4_1mrtmrtlc8azut9.R.inc(29883);assertTrue(Modifier.isFinal(Instant.class.getModifiers()));
    }finally{__CLR4_4_1mrtmrtlc8azut9.R.flushNeeded();}}

}
