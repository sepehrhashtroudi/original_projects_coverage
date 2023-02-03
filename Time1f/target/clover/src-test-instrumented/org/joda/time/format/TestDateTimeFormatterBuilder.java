/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2011 Stephen Colebourne
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
package org.joda.time.format;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;

/**
 * This class is a Junit unit test for DateTimeFormatterBuilder.
 *
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 */
public class TestDateTimeFormatterBuilder extends TestCase {static class __CLR4_4_119rb19rblc8azxfw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,59577,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final DateTimeZone NEW_YORK = DateTimeZone.forID("America/New_York");
    private static final DateTimeZone LOS_ANGELES = DateTimeZone.forID("America/Los_Angeles");

    public static void main(String[] args) {try{__CLR4_4_119rb19rblc8azxfw.R.inc(59303);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59304);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_119rb19rblc8azxfw.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_119rb19rblc8azxfw.R.inc(59305);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59306);return new TestSuite(TestDateTimeFormatterBuilder.class);
    }finally{__CLR4_4_119rb19rblc8azxfw.R.flushNeeded();}}

    public TestDateTimeFormatterBuilder(String name) {
        super(name);__CLR4_4_119rb19rblc8azxfw.R.inc(59308);try{__CLR4_4_119rb19rblc8azxfw.R.inc(59307);
    }finally{__CLR4_4_119rb19rblc8azxfw.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_119rb19rblc8azxfw.R.inc(59309);
    }finally{__CLR4_4_119rb19rblc8azxfw.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_119rb19rblc8azxfw.R.inc(59310);
    }finally{__CLR4_4_119rb19rblc8azxfw.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_toFormatter() {__CLR4_4_119rb19rblc8azxfw.R.globalSliceStart(getClass().getName(),59311);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ngz82f19rj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119rb19rblc8azxfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_119rb19rblc8azxfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_toFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59311,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ngz82f19rj(){try{__CLR4_4_119rb19rblc8azxfw.R.inc(59311);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59312);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        __CLR4_4_119rb19rblc8azxfw.R.inc(59313);try {
            __CLR4_4_119rb19rblc8azxfw.R.inc(59314);bld.toFormatter();
            __CLR4_4_119rb19rblc8azxfw.R.inc(59315);fail();
        } catch (UnsupportedOperationException ex) {}
        __CLR4_4_119rb19rblc8azxfw.R.inc(59316);bld.appendLiteral('X');
        __CLR4_4_119rb19rblc8azxfw.R.inc(59317);assertNotNull(bld.toFormatter());
    }finally{__CLR4_4_119rb19rblc8azxfw.R.flushNeeded();}}

    public void test_toPrinter() {__CLR4_4_119rb19rblc8azxfw.R.globalSliceStart(getClass().getName(),59318);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19czpl319rq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119rb19rblc8azxfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_119rb19rblc8azxfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_toPrinter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59318,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19czpl319rq(){try{__CLR4_4_119rb19rblc8azxfw.R.inc(59318);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59319);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        __CLR4_4_119rb19rblc8azxfw.R.inc(59320);try {
            __CLR4_4_119rb19rblc8azxfw.R.inc(59321);bld.toPrinter();
            __CLR4_4_119rb19rblc8azxfw.R.inc(59322);fail();
        } catch (UnsupportedOperationException ex) {}
        __CLR4_4_119rb19rblc8azxfw.R.inc(59323);bld.appendLiteral('X');
        __CLR4_4_119rb19rblc8azxfw.R.inc(59324);assertNotNull(bld.toPrinter());
    }finally{__CLR4_4_119rb19rblc8azxfw.R.flushNeeded();}}

    public void test_toParser() {__CLR4_4_119rb19rblc8azxfw.R.globalSliceStart(getClass().getName(),59325);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a3bs4219rx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119rb19rblc8azxfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_119rb19rblc8azxfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_toParser",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59325,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a3bs4219rx(){try{__CLR4_4_119rb19rblc8azxfw.R.inc(59325);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59326);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        __CLR4_4_119rb19rblc8azxfw.R.inc(59327);try {
            __CLR4_4_119rb19rblc8azxfw.R.inc(59328);bld.toParser();
            __CLR4_4_119rb19rblc8azxfw.R.inc(59329);fail();
        } catch (UnsupportedOperationException ex) {}
        __CLR4_4_119rb19rblc8azxfw.R.inc(59330);bld.appendLiteral('X');
        __CLR4_4_119rb19rblc8azxfw.R.inc(59331);assertNotNull(bld.toParser());
    }finally{__CLR4_4_119rb19rblc8azxfw.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_canBuildFormatter() {__CLR4_4_119rb19rblc8azxfw.R.globalSliceStart(getClass().getName(),59332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xudxwm19s4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119rb19rblc8azxfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_119rb19rblc8azxfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_canBuildFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59332,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xudxwm19s4(){try{__CLR4_4_119rb19rblc8azxfw.R.inc(59332);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59333);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        __CLR4_4_119rb19rblc8azxfw.R.inc(59334);assertEquals(false, bld.canBuildFormatter());
        __CLR4_4_119rb19rblc8azxfw.R.inc(59335);bld.appendLiteral('X');
        __CLR4_4_119rb19rblc8azxfw.R.inc(59336);assertEquals(true, bld.canBuildFormatter());
    }finally{__CLR4_4_119rb19rblc8azxfw.R.flushNeeded();}}

    public void test_canBuildPrinter() {__CLR4_4_119rb19rblc8azxfw.R.globalSliceStart(getClass().getName(),59337);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16xp2mi19s9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119rb19rblc8azxfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_119rb19rblc8azxfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_canBuildPrinter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59337,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16xp2mi19s9(){try{__CLR4_4_119rb19rblc8azxfw.R.inc(59337);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59338);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        __CLR4_4_119rb19rblc8azxfw.R.inc(59339);assertEquals(false, bld.canBuildPrinter());
        __CLR4_4_119rb19rblc8azxfw.R.inc(59340);bld.appendLiteral('X');
        __CLR4_4_119rb19rblc8azxfw.R.inc(59341);assertEquals(true, bld.canBuildPrinter());
    }finally{__CLR4_4_119rb19rblc8azxfw.R.flushNeeded();}}

    public void test_canBuildParser() {__CLR4_4_119rb19rblc8azxfw.R.globalSliceStart(getClass().getName(),59342);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1elhi7j19se();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119rb19rblc8azxfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_119rb19rblc8azxfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_canBuildParser",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59342,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1elhi7j19se(){try{__CLR4_4_119rb19rblc8azxfw.R.inc(59342);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59343);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        __CLR4_4_119rb19rblc8azxfw.R.inc(59344);assertEquals(false, bld.canBuildParser());
        __CLR4_4_119rb19rblc8azxfw.R.inc(59345);bld.appendLiteral('X');
        __CLR4_4_119rb19rblc8azxfw.R.inc(59346);assertEquals(true, bld.canBuildParser());
    }finally{__CLR4_4_119rb19rblc8azxfw.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_append_Formatter() {__CLR4_4_119rb19rblc8azxfw.R.globalSliceStart(getClass().getName(),59347);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vlpcfb19sj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119rb19rblc8azxfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_119rb19rblc8azxfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_Formatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59347,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vlpcfb19sj(){try{__CLR4_4_119rb19rblc8azxfw.R.inc(59347);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59348);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        __CLR4_4_119rb19rblc8azxfw.R.inc(59349);bld.appendLiteral('Y');
        __CLR4_4_119rb19rblc8azxfw.R.inc(59350);DateTimeFormatter f = bld.toFormatter();
        
        __CLR4_4_119rb19rblc8azxfw.R.inc(59351);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder();
        __CLR4_4_119rb19rblc8azxfw.R.inc(59352);bld2.appendLiteral('X');
        __CLR4_4_119rb19rblc8azxfw.R.inc(59353);bld2.append(f);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59354);bld2.appendLiteral('Z');
        __CLR4_4_119rb19rblc8azxfw.R.inc(59355);assertEquals("XYZ", bld2.toFormatter().print(0L));
    }finally{__CLR4_4_119rb19rblc8azxfw.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_append_Printer() {__CLR4_4_119rb19rblc8azxfw.R.globalSliceStart(getClass().getName(),59356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rmjaaf19ss();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119rb19rblc8azxfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_119rb19rblc8azxfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_Printer",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59356,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rmjaaf19ss(){try{__CLR4_4_119rb19rblc8azxfw.R.inc(59356);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59357);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        __CLR4_4_119rb19rblc8azxfw.R.inc(59358);bld.appendLiteral('Y');
        __CLR4_4_119rb19rblc8azxfw.R.inc(59359);DateTimePrinter p = bld.toPrinter();
        
        __CLR4_4_119rb19rblc8azxfw.R.inc(59360);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder();
        __CLR4_4_119rb19rblc8azxfw.R.inc(59361);bld2.appendLiteral('X');
        __CLR4_4_119rb19rblc8azxfw.R.inc(59362);bld2.append(p);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59363);bld2.appendLiteral('Z');
        __CLR4_4_119rb19rblc8azxfw.R.inc(59364);DateTimeFormatter f = bld2.toFormatter();
        __CLR4_4_119rb19rblc8azxfw.R.inc(59365);assertEquals(true, f.isPrinter());
        __CLR4_4_119rb19rblc8azxfw.R.inc(59366);assertEquals(false, f.isParser());
        __CLR4_4_119rb19rblc8azxfw.R.inc(59367);assertEquals("XYZ", f.print(0L));
    }finally{__CLR4_4_119rb19rblc8azxfw.R.flushNeeded();}}

    public void test_append_nullPrinter() {__CLR4_4_119rb19rblc8azxfw.R.globalSliceStart(getClass().getName(),59368);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c7ck7y19t4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119rb19rblc8azxfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_119rb19rblc8azxfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_nullPrinter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59368,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c7ck7y19t4(){try{__CLR4_4_119rb19rblc8azxfw.R.inc(59368);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59369);try {
            __CLR4_4_119rb19rblc8azxfw.R.inc(59370);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder();
            __CLR4_4_119rb19rblc8azxfw.R.inc(59371);bld2.append((DateTimePrinter) null);
            __CLR4_4_119rb19rblc8azxfw.R.inc(59372);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_119rb19rblc8azxfw.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_append_Parser() {__CLR4_4_119rb19rblc8azxfw.R.globalSliceStart(getClass().getName(),59373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18e1tvm19t9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119rb19rblc8azxfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_119rb19rblc8azxfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_Parser",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59373,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18e1tvm19t9(){try{__CLR4_4_119rb19rblc8azxfw.R.inc(59373);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59374);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        __CLR4_4_119rb19rblc8azxfw.R.inc(59375);bld.appendLiteral('Y');
        __CLR4_4_119rb19rblc8azxfw.R.inc(59376);DateTimeParser p = bld.toParser();
        
        __CLR4_4_119rb19rblc8azxfw.R.inc(59377);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder();
        __CLR4_4_119rb19rblc8azxfw.R.inc(59378);bld2.appendLiteral('X');
        __CLR4_4_119rb19rblc8azxfw.R.inc(59379);bld2.append(p);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59380);bld2.appendLiteral('Z');
        __CLR4_4_119rb19rblc8azxfw.R.inc(59381);DateTimeFormatter f = bld2.toFormatter();
        __CLR4_4_119rb19rblc8azxfw.R.inc(59382);assertEquals(false, f.isPrinter());
        __CLR4_4_119rb19rblc8azxfw.R.inc(59383);assertEquals(true, f.isParser());
        __CLR4_4_119rb19rblc8azxfw.R.inc(59384);assertEquals(0, f.withZoneUTC().parseMillis("XYZ"));
    }finally{__CLR4_4_119rb19rblc8azxfw.R.flushNeeded();}}

    public void test_append_nullParser() {__CLR4_4_119rb19rblc8azxfw.R.globalSliceStart(getClass().getName(),59385);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zdzp5n19tl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119rb19rblc8azxfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_119rb19rblc8azxfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_nullParser",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59385,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zdzp5n19tl(){try{__CLR4_4_119rb19rblc8azxfw.R.inc(59385);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59386);try {
            __CLR4_4_119rb19rblc8azxfw.R.inc(59387);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder();
            __CLR4_4_119rb19rblc8azxfw.R.inc(59388);bld2.append((DateTimeParser) null);
            __CLR4_4_119rb19rblc8azxfw.R.inc(59389);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_119rb19rblc8azxfw.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_append_Printer_nullParser() {__CLR4_4_119rb19rblc8azxfw.R.globalSliceStart(getClass().getName(),59390);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vlr99m19tq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119rb19rblc8azxfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_119rb19rblc8azxfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_Printer_nullParser",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59390,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vlr99m19tq(){try{__CLR4_4_119rb19rblc8azxfw.R.inc(59390);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59391);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        __CLR4_4_119rb19rblc8azxfw.R.inc(59392);bld.appendLiteral('Y');
        __CLR4_4_119rb19rblc8azxfw.R.inc(59393);DateTimePrinter p = bld.toPrinter();
        
        __CLR4_4_119rb19rblc8azxfw.R.inc(59394);try {
            __CLR4_4_119rb19rblc8azxfw.R.inc(59395);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder();
            __CLR4_4_119rb19rblc8azxfw.R.inc(59396);bld2.append(p, (DateTimeParser) null);
            __CLR4_4_119rb19rblc8azxfw.R.inc(59397);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_119rb19rblc8azxfw.R.flushNeeded();}}

    public void test_append_nullPrinter_Parser() {__CLR4_4_119rb19rblc8azxfw.R.globalSliceStart(getClass().getName(),59398);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qdll9219ty();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119rb19rblc8azxfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_119rb19rblc8azxfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_nullPrinter_Parser",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59398,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qdll9219ty(){try{__CLR4_4_119rb19rblc8azxfw.R.inc(59398);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59399);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        __CLR4_4_119rb19rblc8azxfw.R.inc(59400);bld.appendLiteral('Y');
        __CLR4_4_119rb19rblc8azxfw.R.inc(59401);DateTimeParser p = bld.toParser();
        
        __CLR4_4_119rb19rblc8azxfw.R.inc(59402);try {
            __CLR4_4_119rb19rblc8azxfw.R.inc(59403);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder();
            __CLR4_4_119rb19rblc8azxfw.R.inc(59404);bld2.append((DateTimePrinter) null, p);
            __CLR4_4_119rb19rblc8azxfw.R.inc(59405);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_119rb19rblc8azxfw.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_appendOptional_Parser() {__CLR4_4_119rb19rblc8azxfw.R.globalSliceStart(getClass().getName(),59406);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yzm68219u6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119rb19rblc8azxfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_119rb19rblc8azxfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_appendOptional_Parser",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59406,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yzm68219u6(){try{__CLR4_4_119rb19rblc8azxfw.R.inc(59406);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59407);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        __CLR4_4_119rb19rblc8azxfw.R.inc(59408);bld.appendLiteral('Y');
        __CLR4_4_119rb19rblc8azxfw.R.inc(59409);DateTimeParser p = bld.toParser();
        
        __CLR4_4_119rb19rblc8azxfw.R.inc(59410);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder();
        __CLR4_4_119rb19rblc8azxfw.R.inc(59411);bld2.appendLiteral('X');
        __CLR4_4_119rb19rblc8azxfw.R.inc(59412);bld2.appendOptional(p);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59413);bld2.appendLiteral('Z');
        __CLR4_4_119rb19rblc8azxfw.R.inc(59414);DateTimeFormatter f = bld2.toFormatter();
        __CLR4_4_119rb19rblc8azxfw.R.inc(59415);assertEquals(false, f.isPrinter());
        __CLR4_4_119rb19rblc8azxfw.R.inc(59416);assertEquals(true, f.isParser());
        __CLR4_4_119rb19rblc8azxfw.R.inc(59417);assertEquals(0, f.withZoneUTC().parseMillis("XYZ"));
    }finally{__CLR4_4_119rb19rblc8azxfw.R.flushNeeded();}}

    public void test_appendOptional_nullParser() {__CLR4_4_119rb19rblc8azxfw.R.globalSliceStart(getClass().getName(),59418);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xabvxh19ui();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119rb19rblc8azxfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_119rb19rblc8azxfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_appendOptional_nullParser",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59418,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xabvxh19ui(){try{__CLR4_4_119rb19rblc8azxfw.R.inc(59418);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59419);try {
            __CLR4_4_119rb19rblc8azxfw.R.inc(59420);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder();
            __CLR4_4_119rb19rblc8azxfw.R.inc(59421);bld2.appendOptional((DateTimeParser) null);
            __CLR4_4_119rb19rblc8azxfw.R.inc(59422);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_119rb19rblc8azxfw.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_appendFixedDecimal() {__CLR4_4_119rb19rblc8azxfw.R.globalSliceStart(getClass().getName(),59423);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1trtq1719un();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119rb19rblc8azxfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_119rb19rblc8azxfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_appendFixedDecimal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59423,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1trtq1719un(){try{__CLR4_4_119rb19rblc8azxfw.R.inc(59423);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59424);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        __CLR4_4_119rb19rblc8azxfw.R.inc(59425);bld.appendFixedDecimal(DateTimeFieldType.year(), 4);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59426);DateTimeFormatter f = bld.toFormatter();

        __CLR4_4_119rb19rblc8azxfw.R.inc(59427);assertEquals("2007", f.print(new DateTime("2007-01-01")));
        __CLR4_4_119rb19rblc8azxfw.R.inc(59428);assertEquals("0123", f.print(new DateTime("123-01-01")));
        __CLR4_4_119rb19rblc8azxfw.R.inc(59429);assertEquals("0001", f.print(new DateTime("1-2-3")));
        __CLR4_4_119rb19rblc8azxfw.R.inc(59430);assertEquals("99999", f.print(new DateTime("99999-2-3")));
        __CLR4_4_119rb19rblc8azxfw.R.inc(59431);assertEquals("-0099", f.print(new DateTime("-99-2-3")));
        __CLR4_4_119rb19rblc8azxfw.R.inc(59432);assertEquals("0000", f.print(new DateTime("0-2-3")));

        __CLR4_4_119rb19rblc8azxfw.R.inc(59433);assertEquals(2001, f.parseDateTime("2001").getYear());
        __CLR4_4_119rb19rblc8azxfw.R.inc(59434);try {
            __CLR4_4_119rb19rblc8azxfw.R.inc(59435);f.parseDateTime("-2001");
            __CLR4_4_119rb19rblc8azxfw.R.inc(59436);fail();
        } catch (IllegalArgumentException e) {
        }
        __CLR4_4_119rb19rblc8azxfw.R.inc(59437);try {
            __CLR4_4_119rb19rblc8azxfw.R.inc(59438);f.parseDateTime("200");
            __CLR4_4_119rb19rblc8azxfw.R.inc(59439);fail();
        } catch (IllegalArgumentException e) {
        }
        __CLR4_4_119rb19rblc8azxfw.R.inc(59440);try {
            __CLR4_4_119rb19rblc8azxfw.R.inc(59441);f.parseDateTime("20016");
            __CLR4_4_119rb19rblc8azxfw.R.inc(59442);fail();
        } catch (IllegalArgumentException e) {
        }

        __CLR4_4_119rb19rblc8azxfw.R.inc(59443);bld = new DateTimeFormatterBuilder();
        __CLR4_4_119rb19rblc8azxfw.R.inc(59444);bld.appendFixedDecimal(DateTimeFieldType.hourOfDay(), 2);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59445);bld.appendLiteral(':');
        __CLR4_4_119rb19rblc8azxfw.R.inc(59446);bld.appendFixedDecimal(DateTimeFieldType.minuteOfHour(), 2);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59447);bld.appendLiteral(':');
        __CLR4_4_119rb19rblc8azxfw.R.inc(59448);bld.appendFixedDecimal(DateTimeFieldType.secondOfMinute(), 2);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59449);f = bld.toFormatter();

        __CLR4_4_119rb19rblc8azxfw.R.inc(59450);assertEquals("01:02:34", f.print(new DateTime("T1:2:34")));

        __CLR4_4_119rb19rblc8azxfw.R.inc(59451);DateTime dt = f.parseDateTime("01:02:34");
        __CLR4_4_119rb19rblc8azxfw.R.inc(59452);assertEquals(1, dt.getHourOfDay());
        __CLR4_4_119rb19rblc8azxfw.R.inc(59453);assertEquals(2, dt.getMinuteOfHour());
        __CLR4_4_119rb19rblc8azxfw.R.inc(59454);assertEquals(34, dt.getSecondOfMinute());

        __CLR4_4_119rb19rblc8azxfw.R.inc(59455);try {
            __CLR4_4_119rb19rblc8azxfw.R.inc(59456);f.parseDateTime("0145:02:34");
            __CLR4_4_119rb19rblc8azxfw.R.inc(59457);fail();
        } catch (IllegalArgumentException e) {
        }
        __CLR4_4_119rb19rblc8azxfw.R.inc(59458);try {
            __CLR4_4_119rb19rblc8azxfw.R.inc(59459);f.parseDateTime("01:0:34");
            __CLR4_4_119rb19rblc8azxfw.R.inc(59460);fail();
        } catch (IllegalArgumentException e) {
        }
    }finally{__CLR4_4_119rb19rblc8azxfw.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_appendFixedSignedDecimal() {__CLR4_4_119rb19rblc8azxfw.R.globalSliceStart(getClass().getName(),59461);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ceg5f519vp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119rb19rblc8azxfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_119rb19rblc8azxfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_appendFixedSignedDecimal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59461,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ceg5f519vp(){try{__CLR4_4_119rb19rblc8azxfw.R.inc(59461);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59462);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        __CLR4_4_119rb19rblc8azxfw.R.inc(59463);bld.appendFixedSignedDecimal(DateTimeFieldType.year(), 4);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59464);DateTimeFormatter f = bld.toFormatter();

        __CLR4_4_119rb19rblc8azxfw.R.inc(59465);assertEquals("2007", f.print(new DateTime("2007-01-01")));
        __CLR4_4_119rb19rblc8azxfw.R.inc(59466);assertEquals("0123", f.print(new DateTime("123-01-01")));
        __CLR4_4_119rb19rblc8azxfw.R.inc(59467);assertEquals("0001", f.print(new DateTime("1-2-3")));
        __CLR4_4_119rb19rblc8azxfw.R.inc(59468);assertEquals("99999", f.print(new DateTime("99999-2-3")));
        __CLR4_4_119rb19rblc8azxfw.R.inc(59469);assertEquals("-0099", f.print(new DateTime("-99-2-3")));
        __CLR4_4_119rb19rblc8azxfw.R.inc(59470);assertEquals("0000", f.print(new DateTime("0-2-3")));

        __CLR4_4_119rb19rblc8azxfw.R.inc(59471);assertEquals(2001, f.parseDateTime("2001").getYear());
        __CLR4_4_119rb19rblc8azxfw.R.inc(59472);assertEquals(-2001, f.parseDateTime("-2001").getYear());
        __CLR4_4_119rb19rblc8azxfw.R.inc(59473);assertEquals(2001, f.parseDateTime("+2001").getYear());
        __CLR4_4_119rb19rblc8azxfw.R.inc(59474);try {
            __CLR4_4_119rb19rblc8azxfw.R.inc(59475);f.parseDateTime("20016");
            __CLR4_4_119rb19rblc8azxfw.R.inc(59476);fail();
        } catch (IllegalArgumentException e) {
        }
    }finally{__CLR4_4_119rb19rblc8azxfw.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_appendTimeZoneId() {__CLR4_4_119rb19rblc8azxfw.R.globalSliceStart(getClass().getName(),59477);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s232ny19w5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119rb19rblc8azxfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_119rb19rblc8azxfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_appendTimeZoneId",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59477,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s232ny19w5(){try{__CLR4_4_119rb19rblc8azxfw.R.inc(59477);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59478);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        __CLR4_4_119rb19rblc8azxfw.R.inc(59479);bld.appendTimeZoneId();
        __CLR4_4_119rb19rblc8azxfw.R.inc(59480);DateTimeFormatter f = bld.toFormatter();
        
        __CLR4_4_119rb19rblc8azxfw.R.inc(59481);assertEquals("Asia/Tokyo", f.print(new DateTime(2007, 3, 4, 0, 0, 0, TOKYO)));
        __CLR4_4_119rb19rblc8azxfw.R.inc(59482);assertEquals(TOKYO, f.parseDateTime("Asia/Tokyo").getZone());
        __CLR4_4_119rb19rblc8azxfw.R.inc(59483);try {
            __CLR4_4_119rb19rblc8azxfw.R.inc(59484);f.parseDateTime("Nonsense");
            __CLR4_4_119rb19rblc8azxfw.R.inc(59485);fail();
        } catch (IllegalArgumentException e) {
        }
    }finally{__CLR4_4_119rb19rblc8azxfw.R.flushNeeded();}}

    public void test_printParseZoneTokyo() {__CLR4_4_119rb19rblc8azxfw.R.globalSliceStart(getClass().getName(),59486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mglxpq19we();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119rb19rblc8azxfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_119rb19rblc8azxfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseZoneTokyo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59486,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mglxpq19we(){try{__CLR4_4_119rb19rblc8azxfw.R.inc(59486);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59487);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
            .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneId();
        __CLR4_4_119rb19rblc8azxfw.R.inc(59488);DateTimeFormatter f = bld.toFormatter();
        
        __CLR4_4_119rb19rblc8azxfw.R.inc(59489);DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, TOKYO);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59490);assertEquals("2007-03-04 12:30 Asia/Tokyo", f.print(dt));
        __CLR4_4_119rb19rblc8azxfw.R.inc(59491);assertEquals(dt, f.parseDateTime("2007-03-04 12:30 Asia/Tokyo"));
    }finally{__CLR4_4_119rb19rblc8azxfw.R.flushNeeded();}}

    public void test_printParseZoneParis() {__CLR4_4_119rb19rblc8azxfw.R.globalSliceStart(getClass().getName(),59492);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bw8ewj19wk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119rb19rblc8azxfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_119rb19rblc8azxfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseZoneParis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59492,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bw8ewj19wk(){try{__CLR4_4_119rb19rblc8azxfw.R.inc(59492);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59493);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
            .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneId();
        __CLR4_4_119rb19rblc8azxfw.R.inc(59494);DateTimeFormatter f = bld.toFormatter();
        
        __CLR4_4_119rb19rblc8azxfw.R.inc(59495);DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, PARIS);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59496);assertEquals("2007-03-04 12:30 Europe/Paris", f.print(dt));
        __CLR4_4_119rb19rblc8azxfw.R.inc(59497);assertEquals(dt, f.parseDateTime("2007-03-04 12:30 Europe/Paris"));
        __CLR4_4_119rb19rblc8azxfw.R.inc(59498);assertEquals(dt, f.withOffsetParsed().parseDateTime("2007-03-04 12:30 Europe/Paris"));
    }finally{__CLR4_4_119rb19rblc8azxfw.R.flushNeeded();}}

    public void test_printParseZoneDawsonCreek() {__CLR4_4_119rb19rblc8azxfw.R.globalSliceStart(getClass().getName(),59499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fp5d7w19wr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119rb19rblc8azxfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_119rb19rblc8azxfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseZoneDawsonCreek",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59499,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fp5d7w19wr(){try{__CLR4_4_119rb19rblc8azxfw.R.inc(59499);  // clashes with shorter Dawson
        __CLR4_4_119rb19rblc8azxfw.R.inc(59500);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
            .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneId();
        __CLR4_4_119rb19rblc8azxfw.R.inc(59501);DateTimeFormatter f = bld.toFormatter();
        
        __CLR4_4_119rb19rblc8azxfw.R.inc(59502);DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forID("America/Dawson_Creek"));
        __CLR4_4_119rb19rblc8azxfw.R.inc(59503);assertEquals("2007-03-04 12:30 America/Dawson_Creek", f.print(dt));
        __CLR4_4_119rb19rblc8azxfw.R.inc(59504);assertEquals(dt, f.parseDateTime("2007-03-04 12:30 America/Dawson_Creek"));
    }finally{__CLR4_4_119rb19rblc8azxfw.R.flushNeeded();}}

    public void test_printParseZoneBahiaBanderas() {__CLR4_4_119rb19rblc8azxfw.R.globalSliceStart(getClass().getName(),59505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fln2t919wx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119rb19rblc8azxfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_119rb19rblc8azxfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseZoneBahiaBanderas",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59505,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fln2t919wx(){try{__CLR4_4_119rb19rblc8azxfw.R.inc(59505);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59506);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
            .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneId();
        __CLR4_4_119rb19rblc8azxfw.R.inc(59507);DateTimeFormatter f = bld.toFormatter();
        
        __CLR4_4_119rb19rblc8azxfw.R.inc(59508);DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forID("America/Bahia_Banderas"));
        __CLR4_4_119rb19rblc8azxfw.R.inc(59509);assertEquals("2007-03-04 12:30 America/Bahia_Banderas", f.print(dt));
        __CLR4_4_119rb19rblc8azxfw.R.inc(59510);assertEquals(dt, f.parseDateTime("2007-03-04 12:30 America/Bahia_Banderas"));
    }finally{__CLR4_4_119rb19rblc8azxfw.R.flushNeeded();}}

    public void test_printParseOffset() {__CLR4_4_119rb19rblc8azxfw.R.globalSliceStart(getClass().getName(),59511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11xsi4t19x3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119rb19rblc8azxfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_119rb19rblc8azxfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseOffset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59511,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11xsi4t19x3(){try{__CLR4_4_119rb19rblc8azxfw.R.inc(59511);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59512);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
            .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneOffset("Z", true, 2, 2);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59513);DateTimeFormatter f = bld.toFormatter();
        
        __CLR4_4_119rb19rblc8azxfw.R.inc(59514);DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, TOKYO);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59515);assertEquals("2007-03-04 12:30 +09:00", f.print(dt));
        __CLR4_4_119rb19rblc8azxfw.R.inc(59516);assertEquals(dt.withZone(DateTimeZone.getDefault()), f.parseDateTime("2007-03-04 12:30 +09:00"));
        __CLR4_4_119rb19rblc8azxfw.R.inc(59517);assertEquals(dt, f.withZone(TOKYO).parseDateTime("2007-03-04 12:30 +09:00"));
        __CLR4_4_119rb19rblc8azxfw.R.inc(59518);assertEquals(dt.withZone(DateTimeZone.forOffsetHours(9)), f.withOffsetParsed().parseDateTime("2007-03-04 12:30 +09:00"));
    }finally{__CLR4_4_119rb19rblc8azxfw.R.flushNeeded();}}

    public void test_printParseOffsetAndZone() {__CLR4_4_119rb19rblc8azxfw.R.globalSliceStart(getClass().getName(),59519);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1adw95o19xb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119rb19rblc8azxfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_119rb19rblc8azxfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseOffsetAndZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59519,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1adw95o19xb(){try{__CLR4_4_119rb19rblc8azxfw.R.inc(59519);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59520);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
            .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneOffset("Z", true, 2, 2).appendLiteral(' ').appendTimeZoneId();
        __CLR4_4_119rb19rblc8azxfw.R.inc(59521);DateTimeFormatter f = bld.toFormatter();
        
        __CLR4_4_119rb19rblc8azxfw.R.inc(59522);DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, TOKYO);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59523);assertEquals("2007-03-04 12:30 +09:00 Asia/Tokyo", f.print(dt));
        __CLR4_4_119rb19rblc8azxfw.R.inc(59524);assertEquals(dt, f.withZone(TOKYO).parseDateTime("2007-03-04 12:30 +09:00 Asia/Tokyo"));
        __CLR4_4_119rb19rblc8azxfw.R.inc(59525);assertEquals(dt.withZone(PARIS), f.withZone(PARIS).parseDateTime("2007-03-04 12:30 +09:00 Asia/Tokyo"));
        __CLR4_4_119rb19rblc8azxfw.R.inc(59526);assertEquals(dt.withZone(DateTimeZone.forOffsetHours(9)), f.withOffsetParsed().parseDateTime("2007-03-04 12:30 +09:00 Asia/Tokyo"));
    }finally{__CLR4_4_119rb19rblc8azxfw.R.flushNeeded();}}

    public void test_parseWrongOffset() {__CLR4_4_119rb19rblc8azxfw.R.globalSliceStart(getClass().getName(),59527);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rpbt3519xj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119rb19rblc8azxfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_119rb19rblc8azxfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_parseWrongOffset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59527,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rpbt3519xj(){try{__CLR4_4_119rb19rblc8azxfw.R.inc(59527);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59528);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
            .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneOffset("Z", true, 2, 2);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59529);DateTimeFormatter f = bld.toFormatter();
        
        __CLR4_4_119rb19rblc8azxfw.R.inc(59530);DateTime expected = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forOffsetHours(7));
        // parses offset time then adjusts to requested zone
        __CLR4_4_119rb19rblc8azxfw.R.inc(59531);assertEquals(expected.withZone(TOKYO), f.withZone(TOKYO).parseDateTime("2007-03-04 12:30 +07:00"));
        // parses offset time returning offset zone
        __CLR4_4_119rb19rblc8azxfw.R.inc(59532);assertEquals(expected, f.withOffsetParsed().parseDateTime("2007-03-04 12:30 +07:00"));
        // parses offset time then converts to default zone
        __CLR4_4_119rb19rblc8azxfw.R.inc(59533);assertEquals(expected.withZone(DateTimeZone.getDefault()), f.parseDateTime("2007-03-04 12:30 +07:00"));
    }finally{__CLR4_4_119rb19rblc8azxfw.R.flushNeeded();}}

    public void test_parseWrongOffsetAndZone() {__CLR4_4_119rb19rblc8azxfw.R.globalSliceStart(getClass().getName(),59534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jn5u6o19xq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119rb19rblc8azxfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_119rb19rblc8azxfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_parseWrongOffsetAndZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59534,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jn5u6o19xq(){try{__CLR4_4_119rb19rblc8azxfw.R.inc(59534);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59535);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
            .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneOffset("Z", true, 2, 2).appendLiteral(' ').appendTimeZoneId();
        __CLR4_4_119rb19rblc8azxfw.R.inc(59536);DateTimeFormatter f = bld.toFormatter();
        
        __CLR4_4_119rb19rblc8azxfw.R.inc(59537);DateTime expected = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forOffsetHours(7));
        // parses offset time then adjusts to parsed zone
        __CLR4_4_119rb19rblc8azxfw.R.inc(59538);assertEquals(expected.withZone(TOKYO), f.parseDateTime("2007-03-04 12:30 +07:00 Asia/Tokyo"));
        // parses offset time then adjusts to requested zone
        __CLR4_4_119rb19rblc8azxfw.R.inc(59539);assertEquals(expected.withZone(TOKYO), f.withZone(TOKYO).parseDateTime("2007-03-04 12:30 +07:00 Asia/Tokyo"));
        // parses offset time returning offset zone (ignores zone)
        __CLR4_4_119rb19rblc8azxfw.R.inc(59540);assertEquals(expected, f.withOffsetParsed().parseDateTime("2007-03-04 12:30 +07:00 Asia/Tokyo"));
    }finally{__CLR4_4_119rb19rblc8azxfw.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_localPrintParseZoneTokyo() {__CLR4_4_119rb19rblc8azxfw.R.globalSliceStart(getClass().getName(),59541);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14xu0bn19xx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119rb19rblc8azxfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_119rb19rblc8azxfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_localPrintParseZoneTokyo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59541,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14xu0bn19xx(){try{__CLR4_4_119rb19rblc8azxfw.R.inc(59541);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59542);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
            .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneId();
        __CLR4_4_119rb19rblc8azxfw.R.inc(59543);DateTimeFormatter f = bld.toFormatter();
        
        __CLR4_4_119rb19rblc8azxfw.R.inc(59544);DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, TOKYO);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59545);assertEquals("2007-03-04 12:30 Asia/Tokyo", f.print(dt));
        
        __CLR4_4_119rb19rblc8azxfw.R.inc(59546);LocalDateTime expected = new LocalDateTime(2007, 3, 4, 12, 30);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59547);assertEquals(expected, f.parseLocalDateTime("2007-03-04 12:30 Asia/Tokyo"));
    }finally{__CLR4_4_119rb19rblc8azxfw.R.flushNeeded();}}

    public void test_localPrintParseOffset() {__CLR4_4_119rb19rblc8azxfw.R.globalSliceStart(getClass().getName(),59548);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w12zpa19y4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119rb19rblc8azxfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_119rb19rblc8azxfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_localPrintParseOffset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59548,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w12zpa19y4(){try{__CLR4_4_119rb19rblc8azxfw.R.inc(59548);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59549);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
            .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneOffset("Z", true, 2, 2);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59550);DateTimeFormatter f = bld.toFormatter();
        
        __CLR4_4_119rb19rblc8azxfw.R.inc(59551);DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, TOKYO);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59552);assertEquals("2007-03-04 12:30 +09:00", f.print(dt));
        
        __CLR4_4_119rb19rblc8azxfw.R.inc(59553);LocalDateTime expected = new LocalDateTime(2007, 3, 4, 12, 30);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59554);assertEquals(expected, f.parseLocalDateTime("2007-03-04 12:30 +09:00"));
        __CLR4_4_119rb19rblc8azxfw.R.inc(59555);assertEquals(expected, f.withZone(TOKYO).parseLocalDateTime("2007-03-04 12:30 +09:00"));
        __CLR4_4_119rb19rblc8azxfw.R.inc(59556);assertEquals(expected, f.withOffsetParsed().parseLocalDateTime("2007-03-04 12:30 +09:00"));
    }finally{__CLR4_4_119rb19rblc8azxfw.R.flushNeeded();}}

    public void test_localPrintParseOffsetAndZone() {__CLR4_4_119rb19rblc8azxfw.R.globalSliceStart(getClass().getName(),59557);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pq8j6b19yd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119rb19rblc8azxfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_119rb19rblc8azxfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_localPrintParseOffsetAndZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59557,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pq8j6b19yd(){try{__CLR4_4_119rb19rblc8azxfw.R.inc(59557);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59558);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
            .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneOffset("Z", true, 2, 2).appendLiteral(' ').appendTimeZoneId();
        __CLR4_4_119rb19rblc8azxfw.R.inc(59559);DateTimeFormatter f = bld.toFormatter();
        
        __CLR4_4_119rb19rblc8azxfw.R.inc(59560);DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, TOKYO);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59561);assertEquals("2007-03-04 12:30 +09:00 Asia/Tokyo", f.print(dt));
        
        __CLR4_4_119rb19rblc8azxfw.R.inc(59562);LocalDateTime expected = new LocalDateTime(2007, 3, 4, 12, 30);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59563);assertEquals(expected, f.withZone(TOKYO).parseLocalDateTime("2007-03-04 12:30 +09:00 Asia/Tokyo"));
        __CLR4_4_119rb19rblc8azxfw.R.inc(59564);assertEquals(expected, f.withZone(PARIS).parseLocalDateTime("2007-03-04 12:30 +09:00 Asia/Tokyo"));
    }finally{__CLR4_4_119rb19rblc8azxfw.R.flushNeeded();}}

    public void test_localParseWrongOffsetAndZone() {__CLR4_4_119rb19rblc8azxfw.R.globalSliceStart(getClass().getName(),59565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ggyy5b19yl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119rb19rblc8azxfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_119rb19rblc8azxfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_localParseWrongOffsetAndZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59565,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ggyy5b19yl(){try{__CLR4_4_119rb19rblc8azxfw.R.inc(59565);
        __CLR4_4_119rb19rblc8azxfw.R.inc(59566);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
            .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneOffset("Z", true, 2, 2).appendLiteral(' ').appendTimeZoneId();
        __CLR4_4_119rb19rblc8azxfw.R.inc(59567);DateTimeFormatter f = bld.toFormatter();
        
        __CLR4_4_119rb19rblc8azxfw.R.inc(59568);LocalDateTime expected = new LocalDateTime(2007, 3, 4, 12, 30);
        // parses offset time then adjusts to parsed zone
        __CLR4_4_119rb19rblc8azxfw.R.inc(59569);assertEquals(expected, f.parseLocalDateTime("2007-03-04 12:30 +07:00 Asia/Tokyo"));
        // parses offset time then adjusts to requested zone
        __CLR4_4_119rb19rblc8azxfw.R.inc(59570);assertEquals(expected, f.withZone(TOKYO).parseLocalDateTime("2007-03-04 12:30 +07:00 Asia/Tokyo"));
        // parses offset time returning offset zone (ignores zone)
        __CLR4_4_119rb19rblc8azxfw.R.inc(59571);assertEquals(expected, f.withOffsetParsed().parseLocalDateTime("2007-03-04 12:30 +07:00 Asia/Tokyo"));
    }finally{__CLR4_4_119rb19rblc8azxfw.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void test_printParseShortName() {__CLR4_4_119rb19rblc8azxfw.R.globalSliceStart(getClass().getName(),59572);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f3p2g519ys();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119rb19rblc8azxfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_119rb19rblc8azxfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseShortName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59572,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f3p2g519ys(){try{__CLR4_4_119rb19rblc8azxfw.R.inc(59572);}finally{__CLR4_4_119rb19rblc8azxfw.R.flushNeeded();}}
// Defects4J: flaky method
//     public void test_printParseShortName() {
//         DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
//             .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneShortName();
//         DateTimeFormatter f = bld.toFormatter().withLocale(Locale.ENGLISH);
//         
//         assertEquals(true, f.isPrinter());
//         assertEquals(false, f.isParser());
//         DateTime dt1 = new DateTime(2011, 1, 4, 12, 30, 0, LONDON);
//         assertEquals("2011-01-04 12:30 GMT", f.print(dt1));
//         DateTime dt2 = new DateTime(2011, 7, 4, 12, 30, 0, LONDON);
//         assertEquals("2011-07-04 12:30 BST", f.print(dt2));
//         try {
//             f.parseDateTime("2007-03-04 12:30 GMT");
//             fail();
//         } catch (UnsupportedOperationException e) {
//         }
//     }

    public void test_printParseShortNameWithLookup() {__CLR4_4_119rb19rblc8azxfw.R.globalSliceStart(getClass().getName(),59573);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q627919yt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119rb19rblc8azxfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_119rb19rblc8azxfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseShortNameWithLookup",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59573,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q627919yt(){try{__CLR4_4_119rb19rblc8azxfw.R.inc(59573);}finally{__CLR4_4_119rb19rblc8azxfw.R.flushNeeded();}}
// Defects4J: flaky method
//     public void test_printParseShortNameWithLookup() {
//         Map<String, DateTimeZone> lookup = new LinkedHashMap<String, DateTimeZone>();
//         lookup.put("GMT", LONDON);
//         lookup.put("BST", LONDON);
//         DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
//             .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneShortName(lookup);
//         DateTimeFormatter f = bld.toFormatter().withLocale(Locale.ENGLISH);
//         
//         assertEquals(true, f.isPrinter());
//         assertEquals(true, f.isParser());
//         DateTime dt1 = new DateTime(2011, 1, 4, 12, 30, 0, LONDON);
//         assertEquals("2011-01-04 12:30 GMT", f.print(dt1));
//         DateTime dt2 = new DateTime(2011, 7, 4, 12, 30, 0, LONDON);
//         assertEquals("2011-07-04 12:30 BST", f.print(dt2));
//         
//         assertEquals(dt1, f.parseDateTime("2011-01-04 12:30 GMT"));
//         assertEquals(dt2, f.parseDateTime("2011-07-04 12:30 BST"));
//         try {
//             f.parseDateTime("2007-03-04 12:30 EST");
//             fail();
//         } catch (IllegalArgumentException e) {
//         }
//     }

    public void test_printParseShortNameWithAutoLookup() {__CLR4_4_119rb19rblc8azxfw.R.globalSliceStart(getClass().getName(),59574);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o6ya5y19yu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119rb19rblc8azxfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_119rb19rblc8azxfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseShortNameWithAutoLookup",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59574,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o6ya5y19yu(){try{__CLR4_4_119rb19rblc8azxfw.R.inc(59574);}finally{__CLR4_4_119rb19rblc8azxfw.R.flushNeeded();}}
// Defects4J: flaky method
//     public void test_printParseShortNameWithAutoLookup() {
//         DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
//             .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneShortName(null);
//         DateTimeFormatter f = bld.toFormatter().withLocale(Locale.ENGLISH);
//         
//         assertEquals(true, f.isPrinter());
//         assertEquals(true, f.isParser());
//         DateTime dt1 = new DateTime(2011, 1, 4, 12, 30, 0, NEW_YORK);
//         assertEquals("2011-01-04 12:30 EST", f.print(dt1));
//         DateTime dt2 = new DateTime(2011, 7, 4, 12, 30, 0, NEW_YORK);
//         assertEquals("2011-07-04 12:30 EDT", f.print(dt2));
//         DateTime dt3 = new DateTime(2011, 1, 4, 12, 30, 0, LOS_ANGELES);
//         assertEquals("2011-01-04 12:30 PST", f.print(dt3));
//         DateTime dt4 = new DateTime(2011, 7, 4, 12, 30, 0, LOS_ANGELES);
//         assertEquals("2011-07-04 12:30 PDT", f.print(dt4));
//         DateTime dt5 = new DateTime(2011, 7, 4, 12, 30, 0, DateTimeZone.UTC);
//         assertEquals("2011-07-04 12:30 UTC", f.print(dt5));
//         
//         assertEquals(dt1.getZone() + " " + f.parseDateTime("2011-01-04 12:30 EST").getZone(), dt1, f.parseDateTime("2011-01-04 12:30 EST"));
//         assertEquals(dt2, f.parseDateTime("2011-07-04 12:30 EDT"));
//         assertEquals(dt3, f.parseDateTime("2011-01-04 12:30 PST"));
//         assertEquals(dt4, f.parseDateTime("2011-07-04 12:30 PDT"));
//         assertEquals(dt5, f.parseDateTime("2011-07-04 12:30 UT"));
//         assertEquals(dt5, f.parseDateTime("2011-07-04 12:30 UTC"));
//         try {
//             f.parseDateTime("2007-03-04 12:30 PPP");
//             fail();
//         } catch (IllegalArgumentException e) {
//         }
//     }

    //-----------------------------------------------------------------------
    public void test_printParseLongName() {__CLR4_4_119rb19rblc8azxfw.R.globalSliceStart(getClass().getName(),59575);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mmzuht19yv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119rb19rblc8azxfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_119rb19rblc8azxfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseLongName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59575,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mmzuht19yv(){try{__CLR4_4_119rb19rblc8azxfw.R.inc(59575);}finally{__CLR4_4_119rb19rblc8azxfw.R.flushNeeded();}}
// Defects4J: flaky method
//     public void test_printParseLongName() {
//         DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
//             .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneName();
//         DateTimeFormatter f = bld.toFormatter().withLocale(Locale.ENGLISH);
//         
//         assertEquals(true, f.isPrinter());
//         assertEquals(false, f.isParser());
//         DateTime dt1 = new DateTime(2011, 1, 4, 12, 30, 0, LONDON);
//         assertEquals("2011-01-04 12:30 Greenwich Mean Time", f.print(dt1));
//         DateTime dt2 = new DateTime(2011, 7, 4, 12, 30, 0, LONDON);
//         assertEquals("2011-07-04 12:30 British Summer Time", f.print(dt2));
//         try {
//             f.parseDateTime("2007-03-04 12:30 GMT");
//             fail();
//         } catch (UnsupportedOperationException e) {
//         }
//     }

    public void test_printParseLongNameWithLookup() {__CLR4_4_119rb19rblc8azxfw.R.globalSliceStart(getClass().getName(),59576);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qc43mn19yw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119rb19rblc8azxfw.R.rethrow($CLV_t2$);}finally{__CLR4_4_119rb19rblc8azxfw.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseLongNameWithLookup",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59576,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qc43mn19yw(){try{__CLR4_4_119rb19rblc8azxfw.R.inc(59576);}finally{__CLR4_4_119rb19rblc8azxfw.R.flushNeeded();}}
// Defects4J: flaky method
//     public void test_printParseLongNameWithLookup() {
//         Map<String, DateTimeZone> lookup = new LinkedHashMap<String, DateTimeZone>();
//         lookup.put("Greenwich Mean Time", LONDON);
//         lookup.put("British Summer Time", LONDON);
//         DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
//             .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneName(lookup);
//         DateTimeFormatter f = bld.toFormatter().withLocale(Locale.ENGLISH);
//         
//         assertEquals(true, f.isPrinter());
//         assertEquals(true, f.isParser());
//         DateTime dt1 = new DateTime(2011, 1, 4, 12, 30, 0, LONDON);
//         assertEquals("2011-01-04 12:30 Greenwich Mean Time", f.print(dt1));
//         DateTime dt2 = new DateTime(2011, 7, 4, 12, 30, 0, LONDON);
//         assertEquals("2011-07-04 12:30 British Summer Time", f.print(dt2));
//         
//         assertEquals(dt1, f.parseDateTime("2011-01-04 12:30 Greenwich Mean Time"));
//         assertEquals(dt2, f.parseDateTime("2011-07-04 12:30 British Summer Time"));
//         try {
//             f.parseDateTime("2007-03-04 12:30 EST");
//             fail();
//         } catch (IllegalArgumentException e) {
//         }
//     }

}
