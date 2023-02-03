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
package org.apache.commons.math3.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.util.LocalizedFormats;

/**
 * Combinatorial utilities.
 *
 * @version $Id$
 * @since 3.3
 */
public final class CombinatoricsUtils {public static class __CLR4_4_117c117c1lb90pav5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,56455,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** All long-representable factorials */
    static final long[] FACTORIALS = new long[] {
                       1l,                  1l,                   2l,
                       6l,                 24l,                 120l,
                     720l,               5040l,               40320l,
                  362880l,            3628800l,            39916800l,
               479001600l,         6227020800l,         87178291200l,
           1307674368000l,     20922789888000l,     355687428096000l,
        6402373705728000l, 121645100408832000l, 2432902008176640000l };

    /** Stirling numbers of the second kind. */
    static final AtomicReference<long[][]> STIRLING_S2 = new AtomicReference<long[][]> (null);

    /** Private constructor. */
    private CombinatoricsUtils() {
        super();__CLR4_4_117c117c1lb90pav5.R.inc(56162);try{__CLR4_4_117c117c1lb90pav5.R.inc(56161);
    }finally{__CLR4_4_117c117c1lb90pav5.R.flushNeeded();}}


    /**
     * Returns an exact representation of the <a
     * href="http://mathworld.wolfram.com/BinomialCoefficient.html"> Binomial
     * Coefficient</a>, "{@code n choose k}", the number of
     * {@code k}-element subsets that can be selected from an
     * {@code n}-element set.
     * <p>
     * <Strong>Preconditions</strong>:
     * <ul>
     * <li> {@code 0 <= k <= n } (otherwise
     * {@code IllegalArgumentException} is thrown)</li>
     * <li> The result is small enough to fit into a {@code long}. The
     * largest value of {@code n} for which all coefficients are
     * {@code  < Long.MAX_VALUE} is 66. If the computed value exceeds
     * {@code Long.MAX_VALUE} an {@code ArithMeticException} is
     * thrown.</li>
     * </ul></p>
     *
     * @param n the size of the set
     * @param k the size of the subsets to be counted
     * @return {@code n choose k}
     * @throws NotPositiveException if {@code n < 0}.
     * @throws NumberIsTooLargeException if {@code k > n}.
     * @throws MathArithmeticException if the result is too large to be
     * represented by a long integer.
     */
    public static long binomialCoefficient(final int n, final int k)
        throws NotPositiveException, NumberIsTooLargeException, MathArithmeticException {try{__CLR4_4_117c117c1lb90pav5.R.inc(56163);
        __CLR4_4_117c117c1lb90pav5.R.inc(56164);CombinatoricsUtils.checkBinomial(n, k);
        __CLR4_4_117c117c1lb90pav5.R.inc(56165);if (((((n == k) || (k == 0))&&(__CLR4_4_117c117c1lb90pav5.R.iget(56166)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56167)==0&false))) {{
            __CLR4_4_117c117c1lb90pav5.R.inc(56168);return 1;
        }
        }__CLR4_4_117c117c1lb90pav5.R.inc(56169);if (((((k == 1) || (k == n - 1))&&(__CLR4_4_117c117c1lb90pav5.R.iget(56170)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56171)==0&false))) {{
            __CLR4_4_117c117c1lb90pav5.R.inc(56172);return n;
        }
        // Use symmetry for large k
        }__CLR4_4_117c117c1lb90pav5.R.inc(56173);if ((((k > n / 2)&&(__CLR4_4_117c117c1lb90pav5.R.iget(56174)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56175)==0&false))) {{
            __CLR4_4_117c117c1lb90pav5.R.inc(56176);return binomialCoefficient(n, n - k);
        }

        // We use the formula
        // (n choose k) = n! / (n-k)! / k!
        // (n choose k) == ((n-k+1)*...*n) / (1*...*k)
        // which could be written
        // (n choose k) == (n-1 choose k-1) * n / k
        }__CLR4_4_117c117c1lb90pav5.R.inc(56177);long result = 1;
        __CLR4_4_117c117c1lb90pav5.R.inc(56178);if ((((n <= 61)&&(__CLR4_4_117c117c1lb90pav5.R.iget(56179)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56180)==0&false))) {{
            // For n <= 61, the naive implementation cannot overflow.
            __CLR4_4_117c117c1lb90pav5.R.inc(56181);int i = n - k + 1;
            __CLR4_4_117c117c1lb90pav5.R.inc(56182);for (int j = 1; (((j <= k)&&(__CLR4_4_117c117c1lb90pav5.R.iget(56183)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56184)==0&false)); j++) {{
                __CLR4_4_117c117c1lb90pav5.R.inc(56185);result = result * i / j;
                __CLR4_4_117c117c1lb90pav5.R.inc(56186);i++;
            }
        }} }else {__CLR4_4_117c117c1lb90pav5.R.inc(56187);if ((((n <= 66)&&(__CLR4_4_117c117c1lb90pav5.R.iget(56188)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56189)==0&false))) {{
            // For n > 61 but n <= 66, the result cannot overflow,
            // but we must take care not to overflow intermediate values.
            __CLR4_4_117c117c1lb90pav5.R.inc(56190);int i = n - k + 1;
            __CLR4_4_117c117c1lb90pav5.R.inc(56191);for (int j = 1; (((j <= k)&&(__CLR4_4_117c117c1lb90pav5.R.iget(56192)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56193)==0&false)); j++) {{
                // We know that (result * i) is divisible by j,
                // but (result * i) may overflow, so we split j:
                // Filter out the gcd, d, so j/d and i/d are integer.
                // result is divisible by (j/d) because (j/d)
                // is relative prime to (i/d) and is a divisor of
                // result * (i/d).
                __CLR4_4_117c117c1lb90pav5.R.inc(56194);final long d = ArithmeticUtils.gcd(i, j);
                __CLR4_4_117c117c1lb90pav5.R.inc(56195);result = (result / (j / d)) * (i / d);
                __CLR4_4_117c117c1lb90pav5.R.inc(56196);i++;
            }
        }} }else {{
            // For n > 66, a result overflow might occur, so we check
            // the multiplication, taking care to not overflow
            // unnecessary.
            __CLR4_4_117c117c1lb90pav5.R.inc(56197);int i = n - k + 1;
            __CLR4_4_117c117c1lb90pav5.R.inc(56198);for (int j = 1; (((j <= k)&&(__CLR4_4_117c117c1lb90pav5.R.iget(56199)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56200)==0&false)); j++) {{
                __CLR4_4_117c117c1lb90pav5.R.inc(56201);final long d = ArithmeticUtils.gcd(i, j);
                __CLR4_4_117c117c1lb90pav5.R.inc(56202);result = ArithmeticUtils.mulAndCheck(result / (j / d), i / d);
                __CLR4_4_117c117c1lb90pav5.R.inc(56203);i++;
            }
        }}
        }}__CLR4_4_117c117c1lb90pav5.R.inc(56204);return result;
    }finally{__CLR4_4_117c117c1lb90pav5.R.flushNeeded();}}

