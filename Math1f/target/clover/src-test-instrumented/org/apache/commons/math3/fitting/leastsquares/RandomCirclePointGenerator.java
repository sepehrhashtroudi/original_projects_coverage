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

import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well44497b;
import org.apache.commons.math3.util.MathUtils;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.distribution.RealDistribution;
import org.apache.commons.math3.distribution.UniformRealDistribution;
import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;

/**
 * Factory for generating a cloud of points that approximate a circle.
 */
public class RandomCirclePointGenerator {public static class __CLR4_4_11mh21mh2lb90pclc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,75800,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** RNG for the x-coordinate of the center. */
    private final RealDistribution cX;
    /** RNG for the y-coordinate of the center. */
    private final RealDistribution cY;
    /** RNG for the parametric position of the point. */
    private final RealDistribution tP;
    /** Radius of the circle. */
    private final double radius;

    /**
     * @param x Abscissa of the circle center.
     * @param y Ordinate of the circle center.
     * @param radius Radius of the circle.
     * @param xSigma Error on the x-coordinate of the circumference points.
     * @param ySigma Error on the y-coordinate of the circumference points.
     * @param seed RNG seed.
     */
    public RandomCirclePointGenerator(double x,
                                      double y,
                                      double radius,
                                      double xSigma,
                                      double ySigma,
                                      long seed) {try{__CLR4_4_11mh21mh2lb90pclc.R.inc(75782);
        __CLR4_4_11mh21mh2lb90pclc.R.inc(75783);final RandomGenerator rng = new Well44497b(seed);
        __CLR4_4_11mh21mh2lb90pclc.R.inc(75784);this.radius = radius;
        __CLR4_4_11mh21mh2lb90pclc.R.inc(75785);cX = new NormalDistribution(rng, x, xSigma,
                                    NormalDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY);
        __CLR4_4_11mh21mh2lb90pclc.R.inc(75786);cY = new NormalDistribution(rng, y, ySigma,
                                    NormalDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY);
        __CLR4_4_11mh21mh2lb90pclc.R.inc(75787);tP = new UniformRealDistribution(rng, 0, MathUtils.TWO_PI,
                                         UniformRealDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY);
    }finally{__CLR4_4_11mh21mh2lb90pclc.R.flushNeeded();}}

    /**
     * Point generator.
     *
     * @param n Number of points to create.
     * @return the cloud of {@code n} points.
     */
    public Vector2D[] generate(int n) {try{__CLR4_4_11mh21mh2lb90pclc.R.inc(75788);
        __CLR4_4_11mh21mh2lb90pclc.R.inc(75789);final Vector2D[] cloud = new Vector2D[n];
        __CLR4_4_11mh21mh2lb90pclc.R.inc(75790);for (int i = 0; (((i < n)&&(__CLR4_4_11mh21mh2lb90pclc.R.iget(75791)!=0|true))||(__CLR4_4_11mh21mh2lb90pclc.R.iget(75792)==0&false)); i++) {{
            __CLR4_4_11mh21mh2lb90pclc.R.inc(75793);cloud[i] = create();
        }
        }__CLR4_4_11mh21mh2lb90pclc.R.inc(75794);return cloud;
    }finally{__CLR4_4_11mh21mh2lb90pclc.R.flushNeeded();}}

    /**
     * Create one point.
     *
     * @return a point.
     */
    private Vector2D create() {try{__CLR4_4_11mh21mh2lb90pclc.R.inc(75795);
        __CLR4_4_11mh21mh2lb90pclc.R.inc(75796);final double t = tP.sample();
        __CLR4_4_11mh21mh2lb90pclc.R.inc(75797);final double pX = cX.sample() + radius * FastMath.cos(t);
        __CLR4_4_11mh21mh2lb90pclc.R.inc(75798);final double pY = cY.sample() + radius * FastMath.sin(t);

        __CLR4_4_11mh21mh2lb90pclc.R.inc(75799);return new Vector2D(pX, pY);
    }finally{__CLR4_4_11mh21mh2lb90pclc.R.flushNeeded();}}
}