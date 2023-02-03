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

import java.util.ArrayList;
import java.util.Collection;

import org.apache.commons.math3.distribution.FDistribution;
import org.apache.commons.math3.exception.ConvergenceException;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.stat.descriptive.SummaryStatistics;
import org.apache.commons.math3.util.MathUtils;

/**
 * Implements one-way ANOVA (analysis of variance) statistics.
 *
 * <p> Tests for differences between two or more categories of univariate data
 * (for example, the body mass index of accountants, lawyers, doctors and
 * computer programmers).  When two categories are given, this is equivalent to
 * the {@link org.apache.commons.math3.stat.inference.TTest}.
 * </p><p>
 * Uses the {@link org.apache.commons.math3.distribution.FDistribution
 * commons-math F Distribution implementation} to estimate exact p-values.</p>
 * <p>This implementation is based on a description at
 * http://faculty.vassar.edu/lowry/ch13pt1.html</p>
 * <pre>
 * Abbreviations: bg = between groups,
 *                wg = within groups,
 *                ss = sum squared deviations
 * </pre>
 *
 * @since 1.2
 * @version $Id$
 */
public class OneWayAnova {public static class __CLR4_4_114zb14zblb90paq8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,53178,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Default constructor.
     */
    public OneWayAnova() {try{__CLR4_4_114zb14zblb90paq8.R.inc(53111);
    }finally{__CLR4_4_114zb14zblb90paq8.R.flushNeeded();}}

    /**
     * Computes the ANOVA F-value for a collection of <code>double[]</code>
     * arrays.
     *
     * <p><strong>Preconditions</strong>: <ul>
     * <li>The categoryData <code>Collection</code> must contain
     * <code>double[]</code> arrays.</li>
     * <li> There must be at least two <code>double[]</code> arrays in the
     * <code>categoryData</code> collection and each of these arrays must
     * contain at least two values.</li></ul></p><p>
     * This implementation computes the F statistic using the definitional
     * formula<pre>
     *   F = msbg/mswg</pre>
     * where<pre>
     *  msbg = between group mean square
     *  mswg = within group mean square</pre>
     * are as defined <a href="http://faculty.vassar.edu/lowry/ch13pt1.html">
     * here</a></p>
     *
     * @param categoryData <code>Collection</code> of <code>double[]</code>
     * arrays each containing data for one category
     * @return Fvalue
     * @throws NullArgumentException if <code>categoryData</code> is <code>null</code>
     * @throws DimensionMismatchException if the length of the <code>categoryData</code>
     * array is less than 2 or a contained <code>double[]</code> array does not have
     * at least two values
     */
    public double anovaFValue(final Collection<double[]> categoryData)
        throws NullArgumentException, DimensionMismatchException {try{__CLR4_4_114zb14zblb90paq8.R.inc(53112);

        __CLR4_4_114zb14zblb90paq8.R.inc(53113);AnovaStats a = anovaStats(categoryData);
        __CLR4_4_114zb14zblb90paq8.R.inc(53114);return a.F;

    }finally{__CLR4_4_114zb14zblb90paq8.R.flushNeeded();}}

    /**
     * Computes the ANOVA P-value for a collection of <code>double[]</code>
     * arrays.
     *
     * <p><strong>Preconditions</strong>: <ul>
     * <li>The categoryData <code>Collection</code> must contain
     * <code>double[]</code> arrays.</li>
     * <li> There must be at least two <code>double[]</code> arrays in the
     * <code>categoryData</code> collection and each of these arrays must
     * contain at least two values.</li></ul></p><p>
     * This implementation uses the
     * {@link org.apache.commons.math3.distribution.FDistribution
     * commons-math F Distribution implementation} to estimate the exact
     * p-value, using the formula<pre>
     *   p = 1 - cumulativeProbability(F)</pre>
     * where <code>F</code> is the F value and <code>cumulativeProbability</code>
     * is the commons-math implementation of the F distribution.</p>
     *
     * @param categoryData <code>Collection</code> of <code>double[]</code>
     * arrays each containing data for one category
     * @return Pvalue
     * @throws NullArgumentException if <code>categoryData</code> is <code>null</code>
     * @throws DimensionMismatchException if the length of the <code>categoryData</code>
     * array is less than 2 or a contained <code>double[]</code> array does not have
     * at least two values
     * @throws ConvergenceException if the p-value can not be computed due to a convergence error
     * @throws MaxCountExceededException if the maximum number of iterations is exceeded
     */
    public double anovaPValue(final Collection<double[]> categoryData)
        throws NullArgumentException, DimensionMismatchException,
        ConvergenceException, MaxCountExceededException {try{__CLR4_4_114zb14zblb90paq8.R.inc(53115);

        __CLR4_4_114zb14zblb90paq8.R.inc(53116);AnovaStats a = anovaStats(categoryData);
        // No try-catch or advertised exception because args are valid
        __CLR4_4_114zb14zblb90paq8.R.inc(53117);FDistribution fdist = new FDistribution(a.dfbg, a.dfwg);
        __CLR4_4_114zb14zblb90paq8.R.inc(53118);return 1.0 - fdist.cumulativeProbability(a.F);

    }finally{__CLR4_4_114zb14zblb90paq8.R.flushNeeded();}}

