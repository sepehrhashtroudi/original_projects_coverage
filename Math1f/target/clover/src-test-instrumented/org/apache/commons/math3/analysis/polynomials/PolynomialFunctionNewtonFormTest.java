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

import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.junit.Assert;
import org.junit.Test;


/**
 * Test case for Newton form of polynomial function.
 * <p>
 * The small tolerance number is used only to account for round-off errors.
 *
 * @version $Id$
 */
public final class PolynomialFunctionNewtonFormTest {static class __CLR4_4_11g5p1g5plb90pc33{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,67695,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Test of polynomial for the linear function.
     */
    @Test
    public void testLinearFunction() {__CLR4_4_11g5p1g5plb90pc33.R.globalSliceStart(getClass().getName(),67597);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t6bdje1g5p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g5p1g5plb90pc33.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g5p1g5plb90pc33.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonFormTest.testLinearFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67597,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t6bdje1g5p(){try{__CLR4_4_11g5p1g5plb90pc33.R.inc(67597);
        __CLR4_4_11g5p1g5plb90pc33.R.inc(67598);PolynomialFunctionNewtonForm p;
        __CLR4_4_11g5p1g5plb90pc33.R.inc(67599);double coefficients[], z, expected, result, tolerance = 1E-12;

        // p(x) = 1.5x - 4 = 2 + 1.5(x-4)
        __CLR4_4_11g5p1g5plb90pc33.R.inc(67600);double a[] = { 2.0, 1.5 };
        __CLR4_4_11g5p1g5plb90pc33.R.inc(67601);double c[] = { 4.0 };
        __CLR4_4_11g5p1g5plb90pc33.R.inc(67602);p = new PolynomialFunctionNewtonForm(a, c);

        __CLR4_4_11g5p1g5plb90pc33.R.inc(67603);z = 2.0; __CLR4_4_11g5p1g5plb90pc33.R.inc(67604);expected = -1.0; __CLR4_4_11g5p1g5plb90pc33.R.inc(67605);result = p.value(z);
        __CLR4_4_11g5p1g5plb90pc33.R.inc(67606);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11g5p1g5plb90pc33.R.inc(67607);z = 4.5; __CLR4_4_11g5p1g5plb90pc33.R.inc(67608);expected = 2.75; __CLR4_4_11g5p1g5plb90pc33.R.inc(67609);result = p.value(z);
        __CLR4_4_11g5p1g5plb90pc33.R.inc(67610);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11g5p1g5plb90pc33.R.inc(67611);z = 6.0; __CLR4_4_11g5p1g5plb90pc33.R.inc(67612);expected = 5.0; __CLR4_4_11g5p1g5plb90pc33.R.inc(67613);result = p.value(z);
        __CLR4_4_11g5p1g5plb90pc33.R.inc(67614);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11g5p1g5plb90pc33.R.inc(67615);Assert.assertEquals(1, p.degree());

        __CLR4_4_11g5p1g5plb90pc33.R.inc(67616);coefficients = p.getCoefficients();
        __CLR4_4_11g5p1g5plb90pc33.R.inc(67617);Assert.assertEquals(2, coefficients.length);
        __CLR4_4_11g5p1g5plb90pc33.R.inc(67618);Assert.assertEquals(-4.0, coefficients[0], tolerance);
        __CLR4_4_11g5p1g5plb90pc33.R.inc(67619);Assert.assertEquals(1.5, coefficients[1], tolerance);
    }finally{__CLR4_4_11g5p1g5plb90pc33.R.flushNeeded();}}

    /**
     * Test of polynomial for the quadratic function.
     */
    @Test
    public void testQuadraticFunction() {__CLR4_4_11g5p1g5plb90pc33.R.globalSliceStart(getClass().getName(),67620);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16ocpph1g6c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g5p1g5plb90pc33.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g5p1g5plb90pc33.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonFormTest.testQuadraticFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67620,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16ocpph1g6c(){try{__CLR4_4_11g5p1g5plb90pc33.R.inc(67620);
        __CLR4_4_11g5p1g5plb90pc33.R.inc(67621);PolynomialFunctionNewtonForm p;
        __CLR4_4_11g5p1g5plb90pc33.R.inc(67622);double coefficients[], z, expected, result, tolerance = 1E-12;

        // p(x) = 2x^2 + 5x - 3 = 4 + 3(x-1) + 2(x-1)(x+2)
        __CLR4_4_11g5p1g5plb90pc33.R.inc(67623);double a[] = { 4.0, 3.0, 2.0 };
        __CLR4_4_11g5p1g5plb90pc33.R.inc(67624);double c[] = { 1.0, -2.0 };
        __CLR4_4_11g5p1g5plb90pc33.R.inc(67625);p = new PolynomialFunctionNewtonForm(a, c);

        __CLR4_4_11g5p1g5plb90pc33.R.inc(67626);z = 1.0; __CLR4_4_11g5p1g5plb90pc33.R.inc(67627);expected = 4.0; __CLR4_4_11g5p1g5plb90pc33.R.inc(67628);result = p.value(z);
        __CLR4_4_11g5p1g5plb90pc33.R.inc(67629);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11g5p1g5plb90pc33.R.inc(67630);z = 2.5; __CLR4_4_11g5p1g5plb90pc33.R.inc(67631);expected = 22.0; __CLR4_4_11g5p1g5plb90pc33.R.inc(67632);result = p.value(z);
        __CLR4_4_11g5p1g5plb90pc33.R.inc(67633);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11g5p1g5plb90pc33.R.inc(67634);z = -2.0; __CLR4_4_11g5p1g5plb90pc33.R.inc(67635);expected = -5.0; __CLR4_4_11g5p1g5plb90pc33.R.inc(67636);result = p.value(z);
        __CLR4_4_11g5p1g5plb90pc33.R.inc(67637);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11g5p1g5plb90pc33.R.inc(67638);Assert.assertEquals(2, p.degree());

        __CLR4_4_11g5p1g5plb90pc33.R.inc(67639);coefficients = p.getCoefficients();
        __CLR4_4_11g5p1g5plb90pc33.R.inc(67640);Assert.assertEquals(3, coefficients.length);
        __CLR4_4_11g5p1g5plb90pc33.R.inc(67641);Assert.assertEquals(-3.0, coefficients[0], tolerance);
        __CLR4_4_11g5p1g5plb90pc33.R.inc(67642);Assert.assertEquals(5.0, coefficients[1], tolerance);
        __CLR4_4_11g5p1g5plb90pc33.R.inc(67643);Assert.assertEquals(2.0, coefficients[2], tolerance);
    }finally{__CLR4_4_11g5p1g5plb90pc33.R.flushNeeded();}}

    /**
     * Test of polynomial for the quintic function.
     */
    @Test
    public void testQuinticFunction() {__CLR4_4_11g5p1g5plb90pc33.R.globalSliceStart(getClass().getName(),67644);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lbc2oi1g70();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g5p1g5plb90pc33.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g5p1g5plb90pc33.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonFormTest.testQuinticFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67644,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lbc2oi1g70(){try{__CLR4_4_11g5p1g5plb90pc33.R.inc(67644);
        __CLR4_4_11g5p1g5plb90pc33.R.inc(67645);PolynomialFunctionNewtonForm p;
        __CLR4_4_11g5p1g5plb90pc33.R.inc(67646);double coefficients[], z, expected, result, tolerance = 1E-12;

        // p(x) = x^5 - x^4 - 7x^3 + x^2 + 6x
        //      = 6x - 6x^2 -6x^2(x-1) + x^2(x-1)(x+1) + x^2(x-1)(x+1)(x-2)
        __CLR4_4_11g5p1g5plb90pc33.R.inc(67647);double a[] = { 0.0, 6.0, -6.0, -6.0, 1.0, 1.0 };
        __CLR4_4_11g5p1g5plb90pc33.R.inc(67648);double c[] = { 0.0, 0.0, 1.0, -1.0, 2.0 };
        __CLR4_4_11g5p1g5plb90pc33.R.inc(67649);p = new PolynomialFunctionNewtonForm(a, c);

        __CLR4_4_11g5p1g5plb90pc33.R.inc(67650);z = 0.0; __CLR4_4_11g5p1g5plb90pc33.R.inc(67651);expected = 0.0; __CLR4_4_11g5p1g5plb90pc33.R.inc(67652);result = p.value(z);
        __CLR4_4_11g5p1g5plb90pc33.R.inc(67653);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11g5p1g5plb90pc33.R.inc(67654);z = -2.0; __CLR4_4_11g5p1g5plb90pc33.R.inc(67655);expected = 0.0; __CLR4_4_11g5p1g5plb90pc33.R.inc(67656);result = p.value(z);
        __CLR4_4_11g5p1g5plb90pc33.R.inc(67657);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11g5p1g5plb90pc33.R.inc(67658);z = 4.0; __CLR4_4_11g5p1g5plb90pc33.R.inc(67659);expected = 360.0; __CLR4_4_11g5p1g5plb90pc33.R.inc(67660);result = p.value(z);
        __CLR4_4_11g5p1g5plb90pc33.R.inc(67661);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11g5p1g5plb90pc33.R.inc(67662);Assert.assertEquals(5, p.degree());

        __CLR4_4_11g5p1g5plb90pc33.R.inc(67663);coefficients = p.getCoefficients();
        __CLR4_4_11g5p1g5plb90pc33.R.inc(67664);Assert.assertEquals(6, coefficients.length);
        __CLR4_4_11g5p1g5plb90pc33.R.inc(67665);Assert.assertEquals(0.0, coefficients[0], tolerance);
        __CLR4_4_11g5p1g5plb90pc33.R.inc(67666);Assert.assertEquals(6.0, coefficients[1], tolerance);
        __CLR4_4_11g5p1g5plb90pc33.R.inc(67667);Assert.assertEquals(1.0, coefficients[2], tolerance);
        __CLR4_4_11g5p1g5plb90pc33.R.inc(67668);Assert.assertEquals(-7.0, coefficients[3], tolerance);
        __CLR4_4_11g5p1g5plb90pc33.R.inc(67669);Assert.assertEquals(-1.0, coefficients[4], tolerance);
        __CLR4_4_11g5p1g5plb90pc33.R.inc(67670);Assert.assertEquals(1.0, coefficients[5], tolerance);
    }finally{__CLR4_4_11g5p1g5plb90pc33.R.flushNeeded();}}

    /**
     * Test for derivatives.
     */
    @Test
    public void testDerivative() {__CLR4_4_11g5p1g5plb90pc33.R.globalSliceStart(getClass().getName(),67671);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_115h6u81g7r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g5p1g5plb90pc33.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g5p1g5plb90pc33.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonFormTest.testDerivative",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67671,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_115h6u81g7r(){try{__CLR4_4_11g5p1g5plb90pc33.R.inc(67671);

        // x^3 = 0 * [1] + 1 * [x] + 3 * [x(x-1)] + 1 * [x(x-1)(x-2)]
        __CLR4_4_11g5p1g5plb90pc33.R.inc(67672);PolynomialFunctionNewtonForm p =
                new PolynomialFunctionNewtonForm(new double[] { 0, 1, 3, 1 },
                                                 new double[] { 0, 1, 2 });

        __CLR4_4_11g5p1g5plb90pc33.R.inc(67673);double eps = 2.0e-14;
        __CLR4_4_11g5p1g5plb90pc33.R.inc(67674);for (double t = 0.0; (((t < 10.0)&&(__CLR4_4_11g5p1g5plb90pc33.R.iget(67675)!=0|true))||(__CLR4_4_11g5p1g5plb90pc33.R.iget(67676)==0&false)); t += 0.1) {{
            __CLR4_4_11g5p1g5plb90pc33.R.inc(67677);DerivativeStructure x = new DerivativeStructure(1, 4, 0, t);
            __CLR4_4_11g5p1g5plb90pc33.R.inc(67678);DerivativeStructure y = p.value(x);
            __CLR4_4_11g5p1g5plb90pc33.R.inc(67679);Assert.assertEquals(t * t * t,   y.getValue(),              eps * t * t * t);
            __CLR4_4_11g5p1g5plb90pc33.R.inc(67680);Assert.assertEquals(3.0 * t * t, y.getPartialDerivative(1), eps * 3.0 * t * t);
            __CLR4_4_11g5p1g5plb90pc33.R.inc(67681);Assert.assertEquals(6.0 * t,     y.getPartialDerivative(2), eps * 6.0 * t);
            __CLR4_4_11g5p1g5plb90pc33.R.inc(67682);Assert.assertEquals(6.0,         y.getPartialDerivative(3), eps * 6.0);
            __CLR4_4_11g5p1g5plb90pc33.R.inc(67683);Assert.assertEquals(0.0,         y.getPartialDerivative(4), eps);
        }

    }}finally{__CLR4_4_11g5p1g5plb90pc33.R.flushNeeded();}}

    /**
     * Test of parameters for the polynomial.
     */
    @Test
    public void testParameters() {__CLR4_4_11g5p1g5plb90pc33.R.globalSliceStart(getClass().getName(),67684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f58btv1g84();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g5p1g5plb90pc33.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g5p1g5plb90pc33.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonFormTest.testParameters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67684,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f58btv1g84(){try{__CLR4_4_11g5p1g5plb90pc33.R.inc(67684);

        __CLR4_4_11g5p1g5plb90pc33.R.inc(67685);try {
            // bad input array length
            __CLR4_4_11g5p1g5plb90pc33.R.inc(67686);double a[] = { 1.0 };
            __CLR4_4_11g5p1g5plb90pc33.R.inc(67687);double c[] = { 2.0 };
            __CLR4_4_11g5p1g5plb90pc33.R.inc(67688);new PolynomialFunctionNewtonForm(a, c);
            __CLR4_4_11g5p1g5plb90pc33.R.inc(67689);Assert.fail("Expecting MathIllegalArgumentException - bad input array length");
        } catch (MathIllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_11g5p1g5plb90pc33.R.inc(67690);try {
            // mismatch input arrays
            __CLR4_4_11g5p1g5plb90pc33.R.inc(67691);double a[] = { 1.0, 2.0, 3.0, 4.0 };
            __CLR4_4_11g5p1g5plb90pc33.R.inc(67692);double c[] = { 4.0, 3.0, 2.0, 1.0 };
            __CLR4_4_11g5p1g5plb90pc33.R.inc(67693);new PolynomialFunctionNewtonForm(a, c);
            __CLR4_4_11g5p1g5plb90pc33.R.inc(67694);Assert.fail("Expecting MathIllegalArgumentException - mismatch input arrays");
        } catch (MathIllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_11g5p1g5plb90pc33.R.flushNeeded();}}
}
