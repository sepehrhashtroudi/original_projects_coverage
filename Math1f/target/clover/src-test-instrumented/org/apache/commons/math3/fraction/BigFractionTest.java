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
package org.apache.commons.math3.fraction;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.exception.ConvergenceException;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.ZeroException;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;


public class BigFractionTest {static class __CLR4_4_11mv11mv1lb90pcmr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,76680,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private void assertFraction(int expectedNumerator, int expectedDenominator, BigFraction actual) {try{__CLR4_4_11mv11mv1lb90pcmr.R.inc(76285);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76286);Assert.assertEquals(expectedNumerator, actual.getNumeratorAsInt());
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76287);Assert.assertEquals(expectedDenominator, actual.getDenominatorAsInt());
    }finally{__CLR4_4_11mv11mv1lb90pcmr.R.flushNeeded();}}

    private void assertFraction(long expectedNumerator, long expectedDenominator, BigFraction actual) {try{__CLR4_4_11mv11mv1lb90pcmr.R.inc(76288);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76289);Assert.assertEquals(expectedNumerator, actual.getNumeratorAsLong());
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76290);Assert.assertEquals(expectedDenominator, actual.getDenominatorAsLong());
    }finally{__CLR4_4_11mv11mv1lb90pcmr.R.flushNeeded();}}

    @Test
    public void testConstructor() {__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceStart(getClass().getName(),76291);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uefs8h1mv7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mv11mv1lb90pcmr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionTest.testConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76291,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uefs8h1mv7(){try{__CLR4_4_11mv11mv1lb90pcmr.R.inc(76291);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76292);assertFraction(0, 1, new BigFraction(0, 1));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76293);assertFraction(0, 1, new BigFraction(0l, 2l));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76294);assertFraction(0, 1, new BigFraction(0, -1));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76295);assertFraction(1, 2, new BigFraction(1, 2));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76296);assertFraction(1, 2, new BigFraction(2, 4));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76297);assertFraction(-1, 2, new BigFraction(-1, 2));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76298);assertFraction(-1, 2, new BigFraction(1, -2));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76299);assertFraction(-1, 2, new BigFraction(-2, 4));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76300);assertFraction(-1, 2, new BigFraction(2, -4));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76301);assertFraction(11, 1, new BigFraction(11));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76302);assertFraction(11, 1, new BigFraction(11l));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76303);assertFraction(11, 1, new BigFraction(new BigInteger("11")));

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76304);assertFraction(0, 1, new BigFraction(0.00000000000001, 1.0e-5, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76305);assertFraction(2, 5, new BigFraction(0.40000000000001, 1.0e-5, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76306);assertFraction(15, 1, new BigFraction(15.0000000000001, 1.0e-5, 100));

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76307);Assert.assertEquals(0.00000000000001, new BigFraction(0.00000000000001).doubleValue(), 0.0);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76308);Assert.assertEquals(0.40000000000001, new BigFraction(0.40000000000001).doubleValue(), 0.0);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76309);Assert.assertEquals(15.0000000000001, new BigFraction(15.0000000000001).doubleValue(), 0.0);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76310);assertFraction(3602879701896487l, 9007199254740992l, new BigFraction(0.40000000000001));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76311);assertFraction(1055531162664967l, 70368744177664l, new BigFraction(15.0000000000001));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76312);try {
            __CLR4_4_11mv11mv1lb90pcmr.R.inc(76313);new BigFraction(null, BigInteger.ONE);
            __CLR4_4_11mv11mv1lb90pcmr.R.inc(76314);Assert.fail("Expecting NullArgumentException");
        } catch (NullArgumentException npe) {
            // expected
        }
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76315);try {
            __CLR4_4_11mv11mv1lb90pcmr.R.inc(76316);new BigFraction(BigInteger.ONE, null);
            __CLR4_4_11mv11mv1lb90pcmr.R.inc(76317);Assert.fail("Expecting NullArgumentException");
        } catch (NullArgumentException npe) {
            // expected
        }
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76318);try {
            __CLR4_4_11mv11mv1lb90pcmr.R.inc(76319);new BigFraction(BigInteger.ONE, BigInteger.ZERO);
            __CLR4_4_11mv11mv1lb90pcmr.R.inc(76320);Assert.fail("Expecting ZeroException");
        } catch (ZeroException npe) {
            // expected
        }
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76321);try {
            __CLR4_4_11mv11mv1lb90pcmr.R.inc(76322);new BigFraction(2.0 * Integer.MAX_VALUE, 1.0e-5, 100000);
            __CLR4_4_11mv11mv1lb90pcmr.R.inc(76323);Assert.fail("Expecting FractionConversionException");
        } catch (FractionConversionException fce) {
            // expected
        }
    }finally{__CLR4_4_11mv11mv1lb90pcmr.R.flushNeeded();}}

    @Test(expected=ConvergenceException.class)
    public void testGoldenRatio() {__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceStart(getClass().getName(),76324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14uewq11mw4();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,111,108,100,101,110,82,97,116,105,111,58,32,91,67,111,110,118,101,114,103,101,110,99,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof ConvergenceException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mv11mv1lb90pcmr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionTest.testGoldenRatio",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76324,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14uewq11mw4(){try{__CLR4_4_11mv11mv1lb90pcmr.R.inc(76324);
        // the golden ratio is notoriously a difficult number for continuous fraction
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76325);new BigFraction((1 + FastMath.sqrt(5)) / 2, 1.0e-12, 25);
    }finally{__CLR4_4_11mv11mv1lb90pcmr.R.flushNeeded();}}

    // MATH-179
    @Test
    public void testDoubleConstructor() throws ConvergenceException {__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceStart(getClass().getName(),76326);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m2qfz21mw6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mv11mv1lb90pcmr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionTest.testDoubleConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76326,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m2qfz21mw6() throws ConvergenceException{try{__CLR4_4_11mv11mv1lb90pcmr.R.inc(76326);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76327);assertFraction(1, 2, new BigFraction((double) 1 / (double) 2, 1.0e-5, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76328);assertFraction(1, 3, new BigFraction((double) 1 / (double) 3, 1.0e-5, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76329);assertFraction(2, 3, new BigFraction((double) 2 / (double) 3, 1.0e-5, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76330);assertFraction(1, 4, new BigFraction((double) 1 / (double) 4, 1.0e-5, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76331);assertFraction(3, 4, new BigFraction((double) 3 / (double) 4, 1.0e-5, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76332);assertFraction(1, 5, new BigFraction((double) 1 / (double) 5, 1.0e-5, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76333);assertFraction(2, 5, new BigFraction((double) 2 / (double) 5, 1.0e-5, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76334);assertFraction(3, 5, new BigFraction((double) 3 / (double) 5, 1.0e-5, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76335);assertFraction(4, 5, new BigFraction((double) 4 / (double) 5, 1.0e-5, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76336);assertFraction(1, 6, new BigFraction((double) 1 / (double) 6, 1.0e-5, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76337);assertFraction(5, 6, new BigFraction((double) 5 / (double) 6, 1.0e-5, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76338);assertFraction(1, 7, new BigFraction((double) 1 / (double) 7, 1.0e-5, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76339);assertFraction(2, 7, new BigFraction((double) 2 / (double) 7, 1.0e-5, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76340);assertFraction(3, 7, new BigFraction((double) 3 / (double) 7, 1.0e-5, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76341);assertFraction(4, 7, new BigFraction((double) 4 / (double) 7, 1.0e-5, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76342);assertFraction(5, 7, new BigFraction((double) 5 / (double) 7, 1.0e-5, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76343);assertFraction(6, 7, new BigFraction((double) 6 / (double) 7, 1.0e-5, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76344);assertFraction(1, 8, new BigFraction((double) 1 / (double) 8, 1.0e-5, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76345);assertFraction(3, 8, new BigFraction((double) 3 / (double) 8, 1.0e-5, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76346);assertFraction(5, 8, new BigFraction((double) 5 / (double) 8, 1.0e-5, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76347);assertFraction(7, 8, new BigFraction((double) 7 / (double) 8, 1.0e-5, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76348);assertFraction(1, 9, new BigFraction((double) 1 / (double) 9, 1.0e-5, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76349);assertFraction(2, 9, new BigFraction((double) 2 / (double) 9, 1.0e-5, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76350);assertFraction(4, 9, new BigFraction((double) 4 / (double) 9, 1.0e-5, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76351);assertFraction(5, 9, new BigFraction((double) 5 / (double) 9, 1.0e-5, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76352);assertFraction(7, 9, new BigFraction((double) 7 / (double) 9, 1.0e-5, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76353);assertFraction(8, 9, new BigFraction((double) 8 / (double) 9, 1.0e-5, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76354);assertFraction(1, 10, new BigFraction((double) 1 / (double) 10, 1.0e-5, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76355);assertFraction(3, 10, new BigFraction((double) 3 / (double) 10, 1.0e-5, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76356);assertFraction(7, 10, new BigFraction((double) 7 / (double) 10, 1.0e-5, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76357);assertFraction(9, 10, new BigFraction((double) 9 / (double) 10, 1.0e-5, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76358);assertFraction(1, 11, new BigFraction((double) 1 / (double) 11, 1.0e-5, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76359);assertFraction(2, 11, new BigFraction((double) 2 / (double) 11, 1.0e-5, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76360);assertFraction(3, 11, new BigFraction((double) 3 / (double) 11, 1.0e-5, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76361);assertFraction(4, 11, new BigFraction((double) 4 / (double) 11, 1.0e-5, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76362);assertFraction(5, 11, new BigFraction((double) 5 / (double) 11, 1.0e-5, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76363);assertFraction(6, 11, new BigFraction((double) 6 / (double) 11, 1.0e-5, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76364);assertFraction(7, 11, new BigFraction((double) 7 / (double) 11, 1.0e-5, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76365);assertFraction(8, 11, new BigFraction((double) 8 / (double) 11, 1.0e-5, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76366);assertFraction(9, 11, new BigFraction((double) 9 / (double) 11, 1.0e-5, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76367);assertFraction(10, 11, new BigFraction((double) 10 / (double) 11, 1.0e-5, 100));
    }finally{__CLR4_4_11mv11mv1lb90pcmr.R.flushNeeded();}}

    // MATH-181
    @Test
    public void testDigitLimitConstructor() throws ConvergenceException {__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceStart(getClass().getName(),76368);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iy40671mxc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mv11mv1lb90pcmr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionTest.testDigitLimitConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76368,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iy40671mxc() throws ConvergenceException{try{__CLR4_4_11mv11mv1lb90pcmr.R.inc(76368);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76369);assertFraction(2, 5, new BigFraction(0.4, 9));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76370);assertFraction(2, 5, new BigFraction(0.4, 99));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76371);assertFraction(2, 5, new BigFraction(0.4, 999));

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76372);assertFraction(3, 5, new BigFraction(0.6152, 9));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76373);assertFraction(8, 13, new BigFraction(0.6152, 99));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76374);assertFraction(510, 829, new BigFraction(0.6152, 999));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76375);assertFraction(769, 1250, new BigFraction(0.6152, 9999));
        
        // MATH-996
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76376);assertFraction(1, 2, new BigFraction(0.5000000001, 10));
    }finally{__CLR4_4_11mv11mv1lb90pcmr.R.flushNeeded();}}

    @Test
    public void testEpsilonLimitConstructor() throws ConvergenceException {__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceStart(getClass().getName(),76377);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11bghmm1mxl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mv11mv1lb90pcmr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionTest.testEpsilonLimitConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76377,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11bghmm1mxl() throws ConvergenceException{try{__CLR4_4_11mv11mv1lb90pcmr.R.inc(76377);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76378);assertFraction(2, 5, new BigFraction(0.4, 1.0e-5, 100));

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76379);assertFraction(3, 5, new BigFraction(0.6152, 0.02, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76380);assertFraction(8, 13, new BigFraction(0.6152, 1.0e-3, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76381);assertFraction(251, 408, new BigFraction(0.6152, 1.0e-4, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76382);assertFraction(251, 408, new BigFraction(0.6152, 1.0e-5, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76383);assertFraction(510, 829, new BigFraction(0.6152, 1.0e-6, 100));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76384);assertFraction(769, 1250, new BigFraction(0.6152, 1.0e-7, 100));
    }finally{__CLR4_4_11mv11mv1lb90pcmr.R.flushNeeded();}}

    @Test
    public void testCompareTo() {__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceStart(getClass().getName(),76385);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pz6vfv1mxt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mv11mv1lb90pcmr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionTest.testCompareTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76385,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pz6vfv1mxt(){try{__CLR4_4_11mv11mv1lb90pcmr.R.inc(76385);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76386);BigFraction first = new BigFraction(1, 2);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76387);BigFraction second = new BigFraction(1, 3);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76388);BigFraction third = new BigFraction(1, 2);

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76389);Assert.assertEquals(0, first.compareTo(first));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76390);Assert.assertEquals(0, first.compareTo(third));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76391);Assert.assertEquals(1, first.compareTo(second));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76392);Assert.assertEquals(-1, second.compareTo(first));

        // these two values are different approximations of PI
        // the first  one is approximately PI - 3.07e-18
        // the second one is approximately PI + 1.936e-17
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76393);BigFraction pi1 = new BigFraction(1068966896, 340262731);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76394);BigFraction pi2 = new BigFraction( 411557987, 131002976);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76395);Assert.assertEquals(-1, pi1.compareTo(pi2));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76396);Assert.assertEquals( 1, pi2.compareTo(pi1));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76397);Assert.assertEquals(0.0, pi1.doubleValue() - pi2.doubleValue(), 1.0e-20);

    }finally{__CLR4_4_11mv11mv1lb90pcmr.R.flushNeeded();}}

    @Test
    public void testDoubleValue() {__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceStart(getClass().getName(),76398);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q6zy2z1my6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mv11mv1lb90pcmr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionTest.testDoubleValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76398,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q6zy2z1my6(){try{__CLR4_4_11mv11mv1lb90pcmr.R.inc(76398);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76399);BigFraction first = new BigFraction(1, 2);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76400);BigFraction second = new BigFraction(1, 3);

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76401);Assert.assertEquals(0.5, first.doubleValue(), 0.0);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76402);Assert.assertEquals(1.0 / 3.0, second.doubleValue(), 0.0);
    }finally{__CLR4_4_11mv11mv1lb90pcmr.R.flushNeeded();}}

    // MATH-744
    @Test
    public void testDoubleValueForLargeNumeratorAndDenominator() {__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceStart(getClass().getName(),76403);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bpzjrz1myb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mv11mv1lb90pcmr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionTest.testDoubleValueForLargeNumeratorAndDenominator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76403,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bpzjrz1myb(){try{__CLR4_4_11mv11mv1lb90pcmr.R.inc(76403);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76404);final BigInteger pow400 = BigInteger.TEN.pow(400);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76405);final BigInteger pow401 = BigInteger.TEN.pow(401);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76406);final BigInteger two = new BigInteger("2");
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76407);final BigFraction large = new BigFraction(pow401.add(BigInteger.ONE),
                                                  pow400.multiply(two));

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76408);Assert.assertEquals(5, large.doubleValue(), 1e-15);
    }finally{__CLR4_4_11mv11mv1lb90pcmr.R.flushNeeded();}}

    // MATH-744
    @Test
    public void testFloatValueForLargeNumeratorAndDenominator() {__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceStart(getClass().getName(),76409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x2u3yy1myh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mv11mv1lb90pcmr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionTest.testFloatValueForLargeNumeratorAndDenominator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76409,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x2u3yy1myh(){try{__CLR4_4_11mv11mv1lb90pcmr.R.inc(76409);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76410);final BigInteger pow400 = BigInteger.TEN.pow(400);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76411);final BigInteger pow401 = BigInteger.TEN.pow(401);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76412);final BigInteger two = new BigInteger("2");
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76413);final BigFraction large = new BigFraction(pow401.add(BigInteger.ONE),
                                                  pow400.multiply(two));

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76414);Assert.assertEquals(5, large.floatValue(), 1e-15);
    }finally{__CLR4_4_11mv11mv1lb90pcmr.R.flushNeeded();}}

    @Test
    public void testFloatValue() {__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceStart(getClass().getName(),76415);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qbbche1myn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mv11mv1lb90pcmr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionTest.testFloatValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76415,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qbbche1myn(){try{__CLR4_4_11mv11mv1lb90pcmr.R.inc(76415);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76416);BigFraction first = new BigFraction(1, 2);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76417);BigFraction second = new BigFraction(1, 3);

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76418);Assert.assertEquals(0.5f, first.floatValue(), 0.0f);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76419);Assert.assertEquals((float) (1.0 / 3.0), second.floatValue(), 0.0f);
    }finally{__CLR4_4_11mv11mv1lb90pcmr.R.flushNeeded();}}

    @Test
    public void testIntValue() {__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceStart(getClass().getName(),76420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14vlmpn1mys();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mv11mv1lb90pcmr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionTest.testIntValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76420,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14vlmpn1mys(){try{__CLR4_4_11mv11mv1lb90pcmr.R.inc(76420);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76421);BigFraction first = new BigFraction(1, 2);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76422);BigFraction second = new BigFraction(3, 2);

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76423);Assert.assertEquals(0, first.intValue());
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76424);Assert.assertEquals(1, second.intValue());
    }finally{__CLR4_4_11mv11mv1lb90pcmr.R.flushNeeded();}}

    @Test
    public void testLongValue() {__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceStart(getClass().getName(),76425);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mfkegm1myx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mv11mv1lb90pcmr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionTest.testLongValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76425,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mfkegm1myx(){try{__CLR4_4_11mv11mv1lb90pcmr.R.inc(76425);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76426);BigFraction first = new BigFraction(1, 2);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76427);BigFraction second = new BigFraction(3, 2);

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76428);Assert.assertEquals(0L, first.longValue());
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76429);Assert.assertEquals(1L, second.longValue());
    }finally{__CLR4_4_11mv11mv1lb90pcmr.R.flushNeeded();}}

    @Test
    public void testConstructorDouble() {__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceStart(getClass().getName(),76430);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1re3jkw1mz2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mv11mv1lb90pcmr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionTest.testConstructorDouble",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76430,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1re3jkw1mz2(){try{__CLR4_4_11mv11mv1lb90pcmr.R.inc(76430);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76431);assertFraction(1, 2, new BigFraction(0.5));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76432);assertFraction(6004799503160661l, 18014398509481984l, new BigFraction(1.0 / 3.0));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76433);assertFraction(6124895493223875l, 36028797018963968l, new BigFraction(17.0 / 100.0));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76434);assertFraction(1784551352345559l, 562949953421312l, new BigFraction(317.0 / 100.0));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76435);assertFraction(-1, 2, new BigFraction(-0.5));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76436);assertFraction(-6004799503160661l, 18014398509481984l, new BigFraction(-1.0 / 3.0));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76437);assertFraction(-6124895493223875l, 36028797018963968l, new BigFraction(17.0 / -100.0));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76438);assertFraction(-1784551352345559l, 562949953421312l, new BigFraction(-317.0 / 100.0));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76439);for (double v : new double[] { Double.NaN, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY}) {{
            __CLR4_4_11mv11mv1lb90pcmr.R.inc(76440);try {
                __CLR4_4_11mv11mv1lb90pcmr.R.inc(76441);new BigFraction(v);
                __CLR4_4_11mv11mv1lb90pcmr.R.inc(76442);Assert.fail("Expecting IllegalArgumentException");
            } catch (IllegalArgumentException iae) {
                // expected
            }
        }
        }__CLR4_4_11mv11mv1lb90pcmr.R.inc(76443);Assert.assertEquals(1l, new BigFraction(Double.MAX_VALUE).getDenominatorAsLong());
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76444);Assert.assertEquals(1l, new BigFraction(Double.longBitsToDouble(0x0010000000000000L)).getNumeratorAsLong());
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76445);Assert.assertEquals(1l, new BigFraction(Double.MIN_VALUE).getNumeratorAsLong());
    }finally{__CLR4_4_11mv11mv1lb90pcmr.R.flushNeeded();}}

    @Test
    public void testAbs() {__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceStart(getClass().getName(),76446);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l56wuf1mzi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mv11mv1lb90pcmr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionTest.testAbs",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76446,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l56wuf1mzi(){try{__CLR4_4_11mv11mv1lb90pcmr.R.inc(76446);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76447);BigFraction a = new BigFraction(10, 21);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76448);BigFraction b = new BigFraction(-10, 21);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76449);BigFraction c = new BigFraction(10, -21);

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76450);assertFraction(10, 21, a.abs());
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76451);assertFraction(10, 21, b.abs());
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76452);assertFraction(10, 21, c.abs());
    }finally{__CLR4_4_11mv11mv1lb90pcmr.R.flushNeeded();}}

    @Test
    public void testReciprocal() {__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceStart(getClass().getName(),76453);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11r5n8t1mzp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mv11mv1lb90pcmr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionTest.testReciprocal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76453,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11r5n8t1mzp(){try{__CLR4_4_11mv11mv1lb90pcmr.R.inc(76453);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76454);BigFraction f = null;

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76455);f = new BigFraction(50, 75);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76456);f = f.reciprocal();
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76457);Assert.assertEquals(3, f.getNumeratorAsInt());
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76458);Assert.assertEquals(2, f.getDenominatorAsInt());

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76459);f = new BigFraction(4, 3);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76460);f = f.reciprocal();
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76461);Assert.assertEquals(3, f.getNumeratorAsInt());
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76462);Assert.assertEquals(4, f.getDenominatorAsInt());

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76463);f = new BigFraction(-15, 47);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76464);f = f.reciprocal();
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76465);Assert.assertEquals(-47, f.getNumeratorAsInt());
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76466);Assert.assertEquals(15, f.getDenominatorAsInt());

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76467);f = new BigFraction(0, 3);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76468);try {
            __CLR4_4_11mv11mv1lb90pcmr.R.inc(76469);f = f.reciprocal();
            __CLR4_4_11mv11mv1lb90pcmr.R.inc(76470);Assert.fail("expecting ZeroException");
        } catch (ZeroException ex) {
        }

        // large values
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76471);f = new BigFraction(Integer.MAX_VALUE, 1);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76472);f = f.reciprocal();
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76473);Assert.assertEquals(1, f.getNumeratorAsInt());
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76474);Assert.assertEquals(Integer.MAX_VALUE, f.getDenominatorAsInt());
    }finally{__CLR4_4_11mv11mv1lb90pcmr.R.flushNeeded();}}

    @Test
    public void testNegate() {__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceStart(getClass().getName(),76475);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ffqfwl1n0b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mv11mv1lb90pcmr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionTest.testNegate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76475,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ffqfwl1n0b(){try{__CLR4_4_11mv11mv1lb90pcmr.R.inc(76475);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76476);BigFraction f = null;

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76477);f = new BigFraction(50, 75);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76478);f = f.negate();
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76479);Assert.assertEquals(-2, f.getNumeratorAsInt());
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76480);Assert.assertEquals(3, f.getDenominatorAsInt());

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76481);f = new BigFraction(-50, 75);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76482);f = f.negate();
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76483);Assert.assertEquals(2, f.getNumeratorAsInt());
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76484);Assert.assertEquals(3, f.getDenominatorAsInt());

        // large values
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76485);f = new BigFraction(Integer.MAX_VALUE - 1, Integer.MAX_VALUE);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76486);f = f.negate();
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76487);Assert.assertEquals(Integer.MIN_VALUE + 2, f.getNumeratorAsInt());
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76488);Assert.assertEquals(Integer.MAX_VALUE, f.getDenominatorAsInt());

    }finally{__CLR4_4_11mv11mv1lb90pcmr.R.flushNeeded();}}

    @Test
    public void testAdd() {__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceStart(getClass().getName(),76489);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vtx82e1n0p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mv11mv1lb90pcmr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionTest.testAdd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76489,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vtx82e1n0p(){try{__CLR4_4_11mv11mv1lb90pcmr.R.inc(76489);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76490);BigFraction a = new BigFraction(1, 2);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76491);BigFraction b = new BigFraction(2, 3);

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76492);assertFraction(1, 1, a.add(a));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76493);assertFraction(7, 6, a.add(b));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76494);assertFraction(7, 6, b.add(a));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76495);assertFraction(4, 3, b.add(b));

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76496);BigFraction f1 = new BigFraction(Integer.MAX_VALUE - 1, 1);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76497);BigFraction f2 = BigFraction.ONE;
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76498);BigFraction f = f1.add(f2);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76499);Assert.assertEquals(Integer.MAX_VALUE, f.getNumeratorAsInt());
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76500);Assert.assertEquals(1, f.getDenominatorAsInt());

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76501);f1 = new BigFraction(-1, 13 * 13 * 2 * 2);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76502);f2 = new BigFraction(-2, 13 * 17 * 2);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76503);f = f1.add(f2);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76504);Assert.assertEquals(13 * 13 * 17 * 2 * 2, f.getDenominatorAsInt());
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76505);Assert.assertEquals(-17 - 2 * 13 * 2, f.getNumeratorAsInt());

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76506);try {
            __CLR4_4_11mv11mv1lb90pcmr.R.inc(76507);f.add((BigFraction) null);
            __CLR4_4_11mv11mv1lb90pcmr.R.inc(76508);Assert.fail("expecting NullArgumentException");
        } catch (NullArgumentException ex) {
        }

        // if this fraction is added naively, it will overflow.
        // check that it doesn't.
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76509);f1 = new BigFraction(1, 32768 * 3);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76510);f2 = new BigFraction(1, 59049);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76511);f = f1.add(f2);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76512);Assert.assertEquals(52451, f.getNumeratorAsInt());
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76513);Assert.assertEquals(1934917632, f.getDenominatorAsInt());

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76514);f1 = new BigFraction(Integer.MIN_VALUE, 3);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76515);f2 = new BigFraction(1, 3);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76516);f = f1.add(f2);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76517);Assert.assertEquals(Integer.MIN_VALUE + 1, f.getNumeratorAsInt());
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76518);Assert.assertEquals(3, f.getDenominatorAsInt());

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76519);f1 = new BigFraction(Integer.MAX_VALUE - 1, 1);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76520);f = f1.add(BigInteger.ONE);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76521);Assert.assertEquals(Integer.MAX_VALUE, f.getNumeratorAsInt());
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76522);Assert.assertEquals(1, f.getDenominatorAsInt());

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76523);f = f.add(BigInteger.ZERO);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76524);Assert.assertEquals(Integer.MAX_VALUE, f.getNumeratorAsInt());
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76525);Assert.assertEquals(1, f.getDenominatorAsInt());

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76526);f1 = new BigFraction(Integer.MAX_VALUE - 1, 1);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76527);f = f1.add(1);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76528);Assert.assertEquals(Integer.MAX_VALUE, f.getNumeratorAsInt());
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76529);Assert.assertEquals(1, f.getDenominatorAsInt());

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76530);f = f.add(0);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76531);Assert.assertEquals(Integer.MAX_VALUE, f.getNumeratorAsInt());
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76532);Assert.assertEquals(1, f.getDenominatorAsInt());

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76533);f1 = new BigFraction(Integer.MAX_VALUE - 1, 1);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76534);f = f1.add(1l);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76535);Assert.assertEquals(Integer.MAX_VALUE, f.getNumeratorAsInt());
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76536);Assert.assertEquals(1, f.getDenominatorAsInt());

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76537);f = f.add(0l);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76538);Assert.assertEquals(Integer.MAX_VALUE, f.getNumeratorAsInt());
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76539);Assert.assertEquals(1, f.getDenominatorAsInt());

    }finally{__CLR4_4_11mv11mv1lb90pcmr.R.flushNeeded();}}

    @Test
    public void testDivide() {__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceStart(getClass().getName(),76540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ae8h2m1n24();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mv11mv1lb90pcmr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionTest.testDivide",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76540,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ae8h2m1n24(){try{__CLR4_4_11mv11mv1lb90pcmr.R.inc(76540);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76541);BigFraction a = new BigFraction(1, 2);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76542);BigFraction b = new BigFraction(2, 3);

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76543);assertFraction(1, 1, a.divide(a));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76544);assertFraction(3, 4, a.divide(b));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76545);assertFraction(4, 3, b.divide(a));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76546);assertFraction(1, 1, b.divide(b));

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76547);BigFraction f1 = new BigFraction(3, 5);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76548);BigFraction f2 = BigFraction.ZERO;
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76549);try {
            __CLR4_4_11mv11mv1lb90pcmr.R.inc(76550);f1.divide(f2);
            __CLR4_4_11mv11mv1lb90pcmr.R.inc(76551);Assert.fail("expecting MathArithmeticException");
        } catch (MathArithmeticException ex) {
        }

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76552);f1 = new BigFraction(0, 5);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76553);f2 = new BigFraction(2, 7);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76554);BigFraction f = f1.divide(f2);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76555);Assert.assertSame(BigFraction.ZERO, f);

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76556);f1 = new BigFraction(2, 7);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76557);f2 = BigFraction.ONE;
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76558);f = f1.divide(f2);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76559);Assert.assertEquals(2, f.getNumeratorAsInt());
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76560);Assert.assertEquals(7, f.getDenominatorAsInt());

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76561);f1 = new BigFraction(1, Integer.MAX_VALUE);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76562);f = f1.divide(f1);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76563);Assert.assertEquals(1, f.getNumeratorAsInt());
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76564);Assert.assertEquals(1, f.getDenominatorAsInt());

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76565);f1 = new BigFraction(Integer.MIN_VALUE, Integer.MAX_VALUE);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76566);f2 = new BigFraction(1, Integer.MAX_VALUE);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76567);f = f1.divide(f2);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76568);Assert.assertEquals(Integer.MIN_VALUE, f.getNumeratorAsInt());
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76569);Assert.assertEquals(1, f.getDenominatorAsInt());

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76570);try {
            __CLR4_4_11mv11mv1lb90pcmr.R.inc(76571);f.divide((BigFraction) null);
            __CLR4_4_11mv11mv1lb90pcmr.R.inc(76572);Assert.fail("expecting NullArgumentException");
        } catch (NullArgumentException ex) {
        }

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76573);f1 = new BigFraction(Integer.MIN_VALUE, Integer.MAX_VALUE);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76574);f = f1.divide(BigInteger.valueOf(Integer.MIN_VALUE));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76575);Assert.assertEquals(Integer.MAX_VALUE, f.getDenominatorAsInt());
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76576);Assert.assertEquals(1, f.getNumeratorAsInt());

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76577);f1 = new BigFraction(Integer.MIN_VALUE, Integer.MAX_VALUE);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76578);f = f1.divide(Integer.MIN_VALUE);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76579);Assert.assertEquals(Integer.MAX_VALUE, f.getDenominatorAsInt());
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76580);Assert.assertEquals(1, f.getNumeratorAsInt());

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76581);f1 = new BigFraction(Integer.MIN_VALUE, Integer.MAX_VALUE);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76582);f = f1.divide((long) Integer.MIN_VALUE);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76583);Assert.assertEquals(Integer.MAX_VALUE, f.getDenominatorAsInt());
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76584);Assert.assertEquals(1, f.getNumeratorAsInt());

    }finally{__CLR4_4_11mv11mv1lb90pcmr.R.flushNeeded();}}

    @Test
    public void testMultiply() {__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceStart(getClass().getName(),76585);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vkd1nn1n3d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mv11mv1lb90pcmr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionTest.testMultiply",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76585,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vkd1nn1n3d(){try{__CLR4_4_11mv11mv1lb90pcmr.R.inc(76585);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76586);BigFraction a = new BigFraction(1, 2);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76587);BigFraction b = new BigFraction(2, 3);

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76588);assertFraction(1, 4, a.multiply(a));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76589);assertFraction(1, 3, a.multiply(b));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76590);assertFraction(1, 3, b.multiply(a));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76591);assertFraction(4, 9, b.multiply(b));

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76592);BigFraction f1 = new BigFraction(Integer.MAX_VALUE, 1);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76593);BigFraction f2 = new BigFraction(Integer.MIN_VALUE, Integer.MAX_VALUE);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76594);BigFraction f = f1.multiply(f2);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76595);Assert.assertEquals(Integer.MIN_VALUE, f.getNumeratorAsInt());
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76596);Assert.assertEquals(1, f.getDenominatorAsInt());

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76597);f = f2.multiply(Integer.MAX_VALUE);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76598);Assert.assertEquals(Integer.MIN_VALUE, f.getNumeratorAsInt());
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76599);Assert.assertEquals(1, f.getDenominatorAsInt());

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76600);f = f2.multiply((long) Integer.MAX_VALUE);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76601);Assert.assertEquals(Integer.MIN_VALUE, f.getNumeratorAsInt());
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76602);Assert.assertEquals(1, f.getDenominatorAsInt());

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76603);try {
            __CLR4_4_11mv11mv1lb90pcmr.R.inc(76604);f.multiply((BigFraction) null);
            __CLR4_4_11mv11mv1lb90pcmr.R.inc(76605);Assert.fail("expecting NullArgumentException");
        } catch (NullArgumentException ex) {
        }

    }finally{__CLR4_4_11mv11mv1lb90pcmr.R.flushNeeded();}}

    @Test
    public void testSubtract() {__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceStart(getClass().getName(),76606);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hib6tp1n3y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mv11mv1lb90pcmr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionTest.testSubtract",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76606,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hib6tp1n3y(){try{__CLR4_4_11mv11mv1lb90pcmr.R.inc(76606);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76607);BigFraction a = new BigFraction(1, 2);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76608);BigFraction b = new BigFraction(2, 3);

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76609);assertFraction(0, 1, a.subtract(a));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76610);assertFraction(-1, 6, a.subtract(b));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76611);assertFraction(1, 6, b.subtract(a));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76612);assertFraction(0, 1, b.subtract(b));

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76613);BigFraction f = new BigFraction(1, 1);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76614);try {
            __CLR4_4_11mv11mv1lb90pcmr.R.inc(76615);f.subtract((BigFraction) null);
            __CLR4_4_11mv11mv1lb90pcmr.R.inc(76616);Assert.fail("expecting NullArgumentException");
        } catch (NullArgumentException ex) {
        }

        // if this fraction is subtracted naively, it will overflow.
        // check that it doesn't.
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76617);BigFraction f1 = new BigFraction(1, 32768 * 3);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76618);BigFraction f2 = new BigFraction(1, 59049);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76619);f = f1.subtract(f2);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76620);Assert.assertEquals(-13085, f.getNumeratorAsInt());
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76621);Assert.assertEquals(1934917632, f.getDenominatorAsInt());

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76622);f1 = new BigFraction(Integer.MIN_VALUE, 3);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76623);f2 = new BigFraction(1, 3).negate();
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76624);f = f1.subtract(f2);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76625);Assert.assertEquals(Integer.MIN_VALUE + 1, f.getNumeratorAsInt());
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76626);Assert.assertEquals(3, f.getDenominatorAsInt());

        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76627);f1 = new BigFraction(Integer.MAX_VALUE, 1);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76628);f2 = BigFraction.ONE;
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76629);f = f1.subtract(f2);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76630);Assert.assertEquals(Integer.MAX_VALUE - 1, f.getNumeratorAsInt());
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76631);Assert.assertEquals(1, f.getDenominatorAsInt());

    }finally{__CLR4_4_11mv11mv1lb90pcmr.R.flushNeeded();}}

    @Test
    public void testBigDecimalValue() {__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceStart(getClass().getName(),76632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nx3wyz1n4o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mv11mv1lb90pcmr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionTest.testBigDecimalValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76632,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nx3wyz1n4o(){try{__CLR4_4_11mv11mv1lb90pcmr.R.inc(76632);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76633);Assert.assertEquals(new BigDecimal(0.5), new BigFraction(1, 2).bigDecimalValue());
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76634);Assert.assertEquals(new BigDecimal("0.0003"), new BigFraction(3, 10000).bigDecimalValue());
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76635);Assert.assertEquals(new BigDecimal("0"), new BigFraction(1, 3).bigDecimalValue(BigDecimal.ROUND_DOWN));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76636);Assert.assertEquals(new BigDecimal("0.333"), new BigFraction(1, 3).bigDecimalValue(3, BigDecimal.ROUND_DOWN));
    }finally{__CLR4_4_11mv11mv1lb90pcmr.R.flushNeeded();}}

    @Test
    public void testEqualsAndHashCode() {__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceStart(getClass().getName(),76637);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o4n4w81n4t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mv11mv1lb90pcmr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionTest.testEqualsAndHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76637,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o4n4w81n4t(){try{__CLR4_4_11mv11mv1lb90pcmr.R.inc(76637);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76638);BigFraction zero = new BigFraction(0, 1);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76639);BigFraction nullFraction = null;
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76640);Assert.assertTrue(zero.equals(zero));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76641);Assert.assertFalse(zero.equals(nullFraction));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76642);Assert.assertFalse(zero.equals(Double.valueOf(0)));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76643);BigFraction zero2 = new BigFraction(0, 2);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76644);Assert.assertTrue(zero.equals(zero2));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76645);Assert.assertEquals(zero.hashCode(), zero2.hashCode());
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76646);BigFraction one = new BigFraction(1, 1);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76647);Assert.assertFalse((one.equals(zero) || zero.equals(one)));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76648);Assert.assertTrue(one.equals(BigFraction.ONE));
    }finally{__CLR4_4_11mv11mv1lb90pcmr.R.flushNeeded();}}

    @Test
    public void testGetReducedFraction() {__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceStart(getClass().getName(),76649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f04h251n55();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mv11mv1lb90pcmr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionTest.testGetReducedFraction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76649,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f04h251n55(){try{__CLR4_4_11mv11mv1lb90pcmr.R.inc(76649);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76650);BigFraction threeFourths = new BigFraction(3, 4);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76651);Assert.assertTrue(threeFourths.equals(BigFraction.getReducedFraction(6, 8)));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76652);Assert.assertTrue(BigFraction.ZERO.equals(BigFraction.getReducedFraction(0, -1)));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76653);try {
            __CLR4_4_11mv11mv1lb90pcmr.R.inc(76654);BigFraction.getReducedFraction(1, 0);
            __CLR4_4_11mv11mv1lb90pcmr.R.inc(76655);Assert.fail("expecting ZeroException");
        } catch (ZeroException ex) {
            // expected
        }
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76656);Assert.assertEquals(BigFraction.getReducedFraction(2, Integer.MIN_VALUE).getNumeratorAsInt(), -1);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76657);Assert.assertEquals(BigFraction.getReducedFraction(1, -1).getNumeratorAsInt(), -1);
    }finally{__CLR4_4_11mv11mv1lb90pcmr.R.flushNeeded();}}

    @Test
    public void testPercentage() {__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceStart(getClass().getName(),76658);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18u2ykz1n5e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mv11mv1lb90pcmr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionTest.testPercentage",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76658,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18u2ykz1n5e(){try{__CLR4_4_11mv11mv1lb90pcmr.R.inc(76658);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76659);Assert.assertEquals(50.0, new BigFraction(1, 2).percentageValue(), 1.0e-15);
    }finally{__CLR4_4_11mv11mv1lb90pcmr.R.flushNeeded();}}

    @Test
    public void testPow() {__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceStart(getClass().getName(),76660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xazw8d1n5g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mv11mv1lb90pcmr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionTest.testPow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76660,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xazw8d1n5g(){try{__CLR4_4_11mv11mv1lb90pcmr.R.inc(76660);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76661);Assert.assertEquals(new BigFraction(8192, 1594323), new BigFraction(2, 3).pow(13));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76662);Assert.assertEquals(new BigFraction(8192, 1594323), new BigFraction(2, 3).pow(13l));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76663);Assert.assertEquals(new BigFraction(8192, 1594323), new BigFraction(2, 3).pow(BigInteger.valueOf(13l)));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76664);Assert.assertEquals(BigFraction.ONE, new BigFraction(2, 3).pow(0));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76665);Assert.assertEquals(BigFraction.ONE, new BigFraction(2, 3).pow(0l));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76666);Assert.assertEquals(BigFraction.ONE, new BigFraction(2, 3).pow(BigInteger.valueOf(0l)));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76667);Assert.assertEquals(new BigFraction(1594323, 8192), new BigFraction(2, 3).pow(-13));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76668);Assert.assertEquals(new BigFraction(1594323, 8192), new BigFraction(2, 3).pow(-13l));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76669);Assert.assertEquals(new BigFraction(1594323, 8192), new BigFraction(2, 3).pow(BigInteger.valueOf(-13l)));
    }finally{__CLR4_4_11mv11mv1lb90pcmr.R.flushNeeded();}}

    @Test
    public void testMath340() {__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceStart(getClass().getName(),76670);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y3kzms1n5q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mv11mv1lb90pcmr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionTest.testMath340",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76670,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y3kzms1n5q(){try{__CLR4_4_11mv11mv1lb90pcmr.R.inc(76670);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76671);BigFraction fractionA = new BigFraction(0.00131);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76672);BigFraction fractionB = new BigFraction(.37).reciprocal();
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76673);BigFraction errorResult = fractionA.multiply(fractionB);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76674);BigFraction correctResult = new BigFraction(fractionA.getNumerator().multiply(fractionB.getNumerator()),
                                                    fractionA.getDenominator().multiply(fractionB.getDenominator()));
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76675);Assert.assertEquals(correctResult, errorResult);
    }finally{__CLR4_4_11mv11mv1lb90pcmr.R.flushNeeded();}}

    @Test
    public void testSerial() throws FractionConversionException {__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceStart(getClass().getName(),76676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16f44lv1n5w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mv11mv1lb90pcmr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mv11mv1lb90pcmr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fraction.BigFractionTest.testSerial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76676,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16f44lv1n5w() throws FractionConversionException{try{__CLR4_4_11mv11mv1lb90pcmr.R.inc(76676);
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76677);BigFraction[] fractions = {
            new BigFraction(3, 4), BigFraction.ONE, BigFraction.ZERO,
            new BigFraction(17), new BigFraction(FastMath.PI, 1000),
            new BigFraction(-5, 2)
        };
        __CLR4_4_11mv11mv1lb90pcmr.R.inc(76678);for (BigFraction fraction : fractions) {{
            __CLR4_4_11mv11mv1lb90pcmr.R.inc(76679);Assert.assertEquals(fraction, TestUtils.serializeAndRecover(fraction));
        }
    }}finally{__CLR4_4_11mv11mv1lb90pcmr.R.flushNeeded();}}

}
