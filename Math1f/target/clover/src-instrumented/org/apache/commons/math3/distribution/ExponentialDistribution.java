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
import org.apache.commons.math3.util.CombinatoricsUtils;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.ResizableDoubleArray;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;

/**
 * Implementation of the exponential distribution.
 *
 * @see <a href="http://en.wikipedia.org/wiki/Exponential_distribution">Exponential distribution (Wikipedia)</a>
 * @see <a href="http://mathworld.wolfram.com/ExponentialDistribution.html">Exponential distribution (MathWorld)</a>
 * @version $Id$
 */
public class ExponentialDistribution extends AbstractRealDistribution {public static class __CLR4_4_185f85flb90p7hb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,10658,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Default inverse cumulative probability accuracy.
     * @since 2.1
     */
    public static final double DEFAULT_INVERSE_ABSOLUTE_ACCURACY = 1e-9;
    /** Serializable version identifier */
    private static final long serialVersionUID = 2401296428283614780L;
    /**
     * Used when generating Exponential samples.
     * Table containing the constants
     * q_i = sum_{j=1}^i (ln 2)^j/j! = ln 2 + (ln 2)^2/2 + ... + (ln 2)^i/i!
     * until the largest representable fraction below 1 is exceeded.
     *
     * Note that
     * 1 = 2 - 1 = exp(ln 2) - 1 = sum_{n=1}^infty (ln 2)^n / n!
     * thus q_i -> 1 as i -> +inf,
     * so the higher i, the closer to one we get (the series is not alternating).
     *
     * By trying, n = 16 in Java is enough to reach 1.0.
     */
    private static final double[] EXPONENTIAL_SA_QI;
    /** The mean of this distribution. */
    private final double mean;
    /** Inverse cumulative probability accuracy. */
    private final double solverAbsoluteAccuracy;

    /**
     * Initialize tables.
     */
    static {try{__CLR4_4_185f85flb90p7hb.R.inc(10563);
        /**
         * Filling EXPONENTIAL_SA_QI table.
         * Note that we don't want qi = 0 in the table.
         */
        __CLR4_4_185f85flb90p7hb.R.inc(10564);final double LN2 = FastMath.log(2);
        __CLR4_4_185f85flb90p7hb.R.inc(10565);double qi = 0;
        __CLR4_4_185f85flb90p7hb.R.inc(10566);int i = 1;

        /**
         * ArithmeticUtils provides factorials up to 20, so let's use that
         * limit together with Precision.EPSILON to generate the following
         * code (a priori, we know that there will be 16 elements, but it is
         * better to not hardcode it).
         */
        __CLR4_4_185f85flb90p7hb.R.inc(10567);final ResizableDoubleArray ra = new ResizableDoubleArray(20);

        __CLR4_4_185f85flb90p7hb.R.inc(10568);while ((((qi < 1)&&(__CLR4_4_185f85flb90p7hb.R.iget(10569)!=0|true))||(__CLR4_4_185f85flb90p7hb.R.iget(10570)==0&false))) {{
            __CLR4_4_185f85flb90p7hb.R.inc(10571);qi += FastMath.pow(LN2, i) / CombinatoricsUtils.factorial(i);
            __CLR4_4_185f85flb90p7hb.R.inc(10572);ra.addElement(qi);
            __CLR4_4_185f85flb90p7hb.R.inc(10573);++i;
        }

        }__CLR4_4_185f85flb90p7hb.R.inc(10574);EXPONENTIAL_SA_QI = ra.getElements();
    }finally{__CLR4_4_185f85flb90p7hb.R.flushNeeded();}}

    /**
     * Create an exponential distribution with the given mean.
     * @param mean mean of this distribution.
     */
    public ExponentialDistribution(double mean) {
        this(mean, DEFAULT_INVERSE_ABSOLUTE_ACCURACY);__CLR4_4_185f85flb90p7hb.R.inc(10576);try{__CLR4_4_185f85flb90p7hb.R.inc(10575);
    }finally{__CLR4_4_185f85flb90p7hb.R.flushNeeded();}}

