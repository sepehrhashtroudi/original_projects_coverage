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

import java.util.Arrays;

import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.MathIllegalStateException;
import org.junit.Assert;
import org.junit.Test;

/**
 * Tests the PolynomialSplineFunction implementation.
 *
 * @version $Id$
 */
public class PolynomialSplineFunctionTest {static class __CLR4_4_11gbq1gbqlb90pc3h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,67885,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Error tolerance for tests */
    protected double tolerance = 1.0e-12;

    /**
     * Quadratic polynomials used in tests:
     *
     * x^2 + x            [-1, 0)
     * x^2 + x + 2        [0, 1)
     * x^2 + x + 4        [1, 2)
     *
     * Defined so that evaluation using PolynomialSplineFunction evaluation
     * algorithm agrees at knot point boundaries.
     */
    protected PolynomialFunction[] polynomials = {
        new PolynomialFunction(new double[] {0d, 1d, 1d}),
        new PolynomialFunction(new double[] {2d, 1d, 1d}),
        new PolynomialFunction(new double[] {4d, 1d, 1d})
    };

    /** Knot points  */
    protected double[] knots = {-1, 0, 1, 2};

    /** Derivative of test polynomials -- 2x + 1  */
    protected PolynomialFunction dp =
        new PolynomialFunction(new double[] {1d, 2d});


