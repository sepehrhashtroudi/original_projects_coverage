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
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.stat.ranking.NaNStrategy;
import org.apache.commons.math3.stat.ranking.NaturalRanking;
import org.apache.commons.math3.stat.ranking.TiesStrategy;
import org.apache.commons.math3.util.FastMath;

/**
 * An implementation of the Wilcoxon signed-rank test.
 *
 * @version $Id$
 */
public class WilcoxonSignedRankTest {static class __CLR4_4_1156o156olb90paqz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,53470,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Ranking algorithm. */
    private NaturalRanking naturalRanking;

    /**
     * Create a test instance where NaN's are left in place and ties get
     * the average of applicable ranks. Use this unless you are very sure
     * of what you are doing.
     */
    public WilcoxonSignedRankTest() {try{__CLR4_4_1156o156olb90paqz.R.inc(53376);
        __CLR4_4_1156o156olb90paqz.R.inc(53377);naturalRanking = new NaturalRanking(NaNStrategy.FIXED,
                TiesStrategy.AVERAGE);
    }finally{__CLR4_4_1156o156olb90paqz.R.flushNeeded();}}

    /**
     * Create a test instance using the given strategies for NaN's and ties.
     * Only use this if you are sure of what you are doing.
     *
     * @param nanStrategy
     *            specifies the strategy that should be used for Double.NaN's
     * @param tiesStrategy
     *            specifies the strategy that should be used for ties
     */
    public WilcoxonSignedRankTest(final NaNStrategy nanStrategy,
                                  final TiesStrategy tiesStrategy) {try{__CLR4_4_1156o156olb90paqz.R.inc(53378);
        __CLR4_4_1156o156olb90paqz.R.inc(53379);naturalRanking = new NaturalRanking(nanStrategy, tiesStrategy);
    }finally{__CLR4_4_1156o156olb90paqz.R.flushNeeded();}}

    /**
     * Ensures that the provided arrays fulfills the assumptions.
     *
     * @param x first sample
     * @param y second sample
     * @throws NullArgumentException if {@code x} or {@code y} are {@code null}.
     * @throws NoDataException if {@code x} or {@code y} are zero-length.
     * @throws DimensionMismatchException if {@code x} and {@code y} do not
     * have the same length.
     */
    private void ensureDataConformance(final double[] x, final double[] y)
        throws NullArgumentException, NoDataException, DimensionMismatchException {try{__CLR4_4_1156o156olb90paqz.R.inc(53380);

        __CLR4_4_1156o156olb90paqz.R.inc(53381);if ((((x == null ||
            y == null)&&(__CLR4_4_1156o156olb90paqz.R.iget(53382)!=0|true))||(__CLR4_4_1156o156olb90paqz.R.iget(53383)==0&false))) {{
                __CLR4_4_1156o156olb90paqz.R.inc(53384);throw new NullArgumentException();
        }
        }__CLR4_4_1156o156olb90paqz.R.inc(53385);if ((((x.length == 0 ||
            y.length == 0)&&(__CLR4_4_1156o156olb90paqz.R.iget(53386)!=0|true))||(__CLR4_4_1156o156olb90paqz.R.iget(53387)==0&false))) {{
            __CLR4_4_1156o156olb90paqz.R.inc(53388);throw new NoDataException();
        }
        }__CLR4_4_1156o156olb90paqz.R.inc(53389);if ((((y.length != x.length)&&(__CLR4_4_1156o156olb90paqz.R.iget(53390)!=0|true))||(__CLR4_4_1156o156olb90paqz.R.iget(53391)==0&false))) {{
            __CLR4_4_1156o156olb90paqz.R.inc(53392);throw new DimensionMismatchException(y.length, x.length);
        }
    }}finally{__CLR4_4_1156o156olb90paqz.R.flushNeeded();}}

    /**
     * Calculates y[i] - x[i] for all i
     *
     * @param x first sample
     * @param y second sample
     * @return z = y - x
     */
    private double[] calculateDifferences(final double[] x, final double[] y) {try{__CLR4_4_1156o156olb90paqz.R.inc(53393);

        __CLR4_4_1156o156olb90paqz.R.inc(53394);final double[] z = new double[x.length];

        __CLR4_4_1156o156olb90paqz.R.inc(53395);for (int i = 0; (((i < x.length)&&(__CLR4_4_1156o156olb90paqz.R.iget(53396)!=0|true))||(__CLR4_4_1156o156olb90paqz.R.iget(53397)==0&false)); ++i) {{
            __CLR4_4_1156o156olb90paqz.R.inc(53398);z[i] = y[i] - x[i];
        }

        }__CLR4_4_1156o156olb90paqz.R.inc(53399);return z;
    }finally{__CLR4_4_1156o156olb90paqz.R.flushNeeded();}}

