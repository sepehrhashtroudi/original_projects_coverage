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
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.ZeroException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathArrays;

/**
 * Implements Chi-Square test statistics.
 *
 * <p>This implementation handles both known and unknown distributions.</p>
 *
 * <p>Two samples tests can be used when the distribution is unknown <i>a priori</i>
 * but provided by one sample, or when the hypothesis under test is that the two
 * samples come from the same underlying distribution.</p>
 *
 * @version $Id$
 */
public class ChiSquareTest {static class __CLR4_4_114q114q1lb90papm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,52934,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Construct a ChiSquareTest
     */
    public ChiSquareTest() {
        super();__CLR4_4_114q114q1lb90papm.R.inc(52778);try{__CLR4_4_114q114q1lb90papm.R.inc(52777);
    }finally{__CLR4_4_114q114q1lb90papm.R.flushNeeded();}}

    /**
     * Computes the <a href="http://www.itl.nist.gov/div898/handbook/eda/section3/eda35f.htm">
     * Chi-Square statistic</a> comparing <code>observed</code> and <code>expected</code>
     * frequency counts.
     * <p>
     * This statistic can be used to perform a Chi-Square test evaluating the null
     * hypothesis that the observed counts follow the expected distribution.</p>
     * <p>
     * <strong>Preconditions</strong>: <ul>
     * <li>Expected counts must all be positive.
     * </li>
     * <li>Observed counts must all be &ge; 0.
     * </li>
     * <li>The observed and expected arrays must have the same length and
     * their common length must be at least 2.
     * </li></ul></p><p>
     * If any of the preconditions are not met, an
     * <code>IllegalArgumentException</code> is thrown.</p>
     * <p><strong>Note: </strong>This implementation rescales the
     * <code>expected</code> array if necessary to ensure that the sum of the
     * expected and observed counts are equal.</p>
     *
     * @param observed array of observed frequency counts
     * @param expected array of expected frequency counts
     * @return chiSquare test statistic
     * @throws NotPositiveException if <code>observed</code> has negative entries
     * @throws NotStrictlyPositiveException if <code>expected</code> has entries that are
     * not strictly positive
     * @throws DimensionMismatchException if the arrays length is less than 2
     */
    public double chiSquare(final double[] expected, final long[] observed)
        throws NotPositiveException, NotStrictlyPositiveException,
        DimensionMismatchException {try{__CLR4_4_114q114q1lb90papm.R.inc(52779);

        __CLR4_4_114q114q1lb90papm.R.inc(52780);if ((((expected.length < 2)&&(__CLR4_4_114q114q1lb90papm.R.iget(52781)!=0|true))||(__CLR4_4_114q114q1lb90papm.R.iget(52782)==0&false))) {{
            __CLR4_4_114q114q1lb90papm.R.inc(52783);throw new DimensionMismatchException(expected.length, 2);
        }
        }__CLR4_4_114q114q1lb90papm.R.inc(52784);if ((((expected.length != observed.length)&&(__CLR4_4_114q114q1lb90papm.R.iget(52785)!=0|true))||(__CLR4_4_114q114q1lb90papm.R.iget(52786)==0&false))) {{
            __CLR4_4_114q114q1lb90papm.R.inc(52787);throw new DimensionMismatchException(expected.length, observed.length);
        }
        }__CLR4_4_114q114q1lb90papm.R.inc(52788);MathArrays.checkPositive(expected);
        __CLR4_4_114q114q1lb90papm.R.inc(52789);MathArrays.checkNonNegative(observed);

        __CLR4_4_114q114q1lb90papm.R.inc(52790);double sumExpected = 0d;
        __CLR4_4_114q114q1lb90papm.R.inc(52791);double sumObserved = 0d;
        __CLR4_4_114q114q1lb90papm.R.inc(52792);for (int i = 0; (((i < observed.length)&&(__CLR4_4_114q114q1lb90papm.R.iget(52793)!=0|true))||(__CLR4_4_114q114q1lb90papm.R.iget(52794)==0&false)); i++) {{
            __CLR4_4_114q114q1lb90papm.R.inc(52795);sumExpected += expected[i];
            __CLR4_4_114q114q1lb90papm.R.inc(52796);sumObserved += observed[i];
        }
        }__CLR4_4_114q114q1lb90papm.R.inc(52797);double ratio = 1.0d;
        __CLR4_4_114q114q1lb90papm.R.inc(52798);boolean rescale = false;
        __CLR4_4_114q114q1lb90papm.R.inc(52799);if ((((FastMath.abs(sumExpected - sumObserved) > 10E-6)&&(__CLR4_4_114q114q1lb90papm.R.iget(52800)!=0|true))||(__CLR4_4_114q114q1lb90papm.R.iget(52801)==0&false))) {{
            __CLR4_4_114q114q1lb90papm.R.inc(52802);ratio = sumObserved / sumExpected;
            __CLR4_4_114q114q1lb90papm.R.inc(52803);rescale = true;
        }
        }__CLR4_4_114q114q1lb90papm.R.inc(52804);double sumSq = 0.0d;
        __CLR4_4_114q114q1lb90papm.R.inc(52805);for (int i = 0; (((i < observed.length)&&(__CLR4_4_114q114q1lb90papm.R.iget(52806)!=0|true))||(__CLR4_4_114q114q1lb90papm.R.iget(52807)==0&false)); i++) {{
            __CLR4_4_114q114q1lb90papm.R.inc(52808);if ((((rescale)&&(__CLR4_4_114q114q1lb90papm.R.iget(52809)!=0|true))||(__CLR4_4_114q114q1lb90papm.R.iget(52810)==0&false))) {{
                __CLR4_4_114q114q1lb90papm.R.inc(52811);final double dev = observed[i] - ratio * expected[i];
                __CLR4_4_114q114q1lb90papm.R.inc(52812);sumSq += dev * dev / (ratio * expected[i]);
            } }else {{
                __CLR4_4_114q114q1lb90papm.R.inc(52813);final double dev = observed[i] - expected[i];
                __CLR4_4_114q114q1lb90papm.R.inc(52814);sumSq += dev * dev / expected[i];
            }
        }}
        }__CLR4_4_114q114q1lb90papm.R.inc(52815);return sumSq;

    }finally{__CLR4_4_114q114q1lb90papm.R.flushNeeded();}}

