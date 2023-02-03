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

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.junit.Assert;
import org.junit.Test;

public class BigRealTest {static class __CLR4_4_12eg52eg5lb90pews{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,112124,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testConstructor() {__CLR4_4_12eg52eg5lb90pews.R.globalSliceStart(getClass().getName(),112037);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uefs8h2eg5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12eg52eg5lb90pews.R.rethrow($CLV_t2$);}finally{__CLR4_4_12eg52eg5lb90pews.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.BigRealTest.testConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112037,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uefs8h2eg5(){try{__CLR4_4_12eg52eg5lb90pews.R.inc(112037);
        __CLR4_4_12eg52eg5lb90pews.R.inc(112038);Assert.assertEquals(1.625,
                            new BigReal(new BigDecimal("1.625")).doubleValue(),
                            1.0e-15);
        __CLR4_4_12eg52eg5lb90pews.R.inc(112039);Assert.assertEquals(-5.0,
                            new BigReal(new BigInteger("-5")).doubleValue(),
                            1.0e-15);
        __CLR4_4_12eg52eg5lb90pews.R.inc(112040);Assert.assertEquals(-5.0, new BigReal(new BigInteger("-5"),
                                              MathContext.DECIMAL64)
            .doubleValue(), 1.0e-15);
        __CLR4_4_12eg52eg5lb90pews.R.inc(112041);Assert
            .assertEquals(0.125,
                          new BigReal(new BigInteger("125"), 3).doubleValue(),
                          1.0e-15);
        __CLR4_4_12eg52eg5lb90pews.R.inc(112042);Assert.assertEquals(0.125, new BigReal(new BigInteger("125"), 3,
                                               MathContext.DECIMAL64)
            .doubleValue(), 1.0e-15);
        __CLR4_4_12eg52eg5lb90pews.R.inc(112043);Assert.assertEquals(1.625, new BigReal(new char[] {
            '1', '.', '6', '2', '5'
        }).doubleValue(), 1.0e-15);
        __CLR4_4_12eg52eg5lb90pews.R.inc(112044);Assert.assertEquals(1.625, new BigReal(new char[] {
            'A', 'A', '1', '.', '6', '2', '5', '9'
        }, 2, 5).doubleValue(), 1.0e-15);
        __CLR4_4_12eg52eg5lb90pews.R.inc(112045);Assert.assertEquals(1.625, new BigReal(new char[] {
            'A', 'A', '1', '.', '6', '2', '5', '9'
        }, 2, 5, MathContext.DECIMAL64).doubleValue(), 1.0e-15);
        __CLR4_4_12eg52eg5lb90pews.R.inc(112046);Assert.assertEquals(1.625, new BigReal(new char[] {
            '1', '.', '6', '2', '5'
        }, MathContext.DECIMAL64).doubleValue(), 1.0e-15);
        __CLR4_4_12eg52eg5lb90pews.R.inc(112047);Assert.assertEquals(1.625, new BigReal(1.625).doubleValue(), 1.0e-15);
        __CLR4_4_12eg52eg5lb90pews.R.inc(112048);Assert.assertEquals(1.625, new BigReal(1.625, MathContext.DECIMAL64)
            .doubleValue(), 1.0e-15);
        __CLR4_4_12eg52eg5lb90pews.R.inc(112049);Assert.assertEquals(-5.0, new BigReal(-5).doubleValue(), 1.0e-15);
        __CLR4_4_12eg52eg5lb90pews.R.inc(112050);Assert.assertEquals(-5.0, new BigReal(-5, MathContext.DECIMAL64)
            .doubleValue(), 1.0e-15);
        __CLR4_4_12eg52eg5lb90pews.R.inc(112051);Assert.assertEquals(-5.0, new BigReal(-5l).doubleValue(), 1.0e-15);
        __CLR4_4_12eg52eg5lb90pews.R.inc(112052);Assert.assertEquals(-5.0, new BigReal(-5l, MathContext.DECIMAL64)
            .doubleValue(), 1.0e-15);
        __CLR4_4_12eg52eg5lb90pews.R.inc(112053);Assert.assertEquals(1.625, new BigReal("1.625").doubleValue(), 1.0e-15);
        __CLR4_4_12eg52eg5lb90pews.R.inc(112054);Assert.assertEquals(1.625, new BigReal("1.625", MathContext.DECIMAL64)
            .doubleValue(), 1.0e-15);
    }finally{__CLR4_4_12eg52eg5lb90pews.R.flushNeeded();}}

