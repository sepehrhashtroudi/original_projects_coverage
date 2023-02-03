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
package org.apache.commons.math3.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.math.BigInteger;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.random.RandomDataGenerator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the {@link ArithmeticUtils} class.
 *
 * @version $Id$
 */
public class ArithmeticUtilsTest {static class __CLR4_4_12e822e82lb90pewe{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,112030,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testAddAndCheck() {__CLR4_4_12e822e82lb90pewe.R.globalSliceStart(getClass().getName(),111746);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tqvbt32e82();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12e822e82lb90pewe.R.rethrow($CLV_t2$);}finally{__CLR4_4_12e822e82lb90pewe.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.ArithmeticUtilsTest.testAddAndCheck",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),111746,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tqvbt32e82(){try{__CLR4_4_12e822e82lb90pewe.R.inc(111746);
        __CLR4_4_12e822e82lb90pewe.R.inc(111747);int big = Integer.MAX_VALUE;
        __CLR4_4_12e822e82lb90pewe.R.inc(111748);int bigNeg = Integer.MIN_VALUE;
        __CLR4_4_12e822e82lb90pewe.R.inc(111749);Assert.assertEquals(big, ArithmeticUtils.addAndCheck(big, 0));
        __CLR4_4_12e822e82lb90pewe.R.inc(111750);try {
            __CLR4_4_12e822e82lb90pewe.R.inc(111751);ArithmeticUtils.addAndCheck(big, 1);
            __CLR4_4_12e822e82lb90pewe.R.inc(111752);Assert.fail("Expecting MathArithmeticException");
        } catch (MathArithmeticException ex) {
        }
        __CLR4_4_12e822e82lb90pewe.R.inc(111753);try {
            __CLR4_4_12e822e82lb90pewe.R.inc(111754);ArithmeticUtils.addAndCheck(bigNeg, -1);
            __CLR4_4_12e822e82lb90pewe.R.inc(111755);Assert.fail("Expecting MathArithmeticException");
        } catch (MathArithmeticException ex) {
        }
    }finally{__CLR4_4_12e822e82lb90pewe.R.flushNeeded();}}

