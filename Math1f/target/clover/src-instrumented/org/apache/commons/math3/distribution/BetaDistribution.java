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

import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.special.Gamma;
import org.apache.commons.math3.special.Beta;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;

/**
 * Implements the Beta distribution.
 *
 * @see <a href="http://en.wikipedia.org/wiki/Beta_distribution">Beta distribution</a>
 * @version $Id$
 * @since 2.0 (changed to concrete class in 3.0)
 */
public class BetaDistribution extends AbstractRealDistribution {public static class __CLR4_4_17tr7trlb90p7g2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,10217,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Default inverse cumulative probability accuracy.
     * @since 2.1
     */
    public static final double DEFAULT_INVERSE_ABSOLUTE_ACCURACY = 1e-9;
    /** Serializable version identifier. */
    private static final long serialVersionUID = -1221965979403477668L;
    /** First shape parameter. */
    private final double alpha;
    /** Second shape parameter. */
    private final double beta;
    /** Normalizing factor used in density computations.
     * updated whenever alpha or beta are changed.
     */
    private double z;
    /** Inverse cumulative probability accuracy. */
    private final double solverAbsoluteAccuracy;

    /**
     * Build a new instance.
     *
     * @param alpha First shape parameter (must be positive).
     * @param beta Second shape parameter (must be positive).
     */
    public BetaDistribution(double alpha, double beta) {
        this(alpha, beta, DEFAULT_INVERSE_ABSOLUTE_ACCURACY);__CLR4_4_17tr7trlb90p7g2.R.inc(10144);try{__CLR4_4_17tr7trlb90p7g2.R.inc(10143);
    }finally{__CLR4_4_17tr7trlb90p7g2.R.flushNeeded();}}

    /**
     * Build a new instance.
     *
     * @param alpha First shape parameter (must be positive).
     * @param beta Second shape parameter (must be positive).
     * @param inverseCumAccuracy Maximum absolute error in inverse
     * cumulative probability estimates (defaults to
     * {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).
     * @since 2.1
     */
    public BetaDistribution(double alpha, double beta, double inverseCumAccuracy) {
        this(new Well19937c(), alpha, beta, inverseCumAccuracy);__CLR4_4_17tr7trlb90p7g2.R.inc(10146);try{__CLR4_4_17tr7trlb90p7g2.R.inc(10145);
    }finally{__CLR4_4_17tr7trlb90p7g2.R.flushNeeded();}}

    /**
     * Creates a &beta; distribution.
     *
     * @param rng Random number generator.
     * @param alpha First shape parameter (must be positive).
     * @param beta Second shape parameter (must be positive).
     * @param inverseCumAccuracy Maximum absolute error in inverse
     * cumulative probability estimates (defaults to
     * {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).
     * @since 3.1
     */
    public BetaDistribution(RandomGenerator rng,
                            double alpha,
                            double beta,
                            double inverseCumAccuracy) {
        super(rng);__CLR4_4_17tr7trlb90p7g2.R.inc(10148);try{__CLR4_4_17tr7trlb90p7g2.R.inc(10147);

        __CLR4_4_17tr7trlb90p7g2.R.inc(10149);this.alpha = alpha;
        __CLR4_4_17tr7trlb90p7g2.R.inc(10150);this.beta = beta;
        __CLR4_4_17tr7trlb90p7g2.R.inc(10151);z = Double.NaN;
        __CLR4_4_17tr7trlb90p7g2.R.inc(10152);solverAbsoluteAccuracy = inverseCumAccuracy;
    }finally{__CLR4_4_17tr7trlb90p7g2.R.flushNeeded();}}

    /**
     * Access the first shape parameter, {@code alpha}.
     *
     * @return the first shape parameter.
     */
    public double getAlpha() {try{__CLR4_4_17tr7trlb90p7g2.R.inc(10153);
        __CLR4_4_17tr7trlb90p7g2.R.inc(10154);return alpha;
    }finally{__CLR4_4_17tr7trlb90p7g2.R.flushNeeded();}}

    /**
     * Access the second shape parameter, {@code beta}.
     *
     * @return the second shape parameter.
     */
    public double getBeta() {try{__CLR4_4_17tr7trlb90p7g2.R.inc(10155);
        __CLR4_4_17tr7trlb90p7g2.R.inc(10156);return beta;
    }finally{__CLR4_4_17tr7trlb90p7g2.R.flushNeeded();}}

