/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.math3.stat;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test cases for the {@link Frequency} class.
 *
 * @version $Id$
 */

public final class FrequencyTest {static class __CLR4_4_129al29allb90pej8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,105639,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final long ONE_LONG = 1L;
    private static final long TWO_LONG = 2L;
    private static final long THREE_LONG = 3L;
    private static final int ONE = 1;
    private static final int TWO = 2;
    private static final int THREEE = 3 ;
    private static final double TOLERANCE = 10E-15d;

    private Frequency f = null;

    @Before
    public void setUp() {try{__CLR4_4_129al29allb90pej8.R.inc(105357);
        __CLR4_4_129al29allb90pej8.R.inc(105358);f = new Frequency();
    }finally{__CLR4_4_129al29allb90pej8.R.flushNeeded();}}

    /** test freq counts */
    @Test
    public void testCounts() {__CLR4_4_129al29allb90pej8.R.globalSliceStart(getClass().getName(),105359);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11x6ayl29an();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129al29allb90pej8.R.rethrow($CLV_t2$);}finally{__CLR4_4_129al29allb90pej8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.FrequencyTest.testCounts",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105359,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11x6ayl29an(){try{__CLR4_4_129al29allb90pej8.R.inc(105359);
        __CLR4_4_129al29allb90pej8.R.inc(105360);Assert.assertEquals("total count",0,f.getSumFreq());
        __CLR4_4_129al29allb90pej8.R.inc(105361);f.addValue(ONE_LONG);
        __CLR4_4_129al29allb90pej8.R.inc(105362);f.addValue(TWO_LONG);
        __CLR4_4_129al29allb90pej8.R.inc(105363);f.addValue(1);
        __CLR4_4_129al29allb90pej8.R.inc(105364);f.addValue(ONE);
        __CLR4_4_129al29allb90pej8.R.inc(105365);Assert.assertEquals("one frequency count",3,f.getCount(1));
        __CLR4_4_129al29allb90pej8.R.inc(105366);Assert.assertEquals("two frequency count",1,f.getCount(2));
        __CLR4_4_129al29allb90pej8.R.inc(105367);Assert.assertEquals("three frequency count",0,f.getCount(3));
        __CLR4_4_129al29allb90pej8.R.inc(105368);Assert.assertEquals("total count",4,f.getSumFreq());
        __CLR4_4_129al29allb90pej8.R.inc(105369);Assert.assertEquals("zero cumulative frequency", 0, f.getCumFreq(0));
        __CLR4_4_129al29allb90pej8.R.inc(105370);Assert.assertEquals("one cumulative frequency", 3,  f.getCumFreq(1));
        __CLR4_4_129al29allb90pej8.R.inc(105371);Assert.assertEquals("two cumulative frequency", 4,  f.getCumFreq(2));
        __CLR4_4_129al29allb90pej8.R.inc(105372);Assert.assertEquals("Integer argument cum freq",4, f.getCumFreq(Integer.valueOf(2)));
        __CLR4_4_129al29allb90pej8.R.inc(105373);Assert.assertEquals("five cumulative frequency", 4,  f.getCumFreq(5));
        __CLR4_4_129al29allb90pej8.R.inc(105374);Assert.assertEquals("foo cumulative frequency", 0,  f.getCumFreq("foo"));

        __CLR4_4_129al29allb90pej8.R.inc(105375);f.clear();
        __CLR4_4_129al29allb90pej8.R.inc(105376);Assert.assertEquals("total count",0,f.getSumFreq());

        // userguide examples -------------------------------------------------------------------
        __CLR4_4_129al29allb90pej8.R.inc(105377);f.addValue("one");
        __CLR4_4_129al29allb90pej8.R.inc(105378);f.addValue("One");
        __CLR4_4_129al29allb90pej8.R.inc(105379);f.addValue("oNe");
        __CLR4_4_129al29allb90pej8.R.inc(105380);f.addValue("Z");
        __CLR4_4_129al29allb90pej8.R.inc(105381);Assert.assertEquals("one cumulative frequency", 1 ,  f.getCount("one"));
        __CLR4_4_129al29allb90pej8.R.inc(105382);Assert.assertEquals("Z cumulative pct", 0.5,  f.getCumPct("Z"), TOLERANCE);
        __CLR4_4_129al29allb90pej8.R.inc(105383);Assert.assertEquals("z cumulative pct", 1.0,  f.getCumPct("z"), TOLERANCE);
        __CLR4_4_129al29allb90pej8.R.inc(105384);Assert.assertEquals("Ot cumulative pct", 0.25,  f.getCumPct("Ot"), TOLERANCE);
        __CLR4_4_129al29allb90pej8.R.inc(105385);f.clear();

        __CLR4_4_129al29allb90pej8.R.inc(105386);f = null;
        __CLR4_4_129al29allb90pej8.R.inc(105387);Frequency f = new Frequency();
        __CLR4_4_129al29allb90pej8.R.inc(105388);f.addValue(1);
        __CLR4_4_129al29allb90pej8.R.inc(105389);f.addValue(Integer.valueOf(1));
        __CLR4_4_129al29allb90pej8.R.inc(105390);f.addValue(Long.valueOf(1));
        __CLR4_4_129al29allb90pej8.R.inc(105391);f.addValue(2);
        __CLR4_4_129al29allb90pej8.R.inc(105392);f.addValue(Integer.valueOf(-1));
        __CLR4_4_129al29allb90pej8.R.inc(105393);Assert.assertEquals("1 count", 3, f.getCount(1));
        __CLR4_4_129al29allb90pej8.R.inc(105394);Assert.assertEquals("1 count", 3, f.getCount(Integer.valueOf(1)));
        __CLR4_4_129al29allb90pej8.R.inc(105395);Assert.assertEquals("0 cum pct", 0.2, f.getCumPct(0), TOLERANCE);
        __CLR4_4_129al29allb90pej8.R.inc(105396);Assert.assertEquals("1 pct", 0.6, f.getPct(Integer.valueOf(1)), TOLERANCE);
        __CLR4_4_129al29allb90pej8.R.inc(105397);Assert.assertEquals("-2 cum pct", 0, f.getCumPct(-2), TOLERANCE);
        __CLR4_4_129al29allb90pej8.R.inc(105398);Assert.assertEquals("10 cum pct", 1, f.getCumPct(10), TOLERANCE);

        __CLR4_4_129al29allb90pej8.R.inc(105399);f = null;
        __CLR4_4_129al29allb90pej8.R.inc(105400);f = new Frequency(String.CASE_INSENSITIVE_ORDER);
        __CLR4_4_129al29allb90pej8.R.inc(105401);f.addValue("one");
        __CLR4_4_129al29allb90pej8.R.inc(105402);f.addValue("One");
        __CLR4_4_129al29allb90pej8.R.inc(105403);f.addValue("oNe");
        __CLR4_4_129al29allb90pej8.R.inc(105404);f.addValue("Z");
        __CLR4_4_129al29allb90pej8.R.inc(105405);Assert.assertEquals("one count", 3 ,  f.getCount("one"));
        __CLR4_4_129al29allb90pej8.R.inc(105406);Assert.assertEquals("Z cumulative pct -- case insensitive", 1 ,  f.getCumPct("Z"), TOLERANCE);
        __CLR4_4_129al29allb90pej8.R.inc(105407);Assert.assertEquals("z cumulative pct -- case insensitive", 1 ,  f.getCumPct("z"), TOLERANCE);

        __CLR4_4_129al29allb90pej8.R.inc(105408);f = null;
        __CLR4_4_129al29allb90pej8.R.inc(105409);f = new Frequency();
        __CLR4_4_129al29allb90pej8.R.inc(105410);Assert.assertEquals(0L, f.getCount('a'));
        __CLR4_4_129al29allb90pej8.R.inc(105411);Assert.assertEquals(0L, f.getCumFreq('b'));
        __CLR4_4_129al29allb90pej8.R.inc(105412);TestUtils.assertEquals(Double.NaN, f.getPct('a'), 0.0);
        __CLR4_4_129al29allb90pej8.R.inc(105413);TestUtils.assertEquals(Double.NaN, f.getCumPct('b'), 0.0);
        __CLR4_4_129al29allb90pej8.R.inc(105414);f.addValue('a');
        __CLR4_4_129al29allb90pej8.R.inc(105415);f.addValue('b');
        __CLR4_4_129al29allb90pej8.R.inc(105416);f.addValue('c');
        __CLR4_4_129al29allb90pej8.R.inc(105417);f.addValue('d');
        __CLR4_4_129al29allb90pej8.R.inc(105418);Assert.assertEquals(1L, f.getCount('a'));
        __CLR4_4_129al29allb90pej8.R.inc(105419);Assert.assertEquals(2L, f.getCumFreq('b'));
        __CLR4_4_129al29allb90pej8.R.inc(105420);Assert.assertEquals(0.25, f.getPct('a'), 0.0);
        __CLR4_4_129al29allb90pej8.R.inc(105421);Assert.assertEquals(0.5, f.getCumPct('b'), 0.0);
        __CLR4_4_129al29allb90pej8.R.inc(105422);Assert.assertEquals(1.0, f.getCumPct('e'), 0.0);
    }finally{__CLR4_4_129al29allb90pej8.R.flushNeeded();}}

    /** test pcts */
    @Test
    public void testPcts() {__CLR4_4_129al29allb90pej8.R.globalSliceStart(getClass().getName(),105423);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fg1gdn29cf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129al29allb90pej8.R.rethrow($CLV_t2$);}finally{__CLR4_4_129al29allb90pej8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.FrequencyTest.testPcts",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105423,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fg1gdn29cf(){try{__CLR4_4_129al29allb90pej8.R.inc(105423);
        __CLR4_4_129al29allb90pej8.R.inc(105424);f.addValue(ONE_LONG);
        __CLR4_4_129al29allb90pej8.R.inc(105425);f.addValue(TWO_LONG);
        __CLR4_4_129al29allb90pej8.R.inc(105426);f.addValue(ONE);
        __CLR4_4_129al29allb90pej8.R.inc(105427);f.addValue(TWO);
        __CLR4_4_129al29allb90pej8.R.inc(105428);f.addValue(THREE_LONG);
        __CLR4_4_129al29allb90pej8.R.inc(105429);f.addValue(THREE_LONG);
        __CLR4_4_129al29allb90pej8.R.inc(105430);f.addValue(3);
        __CLR4_4_129al29allb90pej8.R.inc(105431);f.addValue(THREEE);
        __CLR4_4_129al29allb90pej8.R.inc(105432);Assert.assertEquals("one pct",0.25,f.getPct(1),TOLERANCE);
        __CLR4_4_129al29allb90pej8.R.inc(105433);Assert.assertEquals("two pct",0.25,f.getPct(Long.valueOf(2)),TOLERANCE);
        __CLR4_4_129al29allb90pej8.R.inc(105434);Assert.assertEquals("three pct",0.5,f.getPct(THREE_LONG),TOLERANCE);
        __CLR4_4_129al29allb90pej8.R.inc(105435);Assert.assertEquals("five pct",0,f.getPct(5),TOLERANCE);
        __CLR4_4_129al29allb90pej8.R.inc(105436);Assert.assertEquals("foo pct",0,f.getPct("foo"),TOLERANCE);
        __CLR4_4_129al29allb90pej8.R.inc(105437);Assert.assertEquals("one cum pct",0.25,f.getCumPct(1),TOLERANCE);
        __CLR4_4_129al29allb90pej8.R.inc(105438);Assert.assertEquals("two cum pct",0.50,f.getCumPct(Long.valueOf(2)),TOLERANCE);
        __CLR4_4_129al29allb90pej8.R.inc(105439);Assert.assertEquals("Integer argument",0.50,f.getCumPct(Integer.valueOf(2)),TOLERANCE);
        __CLR4_4_129al29allb90pej8.R.inc(105440);Assert.assertEquals("three cum pct",1.0,f.getCumPct(THREE_LONG),TOLERANCE);
        __CLR4_4_129al29allb90pej8.R.inc(105441);Assert.assertEquals("five cum pct",1.0,f.getCumPct(5),TOLERANCE);
        __CLR4_4_129al29allb90pej8.R.inc(105442);Assert.assertEquals("zero cum pct",0.0,f.getCumPct(0),TOLERANCE);
        __CLR4_4_129al29allb90pej8.R.inc(105443);Assert.assertEquals("foo cum pct",0,f.getCumPct("foo"),TOLERANCE);
    }finally{__CLR4_4_129al29allb90pej8.R.flushNeeded();}}

    /** test adding incomparable values */
    @Test
    public void testAdd() {__CLR4_4_129al29allb90pej8.R.globalSliceStart(getClass().getName(),105444);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vtx82e29d0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129al29allb90pej8.R.rethrow($CLV_t2$);}finally{__CLR4_4_129al29allb90pej8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.FrequencyTest.testAdd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105444,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vtx82e29d0(){try{__CLR4_4_129al29allb90pej8.R.inc(105444);
        __CLR4_4_129al29allb90pej8.R.inc(105445);char aChar = 'a';
        __CLR4_4_129al29allb90pej8.R.inc(105446);char bChar = 'b';
        __CLR4_4_129al29allb90pej8.R.inc(105447);String aString = "a";
        __CLR4_4_129al29allb90pej8.R.inc(105448);f.addValue(aChar);
        __CLR4_4_129al29allb90pej8.R.inc(105449);f.addValue(bChar);
        __CLR4_4_129al29allb90pej8.R.inc(105450);try {
            __CLR4_4_129al29allb90pej8.R.inc(105451);f.addValue(aString);
            __CLR4_4_129al29allb90pej8.R.inc(105452);Assert.fail("Expecting IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_129al29allb90pej8.R.inc(105453);try {
            __CLR4_4_129al29allb90pej8.R.inc(105454);f.addValue(2);
            __CLR4_4_129al29allb90pej8.R.inc(105455);Assert.fail("Expecting IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_129al29allb90pej8.R.inc(105456);Assert.assertEquals("a pct",0.5,f.getPct(aChar),TOLERANCE);
        __CLR4_4_129al29allb90pej8.R.inc(105457);Assert.assertEquals("b cum pct",1.0,f.getCumPct(bChar),TOLERANCE);
        __CLR4_4_129al29allb90pej8.R.inc(105458);Assert.assertEquals("a string pct",0.0,f.getPct(aString),TOLERANCE);
        __CLR4_4_129al29allb90pej8.R.inc(105459);Assert.assertEquals("a string cum pct",0.0,f.getCumPct(aString),TOLERANCE);

        __CLR4_4_129al29allb90pej8.R.inc(105460);f = new Frequency();
        __CLR4_4_129al29allb90pej8.R.inc(105461);f.addValue("One");
        __CLR4_4_129al29allb90pej8.R.inc(105462);try {
            __CLR4_4_129al29allb90pej8.R.inc(105463);f.addValue(new Integer("One"));
            __CLR4_4_129al29allb90pej8.R.inc(105464);Assert.fail("Expecting IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_129al29allb90pej8.R.flushNeeded();}}

    /** test empty table */
    @Test
    public void testEmptyTable() {__CLR4_4_129al29allb90pej8.R.globalSliceStart(getClass().getName(),105465);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1avi1zu29dl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129al29allb90pej8.R.rethrow($CLV_t2$);}finally{__CLR4_4_129al29allb90pej8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.FrequencyTest.testEmptyTable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105465,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1avi1zu29dl(){try{__CLR4_4_129al29allb90pej8.R.inc(105465);
        __CLR4_4_129al29allb90pej8.R.inc(105466);Assert.assertEquals("freq sum, empty table", 0, f.getSumFreq());
        __CLR4_4_129al29allb90pej8.R.inc(105467);Assert.assertEquals("count, empty table", 0, f.getCount(0));
        __CLR4_4_129al29allb90pej8.R.inc(105468);Assert.assertEquals("count, empty table",0, f.getCount(Integer.valueOf(0)));
        __CLR4_4_129al29allb90pej8.R.inc(105469);Assert.assertEquals("cum freq, empty table", 0, f.getCumFreq(0));
        __CLR4_4_129al29allb90pej8.R.inc(105470);Assert.assertEquals("cum freq, empty table", 0, f.getCumFreq("x"));
        __CLR4_4_129al29allb90pej8.R.inc(105471);Assert.assertTrue("pct, empty table", Double.isNaN(f.getPct(0)));
        __CLR4_4_129al29allb90pej8.R.inc(105472);Assert.assertTrue("pct, empty table", Double.isNaN(f.getPct(Integer.valueOf(0))));
        __CLR4_4_129al29allb90pej8.R.inc(105473);Assert.assertTrue("cum pct, empty table", Double.isNaN(f.getCumPct(0)));
        __CLR4_4_129al29allb90pej8.R.inc(105474);Assert.assertTrue("cum pct, empty table", Double.isNaN(f.getCumPct(Integer.valueOf(0))));
    }finally{__CLR4_4_129al29allb90pej8.R.flushNeeded();}}

    @Test
    public void testNonComparableCumPct() {__CLR4_4_129al29allb90pej8.R.globalSliceStart(getClass().getName(),105475);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fp2k1q29dv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129al29allb90pej8.R.rethrow($CLV_t2$);}finally{__CLR4_4_129al29allb90pej8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.FrequencyTest.testNonComparableCumPct",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105475,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fp2k1q29dv(){try{__CLR4_4_129al29allb90pej8.R.inc(105475);
        __CLR4_4_129al29allb90pej8.R.inc(105476);f.addValue("a");
        __CLR4_4_129al29allb90pej8.R.inc(105477);Assert.assertEquals("cum freq, single entry", 1.0d, f.getCumPct("a"),TOLERANCE);
        __CLR4_4_129al29allb90pej8.R.inc(105478);Assert.assertEquals("cum freq, single entry non comparable", 0.0d, f.getCumPct(100),TOLERANCE);
    }finally{__CLR4_4_129al29allb90pej8.R.flushNeeded();}}

    @Test
    public void testNonComparablePct() {__CLR4_4_129al29allb90pej8.R.globalSliceStart(getClass().getName(),105479);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b5k2i529dz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129al29allb90pej8.R.rethrow($CLV_t2$);}finally{__CLR4_4_129al29allb90pej8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.FrequencyTest.testNonComparablePct",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105479,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b5k2i529dz(){try{__CLR4_4_129al29allb90pej8.R.inc(105479);
        __CLR4_4_129al29allb90pej8.R.inc(105480);f.addValue("a");
        __CLR4_4_129al29allb90pej8.R.inc(105481);Assert.assertEquals("cum freq, single entry", 1.0d, f.getPct("a"),TOLERANCE);
        __CLR4_4_129al29allb90pej8.R.inc(105482);Assert.assertEquals("cum freq, single entry non comparable", 0.0d, f.getPct(100),TOLERANCE);
    }finally{__CLR4_4_129al29allb90pej8.R.flushNeeded();}}

    /**
     * Tests toString()
     */
    @Test
    public void testToString() throws Exception {__CLR4_4_129al29allb90pej8.R.globalSliceStart(getClass().getName(),105483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid29e3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129al29allb90pej8.R.rethrow($CLV_t2$);}finally{__CLR4_4_129al29allb90pej8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.FrequencyTest.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105483,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid29e3() throws Exception{try{__CLR4_4_129al29allb90pej8.R.inc(105483);
        __CLR4_4_129al29allb90pej8.R.inc(105484);f.addValue(ONE_LONG);
        __CLR4_4_129al29allb90pej8.R.inc(105485);f.addValue(TWO_LONG);
        __CLR4_4_129al29allb90pej8.R.inc(105486);f.addValue(ONE);
        __CLR4_4_129al29allb90pej8.R.inc(105487);f.addValue(TWO);

        __CLR4_4_129al29allb90pej8.R.inc(105488);String s = f.toString();
        //System.out.println(s);
        __CLR4_4_129al29allb90pej8.R.inc(105489);Assert.assertNotNull(s);
        __CLR4_4_129al29allb90pej8.R.inc(105490);BufferedReader reader = new BufferedReader(new StringReader(s));
        __CLR4_4_129al29allb90pej8.R.inc(105491);String line = reader.readLine(); // header line
        __CLR4_4_129al29allb90pej8.R.inc(105492);Assert.assertNotNull(line);

        __CLR4_4_129al29allb90pej8.R.inc(105493);line = reader.readLine(); // one's or two's line
        __CLR4_4_129al29allb90pej8.R.inc(105494);Assert.assertNotNull(line);

        __CLR4_4_129al29allb90pej8.R.inc(105495);line = reader.readLine(); // one's or two's line
        __CLR4_4_129al29allb90pej8.R.inc(105496);Assert.assertNotNull(line);

        __CLR4_4_129al29allb90pej8.R.inc(105497);line = reader.readLine(); // no more elements
        __CLR4_4_129al29allb90pej8.R.inc(105498);Assert.assertNull(line);
    }finally{__CLR4_4_129al29allb90pej8.R.flushNeeded();}}

    @Test
    public void testIntegerValues() {__CLR4_4_129al29allb90pej8.R.globalSliceStart(getClass().getName(),105499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hobx7v29ej();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129al29allb90pej8.R.rethrow($CLV_t2$);}finally{__CLR4_4_129al29allb90pej8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.FrequencyTest.testIntegerValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105499,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hobx7v29ej(){try{__CLR4_4_129al29allb90pej8.R.inc(105499);
        __CLR4_4_129al29allb90pej8.R.inc(105500);Comparable<?> obj1 = null;
        __CLR4_4_129al29allb90pej8.R.inc(105501);obj1 = Integer.valueOf(1);
        __CLR4_4_129al29allb90pej8.R.inc(105502);Integer int1 = Integer.valueOf(1);
        __CLR4_4_129al29allb90pej8.R.inc(105503);f.addValue(obj1);
        __CLR4_4_129al29allb90pej8.R.inc(105504);f.addValue(int1);
        __CLR4_4_129al29allb90pej8.R.inc(105505);f.addValue(2);
        __CLR4_4_129al29allb90pej8.R.inc(105506);f.addValue(Long.valueOf(2));
        __CLR4_4_129al29allb90pej8.R.inc(105507);Assert.assertEquals("Integer 1 count", 2, f.getCount(1));
        __CLR4_4_129al29allb90pej8.R.inc(105508);Assert.assertEquals("Integer 1 count", 2, f.getCount(Integer.valueOf(1)));
        __CLR4_4_129al29allb90pej8.R.inc(105509);Assert.assertEquals("Integer 1 count", 2, f.getCount(Long.valueOf(1)));
        __CLR4_4_129al29allb90pej8.R.inc(105510);Assert.assertEquals("Integer 1 cumPct", 0.5, f.getCumPct(1), TOLERANCE);
        __CLR4_4_129al29allb90pej8.R.inc(105511);Assert.assertEquals("Integer 1 cumPct", 0.5, f.getCumPct(Long.valueOf(1)), TOLERANCE);
        __CLR4_4_129al29allb90pej8.R.inc(105512);Assert.assertEquals("Integer 1 cumPct", 0.5, f.getCumPct(Integer.valueOf(1)), TOLERANCE);
        __CLR4_4_129al29allb90pej8.R.inc(105513);Iterator<?> it = f.valuesIterator();
        __CLR4_4_129al29allb90pej8.R.inc(105514);while ((((it.hasNext())&&(__CLR4_4_129al29allb90pej8.R.iget(105515)!=0|true))||(__CLR4_4_129al29allb90pej8.R.iget(105516)==0&false))) {{
            __CLR4_4_129al29allb90pej8.R.inc(105517);Assert.assertTrue(it.next() instanceof Long);
        }
    }}finally{__CLR4_4_129al29allb90pej8.R.flushNeeded();}}

    @Test
    public void testSerial() {__CLR4_4_129al29allb90pej8.R.globalSliceStart(getClass().getName(),105518);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16f44lv29f2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129al29allb90pej8.R.rethrow($CLV_t2$);}finally{__CLR4_4_129al29allb90pej8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.FrequencyTest.testSerial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105518,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16f44lv29f2(){try{__CLR4_4_129al29allb90pej8.R.inc(105518);
        __CLR4_4_129al29allb90pej8.R.inc(105519);f.addValue(ONE_LONG);
        __CLR4_4_129al29allb90pej8.R.inc(105520);f.addValue(TWO_LONG);
        __CLR4_4_129al29allb90pej8.R.inc(105521);f.addValue(ONE);
        __CLR4_4_129al29allb90pej8.R.inc(105522);f.addValue(TWO);
        __CLR4_4_129al29allb90pej8.R.inc(105523);Assert.assertEquals(f, TestUtils.serializeAndRecover(f));
    }finally{__CLR4_4_129al29allb90pej8.R.flushNeeded();}}
    
    @Test
    public void testGetUniqueCount() {__CLR4_4_129al29allb90pej8.R.globalSliceStart(getClass().getName(),105524);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f75dmn29f8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129al29allb90pej8.R.rethrow($CLV_t2$);}finally{__CLR4_4_129al29allb90pej8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.FrequencyTest.testGetUniqueCount",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105524,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f75dmn29f8(){try{__CLR4_4_129al29allb90pej8.R.inc(105524);
        __CLR4_4_129al29allb90pej8.R.inc(105525);Assert.assertEquals(0, f.getUniqueCount());
        __CLR4_4_129al29allb90pej8.R.inc(105526);f.addValue(ONE_LONG);
        __CLR4_4_129al29allb90pej8.R.inc(105527);Assert.assertEquals(1, f.getUniqueCount());
        __CLR4_4_129al29allb90pej8.R.inc(105528);f.addValue(ONE_LONG);
        __CLR4_4_129al29allb90pej8.R.inc(105529);Assert.assertEquals(1, f.getUniqueCount());
        __CLR4_4_129al29allb90pej8.R.inc(105530);f.addValue(TWO);
        __CLR4_4_129al29allb90pej8.R.inc(105531);Assert.assertEquals(2, f.getUniqueCount());
    }finally{__CLR4_4_129al29allb90pej8.R.flushNeeded();}}
    
    @Test
    public void testIncrement() {__CLR4_4_129al29allb90pej8.R.globalSliceStart(getClass().getName(),105532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m6qqn029fg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129al29allb90pej8.R.rethrow($CLV_t2$);}finally{__CLR4_4_129al29allb90pej8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.FrequencyTest.testIncrement",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105532,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m6qqn029fg(){try{__CLR4_4_129al29allb90pej8.R.inc(105532);
        __CLR4_4_129al29allb90pej8.R.inc(105533);Assert.assertEquals(0, f.getUniqueCount());
        __CLR4_4_129al29allb90pej8.R.inc(105534);f.incrementValue(ONE_LONG, 1);
        __CLR4_4_129al29allb90pej8.R.inc(105535);Assert.assertEquals(1, f.getCount(ONE_LONG));

        __CLR4_4_129al29allb90pej8.R.inc(105536);f.incrementValue(ONE_LONG, 4);
        __CLR4_4_129al29allb90pej8.R.inc(105537);Assert.assertEquals(5, f.getCount(ONE_LONG));
        
        __CLR4_4_129al29allb90pej8.R.inc(105538);f.incrementValue(ONE_LONG, -5);
        __CLR4_4_129al29allb90pej8.R.inc(105539);Assert.assertEquals(0, f.getCount(ONE_LONG));
    }finally{__CLR4_4_129al29allb90pej8.R.flushNeeded();}}
    
    @Test
    public void testMerge() {__CLR4_4_129al29allb90pej8.R.globalSliceStart(getClass().getName(),105540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zhzlu529fo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129al29allb90pej8.R.rethrow($CLV_t2$);}finally{__CLR4_4_129al29allb90pej8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.FrequencyTest.testMerge",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105540,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zhzlu529fo(){try{__CLR4_4_129al29allb90pej8.R.inc(105540);
        __CLR4_4_129al29allb90pej8.R.inc(105541);Assert.assertEquals(0, f.getUniqueCount());
        __CLR4_4_129al29allb90pej8.R.inc(105542);f.addValue(ONE_LONG);
        __CLR4_4_129al29allb90pej8.R.inc(105543);f.addValue(TWO_LONG);
        __CLR4_4_129al29allb90pej8.R.inc(105544);f.addValue(ONE);
        __CLR4_4_129al29allb90pej8.R.inc(105545);f.addValue(TWO);
        
        __CLR4_4_129al29allb90pej8.R.inc(105546);Assert.assertEquals(2, f.getUniqueCount());
        __CLR4_4_129al29allb90pej8.R.inc(105547);Assert.assertEquals(2, f.getCount(ONE));
        __CLR4_4_129al29allb90pej8.R.inc(105548);Assert.assertEquals(2, f.getCount(TWO));

        __CLR4_4_129al29allb90pej8.R.inc(105549);Frequency g = new Frequency();
        __CLR4_4_129al29allb90pej8.R.inc(105550);g.addValue(ONE_LONG);
        __CLR4_4_129al29allb90pej8.R.inc(105551);g.addValue(THREE_LONG);
        __CLR4_4_129al29allb90pej8.R.inc(105552);g.addValue(THREEE);

        __CLR4_4_129al29allb90pej8.R.inc(105553);Assert.assertEquals(2, g.getUniqueCount());
        __CLR4_4_129al29allb90pej8.R.inc(105554);Assert.assertEquals(1, g.getCount(ONE));
        __CLR4_4_129al29allb90pej8.R.inc(105555);Assert.assertEquals(2, g.getCount(THREEE));

        __CLR4_4_129al29allb90pej8.R.inc(105556);f.merge(g);
        
        __CLR4_4_129al29allb90pej8.R.inc(105557);Assert.assertEquals(3, f.getUniqueCount());
        __CLR4_4_129al29allb90pej8.R.inc(105558);Assert.assertEquals(3, f.getCount(ONE));
        __CLR4_4_129al29allb90pej8.R.inc(105559);Assert.assertEquals(2, f.getCount(TWO));
        __CLR4_4_129al29allb90pej8.R.inc(105560);Assert.assertEquals(2, f.getCount(THREEE));        
    }finally{__CLR4_4_129al29allb90pej8.R.flushNeeded();}}
    
    @Test
    public void testMergeCollection() {__CLR4_4_129al29allb90pej8.R.globalSliceStart(getClass().getName(),105561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yyglor29g9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129al29allb90pej8.R.rethrow($CLV_t2$);}finally{__CLR4_4_129al29allb90pej8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.FrequencyTest.testMergeCollection",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105561,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yyglor29g9(){try{__CLR4_4_129al29allb90pej8.R.inc(105561);
        __CLR4_4_129al29allb90pej8.R.inc(105562);Assert.assertEquals(0, f.getUniqueCount());
        __CLR4_4_129al29allb90pej8.R.inc(105563);f.addValue(ONE_LONG);
        
        __CLR4_4_129al29allb90pej8.R.inc(105564);Assert.assertEquals(1, f.getUniqueCount());
        __CLR4_4_129al29allb90pej8.R.inc(105565);Assert.assertEquals(1, f.getCount(ONE));
        __CLR4_4_129al29allb90pej8.R.inc(105566);Assert.assertEquals(0, f.getCount(TWO));

        __CLR4_4_129al29allb90pej8.R.inc(105567);Frequency g = new Frequency();
        __CLR4_4_129al29allb90pej8.R.inc(105568);g.addValue(TWO_LONG);

        __CLR4_4_129al29allb90pej8.R.inc(105569);Frequency h = new Frequency();
        __CLR4_4_129al29allb90pej8.R.inc(105570);h.addValue(THREE_LONG);
        
        __CLR4_4_129al29allb90pej8.R.inc(105571);List<Frequency> coll = new ArrayList<Frequency>();
        __CLR4_4_129al29allb90pej8.R.inc(105572);coll.add(g);
        __CLR4_4_129al29allb90pej8.R.inc(105573);coll.add(h);
        __CLR4_4_129al29allb90pej8.R.inc(105574);f.merge(coll);
        
        __CLR4_4_129al29allb90pej8.R.inc(105575);Assert.assertEquals(3, f.getUniqueCount());
        __CLR4_4_129al29allb90pej8.R.inc(105576);Assert.assertEquals(1, f.getCount(ONE));
        __CLR4_4_129al29allb90pej8.R.inc(105577);Assert.assertEquals(1, f.getCount(TWO));
        __CLR4_4_129al29allb90pej8.R.inc(105578);Assert.assertEquals(1, f.getCount(THREEE));        
    }finally{__CLR4_4_129al29allb90pej8.R.flushNeeded();}}
    
    @Test
    public void testMode() {__CLR4_4_129al29allb90pej8.R.globalSliceStart(getClass().getName(),105579);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mixofw29gr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129al29allb90pej8.R.rethrow($CLV_t2$);}finally{__CLR4_4_129al29allb90pej8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.FrequencyTest.testMode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105579,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mixofw29gr(){try{__CLR4_4_129al29allb90pej8.R.inc(105579);
        __CLR4_4_129al29allb90pej8.R.inc(105580);List<Comparable<?>> mode;
        __CLR4_4_129al29allb90pej8.R.inc(105581);mode = f.getMode();
        __CLR4_4_129al29allb90pej8.R.inc(105582);Assert.assertEquals(0, mode.size());

        __CLR4_4_129al29allb90pej8.R.inc(105583);f.addValue("3");
        __CLR4_4_129al29allb90pej8.R.inc(105584);mode = f.getMode();
        __CLR4_4_129al29allb90pej8.R.inc(105585);Assert.assertEquals(1, mode.size());
        __CLR4_4_129al29allb90pej8.R.inc(105586);Assert.assertEquals("3", mode.get(0));

        __CLR4_4_129al29allb90pej8.R.inc(105587);f.addValue("2");
        __CLR4_4_129al29allb90pej8.R.inc(105588);mode = f.getMode();
        __CLR4_4_129al29allb90pej8.R.inc(105589);Assert.assertEquals(2, mode.size());
        __CLR4_4_129al29allb90pej8.R.inc(105590);Assert.assertEquals("2", mode.get(0));
        __CLR4_4_129al29allb90pej8.R.inc(105591);Assert.assertEquals("3",mode.get(1));

        __CLR4_4_129al29allb90pej8.R.inc(105592);f.addValue("2");
        __CLR4_4_129al29allb90pej8.R.inc(105593);mode = f.getMode();
        __CLR4_4_129al29allb90pej8.R.inc(105594);Assert.assertEquals(1, mode.size());
        __CLR4_4_129al29allb90pej8.R.inc(105595);Assert.assertEquals("2", mode.get(0));
        __CLR4_4_129al29allb90pej8.R.inc(105596);Assert.assertFalse(mode.contains("1"));
        __CLR4_4_129al29allb90pej8.R.inc(105597);Assert.assertTrue(mode.contains("2"));

        __CLR4_4_129al29allb90pej8.R.inc(105598);try {
            __CLR4_4_129al29allb90pej8.R.inc(105599);f.addValue(Double.valueOf(Double.NaN));
            __CLR4_4_129al29allb90pej8.R.inc(105600);Assert.fail("Expected MathIllegalArgumentException");
        } catch (MathIllegalArgumentException e) {
            // expected
        }
    }finally{__CLR4_4_129al29allb90pej8.R.flushNeeded();}}

    @Test
    public void testModeDoubleNan() {__CLR4_4_129al29allb90pej8.R.globalSliceStart(getClass().getName(),105601);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_129ixr029hd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129al29allb90pej8.R.rethrow($CLV_t2$);}finally{__CLR4_4_129al29allb90pej8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.FrequencyTest.testModeDoubleNan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105601,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_129ixr029hd(){try{__CLR4_4_129al29allb90pej8.R.inc(105601);
        __CLR4_4_129al29allb90pej8.R.inc(105602);List<Comparable<?>> mode;
        __CLR4_4_129al29allb90pej8.R.inc(105603);f.addValue(Double.valueOf(Double.NaN));
        __CLR4_4_129al29allb90pej8.R.inc(105604);f.addValue(Double.valueOf(Double.NaN));
        __CLR4_4_129al29allb90pej8.R.inc(105605);f.addValue(Double.valueOf(Double.NaN));
        __CLR4_4_129al29allb90pej8.R.inc(105606);f.addValue(Double.valueOf(Double.NEGATIVE_INFINITY));
        __CLR4_4_129al29allb90pej8.R.inc(105607);f.addValue(Double.valueOf(Double.POSITIVE_INFINITY));
        __CLR4_4_129al29allb90pej8.R.inc(105608);f.addValue(Double.valueOf(Double.NEGATIVE_INFINITY));
        __CLR4_4_129al29allb90pej8.R.inc(105609);f.addValue(Double.valueOf(Double.POSITIVE_INFINITY));
        __CLR4_4_129al29allb90pej8.R.inc(105610);f.addValue(Double.valueOf(Double.NEGATIVE_INFINITY));
        __CLR4_4_129al29allb90pej8.R.inc(105611);f.addValue(Double.valueOf(Double.POSITIVE_INFINITY));
        __CLR4_4_129al29allb90pej8.R.inc(105612);mode = f.getMode();
        __CLR4_4_129al29allb90pej8.R.inc(105613);Assert.assertEquals(3, mode.size());
        __CLR4_4_129al29allb90pej8.R.inc(105614);Assert.assertEquals(Double.valueOf(Double.NEGATIVE_INFINITY), mode.get(0));
        __CLR4_4_129al29allb90pej8.R.inc(105615);Assert.assertEquals(Double.valueOf(Double.POSITIVE_INFINITY), mode.get(1));
        __CLR4_4_129al29allb90pej8.R.inc(105616);Assert.assertEquals(Double.valueOf(Double.NaN), mode.get(2));
        __CLR4_4_129al29allb90pej8.R.inc(105617);try {
            __CLR4_4_129al29allb90pej8.R.inc(105618);f.addValue(Float.valueOf(Float.NaN));
            __CLR4_4_129al29allb90pej8.R.inc(105619);Assert.fail("Expected MathIllegalArgumentException");
        } catch (MathIllegalArgumentException e) {
            // expected
        }
    }finally{__CLR4_4_129al29allb90pej8.R.flushNeeded();}}

    @Test
    public void testModeFloatNan() {__CLR4_4_129al29allb90pej8.R.globalSliceStart(getClass().getName(),105620);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16xxodh29hw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129al29allb90pej8.R.rethrow($CLV_t2$);}finally{__CLR4_4_129al29allb90pej8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.FrequencyTest.testModeFloatNan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105620,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16xxodh29hw(){try{__CLR4_4_129al29allb90pej8.R.inc(105620);
        __CLR4_4_129al29allb90pej8.R.inc(105621);List<Comparable<?>> mode;
        __CLR4_4_129al29allb90pej8.R.inc(105622);f.addValue(Float.valueOf(Float.NaN));
        __CLR4_4_129al29allb90pej8.R.inc(105623);f.addValue(Float.valueOf(Float.NaN));
        __CLR4_4_129al29allb90pej8.R.inc(105624);f.addValue(Float.valueOf(Float.NaN));
        __CLR4_4_129al29allb90pej8.R.inc(105625);f.addValue(Float.valueOf(Float.NEGATIVE_INFINITY));
        __CLR4_4_129al29allb90pej8.R.inc(105626);f.addValue(Float.valueOf(Float.POSITIVE_INFINITY));
        __CLR4_4_129al29allb90pej8.R.inc(105627);f.addValue(Float.valueOf(Float.NEGATIVE_INFINITY));
        __CLR4_4_129al29allb90pej8.R.inc(105628);f.addValue(Float.valueOf(Float.POSITIVE_INFINITY));
        __CLR4_4_129al29allb90pej8.R.inc(105629);f.addValue(Float.valueOf(Float.NEGATIVE_INFINITY));
        __CLR4_4_129al29allb90pej8.R.inc(105630);f.addValue(Float.valueOf(Float.POSITIVE_INFINITY));
        __CLR4_4_129al29allb90pej8.R.inc(105631);mode = f.getMode();
        __CLR4_4_129al29allb90pej8.R.inc(105632);Assert.assertEquals(3, mode.size());
        __CLR4_4_129al29allb90pej8.R.inc(105633);Assert.assertEquals(Float.valueOf(Float.NEGATIVE_INFINITY), mode.get(0));
        __CLR4_4_129al29allb90pej8.R.inc(105634);Assert.assertEquals(Float.valueOf(Float.POSITIVE_INFINITY), mode.get(1));
        __CLR4_4_129al29allb90pej8.R.inc(105635);Assert.assertEquals(Float.valueOf(Float.NaN), mode.get(2));
        __CLR4_4_129al29allb90pej8.R.inc(105636);try {
            __CLR4_4_129al29allb90pej8.R.inc(105637);f.addValue(Double.valueOf(Double.NaN));
            __CLR4_4_129al29allb90pej8.R.inc(105638);Assert.fail("Expected MathIllegalArgumentException");
        } catch (MathIllegalArgumentException e) {
            // expected
        }
    }finally{__CLR4_4_129al29allb90pej8.R.flushNeeded();}}

}
