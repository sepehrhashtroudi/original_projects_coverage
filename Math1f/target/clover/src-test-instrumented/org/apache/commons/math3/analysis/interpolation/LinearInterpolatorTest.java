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
package org.apache.commons.math3.analysis.interpolation;

import org.apache.commons.math3.exception.NonMonotonicSequenceException;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunction;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test the LinearInterpolator.
 */
public class LinearInterpolatorTest {static class __CLR4_4_11f9k1f9klb90pc1f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,66503,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** error tolerance for spline interpolator value at knot points */
    protected double knotTolerance = 1E-12;

    /** error tolerance for interpolating polynomial coefficients */
    protected double coefficientTolerance = 1E-6;

    /** error tolerance for interpolated values */
    protected double interpolationTolerance = 1E-12;

    @Test
    public void testInterpolateLinearDegenerateTwoSegment()
        {__CLR4_4_11f9k1f9klb90pc1f.R.globalSliceStart(getClass().getName(),66440);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hxhgl41f9k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9k1f9klb90pc1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9k1f9klb90pc1f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.LinearInterpolatorTest.testInterpolateLinearDegenerateTwoSegment",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66440,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hxhgl41f9k(){try{__CLR4_4_11f9k1f9klb90pc1f.R.inc(66440);
        __CLR4_4_11f9k1f9klb90pc1f.R.inc(66441);double x[] = { 0.0, 0.5, 1.0 };
        __CLR4_4_11f9k1f9klb90pc1f.R.inc(66442);double y[] = { 0.0, 0.5, 1.0 };
        __CLR4_4_11f9k1f9klb90pc1f.R.inc(66443);UnivariateInterpolator i = new LinearInterpolator();
        __CLR4_4_11f9k1f9klb90pc1f.R.inc(66444);UnivariateFunction f = i.interpolate(x, y);
        __CLR4_4_11f9k1f9klb90pc1f.R.inc(66445);verifyInterpolation(f, x, y);

        // Verify coefficients using analytical values
        __CLR4_4_11f9k1f9klb90pc1f.R.inc(66446);PolynomialFunction polynomials[] = ((PolynomialSplineFunction) f).getPolynomials();
        __CLR4_4_11f9k1f9klb90pc1f.R.inc(66447);double target[] = {y[0], 1d};
        __CLR4_4_11f9k1f9klb90pc1f.R.inc(66448);TestUtils.assertEquals(polynomials[0].getCoefficients(), target, coefficientTolerance);
        __CLR4_4_11f9k1f9klb90pc1f.R.inc(66449);target = new double[]{y[1], 1d};
        __CLR4_4_11f9k1f9klb90pc1f.R.inc(66450);TestUtils.assertEquals(polynomials[1].getCoefficients(), target, coefficientTolerance);

        // Check interpolation
        __CLR4_4_11f9k1f9klb90pc1f.R.inc(66451);Assert.assertEquals(0.0,f.value(0.0), interpolationTolerance);
        __CLR4_4_11f9k1f9klb90pc1f.R.inc(66452);Assert.assertEquals(0.4,f.value(0.4), interpolationTolerance);
        __CLR4_4_11f9k1f9klb90pc1f.R.inc(66453);Assert.assertEquals(1.0,f.value(1.0), interpolationTolerance);
    }finally{__CLR4_4_11f9k1f9klb90pc1f.R.flushNeeded();}}

    @Test
    public void testInterpolateLinearDegenerateThreeSegment()
        {__CLR4_4_11f9k1f9klb90pc1f.R.globalSliceStart(getClass().getName(),66454);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qfvyw61f9y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9k1f9klb90pc1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9k1f9klb90pc1f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.LinearInterpolatorTest.testInterpolateLinearDegenerateThreeSegment",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66454,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qfvyw61f9y(){try{__CLR4_4_11f9k1f9klb90pc1f.R.inc(66454);
        __CLR4_4_11f9k1f9klb90pc1f.R.inc(66455);double x[] = { 0.0, 0.5, 1.0, 1.5 };
        __CLR4_4_11f9k1f9klb90pc1f.R.inc(66456);double y[] = { 0.0, 0.5, 1.0, 1.5 };
        __CLR4_4_11f9k1f9klb90pc1f.R.inc(66457);UnivariateInterpolator i = new LinearInterpolator();
        __CLR4_4_11f9k1f9klb90pc1f.R.inc(66458);UnivariateFunction f = i.interpolate(x, y);
        __CLR4_4_11f9k1f9klb90pc1f.R.inc(66459);verifyInterpolation(f, x, y);

        // Verify coefficients using analytical values
        __CLR4_4_11f9k1f9klb90pc1f.R.inc(66460);PolynomialFunction polynomials[] = ((PolynomialSplineFunction) f).getPolynomials();
        __CLR4_4_11f9k1f9klb90pc1f.R.inc(66461);double target[] = {y[0], 1d};
        __CLR4_4_11f9k1f9klb90pc1f.R.inc(66462);TestUtils.assertEquals(polynomials[0].getCoefficients(), target, coefficientTolerance);
        __CLR4_4_11f9k1f9klb90pc1f.R.inc(66463);target = new double[]{y[1], 1d};
        __CLR4_4_11f9k1f9klb90pc1f.R.inc(66464);TestUtils.assertEquals(polynomials[1].getCoefficients(), target, coefficientTolerance);
        __CLR4_4_11f9k1f9klb90pc1f.R.inc(66465);target = new double[]{y[2], 1d};
        __CLR4_4_11f9k1f9klb90pc1f.R.inc(66466);TestUtils.assertEquals(polynomials[2].getCoefficients(), target, coefficientTolerance);

        // Check interpolation
        __CLR4_4_11f9k1f9klb90pc1f.R.inc(66467);Assert.assertEquals(0,f.value(0), interpolationTolerance);
        __CLR4_4_11f9k1f9klb90pc1f.R.inc(66468);Assert.assertEquals(1.4,f.value(1.4), interpolationTolerance);
        __CLR4_4_11f9k1f9klb90pc1f.R.inc(66469);Assert.assertEquals(1.5,f.value(1.5), interpolationTolerance);
    }finally{__CLR4_4_11f9k1f9klb90pc1f.R.flushNeeded();}}

    @Test
    public void testInterpolateLinear() {__CLR4_4_11f9k1f9klb90pc1f.R.globalSliceStart(getClass().getName(),66470);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12iekv91fae();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9k1f9klb90pc1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9k1f9klb90pc1f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.LinearInterpolatorTest.testInterpolateLinear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66470,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12iekv91fae(){try{__CLR4_4_11f9k1f9klb90pc1f.R.inc(66470);
        __CLR4_4_11f9k1f9klb90pc1f.R.inc(66471);double x[] = { 0.0, 0.5, 1.0 };
        __CLR4_4_11f9k1f9klb90pc1f.R.inc(66472);double y[] = { 0.0, 0.5, 0.0 };
        __CLR4_4_11f9k1f9klb90pc1f.R.inc(66473);UnivariateInterpolator i = new LinearInterpolator();
        __CLR4_4_11f9k1f9klb90pc1f.R.inc(66474);UnivariateFunction f = i.interpolate(x, y);
        __CLR4_4_11f9k1f9klb90pc1f.R.inc(66475);verifyInterpolation(f, x, y);

        // Verify coefficients using analytical values
        __CLR4_4_11f9k1f9klb90pc1f.R.inc(66476);PolynomialFunction polynomials[] = ((PolynomialSplineFunction) f).getPolynomials();
        __CLR4_4_11f9k1f9klb90pc1f.R.inc(66477);double target[] = {y[0], 1d};
        __CLR4_4_11f9k1f9klb90pc1f.R.inc(66478);TestUtils.assertEquals(polynomials[0].getCoefficients(), target, coefficientTolerance);
        __CLR4_4_11f9k1f9klb90pc1f.R.inc(66479);target = new double[]{y[1], -1d};
        __CLR4_4_11f9k1f9klb90pc1f.R.inc(66480);TestUtils.assertEquals(polynomials[1].getCoefficients(), target, coefficientTolerance);
    }finally{__CLR4_4_11f9k1f9klb90pc1f.R.flushNeeded();}}

    @Test
    public void testIllegalArguments() {__CLR4_4_11f9k1f9klb90pc1f.R.globalSliceStart(getClass().getName(),66481);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wabgah1fap();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f9k1f9klb90pc1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f9k1f9klb90pc1f.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.LinearInterpolatorTest.testIllegalArguments",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66481,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wabgah1fap(){try{__CLR4_4_11f9k1f9klb90pc1f.R.inc(66481);
        // Data set arrays of different size.
        __CLR4_4_11f9k1f9klb90pc1f.R.inc(66482);UnivariateInterpolator i = new LinearInterpolator();
        __CLR4_4_11f9k1f9klb90pc1f.R.inc(66483);try {
            __CLR4_4_11f9k1f9klb90pc1f.R.inc(66484);double xval[] = { 0.0, 1.0 };
            __CLR4_4_11f9k1f9klb90pc1f.R.inc(66485);double yval[] = { 0.0, 1.0, 2.0 };
            __CLR4_4_11f9k1f9klb90pc1f.R.inc(66486);i.interpolate(xval, yval);
            __CLR4_4_11f9k1f9klb90pc1f.R.inc(66487);Assert.fail("Failed to detect data set array with different sizes.");
        } catch (DimensionMismatchException iae) {
            // Expected.
        }
        // X values not sorted.
        __CLR4_4_11f9k1f9klb90pc1f.R.inc(66488);try {
            __CLR4_4_11f9k1f9klb90pc1f.R.inc(66489);double xval[] = { 0.0, 1.0, 0.5 };
            __CLR4_4_11f9k1f9klb90pc1f.R.inc(66490);double yval[] = { 0.0, 1.0, 2.0 };
            __CLR4_4_11f9k1f9klb90pc1f.R.inc(66491);i.interpolate(xval, yval);
            __CLR4_4_11f9k1f9klb90pc1f.R.inc(66492);Assert.fail("Failed to detect unsorted arguments.");
        } catch (NonMonotonicSequenceException iae) {
            // Expected.
        }
        // Not enough data to interpolate.
        __CLR4_4_11f9k1f9klb90pc1f.R.inc(66493);try {
            __CLR4_4_11f9k1f9klb90pc1f.R.inc(66494);double xval[] = { 0.0 };
            __CLR4_4_11f9k1f9klb90pc1f.R.inc(66495);double yval[] = { 0.0 };
            __CLR4_4_11f9k1f9klb90pc1f.R.inc(66496);i.interpolate(xval, yval);
            __CLR4_4_11f9k1f9klb90pc1f.R.inc(66497);Assert.fail("Failed to detect unsorted arguments.");
        } catch (NumberIsTooSmallException iae) {
            // Expected.
        }
    }finally{__CLR4_4_11f9k1f9klb90pc1f.R.flushNeeded();}}

    /**
     * verifies that f(x[i]) = y[i] for i = 0..n-1 where n is common length.
     */
    protected void verifyInterpolation(UnivariateFunction f, double x[], double y[])
       {try{__CLR4_4_11f9k1f9klb90pc1f.R.inc(66498);
        __CLR4_4_11f9k1f9klb90pc1f.R.inc(66499);for (int i = 0; (((i < x.length)&&(__CLR4_4_11f9k1f9klb90pc1f.R.iget(66500)!=0|true))||(__CLR4_4_11f9k1f9klb90pc1f.R.iget(66501)==0&false)); i++) {{
            __CLR4_4_11f9k1f9klb90pc1f.R.inc(66502);Assert.assertEquals(f.value(x[i]), y[i], knotTolerance);
        }
    }}finally{__CLR4_4_11f9k1f9klb90pc1f.R.flushNeeded();}}

}
