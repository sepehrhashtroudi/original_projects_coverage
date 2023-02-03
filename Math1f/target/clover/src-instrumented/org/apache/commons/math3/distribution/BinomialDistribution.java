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

import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.special.Beta;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;

/**
 * Implementation of the binomial distribution.
 *
 * @see <a href="http://en.wikipedia.org/wiki/Binomial_distribution">Binomial distribution (Wikipedia)</a>
 * @see <a href="http://mathworld.wolfram.com/BinomialDistribution.html">Binomial Distribution (MathWorld)</a>
 * @version $Id$
 */
public class BinomialDistribution extends AbstractIntegerDistribution {public static class __CLR4_4_17vt7vtlb90p7g6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,10270,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Serializable version identifier. */
    private static final long serialVersionUID = 6751309484392813623L;
    /** The number of trials. */
    private final int numberOfTrials;
    /** The probability of success. */
    private final double probabilityOfSuccess;

    /**
     * Create a binomial distribution with the given number of trials and
     * probability of success.
     *
     * @param trials Number of trials.
     * @param p Probability of success.
     * @throws NotPositiveException if {@code trials < 0}.
     * @throws OutOfRangeException if {@code p < 0} or {@code p > 1}.
     */
    public BinomialDistribution(int trials, double p) {
        this(new Well19937c(), trials, p);__CLR4_4_17vt7vtlb90p7g6.R.inc(10218);try{__CLR4_4_17vt7vtlb90p7g6.R.inc(10217);
    }finally{__CLR4_4_17vt7vtlb90p7g6.R.flushNeeded();}}

    /**
     * Creates a binomial distribution.
     *
     * @param rng Random number generator.
     * @param trials Number of trials.
     * @param p Probability of success.
     * @throws NotPositiveException if {@code trials < 0}.
     * @throws OutOfRangeException if {@code p < 0} or {@code p > 1}.
     * @since 3.1
     */
    public BinomialDistribution(RandomGenerator rng,
                                int trials,
                                double p) {
        super(rng);__CLR4_4_17vt7vtlb90p7g6.R.inc(10220);try{__CLR4_4_17vt7vtlb90p7g6.R.inc(10219);

        __CLR4_4_17vt7vtlb90p7g6.R.inc(10221);if ((((trials < 0)&&(__CLR4_4_17vt7vtlb90p7g6.R.iget(10222)!=0|true))||(__CLR4_4_17vt7vtlb90p7g6.R.iget(10223)==0&false))) {{
            __CLR4_4_17vt7vtlb90p7g6.R.inc(10224);throw new NotPositiveException(LocalizedFormats.NUMBER_OF_TRIALS,
                                           trials);
        }
        }__CLR4_4_17vt7vtlb90p7g6.R.inc(10225);if ((((p < 0 || p > 1)&&(__CLR4_4_17vt7vtlb90p7g6.R.iget(10226)!=0|true))||(__CLR4_4_17vt7vtlb90p7g6.R.iget(10227)==0&false))) {{
            __CLR4_4_17vt7vtlb90p7g6.R.inc(10228);throw new OutOfRangeException(p, 0, 1);
        }

        }__CLR4_4_17vt7vtlb90p7g6.R.inc(10229);probabilityOfSuccess = p;
        __CLR4_4_17vt7vtlb90p7g6.R.inc(10230);numberOfTrials = trials;
    }finally{__CLR4_4_17vt7vtlb90p7g6.R.flushNeeded();}}

    /**
     * Access the number of trials for this distribution.
     *
     * @return the number of trials.
     */
    public int getNumberOfTrials() {try{__CLR4_4_17vt7vtlb90p7g6.R.inc(10231);
        __CLR4_4_17vt7vtlb90p7g6.R.inc(10232);return numberOfTrials;
    }finally{__CLR4_4_17vt7vtlb90p7g6.R.flushNeeded();}}