    /**
     * Computes the ANOVA P-value for a collection of {@link SummaryStatistics}.
     *
     * <p><strong>Preconditions</strong>: <ul>
     * <li>The categoryData <code>Collection</code> must contain
     * {@link SummaryStatistics}.</li>
     * <li> There must be at least two {@link SummaryStatistics} in the
     * <code>categoryData</code> collection and each of these statistics must
     * contain at least two values.</li></ul></p><p>
     * This implementation uses the
     * {@link org.apache.commons.math3.distribution.FDistribution
     * commons-math F Distribution implementation} to estimate the exact
     * p-value, using the formula<pre>
     *   p = 1 - cumulativeProbability(F)</pre>
     * where <code>F</code> is the F value and <code>cumulativeProbability</code>
     * is the commons-math implementation of the F distribution.</p>
     *
     * @param categoryData <code>Collection</code> of {@link SummaryStatistics}
     * each containing data for one category
     * @param allowOneElementData if true, allow computation for one catagory
     * only or for one data element per category
     * @return Pvalue
     * @throws NullArgumentException if <code>categoryData</code> is <code>null</code>
     * @throws DimensionMismatchException if the length of the <code>categoryData</code>
     * array is less than 2 or a contained {@link SummaryStatistics} does not have
     * at least two values
     * @throws ConvergenceException if the p-value can not be computed due to a convergence error
     * @throws MaxCountExceededException if the maximum number of iterations is exceeded
     * @since 3.2
     */
    public double anovaPValue(final Collection<SummaryStatistics> categoryData,
                              final boolean allowOneElementData)
        throws NullArgumentException, DimensionMismatchException,
               ConvergenceException, MaxCountExceededException {try{__CLR4_4_114zb14zblb90paq8.R.inc(53119);

        __CLR4_4_114zb14zblb90paq8.R.inc(53120);final AnovaStats a = anovaStats(categoryData, allowOneElementData);
        __CLR4_4_114zb14zblb90paq8.R.inc(53121);final FDistribution fdist = new FDistribution(a.dfbg, a.dfwg);
        __CLR4_4_114zb14zblb90paq8.R.inc(53122);return 1.0 - fdist.cumulativeProbability(a.F);

    }finally{__CLR4_4_114zb14zblb90paq8.R.flushNeeded();}}

    /**
     * This method calls the method that actually does the calculations (except
     * P-value).
     *
     * @param categoryData
     *            <code>Collection</code> of <code>double[]</code> arrays each
     *            containing data for one category
     * @return computed AnovaStats
     * @throws NullArgumentException
     *             if <code>categoryData</code> is <code>null</code>
     * @throws DimensionMismatchException
     *             if the length of the <code>categoryData</code> array is less
     *             than 2 or a contained <code>double[]</code> array does not
     *             contain at least two values
     */
    private AnovaStats anovaStats(final Collection<double[]> categoryData)
        throws NullArgumentException, DimensionMismatchException {try{__CLR4_4_114zb14zblb90paq8.R.inc(53123);

        __CLR4_4_114zb14zblb90paq8.R.inc(53124);MathUtils.checkNotNull(categoryData);

        __CLR4_4_114zb14zblb90paq8.R.inc(53125);final Collection<SummaryStatistics> categoryDataSummaryStatistics =
                new ArrayList<SummaryStatistics>(categoryData.size());

        // convert arrays to SummaryStatistics
        __CLR4_4_114zb14zblb90paq8.R.inc(53126);for (final double[] data : categoryData) {{
            __CLR4_4_114zb14zblb90paq8.R.inc(53127);final SummaryStatistics dataSummaryStatistics = new SummaryStatistics();
            __CLR4_4_114zb14zblb90paq8.R.inc(53128);categoryDataSummaryStatistics.add(dataSummaryStatistics);
            __CLR4_4_114zb14zblb90paq8.R.inc(53129);for (final double val : data) {{
                __CLR4_4_114zb14zblb90paq8.R.inc(53130);dataSummaryStatistics.addValue(val);
            }
        }}

        }__CLR4_4_114zb14zblb90paq8.R.inc(53131);return anovaStats(categoryDataSummaryStatistics, false);

    }finally{__CLR4_4_114zb14zblb90paq8.R.flushNeeded();}}

