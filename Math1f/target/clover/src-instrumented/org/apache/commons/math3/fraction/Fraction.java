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
package org.apache.commons.math3.fraction;

import java.io.Serializable;
import java.math.BigInteger;

import org.apache.commons.math3.FieldElement;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.util.ArithmeticUtils;
import org.apache.commons.math3.util.FastMath;

/**
 * Representation of a rational number.
 *
 * implements Serializable since 2.0
 *
 * @since 1.1
 * @version $Id$
 */
public class Fraction
    extends Number
    implements FieldElement<Fraction>, Comparable<Fraction>, Serializable {public static class __CLR4_4_1bblbbllb90p7wm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,14933,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** A fraction representing "2 / 1". */
    public static final Fraction TWO = new Fraction(2, 1);

    /** A fraction representing "1". */
    public static final Fraction ONE = new Fraction(1, 1);

    /** A fraction representing "0". */
    public static final Fraction ZERO = new Fraction(0, 1);

    /** A fraction representing "4/5". */
    public static final Fraction FOUR_FIFTHS = new Fraction(4, 5);

    /** A fraction representing "1/5". */
    public static final Fraction ONE_FIFTH = new Fraction(1, 5);

    /** A fraction representing "1/2". */
    public static final Fraction ONE_HALF = new Fraction(1, 2);

    /** A fraction representing "1/4". */
    public static final Fraction ONE_QUARTER = new Fraction(1, 4);

    /** A fraction representing "1/3". */
    public static final Fraction ONE_THIRD = new Fraction(1, 3);

    /** A fraction representing "3/5". */
    public static final Fraction THREE_FIFTHS = new Fraction(3, 5);

    /** A fraction representing "3/4". */
    public static final Fraction THREE_QUARTERS = new Fraction(3, 4);

    /** A fraction representing "2/5". */
    public static final Fraction TWO_FIFTHS = new Fraction(2, 5);

    /** A fraction representing "2/4". */
    public static final Fraction TWO_QUARTERS = new Fraction(2, 4);

    /** A fraction representing "2/3". */
    public static final Fraction TWO_THIRDS = new Fraction(2, 3);

    /** A fraction representing "-1 / 1". */
    public static final Fraction MINUS_ONE = new Fraction(-1, 1);

    /** Serializable version identifier */
    private static final long serialVersionUID = 3698073679419233275L;

    /** The default epsilon used for convergence. */
    private static final double DEFAULT_EPSILON = 1e-5;

    /** The denominator. */
    private final int denominator;

    /** The numerator. */
    private final int numerator;

    /**
     * Create a fraction given the double value.
     * @param value the double value to convert to a fraction.
     * @throws FractionConversionException if the continued fraction failed to
     *         converge.
     */
    public Fraction(double value) throws FractionConversionException {
        this(value, DEFAULT_EPSILON, 100);__CLR4_4_1bblbbllb90p7wm.R.inc(14674);try{__CLR4_4_1bblbbllb90p7wm.R.inc(14673);
    }finally{__CLR4_4_1bblbbllb90p7wm.R.flushNeeded();}}

    /**
     * Create a fraction given the double value and maximum error allowed.
     * <p>
     * References:
     * <ul>
     * <li><a href="http://mathworld.wolfram.com/ContinuedFraction.html">
     * Continued Fraction</a> equations (11) and (22)-(26)</li>
     * </ul>
     * </p>
     * @param value the double value to convert to a fraction.
     * @param epsilon maximum error allowed.  The resulting fraction is within
     *        {@code epsilon} of {@code value}, in absolute terms.
     * @param maxIterations maximum number of convergents
     * @throws FractionConversionException if the continued fraction failed to
     *         converge.
     */
    public Fraction(double value, double epsilon, int maxIterations)
        throws FractionConversionException
    {
        this(value, epsilon, Integer.MAX_VALUE, maxIterations);__CLR4_4_1bblbbllb90p7wm.R.inc(14676);try{__CLR4_4_1bblbbllb90p7wm.R.inc(14675);
    }finally{__CLR4_4_1bblbbllb90p7wm.R.flushNeeded();}}

    /**
     * Create a fraction given the double value and maximum denominator.
     * <p>
     * References:
     * <ul>
     * <li><a href="http://mathworld.wolfram.com/ContinuedFraction.html">
     * Continued Fraction</a> equations (11) and (22)-(26)</li>
     * </ul>
     * </p>
     * @param value the double value to convert to a fraction.
     * @param maxDenominator The maximum allowed value for denominator
     * @throws FractionConversionException if the continued fraction failed to
     *         converge
     */
    public Fraction(double value, int maxDenominator)
        throws FractionConversionException
    {
       this(value, 0, maxDenominator, 100);__CLR4_4_1bblbbllb90p7wm.R.inc(14678);try{__CLR4_4_1bblbbllb90p7wm.R.inc(14677);
    }finally{__CLR4_4_1bblbbllb90p7wm.R.flushNeeded();}}

    /**
     * Create a fraction given the double value and either the maximum error
     * allowed or the maximum number of denominator digits.
     * <p>
     *
     * NOTE: This constructor is called with EITHER
     *   - a valid epsilon value and the maxDenominator set to Integer.MAX_VALUE
     *     (that way the maxDenominator has no effect).
     * OR
     *   - a valid maxDenominator value and the epsilon value set to zero
     *     (that way epsilon only has effect if there is an exact match before
     *     the maxDenominator value is reached).
     * </p><p>
     *
     * It has been done this way so that the same code can be (re)used for both
     * scenarios. However this could be confusing to users if it were part of
     * the public API and this constructor should therefore remain PRIVATE.
     * </p>
     *
     * See JIRA issue ticket MATH-181 for more details:
     *
     *     https://issues.apache.org/jira/browse/MATH-181
     *
     * @param value the double value to convert to a fraction.
     * @param epsilon maximum error allowed.  The resulting fraction is within
     *        {@code epsilon} of {@code value}, in absolute terms.
     * @param maxDenominator maximum denominator value allowed.
     * @param maxIterations maximum number of convergents
     * @throws FractionConversionException if the continued fraction failed to
     *         converge.
     */
    private Fraction(double value, double epsilon, int maxDenominator, int maxIterations)
        throws FractionConversionException
    {try{__CLR4_4_1bblbbllb90p7wm.R.inc(14679);
        __CLR4_4_1bblbbllb90p7wm.R.inc(14680);long overflow = Integer.MAX_VALUE;
        __CLR4_4_1bblbbllb90p7wm.R.inc(14681);double r0 = value;
        __CLR4_4_1bblbbllb90p7wm.R.inc(14682);long a0 = (long)FastMath.floor(r0);
        __CLR4_4_1bblbbllb90p7wm.R.inc(14683);if ((((FastMath.abs(a0) > overflow)&&(__CLR4_4_1bblbbllb90p7wm.R.iget(14684)!=0|true))||(__CLR4_4_1bblbbllb90p7wm.R.iget(14685)==0&false))) {{
            __CLR4_4_1bblbbllb90p7wm.R.inc(14686);throw new FractionConversionException(value, a0, 1l);
        }

        // check for (almost) integer arguments, which should not go to iterations.
        }__CLR4_4_1bblbbllb90p7wm.R.inc(14687);if ((((FastMath.abs(a0 - value) < epsilon)&&(__CLR4_4_1bblbbllb90p7wm.R.iget(14688)!=0|true))||(__CLR4_4_1bblbbllb90p7wm.R.iget(14689)==0&false))) {{
            __CLR4_4_1bblbbllb90p7wm.R.inc(14690);this.numerator = (int) a0;
            __CLR4_4_1bblbbllb90p7wm.R.inc(14691);this.denominator = 1;
            __CLR4_4_1bblbbllb90p7wm.R.inc(14692);return;
        }

        }__CLR4_4_1bblbbllb90p7wm.R.inc(14693);long p0 = 1;
        __CLR4_4_1bblbbllb90p7wm.R.inc(14694);long q0 = 0;
        __CLR4_4_1bblbbllb90p7wm.R.inc(14695);long p1 = a0;
        __CLR4_4_1bblbbllb90p7wm.R.inc(14696);long q1 = 1;

        __CLR4_4_1bblbbllb90p7wm.R.inc(14697);long p2 = 0;
        __CLR4_4_1bblbbllb90p7wm.R.inc(14698);long q2 = 1;

        __CLR4_4_1bblbbllb90p7wm.R.inc(14699);int n = 0;
        __CLR4_4_1bblbbllb90p7wm.R.inc(14700);boolean stop = false;
        __CLR4_4_1bblbbllb90p7wm.R.inc(14701);do {{
            __CLR4_4_1bblbbllb90p7wm.R.inc(14702);++n;
            __CLR4_4_1bblbbllb90p7wm.R.inc(14703);double r1 = 1.0 / (r0 - a0);
            __CLR4_4_1bblbbllb90p7wm.R.inc(14704);long a1 = (long)FastMath.floor(r1);
            __CLR4_4_1bblbbllb90p7wm.R.inc(14705);p2 = (a1 * p1) + p0;
            __CLR4_4_1bblbbllb90p7wm.R.inc(14706);q2 = (a1 * q1) + q0;

            __CLR4_4_1bblbbllb90p7wm.R.inc(14707);if (((((FastMath.abs(p2) > overflow) || (FastMath.abs(q2) > overflow))&&(__CLR4_4_1bblbbllb90p7wm.R.iget(14708)!=0|true))||(__CLR4_4_1bblbbllb90p7wm.R.iget(14709)==0&false))) {{
                // in maxDenominator mode, if the last fraction was very close to the actual value
                // q2 may overflow in the next iteration; in this case return the last one.
                __CLR4_4_1bblbbllb90p7wm.R.inc(14710);if ((((epsilon == 0.0 && FastMath.abs(q1) < maxDenominator)&&(__CLR4_4_1bblbbllb90p7wm.R.iget(14711)!=0|true))||(__CLR4_4_1bblbbllb90p7wm.R.iget(14712)==0&false))) {{
                    __CLR4_4_1bblbbllb90p7wm.R.inc(14713);break;
                }
                }__CLR4_4_1bblbbllb90p7wm.R.inc(14714);throw new FractionConversionException(value, p2, q2);
            }

            }__CLR4_4_1bblbbllb90p7wm.R.inc(14715);double convergent = (double)p2 / (double)q2;
            __CLR4_4_1bblbbllb90p7wm.R.inc(14716);if ((((n < maxIterations && FastMath.abs(convergent - value) > epsilon && q2 < maxDenominator)&&(__CLR4_4_1bblbbllb90p7wm.R.iget(14717)!=0|true))||(__CLR4_4_1bblbbllb90p7wm.R.iget(14718)==0&false))) {{
                __CLR4_4_1bblbbllb90p7wm.R.inc(14719);p0 = p1;
                __CLR4_4_1bblbbllb90p7wm.R.inc(14720);p1 = p2;
                __CLR4_4_1bblbbllb90p7wm.R.inc(14721);q0 = q1;
                __CLR4_4_1bblbbllb90p7wm.R.inc(14722);q1 = q2;
                __CLR4_4_1bblbbllb90p7wm.R.inc(14723);a0 = a1;
                __CLR4_4_1bblbbllb90p7wm.R.inc(14724);r0 = r1;
            } }else {{
                __CLR4_4_1bblbbllb90p7wm.R.inc(14725);stop = true;
            }
        }} }while ((((!stop)&&(__CLR4_4_1bblbbllb90p7wm.R.iget(14726)!=0|true))||(__CLR4_4_1bblbbllb90p7wm.R.iget(14727)==0&false)));

        __CLR4_4_1bblbbllb90p7wm.R.inc(14728);if ((((n >= maxIterations)&&(__CLR4_4_1bblbbllb90p7wm.R.iget(14729)!=0|true))||(__CLR4_4_1bblbbllb90p7wm.R.iget(14730)==0&false))) {{
            __CLR4_4_1bblbbllb90p7wm.R.inc(14731);throw new FractionConversionException(value, maxIterations);
        }

        }__CLR4_4_1bblbbllb90p7wm.R.inc(14732);if ((((q2 < maxDenominator)&&(__CLR4_4_1bblbbllb90p7wm.R.iget(14733)!=0|true))||(__CLR4_4_1bblbbllb90p7wm.R.iget(14734)==0&false))) {{
            __CLR4_4_1bblbbllb90p7wm.R.inc(14735);this.numerator = (int) p2;
            __CLR4_4_1bblbbllb90p7wm.R.inc(14736);this.denominator = (int) q2;
        } }else {{
            __CLR4_4_1bblbbllb90p7wm.R.inc(14737);this.numerator = (int) p1;
            __CLR4_4_1bblbbllb90p7wm.R.inc(14738);this.denominator = (int) q1;
        }

    }}finally{__CLR4_4_1bblbbllb90p7wm.R.flushNeeded();}}

    /**
     * Create a fraction from an int.
     * The fraction is num / 1.
     * @param num the numerator.
     */
    public Fraction(int num) {
        this(num, 1);__CLR4_4_1bblbbllb90p7wm.R.inc(14740);try{__CLR4_4_1bblbbllb90p7wm.R.inc(14739);
    }finally{__CLR4_4_1bblbbllb90p7wm.R.flushNeeded();}}

    /**
     * Create a fraction given the numerator and denominator.  The fraction is
     * reduced to lowest terms.
     * @param num the numerator.
     * @param den the denominator.
     * @throws MathArithmeticException if the denominator is {@code zero}
     */
    public Fraction(int num, int den) {try{__CLR4_4_1bblbbllb90p7wm.R.inc(14741);
        __CLR4_4_1bblbbllb90p7wm.R.inc(14742);if ((((den == 0)&&(__CLR4_4_1bblbbllb90p7wm.R.iget(14743)!=0|true))||(__CLR4_4_1bblbbllb90p7wm.R.iget(14744)==0&false))) {{
            __CLR4_4_1bblbbllb90p7wm.R.inc(14745);throw new MathArithmeticException(LocalizedFormats.ZERO_DENOMINATOR_IN_FRACTION,
                                              num, den);
        }
        }__CLR4_4_1bblbbllb90p7wm.R.inc(14746);if ((((den < 0)&&(__CLR4_4_1bblbbllb90p7wm.R.iget(14747)!=0|true))||(__CLR4_4_1bblbbllb90p7wm.R.iget(14748)==0&false))) {{
            __CLR4_4_1bblbbllb90p7wm.R.inc(14749);if ((((num == Integer.MIN_VALUE ||
                den == Integer.MIN_VALUE)&&(__CLR4_4_1bblbbllb90p7wm.R.iget(14750)!=0|true))||(__CLR4_4_1bblbbllb90p7wm.R.iget(14751)==0&false))) {{
                __CLR4_4_1bblbbllb90p7wm.R.inc(14752);throw new MathArithmeticException(LocalizedFormats.OVERFLOW_IN_FRACTION,
                                                  num, den);
            }
            }__CLR4_4_1bblbbllb90p7wm.R.inc(14753);num = -num;
            __CLR4_4_1bblbbllb90p7wm.R.inc(14754);den = -den;
        }
        // reduce numerator and denominator by greatest common denominator.
        }__CLR4_4_1bblbbllb90p7wm.R.inc(14755);final int d = ArithmeticUtils.gcd(num, den);
        __CLR4_4_1bblbbllb90p7wm.R.inc(14756);if ((((d > 1)&&(__CLR4_4_1bblbbllb90p7wm.R.iget(14757)!=0|true))||(__CLR4_4_1bblbbllb90p7wm.R.iget(14758)==0&false))) {{
            __CLR4_4_1bblbbllb90p7wm.R.inc(14759);num /= d;
            __CLR4_4_1bblbbllb90p7wm.R.inc(14760);den /= d;
        }

        // move sign to numerator.
        }__CLR4_4_1bblbbllb90p7wm.R.inc(14761);if ((((den < 0)&&(__CLR4_4_1bblbbllb90p7wm.R.iget(14762)!=0|true))||(__CLR4_4_1bblbbllb90p7wm.R.iget(14763)==0&false))) {{
            __CLR4_4_1bblbbllb90p7wm.R.inc(14764);num = -num;
            __CLR4_4_1bblbbllb90p7wm.R.inc(14765);den = -den;
        }
        }__CLR4_4_1bblbbllb90p7wm.R.inc(14766);this.numerator   = num;
        __CLR4_4_1bblbbllb90p7wm.R.inc(14767);this.denominator = den;
    }finally{__CLR4_4_1bblbbllb90p7wm.R.flushNeeded();}}

    /**
     * Returns the absolute value of this fraction.
     * @return the absolute value.
     */
    public Fraction abs() {try{__CLR4_4_1bblbbllb90p7wm.R.inc(14768);
        __CLR4_4_1bblbbllb90p7wm.R.inc(14769);Fraction ret;
        __CLR4_4_1bblbbllb90p7wm.R.inc(14770);if ((((numerator >= 0)&&(__CLR4_4_1bblbbllb90p7wm.R.iget(14771)!=0|true))||(__CLR4_4_1bblbbllb90p7wm.R.iget(14772)==0&false))) {{
            __CLR4_4_1bblbbllb90p7wm.R.inc(14773);ret = this;
        } }else {{
            __CLR4_4_1bblbbllb90p7wm.R.inc(14774);ret = negate();
        }
        }__CLR4_4_1bblbbllb90p7wm.R.inc(14775);return ret;
    }finally{__CLR4_4_1bblbbllb90p7wm.R.flushNeeded();}}

    /**
     * Compares this object to another based on size.
     * @param object the object to compare to
     * @return -1 if this is less than <tt>object</tt>, +1 if this is greater
     *         than <tt>object</tt>, 0 if they are equal.
     */
    public int compareTo(Fraction object) {try{__CLR4_4_1bblbbllb90p7wm.R.inc(14776);
        __CLR4_4_1bblbbllb90p7wm.R.inc(14777);long nOd = ((long) numerator) * object.denominator;
        __CLR4_4_1bblbbllb90p7wm.R.inc(14778);long dOn = ((long) denominator) * object.numerator;
        __CLR4_4_1bblbbllb90p7wm.R.inc(14779);return ((((nOd < dOn) )&&(__CLR4_4_1bblbbllb90p7wm.R.iget(14780)!=0|true))||(__CLR4_4_1bblbbllb90p7wm.R.iget(14781)==0&false))? -1 : (((((nOd > dOn) )&&(__CLR4_4_1bblbbllb90p7wm.R.iget(14782)!=0|true))||(__CLR4_4_1bblbbllb90p7wm.R.iget(14783)==0&false))? +1 : 0);
    }finally{__CLR4_4_1bblbbllb90p7wm.R.flushNeeded();}}

    /**
     * Gets the fraction as a <tt>double</tt>. This calculates the fraction as
     * the numerator divided by denominator.
     * @return the fraction as a <tt>double</tt>
     */
    @Override
    public double doubleValue() {try{__CLR4_4_1bblbbllb90p7wm.R.inc(14784);
        __CLR4_4_1bblbbllb90p7wm.R.inc(14785);return (double)numerator / (double)denominator;
    }finally{__CLR4_4_1bblbbllb90p7wm.R.flushNeeded();}}

    /**
     * Test for the equality of two fractions.  If the lowest term
     * numerator and denominators are the same for both fractions, the two
     * fractions are considered to be equal.
     * @param other fraction to test for equality to this fraction
     * @return true if two fractions are equal, false if object is
     *         <tt>null</tt>, not an instance of {@link Fraction}, or not equal
     *         to this fraction instance.
     */
    @Override
    public boolean equals(Object other) {try{__CLR4_4_1bblbbllb90p7wm.R.inc(14786);
        __CLR4_4_1bblbbllb90p7wm.R.inc(14787);if ((((this == other)&&(__CLR4_4_1bblbbllb90p7wm.R.iget(14788)!=0|true))||(__CLR4_4_1bblbbllb90p7wm.R.iget(14789)==0&false))) {{
            __CLR4_4_1bblbbllb90p7wm.R.inc(14790);return true;
        }
        }__CLR4_4_1bblbbllb90p7wm.R.inc(14791);if ((((other instanceof Fraction)&&(__CLR4_4_1bblbbllb90p7wm.R.iget(14792)!=0|true))||(__CLR4_4_1bblbbllb90p7wm.R.iget(14793)==0&false))) {{
            // since fractions are always in lowest terms, numerators and
            // denominators can be compared directly for equality.
            __CLR4_4_1bblbbllb90p7wm.R.inc(14794);Fraction rhs = (Fraction)other;
            __CLR4_4_1bblbbllb90p7wm.R.inc(14795);return (numerator == rhs.numerator) &&
                (denominator == rhs.denominator);
        }
        }__CLR4_4_1bblbbllb90p7wm.R.inc(14796);return false;
    }finally{__CLR4_4_1bblbbllb90p7wm.R.flushNeeded();}}

    /**
     * Gets the fraction as a <tt>float</tt>. This calculates the fraction as
     * the numerator divided by denominator.
     * @return the fraction as a <tt>float</tt>
     */
    @Override
    public float floatValue() {try{__CLR4_4_1bblbbllb90p7wm.R.inc(14797);
        __CLR4_4_1bblbbllb90p7wm.R.inc(14798);return (float)doubleValue();
    }finally{__CLR4_4_1bblbbllb90p7wm.R.flushNeeded();}}

    /**
     * Access the denominator.
     * @return the denominator.
     */
    public int getDenominator() {try{__CLR4_4_1bblbbllb90p7wm.R.inc(14799);
        __CLR4_4_1bblbbllb90p7wm.R.inc(14800);return denominator;
    }finally{__CLR4_4_1bblbbllb90p7wm.R.flushNeeded();}}

    /**
     * Access the numerator.
     * @return the numerator.
     */
    public int getNumerator() {try{__CLR4_4_1bblbbllb90p7wm.R.inc(14801);
        __CLR4_4_1bblbbllb90p7wm.R.inc(14802);return numerator;
    }finally{__CLR4_4_1bblbbllb90p7wm.R.flushNeeded();}}

    /**
     * Gets a hashCode for the fraction.
     * @return a hash code value for this object
     */
    @Override
    public int hashCode() {try{__CLR4_4_1bblbbllb90p7wm.R.inc(14803);
        __CLR4_4_1bblbbllb90p7wm.R.inc(14804);return 37 * (37 * 17 + numerator) + denominator;
    }finally{__CLR4_4_1bblbbllb90p7wm.R.flushNeeded();}}

    /**
     * Gets the fraction as an <tt>int</tt>. This returns the whole number part
     * of the fraction.
     * @return the whole number fraction part
     */
    @Override
    public int intValue() {try{__CLR4_4_1bblbbllb90p7wm.R.inc(14805);
        __CLR4_4_1bblbbllb90p7wm.R.inc(14806);return (int)doubleValue();
    }finally{__CLR4_4_1bblbbllb90p7wm.R.flushNeeded();}}

    /**
     * Gets the fraction as a <tt>long</tt>. This returns the whole number part
     * of the fraction.
     * @return the whole number fraction part
     */
    @Override
    public long longValue() {try{__CLR4_4_1bblbbllb90p7wm.R.inc(14807);
        __CLR4_4_1bblbbllb90p7wm.R.inc(14808);return (long)doubleValue();
    }finally{__CLR4_4_1bblbbllb90p7wm.R.flushNeeded();}}

    /**
     * Return the additive inverse of this fraction.
     * @return the negation of this fraction.
     */
    public Fraction negate() {try{__CLR4_4_1bblbbllb90p7wm.R.inc(14809);
        __CLR4_4_1bblbbllb90p7wm.R.inc(14810);if ((((numerator==Integer.MIN_VALUE)&&(__CLR4_4_1bblbbllb90p7wm.R.iget(14811)!=0|true))||(__CLR4_4_1bblbbllb90p7wm.R.iget(14812)==0&false))) {{
            __CLR4_4_1bblbbllb90p7wm.R.inc(14813);throw new MathArithmeticException(LocalizedFormats.OVERFLOW_IN_FRACTION, numerator, denominator);
        }
        }__CLR4_4_1bblbbllb90p7wm.R.inc(14814);return new Fraction(-numerator, denominator);
    }finally{__CLR4_4_1bblbbllb90p7wm.R.flushNeeded();}}

    /**
     * Return the multiplicative inverse of this fraction.
     * @return the reciprocal fraction
     */
    public Fraction reciprocal() {try{__CLR4_4_1bblbbllb90p7wm.R.inc(14815);
        __CLR4_4_1bblbbllb90p7wm.R.inc(14816);return new Fraction(denominator, numerator);
    }finally{__CLR4_4_1bblbbllb90p7wm.R.flushNeeded();}}

    /**
     * <p>Adds the value of this fraction to another, returning the result in reduced form.
     * The algorithm follows Knuth, 4.5.1.</p>
     *
     * @param fraction  the fraction to add, must not be {@code null}
     * @return a {@code Fraction} instance with the resulting values
     * @throws NullArgumentException if the fraction is {@code null}
     * @throws MathArithmeticException if the resulting numerator or denominator exceeds
     *  {@code Integer.MAX_VALUE}
     */
    public Fraction add(Fraction fraction) {try{__CLR4_4_1bblbbllb90p7wm.R.inc(14817);
        __CLR4_4_1bblbbllb90p7wm.R.inc(14818);return addSub(fraction, true /* add */);
    }finally{__CLR4_4_1bblbbllb90p7wm.R.flushNeeded();}}

    /**
     * Add an integer to the fraction.
     * @param i the <tt>integer</tt> to add.
     * @return this + i
     */
    public Fraction add(final int i) {try{__CLR4_4_1bblbbllb90p7wm.R.inc(14819);
        __CLR4_4_1bblbbllb90p7wm.R.inc(14820);return new Fraction(numerator + i * denominator, denominator);
    }finally{__CLR4_4_1bblbbllb90p7wm.R.flushNeeded();}}

    /**
     * <p>Subtracts the value of another fraction from the value of this one,
     * returning the result in reduced form.</p>
     *
     * @param fraction  the fraction to subtract, must not be {@code null}
     * @return a {@code Fraction} instance with the resulting values
     * @throws NullArgumentException if the fraction is {@code null}
     * @throws MathArithmeticException if the resulting numerator or denominator
     *   cannot be represented in an {@code int}.
     */
    public Fraction subtract(Fraction fraction) {try{__CLR4_4_1bblbbllb90p7wm.R.inc(14821);
        __CLR4_4_1bblbbllb90p7wm.R.inc(14822);return addSub(fraction, false /* subtract */);
    }finally{__CLR4_4_1bblbbllb90p7wm.R.flushNeeded();}}

    /**
     * Subtract an integer from the fraction.
     * @param i the <tt>integer</tt> to subtract.
     * @return this - i
     */
    public Fraction subtract(final int i) {try{__CLR4_4_1bblbbllb90p7wm.R.inc(14823);
        __CLR4_4_1bblbbllb90p7wm.R.inc(14824);return new Fraction(numerator - i * denominator, denominator);
    }finally{__CLR4_4_1bblbbllb90p7wm.R.flushNeeded();}}

    /**
     * Implement add and subtract using algorithm described in Knuth 4.5.1.
     *
     * @param fraction the fraction to subtract, must not be {@code null}
     * @param isAdd true to add, false to subtract
     * @return a {@code Fraction} instance with the resulting values
     * @throws NullArgumentException if the fraction is {@code null}
     * @throws MathArithmeticException if the resulting numerator or denominator
     *   cannot be represented in an {@code int}.
     */
    private Fraction addSub(Fraction fraction, boolean isAdd) {try{__CLR4_4_1bblbbllb90p7wm.R.inc(14825);
        __CLR4_4_1bblbbllb90p7wm.R.inc(14826);if ((((fraction == null)&&(__CLR4_4_1bblbbllb90p7wm.R.iget(14827)!=0|true))||(__CLR4_4_1bblbbllb90p7wm.R.iget(14828)==0&false))) {{
            __CLR4_4_1bblbbllb90p7wm.R.inc(14829);throw new NullArgumentException(LocalizedFormats.FRACTION);
        }
        // zero is identity for addition.
        }__CLR4_4_1bblbbllb90p7wm.R.inc(14830);if ((((numerator == 0)&&(__CLR4_4_1bblbbllb90p7wm.R.iget(14831)!=0|true))||(__CLR4_4_1bblbbllb90p7wm.R.iget(14832)==0&false))) {{
            __CLR4_4_1bblbbllb90p7wm.R.inc(14833);return (((isAdd )&&(__CLR4_4_1bblbbllb90p7wm.R.iget(14834)!=0|true))||(__CLR4_4_1bblbbllb90p7wm.R.iget(14835)==0&false))? fraction : fraction.negate();
        }
        }__CLR4_4_1bblbbllb90p7wm.R.inc(14836);if ((((fraction.numerator == 0)&&(__CLR4_4_1bblbbllb90p7wm.R.iget(14837)!=0|true))||(__CLR4_4_1bblbbllb90p7wm.R.iget(14838)==0&false))) {{
            __CLR4_4_1bblbbllb90p7wm.R.inc(14839);return this;
        }
        // if denominators are randomly distributed, d1 will be 1 about 61%
        // of the time.
        }__CLR4_4_1bblbbllb90p7wm.R.inc(14840);int d1 = ArithmeticUtils.gcd(denominator, fraction.denominator);
        __CLR4_4_1bblbbllb90p7wm.R.inc(14841);if ((((d1==1)&&(__CLR4_4_1bblbbllb90p7wm.R.iget(14842)!=0|true))||(__CLR4_4_1bblbbllb90p7wm.R.iget(14843)==0&false))) {{
            // result is ( (u*v' +/- u'v) / u'v')
            __CLR4_4_1bblbbllb90p7wm.R.inc(14844);int uvp = ArithmeticUtils.mulAndCheck(numerator, fraction.denominator);
            __CLR4_4_1bblbbllb90p7wm.R.inc(14845);int upv = ArithmeticUtils.mulAndCheck(fraction.numerator, denominator);
            __CLR4_4_1bblbbllb90p7wm.R.inc(14846);return new Fraction
                ((((isAdd )&&(__CLR4_4_1bblbbllb90p7wm.R.iget(14847)!=0|true))||(__CLR4_4_1bblbbllb90p7wm.R.iget(14848)==0&false))? ArithmeticUtils.addAndCheck(uvp, upv) :
                 ArithmeticUtils.subAndCheck(uvp, upv),
                 ArithmeticUtils.mulAndCheck(denominator, fraction.denominator));
        }
        // the quantity 't' requires 65 bits of precision; see knuth 4.5.1
        // exercise 7.  we're going to use a BigInteger.
        // t = u(v'/d1) +/- v(u'/d1)
        }__CLR4_4_1bblbbllb90p7wm.R.inc(14849);BigInteger uvp = BigInteger.valueOf(numerator)
        .multiply(BigInteger.valueOf(fraction.denominator/d1));
        __CLR4_4_1bblbbllb90p7wm.R.inc(14850);BigInteger upv = BigInteger.valueOf(fraction.numerator)
        .multiply(BigInteger.valueOf(denominator/d1));
        __CLR4_4_1bblbbllb90p7wm.R.inc(14851);BigInteger t = (((isAdd )&&(__CLR4_4_1bblbbllb90p7wm.R.iget(14852)!=0|true))||(__CLR4_4_1bblbbllb90p7wm.R.iget(14853)==0&false))? uvp.add(upv) : uvp.subtract(upv);
        // but d2 doesn't need extra precision because
        // d2 = gcd(t,d1) = gcd(t mod d1, d1)
        __CLR4_4_1bblbbllb90p7wm.R.inc(14854);int tmodd1 = t.mod(BigInteger.valueOf(d1)).intValue();
        __CLR4_4_1bblbbllb90p7wm.R.inc(14855);int d2 = ((((tmodd1==0))&&(__CLR4_4_1bblbbllb90p7wm.R.iget(14856)!=0|true))||(__CLR4_4_1bblbbllb90p7wm.R.iget(14857)==0&false))?d1:ArithmeticUtils.gcd(tmodd1, d1);

        // result is (t/d2) / (u'/d1)(v'/d2)
        __CLR4_4_1bblbbllb90p7wm.R.inc(14858);BigInteger w = t.divide(BigInteger.valueOf(d2));
        __CLR4_4_1bblbbllb90p7wm.R.inc(14859);if ((((w.bitLength() > 31)&&(__CLR4_4_1bblbbllb90p7wm.R.iget(14860)!=0|true))||(__CLR4_4_1bblbbllb90p7wm.R.iget(14861)==0&false))) {{
            __CLR4_4_1bblbbllb90p7wm.R.inc(14862);throw new MathArithmeticException(LocalizedFormats.NUMERATOR_OVERFLOW_AFTER_MULTIPLY,
                                              w);
        }
        }__CLR4_4_1bblbbllb90p7wm.R.inc(14863);return new Fraction (w.intValue(),
                ArithmeticUtils.mulAndCheck(denominator/d1,
                        fraction.denominator/d2));
    }finally{__CLR4_4_1bblbbllb90p7wm.R.flushNeeded();}}

    /**
     * <p>Multiplies the value of this fraction by another, returning the
     * result in reduced form.</p>
     *
     * @param fraction  the fraction to multiply by, must not be {@code null}
     * @return a {@code Fraction} instance with the resulting values
     * @throws NullArgumentException if the fraction is {@code null}
     * @throws MathArithmeticException if the resulting numerator or denominator exceeds
     *  {@code Integer.MAX_VALUE}
     */
    public Fraction multiply(Fraction fraction) {try{__CLR4_4_1bblbbllb90p7wm.R.inc(14864);
        __CLR4_4_1bblbbllb90p7wm.R.inc(14865);if ((((fraction == null)&&(__CLR4_4_1bblbbllb90p7wm.R.iget(14866)!=0|true))||(__CLR4_4_1bblbbllb90p7wm.R.iget(14867)==0&false))) {{
            __CLR4_4_1bblbbllb90p7wm.R.inc(14868);throw new NullArgumentException(LocalizedFormats.FRACTION);
        }
        }__CLR4_4_1bblbbllb90p7wm.R.inc(14869);if ((((numerator == 0 || fraction.numerator == 0)&&(__CLR4_4_1bblbbllb90p7wm.R.iget(14870)!=0|true))||(__CLR4_4_1bblbbllb90p7wm.R.iget(14871)==0&false))) {{
            __CLR4_4_1bblbbllb90p7wm.R.inc(14872);return ZERO;
        }
        // knuth 4.5.1
        // make sure we don't overflow unless the result *must* overflow.
        }__CLR4_4_1bblbbllb90p7wm.R.inc(14873);int d1 = ArithmeticUtils.gcd(numerator, fraction.denominator);
        __CLR4_4_1bblbbllb90p7wm.R.inc(14874);int d2 = ArithmeticUtils.gcd(fraction.numerator, denominator);
        __CLR4_4_1bblbbllb90p7wm.R.inc(14875);return getReducedFraction
        (ArithmeticUtils.mulAndCheck(numerator/d1, fraction.numerator/d2),
                ArithmeticUtils.mulAndCheck(denominator/d2, fraction.denominator/d1));
    }finally{__CLR4_4_1bblbbllb90p7wm.R.flushNeeded();}}

    /**
     * Multiply the fraction by an integer.
     * @param i the <tt>integer</tt> to multiply by.
     * @return this * i
     */
    public Fraction multiply(final int i) {try{__CLR4_4_1bblbbllb90p7wm.R.inc(14876);
        __CLR4_4_1bblbbllb90p7wm.R.inc(14877);return new Fraction(numerator * i, denominator);
    }finally{__CLR4_4_1bblbbllb90p7wm.R.flushNeeded();}}

    /**
     * <p>Divide the value of this fraction by another.</p>
     *
     * @param fraction  the fraction to divide by, must not be {@code null}
     * @return a {@code Fraction} instance with the resulting values
     * @throws IllegalArgumentException if the fraction is {@code null}
     * @throws MathArithmeticException if the fraction to divide by is zero
     * @throws MathArithmeticException if the resulting numerator or denominator exceeds
     *  {@code Integer.MAX_VALUE}
     */
    public Fraction divide(Fraction fraction) {try{__CLR4_4_1bblbbllb90p7wm.R.inc(14878);
        __CLR4_4_1bblbbllb90p7wm.R.inc(14879);if ((((fraction == null)&&(__CLR4_4_1bblbbllb90p7wm.R.iget(14880)!=0|true))||(__CLR4_4_1bblbbllb90p7wm.R.iget(14881)==0&false))) {{
            __CLR4_4_1bblbbllb90p7wm.R.inc(14882);throw new NullArgumentException(LocalizedFormats.FRACTION);
        }
        }__CLR4_4_1bblbbllb90p7wm.R.inc(14883);if ((((fraction.numerator == 0)&&(__CLR4_4_1bblbbllb90p7wm.R.iget(14884)!=0|true))||(__CLR4_4_1bblbbllb90p7wm.R.iget(14885)==0&false))) {{
            __CLR4_4_1bblbbllb90p7wm.R.inc(14886);throw new MathArithmeticException(LocalizedFormats.ZERO_FRACTION_TO_DIVIDE_BY,
                                              fraction.numerator, fraction.denominator);
        }
        }__CLR4_4_1bblbbllb90p7wm.R.inc(14887);return multiply(fraction.reciprocal());
    }finally{__CLR4_4_1bblbbllb90p7wm.R.flushNeeded();}}

    /**
     * Divide the fraction by an integer.
     * @param i the <tt>integer</tt> to divide by.
     * @return this * i
     */
    public Fraction divide(final int i) {try{__CLR4_4_1bblbbllb90p7wm.R.inc(14888);
        __CLR4_4_1bblbbllb90p7wm.R.inc(14889);return new Fraction(numerator, denominator * i);
    }finally{__CLR4_4_1bblbbllb90p7wm.R.flushNeeded();}}

    /**
     * <p>
     * Gets the fraction percentage as a <tt>double</tt>. This calculates the
     * fraction as the numerator divided by denominator multiplied by 100.
     * </p>
     *
     * @return the fraction percentage as a <tt>double</tt>.
     */
    public double percentageValue() {try{__CLR4_4_1bblbbllb90p7wm.R.inc(14890);
        __CLR4_4_1bblbbllb90p7wm.R.inc(14891);return 100 * doubleValue();
    }finally{__CLR4_4_1bblbbllb90p7wm.R.flushNeeded();}}

    /**
     * <p>Creates a {@code Fraction} instance with the 2 parts
     * of a fraction Y/Z.</p>
     *
     * <p>Any negative signs are resolved to be on the numerator.</p>
     *
     * @param numerator  the numerator, for example the three in 'three sevenths'
     * @param denominator  the denominator, for example the seven in 'three sevenths'
     * @return a new fraction instance, with the numerator and denominator reduced
     * @throws MathArithmeticException if the denominator is {@code zero}
     */
    public static Fraction getReducedFraction(int numerator, int denominator) {try{__CLR4_4_1bblbbllb90p7wm.R.inc(14892);
        __CLR4_4_1bblbbllb90p7wm.R.inc(14893);if ((((denominator == 0)&&(__CLR4_4_1bblbbllb90p7wm.R.iget(14894)!=0|true))||(__CLR4_4_1bblbbllb90p7wm.R.iget(14895)==0&false))) {{
            __CLR4_4_1bblbbllb90p7wm.R.inc(14896);throw new MathArithmeticException(LocalizedFormats.ZERO_DENOMINATOR_IN_FRACTION,
                                              numerator, denominator);
        }
        }__CLR4_4_1bblbbllb90p7wm.R.inc(14897);if ((((numerator==0)&&(__CLR4_4_1bblbbllb90p7wm.R.iget(14898)!=0|true))||(__CLR4_4_1bblbbllb90p7wm.R.iget(14899)==0&false))) {{
            __CLR4_4_1bblbbllb90p7wm.R.inc(14900);return ZERO; // normalize zero.
        }
        // allow 2^k/-2^31 as a valid fraction (where k>0)
        }__CLR4_4_1bblbbllb90p7wm.R.inc(14901);if ((((denominator==Integer.MIN_VALUE && (numerator&1)==0)&&(__CLR4_4_1bblbbllb90p7wm.R.iget(14902)!=0|true))||(__CLR4_4_1bblbbllb90p7wm.R.iget(14903)==0&false))) {{
            __CLR4_4_1bblbbllb90p7wm.R.inc(14904);numerator/=2; __CLR4_4_1bblbbllb90p7wm.R.inc(14905);denominator/=2;
        }
        }__CLR4_4_1bblbbllb90p7wm.R.inc(14906);if ((((denominator < 0)&&(__CLR4_4_1bblbbllb90p7wm.R.iget(14907)!=0|true))||(__CLR4_4_1bblbbllb90p7wm.R.iget(14908)==0&false))) {{
            __CLR4_4_1bblbbllb90p7wm.R.inc(14909);if ((((numerator==Integer.MIN_VALUE ||
                    denominator==Integer.MIN_VALUE)&&(__CLR4_4_1bblbbllb90p7wm.R.iget(14910)!=0|true))||(__CLR4_4_1bblbbllb90p7wm.R.iget(14911)==0&false))) {{
                __CLR4_4_1bblbbllb90p7wm.R.inc(14912);throw new MathArithmeticException(LocalizedFormats.OVERFLOW_IN_FRACTION,
                                                  numerator, denominator);
            }
            }__CLR4_4_1bblbbllb90p7wm.R.inc(14913);numerator = -numerator;
            __CLR4_4_1bblbbllb90p7wm.R.inc(14914);denominator = -denominator;
        }
        // simplify fraction.
        }__CLR4_4_1bblbbllb90p7wm.R.inc(14915);int gcd = ArithmeticUtils.gcd(numerator, denominator);
        __CLR4_4_1bblbbllb90p7wm.R.inc(14916);numerator /= gcd;
        __CLR4_4_1bblbbllb90p7wm.R.inc(14917);denominator /= gcd;
        __CLR4_4_1bblbbllb90p7wm.R.inc(14918);return new Fraction(numerator, denominator);
    }finally{__CLR4_4_1bblbbllb90p7wm.R.flushNeeded();}}

    /**
     * <p>
     * Returns the {@code String} representing this fraction, ie
     * "num / dem" or just "num" if the denominator is one.
     * </p>
     *
     * @return a string representation of the fraction.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {try{__CLR4_4_1bblbbllb90p7wm.R.inc(14919);
        __CLR4_4_1bblbbllb90p7wm.R.inc(14920);String str = null;
        __CLR4_4_1bblbbllb90p7wm.R.inc(14921);if ((((denominator == 1)&&(__CLR4_4_1bblbbllb90p7wm.R.iget(14922)!=0|true))||(__CLR4_4_1bblbbllb90p7wm.R.iget(14923)==0&false))) {{
            __CLR4_4_1bblbbllb90p7wm.R.inc(14924);str = Integer.toString(numerator);
        } }else {__CLR4_4_1bblbbllb90p7wm.R.inc(14925);if ((((numerator == 0)&&(__CLR4_4_1bblbbllb90p7wm.R.iget(14926)!=0|true))||(__CLR4_4_1bblbbllb90p7wm.R.iget(14927)==0&false))) {{
            __CLR4_4_1bblbbllb90p7wm.R.inc(14928);str = "0";
        } }else {{
            __CLR4_4_1bblbbllb90p7wm.R.inc(14929);str = numerator + " / " + denominator;
        }
        }}__CLR4_4_1bblbbllb90p7wm.R.inc(14930);return str;
    }finally{__CLR4_4_1bblbbllb90p7wm.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FractionField getField() {try{__CLR4_4_1bblbbllb90p7wm.R.inc(14931);
        __CLR4_4_1bblbbllb90p7wm.R.inc(14932);return FractionField.getInstance();
    }finally{__CLR4_4_1bblbbllb90p7wm.R.flushNeeded();}}

}
