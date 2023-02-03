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

import java.io.Serializable;
import org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeForm;
import org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonForm;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.NonMonotonicSequenceException;

/**
 * Implements the <a href="
 * http://mathworld.wolfram.com/NewtonsDividedDifferenceInterpolationFormula.html">
 * Divided Difference Algorithm</a> for interpolation of real univariate
 * functions. For reference, see <b>Introduction to Numerical Analysis</b>,
 * ISBN 038795452X, chapter 2.
 * <p>
 * The actual code of Neville's evaluation is in PolynomialFunctionLagrangeForm,
 * this class provides an easy-to-use interface to it.</p>
 *
 * @version $Id$
 * @since 1.2
 */
public class DividedDifferenceInterpolator
    implements UnivariateInterpolator, Serializable {public static class __CLR4_4_12ny2nylb90p6sn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,3476,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** serializable version identifier */
    private static final long serialVersionUID = 107049519551235069L;

    /**
     * Compute an interpolating function for the dataset.
     *
     * @param x Interpolating points array.
     * @param y Interpolating values array.
     * @return a function which interpolates the dataset.
     * @throws DimensionMismatchException if the array lengths are different.
     * @throws NumberIsTooSmallException if the number of points is less than 2.
     * @throws NonMonotonicSequenceException if {@code x} is not sorted in
     * strictly increasing order.
     */
    public PolynomialFunctionNewtonForm interpolate(double x[], double y[])
        throws DimensionMismatchException,
               NumberIsTooSmallException,
               NonMonotonicSequenceException {try{__CLR4_4_12ny2nylb90p6sn.R.inc(3454);
        /**
         * a[] and c[] are defined in the general formula of Newton form:
         * p(x) = a[0] + a[1](x-c[0]) + a[2](x-c[0])(x-c[1]) + ... +
         *        a[n](x-c[0])(x-c[1])...(x-c[n-1])
         */
        __CLR4_4_12ny2nylb90p6sn.R.inc(3455);PolynomialFunctionLagrangeForm.verifyInterpolationArray(x, y, true);

        /**
         * When used for interpolation, the Newton form formula becomes
         * p(x) = f[x0] + f[x0,x1](x-x0) + f[x0,x1,x2](x-x0)(x-x1) + ... +
         *        f[x0,x1,...,x[n-1]](x-x0)(x-x1)...(x-x[n-2])
         * Therefore, a[k] = f[x0,x1,...,xk], c[k] = x[k].
         * <p>
         * Note x[], y[], a[] have the same length but c[]'s size is one less.</p>
         */
        __CLR4_4_12ny2nylb90p6sn.R.inc(3456);final double[] c = new double[x.length-1];
        __CLR4_4_12ny2nylb90p6sn.R.inc(3457);System.arraycopy(x, 0, c, 0, c.length);

        __CLR4_4_12ny2nylb90p6sn.R.inc(3458);final double[] a = computeDividedDifference(x, y);
        __CLR4_4_12ny2nylb90p6sn.R.inc(3459);return new PolynomialFunctionNewtonForm(a, c);
    }finally{__CLR4_4_12ny2nylb90p6sn.R.flushNeeded();}}

    /**
     * Return a copy of the divided difference array.
     * <p>
     * The divided difference array is defined recursively by <pre>
     * f[x0] = f(x0)
     * f[x0,x1,...,xk] = (f[x1,...,xk] - f[x0,...,x[k-1]]) / (xk - x0)
     * </pre></p>
     * <p>
     * The computational complexity is O(N^2).</p>
     *
     * @param x Interpolating points array.
     * @param y Interpolating values array.
     * @return a fresh copy of the divided difference array.
     * @throws DimensionMismatchException if the array lengths are different.
     * @throws NumberIsTooSmallException if the number of points is less than 2.
     * @throws NonMonotonicSequenceException
     * if {@code x} is not sorted in strictly increasing order.
     */
    protected static double[] computeDividedDifference(final double x[], final double y[])
        throws DimensionMismatchException,
               NumberIsTooSmallException,
               NonMonotonicSequenceException {try{__CLR4_4_12ny2nylb90p6sn.R.inc(3460);
        __CLR4_4_12ny2nylb90p6sn.R.inc(3461);PolynomialFunctionLagrangeForm.verifyInterpolationArray(x, y, true);

        __CLR4_4_12ny2nylb90p6sn.R.inc(3462);final double[] divdiff = y.clone(); // initialization

        __CLR4_4_12ny2nylb90p6sn.R.inc(3463);final int n = x.length;
        __CLR4_4_12ny2nylb90p6sn.R.inc(3464);final double[] a = new double [n];
        __CLR4_4_12ny2nylb90p6sn.R.inc(3465);a[0] = divdiff[0];
        __CLR4_4_12ny2nylb90p6sn.R.inc(3466);for (int i = 1; (((i < n)&&(__CLR4_4_12ny2nylb90p6sn.R.iget(3467)!=0|true))||(__CLR4_4_12ny2nylb90p6sn.R.iget(3468)==0&false)); i++) {{
            __CLR4_4_12ny2nylb90p6sn.R.inc(3469);for (int j = 0; (((j < n-i)&&(__CLR4_4_12ny2nylb90p6sn.R.iget(3470)!=0|true))||(__CLR4_4_12ny2nylb90p6sn.R.iget(3471)==0&false)); j++) {{
                __CLR4_4_12ny2nylb90p6sn.R.inc(3472);final double denominator = x[j+i] - x[j];
                __CLR4_4_12ny2nylb90p6sn.R.inc(3473);divdiff[j] = (divdiff[j+1] - divdiff[j]) / denominator;
            }
            }__CLR4_4_12ny2nylb90p6sn.R.inc(3474);a[i] = divdiff[0];
        }

        }__CLR4_4_12ny2nylb90p6sn.R.inc(3475);return a;
    }finally{__CLR4_4_12ny2nylb90p6sn.R.flushNeeded();}}
}
