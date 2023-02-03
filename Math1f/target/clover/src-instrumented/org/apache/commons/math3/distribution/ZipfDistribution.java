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
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;

/**
 * Implementation of the Zipf distribution.
 *
 * @see <a href="http://mathworld.wolfram.com/ZipfDistribution.html">Zipf distribution (MathWorld)</a>
 * @version $Id$
 */
public class ZipfDistribution extends AbstractIntegerDistribution {public static class __CLR4_4_19dp9dplb90p7m9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,12231,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Serializable version identifier. */
    private static final long serialVersionUID = -140627372283420404L;
    /** Number of elements. */
    private final int numberOfElements;
    /** Exponent parameter of the distribution. */
    private final double exponent;
    /** Cached numerical mean */
    private double numericalMean = Double.NaN;
    /** Whether or not the numerical mean has been calculated */
    private boolean numericalMeanIsCalculated = false;
    /** Cached numerical variance */
    private double numericalVariance = Double.NaN;
    /** Whether or not the numerical variance has been calculated */
    private boolean numericalVarianceIsCalculated = false;

    /**
     * Create a new Zipf distribution with the given number of elements and
     * exponent.
     *
     * @param numberOfElements Number of elements.
     * @param exponent Exponent.
     * @exception NotStrictlyPositiveException if {@code numberOfElements <= 0}
     * or {@code exponent <= 0}.
     */
    public ZipfDistribution(final int numberOfElements, final double exponent) {
        this(new Well19937c(), numberOfElements, exponent);__CLR4_4_19dp9dplb90p7m9.R.inc(12158);try{__CLR4_4_19dp9dplb90p7m9.R.inc(12157);
    }finally{__CLR4_4_19dp9dplb90p7m9.R.flushNeeded();}}

    /**
     * Creates a Zipf distribution.
     *
     * @param rng Random number generator.
     * @param numberOfElements Number of elements.
     * @param exponent Exponent.
     * @exception NotStrictlyPositiveException if {@code numberOfElements <= 0}
     * or {@code exponent <= 0}.
     * @since 3.1
     */
    public ZipfDistribution(RandomGenerator rng,
                            int numberOfElements,
                            double exponent)
        throws NotStrictlyPositiveException {
        super(rng);__CLR4_4_19dp9dplb90p7m9.R.inc(12160);try{__CLR4_4_19dp9dplb90p7m9.R.inc(12159);

        __CLR4_4_19dp9dplb90p7m9.R.inc(12161);if ((((numberOfElements <= 0)&&(__CLR4_4_19dp9dplb90p7m9.R.iget(12162)!=0|true))||(__CLR4_4_19dp9dplb90p7m9.R.iget(12163)==0&false))) {{
            __CLR4_4_19dp9dplb90p7m9.R.inc(12164);throw new NotStrictlyPositiveException(LocalizedFormats.DIMENSION,
                                                   numberOfElements);
        }
        }__CLR4_4_19dp9dplb90p7m9.R.inc(12165);if ((((exponent <= 0)&&(__CLR4_4_19dp9dplb90p7m9.R.iget(12166)!=0|true))||(__CLR4_4_19dp9dplb90p7m9.R.iget(12167)==0&false))) {{
            __CLR4_4_19dp9dplb90p7m9.R.inc(12168);throw new NotStrictlyPositiveException(LocalizedFormats.EXPONENT,
                                                   exponent);
        }

        }__CLR4_4_19dp9dplb90p7m9.R.inc(12169);this.numberOfElements = numberOfElements;
        __CLR4_4_19dp9dplb90p7m9.R.inc(12170);this.exponent = exponent;
    }finally{__CLR4_4_19dp9dplb90p7m9.R.flushNeeded();}}

    /**
     * Get the number of elements (e.g. corpus size) for the distribution.
     *
     * @return the number of elements
     */
    public int getNumberOfElements() {try{__CLR4_4_19dp9dplb90p7m9.R.inc(12171);
        __CLR4_4_19dp9dplb90p7m9.R.inc(12172);return numberOfElements;
    }finally{__CLR4_4_19dp9dplb90p7m9.R.flushNeeded();}}

