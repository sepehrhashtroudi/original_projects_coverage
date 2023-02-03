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

import org.apache.commons.math3.distribution.ChiSquaredDistribution;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.ZeroException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathArrays;

/**
 * Implements <a href="http://en.wikipedia.org/wiki/G-test">G Test</a>
 * statistics.
 *
 * <p>This is known in statistical genetics as the McDonald-Kreitman test.
 * The implementation handles both known and unknown distributions.</p>
 *
 * <p>Two samples tests can be used when the distribution is unknown <i>a priori</i>
 * but provided by one sample, or when the hypothesis under test is that the two
 * samples come from the same underlying distribution.</p>
 *
 * @version $Id$
 * @since 3.1
 */
public class GTest {static class __CLR4_4_114ue14uelb90papz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,53069,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Computes the <a href="http://en.wikipedia.org/wiki/G-test">G statistic
     * for Goodness of Fit</a> comparing {@code observed} and {@code expected}
     * frequency counts.
     *
     * <p>This statistic can be used to perform a G test (Log-Likelihood Ratio
     * Test) evaluating the null hypothesis that the observed counts follow the
     * expected distribution.</p>
     *
     * <p><strong>Preconditions</strong>: <ul>
     * <li>Expected counts must all be positive. </li>
     * <li>Observed counts must all be &ge; 0. </li>
     * <li>The observed and expected arrays must have the same length and their
     * common length must be at least 2. </li></ul></p>
     *
     * <p>If any of the preconditions are not met, a
     * {@code MathIllegalArgumentException} is thrown.</p>
     *
     * <p><strong>Note:</strong>This implementation rescales the
     * {@code expected} array if necessary to ensure that the sum of the
     * expected and observed counts are equal.</p>
     *
     * @param observed array of observed frequency counts
     * @param expected array of expected frequency counts
     * @return G-Test statistic
     * @throws NotPositiveException if {@code observed} has negative entries
     * @throws NotStrictlyPositiveException if {@code expected} has entries that
     * are not strictly positive
     * @throws DimensionMismatchException if the array lengths do not match or
     * are less than 2.
     */
    public double g(final double[] expected, final long[] observed)
            throws NotPositiveException, NotStrictlyPositiveException,
            DimensionMismatchException {try{__CLR4_4_114ue14uelb90papz.R.inc(52934);

        __CLR4_4_114ue14uelb90papz.R.inc(52935);if ((((expected.length < 2)&&(__CLR4_4_114ue14uelb90papz.R.iget(52936)!=0|true))||(__CLR4_4_114ue14uelb90papz.R.iget(52937)==0&false))) {{
            __CLR4_4_114ue14uelb90papz.R.inc(52938);throw new DimensionMismatchException(expected.length, 2);
        }
        }__CLR4_4_114ue14uelb90papz.R.inc(52939);if ((((expected.length != observed.length)&&(__CLR4_4_114ue14uelb90papz.R.iget(52940)!=0|true))||(__CLR4_4_114ue14uelb90papz.R.iget(52941)==0&false))) {{
            __CLR4_4_114ue14uelb90papz.R.inc(52942);throw new DimensionMismatchException(expected.length, observed.length);
        }
        }__CLR4_4_114ue14uelb90papz.R.inc(52943);MathArrays.checkPositive(expected);
        __CLR4_4_114ue14uelb90papz.R.inc(52944);MathArrays.checkNonNegative(observed);

        __CLR4_4_114ue14uelb90papz.R.inc(52945);double sumExpected = 0d;
        __CLR4_4_114ue14uelb90papz.R.inc(52946);double sumObserved = 0d;
        __CLR4_4_114ue14uelb90papz.R.inc(52947);for (int i = 0; (((i < observed.length)&&(__CLR4_4_114ue14uelb90papz.R.iget(52948)!=0|true))||(__CLR4_4_114ue14uelb90papz.R.iget(52949)==0&false)); i++) {{
            __CLR4_4_114ue14uelb90papz.R.inc(52950);sumExpected += expected[i];
            __CLR4_4_114ue14uelb90papz.R.inc(52951);sumObserved += observed[i];
        }
        }__CLR4_4_114ue14uelb90papz.R.inc(52952);double ratio = 1d;
        __CLR4_4_114ue14uelb90papz.R.inc(52953);boolean rescale = false;
        __CLR4_4_114ue14uelb90papz.R.inc(52954);if ((((Math.abs(sumExpected - sumObserved) > 10E-6)&&(__CLR4_4_114ue14uelb90papz.R.iget(52955)!=0|true))||(__CLR4_4_114ue14uelb90papz.R.iget(52956)==0&false))) {{
            __CLR4_4_114ue14uelb90papz.R.inc(52957);ratio = sumObserved / sumExpected;
            __CLR4_4_114ue14uelb90papz.R.inc(52958);rescale = true;
        }
        }__CLR4_4_114ue14uelb90papz.R.inc(52959);double sum = 0d;
        __CLR4_4_114ue14uelb90papz.R.inc(52960);for (int i = 0; (((i < observed.length)&&(__CLR4_4_114ue14uelb90papz.R.iget(52961)!=0|true))||(__CLR4_4_114ue14uelb90papz.R.iget(52962)==0&false)); i++) {{
            __CLR4_4_114ue14uelb90papz.R.inc(52963);final double dev = (((rescale )&&(__CLR4_4_114ue14uelb90papz.R.iget(52964)!=0|true))||(__CLR4_4_114ue14uelb90papz.R.iget(52965)==0&false))?
                    FastMath.log((double) observed[i] / (ratio * expected[i])) :
                        FastMath.log((double) observed[i] / expected[i]);
            __CLR4_4_114ue14uelb90papz.R.inc(52966);sum += ((double) observed[i]) * dev;
        }
        }__CLR4_4_114ue14uelb90papz.R.inc(52967);return 2d * sum;
    }finally{__CLR4_4_114ue14uelb90papz.R.flushNeeded();}}

