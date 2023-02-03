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
import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.PeriodType;
import org.joda.time.TimeOfDay;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a Junit unit test for StringConverter.
 *
 * @author Stephen Colebourne
 */
public class TestStringConverter extends TestCase {static class __CLR4_4_116kl16kllc8azx1r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,55541,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone ONE_HOUR = DateTimeZone.forOffsetHours(1);
    private static final DateTimeZone SIX = DateTimeZone.forOffsetHours(6);
    private static final DateTimeZone SEVEN = DateTimeZone.forOffsetHours(7);
    private static final DateTimeZone EIGHT = DateTimeZone.forOffsetHours(8);
    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final Chronology ISO_EIGHT = ISOChronology.getInstance(EIGHT);
    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static final Chronology ISO_LONDON = ISOChronology.getInstance(LONDON);
    private static Chronology ISO;
    private static Chronology JULIAN;
    
    private DateTimeZone zone = null;
    private Locale locale = null;

    public static void main(String[] args) {try{__CLR4_4_116kl16kllc8azx1r.R.inc(55173);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55174);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_116kl16kllc8azx1r.R.inc(55175);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55176);return new TestSuite(TestStringConverter.class);
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}

    public TestStringConverter(String name) {
        super(name);__CLR4_4_116kl16kllc8azx1r.R.inc(55178);try{__CLR4_4_116kl16kllc8azx1r.R.inc(55177);
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_116kl16kllc8azx1r.R.inc(55179);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55180);zone = DateTimeZone.getDefault();
        __CLR4_4_116kl16kllc8azx1r.R.inc(55181);locale = Locale.getDefault();
        __CLR4_4_116kl16kllc8azx1r.R.inc(55182);DateTimeZone.setDefault(LONDON);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55183);Locale.setDefault(Locale.UK);
        
        __CLR4_4_116kl16kllc8azx1r.R.inc(55184);JULIAN = JulianChronology.getInstance();
        __CLR4_4_116kl16kllc8azx1r.R.inc(55185);ISO = ISOChronology.getInstance();
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_116kl16kllc8azx1r.R.inc(55186);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55187);DateTimeZone.setDefault(zone);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55188);Locale.setDefault(locale);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55189);zone = null;
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSingleton() throws Exception {__CLR4_4_116kl16kllc8azx1r.R.globalSliceStart(getClass().getName(),55190);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jmk8jk16l2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116kl16kllc8azx1r.R.rethrow($CLV_t2$);}finally{__CLR4_4_116kl16kllc8azx1r.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSingleton",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55190,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jmk8jk16l2() throws Exception{try{__CLR4_4_116kl16kllc8azx1r.R.inc(55190);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55191);Class cls = StringConverter.class;
        __CLR4_4_116kl16kllc8azx1r.R.inc(55192);assertEquals(false, Modifier.isPublic(cls.getModifiers()));
        __CLR4_4_116kl16kllc8azx1r.R.inc(55193);assertEquals(false, Modifier.isProtected(cls.getModifiers()));
        __CLR4_4_116kl16kllc8azx1r.R.inc(55194);assertEquals(false, Modifier.isPrivate(cls.getModifiers()));
        
        __CLR4_4_116kl16kllc8azx1r.R.inc(55195);Constructor con = cls.getDeclaredConstructor((Class[]) null);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55196);assertEquals(1, cls.getDeclaredConstructors().length);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55197);assertEquals(true, Modifier.isProtected(con.getModifiers()));
        
        __CLR4_4_116kl16kllc8azx1r.R.inc(55198);Field fld = cls.getDeclaredField("INSTANCE");
        __CLR4_4_116kl16kllc8azx1r.R.inc(55199);assertEquals(false, Modifier.isPublic(fld.getModifiers()));
        __CLR4_4_116kl16kllc8azx1r.R.inc(55200);assertEquals(false, Modifier.isProtected(fld.getModifiers()));
        __CLR4_4_116kl16kllc8azx1r.R.inc(55201);assertEquals(false, Modifier.isPrivate(fld.getModifiers()));
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSupportedType() throws Exception {__CLR4_4_116kl16kllc8azx1r.R.globalSliceStart(getClass().getName(),55202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fthtzx16le();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116kl16kllc8azx1r.R.rethrow($CLV_t2$);}finally{__CLR4_4_116kl16kllc8azx1r.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSupportedType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55202,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fthtzx16le() throws Exception{try{__CLR4_4_116kl16kllc8azx1r.R.inc(55202);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55203);assertEquals(String.class, StringConverter.INSTANCE.getSupportedType());
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetInstantMillis_Object() throws Exception {__CLR4_4_116kl16kllc8azx1r.R.globalSliceStart(getClass().getName(),55204);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1phnr7m16lg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116kl16kllc8azx1r.R.rethrow($CLV_t2$);}finally{__CLR4_4_116kl16kllc8azx1r.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetInstantMillis_Object",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55204,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1phnr7m16lg() throws Exception{try{__CLR4_4_116kl16kllc8azx1r.R.inc(55204);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55205);DateTime dt = new DateTime(2004, 6, 9, 12, 24, 48, 501, EIGHT);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55206);assertEquals(dt.getMillis(), StringConverter.INSTANCE.getInstantMillis("2004-06-09T12:24:48.501+08:00", ISO_EIGHT));
        
        __CLR4_4_116kl16kllc8azx1r.R.inc(55207);dt = new DateTime(2004, 1, 1, 0, 0, 0, 0, EIGHT);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55208);assertEquals(dt.getMillis(), StringConverter.INSTANCE.getInstantMillis("2004T+08:00", ISO_EIGHT));
        
        __CLR4_4_116kl16kllc8azx1r.R.inc(55209);dt = new DateTime(2004, 6, 1, 0, 0, 0, 0, EIGHT);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55210);assertEquals(dt.getMillis(), StringConverter.INSTANCE.getInstantMillis("2004-06T+08:00", ISO_EIGHT));
        
        __CLR4_4_116kl16kllc8azx1r.R.inc(55211);dt = new DateTime(2004, 6, 9, 0, 0, 0, 0, EIGHT);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55212);assertEquals(dt.getMillis(), StringConverter.INSTANCE.getInstantMillis("2004-06-09T+08:00", ISO_EIGHT));
        
        __CLR4_4_116kl16kllc8azx1r.R.inc(55213);dt = new DateTime(2004, 6, 9, 0, 0, 0, 0, EIGHT);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55214);assertEquals(dt.getMillis(), StringConverter.INSTANCE.getInstantMillis("2004-161T+08:00", ISO_EIGHT));
        
        __CLR4_4_116kl16kllc8azx1r.R.inc(55215);dt = new DateTime(2004, 6, 9, 0, 0, 0, 0, EIGHT);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55216);assertEquals(dt.getMillis(), StringConverter.INSTANCE.getInstantMillis("2004-W24-3T+08:00", ISO_EIGHT));
        
        __CLR4_4_116kl16kllc8azx1r.R.inc(55217);dt = new DateTime(2004, 6, 7, 0, 0, 0, 0, EIGHT);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55218);assertEquals(dt.getMillis(), StringConverter.INSTANCE.getInstantMillis("2004-W24T+08:00", ISO_EIGHT));
        
        __CLR4_4_116kl16kllc8azx1r.R.inc(55219);dt = new DateTime(2004, 6, 9, 12, 0, 0, 0, EIGHT);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55220);assertEquals(dt.getMillis(), StringConverter.INSTANCE.getInstantMillis("2004-06-09T12+08:00", ISO_EIGHT));
        
        __CLR4_4_116kl16kllc8azx1r.R.inc(55221);dt = new DateTime(2004, 6, 9, 12, 24, 0, 0, EIGHT);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55222);assertEquals(dt.getMillis(), StringConverter.INSTANCE.getInstantMillis("2004-06-09T12:24+08:00", ISO_EIGHT));
        
        __CLR4_4_116kl16kllc8azx1r.R.inc(55223);dt = new DateTime(2004, 6, 9, 12, 24, 48, 0, EIGHT);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55224);assertEquals(dt.getMillis(), StringConverter.INSTANCE.getInstantMillis("2004-06-09T12:24:48+08:00", ISO_EIGHT));
        
        __CLR4_4_116kl16kllc8azx1r.R.inc(55225);dt = new DateTime(2004, 6, 9, 12, 30, 0, 0, EIGHT);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55226);assertEquals(dt.getMillis(), StringConverter.INSTANCE.getInstantMillis("2004-06-09T12.5+08:00", ISO_EIGHT));
        
        __CLR4_4_116kl16kllc8azx1r.R.inc(55227);dt = new DateTime(2004, 6, 9, 12, 24, 30, 0, EIGHT);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55228);assertEquals(dt.getMillis(), StringConverter.INSTANCE.getInstantMillis("2004-06-09T12:24.5+08:00", ISO_EIGHT));
        
        __CLR4_4_116kl16kllc8azx1r.R.inc(55229);dt = new DateTime(2004, 6, 9, 12, 24, 48, 500, EIGHT);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55230);assertEquals(dt.getMillis(), StringConverter.INSTANCE.getInstantMillis("2004-06-09T12:24:48.5+08:00", ISO_EIGHT));
        
        __CLR4_4_116kl16kllc8azx1r.R.inc(55231);dt = new DateTime(2004, 6, 9, 12, 24, 48, 501);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55232);assertEquals(dt.getMillis(), StringConverter.INSTANCE.getInstantMillis("2004-06-09T12:24:48.501", ISO));
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}

    public void testGetInstantMillis_Object_Zone() throws Exception {__CLR4_4_116kl16kllc8azx1r.R.globalSliceStart(getClass().getName(),55233);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ane8tz16m9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116kl16kllc8azx1r.R.rethrow($CLV_t2$);}finally{__CLR4_4_116kl16kllc8azx1r.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetInstantMillis_Object_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55233,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ane8tz16m9() throws Exception{try{__CLR4_4_116kl16kllc8azx1r.R.inc(55233);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55234);DateTime dt = new DateTime(2004, 6, 9, 12, 24, 48, 501, PARIS);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55235);assertEquals(dt.getMillis(), StringConverter.INSTANCE.getInstantMillis("2004-06-09T12:24:48.501+02:00", ISO_PARIS));
        
        __CLR4_4_116kl16kllc8azx1r.R.inc(55236);dt = new DateTime(2004, 6, 9, 12, 24, 48, 501, PARIS);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55237);assertEquals(dt.getMillis(), StringConverter.INSTANCE.getInstantMillis("2004-06-09T12:24:48.501", ISO_PARIS));
        
        __CLR4_4_116kl16kllc8azx1r.R.inc(55238);dt = new DateTime(2004, 6, 9, 12, 24, 48, 501, LONDON);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55239);assertEquals(dt.getMillis(), StringConverter.INSTANCE.getInstantMillis("2004-06-09T12:24:48.501+01:00", ISO_LONDON));
        
        __CLR4_4_116kl16kllc8azx1r.R.inc(55240);dt = new DateTime(2004, 6, 9, 12, 24, 48, 501, LONDON);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55241);assertEquals(dt.getMillis(), StringConverter.INSTANCE.getInstantMillis("2004-06-09T12:24:48.501", ISO_LONDON));
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}

    public void testGetInstantMillis_Object_Chronology() throws Exception {__CLR4_4_116kl16kllc8azx1r.R.globalSliceStart(getClass().getName(),55242);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12gh1ib16mi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116kl16kllc8azx1r.R.rethrow($CLV_t2$);}finally{__CLR4_4_116kl16kllc8azx1r.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetInstantMillis_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55242,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12gh1ib16mi() throws Exception{try{__CLR4_4_116kl16kllc8azx1r.R.inc(55242);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55243);DateTime dt = new DateTime(2004, 6, 9, 12, 24, 48, 501, JulianChronology.getInstance(LONDON));
        __CLR4_4_116kl16kllc8azx1r.R.inc(55244);assertEquals(dt.getMillis(), StringConverter.INSTANCE.getInstantMillis("2004-06-09T12:24:48.501+01:00", JULIAN));
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}

    public void testGetInstantMillisInvalid() {__CLR4_4_116kl16kllc8azx1r.R.globalSliceStart(getClass().getName(),55245);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c2dn0b16ml();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116kl16kllc8azx1r.R.rethrow($CLV_t2$);}finally{__CLR4_4_116kl16kllc8azx1r.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetInstantMillisInvalid",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55245,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c2dn0b16ml(){try{__CLR4_4_116kl16kllc8azx1r.R.inc(55245);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55246);try {
            __CLR4_4_116kl16kllc8azx1r.R.inc(55247);StringConverter.INSTANCE.getInstantMillis("", (Chronology) null);
            __CLR4_4_116kl16kllc8azx1r.R.inc(55248);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_116kl16kllc8azx1r.R.inc(55249);try {
            __CLR4_4_116kl16kllc8azx1r.R.inc(55250);StringConverter.INSTANCE.getInstantMillis("X", (Chronology) null);
            __CLR4_4_116kl16kllc8azx1r.R.inc(55251);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetChronology_Object_Zone() throws Exception {__CLR4_4_116kl16kllc8azx1r.R.globalSliceStart(getClass().getName(),55252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nbwmeo16ms();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116kl16kllc8azx1r.R.rethrow($CLV_t2$);}finally{__CLR4_4_116kl16kllc8azx1r.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetChronology_Object_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55252,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nbwmeo16ms() throws Exception{try{__CLR4_4_116kl16kllc8azx1r.R.inc(55252);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55253);assertEquals(ISOChronology.getInstance(PARIS), StringConverter.INSTANCE.getChronology("2004-06-09T12:24:48.501+01:00", PARIS));
        __CLR4_4_116kl16kllc8azx1r.R.inc(55254);assertEquals(ISOChronology.getInstance(PARIS), StringConverter.INSTANCE.getChronology("2004-06-09T12:24:48.501", PARIS));
        __CLR4_4_116kl16kllc8azx1r.R.inc(55255);assertEquals(ISOChronology.getInstance(LONDON), StringConverter.INSTANCE.getChronology("2004-06-09T12:24:48.501+01:00", (DateTimeZone) null));
        __CLR4_4_116kl16kllc8azx1r.R.inc(55256);assertEquals(ISOChronology.getInstance(LONDON), StringConverter.INSTANCE.getChronology("2004-06-09T12:24:48.501", (DateTimeZone) null));
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}

    public void testGetChronology_Object_Chronology() throws Exception {__CLR4_4_116kl16kllc8azx1r.R.globalSliceStart(getClass().getName(),55257);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u5zpek16mx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116kl16kllc8azx1r.R.rethrow($CLV_t2$);}finally{__CLR4_4_116kl16kllc8azx1r.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetChronology_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55257,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u5zpek16mx() throws Exception{try{__CLR4_4_116kl16kllc8azx1r.R.inc(55257);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55258);assertEquals(JulianChronology.getInstance(LONDON), StringConverter.INSTANCE.getChronology("2004-06-09T12:24:48.501+01:00", JULIAN));
        __CLR4_4_116kl16kllc8azx1r.R.inc(55259);assertEquals(JulianChronology.getInstance(LONDON), StringConverter.INSTANCE.getChronology("2004-06-09T12:24:48.501", JULIAN));
        __CLR4_4_116kl16kllc8azx1r.R.inc(55260);assertEquals(ISOChronology.getInstance(LONDON), StringConverter.INSTANCE.getChronology("2004-06-09T12:24:48.501+01:00", (Chronology) null));
        __CLR4_4_116kl16kllc8azx1r.R.inc(55261);assertEquals(ISOChronology.getInstance(LONDON), StringConverter.INSTANCE.getChronology("2004-06-09T12:24:48.501", (Chronology) null));
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetPartialValues() throws Exception {__CLR4_4_116kl16kllc8azx1r.R.globalSliceStart(getClass().getName(),55262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jrzqzq16n2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116kl16kllc8azx1r.R.rethrow($CLV_t2$);}finally{__CLR4_4_116kl16kllc8azx1r.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetPartialValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55262,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jrzqzq16n2() throws Exception{try{__CLR4_4_116kl16kllc8azx1r.R.inc(55262);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55263);TimeOfDay tod = new TimeOfDay();
        __CLR4_4_116kl16kllc8azx1r.R.inc(55264);int[] expected = new int[] {3, 4, 5, 6};
        __CLR4_4_116kl16kllc8azx1r.R.inc(55265);int[] actual = StringConverter.INSTANCE.getPartialValues(tod, "T03:04:05.006", ISOChronology.getInstance());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55266);assertEquals(true, Arrays.equals(expected, actual));
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetDateTime() throws Exception {__CLR4_4_116kl16kllc8azx1r.R.globalSliceStart(getClass().getName(),55267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fkmykm16n7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116kl16kllc8azx1r.R.rethrow($CLV_t2$);}finally{__CLR4_4_116kl16kllc8azx1r.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55267,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fkmykm16n7() throws Exception{try{__CLR4_4_116kl16kllc8azx1r.R.inc(55267);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55268);DateTime base = new DateTime(2004, 6, 9, 12, 24, 48, 501, PARIS);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55269);DateTime test = new DateTime(base.toString(), PARIS);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55270);assertEquals(base, test);
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}

    public void testGetDateTime1() throws Exception {__CLR4_4_116kl16kllc8azx1r.R.globalSliceStart(getClass().getName(),55271);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p3fnqx16nb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116kl16kllc8azx1r.R.rethrow($CLV_t2$);}finally{__CLR4_4_116kl16kllc8azx1r.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetDateTime1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55271,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p3fnqx16nb() throws Exception{try{__CLR4_4_116kl16kllc8azx1r.R.inc(55271);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55272);DateTime test = new DateTime("2004-06-09T12:24:48.501+01:00");
        __CLR4_4_116kl16kllc8azx1r.R.inc(55273);assertEquals(2004, test.getYear());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55274);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55275);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55276);assertEquals(12, test.getHourOfDay());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55277);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55278);assertEquals(48, test.getSecondOfMinute());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55279);assertEquals(501, test.getMillisOfSecond());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55280);assertEquals(LONDON, test.getZone());
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}

    public void testGetDateTime2() throws Exception {__CLR4_4_116kl16kllc8azx1r.R.globalSliceStart(getClass().getName(),55281);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1scfmje16nl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116kl16kllc8azx1r.R.rethrow($CLV_t2$);}finally{__CLR4_4_116kl16kllc8azx1r.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetDateTime2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55281,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1scfmje16nl() throws Exception{try{__CLR4_4_116kl16kllc8azx1r.R.inc(55281);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55282);DateTime test = new DateTime("2004-06-09T12:24:48.501");
        __CLR4_4_116kl16kllc8azx1r.R.inc(55283);assertEquals(2004, test.getYear());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55284);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55285);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55286);assertEquals(12, test.getHourOfDay());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55287);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55288);assertEquals(48, test.getSecondOfMinute());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55289);assertEquals(501, test.getMillisOfSecond());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55290);assertEquals(LONDON, test.getZone());
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}

    public void testGetDateTime3() throws Exception {__CLR4_4_116kl16kllc8azx1r.R.globalSliceStart(getClass().getName(),55291);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vlflbv16nv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116kl16kllc8azx1r.R.rethrow($CLV_t2$);}finally{__CLR4_4_116kl16kllc8azx1r.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetDateTime3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55291,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vlflbv16nv() throws Exception{try{__CLR4_4_116kl16kllc8azx1r.R.inc(55291);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55292);DateTime test = new DateTime("2004-06-09T12:24:48.501+02:00", PARIS);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55293);assertEquals(2004, test.getYear());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55294);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55295);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55296);assertEquals(12, test.getHourOfDay());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55297);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55298);assertEquals(48, test.getSecondOfMinute());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55299);assertEquals(501, test.getMillisOfSecond());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55300);assertEquals(PARIS, test.getZone());
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}

    public void testGetDateTime4() throws Exception {__CLR4_4_116kl16kllc8azx1r.R.globalSliceStart(getClass().getName(),55301);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yufk4c16o5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116kl16kllc8azx1r.R.rethrow($CLV_t2$);}finally{__CLR4_4_116kl16kllc8azx1r.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetDateTime4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55301,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yufk4c16o5() throws Exception{try{__CLR4_4_116kl16kllc8azx1r.R.inc(55301);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55302);DateTime test = new DateTime("2004-06-09T12:24:48.501", PARIS);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55303);assertEquals(2004, test.getYear());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55304);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55305);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55306);assertEquals(12, test.getHourOfDay());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55307);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55308);assertEquals(48, test.getSecondOfMinute());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55309);assertEquals(501, test.getMillisOfSecond());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55310);assertEquals(PARIS, test.getZone());
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}

    public void testGetDateTime5() throws Exception {__CLR4_4_116kl16kllc8azx1r.R.globalSliceStart(getClass().getName(),55311);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wxoj2b16of();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116kl16kllc8azx1r.R.rethrow($CLV_t2$);}finally{__CLR4_4_116kl16kllc8azx1r.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetDateTime5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55311,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wxoj2b16of() throws Exception{try{__CLR4_4_116kl16kllc8azx1r.R.inc(55311);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55312);DateTime test = new DateTime("2004-06-09T12:24:48.501+02:00", JulianChronology.getInstance(PARIS));
        __CLR4_4_116kl16kllc8azx1r.R.inc(55313);assertEquals(2004, test.getYear());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55314);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55315);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55316);assertEquals(12, test.getHourOfDay());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55317);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55318);assertEquals(48, test.getSecondOfMinute());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55319);assertEquals(501, test.getMillisOfSecond());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55320);assertEquals(PARIS, test.getZone());
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}

    public void testGetDateTime6() throws Exception {__CLR4_4_116kl16kllc8azx1r.R.globalSliceStart(getClass().getName(),55321);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1took9u16op();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116kl16kllc8azx1r.R.rethrow($CLV_t2$);}finally{__CLR4_4_116kl16kllc8azx1r.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetDateTime6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55321,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1took9u16op() throws Exception{try{__CLR4_4_116kl16kllc8azx1r.R.inc(55321);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55322);DateTime test = new DateTime("2004-06-09T12:24:48.501", JulianChronology.getInstance(PARIS));
        __CLR4_4_116kl16kllc8azx1r.R.inc(55323);assertEquals(2004, test.getYear());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55324);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55325);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55326);assertEquals(12, test.getHourOfDay());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55327);assertEquals(24, test.getMinuteOfHour());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55328);assertEquals(48, test.getSecondOfMinute());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55329);assertEquals(501, test.getMillisOfSecond());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55330);assertEquals(PARIS, test.getZone());
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetDurationMillis_Object1() throws Exception {__CLR4_4_116kl16kllc8azx1r.R.globalSliceStart(getClass().getName(),55331);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tjw7bs16oz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116kl16kllc8azx1r.R.rethrow($CLV_t2$);}finally{__CLR4_4_116kl16kllc8azx1r.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetDurationMillis_Object1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55331,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tjw7bs16oz() throws Exception{try{__CLR4_4_116kl16kllc8azx1r.R.inc(55331);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55332);long millis = StringConverter.INSTANCE.getDurationMillis("PT12.345S");
        __CLR4_4_116kl16kllc8azx1r.R.inc(55333);assertEquals(12345, millis);
        
        __CLR4_4_116kl16kllc8azx1r.R.inc(55334);millis = StringConverter.INSTANCE.getDurationMillis("pt12.345s");
        __CLR4_4_116kl16kllc8azx1r.R.inc(55335);assertEquals(12345, millis);
        
        __CLR4_4_116kl16kllc8azx1r.R.inc(55336);millis = StringConverter.INSTANCE.getDurationMillis("pt12s");
        __CLR4_4_116kl16kllc8azx1r.R.inc(55337);assertEquals(12000, millis);
        
        __CLR4_4_116kl16kllc8azx1r.R.inc(55338);millis = StringConverter.INSTANCE.getDurationMillis("pt12.s");
        __CLR4_4_116kl16kllc8azx1r.R.inc(55339);assertEquals(12000, millis);
        
        __CLR4_4_116kl16kllc8azx1r.R.inc(55340);millis = StringConverter.INSTANCE.getDurationMillis("pt-12.32s");
        __CLR4_4_116kl16kllc8azx1r.R.inc(55341);assertEquals(-12320, millis);
        
        __CLR4_4_116kl16kllc8azx1r.R.inc(55342);millis = StringConverter.INSTANCE.getDurationMillis("pt-0.32s");
        __CLR4_4_116kl16kllc8azx1r.R.inc(55343);assertEquals(-320, millis);

        __CLR4_4_116kl16kllc8azx1r.R.inc(55344);millis = StringConverter.INSTANCE.getDurationMillis("pt-0.0s");
        __CLR4_4_116kl16kllc8azx1r.R.inc(55345);assertEquals(0, millis);

        __CLR4_4_116kl16kllc8azx1r.R.inc(55346);millis = StringConverter.INSTANCE.getDurationMillis("pt0.0s");
        __CLR4_4_116kl16kllc8azx1r.R.inc(55347);assertEquals(0, millis);

        __CLR4_4_116kl16kllc8azx1r.R.inc(55348);millis = StringConverter.INSTANCE.getDurationMillis("pt12.3456s");
        __CLR4_4_116kl16kllc8azx1r.R.inc(55349);assertEquals(12345, millis);
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}

    public void testGetDurationMillis_Object2() throws Exception {__CLR4_4_116kl16kllc8azx1r.R.globalSliceStart(getClass().getName(),55350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wsw64916pi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116kl16kllc8azx1r.R.rethrow($CLV_t2$);}finally{__CLR4_4_116kl16kllc8azx1r.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetDurationMillis_Object2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55350,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wsw64916pi() throws Exception{try{__CLR4_4_116kl16kllc8azx1r.R.inc(55350);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55351);try {
            __CLR4_4_116kl16kllc8azx1r.R.inc(55352);StringConverter.INSTANCE.getDurationMillis("P2Y6M9DXYZ");
            __CLR4_4_116kl16kllc8azx1r.R.inc(55353);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_116kl16kllc8azx1r.R.inc(55354);try {
            __CLR4_4_116kl16kllc8azx1r.R.inc(55355);StringConverter.INSTANCE.getDurationMillis("PTS");
            __CLR4_4_116kl16kllc8azx1r.R.inc(55356);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_116kl16kllc8azx1r.R.inc(55357);try {
            __CLR4_4_116kl16kllc8azx1r.R.inc(55358);StringConverter.INSTANCE.getDurationMillis("XT0S");
            __CLR4_4_116kl16kllc8azx1r.R.inc(55359);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_116kl16kllc8azx1r.R.inc(55360);try {
            __CLR4_4_116kl16kllc8azx1r.R.inc(55361);StringConverter.INSTANCE.getDurationMillis("PX0S");
            __CLR4_4_116kl16kllc8azx1r.R.inc(55362);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_116kl16kllc8azx1r.R.inc(55363);try {
            __CLR4_4_116kl16kllc8azx1r.R.inc(55364);StringConverter.INSTANCE.getDurationMillis("PT0X");
            __CLR4_4_116kl16kllc8azx1r.R.inc(55365);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_116kl16kllc8azx1r.R.inc(55366);try {
            __CLR4_4_116kl16kllc8azx1r.R.inc(55367);StringConverter.INSTANCE.getDurationMillis("PTXS");
            __CLR4_4_116kl16kllc8azx1r.R.inc(55368);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_116kl16kllc8azx1r.R.inc(55369);try {
            __CLR4_4_116kl16kllc8azx1r.R.inc(55370);StringConverter.INSTANCE.getDurationMillis("PT0.0.0S");
            __CLR4_4_116kl16kllc8azx1r.R.inc(55371);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_116kl16kllc8azx1r.R.inc(55372);try {
            __CLR4_4_116kl16kllc8azx1r.R.inc(55373);StringConverter.INSTANCE.getDurationMillis("PT0-00S");
            __CLR4_4_116kl16kllc8azx1r.R.inc(55374);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_116kl16kllc8azx1r.R.inc(55375);try {
            __CLR4_4_116kl16kllc8azx1r.R.inc(55376);StringConverter.INSTANCE.getDurationMillis("PT-.001S");
            __CLR4_4_116kl16kllc8azx1r.R.inc(55377);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetPeriodType_Object() throws Exception {__CLR4_4_116kl16kllc8azx1r.R.globalSliceStart(getClass().getName(),55378);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nzp2xm16qa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116kl16kllc8azx1r.R.rethrow($CLV_t2$);}finally{__CLR4_4_116kl16kllc8azx1r.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testGetPeriodType_Object",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55378,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nzp2xm16qa() throws Exception{try{__CLR4_4_116kl16kllc8azx1r.R.inc(55378);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55379);assertEquals(PeriodType.standard(),
            StringConverter.INSTANCE.getPeriodType("P2Y6M9D"));
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}

    public void testSetIntoPeriod_Object1() throws Exception {__CLR4_4_116kl16kllc8azx1r.R.globalSliceStart(getClass().getName(),55380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oyzab916qc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116kl16kllc8azx1r.R.rethrow($CLV_t2$);}finally{__CLR4_4_116kl16kllc8azx1r.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoPeriod_Object1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55380,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oyzab916qc() throws Exception{try{__CLR4_4_116kl16kllc8azx1r.R.inc(55380);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55381);MutablePeriod m = new MutablePeriod(PeriodType.yearMonthDayTime());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55382);StringConverter.INSTANCE.setInto(m, "P2Y6M9DT12H24M48S", null);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55383);assertEquals(2, m.getYears());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55384);assertEquals(6, m.getMonths());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55385);assertEquals(9, m.getDays());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55386);assertEquals(12, m.getHours());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55387);assertEquals(24, m.getMinutes());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55388);assertEquals(48, m.getSeconds());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55389);assertEquals(0, m.getMillis());
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}

    public void testSetIntoPeriod_Object2() throws Exception {__CLR4_4_116kl16kllc8azx1r.R.globalSliceStart(getClass().getName(),55390);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lpzbis16qm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116kl16kllc8azx1r.R.rethrow($CLV_t2$);}finally{__CLR4_4_116kl16kllc8azx1r.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoPeriod_Object2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55390,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lpzbis16qm() throws Exception{try{__CLR4_4_116kl16kllc8azx1r.R.inc(55390);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55391);MutablePeriod m = new MutablePeriod(PeriodType.yearWeekDayTime());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55392);StringConverter.INSTANCE.setInto(m, "P2Y4W3DT12H24M48S", null);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55393);assertEquals(2, m.getYears());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55394);assertEquals(4, m.getWeeks());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55395);assertEquals(3, m.getDays());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55396);assertEquals(12, m.getHours());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55397);assertEquals(24, m.getMinutes());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55398);assertEquals(48, m.getSeconds());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55399);assertEquals(0, m.getMillis());
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}        

    public void testSetIntoPeriod_Object3() throws Exception {__CLR4_4_116kl16kllc8azx1r.R.globalSliceStart(getClass().getName(),55400);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1igzcqb16qw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116kl16kllc8azx1r.R.rethrow($CLV_t2$);}finally{__CLR4_4_116kl16kllc8azx1r.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoPeriod_Object3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55400,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1igzcqb16qw() throws Exception{try{__CLR4_4_116kl16kllc8azx1r.R.inc(55400);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55401);MutablePeriod m = new MutablePeriod(PeriodType.yearWeekDayTime());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55402);StringConverter.INSTANCE.setInto(m, "P2Y4W3DT12H24M48.034S", null);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55403);assertEquals(2, m.getYears());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55404);assertEquals(4, m.getWeeks());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55405);assertEquals(3, m.getDays());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55406);assertEquals(12, m.getHours());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55407);assertEquals(24, m.getMinutes());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55408);assertEquals(48, m.getSeconds());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55409);assertEquals(34, m.getMillis());
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}        

    public void testSetIntoPeriod_Object4() throws Exception {__CLR4_4_116kl16kllc8azx1r.R.globalSliceStart(getClass().getName(),55410);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f7zdxu16r6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116kl16kllc8azx1r.R.rethrow($CLV_t2$);}finally{__CLR4_4_116kl16kllc8azx1r.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoPeriod_Object4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55410,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f7zdxu16r6() throws Exception{try{__CLR4_4_116kl16kllc8azx1r.R.inc(55410);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55411);MutablePeriod m = new MutablePeriod(PeriodType.yearWeekDayTime());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55412);StringConverter.INSTANCE.setInto(m, "P2Y4W3DT12H24M.056S", null);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55413);assertEquals(2, m.getYears());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55414);assertEquals(4, m.getWeeks());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55415);assertEquals(3, m.getDays());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55416);assertEquals(12, m.getHours());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55417);assertEquals(24, m.getMinutes());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55418);assertEquals(0, m.getSeconds());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55419);assertEquals(56, m.getMillis());
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}        

    public void testSetIntoPeriod_Object5() throws Exception {__CLR4_4_116kl16kllc8azx1r.R.globalSliceStart(getClass().getName(),55420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1byzf5d16rg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116kl16kllc8azx1r.R.rethrow($CLV_t2$);}finally{__CLR4_4_116kl16kllc8azx1r.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoPeriod_Object5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55420,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1byzf5d16rg() throws Exception{try{__CLR4_4_116kl16kllc8azx1r.R.inc(55420);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55421);MutablePeriod m = new MutablePeriod(PeriodType.yearWeekDayTime());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55422);StringConverter.INSTANCE.setInto(m, "P2Y4W3DT12H24M56.S", null);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55423);assertEquals(2, m.getYears());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55424);assertEquals(4, m.getWeeks());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55425);assertEquals(3, m.getDays());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55426);assertEquals(12, m.getHours());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55427);assertEquals(24, m.getMinutes());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55428);assertEquals(56, m.getSeconds());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55429);assertEquals(0, m.getMillis());
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}        

    public void testSetIntoPeriod_Object6() throws Exception {__CLR4_4_116kl16kllc8azx1r.R.globalSliceStart(getClass().getName(),55430);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18pzgcw16rq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116kl16kllc8azx1r.R.rethrow($CLV_t2$);}finally{__CLR4_4_116kl16kllc8azx1r.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoPeriod_Object6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55430,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18pzgcw16rq() throws Exception{try{__CLR4_4_116kl16kllc8azx1r.R.inc(55430);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55431);MutablePeriod m = new MutablePeriod(PeriodType.yearWeekDayTime());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55432);StringConverter.INSTANCE.setInto(m, "P2Y4W3DT12H24M56.1234567S", null);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55433);assertEquals(2, m.getYears());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55434);assertEquals(4, m.getWeeks());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55435);assertEquals(3, m.getDays());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55436);assertEquals(12, m.getHours());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55437);assertEquals(24, m.getMinutes());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55438);assertEquals(56, m.getSeconds());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55439);assertEquals(123, m.getMillis());
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}        

    public void testSetIntoPeriod_Object7() throws Exception {__CLR4_4_116kl16kllc8azx1r.R.globalSliceStart(getClass().getName(),55440);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15gzhkf16s0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116kl16kllc8azx1r.R.rethrow($CLV_t2$);}finally{__CLR4_4_116kl16kllc8azx1r.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoPeriod_Object7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55440,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15gzhkf16s0() throws Exception{try{__CLR4_4_116kl16kllc8azx1r.R.inc(55440);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55441);MutablePeriod m = new MutablePeriod(1, 0, 1, 1, 1, 1, 1, 1, PeriodType.yearWeekDayTime());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55442);StringConverter.INSTANCE.setInto(m, "P2Y4W3D", null);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55443);assertEquals(2, m.getYears());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55444);assertEquals(4, m.getWeeks());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55445);assertEquals(3, m.getDays());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55446);assertEquals(0, m.getHours());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55447);assertEquals(0, m.getMinutes());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55448);assertEquals(0, m.getSeconds());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55449);assertEquals(0, m.getMillis());
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}        

    public void testSetIntoPeriod_Object8() throws Exception {__CLR4_4_116kl16kllc8azx1r.R.globalSliceStart(getClass().getName(),55450);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_127ziry16sa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116kl16kllc8azx1r.R.rethrow($CLV_t2$);}finally{__CLR4_4_116kl16kllc8azx1r.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoPeriod_Object8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55450,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_127ziry16sa() throws Exception{try{__CLR4_4_116kl16kllc8azx1r.R.inc(55450);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55451);MutablePeriod m = new MutablePeriod();
        __CLR4_4_116kl16kllc8azx1r.R.inc(55452);try {
            __CLR4_4_116kl16kllc8azx1r.R.inc(55453);StringConverter.INSTANCE.setInto(m, "", null);
            __CLR4_4_116kl16kllc8azx1r.R.inc(55454);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_116kl16kllc8azx1r.R.inc(55455);try {
            __CLR4_4_116kl16kllc8azx1r.R.inc(55456);StringConverter.INSTANCE.setInto(m, "PXY", null);
            __CLR4_4_116kl16kllc8azx1r.R.inc(55457);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_116kl16kllc8azx1r.R.inc(55458);try {
            __CLR4_4_116kl16kllc8azx1r.R.inc(55459);StringConverter.INSTANCE.setInto(m, "PT0SXY", null);
            __CLR4_4_116kl16kllc8azx1r.R.inc(55460);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_116kl16kllc8azx1r.R.inc(55461);try {
            __CLR4_4_116kl16kllc8azx1r.R.inc(55462);StringConverter.INSTANCE.setInto(m, "P2Y4W3DT12H24M48SX", null);
            __CLR4_4_116kl16kllc8azx1r.R.inc(55463);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testIsReadableInterval_Object_Chronology() throws Exception {__CLR4_4_116kl16kllc8azx1r.R.globalSliceStart(getClass().getName(),55464);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p8udfz16so();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116kl16kllc8azx1r.R.rethrow($CLV_t2$);}finally{__CLR4_4_116kl16kllc8azx1r.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testIsReadableInterval_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55464,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p8udfz16so() throws Exception{try{__CLR4_4_116kl16kllc8azx1r.R.inc(55464);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55465);assertEquals(false, StringConverter.INSTANCE.isReadableInterval("", null));
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}

    public void testSetIntoInterval_Object_Chronology1() throws Exception {__CLR4_4_116kl16kllc8azx1r.R.globalSliceStart(getClass().getName(),55466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ecvf9y16sq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116kl16kllc8azx1r.R.rethrow($CLV_t2$);}finally{__CLR4_4_116kl16kllc8azx1r.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoInterval_Object_Chronology1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55466,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ecvf9y16sq() throws Exception{try{__CLR4_4_116kl16kllc8azx1r.R.inc(55466);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55467);MutableInterval m = new MutableInterval(-1000L, 1000L);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55468);StringConverter.INSTANCE.setInto(m, "2004-06-09/P1Y2M", null);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55469);assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0), m.getStart());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55470);assertEquals(new DateTime(2005, 8, 9, 0, 0, 0, 0), m.getEnd());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55471);assertEquals(ISOChronology.getInstance(), m.getChronology());
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}

    public void testSetIntoInterval_Object_Chronology2() throws Exception {__CLR4_4_116kl16kllc8azx1r.R.globalSliceStart(getClass().getName(),55472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b3vghh16sw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116kl16kllc8azx1r.R.rethrow($CLV_t2$);}finally{__CLR4_4_116kl16kllc8azx1r.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoInterval_Object_Chronology2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55472,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b3vghh16sw() throws Exception{try{__CLR4_4_116kl16kllc8azx1r.R.inc(55472);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55473);MutableInterval m = new MutableInterval(-1000L, 1000L);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55474);StringConverter.INSTANCE.setInto(m, "P1Y2M/2004-06-09", null);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55475);assertEquals(new DateTime(2003, 4, 9, 0, 0, 0, 0), m.getStart());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55476);assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0), m.getEnd());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55477);assertEquals(ISOChronology.getInstance(), m.getChronology());
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}

    public void testSetIntoInterval_Object_Chronology3() throws Exception {__CLR4_4_116kl16kllc8azx1r.R.globalSliceStart(getClass().getName(),55478);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17uvhp016t2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116kl16kllc8azx1r.R.rethrow($CLV_t2$);}finally{__CLR4_4_116kl16kllc8azx1r.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoInterval_Object_Chronology3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55478,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17uvhp016t2() throws Exception{try{__CLR4_4_116kl16kllc8azx1r.R.inc(55478);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55479);MutableInterval m = new MutableInterval(-1000L, 1000L);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55480);StringConverter.INSTANCE.setInto(m, "2003-08-09/2004-06-09", null);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55481);assertEquals(new DateTime(2003, 8, 9, 0, 0, 0, 0), m.getStart());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55482);assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0), m.getEnd());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55483);assertEquals(ISOChronology.getInstance(), m.getChronology());
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}

    public void testSetIntoInterval_Object_Chronology4() throws Exception {__CLR4_4_116kl16kllc8azx1r.R.globalSliceStart(getClass().getName(),55484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14lviwj16t8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116kl16kllc8azx1r.R.rethrow($CLV_t2$);}finally{__CLR4_4_116kl16kllc8azx1r.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoInterval_Object_Chronology4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55484,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14lviwj16t8() throws Exception{try{__CLR4_4_116kl16kllc8azx1r.R.inc(55484);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55485);MutableInterval m = new MutableInterval(-1000L, 1000L);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55486);StringConverter.INSTANCE.setInto(m, "2004-06-09T+06:00/P1Y2M", null);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55487);assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0, SIX).withChronology(null), m.getStart());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55488);assertEquals(new DateTime(2005, 8, 9, 0, 0, 0, 0, SIX).withChronology(null), m.getEnd());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55489);assertEquals(ISOChronology.getInstance(), m.getChronology());
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}

    public void testSetIntoInterval_Object_Chronology5() throws Exception {__CLR4_4_116kl16kllc8azx1r.R.globalSliceStart(getClass().getName(),55490);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11cvk4216te();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116kl16kllc8azx1r.R.rethrow($CLV_t2$);}finally{__CLR4_4_116kl16kllc8azx1r.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoInterval_Object_Chronology5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55490,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11cvk4216te() throws Exception{try{__CLR4_4_116kl16kllc8azx1r.R.inc(55490);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55491);MutableInterval m = new MutableInterval(-1000L, 1000L);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55492);StringConverter.INSTANCE.setInto(m, "P1Y2M/2004-06-09T+06:00", null);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55493);assertEquals(new DateTime(2003, 4, 9, 0, 0, 0, 0, SIX).withChronology(null), m.getStart());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55494);assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0, SIX).withChronology(null), m.getEnd());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55495);assertEquals(ISOChronology.getInstance(), m.getChronology());
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}

    public void testSetIntoInterval_Object_Chronology6() throws Exception {__CLR4_4_116kl16kllc8azx1r.R.globalSliceStart(getClass().getName(),55496);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11w4eof16tk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116kl16kllc8azx1r.R.rethrow($CLV_t2$);}finally{__CLR4_4_116kl16kllc8azx1r.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoInterval_Object_Chronology6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55496,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11w4eof16tk() throws Exception{try{__CLR4_4_116kl16kllc8azx1r.R.inc(55496);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55497);MutableInterval m = new MutableInterval(-1000L, 1000L);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55498);StringConverter.INSTANCE.setInto(m, "2003-08-09T+06:00/2004-06-09T+07:00", null);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55499);assertEquals(new DateTime(2003, 8, 9, 0, 0, 0, 0, SIX).withChronology(null), m.getStart());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55500);assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0, SEVEN).withChronology(null), m.getEnd());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55501);assertEquals(ISOChronology.getInstance(), m.getChronology());
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}

    public void testSetIntoInterval_Object_Chronology7() throws Exception {__CLR4_4_116kl16kllc8azx1r.R.globalSliceStart(getClass().getName(),55502);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1554dgw16tq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116kl16kllc8azx1r.R.rethrow($CLV_t2$);}finally{__CLR4_4_116kl16kllc8azx1r.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoInterval_Object_Chronology7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55502,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1554dgw16tq() throws Exception{try{__CLR4_4_116kl16kllc8azx1r.R.inc(55502);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55503);MutableInterval m = new MutableInterval(-1000L, 1000L);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55504);StringConverter.INSTANCE.setInto(m, "2003-08-09/2004-06-09", BuddhistChronology.getInstance());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55505);assertEquals(new DateTime(2003, 8, 9, 0, 0, 0, 0, BuddhistChronology.getInstance()), m.getStart());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55506);assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0, BuddhistChronology.getInstance()), m.getEnd());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55507);assertEquals(BuddhistChronology.getInstance(), m.getChronology());
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}

    public void testSetIntoInterval_Object_Chronology8() throws Exception {__CLR4_4_116kl16kllc8azx1r.R.globalSliceStart(getClass().getName(),55508);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18e4c9d16tw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116kl16kllc8azx1r.R.rethrow($CLV_t2$);}finally{__CLR4_4_116kl16kllc8azx1r.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoInterval_Object_Chronology8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55508,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18e4c9d16tw() throws Exception{try{__CLR4_4_116kl16kllc8azx1r.R.inc(55508);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55509);MutableInterval m = new MutableInterval(-1000L, 1000L);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55510);StringConverter.INSTANCE.setInto(m, "2003-08-09T+06:00/2004-06-09T+07:00", BuddhistChronology.getInstance(EIGHT));
        __CLR4_4_116kl16kllc8azx1r.R.inc(55511);assertEquals(new DateTime(2003, 8, 9, 0, 0, 0, 0, BuddhistChronology.getInstance(SIX)).withZone(EIGHT), m.getStart());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55512);assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0, BuddhistChronology.getInstance(SEVEN)).withZone(EIGHT), m.getEnd());
        __CLR4_4_116kl16kllc8azx1r.R.inc(55513);assertEquals(BuddhistChronology.getInstance(EIGHT), m.getChronology());
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}

    public void testSetIntoIntervalEx_Object_Chronology1() throws Exception {__CLR4_4_116kl16kllc8azx1r.R.globalSliceStart(getClass().getName(),55514);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mdcyqf16u2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116kl16kllc8azx1r.R.rethrow($CLV_t2$);}finally{__CLR4_4_116kl16kllc8azx1r.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoIntervalEx_Object_Chronology1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55514,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mdcyqf16u2() throws Exception{try{__CLR4_4_116kl16kllc8azx1r.R.inc(55514);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55515);MutableInterval m = new MutableInterval(-1000L, 1000L);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55516);try {
            __CLR4_4_116kl16kllc8azx1r.R.inc(55517);StringConverter.INSTANCE.setInto(m, "", null);
            __CLR4_4_116kl16kllc8azx1r.R.inc(55518);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}

    public void testSetIntoIntervalEx_Object_Chronology2() throws Exception {__CLR4_4_116kl16kllc8azx1r.R.globalSliceStart(getClass().getName(),55519);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pmcxiw16u7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116kl16kllc8azx1r.R.rethrow($CLV_t2$);}finally{__CLR4_4_116kl16kllc8azx1r.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoIntervalEx_Object_Chronology2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55519,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pmcxiw16u7() throws Exception{try{__CLR4_4_116kl16kllc8azx1r.R.inc(55519);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55520);MutableInterval m = new MutableInterval(-1000L, 1000L);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55521);try {
            __CLR4_4_116kl16kllc8azx1r.R.inc(55522);StringConverter.INSTANCE.setInto(m, "/", null);
            __CLR4_4_116kl16kllc8azx1r.R.inc(55523);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}

    public void testSetIntoIntervalEx_Object_Chronology3() throws Exception {__CLR4_4_116kl16kllc8azx1r.R.globalSliceStart(getClass().getName(),55524);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1svcwbd16uc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116kl16kllc8azx1r.R.rethrow($CLV_t2$);}finally{__CLR4_4_116kl16kllc8azx1r.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoIntervalEx_Object_Chronology3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55524,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1svcwbd16uc() throws Exception{try{__CLR4_4_116kl16kllc8azx1r.R.inc(55524);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55525);MutableInterval m = new MutableInterval(-1000L, 1000L);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55526);try {
            __CLR4_4_116kl16kllc8azx1r.R.inc(55527);StringConverter.INSTANCE.setInto(m, "P1Y/", null);
            __CLR4_4_116kl16kllc8azx1r.R.inc(55528);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}

    public void testSetIntoIntervalEx_Object_Chronology4() throws Exception {__CLR4_4_116kl16kllc8azx1r.R.globalSliceStart(getClass().getName(),55529);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w4cv3u16uh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116kl16kllc8azx1r.R.rethrow($CLV_t2$);}finally{__CLR4_4_116kl16kllc8azx1r.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoIntervalEx_Object_Chronology4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55529,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w4cv3u16uh() throws Exception{try{__CLR4_4_116kl16kllc8azx1r.R.inc(55529);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55530);MutableInterval m = new MutableInterval(-1000L, 1000L);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55531);try {
            __CLR4_4_116kl16kllc8azx1r.R.inc(55532);StringConverter.INSTANCE.setInto(m, "/P1Y", null);
            __CLR4_4_116kl16kllc8azx1r.R.inc(55533);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}

    public void testSetIntoIntervalEx_Object_Chronology5() throws Exception {__CLR4_4_116kl16kllc8azx1r.R.globalSliceStart(getClass().getName(),55534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zdctwb16um();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116kl16kllc8azx1r.R.rethrow($CLV_t2$);}finally{__CLR4_4_116kl16kllc8azx1r.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testSetIntoIntervalEx_Object_Chronology5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55534,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zdctwb16um() throws Exception{try{__CLR4_4_116kl16kllc8azx1r.R.inc(55534);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55535);MutableInterval m = new MutableInterval(-1000L, 1000L);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55536);try {
            __CLR4_4_116kl16kllc8azx1r.R.inc(55537);StringConverter.INSTANCE.setInto(m, "P1Y/P2Y", null);
            __CLR4_4_116kl16kllc8azx1r.R.inc(55538);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString() {__CLR4_4_116kl16kllc8azx1r.R.globalSliceStart(getClass().getName(),55539);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid16ur();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116kl16kllc8azx1r.R.rethrow($CLV_t2$);}finally{__CLR4_4_116kl16kllc8azx1r.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestStringConverter.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55539,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid16ur(){try{__CLR4_4_116kl16kllc8azx1r.R.inc(55539);
        __CLR4_4_116kl16kllc8azx1r.R.inc(55540);assertEquals("Converter[java.lang.String]", StringConverter.INSTANCE.toString());
    }finally{__CLR4_4_116kl16kllc8azx1r.R.flushNeeded();}}

}
