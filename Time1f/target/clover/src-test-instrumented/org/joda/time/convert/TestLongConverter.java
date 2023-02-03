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
import org.joda.time.DateTimeZone;
import org.joda.time.TimeOfDay;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a Junit unit test for LongConverter.
 *
 * @author Stephen Colebourne
 */
public class TestLongConverter extends TestCase {static class __CLR4_4_1169a169alc8azwyr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,54807,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static Chronology JULIAN;
    private static Chronology ISO;
    
    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1169a169alc8azwyr.R.inc(54766);
        __CLR4_4_1169a169alc8azwyr.R.inc(54767);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1169a169alc8azwyr.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1169a169alc8azwyr.R.inc(54768);
        __CLR4_4_1169a169alc8azwyr.R.inc(54769);return new TestSuite(TestLongConverter.class);
    }finally{__CLR4_4_1169a169alc8azwyr.R.flushNeeded();}}

    public TestLongConverter(String name) {
        super(name);__CLR4_4_1169a169alc8azwyr.R.inc(54771);try{__CLR4_4_1169a169alc8azwyr.R.inc(54770);
    }finally{__CLR4_4_1169a169alc8azwyr.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1169a169alc8azwyr.R.inc(54772);
        __CLR4_4_1169a169alc8azwyr.R.inc(54773);JULIAN = JulianChronology.getInstance();
        __CLR4_4_1169a169alc8azwyr.R.inc(54774);ISO = ISOChronology.getInstance();
    }finally{__CLR4_4_1169a169alc8azwyr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSingleton() throws Exception {__CLR4_4_1169a169alc8azwyr.R.globalSliceStart(getClass().getName(),54775);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jmk8jk169j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1169a169alc8azwyr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1169a169alc8azwyr.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestLongConverter.testSingleton",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54775,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jmk8jk169j() throws Exception{try{__CLR4_4_1169a169alc8azwyr.R.inc(54775);
        __CLR4_4_1169a169alc8azwyr.R.inc(54776);Class cls = LongConverter.class;
        __CLR4_4_1169a169alc8azwyr.R.inc(54777);assertEquals(false, Modifier.isPublic(cls.getModifiers()));
        __CLR4_4_1169a169alc8azwyr.R.inc(54778);assertEquals(false, Modifier.isProtected(cls.getModifiers()));
        __CLR4_4_1169a169alc8azwyr.R.inc(54779);assertEquals(false, Modifier.isPrivate(cls.getModifiers()));
        
        __CLR4_4_1169a169alc8azwyr.R.inc(54780);Constructor con = cls.getDeclaredConstructor((Class[]) null);
        __CLR4_4_1169a169alc8azwyr.R.inc(54781);assertEquals(1, cls.getDeclaredConstructors().length);
        __CLR4_4_1169a169alc8azwyr.R.inc(54782);assertEquals(true, Modifier.isProtected(con.getModifiers()));
        
        __CLR4_4_1169a169alc8azwyr.R.inc(54783);Field fld = cls.getDeclaredField("INSTANCE");
        __CLR4_4_1169a169alc8azwyr.R.inc(54784);assertEquals(false, Modifier.isPublic(fld.getModifiers()));
        __CLR4_4_1169a169alc8azwyr.R.inc(54785);assertEquals(false, Modifier.isProtected(fld.getModifiers()));
        __CLR4_4_1169a169alc8azwyr.R.inc(54786);assertEquals(false, Modifier.isPrivate(fld.getModifiers()));
    }finally{__CLR4_4_1169a169alc8azwyr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSupportedType() throws Exception {__CLR4_4_1169a169alc8azwyr.R.globalSliceStart(getClass().getName(),54787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fthtzx169v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1169a169alc8azwyr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1169a169alc8azwyr.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestLongConverter.testSupportedType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54787,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fthtzx169v() throws Exception{try{__CLR4_4_1169a169alc8azwyr.R.inc(54787);
        __CLR4_4_1169a169alc8azwyr.R.inc(54788);assertEquals(Long.class, LongConverter.INSTANCE.getSupportedType());
    }finally{__CLR4_4_1169a169alc8azwyr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetInstantMillis_Object_Chronology() throws Exception {__CLR4_4_1169a169alc8azwyr.R.globalSliceStart(getClass().getName(),54789);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12gh1ib169x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1169a169alc8azwyr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1169a169alc8azwyr.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestLongConverter.testGetInstantMillis_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54789,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12gh1ib169x() throws Exception{try{__CLR4_4_1169a169alc8azwyr.R.inc(54789);
        __CLR4_4_1169a169alc8azwyr.R.inc(54790);assertEquals(123L, LongConverter.INSTANCE.getInstantMillis(new Long(123L), JULIAN));
        __CLR4_4_1169a169alc8azwyr.R.inc(54791);assertEquals(123L, LongConverter.INSTANCE.getInstantMillis(new Long(123L), (Chronology) null));
    }finally{__CLR4_4_1169a169alc8azwyr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetChronology_Object_Zone() throws Exception {__CLR4_4_1169a169alc8azwyr.R.globalSliceStart(getClass().getName(),54792);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nbwmeo16a0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1169a169alc8azwyr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1169a169alc8azwyr.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestLongConverter.testGetChronology_Object_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54792,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nbwmeo16a0() throws Exception{try{__CLR4_4_1169a169alc8azwyr.R.inc(54792);
        __CLR4_4_1169a169alc8azwyr.R.inc(54793);assertEquals(ISO_PARIS, LongConverter.INSTANCE.getChronology(new Long(123L), PARIS));
        __CLR4_4_1169a169alc8azwyr.R.inc(54794);assertEquals(ISO, LongConverter.INSTANCE.getChronology(new Long(123L), (DateTimeZone) null));
    }finally{__CLR4_4_1169a169alc8azwyr.R.flushNeeded();}}

    public void testGetChronology_Object_Chronology() throws Exception {__CLR4_4_1169a169alc8azwyr.R.globalSliceStart(getClass().getName(),54795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u5zpek16a3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1169a169alc8azwyr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1169a169alc8azwyr.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestLongConverter.testGetChronology_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54795,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u5zpek16a3() throws Exception{try{__CLR4_4_1169a169alc8azwyr.R.inc(54795);
        __CLR4_4_1169a169alc8azwyr.R.inc(54796);assertEquals(JULIAN, LongConverter.INSTANCE.getChronology(new Long(123L), JULIAN));
        __CLR4_4_1169a169alc8azwyr.R.inc(54797);assertEquals(ISO, LongConverter.INSTANCE.getChronology(new Long(123L), (Chronology) null));
    }finally{__CLR4_4_1169a169alc8azwyr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetPartialValues() throws Exception {__CLR4_4_1169a169alc8azwyr.R.globalSliceStart(getClass().getName(),54798);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jrzqzq16a6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1169a169alc8azwyr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1169a169alc8azwyr.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestLongConverter.testGetPartialValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54798,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jrzqzq16a6() throws Exception{try{__CLR4_4_1169a169alc8azwyr.R.inc(54798);
        __CLR4_4_1169a169alc8azwyr.R.inc(54799);TimeOfDay tod = new TimeOfDay();
        __CLR4_4_1169a169alc8azwyr.R.inc(54800);int[] expected = ISOChronology.getInstance().get(tod, 12345678L);
        __CLR4_4_1169a169alc8azwyr.R.inc(54801);int[] actual = LongConverter.INSTANCE.getPartialValues(tod, new Long(12345678L), ISOChronology.getInstance());
        __CLR4_4_1169a169alc8azwyr.R.inc(54802);assertEquals(true, Arrays.equals(expected, actual));
    }finally{__CLR4_4_1169a169alc8azwyr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetDurationMillis_Object() throws Exception {__CLR4_4_1169a169alc8azwyr.R.globalSliceStart(getClass().getName(),54803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i0aumf16ab();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1169a169alc8azwyr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1169a169alc8azwyr.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestLongConverter.testGetDurationMillis_Object",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54803,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i0aumf16ab() throws Exception{try{__CLR4_4_1169a169alc8azwyr.R.inc(54803);
        __CLR4_4_1169a169alc8azwyr.R.inc(54804);assertEquals(123L, LongConverter.INSTANCE.getDurationMillis(new Long(123L)));
    }finally{__CLR4_4_1169a169alc8azwyr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString() {__CLR4_4_1169a169alc8azwyr.R.globalSliceStart(getClass().getName(),54805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid16ad();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1169a169alc8azwyr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1169a169alc8azwyr.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestLongConverter.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54805,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid16ad(){try{__CLR4_4_1169a169alc8azwyr.R.inc(54805);
        __CLR4_4_1169a169alc8azwyr.R.inc(54806);assertEquals("Converter[java.lang.Long]", LongConverter.INSTANCE.toString());
    }finally{__CLR4_4_1169a169alc8azwyr.R.flushNeeded();}}

}
