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

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Entry point for all tests in this package.
 * 
 * @version $Revision$ $Date$
 * 
 * @author Stephen Colebourne
 */
public class TestAll extends TestCase {static class __CLR4_4_1grcgrclc8azu1w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,21801,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public TestAll(String testName) {
        super(testName);__CLR4_4_1grcgrclc8azu1w.R.inc(21721);try{__CLR4_4_1grcgrclc8azu1w.R.inc(21720);
    }finally{__CLR4_4_1grcgrclc8azu1w.R.flushNeeded();}}

    public static Test suite() {try{__CLR4_4_1grcgrclc8azu1w.R.inc(21722);
        __CLR4_4_1grcgrclc8azu1w.R.inc(21723);TestSuite suite = new TestSuite();
        __CLR4_4_1grcgrclc8azu1w.R.inc(21724);suite.addTest(TestChronology.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21725);suite.addTest(TestDateTimeFieldType.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21726);suite.addTest(TestDurationFieldType.suite());
        
        __CLR4_4_1grcgrclc8azu1w.R.inc(21727);suite.addTest(TestInstant_Constructors.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21728);suite.addTest(TestInstant_Basics.suite());
        
        __CLR4_4_1grcgrclc8azu1w.R.inc(21729);suite.addTest(TestDateTime_Constructors.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21730);suite.addTest(TestDateTime_Basics.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21731);suite.addTest(TestDateTime_Properties.suite());
        
        __CLR4_4_1grcgrclc8azu1w.R.inc(21732);suite.addTest(TestMutableDateTime_Constructors.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21733);suite.addTest(TestMutableDateTime_Basics.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21734);suite.addTest(TestMutableDateTime_Sets.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21735);suite.addTest(TestMutableDateTime_Adds.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21736);suite.addTest(TestMutableDateTime_Properties.suite());
        
        __CLR4_4_1grcgrclc8azu1w.R.inc(21737);suite.addTest(TestDateMidnight_Constructors.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21738);suite.addTest(TestDateMidnight_Basics.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21739);suite.addTest(TestDateMidnight_Properties.suite());
        
        __CLR4_4_1grcgrclc8azu1w.R.inc(21740);suite.addTest(TestDuration_Constructors.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21741);suite.addTest(TestDuration_Basics.suite());
        
        __CLR4_4_1grcgrclc8azu1w.R.inc(21742);suite.addTest(TestInterval_Constructors.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21743);suite.addTest(TestInterval_Basics.suite());
        
        __CLR4_4_1grcgrclc8azu1w.R.inc(21744);suite.addTest(TestLocalDateTime_Constructors.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21745);suite.addTest(TestLocalDateTime_Basics.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21746);suite.addTest(TestLocalDateTime_Properties.suite());
        
        __CLR4_4_1grcgrclc8azu1w.R.inc(21747);suite.addTest(TestLocalDate_Constructors.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21748);suite.addTest(TestLocalDate_Basics.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21749);suite.addTest(TestLocalDate_Properties.suite());
        
        __CLR4_4_1grcgrclc8azu1w.R.inc(21750);suite.addTest(TestLocalTime_Constructors.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21751);suite.addTest(TestLocalTime_Basics.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21752);suite.addTest(TestLocalTime_Properties.suite());
        
        __CLR4_4_1grcgrclc8azu1w.R.inc(21753);suite.addTest(TestMutableInterval_Constructors.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21754);suite.addTest(TestMutableInterval_Basics.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21755);suite.addTest(TestMutableInterval_Updates.suite());
        
        __CLR4_4_1grcgrclc8azu1w.R.inc(21756);suite.addTest(TestPeriod_Constructors.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21757);suite.addTest(TestPeriod_Basics.suite());
        
        __CLR4_4_1grcgrclc8azu1w.R.inc(21758);suite.addTest(TestMutablePeriod_Constructors.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21759);suite.addTest(TestMutablePeriod_Basics.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21760);suite.addTest(TestMutablePeriod_Updates.suite());
        
        __CLR4_4_1grcgrclc8azu1w.R.inc(21761);suite.addTest(TestBaseSingleFieldPeriod.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21762);suite.addTest(TestYears.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21763);suite.addTest(TestMonths.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21764);suite.addTest(TestWeeks.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21765);suite.addTest(TestDays.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21766);suite.addTest(TestHours.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21767);suite.addTest(TestMinutes.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21768);suite.addTest(TestSeconds.suite());
        
        __CLR4_4_1grcgrclc8azu1w.R.inc(21769);suite.addTest(TestTimeOfDay_Basics.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21770);suite.addTest(TestTimeOfDay_Constructors.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21771);suite.addTest(TestTimeOfDay_Properties.suite());
        
        __CLR4_4_1grcgrclc8azu1w.R.inc(21772);suite.addTest(TestYearMonthDay_Basics.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21773);suite.addTest(TestYearMonthDay_Constructors.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21774);suite.addTest(TestYearMonthDay_Properties.suite());
        
        __CLR4_4_1grcgrclc8azu1w.R.inc(21775);suite.addTest(TestYearMonth_Basics.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21776);suite.addTest(TestYearMonth_Constructors.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21777);suite.addTest(TestYearMonth_Properties.suite());
        
        __CLR4_4_1grcgrclc8azu1w.R.inc(21778);suite.addTest(TestMonthDay_Basics.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21779);suite.addTest(TestMonthDay_Constructors.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21780);suite.addTest(TestMonthDay_Properties.suite());
        
        __CLR4_4_1grcgrclc8azu1w.R.inc(21781);suite.addTest(TestPartial_Basics.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21782);suite.addTest(TestPartial_Constructors.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21783);suite.addTest(TestPartial_Properties.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21784);suite.addTest(TestPartial_Match.suite());
        
        __CLR4_4_1grcgrclc8azu1w.R.inc(21785);suite.addTest(TestAbstractPartial.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21786);suite.addTest(TestBasePartial.suite());
        
        __CLR4_4_1grcgrclc8azu1w.R.inc(21787);suite.addTest(TestDateTimeComparator.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21788);suite.addTest(TestDateTimeConstants.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21789);suite.addTest(TestDateTimeUtils.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21790);suite.addTest(TestDateTimeZone.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21791);suite.addTest(TestDateTimeZoneCutover.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21792);suite.addTest(TestPeriodType.suite());
//        suite.addTest(TestParseISO.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21793);suite.addTest(TestDurationField.suite());
        
        __CLR4_4_1grcgrclc8azu1w.R.inc(21794);suite.addTest(TestStringConvert.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21795);suite.addTest(TestSerialization.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21796);suite.addTest(TestIllegalFieldValueException.suite());
        __CLR4_4_1grcgrclc8azu1w.R.inc(21797);return suite;
    }finally{__CLR4_4_1grcgrclc8azu1w.R.flushNeeded();}}

    public static void main(String args[]) {try{__CLR4_4_1grcgrclc8azu1w.R.inc(21798);
        __CLR4_4_1grcgrclc8azu1w.R.inc(21799);String[] testCaseName = {
            TestAll.class.getName()
        };
        __CLR4_4_1grcgrclc8azu1w.R.inc(21800);junit.textui.TestRunner.main(testCaseName);
    }finally{__CLR4_4_1grcgrclc8azu1w.R.flushNeeded();}}

}
