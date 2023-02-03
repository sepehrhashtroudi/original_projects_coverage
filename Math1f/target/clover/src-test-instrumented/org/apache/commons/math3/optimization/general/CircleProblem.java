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

package org.apache.commons.math3.optimization.general;

import java.util.ArrayList;

import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
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
class CircleProblem implements MultivariateDifferentiableVectorFunction {public static class __CLR4_4_125pe25pelb90pe1y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,100765,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Cloud of points assumed to be fitted by a circle. */
    private final ArrayList<Vector2D> points;
    /** Error on the x-coordinate of the points. */
    private final double xSigma;
    /** Error on the y-coordinate of the points. */
    private final double ySigma;

    /**
     * @param xError Assumed error for the x-coordinate of the circle points.
     * @param yError Assumed error for the y-coordinate of the circle points.
     */
    public CircleProblem(double xError,
                         double yError) {try{__CLR4_4_125pe25pelb90pe1y.R.inc(100706);
        __CLR4_4_125pe25pelb90pe1y.R.inc(100707);points = new ArrayList<Vector2D>();
        __CLR4_4_125pe25pelb90pe1y.R.inc(100708);xSigma = xError;
        __CLR4_4_125pe25pelb90pe1y.R.inc(100709);ySigma = yError;
    }finally{__CLR4_4_125pe25pelb90pe1y.R.flushNeeded();}}

    public void addPoint(Vector2D p) {try{__CLR4_4_125pe25pelb90pe1y.R.inc(100710);
        __CLR4_4_125pe25pelb90pe1y.R.inc(100711);points.add(p);
    }finally{__CLR4_4_125pe25pelb90pe1y.R.flushNeeded();}}

    public double[] target() {try{__CLR4_4_125pe25pelb90pe1y.R.inc(100712);
        __CLR4_4_125pe25pelb90pe1y.R.inc(100713);final double[] t = new double[points.size() * 2];
        __CLR4_4_125pe25pelb90pe1y.R.inc(100714);for (int i = 0; (((i < points.size())&&(__CLR4_4_125pe25pelb90pe1y.R.iget(100715)!=0|true))||(__CLR4_4_125pe25pelb90pe1y.R.iget(100716)==0&false)); i++) {{
            __CLR4_4_125pe25pelb90pe1y.R.inc(100717);final Vector2D p = points.get(i);
            __CLR4_4_125pe25pelb90pe1y.R.inc(100718);final int index = i * 2;
            __CLR4_4_125pe25pelb90pe1y.R.inc(100719);t[index]     = p.getX();
            __CLR4_4_125pe25pelb90pe1y.R.inc(100720);t[index + 1] = p.getY();
        }

        }__CLR4_4_125pe25pelb90pe1y.R.inc(100721);return t;
    }finally{__CLR4_4_125pe25pelb90pe1y.R.flushNeeded();}}

    public double[] weight() {try{__CLR4_4_125pe25pelb90pe1y.R.inc(100722);
        __CLR4_4_125pe25pelb90pe1y.R.inc(100723);final double wX = 1 / (xSigma * xSigma);
        __CLR4_4_125pe25pelb90pe1y.R.inc(100724);final double wY = 1 / (ySigma * ySigma);
        __CLR4_4_125pe25pelb90pe1y.R.inc(100725);final double[] w = new double[points.size() * 2];
        __CLR4_4_125pe25pelb90pe1y.R.inc(100726);for (int i = 0; (((i < points.size())&&(__CLR4_4_125pe25pelb90pe1y.R.iget(100727)!=0|true))||(__CLR4_4_125pe25pelb90pe1y.R.iget(100728)==0&false)); i++) {{
            __CLR4_4_125pe25pelb90pe1y.R.inc(100729);final int index = i * 2;
            __CLR4_4_125pe25pelb90pe1y.R.inc(100730);w[index] = wX;
            __CLR4_4_125pe25pelb90pe1y.R.inc(100731);w[index + 1] = wY;
        }

        }__CLR4_4_125pe25pelb90pe1y.R.inc(100732);return w;
    }finally{__CLR4_4_125pe25pelb90pe1y.R.flushNeeded();}}

