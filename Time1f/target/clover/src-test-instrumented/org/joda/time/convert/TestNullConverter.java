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
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.PeriodType;
import org.joda.time.TimeOfDay;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a Junit unit test for NullConverter.
 *
 * @author Stephen Colebourne
 */
public class TestNullConverter extends TestCase {static class __CLR4_4_116af16aflc8azwz2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,54883,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private long TEST_TIME_NOW =
            20 * DateTimeConstants.MILLIS_PER_DAY
            + 10L * DateTimeConstants.MILLIS_PER_HOUR
            + 20L * DateTimeConstants.MILLIS_PER_MINUTE
            + 30L * DateTimeConstants.MILLIS_PER_SECOND
            + 40L;
            
    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static Chronology ISO;
    private static Chronology JULIAN;
    
    private DateTimeZone zone = null;
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {try{__CLR4_4_116af16aflc8azwz2.R.inc(54807);
        __CLR4_4_116af16aflc8azwz2.R.inc(54808);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_116af16aflc8azwz2.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_116af16aflc8azwz2.R.inc(54809);
        __CLR4_4_116af16aflc8azwz2.R.inc(54810);return new TestSuite(TestNullConverter.class);
    }finally{__CLR4_4_116af16aflc8azwz2.R.flushNeeded();}}

