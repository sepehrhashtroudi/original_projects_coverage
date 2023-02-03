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
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.special.Beta;
import org.apache.commons.math3.special.Gamma;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;

/**
 * Implementation of Student's t-distribution.
 *
 * @see "<a href='http://en.wikipedia.org/wiki/Student&apos;s_t-distribution'>Student's t-distribution (Wikipedia)</a>"
 * @see "<a href='http://mathworld.wolfram.com/Studentst-Distribution.html'>Student's t-distribution (MathWorld)</a>"
 * @version $Id$
 */
public class TDistribution extends AbstractRealDistribution {public static class __CLR4_4_193u93ulb90p7la{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,11863,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Default inverse cumulative probability accuracy.
     * @since 2.1
     */
    public static final double DEFAULT_INVERSE_ABSOLUTE_ACCURACY = 1e-9;
    /** Serializable version identifier */
    private static final long serialVersionUID = -5852615386664158222L;
    /** The degrees of freedom. */
    private final double degreesOfFreedom;
    /** Inverse cumulative probability accuracy. */
    private final double solverAbsoluteAccuracy;

    /**
     * Create a t distribution using the given degrees of freedom.
     *
     * @param degreesOfFreedom Degrees of freedom.
     * @throws NotStrictlyPositiveException if {@code degreesOfFreedom <= 0}
     */
    public TDistribution(double degreesOfFreedom)
        throws NotStrictlyPositiveException {
        this(degreesOfFreedom, DEFAULT_INVERSE_ABSOLUTE_ACCURACY);__CLR4_4_193u93ulb90p7la.R.inc(11803);try{__CLR4_4_193u93ulb90p7la.R.inc(11802);
    }finally{__CLR4_4_193u93ulb90p7la.R.flushNeeded();}}

    /**
     * Create a t distribution using the given degrees of freedom and the
     * specified inverse cumulative probability absolute accuracy.
     *
     * @param degreesOfFreedom Degrees of freedom.
     * @param inverseCumAccuracy the maximum absolute error in inverse
     * cumulative probability estimates
     * (defaults to {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).
     * @throws NotStrictlyPositiveException if {@code degreesOfFreedom <= 0}
     * @since 2.1
     */
    public TDistribution(double degreesOfFreedom, double inverseCumAccuracy)
        throws NotStrictlyPositiveException {
        this(new Well19937c(), degreesOfFreedom, inverseCumAccuracy);__CLR4_4_193u93ulb90p7la.R.inc(11805);try{__CLR4_4_193u93ulb90p7la.R.inc(11804);
    }finally{__CLR4_4_193u93ulb90p7la.R.flushNeeded();}}

    /**
     * Creates a t distribution.
     *
     * @param rng Random number generator.
     * @param degreesOfFreedom Degrees of freedom.
     * @param inverseCumAccuracy the maximum absolute error in inverse
     * cumulative probability estimates
     * (defaults to {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).
     * @throws NotStrictlyPositiveException if {@code degreesOfFreedom <= 0}
     * @since 3.1
     */
    public TDistribution(RandomGenerator rng,
                         double degreesOfFreedom,
                         double inverseCumAccuracy)
        throws NotStrictlyPositiveException {
        super(rng);__CLR4_4_193u93ulb90p7la.R.inc(11807);try{__CLR4_4_193u93ulb90p7la.R.inc(11806);

        __CLR4_4_193u93ulb90p7la.R.inc(11808);if ((((degreesOfFreedom <= 0)&&(__CLR4_4_193u93ulb90p7la.R.iget(11809)!=0|true))||(__CLR4_4_193u93ulb90p7la.R.iget(11810)==0&false))) {{
            __CLR4_4_193u93ulb90p7la.R.inc(11811);throw new NotStrictlyPositiveException(LocalizedFormats.DEGREES_OF_FREEDOM,
                                                   degreesOfFreedom);
        }
        }__CLR4_4_193u93ulb90p7la.R.inc(11812);this.degreesOfFreedom = degreesOfFreedom;
        __CLR4_4_193u93ulb90p7la.R.inc(11813);solverAbsoluteAccuracy = inverseCumAccuracy;
    }finally{__CLR4_4_193u93ulb90p7la.R.flushNeeded();}}