    /**
     * Returns the <i>observed significance level</i>, or <a href=
     * "http://www.cas.lancs.ac.uk/glossary_v1.1/hyptest.html#pvalue"> p-value</a>,
     * associated with a G-Test for goodness of fit</a> comparing the
     * {@code observed} frequency counts to those in the {@code expected} array.
     *
     * <p>The number returned is the smallest significance level at which one
     * can reject the null hypothesis that the observed counts conform to the
     * frequency distribution described by the expected counts.</p>
     *
     * <p>The probability returned is the tail probability beyond
     * {@link #g(double[], long[]) g(expected, observed)}
     * in the ChiSquare distribution with degrees of freedom one less than the
     * common length of {@code expected} and {@code observed}.</p>
     *
     * <p> <strong>Preconditions</strong>: <ul>
     * <li>Expected counts must all be positive. </li>
     * <li>Observed counts must all be &ge; 0. </li>
     * <li>The observed and expected arrays must have the
     * same length and their common length must be at least 2.</li>
     * </ul></p>
     *
     * <p>If any of the preconditions are not met, a
     * {@code MathIllegalArgumentException} is thrown.</p>
     *
     * <p><strong>Note:</strong>This implementation rescales the
     * {@code expected} array if necessary to ensure that the sum of the
     *  expected and observed counts are equal.</p>
     *
     * @param observed array of observed frequency counts
     * @param expected array of expected frequency counts
     * @return p-value
     * @throws NotPositiveException if {@code observed} has negative entries
     * @throws NotStrictlyPositiveException if {@code expected} has entries that
     * are not strictly positive
     * @throws DimensionMismatchException if the array lengths do not match or
     * are less than 2.
     * @throws MaxCountExceededException if an error occurs computing the
     * p-value.
     */
    public double gTest(final double[] expected, final long[] observed)
            throws NotPositiveException, NotStrictlyPositiveException,
            DimensionMismatchException, MaxCountExceededException {try{__CLR4_4_114ue14uelb90papz.R.inc(52968);

        __CLR4_4_114ue14uelb90papz.R.inc(52969);final ChiSquaredDistribution distribution =
                new ChiSquaredDistribution(expected.length - 1.0);
        __CLR4_4_114ue14uelb90papz.R.inc(52970);return 1.0 - distribution.cumulativeProbability(
                g(expected, observed));
    }finally{__CLR4_4_114ue14uelb90papz.R.flushNeeded();}}

