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
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.TimeOfDay;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a Junit unit test for ReadableInstantConverter.
 *
 * @author Stephen Colebourne
 */
public class TestReadableInstantConverter extends TestCase {static class __CLR4_4_116dt16dtlc8azwzm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,54986,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static Chronology JULIAN;
    private static Chronology ISO;
    
    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_116dt16dtlc8azwzm.R.inc(54929);
        __CLR4_4_116dt16dtlc8azwzm.R.inc(54930);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_116dt16dtlc8azwzm.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_116dt16dtlc8azwzm.R.inc(54931);
        __CLR4_4_116dt16dtlc8azwzm.R.inc(54932);return new TestSuite(TestReadableInstantConverter.class);
    }finally{__CLR4_4_116dt16dtlc8azwzm.R.flushNeeded();}}

    public TestReadableInstantConverter(String name) {
        super(name);__CLR4_4_116dt16dtlc8azwzm.R.inc(54934);try{__CLR4_4_116dt16dtlc8azwzm.R.inc(54933);
    }finally{__CLR4_4_116dt16dtlc8azwzm.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_116dt16dtlc8azwzm.R.inc(54935);
        __CLR4_4_116dt16dtlc8azwzm.R.inc(54936);JULIAN = JulianChronology.getInstance();
        __CLR4_4_116dt16dtlc8azwzm.R.inc(54937);ISO = ISOChronology.getInstance();
    }finally{__CLR4_4_116dt16dtlc8azwzm.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSingleton() throws Exception {__CLR4_4_116dt16dtlc8azwzm.R.globalSliceStart(getClass().getName(),54938);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jmk8jk16e2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116dt16dtlc8azwzm.R.rethrow($CLV_t2$);}finally{__CLR4_4_116dt16dtlc8azwzm.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableInstantConverter.testSingleton",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54938,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jmk8jk16e2() throws Exception{try{__CLR4_4_116dt16dtlc8azwzm.R.inc(54938);
        __CLR4_4_116dt16dtlc8azwzm.R.inc(54939);Class cls = ReadableInstantConverter.class;
        __CLR4_4_116dt16dtlc8azwzm.R.inc(54940);assertEquals(false, Modifier.isPublic(cls.getModifiers()));
        __CLR4_4_116dt16dtlc8azwzm.R.inc(54941);assertEquals(false, Modifier.isProtected(cls.getModifiers()));
        __CLR4_4_116dt16dtlc8azwzm.R.inc(54942);assertEquals(false, Modifier.isPrivate(cls.getModifiers()));
        
        __CLR4_4_116dt16dtlc8azwzm.R.inc(54943);Constructor con = cls.getDeclaredConstructor((Class[]) null);
        __CLR4_4_116dt16dtlc8azwzm.R.inc(54944);assertEquals(1, cls.getDeclaredConstructors().length);
        __CLR4_4_116dt16dtlc8azwzm.R.inc(54945);assertEquals(true, Modifier.isProtected(con.getModifiers()));
        
        __CLR4_4_116dt16dtlc8azwzm.R.inc(54946);Field fld = cls.getDeclaredField("INSTANCE");
        __CLR4_4_116dt16dtlc8azwzm.R.inc(54947);assertEquals(false, Modifier.isPublic(fld.getModifiers()));
        __CLR4_4_116dt16dtlc8azwzm.R.inc(54948);assertEquals(false, Modifier.isProtected(fld.getModifiers()));
        __CLR4_4_116dt16dtlc8azwzm.R.inc(54949);assertEquals(false, Modifier.isPrivate(fld.getModifiers()));
    }finally{__CLR4_4_116dt16dtlc8azwzm.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSupportedType() throws Exception {__CLR4_4_116dt16dtlc8azwzm.R.globalSliceStart(getClass().getName(),54950);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fthtzx16ee();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116dt16dtlc8azwzm.R.rethrow($CLV_t2$);}finally{__CLR4_4_116dt16dtlc8azwzm.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableInstantConverter.testSupportedType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54950,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fthtzx16ee() throws Exception{try{__CLR4_4_116dt16dtlc8azwzm.R.inc(54950);
        __CLR4_4_116dt16dtlc8azwzm.R.inc(54951);assertEquals(ReadableInstant.class, ReadableInstantConverter.INSTANCE.getSupportedType());
    }finally{__CLR4_4_116dt16dtlc8azwzm.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetInstantMillis_Object_Chronology() throws Exception {__CLR4_4_116dt16dtlc8azwzm.R.globalSliceStart(getClass().getName(),54952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12gh1ib16eg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116dt16dtlc8azwzm.R.rethrow($CLV_t2$);}finally{__CLR4_4_116dt16dtlc8azwzm.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableInstantConverter.testGetInstantMillis_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54952,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12gh1ib16eg() throws Exception{try{__CLR4_4_116dt16dtlc8azwzm.R.inc(54952);
        __CLR4_4_116dt16dtlc8azwzm.R.inc(54953);assertEquals(123L, ReadableInstantConverter.INSTANCE.getInstantMillis(new Instant(123L), JULIAN));
        __CLR4_4_116dt16dtlc8azwzm.R.inc(54954);assertEquals(123L, ReadableInstantConverter.INSTANCE.getInstantMillis(new DateTime(123L), JULIAN));
        __CLR4_4_116dt16dtlc8azwzm.R.inc(54955);assertEquals(123L, ReadableInstantConverter.INSTANCE.getInstantMillis(new Instant(123L), (Chronology) null));
        __CLR4_4_116dt16dtlc8azwzm.R.inc(54956);assertEquals(123L, ReadableInstantConverter.INSTANCE.getInstantMillis(new DateTime(123L), (Chronology) null));
    }finally{__CLR4_4_116dt16dtlc8azwzm.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetChronology_Object_Zone() throws Exception {__CLR4_4_116dt16dtlc8azwzm.R.globalSliceStart(getClass().getName(),54957);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nbwmeo16el();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116dt16dtlc8azwzm.R.rethrow($CLV_t2$);}finally{__CLR4_4_116dt16dtlc8azwzm.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableInstantConverter.testGetChronology_Object_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54957,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nbwmeo16el() throws Exception{try{__CLR4_4_116dt16dtlc8azwzm.R.inc(54957);
        __CLR4_4_116dt16dtlc8azwzm.R.inc(54958);assertEquals(ISO_PARIS, ReadableInstantConverter.INSTANCE.getChronology(new Instant(123L), PARIS));
        __CLR4_4_116dt16dtlc8azwzm.R.inc(54959);assertEquals(ISO_PARIS, ReadableInstantConverter.INSTANCE.getChronology(new DateTime(123L), PARIS));
        __CLR4_4_116dt16dtlc8azwzm.R.inc(54960);assertEquals(ISO, ReadableInstantConverter.INSTANCE.getChronology(new Instant(123L), DateTimeZone.getDefault()));
        __CLR4_4_116dt16dtlc8azwzm.R.inc(54961);assertEquals(ISO, ReadableInstantConverter.INSTANCE.getChronology(new DateTime(123L), DateTimeZone.getDefault()));
        __CLR4_4_116dt16dtlc8azwzm.R.inc(54962);assertEquals(ISO, ReadableInstantConverter.INSTANCE.getChronology(new Instant(123L), (DateTimeZone) null));
        __CLR4_4_116dt16dtlc8azwzm.R.inc(54963);assertEquals(ISO, ReadableInstantConverter.INSTANCE.getChronology(new DateTime(123L), (DateTimeZone) null));
        
        __CLR4_4_116dt16dtlc8azwzm.R.inc(54964);assertEquals(ISO_PARIS, ReadableInstantConverter.INSTANCE.getChronology(new DateTime(123L, new MockBadChronology()), PARIS));
        
        __CLR4_4_116dt16dtlc8azwzm.R.inc(54965);MutableDateTime mdt = new MutableDateTime() {
            public Chronology getChronology() {try{__CLR4_4_116dt16dtlc8azwzm.R.inc(54966);
                __CLR4_4_116dt16dtlc8azwzm.R.inc(54967);return null; // bad
            }finally{__CLR4_4_116dt16dtlc8azwzm.R.flushNeeded();}}
        };
        __CLR4_4_116dt16dtlc8azwzm.R.inc(54968);assertEquals(ISO_PARIS, ReadableInstantConverter.INSTANCE.getChronology(mdt, PARIS));
    }finally{__CLR4_4_116dt16dtlc8azwzm.R.flushNeeded();}}

    public void testGetChronology_Object_nullChronology() throws Exception {__CLR4_4_116dt16dtlc8azwzm.R.globalSliceStart(getClass().getName(),54969);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aqqm9p16ex();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116dt16dtlc8azwzm.R.rethrow($CLV_t2$);}finally{__CLR4_4_116dt16dtlc8azwzm.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableInstantConverter.testGetChronology_Object_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54969,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aqqm9p16ex() throws Exception{try{__CLR4_4_116dt16dtlc8azwzm.R.inc(54969);
        __CLR4_4_116dt16dtlc8azwzm.R.inc(54970);assertEquals(ISO.withUTC(), ReadableInstantConverter.INSTANCE.getChronology(new Instant(123L), (Chronology) null));
        __CLR4_4_116dt16dtlc8azwzm.R.inc(54971);assertEquals(ISO, ReadableInstantConverter.INSTANCE.getChronology(new DateTime(123L), (Chronology) null));
        
        __CLR4_4_116dt16dtlc8azwzm.R.inc(54972);MutableDateTime mdt = new MutableDateTime() {
            public Chronology getChronology() {try{__CLR4_4_116dt16dtlc8azwzm.R.inc(54973);
                __CLR4_4_116dt16dtlc8azwzm.R.inc(54974);return null; // bad
            }finally{__CLR4_4_116dt16dtlc8azwzm.R.flushNeeded();}}
        };
        __CLR4_4_116dt16dtlc8azwzm.R.inc(54975);assertEquals(ISO, ReadableInstantConverter.INSTANCE.getChronology(mdt, (Chronology) null));
    }finally{__CLR4_4_116dt16dtlc8azwzm.R.flushNeeded();}}

    public void testGetChronology_Object_Chronology() throws Exception {__CLR4_4_116dt16dtlc8azwzm.R.globalSliceStart(getClass().getName(),54976);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u5zpek16f4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116dt16dtlc8azwzm.R.rethrow($CLV_t2$);}finally{__CLR4_4_116dt16dtlc8azwzm.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableInstantConverter.testGetChronology_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54976,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u5zpek16f4() throws Exception{try{__CLR4_4_116dt16dtlc8azwzm.R.inc(54976);
        __CLR4_4_116dt16dtlc8azwzm.R.inc(54977);assertEquals(JULIAN, ReadableInstantConverter.INSTANCE.getChronology(new Instant(123L), JULIAN));
        __CLR4_4_116dt16dtlc8azwzm.R.inc(54978);assertEquals(JULIAN, ReadableInstantConverter.INSTANCE.getChronology(new DateTime(123L), JULIAN));
    }finally{__CLR4_4_116dt16dtlc8azwzm.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetPartialValues() throws Exception {__CLR4_4_116dt16dtlc8azwzm.R.globalSliceStart(getClass().getName(),54979);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jrzqzq16f7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116dt16dtlc8azwzm.R.rethrow($CLV_t2$);}finally{__CLR4_4_116dt16dtlc8azwzm.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableInstantConverter.testGetPartialValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54979,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jrzqzq16f7() throws Exception{try{__CLR4_4_116dt16dtlc8azwzm.R.inc(54979);
        __CLR4_4_116dt16dtlc8azwzm.R.inc(54980);TimeOfDay tod = new TimeOfDay();
        __CLR4_4_116dt16dtlc8azwzm.R.inc(54981);int[] expected = ISOChronology.getInstance().get(tod, 12345678L);
        __CLR4_4_116dt16dtlc8azwzm.R.inc(54982);int[] actual = ReadableInstantConverter.INSTANCE.getPartialValues(tod, new Instant(12345678L), ISOChronology.getInstance());
        __CLR4_4_116dt16dtlc8azwzm.R.inc(54983);assertEquals(true, Arrays.equals(expected, actual));
    }finally{__CLR4_4_116dt16dtlc8azwzm.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString() {__CLR4_4_116dt16dtlc8azwzm.R.globalSliceStart(getClass().getName(),54984);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid16fc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116dt16dtlc8azwzm.R.rethrow($CLV_t2$);}finally{__CLR4_4_116dt16dtlc8azwzm.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableInstantConverter.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54984,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid16fc(){try{__CLR4_4_116dt16dtlc8azwzm.R.inc(54984);
        __CLR4_4_116dt16dtlc8azwzm.R.inc(54985);assertEquals("Converter[org.joda.time.ReadableInstant]", ReadableInstantConverter.INSTANCE.toString());
    }finally{__CLR4_4_116dt16dtlc8azwzm.R.flushNeeded();}}

}