    /**
     * Get the exponent characterizing the distribution.
     *
     * @return the exponent
     */
    public double getExponent() {try{__CLR4_4_19dp9dplb90p7m9.R.inc(12173);
        __CLR4_4_19dp9dplb90p7m9.R.inc(12174);return exponent;
    }finally{__CLR4_4_19dp9dplb90p7m9.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double probability(final int x) {try{__CLR4_4_19dp9dplb90p7m9.R.inc(12175);
        __CLR4_4_19dp9dplb90p7m9.R.inc(12176);if ((((x <= 0 || x > numberOfElements)&&(__CLR4_4_19dp9dplb90p7m9.R.iget(12177)!=0|true))||(__CLR4_4_19dp9dplb90p7m9.R.iget(12178)==0&false))) {{
            __CLR4_4_19dp9dplb90p7m9.R.inc(12179);return 0.0;
        }

        }__CLR4_4_19dp9dplb90p7m9.R.inc(12180);return (1.0 / FastMath.pow(x, exponent)) / generalizedHarmonic(numberOfElements, exponent);
    }finally{__CLR4_4_19dp9dplb90p7m9.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double cumulativeProbability(final int x) {try{__CLR4_4_19dp9dplb90p7m9.R.inc(12181);
        __CLR4_4_19dp9dplb90p7m9.R.inc(12182);if ((((x <= 0)&&(__CLR4_4_19dp9dplb90p7m9.R.iget(12183)!=0|true))||(__CLR4_4_19dp9dplb90p7m9.R.iget(12184)==0&false))) {{
            __CLR4_4_19dp9dplb90p7m9.R.inc(12185);return 0.0;
        } }else {__CLR4_4_19dp9dplb90p7m9.R.inc(12186);if ((((x >= numberOfElements)&&(__CLR4_4_19dp9dplb90p7m9.R.iget(12187)!=0|true))||(__CLR4_4_19dp9dplb90p7m9.R.iget(12188)==0&false))) {{
            __CLR4_4_19dp9dplb90p7m9.R.inc(12189);return 1.0;
        }

        }}__CLR4_4_19dp9dplb90p7m9.R.inc(12190);return generalizedHarmonic(x, exponent) / generalizedHarmonic(numberOfElements, exponent);
    }finally{__CLR4_4_19dp9dplb90p7m9.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * For number of elements {@code N} and exponent {@code s}, the mean is
     * {@code Hs1 / Hs}, where
     * <ul>
     *  <li>{@code Hs1 = generalizedHarmonic(N, s - 1)},</li>
     *  <li>{@code Hs = generalizedHarmonic(N, s)}.</li>
     * </ul>
     */
    public double getNumericalMean() {try{__CLR4_4_19dp9dplb90p7m9.R.inc(12191);
        __CLR4_4_19dp9dplb90p7m9.R.inc(12192);if ((((!numericalMeanIsCalculated)&&(__CLR4_4_19dp9dplb90p7m9.R.iget(12193)!=0|true))||(__CLR4_4_19dp9dplb90p7m9.R.iget(12194)==0&false))) {{
            __CLR4_4_19dp9dplb90p7m9.R.inc(12195);numericalMean = calculateNumericalMean();
            __CLR4_4_19dp9dplb90p7m9.R.inc(12196);numericalMeanIsCalculated = true;
        }
        }__CLR4_4_19dp9dplb90p7m9.R.inc(12197);return numericalMean;
    }finally{__CLR4_4_19dp9dplb90p7m9.R.flushNeeded();}}

    /**
     * Used by {@link #getNumericalMean()}.
     *
     * @return the mean of this distribution
     */
    protected double calculateNumericalMean() {try{__CLR4_4_19dp9dplb90p7m9.R.inc(12198);
        __CLR4_4_19dp9dplb90p7m9.R.inc(12199);final int N = getNumberOfElements();
        __CLR4_4_19dp9dplb90p7m9.R.inc(12200);final double s = getExponent();

        __CLR4_4_19dp9dplb90p7m9.R.inc(12201);final double Hs1 = generalizedHarmonic(N, s - 1);
        __CLR4_4_19dp9dplb90p7m9.R.inc(12202);final double Hs = generalizedHarmonic(N, s);

        __CLR4_4_19dp9dplb90p7m9.R.inc(12203);return Hs1 / Hs;
    }finally{__CLR4_4_19dp9dplb90p7m9.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * For number of elements {@code N} and exponent {@code s}, the mean is
     * {@code (Hs2 / Hs) - (Hs1^2 / Hs^2)}, where
     * <ul>
     *  <li>{@code Hs2 = generalizedHarmonic(N, s - 2)},</li>
     *  <li>{@code Hs1 = generalizedHarmonic(N, s - 1)},</li>
     *  <li>{@code Hs = generalizedHarmonic(N, s)}.</li>
     * </ul>
     */
    public double getNumericalVariance() {try{__CLR4_4_19dp9dplb90p7m9.R.inc(12204);
        __CLR4_4_19dp9dplb90p7m9.R.inc(12205);if ((((!numericalVarianceIsCalculated)&&(__CLR4_4_19dp9dplb90p7m9.R.iget(12206)!=0|true))||(__CLR4_4_19dp9dplb90p7m9.R.iget(12207)==0&false))) {{
            __CLR4_4_19dp9dplb90p7m9.R.inc(12208);numericalVariance = calculateNumericalVariance();
            __CLR4_4_19dp9dplb90p7m9.R.inc(12209);numericalVarianceIsCalculated = true;
        }
        }__CLR4_4_19dp9dplb90p7m9.R.inc(12210);return numericalVariance;
    }finally{__CLR4_4_19dp9dplb90p7m9.R.flushNeeded();}}

    /**
     * Used by {@link #getNumericalVariance()}.
     *
     * @return the variance of this distribution
     */
    protected double calculateNumericalVariance() {try{__CLR4_4_19dp9dplb90p7m9.R.inc(12211);
        __CLR4_4_19dp9dplb90p7m9.R.inc(12212);final int N = getNumberOfElements();
        __CLR4_4_19dp9dplb90p7m9.R.inc(12213);final double s = getExponent();

        __CLR4_4_19dp9dplb90p7m9.R.inc(12214);final double Hs2 = generalizedHarmonic(N, s - 2);
        __CLR4_4_19dp9dplb90p7m9.R.inc(12215);final double Hs1 = generalizedHarmonic(N, s - 1);
        __CLR4_4_19dp9dplb90p7m9.R.inc(12216);final double Hs = generalizedHarmonic(N, s);

        __CLR4_4_19dp9dplb90p7m9.R.inc(12217);return (Hs2 / Hs) - ((Hs1 * Hs1) / (Hs * Hs));
    }finally{__CLR4_4_19dp9dplb90p7m9.R.flushNeeded();}}

    /**
     * Calculates the Nth generalized harmonic number. See
     * <a href="http://mathworld.wolfram.com/HarmonicSeries.html">Harmonic
     * Series</a>.
     *
     * @param n Term in the series to calculate (must be larger than 1)
     * @param m Exponent (special case {@code m = 1} is the harmonic series).
     * @return the n<sup>th</sup> generalized harmonic number.
     */
    private double generalizedHarmonic(final int n, final double m) {try{__CLR4_4_19dp9dplb90p7m9.R.inc(12218);
        __CLR4_4_19dp9dplb90p7m9.R.inc(12219);double value = 0;
        __CLR4_4_19dp9dplb90p7m9.R.inc(12220);for (int k = n; (((k > 0)&&(__CLR4_4_19dp9dplb90p7m9.R.iget(12221)!=0|true))||(__CLR4_4_19dp9dplb90p7m9.R.iget(12222)==0&false)); --k) {{
            __CLR4_4_19dp9dplb90p7m9.R.inc(12223);value += 1.0 / FastMath.pow(k, m);
        }
        }__CLR4_4_19dp9dplb90p7m9.R.inc(12224);return value;
    }finally{__CLR4_4_19dp9dplb90p7m9.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The lower bound of the support is always 1 no matter the parameters.
     *
     * @return lower bound of the support (always 1)
     */
    public int getSupportLowerBound() {try{__CLR4_4_19dp9dplb90p7m9.R.inc(12225);
        __CLR4_4_19dp9dplb90p7m9.R.inc(12226);return 1;
    }finally{__CLR4_4_19dp9dplb90p7m9.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The upper bound of the support is the number of elements.
     *
     * @return upper bound of the support
     */
    public int getSupportUpperBound() {try{__CLR4_4_19dp9dplb90p7m9.R.inc(12227);
        __CLR4_4_19dp9dplb90p7m9.R.inc(12228);return getNumberOfElements();
    }finally{__CLR4_4_19dp9dplb90p7m9.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The support of this distribution is connected.
     *
     * @return {@code true}
     */
    public boolean isSupportConnected() {try{__CLR4_4_19dp9dplb90p7m9.R.inc(12229);
        __CLR4_4_19dp9dplb90p7m9.R.inc(12230);return true;
    }finally{__CLR4_4_19dp9dplb90p7m9.R.flushNeeded();}}
}