    /**
     * Access the probability of success for this distribution.
     *
     * @return the probability of success.
     */
    public double getProbabilityOfSuccess() {try{__CLR4_4_17vt7vtlb90p7g6.R.inc(10233);
        __CLR4_4_17vt7vtlb90p7g6.R.inc(10234);return probabilityOfSuccess;
    }finally{__CLR4_4_17vt7vtlb90p7g6.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double probability(int x) {try{__CLR4_4_17vt7vtlb90p7g6.R.inc(10235);
        __CLR4_4_17vt7vtlb90p7g6.R.inc(10236);double ret;
        __CLR4_4_17vt7vtlb90p7g6.R.inc(10237);if ((((x < 0 || x > numberOfTrials)&&(__CLR4_4_17vt7vtlb90p7g6.R.iget(10238)!=0|true))||(__CLR4_4_17vt7vtlb90p7g6.R.iget(10239)==0&false))) {{
            __CLR4_4_17vt7vtlb90p7g6.R.inc(10240);ret = 0.0;
        } }else {{
            __CLR4_4_17vt7vtlb90p7g6.R.inc(10241);ret = FastMath.exp(SaddlePointExpansion.logBinomialProbability(x,
                    numberOfTrials, probabilityOfSuccess,
                    1.0 - probabilityOfSuccess));
        }
        }__CLR4_4_17vt7vtlb90p7g6.R.inc(10242);return ret;
    }finally{__CLR4_4_17vt7vtlb90p7g6.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double cumulativeProbability(int x) {try{__CLR4_4_17vt7vtlb90p7g6.R.inc(10243);
        __CLR4_4_17vt7vtlb90p7g6.R.inc(10244);double ret;
        __CLR4_4_17vt7vtlb90p7g6.R.inc(10245);if ((((x < 0)&&(__CLR4_4_17vt7vtlb90p7g6.R.iget(10246)!=0|true))||(__CLR4_4_17vt7vtlb90p7g6.R.iget(10247)==0&false))) {{
            __CLR4_4_17vt7vtlb90p7g6.R.inc(10248);ret = 0.0;
        } }else {__CLR4_4_17vt7vtlb90p7g6.R.inc(10249);if ((((x >= numberOfTrials)&&(__CLR4_4_17vt7vtlb90p7g6.R.iget(10250)!=0|true))||(__CLR4_4_17vt7vtlb90p7g6.R.iget(10251)==0&false))) {{
            __CLR4_4_17vt7vtlb90p7g6.R.inc(10252);ret = 1.0;
        } }else {{
            __CLR4_4_17vt7vtlb90p7g6.R.inc(10253);ret = 1.0 - Beta.regularizedBeta(probabilityOfSuccess,
                    x + 1.0, numberOfTrials - x);
        }
        }}__CLR4_4_17vt7vtlb90p7g6.R.inc(10254);return ret;
    }finally{__CLR4_4_17vt7vtlb90p7g6.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * For {@code n} trials and probability parameter {@code p}, the mean is
     * {@code n * p}.
     */
    public double getNumericalMean() {try{__CLR4_4_17vt7vtlb90p7g6.R.inc(10255);
        __CLR4_4_17vt7vtlb90p7g6.R.inc(10256);return numberOfTrials * probabilityOfSuccess;
    }finally{__CLR4_4_17vt7vtlb90p7g6.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * For {@code n} trials and probability parameter {@code p}, the variance is
     * {@code n * p * (1 - p)}.
     */
    public double getNumericalVariance() {try{__CLR4_4_17vt7vtlb90p7g6.R.inc(10257);
        __CLR4_4_17vt7vtlb90p7g6.R.inc(10258);final double p = probabilityOfSuccess;
        __CLR4_4_17vt7vtlb90p7g6.R.inc(10259);return numberOfTrials * p * (1 - p);
    }finally{__CLR4_4_17vt7vtlb90p7g6.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The lower bound of the support is always 0 except for the probability
     * parameter {@code p = 1}.
     *
     * @return lower bound of the support (0 or the number of trials)
     */
    public int getSupportLowerBound() {try{__CLR4_4_17vt7vtlb90p7g6.R.inc(10260);
        __CLR4_4_17vt7vtlb90p7g6.R.inc(10261);return (((probabilityOfSuccess < 1.0 )&&(__CLR4_4_17vt7vtlb90p7g6.R.iget(10262)!=0|true))||(__CLR4_4_17vt7vtlb90p7g6.R.iget(10263)==0&false))? 0 : numberOfTrials;
    }finally{__CLR4_4_17vt7vtlb90p7g6.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The upper bound of the support is the number of trials except for the
     * probability parameter {@code p = 0}.
     *
     * @return upper bound of the support (number of trials or 0)
     */
    public int getSupportUpperBound() {try{__CLR4_4_17vt7vtlb90p7g6.R.inc(10264);
        __CLR4_4_17vt7vtlb90p7g6.R.inc(10265);return (((probabilityOfSuccess > 0.0 )&&(__CLR4_4_17vt7vtlb90p7g6.R.iget(10266)!=0|true))||(__CLR4_4_17vt7vtlb90p7g6.R.iget(10267)==0&false))? numberOfTrials : 0;
    }finally{__CLR4_4_17vt7vtlb90p7g6.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The support of this distribution is connected.
     *
     * @return {@code true}
     */
    public boolean isSupportConnected() {try{__CLR4_4_17vt7vtlb90p7g6.R.inc(10268);
        __CLR4_4_17vt7vtlb90p7g6.R.inc(10269);return true;
    }finally{__CLR4_4_17vt7vtlb90p7g6.R.flushNeeded();}}
}