    /**
     * Returns the intrinsic (Hardy-Weinberg proportions) p-Value, as described
     * in p64-69 of McDonald, J.H. 2009. Handbook of Biological Statistics
     * (2nd ed.). Sparky House Publishing, Baltimore, Maryland.
     *
     * <p> The probability returned is the tail probability beyond
     * {@link #g(double[], long[]) g(expected, observed)}
     * in the ChiSquare distribution with degrees of freedom two less than the
     * common length of {@code expected} and {@code observed}.</p>
     *
     * @param observed array of observed frequency counts
     * @param expected array of expected frequency counts
     * @return p-value
     * @throws NotPositiveException if {@code observed} has negative entries
     * @throws NotStrictlyPositiveException {@code expected} has entries that are
     * not strictly positive
     * @throws DimensionMismatchException if the array lengths do not match or
     * are less than 2.
     * @throws MaxCountExceededException if an error occurs computing the
     * p-value.
     */
    public double gTestIntrinsic(final double[] expected, final long[] observed)
            throws NotPositiveException, NotStrictlyPositiveException,
            DimensionMismatchException, MaxCountExceededException {try{__CLR4_4_114ue14uelb90papz.R.inc(52971);

        __CLR4_4_114ue14uelb90papz.R.inc(52972);final ChiSquaredDistribution distribution =
                new ChiSquaredDistribution(expected.length - 2.0);
        __CLR4_4_114ue14uelb90papz.R.inc(52973);return 1.0 - distribution.cumulativeProbability(
                g(expected, observed));
    }finally{__CLR4_4_114ue14uelb90papz.R.flushNeeded();}}

    /**
     * Performs a G-Test (Log-Likelihood Ratio Test) for goodness of fit
     * evaluating the null hypothesis that the observed counts conform to the
     * frequency distribution described by the expected counts, with
     * significance level {@code alpha}. Returns true iff the null
     * hypothesis can be rejected with {@code 100 * (1 - alpha)} percent confidence.
     *
     * <p><strong>Example:</strong><br> To test the hypothesis that
     * {@code observed} follows {@code expected} at the 99% level,
     * use </p><p>
     * {@code gTest(expected, observed, 0.01)}</p>
     *
     * <p>Returns true iff {@link #gTest(double[], long[])
     *  gTestGoodnessOfFitPValue(expected, observed)} < alpha</p>
     *
     * <p><strong>Preconditions</strong>: <ul>
     * <li>Expected counts must all be positive. </li>
     * <li>Observed counts must all be &ge; 0. </li>
     * <li>The observed and expected arrays must have the same length and their
     * common length must be at least 2.
     * <li> {@code 0 < alpha < 0.5} </li></ul></p>
     *
     * <p>If any of the preconditions are not met, a
     * {@code MathIllegalArgumentException} is thrown.</p>
     *
     * <p><strong>Note:</strong>This implementation rescales the
     * {@code expected} array if necessary to ensure that the sum of the
     * expected and observed counts are equal.</p>
     *
     * @param observed array of observed frequency counts
     * @param expected array of expected frequency counts
     * @param alpha significance level of the test
     * @return true iff null hypothesis can be rejected with confidence 1 -
     * alpha
     * @throws NotPositiveException if {@code observed} has negative entries
     * @throws NotStrictlyPositiveException if {@code expected} has entries that
     * are not strictly positive
     * @throws DimensionMismatchException if the array lengths do not match or
     * are less than 2.
     * @throws MaxCountExceededException if an error occurs computing the
     * p-value.
     * @throws OutOfRangeException if alpha is not strictly greater than zero
     * and less than or equal to 0.5
     */
    public boolean gTest(final double[] expected, final long[] observed,
            final double alpha)
            throws NotPositiveException, NotStrictlyPositiveException,
            DimensionMismatchException, OutOfRangeException, MaxCountExceededException {try{__CLR4_4_114ue14uelb90papz.R.inc(52974);

        __CLR4_4_114ue14uelb90papz.R.inc(52975);if (((((alpha <= 0) || (alpha > 0.5))&&(__CLR4_4_114ue14uelb90papz.R.iget(52976)!=0|true))||(__CLR4_4_114ue14uelb90papz.R.iget(52977)==0&false))) {{
            __CLR4_4_114ue14uelb90papz.R.inc(52978);throw new OutOfRangeException(LocalizedFormats.OUT_OF_BOUND_SIGNIFICANCE_LEVEL,
                    alpha, 0, 0.5);
        }
        }__CLR4_4_114ue14uelb90papz.R.inc(52979);return gTest(expected, observed) < alpha;
    }finally{__CLR4_4_114ue14uelb90papz.R.flushNeeded();}}

