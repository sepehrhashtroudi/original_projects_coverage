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

/**
 * Class used in the tests.
 */
class CircleVectorial implements MultivariateDifferentiableVectorFunction {public static class __CLR4_4_125ry25rylb90pe22{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,100835,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private ArrayList<Vector2D> points;

    public CircleVectorial() {try{__CLR4_4_125ry25rylb90pe22.R.inc(100798);
        __CLR4_4_125ry25rylb90pe22.R.inc(100799);points  = new ArrayList<Vector2D>();
    }finally{__CLR4_4_125ry25rylb90pe22.R.flushNeeded();}}

    public void addPoint(double px, double py) {try{__CLR4_4_125ry25rylb90pe22.R.inc(100800);
        __CLR4_4_125ry25rylb90pe22.R.inc(100801);points.add(new Vector2D(px, py));
    }finally{__CLR4_4_125ry25rylb90pe22.R.flushNeeded();}}

    public int getN() {try{__CLR4_4_125ry25rylb90pe22.R.inc(100802);
        __CLR4_4_125ry25rylb90pe22.R.inc(100803);return points.size();
    }finally{__CLR4_4_125ry25rylb90pe22.R.flushNeeded();}}

    public double getRadius(Vector2D center) {try{__CLR4_4_125ry25rylb90pe22.R.inc(100804);
        __CLR4_4_125ry25rylb90pe22.R.inc(100805);double r = 0;
        __CLR4_4_125ry25rylb90pe22.R.inc(100806);for (Vector2D point : points) {{
            __CLR4_4_125ry25rylb90pe22.R.inc(100807);r += point.distance(center);
        }
        }__CLR4_4_125ry25rylb90pe22.R.inc(100808);return r / points.size();
    }finally{__CLR4_4_125ry25rylb90pe22.R.flushNeeded();}}

    private DerivativeStructure distance(Vector2D point,
                                         DerivativeStructure cx, DerivativeStructure cy) {try{__CLR4_4_125ry25rylb90pe22.R.inc(100809);
        __CLR4_4_125ry25rylb90pe22.R.inc(100810);DerivativeStructure dx = cx.subtract(point.getX());
        __CLR4_4_125ry25rylb90pe22.R.inc(100811);DerivativeStructure dy = cy.subtract(point.getY());
        __CLR4_4_125ry25rylb90pe22.R.inc(100812);return dx.multiply(dx).add(dy.multiply(dy)).sqrt();
    }finally{__CLR4_4_125ry25rylb90pe22.R.flushNeeded();}}

    public DerivativeStructure getRadius(DerivativeStructure cx, DerivativeStructure cy) {try{__CLR4_4_125ry25rylb90pe22.R.inc(100813);
        __CLR4_4_125ry25rylb90pe22.R.inc(100814);DerivativeStructure r = cx.getField().getZero();
        __CLR4_4_125ry25rylb90pe22.R.inc(100815);for (Vector2D point : points) {{
            __CLR4_4_125ry25rylb90pe22.R.inc(100816);r = r.add(distance(point, cx, cy));
        }
        }__CLR4_4_125ry25rylb90pe22.R.inc(100817);return r.divide(points.size());
    }finally{__CLR4_4_125ry25rylb90pe22.R.flushNeeded();}}

    public double[] value(double[] variables) {try{__CLR4_4_125ry25rylb90pe22.R.inc(100818);
        __CLR4_4_125ry25rylb90pe22.R.inc(100819);Vector2D center = new Vector2D(variables[0], variables[1]);
        __CLR4_4_125ry25rylb90pe22.R.inc(100820);double radius = getRadius(center);

        __CLR4_4_125ry25rylb90pe22.R.inc(100821);double[] residuals = new double[points.size()];
        __CLR4_4_125ry25rylb90pe22.R.inc(100822);for (int i = 0; (((i < residuals.length)&&(__CLR4_4_125ry25rylb90pe22.R.iget(100823)!=0|true))||(__CLR4_4_125ry25rylb90pe22.R.iget(100824)==0&false)); ++i) {{
            __CLR4_4_125ry25rylb90pe22.R.inc(100825);residuals[i] = points.get(i).distance(center) - radius;
        }

        }__CLR4_4_125ry25rylb90pe22.R.inc(100826);return residuals;
    }finally{__CLR4_4_125ry25rylb90pe22.R.flushNeeded();}}

    public DerivativeStructure[] value(DerivativeStructure[] variables) {try{__CLR4_4_125ry25rylb90pe22.R.inc(100827);
        __CLR4_4_125ry25rylb90pe22.R.inc(100828);DerivativeStructure radius = getRadius(variables[0], variables[1]);

        __CLR4_4_125ry25rylb90pe22.R.inc(100829);DerivativeStructure[] residuals = new DerivativeStructure[points.size()];
        __CLR4_4_125ry25rylb90pe22.R.inc(100830);for (int i = 0; (((i < residuals.length)&&(__CLR4_4_125ry25rylb90pe22.R.iget(100831)!=0|true))||(__CLR4_4_125ry25rylb90pe22.R.iget(100832)==0&false)); ++i) {{
            __CLR4_4_125ry25rylb90pe22.R.inc(100833);residuals[i] = distance(points.get(i), variables[0], variables[1]).subtract(radius);
        }

        }__CLR4_4_125ry25rylb90pe22.R.inc(100834);return residuals;
    }finally{__CLR4_4_125ry25rylb90pe22.R.flushNeeded();}}

}
