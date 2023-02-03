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
import java.util.Date;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.TimeOfDay;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a Junit unit test for DateConverter.
 *
 * @author Stephen Colebourne
 */
public class TestDateConverter extends TestCase {static class __CLR4_4_116841684lc8azwyj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,54766,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static Chronology ISO;
    private static Chronology JULIAN;
    private static Chronology COPTIC;
    
    public static void main(String[] args) {try{__CLR4_4_116841684lc8azwyj.R.inc(54724);
        __CLR4_4_116841684lc8azwyj.R.inc(54725);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_116841684lc8azwyj.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_116841684lc8azwyj.R.inc(54726);
        __CLR4_4_116841684lc8azwyj.R.inc(54727);return new TestSuite(TestDateConverter.class);
    }finally{__CLR4_4_116841684lc8azwyj.R.flushNeeded();}}

    public TestDateConverter(String name) {
        super(name);__CLR4_4_116841684lc8azwyj.R.inc(54729);try{__CLR4_4_116841684lc8azwyj.R.inc(54728);
    }finally{__CLR4_4_116841684lc8azwyj.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_116841684lc8azwyj.R.inc(54730);
        __CLR4_4_116841684lc8azwyj.R.inc(54731);JULIAN = JulianChronology.getInstance();
        __CLR4_4_116841684lc8azwyj.R.inc(54732);COPTIC = CopticChronology.getInstance();
        __CLR4_4_116841684lc8azwyj.R.inc(54733);ISO = ISOChronology.getInstance();
    }finally{__CLR4_4_116841684lc8azwyj.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSingleton() throws Exception {__CLR4_4_116841684lc8azwyj.R.globalSliceStart(getClass().getName(),54734);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jmk8jk168e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116841684lc8azwyj.R.rethrow($CLV_t2$);}finally{__CLR4_4_116841684lc8azwyj.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestDateConverter.testSingleton",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54734,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jmk8jk168e() throws Exception{try{__CLR4_4_116841684lc8azwyj.R.inc(54734);
        __CLR4_4_116841684lc8azwyj.R.inc(54735);Class cls = DateConverter.class;
        __CLR4_4_116841684lc8azwyj.R.inc(54736);assertEquals(false, Modifier.isPublic(cls.getModifiers()));
        __CLR4_4_116841684lc8azwyj.R.inc(54737);assertEquals(false, Modifier.isProtected(cls.getModifiers()));
        __CLR4_4_116841684lc8azwyj.R.inc(54738);assertEquals(false, Modifier.isPrivate(cls.getModifiers()));
        
        __CLR4_4_116841684lc8azwyj.R.inc(54739);Constructor con = cls.getDeclaredConstructor((Class[]) null);
        __CLR4_4_116841684lc8azwyj.R.inc(54740);assertEquals(1, cls.getDeclaredConstructors().length);
        __CLR4_4_116841684lc8azwyj.R.inc(54741);assertEquals(true, Modifier.isProtected(con.getModifiers()));
        
        __CLR4_4_116841684lc8azwyj.R.inc(54742);Field fld = cls.getDeclaredField("INSTANCE");
        __CLR4_4_116841684lc8azwyj.R.inc(54743);assertEquals(false, Modifier.isPublic(fld.getModifiers()));
        __CLR4_4_116841684lc8azwyj.R.inc(54744);assertEquals(false, Modifier.isProtected(fld.getModifiers()));
        __CLR4_4_116841684lc8azwyj.R.inc(54745);assertEquals(false, Modifier.isPrivate(fld.getModifiers()));
    }finally{__CLR4_4_116841684lc8azwyj.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSupportedType() throws Exception {__CLR4_4_116841684lc8azwyj.R.globalSliceStart(getClass().getName(),54746);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fthtzx168q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116841684lc8azwyj.R.rethrow($CLV_t2$);}finally{__CLR4_4_116841684lc8azwyj.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestDateConverter.testSupportedType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54746,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fthtzx168q() throws Exception{try{__CLR4_4_116841684lc8azwyj.R.inc(54746);
        __CLR4_4_116841684lc8azwyj.R.inc(54747);assertEquals(Date.class, DateConverter.INSTANCE.getSupportedType());
    }finally{__CLR4_4_116841684lc8azwyj.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetInstantMillis_Object_Chronology() throws Exception {__CLR4_4_116841684lc8azwyj.R.globalSliceStart(getClass().getName(),54748);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12gh1ib168s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116841684lc8azwyj.R.rethrow($CLV_t2$);}finally{__CLR4_4_116841684lc8azwyj.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestDateConverter.testGetInstantMillis_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54748,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12gh1ib168s() throws Exception{try{__CLR4_4_116841684lc8azwyj.R.inc(54748);
        __CLR4_4_116841684lc8azwyj.R.inc(54749);Date date = new Date(123L);
        __CLR4_4_116841684lc8azwyj.R.inc(54750);long millis = DateConverter.INSTANCE.getInstantMillis(date, JULIAN);
        __CLR4_4_116841684lc8azwyj.R.inc(54751);assertEquals(123L, millis);
        __CLR4_4_116841684lc8azwyj.R.inc(54752);assertEquals(123L, DateConverter.INSTANCE.getInstantMillis(date, (Chronology) null));
    }finally{__CLR4_4_116841684lc8azwyj.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetChronology_Object_Zone() throws Exception {__CLR4_4_116841684lc8azwyj.R.globalSliceStart(getClass().getName(),54753);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nbwmeo168x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116841684lc8azwyj.R.rethrow($CLV_t2$);}finally{__CLR4_4_116841684lc8azwyj.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestDateConverter.testGetChronology_Object_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54753,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nbwmeo168x() throws Exception{try{__CLR4_4_116841684lc8azwyj.R.inc(54753);
        __CLR4_4_116841684lc8azwyj.R.inc(54754);assertEquals(ISO_PARIS, DateConverter.INSTANCE.getChronology(new Date(123L), PARIS));
        __CLR4_4_116841684lc8azwyj.R.inc(54755);assertEquals(ISO, DateConverter.INSTANCE.getChronology(new Date(123L), (DateTimeZone) null));
    }finally{__CLR4_4_116841684lc8azwyj.R.flushNeeded();}}

    public void testGetChronology_Object_Chronology() throws Exception {__CLR4_4_116841684lc8azwyj.R.globalSliceStart(getClass().getName(),54756);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u5zpek1690();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116841684lc8azwyj.R.rethrow($CLV_t2$);}finally{__CLR4_4_116841684lc8azwyj.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestDateConverter.testGetChronology_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54756,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u5zpek1690() throws Exception{try{__CLR4_4_116841684lc8azwyj.R.inc(54756);
        __CLR4_4_116841684lc8azwyj.R.inc(54757);assertEquals(JULIAN, DateConverter.INSTANCE.getChronology(new Date(123L), JULIAN));
        __CLR4_4_116841684lc8azwyj.R.inc(54758);assertEquals(ISO, DateConverter.INSTANCE.getChronology(new Date(123L), (Chronology) null));
    }finally{__CLR4_4_116841684lc8azwyj.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetPartialValues() throws Exception {__CLR4_4_116841684lc8azwyj.R.globalSliceStart(getClass().getName(),54759);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jrzqzq1693();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116841684lc8azwyj.R.rethrow($CLV_t2$);}finally{__CLR4_4_116841684lc8azwyj.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestDateConverter.testGetPartialValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54759,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jrzqzq1693() throws Exception{try{__CLR4_4_116841684lc8azwyj.R.inc(54759);
        __CLR4_4_116841684lc8azwyj.R.inc(54760);TimeOfDay tod = new TimeOfDay();
        __CLR4_4_116841684lc8azwyj.R.inc(54761);int[] expected = COPTIC.get(tod, 12345678L);
        __CLR4_4_116841684lc8azwyj.R.inc(54762);int[] actual = DateConverter.INSTANCE.getPartialValues(tod, new Date(12345678L), COPTIC);
        __CLR4_4_116841684lc8azwyj.R.inc(54763);assertEquals(true, Arrays.equals(expected, actual));
    }finally{__CLR4_4_116841684lc8azwyj.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString() {__CLR4_4_116841684lc8azwyj.R.globalSliceStart(getClass().getName(),54764);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid1698();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116841684lc8azwyj.R.rethrow($CLV_t2$);}finally{__CLR4_4_116841684lc8azwyj.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestDateConverter.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54764,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid1698(){try{__CLR4_4_116841684lc8azwyj.R.inc(54764);
        __CLR4_4_116841684lc8azwyj.R.inc(54765);assertEquals("Converter[java.util.Date]", DateConverter.INSTANCE.toString());
    }finally{__CLR4_4_116841684lc8azwyj.R.flushNeeded();}}

}