    /**
     * Calculates the <a href=
     * "http://en.wikipedia.org/wiki/Entropy_%28information_theory%29">Shannon
     * entropy</a> for 2 Dimensional Matrix.  The value returned is the entropy
     * of the vector formed by concatenating the rows (or columns) of {@code k}
     * to form a vector. See {@link #entropy(long[])}.
     *
     * @param k 2 Dimensional Matrix of long values (for ex. the counts of a
     * trials)
     * @return Shannon Entropy of the given Matrix
     *
     */
    private double entropy(final long[][] k) {try{__CLR4_4_114ue14uelb90papz.R.inc(52980);
        __CLR4_4_114ue14uelb90papz.R.inc(52981);double h = 0d;
        __CLR4_4_114ue14uelb90papz.R.inc(52982);double sum_k = 0d;
        __CLR4_4_114ue14uelb90papz.R.inc(52983);for (int i = 0; (((i < k.length)&&(__CLR4_4_114ue14uelb90papz.R.iget(52984)!=0|true))||(__CLR4_4_114ue14uelb90papz.R.iget(52985)==0&false)); i++) {{
            __CLR4_4_114ue14uelb90papz.R.inc(52986);for (int j = 0; (((j < k[i].length)&&(__CLR4_4_114ue14uelb90papz.R.iget(52987)!=0|true))||(__CLR4_4_114ue14uelb90papz.R.iget(52988)==0&false)); j++) {{
                __CLR4_4_114ue14uelb90papz.R.inc(52989);sum_k += (double) k[i][j];
            }
        }}
        }__CLR4_4_114ue14uelb90papz.R.inc(52990);for (int i = 0; (((i < k.length)&&(__CLR4_4_114ue14uelb90papz.R.iget(52991)!=0|true))||(__CLR4_4_114ue14uelb90papz.R.iget(52992)==0&false)); i++) {{
            __CLR4_4_114ue14uelb90papz.R.inc(52993);for (int j = 0; (((j < k[i].length)&&(__CLR4_4_114ue14uelb90papz.R.iget(52994)!=0|true))||(__CLR4_4_114ue14uelb90papz.R.iget(52995)==0&false)); j++) {{
                __CLR4_4_114ue14uelb90papz.R.inc(52996);if ((((k[i][j] != 0)&&(__CLR4_4_114ue14uelb90papz.R.iget(52997)!=0|true))||(__CLR4_4_114ue14uelb90papz.R.iget(52998)==0&false))) {{
                    __CLR4_4_114ue14uelb90papz.R.inc(52999);final double p_ij = (double) k[i][j] / sum_k;
                    __CLR4_4_114ue14uelb90papz.R.inc(53000);h += p_ij * Math.log(p_ij);
                }
            }}
        }}
        }__CLR4_4_114ue14uelb90papz.R.inc(53001);return -h;
    }finally{__CLR4_4_114ue14uelb90papz.R.flushNeeded();}}

