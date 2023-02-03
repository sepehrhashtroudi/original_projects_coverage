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

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.NonMonotonicSequenceException;
import org.apache.commons.math3.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunction;
import org.apache.commons.math3.util.MathArrays;

/**
 * Computes a natural (also known as "free", "unclamped") cubic spline interpolation for the data set.
 * <p>
 * The {@link #interpolate(double[], double[])} method returns a {@link PolynomialSplineFunction}
 * consisting of n cubic polynomials, defined over the subintervals determined by the x values,
 * x[0] < x[i] ... < x[n].  The x values are referred to as "knot points."</p>
 * <p>
 * The value of the PolynomialSplineFunction at a point x that is greater than or equal to the smallest
 * knot point and strictly less than the largest knot point is computed by finding the subinterval to which
 * x belongs and computing the value of the corresponding polynomial at <code>x - x[i] </code> where
 * <code>i</code> is the index of the subinterval.  See {@link PolynomialSplineFunction} for more details.
 * </p>
 * <p>
 * The interpolating polynomials satisfy: <ol>
 * <li>The value of the PolynomialSplineFunction at each of the input x values equals the
 *  corresponding y value.</li>
 * <li>Adjacent polynomials are equal through two derivatives at the knot points (i.e., adjacent polynomials
 *  "match up" at the knot points, as do their first and second derivatives).</li>
 * </ol></p>
 * <p>
 * The cubic spline interpolation algorithm implemented is as described in R.L. Burden, J.D. Faires,
 * <u>Numerical Analysis</u>, 4th Ed., 1989, PWS-Kent, ISBN 0-53491-585-X, pp 126-131.
 * </p>
 *
 * @version $Id$
 */
