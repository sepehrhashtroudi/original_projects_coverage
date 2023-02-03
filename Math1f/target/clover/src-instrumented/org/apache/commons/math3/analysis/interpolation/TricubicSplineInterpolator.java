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
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.util.MathArrays;

/**
 * Generates a tricubic interpolating function.
 *
 * @since 2.2
 * @version $Id$
 */
public class TricubicSplineInterpolator
    implements TrivariateGridInterpolator {public static class __CLR4_4_13bh3bhlb90p6yl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,4430,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * {@inheritDoc}
     */
    public TricubicSplineInterpolatingFunction interpolate(final double[] xval,
                                                           final double[] yval,
                                                           final double[] zval,
                                                           final double[][][] fval)
        throws NoDataException, NumberIsTooSmallException,
               DimensionMismatchException, NonMonotonicSequenceException {try{__CLR4_4_13bh3bhlb90p6yl.R.inc(4301);
        __CLR4_4_13bh3bhlb90p6yl.R.inc(4302);if ((((xval.length == 0 || yval.length == 0 || zval.length == 0 || fval.length == 0)&&(__CLR4_4_13bh3bhlb90p6yl.R.iget(4303)!=0|true))||(__CLR4_4_13bh3bhlb90p6yl.R.iget(4304)==0&false))) {{
            __CLR4_4_13bh3bhlb90p6yl.R.inc(4305);throw new NoDataException();
        }
        }__CLR4_4_13bh3bhlb90p6yl.R.inc(4306);if ((((xval.length != fval.length)&&(__CLR4_4_13bh3bhlb90p6yl.R.iget(4307)!=0|true))||(__CLR4_4_13bh3bhlb90p6yl.R.iget(4308)==0&false))) {{
            __CLR4_4_13bh3bhlb90p6yl.R.inc(4309);throw new DimensionMismatchException(xval.length, fval.length);
        }

        }__CLR4_4_13bh3bhlb90p6yl.R.inc(4310);MathArrays.checkOrder(xval);
        __CLR4_4_13bh3bhlb90p6yl.R.inc(4311);MathArrays.checkOrder(yval);
        __CLR4_4_13bh3bhlb90p6yl.R.inc(4312);MathArrays.checkOrder(zval);

        __CLR4_4_13bh3bhlb90p6yl.R.inc(4313);final int xLen = xval.length;
        __CLR4_4_13bh3bhlb90p6yl.R.inc(4314);final int yLen = yval.length;
        __CLR4_4_13bh3bhlb90p6yl.R.inc(4315);final int zLen = zval.length;

        // Samples, re-ordered as (z, x, y) and (y, z, x) tuplets
        // fvalXY[k][i][j] = f(xval[i], yval[j], zval[k])
        // fvalZX[j][k][i] = f(xval[i], yval[j], zval[k])
        __CLR4_4_13bh3bhlb90p6yl.R.inc(4316);final double[][][] fvalXY = new double[zLen][xLen][yLen];
        __CLR4_4_13bh3bhlb90p6yl.R.inc(4317);final double[][][] fvalZX = new double[yLen][zLen][xLen];
        __CLR4_4_13bh3bhlb90p6yl.R.inc(4318);for (int i = 0; (((i < xLen)&&(__CLR4_4_13bh3bhlb90p6yl.R.iget(4319)!=0|true))||(__CLR4_4_13bh3bhlb90p6yl.R.iget(4320)==0&false)); i++) {{
            __CLR4_4_13bh3bhlb90p6yl.R.inc(4321);if ((((fval[i].length != yLen)&&(__CLR4_4_13bh3bhlb90p6yl.R.iget(4322)!=0|true))||(__CLR4_4_13bh3bhlb90p6yl.R.iget(4323)==0&false))) {{
                __CLR4_4_13bh3bhlb90p6yl.R.inc(4324);throw new DimensionMismatchException(fval[i].length, yLen);
            }

            }__CLR4_4_13bh3bhlb90p6yl.R.inc(4325);for (int j = 0; (((j < yLen)&&(__CLR4_4_13bh3bhlb90p6yl.R.iget(4326)!=0|true))||(__CLR4_4_13bh3bhlb90p6yl.R.iget(4327)==0&false)); j++) {{
                __CLR4_4_13bh3bhlb90p6yl.R.inc(4328);if ((((fval[i][j].length != zLen)&&(__CLR4_4_13bh3bhlb90p6yl.R.iget(4329)!=0|true))||(__CLR4_4_13bh3bhlb90p6yl.R.iget(4330)==0&false))) {{
                    __CLR4_4_13bh3bhlb90p6yl.R.inc(4331);throw new DimensionMismatchException(fval[i][j].length, zLen);
                }

                }__CLR4_4_13bh3bhlb90p6yl.R.inc(4332);for (int k = 0; (((k < zLen)&&(__CLR4_4_13bh3bhlb90p6yl.R.iget(4333)!=0|true))||(__CLR4_4_13bh3bhlb90p6yl.R.iget(4334)==0&false)); k++) {{
                    __CLR4_4_13bh3bhlb90p6yl.R.inc(4335);final double v = fval[i][j][k];
                    __CLR4_4_13bh3bhlb90p6yl.R.inc(4336);fvalXY[k][i][j] = v;
                    __CLR4_4_13bh3bhlb90p6yl.R.inc(4337);fvalZX[j][k][i] = v;
                }
            }}
        }}

        }__CLR4_4_13bh3bhlb90p6yl.R.inc(4338);final BicubicSplineInterpolator bsi = new BicubicSplineInterpolator();

        // For each line x[i] (0 <= i < xLen), construct a 2D spline in y and z
        __CLR4_4_13bh3bhlb90p6yl.R.inc(4339);final BicubicSplineInterpolatingFunction[] xSplineYZ
            = new BicubicSplineInterpolatingFunction[xLen];
        __CLR4_4_13bh3bhlb90p6yl.R.inc(4340);for (int i = 0; (((i < xLen)&&(__CLR4_4_13bh3bhlb90p6yl.R.iget(4341)!=0|true))||(__CLR4_4_13bh3bhlb90p6yl.R.iget(4342)==0&false)); i++) {{
            __CLR4_4_13bh3bhlb90p6yl.R.inc(4343);xSplineYZ[i] = bsi.interpolate(yval, zval, fval[i]);
        }

        // For each line y[j] (0 <= j < yLen), construct a 2D spline in z and x
        }__CLR4_4_13bh3bhlb90p6yl.R.inc(4344);final BicubicSplineInterpolatingFunction[] ySplineZX
            = new BicubicSplineInterpolatingFunction[yLen];
        __CLR4_4_13bh3bhlb90p6yl.R.inc(4345);for (int j = 0; (((j < yLen)&&(__CLR4_4_13bh3bhlb90p6yl.R.iget(4346)!=0|true))||(__CLR4_4_13bh3bhlb90p6yl.R.iget(4347)==0&false)); j++) {{
            __CLR4_4_13bh3bhlb90p6yl.R.inc(4348);ySplineZX[j] = bsi.interpolate(zval, xval, fvalZX[j]);
        }

        // For each line z[k] (0 <= k < zLen), construct a 2D spline in x and y
        }__CLR4_4_13bh3bhlb90p6yl.R.inc(4349);final BicubicSplineInterpolatingFunction[] zSplineXY
            = new BicubicSplineInterpolatingFunction[zLen];
        __CLR4_4_13bh3bhlb90p6yl.R.inc(4350);for (int k = 0; (((k < zLen)&&(__CLR4_4_13bh3bhlb90p6yl.R.iget(4351)!=0|true))||(__CLR4_4_13bh3bhlb90p6yl.R.iget(4352)==0&false)); k++) {{
            __CLR4_4_13bh3bhlb90p6yl.R.inc(4353);zSplineXY[k] = bsi.interpolate(xval, yval, fvalXY[k]);
        }

        // Partial derivatives wrt x and wrt y
        }__CLR4_4_13bh3bhlb90p6yl.R.inc(4354);final double[][][] dFdX = new double[xLen][yLen][zLen];
        __CLR4_4_13bh3bhlb90p6yl.R.inc(4355);final double[][][] dFdY = new double[xLen][yLen][zLen];
        __CLR4_4_13bh3bhlb90p6yl.R.inc(4356);final double[][][] d2FdXdY = new double[xLen][yLen][zLen];
        __CLR4_4_13bh3bhlb90p6yl.R.inc(4357);for (int k = 0; (((k < zLen)&&(__CLR4_4_13bh3bhlb90p6yl.R.iget(4358)!=0|true))||(__CLR4_4_13bh3bhlb90p6yl.R.iget(4359)==0&false)); k++) {{
            __CLR4_4_13bh3bhlb90p6yl.R.inc(4360);final BicubicSplineInterpolatingFunction f = zSplineXY[k];
            __CLR4_4_13bh3bhlb90p6yl.R.inc(4361);for (int i = 0; (((i < xLen)&&(__CLR4_4_13bh3bhlb90p6yl.R.iget(4362)!=0|true))||(__CLR4_4_13bh3bhlb90p6yl.R.iget(4363)==0&false)); i++) {{
                __CLR4_4_13bh3bhlb90p6yl.R.inc(4364);final double x = xval[i];
                __CLR4_4_13bh3bhlb90p6yl.R.inc(4365);for (int j = 0; (((j < yLen)&&(__CLR4_4_13bh3bhlb90p6yl.R.iget(4366)!=0|true))||(__CLR4_4_13bh3bhlb90p6yl.R.iget(4367)==0&false)); j++) {{
                    __CLR4_4_13bh3bhlb90p6yl.R.inc(4368);final double y = yval[j];
                    __CLR4_4_13bh3bhlb90p6yl.R.inc(4369);dFdX[i][j][k] = f.partialDerivativeX(x, y);
                    __CLR4_4_13bh3bhlb90p6yl.R.inc(4370);dFdY[i][j][k] = f.partialDerivativeY(x, y);
                    __CLR4_4_13bh3bhlb90p6yl.R.inc(4371);d2FdXdY[i][j][k] = f.partialDerivativeXY(x, y);
                }
            }}
        }}

        // Partial derivatives wrt y and wrt z
        }__CLR4_4_13bh3bhlb90p6yl.R.inc(4372);final double[][][] dFdZ = new double[xLen][yLen][zLen];
        __CLR4_4_13bh3bhlb90p6yl.R.inc(4373);final double[][][] d2FdYdZ = new double[xLen][yLen][zLen];
        __CLR4_4_13bh3bhlb90p6yl.R.inc(4374);for (int i = 0; (((i < xLen)&&(__CLR4_4_13bh3bhlb90p6yl.R.iget(4375)!=0|true))||(__CLR4_4_13bh3bhlb90p6yl.R.iget(4376)==0&false)); i++) {{
            __CLR4_4_13bh3bhlb90p6yl.R.inc(4377);final BicubicSplineInterpolatingFunction f = xSplineYZ[i];
            __CLR4_4_13bh3bhlb90p6yl.R.inc(4378);for (int j = 0; (((j < yLen)&&(__CLR4_4_13bh3bhlb90p6yl.R.iget(4379)!=0|true))||(__CLR4_4_13bh3bhlb90p6yl.R.iget(4380)==0&false)); j++) {{
                __CLR4_4_13bh3bhlb90p6yl.R.inc(4381);final double y = yval[j];
                __CLR4_4_13bh3bhlb90p6yl.R.inc(4382);for (int k = 0; (((k < zLen)&&(__CLR4_4_13bh3bhlb90p6yl.R.iget(4383)!=0|true))||(__CLR4_4_13bh3bhlb90p6yl.R.iget(4384)==0&false)); k++) {{
                    __CLR4_4_13bh3bhlb90p6yl.R.inc(4385);final double z = zval[k];
                    __CLR4_4_13bh3bhlb90p6yl.R.inc(4386);dFdZ[i][j][k] = f.partialDerivativeY(y, z);
                    __CLR4_4_13bh3bhlb90p6yl.R.inc(4387);d2FdYdZ[i][j][k] = f.partialDerivativeXY(y, z);
                }
            }}
        }}

        // Partial derivatives wrt x and wrt z
        }__CLR4_4_13bh3bhlb90p6yl.R.inc(4388);final double[][][] d2FdZdX = new double[xLen][yLen][zLen];
        __CLR4_4_13bh3bhlb90p6yl.R.inc(4389);for (int j = 0; (((j < yLen)&&(__CLR4_4_13bh3bhlb90p6yl.R.iget(4390)!=0|true))||(__CLR4_4_13bh3bhlb90p6yl.R.iget(4391)==0&false)); j++) {{
            __CLR4_4_13bh3bhlb90p6yl.R.inc(4392);final BicubicSplineInterpolatingFunction f = ySplineZX[j];
            __CLR4_4_13bh3bhlb90p6yl.R.inc(4393);for (int k = 0; (((k < zLen)&&(__CLR4_4_13bh3bhlb90p6yl.R.iget(4394)!=0|true))||(__CLR4_4_13bh3bhlb90p6yl.R.iget(4395)==0&false)); k++) {{
                __CLR4_4_13bh3bhlb90p6yl.R.inc(4396);final double z = zval[k];
                __CLR4_4_13bh3bhlb90p6yl.R.inc(4397);for (int i = 0; (((i < xLen)&&(__CLR4_4_13bh3bhlb90p6yl.R.iget(4398)!=0|true))||(__CLR4_4_13bh3bhlb90p6yl.R.iget(4399)==0&false)); i++) {{
                    __CLR4_4_13bh3bhlb90p6yl.R.inc(4400);final double x = xval[i];
                    __CLR4_4_13bh3bhlb90p6yl.R.inc(4401);d2FdZdX[i][j][k] = f.partialDerivativeXY(z, x);
                }
            }}
        }}

        // Third partial cross-derivatives
        }__CLR4_4_13bh3bhlb90p6yl.R.inc(4402);final double[][][] d3FdXdYdZ = new double[xLen][yLen][zLen];
        __CLR4_4_13bh3bhlb90p6yl.R.inc(4403);for (int i = 0; (((i < xLen )&&(__CLR4_4_13bh3bhlb90p6yl.R.iget(4404)!=0|true))||(__CLR4_4_13bh3bhlb90p6yl.R.iget(4405)==0&false)); i++) {{
            __CLR4_4_13bh3bhlb90p6yl.R.inc(4406);final int nI = nextIndex(i, xLen);
            __CLR4_4_13bh3bhlb90p6yl.R.inc(4407);final int pI = previousIndex(i);
            __CLR4_4_13bh3bhlb90p6yl.R.inc(4408);for (int j = 0; (((j < yLen)&&(__CLR4_4_13bh3bhlb90p6yl.R.iget(4409)!=0|true))||(__CLR4_4_13bh3bhlb90p6yl.R.iget(4410)==0&false)); j++) {{
                __CLR4_4_13bh3bhlb90p6yl.R.inc(4411);final int nJ = nextIndex(j, yLen);
                __CLR4_4_13bh3bhlb90p6yl.R.inc(4412);final int pJ = previousIndex(j);
                __CLR4_4_13bh3bhlb90p6yl.R.inc(4413);for (int k = 0; (((k < zLen)&&(__CLR4_4_13bh3bhlb90p6yl.R.iget(4414)!=0|true))||(__CLR4_4_13bh3bhlb90p6yl.R.iget(4415)==0&false)); k++) {{
                    __CLR4_4_13bh3bhlb90p6yl.R.inc(4416);final int nK = nextIndex(k, zLen);
                    __CLR4_4_13bh3bhlb90p6yl.R.inc(4417);final int pK = previousIndex(k);

                    // XXX Not sure about this formula
                    __CLR4_4_13bh3bhlb90p6yl.R.inc(4418);d3FdXdYdZ[i][j][k] = (fval[nI][nJ][nK] - fval[nI][pJ][nK] -
                                          fval[pI][nJ][nK] + fval[pI][pJ][nK] -
                                          fval[nI][nJ][pK] + fval[nI][pJ][pK] +
                                          fval[pI][nJ][pK] - fval[pI][pJ][pK]) /
                        ((xval[nI] - xval[pI]) * (yval[nJ] - yval[pJ]) * (zval[nK] - zval[pK])) ;
                }
            }}
        }}

        // Create the interpolating splines
        }__CLR4_4_13bh3bhlb90p6yl.R.inc(4419);return new TricubicSplineInterpolatingFunction(xval, yval, zval, fval,
                                                       dFdX, dFdY, dFdZ,
                                                       d2FdXdY, d2FdZdX, d2FdYdZ,
                                                       d3FdXdYdZ);
    }finally{__CLR4_4_13bh3bhlb90p6yl.R.flushNeeded();}}

    /**
     * Compute the next index of an array, clipping if necessary.
     * It is assumed (but not checked) that {@code i} is larger than or equal to 0}.
     *
     * @param i Index
     * @param max Upper limit of the array
     * @return the next index
     */
    private int nextIndex(int i, int max) {try{__CLR4_4_13bh3bhlb90p6yl.R.inc(4420);
        __CLR4_4_13bh3bhlb90p6yl.R.inc(4421);final int index = i + 1;
        __CLR4_4_13bh3bhlb90p6yl.R.inc(4422);return (((index < max )&&(__CLR4_4_13bh3bhlb90p6yl.R.iget(4423)!=0|true))||(__CLR4_4_13bh3bhlb90p6yl.R.iget(4424)==0&false))? index : index - 1;
    }finally{__CLR4_4_13bh3bhlb90p6yl.R.flushNeeded();}}
    /**
     * Compute the previous index of an array, clipping if necessary.
     * It is assumed (but not checked) that {@code i} is smaller than the size of the array.
     *
     * @param i Index
     * @return the previous index
     */
    private int previousIndex(int i) {try{__CLR4_4_13bh3bhlb90p6yl.R.inc(4425);
        __CLR4_4_13bh3bhlb90p6yl.R.inc(4426);final int index = i - 1;
        __CLR4_4_13bh3bhlb90p6yl.R.inc(4427);return (((index >= 0 )&&(__CLR4_4_13bh3bhlb90p6yl.R.iget(4428)!=0|true))||(__CLR4_4_13bh3bhlb90p6yl.R.iget(4429)==0&false))? index : 0;
    }finally{__CLR4_4_13bh3bhlb90p6yl.R.flushNeeded();}}
}
