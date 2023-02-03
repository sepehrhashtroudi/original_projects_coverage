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
 * This class is a Junit unit test for Minutes.
 *
 * @author Stephen Colebourne
 */
public class TestMinutes extends TestCase {static class __CLR4_4_1ryhryhlc8azvll{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,36449,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {try{__CLR4_4_1ryhryhlc8azvll.R.inc(36233);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36234);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1ryhryhlc8azvll.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1ryhryhlc8azvll.R.inc(36235);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36236);return new TestSuite(TestMinutes.class);
    }finally{__CLR4_4_1ryhryhlc8azvll.R.flushNeeded();}}

    public TestMinutes(String name) {
        super(name);__CLR4_4_1ryhryhlc8azvll.R.inc(36238);try{__CLR4_4_1ryhryhlc8azvll.R.inc(36237);
    }finally{__CLR4_4_1ryhryhlc8azvll.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1ryhryhlc8azvll.R.inc(36239);
    }finally{__CLR4_4_1ryhryhlc8azvll.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1ryhryhlc8azvll.R.inc(36240);
    }finally{__CLR4_4_1ryhryhlc8azvll.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testConstants() {__CLR4_4_1ryhryhlc8azvll.R.globalSliceStart(getClass().getName(),36241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15epzlwryp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ryhryhlc8azvll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ryhryhlc8azvll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testConstants",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36241,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15epzlwryp(){try{__CLR4_4_1ryhryhlc8azvll.R.inc(36241);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36242);assertEquals(0, Minutes.ZERO.getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36243);assertEquals(1, Minutes.ONE.getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36244);assertEquals(2, Minutes.TWO.getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36245);assertEquals(3, Minutes.THREE.getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36246);assertEquals(Integer.MAX_VALUE, Minutes.MAX_VALUE.getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36247);assertEquals(Integer.MIN_VALUE, Minutes.MIN_VALUE.getMinutes());
    }finally{__CLR4_4_1ryhryhlc8azvll.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactory_minutes_int() {__CLR4_4_1ryhryhlc8azvll.R.globalSliceStart(getClass().getName(),36248);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lwdd5dryw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ryhryhlc8azvll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ryhryhlc8azvll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_minutes_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36248,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lwdd5dryw(){try{__CLR4_4_1ryhryhlc8azvll.R.inc(36248);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36249);assertSame(Minutes.ZERO, Minutes.minutes(0));
        __CLR4_4_1ryhryhlc8azvll.R.inc(36250);assertSame(Minutes.ONE, Minutes.minutes(1));
        __CLR4_4_1ryhryhlc8azvll.R.inc(36251);assertSame(Minutes.TWO, Minutes.minutes(2));
        __CLR4_4_1ryhryhlc8azvll.R.inc(36252);assertSame(Minutes.THREE, Minutes.minutes(3));
        __CLR4_4_1ryhryhlc8azvll.R.inc(36253);assertSame(Minutes.MAX_VALUE, Minutes.minutes(Integer.MAX_VALUE));
        __CLR4_4_1ryhryhlc8azvll.R.inc(36254);assertSame(Minutes.MIN_VALUE, Minutes.minutes(Integer.MIN_VALUE));
        __CLR4_4_1ryhryhlc8azvll.R.inc(36255);assertEquals(-1, Minutes.minutes(-1).getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36256);assertEquals(4, Minutes.minutes(4).getMinutes());
    }finally{__CLR4_4_1ryhryhlc8azvll.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testFactory_minutesBetween_RInstant() {__CLR4_4_1ryhryhlc8azvll.R.globalSliceStart(getClass().getName(),36257);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x5b21nrz5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ryhryhlc8azvll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ryhryhlc8azvll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_minutesBetween_RInstant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36257,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x5b21nrz5(){try{__CLR4_4_1ryhryhlc8azvll.R.inc(36257);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36258);DateTime start = new DateTime(2006, 6, 9, 12, 3, 0, 0, PARIS);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36259);DateTime end1 = new DateTime(2006, 6, 9, 12, 6, 0, 0, PARIS);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36260);DateTime end2 = new DateTime(2006, 6, 9, 12, 9, 0, 0, PARIS);
        
        __CLR4_4_1ryhryhlc8azvll.R.inc(36261);assertEquals(3, Minutes.minutesBetween(start, end1).getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36262);assertEquals(0, Minutes.minutesBetween(start, start).getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36263);assertEquals(0, Minutes.minutesBetween(end1, end1).getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36264);assertEquals(-3, Minutes.minutesBetween(end1, start).getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36265);assertEquals(6, Minutes.minutesBetween(start, end2).getMinutes());
    }finally{__CLR4_4_1ryhryhlc8azvll.R.flushNeeded();}}

    public void testFactory_minutesBetween_RPartial() {__CLR4_4_1ryhryhlc8azvll.R.globalSliceStart(getClass().getName(),36266);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1go7dkrrze();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ryhryhlc8azvll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ryhryhlc8azvll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_minutesBetween_RPartial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36266,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1go7dkrrze(){try{__CLR4_4_1ryhryhlc8azvll.R.inc(36266);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36267);LocalTime start = new LocalTime(12, 3);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36268);LocalTime end1 = new LocalTime(12, 6);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36269);@SuppressWarnings("deprecation")
        TimeOfDay end2 = new TimeOfDay(12, 9);
        
        __CLR4_4_1ryhryhlc8azvll.R.inc(36270);assertEquals(3, Minutes.minutesBetween(start, end1).getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36271);assertEquals(0, Minutes.minutesBetween(start, start).getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36272);assertEquals(0, Minutes.minutesBetween(end1, end1).getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36273);assertEquals(-3, Minutes.minutesBetween(end1, start).getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36274);assertEquals(6, Minutes.minutesBetween(start, end2).getMinutes());
    }finally{__CLR4_4_1ryhryhlc8azvll.R.flushNeeded();}}

    public void testFactory_minutesIn_RInterval() {__CLR4_4_1ryhryhlc8azvll.R.globalSliceStart(getClass().getName(),36275);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cr4b8krzn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ryhryhlc8azvll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ryhryhlc8azvll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_minutesIn_RInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36275,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cr4b8krzn(){try{__CLR4_4_1ryhryhlc8azvll.R.inc(36275);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36276);DateTime start = new DateTime(2006, 6, 9, 12, 3, 0, 0, PARIS);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36277);DateTime end1 = new DateTime(2006, 6, 9, 12, 6, 0, 0, PARIS);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36278);DateTime end2 = new DateTime(2006, 6, 9, 12, 9, 0, 0, PARIS);
        
        __CLR4_4_1ryhryhlc8azvll.R.inc(36279);assertEquals(0, Minutes.minutesIn((ReadableInterval) null).getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36280);assertEquals(3, Minutes.minutesIn(new Interval(start, end1)).getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36281);assertEquals(0, Minutes.minutesIn(new Interval(start, start)).getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36282);assertEquals(0, Minutes.minutesIn(new Interval(end1, end1)).getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36283);assertEquals(6, Minutes.minutesIn(new Interval(start, end2)).getMinutes());
    }finally{__CLR4_4_1ryhryhlc8azvll.R.flushNeeded();}}

    public void testFactory_standardMinutesIn_RPeriod() {__CLR4_4_1ryhryhlc8azvll.R.globalSliceStart(getClass().getName(),36284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bkisxnrzw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ryhryhlc8azvll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ryhryhlc8azvll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_standardMinutesIn_RPeriod",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36284,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bkisxnrzw(){try{__CLR4_4_1ryhryhlc8azvll.R.inc(36284);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36285);assertEquals(0, Minutes.standardMinutesIn((ReadablePeriod) null).getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36286);assertEquals(0, Minutes.standardMinutesIn(Period.ZERO).getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36287);assertEquals(1, Minutes.standardMinutesIn(new Period(0, 0, 0, 0, 0, 1, 0, 0)).getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36288);assertEquals(123, Minutes.standardMinutesIn(Period.minutes(123)).getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36289);assertEquals(-987, Minutes.standardMinutesIn(Period.minutes(-987)).getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36290);assertEquals(1, Minutes.standardMinutesIn(Period.seconds(119)).getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36291);assertEquals(2, Minutes.standardMinutesIn(Period.seconds(120)).getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36292);assertEquals(2, Minutes.standardMinutesIn(Period.seconds(121)).getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36293);assertEquals(120, Minutes.standardMinutesIn(Period.hours(2)).getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36294);try {
            __CLR4_4_1ryhryhlc8azvll.R.inc(36295);Minutes.standardMinutesIn(Period.months(1));
            __CLR4_4_1ryhryhlc8azvll.R.inc(36296);fail();
        } catch (IllegalArgumentException ex) {
            // expeceted
        }
    }finally{__CLR4_4_1ryhryhlc8azvll.R.flushNeeded();}}

    public void testFactory_parseMinutes_String() {__CLR4_4_1ryhryhlc8azvll.R.globalSliceStart(getClass().getName(),36297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1694qhws09();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ryhryhlc8azvll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ryhryhlc8azvll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testFactory_parseMinutes_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36297,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1694qhws09(){try{__CLR4_4_1ryhryhlc8azvll.R.inc(36297);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36298);assertEquals(0, Minutes.parseMinutes((String) null).getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36299);assertEquals(0, Minutes.parseMinutes("PT0M").getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36300);assertEquals(1, Minutes.parseMinutes("PT1M").getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36301);assertEquals(-3, Minutes.parseMinutes("PT-3M").getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36302);assertEquals(2, Minutes.parseMinutes("P0Y0M0DT2M").getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36303);assertEquals(2, Minutes.parseMinutes("PT0H2M").getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36304);try {
            __CLR4_4_1ryhryhlc8azvll.R.inc(36305);Minutes.parseMinutes("P1Y1D");
            __CLR4_4_1ryhryhlc8azvll.R.inc(36306);fail();
        } catch (IllegalArgumentException ex) {
            // expeceted
        }
        __CLR4_4_1ryhryhlc8azvll.R.inc(36307);try {
            __CLR4_4_1ryhryhlc8azvll.R.inc(36308);Minutes.parseMinutes("P1DT1M");
            __CLR4_4_1ryhryhlc8azvll.R.inc(36309);fail();
        } catch (IllegalArgumentException ex) {
            // expeceted
        }
    }finally{__CLR4_4_1ryhryhlc8azvll.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testGetMethods() {__CLR4_4_1ryhryhlc8azvll.R.globalSliceStart(getClass().getName(),36310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12sjdmzs0m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ryhryhlc8azvll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ryhryhlc8azvll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testGetMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36310,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12sjdmzs0m(){try{__CLR4_4_1ryhryhlc8azvll.R.inc(36310);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36311);Minutes test = Minutes.minutes(20);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36312);assertEquals(20, test.getMinutes());
    }finally{__CLR4_4_1ryhryhlc8azvll.R.flushNeeded();}}

    public void testGetFieldType() {__CLR4_4_1ryhryhlc8azvll.R.globalSliceStart(getClass().getName(),36313);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18z86mvs0p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ryhryhlc8azvll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ryhryhlc8azvll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testGetFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36313,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18z86mvs0p(){try{__CLR4_4_1ryhryhlc8azvll.R.inc(36313);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36314);Minutes test = Minutes.minutes(20);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36315);assertEquals(DurationFieldType.minutes(), test.getFieldType());
    }finally{__CLR4_4_1ryhryhlc8azvll.R.flushNeeded();}}

    public void testGetPeriodType() {__CLR4_4_1ryhryhlc8azvll.R.globalSliceStart(getClass().getName(),36316);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ivat1is0s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ryhryhlc8azvll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ryhryhlc8azvll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testGetPeriodType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36316,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ivat1is0s(){try{__CLR4_4_1ryhryhlc8azvll.R.inc(36316);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36317);Minutes test = Minutes.minutes(20);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36318);assertEquals(PeriodType.minutes(), test.getPeriodType());
    }finally{__CLR4_4_1ryhryhlc8azvll.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testIsGreaterThan() {__CLR4_4_1ryhryhlc8azvll.R.globalSliceStart(getClass().getName(),36319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s5pnoms0v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ryhryhlc8azvll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ryhryhlc8azvll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testIsGreaterThan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36319,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s5pnoms0v(){try{__CLR4_4_1ryhryhlc8azvll.R.inc(36319);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36320);assertEquals(true, Minutes.THREE.isGreaterThan(Minutes.TWO));
        __CLR4_4_1ryhryhlc8azvll.R.inc(36321);assertEquals(false, Minutes.THREE.isGreaterThan(Minutes.THREE));
        __CLR4_4_1ryhryhlc8azvll.R.inc(36322);assertEquals(false, Minutes.TWO.isGreaterThan(Minutes.THREE));
        __CLR4_4_1ryhryhlc8azvll.R.inc(36323);assertEquals(true, Minutes.ONE.isGreaterThan(null));
        __CLR4_4_1ryhryhlc8azvll.R.inc(36324);assertEquals(false, Minutes.minutes(-1).isGreaterThan(null));
    }finally{__CLR4_4_1ryhryhlc8azvll.R.flushNeeded();}}

    public void testIsLessThan() {__CLR4_4_1ryhryhlc8azvll.R.globalSliceStart(getClass().getName(),36325);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rmk0kds11();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ryhryhlc8azvll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ryhryhlc8azvll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testIsLessThan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36325,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rmk0kds11(){try{__CLR4_4_1ryhryhlc8azvll.R.inc(36325);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36326);assertEquals(false, Minutes.THREE.isLessThan(Minutes.TWO));
        __CLR4_4_1ryhryhlc8azvll.R.inc(36327);assertEquals(false, Minutes.THREE.isLessThan(Minutes.THREE));
        __CLR4_4_1ryhryhlc8azvll.R.inc(36328);assertEquals(true, Minutes.TWO.isLessThan(Minutes.THREE));
        __CLR4_4_1ryhryhlc8azvll.R.inc(36329);assertEquals(false, Minutes.ONE.isLessThan(null));
        __CLR4_4_1ryhryhlc8azvll.R.inc(36330);assertEquals(true, Minutes.minutes(-1).isLessThan(null));
    }finally{__CLR4_4_1ryhryhlc8azvll.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToString() {__CLR4_4_1ryhryhlc8azvll.R.globalSliceStart(getClass().getName(),36331);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdids17();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ryhryhlc8azvll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ryhryhlc8azvll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36331,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdids17(){try{__CLR4_4_1ryhryhlc8azvll.R.inc(36331);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36332);Minutes test = Minutes.minutes(20);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36333);assertEquals("PT20M", test.toString());
        
        __CLR4_4_1ryhryhlc8azvll.R.inc(36334);test = Minutes.minutes(-20);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36335);assertEquals("PT-20M", test.toString());
    }finally{__CLR4_4_1ryhryhlc8azvll.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSerialization() throws Exception {__CLR4_4_1ryhryhlc8azvll.R.globalSliceStart(getClass().getName(),36336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on9s1c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ryhryhlc8azvll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ryhryhlc8azvll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36336,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on9s1c() throws Exception{try{__CLR4_4_1ryhryhlc8azvll.R.inc(36336);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36337);Minutes test = Minutes.THREE;
        
        __CLR4_4_1ryhryhlc8azvll.R.inc(36338);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1ryhryhlc8azvll.R.inc(36339);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36340);oos.writeObject(test);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36341);byte[] bytes = baos.toByteArray();
        __CLR4_4_1ryhryhlc8azvll.R.inc(36342);oos.close();
        
        __CLR4_4_1ryhryhlc8azvll.R.inc(36343);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36344);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36345);Minutes result = (Minutes) ois.readObject();
        __CLR4_4_1ryhryhlc8azvll.R.inc(36346);ois.close();
        
        __CLR4_4_1ryhryhlc8azvll.R.inc(36347);assertSame(test, result);
    }finally{__CLR4_4_1ryhryhlc8azvll.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testToStandardWeeks() {__CLR4_4_1ryhryhlc8azvll.R.globalSliceStart(getClass().getName(),36348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pfkyx0s1o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ryhryhlc8azvll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ryhryhlc8azvll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testToStandardWeeks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36348,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pfkyx0s1o(){try{__CLR4_4_1ryhryhlc8azvll.R.inc(36348);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36349);Minutes test = Minutes.minutes(60 * 24 * 7 * 2);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36350);Weeks expected = Weeks.weeks(2);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36351);assertEquals(expected, test.toStandardWeeks());
    }finally{__CLR4_4_1ryhryhlc8azvll.R.flushNeeded();}}

    public void testToStandardDays() {__CLR4_4_1ryhryhlc8azvll.R.globalSliceStart(getClass().getName(),36352);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eftdm0s1s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ryhryhlc8azvll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ryhryhlc8azvll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testToStandardDays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36352,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eftdm0s1s(){try{__CLR4_4_1ryhryhlc8azvll.R.inc(36352);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36353);Minutes test = Minutes.minutes(60 * 24 * 2);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36354);Days expected = Days.days(2);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36355);assertEquals(expected, test.toStandardDays());
    }finally{__CLR4_4_1ryhryhlc8azvll.R.flushNeeded();}}

    public void testToStandardHours() {__CLR4_4_1ryhryhlc8azvll.R.globalSliceStart(getClass().getName(),36356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ikk7gs1w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ryhryhlc8azvll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ryhryhlc8azvll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testToStandardHours",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36356,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ikk7gs1w(){try{__CLR4_4_1ryhryhlc8azvll.R.inc(36356);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36357);Minutes test = Minutes.minutes(3 * 60);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36358);Hours expected = Hours.hours(3);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36359);assertEquals(expected, test.toStandardHours());
    }finally{__CLR4_4_1ryhryhlc8azvll.R.flushNeeded();}}

    public void testToStandardSeconds() {__CLR4_4_1ryhryhlc8azvll.R.globalSliceStart(getClass().getName(),36360);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1emeoqss20();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ryhryhlc8azvll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ryhryhlc8azvll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testToStandardSeconds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36360,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1emeoqss20(){try{__CLR4_4_1ryhryhlc8azvll.R.inc(36360);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36361);Minutes test = Minutes.minutes(3);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36362);Seconds expected = Seconds.seconds(3 * 60);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36363);assertEquals(expected, test.toStandardSeconds());
        
        __CLR4_4_1ryhryhlc8azvll.R.inc(36364);try {
            __CLR4_4_1ryhryhlc8azvll.R.inc(36365);Minutes.MAX_VALUE.toStandardSeconds();
            __CLR4_4_1ryhryhlc8azvll.R.inc(36366);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1ryhryhlc8azvll.R.flushNeeded();}}

    public void testToStandardDuration() {__CLR4_4_1ryhryhlc8azvll.R.globalSliceStart(getClass().getName(),36367);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1izmvnps27();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ryhryhlc8azvll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ryhryhlc8azvll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testToStandardDuration",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36367,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1izmvnps27(){try{__CLR4_4_1ryhryhlc8azvll.R.inc(36367);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36368);Minutes test = Minutes.minutes(20);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36369);Duration expected = new Duration(20L * DateTimeConstants.MILLIS_PER_MINUTE);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36370);assertEquals(expected, test.toStandardDuration());
        
        __CLR4_4_1ryhryhlc8azvll.R.inc(36371);expected = new Duration(((long) Integer.MAX_VALUE) * DateTimeConstants.MILLIS_PER_MINUTE);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36372);assertEquals(expected, Minutes.MAX_VALUE.toStandardDuration());
    }finally{__CLR4_4_1ryhryhlc8azvll.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testPlus_int() {__CLR4_4_1ryhryhlc8azvll.R.globalSliceStart(getClass().getName(),36373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1scc4ebs2d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ryhryhlc8azvll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ryhryhlc8azvll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testPlus_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36373,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1scc4ebs2d(){try{__CLR4_4_1ryhryhlc8azvll.R.inc(36373);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36374);Minutes test2 = Minutes.minutes(2);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36375);Minutes result = test2.plus(3);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36376);assertEquals(2, test2.getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36377);assertEquals(5, result.getMinutes());
        
        __CLR4_4_1ryhryhlc8azvll.R.inc(36378);assertEquals(1, Minutes.ONE.plus(0).getMinutes());
        
        __CLR4_4_1ryhryhlc8azvll.R.inc(36379);try {
            __CLR4_4_1ryhryhlc8azvll.R.inc(36380);Minutes.MAX_VALUE.plus(1);
            __CLR4_4_1ryhryhlc8azvll.R.inc(36381);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1ryhryhlc8azvll.R.flushNeeded();}}

    public void testPlus_Minutes() {__CLR4_4_1ryhryhlc8azvll.R.globalSliceStart(getClass().getName(),36382);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12jc7zhs2m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ryhryhlc8azvll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ryhryhlc8azvll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testPlus_Minutes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36382,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12jc7zhs2m(){try{__CLR4_4_1ryhryhlc8azvll.R.inc(36382);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36383);Minutes test2 = Minutes.minutes(2);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36384);Minutes test3 = Minutes.minutes(3);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36385);Minutes result = test2.plus(test3);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36386);assertEquals(2, test2.getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36387);assertEquals(3, test3.getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36388);assertEquals(5, result.getMinutes());
        
        __CLR4_4_1ryhryhlc8azvll.R.inc(36389);assertEquals(1, Minutes.ONE.plus(Minutes.ZERO).getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36390);assertEquals(1, Minutes.ONE.plus((Minutes) null).getMinutes());
        
        __CLR4_4_1ryhryhlc8azvll.R.inc(36391);try {
            __CLR4_4_1ryhryhlc8azvll.R.inc(36392);Minutes.MAX_VALUE.plus(Minutes.ONE);
            __CLR4_4_1ryhryhlc8azvll.R.inc(36393);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1ryhryhlc8azvll.R.flushNeeded();}}

    public void testMinus_int() {__CLR4_4_1ryhryhlc8azvll.R.globalSliceStart(getClass().getName(),36394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_118wkvps2y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ryhryhlc8azvll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ryhryhlc8azvll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testMinus_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36394,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_118wkvps2y(){try{__CLR4_4_1ryhryhlc8azvll.R.inc(36394);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36395);Minutes test2 = Minutes.minutes(2);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36396);Minutes result = test2.minus(3);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36397);assertEquals(2, test2.getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36398);assertEquals(-1, result.getMinutes());
        
        __CLR4_4_1ryhryhlc8azvll.R.inc(36399);assertEquals(1, Minutes.ONE.minus(0).getMinutes());
        
        __CLR4_4_1ryhryhlc8azvll.R.inc(36400);try {
            __CLR4_4_1ryhryhlc8azvll.R.inc(36401);Minutes.MIN_VALUE.minus(1);
            __CLR4_4_1ryhryhlc8azvll.R.inc(36402);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1ryhryhlc8azvll.R.flushNeeded();}}

    public void testMinus_Minutes() {__CLR4_4_1ryhryhlc8azvll.R.globalSliceStart(getClass().getName(),36403);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i2aj2ds37();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ryhryhlc8azvll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ryhryhlc8azvll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testMinus_Minutes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36403,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i2aj2ds37(){try{__CLR4_4_1ryhryhlc8azvll.R.inc(36403);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36404);Minutes test2 = Minutes.minutes(2);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36405);Minutes test3 = Minutes.minutes(3);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36406);Minutes result = test2.minus(test3);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36407);assertEquals(2, test2.getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36408);assertEquals(3, test3.getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36409);assertEquals(-1, result.getMinutes());
        
        __CLR4_4_1ryhryhlc8azvll.R.inc(36410);assertEquals(1, Minutes.ONE.minus(Minutes.ZERO).getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36411);assertEquals(1, Minutes.ONE.minus((Minutes) null).getMinutes());
        
        __CLR4_4_1ryhryhlc8azvll.R.inc(36412);try {
            __CLR4_4_1ryhryhlc8azvll.R.inc(36413);Minutes.MIN_VALUE.minus(Minutes.ONE);
            __CLR4_4_1ryhryhlc8azvll.R.inc(36414);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1ryhryhlc8azvll.R.flushNeeded();}}

    public void testMultipliedBy_int() {__CLR4_4_1ryhryhlc8azvll.R.globalSliceStart(getClass().getName(),36415);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1szpsdps3j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ryhryhlc8azvll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ryhryhlc8azvll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testMultipliedBy_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36415,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1szpsdps3j(){try{__CLR4_4_1ryhryhlc8azvll.R.inc(36415);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36416);Minutes test = Minutes.minutes(2);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36417);assertEquals(6, test.multipliedBy(3).getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36418);assertEquals(2, test.getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36419);assertEquals(-6, test.multipliedBy(-3).getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36420);assertSame(test, test.multipliedBy(1));
        
        __CLR4_4_1ryhryhlc8azvll.R.inc(36421);Minutes halfMax = Minutes.minutes(Integer.MAX_VALUE / 2 + 1);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36422);try {
            __CLR4_4_1ryhryhlc8azvll.R.inc(36423);halfMax.multipliedBy(2);
            __CLR4_4_1ryhryhlc8azvll.R.inc(36424);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1ryhryhlc8azvll.R.flushNeeded();}}

    public void testDividedBy_int() {__CLR4_4_1ryhryhlc8azvll.R.globalSliceStart(getClass().getName(),36425);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q9i8qvs3t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ryhryhlc8azvll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ryhryhlc8azvll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testDividedBy_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36425,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q9i8qvs3t(){try{__CLR4_4_1ryhryhlc8azvll.R.inc(36425);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36426);Minutes test = Minutes.minutes(12);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36427);assertEquals(6, test.dividedBy(2).getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36428);assertEquals(12, test.getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36429);assertEquals(4, test.dividedBy(3).getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36430);assertEquals(3, test.dividedBy(4).getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36431);assertEquals(2, test.dividedBy(5).getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36432);assertEquals(2, test.dividedBy(6).getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36433);assertSame(test, test.dividedBy(1));
        
        __CLR4_4_1ryhryhlc8azvll.R.inc(36434);try {
            __CLR4_4_1ryhryhlc8azvll.R.inc(36435);Minutes.ONE.dividedBy(0);
            __CLR4_4_1ryhryhlc8azvll.R.inc(36436);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1ryhryhlc8azvll.R.flushNeeded();}}

    public void testNegated() {__CLR4_4_1ryhryhlc8azvll.R.globalSliceStart(getClass().getName(),36437);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1av3307s45();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ryhryhlc8azvll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ryhryhlc8azvll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testNegated",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36437,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1av3307s45(){try{__CLR4_4_1ryhryhlc8azvll.R.inc(36437);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36438);Minutes test = Minutes.minutes(12);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36439);assertEquals(-12, test.negated().getMinutes());
        __CLR4_4_1ryhryhlc8azvll.R.inc(36440);assertEquals(12, test.getMinutes());
        
        __CLR4_4_1ryhryhlc8azvll.R.inc(36441);try {
            __CLR4_4_1ryhryhlc8azvll.R.inc(36442);Minutes.MIN_VALUE.negated();
            __CLR4_4_1ryhryhlc8azvll.R.inc(36443);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1ryhryhlc8azvll.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testAddToLocalDate() {__CLR4_4_1ryhryhlc8azvll.R.globalSliceStart(getClass().getName(),36444);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1thm5yus4c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ryhryhlc8azvll.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ryhryhlc8azvll.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinutes.testAddToLocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36444,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1thm5yus4c(){try{__CLR4_4_1ryhryhlc8azvll.R.inc(36444);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36445);Minutes test = Minutes.minutes(26);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36446);LocalDateTime date = new LocalDateTime(2006, 6, 1, 0, 0, 0, 0);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36447);LocalDateTime expected = new LocalDateTime(2006, 6, 1, 0, 26, 0, 0);
        __CLR4_4_1ryhryhlc8azvll.R.inc(36448);assertEquals(expected, date.plus(test));
    }finally{__CLR4_4_1ryhryhlc8azvll.R.flushNeeded();}}

}
