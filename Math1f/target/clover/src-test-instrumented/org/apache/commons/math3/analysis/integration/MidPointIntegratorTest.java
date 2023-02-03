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
 * Test case for midpoint integrator.
 * <p>
 * Test runs show that for a default relative accuracy of 1E-6, it generally
 * takes 10 to 15 iterations for the integral to converge.
 *
 * @version $Id: MidPointIntegratorTest.java 1374632 2012-08-18 18:11:11Z luc $
 */
public final class MidPointIntegratorTest {static class __CLR4_4_11e561e56lb90pbyv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,65054,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Test of integrator for the sine function.
     */
    @Test
    public void testLowAccuracy() {__CLR4_4_11e561e56lb90pbyv.R.globalSliceStart(getClass().getName(),64986);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tach9e1e56();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e561e56lb90pbyv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e561e56lb90pbyv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.integration.MidPointIntegratorTest.testLowAccuracy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64986,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tach9e1e56(){try{__CLR4_4_11e561e56lb90pbyv.R.inc(64986);
        __CLR4_4_11e561e56lb90pbyv.R.inc(64987);UnivariateFunction f = new QuinticFunction();
        __CLR4_4_11e561e56lb90pbyv.R.inc(64988);UnivariateIntegrator integrator = new MidPointIntegrator(0.01, 1.0e-10, 2, 4);
        
        __CLR4_4_11e561e56lb90pbyv.R.inc(64989);double min = -10;
        __CLR4_4_11e561e56lb90pbyv.R.inc(64990);double max =  -9;
        __CLR4_4_11e561e56lb90pbyv.R.inc(64991);double expected = -3697001.0 / 48.0;
        __CLR4_4_11e561e56lb90pbyv.R.inc(64992);double tolerance = FastMath.abs(expected * integrator.getRelativeAccuracy());
        __CLR4_4_11e561e56lb90pbyv.R.inc(64993);double result = integrator.integrate(Integer.MAX_VALUE, f, min, max);
        __CLR4_4_11e561e56lb90pbyv.R.inc(64994);Assert.assertTrue(integrator.getEvaluations() < Integer.MAX_VALUE / 2);
        __CLR4_4_11e561e56lb90pbyv.R.inc(64995);Assert.assertTrue(integrator.getIterations() < MidPointIntegrator.MIDPOINT_MAX_ITERATIONS_COUNT / 2);
        __CLR4_4_11e561e56lb90pbyv.R.inc(64996);Assert.assertEquals(expected, result, tolerance);

    }finally{__CLR4_4_11e561e56lb90pbyv.R.flushNeeded();}}

    /**
     * Test of integrator for the sine function.
     */
    @Test
    public void testSinFunction() {__CLR4_4_11e561e56lb90pbyv.R.globalSliceStart(getClass().getName(),64997);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1doerh71e5h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e561e56lb90pbyv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e561e56lb90pbyv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.integration.MidPointIntegratorTest.testSinFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64997,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1doerh71e5h(){try{__CLR4_4_11e561e56lb90pbyv.R.inc(64997);
        __CLR4_4_11e561e56lb90pbyv.R.inc(64998);UnivariateFunction f = new Sin();
        __CLR4_4_11e561e56lb90pbyv.R.inc(64999);UnivariateIntegrator integrator = new MidPointIntegrator();
        
        __CLR4_4_11e561e56lb90pbyv.R.inc(65000);double min = 0;
        __CLR4_4_11e561e56lb90pbyv.R.inc(65001);double max = FastMath.PI;
        __CLR4_4_11e561e56lb90pbyv.R.inc(65002);double expected = 2;
        __CLR4_4_11e561e56lb90pbyv.R.inc(65003);double tolerance = FastMath.abs(expected * integrator.getRelativeAccuracy());
        __CLR4_4_11e561e56lb90pbyv.R.inc(65004);double result = integrator.integrate(Integer.MAX_VALUE, f, min, max);
        __CLR4_4_11e561e56lb90pbyv.R.inc(65005);Assert.assertTrue(integrator.getEvaluations() < Integer.MAX_VALUE / 2);
        __CLR4_4_11e561e56lb90pbyv.R.inc(65006);Assert.assertTrue(integrator.getIterations() < MidPointIntegrator.MIDPOINT_MAX_ITERATIONS_COUNT / 2);
        __CLR4_4_11e561e56lb90pbyv.R.inc(65007);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11e561e56lb90pbyv.R.inc(65008);min = -FastMath.PI/3;
        __CLR4_4_11e561e56lb90pbyv.R.inc(65009);max = 0;
        __CLR4_4_11e561e56lb90pbyv.R.inc(65010);expected = -0.5;
        __CLR4_4_11e561e56lb90pbyv.R.inc(65011);tolerance = FastMath.abs(expected * integrator.getRelativeAccuracy());
        __CLR4_4_11e561e56lb90pbyv.R.inc(65012);result = integrator.integrate(Integer.MAX_VALUE, f, min, max);
        __CLR4_4_11e561e56lb90pbyv.R.inc(65013);Assert.assertTrue(integrator.getEvaluations() < Integer.MAX_VALUE / 2);
        __CLR4_4_11e561e56lb90pbyv.R.inc(65014);Assert.assertTrue(integrator.getIterations() < MidPointIntegrator.MIDPOINT_MAX_ITERATIONS_COUNT / 2);
        __CLR4_4_11e561e56lb90pbyv.R.inc(65015);Assert.assertEquals(expected, result, tolerance);

    }finally{__CLR4_4_11e561e56lb90pbyv.R.flushNeeded();}}

    /**
     * Test of integrator for the quintic function.
     */
    @Test
    public void testQuinticFunction() {__CLR4_4_11e561e56lb90pbyv.R.globalSliceStart(getClass().getName(),65016);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lbc2oi1e60();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e561e56lb90pbyv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e561e56lb90pbyv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.integration.MidPointIntegratorTest.testQuinticFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65016,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lbc2oi1e60(){try{__CLR4_4_11e561e56lb90pbyv.R.inc(65016);
        __CLR4_4_11e561e56lb90pbyv.R.inc(65017);UnivariateFunction f = new QuinticFunction();
        __CLR4_4_11e561e56lb90pbyv.R.inc(65018);UnivariateIntegrator integrator = new MidPointIntegrator();

        __CLR4_4_11e561e56lb90pbyv.R.inc(65019);double min = 0;
        __CLR4_4_11e561e56lb90pbyv.R.inc(65020);double max = 1;
        __CLR4_4_11e561e56lb90pbyv.R.inc(65021);double expected = -1.0 / 48;
        __CLR4_4_11e561e56lb90pbyv.R.inc(65022);double tolerance = FastMath.abs(expected * integrator.getRelativeAccuracy());
        __CLR4_4_11e561e56lb90pbyv.R.inc(65023);double result = integrator.integrate(Integer.MAX_VALUE, f, min, max);
        __CLR4_4_11e561e56lb90pbyv.R.inc(65024);Assert.assertTrue(integrator.getEvaluations() < Integer.MAX_VALUE / 2);
        __CLR4_4_11e561e56lb90pbyv.R.inc(65025);Assert.assertTrue(integrator.getIterations() < MidPointIntegrator.MIDPOINT_MAX_ITERATIONS_COUNT / 2);
        __CLR4_4_11e561e56lb90pbyv.R.inc(65026);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11e561e56lb90pbyv.R.inc(65027);min = 0;
        __CLR4_4_11e561e56lb90pbyv.R.inc(65028);max = 0.5;
        __CLR4_4_11e561e56lb90pbyv.R.inc(65029);expected = 11.0 / 768;
        __CLR4_4_11e561e56lb90pbyv.R.inc(65030);tolerance = FastMath.abs(expected * integrator.getRelativeAccuracy());
        __CLR4_4_11e561e56lb90pbyv.R.inc(65031);result = integrator.integrate(Integer.MAX_VALUE, f, min, max);
        __CLR4_4_11e561e56lb90pbyv.R.inc(65032);Assert.assertTrue(integrator.getEvaluations() < Integer.MAX_VALUE / 2);
        __CLR4_4_11e561e56lb90pbyv.R.inc(65033);Assert.assertTrue(integrator.getIterations() < MidPointIntegrator.MIDPOINT_MAX_ITERATIONS_COUNT / 2);
        __CLR4_4_11e561e56lb90pbyv.R.inc(65034);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11e561e56lb90pbyv.R.inc(65035);min = -1;
        __CLR4_4_11e561e56lb90pbyv.R.inc(65036);max = 4;
        __CLR4_4_11e561e56lb90pbyv.R.inc(65037);expected = 2048 / 3.0 - 78 + 1.0 / 48;
        __CLR4_4_11e561e56lb90pbyv.R.inc(65038);tolerance = FastMath.abs(expected * integrator.getRelativeAccuracy());
        __CLR4_4_11e561e56lb90pbyv.R.inc(65039);result = integrator.integrate(Integer.MAX_VALUE, f, min, max);
        __CLR4_4_11e561e56lb90pbyv.R.inc(65040);Assert.assertTrue(integrator.getEvaluations() < Integer.MAX_VALUE / 2);
        __CLR4_4_11e561e56lb90pbyv.R.inc(65041);Assert.assertTrue(integrator.getIterations() < MidPointIntegrator.MIDPOINT_MAX_ITERATIONS_COUNT / 2);
        __CLR4_4_11e561e56lb90pbyv.R.inc(65042);Assert.assertEquals(expected, result, tolerance);

    }finally{__CLR4_4_11e561e56lb90pbyv.R.flushNeeded();}}

    /**
     * Test of parameters for the integrator.
     */
    @Test
    public void testParameters() {__CLR4_4_11e561e56lb90pbyv.R.globalSliceStart(getClass().getName(),65043);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f58btv1e6r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e561e56lb90pbyv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e561e56lb90pbyv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.integration.MidPointIntegratorTest.testParameters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65043,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f58btv1e6r(){try{__CLR4_4_11e561e56lb90pbyv.R.inc(65043);
        __CLR4_4_11e561e56lb90pbyv.R.inc(65044);UnivariateFunction f = new Sin();

        __CLR4_4_11e561e56lb90pbyv.R.inc(65045);try {
            // bad interval
            __CLR4_4_11e561e56lb90pbyv.R.inc(65046);new MidPointIntegrator().integrate(1000, f, 1, -1);
            __CLR4_4_11e561e56lb90pbyv.R.inc(65047);Assert.fail("Expecting NumberIsTooLargeException - bad interval");
        } catch (NumberIsTooLargeException ex) {
            // expected
        }
        __CLR4_4_11e561e56lb90pbyv.R.inc(65048);try {
            // bad iteration limits
            __CLR4_4_11e561e56lb90pbyv.R.inc(65049);new MidPointIntegrator(5, 4);
            __CLR4_4_11e561e56lb90pbyv.R.inc(65050);Assert.fail("Expecting NumberIsTooSmallException - bad iteration limits");
        } catch (NumberIsTooSmallException ex) {
            // expected
        }
        __CLR4_4_11e561e56lb90pbyv.R.inc(65051);try {
            // bad iteration limits
            __CLR4_4_11e561e56lb90pbyv.R.inc(65052);new MidPointIntegrator(10, 99);
            __CLR4_4_11e561e56lb90pbyv.R.inc(65053);Assert.fail("Expecting NumberIsTooLargeException - bad iteration limits");
        } catch (NumberIsTooLargeException ex) {
            // expected
        }
    }finally{__CLR4_4_11e561e56lb90pbyv.R.flushNeeded();}}
}
