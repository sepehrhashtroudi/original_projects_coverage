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
package org.apache.commons.math3.fitting.leastsquares;

import java.util.ArrayList;
import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import org.apache.commons.math3.analysis.MultivariateMatrixFunction;
import org.apache.commons.math3.util.MathUtils;
import org.apache.commons.math3.util.FastMath;

/**
 * Class that models a circle.
 * The parameters of problem are:
 * <ul>
 *  <li>the x-coordinate of the circle center,</li>
 *  <li>the y-coordinate of the circle center,</li>
 *  <li>the radius of the circle.</li>
 * </ul>
 * The model functions are:
 * <ul>
 *  <li>for each triplet (cx, cy, r), the (x, y) coordinates of a point on the
 *   corresponding circle.</li>
 * </ul>
 */
class CircleProblem {public static class __CLR4_4_11loq1loqlb90pcjl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,74845,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Cloud of points assumed to be fitted by a circle. */
    private final ArrayList<double[]> points;
    /** Error on the x-coordinate of the points. */
    private final double xSigma;
    /** Error on the y-coordinate of the points. */
    private final double ySigma;
    /** Number of points on the circumference (when searching which
        model point is closest to a given "observation". */
    private final int resolution;

    /**
     * @param xError Assumed error for the x-coordinate of the circle points.
     * @param yError Assumed error for the y-coordinate of the circle points.
     * @param searchResolution Number of points to try when searching the one
     * that is closest to a given "observed" point.
     */
    public CircleProblem(double xError,
                         double yError,
                         int searchResolution) {try{__CLR4_4_11loq1loqlb90pcjl.R.inc(74762);
        __CLR4_4_11loq1loqlb90pcjl.R.inc(74763);points = new ArrayList<double[]>();
        __CLR4_4_11loq1loqlb90pcjl.R.inc(74764);xSigma = xError;
        __CLR4_4_11loq1loqlb90pcjl.R.inc(74765);ySigma = yError;
        __CLR4_4_11loq1loqlb90pcjl.R.inc(74766);resolution = searchResolution;
    }finally{__CLR4_4_11loq1loqlb90pcjl.R.flushNeeded();}}

    /**
     * @param xError Assumed error for the x-coordinate of the circle points.
     * @param yError Assumed error for the y-coordinate of the circle points.
     */
    public CircleProblem(double xError,
                         double yError) {
        this(xError, yError, 500);__CLR4_4_11loq1loqlb90pcjl.R.inc(74768);try{__CLR4_4_11loq1loqlb90pcjl.R.inc(74767);
    }finally{__CLR4_4_11loq1loqlb90pcjl.R.flushNeeded();}}

    public void addPoint(double px, double py) {try{__CLR4_4_11loq1loqlb90pcjl.R.inc(74769);
        __CLR4_4_11loq1loqlb90pcjl.R.inc(74770);points.add(new double[] { px, py });
    }finally{__CLR4_4_11loq1loqlb90pcjl.R.flushNeeded();}}

    public double[] target() {try{__CLR4_4_11loq1loqlb90pcjl.R.inc(74771);
        __CLR4_4_11loq1loqlb90pcjl.R.inc(74772);final double[] t = new double[points.size() * 2];
        __CLR4_4_11loq1loqlb90pcjl.R.inc(74773);for (int i = 0; (((i < points.size())&&(__CLR4_4_11loq1loqlb90pcjl.R.iget(74774)!=0|true))||(__CLR4_4_11loq1loqlb90pcjl.R.iget(74775)==0&false)); i++) {{
            __CLR4_4_11loq1loqlb90pcjl.R.inc(74776);final double[] p = points.get(i);
            __CLR4_4_11loq1loqlb90pcjl.R.inc(74777);final int index = i * 2;
            __CLR4_4_11loq1loqlb90pcjl.R.inc(74778);t[index] = p[0];
            __CLR4_4_11loq1loqlb90pcjl.R.inc(74779);t[index + 1] = p[1];
        }

        }__CLR4_4_11loq1loqlb90pcjl.R.inc(74780);return t;
    }finally{__CLR4_4_11loq1loqlb90pcjl.R.flushNeeded();}}

