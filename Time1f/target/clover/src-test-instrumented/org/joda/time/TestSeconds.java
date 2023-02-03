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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * This class is a Junit unit test for Seconds.
 *
 * @author Stephen Colebourne
 */
public class TestSeconds extends TestCase {static class __CLR4_4_1zbzzbzlc8azw7i{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,46001,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1zbzzbzlc8azw7i.R.inc(45791);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45792);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1zbzzbzlc8azw7i.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1zbzzbzlc8azw7i.R.inc(45793);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45794);return new TestSuite(TestSeconds.class);
    }finally{__CLR4_4_1zbzzbzlc8azw7i.R.flushNeeded();}}

    public TestSeconds(String name) {
        super(name);__CLR4_4_1zbzzbzlc8azw7i.R.inc(45796);try{__CLR4_4_1zbzzbzlc8azw7i.R.inc(45795);
    }finally{__CLR4_4_1zbzzbzlc8azw7i.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1zbzzbzlc8azw7i.R.inc(45797);
    }finally{__CLR4_4_1zbzzbzlc8azw7i.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1zbzzbzlc8azw7i.R.inc(45798);
    }finally{__CLR4_4_1zbzzbzlc8azw7i.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstants() {__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceStart(getClass().getName(),45799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15epzlwzc7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zbzzbzlc8azw7i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testConstants",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45799,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15epzlwzc7(){try{__CLR4_4_1zbzzbzlc8azw7i.R.inc(45799);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45800);assertEquals(0, Seconds.ZERO.getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45801);assertEquals(1, Seconds.ONE.getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45802);assertEquals(2, Seconds.TWO.getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45803);assertEquals(3, Seconds.THREE.getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45804);assertEquals(Integer.MAX_VALUE, Seconds.MAX_VALUE.getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45805);assertEquals(Integer.MIN_VALUE, Seconds.MIN_VALUE.getSeconds());
    }finally{__CLR4_4_1zbzzbzlc8azw7i.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactory_seconds_int() {__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceStart(getClass().getName(),45806);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w1dscvzce();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zbzzbzlc8azw7i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testFactory_seconds_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45806,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w1dscvzce(){try{__CLR4_4_1zbzzbzlc8azw7i.R.inc(45806);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45807);assertSame(Seconds.ZERO, Seconds.seconds(0));
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45808);assertSame(Seconds.ONE, Seconds.seconds(1));
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45809);assertSame(Seconds.TWO, Seconds.seconds(2));
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45810);assertSame(Seconds.THREE, Seconds.seconds(3));
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45811);assertSame(Seconds.MAX_VALUE, Seconds.seconds(Integer.MAX_VALUE));
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45812);assertSame(Seconds.MIN_VALUE, Seconds.seconds(Integer.MIN_VALUE));
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45813);assertEquals(-1, Seconds.seconds(-1).getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45814);assertEquals(4, Seconds.seconds(4).getSeconds());
    }finally{__CLR4_4_1zbzzbzlc8azw7i.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactory_secondsBetween_RInstant() {__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceStart(getClass().getName(),45815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x55zzvzcn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zbzzbzlc8azw7i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testFactory_secondsBetween_RInstant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45815,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x55zzvzcn(){try{__CLR4_4_1zbzzbzlc8azw7i.R.inc(45815);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45816);DateTime start = new DateTime(2006, 6, 9, 12, 0, 3, 0, PARIS);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45817);DateTime end1 = new DateTime(2006, 6, 9, 12, 0, 6, 0, PARIS);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45818);DateTime end2 = new DateTime(2006, 6, 9, 12, 0, 9, 0, PARIS);
        
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45819);assertEquals(3, Seconds.secondsBetween(start, end1).getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45820);assertEquals(0, Seconds.secondsBetween(start, start).getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45821);assertEquals(0, Seconds.secondsBetween(end1, end1).getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45822);assertEquals(-3, Seconds.secondsBetween(end1, start).getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45823);assertEquals(6, Seconds.secondsBetween(start, end2).getSeconds());
    }finally{__CLR4_4_1zbzzbzlc8azw7i.R.flushNeeded();}}

    public void testFactory_secondsBetween_RPartial() {__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceStart(getClass().getName(),45824);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1go2bizzcw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zbzzbzlc8azw7i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testFactory_secondsBetween_RPartial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45824,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1go2bizzcw(){try{__CLR4_4_1zbzzbzlc8azw7i.R.inc(45824);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45825);LocalTime start = new LocalTime(12, 0, 3);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45826);LocalTime end1 = new LocalTime(12, 0, 6);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45827);@SuppressWarnings("deprecation")
        TimeOfDay end2 = new TimeOfDay(12, 0, 9);
        
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45828);assertEquals(3, Seconds.secondsBetween(start, end1).getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45829);assertEquals(0, Seconds.secondsBetween(start, start).getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45830);assertEquals(0, Seconds.secondsBetween(end1, end1).getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45831);assertEquals(-3, Seconds.secondsBetween(end1, start).getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45832);assertEquals(6, Seconds.secondsBetween(start, end2).getSeconds());
    }finally{__CLR4_4_1zbzzbzlc8azw7i.R.flushNeeded();}}

    public void testFactory_secondsIn_RInterval() {__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceStart(getClass().getName(),45833);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vnr6ikzd5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zbzzbzlc8azw7i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testFactory_secondsIn_RInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45833,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vnr6ikzd5(){try{__CLR4_4_1zbzzbzlc8azw7i.R.inc(45833);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45834);DateTime start = new DateTime(2006, 6, 9, 12, 0, 3, 0, PARIS);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45835);DateTime end1 = new DateTime(2006, 6, 9, 12, 0, 6, 0, PARIS);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45836);DateTime end2 = new DateTime(2006, 6, 9, 12, 0, 9, 0, PARIS);
        
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45837);assertEquals(0, Seconds.secondsIn((ReadableInterval) null).getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45838);assertEquals(3, Seconds.secondsIn(new Interval(start, end1)).getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45839);assertEquals(0, Seconds.secondsIn(new Interval(start, start)).getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45840);assertEquals(0, Seconds.secondsIn(new Interval(end1, end1)).getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45841);assertEquals(6, Seconds.secondsIn(new Interval(start, end2)).getSeconds());
    }finally{__CLR4_4_1zbzzbzlc8azw7i.R.flushNeeded();}}

    public void testFactory_standardSecondsIn_RPeriod() {__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceStart(getClass().getName(),45842);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_138nhb9zde();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zbzzbzlc8azw7i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testFactory_standardSecondsIn_RPeriod",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45842,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_138nhb9zde(){try{__CLR4_4_1zbzzbzlc8azw7i.R.inc(45842);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45843);assertEquals(0, Seconds.standardSecondsIn((ReadablePeriod) null).getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45844);assertEquals(0, Seconds.standardSecondsIn(Period.ZERO).getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45845);assertEquals(1, Seconds.standardSecondsIn(new Period(0, 0, 0, 0, 0, 0, 1, 0)).getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45846);assertEquals(123, Seconds.standardSecondsIn(Period.seconds(123)).getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45847);assertEquals(-987, Seconds.standardSecondsIn(Period.seconds(-987)).getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45848);assertEquals(2 * 24 * 60 * 60, Seconds.standardSecondsIn(Period.days(2)).getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45849);try {
            __CLR4_4_1zbzzbzlc8azw7i.R.inc(45850);Seconds.standardSecondsIn(Period.months(1));
            __CLR4_4_1zbzzbzlc8azw7i.R.inc(45851);fail();
        } catch (IllegalArgumentException ex) {
            // expeceted
        }
    }finally{__CLR4_4_1zbzzbzlc8azw7i.R.flushNeeded();}}

    public void testFactory_parseSeconds_String() {__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceStart(getClass().getName(),45852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nwzgkzdo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zbzzbzlc8azw7i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testFactory_parseSeconds_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45852,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nwzgkzdo(){try{__CLR4_4_1zbzzbzlc8azw7i.R.inc(45852);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45853);assertEquals(0, Seconds.parseSeconds((String) null).getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45854);assertEquals(0, Seconds.parseSeconds("PT0S").getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45855);assertEquals(1, Seconds.parseSeconds("PT1S").getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45856);assertEquals(-3, Seconds.parseSeconds("PT-3S").getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45857);assertEquals(2, Seconds.parseSeconds("P0Y0M0DT2S").getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45858);assertEquals(2, Seconds.parseSeconds("PT0H2S").getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45859);try {
            __CLR4_4_1zbzzbzlc8azw7i.R.inc(45860);Seconds.parseSeconds("P1Y1D");
            __CLR4_4_1zbzzbzlc8azw7i.R.inc(45861);fail();
        } catch (IllegalArgumentException ex) {
            // expeceted
        }
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45862);try {
            __CLR4_4_1zbzzbzlc8azw7i.R.inc(45863);Seconds.parseSeconds("P1DT1S");
            __CLR4_4_1zbzzbzlc8azw7i.R.inc(45864);fail();
        } catch (IllegalArgumentException ex) {
            // expeceted
        }
    }finally{__CLR4_4_1zbzzbzlc8azw7i.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetMethods() {__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceStart(getClass().getName(),45865);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12sjdmzze1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zbzzbzlc8azw7i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testGetMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45865,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12sjdmzze1(){try{__CLR4_4_1zbzzbzlc8azw7i.R.inc(45865);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45866);Seconds test = Seconds.seconds(20);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45867);assertEquals(20, test.getSeconds());
    }finally{__CLR4_4_1zbzzbzlc8azw7i.R.flushNeeded();}}

    public void testGetFieldType() {__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceStart(getClass().getName(),45868);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18z86mvze4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zbzzbzlc8azw7i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testGetFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45868,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18z86mvze4(){try{__CLR4_4_1zbzzbzlc8azw7i.R.inc(45868);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45869);Seconds test = Seconds.seconds(20);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45870);assertEquals(DurationFieldType.seconds(), test.getFieldType());
    }finally{__CLR4_4_1zbzzbzlc8azw7i.R.flushNeeded();}}

    public void testGetPeriodType() {__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceStart(getClass().getName(),45871);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ivat1ize7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zbzzbzlc8azw7i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testGetPeriodType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45871,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ivat1ize7(){try{__CLR4_4_1zbzzbzlc8azw7i.R.inc(45871);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45872);Seconds test = Seconds.seconds(20);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45873);assertEquals(PeriodType.seconds(), test.getPeriodType());
    }finally{__CLR4_4_1zbzzbzlc8azw7i.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testIsGreaterThan() {__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceStart(getClass().getName(),45874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s5pnomzea();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zbzzbzlc8azw7i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testIsGreaterThan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45874,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s5pnomzea(){try{__CLR4_4_1zbzzbzlc8azw7i.R.inc(45874);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45875);assertEquals(true, Seconds.THREE.isGreaterThan(Seconds.TWO));
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45876);assertEquals(false, Seconds.THREE.isGreaterThan(Seconds.THREE));
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45877);assertEquals(false, Seconds.TWO.isGreaterThan(Seconds.THREE));
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45878);assertEquals(true, Seconds.ONE.isGreaterThan(null));
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45879);assertEquals(false, Seconds.seconds(-1).isGreaterThan(null));
    }finally{__CLR4_4_1zbzzbzlc8azw7i.R.flushNeeded();}}

    public void testIsLessThan() {__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceStart(getClass().getName(),45880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rmk0kdzeg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zbzzbzlc8azw7i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testIsLessThan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45880,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rmk0kdzeg(){try{__CLR4_4_1zbzzbzlc8azw7i.R.inc(45880);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45881);assertEquals(false, Seconds.THREE.isLessThan(Seconds.TWO));
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45882);assertEquals(false, Seconds.THREE.isLessThan(Seconds.THREE));
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45883);assertEquals(true, Seconds.TWO.isLessThan(Seconds.THREE));
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45884);assertEquals(false, Seconds.ONE.isLessThan(null));
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45885);assertEquals(true, Seconds.seconds(-1).isLessThan(null));
    }finally{__CLR4_4_1zbzzbzlc8azw7i.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString() {__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceStart(getClass().getName(),45886);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdidzem();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zbzzbzlc8azw7i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45886,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdidzem(){try{__CLR4_4_1zbzzbzlc8azw7i.R.inc(45886);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45887);Seconds test = Seconds.seconds(20);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45888);assertEquals("PT20S", test.toString());
        
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45889);test = Seconds.seconds(-20);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45890);assertEquals("PT-20S", test.toString());
    }finally{__CLR4_4_1zbzzbzlc8azw7i.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSerialization() throws Exception {__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceStart(getClass().getName(),45891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on9zer();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zbzzbzlc8azw7i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45891,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on9zer() throws Exception{try{__CLR4_4_1zbzzbzlc8azw7i.R.inc(45891);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45892);Seconds test = Seconds.THREE;
        
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45893);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45894);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45895);oos.writeObject(test);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45896);byte[] bytes = baos.toByteArray();
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45897);oos.close();
        
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45898);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45899);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45900);Seconds result = (Seconds) ois.readObject();
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45901);ois.close();
        
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45902);assertSame(test, result);
    }finally{__CLR4_4_1zbzzbzlc8azw7i.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToStandardWeeks() {__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceStart(getClass().getName(),45903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pfkyx0zf3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zbzzbzlc8azw7i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testToStandardWeeks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45903,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pfkyx0zf3(){try{__CLR4_4_1zbzzbzlc8azw7i.R.inc(45903);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45904);Seconds test = Seconds.seconds(60 * 60 * 24 * 7 * 2);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45905);Weeks expected = Weeks.weeks(2);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45906);assertEquals(expected, test.toStandardWeeks());
    }finally{__CLR4_4_1zbzzbzlc8azw7i.R.flushNeeded();}}

    public void testToStandardDays() {__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceStart(getClass().getName(),45907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eftdm0zf7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zbzzbzlc8azw7i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testToStandardDays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45907,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eftdm0zf7(){try{__CLR4_4_1zbzzbzlc8azw7i.R.inc(45907);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45908);Seconds test = Seconds.seconds(60 * 60 * 24 * 2);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45909);Days expected = Days.days(2);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45910);assertEquals(expected, test.toStandardDays());
    }finally{__CLR4_4_1zbzzbzlc8azw7i.R.flushNeeded();}}

    public void testToStandardHours() {__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceStart(getClass().getName(),45911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ikk7gzfb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zbzzbzlc8azw7i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testToStandardHours",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45911,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ikk7gzfb(){try{__CLR4_4_1zbzzbzlc8azw7i.R.inc(45911);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45912);Seconds test = Seconds.seconds(60 * 60 * 2);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45913);Hours expected = Hours.hours(2);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45914);assertEquals(expected, test.toStandardHours());
    }finally{__CLR4_4_1zbzzbzlc8azw7i.R.flushNeeded();}}

    public void testToStandardMinutes() {__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceStart(getClass().getName(),45915);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r0kt44zff();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zbzzbzlc8azw7i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testToStandardMinutes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45915,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r0kt44zff(){try{__CLR4_4_1zbzzbzlc8azw7i.R.inc(45915);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45916);Seconds test = Seconds.seconds(60 * 2);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45917);Minutes expected = Minutes.minutes(2);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45918);assertEquals(expected, test.toStandardMinutes());
    }finally{__CLR4_4_1zbzzbzlc8azw7i.R.flushNeeded();}}

    public void testToStandardDuration() {__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceStart(getClass().getName(),45919);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1izmvnpzfj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zbzzbzlc8azw7i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testToStandardDuration",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45919,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1izmvnpzfj(){try{__CLR4_4_1zbzzbzlc8azw7i.R.inc(45919);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45920);Seconds test = Seconds.seconds(20);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45921);Duration expected = new Duration(20L * DateTimeConstants.MILLIS_PER_SECOND);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45922);assertEquals(expected, test.toStandardDuration());
        
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45923);expected = new Duration(((long) Integer.MAX_VALUE) * DateTimeConstants.MILLIS_PER_SECOND);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45924);assertEquals(expected, Seconds.MAX_VALUE.toStandardDuration());
    }finally{__CLR4_4_1zbzzbzlc8azw7i.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPlus_int() {__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceStart(getClass().getName(),45925);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1scc4ebzfp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zbzzbzlc8azw7i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testPlus_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45925,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1scc4ebzfp(){try{__CLR4_4_1zbzzbzlc8azw7i.R.inc(45925);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45926);Seconds test2 = Seconds.seconds(2);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45927);Seconds result = test2.plus(3);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45928);assertEquals(2, test2.getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45929);assertEquals(5, result.getSeconds());
        
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45930);assertEquals(1, Seconds.ONE.plus(0).getSeconds());
        
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45931);try {
            __CLR4_4_1zbzzbzlc8azw7i.R.inc(45932);Seconds.MAX_VALUE.plus(1);
            __CLR4_4_1zbzzbzlc8azw7i.R.inc(45933);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1zbzzbzlc8azw7i.R.flushNeeded();}}

    public void testPlus_Seconds() {__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceStart(getClass().getName(),45934);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19utwdvzfy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zbzzbzlc8azw7i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testPlus_Seconds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45934,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19utwdvzfy(){try{__CLR4_4_1zbzzbzlc8azw7i.R.inc(45934);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45935);Seconds test2 = Seconds.seconds(2);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45936);Seconds test3 = Seconds.seconds(3);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45937);Seconds result = test2.plus(test3);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45938);assertEquals(2, test2.getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45939);assertEquals(3, test3.getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45940);assertEquals(5, result.getSeconds());
        
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45941);assertEquals(1, Seconds.ONE.plus(Seconds.ZERO).getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45942);assertEquals(1, Seconds.ONE.plus((Seconds) null).getSeconds());
        
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45943);try {
            __CLR4_4_1zbzzbzlc8azw7i.R.inc(45944);Seconds.MAX_VALUE.plus(Seconds.ONE);
            __CLR4_4_1zbzzbzlc8azw7i.R.inc(45945);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1zbzzbzlc8azw7i.R.flushNeeded();}}

    public void testMinus_int() {__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceStart(getClass().getName(),45946);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_118wkvpzga();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zbzzbzlc8azw7i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testMinus_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45946,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_118wkvpzga(){try{__CLR4_4_1zbzzbzlc8azw7i.R.inc(45946);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45947);Seconds test2 = Seconds.seconds(2);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45948);Seconds result = test2.minus(3);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45949);assertEquals(2, test2.getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45950);assertEquals(-1, result.getSeconds());
        
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45951);assertEquals(1, Seconds.ONE.minus(0).getSeconds());
        
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45952);try {
            __CLR4_4_1zbzzbzlc8azw7i.R.inc(45953);Seconds.MIN_VALUE.minus(1);
            __CLR4_4_1zbzzbzlc8azw7i.R.inc(45954);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1zbzzbzlc8azw7i.R.flushNeeded();}}

    public void testMinus_Seconds() {__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceStart(getClass().getName(),45955);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uggnfpzgj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zbzzbzlc8azw7i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testMinus_Seconds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45955,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uggnfpzgj(){try{__CLR4_4_1zbzzbzlc8azw7i.R.inc(45955);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45956);Seconds test2 = Seconds.seconds(2);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45957);Seconds test3 = Seconds.seconds(3);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45958);Seconds result = test2.minus(test3);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45959);assertEquals(2, test2.getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45960);assertEquals(3, test3.getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45961);assertEquals(-1, result.getSeconds());
        
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45962);assertEquals(1, Seconds.ONE.minus(Seconds.ZERO).getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45963);assertEquals(1, Seconds.ONE.minus((Seconds) null).getSeconds());
        
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45964);try {
            __CLR4_4_1zbzzbzlc8azw7i.R.inc(45965);Seconds.MIN_VALUE.minus(Seconds.ONE);
            __CLR4_4_1zbzzbzlc8azw7i.R.inc(45966);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1zbzzbzlc8azw7i.R.flushNeeded();}}

    public void testMultipliedBy_int() {__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceStart(getClass().getName(),45967);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1szpsdpzgv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zbzzbzlc8azw7i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testMultipliedBy_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45967,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1szpsdpzgv(){try{__CLR4_4_1zbzzbzlc8azw7i.R.inc(45967);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45968);Seconds test = Seconds.seconds(2);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45969);assertEquals(6, test.multipliedBy(3).getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45970);assertEquals(2, test.getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45971);assertEquals(-6, test.multipliedBy(-3).getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45972);assertSame(test, test.multipliedBy(1));
        
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45973);Seconds halfMax = Seconds.seconds(Integer.MAX_VALUE / 2 + 1);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45974);try {
            __CLR4_4_1zbzzbzlc8azw7i.R.inc(45975);halfMax.multipliedBy(2);
            __CLR4_4_1zbzzbzlc8azw7i.R.inc(45976);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1zbzzbzlc8azw7i.R.flushNeeded();}}

    public void testDividedBy_int() {__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceStart(getClass().getName(),45977);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q9i8qvzh5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zbzzbzlc8azw7i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testDividedBy_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45977,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q9i8qvzh5(){try{__CLR4_4_1zbzzbzlc8azw7i.R.inc(45977);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45978);Seconds test = Seconds.seconds(12);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45979);assertEquals(6, test.dividedBy(2).getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45980);assertEquals(12, test.getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45981);assertEquals(4, test.dividedBy(3).getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45982);assertEquals(3, test.dividedBy(4).getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45983);assertEquals(2, test.dividedBy(5).getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45984);assertEquals(2, test.dividedBy(6).getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45985);assertSame(test, test.dividedBy(1));
        
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45986);try {
            __CLR4_4_1zbzzbzlc8azw7i.R.inc(45987);Seconds.ONE.dividedBy(0);
            __CLR4_4_1zbzzbzlc8azw7i.R.inc(45988);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1zbzzbzlc8azw7i.R.flushNeeded();}}

    public void testNegated() {__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceStart(getClass().getName(),45989);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1av3307zhh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zbzzbzlc8azw7i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testNegated",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45989,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1av3307zhh(){try{__CLR4_4_1zbzzbzlc8azw7i.R.inc(45989);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45990);Seconds test = Seconds.seconds(12);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45991);assertEquals(-12, test.negated().getSeconds());
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45992);assertEquals(12, test.getSeconds());
        
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45993);try {
            __CLR4_4_1zbzzbzlc8azw7i.R.inc(45994);Seconds.MIN_VALUE.negated();
            __CLR4_4_1zbzzbzlc8azw7i.R.inc(45995);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1zbzzbzlc8azw7i.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testAddToLocalDate() {__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceStart(getClass().getName(),45996);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1thm5yuzho();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1zbzzbzlc8azw7i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1zbzzbzlc8azw7i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSeconds.testAddToLocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45996,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1thm5yuzho(){try{__CLR4_4_1zbzzbzlc8azw7i.R.inc(45996);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45997);Seconds test = Seconds.seconds(26);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45998);LocalDateTime date = new LocalDateTime(2006, 6, 1, 0, 0, 0, 0);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(45999);LocalDateTime expected = new LocalDateTime(2006, 6, 1, 0, 0, 26, 0);
        __CLR4_4_1zbzzbzlc8azw7i.R.inc(46000);assertEquals(expected, date.plus(test));
    }finally{__CLR4_4_1zbzzbzlc8azw7i.R.flushNeeded();}}

}
