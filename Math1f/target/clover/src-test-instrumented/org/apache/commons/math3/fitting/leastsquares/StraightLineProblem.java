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
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.stat.regression.SimpleRegression;

/**
 * Class that models a straight line defined as {@code y = a x + b}.
 * The parameters of problem are:
 * <ul>
 *  <li>{@code a}</li>
 *  <li>{@code b}</li>
 * </ul>
 * The model functions are:
 * <ul>
 *  <li>for each pair (a, b), the y-coordinate of the line.</li>
 * </ul>
 */
class StraightLineProblem {public static class __CLR4_4_11moc1moclb90pclv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,76110,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Cloud of points assumed to be fitted by a straight line. */
    private final ArrayList<double[]> points;
    /** Error (on the y-coordinate of the points). */
    private final double sigma;

    /**
     * @param error Assumed error for the y-coordinate.
     */
    public StraightLineProblem(double error) {try{__CLR4_4_11moc1moclb90pclv.R.inc(76044);
        __CLR4_4_11moc1moclb90pclv.R.inc(76045);points = new ArrayList<double[]>();
        __CLR4_4_11moc1moclb90pclv.R.inc(76046);sigma = error;
    }finally{__CLR4_4_11moc1moclb90pclv.R.flushNeeded();}}

    public void addPoint(double px, double py) {try{__CLR4_4_11moc1moclb90pclv.R.inc(76047);
        __CLR4_4_11moc1moclb90pclv.R.inc(76048);points.add(new double[] { px, py });
    }finally{__CLR4_4_11moc1moclb90pclv.R.flushNeeded();}}

    /**
     * @return the list of x-coordinates.
     */
    public double[] x() {try{__CLR4_4_11moc1moclb90pclv.R.inc(76049);
        __CLR4_4_11moc1moclb90pclv.R.inc(76050);final double[] v = new double[points.size()];
        __CLR4_4_11moc1moclb90pclv.R.inc(76051);for (int i = 0; (((i < points.size())&&(__CLR4_4_11moc1moclb90pclv.R.iget(76052)!=0|true))||(__CLR4_4_11moc1moclb90pclv.R.iget(76053)==0&false)); i++) {{
            __CLR4_4_11moc1moclb90pclv.R.inc(76054);final double[] p = points.get(i);
            __CLR4_4_11moc1moclb90pclv.R.inc(76055);v[i] = p[0]; // x-coordinate.
        }

        }__CLR4_4_11moc1moclb90pclv.R.inc(76056);return v;
    }finally{__CLR4_4_11moc1moclb90pclv.R.flushNeeded();}}

    /**
     * @return the list of y-coordinates.
     */
    public double[] y() {try{__CLR4_4_11moc1moclb90pclv.R.inc(76057);
        __CLR4_4_11moc1moclb90pclv.R.inc(76058);final double[] v = new double[points.size()];
        __CLR4_4_11moc1moclb90pclv.R.inc(76059);for (int i = 0; (((i < points.size())&&(__CLR4_4_11moc1moclb90pclv.R.iget(76060)!=0|true))||(__CLR4_4_11moc1moclb90pclv.R.iget(76061)==0&false)); i++) {{
            __CLR4_4_11moc1moclb90pclv.R.inc(76062);final double[] p = points.get(i);
            __CLR4_4_11moc1moclb90pclv.R.inc(76063);v[i] = p[1]; // y-coordinate.
        }

        }__CLR4_4_11moc1moclb90pclv.R.inc(76064);return v;
    }finally{__CLR4_4_11moc1moclb90pclv.R.flushNeeded();}}

    public double[] target() {try{__CLR4_4_11moc1moclb90pclv.R.inc(76065);
        __CLR4_4_11moc1moclb90pclv.R.inc(76066);return y();
    }finally{__CLR4_4_11moc1moclb90pclv.R.flushNeeded();}}

    public double[] weight() {try{__CLR4_4_11moc1moclb90pclv.R.inc(76067);
        __CLR4_4_11moc1moclb90pclv.R.inc(76068);final double weight = 1 / (sigma * sigma);
        __CLR4_4_11moc1moclb90pclv.R.inc(76069);final double[] w = new double[points.size()];
        __CLR4_4_11moc1moclb90pclv.R.inc(76070);for (int i = 0; (((i < points.size())&&(__CLR4_4_11moc1moclb90pclv.R.iget(76071)!=0|true))||(__CLR4_4_11moc1moclb90pclv.R.iget(76072)==0&false)); i++) {{
            __CLR4_4_11moc1moclb90pclv.R.inc(76073);w[i] = weight;
        }

        }__CLR4_4_11moc1moclb90pclv.R.inc(76074);return w;
    }finally{__CLR4_4_11moc1moclb90pclv.R.flushNeeded();}}

