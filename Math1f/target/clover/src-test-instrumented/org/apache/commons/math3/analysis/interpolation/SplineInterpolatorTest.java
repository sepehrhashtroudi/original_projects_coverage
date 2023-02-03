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
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunction;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test the SplineInterpolator.
 *
 * @version $Id$
 */
public class SplineInterpolatorTest {static class __CLR4_4_11flv1flvlb90pc27{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,66982,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** error tolerance for spline interpolator value at knot points */
    protected double knotTolerance = 1E-12;

    /** error tolerance for interpolating polynomial coefficients */
    protected double coefficientTolerance = 1E-6;

    /** error tolerance for interpolated values -- high value is from sin test */
    protected double interpolationTolerance = 1E-2;

    @Test
    public void testInterpolateLinearDegenerateTwoSegment()
        {__CLR4_4_11flv1flvlb90pc27.R.globalSliceStart(getClass().getName(),66883);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hxhgl41flv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11flv1flvlb90pc27.R.rethrow($CLV_t2$);}finally{__CLR4_4_11flv1flvlb90pc27.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.SplineInterpolatorTest.testInterpolateLinearDegenerateTwoSegment",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66883,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hxhgl41flv(){try{__CLR4_4_11flv1flvlb90pc27.R.inc(66883);
        __CLR4_4_11flv1flvlb90pc27.R.inc(66884);double x[] = { 0.0, 0.5, 1.0 };
        __CLR4_4_11flv1flvlb90pc27.R.inc(66885);double y[] = { 0.0, 0.5, 1.0 };
        __CLR4_4_11flv1flvlb90pc27.R.inc(66886);UnivariateInterpolator i = new SplineInterpolator();
        __CLR4_4_11flv1flvlb90pc27.R.inc(66887);UnivariateFunction f = i.interpolate(x, y);
        __CLR4_4_11flv1flvlb90pc27.R.inc(66888);verifyInterpolation(f, x, y);
        __CLR4_4_11flv1flvlb90pc27.R.inc(66889);verifyConsistency((PolynomialSplineFunction) f, x);

        // Verify coefficients using analytical values
        __CLR4_4_11flv1flvlb90pc27.R.inc(66890);PolynomialFunction polynomials[] = ((PolynomialSplineFunction) f).getPolynomials();
        __CLR4_4_11flv1flvlb90pc27.R.inc(66891);double target[] = {y[0], 1d};
        __CLR4_4_11flv1flvlb90pc27.R.inc(66892);TestUtils.assertEquals(polynomials[0].getCoefficients(), target, coefficientTolerance);
        __CLR4_4_11flv1flvlb90pc27.R.inc(66893);target = new double[]{y[1], 1d};
        __CLR4_4_11flv1flvlb90pc27.R.inc(66894);TestUtils.assertEquals(polynomials[1].getCoefficients(), target, coefficientTolerance);

        // Check interpolation
        __CLR4_4_11flv1flvlb90pc27.R.inc(66895);Assert.assertEquals(0.0,f.value(0.0), interpolationTolerance);
        __CLR4_4_11flv1flvlb90pc27.R.inc(66896);Assert.assertEquals(0.4,f.value(0.4), interpolationTolerance);
        __CLR4_4_11flv1flvlb90pc27.R.inc(66897);Assert.assertEquals(1.0,f.value(1.0), interpolationTolerance);
    }finally{__CLR4_4_11flv1flvlb90pc27.R.flushNeeded();}}

