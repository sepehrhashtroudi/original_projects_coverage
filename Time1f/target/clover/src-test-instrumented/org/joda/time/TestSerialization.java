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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.field.UnsupportedDurationField;

/**
 * This class is a Junit unit test for serialization.
 *
 * @author Stephen Colebourne
 */
public class TestSerialization extends TestCase {static class __CLR4_4_1zhtzhtlc8azw7s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,46155,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    
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

//    private static class MockDelegatedDurationField extends DelegatedDurationField implements Serializable {
//        private static final long serialVersionUID = 1878496002811998493L;        
//        public MockDelegatedDurationField() {
//            super(MillisDurationField.INSTANCE);
//        }
//    }

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1zhtzhtlc8azw7s.R.inc(46001);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46002);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1zhtzhtlc8azw7s.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1zhtzhtlc8azw7s.R.inc(46003);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46004);return new TestSuite(TestSerialization.class);
    }finally{__CLR4_4_1zhtzhtlc8azw7s.R.flushNeeded();}}

    public TestSerialization(String name) {
        super(name);__CLR4_4_1zhtzhtlc8azw7s.R.inc(46006);try{__CLR4_4_1zhtzhtlc8azw7s.R.inc(46005);
    }finally{__CLR4_4_1zhtzhtlc8azw7s.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1zhtzhtlc8azw7s.R.inc(46007);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46008);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46009);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46010);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46011);originalLocale = Locale.getDefault();
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46012);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46013);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46014);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1zhtzhtlc8azw7s.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1zhtzhtlc8azw7s.R.inc(46015);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46016);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46017);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46018);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46019);Locale.setDefault(originalLocale);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46020);originalDateTimeZone = null;
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46021);originalTimeZone = null;
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46022);originalLocale = null;
    }finally{__CLR4_4_1zhtzhtlc8azw7s.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testTest() {__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceStart(getClass().getName(),46023);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqjzif();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhtzhtlc8azw7s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46023,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqjzif(){try{__CLR4_4_1zhtzhtlc8azw7s.R.inc(46023);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46024);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46025);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46026);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }finally{__CLR4_4_1zhtzhtlc8azw7s.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSerializedInstant() throws Exception {__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceStart(getClass().getName(),46027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rzeqj2zij();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhtzhtlc8azw7s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedInstant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46027,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rzeqj2zij() throws Exception{try{__CLR4_4_1zhtzhtlc8azw7s.R.inc(46027);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46028);Instant test = new Instant();
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46029);loadAndCompare(test, "Instant", false);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46030);inlineCompare(test, false);
    }finally{__CLR4_4_1zhtzhtlc8azw7s.R.flushNeeded();}}

    public void testSerializedDateTime() throws Exception {__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceStart(getClass().getName(),46031);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_124l36wzin();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhtzhtlc8azw7s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46031,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_124l36wzin() throws Exception{try{__CLR4_4_1zhtzhtlc8azw7s.R.inc(46031);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46032);DateTime test = new DateTime();
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46033);loadAndCompare(test, "DateTime", false);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46034);inlineCompare(test, false);
    }finally{__CLR4_4_1zhtzhtlc8azw7s.R.flushNeeded();}}

    public void testSerializedDateTimeProperty() throws Exception {__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceStart(getClass().getName(),46035);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b1iyulzir();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhtzhtlc8azw7s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedDateTimeProperty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46035,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b1iyulzir() throws Exception{try{__CLR4_4_1zhtzhtlc8azw7s.R.inc(46035);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46036);DateTime.Property test = new DateTime().hourOfDay();
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46037);loadAndCompare(test, "DateTimeProperty", false);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46038);inlineCompare(test, false);
    }finally{__CLR4_4_1zhtzhtlc8azw7s.R.flushNeeded();}}

    public void testSerializedMutableDateTime() throws Exception {__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceStart(getClass().getName(),46039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ogpxyqziv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhtzhtlc8azw7s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedMutableDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46039,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ogpxyqziv() throws Exception{try{__CLR4_4_1zhtzhtlc8azw7s.R.inc(46039);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46040);MutableDateTime test = new MutableDateTime();
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46041);loadAndCompare(test, "MutableDateTime", false);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46042);inlineCompare(test, false);
    }finally{__CLR4_4_1zhtzhtlc8azw7s.R.flushNeeded();}}

    public void testSerializedMutableDateTimeProperty() throws Exception {__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceStart(getClass().getName(),46043);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uk9nk7ziz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhtzhtlc8azw7s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedMutableDateTimeProperty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46043,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uk9nk7ziz() throws Exception{try{__CLR4_4_1zhtzhtlc8azw7s.R.inc(46043);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46044);MutableDateTime.Property test = new MutableDateTime().hourOfDay();
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46045);loadAndCompare(test, "MutableDateTimeProperty", false);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46046);inlineCompare(test, false);
    }finally{__CLR4_4_1zhtzhtlc8azw7s.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    public void testSerializedDateMidnight() throws Exception {__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceStart(getClass().getName(),46047);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yrer0bzj3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhtzhtlc8azw7s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedDateMidnight",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46047,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yrer0bzj3() throws Exception{try{__CLR4_4_1zhtzhtlc8azw7s.R.inc(46047);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46048);DateMidnight test = new DateMidnight();
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46049);loadAndCompare(test, "DateMidnight", false);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46050);inlineCompare(test, false);
    }finally{__CLR4_4_1zhtzhtlc8azw7s.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    public void testSerializedDateMidnightProperty() throws Exception {__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceStart(getClass().getName(),46051);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i2igeozj7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhtzhtlc8azw7s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedDateMidnightProperty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46051,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i2igeozj7() throws Exception{try{__CLR4_4_1zhtzhtlc8azw7s.R.inc(46051);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46052);DateMidnight.Property test = new DateMidnight().monthOfYear();
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46053);loadAndCompare(test, "DateMidnightProperty", false);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46054);inlineCompare(test, false);
    }finally{__CLR4_4_1zhtzhtlc8azw7s.R.flushNeeded();}}

    public void testSerializedLocalDate() throws Exception {__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceStart(getClass().getName(),46055);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gax20mzjb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhtzhtlc8azw7s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedLocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46055,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gax20mzjb() throws Exception{try{__CLR4_4_1zhtzhtlc8azw7s.R.inc(46055);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46056);LocalDate test = new LocalDate();
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46057);loadAndCompare(test, "LocalDate", false);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46058);inlineCompare(test, false);
    }finally{__CLR4_4_1zhtzhtlc8azw7s.R.flushNeeded();}}

    public void testSerializedLocalDateBuddhist() throws Exception {__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceStart(getClass().getName(),46059);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nj2ynzjf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhtzhtlc8azw7s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedLocalDateBuddhist",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46059,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nj2ynzjf() throws Exception{try{__CLR4_4_1zhtzhtlc8azw7s.R.inc(46059);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46060);LocalDate test = new LocalDate(BuddhistChronology.getInstanceUTC());
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46061);loadAndCompare(test, "LocalDateBuddhist", false);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46062);inlineCompare(test, false);
    }finally{__CLR4_4_1zhtzhtlc8azw7s.R.flushNeeded();}}

    public void testSerializedLocalTime() throws Exception {__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceStart(getClass().getName(),46063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lpkhfbzjj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhtzhtlc8azw7s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedLocalTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46063,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lpkhfbzjj() throws Exception{try{__CLR4_4_1zhtzhtlc8azw7s.R.inc(46063);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46064);LocalTime test = new LocalTime();
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46065);loadAndCompare(test, "LocalTime", false);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46066);inlineCompare(test, false);
    }finally{__CLR4_4_1zhtzhtlc8azw7s.R.flushNeeded();}}

    public void testSerializedLocalDateTime() throws Exception {__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceStart(getClass().getName(),46067);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xoos47zjn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhtzhtlc8azw7s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedLocalDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46067,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xoos47zjn() throws Exception{try{__CLR4_4_1zhtzhtlc8azw7s.R.inc(46067);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46068);LocalDateTime test = new LocalDateTime();
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46069);loadAndCompare(test, "LocalDateTime", false);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46070);inlineCompare(test, false);
    }finally{__CLR4_4_1zhtzhtlc8azw7s.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    public void testSerializedYearMonthDay() throws Exception {__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceStart(getClass().getName(),46071);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m5u9hyzjr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhtzhtlc8azw7s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedYearMonthDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46071,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m5u9hyzjr() throws Exception{try{__CLR4_4_1zhtzhtlc8azw7s.R.inc(46071);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46072);YearMonthDay test = new YearMonthDay();
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46073);loadAndCompare(test, "YearMonthDay", false);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46074);inlineCompare(test, false);
    }finally{__CLR4_4_1zhtzhtlc8azw7s.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    public void testSerializedTimeOfDay() throws Exception {__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceStart(getClass().getName(),46075);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13i2andzjv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhtzhtlc8azw7s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedTimeOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46075,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13i2andzjv() throws Exception{try{__CLR4_4_1zhtzhtlc8azw7s.R.inc(46075);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46076);TimeOfDay test = new TimeOfDay();
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46077);loadAndCompare(test, "TimeOfDay", false);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46078);inlineCompare(test, false);
    }finally{__CLR4_4_1zhtzhtlc8azw7s.R.flushNeeded();}}

    public void testSerializedDateTimeZoneUTC() throws Exception {__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceStart(getClass().getName(),46079);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14y8w0ezjz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhtzhtlc8azw7s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedDateTimeZoneUTC",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46079,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14y8w0ezjz() throws Exception{try{__CLR4_4_1zhtzhtlc8azw7s.R.inc(46079);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46080);DateTimeZone test = DateTimeZone.UTC;
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46081);loadAndCompare(test, "DateTimeZoneUTC", true);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46082);inlineCompare(test, true);
    }finally{__CLR4_4_1zhtzhtlc8azw7s.R.flushNeeded();}}

    public void testSerializedDateTimeZone() throws Exception {__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceStart(getClass().getName(),46083);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qp0lgczk3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhtzhtlc8azw7s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46083,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qp0lgczk3() throws Exception{try{__CLR4_4_1zhtzhtlc8azw7s.R.inc(46083);
        // have to re-get the zone, as TestDateTimeZone may have
        // changed the cache, or a SoftReference may have got cleared
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46084);DateTimeZone test = DateTimeZone.forID("Europe/Paris");
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46085);loadAndCompare(test, "DateTimeZone", true);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46086);inlineCompare(test, true);
    }finally{__CLR4_4_1zhtzhtlc8azw7s.R.flushNeeded();}}

    public void testDuration() throws Exception {__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceStart(getClass().getName(),46087);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gv0z03zk7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhtzhtlc8azw7s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testDuration",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46087,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gv0z03zk7() throws Exception{try{__CLR4_4_1zhtzhtlc8azw7s.R.inc(46087);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46088);Duration test = Duration.millis(12345);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46089);loadAndCompare(test, "Duration", false);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46090);inlineCompare(test, false);
    }finally{__CLR4_4_1zhtzhtlc8azw7s.R.flushNeeded();}}

    public void testSerializedCopticChronology() throws Exception {__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceStart(getClass().getName(),46091);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kwap7jzkb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhtzhtlc8azw7s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedCopticChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46091,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kwap7jzkb() throws Exception{try{__CLR4_4_1zhtzhtlc8azw7s.R.inc(46091);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46092);CopticChronology test = CopticChronology.getInstance(LONDON);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46093);loadAndCompare(test, "CopticChronology", true);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46094);inlineCompare(test, true);
    }finally{__CLR4_4_1zhtzhtlc8azw7s.R.flushNeeded();}}

    public void testSerializedISOChronology() throws Exception {__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceStart(getClass().getName(),46095);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_111f826zkf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhtzhtlc8azw7s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedISOChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46095,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_111f826zkf() throws Exception{try{__CLR4_4_1zhtzhtlc8azw7s.R.inc(46095);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46096);ISOChronology test = ISOChronology.getInstance(PARIS);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46097);loadAndCompare(test, "ISOChronology", true);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46098);inlineCompare(test, true);
    }finally{__CLR4_4_1zhtzhtlc8azw7s.R.flushNeeded();}}

    public void testSerializedGJChronology() throws Exception {__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceStart(getClass().getName(),46099);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oq0rnszkj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhtzhtlc8azw7s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedGJChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46099,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oq0rnszkj() throws Exception{try{__CLR4_4_1zhtzhtlc8azw7s.R.inc(46099);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46100);GJChronology test = GJChronology.getInstance(TOKYO);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46101);loadAndCompare(test, "GJChronology", true);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46102);inlineCompare(test, true);
    }finally{__CLR4_4_1zhtzhtlc8azw7s.R.flushNeeded();}}

    public void testSerializedGJChronologyChangedInternals() throws Exception {__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceStart(getClass().getName(),46103);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ask922zkn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhtzhtlc8azw7s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedGJChronologyChangedInternals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46103,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ask922zkn() throws Exception{try{__CLR4_4_1zhtzhtlc8azw7s.R.inc(46103);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46104);GJChronology test = GJChronology.getInstance(PARIS, 123L, 2);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46105);loadAndCompare(test, "GJChronologyChangedInternals", true);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46106);inlineCompare(test, true);
    }finally{__CLR4_4_1zhtzhtlc8azw7s.R.flushNeeded();}}

    public void testSerializedGregorianChronology() throws Exception {__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceStart(getClass().getName(),46107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_180268fzkr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhtzhtlc8azw7s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedGregorianChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46107,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_180268fzkr() throws Exception{try{__CLR4_4_1zhtzhtlc8azw7s.R.inc(46107);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46108);GregorianChronology test = GregorianChronology.getInstance(PARIS);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46109);loadAndCompare(test, "GregorianChronology", true);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46110);inlineCompare(test, true);
    }finally{__CLR4_4_1zhtzhtlc8azw7s.R.flushNeeded();}}

    public void testSerializedJulianChronology() throws Exception {__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceStart(getClass().getName(),46111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1awloyyzkv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhtzhtlc8azw7s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedJulianChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46111,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1awloyyzkv() throws Exception{try{__CLR4_4_1zhtzhtlc8azw7s.R.inc(46111);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46112);JulianChronology test = JulianChronology.getInstance(PARIS);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46113);loadAndCompare(test, "JulianChronology", true);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46114);inlineCompare(test, true);
    }finally{__CLR4_4_1zhtzhtlc8azw7s.R.flushNeeded();}}

    public void testSerializedBuddhistChronology() throws Exception {__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceStart(getClass().getName(),46115);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k2ojoqzkz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhtzhtlc8azw7s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedBuddhistChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46115,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k2ojoqzkz() throws Exception{try{__CLR4_4_1zhtzhtlc8azw7s.R.inc(46115);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46116);BuddhistChronology test = BuddhistChronology.getInstance(PARIS);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46117);loadAndCompare(test, "BuddhistChronology", true);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46118);inlineCompare(test, true);
    }finally{__CLR4_4_1zhtzhtlc8azw7s.R.flushNeeded();}}

    public void testSerializedPeriodType() throws Exception {__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceStart(getClass().getName(),46119);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2n5ygzl3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhtzhtlc8azw7s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedPeriodType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46119,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2n5ygzl3() throws Exception{try{__CLR4_4_1zhtzhtlc8azw7s.R.inc(46119);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46120);PeriodType test = PeriodType.dayTime();
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46121);loadAndCompare(test, "PeriodType", false);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46122);inlineCompare(test, false);
    }finally{__CLR4_4_1zhtzhtlc8azw7s.R.flushNeeded();}}

    public void testSerializedDateTimeFieldType() throws Exception {__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceStart(getClass().getName(),46123);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sjull6zl7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhtzhtlc8azw7s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedDateTimeFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46123,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sjull6zl7() throws Exception{try{__CLR4_4_1zhtzhtlc8azw7s.R.inc(46123);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46124);DateTimeFieldType test = DateTimeFieldType.clockhourOfDay();
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46125);loadAndCompare(test, "DateTimeFieldType", true);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46126);inlineCompare(test, true);
    }finally{__CLR4_4_1zhtzhtlc8azw7s.R.flushNeeded();}}

    public void testSerializedUnsupportedDateTimeField() throws Exception {__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceStart(getClass().getName(),46127);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1llqh3bzlb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zhtzhtlc8azw7s.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zhtzhtlc8azw7s.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedUnsupportedDateTimeField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),46127,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1llqh3bzlb() throws Exception{try{__CLR4_4_1zhtzhtlc8azw7s.R.inc(46127);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46128);UnsupportedDateTimeField test = UnsupportedDateTimeField.getInstance(
                DateTimeFieldType.year(),
                UnsupportedDurationField.getInstance(DurationFieldType.years()));
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46129);loadAndCompare(test, "UnsupportedDateTimeField", true);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46130);inlineCompare(test, true);
    }finally{__CLR4_4_1zhtzhtlc8azw7s.R.flushNeeded();}}

    private void loadAndCompare(Serializable test, String filename, boolean same) throws Exception {try{__CLR4_4_1zhtzhtlc8azw7s.R.inc(46131);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46132);FileInputStream fis = new FileInputStream("src/test/resources/" + filename + ".dat");
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46133);ObjectInputStream ois = new ObjectInputStream(fis);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46134);Object obj = ois.readObject();
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46135);ois.close();
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46136);if ((((same)&&(__CLR4_4_1zhtzhtlc8azw7s.R.iget(46137)!=0|true))||(__CLR4_4_1zhtzhtlc8azw7s.R.iget(46138)==0&false))) {{
            __CLR4_4_1zhtzhtlc8azw7s.R.inc(46139);assertSame(test, obj);
        } }else {{
            __CLR4_4_1zhtzhtlc8azw7s.R.inc(46140);assertEquals(test, obj);
        }
//        try {
//            fis = new FileInputStream("src/test/resources/" + filename + "2.dat");
//            ois = new ObjectInputStream(fis);
//            obj = ois.readObject();
//            ois.close();
//            if (same) {
//                assertSame(test, obj);
//            } else {
//                assertEquals(test, obj);
//            }
//        } catch (FileNotFoundException ex) {
//            // ignore
//        }
    }}finally{__CLR4_4_1zhtzhtlc8azw7s.R.flushNeeded();}}

    public void inlineCompare(Serializable test, boolean same) throws Exception {try{__CLR4_4_1zhtzhtlc8azw7s.R.inc(46141);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46142);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46143);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46144);oos.writeObject(test);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46145);oos.close();
        
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46146);ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46147);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46148);Object obj = ois.readObject();
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46149);ois.close();
        
        __CLR4_4_1zhtzhtlc8azw7s.R.inc(46150);if ((((same)&&(__CLR4_4_1zhtzhtlc8azw7s.R.iget(46151)!=0|true))||(__CLR4_4_1zhtzhtlc8azw7s.R.iget(46152)==0&false))) {{
            __CLR4_4_1zhtzhtlc8azw7s.R.inc(46153);assertSame(test, obj);
        } }else {{
            __CLR4_4_1zhtzhtlc8azw7s.R.inc(46154);assertEquals(test, obj);
        }
    }}finally{__CLR4_4_1zhtzhtlc8azw7s.R.flushNeeded();}}

