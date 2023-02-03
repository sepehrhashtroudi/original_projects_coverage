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
package org.joda.time.convert;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.Interval;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInterval;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a JUnit test for ReadableIntervalConverter.
 *
 * @author Stephen Colebourne
 */
public class TestReadableIntervalConverter extends TestCase {static class __CLR4_4_116fe16felc8azwzx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,55076,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static Chronology JULIAN;
    private static Chronology ISO;
    
    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_116fe16felc8azwzx.R.inc(54986);
        __CLR4_4_116fe16felc8azwzx.R.inc(54987);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_116fe16felc8azwzx.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_116fe16felc8azwzx.R.inc(54988);
        __CLR4_4_116fe16felc8azwzx.R.inc(54989);return new TestSuite(TestReadableIntervalConverter.class);
    }finally{__CLR4_4_116fe16felc8azwzx.R.flushNeeded();}}

    public TestReadableIntervalConverter(String name) {
        super(name);__CLR4_4_116fe16felc8azwzx.R.inc(54991);try{__CLR4_4_116fe16felc8azwzx.R.inc(54990);
    }finally{__CLR4_4_116fe16felc8azwzx.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_116fe16felc8azwzx.R.inc(54992);
        __CLR4_4_116fe16felc8azwzx.R.inc(54993);JULIAN = JulianChronology.getInstance();
        __CLR4_4_116fe16felc8azwzx.R.inc(54994);ISO = ISOChronology.getInstance();
    }finally{__CLR4_4_116fe16felc8azwzx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSingleton() throws Exception {__CLR4_4_116fe16felc8azwzx.R.globalSliceStart(getClass().getName(),54995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jmk8jk16fn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116fe16felc8azwzx.R.rethrow($CLV_t2$);}finally{__CLR4_4_116fe16felc8azwzx.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableIntervalConverter.testSingleton",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54995,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jmk8jk16fn() throws Exception{try{__CLR4_4_116fe16felc8azwzx.R.inc(54995);
        __CLR4_4_116fe16felc8azwzx.R.inc(54996);Class cls = ReadableIntervalConverter.class;
        __CLR4_4_116fe16felc8azwzx.R.inc(54997);assertEquals(false, Modifier.isPublic(cls.getModifiers()));
        __CLR4_4_116fe16felc8azwzx.R.inc(54998);assertEquals(false, Modifier.isProtected(cls.getModifiers()));
        __CLR4_4_116fe16felc8azwzx.R.inc(54999);assertEquals(false, Modifier.isPrivate(cls.getModifiers()));
        
        __CLR4_4_116fe16felc8azwzx.R.inc(55000);Constructor con = cls.getDeclaredConstructor((Class[]) null);
        __CLR4_4_116fe16felc8azwzx.R.inc(55001);assertEquals(1, cls.getDeclaredConstructors().length);
        __CLR4_4_116fe16felc8azwzx.R.inc(55002);assertEquals(true, Modifier.isProtected(con.getModifiers()));
        
        __CLR4_4_116fe16felc8azwzx.R.inc(55003);Field fld = cls.getDeclaredField("INSTANCE");
        __CLR4_4_116fe16felc8azwzx.R.inc(55004);assertEquals(false, Modifier.isPublic(fld.getModifiers()));
        __CLR4_4_116fe16felc8azwzx.R.inc(55005);assertEquals(false, Modifier.isProtected(fld.getModifiers()));
        __CLR4_4_116fe16felc8azwzx.R.inc(55006);assertEquals(false, Modifier.isPrivate(fld.getModifiers()));
    }finally{__CLR4_4_116fe16felc8azwzx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSupportedType() throws Exception {__CLR4_4_116fe16felc8azwzx.R.globalSliceStart(getClass().getName(),55007);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fthtzx16fz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116fe16felc8azwzx.R.rethrow($CLV_t2$);}finally{__CLR4_4_116fe16felc8azwzx.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableIntervalConverter.testSupportedType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55007,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fthtzx16fz() throws Exception{try{__CLR4_4_116fe16felc8azwzx.R.inc(55007);
        __CLR4_4_116fe16felc8azwzx.R.inc(55008);assertEquals(ReadableInterval.class, ReadableIntervalConverter.INSTANCE.getSupportedType());
    }finally{__CLR4_4_116fe16felc8azwzx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetDurationMillis_Object() throws Exception {__CLR4_4_116fe16felc8azwzx.R.globalSliceStart(getClass().getName(),55009);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i0aumf16g1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116fe16felc8azwzx.R.rethrow($CLV_t2$);}finally{__CLR4_4_116fe16felc8azwzx.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableIntervalConverter.testGetDurationMillis_Object",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55009,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i0aumf16g1() throws Exception{try{__CLR4_4_116fe16felc8azwzx.R.inc(55009);
        __CLR4_4_116fe16felc8azwzx.R.inc(55010);Interval i = new Interval(100L, 223L);
        __CLR4_4_116fe16felc8azwzx.R.inc(55011);assertEquals(123L, ReadableIntervalConverter.INSTANCE.getDurationMillis(i));
    }finally{__CLR4_4_116fe16felc8azwzx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetPeriodType_Object() throws Exception {__CLR4_4_116fe16felc8azwzx.R.globalSliceStart(getClass().getName(),55012);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nzp2xm16g4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116fe16felc8azwzx.R.rethrow($CLV_t2$);}finally{__CLR4_4_116fe16felc8azwzx.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableIntervalConverter.testGetPeriodType_Object",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55012,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nzp2xm16g4() throws Exception{try{__CLR4_4_116fe16felc8azwzx.R.inc(55012);
        __CLR4_4_116fe16felc8azwzx.R.inc(55013);Interval i = new Interval(100L, 223L);
        __CLR4_4_116fe16felc8azwzx.R.inc(55014);assertEquals(PeriodType.standard(),
            ReadableIntervalConverter.INSTANCE.getPeriodType(i));
    }finally{__CLR4_4_116fe16felc8azwzx.R.flushNeeded();}}

    public void testSetIntoPeriod_Object1() throws Exception {__CLR4_4_116fe16felc8azwzx.R.globalSliceStart(getClass().getName(),55015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oyzab916g7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116fe16felc8azwzx.R.rethrow($CLV_t2$);}finally{__CLR4_4_116fe16felc8azwzx.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableIntervalConverter.testSetIntoPeriod_Object1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55015,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oyzab916g7() throws Exception{try{__CLR4_4_116fe16felc8azwzx.R.inc(55015);
        __CLR4_4_116fe16felc8azwzx.R.inc(55016);Interval i = new Interval(100L, 223L);
        __CLR4_4_116fe16felc8azwzx.R.inc(55017);MutablePeriod m = new MutablePeriod(PeriodType.millis());
        __CLR4_4_116fe16felc8azwzx.R.inc(55018);ReadableIntervalConverter.INSTANCE.setInto(m, i, null);
        __CLR4_4_116fe16felc8azwzx.R.inc(55019);assertEquals(0, m.getYears());
        __CLR4_4_116fe16felc8azwzx.R.inc(55020);assertEquals(0, m.getMonths());
        __CLR4_4_116fe16felc8azwzx.R.inc(55021);assertEquals(0, m.getWeeks());
        __CLR4_4_116fe16felc8azwzx.R.inc(55022);assertEquals(0, m.getDays());
        __CLR4_4_116fe16felc8azwzx.R.inc(55023);assertEquals(0, m.getHours());
        __CLR4_4_116fe16felc8azwzx.R.inc(55024);assertEquals(0, m.getMinutes());
        __CLR4_4_116fe16felc8azwzx.R.inc(55025);assertEquals(0, m.getSeconds());
        __CLR4_4_116fe16felc8azwzx.R.inc(55026);assertEquals(123, m.getMillis());
    }finally{__CLR4_4_116fe16felc8azwzx.R.flushNeeded();}}

    public void testSetIntoPeriod_Object2() throws Exception {__CLR4_4_116fe16felc8azwzx.R.globalSliceStart(getClass().getName(),55027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lpzbis16gj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116fe16felc8azwzx.R.rethrow($CLV_t2$);}finally{__CLR4_4_116fe16felc8azwzx.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableIntervalConverter.testSetIntoPeriod_Object2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55027,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lpzbis16gj() throws Exception{try{__CLR4_4_116fe16felc8azwzx.R.inc(55027);
        __CLR4_4_116fe16felc8azwzx.R.inc(55028);Interval i = new Interval(100L, 223L);
        __CLR4_4_116fe16felc8azwzx.R.inc(55029);MutablePeriod m = new MutablePeriod(PeriodType.millis());
        __CLR4_4_116fe16felc8azwzx.R.inc(55030);ReadableIntervalConverter.INSTANCE.setInto(m, i, CopticChronology.getInstance());
        __CLR4_4_116fe16felc8azwzx.R.inc(55031);assertEquals(0, m.getYears());
        __CLR4_4_116fe16felc8azwzx.R.inc(55032);assertEquals(0, m.getMonths());
        __CLR4_4_116fe16felc8azwzx.R.inc(55033);assertEquals(0, m.getWeeks());
        __CLR4_4_116fe16felc8azwzx.R.inc(55034);assertEquals(0, m.getDays());
        __CLR4_4_116fe16felc8azwzx.R.inc(55035);assertEquals(0, m.getHours());
        __CLR4_4_116fe16felc8azwzx.R.inc(55036);assertEquals(0, m.getMinutes());
        __CLR4_4_116fe16felc8azwzx.R.inc(55037);assertEquals(0, m.getSeconds());
        __CLR4_4_116fe16felc8azwzx.R.inc(55038);assertEquals(123, m.getMillis());
    }finally{__CLR4_4_116fe16felc8azwzx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testIsReadableInterval_Object_Chronology() throws Exception {__CLR4_4_116fe16felc8azwzx.R.globalSliceStart(getClass().getName(),55039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p8udfz16gv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116fe16felc8azwzx.R.rethrow($CLV_t2$);}finally{__CLR4_4_116fe16felc8azwzx.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableIntervalConverter.testIsReadableInterval_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55039,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p8udfz16gv() throws Exception{try{__CLR4_4_116fe16felc8azwzx.R.inc(55039);
        __CLR4_4_116fe16felc8azwzx.R.inc(55040);Interval i = new Interval(1234L, 5678L);
        __CLR4_4_116fe16felc8azwzx.R.inc(55041);assertEquals(true, ReadableIntervalConverter.INSTANCE.isReadableInterval(i, null));
    }finally{__CLR4_4_116fe16felc8azwzx.R.flushNeeded();}}

    public void testSetIntoInterval_Object1() throws Exception {__CLR4_4_116fe16felc8azwzx.R.globalSliceStart(getClass().getName(),55042);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13hs49b16gy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116fe16felc8azwzx.R.rethrow($CLV_t2$);}finally{__CLR4_4_116fe16felc8azwzx.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableIntervalConverter.testSetIntoInterval_Object1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55042,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13hs49b16gy() throws Exception{try{__CLR4_4_116fe16felc8azwzx.R.inc(55042);
        __CLR4_4_116fe16felc8azwzx.R.inc(55043);Interval i = new Interval(0L, 123L, CopticChronology.getInstance());
        __CLR4_4_116fe16felc8azwzx.R.inc(55044);MutableInterval m = new MutableInterval(-1000L, 1000L, BuddhistChronology.getInstance());
        __CLR4_4_116fe16felc8azwzx.R.inc(55045);ReadableIntervalConverter.INSTANCE.setInto(m, i, null);
        __CLR4_4_116fe16felc8azwzx.R.inc(55046);assertEquals(0L, m.getStartMillis());
        __CLR4_4_116fe16felc8azwzx.R.inc(55047);assertEquals(123L, m.getEndMillis());
        __CLR4_4_116fe16felc8azwzx.R.inc(55048);assertEquals(CopticChronology.getInstance(), m.getChronology());
    }finally{__CLR4_4_116fe16felc8azwzx.R.flushNeeded();}}

    public void testSetIntoInterval_Object2() throws Exception {__CLR4_4_116fe16felc8azwzx.R.globalSliceStart(getClass().getName(),55049);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16qs31s16h5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116fe16felc8azwzx.R.rethrow($CLV_t2$);}finally{__CLR4_4_116fe16felc8azwzx.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableIntervalConverter.testSetIntoInterval_Object2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55049,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16qs31s16h5() throws Exception{try{__CLR4_4_116fe16felc8azwzx.R.inc(55049);
        __CLR4_4_116fe16felc8azwzx.R.inc(55050);Interval i = new Interval(0L, 123L, CopticChronology.getInstance());
        __CLR4_4_116fe16felc8azwzx.R.inc(55051);MutableInterval m = new MutableInterval(-1000L, 1000L, BuddhistChronology.getInstance());
        __CLR4_4_116fe16felc8azwzx.R.inc(55052);ReadableIntervalConverter.INSTANCE.setInto(m, i, GJChronology.getInstance());
        __CLR4_4_116fe16felc8azwzx.R.inc(55053);assertEquals(0L, m.getStartMillis());
        __CLR4_4_116fe16felc8azwzx.R.inc(55054);assertEquals(123L, m.getEndMillis());
        __CLR4_4_116fe16felc8azwzx.R.inc(55055);assertEquals(GJChronology.getInstance(), m.getChronology());
    }finally{__CLR4_4_116fe16felc8azwzx.R.flushNeeded();}}

    public void testSetIntoInterval_Object3() throws Exception {__CLR4_4_116fe16felc8azwzx.R.globalSliceStart(getClass().getName(),55056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19zs1u916hc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116fe16felc8azwzx.R.rethrow($CLV_t2$);}finally{__CLR4_4_116fe16felc8azwzx.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableIntervalConverter.testSetIntoInterval_Object3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55056,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19zs1u916hc() throws Exception{try{__CLR4_4_116fe16felc8azwzx.R.inc(55056);
        __CLR4_4_116fe16felc8azwzx.R.inc(55057);MutableInterval i = new MutableInterval(0L, 123L) {
            public Chronology getChronology() {try{__CLR4_4_116fe16felc8azwzx.R.inc(55058);
                __CLR4_4_116fe16felc8azwzx.R.inc(55059);return null; // bad
            }finally{__CLR4_4_116fe16felc8azwzx.R.flushNeeded();}}
        };
        __CLR4_4_116fe16felc8azwzx.R.inc(55060);MutableInterval m = new MutableInterval(-1000L, 1000L, BuddhistChronology.getInstance());
        __CLR4_4_116fe16felc8azwzx.R.inc(55061);ReadableIntervalConverter.INSTANCE.setInto(m, i, GJChronology.getInstance());
        __CLR4_4_116fe16felc8azwzx.R.inc(55062);assertEquals(0L, m.getStartMillis());
        __CLR4_4_116fe16felc8azwzx.R.inc(55063);assertEquals(123L, m.getEndMillis());
        __CLR4_4_116fe16felc8azwzx.R.inc(55064);assertEquals(GJChronology.getInstance(), m.getChronology());
    }finally{__CLR4_4_116fe16felc8azwzx.R.flushNeeded();}}

    public void testSetIntoInterval_Object4() throws Exception {__CLR4_4_116fe16felc8azwzx.R.globalSliceStart(getClass().getName(),55065);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d8s0mq16hl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116fe16felc8azwzx.R.rethrow($CLV_t2$);}finally{__CLR4_4_116fe16felc8azwzx.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableIntervalConverter.testSetIntoInterval_Object4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55065,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d8s0mq16hl() throws Exception{try{__CLR4_4_116fe16felc8azwzx.R.inc(55065);
        __CLR4_4_116fe16felc8azwzx.R.inc(55066);MutableInterval i = new MutableInterval(0L, 123L) {
            public Chronology getChronology() {try{__CLR4_4_116fe16felc8azwzx.R.inc(55067);
                __CLR4_4_116fe16felc8azwzx.R.inc(55068);return null; // bad
            }finally{__CLR4_4_116fe16felc8azwzx.R.flushNeeded();}}
        };
        __CLR4_4_116fe16felc8azwzx.R.inc(55069);MutableInterval m = new MutableInterval(-1000L, 1000L, BuddhistChronology.getInstance());
        __CLR4_4_116fe16felc8azwzx.R.inc(55070);ReadableIntervalConverter.INSTANCE.setInto(m, i, null);
        __CLR4_4_116fe16felc8azwzx.R.inc(55071);assertEquals(0L, m.getStartMillis());
        __CLR4_4_116fe16felc8azwzx.R.inc(55072);assertEquals(123L, m.getEndMillis());
        __CLR4_4_116fe16felc8azwzx.R.inc(55073);assertEquals(ISOChronology.getInstance(), m.getChronology());
    }finally{__CLR4_4_116fe16felc8azwzx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString() {__CLR4_4_116fe16felc8azwzx.R.globalSliceStart(getClass().getName(),55074);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid16hu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116fe16felc8azwzx.R.rethrow($CLV_t2$);}finally{__CLR4_4_116fe16felc8azwzx.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableIntervalConverter.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55074,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid16hu(){try{__CLR4_4_116fe16felc8azwzx.R.inc(55074);
        __CLR4_4_116fe16felc8azwzx.R.inc(55075);assertEquals("Converter[org.joda.time.ReadableInterval]", ReadableIntervalConverter.INSTANCE.toString());
    }finally{__CLR4_4_116fe16felc8azwzx.R.flushNeeded();}}

}
