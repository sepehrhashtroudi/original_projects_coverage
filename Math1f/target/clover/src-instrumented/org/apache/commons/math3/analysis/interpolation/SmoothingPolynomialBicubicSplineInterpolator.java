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
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.NonMonotonicSequenceException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.util.MathArrays;
import org.apache.commons.math3.util.Precision;
import org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer;
import org.apache.commons.math3.fitting.PolynomialFitter;
import org.apache.commons.math3.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math3.optim.SimpleVectorValueChecker;

/**
 * Generates a bicubic interpolation function.
 * Prior to generating the interpolating function, the input is smoothed using
 * polynomial fitting.
 *
 * @version $Id$
 * @since 2.2
 */
public class SmoothingPolynomialBicubicSplineInterpolator
    extends BicubicSplineInterpolator {public static class __CLR4_4_131t31tlb90p6v5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,4031,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Fitter for x. */
    private final PolynomialFitter xFitter;
    /** Degree of the fitting polynomial. */
    private final int xDegree;
    /** Fitter for y. */
    private final PolynomialFitter yFitter;
    /** Degree of the fitting polynomial. */
    private final int yDegree;

    /**
     * Default constructor. The degree of the fitting polynomials is set to 3.
     */
    public SmoothingPolynomialBicubicSplineInterpolator() {
        this(3);__CLR4_4_131t31tlb90p6v5.R.inc(3954);try{__CLR4_4_131t31tlb90p6v5.R.inc(3953);
    }finally{__CLR4_4_131t31tlb90p6v5.R.flushNeeded();}}

    /**
     * @param degree Degree of the polynomial fitting functions.
     * @exception NotPositiveException if degree is not positive
     */
    public SmoothingPolynomialBicubicSplineInterpolator(int degree)
        throws NotPositiveException {
        this(degree, degree);__CLR4_4_131t31tlb90p6v5.R.inc(3956);try{__CLR4_4_131t31tlb90p6v5.R.inc(3955);
    }finally{__CLR4_4_131t31tlb90p6v5.R.flushNeeded();}}

    /**
     * @param xDegree Degree of the polynomial fitting functions along the
     * x-dimension.
     * @param yDegree Degree of the polynomial fitting functions along the
     * y-dimension.
     * @exception NotPositiveException if degrees are not positive
     */
    public SmoothingPolynomialBicubicSplineInterpolator(int xDegree, int yDegree)
        throws NotPositiveException {try{__CLR4_4_131t31tlb90p6v5.R.inc(3957);
        __CLR4_4_131t31tlb90p6v5.R.inc(3958);if ((((xDegree < 0)&&(__CLR4_4_131t31tlb90p6v5.R.iget(3959)!=0|true))||(__CLR4_4_131t31tlb90p6v5.R.iget(3960)==0&false))) {{
            __CLR4_4_131t31tlb90p6v5.R.inc(3961);throw new NotPositiveException(xDegree);
        }
        }__CLR4_4_131t31tlb90p6v5.R.inc(3962);if ((((yDegree < 0)&&(__CLR4_4_131t31tlb90p6v5.R.iget(3963)!=0|true))||(__CLR4_4_131t31tlb90p6v5.R.iget(3964)==0&false))) {{
            __CLR4_4_131t31tlb90p6v5.R.inc(3965);throw new NotPositiveException(yDegree);
        }
        }__CLR4_4_131t31tlb90p6v5.R.inc(3966);this.xDegree = xDegree;
        __CLR4_4_131t31tlb90p6v5.R.inc(3967);this.yDegree = yDegree;

        __CLR4_4_131t31tlb90p6v5.R.inc(3968);final double safeFactor = 1e2;
        __CLR4_4_131t31tlb90p6v5.R.inc(3969);final SimpleVectorValueChecker checker
            = new SimpleVectorValueChecker(safeFactor * Precision.EPSILON,
                                           safeFactor * Precision.SAFE_MIN);
        __CLR4_4_131t31tlb90p6v5.R.inc(3970);xFitter = new PolynomialFitter(new GaussNewtonOptimizer(false, checker));
        __CLR4_4_131t31tlb90p6v5.R.inc(3971);yFitter = new PolynomialFitter(new GaussNewtonOptimizer(false, checker));
    }finally{__CLR4_4_131t31tlb90p6v5.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public BicubicSplineInterpolatingFunction interpolate(final double[] xval,
                                                          final double[] yval,
                                                          final double[][] fval)
        throws NoDataException, NullArgumentException,
               DimensionMismatchException, NonMonotonicSequenceException {try{__CLR4_4_131t31tlb90p6v5.R.inc(3972);
        __CLR4_4_131t31tlb90p6v5.R.inc(3973);if ((((xval.length == 0 || yval.length == 0 || fval.length == 0)&&(__CLR4_4_131t31tlb90p6v5.R.iget(3974)!=0|true))||(__CLR4_4_131t31tlb90p6v5.R.iget(3975)==0&false))) {{
            __CLR4_4_131t31tlb90p6v5.R.inc(3976);throw new NoDataException();
        }
        }__CLR4_4_131t31tlb90p6v5.R.inc(3977);if ((((xval.length != fval.length)&&(__CLR4_4_131t31tlb90p6v5.R.iget(3978)!=0|true))||(__CLR4_4_131t31tlb90p6v5.R.iget(3979)==0&false))) {{
            __CLR4_4_131t31tlb90p6v5.R.inc(3980);throw new DimensionMismatchException(xval.length, fval.length);
        }

        }__CLR4_4_131t31tlb90p6v5.R.inc(3981);final int xLen = xval.length;
        __CLR4_4_131t31tlb90p6v5.R.inc(3982);final int yLen = yval.length;

        __CLR4_4_131t31tlb90p6v5.R.inc(3983);for (int i = 0; (((i < xLen)&&(__CLR4_4_131t31tlb90p6v5.R.iget(3984)!=0|true))||(__CLR4_4_131t31tlb90p6v5.R.iget(3985)==0&false)); i++) {{
            __CLR4_4_131t31tlb90p6v5.R.inc(3986);if ((((fval[i].length != yLen)&&(__CLR4_4_131t31tlb90p6v5.R.iget(3987)!=0|true))||(__CLR4_4_131t31tlb90p6v5.R.iget(3988)==0&false))) {{
                __CLR4_4_131t31tlb90p6v5.R.inc(3989);throw new DimensionMismatchException(fval[i].length, yLen);
            }
        }}

        }__CLR4_4_131t31tlb90p6v5.R.inc(3990);MathArrays.checkOrder(xval);
        __CLR4_4_131t31tlb90p6v5.R.inc(3991);MathArrays.checkOrder(yval);

        // For each line y[j] (0 <= j < yLen), construct a polynomial, with
        // respect to variable x, fitting array fval[][j]
        __CLR4_4_131t31tlb90p6v5.R.inc(3992);final PolynomialFunction[] yPolyX = new PolynomialFunction[yLen];
        __CLR4_4_131t31tlb90p6v5.R.inc(3993);for (int j = 0; (((j < yLen)&&(__CLR4_4_131t31tlb90p6v5.R.iget(3994)!=0|true))||(__CLR4_4_131t31tlb90p6v5.R.iget(3995)==0&false)); j++) {{
            __CLR4_4_131t31tlb90p6v5.R.inc(3996);xFitter.clearObservations();
            __CLR4_4_131t31tlb90p6v5.R.inc(3997);for (int i = 0; (((i < xLen)&&(__CLR4_4_131t31tlb90p6v5.R.iget(3998)!=0|true))||(__CLR4_4_131t31tlb90p6v5.R.iget(3999)==0&false)); i++) {{
                __CLR4_4_131t31tlb90p6v5.R.inc(4000);xFitter.addObservedPoint(1, xval[i], fval[i][j]);
            }

            // Initial guess for the fit is zero for each coefficients (of which
            // there are "xDegree" + 1).
            }__CLR4_4_131t31tlb90p6v5.R.inc(4001);yPolyX[j] = new PolynomialFunction(xFitter.fit(new double[xDegree + 1]));
        }

        // For every knot (xval[i], yval[j]) of the grid, calculate corrected
        // values fval_1
        }__CLR4_4_131t31tlb90p6v5.R.inc(4002);final double[][] fval_1 = new double[xLen][yLen];
        __CLR4_4_131t31tlb90p6v5.R.inc(4003);for (int j = 0; (((j < yLen)&&(__CLR4_4_131t31tlb90p6v5.R.iget(4004)!=0|true))||(__CLR4_4_131t31tlb90p6v5.R.iget(4005)==0&false)); j++) {{
            __CLR4_4_131t31tlb90p6v5.R.inc(4006);final PolynomialFunction f = yPolyX[j];
            __CLR4_4_131t31tlb90p6v5.R.inc(4007);for (int i = 0; (((i < xLen)&&(__CLR4_4_131t31tlb90p6v5.R.iget(4008)!=0|true))||(__CLR4_4_131t31tlb90p6v5.R.iget(4009)==0&false)); i++) {{
                __CLR4_4_131t31tlb90p6v5.R.inc(4010);fval_1[i][j] = f.value(xval[i]);
            }
        }}

        // For each line x[i] (0 <= i < xLen), construct a polynomial, with
        // respect to variable y, fitting array fval_1[i][]
        }__CLR4_4_131t31tlb90p6v5.R.inc(4011);final PolynomialFunction[] xPolyY = new PolynomialFunction[xLen];
        __CLR4_4_131t31tlb90p6v5.R.inc(4012);for (int i = 0; (((i < xLen)&&(__CLR4_4_131t31tlb90p6v5.R.iget(4013)!=0|true))||(__CLR4_4_131t31tlb90p6v5.R.iget(4014)==0&false)); i++) {{
            __CLR4_4_131t31tlb90p6v5.R.inc(4015);yFitter.clearObservations();
            __CLR4_4_131t31tlb90p6v5.R.inc(4016);for (int j = 0; (((j < yLen)&&(__CLR4_4_131t31tlb90p6v5.R.iget(4017)!=0|true))||(__CLR4_4_131t31tlb90p6v5.R.iget(4018)==0&false)); j++) {{
                __CLR4_4_131t31tlb90p6v5.R.inc(4019);yFitter.addObservedPoint(1, yval[j], fval_1[i][j]);
            }

            // Initial guess for the fit is zero for each coefficients (of which
            // there are "yDegree" + 1).
            }__CLR4_4_131t31tlb90p6v5.R.inc(4020);xPolyY[i] = new PolynomialFunction(yFitter.fit(new double[yDegree + 1]));
        }

        // For every knot (xval[i], yval[j]) of the grid, calculate corrected
        // values fval_2
        }__CLR4_4_131t31tlb90p6v5.R.inc(4021);final double[][] fval_2 = new double[xLen][yLen];
        __CLR4_4_131t31tlb90p6v5.R.inc(4022);for (int i = 0; (((i < xLen)&&(__CLR4_4_131t31tlb90p6v5.R.iget(4023)!=0|true))||(__CLR4_4_131t31tlb90p6v5.R.iget(4024)==0&false)); i++) {{
            __CLR4_4_131t31tlb90p6v5.R.inc(4025);final PolynomialFunction f = xPolyY[i];
            __CLR4_4_131t31tlb90p6v5.R.inc(4026);for (int j = 0; (((j < yLen)&&(__CLR4_4_131t31tlb90p6v5.R.iget(4027)!=0|true))||(__CLR4_4_131t31tlb90p6v5.R.iget(4028)==0&false)); j++) {{
                __CLR4_4_131t31tlb90p6v5.R.inc(4029);fval_2[i][j] = f.value(yval[j]);
            }
        }}

        }__CLR4_4_131t31tlb90p6v5.R.inc(4030);return super.interpolate(xval, yval, fval_2);
    }finally{__CLR4_4_131t31tlb90p6v5.R.flushNeeded();}}
}
