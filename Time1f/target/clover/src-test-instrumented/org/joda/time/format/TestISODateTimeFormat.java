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
package org.joda.time.format;

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Partial;

/**
 * This class is a Junit unit test for ISODateTimeFormat.
 *
 * @author Stephen Colebourne
 */
public class TestISODateTimeFormat extends TestCase {static class __CLR4_4_119yx19yxlc8azxha{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,59905,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_119yx19yxlc8azxha.R.inc(59577);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59578);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_119yx19yxlc8azxha.R.inc(59579);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59580);return new TestSuite(TestISODateTimeFormat.class);
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    public TestISODateTimeFormat(String name) {
        super(name);__CLR4_4_119yx19yxlc8azxha.R.inc(59582);try{__CLR4_4_119yx19yxlc8azxha.R.inc(59581);
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_119yx19yxlc8azxha.R.inc(59583);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59584);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59585);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_119yx19yxlc8azxha.R.inc(59586);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_119yx19yxlc8azxha.R.inc(59587);originalLocale = Locale.getDefault();
        __CLR4_4_119yx19yxlc8azxha.R.inc(59588);DateTimeZone.setDefault(LONDON);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59589);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_119yx19yxlc8azxha.R.inc(59590);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_119yx19yxlc8azxha.R.inc(59591);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59592);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_119yx19yxlc8azxha.R.inc(59593);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59594);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59595);Locale.setDefault(originalLocale);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59596);originalDateTimeZone = null;
        __CLR4_4_119yx19yxlc8azxha.R.inc(59597);originalTimeZone = null;
        __CLR4_4_119yx19yxlc8azxha.R.inc(59598);originalLocale = null;
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSubclassableConstructor() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59599);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pm293x19zj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testSubclassableConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59599,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pm293x19zj(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59599);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59600);ISODateTimeFormat f = new ISODateTimeFormat() {
            // test constructor is protected
        };
        __CLR4_4_119yx19yxlc8azxha.R.inc(59601);assertNotNull(f);
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormat_date() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59602);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ioowy319zm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_date",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59602,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ioowy319zm(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59602);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59603);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59604);assertEquals("2004-06-09", ISODateTimeFormat.date().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59605);dt = dt.withZone(LONDON);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59606);assertEquals("2004-06-09", ISODateTimeFormat.date().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59607);dt = dt.withZone(PARIS);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59608);assertEquals("2004-06-09", ISODateTimeFormat.date().print(dt));
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    public void testFormat_date_partial() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59609);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_111i2b719zt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_date_partial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59609,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_111i2b719zt(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59609);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59610);Partial dt = new Partial(
                new DateTimeFieldType[] {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth()},
                new int[] {2004, 6, 9});
        __CLR4_4_119yx19yxlc8azxha.R.inc(59611);assertEquals("2004-06-09", ISODateTimeFormat.date().print(dt));
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    public void testFormat_time() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1da1hje19zw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_time",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59612,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1da1hje19zw(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59612);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59613);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59614);assertEquals("10:20:30.040Z", ISODateTimeFormat.time().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59615);dt = dt.withZone(LONDON);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59616);assertEquals("11:20:30.040+01:00", ISODateTimeFormat.time().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59617);dt = dt.withZone(PARIS);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59618);assertEquals("12:20:30.040+02:00", ISODateTimeFormat.time().print(dt));
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    public void testFormat_time_partial() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59619);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tlxb781a03();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_time_partial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59619,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tlxb781a03(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59619);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59620);Partial dt = new Partial(
                new DateTimeFieldType[] {DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour(),
                        DateTimeFieldType.secondOfMinute(), DateTimeFieldType.millisOfSecond()},
                new int[] {10, 20, 30, 40});
        __CLR4_4_119yx19yxlc8azxha.R.inc(59621);assertEquals("10:20:30.040", ISODateTimeFormat.time().print(dt));
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    public void testFormat_timeNoMillis() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59622);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dc49qn1a06();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_timeNoMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59622,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dc49qn1a06(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59622);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59623);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59624);assertEquals("10:20:30Z", ISODateTimeFormat.timeNoMillis().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59625);dt = dt.withZone(LONDON);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59626);assertEquals("11:20:30+01:00", ISODateTimeFormat.timeNoMillis().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59627);dt = dt.withZone(PARIS);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59628);assertEquals("12:20:30+02:00", ISODateTimeFormat.timeNoMillis().print(dt));
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    public void testFormat_timeNoMillis_partial() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59629);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_126x6q51a0d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_timeNoMillis_partial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59629,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_126x6q51a0d(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59629);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59630);Partial dt = new Partial(
                new DateTimeFieldType[] {DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour(),
                        DateTimeFieldType.secondOfMinute(), DateTimeFieldType.millisOfSecond()},
                new int[] {10, 20, 30, 40});
        __CLR4_4_119yx19yxlc8azxha.R.inc(59631);assertEquals("10:20:30", ISODateTimeFormat.timeNoMillis().print(dt));
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    public void testFormat_tTime() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1grnioe1a0g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_tTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59632,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1grnioe1a0g(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59632);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59633);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59634);assertEquals("T10:20:30.040Z", ISODateTimeFormat.tTime().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59635);dt = dt.withZone(LONDON);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59636);assertEquals("T11:20:30.040+01:00", ISODateTimeFormat.tTime().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59637);dt = dt.withZone(PARIS);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59638);assertEquals("T12:20:30.040+02:00", ISODateTimeFormat.tTime().print(dt));
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    public void testFormat_tTimeNoMillis() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12qgzaf1a0n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_tTimeNoMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59639,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12qgzaf1a0n(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59639);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59640);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59641);assertEquals("T10:20:30Z", ISODateTimeFormat.tTimeNoMillis().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59642);dt = dt.withZone(LONDON);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59643);assertEquals("T11:20:30+01:00", ISODateTimeFormat.tTimeNoMillis().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59644);dt = dt.withZone(PARIS);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59645);assertEquals("T12:20:30+02:00", ISODateTimeFormat.tTimeNoMillis().print(dt));
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    public void testFormat_dateTime() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59646);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xxdvrs1a0u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_dateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59646,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xxdvrs1a0u(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59646);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59647);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59648);assertEquals("2004-06-09T10:20:30.040Z", ISODateTimeFormat.dateTime().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59649);dt = dt.withZone(LONDON);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59650);assertEquals("2004-06-09T11:20:30.040+01:00", ISODateTimeFormat.dateTime().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59651);dt = dt.withZone(PARIS);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59652);assertEquals("2004-06-09T12:20:30.040+02:00", ISODateTimeFormat.dateTime().print(dt));
        
