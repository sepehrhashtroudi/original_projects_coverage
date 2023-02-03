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

import java.util.Arrays;
import org.apache.commons.math3.analysis.BivariateFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.NonMonotonicSequenceException;
import org.apache.commons.math3.util.MathArrays;

/**
 * Function that implements the
 * <a href="http://en.wikipedia.org/wiki/Bicubic_interpolation">
 * bicubic spline interpolation</a>.
 *
 * @since 2.1
 * @version $Id$
 */
public class BicubicSplineInterpolatingFunction
    implements BivariateFunction {public static class __CLR4_4_12es2eslb90p6ry{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,3257,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Number of coefficients. */
    private static final int NUM_COEFF = 16;
    /**
     * Matrix to compute the spline coefficients from the function values
     * and function derivatives values
     */
    private static final double[][] AINV = {
        { 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 },
        { 0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0 },
        { -3,3,0,0,-2,-1,0,0,0,0,0,0,0,0,0,0 },
        { 2,-2,0,0,1,1,0,0,0,0,0,0,0,0,0,0 },
        { 0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0 },
        { 0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0 },
        { 0,0,0,0,0,0,0,0,-3,3,0,0,-2,-1,0,0 },
        { 0,0,0,0,0,0,0,0,2,-2,0,0,1,1,0,0 },
        { -3,0,3,0,0,0,0,0,-2,0,-1,0,0,0,0,0 },
        { 0,0,0,0,-3,0,3,0,0,0,0,0,-2,0,-1,0 },
        { 9,-9,-9,9,6,3,-6,-3,6,-6,3,-3,4,2,2,1 },
        { -6,6,6,-6,-3,-3,3,3,-4,4,-2,2,-2,-2,-1,-1 },
        { 2,0,-2,0,0,0,0,0,1,0,1,0,0,0,0,0 },
        { 0,0,0,0,2,0,-2,0,0,0,0,0,1,0,1,0 },
        { -6,6,6,-6,-4,-2,4,2,-3,3,-3,3,-2,-1,-2,-1 },
        { 4,-4,-4,4,2,2,-2,-2,2,-2,2,-2,1,1,1,1 }
    };

    /** Samples x-coordinates */
    private final double[] xval;
    /** Samples y-coordinates */
    private final double[] yval;
    /** Set of cubic splines patching the whole data grid */
    private final BicubicSplineFunction[][] splines;
    /**
     * Partial derivatives
     * The value of the first index determines the kind of derivatives:
     * 0 = first partial derivatives wrt x
     * 1 = first partial derivatives wrt y
     * 2 = second partial derivatives wrt x
     * 3 = second partial derivatives wrt y
     * 4 = cross partial derivatives
     */
    private BivariateFunction[][][] partialDerivatives = null;

    /**
     * @param x Sample values of the x-coordinate, in increasing order.
     * @param y Sample values of the y-coordinate, in increasing order.
     * @param f Values of the function on every grid point.
     * @param dFdX Values of the partial derivative of function with respect
     * to x on every grid point.
     * @param dFdY Values of the partial derivative of function with respect
     * to y on every grid point.
     * @param d2FdXdY Values of the cross partial derivative of function on
     * every grid point.
     * @throws DimensionMismatchException if the various arrays do not contain
     * the expected number of elements.
     * @throws NonMonotonicSequenceException if {@code x} or {@code y} are
     * not strictly increasing.
     * @throws NoDataException if any of the arrays has zero length.
     */
    public BicubicSplineInterpolatingFunction(double[] x,
                                              double[] y,
                                              double[][] f,
                                              double[][] dFdX,
                                              double[][] dFdY,
                                              double[][] d2FdXdY)
        throws DimensionMismatchException,
               NoDataException,
               NonMonotonicSequenceException {try{__CLR4_4_12es2eslb90p6ry.R.inc(3124);
        __CLR4_4_12es2eslb90p6ry.R.inc(3125);final int xLen = x.length;
        __CLR4_4_12es2eslb90p6ry.R.inc(3126);final int yLen = y.length;

        __CLR4_4_12es2eslb90p6ry.R.inc(3127);if ((((xLen == 0 || yLen == 0 || f.length == 0 || f[0].length == 0)&&(__CLR4_4_12es2eslb90p6ry.R.iget(3128)!=0|true))||(__CLR4_4_12es2eslb90p6ry.R.iget(3129)==0&false))) {{
            __CLR4_4_12es2eslb90p6ry.R.inc(3130);throw new NoDataException();
        }
        }__CLR4_4_12es2eslb90p6ry.R.inc(3131);if ((((xLen != f.length)&&(__CLR4_4_12es2eslb90p6ry.R.iget(3132)!=0|true))||(__CLR4_4_12es2eslb90p6ry.R.iget(3133)==0&false))) {{
            __CLR4_4_12es2eslb90p6ry.R.inc(3134);throw new DimensionMismatchException(xLen, f.length);
        }
        }__CLR4_4_12es2eslb90p6ry.R.inc(3135);if ((((xLen != dFdX.length)&&(__CLR4_4_12es2eslb90p6ry.R.iget(3136)!=0|true))||(__CLR4_4_12es2eslb90p6ry.R.iget(3137)==0&false))) {{
            __CLR4_4_12es2eslb90p6ry.R.inc(3138);throw new DimensionMismatchException(xLen, dFdX.length);
        }
        }__CLR4_4_12es2eslb90p6ry.R.inc(3139);if ((((xLen != dFdY.length)&&(__CLR4_4_12es2eslb90p6ry.R.iget(3140)!=0|true))||(__CLR4_4_12es2eslb90p6ry.R.iget(3141)==0&false))) {{
            __CLR4_4_12es2eslb90p6ry.R.inc(3142);throw new DimensionMismatchException(xLen, dFdY.length);
        }
        }__CLR4_4_12es2eslb90p6ry.R.inc(3143);if ((((xLen != d2FdXdY.length)&&(__CLR4_4_12es2eslb90p6ry.R.iget(3144)!=0|true))||(__CLR4_4_12es2eslb90p6ry.R.iget(3145)==0&false))) {{
            __CLR4_4_12es2eslb90p6ry.R.inc(3146);throw new DimensionMismatchException(xLen, d2FdXdY.length);
        }

        }__CLR4_4_12es2eslb90p6ry.R.inc(3147);MathArrays.checkOrder(x);
        __CLR4_4_12es2eslb90p6ry.R.inc(3148);MathArrays.checkOrder(y);

        __CLR4_4_12es2eslb90p6ry.R.inc(3149);xval = x.clone();
        __CLR4_4_12es2eslb90p6ry.R.inc(3150);yval = y.clone();

        __CLR4_4_12es2eslb90p6ry.R.inc(3151);final int lastI = xLen - 1;
        __CLR4_4_12es2eslb90p6ry.R.inc(3152);final int lastJ = yLen - 1;
        __CLR4_4_12es2eslb90p6ry.R.inc(3153);splines = new BicubicSplineFunction[lastI][lastJ];

        __CLR4_4_12es2eslb90p6ry.R.inc(3154);for (int i = 0; (((i < lastI)&&(__CLR4_4_12es2eslb90p6ry.R.iget(3155)!=0|true))||(__CLR4_4_12es2eslb90p6ry.R.iget(3156)==0&false)); i++) {{
            __CLR4_4_12es2eslb90p6ry.R.inc(3157);if ((((f[i].length != yLen)&&(__CLR4_4_12es2eslb90p6ry.R.iget(3158)!=0|true))||(__CLR4_4_12es2eslb90p6ry.R.iget(3159)==0&false))) {{
                __CLR4_4_12es2eslb90p6ry.R.inc(3160);throw new DimensionMismatchException(f[i].length, yLen);
            }
            }__CLR4_4_12es2eslb90p6ry.R.inc(3161);if ((((dFdX[i].length != yLen)&&(__CLR4_4_12es2eslb90p6ry.R.iget(3162)!=0|true))||(__CLR4_4_12es2eslb90p6ry.R.iget(3163)==0&false))) {{
                __CLR4_4_12es2eslb90p6ry.R.inc(3164);throw new DimensionMismatchException(dFdX[i].length, yLen);
            }
            }__CLR4_4_12es2eslb90p6ry.R.inc(3165);if ((((dFdY[i].length != yLen)&&(__CLR4_4_12es2eslb90p6ry.R.iget(3166)!=0|true))||(__CLR4_4_12es2eslb90p6ry.R.iget(3167)==0&false))) {{
                __CLR4_4_12es2eslb90p6ry.R.inc(3168);throw new DimensionMismatchException(dFdY[i].length, yLen);
            }
            }__CLR4_4_12es2eslb90p6ry.R.inc(3169);if ((((d2FdXdY[i].length != yLen)&&(__CLR4_4_12es2eslb90p6ry.R.iget(3170)!=0|true))||(__CLR4_4_12es2eslb90p6ry.R.iget(3171)==0&false))) {{
                __CLR4_4_12es2eslb90p6ry.R.inc(3172);throw new DimensionMismatchException(d2FdXdY[i].length, yLen);
            }
            }__CLR4_4_12es2eslb90p6ry.R.inc(3173);final int ip1 = i + 1;
            __CLR4_4_12es2eslb90p6ry.R.inc(3174);for (int j = 0; (((j < lastJ)&&(__CLR4_4_12es2eslb90p6ry.R.iget(3175)!=0|true))||(__CLR4_4_12es2eslb90p6ry.R.iget(3176)==0&false)); j++) {{
                __CLR4_4_12es2eslb90p6ry.R.inc(3177);final int jp1 = j + 1;
                __CLR4_4_12es2eslb90p6ry.R.inc(3178);final double[] beta = new double[] {
                    f[i][j], f[ip1][j], f[i][jp1], f[ip1][jp1],
                    dFdX[i][j], dFdX[ip1][j], dFdX[i][jp1], dFdX[ip1][jp1],
                    dFdY[i][j], dFdY[ip1][j], dFdY[i][jp1], dFdY[ip1][jp1],
                    d2FdXdY[i][j], d2FdXdY[ip1][j], d2FdXdY[i][jp1], d2FdXdY[ip1][jp1]
                };

                __CLR4_4_12es2eslb90p6ry.R.inc(3179);splines[i][j] = new BicubicSplineFunction(computeSplineCoefficients(beta));
            }
        }}
    }}finally{__CLR4_4_12es2eslb90p6ry.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public double value(double x, double y)
        throws OutOfRangeException {try{__CLR4_4_12es2eslb90p6ry.R.inc(3180);
        __CLR4_4_12es2eslb90p6ry.R.inc(3181);final int i = searchIndex(x, xval);
        __CLR4_4_12es2eslb90p6ry.R.inc(3182);final int j = searchIndex(y, yval);

        __CLR4_4_12es2eslb90p6ry.R.inc(3183);final double xN = (x - xval[i]) / (xval[i + 1] - xval[i]);
        __CLR4_4_12es2eslb90p6ry.R.inc(3184);final double yN = (y - yval[j]) / (yval[j + 1] - yval[j]);

        __CLR4_4_12es2eslb90p6ry.R.inc(3185);return splines[i][j].value(xN, yN);
    }finally{__CLR4_4_12es2eslb90p6ry.R.flushNeeded();}}

    /**
     * Indicates whether a point is within the interpolation range.
     *
     * @param x First coordinate.
     * @param y Second coordinate.
     * @return {@code true} if (x, y) is a valid point.
     * @since 3.3
     */
    public boolean isValidPoint(double x, double y) {try{__CLR4_4_12es2eslb90p6ry.R.inc(3186);
        __CLR4_4_12es2eslb90p6ry.R.inc(3187);if ((((x < xval[0] ||
            x > xval[xval.length - 1] ||
            y < yval[0] ||
            y > yval[yval.length - 1])&&(__CLR4_4_12es2eslb90p6ry.R.iget(3188)!=0|true))||(__CLR4_4_12es2eslb90p6ry.R.iget(3189)==0&false))) {{
            __CLR4_4_12es2eslb90p6ry.R.inc(3190);return false;
        } }else {{
            __CLR4_4_12es2eslb90p6ry.R.inc(3191);return true;
        }
    }}finally{__CLR4_4_12es2eslb90p6ry.R.flushNeeded();}}

    /**
     * @param x x-coordinate.
     * @param y y-coordinate.
     * @return the value at point (x, y) of the first partial derivative with
     * respect to x.
     * @throws OutOfRangeException if {@code x} (resp. {@code y}) is outside
     * the range defined by the boundary values of {@code xval} (resp.
     * {@code yval}).
     */
    public double partialDerivativeX(double x, double y)
        throws OutOfRangeException {try{__CLR4_4_12es2eslb90p6ry.R.inc(3192);
        __CLR4_4_12es2eslb90p6ry.R.inc(3193);return partialDerivative(0, x, y);
    }finally{__CLR4_4_12es2eslb90p6ry.R.flushNeeded();}}
    /**
     * @param x x-coordinate.
     * @param y y-coordinate.
     * @return the value at point (x, y) of the first partial derivative with
     * respect to y.
     * @throws OutOfRangeException if {@code x} (resp. {@code y}) is outside
     * the range defined by the boundary values of {@code xval} (resp.
     * {@code yval}).
     */
    public double partialDerivativeY(double x, double y)
        throws OutOfRangeException {try{__CLR4_4_12es2eslb90p6ry.R.inc(3194);
        __CLR4_4_12es2eslb90p6ry.R.inc(3195);return partialDerivative(1, x, y);
    }finally{__CLR4_4_12es2eslb90p6ry.R.flushNeeded();}}
    /**
     * @param x x-coordinate.
     * @param y y-coordinate.
     * @return the value at point (x, y) of the second partial derivative with
     * respect to x.
     * @throws OutOfRangeException if {@code x} (resp. {@code y}) is outside
     * the range defined by the boundary values of {@code xval} (resp.
     * {@code yval}).
     */
    public double partialDerivativeXX(double x, double y)
        throws OutOfRangeException {try{__CLR4_4_12es2eslb90p6ry.R.inc(3196);
        __CLR4_4_12es2eslb90p6ry.R.inc(3197);return partialDerivative(2, x, y);
    }finally{__CLR4_4_12es2eslb90p6ry.R.flushNeeded();}}
    /**
     * @param x x-coordinate.
     * @param y y-coordinate.
     * @return the value at point (x, y) of the second partial derivative with
     * respect to y.
     * @throws OutOfRangeException if {@code x} (resp. {@code y}) is outside
     * the range defined by the boundary values of {@code xval} (resp.
     * {@code yval}).
     */
    public double partialDerivativeYY(double x, double y)
        throws OutOfRangeException {try{__CLR4_4_12es2eslb90p6ry.R.inc(3198);
        __CLR4_4_12es2eslb90p6ry.R.inc(3199);return partialDerivative(3, x, y);
    }finally{__CLR4_4_12es2eslb90p6ry.R.flushNeeded();}}
    /**
     * @param x x-coordinate.
     * @param y y-coordinate.
     * @return the value at point (x, y) of the second partial cross-derivative.
     * @throws OutOfRangeException if {@code x} (resp. {@code y}) is outside
     * the range defined by the boundary values of {@code xval} (resp.
     * {@code yval}).
     */
    public double partialDerivativeXY(double x, double y)
        throws OutOfRangeException {try{__CLR4_4_12es2eslb90p6ry.R.inc(3200);
        __CLR4_4_12es2eslb90p6ry.R.inc(3201);return partialDerivative(4, x, y);
    }finally{__CLR4_4_12es2eslb90p6ry.R.flushNeeded();}}

    /**
     * @param which First index in {@link #partialDerivatives}.
     * @param x x-coordinate.
     * @param y y-coordinate.
     * @return the value at point (x, y) of the selected partial derivative.
     * @throws OutOfRangeException if {@code x} (resp. {@code y}) is outside
     * the range defined by the boundary values of {@code xval} (resp.
     * {@code yval}).
     */
    private double partialDerivative(int which, double x, double y)
        throws OutOfRangeException {try{__CLR4_4_12es2eslb90p6ry.R.inc(3202);
        __CLR4_4_12es2eslb90p6ry.R.inc(3203);if ((((partialDerivatives == null)&&(__CLR4_4_12es2eslb90p6ry.R.iget(3204)!=0|true))||(__CLR4_4_12es2eslb90p6ry.R.iget(3205)==0&false))) {{
            __CLR4_4_12es2eslb90p6ry.R.inc(3206);computePartialDerivatives();
        }

        }__CLR4_4_12es2eslb90p6ry.R.inc(3207);final int i = searchIndex(x, xval);
        __CLR4_4_12es2eslb90p6ry.R.inc(3208);final int j = searchIndex(y, yval);

        __CLR4_4_12es2eslb90p6ry.R.inc(3209);final double xN = (x - xval[i]) / (xval[i + 1] - xval[i]);
        __CLR4_4_12es2eslb90p6ry.R.inc(3210);final double yN = (y - yval[j]) / (yval[j + 1] - yval[j]);

        __CLR4_4_12es2eslb90p6ry.R.inc(3211);return partialDerivatives[which][i][j].value(xN, yN);
    }finally{__CLR4_4_12es2eslb90p6ry.R.flushNeeded();}}

    /**
     * Compute all partial derivatives.
     */
    private void computePartialDerivatives() {try{__CLR4_4_12es2eslb90p6ry.R.inc(3212);
        __CLR4_4_12es2eslb90p6ry.R.inc(3213);final int lastI = xval.length - 1;
        __CLR4_4_12es2eslb90p6ry.R.inc(3214);final int lastJ = yval.length - 1;
        __CLR4_4_12es2eslb90p6ry.R.inc(3215);partialDerivatives = new BivariateFunction[5][lastI][lastJ];

        __CLR4_4_12es2eslb90p6ry.R.inc(3216);for (int i = 0; (((i < lastI)&&(__CLR4_4_12es2eslb90p6ry.R.iget(3217)!=0|true))||(__CLR4_4_12es2eslb90p6ry.R.iget(3218)==0&false)); i++) {{
            __CLR4_4_12es2eslb90p6ry.R.inc(3219);for (int j = 0; (((j < lastJ)&&(__CLR4_4_12es2eslb90p6ry.R.iget(3220)!=0|true))||(__CLR4_4_12es2eslb90p6ry.R.iget(3221)==0&false)); j++) {{
                __CLR4_4_12es2eslb90p6ry.R.inc(3222);final BicubicSplineFunction f = splines[i][j];
                __CLR4_4_12es2eslb90p6ry.R.inc(3223);partialDerivatives[0][i][j] = f.partialDerivativeX();
                __CLR4_4_12es2eslb90p6ry.R.inc(3224);partialDerivatives[1][i][j] = f.partialDerivativeY();
                __CLR4_4_12es2eslb90p6ry.R.inc(3225);partialDerivatives[2][i][j] = f.partialDerivativeXX();
                __CLR4_4_12es2eslb90p6ry.R.inc(3226);partialDerivatives[3][i][j] = f.partialDerivativeYY();
                __CLR4_4_12es2eslb90p6ry.R.inc(3227);partialDerivatives[4][i][j] = f.partialDerivativeXY();
            }
        }}
    }}finally{__CLR4_4_12es2eslb90p6ry.R.flushNeeded();}}

    /**
     * @param c Coordinate.
     * @param val Coordinate samples.
     * @return the index in {@code val} corresponding to the interval
     * containing {@code c}.
     * @throws OutOfRangeException if {@code c} is out of the
     * range defined by the boundary values of {@code val}.
     */
    private int searchIndex(double c, double[] val) {try{__CLR4_4_12es2eslb90p6ry.R.inc(3228);
        __CLR4_4_12es2eslb90p6ry.R.inc(3229);final int r = Arrays.binarySearch(val, c);

        __CLR4_4_12es2eslb90p6ry.R.inc(3230);if ((((r == -1 ||
            r == -val.length - 1)&&(__CLR4_4_12es2eslb90p6ry.R.iget(3231)!=0|true))||(__CLR4_4_12es2eslb90p6ry.R.iget(3232)==0&false))) {{
            __CLR4_4_12es2eslb90p6ry.R.inc(3233);throw new OutOfRangeException(c, val[0], val[val.length - 1]);
        }

        }__CLR4_4_12es2eslb90p6ry.R.inc(3234);if ((((r < 0)&&(__CLR4_4_12es2eslb90p6ry.R.iget(3235)!=0|true))||(__CLR4_4_12es2eslb90p6ry.R.iget(3236)==0&false))) {{
            // "c" in within an interpolation sub-interval: Return the
            // index of the sample at the lower end of the sub-interval.
            __CLR4_4_12es2eslb90p6ry.R.inc(3237);return -r - 2;
        }
        }__CLR4_4_12es2eslb90p6ry.R.inc(3238);final int last = val.length - 1;
        __CLR4_4_12es2eslb90p6ry.R.inc(3239);if ((((r == last)&&(__CLR4_4_12es2eslb90p6ry.R.iget(3240)!=0|true))||(__CLR4_4_12es2eslb90p6ry.R.iget(3241)==0&false))) {{
            // "c" is the last sample of the range: Return the index
            // of the sample at the lower end of the last sub-interval.
            __CLR4_4_12es2eslb90p6ry.R.inc(3242);return last - 1;
        }

        // "c" is another sample point.
        }__CLR4_4_12es2eslb90p6ry.R.inc(3243);return r;
    }finally{__CLR4_4_12es2eslb90p6ry.R.flushNeeded();}}

    /**
     * Compute the spline coefficients from the list of function values and
     * function partial derivatives values at the four corners of a grid
     * element. They must be specified in the following order:
     * <ul>
     *  <li>f(0,0)</li>
     *  <li>f(1,0)</li>
     *  <li>f(0,1)</li>
     *  <li>f(1,1)</li>
     *  <li>f<sub>x</sub>(0,0)</li>
     *  <li>f<sub>x</sub>(1,0)</li>
     *  <li>f<sub>x</sub>(0,1)</li>
     *  <li>f<sub>x</sub>(1,1)</li>
     *  <li>f<sub>y</sub>(0,0)</li>
     *  <li>f<sub>y</sub>(1,0)</li>
     *  <li>f<sub>y</sub>(0,1)</li>
     *  <li>f<sub>y</sub>(1,1)</li>
     *  <li>f<sub>xy</sub>(0,0)</li>
     *  <li>f<sub>xy</sub>(1,0)</li>
     *  <li>f<sub>xy</sub>(0,1)</li>
     *  <li>f<sub>xy</sub>(1,1)</li>
     * </ul>
     * where the subscripts indicate the partial derivative with respect to
     * the corresponding variable(s).
     *
     * @param beta List of function values and function partial derivatives
     * values.
     * @return the spline coefficients.
     */
    private double[] computeSplineCoefficients(double[] beta) {try{__CLR4_4_12es2eslb90p6ry.R.inc(3244);
        __CLR4_4_12es2eslb90p6ry.R.inc(3245);final double[] a = new double[NUM_COEFF];

        __CLR4_4_12es2eslb90p6ry.R.inc(3246);for (int i = 0; (((i < NUM_COEFF)&&(__CLR4_4_12es2eslb90p6ry.R.iget(3247)!=0|true))||(__CLR4_4_12es2eslb90p6ry.R.iget(3248)==0&false)); i++) {{
            __CLR4_4_12es2eslb90p6ry.R.inc(3249);double result = 0;
            __CLR4_4_12es2eslb90p6ry.R.inc(3250);final double[] row = AINV[i];
            __CLR4_4_12es2eslb90p6ry.R.inc(3251);for (int j = 0; (((j < NUM_COEFF)&&(__CLR4_4_12es2eslb90p6ry.R.iget(3252)!=0|true))||(__CLR4_4_12es2eslb90p6ry.R.iget(3253)==0&false)); j++) {{
                __CLR4_4_12es2eslb90p6ry.R.inc(3254);result += row[j] * beta[j];
            }
            }__CLR4_4_12es2eslb90p6ry.R.inc(3255);a[i] = result;
        }

        }__CLR4_4_12es2eslb90p6ry.R.inc(3256);return a;
    }finally{__CLR4_4_12es2eslb90p6ry.R.flushNeeded();}}
}

/**
 * 2D-spline function.
 *
 * @version $Id$
 */
class BicubicSplineFunction
    implements BivariateFunction {public static class __CLR4_4_12es2ihlb90p6rz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,3377,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Number of points. */
    private static final short N = 4;

    /** Coefficients */
    private final double[][] a;

    /** First partial derivative along x. */
    private BivariateFunction partialDerivativeX;

    /** First partial derivative along y. */
    private BivariateFunction partialDerivativeY;

    /** Second partial derivative along x. */
    private BivariateFunction partialDerivativeXX;

    /** Second partial derivative along y. */
    private BivariateFunction partialDerivativeYY;

    /** Second crossed partial derivative. */
    private BivariateFunction partialDerivativeXY;

    /**
     * Simple constructor.
     * @param a Spline coefficients
     */
    public BicubicSplineFunction(double[] a) {try{__CLR4_4_12es2ihlb90p6rz.R.inc(3257);
        __CLR4_4_12es2ihlb90p6rz.R.inc(3258);this.a = new double[N][N];
        __CLR4_4_12es2ihlb90p6rz.R.inc(3259);for (int i = 0; (((i < N)&&(__CLR4_4_12es2ihlb90p6rz.R.iget(3260)!=0|true))||(__CLR4_4_12es2ihlb90p6rz.R.iget(3261)==0&false)); i++) {{
            __CLR4_4_12es2ihlb90p6rz.R.inc(3262);for (int j = 0; (((j < N)&&(__CLR4_4_12es2ihlb90p6rz.R.iget(3263)!=0|true))||(__CLR4_4_12es2ihlb90p6rz.R.iget(3264)==0&false)); j++) {{
                __CLR4_4_12es2ihlb90p6rz.R.inc(3265);this.a[i][j] = a[i * N + j];
            }
        }}
    }}finally{__CLR4_4_12es2ihlb90p6rz.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public double value(double x, double y) {try{__CLR4_4_12es2ihlb90p6rz.R.inc(3266);
        __CLR4_4_12es2ihlb90p6rz.R.inc(3267);if ((((x < 0 || x > 1)&&(__CLR4_4_12es2ihlb90p6rz.R.iget(3268)!=0|true))||(__CLR4_4_12es2ihlb90p6rz.R.iget(3269)==0&false))) {{
            __CLR4_4_12es2ihlb90p6rz.R.inc(3270);throw new OutOfRangeException(x, 0, 1);
        }
        }__CLR4_4_12es2ihlb90p6rz.R.inc(3271);if ((((y < 0 || y > 1)&&(__CLR4_4_12es2ihlb90p6rz.R.iget(3272)!=0|true))||(__CLR4_4_12es2ihlb90p6rz.R.iget(3273)==0&false))) {{
            __CLR4_4_12es2ihlb90p6rz.R.inc(3274);throw new OutOfRangeException(y, 0, 1);
        }

        }__CLR4_4_12es2ihlb90p6rz.R.inc(3275);final double x2 = x * x;
        __CLR4_4_12es2ihlb90p6rz.R.inc(3276);final double x3 = x2 * x;
        __CLR4_4_12es2ihlb90p6rz.R.inc(3277);final double[] pX = {1, x, x2, x3};

        __CLR4_4_12es2ihlb90p6rz.R.inc(3278);final double y2 = y * y;
        __CLR4_4_12es2ihlb90p6rz.R.inc(3279);final double y3 = y2 * y;
        __CLR4_4_12es2ihlb90p6rz.R.inc(3280);final double[] pY = {1, y, y2, y3};

        __CLR4_4_12es2ihlb90p6rz.R.inc(3281);return apply(pX, pY, a);
    }finally{__CLR4_4_12es2ihlb90p6rz.R.flushNeeded();}}

    /**
     * Compute the value of the bicubic polynomial.
     *
     * @param pX Powers of the x-coordinate.
     * @param pY Powers of the y-coordinate.
     * @param coeff Spline coefficients.
     * @return the interpolated value.
     */
    private double apply(double[] pX, double[] pY, double[][] coeff) {try{__CLR4_4_12es2ihlb90p6rz.R.inc(3282);
        __CLR4_4_12es2ihlb90p6rz.R.inc(3283);double result = 0;
        __CLR4_4_12es2ihlb90p6rz.R.inc(3284);for (int i = 0; (((i < N)&&(__CLR4_4_12es2ihlb90p6rz.R.iget(3285)!=0|true))||(__CLR4_4_12es2ihlb90p6rz.R.iget(3286)==0&false)); i++) {{
            __CLR4_4_12es2ihlb90p6rz.R.inc(3287);for (int j = 0; (((j < N)&&(__CLR4_4_12es2ihlb90p6rz.R.iget(3288)!=0|true))||(__CLR4_4_12es2ihlb90p6rz.R.iget(3289)==0&false)); j++) {{
                __CLR4_4_12es2ihlb90p6rz.R.inc(3290);result += coeff[i][j] * pX[i] * pY[j];
            }
        }}

        }__CLR4_4_12es2ihlb90p6rz.R.inc(3291);return result;
    }finally{__CLR4_4_12es2ihlb90p6rz.R.flushNeeded();}}

    /**
     * @return the partial derivative wrt {@code x}.
     */
    public BivariateFunction partialDerivativeX() {try{__CLR4_4_12es2ihlb90p6rz.R.inc(3292);
        __CLR4_4_12es2ihlb90p6rz.R.inc(3293);if ((((partialDerivativeX == null)&&(__CLR4_4_12es2ihlb90p6rz.R.iget(3294)!=0|true))||(__CLR4_4_12es2ihlb90p6rz.R.iget(3295)==0&false))) {{
            __CLR4_4_12es2ihlb90p6rz.R.inc(3296);computePartialDerivatives();
        }

        }__CLR4_4_12es2ihlb90p6rz.R.inc(3297);return partialDerivativeX;
    }finally{__CLR4_4_12es2ihlb90p6rz.R.flushNeeded();}}
    /**
     * @return the partial derivative wrt {@code y}.
     */
    public BivariateFunction partialDerivativeY() {try{__CLR4_4_12es2ihlb90p6rz.R.inc(3298);
        __CLR4_4_12es2ihlb90p6rz.R.inc(3299);if ((((partialDerivativeY == null)&&(__CLR4_4_12es2ihlb90p6rz.R.iget(3300)!=0|true))||(__CLR4_4_12es2ihlb90p6rz.R.iget(3301)==0&false))) {{
            __CLR4_4_12es2ihlb90p6rz.R.inc(3302);computePartialDerivatives();
        }

        }__CLR4_4_12es2ihlb90p6rz.R.inc(3303);return partialDerivativeY;
    }finally{__CLR4_4_12es2ihlb90p6rz.R.flushNeeded();}}
    /**
     * @return the second partial derivative wrt {@code x}.
     */
    public BivariateFunction partialDerivativeXX() {try{__CLR4_4_12es2ihlb90p6rz.R.inc(3304);
        __CLR4_4_12es2ihlb90p6rz.R.inc(3305);if ((((partialDerivativeXX == null)&&(__CLR4_4_12es2ihlb90p6rz.R.iget(3306)!=0|true))||(__CLR4_4_12es2ihlb90p6rz.R.iget(3307)==0&false))) {{
            __CLR4_4_12es2ihlb90p6rz.R.inc(3308);computePartialDerivatives();
        }

        }__CLR4_4_12es2ihlb90p6rz.R.inc(3309);return partialDerivativeXX;
    }finally{__CLR4_4_12es2ihlb90p6rz.R.flushNeeded();}}
    /**
     * @return the second partial derivative wrt {@code y}.
     */
    public BivariateFunction partialDerivativeYY() {try{__CLR4_4_12es2ihlb90p6rz.R.inc(3310);
        __CLR4_4_12es2ihlb90p6rz.R.inc(3311);if ((((partialDerivativeYY == null)&&(__CLR4_4_12es2ihlb90p6rz.R.iget(3312)!=0|true))||(__CLR4_4_12es2ihlb90p6rz.R.iget(3313)==0&false))) {{
            __CLR4_4_12es2ihlb90p6rz.R.inc(3314);computePartialDerivatives();
        }

        }__CLR4_4_12es2ihlb90p6rz.R.inc(3315);return partialDerivativeYY;
    }finally{__CLR4_4_12es2ihlb90p6rz.R.flushNeeded();}}
    /**
     * @return the second partial cross-derivative.
     */
    public BivariateFunction partialDerivativeXY() {try{__CLR4_4_12es2ihlb90p6rz.R.inc(3316);
        __CLR4_4_12es2ihlb90p6rz.R.inc(3317);if ((((partialDerivativeXY == null)&&(__CLR4_4_12es2ihlb90p6rz.R.iget(3318)!=0|true))||(__CLR4_4_12es2ihlb90p6rz.R.iget(3319)==0&false))) {{
            __CLR4_4_12es2ihlb90p6rz.R.inc(3320);computePartialDerivatives();
        }

        }__CLR4_4_12es2ihlb90p6rz.R.inc(3321);return partialDerivativeXY;
    }finally{__CLR4_4_12es2ihlb90p6rz.R.flushNeeded();}}

    /**
     * Compute all partial derivatives functions.
     */
    private void computePartialDerivatives() {try{__CLR4_4_12es2ihlb90p6rz.R.inc(3322);
        __CLR4_4_12es2ihlb90p6rz.R.inc(3323);final double[][] aX = new double[N][N];
        __CLR4_4_12es2ihlb90p6rz.R.inc(3324);final double[][] aY = new double[N][N];
        __CLR4_4_12es2ihlb90p6rz.R.inc(3325);final double[][] aXX = new double[N][N];
        __CLR4_4_12es2ihlb90p6rz.R.inc(3326);final double[][] aYY = new double[N][N];
        __CLR4_4_12es2ihlb90p6rz.R.inc(3327);final double[][] aXY = new double[N][N];

        __CLR4_4_12es2ihlb90p6rz.R.inc(3328);for (int i = 0; (((i < N)&&(__CLR4_4_12es2ihlb90p6rz.R.iget(3329)!=0|true))||(__CLR4_4_12es2ihlb90p6rz.R.iget(3330)==0&false)); i++) {{
            __CLR4_4_12es2ihlb90p6rz.R.inc(3331);for (int j = 0; (((j < N)&&(__CLR4_4_12es2ihlb90p6rz.R.iget(3332)!=0|true))||(__CLR4_4_12es2ihlb90p6rz.R.iget(3333)==0&false)); j++) {{
                __CLR4_4_12es2ihlb90p6rz.R.inc(3334);final double c = a[i][j];
                __CLR4_4_12es2ihlb90p6rz.R.inc(3335);aX[i][j] = i * c;
                __CLR4_4_12es2ihlb90p6rz.R.inc(3336);aY[i][j] = j * c;
                __CLR4_4_12es2ihlb90p6rz.R.inc(3337);aXX[i][j] = (i - 1) * aX[i][j];
                __CLR4_4_12es2ihlb90p6rz.R.inc(3338);aYY[i][j] = (j - 1) * aY[i][j];
                __CLR4_4_12es2ihlb90p6rz.R.inc(3339);aXY[i][j] = j * aX[i][j];
            }
        }}

        }__CLR4_4_12es2ihlb90p6rz.R.inc(3340);partialDerivativeX = new BivariateFunction() {
                public double value(double x, double y)  {try{__CLR4_4_12es2ihlb90p6rz.R.inc(3341);
                    __CLR4_4_12es2ihlb90p6rz.R.inc(3342);final double x2 = x * x;
                    __CLR4_4_12es2ihlb90p6rz.R.inc(3343);final double[] pX = {0, 1, x, x2};

                    __CLR4_4_12es2ihlb90p6rz.R.inc(3344);final double y2 = y * y;
                    __CLR4_4_12es2ihlb90p6rz.R.inc(3345);final double y3 = y2 * y;
                    __CLR4_4_12es2ihlb90p6rz.R.inc(3346);final double[] pY = {1, y, y2, y3};

                    __CLR4_4_12es2ihlb90p6rz.R.inc(3347);return apply(pX, pY, aX);
                }finally{__CLR4_4_12es2ihlb90p6rz.R.flushNeeded();}}
            };
        __CLR4_4_12es2ihlb90p6rz.R.inc(3348);partialDerivativeY = new BivariateFunction() {
                public double value(double x, double y)  {try{__CLR4_4_12es2ihlb90p6rz.R.inc(3349);
                    __CLR4_4_12es2ihlb90p6rz.R.inc(3350);final double x2 = x * x;
                    __CLR4_4_12es2ihlb90p6rz.R.inc(3351);final double x3 = x2 * x;
                    __CLR4_4_12es2ihlb90p6rz.R.inc(3352);final double[] pX = {1, x, x2, x3};

                    __CLR4_4_12es2ihlb90p6rz.R.inc(3353);final double y2 = y * y;
                    __CLR4_4_12es2ihlb90p6rz.R.inc(3354);final double[] pY = {0, 1, y, y2};

                    __CLR4_4_12es2ihlb90p6rz.R.inc(3355);return apply(pX, pY, aY);
                }finally{__CLR4_4_12es2ihlb90p6rz.R.flushNeeded();}}
            };
        __CLR4_4_12es2ihlb90p6rz.R.inc(3356);partialDerivativeXX = new BivariateFunction() {
                public double value(double x, double y)  {try{__CLR4_4_12es2ihlb90p6rz.R.inc(3357);
                    __CLR4_4_12es2ihlb90p6rz.R.inc(3358);final double[] pX = {0, 0, 1, x};

                    __CLR4_4_12es2ihlb90p6rz.R.inc(3359);final double y2 = y * y;
                    __CLR4_4_12es2ihlb90p6rz.R.inc(3360);final double y3 = y2 * y;
                    __CLR4_4_12es2ihlb90p6rz.R.inc(3361);final double[] pY = {1, y, y2, y3};

                    __CLR4_4_12es2ihlb90p6rz.R.inc(3362);return apply(pX, pY, aXX);
                }finally{__CLR4_4_12es2ihlb90p6rz.R.flushNeeded();}}
            };
        __CLR4_4_12es2ihlb90p6rz.R.inc(3363);partialDerivativeYY = new BivariateFunction() {
                public double value(double x, double y)  {try{__CLR4_4_12es2ihlb90p6rz.R.inc(3364);
                    __CLR4_4_12es2ihlb90p6rz.R.inc(3365);final double x2 = x * x;
                    __CLR4_4_12es2ihlb90p6rz.R.inc(3366);final double x3 = x2 * x;
                    __CLR4_4_12es2ihlb90p6rz.R.inc(3367);final double[] pX = {1, x, x2, x3};

                    __CLR4_4_12es2ihlb90p6rz.R.inc(3368);final double[] pY = {0, 0, 1, y};

                    __CLR4_4_12es2ihlb90p6rz.R.inc(3369);return apply(pX, pY, aYY);
                }finally{__CLR4_4_12es2ihlb90p6rz.R.flushNeeded();}}
            };
        __CLR4_4_12es2ihlb90p6rz.R.inc(3370);partialDerivativeXY = new BivariateFunction() {
                public double value(double x, double y)  {try{__CLR4_4_12es2ihlb90p6rz.R.inc(3371);
                    __CLR4_4_12es2ihlb90p6rz.R.inc(3372);final double x2 = x * x;
                    __CLR4_4_12es2ihlb90p6rz.R.inc(3373);final double[] pX = {0, 1, x, x2};

                    __CLR4_4_12es2ihlb90p6rz.R.inc(3374);final double y2 = y * y;
                    __CLR4_4_12es2ihlb90p6rz.R.inc(3375);final double[] pY = {0, 1, y, y2};

                    __CLR4_4_12es2ihlb90p6rz.R.inc(3376);return apply(pX, pY, aXY);
                }finally{__CLR4_4_12es2ihlb90p6rz.R.flushNeeded();}}
            };
    }finally{__CLR4_4_12es2ihlb90p6rz.R.flushNeeded();}}
}