    /**
     * Create an exponential distribution with the given mean.
     *
     * @param mean Mean of this distribution.
     * @param inverseCumAccuracy Maximum absolute error in inverse
     * cumulative probability estimates (defaults to
     * {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).
     * @throws NotStrictlyPositiveException if {@code mean <= 0}.
     * @since 2.1
     */
    public ExponentialDistribution(double mean, double inverseCumAccuracy) {
        this(new Well19937c(), mean, inverseCumAccuracy);__CLR4_4_185f85flb90p7hb.R.inc(10578);try{__CLR4_4_185f85flb90p7hb.R.inc(10577);
    }finally{__CLR4_4_185f85flb90p7hb.R.flushNeeded();}}

    /**
     * Creates an exponential distribution.
     *
     * @param rng Random number generator.
     * @param mean Mean of this distribution.
     * @param inverseCumAccuracy Maximum absolute error in inverse
     * cumulative probability estimates (defaults to
     * {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).
     * @throws NotStrictlyPositiveException if {@code mean <= 0}.
     * @since 3.1
     */
    public ExponentialDistribution(RandomGenerator rng,
                                   double mean,
                                   double inverseCumAccuracy)
        throws NotStrictlyPositiveException {
        super(rng);__CLR4_4_185f85flb90p7hb.R.inc(10580);try{__CLR4_4_185f85flb90p7hb.R.inc(10579);

        __CLR4_4_185f85flb90p7hb.R.inc(10581);if ((((mean <= 0)&&(__CLR4_4_185f85flb90p7hb.R.iget(10582)!=0|true))||(__CLR4_4_185f85flb90p7hb.R.iget(10583)==0&false))) {{
            __CLR4_4_185f85flb90p7hb.R.inc(10584);throw new NotStrictlyPositiveException(LocalizedFormats.MEAN, mean);
        }
        }__CLR4_4_185f85flb90p7hb.R.inc(10585);this.mean = mean;
        __CLR4_4_185f85flb90p7hb.R.inc(10586);solverAbsoluteAccuracy = inverseCumAccuracy;
    }finally{__CLR4_4_185f85flb90p7hb.R.flushNeeded();}}

