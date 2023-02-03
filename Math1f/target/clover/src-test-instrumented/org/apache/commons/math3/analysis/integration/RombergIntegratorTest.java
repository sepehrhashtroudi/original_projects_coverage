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
 * Test case for Romberg integrator.
 * <p>
 * Romberg algorithm is very fast for good behavior integrand. Test runs
 * show that for a default relative accuracy of 1E-6, it generally takes
 * takes less than 5 iterations for the integral to converge.
 *
 * @version $Id$
 */
public final class RombergIntegratorTest {static class __CLR4_4_11e721e72lb90pbyz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,65113,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Test of integrator for the sine function.
     */
    @Test
    public void testSinFunction() {__CLR4_4_11e721e72lb90pbyz.R.globalSliceStart(getClass().getName(),65054);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1doerh71e72();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e721e72lb90pbyz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e721e72lb90pbyz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.integration.RombergIntegratorTest.testSinFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65054,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1doerh71e72(){try{__CLR4_4_11e721e72lb90pbyz.R.inc(65054);
        __CLR4_4_11e721e72lb90pbyz.R.inc(65055);UnivariateFunction f = new Sin();
        __CLR4_4_11e721e72lb90pbyz.R.inc(65056);UnivariateIntegrator integrator = new RombergIntegrator();
        __CLR4_4_11e721e72lb90pbyz.R.inc(65057);double min, max, expected, result, tolerance;

        __CLR4_4_11e721e72lb90pbyz.R.inc(65058);min = 0; __CLR4_4_11e721e72lb90pbyz.R.inc(65059);max = FastMath.PI; __CLR4_4_11e721e72lb90pbyz.R.inc(65060);expected = 2;
        __CLR4_4_11e721e72lb90pbyz.R.inc(65061);tolerance = FastMath.abs(expected * integrator.getRelativeAccuracy());
        __CLR4_4_11e721e72lb90pbyz.R.inc(65062);result = integrator.integrate(100, f, min, max);
        __CLR4_4_11e721e72lb90pbyz.R.inc(65063);Assert.assertTrue(integrator.getEvaluations() < 50);
        __CLR4_4_11e721e72lb90pbyz.R.inc(65064);Assert.assertTrue(integrator.getIterations()  < 10);
        __CLR4_4_11e721e72lb90pbyz.R.inc(65065);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11e721e72lb90pbyz.R.inc(65066);min = -FastMath.PI/3; __CLR4_4_11e721e72lb90pbyz.R.inc(65067);max = 0; __CLR4_4_11e721e72lb90pbyz.R.inc(65068);expected = -0.5;
        __CLR4_4_11e721e72lb90pbyz.R.inc(65069);tolerance = FastMath.abs(expected * integrator.getRelativeAccuracy());
        __CLR4_4_11e721e72lb90pbyz.R.inc(65070);result = integrator.integrate(100, f, min, max);
        __CLR4_4_11e721e72lb90pbyz.R.inc(65071);Assert.assertTrue(integrator.getEvaluations() < 50);
        __CLR4_4_11e721e72lb90pbyz.R.inc(65072);Assert.assertTrue(integrator.getIterations()  < 10);
        __CLR4_4_11e721e72lb90pbyz.R.inc(65073);Assert.assertEquals(expected, result, tolerance);
    }finally{__CLR4_4_11e721e72lb90pbyz.R.flushNeeded();}}

    /**
     * Test of integrator for the quintic function.
     */
    @Test
    public void testQuinticFunction() {__CLR4_4_11e721e72lb90pbyz.R.globalSliceStart(getClass().getName(),65074);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lbc2oi1e7m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e721e72lb90pbyz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e721e72lb90pbyz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.integration.RombergIntegratorTest.testQuinticFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65074,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lbc2oi1e7m(){try{__CLR4_4_11e721e72lb90pbyz.R.inc(65074);
        __CLR4_4_11e721e72lb90pbyz.R.inc(65075);UnivariateFunction f = new QuinticFunction();
        __CLR4_4_11e721e72lb90pbyz.R.inc(65076);UnivariateIntegrator integrator = new RombergIntegrator();
        __CLR4_4_11e721e72lb90pbyz.R.inc(65077);double min, max, expected, result, tolerance;

        __CLR4_4_11e721e72lb90pbyz.R.inc(65078);min = 0; __CLR4_4_11e721e72lb90pbyz.R.inc(65079);max = 1; __CLR4_4_11e721e72lb90pbyz.R.inc(65080);expected = -1.0/48;
        __CLR4_4_11e721e72lb90pbyz.R.inc(65081);tolerance = FastMath.abs(expected * integrator.getRelativeAccuracy());
        __CLR4_4_11e721e72lb90pbyz.R.inc(65082);result = integrator.integrate(100, f, min, max);
        __CLR4_4_11e721e72lb90pbyz.R.inc(65083);Assert.assertTrue(integrator.getEvaluations() < 10);
        __CLR4_4_11e721e72lb90pbyz.R.inc(65084);Assert.assertTrue(integrator.getIterations()  < 5);
        __CLR4_4_11e721e72lb90pbyz.R.inc(65085);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11e721e72lb90pbyz.R.inc(65086);min = 0; __CLR4_4_11e721e72lb90pbyz.R.inc(65087);max = 0.5; __CLR4_4_11e721e72lb90pbyz.R.inc(65088);expected = 11.0/768;
        __CLR4_4_11e721e72lb90pbyz.R.inc(65089);tolerance = FastMath.abs(expected * integrator.getRelativeAccuracy());
        __CLR4_4_11e721e72lb90pbyz.R.inc(65090);result = integrator.integrate(100, f, min, max);
        __CLR4_4_11e721e72lb90pbyz.R.inc(65091);Assert.assertTrue(integrator.getEvaluations() < 10);
        __CLR4_4_11e721e72lb90pbyz.R.inc(65092);Assert.assertTrue(integrator.getIterations()  < 5);
        __CLR4_4_11e721e72lb90pbyz.R.inc(65093);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11e721e72lb90pbyz.R.inc(65094);min = -1; __CLR4_4_11e721e72lb90pbyz.R.inc(65095);max = 4; __CLR4_4_11e721e72lb90pbyz.R.inc(65096);expected = 2048/3.0 - 78 + 1.0/48;
        __CLR4_4_11e721e72lb90pbyz.R.inc(65097);tolerance = FastMath.abs(expected * integrator.getRelativeAccuracy());
        __CLR4_4_11e721e72lb90pbyz.R.inc(65098);result = integrator.integrate(100, f, min, max);
        __CLR4_4_11e721e72lb90pbyz.R.inc(65099);Assert.assertTrue(integrator.getEvaluations() < 10);
        __CLR4_4_11e721e72lb90pbyz.R.inc(65100);Assert.assertTrue(integrator.getIterations()  < 5);
        __CLR4_4_11e721e72lb90pbyz.R.inc(65101);Assert.assertEquals(expected, result, tolerance);
    }finally{__CLR4_4_11e721e72lb90pbyz.R.flushNeeded();}}

    /**
     * Test of parameters for the integrator.
     */
    @Test
    public void testParameters() {__CLR4_4_11e721e72lb90pbyz.R.globalSliceStart(getClass().getName(),65102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f58btv1e8e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e721e72lb90pbyz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e721e72lb90pbyz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.integration.RombergIntegratorTest.testParameters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65102,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f58btv1e8e(){try{__CLR4_4_11e721e72lb90pbyz.R.inc(65102);
        __CLR4_4_11e721e72lb90pbyz.R.inc(65103);UnivariateFunction f = new Sin();

        __CLR4_4_11e721e72lb90pbyz.R.inc(65104);try {
            // bad interval
            __CLR4_4_11e721e72lb90pbyz.R.inc(65105);new RombergIntegrator().integrate(1000, f, 1, -1);
            __CLR4_4_11e721e72lb90pbyz.R.inc(65106);Assert.fail("Expecting NumberIsTooLargeException - bad interval");
        } catch (NumberIsTooLargeException ex) {
            // expected
        }
        __CLR4_4_11e721e72lb90pbyz.R.inc(65107);try {
            // bad iteration limits
            __CLR4_4_11e721e72lb90pbyz.R.inc(65108);new RombergIntegrator(5, 4);
            __CLR4_4_11e721e72lb90pbyz.R.inc(65109);Assert.fail("Expecting NumberIsTooSmallException - bad iteration limits");
        } catch (NumberIsTooSmallException ex) {
            // expected
        }
        __CLR4_4_11e721e72lb90pbyz.R.inc(65110);try {
            // bad iteration limits
            __CLR4_4_11e721e72lb90pbyz.R.inc(65111);new RombergIntegrator(10, 50);
            __CLR4_4_11e721e72lb90pbyz.R.inc(65112);Assert.fail("Expecting NumberIsTooLargeException - bad iteration limits");
        } catch (NumberIsTooLargeException ex) {
            // expected
        }
    }finally{__CLR4_4_11e721e72lb90pbyz.R.flushNeeded();}}
}
