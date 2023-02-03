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

import org.apache.commons.math3.ExtendedFieldElementAbstractTest;
import org.junit.Assert;

import org.junit.Test;

public class Decimal64Test extends ExtendedFieldElementAbstractTest<Decimal64> {static class __CLR4_4_12eq42eq4lb90pey0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,112703,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final double X = 1.2345;

    public static final Decimal64 PLUS_X = new Decimal64(X);

    public static final Decimal64 MINUS_X = new Decimal64(-X);

    public static final double Y = 6.789;

    public static final Decimal64 PLUS_Y = new Decimal64(Y);

    public static final Decimal64 MINUS_Y = new Decimal64(-Y);

    public static final Decimal64 PLUS_ZERO = new Decimal64(0.0);

    public static final Decimal64 MINUS_ZERO = new Decimal64(-0.0);

    @Override
    protected Decimal64 build(final double x) {try{__CLR4_4_12eq42eq4lb90pey0.R.inc(112396);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112397);return new Decimal64(x);
    }finally{__CLR4_4_12eq42eq4lb90pey0.R.flushNeeded();}}

    @Test
    public void testAdd() {__CLR4_4_12eq42eq4lb90pey0.R.globalSliceStart(getClass().getName(),112398);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vtx82e2eq6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12eq42eq4lb90pey0.R.rethrow($CLV_t2$);}finally{__CLR4_4_12eq42eq4lb90pey0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.Decimal64Test.testAdd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112398,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vtx82e2eq6(){try{__CLR4_4_12eq42eq4lb90pey0.R.inc(112398);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112399);Decimal64 expected, actual;

        __CLR4_4_12eq42eq4lb90pey0.R.inc(112400);expected = new Decimal64(X + Y);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112401);actual = PLUS_X.add(PLUS_Y);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112402);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112403);actual = PLUS_Y.add(PLUS_X);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112404);Assert.assertEquals(expected, actual);

        __CLR4_4_12eq42eq4lb90pey0.R.inc(112405);expected = new Decimal64(X + (-Y));
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112406);actual = PLUS_X.add(MINUS_Y);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112407);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112408);actual = MINUS_Y.add(PLUS_X);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112409);Assert.assertEquals(expected, actual);

        __CLR4_4_12eq42eq4lb90pey0.R.inc(112410);expected = new Decimal64((-X) + (-Y));
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112411);actual = MINUS_X.add(MINUS_Y);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112412);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112413);actual = MINUS_Y.add(MINUS_X);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112414);Assert.assertEquals(expected, actual);

        __CLR4_4_12eq42eq4lb90pey0.R.inc(112415);expected = Decimal64.POSITIVE_INFINITY;
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112416);actual = PLUS_X.add(Decimal64.POSITIVE_INFINITY);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112417);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112418);actual = Decimal64.POSITIVE_INFINITY.add(PLUS_X);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112419);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112420);actual = MINUS_X.add(Decimal64.POSITIVE_INFINITY);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112421);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112422);actual = Decimal64.POSITIVE_INFINITY.add(MINUS_X);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112423);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112424);actual = Decimal64.POSITIVE_INFINITY.add(Decimal64.POSITIVE_INFINITY);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112425);Assert.assertEquals(expected, actual);

        __CLR4_4_12eq42eq4lb90pey0.R.inc(112426);expected = Decimal64.NEGATIVE_INFINITY;
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112427);actual = PLUS_X.add(Decimal64.NEGATIVE_INFINITY);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112428);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112429);actual = Decimal64.NEGATIVE_INFINITY.add(PLUS_X);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112430);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112431);actual = Decimal64.NEGATIVE_INFINITY.add(Decimal64.NEGATIVE_INFINITY);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112432);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112433);actual = MINUS_X.add(Decimal64.NEGATIVE_INFINITY);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112434);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112435);actual = Decimal64.NEGATIVE_INFINITY.add(MINUS_X);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112436);Assert.assertEquals(expected, actual);

        __CLR4_4_12eq42eq4lb90pey0.R.inc(112437);expected = Decimal64.NAN;
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112438);actual = Decimal64.POSITIVE_INFINITY.add(Decimal64.NEGATIVE_INFINITY);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112439);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112440);actual = Decimal64.NEGATIVE_INFINITY.add(Decimal64.POSITIVE_INFINITY);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112441);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112442);actual = PLUS_X.add(Decimal64.NAN);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112443);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112444);actual = Decimal64.NAN.add(PLUS_X);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112445);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112446);actual = MINUS_X.add(Decimal64.NAN);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112447);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112448);actual = Decimal64.NAN.add(MINUS_X);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112449);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112450);actual = Decimal64.POSITIVE_INFINITY.add(Decimal64.NAN);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112451);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112452);actual = Decimal64.NAN.add(Decimal64.POSITIVE_INFINITY);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112453);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112454);actual = Decimal64.NEGATIVE_INFINITY.add(Decimal64.NAN);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112455);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112456);actual = Decimal64.NAN.add(Decimal64.NEGATIVE_INFINITY);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112457);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112458);actual = Decimal64.NAN.add(Decimal64.NAN);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112459);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_12eq42eq4lb90pey0.R.flushNeeded();}}

    @Test
    public void testSubtract() {__CLR4_4_12eq42eq4lb90pey0.R.globalSliceStart(getClass().getName(),112460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hib6tp2erw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12eq42eq4lb90pey0.R.rethrow($CLV_t2$);}finally{__CLR4_4_12eq42eq4lb90pey0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.Decimal64Test.testSubtract",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112460,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hib6tp2erw(){try{__CLR4_4_12eq42eq4lb90pey0.R.inc(112460);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112461);Decimal64 expected, actual;

        __CLR4_4_12eq42eq4lb90pey0.R.inc(112462);expected = new Decimal64(X - Y);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112463);actual = PLUS_X.subtract(PLUS_Y);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112464);Assert.assertEquals(expected, actual);

        __CLR4_4_12eq42eq4lb90pey0.R.inc(112465);expected = new Decimal64(X - (-Y));
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112466);actual = PLUS_X.subtract(MINUS_Y);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112467);Assert.assertEquals(expected, actual);

        __CLR4_4_12eq42eq4lb90pey0.R.inc(112468);expected = new Decimal64((-X) - Y);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112469);actual = MINUS_X.subtract(PLUS_Y);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112470);Assert.assertEquals(expected, actual);

        __CLR4_4_12eq42eq4lb90pey0.R.inc(112471);expected = new Decimal64((-X) - (-Y));
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112472);actual = MINUS_X.subtract(MINUS_Y);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112473);Assert.assertEquals(expected, actual);

        __CLR4_4_12eq42eq4lb90pey0.R.inc(112474);expected = Decimal64.NEGATIVE_INFINITY;
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112475);actual = PLUS_X.subtract(Decimal64.POSITIVE_INFINITY);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112476);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112477);actual = MINUS_X.subtract(Decimal64.POSITIVE_INFINITY);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112478);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112479);actual = Decimal64.NEGATIVE_INFINITY
                .subtract(Decimal64.POSITIVE_INFINITY);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112480);Assert.assertEquals(expected, actual);

        __CLR4_4_12eq42eq4lb90pey0.R.inc(112481);expected = Decimal64.POSITIVE_INFINITY;
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112482);actual = PLUS_X.subtract(Decimal64.NEGATIVE_INFINITY);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112483);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112484);actual = MINUS_X.subtract(Decimal64.NEGATIVE_INFINITY);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112485);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112486);actual = Decimal64.POSITIVE_INFINITY
                .subtract(Decimal64.NEGATIVE_INFINITY);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112487);Assert.assertEquals(expected, actual);

        __CLR4_4_12eq42eq4lb90pey0.R.inc(112488);expected = Decimal64.NAN;
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112489);actual = Decimal64.POSITIVE_INFINITY
                .subtract(Decimal64.POSITIVE_INFINITY);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112490);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112491);actual = Decimal64.NEGATIVE_INFINITY
                .subtract(Decimal64.NEGATIVE_INFINITY);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112492);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112493);actual = PLUS_X.subtract(Decimal64.NAN);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112494);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112495);actual = Decimal64.NAN.subtract(PLUS_X);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112496);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112497);actual = MINUS_X.subtract(Decimal64.NAN);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112498);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112499);actual = Decimal64.NAN.subtract(MINUS_X);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112500);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112501);actual = Decimal64.POSITIVE_INFINITY.subtract(Decimal64.NAN);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112502);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112503);actual = Decimal64.NAN.subtract(Decimal64.POSITIVE_INFINITY);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112504);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112505);actual = Decimal64.NEGATIVE_INFINITY.subtract(Decimal64.NAN);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112506);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112507);actual = Decimal64.NAN.subtract(Decimal64.NEGATIVE_INFINITY);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112508);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112509);actual = Decimal64.NAN.subtract(Decimal64.NAN);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112510);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_12eq42eq4lb90pey0.R.flushNeeded();}}

    @Test
    public void testNegate() {__CLR4_4_12eq42eq4lb90pey0.R.globalSliceStart(getClass().getName(),112511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ffqfwl2etb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12eq42eq4lb90pey0.R.rethrow($CLV_t2$);}finally{__CLR4_4_12eq42eq4lb90pey0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.Decimal64Test.testNegate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112511,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ffqfwl2etb(){try{__CLR4_4_12eq42eq4lb90pey0.R.inc(112511);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112512);Decimal64 expected, actual;

        __CLR4_4_12eq42eq4lb90pey0.R.inc(112513);expected = MINUS_X;
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112514);actual = PLUS_X.negate();
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112515);Assert.assertEquals(expected, actual);

        __CLR4_4_12eq42eq4lb90pey0.R.inc(112516);expected = PLUS_X;
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112517);actual = MINUS_X.negate();
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112518);Assert.assertEquals(expected, actual);

        __CLR4_4_12eq42eq4lb90pey0.R.inc(112519);expected = MINUS_ZERO;
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112520);actual = PLUS_ZERO.negate();
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112521);Assert.assertEquals(expected, actual);

        __CLR4_4_12eq42eq4lb90pey0.R.inc(112522);expected = PLUS_ZERO;
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112523);actual = MINUS_ZERO.negate();
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112524);Assert.assertEquals(expected, actual);

        __CLR4_4_12eq42eq4lb90pey0.R.inc(112525);expected = Decimal64.POSITIVE_INFINITY;
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112526);actual = Decimal64.NEGATIVE_INFINITY.negate();
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112527);Assert.assertEquals(expected, actual);

        __CLR4_4_12eq42eq4lb90pey0.R.inc(112528);expected = Decimal64.NEGATIVE_INFINITY;
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112529);actual = Decimal64.POSITIVE_INFINITY.negate();
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112530);Assert.assertEquals(expected, actual);

        __CLR4_4_12eq42eq4lb90pey0.R.inc(112531);expected = Decimal64.NAN;
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112532);actual = Decimal64.NAN.negate();
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112533);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_12eq42eq4lb90pey0.R.flushNeeded();}}

    @Test
    public void testMultiply() {__CLR4_4_12eq42eq4lb90pey0.R.globalSliceStart(getClass().getName(),112534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vkd1nn2ety();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12eq42eq4lb90pey0.R.rethrow($CLV_t2$);}finally{__CLR4_4_12eq42eq4lb90pey0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.Decimal64Test.testMultiply",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112534,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vkd1nn2ety(){try{__CLR4_4_12eq42eq4lb90pey0.R.inc(112534);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112535);Decimal64 expected, actual;

        __CLR4_4_12eq42eq4lb90pey0.R.inc(112536);expected = new Decimal64(X * Y);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112537);actual = PLUS_X.multiply(PLUS_Y);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112538);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112539);actual = PLUS_Y.multiply(PLUS_X);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112540);Assert.assertEquals(expected, actual);

        __CLR4_4_12eq42eq4lb90pey0.R.inc(112541);expected = new Decimal64(X * (-Y));
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112542);actual = PLUS_X.multiply(MINUS_Y);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112543);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112544);actual = MINUS_Y.multiply(PLUS_X);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112545);Assert.assertEquals(expected, actual);

        __CLR4_4_12eq42eq4lb90pey0.R.inc(112546);expected = new Decimal64((-X) * (-Y));
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112547);actual = MINUS_X.multiply(MINUS_Y);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112548);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112549);actual = MINUS_Y.multiply(MINUS_X);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112550);Assert.assertEquals(expected, actual);

        __CLR4_4_12eq42eq4lb90pey0.R.inc(112551);expected = Decimal64.POSITIVE_INFINITY;
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112552);actual = PLUS_X.multiply(Decimal64.POSITIVE_INFINITY);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112553);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112554);actual = Decimal64.POSITIVE_INFINITY.multiply(PLUS_X);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112555);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112556);actual = MINUS_X.multiply(Decimal64.NEGATIVE_INFINITY);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112557);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112558);actual = Decimal64.NEGATIVE_INFINITY.multiply(MINUS_X);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112559);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112560);actual = Decimal64.POSITIVE_INFINITY
                .multiply(Decimal64.POSITIVE_INFINITY);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112561);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112562);actual = Decimal64.NEGATIVE_INFINITY
                .multiply(Decimal64.NEGATIVE_INFINITY);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112563);Assert.assertEquals(expected, actual);

        __CLR4_4_12eq42eq4lb90pey0.R.inc(112564);expected = Decimal64.NEGATIVE_INFINITY;
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112565);actual = PLUS_X.multiply(Decimal64.NEGATIVE_INFINITY);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112566);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112567);actual = Decimal64.NEGATIVE_INFINITY.multiply(PLUS_X);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112568);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112569);actual = MINUS_X.multiply(Decimal64.POSITIVE_INFINITY);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112570);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112571);actual = Decimal64.POSITIVE_INFINITY.multiply(MINUS_X);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112572);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112573);actual = Decimal64.POSITIVE_INFINITY
                .multiply(Decimal64.NEGATIVE_INFINITY);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112574);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112575);actual = Decimal64.NEGATIVE_INFINITY
                .multiply(Decimal64.POSITIVE_INFINITY);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112576);Assert.assertEquals(expected, actual);

        __CLR4_4_12eq42eq4lb90pey0.R.inc(112577);expected = Decimal64.NAN;
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112578);actual = PLUS_X.multiply(Decimal64.NAN);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112579);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112580);actual = Decimal64.NAN.multiply(PLUS_X);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112581);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112582);actual = MINUS_X.multiply(Decimal64.NAN);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112583);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112584);actual = Decimal64.NAN.multiply(MINUS_X);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112585);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112586);actual = Decimal64.POSITIVE_INFINITY.multiply(Decimal64.NAN);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112587);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112588);actual = Decimal64.NAN.multiply(Decimal64.POSITIVE_INFINITY);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112589);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112590);actual = Decimal64.NEGATIVE_INFINITY.multiply(Decimal64.NAN);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112591);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112592);actual = Decimal64.NAN.multiply(Decimal64.NEGATIVE_INFINITY);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112593);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112594);actual = Decimal64.NAN.multiply(Decimal64.NAN);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112595);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_12eq42eq4lb90pey0.R.flushNeeded();}}

    @Test
    public void testDivide() {__CLR4_4_12eq42eq4lb90pey0.R.globalSliceStart(getClass().getName(),112596);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ae8h2m2evo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12eq42eq4lb90pey0.R.rethrow($CLV_t2$);}finally{__CLR4_4_12eq42eq4lb90pey0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.Decimal64Test.testDivide",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112596,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ae8h2m2evo(){try{__CLR4_4_12eq42eq4lb90pey0.R.inc(112596);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112597);Decimal64 expected, actual;

        __CLR4_4_12eq42eq4lb90pey0.R.inc(112598);expected = new Decimal64(X / Y);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112599);actual = PLUS_X.divide(PLUS_Y);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112600);Assert.assertEquals(expected, actual);

        __CLR4_4_12eq42eq4lb90pey0.R.inc(112601);expected = new Decimal64(X / (-Y));
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112602);actual = PLUS_X.divide(MINUS_Y);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112603);Assert.assertEquals(expected, actual);

        __CLR4_4_12eq42eq4lb90pey0.R.inc(112604);expected = new Decimal64((-X) / Y);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112605);actual = MINUS_X.divide(PLUS_Y);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112606);Assert.assertEquals(expected, actual);

        __CLR4_4_12eq42eq4lb90pey0.R.inc(112607);expected = new Decimal64((-X) / (-Y));
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112608);actual = MINUS_X.divide(MINUS_Y);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112609);Assert.assertEquals(expected, actual);

        __CLR4_4_12eq42eq4lb90pey0.R.inc(112610);expected = PLUS_ZERO;
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112611);actual = PLUS_X.divide(Decimal64.POSITIVE_INFINITY);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112612);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112613);actual = MINUS_X.divide(Decimal64.NEGATIVE_INFINITY);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112614);Assert.assertEquals(expected, actual);

        __CLR4_4_12eq42eq4lb90pey0.R.inc(112615);expected = MINUS_ZERO;
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112616);actual = MINUS_X.divide(Decimal64.POSITIVE_INFINITY);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112617);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112618);actual = PLUS_X.divide(Decimal64.NEGATIVE_INFINITY);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112619);Assert.assertEquals(expected, actual);

        __CLR4_4_12eq42eq4lb90pey0.R.inc(112620);expected = Decimal64.POSITIVE_INFINITY;
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112621);actual = Decimal64.POSITIVE_INFINITY.divide(PLUS_X);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112622);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112623);actual = Decimal64.NEGATIVE_INFINITY.divide(MINUS_X);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112624);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112625);actual = PLUS_X.divide(PLUS_ZERO);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112626);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112627);actual = MINUS_X.divide(MINUS_ZERO);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112628);Assert.assertEquals(expected, actual);

        __CLR4_4_12eq42eq4lb90pey0.R.inc(112629);expected = Decimal64.NEGATIVE_INFINITY;
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112630);actual = Decimal64.POSITIVE_INFINITY.divide(MINUS_X);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112631);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112632);actual = Decimal64.NEGATIVE_INFINITY.divide(PLUS_X);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112633);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112634);actual = PLUS_X.divide(MINUS_ZERO);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112635);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112636);actual = MINUS_X.divide(PLUS_ZERO);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112637);Assert.assertEquals(expected, actual);

        __CLR4_4_12eq42eq4lb90pey0.R.inc(112638);expected = Decimal64.NAN;
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112639);actual = Decimal64.POSITIVE_INFINITY
                .divide(Decimal64.POSITIVE_INFINITY);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112640);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112641);actual = Decimal64.POSITIVE_INFINITY
                .divide(Decimal64.NEGATIVE_INFINITY);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112642);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112643);actual = Decimal64.NEGATIVE_INFINITY
                .divide(Decimal64.POSITIVE_INFINITY);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112644);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112645);actual = Decimal64.NEGATIVE_INFINITY
                .divide(Decimal64.NEGATIVE_INFINITY);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112646);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112647);actual = PLUS_X.divide(Decimal64.NAN);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112648);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112649);actual = Decimal64.NAN.divide(PLUS_X);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112650);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112651);actual = MINUS_X.divide(Decimal64.NAN);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112652);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112653);actual = Decimal64.NAN.divide(MINUS_X);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112654);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112655);actual = Decimal64.POSITIVE_INFINITY.divide(Decimal64.NAN);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112656);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112657);actual = Decimal64.NAN.divide(Decimal64.POSITIVE_INFINITY);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112658);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112659);actual = Decimal64.NEGATIVE_INFINITY.divide(Decimal64.NAN);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112660);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112661);actual = Decimal64.NAN.divide(Decimal64.NEGATIVE_INFINITY);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112662);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112663);actual = Decimal64.NAN.divide(Decimal64.NAN);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112664);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112665);actual = PLUS_ZERO.divide(PLUS_ZERO);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112666);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112667);actual = PLUS_ZERO.divide(MINUS_ZERO);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112668);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112669);actual = MINUS_ZERO.divide(PLUS_ZERO);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112670);Assert.assertEquals(expected, actual);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112671);actual = MINUS_ZERO.divide(MINUS_ZERO);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112672);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_12eq42eq4lb90pey0.R.flushNeeded();}}

    @Test
    public void testReciprocal() {__CLR4_4_12eq42eq4lb90pey0.R.globalSliceStart(getClass().getName(),112673);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11r5n8t2ext();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12eq42eq4lb90pey0.R.rethrow($CLV_t2$);}finally{__CLR4_4_12eq42eq4lb90pey0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.Decimal64Test.testReciprocal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112673,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11r5n8t2ext(){try{__CLR4_4_12eq42eq4lb90pey0.R.inc(112673);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112674);Decimal64 expected, actual;

        __CLR4_4_12eq42eq4lb90pey0.R.inc(112675);expected = new Decimal64(1.0 / X);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112676);actual = PLUS_X.reciprocal();
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112677);Assert.assertEquals(expected, actual);

        __CLR4_4_12eq42eq4lb90pey0.R.inc(112678);expected = new Decimal64(1.0 / (-X));
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112679);actual = MINUS_X.reciprocal();
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112680);Assert.assertEquals(expected, actual);

        __CLR4_4_12eq42eq4lb90pey0.R.inc(112681);expected = PLUS_ZERO;
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112682);actual = Decimal64.POSITIVE_INFINITY.reciprocal();
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112683);Assert.assertEquals(expected, actual);

        __CLR4_4_12eq42eq4lb90pey0.R.inc(112684);expected = MINUS_ZERO;
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112685);actual = Decimal64.NEGATIVE_INFINITY.reciprocal();
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112686);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_12eq42eq4lb90pey0.R.flushNeeded();}}

    @Test
    public void testIsInfinite() {__CLR4_4_12eq42eq4lb90pey0.R.globalSliceStart(getClass().getName(),112687);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1587wev2ey7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12eq42eq4lb90pey0.R.rethrow($CLV_t2$);}finally{__CLR4_4_12eq42eq4lb90pey0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.Decimal64Test.testIsInfinite",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112687,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1587wev2ey7(){try{__CLR4_4_12eq42eq4lb90pey0.R.inc(112687);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112688);Assert.assertFalse(MINUS_X.isInfinite());
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112689);Assert.assertFalse(PLUS_X.isInfinite());
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112690);Assert.assertFalse(MINUS_Y.isInfinite());
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112691);Assert.assertFalse(PLUS_Y.isInfinite());
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112692);Assert.assertFalse(Decimal64.NAN.isInfinite());

        __CLR4_4_12eq42eq4lb90pey0.R.inc(112693);Assert.assertTrue(Decimal64.NEGATIVE_INFINITY.isInfinite());
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112694);Assert.assertTrue(Decimal64.POSITIVE_INFINITY.isInfinite());
    }finally{__CLR4_4_12eq42eq4lb90pey0.R.flushNeeded();}}

    @Test
    public void testIsNaN() {__CLR4_4_12eq42eq4lb90pey0.R.globalSliceStart(getClass().getName(),112695);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z6qlqy2eyf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12eq42eq4lb90pey0.R.rethrow($CLV_t2$);}finally{__CLR4_4_12eq42eq4lb90pey0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.Decimal64Test.testIsNaN",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112695,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z6qlqy2eyf(){try{__CLR4_4_12eq42eq4lb90pey0.R.inc(112695);
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112696);Assert.assertFalse(MINUS_X.isNaN());
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112697);Assert.assertFalse(PLUS_X.isNaN());
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112698);Assert.assertFalse(MINUS_Y.isNaN());
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112699);Assert.assertFalse(PLUS_Y.isNaN());
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112700);Assert.assertFalse(Decimal64.NEGATIVE_INFINITY.isNaN());
        __CLR4_4_12eq42eq4lb90pey0.R.inc(112701);Assert.assertFalse(Decimal64.POSITIVE_INFINITY.isNaN());

        __CLR4_4_12eq42eq4lb90pey0.R.inc(112702);Assert.assertTrue(Decimal64.NAN.isNaN());
    }finally{__CLR4_4_12eq42eq4lb90pey0.R.flushNeeded();}}
}
