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

package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

import java.util.ArrayList;
import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import org.apache.commons.math3.analysis.MultivariateMatrixFunction;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.stat.regression.SimpleRegression;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunction;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian;

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
class StraightLineProblem {public static class __CLR4_4_123sq23sqlb90pdxh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,98300,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Cloud of points assumed to be fitted by a straight line. */
    private final ArrayList<double[]> points;
    /** Error (on the y-coordinate of the points). */
    private final double sigma;

    /**
     * @param error Assumed error for the y-coordinate.
     */
    public StraightLineProblem(double error) {try{__CLR4_4_123sq23sqlb90pdxh.R.inc(98234);
        __CLR4_4_123sq23sqlb90pdxh.R.inc(98235);points = new ArrayList<double[]>();
        __CLR4_4_123sq23sqlb90pdxh.R.inc(98236);sigma = error;
    }finally{__CLR4_4_123sq23sqlb90pdxh.R.flushNeeded();}}

    public void addPoint(double px, double py) {try{__CLR4_4_123sq23sqlb90pdxh.R.inc(98237);
        __CLR4_4_123sq23sqlb90pdxh.R.inc(98238);points.add(new double[] { px, py });
    }finally{__CLR4_4_123sq23sqlb90pdxh.R.flushNeeded();}}

    /**
     * @return the list of x-coordinates.
     */
    public double[] x() {try{__CLR4_4_123sq23sqlb90pdxh.R.inc(98239);
        __CLR4_4_123sq23sqlb90pdxh.R.inc(98240);final double[] v = new double[points.size()];
        __CLR4_4_123sq23sqlb90pdxh.R.inc(98241);for (int i = 0; (((i < points.size())&&(__CLR4_4_123sq23sqlb90pdxh.R.iget(98242)!=0|true))||(__CLR4_4_123sq23sqlb90pdxh.R.iget(98243)==0&false)); i++) {{
            __CLR4_4_123sq23sqlb90pdxh.R.inc(98244);final double[] p = points.get(i);
            __CLR4_4_123sq23sqlb90pdxh.R.inc(98245);v[i] = p[0]; // x-coordinate.
        }

        }__CLR4_4_123sq23sqlb90pdxh.R.inc(98246);return v;
    }finally{__CLR4_4_123sq23sqlb90pdxh.R.flushNeeded();}}

    /**
     * @return the list of y-coordinates.
     */
    public double[] y() {try{__CLR4_4_123sq23sqlb90pdxh.R.inc(98247);
        __CLR4_4_123sq23sqlb90pdxh.R.inc(98248);final double[] v = new double[points.size()];
        __CLR4_4_123sq23sqlb90pdxh.R.inc(98249);for (int i = 0; (((i < points.size())&&(__CLR4_4_123sq23sqlb90pdxh.R.iget(98250)!=0|true))||(__CLR4_4_123sq23sqlb90pdxh.R.iget(98251)==0&false)); i++) {{
            __CLR4_4_123sq23sqlb90pdxh.R.inc(98252);final double[] p = points.get(i);
            __CLR4_4_123sq23sqlb90pdxh.R.inc(98253);v[i] = p[1]; // y-coordinate.
        }

        }__CLR4_4_123sq23sqlb90pdxh.R.inc(98254);return v;
    }finally{__CLR4_4_123sq23sqlb90pdxh.R.flushNeeded();}}

    public double[] target() {try{__CLR4_4_123sq23sqlb90pdxh.R.inc(98255);
        __CLR4_4_123sq23sqlb90pdxh.R.inc(98256);return y();
    }finally{__CLR4_4_123sq23sqlb90pdxh.R.flushNeeded();}}

    public double[] weight() {try{__CLR4_4_123sq23sqlb90pdxh.R.inc(98257);
        __CLR4_4_123sq23sqlb90pdxh.R.inc(98258);final double weight = 1 / (sigma * sigma);
        __CLR4_4_123sq23sqlb90pdxh.R.inc(98259);final double[] w = new double[points.size()];
        __CLR4_4_123sq23sqlb90pdxh.R.inc(98260);for (int i = 0; (((i < points.size())&&(__CLR4_4_123sq23sqlb90pdxh.R.iget(98261)!=0|true))||(__CLR4_4_123sq23sqlb90pdxh.R.iget(98262)==0&false)); i++) {{
            __CLR4_4_123sq23sqlb90pdxh.R.inc(98263);w[i] = weight;
        }

        }__CLR4_4_123sq23sqlb90pdxh.R.inc(98264);return w;
    }finally{__CLR4_4_123sq23sqlb90pdxh.R.flushNeeded();}}