    /**
     * Returns the <i>observed significance level</i>, or <a href=
     * "http://www.cas.lancs.ac.uk/glossary_v1.1/hyptest.html#pvalue">
     * p-value</a>, associated with a
     * <a href="http://www.itl.nist.gov/div898/handbook/eda/section3/eda35f.htm">
     * Chi-square goodness of fit test</a> comparing the <code>observed</code>
     * frequency counts to those in the <code>expected</code> array.
     * <p>
     * The number returned is the smallest significance level at which one can reject
     * the null hypothesis that the observed counts conform to the frequency distribution
     * described by the expected counts.</p>
     * <p>
     * <strong>Preconditions</strong>: <ul>
     * <li>Expected counts must all be positive.
     * </li>
     * <li>Observed counts must all be &ge; 0.
     * </li>
     * <li>The observed and expected arrays must have the same length and
     * their common length must be at least 2.
     * </li></ul></p><p>
     * If any of the preconditions are not met, an
     * <code>IllegalArgumentException</code> is thrown.</p>
     * <p><strong>Note: </strong>This implementation rescales the
     * <code>expected</code> array if necessary to ensure that the sum of the
     * expected and observed counts are equal.</p>
     *
     * @param observed array of observed frequency counts
     * @param expected array of expected frequency counts
     * @return p-value
     * @throws NotPositiveException if <code>observed</code> has negative entries
     * @throws NotStrictlyPositiveException if <code>expected</code> has entries that are
     * not strictly positive
     * @throws DimensionMismatchException if the arrays length is less than 2
     * @throws MaxCountExceededException if an error occurs computing the p-value
     */
    public double chiSquareTest(final double[] expected, final long[] observed)
        throws NotPositiveException, NotStrictlyPositiveException,
        DimensionMismatchException, MaxCountExceededException {try{__CLR4_4_114q114q1lb90papm.R.inc(52816);

        __CLR4_4_114q114q1lb90papm.R.inc(52817);ChiSquaredDistribution distribution =
            new ChiSquaredDistribution(expected.length - 1.0);
        __CLR4_4_114q114q1lb90papm.R.inc(52818);return 1.0 - distribution.cumulativeProbability(chiSquare(expected, observed));
    }finally{__CLR4_4_114q114q1lb90papm.R.flushNeeded();}}