    /**
     * Returns a {@code double} representation of the <a
     * href="http://mathworld.wolfram.com/BinomialCoefficient.html"> Binomial
     * Coefficient</a>, "{@code n choose k}", the number of
     * {@code k}-element subsets that can be selected from an
     * {@code n}-element set.
     * <p>
     * <Strong>Preconditions</strong>:
     * <ul>
     * <li> {@code 0 <= k <= n } (otherwise
     * {@code IllegalArgumentException} is thrown)</li>
     * <li> The result is small enough to fit into a {@code double}. The
     * largest value of {@code n} for which all coefficients are <
     * Double.MAX_VALUE is 1029. If the computed value exceeds Double.MAX_VALUE,
     * Double.POSITIVE_INFINITY is returned</li>
     * </ul></p>
     *
     * @param n the size of the set
     * @param k the size of the subsets to be counted
     * @return {@code n choose k}
     * @throws NotPositiveException if {@code n < 0}.
     * @throws NumberIsTooLargeException if {@code k > n}.
     * @throws MathArithmeticException if the result is too large to be
     * represented by a long integer.
     */
    public static double binomialCoefficientDouble(final int n, final int k)
        throws NotPositiveException, NumberIsTooLargeException, MathArithmeticException {try{__CLR4_4_117c117c1lb90pav5.R.inc(56205);
        __CLR4_4_117c117c1lb90pav5.R.inc(56206);CombinatoricsUtils.checkBinomial(n, k);
        __CLR4_4_117c117c1lb90pav5.R.inc(56207);if (((((n == k) || (k == 0))&&(__CLR4_4_117c117c1lb90pav5.R.iget(56208)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56209)==0&false))) {{
            __CLR4_4_117c117c1lb90pav5.R.inc(56210);return 1d;
        }
        }__CLR4_4_117c117c1lb90pav5.R.inc(56211);if (((((k == 1) || (k == n - 1))&&(__CLR4_4_117c117c1lb90pav5.R.iget(56212)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56213)==0&false))) {{
            __CLR4_4_117c117c1lb90pav5.R.inc(56214);return n;
        }
        }__CLR4_4_117c117c1lb90pav5.R.inc(56215);if ((((k > n/2)&&(__CLR4_4_117c117c1lb90pav5.R.iget(56216)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56217)==0&false))) {{
            __CLR4_4_117c117c1lb90pav5.R.inc(56218);return binomialCoefficientDouble(n, n - k);
        }
        }__CLR4_4_117c117c1lb90pav5.R.inc(56219);if ((((n < 67)&&(__CLR4_4_117c117c1lb90pav5.R.iget(56220)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56221)==0&false))) {{
            __CLR4_4_117c117c1lb90pav5.R.inc(56222);return binomialCoefficient(n,k);
        }

        }__CLR4_4_117c117c1lb90pav5.R.inc(56223);double result = 1d;
        __CLR4_4_117c117c1lb90pav5.R.inc(56224);for (int i = 1; (((i <= k)&&(__CLR4_4_117c117c1lb90pav5.R.iget(56225)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56226)==0&false)); i++) {{
             __CLR4_4_117c117c1lb90pav5.R.inc(56227);result *= (double)(n - k + i) / (double)i;
        }

        }__CLR4_4_117c117c1lb90pav5.R.inc(56228);return FastMath.floor(result + 0.5);
    }finally{__CLR4_4_117c117c1lb90pav5.R.flushNeeded();}}

