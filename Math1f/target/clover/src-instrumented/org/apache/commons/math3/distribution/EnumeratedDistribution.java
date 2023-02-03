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
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NotANumberException;
import org.apache.commons.math3.exception.NotFiniteNumberException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;
import org.apache.commons.math3.util.MathArrays;
import org.apache.commons.math3.util.Pair;

/**
 * <p>A generic implementation of a
 * <a href="http://en.wikipedia.org/wiki/Probability_distribution#Discrete_probability_distribution">
 * discrete probability distribution (Wikipedia)</a> over a finite sample space,
 * based on an enumerated list of &lt;value, probability&gt; pairs.  Input probabilities must all be non-negative,
 * but zero values are allowed and their sum does not have to equal one. Constructors will normalize input
 * probabilities to make them sum to one.</p>
 *
 * <p>The list of <value, probability> pairs does not, strictly speaking, have to be a function and it can
 * contain null values.  The pmf created by the constructor will combine probabilities of equal values and
 * will treat null values as equal.  For example, if the list of pairs &lt;"dog", 0.2&gt;, &lt;null, 0.1&gt;,
 * &lt;"pig", 0.2&gt;, &lt;"dog", 0.1&gt;, &lt;null, 0.4&gt; is provided to the constructor, the resulting
 * pmf will assign mass of 0.5 to null, 0.3 to "dog" and 0.2 to null.</p>
 *
 * @param <T> type of the elements in the sample space.
 * @version $Id$
 * @since 3.2
 */
public class EnumeratedDistribution<T> implements Serializable {public static class __CLR4_4_17zo7zolb90p7gr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,10445,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable UID. */
    private static final long serialVersionUID = 20123308L;

    /**
     * RNG instance used to generate samples from the distribution.
     */
    protected final RandomGenerator random;

    /**
     * List of random variable values.
     */
    private final List<T> singletons;
    /**
     * Probabilities of respective random variable values. For i = 0, ..., singletons.size() - 1,
     * probability[i] is the probability that a random variable following this distribution takes
     * the value singletons[i].
     */
    private final double[] probabilities;

    /**
     * Create an enumerated distribution using the given probability mass function
     * enumeration.
     *
     * @param pmf probability mass function enumerated as a list of <T, probability>
     * pairs.
     * @throws NotPositiveException if any of the probabilities are negative.
     * @throws NotFiniteNumberException if any of the probabilities are infinite.
     * @throws NotANumberException if any of the probabilities are NaN.
     * @throws MathArithmeticException all of the probabilities are 0.
     */
    public EnumeratedDistribution(final List<Pair<T, Double>> pmf)
        throws NotPositiveException, MathArithmeticException, NotFiniteNumberException, NotANumberException {
        this(new Well19937c(), pmf);__CLR4_4_17zo7zolb90p7gr.R.inc(10357);try{__CLR4_4_17zo7zolb90p7gr.R.inc(10356);
    }finally{__CLR4_4_17zo7zolb90p7gr.R.flushNeeded();}}

