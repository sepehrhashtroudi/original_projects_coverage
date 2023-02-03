/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2013 Stephen Colebourne
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
import java.util.Arrays;
import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for YearMonthDay.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestYearMonthDay_Basics extends TestCase {static class __CLR4_4_110y510y5lc8azwd0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,48403,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    
    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_110y510y5lc8azwd0.R.inc(47885);
        __CLR4_4_110y510y5lc8azwd0.R.inc(47886);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_110y510y5lc8azwd0.R.inc(47887);
        __CLR4_4_110y510y5lc8azwd0.R.inc(47888);return new TestSuite(TestYearMonthDay_Basics.class);
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    public TestYearMonthDay_Basics(String name) {
        super(name);__CLR4_4_110y510y5lc8azwd0.R.inc(47890);try{__CLR4_4_110y510y5lc8azwd0.R.inc(47889);
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_110y510y5lc8azwd0.R.inc(47891);
        __CLR4_4_110y510y5lc8azwd0.R.inc(47892);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_110y510y5lc8azwd0.R.inc(47893);zone = DateTimeZone.getDefault();
        __CLR4_4_110y510y5lc8azwd0.R.inc(47894);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_110y510y5lc8azwd0.R.inc(47895);
        __CLR4_4_110y510y5lc8azwd0.R.inc(47896);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_110y510y5lc8azwd0.R.inc(47897);DateTimeZone.setDefault(zone);
        __CLR4_4_110y510y5lc8azwd0.R.inc(47898);zone = null;
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGet() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),47899);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tpje3v10yj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testGet",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47899,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tpje3v10yj(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(47899);
        __CLR4_4_110y510y5lc8azwd0.R.inc(47900);YearMonthDay test = new YearMonthDay();
        __CLR4_4_110y510y5lc8azwd0.R.inc(47901);assertEquals(1970, test.get(DateTimeFieldType.year()));
        __CLR4_4_110y510y5lc8azwd0.R.inc(47902);assertEquals(6, test.get(DateTimeFieldType.monthOfYear()));
        __CLR4_4_110y510y5lc8azwd0.R.inc(47903);assertEquals(9, test.get(DateTimeFieldType.dayOfMonth()));
        __CLR4_4_110y510y5lc8azwd0.R.inc(47904);try {
            __CLR4_4_110y510y5lc8azwd0.R.inc(47905);test.get(null);
            __CLR4_4_110y510y5lc8azwd0.R.inc(47906);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_110y510y5lc8azwd0.R.inc(47907);try {
            __CLR4_4_110y510y5lc8azwd0.R.inc(47908);test.get(DateTimeFieldType.hourOfDay());
            __CLR4_4_110y510y5lc8azwd0.R.inc(47909);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    public void testSize() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),47910);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xx12210yu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47910,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xx12210yu(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(47910);
        __CLR4_4_110y510y5lc8azwd0.R.inc(47911);YearMonthDay test = new YearMonthDay();
        __CLR4_4_110y510y5lc8azwd0.R.inc(47912);assertEquals(3, test.size());
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    public void testGetFieldType() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),47913);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18z86mv10yx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testGetFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47913,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18z86mv10yx(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(47913);
        __CLR4_4_110y510y5lc8azwd0.R.inc(47914);YearMonthDay test = new YearMonthDay(COPTIC_PARIS);
        __CLR4_4_110y510y5lc8azwd0.R.inc(47915);assertSame(DateTimeFieldType.year(), test.getFieldType(0));
        __CLR4_4_110y510y5lc8azwd0.R.inc(47916);assertSame(DateTimeFieldType.monthOfYear(), test.getFieldType(1));
        __CLR4_4_110y510y5lc8azwd0.R.inc(47917);assertSame(DateTimeFieldType.dayOfMonth(), test.getFieldType(2));
        __CLR4_4_110y510y5lc8azwd0.R.inc(47918);try {
            __CLR4_4_110y510y5lc8azwd0.R.inc(47919);test.getFieldType(-1);
        } catch (IndexOutOfBoundsException ex) {}
        __CLR4_4_110y510y5lc8azwd0.R.inc(47920);try {
            __CLR4_4_110y510y5lc8azwd0.R.inc(47921);test.getFieldType(3);
        } catch (IndexOutOfBoundsException ex) {}
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    public void testGetFieldTypes() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),47922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z5ndvu10z6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testGetFieldTypes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47922,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z5ndvu10z6(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(47922);
        __CLR4_4_110y510y5lc8azwd0.R.inc(47923);YearMonthDay test = new YearMonthDay(COPTIC_PARIS);
        __CLR4_4_110y510y5lc8azwd0.R.inc(47924);DateTimeFieldType[] fields = test.getFieldTypes();
        __CLR4_4_110y510y5lc8azwd0.R.inc(47925);assertSame(DateTimeFieldType.year(), fields[0]);
        __CLR4_4_110y510y5lc8azwd0.R.inc(47926);assertSame(DateTimeFieldType.monthOfYear(), fields[1]);
        __CLR4_4_110y510y5lc8azwd0.R.inc(47927);assertSame(DateTimeFieldType.dayOfMonth(), fields[2]);
        __CLR4_4_110y510y5lc8azwd0.R.inc(47928);assertNotSame(test.getFieldTypes(), test.getFieldTypes());
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    public void testGetField() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),47929);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lx8n7n10zd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testGetField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47929,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lx8n7n10zd(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(47929);
        __CLR4_4_110y510y5lc8azwd0.R.inc(47930);YearMonthDay test = new YearMonthDay(COPTIC_PARIS);
        __CLR4_4_110y510y5lc8azwd0.R.inc(47931);assertSame(COPTIC_UTC.year(), test.getField(0));
        __CLR4_4_110y510y5lc8azwd0.R.inc(47932);assertSame(COPTIC_UTC.monthOfYear(), test.getField(1));
        __CLR4_4_110y510y5lc8azwd0.R.inc(47933);assertSame(COPTIC_UTC.dayOfMonth(), test.getField(2));
        __CLR4_4_110y510y5lc8azwd0.R.inc(47934);try {
            __CLR4_4_110y510y5lc8azwd0.R.inc(47935);test.getField(-1);
        } catch (IndexOutOfBoundsException ex) {}
        __CLR4_4_110y510y5lc8azwd0.R.inc(47936);try {
            __CLR4_4_110y510y5lc8azwd0.R.inc(47937);test.getField(3);
        } catch (IndexOutOfBoundsException ex) {}
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    public void testGetFields() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),47938);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lmeas10zm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testGetFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47938,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lmeas10zm(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(47938);
        __CLR4_4_110y510y5lc8azwd0.R.inc(47939);YearMonthDay test = new YearMonthDay(COPTIC_PARIS);
        __CLR4_4_110y510y5lc8azwd0.R.inc(47940);DateTimeField[] fields = test.getFields();
        __CLR4_4_110y510y5lc8azwd0.R.inc(47941);assertSame(COPTIC_UTC.year(), fields[0]);
        __CLR4_4_110y510y5lc8azwd0.R.inc(47942);assertSame(COPTIC_UTC.monthOfYear(), fields[1]);
        __CLR4_4_110y510y5lc8azwd0.R.inc(47943);assertSame(COPTIC_UTC.dayOfMonth(), fields[2]);
        __CLR4_4_110y510y5lc8azwd0.R.inc(47944);assertNotSame(test.getFields(), test.getFields());
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    public void testGetValue() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),47945);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qcksmk10zt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testGetValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47945,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qcksmk10zt(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(47945);
        __CLR4_4_110y510y5lc8azwd0.R.inc(47946);YearMonthDay test = new YearMonthDay();
        __CLR4_4_110y510y5lc8azwd0.R.inc(47947);assertEquals(1970, test.getValue(0));
        __CLR4_4_110y510y5lc8azwd0.R.inc(47948);assertEquals(6, test.getValue(1));
        __CLR4_4_110y510y5lc8azwd0.R.inc(47949);assertEquals(9, test.getValue(2));
        __CLR4_4_110y510y5lc8azwd0.R.inc(47950);try {
            __CLR4_4_110y510y5lc8azwd0.R.inc(47951);test.getValue(-1);
        } catch (IndexOutOfBoundsException ex) {}
        __CLR4_4_110y510y5lc8azwd0.R.inc(47952);try {
            __CLR4_4_110y510y5lc8azwd0.R.inc(47953);test.getValue(3);
        } catch (IndexOutOfBoundsException ex) {}
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    public void testGetValues() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),47954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15gduel1102();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testGetValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47954,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15gduel1102(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(47954);
        __CLR4_4_110y510y5lc8azwd0.R.inc(47955);YearMonthDay test = new YearMonthDay();
        __CLR4_4_110y510y5lc8azwd0.R.inc(47956);int[] values = test.getValues();
        __CLR4_4_110y510y5lc8azwd0.R.inc(47957);assertEquals(1970, values[0]);
        __CLR4_4_110y510y5lc8azwd0.R.inc(47958);assertEquals(6, values[1]);
        __CLR4_4_110y510y5lc8azwd0.R.inc(47959);assertEquals(9, values[2]);
        __CLR4_4_110y510y5lc8azwd0.R.inc(47960);assertNotSame(test.getValues(), test.getValues());
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    public void testIsSupported() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),47961);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hma24n1109();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testIsSupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47961,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hma24n1109(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(47961);
        __CLR4_4_110y510y5lc8azwd0.R.inc(47962);YearMonthDay test = new YearMonthDay(COPTIC_PARIS);
        __CLR4_4_110y510y5lc8azwd0.R.inc(47963);assertEquals(true, test.isSupported(DateTimeFieldType.year()));
        __CLR4_4_110y510y5lc8azwd0.R.inc(47964);assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear()));
        __CLR4_4_110y510y5lc8azwd0.R.inc(47965);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfMonth()));
        __CLR4_4_110y510y5lc8azwd0.R.inc(47966);assertEquals(false, test.isSupported(DateTimeFieldType.hourOfDay()));
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    public void testEqualsHashCode() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),47967);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5in77110f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testEqualsHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47967,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5in77110f(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(47967);
        __CLR4_4_110y510y5lc8azwd0.R.inc(47968);YearMonthDay test1 = new YearMonthDay(1970, 6, 9, COPTIC_PARIS);
        __CLR4_4_110y510y5lc8azwd0.R.inc(47969);YearMonthDay test2 = new YearMonthDay(1970, 6, 9, COPTIC_PARIS);
        __CLR4_4_110y510y5lc8azwd0.R.inc(47970);assertEquals(true, test1.equals(test2));
        __CLR4_4_110y510y5lc8azwd0.R.inc(47971);assertEquals(true, test2.equals(test1));
        __CLR4_4_110y510y5lc8azwd0.R.inc(47972);assertEquals(true, test1.equals(test1));
        __CLR4_4_110y510y5lc8azwd0.R.inc(47973);assertEquals(true, test2.equals(test2));
        __CLR4_4_110y510y5lc8azwd0.R.inc(47974);assertEquals(true, test1.hashCode() == test2.hashCode());
        __CLR4_4_110y510y5lc8azwd0.R.inc(47975);assertEquals(true, test1.hashCode() == test1.hashCode());
        __CLR4_4_110y510y5lc8azwd0.R.inc(47976);assertEquals(true, test2.hashCode() == test2.hashCode());
        
        __CLR4_4_110y510y5lc8azwd0.R.inc(47977);YearMonthDay test3 = new YearMonthDay(1971, 6, 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(47978);assertEquals(false, test1.equals(test3));
        __CLR4_4_110y510y5lc8azwd0.R.inc(47979);assertEquals(false, test2.equals(test3));
        __CLR4_4_110y510y5lc8azwd0.R.inc(47980);assertEquals(false, test3.equals(test1));
        __CLR4_4_110y510y5lc8azwd0.R.inc(47981);assertEquals(false, test3.equals(test2));
        __CLR4_4_110y510y5lc8azwd0.R.inc(47982);assertEquals(false, test1.hashCode() == test3.hashCode());
        __CLR4_4_110y510y5lc8azwd0.R.inc(47983);assertEquals(false, test2.hashCode() == test3.hashCode());
        
        __CLR4_4_110y510y5lc8azwd0.R.inc(47984);assertEquals(false, test1.equals("Hello"));
        __CLR4_4_110y510y5lc8azwd0.R.inc(47985);assertEquals(true, test1.equals(new MockInstant()));
        __CLR4_4_110y510y5lc8azwd0.R.inc(47986);assertEquals(false, test1.equals(MockPartial.EMPTY_INSTANCE));
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}
    
    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_110y510y5lc8azwd0.R.inc(47987);
            __CLR4_4_110y510y5lc8azwd0.R.inc(47988);return COPTIC_UTC;
        }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_110y510y5lc8azwd0.R.inc(47989);
            __CLR4_4_110y510y5lc8azwd0.R.inc(47990);return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth(),
            };
        }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_110y510y5lc8azwd0.R.inc(47991);
            __CLR4_4_110y510y5lc8azwd0.R.inc(47992);return new int[] {1970, 6, 9};
        }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    public void testCompareTo() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),47993);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pz6vfv1115();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testCompareTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47993,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pz6vfv1115(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(47993);
        __CLR4_4_110y510y5lc8azwd0.R.inc(47994);YearMonthDay test1 = new YearMonthDay(2005, 6, 2);
        __CLR4_4_110y510y5lc8azwd0.R.inc(47995);YearMonthDay test1a = new YearMonthDay(2005, 6, 2);
        __CLR4_4_110y510y5lc8azwd0.R.inc(47996);assertEquals(0, test1.compareTo(test1a));
        __CLR4_4_110y510y5lc8azwd0.R.inc(47997);assertEquals(0, test1a.compareTo(test1));
        __CLR4_4_110y510y5lc8azwd0.R.inc(47998);assertEquals(0, test1.compareTo(test1));
        __CLR4_4_110y510y5lc8azwd0.R.inc(47999);assertEquals(0, test1a.compareTo(test1a));
        
        __CLR4_4_110y510y5lc8azwd0.R.inc(48000);YearMonthDay test2 = new YearMonthDay(2005, 7, 2);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48001);assertEquals(-1, test1.compareTo(test2));
        __CLR4_4_110y510y5lc8azwd0.R.inc(48002);assertEquals(+1, test2.compareTo(test1));
        
        __CLR4_4_110y510y5lc8azwd0.R.inc(48003);YearMonthDay test3 = new YearMonthDay(2005, 7, 2, GregorianChronology.getInstanceUTC());
        __CLR4_4_110y510y5lc8azwd0.R.inc(48004);assertEquals(-1, test1.compareTo(test3));
        __CLR4_4_110y510y5lc8azwd0.R.inc(48005);assertEquals(+1, test3.compareTo(test1));
        __CLR4_4_110y510y5lc8azwd0.R.inc(48006);assertEquals(0, test3.compareTo(test2));
        
        __CLR4_4_110y510y5lc8azwd0.R.inc(48007);DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.monthOfYear(),
            DateTimeFieldType.dayOfMonth(),
        };
        __CLR4_4_110y510y5lc8azwd0.R.inc(48008);int[] values = new int[] {2005, 6, 2};
        __CLR4_4_110y510y5lc8azwd0.R.inc(48009);Partial p = new Partial(types, values);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48010);assertEquals(0, test1.compareTo(p));
        __CLR4_4_110y510y5lc8azwd0.R.inc(48011);try {
            __CLR4_4_110y510y5lc8azwd0.R.inc(48012);test1.compareTo(null);
            __CLR4_4_110y510y5lc8azwd0.R.inc(48013);fail();
        } catch (NullPointerException ex) {}
