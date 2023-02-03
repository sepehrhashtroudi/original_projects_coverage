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

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NotANumberException;
import org.apache.commons.math3.exception.NotFiniteNumberException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;
import org.apache.commons.math3.util.Pair;

/**
 * <p>Implementation of an integer-valued {@link EnumeratedDistribution}.</p>
 *
 * <p>Values with zero-probability are allowed but they do not extend the
 * support.<br/>
 * Duplicate values are allowed. Probabilities of duplicate values are combined
 * when computing cumulative probabilities and statistics.</p>
 *
 * @version $Id$
 * @since 3.2
 */
public class EnumeratedIntegerDistribution extends AbstractIntegerDistribution {public static class __CLR4_4_1825825lb90p7gx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,10501,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable UID. */
    private static final long serialVersionUID = 20130308L;

    /**
     * {@link EnumeratedDistribution} instance (using the {@link Integer} wrapper)
     * used to generate the pmf.
     */
    protected final EnumeratedDistribution<Integer> innerDistribution;

    /**
     * Create a discrete distribution using the given probability mass function
     * definition.
     *
     * @param singletons array of random variable values.
     * @param probabilities array of probabilities.
     * @throws DimensionMismatchException if
     * {@code singletons.length != probabilities.length}
     * @throws NotPositiveException if any of the probabilities are negative.
     * @throws NotFiniteNumberException if any of the probabilities are infinite.
     * @throws NotANumberException if any of the probabilities are NaN.
     * @throws MathArithmeticException all of the probabilities are 0.
     */
    public EnumeratedIntegerDistribution(final int[] singletons, final double[] probabilities)
    throws DimensionMismatchException, NotPositiveException, MathArithmeticException,
           NotFiniteNumberException, NotANumberException{
        this(new Well19937c(), singletons, probabilities);__CLR4_4_1825825lb90p7gx.R.inc(10446);try{__CLR4_4_1825825lb90p7gx.R.inc(10445);
    }finally{__CLR4_4_1825825lb90p7gx.R.flushNeeded();}}