    /**
     * Create an enumerated distribution using the given random number generator
     * and probability mass function enumeration.
     *
     * @param rng random number generator.
     * @param pmf probability mass function enumerated as a list of <T, probability>
     * pairs.
     * @throws NotPositiveException if any of the probabilities are negative.
     * @throws NotFiniteNumberException if any of the probabilities are infinite.
     * @throws NotANumberException if any of the probabilities are NaN.
     * @throws MathArithmeticException all of the probabilities are 0.
     */
    public EnumeratedDistribution(final RandomGenerator rng, final List<Pair<T, Double>> pmf)
        throws NotPositiveException, MathArithmeticException, NotFiniteNumberException, NotANumberException {try{__CLR4_4_17zo7zolb90p7gr.R.inc(10358);
        __CLR4_4_17zo7zolb90p7gr.R.inc(10359);random = rng;

        __CLR4_4_17zo7zolb90p7gr.R.inc(10360);singletons = new ArrayList<T>(pmf.size());
        __CLR4_4_17zo7zolb90p7gr.R.inc(10361);final double[] probs = new double[pmf.size()];

        __CLR4_4_17zo7zolb90p7gr.R.inc(10362);for (int i = 0; (((i < pmf.size())&&(__CLR4_4_17zo7zolb90p7gr.R.iget(10363)!=0|true))||(__CLR4_4_17zo7zolb90p7gr.R.iget(10364)==0&false)); i++) {{
            __CLR4_4_17zo7zolb90p7gr.R.inc(10365);final Pair<T, Double> sample = pmf.get(i);
            __CLR4_4_17zo7zolb90p7gr.R.inc(10366);singletons.add(sample.getKey());
            __CLR4_4_17zo7zolb90p7gr.R.inc(10367);final double p = sample.getValue();
            __CLR4_4_17zo7zolb90p7gr.R.inc(10368);if ((((p < 0)&&(__CLR4_4_17zo7zolb90p7gr.R.iget(10369)!=0|true))||(__CLR4_4_17zo7zolb90p7gr.R.iget(10370)==0&false))) {{
                __CLR4_4_17zo7zolb90p7gr.R.inc(10371);throw new NotPositiveException(sample.getValue());
            }
            }__CLR4_4_17zo7zolb90p7gr.R.inc(10372);if ((((Double.isInfinite(p))&&(__CLR4_4_17zo7zolb90p7gr.R.iget(10373)!=0|true))||(__CLR4_4_17zo7zolb90p7gr.R.iget(10374)==0&false))) {{
                __CLR4_4_17zo7zolb90p7gr.R.inc(10375);throw new NotFiniteNumberException(p);
            }
            }__CLR4_4_17zo7zolb90p7gr.R.inc(10376);if ((((Double.isNaN(p))&&(__CLR4_4_17zo7zolb90p7gr.R.iget(10377)!=0|true))||(__CLR4_4_17zo7zolb90p7gr.R.iget(10378)==0&false))) {{
                __CLR4_4_17zo7zolb90p7gr.R.inc(10379);throw new NotANumberException();
            }
            }__CLR4_4_17zo7zolb90p7gr.R.inc(10380);probs[i] = p;
        }

        }__CLR4_4_17zo7zolb90p7gr.R.inc(10381);probabilities = MathArrays.normalizeArray(probs, 1.0);
    }finally{__CLR4_4_17zo7zolb90p7gr.R.flushNeeded();}}

    /**
     * Reseed the random generator used to generate samples.
     *
     * @param seed the new seed
     */
    public void reseedRandomGenerator(long seed) {try{__CLR4_4_17zo7zolb90p7gr.R.inc(10382);
        __CLR4_4_17zo7zolb90p7gr.R.inc(10383);random.setSeed(seed);
    }finally{__CLR4_4_17zo7zolb90p7gr.R.flushNeeded();}}

    /**
     * <p>For a random variable {@code X} whose values are distributed according to
     * this distribution, this method returns {@code P(X = x)}. In other words,
     * this method represents the probability mass function (PMF) for the
     * distribution.</p>
     *
     * <p>Note that if {@code x1} and {@code x2} satisfy {@code x1.equals(x2)},
     * or both are null, then {@code probability(x1) = probability(x2)}.</p>
     *
     * @param x the point at which the PMF is evaluated
     * @return the value of the probability mass function at {@code x}
     */
    double probability(final T x) {try{__CLR4_4_17zo7zolb90p7gr.R.inc(10384);
        __CLR4_4_17zo7zolb90p7gr.R.inc(10385);double probability = 0;

        __CLR4_4_17zo7zolb90p7gr.R.inc(10386);for (int i = 0; (((i < probabilities.length)&&(__CLR4_4_17zo7zolb90p7gr.R.iget(10387)!=0|true))||(__CLR4_4_17zo7zolb90p7gr.R.iget(10388)==0&false)); i++) {{
            __CLR4_4_17zo7zolb90p7gr.R.inc(10389);if (((((x == null && singletons.get(i) == null) ||
                (x != null && x.equals(singletons.get(i))))&&(__CLR4_4_17zo7zolb90p7gr.R.iget(10390)!=0|true))||(__CLR4_4_17zo7zolb90p7gr.R.iget(10391)==0&false))) {{
                __CLR4_4_17zo7zolb90p7gr.R.inc(10392);probability += probabilities[i];
            }
        }}

        }__CLR4_4_17zo7zolb90p7gr.R.inc(10393);return probability;
    }finally{__CLR4_4_17zo7zolb90p7gr.R.flushNeeded();}}

