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

import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;

/**
 * Implementation of the uniform real distribution.
 *
 * @see <a href="http://en.wikipedia.org/wiki/Uniform_distribution_(continuous)"
 * >Uniform distribution (continuous), at Wikipedia</a>
 *
 * @version $Id$
 * @since 3.0
 */
public class UniformRealDistribution extends AbstractRealDistribution {public static class __CLR4_4_199o99olb90p7lu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,12068,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Default inverse cumulative probability accuracy.
     * @deprecated as of 3.2 not used anymore, will be removed in 4.0
     */
    @Deprecated
    public static final double DEFAULT_INVERSE_ABSOLUTE_ACCURACY = 1e-9;
    /** Serializable version identifier. */
    private static final long serialVersionUID = 20120109L;
    /** Lower bound of this distribution (inclusive). */
    private final double lower;
    /** Upper bound of this distribution (exclusive). */
    private final double upper;

    /**
     * Create a standard uniform real distribution with lower bound (inclusive)
     * equal to zero and upper bound (exclusive) equal to one.
     */
    public UniformRealDistribution() {
        this(0, 1);__CLR4_4_199o99olb90p7lu.R.inc(12013);try{__CLR4_4_199o99olb90p7lu.R.inc(12012);
    }finally{__CLR4_4_199o99olb90p7lu.R.flushNeeded();}}

    /**
     * Create a uniform real distribution using the given lower and upper
     * bounds.
     *
     * @param lower Lower bound of this distribution (inclusive).
     * @param upper Upper bound of this distribution (exclusive).
     * @throws NumberIsTooLargeException if {@code lower >= upper}.
     */
    public UniformRealDistribution(double lower, double upper)
        throws NumberIsTooLargeException {
        this(new Well19937c(), lower, upper);__CLR4_4_199o99olb90p7lu.R.inc(12015);try{__CLR4_4_199o99olb90p7lu.R.inc(12014);
    }finally{__CLR4_4_199o99olb90p7lu.R.flushNeeded();}}

    /**
     * Create a uniform distribution.
     *
     * @param lower Lower bound of this distribution (inclusive).
     * @param upper Upper bound of this distribution (exclusive).
     * @param inverseCumAccuracy Inverse cumulative probability accuracy.
     * @throws NumberIsTooLargeException if {@code lower >= upper}.
     * @deprecated as of 3.2, inverse CDF is now calculated analytically, use
     *             {@link #UniformRealDistribution(double, double)} instead.
     */
    @Deprecated
    public UniformRealDistribution(double lower, double upper, double inverseCumAccuracy)
        throws NumberIsTooLargeException {
        this(new Well19937c(), lower, upper);__CLR4_4_199o99olb90p7lu.R.inc(12017);try{__CLR4_4_199o99olb90p7lu.R.inc(12016);
    }finally{__CLR4_4_199o99olb90p7lu.R.flushNeeded();}}

    /**
     * Creates a uniform distribution.
     *
     * @param rng Random number generator.
     * @param lower Lower bound of this distribution (inclusive).
     * @param upper Upper bound of this distribution (exclusive).
     * @param inverseCumAccuracy Inverse cumulative probability accuracy.
     * @throws NumberIsTooLargeException if {@code lower >= upper}.
     * @since 3.1
     * @deprecated as of 3.2, inverse CDF is now calculated analytically, use
     *             {@link #UniformRealDistribution(RandomGenerator, double, double)}
     *             instead.
     */
    @Deprecated
    public UniformRealDistribution(RandomGenerator rng,
                                   double lower,
                                   double upper,
                                   double inverseCumAccuracy){
        this(rng, lower, upper);__CLR4_4_199o99olb90p7lu.R.inc(12019);try{__CLR4_4_199o99olb90p7lu.R.inc(12018);
    }finally{__CLR4_4_199o99olb90p7lu.R.flushNeeded();}}

