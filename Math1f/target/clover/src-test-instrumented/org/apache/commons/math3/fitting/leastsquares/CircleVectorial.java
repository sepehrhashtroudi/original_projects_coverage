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
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;

/**
 * Class used in the tests.
 */
class CircleVectorial {public static class __CLR4_4_11lr11lr1lb90pcjo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,74889,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private ArrayList<Vector2D> points;

    public CircleVectorial() {try{__CLR4_4_11lr11lr1lb90pcjo.R.inc(74845);
        __CLR4_4_11lr11lr1lb90pcjo.R.inc(74846);points  = new ArrayList<Vector2D>();
    }finally{__CLR4_4_11lr11lr1lb90pcjo.R.flushNeeded();}}

    public void addPoint(double px, double py) {try{__CLR4_4_11lr11lr1lb90pcjo.R.inc(74847);
        __CLR4_4_11lr11lr1lb90pcjo.R.inc(74848);points.add(new Vector2D(px, py));
    }finally{__CLR4_4_11lr11lr1lb90pcjo.R.flushNeeded();}}

    public int getN() {try{__CLR4_4_11lr11lr1lb90pcjo.R.inc(74849);
        __CLR4_4_11lr11lr1lb90pcjo.R.inc(74850);return points.size();
    }finally{__CLR4_4_11lr11lr1lb90pcjo.R.flushNeeded();}}

    public double getRadius(Vector2D center) {try{__CLR4_4_11lr11lr1lb90pcjo.R.inc(74851);
        __CLR4_4_11lr11lr1lb90pcjo.R.inc(74852);double r = 0;
        __CLR4_4_11lr11lr1lb90pcjo.R.inc(74853);for (Vector2D point : points) {{
            __CLR4_4_11lr11lr1lb90pcjo.R.inc(74854);r += point.distance(center);
        }
        }__CLR4_4_11lr11lr1lb90pcjo.R.inc(74855);return r / points.size();
    }finally{__CLR4_4_11lr11lr1lb90pcjo.R.flushNeeded();}}

    public MultivariateVectorFunction getModelFunction() {try{__CLR4_4_11lr11lr1lb90pcjo.R.inc(74856);
        __CLR4_4_11lr11lr1lb90pcjo.R.inc(74857);return new MultivariateVectorFunction() {
            public double[] value(double[] params) {try{__CLR4_4_11lr11lr1lb90pcjo.R.inc(74858);
                __CLR4_4_11lr11lr1lb90pcjo.R.inc(74859);Vector2D center = new Vector2D(params[0], params[1]);
                __CLR4_4_11lr11lr1lb90pcjo.R.inc(74860);double radius = getRadius(center);
                __CLR4_4_11lr11lr1lb90pcjo.R.inc(74861);double[] residuals = new double[points.size()];
                __CLR4_4_11lr11lr1lb90pcjo.R.inc(74862);for (int i = 0; (((i < residuals.length)&&(__CLR4_4_11lr11lr1lb90pcjo.R.iget(74863)!=0|true))||(__CLR4_4_11lr11lr1lb90pcjo.R.iget(74864)==0&false)); i++) {{
                    __CLR4_4_11lr11lr1lb90pcjo.R.inc(74865);residuals[i] = points.get(i).distance(center) - radius;
                }
                
                }__CLR4_4_11lr11lr1lb90pcjo.R.inc(74866);return residuals;
            }finally{__CLR4_4_11lr11lr1lb90pcjo.R.flushNeeded();}}
        };
    }finally{__CLR4_4_11lr11lr1lb90pcjo.R.flushNeeded();}}

    public MultivariateMatrixFunction getModelFunctionJacobian() {try{__CLR4_4_11lr11lr1lb90pcjo.R.inc(74867);
        __CLR4_4_11lr11lr1lb90pcjo.R.inc(74868);return new MultivariateMatrixFunction() {
            public double[][] value(double[] params) {try{__CLR4_4_11lr11lr1lb90pcjo.R.inc(74869);
                __CLR4_4_11lr11lr1lb90pcjo.R.inc(74870);final int n = points.size();
                __CLR4_4_11lr11lr1lb90pcjo.R.inc(74871);final Vector2D center = new Vector2D(params[0], params[1]);

                __CLR4_4_11lr11lr1lb90pcjo.R.inc(74872);double dRdX = 0;
                __CLR4_4_11lr11lr1lb90pcjo.R.inc(74873);double dRdY = 0;
                __CLR4_4_11lr11lr1lb90pcjo.R.inc(74874);for (Vector2D pk : points) {{
                    __CLR4_4_11lr11lr1lb90pcjo.R.inc(74875);double dk = pk.distance(center);
                    __CLR4_4_11lr11lr1lb90pcjo.R.inc(74876);dRdX += (center.getX() - pk.getX()) / dk;
                    __CLR4_4_11lr11lr1lb90pcjo.R.inc(74877);dRdY += (center.getY() - pk.getY()) / dk;
                }
                }__CLR4_4_11lr11lr1lb90pcjo.R.inc(74878);dRdX /= n;
                __CLR4_4_11lr11lr1lb90pcjo.R.inc(74879);dRdY /= n;

                // Jacobian of the radius residuals.
                __CLR4_4_11lr11lr1lb90pcjo.R.inc(74880);double[][] jacobian = new double[n][2];
                __CLR4_4_11lr11lr1lb90pcjo.R.inc(74881);for (int i = 0; (((i < n)&&(__CLR4_4_11lr11lr1lb90pcjo.R.iget(74882)!=0|true))||(__CLR4_4_11lr11lr1lb90pcjo.R.iget(74883)==0&false)); i++) {{
                    __CLR4_4_11lr11lr1lb90pcjo.R.inc(74884);final Vector2D pi = points.get(i);
                    __CLR4_4_11lr11lr1lb90pcjo.R.inc(74885);final double di = pi.distance(center);
                    __CLR4_4_11lr11lr1lb90pcjo.R.inc(74886);jacobian[i][0] = (center.getX() - pi.getX()) / di - dRdX;
                    __CLR4_4_11lr11lr1lb90pcjo.R.inc(74887);jacobian[i][1] = (center.getY() - pi.getY()) / di - dRdY;
                }

                }__CLR4_4_11lr11lr1lb90pcjo.R.inc(74888);return jacobian;
            }finally{__CLR4_4_11lr11lr1lb90pcjo.R.flushNeeded();}}
        };
    }finally{__CLR4_4_11lr11lr1lb90pcjo.R.flushNeeded();}}
}
