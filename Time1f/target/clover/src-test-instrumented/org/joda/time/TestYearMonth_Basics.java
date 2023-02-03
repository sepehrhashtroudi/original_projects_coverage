/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2009 Stephen Colebourne
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
 * This class is a Junit unit test for YearMonth.
 *
 * @author Stephen Colebourne
 */
public class TestYearMonth_Basics extends TestCase {static class __CLR4_4_111tq11tqlc8azwhg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,49420,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
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

    public static void main(String[] args) {try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49022);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49023);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49024);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49025);return new TestSuite(TestYearMonth_Basics.class);
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    public TestYearMonth_Basics(String name) {
        super(name);__CLR4_4_111tq11tqlc8azwhg.R.inc(49027);try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49026);
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49028);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49029);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49030);zone = DateTimeZone.getDefault();
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49031);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49032);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49033);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49034);DateTimeZone.setDefault(zone);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49035);zone = null;
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGet() {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49036);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tpje3v11u4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testGet",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49036,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tpje3v11u4(){try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49036);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49037);YearMonth test = new YearMonth();
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49038);assertEquals(1970, test.get(DateTimeFieldType.year()));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49039);assertEquals(6, test.get(DateTimeFieldType.monthOfYear()));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49040);try {
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49041);test.get(null);
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49042);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49043);try {
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49044);test.get(DateTimeFieldType.dayOfMonth());
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49045);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    public void testSize() {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49046);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xx12211ue();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49046,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xx12211ue(){try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49046);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49047);YearMonth test = new YearMonth();
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49048);assertEquals(2, test.size());
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    public void testGetFieldType() {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49049);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18z86mv11uh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testGetFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49049,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18z86mv11uh(){try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49049);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49050);YearMonth test = new YearMonth(COPTIC_PARIS);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49051);assertSame(DateTimeFieldType.year(), test.getFieldType(0));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49052);assertSame(DateTimeFieldType.monthOfYear(), test.getFieldType(1));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49053);try {
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49054);test.getFieldType(-1);
        } catch (IndexOutOfBoundsException ex) {}
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49055);try {
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49056);test.getFieldType(2);
        } catch (IndexOutOfBoundsException ex) {}
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    public void testGetFieldTypes() {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49057);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z5ndvu11up();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testGetFieldTypes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49057,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z5ndvu11up(){try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49057);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49058);YearMonth test = new YearMonth(COPTIC_PARIS);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49059);DateTimeFieldType[] fields = test.getFieldTypes();
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49060);assertEquals(2, fields.length);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49061);assertSame(DateTimeFieldType.year(), fields[0]);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49062);assertSame(DateTimeFieldType.monthOfYear(), fields[1]);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49063);assertNotSame(test.getFieldTypes(), test.getFieldTypes());
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    public void testGetField() {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49064);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lx8n7n11uw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testGetField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49064,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lx8n7n11uw(){try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49064);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49065);YearMonth test = new YearMonth(COPTIC_PARIS);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49066);assertSame(COPTIC_UTC.year(), test.getField(0));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49067);assertSame(COPTIC_UTC.monthOfYear(), test.getField(1));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49068);try {
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49069);test.getField(-1);
        } catch (IndexOutOfBoundsException ex) {}
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49070);try {
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49071);test.getField(2);
        } catch (IndexOutOfBoundsException ex) {}
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    public void testGetFields() {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49072);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lmeas11v4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testGetFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49072,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lmeas11v4(){try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49072);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49073);YearMonth test = new YearMonth(COPTIC_PARIS);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49074);DateTimeField[] fields = test.getFields();
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49075);assertEquals(2, fields.length);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49076);assertSame(COPTIC_UTC.year(), fields[0]);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49077);assertSame(COPTIC_UTC.monthOfYear(), fields[1]);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49078);assertNotSame(test.getFields(), test.getFields());
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    public void testGetValue() {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49079);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qcksmk11vb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testGetValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49079,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qcksmk11vb(){try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49079);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49080);YearMonth test = new YearMonth();
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49081);assertEquals(1970, test.getValue(0));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49082);assertEquals(6, test.getValue(1));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49083);try {
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49084);test.getValue(-1);
        } catch (IndexOutOfBoundsException ex) {}
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49085);try {
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49086);test.getValue(2);
        } catch (IndexOutOfBoundsException ex) {}
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    public void testGetValues() {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49087);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15gduel11vj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testGetValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49087,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15gduel11vj(){try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49087);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49088);YearMonth test = new YearMonth();
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49089);int[] values = test.getValues();
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49090);assertEquals(2, values.length);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49091);assertEquals(1970, values[0]);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49092);assertEquals(6, values[1]);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49093);assertNotSame(test.getValues(), test.getValues());
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    public void testIsSupported() {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hma24n11vq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testIsSupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49094,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hma24n11vq(){try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49094);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49095);YearMonth test = new YearMonth(COPTIC_PARIS);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49096);assertEquals(true, test.isSupported(DateTimeFieldType.year()));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49097);assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear()));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49098);assertEquals(false, test.isSupported(DateTimeFieldType.dayOfMonth()));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49099);assertEquals(false, test.isSupported(DateTimeFieldType.hourOfDay()));
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    public void testEqualsHashCode() {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5in7711vw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testEqualsHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49100,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5in7711vw(){try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49100);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49101);YearMonth test1 = new YearMonth(1970, 6, COPTIC_PARIS);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49102);YearMonth test2 = new YearMonth(1970, 6, COPTIC_PARIS);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49103);assertEquals(true, test1.equals(test2));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49104);assertEquals(true, test2.equals(test1));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49105);assertEquals(true, test1.equals(test1));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49106);assertEquals(true, test2.equals(test2));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49107);assertEquals(true, test1.hashCode() == test2.hashCode());
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49108);assertEquals(true, test1.hashCode() == test1.hashCode());
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49109);assertEquals(true, test2.hashCode() == test2.hashCode());
        
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49110);YearMonth test3 = new YearMonth(1971, 6);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49111);assertEquals(false, test1.equals(test3));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49112);assertEquals(false, test2.equals(test3));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49113);assertEquals(false, test3.equals(test1));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49114);assertEquals(false, test3.equals(test2));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49115);assertEquals(false, test1.hashCode() == test3.hashCode());
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49116);assertEquals(false, test2.hashCode() == test3.hashCode());
        
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49117);assertEquals(false, test1.equals("Hello"));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49118);assertEquals(true, test1.equals(new MockYM()));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49119);assertEquals(false, test1.equals(MockPartial.EMPTY_INSTANCE));
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}
    
    class MockYM extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49120);
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49121);return COPTIC_UTC;
        }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}
        public DateTimeField[] getFields() {try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49122);
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49123);return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
            };
        }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}
        public int[] getValues() {try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49124);
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49125);return new int[] {1970, 6};
        }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    public void testCompareTo() {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49126);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pz6vfv11wm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testCompareTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49126,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pz6vfv11wm(){try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49126);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49127);YearMonth test1 = new YearMonth(2005, 6);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49128);YearMonth test1a = new YearMonth(2005, 6);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49129);assertEquals(0, test1.compareTo(test1a));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49130);assertEquals(0, test1a.compareTo(test1));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49131);assertEquals(0, test1.compareTo(test1));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49132);assertEquals(0, test1a.compareTo(test1a));
        
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49133);YearMonth test2 = new YearMonth(2005, 7);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49134);assertEquals(-1, test1.compareTo(test2));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49135);assertEquals(+1, test2.compareTo(test1));
        
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49136);YearMonth test3 = new YearMonth(2005, 7, GregorianChronology.getInstanceUTC());
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49137);assertEquals(-1, test1.compareTo(test3));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49138);assertEquals(+1, test3.compareTo(test1));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49139);assertEquals(0, test3.compareTo(test2));
        
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49140);DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.monthOfYear(),
        };
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49141);int[] values = new int[] {2005, 6};
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49142);Partial p = new Partial(types, values);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49143);assertEquals(0, test1.compareTo(p));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49144);try {
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49145);test1.compareTo(null);
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49146);fail();
        } catch (NullPointerException ex) {}
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49147);try {
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49148);test1.compareTo(new LocalTime());
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49149);fail();
        } catch (ClassCastException ex) {}
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49150);Partial partial = new Partial()
            .with(DateTimeFieldType.centuryOfEra(), 1)
            .with(DateTimeFieldType.halfdayOfDay(), 0)
            .with(DateTimeFieldType.dayOfMonth(), 9);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49151);try {
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49152);new YearMonth(1970, 6).compareTo(partial);
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49153);fail();
        } catch (ClassCastException ex) {}
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testIsEqual_YM() {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49154);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hzkvvm11xe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testIsEqual_YM",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49154,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hzkvvm11xe(){try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49154);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49155);YearMonth test1 = new YearMonth(2005, 6);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49156);YearMonth test1a = new YearMonth(2005, 6);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49157);assertEquals(true, test1.isEqual(test1a));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49158);assertEquals(true, test1a.isEqual(test1));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49159);assertEquals(true, test1.isEqual(test1));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49160);assertEquals(true, test1a.isEqual(test1a));
        
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49161);YearMonth test2 = new YearMonth(2005, 7);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49162);assertEquals(false, test1.isEqual(test2));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49163);assertEquals(false, test2.isEqual(test1));
        
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49164);YearMonth test3 = new YearMonth(2005, 7, GregorianChronology.getInstanceUTC());
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49165);assertEquals(false, test1.isEqual(test3));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49166);assertEquals(false, test3.isEqual(test1));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49167);assertEquals(true, test3.isEqual(test2));
        
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49168);try {
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49169);new YearMonth(2005, 7).isEqual(null);
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49170);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testIsBefore_YM() {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49171);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12ayjhb11xv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testIsBefore_YM",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49171,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12ayjhb11xv(){try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49171);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49172);YearMonth test1 = new YearMonth(2005, 6);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49173);YearMonth test1a = new YearMonth(2005, 6);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49174);assertEquals(false, test1.isBefore(test1a));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49175);assertEquals(false, test1a.isBefore(test1));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49176);assertEquals(false, test1.isBefore(test1));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49177);assertEquals(false, test1a.isBefore(test1a));
        
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49178);YearMonth test2 = new YearMonth(2005, 7);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49179);assertEquals(true, test1.isBefore(test2));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49180);assertEquals(false, test2.isBefore(test1));
        
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49181);YearMonth test3 = new YearMonth(2005, 7, GregorianChronology.getInstanceUTC());
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49182);assertEquals(true, test1.isBefore(test3));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49183);assertEquals(false, test3.isBefore(test1));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49184);assertEquals(false, test3.isBefore(test2));
        
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49185);try {
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49186);new YearMonth(2005, 7).isBefore(null);
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49187);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testIsAfter_YM() {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v3h1ve11yc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testIsAfter_YM",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49188,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v3h1ve11yc(){try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49188);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49189);YearMonth test1 = new YearMonth(2005, 6);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49190);YearMonth test1a = new YearMonth(2005, 6);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49191);assertEquals(false, test1.isAfter(test1a));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49192);assertEquals(false, test1a.isAfter(test1));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49193);assertEquals(false, test1.isAfter(test1));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49194);assertEquals(false, test1a.isAfter(test1a));
        
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49195);YearMonth test2 = new YearMonth(2005, 7);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49196);assertEquals(false, test1.isAfter(test2));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49197);assertEquals(true, test2.isAfter(test1));
        
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49198);YearMonth test3 = new YearMonth(2005, 7, GregorianChronology.getInstanceUTC());
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49199);assertEquals(false, test1.isAfter(test3));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49200);assertEquals(true, test3.isAfter(test1));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49201);assertEquals(false, test3.isAfter(test2));
        
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49202);try {
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49203);new YearMonth(2005, 7).isAfter(null);
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49204);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    public void testWithChronologyRetainFields_Chrono() {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49205);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_143gerp11yt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithChronologyRetainFields_Chrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49205,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_143gerp11yt(){try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49205);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49206);YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49207);YearMonth test = base.withChronologyRetainFields(BUDDHIST_TOKYO);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49208);check(base, 2005, 6);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49209);assertEquals(COPTIC_UTC, base.getChronology());
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49210);check(test, 2005, 6);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49211);assertEquals(BUDDHIST_UTC, test.getChronology());
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    public void testWithChronologyRetainFields_sameChrono() {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49212);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15b1wdb11z0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithChronologyRetainFields_sameChrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49212,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15b1wdb11z0(){try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49212);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49213);YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49214);YearMonth test = base.withChronologyRetainFields(COPTIC_TOKYO);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49215);assertSame(base, test);
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    public void testWithChronologyRetainFields_nullChrono() {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49216);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j0ft9a11z4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithChronologyRetainFields_nullChrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49216,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j0ft9a11z4(){try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49216);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49217);YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49218);YearMonth test = base.withChronologyRetainFields(null);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49219);check(base, 2005, 6);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49220);assertEquals(COPTIC_UTC, base.getChronology());
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49221);check(test, 2005, 6);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49222);assertEquals(ISO_UTC, test.getChronology());
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    public void testWithChronologyRetainFields_invalidInNewChrono() {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49223);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a802bj11zb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithChronologyRetainFields_invalidInNewChrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49223,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a802bj11zb(){try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49223);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49224);YearMonth base = new YearMonth(2005, 13, COPTIC_UTC);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49225);try {
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49226);base.withChronologyRetainFields(ISO_UTC);
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49227);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithField() {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49228);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vrat1z11zg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49228,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vrat1z11zg(){try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49228);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49229);YearMonth test = new YearMonth(2004, 6);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49230);YearMonth result = test.withField(DateTimeFieldType.year(), 2006);
        
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49231);assertEquals(new YearMonth(2004, 6), test);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49232);assertEquals(new YearMonth(2006, 6), result);
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    public void testWithField_nullField() {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49233);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xjqkwz11zl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithField_nullField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49233,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xjqkwz11zl(){try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49233);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49234);YearMonth test = new YearMonth(2004, 6);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49235);try {
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49236);test.withField(null, 6);
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49237);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    public void testWithField_unknownField() {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y6l5bo11zq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithField_unknownField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49238,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y6l5bo11zq(){try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49238);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49239);YearMonth test = new YearMonth(2004, 6);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49240);try {
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49241);test.withField(DateTimeFieldType.hourOfDay(), 6);
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49242);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    public void testWithField_same() {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18fa39m11zv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithField_same",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49243,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18fa39m11zv(){try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49243);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49244);YearMonth test = new YearMonth(2004, 6);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49245);YearMonth result = test.withField(DateTimeFieldType.year(), 2004);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49246);assertEquals(new YearMonth(2004, 6), test);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49247);assertSame(test, result);
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithFieldAdded() {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49248);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15nlb9h1200();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithFieldAdded",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49248,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15nlb9h1200(){try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49248);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49249);YearMonth test = new YearMonth(2004, 6);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49250);YearMonth result = test.withFieldAdded(DurationFieldType.years(), 6);
        
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49251);assertEquals(new YearMonth(2004, 6), test);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49252);assertEquals(new YearMonth(2010, 6), result);
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    public void testWithFieldAdded_nullField_zero() {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ynb18c1205();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithFieldAdded_nullField_zero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49253,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ynb18c1205(){try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49253);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49254);YearMonth test = new YearMonth(2004, 6);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49255);try {
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49256);test.withFieldAdded(null, 0);
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49257);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    public void testWithFieldAdded_nullField_nonZero() {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49258);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cciwz5120a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithFieldAdded_nullField_nonZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49258,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cciwz5120a(){try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49258);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49259);YearMonth test = new YearMonth(2004, 6);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49260);try {
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49261);test.withFieldAdded(null, 6);
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49262);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    public void testWithFieldAdded_zero() {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h793dc120f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithFieldAdded_zero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49263,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h793dc120f(){try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49263);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49264);YearMonth test = new YearMonth(2004, 6);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49265);YearMonth result = test.withFieldAdded(DurationFieldType.years(), 0);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49266);assertSame(test, result);
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    public void testWithFieldAdded_unknownField() {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vo8btk120j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithFieldAdded_unknownField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49267,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vo8btk120j(){try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49267);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49268);YearMonth test = new YearMonth(2004, 6);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49269);try {
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49270);test.withFieldAdded(DurationFieldType.hours(), 6);
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49271);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPlus_RP() {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tz83ig120o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testPlus_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49272,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tz83ig120o(){try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49272);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49273);YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance());
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49274);YearMonth result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49275);YearMonth expected = new YearMonth(2003, 7, BuddhistChronology.getInstance());
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49276);assertEquals(expected, result);
        
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49277);result = test.plus((ReadablePeriod) null);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49278);assertSame(test, result);
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    public void testPlusYears_int() {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49279);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mx5kpt120v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testPlusYears_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49279,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mx5kpt120v(){try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49279);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49280);YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance());
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49281);YearMonth result = test.plusYears(1);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49282);YearMonth expected = new YearMonth(2003, 5, BuddhistChronology.getInstance());
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49283);assertEquals(expected, result);
        
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49284);result = test.plusYears(0);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49285);assertSame(test, result);
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    public void testPlusMonths_int() {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49286);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_170gxai1212();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testPlusMonths_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49286,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_170gxai1212(){try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49286);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49287);YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance());
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49288);YearMonth result = test.plusMonths(1);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49289);YearMonth expected = new YearMonth(2002, 6, BuddhistChronology.getInstance());
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49290);assertEquals(expected, result);
        
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49291);result = test.plusMonths(0);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49292);assertSame(test, result);
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testMinus_RP() {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_112cpdm1219();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testMinus_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49293,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_112cpdm1219(){try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49293);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49294);YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance());
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49295);YearMonth result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49296);YearMonth expected = new YearMonth(2001, 4, BuddhistChronology.getInstance());
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49297);assertEquals(expected, result);
        
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49298);result = test.minus((ReadablePeriod) null);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49299);assertSame(test, result);
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    public void testMinusYears_int() {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m9qdin121g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testMinusYears_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49300,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m9qdin121g(){try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49300);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49301);YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance());
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49302);YearMonth result = test.minusYears(1);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49303);YearMonth expected = new YearMonth(2001, 5, BuddhistChronology.getInstance());
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49304);assertEquals(expected, result);
        
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49305);result = test.minusYears(0);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49306);assertSame(test, result);
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    public void testMinusMonths_int() {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49307);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r6k4go121n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testMinusMonths_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49307,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r6k4go121n(){try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49307);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49308);YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance());
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49309);YearMonth result = test.minusMonths(1);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49310);YearMonth expected = new YearMonth(2002, 4, BuddhistChronology.getInstance());
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49311);assertEquals(expected, result);
        
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49312);result = test.minusMonths(0);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49313);assertSame(test, result);
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToLocalDate() {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s1orir121u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testToLocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49314,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s1orir121u(){try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49314);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49315);YearMonth base = new YearMonth(2005, 6, COPTIC_UTC);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49316);LocalDate test = base.toLocalDate(9);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49317);assertEquals(new LocalDate(2005, 6, 9, COPTIC_UTC), test);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49318);try {
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49319);base.toLocalDate(0);
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49320);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToDateTime_RI() {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49321);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1584tmd1221();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testToDateTime_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49321,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1584tmd1221(){try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49321);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49322);YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49323);DateTime dt = new DateTime(2002, 1, 3, 4, 5, 6, 7);
        
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49324);DateTime test = base.toDateTime(dt);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49325);check(base, 2005, 6);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49326);DateTime expected = dt;
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49327);expected = expected.year().setCopy(2005);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49328);expected = expected.monthOfYear().setCopy(6);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49329);assertEquals(expected, test);
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    public void testToDateTime_nullRI() {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49330);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xlns4122a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testToDateTime_nullRI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49330,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xlns4122a(){try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49330);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49331);YearMonth base = new YearMonth(2005, 6);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49332);DateTime dt = new DateTime(2002, 1, 3, 4, 5, 6, 7);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49333);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49334);DateTime test = base.toDateTime((ReadableInstant) null);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49335);check(base, 2005, 6);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49336);DateTime expected = dt;
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49337);expected = expected.year().setCopy(2005);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49338);expected = expected.monthOfYear().setCopy(6);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49339);assertEquals(expected, test);
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToInterval() {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cj50gp122k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testToInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49340,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cj50gp122k(){try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49340);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49341);YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49342);Interval test = base.toInterval();
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49343);check(base, 2005, 6);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49344);DateTime start = new DateTime(2005, 6, 1, 0, 0, COPTIC_LONDON);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49345);DateTime end = new DateTime(2005, 7, 1, 0, 0, COPTIC_LONDON);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49346);Interval expected = new Interval(start, end);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49347);assertEquals(expected, test);
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToInterval_Zone() {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wpa0zk122s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testToInterval_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49348,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wpa0zk122s(){try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49348);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49349);YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49350);Interval test = base.toInterval(TOKYO);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49351);check(base, 2005, 6);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49352);DateTime start = new DateTime(2005, 6, 1, 0, 0, COPTIC_TOKYO);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49353);DateTime end = new DateTime(2005, 7, 1, 0, 0, COPTIC_TOKYO);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49354);Interval expected = new Interval(start, end);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49355);assertEquals(expected, test);
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    public void testToInterval_nullZone() {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19hp1i11230();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testToInterval_nullZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49356,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19hp1i11230(){try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49356);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49357);YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49358);Interval test = base.toInterval(null);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49359);check(base, 2005, 6);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49360);DateTime start = new DateTime(2005, 6, 1, 0, 0, COPTIC_LONDON);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49361);DateTime end = new DateTime(2005, 7, 1, 0, 0, COPTIC_LONDON);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49362);Interval expected = new Interval(start, end);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49363);assertEquals(expected, test);
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testWithers() {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49364);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sn9jzp1238();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithers",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49364,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sn9jzp1238(){try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49364);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49365);YearMonth test = new YearMonth(1970, 6);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49366);check(test.withYear(2000), 2000, 6);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49367);check(test.withMonthOfYear(2), 1970, 2);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49368);try {
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49369);test.withMonthOfYear(0);
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49370);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49371);try {
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49372);test.withMonthOfYear(13);
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49373);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testProperty() {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49374);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i7neoi123i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testProperty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49374,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i7neoi123i(){try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49374);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49375);YearMonth test = new YearMonth(2005, 6);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49376);assertEquals(test.year(), test.property(DateTimeFieldType.year()));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49377);assertEquals(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear()));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49378);try {
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49379);test.property(DateTimeFieldType.millisOfDay());
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49380);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49381);try {
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49382);test.property(null);
            __CLR4_4_111tq11tqlc8azwhg.R.inc(49383);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSerialization() throws Exception {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49384);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on9123s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49384,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on9123s() throws Exception{try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49384);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49385);YearMonth test = new YearMonth(1972, 6, COPTIC_PARIS);
        
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49386);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49387);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49388);oos.writeObject(test);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49389);byte[] bytes = baos.toByteArray();
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49390);oos.close();
        
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49391);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49392);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49393);YearMonth result = (YearMonth) ois.readObject();
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49394);ois.close();
        
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49395);assertEquals(test, result);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49396);assertTrue(Arrays.equals(test.getValues(), result.getValues()));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49397);assertTrue(Arrays.equals(test.getFields(), result.getFields()));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49398);assertEquals(test.getChronology(), result.getChronology());
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString() {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49399);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid1247();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49399,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid1247(){try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49399);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49400);YearMonth test = new YearMonth(2002, 6);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49401);assertEquals("2002-06", test.toString());
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString_String() {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49402);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1llkh2x124a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testToString_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49402,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1llkh2x124a(){try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49402);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49403);YearMonth test = new YearMonth(2002, 6);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49404);assertEquals("2002 \ufffd\ufffd", test.toString("yyyy HH"));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49405);assertEquals("2002-06", test.toString((String) null));
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString_String_Locale() {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49406);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1afd64u124e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testToString_String_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49406,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1afd64u124e(){try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49406);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49407);YearMonth test = new YearMonth(2002, 6);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49408);assertEquals("\ufffd \ufffd/6", test.toString("EEE d/M", Locale.ENGLISH));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49409);assertEquals("\ufffd \ufffd/6", test.toString("EEE d/M", Locale.FRENCH));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49410);assertEquals("2002-06", test.toString(null, Locale.ENGLISH));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49411);assertEquals("\ufffd \ufffd/6", test.toString("EEE d/M", null));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49412);assertEquals("2002-06", test.toString(null, null));
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString_DTFormatter() {__CLR4_4_111tq11tqlc8azwhg.R.globalSliceStart(getClass().getName(),49413);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mxbkps124l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111tq11tqlc8azwhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_111tq11tqlc8azwhg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testToString_DTFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49413,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mxbkps124l(){try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49413);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49414);YearMonth test = new YearMonth(2002, 6);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49415);assertEquals("2002 \ufffd\ufffd", test.toString(DateTimeFormat.forPattern("yyyy HH")));
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49416);assertEquals("2002-06", test.toString((DateTimeFormatter) null));
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void check(YearMonth test, int year, int month) {try{__CLR4_4_111tq11tqlc8azwhg.R.inc(49417);
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49418);assertEquals(year, test.getYear());
        __CLR4_4_111tq11tqlc8azwhg.R.inc(49419);assertEquals(month, test.getMonthOfYear());
    }finally{__CLR4_4_111tq11tqlc8azwhg.R.flushNeeded();}}
}
