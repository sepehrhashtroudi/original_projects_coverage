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

import java.math.BigInteger;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.util.Localizable;
import org.apache.commons.math3.exception.util.LocalizedFormats;

/**
 * Some useful, arithmetics related, additions to the built-in functions in
 * {@link Math}.
 *
 * @version $Id$
 */
public final class ArithmeticUtils {public static class __CLR4_4_116zc16zclb90paul{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,56070,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Private constructor. */
    private ArithmeticUtils() {
        super();__CLR4_4_116zc16zclb90paul.R.inc(55705);try{__CLR4_4_116zc16zclb90paul.R.inc(55704);
    }finally{__CLR4_4_116zc16zclb90paul.R.flushNeeded();}}

    /**
     * Add two integers, checking for overflow.
     *
     * @param x an addend
     * @param y an addend
     * @return the sum {@code x+y}
     * @throws MathArithmeticException if the result can not be represented
     * as an {@code int}.
     * @since 1.1
     */
    public static int addAndCheck(int x, int y)
            throws MathArithmeticException {try{__CLR4_4_116zc16zclb90paul.R.inc(55706);
        __CLR4_4_116zc16zclb90paul.R.inc(55707);long s = (long)x + (long)y;
        __CLR4_4_116zc16zclb90paul.R.inc(55708);if ((((s < Integer.MIN_VALUE || s > Integer.MAX_VALUE)&&(__CLR4_4_116zc16zclb90paul.R.iget(55709)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55710)==0&false))) {{
            __CLR4_4_116zc16zclb90paul.R.inc(55711);throw new MathArithmeticException(LocalizedFormats.OVERFLOW_IN_ADDITION, x, y);
        }
        }__CLR4_4_116zc16zclb90paul.R.inc(55712);return (int)s;
    }finally{__CLR4_4_116zc16zclb90paul.R.flushNeeded();}}

