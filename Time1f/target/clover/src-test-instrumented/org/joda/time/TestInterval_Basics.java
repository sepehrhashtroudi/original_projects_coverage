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
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.LenientChronology;

/**
 * This class is a Junit unit test for Instant.
 *
 * @author Stephen Colebourne
 */
public class TestInterval_Basics extends TestCase {static class __CLR4_4_1n3tn3tlc8azuy6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,30804,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone MOSCOW = DateTimeZone.forID("Europe/Moscow");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private Interval interval37;
    private Interval interval33;

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

    public static void main(String[] args) {try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(29945);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(29946);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(29947);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(29948);return new TestSuite(TestInterval_Basics.class);
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public TestInterval_Basics(String name) {
        super(name);__CLR4_4_1n3tn3tlc8azuy6.R.inc(29950);try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(29949);
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(29951);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(29952);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(29953);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(29954);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(29955);originalLocale = Locale.getDefault();
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(29956);DateTimeZone.setDefault(PARIS);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(29957);TimeZone.setDefault(PARIS.toTimeZone());
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(29958);Locale.setDefault(Locale.FRANCE);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(29959);interval37 = new Interval(3, 7);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(29960);interval33 = new Interval(3, 3);
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(29961);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(29962);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(29963);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(29964);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(29965);Locale.setDefault(originalLocale);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(29966);originalDateTimeZone = null;
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(29967);originalTimeZone = null;
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(29968);originalLocale = null;
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testTest() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),29969);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqjn4h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29969,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqjn4h(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(29969);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(29970);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(29971);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(29972);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetMillis() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),29973);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18msyj5n4l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testGetMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29973,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18msyj5n4l(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(29973);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(29974);Interval test = new Interval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(29975);assertEquals(TEST_TIME1, test.getStartMillis());
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(29976);assertEquals(TEST_TIME1, test.getStart().getMillis());
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(29977);assertEquals(TEST_TIME2, test.getEndMillis());
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(29978);assertEquals(TEST_TIME2, test.getEnd().getMillis());
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(29979);assertEquals(TEST_TIME2 - TEST_TIME1, test.toDurationMillis());
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(29980);assertEquals(TEST_TIME2 - TEST_TIME1, test.toDuration().getMillis());
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testGetDuration1() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),29981);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m16ym8n4t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testGetDuration1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29981,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m16ym8n4t(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(29981);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(29982);Interval test = new Interval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(29983);assertEquals(TEST_TIME2 - TEST_TIME1, test.toDurationMillis());
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(29984);assertEquals(TEST_TIME2 - TEST_TIME1, test.toDuration().getMillis());
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testGetDuration2() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),29985);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1is6ztrn4x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testGetDuration2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29985,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1is6ztrn4x(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(29985);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(29986);Interval test = new Interval(TEST_TIME1, TEST_TIME1);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(29987);assertSame(Duration.ZERO, test.toDuration());
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testEqualsHashCode() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),29988);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5in77n50();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testEqualsHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),29988,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5in77n50(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(29988);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(29989);Interval test1 = new Interval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(29990);Interval test2 = new Interval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(29991);assertEquals(true, test1.equals(test2));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(29992);assertEquals(true, test2.equals(test1));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(29993);assertEquals(true, test1.equals(test1));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(29994);assertEquals(true, test2.equals(test2));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(29995);assertEquals(true, test1.hashCode() == test2.hashCode());
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(29996);assertEquals(true, test1.hashCode() == test1.hashCode());
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(29997);assertEquals(true, test2.hashCode() == test2.hashCode());
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(29998);Interval test3 = new Interval(TEST_TIME_NOW, TEST_TIME2);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(29999);assertEquals(false, test1.equals(test3));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30000);assertEquals(false, test2.equals(test3));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30001);assertEquals(false, test3.equals(test1));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30002);assertEquals(false, test3.equals(test2));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30003);assertEquals(false, test1.hashCode() == test3.hashCode());
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30004);assertEquals(false, test2.hashCode() == test3.hashCode());
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30005);Interval test4 = new Interval(TEST_TIME1, TEST_TIME2, GJChronology.getInstance());
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30006);assertEquals(true, test4.equals(test4));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30007);assertEquals(false, test1.equals(test4));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30008);assertEquals(false, test2.equals(test4));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30009);assertEquals(false, test4.equals(test1));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30010);assertEquals(false, test4.equals(test2));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30011);assertEquals(false, test1.hashCode() == test4.hashCode());
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30012);assertEquals(false, test2.hashCode() == test4.hashCode());
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30013);MutableInterval test5 = new MutableInterval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30014);assertEquals(true, test1.equals(test5));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30015);assertEquals(true, test2.equals(test5));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30016);assertEquals(false, test3.equals(test5));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30017);assertEquals(true, test5.equals(test1));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30018);assertEquals(true, test5.equals(test2));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30019);assertEquals(false, test5.equals(test3));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30020);assertEquals(true, test1.hashCode() == test5.hashCode());
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30021);assertEquals(true, test2.hashCode() == test5.hashCode());
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30022);assertEquals(false, test3.hashCode() == test5.hashCode());
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30023);assertEquals(false, test1.equals("Hello"));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30024);assertEquals(true, test1.equals(new MockInterval()));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30025);assertEquals(false, test1.equals(new DateTime(TEST_TIME1)));
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    class MockInterval extends AbstractInterval {
        public MockInterval() {
            super();__CLR4_4_1n3tn3tlc8azuy6.R.inc(30027);try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30026);
        }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}
        public Chronology getChronology() {try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30028);
            __CLR4_4_1n3tn3tlc8azuy6.R.inc(30029);return ISOChronology.getInstance();
        }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}
        public long getStartMillis() {try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30030);
            __CLR4_4_1n3tn3tlc8azuy6.R.inc(30031);return TEST_TIME1;
        }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}
        public long getEndMillis() {try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30032);
            __CLR4_4_1n3tn3tlc8azuy6.R.inc(30033);return TEST_TIME2;
        }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}
    }

    public void testEqualsHashCodeLenient() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17zr7n2n6a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testEqualsHashCodeLenient",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30034,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17zr7n2n6a(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30034);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30035);Interval test1 = new Interval(
                new DateTime(TEST_TIME1, LenientChronology.getInstance(COPTIC_PARIS)),
                new DateTime(TEST_TIME2, LenientChronology.getInstance(COPTIC_PARIS)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30036);Interval test2 = new Interval(
                new DateTime(TEST_TIME1, LenientChronology.getInstance(COPTIC_PARIS)),
                new DateTime(TEST_TIME2, LenientChronology.getInstance(COPTIC_PARIS)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30037);assertEquals(true, test1.equals(test2));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30038);assertEquals(true, test2.equals(test1));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30039);assertEquals(true, test1.equals(test1));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30040);assertEquals(true, test2.equals(test2));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30041);assertEquals(true, test1.hashCode() == test2.hashCode());
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30042);assertEquals(true, test1.hashCode() == test1.hashCode());
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30043);assertEquals(true, test2.hashCode() == test2.hashCode());
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testEqualsHashCodeStrict() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30044);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b60798n6k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testEqualsHashCodeStrict",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30044,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b60798n6k(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30044);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30045);Interval test1 = new Interval(
                new DateTime(TEST_TIME1, LenientChronology.getInstance(COPTIC_PARIS)),
                new DateTime(TEST_TIME2, LenientChronology.getInstance(COPTIC_PARIS)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30046);Interval test2 = new Interval(
                new DateTime(TEST_TIME1, LenientChronology.getInstance(COPTIC_PARIS)),
                new DateTime(TEST_TIME2, LenientChronology.getInstance(COPTIC_PARIS)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30047);assertEquals(true, test1.equals(test2));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30048);assertEquals(true, test2.equals(test1));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30049);assertEquals(true, test1.equals(test1));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30050);assertEquals(true, test2.equals(test2));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30051);assertEquals(true, test1.hashCode() == test2.hashCode());
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30052);assertEquals(true, test1.hashCode() == test1.hashCode());
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30053);assertEquals(true, test2.hashCode() == test2.hashCode());
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_useCase_ContainsOverlapAbutGap() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30054);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t5uoran6u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.test_useCase_ContainsOverlapAbutGap",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30054,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t5uoran6u(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30054);
        // this is a simple test to ensure that the use case of these methods is OK
        // when comparing any two intervals they can be in one and only one of these states
        // (a) have a gap between them, (b) abut or (c) overlap
        // contains is a subset of overlap
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30055);Interval test1020 = new Interval(10, 20);
        
        // [4,8) [10,20) - gap
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30056);Interval interval = new Interval(4, 8);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30057);assertNotNull(test1020.gap(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30058);assertEquals(false, test1020.abuts(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30059);assertEquals(false, test1020.overlaps(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30060);assertEquals(false, test1020.contains(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30061);assertNotNull(interval.gap(test1020));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30062);assertEquals(false, interval.abuts(test1020));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30063);assertEquals(false, interval.overlaps(test1020));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30064);assertEquals(false, interval.contains(test1020));
        
        // [6,10) [10,20) - abuts
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30065);interval = new Interval(6, 10);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30066);assertNull(test1020.gap(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30067);assertEquals(true, test1020.abuts(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30068);assertEquals(false, test1020.overlaps(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30069);assertEquals(false, test1020.contains(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30070);assertNull(interval.gap(test1020));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30071);assertEquals(true, interval.abuts(test1020));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30072);assertEquals(false, interval.overlaps(test1020));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30073);assertEquals(false, interval.contains(test1020));
        
        // [8,12) [10,20) - overlaps
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30074);interval = new Interval(8, 12);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30075);assertNull(test1020.gap(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30076);assertEquals(false, test1020.abuts(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30077);assertEquals(true, test1020.overlaps(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30078);assertEquals(false, test1020.contains(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30079);assertNull(interval.gap(test1020));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30080);assertEquals(false, interval.abuts(test1020));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30081);assertEquals(true, interval.overlaps(test1020));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30082);assertEquals(false, interval.contains(test1020));
        
        // [10,14) [10,20) - overlaps and contains-one-way
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30083);interval = new Interval(10, 14);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30084);assertNull(test1020.gap(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30085);assertEquals(false, test1020.abuts(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30086);assertEquals(true, test1020.overlaps(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30087);assertEquals(true, test1020.contains(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30088);assertNull(interval.gap(test1020));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30089);assertEquals(false, interval.abuts(test1020));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30090);assertEquals(true, interval.overlaps(test1020));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30091);assertEquals(false, interval.contains(test1020));
        
        // [10,20) [10,20) - overlaps and contains-both-ways
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30092);assertNull(test1020.gap(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30093);assertEquals(false, test1020.abuts(test1020));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30094);assertEquals(true, test1020.overlaps(test1020));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30095);assertEquals(true, test1020.contains(test1020));
        
        // [10,20) [16,20) - overlaps and contains-one-way
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30096);interval = new Interval(16, 20);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30097);assertNull(test1020.gap(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30098);assertEquals(false, test1020.abuts(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30099);assertEquals(true, test1020.overlaps(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30100);assertEquals(true, test1020.contains(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30101);assertNull(interval.gap(test1020));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30102);assertEquals(false, interval.abuts(test1020));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30103);assertEquals(true, interval.overlaps(test1020));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30104);assertEquals(false, interval.contains(test1020));
        
        // [10,20) [18,22) - overlaps
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30105);interval = new Interval(18, 22);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30106);assertNull(test1020.gap(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30107);assertEquals(false, test1020.abuts(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30108);assertEquals(true, test1020.overlaps(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30109);assertEquals(false, test1020.contains(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30110);assertNull(interval.gap(test1020));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30111);assertEquals(false, interval.abuts(test1020));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30112);assertEquals(true, interval.overlaps(test1020));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30113);assertEquals(false, interval.contains(test1020));
        
        // [10,20) [20,24) - abuts
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30114);interval = new Interval(20, 24);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30115);assertNull(test1020.gap(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30116);assertEquals(true, test1020.abuts(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30117);assertEquals(false, test1020.overlaps(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30118);assertEquals(false, test1020.contains(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30119);assertNull(interval.gap(test1020));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30120);assertEquals(true, interval.abuts(test1020));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30121);assertEquals(false, interval.overlaps(test1020));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30122);assertEquals(false, interval.contains(test1020));
        
        // [10,20) [22,26) - gap
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30123);interval = new Interval(22, 26);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30124);assertNotNull(test1020.gap(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30125);assertEquals(false, test1020.abuts(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30126);assertEquals(false, test1020.overlaps(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30127);assertEquals(false, test1020.contains(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30128);assertNotNull(interval.gap(test1020));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30129);assertEquals(false, interval.abuts(test1020));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30130);assertEquals(false, interval.overlaps(test1020));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30131);assertEquals(false, interval.contains(test1020));
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_useCase_ContainsOverlapAbutGap_zeroDuration() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30132);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kxca3jn90();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.test_useCase_ContainsOverlapAbutGap_zeroDuration",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30132,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kxca3jn90(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30132);
        // this is a simple test to ensure that the use case of these methods
        // is OK when considering a zero duration inerval
        // when comparing any two intervals they can be in one and only one of these states
        // (a) have a gap between them, (b) abut or (c) overlap
        // contains is a subset of overlap
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30133);Interval test1020 = new Interval(10, 20);
        
        // [8,8) [10,20) - gap
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30134);Interval interval = new Interval(8, 8);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30135);assertNotNull(test1020.gap(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30136);assertEquals(false, test1020.abuts(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30137);assertEquals(false, test1020.overlaps(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30138);assertEquals(false, test1020.contains(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30139);assertNotNull(interval.gap(test1020));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30140);assertEquals(false, interval.abuts(test1020));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30141);assertEquals(false, interval.overlaps(test1020));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30142);assertEquals(false, interval.contains(test1020));
        
        // [10,10) [10,20) - abuts and contains-one-way
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30143);interval = new Interval(10, 10);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30144);assertNull(test1020.gap(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30145);assertEquals(true,  test1020.abuts(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30146);assertEquals(false, test1020.overlaps(interval));  // abuts, so can't overlap
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30147);assertEquals(true,  test1020.contains(interval));  // normal contains zero-duration
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30148);assertNull(interval.gap(test1020));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30149);assertEquals(true,  interval.abuts(test1020));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30150);assertEquals(false, interval.overlaps(test1020));  // abuts, so can't overlap
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30151);assertEquals(false, interval.contains(test1020));  // zero-duration does not contain normal
        
        // [12,12) [10,20) - contains-one-way and overlaps
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30152);interval = new Interval(12, 12);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30153);assertNull(test1020.gap(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30154);assertEquals(false, test1020.abuts(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30155);assertEquals(true,  test1020.overlaps(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30156);assertEquals(true,  test1020.contains(interval));  // normal contains zero-duration
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30157);assertNull(interval.gap(test1020));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30158);assertEquals(false, interval.abuts(test1020));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30159);assertEquals(true,  interval.overlaps(test1020));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30160);assertEquals(false, interval.contains(test1020));  // zero-duration does not contain normal
        
        // [10,20) [20,20) - abuts
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30161);interval = new Interval(20, 20);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30162);assertNull(test1020.gap(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30163);assertEquals(true,  test1020.abuts(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30164);assertEquals(false, test1020.overlaps(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30165);assertEquals(false, test1020.contains(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30166);assertNull(interval.gap(test1020));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30167);assertEquals(true,  interval.abuts(test1020));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30168);assertEquals(false, interval.overlaps(test1020));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30169);assertEquals(false, interval.contains(test1020));
        
        // [10,20) [22,22) - gap
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30170);interval = new Interval(22, 22);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30171);assertNotNull(test1020.gap(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30172);assertEquals(false, test1020.abuts(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30173);assertEquals(false, test1020.overlaps(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30174);assertEquals(false, test1020.contains(interval));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30175);assertNotNull(interval.gap(test1020));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30176);assertEquals(false, interval.abuts(test1020));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30177);assertEquals(false, interval.overlaps(test1020));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30178);assertEquals(false, interval.contains(test1020));
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_useCase_ContainsOverlapAbutGap_bothZeroDuration() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30179);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1du6o80nab();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.test_useCase_ContainsOverlapAbutGap_bothZeroDuration",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30179,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1du6o80nab(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30179);
        // this is a simple test to ensure that the use case of these methods
        // is OK when considering two zero duration inervals
        // this is the simplest case, as the two intervals either have a gap or not
        // if not, then they are equal and abut
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30180);Interval test0808 = new Interval(8, 8);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30181);Interval test1010 = new Interval(10, 10);
        
        // [8,8) [10,10) - gap
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30182);assertNotNull(test1010.gap(test0808));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30183);assertEquals(false, test1010.abuts(test0808));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30184);assertEquals(false, test1010.overlaps(test0808));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30185);assertEquals(false, test1010.contains(test0808));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30186);assertNotNull(test0808.gap(test1010));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30187);assertEquals(false, test0808.abuts(test1010));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30188);assertEquals(false, test0808.overlaps(test1010));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30189);assertEquals(false, test0808.contains(test1010));
        
        // [10,10) [10,10) - abuts
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30190);assertNull(test1010.gap(test1010));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30191);assertEquals(true,  test1010.abuts(test1010));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30192);assertEquals(false, test1010.overlaps(test1010));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30193);assertEquals(false, test1010.contains(test1010));
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testContains_long() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30194);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1651dm9naq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testContains_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30194,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1651dm9naq(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30194);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30195);assertEquals(false, interval37.contains(2));  // value before
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30196);assertEquals(true,  interval37.contains(3));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30197);assertEquals(true,  interval37.contains(4));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30198);assertEquals(true,  interval37.contains(5));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30199);assertEquals(true,  interval37.contains(6));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30200);assertEquals(false, interval37.contains(7));  // value after
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30201);assertEquals(false, interval37.contains(8));  // value after
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testContains_long_zeroDuration() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ql2cfsnay();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testContains_long_zeroDuration",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30202,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ql2cfsnay(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30202);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30203);assertEquals(false, interval33.contains(2));  // value before
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30204);assertEquals(false, interval33.contains(3));  // zero length duration contains nothing
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30205);assertEquals(false, interval33.contains(4));  // value after
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testContainsNow() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30206);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ee80lwnb2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testContainsNow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30206,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ee80lwnb2(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30206);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30207);DateTimeUtils.setCurrentMillisFixed(2);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30208);assertEquals(false, interval37.containsNow());  // value before
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30209);DateTimeUtils.setCurrentMillisFixed(3);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30210);assertEquals(true,  interval37.containsNow());
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30211);DateTimeUtils.setCurrentMillisFixed(4);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30212);assertEquals(true,  interval37.containsNow());
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30213);DateTimeUtils.setCurrentMillisFixed(6);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30214);assertEquals(true,  interval37.containsNow());
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30215);DateTimeUtils.setCurrentMillisFixed(7);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30216);assertEquals(false, interval37.containsNow());  // value after
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30217);DateTimeUtils.setCurrentMillisFixed(8);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30218);assertEquals(false, interval37.containsNow());  // value after
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30219);DateTimeUtils.setCurrentMillisFixed(2);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30220);assertEquals(false, interval33.containsNow());  // value before
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30221);DateTimeUtils.setCurrentMillisFixed(3);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30222);assertEquals(false, interval33.containsNow());  // zero length duration contains nothing
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30223);DateTimeUtils.setCurrentMillisFixed(4);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30224);assertEquals(false, interval33.containsNow());  // value after
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testContains_RI() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30225);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13g4e8cnbl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testContains_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30225,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13g4e8cnbl(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30225);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30226);assertEquals(false, interval37.contains(new Instant(2)));  // value before
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30227);assertEquals(true,  interval37.contains(new Instant(3)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30228);assertEquals(true,  interval37.contains(new Instant(4)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30229);assertEquals(true,  interval37.contains(new Instant(5)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30230);assertEquals(true,  interval37.contains(new Instant(6)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30231);assertEquals(false, interval37.contains(new Instant(7)));  // value after
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30232);assertEquals(false, interval37.contains(new Instant(8)));  // value after
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testContains_RI_null() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30233);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fjzolknbt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testContains_RI_null",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30233,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fjzolknbt(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30233);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30234);DateTimeUtils.setCurrentMillisFixed(2);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30235);assertEquals(false, interval37.contains((ReadableInstant) null));  // value before
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30236);DateTimeUtils.setCurrentMillisFixed(3);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30237);assertEquals(true,  interval37.contains((ReadableInstant) null));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30238);DateTimeUtils.setCurrentMillisFixed(4);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30239);assertEquals(true,  interval37.contains((ReadableInstant) null));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30240);DateTimeUtils.setCurrentMillisFixed(6);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30241);assertEquals(true,  interval37.contains((ReadableInstant) null));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30242);DateTimeUtils.setCurrentMillisFixed(7);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30243);assertEquals(false, interval37.contains((ReadableInstant) null));  // value after
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30244);DateTimeUtils.setCurrentMillisFixed(8);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30245);assertEquals(false, interval37.contains((ReadableInstant) null));  // value after
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testContains_RI_zeroDuration() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ujsdq5nc6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testContains_RI_zeroDuration",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30246,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ujsdq5nc6(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30246);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30247);assertEquals(false, interval33.contains(new Instant(2)));  // value before
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30248);assertEquals(false, interval33.contains(new Instant(3)));  // zero length duration contains nothing
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30249);assertEquals(false, interval33.contains(new Instant(4)));  // value after
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testContains_RInterval() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30250);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13h7jbknca();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testContains_RInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30250,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13h7jbknca(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30250);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30251);assertEquals(false, interval37.contains(new Interval(1, 2)));  // gap before
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30252);assertEquals(false, interval37.contains(new Interval(2, 2)));  // gap before
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30253);assertEquals(false, interval37.contains(new Interval(2, 3)));  // abuts before
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30254);assertEquals(true,  interval37.contains(new Interval(3, 3)));
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30255);assertEquals(false, interval37.contains(new Interval(2, 4)));  // starts before
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30256);assertEquals(true,  interval37.contains(new Interval(3, 4)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30257);assertEquals(true,  interval37.contains(new Interval(4, 4)));
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30258);assertEquals(false, interval37.contains(new Interval(2, 6)));  // starts before
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30259);assertEquals(true,  interval37.contains(new Interval(3, 6)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30260);assertEquals(true,  interval37.contains(new Interval(4, 6)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30261);assertEquals(true,  interval37.contains(new Interval(5, 6)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30262);assertEquals(true,  interval37.contains(new Interval(6, 6)));
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30263);assertEquals(false, interval37.contains(new Interval(2, 7)));  // starts before
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30264);assertEquals(true,  interval37.contains(new Interval(3, 7)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30265);assertEquals(true,  interval37.contains(new Interval(4, 7)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30266);assertEquals(true,  interval37.contains(new Interval(5, 7)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30267);assertEquals(true,  interval37.contains(new Interval(6, 7)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30268);assertEquals(false, interval37.contains(new Interval(7, 7)));  // abuts after
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30269);assertEquals(false, interval37.contains(new Interval(2, 8)));  // ends after
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30270);assertEquals(false, interval37.contains(new Interval(3, 8)));  // ends after
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30271);assertEquals(false, interval37.contains(new Interval(4, 8)));  // ends after
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30272);assertEquals(false, interval37.contains(new Interval(5, 8)));  // ends after
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30273);assertEquals(false, interval37.contains(new Interval(6, 8)));  // ends after
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30274);assertEquals(false, interval37.contains(new Interval(7, 8)));  // abuts after
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30275);assertEquals(false, interval37.contains(new Interval(8, 8)));  // gap after
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30276);assertEquals(false, interval37.contains(new Interval(8, 9)));  // gap after
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30277);assertEquals(false, interval37.contains(new Interval(9, 9)));  // gap after
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testContains_RInterval_null() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30278);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19jj4bgnd2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testContains_RInterval_null",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30278,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19jj4bgnd2(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30278);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30279);DateTimeUtils.setCurrentMillisFixed(2);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30280);assertEquals(false, interval37.contains((ReadableInterval) null));  // gap before
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30281);DateTimeUtils.setCurrentMillisFixed(3);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30282);assertEquals(true,  interval37.contains((ReadableInterval) null));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30283);DateTimeUtils.setCurrentMillisFixed(4);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30284);assertEquals(true,  interval37.contains((ReadableInterval) null));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30285);DateTimeUtils.setCurrentMillisFixed(6);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30286);assertEquals(true,  interval37.contains((ReadableInterval) null));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30287);DateTimeUtils.setCurrentMillisFixed(7);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30288);assertEquals(false, interval37.contains((ReadableInterval) null));  // abuts after
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30289);DateTimeUtils.setCurrentMillisFixed(8);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30290);assertEquals(false, interval37.contains((ReadableInterval) null));  // gap after
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testContains_RInterval_zeroDuration() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30291);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f9uu8pndf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testContains_RInterval_zeroDuration",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30291,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f9uu8pndf(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30291);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30292);assertEquals(false, interval33.contains(interval33));  // zero length duration contains nothing
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30293);assertEquals(false, interval33.contains(interval37));  // zero-duration cannot contain anything
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30294);assertEquals(true,  interval37.contains(interval33));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30295);assertEquals(false, interval33.contains(new Interval(1, 2)));  // zero-duration cannot contain anything
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30296);assertEquals(false, interval33.contains(new Interval(8, 9)));  // zero-duration cannot contain anything
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30297);assertEquals(false, interval33.contains(new Interval(1, 9)));  // zero-duration cannot contain anything
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30298);DateTimeUtils.setCurrentMillisFixed(2);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30299);assertEquals(false, interval33.contains((ReadableInterval) null));  // gap before
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30300);DateTimeUtils.setCurrentMillisFixed(3);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30301);assertEquals(false, interval33.contains((ReadableInterval) null));  // zero length duration contains nothing
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30302);DateTimeUtils.setCurrentMillisFixed(4);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30303);assertEquals(false, interval33.contains((ReadableInterval) null));  // gap after
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testOverlaps_RInterval() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30304);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hyewlfnds();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testOverlaps_RInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30304,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hyewlfnds(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30304);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30305);assertEquals(false, interval37.overlaps(new Interval(1, 2)));  // gap before
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30306);assertEquals(false, interval37.overlaps(new Interval(2, 2)));  // gap before
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30307);assertEquals(false, interval37.overlaps(new Interval(2, 3)));  // abuts before
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30308);assertEquals(false, interval37.overlaps(new Interval(3, 3)));  // abuts before
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30309);assertEquals(true,  interval37.overlaps(new Interval(2, 4)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30310);assertEquals(true,  interval37.overlaps(new Interval(3, 4)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30311);assertEquals(true,  interval37.overlaps(new Interval(4, 4)));
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30312);assertEquals(true,  interval37.overlaps(new Interval(2, 6)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30313);assertEquals(true,  interval37.overlaps(new Interval(3, 6)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30314);assertEquals(true,  interval37.overlaps(new Interval(4, 6)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30315);assertEquals(true,  interval37.overlaps(new Interval(5, 6)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30316);assertEquals(true,  interval37.overlaps(new Interval(6, 6)));
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30317);assertEquals(true,  interval37.overlaps(new Interval(2, 7)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30318);assertEquals(true,  interval37.overlaps(new Interval(3, 7)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30319);assertEquals(true,  interval37.overlaps(new Interval(4, 7)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30320);assertEquals(true,  interval37.overlaps(new Interval(5, 7)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30321);assertEquals(true,  interval37.overlaps(new Interval(6, 7)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30322);assertEquals(false, interval37.overlaps(new Interval(7, 7)));  // abuts after
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30323);assertEquals(true,  interval37.overlaps(new Interval(2, 8)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30324);assertEquals(true,  interval37.overlaps(new Interval(3, 8)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30325);assertEquals(true,  interval37.overlaps(new Interval(4, 8)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30326);assertEquals(true,  interval37.overlaps(new Interval(5, 8)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30327);assertEquals(true,  interval37.overlaps(new Interval(6, 8)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30328);assertEquals(false, interval37.overlaps(new Interval(7, 8)));  // abuts after
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30329);assertEquals(false, interval37.overlaps(new Interval(8, 8)));  // gap after
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30330);assertEquals(false, interval37.overlaps(new Interval(8, 9)));  // gap after
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30331);assertEquals(false, interval37.overlaps(new Interval(9, 9)));  // gap after
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testOverlaps_RInterval_null() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mbso09nek();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testOverlaps_RInterval_null",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30332,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mbso09nek(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30332);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30333);DateTimeUtils.setCurrentMillisFixed(2);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30334);assertEquals(false, interval37.overlaps((ReadableInterval) null));  // gap before
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30335);DateTimeUtils.setCurrentMillisFixed(3);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30336);assertEquals(false, interval37.overlaps((ReadableInterval) null));  // abuts before
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30337);DateTimeUtils.setCurrentMillisFixed(4);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30338);assertEquals(true,  interval37.overlaps((ReadableInterval) null));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30339);DateTimeUtils.setCurrentMillisFixed(6);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30340);assertEquals(true,  interval37.overlaps((ReadableInterval) null));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30341);DateTimeUtils.setCurrentMillisFixed(7);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30342);assertEquals(false, interval37.overlaps((ReadableInterval) null));  // abuts after
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30343);DateTimeUtils.setCurrentMillisFixed(8);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30344);assertEquals(false, interval37.overlaps((ReadableInterval) null));  // gap after
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30345);DateTimeUtils.setCurrentMillisFixed(3);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30346);assertEquals(false, interval33.overlaps((ReadableInterval) null));  // abuts before and after
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testOverlaps_RInterval_zeroDuration() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30347);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13ffu50nez();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testOverlaps_RInterval_zeroDuration",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30347,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13ffu50nez(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30347);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30348);assertEquals(false, interval33.overlaps(interval33));  // abuts before and after
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30349);assertEquals(false, interval33.overlaps(interval37));  // abuts before
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30350);assertEquals(false, interval37.overlaps(interval33));  // abuts before
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30351);assertEquals(false, interval33.overlaps(new Interval(1, 2)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30352);assertEquals(false, interval33.overlaps(new Interval(8, 9)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30353);assertEquals(true,  interval33.overlaps(new Interval(1, 9)));
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testOverlap_RInterval() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30354);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nlic1gnf6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testOverlap_RInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30354,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nlic1gnf6(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30354);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30355);assertEquals(null, interval37.overlap(new Interval(1, 2)));  // gap before
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30356);assertEquals(null, interval37.overlap(new Interval(2, 2)));  // gap before
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30357);assertEquals(null, interval37.overlap(new Interval(2, 3)));  // abuts before
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30358);assertEquals(null, interval37.overlap(new Interval(3, 3)));  // abuts before
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30359);assertEquals(new Interval(3, 4), interval37.overlap(new Interval(2, 4)));  // truncated start
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30360);assertEquals(new Interval(3, 4), interval37.overlap(new Interval(3, 4)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30361);assertEquals(new Interval(4, 4), interval37.overlap(new Interval(4, 4)));
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30362);assertEquals(new Interval(3, 7), interval37.overlap(new Interval(2, 7)));  // truncated start
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30363);assertEquals(new Interval(3, 7), interval37.overlap(new Interval(3, 7)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30364);assertEquals(new Interval(4, 7), interval37.overlap(new Interval(4, 7)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30365);assertEquals(new Interval(5, 7), interval37.overlap(new Interval(5, 7)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30366);assertEquals(new Interval(6, 7), interval37.overlap(new Interval(6, 7)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30367);assertEquals(null, interval37.overlap(new Interval(7, 7)));  // abuts after
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30368);assertEquals(new Interval(3, 7), interval37.overlap(new Interval(2, 8)));  // truncated start and end
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30369);assertEquals(new Interval(3, 7), interval37.overlap(new Interval(3, 8)));  // truncated end
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30370);assertEquals(new Interval(4, 7), interval37.overlap(new Interval(4, 8)));  // truncated end
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30371);assertEquals(new Interval(5, 7), interval37.overlap(new Interval(5, 8)));  // truncated end
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30372);assertEquals(new Interval(6, 7), interval37.overlap(new Interval(6, 8)));  // truncated end
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30373);assertEquals(null, interval37.overlap(new Interval(7, 8)));  // abuts after
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30374);assertEquals(null, interval37.overlap(new Interval(8, 8)));  // gap after
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testOverlap_RInterval_null() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30375);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jfqu3knfr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testOverlap_RInterval_null",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30375,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jfqu3knfr(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30375);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30376);DateTimeUtils.setCurrentMillisFixed(2);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30377);assertEquals(null, interval37.overlap((ReadableInterval) null));  // gap before
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30378);DateTimeUtils.setCurrentMillisFixed(3);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30379);assertEquals(null, interval37.overlap((ReadableInterval) null));  // abuts before
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30380);DateTimeUtils.setCurrentMillisFixed(4);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30381);assertEquals(new Interval(4, 4), interval37.overlap((ReadableInterval) null));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30382);DateTimeUtils.setCurrentMillisFixed(6);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30383);assertEquals(new Interval(6, 6), interval37.overlap((ReadableInterval) null));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30384);DateTimeUtils.setCurrentMillisFixed(7);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30385);assertEquals(null, interval37.overlap((ReadableInterval) null));  // abuts after
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30386);DateTimeUtils.setCurrentMillisFixed(8);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30387);assertEquals(null, interval37.overlap((ReadableInterval) null));  // gap after
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30388);DateTimeUtils.setCurrentMillisFixed(3);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30389);assertEquals(null, interval33.overlap((ReadableInterval) null));  // abuts before and after
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testOverlap_RInterval_zone() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30390);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ewfcm3ng6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testOverlap_RInterval_zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30390,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ewfcm3ng6(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30390);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30391);Interval testA = new Interval(new DateTime(3, LONDON), new DateTime(7, LONDON));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30392);assertEquals(ISOChronology.getInstance(LONDON), testA.getChronology());
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30393);Interval testB = new Interval(new DateTime(4, MOSCOW), new DateTime(8, MOSCOW));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30394);assertEquals(ISOChronology.getInstance(MOSCOW), testB.getChronology());
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30395);Interval resultAB = testA.overlap(testB);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30396);assertEquals(ISOChronology.getInstance(LONDON), resultAB.getChronology());
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30397);Interval resultBA = testB.overlap(testA);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30398);assertEquals(ISOChronology.getInstance(MOSCOW), resultBA.getChronology());
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testOverlap_RInterval_zoneUTC() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30399);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1osnz4jngf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testOverlap_RInterval_zoneUTC",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30399,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1osnz4jngf(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30399);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30400);Interval testA = new Interval(new Instant(3), new Instant(7));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30401);assertEquals(ISOChronology.getInstanceUTC(), testA.getChronology());
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30402);Interval testB = new Interval(new Instant(4), new Instant(8));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30403);assertEquals(ISOChronology.getInstanceUTC(), testB.getChronology());
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30404);Interval result = testA.overlap(testB);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30405);assertEquals(ISOChronology.getInstanceUTC(), result.getChronology());
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGap_RInterval() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30406);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mq55zxngm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testGap_RInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30406,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mq55zxngm(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30406);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30407);assertEquals(new Interval(1, 3), interval37.gap(new Interval(0, 1)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30408);assertEquals(new Interval(1, 3), interval37.gap(new Interval(1, 1)));
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30409);assertEquals(null, interval37.gap(new Interval(2, 3)));  // abuts before
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30410);assertEquals(null, interval37.gap(new Interval(3, 3)));  // abuts before
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30411);assertEquals(null, interval37.gap(new Interval(4, 6)));  // overlaps
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30412);assertEquals(null, interval37.gap(new Interval(3, 7)));  // overlaps
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30413);assertEquals(null, interval37.gap(new Interval(6, 7)));  // overlaps
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30414);assertEquals(null, interval37.gap(new Interval(7, 7)));  // abuts after
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30415);assertEquals(null, interval37.gap(new Interval(6, 8)));  // overlaps
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30416);assertEquals(null, interval37.gap(new Interval(7, 8)));  // abuts after
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30417);assertEquals(new Interval(7, 8), interval37.gap(new Interval(8, 8)));
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30418);assertEquals(null, interval37.gap(new Interval(6, 9)));  // overlaps
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30419);assertEquals(null, interval37.gap(new Interval(7, 9)));  // abuts after
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30420);assertEquals(new Interval(7, 8), interval37.gap(new Interval(8, 9)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30421);assertEquals(new Interval(7, 9), interval37.gap(new Interval(9, 9)));
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testGap_RInterval_null() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30422);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sbyvypnh2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testGap_RInterval_null",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30422,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sbyvypnh2(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30422);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30423);DateTimeUtils.setCurrentMillisFixed(2);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30424);assertEquals(new Interval(2, 3),  interval37.gap((ReadableInterval) null));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30425);DateTimeUtils.setCurrentMillisFixed(3);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30426);assertEquals(null,  interval37.gap((ReadableInterval) null));  // abuts before
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30427);DateTimeUtils.setCurrentMillisFixed(4);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30428);assertEquals(null,  interval37.gap((ReadableInterval) null));  // overlaps
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30429);DateTimeUtils.setCurrentMillisFixed(6);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30430);assertEquals(null,  interval37.gap((ReadableInterval) null));  // overlaps
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30431);DateTimeUtils.setCurrentMillisFixed(7);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30432);assertEquals(null,  interval37.gap((ReadableInterval) null));  // abuts after
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30433);DateTimeUtils.setCurrentMillisFixed(8);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30434);assertEquals(new Interval(7, 8),  interval37.gap((ReadableInterval) null));
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testGap_RInterval_zone() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30435);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1607aqynhf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testGap_RInterval_zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30435,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1607aqynhf(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30435);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30436);Interval testA = new Interval(new DateTime(3, LONDON), new DateTime(7, LONDON));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30437);assertEquals(ISOChronology.getInstance(LONDON), testA.getChronology());
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30438);Interval testB = new Interval(new DateTime(1, MOSCOW), new DateTime(2, MOSCOW));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30439);assertEquals(ISOChronology.getInstance(MOSCOW), testB.getChronology());
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30440);Interval resultAB = testA.gap(testB);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30441);assertEquals(ISOChronology.getInstance(LONDON), resultAB.getChronology());
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30442);Interval resultBA = testB.gap(testA);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30443);assertEquals(ISOChronology.getInstance(MOSCOW), resultBA.getChronology());
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testGap_RInterval_zoneUTC() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30444);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nwao9onho();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testGap_RInterval_zoneUTC",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30444,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nwao9onho(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30444);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30445);Interval testA = new Interval(new Instant(3), new Instant(7));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30446);assertEquals(ISOChronology.getInstanceUTC(), testA.getChronology());
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30447);Interval testB = new Interval(new Instant(1), new Instant(2));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30448);assertEquals(ISOChronology.getInstanceUTC(), testB.getChronology());
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30449);Interval result = testA.gap(testB);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30450);assertEquals(ISOChronology.getInstanceUTC(), result.getChronology());
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testAbuts_RInterval() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ci87a8nhv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testAbuts_RInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30451,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ci87a8nhv(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30451);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30452);assertEquals(false, interval37.abuts(new Interval(1, 2)));  // gap before
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30453);assertEquals(false, interval37.abuts(new Interval(2, 2)));  // gap before
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30454);assertEquals(true,  interval37.abuts(new Interval(2, 3)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30455);assertEquals(true,  interval37.abuts(new Interval(3, 3)));
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30456);assertEquals(false, interval37.abuts(new Interval(2, 4)));  // overlaps
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30457);assertEquals(false, interval37.abuts(new Interval(3, 4)));  // overlaps
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30458);assertEquals(false, interval37.abuts(new Interval(4, 4)));  // overlaps
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30459);assertEquals(false, interval37.abuts(new Interval(2, 6)));  // overlaps
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30460);assertEquals(false, interval37.abuts(new Interval(3, 6)));  // overlaps
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30461);assertEquals(false, interval37.abuts(new Interval(4, 6)));  // overlaps
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30462);assertEquals(false, interval37.abuts(new Interval(5, 6)));  // overlaps
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30463);assertEquals(false, interval37.abuts(new Interval(6, 6)));  // overlaps
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30464);assertEquals(false, interval37.abuts(new Interval(2, 7)));  // overlaps
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30465);assertEquals(false, interval37.abuts(new Interval(3, 7)));  // overlaps
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30466);assertEquals(false, interval37.abuts(new Interval(4, 7)));  // overlaps
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30467);assertEquals(false, interval37.abuts(new Interval(5, 7)));  // overlaps
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30468);assertEquals(false, interval37.abuts(new Interval(6, 7)));  // overlaps
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30469);assertEquals(true,  interval37.abuts(new Interval(7, 7)));
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30470);assertEquals(false, interval37.abuts(new Interval(2, 8)));  // overlaps
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30471);assertEquals(false, interval37.abuts(new Interval(3, 8)));  // overlaps
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30472);assertEquals(false, interval37.abuts(new Interval(4, 8)));  // overlaps
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30473);assertEquals(false, interval37.abuts(new Interval(5, 8)));  // overlaps
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30474);assertEquals(false, interval37.abuts(new Interval(6, 8)));  // overlaps
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30475);assertEquals(true,  interval37.abuts(new Interval(7, 8)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30476);assertEquals(false, interval37.abuts(new Interval(8, 8)));  // gap after
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30477);assertEquals(false, interval37.abuts(new Interval(8, 9)));  // gap after
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30478);assertEquals(false, interval37.abuts(new Interval(9, 9)));  // gap after
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testAbuts_RInterval_null() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30479);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l1m824nin();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testAbuts_RInterval_null",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30479,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l1m824nin(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30479);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30480);DateTimeUtils.setCurrentMillisFixed(2);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30481);assertEquals(false,  interval37.abuts((ReadableInterval) null));  // gap before
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30482);DateTimeUtils.setCurrentMillisFixed(3);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30483);assertEquals(true,  interval37.abuts((ReadableInterval) null));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30484);DateTimeUtils.setCurrentMillisFixed(4);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30485);assertEquals(false,  interval37.abuts((ReadableInterval) null));  // overlaps
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30486);DateTimeUtils.setCurrentMillisFixed(6);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30487);assertEquals(false,  interval37.abuts((ReadableInterval) null));  // overlaps
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30488);DateTimeUtils.setCurrentMillisFixed(7);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30489);assertEquals(true,  interval37.abuts((ReadableInterval) null));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30490);DateTimeUtils.setCurrentMillisFixed(8);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30491);assertEquals(false,  interval37.abuts((ReadableInterval) null));  // gap after
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testIsEqual_RI() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30492);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a1wuudnj0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsEqual_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30492,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a1wuudnj0(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30492);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30493);assertEquals(false, interval37.isEqual(interval33));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30494);assertEquals(true, interval37.isEqual(interval37));
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testIsBefore_long() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ie6mpznj3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsBefore_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30495,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ie6mpznj3(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30495);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30496);assertEquals(false, interval37.isBefore(2));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30497);assertEquals(false, interval37.isBefore(3));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30498);assertEquals(false, interval37.isBefore(4));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30499);assertEquals(false, interval37.isBefore(5));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30500);assertEquals(false, interval37.isBefore(6));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30501);assertEquals(true,  interval37.isBefore(7));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30502);assertEquals(true,  interval37.isBefore(8));
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testIsBeforeNow() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nh1we6njb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsBeforeNow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30503,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nh1we6njb(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30503);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30504);DateTimeUtils.setCurrentMillisFixed(2);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30505);assertEquals(false, interval37.isBeforeNow());
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30506);DateTimeUtils.setCurrentMillisFixed(3);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30507);assertEquals(false, interval37.isBeforeNow());
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30508);DateTimeUtils.setCurrentMillisFixed(4);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30509);assertEquals(false, interval37.isBeforeNow());
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30510);DateTimeUtils.setCurrentMillisFixed(6);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30511);assertEquals(false, interval37.isBeforeNow());
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30512);DateTimeUtils.setCurrentMillisFixed(7);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30513);assertEquals(true, interval37.isBeforeNow());
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30514);DateTimeUtils.setCurrentMillisFixed(8);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30515);assertEquals(true, interval37.isBeforeNow());
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testIsBefore_RI() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15mphjynjo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsBefore_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30516,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15mphjynjo(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30516);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30517);assertEquals(false, interval37.isBefore(new Instant(2)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30518);assertEquals(false, interval37.isBefore(new Instant(3)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30519);assertEquals(false, interval37.isBefore(new Instant(4)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30520);assertEquals(false, interval37.isBefore(new Instant(5)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30521);assertEquals(false, interval37.isBefore(new Instant(6)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30522);assertEquals(true,  interval37.isBefore(new Instant(7)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30523);assertEquals(true,  interval37.isBefore(new Instant(8)));
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testIsBefore_RI_null() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30524);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mt218unjw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsBefore_RI_null",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30524,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mt218unjw(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30524);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30525);DateTimeUtils.setCurrentMillisFixed(2);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30526);assertEquals(false, interval37.isBefore((ReadableInstant) null));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30527);DateTimeUtils.setCurrentMillisFixed(3);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30528);assertEquals(false, interval37.isBefore((ReadableInstant) null));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30529);DateTimeUtils.setCurrentMillisFixed(4);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30530);assertEquals(false, interval37.isBefore((ReadableInstant) null));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30531);DateTimeUtils.setCurrentMillisFixed(6);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30532);assertEquals(false, interval37.isBefore((ReadableInstant) null));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30533);DateTimeUtils.setCurrentMillisFixed(7);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30534);assertEquals(true, interval37.isBefore((ReadableInstant) null));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30535);DateTimeUtils.setCurrentMillisFixed(8);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30536);assertEquals(true, interval37.isBefore((ReadableInstant) null));
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testIsBefore_RInterval() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30537);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14qlycmnk9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsBefore_RInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30537,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14qlycmnk9(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30537);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30538);assertEquals(false, interval37.isBefore(new Interval(Long.MIN_VALUE, 2)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30539);assertEquals(false, interval37.isBefore(new Interval(Long.MIN_VALUE, 3)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30540);assertEquals(false, interval37.isBefore(new Interval(Long.MIN_VALUE, 4)));
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30541);assertEquals(false, interval37.isBefore(new Interval(6, Long.MAX_VALUE)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30542);assertEquals(true, interval37.isBefore(new Interval(7, Long.MAX_VALUE)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30543);assertEquals(true, interval37.isBefore(new Interval(8, Long.MAX_VALUE)));
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testIsBefore_RInterval_null() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12mij3unkg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsBefore_RInterval_null",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30544,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12mij3unkg(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30544);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30545);DateTimeUtils.setCurrentMillisFixed(2);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30546);assertEquals(false, interval37.isBefore((ReadableInterval) null));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30547);DateTimeUtils.setCurrentMillisFixed(3);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30548);assertEquals(false, interval37.isBefore((ReadableInterval) null));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30549);DateTimeUtils.setCurrentMillisFixed(4);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30550);assertEquals(false, interval37.isBefore((ReadableInterval) null));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30551);DateTimeUtils.setCurrentMillisFixed(6);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30552);assertEquals(false, interval37.isBefore((ReadableInterval) null));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30553);DateTimeUtils.setCurrentMillisFixed(7);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30554);assertEquals(true, interval37.isBefore((ReadableInterval) null));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30555);DateTimeUtils.setCurrentMillisFixed(8);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30556);assertEquals(true, interval37.isBefore((ReadableInterval) null));
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testIsAfter_long() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30557);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ehltpankt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsAfter_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30557,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ehltpankt(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30557);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30558);assertEquals(true,  interval37.isAfter(2));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30559);assertEquals(false, interval37.isAfter(3));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30560);assertEquals(false, interval37.isAfter(4));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30561);assertEquals(false, interval37.isAfter(5));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30562);assertEquals(false, interval37.isAfter(6));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30563);assertEquals(false, interval37.isAfter(7));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30564);assertEquals(false, interval37.isAfter(8));
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testIsAfterNow() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15bglzxnl1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsAfterNow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30565,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15bglzxnl1(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30565);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30566);DateTimeUtils.setCurrentMillisFixed(2);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30567);assertEquals(true, interval37.isAfterNow());
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30568);DateTimeUtils.setCurrentMillisFixed(3);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30569);assertEquals(false, interval37.isAfterNow());
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30570);DateTimeUtils.setCurrentMillisFixed(4);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30571);assertEquals(false, interval37.isAfterNow());
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30572);DateTimeUtils.setCurrentMillisFixed(6);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30573);assertEquals(false, interval37.isAfterNow());
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30574);DateTimeUtils.setCurrentMillisFixed(7);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30575);assertEquals(false, interval37.isAfterNow());
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30576);DateTimeUtils.setCurrentMillisFixed(8);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30577);assertEquals(false, interval37.isAfterNow());
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testIsAfter_RI() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n5t0u5nle();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsAfter_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30578,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n5t0u5nle(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30578);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30579);assertEquals(true,  interval37.isAfter(new Instant(2)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30580);assertEquals(false, interval37.isAfter(new Instant(3)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30581);assertEquals(false, interval37.isAfter(new Instant(4)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30582);assertEquals(false, interval37.isAfter(new Instant(5)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30583);assertEquals(false, interval37.isAfter(new Instant(6)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30584);assertEquals(false, interval37.isAfter(new Instant(7)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30585);assertEquals(false, interval37.isAfter(new Instant(8)));
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testIsAfter_RI_null() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30586);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fz3qevnlm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsAfter_RI_null",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30586,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fz3qevnlm(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30586);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30587);DateTimeUtils.setCurrentMillisFixed(2);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30588);assertEquals(true, interval37.isAfter((ReadableInstant) null));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30589);DateTimeUtils.setCurrentMillisFixed(3);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30590);assertEquals(false, interval37.isAfter((ReadableInstant) null));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30591);DateTimeUtils.setCurrentMillisFixed(4);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30592);assertEquals(false, interval37.isAfter((ReadableInstant) null));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30593);DateTimeUtils.setCurrentMillisFixed(6);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30594);assertEquals(false, interval37.isAfter((ReadableInstant) null));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30595);DateTimeUtils.setCurrentMillisFixed(7);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30596);assertEquals(false, interval37.isAfter((ReadableInstant) null));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30597);DateTimeUtils.setCurrentMillisFixed(8);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30598);assertEquals(false, interval37.isAfter((ReadableInstant) null));
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testIsAfter_RInterval() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30599);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q8rfvlnlz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsAfter_RInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30599,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q8rfvlnlz(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30599);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30600);assertEquals(true, interval37.isAfter(new Interval(Long.MIN_VALUE, 2)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30601);assertEquals(true, interval37.isAfter(new Interval(Long.MIN_VALUE, 3)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30602);assertEquals(false, interval37.isAfter(new Interval(Long.MIN_VALUE, 4)));
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30603);assertEquals(false, interval37.isAfter(new Interval(6, Long.MAX_VALUE)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30604);assertEquals(false, interval37.isAfter(new Interval(7, Long.MAX_VALUE)));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30605);assertEquals(false, interval37.isAfter(new Interval(8, Long.MAX_VALUE)));
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testIsAfter_RInterval_null() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30606);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_116jqs5nm6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testIsAfter_RInterval_null",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30606,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_116jqs5nm6(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30606);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30607);DateTimeUtils.setCurrentMillisFixed(2);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30608);assertEquals(true, interval37.isAfter((ReadableInterval) null));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30609);DateTimeUtils.setCurrentMillisFixed(3);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30610);assertEquals(true, interval37.isAfter((ReadableInterval) null));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30611);DateTimeUtils.setCurrentMillisFixed(4);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30612);assertEquals(false, interval37.isAfter((ReadableInterval) null));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30613);DateTimeUtils.setCurrentMillisFixed(6);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30614);assertEquals(false, interval37.isAfter((ReadableInterval) null));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30615);DateTimeUtils.setCurrentMillisFixed(7);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30616);assertEquals(false, interval37.isAfter((ReadableInterval) null));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30617);DateTimeUtils.setCurrentMillisFixed(8);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30618);assertEquals(false, interval37.isAfter((ReadableInterval) null));
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToInterval1() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30619);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11u3ccmnmj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testToInterval1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30619,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11u3ccmnmj(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30619);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30620);Interval test = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30621);Interval result = test.toInterval();
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30622);assertSame(test, result);
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToMutableInterval1() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ukyyfanmn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testToMutableInterval1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30623,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ukyyfanmn(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30623);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30624);Interval test = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30625);MutableInterval result = test.toMutableInterval();
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30626);assertEquals(test, result);
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToPeriod() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30627);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cvhk17nmr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testToPeriod",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30627,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cvhk17nmr(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30627);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30628);DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10, COPTIC_PARIS);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30629);DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18, COPTIC_PARIS);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30630);Interval base = new Interval(dt1, dt2);
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30631);Period test = base.toPeriod();
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30632);Period expected = new Period(dt1, dt2, PeriodType.standard());
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30633);assertEquals(expected, test);
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToPeriod_PeriodType1() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30634);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iiup2snmy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testToPeriod_PeriodType1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30634,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iiup2snmy(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30634);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30635);DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10, COPTIC_PARIS);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30636);DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18, COPTIC_PARIS);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30637);Interval base = new Interval(dt1, dt2);
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30638);Period test = base.toPeriod(null);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30639);Period expected = new Period(dt1, dt2, PeriodType.standard());
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30640);assertEquals(expected, test);
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testToPeriod_PeriodType2() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30641);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f9uqabnn5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testToPeriod_PeriodType2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30641,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f9uqabnn5(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30641);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30642);DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30643);DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30644);Interval base = new Interval(dt1, dt2);
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30645);Period test = base.toPeriod(PeriodType.yearWeekDayTime());
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30646);Period expected = new Period(dt1, dt2, PeriodType.yearWeekDayTime());
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30647);assertEquals(expected, test);
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSerialization() throws Exception {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30648);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on9nnc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30648,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on9nnc() throws Exception{try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30648);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30649);Interval test = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30650);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30651);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30652);oos.writeObject(test);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30653);byte[] bytes = baos.toByteArray();
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30654);oos.close();
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30655);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30656);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30657);Interval result = (Interval) ois.readObject();
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30658);ois.close();
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30659);assertEquals(test, result);
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdidnno();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30660,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdidnno(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30660);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30661);DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10, DateTimeZone.UTC);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30662);DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18, DateTimeZone.UTC);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30663);Interval test = new Interval(dt1, dt2);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30664);assertEquals("2004-06-09T07:08:09.010Z/2005-08-13T12:14:16.018Z", test.toString());
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testToString_reparse() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ulq55ynnt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testToString_reparse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30665,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ulq55ynnt(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30665);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30666);DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10, DateTimeZone.getDefault());
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30667);DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18, DateTimeZone.getDefault());
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30668);Interval test = new Interval(dt1, dt2);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30669);assertEquals(test, new Interval(test.toString()));
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithChronology1() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30670);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15gm8rsnny();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithChronology1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30670,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15gm8rsnny(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30670);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30671);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30672);Interval test = base.withChronology(BuddhistChronology.getInstance());
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30673);assertEquals(new Interval(TEST_TIME1, TEST_TIME2, BuddhistChronology.getInstance()), test);
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testWithChronology2() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30674);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18pm7k9no2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithChronology2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30674,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18pm7k9no2(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30674);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30675);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30676);Interval test = base.withChronology(null);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30677);assertEquals(new Interval(TEST_TIME1, TEST_TIME2, ISOChronology.getInstance()), test);
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testWithChronology3() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30678);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bym6cqno6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithChronology3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30678,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bym6cqno6(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30678);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30679);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30680);Interval test = base.withChronology(COPTIC_PARIS);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30681);assertSame(base, test);
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithStartMillis_long1() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30682);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kjz5oznoa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithStartMillis_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30682,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kjz5oznoa(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30682);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30683);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30684);Interval test = base.withStartMillis(TEST_TIME1 - 1);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30685);assertEquals(new Interval(TEST_TIME1 - 1, TEST_TIME2, COPTIC_PARIS), test);
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testWithStartMillis_long2() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30686);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1haz6winoe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithStartMillis_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30686,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1haz6winoe(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30686);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30687);Interval test = new Interval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30688);try {
            __CLR4_4_1n3tn3tlc8azuy6.R.inc(30689);test.withStartMillis(TEST_TIME2 + 1);
            __CLR4_4_1n3tn3tlc8azuy6.R.inc(30690);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testWithStartMillis_long3() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30691);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e1z841noj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithStartMillis_long3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30691,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e1z841noj(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30691);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30692);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30693);Interval test = base.withStartMillis(TEST_TIME1);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30694);assertSame(base, test);
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithStartInstant_RI1() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30695);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wxvvdznon();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithStartInstant_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30695,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wxvvdznon(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30695);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30696);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30697);Interval test = base.withStart(new Instant(TEST_TIME1 - 1));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30698);assertEquals(new Interval(TEST_TIME1 - 1, TEST_TIME2, COPTIC_PARIS), test);
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testWithStartInstant_RI2() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30699);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tovwlinor();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithStartInstant_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30699,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tovwlinor(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30699);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30700);Interval test = new Interval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30701);try {
            __CLR4_4_1n3tn3tlc8azuy6.R.inc(30702);test.withStart(new Instant(TEST_TIME2 + 1));
            __CLR4_4_1n3tn3tlc8azuy6.R.inc(30703);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testWithStartInstant_RI3() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30704);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qfvxt1now();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithStartInstant_RI3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30704,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qfvxt1now(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30704);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30705);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30706);Interval test = base.withStart(null);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30707);assertEquals(new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS), test);
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithEndMillis_long1() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30708);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_136m6vanp0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithEndMillis_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30708,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_136m6vanp0(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30708);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30709);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30710);Interval test = base.withEndMillis(TEST_TIME2 - 1);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30711);assertEquals(new Interval(TEST_TIME1, TEST_TIME2 - 1, COPTIC_PARIS), test);
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testWithEndMillis_long2() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30712);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16fm5nrnp4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithEndMillis_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30712,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16fm5nrnp4(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30712);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30713);Interval test = new Interval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30714);try {
            __CLR4_4_1n3tn3tlc8azuy6.R.inc(30715);test.withEndMillis(TEST_TIME1 - 1);
            __CLR4_4_1n3tn3tlc8azuy6.R.inc(30716);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testWithEndMillis_long3() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30717);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19om4g8np9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithEndMillis_long3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30717,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19om4g8np9(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30717);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30718);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30719);Interval test = base.withEndMillis(TEST_TIME2);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30720);assertSame(base, test);
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithEndInstant_RI1() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30721);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pausgwnpd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithEndInstant_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30721,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pausgwnpd(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30721);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30722);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30723);Interval test = base.withEnd(new Instant(TEST_TIME2 - 1));
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30724);assertEquals(new Interval(TEST_TIME1, TEST_TIME2 - 1, COPTIC_PARIS), test);
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testWithEndInstant_RI2() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m1utofnph();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithEndInstant_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30725,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m1utofnph(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30725);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30726);Interval test = new Interval(TEST_TIME1, TEST_TIME2);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30727);try {
            __CLR4_4_1n3tn3tlc8azuy6.R.inc(30728);test.withEnd(new Instant(TEST_TIME1 - 1));
            __CLR4_4_1n3tn3tlc8azuy6.R.inc(30729);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testWithEndInstant_RI3() {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1isuuvynpm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithEndInstant_RI3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30730,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1isuuvynpm(){try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30730);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30731);Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30732);Interval test = base.withEnd(null);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30733);assertEquals(new Interval(TEST_TIME1, TEST_TIME_NOW, COPTIC_PARIS), test);
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithDurationAfterStart1() throws Throwable {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30734);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xcst5ynpq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithDurationAfterStart1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30734,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xcst5ynpq() throws Throwable{try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30734);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30735);Duration dur = new Duration(TEST_TIME2 - TEST_TIME_NOW);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30736);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME_NOW, COPTIC_PARIS);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30737);Interval test = base.withDurationAfterStart(dur);
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30738);assertEquals(new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS), test);
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testWithDurationAfterStart2() throws Throwable {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30739);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yfba0pnpv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithDurationAfterStart2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30739,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yfba0pnpv() throws Throwable{try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30739);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30740);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30741);Interval test = base.withDurationAfterStart(null);
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30742);assertEquals(new Interval(TEST_TIME_NOW, TEST_TIME_NOW, COPTIC_PARIS), test);
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testWithDurationAfterStart3() throws Throwable {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v6bb88npz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithDurationAfterStart3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30743,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v6bb88npz() throws Throwable{try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30743);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30744);Duration dur = new Duration(-1);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30745);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME_NOW);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30746);try {
            __CLR4_4_1n3tn3tlc8azuy6.R.inc(30747);base.withDurationAfterStart(dur);
            __CLR4_4_1n3tn3tlc8azuy6.R.inc(30748);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testWithDurationAfterStart4() throws Throwable {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30749);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rxbcfrnq5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithDurationAfterStart4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30749,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rxbcfrnq5() throws Throwable{try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30749);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30750);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30751);Interval test = base.withDurationAfterStart(base.toDuration());
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30752);assertSame(base, test);
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithDurationBeforeEnd1() throws Throwable {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30753);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14yew8onq9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithDurationBeforeEnd1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30753,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14yew8onq9() throws Throwable{try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30753);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30754);Duration dur = new Duration(TEST_TIME_NOW - TEST_TIME1);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30755);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME_NOW, COPTIC_PARIS);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30756);Interval test = base.withDurationBeforeEnd(dur);
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30757);assertEquals(new Interval(TEST_TIME1, TEST_TIME_NOW, COPTIC_PARIS), test);
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testWithDurationBeforeEnd2() throws Throwable {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11pexg7nqe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithDurationBeforeEnd2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30758,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11pexg7nqe() throws Throwable{try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30758);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30759);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30760);Interval test = base.withDurationBeforeEnd(null);
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30761);assertEquals(new Interval(TEST_TIME2, TEST_TIME2, COPTIC_PARIS), test);
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testWithDurationBeforeEnd3() throws Throwable {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30762);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11jl1canqi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithDurationBeforeEnd3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30762,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11jl1canqi() throws Throwable{try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30762);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30763);Duration dur = new Duration(-1);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30764);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME_NOW);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30765);try {
            __CLR4_4_1n3tn3tlc8azuy6.R.inc(30766);base.withDurationBeforeEnd(dur);
            __CLR4_4_1n3tn3tlc8azuy6.R.inc(30767);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testWithDurationBeforeEnd4() throws Throwable {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30768);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14sl04rnqo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithDurationBeforeEnd4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30768,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14sl04rnqo() throws Throwable{try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30768);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30769);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30770);Interval test = base.withDurationBeforeEnd(base.toDuration());
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30771);assertSame(base, test);
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithPeriodAfterStart1() throws Throwable {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qlqc55nqs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithPeriodAfterStart1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30772,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qlqc55nqs() throws Throwable{try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30772);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30773);DateTime dt = new DateTime(TEST_TIME_NOW, COPTIC_PARIS);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30774);Period dur = new Period(0, 6, 0, 0, 1, 0, 0, 0);
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30775);Interval base = new Interval(dt, dt);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30776);Interval test = base.withPeriodAfterStart(dur);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30777);assertEquals(new Interval(dt, dur), test);
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testWithPeriodAfterStart2() throws Throwable {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tuqaxmnqy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithPeriodAfterStart2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30778,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tuqaxmnqy() throws Throwable{try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30778);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30779);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30780);Interval test = base.withPeriodAfterStart(null);
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30781);assertEquals(new Interval(TEST_TIME_NOW, TEST_TIME_NOW, COPTIC_PARIS), test);
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testWithPeriodAfterStart3() throws Throwable {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30782);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x3q9q3nr2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithPeriodAfterStart3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30782,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x3q9q3nr2() throws Throwable{try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30782);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30783);Period per = new Period(0, 0, 0, 0, 0, 0, 0, -1);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30784);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME_NOW);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30785);try {
            __CLR4_4_1n3tn3tlc8azuy6.R.inc(30786);base.withPeriodAfterStart(per);
            __CLR4_4_1n3tn3tlc8azuy6.R.inc(30787);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithPeriodBeforeEnd1() throws Throwable {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30788);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1av5ok5nr8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithPeriodBeforeEnd1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30788,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1av5ok5nr8() throws Throwable{try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30788);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30789);DateTime dt = new DateTime(TEST_TIME_NOW, COPTIC_PARIS);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30790);Period dur = new Period(0, 6, 0, 0, 1, 0, 0, 0);
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30791);Interval base = new Interval(dt, dt);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30792);Interval test = base.withPeriodBeforeEnd(dur);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30793);assertEquals(new Interval(dur, dt), test);
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testWithPeriodBeforeEnd2() throws Throwable {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e45ncmnre();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithPeriodBeforeEnd2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30794,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e45ncmnre() throws Throwable{try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30794);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30795);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30796);Interval test = base.withPeriodBeforeEnd(null);
        
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30797);assertEquals(new Interval(TEST_TIME2, TEST_TIME2, COPTIC_PARIS), test);
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

    public void testWithPeriodBeforeEnd3() throws Throwable {__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceStart(getClass().getName(),30798);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hd5m53nri();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n3tn3tlc8azuy6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n3tn3tlc8azuy6.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Basics.testWithPeriodBeforeEnd3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30798,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hd5m53nri() throws Throwable{try{__CLR4_4_1n3tn3tlc8azuy6.R.inc(30798);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30799);Period per = new Period(0, 0, 0, 0, 0, 0, 0, -1);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30800);Interval base = new Interval(TEST_TIME_NOW, TEST_TIME_NOW);
        __CLR4_4_1n3tn3tlc8azuy6.R.inc(30801);try {
            __CLR4_4_1n3tn3tlc8azuy6.R.inc(30802);base.withPeriodBeforeEnd(per);
            __CLR4_4_1n3tn3tlc8azuy6.R.inc(30803);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1n3tn3tlc8azuy6.R.flushNeeded();}}

}
