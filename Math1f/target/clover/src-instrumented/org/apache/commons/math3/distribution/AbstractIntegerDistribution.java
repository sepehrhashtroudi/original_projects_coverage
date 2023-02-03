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

import org.apache.commons.math3.exception.MathInternalError;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.RandomDataImpl;
import org.apache.commons.math3.util.FastMath;

/**
 * Base class for integer-valued discrete distributions.  Default
 * implementations are provided for some of the methods that do not vary
 * from distribution to distribution.
 *
 * @version $Id$
 */
public abstract class AbstractIntegerDistribution implements IntegerDistribution, Serializable {public static class __CLR4_4_17nv7nvlb90p7fj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,10023,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier */
    private static final long serialVersionUID = -1146319659338487221L;

    /**
     * RandomData instance used to generate samples from the distribution.
     * @deprecated As of 3.1, to be removed in 4.0. Please use the
     * {@link #random} instance variable instead.
     */
    @Deprecated
    protected final RandomDataImpl randomData = new RandomDataImpl();

    /**
     * RNG instance used to generate samples from the distribution.
     * @since 3.1
     */
    protected final RandomGenerator random;

    /**
     * @deprecated As of 3.1, to be removed in 4.0. Please use
     * {@link #AbstractIntegerDistribution(RandomGenerator)} instead.
     */
    @Deprecated
    protected AbstractIntegerDistribution() {try{__CLR4_4_17nv7nvlb90p7fj.R.inc(9931);
        // Legacy users are only allowed to access the deprecated "randomData".
        // New users are forbidden to use this constructor.
        __CLR4_4_17nv7nvlb90p7fj.R.inc(9932);random = null;
    }finally{__CLR4_4_17nv7nvlb90p7fj.R.flushNeeded();}}