    /**
     * Performs a <a href="http://www.itl.nist.gov/div898/handbook/eda/section3/eda35f.htm">
     * Chi-square goodness of fit test</a> evaluating the null hypothesis that the
     * observed counts conform to the frequency distribution described by the expected
     * counts, with significance level <code>alpha</code>.  Returns true iff the null
     * hypothesis can be rejected with 100 * (1 - alpha) percent confidence.
     * <p>
     * <strong>Example:</strong><br>
     * To test the hypothesis that <code>observed</code> follows
     * <code>expected</code> at the 99% level, use </p><p>
     * <code>chiSquareTest(expected, observed, 0.01) </code></p>
     * <p>
     * <strong>Preconditions</strong>: <ul>
     * <li>Expected counts must all be positive.
     * </li>
     * <li>Observed counts must all be &ge; 0.
     * </li>
     * <li>The observed and expected arrays must have the same length and
     * their common length must be at least 2.
     * <li> <code> 0 &lt; alpha &lt; 0.5 </code>
     * </li></ul></p><p>
     * If any of the preconditions are not met, an
     * <code>IllegalArgumentException</code> is thrown.</p>
     * <p><strong>Note: </strong>This implementation rescales the
     * <code>expected</code> array if necessary to ensure that the sum of the
     * expected and observed counts are equal.</p>
     *
     * @param observed array of observed frequency counts
     * @param expected array of expected frequency counts
     * @param alpha significance level of the test
     * @return true iff null hypothesis can be rejected with confidence
     * 1 - alpha
     * @throws NotPositiveException if <code>observed</code> has negative entries
     * @throws NotStrictlyPositiveException if <code>expected</code> has entries that are
     * not strictly positive
     * @throws DimensionMismatchException if the arrays length is less than 2
     * @throws OutOfRangeException if <code>alpha</code> is not in the range (0, 0.5]
     * @throws MaxCountExceededException if an error occurs computing the p-value
     */
    public boolean chiSquareTest(final double[] expected, final long[] observed,
                                 final double alpha)
        throws NotPositiveException, NotStrictlyPositiveException,
        DimensionMismatchException, OutOfRangeException, MaxCountExceededException {try{__CLR4_4_114q114q1lb90papm.R.inc(52819);

        __CLR4_4_114q114q1lb90papm.R.inc(52820);if (((((alpha <= 0) || (alpha > 0.5))&&(__CLR4_4_114q114q1lb90papm.R.iget(52821)!=0|true))||(__CLR4_4_114q114q1lb90papm.R.iget(52822)==0&false))) {{
            __CLR4_4_114q114q1lb90papm.R.inc(52823);throw new OutOfRangeException(LocalizedFormats.OUT_OF_BOUND_SIGNIFICANCE_LEVEL,
                                          alpha, 0, 0.5);
        }
        }__CLR4_4_114q114q1lb90papm.R.inc(52824);return chiSquareTest(expected, observed) < alpha;

    }finally{__CLR4_4_114q114q1lb90papm.R.flushNeeded();}}

