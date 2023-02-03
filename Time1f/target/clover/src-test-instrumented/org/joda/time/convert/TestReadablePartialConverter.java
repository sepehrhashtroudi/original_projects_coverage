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
import java.util.Arrays;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;
import org.joda.time.TimeOfDay;
import org.joda.time.YearMonthDay;
import org.joda.time.base.BasePartial;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a Junit unit test for ReadablePartialConverter.
 *
 * @author Stephen Colebourne
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class TestReadablePartialConverter extends TestCase {static class __CLR4_4_116hw16hwlc8azx08{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,55134,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static Chronology JULIAN;
    private static Chronology ISO;
    private static Chronology BUDDHIST;
    
    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_116hw16hwlc8azx08.R.inc(55076);
        __CLR4_4_116hw16hwlc8azx08.R.inc(55077);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_116hw16hwlc8azx08.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_116hw16hwlc8azx08.R.inc(55078);
        __CLR4_4_116hw16hwlc8azx08.R.inc(55079);return new TestSuite(TestReadablePartialConverter.class);
    }finally{__CLR4_4_116hw16hwlc8azx08.R.flushNeeded();}}

    public TestReadablePartialConverter(String name) {
        super(name);__CLR4_4_116hw16hwlc8azx08.R.inc(55081);try{__CLR4_4_116hw16hwlc8azx08.R.inc(55080);
    }finally{__CLR4_4_116hw16hwlc8azx08.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_116hw16hwlc8azx08.R.inc(55082);
        __CLR4_4_116hw16hwlc8azx08.R.inc(55083);JULIAN = JulianChronology.getInstance();
        __CLR4_4_116hw16hwlc8azx08.R.inc(55084);ISO = ISOChronology.getInstance();
        __CLR4_4_116hw16hwlc8azx08.R.inc(55085);BUDDHIST = BuddhistChronology.getInstance();
    }finally{__CLR4_4_116hw16hwlc8azx08.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSingleton() throws Exception {__CLR4_4_116hw16hwlc8azx08.R.globalSliceStart(getClass().getName(),55086);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jmk8jk16i6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116hw16hwlc8azx08.R.rethrow($CLV_t2$);}finally{__CLR4_4_116hw16hwlc8azx08.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadablePartialConverter.testSingleton",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55086,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jmk8jk16i6() throws Exception{try{__CLR4_4_116hw16hwlc8azx08.R.inc(55086);
        __CLR4_4_116hw16hwlc8azx08.R.inc(55087);Class cls = ReadablePartialConverter.class;
        __CLR4_4_116hw16hwlc8azx08.R.inc(55088);assertEquals(false, Modifier.isPublic(cls.getModifiers()));
        __CLR4_4_116hw16hwlc8azx08.R.inc(55089);assertEquals(false, Modifier.isProtected(cls.getModifiers()));
        __CLR4_4_116hw16hwlc8azx08.R.inc(55090);assertEquals(false, Modifier.isPrivate(cls.getModifiers()));
        
        __CLR4_4_116hw16hwlc8azx08.R.inc(55091);Constructor con = cls.getDeclaredConstructor((Class[]) null);
        __CLR4_4_116hw16hwlc8azx08.R.inc(55092);assertEquals(1, cls.getDeclaredConstructors().length);
        __CLR4_4_116hw16hwlc8azx08.R.inc(55093);assertEquals(true, Modifier.isProtected(con.getModifiers()));
        
        __CLR4_4_116hw16hwlc8azx08.R.inc(55094);Field fld = cls.getDeclaredField("INSTANCE");
        __CLR4_4_116hw16hwlc8azx08.R.inc(55095);assertEquals(false, Modifier.isPublic(fld.getModifiers()));
        __CLR4_4_116hw16hwlc8azx08.R.inc(55096);assertEquals(false, Modifier.isProtected(fld.getModifiers()));
        __CLR4_4_116hw16hwlc8azx08.R.inc(55097);assertEquals(false, Modifier.isPrivate(fld.getModifiers()));
    }finally{__CLR4_4_116hw16hwlc8azx08.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSupportedType() throws Exception {__CLR4_4_116hw16hwlc8azx08.R.globalSliceStart(getClass().getName(),55098);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fthtzx16ii();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116hw16hwlc8azx08.R.rethrow($CLV_t2$);}finally{__CLR4_4_116hw16hwlc8azx08.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadablePartialConverter.testSupportedType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55098,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fthtzx16ii() throws Exception{try{__CLR4_4_116hw16hwlc8azx08.R.inc(55098);
        __CLR4_4_116hw16hwlc8azx08.R.inc(55099);assertEquals(ReadablePartial.class, ReadablePartialConverter.INSTANCE.getSupportedType());
    }finally{__CLR4_4_116hw16hwlc8azx08.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetChronology_Object_Zone() throws Exception {__CLR4_4_116hw16hwlc8azx08.R.globalSliceStart(getClass().getName(),55100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nbwmeo16ik();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116hw16hwlc8azx08.R.rethrow($CLV_t2$);}finally{__CLR4_4_116hw16hwlc8azx08.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadablePartialConverter.testGetChronology_Object_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55100,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nbwmeo16ik() throws Exception{try{__CLR4_4_116hw16hwlc8azx08.R.inc(55100);
        __CLR4_4_116hw16hwlc8azx08.R.inc(55101);assertEquals(ISO_PARIS, ReadablePartialConverter.INSTANCE.getChronology(new TimeOfDay(123L), PARIS));
        __CLR4_4_116hw16hwlc8azx08.R.inc(55102);assertEquals(ISO, ReadablePartialConverter.INSTANCE.getChronology(new TimeOfDay(123L), DateTimeZone.getDefault()));
        __CLR4_4_116hw16hwlc8azx08.R.inc(55103);assertEquals(ISO, ReadablePartialConverter.INSTANCE.getChronology(new TimeOfDay(123L), (DateTimeZone) null));
    }finally{__CLR4_4_116hw16hwlc8azx08.R.flushNeeded();}}

    public void testGetChronology_Object_Chronology() throws Exception {__CLR4_4_116hw16hwlc8azx08.R.globalSliceStart(getClass().getName(),55104);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u5zpek16io();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116hw16hwlc8azx08.R.rethrow($CLV_t2$);}finally{__CLR4_4_116hw16hwlc8azx08.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadablePartialConverter.testGetChronology_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55104,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u5zpek16io() throws Exception{try{__CLR4_4_116hw16hwlc8azx08.R.inc(55104);
        __CLR4_4_116hw16hwlc8azx08.R.inc(55105);assertEquals(JULIAN, ReadablePartialConverter.INSTANCE.getChronology(new TimeOfDay(123L, BUDDHIST), JULIAN));
        __CLR4_4_116hw16hwlc8azx08.R.inc(55106);assertEquals(JULIAN, ReadablePartialConverter.INSTANCE.getChronology(new TimeOfDay(123L), JULIAN));
        __CLR4_4_116hw16hwlc8azx08.R.inc(55107);assertEquals(BUDDHIST.withUTC(), ReadablePartialConverter.INSTANCE.getChronology(new TimeOfDay(123L, BUDDHIST), (Chronology) null));
    }finally{__CLR4_4_116hw16hwlc8azx08.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetPartialValues() throws Exception {__CLR4_4_116hw16hwlc8azx08.R.globalSliceStart(getClass().getName(),55108);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jrzqzq16is();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116hw16hwlc8azx08.R.rethrow($CLV_t2$);}finally{__CLR4_4_116hw16hwlc8azx08.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadablePartialConverter.testGetPartialValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55108,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jrzqzq16is() throws Exception{try{__CLR4_4_116hw16hwlc8azx08.R.inc(55108);
        __CLR4_4_116hw16hwlc8azx08.R.inc(55109);TimeOfDay tod = new TimeOfDay();
        __CLR4_4_116hw16hwlc8azx08.R.inc(55110);int[] expected = new int[] {1, 2, 3, 4};
        __CLR4_4_116hw16hwlc8azx08.R.inc(55111);int[] actual = ReadablePartialConverter.INSTANCE.getPartialValues(tod, new TimeOfDay(1, 2, 3, 4), ISOChronology.getInstance(PARIS));
        __CLR4_4_116hw16hwlc8azx08.R.inc(55112);assertEquals(true, Arrays.equals(expected, actual));
        
        __CLR4_4_116hw16hwlc8azx08.R.inc(55113);try {
            __CLR4_4_116hw16hwlc8azx08.R.inc(55114);ReadablePartialConverter.INSTANCE.getPartialValues(tod, new YearMonthDay(2005, 6, 9), JULIAN);
            __CLR4_4_116hw16hwlc8azx08.R.inc(55115);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_116hw16hwlc8azx08.R.inc(55116);try {
            __CLR4_4_116hw16hwlc8azx08.R.inc(55117);ReadablePartialConverter.INSTANCE.getPartialValues(tod, new MockTOD(), JULIAN);
            __CLR4_4_116hw16hwlc8azx08.R.inc(55118);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_116hw16hwlc8azx08.R.flushNeeded();}}

    static class MockTOD extends BasePartial {
        protected DateTimeField getField(int index, Chronology chrono) {try{__CLR4_4_116hw16hwlc8azx08.R.inc(55119);
            boolean __CLB4_4_1_bool0=false;__CLR4_4_116hw16hwlc8azx08.R.inc(55120);switch (index) {
                case 0:if (!__CLB4_4_1_bool0) {__CLR4_4_116hw16hwlc8azx08.R.inc(55121);__CLB4_4_1_bool0=true;}
                __CLR4_4_116hw16hwlc8azx08.R.inc(55122);return chrono.hourOfDay();
                case 1:if (!__CLB4_4_1_bool0) {__CLR4_4_116hw16hwlc8azx08.R.inc(55123);__CLB4_4_1_bool0=true;}
                __CLR4_4_116hw16hwlc8azx08.R.inc(55124);return chrono.minuteOfHour();
                case 2:if (!__CLB4_4_1_bool0) {__CLR4_4_116hw16hwlc8azx08.R.inc(55125);__CLB4_4_1_bool0=true;}
                __CLR4_4_116hw16hwlc8azx08.R.inc(55126);return chrono.year();
                case 3:if (!__CLB4_4_1_bool0) {__CLR4_4_116hw16hwlc8azx08.R.inc(55127);__CLB4_4_1_bool0=true;}
                __CLR4_4_116hw16hwlc8azx08.R.inc(55128);return chrono.era();
            }
            __CLR4_4_116hw16hwlc8azx08.R.inc(55129);return null;
        }finally{__CLR4_4_116hw16hwlc8azx08.R.flushNeeded();}}
        public int size() {try{__CLR4_4_116hw16hwlc8azx08.R.inc(55130);
            __CLR4_4_116hw16hwlc8azx08.R.inc(55131);return 4;
        }finally{__CLR4_4_116hw16hwlc8azx08.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    public void testToString() {__CLR4_4_116hw16hwlc8azx08.R.globalSliceStart(getClass().getName(),55132);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid16jg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116hw16hwlc8azx08.R.rethrow($CLV_t2$);}finally{__CLR4_4_116hw16hwlc8azx08.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadablePartialConverter.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55132,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid16jg(){try{__CLR4_4_116hw16hwlc8azx08.R.inc(55132);
        __CLR4_4_116hw16hwlc8azx08.R.inc(55133);assertEquals("Converter[org.joda.time.ReadablePartial]", ReadablePartialConverter.INSTANCE.toString());
    }finally{__CLR4_4_116hw16hwlc8azx08.R.flushNeeded();}}

}
