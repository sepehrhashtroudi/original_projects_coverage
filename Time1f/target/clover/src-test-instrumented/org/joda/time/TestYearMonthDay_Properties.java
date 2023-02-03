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
@SuppressWarnings("deprecation")
public class TestYearMonthDay_Properties extends TestCase {static class __CLR4_4_111jd11jdlc8azwge{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,49022,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_111jd11jdlc8azwge.R.inc(48649);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48650);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_111jd11jdlc8azwge.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_111jd11jdlc8azwge.R.inc(48651);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48652);return new TestSuite(TestYearMonthDay_Properties.class);
    }finally{__CLR4_4_111jd11jdlc8azwge.R.flushNeeded();}}

    public TestYearMonthDay_Properties(String name) {
        super(name);__CLR4_4_111jd11jdlc8azwge.R.inc(48654);try{__CLR4_4_111jd11jdlc8azwge.R.inc(48653);
    }finally{__CLR4_4_111jd11jdlc8azwge.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_111jd11jdlc8azwge.R.inc(48655);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48656);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48657);zone = DateTimeZone.getDefault();
        __CLR4_4_111jd11jdlc8azwge.R.inc(48658);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48659);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_111jd11jdlc8azwge.R.inc(48660);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_111jd11jdlc8azwge.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_111jd11jdlc8azwge.R.inc(48661);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48662);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_111jd11jdlc8azwge.R.inc(48663);DateTimeZone.setDefault(zone);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48664);zone = null;
        __CLR4_4_111jd11jdlc8azwge.R.inc(48665);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48666);systemDefaultLocale = null;
    }finally{__CLR4_4_111jd11jdlc8azwge.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetYear() {__CLR4_4_111jd11jdlc8azwge.R.globalSliceStart(getClass().getName(),48667);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tgqcqb11jv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111jd11jdlc8azwge.R.rethrow($CLV_t2$);}finally{__CLR4_4_111jd11jdlc8azwge.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyGetYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48667,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tgqcqb11jv(){try{__CLR4_4_111jd11jdlc8azwge.R.inc(48667);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48668);YearMonthDay test = new YearMonthDay(1972, 6, 9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48669);assertSame(test.getChronology().year(), test.year().getField());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48670);assertEquals("year", test.year().getName());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48671);assertEquals("Property[year]", test.year().toString());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48672);assertSame(test, test.year().getReadablePartial());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48673);assertSame(test, test.year().getYearMonthDay());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48674);assertEquals(1972, test.year().get());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48675);assertEquals("1972", test.year().getAsString());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48676);assertEquals("1972", test.year().getAsText());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48677);assertEquals("1972", test.year().getAsText(Locale.FRENCH));
        __CLR4_4_111jd11jdlc8azwge.R.inc(48678);assertEquals("1972", test.year().getAsShortText());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48679);assertEquals("1972", test.year().getAsShortText(Locale.FRENCH));
        __CLR4_4_111jd11jdlc8azwge.R.inc(48680);assertEquals(test.getChronology().years(), test.year().getDurationField());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48681);assertEquals(null, test.year().getRangeDurationField());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48682);assertEquals(9, test.year().getMaximumTextLength(null));
        __CLR4_4_111jd11jdlc8azwge.R.inc(48683);assertEquals(9, test.year().getMaximumShortTextLength(null));
    }finally{__CLR4_4_111jd11jdlc8azwge.R.flushNeeded();}}

    public void testPropertyGetMaxMinValuesYear() {__CLR4_4_111jd11jdlc8azwge.R.globalSliceStart(getClass().getName(),48684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12r9x9f11kc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111jd11jdlc8azwge.R.rethrow($CLV_t2$);}finally{__CLR4_4_111jd11jdlc8azwge.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyGetMaxMinValuesYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48684,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12r9x9f11kc(){try{__CLR4_4_111jd11jdlc8azwge.R.inc(48684);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48685);YearMonthDay test = new YearMonthDay(1972, 6, 9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48686);assertEquals(-292275054, test.year().getMinimumValue());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48687);assertEquals(-292275054, test.year().getMinimumValueOverall());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48688);assertEquals(292278993, test.year().getMaximumValue());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48689);assertEquals(292278993, test.year().getMaximumValueOverall());
    }finally{__CLR4_4_111jd11jdlc8azwge.R.flushNeeded();}}

    public void testPropertyAddYear() {__CLR4_4_111jd11jdlc8azwge.R.globalSliceStart(getClass().getName(),48690);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c0tefy11ki();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111jd11jdlc8azwge.R.rethrow($CLV_t2$);}finally{__CLR4_4_111jd11jdlc8azwge.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyAddYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48690,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c0tefy11ki(){try{__CLR4_4_111jd11jdlc8azwge.R.inc(48690);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48691);YearMonthDay test = new YearMonthDay(1972, 6, 9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48692);YearMonthDay copy = test.year().addToCopy(9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48693);check(test, 1972, 6, 9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48694);check(copy, 1981, 6, 9);
        
        __CLR4_4_111jd11jdlc8azwge.R.inc(48695);copy = test.year().addToCopy(0);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48696);check(copy, 1972, 6, 9);
        
        __CLR4_4_111jd11jdlc8azwge.R.inc(48697);copy = test.year().addToCopy(292277023 - 1972);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48698);check(copy, 292277023, 6, 9);
        
        __CLR4_4_111jd11jdlc8azwge.R.inc(48699);try {
            __CLR4_4_111jd11jdlc8azwge.R.inc(48700);test.year().addToCopy(292278993 - 1972 + 1);
            __CLR4_4_111jd11jdlc8azwge.R.inc(48701);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_111jd11jdlc8azwge.R.inc(48702);check(test, 1972, 6, 9);
        
        __CLR4_4_111jd11jdlc8azwge.R.inc(48703);copy = test.year().addToCopy(-1972);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48704);check(copy, 0, 6, 9);
        
        __CLR4_4_111jd11jdlc8azwge.R.inc(48705);copy = test.year().addToCopy(-1973);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48706);check(copy, -1, 6, 9);
        
        __CLR4_4_111jd11jdlc8azwge.R.inc(48707);try {
            __CLR4_4_111jd11jdlc8azwge.R.inc(48708);test.year().addToCopy(-292275054 - 1972 - 1);
            __CLR4_4_111jd11jdlc8azwge.R.inc(48709);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_111jd11jdlc8azwge.R.inc(48710);check(test, 1972, 6, 9);
    }finally{__CLR4_4_111jd11jdlc8azwge.R.flushNeeded();}}

    public void testPropertyAddWrapFieldYear() {__CLR4_4_111jd11jdlc8azwge.R.globalSliceStart(getClass().getName(),48711);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qjgig611l3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111jd11jdlc8azwge.R.rethrow($CLV_t2$);}finally{__CLR4_4_111jd11jdlc8azwge.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyAddWrapFieldYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48711,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qjgig611l3(){try{__CLR4_4_111jd11jdlc8azwge.R.inc(48711);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48712);YearMonthDay test = new YearMonthDay(1972, 6, 9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48713);YearMonthDay copy = test.year().addWrapFieldToCopy(9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48714);check(test, 1972, 6, 9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48715);check(copy, 1981, 6, 9);
        
        __CLR4_4_111jd11jdlc8azwge.R.inc(48716);copy = test.year().addWrapFieldToCopy(0);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48717);check(copy, 1972, 6, 9);
        
        __CLR4_4_111jd11jdlc8azwge.R.inc(48718);copy = test.year().addWrapFieldToCopy(292278993 - 1972 + 1);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48719);check(copy, -292275054, 6, 9);
        
        __CLR4_4_111jd11jdlc8azwge.R.inc(48720);copy = test.year().addWrapFieldToCopy(-292275054 - 1972 - 1);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48721);check(copy, 292278993, 6, 9);
    }finally{__CLR4_4_111jd11jdlc8azwge.R.flushNeeded();}}

    public void testPropertySetYear() {__CLR4_4_111jd11jdlc8azwge.R.globalSliceStart(getClass().getName(),48722);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b9ziwx11le();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111jd11jdlc8azwge.R.rethrow($CLV_t2$);}finally{__CLR4_4_111jd11jdlc8azwge.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertySetYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48722,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b9ziwx11le(){try{__CLR4_4_111jd11jdlc8azwge.R.inc(48722);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48723);YearMonthDay test = new YearMonthDay(1972, 6, 9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48724);YearMonthDay copy = test.year().setCopy(12);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48725);check(test, 1972, 6, 9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48726);check(copy, 12, 6, 9);
    }finally{__CLR4_4_111jd11jdlc8azwge.R.flushNeeded();}}

    public void testPropertySetTextYear() {__CLR4_4_111jd11jdlc8azwge.R.globalSliceStart(getClass().getName(),48727);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11qaw4s11lj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111jd11jdlc8azwge.R.rethrow($CLV_t2$);}finally{__CLR4_4_111jd11jdlc8azwge.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertySetTextYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48727,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11qaw4s11lj(){try{__CLR4_4_111jd11jdlc8azwge.R.inc(48727);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48728);YearMonthDay test = new YearMonthDay(1972, 6, 9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48729);YearMonthDay copy = test.year().setCopy("12");
        __CLR4_4_111jd11jdlc8azwge.R.inc(48730);check(test, 1972, 6, 9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48731);check(copy, 12, 6, 9);
    }finally{__CLR4_4_111jd11jdlc8azwge.R.flushNeeded();}}

    public void testPropertyCompareToYear() {__CLR4_4_111jd11jdlc8azwge.R.globalSliceStart(getClass().getName(),48732);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ft7ab11lo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111jd11jdlc8azwge.R.rethrow($CLV_t2$);}finally{__CLR4_4_111jd11jdlc8azwge.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyCompareToYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48732,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ft7ab11lo(){try{__CLR4_4_111jd11jdlc8azwge.R.inc(48732);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48733);YearMonthDay test1 = new YearMonthDay(TEST_TIME1);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48734);YearMonthDay test2 = new YearMonthDay(TEST_TIME2);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48735);assertEquals(true, test1.year().compareTo(test2) < 0);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48736);assertEquals(true, test2.year().compareTo(test1) > 0);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48737);assertEquals(true, test1.year().compareTo(test1) == 0);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48738);try {
            __CLR4_4_111jd11jdlc8azwge.R.inc(48739);test1.year().compareTo((ReadablePartial) null);
            __CLR4_4_111jd11jdlc8azwge.R.inc(48740);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_111jd11jdlc8azwge.R.inc(48741);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48742);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48743);assertEquals(true, test1.year().compareTo(dt2) < 0);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48744);assertEquals(true, test2.year().compareTo(dt1) > 0);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48745);assertEquals(true, test1.year().compareTo(dt1) == 0);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48746);try {
            __CLR4_4_111jd11jdlc8azwge.R.inc(48747);test1.year().compareTo((ReadableInstant) null);
            __CLR4_4_111jd11jdlc8azwge.R.inc(48748);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_111jd11jdlc8azwge.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetMonth() {__CLR4_4_111jd11jdlc8azwge.R.globalSliceStart(getClass().getName(),48749);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ox6q2011m5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111jd11jdlc8azwge.R.rethrow($CLV_t2$);}finally{__CLR4_4_111jd11jdlc8azwge.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyGetMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48749,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ox6q2011m5(){try{__CLR4_4_111jd11jdlc8azwge.R.inc(48749);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48750);YearMonthDay test = new YearMonthDay(1972, 6, 9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48751);assertSame(test.getChronology().monthOfYear(), test.monthOfYear().getField());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48752);assertEquals("monthOfYear", test.monthOfYear().getName());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48753);assertEquals("Property[monthOfYear]", test.monthOfYear().toString());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48754);assertSame(test, test.monthOfYear().getReadablePartial());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48755);assertSame(test, test.monthOfYear().getYearMonthDay());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48756);assertEquals(6, test.monthOfYear().get());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48757);assertEquals("6", test.monthOfYear().getAsString());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48758);assertEquals("June", test.monthOfYear().getAsText());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48759);assertEquals("juin", test.monthOfYear().getAsText(Locale.FRENCH));
        __CLR4_4_111jd11jdlc8azwge.R.inc(48760);assertEquals("Jun", test.monthOfYear().getAsShortText());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48761);assertEquals("juin", test.monthOfYear().getAsShortText(Locale.FRENCH));
        __CLR4_4_111jd11jdlc8azwge.R.inc(48762);assertEquals(test.getChronology().months(), test.monthOfYear().getDurationField());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48763);assertEquals(test.getChronology().years(), test.monthOfYear().getRangeDurationField());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48764);assertEquals(9, test.monthOfYear().getMaximumTextLength(null));
        __CLR4_4_111jd11jdlc8azwge.R.inc(48765);assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null));
        __CLR4_4_111jd11jdlc8azwge.R.inc(48766);test = new YearMonthDay(1972, 7, 9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48767);assertEquals("juillet", test.monthOfYear().getAsText(Locale.FRENCH));
        __CLR4_4_111jd11jdlc8azwge.R.inc(48768);assertEquals("juil.", test.monthOfYear().getAsShortText(Locale.FRENCH));
    }finally{__CLR4_4_111jd11jdlc8azwge.R.flushNeeded();}}

    public void testPropertyGetMaxMinValuesMonth() {__CLR4_4_111jd11jdlc8azwge.R.globalSliceStart(getClass().getName(),48769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gzdw811mp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111jd11jdlc8azwge.R.rethrow($CLV_t2$);}finally{__CLR4_4_111jd11jdlc8azwge.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyGetMaxMinValuesMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48769,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gzdw811mp(){try{__CLR4_4_111jd11jdlc8azwge.R.inc(48769);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48770);YearMonthDay test = new YearMonthDay(1972, 6, 9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48771);assertEquals(1, test.monthOfYear().getMinimumValue());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48772);assertEquals(1, test.monthOfYear().getMinimumValueOverall());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48773);assertEquals(12, test.monthOfYear().getMaximumValue());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48774);assertEquals(12, test.monthOfYear().getMaximumValueOverall());
    }finally{__CLR4_4_111jd11jdlc8azwge.R.flushNeeded();}}

    public void testPropertyAddMonth() {__CLR4_4_111jd11jdlc8azwge.R.globalSliceStart(getClass().getName(),48775);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12mc6tp11mv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111jd11jdlc8azwge.R.rethrow($CLV_t2$);}finally{__CLR4_4_111jd11jdlc8azwge.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyAddMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48775,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12mc6tp11mv(){try{__CLR4_4_111jd11jdlc8azwge.R.inc(48775);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48776);YearMonthDay test = new YearMonthDay(1972, 6, 9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48777);YearMonthDay copy = test.monthOfYear().addToCopy(6);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48778);check(test, 1972, 6, 9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48779);check(copy, 1972, 12, 9);
        
        __CLR4_4_111jd11jdlc8azwge.R.inc(48780);copy = test.monthOfYear().addToCopy(7);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48781);check(copy, 1973, 1, 9);
        
        __CLR4_4_111jd11jdlc8azwge.R.inc(48782);copy = test.monthOfYear().addToCopy(-5);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48783);check(copy, 1972, 1, 9);
        
        __CLR4_4_111jd11jdlc8azwge.R.inc(48784);copy = test.monthOfYear().addToCopy(-6);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48785);check(copy, 1971, 12, 9);
        
        __CLR4_4_111jd11jdlc8azwge.R.inc(48786);test = new YearMonthDay(1972, 1, 31);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48787);copy = test.monthOfYear().addToCopy(1);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48788);check(copy, 1972, 2, 29);
        
        __CLR4_4_111jd11jdlc8azwge.R.inc(48789);copy = test.monthOfYear().addToCopy(2);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48790);check(copy, 1972, 3, 31);
        
        __CLR4_4_111jd11jdlc8azwge.R.inc(48791);copy = test.monthOfYear().addToCopy(3);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48792);check(copy, 1972, 4, 30);
        
        __CLR4_4_111jd11jdlc8azwge.R.inc(48793);test = new YearMonthDay(1971, 1, 31);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48794);copy = test.monthOfYear().addToCopy(1);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48795);check(copy, 1971, 2, 28);
    }finally{__CLR4_4_111jd11jdlc8azwge.R.flushNeeded();}}

    public void testPropertyAddWrapFieldMonth() {__CLR4_4_111jd11jdlc8azwge.R.globalSliceStart(getClass().getName(),48796);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eopsr511ng();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111jd11jdlc8azwge.R.rethrow($CLV_t2$);}finally{__CLR4_4_111jd11jdlc8azwge.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyAddWrapFieldMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48796,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eopsr511ng(){try{__CLR4_4_111jd11jdlc8azwge.R.inc(48796);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48797);YearMonthDay test = new YearMonthDay(1972, 6, 9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48798);YearMonthDay copy = test.monthOfYear().addWrapFieldToCopy(4);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48799);check(test, 1972, 6, 9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48800);check(copy, 1972, 10, 9);
        
        __CLR4_4_111jd11jdlc8azwge.R.inc(48801);copy = test.monthOfYear().addWrapFieldToCopy(8);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48802);check(copy, 1972, 2, 9);
        
        __CLR4_4_111jd11jdlc8azwge.R.inc(48803);copy = test.monthOfYear().addWrapFieldToCopy(-8);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48804);check(copy, 1972, 10, 9);
        
        __CLR4_4_111jd11jdlc8azwge.R.inc(48805);test = new YearMonthDay(1972, 1, 31);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48806);copy = test.monthOfYear().addWrapFieldToCopy(1);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48807);check(copy, 1972, 2, 29);
        
        __CLR4_4_111jd11jdlc8azwge.R.inc(48808);copy = test.monthOfYear().addWrapFieldToCopy(2);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48809);check(copy, 1972, 3, 31);
        
        __CLR4_4_111jd11jdlc8azwge.R.inc(48810);copy = test.monthOfYear().addWrapFieldToCopy(3);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48811);check(copy, 1972, 4, 30);
        
        __CLR4_4_111jd11jdlc8azwge.R.inc(48812);test = new YearMonthDay(1971, 1, 31);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48813);copy = test.monthOfYear().addWrapFieldToCopy(1);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48814);check(copy, 1971, 2, 28);
    }finally{__CLR4_4_111jd11jdlc8azwge.R.flushNeeded();}}

    public void testPropertySetMonth() {__CLR4_4_111jd11jdlc8azwge.R.globalSliceStart(getClass().getName(),48815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19dfzhw11nz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111jd11jdlc8azwge.R.rethrow($CLV_t2$);}finally{__CLR4_4_111jd11jdlc8azwge.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertySetMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48815,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19dfzhw11nz(){try{__CLR4_4_111jd11jdlc8azwge.R.inc(48815);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48816);YearMonthDay test = new YearMonthDay(1972, 6, 9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48817);YearMonthDay copy = test.monthOfYear().setCopy(12);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48818);check(test, 1972, 6, 9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48819);check(copy, 1972, 12, 9);
        
        __CLR4_4_111jd11jdlc8azwge.R.inc(48820);test = new YearMonthDay(1972, 1, 31);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48821);copy = test.monthOfYear().setCopy(2);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48822);check(copy, 1972, 2, 29);
        
        __CLR4_4_111jd11jdlc8azwge.R.inc(48823);try {
            __CLR4_4_111jd11jdlc8azwge.R.inc(48824);test.monthOfYear().setCopy(13);
            __CLR4_4_111jd11jdlc8azwge.R.inc(48825);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_111jd11jdlc8azwge.R.inc(48826);try {
            __CLR4_4_111jd11jdlc8azwge.R.inc(48827);test.monthOfYear().setCopy(0);
            __CLR4_4_111jd11jdlc8azwge.R.inc(48828);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_111jd11jdlc8azwge.R.flushNeeded();}}

    public void testPropertySetTextMonth() {__CLR4_4_111jd11jdlc8azwge.R.globalSliceStart(getClass().getName(),48829);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wb5cw111od();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111jd11jdlc8azwge.R.rethrow($CLV_t2$);}finally{__CLR4_4_111jd11jdlc8azwge.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertySetTextMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48829,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wb5cw111od(){try{__CLR4_4_111jd11jdlc8azwge.R.inc(48829);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48830);YearMonthDay test = new YearMonthDay(1972, 6, 9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48831);YearMonthDay copy = test.monthOfYear().setCopy("12");
        __CLR4_4_111jd11jdlc8azwge.R.inc(48832);check(test, 1972, 6, 9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48833);check(copy, 1972, 12, 9);
        
        __CLR4_4_111jd11jdlc8azwge.R.inc(48834);copy = test.monthOfYear().setCopy("December");
        __CLR4_4_111jd11jdlc8azwge.R.inc(48835);check(test, 1972, 6, 9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48836);check(copy, 1972, 12, 9);
        
        __CLR4_4_111jd11jdlc8azwge.R.inc(48837);copy = test.monthOfYear().setCopy("Dec");
        __CLR4_4_111jd11jdlc8azwge.R.inc(48838);check(test, 1972, 6, 9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48839);check(copy, 1972, 12, 9);
    }finally{__CLR4_4_111jd11jdlc8azwge.R.flushNeeded();}}

    public void testPropertyCompareToMonth() {__CLR4_4_111jd11jdlc8azwge.R.globalSliceStart(getClass().getName(),48840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sjk8wi11oo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111jd11jdlc8azwge.R.rethrow($CLV_t2$);}finally{__CLR4_4_111jd11jdlc8azwge.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyCompareToMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48840,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sjk8wi11oo(){try{__CLR4_4_111jd11jdlc8azwge.R.inc(48840);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48841);YearMonthDay test1 = new YearMonthDay(TEST_TIME1);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48842);YearMonthDay test2 = new YearMonthDay(TEST_TIME2);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48843);assertEquals(true, test1.monthOfYear().compareTo(test2) < 0);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48844);assertEquals(true, test2.monthOfYear().compareTo(test1) > 0);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48845);assertEquals(true, test1.monthOfYear().compareTo(test1) == 0);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48846);try {
            __CLR4_4_111jd11jdlc8azwge.R.inc(48847);test1.monthOfYear().compareTo((ReadablePartial) null);
            __CLR4_4_111jd11jdlc8azwge.R.inc(48848);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_111jd11jdlc8azwge.R.inc(48849);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48850);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48851);assertEquals(true, test1.monthOfYear().compareTo(dt2) < 0);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48852);assertEquals(true, test2.monthOfYear().compareTo(dt1) > 0);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48853);assertEquals(true, test1.monthOfYear().compareTo(dt1) == 0);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48854);try {
            __CLR4_4_111jd11jdlc8azwge.R.inc(48855);test1.monthOfYear().compareTo((ReadableInstant) null);
            __CLR4_4_111jd11jdlc8azwge.R.inc(48856);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_111jd11jdlc8azwge.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetDay() {__CLR4_4_111jd11jdlc8azwge.R.globalSliceStart(getClass().getName(),48857);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1akcm7o11p5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111jd11jdlc8azwge.R.rethrow($CLV_t2$);}finally{__CLR4_4_111jd11jdlc8azwge.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyGetDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48857,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1akcm7o11p5(){try{__CLR4_4_111jd11jdlc8azwge.R.inc(48857);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48858);YearMonthDay test = new YearMonthDay(1972, 6, 9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48859);assertSame(test.getChronology().dayOfMonth(), test.dayOfMonth().getField());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48860);assertEquals("dayOfMonth", test.dayOfMonth().getName());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48861);assertEquals("Property[dayOfMonth]", test.dayOfMonth().toString());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48862);assertSame(test, test.dayOfMonth().getReadablePartial());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48863);assertSame(test, test.dayOfMonth().getYearMonthDay());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48864);assertEquals(9, test.dayOfMonth().get());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48865);assertEquals("9", test.dayOfMonth().getAsString());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48866);assertEquals("9", test.dayOfMonth().getAsText());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48867);assertEquals("9", test.dayOfMonth().getAsText(Locale.FRENCH));
        __CLR4_4_111jd11jdlc8azwge.R.inc(48868);assertEquals("9", test.dayOfMonth().getAsShortText());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48869);assertEquals("9", test.dayOfMonth().getAsShortText(Locale.FRENCH));
        __CLR4_4_111jd11jdlc8azwge.R.inc(48870);assertEquals(test.getChronology().days(), test.dayOfMonth().getDurationField());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48871);assertEquals(test.getChronology().months(), test.dayOfMonth().getRangeDurationField());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48872);assertEquals(2, test.dayOfMonth().getMaximumTextLength(null));
        __CLR4_4_111jd11jdlc8azwge.R.inc(48873);assertEquals(2, test.dayOfMonth().getMaximumShortTextLength(null));
    }finally{__CLR4_4_111jd11jdlc8azwge.R.flushNeeded();}}

    public void testPropertyGetMaxMinValuesDay() {__CLR4_4_111jd11jdlc8azwge.R.globalSliceStart(getClass().getName(),48874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_141l7p811pm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111jd11jdlc8azwge.R.rethrow($CLV_t2$);}finally{__CLR4_4_111jd11jdlc8azwge.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyGetMaxMinValuesDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48874,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_141l7p811pm(){try{__CLR4_4_111jd11jdlc8azwge.R.inc(48874);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48875);YearMonthDay test = new YearMonthDay(1972, 6, 9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48876);assertEquals(1, test.dayOfMonth().getMinimumValue());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48877);assertEquals(1, test.dayOfMonth().getMinimumValueOverall());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48878);assertEquals(30, test.dayOfMonth().getMaximumValue());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48879);assertEquals(31, test.dayOfMonth().getMaximumValueOverall());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48880);test = new YearMonthDay(1972, 7, 9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48881);assertEquals(31, test.dayOfMonth().getMaximumValue());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48882);test = new YearMonthDay(1972, 2, 9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48883);assertEquals(29, test.dayOfMonth().getMaximumValue());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48884);test = new YearMonthDay(1971, 2, 9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48885);assertEquals(28, test.dayOfMonth().getMaximumValue());
    }finally{__CLR4_4_111jd11jdlc8azwge.R.flushNeeded();}}

    public void testPropertyAddDay() {__CLR4_4_111jd11jdlc8azwge.R.globalSliceStart(getClass().getName(),48886);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_134mrvt11py();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111jd11jdlc8azwge.R.rethrow($CLV_t2$);}finally{__CLR4_4_111jd11jdlc8azwge.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyAddDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48886,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_134mrvt11py(){try{__CLR4_4_111jd11jdlc8azwge.R.inc(48886);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48887);YearMonthDay test = new YearMonthDay(1972, 6, 9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48888);YearMonthDay copy = test.dayOfMonth().addToCopy(9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48889);check(test, 1972, 6, 9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48890);check(copy, 1972, 6, 18);
        
        __CLR4_4_111jd11jdlc8azwge.R.inc(48891);copy = test.dayOfMonth().addToCopy(21);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48892);check(copy, 1972, 6, 30);
        
        __CLR4_4_111jd11jdlc8azwge.R.inc(48893);copy = test.dayOfMonth().addToCopy(22);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48894);check(copy, 1972, 7, 1);
        
        __CLR4_4_111jd11jdlc8azwge.R.inc(48895);copy = test.dayOfMonth().addToCopy(22 + 30);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48896);check(copy, 1972, 7, 31);
        
        __CLR4_4_111jd11jdlc8azwge.R.inc(48897);copy = test.dayOfMonth().addToCopy(22 + 31);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48898);check(copy, 1972, 8, 1);

        __CLR4_4_111jd11jdlc8azwge.R.inc(48899);copy = test.dayOfMonth().addToCopy(21 + 31 + 31 + 30 + 31 + 30 + 31);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48900);check(copy, 1972, 12, 31);
        
        __CLR4_4_111jd11jdlc8azwge.R.inc(48901);copy = test.dayOfMonth().addToCopy(22 + 31 + 31 + 30 + 31 + 30 + 31);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48902);check(copy, 1973, 1, 1);
        
        __CLR4_4_111jd11jdlc8azwge.R.inc(48903);copy = test.dayOfMonth().addToCopy(-8);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48904);check(copy, 1972, 6, 1);
        
        __CLR4_4_111jd11jdlc8azwge.R.inc(48905);copy = test.dayOfMonth().addToCopy(-9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48906);check(copy, 1972, 5, 31);
        
        __CLR4_4_111jd11jdlc8azwge.R.inc(48907);copy = test.dayOfMonth().addToCopy(-8 - 31 - 30 - 31 - 29 - 31);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48908);check(copy, 1972, 1, 1);
        
        __CLR4_4_111jd11jdlc8azwge.R.inc(48909);copy = test.dayOfMonth().addToCopy(-9 - 31 - 30 - 31 - 29 - 31);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48910);check(copy, 1971, 12, 31);
    }finally{__CLR4_4_111jd11jdlc8azwge.R.flushNeeded();}}

    public void testPropertyAddWrapFieldDay() {__CLR4_4_111jd11jdlc8azwge.R.globalSliceStart(getClass().getName(),48911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16gtoml11qn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111jd11jdlc8azwge.R.rethrow($CLV_t2$);}finally{__CLR4_4_111jd11jdlc8azwge.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyAddWrapFieldDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48911,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16gtoml11qn(){try{__CLR4_4_111jd11jdlc8azwge.R.inc(48911);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48912);YearMonthDay test = new YearMonthDay(1972, 6, 9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48913);YearMonthDay copy = test.dayOfMonth().addWrapFieldToCopy(21);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48914);check(test, 1972, 6, 9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48915);check(copy, 1972, 6, 30);
        
        __CLR4_4_111jd11jdlc8azwge.R.inc(48916);copy = test.dayOfMonth().addWrapFieldToCopy(22);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48917);check(copy, 1972, 6, 1);
        
        __CLR4_4_111jd11jdlc8azwge.R.inc(48918);copy = test.dayOfMonth().addWrapFieldToCopy(-12);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48919);check(copy, 1972, 6, 27);
        
        __CLR4_4_111jd11jdlc8azwge.R.inc(48920);test = new YearMonthDay(1972, 7, 9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48921);copy = test.dayOfMonth().addWrapFieldToCopy(21);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48922);check(copy, 1972, 7, 30);
    
        __CLR4_4_111jd11jdlc8azwge.R.inc(48923);copy = test.dayOfMonth().addWrapFieldToCopy(22);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48924);check(copy, 1972, 7, 31);
    
        __CLR4_4_111jd11jdlc8azwge.R.inc(48925);copy = test.dayOfMonth().addWrapFieldToCopy(23);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48926);check(copy, 1972, 7, 1);
    
        __CLR4_4_111jd11jdlc8azwge.R.inc(48927);copy = test.dayOfMonth().addWrapFieldToCopy(-12);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48928);check(copy, 1972, 7, 28);
    }finally{__CLR4_4_111jd11jdlc8azwge.R.flushNeeded();}}

    public void testPropertySetDay() {__CLR4_4_111jd11jdlc8azwge.R.globalSliceStart(getClass().getName(),48929);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14hvyxk11r5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111jd11jdlc8azwge.R.rethrow($CLV_t2$);}finally{__CLR4_4_111jd11jdlc8azwge.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertySetDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48929,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14hvyxk11r5(){try{__CLR4_4_111jd11jdlc8azwge.R.inc(48929);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48930);YearMonthDay test = new YearMonthDay(1972, 6, 9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48931);YearMonthDay copy = test.dayOfMonth().setCopy(12);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48932);check(test, 1972, 6, 9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48933);check(copy, 1972, 6, 12);
        
        __CLR4_4_111jd11jdlc8azwge.R.inc(48934);try {
            __CLR4_4_111jd11jdlc8azwge.R.inc(48935);test.dayOfMonth().setCopy(31);
            __CLR4_4_111jd11jdlc8azwge.R.inc(48936);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_111jd11jdlc8azwge.R.inc(48937);try {
            __CLR4_4_111jd11jdlc8azwge.R.inc(48938);test.dayOfMonth().setCopy(0);
            __CLR4_4_111jd11jdlc8azwge.R.inc(48939);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_111jd11jdlc8azwge.R.flushNeeded();}}

    public void testPropertySetTextDay() {__CLR4_4_111jd11jdlc8azwge.R.globalSliceStart(getClass().getName(),48940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11sallx11rg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111jd11jdlc8azwge.R.rethrow($CLV_t2$);}finally{__CLR4_4_111jd11jdlc8azwge.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertySetTextDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48940,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11sallx11rg(){try{__CLR4_4_111jd11jdlc8azwge.R.inc(48940);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48941);YearMonthDay test = new YearMonthDay(1972, 6, 9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48942);YearMonthDay copy = test.dayOfMonth().setCopy("12");
        __CLR4_4_111jd11jdlc8azwge.R.inc(48943);check(test, 1972, 6, 9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48944);check(copy, 1972, 6, 12);
    }finally{__CLR4_4_111jd11jdlc8azwge.R.flushNeeded();}}

    public void testPropertyWithMaximumValueDayOfMonth() {__CLR4_4_111jd11jdlc8azwge.R.globalSliceStart(getClass().getName(),48945);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2wa9e11rl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111jd11jdlc8azwge.R.rethrow($CLV_t2$);}finally{__CLR4_4_111jd11jdlc8azwge.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyWithMaximumValueDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48945,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2wa9e11rl(){try{__CLR4_4_111jd11jdlc8azwge.R.inc(48945);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48946);YearMonthDay test = new YearMonthDay(1972, 6, 9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48947);YearMonthDay copy = test.dayOfMonth().withMaximumValue();
        __CLR4_4_111jd11jdlc8azwge.R.inc(48948);check(test, 1972, 6, 9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48949);check(copy, 1972, 6, 30);
    }finally{__CLR4_4_111jd11jdlc8azwge.R.flushNeeded();}}

    public void testPropertyWithMinimumValueDayOfMonth() {__CLR4_4_111jd11jdlc8azwge.R.globalSliceStart(getClass().getName(),48950);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1duofek11rq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111jd11jdlc8azwge.R.rethrow($CLV_t2$);}finally{__CLR4_4_111jd11jdlc8azwge.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyWithMinimumValueDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48950,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1duofek11rq(){try{__CLR4_4_111jd11jdlc8azwge.R.inc(48950);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48951);YearMonthDay test = new YearMonthDay(1972, 6, 9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48952);YearMonthDay copy = test.dayOfMonth().withMinimumValue();
        __CLR4_4_111jd11jdlc8azwge.R.inc(48953);check(test, 1972, 6, 9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48954);check(copy, 1972, 6, 1);
    }finally{__CLR4_4_111jd11jdlc8azwge.R.flushNeeded();}}

    public void testPropertyCompareToDay() {__CLR4_4_111jd11jdlc8azwge.R.globalSliceStart(getClass().getName(),48955);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19lmfre11rv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111jd11jdlc8azwge.R.rethrow($CLV_t2$);}finally{__CLR4_4_111jd11jdlc8azwge.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyCompareToDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48955,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19lmfre11rv(){try{__CLR4_4_111jd11jdlc8azwge.R.inc(48955);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48956);YearMonthDay test1 = new YearMonthDay(TEST_TIME1);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48957);YearMonthDay test2 = new YearMonthDay(TEST_TIME2);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48958);assertEquals(true, test1.dayOfMonth().compareTo(test2) < 0);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48959);assertEquals(true, test2.dayOfMonth().compareTo(test1) > 0);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48960);assertEquals(true, test1.dayOfMonth().compareTo(test1) == 0);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48961);try {
            __CLR4_4_111jd11jdlc8azwge.R.inc(48962);test1.dayOfMonth().compareTo((ReadablePartial) null);
            __CLR4_4_111jd11jdlc8azwge.R.inc(48963);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_111jd11jdlc8azwge.R.inc(48964);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48965);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48966);assertEquals(true, test1.dayOfMonth().compareTo(dt2) < 0);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48967);assertEquals(true, test2.dayOfMonth().compareTo(dt1) > 0);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48968);assertEquals(true, test1.dayOfMonth().compareTo(dt1) == 0);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48969);try {
            __CLR4_4_111jd11jdlc8azwge.R.inc(48970);test1.dayOfMonth().compareTo((ReadableInstant) null);
            __CLR4_4_111jd11jdlc8azwge.R.inc(48971);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_111jd11jdlc8azwge.R.flushNeeded();}}

    public void testPropertyEquals() {__CLR4_4_111jd11jdlc8azwge.R.globalSliceStart(getClass().getName(),48972);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2ub0z11sc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111jd11jdlc8azwge.R.rethrow($CLV_t2$);}finally{__CLR4_4_111jd11jdlc8azwge.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48972,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2ub0z11sc(){try{__CLR4_4_111jd11jdlc8azwge.R.inc(48972);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48973);YearMonthDay test1 = new YearMonthDay(2005, 11, 8);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48974);YearMonthDay test2 = new YearMonthDay(2005, 11, 9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48975);YearMonthDay test3 = new YearMonthDay(2005, 11, 8, CopticChronology.getInstanceUTC());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48976);assertEquals(false, test1.dayOfMonth().equals(test1.year()));
        __CLR4_4_111jd11jdlc8azwge.R.inc(48977);assertEquals(false, test1.dayOfMonth().equals(test1.monthOfYear()));
        __CLR4_4_111jd11jdlc8azwge.R.inc(48978);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_111jd11jdlc8azwge.R.inc(48979);assertEquals(false, test1.dayOfMonth().equals(test2.year()));
        __CLR4_4_111jd11jdlc8azwge.R.inc(48980);assertEquals(false, test1.dayOfMonth().equals(test2.monthOfYear()));
        __CLR4_4_111jd11jdlc8azwge.R.inc(48981);assertEquals(false, test1.dayOfMonth().equals(test2.dayOfMonth()));
        
        __CLR4_4_111jd11jdlc8azwge.R.inc(48982);assertEquals(false, test1.monthOfYear().equals(test1.year()));
        __CLR4_4_111jd11jdlc8azwge.R.inc(48983);assertEquals(true, test1.monthOfYear().equals(test1.monthOfYear()));
        __CLR4_4_111jd11jdlc8azwge.R.inc(48984);assertEquals(false, test1.monthOfYear().equals(test1.dayOfMonth()));
        __CLR4_4_111jd11jdlc8azwge.R.inc(48985);assertEquals(false, test1.monthOfYear().equals(test2.year()));
        __CLR4_4_111jd11jdlc8azwge.R.inc(48986);assertEquals(true, test1.monthOfYear().equals(test2.monthOfYear()));
        __CLR4_4_111jd11jdlc8azwge.R.inc(48987);assertEquals(false, test1.monthOfYear().equals(test2.dayOfMonth()));
        
        __CLR4_4_111jd11jdlc8azwge.R.inc(48988);assertEquals(false, test1.dayOfMonth().equals(null));
        __CLR4_4_111jd11jdlc8azwge.R.inc(48989);assertEquals(false, test1.dayOfMonth().equals("any"));
        
        // chrono
        __CLR4_4_111jd11jdlc8azwge.R.inc(48990);assertEquals(false, test1.dayOfMonth().equals(test3.dayOfMonth()));
    }finally{__CLR4_4_111jd11jdlc8azwge.R.flushNeeded();}}

    public void testPropertyHashCode() {__CLR4_4_111jd11jdlc8azwge.R.globalSliceStart(getClass().getName(),48991);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y278s711sv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111jd11jdlc8azwge.R.rethrow($CLV_t2$);}finally{__CLR4_4_111jd11jdlc8azwge.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48991,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y278s711sv(){try{__CLR4_4_111jd11jdlc8azwge.R.inc(48991);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48992);YearMonthDay test1 = new YearMonthDay(2005, 11, 8);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48993);YearMonthDay test2 = new YearMonthDay(2005, 11, 9);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48994);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48995);assertEquals(false, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48996);assertEquals(true, test1.monthOfYear().hashCode() == test1.monthOfYear().hashCode());
        __CLR4_4_111jd11jdlc8azwge.R.inc(48997);assertEquals(true, test1.monthOfYear().hashCode() == test2.monthOfYear().hashCode());
    }finally{__CLR4_4_111jd11jdlc8azwge.R.flushNeeded();}}

    public void testPropertyEqualsHashCodeLenient() {__CLR4_4_111jd11jdlc8azwge.R.globalSliceStart(getClass().getName(),48998);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xoanxf11t2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111jd11jdlc8azwge.R.rethrow($CLV_t2$);}finally{__CLR4_4_111jd11jdlc8azwge.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyEqualsHashCodeLenient",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),48998,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xoanxf11t2(){try{__CLR4_4_111jd11jdlc8azwge.R.inc(48998);
        __CLR4_4_111jd11jdlc8azwge.R.inc(48999);YearMonthDay test1 = new YearMonthDay(1970, 6, 9, LenientChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_111jd11jdlc8azwge.R.inc(49000);YearMonthDay test2 = new YearMonthDay(1970, 6, 9, LenientChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_111jd11jdlc8azwge.R.inc(49001);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth()));
        __CLR4_4_111jd11jdlc8azwge.R.inc(49002);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_111jd11jdlc8azwge.R.inc(49003);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_111jd11jdlc8azwge.R.inc(49004);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth()));
        __CLR4_4_111jd11jdlc8azwge.R.inc(49005);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
        __CLR4_4_111jd11jdlc8azwge.R.inc(49006);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode());
        __CLR4_4_111jd11jdlc8azwge.R.inc(49007);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
    }finally{__CLR4_4_111jd11jdlc8azwge.R.flushNeeded();}}

    public void testPropertyEqualsHashCodeStrict() {__CLR4_4_111jd11jdlc8azwge.R.globalSliceStart(getClass().getName(),49008);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ev6icv11tc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111jd11jdlc8azwge.R.rethrow($CLV_t2$);}finally{__CLR4_4_111jd11jdlc8azwge.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Properties.testPropertyEqualsHashCodeStrict",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49008,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ev6icv11tc(){try{__CLR4_4_111jd11jdlc8azwge.R.inc(49008);
        __CLR4_4_111jd11jdlc8azwge.R.inc(49009);YearMonthDay test1 = new YearMonthDay(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_111jd11jdlc8azwge.R.inc(49010);YearMonthDay test2 = new YearMonthDay(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_111jd11jdlc8azwge.R.inc(49011);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth()));
        __CLR4_4_111jd11jdlc8azwge.R.inc(49012);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_111jd11jdlc8azwge.R.inc(49013);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_111jd11jdlc8azwge.R.inc(49014);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth()));
        __CLR4_4_111jd11jdlc8azwge.R.inc(49015);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
        __CLR4_4_111jd11jdlc8azwge.R.inc(49016);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode());
        __CLR4_4_111jd11jdlc8azwge.R.inc(49017);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
    }finally{__CLR4_4_111jd11jdlc8azwge.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void check(YearMonthDay test, int year, int month, int day) {try{__CLR4_4_111jd11jdlc8azwge.R.inc(49018);
        __CLR4_4_111jd11jdlc8azwge.R.inc(49019);assertEquals(year, test.getYear());
        __CLR4_4_111jd11jdlc8azwge.R.inc(49020);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_111jd11jdlc8azwge.R.inc(49021);assertEquals(day, test.getDayOfMonth());
    }finally{__CLR4_4_111jd11jdlc8azwge.R.flushNeeded();}}
}
