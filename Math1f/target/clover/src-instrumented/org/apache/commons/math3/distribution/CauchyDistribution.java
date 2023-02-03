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
package org.apache.commons.math3.distribution;

import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;

/**
 * Implementation of the Cauchy distribution.
 *
 * @see <a href="http://en.wikipedia.org/wiki/Cauchy_distribution">Cauchy distribution (Wikipedia)</a>
 * @see <a href="http://mathworld.wolfram.com/CauchyDistribution.html">Cauchy Distribution (MathWorld)</a>
 * @since 1.1 (changed to concrete class in 3.0)
 * @version $Id$
 */
public class CauchyDistribution extends AbstractRealDistribution {public static class __CLR4_4_17xa7xalb90p7gc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,10326,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Default inverse cumulative probability accuracy.
     * @since 2.1
     */
    public static final double DEFAULT_INVERSE_ABSOLUTE_ACCURACY = 1e-9;
    /** Serializable version identifier */
    private static final long serialVersionUID = 8589540077390120676L;
    /** The median of this distribution. */
    private final double median;
    /** The scale of this distribution. */
    private final double scale;
    /** Inverse cumulative probability accuracy */
    private final double solverAbsoluteAccuracy;

    /**
     * Creates a Cauchy distribution with the median equal to zero and scale
     * equal to one.
     */
    public CauchyDistribution() {
        this(0, 1);__CLR4_4_17xa7xalb90p7gc.R.inc(10271);try{__CLR4_4_17xa7xalb90p7gc.R.inc(10270);
    }finally{__CLR4_4_17xa7xalb90p7gc.R.flushNeeded();}}

    /**
     * Creates a Cauchy distribution using the given median and scale.
     *
     * @param median Median for this distribution.
     * @param scale Scale parameter for this distribution.
     */
    public CauchyDistribution(double median, double scale) {
        this(median, scale, DEFAULT_INVERSE_ABSOLUTE_ACCURACY);__CLR4_4_17xa7xalb90p7gc.R.inc(10273);try{__CLR4_4_17xa7xalb90p7gc.R.inc(10272);
    }finally{__CLR4_4_17xa7xalb90p7gc.R.flushNeeded();}}

    /**
     * Creates a Cauchy distribution using the given median and scale.
     *
     * @param median Median for this distribution.
     * @param scale Scale parameter for this distribution.
     * @param inverseCumAccuracy Maximum absolute error in inverse
     * cumulative probability estimates
     * (defaults to {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).
     * @throws NotStrictlyPositiveException if {@code scale <= 0}.
     * @since 2.1
     */
    public CauchyDistribution(double median, double scale,
                              double inverseCumAccuracy) {
        this(new Well19937c(), median, scale, inverseCumAccuracy);__CLR4_4_17xa7xalb90p7gc.R.inc(10275);try{__CLR4_4_17xa7xalb90p7gc.R.inc(10274);
    }finally{__CLR4_4_17xa7xalb90p7gc.R.flushNeeded();}}

