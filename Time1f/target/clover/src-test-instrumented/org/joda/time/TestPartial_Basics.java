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
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for Partial.
 *
 * @author Stephen Colebourne
 */
public class TestPartial_Basics extends TestCase {static class __CLR4_4_1whnwhnlc8azw2j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,42688,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_LONDON = BuddhistChronology.getInstance(LONDON);
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    
    private long TEST_TIME_NOW =
            10L * DateTimeConstants.MILLIS_PER_HOUR
            + 20L * DateTimeConstants.MILLIS_PER_MINUTE
            + 30L * DateTimeConstants.MILLIS_PER_SECOND
            + 40L;
    private long TEST_TIME2 =
        1L * DateTimeConstants.MILLIS_PER_DAY
        + 5L * DateTimeConstants.MILLIS_PER_HOUR
        + 6L * DateTimeConstants.MILLIS_PER_MINUTE
        + 7L * DateTimeConstants.MILLIS_PER_SECOND
        + 8L;
        
    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42107);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42108);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42109);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42110);return new TestSuite(TestPartial_Basics.class);
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public TestPartial_Basics(String name) {
        super(name);__CLR4_4_1whnwhnlc8azw2j.R.inc(42112);try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42111);
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42113);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42114);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42115);zone = DateTimeZone.getDefault();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42116);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42117);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42118);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42119);DateTimeZone.setDefault(zone);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42120);zone = null;
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGet() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42121);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tpje3vwi1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testGet",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42121,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tpje3vwi1(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42121);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42122);Partial test = createHourMinPartial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42123);assertEquals(10, test.get(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42124);assertEquals(20, test.get(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42125);try {
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42126);test.get(null);
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42127);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42128);try {
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42129);test.get(DateTimeFieldType.secondOfMinute());
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42130);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testSize() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42131);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xx122wib();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42131,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xx122wib(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42131);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42132);Partial test = createHourMinPartial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42133);assertEquals(2, test.size());
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testGetFieldType() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42134);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18z86mvwie();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testGetFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42134,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18z86mvwie(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42134);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42135);Partial test = createHourMinPartial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42136);assertSame(DateTimeFieldType.hourOfDay(), test.getFieldType(0));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42137);assertSame(DateTimeFieldType.minuteOfHour(), test.getFieldType(1));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42138);try {
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42139);test.getFieldType(-1);
        } catch (IndexOutOfBoundsException ex) {}
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42140);try {
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42141);test.getFieldType(2);
        } catch (IndexOutOfBoundsException ex) {}
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testGetFieldTypes() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z5ndvuwim();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testGetFieldTypes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42142,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z5ndvuwim(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42142);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42143);Partial test = createHourMinPartial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42144);DateTimeFieldType[] fields = test.getFieldTypes();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42145);assertEquals(2, fields.length);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42146);assertSame(DateTimeFieldType.hourOfDay(), fields[0]);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42147);assertSame(DateTimeFieldType.minuteOfHour(), fields[1]);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42148);assertNotSame(test.getFieldTypes(), test.getFieldTypes());
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testGetField() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42149);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lx8n7nwit();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testGetField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42149,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lx8n7nwit(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42149);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42150);Partial test = createHourMinPartial(COPTIC_PARIS);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42151);assertSame(CopticChronology.getInstanceUTC().hourOfDay(), test.getField(0));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42152);assertSame(CopticChronology.getInstanceUTC().minuteOfHour(), test.getField(1));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42153);try {
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42154);test.getField(-1);
        } catch (IndexOutOfBoundsException ex) {}
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42155);try {
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42156);test.getField(5);
        } catch (IndexOutOfBoundsException ex) {}
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testGetFields() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lmeaswj1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testGetFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42157,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lmeaswj1(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42157);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42158);Partial test = createHourMinPartial(COPTIC_PARIS);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42159);DateTimeField[] fields = test.getFields();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42160);assertEquals(2, fields.length);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42161);assertSame(CopticChronology.getInstanceUTC().hourOfDay(), fields[0]);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42162);assertSame(CopticChronology.getInstanceUTC().minuteOfHour(), fields[1]);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42163);assertNotSame(test.getFields(), test.getFields());
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testGetValue() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42164);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qcksmkwj8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testGetValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42164,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qcksmkwj8(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42164);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42165);Partial test = createHourMinPartial(COPTIC_PARIS);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42166);assertEquals(10, test.getValue(0));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42167);assertEquals(20, test.getValue(1));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42168);try {
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42169);test.getValue(-1);
        } catch (IndexOutOfBoundsException ex) {}
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42170);try {
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42171);test.getValue(2);
        } catch (IndexOutOfBoundsException ex) {}
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testGetValues() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42172);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15gduelwjg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testGetValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42172,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15gduelwjg(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42172);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42173);Partial test = createHourMinPartial(COPTIC_PARIS);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42174);int[] values = test.getValues();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42175);assertEquals(2, values.length);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42176);assertEquals(10, values[0]);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42177);assertEquals(20, values[1]);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42178);assertNotSame(test.getValues(), test.getValues());
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testIsSupported() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42179);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hma24nwjn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testIsSupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42179,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hma24nwjn(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42179);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42180);Partial test = createHourMinPartial(COPTIC_PARIS);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42181);assertEquals(true, test.isSupported(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42182);assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42183);assertEquals(false, test.isSupported(DateTimeFieldType.secondOfMinute()));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42184);assertEquals(false, test.isSupported(DateTimeFieldType.millisOfSecond()));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42185);assertEquals(false, test.isSupported(DateTimeFieldType.dayOfMonth()));
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    public void testEqualsHashCode() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42186);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5in77wju();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testEqualsHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42186,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5in77wju(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42186);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42187);Partial test1 = createHourMinPartial(COPTIC_PARIS);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42188);Partial test2 = createHourMinPartial(COPTIC_PARIS);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42189);assertEquals(true, test1.equals(test2));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42190);assertEquals(true, test2.equals(test1));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42191);assertEquals(true, test1.equals(test1));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42192);assertEquals(true, test2.equals(test2));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42193);assertEquals(true, test1.hashCode() == test2.hashCode());
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42194);assertEquals(true, test1.hashCode() == test1.hashCode());
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42195);assertEquals(true, test2.hashCode() == test2.hashCode());
        
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42196);Partial test3 = createHourMinPartial2(COPTIC_PARIS);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42197);assertEquals(false, test1.equals(test3));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42198);assertEquals(false, test2.equals(test3));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42199);assertEquals(false, test3.equals(test1));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42200);assertEquals(false, test3.equals(test2));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42201);assertEquals(false, test1.hashCode() == test3.hashCode());
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42202);assertEquals(false, test2.hashCode() == test3.hashCode());
        
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42203);assertEquals(false, test1.equals("Hello"));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42204);assertEquals(false, test1.equals(MockPartial.EMPTY_INSTANCE));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42205);assertEquals(new TimeOfDay(10, 20, 30, 40), createTODPartial(ISO_UTC));
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    public void testCompareTo() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42206);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pz6vfvwke();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testCompareTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42206,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pz6vfvwke(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42206);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42207);Partial test1 = createHourMinPartial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42208);Partial test1a = createHourMinPartial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42209);assertEquals(0, test1.compareTo(test1a));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42210);assertEquals(0, test1a.compareTo(test1));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42211);assertEquals(0, test1.compareTo(test1));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42212);assertEquals(0, test1a.compareTo(test1a));
        
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42213);Partial test2 = createHourMinPartial2(ISO_UTC);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42214);assertEquals(-1, test1.compareTo(test2));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42215);assertEquals(+1, test2.compareTo(test1));
        
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42216);Partial test3 = createHourMinPartial2(COPTIC_UTC);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42217);assertEquals(-1, test1.compareTo(test3));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42218);assertEquals(+1, test3.compareTo(test1));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42219);assertEquals(0, test3.compareTo(test2));
        
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42220);assertEquals(0, new TimeOfDay(10, 20, 30, 40).compareTo(createTODPartial(ISO_UTC)));
        
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42221);try {
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42222);test1.compareTo(null);
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42223);fail();
        } catch (NullPointerException ex) {}
