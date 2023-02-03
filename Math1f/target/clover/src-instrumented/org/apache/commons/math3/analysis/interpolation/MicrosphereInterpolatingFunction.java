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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.random.UnitSphereRandomVectorGenerator;
import org.apache.commons.math3.util.FastMath;

/**
 * Interpolating function that implements the
 * <a href="http://www.dudziak.com/microsphere.php">Microsphere Projection</a>.
 *
 * @version $Id$
 */
public class MicrosphereInterpolatingFunction
    implements MultivariateFunction {public static class __CLR4_4_12z12z1lb90p6uk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,3935,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Space dimension.
     */
    private final int dimension;
    /**
     * Internal accounting data for the interpolation algorithm.
     * Each element of the list corresponds to one surface element of
     * the microsphere.
     */
    private final List<MicrosphereSurfaceElement> microsphere;
    /**
     * Exponent used in the power law that computes the weights of the
     * sample data.
     */
    private final double brightnessExponent;
    /**
     * Sample data.
     */
    private final Map<RealVector, Double> samples;

    /**
     * Class for storing the accounting data needed to perform the
     * microsphere projection.
     */
    private static class MicrosphereSurfaceElement {
        /** Normal vector characterizing a surface element. */
        private final RealVector normal;
        /** Illumination received from the brightest sample. */
        private double brightestIllumination;
        /** Brightest sample. */
        private Map.Entry<RealVector, Double> brightestSample;

        /**
         * @param n Normal vector characterizing a surface element
         * of the microsphere.
         */
        MicrosphereSurfaceElement(double[] n) {try{__CLR4_4_12z12z1lb90p6uk.R.inc(3853);
            __CLR4_4_12z12z1lb90p6uk.R.inc(3854);normal = new ArrayRealVector(n);
        }finally{__CLR4_4_12z12z1lb90p6uk.R.flushNeeded();}}

        /**
         * Return the normal vector.
         * @return the normal vector
         */
        RealVector normal() {try{__CLR4_4_12z12z1lb90p6uk.R.inc(3855);
            __CLR4_4_12z12z1lb90p6uk.R.inc(3856);return normal;
        }finally{__CLR4_4_12z12z1lb90p6uk.R.flushNeeded();}}

        /**
         * Reset "illumination" and "sampleIndex".
         */
        void reset() {try{__CLR4_4_12z12z1lb90p6uk.R.inc(3857);
            __CLR4_4_12z12z1lb90p6uk.R.inc(3858);brightestIllumination = 0;
            __CLR4_4_12z12z1lb90p6uk.R.inc(3859);brightestSample = null;
        }finally{__CLR4_4_12z12z1lb90p6uk.R.flushNeeded();}}

        /**
         * Store the illumination and index of the brightest sample.
         * @param illuminationFromSample illumination received from sample
         * @param sample current sample illuminating the element
         */
        void store(final double illuminationFromSample,
                   final Map.Entry<RealVector, Double> sample) {try{__CLR4_4_12z12z1lb90p6uk.R.inc(3860);
            __CLR4_4_12z12z1lb90p6uk.R.inc(3861);if ((((illuminationFromSample > this.brightestIllumination)&&(__CLR4_4_12z12z1lb90p6uk.R.iget(3862)!=0|true))||(__CLR4_4_12z12z1lb90p6uk.R.iget(3863)==0&false))) {{
                __CLR4_4_12z12z1lb90p6uk.R.inc(3864);this.brightestIllumination = illuminationFromSample;
                __CLR4_4_12z12z1lb90p6uk.R.inc(3865);this.brightestSample = sample;
            }
        }}finally{__CLR4_4_12z12z1lb90p6uk.R.flushNeeded();}}

        /**
         * Get the illumination of the element.
         * @return the illumination.
         */
        double illumination() {try{__CLR4_4_12z12z1lb90p6uk.R.inc(3866);
            __CLR4_4_12z12z1lb90p6uk.R.inc(3867);return brightestIllumination;
        }finally{__CLR4_4_12z12z1lb90p6uk.R.flushNeeded();}}

        /**
         * Get the sample illuminating the element the most.
         * @return the sample.
         */
        Map.Entry<RealVector, Double> sample() {try{__CLR4_4_12z12z1lb90p6uk.R.inc(3868);
            __CLR4_4_12z12z1lb90p6uk.R.inc(3869);return brightestSample;
        }finally{__CLR4_4_12z12z1lb90p6uk.R.flushNeeded();}}
    }

    /**
     * @param xval Arguments for the interpolation points.
     * {@code xval[i][0]} is the first component of interpolation point
     * {@code i}, {@code xval[i][1]} is the second component, and so on
     * until {@code xval[i][d-1]}, the last component of that interpolation
     * point (where {@code dimension} is thus the dimension of the sampled
     * space).
     * @param yval Values for the interpolation points.
     * @param brightnessExponent Brightness dimming factor.
     * @param microsphereElements Number of surface elements of the
     * microsphere.
     * @param rand Unit vector generator for creating the microsphere.
     * @throws DimensionMismatchException if the lengths of {@code yval} and
     * {@code xval} (equal to {@code n}, the number of interpolation points)
     * do not match, or the the arrays {@code xval[0]} ... {@code xval[n]},
     * have lengths different from {@code dimension}.
     * @throws NoDataException if there an array has zero-length.
     * @throws NullArgumentException if an argument is {@code null}.
     */
    public MicrosphereInterpolatingFunction(double[][] xval,
                                            double[] yval,
                                            int brightnessExponent,
                                            int microsphereElements,
                                            UnitSphereRandomVectorGenerator rand)
        throws DimensionMismatchException,
               NoDataException,
               NullArgumentException {try{__CLR4_4_12z12z1lb90p6uk.R.inc(3870);
        __CLR4_4_12z12z1lb90p6uk.R.inc(3871);if ((((xval == null ||
            yval == null)&&(__CLR4_4_12z12z1lb90p6uk.R.iget(3872)!=0|true))||(__CLR4_4_12z12z1lb90p6uk.R.iget(3873)==0&false))) {{
            __CLR4_4_12z12z1lb90p6uk.R.inc(3874);throw new NullArgumentException();
        }
        }__CLR4_4_12z12z1lb90p6uk.R.inc(3875);if ((((xval.length == 0)&&(__CLR4_4_12z12z1lb90p6uk.R.iget(3876)!=0|true))||(__CLR4_4_12z12z1lb90p6uk.R.iget(3877)==0&false))) {{
            __CLR4_4_12z12z1lb90p6uk.R.inc(3878);throw new NoDataException();
        }
        }__CLR4_4_12z12z1lb90p6uk.R.inc(3879);if ((((xval.length != yval.length)&&(__CLR4_4_12z12z1lb90p6uk.R.iget(3880)!=0|true))||(__CLR4_4_12z12z1lb90p6uk.R.iget(3881)==0&false))) {{
            __CLR4_4_12z12z1lb90p6uk.R.inc(3882);throw new DimensionMismatchException(xval.length, yval.length);
        }
        }__CLR4_4_12z12z1lb90p6uk.R.inc(3883);if ((((xval[0] == null)&&(__CLR4_4_12z12z1lb90p6uk.R.iget(3884)!=0|true))||(__CLR4_4_12z12z1lb90p6uk.R.iget(3885)==0&false))) {{
            __CLR4_4_12z12z1lb90p6uk.R.inc(3886);throw new NullArgumentException();
        }

        }__CLR4_4_12z12z1lb90p6uk.R.inc(3887);dimension = xval[0].length;
        __CLR4_4_12z12z1lb90p6uk.R.inc(3888);this.brightnessExponent = brightnessExponent;

        // Copy data samples.
        __CLR4_4_12z12z1lb90p6uk.R.inc(3889);samples = new HashMap<RealVector, Double>(yval.length);
        __CLR4_4_12z12z1lb90p6uk.R.inc(3890);for (int i = 0; (((i < xval.length)&&(__CLR4_4_12z12z1lb90p6uk.R.iget(3891)!=0|true))||(__CLR4_4_12z12z1lb90p6uk.R.iget(3892)==0&false)); ++i) {{
            __CLR4_4_12z12z1lb90p6uk.R.inc(3893);final double[] xvalI = xval[i];
            __CLR4_4_12z12z1lb90p6uk.R.inc(3894);if ((((xvalI == null)&&(__CLR4_4_12z12z1lb90p6uk.R.iget(3895)!=0|true))||(__CLR4_4_12z12z1lb90p6uk.R.iget(3896)==0&false))) {{
                __CLR4_4_12z12z1lb90p6uk.R.inc(3897);throw new NullArgumentException();
            }
            }__CLR4_4_12z12z1lb90p6uk.R.inc(3898);if ((((xvalI.length != dimension)&&(__CLR4_4_12z12z1lb90p6uk.R.iget(3899)!=0|true))||(__CLR4_4_12z12z1lb90p6uk.R.iget(3900)==0&false))) {{
                __CLR4_4_12z12z1lb90p6uk.R.inc(3901);throw new DimensionMismatchException(xvalI.length, dimension);
            }

            }__CLR4_4_12z12z1lb90p6uk.R.inc(3902);samples.put(new ArrayRealVector(xvalI), yval[i]);
        }

        }__CLR4_4_12z12z1lb90p6uk.R.inc(3903);microsphere = new ArrayList<MicrosphereSurfaceElement>(microsphereElements);
        // Generate the microsphere, assuming that a fairly large number of
        // randomly generated normals will represent a sphere.
        __CLR4_4_12z12z1lb90p6uk.R.inc(3904);for (int i = 0; (((i < microsphereElements)&&(__CLR4_4_12z12z1lb90p6uk.R.iget(3905)!=0|true))||(__CLR4_4_12z12z1lb90p6uk.R.iget(3906)==0&false)); i++) {{
            __CLR4_4_12z12z1lb90p6uk.R.inc(3907);microsphere.add(new MicrosphereSurfaceElement(rand.nextVector()));
        }
    }}finally{__CLR4_4_12z12z1lb90p6uk.R.flushNeeded();}}

    /**
     * @param point Interpolation point.
     * @return the interpolated value.
     * @throws DimensionMismatchException if point dimension does not math sample
     */
    public double value(double[] point) throws DimensionMismatchException {try{__CLR4_4_12z12z1lb90p6uk.R.inc(3908);
        __CLR4_4_12z12z1lb90p6uk.R.inc(3909);final RealVector p = new ArrayRealVector(point);

        // Reset.
        __CLR4_4_12z12z1lb90p6uk.R.inc(3910);for (MicrosphereSurfaceElement md : microsphere) {{
            __CLR4_4_12z12z1lb90p6uk.R.inc(3911);md.reset();
        }

        // Compute contribution of each sample points to the microsphere elements illumination
        }__CLR4_4_12z12z1lb90p6uk.R.inc(3912);for (Map.Entry<RealVector, Double> sd : samples.entrySet()) {{

            // Vector between interpolation point and current sample point.
            __CLR4_4_12z12z1lb90p6uk.R.inc(3913);final RealVector diff = sd.getKey().subtract(p);
            __CLR4_4_12z12z1lb90p6uk.R.inc(3914);final double diffNorm = diff.getNorm();

            __CLR4_4_12z12z1lb90p6uk.R.inc(3915);if ((((FastMath.abs(diffNorm) < FastMath.ulp(1d))&&(__CLR4_4_12z12z1lb90p6uk.R.iget(3916)!=0|true))||(__CLR4_4_12z12z1lb90p6uk.R.iget(3917)==0&false))) {{
                // No need to interpolate, as the interpolation point is
                // actually (very close to) one of the sampled points.
                __CLR4_4_12z12z1lb90p6uk.R.inc(3918);return sd.getValue();
            }

            }__CLR4_4_12z12z1lb90p6uk.R.inc(3919);for (MicrosphereSurfaceElement md : microsphere) {{
                __CLR4_4_12z12z1lb90p6uk.R.inc(3920);final double w = FastMath.pow(diffNorm, -brightnessExponent);
                __CLR4_4_12z12z1lb90p6uk.R.inc(3921);md.store(cosAngle(diff, md.normal()) * w, sd);
            }

        }}

        // Interpolation calculation.
        }__CLR4_4_12z12z1lb90p6uk.R.inc(3922);double value = 0;
        __CLR4_4_12z12z1lb90p6uk.R.inc(3923);double totalWeight = 0;
        __CLR4_4_12z12z1lb90p6uk.R.inc(3924);for (MicrosphereSurfaceElement md : microsphere) {{
            __CLR4_4_12z12z1lb90p6uk.R.inc(3925);final double iV = md.illumination();
            __CLR4_4_12z12z1lb90p6uk.R.inc(3926);final Map.Entry<RealVector, Double> sd = md.sample();
            __CLR4_4_12z12z1lb90p6uk.R.inc(3927);if ((((sd != null)&&(__CLR4_4_12z12z1lb90p6uk.R.iget(3928)!=0|true))||(__CLR4_4_12z12z1lb90p6uk.R.iget(3929)==0&false))) {{
                __CLR4_4_12z12z1lb90p6uk.R.inc(3930);value += iV * sd.getValue();
                __CLR4_4_12z12z1lb90p6uk.R.inc(3931);totalWeight += iV;
            }
        }}

        }__CLR4_4_12z12z1lb90p6uk.R.inc(3932);return value / totalWeight;
    }finally{__CLR4_4_12z12z1lb90p6uk.R.flushNeeded();}}

    /**
     * Compute the cosine of the angle between 2 vectors.
     *
     * @param v Vector.
     * @param w Vector.
     * @return the cosine of the angle between {@code v} and {@code w}.
     */
    private double cosAngle(final RealVector v, final RealVector w) {try{__CLR4_4_12z12z1lb90p6uk.R.inc(3933);
        __CLR4_4_12z12z1lb90p6uk.R.inc(3934);return v.dotProduct(w) / (v.getNorm() * w.getNorm());
    }finally{__CLR4_4_12z12z1lb90p6uk.R.flushNeeded();}}
}