    /**
     * Returns the natural {@code log} of the <a
     * href="http://mathworld.wolfram.com/BinomialCoefficient.html"> Binomial
     * Coefficient</a>, "{@code n choose k}", the number of
     * {@code k}-element subsets that can be selected from an
     * {@code n}-element set.
     * <p>
     * <Strong>Preconditions</strong>:
     * <ul>
     * <li> {@code 0 <= k <= n } (otherwise
     * {@code IllegalArgumentException} is thrown)</li>
     * </ul></p>
     *
     * @param n the size of the set
     * @param k the size of the subsets to be counted
     * @return {@code n choose k}
     * @throws NotPositiveException if {@code n < 0}.
     * @throws NumberIsTooLargeException if {@code k > n}.
     * @throws MathArithmeticException if the result is too large to be
     * represented by a long integer.
     */
    public static double binomialCoefficientLog(final int n, final int k)
        throws NotPositiveException, NumberIsTooLargeException, MathArithmeticException {try{__CLR4_4_117c117c1lb90pav5.R.inc(56229);
        __CLR4_4_117c117c1lb90pav5.R.inc(56230);CombinatoricsUtils.checkBinomial(n, k);
        __CLR4_4_117c117c1lb90pav5.R.inc(56231);if (((((n == k) || (k == 0))&&(__CLR4_4_117c117c1lb90pav5.R.iget(56232)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56233)==0&false))) {{
            __CLR4_4_117c117c1lb90pav5.R.inc(56234);return 0;
        }
        }__CLR4_4_117c117c1lb90pav5.R.inc(56235);if (((((k == 1) || (k == n - 1))&&(__CLR4_4_117c117c1lb90pav5.R.iget(56236)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56237)==0&false))) {{
            __CLR4_4_117c117c1lb90pav5.R.inc(56238);return FastMath.log(n);
        }

        /*
         * For values small enough to do exact integer computation,
         * return the log of the exact value
         */
        }__CLR4_4_117c117c1lb90pav5.R.inc(56239);if ((((n < 67)&&(__CLR4_4_117c117c1lb90pav5.R.iget(56240)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56241)==0&false))) {{
            __CLR4_4_117c117c1lb90pav5.R.inc(56242);return FastMath.log(binomialCoefficient(n,k));
        }

        /*
         * Return the log of binomialCoefficientDouble for values that will not
         * overflow binomialCoefficientDouble
         */
        }__CLR4_4_117c117c1lb90pav5.R.inc(56243);if ((((n < 1030)&&(__CLR4_4_117c117c1lb90pav5.R.iget(56244)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56245)==0&false))) {{
            __CLR4_4_117c117c1lb90pav5.R.inc(56246);return FastMath.log(binomialCoefficientDouble(n, k));
        }

        }__CLR4_4_117c117c1lb90pav5.R.inc(56247);if ((((k > n / 2)&&(__CLR4_4_117c117c1lb90pav5.R.iget(56248)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56249)==0&false))) {{
            __CLR4_4_117c117c1lb90pav5.R.inc(56250);return binomialCoefficientLog(n, n - k);
        }

        /*
         * Sum logs for values that could overflow
         */
        }__CLR4_4_117c117c1lb90pav5.R.inc(56251);double logSum = 0;

        // n!/(n-k)!
        __CLR4_4_117c117c1lb90pav5.R.inc(56252);for (int i = n - k + 1; (((i <= n)&&(__CLR4_4_117c117c1lb90pav5.R.iget(56253)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56254)==0&false)); i++) {{
            __CLR4_4_117c117c1lb90pav5.R.inc(56255);logSum += FastMath.log(i);
        }

        // divide by k!
        }__CLR4_4_117c117c1lb90pav5.R.inc(56256);for (int i = 2; (((i <= k)&&(__CLR4_4_117c117c1lb90pav5.R.iget(56257)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56258)==0&false)); i++) {{
            __CLR4_4_117c117c1lb90pav5.R.inc(56259);logSum -= FastMath.log(i);
        }

        }__CLR4_4_117c117c1lb90pav5.R.inc(56260);return logSum;
    }finally{__CLR4_4_117c117c1lb90pav5.R.flushNeeded();}}

