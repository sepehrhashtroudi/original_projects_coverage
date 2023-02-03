/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2005 Stephen Colebourne
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

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Test case.
 *
 * @author Stephen Colebourne
 */
public class TestDateTimeConstants extends TestCase {static class __CLR4_4_1igmigmlc8azu9y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,23980,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * The main method for this test program.
     * @param args command line arguments.
     */
    public static void main(String[] args) {try{__CLR4_4_1igmigmlc8azu9y.R.inc(23926);
        __CLR4_4_1igmigmlc8azu9y.R.inc(23927);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1igmigmlc8azu9y.R.flushNeeded();}}

    /**
     * TestSuite is a junit required method.
     */
    public static TestSuite suite() {try{__CLR4_4_1igmigmlc8azu9y.R.inc(23928);
        __CLR4_4_1igmigmlc8azu9y.R.inc(23929);return new TestSuite(TestDateTimeConstants.class);
    }finally{__CLR4_4_1igmigmlc8azu9y.R.flushNeeded();}}

    /**
     * TestDateTimeComparator constructor.
     * @param name
     */
    public TestDateTimeConstants(String name) {
        super(name);__CLR4_4_1igmigmlc8azu9y.R.inc(23931);try{__CLR4_4_1igmigmlc8azu9y.R.inc(23930);
    }finally{__CLR4_4_1igmigmlc8azu9y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstructor() {__CLR4_4_1igmigmlc8azu9y.R.globalSliceStart(getClass().getName(),23932);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uefs8higs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igmigmlc8azu9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igmigmlc8azu9y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeConstants.testConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23932,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uefs8higs(){try{__CLR4_4_1igmigmlc8azu9y.R.inc(23932);
        __CLR4_4_1igmigmlc8azu9y.R.inc(23933);DateTimeConstants c = new DateTimeConstants() {
        };
        __CLR4_4_1igmigmlc8azu9y.R.inc(23934);c.toString();
    }finally{__CLR4_4_1igmigmlc8azu9y.R.flushNeeded();}}

    public void testHalfdaysOfDay() {__CLR4_4_1igmigmlc8azu9y.R.globalSliceStart(getClass().getName(),23935);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_181u3gwigv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igmigmlc8azu9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igmigmlc8azu9y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeConstants.testHalfdaysOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23935,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_181u3gwigv(){try{__CLR4_4_1igmigmlc8azu9y.R.inc(23935);
        __CLR4_4_1igmigmlc8azu9y.R.inc(23936);assertEquals(0, DateTimeConstants.AM);
        __CLR4_4_1igmigmlc8azu9y.R.inc(23937);assertEquals(1, DateTimeConstants.PM);
    }finally{__CLR4_4_1igmigmlc8azu9y.R.flushNeeded();}}

    public void testDaysOfWeek() {__CLR4_4_1igmigmlc8azu9y.R.globalSliceStart(getClass().getName(),23938);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1owb339igy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igmigmlc8azu9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igmigmlc8azu9y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeConstants.testDaysOfWeek",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23938,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1owb339igy(){try{__CLR4_4_1igmigmlc8azu9y.R.inc(23938);
        __CLR4_4_1igmigmlc8azu9y.R.inc(23939);assertEquals(1, DateTimeConstants.MONDAY);
        __CLR4_4_1igmigmlc8azu9y.R.inc(23940);assertEquals(2, DateTimeConstants.TUESDAY);
        __CLR4_4_1igmigmlc8azu9y.R.inc(23941);assertEquals(3, DateTimeConstants.WEDNESDAY);
        __CLR4_4_1igmigmlc8azu9y.R.inc(23942);assertEquals(4, DateTimeConstants.THURSDAY);
        __CLR4_4_1igmigmlc8azu9y.R.inc(23943);assertEquals(5, DateTimeConstants.FRIDAY);
        __CLR4_4_1igmigmlc8azu9y.R.inc(23944);assertEquals(6, DateTimeConstants.SATURDAY);
        __CLR4_4_1igmigmlc8azu9y.R.inc(23945);assertEquals(7, DateTimeConstants.SUNDAY);
    }finally{__CLR4_4_1igmigmlc8azu9y.R.flushNeeded();}}

    public void testMonthsOfYear() {__CLR4_4_1igmigmlc8azu9y.R.globalSliceStart(getClass().getName(),23946);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14fhyu8ih6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igmigmlc8azu9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igmigmlc8azu9y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeConstants.testMonthsOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23946,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14fhyu8ih6(){try{__CLR4_4_1igmigmlc8azu9y.R.inc(23946);
        __CLR4_4_1igmigmlc8azu9y.R.inc(23947);assertEquals(1, DateTimeConstants.JANUARY);
        __CLR4_4_1igmigmlc8azu9y.R.inc(23948);assertEquals(2, DateTimeConstants.FEBRUARY);
        __CLR4_4_1igmigmlc8azu9y.R.inc(23949);assertEquals(3, DateTimeConstants.MARCH);
        __CLR4_4_1igmigmlc8azu9y.R.inc(23950);assertEquals(4, DateTimeConstants.APRIL);
        __CLR4_4_1igmigmlc8azu9y.R.inc(23951);assertEquals(5, DateTimeConstants.MAY);
        __CLR4_4_1igmigmlc8azu9y.R.inc(23952);assertEquals(6, DateTimeConstants.JUNE);
        __CLR4_4_1igmigmlc8azu9y.R.inc(23953);assertEquals(7, DateTimeConstants.JULY);
        __CLR4_4_1igmigmlc8azu9y.R.inc(23954);assertEquals(8, DateTimeConstants.AUGUST);
        __CLR4_4_1igmigmlc8azu9y.R.inc(23955);assertEquals(9, DateTimeConstants.SEPTEMBER);
        __CLR4_4_1igmigmlc8azu9y.R.inc(23956);assertEquals(10, DateTimeConstants.OCTOBER);
        __CLR4_4_1igmigmlc8azu9y.R.inc(23957);assertEquals(11, DateTimeConstants.NOVEMBER);
        __CLR4_4_1igmigmlc8azu9y.R.inc(23958);assertEquals(12, DateTimeConstants.DECEMBER);
    }finally{__CLR4_4_1igmigmlc8azu9y.R.flushNeeded();}}

    public void testEras() {__CLR4_4_1igmigmlc8azu9y.R.globalSliceStart(getClass().getName(),23959);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14ofblkihj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igmigmlc8azu9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igmigmlc8azu9y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeConstants.testEras",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23959,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14ofblkihj(){try{__CLR4_4_1igmigmlc8azu9y.R.inc(23959);
        __CLR4_4_1igmigmlc8azu9y.R.inc(23960);assertEquals(0, DateTimeConstants.BC);
        __CLR4_4_1igmigmlc8azu9y.R.inc(23961);assertEquals(0, DateTimeConstants.BCE);
        __CLR4_4_1igmigmlc8azu9y.R.inc(23962);assertEquals(1, DateTimeConstants.AD);
        __CLR4_4_1igmigmlc8azu9y.R.inc(23963);assertEquals(1, DateTimeConstants.CE);
    }finally{__CLR4_4_1igmigmlc8azu9y.R.flushNeeded();}}

    public void testMaths() {__CLR4_4_1igmigmlc8azu9y.R.globalSliceStart(getClass().getName(),23964);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g0a0wwiho();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1igmigmlc8azu9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1igmigmlc8azu9y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeConstants.testMaths",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23964,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g0a0wwiho(){try{__CLR4_4_1igmigmlc8azu9y.R.inc(23964);
        __CLR4_4_1igmigmlc8azu9y.R.inc(23965);assertEquals(1000, DateTimeConstants.MILLIS_PER_SECOND);
        __CLR4_4_1igmigmlc8azu9y.R.inc(23966);assertEquals(60 * 1000, DateTimeConstants.MILLIS_PER_MINUTE);
        __CLR4_4_1igmigmlc8azu9y.R.inc(23967);assertEquals(60 * 60 * 1000, DateTimeConstants.MILLIS_PER_HOUR);
        __CLR4_4_1igmigmlc8azu9y.R.inc(23968);assertEquals(24 * 60 * 60 * 1000, DateTimeConstants.MILLIS_PER_DAY);
        __CLR4_4_1igmigmlc8azu9y.R.inc(23969);assertEquals(7 * 24 * 60 * 60 * 1000, DateTimeConstants.MILLIS_PER_WEEK);
        
        __CLR4_4_1igmigmlc8azu9y.R.inc(23970);assertEquals(60, DateTimeConstants.SECONDS_PER_MINUTE);
        __CLR4_4_1igmigmlc8azu9y.R.inc(23971);assertEquals(60 * 60, DateTimeConstants.SECONDS_PER_HOUR);
        __CLR4_4_1igmigmlc8azu9y.R.inc(23972);assertEquals(24 * 60 * 60, DateTimeConstants.SECONDS_PER_DAY);
        __CLR4_4_1igmigmlc8azu9y.R.inc(23973);assertEquals(7 * 24 * 60 * 60, DateTimeConstants.SECONDS_PER_WEEK);
        
        __CLR4_4_1igmigmlc8azu9y.R.inc(23974);assertEquals(60, DateTimeConstants.MINUTES_PER_HOUR);
        __CLR4_4_1igmigmlc8azu9y.R.inc(23975);assertEquals(24 * 60, DateTimeConstants.MINUTES_PER_DAY);
        __CLR4_4_1igmigmlc8azu9y.R.inc(23976);assertEquals(7 * 24 * 60, DateTimeConstants.MINUTES_PER_WEEK);
        
        __CLR4_4_1igmigmlc8azu9y.R.inc(23977);assertEquals(24, DateTimeConstants.HOURS_PER_DAY);
        __CLR4_4_1igmigmlc8azu9y.R.inc(23978);assertEquals(7 * 24, DateTimeConstants.HOURS_PER_WEEK);
        
        __CLR4_4_1igmigmlc8azu9y.R.inc(23979);assertEquals(7, DateTimeConstants.DAYS_PER_WEEK);
    }finally{__CLR4_4_1igmigmlc8azu9y.R.flushNeeded();}}

}