    @Test
    public void testAddAndCheckLong() {__CLR4_4_12e822e82lb90pewe.R.globalSliceStart(getClass().getName(),111756);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qg8bz72e8c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12e822e82lb90pewe.R.rethrow($CLV_t2$);}finally{__CLR4_4_12e822e82lb90pewe.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.ArithmeticUtilsTest.testAddAndCheckLong",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),111756,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qg8bz72e8c(){try{__CLR4_4_12e822e82lb90pewe.R.inc(111756);
        __CLR4_4_12e822e82lb90pewe.R.inc(111757);long max = Long.MAX_VALUE;
        __CLR4_4_12e822e82lb90pewe.R.inc(111758);long min = Long.MIN_VALUE;
        __CLR4_4_12e822e82lb90pewe.R.inc(111759);Assert.assertEquals(max, ArithmeticUtils.addAndCheck(max, 0L));
        __CLR4_4_12e822e82lb90pewe.R.inc(111760);Assert.assertEquals(min, ArithmeticUtils.addAndCheck(min, 0L));
        __CLR4_4_12e822e82lb90pewe.R.inc(111761);Assert.assertEquals(max, ArithmeticUtils.addAndCheck(0L, max));
        __CLR4_4_12e822e82lb90pewe.R.inc(111762);Assert.assertEquals(min, ArithmeticUtils.addAndCheck(0L, min));
        __CLR4_4_12e822e82lb90pewe.R.inc(111763);Assert.assertEquals(1, ArithmeticUtils.addAndCheck(-1L, 2L));
        __CLR4_4_12e822e82lb90pewe.R.inc(111764);Assert.assertEquals(1, ArithmeticUtils.addAndCheck(2L, -1L));
        __CLR4_4_12e822e82lb90pewe.R.inc(111765);Assert.assertEquals(-3, ArithmeticUtils.addAndCheck(-2L, -1L));
        __CLR4_4_12e822e82lb90pewe.R.inc(111766);Assert.assertEquals(min, ArithmeticUtils.addAndCheck(min + 1, -1L));
        __CLR4_4_12e822e82lb90pewe.R.inc(111767);testAddAndCheckLongFailure(max, 1L);
        __CLR4_4_12e822e82lb90pewe.R.inc(111768);testAddAndCheckLongFailure(min, -1L);
        __CLR4_4_12e822e82lb90pewe.R.inc(111769);testAddAndCheckLongFailure(1L, max);
        __CLR4_4_12e822e82lb90pewe.R.inc(111770);testAddAndCheckLongFailure(-1L, min);
    }finally{__CLR4_4_12e822e82lb90pewe.R.flushNeeded();}}

    @Test
    public void testGcd() {__CLR4_4_12e822e82lb90pewe.R.globalSliceStart(getClass().getName(),111771);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ap1tnn2e8r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12e822e82lb90pewe.R.rethrow($CLV_t2$);}finally{__CLR4_4_12e822e82lb90pewe.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.ArithmeticUtilsTest.testGcd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),111771,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ap1tnn2e8r(){try{__CLR4_4_12e822e82lb90pewe.R.inc(111771);
        __CLR4_4_12e822e82lb90pewe.R.inc(111772);int a = 30;
        __CLR4_4_12e822e82lb90pewe.R.inc(111773);int b = 50;
        __CLR4_4_12e822e82lb90pewe.R.inc(111774);int c = 77;

        __CLR4_4_12e822e82lb90pewe.R.inc(111775);Assert.assertEquals(0, ArithmeticUtils.gcd(0, 0));

        __CLR4_4_12e822e82lb90pewe.R.inc(111776);Assert.assertEquals(b, ArithmeticUtils.gcd(0, b));
        __CLR4_4_12e822e82lb90pewe.R.inc(111777);Assert.assertEquals(a, ArithmeticUtils.gcd(a, 0));
        __CLR4_4_12e822e82lb90pewe.R.inc(111778);Assert.assertEquals(b, ArithmeticUtils.gcd(0, -b));
        __CLR4_4_12e822e82lb90pewe.R.inc(111779);Assert.assertEquals(a, ArithmeticUtils.gcd(-a, 0));

        __CLR4_4_12e822e82lb90pewe.R.inc(111780);Assert.assertEquals(10, ArithmeticUtils.gcd(a, b));
        __CLR4_4_12e822e82lb90pewe.R.inc(111781);Assert.assertEquals(10, ArithmeticUtils.gcd(-a, b));
        __CLR4_4_12e822e82lb90pewe.R.inc(111782);Assert.assertEquals(10, ArithmeticUtils.gcd(a, -b));
        __CLR4_4_12e822e82lb90pewe.R.inc(111783);Assert.assertEquals(10, ArithmeticUtils.gcd(-a, -b));

        __CLR4_4_12e822e82lb90pewe.R.inc(111784);Assert.assertEquals(1, ArithmeticUtils.gcd(a, c));
        __CLR4_4_12e822e82lb90pewe.R.inc(111785);Assert.assertEquals(1, ArithmeticUtils.gcd(-a, c));
        __CLR4_4_12e822e82lb90pewe.R.inc(111786);Assert.assertEquals(1, ArithmeticUtils.gcd(a, -c));
        __CLR4_4_12e822e82lb90pewe.R.inc(111787);Assert.assertEquals(1, ArithmeticUtils.gcd(-a, -c));

        __CLR4_4_12e822e82lb90pewe.R.inc(111788);Assert.assertEquals(3 * (1<<15), ArithmeticUtils.gcd(3 * (1<<20), 9 * (1<<15)));

        __CLR4_4_12e822e82lb90pewe.R.inc(111789);Assert.assertEquals(Integer.MAX_VALUE, ArithmeticUtils.gcd(Integer.MAX_VALUE, 0));
        __CLR4_4_12e822e82lb90pewe.R.inc(111790);Assert.assertEquals(Integer.MAX_VALUE, ArithmeticUtils.gcd(-Integer.MAX_VALUE, 0));
        __CLR4_4_12e822e82lb90pewe.R.inc(111791);Assert.assertEquals(1<<30, ArithmeticUtils.gcd(1<<30, -Integer.MIN_VALUE));
        __CLR4_4_12e822e82lb90pewe.R.inc(111792);try {
            // gcd(Integer.MIN_VALUE, 0) > Integer.MAX_VALUE
            __CLR4_4_12e822e82lb90pewe.R.inc(111793);ArithmeticUtils.gcd(Integer.MIN_VALUE, 0);
            __CLR4_4_12e822e82lb90pewe.R.inc(111794);Assert.fail("expecting MathArithmeticException");
        } catch (MathArithmeticException expected) {
            // expected
        }
        __CLR4_4_12e822e82lb90pewe.R.inc(111795);try {
            // gcd(0, Integer.MIN_VALUE) > Integer.MAX_VALUE
            __CLR4_4_12e822e82lb90pewe.R.inc(111796);ArithmeticUtils.gcd(0, Integer.MIN_VALUE);
            __CLR4_4_12e822e82lb90pewe.R.inc(111797);Assert.fail("expecting MathArithmeticException");
        } catch (MathArithmeticException expected) {
            // expected
        }
        __CLR4_4_12e822e82lb90pewe.R.inc(111798);try {
            // gcd(Integer.MIN_VALUE, Integer.MIN_VALUE) > Integer.MAX_VALUE
            __CLR4_4_12e822e82lb90pewe.R.inc(111799);ArithmeticUtils.gcd(Integer.MIN_VALUE, Integer.MIN_VALUE);
            __CLR4_4_12e822e82lb90pewe.R.inc(111800);Assert.fail("expecting MathArithmeticException");
        } catch (MathArithmeticException expected) {
            // expected
        }
    }finally{__CLR4_4_12e822e82lb90pewe.R.flushNeeded();}}

    @Test
    public void testGcdConsistency() {__CLR4_4_12e822e82lb90pewe.R.globalSliceStart(getClass().getName(),111801);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fkkg892e9l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12e822e82lb90pewe.R.rethrow($CLV_t2$);}finally{__CLR4_4_12e822e82lb90pewe.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.ArithmeticUtilsTest.testGcdConsistency",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),111801,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fkkg892e9l(){try{__CLR4_4_12e822e82lb90pewe.R.inc(111801);
        __CLR4_4_12e822e82lb90pewe.R.inc(111802);int[] primeList = {19, 23, 53, 67, 73, 79, 101, 103, 111, 131};
        __CLR4_4_12e822e82lb90pewe.R.inc(111803);ArrayList<Integer> primes = new ArrayList<Integer>();
        __CLR4_4_12e822e82lb90pewe.R.inc(111804);for (int i = 0; (((i < primeList.length)&&(__CLR4_4_12e822e82lb90pewe.R.iget(111805)!=0|true))||(__CLR4_4_12e822e82lb90pewe.R.iget(111806)==0&false)); i++) {{
            __CLR4_4_12e822e82lb90pewe.R.inc(111807);primes.add(Integer.valueOf(primeList[i]));
        }
        }__CLR4_4_12e822e82lb90pewe.R.inc(111808);RandomDataGenerator randomData = new RandomDataGenerator();
        __CLR4_4_12e822e82lb90pewe.R.inc(111809);for (int i = 0; (((i < 20)&&(__CLR4_4_12e822e82lb90pewe.R.iget(111810)!=0|true))||(__CLR4_4_12e822e82lb90pewe.R.iget(111811)==0&false)); i++) {{
            __CLR4_4_12e822e82lb90pewe.R.inc(111812);Object[] sample = randomData.nextSample(primes, 4);
            __CLR4_4_12e822e82lb90pewe.R.inc(111813);int p1 = ((Integer) sample[0]).intValue();
            __CLR4_4_12e822e82lb90pewe.R.inc(111814);int p2 = ((Integer) sample[1]).intValue();
            __CLR4_4_12e822e82lb90pewe.R.inc(111815);int p3 = ((Integer) sample[2]).intValue();
            __CLR4_4_12e822e82lb90pewe.R.inc(111816);int p4 = ((Integer) sample[3]).intValue();
            __CLR4_4_12e822e82lb90pewe.R.inc(111817);int i1 = p1 * p2 * p3;
            __CLR4_4_12e822e82lb90pewe.R.inc(111818);int i2 = p1 * p2 * p4;
            __CLR4_4_12e822e82lb90pewe.R.inc(111819);int gcd = p1 * p2;
            __CLR4_4_12e822e82lb90pewe.R.inc(111820);Assert.assertEquals(gcd, ArithmeticUtils.gcd(i1, i2));
            __CLR4_4_12e822e82lb90pewe.R.inc(111821);long l1 = i1;
            __CLR4_4_12e822e82lb90pewe.R.inc(111822);long l2 = i2;
            __CLR4_4_12e822e82lb90pewe.R.inc(111823);Assert.assertEquals(gcd, ArithmeticUtils.gcd(l1, l2));
        }
    }}finally{__CLR4_4_12e822e82lb90pewe.R.flushNeeded();}}

    @Test
    public void  testGcdLong(){__CLR4_4_12e822e82lb90pewe.R.globalSliceStart(getClass().getName(),111824);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kgvsmx2ea8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12e822e82lb90pewe.R.rethrow($CLV_t2$);}finally{__CLR4_4_12e822e82lb90pewe.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.ArithmeticUtilsTest.testGcdLong",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),111824,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kgvsmx2ea8(){try{__CLR4_4_12e822e82lb90pewe.R.inc(111824);
        __CLR4_4_12e822e82lb90pewe.R.inc(111825);long a = 30;
        __CLR4_4_12e822e82lb90pewe.R.inc(111826);long b = 50;
        __CLR4_4_12e822e82lb90pewe.R.inc(111827);long c = 77;

        __CLR4_4_12e822e82lb90pewe.R.inc(111828);Assert.assertEquals(0, ArithmeticUtils.gcd(0L, 0));

        __CLR4_4_12e822e82lb90pewe.R.inc(111829);Assert.assertEquals(b, ArithmeticUtils.gcd(0, b));
        __CLR4_4_12e822e82lb90pewe.R.inc(111830);Assert.assertEquals(a, ArithmeticUtils.gcd(a, 0));
        __CLR4_4_12e822e82lb90pewe.R.inc(111831);Assert.assertEquals(b, ArithmeticUtils.gcd(0, -b));
        __CLR4_4_12e822e82lb90pewe.R.inc(111832);Assert.assertEquals(a, ArithmeticUtils.gcd(-a, 0));

        __CLR4_4_12e822e82lb90pewe.R.inc(111833);Assert.assertEquals(10, ArithmeticUtils.gcd(a, b));
        __CLR4_4_12e822e82lb90pewe.R.inc(111834);Assert.assertEquals(10, ArithmeticUtils.gcd(-a, b));
        __CLR4_4_12e822e82lb90pewe.R.inc(111835);Assert.assertEquals(10, ArithmeticUtils.gcd(a, -b));
        __CLR4_4_12e822e82lb90pewe.R.inc(111836);Assert.assertEquals(10, ArithmeticUtils.gcd(-a, -b));

        __CLR4_4_12e822e82lb90pewe.R.inc(111837);Assert.assertEquals(1, ArithmeticUtils.gcd(a, c));
        __CLR4_4_12e822e82lb90pewe.R.inc(111838);Assert.assertEquals(1, ArithmeticUtils.gcd(-a, c));
        __CLR4_4_12e822e82lb90pewe.R.inc(111839);Assert.assertEquals(1, ArithmeticUtils.gcd(a, -c));
        __CLR4_4_12e822e82lb90pewe.R.inc(111840);Assert.assertEquals(1, ArithmeticUtils.gcd(-a, -c));

        __CLR4_4_12e822e82lb90pewe.R.inc(111841);Assert.assertEquals(3L * (1L<<45), ArithmeticUtils.gcd(3L * (1L<<50), 9L * (1L<<45)));

        __CLR4_4_12e822e82lb90pewe.R.inc(111842);Assert.assertEquals(1L<<45, ArithmeticUtils.gcd(1L<<45, Long.MIN_VALUE));

        __CLR4_4_12e822e82lb90pewe.R.inc(111843);Assert.assertEquals(Long.MAX_VALUE, ArithmeticUtils.gcd(Long.MAX_VALUE, 0L));
        __CLR4_4_12e822e82lb90pewe.R.inc(111844);Assert.assertEquals(Long.MAX_VALUE, ArithmeticUtils.gcd(-Long.MAX_VALUE, 0L));
        __CLR4_4_12e822e82lb90pewe.R.inc(111845);Assert.assertEquals(1, ArithmeticUtils.gcd(60247241209L, 153092023L));
        __CLR4_4_12e822e82lb90pewe.R.inc(111846);try {
            // gcd(Long.MIN_VALUE, 0) > Long.MAX_VALUE
            __CLR4_4_12e822e82lb90pewe.R.inc(111847);ArithmeticUtils.gcd(Long.MIN_VALUE, 0);
            __CLR4_4_12e822e82lb90pewe.R.inc(111848);Assert.fail("expecting MathArithmeticException");
        } catch (MathArithmeticException expected) {
            // expected
        }
        __CLR4_4_12e822e82lb90pewe.R.inc(111849);try {
            // gcd(0, Long.MIN_VALUE) > Long.MAX_VALUE
            __CLR4_4_12e822e82lb90pewe.R.inc(111850);ArithmeticUtils.gcd(0, Long.MIN_VALUE);
            __CLR4_4_12e822e82lb90pewe.R.inc(111851);Assert.fail("expecting MathArithmeticException");
        } catch (MathArithmeticException expected) {
            // expected
        }
        __CLR4_4_12e822e82lb90pewe.R.inc(111852);try {
            // gcd(Long.MIN_VALUE, Long.MIN_VALUE) > Long.MAX_VALUE
            __CLR4_4_12e822e82lb90pewe.R.inc(111853);ArithmeticUtils.gcd(Long.MIN_VALUE, Long.MIN_VALUE);
            __CLR4_4_12e822e82lb90pewe.R.inc(111854);Assert.fail("expecting MathArithmeticException");
        } catch (MathArithmeticException expected) {
            // expected
        }
    }finally{__CLR4_4_12e822e82lb90pewe.R.flushNeeded();}}


    @Test
    public void testLcm() {__CLR4_4_12e822e82lb90pewe.R.globalSliceStart(getClass().getName(),111855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17vof572eb3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12e822e82lb90pewe.R.rethrow($CLV_t2$);}finally{__CLR4_4_12e822e82lb90pewe.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.ArithmeticUtilsTest.testLcm",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),111855,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17vof572eb3(){try{__CLR4_4_12e822e82lb90pewe.R.inc(111855);
        __CLR4_4_12e822e82lb90pewe.R.inc(111856);int a = 30;
        __CLR4_4_12e822e82lb90pewe.R.inc(111857);int b = 50;
        __CLR4_4_12e822e82lb90pewe.R.inc(111858);int c = 77;

        __CLR4_4_12e822e82lb90pewe.R.inc(111859);Assert.assertEquals(0, ArithmeticUtils.lcm(0, b));
        __CLR4_4_12e822e82lb90pewe.R.inc(111860);Assert.assertEquals(0, ArithmeticUtils.lcm(a, 0));
        __CLR4_4_12e822e82lb90pewe.R.inc(111861);Assert.assertEquals(b, ArithmeticUtils.lcm(1, b));
        __CLR4_4_12e822e82lb90pewe.R.inc(111862);Assert.assertEquals(a, ArithmeticUtils.lcm(a, 1));
        __CLR4_4_12e822e82lb90pewe.R.inc(111863);Assert.assertEquals(150, ArithmeticUtils.lcm(a, b));
        __CLR4_4_12e822e82lb90pewe.R.inc(111864);Assert.assertEquals(150, ArithmeticUtils.lcm(-a, b));
        __CLR4_4_12e822e82lb90pewe.R.inc(111865);Assert.assertEquals(150, ArithmeticUtils.lcm(a, -b));
        __CLR4_4_12e822e82lb90pewe.R.inc(111866);Assert.assertEquals(150, ArithmeticUtils.lcm(-a, -b));
        __CLR4_4_12e822e82lb90pewe.R.inc(111867);Assert.assertEquals(2310, ArithmeticUtils.lcm(a, c));

        // Assert that no intermediate value overflows:
        // The naive implementation of lcm(a,b) would be (a*b)/gcd(a,b)
        __CLR4_4_12e822e82lb90pewe.R.inc(111868);Assert.assertEquals((1<<20)*15, ArithmeticUtils.lcm((1<<20)*3, (1<<20)*5));

        // Special case
        __CLR4_4_12e822e82lb90pewe.R.inc(111869);Assert.assertEquals(0, ArithmeticUtils.lcm(0, 0));

        __CLR4_4_12e822e82lb90pewe.R.inc(111870);try {
            // lcm == abs(MIN_VALUE) cannot be represented as a nonnegative int
            __CLR4_4_12e822e82lb90pewe.R.inc(111871);ArithmeticUtils.lcm(Integer.MIN_VALUE, 1);
            __CLR4_4_12e822e82lb90pewe.R.inc(111872);Assert.fail("Expecting MathArithmeticException");
        } catch (MathArithmeticException expected) {
            // expected
        }

        __CLR4_4_12e822e82lb90pewe.R.inc(111873);try {
            // lcm == abs(MIN_VALUE) cannot be represented as a nonnegative int
            __CLR4_4_12e822e82lb90pewe.R.inc(111874);ArithmeticUtils.lcm(Integer.MIN_VALUE, 1<<20);
            __CLR4_4_12e822e82lb90pewe.R.inc(111875);Assert.fail("Expecting MathArithmeticException");
        } catch (MathArithmeticException expected) {
            // expected
        }

        __CLR4_4_12e822e82lb90pewe.R.inc(111876);try {
            __CLR4_4_12e822e82lb90pewe.R.inc(111877);ArithmeticUtils.lcm(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
            __CLR4_4_12e822e82lb90pewe.R.inc(111878);Assert.fail("Expecting MathArithmeticException");
        } catch (MathArithmeticException expected) {
            // expected
        }
    }finally{__CLR4_4_12e822e82lb90pewe.R.flushNeeded();}}

    @Test
    public void testLcmLong() {__CLR4_4_12e822e82lb90pewe.R.globalSliceStart(getClass().getName(),111879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_144ku2h2ebr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12e822e82lb90pewe.R.rethrow($CLV_t2$);}finally{__CLR4_4_12e822e82lb90pewe.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.ArithmeticUtilsTest.testLcmLong",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),111879,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_144ku2h2ebr(){try{__CLR4_4_12e822e82lb90pewe.R.inc(111879);
        __CLR4_4_12e822e82lb90pewe.R.inc(111880);long a = 30;
        __CLR4_4_12e822e82lb90pewe.R.inc(111881);long b = 50;
        __CLR4_4_12e822e82lb90pewe.R.inc(111882);long c = 77;

        __CLR4_4_12e822e82lb90pewe.R.inc(111883);Assert.assertEquals(0, ArithmeticUtils.lcm(0, b));
        __CLR4_4_12e822e82lb90pewe.R.inc(111884);Assert.assertEquals(0, ArithmeticUtils.lcm(a, 0));
        __CLR4_4_12e822e82lb90pewe.R.inc(111885);Assert.assertEquals(b, ArithmeticUtils.lcm(1, b));
        __CLR4_4_12e822e82lb90pewe.R.inc(111886);Assert.assertEquals(a, ArithmeticUtils.lcm(a, 1));
        __CLR4_4_12e822e82lb90pewe.R.inc(111887);Assert.assertEquals(150, ArithmeticUtils.lcm(a, b));
        __CLR4_4_12e822e82lb90pewe.R.inc(111888);Assert.assertEquals(150, ArithmeticUtils.lcm(-a, b));
        __CLR4_4_12e822e82lb90pewe.R.inc(111889);Assert.assertEquals(150, ArithmeticUtils.lcm(a, -b));
        __CLR4_4_12e822e82lb90pewe.R.inc(111890);Assert.assertEquals(150, ArithmeticUtils.lcm(-a, -b));
        __CLR4_4_12e822e82lb90pewe.R.inc(111891);Assert.assertEquals(2310, ArithmeticUtils.lcm(a, c));

        __CLR4_4_12e822e82lb90pewe.R.inc(111892);Assert.assertEquals(Long.MAX_VALUE, ArithmeticUtils.lcm(60247241209L, 153092023L));

        // Assert that no intermediate value overflows:
        // The naive implementation of lcm(a,b) would be (a*b)/gcd(a,b)
        __CLR4_4_12e822e82lb90pewe.R.inc(111893);Assert.assertEquals((1L<<50)*15, ArithmeticUtils.lcm((1L<<45)*3, (1L<<50)*5));

        // Special case
        __CLR4_4_12e822e82lb90pewe.R.inc(111894);Assert.assertEquals(0L, ArithmeticUtils.lcm(0L, 0L));

        __CLR4_4_12e822e82lb90pewe.R.inc(111895);try {
            // lcm == abs(MIN_VALUE) cannot be represented as a nonnegative int
            __CLR4_4_12e822e82lb90pewe.R.inc(111896);ArithmeticUtils.lcm(Long.MIN_VALUE, 1);
            __CLR4_4_12e822e82lb90pewe.R.inc(111897);Assert.fail("Expecting MathArithmeticException");
        } catch (MathArithmeticException expected) {
            // expected
        }

        __CLR4_4_12e822e82lb90pewe.R.inc(111898);try {
            // lcm == abs(MIN_VALUE) cannot be represented as a nonnegative int
            __CLR4_4_12e822e82lb90pewe.R.inc(111899);ArithmeticUtils.lcm(Long.MIN_VALUE, 1<<20);
            __CLR4_4_12e822e82lb90pewe.R.inc(111900);Assert.fail("Expecting MathArithmeticException");
        } catch (MathArithmeticException expected) {
            // expected
        }

        __CLR4_4_12e822e82lb90pewe.R.inc(111901);Assert.assertEquals((long) Integer.MAX_VALUE * (Integer.MAX_VALUE - 1),
            ArithmeticUtils.lcm((long)Integer.MAX_VALUE, Integer.MAX_VALUE - 1));
        __CLR4_4_12e822e82lb90pewe.R.inc(111902);try {
            __CLR4_4_12e822e82lb90pewe.R.inc(111903);ArithmeticUtils.lcm(Long.MAX_VALUE, Long.MAX_VALUE - 1);
            __CLR4_4_12e822e82lb90pewe.R.inc(111904);Assert.fail("Expecting MathArithmeticException");
        } catch (MathArithmeticException expected) {
            // expected
        }
    }finally{__CLR4_4_12e822e82lb90pewe.R.flushNeeded();}}

    @Test
    public void testMulAndCheck() {__CLR4_4_12e822e82lb90pewe.R.globalSliceStart(getClass().getName(),111905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gztnli2ech();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12e822e82lb90pewe.R.rethrow($CLV_t2$);}finally{__CLR4_4_12e822e82lb90pewe.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.ArithmeticUtilsTest.testMulAndCheck",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),111905,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gztnli2ech(){try{__CLR4_4_12e822e82lb90pewe.R.inc(111905);
        __CLR4_4_12e822e82lb90pewe.R.inc(111906);int big = Integer.MAX_VALUE;
        __CLR4_4_12e822e82lb90pewe.R.inc(111907);int bigNeg = Integer.MIN_VALUE;
        __CLR4_4_12e822e82lb90pewe.R.inc(111908);Assert.assertEquals(big, ArithmeticUtils.mulAndCheck(big, 1));
        __CLR4_4_12e822e82lb90pewe.R.inc(111909);try {
            __CLR4_4_12e822e82lb90pewe.R.inc(111910);ArithmeticUtils.mulAndCheck(big, 2);
            __CLR4_4_12e822e82lb90pewe.R.inc(111911);Assert.fail("Expecting MathArithmeticException");
        } catch (MathArithmeticException ex) {
        }
        __CLR4_4_12e822e82lb90pewe.R.inc(111912);try {
            __CLR4_4_12e822e82lb90pewe.R.inc(111913);ArithmeticUtils.mulAndCheck(bigNeg, 2);
            __CLR4_4_12e822e82lb90pewe.R.inc(111914);Assert.fail("Expecting MathArithmeticException");
        } catch (MathArithmeticException ex) {
        }
    }finally{__CLR4_4_12e822e82lb90pewe.R.flushNeeded();}}

    @Test
    public void testMulAndCheckLong() {__CLR4_4_12e822e82lb90pewe.R.globalSliceStart(getClass().getName(),111915);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ugm02u2ecr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12e822e82lb90pewe.R.rethrow($CLV_t2$);}finally{__CLR4_4_12e822e82lb90pewe.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.ArithmeticUtilsTest.testMulAndCheckLong",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),111915,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ugm02u2ecr(){try{__CLR4_4_12e822e82lb90pewe.R.inc(111915);
        __CLR4_4_12e822e82lb90pewe.R.inc(111916);long max = Long.MAX_VALUE;
        __CLR4_4_12e822e82lb90pewe.R.inc(111917);long min = Long.MIN_VALUE;
        __CLR4_4_12e822e82lb90pewe.R.inc(111918);Assert.assertEquals(max, ArithmeticUtils.mulAndCheck(max, 1L));
        __CLR4_4_12e822e82lb90pewe.R.inc(111919);Assert.assertEquals(min, ArithmeticUtils.mulAndCheck(min, 1L));
        __CLR4_4_12e822e82lb90pewe.R.inc(111920);Assert.assertEquals(0L, ArithmeticUtils.mulAndCheck(max, 0L));
        __CLR4_4_12e822e82lb90pewe.R.inc(111921);Assert.assertEquals(0L, ArithmeticUtils.mulAndCheck(min, 0L));
        __CLR4_4_12e822e82lb90pewe.R.inc(111922);Assert.assertEquals(max, ArithmeticUtils.mulAndCheck(1L, max));
        __CLR4_4_12e822e82lb90pewe.R.inc(111923);Assert.assertEquals(min, ArithmeticUtils.mulAndCheck(1L, min));
        __CLR4_4_12e822e82lb90pewe.R.inc(111924);Assert.assertEquals(0L, ArithmeticUtils.mulAndCheck(0L, max));
        __CLR4_4_12e822e82lb90pewe.R.inc(111925);Assert.assertEquals(0L, ArithmeticUtils.mulAndCheck(0L, min));
        __CLR4_4_12e822e82lb90pewe.R.inc(111926);Assert.assertEquals(1L, ArithmeticUtils.mulAndCheck(-1L, -1L));
        __CLR4_4_12e822e82lb90pewe.R.inc(111927);Assert.assertEquals(min, ArithmeticUtils.mulAndCheck(min / 2, 2));
        __CLR4_4_12e822e82lb90pewe.R.inc(111928);testMulAndCheckLongFailure(max, 2L);
        __CLR4_4_12e822e82lb90pewe.R.inc(111929);testMulAndCheckLongFailure(2L, max);
        __CLR4_4_12e822e82lb90pewe.R.inc(111930);testMulAndCheckLongFailure(min, 2L);
        __CLR4_4_12e822e82lb90pewe.R.inc(111931);testMulAndCheckLongFailure(2L, min);
        __CLR4_4_12e822e82lb90pewe.R.inc(111932);testMulAndCheckLongFailure(min, -1L);
        __CLR4_4_12e822e82lb90pewe.R.inc(111933);testMulAndCheckLongFailure(-1L, min);
    }finally{__CLR4_4_12e822e82lb90pewe.R.flushNeeded();}}

    @Test
    public void testSubAndCheck() {__CLR4_4_12e822e82lb90pewe.R.globalSliceStart(getClass().getName(),111934);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qidl22eda();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12e822e82lb90pewe.R.rethrow($CLV_t2$);}finally{__CLR4_4_12e822e82lb90pewe.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.ArithmeticUtilsTest.testSubAndCheck",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),111934,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qidl22eda(){try{__CLR4_4_12e822e82lb90pewe.R.inc(111934);
        __CLR4_4_12e822e82lb90pewe.R.inc(111935);int big = Integer.MAX_VALUE;
        __CLR4_4_12e822e82lb90pewe.R.inc(111936);int bigNeg = Integer.MIN_VALUE;
        __CLR4_4_12e822e82lb90pewe.R.inc(111937);Assert.assertEquals(big, ArithmeticUtils.subAndCheck(big, 0));
        __CLR4_4_12e822e82lb90pewe.R.inc(111938);Assert.assertEquals(bigNeg + 1, ArithmeticUtils.subAndCheck(bigNeg, -1));
        __CLR4_4_12e822e82lb90pewe.R.inc(111939);Assert.assertEquals(-1, ArithmeticUtils.subAndCheck(bigNeg, -big));
        __CLR4_4_12e822e82lb90pewe.R.inc(111940);try {
            __CLR4_4_12e822e82lb90pewe.R.inc(111941);ArithmeticUtils.subAndCheck(big, -1);
            __CLR4_4_12e822e82lb90pewe.R.inc(111942);Assert.fail("Expecting MathArithmeticException");
        } catch (MathArithmeticException ex) {
        }
        __CLR4_4_12e822e82lb90pewe.R.inc(111943);try {
            __CLR4_4_12e822e82lb90pewe.R.inc(111944);ArithmeticUtils.subAndCheck(bigNeg, 1);
            __CLR4_4_12e822e82lb90pewe.R.inc(111945);Assert.fail("Expecting MathArithmeticException");
        } catch (MathArithmeticException ex) {
        }
    }finally{__CLR4_4_12e822e82lb90pewe.R.flushNeeded();}}

    @Test
    public void testSubAndCheckErrorMessage() {__CLR4_4_12e822e82lb90pewe.R.globalSliceStart(getClass().getName(),111946);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1firgmd2edm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12e822e82lb90pewe.R.rethrow($CLV_t2$);}finally{__CLR4_4_12e822e82lb90pewe.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.ArithmeticUtilsTest.testSubAndCheckErrorMessage",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),111946,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1firgmd2edm(){try{__CLR4_4_12e822e82lb90pewe.R.inc(111946);
        __CLR4_4_12e822e82lb90pewe.R.inc(111947);int big = Integer.MAX_VALUE;
        __CLR4_4_12e822e82lb90pewe.R.inc(111948);try {
            __CLR4_4_12e822e82lb90pewe.R.inc(111949);ArithmeticUtils.subAndCheck(big, -1);
            __CLR4_4_12e822e82lb90pewe.R.inc(111950);Assert.fail("Expecting MathArithmeticException");
        } catch (MathArithmeticException ex) {
            __CLR4_4_12e822e82lb90pewe.R.inc(111951);Assert.assertTrue(ex.getMessage().length() > 1);
        }
    }finally{__CLR4_4_12e822e82lb90pewe.R.flushNeeded();}}

    @Test
    public void testSubAndCheckLong() {__CLR4_4_12e822e82lb90pewe.R.globalSliceStart(getClass().getName(),111952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ftmuji2eds();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12e822e82lb90pewe.R.rethrow($CLV_t2$);}finally{__CLR4_4_12e822e82lb90pewe.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.ArithmeticUtilsTest.testSubAndCheckLong",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),111952,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ftmuji2eds(){try{__CLR4_4_12e822e82lb90pewe.R.inc(111952);
        __CLR4_4_12e822e82lb90pewe.R.inc(111953);long max = Long.MAX_VALUE;
        __CLR4_4_12e822e82lb90pewe.R.inc(111954);long min = Long.MIN_VALUE;
        __CLR4_4_12e822e82lb90pewe.R.inc(111955);Assert.assertEquals(max, ArithmeticUtils.subAndCheck(max, 0));
        __CLR4_4_12e822e82lb90pewe.R.inc(111956);Assert.assertEquals(min, ArithmeticUtils.subAndCheck(min, 0));
        __CLR4_4_12e822e82lb90pewe.R.inc(111957);Assert.assertEquals(-max, ArithmeticUtils.subAndCheck(0, max));
        __CLR4_4_12e822e82lb90pewe.R.inc(111958);Assert.assertEquals(min + 1, ArithmeticUtils.subAndCheck(min, -1));
        // min == -1-max
        __CLR4_4_12e822e82lb90pewe.R.inc(111959);Assert.assertEquals(-1, ArithmeticUtils.subAndCheck(-max - 1, -max));
        __CLR4_4_12e822e82lb90pewe.R.inc(111960);Assert.assertEquals(max, ArithmeticUtils.subAndCheck(-1, -1 - max));
        __CLR4_4_12e822e82lb90pewe.R.inc(111961);testSubAndCheckLongFailure(0L, min);
        __CLR4_4_12e822e82lb90pewe.R.inc(111962);testSubAndCheckLongFailure(max, -1L);
        __CLR4_4_12e822e82lb90pewe.R.inc(111963);testSubAndCheckLongFailure(min, 1L);
    }finally{__CLR4_4_12e822e82lb90pewe.R.flushNeeded();}}

    @Test
    public void testPow() {__CLR4_4_12e822e82lb90pewe.R.globalSliceStart(getClass().getName(),111964);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xazw8d2ee4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12e822e82lb90pewe.R.rethrow($CLV_t2$);}finally{__CLR4_4_12e822e82lb90pewe.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.ArithmeticUtilsTest.testPow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),111964,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xazw8d2ee4(){try{__CLR4_4_12e822e82lb90pewe.R.inc(111964);

        __CLR4_4_12e822e82lb90pewe.R.inc(111965);Assert.assertEquals(1801088541, ArithmeticUtils.pow(21, 7));
        __CLR4_4_12e822e82lb90pewe.R.inc(111966);Assert.assertEquals(1, ArithmeticUtils.pow(21, 0));
        __CLR4_4_12e822e82lb90pewe.R.inc(111967);try {
            __CLR4_4_12e822e82lb90pewe.R.inc(111968);ArithmeticUtils.pow(21, -7);
            __CLR4_4_12e822e82lb90pewe.R.inc(111969);Assert.fail("Expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException e) {
            // expected behavior
        }

        __CLR4_4_12e822e82lb90pewe.R.inc(111970);Assert.assertEquals(1801088541, ArithmeticUtils.pow(21, 7l));
        __CLR4_4_12e822e82lb90pewe.R.inc(111971);Assert.assertEquals(1, ArithmeticUtils.pow(21, 0l));
        __CLR4_4_12e822e82lb90pewe.R.inc(111972);try {
            __CLR4_4_12e822e82lb90pewe.R.inc(111973);ArithmeticUtils.pow(21, -7l);
            __CLR4_4_12e822e82lb90pewe.R.inc(111974);Assert.fail("Expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException e) {
            // expected behavior
        }

        __CLR4_4_12e822e82lb90pewe.R.inc(111975);Assert.assertEquals(1801088541l, ArithmeticUtils.pow(21l, 7));
        __CLR4_4_12e822e82lb90pewe.R.inc(111976);Assert.assertEquals(1l, ArithmeticUtils.pow(21l, 0));
        __CLR4_4_12e822e82lb90pewe.R.inc(111977);try {
            __CLR4_4_12e822e82lb90pewe.R.inc(111978);ArithmeticUtils.pow(21l, -7);
            __CLR4_4_12e822e82lb90pewe.R.inc(111979);Assert.fail("Expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException e) {
            // expected behavior
        }

        __CLR4_4_12e822e82lb90pewe.R.inc(111980);Assert.assertEquals(1801088541l, ArithmeticUtils.pow(21l, 7l));
        __CLR4_4_12e822e82lb90pewe.R.inc(111981);Assert.assertEquals(1l, ArithmeticUtils.pow(21l, 0l));
        __CLR4_4_12e822e82lb90pewe.R.inc(111982);try {
            __CLR4_4_12e822e82lb90pewe.R.inc(111983);ArithmeticUtils.pow(21l, -7l);
            __CLR4_4_12e822e82lb90pewe.R.inc(111984);Assert.fail("Expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException e) {
            // expected behavior
        }

        __CLR4_4_12e822e82lb90pewe.R.inc(111985);BigInteger twentyOne = BigInteger.valueOf(21l);
        __CLR4_4_12e822e82lb90pewe.R.inc(111986);Assert.assertEquals(BigInteger.valueOf(1801088541l), ArithmeticUtils.pow(twentyOne, 7));
        __CLR4_4_12e822e82lb90pewe.R.inc(111987);Assert.assertEquals(BigInteger.ONE, ArithmeticUtils.pow(twentyOne, 0));
        __CLR4_4_12e822e82lb90pewe.R.inc(111988);try {
            __CLR4_4_12e822e82lb90pewe.R.inc(111989);ArithmeticUtils.pow(twentyOne, -7);
            __CLR4_4_12e822e82lb90pewe.R.inc(111990);Assert.fail("Expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException e) {
            // expected behavior
        }

        __CLR4_4_12e822e82lb90pewe.R.inc(111991);Assert.assertEquals(BigInteger.valueOf(1801088541l), ArithmeticUtils.pow(twentyOne, 7l));
        __CLR4_4_12e822e82lb90pewe.R.inc(111992);Assert.assertEquals(BigInteger.ONE, ArithmeticUtils.pow(twentyOne, 0l));
        __CLR4_4_12e822e82lb90pewe.R.inc(111993);try {
            __CLR4_4_12e822e82lb90pewe.R.inc(111994);ArithmeticUtils.pow(twentyOne, -7l);
            __CLR4_4_12e822e82lb90pewe.R.inc(111995);Assert.fail("Expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException e) {
            // expected behavior
        }

        __CLR4_4_12e822e82lb90pewe.R.inc(111996);Assert.assertEquals(BigInteger.valueOf(1801088541l), ArithmeticUtils.pow(twentyOne, BigInteger.valueOf(7l)));
        __CLR4_4_12e822e82lb90pewe.R.inc(111997);Assert.assertEquals(BigInteger.ONE, ArithmeticUtils.pow(twentyOne, BigInteger.ZERO));
        __CLR4_4_12e822e82lb90pewe.R.inc(111998);try {
            __CLR4_4_12e822e82lb90pewe.R.inc(111999);ArithmeticUtils.pow(twentyOne, BigInteger.valueOf(-7l));
            __CLR4_4_12e822e82lb90pewe.R.inc(112000);Assert.fail("Expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException e) {
            // expected behavior
        }

        __CLR4_4_12e822e82lb90pewe.R.inc(112001);BigInteger bigOne =
            new BigInteger("1543786922199448028351389769265814882661837148" +
                           "4763915343722775611762713982220306372888519211" +
                           "560905579993523402015636025177602059044911261");
        __CLR4_4_12e822e82lb90pewe.R.inc(112002);Assert.assertEquals(bigOne, ArithmeticUtils.pow(twentyOne, 103));
        __CLR4_4_12e822e82lb90pewe.R.inc(112003);Assert.assertEquals(bigOne, ArithmeticUtils.pow(twentyOne, 103l));
        __CLR4_4_12e822e82lb90pewe.R.inc(112004);Assert.assertEquals(bigOne, ArithmeticUtils.pow(twentyOne, BigInteger.valueOf(103l)));

    }finally{__CLR4_4_12e822e82lb90pewe.R.flushNeeded();}}

    @Test
    public void testIsPowerOfTwo() {__CLR4_4_12e822e82lb90pewe.R.globalSliceStart(getClass().getName(),112005);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wqk0jx2ef9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12e822e82lb90pewe.R.rethrow($CLV_t2$);}finally{__CLR4_4_12e822e82lb90pewe.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.ArithmeticUtilsTest.testIsPowerOfTwo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112005,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wqk0jx2ef9(){try{__CLR4_4_12e822e82lb90pewe.R.inc(112005);
        __CLR4_4_12e822e82lb90pewe.R.inc(112006);final int n = 1025;
        __CLR4_4_12e822e82lb90pewe.R.inc(112007);final boolean[] expected = new boolean[n];
        __CLR4_4_12e822e82lb90pewe.R.inc(112008);Arrays.fill(expected, false);
        __CLR4_4_12e822e82lb90pewe.R.inc(112009);for (int i = 1; (((i < expected.length)&&(__CLR4_4_12e822e82lb90pewe.R.iget(112010)!=0|true))||(__CLR4_4_12e822e82lb90pewe.R.iget(112011)==0&false)); i *= 2) {{
            __CLR4_4_12e822e82lb90pewe.R.inc(112012);expected[i] = true;
        }
        }__CLR4_4_12e822e82lb90pewe.R.inc(112013);for (int i = 0; (((i < expected.length)&&(__CLR4_4_12e822e82lb90pewe.R.iget(112014)!=0|true))||(__CLR4_4_12e822e82lb90pewe.R.iget(112015)==0&false)); i++) {{
            __CLR4_4_12e822e82lb90pewe.R.inc(112016);final boolean actual = ArithmeticUtils.isPowerOfTwo(i);
            __CLR4_4_12e822e82lb90pewe.R.inc(112017);Assert.assertTrue(Integer.toString(i), actual == expected[i]);
        }
    }}finally{__CLR4_4_12e822e82lb90pewe.R.flushNeeded();}}

    private void testAddAndCheckLongFailure(long a, long b) {try{__CLR4_4_12e822e82lb90pewe.R.inc(112018);
        __CLR4_4_12e822e82lb90pewe.R.inc(112019);try {
            __CLR4_4_12e822e82lb90pewe.R.inc(112020);ArithmeticUtils.addAndCheck(a, b);
            __CLR4_4_12e822e82lb90pewe.R.inc(112021);Assert.fail("Expecting MathArithmeticException");
        } catch (MathArithmeticException ex) {
            // success
        }
    }finally{__CLR4_4_12e822e82lb90pewe.R.flushNeeded();}}

    private void testMulAndCheckLongFailure(long a, long b) {try{__CLR4_4_12e822e82lb90pewe.R.inc(112022);
        __CLR4_4_12e822e82lb90pewe.R.inc(112023);try {
            __CLR4_4_12e822e82lb90pewe.R.inc(112024);ArithmeticUtils.mulAndCheck(a, b);
            __CLR4_4_12e822e82lb90pewe.R.inc(112025);Assert.fail("Expecting MathArithmeticException");
        } catch (MathArithmeticException ex) {
            // success
        }
    }finally{__CLR4_4_12e822e82lb90pewe.R.flushNeeded();}}

    private void testSubAndCheckLongFailure(long a, long b) {try{__CLR4_4_12e822e82lb90pewe.R.inc(112026);
        __CLR4_4_12e822e82lb90pewe.R.inc(112027);try {
            __CLR4_4_12e822e82lb90pewe.R.inc(112028);ArithmeticUtils.subAndCheck(a, b);
            __CLR4_4_12e822e82lb90pewe.R.inc(112029);Assert.fail("Expecting MathArithmeticException");
        } catch (MathArithmeticException ex) {
            // success
        }
    }finally{__CLR4_4_12e822e82lb90pewe.R.flushNeeded();}}
}
