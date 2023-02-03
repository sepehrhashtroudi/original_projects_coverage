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
 * This class is a Junit unit test for Chronology.
 *
 * @author Stephen Colebourne
 */
public class TestDateTimeFieldType extends TestCase {static class __CLR4_4_1ii4ii4lc8azuaf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,24186,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_1ii4ii4lc8azuaf.R.inc(23980);
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(23981);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ii4ii4lc8azuaf.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ii4ii4lc8azuaf.R.inc(23982);
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(23983);return new TestSuite(TestDateTimeFieldType.class);
    }finally{__CLR4_4_1ii4ii4lc8azuaf.R.flushNeeded();}}

    public TestDateTimeFieldType(String name) {
        super(name);__CLR4_4_1ii4ii4lc8azuaf.R.inc(23985);try{__CLR4_4_1ii4ii4lc8azuaf.R.inc(23984);
    }finally{__CLR4_4_1ii4ii4lc8azuaf.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ii4ii4lc8azuaf.R.inc(23986);
    }finally{__CLR4_4_1ii4ii4lc8azuaf.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ii4ii4lc8azuaf.R.inc(23987);
    }finally{__CLR4_4_1ii4ii4lc8azuaf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_era() throws Exception {__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceStart(getClass().getName(),23988);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xz3gj6iic();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ii4ii4lc8azuaf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_era",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23988,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xz3gj6iic() throws Exception{try{__CLR4_4_1ii4ii4lc8azuaf.R.inc(23988);
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(23989);assertEquals(DateTimeFieldType.era(), DateTimeFieldType.era());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(23990);assertEquals("era", DateTimeFieldType.era().getName());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(23991);assertEquals(DurationFieldType.eras(), DateTimeFieldType.era().getDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(23992);assertEquals(null, DateTimeFieldType.era().getRangeDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(23993);assertEquals(CopticChronology.getInstanceUTC().era(), DateTimeFieldType.era().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(23994);assertEquals(CopticChronology.getInstanceUTC().era().isSupported(), DateTimeFieldType.era().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(23995);assertSerialization(DateTimeFieldType.era());
    }finally{__CLR4_4_1ii4ii4lc8azuaf.R.flushNeeded();}}

    public void test_centuryOfEra() throws Exception {__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceStart(getClass().getName(),23996);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kwu9wdiik();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ii4ii4lc8azuaf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_centuryOfEra",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23996,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kwu9wdiik() throws Exception{try{__CLR4_4_1ii4ii4lc8azuaf.R.inc(23996);
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(23997);assertEquals(DateTimeFieldType.centuryOfEra(), DateTimeFieldType.centuryOfEra());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(23998);assertEquals("centuryOfEra", DateTimeFieldType.centuryOfEra().getName());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(23999);assertEquals(DurationFieldType.centuries(), DateTimeFieldType.centuryOfEra().getDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24000);assertEquals(DurationFieldType.eras(), DateTimeFieldType.centuryOfEra().getRangeDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24001);assertEquals(CopticChronology.getInstanceUTC().centuryOfEra(), DateTimeFieldType.centuryOfEra().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24002);assertEquals(CopticChronology.getInstanceUTC().centuryOfEra().isSupported(), DateTimeFieldType.centuryOfEra().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24003);assertSerialization(DateTimeFieldType.centuryOfEra());
    }finally{__CLR4_4_1ii4ii4lc8azuaf.R.flushNeeded();}}

    public void test_yearOfCentury() throws Exception {__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceStart(getClass().getName(),24004);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fn4atiiis();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ii4ii4lc8azuaf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_yearOfCentury",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24004,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fn4atiiis() throws Exception{try{__CLR4_4_1ii4ii4lc8azuaf.R.inc(24004);
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24005);assertEquals(DateTimeFieldType.yearOfCentury(), DateTimeFieldType.yearOfCentury());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24006);assertEquals("yearOfCentury", DateTimeFieldType.yearOfCentury().getName());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24007);assertEquals(DurationFieldType.years(), DateTimeFieldType.yearOfCentury().getDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24008);assertEquals(DurationFieldType.centuries(), DateTimeFieldType.yearOfCentury().getRangeDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24009);assertEquals(CopticChronology.getInstanceUTC().yearOfCentury(), DateTimeFieldType.yearOfCentury().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24010);assertEquals(CopticChronology.getInstanceUTC().yearOfCentury().isSupported(), DateTimeFieldType.yearOfCentury().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24011);assertSerialization(DateTimeFieldType.yearOfCentury());
    }finally{__CLR4_4_1ii4ii4lc8azuaf.R.flushNeeded();}}

    public void test_yearOfEra() throws Exception {__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceStart(getClass().getName(),24012);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nmfop2ij0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ii4ii4lc8azuaf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_yearOfEra",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24012,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nmfop2ij0() throws Exception{try{__CLR4_4_1ii4ii4lc8azuaf.R.inc(24012);
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24013);assertEquals(DateTimeFieldType.yearOfEra(), DateTimeFieldType.yearOfEra());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24014);assertEquals("yearOfEra", DateTimeFieldType.yearOfEra().getName());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24015);assertEquals(DurationFieldType.years(), DateTimeFieldType.yearOfEra().getDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24016);assertEquals(DurationFieldType.eras(), DateTimeFieldType.yearOfEra().getRangeDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24017);assertEquals(CopticChronology.getInstanceUTC().yearOfEra(), DateTimeFieldType.yearOfEra().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24018);assertEquals(CopticChronology.getInstanceUTC().yearOfEra().isSupported(), DateTimeFieldType.yearOfEra().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24019);assertSerialization(DateTimeFieldType.yearOfEra());
    }finally{__CLR4_4_1ii4ii4lc8azuaf.R.flushNeeded();}}

    public void test_year() throws Exception {__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceStart(getClass().getName(),24020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wob9w1ij8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ii4ii4lc8azuaf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_year",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24020,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wob9w1ij8() throws Exception{try{__CLR4_4_1ii4ii4lc8azuaf.R.inc(24020);
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24021);assertEquals(DateTimeFieldType.year(), DateTimeFieldType.year());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24022);assertEquals("year", DateTimeFieldType.year().getName());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24023);assertEquals(DurationFieldType.years(), DateTimeFieldType.year().getDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24024);assertEquals(null, DateTimeFieldType.year().getRangeDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24025);assertEquals(CopticChronology.getInstanceUTC().year(), DateTimeFieldType.year().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24026);assertEquals(CopticChronology.getInstanceUTC().year().isSupported(), DateTimeFieldType.year().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24027);assertSerialization(DateTimeFieldType.year());
    }finally{__CLR4_4_1ii4ii4lc8azuaf.R.flushNeeded();}}

    public void test_monthOfYear() throws Exception {__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceStart(getClass().getName(),24028);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u2rvxuijg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ii4ii4lc8azuaf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_monthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24028,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u2rvxuijg() throws Exception{try{__CLR4_4_1ii4ii4lc8azuaf.R.inc(24028);
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24029);assertEquals(DateTimeFieldType.monthOfYear(), DateTimeFieldType.monthOfYear());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24030);assertEquals("monthOfYear", DateTimeFieldType.monthOfYear().getName());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24031);assertEquals(DurationFieldType.months(), DateTimeFieldType.monthOfYear().getDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24032);assertEquals(DurationFieldType.years(), DateTimeFieldType.monthOfYear().getRangeDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24033);assertEquals(CopticChronology.getInstanceUTC().monthOfYear(), DateTimeFieldType.monthOfYear().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24034);assertEquals(CopticChronology.getInstanceUTC().monthOfYear().isSupported(), DateTimeFieldType.monthOfYear().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24035);assertSerialization(DateTimeFieldType.monthOfYear());
    }finally{__CLR4_4_1ii4ii4lc8azuaf.R.flushNeeded();}}

    public void test_weekyearOfCentury() throws Exception {__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceStart(getClass().getName(),24036);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vymmrqijo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ii4ii4lc8azuaf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_weekyearOfCentury",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24036,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vymmrqijo() throws Exception{try{__CLR4_4_1ii4ii4lc8azuaf.R.inc(24036);
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24037);assertEquals(DateTimeFieldType.weekyearOfCentury(), DateTimeFieldType.weekyearOfCentury());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24038);assertEquals("weekyearOfCentury", DateTimeFieldType.weekyearOfCentury().getName());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24039);assertEquals(DurationFieldType.weekyears(), DateTimeFieldType.weekyearOfCentury().getDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24040);assertEquals(DurationFieldType.centuries(), DateTimeFieldType.weekyearOfCentury().getRangeDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24041);assertEquals(CopticChronology.getInstanceUTC().weekyearOfCentury(), DateTimeFieldType.weekyearOfCentury().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24042);assertEquals(CopticChronology.getInstanceUTC().weekyearOfCentury().isSupported(), DateTimeFieldType.weekyearOfCentury().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24043);assertSerialization(DateTimeFieldType.weekyearOfCentury());
    }finally{__CLR4_4_1ii4ii4lc8azuaf.R.flushNeeded();}}

    public void test_weekyear() throws Exception {__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceStart(getClass().getName(),24044);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hdixq3ijw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ii4ii4lc8azuaf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_weekyear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24044,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hdixq3ijw() throws Exception{try{__CLR4_4_1ii4ii4lc8azuaf.R.inc(24044);
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24045);assertEquals(DateTimeFieldType.weekyear(), DateTimeFieldType.weekyear());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24046);assertEquals("weekyear", DateTimeFieldType.weekyear().getName());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24047);assertEquals(DurationFieldType.weekyears(), DateTimeFieldType.weekyear().getDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24048);assertEquals(null, DateTimeFieldType.weekyear().getRangeDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24049);assertEquals(CopticChronology.getInstanceUTC().weekyear(), DateTimeFieldType.weekyear().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24050);assertEquals(CopticChronology.getInstanceUTC().weekyear().isSupported(), DateTimeFieldType.weekyear().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24051);assertSerialization(DateTimeFieldType.weekyear());
    }finally{__CLR4_4_1ii4ii4lc8azuaf.R.flushNeeded();}}

    public void test_weekOfWeekyear() throws Exception {__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceStart(getClass().getName(),24052);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1balis0ik4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ii4ii4lc8azuaf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_weekOfWeekyear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24052,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1balis0ik4() throws Exception{try{__CLR4_4_1ii4ii4lc8azuaf.R.inc(24052);
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24053);assertEquals(DateTimeFieldType.weekOfWeekyear(), DateTimeFieldType.weekOfWeekyear());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24054);assertEquals("weekOfWeekyear", DateTimeFieldType.weekOfWeekyear().getName());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24055);assertEquals(DurationFieldType.weeks(), DateTimeFieldType.weekOfWeekyear().getDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24056);assertEquals(DurationFieldType.weekyears(), DateTimeFieldType.weekOfWeekyear().getRangeDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24057);assertEquals(CopticChronology.getInstanceUTC().weekOfWeekyear(), DateTimeFieldType.weekOfWeekyear().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24058);assertEquals(CopticChronology.getInstanceUTC().weekOfWeekyear().isSupported(), DateTimeFieldType.weekOfWeekyear().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24059);assertSerialization(DateTimeFieldType.weekOfWeekyear());
    }finally{__CLR4_4_1ii4ii4lc8azuaf.R.flushNeeded();}}

    public void test_dayOfYear() throws Exception {__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceStart(getClass().getName(),24060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kct4baikc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ii4ii4lc8azuaf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_dayOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24060,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kct4baikc() throws Exception{try{__CLR4_4_1ii4ii4lc8azuaf.R.inc(24060);
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24061);assertEquals(DateTimeFieldType.dayOfYear(), DateTimeFieldType.dayOfYear());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24062);assertEquals("dayOfYear", DateTimeFieldType.dayOfYear().getName());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24063);assertEquals(DurationFieldType.days(), DateTimeFieldType.dayOfYear().getDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24064);assertEquals(DurationFieldType.years(), DateTimeFieldType.dayOfYear().getRangeDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24065);assertEquals(CopticChronology.getInstanceUTC().dayOfYear(), DateTimeFieldType.dayOfYear().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24066);assertEquals(CopticChronology.getInstanceUTC().dayOfYear().isSupported(), DateTimeFieldType.dayOfYear().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24067);assertSerialization(DateTimeFieldType.dayOfYear());
    }finally{__CLR4_4_1ii4ii4lc8azuaf.R.flushNeeded();}}

    public void test_dayOfMonth() throws Exception {__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceStart(getClass().getName(),24068);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16oh6ynikk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ii4ii4lc8azuaf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_dayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24068,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16oh6ynikk() throws Exception{try{__CLR4_4_1ii4ii4lc8azuaf.R.inc(24068);
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24069);assertEquals(DateTimeFieldType.dayOfMonth(), DateTimeFieldType.dayOfMonth());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24070);assertEquals("dayOfMonth", DateTimeFieldType.dayOfMonth().getName());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24071);assertEquals(DurationFieldType.days(), DateTimeFieldType.dayOfMonth().getDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24072);assertEquals(DurationFieldType.months(), DateTimeFieldType.dayOfMonth().getRangeDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24073);assertEquals(CopticChronology.getInstanceUTC().dayOfMonth(), DateTimeFieldType.dayOfMonth().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24074);assertEquals(CopticChronology.getInstanceUTC().dayOfMonth().isSupported(), DateTimeFieldType.dayOfMonth().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24075);assertSerialization(DateTimeFieldType.dayOfMonth());
    }finally{__CLR4_4_1ii4ii4lc8azuaf.R.flushNeeded();}}

    public void test_dayOfWeek() throws Exception {__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceStart(getClass().getName(),24076);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14yum2niks();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ii4ii4lc8azuaf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_dayOfWeek",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24076,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14yum2niks() throws Exception{try{__CLR4_4_1ii4ii4lc8azuaf.R.inc(24076);
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24077);assertEquals(DateTimeFieldType.dayOfWeek(), DateTimeFieldType.dayOfWeek());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24078);assertEquals("dayOfWeek", DateTimeFieldType.dayOfWeek().getName());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24079);assertEquals(DurationFieldType.days(), DateTimeFieldType.dayOfWeek().getDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24080);assertEquals(DurationFieldType.weeks(), DateTimeFieldType.dayOfWeek().getRangeDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24081);assertEquals(CopticChronology.getInstanceUTC().dayOfWeek(), DateTimeFieldType.dayOfWeek().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24082);assertEquals(CopticChronology.getInstanceUTC().dayOfWeek().isSupported(), DateTimeFieldType.dayOfWeek().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24083);assertSerialization(DateTimeFieldType.dayOfWeek());
    }finally{__CLR4_4_1ii4ii4lc8azuaf.R.flushNeeded();}}

    public void test_halfdayOfDay() throws Exception {__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceStart(getClass().getName(),24084);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qoqfaoil0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ii4ii4lc8azuaf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_halfdayOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24084,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qoqfaoil0() throws Exception{try{__CLR4_4_1ii4ii4lc8azuaf.R.inc(24084);
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24085);assertEquals(DateTimeFieldType.halfdayOfDay(), DateTimeFieldType.halfdayOfDay());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24086);assertEquals("halfdayOfDay", DateTimeFieldType.halfdayOfDay().getName());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24087);assertEquals(DurationFieldType.halfdays(), DateTimeFieldType.halfdayOfDay().getDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24088);assertEquals(DurationFieldType.days(), DateTimeFieldType.halfdayOfDay().getRangeDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24089);assertEquals(CopticChronology.getInstanceUTC().halfdayOfDay(), DateTimeFieldType.halfdayOfDay().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24090);assertEquals(CopticChronology.getInstanceUTC().halfdayOfDay().isSupported(), DateTimeFieldType.halfdayOfDay().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24091);assertSerialization(DateTimeFieldType.halfdayOfDay());
    }finally{__CLR4_4_1ii4ii4lc8azuaf.R.flushNeeded();}}

    public void test_clockhourOfDay() throws Exception {__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceStart(getClass().getName(),24092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c2lwxzil8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ii4ii4lc8azuaf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_clockhourOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24092,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c2lwxzil8() throws Exception{try{__CLR4_4_1ii4ii4lc8azuaf.R.inc(24092);
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24093);assertEquals(DateTimeFieldType.clockhourOfDay(), DateTimeFieldType.clockhourOfDay());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24094);assertEquals("clockhourOfDay", DateTimeFieldType.clockhourOfDay().getName());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24095);assertEquals(DurationFieldType.hours(), DateTimeFieldType.clockhourOfDay().getDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24096);assertEquals(DurationFieldType.days(), DateTimeFieldType.clockhourOfDay().getRangeDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24097);assertEquals(CopticChronology.getInstanceUTC().clockhourOfDay(), DateTimeFieldType.clockhourOfDay().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24098);assertEquals(CopticChronology.getInstanceUTC().clockhourOfDay().isSupported(), DateTimeFieldType.clockhourOfDay().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24099);assertSerialization(DateTimeFieldType.clockhourOfDay());
    }finally{__CLR4_4_1ii4ii4lc8azuaf.R.flushNeeded();}}

    public void test_clockhourOfHalfday() throws Exception {__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceStart(getClass().getName(),24100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_148n4gkilg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ii4ii4lc8azuaf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_clockhourOfHalfday",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24100,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_148n4gkilg() throws Exception{try{__CLR4_4_1ii4ii4lc8azuaf.R.inc(24100);
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24101);assertEquals(DateTimeFieldType.clockhourOfHalfday(), DateTimeFieldType.clockhourOfHalfday());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24102);assertEquals("clockhourOfHalfday", DateTimeFieldType.clockhourOfHalfday().getName());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24103);assertEquals(DurationFieldType.hours(), DateTimeFieldType.clockhourOfHalfday().getDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24104);assertEquals(DurationFieldType.halfdays(), DateTimeFieldType.clockhourOfHalfday().getRangeDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24105);assertEquals(CopticChronology.getInstanceUTC().clockhourOfHalfday(), DateTimeFieldType.clockhourOfHalfday().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24106);assertEquals(CopticChronology.getInstanceUTC().clockhourOfHalfday().isSupported(), DateTimeFieldType.clockhourOfHalfday().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24107);assertSerialization(DateTimeFieldType.clockhourOfHalfday());
    }finally{__CLR4_4_1ii4ii4lc8azuaf.R.flushNeeded();}}

    public void test_hourOfHalfday() throws Exception {__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceStart(getClass().getName(),24108);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1neiy5kilo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ii4ii4lc8azuaf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_hourOfHalfday",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24108,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1neiy5kilo() throws Exception{try{__CLR4_4_1ii4ii4lc8azuaf.R.inc(24108);
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24109);assertEquals(DateTimeFieldType.hourOfHalfday(), DateTimeFieldType.hourOfHalfday());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24110);assertEquals("hourOfHalfday", DateTimeFieldType.hourOfHalfday().getName());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24111);assertEquals(DurationFieldType.hours(), DateTimeFieldType.hourOfHalfday().getDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24112);assertEquals(DurationFieldType.halfdays(), DateTimeFieldType.hourOfHalfday().getRangeDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24113);assertEquals(CopticChronology.getInstanceUTC().hourOfHalfday(), DateTimeFieldType.hourOfHalfday().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24114);assertEquals(CopticChronology.getInstanceUTC().hourOfHalfday().isSupported(), DateTimeFieldType.hourOfHalfday().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24115);assertSerialization(DateTimeFieldType.hourOfHalfday());
    }finally{__CLR4_4_1ii4ii4lc8azuaf.R.flushNeeded();}}

    public void test_hourOfDay() throws Exception {__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceStart(getClass().getName(),24116);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12mro4lilw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ii4ii4lc8azuaf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_hourOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24116,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12mro4lilw() throws Exception{try{__CLR4_4_1ii4ii4lc8azuaf.R.inc(24116);
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24117);assertEquals(DateTimeFieldType.hourOfDay(), DateTimeFieldType.hourOfDay());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24118);assertEquals("hourOfDay", DateTimeFieldType.hourOfDay().getName());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24119);assertEquals(DurationFieldType.hours(), DateTimeFieldType.hourOfDay().getDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24120);assertEquals(DurationFieldType.days(), DateTimeFieldType.hourOfDay().getRangeDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24121);assertEquals(CopticChronology.getInstanceUTC().hourOfDay(), DateTimeFieldType.hourOfDay().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24122);assertEquals(CopticChronology.getInstanceUTC().hourOfDay().isSupported(), DateTimeFieldType.hourOfDay().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24123);assertSerialization(DateTimeFieldType.hourOfDay());
    }finally{__CLR4_4_1ii4ii4lc8azuaf.R.flushNeeded();}}

    public void test_minuteOfDay() throws Exception {__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceStart(getClass().getName(),24124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jt78yzim4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ii4ii4lc8azuaf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_minuteOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24124,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jt78yzim4() throws Exception{try{__CLR4_4_1ii4ii4lc8azuaf.R.inc(24124);
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24125);assertEquals(DateTimeFieldType.minuteOfDay(), DateTimeFieldType.minuteOfDay());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24126);assertEquals("minuteOfDay", DateTimeFieldType.minuteOfDay().getName());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24127);assertEquals(DurationFieldType.minutes(), DateTimeFieldType.minuteOfDay().getDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24128);assertEquals(DurationFieldType.days(), DateTimeFieldType.minuteOfDay().getRangeDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24129);assertEquals(CopticChronology.getInstanceUTC().minuteOfDay(), DateTimeFieldType.minuteOfDay().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24130);assertEquals(CopticChronology.getInstanceUTC().minuteOfDay().isSupported(), DateTimeFieldType.minuteOfDay().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24131);assertSerialization(DateTimeFieldType.minuteOfDay());
    }finally{__CLR4_4_1ii4ii4lc8azuaf.R.flushNeeded();}}

    public void test_minuteOfHour() throws Exception {__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceStart(getClass().getName(),24132);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p9vk6bimc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ii4ii4lc8azuaf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_minuteOfHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24132,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p9vk6bimc() throws Exception{try{__CLR4_4_1ii4ii4lc8azuaf.R.inc(24132);
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24133);assertEquals(DateTimeFieldType.minuteOfHour(), DateTimeFieldType.minuteOfHour());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24134);assertEquals("minuteOfHour", DateTimeFieldType.minuteOfHour().getName());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24135);assertEquals(DurationFieldType.minutes(), DateTimeFieldType.minuteOfHour().getDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24136);assertEquals(DurationFieldType.hours(), DateTimeFieldType.minuteOfHour().getRangeDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24137);assertEquals(CopticChronology.getInstanceUTC().minuteOfHour(), DateTimeFieldType.minuteOfHour().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24138);assertEquals(CopticChronology.getInstanceUTC().minuteOfHour().isSupported(), DateTimeFieldType.minuteOfHour().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24139);assertSerialization(DateTimeFieldType.minuteOfHour());
    }finally{__CLR4_4_1ii4ii4lc8azuaf.R.flushNeeded();}}

    public void test_secondOfDay() throws Exception {__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceStart(getClass().getName(),24140);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12puci3imk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ii4ii4lc8azuaf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_secondOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24140,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12puci3imk() throws Exception{try{__CLR4_4_1ii4ii4lc8azuaf.R.inc(24140);
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24141);assertEquals(DateTimeFieldType.secondOfDay(), DateTimeFieldType.secondOfDay());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24142);assertEquals("secondOfDay", DateTimeFieldType.secondOfDay().getName());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24143);assertEquals(DurationFieldType.seconds(), DateTimeFieldType.secondOfDay().getDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24144);assertEquals(DurationFieldType.days(), DateTimeFieldType.secondOfDay().getRangeDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24145);assertEquals(CopticChronology.getInstanceUTC().secondOfDay(), DateTimeFieldType.secondOfDay().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24146);assertEquals(CopticChronology.getInstanceUTC().secondOfDay().isSupported(), DateTimeFieldType.secondOfDay().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24147);assertSerialization(DateTimeFieldType.secondOfDay());
    }finally{__CLR4_4_1ii4ii4lc8azuaf.R.flushNeeded();}}

    public void test_secondOfMinute() throws Exception {__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceStart(getClass().getName(),24148);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14bhyerims();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ii4ii4lc8azuaf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_secondOfMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24148,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14bhyerims() throws Exception{try{__CLR4_4_1ii4ii4lc8azuaf.R.inc(24148);
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24149);assertEquals(DateTimeFieldType.secondOfMinute(), DateTimeFieldType.secondOfMinute());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24150);assertEquals("secondOfMinute", DateTimeFieldType.secondOfMinute().getName());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24151);assertEquals(DurationFieldType.seconds(), DateTimeFieldType.secondOfMinute().getDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24152);assertEquals(DurationFieldType.minutes(), DateTimeFieldType.secondOfMinute().getRangeDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24153);assertEquals(CopticChronology.getInstanceUTC().secondOfMinute(), DateTimeFieldType.secondOfMinute().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24154);assertEquals(CopticChronology.getInstanceUTC().secondOfMinute().isSupported(), DateTimeFieldType.secondOfMinute().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24155);assertSerialization(DateTimeFieldType.secondOfMinute());
    }finally{__CLR4_4_1ii4ii4lc8azuaf.R.flushNeeded();}}

    public void test_millisOfDay() throws Exception {__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceStart(getClass().getName(),24156);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ugkhh5in0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ii4ii4lc8azuaf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_millisOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24156,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ugkhh5in0() throws Exception{try{__CLR4_4_1ii4ii4lc8azuaf.R.inc(24156);
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24157);assertEquals(DateTimeFieldType.millisOfDay(), DateTimeFieldType.millisOfDay());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24158);assertEquals("millisOfDay", DateTimeFieldType.millisOfDay().getName());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24159);assertEquals(DurationFieldType.millis(), DateTimeFieldType.millisOfDay().getDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24160);assertEquals(DurationFieldType.days(), DateTimeFieldType.millisOfDay().getRangeDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24161);assertEquals(CopticChronology.getInstanceUTC().millisOfDay(), DateTimeFieldType.millisOfDay().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24162);assertEquals(CopticChronology.getInstanceUTC().millisOfDay().isSupported(), DateTimeFieldType.millisOfDay().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24163);assertSerialization(DateTimeFieldType.millisOfDay());
    }finally{__CLR4_4_1ii4ii4lc8azuaf.R.flushNeeded();}}

    public void test_millisOfSecond() throws Exception {__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceStart(getClass().getName(),24164);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gqahsrin8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ii4ii4lc8azuaf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ii4ii4lc8azuaf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeFieldType.test_millisOfSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24164,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gqahsrin8() throws Exception{try{__CLR4_4_1ii4ii4lc8azuaf.R.inc(24164);
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24165);assertEquals(DateTimeFieldType.millisOfSecond(), DateTimeFieldType.millisOfSecond());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24166);assertEquals("millisOfSecond", DateTimeFieldType.millisOfSecond().getName());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24167);assertEquals(DurationFieldType.millis(), DateTimeFieldType.millisOfSecond().getDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24168);assertEquals(DurationFieldType.seconds(), DateTimeFieldType.millisOfSecond().getRangeDurationType());
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24169);assertEquals(CopticChronology.getInstanceUTC().millisOfSecond(), DateTimeFieldType.millisOfSecond().getField(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24170);assertEquals(CopticChronology.getInstanceUTC().millisOfSecond().isSupported(), DateTimeFieldType.millisOfSecond().isSupported(CopticChronology.getInstanceUTC()));
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24171);assertSerialization(DateTimeFieldType.millisOfSecond());
    }finally{__CLR4_4_1ii4ii4lc8azuaf.R.flushNeeded();}}

