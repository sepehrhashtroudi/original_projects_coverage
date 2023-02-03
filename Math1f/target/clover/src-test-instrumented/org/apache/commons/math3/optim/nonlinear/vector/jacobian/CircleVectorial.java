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
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunction;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian;

/**
 * Class used in the tests.
 */
class CircleVectorial {public static class __CLR4_4_122wf22wflb90pdva{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,97115,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private ArrayList<Vector2D> points;

    public CircleVectorial() {try{__CLR4_4_122wf22wflb90pdva.R.inc(97071);
        __CLR4_4_122wf22wflb90pdva.R.inc(97072);points  = new ArrayList<Vector2D>();
    }finally{__CLR4_4_122wf22wflb90pdva.R.flushNeeded();}}

    public void addPoint(double px, double py) {try{__CLR4_4_122wf22wflb90pdva.R.inc(97073);
        __CLR4_4_122wf22wflb90pdva.R.inc(97074);points.add(new Vector2D(px, py));
    }finally{__CLR4_4_122wf22wflb90pdva.R.flushNeeded();}}

    public int getN() {try{__CLR4_4_122wf22wflb90pdva.R.inc(97075);
        __CLR4_4_122wf22wflb90pdva.R.inc(97076);return points.size();
    }finally{__CLR4_4_122wf22wflb90pdva.R.flushNeeded();}}

    public double getRadius(Vector2D center) {try{__CLR4_4_122wf22wflb90pdva.R.inc(97077);
        __CLR4_4_122wf22wflb90pdva.R.inc(97078);double r = 0;
        __CLR4_4_122wf22wflb90pdva.R.inc(97079);for (Vector2D point : points) {{
            __CLR4_4_122wf22wflb90pdva.R.inc(97080);r += point.distance(center);
        }
        }__CLR4_4_122wf22wflb90pdva.R.inc(97081);return r / points.size();
    }finally{__CLR4_4_122wf22wflb90pdva.R.flushNeeded();}}

    public ModelFunction getModelFunction() {try{__CLR4_4_122wf22wflb90pdva.R.inc(97082);
        __CLR4_4_122wf22wflb90pdva.R.inc(97083);return new ModelFunction(new MultivariateVectorFunction() {
                public double[] value(double[] params) {try{__CLR4_4_122wf22wflb90pdva.R.inc(97084);
                    __CLR4_4_122wf22wflb90pdva.R.inc(97085);Vector2D center = new Vector2D(params[0], params[1]);
                    __CLR4_4_122wf22wflb90pdva.R.inc(97086);double radius = getRadius(center);
                    __CLR4_4_122wf22wflb90pdva.R.inc(97087);double[] residuals = new double[points.size()];
                    __CLR4_4_122wf22wflb90pdva.R.inc(97088);for (int i = 0; (((i < residuals.length)&&(__CLR4_4_122wf22wflb90pdva.R.iget(97089)!=0|true))||(__CLR4_4_122wf22wflb90pdva.R.iget(97090)==0&false)); i++) {{
                        __CLR4_4_122wf22wflb90pdva.R.inc(97091);residuals[i] = points.get(i).distance(center) - radius;
                    }

                    }__CLR4_4_122wf22wflb90pdva.R.inc(97092);return residuals;
                }finally{__CLR4_4_122wf22wflb90pdva.R.flushNeeded();}}
        });
    }finally{__CLR4_4_122wf22wflb90pdva.R.flushNeeded();}}

    public ModelFunctionJacobian getModelFunctionJacobian() {try{__CLR4_4_122wf22wflb90pdva.R.inc(97093);
        __CLR4_4_122wf22wflb90pdva.R.inc(97094);return new ModelFunctionJacobian(new MultivariateMatrixFunction() {
                public double[][] value(double[] params) {try{__CLR4_4_122wf22wflb90pdva.R.inc(97095);
                    __CLR4_4_122wf22wflb90pdva.R.inc(97096);final int n = points.size();
                    __CLR4_4_122wf22wflb90pdva.R.inc(97097);final Vector2D center = new Vector2D(params[0], params[1]);

                    __CLR4_4_122wf22wflb90pdva.R.inc(97098);double dRdX = 0;
                    __CLR4_4_122wf22wflb90pdva.R.inc(97099);double dRdY = 0;
                    __CLR4_4_122wf22wflb90pdva.R.inc(97100);for (Vector2D pk : points) {{
                        __CLR4_4_122wf22wflb90pdva.R.inc(97101);double dk = pk.distance(center);
                        __CLR4_4_122wf22wflb90pdva.R.inc(97102);dRdX += (center.getX() - pk.getX()) / dk;
                        __CLR4_4_122wf22wflb90pdva.R.inc(97103);dRdY += (center.getY() - pk.getY()) / dk;
                    }
                    }__CLR4_4_122wf22wflb90pdva.R.inc(97104);dRdX /= n;
                    __CLR4_4_122wf22wflb90pdva.R.inc(97105);dRdY /= n;

                    // Jacobian of the radius residuals.
                    __CLR4_4_122wf22wflb90pdva.R.inc(97106);double[][] jacobian = new double[n][2];
                    __CLR4_4_122wf22wflb90pdva.R.inc(97107);for (int i = 0; (((i < n)&&(__CLR4_4_122wf22wflb90pdva.R.iget(97108)!=0|true))||(__CLR4_4_122wf22wflb90pdva.R.iget(97109)==0&false)); i++) {{
                        __CLR4_4_122wf22wflb90pdva.R.inc(97110);final Vector2D pi = points.get(i);
                        __CLR4_4_122wf22wflb90pdva.R.inc(97111);final double di = pi.distance(center);
                        __CLR4_4_122wf22wflb90pdva.R.inc(97112);jacobian[i][0] = (center.getX() - pi.getX()) / di - dRdX;
                        __CLR4_4_122wf22wflb90pdva.R.inc(97113);jacobian[i][1] = (center.getY() - pi.getY()) / di - dRdY;
                    }

                    }__CLR4_4_122wf22wflb90pdva.R.inc(97114);return jacobian;
                }finally{__CLR4_4_122wf22wflb90pdva.R.flushNeeded();}}
        });
    }finally{__CLR4_4_122wf22wflb90pdva.R.flushNeeded();}}
}