    /**
     *  Computes the Chi-Square statistic associated with a
     * <a href="http://www.itl.nist.gov/div898/handbook/prc/section4/prc45.htm">
     *  chi-square test of independence</a> based on the input <code>counts</code>
     *  array, viewed as a two-way table.
     * <p>
     * The rows of the 2-way table are
     * <code>count[0], ... , count[count.length - 1] </code></p>
     * <p>
     * <strong>Preconditions</strong>: <ul>
     * <li>All counts must be &ge; 0.
     * </li>
     * <li>The count array must be rectangular (i.e. all count[i] subarrays
     *  must have the same length).
     * </li>
     * <li>The 2-way table represented by <code>counts</code> must have at
     *  least 2 columns and at least 2 rows.
     * </li>
     * </li></ul></p><p>
     * If any of the preconditions are not met, an
     * <code>IllegalArgumentException</code> is thrown.</p>
     *
     * @param counts array representation of 2-way table
     * @return chiSquare test statistic
     * @throws NullArgumentException if the array is null
     * @throws DimensionMismatchException if the array is not rectangular
     * @throws NotPositiveException if {@code counts} has negative entries
     */
    public double chiSquare(final long[][] counts)
        throws NullArgumentException, NotPositiveException,
        DimensionMismatchException {try{__CLR4_4_114q114q1lb90papm.R.inc(52825);

        __CLR4_4_114q114q1lb90papm.R.inc(52826);checkArray(counts);
        __CLR4_4_114q114q1lb90papm.R.inc(52827);int nRows = counts.length;
        __CLR4_4_114q114q1lb90papm.R.inc(52828);int nCols = counts[0].length;

        // compute row, column and total sums
        __CLR4_4_114q114q1lb90papm.R.inc(52829);double[] rowSum = new double[nRows];
        __CLR4_4_114q114q1lb90papm.R.inc(52830);double[] colSum = new double[nCols];
        __CLR4_4_114q114q1lb90papm.R.inc(52831);double total = 0.0d;
        __CLR4_4_114q114q1lb90papm.R.inc(52832);for (int row = 0; (((row < nRows)&&(__CLR4_4_114q114q1lb90papm.R.iget(52833)!=0|true))||(__CLR4_4_114q114q1lb90papm.R.iget(52834)==0&false)); row++) {{
            __CLR4_4_114q114q1lb90papm.R.inc(52835);for (int col = 0; (((col < nCols)&&(__CLR4_4_114q114q1lb90papm.R.iget(52836)!=0|true))||(__CLR4_4_114q114q1lb90papm.R.iget(52837)==0&false)); col++) {{
                __CLR4_4_114q114q1lb90papm.R.inc(52838);rowSum[row] += counts[row][col];
                __CLR4_4_114q114q1lb90papm.R.inc(52839);colSum[col] += counts[row][col];
                __CLR4_4_114q114q1lb90papm.R.inc(52840);total += counts[row][col];
            }
        }}

        // compute expected counts and chi-square
        }__CLR4_4_114q114q1lb90papm.R.inc(52841);double sumSq = 0.0d;
        __CLR4_4_114q114q1lb90papm.R.inc(52842);double expected = 0.0d;
        __CLR4_4_114q114q1lb90papm.R.inc(52843);for (int row = 0; (((row < nRows)&&(__CLR4_4_114q114q1lb90papm.R.iget(52844)!=0|true))||(__CLR4_4_114q114q1lb90papm.R.iget(52845)==0&false)); row++) {{
            __CLR4_4_114q114q1lb90papm.R.inc(52846);for (int col = 0; (((col < nCols)&&(__CLR4_4_114q114q1lb90papm.R.iget(52847)!=0|true))||(__CLR4_4_114q114q1lb90papm.R.iget(52848)==0&false)); col++) {{
                __CLR4_4_114q114q1lb90papm.R.inc(52849);expected = (rowSum[row] * colSum[col]) / total;
                __CLR4_4_114q114q1lb90papm.R.inc(52850);sumSq += ((counts[row][col] - expected) *
                        (counts[row][col] - expected)) / expected;
            }
        }}
        }__CLR4_4_114q114q1lb90papm.R.inc(52851);return sumSq;

    }finally{__CLR4_4_114q114q1lb90papm.R.flushNeeded();}}

    /**
     * Returns the <i>observed significance level</i>, or <a href=
     * "http://www.cas.lancs.ac.uk/glossary_v1.1/hyptest.html#pvalue">
     * p-value</a>, associated with a
     * <a href="http://www.itl.nist.gov/div898/handbook/prc/section4/prc45.htm">
     * chi-square test of independence</a> based on the input <code>counts</code>
     * array, viewed as a two-way table.
     * <p>
     * The rows of the 2-way table are
     * <code>count[0], ... , count[count.length - 1] </code></p>
     * <p>
     * <strong>Preconditions</strong>: <ul>
     * <li>All counts must be &ge; 0.
     * </li>
     * <li>The count array must be rectangular (i.e. all count[i] subarrays must have
     *     the same length).
     * </li>
     * <li>The 2-way table represented by <code>counts</code> must have at least 2
     *     columns and at least 2 rows.
     * </li>
     * </li></ul></p><p>
     * If any of the preconditions are not met, an
     * <code>IllegalArgumentException</code> is thrown.</p>
     *
     * @param counts array representation of 2-way table
     * @return p-value
     * @throws NullArgumentException if the array is null
     * @throws DimensionMismatchException if the array is not rectangular
     * @throws NotPositiveException if {@code counts} has negative entries
     * @throws MaxCountExceededException if an error occurs computing the p-value
     */
    public double chiSquareTest(final long[][] counts)
        throws NullArgumentException, DimensionMismatchException,
        NotPositiveException, MaxCountExceededException {try{__CLR4_4_114q114q1lb90papm.R.inc(52852);

        __CLR4_4_114q114q1lb90papm.R.inc(52853);checkArray(counts);
        __CLR4_4_114q114q1lb90papm.R.inc(52854);double df = ((double) counts.length -1) * ((double) counts[0].length - 1);
        __CLR4_4_114q114q1lb90papm.R.inc(52855);ChiSquaredDistribution distribution;
        __CLR4_4_114q114q1lb90papm.R.inc(52856);distribution = new ChiSquaredDistribution(df);
        __CLR4_4_114q114q1lb90papm.R.inc(52857);return 1 - distribution.cumulativeProbability(chiSquare(counts));

    }finally{__CLR4_4_114q114q1lb90papm.R.flushNeeded();}}

