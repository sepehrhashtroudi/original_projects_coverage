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
 * Test case for Simpson integrator.
 * <p>
 * Test runs show that for a default relative accuracy of 1E-6, it
 * generally takes 5 to 10 iterations for the integral to converge.
 *
 * @version $Id$
 */
public final class SimpsonIntegratorTest {static class __CLR4_4_11e8p1e8plb90pbz3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,65172,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Test of integrator for the sine function.
     */
    @Test
    public void testSinFunction() {__CLR4_4_11e8p1e8plb90pbz3.R.globalSliceStart(getClass().getName(),65113);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1doerh71e8p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e8p1e8plb90pbz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e8p1e8plb90pbz3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.integration.SimpsonIntegratorTest.testSinFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65113,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1doerh71e8p(){try{__CLR4_4_11e8p1e8plb90pbz3.R.inc(65113);
        __CLR4_4_11e8p1e8plb90pbz3.R.inc(65114);UnivariateFunction f = new Sin();
        __CLR4_4_11e8p1e8plb90pbz3.R.inc(65115);UnivariateIntegrator integrator = new SimpsonIntegrator();
        __CLR4_4_11e8p1e8plb90pbz3.R.inc(65116);double min, max, expected, result, tolerance;

        __CLR4_4_11e8p1e8plb90pbz3.R.inc(65117);min = 0; __CLR4_4_11e8p1e8plb90pbz3.R.inc(65118);max = FastMath.PI; __CLR4_4_11e8p1e8plb90pbz3.R.inc(65119);expected = 2;
        __CLR4_4_11e8p1e8plb90pbz3.R.inc(65120);tolerance = FastMath.abs(expected * integrator.getRelativeAccuracy());
        __CLR4_4_11e8p1e8plb90pbz3.R.inc(65121);result = integrator.integrate(1000, f, min, max);
        __CLR4_4_11e8p1e8plb90pbz3.R.inc(65122);Assert.assertTrue(integrator.getEvaluations() < 100);
        __CLR4_4_11e8p1e8plb90pbz3.R.inc(65123);Assert.assertTrue(integrator.getIterations()  < 10);
        __CLR4_4_11e8p1e8plb90pbz3.R.inc(65124);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11e8p1e8plb90pbz3.R.inc(65125);min = -FastMath.PI/3; __CLR4_4_11e8p1e8plb90pbz3.R.inc(65126);max = 0; __CLR4_4_11e8p1e8plb90pbz3.R.inc(65127);expected = -0.5;
        __CLR4_4_11e8p1e8plb90pbz3.R.inc(65128);tolerance = FastMath.abs(expected * integrator.getRelativeAccuracy());
        __CLR4_4_11e8p1e8plb90pbz3.R.inc(65129);result = integrator.integrate(1000, f, min, max);
        __CLR4_4_11e8p1e8plb90pbz3.R.inc(65130);Assert.assertTrue(integrator.getEvaluations() < 50);
        __CLR4_4_11e8p1e8plb90pbz3.R.inc(65131);Assert.assertTrue(integrator.getIterations()  < 10);
        __CLR4_4_11e8p1e8plb90pbz3.R.inc(65132);Assert.assertEquals(expected, result, tolerance);
    }finally{__CLR4_4_11e8p1e8plb90pbz3.R.flushNeeded();}}

    /**
     * Test of integrator for the quintic function.
     */
    @Test
    public void testQuinticFunction() {__CLR4_4_11e8p1e8plb90pbz3.R.globalSliceStart(getClass().getName(),65133);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lbc2oi1e99();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e8p1e8plb90pbz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e8p1e8plb90pbz3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.integration.SimpsonIntegratorTest.testQuinticFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65133,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lbc2oi1e99(){try{__CLR4_4_11e8p1e8plb90pbz3.R.inc(65133);
        __CLR4_4_11e8p1e8plb90pbz3.R.inc(65134);UnivariateFunction f = new QuinticFunction();
        __CLR4_4_11e8p1e8plb90pbz3.R.inc(65135);UnivariateIntegrator integrator = new SimpsonIntegrator();
        __CLR4_4_11e8p1e8plb90pbz3.R.inc(65136);double min, max, expected, result, tolerance;

        __CLR4_4_11e8p1e8plb90pbz3.R.inc(65137);min = 0; __CLR4_4_11e8p1e8plb90pbz3.R.inc(65138);max = 1; __CLR4_4_11e8p1e8plb90pbz3.R.inc(65139);expected = -1.0/48;
        __CLR4_4_11e8p1e8plb90pbz3.R.inc(65140);tolerance = FastMath.abs(expected * integrator.getRelativeAccuracy());
        __CLR4_4_11e8p1e8plb90pbz3.R.inc(65141);result = integrator.integrate(1000, f, min, max);
        __CLR4_4_11e8p1e8plb90pbz3.R.inc(65142);Assert.assertTrue(integrator.getEvaluations() < 150);
        __CLR4_4_11e8p1e8plb90pbz3.R.inc(65143);Assert.assertTrue(integrator.getIterations()  < 10);
        __CLR4_4_11e8p1e8plb90pbz3.R.inc(65144);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11e8p1e8plb90pbz3.R.inc(65145);min = 0; __CLR4_4_11e8p1e8plb90pbz3.R.inc(65146);max = 0.5; __CLR4_4_11e8p1e8plb90pbz3.R.inc(65147);expected = 11.0/768;
        __CLR4_4_11e8p1e8plb90pbz3.R.inc(65148);tolerance = FastMath.abs(expected * integrator.getRelativeAccuracy());
        __CLR4_4_11e8p1e8plb90pbz3.R.inc(65149);result = integrator.integrate(1000, f, min, max);
        __CLR4_4_11e8p1e8plb90pbz3.R.inc(65150);Assert.assertTrue(integrator.getEvaluations() < 100);
        __CLR4_4_11e8p1e8plb90pbz3.R.inc(65151);Assert.assertTrue(integrator.getIterations()  < 10);
        __CLR4_4_11e8p1e8plb90pbz3.R.inc(65152);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11e8p1e8plb90pbz3.R.inc(65153);min = -1; __CLR4_4_11e8p1e8plb90pbz3.R.inc(65154);max = 4; __CLR4_4_11e8p1e8plb90pbz3.R.inc(65155);expected = 2048/3.0 - 78 + 1.0/48;
        __CLR4_4_11e8p1e8plb90pbz3.R.inc(65156);tolerance = FastMath.abs(expected * integrator.getRelativeAccuracy());
        __CLR4_4_11e8p1e8plb90pbz3.R.inc(65157);result = integrator.integrate(1000, f, min, max);
        __CLR4_4_11e8p1e8plb90pbz3.R.inc(65158);Assert.assertTrue(integrator.getEvaluations() < 150);
        __CLR4_4_11e8p1e8plb90pbz3.R.inc(65159);Assert.assertTrue(integrator.getIterations()  < 10);
        __CLR4_4_11e8p1e8plb90pbz3.R.inc(65160);Assert.assertEquals(expected, result, tolerance);
    }finally{__CLR4_4_11e8p1e8plb90pbz3.R.flushNeeded();}}

    /**
     * Test of parameters for the integrator.
     */
    @Test
    public void testParameters() {__CLR4_4_11e8p1e8plb90pbz3.R.globalSliceStart(getClass().getName(),65161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f58btv1ea1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e8p1e8plb90pbz3.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e8p1e8plb90pbz3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.integration.SimpsonIntegratorTest.testParameters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65161,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f58btv1ea1(){try{__CLR4_4_11e8p1e8plb90pbz3.R.inc(65161);
        __CLR4_4_11e8p1e8plb90pbz3.R.inc(65162);UnivariateFunction f = new Sin();
        __CLR4_4_11e8p1e8plb90pbz3.R.inc(65163);try {
            // bad interval
            __CLR4_4_11e8p1e8plb90pbz3.R.inc(65164);new SimpsonIntegrator().integrate(1000, f, 1, -1);
            __CLR4_4_11e8p1e8plb90pbz3.R.inc(65165);Assert.fail("Expecting NumberIsTooLargeException - bad interval");
        } catch (NumberIsTooLargeException ex) {
            // expected
        }
        __CLR4_4_11e8p1e8plb90pbz3.R.inc(65166);try {
            // bad iteration limits
            __CLR4_4_11e8p1e8plb90pbz3.R.inc(65167);new SimpsonIntegrator(5, 4);
            __CLR4_4_11e8p1e8plb90pbz3.R.inc(65168);Assert.fail("Expecting NumberIsTooSmallException - bad iteration limits");
        } catch (NumberIsTooSmallException ex) {
            // expected
        }
        __CLR4_4_11e8p1e8plb90pbz3.R.inc(65169);try {
            // bad iteration limits
            __CLR4_4_11e8p1e8plb90pbz3.R.inc(65170);new SimpsonIntegrator(10, 99);
            __CLR4_4_11e8p1e8plb90pbz3.R.inc(65171);Assert.fail("Expecting NumberIsTooLargeException - bad iteration limits");
        } catch (NumberIsTooLargeException ex) {
            // expected
        }
    }finally{__CLR4_4_11e8p1e8plb90pbz3.R.flushNeeded();}}
}
