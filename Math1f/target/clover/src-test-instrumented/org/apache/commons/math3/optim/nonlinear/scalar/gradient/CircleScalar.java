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

package org.apache.commons.math3.optim.nonlinear.scalar.gradient;

import java.util.ArrayList;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction;
import org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunctionGradient;

/**
 * Class used in the tests.
 */
public class CircleScalar {public static class __CLR4_4_121jz21jzlb90pdrw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,95360,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private ArrayList<Vector2D> points;

    public CircleScalar() {try{__CLR4_4_121jz21jzlb90pdrw.R.inc(95327);
        __CLR4_4_121jz21jzlb90pdrw.R.inc(95328);points  = new ArrayList<Vector2D>();
    }finally{__CLR4_4_121jz21jzlb90pdrw.R.flushNeeded();}}

    public void addPoint(double px, double py) {try{__CLR4_4_121jz21jzlb90pdrw.R.inc(95329);
        __CLR4_4_121jz21jzlb90pdrw.R.inc(95330);points.add(new Vector2D(px, py));
    }finally{__CLR4_4_121jz21jzlb90pdrw.R.flushNeeded();}}

    public double getRadius(Vector2D center) {try{__CLR4_4_121jz21jzlb90pdrw.R.inc(95331);
        __CLR4_4_121jz21jzlb90pdrw.R.inc(95332);double r = 0;
        __CLR4_4_121jz21jzlb90pdrw.R.inc(95333);for (Vector2D point : points) {{
            __CLR4_4_121jz21jzlb90pdrw.R.inc(95334);r += point.distance(center);
        }
        }__CLR4_4_121jz21jzlb90pdrw.R.inc(95335);return r / points.size();
    }finally{__CLR4_4_121jz21jzlb90pdrw.R.flushNeeded();}}

    public ObjectiveFunction getObjectiveFunction() {try{__CLR4_4_121jz21jzlb90pdrw.R.inc(95336);
        __CLR4_4_121jz21jzlb90pdrw.R.inc(95337);return new ObjectiveFunction(new MultivariateFunction() {
                public double value(double[] params)  {try{__CLR4_4_121jz21jzlb90pdrw.R.inc(95338);
                    __CLR4_4_121jz21jzlb90pdrw.R.inc(95339);Vector2D center = new Vector2D(params[0], params[1]);
                    __CLR4_4_121jz21jzlb90pdrw.R.inc(95340);double radius = getRadius(center);
                    __CLR4_4_121jz21jzlb90pdrw.R.inc(95341);double sum = 0;
                    __CLR4_4_121jz21jzlb90pdrw.R.inc(95342);for (Vector2D point : points) {{
                        __CLR4_4_121jz21jzlb90pdrw.R.inc(95343);double di = point.distance(center) - radius;
                        __CLR4_4_121jz21jzlb90pdrw.R.inc(95344);sum += di * di;
                    }
                    }__CLR4_4_121jz21jzlb90pdrw.R.inc(95345);return sum;
                }finally{__CLR4_4_121jz21jzlb90pdrw.R.flushNeeded();}}
            });
    }finally{__CLR4_4_121jz21jzlb90pdrw.R.flushNeeded();}}

    public ObjectiveFunctionGradient getObjectiveFunctionGradient() {try{__CLR4_4_121jz21jzlb90pdrw.R.inc(95346);
        __CLR4_4_121jz21jzlb90pdrw.R.inc(95347);return new ObjectiveFunctionGradient(new MultivariateVectorFunction() {
                public double[] value(double[] params) {try{__CLR4_4_121jz21jzlb90pdrw.R.inc(95348);
                    __CLR4_4_121jz21jzlb90pdrw.R.inc(95349);Vector2D center = new Vector2D(params[0], params[1]);
                    __CLR4_4_121jz21jzlb90pdrw.R.inc(95350);double radius = getRadius(center);
                    // gradient of the sum of squared residuals
                    __CLR4_4_121jz21jzlb90pdrw.R.inc(95351);double dJdX = 0;
                    __CLR4_4_121jz21jzlb90pdrw.R.inc(95352);double dJdY = 0;
                    __CLR4_4_121jz21jzlb90pdrw.R.inc(95353);for (Vector2D pk : points) {{
                        __CLR4_4_121jz21jzlb90pdrw.R.inc(95354);double dk = pk.distance(center);
                        __CLR4_4_121jz21jzlb90pdrw.R.inc(95355);dJdX += (center.getX() - pk.getX()) * (dk - radius) / dk;
                        __CLR4_4_121jz21jzlb90pdrw.R.inc(95356);dJdY += (center.getY() - pk.getY()) * (dk - radius) / dk;
                    }
                    }__CLR4_4_121jz21jzlb90pdrw.R.inc(95357);dJdX *= 2;
                    __CLR4_4_121jz21jzlb90pdrw.R.inc(95358);dJdY *= 2;

                    __CLR4_4_121jz21jzlb90pdrw.R.inc(95359);return new double[] { dJdX, dJdY };
                }finally{__CLR4_4_121jz21jzlb90pdrw.R.flushNeeded();}}
            });
    }finally{__CLR4_4_121jz21jzlb90pdrw.R.flushNeeded();}}
}