    /**
     * Calculates the <a href="http://en.wikipedia.org/wiki/Entropy_%28information_theory%29">
     * Shannon entropy</a> for a vector.  The values of {@code k} are taken to be
     * incidence counts of the values of a random variable. What is returned is <br/>
     * &sum;p<sub>i</sub>log(p<sub>i</sub><br/>
     * where p<sub>i</sub> = k[i] / (sum of elements in k)
     *
     * @param k Vector (for ex. Row Sums of a trials)
     * @return Shannon Entropy of the given Vector
     *
     */
    private double entropy(final long[] k) {try{__CLR4_4_114ue14uelb90papz.R.inc(53002);
        __CLR4_4_114ue14uelb90papz.R.inc(53003);double h = 0d;
        __CLR4_4_114ue14uelb90papz.R.inc(53004);double sum_k = 0d;
        __CLR4_4_114ue14uelb90papz.R.inc(53005);for (int i = 0; (((i < k.length)&&(__CLR4_4_114ue14uelb90papz.R.iget(53006)!=0|true))||(__CLR4_4_114ue14uelb90papz.R.iget(53007)==0&false)); i++) {{
            __CLR4_4_114ue14uelb90papz.R.inc(53008);sum_k += (double) k[i];
        }
        }__CLR4_4_114ue14uelb90papz.R.inc(53009);for (int i = 0; (((i < k.length)&&(__CLR4_4_114ue14uelb90papz.R.iget(53010)!=0|true))||(__CLR4_4_114ue14uelb90papz.R.iget(53011)==0&false)); i++) {{
            __CLR4_4_114ue14uelb90papz.R.inc(53012);if ((((k[i] != 0)&&(__CLR4_4_114ue14uelb90papz.R.iget(53013)!=0|true))||(__CLR4_4_114ue14uelb90papz.R.iget(53014)==0&false))) {{
                __CLR4_4_114ue14uelb90papz.R.inc(53015);final double p_i = (double) k[i] / sum_k;
                __CLR4_4_114ue14uelb90papz.R.inc(53016);h += p_i * Math.log(p_i);
            }
        }}
        }__CLR4_4_114ue14uelb90papz.R.inc(53017);return -h;
    }finally{__CLR4_4_114ue14uelb90papz.R.flushNeeded();}}