    /**
     * Performs an ANOVA test, evaluating the null hypothesis that there
     * is no difference among the means of the data categories.
     *
     * <p><strong>Preconditions</strong>: <ul>
     * <li>The categoryData <code>Collection</code> must contain
     * <code>double[]</code> arrays.</li>
     * <li> There must be at least two <code>double[]</code> arrays in the
     * <code>categoryData</code> collection and each of these arrays must
     * contain at least two values.</li>
     * <li>alpha must be strictly greater than 0 and less than or equal to 0.5.
     * </li></ul></p><p>
     * This implementation uses the
     * {@link org.apache.commons.math3.distribution.FDistribution
     * commons-math F Distribution implementation} to estimate the exact
     * p-value, using the formula<pre>
     *   p = 1 - cumulativeProbability(F)</pre>
     * where <code>F</code> is the F value and <code>cumulativeProbability</code>
     * is the commons-math implementation of the F distribution.</p>
     * <p>True is returned iff the estimated p-value is less than alpha.</p>
     *
     * @param categoryData <code>Collection</code> of <code>double[]</code>
     * arrays each containing data for one category
     * @param alpha significance level of the test
     * @return true if the null hypothesis can be rejected with
     * confidence 1 - alpha
     * @throws NullArgumentException if <code>categoryData</code> is <code>null</code>
     * @throws DimensionMismatchException if the length of the <code>categoryData</code>
     * array is less than 2 or a contained <code>double[]</code> array does not have
     * at least two values
     * @throws OutOfRangeException if <code>alpha</code> is not in the range (0, 0.5]
     * @throws ConvergenceException if the p-value can not be computed due to a convergence error
     * @throws MaxCountExceededException if the maximum number of iterations is exceeded
     */
    public boolean anovaTest(final Collection<double[]> categoryData,
                             final double alpha)
        throws NullArgumentException, DimensionMismatchException,
        OutOfRangeException, ConvergenceException, MaxCountExceededException {try{__CLR4_4_114zb14zblb90paq8.R.inc(53132);

        __CLR4_4_114zb14zblb90paq8.R.inc(53133);if (((((alpha <= 0) || (alpha > 0.5))&&(__CLR4_4_114zb14zblb90paq8.R.iget(53134)!=0|true))||(__CLR4_4_114zb14zblb90paq8.R.iget(53135)==0&false))) {{
            __CLR4_4_114zb14zblb90paq8.R.inc(53136);throw new OutOfRangeException(
                    LocalizedFormats.OUT_OF_BOUND_SIGNIFICANCE_LEVEL,
                    alpha, 0, 0.5);
        }
        }__CLR4_4_114zb14zblb90paq8.R.inc(53137);return anovaPValue(categoryData) < alpha;

    }finally{__CLR4_4_114zb14zblb90paq8.R.flushNeeded();}}