    /** Recompute the normalization factor. */
    private void recomputeZ() {try{__CLR4_4_17tr7trlb90p7g2.R.inc(10157);
        __CLR4_4_17tr7trlb90p7g2.R.inc(10158);if ((((Double.isNaN(z))&&(__CLR4_4_17tr7trlb90p7g2.R.iget(10159)!=0|true))||(__CLR4_4_17tr7trlb90p7g2.R.iget(10160)==0&false))) {{
            __CLR4_4_17tr7trlb90p7g2.R.inc(10161);z = Gamma.logGamma(alpha) + Gamma.logGamma(beta) - Gamma.logGamma(alpha + beta);
        }
    }}finally{__CLR4_4_17tr7trlb90p7g2.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double density(double x) {try{__CLR4_4_17tr7trlb90p7g2.R.inc(10162);
        __CLR4_4_17tr7trlb90p7g2.R.inc(10163);recomputeZ();
        __CLR4_4_17tr7trlb90p7g2.R.inc(10164);if ((((x < 0 || x > 1)&&(__CLR4_4_17tr7trlb90p7g2.R.iget(10165)!=0|true))||(__CLR4_4_17tr7trlb90p7g2.R.iget(10166)==0&false))) {{
            __CLR4_4_17tr7trlb90p7g2.R.inc(10167);return 0;
        } }else {__CLR4_4_17tr7trlb90p7g2.R.inc(10168);if ((((x == 0)&&(__CLR4_4_17tr7trlb90p7g2.R.iget(10169)!=0|true))||(__CLR4_4_17tr7trlb90p7g2.R.iget(10170)==0&false))) {{
            __CLR4_4_17tr7trlb90p7g2.R.inc(10171);if ((((alpha < 1)&&(__CLR4_4_17tr7trlb90p7g2.R.iget(10172)!=0|true))||(__CLR4_4_17tr7trlb90p7g2.R.iget(10173)==0&false))) {{
                __CLR4_4_17tr7trlb90p7g2.R.inc(10174);throw new NumberIsTooSmallException(LocalizedFormats.CANNOT_COMPUTE_BETA_DENSITY_AT_0_FOR_SOME_ALPHA, alpha, 1, false);
            }
            }__CLR4_4_17tr7trlb90p7g2.R.inc(10175);return 0;
        } }else {__CLR4_4_17tr7trlb90p7g2.R.inc(10176);if ((((x == 1)&&(__CLR4_4_17tr7trlb90p7g2.R.iget(10177)!=0|true))||(__CLR4_4_17tr7trlb90p7g2.R.iget(10178)==0&false))) {{
            __CLR4_4_17tr7trlb90p7g2.R.inc(10179);if ((((beta < 1)&&(__CLR4_4_17tr7trlb90p7g2.R.iget(10180)!=0|true))||(__CLR4_4_17tr7trlb90p7g2.R.iget(10181)==0&false))) {{
                __CLR4_4_17tr7trlb90p7g2.R.inc(10182);throw new NumberIsTooSmallException(LocalizedFormats.CANNOT_COMPUTE_BETA_DENSITY_AT_1_FOR_SOME_BETA, beta, 1, false);
            }
            }__CLR4_4_17tr7trlb90p7g2.R.inc(10183);return 0;
        } }else {{
            __CLR4_4_17tr7trlb90p7g2.R.inc(10184);double logX = FastMath.log(x);
            __CLR4_4_17tr7trlb90p7g2.R.inc(10185);double log1mX = FastMath.log1p(-x);
            __CLR4_4_17tr7trlb90p7g2.R.inc(10186);return FastMath.exp((alpha - 1) * logX + (beta - 1) * log1mX - z);
        }
    }}}}finally{__CLR4_4_17tr7trlb90p7g2.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double cumulativeProbability(double x)  {try{__CLR4_4_17tr7trlb90p7g2.R.inc(10187);
        __CLR4_4_17tr7trlb90p7g2.R.inc(10188);if ((((x <= 0)&&(__CLR4_4_17tr7trlb90p7g2.R.iget(10189)!=0|true))||(__CLR4_4_17tr7trlb90p7g2.R.iget(10190)==0&false))) {{
            __CLR4_4_17tr7trlb90p7g2.R.inc(10191);return 0;
        } }else {__CLR4_4_17tr7trlb90p7g2.R.inc(10192);if ((((x >= 1)&&(__CLR4_4_17tr7trlb90p7g2.R.iget(10193)!=0|true))||(__CLR4_4_17tr7trlb90p7g2.R.iget(10194)==0&false))) {{
            __CLR4_4_17tr7trlb90p7g2.R.inc(10195);return 1;
        } }else {{
            __CLR4_4_17tr7trlb90p7g2.R.inc(10196);return Beta.regularizedBeta(x, alpha, beta);
        }
    }}}finally{__CLR4_4_17tr7trlb90p7g2.R.flushNeeded();}}

    /**
     * Return the absolute accuracy setting of the solver used to estimate
     * inverse cumulative probabilities.
     *
     * @return the solver absolute accuracy.
     * @since 2.1
     */
    @Override
    protected double getSolverAbsoluteAccuracy() {try{__CLR4_4_17tr7trlb90p7g2.R.inc(10197);
        __CLR4_4_17tr7trlb90p7g2.R.inc(10198);return solverAbsoluteAccuracy;
    }finally{__CLR4_4_17tr7trlb90p7g2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * For first shape parameter {@code alpha} and second shape parameter
     * {@code beta}, the mean is {@code alpha / (alpha + beta)}.
     */
    public double getNumericalMean() {try{__CLR4_4_17tr7trlb90p7g2.R.inc(10199);
        __CLR4_4_17tr7trlb90p7g2.R.inc(10200);final double a = getAlpha();
        __CLR4_4_17tr7trlb90p7g2.R.inc(10201);return a / (a + getBeta());
    }finally{__CLR4_4_17tr7trlb90p7g2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * For first shape parameter {@code alpha} and second shape parameter
     * {@code beta}, the variance is
     * {@code (alpha * beta) / [(alpha + beta)^2 * (alpha + beta + 1)]}.
     */
    public double getNumericalVariance() {try{__CLR4_4_17tr7trlb90p7g2.R.inc(10202);
        __CLR4_4_17tr7trlb90p7g2.R.inc(10203);final double a = getAlpha();
        __CLR4_4_17tr7trlb90p7g2.R.inc(10204);final double b = getBeta();
        __CLR4_4_17tr7trlb90p7g2.R.inc(10205);final double alphabetasum = a + b;
        __CLR4_4_17tr7trlb90p7g2.R.inc(10206);return (a * b) / ((alphabetasum * alphabetasum) * (alphabetasum + 1));
    }finally{__CLR4_4_17tr7trlb90p7g2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The lower bound of the support is always 0 no matter the parameters.
     *
     * @return lower bound of the support (always 0)
     */
    public double getSupportLowerBound() {try{__CLR4_4_17tr7trlb90p7g2.R.inc(10207);
        __CLR4_4_17tr7trlb90p7g2.R.inc(10208);return 0;
    }finally{__CLR4_4_17tr7trlb90p7g2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The upper bound of the support is always 1 no matter the parameters.
     *
     * @return upper bound of the support (always 1)
     */
    public double getSupportUpperBound() {try{__CLR4_4_17tr7trlb90p7g2.R.inc(10209);
        __CLR4_4_17tr7trlb90p7g2.R.inc(10210);return 1;
    }finally{__CLR4_4_17tr7trlb90p7g2.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isSupportLowerBoundInclusive() {try{__CLR4_4_17tr7trlb90p7g2.R.inc(10211);
        __CLR4_4_17tr7trlb90p7g2.R.inc(10212);return false;
    }finally{__CLR4_4_17tr7trlb90p7g2.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isSupportUpperBoundInclusive() {try{__CLR4_4_17tr7trlb90p7g2.R.inc(10213);
        __CLR4_4_17tr7trlb90p7g2.R.inc(10214);return false;
    }finally{__CLR4_4_17tr7trlb90p7g2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The support of this distribution is connected.
     *
     * @return {@code true}
     */
    public boolean isSupportConnected() {try{__CLR4_4_17tr7trlb90p7g2.R.inc(10215);
        __CLR4_4_17tr7trlb90p7g2.R.inc(10216);return true;
    }finally{__CLR4_4_17tr7trlb90p7g2.R.flushNeeded();}}
}
