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
import org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.NonMonotonicSequenceException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.util.MathArrays;

/**
 * Generates a bicubic interpolating function.
 *
 * @version $Id$
 * @since 2.2
 */
public class BicubicSplineInterpolator
    implements BivariateGridInterpolator {public static class __CLR4_4_12lt2ltlb90p6sd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,3454,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * {@inheritDoc}
     */
    public BicubicSplineInterpolatingFunction interpolate(final double[] xval,
                                                          final double[] yval,
                                                          final double[][] fval)
        throws NoDataException, DimensionMismatchException,
               NonMonotonicSequenceException, NumberIsTooSmallException {try{__CLR4_4_12lt2ltlb90p6sd.R.inc(3377);
        __CLR4_4_12lt2ltlb90p6sd.R.inc(3378);if ((((xval.length == 0 || yval.length == 0 || fval.length == 0)&&(__CLR4_4_12lt2ltlb90p6sd.R.iget(3379)!=0|true))||(__CLR4_4_12lt2ltlb90p6sd.R.iget(3380)==0&false))) {{
            __CLR4_4_12lt2ltlb90p6sd.R.inc(3381);throw new NoDataException();
        }
        }__CLR4_4_12lt2ltlb90p6sd.R.inc(3382);if ((((xval.length != fval.length)&&(__CLR4_4_12lt2ltlb90p6sd.R.iget(3383)!=0|true))||(__CLR4_4_12lt2ltlb90p6sd.R.iget(3384)==0&false))) {{
            __CLR4_4_12lt2ltlb90p6sd.R.inc(3385);throw new DimensionMismatchException(xval.length, fval.length);
        }

        }__CLR4_4_12lt2ltlb90p6sd.R.inc(3386);MathArrays.checkOrder(xval);
        __CLR4_4_12lt2ltlb90p6sd.R.inc(3387);MathArrays.checkOrder(yval);

        __CLR4_4_12lt2ltlb90p6sd.R.inc(3388);final int xLen = xval.length;
        __CLR4_4_12lt2ltlb90p6sd.R.inc(3389);final int yLen = yval.length;

        // Samples (first index is y-coordinate, i.e. subarray variable is x)
        // 0 <= i < xval.length
        // 0 <= j < yval.length
        // fX[j][i] = f(xval[i], yval[j])
        __CLR4_4_12lt2ltlb90p6sd.R.inc(3390);final double[][] fX = new double[yLen][xLen];
        __CLR4_4_12lt2ltlb90p6sd.R.inc(3391);for (int i = 0; (((i < xLen)&&(__CLR4_4_12lt2ltlb90p6sd.R.iget(3392)!=0|true))||(__CLR4_4_12lt2ltlb90p6sd.R.iget(3393)==0&false)); i++) {{
            __CLR4_4_12lt2ltlb90p6sd.R.inc(3394);if ((((fval[i].length != yLen)&&(__CLR4_4_12lt2ltlb90p6sd.R.iget(3395)!=0|true))||(__CLR4_4_12lt2ltlb90p6sd.R.iget(3396)==0&false))) {{
                __CLR4_4_12lt2ltlb90p6sd.R.inc(3397);throw new DimensionMismatchException(fval[i].length, yLen);
            }

            }__CLR4_4_12lt2ltlb90p6sd.R.inc(3398);for (int j = 0; (((j < yLen)&&(__CLR4_4_12lt2ltlb90p6sd.R.iget(3399)!=0|true))||(__CLR4_4_12lt2ltlb90p6sd.R.iget(3400)==0&false)); j++) {{
                __CLR4_4_12lt2ltlb90p6sd.R.inc(3401);fX[j][i] = fval[i][j];
            }
        }}

        }__CLR4_4_12lt2ltlb90p6sd.R.inc(3402);final SplineInterpolator spInterpolator = new SplineInterpolator();

        // For each line y[j] (0 <= j < yLen), construct a 1D spline with
        // respect to variable x
        __CLR4_4_12lt2ltlb90p6sd.R.inc(3403);final PolynomialSplineFunction[] ySplineX = new PolynomialSplineFunction[yLen];
        __CLR4_4_12lt2ltlb90p6sd.R.inc(3404);for (int j = 0; (((j < yLen)&&(__CLR4_4_12lt2ltlb90p6sd.R.iget(3405)!=0|true))||(__CLR4_4_12lt2ltlb90p6sd.R.iget(3406)==0&false)); j++) {{
            __CLR4_4_12lt2ltlb90p6sd.R.inc(3407);ySplineX[j] = spInterpolator.interpolate(xval, fX[j]);
        }

        // For each line x[i] (0 <= i < xLen), construct a 1D spline with
        // respect to variable y generated by array fY_1[i]
        }__CLR4_4_12lt2ltlb90p6sd.R.inc(3408);final PolynomialSplineFunction[] xSplineY = new PolynomialSplineFunction[xLen];
        __CLR4_4_12lt2ltlb90p6sd.R.inc(3409);for (int i = 0; (((i < xLen)&&(__CLR4_4_12lt2ltlb90p6sd.R.iget(3410)!=0|true))||(__CLR4_4_12lt2ltlb90p6sd.R.iget(3411)==0&false)); i++) {{
            __CLR4_4_12lt2ltlb90p6sd.R.inc(3412);xSplineY[i] = spInterpolator.interpolate(yval, fval[i]);
        }

        // Partial derivatives with respect to x at the grid knots
        }__CLR4_4_12lt2ltlb90p6sd.R.inc(3413);final double[][] dFdX = new double[xLen][yLen];
        __CLR4_4_12lt2ltlb90p6sd.R.inc(3414);for (int j = 0; (((j < yLen)&&(__CLR4_4_12lt2ltlb90p6sd.R.iget(3415)!=0|true))||(__CLR4_4_12lt2ltlb90p6sd.R.iget(3416)==0&false)); j++) {{
            __CLR4_4_12lt2ltlb90p6sd.R.inc(3417);final UnivariateFunction f = ySplineX[j].derivative();
            __CLR4_4_12lt2ltlb90p6sd.R.inc(3418);for (int i = 0; (((i < xLen)&&(__CLR4_4_12lt2ltlb90p6sd.R.iget(3419)!=0|true))||(__CLR4_4_12lt2ltlb90p6sd.R.iget(3420)==0&false)); i++) {{
                __CLR4_4_12lt2ltlb90p6sd.R.inc(3421);dFdX[i][j] = f.value(xval[i]);
            }
        }}

        // Partial derivatives with respect to y at the grid knots
        }__CLR4_4_12lt2ltlb90p6sd.R.inc(3422);final double[][] dFdY = new double[xLen][yLen];
        __CLR4_4_12lt2ltlb90p6sd.R.inc(3423);for (int i = 0; (((i < xLen)&&(__CLR4_4_12lt2ltlb90p6sd.R.iget(3424)!=0|true))||(__CLR4_4_12lt2ltlb90p6sd.R.iget(3425)==0&false)); i++) {{
            __CLR4_4_12lt2ltlb90p6sd.R.inc(3426);final UnivariateFunction f = xSplineY[i].derivative();
            __CLR4_4_12lt2ltlb90p6sd.R.inc(3427);for (int j = 0; (((j < yLen)&&(__CLR4_4_12lt2ltlb90p6sd.R.iget(3428)!=0|true))||(__CLR4_4_12lt2ltlb90p6sd.R.iget(3429)==0&false)); j++) {{
                __CLR4_4_12lt2ltlb90p6sd.R.inc(3430);dFdY[i][j] = f.value(yval[j]);
            }
        }}

        // Cross partial derivatives
        }__CLR4_4_12lt2ltlb90p6sd.R.inc(3431);final double[][] d2FdXdY = new double[xLen][yLen];
        __CLR4_4_12lt2ltlb90p6sd.R.inc(3432);for (int i = 0; (((i < xLen )&&(__CLR4_4_12lt2ltlb90p6sd.R.iget(3433)!=0|true))||(__CLR4_4_12lt2ltlb90p6sd.R.iget(3434)==0&false)); i++) {{
            __CLR4_4_12lt2ltlb90p6sd.R.inc(3435);final int nI = nextIndex(i, xLen);
            __CLR4_4_12lt2ltlb90p6sd.R.inc(3436);final int pI = previousIndex(i);
            __CLR4_4_12lt2ltlb90p6sd.R.inc(3437);for (int j = 0; (((j < yLen)&&(__CLR4_4_12lt2ltlb90p6sd.R.iget(3438)!=0|true))||(__CLR4_4_12lt2ltlb90p6sd.R.iget(3439)==0&false)); j++) {{
                __CLR4_4_12lt2ltlb90p6sd.R.inc(3440);final int nJ = nextIndex(j, yLen);
                __CLR4_4_12lt2ltlb90p6sd.R.inc(3441);final int pJ = previousIndex(j);
                __CLR4_4_12lt2ltlb90p6sd.R.inc(3442);d2FdXdY[i][j] = (fval[nI][nJ] - fval[nI][pJ] -
                                 fval[pI][nJ] + fval[pI][pJ]) /
                    ((xval[nI] - xval[pI]) * (yval[nJ] - yval[pJ]));
            }
        }}

        // Create the interpolating splines
        }__CLR4_4_12lt2ltlb90p6sd.R.inc(3443);return new BicubicSplineInterpolatingFunction(xval, yval, fval,
                                                      dFdX, dFdY, d2FdXdY);
    }finally{__CLR4_4_12lt2ltlb90p6sd.R.flushNeeded();}}

    /**
     * Computes the next index of an array, clipping if necessary.
     * It is assumed (but not checked) that {@code i >= 0}.
     *
     * @param i Index.
     * @param max Upper limit of the array.
     * @return the next index.
     */
    private int nextIndex(int i, int max) {try{__CLR4_4_12lt2ltlb90p6sd.R.inc(3444);
        __CLR4_4_12lt2ltlb90p6sd.R.inc(3445);final int index = i + 1;
        __CLR4_4_12lt2ltlb90p6sd.R.inc(3446);return (((index < max )&&(__CLR4_4_12lt2ltlb90p6sd.R.iget(3447)!=0|true))||(__CLR4_4_12lt2ltlb90p6sd.R.iget(3448)==0&false))? index : index - 1;
    }finally{__CLR4_4_12lt2ltlb90p6sd.R.flushNeeded();}}
    /**
     * Computes the previous index of an array, clipping if necessary.
     * It is assumed (but not checked) that {@code i} is smaller than the size
     * of the array.
     *
     * @param i Index.
     * @return the previous index.
     */
    private int previousIndex(int i) {try{__CLR4_4_12lt2ltlb90p6sd.R.inc(3449);
        __CLR4_4_12lt2ltlb90p6sd.R.inc(3450);final int index = i - 1;
        __CLR4_4_12lt2ltlb90p6sd.R.inc(3451);return (((index >= 0 )&&(__CLR4_4_12lt2ltlb90p6sd.R.iget(3452)!=0|true))||(__CLR4_4_12lt2ltlb90p6sd.R.iget(3453)==0&false))? index : 0;
    }finally{__CLR4_4_12lt2ltlb90p6sd.R.flushNeeded();}}
}
