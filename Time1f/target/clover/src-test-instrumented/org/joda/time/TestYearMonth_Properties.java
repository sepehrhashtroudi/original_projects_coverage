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
 * This class is a Junit unit test for YearMonth.
 *
 * @author Stephen Colebourne
 */
public class TestYearMonth_Properties extends TestCase {static class __CLR4_4_112a812a8lc8azwir{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,49846,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public static void main(String[] args) {try{__CLR4_4_112a812a8lc8azwir.R.inc(49616);
        __CLR4_4_112a812a8lc8azwir.R.inc(49617);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_112a812a8lc8azwir.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_112a812a8lc8azwir.R.inc(49618);
        __CLR4_4_112a812a8lc8azwir.R.inc(49619);return new TestSuite(TestYearMonth_Properties.class);
    }finally{__CLR4_4_112a812a8lc8azwir.R.flushNeeded();}}

    public TestYearMonth_Properties(String name) {
        super(name);__CLR4_4_112a812a8lc8azwir.R.inc(49621);try{__CLR4_4_112a812a8lc8azwir.R.inc(49620);
    }finally{__CLR4_4_112a812a8lc8azwir.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_112a812a8lc8azwir.R.inc(49622);
        __CLR4_4_112a812a8lc8azwir.R.inc(49623);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_112a812a8lc8azwir.R.inc(49624);zone = DateTimeZone.getDefault();
        __CLR4_4_112a812a8lc8azwir.R.inc(49625);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_112a812a8lc8azwir.R.inc(49626);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_112a812a8lc8azwir.R.inc(49627);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_112a812a8lc8azwir.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_112a812a8lc8azwir.R.inc(49628);
        __CLR4_4_112a812a8lc8azwir.R.inc(49629);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_112a812a8lc8azwir.R.inc(49630);DateTimeZone.setDefault(zone);
        __CLR4_4_112a812a8lc8azwir.R.inc(49631);zone = null;
        __CLR4_4_112a812a8lc8azwir.R.inc(49632);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_112a812a8lc8azwir.R.inc(49633);systemDefaultLocale = null;
    }finally{__CLR4_4_112a812a8lc8azwir.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetYear() {__CLR4_4_112a812a8lc8azwir.R.globalSliceStart(getClass().getName(),49634);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tgqcqb12aq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112a812a8lc8azwir.R.rethrow($CLV_t2$);}finally{__CLR4_4_112a812a8lc8azwir.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyGetYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49634,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tgqcqb12aq(){try{__CLR4_4_112a812a8lc8azwir.R.inc(49634);
        __CLR4_4_112a812a8lc8azwir.R.inc(49635);YearMonth test = new YearMonth(1972, 6);
        __CLR4_4_112a812a8lc8azwir.R.inc(49636);assertSame(test.getChronology().year(), test.year().getField());
        __CLR4_4_112a812a8lc8azwir.R.inc(49637);assertEquals("year", test.year().getName());
        __CLR4_4_112a812a8lc8azwir.R.inc(49638);assertEquals("Property[year]", test.year().toString());
        __CLR4_4_112a812a8lc8azwir.R.inc(49639);assertSame(test, test.year().getReadablePartial());
        __CLR4_4_112a812a8lc8azwir.R.inc(49640);assertSame(test, test.year().getYearMonth());
        __CLR4_4_112a812a8lc8azwir.R.inc(49641);assertEquals(1972, test.year().get());
        __CLR4_4_112a812a8lc8azwir.R.inc(49642);assertEquals("1972", test.year().getAsString());
        __CLR4_4_112a812a8lc8azwir.R.inc(49643);assertEquals("1972", test.year().getAsText());
        __CLR4_4_112a812a8lc8azwir.R.inc(49644);assertEquals("1972", test.year().getAsText(Locale.FRENCH));
        __CLR4_4_112a812a8lc8azwir.R.inc(49645);assertEquals("1972", test.year().getAsShortText());
        __CLR4_4_112a812a8lc8azwir.R.inc(49646);assertEquals("1972", test.year().getAsShortText(Locale.FRENCH));
        __CLR4_4_112a812a8lc8azwir.R.inc(49647);assertEquals(test.getChronology().years(), test.year().getDurationField());
        __CLR4_4_112a812a8lc8azwir.R.inc(49648);assertEquals(null, test.year().getRangeDurationField());
        __CLR4_4_112a812a8lc8azwir.R.inc(49649);assertEquals(9, test.year().getMaximumTextLength(null));
        __CLR4_4_112a812a8lc8azwir.R.inc(49650);assertEquals(9, test.year().getMaximumShortTextLength(null));
    }finally{__CLR4_4_112a812a8lc8azwir.R.flushNeeded();}}

    public void testPropertyGetMaxMinValuesYear() {__CLR4_4_112a812a8lc8azwir.R.globalSliceStart(getClass().getName(),49651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12r9x9f12b7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112a812a8lc8azwir.R.rethrow($CLV_t2$);}finally{__CLR4_4_112a812a8lc8azwir.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyGetMaxMinValuesYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49651,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12r9x9f12b7(){try{__CLR4_4_112a812a8lc8azwir.R.inc(49651);
        __CLR4_4_112a812a8lc8azwir.R.inc(49652);YearMonth test = new YearMonth(1972, 6);
        __CLR4_4_112a812a8lc8azwir.R.inc(49653);assertEquals(-292275054, test.year().getMinimumValue());
        __CLR4_4_112a812a8lc8azwir.R.inc(49654);assertEquals(-292275054, test.year().getMinimumValueOverall());
        __CLR4_4_112a812a8lc8azwir.R.inc(49655);assertEquals(292278993, test.year().getMaximumValue());
        __CLR4_4_112a812a8lc8azwir.R.inc(49656);assertEquals(292278993, test.year().getMaximumValueOverall());
    }finally{__CLR4_4_112a812a8lc8azwir.R.flushNeeded();}}

    public void testPropertyAddYear() {__CLR4_4_112a812a8lc8azwir.R.globalSliceStart(getClass().getName(),49657);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c0tefy12bd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112a812a8lc8azwir.R.rethrow($CLV_t2$);}finally{__CLR4_4_112a812a8lc8azwir.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyAddYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49657,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c0tefy12bd(){try{__CLR4_4_112a812a8lc8azwir.R.inc(49657);
        __CLR4_4_112a812a8lc8azwir.R.inc(49658);YearMonth test = new YearMonth(1972, 6);
        __CLR4_4_112a812a8lc8azwir.R.inc(49659);YearMonth copy = test.year().addToCopy(9);
        __CLR4_4_112a812a8lc8azwir.R.inc(49660);check(test, 1972, 6);
        __CLR4_4_112a812a8lc8azwir.R.inc(49661);check(copy, 1981, 6);
        
        __CLR4_4_112a812a8lc8azwir.R.inc(49662);copy = test.year().addToCopy(0);
        __CLR4_4_112a812a8lc8azwir.R.inc(49663);check(copy, 1972, 6);
        
        __CLR4_4_112a812a8lc8azwir.R.inc(49664);copy = test.year().addToCopy(292277023 - 1972);
        __CLR4_4_112a812a8lc8azwir.R.inc(49665);check(copy, 292277023, 6);
        
        __CLR4_4_112a812a8lc8azwir.R.inc(49666);try {
            __CLR4_4_112a812a8lc8azwir.R.inc(49667);test.year().addToCopy(292278993 - 1972 + 1);
            __CLR4_4_112a812a8lc8azwir.R.inc(49668);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_112a812a8lc8azwir.R.inc(49669);check(test, 1972, 6);
        
        __CLR4_4_112a812a8lc8azwir.R.inc(49670);copy = test.year().addToCopy(-1972);
        __CLR4_4_112a812a8lc8azwir.R.inc(49671);check(copy, 0, 6);
        
        __CLR4_4_112a812a8lc8azwir.R.inc(49672);copy = test.year().addToCopy(-1973);
        __CLR4_4_112a812a8lc8azwir.R.inc(49673);check(copy, -1, 6);
        
        __CLR4_4_112a812a8lc8azwir.R.inc(49674);try {
            __CLR4_4_112a812a8lc8azwir.R.inc(49675);test.year().addToCopy(-292275054 - 1972 - 1);
            __CLR4_4_112a812a8lc8azwir.R.inc(49676);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_112a812a8lc8azwir.R.inc(49677);check(test, 1972, 6);
    }finally{__CLR4_4_112a812a8lc8azwir.R.flushNeeded();}}

    public void testPropertyAddWrapFieldYear() {__CLR4_4_112a812a8lc8azwir.R.globalSliceStart(getClass().getName(),49678);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qjgig612by();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112a812a8lc8azwir.R.rethrow($CLV_t2$);}finally{__CLR4_4_112a812a8lc8azwir.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyAddWrapFieldYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49678,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qjgig612by(){try{__CLR4_4_112a812a8lc8azwir.R.inc(49678);
        __CLR4_4_112a812a8lc8azwir.R.inc(49679);YearMonth test = new YearMonth(1972, 6);
        __CLR4_4_112a812a8lc8azwir.R.inc(49680);YearMonth copy = test.year().addWrapFieldToCopy(9);
        __CLR4_4_112a812a8lc8azwir.R.inc(49681);check(test, 1972, 6);
        __CLR4_4_112a812a8lc8azwir.R.inc(49682);check(copy, 1981, 6);
        
        __CLR4_4_112a812a8lc8azwir.R.inc(49683);copy = test.year().addWrapFieldToCopy(0);
        __CLR4_4_112a812a8lc8azwir.R.inc(49684);check(copy, 1972, 6);
        
        __CLR4_4_112a812a8lc8azwir.R.inc(49685);copy = test.year().addWrapFieldToCopy(292278993 - 1972 + 1);
        __CLR4_4_112a812a8lc8azwir.R.inc(49686);check(copy, -292275054, 6);
        
        __CLR4_4_112a812a8lc8azwir.R.inc(49687);copy = test.year().addWrapFieldToCopy(-292275054 - 1972 - 1);
        __CLR4_4_112a812a8lc8azwir.R.inc(49688);check(copy, 292278993, 6);
    }finally{__CLR4_4_112a812a8lc8azwir.R.flushNeeded();}}

    public void testPropertySetYear() {__CLR4_4_112a812a8lc8azwir.R.globalSliceStart(getClass().getName(),49689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b9ziwx12c9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112a812a8lc8azwir.R.rethrow($CLV_t2$);}finally{__CLR4_4_112a812a8lc8azwir.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertySetYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49689,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b9ziwx12c9(){try{__CLR4_4_112a812a8lc8azwir.R.inc(49689);
        __CLR4_4_112a812a8lc8azwir.R.inc(49690);YearMonth test = new YearMonth(1972, 6);
        __CLR4_4_112a812a8lc8azwir.R.inc(49691);YearMonth copy = test.year().setCopy(12);
        __CLR4_4_112a812a8lc8azwir.R.inc(49692);check(test, 1972, 6);
        __CLR4_4_112a812a8lc8azwir.R.inc(49693);check(copy, 12, 6);
    }finally{__CLR4_4_112a812a8lc8azwir.R.flushNeeded();}}

    public void testPropertySetTextYear() {__CLR4_4_112a812a8lc8azwir.R.globalSliceStart(getClass().getName(),49694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11qaw4s12ce();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112a812a8lc8azwir.R.rethrow($CLV_t2$);}finally{__CLR4_4_112a812a8lc8azwir.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertySetTextYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49694,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11qaw4s12ce(){try{__CLR4_4_112a812a8lc8azwir.R.inc(49694);
        __CLR4_4_112a812a8lc8azwir.R.inc(49695);YearMonth test = new YearMonth(1972, 6);
        __CLR4_4_112a812a8lc8azwir.R.inc(49696);YearMonth copy = test.year().setCopy("12");
        __CLR4_4_112a812a8lc8azwir.R.inc(49697);check(test, 1972, 6);
        __CLR4_4_112a812a8lc8azwir.R.inc(49698);check(copy, 12, 6);
    }finally{__CLR4_4_112a812a8lc8azwir.R.flushNeeded();}}

    public void testPropertyCompareToYear() {__CLR4_4_112a812a8lc8azwir.R.globalSliceStart(getClass().getName(),49699);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ft7ab12cj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112a812a8lc8azwir.R.rethrow($CLV_t2$);}finally{__CLR4_4_112a812a8lc8azwir.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyCompareToYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49699,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ft7ab12cj(){try{__CLR4_4_112a812a8lc8azwir.R.inc(49699);
        __CLR4_4_112a812a8lc8azwir.R.inc(49700);YearMonth test1 = new YearMonth(TEST_TIME1);
        __CLR4_4_112a812a8lc8azwir.R.inc(49701);YearMonth test2 = new YearMonth(TEST_TIME2);
        __CLR4_4_112a812a8lc8azwir.R.inc(49702);assertEquals(true, test1.year().compareTo(test2) < 0);
        __CLR4_4_112a812a8lc8azwir.R.inc(49703);assertEquals(true, test2.year().compareTo(test1) > 0);
        __CLR4_4_112a812a8lc8azwir.R.inc(49704);assertEquals(true, test1.year().compareTo(test1) == 0);
        __CLR4_4_112a812a8lc8azwir.R.inc(49705);try {
            __CLR4_4_112a812a8lc8azwir.R.inc(49706);test1.year().compareTo((ReadablePartial) null);
            __CLR4_4_112a812a8lc8azwir.R.inc(49707);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_112a812a8lc8azwir.R.inc(49708);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_112a812a8lc8azwir.R.inc(49709);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_112a812a8lc8azwir.R.inc(49710);assertEquals(true, test1.year().compareTo(dt2) < 0);
        __CLR4_4_112a812a8lc8azwir.R.inc(49711);assertEquals(true, test2.year().compareTo(dt1) > 0);
        __CLR4_4_112a812a8lc8azwir.R.inc(49712);assertEquals(true, test1.year().compareTo(dt1) == 0);
        __CLR4_4_112a812a8lc8azwir.R.inc(49713);try {
            __CLR4_4_112a812a8lc8azwir.R.inc(49714);test1.year().compareTo((ReadableInstant) null);
            __CLR4_4_112a812a8lc8azwir.R.inc(49715);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_112a812a8lc8azwir.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetMonth() {__CLR4_4_112a812a8lc8azwir.R.globalSliceStart(getClass().getName(),49716);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ox6q2012d0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112a812a8lc8azwir.R.rethrow($CLV_t2$);}finally{__CLR4_4_112a812a8lc8azwir.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyGetMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49716,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ox6q2012d0(){try{__CLR4_4_112a812a8lc8azwir.R.inc(49716);
        __CLR4_4_112a812a8lc8azwir.R.inc(49717);YearMonth test = new YearMonth(1972, 6);
        __CLR4_4_112a812a8lc8azwir.R.inc(49718);assertSame(test.getChronology().monthOfYear(), test.monthOfYear().getField());
        __CLR4_4_112a812a8lc8azwir.R.inc(49719);assertEquals("monthOfYear", test.monthOfYear().getName());
        __CLR4_4_112a812a8lc8azwir.R.inc(49720);assertEquals("Property[monthOfYear]", test.monthOfYear().toString());
        __CLR4_4_112a812a8lc8azwir.R.inc(49721);assertSame(test, test.monthOfYear().getReadablePartial());
        __CLR4_4_112a812a8lc8azwir.R.inc(49722);assertSame(test, test.monthOfYear().getYearMonth());
        __CLR4_4_112a812a8lc8azwir.R.inc(49723);assertEquals(6, test.monthOfYear().get());
        __CLR4_4_112a812a8lc8azwir.R.inc(49724);assertEquals("6", test.monthOfYear().getAsString());
        __CLR4_4_112a812a8lc8azwir.R.inc(49725);assertEquals("June", test.monthOfYear().getAsText());
        __CLR4_4_112a812a8lc8azwir.R.inc(49726);assertEquals("juin", test.monthOfYear().getAsText(Locale.FRENCH));
        __CLR4_4_112a812a8lc8azwir.R.inc(49727);assertEquals("Jun", test.monthOfYear().getAsShortText());
        __CLR4_4_112a812a8lc8azwir.R.inc(49728);assertEquals("juin", test.monthOfYear().getAsShortText(Locale.FRENCH));
        __CLR4_4_112a812a8lc8azwir.R.inc(49729);assertEquals(test.getChronology().months(), test.monthOfYear().getDurationField());
        __CLR4_4_112a812a8lc8azwir.R.inc(49730);assertEquals(test.getChronology().years(), test.monthOfYear().getRangeDurationField());
        __CLR4_4_112a812a8lc8azwir.R.inc(49731);assertEquals(9, test.monthOfYear().getMaximumTextLength(null));
        __CLR4_4_112a812a8lc8azwir.R.inc(49732);assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null));
        __CLR4_4_112a812a8lc8azwir.R.inc(49733);test = new YearMonth(1972, 7);
        __CLR4_4_112a812a8lc8azwir.R.inc(49734);assertEquals("juillet", test.monthOfYear().getAsText(Locale.FRENCH));
        __CLR4_4_112a812a8lc8azwir.R.inc(49735);assertEquals("juil.", test.monthOfYear().getAsShortText(Locale.FRENCH));
    }finally{__CLR4_4_112a812a8lc8azwir.R.flushNeeded();}}

    public void testPropertyGetMaxMinValuesMonth() {__CLR4_4_112a812a8lc8azwir.R.globalSliceStart(getClass().getName(),49736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gzdw812dk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112a812a8lc8azwir.R.rethrow($CLV_t2$);}finally{__CLR4_4_112a812a8lc8azwir.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyGetMaxMinValuesMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49736,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gzdw812dk(){try{__CLR4_4_112a812a8lc8azwir.R.inc(49736);
        __CLR4_4_112a812a8lc8azwir.R.inc(49737);YearMonth test = new YearMonth(1972, 6);
        __CLR4_4_112a812a8lc8azwir.R.inc(49738);assertEquals(1, test.monthOfYear().getMinimumValue());
        __CLR4_4_112a812a8lc8azwir.R.inc(49739);assertEquals(1, test.monthOfYear().getMinimumValueOverall());
        __CLR4_4_112a812a8lc8azwir.R.inc(49740);assertEquals(12, test.monthOfYear().getMaximumValue());
        __CLR4_4_112a812a8lc8azwir.R.inc(49741);assertEquals(12, test.monthOfYear().getMaximumValueOverall());
    }finally{__CLR4_4_112a812a8lc8azwir.R.flushNeeded();}}

    public void testPropertyAddMonth() {__CLR4_4_112a812a8lc8azwir.R.globalSliceStart(getClass().getName(),49742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12mc6tp12dq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112a812a8lc8azwir.R.rethrow($CLV_t2$);}finally{__CLR4_4_112a812a8lc8azwir.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyAddMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49742,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12mc6tp12dq(){try{__CLR4_4_112a812a8lc8azwir.R.inc(49742);
        __CLR4_4_112a812a8lc8azwir.R.inc(49743);YearMonth test = new YearMonth(1972, 6);
        __CLR4_4_112a812a8lc8azwir.R.inc(49744);YearMonth copy = test.monthOfYear().addToCopy(6);
        __CLR4_4_112a812a8lc8azwir.R.inc(49745);check(test, 1972, 6);
        __CLR4_4_112a812a8lc8azwir.R.inc(49746);check(copy, 1972, 12);
        
        __CLR4_4_112a812a8lc8azwir.R.inc(49747);copy = test.monthOfYear().addToCopy(7);
        __CLR4_4_112a812a8lc8azwir.R.inc(49748);check(copy, 1973, 1);
        
        __CLR4_4_112a812a8lc8azwir.R.inc(49749);copy = test.monthOfYear().addToCopy(-5);
        __CLR4_4_112a812a8lc8azwir.R.inc(49750);check(copy, 1972, 1);
        
        __CLR4_4_112a812a8lc8azwir.R.inc(49751);copy = test.monthOfYear().addToCopy(-6);
        __CLR4_4_112a812a8lc8azwir.R.inc(49752);check(copy, 1971, 12);
    }finally{__CLR4_4_112a812a8lc8azwir.R.flushNeeded();}}

    public void testPropertyAddWrapFieldMonth() {__CLR4_4_112a812a8lc8azwir.R.globalSliceStart(getClass().getName(),49753);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eopsr512e1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112a812a8lc8azwir.R.rethrow($CLV_t2$);}finally{__CLR4_4_112a812a8lc8azwir.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyAddWrapFieldMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49753,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eopsr512e1(){try{__CLR4_4_112a812a8lc8azwir.R.inc(49753);
        __CLR4_4_112a812a8lc8azwir.R.inc(49754);YearMonth test = new YearMonth(1972, 6);
        __CLR4_4_112a812a8lc8azwir.R.inc(49755);YearMonth copy = test.monthOfYear().addWrapFieldToCopy(4);
        __CLR4_4_112a812a8lc8azwir.R.inc(49756);check(test, 1972, 6);
        __CLR4_4_112a812a8lc8azwir.R.inc(49757);check(copy, 1972, 10);
        
        __CLR4_4_112a812a8lc8azwir.R.inc(49758);copy = test.monthOfYear().addWrapFieldToCopy(8);
        __CLR4_4_112a812a8lc8azwir.R.inc(49759);check(copy, 1972, 2);
        
        __CLR4_4_112a812a8lc8azwir.R.inc(49760);copy = test.monthOfYear().addWrapFieldToCopy(-8);
        __CLR4_4_112a812a8lc8azwir.R.inc(49761);check(copy, 1972, 10);
    }finally{__CLR4_4_112a812a8lc8azwir.R.flushNeeded();}}

    public void testPropertySetMonth() {__CLR4_4_112a812a8lc8azwir.R.globalSliceStart(getClass().getName(),49762);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19dfzhw12ea();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112a812a8lc8azwir.R.rethrow($CLV_t2$);}finally{__CLR4_4_112a812a8lc8azwir.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertySetMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49762,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19dfzhw12ea(){try{__CLR4_4_112a812a8lc8azwir.R.inc(49762);
        __CLR4_4_112a812a8lc8azwir.R.inc(49763);YearMonth test = new YearMonth(1972, 6);
        __CLR4_4_112a812a8lc8azwir.R.inc(49764);YearMonth copy = test.monthOfYear().setCopy(12);
        __CLR4_4_112a812a8lc8azwir.R.inc(49765);check(test, 1972, 6);
        __CLR4_4_112a812a8lc8azwir.R.inc(49766);check(copy, 1972, 12);
        
        __CLR4_4_112a812a8lc8azwir.R.inc(49767);try {
            __CLR4_4_112a812a8lc8azwir.R.inc(49768);test.monthOfYear().setCopy(13);
            __CLR4_4_112a812a8lc8azwir.R.inc(49769);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_112a812a8lc8azwir.R.inc(49770);try {
            __CLR4_4_112a812a8lc8azwir.R.inc(49771);test.monthOfYear().setCopy(0);
            __CLR4_4_112a812a8lc8azwir.R.inc(49772);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_112a812a8lc8azwir.R.flushNeeded();}}

    public void testPropertySetTextMonth() {__CLR4_4_112a812a8lc8azwir.R.globalSliceStart(getClass().getName(),49773);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wb5cw112el();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112a812a8lc8azwir.R.rethrow($CLV_t2$);}finally{__CLR4_4_112a812a8lc8azwir.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertySetTextMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49773,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wb5cw112el(){try{__CLR4_4_112a812a8lc8azwir.R.inc(49773);
        __CLR4_4_112a812a8lc8azwir.R.inc(49774);YearMonth test = new YearMonth(1972, 6);
        __CLR4_4_112a812a8lc8azwir.R.inc(49775);YearMonth copy = test.monthOfYear().setCopy("12");
        __CLR4_4_112a812a8lc8azwir.R.inc(49776);check(test, 1972, 6);
        __CLR4_4_112a812a8lc8azwir.R.inc(49777);check(copy, 1972, 12);
        
        __CLR4_4_112a812a8lc8azwir.R.inc(49778);copy = test.monthOfYear().setCopy("December");
        __CLR4_4_112a812a8lc8azwir.R.inc(49779);check(test, 1972, 6);
        __CLR4_4_112a812a8lc8azwir.R.inc(49780);check(copy, 1972, 12);
        
        __CLR4_4_112a812a8lc8azwir.R.inc(49781);copy = test.monthOfYear().setCopy("Dec");
        __CLR4_4_112a812a8lc8azwir.R.inc(49782);check(test, 1972, 6);
        __CLR4_4_112a812a8lc8azwir.R.inc(49783);check(copy, 1972, 12);
    }finally{__CLR4_4_112a812a8lc8azwir.R.flushNeeded();}}

    public void testPropertyCompareToMonth() {__CLR4_4_112a812a8lc8azwir.R.globalSliceStart(getClass().getName(),49784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sjk8wi12ew();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112a812a8lc8azwir.R.rethrow($CLV_t2$);}finally{__CLR4_4_112a812a8lc8azwir.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyCompareToMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49784,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sjk8wi12ew(){try{__CLR4_4_112a812a8lc8azwir.R.inc(49784);
        __CLR4_4_112a812a8lc8azwir.R.inc(49785);YearMonth test1 = new YearMonth(TEST_TIME1);
        __CLR4_4_112a812a8lc8azwir.R.inc(49786);YearMonth test2 = new YearMonth(TEST_TIME2);
        __CLR4_4_112a812a8lc8azwir.R.inc(49787);assertEquals(true, test1.monthOfYear().compareTo(test2) < 0);
        __CLR4_4_112a812a8lc8azwir.R.inc(49788);assertEquals(true, test2.monthOfYear().compareTo(test1) > 0);
        __CLR4_4_112a812a8lc8azwir.R.inc(49789);assertEquals(true, test1.monthOfYear().compareTo(test1) == 0);
        __CLR4_4_112a812a8lc8azwir.R.inc(49790);try {
            __CLR4_4_112a812a8lc8azwir.R.inc(49791);test1.monthOfYear().compareTo((ReadablePartial) null);
            __CLR4_4_112a812a8lc8azwir.R.inc(49792);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_112a812a8lc8azwir.R.inc(49793);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_112a812a8lc8azwir.R.inc(49794);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_112a812a8lc8azwir.R.inc(49795);assertEquals(true, test1.monthOfYear().compareTo(dt2) < 0);
        __CLR4_4_112a812a8lc8azwir.R.inc(49796);assertEquals(true, test2.monthOfYear().compareTo(dt1) > 0);
        __CLR4_4_112a812a8lc8azwir.R.inc(49797);assertEquals(true, test1.monthOfYear().compareTo(dt1) == 0);
        __CLR4_4_112a812a8lc8azwir.R.inc(49798);try {
            __CLR4_4_112a812a8lc8azwir.R.inc(49799);test1.monthOfYear().compareTo((ReadableInstant) null);
            __CLR4_4_112a812a8lc8azwir.R.inc(49800);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_112a812a8lc8azwir.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyEquals() {__CLR4_4_112a812a8lc8azwir.R.globalSliceStart(getClass().getName(),49801);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2ub0z12fd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112a812a8lc8azwir.R.rethrow($CLV_t2$);}finally{__CLR4_4_112a812a8lc8azwir.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49801,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2ub0z12fd(){try{__CLR4_4_112a812a8lc8azwir.R.inc(49801);
        __CLR4_4_112a812a8lc8azwir.R.inc(49802);YearMonth test1 = new YearMonth(11, 11);
        __CLR4_4_112a812a8lc8azwir.R.inc(49803);YearMonth test2 = new YearMonth(11, 12);
        __CLR4_4_112a812a8lc8azwir.R.inc(49804);YearMonth test3 = new YearMonth(11, 11, CopticChronology.getInstanceUTC());
        __CLR4_4_112a812a8lc8azwir.R.inc(49805);assertEquals(true, test1.monthOfYear().equals(test1.monthOfYear()));
        __CLR4_4_112a812a8lc8azwir.R.inc(49806);assertEquals(false, test1.monthOfYear().equals(test1.year()));
        __CLR4_4_112a812a8lc8azwir.R.inc(49807);assertEquals(false, test1.monthOfYear().equals(test2.monthOfYear()));
        __CLR4_4_112a812a8lc8azwir.R.inc(49808);assertEquals(false, test1.monthOfYear().equals(test2.year()));
        
        __CLR4_4_112a812a8lc8azwir.R.inc(49809);assertEquals(false, test1.year().equals(test1.monthOfYear()));
        __CLR4_4_112a812a8lc8azwir.R.inc(49810);assertEquals(true, test1.year().equals(test1.year()));
        __CLR4_4_112a812a8lc8azwir.R.inc(49811);assertEquals(false, test1.year().equals(test2.monthOfYear()));
        __CLR4_4_112a812a8lc8azwir.R.inc(49812);assertEquals(true, test1.year().equals(test2.year()));
        
        __CLR4_4_112a812a8lc8azwir.R.inc(49813);assertEquals(false, test1.monthOfYear().equals(null));
        __CLR4_4_112a812a8lc8azwir.R.inc(49814);assertEquals(false, test1.monthOfYear().equals("any"));
        
        // chrono
        __CLR4_4_112a812a8lc8azwir.R.inc(49815);assertEquals(false, test1.monthOfYear().equals(test3.monthOfYear()));
    }finally{__CLR4_4_112a812a8lc8azwir.R.flushNeeded();}}

    public void testPropertyHashCode() {__CLR4_4_112a812a8lc8azwir.R.globalSliceStart(getClass().getName(),49816);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y278s712fs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112a812a8lc8azwir.R.rethrow($CLV_t2$);}finally{__CLR4_4_112a812a8lc8azwir.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49816,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y278s712fs(){try{__CLR4_4_112a812a8lc8azwir.R.inc(49816);
        __CLR4_4_112a812a8lc8azwir.R.inc(49817);YearMonth test1 = new YearMonth(2005, 11);
        __CLR4_4_112a812a8lc8azwir.R.inc(49818);YearMonth test2 = new YearMonth(2005, 12);
        __CLR4_4_112a812a8lc8azwir.R.inc(49819);assertEquals(true, test1.monthOfYear().hashCode() == test1.monthOfYear().hashCode());
        __CLR4_4_112a812a8lc8azwir.R.inc(49820);assertEquals(false, test1.monthOfYear().hashCode() == test2.monthOfYear().hashCode());
        __CLR4_4_112a812a8lc8azwir.R.inc(49821);assertEquals(true, test1.year().hashCode() == test1.year().hashCode());
        __CLR4_4_112a812a8lc8azwir.R.inc(49822);assertEquals(true, test1.year().hashCode() == test2.year().hashCode());
    }finally{__CLR4_4_112a812a8lc8azwir.R.flushNeeded();}}

    public void testPropertyEqualsHashCodeLenient() {__CLR4_4_112a812a8lc8azwir.R.globalSliceStart(getClass().getName(),49823);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xoanxf12fz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112a812a8lc8azwir.R.rethrow($CLV_t2$);}finally{__CLR4_4_112a812a8lc8azwir.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyEqualsHashCodeLenient",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49823,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xoanxf12fz(){try{__CLR4_4_112a812a8lc8azwir.R.inc(49823);
        __CLR4_4_112a812a8lc8azwir.R.inc(49824);YearMonth test1 = new YearMonth(1970, 6, LenientChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_112a812a8lc8azwir.R.inc(49825);YearMonth test2 = new YearMonth(1970, 6, LenientChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_112a812a8lc8azwir.R.inc(49826);assertEquals(true, test1.monthOfYear().equals(test2.monthOfYear()));
        __CLR4_4_112a812a8lc8azwir.R.inc(49827);assertEquals(true, test2.monthOfYear().equals(test1.monthOfYear()));
        __CLR4_4_112a812a8lc8azwir.R.inc(49828);assertEquals(true, test1.monthOfYear().equals(test1.monthOfYear()));
        __CLR4_4_112a812a8lc8azwir.R.inc(49829);assertEquals(true, test2.monthOfYear().equals(test2.monthOfYear()));
        __CLR4_4_112a812a8lc8azwir.R.inc(49830);assertEquals(true, test1.monthOfYear().hashCode() == test2.monthOfYear().hashCode());
        __CLR4_4_112a812a8lc8azwir.R.inc(49831);assertEquals(true, test1.monthOfYear().hashCode() == test1.monthOfYear().hashCode());
        __CLR4_4_112a812a8lc8azwir.R.inc(49832);assertEquals(true, test2.monthOfYear().hashCode() == test2.monthOfYear().hashCode());
    }finally{__CLR4_4_112a812a8lc8azwir.R.flushNeeded();}}

    public void testPropertyEqualsHashCodeStrict() {__CLR4_4_112a812a8lc8azwir.R.globalSliceStart(getClass().getName(),49833);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ev6icv12g9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112a812a8lc8azwir.R.rethrow($CLV_t2$);}finally{__CLR4_4_112a812a8lc8azwir.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyEqualsHashCodeStrict",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49833,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ev6icv12g9(){try{__CLR4_4_112a812a8lc8azwir.R.inc(49833);
        __CLR4_4_112a812a8lc8azwir.R.inc(49834);YearMonth test1 = new YearMonth(1970, 6, StrictChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_112a812a8lc8azwir.R.inc(49835);YearMonth test2 = new YearMonth(1970, 6, StrictChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_112a812a8lc8azwir.R.inc(49836);assertEquals(true, test1.monthOfYear().equals(test2.monthOfYear()));
        __CLR4_4_112a812a8lc8azwir.R.inc(49837);assertEquals(true, test2.monthOfYear().equals(test1.monthOfYear()));
        __CLR4_4_112a812a8lc8azwir.R.inc(49838);assertEquals(true, test1.monthOfYear().equals(test1.monthOfYear()));
        __CLR4_4_112a812a8lc8azwir.R.inc(49839);assertEquals(true, test2.monthOfYear().equals(test2.monthOfYear()));
        __CLR4_4_112a812a8lc8azwir.R.inc(49840);assertEquals(true, test1.monthOfYear().hashCode() == test2.monthOfYear().hashCode());
        __CLR4_4_112a812a8lc8azwir.R.inc(49841);assertEquals(true, test1.monthOfYear().hashCode() == test1.monthOfYear().hashCode());
        __CLR4_4_112a812a8lc8azwir.R.inc(49842);assertEquals(true, test2.monthOfYear().hashCode() == test2.monthOfYear().hashCode());
    }finally{__CLR4_4_112a812a8lc8azwir.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void check(YearMonth test, int year, int month) {try{__CLR4_4_112a812a8lc8azwir.R.inc(49843);
        __CLR4_4_112a812a8lc8azwir.R.inc(49844);assertEquals(year, test.getYear());
        __CLR4_4_112a812a8lc8azwir.R.inc(49845);assertEquals(month, test.getMonthOfYear());
    }finally{__CLR4_4_112a812a8lc8azwir.R.flushNeeded();}}
}