    /**
     * Create a discrete distribution using the given random number generator
     * and probability mass function definition.
     *
     * @param rng random number generator.
     * @param singletons array of random variable values.
     * @param probabilities array of probabilities.
     * @throws DimensionMismatchException if
     * {@code singletons.length != probabilities.length}
     * @throws NotPositiveException if any of the probabilities are negative.
     * @throws NotFiniteNumberException if any of the probabilities are infinite.
     * @throws NotANumberException if any of the probabilities are NaN.
     * @throws MathArithmeticException all of the probabilities are 0.
     */
    public EnumeratedIntegerDistribution(final RandomGenerator rng,
                                       final int[] singletons, final double[] probabilities)
        throws DimensionMismatchException, NotPositiveException, MathArithmeticException,
                NotFiniteNumberException, NotANumberException {
        super(rng);__CLR4_4_1825825lb90p7gx.R.inc(10448);try{__CLR4_4_1825825lb90p7gx.R.inc(10447);
        __CLR4_4_1825825lb90p7gx.R.inc(10449);if ((((singletons.length != probabilities.length)&&(__CLR4_4_1825825lb90p7gx.R.iget(10450)!=0|true))||(__CLR4_4_1825825lb90p7gx.R.iget(10451)==0&false))) {{
            __CLR4_4_1825825lb90p7gx.R.inc(10452);throw new DimensionMismatchException(probabilities.length, singletons.length);
        }

        }__CLR4_4_1825825lb90p7gx.R.inc(10453);final List<Pair<Integer, Double>> samples = new ArrayList<Pair<Integer, Double>>(singletons.length);

        __CLR4_4_1825825lb90p7gx.R.inc(10454);for (int i = 0; (((i < singletons.length)&&(__CLR4_4_1825825lb90p7gx.R.iget(10455)!=0|true))||(__CLR4_4_1825825lb90p7gx.R.iget(10456)==0&false)); i++) {{
            __CLR4_4_1825825lb90p7gx.R.inc(10457);samples.add(new Pair<Integer, Double>(singletons[i], probabilities[i]));
        }

        }__CLR4_4_1825825lb90p7gx.R.inc(10458);innerDistribution = new EnumeratedDistribution<Integer>(rng, samples);
    }finally{__CLR4_4_1825825lb90p7gx.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public double probability(final int x) {try{__CLR4_4_1825825lb90p7gx.R.inc(10459);
        __CLR4_4_1825825lb90p7gx.R.inc(10460);return innerDistribution.probability(x);
    }finally{__CLR4_4_1825825lb90p7gx.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public double cumulativeProbability(final int x) {try{__CLR4_4_1825825lb90p7gx.R.inc(10461);
        __CLR4_4_1825825lb90p7gx.R.inc(10462);double probability = 0;

        __CLR4_4_1825825lb90p7gx.R.inc(10463);for (final Pair<Integer, Double> sample : innerDistribution.getPmf()) {{
            __CLR4_4_1825825lb90p7gx.R.inc(10464);if ((((sample.getKey() <= x)&&(__CLR4_4_1825825lb90p7gx.R.iget(10465)!=0|true))||(__CLR4_4_1825825lb90p7gx.R.iget(10466)==0&false))) {{
                __CLR4_4_1825825lb90p7gx.R.inc(10467);probability += sample.getValue();
            }
        }}

        }__CLR4_4_1825825lb90p7gx.R.inc(10468);return probability;
    }finally{__CLR4_4_1825825lb90p7gx.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * @return {@code sum(singletons[i] * probabilities[i])}
     */
    public double getNumericalMean() {try{__CLR4_4_1825825lb90p7gx.R.inc(10469);
        __CLR4_4_1825825lb90p7gx.R.inc(10470);double mean = 0;

        __CLR4_4_1825825lb90p7gx.R.inc(10471);for (final Pair<Integer, Double> sample : innerDistribution.getPmf()) {{
            __CLR4_4_1825825lb90p7gx.R.inc(10472);mean += sample.getValue() * sample.getKey();
        }

        }__CLR4_4_1825825lb90p7gx.R.inc(10473);return mean;
    }finally{__CLR4_4_1825825lb90p7gx.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * @return {@code sum((singletons[i] - mean) ^ 2 * probabilities[i])}
     */
    public double getNumericalVariance() {try{__CLR4_4_1825825lb90p7gx.R.inc(10474);
        __CLR4_4_1825825lb90p7gx.R.inc(10475);double mean = 0;
        __CLR4_4_1825825lb90p7gx.R.inc(10476);double meanOfSquares = 0;

        __CLR4_4_1825825lb90p7gx.R.inc(10477);for (final Pair<Integer, Double> sample : innerDistribution.getPmf()) {{
            __CLR4_4_1825825lb90p7gx.R.inc(10478);mean += sample.getValue() * sample.getKey();
            __CLR4_4_1825825lb90p7gx.R.inc(10479);meanOfSquares += sample.getValue() * sample.getKey() * sample.getKey();
        }

        }__CLR4_4_1825825lb90p7gx.R.inc(10480);return meanOfSquares - mean * mean;
    }finally{__CLR4_4_1825825lb90p7gx.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * Returns the lowest value with non-zero probability.
     *
     * @return the lowest value with non-zero probability.
     */
    public int getSupportLowerBound() {try{__CLR4_4_1825825lb90p7gx.R.inc(10481);
        __CLR4_4_1825825lb90p7gx.R.inc(10482);int min = Integer.MAX_VALUE;
        __CLR4_4_1825825lb90p7gx.R.inc(10483);for (final Pair<Integer, Double> sample : innerDistribution.getPmf()) {{
            __CLR4_4_1825825lb90p7gx.R.inc(10484);if ((((sample.getKey() < min && sample.getValue() > 0)&&(__CLR4_4_1825825lb90p7gx.R.iget(10485)!=0|true))||(__CLR4_4_1825825lb90p7gx.R.iget(10486)==0&false))) {{
                __CLR4_4_1825825lb90p7gx.R.inc(10487);min = sample.getKey();
            }
        }}

        }__CLR4_4_1825825lb90p7gx.R.inc(10488);return min;
    }finally{__CLR4_4_1825825lb90p7gx.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * Returns the highest value with non-zero probability.
     *
     * @return the highest value with non-zero probability.
     */
    public int getSupportUpperBound() {try{__CLR4_4_1825825lb90p7gx.R.inc(10489);
        __CLR4_4_1825825lb90p7gx.R.inc(10490);int max = Integer.MIN_VALUE;
        __CLR4_4_1825825lb90p7gx.R.inc(10491);for (final Pair<Integer, Double> sample : innerDistribution.getPmf()) {{
            __CLR4_4_1825825lb90p7gx.R.inc(10492);if ((((sample.getKey() > max && sample.getValue() > 0)&&(__CLR4_4_1825825lb90p7gx.R.iget(10493)!=0|true))||(__CLR4_4_1825825lb90p7gx.R.iget(10494)==0&false))) {{
                __CLR4_4_1825825lb90p7gx.R.inc(10495);max = sample.getKey();
            }
        }}

        }__CLR4_4_1825825lb90p7gx.R.inc(10496);return max;
    }finally{__CLR4_4_1825825lb90p7gx.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The support of this distribution is connected.
     *
     * @return {@code true}
     */
    public boolean isSupportConnected() {try{__CLR4_4_1825825lb90p7gx.R.inc(10497);
        __CLR4_4_1825825lb90p7gx.R.inc(10498);return true;
    }finally{__CLR4_4_1825825lb90p7gx.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public int sample() {try{__CLR4_4_1825825lb90p7gx.R.inc(10499);
        __CLR4_4_1825825lb90p7gx.R.inc(10500);return innerDistribution.sample();
    }finally{__CLR4_4_1825825lb90p7gx.R.flushNeeded();}}
}
