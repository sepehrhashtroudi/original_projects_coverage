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
import java.lang.reflect.Constructor;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.CopticChronology;

/**
 * This class is a Junit unit test for DurationFieldType.
 *
 * @author Stephen Colebourne
 */
public class TestDurationFieldType extends TestCase {static class __CLR4_4_1lvnlvnlc8azuor{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,28449,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1lvnlvnlc8azuor.R.inc(28355);
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28356);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1lvnlvnlc8azuor.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1lvnlvnlc8azuor.R.inc(28357);
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28358);return new TestSuite(TestDurationFieldType.class);
    }finally{__CLR4_4_1lvnlvnlc8azuor.R.flushNeeded();}}

    public TestDurationFieldType(String name) {
        super(name);__CLR4_4_1lvnlvnlc8azuor.R.inc(28360);try{__CLR4_4_1lvnlvnlc8azuor.R.inc(28359);
    }finally{__CLR4_4_1lvnlvnlc8azuor.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1lvnlvnlc8azuor.R.inc(28361);
    }finally{__CLR4_4_1lvnlvnlc8azuor.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1lvnlvnlc8azuor.R.inc(28362);
    }finally{__CLR4_4_1lvnlvnlc8azuor.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_eras() throws Exception {__CLR4_4_1lvnlvnlc8azuor.R.globalSliceStart(getClass().getName(),28363);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1huckr1lvv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lvnlvnlc8azuor.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lvnlvnlc8azuor.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_eras",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28363,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1huckr1lvv() throws Exception{try{__CLR4_4_1lvnlvnlc8azuor.R.inc(28363);
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28364);assertEquals(DurationFieldType.eras(), DurationFieldType.eras());
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28365);assertEquals("eras", DurationFieldType.eras().getName());
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28366);assertEquals(CopticChronology.getInstanceUTC().eras(), DurationFieldType.eras().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28367);assertEquals(CopticChronology.getInstanceUTC().eras().isSupported(), DurationFieldType.eras().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28368);assertSerialization(DurationFieldType.eras());
    }finally{__CLR4_4_1lvnlvnlc8azuor.R.flushNeeded();}}

    public void test_centuries() throws Exception {__CLR4_4_1lvnlvnlc8azuor.R.globalSliceStart(getClass().getName(),28369);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_136us4lw1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lvnlvnlc8azuor.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lvnlvnlc8azuor.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_centuries",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28369,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_136us4lw1() throws Exception{try{__CLR4_4_1lvnlvnlc8azuor.R.inc(28369);
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28370);assertEquals(DurationFieldType.centuries(), DurationFieldType.centuries());
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28371);assertEquals("centuries", DurationFieldType.centuries().getName());
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28372);assertEquals(CopticChronology.getInstanceUTC().centuries(), DurationFieldType.centuries().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28373);assertEquals(CopticChronology.getInstanceUTC().centuries().isSupported(), DurationFieldType.centuries().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28374);assertSerialization(DurationFieldType.centuries());
    }finally{__CLR4_4_1lvnlvnlc8azuor.R.flushNeeded();}}

    public void test_years() throws Exception {__CLR4_4_1lvnlvnlc8azuor.R.globalSliceStart(getClass().getName(),28375);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bkxey8lw7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lvnlvnlc8azuor.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lvnlvnlc8azuor.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_years",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28375,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bkxey8lw7() throws Exception{try{__CLR4_4_1lvnlvnlc8azuor.R.inc(28375);
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28376);assertEquals(DurationFieldType.years(), DurationFieldType.years());
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28377);assertEquals("years", DurationFieldType.years().getName());
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28378);assertEquals(CopticChronology.getInstanceUTC().years(), DurationFieldType.years().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28379);assertEquals(CopticChronology.getInstanceUTC().years().isSupported(), DurationFieldType.years().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28380);assertSerialization(DurationFieldType.years());
    }finally{__CLR4_4_1lvnlvnlc8azuor.R.flushNeeded();}}

    public void test_months() throws Exception {__CLR4_4_1lvnlvnlc8azuor.R.globalSliceStart(getClass().getName(),28381);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19q0sxzlwd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lvnlvnlc8azuor.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lvnlvnlc8azuor.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_months",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28381,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19q0sxzlwd() throws Exception{try{__CLR4_4_1lvnlvnlc8azuor.R.inc(28381);
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28382);assertEquals(DurationFieldType.months(), DurationFieldType.months());
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28383);assertEquals("months", DurationFieldType.months().getName());
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28384);assertEquals(CopticChronology.getInstanceUTC().months(), DurationFieldType.months().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28385);assertEquals(CopticChronology.getInstanceUTC().months().isSupported(), DurationFieldType.months().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28386);assertSerialization(DurationFieldType.months());
    }finally{__CLR4_4_1lvnlvnlc8azuor.R.flushNeeded();}}

    public void test_weekyears() throws Exception {__CLR4_4_1lvnlvnlc8azuor.R.globalSliceStart(getClass().getName(),28387);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hgrj8lwj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lvnlvnlc8azuor.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lvnlvnlc8azuor.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_weekyears",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28387,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hgrj8lwj() throws Exception{try{__CLR4_4_1lvnlvnlc8azuor.R.inc(28387);
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28388);assertEquals(DurationFieldType.weekyears(), DurationFieldType.weekyears());
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28389);assertEquals("weekyears", DurationFieldType.weekyears().getName());
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28390);assertEquals(CopticChronology.getInstanceUTC().weekyears(), DurationFieldType.weekyears().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28391);assertEquals(CopticChronology.getInstanceUTC().weekyears().isSupported(), DurationFieldType.weekyears().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28392);assertSerialization(DurationFieldType.weekyears());
    }finally{__CLR4_4_1lvnlvnlc8azuor.R.flushNeeded();}}

    public void test_weeks() throws Exception {__CLR4_4_1lvnlvnlc8azuor.R.globalSliceStart(getClass().getName(),28393);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vs03c7lwp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lvnlvnlc8azuor.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lvnlvnlc8azuor.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_weeks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28393,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vs03c7lwp() throws Exception{try{__CLR4_4_1lvnlvnlc8azuor.R.inc(28393);
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28394);assertEquals(DurationFieldType.weeks(), DurationFieldType.weeks());
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28395);assertEquals("weeks", DurationFieldType.weeks().getName());
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28396);assertEquals(CopticChronology.getInstanceUTC().weeks(), DurationFieldType.weeks().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28397);assertEquals(CopticChronology.getInstanceUTC().weeks().isSupported(), DurationFieldType.weeks().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28398);assertSerialization(DurationFieldType.weeks());
    }finally{__CLR4_4_1lvnlvnlc8azuor.R.flushNeeded();}}

    public void test_days() throws Exception {__CLR4_4_1lvnlvnlc8azuor.R.globalSliceStart(getClass().getName(),28399);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gixnzflwv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lvnlvnlc8azuor.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lvnlvnlc8azuor.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_days",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28399,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gixnzflwv() throws Exception{try{__CLR4_4_1lvnlvnlc8azuor.R.inc(28399);
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28400);assertEquals(DurationFieldType.days(), DurationFieldType.days());
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28401);assertEquals("days", DurationFieldType.days().getName());
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28402);assertEquals(CopticChronology.getInstanceUTC().days(), DurationFieldType.days().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28403);assertEquals(CopticChronology.getInstanceUTC().days().isSupported(), DurationFieldType.days().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28404);assertSerialization(DurationFieldType.days());
    }finally{__CLR4_4_1lvnlvnlc8azuor.R.flushNeeded();}}

    public void test_halfdays() throws Exception {__CLR4_4_1lvnlvnlc8azuor.R.globalSliceStart(getClass().getName(),28405);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ixuoaqlx1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lvnlvnlc8azuor.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lvnlvnlc8azuor.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_halfdays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28405,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ixuoaqlx1() throws Exception{try{__CLR4_4_1lvnlvnlc8azuor.R.inc(28405);
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28406);assertEquals(DurationFieldType.halfdays(), DurationFieldType.halfdays());
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28407);assertEquals("halfdays", DurationFieldType.halfdays().getName());
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28408);assertEquals(CopticChronology.getInstanceUTC().halfdays(), DurationFieldType.halfdays().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28409);assertEquals(CopticChronology.getInstanceUTC().halfdays().isSupported(), DurationFieldType.halfdays().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28410);assertSerialization(DurationFieldType.halfdays());
    }finally{__CLR4_4_1lvnlvnlc8azuor.R.flushNeeded();}}

    public void test_hours() throws Exception {__CLR4_4_1lvnlvnlc8azuor.R.globalSliceStart(getClass().getName(),28411);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15tuk7rlx7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lvnlvnlc8azuor.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lvnlvnlc8azuor.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_hours",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28411,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15tuk7rlx7() throws Exception{try{__CLR4_4_1lvnlvnlc8azuor.R.inc(28411);
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28412);assertEquals(DurationFieldType.hours(), DurationFieldType.hours());
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28413);assertEquals("hours", DurationFieldType.hours().getName());
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28414);assertEquals(CopticChronology.getInstanceUTC().hours(), DurationFieldType.hours().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28415);assertEquals(CopticChronology.getInstanceUTC().hours().isSupported(), DurationFieldType.hours().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28416);assertSerialization(DurationFieldType.hours());
    }finally{__CLR4_4_1lvnlvnlc8azuor.R.flushNeeded();}}

    public void test_minutes() throws Exception {__CLR4_4_1lvnlvnlc8azuor.R.globalSliceStart(getClass().getName(),28417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fwl4uflxd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lvnlvnlc8azuor.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lvnlvnlc8azuor.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_minutes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28417,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fwl4uflxd() throws Exception{try{__CLR4_4_1lvnlvnlc8azuor.R.inc(28417);
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28418);assertEquals(DurationFieldType.minutes(), DurationFieldType.minutes());
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28419);assertEquals("minutes", DurationFieldType.minutes().getName());
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28420);assertEquals(CopticChronology.getInstanceUTC().minutes(), DurationFieldType.minutes().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28421);assertEquals(CopticChronology.getInstanceUTC().minutes().isSupported(), DurationFieldType.minutes().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28422);assertSerialization(DurationFieldType.minutes());
    }finally{__CLR4_4_1lvnlvnlc8azuor.R.flushNeeded();}}

    public void test_seconds() throws Exception {__CLR4_4_1lvnlvnlc8azuor.R.globalSliceStart(getClass().getName(),28423);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13if0h3lxj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lvnlvnlc8azuor.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lvnlvnlc8azuor.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_seconds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28423,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13if0h3lxj() throws Exception{try{__CLR4_4_1lvnlvnlc8azuor.R.inc(28423);
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28424);assertEquals(DurationFieldType.seconds(), DurationFieldType.seconds());
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28425);assertEquals("seconds", DurationFieldType.seconds().getName());
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28426);assertEquals(CopticChronology.getInstanceUTC().seconds(), DurationFieldType.seconds().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28427);assertEquals(CopticChronology.getInstanceUTC().seconds().isSupported(), DurationFieldType.seconds().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28428);assertSerialization(DurationFieldType.seconds());
    }finally{__CLR4_4_1lvnlvnlc8azuor.R.flushNeeded();}}

    public void test_millis() throws Exception {__CLR4_4_1lvnlvnlc8azuor.R.globalSliceStart(getClass().getName(),28429);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13cnb7qlxp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1lvnlvnlc8azuor.R.rethrow($CLV_t2$);}finally{__CLR4_4_1lvnlvnlc8azuor.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDurationFieldType.test_millis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28429,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13cnb7qlxp() throws Exception{try{__CLR4_4_1lvnlvnlc8azuor.R.inc(28429);
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28430);assertEquals(DurationFieldType.millis(), DurationFieldType.millis());
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28431);assertEquals("millis", DurationFieldType.millis().getName());
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28432);assertEquals(CopticChronology.getInstanceUTC().millis(), DurationFieldType.millis().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28433);assertEquals(CopticChronology.getInstanceUTC().millis().isSupported(), DurationFieldType.millis().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28434);assertSerialization(DurationFieldType.millis());
    }finally{__CLR4_4_1lvnlvnlc8azuor.R.flushNeeded();}}

