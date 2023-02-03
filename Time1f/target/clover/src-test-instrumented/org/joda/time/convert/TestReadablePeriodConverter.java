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
import org.joda.time.PeriodType;
import org.joda.time.MutablePeriod;
import org.joda.time.ReadablePeriod;
import org.joda.time.Period;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a Junit unit test for ReadablePeriodConverter.
 *
 * @author Stephen Colebourne
 */
public class TestReadablePeriodConverter extends TestCase {static class __CLR4_4_116ji16jilc8azx0d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,55173,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static Chronology JULIAN;
    private static Chronology ISO;
    
    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_116ji16jilc8azx0d.R.inc(55134);
        __CLR4_4_116ji16jilc8azx0d.R.inc(55135);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_116ji16jilc8azx0d.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_116ji16jilc8azx0d.R.inc(55136);
        __CLR4_4_116ji16jilc8azx0d.R.inc(55137);return new TestSuite(TestReadablePeriodConverter.class);
    }finally{__CLR4_4_116ji16jilc8azx0d.R.flushNeeded();}}

    public TestReadablePeriodConverter(String name) {
        super(name);__CLR4_4_116ji16jilc8azx0d.R.inc(55139);try{__CLR4_4_116ji16jilc8azx0d.R.inc(55138);
    }finally{__CLR4_4_116ji16jilc8azx0d.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_116ji16jilc8azx0d.R.inc(55140);
        __CLR4_4_116ji16jilc8azx0d.R.inc(55141);JULIAN = JulianChronology.getInstance();
        __CLR4_4_116ji16jilc8azx0d.R.inc(55142);ISO = ISOChronology.getInstance();
    }finally{__CLR4_4_116ji16jilc8azx0d.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSingleton() throws Exception {__CLR4_4_116ji16jilc8azx0d.R.globalSliceStart(getClass().getName(),55143);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jmk8jk16jr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116ji16jilc8azx0d.R.rethrow($CLV_t2$);}finally{__CLR4_4_116ji16jilc8azx0d.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadablePeriodConverter.testSingleton",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55143,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jmk8jk16jr() throws Exception{try{__CLR4_4_116ji16jilc8azx0d.R.inc(55143);
        __CLR4_4_116ji16jilc8azx0d.R.inc(55144);Class cls = ReadablePeriodConverter.class;
        __CLR4_4_116ji16jilc8azx0d.R.inc(55145);assertEquals(false, Modifier.isPublic(cls.getModifiers()));
        __CLR4_4_116ji16jilc8azx0d.R.inc(55146);assertEquals(false, Modifier.isProtected(cls.getModifiers()));
        __CLR4_4_116ji16jilc8azx0d.R.inc(55147);assertEquals(false, Modifier.isPrivate(cls.getModifiers()));
        
        __CLR4_4_116ji16jilc8azx0d.R.inc(55148);Constructor con = cls.getDeclaredConstructor((Class[]) null);
        __CLR4_4_116ji16jilc8azx0d.R.inc(55149);assertEquals(1, cls.getDeclaredConstructors().length);
        __CLR4_4_116ji16jilc8azx0d.R.inc(55150);assertEquals(true, Modifier.isProtected(con.getModifiers()));
        
        __CLR4_4_116ji16jilc8azx0d.R.inc(55151);Field fld = cls.getDeclaredField("INSTANCE");
        __CLR4_4_116ji16jilc8azx0d.R.inc(55152);assertEquals(false, Modifier.isPublic(fld.getModifiers()));
        __CLR4_4_116ji16jilc8azx0d.R.inc(55153);assertEquals(false, Modifier.isProtected(fld.getModifiers()));
        __CLR4_4_116ji16jilc8azx0d.R.inc(55154);assertEquals(false, Modifier.isPrivate(fld.getModifiers()));
    }finally{__CLR4_4_116ji16jilc8azx0d.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSupportedType() throws Exception {__CLR4_4_116ji16jilc8azx0d.R.globalSliceStart(getClass().getName(),55155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fthtzx16k3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116ji16jilc8azx0d.R.rethrow($CLV_t2$);}finally{__CLR4_4_116ji16jilc8azx0d.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadablePeriodConverter.testSupportedType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55155,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fthtzx16k3() throws Exception{try{__CLR4_4_116ji16jilc8azx0d.R.inc(55155);
        __CLR4_4_116ji16jilc8azx0d.R.inc(55156);assertEquals(ReadablePeriod.class, ReadablePeriodConverter.INSTANCE.getSupportedType());
    }finally{__CLR4_4_116ji16jilc8azx0d.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetPeriodType_Object() throws Exception {__CLR4_4_116ji16jilc8azx0d.R.globalSliceStart(getClass().getName(),55157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nzp2xm16k5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116ji16jilc8azx0d.R.rethrow($CLV_t2$);}finally{__CLR4_4_116ji16jilc8azx0d.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadablePeriodConverter.testGetPeriodType_Object",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55157,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nzp2xm16k5() throws Exception{try{__CLR4_4_116ji16jilc8azx0d.R.inc(55157);
        __CLR4_4_116ji16jilc8azx0d.R.inc(55158);assertEquals(PeriodType.standard(),
            ReadablePeriodConverter.INSTANCE.getPeriodType(new Period(123L, PeriodType.standard())));
        __CLR4_4_116ji16jilc8azx0d.R.inc(55159);assertEquals(PeriodType.yearMonthDayTime(),
            ReadablePeriodConverter.INSTANCE.getPeriodType(new Period(123L, PeriodType.yearMonthDayTime())));
    }finally{__CLR4_4_116ji16jilc8azx0d.R.flushNeeded();}}

    public void testSetInto_Object() throws Exception {__CLR4_4_116ji16jilc8azx0d.R.globalSliceStart(getClass().getName(),55160);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pdb0ff16k8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116ji16jilc8azx0d.R.rethrow($CLV_t2$);}finally{__CLR4_4_116ji16jilc8azx0d.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadablePeriodConverter.testSetInto_Object",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55160,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pdb0ff16k8() throws Exception{try{__CLR4_4_116ji16jilc8azx0d.R.inc(55160);
        __CLR4_4_116ji16jilc8azx0d.R.inc(55161);MutablePeriod m = new MutablePeriod(PeriodType.yearMonthDayTime());
        __CLR4_4_116ji16jilc8azx0d.R.inc(55162);ReadablePeriodConverter.INSTANCE.setInto(m, new Period(0, 0, 0, 3, 0, 4, 0, 5), null);
        __CLR4_4_116ji16jilc8azx0d.R.inc(55163);assertEquals(0, m.getYears());
        __CLR4_4_116ji16jilc8azx0d.R.inc(55164);assertEquals(0, m.getMonths());
        __CLR4_4_116ji16jilc8azx0d.R.inc(55165);assertEquals(0, m.getWeeks());
        __CLR4_4_116ji16jilc8azx0d.R.inc(55166);assertEquals(3, m.getDays());
        __CLR4_4_116ji16jilc8azx0d.R.inc(55167);assertEquals(0, m.getHours());
        __CLR4_4_116ji16jilc8azx0d.R.inc(55168);assertEquals(4, m.getMinutes());
        __CLR4_4_116ji16jilc8azx0d.R.inc(55169);assertEquals(0, m.getSeconds());
        __CLR4_4_116ji16jilc8azx0d.R.inc(55170);assertEquals(5, m.getMillis());
    }finally{__CLR4_4_116ji16jilc8azx0d.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString() {__CLR4_4_116ji16jilc8azx0d.R.globalSliceStart(getClass().getName(),55171);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid16kj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116ji16jilc8azx0d.R.rethrow($CLV_t2$);}finally{__CLR4_4_116ji16jilc8azx0d.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadablePeriodConverter.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55171,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid16kj(){try{__CLR4_4_116ji16jilc8azx0d.R.inc(55171);
        __CLR4_4_116ji16jilc8azx0d.R.inc(55172);assertEquals("Converter[org.joda.time.ReadablePeriod]", ReadablePeriodConverter.INSTANCE.toString());
    }finally{__CLR4_4_116ji16jilc8azx0d.R.flushNeeded();}}

}