    /**
     * Add two long integers, checking for overflow.
     *
     * @param a an addend
     * @param b an addend
     * @return the sum {@code a+b}
     * @throws MathArithmeticException if the result can not be represented as an
     *         long
     * @since 1.2
     */
    public static long addAndCheck(long a, long b) throws MathArithmeticException {try{__CLR4_4_116zc16zclb90paul.R.inc(55713);
        __CLR4_4_116zc16zclb90paul.R.inc(55714);return ArithmeticUtils.addAndCheck(a, b, LocalizedFormats.OVERFLOW_IN_ADDITION);
    }finally{__CLR4_4_116zc16zclb90paul.R.flushNeeded();}}

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
     * @deprecated use {@link CombinatoricsUtils#binomialCoefficient(int, int)}
     */
    public static long binomialCoefficient(final int n, final int k)
        throws NotPositiveException, NumberIsTooLargeException, MathArithmeticException {try{__CLR4_4_116zc16zclb90paul.R.inc(55715);
       __CLR4_4_116zc16zclb90paul.R.inc(55716);return CombinatoricsUtils.binomialCoefficient(n, k);
    }finally{__CLR4_4_116zc16zclb90paul.R.flushNeeded();}}

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
     * @deprecated use {@link CombinatoricsUtils#binomialCoefficientDouble(int, int)}
     */
    public static double binomialCoefficientDouble(final int n, final int k)
        throws NotPositiveException, NumberIsTooLargeException, MathArithmeticException {try{__CLR4_4_116zc16zclb90paul.R.inc(55717);
        __CLR4_4_116zc16zclb90paul.R.inc(55718);return CombinatoricsUtils.binomialCoefficientDouble(n, k);
    }finally{__CLR4_4_116zc16zclb90paul.R.flushNeeded();}}

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
     * @deprecated use {@link CombinatoricsUtils#binomialCoefficientLog(int, int)}
     */
    public static double binomialCoefficientLog(final int n, final int k)
        throws NotPositiveException, NumberIsTooLargeException, MathArithmeticException {try{__CLR4_4_116zc16zclb90paul.R.inc(55719);
        __CLR4_4_116zc16zclb90paul.R.inc(55720);return CombinatoricsUtils.binomialCoefficientLog(n, k);
    }finally{__CLR4_4_116zc16zclb90paul.R.flushNeeded();}}

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
     * @deprecated use {@link CombinatoricsUtils#factorial(int)}
     */
    public static long factorial(final int n) throws NotPositiveException, MathArithmeticException {try{__CLR4_4_116zc16zclb90paul.R.inc(55721);
        __CLR4_4_116zc16zclb90paul.R.inc(55722);return CombinatoricsUtils.factorial(n);
    }finally{__CLR4_4_116zc16zclb90paul.R.flushNeeded();}}

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
     * @deprecated use {@link CombinatoricsUtils#factorialDouble(int)}
     */
    public static double factorialDouble(final int n) throws NotPositiveException {try{__CLR4_4_116zc16zclb90paul.R.inc(55723);
         __CLR4_4_116zc16zclb90paul.R.inc(55724);return CombinatoricsUtils.factorialDouble(n);
    }finally{__CLR4_4_116zc16zclb90paul.R.flushNeeded();}}

    /**
     * Compute the natural logarithm of the factorial of {@code n}.
     *
     * @param n Argument.
     * @return {@code n!}
     * @throws NotPositiveException if {@code n < 0}.
     * @deprecated use {@link CombinatoricsUtils#factorialLog(int)}
     */
    public static double factorialLog(final int n) throws NotPositiveException {try{__CLR4_4_116zc16zclb90paul.R.inc(55725);
        __CLR4_4_116zc16zclb90paul.R.inc(55726);return CombinatoricsUtils.factorialLog(n);
    }finally{__CLR4_4_116zc16zclb90paul.R.flushNeeded();}}

    /**
     * Computes the greatest common divisor of the absolute value of two
     * numbers, using a modified version of the "binary gcd" method.
     * See Knuth 4.5.2 algorithm B.
     * The algorithm is due to Josef Stein (1961).
     * <br/>
     * Special cases:
     * <ul>
     *  <li>The invocations
     *   {@code gcd(Integer.MIN_VALUE, Integer.MIN_VALUE)},
     *   {@code gcd(Integer.MIN_VALUE, 0)} and
     *   {@code gcd(0, Integer.MIN_VALUE)} throw an
     *   {@code ArithmeticException}, because the result would be 2^31, which
     *   is too large for an int value.</li>
     *  <li>The result of {@code gcd(x, x)}, {@code gcd(0, x)} and
     *   {@code gcd(x, 0)} is the absolute value of {@code x}, except
     *   for the special cases above.</li>
     *  <li>The invocation {@code gcd(0, 0)} is the only one which returns
     *   {@code 0}.</li>
     * </ul>
     *
     * @param p Number.
     * @param q Number.
     * @return the greatest common divisor (never negative).
     * @throws MathArithmeticException if the result cannot be represented as
     * a non-negative {@code int} value.
     * @since 1.1
     */
    public static int gcd(int p,
                          int q)
        throws MathArithmeticException {try{__CLR4_4_116zc16zclb90paul.R.inc(55727);
        __CLR4_4_116zc16zclb90paul.R.inc(55728);int a = p;
        __CLR4_4_116zc16zclb90paul.R.inc(55729);int b = q;
        __CLR4_4_116zc16zclb90paul.R.inc(55730);if ((((a == 0 ||
            b == 0)&&(__CLR4_4_116zc16zclb90paul.R.iget(55731)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55732)==0&false))) {{
            __CLR4_4_116zc16zclb90paul.R.inc(55733);if ((((a == Integer.MIN_VALUE ||
                b == Integer.MIN_VALUE)&&(__CLR4_4_116zc16zclb90paul.R.iget(55734)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55735)==0&false))) {{
                __CLR4_4_116zc16zclb90paul.R.inc(55736);throw new MathArithmeticException(LocalizedFormats.GCD_OVERFLOW_32_BITS,
                                                  p, q);
            }
            }__CLR4_4_116zc16zclb90paul.R.inc(55737);return FastMath.abs(a + b);
        }

        }__CLR4_4_116zc16zclb90paul.R.inc(55738);long al = a;
        __CLR4_4_116zc16zclb90paul.R.inc(55739);long bl = b;
        __CLR4_4_116zc16zclb90paul.R.inc(55740);boolean useLong = false;
        __CLR4_4_116zc16zclb90paul.R.inc(55741);if ((((a < 0)&&(__CLR4_4_116zc16zclb90paul.R.iget(55742)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55743)==0&false))) {{
            __CLR4_4_116zc16zclb90paul.R.inc(55744);if((((Integer.MIN_VALUE == a)&&(__CLR4_4_116zc16zclb90paul.R.iget(55745)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55746)==0&false))) {{
                __CLR4_4_116zc16zclb90paul.R.inc(55747);useLong = true;
            } }else {{
                __CLR4_4_116zc16zclb90paul.R.inc(55748);a = -a;
            }
            }__CLR4_4_116zc16zclb90paul.R.inc(55749);al = -al;
        }
        }__CLR4_4_116zc16zclb90paul.R.inc(55750);if ((((b < 0)&&(__CLR4_4_116zc16zclb90paul.R.iget(55751)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55752)==0&false))) {{
            __CLR4_4_116zc16zclb90paul.R.inc(55753);if ((((Integer.MIN_VALUE == b)&&(__CLR4_4_116zc16zclb90paul.R.iget(55754)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55755)==0&false))) {{
                __CLR4_4_116zc16zclb90paul.R.inc(55756);useLong = true;
            } }else {{
                __CLR4_4_116zc16zclb90paul.R.inc(55757);b = -b;
            }
            }__CLR4_4_116zc16zclb90paul.R.inc(55758);bl = -bl;
        }
        }__CLR4_4_116zc16zclb90paul.R.inc(55759);if ((((useLong)&&(__CLR4_4_116zc16zclb90paul.R.iget(55760)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55761)==0&false))) {{
            __CLR4_4_116zc16zclb90paul.R.inc(55762);if((((al == bl)&&(__CLR4_4_116zc16zclb90paul.R.iget(55763)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55764)==0&false))) {{
                __CLR4_4_116zc16zclb90paul.R.inc(55765);throw new MathArithmeticException(LocalizedFormats.GCD_OVERFLOW_32_BITS,
                                                  p, q);
            }
            }__CLR4_4_116zc16zclb90paul.R.inc(55766);long blbu = bl;
            __CLR4_4_116zc16zclb90paul.R.inc(55767);bl = al;
            __CLR4_4_116zc16zclb90paul.R.inc(55768);al = blbu % al;
            __CLR4_4_116zc16zclb90paul.R.inc(55769);if ((((al == 0)&&(__CLR4_4_116zc16zclb90paul.R.iget(55770)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55771)==0&false))) {{
                __CLR4_4_116zc16zclb90paul.R.inc(55772);if ((((bl > Integer.MAX_VALUE)&&(__CLR4_4_116zc16zclb90paul.R.iget(55773)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55774)==0&false))) {{
                    __CLR4_4_116zc16zclb90paul.R.inc(55775);throw new MathArithmeticException(LocalizedFormats.GCD_OVERFLOW_32_BITS,
                                                      p, q);
                }
                }__CLR4_4_116zc16zclb90paul.R.inc(55776);return (int) bl;
            }
            }__CLR4_4_116zc16zclb90paul.R.inc(55777);blbu = bl;

            // Now "al" and "bl" fit in an "int".
            __CLR4_4_116zc16zclb90paul.R.inc(55778);b = (int) al;
            __CLR4_4_116zc16zclb90paul.R.inc(55779);a = (int) (blbu % al);
        }

        }__CLR4_4_116zc16zclb90paul.R.inc(55780);return gcdPositive(a, b);
    }finally{__CLR4_4_116zc16zclb90paul.R.flushNeeded();}}

    /**
     * Computes the greatest common divisor of two <em>positive</em> numbers
     * (this precondition is <em>not</em> checked and the result is undefined
     * if not fulfilled) using the "binary gcd" method which avoids division
     * and modulo operations.
     * See Knuth 4.5.2 algorithm B.
     * The algorithm is due to Josef Stein (1961).
     * <br/>
     * Special cases:
     * <ul>
     *  <li>The result of {@code gcd(x, x)}, {@code gcd(0, x)} and
     *   {@code gcd(x, 0)} is the value of {@code x}.</li>
     *  <li>The invocation {@code gcd(0, 0)} is the only one which returns
     *   {@code 0}.</li>
     * </ul>
     *
     * @param a Positive number.
     * @param b Positive number.
     * @return the greatest common divisor.
     */
    private static int gcdPositive(int a,
                                   int b) {try{__CLR4_4_116zc16zclb90paul.R.inc(55781);
        __CLR4_4_116zc16zclb90paul.R.inc(55782);if ((((a == 0)&&(__CLR4_4_116zc16zclb90paul.R.iget(55783)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55784)==0&false))) {{
            __CLR4_4_116zc16zclb90paul.R.inc(55785);return b;
        }
        }else {__CLR4_4_116zc16zclb90paul.R.inc(55786);if ((((b == 0)&&(__CLR4_4_116zc16zclb90paul.R.iget(55787)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55788)==0&false))) {{
            __CLR4_4_116zc16zclb90paul.R.inc(55789);return a;
        }

        // Make "a" and "b" odd, keeping track of common power of 2.
        }}__CLR4_4_116zc16zclb90paul.R.inc(55790);final int aTwos = Integer.numberOfTrailingZeros(a);
        __CLR4_4_116zc16zclb90paul.R.inc(55791);a >>= aTwos;
        __CLR4_4_116zc16zclb90paul.R.inc(55792);final int bTwos = Integer.numberOfTrailingZeros(b);
        __CLR4_4_116zc16zclb90paul.R.inc(55793);b >>= bTwos;
        __CLR4_4_116zc16zclb90paul.R.inc(55794);final int shift = Math.min(aTwos, bTwos);

        // "a" and "b" are positive.
        // If a > b then "gdc(a, b)" is equal to "gcd(a - b, b)".
        // If a < b then "gcd(a, b)" is equal to "gcd(b - a, a)".
        // Hence, in the successive iterations:
        //  "a" becomes the absolute difference of the current values,
        //  "b" becomes the minimum of the current values.
        __CLR4_4_116zc16zclb90paul.R.inc(55795);while ((((a != b)&&(__CLR4_4_116zc16zclb90paul.R.iget(55796)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55797)==0&false))) {{
            __CLR4_4_116zc16zclb90paul.R.inc(55798);final int delta = a - b;
            __CLR4_4_116zc16zclb90paul.R.inc(55799);b = Math.min(a, b);
            __CLR4_4_116zc16zclb90paul.R.inc(55800);a = Math.abs(delta);

            // Remove any power of 2 in "a" ("b" is guaranteed to be odd).
            __CLR4_4_116zc16zclb90paul.R.inc(55801);a >>= Integer.numberOfTrailingZeros(a);
        }

        // Recover the common power of 2.
        }__CLR4_4_116zc16zclb90paul.R.inc(55802);return a << shift;
    }finally{__CLR4_4_116zc16zclb90paul.R.flushNeeded();}}

    /**
     * <p>
     * Gets the greatest common divisor of the absolute value of two numbers,
     * using the "binary gcd" method which avoids division and modulo
     * operations. See Knuth 4.5.2 algorithm B. This algorithm is due to Josef
     * Stein (1961).
     * </p>
     * Special cases:
     * <ul>
     * <li>The invocations
     * {@code gcd(Long.MIN_VALUE, Long.MIN_VALUE)},
     * {@code gcd(Long.MIN_VALUE, 0L)} and
     * {@code gcd(0L, Long.MIN_VALUE)} throw an
     * {@code ArithmeticException}, because the result would be 2^63, which
     * is too large for a long value.</li>
     * <li>The result of {@code gcd(x, x)}, {@code gcd(0L, x)} and
     * {@code gcd(x, 0L)} is the absolute value of {@code x}, except
     * for the special cases above.
     * <li>The invocation {@code gcd(0L, 0L)} is the only one which returns
     * {@code 0L}.</li>
     * </ul>
     *
     * @param p Number.
     * @param q Number.
     * @return the greatest common divisor, never negative.
     * @throws MathArithmeticException if the result cannot be represented as
     * a non-negative {@code long} value.
     * @since 2.1
     */
    public static long gcd(final long p, final long q) throws MathArithmeticException {try{__CLR4_4_116zc16zclb90paul.R.inc(55803);
        __CLR4_4_116zc16zclb90paul.R.inc(55804);long u = p;
        __CLR4_4_116zc16zclb90paul.R.inc(55805);long v = q;
        __CLR4_4_116zc16zclb90paul.R.inc(55806);if (((((u == 0) || (v == 0))&&(__CLR4_4_116zc16zclb90paul.R.iget(55807)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55808)==0&false))) {{
            __CLR4_4_116zc16zclb90paul.R.inc(55809);if (((((u == Long.MIN_VALUE) || (v == Long.MIN_VALUE))&&(__CLR4_4_116zc16zclb90paul.R.iget(55810)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55811)==0&false))){{
                __CLR4_4_116zc16zclb90paul.R.inc(55812);throw new MathArithmeticException(LocalizedFormats.GCD_OVERFLOW_64_BITS,
                                                  p, q);
            }
            }__CLR4_4_116zc16zclb90paul.R.inc(55813);return FastMath.abs(u) + FastMath.abs(v);
        }
        // keep u and v negative, as negative integers range down to
        // -2^63, while positive numbers can only be as large as 2^63-1
        // (i.e. we can't necessarily negate a negative number without
        // overflow)
        /* assert u!=0 && v!=0; */
        }__CLR4_4_116zc16zclb90paul.R.inc(55814);if ((((u > 0)&&(__CLR4_4_116zc16zclb90paul.R.iget(55815)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55816)==0&false))) {{
            __CLR4_4_116zc16zclb90paul.R.inc(55817);u = -u;
        } // make u negative
        }__CLR4_4_116zc16zclb90paul.R.inc(55818);if ((((v > 0)&&(__CLR4_4_116zc16zclb90paul.R.iget(55819)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55820)==0&false))) {{
            __CLR4_4_116zc16zclb90paul.R.inc(55821);v = -v;
        } // make v negative
        // B1. [Find power of 2]
        }__CLR4_4_116zc16zclb90paul.R.inc(55822);int k = 0;
        __CLR4_4_116zc16zclb90paul.R.inc(55823);while (((((u & 1) == 0 && (v & 1) == 0 && k < 63)&&(__CLR4_4_116zc16zclb90paul.R.iget(55824)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55825)==0&false))) {{ // while u and v are
                                                            // both even...
            __CLR4_4_116zc16zclb90paul.R.inc(55826);u /= 2;
            __CLR4_4_116zc16zclb90paul.R.inc(55827);v /= 2;
            __CLR4_4_116zc16zclb90paul.R.inc(55828);k++; // cast out twos.
        }
        }__CLR4_4_116zc16zclb90paul.R.inc(55829);if ((((k == 63)&&(__CLR4_4_116zc16zclb90paul.R.iget(55830)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55831)==0&false))) {{
            __CLR4_4_116zc16zclb90paul.R.inc(55832);throw new MathArithmeticException(LocalizedFormats.GCD_OVERFLOW_64_BITS,
                                              p, q);
        }
        // B2. Initialize: u and v have been divided by 2^k and at least
        // one is odd.
        }__CLR4_4_116zc16zclb90paul.R.inc(55833);long t = (((((u & 1) == 1) )&&(__CLR4_4_116zc16zclb90paul.R.iget(55834)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55835)==0&false))? v : -(u / 2)/* B3 */;
        // t negative: u was odd, v may be even (t replaces v)
        // t positive: u was even, v is odd (t replaces u)
        __CLR4_4_116zc16zclb90paul.R.inc(55836);do {{
            /* assert u<0 && v<0; */
            // B4/B3: cast out twos from t.
            __CLR4_4_116zc16zclb90paul.R.inc(55837);while (((((t & 1) == 0)&&(__CLR4_4_116zc16zclb90paul.R.iget(55838)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55839)==0&false))) {{ // while t is even..
                __CLR4_4_116zc16zclb90paul.R.inc(55840);t /= 2; // cast out twos
            }
            // B5 [reset max(u,v)]
            }__CLR4_4_116zc16zclb90paul.R.inc(55841);if ((((t > 0)&&(__CLR4_4_116zc16zclb90paul.R.iget(55842)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55843)==0&false))) {{
                __CLR4_4_116zc16zclb90paul.R.inc(55844);u = -t;
            } }else {{
                __CLR4_4_116zc16zclb90paul.R.inc(55845);v = t;
            }
            // B6/B3. at this point both u and v should be odd.
            }__CLR4_4_116zc16zclb90paul.R.inc(55846);t = (v - u) / 2;
            // |u| larger: t positive (replace u)
            // |v| larger: t negative (replace v)
        } }while ((((t != 0)&&(__CLR4_4_116zc16zclb90paul.R.iget(55847)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55848)==0&false)));
        __CLR4_4_116zc16zclb90paul.R.inc(55849);return -u * (1L << k); // gcd is u*2^k
    }finally{__CLR4_4_116zc16zclb90paul.R.flushNeeded();}}

    /**
     * <p>
     * Returns the least common multiple of the absolute value of two numbers,
     * using the formula {@code lcm(a,b) = (a / gcd(a,b)) * b}.
     * </p>
     * Special cases:
     * <ul>
     * <li>The invocations {@code lcm(Integer.MIN_VALUE, n)} and
     * {@code lcm(n, Integer.MIN_VALUE)}, where {@code abs(n)} is a
     * power of 2, throw an {@code ArithmeticException}, because the result
     * would be 2^31, which is too large for an int value.</li>
     * <li>The result of {@code lcm(0, x)} and {@code lcm(x, 0)} is
     * {@code 0} for any {@code x}.
     * </ul>
     *
     * @param a Number.
     * @param b Number.
     * @return the least common multiple, never negative.
     * @throws MathArithmeticException if the result cannot be represented as
     * a non-negative {@code int} value.
     * @since 1.1
     */
    public static int lcm(int a, int b) throws MathArithmeticException {try{__CLR4_4_116zc16zclb90paul.R.inc(55850);
        __CLR4_4_116zc16zclb90paul.R.inc(55851);if ((((a == 0 || b == 0)&&(__CLR4_4_116zc16zclb90paul.R.iget(55852)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55853)==0&false))){{
            __CLR4_4_116zc16zclb90paul.R.inc(55854);return 0;
        }
        }__CLR4_4_116zc16zclb90paul.R.inc(55855);int lcm = FastMath.abs(ArithmeticUtils.mulAndCheck(a / gcd(a, b), b));
        __CLR4_4_116zc16zclb90paul.R.inc(55856);if ((((lcm == Integer.MIN_VALUE)&&(__CLR4_4_116zc16zclb90paul.R.iget(55857)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55858)==0&false))) {{
            __CLR4_4_116zc16zclb90paul.R.inc(55859);throw new MathArithmeticException(LocalizedFormats.LCM_OVERFLOW_32_BITS,
                                              a, b);
        }
        }__CLR4_4_116zc16zclb90paul.R.inc(55860);return lcm;
    }finally{__CLR4_4_116zc16zclb90paul.R.flushNeeded();}}

    /**
     * <p>
     * Returns the least common multiple of the absolute value of two numbers,
     * using the formula {@code lcm(a,b) = (a / gcd(a,b)) * b}.
     * </p>
     * Special cases:
     * <ul>
     * <li>The invocations {@code lcm(Long.MIN_VALUE, n)} and
     * {@code lcm(n, Long.MIN_VALUE)}, where {@code abs(n)} is a
     * power of 2, throw an {@code ArithmeticException}, because the result
     * would be 2^63, which is too large for an int value.</li>
     * <li>The result of {@code lcm(0L, x)} and {@code lcm(x, 0L)} is
     * {@code 0L} for any {@code x}.
     * </ul>
     *
     * @param a Number.
     * @param b Number.
     * @return the least common multiple, never negative.
     * @throws MathArithmeticException if the result cannot be represented
     * as a non-negative {@code long} value.
     * @since 2.1
     */
    public static long lcm(long a, long b) throws MathArithmeticException {try{__CLR4_4_116zc16zclb90paul.R.inc(55861);
        __CLR4_4_116zc16zclb90paul.R.inc(55862);if ((((a == 0 || b == 0)&&(__CLR4_4_116zc16zclb90paul.R.iget(55863)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55864)==0&false))){{
            __CLR4_4_116zc16zclb90paul.R.inc(55865);return 0;
        }
        }__CLR4_4_116zc16zclb90paul.R.inc(55866);long lcm = FastMath.abs(ArithmeticUtils.mulAndCheck(a / gcd(a, b), b));
        __CLR4_4_116zc16zclb90paul.R.inc(55867);if ((((lcm == Long.MIN_VALUE)&&(__CLR4_4_116zc16zclb90paul.R.iget(55868)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55869)==0&false))){{
            __CLR4_4_116zc16zclb90paul.R.inc(55870);throw new MathArithmeticException(LocalizedFormats.LCM_OVERFLOW_64_BITS,
                                              a, b);
        }
        }__CLR4_4_116zc16zclb90paul.R.inc(55871);return lcm;
    }finally{__CLR4_4_116zc16zclb90paul.R.flushNeeded();}}

    /**
     * Multiply two integers, checking for overflow.
     *
     * @param x Factor.
     * @param y Factor.
     * @return the product {@code x * y}.
     * @throws MathArithmeticException if the result can not be
     * represented as an {@code int}.
     * @since 1.1
     */
    public static int mulAndCheck(int x, int y) throws MathArithmeticException {try{__CLR4_4_116zc16zclb90paul.R.inc(55872);
        __CLR4_4_116zc16zclb90paul.R.inc(55873);long m = ((long)x) * ((long)y);
        __CLR4_4_116zc16zclb90paul.R.inc(55874);if ((((m < Integer.MIN_VALUE || m > Integer.MAX_VALUE)&&(__CLR4_4_116zc16zclb90paul.R.iget(55875)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55876)==0&false))) {{
            __CLR4_4_116zc16zclb90paul.R.inc(55877);throw new MathArithmeticException();
        }
        }__CLR4_4_116zc16zclb90paul.R.inc(55878);return (int)m;
    }finally{__CLR4_4_116zc16zclb90paul.R.flushNeeded();}}

    /**
     * Multiply two long integers, checking for overflow.
     *
     * @param a Factor.
     * @param b Factor.
     * @return the product {@code a * b}.
     * @throws MathArithmeticException if the result can not be represented
     * as a {@code long}.
     * @since 1.2
     */
    public static long mulAndCheck(long a, long b) throws MathArithmeticException {try{__CLR4_4_116zc16zclb90paul.R.inc(55879);
        __CLR4_4_116zc16zclb90paul.R.inc(55880);long ret;
        __CLR4_4_116zc16zclb90paul.R.inc(55881);if ((((a > b)&&(__CLR4_4_116zc16zclb90paul.R.iget(55882)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55883)==0&false))) {{
            // use symmetry to reduce boundary cases
            __CLR4_4_116zc16zclb90paul.R.inc(55884);ret = mulAndCheck(b, a);
        } }else {{
            __CLR4_4_116zc16zclb90paul.R.inc(55885);if ((((a < 0)&&(__CLR4_4_116zc16zclb90paul.R.iget(55886)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55887)==0&false))) {{
                __CLR4_4_116zc16zclb90paul.R.inc(55888);if ((((b < 0)&&(__CLR4_4_116zc16zclb90paul.R.iget(55889)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55890)==0&false))) {{
                    // check for positive overflow with negative a, negative b
                    __CLR4_4_116zc16zclb90paul.R.inc(55891);if ((((a >= Long.MAX_VALUE / b)&&(__CLR4_4_116zc16zclb90paul.R.iget(55892)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55893)==0&false))) {{
                        __CLR4_4_116zc16zclb90paul.R.inc(55894);ret = a * b;
                    } }else {{
                        __CLR4_4_116zc16zclb90paul.R.inc(55895);throw new MathArithmeticException();
                    }
                }} }else {__CLR4_4_116zc16zclb90paul.R.inc(55896);if ((((b > 0)&&(__CLR4_4_116zc16zclb90paul.R.iget(55897)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55898)==0&false))) {{
                    // check for negative overflow with negative a, positive b
                    __CLR4_4_116zc16zclb90paul.R.inc(55899);if ((((Long.MIN_VALUE / b <= a)&&(__CLR4_4_116zc16zclb90paul.R.iget(55900)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55901)==0&false))) {{
                        __CLR4_4_116zc16zclb90paul.R.inc(55902);ret = a * b;
                    } }else {{
                        __CLR4_4_116zc16zclb90paul.R.inc(55903);throw new MathArithmeticException();

                    }
                }} }else {{
                    // assert b == 0
                    __CLR4_4_116zc16zclb90paul.R.inc(55904);ret = 0;
                }
            }}} }else {__CLR4_4_116zc16zclb90paul.R.inc(55905);if ((((a > 0)&&(__CLR4_4_116zc16zclb90paul.R.iget(55906)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55907)==0&false))) {{
                // assert a > 0
                // assert b > 0

                // check for positive overflow with positive a, positive b
                __CLR4_4_116zc16zclb90paul.R.inc(55908);if ((((a <= Long.MAX_VALUE / b)&&(__CLR4_4_116zc16zclb90paul.R.iget(55909)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55910)==0&false))) {{
                    __CLR4_4_116zc16zclb90paul.R.inc(55911);ret = a * b;
                } }else {{
                    __CLR4_4_116zc16zclb90paul.R.inc(55912);throw new MathArithmeticException();
                }
            }} }else {{
                // assert a == 0
                __CLR4_4_116zc16zclb90paul.R.inc(55913);ret = 0;
            }
        }}}
        }__CLR4_4_116zc16zclb90paul.R.inc(55914);return ret;
    }finally{__CLR4_4_116zc16zclb90paul.R.flushNeeded();}}

    /**
     * Subtract two integers, checking for overflow.
     *
     * @param x Minuend.
     * @param y Subtrahend.
     * @return the difference {@code x - y}.
     * @throws MathArithmeticException if the result can not be represented
     * as an {@code int}.
     * @since 1.1
     */
    public static int subAndCheck(int x, int y) throws MathArithmeticException {try{__CLR4_4_116zc16zclb90paul.R.inc(55915);
        __CLR4_4_116zc16zclb90paul.R.inc(55916);long s = (long)x - (long)y;
        __CLR4_4_116zc16zclb90paul.R.inc(55917);if ((((s < Integer.MIN_VALUE || s > Integer.MAX_VALUE)&&(__CLR4_4_116zc16zclb90paul.R.iget(55918)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55919)==0&false))) {{
            __CLR4_4_116zc16zclb90paul.R.inc(55920);throw new MathArithmeticException(LocalizedFormats.OVERFLOW_IN_SUBTRACTION, x, y);
        }
        }__CLR4_4_116zc16zclb90paul.R.inc(55921);return (int)s;
    }finally{__CLR4_4_116zc16zclb90paul.R.flushNeeded();}}

    /**
     * Subtract two long integers, checking for overflow.
     *
     * @param a Value.
     * @param b Value.
     * @return the difference {@code a - b}.
     * @throws MathArithmeticException if the result can not be represented as a
     * {@code long}.
     * @since 1.2
     */
    public static long subAndCheck(long a, long b) throws MathArithmeticException {try{__CLR4_4_116zc16zclb90paul.R.inc(55922);
        __CLR4_4_116zc16zclb90paul.R.inc(55923);long ret;
        __CLR4_4_116zc16zclb90paul.R.inc(55924);if ((((b == Long.MIN_VALUE)&&(__CLR4_4_116zc16zclb90paul.R.iget(55925)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55926)==0&false))) {{
            __CLR4_4_116zc16zclb90paul.R.inc(55927);if ((((a < 0)&&(__CLR4_4_116zc16zclb90paul.R.iget(55928)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55929)==0&false))) {{
                __CLR4_4_116zc16zclb90paul.R.inc(55930);ret = a - b;
            } }else {{
                __CLR4_4_116zc16zclb90paul.R.inc(55931);throw new MathArithmeticException(LocalizedFormats.OVERFLOW_IN_ADDITION, a, -b);
            }
        }} }else {{
            // use additive inverse
            __CLR4_4_116zc16zclb90paul.R.inc(55932);ret = addAndCheck(a, -b, LocalizedFormats.OVERFLOW_IN_ADDITION);
        }
        }__CLR4_4_116zc16zclb90paul.R.inc(55933);return ret;
    }finally{__CLR4_4_116zc16zclb90paul.R.flushNeeded();}}

    /**
     * Raise an int to an int power.
     *
     * @param k Number to raise.
     * @param e Exponent (must be positive or zero).
     * @return k<sup>e</sup>
     * @throws NotPositiveException if {@code e < 0}.
     */
    public static int pow(final int k, int e) throws NotPositiveException {try{__CLR4_4_116zc16zclb90paul.R.inc(55934);
        __CLR4_4_116zc16zclb90paul.R.inc(55935);if ((((e < 0)&&(__CLR4_4_116zc16zclb90paul.R.iget(55936)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55937)==0&false))) {{
            __CLR4_4_116zc16zclb90paul.R.inc(55938);throw new NotPositiveException(LocalizedFormats.EXPONENT, e);
        }

        }__CLR4_4_116zc16zclb90paul.R.inc(55939);int result = 1;
        __CLR4_4_116zc16zclb90paul.R.inc(55940);int k2p    = k;
        __CLR4_4_116zc16zclb90paul.R.inc(55941);while ((((e != 0)&&(__CLR4_4_116zc16zclb90paul.R.iget(55942)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55943)==0&false))) {{
            __CLR4_4_116zc16zclb90paul.R.inc(55944);if (((((e & 0x1) != 0)&&(__CLR4_4_116zc16zclb90paul.R.iget(55945)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55946)==0&false))) {{
                __CLR4_4_116zc16zclb90paul.R.inc(55947);result *= k2p;
            }
            }__CLR4_4_116zc16zclb90paul.R.inc(55948);k2p *= k2p;
            __CLR4_4_116zc16zclb90paul.R.inc(55949);e = e >> 1;
        }

        }__CLR4_4_116zc16zclb90paul.R.inc(55950);return result;
    }finally{__CLR4_4_116zc16zclb90paul.R.flushNeeded();}}

    /**
     * Raise an int to a long power.
     *
     * @param k Number to raise.
     * @param e Exponent (must be positive or zero).
     * @return k<sup>e</sup>
     * @throws NotPositiveException if {@code e < 0}.
     */
    public static int pow(final int k, long e) throws NotPositiveException {try{__CLR4_4_116zc16zclb90paul.R.inc(55951);
        __CLR4_4_116zc16zclb90paul.R.inc(55952);if ((((e < 0)&&(__CLR4_4_116zc16zclb90paul.R.iget(55953)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55954)==0&false))) {{
            __CLR4_4_116zc16zclb90paul.R.inc(55955);throw new NotPositiveException(LocalizedFormats.EXPONENT, e);
        }

        }__CLR4_4_116zc16zclb90paul.R.inc(55956);int result = 1;
        __CLR4_4_116zc16zclb90paul.R.inc(55957);int k2p    = k;
        __CLR4_4_116zc16zclb90paul.R.inc(55958);while ((((e != 0)&&(__CLR4_4_116zc16zclb90paul.R.iget(55959)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55960)==0&false))) {{
            __CLR4_4_116zc16zclb90paul.R.inc(55961);if (((((e & 0x1) != 0)&&(__CLR4_4_116zc16zclb90paul.R.iget(55962)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55963)==0&false))) {{
                __CLR4_4_116zc16zclb90paul.R.inc(55964);result *= k2p;
            }
            }__CLR4_4_116zc16zclb90paul.R.inc(55965);k2p *= k2p;
            __CLR4_4_116zc16zclb90paul.R.inc(55966);e = e >> 1;
        }

        }__CLR4_4_116zc16zclb90paul.R.inc(55967);return result;
    }finally{__CLR4_4_116zc16zclb90paul.R.flushNeeded();}}

    /**
     * Raise a long to an int power.
     *
     * @param k Number to raise.
     * @param e Exponent (must be positive or zero).
     * @return k<sup>e</sup>
     * @throws NotPositiveException if {@code e < 0}.
     */
    public static long pow(final long k, int e) throws NotPositiveException {try{__CLR4_4_116zc16zclb90paul.R.inc(55968);
        __CLR4_4_116zc16zclb90paul.R.inc(55969);if ((((e < 0)&&(__CLR4_4_116zc16zclb90paul.R.iget(55970)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55971)==0&false))) {{
            __CLR4_4_116zc16zclb90paul.R.inc(55972);throw new NotPositiveException(LocalizedFormats.EXPONENT, e);
        }

        }__CLR4_4_116zc16zclb90paul.R.inc(55973);long result = 1l;
        __CLR4_4_116zc16zclb90paul.R.inc(55974);long k2p    = k;
        __CLR4_4_116zc16zclb90paul.R.inc(55975);while ((((e != 0)&&(__CLR4_4_116zc16zclb90paul.R.iget(55976)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55977)==0&false))) {{
            __CLR4_4_116zc16zclb90paul.R.inc(55978);if (((((e & 0x1) != 0)&&(__CLR4_4_116zc16zclb90paul.R.iget(55979)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55980)==0&false))) {{
                __CLR4_4_116zc16zclb90paul.R.inc(55981);result *= k2p;
            }
            }__CLR4_4_116zc16zclb90paul.R.inc(55982);k2p *= k2p;
            __CLR4_4_116zc16zclb90paul.R.inc(55983);e = e >> 1;
        }

        }__CLR4_4_116zc16zclb90paul.R.inc(55984);return result;
    }finally{__CLR4_4_116zc16zclb90paul.R.flushNeeded();}}

    /**
     * Raise a long to a long power.
     *
     * @param k Number to raise.
     * @param e Exponent (must be positive or zero).
     * @return k<sup>e</sup>
     * @throws NotPositiveException if {@code e < 0}.
     */
    public static long pow(final long k, long e) throws NotPositiveException {try{__CLR4_4_116zc16zclb90paul.R.inc(55985);
        __CLR4_4_116zc16zclb90paul.R.inc(55986);if ((((e < 0)&&(__CLR4_4_116zc16zclb90paul.R.iget(55987)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55988)==0&false))) {{
            __CLR4_4_116zc16zclb90paul.R.inc(55989);throw new NotPositiveException(LocalizedFormats.EXPONENT, e);
        }

        }__CLR4_4_116zc16zclb90paul.R.inc(55990);long result = 1l;
        __CLR4_4_116zc16zclb90paul.R.inc(55991);long k2p    = k;
        __CLR4_4_116zc16zclb90paul.R.inc(55992);while ((((e != 0)&&(__CLR4_4_116zc16zclb90paul.R.iget(55993)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55994)==0&false))) {{
            __CLR4_4_116zc16zclb90paul.R.inc(55995);if (((((e & 0x1) != 0)&&(__CLR4_4_116zc16zclb90paul.R.iget(55996)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(55997)==0&false))) {{
                __CLR4_4_116zc16zclb90paul.R.inc(55998);result *= k2p;
            }
            }__CLR4_4_116zc16zclb90paul.R.inc(55999);k2p *= k2p;
            __CLR4_4_116zc16zclb90paul.R.inc(56000);e = e >> 1;
        }

        }__CLR4_4_116zc16zclb90paul.R.inc(56001);return result;
    }finally{__CLR4_4_116zc16zclb90paul.R.flushNeeded();}}

    /**
     * Raise a BigInteger to an int power.
     *
     * @param k Number to raise.
     * @param e Exponent (must be positive or zero).
     * @return k<sup>e</sup>
     * @throws NotPositiveException if {@code e < 0}.
     */
    public static BigInteger pow(final BigInteger k, int e) throws NotPositiveException {try{__CLR4_4_116zc16zclb90paul.R.inc(56002);
        __CLR4_4_116zc16zclb90paul.R.inc(56003);if ((((e < 0)&&(__CLR4_4_116zc16zclb90paul.R.iget(56004)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(56005)==0&false))) {{
            __CLR4_4_116zc16zclb90paul.R.inc(56006);throw new NotPositiveException(LocalizedFormats.EXPONENT, e);
        }

        }__CLR4_4_116zc16zclb90paul.R.inc(56007);return k.pow(e);
    }finally{__CLR4_4_116zc16zclb90paul.R.flushNeeded();}}

    /**
     * Raise a BigInteger to a long power.
     *
     * @param k Number to raise.
     * @param e Exponent (must be positive or zero).
     * @return k<sup>e</sup>
     * @throws NotPositiveException if {@code e < 0}.
     */
    public static BigInteger pow(final BigInteger k, long e) throws NotPositiveException {try{__CLR4_4_116zc16zclb90paul.R.inc(56008);
        __CLR4_4_116zc16zclb90paul.R.inc(56009);if ((((e < 0)&&(__CLR4_4_116zc16zclb90paul.R.iget(56010)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(56011)==0&false))) {{
            __CLR4_4_116zc16zclb90paul.R.inc(56012);throw new NotPositiveException(LocalizedFormats.EXPONENT, e);
        }

        }__CLR4_4_116zc16zclb90paul.R.inc(56013);BigInteger result = BigInteger.ONE;
        __CLR4_4_116zc16zclb90paul.R.inc(56014);BigInteger k2p    = k;
        __CLR4_4_116zc16zclb90paul.R.inc(56015);while ((((e != 0)&&(__CLR4_4_116zc16zclb90paul.R.iget(56016)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(56017)==0&false))) {{
            __CLR4_4_116zc16zclb90paul.R.inc(56018);if (((((e & 0x1) != 0)&&(__CLR4_4_116zc16zclb90paul.R.iget(56019)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(56020)==0&false))) {{
                __CLR4_4_116zc16zclb90paul.R.inc(56021);result = result.multiply(k2p);
            }
            }__CLR4_4_116zc16zclb90paul.R.inc(56022);k2p = k2p.multiply(k2p);
            __CLR4_4_116zc16zclb90paul.R.inc(56023);e = e >> 1;
        }

        }__CLR4_4_116zc16zclb90paul.R.inc(56024);return result;

    }finally{__CLR4_4_116zc16zclb90paul.R.flushNeeded();}}

    /**
     * Raise a BigInteger to a BigInteger power.
     *
     * @param k Number to raise.
     * @param e Exponent (must be positive or zero).
     * @return k<sup>e</sup>
     * @throws NotPositiveException if {@code e < 0}.
     */
    public static BigInteger pow(final BigInteger k, BigInteger e) throws NotPositiveException {try{__CLR4_4_116zc16zclb90paul.R.inc(56025);
        __CLR4_4_116zc16zclb90paul.R.inc(56026);if ((((e.compareTo(BigInteger.ZERO) < 0)&&(__CLR4_4_116zc16zclb90paul.R.iget(56027)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(56028)==0&false))) {{
            __CLR4_4_116zc16zclb90paul.R.inc(56029);throw new NotPositiveException(LocalizedFormats.EXPONENT, e);
        }

        }__CLR4_4_116zc16zclb90paul.R.inc(56030);BigInteger result = BigInteger.ONE;
        __CLR4_4_116zc16zclb90paul.R.inc(56031);BigInteger k2p    = k;
        __CLR4_4_116zc16zclb90paul.R.inc(56032);while ((((!BigInteger.ZERO.equals(e))&&(__CLR4_4_116zc16zclb90paul.R.iget(56033)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(56034)==0&false))) {{
            __CLR4_4_116zc16zclb90paul.R.inc(56035);if ((((e.testBit(0))&&(__CLR4_4_116zc16zclb90paul.R.iget(56036)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(56037)==0&false))) {{
                __CLR4_4_116zc16zclb90paul.R.inc(56038);result = result.multiply(k2p);
            }
            }__CLR4_4_116zc16zclb90paul.R.inc(56039);k2p = k2p.multiply(k2p);
            __CLR4_4_116zc16zclb90paul.R.inc(56040);e = e.shiftRight(1);
        }

        }__CLR4_4_116zc16zclb90paul.R.inc(56041);return result;
    }finally{__CLR4_4_116zc16zclb90paul.R.flushNeeded();}}

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
     * @deprecated use {@link CombinatoricsUtils#stirlingS2(int, int)}
     */
    public static long stirlingS2(final int n, final int k)
        throws NotPositiveException, NumberIsTooLargeException, MathArithmeticException {try{__CLR4_4_116zc16zclb90paul.R.inc(56042);
        __CLR4_4_116zc16zclb90paul.R.inc(56043);return CombinatoricsUtils.stirlingS2(n, k);

    }finally{__CLR4_4_116zc16zclb90paul.R.flushNeeded();}}

    /**
     * Add two long integers, checking for overflow.
     *
     * @param a Addend.
     * @param b Addend.
     * @param pattern Pattern to use for any thrown exception.
     * @return the sum {@code a + b}.
     * @throws MathArithmeticException if the result cannot be represented
     * as a {@code long}.
     * @since 1.2
     */
     private static long addAndCheck(long a, long b, Localizable pattern) throws MathArithmeticException {try{__CLR4_4_116zc16zclb90paul.R.inc(56044);
        __CLR4_4_116zc16zclb90paul.R.inc(56045);long ret;
        __CLR4_4_116zc16zclb90paul.R.inc(56046);if ((((a > b)&&(__CLR4_4_116zc16zclb90paul.R.iget(56047)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(56048)==0&false))) {{
            // use symmetry to reduce boundary cases
            __CLR4_4_116zc16zclb90paul.R.inc(56049);ret = addAndCheck(b, a, pattern);
        } }else {{
            // assert a <= b

            __CLR4_4_116zc16zclb90paul.R.inc(56050);if ((((a < 0)&&(__CLR4_4_116zc16zclb90paul.R.iget(56051)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(56052)==0&false))) {{
                __CLR4_4_116zc16zclb90paul.R.inc(56053);if ((((b < 0)&&(__CLR4_4_116zc16zclb90paul.R.iget(56054)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(56055)==0&false))) {{
                    // check for negative overflow
                    __CLR4_4_116zc16zclb90paul.R.inc(56056);if ((((Long.MIN_VALUE - b <= a)&&(__CLR4_4_116zc16zclb90paul.R.iget(56057)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(56058)==0&false))) {{
                        __CLR4_4_116zc16zclb90paul.R.inc(56059);ret = a + b;
                    } }else {{
                        __CLR4_4_116zc16zclb90paul.R.inc(56060);throw new MathArithmeticException(pattern, a, b);
                    }
                }} }else {{
                    // opposite sign addition is always safe
                    __CLR4_4_116zc16zclb90paul.R.inc(56061);ret = a + b;
                }
            }} }else {{
                // assert a >= 0
                // assert b >= 0

                // check for positive overflow
                __CLR4_4_116zc16zclb90paul.R.inc(56062);if ((((a <= Long.MAX_VALUE - b)&&(__CLR4_4_116zc16zclb90paul.R.iget(56063)!=0|true))||(__CLR4_4_116zc16zclb90paul.R.iget(56064)==0&false))) {{
                    __CLR4_4_116zc16zclb90paul.R.inc(56065);ret = a + b;
                } }else {{
                    __CLR4_4_116zc16zclb90paul.R.inc(56066);throw new MathArithmeticException(pattern, a, b);
                }
            }}
        }}
        }__CLR4_4_116zc16zclb90paul.R.inc(56067);return ret;
    }finally{__CLR4_4_116zc16zclb90paul.R.flushNeeded();}}

    /**
     * Returns true if the argument is a power of two.
     *
     * @param n the number to test
     * @return true if the argument is a power of two
     */
    public static boolean isPowerOfTwo(long n) {try{__CLR4_4_116zc16zclb90paul.R.inc(56068);
        __CLR4_4_116zc16zclb90paul.R.inc(56069);return (n > 0) && ((n & (n - 1)) == 0);
    }finally{__CLR4_4_116zc16zclb90paul.R.flushNeeded();}}
}