    /**
     * Returns n!. Shorthand for {@code n} <a
     * href="http://mathworld.wolfram.com/Factorial.html"> Factorial</a>, the
     * product of the numbers {@code 1,...,n}.
     * <p>
     * <Strong>Preconditions</strong>:
     * <ul>
     * <li> {@code n >= 0} (otherwise
     * {@code IllegalArgumentException} is thrown)</li>
     * <li> The result is small enough to fit into a {@code long}. The
     * largest value of {@code n} for which {@code n!} <
     * Long.MAX_VALUE} is 20. If the computed value exceeds {@code Long.MAX_VALUE}
     * an {@code ArithMeticException } is thrown.</li>
     * </ul>
     * </p>
     *
     * @param n argument
     * @return {@code n!}
     * @throws MathArithmeticException if the result is too large to be represented
     * by a {@code long}.
     * @throws NotPositiveException if {@code n < 0}.
     * @throws MathArithmeticException if {@code n > 20}: The factorial value is too
     * large to fit in a {@code long}.
     */
    public static long factorial(final int n) throws NotPositiveException, MathArithmeticException {try{__CLR4_4_117c117c1lb90pav5.R.inc(56261);
        __CLR4_4_117c117c1lb90pav5.R.inc(56262);if ((((n < 0)&&(__CLR4_4_117c117c1lb90pav5.R.iget(56263)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56264)==0&false))) {{
            __CLR4_4_117c117c1lb90pav5.R.inc(56265);throw new NotPositiveException(LocalizedFormats.FACTORIAL_NEGATIVE_PARAMETER,
                                           n);
        }
        }__CLR4_4_117c117c1lb90pav5.R.inc(56266);if ((((n > 20)&&(__CLR4_4_117c117c1lb90pav5.R.iget(56267)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56268)==0&false))) {{
            __CLR4_4_117c117c1lb90pav5.R.inc(56269);throw new MathArithmeticException();
        }
        }__CLR4_4_117c117c1lb90pav5.R.inc(56270);return FACTORIALS[n];
    }finally{__CLR4_4_117c117c1lb90pav5.R.flushNeeded();}}

    /**
     * Compute n!, the<a href="http://mathworld.wolfram.com/Factorial.html">
     * factorial</a> of {@code n} (the product of the numbers 1 to n), as a
     * {@code double}.
     * The result should be small enough to fit into a {@code double}: The
     * largest {@code n} for which {@code n! < Double.MAX_VALUE} is 170.
     * If the computed value exceeds {@code Double.MAX_VALUE},
     * {@code Double.POSITIVE_INFINITY} is returned.
     *
     * @param n Argument.
     * @return {@code n!}
     * @throws NotPositiveException if {@code n < 0}.
     */
    public static double factorialDouble(final int n) throws NotPositiveException {try{__CLR4_4_117c117c1lb90pav5.R.inc(56271);
        __CLR4_4_117c117c1lb90pav5.R.inc(56272);if ((((n < 0)&&(__CLR4_4_117c117c1lb90pav5.R.iget(56273)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56274)==0&false))) {{
            __CLR4_4_117c117c1lb90pav5.R.inc(56275);throw new NotPositiveException(LocalizedFormats.FACTORIAL_NEGATIVE_PARAMETER,
                                           n);
        }
        }__CLR4_4_117c117c1lb90pav5.R.inc(56276);if ((((n < 21)&&(__CLR4_4_117c117c1lb90pav5.R.iget(56277)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56278)==0&false))) {{
            __CLR4_4_117c117c1lb90pav5.R.inc(56279);return FACTORIALS[n];
        }
        }__CLR4_4_117c117c1lb90pav5.R.inc(56280);return FastMath.floor(FastMath.exp(CombinatoricsUtils.factorialLog(n)) + 0.5);
    }finally{__CLR4_4_117c117c1lb90pav5.R.flushNeeded();}}

    /**
     * Compute the natural logarithm of the factorial of {@code n}.
     *
     * @param n Argument.
     * @return {@code n!}
     * @throws NotPositiveException if {@code n < 0}.
     */
    public static double factorialLog(final int n) throws NotPositiveException {try{__CLR4_4_117c117c1lb90pav5.R.inc(56281);
        __CLR4_4_117c117c1lb90pav5.R.inc(56282);if ((((n < 0)&&(__CLR4_4_117c117c1lb90pav5.R.iget(56283)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56284)==0&false))) {{
            __CLR4_4_117c117c1lb90pav5.R.inc(56285);throw new NotPositiveException(LocalizedFormats.FACTORIAL_NEGATIVE_PARAMETER,
                                           n);
        }
        }__CLR4_4_117c117c1lb90pav5.R.inc(56286);if ((((n < 21)&&(__CLR4_4_117c117c1lb90pav5.R.iget(56287)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56288)==0&false))) {{
            __CLR4_4_117c117c1lb90pav5.R.inc(56289);return FastMath.log(FACTORIALS[n]);
        }
        }__CLR4_4_117c117c1lb90pav5.R.inc(56290);double logSum = 0;
        __CLR4_4_117c117c1lb90pav5.R.inc(56291);for (int i = 2; (((i <= n)&&(__CLR4_4_117c117c1lb90pav5.R.iget(56292)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56293)==0&false)); i++) {{
            __CLR4_4_117c117c1lb90pav5.R.inc(56294);logSum += FastMath.log(i);
        }
        }__CLR4_4_117c117c1lb90pav5.R.inc(56295);return logSum;
    }finally{__CLR4_4_117c117c1lb90pav5.R.flushNeeded();}}