    /**
     * This method actually does the calculations (except P-value).
     *
     * @param categoryData <code>Collection</code> of <code>double[]</code>
     * arrays each containing data for one category
     * @param allowOneElementData if true, allow computation for one catagory
     * only or for one data element per category
     * @return computed AnovaStats
     * @throws NullArgumentException if <code>categoryData</code> is <code>null</code>
     * @throws DimensionMismatchException if <code>allowOneElementData</code> is false and the number of
     * categories is less than 2 or a contained SummaryStatistics does not contain
     * at least two values
     */
    private AnovaStats anovaStats(final Collection<SummaryStatistics> categoryData,
                                  final boolean allowOneElementData)
        throws NullArgumentException, DimensionMismatchException {try{__CLR4_4_114zb14zblb90paq8.R.inc(53138);

        __CLR4_4_114zb14zblb90paq8.R.inc(53139);MathUtils.checkNotNull(categoryData);

        __CLR4_4_114zb14zblb90paq8.R.inc(53140);if ((((!allowOneElementData)&&(__CLR4_4_114zb14zblb90paq8.R.iget(53141)!=0|true))||(__CLR4_4_114zb14zblb90paq8.R.iget(53142)==0&false))) {{
            // check if we have enough categories
            __CLR4_4_114zb14zblb90paq8.R.inc(53143);if ((((categoryData.size() < 2)&&(__CLR4_4_114zb14zblb90paq8.R.iget(53144)!=0|true))||(__CLR4_4_114zb14zblb90paq8.R.iget(53145)==0&false))) {{
                __CLR4_4_114zb14zblb90paq8.R.inc(53146);throw new DimensionMismatchException(LocalizedFormats.TWO_OR_MORE_CATEGORIES_REQUIRED,
                                                     categoryData.size(), 2);
            }

            // check if each category has enough data
            }__CLR4_4_114zb14zblb90paq8.R.inc(53147);for (final SummaryStatistics array : categoryData) {{
                __CLR4_4_114zb14zblb90paq8.R.inc(53148);if ((((array.getN() <= 1)&&(__CLR4_4_114zb14zblb90paq8.R.iget(53149)!=0|true))||(__CLR4_4_114zb14zblb90paq8.R.iget(53150)==0&false))) {{
                    __CLR4_4_114zb14zblb90paq8.R.inc(53151);throw new DimensionMismatchException(LocalizedFormats.TWO_OR_MORE_VALUES_IN_CATEGORY_REQUIRED,
                                                         (int) array.getN(), 2);
                }
            }}
        }}

        }__CLR4_4_114zb14zblb90paq8.R.inc(53152);int dfwg = 0;
        __CLR4_4_114zb14zblb90paq8.R.inc(53153);double sswg = 0;
        __CLR4_4_114zb14zblb90paq8.R.inc(53154);double totsum = 0;
        __CLR4_4_114zb14zblb90paq8.R.inc(53155);double totsumsq = 0;
        __CLR4_4_114zb14zblb90paq8.R.inc(53156);int totnum = 0;

        __CLR4_4_114zb14zblb90paq8.R.inc(53157);for (final SummaryStatistics data : categoryData) {{

            __CLR4_4_114zb14zblb90paq8.R.inc(53158);final double sum = data.getSum();
            __CLR4_4_114zb14zblb90paq8.R.inc(53159);final double sumsq = data.getSumsq();
            __CLR4_4_114zb14zblb90paq8.R.inc(53160);final int num = (int) data.getN();
            __CLR4_4_114zb14zblb90paq8.R.inc(53161);totnum += num;
            __CLR4_4_114zb14zblb90paq8.R.inc(53162);totsum += sum;
            __CLR4_4_114zb14zblb90paq8.R.inc(53163);totsumsq += sumsq;

            __CLR4_4_114zb14zblb90paq8.R.inc(53164);dfwg += num - 1;
            __CLR4_4_114zb14zblb90paq8.R.inc(53165);final double ss = sumsq - ((sum * sum) / num);
            __CLR4_4_114zb14zblb90paq8.R.inc(53166);sswg += ss;
        }

        }__CLR4_4_114zb14zblb90paq8.R.inc(53167);final double sst = totsumsq - ((totsum * totsum) / totnum);
        __CLR4_4_114zb14zblb90paq8.R.inc(53168);final double ssbg = sst - sswg;
        __CLR4_4_114zb14zblb90paq8.R.inc(53169);final int dfbg = categoryData.size() - 1;
        __CLR4_4_114zb14zblb90paq8.R.inc(53170);final double msbg = ssbg / dfbg;
        __CLR4_4_114zb14zblb90paq8.R.inc(53171);final double mswg = sswg / dfwg;
        __CLR4_4_114zb14zblb90paq8.R.inc(53172);final double F = msbg / mswg;

        __CLR4_4_114zb14zblb90paq8.R.inc(53173);return new AnovaStats(dfbg, dfwg, F);

    }finally{__CLR4_4_114zb14zblb90paq8.R.flushNeeded();}}

    /**
        Convenience class to pass dfbg,dfwg,F values around within OneWayAnova.
        No get/set methods provided.
    */
    private static class AnovaStats {

        /** Degrees of freedom in numerator (between groups). */
        private final int dfbg;

        /** Degrees of freedom in denominator (within groups). */
        private final int dfwg;

        /** Statistic. */
        private final double F;

        /**
         * Constructor
         * @param dfbg degrees of freedom in numerator (between groups)
         * @param dfwg degrees of freedom in denominator (within groups)
         * @param F statistic
         */
        private AnovaStats(int dfbg, int dfwg, double F) {try{__CLR4_4_114zb14zblb90paq8.R.inc(53174);
            __CLR4_4_114zb14zblb90paq8.R.inc(53175);this.dfbg = dfbg;
            __CLR4_4_114zb14zblb90paq8.R.inc(53176);this.dfwg = dfwg;
            __CLR4_4_114zb14zblb90paq8.R.inc(53177);this.F = F;
        }finally{__CLR4_4_114zb14zblb90paq8.R.flushNeeded();}}
    }

}