    /**
     * Access the degrees of freedom.
     *
     * @return the degrees of freedom.
     */
    public double getDegreesOfFreedom() {try{__CLR4_4_193u93ulb90p7la.R.inc(11814);
        __CLR4_4_193u93ulb90p7la.R.inc(11815);return degreesOfFreedom;
    }finally{__CLR4_4_193u93ulb90p7la.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double density(double x) {try{__CLR4_4_193u93ulb90p7la.R.inc(11816);
        __CLR4_4_193u93ulb90p7la.R.inc(11817);final double n = degreesOfFreedom;
        __CLR4_4_193u93ulb90p7la.R.inc(11818);final double nPlus1Over2 = (n + 1) / 2;
        __CLR4_4_193u93ulb90p7la.R.inc(11819);return FastMath.exp(Gamma.logGamma(nPlus1Over2) -
                            0.5 * (FastMath.log(FastMath.PI) +
                                   FastMath.log(n)) -
                            Gamma.logGamma(n / 2) -
                            nPlus1Over2 * FastMath.log(1 + x * x / n));
    }finally{__CLR4_4_193u93ulb90p7la.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double cumulativeProbability(double x) {try{__CLR4_4_193u93ulb90p7la.R.inc(11820);
        __CLR4_4_193u93ulb90p7la.R.inc(11821);double ret;
        __CLR4_4_193u93ulb90p7la.R.inc(11822);if ((((x == 0)&&(__CLR4_4_193u93ulb90p7la.R.iget(11823)!=0|true))||(__CLR4_4_193u93ulb90p7la.R.iget(11824)==0&false))) {{
            __CLR4_4_193u93ulb90p7la.R.inc(11825);ret = 0.5;
        } }else {{
            __CLR4_4_193u93ulb90p7la.R.inc(11826);double t =
                Beta.regularizedBeta(
                    degreesOfFreedom / (degreesOfFreedom + (x * x)),
                    0.5 * degreesOfFreedom,
                    0.5);
            __CLR4_4_193u93ulb90p7la.R.inc(11827);if ((((x < 0.0)&&(__CLR4_4_193u93ulb90p7la.R.iget(11828)!=0|true))||(__CLR4_4_193u93ulb90p7la.R.iget(11829)==0&false))) {{
                __CLR4_4_193u93ulb90p7la.R.inc(11830);ret = 0.5 * t;
            } }else {{
                __CLR4_4_193u93ulb90p7la.R.inc(11831);ret = 1.0 - 0.5 * t;
            }
        }}

        }__CLR4_4_193u93ulb90p7la.R.inc(11832);return ret;
    }finally{__CLR4_4_193u93ulb90p7la.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected double getSolverAbsoluteAccuracy() {try{__CLR4_4_193u93ulb90p7la.R.inc(11833);
        __CLR4_4_193u93ulb90p7la.R.inc(11834);return solverAbsoluteAccuracy;
    }finally{__CLR4_4_193u93ulb90p7la.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * For degrees of freedom parameter {@code df}, the mean is
     * <ul>
     *  <li>if {@code df > 1} then {@code 0},</li>
     * <li>else undefined ({@code Double.NaN}).</li>
     * </ul>
     */
    public double getNumericalMean() {try{__CLR4_4_193u93ulb90p7la.R.inc(11835);
        __CLR4_4_193u93ulb90p7la.R.inc(11836);final double df = getDegreesOfFreedom();

        __CLR4_4_193u93ulb90p7la.R.inc(11837);if ((((df > 1)&&(__CLR4_4_193u93ulb90p7la.R.iget(11838)!=0|true))||(__CLR4_4_193u93ulb90p7la.R.iget(11839)==0&false))) {{
            __CLR4_4_193u93ulb90p7la.R.inc(11840);return 0;
        }

        }__CLR4_4_193u93ulb90p7la.R.inc(11841);return Double.NaN;
    }finally{__CLR4_4_193u93ulb90p7la.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * For degrees of freedom parameter {@code df}, the variance is
     * <ul>
     *  <li>if {@code df > 2} then {@code df / (df - 2)},</li>
     *  <li>if {@code 1 < df <= 2} then positive infinity
     *  ({@code Double.POSITIVE_INFINITY}),</li>
     *  <li>else undefined ({@code Double.NaN}).</li>
     * </ul>
     */
    public double getNumericalVariance() {try{__CLR4_4_193u93ulb90p7la.R.inc(11842);
        __CLR4_4_193u93ulb90p7la.R.inc(11843);final double df = getDegreesOfFreedom();

        __CLR4_4_193u93ulb90p7la.R.inc(11844);if ((((df > 2)&&(__CLR4_4_193u93ulb90p7la.R.iget(11845)!=0|true))||(__CLR4_4_193u93ulb90p7la.R.iget(11846)==0&false))) {{
            __CLR4_4_193u93ulb90p7la.R.inc(11847);return df / (df - 2);
        }

        }__CLR4_4_193u93ulb90p7la.R.inc(11848);if ((((df > 1 && df <= 2)&&(__CLR4_4_193u93ulb90p7la.R.iget(11849)!=0|true))||(__CLR4_4_193u93ulb90p7la.R.iget(11850)==0&false))) {{
            __CLR4_4_193u93ulb90p7la.R.inc(11851);return Double.POSITIVE_INFINITY;
        }

        }__CLR4_4_193u93ulb90p7la.R.inc(11852);return Double.NaN;
    }finally{__CLR4_4_193u93ulb90p7la.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The lower bound of the support is always negative infinity no matter the
     * parameters.
     *
     * @return lower bound of the support (always
     * {@code Double.NEGATIVE_INFINITY})
     */
    public double getSupportLowerBound() {try{__CLR4_4_193u93ulb90p7la.R.inc(11853);
        __CLR4_4_193u93ulb90p7la.R.inc(11854);return Double.NEGATIVE_INFINITY;
    }finally{__CLR4_4_193u93ulb90p7la.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The upper bound of the support is always positive infinity no matter the
     * parameters.
     *
     * @return upper bound of the support (always
     * {@code Double.POSITIVE_INFINITY})
     */
    public double getSupportUpperBound() {try{__CLR4_4_193u93ulb90p7la.R.inc(11855);
        __CLR4_4_193u93ulb90p7la.R.inc(11856);return Double.POSITIVE_INFINITY;
    }finally{__CLR4_4_193u93ulb90p7la.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isSupportLowerBoundInclusive() {try{__CLR4_4_193u93ulb90p7la.R.inc(11857);
        __CLR4_4_193u93ulb90p7la.R.inc(11858);return false;
    }finally{__CLR4_4_193u93ulb90p7la.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isSupportUpperBoundInclusive() {try{__CLR4_4_193u93ulb90p7la.R.inc(11859);
        __CLR4_4_193u93ulb90p7la.R.inc(11860);return false;
    }finally{__CLR4_4_193u93ulb90p7la.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The support of this distribution is connected.
     *
     * @return {@code true}
     */
    public boolean isSupportConnected() {try{__CLR4_4_193u93ulb90p7la.R.inc(11861);
        __CLR4_4_193u93ulb90p7la.R.inc(11862);return true;
    }finally{__CLR4_4_193u93ulb90p7la.R.flushNeeded();}}
}
