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

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.function.Expm1;
import org.apache.commons.math3.analysis.function.Sin;
import org.apache.commons.math3.exception.NonMonotonicSequenceException;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;


/**
 * Test case for Divided Difference interpolator.
 * <p>
 * The error of polynomial interpolation is
 *     f(z) - p(z) = f^(n)(zeta) * (z-x[0])(z-x[1])...(z-x[n-1]) / n!
 * where f^(n) is the n-th derivative of the approximated function and
 * zeta is some point in the interval determined by x[] and z.
 * <p>
 * Since zeta is unknown, f^(n)(zeta) cannot be calculated. But we can bound
 * it and use the absolute value upper bound for estimates. For reference,
 * see <b>Introduction to Numerical Analysis</b>, ISBN 038795452X, chapter 2.
 *
 * @version $Id$
 */
public final class DividedDifferenceInterpolatorTest {static class __CLR4_4_11ewu1ewulb90pc0p{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,66056,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Test of interpolator for the sine function.
     * <p>
     * |sin^(n)(zeta)| <= 1.0, zeta in [0, 2*PI]
     */
    @Test
    public void testSinFunction() {__CLR4_4_11ewu1ewulb90pc0p.R.globalSliceStart(getClass().getName(),65982);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1doerh71ewu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ewu1ewulb90pc0p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ewu1ewulb90pc0p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.DividedDifferenceInterpolatorTest.testSinFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65982,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1doerh71ewu(){try{__CLR4_4_11ewu1ewulb90pc0p.R.inc(65982);
        __CLR4_4_11ewu1ewulb90pc0p.R.inc(65983);UnivariateFunction f = new Sin();
        __CLR4_4_11ewu1ewulb90pc0p.R.inc(65984);UnivariateInterpolator interpolator = new DividedDifferenceInterpolator();
        __CLR4_4_11ewu1ewulb90pc0p.R.inc(65985);double x[], y[], z, expected, result, tolerance;

        // 6 interpolating points on interval [0, 2*PI]
        __CLR4_4_11ewu1ewulb90pc0p.R.inc(65986);int n = 6;
        __CLR4_4_11ewu1ewulb90pc0p.R.inc(65987);double min = 0.0, max = 2 * FastMath.PI;
        __CLR4_4_11ewu1ewulb90pc0p.R.inc(65988);x = new double[n];
        __CLR4_4_11ewu1ewulb90pc0p.R.inc(65989);y = new double[n];
        __CLR4_4_11ewu1ewulb90pc0p.R.inc(65990);for (int i = 0; (((i < n)&&(__CLR4_4_11ewu1ewulb90pc0p.R.iget(65991)!=0|true))||(__CLR4_4_11ewu1ewulb90pc0p.R.iget(65992)==0&false)); i++) {{
            __CLR4_4_11ewu1ewulb90pc0p.R.inc(65993);x[i] = min + i * (max - min) / n;
            __CLR4_4_11ewu1ewulb90pc0p.R.inc(65994);y[i] = f.value(x[i]);
        }
        }__CLR4_4_11ewu1ewulb90pc0p.R.inc(65995);double derivativebound = 1.0;
        __CLR4_4_11ewu1ewulb90pc0p.R.inc(65996);UnivariateFunction p = interpolator.interpolate(x, y);

        __CLR4_4_11ewu1ewulb90pc0p.R.inc(65997);z = FastMath.PI / 4; __CLR4_4_11ewu1ewulb90pc0p.R.inc(65998);expected = f.value(z); __CLR4_4_11ewu1ewulb90pc0p.R.inc(65999);result = p.value(z);
        __CLR4_4_11ewu1ewulb90pc0p.R.inc(66000);tolerance = FastMath.abs(derivativebound * partialerror(x, z));
        __CLR4_4_11ewu1ewulb90pc0p.R.inc(66001);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11ewu1ewulb90pc0p.R.inc(66002);z = FastMath.PI * 1.5; __CLR4_4_11ewu1ewulb90pc0p.R.inc(66003);expected = f.value(z); __CLR4_4_11ewu1ewulb90pc0p.R.inc(66004);result = p.value(z);
        __CLR4_4_11ewu1ewulb90pc0p.R.inc(66005);tolerance = FastMath.abs(derivativebound * partialerror(x, z));
        __CLR4_4_11ewu1ewulb90pc0p.R.inc(66006);Assert.assertEquals(expected, result, tolerance);
    }finally{__CLR4_4_11ewu1ewulb90pc0p.R.flushNeeded();}}

    /**
     * Test of interpolator for the exponential function.
     * <p>
     * |expm1^(n)(zeta)| <= e, zeta in [-1, 1]
     */
    @Test
    public void testExpm1Function() {__CLR4_4_11ewu1ewulb90pc0p.R.globalSliceStart(getClass().getName(),66007);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d4oziq1exj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ewu1ewulb90pc0p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ewu1ewulb90pc0p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.DividedDifferenceInterpolatorTest.testExpm1Function",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66007,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d4oziq1exj(){try{__CLR4_4_11ewu1ewulb90pc0p.R.inc(66007);
        __CLR4_4_11ewu1ewulb90pc0p.R.inc(66008);UnivariateFunction f = new Expm1();
        __CLR4_4_11ewu1ewulb90pc0p.R.inc(66009);UnivariateInterpolator interpolator = new DividedDifferenceInterpolator();
        __CLR4_4_11ewu1ewulb90pc0p.R.inc(66010);double x[], y[], z, expected, result, tolerance;

        // 5 interpolating points on interval [-1, 1]
        __CLR4_4_11ewu1ewulb90pc0p.R.inc(66011);int n = 5;
        __CLR4_4_11ewu1ewulb90pc0p.R.inc(66012);double min = -1.0, max = 1.0;
        __CLR4_4_11ewu1ewulb90pc0p.R.inc(66013);x = new double[n];
        __CLR4_4_11ewu1ewulb90pc0p.R.inc(66014);y = new double[n];
        __CLR4_4_11ewu1ewulb90pc0p.R.inc(66015);for (int i = 0; (((i < n)&&(__CLR4_4_11ewu1ewulb90pc0p.R.iget(66016)!=0|true))||(__CLR4_4_11ewu1ewulb90pc0p.R.iget(66017)==0&false)); i++) {{
            __CLR4_4_11ewu1ewulb90pc0p.R.inc(66018);x[i] = min + i * (max - min) / n;
            __CLR4_4_11ewu1ewulb90pc0p.R.inc(66019);y[i] = f.value(x[i]);
        }
        }__CLR4_4_11ewu1ewulb90pc0p.R.inc(66020);double derivativebound = FastMath.E;
        __CLR4_4_11ewu1ewulb90pc0p.R.inc(66021);UnivariateFunction p = interpolator.interpolate(x, y);

        __CLR4_4_11ewu1ewulb90pc0p.R.inc(66022);z = 0.0; __CLR4_4_11ewu1ewulb90pc0p.R.inc(66023);expected = f.value(z); __CLR4_4_11ewu1ewulb90pc0p.R.inc(66024);result = p.value(z);
        __CLR4_4_11ewu1ewulb90pc0p.R.inc(66025);tolerance = FastMath.abs(derivativebound * partialerror(x, z));
        __CLR4_4_11ewu1ewulb90pc0p.R.inc(66026);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11ewu1ewulb90pc0p.R.inc(66027);z = 0.5; __CLR4_4_11ewu1ewulb90pc0p.R.inc(66028);expected = f.value(z); __CLR4_4_11ewu1ewulb90pc0p.R.inc(66029);result = p.value(z);
        __CLR4_4_11ewu1ewulb90pc0p.R.inc(66030);tolerance = FastMath.abs(derivativebound * partialerror(x, z));
        __CLR4_4_11ewu1ewulb90pc0p.R.inc(66031);Assert.assertEquals(expected, result, tolerance);

        __CLR4_4_11ewu1ewulb90pc0p.R.inc(66032);z = -0.5; __CLR4_4_11ewu1ewulb90pc0p.R.inc(66033);expected = f.value(z); __CLR4_4_11ewu1ewulb90pc0p.R.inc(66034);result = p.value(z);
        __CLR4_4_11ewu1ewulb90pc0p.R.inc(66035);tolerance = FastMath.abs(derivativebound * partialerror(x, z));
        __CLR4_4_11ewu1ewulb90pc0p.R.inc(66036);Assert.assertEquals(expected, result, tolerance);
    }finally{__CLR4_4_11ewu1ewulb90pc0p.R.flushNeeded();}}

