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
package org.apache.commons.math3.analysis.integration.gauss;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.util.FastMath;
import org.junit.Test;
import org.junit.Assert;

/**
 * Test of the {@link HermiteRuleFactory}.
 *
 * @version $Id$
 */
public class HermiteTest {static class __CLR4_4_11eeq1eeqlb90pbzo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,65368,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final GaussIntegratorFactory factory = new GaussIntegratorFactory();

    @Test
    public void testNormalDistribution() {__CLR4_4_11eeq1eeqlb90pbzo.R.globalSliceStart(getClass().getName(),65330);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b7yal81eeq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11eeq1eeqlb90pbzo.R.rethrow($CLV_t2$);}finally{__CLR4_4_11eeq1eeqlb90pbzo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.integration.gauss.HermiteTest.testNormalDistribution",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65330,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b7yal81eeq(){try{__CLR4_4_11eeq1eeqlb90pbzo.R.inc(65330);
        __CLR4_4_11eeq1eeqlb90pbzo.R.inc(65331);final double oneOverSqrtPi = 1 / FastMath.sqrt(Math.PI);

        __CLR4_4_11eeq1eeqlb90pbzo.R.inc(65332);final double mu = 12345.6789;
        __CLR4_4_11eeq1eeqlb90pbzo.R.inc(65333);final double sigma = 987.654321;
        // By defintion, Gauss-Hermite quadrature readily provides the
        // integral of the normal distribution density.
        __CLR4_4_11eeq1eeqlb90pbzo.R.inc(65334);final int numPoints = 1;

        // Change of variable:
        //   y = (x - mu) / (sqrt(2) *  sigma)
        // such that the integrand
        //   N(x, mu, sigma)
        // is transformed to
        //   f(y) * exp(-y^2)
        __CLR4_4_11eeq1eeqlb90pbzo.R.inc(65335);final UnivariateFunction f = new UnivariateFunction() {
                public double value(double y) {try{__CLR4_4_11eeq1eeqlb90pbzo.R.inc(65336);
                    __CLR4_4_11eeq1eeqlb90pbzo.R.inc(65337);return oneOverSqrtPi; // Constant function.
                }finally{__CLR4_4_11eeq1eeqlb90pbzo.R.flushNeeded();}}
            };

        __CLR4_4_11eeq1eeqlb90pbzo.R.inc(65338);final GaussIntegrator integrator = factory.hermite(numPoints);
        __CLR4_4_11eeq1eeqlb90pbzo.R.inc(65339);final double result = integrator.integrate(f);
        __CLR4_4_11eeq1eeqlb90pbzo.R.inc(65340);final double expected = 1;
        __CLR4_4_11eeq1eeqlb90pbzo.R.inc(65341);Assert.assertEquals(expected, result, Math.ulp(expected));
    }finally{__CLR4_4_11eeq1eeqlb90pbzo.R.flushNeeded();}}

    @Test
    public void testNormalMean() {__CLR4_4_11eeq1eeqlb90pbzo.R.globalSliceStart(getClass().getName(),65342);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xllofv1ef2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11eeq1eeqlb90pbzo.R.rethrow($CLV_t2$);}finally{__CLR4_4_11eeq1eeqlb90pbzo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.integration.gauss.HermiteTest.testNormalMean",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65342,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xllofv1ef2(){try{__CLR4_4_11eeq1eeqlb90pbzo.R.inc(65342);
        __CLR4_4_11eeq1eeqlb90pbzo.R.inc(65343);final double sqrtTwo = FastMath.sqrt(2);
        __CLR4_4_11eeq1eeqlb90pbzo.R.inc(65344);final double oneOverSqrtPi = 1 / FastMath.sqrt(Math.PI);

        __CLR4_4_11eeq1eeqlb90pbzo.R.inc(65345);final double mu = 12345.6789;
        __CLR4_4_11eeq1eeqlb90pbzo.R.inc(65346);final double sigma = 987.654321;
        __CLR4_4_11eeq1eeqlb90pbzo.R.inc(65347);final int numPoints = 5;

        // Change of variable:
        //   y = (x - mu) / (sqrt(2) *  sigma)
        // such that the integrand
        //   x * N(x, mu, sigma)
        // is transformed to
        //   f(y) * exp(-y^2)
        __CLR4_4_11eeq1eeqlb90pbzo.R.inc(65348);final UnivariateFunction f = new UnivariateFunction() {
                public double value(double y) {try{__CLR4_4_11eeq1eeqlb90pbzo.R.inc(65349);
                    __CLR4_4_11eeq1eeqlb90pbzo.R.inc(65350);return oneOverSqrtPi * (sqrtTwo * sigma * y + mu);
                }finally{__CLR4_4_11eeq1eeqlb90pbzo.R.flushNeeded();}}
            };

        __CLR4_4_11eeq1eeqlb90pbzo.R.inc(65351);final GaussIntegrator integrator = factory.hermite(numPoints);
        __CLR4_4_11eeq1eeqlb90pbzo.R.inc(65352);final double result = integrator.integrate(f);
        __CLR4_4_11eeq1eeqlb90pbzo.R.inc(65353);final double expected = mu;
        __CLR4_4_11eeq1eeqlb90pbzo.R.inc(65354);Assert.assertEquals(expected, result, Math.ulp(expected));
    }finally{__CLR4_4_11eeq1eeqlb90pbzo.R.flushNeeded();}}

    @Test
    public void testNormalVariance() {__CLR4_4_11eeq1eeqlb90pbzo.R.globalSliceStart(getClass().getName(),65355);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12805o11eff();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11eeq1eeqlb90pbzo.R.rethrow($CLV_t2$);}finally{__CLR4_4_11eeq1eeqlb90pbzo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.integration.gauss.HermiteTest.testNormalVariance",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65355,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12805o11eff(){try{__CLR4_4_11eeq1eeqlb90pbzo.R.inc(65355);
        __CLR4_4_11eeq1eeqlb90pbzo.R.inc(65356);final double twoOverSqrtPi = 2 / FastMath.sqrt(Math.PI);

        __CLR4_4_11eeq1eeqlb90pbzo.R.inc(65357);final double mu = 12345.6789;
        __CLR4_4_11eeq1eeqlb90pbzo.R.inc(65358);final double sigma = 987.654321;
        __CLR4_4_11eeq1eeqlb90pbzo.R.inc(65359);final double sigma2 = sigma * sigma;
        __CLR4_4_11eeq1eeqlb90pbzo.R.inc(65360);final int numPoints = 5;

        // Change of variable:
        //   y = (x - mu) / (sqrt(2) *  sigma)
        // such that the integrand
        //   (x - mu)^2 * N(x, mu, sigma)
        // is transformed to
        //   f(y) * exp(-y^2)
        __CLR4_4_11eeq1eeqlb90pbzo.R.inc(65361);final UnivariateFunction f = new UnivariateFunction() {
                public double value(double y) {try{__CLR4_4_11eeq1eeqlb90pbzo.R.inc(65362);
                    __CLR4_4_11eeq1eeqlb90pbzo.R.inc(65363);return twoOverSqrtPi * sigma2 * y * y;
                }finally{__CLR4_4_11eeq1eeqlb90pbzo.R.flushNeeded();}}
            };

        __CLR4_4_11eeq1eeqlb90pbzo.R.inc(65364);final GaussIntegrator integrator = factory.hermite(numPoints);
        __CLR4_4_11eeq1eeqlb90pbzo.R.inc(65365);final double result = integrator.integrate(f);
        __CLR4_4_11eeq1eeqlb90pbzo.R.inc(65366);final double expected = sigma2;
        __CLR4_4_11eeq1eeqlb90pbzo.R.inc(65367);Assert.assertEquals(expected, result, 10 * Math.ulp(expected));
    }finally{__CLR4_4_11eeq1eeqlb90pbzo.R.flushNeeded();}}
}