    /**
     * Returns the <a
     * href="http://mathworld.wolfram.com/StirlingNumberoftheSecondKind.html">
     * Stirling number of the second kind</a>, "{@code S(n,k)}", the number of
     * ways of partitioning an {@code n}-element set into {@code k} non-empty
     * subsets.
     * <p>
     * The preconditions are {@code 0 <= k <= n } (otherwise
     * {@code NotPositiveException} is thrown)
     * </p>
     * @param n the size of the set
     * @param k the number of non-empty subsets
     * @return {@code S(n,k)}
     * @throws NotPositiveException if {@code k < 0}.
     * @throws NumberIsTooLargeException if {@code k > n}.
     * @throws MathArithmeticException if some overflow happens, typically for n exceeding 25 and
     * k between 20 and n-2 (S(n,n-1) is handled specifically and does not overflow)
     * @since 3.1
     */
    public static long stirlingS2(final int n, final int k)
        throws NotPositiveException, NumberIsTooLargeException, MathArithmeticException {try{__CLR4_4_117c117c1lb90pav5.R.inc(56296);
        __CLR4_4_117c117c1lb90pav5.R.inc(56297);if ((((k < 0)&&(__CLR4_4_117c117c1lb90pav5.R.iget(56298)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56299)==0&false))) {{
            __CLR4_4_117c117c1lb90pav5.R.inc(56300);throw new NotPositiveException(k);
        }
        }__CLR4_4_117c117c1lb90pav5.R.inc(56301);if ((((k > n)&&(__CLR4_4_117c117c1lb90pav5.R.iget(56302)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56303)==0&false))) {{
            __CLR4_4_117c117c1lb90pav5.R.inc(56304);throw new NumberIsTooLargeException(k, n, true);
        }

        }__CLR4_4_117c117c1lb90pav5.R.inc(56305);long[][] stirlingS2 = STIRLING_S2.get();

        __CLR4_4_117c117c1lb90pav5.R.inc(56306);if ((((stirlingS2 == null)&&(__CLR4_4_117c117c1lb90pav5.R.iget(56307)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56308)==0&false))) {{
            // the cache has never been initialized, compute the first numbers
            // by direct recurrence relation

            // as S(26,9) = 11201516780955125625 is larger than Long.MAX_VALUE
            // we must stop computation at row 26
            __CLR4_4_117c117c1lb90pav5.R.inc(56309);final int maxIndex = 26;
            __CLR4_4_117c117c1lb90pav5.R.inc(56310);stirlingS2 = new long[maxIndex][];
            __CLR4_4_117c117c1lb90pav5.R.inc(56311);stirlingS2[0] = new long[] { 1l };
            __CLR4_4_117c117c1lb90pav5.R.inc(56312);for (int i = 1; (((i < stirlingS2.length)&&(__CLR4_4_117c117c1lb90pav5.R.iget(56313)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56314)==0&false)); ++i) {{
                __CLR4_4_117c117c1lb90pav5.R.inc(56315);stirlingS2[i] = new long[i + 1];
                __CLR4_4_117c117c1lb90pav5.R.inc(56316);stirlingS2[i][0] = 0;
                __CLR4_4_117c117c1lb90pav5.R.inc(56317);stirlingS2[i][1] = 1;
                __CLR4_4_117c117c1lb90pav5.R.inc(56318);stirlingS2[i][i] = 1;
                __CLR4_4_117c117c1lb90pav5.R.inc(56319);for (int j = 2; (((j < i)&&(__CLR4_4_117c117c1lb90pav5.R.iget(56320)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56321)==0&false)); ++j) {{
                    __CLR4_4_117c117c1lb90pav5.R.inc(56322);stirlingS2[i][j] = j * stirlingS2[i - 1][j] + stirlingS2[i - 1][j - 1];
                }
            }}

            // atomically save the cache
            }__CLR4_4_117c117c1lb90pav5.R.inc(56323);STIRLING_S2.compareAndSet(null, stirlingS2);

        }

        }__CLR4_4_117c117c1lb90pav5.R.inc(56324);if ((((n < stirlingS2.length)&&(__CLR4_4_117c117c1lb90pav5.R.iget(56325)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56326)==0&false))) {{
            // the number is in the small cache
            __CLR4_4_117c117c1lb90pav5.R.inc(56327);return stirlingS2[n][k];
        } }else {{
            // use explicit formula to compute the number without caching it
            __CLR4_4_117c117c1lb90pav5.R.inc(56328);if ((((k == 0)&&(__CLR4_4_117c117c1lb90pav5.R.iget(56329)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56330)==0&false))) {{
                __CLR4_4_117c117c1lb90pav5.R.inc(56331);return 0;
            } }else {__CLR4_4_117c117c1lb90pav5.R.inc(56332);if ((((k == 1 || k == n)&&(__CLR4_4_117c117c1lb90pav5.R.iget(56333)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56334)==0&false))) {{
                __CLR4_4_117c117c1lb90pav5.R.inc(56335);return 1;
            } }else {__CLR4_4_117c117c1lb90pav5.R.inc(56336);if ((((k == 2)&&(__CLR4_4_117c117c1lb90pav5.R.iget(56337)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56338)==0&false))) {{
                __CLR4_4_117c117c1lb90pav5.R.inc(56339);return (1l << (n - 1)) - 1l;
            } }else {__CLR4_4_117c117c1lb90pav5.R.inc(56340);if ((((k == n - 1)&&(__CLR4_4_117c117c1lb90pav5.R.iget(56341)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56342)==0&false))) {{
                __CLR4_4_117c117c1lb90pav5.R.inc(56343);return binomialCoefficient(n, 2);
            } }else {{
                // definition formula: note that this may trigger some overflow
                __CLR4_4_117c117c1lb90pav5.R.inc(56344);long sum = 0;
                __CLR4_4_117c117c1lb90pav5.R.inc(56345);long sign = (((((k & 0x1) == 0) )&&(__CLR4_4_117c117c1lb90pav5.R.iget(56346)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56347)==0&false))? 1 : -1;
                __CLR4_4_117c117c1lb90pav5.R.inc(56348);for (int j = 1; (((j <= k)&&(__CLR4_4_117c117c1lb90pav5.R.iget(56349)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56350)==0&false)); ++j) {{
                    __CLR4_4_117c117c1lb90pav5.R.inc(56351);sign = -sign;
                    __CLR4_4_117c117c1lb90pav5.R.inc(56352);sum += sign * binomialCoefficient(k, j) * ArithmeticUtils.pow(j, n);
                    __CLR4_4_117c117c1lb90pav5.R.inc(56353);if ((((sum < 0)&&(__CLR4_4_117c117c1lb90pav5.R.iget(56354)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56355)==0&false))) {{
                        // there was an overflow somewhere
                        __CLR4_4_117c117c1lb90pav5.R.inc(56356);throw new MathArithmeticException(LocalizedFormats.ARGUMENT_OUTSIDE_DOMAIN,
                                                          n, 0, stirlingS2.length - 1);
                    }
                }}
                }__CLR4_4_117c117c1lb90pav5.R.inc(56357);return sum / factorial(k);
            }
        }}}}}

    }}finally{__CLR4_4_117c117c1lb90pav5.R.flushNeeded();}}