    /**
     * Calculates |z[i]| for all i
     *
     * @param z sample
     * @return |z|
     * @throws NullArgumentException if {@code z} is {@code null}
     * @throws NoDataException if {@code z} is zero-length.
     */
    private double[] calculateAbsoluteDifferences(final double[] z)
        throws NullArgumentException, NoDataException {try{__CLR4_4_1156o156olb90paqz.R.inc(53400);

        __CLR4_4_1156o156olb90paqz.R.inc(53401);if ((((z == null)&&(__CLR4_4_1156o156olb90paqz.R.iget(53402)!=0|true))||(__CLR4_4_1156o156olb90paqz.R.iget(53403)==0&false))) {{
            __CLR4_4_1156o156olb90paqz.R.inc(53404);throw new NullArgumentException();
        }

        }__CLR4_4_1156o156olb90paqz.R.inc(53405);if ((((z.length == 0)&&(__CLR4_4_1156o156olb90paqz.R.iget(53406)!=0|true))||(__CLR4_4_1156o156olb90paqz.R.iget(53407)==0&false))) {{
            __CLR4_4_1156o156olb90paqz.R.inc(53408);throw new NoDataException();
        }

        }__CLR4_4_1156o156olb90paqz.R.inc(53409);final double[] zAbs = new double[z.length];

        __CLR4_4_1156o156olb90paqz.R.inc(53410);for (int i = 0; (((i < z.length)&&(__CLR4_4_1156o156olb90paqz.R.iget(53411)!=0|true))||(__CLR4_4_1156o156olb90paqz.R.iget(53412)==0&false)); ++i) {{
            __CLR4_4_1156o156olb90paqz.R.inc(53413);zAbs[i] = FastMath.abs(z[i]);
        }

        }__CLR4_4_1156o156olb90paqz.R.inc(53414);return zAbs;
    }finally{__CLR4_4_1156o156olb90paqz.R.flushNeeded();}}

    /**
     * Computes the <a
     * href="http://en.wikipedia.org/wiki/Wilcoxon_signed-rank_test">
     * Wilcoxon signed ranked statistic</a> comparing mean for two related
     * samples or repeated measurements on a single sample.
     * <p>
     * This statistic can be used to perform a Wilcoxon signed ranked test
     * evaluating the null hypothesis that the two related samples or repeated
     * measurements on a single sample has equal mean.
     * </p>
     * <p>
     * Let X<sub>i</sub> denote the i'th individual of the first sample and
     * Y<sub>i</sub> the related i'th individual in the second sample. Let
     * Z<sub>i</sub> = Y<sub>i</sub> - X<sub>i</sub>.
     * </p>
     * <p>
     * <strong>Preconditions</strong>:
     * <ul>
     * <li>The differences Z<sub>i</sub> must be independent.</li>
     * <li>Each Z<sub>i</sub> comes from a continuous population (they must be
     * identical) and is symmetric about a common median.</li>
     * <li>The values that X<sub>i</sub> and Y<sub>i</sub> represent are
     * ordered, so the comparisons greater than, less than, and equal to are
     * meaningful.</li>
     * </ul>
     * </p>
     *
     * @param x the first sample
     * @param y the second sample
     * @return wilcoxonSignedRank statistic (the larger of W+ and W-)
     * @throws NullArgumentException if {@code x} or {@code y} are {@code null}.
     * @throws NoDataException if {@code x} or {@code y} are zero-length.
     * @throws DimensionMismatchException if {@code x} and {@code y} do not
     * have the same length.
     */
    public double wilcoxonSignedRank(final double[] x, final double[] y)
        throws NullArgumentException, NoDataException, DimensionMismatchException {try{__CLR4_4_1156o156olb90paqz.R.inc(53415);

        __CLR4_4_1156o156olb90paqz.R.inc(53416);ensureDataConformance(x, y);

        // throws IllegalArgumentException if x and y are not correctly
        // specified
        __CLR4_4_1156o156olb90paqz.R.inc(53417);final double[] z = calculateDifferences(x, y);
        __CLR4_4_1156o156olb90paqz.R.inc(53418);final double[] zAbs = calculateAbsoluteDifferences(z);

        __CLR4_4_1156o156olb90paqz.R.inc(53419);final double[] ranks = naturalRanking.rank(zAbs);

        __CLR4_4_1156o156olb90paqz.R.inc(53420);double Wplus = 0;

        __CLR4_4_1156o156olb90paqz.R.inc(53421);for (int i = 0; (((i < z.length)&&(__CLR4_4_1156o156olb90paqz.R.iget(53422)!=0|true))||(__CLR4_4_1156o156olb90paqz.R.iget(53423)==0&false)); ++i) {{
            __CLR4_4_1156o156olb90paqz.R.inc(53424);if ((((z[i] > 0)&&(__CLR4_4_1156o156olb90paqz.R.iget(53425)!=0|true))||(__CLR4_4_1156o156olb90paqz.R.iget(53426)==0&false))) {{
                __CLR4_4_1156o156olb90paqz.R.inc(53427);Wplus += ranks[i];
            }
        }}

        }__CLR4_4_1156o156olb90paqz.R.inc(53428);final int N = x.length;
        __CLR4_4_1156o156olb90paqz.R.inc(53429);final double Wminus = (((double) (N * (N + 1))) / 2.0) - Wplus;

        __CLR4_4_1156o156olb90paqz.R.inc(53430);return FastMath.max(Wplus, Wminus);
    }finally{__CLR4_4_1156o156olb90paqz.R.flushNeeded();}}

