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

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test case for Lagrange form of polynomial function.
 * <p>
 * We use n+1 points to interpolate a polynomial of degree n. This should
 * give us the exact same polynomial as result. Thus we can use a very
 * small tolerance to account only for round-off errors.
 *
 * @version $Id$
 */
public final class PolynomialFunctionLagrangeFormTest {static class __CLR4_4_11g3c1g3clb90pc2y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,67597,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Test of polynomial for the linear function.
     */
    @Test
    public void testLinearFunction() {__CLR4_4_11g3c1g3clb90pc2y.R.globalSliceStart(getClass().getName(),67512);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t6bdje1g3c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g3c1g3clb90pc2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g3c1g3clb90pc2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeFormTest.testLinearFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67512,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t6bdje1g3c(){try{__CLR4_4_11g3c1g3clb90pc2y.R.inc(67512);
        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67513);PolynomialFunctionLagrangeForm p;
        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67514);double c[], z, expected, result, tolerance = 1E-12;

        // p(x) = 1.5x - 4
        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67515);double x[] = { 0.0, 3.0 };
        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67516);double y[] = { -4.0, 0.5 };
        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67517);p = new PolynomialFunctionLagrangeForm(x, y);

        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67518);z = 2.0; __CLR4_4_11g3c1g3clb90pc2y.R.inc(67519);expected = -1.0; __CLR4_4_11g3c1g3clb90pc2y.R.inc(67520);result = p.value(z);
        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67521);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67522);z = 4.5; __CLR4_4_11g3c1g3clb90pc2y.R.inc(67523);expected = 2.75; __CLR4_4_11g3c1g3clb90pc2y.R.inc(67524);result = p.value(z);
        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67525);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67526);z = 6.0; __CLR4_4_11g3c1g3clb90pc2y.R.inc(67527);expected = 5.0; __CLR4_4_11g3c1g3clb90pc2y.R.inc(67528);result = p.value(z);
        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67529);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67530);Assert.assertEquals(1, p.degree());

        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67531);c = p.getCoefficients();
        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67532);Assert.assertEquals(2, c.length);
        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67533);Assert.assertEquals(-4.0, c[0], tolerance);
        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67534);Assert.assertEquals(1.5, c[1], tolerance);
    }finally{__CLR4_4_11g3c1g3clb90pc2y.R.flushNeeded();}}

    /**
     * Test of polynomial for the quadratic function.
     */
    @Test
    public void testQuadraticFunction() {__CLR4_4_11g3c1g3clb90pc2y.R.globalSliceStart(getClass().getName(),67535);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16ocpph1g3z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g3c1g3clb90pc2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g3c1g3clb90pc2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeFormTest.testQuadraticFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67535,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16ocpph1g3z(){try{__CLR4_4_11g3c1g3clb90pc2y.R.inc(67535);
        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67536);PolynomialFunctionLagrangeForm p;
        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67537);double c[], z, expected, result, tolerance = 1E-12;

        // p(x) = 2x^2 + 5x - 3 = (2x - 1)(x + 3)
        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67538);double x[] = { 0.0, -1.0, 0.5 };
        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67539);double y[] = { -3.0, -6.0, 0.0 };
        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67540);p = new PolynomialFunctionLagrangeForm(x, y);

        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67541);z = 1.0; __CLR4_4_11g3c1g3clb90pc2y.R.inc(67542);expected = 4.0; __CLR4_4_11g3c1g3clb90pc2y.R.inc(67543);result = p.value(z);
        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67544);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67545);z = 2.5; __CLR4_4_11g3c1g3clb90pc2y.R.inc(67546);expected = 22.0; __CLR4_4_11g3c1g3clb90pc2y.R.inc(67547);result = p.value(z);
        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67548);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67549);z = -2.0; __CLR4_4_11g3c1g3clb90pc2y.R.inc(67550);expected = -5.0; __CLR4_4_11g3c1g3clb90pc2y.R.inc(67551);result = p.value(z);
        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67552);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67553);Assert.assertEquals(2, p.degree());

        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67554);c = p.getCoefficients();
        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67555);Assert.assertEquals(3, c.length);
        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67556);Assert.assertEquals(-3.0, c[0], tolerance);
        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67557);Assert.assertEquals(5.0, c[1], tolerance);
        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67558);Assert.assertEquals(2.0, c[2], tolerance);
    }finally{__CLR4_4_11g3c1g3clb90pc2y.R.flushNeeded();}}

    /**
     * Test of polynomial for the quintic function.
     */
    @Test
    public void testQuinticFunction() {__CLR4_4_11g3c1g3clb90pc2y.R.globalSliceStart(getClass().getName(),67559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lbc2oi1g4n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g3c1g3clb90pc2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g3c1g3clb90pc2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeFormTest.testQuinticFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67559,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lbc2oi1g4n(){try{__CLR4_4_11g3c1g3clb90pc2y.R.inc(67559);
        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67560);PolynomialFunctionLagrangeForm p;
        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67561);double c[], z, expected, result, tolerance = 1E-12;

        // p(x) = x^5 - x^4 - 7x^3 + x^2 + 6x = x(x^2 - 1)(x + 2)(x - 3)
        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67562);double x[] = { 1.0, -1.0, 2.0, 3.0, -3.0, 0.5 };
        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67563);double y[] = { 0.0, 0.0, -24.0, 0.0, -144.0, 2.34375 };
        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67564);p = new PolynomialFunctionLagrangeForm(x, y);

        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67565);z = 0.0; __CLR4_4_11g3c1g3clb90pc2y.R.inc(67566);expected = 0.0; __CLR4_4_11g3c1g3clb90pc2y.R.inc(67567);result = p.value(z);
        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67568);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67569);z = -2.0; __CLR4_4_11g3c1g3clb90pc2y.R.inc(67570);expected = 0.0; __CLR4_4_11g3c1g3clb90pc2y.R.inc(67571);result = p.value(z);
        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67572);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67573);z = 4.0; __CLR4_4_11g3c1g3clb90pc2y.R.inc(67574);expected = 360.0; __CLR4_4_11g3c1g3clb90pc2y.R.inc(67575);result = p.value(z);
        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67576);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67577);Assert.assertEquals(5, p.degree());

        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67578);c = p.getCoefficients();
        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67579);Assert.assertEquals(6, c.length);
        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67580);Assert.assertEquals(0.0, c[0], tolerance);
        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67581);Assert.assertEquals(6.0, c[1], tolerance);
        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67582);Assert.assertEquals(1.0, c[2], tolerance);
        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67583);Assert.assertEquals(-7.0, c[3], tolerance);
        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67584);Assert.assertEquals(-1.0, c[4], tolerance);
        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67585);Assert.assertEquals(1.0, c[5], tolerance);
    }finally{__CLR4_4_11g3c1g3clb90pc2y.R.flushNeeded();}}

    /**
     * Test of parameters for the polynomial.
     */
    @Test
    public void testParameters() {__CLR4_4_11g3c1g3clb90pc2y.R.globalSliceStart(getClass().getName(),67586);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f58btv1g5e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g3c1g3clb90pc2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g3c1g3clb90pc2y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeFormTest.testParameters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67586,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f58btv1g5e(){try{__CLR4_4_11g3c1g3clb90pc2y.R.inc(67586);

        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67587);try {
            // bad input array length
            __CLR4_4_11g3c1g3clb90pc2y.R.inc(67588);double x[] = { 1.0 };
            __CLR4_4_11g3c1g3clb90pc2y.R.inc(67589);double y[] = { 2.0 };
            __CLR4_4_11g3c1g3clb90pc2y.R.inc(67590);new PolynomialFunctionLagrangeForm(x, y);
            __CLR4_4_11g3c1g3clb90pc2y.R.inc(67591);Assert.fail("Expecting MathIllegalArgumentException - bad input array length");
        } catch (MathIllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_11g3c1g3clb90pc2y.R.inc(67592);try {
            // mismatch input arrays
            __CLR4_4_11g3c1g3clb90pc2y.R.inc(67593);double x[] = { 1.0, 2.0, 3.0, 4.0 };
            __CLR4_4_11g3c1g3clb90pc2y.R.inc(67594);double y[] = { 0.0, -4.0, -24.0 };
            __CLR4_4_11g3c1g3clb90pc2y.R.inc(67595);new PolynomialFunctionLagrangeForm(x, y);
            __CLR4_4_11g3c1g3clb90pc2y.R.inc(67596);Assert.fail("Expecting MathIllegalArgumentException - mismatch input arrays");
        } catch (MathIllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_11g3c1g3clb90pc2y.R.flushNeeded();}}
}
