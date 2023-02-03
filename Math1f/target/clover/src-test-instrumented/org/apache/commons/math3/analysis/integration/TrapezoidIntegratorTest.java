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
package org.apache.commons.math3.analysis.integration;

import org.apache.commons.math3.analysis.QuinticFunction;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.function.Sin;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;


/**
 * Test case for trapezoid integrator.
 * <p>
 * Test runs show that for a default relative accuracy of 1E-6, it
 * generally takes 10 to 15 iterations for the integral to converge.
 *
 * @version $Id$
 */
public final class TrapezoidIntegratorTest {static class __CLR4_4_11eac1eaclb90pbz6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,65231,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Test of integrator for the sine function.
     */
    @Test
    public void testSinFunction() {__CLR4_4_11eac1eaclb90pbz6.R.globalSliceStart(getClass().getName(),65172);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1doerh71eac();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11eac1eaclb90pbz6.R.rethrow($CLV_t2$);}finally{__CLR4_4_11eac1eaclb90pbz6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.integration.TrapezoidIntegratorTest.testSinFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65172,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1doerh71eac(){try{__CLR4_4_11eac1eaclb90pbz6.R.inc(65172);
        __CLR4_4_11eac1eaclb90pbz6.R.inc(65173);UnivariateFunction f = new Sin();
        __CLR4_4_11eac1eaclb90pbz6.R.inc(65174);UnivariateIntegrator integrator = new TrapezoidIntegrator();
        __CLR4_4_11eac1eaclb90pbz6.R.inc(65175);double min, max, expected, result, tolerance;

        __CLR4_4_11eac1eaclb90pbz6.R.inc(65176);min = 0; __CLR4_4_11eac1eaclb90pbz6.R.inc(65177);max = FastMath.PI; __CLR4_4_11eac1eaclb90pbz6.R.inc(65178);expected = 2;
        __CLR4_4_11eac1eaclb90pbz6.R.inc(65179);tolerance = FastMath.abs(expected * integrator.getRelativeAccuracy());
        __CLR4_4_11eac1eaclb90pbz6.R.inc(65180);result = integrator.integrate(10000, f, min, max);
        __CLR4_4_11eac1eaclb90pbz6.R.inc(65181);Assert.assertTrue(integrator.getEvaluations() < 2500);
        __CLR4_4_11eac1eaclb90pbz6.R.inc(65182);Assert.assertTrue(integrator.getIterations()  < 15);
        __CLR4_4_11eac1eaclb90pbz6.R.inc(65183);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11eac1eaclb90pbz6.R.inc(65184);min = -FastMath.PI/3; __CLR4_4_11eac1eaclb90pbz6.R.inc(65185);max = 0; __CLR4_4_11eac1eaclb90pbz6.R.inc(65186);expected = -0.5;
        __CLR4_4_11eac1eaclb90pbz6.R.inc(65187);tolerance = FastMath.abs(expected * integrator.getRelativeAccuracy());
        __CLR4_4_11eac1eaclb90pbz6.R.inc(65188);result = integrator.integrate(10000, f, min, max);
        __CLR4_4_11eac1eaclb90pbz6.R.inc(65189);Assert.assertTrue(integrator.getEvaluations() < 2500);
        __CLR4_4_11eac1eaclb90pbz6.R.inc(65190);Assert.assertTrue(integrator.getIterations()  < 15);
        __CLR4_4_11eac1eaclb90pbz6.R.inc(65191);Assert.assertEquals(expected, result, tolerance);
    }finally{__CLR4_4_11eac1eaclb90pbz6.R.flushNeeded();}}

    /**
     * Test of integrator for the quintic function.
     */
    @Test
    public void testQuinticFunction() {__CLR4_4_11eac1eaclb90pbz6.R.globalSliceStart(getClass().getName(),65192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lbc2oi1eaw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11eac1eaclb90pbz6.R.rethrow($CLV_t2$);}finally{__CLR4_4_11eac1eaclb90pbz6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.integration.TrapezoidIntegratorTest.testQuinticFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65192,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lbc2oi1eaw(){try{__CLR4_4_11eac1eaclb90pbz6.R.inc(65192);
        __CLR4_4_11eac1eaclb90pbz6.R.inc(65193);UnivariateFunction f = new QuinticFunction();
        __CLR4_4_11eac1eaclb90pbz6.R.inc(65194);UnivariateIntegrator integrator = new TrapezoidIntegrator();
        __CLR4_4_11eac1eaclb90pbz6.R.inc(65195);double min, max, expected, result, tolerance;

        __CLR4_4_11eac1eaclb90pbz6.R.inc(65196);min = 0; __CLR4_4_11eac1eaclb90pbz6.R.inc(65197);max = 1; __CLR4_4_11eac1eaclb90pbz6.R.inc(65198);expected = -1.0/48;
        __CLR4_4_11eac1eaclb90pbz6.R.inc(65199);tolerance = FastMath.abs(expected * integrator.getRelativeAccuracy());
        __CLR4_4_11eac1eaclb90pbz6.R.inc(65200);result = integrator.integrate(10000, f, min, max);
        __CLR4_4_11eac1eaclb90pbz6.R.inc(65201);Assert.assertTrue(integrator.getEvaluations() < 5000);
        __CLR4_4_11eac1eaclb90pbz6.R.inc(65202);Assert.assertTrue(integrator.getIterations()  < 15);
        __CLR4_4_11eac1eaclb90pbz6.R.inc(65203);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11eac1eaclb90pbz6.R.inc(65204);min = 0; __CLR4_4_11eac1eaclb90pbz6.R.inc(65205);max = 0.5; __CLR4_4_11eac1eaclb90pbz6.R.inc(65206);expected = 11.0/768;
        __CLR4_4_11eac1eaclb90pbz6.R.inc(65207);tolerance = FastMath.abs(expected * integrator.getRelativeAccuracy());
        __CLR4_4_11eac1eaclb90pbz6.R.inc(65208);result = integrator.integrate(10000, f, min, max);
        __CLR4_4_11eac1eaclb90pbz6.R.inc(65209);Assert.assertTrue(integrator.getEvaluations() < 2500);
        __CLR4_4_11eac1eaclb90pbz6.R.inc(65210);Assert.assertTrue(integrator.getIterations()  < 15);
        __CLR4_4_11eac1eaclb90pbz6.R.inc(65211);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11eac1eaclb90pbz6.R.inc(65212);min = -1; __CLR4_4_11eac1eaclb90pbz6.R.inc(65213);max = 4; __CLR4_4_11eac1eaclb90pbz6.R.inc(65214);expected = 2048/3.0 - 78 + 1.0/48;
        __CLR4_4_11eac1eaclb90pbz6.R.inc(65215);tolerance = FastMath.abs(expected * integrator.getRelativeAccuracy());
        __CLR4_4_11eac1eaclb90pbz6.R.inc(65216);result = integrator.integrate(10000, f, min, max);
        __CLR4_4_11eac1eaclb90pbz6.R.inc(65217);Assert.assertTrue(integrator.getEvaluations() < 5000);
        __CLR4_4_11eac1eaclb90pbz6.R.inc(65218);Assert.assertTrue(integrator.getIterations()  < 15);
        __CLR4_4_11eac1eaclb90pbz6.R.inc(65219);Assert.assertEquals(expected, result, tolerance);

    }finally{__CLR4_4_11eac1eaclb90pbz6.R.flushNeeded();}}

    /**
     * Test of parameters for the integrator.
     */
    @Test
    public void testParameters() {__CLR4_4_11eac1eaclb90pbz6.R.globalSliceStart(getClass().getName(),65220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f58btv1ebo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11eac1eaclb90pbz6.R.rethrow($CLV_t2$);}finally{__CLR4_4_11eac1eaclb90pbz6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.integration.TrapezoidIntegratorTest.testParameters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65220,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f58btv1ebo(){try{__CLR4_4_11eac1eaclb90pbz6.R.inc(65220);
        __CLR4_4_11eac1eaclb90pbz6.R.inc(65221);UnivariateFunction f = new Sin();

        __CLR4_4_11eac1eaclb90pbz6.R.inc(65222);try {
            // bad interval
            __CLR4_4_11eac1eaclb90pbz6.R.inc(65223);new TrapezoidIntegrator().integrate(1000, f, 1, -1);
            __CLR4_4_11eac1eaclb90pbz6.R.inc(65224);Assert.fail("Expecting NumberIsTooLargeException - bad interval");
        } catch (NumberIsTooLargeException ex) {
            // expected
        }
        __CLR4_4_11eac1eaclb90pbz6.R.inc(65225);try {
            // bad iteration limits
            __CLR4_4_11eac1eaclb90pbz6.R.inc(65226);new TrapezoidIntegrator(5, 4);
            __CLR4_4_11eac1eaclb90pbz6.R.inc(65227);Assert.fail("Expecting NumberIsTooSmallException - bad iteration limits");
        } catch (NumberIsTooSmallException ex) {
            // expected
        }
        __CLR4_4_11eac1eaclb90pbz6.R.inc(65228);try {
            // bad iteration limits
            __CLR4_4_11eac1eaclb90pbz6.R.inc(65229);new TrapezoidIntegrator(10,99);
            __CLR4_4_11eac1eaclb90pbz6.R.inc(65230);Assert.fail("Expecting NumberIsTooLargeException - bad iteration limits");
        } catch (NumberIsTooLargeException ex) {
            // expected
        }
    }finally{__CLR4_4_11eac1eaclb90pbz6.R.flushNeeded();}}
}