    /**
     * <p>Return the probability mass function as a list of <value, probability> pairs.</p>
     *
     * <p>Note that if duplicate and / or null values were provided to the constructor
     * when creating this EnumeratedDistribution, the returned list will contain these
     * values.  If duplicates values exist, what is returned will not represent
     * a pmf (i.e., it is up to the caller to consolidate duplicate mass points).</p>
     *
     * @return the probability mass function.
     */
    public List<Pair<T, Double>> getPmf() {try{__CLR4_4_17zo7zolb90p7gr.R.inc(10394);
        __CLR4_4_17zo7zolb90p7gr.R.inc(10395);final List<Pair<T, Double>> samples = new ArrayList<Pair<T, Double>>(probabilities.length);

        __CLR4_4_17zo7zolb90p7gr.R.inc(10396);for (int i = 0; (((i < probabilities.length)&&(__CLR4_4_17zo7zolb90p7gr.R.iget(10397)!=0|true))||(__CLR4_4_17zo7zolb90p7gr.R.iget(10398)==0&false)); i++) {{
            __CLR4_4_17zo7zolb90p7gr.R.inc(10399);samples.add(new Pair<T, Double>(singletons.get(i), probabilities[i]));
        }

        }__CLR4_4_17zo7zolb90p7gr.R.inc(10400);return samples;
    }finally{__CLR4_4_17zo7zolb90p7gr.R.flushNeeded();}}

    /**
     * Generate a random value sampled from this distribution.
     *
     * @return a random value.
     */
    public T sample() {try{__CLR4_4_17zo7zolb90p7gr.R.inc(10401);
        __CLR4_4_17zo7zolb90p7gr.R.inc(10402);final double randomValue = random.nextDouble();
        __CLR4_4_17zo7zolb90p7gr.R.inc(10403);double sum = 0;

        __CLR4_4_17zo7zolb90p7gr.R.inc(10404);for (int i = 0; (((i < probabilities.length)&&(__CLR4_4_17zo7zolb90p7gr.R.iget(10405)!=0|true))||(__CLR4_4_17zo7zolb90p7gr.R.iget(10406)==0&false)); i++) {{
            __CLR4_4_17zo7zolb90p7gr.R.inc(10407);sum += probabilities[i];
            __CLR4_4_17zo7zolb90p7gr.R.inc(10408);if ((((randomValue < sum)&&(__CLR4_4_17zo7zolb90p7gr.R.iget(10409)!=0|true))||(__CLR4_4_17zo7zolb90p7gr.R.iget(10410)==0&false))) {{
                __CLR4_4_17zo7zolb90p7gr.R.inc(10411);return singletons.get(i);
            }
        }}

        /* This should never happen, but it ensures we will return a correct
         * object in case the loop above has some floating point inequality
         * problem on the final iteration. */
        }__CLR4_4_17zo7zolb90p7gr.R.inc(10412);return singletons.get(singletons.size() - 1);
    }finally{__CLR4_4_17zo7zolb90p7gr.R.flushNeeded();}}