    /**
     * Algorithm inspired by
     * http://www.fon.hum.uva.nl/Service/Statistics/Signed_Rank_Algorihms.html#C
     * by Rob van Son, Institute of Phonetic Sciences & IFOTT,
     * University of Amsterdam
     *
     * @param Wmax largest Wilcoxon signed rank value
     * @param N number of subjects (corresponding to x.length)
     * @return two-sided exact p-value
     */
    private double calculateExactPValue(final double Wmax, final int N) {try{__CLR4_4_1156o156olb90paqz.R.inc(53431);

        // Total number of outcomes (equal to 2^N but a lot faster)
        __CLR4_4_1156o156olb90paqz.R.inc(53432);final int m = 1 << N;

        __CLR4_4_1156o156olb90paqz.R.inc(53433);int largerRankSums = 0;

        __CLR4_4_1156o156olb90paqz.R.inc(53434);for (int i = 0; (((i < m)&&(__CLR4_4_1156o156olb90paqz.R.iget(53435)!=0|true))||(__CLR4_4_1156o156olb90paqz.R.iget(53436)==0&false)); ++i) {{
            __CLR4_4_1156o156olb90paqz.R.inc(53437);int rankSum = 0;

            // Generate all possible rank sums
            __CLR4_4_1156o156olb90paqz.R.inc(53438);for (int j = 0; (((j < N)&&(__CLR4_4_1156o156olb90paqz.R.iget(53439)!=0|true))||(__CLR4_4_1156o156olb90paqz.R.iget(53440)==0&false)); ++j) {{

                // (i >> j) & 1 extract i's j-th bit from the right
                __CLR4_4_1156o156olb90paqz.R.inc(53441);if ((((((i >> j) & 1) == 1)&&(__CLR4_4_1156o156olb90paqz.R.iget(53442)!=0|true))||(__CLR4_4_1156o156olb90paqz.R.iget(53443)==0&false))) {{
                    __CLR4_4_1156o156olb90paqz.R.inc(53444);rankSum += j + 1;
                }
            }}

            }__CLR4_4_1156o156olb90paqz.R.inc(53445);if ((((rankSum >= Wmax)&&(__CLR4_4_1156o156olb90paqz.R.iget(53446)!=0|true))||(__CLR4_4_1156o156olb90paqz.R.iget(53447)==0&false))) {{
                __CLR4_4_1156o156olb90paqz.R.inc(53448);++largerRankSums;
            }
        }}

        /*
         * largerRankSums / m gives the one-sided p-value, so it's multiplied
         * with 2 to get the two-sided p-value
         */
        }__CLR4_4_1156o156olb90paqz.R.inc(53449);return 2 * ((double) largerRankSums) / ((double) m);
    }finally{__CLR4_4_1156o156olb90paqz.R.flushNeeded();}}