public class SplineInterpolator implements UnivariateInterpolator {public static class __CLR4_4_133z33zlb90p6vf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,4080,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Computes an interpolating function for the data set.
     * @param x the arguments for the interpolation points
     * @param y the values for the interpolation points
     * @return a function which interpolates the data set
     * @throws DimensionMismatchException if {@code x} and {@code y}
     * have different sizes.
     * @throws NonMonotonicSequenceException if {@code x} is not sorted in
     * strict increasing order.
     * @throws NumberIsTooSmallException if the size of {@code x} is smaller
     * than 3.
     */
    public PolynomialSplineFunction interpolate(double x[], double y[])
        throws DimensionMismatchException,
               NumberIsTooSmallException,
               NonMonotonicSequenceException {try{__CLR4_4_133z33zlb90p6vf.R.inc(4031);
        __CLR4_4_133z33zlb90p6vf.R.inc(4032);if ((((x.length != y.length)&&(__CLR4_4_133z33zlb90p6vf.R.iget(4033)!=0|true))||(__CLR4_4_133z33zlb90p6vf.R.iget(4034)==0&false))) {{
            __CLR4_4_133z33zlb90p6vf.R.inc(4035);throw new DimensionMismatchException(x.length, y.length);
        }

        }__CLR4_4_133z33zlb90p6vf.R.inc(4036);if ((((x.length < 3)&&(__CLR4_4_133z33zlb90p6vf.R.iget(4037)!=0|true))||(__CLR4_4_133z33zlb90p6vf.R.iget(4038)==0&false))) {{
            __CLR4_4_133z33zlb90p6vf.R.inc(4039);throw new NumberIsTooSmallException(LocalizedFormats.NUMBER_OF_POINTS,
                                                x.length, 3, true);
        }

        // Number of intervals.  The number of data points is n + 1.
        }__CLR4_4_133z33zlb90p6vf.R.inc(4040);final int n = x.length - 1;

        __CLR4_4_133z33zlb90p6vf.R.inc(4041);MathArrays.checkOrder(x);

        // Differences between knot points
        __CLR4_4_133z33zlb90p6vf.R.inc(4042);final double h[] = new double[n];
        __CLR4_4_133z33zlb90p6vf.R.inc(4043);for (int i = 0; (((i < n)&&(__CLR4_4_133z33zlb90p6vf.R.iget(4044)!=0|true))||(__CLR4_4_133z33zlb90p6vf.R.iget(4045)==0&false)); i++) {{
            __CLR4_4_133z33zlb90p6vf.R.inc(4046);h[i] = x[i + 1] - x[i];
        }

        }__CLR4_4_133z33zlb90p6vf.R.inc(4047);final double mu[] = new double[n];
        __CLR4_4_133z33zlb90p6vf.R.inc(4048);final double z[] = new double[n + 1];
        __CLR4_4_133z33zlb90p6vf.R.inc(4049);mu[0] = 0d;
        __CLR4_4_133z33zlb90p6vf.R.inc(4050);z[0] = 0d;
        __CLR4_4_133z33zlb90p6vf.R.inc(4051);double g = 0;
        __CLR4_4_133z33zlb90p6vf.R.inc(4052);for (int i = 1; (((i < n)&&(__CLR4_4_133z33zlb90p6vf.R.iget(4053)!=0|true))||(__CLR4_4_133z33zlb90p6vf.R.iget(4054)==0&false)); i++) {{
            __CLR4_4_133z33zlb90p6vf.R.inc(4055);g = 2d * (x[i+1]  - x[i - 1]) - h[i - 1] * mu[i -1];
            __CLR4_4_133z33zlb90p6vf.R.inc(4056);mu[i] = h[i] / g;
            __CLR4_4_133z33zlb90p6vf.R.inc(4057);z[i] = (3d * (y[i + 1] * h[i - 1] - y[i] * (x[i + 1] - x[i - 1])+ y[i - 1] * h[i]) /
                    (h[i - 1] * h[i]) - h[i - 1] * z[i - 1]) / g;
        }

        // cubic spline coefficients --  b is linear, c quadratic, d is cubic (original y's are constants)
        }__CLR4_4_133z33zlb90p6vf.R.inc(4058);final double b[] = new double[n];
        __CLR4_4_133z33zlb90p6vf.R.inc(4059);final double c[] = new double[n + 1];
        __CLR4_4_133z33zlb90p6vf.R.inc(4060);final double d[] = new double[n];

        __CLR4_4_133z33zlb90p6vf.R.inc(4061);z[n] = 0d;
        __CLR4_4_133z33zlb90p6vf.R.inc(4062);c[n] = 0d;

        __CLR4_4_133z33zlb90p6vf.R.inc(4063);for (int j = n -1; (((j >=0)&&(__CLR4_4_133z33zlb90p6vf.R.iget(4064)!=0|true))||(__CLR4_4_133z33zlb90p6vf.R.iget(4065)==0&false)); j--) {{
            __CLR4_4_133z33zlb90p6vf.R.inc(4066);c[j] = z[j] - mu[j] * c[j + 1];
            __CLR4_4_133z33zlb90p6vf.R.inc(4067);b[j] = (y[j + 1] - y[j]) / h[j] - h[j] * (c[j + 1] + 2d * c[j]) / 3d;
            __CLR4_4_133z33zlb90p6vf.R.inc(4068);d[j] = (c[j + 1] - c[j]) / (3d * h[j]);
        }

        }__CLR4_4_133z33zlb90p6vf.R.inc(4069);final PolynomialFunction polynomials[] = new PolynomialFunction[n];
        __CLR4_4_133z33zlb90p6vf.R.inc(4070);final double coefficients[] = new double[4];
        __CLR4_4_133z33zlb90p6vf.R.inc(4071);for (int i = 0; (((i < n)&&(__CLR4_4_133z33zlb90p6vf.R.iget(4072)!=0|true))||(__CLR4_4_133z33zlb90p6vf.R.iget(4073)==0&false)); i++) {{
            __CLR4_4_133z33zlb90p6vf.R.inc(4074);coefficients[0] = y[i];
            __CLR4_4_133z33zlb90p6vf.R.inc(4075);coefficients[1] = b[i];
            __CLR4_4_133z33zlb90p6vf.R.inc(4076);coefficients[2] = c[i];
            __CLR4_4_133z33zlb90p6vf.R.inc(4077);coefficients[3] = d[i];
            __CLR4_4_133z33zlb90p6vf.R.inc(4078);polynomials[i] = new PolynomialFunction(coefficients);
        }

        }__CLR4_4_133z33zlb90p6vf.R.inc(4079);return new PolynomialSplineFunction(x, polynomials);
    }finally{__CLR4_4_133z33zlb90p6vf.R.flushNeeded();}}
}
