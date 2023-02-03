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

import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;

/**
 * This class is a Junit unit test for YearMonthDay.
 *
 * @author Stephen Colebourne
 */
public class TestLocalDate_Properties extends TestCase {static class __CLR4_4_1qhjqhjlc8azvfo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,34697,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);

    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    private long TEST_TIME1 =
        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 12L * DateTimeConstants.MILLIS_PER_HOUR
        + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private long TEST_TIME2 =
        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 14L * DateTimeConstants.MILLIS_PER_HOUR
        + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone zone = null;

    private Locale systemDefaultLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1qhjqhjlc8azvfo.R.inc(34327);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34328);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1qhjqhjlc8azvfo.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1qhjqhjlc8azvfo.R.inc(34329);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34330);return new TestSuite(TestLocalDate_Properties.class);
    }finally{__CLR4_4_1qhjqhjlc8azvfo.R.flushNeeded();}}

    public TestLocalDate_Properties(String name) {
        super(name);__CLR4_4_1qhjqhjlc8azvfo.R.inc(34332);try{__CLR4_4_1qhjqhjlc8azvfo.R.inc(34331);
    }finally{__CLR4_4_1qhjqhjlc8azvfo.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1qhjqhjlc8azvfo.R.inc(34333);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34334);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34335);zone = DateTimeZone.getDefault();
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34336);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34337);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34338);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1qhjqhjlc8azvfo.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1qhjqhjlc8azvfo.R.inc(34339);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34340);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34341);DateTimeZone.setDefault(zone);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34342);zone = null;
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34343);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34344);systemDefaultLocale = null;
    }finally{__CLR4_4_1qhjqhjlc8azvfo.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetYear() {__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceStart(getClass().getName(),34345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tgqcqbqi1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhjqhjlc8azvfo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyGetYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34345,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tgqcqbqi1(){try{__CLR4_4_1qhjqhjlc8azvfo.R.inc(34345);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34346);LocalDate test = new LocalDate(1972, 6, 9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34347);assertSame(test.getChronology().year(), test.year().getField());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34348);assertEquals("year", test.year().getName());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34349);assertEquals("Property[year]", test.year().toString());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34350);assertSame(test, test.year().getLocalDate());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34351);assertEquals(1972, test.year().get());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34352);assertEquals("1972", test.year().getAsString());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34353);assertEquals("1972", test.year().getAsText());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34354);assertEquals("1972", test.year().getAsText(Locale.FRENCH));
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34355);assertEquals("1972", test.year().getAsShortText());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34356);assertEquals("1972", test.year().getAsShortText(Locale.FRENCH));
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34357);assertEquals(test.getChronology().years(), test.year().getDurationField());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34358);assertEquals(null, test.year().getRangeDurationField());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34359);assertEquals(9, test.year().getMaximumTextLength(null));
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34360);assertEquals(9, test.year().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1qhjqhjlc8azvfo.R.flushNeeded();}}

    public void testPropertyGetMaxMinValuesYear() {__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceStart(getClass().getName(),34361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12r9x9fqih();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhjqhjlc8azvfo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyGetMaxMinValuesYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34361,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12r9x9fqih(){try{__CLR4_4_1qhjqhjlc8azvfo.R.inc(34361);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34362);LocalDate test = new LocalDate(1972, 6, 9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34363);assertEquals(-292275054, test.year().getMinimumValue());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34364);assertEquals(-292275054, test.year().getMinimumValueOverall());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34365);assertEquals(292278993, test.year().getMaximumValue());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34366);assertEquals(292278993, test.year().getMaximumValueOverall());
    }finally{__CLR4_4_1qhjqhjlc8azvfo.R.flushNeeded();}}

    public void testPropertyAddToCopyYear() {__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceStart(getClass().getName(),34367);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cpejciqin();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhjqhjlc8azvfo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyAddToCopyYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34367,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cpejciqin(){try{__CLR4_4_1qhjqhjlc8azvfo.R.inc(34367);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34368);LocalDate test = new LocalDate(1972, 6, 9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34369);LocalDate copy = test.year().addToCopy(9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34370);check(test, 1972, 6, 9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34371);check(copy, 1981, 6, 9);
        
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34372);copy = test.year().addToCopy(0);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34373);check(copy, 1972, 6, 9);
        
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34374);copy = test.year().addToCopy(292278993 - 1972);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34375);check(copy, 292278993, 6, 9);
        
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34376);try {
            __CLR4_4_1qhjqhjlc8azvfo.R.inc(34377);test.year().addToCopy(292278993 - 1972 + 1);
            __CLR4_4_1qhjqhjlc8azvfo.R.inc(34378);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34379);check(test, 1972, 6, 9);
        
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34380);copy = test.year().addToCopy(-1972);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34381);check(copy, 0, 6, 9);
        
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34382);copy = test.year().addToCopy(-1973);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34383);check(copy, -1, 6, 9);
        
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34384);try {
            __CLR4_4_1qhjqhjlc8azvfo.R.inc(34385);test.year().addToCopy(-292275054 - 1972 - 1);
            __CLR4_4_1qhjqhjlc8azvfo.R.inc(34386);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34387);check(test, 1972, 6, 9);
    }finally{__CLR4_4_1qhjqhjlc8azvfo.R.flushNeeded();}}

    public void testPropertyAddWrapFieldToCopyYear() {__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceStart(getClass().getName(),34388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1osemkqqj8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhjqhjlc8azvfo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyAddWrapFieldToCopyYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34388,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1osemkqqj8(){try{__CLR4_4_1qhjqhjlc8azvfo.R.inc(34388);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34389);LocalDate test = new LocalDate(1972, 6, 9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34390);LocalDate copy = test.year().addWrapFieldToCopy(9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34391);check(test, 1972, 6, 9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34392);check(copy, 1981, 6, 9);
        
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34393);copy = test.year().addWrapFieldToCopy(0);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34394);check(copy, 1972, 6, 9);
        
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34395);copy = test.year().addWrapFieldToCopy(292278993 - 1972 + 1);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34396);check(copy, -292275054, 6, 9);
        
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34397);copy = test.year().addWrapFieldToCopy(-292275054 - 1972 - 1);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34398);check(copy, 292278993, 6, 9);
    }finally{__CLR4_4_1qhjqhjlc8azvfo.R.flushNeeded();}}

    public void testPropertySetCopyYear() {__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceStart(getClass().getName(),34399);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12egg3wqjj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhjqhjlc8azvfo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertySetCopyYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34399,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12egg3wqjj(){try{__CLR4_4_1qhjqhjlc8azvfo.R.inc(34399);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34400);LocalDate test = new LocalDate(1972, 6, 9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34401);LocalDate copy = test.year().setCopy(12);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34402);check(test, 1972, 6, 9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34403);check(copy, 12, 6, 9);
    }finally{__CLR4_4_1qhjqhjlc8azvfo.R.flushNeeded();}}

    public void testPropertySetCopyTextYear() {__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceStart(getClass().getName(),34404);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iwaee7qjo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhjqhjlc8azvfo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertySetCopyTextYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34404,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iwaee7qjo(){try{__CLR4_4_1qhjqhjlc8azvfo.R.inc(34404);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34405);LocalDate test = new LocalDate(1972, 6, 9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34406);LocalDate copy = test.year().setCopy("12");
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34407);check(test, 1972, 6, 9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34408);check(copy, 12, 6, 9);
    }finally{__CLR4_4_1qhjqhjlc8azvfo.R.flushNeeded();}}

    public void testPropertyCompareToYear() {__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceStart(getClass().getName(),34409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ft7abqjt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhjqhjlc8azvfo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyCompareToYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34409,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ft7abqjt(){try{__CLR4_4_1qhjqhjlc8azvfo.R.inc(34409);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34410);LocalDate test1 = new LocalDate(TEST_TIME1);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34411);LocalDate test2 = new LocalDate(TEST_TIME2);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34412);assertEquals(true, test1.year().compareTo(test2) < 0);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34413);assertEquals(true, test2.year().compareTo(test1) > 0);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34414);assertEquals(true, test1.year().compareTo(test1) == 0);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34415);try {
            __CLR4_4_1qhjqhjlc8azvfo.R.inc(34416);test1.year().compareTo((ReadablePartial) null);
            __CLR4_4_1qhjqhjlc8azvfo.R.inc(34417);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34418);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34419);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34420);assertEquals(true, test1.year().compareTo(dt2) < 0);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34421);assertEquals(true, test2.year().compareTo(dt1) > 0);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34422);assertEquals(true, test1.year().compareTo(dt1) == 0);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34423);try {
            __CLR4_4_1qhjqhjlc8azvfo.R.inc(34424);test1.year().compareTo((ReadableInstant) null);
            __CLR4_4_1qhjqhjlc8azvfo.R.inc(34425);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1qhjqhjlc8azvfo.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetMonth() {__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceStart(getClass().getName(),34426);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ox6q20qka();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhjqhjlc8azvfo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyGetMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34426,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ox6q20qka(){try{__CLR4_4_1qhjqhjlc8azvfo.R.inc(34426);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34427);LocalDate test = new LocalDate(1972, 6, 9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34428);assertSame(test.getChronology().monthOfYear(), test.monthOfYear().getField());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34429);assertEquals("monthOfYear", test.monthOfYear().getName());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34430);assertEquals("Property[monthOfYear]", test.monthOfYear().toString());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34431);assertSame(test, test.monthOfYear().getLocalDate());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34432);assertEquals(6, test.monthOfYear().get());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34433);assertEquals("6", test.monthOfYear().getAsString());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34434);assertEquals("June", test.monthOfYear().getAsText());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34435);assertEquals("juin", test.monthOfYear().getAsText(Locale.FRENCH));
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34436);assertEquals("Jun", test.monthOfYear().getAsShortText());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34437);assertEquals("juin", test.monthOfYear().getAsShortText(Locale.FRENCH));
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34438);assertEquals(test.getChronology().months(), test.monthOfYear().getDurationField());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34439);assertEquals(test.getChronology().years(), test.monthOfYear().getRangeDurationField());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34440);assertEquals(9, test.monthOfYear().getMaximumTextLength(null));
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34441);assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null));
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34442);test = new LocalDate(1972, 7, 9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34443);assertEquals("juillet", test.monthOfYear().getAsText(Locale.FRENCH));
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34444);assertEquals("juil.", test.monthOfYear().getAsShortText(Locale.FRENCH));
    }finally{__CLR4_4_1qhjqhjlc8azvfo.R.flushNeeded();}}

    public void testPropertyGetMaxMinValuesMonth() {__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceStart(getClass().getName(),34445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gzdw8qkt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhjqhjlc8azvfo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyGetMaxMinValuesMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34445,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gzdw8qkt(){try{__CLR4_4_1qhjqhjlc8azvfo.R.inc(34445);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34446);LocalDate test = new LocalDate(1972, 6, 9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34447);assertEquals(1, test.monthOfYear().getMinimumValue());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34448);assertEquals(1, test.monthOfYear().getMinimumValueOverall());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34449);assertEquals(12, test.monthOfYear().getMaximumValue());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34450);assertEquals(12, test.monthOfYear().getMaximumValueOverall());
    }finally{__CLR4_4_1qhjqhjlc8azvfo.R.flushNeeded();}}

    public void testPropertyAddToCopyMonth() {__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceStart(getClass().getName(),34451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hdqp25qkz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhjqhjlc8azvfo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyAddToCopyMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34451,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hdqp25qkz(){try{__CLR4_4_1qhjqhjlc8azvfo.R.inc(34451);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34452);LocalDate test = new LocalDate(1972, 6, 9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34453);LocalDate copy = test.monthOfYear().addToCopy(6);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34454);check(test, 1972, 6, 9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34455);check(copy, 1972, 12, 9);
        
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34456);copy = test.monthOfYear().addToCopy(7);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34457);check(copy, 1973, 1, 9);
        
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34458);copy = test.monthOfYear().addToCopy(-5);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34459);check(copy, 1972, 1, 9);
        
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34460);copy = test.monthOfYear().addToCopy(-6);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34461);check(copy, 1971, 12, 9);
        
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34462);test = new LocalDate(1972, 1, 31);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34463);copy = test.monthOfYear().addToCopy(1);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34464);check(copy, 1972, 2, 29);
        
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34465);copy = test.monthOfYear().addToCopy(2);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34466);check(copy, 1972, 3, 31);
        
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34467);copy = test.monthOfYear().addToCopy(3);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34468);check(copy, 1972, 4, 30);
        
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34469);test = new LocalDate(1971, 1, 31);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34470);copy = test.monthOfYear().addToCopy(1);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34471);check(copy, 1971, 2, 28);
    }finally{__CLR4_4_1qhjqhjlc8azvfo.R.flushNeeded();}}

    public void testPropertyAddWrapFieldToCopyMonth() {__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceStart(getClass().getName(),34472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rt24wvqlk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhjqhjlc8azvfo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyAddWrapFieldToCopyMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34472,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rt24wvqlk(){try{__CLR4_4_1qhjqhjlc8azvfo.R.inc(34472);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34473);LocalDate test = new LocalDate(1972, 6, 9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34474);LocalDate copy = test.monthOfYear().addWrapFieldToCopy(4);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34475);check(test, 1972, 6, 9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34476);check(copy, 1972, 10, 9);
        
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34477);copy = test.monthOfYear().addWrapFieldToCopy(8);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34478);check(copy, 1972, 2, 9);
        
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34479);copy = test.monthOfYear().addWrapFieldToCopy(-8);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34480);check(copy, 1972, 10, 9);
        
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34481);test = new LocalDate(1972, 1, 31);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34482);copy = test.monthOfYear().addWrapFieldToCopy(1);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34483);check(copy, 1972, 2, 29);
        
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34484);copy = test.monthOfYear().addWrapFieldToCopy(2);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34485);check(copy, 1972, 3, 31);
        
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34486);copy = test.monthOfYear().addWrapFieldToCopy(3);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34487);check(copy, 1972, 4, 30);
        
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34488);test = new LocalDate(1971, 1, 31);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34489);copy = test.monthOfYear().addWrapFieldToCopy(1);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34490);check(copy, 1971, 2, 28);
    }finally{__CLR4_4_1qhjqhjlc8azvfo.R.flushNeeded();}}

    public void testPropertySetCopyMonth() {__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceStart(getClass().getName(),34491);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1icgsehqm3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhjqhjlc8azvfo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertySetCopyMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34491,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1icgsehqm3(){try{__CLR4_4_1qhjqhjlc8azvfo.R.inc(34491);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34492);LocalDate test = new LocalDate(1972, 6, 9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34493);LocalDate copy = test.monthOfYear().setCopy(12);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34494);check(test, 1972, 6, 9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34495);check(copy, 1972, 12, 9);
        
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34496);test = new LocalDate(1972, 1, 31);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34497);copy = test.monthOfYear().setCopy(2);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34498);check(copy, 1972, 2, 29);
        
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34499);try {
            __CLR4_4_1qhjqhjlc8azvfo.R.inc(34500);test.monthOfYear().setCopy(13);
            __CLR4_4_1qhjqhjlc8azvfo.R.inc(34501);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34502);try {
            __CLR4_4_1qhjqhjlc8azvfo.R.inc(34503);test.monthOfYear().setCopy(0);
            __CLR4_4_1qhjqhjlc8azvfo.R.inc(34504);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1qhjqhjlc8azvfo.R.flushNeeded();}}

    public void testPropertySetCopyTextMonth() {__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceStart(getClass().getName(),34505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1whgxg6qmh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhjqhjlc8azvfo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertySetCopyTextMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34505,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1whgxg6qmh(){try{__CLR4_4_1qhjqhjlc8azvfo.R.inc(34505);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34506);LocalDate test = new LocalDate(1972, 6, 9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34507);LocalDate copy = test.monthOfYear().setCopy("12");
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34508);check(test, 1972, 6, 9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34509);check(copy, 1972, 12, 9);
        
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34510);copy = test.monthOfYear().setCopy("December");
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34511);check(test, 1972, 6, 9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34512);check(copy, 1972, 12, 9);
        
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34513);copy = test.monthOfYear().setCopy("Dec");
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34514);check(test, 1972, 6, 9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34515);check(copy, 1972, 12, 9);
    }finally{__CLR4_4_1qhjqhjlc8azvfo.R.flushNeeded();}}

    public void testPropertyCompareToMonth() {__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceStart(getClass().getName(),34516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sjk8wiqms();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhjqhjlc8azvfo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyCompareToMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34516,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sjk8wiqms(){try{__CLR4_4_1qhjqhjlc8azvfo.R.inc(34516);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34517);LocalDate test1 = new LocalDate(TEST_TIME1);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34518);LocalDate test2 = new LocalDate(TEST_TIME2);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34519);assertEquals(true, test1.monthOfYear().compareTo(test2) < 0);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34520);assertEquals(true, test2.monthOfYear().compareTo(test1) > 0);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34521);assertEquals(true, test1.monthOfYear().compareTo(test1) == 0);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34522);try {
            __CLR4_4_1qhjqhjlc8azvfo.R.inc(34523);test1.monthOfYear().compareTo((ReadablePartial) null);
            __CLR4_4_1qhjqhjlc8azvfo.R.inc(34524);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34525);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34526);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34527);assertEquals(true, test1.monthOfYear().compareTo(dt2) < 0);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34528);assertEquals(true, test2.monthOfYear().compareTo(dt1) > 0);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34529);assertEquals(true, test1.monthOfYear().compareTo(dt1) == 0);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34530);try {
            __CLR4_4_1qhjqhjlc8azvfo.R.inc(34531);test1.monthOfYear().compareTo((ReadableInstant) null);
            __CLR4_4_1qhjqhjlc8azvfo.R.inc(34532);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1qhjqhjlc8azvfo.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetDay() {__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceStart(getClass().getName(),34533);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1akcm7oqn9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhjqhjlc8azvfo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyGetDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34533,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1akcm7oqn9(){try{__CLR4_4_1qhjqhjlc8azvfo.R.inc(34533);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34534);LocalDate test = new LocalDate(1972, 6, 9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34535);assertSame(test.getChronology().dayOfMonth(), test.dayOfMonth().getField());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34536);assertEquals("dayOfMonth", test.dayOfMonth().getName());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34537);assertEquals("Property[dayOfMonth]", test.dayOfMonth().toString());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34538);assertSame(test, test.dayOfMonth().getLocalDate());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34539);assertEquals(9, test.dayOfMonth().get());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34540);assertEquals("9", test.dayOfMonth().getAsString());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34541);assertEquals("9", test.dayOfMonth().getAsText());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34542);assertEquals("9", test.dayOfMonth().getAsText(Locale.FRENCH));
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34543);assertEquals("9", test.dayOfMonth().getAsShortText());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34544);assertEquals("9", test.dayOfMonth().getAsShortText(Locale.FRENCH));
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34545);assertEquals(test.getChronology().days(), test.dayOfMonth().getDurationField());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34546);assertEquals(test.getChronology().months(), test.dayOfMonth().getRangeDurationField());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34547);assertEquals(2, test.dayOfMonth().getMaximumTextLength(null));
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34548);assertEquals(2, test.dayOfMonth().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1qhjqhjlc8azvfo.R.flushNeeded();}}

    public void testPropertyGetMaxMinValuesDay() {__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceStart(getClass().getName(),34549);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_141l7p8qnp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhjqhjlc8azvfo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyGetMaxMinValuesDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34549,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_141l7p8qnp(){try{__CLR4_4_1qhjqhjlc8azvfo.R.inc(34549);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34550);LocalDate test = new LocalDate(1972, 6, 9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34551);assertEquals(1, test.dayOfMonth().getMinimumValue());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34552);assertEquals(1, test.dayOfMonth().getMinimumValueOverall());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34553);assertEquals(30, test.dayOfMonth().getMaximumValue());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34554);assertEquals(31, test.dayOfMonth().getMaximumValueOverall());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34555);test = new LocalDate(1972, 7, 9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34556);assertEquals(31, test.dayOfMonth().getMaximumValue());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34557);test = new LocalDate(1972, 2, 9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34558);assertEquals(29, test.dayOfMonth().getMaximumValue());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34559);test = new LocalDate(1971, 2, 9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34560);assertEquals(28, test.dayOfMonth().getMaximumValue());
    }finally{__CLR4_4_1qhjqhjlc8azvfo.R.flushNeeded();}}

    public void testPropertyAddToCopyDay() {__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceStart(getClass().getName(),34561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rja0s9qo1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhjqhjlc8azvfo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyAddToCopyDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34561,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rja0s9qo1(){try{__CLR4_4_1qhjqhjlc8azvfo.R.inc(34561);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34562);LocalDate test = new LocalDate(1972, 6, 9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34563);LocalDate copy = test.dayOfMonth().addToCopy(9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34564);check(test, 1972, 6, 9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34565);check(copy, 1972, 6, 18);
        
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34566);copy = test.dayOfMonth().addToCopy(21);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34567);check(copy, 1972, 6, 30);
        
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34568);copy = test.dayOfMonth().addToCopy(22);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34569);check(copy, 1972, 7, 1);
        
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34570);copy = test.dayOfMonth().addToCopy(22 + 30);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34571);check(copy, 1972, 7, 31);
        
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34572);copy = test.dayOfMonth().addToCopy(22 + 31);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34573);check(copy, 1972, 8, 1);

        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34574);copy = test.dayOfMonth().addToCopy(21 + 31 + 31 + 30 + 31 + 30 + 31);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34575);check(copy, 1972, 12, 31);
        
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34576);copy = test.dayOfMonth().addToCopy(22 + 31 + 31 + 30 + 31 + 30 + 31);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34577);check(copy, 1973, 1, 1);
        
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34578);copy = test.dayOfMonth().addToCopy(-8);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34579);check(copy, 1972, 6, 1);
        
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34580);copy = test.dayOfMonth().addToCopy(-9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34581);check(copy, 1972, 5, 31);
        
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34582);copy = test.dayOfMonth().addToCopy(-8 - 31 - 30 - 31 - 29 - 31);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34583);check(copy, 1972, 1, 1);
        
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34584);copy = test.dayOfMonth().addToCopy(-9 - 31 - 30 - 31 - 29 - 31);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34585);check(copy, 1971, 12, 31);
    }finally{__CLR4_4_1qhjqhjlc8azvfo.R.flushNeeded();}}

    public void testPropertyAddWrapFieldToCopyDay() {__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceStart(getClass().getName(),34586);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qgbzr1qoq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhjqhjlc8azvfo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyAddWrapFieldToCopyDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34586,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qgbzr1qoq(){try{__CLR4_4_1qhjqhjlc8azvfo.R.inc(34586);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34587);LocalDate test = new LocalDate(1972, 6, 9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34588);LocalDate copy = test.dayOfMonth().addWrapFieldToCopy(21);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34589);check(test, 1972, 6, 9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34590);check(copy, 1972, 6, 30);
        
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34591);copy = test.dayOfMonth().addWrapFieldToCopy(22);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34592);check(copy, 1972, 6, 1);
        
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34593);copy = test.dayOfMonth().addWrapFieldToCopy(-12);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34594);check(copy, 1972, 6, 27);
        
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34595);test = new LocalDate(1972, 7, 9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34596);copy = test.dayOfMonth().addWrapFieldToCopy(21);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34597);check(copy, 1972, 7, 30);
    
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34598);copy = test.dayOfMonth().addWrapFieldToCopy(22);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34599);check(copy, 1972, 7, 31);
    
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34600);copy = test.dayOfMonth().addWrapFieldToCopy(23);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34601);check(copy, 1972, 7, 1);
    
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34602);copy = test.dayOfMonth().addWrapFieldToCopy(-12);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34603);check(copy, 1972, 7, 28);
    }finally{__CLR4_4_1qhjqhjlc8azvfo.R.flushNeeded();}}

    public void testPropertySetCopyDay() {__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceStart(getClass().getName(),34604);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b31jxpqp8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhjqhjlc8azvfo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertySetCopyDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34604,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b31jxpqp8(){try{__CLR4_4_1qhjqhjlc8azvfo.R.inc(34604);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34605);LocalDate test = new LocalDate(1972, 6, 9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34606);LocalDate copy = test.dayOfMonth().setCopy(12);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34607);check(test, 1972, 6, 9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34608);check(copy, 1972, 6, 12);
        
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34609);try {
            __CLR4_4_1qhjqhjlc8azvfo.R.inc(34610);test.dayOfMonth().setCopy(31);
            __CLR4_4_1qhjqhjlc8azvfo.R.inc(34611);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34612);try {
            __CLR4_4_1qhjqhjlc8azvfo.R.inc(34613);test.dayOfMonth().setCopy(0);
            __CLR4_4_1qhjqhjlc8azvfo.R.inc(34614);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1qhjqhjlc8azvfo.R.flushNeeded();}}

    public void testPropertySetCopyTextDay() {__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceStart(getClass().getName(),34615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ty3ke2qpj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhjqhjlc8azvfo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertySetCopyTextDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34615,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ty3ke2qpj(){try{__CLR4_4_1qhjqhjlc8azvfo.R.inc(34615);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34616);LocalDate test = new LocalDate(1972, 6, 9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34617);LocalDate copy = test.dayOfMonth().setCopy("12");
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34618);check(test, 1972, 6, 9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34619);check(copy, 1972, 6, 12);
    }finally{__CLR4_4_1qhjqhjlc8azvfo.R.flushNeeded();}}

    public void testPropertyWithMaximumValueDayOfMonth() {__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceStart(getClass().getName(),34620);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2wa9eqpo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhjqhjlc8azvfo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyWithMaximumValueDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34620,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2wa9eqpo(){try{__CLR4_4_1qhjqhjlc8azvfo.R.inc(34620);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34621);LocalDate test = new LocalDate(1972, 6, 9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34622);LocalDate copy = test.dayOfMonth().withMaximumValue();
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34623);check(test, 1972, 6, 9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34624);check(copy, 1972, 6, 30);
    }finally{__CLR4_4_1qhjqhjlc8azvfo.R.flushNeeded();}}

    public void testPropertyWithMinimumValueDayOfMonth() {__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceStart(getClass().getName(),34625);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1duofekqpt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhjqhjlc8azvfo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyWithMinimumValueDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34625,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1duofekqpt(){try{__CLR4_4_1qhjqhjlc8azvfo.R.inc(34625);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34626);LocalDate test = new LocalDate(1972, 6, 9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34627);LocalDate copy = test.dayOfMonth().withMinimumValue();
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34628);check(test, 1972, 6, 9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34629);check(copy, 1972, 6, 1);
    }finally{__CLR4_4_1qhjqhjlc8azvfo.R.flushNeeded();}}

    public void testPropertyCompareToDay() {__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceStart(getClass().getName(),34630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19lmfreqpy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhjqhjlc8azvfo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyCompareToDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34630,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19lmfreqpy(){try{__CLR4_4_1qhjqhjlc8azvfo.R.inc(34630);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34631);LocalDate test1 = new LocalDate(TEST_TIME1);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34632);LocalDate test2 = new LocalDate(TEST_TIME2);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34633);assertEquals(true, test1.dayOfMonth().compareTo(test2) < 0);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34634);assertEquals(true, test2.dayOfMonth().compareTo(test1) > 0);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34635);assertEquals(true, test1.dayOfMonth().compareTo(test1) == 0);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34636);try {
            __CLR4_4_1qhjqhjlc8azvfo.R.inc(34637);test1.dayOfMonth().compareTo((ReadablePartial) null);
            __CLR4_4_1qhjqhjlc8azvfo.R.inc(34638);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34639);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34640);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34641);assertEquals(true, test1.dayOfMonth().compareTo(dt2) < 0);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34642);assertEquals(true, test2.dayOfMonth().compareTo(dt1) > 0);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34643);assertEquals(true, test1.dayOfMonth().compareTo(dt1) == 0);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34644);try {
            __CLR4_4_1qhjqhjlc8azvfo.R.inc(34645);test1.dayOfMonth().compareTo((ReadableInstant) null);
            __CLR4_4_1qhjqhjlc8azvfo.R.inc(34646);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1qhjqhjlc8azvfo.R.flushNeeded();}}

    public void testPropertyEquals() {__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceStart(getClass().getName(),34647);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2ub0zqqf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhjqhjlc8azvfo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34647,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2ub0zqqf(){try{__CLR4_4_1qhjqhjlc8azvfo.R.inc(34647);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34648);LocalDate test1 = new LocalDate(2005, 11, 8);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34649);LocalDate test2 = new LocalDate(2005, 11, 9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34650);LocalDate test3 = new LocalDate(2005, 11, 8, CopticChronology.getInstanceUTC());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34651);assertEquals(false, test1.dayOfMonth().equals(test1.year()));
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34652);assertEquals(false, test1.dayOfMonth().equals(test1.monthOfYear()));
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34653);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34654);assertEquals(false, test1.dayOfMonth().equals(test2.year()));
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34655);assertEquals(false, test1.dayOfMonth().equals(test2.monthOfYear()));
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34656);assertEquals(false, test1.dayOfMonth().equals(test2.dayOfMonth()));
        
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34657);assertEquals(false, test1.monthOfYear().equals(test1.year()));
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34658);assertEquals(true, test1.monthOfYear().equals(test1.monthOfYear()));
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34659);assertEquals(false, test1.monthOfYear().equals(test1.dayOfMonth()));
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34660);assertEquals(false, test1.monthOfYear().equals(test2.year()));
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34661);assertEquals(true, test1.monthOfYear().equals(test2.monthOfYear()));
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34662);assertEquals(false, test1.monthOfYear().equals(test2.dayOfMonth()));
        
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34663);assertEquals(false, test1.dayOfMonth().equals(null));
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34664);assertEquals(false, test1.dayOfMonth().equals("any"));
        
        // chrono
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34665);assertEquals(false, test1.dayOfMonth().equals(test3.dayOfMonth()));
    }finally{__CLR4_4_1qhjqhjlc8azvfo.R.flushNeeded();}}

    public void testPropertyHashCode() {__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceStart(getClass().getName(),34666);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y278s7qqy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhjqhjlc8azvfo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34666,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y278s7qqy(){try{__CLR4_4_1qhjqhjlc8azvfo.R.inc(34666);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34667);LocalDate test1 = new LocalDate(2005, 11, 8);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34668);LocalDate test2 = new LocalDate(2005, 11, 9);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34669);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34670);assertEquals(false, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34671);assertEquals(true, test1.monthOfYear().hashCode() == test1.monthOfYear().hashCode());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34672);assertEquals(true, test1.monthOfYear().hashCode() == test2.monthOfYear().hashCode());
    }finally{__CLR4_4_1qhjqhjlc8azvfo.R.flushNeeded();}}

    public void testPropertyEqualsHashCodeLenient() {__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceStart(getClass().getName(),34673);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xoanxfqr5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhjqhjlc8azvfo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyEqualsHashCodeLenient",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34673,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xoanxfqr5(){try{__CLR4_4_1qhjqhjlc8azvfo.R.inc(34673);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34674);LocalDate test1 = new LocalDate(1970, 6, 9, LenientChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34675);LocalDate test2 = new LocalDate(1970, 6, 9, LenientChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34676);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth()));
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34677);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34678);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34679);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth()));
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34680);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34681);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34682);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
    }finally{__CLR4_4_1qhjqhjlc8azvfo.R.flushNeeded();}}

    public void testPropertyEqualsHashCodeStrict() {__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceStart(getClass().getName(),34683);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ev6icvqrf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qhjqhjlc8azvfo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qhjqhjlc8azvfo.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Properties.testPropertyEqualsHashCodeStrict",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34683,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ev6icvqrf(){try{__CLR4_4_1qhjqhjlc8azvfo.R.inc(34683);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34684);LocalDate test1 = new LocalDate(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34685);LocalDate test2 = new LocalDate(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34686);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth()));
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34687);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34688);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34689);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth()));
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34690);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34691);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34692);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
    }finally{__CLR4_4_1qhjqhjlc8azvfo.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void check(LocalDate test, int year, int month, int day) {try{__CLR4_4_1qhjqhjlc8azvfo.R.inc(34693);
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34694);assertEquals(year, test.getYear());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34695);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1qhjqhjlc8azvfo.R.inc(34696);assertEquals(day, test.getDayOfMonth());
    }finally{__CLR4_4_1qhjqhjlc8azvfo.R.flushNeeded();}}
}