    /**
     * Performs a <a href="http://www.itl.nist.gov/div898/handbook/prc/section4/prc45.htm">
     * chi-square test of independence</a> evaluating the null hypothesis that the
     * classifications represented by the counts in the columns of the input 2-way table
     * are independent of the rows, with significance level <code>alpha</code>.
     * Returns true iff the null hypothesis can be rejected with 100 * (1 - alpha) percent
     * confidence.
     * <p>
     * The rows of the 2-way table are
     * <code>count[0], ... , count[count.length - 1] </code></p>
     * <p>
     * <strong>Example:</strong><br>
     * To test the null hypothesis that the counts in
     * <code>count[0], ... , count[count.length - 1] </code>
     *  all correspond to the same underlying probability distribution at the 99% level, use</p>
     * <p><code>chiSquareTest(counts, 0.01)</code></p>
     * <p>
     * <strong>Preconditions</strong>: <ul>
     * <li>All counts must be &ge; 0.
     * </li>
     * <li>The count array must be rectangular (i.e. all count[i] subarrays must have the
     *     same length).</li>
     * <li>The 2-way table represented by <code>counts</code> must have at least 2 columns and
     *     at least 2 rows.</li>
     * </li></ul></p><p>
     * If any of the preconditions are not met, an
     * <code>IllegalArgumentException</code> is thrown.</p>
     *
     * @param counts array representation of 2-way table
     * @param alpha significance level of the test
     * @return true iff null hypothesis can be rejected with confidence
     * 1 - alpha
     * @throws NullArgumentException if the array is null
     * @throws DimensionMismatchException if the array is not rectangular
     * @throws NotPositiveException if {@code counts} has any negative entries
     * @throws OutOfRangeException if <code>alpha</code> is not in the range (0, 0.5]
     * @throws MaxCountExceededException if an error occurs computing the p-value
     */
    public boolean chiSquareTest(final long[][] counts, final double alpha)
        throws NullArgumentException, DimensionMismatchException,
        NotPositiveException, OutOfRangeException, MaxCountExceededException {try{__CLR4_4_114q114q1lb90papm.R.inc(52858);

        __CLR4_4_114q114q1lb90papm.R.inc(52859);if (((((alpha <= 0) || (alpha > 0.5))&&(__CLR4_4_114q114q1lb90papm.R.iget(52860)!=0|true))||(__CLR4_4_114q114q1lb90papm.R.iget(52861)==0&false))) {{
            __CLR4_4_114q114q1lb90papm.R.inc(52862);throw new OutOfRangeException(LocalizedFormats.OUT_OF_BOUND_SIGNIFICANCE_LEVEL,
                                          alpha, 0, 0.5);
        }
        }__CLR4_4_114q114q1lb90papm.R.inc(52863);return chiSquareTest(counts) < alpha;

    }finally{__CLR4_4_114q114q1lb90papm.R.flushNeeded();}}