    /**
     * @param rng Random number generator.
     * @since 3.1
     */
    protected AbstractIntegerDistribution(RandomGenerator rng) {try{__CLR4_4_17nv7nvlb90p7fj.R.inc(9933);
        __CLR4_4_17nv7nvlb90p7fj.R.inc(9934);random = rng;
    }finally{__CLR4_4_17nv7nvlb90p7fj.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The default implementation uses the identity
     * <p>{@code P(x0 < X <= x1) = P(X <= x1) - P(X <= x0)}</p>
     */
    public double cumulativeProbability(int x0, int x1) throws NumberIsTooLargeException {try{__CLR4_4_17nv7nvlb90p7fj.R.inc(9935);
        __CLR4_4_17nv7nvlb90p7fj.R.inc(9936);if ((((x1 < x0)&&(__CLR4_4_17nv7nvlb90p7fj.R.iget(9937)!=0|true))||(__CLR4_4_17nv7nvlb90p7fj.R.iget(9938)==0&false))) {{
            __CLR4_4_17nv7nvlb90p7fj.R.inc(9939);throw new NumberIsTooLargeException(LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT,
                    x0, x1, true);
        }
        }__CLR4_4_17nv7nvlb90p7fj.R.inc(9940);return cumulativeProbability(x1) - cumulativeProbability(x0);
    }finally{__CLR4_4_17nv7nvlb90p7fj.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The default implementation returns
     * <ul>
     * <li>{@link #getSupportLowerBound()} for {@code p = 0},</li>
     * <li>{@link #getSupportUpperBound()} for {@code p = 1}, and</li>
     * <li>{@link #solveInverseCumulativeProbability(double, int, int)} for
     *     {@code 0 < p < 1}.</li>
     * </ul>
     */
    public int inverseCumulativeProbability(final double p) throws OutOfRangeException {try{__CLR4_4_17nv7nvlb90p7fj.R.inc(9941);
        __CLR4_4_17nv7nvlb90p7fj.R.inc(9942);if ((((p < 0.0 || p > 1.0)&&(__CLR4_4_17nv7nvlb90p7fj.R.iget(9943)!=0|true))||(__CLR4_4_17nv7nvlb90p7fj.R.iget(9944)==0&false))) {{
            __CLR4_4_17nv7nvlb90p7fj.R.inc(9945);throw new OutOfRangeException(p, 0, 1);
        }

        }__CLR4_4_17nv7nvlb90p7fj.R.inc(9946);int lower = getSupportLowerBound();
        __CLR4_4_17nv7nvlb90p7fj.R.inc(9947);if ((((p == 0.0)&&(__CLR4_4_17nv7nvlb90p7fj.R.iget(9948)!=0|true))||(__CLR4_4_17nv7nvlb90p7fj.R.iget(9949)==0&false))) {{
            __CLR4_4_17nv7nvlb90p7fj.R.inc(9950);return lower;
        }
        }__CLR4_4_17nv7nvlb90p7fj.R.inc(9951);if ((((lower == Integer.MIN_VALUE)&&(__CLR4_4_17nv7nvlb90p7fj.R.iget(9952)!=0|true))||(__CLR4_4_17nv7nvlb90p7fj.R.iget(9953)==0&false))) {{
            __CLR4_4_17nv7nvlb90p7fj.R.inc(9954);if ((((checkedCumulativeProbability(lower) >= p)&&(__CLR4_4_17nv7nvlb90p7fj.R.iget(9955)!=0|true))||(__CLR4_4_17nv7nvlb90p7fj.R.iget(9956)==0&false))) {{
                __CLR4_4_17nv7nvlb90p7fj.R.inc(9957);return lower;
            }
        }} }else {{
            __CLR4_4_17nv7nvlb90p7fj.R.inc(9958);lower -= 1; // this ensures cumulativeProbability(lower) < p, which
                        // is important for the solving step
        }

        }__CLR4_4_17nv7nvlb90p7fj.R.inc(9959);int upper = getSupportUpperBound();
        __CLR4_4_17nv7nvlb90p7fj.R.inc(9960);if ((((p == 1.0)&&(__CLR4_4_17nv7nvlb90p7fj.R.iget(9961)!=0|true))||(__CLR4_4_17nv7nvlb90p7fj.R.iget(9962)==0&false))) {{
            __CLR4_4_17nv7nvlb90p7fj.R.inc(9963);return upper;
        }

        // use the one-sided Chebyshev inequality to narrow the bracket
        // cf. AbstractRealDistribution.inverseCumulativeProbability(double)
        }__CLR4_4_17nv7nvlb90p7fj.R.inc(9964);final double mu = getNumericalMean();
        __CLR4_4_17nv7nvlb90p7fj.R.inc(9965);final double sigma = FastMath.sqrt(getNumericalVariance());
        __CLR4_4_17nv7nvlb90p7fj.R.inc(9966);final boolean chebyshevApplies = !(Double.isInfinite(mu) || Double.isNaN(mu) ||
                Double.isInfinite(sigma) || Double.isNaN(sigma) || sigma == 0.0);
        __CLR4_4_17nv7nvlb90p7fj.R.inc(9967);if ((((chebyshevApplies)&&(__CLR4_4_17nv7nvlb90p7fj.R.iget(9968)!=0|true))||(__CLR4_4_17nv7nvlb90p7fj.R.iget(9969)==0&false))) {{
            __CLR4_4_17nv7nvlb90p7fj.R.inc(9970);double k = FastMath.sqrt((1.0 - p) / p);
            __CLR4_4_17nv7nvlb90p7fj.R.inc(9971);double tmp = mu - k * sigma;
            __CLR4_4_17nv7nvlb90p7fj.R.inc(9972);if ((((tmp > lower)&&(__CLR4_4_17nv7nvlb90p7fj.R.iget(9973)!=0|true))||(__CLR4_4_17nv7nvlb90p7fj.R.iget(9974)==0&false))) {{
                __CLR4_4_17nv7nvlb90p7fj.R.inc(9975);lower = ((int) Math.ceil(tmp)) - 1;
            }
            }__CLR4_4_17nv7nvlb90p7fj.R.inc(9976);k = 1.0 / k;
            __CLR4_4_17nv7nvlb90p7fj.R.inc(9977);tmp = mu + k * sigma;
            __CLR4_4_17nv7nvlb90p7fj.R.inc(9978);if ((((tmp < upper)&&(__CLR4_4_17nv7nvlb90p7fj.R.iget(9979)!=0|true))||(__CLR4_4_17nv7nvlb90p7fj.R.iget(9980)==0&false))) {{
                __CLR4_4_17nv7nvlb90p7fj.R.inc(9981);upper = ((int) Math.ceil(tmp)) - 1;
            }
        }}

        }__CLR4_4_17nv7nvlb90p7fj.R.inc(9982);return solveInverseCumulativeProbability(p, lower, upper);
    }finally{__CLR4_4_17nv7nvlb90p7fj.R.flushNeeded();}}

    /**
     * This is a utility function used by {@link
     * #inverseCumulativeProbability(double)}. It assumes {@code 0 < p < 1} and
     * that the inverse cumulative probability lies in the bracket {@code
     * (lower, upper]}. The implementation does simple bisection to find the
     * smallest {@code p}-quantile <code>inf{x in Z | P(X<=x) >= p}</code>.
     *
     * @param p the cumulative probability
     * @param lower a value satisfying {@code cumulativeProbability(lower) < p}
     * @param upper a value satisfying {@code p <= cumulativeProbability(upper)}
     * @return the smallest {@code p}-quantile of this distribution
     */
    protected int solveInverseCumulativeProbability(final double p, int lower, int upper) {try{__CLR4_4_17nv7nvlb90p7fj.R.inc(9983);
        __CLR4_4_17nv7nvlb90p7fj.R.inc(9984);while ((((lower + 1 < upper)&&(__CLR4_4_17nv7nvlb90p7fj.R.iget(9985)!=0|true))||(__CLR4_4_17nv7nvlb90p7fj.R.iget(9986)==0&false))) {{
            __CLR4_4_17nv7nvlb90p7fj.R.inc(9987);int xm = (lower + upper) / 2;
            __CLR4_4_17nv7nvlb90p7fj.R.inc(9988);if ((((xm < lower || xm > upper)&&(__CLR4_4_17nv7nvlb90p7fj.R.iget(9989)!=0|true))||(__CLR4_4_17nv7nvlb90p7fj.R.iget(9990)==0&false))) {{
                /*
                 * Overflow.
                 * There will never be an overflow in both calculation methods
                 * for xm at the same time
                 */
                __CLR4_4_17nv7nvlb90p7fj.R.inc(9991);xm = lower + (upper - lower) / 2;
            }

            }__CLR4_4_17nv7nvlb90p7fj.R.inc(9992);double pm = checkedCumulativeProbability(xm);
            __CLR4_4_17nv7nvlb90p7fj.R.inc(9993);if ((((pm >= p)&&(__CLR4_4_17nv7nvlb90p7fj.R.iget(9994)!=0|true))||(__CLR4_4_17nv7nvlb90p7fj.R.iget(9995)==0&false))) {{
                __CLR4_4_17nv7nvlb90p7fj.R.inc(9996);upper = xm;
            } }else {{
                __CLR4_4_17nv7nvlb90p7fj.R.inc(9997);lower = xm;
            }
        }}
        }__CLR4_4_17nv7nvlb90p7fj.R.inc(9998);return upper;
    }finally{__CLR4_4_17nv7nvlb90p7fj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void reseedRandomGenerator(long seed) {try{__CLR4_4_17nv7nvlb90p7fj.R.inc(9999);
        __CLR4_4_17nv7nvlb90p7fj.R.inc(10000);random.setSeed(seed);
        __CLR4_4_17nv7nvlb90p7fj.R.inc(10001);randomData.reSeed(seed);
    }finally{__CLR4_4_17nv7nvlb90p7fj.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The default implementation uses the
     * <a href="http://en.wikipedia.org/wiki/Inverse_transform_sampling">
     * inversion method</a>.
     */
    public int sample() {try{__CLR4_4_17nv7nvlb90p7fj.R.inc(10002);
        __CLR4_4_17nv7nvlb90p7fj.R.inc(10003);return inverseCumulativeProbability(random.nextDouble());
    }finally{__CLR4_4_17nv7nvlb90p7fj.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The default implementation generates the sample by calling
     * {@link #sample()} in a loop.
     */
    public int[] sample(int sampleSize) {try{__CLR4_4_17nv7nvlb90p7fj.R.inc(10004);
        __CLR4_4_17nv7nvlb90p7fj.R.inc(10005);if ((((sampleSize <= 0)&&(__CLR4_4_17nv7nvlb90p7fj.R.iget(10006)!=0|true))||(__CLR4_4_17nv7nvlb90p7fj.R.iget(10007)==0&false))) {{
            __CLR4_4_17nv7nvlb90p7fj.R.inc(10008);throw new NotStrictlyPositiveException(
                    LocalizedFormats.NUMBER_OF_SAMPLES, sampleSize);
        }
        }__CLR4_4_17nv7nvlb90p7fj.R.inc(10009);int[] out = new int[sampleSize];
        __CLR4_4_17nv7nvlb90p7fj.R.inc(10010);for (int i = 0; (((i < sampleSize)&&(__CLR4_4_17nv7nvlb90p7fj.R.iget(10011)!=0|true))||(__CLR4_4_17nv7nvlb90p7fj.R.iget(10012)==0&false)); i++) {{
            __CLR4_4_17nv7nvlb90p7fj.R.inc(10013);out[i] = sample();
        }
        }__CLR4_4_17nv7nvlb90p7fj.R.inc(10014);return out;
    }finally{__CLR4_4_17nv7nvlb90p7fj.R.flushNeeded();}}

    /**
     * Computes the cumulative probability function and checks for {@code NaN}
     * values returned. Throws {@code MathInternalError} if the value is
     * {@code NaN}. Rethrows any exception encountered evaluating the cumulative
     * probability function. Throws {@code MathInternalError} if the cumulative
     * probability function returns {@code NaN}.
     *
     * @param argument input value
     * @return the cumulative probability
     * @throws MathInternalError if the cumulative probability is {@code NaN}
     */
    private double checkedCumulativeProbability(int argument)
        throws MathInternalError {try{__CLR4_4_17nv7nvlb90p7fj.R.inc(10015);
        __CLR4_4_17nv7nvlb90p7fj.R.inc(10016);double result = Double.NaN;
        __CLR4_4_17nv7nvlb90p7fj.R.inc(10017);result = cumulativeProbability(argument);
        __CLR4_4_17nv7nvlb90p7fj.R.inc(10018);if ((((Double.isNaN(result))&&(__CLR4_4_17nv7nvlb90p7fj.R.iget(10019)!=0|true))||(__CLR4_4_17nv7nvlb90p7fj.R.iget(10020)==0&false))) {{
            __CLR4_4_17nv7nvlb90p7fj.R.inc(10021);throw new MathInternalError(LocalizedFormats
                    .DISCRETE_CUMULATIVE_PROBABILITY_RETURNED_NAN, argument);
        }
        }__CLR4_4_17nv7nvlb90p7fj.R.inc(10022);return result;
    }finally{__CLR4_4_17nv7nvlb90p7fj.R.flushNeeded();}}
}
