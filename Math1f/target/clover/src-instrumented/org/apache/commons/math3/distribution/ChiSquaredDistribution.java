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

import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;

/**
 * Implementation of the chi-squared distribution.
 *
 * @see <a href="http://en.wikipedia.org/wiki/Chi-squared_distribution">Chi-squared distribution (Wikipedia)</a>
 * @see <a href="http://mathworld.wolfram.com/Chi-SquaredDistribution.html">Chi-squared Distribution (MathWorld)</a>
 * @version $Id$
 */
public class ChiSquaredDistribution extends AbstractRealDistribution {public static class __CLR4_4_17yu7yulb90p7gh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,10356,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Default inverse cumulative probability accuracy
     * @since 2.1
     */
    public static final double DEFAULT_INVERSE_ABSOLUTE_ACCURACY = 1e-9;
    /** Serializable version identifier */
    private static final long serialVersionUID = -8352658048349159782L;
    /** Internal Gamma distribution. */
    private final GammaDistribution gamma;
    /** Inverse cumulative probability accuracy */
    private final double solverAbsoluteAccuracy;

    /**
     * Create a Chi-Squared distribution with the given degrees of freedom.
     *
     * @param degreesOfFreedom Degrees of freedom.
     */
    public ChiSquaredDistribution(double degreesOfFreedom) {
        this(degreesOfFreedom, DEFAULT_INVERSE_ABSOLUTE_ACCURACY);__CLR4_4_17yu7yulb90p7gh.R.inc(10327);try{__CLR4_4_17yu7yulb90p7gh.R.inc(10326);
    }finally{__CLR4_4_17yu7yulb90p7gh.R.flushNeeded();}}

    /**
     * Create a Chi-Squared distribution with the given degrees of freedom and
     * inverse cumulative probability accuracy.
     *
     * @param degreesOfFreedom Degrees of freedom.
     * @param inverseCumAccuracy the maximum absolute error in inverse
     * cumulative probability estimates (defaults to
     * {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).
     * @since 2.1
     */
    public ChiSquaredDistribution(double degreesOfFreedom,
                                  double inverseCumAccuracy) {
        this(new Well19937c(), degreesOfFreedom, inverseCumAccuracy);__CLR4_4_17yu7yulb90p7gh.R.inc(10329);try{__CLR4_4_17yu7yulb90p7gh.R.inc(10328);
    }finally{__CLR4_4_17yu7yulb90p7gh.R.flushNeeded();}}

    /**
     * Create a Chi-Squared distribution with the given degrees of freedom and
     * inverse cumulative probability accuracy.
     *
     * @param rng Random number generator.
     * @param degreesOfFreedom Degrees of freedom.
     * @param inverseCumAccuracy the maximum absolute error in inverse
     * cumulative probability estimates (defaults to
     * {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).
     * @since 3.1
     */
    public ChiSquaredDistribution(RandomGenerator rng,
                                  double degreesOfFreedom,
                                  double inverseCumAccuracy) {
        super(rng);__CLR4_4_17yu7yulb90p7gh.R.inc(10331);try{__CLR4_4_17yu7yulb90p7gh.R.inc(10330);

        __CLR4_4_17yu7yulb90p7gh.R.inc(10332);gamma = new GammaDistribution(degreesOfFreedom / 2, 2);
        __CLR4_4_17yu7yulb90p7gh.R.inc(10333);solverAbsoluteAccuracy = inverseCumAccuracy;
    }finally{__CLR4_4_17yu7yulb90p7gh.R.flushNeeded();}}

    /**
     * Access the number of degrees of freedom.
     *
     * @return the degrees of freedom.
     */
    public double getDegreesOfFreedom() {try{__CLR4_4_17yu7yulb90p7gh.R.inc(10334);
        __CLR4_4_17yu7yulb90p7gh.R.inc(10335);return gamma.getShape() * 2.0;
    }finally{__CLR4_4_17yu7yulb90p7gh.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double density(double x) {try{__CLR4_4_17yu7yulb90p7gh.R.inc(10336);
        __CLR4_4_17yu7yulb90p7gh.R.inc(10337);return gamma.density(x);
    }finally{__CLR4_4_17yu7yulb90p7gh.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double cumulativeProbability(double x)  {try{__CLR4_4_17yu7yulb90p7gh.R.inc(10338);
        __CLR4_4_17yu7yulb90p7gh.R.inc(10339);return gamma.cumulativeProbability(x);
    }finally{__CLR4_4_17yu7yulb90p7gh.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected double getSolverAbsoluteAccuracy() {try{__CLR4_4_17yu7yulb90p7gh.R.inc(10340);
        __CLR4_4_17yu7yulb90p7gh.R.inc(10341);return solverAbsoluteAccuracy;
    }finally{__CLR4_4_17yu7yulb90p7gh.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * For {@code k} degrees of freedom, the mean is {@code k}.
     */
    public double getNumericalMean() {try{__CLR4_4_17yu7yulb90p7gh.R.inc(10342);
        __CLR4_4_17yu7yulb90p7gh.R.inc(10343);return getDegreesOfFreedom();
    }finally{__CLR4_4_17yu7yulb90p7gh.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * @return {@code 2 * k}, where {@code k} is the number of degrees of freedom.
     */
    public double getNumericalVariance() {try{__CLR4_4_17yu7yulb90p7gh.R.inc(10344);
        __CLR4_4_17yu7yulb90p7gh.R.inc(10345);return 2 * getDegreesOfFreedom();
    }finally{__CLR4_4_17yu7yulb90p7gh.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The lower bound of the support is always 0 no matter the
     * degrees of freedom.
     *
     * @return zero.
     */
    public double getSupportLowerBound() {try{__CLR4_4_17yu7yulb90p7gh.R.inc(10346);
        __CLR4_4_17yu7yulb90p7gh.R.inc(10347);return 0;
    }finally{__CLR4_4_17yu7yulb90p7gh.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The upper bound of the support is always positive infinity no matter the
     * degrees of freedom.
     *
     * @return {@code Double.POSITIVE_INFINITY}.
     */
    public double getSupportUpperBound() {try{__CLR4_4_17yu7yulb90p7gh.R.inc(10348);
        __CLR4_4_17yu7yulb90p7gh.R.inc(10349);return Double.POSITIVE_INFINITY;
    }finally{__CLR4_4_17yu7yulb90p7gh.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isSupportLowerBoundInclusive() {try{__CLR4_4_17yu7yulb90p7gh.R.inc(10350);
        __CLR4_4_17yu7yulb90p7gh.R.inc(10351);return true;
    }finally{__CLR4_4_17yu7yulb90p7gh.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isSupportUpperBoundInclusive() {try{__CLR4_4_17yu7yulb90p7gh.R.inc(10352);
        __CLR4_4_17yu7yulb90p7gh.R.inc(10353);return false;
    }finally{__CLR4_4_17yu7yulb90p7gh.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The support of this distribution is connected.
     *
     * @return {@code true}
     */
    public boolean isSupportConnected() {try{__CLR4_4_17yu7yulb90p7gh.R.inc(10354);
        __CLR4_4_17yu7yulb90p7gh.R.inc(10355);return true;
    }finally{__CLR4_4_17yu7yulb90p7gh.R.flushNeeded();}}
}