    public double[] weight() {try{__CLR4_4_11loq1loqlb90pcjl.R.inc(74781);
        __CLR4_4_11loq1loqlb90pcjl.R.inc(74782);final double wX = 1 / (xSigma * xSigma);
        __CLR4_4_11loq1loqlb90pcjl.R.inc(74783);final double wY = 1 / (ySigma * ySigma);
        __CLR4_4_11loq1loqlb90pcjl.R.inc(74784);final double[] w = new double[points.size() * 2];
        __CLR4_4_11loq1loqlb90pcjl.R.inc(74785);for (int i = 0; (((i < points.size())&&(__CLR4_4_11loq1loqlb90pcjl.R.iget(74786)!=0|true))||(__CLR4_4_11loq1loqlb90pcjl.R.iget(74787)==0&false)); i++) {{
            __CLR4_4_11loq1loqlb90pcjl.R.inc(74788);final int index = i * 2;
            __CLR4_4_11loq1loqlb90pcjl.R.inc(74789);w[index] = wX;
            __CLR4_4_11loq1loqlb90pcjl.R.inc(74790);w[index + 1] = wY;
        }

        }__CLR4_4_11loq1loqlb90pcjl.R.inc(74791);return w;
    }finally{__CLR4_4_11loq1loqlb90pcjl.R.flushNeeded();}}

    public MultivariateVectorFunction getModelFunction() {try{__CLR4_4_11loq1loqlb90pcjl.R.inc(74792);
        __CLR4_4_11loq1loqlb90pcjl.R.inc(74793);return new MultivariateVectorFunction() {
            public double[] value(double[] params) {try{__CLR4_4_11loq1loqlb90pcjl.R.inc(74794);
                __CLR4_4_11loq1loqlb90pcjl.R.inc(74795);final double cx = params[0];
                __CLR4_4_11loq1loqlb90pcjl.R.inc(74796);final double cy = params[1];
                __CLR4_4_11loq1loqlb90pcjl.R.inc(74797);final double r = params[2];

                __CLR4_4_11loq1loqlb90pcjl.R.inc(74798);final double[] model = new double[points.size() * 2];

                __CLR4_4_11loq1loqlb90pcjl.R.inc(74799);final double deltaTheta = MathUtils.TWO_PI / resolution;
                __CLR4_4_11loq1loqlb90pcjl.R.inc(74800);for (int i = 0; (((i < points.size())&&(__CLR4_4_11loq1loqlb90pcjl.R.iget(74801)!=0|true))||(__CLR4_4_11loq1loqlb90pcjl.R.iget(74802)==0&false)); i++) {{
                    __CLR4_4_11loq1loqlb90pcjl.R.inc(74803);final double[] p = points.get(i);
                    __CLR4_4_11loq1loqlb90pcjl.R.inc(74804);final double px = p[0];
                    __CLR4_4_11loq1loqlb90pcjl.R.inc(74805);final double py = p[1];

                    __CLR4_4_11loq1loqlb90pcjl.R.inc(74806);double bestX = 0;
                    __CLR4_4_11loq1loqlb90pcjl.R.inc(74807);double bestY = 0;
                    __CLR4_4_11loq1loqlb90pcjl.R.inc(74808);double dMin = Double.POSITIVE_INFINITY;

                    // Find the angle for which the circle passes closest to the
                    // current point (using a resolution of 100 points along the
                    // circumference).
                    __CLR4_4_11loq1loqlb90pcjl.R.inc(74809);for (double theta = 0; (((theta <= MathUtils.TWO_PI)&&(__CLR4_4_11loq1loqlb90pcjl.R.iget(74810)!=0|true))||(__CLR4_4_11loq1loqlb90pcjl.R.iget(74811)==0&false)); theta += deltaTheta) {{
                        __CLR4_4_11loq1loqlb90pcjl.R.inc(74812);final double currentX = cx + r * FastMath.cos(theta);
                        __CLR4_4_11loq1loqlb90pcjl.R.inc(74813);final double currentY = cy + r * FastMath.sin(theta);
                        __CLR4_4_11loq1loqlb90pcjl.R.inc(74814);final double dX = currentX - px;
                        __CLR4_4_11loq1loqlb90pcjl.R.inc(74815);final double dY = currentY - py;
                        __CLR4_4_11loq1loqlb90pcjl.R.inc(74816);final double d = dX * dX + dY * dY;
                        __CLR4_4_11loq1loqlb90pcjl.R.inc(74817);if ((((d < dMin)&&(__CLR4_4_11loq1loqlb90pcjl.R.iget(74818)!=0|true))||(__CLR4_4_11loq1loqlb90pcjl.R.iget(74819)==0&false))) {{
                            __CLR4_4_11loq1loqlb90pcjl.R.inc(74820);dMin = d;
                            __CLR4_4_11loq1loqlb90pcjl.R.inc(74821);bestX = currentX;
                            __CLR4_4_11loq1loqlb90pcjl.R.inc(74822);bestY = currentY;
                        }
                    }}

                    }__CLR4_4_11loq1loqlb90pcjl.R.inc(74823);final int index = i * 2;
                    __CLR4_4_11loq1loqlb90pcjl.R.inc(74824);model[index] = bestX;
                    __CLR4_4_11loq1loqlb90pcjl.R.inc(74825);model[index + 1] = bestY;
                }

                }__CLR4_4_11loq1loqlb90pcjl.R.inc(74826);return model;
            }finally{__CLR4_4_11loq1loqlb90pcjl.R.flushNeeded();}}
        };
    }finally{__CLR4_4_11loq1loqlb90pcjl.R.flushNeeded();}}

