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

/**
 * This class is a JUnit test for PeriodType.
 *
 * @author Stephen Colebourne
 */
public class TestPeriodType extends TestCase {static class __CLR4_4_1xaqxaqlc8azw4g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,43790,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public static void main(String[] args) {try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43154);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43155);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43156);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43157);return new TestSuite(TestPeriodType.class);
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    public TestPeriodType(String name) {
        super(name);__CLR4_4_1xaqxaqlc8azw4g.R.inc(43159);try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43158);
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43160);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43161);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43162);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43163);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43164);originalLocale = Locale.getDefault();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43165);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43166);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43167);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43168);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43169);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43170);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43171);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43172);Locale.setDefault(originalLocale);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43173);originalDateTimeZone = null;
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43174);originalTimeZone = null;
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43175);originalLocale = null;
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testTest() {__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceStart(getClass().getName(),43176);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqjxbc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xaqxaqlc8azw4g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43176,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqjxbc(){try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43176);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43177);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43178);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43179);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void assertEqualsAfterSerialization(PeriodType type) throws Exception {try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43180);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43181);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43182);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43183);oos.writeObject(type);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43184);byte[] bytes = baos.toByteArray();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43185);oos.close();
        
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43186);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43187);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43188);PeriodType result = (PeriodType) ois.readObject();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43189);ois.close();
        
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43190);assertEquals(type, result);
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    private void assertSameAfterSerialization(PeriodType type) throws Exception {try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43191);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43192);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43193);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43194);oos.writeObject(type);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43195);byte[] bytes = baos.toByteArray();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43196);oos.close();
        
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43197);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43198);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43199);PeriodType result = (PeriodType) ois.readObject();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43200);ois.close();
        
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43201);assertEquals(type, result);
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testStandard() throws Exception {__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceStart(getClass().getName(),43202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pjsc0mxc2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xaqxaqlc8azw4g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testStandard",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43202,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pjsc0mxc2() throws Exception{try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43202);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43203);PeriodType type = PeriodType.standard();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43204);assertEquals(8, type.size());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43205);assertEquals(DurationFieldType.years(), type.getFieldType(0));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43206);assertEquals(DurationFieldType.months(), type.getFieldType(1));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43207);assertEquals(DurationFieldType.weeks(), type.getFieldType(2));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43208);assertEquals(DurationFieldType.days(), type.getFieldType(3));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43209);assertEquals(DurationFieldType.hours(), type.getFieldType(4));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43210);assertEquals(DurationFieldType.minutes(), type.getFieldType(5));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43211);assertEquals(DurationFieldType.seconds(), type.getFieldType(6));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43212);assertEquals(DurationFieldType.millis(), type.getFieldType(7));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43213);assertEquals("Standard", type.getName());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43214);assertEquals("PeriodType[Standard]", type.toString());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43215);assertEquals(true, type.equals(type));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43216);assertEquals(true, type == PeriodType.standard());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43217);assertEquals(false, type.equals(PeriodType.millis()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43218);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43219);assertEquals(true, type.hashCode() == PeriodType.standard().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43220);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43221);assertSameAfterSerialization(type);
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testYearMonthDayTime() throws Exception {__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceStart(getClass().getName(),43222);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_193g4ovxcm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xaqxaqlc8azw4g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testYearMonthDayTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43222,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_193g4ovxcm() throws Exception{try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43222);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43223);PeriodType type = PeriodType.yearMonthDayTime();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43224);assertEquals(7, type.size());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43225);assertEquals(DurationFieldType.years(), type.getFieldType(0));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43226);assertEquals(DurationFieldType.months(), type.getFieldType(1));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43227);assertEquals(DurationFieldType.days(), type.getFieldType(2));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43228);assertEquals(DurationFieldType.hours(), type.getFieldType(3));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43229);assertEquals(DurationFieldType.minutes(), type.getFieldType(4));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43230);assertEquals(DurationFieldType.seconds(), type.getFieldType(5));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43231);assertEquals(DurationFieldType.millis(), type.getFieldType(6));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43232);assertEquals("YearMonthDayTime", type.getName());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43233);assertEquals("PeriodType[YearMonthDayTime]", type.toString());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43234);assertEquals(true, type.equals(type));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43235);assertEquals(true, type == PeriodType.yearMonthDayTime());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43236);assertEquals(false, type.equals(PeriodType.millis()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43237);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43238);assertEquals(true, type.hashCode() == PeriodType.yearMonthDayTime().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43239);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43240);assertSameAfterSerialization(type);
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testYearMonthDay() throws Exception {__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceStart(getClass().getName(),43241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yrq4gexd5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xaqxaqlc8azw4g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testYearMonthDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43241,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yrq4gexd5() throws Exception{try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43241);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43242);PeriodType type = PeriodType.yearMonthDay();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43243);assertEquals(3, type.size());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43244);assertEquals(DurationFieldType.years(), type.getFieldType(0));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43245);assertEquals(DurationFieldType.months(), type.getFieldType(1));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43246);assertEquals(DurationFieldType.days(), type.getFieldType(2));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43247);assertEquals("YearMonthDay", type.getName());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43248);assertEquals("PeriodType[YearMonthDay]", type.toString());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43249);assertEquals(true, type.equals(type));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43250);assertEquals(true, type == PeriodType.yearMonthDay());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43251);assertEquals(false, type.equals(PeriodType.millis()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43252);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43253);assertEquals(true, type.hashCode() == PeriodType.yearMonthDay().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43254);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43255);assertSameAfterSerialization(type);
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testYearWeekDayTime() throws Exception {__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceStart(getClass().getName(),43256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fqhz4dxdk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xaqxaqlc8azw4g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testYearWeekDayTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43256,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fqhz4dxdk() throws Exception{try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43256);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43257);PeriodType type = PeriodType.yearWeekDayTime();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43258);assertEquals(7, type.size());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43259);assertEquals(DurationFieldType.years(), type.getFieldType(0));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43260);assertEquals(DurationFieldType.weeks(), type.getFieldType(1));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43261);assertEquals(DurationFieldType.days(), type.getFieldType(2));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43262);assertEquals(DurationFieldType.hours(), type.getFieldType(3));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43263);assertEquals(DurationFieldType.minutes(), type.getFieldType(4));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43264);assertEquals(DurationFieldType.seconds(), type.getFieldType(5));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43265);assertEquals(DurationFieldType.millis(), type.getFieldType(6));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43266);assertEquals("YearWeekDayTime", type.getName());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43267);assertEquals("PeriodType[YearWeekDayTime]", type.toString());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43268);assertEquals(true, type.equals(type));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43269);assertEquals(true, type == PeriodType.yearWeekDayTime());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43270);assertEquals(false, type.equals(PeriodType.millis()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43271);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43272);assertEquals(true, type.hashCode() == PeriodType.yearWeekDayTime().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43273);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43274);assertSameAfterSerialization(type);
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testYearWeekDay() throws Exception {__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceStart(getClass().getName(),43275);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mm5kn4xe3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xaqxaqlc8azw4g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testYearWeekDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43275,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mm5kn4xe3() throws Exception{try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43275);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43276);PeriodType type = PeriodType.yearWeekDay();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43277);assertEquals(3, type.size());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43278);assertEquals(DurationFieldType.years(), type.getFieldType(0));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43279);assertEquals(DurationFieldType.weeks(), type.getFieldType(1));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43280);assertEquals(DurationFieldType.days(), type.getFieldType(2));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43281);assertEquals("YearWeekDay", type.getName());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43282);assertEquals("PeriodType[YearWeekDay]", type.toString());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43283);assertEquals(true, type.equals(type));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43284);assertEquals(true, type == PeriodType.yearWeekDay());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43285);assertEquals(false, type.equals(PeriodType.millis()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43286);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43287);assertEquals(true, type.hashCode() == PeriodType.yearWeekDay().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43288);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43289);assertSameAfterSerialization(type);
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testYearDayTime() throws Exception {__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceStart(getClass().getName(),43290);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s5iogvxei();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xaqxaqlc8azw4g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testYearDayTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43290,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s5iogvxei() throws Exception{try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43290);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43291);PeriodType type = PeriodType.yearDayTime();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43292);assertEquals(6, type.size());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43293);assertEquals(DurationFieldType.years(), type.getFieldType(0));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43294);assertEquals(DurationFieldType.days(), type.getFieldType(1));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43295);assertEquals(DurationFieldType.hours(), type.getFieldType(2));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43296);assertEquals(DurationFieldType.minutes(), type.getFieldType(3));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43297);assertEquals(DurationFieldType.seconds(), type.getFieldType(4));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43298);assertEquals(DurationFieldType.millis(), type.getFieldType(5));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43299);assertEquals("YearDayTime", type.getName());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43300);assertEquals("PeriodType[YearDayTime]", type.toString());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43301);assertEquals(true, type.equals(type));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43302);assertEquals(true, type == PeriodType.yearDayTime());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43303);assertEquals(false, type.equals(PeriodType.millis()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43304);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43305);assertEquals(true, type.hashCode() == PeriodType.yearDayTime().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43306);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43307);assertSameAfterSerialization(type);
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testYearDay() throws Exception {__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceStart(getClass().getName(),43308);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p6ku24xf0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xaqxaqlc8azw4g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testYearDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43308,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p6ku24xf0() throws Exception{try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43308);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43309);PeriodType type = PeriodType.yearDay();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43310);assertEquals(2, type.size());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43311);assertEquals(DurationFieldType.years(), type.getFieldType(0));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43312);assertEquals(DurationFieldType.days(), type.getFieldType(1));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43313);assertEquals("YearDay", type.getName());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43314);assertEquals("PeriodType[YearDay]", type.toString());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43315);assertEquals(true, type.equals(type));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43316);assertEquals(true, type == PeriodType.yearDay());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43317);assertEquals(false, type.equals(PeriodType.millis()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43318);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43319);assertEquals(true, type.hashCode() == PeriodType.yearDay().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43320);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43321);assertSameAfterSerialization(type);
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testDayTime() throws Exception {__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceStart(getClass().getName(),43322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mwg2daxfe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xaqxaqlc8azw4g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testDayTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43322,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mwg2daxfe() throws Exception{try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43322);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43323);PeriodType type = PeriodType.dayTime();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43324);assertEquals(5, type.size());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43325);assertEquals(DurationFieldType.days(), type.getFieldType(0));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43326);assertEquals(DurationFieldType.hours(), type.getFieldType(1));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43327);assertEquals(DurationFieldType.minutes(), type.getFieldType(2));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43328);assertEquals(DurationFieldType.seconds(), type.getFieldType(3));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43329);assertEquals(DurationFieldType.millis(), type.getFieldType(4));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43330);assertEquals("DayTime", type.getName());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43331);assertEquals("PeriodType[DayTime]", type.toString());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43332);assertEquals(true, type.equals(type));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43333);assertEquals(true, type == PeriodType.dayTime());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43334);assertEquals(false, type.equals(PeriodType.millis()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43335);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43336);assertEquals(true, type.hashCode() == PeriodType.dayTime().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43337);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43338);assertSameAfterSerialization(type);
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testTime() throws Exception {__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceStart(getClass().getName(),43339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1idzswqxfv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xaqxaqlc8azw4g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43339,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1idzswqxfv() throws Exception{try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43339);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43340);PeriodType type = PeriodType.time();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43341);assertEquals(4, type.size());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43342);assertEquals(DurationFieldType.hours(), type.getFieldType(0));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43343);assertEquals(DurationFieldType.minutes(), type.getFieldType(1));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43344);assertEquals(DurationFieldType.seconds(), type.getFieldType(2));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43345);assertEquals(DurationFieldType.millis(), type.getFieldType(3));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43346);assertEquals("Time", type.getName());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43347);assertEquals("PeriodType[Time]", type.toString());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43348);assertEquals(true, type.equals(type));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43349);assertEquals(true, type == PeriodType.time());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43350);assertEquals(false, type.equals(PeriodType.millis()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43351);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43352);assertEquals(true, type.hashCode() == PeriodType.time().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43353);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43354);assertSameAfterSerialization(type);
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testYears() throws Exception {__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceStart(getClass().getName(),43355);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nq13v9xgb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xaqxaqlc8azw4g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testYears",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43355,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nq13v9xgb() throws Exception{try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43355);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43356);PeriodType type = PeriodType.years();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43357);assertEquals(1, type.size());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43358);assertEquals(DurationFieldType.years(), type.getFieldType(0));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43359);assertEquals("Years", type.getName());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43360);assertEquals("PeriodType[Years]", type.toString());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43361);assertEquals(true, type.equals(type));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43362);assertEquals(true, type == PeriodType.years());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43363);assertEquals(false, type.equals(PeriodType.standard()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43364);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43365);assertEquals(true, type.hashCode() == PeriodType.years().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43366);assertEquals(false, type.hashCode() == PeriodType.standard().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43367);assertSameAfterSerialization(type);
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testMonths() throws Exception {__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceStart(getClass().getName(),43368);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bildmcxgo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xaqxaqlc8azw4g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMonths",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43368,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bildmcxgo() throws Exception{try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43368);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43369);PeriodType type = PeriodType.months();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43370);assertEquals(1, type.size());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43371);assertEquals(DurationFieldType.months(), type.getFieldType(0));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43372);assertEquals("Months", type.getName());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43373);assertEquals("PeriodType[Months]", type.toString());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43374);assertEquals(true, type.equals(type));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43375);assertEquals(true, type == PeriodType.months());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43376);assertEquals(false, type.equals(PeriodType.standard()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43377);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43378);assertEquals(true, type.hashCode() == PeriodType.months().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43379);assertEquals(false, type.hashCode() == PeriodType.standard().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43380);assertSameAfterSerialization(type);
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWeeks() throws Exception {__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceStart(getClass().getName(),43381);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r409pwxh1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xaqxaqlc8azw4g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testWeeks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43381,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r409pwxh1() throws Exception{try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43381);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43382);PeriodType type = PeriodType.weeks();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43383);assertEquals(1, type.size());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43384);assertEquals(DurationFieldType.weeks(), type.getFieldType(0));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43385);assertEquals("Weeks", type.getName());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43386);assertEquals("PeriodType[Weeks]", type.toString());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43387);assertEquals(true, type.equals(type));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43388);assertEquals(true, type == PeriodType.weeks());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43389);assertEquals(false, type.equals(PeriodType.standard()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43390);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43391);assertEquals(true, type.hashCode() == PeriodType.weeks().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43392);assertEquals(false, type.hashCode() == PeriodType.standard().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43393);assertSameAfterSerialization(type);
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testDays() throws Exception {__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceStart(getClass().getName(),43394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vzehn4xhe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xaqxaqlc8azw4g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testDays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43394,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vzehn4xhe() throws Exception{try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43394);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43395);PeriodType type = PeriodType.days();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43396);assertEquals(1, type.size());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43397);assertEquals(DurationFieldType.days(), type.getFieldType(0));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43398);assertEquals("Days", type.getName());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43399);assertEquals("PeriodType[Days]", type.toString());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43400);assertEquals(true, type.equals(type));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43401);assertEquals(true, type == PeriodType.days());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43402);assertEquals(false, type.equals(PeriodType.standard()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43403);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43404);assertEquals(true, type.hashCode() == PeriodType.days().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43405);assertEquals(false, type.hashCode() == PeriodType.standard().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43406);assertSameAfterSerialization(type);
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testHours() throws Exception {__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceStart(getClass().getName(),43407);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hyy94sxhr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xaqxaqlc8azw4g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testHours",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43407,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hyy94sxhr() throws Exception{try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43407);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43408);PeriodType type = PeriodType.hours();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43409);assertEquals(1, type.size());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43410);assertEquals(DurationFieldType.hours(), type.getFieldType(0));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43411);assertEquals("Hours", type.getName());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43412);assertEquals("PeriodType[Hours]", type.toString());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43413);assertEquals(true, type.equals(type));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43414);assertEquals(true, type == PeriodType.hours());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43415);assertEquals(false, type.equals(PeriodType.standard()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43416);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43417);assertEquals(true, type.hashCode() == PeriodType.hours().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43418);assertEquals(false, type.hashCode() == PeriodType.standard().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43419);assertSameAfterSerialization(type);
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testMinutes() throws Exception {__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceStart(getClass().getName(),43420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z1oajwxi4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xaqxaqlc8azw4g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMinutes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43420,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z1oajwxi4() throws Exception{try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43420);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43421);PeriodType type = PeriodType.minutes();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43422);assertEquals(1, type.size());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43423);assertEquals(DurationFieldType.minutes(), type.getFieldType(0));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43424);assertEquals("Minutes", type.getName());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43425);assertEquals("PeriodType[Minutes]", type.toString());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43426);assertEquals(true, type.equals(type));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43427);assertEquals(true, type == PeriodType.minutes());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43428);assertEquals(false, type.equals(PeriodType.standard()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43429);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43430);assertEquals(true, type.hashCode() == PeriodType.minutes().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43431);assertEquals(false, type.hashCode() == PeriodType.standard().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43432);assertSameAfterSerialization(type);
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSeconds() throws Exception {__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceStart(getClass().getName(),43433);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mni66kxih();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xaqxaqlc8azw4g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testSeconds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43433,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mni66kxih() throws Exception{try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43433);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43434);PeriodType type = PeriodType.seconds();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43435);assertEquals(1, type.size());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43436);assertEquals(DurationFieldType.seconds(), type.getFieldType(0));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43437);assertEquals("Seconds", type.getName());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43438);assertEquals("PeriodType[Seconds]", type.toString());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43439);assertEquals(true, type.equals(type));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43440);assertEquals(true, type == PeriodType.seconds());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43441);assertEquals(false, type.equals(PeriodType.standard()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43442);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43443);assertEquals(true, type.hashCode() == PeriodType.seconds().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43444);assertEquals(false, type.hashCode() == PeriodType.standard().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43445);assertSameAfterSerialization(type);
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testMillis() throws Exception {__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceStart(getClass().getName(),43446);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ol9hs1xiu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xaqxaqlc8azw4g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43446,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ol9hs1xiu() throws Exception{try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43446);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43447);PeriodType type = PeriodType.millis();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43448);assertEquals(1, type.size());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43449);assertEquals(DurationFieldType.millis(), type.getFieldType(0));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43450);assertEquals("Millis", type.getName());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43451);assertEquals("PeriodType[Millis]", type.toString());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43452);assertEquals(true, type.equals(type));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43453);assertEquals(true, type == PeriodType.millis());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43454);assertEquals(false, type.equals(PeriodType.standard()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43455);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43456);assertEquals(true, type.hashCode() == PeriodType.millis().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43457);assertEquals(false, type.hashCode() == PeriodType.standard().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43458);assertSameAfterSerialization(type);
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testForFields1() throws Exception {__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceStart(getClass().getName(),43459);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u9q520xj7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xaqxaqlc8azw4g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testForFields1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43459,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u9q520xj7() throws Exception{try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43459);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43460);PeriodType type = PeriodType.forFields(new DurationFieldType[] {
            DurationFieldType.years(),
        });
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43461);assertSame(PeriodType.years(), type);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43462);type = PeriodType.forFields(new DurationFieldType[] {
            DurationFieldType.months(),
        });
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43463);assertSame(PeriodType.months(), type);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43464);type = PeriodType.forFields(new DurationFieldType[] {
                DurationFieldType.weeks(),
        });
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43465);assertSame(PeriodType.weeks(), type);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43466);type = PeriodType.forFields(new DurationFieldType[] {
                DurationFieldType.days(),
        });
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43467);assertSame(PeriodType.days(), type);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43468);type = PeriodType.forFields(new DurationFieldType[] {
                DurationFieldType.hours(),
        });
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43469);assertSame(PeriodType.hours(), type);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43470);type = PeriodType.forFields(new DurationFieldType[] {
                DurationFieldType.minutes(),
        });
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43471);assertSame(PeriodType.minutes(), type);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43472);type = PeriodType.forFields(new DurationFieldType[] {
                DurationFieldType.seconds(),
        });
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43473);assertSame(PeriodType.seconds(), type);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43474);type = PeriodType.forFields(new DurationFieldType[] {
                DurationFieldType.millis(),
        });
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43475);assertSame(PeriodType.millis(), type);
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    public void testForFields2() throws Exception {__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceStart(getClass().getName(),43476);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r0q69jxjo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xaqxaqlc8azw4g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testForFields2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43476,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r0q69jxjo() throws Exception{try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43476);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43477);DurationFieldType[] types = new DurationFieldType[] {
            DurationFieldType.years(),
            DurationFieldType.hours(),
        };
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43478);PeriodType type = PeriodType.forFields(types);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43479);assertEquals(2, type.size());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43480);assertEquals(DurationFieldType.years(), type.getFieldType(0));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43481);assertEquals(DurationFieldType.hours(), type.getFieldType(1));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43482);assertEquals("StandardNoMonthsNoWeeksNoDaysNoMinutesNoSecondsNoMillis", type.getName());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43483);assertEquals("PeriodType[StandardNoMonthsNoWeeksNoDaysNoMinutesNoSecondsNoMillis]", type.toString());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43484);assertEquals(true, type.equals(type));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43485);assertEquals(true, type == PeriodType.forFields(types));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43486);assertEquals(false, type.equals(PeriodType.millis()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43487);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43488);assertEquals(true, type.hashCode() == PeriodType.forFields(types).hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43489);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43490);assertSameAfterSerialization(type);
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    public void testForFields3() throws Exception {__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceStart(getClass().getName(),43491);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nrq7h2xk3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xaqxaqlc8azw4g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testForFields3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43491,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nrq7h2xk3() throws Exception{try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43491);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43492);DurationFieldType[] types = new DurationFieldType[] {
            DurationFieldType.months(),
            DurationFieldType.weeks(),
        };
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43493);PeriodType type = PeriodType.forFields(types);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43494);assertEquals(2, type.size());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43495);assertEquals(DurationFieldType.months(), type.getFieldType(0));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43496);assertEquals(DurationFieldType.weeks(), type.getFieldType(1));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43497);assertEquals("StandardNoYearsNoDaysNoHoursNoMinutesNoSecondsNoMillis", type.getName());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43498);assertEquals("PeriodType[StandardNoYearsNoDaysNoHoursNoMinutesNoSecondsNoMillis]", type.toString());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43499);assertEquals(true, type.equals(type));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43500);assertEquals(true, type == PeriodType.forFields(types));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43501);assertEquals(false, type.equals(PeriodType.millis()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43502);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43503);assertEquals(true, type.hashCode() == PeriodType.forFields(types).hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43504);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43505);assertSameAfterSerialization(type);
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    public void testForFields4() throws Exception {__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceStart(getClass().getName(),43506);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kiq8olxki();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xaqxaqlc8azw4g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testForFields4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43506,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kiq8olxki() throws Exception{try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43506);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43507);DurationFieldType[] types = new DurationFieldType[] {
            DurationFieldType.weeks(),
            DurationFieldType.days(),  // adding this makes this test unique, so cache is not pre-populated
            DurationFieldType.months(),
        };
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43508);DurationFieldType[] types2 = new DurationFieldType[] {
            DurationFieldType.months(),
            DurationFieldType.days(),
            DurationFieldType.weeks(),
        };
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43509);PeriodType type = PeriodType.forFields(types);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43510);PeriodType type2 = PeriodType.forFields(types2);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43511);assertEquals(true, type == type2);
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    public void testForFields5() throws Exception {__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceStart(getClass().getName(),43512);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h9q9w4xko();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xaqxaqlc8azw4g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testForFields5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43512,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h9q9w4xko() throws Exception{try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43512);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43513);DurationFieldType[] types = new DurationFieldType[] {
            DurationFieldType.centuries(),
            DurationFieldType.months(),
        };
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43514);try {
            __CLR4_4_1xaqxaqlc8azw4g.R.inc(43515);PeriodType.forFields(types);
            __CLR4_4_1xaqxaqlc8azw4g.R.inc(43516);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43517);try {
            __CLR4_4_1xaqxaqlc8azw4g.R.inc(43518);PeriodType.forFields(types);  // repeated for test coverage of cache
            __CLR4_4_1xaqxaqlc8azw4g.R.inc(43519);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    public void testForFields6() throws Exception {__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceStart(getClass().getName(),43520);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e0qb3nxkw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xaqxaqlc8azw4g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testForFields6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43520,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e0qb3nxkw() throws Exception{try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43520);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43521);DurationFieldType[] types = null;
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43522);try {
            __CLR4_4_1xaqxaqlc8azw4g.R.inc(43523);PeriodType.forFields(types);
            __CLR4_4_1xaqxaqlc8azw4g.R.inc(43524);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43525);types = new DurationFieldType[0];
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43526);try {
            __CLR4_4_1xaqxaqlc8azw4g.R.inc(43527);PeriodType.forFields(types);
            __CLR4_4_1xaqxaqlc8azw4g.R.inc(43528);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43529);types = new DurationFieldType[] {
            null,
            DurationFieldType.months(),
        };
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43530);try {
            __CLR4_4_1xaqxaqlc8azw4g.R.inc(43531);PeriodType.forFields(types);
            __CLR4_4_1xaqxaqlc8azw4g.R.inc(43532);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43533);types = new DurationFieldType[] {
            DurationFieldType.months(),
            null,
        };
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43534);try {
            __CLR4_4_1xaqxaqlc8azw4g.R.inc(43535);PeriodType.forFields(types);
            __CLR4_4_1xaqxaqlc8azw4g.R.inc(43536);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    // ensure hash key distribution
    public void testForFields7() throws Exception {__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceStart(getClass().getName(),43537);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1arqcb6xld();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xaqxaqlc8azw4g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testForFields7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43537,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1arqcb6xld() throws Exception{try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43537);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43538);DurationFieldType[] types = new DurationFieldType[] {
            DurationFieldType.weeks(),
            DurationFieldType.months(),
        };
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43539);DurationFieldType[] types2 = new DurationFieldType[] {
            DurationFieldType.seconds(),
        };
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43540);PeriodType type = PeriodType.forFields(types);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43541);PeriodType type2 = PeriodType.forFields(types2);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43542);assertEquals(false, type == type2);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43543);assertEquals(false, type.equals(type2));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43544);assertEquals(false, type.hashCode() == type2.hashCode());
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testMaskYears() throws Exception {__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceStart(getClass().getName(),43545);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19x580xxll();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xaqxaqlc8azw4g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskYears",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43545,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19x580xxll() throws Exception{try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43545);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43546);PeriodType type = PeriodType.standard().withYearsRemoved();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43547);assertEquals(7, type.size());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43548);assertEquals(DurationFieldType.months(), type.getFieldType(0));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43549);assertEquals(DurationFieldType.weeks(), type.getFieldType(1));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43550);assertEquals(DurationFieldType.days(), type.getFieldType(2));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43551);assertEquals(DurationFieldType.hours(), type.getFieldType(3));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43552);assertEquals(DurationFieldType.minutes(), type.getFieldType(4));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43553);assertEquals(DurationFieldType.seconds(), type.getFieldType(5));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43554);assertEquals(DurationFieldType.millis(), type.getFieldType(6));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43555);assertEquals(true, type.equals(type));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43556);assertEquals(true, type.equals(PeriodType.standard().withYearsRemoved()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43557);assertEquals(false, type.equals(PeriodType.millis()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43558);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43559);assertEquals(true, type.hashCode() == PeriodType.standard().withYearsRemoved().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43560);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43561);assertEquals("StandardNoYears", type.getName());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43562);assertEquals("PeriodType[StandardNoYears]", type.toString());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43563);assertEqualsAfterSerialization(type);
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testMaskMonths() throws Exception {__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceStart(getClass().getName(),43564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19ttacoxm4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xaqxaqlc8azw4g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskMonths",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43564,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19ttacoxm4() throws Exception{try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43564);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43565);PeriodType type = PeriodType.standard().withMonthsRemoved();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43566);assertEquals(7, type.size());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43567);assertEquals(DurationFieldType.years(), type.getFieldType(0));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43568);assertEquals(DurationFieldType.weeks(), type.getFieldType(1));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43569);assertEquals(DurationFieldType.days(), type.getFieldType(2));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43570);assertEquals(DurationFieldType.hours(), type.getFieldType(3));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43571);assertEquals(DurationFieldType.minutes(), type.getFieldType(4));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43572);assertEquals(DurationFieldType.seconds(), type.getFieldType(5));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43573);assertEquals(DurationFieldType.millis(), type.getFieldType(6));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43574);assertEquals(true, type.equals(type));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43575);assertEquals(true, type.equals(PeriodType.standard().withMonthsRemoved()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43576);assertEquals(false, type.equals(PeriodType.millis()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43577);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43578);assertEquals(true, type.hashCode() == PeriodType.standard().withMonthsRemoved().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43579);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43580);assertEquals("StandardNoMonths", type.getName());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43581);assertEquals("PeriodType[StandardNoMonths]", type.toString());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43582);assertEqualsAfterSerialization(type);
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testMaskWeeks() throws Exception {__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceStart(getClass().getName(),43583);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u47wewxmn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xaqxaqlc8azw4g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskWeeks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43583,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u47wewxmn() throws Exception{try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43583);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43584);PeriodType type = PeriodType.standard().withWeeksRemoved();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43585);assertEquals(7, type.size());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43586);assertEquals(DurationFieldType.years(), type.getFieldType(0));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43587);assertEquals(DurationFieldType.months(), type.getFieldType(1));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43588);assertEquals(DurationFieldType.days(), type.getFieldType(2));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43589);assertEquals(DurationFieldType.hours(), type.getFieldType(3));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43590);assertEquals(DurationFieldType.minutes(), type.getFieldType(4));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43591);assertEquals(DurationFieldType.seconds(), type.getFieldType(5));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43592);assertEquals(DurationFieldType.millis(), type.getFieldType(6));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43593);assertEquals(true, type.equals(type));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43594);assertEquals(true, type.equals(PeriodType.standard().withWeeksRemoved()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43595);assertEquals(false, type.equals(PeriodType.millis()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43596);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43597);assertEquals(true, type.hashCode() == PeriodType.standard().withWeeksRemoved().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43598);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43599);assertEquals("StandardNoWeeks", type.getName());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43600);assertEquals("PeriodType[StandardNoWeeks]", type.toString());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43601);assertEqualsAfterSerialization(type);
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testMaskDays() throws Exception {__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceStart(getClass().getName(),43602);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hsg5s4xn6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xaqxaqlc8azw4g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskDays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43602,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hsg5s4xn6() throws Exception{try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43602);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43603);PeriodType type = PeriodType.standard().withDaysRemoved();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43604);assertEquals(7, type.size());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43605);assertEquals(DurationFieldType.years(), type.getFieldType(0));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43606);assertEquals(DurationFieldType.months(), type.getFieldType(1));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43607);assertEquals(DurationFieldType.weeks(), type.getFieldType(2));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43608);assertEquals(DurationFieldType.hours(), type.getFieldType(3));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43609);assertEquals(DurationFieldType.minutes(), type.getFieldType(4));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43610);assertEquals(DurationFieldType.seconds(), type.getFieldType(5));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43611);assertEquals(DurationFieldType.millis(), type.getFieldType(6));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43612);assertEquals(true, type.equals(type));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43613);assertEquals(true, type.equals(PeriodType.standard().withDaysRemoved()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43614);assertEquals(false, type.equals(PeriodType.millis()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43615);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43616);assertEquals(true, type.hashCode() == PeriodType.standard().withDaysRemoved().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43617);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43618);assertEquals("StandardNoDays", type.getName());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43619);assertEquals("PeriodType[StandardNoDays]", type.toString());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43620);assertEqualsAfterSerialization(type);
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testMaskHours() throws Exception {__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceStart(getClass().getName(),43621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1462dagxnp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xaqxaqlc8azw4g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskHours",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43621,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1462dagxnp() throws Exception{try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43621);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43622);PeriodType type = PeriodType.standard().withHoursRemoved();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43623);assertEquals(7, type.size());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43624);assertEquals(DurationFieldType.years(), type.getFieldType(0));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43625);assertEquals(DurationFieldType.months(), type.getFieldType(1));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43626);assertEquals(DurationFieldType.weeks(), type.getFieldType(2));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43627);assertEquals(DurationFieldType.days(), type.getFieldType(3));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43628);assertEquals(DurationFieldType.minutes(), type.getFieldType(4));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43629);assertEquals(DurationFieldType.seconds(), type.getFieldType(5));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43630);assertEquals(DurationFieldType.millis(), type.getFieldType(6));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43631);assertEquals(true, type.equals(type));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43632);assertEquals(true, type.equals(PeriodType.standard().withHoursRemoved()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43633);assertEquals(false, type.equals(PeriodType.millis()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43634);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43635);assertEquals(true, type.hashCode() == PeriodType.standard().withHoursRemoved().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43636);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43637);assertEquals("StandardNoHours", type.getName());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43638);assertEquals("PeriodType[StandardNoHours]", type.toString());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43639);assertEqualsAfterSerialization(type);
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testMaskMinutes() throws Exception {__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceStart(getClass().getName(),43640);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1haiirsxo8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xaqxaqlc8azw4g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskMinutes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43640,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1haiirsxo8() throws Exception{try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43640);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43641);PeriodType type = PeriodType.standard().withMinutesRemoved();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43642);assertEquals(7, type.size());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43643);assertEquals(DurationFieldType.years(), type.getFieldType(0));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43644);assertEquals(DurationFieldType.months(), type.getFieldType(1));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43645);assertEquals(DurationFieldType.weeks(), type.getFieldType(2));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43646);assertEquals(DurationFieldType.days(), type.getFieldType(3));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43647);assertEquals(DurationFieldType.hours(), type.getFieldType(4));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43648);assertEquals(DurationFieldType.seconds(), type.getFieldType(5));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43649);assertEquals(DurationFieldType.millis(), type.getFieldType(6));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43650);assertEquals(true, type.equals(type));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43651);assertEquals(true, type.equals(PeriodType.standard().withMinutesRemoved()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43652);assertEquals(false, type.equals(PeriodType.millis()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43653);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43654);assertEquals(true, type.hashCode() == PeriodType.standard().withMinutesRemoved().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43655);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43656);assertEquals("StandardNoMinutes", type.getName());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43657);assertEquals("PeriodType[StandardNoMinutes]", type.toString());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43658);assertEqualsAfterSerialization(type);
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testMaskSeconds() throws Exception {__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceStart(getClass().getName(),43659);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1toon54xor();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xaqxaqlc8azw4g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskSeconds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43659,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1toon54xor() throws Exception{try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43659);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43660);PeriodType type = PeriodType.standard().withSecondsRemoved();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43661);assertEquals(7, type.size());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43662);assertEquals(DurationFieldType.years(), type.getFieldType(0));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43663);assertEquals(DurationFieldType.months(), type.getFieldType(1));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43664);assertEquals(DurationFieldType.weeks(), type.getFieldType(2));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43665);assertEquals(DurationFieldType.days(), type.getFieldType(3));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43666);assertEquals(DurationFieldType.hours(), type.getFieldType(4));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43667);assertEquals(DurationFieldType.minutes(), type.getFieldType(5));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43668);assertEquals(DurationFieldType.millis(), type.getFieldType(6));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43669);assertEquals(true, type.equals(type));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43670);assertEquals(true, type.equals(PeriodType.standard().withSecondsRemoved()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43671);assertEquals(false, type.equals(PeriodType.millis()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43672);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43673);assertEquals(true, type.hashCode() == PeriodType.standard().withSecondsRemoved().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43674);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43675);assertEquals("StandardNoSeconds", type.getName());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43676);assertEquals("PeriodType[StandardNoSeconds]", type.toString());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43677);assertEqualsAfterSerialization(type);
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testMaskMillis() throws Exception {__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceStart(getClass().getName(),43678);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mwheidxpa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xaqxaqlc8azw4g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43678,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mwheidxpa() throws Exception{try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43678);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43679);PeriodType type = PeriodType.standard().withMillisRemoved();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43680);assertEquals(7, type.size());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43681);assertEquals(DurationFieldType.years(), type.getFieldType(0));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43682);assertEquals(DurationFieldType.months(), type.getFieldType(1));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43683);assertEquals(DurationFieldType.weeks(), type.getFieldType(2));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43684);assertEquals(DurationFieldType.days(), type.getFieldType(3));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43685);assertEquals(DurationFieldType.hours(), type.getFieldType(4));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43686);assertEquals(DurationFieldType.minutes(), type.getFieldType(5));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43687);assertEquals(DurationFieldType.seconds(), type.getFieldType(6));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43688);assertEquals(true, type.equals(type));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43689);assertEquals(true, type.equals(PeriodType.standard().withMillisRemoved()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43690);assertEquals(false, type.equals(PeriodType.millis()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43691);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43692);assertEquals(true, type.hashCode() == PeriodType.standard().withMillisRemoved().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43693);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43694);assertEquals("StandardNoMillis", type.getName());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43695);assertEquals("PeriodType[StandardNoMillis]", type.toString());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43696);assertEqualsAfterSerialization(type);
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testMaskHoursMinutesSeconds() throws Exception {__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceStart(getClass().getName(),43697);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eb094oxpt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xaqxaqlc8azw4g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskHoursMinutesSeconds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43697,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eb094oxpt() throws Exception{try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43697);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43698);PeriodType type = PeriodType.standard().withHoursRemoved().withMinutesRemoved().withSecondsRemoved();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43699);assertEquals(5, type.size());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43700);assertEquals(DurationFieldType.years(), type.getFieldType(0));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43701);assertEquals(DurationFieldType.months(), type.getFieldType(1));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43702);assertEquals(DurationFieldType.weeks(), type.getFieldType(2));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43703);assertEquals(DurationFieldType.days(), type.getFieldType(3));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43704);assertEquals(DurationFieldType.millis(), type.getFieldType(4));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43705);assertEquals(true, type.equals(type));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43706);assertEquals(true, type.equals(PeriodType.standard().withHoursRemoved().withMinutesRemoved().withSecondsRemoved()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43707);assertEquals(false, type.equals(PeriodType.millis()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43708);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43709);assertEquals(true, type.hashCode() == PeriodType.standard().withHoursRemoved().withMinutesRemoved().withSecondsRemoved().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43710);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43711);assertEquals("StandardNoHoursNoMinutesNoSeconds", type.getName());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43712);assertEquals("PeriodType[StandardNoHoursNoMinutesNoSeconds]", type.toString());
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43713);assertEqualsAfterSerialization(type);
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testMaskTwice1() throws Exception {__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceStart(getClass().getName(),43714);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h3hlm6xqa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xaqxaqlc8azw4g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskTwice1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43714,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h3hlm6xqa() throws Exception{try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43714);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43715);PeriodType type = PeriodType.standard().withYearsRemoved();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43716);PeriodType type2 = type.withYearsRemoved();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43717);assertEquals(true, type == type2);
        
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43718);type = PeriodType.standard().withMonthsRemoved();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43719);type2 = type.withMonthsRemoved();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43720);assertEquals(true, type == type2);
        
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43721);type = PeriodType.standard().withWeeksRemoved();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43722);type2 = type.withWeeksRemoved();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43723);assertEquals(true, type == type2);
        
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43724);type = PeriodType.standard().withDaysRemoved();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43725);type2 = type.withDaysRemoved();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43726);assertEquals(true, type == type2);
        
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43727);type = PeriodType.standard().withHoursRemoved();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43728);type2 = type.withHoursRemoved();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43729);assertEquals(true, type == type2);
        
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43730);type = PeriodType.standard().withMinutesRemoved();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43731);type2 = type.withMinutesRemoved();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43732);assertEquals(true, type == type2);
        
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43733);type = PeriodType.standard().withSecondsRemoved();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43734);type2 = type.withSecondsRemoved();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43735);assertEquals(true, type == type2);
        
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43736);type = PeriodType.standard().withMillisRemoved();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43737);type2 = type.withMillisRemoved();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43738);assertEquals(true, type == type2);
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testMaskTwice2() throws Exception {__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceStart(getClass().getName(),43739);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kchkenxqz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xaqxaqlc8azw4g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskTwice2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43739,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kchkenxqz() throws Exception{try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43739);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43740);PeriodType type = PeriodType.dayTime();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43741);PeriodType type2 = type.withYearsRemoved();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43742);assertEquals(true, type == type2);
        
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43743);type = PeriodType.dayTime();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43744);type2 = type.withMonthsRemoved();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43745);assertEquals(true, type == type2);
        
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43746);type = PeriodType.dayTime();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43747);type2 = type.withWeeksRemoved();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43748);assertEquals(true, type == type2);
        
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43749);type = PeriodType.millis();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43750);type2 = type.withDaysRemoved();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43751);assertEquals(true, type == type2);
        
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43752);type = PeriodType.millis();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43753);type2 = type.withHoursRemoved();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43754);assertEquals(true, type == type2);
        
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43755);type = PeriodType.millis();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43756);type2 = type.withMinutesRemoved();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43757);assertEquals(true, type == type2);
        
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43758);type = PeriodType.millis();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43759);type2 = type.withSecondsRemoved();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43760);assertEquals(true, type == type2);
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testEquals() throws Exception {__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceStart(getClass().getName(),43761);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4e608xrl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xaqxaqlc8azw4g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43761,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4e608xrl() throws Exception{try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43761);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43762);PeriodType type = PeriodType.dayTime().withMillisRemoved();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43763);assertEquals(true, type.equals(type));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43764);assertEquals(true, type.equals(PeriodType.dayTime().withMillisRemoved()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43765);assertEquals(false, type.equals(null));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43766);assertEquals(false, type.equals(""));
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    public void testHashCode() throws Exception {__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceStart(getClass().getName(),43767);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13zkhv8xrr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xaqxaqlc8azw4g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43767,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13zkhv8xrr() throws Exception{try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43767);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43768);PeriodType type = PeriodType.dayTime().withMillisRemoved();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43769);assertEquals(type.hashCode(), type.hashCode());
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testIsSupported() throws Exception {__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceStart(getClass().getName(),43770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hma24nxru();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xaqxaqlc8azw4g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testIsSupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43770,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hma24nxru() throws Exception{try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43770);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43771);PeriodType type = PeriodType.dayTime().withMillisRemoved();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43772);assertEquals(false, type.isSupported(DurationFieldType.years()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43773);assertEquals(false, type.isSupported(DurationFieldType.months()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43774);assertEquals(false, type.isSupported(DurationFieldType.weeks()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43775);assertEquals(true, type.isSupported(DurationFieldType.days()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43776);assertEquals(true, type.isSupported(DurationFieldType.hours()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43777);assertEquals(true, type.isSupported(DurationFieldType.minutes()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43778);assertEquals(true, type.isSupported(DurationFieldType.seconds()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43779);assertEquals(false, type.isSupported(DurationFieldType.millis()));
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testIndexOf() throws Exception {__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceStart(getClass().getName(),43780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1656tvixs4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1xaqxaqlc8azw4g.R.rethrow($CLV_t2$);}finally{__CLR4_4_1xaqxaqlc8azw4g.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testIndexOf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43780,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1656tvixs4() throws Exception{try{__CLR4_4_1xaqxaqlc8azw4g.R.inc(43780);
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43781);PeriodType type = PeriodType.dayTime().withMillisRemoved();
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43782);assertEquals(-1, type.indexOf(DurationFieldType.years()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43783);assertEquals(-1, type.indexOf(DurationFieldType.months()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43784);assertEquals(-1, type.indexOf(DurationFieldType.weeks()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43785);assertEquals(0, type.indexOf(DurationFieldType.days()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43786);assertEquals(1, type.indexOf(DurationFieldType.hours()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43787);assertEquals(2, type.indexOf(DurationFieldType.minutes()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43788);assertEquals(3, type.indexOf(DurationFieldType.seconds()));
        __CLR4_4_1xaqxaqlc8azw4g.R.inc(43789);assertEquals(-1, type.indexOf(DurationFieldType.millis()));
    }finally{__CLR4_4_1xaqxaqlc8azw4g.R.flushNeeded();}}

}