    /**
     * Access the mean.
     *
     * @return the mean.
     */
    public double getMean() {try{__CLR4_4_185f85flb90p7hb.R.inc(10587);
        __CLR4_4_185f85flb90p7hb.R.inc(10588);return mean;
    }finally{__CLR4_4_185f85flb90p7hb.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double density(double x) {try{__CLR4_4_185f85flb90p7hb.R.inc(10589);
        __CLR4_4_185f85flb90p7hb.R.inc(10590);if ((((x < 0)&&(__CLR4_4_185f85flb90p7hb.R.iget(10591)!=0|true))||(__CLR4_4_185f85flb90p7hb.R.iget(10592)==0&false))) {{
            __CLR4_4_185f85flb90p7hb.R.inc(10593);return 0;
        }
        }__CLR4_4_185f85flb90p7hb.R.inc(10594);return FastMath.exp(-x / mean) / mean;
    }finally{__CLR4_4_185f85flb90p7hb.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The implementation of this method is based on:
     * <ul>
     * <li>
     * <a href="http://mathworld.wolfram.com/ExponentialDistribution.html">
     * Exponential Distribution</a>, equation (1).</li>
     * </ul>
     */
    public double cumulativeProbability(double x)  {try{__CLR4_4_185f85flb90p7hb.R.inc(10595);
        __CLR4_4_185f85flb90p7hb.R.inc(10596);double ret;
        __CLR4_4_185f85flb90p7hb.R.inc(10597);if ((((x <= 0.0)&&(__CLR4_4_185f85flb90p7hb.R.iget(10598)!=0|true))||(__CLR4_4_185f85flb90p7hb.R.iget(10599)==0&false))) {{
            __CLR4_4_185f85flb90p7hb.R.inc(10600);ret = 0.0;
        } }else {{
            __CLR4_4_185f85flb90p7hb.R.inc(10601);ret = 1.0 - FastMath.exp(-x / mean);
        }
        }__CLR4_4_185f85flb90p7hb.R.inc(10602);return ret;
    }finally{__CLR4_4_185f85flb90p7hb.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * Returns {@code 0} when {@code p= = 0} and
     * {@code Double.POSITIVE_INFINITY} when {@code p == 1}.
     */
    @Override
    public double inverseCumulativeProbability(double p) throws OutOfRangeException {try{__CLR4_4_185f85flb90p7hb.R.inc(10603);
        __CLR4_4_185f85flb90p7hb.R.inc(10604);double ret;

        __CLR4_4_185f85flb90p7hb.R.inc(10605);if ((((p < 0.0 || p > 1.0)&&(__CLR4_4_185f85flb90p7hb.R.iget(10606)!=0|true))||(__CLR4_4_185f85flb90p7hb.R.iget(10607)==0&false))) {{
            __CLR4_4_185f85flb90p7hb.R.inc(10608);throw new OutOfRangeException(p, 0.0, 1.0);
        } }else {__CLR4_4_185f85flb90p7hb.R.inc(10609);if ((((p == 1.0)&&(__CLR4_4_185f85flb90p7hb.R.iget(10610)!=0|true))||(__CLR4_4_185f85flb90p7hb.R.iget(10611)==0&false))) {{
            __CLR4_4_185f85flb90p7hb.R.inc(10612);ret = Double.POSITIVE_INFINITY;
        } }else {{
            __CLR4_4_185f85flb90p7hb.R.inc(10613);ret = -mean * FastMath.log(1.0 - p);
        }

        }}__CLR4_4_185f85flb90p7hb.R.inc(10614);return ret;
    }finally{__CLR4_4_185f85flb90p7hb.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * <p><strong>Algorithm Description</strong>: this implementation uses the
     * <a href="http://www.jesus.ox.ac.uk/~clifford/a5/chap1/node5.html">
     * Inversion Method</a> to generate exponentially distributed random values
     * from uniform deviates.</p>
     *
     * @return a random value.
     * @since 2.2
     */
    @Override
    public double sample() {try{__CLR4_4_185f85flb90p7hb.R.inc(10615);
        // Step 1:
        __CLR4_4_185f85flb90p7hb.R.inc(10616);double a = 0;
        __CLR4_4_185f85flb90p7hb.R.inc(10617);double u = random.nextDouble();

        // Step 2 and 3:
        __CLR4_4_185f85flb90p7hb.R.inc(10618);while ((((u < 0.5)&&(__CLR4_4_185f85flb90p7hb.R.iget(10619)!=0|true))||(__CLR4_4_185f85flb90p7hb.R.iget(10620)==0&false))) {{
            __CLR4_4_185f85flb90p7hb.R.inc(10621);a += EXPONENTIAL_SA_QI[0];
            __CLR4_4_185f85flb90p7hb.R.inc(10622);u *= 2;
        }

        // Step 4 (now u >= 0.5):
        }__CLR4_4_185f85flb90p7hb.R.inc(10623);u += u - 1;

        // Step 5:
        __CLR4_4_185f85flb90p7hb.R.inc(10624);if ((((u <= EXPONENTIAL_SA_QI[0])&&(__CLR4_4_185f85flb90p7hb.R.iget(10625)!=0|true))||(__CLR4_4_185f85flb90p7hb.R.iget(10626)==0&false))) {{
            __CLR4_4_185f85flb90p7hb.R.inc(10627);return mean * (a + u);
        }

        // Step 6:
        }__CLR4_4_185f85flb90p7hb.R.inc(10628);int i = 0; // Should be 1, be we iterate before it in while using 0
        __CLR4_4_185f85flb90p7hb.R.inc(10629);double u2 = random.nextDouble();
        __CLR4_4_185f85flb90p7hb.R.inc(10630);double umin = u2;

        // Step 7 and 8:
        __CLR4_4_185f85flb90p7hb.R.inc(10631);do {{
            __CLR4_4_185f85flb90p7hb.R.inc(10632);++i;
            __CLR4_4_185f85flb90p7hb.R.inc(10633);u2 = random.nextDouble();

            __CLR4_4_185f85flb90p7hb.R.inc(10634);if ((((u2 < umin)&&(__CLR4_4_185f85flb90p7hb.R.iget(10635)!=0|true))||(__CLR4_4_185f85flb90p7hb.R.iget(10636)==0&false))) {{
                __CLR4_4_185f85flb90p7hb.R.inc(10637);umin = u2;
            }

            // Step 8:
        }} }while ((((u > EXPONENTIAL_SA_QI[i])&&(__CLR4_4_185f85flb90p7hb.R.iget(10638)!=0|true))||(__CLR4_4_185f85flb90p7hb.R.iget(10639)==0&false))); // Ensured to exit since EXPONENTIAL_SA_QI[MAX] = 1

        __CLR4_4_185f85flb90p7hb.R.inc(10640);return mean * (a + umin * EXPONENTIAL_SA_QI[0]);
    }finally{__CLR4_4_185f85flb90p7hb.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected double getSolverAbsoluteAccuracy() {try{__CLR4_4_185f85flb90p7hb.R.inc(10641);
        __CLR4_4_185f85flb90p7hb.R.inc(10642);return solverAbsoluteAccuracy;
    }finally{__CLR4_4_185f85flb90p7hb.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * For mean parameter {@code k}, the mean is {@code k}.
     */
    public double getNumericalMean() {try{__CLR4_4_185f85flb90p7hb.R.inc(10643);
        __CLR4_4_185f85flb90p7hb.R.inc(10644);return getMean();
    }finally{__CLR4_4_185f85flb90p7hb.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * For mean parameter {@code k}, the variance is {@code k^2}.
     */
    public double getNumericalVariance() {try{__CLR4_4_185f85flb90p7hb.R.inc(10645);
        __CLR4_4_185f85flb90p7hb.R.inc(10646);final double m = getMean();
        __CLR4_4_185f85flb90p7hb.R.inc(10647);return m * m;
    }finally{__CLR4_4_185f85flb90p7hb.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The lower bound of the support is always 0 no matter the mean parameter.
     *
     * @return lower bound of the support (always 0)
     */
    public double getSupportLowerBound() {try{__CLR4_4_185f85flb90p7hb.R.inc(10648);
        __CLR4_4_185f85flb90p7hb.R.inc(10649);return 0;
    }finally{__CLR4_4_185f85flb90p7hb.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The upper bound of the support is always positive infinity
     * no matter the mean parameter.
     *
     * @return upper bound of the support (always Double.POSITIVE_INFINITY)
     */
    public double getSupportUpperBound() {try{__CLR4_4_185f85flb90p7hb.R.inc(10650);
        __CLR4_4_185f85flb90p7hb.R.inc(10651);return Double.POSITIVE_INFINITY;
    }finally{__CLR4_4_185f85flb90p7hb.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isSupportLowerBoundInclusive() {try{__CLR4_4_185f85flb90p7hb.R.inc(10652);
        __CLR4_4_185f85flb90p7hb.R.inc(10653);return true;
    }finally{__CLR4_4_185f85flb90p7hb.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isSupportUpperBoundInclusive() {try{__CLR4_4_185f85flb90p7hb.R.inc(10654);
        __CLR4_4_185f85flb90p7hb.R.inc(10655);return false;
    }finally{__CLR4_4_185f85flb90p7hb.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The support of this distribution is connected.
     *
     * @return {@code true}
     */
    public boolean isSupportConnected() {try{__CLR4_4_185f85flb90p7hb.R.inc(10656);
        __CLR4_4_185f85flb90p7hb.R.inc(10657);return true;
    }finally{__CLR4_4_185f85flb90p7hb.R.flushNeeded();}}
}