//    public void test_other() throws Exception {
//        assertEquals(1, DurationFieldType.class.getDeclaredClasses().length);
//        Class cls = DurationFieldType.class.getDeclaredClasses()[0];
//        assertEquals(1, cls.getDeclaredConstructors().length);
//        Constructor con = cls.getDeclaredConstructors()[0];
//        Object[] params = new Object[] {"other", new Byte((byte) 128)};
//        DurationFieldType type = (DurationFieldType) con.newInstance(params);
//
//        assertEquals("other", type.getName());
//        try {
//            type.getField(CopticChronology.getInstanceUTC());
//            fail();
//        } catch (InternalError ex) {}
//        DurationFieldType result = doSerialization(type);
//        assertEquals(type.getName(), result.getName());
//        assertNotSame(type, result);
//    }

    //-----------------------------------------------------------------------
    private void assertSerialization(DurationFieldType type) throws Exception {try{__CLR4_4_1lvnlvnlc8azuor.R.inc(28435);
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28436);DurationFieldType result = doSerialization(type);
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28437);assertSame(type, result);
    }finally{__CLR4_4_1lvnlvnlc8azuor.R.flushNeeded();}}

    private DurationFieldType doSerialization(DurationFieldType type) throws Exception {try{__CLR4_4_1lvnlvnlc8azuor.R.inc(28438);
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28439);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28440);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28441);oos.writeObject(type);
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28442);byte[] bytes = baos.toByteArray();
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28443);oos.close();
        
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28444);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28445);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28446);DurationFieldType result = (DurationFieldType) ois.readObject();
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28447);ois.close();
        __CLR4_4_1lvnlvnlc8azuor.R.inc(28448);return result;
    }finally{__CLR4_4_1lvnlvnlc8azuor.R.flushNeeded();}}

}