    /**
     * <p>Computes a
     * <a href="http://www.itl.nist.gov/div898/software/dataplot/refman1/auxillar/chi2samp.htm">
     * Chi-Square two sample test statistic</a> comparing bin frequency counts
     * in <code>observed1</code> and <code>observed2</code>.  The
     * sums of frequency counts in the two samples are not required to be the
     * same.  The formula used to compute the test statistic is</p>
     * <code>
     * &sum;[(K * observed1[i] - observed2[i]/K)<sup>2</sup> / (observed1[i] + observed2[i])]
     * </code> where
     * <br/><code>K = &sqrt;[&sum(observed2 / &sum;(observed1)]</code>
     * </p>
     * <p>This statistic can be used to perform a Chi-Square test evaluating the
     * null hypothesis that both observed counts follow the same distribution.</p>
     * <p>
     * <strong>Preconditions</strong>: <ul>
     * <li>Observed counts must be non-negative.
     * </li>
     * <li>Observed counts for a specific bin must not both be zero.
     * </li>
     * <li>Observed counts for a specific sample must not all be 0.
     * </li>
     * <li>The arrays <code>observed1</code> and <code>observed2</code> must have
     * the same length and their common length must be at least 2.
     * </li></ul></p><p>
     * If any of the preconditions are not met, an
     * <code>IllegalArgumentException</code> is thrown.</p>
     *
     * @param observed1 array of observed frequency counts of the first data set
     * @param observed2 array of observed frequency counts of the second data set
     * @return chiSquare test statistic
     * @throws DimensionMismatchException the the length of the arrays does not match
     * @throws NotPositiveException if any entries in <code>observed1</code> or
     * <code>observed2</code> are negative
     * @throws ZeroException if either all counts of <code>observed1</code> or
     * <code>observed2</code> are zero, or if the count at some index is zero
     * for both arrays
     * @since 1.2
     */
    public double chiSquareDataSetsComparison(long[] observed1, long[] observed2)
        throws DimensionMismatchException, NotPositiveException, ZeroException {try{__CLR4_4_114q114q1lb90papm.R.inc(52864);

        // Make sure lengths are same
        __CLR4_4_114q114q1lb90papm.R.inc(52865);if ((((observed1.length < 2)&&(__CLR4_4_114q114q1lb90papm.R.iget(52866)!=0|true))||(__CLR4_4_114q114q1lb90papm.R.iget(52867)==0&false))) {{
            __CLR4_4_114q114q1lb90papm.R.inc(52868);throw new DimensionMismatchException(observed1.length, 2);
        }
        }__CLR4_4_114q114q1lb90papm.R.inc(52869);if ((((observed1.length != observed2.length)&&(__CLR4_4_114q114q1lb90papm.R.iget(52870)!=0|true))||(__CLR4_4_114q114q1lb90papm.R.iget(52871)==0&false))) {{
            __CLR4_4_114q114q1lb90papm.R.inc(52872);throw new DimensionMismatchException(observed1.length, observed2.length);
        }

        // Ensure non-negative counts
        }__CLR4_4_114q114q1lb90papm.R.inc(52873);MathArrays.checkNonNegative(observed1);
        __CLR4_4_114q114q1lb90papm.R.inc(52874);MathArrays.checkNonNegative(observed2);

        // Compute and compare count sums
        __CLR4_4_114q114q1lb90papm.R.inc(52875);long countSum1 = 0;
        __CLR4_4_114q114q1lb90papm.R.inc(52876);long countSum2 = 0;
        __CLR4_4_114q114q1lb90papm.R.inc(52877);boolean unequalCounts = false;
        __CLR4_4_114q114q1lb90papm.R.inc(52878);double weight = 0.0;
        __CLR4_4_114q114q1lb90papm.R.inc(52879);for (int i = 0; (((i < observed1.length)&&(__CLR4_4_114q114q1lb90papm.R.iget(52880)!=0|true))||(__CLR4_4_114q114q1lb90papm.R.iget(52881)==0&false)); i++) {{
            __CLR4_4_114q114q1lb90papm.R.inc(52882);countSum1 += observed1[i];
            __CLR4_4_114q114q1lb90papm.R.inc(52883);countSum2 += observed2[i];
        }
        // Ensure neither sample is uniformly 0
        }__CLR4_4_114q114q1lb90papm.R.inc(52884);if ((((countSum1 == 0 || countSum2 == 0)&&(__CLR4_4_114q114q1lb90papm.R.iget(52885)!=0|true))||(__CLR4_4_114q114q1lb90papm.R.iget(52886)==0&false))) {{
            __CLR4_4_114q114q1lb90papm.R.inc(52887);throw new ZeroException();
        }
        // Compare and compute weight only if different
        }__CLR4_4_114q114q1lb90papm.R.inc(52888);unequalCounts = countSum1 != countSum2;
        __CLR4_4_114q114q1lb90papm.R.inc(52889);if ((((unequalCounts)&&(__CLR4_4_114q114q1lb90papm.R.iget(52890)!=0|true))||(__CLR4_4_114q114q1lb90papm.R.iget(52891)==0&false))) {{
            __CLR4_4_114q114q1lb90papm.R.inc(52892);weight = FastMath.sqrt((double) countSum1 / (double) countSum2);
        }
        // Compute ChiSquare statistic
        }__CLR4_4_114q114q1lb90papm.R.inc(52893);double sumSq = 0.0d;
        __CLR4_4_114q114q1lb90papm.R.inc(52894);double dev = 0.0d;
        __CLR4_4_114q114q1lb90papm.R.inc(52895);double obs1 = 0.0d;
        __CLR4_4_114q114q1lb90papm.R.inc(52896);double obs2 = 0.0d;
        __CLR4_4_114q114q1lb90papm.R.inc(52897);for (int i = 0; (((i < observed1.length)&&(__CLR4_4_114q114q1lb90papm.R.iget(52898)!=0|true))||(__CLR4_4_114q114q1lb90papm.R.iget(52899)==0&false)); i++) {{
            __CLR4_4_114q114q1lb90papm.R.inc(52900);if ((((observed1[i] == 0 && observed2[i] == 0)&&(__CLR4_4_114q114q1lb90papm.R.iget(52901)!=0|true))||(__CLR4_4_114q114q1lb90papm.R.iget(52902)==0&false))) {{
                __CLR4_4_114q114q1lb90papm.R.inc(52903);throw new ZeroException(LocalizedFormats.OBSERVED_COUNTS_BOTTH_ZERO_FOR_ENTRY, i);
            } }else {{
                __CLR4_4_114q114q1lb90papm.R.inc(52904);obs1 = observed1[i];
                __CLR4_4_114q114q1lb90papm.R.inc(52905);obs2 = observed2[i];
                __CLR4_4_114q114q1lb90papm.R.inc(52906);if ((((unequalCounts)&&(__CLR4_4_114q114q1lb90papm.R.iget(52907)!=0|true))||(__CLR4_4_114q114q1lb90papm.R.iget(52908)==0&false))) {{ // apply weights
                    __CLR4_4_114q114q1lb90papm.R.inc(52909);dev = obs1/weight - obs2 * weight;
                } }else {{
                    __CLR4_4_114q114q1lb90papm.R.inc(52910);dev = obs1 - obs2;
                }
                }__CLR4_4_114q114q1lb90papm.R.inc(52911);sumSq += (dev * dev) / (obs1 + obs2);
            }
        }}
        }__CLR4_4_114q114q1lb90papm.R.inc(52912);return sumSq;
    }finally{__CLR4_4_114q114q1lb90papm.R.flushNeeded();}}