    /**
     * Test of parameters for the interpolator.
     */
    @Test
    public void testParameters() {__CLR4_4_11ewu1ewulb90pc0p.R.globalSliceStart(getClass().getName(),66037);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f58btv1eyd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ewu1ewulb90pc0p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ewu1ewulb90pc0p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.interpolation.DividedDifferenceInterpolatorTest.testParameters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66037,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f58btv1eyd(){try{__CLR4_4_11ewu1ewulb90pc0p.R.inc(66037);
        __CLR4_4_11ewu1ewulb90pc0p.R.inc(66038);UnivariateInterpolator interpolator = new DividedDifferenceInterpolator();

        __CLR4_4_11ewu1ewulb90pc0p.R.inc(66039);try {
            // bad abscissas array
            __CLR4_4_11ewu1ewulb90pc0p.R.inc(66040);double x[] = { 1.0, 2.0, 2.0, 4.0 };
            __CLR4_4_11ewu1ewulb90pc0p.R.inc(66041);double y[] = { 0.0, 4.0, 4.0, 2.5 };
            __CLR4_4_11ewu1ewulb90pc0p.R.inc(66042);UnivariateFunction p = interpolator.interpolate(x, y);
            __CLR4_4_11ewu1ewulb90pc0p.R.inc(66043);p.value(0.0);
            __CLR4_4_11ewu1ewulb90pc0p.R.inc(66044);Assert.fail("Expecting NonMonotonicSequenceException - bad abscissas array");
        } catch (NonMonotonicSequenceException ex) {
            // expected
        }
    }finally{__CLR4_4_11ewu1ewulb90pc0p.R.flushNeeded();}}

    /**
     * Returns the partial error term (z-x[0])(z-x[1])...(z-x[n-1])/n!
     */
    protected double partialerror(double x[], double z) throws
        IllegalArgumentException {try{__CLR4_4_11ewu1ewulb90pc0p.R.inc(66045);

        __CLR4_4_11ewu1ewulb90pc0p.R.inc(66046);if ((((x.length < 1)&&(__CLR4_4_11ewu1ewulb90pc0p.R.iget(66047)!=0|true))||(__CLR4_4_11ewu1ewulb90pc0p.R.iget(66048)==0&false))) {{
            __CLR4_4_11ewu1ewulb90pc0p.R.inc(66049);throw new IllegalArgumentException
                ("Interpolation array cannot be empty.");
        }
        }__CLR4_4_11ewu1ewulb90pc0p.R.inc(66050);double out = 1;
        __CLR4_4_11ewu1ewulb90pc0p.R.inc(66051);for (int i = 0; (((i < x.length)&&(__CLR4_4_11ewu1ewulb90pc0p.R.iget(66052)!=0|true))||(__CLR4_4_11ewu1ewulb90pc0p.R.iget(66053)==0&false)); i++) {{
            __CLR4_4_11ewu1ewulb90pc0p.R.inc(66054);out *= (z - x[i]) / (i + 1);
        }
        }__CLR4_4_11ewu1ewulb90pc0p.R.inc(66055);return out;
    }finally{__CLR4_4_11ewu1ewulb90pc0p.R.flushNeeded();}}
}