    public double[] value(double[] params) {try{__CLR4_4_125pe25pelb90pe1y.R.inc(100733);
        __CLR4_4_125pe25pelb90pe1y.R.inc(100734);final double cx = params[0];
        __CLR4_4_125pe25pelb90pe1y.R.inc(100735);final double cy = params[1];
        __CLR4_4_125pe25pelb90pe1y.R.inc(100736);final double r = params[2];

        __CLR4_4_125pe25pelb90pe1y.R.inc(100737);final double[] model = new double[points.size() * 2];

        __CLR4_4_125pe25pelb90pe1y.R.inc(100738);for (int i = 0; (((i < points.size())&&(__CLR4_4_125pe25pelb90pe1y.R.iget(100739)!=0|true))||(__CLR4_4_125pe25pelb90pe1y.R.iget(100740)==0&false)); i++) {{
            __CLR4_4_125pe25pelb90pe1y.R.inc(100741);final Vector2D p = points.get(i);

            // Find the circle point closest to the observed point
            // (observed points are points add through the addPoint method above)
            __CLR4_4_125pe25pelb90pe1y.R.inc(100742);final double dX = cx - p.getX();
            __CLR4_4_125pe25pelb90pe1y.R.inc(100743);final double dY = cy - p.getY();
            __CLR4_4_125pe25pelb90pe1y.R.inc(100744);final double scaling = r / FastMath.hypot(dX, dY);
            __CLR4_4_125pe25pelb90pe1y.R.inc(100745);final int index  = i * 2;
            __CLR4_4_125pe25pelb90pe1y.R.inc(100746);model[index]     = cx - scaling * dX;
            __CLR4_4_125pe25pelb90pe1y.R.inc(100747);model[index + 1] = cy - scaling * dY;

        }

        }__CLR4_4_125pe25pelb90pe1y.R.inc(100748);return model;
    }finally{__CLR4_4_125pe25pelb90pe1y.R.flushNeeded();}}

    public DerivativeStructure[] value(DerivativeStructure[] params) {try{__CLR4_4_125pe25pelb90pe1y.R.inc(100749);
        __CLR4_4_125pe25pelb90pe1y.R.inc(100750);final DerivativeStructure cx = params[0];
        __CLR4_4_125pe25pelb90pe1y.R.inc(100751);final DerivativeStructure cy = params[1];
        __CLR4_4_125pe25pelb90pe1y.R.inc(100752);final DerivativeStructure r = params[2];

        __CLR4_4_125pe25pelb90pe1y.R.inc(100753);final DerivativeStructure[] model = new DerivativeStructure[points.size() * 2];

        __CLR4_4_125pe25pelb90pe1y.R.inc(100754);for (int i = 0; (((i < points.size())&&(__CLR4_4_125pe25pelb90pe1y.R.iget(100755)!=0|true))||(__CLR4_4_125pe25pelb90pe1y.R.iget(100756)==0&false)); i++) {{
            __CLR4_4_125pe25pelb90pe1y.R.inc(100757);final Vector2D p = points.get(i);

            // Find the circle point closest to the observed point
            // (observed points are points add through the addPoint method above)
            __CLR4_4_125pe25pelb90pe1y.R.inc(100758);final DerivativeStructure dX = cx.subtract(p.getX());
            __CLR4_4_125pe25pelb90pe1y.R.inc(100759);final DerivativeStructure dY = cy.subtract(p.getY());
            __CLR4_4_125pe25pelb90pe1y.R.inc(100760);final DerivativeStructure scaling = r.divide(dX.multiply(dX).add(dY.multiply(dY)).sqrt());
            __CLR4_4_125pe25pelb90pe1y.R.inc(100761);final int index  = i * 2;
            __CLR4_4_125pe25pelb90pe1y.R.inc(100762);model[index]     = cx.subtract(scaling.multiply(dX));
            __CLR4_4_125pe25pelb90pe1y.R.inc(100763);model[index + 1] = cy.subtract(scaling.multiply(dY));

        }

        }__CLR4_4_125pe25pelb90pe1y.R.inc(100764);return model;

    }finally{__CLR4_4_125pe25pelb90pe1y.R.flushNeeded();}}

}