    public ModelFunction getModelFunction() {try{__CLR4_4_123sq23sqlb90pdxh.R.inc(98265);
        __CLR4_4_123sq23sqlb90pdxh.R.inc(98266);return new ModelFunction(new MultivariateVectorFunction() {
                public double[] value(double[] params) {try{__CLR4_4_123sq23sqlb90pdxh.R.inc(98267);
                    __CLR4_4_123sq23sqlb90pdxh.R.inc(98268);final Model line = new Model(params[0], params[1]);

                    __CLR4_4_123sq23sqlb90pdxh.R.inc(98269);final double[] model = new double[points.size()];
                    __CLR4_4_123sq23sqlb90pdxh.R.inc(98270);for (int i = 0; (((i < points.size())&&(__CLR4_4_123sq23sqlb90pdxh.R.iget(98271)!=0|true))||(__CLR4_4_123sq23sqlb90pdxh.R.iget(98272)==0&false)); i++) {{
                        __CLR4_4_123sq23sqlb90pdxh.R.inc(98273);final double[] p = points.get(i);
                        __CLR4_4_123sq23sqlb90pdxh.R.inc(98274);model[i] = line.value(p[0]);
                    }

                    }__CLR4_4_123sq23sqlb90pdxh.R.inc(98275);return model;
                }finally{__CLR4_4_123sq23sqlb90pdxh.R.flushNeeded();}}
            });
    }finally{__CLR4_4_123sq23sqlb90pdxh.R.flushNeeded();}}

    public ModelFunctionJacobian getModelFunctionJacobian() {try{__CLR4_4_123sq23sqlb90pdxh.R.inc(98276);
        __CLR4_4_123sq23sqlb90pdxh.R.inc(98277);return new ModelFunctionJacobian(new MultivariateMatrixFunction() {
                public double[][] value(double[] point) {try{__CLR4_4_123sq23sqlb90pdxh.R.inc(98278);
                    __CLR4_4_123sq23sqlb90pdxh.R.inc(98279);return jacobian(point);
                }finally{__CLR4_4_123sq23sqlb90pdxh.R.flushNeeded();}}
            });
    }finally{__CLR4_4_123sq23sqlb90pdxh.R.flushNeeded();}}

    /**
     * Directly solve the linear problem, using the {@link SimpleRegression}
     * class.
     */
    public double[] solve() {try{__CLR4_4_123sq23sqlb90pdxh.R.inc(98280);
        __CLR4_4_123sq23sqlb90pdxh.R.inc(98281);final SimpleRegression regress = new SimpleRegression(true);
        __CLR4_4_123sq23sqlb90pdxh.R.inc(98282);for (double[] d : points) {{
            __CLR4_4_123sq23sqlb90pdxh.R.inc(98283);regress.addData(d[0], d[1]);
        }

        }__CLR4_4_123sq23sqlb90pdxh.R.inc(98284);final double[] result = { regress.getSlope(), regress.getIntercept() };
        __CLR4_4_123sq23sqlb90pdxh.R.inc(98285);return result;
    }finally{__CLR4_4_123sq23sqlb90pdxh.R.flushNeeded();}}

    private double[][] jacobian(double[] params) {try{__CLR4_4_123sq23sqlb90pdxh.R.inc(98286);
        __CLR4_4_123sq23sqlb90pdxh.R.inc(98287);final double[][] jacobian = new double[points.size()][2];

        __CLR4_4_123sq23sqlb90pdxh.R.inc(98288);for (int i = 0; (((i < points.size())&&(__CLR4_4_123sq23sqlb90pdxh.R.iget(98289)!=0|true))||(__CLR4_4_123sq23sqlb90pdxh.R.iget(98290)==0&false)); i++) {{
            __CLR4_4_123sq23sqlb90pdxh.R.inc(98291);final double[] p = points.get(i);
            // Partial derivative wrt "a".
            __CLR4_4_123sq23sqlb90pdxh.R.inc(98292);jacobian[i][0] = p[0];
            // Partial derivative wrt "b".
            __CLR4_4_123sq23sqlb90pdxh.R.inc(98293);jacobian[i][1] = 1;
        }

        }__CLR4_4_123sq23sqlb90pdxh.R.inc(98294);return jacobian;
    }finally{__CLR4_4_123sq23sqlb90pdxh.R.flushNeeded();}}

    /**
     * Linear function.
     */
    public static class Model implements UnivariateFunction {
        final double a;
        final double b;

        public Model(double a,
                     double b) {try{__CLR4_4_123sq23sqlb90pdxh.R.inc(98295);
            __CLR4_4_123sq23sqlb90pdxh.R.inc(98296);this.a = a;
            __CLR4_4_123sq23sqlb90pdxh.R.inc(98297);this.b = b;
        }finally{__CLR4_4_123sq23sqlb90pdxh.R.flushNeeded();}}

        public double value(double x) {try{__CLR4_4_123sq23sqlb90pdxh.R.inc(98298);
            __CLR4_4_123sq23sqlb90pdxh.R.inc(98299);return a * x + b;
        }finally{__CLR4_4_123sq23sqlb90pdxh.R.flushNeeded();}}
    }
}
