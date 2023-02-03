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

/**
 * This class is a Junit unit test for LocalDateTime.
 *
 * @author Stephen Colebourne
 */
public class TestLocalDateTime_Properties extends TestCase {static class __CLR4_4_1p2dp2dlc8azvas{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,33238,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final CopticChronology COPTIC_UTC = CopticChronology.getInstanceUTC();

    private int MILLIS_OF_DAY =
        (int) (10L * DateTimeConstants.MILLIS_PER_HOUR
        + 20L * DateTimeConstants.MILLIS_PER_MINUTE
        + 30L * DateTimeConstants.MILLIS_PER_SECOND
        + 40L);
    private long TEST_TIME_NOW =
        (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + MILLIS_OF_DAY;
    private long TEST_TIME1 =
        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 1L * DateTimeConstants.MILLIS_PER_HOUR
        + 2L * DateTimeConstants.MILLIS_PER_MINUTE
        + 3L * DateTimeConstants.MILLIS_PER_SECOND
        + 4L;
    private long TEST_TIME2 =
        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 4L * DateTimeConstants.MILLIS_PER_HOUR
        + 5L * DateTimeConstants.MILLIS_PER_MINUTE
        + 6L * DateTimeConstants.MILLIS_PER_SECOND
        + 7L;

    private DateTimeZone zone = null;

    private Locale systemDefaultLocale = null;

    public static void main(String[] args) {try{__CLR4_4_1p2dp2dlc8azvas.R.inc(32485);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32486);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1p2dp2dlc8azvas.R.inc(32487);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32488);return new TestSuite(TestLocalDateTime_Properties.class);
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public TestLocalDateTime_Properties(String name) {
        super(name);__CLR4_4_1p2dp2dlc8azvas.R.inc(32490);try{__CLR4_4_1p2dp2dlc8azvas.R.inc(32489);
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1p2dp2dlc8azvas.R.inc(32491);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32492);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32493);zone = DateTimeZone.getDefault();
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32494);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32495);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32496);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1p2dp2dlc8azvas.R.inc(32497);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32498);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32499);DateTimeZone.setDefault(zone);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32500);zone = null;
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32501);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32502);systemDefaultLocale = null;
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetYear() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),32503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tgqcqbp2v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyGetYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32503,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tgqcqbp2v(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(32503);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32504);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32505);assertSame(test.getChronology().year(), test.year().getField());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32506);assertEquals("year", test.year().getName());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32507);assertEquals("Property[year]", test.year().toString());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32508);assertSame(test, test.year().getLocalDateTime());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32509);assertEquals(1972, test.year().get());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32510);assertEquals("1972", test.year().getAsString());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32511);assertEquals("1972", test.year().getAsText());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32512);assertEquals("1972", test.year().getAsText(Locale.FRENCH));
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32513);assertEquals("1972", test.year().getAsShortText());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32514);assertEquals("1972", test.year().getAsShortText(Locale.FRENCH));
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32515);assertEquals(test.getChronology().years(), test.year().getDurationField());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32516);assertEquals(null, test.year().getRangeDurationField());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32517);assertEquals(9, test.year().getMaximumTextLength(null));
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32518);assertEquals(9, test.year().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertyGetMaxMinValuesYear() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),32519);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12r9x9fp3b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyGetMaxMinValuesYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32519,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12r9x9fp3b(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(32519);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32520);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32521);assertEquals(-292275054, test.year().getMinimumValue());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32522);assertEquals(-292275054, test.year().getMinimumValueOverall());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32523);assertEquals(292278993, test.year().getMaximumValue());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32524);assertEquals(292278993, test.year().getMaximumValueOverall());
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertyAddToCopyYear() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),32525);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cpejcip3h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyAddToCopyYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32525,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cpejcip3h(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(32525);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32526);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32527);LocalDateTime copy = test.year().addToCopy(9);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32528);check(test, 1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32529);check(copy, 1981, 6, 9, 10, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32530);copy = test.year().addToCopy(0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32531);check(copy, 1972, 6, 9, 10, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32532);copy = test.year().addToCopy(292278993 - 1972);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32533);check(copy, 292278993, 6, 9, 10, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32534);try {
            __CLR4_4_1p2dp2dlc8azvas.R.inc(32535);test.year().addToCopy(292278993 - 1972 + 1);
            __CLR4_4_1p2dp2dlc8azvas.R.inc(32536);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32537);check(test, 1972, 6, 9, 10, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32538);copy = test.year().addToCopy(-1972);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32539);check(copy, 0, 6, 9, 10, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32540);copy = test.year().addToCopy(-1973);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32541);check(copy, -1, 6, 9, 10, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32542);try {
            __CLR4_4_1p2dp2dlc8azvas.R.inc(32543);test.year().addToCopy(-292275054 - 1972 - 1);
            __CLR4_4_1p2dp2dlc8azvas.R.inc(32544);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32545);check(test, 1972, 6, 9, 10, 20, 30, 40);
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertyAddWrapFieldToCopyYear() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),32546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1osemkqp42();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyAddWrapFieldToCopyYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32546,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1osemkqp42(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(32546);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32547);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32548);LocalDateTime copy = test.year().addWrapFieldToCopy(9);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32549);check(test, 1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32550);check(copy, 1981, 6, 9, 10, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32551);copy = test.year().addWrapFieldToCopy(0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32552);check(copy, 1972, 6, 9, 10, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32553);copy = test.year().addWrapFieldToCopy(292278993 - 1972 + 1);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32554);check(copy, -292275054, 6, 9, 10, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32555);copy = test.year().addWrapFieldToCopy(-292275054 - 1972 - 1);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32556);check(copy, 292278993, 6, 9, 10, 20, 30, 40);
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertySetCopyYear() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),32557);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12egg3wp4d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertySetCopyYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32557,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12egg3wp4d(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(32557);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32558);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32559);LocalDateTime copy = test.year().setCopy(12);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32560);check(test, 1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32561);check(copy, 12, 6, 9, 10, 20, 30, 40);
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertySetCopyTextYear() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),32562);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iwaee7p4i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertySetCopyTextYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32562,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iwaee7p4i(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(32562);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32563);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32564);LocalDateTime copy = test.year().setCopy("12");
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32565);check(test, 1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32566);check(copy, 12, 6, 9, 10, 20, 30, 40);
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertyCompareToYear() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),32567);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ft7abp4n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyCompareToYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32567,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ft7abp4n(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(32567);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32568);LocalDateTime test1 = new LocalDateTime(TEST_TIME1);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32569);LocalDateTime test2 = new LocalDateTime(TEST_TIME2);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32570);assertEquals(true, test1.year().compareTo(test2) < 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32571);assertEquals(true, test2.year().compareTo(test1) > 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32572);assertEquals(true, test1.year().compareTo(test1) == 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32573);try {
            __CLR4_4_1p2dp2dlc8azvas.R.inc(32574);test1.year().compareTo((ReadablePartial) null);
            __CLR4_4_1p2dp2dlc8azvas.R.inc(32575);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32576);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32577);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32578);assertEquals(true, test1.year().compareTo(dt2) < 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32579);assertEquals(true, test2.year().compareTo(dt1) > 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32580);assertEquals(true, test1.year().compareTo(dt1) == 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32581);try {
            __CLR4_4_1p2dp2dlc8azvas.R.inc(32582);test1.year().compareTo((ReadableInstant) null);
            __CLR4_4_1p2dp2dlc8azvas.R.inc(32583);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetMonth() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),32584);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ox6q20p54();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyGetMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32584,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ox6q20p54(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(32584);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32585);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32586);assertSame(test.getChronology().monthOfYear(), test.monthOfYear().getField());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32587);assertEquals("monthOfYear", test.monthOfYear().getName());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32588);assertEquals("Property[monthOfYear]", test.monthOfYear().toString());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32589);assertSame(test, test.monthOfYear().getLocalDateTime());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32590);assertEquals(6, test.monthOfYear().get());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32591);assertEquals("6", test.monthOfYear().getAsString());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32592);assertEquals("June", test.monthOfYear().getAsText());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32593);assertEquals("juin", test.monthOfYear().getAsText(Locale.FRENCH));
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32594);assertEquals("Jun", test.monthOfYear().getAsShortText());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32595);assertEquals("juin", test.monthOfYear().getAsShortText(Locale.FRENCH));
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32596);assertEquals(test.getChronology().months(), test.monthOfYear().getDurationField());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32597);assertEquals(test.getChronology().years(), test.monthOfYear().getRangeDurationField());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32598);assertEquals(9, test.monthOfYear().getMaximumTextLength(null));
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32599);assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null));
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32600);test = new LocalDateTime(1972, 7, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32601);assertEquals("juillet", test.monthOfYear().getAsText(Locale.FRENCH));
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32602);assertEquals("juil.", test.monthOfYear().getAsShortText(Locale.FRENCH));
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertyGetMaxMinValuesMonth() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),32603);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gzdw8p5n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyGetMaxMinValuesMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32603,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gzdw8p5n(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(32603);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32604);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32605);assertEquals(1, test.monthOfYear().getMinimumValue());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32606);assertEquals(1, test.monthOfYear().getMinimumValueOverall());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32607);assertEquals(12, test.monthOfYear().getMaximumValue());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32608);assertEquals(12, test.monthOfYear().getMaximumValueOverall());
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertyAddToCopyMonth() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),32609);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hdqp25p5t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyAddToCopyMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32609,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hdqp25p5t(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(32609);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32610);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32611);LocalDateTime copy = test.monthOfYear().addToCopy(6);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32612);check(test, 1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32613);check(copy, 1972, 12, 9, 10, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32614);copy = test.monthOfYear().addToCopy(7);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32615);check(copy, 1973, 1, 9, 10, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32616);copy = test.monthOfYear().addToCopy(-5);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32617);check(copy, 1972, 1, 9, 10, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32618);copy = test.monthOfYear().addToCopy(-6);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32619);check(copy, 1971, 12, 9, 10, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32620);test = new LocalDateTime(1972, 1, 31, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32621);copy = test.monthOfYear().addToCopy(1);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32622);check(copy, 1972, 2, 29, 10, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32623);copy = test.monthOfYear().addToCopy(2);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32624);check(copy, 1972, 3, 31, 10, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32625);copy = test.monthOfYear().addToCopy(3);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32626);check(copy, 1972, 4, 30, 10, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32627);test = new LocalDateTime(1971, 1, 31, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32628);copy = test.monthOfYear().addToCopy(1);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32629);check(copy, 1971, 2, 28, 10, 20, 30, 40);
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertyAddWrapFieldToCopyMonth() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),32630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rt24wvp6e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyAddWrapFieldToCopyMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32630,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rt24wvp6e(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(32630);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32631);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32632);LocalDateTime copy = test.monthOfYear().addWrapFieldToCopy(4);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32633);check(test, 1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32634);check(copy, 1972, 10, 9, 10, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32635);copy = test.monthOfYear().addWrapFieldToCopy(8);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32636);check(copy, 1972, 2, 9, 10, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32637);copy = test.monthOfYear().addWrapFieldToCopy(-8);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32638);check(copy, 1972, 10, 9, 10, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32639);test = new LocalDateTime(1972, 1, 31, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32640);copy = test.monthOfYear().addWrapFieldToCopy(1);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32641);check(copy, 1972, 2, 29, 10, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32642);copy = test.monthOfYear().addWrapFieldToCopy(2);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32643);check(copy, 1972, 3, 31, 10, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32644);copy = test.monthOfYear().addWrapFieldToCopy(3);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32645);check(copy, 1972, 4, 30, 10, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32646);test = new LocalDateTime(1971, 1, 31, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32647);copy = test.monthOfYear().addWrapFieldToCopy(1);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32648);check(copy, 1971, 2, 28, 10, 20, 30, 40);
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertySetCopyMonth() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),32649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1icgsehp6x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertySetCopyMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32649,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1icgsehp6x(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(32649);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32650);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32651);LocalDateTime copy = test.monthOfYear().setCopy(12);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32652);check(test, 1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32653);check(copy, 1972, 12, 9, 10, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32654);test = new LocalDateTime(1972, 1, 31, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32655);copy = test.monthOfYear().setCopy(2);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32656);check(copy, 1972, 2, 29, 10, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32657);try {
            __CLR4_4_1p2dp2dlc8azvas.R.inc(32658);test.monthOfYear().setCopy(13);
            __CLR4_4_1p2dp2dlc8azvas.R.inc(32659);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32660);try {
            __CLR4_4_1p2dp2dlc8azvas.R.inc(32661);test.monthOfYear().setCopy(0);
            __CLR4_4_1p2dp2dlc8azvas.R.inc(32662);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertySetCopyTextMonth() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),32663);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1whgxg6p7b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertySetCopyTextMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32663,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1whgxg6p7b(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(32663);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32664);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32665);LocalDateTime copy = test.monthOfYear().setCopy("12");
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32666);check(test, 1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32667);check(copy, 1972, 12, 9, 10, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32668);copy = test.monthOfYear().setCopy("December");
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32669);check(test, 1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32670);check(copy, 1972, 12, 9, 10, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32671);copy = test.monthOfYear().setCopy("Dec");
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32672);check(test, 1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32673);check(copy, 1972, 12, 9, 10, 20, 30, 40);
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertyCompareToMonth() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),32674);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sjk8wip7m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyCompareToMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32674,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sjk8wip7m(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(32674);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32675);LocalDateTime test1 = new LocalDateTime(TEST_TIME1);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32676);LocalDateTime test2 = new LocalDateTime(TEST_TIME2);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32677);assertEquals(true, test1.monthOfYear().compareTo(test2) < 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32678);assertEquals(true, test2.monthOfYear().compareTo(test1) > 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32679);assertEquals(true, test1.monthOfYear().compareTo(test1) == 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32680);try {
            __CLR4_4_1p2dp2dlc8azvas.R.inc(32681);test1.monthOfYear().compareTo((ReadablePartial) null);
            __CLR4_4_1p2dp2dlc8azvas.R.inc(32682);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32683);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32684);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32685);assertEquals(true, test1.monthOfYear().compareTo(dt2) < 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32686);assertEquals(true, test2.monthOfYear().compareTo(dt1) > 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32687);assertEquals(true, test1.monthOfYear().compareTo(dt1) == 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32688);try {
            __CLR4_4_1p2dp2dlc8azvas.R.inc(32689);test1.monthOfYear().compareTo((ReadableInstant) null);
            __CLR4_4_1p2dp2dlc8azvas.R.inc(32690);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetDay() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),32691);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1akcm7op83();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyGetDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32691,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1akcm7op83(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(32691);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32692);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32693);assertSame(test.getChronology().dayOfMonth(), test.dayOfMonth().getField());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32694);assertEquals("dayOfMonth", test.dayOfMonth().getName());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32695);assertEquals("Property[dayOfMonth]", test.dayOfMonth().toString());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32696);assertSame(test, test.dayOfMonth().getLocalDateTime());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32697);assertEquals(9, test.dayOfMonth().get());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32698);assertEquals("9", test.dayOfMonth().getAsString());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32699);assertEquals("9", test.dayOfMonth().getAsText());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32700);assertEquals("9", test.dayOfMonth().getAsText(Locale.FRENCH));
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32701);assertEquals("9", test.dayOfMonth().getAsShortText());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32702);assertEquals("9", test.dayOfMonth().getAsShortText(Locale.FRENCH));
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32703);assertEquals(test.getChronology().days(), test.dayOfMonth().getDurationField());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32704);assertEquals(test.getChronology().months(), test.dayOfMonth().getRangeDurationField());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32705);assertEquals(2, test.dayOfMonth().getMaximumTextLength(null));
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32706);assertEquals(2, test.dayOfMonth().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertyGetMaxMinValuesDay() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),32707);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_141l7p8p8j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyGetMaxMinValuesDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32707,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_141l7p8p8j(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(32707);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32708);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32709);assertEquals(1, test.dayOfMonth().getMinimumValue());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32710);assertEquals(1, test.dayOfMonth().getMinimumValueOverall());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32711);assertEquals(30, test.dayOfMonth().getMaximumValue());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32712);assertEquals(31, test.dayOfMonth().getMaximumValueOverall());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32713);test = new LocalDateTime(1972, 7, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32714);assertEquals(31, test.dayOfMonth().getMaximumValue());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32715);test = new LocalDateTime(1972, 2, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32716);assertEquals(29, test.dayOfMonth().getMaximumValue());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32717);test = new LocalDateTime(1971, 2, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32718);assertEquals(28, test.dayOfMonth().getMaximumValue());
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertyAddToCopyDay() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),32719);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rja0s9p8v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyAddToCopyDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32719,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rja0s9p8v(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(32719);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32720);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32721);LocalDateTime copy = test.dayOfMonth().addToCopy(9);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32722);check(test, 1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32723);check(copy, 1972, 6, 18, 10, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32724);copy = test.dayOfMonth().addToCopy(21);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32725);check(copy, 1972, 6, 30, 10, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32726);copy = test.dayOfMonth().addToCopy(22);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32727);check(copy, 1972, 7, 1, 10, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32728);copy = test.dayOfMonth().addToCopy(22 + 30);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32729);check(copy, 1972, 7, 31, 10, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32730);copy = test.dayOfMonth().addToCopy(22 + 31);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32731);check(copy, 1972, 8, 1, 10, 20, 30, 40);

        __CLR4_4_1p2dp2dlc8azvas.R.inc(32732);copy = test.dayOfMonth().addToCopy(21 + 31 + 31 + 30 + 31 + 30 + 31);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32733);check(copy, 1972, 12, 31, 10, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32734);copy = test.dayOfMonth().addToCopy(22 + 31 + 31 + 30 + 31 + 30 + 31);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32735);check(copy, 1973, 1, 1, 10, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32736);copy = test.dayOfMonth().addToCopy(-8);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32737);check(copy, 1972, 6, 1, 10, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32738);copy = test.dayOfMonth().addToCopy(-9);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32739);check(copy, 1972, 5, 31, 10, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32740);copy = test.dayOfMonth().addToCopy(-8 - 31 - 30 - 31 - 29 - 31);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32741);check(copy, 1972, 1, 1, 10, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32742);copy = test.dayOfMonth().addToCopy(-9 - 31 - 30 - 31 - 29 - 31);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32743);check(copy, 1971, 12, 31, 10, 20, 30, 40);
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertyAddWrapFieldToCopyDay() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),32744);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qgbzr1p9k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyAddWrapFieldToCopyDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32744,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qgbzr1p9k(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(32744);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32745);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32746);LocalDateTime copy = test.dayOfMonth().addWrapFieldToCopy(21);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32747);check(test, 1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32748);check(copy, 1972, 6, 30, 10, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32749);copy = test.dayOfMonth().addWrapFieldToCopy(22);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32750);check(copy, 1972, 6, 1, 10, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32751);copy = test.dayOfMonth().addWrapFieldToCopy(-12);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32752);check(copy, 1972, 6, 27, 10, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32753);test = new LocalDateTime(1972, 7, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32754);copy = test.dayOfMonth().addWrapFieldToCopy(21);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32755);check(copy, 1972, 7, 30, 10, 20, 30, 40);
    
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32756);copy = test.dayOfMonth().addWrapFieldToCopy(22);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32757);check(copy, 1972, 7, 31, 10, 20, 30, 40);
    
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32758);copy = test.dayOfMonth().addWrapFieldToCopy(23);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32759);check(copy, 1972, 7, 1, 10, 20, 30, 40);
    
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32760);copy = test.dayOfMonth().addWrapFieldToCopy(-12);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32761);check(copy, 1972, 7, 28, 10, 20, 30, 40);
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertySetCopyDay() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),32762);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b31jxppa2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertySetCopyDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32762,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b31jxppa2(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(32762);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32763);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32764);LocalDateTime copy = test.dayOfMonth().setCopy(12);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32765);check(test, 1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32766);check(copy, 1972, 6, 12, 10, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32767);try {
            __CLR4_4_1p2dp2dlc8azvas.R.inc(32768);test.dayOfMonth().setCopy(31);
            __CLR4_4_1p2dp2dlc8azvas.R.inc(32769);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32770);try {
            __CLR4_4_1p2dp2dlc8azvas.R.inc(32771);test.dayOfMonth().setCopy(0);
            __CLR4_4_1p2dp2dlc8azvas.R.inc(32772);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertySetCopyTextDay() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),32773);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ty3ke2pad();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertySetCopyTextDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32773,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ty3ke2pad(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(32773);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32774);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32775);LocalDateTime copy = test.dayOfMonth().setCopy("12");
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32776);check(test, 1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32777);check(copy, 1972, 6, 12, 10, 20, 30, 40);
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertyWithMaximumValueDayOfMonth() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),32778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2wa9epai();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyWithMaximumValueDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32778,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2wa9epai(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(32778);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32779);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32780);LocalDateTime copy = test.dayOfMonth().withMaximumValue();
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32781);check(test, 1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32782);check(copy, 1972, 6, 30, 10, 20, 30, 40);
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertyWithMinimumValueDayOfMonth() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),32783);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1duofekpan();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyWithMinimumValueDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32783,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1duofekpan(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(32783);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32784);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32785);LocalDateTime copy = test.dayOfMonth().withMinimumValue();
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32786);check(test, 1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32787);check(copy, 1972, 6, 1, 10, 20, 30, 40);
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertyCompareToDay() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),32788);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19lmfrepas();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyCompareToDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32788,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19lmfrepas(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(32788);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32789);LocalDateTime test1 = new LocalDateTime(TEST_TIME1);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32790);LocalDateTime test2 = new LocalDateTime(TEST_TIME2);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32791);assertEquals(true, test1.dayOfMonth().compareTo(test2) < 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32792);assertEquals(true, test2.dayOfMonth().compareTo(test1) > 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32793);assertEquals(true, test1.dayOfMonth().compareTo(test1) == 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32794);try {
            __CLR4_4_1p2dp2dlc8azvas.R.inc(32795);test1.dayOfMonth().compareTo((ReadablePartial) null);
            __CLR4_4_1p2dp2dlc8azvas.R.inc(32796);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32797);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32798);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32799);assertEquals(true, test1.dayOfMonth().compareTo(dt2) < 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32800);assertEquals(true, test2.dayOfMonth().compareTo(dt1) > 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32801);assertEquals(true, test1.dayOfMonth().compareTo(dt1) == 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32802);try {
            __CLR4_4_1p2dp2dlc8azvas.R.inc(32803);test1.dayOfMonth().compareTo((ReadableInstant) null);
            __CLR4_4_1p2dp2dlc8azvas.R.inc(32804);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertyEquals() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),32805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2ub0zpb9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32805,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2ub0zpb9(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(32805);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32806);LocalDateTime test1 = new LocalDateTime(2005, 11, 8, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32807);LocalDateTime test2 = new LocalDateTime(2005, 11, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32808);LocalDateTime test3 = new LocalDateTime(2005, 11, 8, 10, 20, 30, 40, COPTIC_UTC);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32809);assertEquals(false, test1.dayOfMonth().equals(test1.year()));
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32810);assertEquals(false, test1.dayOfMonth().equals(test1.monthOfYear()));
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32811);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32812);assertEquals(false, test1.dayOfMonth().equals(test2.year()));
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32813);assertEquals(false, test1.dayOfMonth().equals(test2.monthOfYear()));
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32814);assertEquals(false, test1.dayOfMonth().equals(test2.dayOfMonth()));
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32815);assertEquals(false, test1.monthOfYear().equals(test1.year()));
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32816);assertEquals(true, test1.monthOfYear().equals(test1.monthOfYear()));
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32817);assertEquals(false, test1.monthOfYear().equals(test1.dayOfMonth()));
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32818);assertEquals(false, test1.monthOfYear().equals(test2.year()));
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32819);assertEquals(true, test1.monthOfYear().equals(test2.monthOfYear()));
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32820);assertEquals(false, test1.monthOfYear().equals(test2.dayOfMonth()));
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32821);assertEquals(false, test1.dayOfMonth().equals(null));
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32822);assertEquals(false, test1.dayOfMonth().equals("any"));
        
        // chrono
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32823);assertEquals(false, test1.dayOfMonth().equals(test3.dayOfMonth()));
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertyHashCode() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),32824);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y278s7pbs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32824,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y278s7pbs(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(32824);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32825);LocalDateTime test1 = new LocalDateTime(2005, 11, 8, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32826);LocalDateTime test2 = new LocalDateTime(2005, 11, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32827);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32828);assertEquals(false, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32829);assertEquals(true, test1.monthOfYear().hashCode() == test1.monthOfYear().hashCode());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32830);assertEquals(true, test1.monthOfYear().hashCode() == test2.monthOfYear().hashCode());
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetHour() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),32831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mry6kapbz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyGetHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32831,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mry6kapbz(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(32831);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32832);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32833);assertSame(test.getChronology().hourOfDay(), test.hourOfDay().getField());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32834);assertEquals("hourOfDay", test.hourOfDay().getName());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32835);assertEquals("Property[hourOfDay]", test.hourOfDay().toString());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32836);assertSame(test, test.hourOfDay().getLocalDateTime());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32837);assertEquals(10, test.hourOfDay().get());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32838);assertEquals("10", test.hourOfDay().getAsString());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32839);assertEquals("10", test.hourOfDay().getAsText());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32840);assertEquals("10", test.hourOfDay().getAsText(Locale.FRENCH));
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32841);assertEquals("10", test.hourOfDay().getAsShortText());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32842);assertEquals("10", test.hourOfDay().getAsShortText(Locale.FRENCH));
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32843);assertEquals(test.getChronology().hours(), test.hourOfDay().getDurationField());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32844);assertEquals(test.getChronology().days(), test.hourOfDay().getRangeDurationField());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32845);assertEquals(2, test.hourOfDay().getMaximumTextLength(null));
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32846);assertEquals(2, test.hourOfDay().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertyRoundHour() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),32847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kobpgypcf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyRoundHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32847,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kobpgypcf(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(32847);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32848);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32849);check(test.hourOfDay().roundCeilingCopy(), 2005, 6, 9, 11, 0, 0, 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32850);check(test.hourOfDay().roundFloorCopy(), 2005, 6, 9, 10, 0, 0, 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32851);check(test.hourOfDay().roundHalfCeilingCopy(), 2005, 6, 9, 10, 0, 0, 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32852);check(test.hourOfDay().roundHalfFloorCopy(), 2005, 6, 9, 10, 0, 0, 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32853);check(test.hourOfDay().roundHalfEvenCopy(), 2005, 6, 9, 10, 0, 0, 0);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32854);test = new LocalDateTime(2005, 6, 9, 10, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32855);check(test.hourOfDay().roundCeilingCopy(), 2005, 6, 9, 11, 0, 0, 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32856);check(test.hourOfDay().roundFloorCopy(), 2005, 6, 9, 10, 0, 0, 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32857);check(test.hourOfDay().roundHalfCeilingCopy(), 2005, 6, 9, 11, 0, 0, 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32858);check(test.hourOfDay().roundHalfFloorCopy(), 2005, 6, 9, 11, 0, 0, 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32859);check(test.hourOfDay().roundHalfEvenCopy(), 2005, 6, 9, 11, 0, 0, 0);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32860);test = new LocalDateTime(2005, 6, 9, 10, 30);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32861);check(test.hourOfDay().roundCeilingCopy(), 2005, 6, 9, 11, 0, 0, 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32862);check(test.hourOfDay().roundFloorCopy(), 2005, 6, 9, 10, 0, 0, 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32863);check(test.hourOfDay().roundHalfCeilingCopy(), 2005, 6, 9, 11, 0, 0, 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32864);check(test.hourOfDay().roundHalfFloorCopy(), 2005, 6, 9, 10, 0, 0, 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32865);check(test.hourOfDay().roundHalfEvenCopy(), 2005, 6, 9, 10, 0, 0, 0);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32866);test = new LocalDateTime(2005, 6, 9, 11, 30);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32867);check(test.hourOfDay().roundCeilingCopy(), 2005, 6, 9, 12, 0, 0, 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32868);check(test.hourOfDay().roundFloorCopy(), 2005, 6, 9, 11, 0, 0, 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32869);check(test.hourOfDay().roundHalfCeilingCopy(), 2005, 6, 9, 12, 0, 0, 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32870);check(test.hourOfDay().roundHalfFloorCopy(), 2005, 6, 9, 11, 0, 0, 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32871);check(test.hourOfDay().roundHalfEvenCopy(), 2005, 6, 9, 12, 0, 0, 0);
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertyGetMaxMinValuesHour() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),32872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13xi8wmpd4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyGetMaxMinValuesHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32872,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13xi8wmpd4(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(32872);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32873);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32874);assertEquals(0, test.hourOfDay().getMinimumValue());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32875);assertEquals(0, test.hourOfDay().getMinimumValueOverall());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32876);assertEquals(23, test.hourOfDay().getMaximumValue());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32877);assertEquals(23, test.hourOfDay().getMaximumValueOverall());
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertyWithMaxMinValueHour() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),32878);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zhdwhpda();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyWithMaxMinValueHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32878,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zhdwhpda(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(32878);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32879);LocalDateTime test = new LocalDateTime(2005, 6, 9, 0, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32880);check(test.hourOfDay().withMaximumValue(), 2005, 6, 9, 23, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32881);check(test.hourOfDay().withMinimumValue(), 2005, 6, 9, 0, 20, 30, 40);
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertyAddToCopyHour() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),32882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1je6pijpde();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyAddToCopyHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32882,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1je6pijpde(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(32882);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32883);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32884);LocalDateTime copy = test.hourOfDay().addToCopy(9);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32885);check(test, 2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32886);check(copy, 2005, 6, 9, 19, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32887);copy = test.hourOfDay().addToCopy(0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32888);check(copy, 2005, 6, 9, 10, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32889);copy = test.hourOfDay().addToCopy(13);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32890);check(copy, 2005, 6, 9, 23, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32891);copy = test.hourOfDay().addToCopy(14);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32892);check(copy, 2005, 6, 10, 0, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32893);copy = test.hourOfDay().addToCopy(-10);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32894);check(copy, 2005, 6, 9, 0, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32895);copy = test.hourOfDay().addToCopy(-11);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32896);check(copy, 2005, 6, 8, 23, 20, 30, 40);
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertyAddWrapFieldToCopyHour() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),32897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i3mgeppdt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyAddWrapFieldToCopyHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32897,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i3mgeppdt(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(32897);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32898);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32899);LocalDateTime copy = test.hourOfDay().addWrapFieldToCopy(9);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32900);check(test, 2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32901);check(copy, 2005, 6, 9, 19, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32902);copy = test.hourOfDay().addWrapFieldToCopy(0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32903);check(copy, 2005, 6, 9, 10, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32904);copy = test.hourOfDay().addWrapFieldToCopy(18);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32905);check(copy, 2005, 6, 9, 4, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32906);copy = test.hourOfDay().addWrapFieldToCopy(-15);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32907);check(copy, 2005, 6, 9, 19, 20, 30, 40);
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertySetHour() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),32908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hyrp2ype4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertySetHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32908,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hyrp2ype4(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(32908);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32909);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32910);LocalDateTime copy = test.hourOfDay().setCopy(12);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32911);check(test, 2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32912);check(copy, 2005, 6, 9, 12, 20, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32913);try {
            __CLR4_4_1p2dp2dlc8azvas.R.inc(32914);test.hourOfDay().setCopy(24);
            __CLR4_4_1p2dp2dlc8azvas.R.inc(32915);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32916);try {
            __CLR4_4_1p2dp2dlc8azvas.R.inc(32917);test.hourOfDay().setCopy(-1);
            __CLR4_4_1p2dp2dlc8azvas.R.inc(32918);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertySetTextHour() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),32919);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14yha19pef();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertySetTextHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32919,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14yha19pef(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(32919);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32920);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32921);LocalDateTime copy = test.hourOfDay().setCopy("12");
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32922);check(test, 2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32923);check(copy, 2005, 6, 9, 12, 20, 30, 40);
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertyWithMaximumValueHour() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),32924);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1otnz93pek();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyWithMaximumValueHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32924,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1otnz93pek(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(32924);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32925);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32926);LocalDateTime copy = test.hourOfDay().withMaximumValue();
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32927);check(test, 2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32928);check(copy, 2005, 6, 9, 23, 20, 30, 40);
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertyWithMinimumValueHour() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),32929);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n6uf1hpep();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyWithMinimumValueHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32929,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n6uf1hpep(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(32929);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32930);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32931);LocalDateTime copy = test.hourOfDay().withMinimumValue();
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32932);check(test, 2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32933);check(copy, 2005, 6, 9, 0, 20, 30, 40);
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertyCompareToHour() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),32934);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_174ldgcpeu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyCompareToHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32934,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_174ldgcpeu(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(32934);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32935);LocalDateTime test1 = new LocalDateTime(TEST_TIME1);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32936);LocalDateTime test2 = new LocalDateTime(TEST_TIME2);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32937);assertEquals(true, test1.hourOfDay().compareTo(test2) < 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32938);assertEquals(true, test2.hourOfDay().compareTo(test1) > 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32939);assertEquals(true, test1.hourOfDay().compareTo(test1) == 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32940);try {
            __CLR4_4_1p2dp2dlc8azvas.R.inc(32941);test1.hourOfDay().compareTo((ReadablePartial) null);
            __CLR4_4_1p2dp2dlc8azvas.R.inc(32942);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32943);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32944);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32945);assertEquals(true, test1.hourOfDay().compareTo(dt2) < 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32946);assertEquals(true, test2.hourOfDay().compareTo(dt1) > 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32947);assertEquals(true, test1.hourOfDay().compareTo(dt1) == 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32948);try {
            __CLR4_4_1p2dp2dlc8azvas.R.inc(32949);test1.hourOfDay().compareTo((ReadableInstant) null);
            __CLR4_4_1p2dp2dlc8azvas.R.inc(32950);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetMinute() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),32951);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oej7l6pfb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyGetMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32951,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oej7l6pfb(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(32951);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32952);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32953);assertSame(test.getChronology().minuteOfHour(), test.minuteOfHour().getField());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32954);assertEquals("minuteOfHour", test.minuteOfHour().getName());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32955);assertEquals("Property[minuteOfHour]", test.minuteOfHour().toString());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32956);assertSame(test, test.minuteOfHour().getLocalDateTime());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32957);assertEquals(20, test.minuteOfHour().get());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32958);assertEquals("20", test.minuteOfHour().getAsString());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32959);assertEquals("20", test.minuteOfHour().getAsText());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32960);assertEquals("20", test.minuteOfHour().getAsText(Locale.FRENCH));
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32961);assertEquals("20", test.minuteOfHour().getAsShortText());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32962);assertEquals("20", test.minuteOfHour().getAsShortText(Locale.FRENCH));
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32963);assertEquals(test.getChronology().minutes(), test.minuteOfHour().getDurationField());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32964);assertEquals(test.getChronology().hours(), test.minuteOfHour().getRangeDurationField());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32965);assertEquals(2, test.minuteOfHour().getMaximumTextLength(null));
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32966);assertEquals(2, test.minuteOfHour().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertyGetMaxMinValuesMinute() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),32967);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_110m2u2pfr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyGetMaxMinValuesMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32967,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_110m2u2pfr(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(32967);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32968);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32969);assertEquals(0, test.minuteOfHour().getMinimumValue());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32970);assertEquals(0, test.minuteOfHour().getMinimumValueOverall());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32971);assertEquals(59, test.minuteOfHour().getMaximumValue());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32972);assertEquals(59, test.minuteOfHour().getMaximumValueOverall());
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertyWithMaxMinValueMinute() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),32973);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xepr5bpfx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyWithMaxMinValueMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32973,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xepr5bpfx(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(32973);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32974);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32975);check(test.minuteOfHour().withMaximumValue(), 2005, 6, 9, 10, 59, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32976);check(test.minuteOfHour().withMinimumValue(), 2005, 6, 9, 10, 0, 30, 40);
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertyAddToCopyMinute() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),32977);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1drttdnpg1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyAddToCopyMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32977,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1drttdnpg1(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(32977);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32978);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32979);LocalDateTime copy = test.minuteOfHour().addToCopy(9);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32980);check(test, 2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32981);check(copy, 2005, 6, 9, 10, 29, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32982);copy = test.minuteOfHour().addToCopy(39);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32983);check(copy, 2005, 6, 9, 10, 59, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32984);copy = test.minuteOfHour().addToCopy(40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32985);check(copy, 2005, 6, 9, 11, 0, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32986);copy = test.minuteOfHour().addToCopy(1 * 60 + 45);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32987);check(copy, 2005, 6, 9, 12, 5, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32988);copy = test.minuteOfHour().addToCopy(13 * 60 + 39);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32989);check(copy, 2005, 6, 9, 23, 59, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32990);copy = test.minuteOfHour().addToCopy(13 * 60 + 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32991);check(copy, 2005, 6, 10, 0, 0, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32992);copy = test.minuteOfHour().addToCopy(-9);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32993);check(copy, 2005, 6, 9, 10, 11, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32994);copy = test.minuteOfHour().addToCopy(-19);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32995);check(copy, 2005, 6, 9, 10, 1, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32996);copy = test.minuteOfHour().addToCopy(-20);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32997);check(copy, 2005, 6, 9, 10, 0, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32998);copy = test.minuteOfHour().addToCopy(-21);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(32999);check(copy, 2005, 6, 9, 9, 59, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33000);copy = test.minuteOfHour().addToCopy(-(10 * 60 + 20));
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33001);check(copy, 2005, 6, 9, 0, 0, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33002);copy = test.minuteOfHour().addToCopy(-(10 * 60 + 21));
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33003);check(copy, 2005, 6, 8, 23, 59, 30, 40);
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertyAddWrapFieldToCopyMinute() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),33004);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15zlgzlpgs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyAddWrapFieldToCopyMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33004,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15zlgzlpgs(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(33004);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33005);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33006);LocalDateTime copy = test.minuteOfHour().addWrapFieldToCopy(9);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33007);check(test, 2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33008);check(copy, 2005, 6, 9, 10, 29, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33009);copy = test.minuteOfHour().addWrapFieldToCopy(49);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33010);check(copy, 2005, 6, 9, 10, 9, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33011);copy = test.minuteOfHour().addWrapFieldToCopy(-47);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33012);check(copy, 2005, 6, 9, 10, 33, 30, 40);
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertySetMinute() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),33013);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_196rp2uph1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertySetMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33013,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_196rp2uph1(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(33013);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33014);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33015);LocalDateTime copy = test.minuteOfHour().setCopy(12);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33016);check(test, 2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33017);check(copy, 2005, 6, 9, 10, 12, 30, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33018);try {
            __CLR4_4_1p2dp2dlc8azvas.R.inc(33019);test.minuteOfHour().setCopy(60);
            __CLR4_4_1p2dp2dlc8azvas.R.inc(33020);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33021);try {
            __CLR4_4_1p2dp2dlc8azvas.R.inc(33022);test.minuteOfHour().setCopy(-1);
            __CLR4_4_1p2dp2dlc8azvas.R.inc(33023);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertySetTextMinute() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),33024);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18h1pnnphc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertySetTextMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33024,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18h1pnnphc(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(33024);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33025);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33026);LocalDateTime copy = test.minuteOfHour().setCopy("12");
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33027);check(test, 2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33028);check(copy, 2005, 6, 9, 10, 12, 30, 40);
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertyCompareToMinute() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),33029);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gtzyp8phh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyCompareToMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33029,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gtzyp8phh(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(33029);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33030);LocalDateTime test1 = new LocalDateTime(TEST_TIME1);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33031);LocalDateTime test2 = new LocalDateTime(TEST_TIME2);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33032);assertEquals(true, test1.minuteOfHour().compareTo(test2) < 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33033);assertEquals(true, test2.minuteOfHour().compareTo(test1) > 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33034);assertEquals(true, test1.minuteOfHour().compareTo(test1) == 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33035);try {
            __CLR4_4_1p2dp2dlc8azvas.R.inc(33036);test1.minuteOfHour().compareTo((ReadablePartial) null);
            __CLR4_4_1p2dp2dlc8azvas.R.inc(33037);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33038);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33039);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33040);assertEquals(true, test1.minuteOfHour().compareTo(dt2) < 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33041);assertEquals(true, test2.minuteOfHour().compareTo(dt1) > 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33042);assertEquals(true, test1.minuteOfHour().compareTo(dt1) == 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33043);try {
            __CLR4_4_1p2dp2dlc8azvas.R.inc(33044);test1.minuteOfHour().compareTo((ReadableInstant) null);
            __CLR4_4_1p2dp2dlc8azvas.R.inc(33045);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetSecond() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),33046);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1plsrcmphy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyGetSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33046,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1plsrcmphy(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(33046);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33047);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33048);assertSame(test.getChronology().secondOfMinute(), test.secondOfMinute().getField());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33049);assertEquals("secondOfMinute", test.secondOfMinute().getName());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33050);assertEquals("Property[secondOfMinute]", test.secondOfMinute().toString());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33051);assertSame(test, test.secondOfMinute().getLocalDateTime());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33052);assertEquals(30, test.secondOfMinute().get());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33053);assertEquals("30", test.secondOfMinute().getAsString());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33054);assertEquals("30", test.secondOfMinute().getAsText());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33055);assertEquals("30", test.secondOfMinute().getAsText(Locale.FRENCH));
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33056);assertEquals("30", test.secondOfMinute().getAsShortText());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33057);assertEquals("30", test.secondOfMinute().getAsShortText(Locale.FRENCH));
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33058);assertEquals(test.getChronology().seconds(), test.secondOfMinute().getDurationField());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33059);assertEquals(test.getChronology().minutes(), test.secondOfMinute().getRangeDurationField());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33060);assertEquals(2, test.secondOfMinute().getMaximumTextLength(null));
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33061);assertEquals(2, test.secondOfMinute().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertyGetMaxMinValuesSecond() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),33062);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m1e5vepie();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyGetMaxMinValuesSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33062,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m1e5vepie(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(33062);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33063);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33064);assertEquals(0, test.secondOfMinute().getMinimumValue());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33065);assertEquals(0, test.secondOfMinute().getMinimumValueOverall());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33066);assertEquals(59, test.secondOfMinute().getMaximumValue());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33067);assertEquals(59, test.secondOfMinute().getMaximumValueOverall());
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertyWithMaxMinValueSecond() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),33068);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cdxo3zpik();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyWithMaxMinValueSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33068,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cdxo3zpik(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(33068);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33069);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33070);check(test.secondOfMinute().withMaximumValue(), 2005, 6, 9, 10, 20, 59, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33071);check(test.secondOfMinute().withMinimumValue(), 2005, 6, 9, 10, 20, 0, 40);
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertyAddToCopySecond() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),33072);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_178y9nppio();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyAddToCopySecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33072,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_178y9nppio(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(33072);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33073);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33074);LocalDateTime copy = test.secondOfMinute().addToCopy(9);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33075);check(test, 2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33076);check(copy, 2005, 6, 9, 10, 20, 39, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33077);copy = test.secondOfMinute().addToCopy(29);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33078);check(copy, 2005, 6, 9, 10, 20, 59, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33079);copy = test.secondOfMinute().addToCopy(30);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33080);check(copy, 2005, 6, 9, 10, 21, 0, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33081);copy = test.secondOfMinute().addToCopy(39 * 60 + 29);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33082);check(copy, 2005, 6, 9, 10, 59, 59, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33083);copy = test.secondOfMinute().addToCopy(39 * 60 + 30);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33084);check(copy, 2005, 6, 9, 11, 0, 0, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33085);copy = test.secondOfMinute().addToCopy(13 * 60 * 60 + 39 * 60 + 30);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33086);check(copy, 2005, 6, 10, 0, 0, 0, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33087);copy = test.secondOfMinute().addToCopy(-9);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33088);check(copy, 2005, 6, 9, 10, 20, 21, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33089);copy = test.secondOfMinute().addToCopy(-30);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33090);check(copy, 2005, 6, 9, 10, 20, 0, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33091);copy = test.secondOfMinute().addToCopy(-31);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33092);check(copy, 2005, 6, 9, 10, 19, 59, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33093);copy = test.secondOfMinute().addToCopy(-(10 * 60 * 60 + 20 * 60 + 30));
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33094);check(copy, 2005, 6, 9, 0, 0, 0, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33095);copy = test.secondOfMinute().addToCopy(-(10 * 60 * 60 + 20 * 60 + 31));
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33096);check(copy, 2005, 6, 8, 23, 59, 59, 40);
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertyAddWrapFieldToCopySecond() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),33097);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r0dk0xpjd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyAddWrapFieldToCopySecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33097,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r0dk0xpjd(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(33097);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33098);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33099);LocalDateTime copy = test.secondOfMinute().addWrapFieldToCopy(9);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33100);check(test, 2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33101);check(copy, 2005, 6, 9, 10, 20, 39, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33102);copy = test.secondOfMinute().addWrapFieldToCopy(49);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33103);check(copy, 2005, 6, 9, 10, 20, 19, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33104);copy = test.secondOfMinute().addWrapFieldToCopy(-47);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33105);check(copy, 2005, 6, 9, 10, 20, 43, 40);
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertySetSecond() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),33106);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u7js46pjm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertySetSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33106,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u7js46pjm(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(33106);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33107);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33108);LocalDateTime copy = test.secondOfMinute().setCopy(12);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33109);check(test, 2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33110);check(copy, 2005, 6, 9, 10, 20, 12, 40);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33111);try {
            __CLR4_4_1p2dp2dlc8azvas.R.inc(33112);test.secondOfMinute().setCopy(60);
            __CLR4_4_1p2dp2dlc8azvas.R.inc(33113);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33114);try {
            __CLR4_4_1p2dp2dlc8azvas.R.inc(33115);test.secondOfMinute().setCopy(-1);
            __CLR4_4_1p2dp2dlc8azvas.R.inc(33116);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertySetTextSecond() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),33117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1thtsozpjx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertySetTextSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33117,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1thtsozpjx(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(33117);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33118);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33119);LocalDateTime copy = test.secondOfMinute().setCopy("12");
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33120);check(test, 2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33121);check(copy, 2005, 6, 9, 10, 20, 12, 40);
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertyCompareToSecond() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),33122);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_146s4c4pk2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyCompareToSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33122,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_146s4c4pk2(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(33122);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33123);LocalDateTime test1 = new LocalDateTime(TEST_TIME1);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33124);LocalDateTime test2 = new LocalDateTime(TEST_TIME2);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33125);assertEquals(true, test1.secondOfMinute().compareTo(test2) < 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33126);assertEquals(true, test2.secondOfMinute().compareTo(test1) > 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33127);assertEquals(true, test1.secondOfMinute().compareTo(test1) == 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33128);try {
            __CLR4_4_1p2dp2dlc8azvas.R.inc(33129);test1.secondOfMinute().compareTo((ReadablePartial) null);
            __CLR4_4_1p2dp2dlc8azvas.R.inc(33130);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33131);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33132);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33133);assertEquals(true, test1.secondOfMinute().compareTo(dt2) < 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33134);assertEquals(true, test2.secondOfMinute().compareTo(dt1) > 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33135);assertEquals(true, test1.secondOfMinute().compareTo(dt1) == 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33136);try {
            __CLR4_4_1p2dp2dlc8azvas.R.inc(33137);test1.secondOfMinute().compareTo((ReadableInstant) null);
            __CLR4_4_1p2dp2dlc8azvas.R.inc(33138);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetMilli() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),33139);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15098bpkj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyGetMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33139,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15098bpkj(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(33139);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33140);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33141);assertSame(test.getChronology().millisOfSecond(), test.millisOfSecond().getField());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33142);assertEquals("millisOfSecond", test.millisOfSecond().getName());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33143);assertEquals("Property[millisOfSecond]", test.millisOfSecond().toString());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33144);assertSame(test, test.millisOfSecond().getLocalDateTime());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33145);assertEquals(40, test.millisOfSecond().get());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33146);assertEquals("40", test.millisOfSecond().getAsString());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33147);assertEquals("40", test.millisOfSecond().getAsText());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33148);assertEquals("40", test.millisOfSecond().getAsText(Locale.FRENCH));
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33149);assertEquals("40", test.millisOfSecond().getAsShortText());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33150);assertEquals("40", test.millisOfSecond().getAsShortText(Locale.FRENCH));
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33151);assertEquals(test.getChronology().millis(), test.millisOfSecond().getDurationField());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33152);assertEquals(test.getChronology().seconds(), test.millisOfSecond().getRangeDurationField());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33153);assertEquals(3, test.millisOfSecond().getMaximumTextLength(null));
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33154);assertEquals(3, test.millisOfSecond().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertyGetMaxMinValuesMilli() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),33155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ob72xhpkz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyGetMaxMinValuesMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33155,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ob72xhpkz(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(33155);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33156);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33157);assertEquals(0, test.millisOfSecond().getMinimumValue());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33158);assertEquals(0, test.millisOfSecond().getMinimumValueOverall());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33159);assertEquals(999, test.millisOfSecond().getMaximumValue());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33160);assertEquals(999, test.millisOfSecond().getMaximumValueOverall());
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertyWithMaxMinValueMilli() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),33161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ynnm0upl5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyWithMaxMinValueMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33161,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ynnm0upl5(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(33161);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33162);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33163);check(test.millisOfSecond().withMaximumValue(), 2005, 6, 9, 10, 20, 30, 999);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33164);check(test.millisOfSecond().withMinimumValue(), 2005, 6, 9, 10, 20, 30, 0);
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertyAddToCopyMilli() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),33165);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sv6w3apl9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyAddToCopyMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33165,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sv6w3apl9(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(33165);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33166);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33167);LocalDateTime copy = test.millisOfSecond().addToCopy(9);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33168);check(test, 2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33169);check(copy, 2005, 6, 9, 10, 20, 30, 49);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33170);copy = test.millisOfSecond().addToCopy(959);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33171);check(copy, 2005, 6, 9, 10, 20, 30, 999);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33172);copy = test.millisOfSecond().addToCopy(960);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33173);check(copy, 2005, 6, 9, 10, 20, 31, 0);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33174);copy = test.millisOfSecond().addToCopy(13 * 60 * 60 * 1000 + 39 * 60 * 1000 + 29 * 1000 + 959);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33175);check(copy, 2005, 6, 9, 23, 59, 59, 999);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33176);copy = test.millisOfSecond().addToCopy(13 * 60 * 60 * 1000 + 39 * 60 * 1000 + 29 * 1000 + 960);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33177);check(copy, 2005, 6, 10, 0, 0, 0, 0);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33178);copy = test.millisOfSecond().addToCopy(-9);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33179);check(copy, 2005, 6, 9, 10, 20, 30, 31);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33180);copy = test.millisOfSecond().addToCopy(-40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33181);check(copy, 2005, 6, 9, 10, 20, 30, 0);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33182);copy = test.millisOfSecond().addToCopy(-41);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33183);check(copy, 2005, 6, 9, 10, 20, 29, 999);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33184);copy = test.millisOfSecond().addToCopy(-(10 * 60 * 60 * 1000 + 20 * 60 * 1000 + 30 * 1000 + 40));
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33185);check(copy, 2005, 6, 9, 0, 0, 0, 0);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33186);copy = test.millisOfSecond().addToCopy(-(10 * 60 * 60 * 1000 + 20 * 60 * 1000 + 30 * 1000 + 41));
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33187);check(copy, 2005, 6, 8, 23, 59, 59, 999);
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertyAddWrapFieldToCopyMilli() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),33188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_130vo36plw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyAddWrapFieldToCopyMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33188,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_130vo36plw(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(33188);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33189);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33190);LocalDateTime copy = test.millisOfSecond().addWrapFieldToCopy(9);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33191);check(test, 2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33192);check(copy, 2005, 6, 9, 10, 20, 30, 49);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33193);copy = test.millisOfSecond().addWrapFieldToCopy(995);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33194);check(copy, 2005, 6, 9, 10, 20, 30, 35);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33195);copy = test.millisOfSecond().addWrapFieldToCopy(-47);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33196);check(copy, 2005, 6, 9, 10, 20, 30, 993);
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertySetMilli() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),33197);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1feqhbtpm5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertySetMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33197,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1feqhbtpm5(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(33197);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33198);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33199);LocalDateTime copy = test.millisOfSecond().setCopy(12);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33200);check(test, 2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33201);check(copy, 2005, 6, 9, 10, 20, 30, 12);
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33202);try {
            __CLR4_4_1p2dp2dlc8azvas.R.inc(33203);test.millisOfSecond().setCopy(1000);
            __CLR4_4_1p2dp2dlc8azvas.R.inc(33204);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33205);try {
            __CLR4_4_1p2dp2dlc8azvas.R.inc(33206);test.millisOfSecond().setCopy(-1);
            __CLR4_4_1p2dp2dlc8azvas.R.inc(33207);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertySetTextMilli() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),33208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17iyw2cpmg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertySetTextMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33208,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17iyw2cpmg(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(33208);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33209);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33210);LocalDateTime copy = test.millisOfSecond().setCopy("12");
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33211);check(test, 2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33212);check(copy, 2005, 6, 9, 10, 20, 30, 12);
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    public void testPropertyCompareToMilli() {__CLR4_4_1p2dp2dlc8azvas.R.globalSliceStart(getClass().getName(),33213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13rds2tpml();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p2dp2dlc8azvas.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p2dp2dlc8azvas.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyCompareToMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33213,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13rds2tpml(){try{__CLR4_4_1p2dp2dlc8azvas.R.inc(33213);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33214);LocalDateTime test1 = new LocalDateTime(TEST_TIME1);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33215);LocalDateTime test2 = new LocalDateTime(TEST_TIME2);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33216);assertEquals(true, test1.millisOfSecond().compareTo(test2) < 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33217);assertEquals(true, test2.millisOfSecond().compareTo(test1) > 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33218);assertEquals(true, test1.millisOfSecond().compareTo(test1) == 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33219);try {
            __CLR4_4_1p2dp2dlc8azvas.R.inc(33220);test1.millisOfSecond().compareTo((ReadablePartial) null);
            __CLR4_4_1p2dp2dlc8azvas.R.inc(33221);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33222);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33223);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33224);assertEquals(true, test1.millisOfSecond().compareTo(dt2) < 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33225);assertEquals(true, test2.millisOfSecond().compareTo(dt1) > 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33226);assertEquals(true, test1.millisOfSecond().compareTo(dt1) == 0);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33227);try {
            __CLR4_4_1p2dp2dlc8azvas.R.inc(33228);test1.millisOfSecond().compareTo((ReadableInstant) null);
            __CLR4_4_1p2dp2dlc8azvas.R.inc(33229);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void check(LocalDateTime test, int year, int month, int day, int hour, int min, int sec, int mil) {try{__CLR4_4_1p2dp2dlc8azvas.R.inc(33230);
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33231);assertEquals(year, test.getYear());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33232);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33233);assertEquals(day, test.getDayOfMonth());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33234);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33235);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33236);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1p2dp2dlc8azvas.R.inc(33237);assertEquals(mil, test.getMillisOfSecond());
    }finally{__CLR4_4_1p2dp2dlc8azvas.R.flushNeeded();}}
}
