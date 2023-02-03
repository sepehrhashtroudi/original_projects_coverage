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
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.TimeOfDay;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a Junit unit test for CalendarConverter.
 *
 * @author Stephen Colebourne
 */
public class TestCalendarConverter extends TestCase {static class __CLR4_4_115ks15kslc8azww7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,53964,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone MOSCOW = DateTimeZone.forID("Europe/Moscow");
    private static Chronology JULIAN;
    private static Chronology ISO;

    public static void main(String[] args) {try{__CLR4_4_115ks15kslc8azww7.R.inc(53884);
        __CLR4_4_115ks15kslc8azww7.R.inc(53885);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_115ks15kslc8azww7.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_115ks15kslc8azww7.R.inc(53886);
        __CLR4_4_115ks15kslc8azww7.R.inc(53887);return new TestSuite(TestCalendarConverter.class);
    }finally{__CLR4_4_115ks15kslc8azww7.R.flushNeeded();}}

    public TestCalendarConverter(String name) {
        super(name);__CLR4_4_115ks15kslc8azww7.R.inc(53889);try{__CLR4_4_115ks15kslc8azww7.R.inc(53888);
    }finally{__CLR4_4_115ks15kslc8azww7.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_115ks15kslc8azww7.R.inc(53890);
        __CLR4_4_115ks15kslc8azww7.R.inc(53891);JULIAN = JulianChronology.getInstance();
        __CLR4_4_115ks15kslc8azww7.R.inc(53892);ISO = ISOChronology.getInstance();
    }finally{__CLR4_4_115ks15kslc8azww7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSingleton() throws Exception {__CLR4_4_115ks15kslc8azww7.R.globalSliceStart(getClass().getName(),53893);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jmk8jk15l1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115ks15kslc8azww7.R.rethrow($CLV_t2$);}finally{__CLR4_4_115ks15kslc8azww7.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestCalendarConverter.testSingleton",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53893,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jmk8jk15l1() throws Exception{try{__CLR4_4_115ks15kslc8azww7.R.inc(53893);
        __CLR4_4_115ks15kslc8azww7.R.inc(53894);Class cls = CalendarConverter.class;
        __CLR4_4_115ks15kslc8azww7.R.inc(53895);assertEquals(false, Modifier.isPublic(cls.getModifiers()));
        __CLR4_4_115ks15kslc8azww7.R.inc(53896);assertEquals(false, Modifier.isProtected(cls.getModifiers()));
        __CLR4_4_115ks15kslc8azww7.R.inc(53897);assertEquals(false, Modifier.isPrivate(cls.getModifiers()));
        
        __CLR4_4_115ks15kslc8azww7.R.inc(53898);Constructor con = cls.getDeclaredConstructor((Class[]) null);
        __CLR4_4_115ks15kslc8azww7.R.inc(53899);assertEquals(1, cls.getDeclaredConstructors().length);
        __CLR4_4_115ks15kslc8azww7.R.inc(53900);assertEquals(true, Modifier.isProtected(con.getModifiers()));
        
        __CLR4_4_115ks15kslc8azww7.R.inc(53901);Field fld = cls.getDeclaredField("INSTANCE");
        __CLR4_4_115ks15kslc8azww7.R.inc(53902);assertEquals(false, Modifier.isPublic(fld.getModifiers()));
        __CLR4_4_115ks15kslc8azww7.R.inc(53903);assertEquals(false, Modifier.isProtected(fld.getModifiers()));
        __CLR4_4_115ks15kslc8azww7.R.inc(53904);assertEquals(false, Modifier.isPrivate(fld.getModifiers()));
    }finally{__CLR4_4_115ks15kslc8azww7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSupportedType() throws Exception {__CLR4_4_115ks15kslc8azww7.R.globalSliceStart(getClass().getName(),53905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fthtzx15ld();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115ks15kslc8azww7.R.rethrow($CLV_t2$);}finally{__CLR4_4_115ks15kslc8azww7.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestCalendarConverter.testSupportedType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53905,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fthtzx15ld() throws Exception{try{__CLR4_4_115ks15kslc8azww7.R.inc(53905);
        __CLR4_4_115ks15kslc8azww7.R.inc(53906);assertEquals(Calendar.class, CalendarConverter.INSTANCE.getSupportedType());
    }finally{__CLR4_4_115ks15kslc8azww7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetInstantMillis_Object_Chronology() throws Exception {__CLR4_4_115ks15kslc8azww7.R.globalSliceStart(getClass().getName(),53907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12gh1ib15lf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115ks15kslc8azww7.R.rethrow($CLV_t2$);}finally{__CLR4_4_115ks15kslc8azww7.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestCalendarConverter.testGetInstantMillis_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53907,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12gh1ib15lf() throws Exception{try{__CLR4_4_115ks15kslc8azww7.R.inc(53907);
        __CLR4_4_115ks15kslc8azww7.R.inc(53908);GregorianCalendar cal = new GregorianCalendar();
        __CLR4_4_115ks15kslc8azww7.R.inc(53909);cal.setTime(new Date(123L));
        __CLR4_4_115ks15kslc8azww7.R.inc(53910);assertEquals(123L, CalendarConverter.INSTANCE.getInstantMillis(cal, JULIAN));
        __CLR4_4_115ks15kslc8azww7.R.inc(53911);assertEquals(123L, cal.getTime().getTime());
    }finally{__CLR4_4_115ks15kslc8azww7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetChronology_Object_Zone() throws Exception {__CLR4_4_115ks15kslc8azww7.R.globalSliceStart(getClass().getName(),53912);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nbwmeo15lk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115ks15kslc8azww7.R.rethrow($CLV_t2$);}finally{__CLR4_4_115ks15kslc8azww7.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestCalendarConverter.testGetChronology_Object_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53912,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nbwmeo15lk() throws Exception{try{__CLR4_4_115ks15kslc8azww7.R.inc(53912);
        __CLR4_4_115ks15kslc8azww7.R.inc(53913);GregorianCalendar cal = new GregorianCalendar(TimeZone.getTimeZone("Europe/Paris"));
        __CLR4_4_115ks15kslc8azww7.R.inc(53914);assertEquals(GJChronology.getInstance(MOSCOW), CalendarConverter.INSTANCE.getChronology(cal, MOSCOW));
        
        __CLR4_4_115ks15kslc8azww7.R.inc(53915);cal = new GregorianCalendar(TimeZone.getTimeZone("Europe/Moscow"));
        __CLR4_4_115ks15kslc8azww7.R.inc(53916);assertEquals(GJChronology.getInstance(), CalendarConverter.INSTANCE.getChronology(cal, (DateTimeZone) null));
        
        __CLR4_4_115ks15kslc8azww7.R.inc(53917);cal = new GregorianCalendar(TimeZone.getTimeZone("Europe/Moscow"));
        __CLR4_4_115ks15kslc8azww7.R.inc(53918);cal.setGregorianChange(new Date(0L));
        __CLR4_4_115ks15kslc8azww7.R.inc(53919);assertEquals(GJChronology.getInstance(MOSCOW, 0L, 4), CalendarConverter.INSTANCE.getChronology(cal, MOSCOW));
        
        __CLR4_4_115ks15kslc8azww7.R.inc(53920);cal = new GregorianCalendar(TimeZone.getTimeZone("Europe/Moscow"));
        __CLR4_4_115ks15kslc8azww7.R.inc(53921);cal.setGregorianChange(new Date(Long.MAX_VALUE));
        __CLR4_4_115ks15kslc8azww7.R.inc(53922);assertEquals(JulianChronology.getInstance(PARIS), CalendarConverter.INSTANCE.getChronology(cal, PARIS));
        
        __CLR4_4_115ks15kslc8azww7.R.inc(53923);cal = new GregorianCalendar(TimeZone.getTimeZone("Europe/Moscow"));
        __CLR4_4_115ks15kslc8azww7.R.inc(53924);cal.setGregorianChange(new Date(Long.MIN_VALUE));
        __CLR4_4_115ks15kslc8azww7.R.inc(53925);assertEquals(GregorianChronology.getInstance(PARIS), CalendarConverter.INSTANCE.getChronology(cal, PARIS));
        
        __CLR4_4_115ks15kslc8azww7.R.inc(53926);Calendar uc = new MockUnknownCalendar(TimeZone.getTimeZone("Europe/Moscow"));
        __CLR4_4_115ks15kslc8azww7.R.inc(53927);assertEquals(ISOChronology.getInstance(PARIS), CalendarConverter.INSTANCE.getChronology(uc, PARIS));
        
        __CLR4_4_115ks15kslc8azww7.R.inc(53928);try {
            __CLR4_4_115ks15kslc8azww7.R.inc(53929);Calendar bc = (Calendar) Class.forName("sun.util.BuddhistCalendar").newInstance();
            __CLR4_4_115ks15kslc8azww7.R.inc(53930);bc.setTimeZone(TimeZone.getTimeZone("Europe/Moscow"));
            __CLR4_4_115ks15kslc8azww7.R.inc(53931);assertEquals(BuddhistChronology.getInstance(PARIS), CalendarConverter.INSTANCE.getChronology(bc, PARIS));
        } catch (ClassNotFoundException ex) {
            // ignore
        }
    }finally{__CLR4_4_115ks15kslc8azww7.R.flushNeeded();}}

    public void testGetChronology_Object_nullChronology() throws Exception {__CLR4_4_115ks15kslc8azww7.R.globalSliceStart(getClass().getName(),53932);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aqqm9p15m4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115ks15kslc8azww7.R.rethrow($CLV_t2$);}finally{__CLR4_4_115ks15kslc8azww7.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestCalendarConverter.testGetChronology_Object_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53932,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aqqm9p15m4() throws Exception{try{__CLR4_4_115ks15kslc8azww7.R.inc(53932);
        __CLR4_4_115ks15kslc8azww7.R.inc(53933);GregorianCalendar cal = new GregorianCalendar(TimeZone.getTimeZone("Europe/Paris"));
        __CLR4_4_115ks15kslc8azww7.R.inc(53934);assertEquals(GJChronology.getInstance(PARIS), CalendarConverter.INSTANCE.getChronology(cal, (Chronology) null));
        
        __CLR4_4_115ks15kslc8azww7.R.inc(53935);cal = new GregorianCalendar(TimeZone.getTimeZone("Europe/Moscow"));
        __CLR4_4_115ks15kslc8azww7.R.inc(53936);cal.setGregorianChange(new Date(0L));
        __CLR4_4_115ks15kslc8azww7.R.inc(53937);assertEquals(GJChronology.getInstance(MOSCOW, 0L, 4), CalendarConverter.INSTANCE.getChronology(cal, (Chronology) null));
        
        __CLR4_4_115ks15kslc8azww7.R.inc(53938);cal = new GregorianCalendar(TimeZone.getTimeZone("Europe/Moscow"));
        __CLR4_4_115ks15kslc8azww7.R.inc(53939);cal.setGregorianChange(new Date(Long.MAX_VALUE));
        __CLR4_4_115ks15kslc8azww7.R.inc(53940);assertEquals(JulianChronology.getInstance(MOSCOW), CalendarConverter.INSTANCE.getChronology(cal, (Chronology) null));
        
        __CLR4_4_115ks15kslc8azww7.R.inc(53941);cal = new GregorianCalendar(TimeZone.getTimeZone("Europe/Moscow"));
        __CLR4_4_115ks15kslc8azww7.R.inc(53942);cal.setGregorianChange(new Date(Long.MIN_VALUE));
        __CLR4_4_115ks15kslc8azww7.R.inc(53943);assertEquals(GregorianChronology.getInstance(MOSCOW), CalendarConverter.INSTANCE.getChronology(cal, (Chronology) null));
        
        __CLR4_4_115ks15kslc8azww7.R.inc(53944);cal = new GregorianCalendar(new MockUnknownTimeZone());
        __CLR4_4_115ks15kslc8azww7.R.inc(53945);assertEquals(GJChronology.getInstance(), CalendarConverter.INSTANCE.getChronology(cal, (Chronology) null));
        
        __CLR4_4_115ks15kslc8azww7.R.inc(53946);Calendar uc = new MockUnknownCalendar(TimeZone.getTimeZone("Europe/Moscow"));
        __CLR4_4_115ks15kslc8azww7.R.inc(53947);assertEquals(ISOChronology.getInstance(MOSCOW), CalendarConverter.INSTANCE.getChronology(uc, (Chronology) null));
        
        __CLR4_4_115ks15kslc8azww7.R.inc(53948);try {
            __CLR4_4_115ks15kslc8azww7.R.inc(53949);Calendar bc = (Calendar) Class.forName("sun.util.BuddhistCalendar").newInstance();
            __CLR4_4_115ks15kslc8azww7.R.inc(53950);bc.setTimeZone(TimeZone.getTimeZone("Europe/Moscow"));
            __CLR4_4_115ks15kslc8azww7.R.inc(53951);assertEquals(BuddhistChronology.getInstance(MOSCOW), CalendarConverter.INSTANCE.getChronology(bc, (Chronology) null));
        } catch (ClassNotFoundException ex) {
            // ignore
        }
    }finally{__CLR4_4_115ks15kslc8azww7.R.flushNeeded();}}

    public void testGetChronology_Object_Chronology() throws Exception {__CLR4_4_115ks15kslc8azww7.R.globalSliceStart(getClass().getName(),53952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u5zpek15mo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115ks15kslc8azww7.R.rethrow($CLV_t2$);}finally{__CLR4_4_115ks15kslc8azww7.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestCalendarConverter.testGetChronology_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53952,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u5zpek15mo() throws Exception{try{__CLR4_4_115ks15kslc8azww7.R.inc(53952);
        __CLR4_4_115ks15kslc8azww7.R.inc(53953);GregorianCalendar cal = new GregorianCalendar(TimeZone.getTimeZone("Europe/Paris"));
        __CLR4_4_115ks15kslc8azww7.R.inc(53954);assertEquals(JULIAN, CalendarConverter.INSTANCE.getChronology(cal, JULIAN));
    }finally{__CLR4_4_115ks15kslc8azww7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetPartialValues() throws Exception {__CLR4_4_115ks15kslc8azww7.R.globalSliceStart(getClass().getName(),53955);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jrzqzq15mr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115ks15kslc8azww7.R.rethrow($CLV_t2$);}finally{__CLR4_4_115ks15kslc8azww7.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestCalendarConverter.testGetPartialValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53955,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jrzqzq15mr() throws Exception{try{__CLR4_4_115ks15kslc8azww7.R.inc(53955);
        __CLR4_4_115ks15kslc8azww7.R.inc(53956);GregorianCalendar cal = new GregorianCalendar();
        __CLR4_4_115ks15kslc8azww7.R.inc(53957);cal.setTime(new Date(12345678L));
        __CLR4_4_115ks15kslc8azww7.R.inc(53958);TimeOfDay tod = new TimeOfDay();
        __CLR4_4_115ks15kslc8azww7.R.inc(53959);int[] expected = ISO.get(tod, 12345678L);
        __CLR4_4_115ks15kslc8azww7.R.inc(53960);int[] actual = CalendarConverter.INSTANCE.getPartialValues(tod, cal, ISO);
        __CLR4_4_115ks15kslc8azww7.R.inc(53961);assertEquals(true, Arrays.equals(expected, actual));
    }finally{__CLR4_4_115ks15kslc8azww7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString() {__CLR4_4_115ks15kslc8azww7.R.globalSliceStart(getClass().getName(),53962);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid15my();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_115ks15kslc8azww7.R.rethrow($CLV_t2$);}finally{__CLR4_4_115ks15kslc8azww7.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestCalendarConverter.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53962,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid15my(){try{__CLR4_4_115ks15kslc8azww7.R.inc(53962);
        __CLR4_4_115ks15kslc8azww7.R.inc(53963);assertEquals("Converter[java.util.Calendar]", CalendarConverter.INSTANCE.toString());
    }finally{__CLR4_4_115ks15kslc8azww7.R.flushNeeded();}}

}