    public TestNullConverter(String name) {
        super(name);__CLR4_4_116af16aflc8azwz2.R.inc(54812);try{__CLR4_4_116af16aflc8azwz2.R.inc(54811);
    }finally{__CLR4_4_116af16aflc8azwz2.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_116af16aflc8azwz2.R.inc(54813);
        __CLR4_4_116af16aflc8azwz2.R.inc(54814);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_116af16aflc8azwz2.R.inc(54815);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_116af16aflc8azwz2.R.inc(54816);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_116af16aflc8azwz2.R.inc(54817);originalLocale = Locale.getDefault();
        __CLR4_4_116af16aflc8azwz2.R.inc(54818);DateTimeZone.setDefault(DateTimeZone.forID("Europe/London"));
        __CLR4_4_116af16aflc8azwz2.R.inc(54819);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_116af16aflc8azwz2.R.inc(54820);Locale.setDefault(Locale.UK);
        
        __CLR4_4_116af16aflc8azwz2.R.inc(54821);ISO = ISOChronology.getInstance();
        __CLR4_4_116af16aflc8azwz2.R.inc(54822);JULIAN = JulianChronology.getInstance();
    }finally{__CLR4_4_116af16aflc8azwz2.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_116af16aflc8azwz2.R.inc(54823);
        __CLR4_4_116af16aflc8azwz2.R.inc(54824);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_116af16aflc8azwz2.R.inc(54825);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_116af16aflc8azwz2.R.inc(54826);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_116af16aflc8azwz2.R.inc(54827);Locale.setDefault(originalLocale);
        __CLR4_4_116af16aflc8azwz2.R.inc(54828);originalDateTimeZone = null;
        __CLR4_4_116af16aflc8azwz2.R.inc(54829);originalTimeZone = null;
        __CLR4_4_116af16aflc8azwz2.R.inc(54830);originalLocale = null;
    }finally{__CLR4_4_116af16aflc8azwz2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSingleton() throws Exception {__CLR4_4_116af16aflc8azwz2.R.globalSliceStart(getClass().getName(),54831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jmk8jk16b3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116af16aflc8azwz2.R.rethrow($CLV_t2$);}finally{__CLR4_4_116af16aflc8azwz2.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestNullConverter.testSingleton",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54831,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jmk8jk16b3() throws Exception{try{__CLR4_4_116af16aflc8azwz2.R.inc(54831);
        __CLR4_4_116af16aflc8azwz2.R.inc(54832);Class cls = NullConverter.class;
        __CLR4_4_116af16aflc8azwz2.R.inc(54833);assertEquals(false, Modifier.isPublic(cls.getModifiers()));
        __CLR4_4_116af16aflc8azwz2.R.inc(54834);assertEquals(false, Modifier.isProtected(cls.getModifiers()));
        __CLR4_4_116af16aflc8azwz2.R.inc(54835);assertEquals(false, Modifier.isPrivate(cls.getModifiers()));
        
        __CLR4_4_116af16aflc8azwz2.R.inc(54836);Constructor con = cls.getDeclaredConstructor((Class[]) null);
        __CLR4_4_116af16aflc8azwz2.R.inc(54837);assertEquals(1, cls.getDeclaredConstructors().length);
        __CLR4_4_116af16aflc8azwz2.R.inc(54838);assertEquals(true, Modifier.isProtected(con.getModifiers()));
        
        __CLR4_4_116af16aflc8azwz2.R.inc(54839);Field fld = cls.getDeclaredField("INSTANCE");
        __CLR4_4_116af16aflc8azwz2.R.inc(54840);assertEquals(false, Modifier.isPublic(fld.getModifiers()));
        __CLR4_4_116af16aflc8azwz2.R.inc(54841);assertEquals(false, Modifier.isProtected(fld.getModifiers()));
        __CLR4_4_116af16aflc8azwz2.R.inc(54842);assertEquals(false, Modifier.isPrivate(fld.getModifiers()));
    }finally{__CLR4_4_116af16aflc8azwz2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSupportedType() throws Exception {__CLR4_4_116af16aflc8azwz2.R.globalSliceStart(getClass().getName(),54843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fthtzx16bf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116af16aflc8azwz2.R.rethrow($CLV_t2$);}finally{__CLR4_4_116af16aflc8azwz2.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestNullConverter.testSupportedType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54843,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fthtzx16bf() throws Exception{try{__CLR4_4_116af16aflc8azwz2.R.inc(54843);
        __CLR4_4_116af16aflc8azwz2.R.inc(54844);assertEquals(null, NullConverter.INSTANCE.getSupportedType());
    }finally{__CLR4_4_116af16aflc8azwz2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetInstantMillis_Object_Chronology() throws Exception {__CLR4_4_116af16aflc8azwz2.R.globalSliceStart(getClass().getName(),54845);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12gh1ib16bh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116af16aflc8azwz2.R.rethrow($CLV_t2$);}finally{__CLR4_4_116af16aflc8azwz2.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestNullConverter.testGetInstantMillis_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54845,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12gh1ib16bh() throws Exception{try{__CLR4_4_116af16aflc8azwz2.R.inc(54845);
        __CLR4_4_116af16aflc8azwz2.R.inc(54846);assertEquals(TEST_TIME_NOW, NullConverter.INSTANCE.getInstantMillis(null, JULIAN));
        __CLR4_4_116af16aflc8azwz2.R.inc(54847);assertEquals(TEST_TIME_NOW, NullConverter.INSTANCE.getInstantMillis(null, (Chronology) null));
    }finally{__CLR4_4_116af16aflc8azwz2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetChronology_Object_Zone() throws Exception {__CLR4_4_116af16aflc8azwz2.R.globalSliceStart(getClass().getName(),54848);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nbwmeo16bk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116af16aflc8azwz2.R.rethrow($CLV_t2$);}finally{__CLR4_4_116af16aflc8azwz2.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestNullConverter.testGetChronology_Object_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54848,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nbwmeo16bk() throws Exception{try{__CLR4_4_116af16aflc8azwz2.R.inc(54848);
        __CLR4_4_116af16aflc8azwz2.R.inc(54849);assertEquals(ISO_PARIS, NullConverter.INSTANCE.getChronology(null, PARIS));
        __CLR4_4_116af16aflc8azwz2.R.inc(54850);assertEquals(ISO, NullConverter.INSTANCE.getChronology(null, (DateTimeZone) null));
    }finally{__CLR4_4_116af16aflc8azwz2.R.flushNeeded();}}

    public void testGetChronology_Object_Chronology() throws Exception {__CLR4_4_116af16aflc8azwz2.R.globalSliceStart(getClass().getName(),54851);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u5zpek16bn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116af16aflc8azwz2.R.rethrow($CLV_t2$);}finally{__CLR4_4_116af16aflc8azwz2.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestNullConverter.testGetChronology_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54851,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u5zpek16bn() throws Exception{try{__CLR4_4_116af16aflc8azwz2.R.inc(54851);
        __CLR4_4_116af16aflc8azwz2.R.inc(54852);assertEquals(JULIAN, NullConverter.INSTANCE.getChronology(null, JULIAN));
        __CLR4_4_116af16aflc8azwz2.R.inc(54853);assertEquals(ISO, NullConverter.INSTANCE.getChronology(null, (Chronology) null));
    }finally{__CLR4_4_116af16aflc8azwz2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetPartialValues() throws Exception {__CLR4_4_116af16aflc8azwz2.R.globalSliceStart(getClass().getName(),54854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jrzqzq16bq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116af16aflc8azwz2.R.rethrow($CLV_t2$);}finally{__CLR4_4_116af16aflc8azwz2.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestNullConverter.testGetPartialValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54854,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jrzqzq16bq() throws Exception{try{__CLR4_4_116af16aflc8azwz2.R.inc(54854);
        __CLR4_4_116af16aflc8azwz2.R.inc(54855);TimeOfDay tod = new TimeOfDay();
        __CLR4_4_116af16aflc8azwz2.R.inc(54856);int[] expected = new int[] {10 + 1, 20, 30, 40}; // now
        __CLR4_4_116af16aflc8azwz2.R.inc(54857);int[] actual = NullConverter.INSTANCE.getPartialValues(tod, null, ISOChronology.getInstance());
        __CLR4_4_116af16aflc8azwz2.R.inc(54858);assertEquals(true, Arrays.equals(expected, actual));
    }finally{__CLR4_4_116af16aflc8azwz2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetDurationMillis_Object() throws Exception {__CLR4_4_116af16aflc8azwz2.R.globalSliceStart(getClass().getName(),54859);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i0aumf16bv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116af16aflc8azwz2.R.rethrow($CLV_t2$);}finally{__CLR4_4_116af16aflc8azwz2.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestNullConverter.testGetDurationMillis_Object",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54859,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i0aumf16bv() throws Exception{try{__CLR4_4_116af16aflc8azwz2.R.inc(54859);
        __CLR4_4_116af16aflc8azwz2.R.inc(54860);assertEquals(0L, NullConverter.INSTANCE.getDurationMillis(null));
    }finally{__CLR4_4_116af16aflc8azwz2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetPeriodType_Object() throws Exception {__CLR4_4_116af16aflc8azwz2.R.globalSliceStart(getClass().getName(),54861);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nzp2xm16bx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116af16aflc8azwz2.R.rethrow($CLV_t2$);}finally{__CLR4_4_116af16aflc8azwz2.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestNullConverter.testGetPeriodType_Object",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54861,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nzp2xm16bx() throws Exception{try{__CLR4_4_116af16aflc8azwz2.R.inc(54861);
        __CLR4_4_116af16aflc8azwz2.R.inc(54862);assertEquals(PeriodType.standard(),
            NullConverter.INSTANCE.getPeriodType(null));
    }finally{__CLR4_4_116af16aflc8azwz2.R.flushNeeded();}}

    public void testSetInto_Object() throws Exception {__CLR4_4_116af16aflc8azwz2.R.globalSliceStart(getClass().getName(),54863);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pdb0ff16bz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116af16aflc8azwz2.R.rethrow($CLV_t2$);}finally{__CLR4_4_116af16aflc8azwz2.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestNullConverter.testSetInto_Object",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54863,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pdb0ff16bz() throws Exception{try{__CLR4_4_116af16aflc8azwz2.R.inc(54863);
        __CLR4_4_116af16aflc8azwz2.R.inc(54864);MutablePeriod m = new MutablePeriod(PeriodType.millis());
        __CLR4_4_116af16aflc8azwz2.R.inc(54865);NullConverter.INSTANCE.setInto(m, null, null);
        __CLR4_4_116af16aflc8azwz2.R.inc(54866);assertEquals(0L, m.getMillis());
    }finally{__CLR4_4_116af16aflc8azwz2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testIsReadableInterval_Object_Chronology() throws Exception {__CLR4_4_116af16aflc8azwz2.R.globalSliceStart(getClass().getName(),54867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p8udfz16c3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116af16aflc8azwz2.R.rethrow($CLV_t2$);}finally{__CLR4_4_116af16aflc8azwz2.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestNullConverter.testIsReadableInterval_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54867,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p8udfz16c3() throws Exception{try{__CLR4_4_116af16aflc8azwz2.R.inc(54867);
        __CLR4_4_116af16aflc8azwz2.R.inc(54868);assertEquals(false, NullConverter.INSTANCE.isReadableInterval(null, null));
    }finally{__CLR4_4_116af16aflc8azwz2.R.flushNeeded();}}

    public void testSetInto_Object_Chronology1() throws Exception {__CLR4_4_116af16aflc8azwz2.R.globalSliceStart(getClass().getName(),54869);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1432dgx16c5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116af16aflc8azwz2.R.rethrow($CLV_t2$);}finally{__CLR4_4_116af16aflc8azwz2.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestNullConverter.testSetInto_Object_Chronology1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54869,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1432dgx16c5() throws Exception{try{__CLR4_4_116af16aflc8azwz2.R.inc(54869);
        __CLR4_4_116af16aflc8azwz2.R.inc(54870);MutableInterval m = new MutableInterval(1000L, 2000L, GJChronology.getInstance());
        __CLR4_4_116af16aflc8azwz2.R.inc(54871);NullConverter.INSTANCE.setInto(m, null, null);
        __CLR4_4_116af16aflc8azwz2.R.inc(54872);assertEquals(TEST_TIME_NOW, m.getStartMillis());
        __CLR4_4_116af16aflc8azwz2.R.inc(54873);assertEquals(TEST_TIME_NOW, m.getEndMillis());
        __CLR4_4_116af16aflc8azwz2.R.inc(54874);assertEquals(ISOChronology.getInstance(), m.getChronology());
    }finally{__CLR4_4_116af16aflc8azwz2.R.flushNeeded();}}

    public void testSetInto_Object_Chronology2() throws Exception {__CLR4_4_116af16aflc8azwz2.R.globalSliceStart(getClass().getName(),54875);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u2eog16cb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116af16aflc8azwz2.R.rethrow($CLV_t2$);}finally{__CLR4_4_116af16aflc8azwz2.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestNullConverter.testSetInto_Object_Chronology2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54875,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u2eog16cb() throws Exception{try{__CLR4_4_116af16aflc8azwz2.R.inc(54875);
        __CLR4_4_116af16aflc8azwz2.R.inc(54876);MutableInterval m = new MutableInterval(1000L, 2000L, GJChronology.getInstance());
        __CLR4_4_116af16aflc8azwz2.R.inc(54877);NullConverter.INSTANCE.setInto(m, null, CopticChronology.getInstance());
        __CLR4_4_116af16aflc8azwz2.R.inc(54878);assertEquals(TEST_TIME_NOW, m.getStartMillis());
        __CLR4_4_116af16aflc8azwz2.R.inc(54879);assertEquals(TEST_TIME_NOW, m.getEndMillis());
        __CLR4_4_116af16aflc8azwz2.R.inc(54880);assertEquals(CopticChronology.getInstance(), m.getChronology());
    }finally{__CLR4_4_116af16aflc8azwz2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString() {__CLR4_4_116af16aflc8azwz2.R.globalSliceStart(getClass().getName(),54881);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid16ch();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116af16aflc8azwz2.R.rethrow($CLV_t2$);}finally{__CLR4_4_116af16aflc8azwz2.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestNullConverter.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54881,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid16ch(){try{__CLR4_4_116af16aflc8azwz2.R.inc(54881);
        __CLR4_4_116af16aflc8azwz2.R.inc(54882);assertEquals("Converter[null]", NullConverter.INSTANCE.toString());
    }finally{__CLR4_4_116af16aflc8azwz2.R.flushNeeded();}}

}