    /**
     * Creates a Cauchy distribution.
     *
     * @param rng Random number generator.
     * @param median Median for this distribution.
     * @param scale Scale parameter for this distribution.
     * @param inverseCumAccuracy Maximum absolute error in inverse
     * cumulative probability estimates
     * (defaults to {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).
     * @throws NotStrictlyPositiveException if {@code scale <= 0}.
     * @since 3.1
     */
    public CauchyDistribution(RandomGenerator rng,
                              double median,
                              double scale,
                              double inverseCumAccuracy) {
        super(rng);__CLR4_4_17xa7xalb90p7gc.R.inc(10277);try{__CLR4_4_17xa7xalb90p7gc.R.inc(10276);
        __CLR4_4_17xa7xalb90p7gc.R.inc(10278);if ((((scale <= 0)&&(__CLR4_4_17xa7xalb90p7gc.R.iget(10279)!=0|true))||(__CLR4_4_17xa7xalb90p7gc.R.iget(10280)==0&false))) {{
            __CLR4_4_17xa7xalb90p7gc.R.inc(10281);throw new NotStrictlyPositiveException(LocalizedFormats.SCALE, scale);
        }
        }__CLR4_4_17xa7xalb90p7gc.R.inc(10282);this.scale = scale;
        __CLR4_4_17xa7xalb90p7gc.R.inc(10283);this.median = median;
        __CLR4_4_17xa7xalb90p7gc.R.inc(10284);solverAbsoluteAccuracy = inverseCumAccuracy;
    }finally{__CLR4_4_17xa7xalb90p7gc.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double cumulativeProbability(double x) {try{__CLR4_4_17xa7xalb90p7gc.R.inc(10285);
        __CLR4_4_17xa7xalb90p7gc.R.inc(10286);return 0.5 + (FastMath.atan((x - median) / scale) / FastMath.PI);
    }finally{__CLR4_4_17xa7xalb90p7gc.R.flushNeeded();}}

    /**
     * Access the median.
     *
     * @return the median for this distribution.
     */
    public double getMedian() {try{__CLR4_4_17xa7xalb90p7gc.R.inc(10287);
        __CLR4_4_17xa7xalb90p7gc.R.inc(10288);return median;
    }finally{__CLR4_4_17xa7xalb90p7gc.R.flushNeeded();}}

    /**
     * Access the scale parameter.
     *
     * @return the scale parameter for this distribution.
     */
    public double getScale() {try{__CLR4_4_17xa7xalb90p7gc.R.inc(10289);
        __CLR4_4_17xa7xalb90p7gc.R.inc(10290);return scale;
    }finally{__CLR4_4_17xa7xalb90p7gc.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double density(double x) {try{__CLR4_4_17xa7xalb90p7gc.R.inc(10291);
        __CLR4_4_17xa7xalb90p7gc.R.inc(10292);final double dev = x - median;
        __CLR4_4_17xa7xalb90p7gc.R.inc(10293);return (1 / FastMath.PI) * (scale / (dev * dev + scale * scale));
    }finally{__CLR4_4_17xa7xalb90p7gc.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * Returns {@code Double.NEGATIVE_INFINITY} when {@code p == 0}
     * and {@code Double.POSITIVE_INFINITY} when {@code p == 1}.
     */
    @Override
    public double inverseCumulativeProbability(double p) throws OutOfRangeException {try{__CLR4_4_17xa7xalb90p7gc.R.inc(10294);
        __CLR4_4_17xa7xalb90p7gc.R.inc(10295);double ret;
        __CLR4_4_17xa7xalb90p7gc.R.inc(10296);if ((((p < 0 || p > 1)&&(__CLR4_4_17xa7xalb90p7gc.R.iget(10297)!=0|true))||(__CLR4_4_17xa7xalb90p7gc.R.iget(10298)==0&false))) {{
            __CLR4_4_17xa7xalb90p7gc.R.inc(10299);throw new OutOfRangeException(p, 0, 1);
        } }else {__CLR4_4_17xa7xalb90p7gc.R.inc(10300);if ((((p == 0)&&(__CLR4_4_17xa7xalb90p7gc.R.iget(10301)!=0|true))||(__CLR4_4_17xa7xalb90p7gc.R.iget(10302)==0&false))) {{
            __CLR4_4_17xa7xalb90p7gc.R.inc(10303);ret = Double.NEGATIVE_INFINITY;
        } }else  {__CLR4_4_17xa7xalb90p7gc.R.inc(10304);if ((((p == 1)&&(__CLR4_4_17xa7xalb90p7gc.R.iget(10305)!=0|true))||(__CLR4_4_17xa7xalb90p7gc.R.iget(10306)==0&false))) {{
            __CLR4_4_17xa7xalb90p7gc.R.inc(10307);ret = Double.POSITIVE_INFINITY;
        } }else {{
            __CLR4_4_17xa7xalb90p7gc.R.inc(10308);ret = median + scale * FastMath.tan(FastMath.PI * (p - .5));
        }
        }}}__CLR4_4_17xa7xalb90p7gc.R.inc(10309);return ret;
    }finally{__CLR4_4_17xa7xalb90p7gc.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected double getSolverAbsoluteAccuracy() {try{__CLR4_4_17xa7xalb90p7gc.R.inc(10310);
        __CLR4_4_17xa7xalb90p7gc.R.inc(10311);return solverAbsoluteAccuracy;
    }finally{__CLR4_4_17xa7xalb90p7gc.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The mean is always undefined no matter the parameters.
     *
     * @return mean (always Double.NaN)
     */
    public double getNumericalMean() {try{__CLR4_4_17xa7xalb90p7gc.R.inc(10312);
        __CLR4_4_17xa7xalb90p7gc.R.inc(10313);return Double.NaN;
    }finally{__CLR4_4_17xa7xalb90p7gc.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The variance is always undefined no matter the parameters.
     *
     * @return variance (always Double.NaN)
     */
    public double getNumericalVariance() {try{__CLR4_4_17xa7xalb90p7gc.R.inc(10314);
        __CLR4_4_17xa7xalb90p7gc.R.inc(10315);return Double.NaN;
    }finally{__CLR4_4_17xa7xalb90p7gc.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The lower bound of the support is always negative infinity no matter
     * the parameters.
     *
     * @return lower bound of the support (always Double.NEGATIVE_INFINITY)
     */
    public double getSupportLowerBound() {try{__CLR4_4_17xa7xalb90p7gc.R.inc(10316);
        __CLR4_4_17xa7xalb90p7gc.R.inc(10317);return Double.NEGATIVE_INFINITY;
    }finally{__CLR4_4_17xa7xalb90p7gc.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The upper bound of the support is always positive infinity no matter
     * the parameters.
     *
     * @return upper bound of the support (always Double.POSITIVE_INFINITY)
     */
    public double getSupportUpperBound() {try{__CLR4_4_17xa7xalb90p7gc.R.inc(10318);
        __CLR4_4_17xa7xalb90p7gc.R.inc(10319);return Double.POSITIVE_INFINITY;
    }finally{__CLR4_4_17xa7xalb90p7gc.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isSupportLowerBoundInclusive() {try{__CLR4_4_17xa7xalb90p7gc.R.inc(10320);
        __CLR4_4_17xa7xalb90p7gc.R.inc(10321);return false;
    }finally{__CLR4_4_17xa7xalb90p7gc.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isSupportUpperBoundInclusive() {try{__CLR4_4_17xa7xalb90p7gc.R.inc(10322);
        __CLR4_4_17xa7xalb90p7gc.R.inc(10323);return false;
    }finally{__CLR4_4_17xa7xalb90p7gc.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The support of this distribution is connected.
     *
     * @return {@code true}
     */
    public boolean isSupportConnected() {try{__CLR4_4_17xa7xalb90p7gc.R.inc(10324);
        __CLR4_4_17xa7xalb90p7gc.R.inc(10325);return true;
    }finally{__CLR4_4_17xa7xalb90p7gc.R.flushNeeded();}}
}