    /**
     * @param Wmin smallest Wilcoxon signed rank value
     * @param N number of subjects (corresponding to x.length)
     * @return two-sided asymptotic p-value
     */
    private double calculateAsymptoticPValue(final double Wmin, final int N) {try{__CLR4_4_1156o156olb90paqz.R.inc(53450);

        __CLR4_4_1156o156olb90paqz.R.inc(53451);final double ES = (double) (N * (N + 1)) / 4.0;

        /* Same as (but saves computations):
         * final double VarW = ((double) (N * (N + 1) * (2*N + 1))) / 24;
         */
        __CLR4_4_1156o156olb90paqz.R.inc(53452);final double VarS = ES * ((double) (2 * N + 1) / 6.0);

        // - 0.5 is a continuity correction
        __CLR4_4_1156o156olb90paqz.R.inc(53453);final double z = (Wmin - ES - 0.5) / FastMath.sqrt(VarS);

        // No try-catch or advertised exception because args are valid
        __CLR4_4_1156o156olb90paqz.R.inc(53454);final NormalDistribution standardNormal = new NormalDistribution(0, 1);

        __CLR4_4_1156o156olb90paqz.R.inc(53455);return 2*standardNormal.cumulativeProbability(z);
    }finally{__CLR4_4_1156o156olb90paqz.R.flushNeeded();}}

    /**
     * Returns the <i>observed significance level</i>, or <a href=
     * "http://www.cas.lancs.ac.uk/glossary_v1.1/hyptest.html#pvalue">
     * p-value</a>, associated with a <a
     * href="http://en.wikipedia.org/wiki/Wilcoxon_signed-rank_test">
     * Wilcoxon signed ranked statistic</a> comparing mean for two related
     * samples or repeated measurements on a single sample.
     * <p>
     * Let X<sub>i</sub> denote the i'th individual of the first sample and
     * Y<sub>i</sub> the related i'th individual in the second sample. Let
     * Z<sub>i</sub> = Y<sub>i</sub> - X<sub>i</sub>.
     * </p>
     * <p>
     * <strong>Preconditions</strong>:
     * <ul>
     * <li>The differences Z<sub>i</sub> must be independent.</li>
     * <li>Each Z<sub>i</sub> comes from a continuous population (they must be
     * identical) and is symmetric about a common median.</li>
     * <li>The values that X<sub>i</sub> and Y<sub>i</sub> represent are
     * ordered, so the comparisons greater than, less than, and equal to are
     * meaningful.</li>
     * </ul>
     * </p>
     *
     * @param x the first sample
     * @param y the second sample
     * @param exactPValue
     *            if the exact p-value is wanted (only works for x.length <= 30,
     *            if true and x.length > 30, this is ignored because
     *            calculations may take too long)
     * @return p-value
     * @throws NullArgumentException if {@code x} or {@code y} are {@code null}.
     * @throws NoDataException if {@code x} or {@code y} are zero-length.
     * @throws DimensionMismatchException if {@code x} and {@code y} do not
     * have the same length.
     * @throws NumberIsTooLargeException if {@code exactPValue} is {@code true}
     * and {@code x.length} > 30
     * @throws ConvergenceException if the p-value can not be computed due to
     * a convergence error
     * @throws MaxCountExceededException if the maximum number of iterations
     * is exceeded
     */
    public double wilcoxonSignedRankTest(final double[] x, final double[] y,
                                         final boolean exactPValue)
        throws NullArgumentException, NoDataException, DimensionMismatchException,
        NumberIsTooLargeException, ConvergenceException, MaxCountExceededException {try{__CLR4_4_1156o156olb90paqz.R.inc(53456);

        __CLR4_4_1156o156olb90paqz.R.inc(53457);ensureDataConformance(x, y);

        __CLR4_4_1156o156olb90paqz.R.inc(53458);final int N = x.length;
        __CLR4_4_1156o156olb90paqz.R.inc(53459);final double Wmax = wilcoxonSignedRank(x, y);

        __CLR4_4_1156o156olb90paqz.R.inc(53460);if ((((exactPValue && N > 30)&&(__CLR4_4_1156o156olb90paqz.R.iget(53461)!=0|true))||(__CLR4_4_1156o156olb90paqz.R.iget(53462)==0&false))) {{
            __CLR4_4_1156o156olb90paqz.R.inc(53463);throw new NumberIsTooLargeException(N, 30, true);
        }

        }__CLR4_4_1156o156olb90paqz.R.inc(53464);if ((((exactPValue)&&(__CLR4_4_1156o156olb90paqz.R.iget(53465)!=0|true))||(__CLR4_4_1156o156olb90paqz.R.iget(53466)==0&false))) {{
            __CLR4_4_1156o156olb90paqz.R.inc(53467);return calculateExactPValue(Wmax, N);
        } }else {{
            __CLR4_4_1156o156olb90paqz.R.inc(53468);final double Wmin = ( (double)(N*(N+1)) / 2.0 ) - Wmax;
            __CLR4_4_1156o156olb90paqz.R.inc(53469);return calculateAsymptoticPValue(Wmin, N);
        }
    }}finally{__CLR4_4_1156o156olb90paqz.R.flushNeeded();}}
}
