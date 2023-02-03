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
package org.apache.commons.math3.stat.inference;

import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.exception.ConvergenceException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.stat.ranking.NaNStrategy;
import org.apache.commons.math3.stat.ranking.NaturalRanking;
import org.apache.commons.math3.stat.ranking.TiesStrategy;
import org.apache.commons.math3.util.FastMath;

/**
 * An implementation of the Mann-Whitney U test (also called Wilcoxon rank-sum test).
 *
 * @version $Id$
 */
public class MannWhitneyUTest {static class __CLR4_4_114y514y5lb90paq3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,53111,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Ranking algorithm. */
    private NaturalRanking naturalRanking;

    /**
     * Create a test instance using where NaN's are left in place and ties get
     * the average of applicable ranks. Use this unless you are very sure of
     * what you are doing.
     */
    public MannWhitneyUTest() {try{__CLR4_4_114y514y5lb90paq3.R.inc(53069);
        __CLR4_4_114y514y5lb90paq3.R.inc(53070);naturalRanking = new NaturalRanking(NaNStrategy.FIXED,
                TiesStrategy.AVERAGE);
    }finally{__CLR4_4_114y514y5lb90paq3.R.flushNeeded();}}

    /**
     * Create a test instance using the given strategies for NaN's and ties.
     * Only use this if you are sure of what you are doing.
     *
     * @param nanStrategy
     *            specifies the strategy that should be used for Double.NaN's
     * @param tiesStrategy
     *            specifies the strategy that should be used for ties
     */
    public MannWhitneyUTest(final NaNStrategy nanStrategy,
                            final TiesStrategy tiesStrategy) {try{__CLR4_4_114y514y5lb90paq3.R.inc(53071);
        __CLR4_4_114y514y5lb90paq3.R.inc(53072);naturalRanking = new NaturalRanking(nanStrategy, tiesStrategy);
    }finally{__CLR4_4_114y514y5lb90paq3.R.flushNeeded();}}

    /**
     * Ensures that the provided arrays fulfills the assumptions.
     *
     * @param x first sample
     * @param y second sample
     * @throws NullArgumentException if {@code x} or {@code y} are {@code null}.
     * @throws NoDataException if {@code x} or {@code y} are zero-length.
     */
    private void ensureDataConformance(final double[] x, final double[] y)
        throws NullArgumentException, NoDataException {try{__CLR4_4_114y514y5lb90paq3.R.inc(53073);

        __CLR4_4_114y514y5lb90paq3.R.inc(53074);if ((((x == null ||
            y == null)&&(__CLR4_4_114y514y5lb90paq3.R.iget(53075)!=0|true))||(__CLR4_4_114y514y5lb90paq3.R.iget(53076)==0&false))) {{
            __CLR4_4_114y514y5lb90paq3.R.inc(53077);throw new NullArgumentException();
        }
        }__CLR4_4_114y514y5lb90paq3.R.inc(53078);if ((((x.length == 0 ||
            y.length == 0)&&(__CLR4_4_114y514y5lb90paq3.R.iget(53079)!=0|true))||(__CLR4_4_114y514y5lb90paq3.R.iget(53080)==0&false))) {{
            __CLR4_4_114y514y5lb90paq3.R.inc(53081);throw new NoDataException();
        }
    }}finally{__CLR4_4_114y514y5lb90paq3.R.flushNeeded();}}

    /** Concatenate the samples into one array.
     * @param x first sample
     * @param y second sample
     * @return concatenated array
     */
    private double[] concatenateSamples(final double[] x, final double[] y) {try{__CLR4_4_114y514y5lb90paq3.R.inc(53082);
        __CLR4_4_114y514y5lb90paq3.R.inc(53083);final double[] z = new double[x.length + y.length];

        __CLR4_4_114y514y5lb90paq3.R.inc(53084);System.arraycopy(x, 0, z, 0, x.length);
        __CLR4_4_114y514y5lb90paq3.R.inc(53085);System.arraycopy(y, 0, z, x.length, y.length);

        __CLR4_4_114y514y5lb90paq3.R.inc(53086);return z;
    }finally{__CLR4_4_114y514y5lb90paq3.R.flushNeeded();}}

    /**
     * Computes the <a
     * href="http://en.wikipedia.org/wiki/Mann%E2%80%93Whitney_U"> Mann-Whitney
     * U statistic</a> comparing mean for two independent samples possibly of
     * different length.
     * <p>
     * This statistic can be used to perform a Mann-Whitney U test evaluating
     * the null hypothesis that the two independent samples has equal mean.
     * </p>
     * <p>
     * Let X<sub>i</sub> denote the i'th individual of the first sample and
     * Y<sub>j</sub> the j'th individual in the second sample. Note that the
     * samples would often have different length.
     * </p>
     * <p>
     * <strong>Preconditions</strong>:
     * <ul>
     * <li>All observations in the two samples are independent.</li>
     * <li>The observations are at least ordinal (continuous are also ordinal).</li>
     * </ul>
     * </p>
     *
     * @param x the first sample
     * @param y the second sample
     * @return Mann-Whitney U statistic (maximum of U<sup>x</sup> and U<sup>y</sup>)
     * @throws NullArgumentException if {@code x} or {@code y} are {@code null}.
     * @throws NoDataException if {@code x} or {@code y} are zero-length.
     */
    public double mannWhitneyU(final double[] x, final double[] y)
        throws NullArgumentException, NoDataException {try{__CLR4_4_114y514y5lb90paq3.R.inc(53087);

        __CLR4_4_114y514y5lb90paq3.R.inc(53088);ensureDataConformance(x, y);

        __CLR4_4_114y514y5lb90paq3.R.inc(53089);final double[] z = concatenateSamples(x, y);
        __CLR4_4_114y514y5lb90paq3.R.inc(53090);final double[] ranks = naturalRanking.rank(z);

        __CLR4_4_114y514y5lb90paq3.R.inc(53091);double sumRankX = 0;

        /*
         * The ranks for x is in the first x.length entries in ranks because x
         * is in the first x.length entries in z
         */
        __CLR4_4_114y514y5lb90paq3.R.inc(53092);for (int i = 0; (((i < x.length)&&(__CLR4_4_114y514y5lb90paq3.R.iget(53093)!=0|true))||(__CLR4_4_114y514y5lb90paq3.R.iget(53094)==0&false)); ++i) {{
            __CLR4_4_114y514y5lb90paq3.R.inc(53095);sumRankX += ranks[i];
        }

        /*
         * U1 = R1 - (n1 * (n1 + 1)) / 2 where R1 is sum of ranks for sample 1,
         * e.g. x, n1 is the number of observations in sample 1.
         */
        }__CLR4_4_114y514y5lb90paq3.R.inc(53096);final double U1 = sumRankX - (x.length * (x.length + 1)) / 2;

        /*
         * It can be shown that U1 + U2 = n1 * n2
         */
        __CLR4_4_114y514y5lb90paq3.R.inc(53097);final double U2 = x.length * y.length - U1;

        __CLR4_4_114y514y5lb90paq3.R.inc(53098);return FastMath.max(U1, U2);
    }finally{__CLR4_4_114y514y5lb90paq3.R.flushNeeded();}}