    public MultivariateVectorFunction getModelFunction() {try{__CLR4_4_11moc1moclb90pclv.R.inc(76075);
        __CLR4_4_11moc1moclb90pclv.R.inc(76076);return new MultivariateVectorFunction() {
            public double[] value(double[] params) {try{__CLR4_4_11moc1moclb90pclv.R.inc(76077);
                __CLR4_4_11moc1moclb90pclv.R.inc(76078);final Model line = new Model(params[0], params[1]);

                __CLR4_4_11moc1moclb90pclv.R.inc(76079);final double[] model = new double[points.size()];
                __CLR4_4_11moc1moclb90pclv.R.inc(76080);for (int i = 0; (((i < points.size())&&(__CLR4_4_11moc1moclb90pclv.R.iget(76081)!=0|true))||(__CLR4_4_11moc1moclb90pclv.R.iget(76082)==0&false)); i++) {{
                    __CLR4_4_11moc1moclb90pclv.R.inc(76083);final double[] p = points.get(i);
                    __CLR4_4_11moc1moclb90pclv.R.inc(76084);model[i] = line.value(p[0]);
                }

                }__CLR4_4_11moc1moclb90pclv.R.inc(76085);return model;
            }finally{__CLR4_4_11moc1moclb90pclv.R.flushNeeded();}}
        };
    }finally{__CLR4_4_11moc1moclb90pclv.R.flushNeeded();}}

    public MultivariateMatrixFunction getModelFunctionJacobian() {try{__CLR4_4_11moc1moclb90pclv.R.inc(76086);
        __CLR4_4_11moc1moclb90pclv.R.inc(76087);return new MultivariateMatrixFunction() {
            public double[][] value(double[] point) {try{__CLR4_4_11moc1moclb90pclv.R.inc(76088);
                __CLR4_4_11moc1moclb90pclv.R.inc(76089);return jacobian(point);
            }finally{__CLR4_4_11moc1moclb90pclv.R.flushNeeded();}}
        };
    }finally{__CLR4_4_11moc1moclb90pclv.R.flushNeeded();}}

    /**
     * Directly solve the linear problem, using the {@link SimpleRegression}
     * class.
     */
    public double[] solve() {try{__CLR4_4_11moc1moclb90pclv.R.inc(76090);
        __CLR4_4_11moc1moclb90pclv.R.inc(76091);final SimpleRegression regress = new SimpleRegression(true);
        __CLR4_4_11moc1moclb90pclv.R.inc(76092);for (double[] d : points) {{
            __CLR4_4_11moc1moclb90pclv.R.inc(76093);regress.addData(d[0], d[1]);
        }

        }__CLR4_4_11moc1moclb90pclv.R.inc(76094);final double[] result = { regress.getSlope(), regress.getIntercept() };
        __CLR4_4_11moc1moclb90pclv.R.inc(76095);return result;
    }finally{__CLR4_4_11moc1moclb90pclv.R.flushNeeded();}}

    private double[][] jacobian(double[] params) {try{__CLR4_4_11moc1moclb90pclv.R.inc(76096);
        __CLR4_4_11moc1moclb90pclv.R.inc(76097);final double[][] jacobian = new double[points.size()][2];

        __CLR4_4_11moc1moclb90pclv.R.inc(76098);for (int i = 0; (((i < points.size())&&(__CLR4_4_11moc1moclb90pclv.R.iget(76099)!=0|true))||(__CLR4_4_11moc1moclb90pclv.R.iget(76100)==0&false)); i++) {{
            __CLR4_4_11moc1moclb90pclv.R.inc(76101);final double[] p = points.get(i);
            // Partial derivative wrt "a".
            __CLR4_4_11moc1moclb90pclv.R.inc(76102);jacobian[i][0] = p[0];
            // Partial derivative wrt "b".
            __CLR4_4_11moc1moclb90pclv.R.inc(76103);jacobian[i][1] = 1;
        }

        }__CLR4_4_11moc1moclb90pclv.R.inc(76104);return jacobian;
    }finally{__CLR4_4_11moc1moclb90pclv.R.flushNeeded();}}

    /**
     * Linear function.
     */
    public static class Model implements UnivariateFunction {
        final double a;
        final double b;

        public Model(double a,
                     double b) {try{__CLR4_4_11moc1moclb90pclv.R.inc(76105);
            __CLR4_4_11moc1moclb90pclv.R.inc(76106);this.a = a;
            __CLR4_4_11moc1moclb90pclv.R.inc(76107);this.b = b;
        }finally{__CLR4_4_11moc1moclb90pclv.R.flushNeeded();}}

        public double value(double x) {try{__CLR4_4_11moc1moclb90pclv.R.inc(76108);
            __CLR4_4_11moc1moclb90pclv.R.inc(76109);return a * x + b;
        }finally{__CLR4_4_11moc1moclb90pclv.R.flushNeeded();}}
    }
}
