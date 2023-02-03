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

import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;

/**
 * Implementation of the hypergeometric distribution.
 *
 * @see <a href="http://en.wikipedia.org/wiki/Hypergeometric_distribution">Hypergeometric distribution (Wikipedia)</a>
 * @see <a href="http://mathworld.wolfram.com/HypergeometricDistribution.html">Hypergeometric distribution (MathWorld)</a>
 * @version $Id$
 */
public class HypergeometricDistribution extends AbstractIntegerDistribution {public static class __CLR4_4_18ee8eelb90p7ia{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,10993,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Serializable version identifier. */
    private static final long serialVersionUID = -436928820673516179L;
    /** The number of successes in the population. */
    private final int numberOfSuccesses;
    /** The population size. */
    private final int populationSize;
    /** The sample size. */
    private final int sampleSize;
    /** Cached numerical variance */
    private double numericalVariance = Double.NaN;
    /** Whether or not the numerical variance has been calculated */
    private boolean numericalVarianceIsCalculated = false;

    /**
     * Construct a new hypergeometric distribution with the specified population
     * size, number of successes in the population, and sample size.
     *
     * @param populationSize Population size.
     * @param numberOfSuccesses Number of successes in the population.
     * @param sampleSize Sample size.
     * @throws NotPositiveException if {@code numberOfSuccesses < 0}.
     * @throws NotStrictlyPositiveException if {@code populationSize <= 0}.
     * @throws NumberIsTooLargeException if {@code numberOfSuccesses > populationSize},
     * or {@code sampleSize > populationSize}.
     */
    public HypergeometricDistribution(int populationSize, int numberOfSuccesses, int sampleSize)
    throws NotPositiveException, NotStrictlyPositiveException, NumberIsTooLargeException {
        this(new Well19937c(), populationSize, numberOfSuccesses, sampleSize);__CLR4_4_18ee8eelb90p7ia.R.inc(10887);try{__CLR4_4_18ee8eelb90p7ia.R.inc(10886);
    }finally{__CLR4_4_18ee8eelb90p7ia.R.flushNeeded();}}