//        dt = dt.withZone(LONDON);
//        assertEquals("2004-06-09T11:20:30.040+01:00", ISODateTimeFormat.getInstance(PARIS).dateTime().print(dt));
//        
//        dt = dt.withZone(LONDON);
//        assertEquals("2004-06-09T12:20:30.040+02:00", ISODateTimeFormat.dateTime().print(dt.getMillis(), PARIS));
//        
//        dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, CopticChronology.getInstance());
//        assertEquals("2288-02-19T10:20:30.040Z", ISODateTimeFormat.dateTime().print(dt));
//        
//        dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, CopticChronology.getInstance());
//        assertEquals("2004-06-09T10:20:30.040Z", ISODateTimeFormat.getInstance(CopticChronology.getInstance()).dateTime().print(dt));
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    public void testFormat_dateTimeNoMillis() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59653);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vj1b9d1a11();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_dateTimeNoMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59653,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vj1b9d1a11(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59653);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59654);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59655);assertEquals("2004-06-09T10:20:30Z", ISODateTimeFormat.dateTimeNoMillis().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59656);dt = dt.withZone(LONDON);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59657);assertEquals("2004-06-09T11:20:30+01:00", ISODateTimeFormat.dateTimeNoMillis().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59658);dt = dt.withZone(PARIS);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59659);assertEquals("2004-06-09T12:20:30+02:00", ISODateTimeFormat.dateTimeNoMillis().print(dt));
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    public void testFormat_ordinalDate() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18tgq8g1a18();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_ordinalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59660,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18tgq8g1a18(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59660);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59661);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59662);assertEquals("2004-161", ISODateTimeFormat.ordinalDate().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59663);dt = dt.withZone(LONDON);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59664);assertEquals("2004-161", ISODateTimeFormat.ordinalDate().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59665);dt = dt.withZone(PARIS);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59666);assertEquals("2004-161", ISODateTimeFormat.ordinalDate().print(dt));
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    public void testFormat_ordinalDateTime() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59667);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p7r0d91a1f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_ordinalDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59667,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p7r0d91a1f(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59667);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59668);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59669);assertEquals("2004-161T10:20:30.040Z", ISODateTimeFormat.ordinalDateTime().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59670);dt = dt.withZone(LONDON);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59671);assertEquals("2004-161T11:20:30.040+01:00", ISODateTimeFormat.ordinalDateTime().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59672);dt = dt.withZone(PARIS);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59673);assertEquals("2004-161T12:20:30.040+02:00", ISODateTimeFormat.ordinalDateTime().print(dt));
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    public void testFormat_ordinalDateTimeNoMillis() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59674);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ahdmbo1a1m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_ordinalDateTimeNoMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59674,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ahdmbo1a1m(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59674);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59675);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59676);assertEquals("2004-161T10:20:30Z", ISODateTimeFormat.ordinalDateTimeNoMillis().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59677);dt = dt.withZone(LONDON);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59678);assertEquals("2004-161T11:20:30+01:00", ISODateTimeFormat.ordinalDateTimeNoMillis().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59679);dt = dt.withZone(PARIS);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59680);assertEquals("2004-161T12:20:30+02:00", ISODateTimeFormat.ordinalDateTimeNoMillis().print(dt));
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    public void testFormat_weekDate() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59681);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zb90f1a1t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_weekDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59681,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zb90f1a1t(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59681);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59682);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59683);assertEquals("2004-W24-3", ISODateTimeFormat.weekDate().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59684);dt = dt.withZone(LONDON);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59685);assertEquals("2004-W24-3", ISODateTimeFormat.weekDate().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59686);dt = dt.withZone(PARIS);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59687);assertEquals("2004-W24-3", ISODateTimeFormat.weekDate().print(dt));
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    public void testFormat_weekDateTime() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59688);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_163ee6s1a20();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_weekDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59688,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_163ee6s1a20(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59688);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59689);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59690);assertEquals("2004-W24-3T10:20:30.040Z", ISODateTimeFormat.weekDateTime().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59691);dt = dt.withZone(LONDON);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59692);assertEquals("2004-W24-3T11:20:30.040+01:00", ISODateTimeFormat.weekDateTime().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59693);dt = dt.withZone(PARIS);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59694);assertEquals("2004-W24-3T12:20:30.040+02:00", ISODateTimeFormat.weekDateTime().print(dt));
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    public void testFormat_weekDateTimeNoMillis() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59695);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sgklzn1a27();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_weekDateTimeNoMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59695,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sgklzn1a27(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59695);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59696);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59697);assertEquals("2004-W24-3T10:20:30Z", ISODateTimeFormat.weekDateTimeNoMillis().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59698);dt = dt.withZone(LONDON);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59699);assertEquals("2004-W24-3T11:20:30+01:00", ISODateTimeFormat.weekDateTimeNoMillis().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59700);dt = dt.withZone(PARIS);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59701);assertEquals("2004-W24-3T12:20:30+02:00", ISODateTimeFormat.weekDateTimeNoMillis().print(dt));
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormat_basicDate() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59702);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q9uf4j1a2e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59702,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q9uf4j1a2e(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59702);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59703);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59704);assertEquals("20040609", ISODateTimeFormat.basicDate().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59705);dt = dt.withZone(LONDON);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59706);assertEquals("20040609", ISODateTimeFormat.basicDate().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59707);dt = dt.withZone(PARIS);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59708);assertEquals("20040609", ISODateTimeFormat.basicDate().print(dt));
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    public void testFormat_basicTime() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vohuj81a2l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59709,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vohuj81a2l(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59709);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59710);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59711);assertEquals("102030.040Z", ISODateTimeFormat.basicTime().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59712);dt = dt.withZone(LONDON);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59713);assertEquals("112030.040+0100", ISODateTimeFormat.basicTime().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59714);dt = dt.withZone(PARIS);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59715);assertEquals("122030.040+0200", ISODateTimeFormat.basicTime().print(dt));
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    public void testFormat_basicTimeNoMillis() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59716);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11gyuct1a2s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicTimeNoMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59716,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11gyuct1a2s(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59716);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59717);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59718);assertEquals("102030Z", ISODateTimeFormat.basicTimeNoMillis().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59719);dt = dt.withZone(LONDON);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59720);assertEquals("112030+0100", ISODateTimeFormat.basicTimeNoMillis().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59721);dt = dt.withZone(PARIS);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59722);assertEquals("122030+0200", ISODateTimeFormat.basicTimeNoMillis().print(dt));
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    public void testFormat_basicTTime() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a3y6kw1a2z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicTTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59723,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a3y6kw1a2z(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59723);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59724);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59725);assertEquals("T102030.040Z", ISODateTimeFormat.basicTTime().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59726);dt = dt.withZone(LONDON);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59727);assertEquals("T112030.040+0100", ISODateTimeFormat.basicTTime().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59728);dt = dt.withZone(PARIS);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59729);assertEquals("T122030.040+0200", ISODateTimeFormat.basicTTime().print(dt));
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    public void testFormat_basicTTimeNoMillis() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19xmzqv1a36();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicTTimeNoMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59730,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19xmzqv1a36(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59730);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59731);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59732);assertEquals("T102030Z", ISODateTimeFormat.basicTTimeNoMillis().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59733);dt = dt.withZone(LONDON);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59734);assertEquals("T112030+0100", ISODateTimeFormat.basicTTimeNoMillis().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59735);dt = dt.withZone(PARIS);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59736);assertEquals("T122030+0200", ISODateTimeFormat.basicTTimeNoMillis().print(dt));
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    public void testFormat_basicDateTime() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kqbsqi1a3d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59737,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kqbsqi1a3d(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59737);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59738);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59739);assertEquals("20040609T102030.040Z", ISODateTimeFormat.basicDateTime().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59740);dt = dt.withZone(LONDON);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59741);assertEquals("20040609T112030.040+0100", ISODateTimeFormat.basicDateTime().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59742);dt = dt.withZone(PARIS);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59743);assertEquals("20040609T122030.040+0200", ISODateTimeFormat.basicDateTime().print(dt));
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    public void testFormat_basicDateTimeNoMillis() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59744);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p9h0bl1a3k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicDateTimeNoMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59744,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p9h0bl1a3k(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59744);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59745);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59746);assertEquals("20040609T102030Z", ISODateTimeFormat.basicDateTimeNoMillis().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59747);dt = dt.withZone(LONDON);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59748);assertEquals("20040609T112030+0100", ISODateTimeFormat.basicDateTimeNoMillis().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59749);dt = dt.withZone(PARIS);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59750);assertEquals("20040609T122030+0200", ISODateTimeFormat.basicDateTimeNoMillis().print(dt));
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    public void testFormat_basicOrdinalDate() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59751);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tr1ksy1a3r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicOrdinalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59751,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tr1ksy1a3r(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59751);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59752);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59753);assertEquals("2004161", ISODateTimeFormat.basicOrdinalDate().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59754);dt = dt.withZone(LONDON);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59755);assertEquals("2004161", ISODateTimeFormat.basicOrdinalDate().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59756);dt = dt.withZone(PARIS);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59757);assertEquals("2004161", ISODateTimeFormat.basicOrdinalDate().print(dt));
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    public void testFormat_basicOrdinalDateTime() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ghk69x1a3y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicOrdinalDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59758,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ghk69x1a3y(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59758);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59759);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59760);assertEquals("2004161T102030.040Z", ISODateTimeFormat.basicOrdinalDateTime().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59761);dt = dt.withZone(LONDON);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59762);assertEquals("2004161T112030.040+0100", ISODateTimeFormat.basicOrdinalDateTime().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59763);dt = dt.withZone(PARIS);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59764);assertEquals("2004161T122030.040+0200", ISODateTimeFormat.basicOrdinalDateTime().print(dt));
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    public void testFormat_basicOrdinalDateTimeNoMillis() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17shmvy1a45();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicOrdinalDateTimeNoMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59765,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17shmvy1a45(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59765);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59766);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59767);assertEquals("2004161T102030Z", ISODateTimeFormat.basicOrdinalDateTimeNoMillis().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59768);dt = dt.withZone(LONDON);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59769);assertEquals("2004161T112030+0100", ISODateTimeFormat.basicOrdinalDateTimeNoMillis().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59770);dt = dt.withZone(PARIS);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59771);assertEquals("2004161T122030+0200", ISODateTimeFormat.basicOrdinalDateTimeNoMillis().print(dt));
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    public void testFormat_basicWeekDate() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c7qu0v1a4c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicWeekDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59772,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c7qu0v1a4c(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59772);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59773);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59774);assertEquals("2004W243", ISODateTimeFormat.basicWeekDate().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59775);dt = dt.withZone(LONDON);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59776);assertEquals("2004W243", ISODateTimeFormat.basicWeekDate().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59777);dt = dt.withZone(PARIS);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59778);assertEquals("2004W243", ISODateTimeFormat.basicWeekDate().print(dt));
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    public void testFormat_basicWeekDateTime() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59779);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15rr1721a4j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicWeekDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59779,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15rr1721a4j(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59779);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59780);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59781);assertEquals("2004W243T102030.040Z", ISODateTimeFormat.basicWeekDateTime().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59782);dt = dt.withZone(LONDON);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59783);assertEquals("2004W243T112030.040+0100", ISODateTimeFormat.basicWeekDateTime().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59784);dt = dt.withZone(PARIS);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59785);assertEquals("2004W243T122030.040+0200", ISODateTimeFormat.basicWeekDateTime().print(dt));
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    public void testFormat_basicWeekDateTimeNoMillis() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59786);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rlotqj1a4q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicWeekDateTimeNoMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59786,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rlotqj1a4q(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59786);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59787);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59788);assertEquals("2004W243T102030Z", ISODateTimeFormat.basicWeekDateTimeNoMillis().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59789);dt = dt.withZone(LONDON);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59790);assertEquals("2004W243T112030+0100", ISODateTimeFormat.basicWeekDateTimeNoMillis().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59791);dt = dt.withZone(PARIS);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59792);assertEquals("2004W243T122030+0200", ISODateTimeFormat.basicWeekDateTimeNoMillis().print(dt));
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormat_year() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59793);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fu0epm1a4x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_year",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59793,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fu0epm1a4x(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59793);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59794);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59795);assertEquals("2004", ISODateTimeFormat.year().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59796);dt = dt.withZone(LONDON);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59797);assertEquals("2004", ISODateTimeFormat.year().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59798);dt = dt.withZone(PARIS);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59799);assertEquals("2004", ISODateTimeFormat.year().print(dt));
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    public void testFormat_yearMonth() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z5yuuk1a54();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_yearMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59800,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z5yuuk1a54(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59800);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59801);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59802);assertEquals("2004-06", ISODateTimeFormat.yearMonth().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59803);dt = dt.withZone(LONDON);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59804);assertEquals("2004-06", ISODateTimeFormat.yearMonth().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59805);dt = dt.withZone(PARIS);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59806);assertEquals("2004-06", ISODateTimeFormat.yearMonth().print(dt));
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    public void testFormat_yearMonthDay() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jdvnca1a5b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_yearMonthDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59807,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jdvnca1a5b(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59807);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59808);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59809);assertEquals("2004-06-09", ISODateTimeFormat.yearMonthDay().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59810);dt = dt.withZone(LONDON);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59811);assertEquals("2004-06-09", ISODateTimeFormat.yearMonthDay().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59812);dt = dt.withZone(PARIS);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59813);assertEquals("2004-06-09", ISODateTimeFormat.yearMonthDay().print(dt));
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    public void testFormat_weekyear() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59814);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bcb9im1a5i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_weekyear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59814,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bcb9im1a5i(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59814);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59815);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59816);assertEquals("2004", ISODateTimeFormat.weekyear().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59817);dt = dt.withZone(LONDON);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59818);assertEquals("2004", ISODateTimeFormat.weekyear().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59819);dt = dt.withZone(PARIS);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59820);assertEquals("2004", ISODateTimeFormat.weekyear().print(dt));
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    public void testFormat_weekyearWeek() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59821);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a2co3m1a5p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_weekyearWeek",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59821,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a2co3m1a5p(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59821);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59822);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59823);assertEquals("2004-W24", ISODateTimeFormat.weekyearWeek().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59824);dt = dt.withZone(LONDON);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59825);assertEquals("2004-W24", ISODateTimeFormat.weekyearWeek().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59826);dt = dt.withZone(PARIS);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59827);assertEquals("2004-W24", ISODateTimeFormat.weekyearWeek().print(dt));
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    public void testFormat_weekyearWeekDay() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59828);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14htcx41a5w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_weekyearWeekDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59828,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14htcx41a5w(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59828);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59829);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59830);assertEquals("2004-W24-3", ISODateTimeFormat.weekyearWeekDay().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59831);dt = dt.withZone(LONDON);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59832);assertEquals("2004-W24-3", ISODateTimeFormat.weekyearWeekDay().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59833);dt = dt.withZone(PARIS);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59834);assertEquals("2004-W24-3", ISODateTimeFormat.weekyearWeekDay().print(dt));
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormat_hour() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59835);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19588jl1a63();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_hour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59835,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19588jl1a63(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59835);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59836);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59837);assertEquals("10", ISODateTimeFormat.hour().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59838);dt = dt.withZone(LONDON);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59839);assertEquals("11", ISODateTimeFormat.hour().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59840);dt = dt.withZone(PARIS);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59841);assertEquals("12", ISODateTimeFormat.hour().print(dt));
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    public void testFormat_hourMinute() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59842);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vyuxzf1a6a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_hourMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59842,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vyuxzf1a6a(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59842);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59843);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59844);assertEquals("10:20", ISODateTimeFormat.hourMinute().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59845);dt = dt.withZone(LONDON);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59846);assertEquals("11:20", ISODateTimeFormat.hourMinute().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59847);dt = dt.withZone(PARIS);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59848);assertEquals("12:20", ISODateTimeFormat.hourMinute().print(dt));
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    public void testFormat_hourMinuteSecond() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1duc4xj1a6h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_hourMinuteSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59849,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1duc4xj1a6h(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59849);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59850);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59851);assertEquals("10:20:30", ISODateTimeFormat.hourMinuteSecond().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59852);dt = dt.withZone(LONDON);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59853);assertEquals("11:20:30", ISODateTimeFormat.hourMinuteSecond().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59854);dt = dt.withZone(PARIS);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59855);assertEquals("12:20:30", ISODateTimeFormat.hourMinuteSecond().print(dt));
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    public void testFormat_hourMinuteSecondMillis() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59856);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dshmfl1a6o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_hourMinuteSecondMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59856,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dshmfl1a6o(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59856);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59857);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59858);assertEquals("10:20:30.040", ISODateTimeFormat.hourMinuteSecondMillis().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59859);dt = dt.withZone(LONDON);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59860);assertEquals("11:20:30.040", ISODateTimeFormat.hourMinuteSecondMillis().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59861);dt = dt.withZone(PARIS);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59862);assertEquals("12:20:30.040", ISODateTimeFormat.hourMinuteSecondMillis().print(dt));
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    public void testFormat_hourMinuteSecondFraction() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59863);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1623l631a6v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_hourMinuteSecondFraction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59863,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1623l631a6v(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59863);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59864);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59865);assertEquals("10:20:30.040", ISODateTimeFormat.hourMinuteSecondFraction().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59866);dt = dt.withZone(LONDON);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59867);assertEquals("11:20:30.040", ISODateTimeFormat.hourMinuteSecondFraction().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59868);dt = dt.withZone(PARIS);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59869);assertEquals("12:20:30.040", ISODateTimeFormat.hourMinuteSecondFraction().print(dt));
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFormat_dateHour() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59870);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tskmrz1a72();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_dateHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59870,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tskmrz1a72(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59870);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59871);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59872);assertEquals("2004-06-09T10", ISODateTimeFormat.dateHour().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59873);dt = dt.withZone(LONDON);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59874);assertEquals("2004-06-09T11", ISODateTimeFormat.dateHour().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59875);dt = dt.withZone(PARIS);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59876);assertEquals("2004-06-09T12", ISODateTimeFormat.dateHour().print(dt));
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    public void testFormat_dateHourMinute() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59877);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r2ia6b1a79();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_dateHourMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59877,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r2ia6b1a79(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59877);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59878);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59879);assertEquals("2004-06-09T10:20", ISODateTimeFormat.dateHourMinute().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59880);dt = dt.withZone(LONDON);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59881);assertEquals("2004-06-09T11:20", ISODateTimeFormat.dateHourMinute().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59882);dt = dt.withZone(PARIS);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59883);assertEquals("2004-06-09T12:20", ISODateTimeFormat.dateHourMinute().print(dt));
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    public void testFormat_dateHourMinuteSecond() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59884);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bm2fx31a7g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_dateHourMinuteSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59884,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bm2fx31a7g(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59884);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59885);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59886);assertEquals("2004-06-09T10:20:30", ISODateTimeFormat.dateHourMinuteSecond().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59887);dt = dt.withZone(LONDON);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59888);assertEquals("2004-06-09T11:20:30", ISODateTimeFormat.dateHourMinuteSecond().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59889);dt = dt.withZone(PARIS);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59890);assertEquals("2004-06-09T12:20:30", ISODateTimeFormat.dateHourMinuteSecond().print(dt));
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    public void testFormat_dateHourMinuteSecondMillis() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c2oxp1a7n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_dateHourMinuteSecondMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59891,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c2oxp1a7n(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59891);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59892);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59893);assertEquals("2004-06-09T10:20:30.040", ISODateTimeFormat.dateHourMinuteSecondMillis().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59894);dt = dt.withZone(LONDON);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59895);assertEquals("2004-06-09T11:20:30.040", ISODateTimeFormat.dateHourMinuteSecondMillis().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59896);dt = dt.withZone(PARIS);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59897);assertEquals("2004-06-09T12:20:30.040", ISODateTimeFormat.dateHourMinuteSecondMillis().print(dt));
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

    public void testFormat_dateHourMinuteSecondFraction() {__CLR4_4_119yx19yxlc8azxha.R.globalSliceStart(getClass().getName(),59898);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ezwlbt1a7u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119yx19yxlc8azxha.R.rethrow($CLV_t2$);}finally{__CLR4_4_119yx19yxlc8azxha.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_dateHourMinuteSecondFraction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59898,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ezwlbt1a7u(){try{__CLR4_4_119yx19yxlc8azxha.R.inc(59898);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59899);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59900);assertEquals("2004-06-09T10:20:30.040", ISODateTimeFormat.dateHourMinuteSecondFraction().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59901);dt = dt.withZone(LONDON);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59902);assertEquals("2004-06-09T11:20:30.040", ISODateTimeFormat.dateHourMinuteSecondFraction().print(dt));
        
        __CLR4_4_119yx19yxlc8azxha.R.inc(59903);dt = dt.withZone(PARIS);
        __CLR4_4_119yx19yxlc8azxha.R.inc(59904);assertEquals("2004-06-09T12:20:30.040", ISODateTimeFormat.dateHourMinuteSecondFraction().print(dt));
    }finally{__CLR4_4_119yx19yxlc8azxha.R.flushNeeded();}}

}
