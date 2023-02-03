/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2010 Stephen Colebourne
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
 * This class is a Junit unit test for MonthDay. Based on {@link TestYearMonth_Basics} 
 */
public class TestMonthDay_Basics extends TestCase {static class __CLR4_4_1s4hs4hlc8azvmk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,36906,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
//    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
//    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
//    private static final Chronology ISO_LONDON = ISOChronology.getInstance(LONDON);
//    private static final Chronology ISO_TOKYO = ISOChronology.getInstance(TOKYO);
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
//    private static final Chronology BUDDHIST_PARIS = BuddhistChronology.getInstance(PARIS);
//    private static final Chronology BUDDHIST_LONDON = BuddhistChronology.getInstance(LONDON);
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    
    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36449);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36450);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36451);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36452);return new TestSuite(TestMonthDay_Basics.class);
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    public TestMonthDay_Basics(String name) {
        super(name);__CLR4_4_1s4hs4hlc8azvmk.R.inc(36454);try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36453);
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36455);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36456);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36457);zone = DateTimeZone.getDefault();
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36458);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36459);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36460);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36461);DateTimeZone.setDefault(zone);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36462);zone = null;
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGet() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tpje3vs4v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testGet",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36463,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tpje3vs4v(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36463);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36464);MonthDay test = new MonthDay();
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36465);assertEquals(6, test.get(DateTimeFieldType.monthOfYear()));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36466);assertEquals(9, test.get(DateTimeFieldType.dayOfMonth()));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36467);try {
            __CLR4_4_1s4hs4hlc8azvmk.R.inc(36468);test.get(null);
            __CLR4_4_1s4hs4hlc8azvmk.R.inc(36469);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36470);try {
            __CLR4_4_1s4hs4hlc8azvmk.R.inc(36471);test.get(DateTimeFieldType.year());
            __CLR4_4_1s4hs4hlc8azvmk.R.inc(36472);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    public void testSize() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xx122s55();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36473,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xx122s55(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36473);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36474);MonthDay test = new MonthDay();
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36475);assertEquals(2, test.size());
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    public void testGetFieldType() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36476);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18z86mvs58();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testGetFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36476,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18z86mvs58(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36476);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36477);MonthDay test = new MonthDay(COPTIC_PARIS);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36478);assertSame(DateTimeFieldType.monthOfYear(), test.getFieldType(0));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36479);assertSame(DateTimeFieldType.dayOfMonth(), test.getFieldType(1));

        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36480);try {
            __CLR4_4_1s4hs4hlc8azvmk.R.inc(36481);test.getFieldType(-1);
        } catch (IndexOutOfBoundsException ex) {}
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36482);try {
            __CLR4_4_1s4hs4hlc8azvmk.R.inc(36483);test.getFieldType(2);
        } catch (IndexOutOfBoundsException ex) {}
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    public void testGetFieldTypes() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z5ndvus5g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testGetFieldTypes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36484,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z5ndvus5g(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36484);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36485);MonthDay test = new MonthDay(COPTIC_PARIS);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36486);DateTimeFieldType[] fields = test.getFieldTypes();
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36487);assertEquals(2, fields.length);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36488);assertSame(DateTimeFieldType.monthOfYear(), fields[0]);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36489);assertSame(DateTimeFieldType.dayOfMonth(), fields[1]);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36490);assertNotSame(test.getFieldTypes(), test.getFieldTypes());
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    public void testGetField() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36491);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lx8n7ns5n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testGetField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36491,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lx8n7ns5n(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36491);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36492);MonthDay test = new MonthDay(COPTIC_PARIS);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36493);assertSame(COPTIC_UTC.monthOfYear(), test.getField(0));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36494);assertSame(COPTIC_UTC.dayOfMonth(), test.getField(1));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36495);try {
            __CLR4_4_1s4hs4hlc8azvmk.R.inc(36496);test.getField(-1);
        } catch (IndexOutOfBoundsException ex) {}
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36497);try {
            __CLR4_4_1s4hs4hlc8azvmk.R.inc(36498);test.getField(2);
        } catch (IndexOutOfBoundsException ex) {}
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    public void testGetFields() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lmeass5v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testGetFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36499,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lmeass5v(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36499);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36500);MonthDay test = new MonthDay(COPTIC_PARIS);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36501);DateTimeField[] fields = test.getFields();
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36502);assertEquals(2, fields.length);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36503);assertSame(COPTIC_UTC.monthOfYear(), fields[0]);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36504);assertSame(COPTIC_UTC.dayOfMonth(), fields[1]);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36505);assertNotSame(test.getFields(), test.getFields());
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    public void testGetValue() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36506);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qcksmks62();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testGetValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36506,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qcksmks62(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36506);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36507);MonthDay test = new MonthDay();
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36508);assertEquals(6, test.getValue(0));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36509);assertEquals(9, test.getValue(1));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36510);try {
            __CLR4_4_1s4hs4hlc8azvmk.R.inc(36511);test.getValue(-1);
        } catch (IndexOutOfBoundsException ex) {}
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36512);try {
            __CLR4_4_1s4hs4hlc8azvmk.R.inc(36513);test.getValue(2);
        } catch (IndexOutOfBoundsException ex) {}
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    public void testGetValues() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36514);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15gduels6a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testGetValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36514,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15gduels6a(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36514);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36515);MonthDay test = new MonthDay();
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36516);int[] values = test.getValues();
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36517);assertEquals(2, values.length);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36518);assertEquals(6, values[0]);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36519);assertEquals(9, values[1]);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36520);assertNotSame(test.getValues(), test.getValues());
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    public void testIsSupported() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36521);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hma24ns6h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testIsSupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36521,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hma24ns6h(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36521);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36522);MonthDay test = new MonthDay(COPTIC_PARIS);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36523);assertEquals(false, test.isSupported(DateTimeFieldType.year()));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36524);assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear()));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36525);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfMonth()));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36526);assertEquals(false, test.isSupported(DateTimeFieldType.hourOfDay()));
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    public void testEqualsHashCode() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36527);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5in77s6n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testEqualsHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36527,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5in77s6n(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36527);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36528);MonthDay test1 = new MonthDay(10, 6, COPTIC_PARIS);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36529);MonthDay test2 = new MonthDay(10, 6, COPTIC_PARIS);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36530);assertEquals(true, test1.equals(test2));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36531);assertEquals(true, test2.equals(test1));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36532);assertEquals(true, test1.equals(test1));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36533);assertEquals(true, test2.equals(test2));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36534);assertEquals(true, test1.hashCode() == test2.hashCode());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36535);assertEquals(true, test1.hashCode() == test1.hashCode());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36536);assertEquals(true, test2.hashCode() == test2.hashCode());
        
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36537);MonthDay test3 = new MonthDay(10, 6);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36538);assertEquals(false, test1.equals(test3));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36539);assertEquals(false, test2.equals(test3));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36540);assertEquals(false, test3.equals(test1));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36541);assertEquals(false, test3.equals(test2));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36542);assertEquals(false, test1.hashCode() == test3.hashCode());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36543);assertEquals(false, test2.hashCode() == test3.hashCode());
        
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36544);assertEquals(false, test1.equals("Hello"));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36545);assertEquals(true, test1.equals(new MockMD()));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36546);assertEquals(false, test1.equals(MockPartial.EMPTY_INSTANCE));
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}
    
    class MockMD extends MockPartial {
        
        @Override
        public Chronology getChronology() {try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36547);
            __CLR4_4_1s4hs4hlc8azvmk.R.inc(36548);return COPTIC_UTC;
        }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}
        
        @Override
        public DateTimeField[] getFields() {try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36549);
            __CLR4_4_1s4hs4hlc8azvmk.R.inc(36550);return new DateTimeField[] {
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth()
            };
        }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}
        
        @Override
        public int[] getValues() {try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36551);
            __CLR4_4_1s4hs4hlc8azvmk.R.inc(36552);return new int[] {10, 6};
        }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    public void testCompareTo() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36553);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pz6vfvs7d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testCompareTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36553,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pz6vfvs7d(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36553);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36554);MonthDay test1 = new MonthDay(6, 6);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36555);MonthDay test1a = new MonthDay(6, 6);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36556);assertEquals(0, test1.compareTo(test1a));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36557);assertEquals(0, test1a.compareTo(test1));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36558);assertEquals(0, test1.compareTo(test1));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36559);assertEquals(0, test1a.compareTo(test1a));
        
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36560);MonthDay test2 = new MonthDay(6, 7);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36561);assertEquals(-1, test1.compareTo(test2));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36562);assertEquals(+1, test2.compareTo(test1));
        
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36563);MonthDay test3 = new MonthDay(6, 7, GregorianChronology.getInstanceUTC());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36564);assertEquals(-1, test1.compareTo(test3));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36565);assertEquals(+1, test3.compareTo(test1));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36566);assertEquals(0, test3.compareTo(test2));
        
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36567);DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.monthOfYear(),
            DateTimeFieldType.dayOfMonth()
        };
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36568);int[] values = new int[] {6, 6};
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36569);Partial p = new Partial(types, values);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36570);assertEquals(0, test1.compareTo(p));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36571);try {
            __CLR4_4_1s4hs4hlc8azvmk.R.inc(36572);test1.compareTo(null);
            __CLR4_4_1s4hs4hlc8azvmk.R.inc(36573);fail();
        } catch (NullPointerException ex) {}
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36574);try {
            __CLR4_4_1s4hs4hlc8azvmk.R.inc(36575);test1.compareTo(new LocalTime());
            __CLR4_4_1s4hs4hlc8azvmk.R.inc(36576);fail();
        } catch (ClassCastException ex) {}
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36577);Partial partial = new Partial()
            .with(DateTimeFieldType.centuryOfEra(), 1)
            .with(DateTimeFieldType.halfdayOfDay(), 0)
            .with(DateTimeFieldType.dayOfMonth(), 9);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36578);try {
            __CLR4_4_1s4hs4hlc8azvmk.R.inc(36579);new MonthDay(10, 6).compareTo(partial);
            __CLR4_4_1s4hs4hlc8azvmk.R.inc(36580);fail();
        } catch (ClassCastException ex) {}
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testIsEqual_MD() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36581);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cq5dvfs85();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testIsEqual_MD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36581,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cq5dvfs85(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36581);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36582);MonthDay test1 = new MonthDay(6, 6);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36583);MonthDay test1a = new MonthDay(6, 6);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36584);assertEquals(true, test1.isEqual(test1a));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36585);assertEquals(true, test1a.isEqual(test1));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36586);assertEquals(true, test1.isEqual(test1));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36587);assertEquals(true, test1a.isEqual(test1a));
        
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36588);MonthDay test2 = new MonthDay(6, 7);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36589);assertEquals(false, test1.isEqual(test2));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36590);assertEquals(false, test2.isEqual(test1));
        
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36591);MonthDay test3 = new MonthDay(6, 7, GregorianChronology.getInstanceUTC());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36592);assertEquals(false, test1.isEqual(test3));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36593);assertEquals(false, test3.isEqual(test1));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36594);assertEquals(true, test3.isEqual(test2));
        
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36595);try {
            __CLR4_4_1s4hs4hlc8azvmk.R.inc(36596);new MonthDay(6, 7).isEqual(null);
            __CLR4_4_1s4hs4hlc8azvmk.R.inc(36597);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testIsBefore_MD() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36598);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1serq9qs8m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testIsBefore_MD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36598,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1serq9qs8m(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36598);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36599);MonthDay test1 = new MonthDay(6, 6);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36600);MonthDay test1a = new MonthDay(6, 6);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36601);assertEquals(false, test1.isBefore(test1a));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36602);assertEquals(false, test1a.isBefore(test1));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36603);assertEquals(false, test1.isBefore(test1));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36604);assertEquals(false, test1a.isBefore(test1a));
        
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36605);MonthDay test2 = new MonthDay(6, 7);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36606);assertEquals(true, test1.isBefore(test2));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36607);assertEquals(false, test2.isBefore(test1));
        
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36608);MonthDay test3 = new MonthDay(6, 7, GregorianChronology.getInstanceUTC());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36609);assertEquals(true, test1.isBefore(test3));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36610);assertEquals(false, test3.isBefore(test1));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36611);assertEquals(false, test3.isBefore(test2));
        
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36612);try {
            __CLR4_4_1s4hs4hlc8azvmk.R.inc(36613);new MonthDay(6, 7).isBefore(null);
            __CLR4_4_1s4hs4hlc8azvmk.R.inc(36614);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testIsAfter_MD() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dqs4ds93();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testIsAfter_MD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36615,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dqs4ds93(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36615);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36616);MonthDay test1 = new MonthDay(6, 6);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36617);MonthDay test1a = new MonthDay(6, 6);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36618);assertEquals(false, test1.isAfter(test1a));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36619);assertEquals(false, test1a.isAfter(test1));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36620);assertEquals(false, test1.isAfter(test1));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36621);assertEquals(false, test1a.isAfter(test1a));
        
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36622);MonthDay test2 = new MonthDay(6, 7);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36623);assertEquals(false, test1.isAfter(test2));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36624);assertEquals(true, test2.isAfter(test1));
        
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36625);MonthDay test3 = new MonthDay(6, 7, GregorianChronology.getInstanceUTC());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36626);assertEquals(false, test1.isAfter(test3));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36627);assertEquals(true, test3.isAfter(test1));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36628);assertEquals(false, test3.isAfter(test2));
        
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36629);try {
            __CLR4_4_1s4hs4hlc8azvmk.R.inc(36630);new MonthDay(6, 7).isAfter(null);
            __CLR4_4_1s4hs4hlc8azvmk.R.inc(36631);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testWithChronologyRetainFields_Chrono() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_143gerps9k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithChronologyRetainFields_Chrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36632,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_143gerps9k(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36632);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36633);MonthDay base = new MonthDay(6, 6, COPTIC_PARIS);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36634);MonthDay test = base.withChronologyRetainFields(BUDDHIST_TOKYO);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36635);check(base, 6, 6);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36636);assertEquals(COPTIC_UTC, base.getChronology());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36637);check(test, 6, 6);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36638);assertEquals(BUDDHIST_UTC, test.getChronology());
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    public void testWithChronologyRetainFields_sameChrono() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15b1wdbs9r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithChronologyRetainFields_sameChrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36639,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15b1wdbs9r(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36639);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36640);MonthDay base = new MonthDay(6, 6, COPTIC_PARIS);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36641);MonthDay test = base.withChronologyRetainFields(COPTIC_TOKYO);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36642);assertSame(base, test);
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    public void testWithChronologyRetainFields_nullChrono() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36643);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j0ft9as9v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithChronologyRetainFields_nullChrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36643,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j0ft9as9v(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36643);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36644);MonthDay base = new MonthDay(6, 6, COPTIC_PARIS);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36645);MonthDay test = base.withChronologyRetainFields(null);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36646);check(base, 6, 6);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36647);assertEquals(COPTIC_UTC, base.getChronology());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36648);check(test, 6, 6);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36649);assertEquals(ISO_UTC, test.getChronology());
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithField() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36650);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vrat1zsa2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36650,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vrat1zsa2(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36650);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36651);MonthDay test = new MonthDay(9, 6);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36652);MonthDay result = test.withField(DateTimeFieldType.monthOfYear(), 10);
        
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36653);assertEquals(new MonthDay(9, 6), test);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36654);assertEquals(new MonthDay(10, 6), result);
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    public void testWithField_nullField() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xjqkwzsa7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithField_nullField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36655,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xjqkwzsa7(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36655);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36656);MonthDay test = new MonthDay(9, 6);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36657);try {
            __CLR4_4_1s4hs4hlc8azvmk.R.inc(36658);test.withField(null, 6);
            __CLR4_4_1s4hs4hlc8azvmk.R.inc(36659);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    public void testWithField_unknownField() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y6l5bosac();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithField_unknownField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36660,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y6l5bosac(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36660);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36661);MonthDay test = new MonthDay(9, 6);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36662);try {
            __CLR4_4_1s4hs4hlc8azvmk.R.inc(36663);test.withField(DateTimeFieldType.hourOfDay(), 6);
            __CLR4_4_1s4hs4hlc8azvmk.R.inc(36664);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    public void testWithField_same() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18fa39msah();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithField_same",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36665,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18fa39msah(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36665);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36666);MonthDay test = new MonthDay(9, 6);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36667);MonthDay result = test.withField(DateTimeFieldType.monthOfYear(), 9);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36668);assertEquals(new MonthDay(9, 6), test);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36669);assertSame(test, result);
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithFieldAdded() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36670);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15nlb9hsam();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithFieldAdded",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36670,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15nlb9hsam(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36670);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36671);MonthDay test = new MonthDay(9, 6);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36672);MonthDay result = test.withFieldAdded(DurationFieldType.months(), 1);
        
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36673);assertEquals(new MonthDay(9, 6), test);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36674);assertEquals(new MonthDay(10, 6), result);
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    public void testWithFieldAdded_nullField_zero() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ynb18csar();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithFieldAdded_nullField_zero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36675,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ynb18csar(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36675);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36676);MonthDay test = new MonthDay(9, 6);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36677);try {
            __CLR4_4_1s4hs4hlc8azvmk.R.inc(36678);test.withFieldAdded(null, 0);
            __CLR4_4_1s4hs4hlc8azvmk.R.inc(36679);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    public void testWithFieldAdded_nullField_nonZero() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36680);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cciwz5saw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithFieldAdded_nullField_nonZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36680,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cciwz5saw(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36680);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36681);MonthDay test = new MonthDay(9, 6);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36682);try {
            __CLR4_4_1s4hs4hlc8azvmk.R.inc(36683);test.withFieldAdded(null, 6);
            __CLR4_4_1s4hs4hlc8azvmk.R.inc(36684);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    public void testWithFieldAdded_zero() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36685);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h793dcsb1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithFieldAdded_zero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36685,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h793dcsb1(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36685);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36686);MonthDay test = new MonthDay(9, 6);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36687);MonthDay result = test.withFieldAdded(DurationFieldType.months(), 0);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36688);assertSame(test, result);
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    public void testWithFieldAdded_unknownField() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vo8btksb5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithFieldAdded_unknownField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36689,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vo8btksb5(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36689);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36690);MonthDay test = new MonthDay(9, 6);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36691);try {
            __CLR4_4_1s4hs4hlc8azvmk.R.inc(36692);test.withFieldAdded(DurationFieldType.hours(), 6);
            __CLR4_4_1s4hs4hlc8azvmk.R.inc(36693);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPlus_RP() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tz83igsba();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlus_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36694,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tz83igsba(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36694);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36695);MonthDay test = new MonthDay(6, 5, BuddhistChronology.getInstance());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36696);MonthDay result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36697);MonthDay expected = new MonthDay(8, 9, BuddhistChronology.getInstance());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36698);assertEquals(expected, result);
        
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36699);result = test.plus((ReadablePeriod) null);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36700);assertSame(test, result);
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    public void testPlusMonths_int() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36701);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_170gxaisbh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlusMonths_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36701,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_170gxaisbh(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36701);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36702);MonthDay test = new MonthDay(6, 5, BuddhistChronology.getInstance());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36703);MonthDay result = test.plusMonths(1);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36704);MonthDay expected = new MonthDay(7, 5, BuddhistChronology.getInstance());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36705);assertEquals(expected, result);
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    public void testPlusMonths_int_fromLeap() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15vlms7sbm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlusMonths_int_fromLeap",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36706,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15vlms7sbm(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36706);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36707);MonthDay test = new MonthDay(2, 29, ISOChronology.getInstanceUTC());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36708);MonthDay result = test.plusMonths(1);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36709);MonthDay expected = new MonthDay(3, 29, ISOChronology.getInstance());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36710);assertEquals(expected, result);
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    public void testPlusMonths_int_negativeFromLeap() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36711);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iq4nj2sbr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlusMonths_int_negativeFromLeap",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36711,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iq4nj2sbr(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36711);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36712);MonthDay test = new MonthDay(2, 29, ISOChronology.getInstanceUTC());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36713);MonthDay result = test.plusMonths(-1);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36714);MonthDay expected = new MonthDay(1, 29, ISOChronology.getInstance());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36715);assertEquals(expected, result);
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    public void testPlusMonths_int_endOfMonthAdjust() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36716);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e16auksbw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlusMonths_int_endOfMonthAdjust",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36716,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e16auksbw(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36716);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36717);MonthDay test = new MonthDay(3, 31, ISOChronology.getInstanceUTC());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36718);MonthDay result = test.plusMonths(1);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36719);MonthDay expected = new MonthDay(4, 30, ISOChronology.getInstance());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36720);assertEquals(expected, result);
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    public void testPlusMonths_int_negativeEndOfMonthAdjust() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36721);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s0u0mvsc1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlusMonths_int_negativeEndOfMonthAdjust",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36721,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s0u0mvsc1(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36721);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36722);MonthDay test = new MonthDay(3, 31, ISOChronology.getInstanceUTC());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36723);MonthDay result = test.plusMonths(-1);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36724);MonthDay expected = new MonthDay(2, 29, ISOChronology.getInstance());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36725);assertEquals(expected, result);
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    public void testPlusMonths_int_same() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36726);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hyn4t9sc6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlusMonths_int_same",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36726,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hyn4t9sc6(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36726);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36727);MonthDay test = new MonthDay(6, 5, ISO_UTC);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36728);MonthDay result = test.plusMonths(0);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36729);assertSame(test, result);
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    public void testPlusMonths_int_wrap() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zd511dsca();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlusMonths_int_wrap",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36730,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zd511dsca(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36730);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36731);MonthDay test = new MonthDay(6, 5, ISO_UTC);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36732);MonthDay result = test.plusMonths(10);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36733);MonthDay expected = new MonthDay(4, 5, ISO_UTC);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36734);assertEquals(expected, result);
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    public void testPlusMonths_int_adjust() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z6h63qscf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlusMonths_int_adjust",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36735,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z6h63qscf(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36735);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36736);MonthDay test = new MonthDay(7, 31, ISO_UTC);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36737);MonthDay result = test.plusMonths(2);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36738);MonthDay expected = new MonthDay(9, 30, ISO_UTC);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36739);assertEquals(expected, result);
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    //-------------------------------------------------------------------------
    public void testPlusDays_int() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36740);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wpmvkqsck();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlusDays_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36740,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wpmvkqsck(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36740);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36741);MonthDay test = new MonthDay(5, 10, BuddhistChronology.getInstance());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36742);MonthDay result = test.plusDays(1);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36743);MonthDay expected = new MonthDay(5, 11, BuddhistChronology.getInstance());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36744);assertEquals(expected, result);
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    public void testPlusDays_int_fromLeap() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_181e70lscp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlusDays_int_fromLeap",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36745,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_181e70lscp(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36745);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36746);MonthDay test = new MonthDay(2, 29, ISOChronology.getInstanceUTC());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36747);MonthDay result = test.plusDays(1);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36748);MonthDay expected = new MonthDay(3, 1, ISOChronology.getInstance());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36749);assertEquals(expected, result);
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    public void testPlusDays_int_negativeFromLeap() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36750);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f55oe2scu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlusDays_int_negativeFromLeap",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36750,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f55oe2scu(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36750);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36751);MonthDay test = new MonthDay(2, 29, ISOChronology.getInstanceUTC());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36752);MonthDay result = test.plusDays(-1);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36753);MonthDay expected = new MonthDay(2, 28, ISOChronology.getInstance());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36754);assertEquals(expected, result);
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    public void testPlusDays_same() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pebzopscz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testPlusDays_same",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36755,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pebzopscz(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36755);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36756);MonthDay test = new MonthDay(5, 10, BuddhistChronology.getInstance());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36757);MonthDay result = test.plusDays(0);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36758);assertSame(test, result);
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testMinus_RP() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36759);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_112cpdmsd3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinus_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36759,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_112cpdmsd3(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36759);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36760);MonthDay test = new MonthDay(6, 5, BuddhistChronology.getInstance());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36761);MonthDay result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36762);MonthDay expected = new MonthDay(5, 4, BuddhistChronology.getInstance());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36763);assertEquals(expected, result);
        
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36764);result = test.minus((ReadablePeriod) null);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36765);assertSame(test, result);
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    public void testMinusMonths_int() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36766);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r6k4gosda();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinusMonths_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36766,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r6k4gosda(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36766);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36767);MonthDay test = new MonthDay(6, 5, BuddhistChronology.getInstance());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36768);MonthDay result = test.minusMonths(1);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36769);MonthDay expected = new MonthDay(5, 5, BuddhistChronology.getInstance());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36770);assertEquals(expected, result);
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    public void testMinusMonths_int_fromLeap() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36771);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nmpydlsdf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinusMonths_int_fromLeap",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36771,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nmpydlsdf(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36771);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36772);MonthDay test = new MonthDay(2, 29, ISOChronology.getInstanceUTC());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36773);MonthDay result = test.minusMonths(1);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36774);MonthDay expected = new MonthDay(1, 29, ISOChronology.getInstance());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36775);assertEquals(expected, result);
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    public void testMinusMonths_int_negativeFromLeap() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36776);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sarvccsdk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinusMonths_int_negativeFromLeap",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36776,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sarvccsdk(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36776);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36777);MonthDay test = new MonthDay(2, 29, ISOChronology.getInstanceUTC());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36778);MonthDay result = test.minusMonths(-1);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36779);MonthDay expected = new MonthDay(3, 29, ISOChronology.getInstance());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36780);assertEquals(expected, result);
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    public void testMinusMonths_int_endOfMonthAdjust() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36781);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14gj31asdp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinusMonths_int_endOfMonthAdjust",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36781,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14gj31asdp(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36781);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36782);MonthDay test = new MonthDay(3, 31, ISOChronology.getInstanceUTC());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36783);MonthDay result = test.minusMonths(1);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36784);MonthDay expected = new MonthDay(2, 29, ISOChronology.getInstance());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36785);assertEquals(expected, result);
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    public void testMinusMonths_int_negativeEndOfMonthAdjust() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36786);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11yejyvsdu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinusMonths_int_negativeEndOfMonthAdjust",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36786,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11yejyvsdu(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36786);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36787);MonthDay test = new MonthDay(3, 31, ISOChronology.getInstanceUTC());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36788);MonthDay result = test.minusMonths(-1);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36789);MonthDay expected = new MonthDay(4, 30, ISOChronology.getInstance());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36790);assertEquals(expected, result);
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    public void testMinusMonths_int_same() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rw5x0rsdz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinusMonths_int_same",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36791,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rw5x0rsdz(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36791);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36792);MonthDay test = new MonthDay(6, 5, ISO_UTC);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36793);MonthDay result = test.minusMonths(0);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36794);assertSame(test, result);
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    public void testMinusMonths_int_wrap() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pqg8q9se3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinusMonths_int_wrap",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36795,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pqg8q9se3(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36795);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36796);MonthDay test = new MonthDay(6, 5, ISO_UTC);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36797);MonthDay result = test.minusMonths(10);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36798);MonthDay expected = new MonthDay(8, 5, ISO_UTC);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36799);assertEquals(expected, result);
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    public void testMinusMonths_int_adjust() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a5b8csse8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinusMonths_int_adjust",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36800,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a5b8csse8(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36800);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36801);MonthDay test = new MonthDay(7, 31, ISO_UTC);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36802);MonthDay result = test.minusMonths(3);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36803);MonthDay expected = new MonthDay(4, 30, ISO_UTC);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36804);assertEquals(expected, result);
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    //-------------------------------------------------------------------------
    public void testMinusDays_int() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hpufcksed();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinusDays_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36805,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hpufcksed(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36805);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36806);MonthDay test = new MonthDay(5, 11, BuddhistChronology.getInstance());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36807);MonthDay result = test.minusDays(1);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36808);MonthDay expected = new MonthDay(5, 10, BuddhistChronology.getInstance());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36809);assertEquals(expected, result);
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    public void testMinusDays_int_fromLeap() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xqpuj7sei();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinusDays_int_fromLeap",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36810,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xqpuj7sei(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36810);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36811);MonthDay test = new MonthDay(2, 29, ISOChronology.getInstanceUTC());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36812);MonthDay result = test.minusDays(1);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36813);MonthDay expected = new MonthDay(2, 28, ISOChronology.getInstance());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36814);assertEquals(expected, result);
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    public void testMinusDays_int_negativeFromLeap() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lfmf7csen();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinusDays_int_negativeFromLeap",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36815,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lfmf7csen(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36815);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36816);MonthDay test = new MonthDay(2, 29, ISOChronology.getInstanceUTC());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36817);MonthDay result = test.minusDays(-1);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36818);MonthDay expected = new MonthDay(3, 1, ISOChronology.getInstance());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36819);assertEquals(expected, result);
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    public void testMinusDays_same() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oqwshjses();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testMinusDays_same",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36820,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oqwshjses(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36820);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36821);MonthDay test = new MonthDay(5, 11, BuddhistChronology.getInstance());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36822);MonthDay result = test.minusDays(0);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36823);assertSame(test, result);
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testToLocalDate() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36824);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s1orirsew();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testToLocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36824,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s1orirsew(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36824);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36825);MonthDay base = new MonthDay(6, 6, COPTIC_UTC);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36826);LocalDate test = base.toLocalDate(2009);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36827);assertEquals(new LocalDate(2009, 6, 6, COPTIC_UTC), test);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36828);try {
            __CLR4_4_1s4hs4hlc8azvmk.R.inc(36829);base.toLocalDate(0);
            __CLR4_4_1s4hs4hlc8azvmk.R.inc(36830);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToDateTime_RI() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1584tmdsf3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testToDateTime_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36831,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1584tmdsf3(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36831);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36832);MonthDay base = new MonthDay(6, 6, COPTIC_PARIS);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36833);DateTime dt = new DateTime(2002, 1, 3, 4, 5, 6, 7);
        
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36834);DateTime test = base.toDateTime(dt);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36835);check(base, 6, 6);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36836);DateTime expected = dt;
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36837);expected = expected.monthOfYear().setCopy(6);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36838);expected = expected.dayOfMonth().setCopy(6);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36839);assertEquals(expected, test);
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    public void testToDateTime_nullRI() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xlns4sfc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testToDateTime_nullRI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36840,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xlns4sfc(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36840);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36841);MonthDay base = new MonthDay(6, 6);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36842);DateTime dt = new DateTime(2002, 1, 3, 4, 5, 6, 7);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36843);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36844);DateTime test = base.toDateTime((ReadableInstant) null);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36845);check(base, 6, 6);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36846);DateTime expected = dt;
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36847);expected = expected.monthOfYear().setCopy(6);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36848);expected = expected.dayOfMonth().setCopy(6);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36849);assertEquals(expected, test);
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithers() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36850);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sn9jzpsfm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testWithers",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36850,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sn9jzpsfm(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36850);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36851);MonthDay test = new MonthDay(10, 6);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36852);check(test.withMonthOfYear(5), 5, 6);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36853);check(test.withDayOfMonth(2), 10, 2);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36854);try {
            __CLR4_4_1s4hs4hlc8azvmk.R.inc(36855);test.withMonthOfYear(0);
            __CLR4_4_1s4hs4hlc8azvmk.R.inc(36856);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36857);try {
            __CLR4_4_1s4hs4hlc8azvmk.R.inc(36858);test.withMonthOfYear(13);
            __CLR4_4_1s4hs4hlc8azvmk.R.inc(36859);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testProperty() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36860);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i7neoisfw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testProperty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36860,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i7neoisfw(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36860);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36861);MonthDay test = new MonthDay(6, 6);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36862);assertEquals(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear()));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36863);assertEquals(test.dayOfMonth(), test.property(DateTimeFieldType.dayOfMonth()));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36864);try {
            __CLR4_4_1s4hs4hlc8azvmk.R.inc(36865);test.property(DateTimeFieldType.millisOfDay());
            __CLR4_4_1s4hs4hlc8azvmk.R.inc(36866);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36867);try {
            __CLR4_4_1s4hs4hlc8azvmk.R.inc(36868);test.property(null);
            __CLR4_4_1s4hs4hlc8azvmk.R.inc(36869);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSerialization() throws Exception {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36870);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on9sg6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36870,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on9sg6() throws Exception{try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36870);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36871);MonthDay test = new MonthDay(5, 6, COPTIC_PARIS);
        
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36872);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36873);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36874);oos.writeObject(test);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36875);byte[] bytes = baos.toByteArray();
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36876);oos.close();
        
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36877);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36878);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36879);MonthDay result = (MonthDay) ois.readObject();
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36880);ois.close();
        
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36881);assertEquals(test, result);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36882);assertTrue(Arrays.equals(test.getValues(), result.getValues()));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36883);assertTrue(Arrays.equals(test.getFields(), result.getFields()));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36884);assertEquals(test.getChronology(), result.getChronology());
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdidsgl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36885,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdidsgl(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36885);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36886);MonthDay test = new MonthDay(5, 6);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36887);assertEquals("--05-06", test.toString());
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString_String() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36888);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1llkh2xsgo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testToString_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36888,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1llkh2xsgo(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36888);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36889);MonthDay test = new MonthDay(5, 6);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36890);assertEquals("05 \ufffd\ufffd", test.toString("MM HH"));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36891);assertEquals("--05-06", test.toString((String) null));
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString_String_Locale() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36892);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1afd64usgs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testToString_String_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36892,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1afd64usgs(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36892);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36893);MonthDay test = new MonthDay(5, 6);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36894);assertEquals("\ufffd 6/5", test.toString("EEE d/M", Locale.ENGLISH));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36895);assertEquals("\ufffd 6/5", test.toString("EEE d/M", Locale.FRENCH));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36896);assertEquals("--05-06", test.toString(null, Locale.ENGLISH));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36897);assertEquals("\ufffd 6/5", test.toString("EEE d/M", null));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36898);assertEquals("--05-06", test.toString(null, null));
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString_DTFormatter() {__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceStart(getClass().getName(),36899);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mxbkpssgz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s4hs4hlc8azvmk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s4hs4hlc8azvmk.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Basics.testToString_DTFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36899,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mxbkpssgz(){try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36899);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36900);MonthDay test = new MonthDay(5, 6);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36901);assertEquals("05 \ufffd\ufffd", test.toString(DateTimeFormat.forPattern("MM HH")));
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36902);assertEquals("--05-06", test.toString((DateTimeFormatter) null));
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void check(MonthDay test, int month, int day) {try{__CLR4_4_1s4hs4hlc8azvmk.R.inc(36903);
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36904);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1s4hs4hlc8azvmk.R.inc(36905);assertEquals(day, test.getDayOfMonth());
    }finally{__CLR4_4_1s4hs4hlc8azvmk.R.flushNeeded();}}
}
