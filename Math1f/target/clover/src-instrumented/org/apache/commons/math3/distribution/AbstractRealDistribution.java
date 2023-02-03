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

import java.io.Serializable;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.RandomDataImpl;
import org.apache.commons.math3.util.FastMath;

/**
 * Base class for probability distributions on the reals.
 * Default implementations are provided for some of the methods
 * that do not vary from distribution to distribution.
 *
 * @version $Id$
 * @since 3.0
 */
public abstract class AbstractRealDistribution
implements RealDistribution, Serializable {public static class __CLR4_4_17qx7qxlb90p7fv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,10143,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Default accuracy. */
    public static final double SOLVER_DEFAULT_ABSOLUTE_ACCURACY = 1e-6;
    /** Serializable version identifier */
    private static final long serialVersionUID = -38038050983108802L;
     /**
      * RandomData instance used to generate samples from the distribution.
      * @deprecated As of 3.1, to be removed in 4.0. Please use the
      * {@link #random} instance variable instead.
      */
    @Deprecated
    protected RandomDataImpl randomData = new RandomDataImpl();

    /**
     * RNG instance used to generate samples from the distribution.
     * @since 3.1
     */
    protected final RandomGenerator random;

    /** Solver absolute accuracy for inverse cumulative computation */
    private double solverAbsoluteAccuracy = SOLVER_DEFAULT_ABSOLUTE_ACCURACY;

    /**
     * @deprecated As of 3.1, to be removed in 4.0. Please use
     * {@link #AbstractRealDistribution(RandomGenerator)} instead.
     */
    @Deprecated
    protected AbstractRealDistribution() {try{__CLR4_4_17qx7qxlb90p7fv.R.inc(10041);
        // Legacy users are only allowed to access the deprecated "randomData".
        // New users are forbidden to use this constructor.
        __CLR4_4_17qx7qxlb90p7fv.R.inc(10042);random = null;
    }finally{__CLR4_4_17qx7qxlb90p7fv.R.flushNeeded();}}
    /**
     * @param rng Random number generator.
     * @since 3.1
     */
    protected AbstractRealDistribution(RandomGenerator rng) {try{__CLR4_4_17qx7qxlb90p7fv.R.inc(10043);
        __CLR4_4_17qx7qxlb90p7fv.R.inc(10044);random = rng;
    }finally{__CLR4_4_17qx7qxlb90p7fv.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The default implementation uses the identity
     * <p>{@code P(x0 < X <= x1) = P(X <= x1) - P(X <= x0)}</p>
     *
     * @deprecated As of 3.1 (to be removed in 4.0). Please use
     * {@link #probability(double,double)} instead.
     */
    @Deprecated
    public double cumulativeProbability(double x0, double x1) throws NumberIsTooLargeException {try{__CLR4_4_17qx7qxlb90p7fv.R.inc(10045);
        __CLR4_4_17qx7qxlb90p7fv.R.inc(10046);return probability(x0, x1);
    }finally{__CLR4_4_17qx7qxlb90p7fv.R.flushNeeded();}}

    /**
     * For a random variable {@code X} whose values are distributed according
     * to this distribution, this method returns {@code P(x0 < X <= x1)}.
     *
     * @param x0 Lower bound (excluded).
     * @param x1 Upper bound (included).
     * @return the probability that a random variable with this distribution
     * takes a value between {@code x0} and {@code x1}, excluding the lower
     * and including the upper endpoint.
     * @throws NumberIsTooLargeException if {@code x0 > x1}.
     *
     * The default implementation uses the identity
     * {@code P(x0 < X <= x1) = P(X <= x1) - P(X <= x0)}
     *
     * @since 3.1
     */
    public double probability(double x0,
                              double x1) {try{__CLR4_4_17qx7qxlb90p7fv.R.inc(10047);
        __CLR4_4_17qx7qxlb90p7fv.R.inc(10048);if ((((x0 > x1)&&(__CLR4_4_17qx7qxlb90p7fv.R.iget(10049)!=0|true))||(__CLR4_4_17qx7qxlb90p7fv.R.iget(10050)==0&false))) {{
            __CLR4_4_17qx7qxlb90p7fv.R.inc(10051);throw new NumberIsTooLargeException(LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT,
                                                x0, x1, true);
        }
        }__CLR4_4_17qx7qxlb90p7fv.R.inc(10052);return cumulativeProbability(x1) - cumulativeProbability(x0);
    }finally{__CLR4_4_17qx7qxlb90p7fv.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The default implementation returns
     * <ul>
     * <li>{@link #getSupportLowerBound()} for {@code p = 0},</li>
     * <li>{@link #getSupportUpperBound()} for {@code p = 1}.</li>
     * </ul>
     */
    public double inverseCumulativeProbability(final double p) throws OutOfRangeException {try{__CLR4_4_17qx7qxlb90p7fv.R.inc(10053);
        /*
         * IMPLEMENTATION NOTES
         * --------------------
         * Where applicable, use is made of the one-sided Chebyshev inequality
         * to bracket the root. This inequality states that
         * P(X - mu >= k * sig) <= 1 / (1 + k^2),
         * mu: mean, sig: standard deviation. Equivalently
         * 1 - P(X < mu + k * sig) <= 1 / (1 + k^2),
         * F(mu + k * sig) >= k^2 / (1 + k^2).
         *
         * For k = sqrt(p / (1 - p)), we find
         * F(mu + k * sig) >= p,
         * and (mu + k * sig) is an upper-bound for the root.
         *
         * Then, introducing Y = -X, mean(Y) = -mu, sd(Y) = sig, and
         * P(Y >= -mu + k * sig) <= 1 / (1 + k^2),
         * P(-X >= -mu + k * sig) <= 1 / (1 + k^2),
         * P(X <= mu - k * sig) <= 1 / (1 + k^2),
         * F(mu - k * sig) <= 1 / (1 + k^2).
         *
         * For k = sqrt((1 - p) / p), we find
         * F(mu - k * sig) <= p,
         * and (mu - k * sig) is a lower-bound for the root.
         *
         * In cases where the Chebyshev inequality does not apply, geometric
         * progressions 1, 2, 4, ... and -1, -2, -4, ... are used to bracket
         * the root.
         */
        __CLR4_4_17qx7qxlb90p7fv.R.inc(10054);if ((((p < 0.0 || p > 1.0)&&(__CLR4_4_17qx7qxlb90p7fv.R.iget(10055)!=0|true))||(__CLR4_4_17qx7qxlb90p7fv.R.iget(10056)==0&false))) {{
            __CLR4_4_17qx7qxlb90p7fv.R.inc(10057);throw new OutOfRangeException(p, 0, 1);
        }

        }__CLR4_4_17qx7qxlb90p7fv.R.inc(10058);double lowerBound = getSupportLowerBound();
        __CLR4_4_17qx7qxlb90p7fv.R.inc(10059);if ((((p == 0.0)&&(__CLR4_4_17qx7qxlb90p7fv.R.iget(10060)!=0|true))||(__CLR4_4_17qx7qxlb90p7fv.R.iget(10061)==0&false))) {{
            __CLR4_4_17qx7qxlb90p7fv.R.inc(10062);return lowerBound;
        }

        }__CLR4_4_17qx7qxlb90p7fv.R.inc(10063);double upperBound = getSupportUpperBound();
        __CLR4_4_17qx7qxlb90p7fv.R.inc(10064);if ((((p == 1.0)&&(__CLR4_4_17qx7qxlb90p7fv.R.iget(10065)!=0|true))||(__CLR4_4_17qx7qxlb90p7fv.R.iget(10066)==0&false))) {{
            __CLR4_4_17qx7qxlb90p7fv.R.inc(10067);return upperBound;
        }

        }__CLR4_4_17qx7qxlb90p7fv.R.inc(10068);final double mu = getNumericalMean();
        __CLR4_4_17qx7qxlb90p7fv.R.inc(10069);final double sig = FastMath.sqrt(getNumericalVariance());
        __CLR4_4_17qx7qxlb90p7fv.R.inc(10070);final boolean chebyshevApplies;
        __CLR4_4_17qx7qxlb90p7fv.R.inc(10071);chebyshevApplies = !(Double.isInfinite(mu) || Double.isNaN(mu) ||
                             Double.isInfinite(sig) || Double.isNaN(sig));

        __CLR4_4_17qx7qxlb90p7fv.R.inc(10072);if ((((lowerBound == Double.NEGATIVE_INFINITY)&&(__CLR4_4_17qx7qxlb90p7fv.R.iget(10073)!=0|true))||(__CLR4_4_17qx7qxlb90p7fv.R.iget(10074)==0&false))) {{
            __CLR4_4_17qx7qxlb90p7fv.R.inc(10075);if ((((chebyshevApplies)&&(__CLR4_4_17qx7qxlb90p7fv.R.iget(10076)!=0|true))||(__CLR4_4_17qx7qxlb90p7fv.R.iget(10077)==0&false))) {{
                __CLR4_4_17qx7qxlb90p7fv.R.inc(10078);lowerBound = mu - sig * FastMath.sqrt((1. - p) / p);
            } }else {{
                __CLR4_4_17qx7qxlb90p7fv.R.inc(10079);lowerBound = -1.0;
                __CLR4_4_17qx7qxlb90p7fv.R.inc(10080);while ((((cumulativeProbability(lowerBound) >= p)&&(__CLR4_4_17qx7qxlb90p7fv.R.iget(10081)!=0|true))||(__CLR4_4_17qx7qxlb90p7fv.R.iget(10082)==0&false))) {{
                    __CLR4_4_17qx7qxlb90p7fv.R.inc(10083);lowerBound *= 2.0;
                }
            }}
        }}

        }__CLR4_4_17qx7qxlb90p7fv.R.inc(10084);if ((((upperBound == Double.POSITIVE_INFINITY)&&(__CLR4_4_17qx7qxlb90p7fv.R.iget(10085)!=0|true))||(__CLR4_4_17qx7qxlb90p7fv.R.iget(10086)==0&false))) {{
            __CLR4_4_17qx7qxlb90p7fv.R.inc(10087);if ((((chebyshevApplies)&&(__CLR4_4_17qx7qxlb90p7fv.R.iget(10088)!=0|true))||(__CLR4_4_17qx7qxlb90p7fv.R.iget(10089)==0&false))) {{
                __CLR4_4_17qx7qxlb90p7fv.R.inc(10090);upperBound = mu + sig * FastMath.sqrt(p / (1. - p));
            } }else {{
                __CLR4_4_17qx7qxlb90p7fv.R.inc(10091);upperBound = 1.0;
                __CLR4_4_17qx7qxlb90p7fv.R.inc(10092);while ((((cumulativeProbability(upperBound) < p)&&(__CLR4_4_17qx7qxlb90p7fv.R.iget(10093)!=0|true))||(__CLR4_4_17qx7qxlb90p7fv.R.iget(10094)==0&false))) {{
                    __CLR4_4_17qx7qxlb90p7fv.R.inc(10095);upperBound *= 2.0;
                }
            }}
        }}

        }__CLR4_4_17qx7qxlb90p7fv.R.inc(10096);final UnivariateFunction toSolve = new UnivariateFunction() {

            public double value(final double x) {try{__CLR4_4_17qx7qxlb90p7fv.R.inc(10097);
                __CLR4_4_17qx7qxlb90p7fv.R.inc(10098);return cumulativeProbability(x) - p;
            }finally{__CLR4_4_17qx7qxlb90p7fv.R.flushNeeded();}}
        };

        __CLR4_4_17qx7qxlb90p7fv.R.inc(10099);double x = UnivariateSolverUtils.solve(toSolve,
                                                   lowerBound,
                                                   upperBound,
                                                   getSolverAbsoluteAccuracy());

        __CLR4_4_17qx7qxlb90p7fv.R.inc(10100);if ((((!isSupportConnected())&&(__CLR4_4_17qx7qxlb90p7fv.R.iget(10101)!=0|true))||(__CLR4_4_17qx7qxlb90p7fv.R.iget(10102)==0&false))) {{
            /* Test for plateau. */
            __CLR4_4_17qx7qxlb90p7fv.R.inc(10103);final double dx = getSolverAbsoluteAccuracy();
            __CLR4_4_17qx7qxlb90p7fv.R.inc(10104);if ((((x - dx >= getSupportLowerBound())&&(__CLR4_4_17qx7qxlb90p7fv.R.iget(10105)!=0|true))||(__CLR4_4_17qx7qxlb90p7fv.R.iget(10106)==0&false))) {{
                __CLR4_4_17qx7qxlb90p7fv.R.inc(10107);double px = cumulativeProbability(x);
                __CLR4_4_17qx7qxlb90p7fv.R.inc(10108);if ((((cumulativeProbability(x - dx) == px)&&(__CLR4_4_17qx7qxlb90p7fv.R.iget(10109)!=0|true))||(__CLR4_4_17qx7qxlb90p7fv.R.iget(10110)==0&false))) {{
                    __CLR4_4_17qx7qxlb90p7fv.R.inc(10111);upperBound = x;
                    __CLR4_4_17qx7qxlb90p7fv.R.inc(10112);while ((((upperBound - lowerBound > dx)&&(__CLR4_4_17qx7qxlb90p7fv.R.iget(10113)!=0|true))||(__CLR4_4_17qx7qxlb90p7fv.R.iget(10114)==0&false))) {{
                        __CLR4_4_17qx7qxlb90p7fv.R.inc(10115);final double midPoint = 0.5 * (lowerBound + upperBound);
                        __CLR4_4_17qx7qxlb90p7fv.R.inc(10116);if ((((cumulativeProbability(midPoint) < px)&&(__CLR4_4_17qx7qxlb90p7fv.R.iget(10117)!=0|true))||(__CLR4_4_17qx7qxlb90p7fv.R.iget(10118)==0&false))) {{
                            __CLR4_4_17qx7qxlb90p7fv.R.inc(10119);lowerBound = midPoint;
                        } }else {{
                            __CLR4_4_17qx7qxlb90p7fv.R.inc(10120);upperBound = midPoint;
                        }
                    }}
                    }__CLR4_4_17qx7qxlb90p7fv.R.inc(10121);return upperBound;
                }
            }}
        }}
        }__CLR4_4_17qx7qxlb90p7fv.R.inc(10122);return x;
    }finally{__CLR4_4_17qx7qxlb90p7fv.R.flushNeeded();}}

    /**
     * Returns the solver absolute accuracy for inverse cumulative computation.
     * You can override this method in order to use a Brent solver with an
     * absolute accuracy different from the default.
     *
     * @return the maximum absolute error in inverse cumulative probability estimates
     */
    protected double getSolverAbsoluteAccuracy() {try{__CLR4_4_17qx7qxlb90p7fv.R.inc(10123);
        __CLR4_4_17qx7qxlb90p7fv.R.inc(10124);return solverAbsoluteAccuracy;
    }finally{__CLR4_4_17qx7qxlb90p7fv.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void reseedRandomGenerator(long seed) {try{__CLR4_4_17qx7qxlb90p7fv.R.inc(10125);
        __CLR4_4_17qx7qxlb90p7fv.R.inc(10126);random.setSeed(seed);
        __CLR4_4_17qx7qxlb90p7fv.R.inc(10127);randomData.reSeed(seed);
    }finally{__CLR4_4_17qx7qxlb90p7fv.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The default implementation uses the
     * <a href="http://en.wikipedia.org/wiki/Inverse_transform_sampling">
     * inversion method.
     * </a>
     */
    public double sample() {try{__CLR4_4_17qx7qxlb90p7fv.R.inc(10128);
        __CLR4_4_17qx7qxlb90p7fv.R.inc(10129);return inverseCumulativeProbability(random.nextDouble());
    }finally{__CLR4_4_17qx7qxlb90p7fv.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The default implementation generates the sample by calling
     * {@link #sample()} in a loop.
     */
    public double[] sample(int sampleSize) {try{__CLR4_4_17qx7qxlb90p7fv.R.inc(10130);
        __CLR4_4_17qx7qxlb90p7fv.R.inc(10131);if ((((sampleSize <= 0)&&(__CLR4_4_17qx7qxlb90p7fv.R.iget(10132)!=0|true))||(__CLR4_4_17qx7qxlb90p7fv.R.iget(10133)==0&false))) {{
            __CLR4_4_17qx7qxlb90p7fv.R.inc(10134);throw new NotStrictlyPositiveException(LocalizedFormats.NUMBER_OF_SAMPLES,
                    sampleSize);
        }
        }__CLR4_4_17qx7qxlb90p7fv.R.inc(10135);double[] out = new double[sampleSize];
        __CLR4_4_17qx7qxlb90p7fv.R.inc(10136);for (int i = 0; (((i < sampleSize)&&(__CLR4_4_17qx7qxlb90p7fv.R.iget(10137)!=0|true))||(__CLR4_4_17qx7qxlb90p7fv.R.iget(10138)==0&false)); i++) {{
            __CLR4_4_17qx7qxlb90p7fv.R.inc(10139);out[i] = sample();
        }
        }__CLR4_4_17qx7qxlb90p7fv.R.inc(10140);return out;
    }finally{__CLR4_4_17qx7qxlb90p7fv.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * @return zero.
     * @since 3.1
     */
    public double probability(double x) {try{__CLR4_4_17qx7qxlb90p7fv.R.inc(10141);
        __CLR4_4_17qx7qxlb90p7fv.R.inc(10142);return 0d;
    }finally{__CLR4_4_17qx7qxlb90p7fv.R.flushNeeded();}}
}

