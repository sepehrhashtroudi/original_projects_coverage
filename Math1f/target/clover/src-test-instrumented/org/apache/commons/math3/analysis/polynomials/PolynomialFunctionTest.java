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
package org.apache.commons.math3.analysis.polynomials;

import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.util.FastMath;

import org.junit.Test;
import org.junit.Assert;

/**
 * Tests the PolynomialFunction implementation of a UnivariateFunction.
 *
 * @version $Id$
 */
public final class PolynomialFunctionTest {static class __CLR4_4_11g8f1g8flb90pc3b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,67814,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Error tolerance for tests */
    protected double tolerance = 1e-12;

    /**
     * tests the value of a constant polynomial.
     *
     * <p>value of this is 2.5 everywhere.</p>
     */
    @Test
    public void testConstants() {__CLR4_4_11g8f1g8flb90pc3b.R.globalSliceStart(getClass().getName(),67695);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15epzlw1g8f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g8f1g8flb90pc3b.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g8f1g8flb90pc3b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest.testConstants",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67695,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15epzlw1g8f(){try{__CLR4_4_11g8f1g8flb90pc3b.R.inc(67695);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67696);double[] c = { 2.5 };
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67697);PolynomialFunction f = new PolynomialFunction(c);

        // verify that we are equal to c[0] at several (nonsymmetric) places
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67698);Assert.assertEquals(f.value(0), c[0], tolerance);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67699);Assert.assertEquals(f.value(-1), c[0], tolerance);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67700);Assert.assertEquals(f.value(-123.5), c[0], tolerance);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67701);Assert.assertEquals(f.value(3), c[0], tolerance);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67702);Assert.assertEquals(f.value(456.89), c[0], tolerance);

        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67703);Assert.assertEquals(f.degree(), 0);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67704);Assert.assertEquals(f.derivative().value(0), 0, tolerance);

        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67705);Assert.assertEquals(f.polynomialDerivative().derivative().value(0), 0, tolerance);
    }finally{__CLR4_4_11g8f1g8flb90pc3b.R.flushNeeded();}}

    /**
     * tests the value of a linear polynomial.
     *
     * <p>This will test the function f(x) = 3*x - 1.5</p>
     * <p>This will have the values
     *  <tt>f(0) = -1.5, f(-1) = -4.5, f(-2.5) = -9,
     *      f(0.5) = 0, f(1.5) = 3</tt> and <tt>f(3) = 7.5</tt>
     * </p>
     */
    @Test
    public void testLinear() {__CLR4_4_11g8f1g8flb90pc3b.R.globalSliceStart(getClass().getName(),67706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12wwc3m1g8q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g8f1g8flb90pc3b.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g8f1g8flb90pc3b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest.testLinear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67706,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12wwc3m1g8q(){try{__CLR4_4_11g8f1g8flb90pc3b.R.inc(67706);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67707);double[] c = { -1.5, 3 };
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67708);PolynomialFunction f = new PolynomialFunction(c);

        // verify that we are equal to c[0] when x=0
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67709);Assert.assertEquals(f.value(0), c[0], tolerance);

        // now check a few other places
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67710);Assert.assertEquals(-4.5, f.value(-1), tolerance);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67711);Assert.assertEquals(-9, f.value(-2.5), tolerance);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67712);Assert.assertEquals(0, f.value(0.5), tolerance);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67713);Assert.assertEquals(3, f.value(1.5), tolerance);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67714);Assert.assertEquals(7.5, f.value(3), tolerance);

        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67715);Assert.assertEquals(f.degree(), 1);

        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67716);Assert.assertEquals(f.polynomialDerivative().derivative().value(0), 0, tolerance);
    }finally{__CLR4_4_11g8f1g8flb90pc3b.R.flushNeeded();}}

    /**
     * Tests a second order polynomial.
     * <p> This will test the function f(x) = 2x^2 - 3x -2 = (2x+1)(x-2)</p>
     */
    @Test
    public void testQuadratic() {__CLR4_4_11g8f1g8flb90pc3b.R.globalSliceStart(getClass().getName(),67717);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ssocod1g91();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g8f1g8flb90pc3b.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g8f1g8flb90pc3b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest.testQuadratic",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67717,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ssocod1g91(){try{__CLR4_4_11g8f1g8flb90pc3b.R.inc(67717);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67718);double[] c = { -2, -3, 2 };
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67719);PolynomialFunction f = new PolynomialFunction(c);

        // verify that we are equal to c[0] when x=0
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67720);Assert.assertEquals(f.value(0), c[0], tolerance);

        // now check a few other places
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67721);Assert.assertEquals(0, f.value(-0.5), tolerance);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67722);Assert.assertEquals(0, f.value(2), tolerance);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67723);Assert.assertEquals(-2, f.value(1.5), tolerance);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67724);Assert.assertEquals(7, f.value(-1.5), tolerance);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67725);Assert.assertEquals(265.5312, f.value(12.34), tolerance);
    }finally{__CLR4_4_11g8f1g8flb90pc3b.R.flushNeeded();}}

    /**
     * This will test the quintic function
     *   f(x) = x^2(x-5)(x+3)(x-1) = x^5 - 3x^4 -13x^3 + 15x^2</p>
     */
    @Test
    public void testQuintic() {__CLR4_4_11g8f1g8flb90pc3b.R.globalSliceStart(getClass().getName(),67726);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p8ejja1g9a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g8f1g8flb90pc3b.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g8f1g8flb90pc3b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest.testQuintic",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67726,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p8ejja1g9a(){try{__CLR4_4_11g8f1g8flb90pc3b.R.inc(67726);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67727);double[] c = { 0, 0, 15, -13, -3, 1 };
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67728);PolynomialFunction f = new PolynomialFunction(c);

        // verify that we are equal to c[0] when x=0
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67729);Assert.assertEquals(f.value(0), c[0], tolerance);

        // now check a few other places
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67730);Assert.assertEquals(0, f.value(5), tolerance);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67731);Assert.assertEquals(0, f.value(1), tolerance);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67732);Assert.assertEquals(0, f.value(-3), tolerance);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67733);Assert.assertEquals(54.84375, f.value(-1.5), tolerance);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67734);Assert.assertEquals(-8.06637, f.value(1.3), tolerance);

        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67735);Assert.assertEquals(f.degree(), 5);
    }finally{__CLR4_4_11g8f1g8flb90pc3b.R.flushNeeded();}}

    /**
     * tests the firstDerivative function by comparison
     *
     * <p>This will test the functions
     * <tt>f(x) = x^3 - 2x^2 + 6x + 3, g(x) = 3x^2 - 4x + 6</tt>
     * and <tt>h(x) = 6x - 4</tt>
     */
    @Test
    public void testfirstDerivativeComparison() {__CLR4_4_11g8f1g8flb90pc3b.R.globalSliceStart(getClass().getName(),67736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_120t851g9k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g8f1g8flb90pc3b.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g8f1g8flb90pc3b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest.testfirstDerivativeComparison",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67736,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_120t851g9k(){try{__CLR4_4_11g8f1g8flb90pc3b.R.inc(67736);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67737);double[] f_coeff = { 3, 6, -2, 1 };
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67738);double[] g_coeff = { 6, -4, 3 };
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67739);double[] h_coeff = { -4, 6 };

        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67740);PolynomialFunction f = new PolynomialFunction(f_coeff);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67741);PolynomialFunction g = new PolynomialFunction(g_coeff);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67742);PolynomialFunction h = new PolynomialFunction(h_coeff);

        // compare f' = g
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67743);Assert.assertEquals(f.derivative().value(0), g.value(0), tolerance);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67744);Assert.assertEquals(f.derivative().value(1), g.value(1), tolerance);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67745);Assert.assertEquals(f.derivative().value(100), g.value(100), tolerance);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67746);Assert.assertEquals(f.derivative().value(4.1), g.value(4.1), tolerance);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67747);Assert.assertEquals(f.derivative().value(-3.25), g.value(-3.25), tolerance);

        // compare g' = h
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67748);Assert.assertEquals(g.derivative().value(FastMath.PI), h.value(FastMath.PI), tolerance);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67749);Assert.assertEquals(g.derivative().value(FastMath.E),  h.value(FastMath.E),  tolerance);
    }finally{__CLR4_4_11g8f1g8flb90pc3b.R.flushNeeded();}}

    @Test
    public void testString() {__CLR4_4_11g8f1g8flb90pc3b.R.globalSliceStart(getClass().getName(),67750);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_184sgd21g9y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g8f1g8flb90pc3b.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g8f1g8flb90pc3b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest.testString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67750,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_184sgd21g9y(){try{__CLR4_4_11g8f1g8flb90pc3b.R.inc(67750);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67751);PolynomialFunction p = new PolynomialFunction(new double[] { -5, 3, 1 });
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67752);checkPolynomial(p, "-5 + 3 x + x^2");
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67753);checkPolynomial(new PolynomialFunction(new double[] { 0, -2, 3 }),
                        "-2 x + 3 x^2");
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67754);checkPolynomial(new PolynomialFunction(new double[] { 1, -2, 3 }),
                      "1 - 2 x + 3 x^2");
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67755);checkPolynomial(new PolynomialFunction(new double[] { 0,  2, 3 }),
                       "2 x + 3 x^2");
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67756);checkPolynomial(new PolynomialFunction(new double[] { 1,  2, 3 }),
                     "1 + 2 x + 3 x^2");
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67757);checkPolynomial(new PolynomialFunction(new double[] { 1,  0, 3 }),
                     "1 + 3 x^2");
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67758);checkPolynomial(new PolynomialFunction(new double[] { 0 }),
                     "0");
    }finally{__CLR4_4_11g8f1g8flb90pc3b.R.flushNeeded();}}

    @Test
    public void testAddition() {__CLR4_4_11g8f1g8flb90pc3b.R.globalSliceStart(getClass().getName(),67759);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wgxr631ga7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g8f1g8flb90pc3b.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g8f1g8flb90pc3b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest.testAddition",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67759,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wgxr631ga7(){try{__CLR4_4_11g8f1g8flb90pc3b.R.inc(67759);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67760);PolynomialFunction p1 = new PolynomialFunction(new double[] { -2, 1 });
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67761);PolynomialFunction p2 = new PolynomialFunction(new double[] { 2, -1, 0 });
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67762);checkNullPolynomial(p1.add(p2));

        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67763);p2 = p1.add(p1);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67764);checkPolynomial(p2, "-4 + 2 x");

        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67765);p1 = new PolynomialFunction(new double[] { 1, -4, 2 });
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67766);p2 = new PolynomialFunction(new double[] { -1, 3, -2 });
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67767);p1 = p1.add(p2);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67768);Assert.assertEquals(1, p1.degree());
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67769);checkPolynomial(p1, "-x");
    }finally{__CLR4_4_11g8f1g8flb90pc3b.R.flushNeeded();}}

    @Test
    public void testSubtraction() {__CLR4_4_11g8f1g8flb90pc3b.R.globalSliceStart(getClass().getName(),67770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16mkdqh1gai();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g8f1g8flb90pc3b.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g8f1g8flb90pc3b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest.testSubtraction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67770,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16mkdqh1gai(){try{__CLR4_4_11g8f1g8flb90pc3b.R.inc(67770);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67771);PolynomialFunction p1 = new PolynomialFunction(new double[] { -2, 1 });
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67772);checkNullPolynomial(p1.subtract(p1));

        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67773);PolynomialFunction p2 = new PolynomialFunction(new double[] { -2, 6 });
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67774);p2 = p2.subtract(p1);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67775);checkPolynomial(p2, "5 x");

        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67776);p1 = new PolynomialFunction(new double[] { 1, -4, 2 });
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67777);p2 = new PolynomialFunction(new double[] { -1, 3, 2 });
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67778);p1 = p1.subtract(p2);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67779);Assert.assertEquals(1, p1.degree());
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67780);checkPolynomial(p1, "2 - 7 x");
    }finally{__CLR4_4_11g8f1g8flb90pc3b.R.flushNeeded();}}

    @Test
    public void testMultiplication() {__CLR4_4_11g8f1g8flb90pc3b.R.globalSliceStart(getClass().getName(),67781);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aclc011gat();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g8f1g8flb90pc3b.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g8f1g8flb90pc3b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest.testMultiplication",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67781,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aclc011gat(){try{__CLR4_4_11g8f1g8flb90pc3b.R.inc(67781);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67782);PolynomialFunction p1 = new PolynomialFunction(new double[] { -3, 2 });
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67783);PolynomialFunction p2 = new PolynomialFunction(new double[] { 3, 2, 1 });
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67784);checkPolynomial(p1.multiply(p2), "-9 + x^2 + 2 x^3");

        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67785);p1 = new PolynomialFunction(new double[] { 0, 1 });
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67786);p2 = p1;
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67787);for (int i = 2; (((i < 10)&&(__CLR4_4_11g8f1g8flb90pc3b.R.iget(67788)!=0|true))||(__CLR4_4_11g8f1g8flb90pc3b.R.iget(67789)==0&false)); ++i) {{
            __CLR4_4_11g8f1g8flb90pc3b.R.inc(67790);p2 = p2.multiply(p1);
            __CLR4_4_11g8f1g8flb90pc3b.R.inc(67791);checkPolynomial(p2, "x^" + i);
        }
    }}finally{__CLR4_4_11g8f1g8flb90pc3b.R.flushNeeded();}}

    @Test
    public void testSerial() {__CLR4_4_11g8f1g8flb90pc3b.R.globalSliceStart(getClass().getName(),67792);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16f44lv1gb4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g8f1g8flb90pc3b.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g8f1g8flb90pc3b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest.testSerial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67792,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16f44lv1gb4(){try{__CLR4_4_11g8f1g8flb90pc3b.R.inc(67792);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67793);PolynomialFunction p2 = new PolynomialFunction(new double[] { 3, 2, 1 });
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67794);Assert.assertEquals(p2, TestUtils.serializeAndRecover(p2));
    }finally{__CLR4_4_11g8f1g8flb90pc3b.R.flushNeeded();}}

    /**
     * tests the firstDerivative function by comparison
     *
     * <p>This will test the functions
     * <tt>f(x) = x^3 - 2x^2 + 6x + 3, g(x) = 3x^2 - 4x + 6</tt>
     * and <tt>h(x) = 6x - 4</tt>
     */
    @Test
    public void testMath341() {__CLR4_4_11g8f1g8flb90pc3b.R.globalSliceStart(getClass().getName(),67795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uul0ub1gb7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g8f1g8flb90pc3b.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g8f1g8flb90pc3b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest.testMath341",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67795,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uul0ub1gb7(){try{__CLR4_4_11g8f1g8flb90pc3b.R.inc(67795);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67796);double[] f_coeff = { 3, 6, -2, 1 };
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67797);double[] g_coeff = { 6, -4, 3 };
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67798);double[] h_coeff = { -4, 6 };

        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67799);PolynomialFunction f = new PolynomialFunction(f_coeff);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67800);PolynomialFunction g = new PolynomialFunction(g_coeff);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67801);PolynomialFunction h = new PolynomialFunction(h_coeff);

        // compare f' = g
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67802);Assert.assertEquals(f.derivative().value(0), g.value(0), tolerance);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67803);Assert.assertEquals(f.derivative().value(1), g.value(1), tolerance);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67804);Assert.assertEquals(f.derivative().value(100), g.value(100), tolerance);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67805);Assert.assertEquals(f.derivative().value(4.1), g.value(4.1), tolerance);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67806);Assert.assertEquals(f.derivative().value(-3.25), g.value(-3.25), tolerance);

        // compare g' = h
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67807);Assert.assertEquals(g.derivative().value(FastMath.PI), h.value(FastMath.PI), tolerance);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67808);Assert.assertEquals(g.derivative().value(FastMath.E),  h.value(FastMath.E),  tolerance);
    }finally{__CLR4_4_11g8f1g8flb90pc3b.R.flushNeeded();}}

    public void checkPolynomial(PolynomialFunction p, String reference) {try{__CLR4_4_11g8f1g8flb90pc3b.R.inc(67809);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67810);Assert.assertEquals(reference, p.toString());
    }finally{__CLR4_4_11g8f1g8flb90pc3b.R.flushNeeded();}}

    private void checkNullPolynomial(PolynomialFunction p) {try{__CLR4_4_11g8f1g8flb90pc3b.R.inc(67811);
        __CLR4_4_11g8f1g8flb90pc3b.R.inc(67812);for (double coefficient : p.getCoefficients()) {{
            __CLR4_4_11g8f1g8flb90pc3b.R.inc(67813);Assert.assertEquals(0, coefficient, 1e-15);
        }
    }}finally{__CLR4_4_11g8f1g8flb90pc3b.R.flushNeeded();}}
}