    /**
     * Creates a uniform distribution.
     *
     * @param rng Random number generator.
     * @param lower Lower bound of this distribution (inclusive).
     * @param upper Upper bound of this distribution (exclusive).
     * @throws NumberIsTooLargeException if {@code lower >= upper}.
     * @since 3.1
     */
    public UniformRealDistribution(RandomGenerator rng,
                                   double lower,
                                   double upper)
        throws NumberIsTooLargeException {
        super(rng);__CLR4_4_199o99olb90p7lu.R.inc(12021);try{__CLR4_4_199o99olb90p7lu.R.inc(12020);
        __CLR4_4_199o99olb90p7lu.R.inc(12022);if ((((lower >= upper)&&(__CLR4_4_199o99olb90p7lu.R.iget(12023)!=0|true))||(__CLR4_4_199o99olb90p7lu.R.iget(12024)==0&false))) {{
            __CLR4_4_199o99olb90p7lu.R.inc(12025);throw new NumberIsTooLargeException(
                            LocalizedFormats.LOWER_BOUND_NOT_BELOW_UPPER_BOUND,
                            lower, upper, false);
        }

        }__CLR4_4_199o99olb90p7lu.R.inc(12026);this.lower = lower;
        __CLR4_4_199o99olb90p7lu.R.inc(12027);this.upper = upper;
    }finally{__CLR4_4_199o99olb90p7lu.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double density(double x) {try{__CLR4_4_199o99olb90p7lu.R.inc(12028);
        __CLR4_4_199o99olb90p7lu.R.inc(12029);if ((((x < lower || x > upper)&&(__CLR4_4_199o99olb90p7lu.R.iget(12030)!=0|true))||(__CLR4_4_199o99olb90p7lu.R.iget(12031)==0&false))) {{
            __CLR4_4_199o99olb90p7lu.R.inc(12032);return 0.0;
        }
        }__CLR4_4_199o99olb90p7lu.R.inc(12033);return 1 / (upper - lower);
    }finally{__CLR4_4_199o99olb90p7lu.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double cumulativeProbability(double x)  {try{__CLR4_4_199o99olb90p7lu.R.inc(12034);
        __CLR4_4_199o99olb90p7lu.R.inc(12035);if ((((x <= lower)&&(__CLR4_4_199o99olb90p7lu.R.iget(12036)!=0|true))||(__CLR4_4_199o99olb90p7lu.R.iget(12037)==0&false))) {{
            __CLR4_4_199o99olb90p7lu.R.inc(12038);return 0;
        }
        }__CLR4_4_199o99olb90p7lu.R.inc(12039);if ((((x >= upper)&&(__CLR4_4_199o99olb90p7lu.R.iget(12040)!=0|true))||(__CLR4_4_199o99olb90p7lu.R.iget(12041)==0&false))) {{
            __CLR4_4_199o99olb90p7lu.R.inc(12042);return 1;
        }
        }__CLR4_4_199o99olb90p7lu.R.inc(12043);return (x - lower) / (upper - lower);
    }finally{__CLR4_4_199o99olb90p7lu.R.flushNeeded();}}

    @Override
    public double inverseCumulativeProbability(final double p)
            throws OutOfRangeException {try{__CLR4_4_199o99olb90p7lu.R.inc(12044);
        __CLR4_4_199o99olb90p7lu.R.inc(12045);if ((((p < 0.0 || p > 1.0)&&(__CLR4_4_199o99olb90p7lu.R.iget(12046)!=0|true))||(__CLR4_4_199o99olb90p7lu.R.iget(12047)==0&false))) {{
            __CLR4_4_199o99olb90p7lu.R.inc(12048);throw new OutOfRangeException(p, 0, 1);
        }
        }__CLR4_4_199o99olb90p7lu.R.inc(12049);return p * (upper - lower) + lower;
    }finally{__CLR4_4_199o99olb90p7lu.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * For lower bound {@code lower} and upper bound {@code upper}, the mean is
     * {@code 0.5 * (lower + upper)}.
     */
    public double getNumericalMean() {try{__CLR4_4_199o99olb90p7lu.R.inc(12050);
        __CLR4_4_199o99olb90p7lu.R.inc(12051);return 0.5 * (lower + upper);
    }finally{__CLR4_4_199o99olb90p7lu.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * For lower bound {@code lower} and upper bound {@code upper}, the
     * variance is {@code (upper - lower)^2 / 12}.
     */
    public double getNumericalVariance() {try{__CLR4_4_199o99olb90p7lu.R.inc(12052);
        __CLR4_4_199o99olb90p7lu.R.inc(12053);double ul = upper - lower;
        __CLR4_4_199o99olb90p7lu.R.inc(12054);return ul * ul / 12;
    }finally{__CLR4_4_199o99olb90p7lu.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The lower bound of the support is equal to the lower bound parameter
     * of the distribution.
     *
     * @return lower bound of the support
     */
    public double getSupportLowerBound() {try{__CLR4_4_199o99olb90p7lu.R.inc(12055);
        __CLR4_4_199o99olb90p7lu.R.inc(12056);return lower;
    }finally{__CLR4_4_199o99olb90p7lu.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The upper bound of the support is equal to the upper bound parameter
     * of the distribution.
     *
     * @return upper bound of the support
     */
    public double getSupportUpperBound() {try{__CLR4_4_199o99olb90p7lu.R.inc(12057);
        __CLR4_4_199o99olb90p7lu.R.inc(12058);return upper;
    }finally{__CLR4_4_199o99olb90p7lu.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isSupportLowerBoundInclusive() {try{__CLR4_4_199o99olb90p7lu.R.inc(12059);
        __CLR4_4_199o99olb90p7lu.R.inc(12060);return true;
    }finally{__CLR4_4_199o99olb90p7lu.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isSupportUpperBoundInclusive() {try{__CLR4_4_199o99olb90p7lu.R.inc(12061);
        __CLR4_4_199o99olb90p7lu.R.inc(12062);return true;
    }finally{__CLR4_4_199o99olb90p7lu.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The support of this distribution is connected.
     *
     * @return {@code true}
     */
    public boolean isSupportConnected() {try{__CLR4_4_199o99olb90p7lu.R.inc(12063);
        __CLR4_4_199o99olb90p7lu.R.inc(12064);return true;
    }finally{__CLR4_4_199o99olb90p7lu.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double sample()  {try{__CLR4_4_199o99olb90p7lu.R.inc(12065);
        __CLR4_4_199o99olb90p7lu.R.inc(12066);final double u = random.nextDouble();
        __CLR4_4_199o99olb90p7lu.R.inc(12067);return u * upper + (1 - u) * lower;
    }finally{__CLR4_4_199o99olb90p7lu.R.flushNeeded();}}
}