//        try {
//            test1.compareTo(new Date());
//            fail();
//        } catch (ClassCastException ex) {}
        __CLR4_4_110y510y5lc8azwd0.R.inc(48014);try {
            __CLR4_4_110y510y5lc8azwd0.R.inc(48015);test1.compareTo(new TimeOfDay());
            __CLR4_4_110y510y5lc8azwd0.R.inc(48016);fail();
        } catch (ClassCastException ex) {}
        __CLR4_4_110y510y5lc8azwd0.R.inc(48017);Partial partial = new Partial()
            .with(DateTimeFieldType.centuryOfEra(), 1)
            .with(DateTimeFieldType.halfdayOfDay(), 0)
            .with(DateTimeFieldType.dayOfMonth(), 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48018);try {
            __CLR4_4_110y510y5lc8azwd0.R.inc(48019);new YearMonthDay(1970, 6, 9).compareTo(partial);
            __CLR4_4_110y510y5lc8azwd0.R.inc(48020);fail();
        } catch (ClassCastException ex) {}
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testIsEqual_YMD() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48021);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jnelao111x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testIsEqual_YMD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48021,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jnelao111x(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48021);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48022);YearMonthDay test1 = new YearMonthDay(2005, 6, 2);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48023);YearMonthDay test1a = new YearMonthDay(2005, 6, 2);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48024);assertEquals(true, test1.isEqual(test1a));
        __CLR4_4_110y510y5lc8azwd0.R.inc(48025);assertEquals(true, test1a.isEqual(test1));
        __CLR4_4_110y510y5lc8azwd0.R.inc(48026);assertEquals(true, test1.isEqual(test1));
        __CLR4_4_110y510y5lc8azwd0.R.inc(48027);assertEquals(true, test1a.isEqual(test1a));
        
        __CLR4_4_110y510y5lc8azwd0.R.inc(48028);YearMonthDay test2 = new YearMonthDay(2005, 7, 2);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48029);assertEquals(false, test1.isEqual(test2));
        __CLR4_4_110y510y5lc8azwd0.R.inc(48030);assertEquals(false, test2.isEqual(test1));
        
        __CLR4_4_110y510y5lc8azwd0.R.inc(48031);YearMonthDay test3 = new YearMonthDay(2005, 7, 2, GregorianChronology.getInstanceUTC());
        __CLR4_4_110y510y5lc8azwd0.R.inc(48032);assertEquals(false, test1.isEqual(test3));
        __CLR4_4_110y510y5lc8azwd0.R.inc(48033);assertEquals(false, test3.isEqual(test1));
        __CLR4_4_110y510y5lc8azwd0.R.inc(48034);assertEquals(true, test3.isEqual(test2));
        
        __CLR4_4_110y510y5lc8azwd0.R.inc(48035);try {
            __CLR4_4_110y510y5lc8azwd0.R.inc(48036);new YearMonthDay(2005, 7, 2).isEqual(null);
            __CLR4_4_110y510y5lc8azwd0.R.inc(48037);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testIsBefore_YMD() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1unyasz112e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testIsBefore_YMD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48038,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1unyasz112e(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48038);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48039);YearMonthDay test1 = new YearMonthDay(2005, 6, 2);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48040);YearMonthDay test1a = new YearMonthDay(2005, 6, 2);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48041);assertEquals(false, test1.isBefore(test1a));
        __CLR4_4_110y510y5lc8azwd0.R.inc(48042);assertEquals(false, test1a.isBefore(test1));
        __CLR4_4_110y510y5lc8azwd0.R.inc(48043);assertEquals(false, test1.isBefore(test1));
        __CLR4_4_110y510y5lc8azwd0.R.inc(48044);assertEquals(false, test1a.isBefore(test1a));
        
        __CLR4_4_110y510y5lc8azwd0.R.inc(48045);YearMonthDay test2 = new YearMonthDay(2005, 7, 2);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48046);assertEquals(true, test1.isBefore(test2));
        __CLR4_4_110y510y5lc8azwd0.R.inc(48047);assertEquals(false, test2.isBefore(test1));
        
        __CLR4_4_110y510y5lc8azwd0.R.inc(48048);YearMonthDay test3 = new YearMonthDay(2005, 7, 2, GregorianChronology.getInstanceUTC());
        __CLR4_4_110y510y5lc8azwd0.R.inc(48049);assertEquals(true, test1.isBefore(test3));
        __CLR4_4_110y510y5lc8azwd0.R.inc(48050);assertEquals(false, test3.isBefore(test1));
        __CLR4_4_110y510y5lc8azwd0.R.inc(48051);assertEquals(false, test3.isBefore(test2));
        
        __CLR4_4_110y510y5lc8azwd0.R.inc(48052);try {
            __CLR4_4_110y510y5lc8azwd0.R.inc(48053);new YearMonthDay(2005, 7, 2).isBefore(null);
            __CLR4_4_110y510y5lc8azwd0.R.inc(48054);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testIsAfter_YMD() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48055);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16kkqw112v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testIsAfter_YMD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48055,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16kkqw112v(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48055);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48056);YearMonthDay test1 = new YearMonthDay(2005, 6, 2);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48057);YearMonthDay test1a = new YearMonthDay(2005, 6, 2);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48058);assertEquals(false, test1.isAfter(test1a));
        __CLR4_4_110y510y5lc8azwd0.R.inc(48059);assertEquals(false, test1a.isAfter(test1));
        __CLR4_4_110y510y5lc8azwd0.R.inc(48060);assertEquals(false, test1.isAfter(test1));
        __CLR4_4_110y510y5lc8azwd0.R.inc(48061);assertEquals(false, test1a.isAfter(test1a));
        
        __CLR4_4_110y510y5lc8azwd0.R.inc(48062);YearMonthDay test2 = new YearMonthDay(2005, 7, 2);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48063);assertEquals(false, test1.isAfter(test2));
        __CLR4_4_110y510y5lc8azwd0.R.inc(48064);assertEquals(true, test2.isAfter(test1));
        
        __CLR4_4_110y510y5lc8azwd0.R.inc(48065);YearMonthDay test3 = new YearMonthDay(2005, 7, 2, GregorianChronology.getInstanceUTC());
        __CLR4_4_110y510y5lc8azwd0.R.inc(48066);assertEquals(false, test1.isAfter(test3));
        __CLR4_4_110y510y5lc8azwd0.R.inc(48067);assertEquals(true, test3.isAfter(test1));
        __CLR4_4_110y510y5lc8azwd0.R.inc(48068);assertEquals(false, test3.isAfter(test2));
        
        __CLR4_4_110y510y5lc8azwd0.R.inc(48069);try {
            __CLR4_4_110y510y5lc8azwd0.R.inc(48070);new YearMonthDay(2005, 7, 2).isAfter(null);
            __CLR4_4_110y510y5lc8azwd0.R.inc(48071);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testWithChronologyRetainFields_Chrono() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48072);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_143gerp113c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithChronologyRetainFields_Chrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48072,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_143gerp113c(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48072);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48073);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48074);YearMonthDay test = base.withChronologyRetainFields(BUDDHIST_TOKYO);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48075);check(base, 2005, 6, 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48076);assertEquals(COPTIC_UTC, base.getChronology());
        __CLR4_4_110y510y5lc8azwd0.R.inc(48077);check(test, 2005, 6, 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48078);assertEquals(BUDDHIST_UTC, test.getChronology());
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    public void testWithChronologyRetainFields_sameChrono() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48079);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15b1wdb113j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithChronologyRetainFields_sameChrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48079,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15b1wdb113j(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48079);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48080);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48081);YearMonthDay test = base.withChronologyRetainFields(COPTIC_TOKYO);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48082);assertSame(base, test);
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    public void testWithChronologyRetainFields_nullChrono() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48083);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j0ft9a113n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithChronologyRetainFields_nullChrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48083,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j0ft9a113n(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48083);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48084);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48085);YearMonthDay test = base.withChronologyRetainFields(null);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48086);check(base, 2005, 6, 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48087);assertEquals(COPTIC_UTC, base.getChronology());
        __CLR4_4_110y510y5lc8azwd0.R.inc(48088);check(test, 2005, 6, 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48089);assertEquals(ISO_UTC, test.getChronology());
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    public void testWithChronologyRetainFields_invalidInNewChrono() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48090);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a802bj113u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithChronologyRetainFields_invalidInNewChrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48090,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a802bj113u(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48090);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48091);YearMonthDay base = new YearMonthDay(2005, 1, 31, ISO_UTC);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48092);try {
            __CLR4_4_110y510y5lc8azwd0.R.inc(48093);base.withChronologyRetainFields(COPTIC_UTC);
            __CLR4_4_110y510y5lc8azwd0.R.inc(48094);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithField1() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48095);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lke16y113z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithField1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48095,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lke16y113z(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48095);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48096);YearMonthDay test = new YearMonthDay(2004, 6, 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48097);YearMonthDay result = test.withField(DateTimeFieldType.year(), 2006);
        
        __CLR4_4_110y510y5lc8azwd0.R.inc(48098);assertEquals(new YearMonthDay(2004, 6, 9), test);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48099);assertEquals(new YearMonthDay(2006, 6, 9), result);
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    public void testWithField2() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ibe2eh1144();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithField2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48100,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ibe2eh1144(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48100);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48101);YearMonthDay test = new YearMonthDay(2004, 6, 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48102);try {
            __CLR4_4_110y510y5lc8azwd0.R.inc(48103);test.withField(null, 6);
            __CLR4_4_110y510y5lc8azwd0.R.inc(48104);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    public void testWithField3() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48105);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2e3m01149();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithField3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48105,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2e3m01149(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48105);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48106);YearMonthDay test = new YearMonthDay(2004, 6, 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48107);try {
            __CLR4_4_110y510y5lc8azwd0.R.inc(48108);test.withField(DateTimeFieldType.hourOfDay(), 6);
            __CLR4_4_110y510y5lc8azwd0.R.inc(48109);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    public void testWithField4() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48110);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bte4tj114e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithField4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48110,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bte4tj114e(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48110);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48111);YearMonthDay test = new YearMonthDay(2004, 6, 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48112);YearMonthDay result = test.withField(DateTimeFieldType.year(), 2004);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48113);assertEquals(new YearMonthDay(2004, 6, 9), test);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48114);assertSame(test, result);
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithFieldAdded1() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48115);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11rgt22114j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithFieldAdded1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48115,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11rgt22114j(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48115);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48116);YearMonthDay test = new YearMonthDay(2004, 6, 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48117);YearMonthDay result = test.withFieldAdded(DurationFieldType.years(), 6);
        
        __CLR4_4_110y510y5lc8azwd0.R.inc(48118);assertEquals(new YearMonthDay(2004, 6, 9), test);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48119);assertEquals(new YearMonthDay(2010, 6, 9), result);
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    public void testWithFieldAdded2() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48120);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_150gruj114o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithFieldAdded2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48120,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_150gruj114o(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48120);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48121);YearMonthDay test = new YearMonthDay(2004, 6, 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48122);try {
            __CLR4_4_110y510y5lc8azwd0.R.inc(48123);test.withFieldAdded(null, 0);
            __CLR4_4_110y510y5lc8azwd0.R.inc(48124);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    public void testWithFieldAdded3() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48125);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_189gqn0114t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithFieldAdded3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48125,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_189gqn0114t(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48125);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48126);YearMonthDay test = new YearMonthDay(2004, 6, 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48127);try {
            __CLR4_4_110y510y5lc8azwd0.R.inc(48128);test.withFieldAdded(null, 6);
            __CLR4_4_110y510y5lc8azwd0.R.inc(48129);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    public void testWithFieldAdded4() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48130);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bigpfh114y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithFieldAdded4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48130,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bigpfh114y(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48130);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48131);YearMonthDay test = new YearMonthDay(2004, 6, 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48132);YearMonthDay result = test.withFieldAdded(DurationFieldType.years(), 0);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48133);assertSame(test, result);
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    public void testWithFieldAdded5() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48134);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ergo7y1152();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithFieldAdded5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48134,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ergo7y1152(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48134);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48135);YearMonthDay test = new YearMonthDay(2004, 6, 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48136);try {
            __CLR4_4_110y510y5lc8azwd0.R.inc(48137);test.withFieldAdded(DurationFieldType.hours(), 6);
            __CLR4_4_110y510y5lc8azwd0.R.inc(48138);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPlus_RP() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48139);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tz83ig1157();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testPlus_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48139,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tz83ig1157(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48139);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48140);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance());
        __CLR4_4_110y510y5lc8azwd0.R.inc(48141);YearMonthDay result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8));
        __CLR4_4_110y510y5lc8azwd0.R.inc(48142);YearMonthDay expected = new YearMonthDay(2003, 7, 7, BuddhistChronology.getInstance());
        __CLR4_4_110y510y5lc8azwd0.R.inc(48143);assertEquals(expected, result);
        
        __CLR4_4_110y510y5lc8azwd0.R.inc(48144);result = test.plus((ReadablePeriod) null);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48145);assertSame(test, result);
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    public void testPlusYears_int() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48146);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mx5kpt115e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testPlusYears_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48146,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mx5kpt115e(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48146);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48147);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance());
        __CLR4_4_110y510y5lc8azwd0.R.inc(48148);YearMonthDay result = test.plusYears(1);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48149);YearMonthDay expected = new YearMonthDay(2003, 5, 3, BuddhistChronology.getInstance());
        __CLR4_4_110y510y5lc8azwd0.R.inc(48150);assertEquals(expected, result);
        
        __CLR4_4_110y510y5lc8azwd0.R.inc(48151);result = test.plusYears(0);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48152);assertSame(test, result);
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    public void testPlusMonths_int() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_170gxai115l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testPlusMonths_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48153,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_170gxai115l(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48153);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48154);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance());
        __CLR4_4_110y510y5lc8azwd0.R.inc(48155);YearMonthDay result = test.plusMonths(1);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48156);YearMonthDay expected = new YearMonthDay(2002, 6, 3, BuddhistChronology.getInstance());
        __CLR4_4_110y510y5lc8azwd0.R.inc(48157);assertEquals(expected, result);
        
        __CLR4_4_110y510y5lc8azwd0.R.inc(48158);result = test.plusMonths(0);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48159);assertSame(test, result);
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    public void testPlusDays_int() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48160);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wpmvkq115s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testPlusDays_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48160,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wpmvkq115s(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48160);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48161);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance());
        __CLR4_4_110y510y5lc8azwd0.R.inc(48162);YearMonthDay result = test.plusDays(1);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48163);YearMonthDay expected = new YearMonthDay(2002, 5, 4, BuddhistChronology.getInstance());
        __CLR4_4_110y510y5lc8azwd0.R.inc(48164);assertEquals(expected, result);
        
        __CLR4_4_110y510y5lc8azwd0.R.inc(48165);result = test.plusDays(0);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48166);assertSame(test, result);
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testMinus_RP() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48167);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_112cpdm115z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testMinus_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48167,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_112cpdm115z(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48167);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48168);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance());
        __CLR4_4_110y510y5lc8azwd0.R.inc(48169);YearMonthDay result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1));
        __CLR4_4_110y510y5lc8azwd0.R.inc(48170);YearMonthDay expected = new YearMonthDay(2001, 4, 2, BuddhistChronology.getInstance());
        __CLR4_4_110y510y5lc8azwd0.R.inc(48171);assertEquals(expected, result);
        
        __CLR4_4_110y510y5lc8azwd0.R.inc(48172);result = test.minus((ReadablePeriod) null);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48173);assertSame(test, result);
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    public void testMinusYears_int() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m9qdin1166();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testMinusYears_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48174,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m9qdin1166(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48174);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48175);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance());
        __CLR4_4_110y510y5lc8azwd0.R.inc(48176);YearMonthDay result = test.minusYears(1);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48177);YearMonthDay expected = new YearMonthDay(2001, 5, 3, BuddhistChronology.getInstance());
        __CLR4_4_110y510y5lc8azwd0.R.inc(48178);assertEquals(expected, result);
        
        __CLR4_4_110y510y5lc8azwd0.R.inc(48179);result = test.minusYears(0);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48180);assertSame(test, result);
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    public void testMinusMonths_int() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48181);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r6k4go116d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testMinusMonths_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48181,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r6k4go116d(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48181);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48182);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance());
        __CLR4_4_110y510y5lc8azwd0.R.inc(48183);YearMonthDay result = test.minusMonths(1);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48184);YearMonthDay expected = new YearMonthDay(2002, 4, 3, BuddhistChronology.getInstance());
        __CLR4_4_110y510y5lc8azwd0.R.inc(48185);assertEquals(expected, result);
        
        __CLR4_4_110y510y5lc8azwd0.R.inc(48186);result = test.minusMonths(0);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48187);assertSame(test, result);
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    public void testMinusDays_int() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hpufck116k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testMinusDays_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48188,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hpufck116k(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48188);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48189);YearMonthDay test = new YearMonthDay(2002, 5, 3, BuddhistChronology.getInstance());
        __CLR4_4_110y510y5lc8azwd0.R.inc(48190);YearMonthDay result = test.minusDays(1);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48191);YearMonthDay expected = new YearMonthDay(2002, 5, 2, BuddhistChronology.getInstance());
        __CLR4_4_110y510y5lc8azwd0.R.inc(48192);assertEquals(expected, result);
        
        __CLR4_4_110y510y5lc8azwd0.R.inc(48193);result = test.minusDays(0);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48194);assertSame(test, result);
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToLocalDate() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48195);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s1orir116r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToLocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48195,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s1orir116r(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48195);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48196);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_UTC);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48197);LocalDate test = base.toLocalDate();
        __CLR4_4_110y510y5lc8azwd0.R.inc(48198);assertEquals(new LocalDate(2005, 6, 9, COPTIC_UTC), test);
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToDateTimeAtMidnight() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48199);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15kwl0u116v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTimeAtMidnight",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48199,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15kwl0u116v(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48199);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48200);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS);
        
        __CLR4_4_110y510y5lc8azwd0.R.inc(48201);DateTime test = base.toDateTimeAtMidnight();
        __CLR4_4_110y510y5lc8azwd0.R.inc(48202);check(base, 2005, 6, 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48203);assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_LONDON), test);
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToDateTimeAtMidnight_Zone() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48204);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1baa1211170();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTimeAtMidnight_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48204,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1baa1211170(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48204);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48205);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS);
        
        __CLR4_4_110y510y5lc8azwd0.R.inc(48206);DateTime test = base.toDateTimeAtMidnight(TOKYO);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48207);check(base, 2005, 6, 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48208);assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_TOKYO), test);
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    public void testToDateTimeAtMidnight_nullZone() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48209);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wkup1q1175();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTimeAtMidnight_nullZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48209,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wkup1q1175(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48209);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48210);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS);
        
        __CLR4_4_110y510y5lc8azwd0.R.inc(48211);DateTime test = base.toDateTimeAtMidnight((DateTimeZone) null);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48212);check(base, 2005, 6, 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48213);assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_LONDON), test);
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToDateTimeAtCurrentTime() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48214);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nxkfla117a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTimeAtCurrentTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48214,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nxkfla117a(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48214);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48215);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_110y510y5lc8azwd0.R.inc(48216);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48217);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        
        __CLR4_4_110y510y5lc8azwd0.R.inc(48218);DateTime test = base.toDateTimeAtCurrentTime();
        __CLR4_4_110y510y5lc8azwd0.R.inc(48219);check(base, 2005, 6, 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48220);DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48221);expected = expected.year().setCopy(2005);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48222);expected = expected.monthOfYear().setCopy(6);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48223);expected = expected.dayOfMonth().setCopy(9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48224);assertEquals(expected, test);
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToDateTimeAtCurrentTime_Zone() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48225);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pbzvx5117l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTimeAtCurrentTime_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48225,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pbzvx5117l(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48225);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48226);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_110y510y5lc8azwd0.R.inc(48227);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48228);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        
        __CLR4_4_110y510y5lc8azwd0.R.inc(48229);DateTime test = base.toDateTimeAtCurrentTime(TOKYO);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48230);check(base, 2005, 6, 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48231);DateTime expected = new DateTime(dt.getMillis(), COPTIC_TOKYO);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48232);expected = expected.year().setCopy(2005);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48233);expected = expected.monthOfYear().setCopy(6);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48234);expected = expected.dayOfMonth().setCopy(9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48235);assertEquals(expected, test);
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    public void testToDateTimeAtCurrentTime_nullZone() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48236);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sccwr2117w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTimeAtCurrentTime_nullZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48236,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sccwr2117w(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48236);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48237);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_110y510y5lc8azwd0.R.inc(48238);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48239);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        
        __CLR4_4_110y510y5lc8azwd0.R.inc(48240);DateTime test = base.toDateTimeAtCurrentTime((DateTimeZone) null);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48241);check(base, 2005, 6, 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48242);DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48243);expected = expected.year().setCopy(2005);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48244);expected = expected.monthOfYear().setCopy(6);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48245);expected = expected.dayOfMonth().setCopy(9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48246);assertEquals(expected, test);
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToDateTime_TOD() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48247);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b5cus91187();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTime_TOD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48247,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b5cus91187(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48247);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48248);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_110y510y5lc8azwd0.R.inc(48249);TimeOfDay tod = new TimeOfDay(12, 13, 14, 15, BUDDHIST_TOKYO);
        
        __CLR4_4_110y510y5lc8azwd0.R.inc(48250);DateTime test = base.toDateTime(tod);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48251);check(base, 2005, 6, 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48252);DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_LONDON);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48253);assertEquals(expected, test);
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    public void testToDateTime_nullTOD() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48254);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1te876a118e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTime_nullTOD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48254,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1te876a118e(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48254);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48255);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_110y510y5lc8azwd0.R.inc(48256);long now = new DateTime(2004, 5, 8, 12, 13, 14, 15, COPTIC_LONDON).getMillis();
        __CLR4_4_110y510y5lc8azwd0.R.inc(48257);DateTimeUtils.setCurrentMillisFixed(now);
        
        __CLR4_4_110y510y5lc8azwd0.R.inc(48258);DateTime test = base.toDateTime((TimeOfDay) null);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48259);check(base, 2005, 6, 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48260);DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_LONDON);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48261);assertEquals(expected, test);
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToDateTime_TOD_Zone() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_123egu8118m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTime_TOD_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48262,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_123egu8118m(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48262);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48263);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_110y510y5lc8azwd0.R.inc(48264);TimeOfDay tod = new TimeOfDay(12, 13, 14, 15, BUDDHIST_TOKYO);
        
        __CLR4_4_110y510y5lc8azwd0.R.inc(48265);DateTime test = base.toDateTime(tod, TOKYO);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48266);check(base, 2005, 6, 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48267);DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_TOKYO);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48268);assertEquals(expected, test);
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    public void testToDateTime_TOD_nullZone() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48269);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a0m8dj118t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTime_TOD_nullZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48269,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a0m8dj118t(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48269);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48270);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_110y510y5lc8azwd0.R.inc(48271);TimeOfDay tod = new TimeOfDay(12, 13, 14, 15, BUDDHIST_TOKYO);
        
        __CLR4_4_110y510y5lc8azwd0.R.inc(48272);DateTime test = base.toDateTime(tod, null);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48273);check(base, 2005, 6, 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48274);DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_LONDON);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48275);assertEquals(expected, test);
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    public void testToDateTime_nullTOD_Zone() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48276);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w71h951190();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTime_nullTOD_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48276,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w71h951190(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48276);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48277);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_110y510y5lc8azwd0.R.inc(48278);long now = new DateTime(2004, 5, 8, 12, 13, 14, 15, COPTIC_TOKYO).getMillis();
        __CLR4_4_110y510y5lc8azwd0.R.inc(48279);DateTimeUtils.setCurrentMillisFixed(now);
        
        __CLR4_4_110y510y5lc8azwd0.R.inc(48280);DateTime test = base.toDateTime((TimeOfDay) null, TOKYO);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48281);check(base, 2005, 6, 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48282);DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_TOKYO);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48283);assertEquals(expected, test);
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToDateMidnight() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1osch5e1198();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateMidnight",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48284,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1osch5e1198(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48284);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48285);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS);
        
        __CLR4_4_110y510y5lc8azwd0.R.inc(48286);DateMidnight test = base.toDateMidnight();
        __CLR4_4_110y510y5lc8azwd0.R.inc(48287);check(base, 2005, 6, 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48288);assertEquals(new DateMidnight(2005, 6, 9, COPTIC_LONDON), test);
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToDateMidnight_Zone() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48289);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11f3vmv119d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateMidnight_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48289,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11f3vmv119d(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48289);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48290);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS);
        
        __CLR4_4_110y510y5lc8azwd0.R.inc(48291);DateMidnight test = base.toDateMidnight(TOKYO);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48292);check(base, 2005, 6, 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48293);assertEquals(new DateMidnight(2005, 6, 9, COPTIC_TOKYO), test);
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    public void testToDateMidnight_nullZone() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48294);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15031fy119i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateMidnight_nullZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48294,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15031fy119i(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48294);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48295);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS);
        
        __CLR4_4_110y510y5lc8azwd0.R.inc(48296);DateMidnight test = base.toDateMidnight((DateTimeZone) null);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48297);check(base, 2005, 6, 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48298);assertEquals(new DateMidnight(2005, 6, 9, COPTIC_LONDON), test);
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToDateTime_RI() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1584tmd119n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTime_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48299,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1584tmd119n(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48299);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48300);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48301);DateTime dt = new DateTime(2002, 1, 3, 4, 5, 6, 7);
        
        __CLR4_4_110y510y5lc8azwd0.R.inc(48302);DateTime test = base.toDateTime(dt);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48303);check(base, 2005, 6, 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48304);DateTime expected = dt;
        __CLR4_4_110y510y5lc8azwd0.R.inc(48305);expected = expected.year().setCopy(2005);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48306);expected = expected.monthOfYear().setCopy(6);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48307);expected = expected.dayOfMonth().setCopy(9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48308);assertEquals(expected, test);
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    public void testToDateTime_nullRI() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48309);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xlns4119x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToDateTime_nullRI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48309,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xlns4119x(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48309);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48310);YearMonthDay base = new YearMonthDay(2005, 6, 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48311);DateTime dt = new DateTime(2002, 1, 3, 4, 5, 6, 7);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48312);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        
        __CLR4_4_110y510y5lc8azwd0.R.inc(48313);DateTime test = base.toDateTime((ReadableInstant) null);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48314);check(base, 2005, 6, 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48315);DateTime expected = dt;
        __CLR4_4_110y510y5lc8azwd0.R.inc(48316);expected = expected.year().setCopy(2005);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48317);expected = expected.monthOfYear().setCopy(6);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48318);expected = expected.dayOfMonth().setCopy(9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48319);assertEquals(expected, test);
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToInterval() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cj50gp11a8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48320,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cj50gp11a8(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48320);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48321);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_110y510y5lc8azwd0.R.inc(48322);Interval test = base.toInterval();
        __CLR4_4_110y510y5lc8azwd0.R.inc(48323);check(base, 2005, 6, 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48324);DateTime start = base.toDateTime(TimeOfDay.MIDNIGHT);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48325);DateTime end = start.plus(Period.days(1));
        __CLR4_4_110y510y5lc8azwd0.R.inc(48326);Interval expected = new Interval(start, end);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48327);assertEquals(expected, test);
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToInterval_Zone() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48328);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wpa0zk11ag();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToInterval_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48328,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wpa0zk11ag(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48328);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48329);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_110y510y5lc8azwd0.R.inc(48330);Interval test = base.toInterval(TOKYO);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48331);check(base, 2005, 6, 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48332);DateTime start = base.toDateTime(TimeOfDay.MIDNIGHT, TOKYO);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48333);DateTime end = start.plus(Period.days(1));
        __CLR4_4_110y510y5lc8azwd0.R.inc(48334);Interval expected = new Interval(start, end);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48335);assertEquals(expected, test);
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    public void testToInterval_nullZone() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19hp1i111ao();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToInterval_nullZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48336,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19hp1i111ao(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48336);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48337);YearMonthDay base = new YearMonthDay(2005, 6, 9, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_110y510y5lc8azwd0.R.inc(48338);Interval test = base.toInterval(null);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48339);check(base, 2005, 6, 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48340);DateTime start = base.toDateTime(TimeOfDay.MIDNIGHT, LONDON);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48341);DateTime end = start.plus(Period.days(1));
        __CLR4_4_110y510y5lc8azwd0.R.inc(48342);Interval expected = new Interval(start, end);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48343);assertEquals(expected, test);
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithers() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48344);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sn9jzp11aw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testWithers",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48344,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sn9jzp11aw(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48344);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48345);YearMonthDay test = new YearMonthDay(1970, 6, 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48346);check(test.withYear(2000), 2000, 6, 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48347);check(test.withMonthOfYear(2), 1970, 2, 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48348);check(test.withDayOfMonth(2), 1970, 6, 2);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48349);try {
            __CLR4_4_110y510y5lc8azwd0.R.inc(48350);test.withMonthOfYear(0);
            __CLR4_4_110y510y5lc8azwd0.R.inc(48351);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_110y510y5lc8azwd0.R.inc(48352);try {
            __CLR4_4_110y510y5lc8azwd0.R.inc(48353);test.withMonthOfYear(13);
            __CLR4_4_110y510y5lc8azwd0.R.inc(48354);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testProperty() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48355);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i7neoi11b7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testProperty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48355,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i7neoi11b7(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48355);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48356);YearMonthDay test = new YearMonthDay(2005, 6, 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48357);assertEquals(test.year(), test.property(DateTimeFieldType.year()));
        __CLR4_4_110y510y5lc8azwd0.R.inc(48358);assertEquals(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear()));
        __CLR4_4_110y510y5lc8azwd0.R.inc(48359);assertEquals(test.dayOfMonth(), test.property(DateTimeFieldType.dayOfMonth()));
        __CLR4_4_110y510y5lc8azwd0.R.inc(48360);try {
            __CLR4_4_110y510y5lc8azwd0.R.inc(48361);test.property(DateTimeFieldType.millisOfDay());
            __CLR4_4_110y510y5lc8azwd0.R.inc(48362);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_110y510y5lc8azwd0.R.inc(48363);try {
            __CLR4_4_110y510y5lc8azwd0.R.inc(48364);test.property(null);
            __CLR4_4_110y510y5lc8azwd0.R.inc(48365);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSerialization() throws Exception {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48366);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on911bi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48366,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on911bi() throws Exception{try{__CLR4_4_110y510y5lc8azwd0.R.inc(48366);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48367);YearMonthDay test = new YearMonthDay(1972, 6, 9, COPTIC_PARIS);
        
        __CLR4_4_110y510y5lc8azwd0.R.inc(48368);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_110y510y5lc8azwd0.R.inc(48369);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48370);oos.writeObject(test);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48371);byte[] bytes = baos.toByteArray();
        __CLR4_4_110y510y5lc8azwd0.R.inc(48372);oos.close();
        
        __CLR4_4_110y510y5lc8azwd0.R.inc(48373);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48374);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48375);YearMonthDay result = (YearMonthDay) ois.readObject();
        __CLR4_4_110y510y5lc8azwd0.R.inc(48376);ois.close();
        
        __CLR4_4_110y510y5lc8azwd0.R.inc(48377);assertEquals(test, result);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48378);assertTrue(Arrays.equals(test.getValues(), result.getValues()));
        __CLR4_4_110y510y5lc8azwd0.R.inc(48379);assertTrue(Arrays.equals(test.getFields(), result.getFields()));
        __CLR4_4_110y510y5lc8azwd0.R.inc(48380);assertEquals(test.getChronology(), result.getChronology());
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48381);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid11bx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48381,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid11bx(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48381);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48382);YearMonthDay test = new YearMonthDay(2002, 6, 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48383);assertEquals("2002-06-09", test.toString());
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString_String() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48384);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1llkh2x11c0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToString_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48384,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1llkh2x11c0(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48384);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48385);YearMonthDay test = new YearMonthDay(2002, 6, 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48386);assertEquals("2002 \ufffd\ufffd", test.toString("yyyy HH"));
        __CLR4_4_110y510y5lc8azwd0.R.inc(48387);assertEquals("2002-06-09", test.toString((String) null));
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString_String_Locale() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1afd64u11c4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToString_String_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48388,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1afd64u11c4(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48388);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48389);YearMonthDay test = new YearMonthDay(2002, 6, 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48390);assertEquals("\ufffd 9/6", test.toString("EEE d/M", Locale.ENGLISH));
        __CLR4_4_110y510y5lc8azwd0.R.inc(48391);assertEquals("\ufffd 9/6", test.toString("EEE d/M", Locale.FRENCH));
        __CLR4_4_110y510y5lc8azwd0.R.inc(48392);assertEquals("2002-06-09", test.toString(null, Locale.ENGLISH));
        __CLR4_4_110y510y5lc8azwd0.R.inc(48393);assertEquals("\ufffd 9/6", test.toString("EEE d/M", null));
        __CLR4_4_110y510y5lc8azwd0.R.inc(48394);assertEquals("2002-06-09", test.toString(null, null));
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString_DTFormatter() {__CLR4_4_110y510y5lc8azwd0.R.globalSliceStart(getClass().getName(),48395);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mxbkps11cb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110y510y5lc8azwd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_110y510y5lc8azwd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Basics.testToString_DTFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48395,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mxbkps11cb(){try{__CLR4_4_110y510y5lc8azwd0.R.inc(48395);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48396);YearMonthDay test = new YearMonthDay(2002, 6, 9);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48397);assertEquals("2002 \ufffd\ufffd", test.toString(DateTimeFormat.forPattern("yyyy HH")));
        __CLR4_4_110y510y5lc8azwd0.R.inc(48398);assertEquals("2002-06-09", test.toString((DateTimeFormatter) null));
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void check(YearMonthDay test, int hour, int min, int sec) {try{__CLR4_4_110y510y5lc8azwd0.R.inc(48399);
        __CLR4_4_110y510y5lc8azwd0.R.inc(48400);assertEquals(hour, test.getYear());
        __CLR4_4_110y510y5lc8azwd0.R.inc(48401);assertEquals(min, test.getMonthOfYear());
        __CLR4_4_110y510y5lc8azwd0.R.inc(48402);assertEquals(sec, test.getDayOfMonth());
    }finally{__CLR4_4_110y510y5lc8azwd0.R.flushNeeded();}}
}