    /**
     * <p>Computes a G (Log-Likelihood Ratio) two sample test statistic for
     * independence comparing frequency counts in
     * {@code observed1} and {@code observed2}. The sums of frequency
     * counts in the two samples are not required to be the same. The formula
     * used to compute the test statistic is </p>
     *
     * <p>{@code 2 * totalSum * [H(rowSums) + H(colSums) - H(k)]}</p>
     *
     * <p> where {@code H} is the
     * <a href="http://en.wikipedia.org/wiki/Entropy_%28information_theory%29">
     * Shannon Entropy</a> of the random variable formed by viewing the elements
     * of the argument array as incidence counts; <br/>
     * {@code k} is a matrix with rows {@code [observed1, observed2]}; <br/>
     * {@code rowSums, colSums} are the row/col sums of {@code k}; <br>
     * and {@code totalSum} is the overall sum of all entries in {@code k}.</p>
     *
     * <p>This statistic can be used to perform a G test evaluating the null
     * hypothesis that both observed counts are independent </p>
     *
     * <p> <strong>Preconditions</strong>: <ul>
     * <li>Observed counts must be non-negative. </li>
     * <li>Observed counts for a specific bin must not both be zero. </li>
     * <li>Observed counts for a specific sample must not all be  0. </li>
     * <li>The arrays {@code observed1} and {@code observed2} must have
     * the same length and their common length must be at least 2. </li></ul></p>
     *
     * <p>If any of the preconditions are not met, a
     * {@code MathIllegalArgumentException} is thrown.</p>
     *
     * @param observed1 array of observed frequency counts of the first data set
     * @param observed2 array of observed frequency counts of the second data
     * set
     * @return G-Test statistic
     * @throws DimensionMismatchException the the lengths of the arrays do not
     * match or their common length is less than 2
     * @throws NotPositiveException if any entry in {@code observed1} or
     * {@code observed2} is negative
     * @throws ZeroException if either all counts of
     * {@code observed1} or {@code observed2} are zero, or if the count
     * at the same index is zero for both arrays.
     */
    public double gDataSetsComparison(final long[] observed1, final long[] observed2)
            throws DimensionMismatchException, NotPositiveException, ZeroException {try{__CLR4_4_114ue14uelb90papz.R.inc(53018);

        // Make sure lengths are same
        __CLR4_4_114ue14uelb90papz.R.inc(53019);if ((((observed1.length < 2)&&(__CLR4_4_114ue14uelb90papz.R.iget(53020)!=0|true))||(__CLR4_4_114ue14uelb90papz.R.iget(53021)==0&false))) {{
            __CLR4_4_114ue14uelb90papz.R.inc(53022);throw new DimensionMismatchException(observed1.length, 2);
        }
        }__CLR4_4_114ue14uelb90papz.R.inc(53023);if ((((observed1.length != observed2.length)&&(__CLR4_4_114ue14uelb90papz.R.iget(53024)!=0|true))||(__CLR4_4_114ue14uelb90papz.R.iget(53025)==0&false))) {{
            __CLR4_4_114ue14uelb90papz.R.inc(53026);throw new DimensionMismatchException(observed1.length, observed2.length);
        }

        // Ensure non-negative counts
        }__CLR4_4_114ue14uelb90papz.R.inc(53027);MathArrays.checkNonNegative(observed1);
        __CLR4_4_114ue14uelb90papz.R.inc(53028);MathArrays.checkNonNegative(observed2);

        // Compute and compare count sums
        __CLR4_4_114ue14uelb90papz.R.inc(53029);long countSum1 = 0;
        __CLR4_4_114ue14uelb90papz.R.inc(53030);long countSum2 = 0;

        // Compute and compare count sums
        __CLR4_4_114ue14uelb90papz.R.inc(53031);final long[] collSums = new long[observed1.length];
        __CLR4_4_114ue14uelb90papz.R.inc(53032);final long[][] k = new long[2][observed1.length];

        __CLR4_4_114ue14uelb90papz.R.inc(53033);for (int i = 0; (((i < observed1.length)&&(__CLR4_4_114ue14uelb90papz.R.iget(53034)!=0|true))||(__CLR4_4_114ue14uelb90papz.R.iget(53035)==0&false)); i++) {{
            __CLR4_4_114ue14uelb90papz.R.inc(53036);if ((((observed1[i] == 0 && observed2[i] == 0)&&(__CLR4_4_114ue14uelb90papz.R.iget(53037)!=0|true))||(__CLR4_4_114ue14uelb90papz.R.iget(53038)==0&false))) {{
                __CLR4_4_114ue14uelb90papz.R.inc(53039);throw new ZeroException(LocalizedFormats.OBSERVED_COUNTS_BOTTH_ZERO_FOR_ENTRY, i);
            } }else {{
                __CLR4_4_114ue14uelb90papz.R.inc(53040);countSum1 += observed1[i];
                __CLR4_4_114ue14uelb90papz.R.inc(53041);countSum2 += observed2[i];
                __CLR4_4_114ue14uelb90papz.R.inc(53042);collSums[i] = observed1[i] + observed2[i];
                __CLR4_4_114ue14uelb90papz.R.inc(53043);k[0][i] = observed1[i];
                __CLR4_4_114ue14uelb90papz.R.inc(53044);k[1][i] = observed2[i];
            }
        }}
        // Ensure neither sample is uniformly 0
        }__CLR4_4_114ue14uelb90papz.R.inc(53045);if ((((countSum1 == 0 || countSum2 == 0)&&(__CLR4_4_114ue14uelb90papz.R.iget(53046)!=0|true))||(__CLR4_4_114ue14uelb90papz.R.iget(53047)==0&false))) {{
            __CLR4_4_114ue14uelb90papz.R.inc(53048);throw new ZeroException();
        }
        }__CLR4_4_114ue14uelb90papz.R.inc(53049);final long[] rowSums = {countSum1, countSum2};
        __CLR4_4_114ue14uelb90papz.R.inc(53050);final double sum = (double) countSum1 + (double) countSum2;
        __CLR4_4_114ue14uelb90papz.R.inc(53051);return 2 * sum * (entropy(rowSums) + entropy(collSums) - entropy(k));
    }finally{__CLR4_4_114ue14uelb90papz.R.flushNeeded();}}