    /**
     * @param Umin smallest Mann-Whitney U value
     * @param n1 number of subjects in first sample
     * @param n2 number of subjects in second sample
     * @return two-sided asymptotic p-value
     * @throws ConvergenceException if the p-value can not be computed
     * due to a convergence error
     * @throws MaxCountExceededException if the maximum number of
     * iterations is exceeded
     */
    private double calculateAsymptoticPValue(final double Umin,
                                             final int n1,
                                             final int n2)
        throws ConvergenceException, MaxCountExceededException {try{__CLR4_4_114y514y5lb90paq3.R.inc(53099);

        /* long multiplication to avoid overflow (double not used due to efficiency
         * and to avoid precision loss)
         */
        __CLR4_4_114y514y5lb90paq3.R.inc(53100);final long n1n2prod = (long) n1 * n2;

        // http://en.wikipedia.org/wiki/Mann%E2%80%93Whitney_U#Normal_approximation
        __CLR4_4_114y514y5lb90paq3.R.inc(53101);final double EU = n1n2prod / 2.0;
        __CLR4_4_114y514y5lb90paq3.R.inc(53102);final double VarU = n1n2prod * (n1 + n2 + 1) / 12.0;

        __CLR4_4_114y514y5lb90paq3.R.inc(53103);final double z = (Umin - EU) / FastMath.sqrt(VarU);

        // No try-catch or advertised exception because args are valid
        __CLR4_4_114y514y5lb90paq3.R.inc(53104);final NormalDistribution standardNormal = new NormalDistribution(0, 1);

        __CLR4_4_114y514y5lb90paq3.R.inc(53105);return 2 * standardNormal.cumulativeProbability(z);
    }finally{__CLR4_4_114y514y5lb90paq3.R.flushNeeded();}}

    /**
     * Returns the asymptotic <i>observed significance level</i>, or <a href=
     * "http://www.cas.lancs.ac.uk/glossary_v1.1/hyptest.html#pvalue">
     * p-value</a>, associated with a <a
     * href="http://en.wikipedia.org/wiki/Mann%E2%80%93Whitney_U"> Mann-Whitney
     * U statistic</a> comparing mean for two independent samples.
     * <p>
     * Let X<sub>i</sub> denote the i'th individual of the first sample and
     * Y<sub>j</sub> the j'th individual in the second sample. Note that the
     * samples would often have different length.
     * </p>
     * <p>
     * <strong>Preconditions</strong>:
     * <ul>
     * <li>All observations in the two samples are independent.</li>
     * <li>The observations are at least ordinal (continuous are also ordinal).</li>
     * </ul>
     * </p><p>
     * Ties give rise to biased variance at the moment. See e.g. <a
     * href="http://mlsc.lboro.ac.uk/resources/statistics/Mannwhitney.pdf"
     * >http://mlsc.lboro.ac.uk/resources/statistics/Mannwhitney.pdf</a>.</p>
     *
     * @param x the first sample
     * @param y the second sample
     * @return asymptotic p-value
     * @throws NullArgumentException if {@code x} or {@code y} are {@code null}.
     * @throws NoDataException if {@code x} or {@code y} are zero-length.
     * @throws ConvergenceException if the p-value can not be computed due to a
     * convergence error
     * @throws MaxCountExceededException if the maximum number of iterations
     * is exceeded
     */
    public double mannWhitneyUTest(final double[] x, final double[] y)
        throws NullArgumentException, NoDataException,
        ConvergenceException, MaxCountExceededException {try{__CLR4_4_114y514y5lb90paq3.R.inc(53106);

        __CLR4_4_114y514y5lb90paq3.R.inc(53107);ensureDataConformance(x, y);

        __CLR4_4_114y514y5lb90paq3.R.inc(53108);final double Umax = mannWhitneyU(x, y);

        /*
         * It can be shown that U1 + U2 = n1 * n2
         */
        __CLR4_4_114y514y5lb90paq3.R.inc(53109);final double Umin = x.length * y.length - Umax;

        __CLR4_4_114y514y5lb90paq3.R.inc(53110);return calculateAsymptoticPValue(Umin, x.length, y.length);
    }finally{__CLR4_4_114y514y5lb90paq3.R.flushNeeded();}}

}