    /**
     * <p>Returns the <i>observed significance level</i>, or <a href=
     * "http://www.cas.lancs.ac.uk/glossary_v1.1/hyptest.html#pvalue">
     * p-value</a>, associated with a Chi-Square two sample test comparing
     * bin frequency counts in <code>observed1</code> and
     * <code>observed2</code>.
     * </p>
     * <p>The number returned is the smallest significance level at which one
     * can reject the null hypothesis that the observed counts conform to the
     * same distribution.
     * </p>
     * <p>See {@link #chiSquareDataSetsComparison(long[], long[])} for details
     * on the formula used to compute the test statistic. The degrees of
     * of freedom used to perform the test is one less than the common length
     * of the input observed count arrays.
     * </p>
     * <strong>Preconditions</strong>: <ul>
     * <li>Observed counts must be non-negative.
     * </li>
     * <li>Observed counts for a specific bin must not both be zero.
     * </li>
     * <li>Observed counts for a specific sample must not all be 0.
     * </li>
     * <li>The arrays <code>observed1</code> and <code>observed2</code> must
     * have the same length and
     * their common length must be at least 2.
     * </li></ul><p>
     * If any of the preconditions are not met, an
     * <code>IllegalArgumentException</code> is thrown.</p>
     *
     * @param observed1 array of observed frequency counts of the first data set
     * @param observed2 array of observed frequency counts of the second data set
     * @return p-value
     * @throws DimensionMismatchException the the length of the arrays does not match
     * @throws NotPositiveException if any entries in <code>observed1</code> or
     * <code>observed2</code> are negative
     * @throws ZeroException if either all counts of <code>observed1</code> or
     * <code>observed2</code> are zero, or if the count at the same index is zero
     * for both arrays
     * @throws MaxCountExceededException if an error occurs computing the p-value
     * @since 1.2
     */
    public double chiSquareTestDataSetsComparison(long[] observed1, long[] observed2)
        throws DimensionMismatchException, NotPositiveException, ZeroException,
        MaxCountExceededException {try{__CLR4_4_114q114q1lb90papm.R.inc(52913);

        __CLR4_4_114q114q1lb90papm.R.inc(52914);ChiSquaredDistribution distribution;
        __CLR4_4_114q114q1lb90papm.R.inc(52915);distribution = new ChiSquaredDistribution((double) observed1.length - 1);
        __CLR4_4_114q114q1lb90papm.R.inc(52916);return 1 - distribution.cumulativeProbability(
                chiSquareDataSetsComparison(observed1, observed2));

    }finally{__CLR4_4_114q114q1lb90papm.R.flushNeeded();}}