    /**
     * Creates a new hypergeometric distribution.
     *
     * @param rng Random number generator.
     * @param populationSize Population size.
     * @param numberOfSuccesses Number of successes in the population.
     * @param sampleSize Sample size.
     * @throws NotPositiveException if {@code numberOfSuccesses < 0}.
     * @throws NotStrictlyPositiveException if {@code populationSize <= 0}.
     * @throws NumberIsTooLargeException if {@code numberOfSuccesses > populationSize},
     * or {@code sampleSize > populationSize}.
     * @since 3.1
     */
    public HypergeometricDistribution(RandomGenerator rng,
                                      int populationSize,
                                      int numberOfSuccesses,
                                      int sampleSize)
    throws NotPositiveException, NotStrictlyPositiveException, NumberIsTooLargeException {
        super(rng);__CLR4_4_18ee8eelb90p7ia.R.inc(10889);try{__CLR4_4_18ee8eelb90p7ia.R.inc(10888);

        __CLR4_4_18ee8eelb90p7ia.R.inc(10890);if ((((populationSize <= 0)&&(__CLR4_4_18ee8eelb90p7ia.R.iget(10891)!=0|true))||(__CLR4_4_18ee8eelb90p7ia.R.iget(10892)==0&false))) {{
            __CLR4_4_18ee8eelb90p7ia.R.inc(10893);throw new NotStrictlyPositiveException(LocalizedFormats.POPULATION_SIZE,
                                                   populationSize);
        }
        }__CLR4_4_18ee8eelb90p7ia.R.inc(10894);if ((((numberOfSuccesses < 0)&&(__CLR4_4_18ee8eelb90p7ia.R.iget(10895)!=0|true))||(__CLR4_4_18ee8eelb90p7ia.R.iget(10896)==0&false))) {{
            __CLR4_4_18ee8eelb90p7ia.R.inc(10897);throw new NotPositiveException(LocalizedFormats.NUMBER_OF_SUCCESSES,
                                           numberOfSuccesses);
        }
        }__CLR4_4_18ee8eelb90p7ia.R.inc(10898);if ((((sampleSize < 0)&&(__CLR4_4_18ee8eelb90p7ia.R.iget(10899)!=0|true))||(__CLR4_4_18ee8eelb90p7ia.R.iget(10900)==0&false))) {{
            __CLR4_4_18ee8eelb90p7ia.R.inc(10901);throw new NotPositiveException(LocalizedFormats.NUMBER_OF_SAMPLES,
                                           sampleSize);
        }

        }__CLR4_4_18ee8eelb90p7ia.R.inc(10902);if ((((numberOfSuccesses > populationSize)&&(__CLR4_4_18ee8eelb90p7ia.R.iget(10903)!=0|true))||(__CLR4_4_18ee8eelb90p7ia.R.iget(10904)==0&false))) {{
            __CLR4_4_18ee8eelb90p7ia.R.inc(10905);throw new NumberIsTooLargeException(LocalizedFormats.NUMBER_OF_SUCCESS_LARGER_THAN_POPULATION_SIZE,
                                                numberOfSuccesses, populationSize, true);
        }
        }__CLR4_4_18ee8eelb90p7ia.R.inc(10906);if ((((sampleSize > populationSize)&&(__CLR4_4_18ee8eelb90p7ia.R.iget(10907)!=0|true))||(__CLR4_4_18ee8eelb90p7ia.R.iget(10908)==0&false))) {{
            __CLR4_4_18ee8eelb90p7ia.R.inc(10909);throw new NumberIsTooLargeException(LocalizedFormats.SAMPLE_SIZE_LARGER_THAN_POPULATION_SIZE,
                                                sampleSize, populationSize, true);
        }

        }__CLR4_4_18ee8eelb90p7ia.R.inc(10910);this.numberOfSuccesses = numberOfSuccesses;
        __CLR4_4_18ee8eelb90p7ia.R.inc(10911);this.populationSize = populationSize;
        __CLR4_4_18ee8eelb90p7ia.R.inc(10912);this.sampleSize = sampleSize;
    }finally{__CLR4_4_18ee8eelb90p7ia.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double cumulativeProbability(int x) {try{__CLR4_4_18ee8eelb90p7ia.R.inc(10913);
        __CLR4_4_18ee8eelb90p7ia.R.inc(10914);double ret;

        __CLR4_4_18ee8eelb90p7ia.R.inc(10915);int[] domain = getDomain(populationSize, numberOfSuccesses, sampleSize);
        __CLR4_4_18ee8eelb90p7ia.R.inc(10916);if ((((x < domain[0])&&(__CLR4_4_18ee8eelb90p7ia.R.iget(10917)!=0|true))||(__CLR4_4_18ee8eelb90p7ia.R.iget(10918)==0&false))) {{
            __CLR4_4_18ee8eelb90p7ia.R.inc(10919);ret = 0.0;
        } }else {__CLR4_4_18ee8eelb90p7ia.R.inc(10920);if ((((x >= domain[1])&&(__CLR4_4_18ee8eelb90p7ia.R.iget(10921)!=0|true))||(__CLR4_4_18ee8eelb90p7ia.R.iget(10922)==0&false))) {{
            __CLR4_4_18ee8eelb90p7ia.R.inc(10923);ret = 1.0;
        } }else {{
            __CLR4_4_18ee8eelb90p7ia.R.inc(10924);ret = innerCumulativeProbability(domain[0], x, 1);
        }

        }}__CLR4_4_18ee8eelb90p7ia.R.inc(10925);return ret;
    }finally{__CLR4_4_18ee8eelb90p7ia.R.flushNeeded();}}

    /**
     * Return the domain for the given hypergeometric distribution parameters.
     *
     * @param n Population size.
     * @param m Number of successes in the population.
     * @param k Sample size.
     * @return a two element array containing the lower and upper bounds of the
     * hypergeometric distribution.
     */
    private int[] getDomain(int n, int m, int k) {try{__CLR4_4_18ee8eelb90p7ia.R.inc(10926);
        __CLR4_4_18ee8eelb90p7ia.R.inc(10927);return new int[] { getLowerDomain(n, m, k), getUpperDomain(m, k) };
    }finally{__CLR4_4_18ee8eelb90p7ia.R.flushNeeded();}}

    /**
     * Return the lowest domain value for the given hypergeometric distribution
     * parameters.
     *
     * @param n Population size.
     * @param m Number of successes in the population.
     * @param k Sample size.
     * @return the lowest domain value of the hypergeometric distribution.
     */
    private int getLowerDomain(int n, int m, int k) {try{__CLR4_4_18ee8eelb90p7ia.R.inc(10928);
        __CLR4_4_18ee8eelb90p7ia.R.inc(10929);return FastMath.max(0, m - (n - k));
    }finally{__CLR4_4_18ee8eelb90p7ia.R.flushNeeded();}}

    /**
     * Access the number of successes.
     *
     * @return the number of successes.
     */
    public int getNumberOfSuccesses() {try{__CLR4_4_18ee8eelb90p7ia.R.inc(10930);
        __CLR4_4_18ee8eelb90p7ia.R.inc(10931);return numberOfSuccesses;
    }finally{__CLR4_4_18ee8eelb90p7ia.R.flushNeeded();}}

    /**
     * Access the population size.
     *
     * @return the population size.
     */
    public int getPopulationSize() {try{__CLR4_4_18ee8eelb90p7ia.R.inc(10932);
        __CLR4_4_18ee8eelb90p7ia.R.inc(10933);return populationSize;
    }finally{__CLR4_4_18ee8eelb90p7ia.R.flushNeeded();}}

    /**
     * Access the sample size.
     *
     * @return the sample size.
     */
    public int getSampleSize() {try{__CLR4_4_18ee8eelb90p7ia.R.inc(10934);
        __CLR4_4_18ee8eelb90p7ia.R.inc(10935);return sampleSize;
    }finally{__CLR4_4_18ee8eelb90p7ia.R.flushNeeded();}}

    /**
     * Return the highest domain value for the given hypergeometric distribution
     * parameters.
     *
     * @param m Number of successes in the population.
     * @param k Sample size.
     * @return the highest domain value of the hypergeometric distribution.
     */
    private int getUpperDomain(int m, int k) {try{__CLR4_4_18ee8eelb90p7ia.R.inc(10936);
        __CLR4_4_18ee8eelb90p7ia.R.inc(10937);return FastMath.min(k, m);
    }finally{__CLR4_4_18ee8eelb90p7ia.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double probability(int x) {try{__CLR4_4_18ee8eelb90p7ia.R.inc(10938);
        __CLR4_4_18ee8eelb90p7ia.R.inc(10939);double ret;

        __CLR4_4_18ee8eelb90p7ia.R.inc(10940);int[] domain = getDomain(populationSize, numberOfSuccesses, sampleSize);
        __CLR4_4_18ee8eelb90p7ia.R.inc(10941);if ((((x < domain[0] || x > domain[1])&&(__CLR4_4_18ee8eelb90p7ia.R.iget(10942)!=0|true))||(__CLR4_4_18ee8eelb90p7ia.R.iget(10943)==0&false))) {{
            __CLR4_4_18ee8eelb90p7ia.R.inc(10944);ret = 0.0;
        } }else {{
            __CLR4_4_18ee8eelb90p7ia.R.inc(10945);double p = (double) sampleSize / (double) populationSize;
            __CLR4_4_18ee8eelb90p7ia.R.inc(10946);double q = (double) (populationSize - sampleSize) / (double) populationSize;
            __CLR4_4_18ee8eelb90p7ia.R.inc(10947);double p1 = SaddlePointExpansion.logBinomialProbability(x,
                    numberOfSuccesses, p, q);
            __CLR4_4_18ee8eelb90p7ia.R.inc(10948);double p2 =
                SaddlePointExpansion.logBinomialProbability(sampleSize - x,
                    populationSize - numberOfSuccesses, p, q);
            __CLR4_4_18ee8eelb90p7ia.R.inc(10949);double p3 =
                SaddlePointExpansion.logBinomialProbability(sampleSize, populationSize, p, q);
            __CLR4_4_18ee8eelb90p7ia.R.inc(10950);ret = FastMath.exp(p1 + p2 - p3);
        }

        }__CLR4_4_18ee8eelb90p7ia.R.inc(10951);return ret;
    }finally{__CLR4_4_18ee8eelb90p7ia.R.flushNeeded();}}

    /**
     * For this distribution, {@code X}, this method returns {@code P(X >= x)}.
     *
     * @param x Value at which the CDF is evaluated.
     * @return the upper tail CDF for this distribution.
     * @since 1.1
     */
    public double upperCumulativeProbability(int x) {try{__CLR4_4_18ee8eelb90p7ia.R.inc(10952);
        __CLR4_4_18ee8eelb90p7ia.R.inc(10953);double ret;

        __CLR4_4_18ee8eelb90p7ia.R.inc(10954);final int[] domain = getDomain(populationSize, numberOfSuccesses, sampleSize);
        __CLR4_4_18ee8eelb90p7ia.R.inc(10955);if ((((x <= domain[0])&&(__CLR4_4_18ee8eelb90p7ia.R.iget(10956)!=0|true))||(__CLR4_4_18ee8eelb90p7ia.R.iget(10957)==0&false))) {{
            __CLR4_4_18ee8eelb90p7ia.R.inc(10958);ret = 1.0;
        } }else {__CLR4_4_18ee8eelb90p7ia.R.inc(10959);if ((((x > domain[1])&&(__CLR4_4_18ee8eelb90p7ia.R.iget(10960)!=0|true))||(__CLR4_4_18ee8eelb90p7ia.R.iget(10961)==0&false))) {{
            __CLR4_4_18ee8eelb90p7ia.R.inc(10962);ret = 0.0;
        } }else {{
            __CLR4_4_18ee8eelb90p7ia.R.inc(10963);ret = innerCumulativeProbability(domain[1], x, -1);
        }

        }}__CLR4_4_18ee8eelb90p7ia.R.inc(10964);return ret;
    }finally{__CLR4_4_18ee8eelb90p7ia.R.flushNeeded();}}

    /**
     * For this distribution, {@code X}, this method returns
     * {@code P(x0 <= X <= x1)}.
     * This probability is computed by summing the point probabilities for the
     * values {@code x0, x0 + 1, x0 + 2, ..., x1}, in the order directed by
     * {@code dx}.
     *
     * @param x0 Inclusive lower bound.
     * @param x1 Inclusive upper bound.
     * @param dx Direction of summation (1 indicates summing from x0 to x1, and
     * 0 indicates summing from x1 to x0).
     * @return {@code P(x0 <= X <= x1)}.
     */
    private double innerCumulativeProbability(int x0, int x1, int dx) {try{__CLR4_4_18ee8eelb90p7ia.R.inc(10965);
        __CLR4_4_18ee8eelb90p7ia.R.inc(10966);double ret = probability(x0);
        __CLR4_4_18ee8eelb90p7ia.R.inc(10967);while ((((x0 != x1)&&(__CLR4_4_18ee8eelb90p7ia.R.iget(10968)!=0|true))||(__CLR4_4_18ee8eelb90p7ia.R.iget(10969)==0&false))) {{
            __CLR4_4_18ee8eelb90p7ia.R.inc(10970);x0 += dx;
            __CLR4_4_18ee8eelb90p7ia.R.inc(10971);ret += probability(x0);
        }
        }__CLR4_4_18ee8eelb90p7ia.R.inc(10972);return ret;
    }finally{__CLR4_4_18ee8eelb90p7ia.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * For population size {@code N}, number of successes {@code m}, and sample
     * size {@code n}, the mean is {@code n * m / N}.
     */
    public double getNumericalMean() {try{__CLR4_4_18ee8eelb90p7ia.R.inc(10973);
        __CLR4_4_18ee8eelb90p7ia.R.inc(10974);return getSampleSize() * (getNumberOfSuccesses() / (double) getPopulationSize());
    }finally{__CLR4_4_18ee8eelb90p7ia.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * For population size {@code N}, number of successes {@code m}, and sample
     * size {@code n}, the variance is
     * {@code [n * m * (N - n) * (N - m)] / [N^2 * (N - 1)]}.
     */
    public double getNumericalVariance() {try{__CLR4_4_18ee8eelb90p7ia.R.inc(10975);
        __CLR4_4_18ee8eelb90p7ia.R.inc(10976);if ((((!numericalVarianceIsCalculated)&&(__CLR4_4_18ee8eelb90p7ia.R.iget(10977)!=0|true))||(__CLR4_4_18ee8eelb90p7ia.R.iget(10978)==0&false))) {{
            __CLR4_4_18ee8eelb90p7ia.R.inc(10979);numericalVariance = calculateNumericalVariance();
            __CLR4_4_18ee8eelb90p7ia.R.inc(10980);numericalVarianceIsCalculated = true;
        }
        }__CLR4_4_18ee8eelb90p7ia.R.inc(10981);return numericalVariance;
    }finally{__CLR4_4_18ee8eelb90p7ia.R.flushNeeded();}}

    /**
     * Used by {@link #getNumericalVariance()}.
     *
     * @return the variance of this distribution
     */
    protected double calculateNumericalVariance() {try{__CLR4_4_18ee8eelb90p7ia.R.inc(10982);
        __CLR4_4_18ee8eelb90p7ia.R.inc(10983);final double N = getPopulationSize();
        __CLR4_4_18ee8eelb90p7ia.R.inc(10984);final double m = getNumberOfSuccesses();
        __CLR4_4_18ee8eelb90p7ia.R.inc(10985);final double n = getSampleSize();
        __CLR4_4_18ee8eelb90p7ia.R.inc(10986);return (n * m * (N - n) * (N - m)) / (N * N * (N - 1));
    }finally{__CLR4_4_18ee8eelb90p7ia.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * For population size {@code N}, number of successes {@code m}, and sample
     * size {@code n}, the lower bound of the support is
     * {@code max(0, n + m - N)}.
     *
     * @return lower bound of the support
     */
    public int getSupportLowerBound() {try{__CLR4_4_18ee8eelb90p7ia.R.inc(10987);
        __CLR4_4_18ee8eelb90p7ia.R.inc(10988);return FastMath.max(0,
                            getSampleSize() + getNumberOfSuccesses() - getPopulationSize());
    }finally{__CLR4_4_18ee8eelb90p7ia.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * For number of successes {@code m} and sample size {@code n}, the upper
     * bound of the support is {@code min(m, n)}.
     *
     * @return upper bound of the support
     */
    public int getSupportUpperBound() {try{__CLR4_4_18ee8eelb90p7ia.R.inc(10989);
        __CLR4_4_18ee8eelb90p7ia.R.inc(10990);return FastMath.min(getNumberOfSuccesses(), getSampleSize());
    }finally{__CLR4_4_18ee8eelb90p7ia.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The support of this distribution is connected.
     *
     * @return {@code true}
     */
    public boolean isSupportConnected() {try{__CLR4_4_18ee8eelb90p7ia.R.inc(10991);
        __CLR4_4_18ee8eelb90p7ia.R.inc(10992);return true;
    }finally{__CLR4_4_18ee8eelb90p7ia.R.flushNeeded();}}
}
