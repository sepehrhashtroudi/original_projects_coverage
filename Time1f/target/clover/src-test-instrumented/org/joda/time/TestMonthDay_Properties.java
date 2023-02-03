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
package org.joda.time;

import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;

/**
 * This class is a Junit unit test for MonthDay. Based on {@link TestYearMonth_Propeties} 
 */
public class TestMonthDay_Properties extends TestCase {static class __CLR4_4_1smosmolc8azvnr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,37323,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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
    private Locale locale = null;

    public static void main(String[] args) {try{__CLR4_4_1smosmolc8azvnr.R.inc(37104);
        __CLR4_4_1smosmolc8azvnr.R.inc(37105);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1smosmolc8azvnr.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1smosmolc8azvnr.R.inc(37106);
        __CLR4_4_1smosmolc8azvnr.R.inc(37107);return new TestSuite(TestMonthDay_Properties.class);
    }finally{__CLR4_4_1smosmolc8azvnr.R.flushNeeded();}}

    public TestMonthDay_Properties(String name) {
        super(name);__CLR4_4_1smosmolc8azvnr.R.inc(37109);try{__CLR4_4_1smosmolc8azvnr.R.inc(37108);
    }finally{__CLR4_4_1smosmolc8azvnr.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1smosmolc8azvnr.R.inc(37110);
        __CLR4_4_1smosmolc8azvnr.R.inc(37111);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1smosmolc8azvnr.R.inc(37112);zone = DateTimeZone.getDefault();
        __CLR4_4_1smosmolc8azvnr.R.inc(37113);locale = Locale.getDefault();
        __CLR4_4_1smosmolc8azvnr.R.inc(37114);Locale.setDefault(Locale.UK);
        __CLR4_4_1smosmolc8azvnr.R.inc(37115);DateTimeZone.setDefault(DateTimeZone.UTC);
    }finally{__CLR4_4_1smosmolc8azvnr.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1smosmolc8azvnr.R.inc(37116);
        __CLR4_4_1smosmolc8azvnr.R.inc(37117);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1smosmolc8azvnr.R.inc(37118);DateTimeZone.setDefault(zone);
        __CLR4_4_1smosmolc8azvnr.R.inc(37119);zone = null;
        __CLR4_4_1smosmolc8azvnr.R.inc(37120);Locale.setDefault(locale);
        __CLR4_4_1smosmolc8azvnr.R.inc(37121);locale = null;
    }finally{__CLR4_4_1smosmolc8azvnr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetMonthOfYear() {__CLR4_4_1smosmolc8azvnr.R.globalSliceStart(getClass().getName(),37122);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_140q40ksn6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1smosmolc8azvnr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1smosmolc8azvnr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyGetMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37122,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_140q40ksn6(){try{__CLR4_4_1smosmolc8azvnr.R.inc(37122);
        __CLR4_4_1smosmolc8azvnr.R.inc(37123);MonthDay test = new MonthDay(9, 6);
        __CLR4_4_1smosmolc8azvnr.R.inc(37124);assertSame(test.getChronology().monthOfYear(), test.monthOfYear().getField());
        __CLR4_4_1smosmolc8azvnr.R.inc(37125);assertEquals("monthOfYear", test.monthOfYear().getName());
        __CLR4_4_1smosmolc8azvnr.R.inc(37126);assertEquals("Property[monthOfYear]", test.monthOfYear().toString());
        __CLR4_4_1smosmolc8azvnr.R.inc(37127);assertSame(test, test.monthOfYear().getReadablePartial());
        __CLR4_4_1smosmolc8azvnr.R.inc(37128);assertSame(test, test.monthOfYear().getMonthDay());
        __CLR4_4_1smosmolc8azvnr.R.inc(37129);assertEquals(9, test.monthOfYear().get());
        __CLR4_4_1smosmolc8azvnr.R.inc(37130);assertEquals("9", test.monthOfYear().getAsString());
        __CLR4_4_1smosmolc8azvnr.R.inc(37131);assertEquals("September", test.monthOfYear().getAsText());
        __CLR4_4_1smosmolc8azvnr.R.inc(37132);assertEquals("septembre", test.monthOfYear().getAsText(Locale.FRENCH));
        __CLR4_4_1smosmolc8azvnr.R.inc(37133);assertEquals("Sep", test.monthOfYear().getAsShortText());
        __CLR4_4_1smosmolc8azvnr.R.inc(37134);assertEquals("sept.", test.monthOfYear().getAsShortText(Locale.FRENCH));
        __CLR4_4_1smosmolc8azvnr.R.inc(37135);assertEquals(test.getChronology().months(), test.monthOfYear().getDurationField());
        // assertEquals(test.getChronology().days(), test.dayOfMonth().getRangeDurationField());
        __CLR4_4_1smosmolc8azvnr.R.inc(37136);assertEquals(9, test.monthOfYear().getMaximumTextLength(null));
        __CLR4_4_1smosmolc8azvnr.R.inc(37137);assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1smosmolc8azvnr.R.flushNeeded();}}

    public void testPropertyGetMaxMinValuesMonthOfYear() {__CLR4_4_1smosmolc8azvnr.R.globalSliceStart(getClass().getName(),37138);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hpcsqssnm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1smosmolc8azvnr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1smosmolc8azvnr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyGetMaxMinValuesMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37138,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hpcsqssnm(){try{__CLR4_4_1smosmolc8azvnr.R.inc(37138);
        __CLR4_4_1smosmolc8azvnr.R.inc(37139);MonthDay test = new MonthDay(10, 6);
        __CLR4_4_1smosmolc8azvnr.R.inc(37140);assertEquals(1, test.monthOfYear().getMinimumValue());
        __CLR4_4_1smosmolc8azvnr.R.inc(37141);assertEquals(1, test.monthOfYear().getMinimumValueOverall());
        __CLR4_4_1smosmolc8azvnr.R.inc(37142);assertEquals(12, test.monthOfYear().getMaximumValue());
        __CLR4_4_1smosmolc8azvnr.R.inc(37143);assertEquals(12, test.monthOfYear().getMaximumValueOverall());
    }finally{__CLR4_4_1smosmolc8azvnr.R.flushNeeded();}}

    public void testPropertyAddMonthOfYear() {__CLR4_4_1smosmolc8azvnr.R.globalSliceStart(getClass().getName(),37144);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cfd7jsns();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1smosmolc8azvnr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1smosmolc8azvnr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyAddMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37144,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cfd7jsns(){try{__CLR4_4_1smosmolc8azvnr.R.inc(37144);
        __CLR4_4_1smosmolc8azvnr.R.inc(37145);MonthDay test = new MonthDay(3, 6);
        __CLR4_4_1smosmolc8azvnr.R.inc(37146);MonthDay copy = test.monthOfYear().addToCopy(9);
        __CLR4_4_1smosmolc8azvnr.R.inc(37147);check(test, 3, 6);
        __CLR4_4_1smosmolc8azvnr.R.inc(37148);check(copy, 12, 6);
        
        __CLR4_4_1smosmolc8azvnr.R.inc(37149);copy = test.monthOfYear().addToCopy(0);
        __CLR4_4_1smosmolc8azvnr.R.inc(37150);check(copy, 3, 6);

        __CLR4_4_1smosmolc8azvnr.R.inc(37151);check(test, 3, 6);
        
        __CLR4_4_1smosmolc8azvnr.R.inc(37152);copy = test.monthOfYear().addToCopy(-3);
        __CLR4_4_1smosmolc8azvnr.R.inc(37153);check(copy, 12, 6);
        __CLR4_4_1smosmolc8azvnr.R.inc(37154);check(test, 3, 6);
    }finally{__CLR4_4_1smosmolc8azvnr.R.flushNeeded();}}

    public void testPropertyAddWrapFieldMonthOfYear() {__CLR4_4_1smosmolc8azvnr.R.globalSliceStart(getClass().getName(),37155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1phvuslso3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1smosmolc8azvnr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1smosmolc8azvnr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyAddWrapFieldMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37155,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1phvuslso3(){try{__CLR4_4_1smosmolc8azvnr.R.inc(37155);
        __CLR4_4_1smosmolc8azvnr.R.inc(37156);MonthDay test = new MonthDay(5, 6);
        __CLR4_4_1smosmolc8azvnr.R.inc(37157);MonthDay copy = test.monthOfYear().addWrapFieldToCopy(2);
        __CLR4_4_1smosmolc8azvnr.R.inc(37158);check(test, 5, 6);
        __CLR4_4_1smosmolc8azvnr.R.inc(37159);check(copy, 7, 6);
        
        __CLR4_4_1smosmolc8azvnr.R.inc(37160);copy = test.monthOfYear().addWrapFieldToCopy(2);
        __CLR4_4_1smosmolc8azvnr.R.inc(37161);check(copy, 7, 6);
        
        __CLR4_4_1smosmolc8azvnr.R.inc(37162);copy = test.monthOfYear().addWrapFieldToCopy(292278993 - 4 + 1);
        __CLR4_4_1smosmolc8azvnr.R.inc(37163);check(copy, 11, 6);
        
        __CLR4_4_1smosmolc8azvnr.R.inc(37164);copy = test.monthOfYear().addWrapFieldToCopy(-292275054 - 4 - 1);
        __CLR4_4_1smosmolc8azvnr.R.inc(37165);check(copy, 6, 6);
    }finally{__CLR4_4_1smosmolc8azvnr.R.flushNeeded();}}

    public void testPropertySetMonthOfYear() {__CLR4_4_1smosmolc8azvnr.R.globalSliceStart(getClass().getName(),37166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x2imu8soe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1smosmolc8azvnr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1smosmolc8azvnr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertySetMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37166,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x2imu8soe(){try{__CLR4_4_1smosmolc8azvnr.R.inc(37166);
        __CLR4_4_1smosmolc8azvnr.R.inc(37167);MonthDay test = new MonthDay(10, 6);
        __CLR4_4_1smosmolc8azvnr.R.inc(37168);MonthDay copy = test.monthOfYear().setCopy(12);
        __CLR4_4_1smosmolc8azvnr.R.inc(37169);check(test, 10, 6);
        __CLR4_4_1smosmolc8azvnr.R.inc(37170);check(copy, 12, 6);
    }finally{__CLR4_4_1smosmolc8azvnr.R.flushNeeded();}}

    public void testPropertySetTextMonthOfYear() {__CLR4_4_1smosmolc8azvnr.R.globalSliceStart(getClass().getName(),37171);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kzotlfsoj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1smosmolc8azvnr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1smosmolc8azvnr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertySetTextMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37171,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kzotlfsoj(){try{__CLR4_4_1smosmolc8azvnr.R.inc(37171);
        __CLR4_4_1smosmolc8azvnr.R.inc(37172);MonthDay test = new MonthDay(10, 6);
        __CLR4_4_1smosmolc8azvnr.R.inc(37173);MonthDay copy = test.monthOfYear().setCopy("12");
        __CLR4_4_1smosmolc8azvnr.R.inc(37174);check(test, 10, 6);
        __CLR4_4_1smosmolc8azvnr.R.inc(37175);check(copy, 12, 6);
    }finally{__CLR4_4_1smosmolc8azvnr.R.flushNeeded();}}

    public void testPropertyCompareToMonthOfYear() {__CLR4_4_1smosmolc8azvnr.R.globalSliceStart(getClass().getName(),37176);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q9bnr6soo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1smosmolc8azvnr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1smosmolc8azvnr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyCompareToMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37176,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q9bnr6soo(){try{__CLR4_4_1smosmolc8azvnr.R.inc(37176);
        __CLR4_4_1smosmolc8azvnr.R.inc(37177);MonthDay test1 = new MonthDay(TEST_TIME1);
        __CLR4_4_1smosmolc8azvnr.R.inc(37178);MonthDay test2 = new MonthDay(TEST_TIME2);
        __CLR4_4_1smosmolc8azvnr.R.inc(37179);assertEquals(true, test1.monthOfYear().compareTo(test2) < 0);
        __CLR4_4_1smosmolc8azvnr.R.inc(37180);assertEquals(true, test2.monthOfYear().compareTo(test1) > 0);
        __CLR4_4_1smosmolc8azvnr.R.inc(37181);assertEquals(true, test1.monthOfYear().compareTo(test1) == 0);
        __CLR4_4_1smosmolc8azvnr.R.inc(37182);try {
            __CLR4_4_1smosmolc8azvnr.R.inc(37183);test1.monthOfYear().compareTo((ReadablePartial) null);
            __CLR4_4_1smosmolc8azvnr.R.inc(37184);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_1smosmolc8azvnr.R.inc(37185);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1smosmolc8azvnr.R.inc(37186);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1smosmolc8azvnr.R.inc(37187);assertEquals(true, test1.monthOfYear().compareTo(dt2) < 0);
        __CLR4_4_1smosmolc8azvnr.R.inc(37188);assertEquals(true, test2.monthOfYear().compareTo(dt1) > 0);
        __CLR4_4_1smosmolc8azvnr.R.inc(37189);assertEquals(true, test1.monthOfYear().compareTo(dt1) == 0);
        __CLR4_4_1smosmolc8azvnr.R.inc(37190);try {
            __CLR4_4_1smosmolc8azvnr.R.inc(37191);test1.monthOfYear().compareTo((ReadableInstant) null);
            __CLR4_4_1smosmolc8azvnr.R.inc(37192);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1smosmolc8azvnr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetDayOfMonth() {__CLR4_4_1smosmolc8azvnr.R.globalSliceStart(getClass().getName(),37193);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1198qu5sp5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1smosmolc8azvnr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1smosmolc8azvnr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyGetDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37193,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1198qu5sp5(){try{__CLR4_4_1smosmolc8azvnr.R.inc(37193);
        __CLR4_4_1smosmolc8azvnr.R.inc(37194);MonthDay test = new MonthDay(4, 6);
        __CLR4_4_1smosmolc8azvnr.R.inc(37195);assertSame(test.getChronology().dayOfMonth(), test.dayOfMonth().getField());
        __CLR4_4_1smosmolc8azvnr.R.inc(37196);assertEquals("dayOfMonth", test.dayOfMonth().getName());
        __CLR4_4_1smosmolc8azvnr.R.inc(37197);assertEquals("Property[dayOfMonth]", test.dayOfMonth().toString());
        __CLR4_4_1smosmolc8azvnr.R.inc(37198);assertSame(test, test.dayOfMonth().getReadablePartial());
        __CLR4_4_1smosmolc8azvnr.R.inc(37199);assertSame(test, test.dayOfMonth().getMonthDay());
        __CLR4_4_1smosmolc8azvnr.R.inc(37200);assertEquals(6, test.dayOfMonth().get());
        __CLR4_4_1smosmolc8azvnr.R.inc(37201);assertEquals("6", test.dayOfMonth().getAsString());
        __CLR4_4_1smosmolc8azvnr.R.inc(37202);assertEquals("6", test.dayOfMonth().getAsText());
        __CLR4_4_1smosmolc8azvnr.R.inc(37203);assertEquals("6", test.dayOfMonth().getAsText(Locale.FRENCH));
        __CLR4_4_1smosmolc8azvnr.R.inc(37204);assertEquals("6", test.dayOfMonth().getAsShortText());
        __CLR4_4_1smosmolc8azvnr.R.inc(37205);assertEquals("6", test.dayOfMonth().getAsShortText(Locale.FRENCH));
        __CLR4_4_1smosmolc8azvnr.R.inc(37206);assertEquals(test.getChronology().days(), test.dayOfMonth().getDurationField());
        __CLR4_4_1smosmolc8azvnr.R.inc(37207);assertEquals(test.getChronology().months(), test.dayOfMonth().getRangeDurationField());
        __CLR4_4_1smosmolc8azvnr.R.inc(37208);assertEquals(2, test.dayOfMonth().getMaximumTextLength(null));
        __CLR4_4_1smosmolc8azvnr.R.inc(37209);assertEquals(2, test.dayOfMonth().getMaximumShortTextLength(null));
        __CLR4_4_1smosmolc8azvnr.R.inc(37210);test = new MonthDay(4, 7);
        __CLR4_4_1smosmolc8azvnr.R.inc(37211);assertEquals("7", test.dayOfMonth().getAsText(Locale.FRENCH));
        __CLR4_4_1smosmolc8azvnr.R.inc(37212);assertEquals("7", test.dayOfMonth().getAsShortText(Locale.FRENCH));
    }finally{__CLR4_4_1smosmolc8azvnr.R.flushNeeded();}}

    public void testPropertyGetMaxMinValuesDayOfMonth() {__CLR4_4_1smosmolc8azvnr.R.globalSliceStart(getClass().getName(),37213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13zmdrhspp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1smosmolc8azvnr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1smosmolc8azvnr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyGetMaxMinValuesDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37213,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13zmdrhspp(){try{__CLR4_4_1smosmolc8azvnr.R.inc(37213);
        __CLR4_4_1smosmolc8azvnr.R.inc(37214);MonthDay test = new MonthDay(4, 6);
        __CLR4_4_1smosmolc8azvnr.R.inc(37215);assertEquals(1, test.dayOfMonth().getMinimumValue());
        __CLR4_4_1smosmolc8azvnr.R.inc(37216);assertEquals(1, test.dayOfMonth().getMinimumValueOverall());
        __CLR4_4_1smosmolc8azvnr.R.inc(37217);assertEquals(30, test.dayOfMonth().getMaximumValue());
        __CLR4_4_1smosmolc8azvnr.R.inc(37218);assertEquals(31, test.dayOfMonth().getMaximumValueOverall());
    }finally{__CLR4_4_1smosmolc8azvnr.R.flushNeeded();}}

    public void testPropertyAddDayOfMonth() {__CLR4_4_1smosmolc8azvnr.R.globalSliceStart(getClass().getName(),37219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o1ulyqspv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1smosmolc8azvnr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1smosmolc8azvnr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyAddDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37219,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o1ulyqspv(){try{__CLR4_4_1smosmolc8azvnr.R.inc(37219);
        __CLR4_4_1smosmolc8azvnr.R.inc(37220);MonthDay test = new MonthDay(4, 6);
        __CLR4_4_1smosmolc8azvnr.R.inc(37221);MonthDay copy = test.dayOfMonth().addToCopy(6);
        __CLR4_4_1smosmolc8azvnr.R.inc(37222);check(test, 4, 6);
        __CLR4_4_1smosmolc8azvnr.R.inc(37223);check(copy, 4, 12);
        
        __CLR4_4_1smosmolc8azvnr.R.inc(37224);copy = test.dayOfMonth().addToCopy(7);
        __CLR4_4_1smosmolc8azvnr.R.inc(37225);check(copy, 4, 13);
        
        __CLR4_4_1smosmolc8azvnr.R.inc(37226);copy = test.dayOfMonth().addToCopy(-5);
        __CLR4_4_1smosmolc8azvnr.R.inc(37227);check(copy, 4, 1);
        
        __CLR4_4_1smosmolc8azvnr.R.inc(37228);copy = test.dayOfMonth().addToCopy(-6);
        __CLR4_4_1smosmolc8azvnr.R.inc(37229);check(copy, 3, 31);
    }finally{__CLR4_4_1smosmolc8azvnr.R.flushNeeded();}}

    public void testPropertyAddWrapFieldDayOfMonth() {__CLR4_4_1smosmolc8azvnr.R.globalSliceStart(getClass().getName(),37230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dfyjyisq6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1smosmolc8azvnr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1smosmolc8azvnr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyAddWrapFieldDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37230,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dfyjyisq6(){try{__CLR4_4_1smosmolc8azvnr.R.inc(37230);
        __CLR4_4_1smosmolc8azvnr.R.inc(37231);MonthDay test = new MonthDay(4, 6);
        __CLR4_4_1smosmolc8azvnr.R.inc(37232);MonthDay copy = test.dayOfMonth().addWrapFieldToCopy(4);
        __CLR4_4_1smosmolc8azvnr.R.inc(37233);check(test, 4, 6);
        __CLR4_4_1smosmolc8azvnr.R.inc(37234);check(copy, 4, 10);
        
        __CLR4_4_1smosmolc8azvnr.R.inc(37235);copy = test.dayOfMonth().addWrapFieldToCopy(8);
        __CLR4_4_1smosmolc8azvnr.R.inc(37236);check(copy, 4, 14);
        
        __CLR4_4_1smosmolc8azvnr.R.inc(37237);copy = test.dayOfMonth().addWrapFieldToCopy(-8);
        __CLR4_4_1smosmolc8azvnr.R.inc(37238);check(copy, 4, 28);
    }finally{__CLR4_4_1smosmolc8azvnr.R.flushNeeded();}}

    public void testPropertySetDayOfMonth() {__CLR4_4_1smosmolc8azvnr.R.globalSliceStart(getClass().getName(),37239);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mz1n4hsqf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1smosmolc8azvnr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1smosmolc8azvnr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertySetDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37239,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mz1n4hsqf(){try{__CLR4_4_1smosmolc8azvnr.R.inc(37239);
        __CLR4_4_1smosmolc8azvnr.R.inc(37240);MonthDay test = new MonthDay(4, 6);
        __CLR4_4_1smosmolc8azvnr.R.inc(37241);MonthDay copy = test.dayOfMonth().setCopy(12);
        __CLR4_4_1smosmolc8azvnr.R.inc(37242);check(test, 4, 6);
        __CLR4_4_1smosmolc8azvnr.R.inc(37243);check(copy, 4, 12);
        
        __CLR4_4_1smosmolc8azvnr.R.inc(37244);try {
            __CLR4_4_1smosmolc8azvnr.R.inc(37245);test.dayOfMonth().setCopy(33);
            __CLR4_4_1smosmolc8azvnr.R.inc(37246);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1smosmolc8azvnr.R.inc(37247);try {
            __CLR4_4_1smosmolc8azvnr.R.inc(37248);test.dayOfMonth().setCopy(0);
            __CLR4_4_1smosmolc8azvnr.R.inc(37249);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1smosmolc8azvnr.R.flushNeeded();}}

    public void testPropertySetTextDayOfMonth() {__CLR4_4_1smosmolc8azvnr.R.globalSliceStart(getClass().getName(),37250);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_144rzx8sqq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1smosmolc8azvnr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1smosmolc8azvnr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertySetTextDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37250,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_144rzx8sqq(){try{__CLR4_4_1smosmolc8azvnr.R.inc(37250);
        __CLR4_4_1smosmolc8azvnr.R.inc(37251);MonthDay test = new MonthDay(4, 6);
        __CLR4_4_1smosmolc8azvnr.R.inc(37252);MonthDay copy = test.dayOfMonth().setCopy("12");
        __CLR4_4_1smosmolc8azvnr.R.inc(37253);check(test, 4, 6);
        __CLR4_4_1smosmolc8azvnr.R.inc(37254);check(copy, 4, 12);
        
        __CLR4_4_1smosmolc8azvnr.R.inc(37255);copy = test.dayOfMonth().setCopy("2");
        __CLR4_4_1smosmolc8azvnr.R.inc(37256);check(test, 4, 6);
        __CLR4_4_1smosmolc8azvnr.R.inc(37257);check(copy, 4, 2);
        
        __CLR4_4_1smosmolc8azvnr.R.inc(37258);copy = test.dayOfMonth().setCopy("4");
        __CLR4_4_1smosmolc8azvnr.R.inc(37259);check(test, 4, 6);
        __CLR4_4_1smosmolc8azvnr.R.inc(37260);check(copy, 4, 4);
    }finally{__CLR4_4_1smosmolc8azvnr.R.flushNeeded();}}

    public void testPropertyCompareToDayOfMonth() {__CLR4_4_1smosmolc8azvnr.R.globalSliceStart(getClass().getName(),37261);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wcwl0zsr1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1smosmolc8azvnr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1smosmolc8azvnr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyCompareToDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37261,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wcwl0zsr1(){try{__CLR4_4_1smosmolc8azvnr.R.inc(37261);
        __CLR4_4_1smosmolc8azvnr.R.inc(37262);MonthDay test1 = new MonthDay(TEST_TIME1);
        __CLR4_4_1smosmolc8azvnr.R.inc(37263);MonthDay test2 = new MonthDay(TEST_TIME2);
        __CLR4_4_1smosmolc8azvnr.R.inc(37264);assertEquals(true, test1.dayOfMonth().compareTo(test2) < 0);
        __CLR4_4_1smosmolc8azvnr.R.inc(37265);assertEquals(true, test2.dayOfMonth().compareTo(test1) > 0);
        __CLR4_4_1smosmolc8azvnr.R.inc(37266);assertEquals(true, test1.dayOfMonth().compareTo(test1) == 0);
        __CLR4_4_1smosmolc8azvnr.R.inc(37267);try {
            __CLR4_4_1smosmolc8azvnr.R.inc(37268);test1.dayOfMonth().compareTo((ReadablePartial) null);
            __CLR4_4_1smosmolc8azvnr.R.inc(37269);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_1smosmolc8azvnr.R.inc(37270);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1smosmolc8azvnr.R.inc(37271);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1smosmolc8azvnr.R.inc(37272);assertEquals(true, test1.dayOfMonth().compareTo(dt2) < 0);
        __CLR4_4_1smosmolc8azvnr.R.inc(37273);assertEquals(true, test2.dayOfMonth().compareTo(dt1) > 0);
        __CLR4_4_1smosmolc8azvnr.R.inc(37274);assertEquals(true, test1.dayOfMonth().compareTo(dt1) == 0);
        __CLR4_4_1smosmolc8azvnr.R.inc(37275);try {
            __CLR4_4_1smosmolc8azvnr.R.inc(37276);test1.dayOfMonth().compareTo((ReadableInstant) null);
            __CLR4_4_1smosmolc8azvnr.R.inc(37277);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1smosmolc8azvnr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyEquals() {__CLR4_4_1smosmolc8azvnr.R.globalSliceStart(getClass().getName(),37278);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2ub0zsri();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1smosmolc8azvnr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1smosmolc8azvnr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37278,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2ub0zsri(){try{__CLR4_4_1smosmolc8azvnr.R.inc(37278);
        __CLR4_4_1smosmolc8azvnr.R.inc(37279);MonthDay test1 = new MonthDay(11, 11);
        __CLR4_4_1smosmolc8azvnr.R.inc(37280);MonthDay test2 = new MonthDay(11, 12);
        __CLR4_4_1smosmolc8azvnr.R.inc(37281);MonthDay test3 = new MonthDay(11, 11, CopticChronology.getInstanceUTC());
        __CLR4_4_1smosmolc8azvnr.R.inc(37282);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_1smosmolc8azvnr.R.inc(37283);assertEquals(false, test1.dayOfMonth().equals(test1.monthOfYear()));
        __CLR4_4_1smosmolc8azvnr.R.inc(37284);assertEquals(false, test1.dayOfMonth().equals(test2.dayOfMonth()));
        __CLR4_4_1smosmolc8azvnr.R.inc(37285);assertEquals(false, test1.dayOfMonth().equals(test2.monthOfYear()));
        
        __CLR4_4_1smosmolc8azvnr.R.inc(37286);assertEquals(false, test1.monthOfYear().equals(test1.dayOfMonth()));
        __CLR4_4_1smosmolc8azvnr.R.inc(37287);assertEquals(true, test1.monthOfYear().equals(test1.monthOfYear()));
        __CLR4_4_1smosmolc8azvnr.R.inc(37288);assertEquals(false, test1.monthOfYear().equals(test2.dayOfMonth()));
        __CLR4_4_1smosmolc8azvnr.R.inc(37289);assertEquals(true, test1.monthOfYear().equals(test2.monthOfYear()));
        
        __CLR4_4_1smosmolc8azvnr.R.inc(37290);assertEquals(false, test1.dayOfMonth().equals(null));
        __CLR4_4_1smosmolc8azvnr.R.inc(37291);assertEquals(false, test1.dayOfMonth().equals("any"));
        
        // chrono
        __CLR4_4_1smosmolc8azvnr.R.inc(37292);assertEquals(false, test1.dayOfMonth().equals(test3.dayOfMonth()));
    }finally{__CLR4_4_1smosmolc8azvnr.R.flushNeeded();}}

    public void testPropertyHashCode() {__CLR4_4_1smosmolc8azvnr.R.globalSliceStart(getClass().getName(),37293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y278s7srx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1smosmolc8azvnr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1smosmolc8azvnr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37293,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y278s7srx(){try{__CLR4_4_1smosmolc8azvnr.R.inc(37293);
        __CLR4_4_1smosmolc8azvnr.R.inc(37294);MonthDay test1 = new MonthDay(5, 11);
        __CLR4_4_1smosmolc8azvnr.R.inc(37295);MonthDay test2 = new MonthDay(5, 12);
        __CLR4_4_1smosmolc8azvnr.R.inc(37296);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode());
        __CLR4_4_1smosmolc8azvnr.R.inc(37297);assertEquals(false, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
        __CLR4_4_1smosmolc8azvnr.R.inc(37298);assertEquals(true, test1.monthOfYear().hashCode() == test1.monthOfYear().hashCode());
        __CLR4_4_1smosmolc8azvnr.R.inc(37299);assertEquals(true, test1.monthOfYear().hashCode() == test2.monthOfYear().hashCode());
    }finally{__CLR4_4_1smosmolc8azvnr.R.flushNeeded();}}

    public void testPropertyEqualsHashCodeLenient() {__CLR4_4_1smosmolc8azvnr.R.globalSliceStart(getClass().getName(),37300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xoanxfss4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1smosmolc8azvnr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1smosmolc8azvnr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyEqualsHashCodeLenient",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37300,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xoanxfss4(){try{__CLR4_4_1smosmolc8azvnr.R.inc(37300);
        __CLR4_4_1smosmolc8azvnr.R.inc(37301);MonthDay test1 = new MonthDay(5, 6, LenientChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_1smosmolc8azvnr.R.inc(37302);MonthDay test2 = new MonthDay(5, 6, LenientChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_1smosmolc8azvnr.R.inc(37303);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth()));
        __CLR4_4_1smosmolc8azvnr.R.inc(37304);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_1smosmolc8azvnr.R.inc(37305);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_1smosmolc8azvnr.R.inc(37306);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth()));
        __CLR4_4_1smosmolc8azvnr.R.inc(37307);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
        __CLR4_4_1smosmolc8azvnr.R.inc(37308);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode());
        __CLR4_4_1smosmolc8azvnr.R.inc(37309);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
    }finally{__CLR4_4_1smosmolc8azvnr.R.flushNeeded();}}

    public void testPropertyEqualsHashCodeStrict() {__CLR4_4_1smosmolc8azvnr.R.globalSliceStart(getClass().getName(),37310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ev6icvsse();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1smosmolc8azvnr.R.rethrow($CLV_t2$);}finally{__CLR4_4_1smosmolc8azvnr.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Properties.testPropertyEqualsHashCodeStrict",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37310,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ev6icvsse(){try{__CLR4_4_1smosmolc8azvnr.R.inc(37310);
        __CLR4_4_1smosmolc8azvnr.R.inc(37311);MonthDay test1 = new MonthDay(5, 6, StrictChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_1smosmolc8azvnr.R.inc(37312);MonthDay test2 = new MonthDay(5, 6, StrictChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_1smosmolc8azvnr.R.inc(37313);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth()));
        __CLR4_4_1smosmolc8azvnr.R.inc(37314);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_1smosmolc8azvnr.R.inc(37315);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_1smosmolc8azvnr.R.inc(37316);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth()));
        __CLR4_4_1smosmolc8azvnr.R.inc(37317);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
        __CLR4_4_1smosmolc8azvnr.R.inc(37318);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode());
        __CLR4_4_1smosmolc8azvnr.R.inc(37319);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
    }finally{__CLR4_4_1smosmolc8azvnr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void check(MonthDay test, int monthOfYear, int dayOfMonth) {try{__CLR4_4_1smosmolc8azvnr.R.inc(37320);
        __CLR4_4_1smosmolc8azvnr.R.inc(37321);assertEquals(monthOfYear, test.getMonthOfYear());
        __CLR4_4_1smosmolc8azvnr.R.inc(37322);assertEquals(dayOfMonth, test.getDayOfMonth());
    }finally{__CLR4_4_1smosmolc8azvnr.R.flushNeeded();}}
}