//    public void test_other() throws Exception {
//        assertEquals(1, DateTimeFieldType.class.getDeclaredClasses().length);
//        Class cls = DateTimeFieldType.class.getDeclaredClasses()[0];
//        assertEquals(1, cls.getDeclaredConstructors().length);
//        Constructor con = cls.getDeclaredConstructors()[0];
//        Object[] params = new Object[] {
//            "other", new Byte((byte) 128), DurationFieldType.hours(), DurationFieldType.months()};
//        con.setAccessible(true);  // for Apache Harmony JVM
//        DateTimeFieldType type = (DateTimeFieldType) con.newInstance(params);
//
//        assertEquals("other", type.getName());
//        assertSame(DurationFieldType.hours(), type.getDurationType());
//        assertSame(DurationFieldType.months(), type.getRangeDurationType());
//        try {
//            type.getField(CopticChronology.getInstanceUTC());
//            fail();
//        } catch (InternalError ex) {}
//        DateTimeFieldType result = doSerialization(type);
//        assertEquals(type.getName(), result.getName());
//        assertNotSame(type, result);
//    }

    //-----------------------------------------------------------------------
    private void assertSerialization(DateTimeFieldType type) throws Exception {try{__CLR4_4_1ii4ii4lc8azuaf.R.inc(24172);
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24173);DateTimeFieldType result = doSerialization(type);
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24174);assertSame(type, result);
    }finally{__CLR4_4_1ii4ii4lc8azuaf.R.flushNeeded();}}

    private DateTimeFieldType doSerialization(DateTimeFieldType type) throws Exception {try{__CLR4_4_1ii4ii4lc8azuaf.R.inc(24175);
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24176);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24177);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24178);oos.writeObject(type);
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24179);byte[] bytes = baos.toByteArray();
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24180);oos.close();
        
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24181);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24182);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24183);DateTimeFieldType result = (DateTimeFieldType) ois.readObject();
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24184);ois.close();
        __CLR4_4_1ii4ii4lc8azuaf.R.inc(24185);return result;
    }finally{__CLR4_4_1ii4ii4lc8azuaf.R.flushNeeded();}}

}