    /**
     * Calculates the root log-likelihood ratio for 2 state Datasets. See
     * {@link #gDataSetsComparison(long[], long[] )}.
     *
     * <p>Given two events A and B, let k11 be the number of times both events
     * occur, k12 the incidence of B without A, k21 the count of A without B,
     * and k22 the number of times neither A nor B occurs.  What is returned
     * by this method is </p>
     *
     * <p>{@code (sgn) sqrt(gValueDataSetsComparison({k11, k12}, {k21, k22})}</p>
     *
     * <p>where {@code sgn} is -1 if {@code k11 / (k11 + k12) < k21 / (k21 + k22))};<br/>
     * 1 otherwise.</p>
     *
     * <p>Signed root LLR has two advantages over the basic LLR: a) it is positive
     * where k11 is bigger than expected, negative where it is lower b) if there is
     * no difference it is asymptotically normally distributed. This allows one
     * to talk about "number of standard deviations" which is a more common frame
     * of reference than the chi^2 distribution.</p>
     *
     * @param k11 number of times the two events occurred together (AB)
     * @param k12 number of times the second event occurred WITHOUT the
     * first event (notA,B)
     * @param k21 number of times the first event occurred WITHOUT the
     * second event (A, notB)
     * @param k22 number of times something else occurred (i.e. was neither
     * of these events (notA, notB)
     * @return root log-likelihood ratio
     *
     */
    public double rootLogLikelihoodRatio(final long k11, long k12,
            final long k21, final long k22) {try{__CLR4_4_114ue14uelb90papz.R.inc(53052);
        __CLR4_4_114ue14uelb90papz.R.inc(53053);final double llr = gDataSetsComparison(
                new long[]{k11, k12}, new long[]{k21, k22});
        __CLR4_4_114ue14uelb90papz.R.inc(53054);double sqrt = FastMath.sqrt(llr);
        __CLR4_4_114ue14uelb90papz.R.inc(53055);if (((((double) k11 / (k11 + k12) < (double) k21 / (k21 + k22))&&(__CLR4_4_114ue14uelb90papz.R.iget(53056)!=0|true))||(__CLR4_4_114ue14uelb90papz.R.iget(53057)==0&false))) {{
            __CLR4_4_114ue14uelb90papz.R.inc(53058);sqrt = -sqrt;
        }
        }__CLR4_4_114ue14uelb90papz.R.inc(53059);return sqrt;
    }finally{__CLR4_4_114ue14uelb90papz.R.flushNeeded();}}

    /**
     * <p>Returns the <i>observed significance level</i>, or <a href=
     * "http://www.cas.lancs.ac.uk/glossary_v1.1/hyptest.html#pvalue">
     * p-value</a>, associated with a G-Value (Log-Likelihood Ratio) for two
     * sample test comparing bin frequency counts in {@code observed1} and
     * {@code observed2}.</p>
     *
     * <p>The number returned is the smallest significance level at which one
     * can reject the null hypothesis that the observed counts conform to the
     * same distribution. </p>
     *
     * <p>See {@link #gTest(double[], long[])} for details
     * on how the p-value is computed.  The degrees of of freedom used to
     * perform the test is one less than the common length of the input observed
     * count arrays.</p>
     *
     * <p><strong>Preconditions</strong>:
     * <ul> <li>Observed counts must be non-negative. </li>
     * <li>Observed counts for a specific bin must not both be zero. </li>
     * <li>Observed counts for a specific sample must not all be 0. </li>
     * <li>The arrays {@code observed1} and {@code observed2} must
     * have the same length and their common length must be at least 2. </li>
     * </ul><p>
     * <p> If any of the preconditions are not met, a
     * {@code MathIllegalArgumentException} is thrown.</p>
     *
     * @param observed1 array of observed frequency counts of the first data set
     * @param observed2 array of observed frequency counts of the second data
     * set
     * @return p-value
     * @throws DimensionMismatchException the the length of the arrays does not
     * match or their common length is less than 2
     * @throws NotPositiveException if any of the entries in {@code observed1} or
     * {@code observed2} are negative
     * @throws ZeroException if either all counts of {@code observed1} or
     * {@code observed2} are zero, or if the count at some index is
     * zero for both arrays
     * @throws MaxCountExceededException if an error occurs computing the
     * p-value.
     */
    public double gTestDataSetsComparison(final long[] observed1,
            final long[] observed2)
            throws DimensionMismatchException, NotPositiveException, ZeroException,
            MaxCountExceededException {try{__CLR4_4_114ue14uelb90papz.R.inc(53060);
        __CLR4_4_114ue14uelb90papz.R.inc(53061);final ChiSquaredDistribution distribution = new ChiSquaredDistribution(
                (double) observed1.length - 1);
        __CLR4_4_114ue14uelb90papz.R.inc(53062);return 1 - distribution.cumulativeProbability(
                gDataSetsComparison(observed1, observed2));
    }finally{__CLR4_4_114ue14uelb90papz.R.flushNeeded();}}