//        try {
//            test1.compareTo(new Date());
//            fail();
//        } catch (ClassCastException ex) {}
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42224);try {
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42225);test1.compareTo(new YearMonthDay());
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42226);fail();
        } catch (ClassCastException ex) {}
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42227);try {
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42228);createTODPartial(ISO_UTC).without(DateTimeFieldType.hourOfDay()).compareTo(new YearMonthDay());
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42229);fail();
        } catch (ClassCastException ex) {}
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testIsEqual_TOD() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iq9sq1wl2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testIsEqual_TOD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42230,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iq9sq1wl2(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42230);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42231);Partial test1 = createHourMinPartial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42232);Partial test1a = createHourMinPartial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42233);assertEquals(true, test1.isEqual(test1a));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42234);assertEquals(true, test1a.isEqual(test1));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42235);assertEquals(true, test1.isEqual(test1));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42236);assertEquals(true, test1a.isEqual(test1a));
        
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42237);Partial test2 = createHourMinPartial2(ISO_UTC);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42238);assertEquals(false, test1.isEqual(test2));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42239);assertEquals(false, test2.isEqual(test1));
        
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42240);Partial test3 = createHourMinPartial2(COPTIC_UTC);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42241);assertEquals(false, test1.isEqual(test3));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42242);assertEquals(false, test3.isEqual(test1));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42243);assertEquals(true, test3.isEqual(test2));
        
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42244);try {
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42245);createHourMinPartial().isEqual(null);
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42246);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testIsBefore_TOD() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42247);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tqti8cwlj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testIsBefore_TOD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42247,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tqti8cwlj(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42247);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42248);Partial test1 = createHourMinPartial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42249);Partial test1a = createHourMinPartial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42250);assertEquals(false, test1.isBefore(test1a));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42251);assertEquals(false, test1a.isBefore(test1));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42252);assertEquals(false, test1.isBefore(test1));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42253);assertEquals(false, test1a.isBefore(test1a));
        
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42254);Partial test2 = createHourMinPartial2(ISO_UTC);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42255);assertEquals(true, test1.isBefore(test2));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42256);assertEquals(false, test2.isBefore(test1));
        
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42257);Partial test3 = createHourMinPartial2(COPTIC_UTC);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42258);assertEquals(true, test1.isBefore(test3));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42259);assertEquals(false, test3.isBefore(test1));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42260);assertEquals(false, test3.isBefore(test2));
        
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42261);try {
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42262);createHourMinPartial().isBefore(null);
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42263);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testIsAfter_TOD() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42264);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_113pdbjwm0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testIsAfter_TOD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42264,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_113pdbjwm0(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42264);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42265);Partial test1 = createHourMinPartial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42266);Partial test1a = createHourMinPartial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42267);assertEquals(false, test1.isAfter(test1a));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42268);assertEquals(false, test1a.isAfter(test1));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42269);assertEquals(false, test1.isAfter(test1));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42270);assertEquals(false, test1a.isAfter(test1a));
        
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42271);Partial test2 = createHourMinPartial2(ISO_UTC);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42272);assertEquals(false, test1.isAfter(test2));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42273);assertEquals(true, test2.isAfter(test1));
        
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42274);Partial test3 = createHourMinPartial2(COPTIC_UTC);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42275);assertEquals(false, test1.isAfter(test3));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42276);assertEquals(true, test3.isAfter(test1));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42277);assertEquals(false, test3.isAfter(test2));
        
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42278);try {
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42279);createHourMinPartial().isAfter(null);
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42280);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testWithChronologyRetainFields_Chrono() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42281);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_143gerpwmh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithChronologyRetainFields_Chrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42281,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_143gerpwmh(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42281);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42282);Partial base = createHourMinPartial(COPTIC_PARIS);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42283);Partial test = base.withChronologyRetainFields(BUDDHIST_TOKYO);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42284);check(base, 10, 20);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42285);assertEquals(COPTIC_UTC, base.getChronology());
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42286);check(test, 10, 20);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42287);assertEquals(BUDDHIST_UTC, test.getChronology());
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testWithChronologyRetainFields_sameChrono() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42288);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15b1wdbwmo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithChronologyRetainFields_sameChrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42288,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15b1wdbwmo(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42288);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42289);Partial base = createHourMinPartial(COPTIC_PARIS);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42290);Partial test = base.withChronologyRetainFields(COPTIC_TOKYO);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42291);assertSame(base, test);
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testWithChronologyRetainFields_nullChrono() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42292);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j0ft9awms();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithChronologyRetainFields_nullChrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42292,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j0ft9awms(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42292);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42293);Partial base = createHourMinPartial(COPTIC_PARIS);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42294);Partial test = base.withChronologyRetainFields(null);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42295);check(base, 10, 20);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42296);assertEquals(COPTIC_UTC, base.getChronology());
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42297);check(test, 10, 20);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42298);assertEquals(ISO_UTC, test.getChronology());
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWith1() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1513sbkwmz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42299,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1513sbkwmz(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42299);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42300);Partial test = createHourMinPartial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42301);Partial result = test.with(DateTimeFieldType.hourOfDay(), 15);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42302);check(test, 10, 20);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42303);check(result, 15, 20);
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testWith2() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42304);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11s3tj3wn4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42304,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11s3tj3wn4(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42304);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42305);Partial test = createHourMinPartial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42306);try {
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42307);test.with(null, 6);
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42308);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42309);check(test, 10, 20);
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testWith3() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11gw59ewna();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42310,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11gw59ewna(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42310);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42311);Partial test = createHourMinPartial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42312);try {
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42313);test.with(DateTimeFieldType.clockhourOfDay(), 6);
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42314);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42315);check(test, 10, 20);
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testWith3a() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42316);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rzr0y5wng();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith3a",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42316,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rzr0y5wng(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42316);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42317);Partial test = createHourMinPartial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42318);Partial result = test.with(DateTimeFieldType.secondOfMinute(), 15);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42319);check(test, 10, 20);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42320);assertEquals(3, result.size());
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42321);assertEquals(true, result.isSupported(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42322);assertEquals(true, result.isSupported(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42323);assertEquals(true, result.isSupported(DateTimeFieldType.secondOfMinute()));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42324);assertEquals(DateTimeFieldType.hourOfDay(), result.getFieldType(0));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42325);assertEquals(DateTimeFieldType.minuteOfHour(), result.getFieldType(1));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42326);assertEquals(DateTimeFieldType.secondOfMinute(), result.getFieldType(2));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42327);assertEquals(10, result.get(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42328);assertEquals(20, result.get(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42329);assertEquals(15, result.get(DateTimeFieldType.secondOfMinute()));
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testWith3b() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42330);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v8qzqmwnu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith3b",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42330,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v8qzqmwnu(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42330);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42331);Partial test = createHourMinPartial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42332);Partial result = test.with(DateTimeFieldType.minuteOfDay(), 15);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42333);check(test, 10, 20);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42334);assertEquals(3, result.size());
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42335);assertEquals(true, result.isSupported(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42336);assertEquals(true, result.isSupported(DateTimeFieldType.minuteOfDay()));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42337);assertEquals(true, result.isSupported(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42338);assertEquals(DateTimeFieldType.hourOfDay(), result.getFieldType(0));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42339);assertEquals(DateTimeFieldType.minuteOfDay(), result.getFieldType(1));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42340);assertEquals(DateTimeFieldType.minuteOfHour(), result.getFieldType(2));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42341);assertEquals(10, result.get(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42342);assertEquals(20, result.get(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42343);assertEquals(15, result.get(DateTimeFieldType.minuteOfDay()));
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testWith3c() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42344);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yhqyj3wo8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith3c",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42344,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yhqyj3wo8(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42344);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42345);Partial test = createHourMinPartial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42346);Partial result = test.with(DateTimeFieldType.dayOfMonth(), 15);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42347);check(test, 10, 20);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42348);assertEquals(3, result.size());
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42349);assertEquals(true, result.isSupported(DateTimeFieldType.dayOfMonth()));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42350);assertEquals(true, result.isSupported(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42351);assertEquals(true, result.isSupported(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42352);assertEquals(DateTimeFieldType.dayOfMonth(), result.getFieldType(0));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42353);assertEquals(DateTimeFieldType.hourOfDay(), result.getFieldType(1));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42354);assertEquals(DateTimeFieldType.minuteOfHour(), result.getFieldType(2));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42355);assertEquals(10, result.get(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42356);assertEquals(20, result.get(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42357);assertEquals(15, result.get(DateTimeFieldType.dayOfMonth()));
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testWith3d() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42358);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xad4nkwom();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith3d",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42358,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xad4nkwom(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42358);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42359);Partial test = new Partial(DateTimeFieldType.year(), 2005);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42360);Partial result = test.with(DateTimeFieldType.monthOfYear(), 6);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42361);assertEquals(2, result.size());
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42362);assertEquals(2005, result.get(DateTimeFieldType.year()));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42363);assertEquals(6, result.get(DateTimeFieldType.monthOfYear()));
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}        

    public void testWith3e() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42364);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u1d5v3wos();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith3e",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42364,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u1d5v3wos(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42364);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42365);Partial test = new Partial(DateTimeFieldType.era(), 1);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42366);Partial result = test.with(DateTimeFieldType.halfdayOfDay(), 0);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42367);assertEquals(2, result.size());
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42368);assertEquals(1, result.get(DateTimeFieldType.era()));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42369);assertEquals(0, result.get(DateTimeFieldType.halfdayOfDay()));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42370);assertEquals(0, result.indexOf(DateTimeFieldType.era()));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42371);assertEquals(1, result.indexOf(DateTimeFieldType.halfdayOfDay()));
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}        

    public void testWith3f() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42372);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qsd72mwp0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith3f",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42372,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qsd72mwp0(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42372);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42373);Partial test = new Partial(DateTimeFieldType.halfdayOfDay(), 0);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42374);Partial result = test.with(DateTimeFieldType.era(), 1);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42375);assertEquals(2, result.size());
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42376);assertEquals(1, result.get(DateTimeFieldType.era()));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42377);assertEquals(0, result.get(DateTimeFieldType.halfdayOfDay()));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42378);assertEquals(0, result.indexOf(DateTimeFieldType.era()));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42379);assertEquals(1, result.indexOf(DateTimeFieldType.halfdayOfDay()));
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}        

    public void testWith4() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14pw41vwp8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42380,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14pw41vwp8(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42380);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42381);Partial test = createHourMinPartial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42382);Partial result = test.with(DateTimeFieldType.hourOfDay(), 10);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42383);assertSame(test, result);
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testWith_baseHasNoRange() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42384);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ctt4tbwpc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith_baseHasNoRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42384,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ctt4tbwpc(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42384);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42385);Partial test = new Partial(DateTimeFieldType.year(), 1);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42386);Partial result = test.with(DateTimeFieldType.hourOfDay(), 10);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42387);assertEquals(2, result.size());
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42388);assertEquals(0, result.indexOf(DateTimeFieldType.year()));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42389);assertEquals(1, result.indexOf(DateTimeFieldType.hourOfDay()));
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testWith_argHasNoRange() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42390);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rdvwd4wpi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith_argHasNoRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42390,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rdvwd4wpi(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42390);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42391);Partial test = new Partial(DateTimeFieldType.hourOfDay(), 1);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42392);Partial result = test.with(DateTimeFieldType.year(), 10);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42393);assertEquals(2, result.size());
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42394);assertEquals(0, result.indexOf(DateTimeFieldType.year()));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42395);assertEquals(1, result.indexOf(DateTimeFieldType.hourOfDay()));
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testWith_baseAndArgHaveNoRange() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42396);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ol1qh0wpo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith_baseAndArgHaveNoRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42396,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ol1qh0wpo(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42396);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42397);Partial test = new Partial(DateTimeFieldType.year(), 1);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42398);Partial result = test.with(DateTimeFieldType.era(), 1);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42399);assertEquals(2, result.size());
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42400);assertEquals(0, result.indexOf(DateTimeFieldType.era()));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42401);assertEquals(1, result.indexOf(DateTimeFieldType.year()));
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithout1() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42402);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14z8zyawpu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithout1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42402,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14z8zyawpu(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42402);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42403);Partial test = createHourMinPartial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42404);Partial result = test.without(DateTimeFieldType.year());
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42405);check(test, 10, 20);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42406);check(result, 10, 20);
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testWithout2() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42407);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1888yqrwpz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithout2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42407,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1888yqrwpz(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42407);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42408);Partial test = createHourMinPartial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42409);Partial result = test.without((DateTimeFieldType) null);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42410);check(test, 10, 20);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42411);check(result, 10, 20);
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testWithout3() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42412);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bh8xj8wq4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithout3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42412,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bh8xj8wq4(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42412);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42413);Partial test = createHourMinPartial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42414);Partial result = test.without(DateTimeFieldType.hourOfDay());
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42415);check(test, 10, 20);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42416);assertEquals(1, result.size());
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42417);assertEquals(false, result.isSupported(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42418);assertEquals(true, result.isSupported(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42419);assertEquals(DateTimeFieldType.minuteOfHour(), result.getFieldType(0));
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testWithout4() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eq8wbpwqc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithout4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42420,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eq8wbpwqc(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42420);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42421);Partial test = createHourMinPartial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42422);Partial result = test.without(DateTimeFieldType.minuteOfHour());
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42423);check(test, 10, 20);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42424);assertEquals(1, result.size());
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42425);assertEquals(true, result.isSupported(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42426);assertEquals(false, result.isSupported(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42427);assertEquals(DateTimeFieldType.hourOfDay(), result.getFieldType(0));
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testWithout5() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42428);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hz8v46wqk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithout5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42428,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hz8v46wqk(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42428);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42429);Partial test = new Partial(DateTimeFieldType.hourOfDay(), 12);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42430);Partial result = test.without(DateTimeFieldType.hourOfDay());
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42431);assertEquals(0, result.size());
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42432);assertEquals(false, result.isSupported(DateTimeFieldType.hourOfDay()));
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithField1() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42433);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lke16ywqp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithField1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42433,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lke16ywqp(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42433);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42434);Partial test = createHourMinPartial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42435);Partial result = test.withField(DateTimeFieldType.hourOfDay(), 15);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42436);check(test, 10, 20);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42437);check(result, 15, 20);
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testWithField2() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42438);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ibe2ehwqu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithField2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42438,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ibe2ehwqu(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42438);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42439);Partial test = createHourMinPartial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42440);try {
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42441);test.withField(null, 6);
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42442);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42443);check(test, 10, 20);
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testWithField3() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42444);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2e3m0wr0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithField3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42444,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2e3m0wr0(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42444);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42445);Partial test = createHourMinPartial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42446);try {
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42447);test.withField(DateTimeFieldType.dayOfMonth(), 6);
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42448);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42449);check(test, 10, 20);
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testWithField4() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42450);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bte4tjwr6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithField4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42450,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bte4tjwr6(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42450);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42451);Partial test = createHourMinPartial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42452);Partial result = test.withField(DateTimeFieldType.hourOfDay(), 10);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42453);assertSame(test, result);
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithFieldAdded1() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42454);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11rgt22wra();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAdded1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42454,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11rgt22wra(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42454);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42455);Partial test = createHourMinPartial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42456);Partial result = test.withFieldAdded(DurationFieldType.hours(), 6);
        
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42457);assertEquals(createHourMinPartial(), test);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42458);check(test, 10, 20);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42459);check(result, 16, 20);
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testWithFieldAdded2() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_150grujwrg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAdded2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42460,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_150grujwrg(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42460);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42461);Partial test = createHourMinPartial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42462);try {
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42463);test.withFieldAdded(null, 0);
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42464);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42465);check(test, 10, 20);
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testWithFieldAdded3() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_189gqn0wrm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAdded3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42466,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_189gqn0wrm(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42466);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42467);Partial test = createHourMinPartial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42468);try {
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42469);test.withFieldAdded(null, 6);
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42470);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42471);check(test, 10, 20);
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testWithFieldAdded4() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bigpfhwrs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAdded4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42472,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bigpfhwrs(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42472);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42473);Partial test = createHourMinPartial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42474);Partial result = test.withFieldAdded(DurationFieldType.hours(), 0);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42475);assertSame(test, result);
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testWithFieldAdded5() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42476);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ergo7ywrw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAdded5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42476,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ergo7ywrw(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42476);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42477);Partial test = createHourMinPartial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42478);try {
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42479);test.withFieldAdded(DurationFieldType.days(), 6);
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42480);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42481);check(test, 10, 20);
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testWithFieldAdded6() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i0gn0fws2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAdded6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42482,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i0gn0fws2(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42482);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42483);Partial test = createHourMinPartial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42484);try {
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42485);test.withFieldAdded(DurationFieldType.hours(), 16);
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42486);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42487);check(test, 10, 20);
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testWithFieldAdded7() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l9glswws8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAdded7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42488,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l9glswws8(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42488);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42489);Partial test = createHourMinPartial(23, 59, ISO_UTC);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42490);try {
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42491);test.withFieldAdded(DurationFieldType.minutes(), 1);
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42492);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42493);check(test, 23, 59);
        
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42494);test = createHourMinPartial(23, 59, ISO_UTC);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42495);try {
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42496);test.withFieldAdded(DurationFieldType.hours(), 1);
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42497);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42498);check(test, 23, 59);
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testWithFieldAdded8() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oigkldwsj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAdded8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42499,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oigkldwsj(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42499);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42500);Partial test = createHourMinPartial(0, 0, ISO_UTC);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42501);try {
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42502);test.withFieldAdded(DurationFieldType.minutes(), -1);
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42503);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42504);check(test, 0, 0);
        
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42505);test = createHourMinPartial(0, 0, ISO_UTC);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42506);try {
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42507);test.withFieldAdded(DurationFieldType.hours(), -1);
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42508);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42509);check(test, 0, 0);
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithFieldAddWrapped1() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42510);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f812hawsu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAddWrapped1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42510,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f812hawsu(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42510);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42511);Partial test = createHourMinPartial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42512);Partial result = test.withFieldAddWrapped(DurationFieldType.hours(), 6);
        
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42513);assertEquals(createHourMinPartial(), test);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42514);check(test, 10, 20);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42515);check(result, 16, 20);
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testWithFieldAddWrapped2() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bz13otwt0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAddWrapped2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42516,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bz13otwt0(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42516);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42517);Partial test = createHourMinPartial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42518);try {
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42519);test.withFieldAddWrapped(null, 0);
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42520);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42521);check(test, 10, 20);
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testWithFieldAddWrapped3() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18q14wcwt6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAddWrapped3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42522,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18q14wcwt6(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42522);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42523);Partial test = createHourMinPartial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42524);try {
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42525);test.withFieldAddWrapped(null, 6);
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42526);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42527);check(test, 10, 20);
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testWithFieldAddWrapped4() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15h163vwtc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAddWrapped4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42528,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15h163vwtc(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42528);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42529);Partial test = createHourMinPartial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42530);Partial result = test.withFieldAddWrapped(DurationFieldType.hours(), 0);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42531);assertSame(test, result);
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testWithFieldAddWrapped5() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12817bewtg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAddWrapped5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42532,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12817bewtg(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42532);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42533);Partial test = createHourMinPartial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42534);try {
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42535);test.withFieldAddWrapped(DurationFieldType.days(), 6);
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42536);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42537);check(test, 10, 20);
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testWithFieldAddWrapped6() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42538);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_110yrh3wtm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAddWrapped6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42538,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_110yrh3wtm(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42538);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42539);Partial test = createHourMinPartial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42540);Partial result = test.withFieldAddWrapped(DurationFieldType.hours(), 16);
        
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42541);assertEquals(createHourMinPartial(), test);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42542);check(test, 10, 20);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42543);check(result, 2, 20);
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testWithFieldAddWrapped7() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_149yq9kwts();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAddWrapped7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42544,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_149yq9kwts(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42544);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42545);Partial test = createHourMinPartial(23, 59, ISO_UTC);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42546);Partial result = test.withFieldAddWrapped(DurationFieldType.minutes(), 1);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42547);check(test, 23, 59);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42548);check(result, 0, 0);
        
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42549);test = createHourMinPartial(23, 59, ISO_UTC);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42550);result = test.withFieldAddWrapped(DurationFieldType.hours(), 1);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42551);check(test, 23, 59);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42552);check(result, 0, 59);
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testWithFieldAddWrapped8() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42553);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17iyp21wu1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAddWrapped8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42553,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17iyp21wu1(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42553);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42554);Partial test = createHourMinPartial(0, 0, ISO_UTC);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42555);Partial result = test.withFieldAddWrapped(DurationFieldType.minutes(), -1);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42556);check(test, 0, 0);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42557);check(result, 23, 59);
        
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42558);test = createHourMinPartial(0, 0, ISO_UTC);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42559);result = test.withFieldAddWrapped(DurationFieldType.hours(), -1);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42560);check(test, 0, 0);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42561);check(result, 23, 0);
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPlus_RP() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42562);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tz83igwua();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testPlus_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42562,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tz83igwua(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42562);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42563);Partial test = createHourMinPartial(BUDDHIST_LONDON);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42564);Partial result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42565);check(test, 10, 20);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42566);check(result, 15, 26);
        
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42567);result = test.plus((ReadablePeriod) null);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42568);assertSame(test, result);
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testMinus_RP() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_112cpdmwuh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testMinus_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42569,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_112cpdmwuh(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42569);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42570);Partial test = createHourMinPartial(BUDDHIST_LONDON);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42571);Partial result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42572);check(test, 10, 20);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42573);check(result, 9, 19);
        
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42574);result = test.minus((ReadablePeriod) null);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42575);assertSame(test, result);
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToDateTime_RI() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42576);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1584tmdwuo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testToDateTime_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42576,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1584tmdwuo(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42576);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42577);Partial base = createHourMinPartial(COPTIC_PARIS);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42578);DateTime dt = new DateTime(0L); // LONDON zone
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42579);assertEquals("1970-01-01T01:00:00.000+01:00", dt.toString());
        
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42580);DateTime test = base.toDateTime(dt);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42581);check(base, 10, 20);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42582);assertEquals("1970-01-01T01:00:00.000+01:00", dt.toString());
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42583);assertEquals("1970-01-01T10:20:00.000+01:00", test.toString());
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testToDateTime_nullRI() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42584);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xlns4wuw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testToDateTime_nullRI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42584,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xlns4wuw(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42584);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42585);Partial base = createHourMinPartial(1, 2, ISO_UTC);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42586);DateTimeUtils.setCurrentMillisFixed(TEST_TIME2);
        
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42587);DateTime test = base.toDateTime((ReadableInstant) null);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42588);check(base, 1, 2);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42589);assertEquals("1970-01-02T01:02:07.008+01:00", test.toString());
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testProperty() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42590);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i7neoiwv2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testProperty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42590,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i7neoiwv2(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42590);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42591);Partial test = createHourMinPartial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42592);assertNotNull(test.property(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42593);assertNotNull(test.property(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42594);try {
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42595);test.property(DateTimeFieldType.secondOfDay());
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42596);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42597);try {
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42598);test.property(null);
            __CLR4_4_1whnwhnlc8azw2j.R.inc(42599);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSerialization() throws Exception {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42600);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on9wvc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42600,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on9wvc() throws Exception{try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42600);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42601);Partial test = createHourMinPartial(COPTIC_PARIS);
        
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42602);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42603);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42604);oos.writeObject(test);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42605);byte[] bytes = baos.toByteArray();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42606);oos.close();
        
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42607);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42608);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42609);Partial result = (Partial) ois.readObject();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42610);ois.close();
        
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42611);assertEquals(test, result);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42612);assertTrue(Arrays.equals(test.getValues(), result.getValues()));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42613);assertTrue(Arrays.equals(test.getFields(), result.getFields()));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42614);assertEquals(test.getChronology(), result.getChronology());
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetFormatter1() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19u4x76wvr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testGetFormatter1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42615,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19u4x76wvr(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42615);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42616);Partial test = new Partial(DateTimeFieldType.year(), 2005);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42617);assertEquals("2005", test.getFormatter().print(test));
        
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42618);test = test.with(DateTimeFieldType.monthOfYear(), 6);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42619);assertEquals("2005-06", test.getFormatter().print(test));
        
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42620);test = test.with(DateTimeFieldType.dayOfMonth(), 25);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42621);assertEquals("2005-06-25", test.getFormatter().print(test));
        
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42622);test = test.without(DateTimeFieldType.monthOfYear());
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42623);assertEquals("2005--25", test.getFormatter().print(test));
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testGetFormatter2() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42624);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d34vznww0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testGetFormatter2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42624,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d34vznww0(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42624);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42625);Partial test = new Partial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42626);assertEquals(null, test.getFormatter());
        
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42627);test = test.with(DateTimeFieldType.era(), 1);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42628);assertEquals(null, test.getFormatter());
        
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42629);test = test.with(DateTimeFieldType.halfdayOfDay(), 0);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42630);assertEquals(null, test.getFormatter());
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testGetFormatter3() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42631);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gc4us4ww7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testGetFormatter3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42631,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gc4us4ww7(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42631);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42632);Partial test = new Partial(DateTimeFieldType.dayOfWeek(), 5);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42633);assertEquals("-W-5", test.getFormatter().print(test));
        
        // contrast with testToString5
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42634);test = test.with(DateTimeFieldType.dayOfMonth(), 13);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42635);assertEquals("---13", test.getFormatter().print(test));
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString1() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42636);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mcagu2wwc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testToString1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42636,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mcagu2wwc(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42636);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42637);Partial test = createHourMinPartial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42638);assertEquals("10:20", test.toString());
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testToString2() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1plafmjwwf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testToString2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42639,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1plafmjwwf(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42639);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42640);Partial test = new Partial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42641);assertEquals("[]", test.toString());
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testToString3() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1suaef0wwi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testToString3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42642,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1suaef0wwi(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42642);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42643);Partial test = new Partial(DateTimeFieldType.year(), 2005);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42644);assertEquals("2005", test.toString());
        
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42645);test = test.with(DateTimeFieldType.monthOfYear(), 6);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42646);assertEquals("2005-06", test.toString());
        
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42647);test = test.with(DateTimeFieldType.dayOfMonth(), 25);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42648);assertEquals("2005-06-25", test.toString());
        
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42649);test = test.without(DateTimeFieldType.monthOfYear());
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42650);assertEquals("2005--25", test.toString());
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testToString4() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w3ad7hwwr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testToString4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42651,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w3ad7hwwr(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42651);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42652);Partial test = new Partial(DateTimeFieldType.dayOfWeek(), 5);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42653);assertEquals("-W-5", test.toString());
        
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42654);test = test.with(DateTimeFieldType.dayOfMonth(), 13);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42655);assertEquals("[dayOfMonth=13, dayOfWeek=5]", test.toString());
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    public void testToString5() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zcabzywww();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testToString5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42656,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zcabzywww(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42656);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42657);Partial test = new Partial(DateTimeFieldType.era(), 1);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42658);assertEquals("[era=1]", test.toString());
        
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42659);test = test.with(DateTimeFieldType.halfdayOfDay(), 0);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42660);assertEquals("[era=1, halfdayOfDay=0]", test.toString());
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString_String() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42661);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1llkh2xwx1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testToString_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42661,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1llkh2xwx1(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42661);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42662);Partial test = createHourMinPartial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42663);assertEquals("\ufffd\ufffd\ufffd\ufffd 10", test.toString("yyyy HH"));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42664);assertEquals("10:20", test.toString((String) null));
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString_String_Locale() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1afd64uwx5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testToString_String_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42665,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1afd64uwx5(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42665);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42666);Partial test = createHourMinPartial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42667);assertEquals("10 20", test.toString("H m", Locale.ENGLISH));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42668);assertEquals("10:20", test.toString(null, Locale.ENGLISH));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42669);assertEquals("10 20", test.toString("H m", null));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42670);assertEquals("10:20", test.toString(null, null));
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString_DTFormatter() {__CLR4_4_1whnwhnlc8azw2j.R.globalSliceStart(getClass().getName(),42671);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mxbkpswxb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1whnwhnlc8azw2j.R.rethrow($CLV_t2$);}finally{__CLR4_4_1whnwhnlc8azw2j.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testToString_DTFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42671,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mxbkpswxb(){try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42671);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42672);Partial test = createHourMinPartial();
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42673);assertEquals("\ufffd\ufffd\ufffd\ufffd 10", test.toString(DateTimeFormat.forPattern("yyyy HH")));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42674);assertEquals("10:20", test.toString((DateTimeFormatter) null));
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private Partial createHourMinPartial() {try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42675);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42676);return createHourMinPartial(ISO_UTC);
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    private Partial createHourMinPartial(Chronology chrono) {try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42677);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42678);return createHourMinPartial(10, 20, chrono);
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    private Partial createHourMinPartial2(Chronology chrono) {try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42679);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42680);return createHourMinPartial(15, 20, chrono);
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    private Partial createHourMinPartial(int hour, int min, Chronology chrono) {try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42681);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42682);return new Partial(
            new DateTimeFieldType[] {DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()},
            new int[] {hour, min},
            chrono);
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    private Partial createTODPartial(Chronology chrono) {try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42683);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42684);return new Partial(
            new DateTimeFieldType[] {
                    DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour(),
                    DateTimeFieldType.secondOfMinute(), DateTimeFieldType.millisOfSecond()},
            new int[] {10, 20, 30, 40},
            chrono);
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}

    private void check(Partial test, int hour, int min) {try{__CLR4_4_1whnwhnlc8azw2j.R.inc(42685);
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42686);assertEquals(test.toString(), hour, test.get(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1whnwhnlc8azw2j.R.inc(42687);assertEquals(test.toString(), min, test.get(DateTimeFieldType.minuteOfHour()));
    }finally{__CLR4_4_1whnwhnlc8azw2j.R.flushNeeded();}}
}
