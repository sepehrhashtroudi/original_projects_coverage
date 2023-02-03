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

package org.apache.commons.math3.analysis;

import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction;
import org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction;
import org.apache.commons.math3.analysis.function.Add;
import org.apache.commons.math3.analysis.function.Constant;
import org.apache.commons.math3.analysis.function.Cos;
import org.apache.commons.math3.analysis.function.Cosh;
import org.apache.commons.math3.analysis.function.Divide;
import org.apache.commons.math3.analysis.function.Identity;
import org.apache.commons.math3.analysis.function.Inverse;
import org.apache.commons.math3.analysis.function.Log;
import org.apache.commons.math3.analysis.function.Max;
import org.apache.commons.math3.analysis.function.Min;
import org.apache.commons.math3.analysis.function.Minus;
import org.apache.commons.math3.analysis.function.Multiply;
import org.apache.commons.math3.analysis.function.Pow;
import org.apache.commons.math3.analysis.function.Power;
import org.apache.commons.math3.analysis.function.Sin;
import org.apache.commons.math3.analysis.function.Sinc;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test for {@link FunctionUtils}.
 */
public class FunctionUtilsTest {static class __CLR4_4_11bxs1bxslb90pbrr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,62310,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final double EPS = Math.ulp(1d);

    @Test
    public void testCompose() {__CLR4_4_11bxs1bxslb90pbrr.R.globalSliceStart(getClass().getName(),62128);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18i5jaf1bxs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bxs1bxslb90pbrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bxs1bxslb90pbrr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.FunctionUtilsTest.testCompose",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62128,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18i5jaf1bxs(){try{__CLR4_4_11bxs1bxslb90pbrr.R.inc(62128);
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62129);UnivariateFunction id = new Identity();
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62130);Assert.assertEquals(3, FunctionUtils.compose(id, id, id).value(3), EPS);

        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62131);UnivariateFunction c = new Constant(4);
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62132);Assert.assertEquals(4, FunctionUtils.compose(id, c).value(3), EPS);
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62133);Assert.assertEquals(4, FunctionUtils.compose(c, id).value(3), EPS);

        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62134);UnivariateFunction m = new Minus();
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62135);Assert.assertEquals(-3, FunctionUtils.compose(m).value(3), EPS);
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62136);Assert.assertEquals(3, FunctionUtils.compose(m, m).value(3), EPS);

        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62137);UnivariateFunction inv = new Inverse();
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62138);Assert.assertEquals(-0.25, FunctionUtils.compose(inv, m, c, id).value(3), EPS);

        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62139);UnivariateFunction pow = new Power(2);
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62140);Assert.assertEquals(81, FunctionUtils.compose(pow, pow).value(3), EPS);
    }finally{__CLR4_4_11bxs1bxslb90pbrr.R.flushNeeded();}}

    @Test
    public void testComposeDifferentiable() {__CLR4_4_11bxs1bxslb90pbrr.R.globalSliceStart(getClass().getName(),62141);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s2o9kh1by5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bxs1bxslb90pbrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bxs1bxslb90pbrr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.FunctionUtilsTest.testComposeDifferentiable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62141,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s2o9kh1by5(){try{__CLR4_4_11bxs1bxslb90pbrr.R.inc(62141);
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62142);UnivariateDifferentiableFunction id = new Identity();
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62143);Assert.assertEquals(1, FunctionUtils.compose(id, id, id).value(new DerivativeStructure(1, 1, 0, 3)).getPartialDerivative(1), EPS);

        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62144);UnivariateDifferentiableFunction c = new Constant(4);
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62145);Assert.assertEquals(0, FunctionUtils.compose(id, c).value(new DerivativeStructure(1, 1, 0, 3)).getPartialDerivative(1), EPS);
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62146);Assert.assertEquals(0, FunctionUtils.compose(c, id).value(new DerivativeStructure(1, 1, 0, 3)).getPartialDerivative(1), EPS);

        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62147);UnivariateDifferentiableFunction m = new Minus();
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62148);Assert.assertEquals(-1, FunctionUtils.compose(m).value(new DerivativeStructure(1, 1, 0, 3)).getPartialDerivative(1), EPS);
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62149);Assert.assertEquals(1, FunctionUtils.compose(m, m).value(new DerivativeStructure(1, 1, 0, 3)).getPartialDerivative(1), EPS);

        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62150);UnivariateDifferentiableFunction inv = new Inverse();
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62151);Assert.assertEquals(0.25, FunctionUtils.compose(inv, m, id).value(new DerivativeStructure(1, 1, 0, 2)).getPartialDerivative(1), EPS);

        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62152);UnivariateDifferentiableFunction pow = new Power(2);
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62153);Assert.assertEquals(108, FunctionUtils.compose(pow, pow).value(new DerivativeStructure(1, 1, 0, 3)).getPartialDerivative(1), EPS);

        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62154);UnivariateDifferentiableFunction log = new Log();
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62155);double a = 9876.54321;
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62156);Assert.assertEquals(pow.value(new DerivativeStructure(1, 1, 0, a)).getPartialDerivative(1) / pow.value(a),
                            FunctionUtils.compose(log, pow).value(new DerivativeStructure(1, 1, 0, a)).getPartialDerivative(1), EPS);
    }finally{__CLR4_4_11bxs1bxslb90pbrr.R.flushNeeded();}}

    @Test
    public void testAdd() {__CLR4_4_11bxs1bxslb90pbrr.R.globalSliceStart(getClass().getName(),62157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vtx82e1byl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bxs1bxslb90pbrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bxs1bxslb90pbrr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.FunctionUtilsTest.testAdd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62157,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vtx82e1byl(){try{__CLR4_4_11bxs1bxslb90pbrr.R.inc(62157);
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62158);UnivariateFunction id = new Identity();
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62159);UnivariateFunction c = new Constant(4);
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62160);UnivariateFunction m = new Minus();
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62161);UnivariateFunction inv = new Inverse();

        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62162);Assert.assertEquals(4.5, FunctionUtils.add(inv, m, c, id).value(2), EPS);
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62163);Assert.assertEquals(4 + 2, FunctionUtils.add(c, id).value(2), EPS);
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62164);Assert.assertEquals(4 - 2, FunctionUtils.add(c, FunctionUtils.compose(m, id)).value(2), EPS);
    }finally{__CLR4_4_11bxs1bxslb90pbrr.R.flushNeeded();}}

    @Test
    public void testAddDifferentiable() {__CLR4_4_11bxs1bxslb90pbrr.R.globalSliceStart(getClass().getName(),62165);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sh6yxs1byt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bxs1bxslb90pbrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bxs1bxslb90pbrr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.FunctionUtilsTest.testAddDifferentiable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62165,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sh6yxs1byt(){try{__CLR4_4_11bxs1bxslb90pbrr.R.inc(62165);
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62166);UnivariateDifferentiableFunction sin = new Sin();
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62167);UnivariateDifferentiableFunction c = new Constant(4);
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62168);UnivariateDifferentiableFunction m = new Minus();
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62169);UnivariateDifferentiableFunction inv = new Inverse();

        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62170);final double a = 123.456;
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62171);Assert.assertEquals(- 1 / (a * a) -1 + Math.cos(a),
                            FunctionUtils.add(inv, m, c, sin).value(new DerivativeStructure(1, 1, 0, a)).getPartialDerivative(1),
                            EPS);
    }finally{__CLR4_4_11bxs1bxslb90pbrr.R.flushNeeded();}}

    @Test
    public void testMultiply() {__CLR4_4_11bxs1bxslb90pbrr.R.globalSliceStart(getClass().getName(),62172);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vkd1nn1bz0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bxs1bxslb90pbrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bxs1bxslb90pbrr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.FunctionUtilsTest.testMultiply",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62172,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vkd1nn1bz0(){try{__CLR4_4_11bxs1bxslb90pbrr.R.inc(62172);
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62173);UnivariateFunction c = new Constant(4);
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62174);Assert.assertEquals(16, FunctionUtils.multiply(c, c).value(12345), EPS);

        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62175);UnivariateFunction inv = new Inverse();
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62176);UnivariateFunction pow = new Power(2);
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62177);Assert.assertEquals(1, FunctionUtils.multiply(FunctionUtils.compose(inv, pow), pow).value(3.5), EPS);
    }finally{__CLR4_4_11bxs1bxslb90pbrr.R.flushNeeded();}}

    @Test
    public void testMultiplyDifferentiable() {__CLR4_4_11bxs1bxslb90pbrr.R.globalSliceStart(getClass().getName(),62178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1seiqnb1bz6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bxs1bxslb90pbrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bxs1bxslb90pbrr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.FunctionUtilsTest.testMultiplyDifferentiable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62178,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1seiqnb1bz6(){try{__CLR4_4_11bxs1bxslb90pbrr.R.inc(62178);
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62179);UnivariateDifferentiableFunction c = new Constant(4);
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62180);UnivariateDifferentiableFunction id = new Identity();
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62181);final double a = 1.2345678;
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62182);Assert.assertEquals(8 * a, FunctionUtils.multiply(c, id, id).value(new DerivativeStructure(1, 1, 0, a)).getPartialDerivative(1), EPS);

        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62183);UnivariateDifferentiableFunction inv = new Inverse();
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62184);UnivariateDifferentiableFunction pow = new Power(2.5);
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62185);UnivariateDifferentiableFunction cos = new Cos();
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62186);Assert.assertEquals(1.5 * Math.sqrt(a) * Math.cos(a) - Math.pow(a, 1.5) * Math.sin(a),
                            FunctionUtils.multiply(inv, pow, cos).value(new DerivativeStructure(1, 1, 0, a)).getPartialDerivative(1), EPS);

        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62187);UnivariateDifferentiableFunction cosh = new Cosh();
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62188);Assert.assertEquals(1.5 * Math.sqrt(a) * Math.cosh(a) + Math.pow(a, 1.5) * Math.sinh(a),
                            FunctionUtils.multiply(inv, pow, cosh).value(new DerivativeStructure(1, 1, 0, a)).getPartialDerivative(1), 8 * EPS);
    }finally{__CLR4_4_11bxs1bxslb90pbrr.R.flushNeeded();}}

    @Test
    public void testCombine() {__CLR4_4_11bxs1bxslb90pbrr.R.globalSliceStart(getClass().getName(),62189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hvqar81bzh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bxs1bxslb90pbrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bxs1bxslb90pbrr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.FunctionUtilsTest.testCombine",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62189,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hvqar81bzh(){try{__CLR4_4_11bxs1bxslb90pbrr.R.inc(62189);
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62190);BivariateFunction bi = new Add();
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62191);UnivariateFunction id = new Identity();
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62192);UnivariateFunction m = new Minus();
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62193);UnivariateFunction c = FunctionUtils.combine(bi, id, m);
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62194);Assert.assertEquals(0, c.value(2.3456), EPS);

        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62195);bi = new Multiply();
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62196);UnivariateFunction inv = new Inverse();
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62197);c = FunctionUtils.combine(bi, id, inv);
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62198);Assert.assertEquals(1, c.value(2.3456), EPS);
    }finally{__CLR4_4_11bxs1bxslb90pbrr.R.flushNeeded();}}

    @Test
    public void testCollector() {__CLR4_4_11bxs1bxslb90pbrr.R.globalSliceStart(getClass().getName(),62199);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oqy1vm1bzr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bxs1bxslb90pbrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bxs1bxslb90pbrr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.FunctionUtilsTest.testCollector",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62199,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oqy1vm1bzr(){try{__CLR4_4_11bxs1bxslb90pbrr.R.inc(62199);
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62200);BivariateFunction bi = new Add();
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62201);MultivariateFunction coll = FunctionUtils.collector(bi, 0);
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62202);Assert.assertEquals(10, coll.value(new double[] {1, 2, 3, 4}), EPS);

        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62203);bi = new Multiply();
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62204);coll = FunctionUtils.collector(bi, 1);
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62205);Assert.assertEquals(24, coll.value(new double[] {1, 2, 3, 4}), EPS);

        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62206);bi = new Max();
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62207);coll = FunctionUtils.collector(bi, Double.NEGATIVE_INFINITY);
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62208);Assert.assertEquals(10, coll.value(new double[] {1, -2, 7.5, 10, -24, 9.99}), 0);

        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62209);bi = new Min();
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62210);coll = FunctionUtils.collector(bi, Double.POSITIVE_INFINITY);
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62211);Assert.assertEquals(-24, coll.value(new double[] {1, -2, 7.5, 10, -24, 9.99}), 0);
    }finally{__CLR4_4_11bxs1bxslb90pbrr.R.flushNeeded();}}

    @Test
    public void testSinc() {__CLR4_4_11bxs1bxslb90pbrr.R.globalSliceStart(getClass().getName(),62212);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1th5o1c04();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bxs1bxslb90pbrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bxs1bxslb90pbrr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.FunctionUtilsTest.testSinc",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62212,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1th5o1c04(){try{__CLR4_4_11bxs1bxslb90pbrr.R.inc(62212);
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62213);BivariateFunction div = new Divide();
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62214);UnivariateFunction sin = new Sin();
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62215);UnivariateFunction id = new Identity();
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62216);UnivariateFunction sinc1 = FunctionUtils.combine(div, sin, id);
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62217);UnivariateFunction sinc2 = new Sinc();

        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62218);for (int i = 0; (((i < 10)&&(__CLR4_4_11bxs1bxslb90pbrr.R.iget(62219)!=0|true))||(__CLR4_4_11bxs1bxslb90pbrr.R.iget(62220)==0&false)); i++) {{
            __CLR4_4_11bxs1bxslb90pbrr.R.inc(62221);double x = Math.random();
            __CLR4_4_11bxs1bxslb90pbrr.R.inc(62222);Assert.assertEquals(sinc1.value(x), sinc2.value(x), EPS);
        }
    }}finally{__CLR4_4_11bxs1bxslb90pbrr.R.flushNeeded();}}

    @Test
    public void testFixingArguments() {__CLR4_4_11bxs1bxslb90pbrr.R.globalSliceStart(getClass().getName(),62223);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vzkplq1c0f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bxs1bxslb90pbrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bxs1bxslb90pbrr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.FunctionUtilsTest.testFixingArguments",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62223,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vzkplq1c0f(){try{__CLR4_4_11bxs1bxslb90pbrr.R.inc(62223);
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62224);UnivariateFunction scaler = FunctionUtils.fix1stArgument(new Multiply(), 10);
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62225);Assert.assertEquals(1.23456, scaler.value(0.123456), EPS);

        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62226);UnivariateFunction pow1 = new Power(2);
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62227);UnivariateFunction pow2 = FunctionUtils.fix2ndArgument(new Pow(), 2);

        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62228);for (int i = 0; (((i < 10)&&(__CLR4_4_11bxs1bxslb90pbrr.R.iget(62229)!=0|true))||(__CLR4_4_11bxs1bxslb90pbrr.R.iget(62230)==0&false)); i++) {{
            __CLR4_4_11bxs1bxslb90pbrr.R.inc(62231);double x = Math.random() * 10;
            __CLR4_4_11bxs1bxslb90pbrr.R.inc(62232);Assert.assertEquals(pow1.value(x), pow2.value(x), 0);
        }
    }}finally{__CLR4_4_11bxs1bxslb90pbrr.R.flushNeeded();}}

    @Test(expected = NumberIsTooLargeException.class)
    public void testSampleWrongBounds(){__CLR4_4_11bxs1bxslb90pbrr.R.globalSliceStart(getClass().getName(),62233);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11ieod1c0p();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,97,109,112,108,101,87,114,111,110,103,66,111,117,110,100,115,58,32,91,78,117,109,98,101,114,73,115,84,111,111,76,97,114,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooLargeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bxs1bxslb90pbrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bxs1bxslb90pbrr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.FunctionUtilsTest.testSampleWrongBounds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62233,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11ieod1c0p(){try{__CLR4_4_11bxs1bxslb90pbrr.R.inc(62233);
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62234);FunctionUtils.sample(new Sin(), Math.PI, 0.0, 10);
    }finally{__CLR4_4_11bxs1bxslb90pbrr.R.flushNeeded();}}

    @Test(expected = NotStrictlyPositiveException.class)
    public void testSampleNegativeNumberOfPoints(){__CLR4_4_11bxs1bxslb90pbrr.R.globalSliceStart(getClass().getName(),62235);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tzawrf1c0r();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,97,109,112,108,101,78,101,103,97,116,105,118,101,78,117,109,98,101,114,79,102,80,111,105,110,116,115,58,32,91,78,111,116,83,116,114,105,99,116,108,121,80,111,115,105,116,105,118,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NotStrictlyPositiveException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bxs1bxslb90pbrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bxs1bxslb90pbrr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.FunctionUtilsTest.testSampleNegativeNumberOfPoints",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62235,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tzawrf1c0r(){try{__CLR4_4_11bxs1bxslb90pbrr.R.inc(62235);
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62236);FunctionUtils.sample(new Sin(), 0.0, Math.PI, -1);
    }finally{__CLR4_4_11bxs1bxslb90pbrr.R.flushNeeded();}}

    @Test(expected = NotStrictlyPositiveException.class)
    public void testSampleNullNumberOfPoints(){__CLR4_4_11bxs1bxslb90pbrr.R.globalSliceStart(getClass().getName(),62237);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c9dn1p1c0t();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,97,109,112,108,101,78,117,108,108,78,117,109,98,101,114,79,102,80,111,105,110,116,115,58,32,91,78,111,116,83,116,114,105,99,116,108,121,80,111,115,105,116,105,118,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NotStrictlyPositiveException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bxs1bxslb90pbrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bxs1bxslb90pbrr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.FunctionUtilsTest.testSampleNullNumberOfPoints",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62237,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c9dn1p1c0t(){try{__CLR4_4_11bxs1bxslb90pbrr.R.inc(62237);
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62238);FunctionUtils.sample(new Sin(), 0.0, Math.PI, 0);
    }finally{__CLR4_4_11bxs1bxslb90pbrr.R.flushNeeded();}}

    @Test
    public void testSample() {__CLR4_4_11bxs1bxslb90pbrr.R.globalSliceStart(getClass().getName(),62239);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bzmboj1c0v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bxs1bxslb90pbrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bxs1bxslb90pbrr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.FunctionUtilsTest.testSample",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62239,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bzmboj1c0v(){try{__CLR4_4_11bxs1bxslb90pbrr.R.inc(62239);
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62240);final int n = 11;
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62241);final double min = 0.0;
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62242);final double max = Math.PI;
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62243);final double[] actual = FunctionUtils.sample(new Sin(), min, max, n);
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62244);for (int i = 0; (((i < n)&&(__CLR4_4_11bxs1bxslb90pbrr.R.iget(62245)!=0|true))||(__CLR4_4_11bxs1bxslb90pbrr.R.iget(62246)==0&false)); i++) {{
            __CLR4_4_11bxs1bxslb90pbrr.R.inc(62247);final double x = min + (max - min) / n * i;
            __CLR4_4_11bxs1bxslb90pbrr.R.inc(62248);Assert.assertEquals("x = " + x, FastMath.sin(x), actual[i], 0.0);
        }
    }}finally{__CLR4_4_11bxs1bxslb90pbrr.R.flushNeeded();}}

    @Test
    @Deprecated
    public void testToDifferentiableUnivariateFunction() {__CLR4_4_11bxs1bxslb90pbrr.R.globalSliceStart(getClass().getName(),62249);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eqo961c15();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bxs1bxslb90pbrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bxs1bxslb90pbrr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.FunctionUtilsTest.testToDifferentiableUnivariateFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62249,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eqo961c15(){try{__CLR4_4_11bxs1bxslb90pbrr.R.inc(62249);

        // Sin implements both UnivariateDifferentiableFunction and DifferentiableUnivariateFunction
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62250);Sin sin = new Sin();
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62251);DifferentiableUnivariateFunction converted = FunctionUtils.toDifferentiableUnivariateFunction(sin);
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62252);for (double x = 0.1; (((x < 0.5)&&(__CLR4_4_11bxs1bxslb90pbrr.R.iget(62253)!=0|true))||(__CLR4_4_11bxs1bxslb90pbrr.R.iget(62254)==0&false)); x += 0.01) {{
            __CLR4_4_11bxs1bxslb90pbrr.R.inc(62255);Assert.assertEquals(sin.value(x), converted.value(x), 1.0e-10);
            __CLR4_4_11bxs1bxslb90pbrr.R.inc(62256);Assert.assertEquals(sin.derivative().value(x), converted.derivative().value(x), 1.0e-10);
        }

    }}finally{__CLR4_4_11bxs1bxslb90pbrr.R.flushNeeded();}}

    @Test
    @Deprecated
    public void testToUnivariateDifferential() {__CLR4_4_11bxs1bxslb90pbrr.R.globalSliceStart(getClass().getName(),62257);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12lz9w11c1d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bxs1bxslb90pbrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bxs1bxslb90pbrr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.FunctionUtilsTest.testToUnivariateDifferential",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62257,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12lz9w11c1d(){try{__CLR4_4_11bxs1bxslb90pbrr.R.inc(62257);

        // Sin implements both UnivariateDifferentiableFunction and DifferentiableUnivariateFunction
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62258);Sin sin = new Sin();
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62259);UnivariateDifferentiableFunction converted = FunctionUtils.toUnivariateDifferential(sin);
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62260);for (double x = 0.1; (((x < 0.5)&&(__CLR4_4_11bxs1bxslb90pbrr.R.iget(62261)!=0|true))||(__CLR4_4_11bxs1bxslb90pbrr.R.iget(62262)==0&false)); x += 0.01) {{
            __CLR4_4_11bxs1bxslb90pbrr.R.inc(62263);DerivativeStructure t = new DerivativeStructure(2, 1, x, 1.0, 2.0);
            __CLR4_4_11bxs1bxslb90pbrr.R.inc(62264);Assert.assertEquals(sin.value(t).getValue(), converted.value(t).getValue(), 1.0e-10);
            __CLR4_4_11bxs1bxslb90pbrr.R.inc(62265);Assert.assertEquals(sin.value(t).getPartialDerivative(1, 0),
                                converted.value(t).getPartialDerivative(1, 0),
                                1.0e-10);
            __CLR4_4_11bxs1bxslb90pbrr.R.inc(62266);Assert.assertEquals(sin.value(t).getPartialDerivative(0, 1),
                                converted.value(t).getPartialDerivative(0, 1),
                                1.0e-10);
        }

    }}finally{__CLR4_4_11bxs1bxslb90pbrr.R.flushNeeded();}}

    @Test
    @Deprecated
    public void testToDifferentiableMultivariateFunction() {__CLR4_4_11bxs1bxslb90pbrr.R.globalSliceStart(getClass().getName(),62267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z7lnl91c1n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bxs1bxslb90pbrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bxs1bxslb90pbrr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.FunctionUtilsTest.testToDifferentiableMultivariateFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62267,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z7lnl91c1n(){try{__CLR4_4_11bxs1bxslb90pbrr.R.inc(62267);

        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62268);MultivariateDifferentiableFunction hypot = new MultivariateDifferentiableFunction() {
            
            public double value(double[] point) {try{__CLR4_4_11bxs1bxslb90pbrr.R.inc(62269);
                __CLR4_4_11bxs1bxslb90pbrr.R.inc(62270);return FastMath.hypot(point[0], point[1]);
            }finally{__CLR4_4_11bxs1bxslb90pbrr.R.flushNeeded();}}
            
            public DerivativeStructure value(DerivativeStructure[] point) {try{__CLR4_4_11bxs1bxslb90pbrr.R.inc(62271);
                __CLR4_4_11bxs1bxslb90pbrr.R.inc(62272);return DerivativeStructure.hypot(point[0], point[1]);
            }finally{__CLR4_4_11bxs1bxslb90pbrr.R.flushNeeded();}}
        };

        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62273);DifferentiableMultivariateFunction converted = FunctionUtils.toDifferentiableMultivariateFunction(hypot);
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62274);for (double x = 0.1; (((x < 0.5)&&(__CLR4_4_11bxs1bxslb90pbrr.R.iget(62275)!=0|true))||(__CLR4_4_11bxs1bxslb90pbrr.R.iget(62276)==0&false)); x += 0.01) {{
            __CLR4_4_11bxs1bxslb90pbrr.R.inc(62277);for (double y = 0.1; (((y < 0.5)&&(__CLR4_4_11bxs1bxslb90pbrr.R.iget(62278)!=0|true))||(__CLR4_4_11bxs1bxslb90pbrr.R.iget(62279)==0&false)); y += 0.01) {{
                __CLR4_4_11bxs1bxslb90pbrr.R.inc(62280);double[] point = new double[] { x, y };
                __CLR4_4_11bxs1bxslb90pbrr.R.inc(62281);Assert.assertEquals(hypot.value(point), converted.value(point), 1.0e-10);
                __CLR4_4_11bxs1bxslb90pbrr.R.inc(62282);Assert.assertEquals(x / hypot.value(point), converted.gradient().value(point)[0], 1.0e-10);
                __CLR4_4_11bxs1bxslb90pbrr.R.inc(62283);Assert.assertEquals(y / hypot.value(point), converted.gradient().value(point)[1], 1.0e-10);
            }
        }}

    }}finally{__CLR4_4_11bxs1bxslb90pbrr.R.flushNeeded();}}

    @Test
    @Deprecated
    public void testToMultivariateDifferentiableFunction() {__CLR4_4_11bxs1bxslb90pbrr.R.globalSliceStart(getClass().getName(),62284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hfuhrh1c24();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bxs1bxslb90pbrr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bxs1bxslb90pbrr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.FunctionUtilsTest.testToMultivariateDifferentiableFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62284,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hfuhrh1c24(){try{__CLR4_4_11bxs1bxslb90pbrr.R.inc(62284);

        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62285);DifferentiableMultivariateFunction hypot = new DifferentiableMultivariateFunction() {
            
            public double value(double[] point) {try{__CLR4_4_11bxs1bxslb90pbrr.R.inc(62286);
                __CLR4_4_11bxs1bxslb90pbrr.R.inc(62287);return FastMath.hypot(point[0], point[1]);
            }finally{__CLR4_4_11bxs1bxslb90pbrr.R.flushNeeded();}}

            public MultivariateFunction partialDerivative(final int k) {try{__CLR4_4_11bxs1bxslb90pbrr.R.inc(62288);
                __CLR4_4_11bxs1bxslb90pbrr.R.inc(62289);return new MultivariateFunction() {
                    public double value(double[] point) {try{__CLR4_4_11bxs1bxslb90pbrr.R.inc(62290);
                        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62291);return point[k] / FastMath.hypot(point[0], point[1]);
                    }finally{__CLR4_4_11bxs1bxslb90pbrr.R.flushNeeded();}}
                };
            }finally{__CLR4_4_11bxs1bxslb90pbrr.R.flushNeeded();}}

            public MultivariateVectorFunction gradient() {try{__CLR4_4_11bxs1bxslb90pbrr.R.inc(62292);
                __CLR4_4_11bxs1bxslb90pbrr.R.inc(62293);return new MultivariateVectorFunction() {
                    public double[] value(double[] point) {try{__CLR4_4_11bxs1bxslb90pbrr.R.inc(62294);
                        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62295);final double h = FastMath.hypot(point[0], point[1]);
                        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62296);return new double[] { point[0] / h, point[1] / h };
                    }finally{__CLR4_4_11bxs1bxslb90pbrr.R.flushNeeded();}}
                };
            }finally{__CLR4_4_11bxs1bxslb90pbrr.R.flushNeeded();}}
            
        };

        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62297);MultivariateDifferentiableFunction converted = FunctionUtils.toMultivariateDifferentiableFunction(hypot);
        __CLR4_4_11bxs1bxslb90pbrr.R.inc(62298);for (double x = 0.1; (((x < 0.5)&&(__CLR4_4_11bxs1bxslb90pbrr.R.iget(62299)!=0|true))||(__CLR4_4_11bxs1bxslb90pbrr.R.iget(62300)==0&false)); x += 0.01) {{
            __CLR4_4_11bxs1bxslb90pbrr.R.inc(62301);for (double y = 0.1; (((y < 0.5)&&(__CLR4_4_11bxs1bxslb90pbrr.R.iget(62302)!=0|true))||(__CLR4_4_11bxs1bxslb90pbrr.R.iget(62303)==0&false)); y += 0.01) {{
                __CLR4_4_11bxs1bxslb90pbrr.R.inc(62304);DerivativeStructure[] t = new DerivativeStructure[] {
                    new DerivativeStructure(3, 1, x, 1.0, 2.0, 3.0 ),
                    new DerivativeStructure(3, 1, y, 4.0, 5.0, 6.0 )
                };
                __CLR4_4_11bxs1bxslb90pbrr.R.inc(62305);DerivativeStructure h = DerivativeStructure.hypot(t[0], t[1]);
                __CLR4_4_11bxs1bxslb90pbrr.R.inc(62306);Assert.assertEquals(h.getValue(), converted.value(t).getValue(), 1.0e-10);
                __CLR4_4_11bxs1bxslb90pbrr.R.inc(62307);Assert.assertEquals(h.getPartialDerivative(1, 0, 0),
                                    converted.value(t).getPartialDerivative(1, 0, 0),
                                    1.0e-10);
                __CLR4_4_11bxs1bxslb90pbrr.R.inc(62308);Assert.assertEquals(h.getPartialDerivative(0, 1, 0),
                                    converted.value(t).getPartialDerivative(0, 1, 0),
                                    1.0e-10);
                __CLR4_4_11bxs1bxslb90pbrr.R.inc(62309);Assert.assertEquals(h.getPartialDerivative(0, 0, 1),
                                    converted.value(t).getPartialDerivative(0, 0, 1),
                                    1.0e-10);
            }
        }}
    }}finally{__CLR4_4_11bxs1bxslb90pbrr.R.flushNeeded();}}

}