    /**
     * Returns an Iterator whose range is the k-element subsets of {0, ..., n - 1}
     * represented as {@code int[]} arrays.
     * <p>
     * The arrays returned by the iterator are sorted in descending order and
     * they are visited in lexicographic order with significance from right to
     * left. For example, combinationsIterator(4, 2) returns an Iterator that
     * will generate the following sequence of arrays on successive calls to
     * {@code next()}:<br/>
     * {@code [0, 1], [0, 2], [1, 2], [0, 3], [1, 3], [2, 3]}
     * </p>
     * If {@code k == 0} an Iterator containing an empty array is returned and
     * if {@code k == n} an Iterator containing [0, ..., n -1] is returned.
     *
     * @param n size of the set from which subsets are selected
     * @param k size of the subsets to be enumerated
     * @return an Iterator over the k-sets in n
     * @throws NotPositiveException if {@code n < 0}.
     * @throws NumberIsTooLargeException if {@code k > n}.
     */
    public static Iterator<int[]> combinationsIterator(int n, int k) {try{__CLR4_4_117c117c1lb90pav5.R.inc(56358);
        __CLR4_4_117c117c1lb90pav5.R.inc(56359);checkBinomial(n, k);
        __CLR4_4_117c117c1lb90pav5.R.inc(56360);if ((((k == 0)&&(__CLR4_4_117c117c1lb90pav5.R.iget(56361)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56362)==0&false))) {{
            __CLR4_4_117c117c1lb90pav5.R.inc(56363);return new SingletonIterator(new int[]{});
        }
        }__CLR4_4_117c117c1lb90pav5.R.inc(56364);if ((((k == n)&&(__CLR4_4_117c117c1lb90pav5.R.iget(56365)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56366)==0&false))) {{
            // TODO: once getNatural is extracted from RandomDataGenerator, use it
            __CLR4_4_117c117c1lb90pav5.R.inc(56367);final int[] natural = new int[n];
            __CLR4_4_117c117c1lb90pav5.R.inc(56368);for (int i = 0; (((i < n)&&(__CLR4_4_117c117c1lb90pav5.R.iget(56369)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56370)==0&false)); i++) {{
                __CLR4_4_117c117c1lb90pav5.R.inc(56371);natural[i] = i;
            }
            }__CLR4_4_117c117c1lb90pav5.R.inc(56372);return new SingletonIterator(natural);
        }
        }__CLR4_4_117c117c1lb90pav5.R.inc(56373);return new LexicographicCombinationIterator(n, k);
    }finally{__CLR4_4_117c117c1lb90pav5.R.flushNeeded();}}

    /**
     * Lexicographic combinations iterator.
     * <p>
     * Implementation follows Algorithm T in <i>The Art of Computer Programming</i>
     * Internet Draft (PRE-FASCICLE 3A), "A Draft of Section 7.2.1.3 Generating All
     * Combinations</a>, D. Knuth, 2004.</p>
     * <p>
     * The degenerate cases {@code k == 0} and {@code k == n} are NOT handled by this
     * implementation.  If constructor arguments satisfy {@code k == 0}
     * or {@code k >= n}, no exception is generated, but the iterator is empty.
     * </p>
     *
     */
    private static class LexicographicCombinationIterator implements Iterator<int[]> {

        /** Size of subsets returned by the iterator */
        private final int k;