    @Test
    public void testInterpolateLinearDegenerateThreeSegment()
        {__CLR4_4_11flv1flvlb90pc27.R.globalSliceStart(getClass().getName(),66898);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qfvyw61fma();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11flv1flvlb90pc27.R.rethrow($CLV_t2$);}finally{__CLR4_4_11flv1flvlb90pc27.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.SplineInterpolatorTest.testInterpolateLinearDegenerateThreeSegment",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66898,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qfvyw61fma(){try{__CLR4_4_11flv1flvlb90pc27.R.inc(66898);
        __CLR4_4_11flv1flvlb90pc27.R.inc(66899);double x[] = { 0.0, 0.5, 1.0, 1.5 };
        __CLR4_4_11flv1flvlb90pc27.R.inc(66900);double y[] = { 0.0, 0.5, 1.0, 1.5 };
        __CLR4_4_11flv1flvlb90pc27.R.inc(66901);UnivariateInterpolator i = new SplineInterpolator();
        __CLR4_4_11flv1flvlb90pc27.R.inc(66902);UnivariateFunction f = i.interpolate(x, y);
        __CLR4_4_11flv1flvlb90pc27.R.inc(66903);verifyInterpolation(f, x, y);

        // Verify coefficients using analytical values
        __CLR4_4_11flv1flvlb90pc27.R.inc(66904);PolynomialFunction polynomials[] = ((PolynomialSplineFunction) f).getPolynomials();
        __CLR4_4_11flv1flvlb90pc27.R.inc(66905);double target[] = {y[0], 1d};
        __CLR4_4_11flv1flvlb90pc27.R.inc(66906);TestUtils.assertEquals(polynomials[0].getCoefficients(), target, coefficientTolerance);
        __CLR4_4_11flv1flvlb90pc27.R.inc(66907);target = new double[]{y[1], 1d};
        __CLR4_4_11flv1flvlb90pc27.R.inc(66908);TestUtils.assertEquals(polynomials[1].getCoefficients(), target, coefficientTolerance);
        __CLR4_4_11flv1flvlb90pc27.R.inc(66909);target = new double[]{y[2], 1d};
        __CLR4_4_11flv1flvlb90pc27.R.inc(66910);TestUtils.assertEquals(polynomials[2].getCoefficients(), target, coefficientTolerance);

        // Check interpolation
        __CLR4_4_11flv1flvlb90pc27.R.inc(66911);Assert.assertEquals(0,f.value(0), interpolationTolerance);
        __CLR4_4_11flv1flvlb90pc27.R.inc(66912);Assert.assertEquals(1.4,f.value(1.4), interpolationTolerance);
        __CLR4_4_11flv1flvlb90pc27.R.inc(66913);Assert.assertEquals(1.5,f.value(1.5), interpolationTolerance);
    }finally{__CLR4_4_11flv1flvlb90pc27.R.flushNeeded();}}

    @Test
    public void testInterpolateLinear() {__CLR4_4_11flv1flvlb90pc27.R.globalSliceStart(getClass().getName(),66914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12iekv91fmq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11flv1flvlb90pc27.R.rethrow($CLV_t2$);}finally{__CLR4_4_11flv1flvlb90pc27.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.SplineInterpolatorTest.testInterpolateLinear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66914,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12iekv91fmq(){try{__CLR4_4_11flv1flvlb90pc27.R.inc(66914);
        __CLR4_4_11flv1flvlb90pc27.R.inc(66915);double x[] = { 0.0, 0.5, 1.0 };
        __CLR4_4_11flv1flvlb90pc27.R.inc(66916);double y[] = { 0.0, 0.5, 0.0 };
        __CLR4_4_11flv1flvlb90pc27.R.inc(66917);UnivariateInterpolator i = new SplineInterpolator();
        __CLR4_4_11flv1flvlb90pc27.R.inc(66918);UnivariateFunction f = i.interpolate(x, y);
        __CLR4_4_11flv1flvlb90pc27.R.inc(66919);verifyInterpolation(f, x, y);
        __CLR4_4_11flv1flvlb90pc27.R.inc(66920);verifyConsistency((PolynomialSplineFunction) f, x);

        // Verify coefficients using analytical values
        __CLR4_4_11flv1flvlb90pc27.R.inc(66921);PolynomialFunction polynomials[] = ((PolynomialSplineFunction) f).getPolynomials();
        __CLR4_4_11flv1flvlb90pc27.R.inc(66922);double target[] = {y[0], 1.5d, 0d, -2d};
        __CLR4_4_11flv1flvlb90pc27.R.inc(66923);TestUtils.assertEquals(polynomials[0].getCoefficients(), target, coefficientTolerance);
        __CLR4_4_11flv1flvlb90pc27.R.inc(66924);target = new double[]{y[1], 0d, -3d, 2d};
        __CLR4_4_11flv1flvlb90pc27.R.inc(66925);TestUtils.assertEquals(polynomials[1].getCoefficients(), target, coefficientTolerance);
    }finally{__CLR4_4_11flv1flvlb90pc27.R.flushNeeded();}}

    @Test
    public void testInterpolateSin() {__CLR4_4_11flv1flvlb90pc27.R.globalSliceStart(getClass().getName(),66926);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_188o0og1fn2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11flv1flvlb90pc27.R.rethrow($CLV_t2$);}finally{__CLR4_4_11flv1flvlb90pc27.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.SplineInterpolatorTest.testInterpolateSin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66926,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_188o0og1fn2(){try{__CLR4_4_11flv1flvlb90pc27.R.inc(66926);
        __CLR4_4_11flv1flvlb90pc27.R.inc(66927);double x[] =
            {
                0.0,
                FastMath.PI / 6d,
                FastMath.PI / 2d,
                5d * FastMath.PI / 6d,
                FastMath.PI,
                7d * FastMath.PI / 6d,
                3d * FastMath.PI / 2d,
                11d * FastMath.PI / 6d,
                2.d * FastMath.PI };
        __CLR4_4_11flv1flvlb90pc27.R.inc(66928);double y[] = { 0d, 0.5d, 1d, 0.5d, 0d, -0.5d, -1d, -0.5d, 0d };
        __CLR4_4_11flv1flvlb90pc27.R.inc(66929);UnivariateInterpolator i = new SplineInterpolator();
        __CLR4_4_11flv1flvlb90pc27.R.inc(66930);UnivariateFunction f = i.interpolate(x, y);
        __CLR4_4_11flv1flvlb90pc27.R.inc(66931);verifyInterpolation(f, x, y);
        __CLR4_4_11flv1flvlb90pc27.R.inc(66932);verifyConsistency((PolynomialSplineFunction) f, x);

        /* Check coefficients against values computed using R (version 1.8.1, Red Hat Linux 9)
         *
         * To replicate in R:
         *     x[1] <- 0
         *     x[2] <- pi / 6, etc, same for y[] (could use y <- scan() for y values)
         *     g <- splinefun(x, y, "natural")
         *     splinecoef <- eval(expression(z), envir = environment(g))
         *     print(splinecoef)
         */
        __CLR4_4_11flv1flvlb90pc27.R.inc(66933);PolynomialFunction polynomials[] = ((PolynomialSplineFunction) f).getPolynomials();
        __CLR4_4_11flv1flvlb90pc27.R.inc(66934);double target[] = {y[0], 1.002676d, 0d, -0.17415829d};
        __CLR4_4_11flv1flvlb90pc27.R.inc(66935);TestUtils.assertEquals(polynomials[0].getCoefficients(), target, coefficientTolerance);
        __CLR4_4_11flv1flvlb90pc27.R.inc(66936);target = new double[]{y[1], 8.594367e-01, -2.735672e-01, -0.08707914};
        __CLR4_4_11flv1flvlb90pc27.R.inc(66937);TestUtils.assertEquals(polynomials[1].getCoefficients(), target, coefficientTolerance);
        __CLR4_4_11flv1flvlb90pc27.R.inc(66938);target = new double[]{y[2], 1.471804e-17,-5.471344e-01, 0.08707914};
        __CLR4_4_11flv1flvlb90pc27.R.inc(66939);TestUtils.assertEquals(polynomials[2].getCoefficients(), target, coefficientTolerance);
        __CLR4_4_11flv1flvlb90pc27.R.inc(66940);target = new double[]{y[3], -8.594367e-01, -2.735672e-01, 0.17415829};
        __CLR4_4_11flv1flvlb90pc27.R.inc(66941);TestUtils.assertEquals(polynomials[3].getCoefficients(), target, coefficientTolerance);
        __CLR4_4_11flv1flvlb90pc27.R.inc(66942);target = new double[]{y[4], -1.002676, 6.548562e-17, 0.17415829};
        __CLR4_4_11flv1flvlb90pc27.R.inc(66943);TestUtils.assertEquals(polynomials[4].getCoefficients(), target, coefficientTolerance);
        __CLR4_4_11flv1flvlb90pc27.R.inc(66944);target = new double[]{y[5], -8.594367e-01, 2.735672e-01, 0.08707914};
        __CLR4_4_11flv1flvlb90pc27.R.inc(66945);TestUtils.assertEquals(polynomials[5].getCoefficients(), target, coefficientTolerance);
        __CLR4_4_11flv1flvlb90pc27.R.inc(66946);target = new double[]{y[6], 3.466465e-16, 5.471344e-01, -0.08707914};
        __CLR4_4_11flv1flvlb90pc27.R.inc(66947);TestUtils.assertEquals(polynomials[6].getCoefficients(), target, coefficientTolerance);
        __CLR4_4_11flv1flvlb90pc27.R.inc(66948);target = new double[]{y[7], 8.594367e-01, 2.735672e-01, -0.17415829};
        __CLR4_4_11flv1flvlb90pc27.R.inc(66949);TestUtils.assertEquals(polynomials[7].getCoefficients(), target, coefficientTolerance);

        //Check interpolation
        __CLR4_4_11flv1flvlb90pc27.R.inc(66950);Assert.assertEquals(FastMath.sqrt(2d) / 2d,f.value(FastMath.PI/4d),interpolationTolerance);
        __CLR4_4_11flv1flvlb90pc27.R.inc(66951);Assert.assertEquals(FastMath.sqrt(2d) / 2d,f.value(3d*FastMath.PI/4d),interpolationTolerance);
    }finally{__CLR4_4_11flv1flvlb90pc27.R.flushNeeded();}}

    @Test
    public void testIllegalArguments() {__CLR4_4_11flv1flvlb90pc27.R.globalSliceStart(getClass().getName(),66952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wabgah1fns();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11flv1flvlb90pc27.R.rethrow($CLV_t2$);}finally{__CLR4_4_11flv1flvlb90pc27.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.SplineInterpolatorTest.testIllegalArguments",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66952,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wabgah1fns(){try{__CLR4_4_11flv1flvlb90pc27.R.inc(66952);
        // Data set arrays of different size.
        __CLR4_4_11flv1flvlb90pc27.R.inc(66953);UnivariateInterpolator i = new SplineInterpolator();
        __CLR4_4_11flv1flvlb90pc27.R.inc(66954);try {
            __CLR4_4_11flv1flvlb90pc27.R.inc(66955);double xval[] = { 0.0, 1.0 };
            __CLR4_4_11flv1flvlb90pc27.R.inc(66956);double yval[] = { 0.0, 1.0, 2.0 };
            __CLR4_4_11flv1flvlb90pc27.R.inc(66957);i.interpolate(xval, yval);
            __CLR4_4_11flv1flvlb90pc27.R.inc(66958);Assert.fail("Failed to detect data set array with different sizes.");
        } catch (DimensionMismatchException iae) {
            // Expected.
        }
        // X values not sorted.
        __CLR4_4_11flv1flvlb90pc27.R.inc(66959);try {
            __CLR4_4_11flv1flvlb90pc27.R.inc(66960);double xval[] = { 0.0, 1.0, 0.5 };
            __CLR4_4_11flv1flvlb90pc27.R.inc(66961);double yval[] = { 0.0, 1.0, 2.0 };
            __CLR4_4_11flv1flvlb90pc27.R.inc(66962);i.interpolate(xval, yval);
            __CLR4_4_11flv1flvlb90pc27.R.inc(66963);Assert.fail("Failed to detect unsorted arguments.");
        } catch (NonMonotonicSequenceException iae) {
            // Expected.
        }
        // Not enough data to interpolate.
        __CLR4_4_11flv1flvlb90pc27.R.inc(66964);try {
            __CLR4_4_11flv1flvlb90pc27.R.inc(66965);double xval[] = { 0.0, 1.0 };
            __CLR4_4_11flv1flvlb90pc27.R.inc(66966);double yval[] = { 0.0, 1.0 };
            __CLR4_4_11flv1flvlb90pc27.R.inc(66967);i.interpolate(xval, yval);
            __CLR4_4_11flv1flvlb90pc27.R.inc(66968);Assert.fail("Failed to detect unsorted arguments.");
        } catch (NumberIsTooSmallException iae) {
            // Expected.
        }
    }finally{__CLR4_4_11flv1flvlb90pc27.R.flushNeeded();}}

    /**
     * verifies that f(x[i]) = y[i] for i = 0..n-1 where n is common length.
     */
    protected void verifyInterpolation(UnivariateFunction f, double x[], double y[])
       {try{__CLR4_4_11flv1flvlb90pc27.R.inc(66969);
        __CLR4_4_11flv1flvlb90pc27.R.inc(66970);for (int i = 0; (((i < x.length)&&(__CLR4_4_11flv1flvlb90pc27.R.iget(66971)!=0|true))||(__CLR4_4_11flv1flvlb90pc27.R.iget(66972)==0&false)); i++) {{
            __CLR4_4_11flv1flvlb90pc27.R.inc(66973);Assert.assertEquals(f.value(x[i]), y[i], knotTolerance);
        }
    }}finally{__CLR4_4_11flv1flvlb90pc27.R.flushNeeded();}}

    /**
     * Verifies that interpolating polynomials satisfy consistency requirement:
     *    adjacent polynomials must agree through two derivatives at knot points
     */
    protected void verifyConsistency(PolynomialSplineFunction f, double x[])
        {try{__CLR4_4_11flv1flvlb90pc27.R.inc(66974);
        __CLR4_4_11flv1flvlb90pc27.R.inc(66975);PolynomialFunction polynomials[] = f.getPolynomials();
        __CLR4_4_11flv1flvlb90pc27.R.inc(66976);for (int i = 1; (((i < x.length - 2)&&(__CLR4_4_11flv1flvlb90pc27.R.iget(66977)!=0|true))||(__CLR4_4_11flv1flvlb90pc27.R.iget(66978)==0&false)); i++) {{
            // evaluate polynomials and derivatives at x[i + 1]
            __CLR4_4_11flv1flvlb90pc27.R.inc(66979);Assert.assertEquals(polynomials[i].value(x[i +1] - x[i]), polynomials[i + 1].value(0), 0.1);
            __CLR4_4_11flv1flvlb90pc27.R.inc(66980);Assert.assertEquals(polynomials[i].derivative().value(x[i +1] - x[i]),
                                polynomials[i + 1].derivative().value(0), 0.5);
            __CLR4_4_11flv1flvlb90pc27.R.inc(66981);Assert.assertEquals(polynomials[i].polynomialDerivative().derivative().value(x[i +1] - x[i]),
                                polynomials[i + 1].polynomialDerivative().derivative().value(0), 0.5);
        }
    }}finally{__CLR4_4_11flv1flvlb90pc27.R.flushNeeded();}}

}
