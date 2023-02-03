/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2006 Stephen Colebourne
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

/**
 * This class is a Junit unit test for TimeOfDay.
 *
 * @author Stephen Colebourne
 */
public class TestLocalTime_Properties extends TestCase {static class __CLR4_4_1rjxrjxlc8azvkw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,36233,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");

    private long TEST_TIME_NOW =
            10L * DateTimeConstants.MILLIS_PER_HOUR
            + 20L * DateTimeConstants.MILLIS_PER_MINUTE
            + 30L * DateTimeConstants.MILLIS_PER_SECOND
            + 40L;

    private long TEST_TIME1 =
        1L * DateTimeConstants.MILLIS_PER_HOUR
        + 2L * DateTimeConstants.MILLIS_PER_MINUTE
        + 3L * DateTimeConstants.MILLIS_PER_SECOND
        + 4L;

    private long TEST_TIME2 =
        1L * DateTimeConstants.MILLIS_PER_DAY
        + 5L * DateTimeConstants.MILLIS_PER_HOUR
        + 6L * DateTimeConstants.MILLIS_PER_MINUTE
        + 7L * DateTimeConstants.MILLIS_PER_SECOND
        + 8L;

    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1rjxrjxlc8azvkw.R.inc(35709);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35710);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1rjxrjxlc8azvkw.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1rjxrjxlc8azvkw.R.inc(35711);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35712);return new TestSuite(TestLocalTime_Properties.class);
    }finally{__CLR4_4_1rjxrjxlc8azvkw.R.flushNeeded();}}

    public TestLocalTime_Properties(String name) {
        super(name);__CLR4_4_1rjxrjxlc8azvkw.R.inc(35714);try{__CLR4_4_1rjxrjxlc8azvkw.R.inc(35713);
    }finally{__CLR4_4_1rjxrjxlc8azvkw.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1rjxrjxlc8azvkw.R.inc(35715);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35716);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35717);zone = DateTimeZone.getDefault();
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35718);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1rjxrjxlc8azvkw.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1rjxrjxlc8azvkw.R.inc(35719);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35720);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35721);DateTimeZone.setDefault(zone);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35722);zone = null;
    }finally{__CLR4_4_1rjxrjxlc8azvkw.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetHour() {__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceStart(getClass().getName(),35723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mry6karkb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rjxrjxlc8azvkw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyGetHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35723,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mry6karkb(){try{__CLR4_4_1rjxrjxlc8azvkw.R.inc(35723);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35724);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35725);assertSame(test.getChronology().hourOfDay(), test.hourOfDay().getField());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35726);assertEquals("hourOfDay", test.hourOfDay().getName());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35727);assertEquals("Property[hourOfDay]", test.hourOfDay().toString());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35728);assertSame(test, test.hourOfDay().getLocalTime());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35729);assertEquals(10, test.hourOfDay().get());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35730);assertEquals("10", test.hourOfDay().getAsString());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35731);assertEquals("10", test.hourOfDay().getAsText());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35732);assertEquals("10", test.hourOfDay().getAsText(Locale.FRENCH));
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35733);assertEquals("10", test.hourOfDay().getAsShortText());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35734);assertEquals("10", test.hourOfDay().getAsShortText(Locale.FRENCH));
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35735);assertEquals(test.getChronology().hours(), test.hourOfDay().getDurationField());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35736);assertEquals(test.getChronology().days(), test.hourOfDay().getRangeDurationField());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35737);assertEquals(2, test.hourOfDay().getMaximumTextLength(null));
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35738);assertEquals(2, test.hourOfDay().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1rjxrjxlc8azvkw.R.flushNeeded();}}

    public void testPropertyRoundHour() {__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceStart(getClass().getName(),35739);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kobpgyrkr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rjxrjxlc8azvkw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyRoundHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35739,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kobpgyrkr(){try{__CLR4_4_1rjxrjxlc8azvkw.R.inc(35739);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35740);LocalTime test = new LocalTime(10, 20);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35741);check(test.hourOfDay().roundCeilingCopy(), 11, 0, 0, 0);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35742);check(test.hourOfDay().roundFloorCopy(), 10, 0, 0, 0);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35743);check(test.hourOfDay().roundHalfCeilingCopy(), 10, 0, 0, 0);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35744);check(test.hourOfDay().roundHalfFloorCopy(), 10, 0, 0, 0);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35745);check(test.hourOfDay().roundHalfEvenCopy(), 10, 0, 0, 0);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35746);test = new LocalTime(10, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35747);check(test.hourOfDay().roundCeilingCopy(), 11, 0, 0, 0);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35748);check(test.hourOfDay().roundFloorCopy(), 10, 0, 0, 0);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35749);check(test.hourOfDay().roundHalfCeilingCopy(), 11, 0, 0, 0);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35750);check(test.hourOfDay().roundHalfFloorCopy(), 11, 0, 0, 0);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35751);check(test.hourOfDay().roundHalfEvenCopy(), 11, 0, 0, 0);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35752);test = new LocalTime(10, 30);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35753);check(test.hourOfDay().roundCeilingCopy(), 11, 0, 0, 0);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35754);check(test.hourOfDay().roundFloorCopy(), 10, 0, 0, 0);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35755);check(test.hourOfDay().roundHalfCeilingCopy(), 11, 0, 0, 0);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35756);check(test.hourOfDay().roundHalfFloorCopy(), 10, 0, 0, 0);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35757);check(test.hourOfDay().roundHalfEvenCopy(), 10, 0, 0, 0);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35758);test = new LocalTime(11, 30);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35759);check(test.hourOfDay().roundCeilingCopy(), 12, 0, 0, 0);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35760);check(test.hourOfDay().roundFloorCopy(), 11, 0, 0, 0);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35761);check(test.hourOfDay().roundHalfCeilingCopy(), 12, 0, 0, 0);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35762);check(test.hourOfDay().roundHalfFloorCopy(), 11, 0, 0, 0);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35763);check(test.hourOfDay().roundHalfEvenCopy(), 12, 0, 0, 0);
    }finally{__CLR4_4_1rjxrjxlc8azvkw.R.flushNeeded();}}

    public void testPropertyGetMaxMinValuesHour() {__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceStart(getClass().getName(),35764);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13xi8wmrlg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rjxrjxlc8azvkw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyGetMaxMinValuesHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35764,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13xi8wmrlg(){try{__CLR4_4_1rjxrjxlc8azvkw.R.inc(35764);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35765);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35766);assertEquals(0, test.hourOfDay().getMinimumValue());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35767);assertEquals(0, test.hourOfDay().getMinimumValueOverall());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35768);assertEquals(23, test.hourOfDay().getMaximumValue());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35769);assertEquals(23, test.hourOfDay().getMaximumValueOverall());
    }finally{__CLR4_4_1rjxrjxlc8azvkw.R.flushNeeded();}}

    public void testPropertyWithMaxMinValueHour() {__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceStart(getClass().getName(),35770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zhdwhrlm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rjxrjxlc8azvkw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyWithMaxMinValueHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35770,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zhdwhrlm(){try{__CLR4_4_1rjxrjxlc8azvkw.R.inc(35770);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35771);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35772);check(test.hourOfDay().withMaximumValue(), 23, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35773);check(test.hourOfDay().withMinimumValue(), 0, 20, 30, 40);
    }finally{__CLR4_4_1rjxrjxlc8azvkw.R.flushNeeded();}}

    public void testPropertyPlusHour() {__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceStart(getClass().getName(),35774);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13me904rlq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rjxrjxlc8azvkw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyPlusHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35774,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13me904rlq(){try{__CLR4_4_1rjxrjxlc8azvkw.R.inc(35774);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35775);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35776);LocalTime copy = test.hourOfDay().addCopy(9);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35777);check(test, 10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35778);check(copy, 19, 20, 30, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35779);copy = test.hourOfDay().addCopy(0);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35780);check(copy, 10, 20, 30, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35781);copy = test.hourOfDay().addCopy(13);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35782);check(copy, 23, 20, 30, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35783);copy = test.hourOfDay().addCopy(14);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35784);check(copy, 0, 20, 30, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35785);copy = test.hourOfDay().addCopy(-10);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35786);check(copy, 0, 20, 30, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35787);copy = test.hourOfDay().addCopy(-11);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35788);check(copy, 23, 20, 30, 40);
    }finally{__CLR4_4_1rjxrjxlc8azvkw.R.flushNeeded();}}

    public void testPropertyPlusNoWrapHour() {__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceStart(getClass().getName(),35789);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1485edzrm5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rjxrjxlc8azvkw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyPlusNoWrapHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35789,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1485edzrm5(){try{__CLR4_4_1rjxrjxlc8azvkw.R.inc(35789);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35790);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35791);LocalTime copy = test.hourOfDay().addNoWrapToCopy(9);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35792);check(test, 10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35793);check(copy, 19, 20, 30, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35794);copy = test.hourOfDay().addNoWrapToCopy(0);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35795);check(copy, 10, 20, 30, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35796);copy = test.hourOfDay().addNoWrapToCopy(13);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35797);check(copy, 23, 20, 30, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35798);try {
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(35799);test.hourOfDay().addNoWrapToCopy(14);
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(35800);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35801);check(test, 10, 20, 30, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35802);copy = test.hourOfDay().addNoWrapToCopy(-10);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35803);check(copy, 0, 20, 30, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35804);try {
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(35805);test.hourOfDay().addNoWrapToCopy(-11);
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(35806);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35807);check(test, 10, 20, 30, 40);
    }finally{__CLR4_4_1rjxrjxlc8azvkw.R.flushNeeded();}}

    public void testPropertyPlusWrapFieldHour() {__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceStart(getClass().getName(),35808);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bjwgvurmo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rjxrjxlc8azvkw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyPlusWrapFieldHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35808,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bjwgvurmo(){try{__CLR4_4_1rjxrjxlc8azvkw.R.inc(35808);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35809);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35810);LocalTime copy = test.hourOfDay().addWrapFieldToCopy(9);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35811);check(test, 10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35812);check(copy, 19, 20, 30, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35813);copy = test.hourOfDay().addWrapFieldToCopy(0);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35814);check(copy, 10, 20, 30, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35815);copy = test.hourOfDay().addWrapFieldToCopy(18);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35816);check(copy, 4, 20, 30, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35817);copy = test.hourOfDay().addWrapFieldToCopy(-15);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35818);check(copy, 19, 20, 30, 40);
    }finally{__CLR4_4_1rjxrjxlc8azvkw.R.flushNeeded();}}

    public void testPropertySetHour() {__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceStart(getClass().getName(),35819);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hyrp2yrmz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rjxrjxlc8azvkw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertySetHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35819,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hyrp2yrmz(){try{__CLR4_4_1rjxrjxlc8azvkw.R.inc(35819);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35820);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35821);LocalTime copy = test.hourOfDay().setCopy(12);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35822);check(test, 10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35823);check(copy, 12, 20, 30, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35824);try {
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(35825);test.hourOfDay().setCopy(24);
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(35826);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35827);try {
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(35828);test.hourOfDay().setCopy(-1);
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(35829);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1rjxrjxlc8azvkw.R.flushNeeded();}}

    public void testPropertySetTextHour() {__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceStart(getClass().getName(),35830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14yha19rna();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rjxrjxlc8azvkw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertySetTextHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35830,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14yha19rna(){try{__CLR4_4_1rjxrjxlc8azvkw.R.inc(35830);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35831);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35832);LocalTime copy = test.hourOfDay().setCopy("12");
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35833);check(test, 10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35834);check(copy, 12, 20, 30, 40);
    }finally{__CLR4_4_1rjxrjxlc8azvkw.R.flushNeeded();}}

    public void testPropertyWithMaximumValueHour() {__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceStart(getClass().getName(),35835);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1otnz93rnf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rjxrjxlc8azvkw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyWithMaximumValueHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35835,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1otnz93rnf(){try{__CLR4_4_1rjxrjxlc8azvkw.R.inc(35835);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35836);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35837);LocalTime copy = test.hourOfDay().withMaximumValue();
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35838);check(test, 10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35839);check(copy, 23, 20, 30, 40);
    }finally{__CLR4_4_1rjxrjxlc8azvkw.R.flushNeeded();}}

    public void testPropertyWithMinimumValueHour() {__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceStart(getClass().getName(),35840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n6uf1hrnk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rjxrjxlc8azvkw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyWithMinimumValueHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35840,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n6uf1hrnk(){try{__CLR4_4_1rjxrjxlc8azvkw.R.inc(35840);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35841);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35842);LocalTime copy = test.hourOfDay().withMinimumValue();
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35843);check(test, 10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35844);check(copy, 0, 20, 30, 40);
    }finally{__CLR4_4_1rjxrjxlc8azvkw.R.flushNeeded();}}

    public void testPropertyCompareToHour() {__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceStart(getClass().getName(),35845);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_174ldgcrnp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rjxrjxlc8azvkw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyCompareToHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35845,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_174ldgcrnp(){try{__CLR4_4_1rjxrjxlc8azvkw.R.inc(35845);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35846);LocalTime test1 = new LocalTime(TEST_TIME1);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35847);LocalTime test2 = new LocalTime(TEST_TIME2);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35848);assertEquals(true, test1.hourOfDay().compareTo(test2) < 0);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35849);assertEquals(true, test2.hourOfDay().compareTo(test1) > 0);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35850);assertEquals(true, test1.hourOfDay().compareTo(test1) == 0);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35851);try {
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(35852);test1.hourOfDay().compareTo((ReadablePartial) null);
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(35853);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35854);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35855);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35856);assertEquals(true, test1.hourOfDay().compareTo(dt2) < 0);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35857);assertEquals(true, test2.hourOfDay().compareTo(dt1) > 0);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35858);assertEquals(true, test1.hourOfDay().compareTo(dt1) == 0);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35859);try {
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(35860);test1.hourOfDay().compareTo((ReadableInstant) null);
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(35861);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1rjxrjxlc8azvkw.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetMinute() {__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceStart(getClass().getName(),35862);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oej7l6ro6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rjxrjxlc8azvkw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyGetMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35862,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oej7l6ro6(){try{__CLR4_4_1rjxrjxlc8azvkw.R.inc(35862);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35863);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35864);assertSame(test.getChronology().minuteOfHour(), test.minuteOfHour().getField());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35865);assertEquals("minuteOfHour", test.minuteOfHour().getName());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35866);assertEquals("Property[minuteOfHour]", test.minuteOfHour().toString());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35867);assertSame(test, test.minuteOfHour().getLocalTime());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35868);assertEquals(20, test.minuteOfHour().get());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35869);assertEquals("20", test.minuteOfHour().getAsString());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35870);assertEquals("20", test.minuteOfHour().getAsText());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35871);assertEquals("20", test.minuteOfHour().getAsText(Locale.FRENCH));
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35872);assertEquals("20", test.minuteOfHour().getAsShortText());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35873);assertEquals("20", test.minuteOfHour().getAsShortText(Locale.FRENCH));
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35874);assertEquals(test.getChronology().minutes(), test.minuteOfHour().getDurationField());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35875);assertEquals(test.getChronology().hours(), test.minuteOfHour().getRangeDurationField());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35876);assertEquals(2, test.minuteOfHour().getMaximumTextLength(null));
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35877);assertEquals(2, test.minuteOfHour().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1rjxrjxlc8azvkw.R.flushNeeded();}}

    public void testPropertyGetMaxMinValuesMinute() {__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceStart(getClass().getName(),35878);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_110m2u2rom();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rjxrjxlc8azvkw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyGetMaxMinValuesMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35878,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_110m2u2rom(){try{__CLR4_4_1rjxrjxlc8azvkw.R.inc(35878);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35879);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35880);assertEquals(0, test.minuteOfHour().getMinimumValue());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35881);assertEquals(0, test.minuteOfHour().getMinimumValueOverall());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35882);assertEquals(59, test.minuteOfHour().getMaximumValue());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35883);assertEquals(59, test.minuteOfHour().getMaximumValueOverall());
    }finally{__CLR4_4_1rjxrjxlc8azvkw.R.flushNeeded();}}

    public void testPropertyWithMaxMinValueMinute() {__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceStart(getClass().getName(),35884);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xepr5bros();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rjxrjxlc8azvkw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyWithMaxMinValueMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35884,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xepr5bros(){try{__CLR4_4_1rjxrjxlc8azvkw.R.inc(35884);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35885);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35886);check(test.minuteOfHour().withMaximumValue(), 10, 59, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35887);check(test.minuteOfHour().withMinimumValue(), 10, 0, 30, 40);
    }finally{__CLR4_4_1rjxrjxlc8azvkw.R.flushNeeded();}}

    public void testPropertyPlusMinute() {__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceStart(getClass().getName(),35888);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dhv9i4row();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rjxrjxlc8azvkw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyPlusMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35888,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dhv9i4row(){try{__CLR4_4_1rjxrjxlc8azvkw.R.inc(35888);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35889);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35890);LocalTime copy = test.minuteOfHour().addCopy(9);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35891);check(test, 10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35892);check(copy, 10, 29, 30, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35893);copy = test.minuteOfHour().addCopy(39);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35894);check(copy, 10, 59, 30, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35895);copy = test.minuteOfHour().addCopy(40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35896);check(copy, 11, 0, 30, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35897);copy = test.minuteOfHour().addCopy(1 * 60 + 45);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35898);check(copy, 12, 5, 30, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35899);copy = test.minuteOfHour().addCopy(13 * 60 + 39);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35900);check(copy, 23, 59, 30, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35901);copy = test.minuteOfHour().addCopy(13 * 60 + 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35902);check(copy, 0, 0, 30, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35903);copy = test.minuteOfHour().addCopy(-9);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35904);check(copy, 10, 11, 30, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35905);copy = test.minuteOfHour().addCopy(-19);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35906);check(copy, 10, 1, 30, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35907);copy = test.minuteOfHour().addCopy(-20);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35908);check(copy, 10, 0, 30, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35909);copy = test.minuteOfHour().addCopy(-21);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35910);check(copy, 9, 59, 30, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35911);copy = test.minuteOfHour().addCopy(-(10 * 60 + 20));
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35912);check(copy, 0, 0, 30, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35913);copy = test.minuteOfHour().addCopy(-(10 * 60 + 21));
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35914);check(copy, 23, 59, 30, 40);
    }finally{__CLR4_4_1rjxrjxlc8azvkw.R.flushNeeded();}}

    public void testPropertyPlusNoWrapMinute() {__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceStart(getClass().getName(),35915);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qmgv2frpn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rjxrjxlc8azvkw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyPlusNoWrapMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35915,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qmgv2frpn(){try{__CLR4_4_1rjxrjxlc8azvkw.R.inc(35915);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35916);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35917);LocalTime copy = test.minuteOfHour().addNoWrapToCopy(9);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35918);check(test, 10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35919);check(copy, 10, 29, 30, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35920);copy = test.minuteOfHour().addNoWrapToCopy(39);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35921);check(copy, 10, 59, 30, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35922);copy = test.minuteOfHour().addNoWrapToCopy(40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35923);check(copy, 11, 0, 30, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35924);copy = test.minuteOfHour().addNoWrapToCopy(1 * 60 + 45);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35925);check(copy, 12, 5, 30, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35926);copy = test.minuteOfHour().addNoWrapToCopy(13 * 60 + 39);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35927);check(copy, 23, 59, 30, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35928);try {
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(35929);test.minuteOfHour().addNoWrapToCopy(13 * 60 + 40);
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(35930);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35931);check(test, 10, 20, 30, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35932);copy = test.minuteOfHour().addNoWrapToCopy(-9);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35933);check(copy, 10, 11, 30, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35934);copy = test.minuteOfHour().addNoWrapToCopy(-19);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35935);check(copy, 10, 1, 30, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35936);copy = test.minuteOfHour().addNoWrapToCopy(-20);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35937);check(copy, 10, 0, 30, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35938);copy = test.minuteOfHour().addNoWrapToCopy(-21);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35939);check(copy, 9, 59, 30, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35940);copy = test.minuteOfHour().addNoWrapToCopy(-(10 * 60 + 20));
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35941);check(copy, 0, 0, 30, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35942);try {
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(35943);test.minuteOfHour().addNoWrapToCopy(-(10 * 60 + 21));
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(35944);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35945);check(test, 10, 20, 30, 40);
    }finally{__CLR4_4_1rjxrjxlc8azvkw.R.flushNeeded();}}

    public void testPropertyPlusWrapFieldMinute() {__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceStart(getClass().getName(),35946);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z9x2ayrqi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rjxrjxlc8azvkw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyPlusWrapFieldMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35946,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z9x2ayrqi(){try{__CLR4_4_1rjxrjxlc8azvkw.R.inc(35946);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35947);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35948);LocalTime copy = test.minuteOfHour().addWrapFieldToCopy(9);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35949);check(test, 10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35950);check(copy, 10, 29, 30, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35951);copy = test.minuteOfHour().addWrapFieldToCopy(49);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35952);check(copy, 10, 9, 30, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35953);copy = test.minuteOfHour().addWrapFieldToCopy(-47);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35954);check(copy, 10, 33, 30, 40);
    }finally{__CLR4_4_1rjxrjxlc8azvkw.R.flushNeeded();}}

    public void testPropertySetMinute() {__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceStart(getClass().getName(),35955);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_196rp2urqr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rjxrjxlc8azvkw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertySetMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35955,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_196rp2urqr(){try{__CLR4_4_1rjxrjxlc8azvkw.R.inc(35955);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35956);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35957);LocalTime copy = test.minuteOfHour().setCopy(12);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35958);check(test, 10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35959);check(copy, 10, 12, 30, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35960);try {
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(35961);test.minuteOfHour().setCopy(60);
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(35962);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35963);try {
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(35964);test.minuteOfHour().setCopy(-1);
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(35965);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1rjxrjxlc8azvkw.R.flushNeeded();}}

    public void testPropertySetTextMinute() {__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceStart(getClass().getName(),35966);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18h1pnnrr2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rjxrjxlc8azvkw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertySetTextMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35966,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18h1pnnrr2(){try{__CLR4_4_1rjxrjxlc8azvkw.R.inc(35966);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35967);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35968);LocalTime copy = test.minuteOfHour().setCopy("12");
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35969);check(test, 10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35970);check(copy, 10, 12, 30, 40);
    }finally{__CLR4_4_1rjxrjxlc8azvkw.R.flushNeeded();}}

    public void testPropertyCompareToMinute() {__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceStart(getClass().getName(),35971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gtzyp8rr7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rjxrjxlc8azvkw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyCompareToMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35971,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gtzyp8rr7(){try{__CLR4_4_1rjxrjxlc8azvkw.R.inc(35971);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35972);LocalTime test1 = new LocalTime(TEST_TIME1);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35973);LocalTime test2 = new LocalTime(TEST_TIME2);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35974);assertEquals(true, test1.minuteOfHour().compareTo(test2) < 0);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35975);assertEquals(true, test2.minuteOfHour().compareTo(test1) > 0);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35976);assertEquals(true, test1.minuteOfHour().compareTo(test1) == 0);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35977);try {
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(35978);test1.minuteOfHour().compareTo((ReadablePartial) null);
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(35979);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35980);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35981);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35982);assertEquals(true, test1.minuteOfHour().compareTo(dt2) < 0);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35983);assertEquals(true, test2.minuteOfHour().compareTo(dt1) > 0);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35984);assertEquals(true, test1.minuteOfHour().compareTo(dt1) == 0);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35985);try {
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(35986);test1.minuteOfHour().compareTo((ReadableInstant) null);
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(35987);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1rjxrjxlc8azvkw.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetSecond() {__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceStart(getClass().getName(),35988);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1plsrcmrro();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rjxrjxlc8azvkw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyGetSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35988,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1plsrcmrro(){try{__CLR4_4_1rjxrjxlc8azvkw.R.inc(35988);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35989);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35990);assertSame(test.getChronology().secondOfMinute(), test.secondOfMinute().getField());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35991);assertEquals("secondOfMinute", test.secondOfMinute().getName());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35992);assertEquals("Property[secondOfMinute]", test.secondOfMinute().toString());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35993);assertSame(test, test.secondOfMinute().getLocalTime());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35994);assertEquals(30, test.secondOfMinute().get());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35995);assertEquals("30", test.secondOfMinute().getAsString());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35996);assertEquals("30", test.secondOfMinute().getAsText());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35997);assertEquals("30", test.secondOfMinute().getAsText(Locale.FRENCH));
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35998);assertEquals("30", test.secondOfMinute().getAsShortText());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(35999);assertEquals("30", test.secondOfMinute().getAsShortText(Locale.FRENCH));
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36000);assertEquals(test.getChronology().seconds(), test.secondOfMinute().getDurationField());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36001);assertEquals(test.getChronology().minutes(), test.secondOfMinute().getRangeDurationField());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36002);assertEquals(2, test.secondOfMinute().getMaximumTextLength(null));
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36003);assertEquals(2, test.secondOfMinute().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1rjxrjxlc8azvkw.R.flushNeeded();}}

    public void testPropertyGetMaxMinValuesSecond() {__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceStart(getClass().getName(),36004);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m1e5vers4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rjxrjxlc8azvkw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyGetMaxMinValuesSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36004,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m1e5vers4(){try{__CLR4_4_1rjxrjxlc8azvkw.R.inc(36004);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36005);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36006);assertEquals(0, test.secondOfMinute().getMinimumValue());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36007);assertEquals(0, test.secondOfMinute().getMinimumValueOverall());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36008);assertEquals(59, test.secondOfMinute().getMaximumValue());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36009);assertEquals(59, test.secondOfMinute().getMaximumValueOverall());
    }finally{__CLR4_4_1rjxrjxlc8azvkw.R.flushNeeded();}}

    public void testPropertyWithMaxMinValueSecond() {__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceStart(getClass().getName(),36010);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cdxo3zrsa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rjxrjxlc8azvkw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyWithMaxMinValueSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36010,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cdxo3zrsa(){try{__CLR4_4_1rjxrjxlc8azvkw.R.inc(36010);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36011);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36012);check(test.secondOfMinute().withMaximumValue(), 10, 20, 59, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36013);check(test.secondOfMinute().withMinimumValue(), 10, 20, 0, 40);
    }finally{__CLR4_4_1rjxrjxlc8azvkw.R.flushNeeded();}}

    public void testPropertyPlusSecond() {__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceStart(getClass().getName(),36014);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yincjgrse();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rjxrjxlc8azvkw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyPlusSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36014,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yincjgrse(){try{__CLR4_4_1rjxrjxlc8azvkw.R.inc(36014);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36015);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36016);LocalTime copy = test.secondOfMinute().addCopy(9);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36017);check(test, 10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36018);check(copy, 10, 20, 39, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36019);copy = test.secondOfMinute().addCopy(29);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36020);check(copy, 10, 20, 59, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36021);copy = test.secondOfMinute().addCopy(30);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36022);check(copy, 10, 21, 0, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36023);copy = test.secondOfMinute().addCopy(39 * 60 + 29);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36024);check(copy, 10, 59, 59, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36025);copy = test.secondOfMinute().addCopy(39 * 60 + 30);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36026);check(copy, 11, 0, 0, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36027);copy = test.secondOfMinute().addCopy(13 * 60 * 60 + 39 * 60 + 30);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36028);check(copy, 0, 0, 0, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36029);copy = test.secondOfMinute().addCopy(-9);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36030);check(copy, 10, 20, 21, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36031);copy = test.secondOfMinute().addCopy(-30);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36032);check(copy, 10, 20, 0, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36033);copy = test.secondOfMinute().addCopy(-31);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36034);check(copy, 10, 19, 59, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36035);copy = test.secondOfMinute().addCopy(-(10 * 60 * 60 + 20 * 60 + 30));
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36036);check(copy, 0, 0, 0, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36037);copy = test.secondOfMinute().addCopy(-(10 * 60 * 60 + 20 * 60 + 31));
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36038);check(copy, 23, 59, 59, 40);
    }finally{__CLR4_4_1rjxrjxlc8azvkw.R.flushNeeded();}}

    public void testPropertyPlusNoWrapSecond() {__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceStart(getClass().getName(),36039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ndv3vdrt3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rjxrjxlc8azvkw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyPlusNoWrapSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36039,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ndv3vdrt3(){try{__CLR4_4_1rjxrjxlc8azvkw.R.inc(36039);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36040);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36041);LocalTime copy = test.secondOfMinute().addNoWrapToCopy(9);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36042);check(test, 10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36043);check(copy, 10, 20, 39, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36044);copy = test.secondOfMinute().addNoWrapToCopy(29);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36045);check(copy, 10, 20, 59, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36046);copy = test.secondOfMinute().addNoWrapToCopy(30);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36047);check(copy, 10, 21, 0, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36048);copy = test.secondOfMinute().addNoWrapToCopy(39 * 60 + 29);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36049);check(copy, 10, 59, 59, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36050);copy = test.secondOfMinute().addNoWrapToCopy(39 * 60 + 30);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36051);check(copy, 11, 0, 0, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36052);try {
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(36053);test.secondOfMinute().addNoWrapToCopy(13 * 60 * 60 + 39 * 60 + 30);
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(36054);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36055);check(test, 10, 20, 30, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36056);copy = test.secondOfMinute().addNoWrapToCopy(-9);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36057);check(copy, 10, 20, 21, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36058);copy = test.secondOfMinute().addNoWrapToCopy(-30);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36059);check(copy, 10, 20, 0, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36060);copy = test.secondOfMinute().addNoWrapToCopy(-31);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36061);check(copy, 10, 19, 59, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36062);copy = test.secondOfMinute().addNoWrapToCopy(-(10 * 60 * 60 + 20 * 60 + 30));
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36063);check(copy, 0, 0, 0, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36064);try {
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(36065);test.secondOfMinute().addNoWrapToCopy(-(10 * 60 * 60 + 20 * 60 + 31));
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(36066);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36067);check(test, 10, 20, 30, 40);
    }finally{__CLR4_4_1rjxrjxlc8azvkw.R.flushNeeded();}}

    public void testPropertyPlusWrapFieldSecond() {__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceStart(getClass().getName(),36068);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eqewmurtw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rjxrjxlc8azvkw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyPlusWrapFieldSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36068,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eqewmurtw(){try{__CLR4_4_1rjxrjxlc8azvkw.R.inc(36068);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36069);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36070);LocalTime copy = test.secondOfMinute().addWrapFieldToCopy(9);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36071);check(test, 10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36072);check(copy, 10, 20, 39, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36073);copy = test.secondOfMinute().addWrapFieldToCopy(49);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36074);check(copy, 10, 20, 19, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36075);copy = test.secondOfMinute().addWrapFieldToCopy(-47);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36076);check(copy, 10, 20, 43, 40);
    }finally{__CLR4_4_1rjxrjxlc8azvkw.R.flushNeeded();}}

    public void testPropertySetSecond() {__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceStart(getClass().getName(),36077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u7js46ru5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rjxrjxlc8azvkw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertySetSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36077,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u7js46ru5(){try{__CLR4_4_1rjxrjxlc8azvkw.R.inc(36077);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36078);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36079);LocalTime copy = test.secondOfMinute().setCopy(12);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36080);check(test, 10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36081);check(copy, 10, 20, 12, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36082);try {
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(36083);test.secondOfMinute().setCopy(60);
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(36084);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36085);try {
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(36086);test.secondOfMinute().setCopy(-1);
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(36087);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1rjxrjxlc8azvkw.R.flushNeeded();}}

    public void testPropertySetTextSecond() {__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceStart(getClass().getName(),36088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1thtsozrug();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rjxrjxlc8azvkw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertySetTextSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36088,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1thtsozrug(){try{__CLR4_4_1rjxrjxlc8azvkw.R.inc(36088);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36089);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36090);LocalTime copy = test.secondOfMinute().setCopy("12");
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36091);check(test, 10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36092);check(copy, 10, 20, 12, 40);
    }finally{__CLR4_4_1rjxrjxlc8azvkw.R.flushNeeded();}}

    public void testPropertyCompareToSecond() {__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceStart(getClass().getName(),36093);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_146s4c4rul();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rjxrjxlc8azvkw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyCompareToSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36093,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_146s4c4rul(){try{__CLR4_4_1rjxrjxlc8azvkw.R.inc(36093);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36094);LocalTime test1 = new LocalTime(TEST_TIME1);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36095);LocalTime test2 = new LocalTime(TEST_TIME2);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36096);assertEquals(true, test1.secondOfMinute().compareTo(test2) < 0);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36097);assertEquals(true, test2.secondOfMinute().compareTo(test1) > 0);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36098);assertEquals(true, test1.secondOfMinute().compareTo(test1) == 0);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36099);try {
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(36100);test1.secondOfMinute().compareTo((ReadablePartial) null);
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(36101);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36102);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36103);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36104);assertEquals(true, test1.secondOfMinute().compareTo(dt2) < 0);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36105);assertEquals(true, test2.secondOfMinute().compareTo(dt1) > 0);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36106);assertEquals(true, test1.secondOfMinute().compareTo(dt1) == 0);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36107);try {
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(36108);test1.secondOfMinute().compareTo((ReadableInstant) null);
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(36109);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1rjxrjxlc8azvkw.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPropertyGetMilli() {__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceStart(getClass().getName(),36110);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15098brv2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rjxrjxlc8azvkw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyGetMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36110,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15098brv2(){try{__CLR4_4_1rjxrjxlc8azvkw.R.inc(36110);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36111);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36112);assertSame(test.getChronology().millisOfSecond(), test.millisOfSecond().getField());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36113);assertEquals("millisOfSecond", test.millisOfSecond().getName());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36114);assertEquals("Property[millisOfSecond]", test.millisOfSecond().toString());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36115);assertSame(test, test.millisOfSecond().getLocalTime());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36116);assertEquals(40, test.millisOfSecond().get());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36117);assertEquals("40", test.millisOfSecond().getAsString());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36118);assertEquals("40", test.millisOfSecond().getAsText());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36119);assertEquals("40", test.millisOfSecond().getAsText(Locale.FRENCH));
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36120);assertEquals("40", test.millisOfSecond().getAsShortText());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36121);assertEquals("40", test.millisOfSecond().getAsShortText(Locale.FRENCH));
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36122);assertEquals(test.getChronology().millis(), test.millisOfSecond().getDurationField());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36123);assertEquals(test.getChronology().seconds(), test.millisOfSecond().getRangeDurationField());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36124);assertEquals(3, test.millisOfSecond().getMaximumTextLength(null));
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36125);assertEquals(3, test.millisOfSecond().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1rjxrjxlc8azvkw.R.flushNeeded();}}

    public void testPropertyGetMaxMinValuesMilli() {__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceStart(getClass().getName(),36126);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ob72xhrvi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rjxrjxlc8azvkw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyGetMaxMinValuesMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36126,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ob72xhrvi(){try{__CLR4_4_1rjxrjxlc8azvkw.R.inc(36126);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36127);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36128);assertEquals(0, test.millisOfSecond().getMinimumValue());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36129);assertEquals(0, test.millisOfSecond().getMinimumValueOverall());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36130);assertEquals(999, test.millisOfSecond().getMaximumValue());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36131);assertEquals(999, test.millisOfSecond().getMaximumValueOverall());
    }finally{__CLR4_4_1rjxrjxlc8azvkw.R.flushNeeded();}}

    public void testPropertyWithMaxMinValueMilli() {__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceStart(getClass().getName(),36132);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ynnm0urvo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rjxrjxlc8azvkw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyWithMaxMinValueMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36132,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ynnm0urvo(){try{__CLR4_4_1rjxrjxlc8azvkw.R.inc(36132);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36133);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36134);check(test.millisOfSecond().withMaximumValue(), 10, 20, 30, 999);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36135);check(test.millisOfSecond().withMinimumValue(), 10, 20, 30, 0);
    }finally{__CLR4_4_1rjxrjxlc8azvkw.R.flushNeeded();}}

    public void testPropertyPlusMilli() {__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceStart(getClass().getName(),36136);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xvmzwzrvs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rjxrjxlc8azvkw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyPlusMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36136,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xvmzwzrvs(){try{__CLR4_4_1rjxrjxlc8azvkw.R.inc(36136);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36137);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36138);LocalTime copy = test.millisOfSecond().addCopy(9);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36139);check(test, 10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36140);check(copy, 10, 20, 30, 49);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36141);copy = test.millisOfSecond().addCopy(959);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36142);check(copy, 10, 20, 30, 999);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36143);copy = test.millisOfSecond().addCopy(960);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36144);check(copy, 10, 20, 31, 0);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36145);copy = test.millisOfSecond().addCopy(13 * 60 * 60 * 1000 + 39 * 60 * 1000 + 29 * 1000 + 959);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36146);check(copy, 23, 59, 59, 999);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36147);copy = test.millisOfSecond().addCopy(13 * 60 * 60 * 1000 + 39 * 60 * 1000 + 29 * 1000 + 960);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36148);check(copy, 0, 0, 0, 0);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36149);copy = test.millisOfSecond().addCopy(-9);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36150);check(copy, 10, 20, 30, 31);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36151);copy = test.millisOfSecond().addCopy(-40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36152);check(copy, 10, 20, 30, 0);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36153);copy = test.millisOfSecond().addCopy(-41);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36154);check(copy, 10, 20, 29, 999);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36155);copy = test.millisOfSecond().addCopy(-(10 * 60 * 60 * 1000 + 20 * 60 * 1000 + 30 * 1000 + 40));
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36156);check(copy, 0, 0, 0, 0);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36157);copy = test.millisOfSecond().addCopy(-(10 * 60 * 60 * 1000 + 20 * 60 * 1000 + 30 * 1000 + 41));
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36158);check(copy, 23, 59, 59, 999);
    }finally{__CLR4_4_1rjxrjxlc8azvkw.R.flushNeeded();}}

    public void testPropertyPlusNoWrapMilli() {__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceStart(getClass().getName(),36159);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16xw2uwrwf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rjxrjxlc8azvkw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyPlusNoWrapMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36159,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16xw2uwrwf(){try{__CLR4_4_1rjxrjxlc8azvkw.R.inc(36159);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36160);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36161);LocalTime copy = test.millisOfSecond().addNoWrapToCopy(9);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36162);check(test, 10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36163);check(copy, 10, 20, 30, 49);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36164);copy = test.millisOfSecond().addNoWrapToCopy(959);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36165);check(copy, 10, 20, 30, 999);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36166);copy = test.millisOfSecond().addNoWrapToCopy(960);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36167);check(copy, 10, 20, 31, 0);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36168);copy = test.millisOfSecond().addNoWrapToCopy(13 * 60 * 60 * 1000 + 39 * 60 * 1000 + 29 * 1000 + 959);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36169);check(copy, 23, 59, 59, 999);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36170);try {
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(36171);test.millisOfSecond().addNoWrapToCopy(13 * 60 * 60 * 1000 + 39 * 60 * 1000 + 29 * 1000 + 960);
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(36172);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36173);check(test, 10, 20, 30, 40);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36174);copy = test.millisOfSecond().addNoWrapToCopy(-9);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36175);check(copy, 10, 20, 30, 31);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36176);copy = test.millisOfSecond().addNoWrapToCopy(-40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36177);check(copy, 10, 20, 30, 0);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36178);copy = test.millisOfSecond().addNoWrapToCopy(-41);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36179);check(copy, 10, 20, 29, 999);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36180);copy = test.millisOfSecond().addNoWrapToCopy(-(10 * 60 * 60 * 1000 + 20 * 60 * 1000 + 30 * 1000 + 40));
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36181);check(copy, 0, 0, 0, 0);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36182);try {
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(36183);test.millisOfSecond().addNoWrapToCopy(-(10 * 60 * 60 * 1000 + 20 * 60 * 1000 + 30 * 1000 + 41));
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(36184);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36185);check(test, 10, 20, 30, 40);
    }finally{__CLR4_4_1rjxrjxlc8azvkw.R.flushNeeded();}}

    public void testPropertyPlusWrapFieldMilli() {__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceStart(getClass().getName(),36186);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1732wlhrx6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rjxrjxlc8azvkw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyPlusWrapFieldMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36186,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1732wlhrx6(){try{__CLR4_4_1rjxrjxlc8azvkw.R.inc(36186);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36187);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36188);LocalTime copy = test.millisOfSecond().addWrapFieldToCopy(9);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36189);check(test, 10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36190);check(copy, 10, 20, 30, 49);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36191);copy = test.millisOfSecond().addWrapFieldToCopy(995);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36192);check(copy, 10, 20, 30, 35);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36193);copy = test.millisOfSecond().addWrapFieldToCopy(-47);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36194);check(copy, 10, 20, 30, 993);
    }finally{__CLR4_4_1rjxrjxlc8azvkw.R.flushNeeded();}}

    public void testPropertySetMilli() {__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceStart(getClass().getName(),36195);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1feqhbtrxf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rjxrjxlc8azvkw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertySetMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36195,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1feqhbtrxf(){try{__CLR4_4_1rjxrjxlc8azvkw.R.inc(36195);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36196);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36197);LocalTime copy = test.millisOfSecond().setCopy(12);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36198);check(test, 10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36199);check(copy, 10, 20, 30, 12);
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36200);try {
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(36201);test.millisOfSecond().setCopy(1000);
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(36202);fail();
        } catch (IllegalArgumentException ex) {}
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36203);try {
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(36204);test.millisOfSecond().setCopy(-1);
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(36205);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1rjxrjxlc8azvkw.R.flushNeeded();}}

    public void testPropertySetTextMilli() {__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceStart(getClass().getName(),36206);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17iyw2crxq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rjxrjxlc8azvkw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertySetTextMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36206,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17iyw2crxq(){try{__CLR4_4_1rjxrjxlc8azvkw.R.inc(36206);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36207);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36208);LocalTime copy = test.millisOfSecond().setCopy("12");
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36209);check(test, 10, 20, 30, 40);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36210);check(copy, 10, 20, 30, 12);
    }finally{__CLR4_4_1rjxrjxlc8azvkw.R.flushNeeded();}}

    public void testPropertyCompareToMilli() {__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceStart(getClass().getName(),36211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13rds2trxv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1rjxrjxlc8azvkw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1rjxrjxlc8azvkw.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Properties.testPropertyCompareToMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36211,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13rds2trxv(){try{__CLR4_4_1rjxrjxlc8azvkw.R.inc(36211);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36212);LocalTime test1 = new LocalTime(TEST_TIME1);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36213);LocalTime test2 = new LocalTime(TEST_TIME2);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36214);assertEquals(true, test1.millisOfSecond().compareTo(test2) < 0);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36215);assertEquals(true, test2.millisOfSecond().compareTo(test1) > 0);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36216);assertEquals(true, test1.millisOfSecond().compareTo(test1) == 0);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36217);try {
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(36218);test1.millisOfSecond().compareTo((ReadablePartial) null);
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(36219);fail();
        } catch (IllegalArgumentException ex) {}
        
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36220);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36221);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36222);assertEquals(true, test1.millisOfSecond().compareTo(dt2) < 0);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36223);assertEquals(true, test2.millisOfSecond().compareTo(dt1) > 0);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36224);assertEquals(true, test1.millisOfSecond().compareTo(dt1) == 0);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36225);try {
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(36226);test1.millisOfSecond().compareTo((ReadableInstant) null);
            __CLR4_4_1rjxrjxlc8azvkw.R.inc(36227);fail();
        } catch (IllegalArgumentException ex) {}
    }finally{__CLR4_4_1rjxrjxlc8azvkw.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void check(LocalTime test, int hour, int min, int sec, int milli) {try{__CLR4_4_1rjxrjxlc8azvkw.R.inc(36228);
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36229);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36230);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36231);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1rjxrjxlc8azvkw.R.inc(36232);assertEquals(milli, test.getMillisOfSecond());
    }finally{__CLR4_4_1rjxrjxlc8azvkw.R.flushNeeded();}}
}