    /**
     * <p>Performs a G-Test (Log-Likelihood Ratio Test) comparing two binned
     * data sets. The test evaluates the null hypothesis that the two lists
     * of observed counts conform to the same frequency distribution, with
     * significance level {@code alpha}. Returns true iff the null
     * hypothesis can be rejected  with 100 * (1 - alpha) percent confidence.
     * </p>
     * <p>See {@link #gDataSetsComparison(long[], long[])} for details
     * on the formula used to compute the G (LLR) statistic used in the test and
     * {@link #gTest(double[], long[])} for information on how
     * the observed significance level is computed. The degrees of of freedom used
     * to perform the test is one less than the common length of the input observed
     * count arrays. </p>
     *
     * <strong>Preconditions</strong>: <ul>
     * <li>Observed counts must be non-negative. </li>
     * <li>Observed counts for a specific bin must not both be zero. </li>
     * <li>Observed counts for a specific sample must not all be 0. </li>
     * <li>The arrays {@code observed1} and {@code observed2} must
     * have the same length and their common length must be at least 2. </li>
     * <li>{@code 0 < alpha < 0.5} </li></ul></p>
     *
     * <p>If any of the preconditions are not met, a
     * {@code MathIllegalArgumentException} is thrown.</p>
     *
     * @param observed1 array of observed frequency counts of the first data set
     * @param observed2 array of observed frequency counts of the second data
     * set
     * @param alpha significance level of the test
     * @return true iff null hypothesis can be rejected with confidence 1 -
     * alpha
     * @throws DimensionMismatchException the the length of the arrays does not
     * match
     * @throws NotPositiveException if any of the entries in {@code observed1} or
     * {@code observed2} are negative
     * @throws ZeroException if either all counts of {@code observed1} or
     * {@code observed2} are zero, or if the count at some index is
     * zero for both arrays
     * @throws OutOfRangeException if {@code alpha} is not in the range
     * (0, 0.5]
     * @throws MaxCountExceededException if an error occurs performing the test
     */
    public boolean gTestDataSetsComparison(
            final long[] observed1,
            final long[] observed2,
            final double alpha)
            throws DimensionMismatchException, NotPositiveException,
            ZeroException, OutOfRangeException, MaxCountExceededException {try{__CLR4_4_114ue14uelb90papz.R.inc(53063);

        __CLR4_4_114ue14uelb90papz.R.inc(53064);if ((((alpha <= 0 || alpha > 0.5)&&(__CLR4_4_114ue14uelb90papz.R.iget(53065)!=0|true))||(__CLR4_4_114ue14uelb90papz.R.iget(53066)==0&false))) {{
            __CLR4_4_114ue14uelb90papz.R.inc(53067);throw new OutOfRangeException(
                    LocalizedFormats.OUT_OF_BOUND_SIGNIFICANCE_LEVEL, alpha, 0, 0.5);
        }
        }__CLR4_4_114ue14uelb90papz.R.inc(53068);return gTestDataSetsComparison(observed1, observed2) < alpha;
    }finally{__CLR4_4_114ue14uelb90papz.R.flushNeeded();}}
}