    public MultivariateMatrixFunction getModelFunctionJacobian() {try{__CLR4_4_11loq1loqlb90pcjl.R.inc(74827);
        __CLR4_4_11loq1loqlb90pcjl.R.inc(74828);return new MultivariateMatrixFunction() {
            public double[][] value(double[] point) {try{__CLR4_4_11loq1loqlb90pcjl.R.inc(74829);
                __CLR4_4_11loq1loqlb90pcjl.R.inc(74830);return jacobian(point);
            }finally{__CLR4_4_11loq1loqlb90pcjl.R.flushNeeded();}}
        };
    }finally{__CLR4_4_11loq1loqlb90pcjl.R.flushNeeded();}}

    private double[][] jacobian(double[] params) {try{__CLR4_4_11loq1loqlb90pcjl.R.inc(74831);
        __CLR4_4_11loq1loqlb90pcjl.R.inc(74832);final double[][] jacobian = new double[points.size() * 2][3];

        __CLR4_4_11loq1loqlb90pcjl.R.inc(74833);for (int i = 0; (((i < points.size())&&(__CLR4_4_11loq1loqlb90pcjl.R.iget(74834)!=0|true))||(__CLR4_4_11loq1loqlb90pcjl.R.iget(74835)==0&false)); i++) {{
            __CLR4_4_11loq1loqlb90pcjl.R.inc(74836);final int index = i * 2;
            // Partial derivative wrt x-coordinate of center. 
            __CLR4_4_11loq1loqlb90pcjl.R.inc(74837);jacobian[index][0] = 1;
            __CLR4_4_11loq1loqlb90pcjl.R.inc(74838);jacobian[index + 1][0] = 0;
            // Partial derivative wrt y-coordinate of center.
            __CLR4_4_11loq1loqlb90pcjl.R.inc(74839);jacobian[index][1] = 0;
            __CLR4_4_11loq1loqlb90pcjl.R.inc(74840);jacobian[index + 1][1] = 1;
            // Partial derivative wrt radius.
            __CLR4_4_11loq1loqlb90pcjl.R.inc(74841);final double[] p = points.get(i);
            __CLR4_4_11loq1loqlb90pcjl.R.inc(74842);jacobian[index][2] = (p[0] - params[0]) / params[2];
            __CLR4_4_11loq1loqlb90pcjl.R.inc(74843);jacobian[index + 1][2] = (p[1] - params[1]) / params[2];
        }

        }__CLR4_4_11loq1loqlb90pcjl.R.inc(74844);return jacobian;
    }finally{__CLR4_4_11loq1loqlb90pcjl.R.flushNeeded();}}
}