        /**
         * c[1], ..., c[k] stores the next combination; c[k + 1], c[k + 2] are
         * sentinels.
         * <p>
         * Note that c[0] is "wasted" but this makes it a little easier to
         * follow the code.
         * </p>
         */
        private final int[] c;

        /** Return value for {@link #hasNext()} */
        private boolean more = true;

        /** Marker: smallest index such that c[j + 1] > j */
        private int j;

        /**
         * Construct a CombinationIterator to enumerate k-sets from n.
         * <p>
         * NOTE: If {@code k === 0} or {@code k >= n}, the Iterator will be empty
         * (that is, {@link #hasNext()} will return {@code false} immediately.
         * </p>
         *
         * @param n size of the set from which subsets are enumerated
         * @param k size of the subsets to enumerate
         */
        public LexicographicCombinationIterator(int n, int k) {try{__CLR4_4_117c117c1lb90pav5.R.inc(56374);
            __CLR4_4_117c117c1lb90pav5.R.inc(56375);this.k = k;
            __CLR4_4_117c117c1lb90pav5.R.inc(56376);c = new int[k + 3];
            __CLR4_4_117c117c1lb90pav5.R.inc(56377);if ((((k == 0 || k >= n)&&(__CLR4_4_117c117c1lb90pav5.R.iget(56378)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56379)==0&false))) {{
                __CLR4_4_117c117c1lb90pav5.R.inc(56380);more = false;
                __CLR4_4_117c117c1lb90pav5.R.inc(56381);return;
            }
            // Initialize c to start with lexicographically first k-set
            }__CLR4_4_117c117c1lb90pav5.R.inc(56382);for (int i = 1; (((i <= k)&&(__CLR4_4_117c117c1lb90pav5.R.iget(56383)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56384)==0&false)); i++) {{
                __CLR4_4_117c117c1lb90pav5.R.inc(56385);c[i] = i - 1;
            }
            // Initialize sentinels
            }__CLR4_4_117c117c1lb90pav5.R.inc(56386);c[k + 1] = n;
            __CLR4_4_117c117c1lb90pav5.R.inc(56387);c[k + 2] = 0;
            __CLR4_4_117c117c1lb90pav5.R.inc(56388);j = k; // Set up invariant: j is smallest index such that c[j + 1] > j
        }finally{__CLR4_4_117c117c1lb90pav5.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        public boolean hasNext() {try{__CLR4_4_117c117c1lb90pav5.R.inc(56389);
            __CLR4_4_117c117c1lb90pav5.R.inc(56390);return more;
        }finally{__CLR4_4_117c117c1lb90pav5.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        public int[] next() {try{__CLR4_4_117c117c1lb90pav5.R.inc(56391);
            __CLR4_4_117c117c1lb90pav5.R.inc(56392);if ((((!more)&&(__CLR4_4_117c117c1lb90pav5.R.iget(56393)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56394)==0&false))) {{
                __CLR4_4_117c117c1lb90pav5.R.inc(56395);throw new NoSuchElementException();
            }
            // Copy return value (prepared by last activation)
            }__CLR4_4_117c117c1lb90pav5.R.inc(56396);final int[] ret = new int[k];
            __CLR4_4_117c117c1lb90pav5.R.inc(56397);System.arraycopy(c, 1, ret, 0, k);
            //final int[] ret = MathArrays.copyOf(c, k + 1);

            // Prepare next iteration
            // T2 and T6 loop
            __CLR4_4_117c117c1lb90pav5.R.inc(56398);int x = 0;
            __CLR4_4_117c117c1lb90pav5.R.inc(56399);if ((((j > 0)&&(__CLR4_4_117c117c1lb90pav5.R.iget(56400)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56401)==0&false))) {{
                __CLR4_4_117c117c1lb90pav5.R.inc(56402);x = j;
                __CLR4_4_117c117c1lb90pav5.R.inc(56403);c[j] = x;
                __CLR4_4_117c117c1lb90pav5.R.inc(56404);j--;
                __CLR4_4_117c117c1lb90pav5.R.inc(56405);return ret;
            }
            // T3
            }__CLR4_4_117c117c1lb90pav5.R.inc(56406);if ((((c[1] + 1 < c[2])&&(__CLR4_4_117c117c1lb90pav5.R.iget(56407)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56408)==0&false))) {{
                __CLR4_4_117c117c1lb90pav5.R.inc(56409);c[1] = c[1] + 1;
                __CLR4_4_117c117c1lb90pav5.R.inc(56410);return ret;
            } }else {{
                __CLR4_4_117c117c1lb90pav5.R.inc(56411);j = 2;
            }
            // T4
            }__CLR4_4_117c117c1lb90pav5.R.inc(56412);boolean stepDone = false;
            __CLR4_4_117c117c1lb90pav5.R.inc(56413);while ((((!stepDone)&&(__CLR4_4_117c117c1lb90pav5.R.iget(56414)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56415)==0&false))) {{
                __CLR4_4_117c117c1lb90pav5.R.inc(56416);c[j - 1] = j - 2;
                __CLR4_4_117c117c1lb90pav5.R.inc(56417);x = c[j] + 1;
                __CLR4_4_117c117c1lb90pav5.R.inc(56418);if ((((x == c[j + 1])&&(__CLR4_4_117c117c1lb90pav5.R.iget(56419)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56420)==0&false))) {{
                    __CLR4_4_117c117c1lb90pav5.R.inc(56421);j++;
                } }else {{
                    __CLR4_4_117c117c1lb90pav5.R.inc(56422);stepDone = true;
                }
            }}
            // T5
            }__CLR4_4_117c117c1lb90pav5.R.inc(56423);if ((((j > k)&&(__CLR4_4_117c117c1lb90pav5.R.iget(56424)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56425)==0&false))) {{
                __CLR4_4_117c117c1lb90pav5.R.inc(56426);more = false;
                __CLR4_4_117c117c1lb90pav5.R.inc(56427);return ret;
            }
            // T6
            }__CLR4_4_117c117c1lb90pav5.R.inc(56428);c[j] = x;
            __CLR4_4_117c117c1lb90pav5.R.inc(56429);j--;
            __CLR4_4_117c117c1lb90pav5.R.inc(56430);return ret;
        }finally{__CLR4_4_117c117c1lb90pav5.R.flushNeeded();}}

        /**
         * Not supported.
         */
        public void remove() {try{__CLR4_4_117c117c1lb90pav5.R.inc(56431);
            __CLR4_4_117c117c1lb90pav5.R.inc(56432);throw new UnsupportedOperationException();
        }finally{__CLR4_4_117c117c1lb90pav5.R.flushNeeded();}}
    }

    /**
     * Iterator with just one element to handle degenerate cases (full array,
     * empty array) for combination iterator.
     */
    private static class SingletonIterator implements Iterator<int[]> {
        /** Singleton array */
        private final int[] singleton;
        /** True on initialization, false after first call to next */
        private boolean more = true;
        /**
         * Create a singleton iterator providing the given array.
         * @param singleton array returned by the iterator
         */
        public SingletonIterator(final int[] singleton) {try{__CLR4_4_117c117c1lb90pav5.R.inc(56433);
            __CLR4_4_117c117c1lb90pav5.R.inc(56434);this.singleton = singleton;
        }finally{__CLR4_4_117c117c1lb90pav5.R.flushNeeded();}}
        /** @return True until next is called the first time, then false */
        public boolean hasNext() {try{__CLR4_4_117c117c1lb90pav5.R.inc(56435);
            __CLR4_4_117c117c1lb90pav5.R.inc(56436);return more;
        }finally{__CLR4_4_117c117c1lb90pav5.R.flushNeeded();}}
        /** @return the singleton in first activation; throws NSEE thereafter */
        public int[] next() {try{__CLR4_4_117c117c1lb90pav5.R.inc(56437);
            __CLR4_4_117c117c1lb90pav5.R.inc(56438);if ((((more)&&(__CLR4_4_117c117c1lb90pav5.R.iget(56439)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56440)==0&false))) {{
                __CLR4_4_117c117c1lb90pav5.R.inc(56441);more = false;
                __CLR4_4_117c117c1lb90pav5.R.inc(56442);return singleton;
            } }else {{
                __CLR4_4_117c117c1lb90pav5.R.inc(56443);throw new NoSuchElementException();
            }
        }}finally{__CLR4_4_117c117c1lb90pav5.R.flushNeeded();}}
        /** Not supported */
        public void remove() {try{__CLR4_4_117c117c1lb90pav5.R.inc(56444);
            __CLR4_4_117c117c1lb90pav5.R.inc(56445);throw new UnsupportedOperationException();
        }finally{__CLR4_4_117c117c1lb90pav5.R.flushNeeded();}}
    }

    /**
     * Check binomial preconditions.
     *
     * @param n Size of the set.
     * @param k Size of the subsets to be counted.
     * @throws NotPositiveException if {@code n < 0}.
     * @throws NumberIsTooLargeException if {@code k > n}.
     */
    private static void checkBinomial(final int n, final int k) throws NumberIsTooLargeException, NotPositiveException {try{__CLR4_4_117c117c1lb90pav5.R.inc(56446);
        __CLR4_4_117c117c1lb90pav5.R.inc(56447);if ((((n < k)&&(__CLR4_4_117c117c1lb90pav5.R.iget(56448)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56449)==0&false))) {{
            __CLR4_4_117c117c1lb90pav5.R.inc(56450);throw new NumberIsTooLargeException(LocalizedFormats.BINOMIAL_INVALID_PARAMETERS_ORDER,
                                                k, n, true);
        }
        }__CLR4_4_117c117c1lb90pav5.R.inc(56451);if ((((n < 0)&&(__CLR4_4_117c117c1lb90pav5.R.iget(56452)!=0|true))||(__CLR4_4_117c117c1lb90pav5.R.iget(56453)==0&false))) {{
            __CLR4_4_117c117c1lb90pav5.R.inc(56454);throw new NotPositiveException(LocalizedFormats.BINOMIAL_NEGATIVE_PARAMETER, n);
        }
    }}finally{__CLR4_4_117c117c1lb90pav5.R.flushNeeded();}}

}