    /**
     * <p>Performs a Chi-Square two sample test comparing two binned data
     * sets. The test evaluates the null hypothesis that the two lists of
     * observed counts conform to the same frequency distribution, with
     * significance level <code>alpha</code>.  Returns true iff the null
     * hypothesis can be rejected with 100 * (1 - alpha) percent confidence.
     * </p>
     * <p>See {@link #chiSquareDataSetsComparison(long[], long[])} for
     * details on the formula used to compute the Chisquare statistic used
     * in the test. The degrees of of freedom used to perform the test is
     * one less than the common length of the input observed count arrays.
     * </p>
     * <strong>Preconditions</strong>: <ul>
     * <li>Observed counts must be non-negative.
     * </li>
     * <li>Observed counts for a specific bin must not both be zero.
     * </li>
     * <li>Observed counts for a specific sample must not all be 0.
     * </li>
     * <li>The arrays <code>observed1</code> and <code>observed2</code> must
     * have the same length and their common length must be at least 2.
     * </li>
     * <li> <code> 0 < alpha < 0.5 </code>
     * </li></ul><p>
     * If any of the preconditions are not met, an
     * <code>IllegalArgumentException</code> is thrown.</p>
     *
     * @param observed1 array of observed frequency counts of the first data set
     * @param observed2 array of observed frequency counts of the second data set
     * @param alpha significance level of the test
     * @return true iff null hypothesis can be rejected with confidence
     * 1 - alpha
     * @throws DimensionMismatchException the the length of the arrays does not match
     * @throws NotPositiveException if any entries in <code>observed1</code> or
     * <code>observed2</code> are negative
     * @throws ZeroException if either all counts of <code>observed1</code> or
     * <code>observed2</code> are zero, or if the count at the same index is zero
     * for both arrays
     * @throws OutOfRangeException if <code>alpha</code> is not in the range (0, 0.5]
     * @throws MaxCountExceededException if an error occurs performing the test
     * @since 1.2
     */
    public boolean chiSquareTestDataSetsComparison(final long[] observed1,
                                                   final long[] observed2,
                                                   final double alpha)
        throws DimensionMismatchException, NotPositiveException,
        ZeroException, OutOfRangeException, MaxCountExceededException {try{__CLR4_4_114q114q1lb90papm.R.inc(52917);

        __CLR4_4_114q114q1lb90papm.R.inc(52918);if ((((alpha <= 0 ||
            alpha > 0.5)&&(__CLR4_4_114q114q1lb90papm.R.iget(52919)!=0|true))||(__CLR4_4_114q114q1lb90papm.R.iget(52920)==0&false))) {{
            __CLR4_4_114q114q1lb90papm.R.inc(52921);throw new OutOfRangeException(LocalizedFormats.OUT_OF_BOUND_SIGNIFICANCE_LEVEL,
                                          alpha, 0, 0.5);
        }
        }__CLR4_4_114q114q1lb90papm.R.inc(52922);return chiSquareTestDataSetsComparison(observed1, observed2) < alpha;

    }finally{__CLR4_4_114q114q1lb90papm.R.flushNeeded();}}

    /**
     * Checks to make sure that the input long[][] array is rectangular,
     * has at least 2 rows and 2 columns, and has all non-negative entries.
     *
     * @param in input 2-way table to check
     * @throws NullArgumentException if the array is null
     * @throws DimensionMismatchException if the array is not valid
     * @throws NotPositiveException if the array contains any negative entries
     */
    private void checkArray(final long[][] in)
        throws NullArgumentException, DimensionMismatchException,
        NotPositiveException {try{__CLR4_4_114q114q1lb90papm.R.inc(52923);

        __CLR4_4_114q114q1lb90papm.R.inc(52924);if ((((in.length < 2)&&(__CLR4_4_114q114q1lb90papm.R.iget(52925)!=0|true))||(__CLR4_4_114q114q1lb90papm.R.iget(52926)==0&false))) {{
            __CLR4_4_114q114q1lb90papm.R.inc(52927);throw new DimensionMismatchException(in.length, 2);
        }

        }__CLR4_4_114q114q1lb90papm.R.inc(52928);if ((((in[0].length < 2)&&(__CLR4_4_114q114q1lb90papm.R.iget(52929)!=0|true))||(__CLR4_4_114q114q1lb90papm.R.iget(52930)==0&false))) {{
            __CLR4_4_114q114q1lb90papm.R.inc(52931);throw new DimensionMismatchException(in[0].length, 2);
        }

        }__CLR4_4_114q114q1lb90papm.R.inc(52932);MathArrays.checkRectangular(in);
        __CLR4_4_114q114q1lb90papm.R.inc(52933);MathArrays.checkNonNegative(in);

    }finally{__CLR4_4_114q114q1lb90papm.R.flushNeeded();}}

}