    /**
     * Generate a random sample from the distribution.
     *
     * @param sampleSize the number of random values to generate.
     * @return an array representing the random sample.
     * @throws NotStrictlyPositiveException if {@code sampleSize} is not
     * positive.
     */
    public Object[] sample(int sampleSize) throws NotStrictlyPositiveException {try{__CLR4_4_17zo7zolb90p7gr.R.inc(10413);
        __CLR4_4_17zo7zolb90p7gr.R.inc(10414);if ((((sampleSize <= 0)&&(__CLR4_4_17zo7zolb90p7gr.R.iget(10415)!=0|true))||(__CLR4_4_17zo7zolb90p7gr.R.iget(10416)==0&false))) {{
            __CLR4_4_17zo7zolb90p7gr.R.inc(10417);throw new NotStrictlyPositiveException(LocalizedFormats.NUMBER_OF_SAMPLES,
                    sampleSize);
        }

        }__CLR4_4_17zo7zolb90p7gr.R.inc(10418);final Object[] out = new Object[sampleSize];

        __CLR4_4_17zo7zolb90p7gr.R.inc(10419);for (int i = 0; (((i < sampleSize)&&(__CLR4_4_17zo7zolb90p7gr.R.iget(10420)!=0|true))||(__CLR4_4_17zo7zolb90p7gr.R.iget(10421)==0&false)); i++) {{
            __CLR4_4_17zo7zolb90p7gr.R.inc(10422);out[i] = sample();
        }

        }__CLR4_4_17zo7zolb90p7gr.R.inc(10423);return out;

    }finally{__CLR4_4_17zo7zolb90p7gr.R.flushNeeded();}}

    /**
     * Generate a random sample from the distribution.
     * <p>
     * If the requested samples fit in the specified array, it is returned
     * therein. Otherwise, a new array is allocated with the runtime type of
     * the specified array and the size of this collection.
     *
     * @param sampleSize the number of random values to generate.
     * @param array the array to populate.
     * @return an array representing the random sample.
     * @throws NotStrictlyPositiveException if {@code sampleSize} is not positive.
     * @throws NullArgumentException if {@code array} is null
     */
    public T[] sample(int sampleSize, final T[] array) throws NotStrictlyPositiveException {try{__CLR4_4_17zo7zolb90p7gr.R.inc(10424);
        __CLR4_4_17zo7zolb90p7gr.R.inc(10425);if ((((sampleSize <= 0)&&(__CLR4_4_17zo7zolb90p7gr.R.iget(10426)!=0|true))||(__CLR4_4_17zo7zolb90p7gr.R.iget(10427)==0&false))) {{
            __CLR4_4_17zo7zolb90p7gr.R.inc(10428);throw new NotStrictlyPositiveException(LocalizedFormats.NUMBER_OF_SAMPLES, sampleSize);
        }

        }__CLR4_4_17zo7zolb90p7gr.R.inc(10429);if ((((array == null)&&(__CLR4_4_17zo7zolb90p7gr.R.iget(10430)!=0|true))||(__CLR4_4_17zo7zolb90p7gr.R.iget(10431)==0&false))) {{
            __CLR4_4_17zo7zolb90p7gr.R.inc(10432);throw new NullArgumentException(LocalizedFormats.INPUT_ARRAY);
        }

        }__CLR4_4_17zo7zolb90p7gr.R.inc(10433);T[] out;
        __CLR4_4_17zo7zolb90p7gr.R.inc(10434);if ((((array.length < sampleSize)&&(__CLR4_4_17zo7zolb90p7gr.R.iget(10435)!=0|true))||(__CLR4_4_17zo7zolb90p7gr.R.iget(10436)==0&false))) {{
            __CLR4_4_17zo7zolb90p7gr.R.inc(10437);@SuppressWarnings("unchecked") // safe as both are of type T
            final T[] unchecked = (T[]) Array.newInstance(array.getClass().getComponentType(), sampleSize);
            __CLR4_4_17zo7zolb90p7gr.R.inc(10438);out = unchecked;
        } }else {{
            __CLR4_4_17zo7zolb90p7gr.R.inc(10439);out = array;
        }

        }__CLR4_4_17zo7zolb90p7gr.R.inc(10440);for (int i = 0; (((i < sampleSize)&&(__CLR4_4_17zo7zolb90p7gr.R.iget(10441)!=0|true))||(__CLR4_4_17zo7zolb90p7gr.R.iget(10442)==0&false)); i++) {{
            __CLR4_4_17zo7zolb90p7gr.R.inc(10443);out[i] = sample();
        }

        }__CLR4_4_17zo7zolb90p7gr.R.inc(10444);return out;

    }finally{__CLR4_4_17zo7zolb90p7gr.R.flushNeeded();}}

}