//    //-----------------------------------------------------------------------
//    public void testStoreSerializedInstant() throws Exception {
//        Instant test = new Instant();
//        store(test, "Instant.dat");
//    }
//
//    public void testStoreSerializedDateTime() throws Exception {
//        DateTime test = new DateTime();
//        store(test, "DateTime.dat");
//    }
//
//    public void testStoreSerializedMutableDateTime() throws Exception {
//        MutableDateTime test = new MutableDateTime();
//        store(test, "MutableDateTime.dat");
//    }
//
//    public void testStoreSerializedDateMidnight() throws Exception {
//        DateMidnight test = new DateMidnight();
//        store(test, "DateMidnight.dat");
//    }
//
//    public void testStoreSerializedLocalDate() throws Exception {
//        LocalDate test = new LocalDate();
//        store(test, "LocalDate.dat");
//    }
//
//    public void testStoreSerializedLocalDateBuddhist() throws Exception {
//        LocalDate test = new LocalDate(BuddhistChronology.getInstanceUTC());
//        store(test, "LocalDateBuddhist.dat");
//    }
//
//    public void testStoreSerializedLocalTime() throws Exception {
//        LocalTime test = new LocalTime();
//        store(test, "LocalTime.dat");
//    }
//
//    public void testStoreSerializedLocalDateTime() throws Exception {
//        LocalDateTime test = new LocalDateTime();
//        store(test, "LocalDateTime.dat");
//    }
//
//    public void testStoreSerializedYearMonthDay() throws Exception {
//        YearMonthDay test = new YearMonthDay();
//        store(test, "YearMonthDay.dat");
//    }
//
//    public void testStoreSerializedYearMonthDayProperty() throws Exception {
//        YearMonthDay.Property test = new YearMonthDay().monthOfYear();
//        store(test, "YearMonthDayProperty.dat");
//    }
//
//    public void testStoreSerializedTimeOfDay() throws Exception {
//        TimeOfDay test = new TimeOfDay();
//        store(test, "TimeOfDay.dat");
//    }
//
//    public void testStoreSerializedTimeOfDayProperty() throws Exception {
//        TimeOfDay.Property test = new TimeOfDay().hourOfDay();
//        store(test, "TimeOfDayProperty.dat");
//    }
//
//    public void testStoreSerializedDateTimeZoneUTC() throws Exception {
//        DateTimeZone test = DateTimeZone.UTC;
//        store(test, "DateTimeZoneUTC.dat");
//    }
//
//    public void testStoreSerializedDateTimeZone() throws Exception {
//        DateTimeZone test = PARIS;
//        store(test, "DateTimeZone.dat");
//    }
//
//    public void testStoreSerializedCopticChronology() throws Exception {
//        CopticChronology test = CopticChronology.getInstance(LONDON);
//        store(test, "CopticChronology.dat");
//    }
//
//    public void testStoreSerializedISOChronology() throws Exception {
//        ISOChronology test = ISOChronology.getInstance(PARIS);
//        store(test, "ISOChronology.dat");
//    }
//
//    public void testStoreSerializedGJChronology() throws Exception {
//        GJChronology test = GJChronology.getInstance(TOKYO);
//        store(test, "GJChronology.dat");
//    }
//
//    // Format changed in v1.2 - min days in first week not deserialized in v1.0/1.1
//    public void testStoreSerializedGJChronologyChangedInternals() throws Exception {
//        GJChronology test = GJChronology.getInstance(PARIS, 123L, 2);
//        store(test, "GJChronologyChangedInternals.dat");
//    }
//
//    public void testStoreSerializedGregorianChronology() throws Exception {
//        GregorianChronology test = GregorianChronology.getInstance(PARIS);
//        store(test, "GregorianChronology.dat");
//    }
//
//    public void testStoreSerializedJulianChronology() throws Exception {
//        JulianChronology test = JulianChronology.getInstance(PARIS);
//        store(test, "JulianChronology.dat");
//    }
//
//    public void testStoreSerializedBuddhistChronology() throws Exception {
//        BuddhistChronology test = BuddhistChronology.getInstance(PARIS);
//        store(test, "BuddhistChronology.dat");
//    }
//
//    public void testStoreSerializedPeriodType() throws Exception {
//        PeriodType test = PeriodType.dayTime();
//        store(test, "PeriodType.dat");
//    }
//
//    public void testStoreSerializedDateTimeFieldType() throws Exception {
//        DateTimeFieldType test = DateTimeFieldType.clockhourOfDay();
//        store(test, "DateTimeFieldType.dat");
//    }
//
//    public void testStoreSerializedUnsupportedDateTimeField() throws Exception {
//        UnsupportedDateTimeField test = UnsupportedDateTimeField.getInstance(
//                DateTimeFieldType.year(),
//                UnsupportedDurationField.getInstance(DurationFieldType.years()));
//        store(test, "UnsupportedDateTimeField.dat");
//    }
//
//    public void testStoreSerializedDurationFieldType() throws Exception {
//        DurationFieldType test = DurationFieldType.MINUTES_TYPE;
//        store(test, "DurationFieldType.dat");
//    }
//
//    public void testStoreSerializedMillisDurationField() throws Exception {
//        MillisDurationField test = (MillisDurationField) MillisDurationField.INSTANCE;
//        store(test, "MillisDurationField.dat");
//    }
//
//    public void testStoreSerializedDelegatedDurationField() throws Exception {
//        DelegatedDurationField test = new MockDelegatedDurationField();
//        store(test, "DelegatedDurationField.dat");
//    }
//
//    public void testStoreSerializedUnsupportedDurationField() throws Exception {
//        UnsupportedDurationField test = UnsupportedDurationField.getInstance(DurationFieldType.eras());
//        store(test, "UnsupportedDurationField.dat");
//    }
//
    // format changed (properly defined) in v1.1
//    public void testStoreSerializedDateTimeProperty() throws Exception {
//        DateTime.Property test = new DateTime().hourOfDay();
//        store(test, "DateTimeProperty.dat");
//    }
//
//    public void testStoreSerializedMutableDateTimeProperty() throws Exception {
//        MutableDateTime.Property test = new MutableDateTime().hourOfDay();
//        store(test, "MutableDateTimeProperty.dat");
//    }
//
//    public void testStoreSerializedDateMidnightProperty() throws Exception {
//        DateMidnight.Property test = new DateMidnight().monthOfYear();
//        store(test, "DateMidnightProperty.dat");
//    }
//
//    public void testStoreSerializedDateMidnightProperty() throws Exception {
//        Duration test = Duration.millis(12345);
//        store(test, "Duration.dat");
//    }

//    private void store(Serializable test, String filename) throws Exception {
//        FileOutputStream fos = new FileOutputStream("src/test/resources/" + filename);
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        try {
//            oos.writeObject(test);
//        } finally {
//            oos.close();
//        }
//        oos.close();
//    }

}