    @Test
    public void testCompareTo() {__CLR4_4_12eg52eg5lb90pews.R.globalSliceStart(getClass().getName(),112055);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pz6vfv2egn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12eg52eg5lb90pews.R.rethrow($CLV_t2$);}finally{__CLR4_4_12eg52eg5lb90pews.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.BigRealTest.testCompareTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112055,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pz6vfv2egn(){try{__CLR4_4_12eg52eg5lb90pews.R.inc(112055);
        __CLR4_4_12eg52eg5lb90pews.R.inc(112056);BigReal first = new BigReal(1.0 / 2.0);
        __CLR4_4_12eg52eg5lb90pews.R.inc(112057);BigReal second = new BigReal(1.0 / 3.0);
        __CLR4_4_12eg52eg5lb90pews.R.inc(112058);BigReal third = new BigReal(1.0 / 2.0);

        __CLR4_4_12eg52eg5lb90pews.R.inc(112059);Assert.assertEquals(0, first.compareTo(first));
        __CLR4_4_12eg52eg5lb90pews.R.inc(112060);Assert.assertEquals(0, first.compareTo(third));
        __CLR4_4_12eg52eg5lb90pews.R.inc(112061);Assert.assertEquals(1, first.compareTo(second));
        __CLR4_4_12eg52eg5lb90pews.R.inc(112062);Assert.assertEquals(-1, second.compareTo(first));

    }finally{__CLR4_4_12eg52eg5lb90pews.R.flushNeeded();}}

    @Test
    public void testAdd() {__CLR4_4_12eg52eg5lb90pews.R.globalSliceStart(getClass().getName(),112063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vtx82e2egv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12eg52eg5lb90pews.R.rethrow($CLV_t2$);}finally{__CLR4_4_12eg52eg5lb90pews.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.BigRealTest.testAdd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112063,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vtx82e2egv(){try{__CLR4_4_12eg52eg5lb90pews.R.inc(112063);
        __CLR4_4_12eg52eg5lb90pews.R.inc(112064);BigReal a = new BigReal("1.2345678");
        __CLR4_4_12eg52eg5lb90pews.R.inc(112065);BigReal b = new BigReal("8.7654321");
        __CLR4_4_12eg52eg5lb90pews.R.inc(112066);Assert.assertEquals(9.9999999, a.add(b).doubleValue(), 1.0e-15);
    }finally{__CLR4_4_12eg52eg5lb90pews.R.flushNeeded();}}

    @Test
    public void testSubtract() {__CLR4_4_12eg52eg5lb90pews.R.globalSliceStart(getClass().getName(),112067);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hib6tp2egz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12eg52eg5lb90pews.R.rethrow($CLV_t2$);}finally{__CLR4_4_12eg52eg5lb90pews.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.BigRealTest.testSubtract",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112067,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hib6tp2egz(){try{__CLR4_4_12eg52eg5lb90pews.R.inc(112067);
        __CLR4_4_12eg52eg5lb90pews.R.inc(112068);BigReal a = new BigReal("1.2345678");
        __CLR4_4_12eg52eg5lb90pews.R.inc(112069);BigReal b = new BigReal("8.7654321");
        __CLR4_4_12eg52eg5lb90pews.R.inc(112070);Assert.assertEquals(-7.5308643, a.subtract(b).doubleValue(), 1.0e-15);
    }finally{__CLR4_4_12eg52eg5lb90pews.R.flushNeeded();}}

    @Test
    public void testNegate() {__CLR4_4_12eg52eg5lb90pews.R.globalSliceStart(getClass().getName(),112071);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ffqfwl2eh3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12eg52eg5lb90pews.R.rethrow($CLV_t2$);}finally{__CLR4_4_12eg52eg5lb90pews.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.BigRealTest.testNegate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112071,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ffqfwl2eh3(){try{__CLR4_4_12eg52eg5lb90pews.R.inc(112071);
        __CLR4_4_12eg52eg5lb90pews.R.inc(112072);BigReal a = new BigReal("1.2345678");
        __CLR4_4_12eg52eg5lb90pews.R.inc(112073);BigReal zero = new BigReal("0.0000000");
        __CLR4_4_12eg52eg5lb90pews.R.inc(112074);Assert.assertEquals(a.negate().add(a), zero);
        __CLR4_4_12eg52eg5lb90pews.R.inc(112075);Assert.assertEquals(a.add(a.negate()), zero);
        __CLR4_4_12eg52eg5lb90pews.R.inc(112076);Assert.assertEquals(zero, zero.negate());
    }finally{__CLR4_4_12eg52eg5lb90pews.R.flushNeeded();}}

    @Test
    public void testDivide() {__CLR4_4_12eg52eg5lb90pews.R.globalSliceStart(getClass().getName(),112077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ae8h2m2eh9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12eg52eg5lb90pews.R.rethrow($CLV_t2$);}finally{__CLR4_4_12eg52eg5lb90pews.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.BigRealTest.testDivide",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112077,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ae8h2m2eh9(){try{__CLR4_4_12eg52eg5lb90pews.R.inc(112077);
        __CLR4_4_12eg52eg5lb90pews.R.inc(112078);BigReal a = new BigReal("1.0000000000");
        __CLR4_4_12eg52eg5lb90pews.R.inc(112079);BigReal b = new BigReal("0.0009765625");
        __CLR4_4_12eg52eg5lb90pews.R.inc(112080);Assert.assertEquals(1024.0, a.divide(b).doubleValue(), 1.0e-15);
    }finally{__CLR4_4_12eg52eg5lb90pews.R.flushNeeded();}}

    @Test(expected = MathArithmeticException.class)
    public void testDivisionByZero() {__CLR4_4_12eg52eg5lb90pews.R.globalSliceStart(getClass().getName(),112081);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jd4hut2ehd();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,68,105,118,105,115,105,111,110,66,121,90,101,114,111,58,32,91,77,97,116,104,65,114,105,116,104,109,101,116,105,99,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MathArithmeticException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12eg52eg5lb90pews.R.rethrow($CLV_t2$);}finally{__CLR4_4_12eg52eg5lb90pews.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.BigRealTest.testDivisionByZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112081,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jd4hut2ehd(){try{__CLR4_4_12eg52eg5lb90pews.R.inc(112081);
        __CLR4_4_12eg52eg5lb90pews.R.inc(112082);final BigReal a = BigReal.ONE;
        __CLR4_4_12eg52eg5lb90pews.R.inc(112083);final BigReal b = BigReal.ZERO;
        __CLR4_4_12eg52eg5lb90pews.R.inc(112084);a.divide(b);
    }finally{__CLR4_4_12eg52eg5lb90pews.R.flushNeeded();}}

    @Test
    public void testReciprocal() {__CLR4_4_12eg52eg5lb90pews.R.globalSliceStart(getClass().getName(),112085);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11r5n8t2ehh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12eg52eg5lb90pews.R.rethrow($CLV_t2$);}finally{__CLR4_4_12eg52eg5lb90pews.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.BigRealTest.testReciprocal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112085,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11r5n8t2ehh(){try{__CLR4_4_12eg52eg5lb90pews.R.inc(112085);
        __CLR4_4_12eg52eg5lb90pews.R.inc(112086);BigReal a = new BigReal("1.2345678");
        __CLR4_4_12eg52eg5lb90pews.R.inc(112087);double eps = FastMath.pow(10., -a.getScale());
        __CLR4_4_12eg52eg5lb90pews.R.inc(112088);BigReal one = new BigReal("1.0000000");
        __CLR4_4_12eg52eg5lb90pews.R.inc(112089);BigReal b = a.reciprocal();
        __CLR4_4_12eg52eg5lb90pews.R.inc(112090);BigReal r = one.subtract(a.multiply(b));
        __CLR4_4_12eg52eg5lb90pews.R.inc(112091);Assert.assertTrue(FastMath.abs(r.doubleValue()) <= eps);
        __CLR4_4_12eg52eg5lb90pews.R.inc(112092);r = one.subtract(b.multiply(a));
        __CLR4_4_12eg52eg5lb90pews.R.inc(112093);Assert.assertTrue(FastMath.abs(r.doubleValue()) <= eps);
    }finally{__CLR4_4_12eg52eg5lb90pews.R.flushNeeded();}}

    @Test(expected = MathArithmeticException.class)
    public void testReciprocalOfZero() {__CLR4_4_12eg52eg5lb90pews.R.globalSliceStart(getClass().getName(),112094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ca3ij22ehq();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,99,105,112,114,111,99,97,108,79,102,90,101,114,111,58,32,91,77,97,116,104,65,114,105,116,104,109,101,116,105,99,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MathArithmeticException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12eg52eg5lb90pews.R.rethrow($CLV_t2$);}finally{__CLR4_4_12eg52eg5lb90pews.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.BigRealTest.testReciprocalOfZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112094,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ca3ij22ehq(){try{__CLR4_4_12eg52eg5lb90pews.R.inc(112094);
        __CLR4_4_12eg52eg5lb90pews.R.inc(112095);BigReal.ZERO.reciprocal();
    }finally{__CLR4_4_12eg52eg5lb90pews.R.flushNeeded();}}

    @Test
    public void testMultiply() {__CLR4_4_12eg52eg5lb90pews.R.globalSliceStart(getClass().getName(),112096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vkd1nn2ehs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12eg52eg5lb90pews.R.rethrow($CLV_t2$);}finally{__CLR4_4_12eg52eg5lb90pews.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.BigRealTest.testMultiply",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112096,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vkd1nn2ehs(){try{__CLR4_4_12eg52eg5lb90pews.R.inc(112096);
        __CLR4_4_12eg52eg5lb90pews.R.inc(112097);BigReal a = new BigReal("1024.0");
        __CLR4_4_12eg52eg5lb90pews.R.inc(112098);BigReal b = new BigReal("0.0009765625");
        __CLR4_4_12eg52eg5lb90pews.R.inc(112099);Assert.assertEquals(1.0, a.multiply(b).doubleValue(), 1.0e-15);
        __CLR4_4_12eg52eg5lb90pews.R.inc(112100);int n = 1024;
        __CLR4_4_12eg52eg5lb90pews.R.inc(112101);Assert.assertEquals(1.0, b.multiply(n).doubleValue(), 1.0e-15);
    }finally{__CLR4_4_12eg52eg5lb90pews.R.flushNeeded();}}

    @Test
    public void testDoubleValue() {__CLR4_4_12eg52eg5lb90pews.R.globalSliceStart(getClass().getName(),112102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q6zy2z2ehy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12eg52eg5lb90pews.R.rethrow($CLV_t2$);}finally{__CLR4_4_12eg52eg5lb90pews.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.BigRealTest.testDoubleValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112102,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q6zy2z2ehy(){try{__CLR4_4_12eg52eg5lb90pews.R.inc(112102);
        __CLR4_4_12eg52eg5lb90pews.R.inc(112103);Assert.assertEquals(0.5, new BigReal(0.5).doubleValue(), 1.0e-15);
    }finally{__CLR4_4_12eg52eg5lb90pews.R.flushNeeded();}}

    @Test
    public void testBigDecimalValue() {__CLR4_4_12eg52eg5lb90pews.R.globalSliceStart(getClass().getName(),112104);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nx3wyz2ei0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12eg52eg5lb90pews.R.rethrow($CLV_t2$);}finally{__CLR4_4_12eg52eg5lb90pews.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.BigRealTest.testBigDecimalValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112104,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nx3wyz2ei0(){try{__CLR4_4_12eg52eg5lb90pews.R.inc(112104);
        __CLR4_4_12eg52eg5lb90pews.R.inc(112105);BigDecimal pi = new BigDecimal(
                                       "3.1415926535897932384626433832795028841971693993751");
        __CLR4_4_12eg52eg5lb90pews.R.inc(112106);Assert.assertEquals(pi, new BigReal(pi).bigDecimalValue());
        __CLR4_4_12eg52eg5lb90pews.R.inc(112107);Assert.assertEquals(new BigDecimal(0.5),
                            new BigReal(1.0 / 2.0).bigDecimalValue());
    }finally{__CLR4_4_12eg52eg5lb90pews.R.flushNeeded();}}

    @Test
    public void testEqualsAndHashCode() {__CLR4_4_12eg52eg5lb90pews.R.globalSliceStart(getClass().getName(),112108);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o4n4w82ei4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12eg52eg5lb90pews.R.rethrow($CLV_t2$);}finally{__CLR4_4_12eg52eg5lb90pews.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.BigRealTest.testEqualsAndHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112108,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o4n4w82ei4(){try{__CLR4_4_12eg52eg5lb90pews.R.inc(112108);
        __CLR4_4_12eg52eg5lb90pews.R.inc(112109);BigReal zero = new BigReal(0.0);
        __CLR4_4_12eg52eg5lb90pews.R.inc(112110);BigReal nullReal = null;
        __CLR4_4_12eg52eg5lb90pews.R.inc(112111);Assert.assertTrue(zero.equals(zero));
        __CLR4_4_12eg52eg5lb90pews.R.inc(112112);Assert.assertFalse(zero.equals(nullReal));
        __CLR4_4_12eg52eg5lb90pews.R.inc(112113);Assert.assertFalse(zero.equals(Double.valueOf(0)));
        __CLR4_4_12eg52eg5lb90pews.R.inc(112114);BigReal zero2 = new BigReal(0.0);
        __CLR4_4_12eg52eg5lb90pews.R.inc(112115);Assert.assertTrue(zero.equals(zero2));
        __CLR4_4_12eg52eg5lb90pews.R.inc(112116);Assert.assertEquals(zero.hashCode(), zero2.hashCode());
        __CLR4_4_12eg52eg5lb90pews.R.inc(112117);BigReal one = new BigReal(1.0);
        __CLR4_4_12eg52eg5lb90pews.R.inc(112118);Assert.assertFalse((one.equals(zero) || zero.equals(one)));
        __CLR4_4_12eg52eg5lb90pews.R.inc(112119);Assert.assertTrue(one.equals(BigReal.ONE));
    }finally{__CLR4_4_12eg52eg5lb90pews.R.flushNeeded();}}

    @Test
    public void testSerial() {__CLR4_4_12eg52eg5lb90pews.R.globalSliceStart(getClass().getName(),112120);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16f44lv2eig();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12eg52eg5lb90pews.R.rethrow($CLV_t2$);}finally{__CLR4_4_12eg52eg5lb90pews.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.BigRealTest.testSerial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112120,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16f44lv2eig(){try{__CLR4_4_12eg52eg5lb90pews.R.inc(112120);
        __CLR4_4_12eg52eg5lb90pews.R.inc(112121);BigReal[] Reals = {
            new BigReal(3.0), BigReal.ONE, BigReal.ZERO, new BigReal(17),
            new BigReal(FastMath.PI), new BigReal(-2.5)
        };
        __CLR4_4_12eg52eg5lb90pews.R.inc(112122);for (BigReal Real : Reals) {{
            __CLR4_4_12eg52eg5lb90pews.R.inc(112123);Assert.assertEquals(Real, TestUtils.serializeAndRecover(Real));
        }
    }}finally{__CLR4_4_12eg52eg5lb90pews.R.flushNeeded();}}
}