    @Test
    public void testConstructor() {__CLR4_4_11gbq1gbqlb90pc3h.R.globalSliceStart(getClass().getName(),67814);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uefs8h1gbq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbq1gbqlb90pc3h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbq1gbqlb90pc3h.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunctionTest.testConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67814,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uefs8h1gbq(){try{__CLR4_4_11gbq1gbqlb90pc3h.R.inc(67814);
        __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67815);PolynomialSplineFunction spline =
            new PolynomialSplineFunction(knots, polynomials);
        __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67816);Assert.assertTrue(Arrays.equals(knots, spline.getKnots()));
        __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67817);Assert.assertEquals(1d, spline.getPolynomials()[0].getCoefficients()[2], 0);
        __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67818);Assert.assertEquals(3, spline.getN());

        __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67819);try { // too few knots
            __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67820);new PolynomialSplineFunction(new double[] {0}, polynomials);
            __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67821);Assert.fail("Expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // expected
        }

        __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67822);try { // too many knots
            __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67823);new PolynomialSplineFunction(new double[] {0,1,2,3,4}, polynomials);
            __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67824);Assert.fail("Expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // expected
        }

        __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67825);try { // knots not increasing
            __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67826);new PolynomialSplineFunction(new double[] {0,1, 3, 2}, polynomials);
            __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67827);Assert.fail("Expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_11gbq1gbqlb90pc3h.R.flushNeeded();}}

    @Test
    public void testValues() {__CLR4_4_11gbq1gbqlb90pc3h.R.globalSliceStart(getClass().getName(),67828);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rrolwl1gc4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbq1gbqlb90pc3h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbq1gbqlb90pc3h.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunctionTest.testValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67828,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rrolwl1gc4(){try{__CLR4_4_11gbq1gbqlb90pc3h.R.inc(67828);
        __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67829);PolynomialSplineFunction spline =
            new PolynomialSplineFunction(knots, polynomials);
        __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67830);UnivariateFunction dSpline = spline.derivative();

        /**
         * interior points -- spline value at x should equal p(x - knot)
         * where knot is the largest knot point less than or equal to x and p
         * is the polynomial defined over the knot segment to which x belongs.
         */
        __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67831);double x = -1;
        __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67832);int index = 0;
        __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67833);for (int i = 0; (((i < 10)&&(__CLR4_4_11gbq1gbqlb90pc3h.R.iget(67834)!=0|true))||(__CLR4_4_11gbq1gbqlb90pc3h.R.iget(67835)==0&false)); i++) {{
           __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67836);x+=0.25;
           __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67837);index = findKnot(knots, x);
           __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67838);Assert.assertEquals("spline function evaluation failed for x=" + x,
                   polynomials[index].value(x - knots[index]), spline.value(x), tolerance);
           __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67839);Assert.assertEquals("spline derivative evaluation failed for x=" + x,
                   dp.value(x - knots[index]), dSpline.value(x), tolerance);
        }

        // knot points -- centering should zero arguments
        }__CLR4_4_11gbq1gbqlb90pc3h.R.inc(67840);for (int i = 0; (((i < 3)&&(__CLR4_4_11gbq1gbqlb90pc3h.R.iget(67841)!=0|true))||(__CLR4_4_11gbq1gbqlb90pc3h.R.iget(67842)==0&false)); i++) {{
            __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67843);Assert.assertEquals("spline function evaluation failed for knot=" + knots[i],
                    polynomials[i].value(0), spline.value(knots[i]), tolerance);
            __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67844);Assert.assertEquals("spline function evaluation failed for knot=" + knots[i],
                    dp.value(0), dSpline.value(knots[i]), tolerance);
        }

        }__CLR4_4_11gbq1gbqlb90pc3h.R.inc(67845);try { //outside of domain -- under min
            __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67846);x = spline.value(-1.5);
            __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67847);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }

        __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67848);try { //outside of domain -- over max
            __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67849);x = spline.value(2.5);
            __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67850);Assert.fail("Expecting OutOfRangeException");
        } catch (OutOfRangeException ex) {
            // expected
        }
    }finally{__CLR4_4_11gbq1gbqlb90pc3h.R.flushNeeded();}}

    @Test
    public void testIsValidPoint() {__CLR4_4_11gbq1gbqlb90pc3h.R.globalSliceStart(getClass().getName(),67851);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17vx8w91gcr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbq1gbqlb90pc3h.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbq1gbqlb90pc3h.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunctionTest.testIsValidPoint",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67851,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17vx8w91gcr(){try{__CLR4_4_11gbq1gbqlb90pc3h.R.inc(67851);
        __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67852);final PolynomialSplineFunction spline =
            new PolynomialSplineFunction(knots, polynomials);
        __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67853);final double xMin = knots[0];
        __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67854);final double xMax = knots[knots.length - 1];

        __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67855);double x;

        __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67856);x = xMin;
        __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67857);Assert.assertTrue(spline.isValidPoint(x));
        // Ensure that no exception is thrown.
        __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67858);spline.value(x);

        __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67859);x = xMax;
        __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67860);Assert.assertTrue(spline.isValidPoint(x));
        // Ensure that no exception is thrown.
        __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67861);spline.value(x);
 
        __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67862);final double xRange = xMax - xMin;
        __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67863);x = xMin + xRange / 3.4;
        __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67864);Assert.assertTrue(spline.isValidPoint(x));
        // Ensure that no exception is thrown.
        __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67865);spline.value(x);

        __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67866);final double small = 1e-8;
        __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67867);x = xMin - small;
        __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67868);Assert.assertFalse(spline.isValidPoint(x));
        // Ensure that an exception would have been thrown.
        __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67869);try {
            __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67870);spline.value(x);
            __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67871);Assert.fail("OutOfRangeException expected");
        } catch (OutOfRangeException expected) {}
    }finally{__CLR4_4_11gbq1gbqlb90pc3h.R.flushNeeded();}}

    /**
     *  Do linear search to find largest knot point less than or equal to x.
     *  Implementation does binary search.
     */
     protected int findKnot(double[] knots, double x) {try{__CLR4_4_11gbq1gbqlb90pc3h.R.inc(67872);
         __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67873);if ((((x < knots[0] || x >= knots[knots.length -1])&&(__CLR4_4_11gbq1gbqlb90pc3h.R.iget(67874)!=0|true))||(__CLR4_4_11gbq1gbqlb90pc3h.R.iget(67875)==0&false))) {{
             __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67876);throw new OutOfRangeException(x, knots[0], knots[knots.length -1]);
         }
         }__CLR4_4_11gbq1gbqlb90pc3h.R.inc(67877);for (int i = 0; (((i < knots.length)&&(__CLR4_4_11gbq1gbqlb90pc3h.R.iget(67878)!=0|true))||(__CLR4_4_11gbq1gbqlb90pc3h.R.iget(67879)==0&false)); i++) {{
             __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67880);if ((((knots[i] > x)&&(__CLR4_4_11gbq1gbqlb90pc3h.R.iget(67881)!=0|true))||(__CLR4_4_11gbq1gbqlb90pc3h.R.iget(67882)==0&false))) {{
                 __CLR4_4_11gbq1gbqlb90pc3h.R.inc(67883);return i - 1;
             }
         }}
         }__CLR4_4_11gbq1gbqlb90pc3h.R.inc(67884);throw new MathIllegalStateException();
     }finally{__CLR4_4_11gbq1gbqlb90pc3h.R.flushNeeded();}}
}

