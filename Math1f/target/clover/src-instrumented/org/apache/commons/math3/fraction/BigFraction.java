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
import java.math.BigDecimal;
import java.math.BigInteger;

import org.apache.commons.math3.FieldElement;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.ZeroException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.ArithmeticUtils;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathUtils;

/**
 * Representation of a rational number without any overflow. This class is
 * immutable.
 *
 * @version $Id$
 * @since 2.0
 */
public class BigFraction
    extends Number
    implements FieldElement<BigFraction>, Comparable<BigFraction>, Serializable {public static class __CLR4_4_1az8az8lb90p7vd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,14571,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** A fraction representing "2 / 1". */
    public static final BigFraction TWO = new BigFraction(2);

    /** A fraction representing "1". */
    public static final BigFraction ONE = new BigFraction(1);

    /** A fraction representing "0". */
    public static final BigFraction ZERO = new BigFraction(0);

    /** A fraction representing "-1 / 1". */
    public static final BigFraction MINUS_ONE = new BigFraction(-1);

    /** A fraction representing "4/5". */
    public static final BigFraction FOUR_FIFTHS = new BigFraction(4, 5);

    /** A fraction representing "1/5". */
    public static final BigFraction ONE_FIFTH = new BigFraction(1, 5);

    /** A fraction representing "1/2". */
    public static final BigFraction ONE_HALF = new BigFraction(1, 2);

    /** A fraction representing "1/4". */
    public static final BigFraction ONE_QUARTER = new BigFraction(1, 4);

    /** A fraction representing "1/3". */
    public static final BigFraction ONE_THIRD = new BigFraction(1, 3);

    /** A fraction representing "3/5". */
    public static final BigFraction THREE_FIFTHS = new BigFraction(3, 5);

    /** A fraction representing "3/4". */
    public static final BigFraction THREE_QUARTERS = new BigFraction(3, 4);

    /** A fraction representing "2/5". */
    public static final BigFraction TWO_FIFTHS = new BigFraction(2, 5);

    /** A fraction representing "2/4". */
    public static final BigFraction TWO_QUARTERS = new BigFraction(2, 4);

    /** A fraction representing "2/3". */
    public static final BigFraction TWO_THIRDS = new BigFraction(2, 3);

    /** Serializable version identifier. */
    private static final long serialVersionUID = -5630213147331578515L;

    /** <code>BigInteger</code> representation of 100. */
    private static final BigInteger ONE_HUNDRED = BigInteger.valueOf(100);

    /** The numerator. */
    private final BigInteger numerator;

    /** The denominator. */
    private final BigInteger denominator;

    /**
     * <p>
     * Create a {@link BigFraction} equivalent to the passed <tt>BigInteger</tt>, ie
     * "num / 1".
     * </p>
     *
     * @param num
     *            the numerator.
     */
    public BigFraction(final BigInteger num) {
        this(num, BigInteger.ONE);__CLR4_4_1az8az8lb90p7vd.R.inc(14229);try{__CLR4_4_1az8az8lb90p7vd.R.inc(14228);
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * Create a {@link BigFraction} given the numerator and denominator as
     * {@code BigInteger}. The {@link BigFraction} is reduced to lowest terms.
     *
     * @param num the numerator, must not be {@code null}.
     * @param den the denominator, must not be {@code null}.
     * @throws ZeroException if the denominator is zero.
     * @throws NullArgumentException if either of the arguments is null
     */
    public BigFraction(BigInteger num, BigInteger den) {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14230);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14231);MathUtils.checkNotNull(num, LocalizedFormats.NUMERATOR);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14232);MathUtils.checkNotNull(den, LocalizedFormats.DENOMINATOR);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14233);if ((((BigInteger.ZERO.equals(den))&&(__CLR4_4_1az8az8lb90p7vd.R.iget(14234)!=0|true))||(__CLR4_4_1az8az8lb90p7vd.R.iget(14235)==0&false))) {{
            __CLR4_4_1az8az8lb90p7vd.R.inc(14236);throw new ZeroException(LocalizedFormats.ZERO_DENOMINATOR);
        }
        }__CLR4_4_1az8az8lb90p7vd.R.inc(14237);if ((((BigInteger.ZERO.equals(num))&&(__CLR4_4_1az8az8lb90p7vd.R.iget(14238)!=0|true))||(__CLR4_4_1az8az8lb90p7vd.R.iget(14239)==0&false))) {{
            __CLR4_4_1az8az8lb90p7vd.R.inc(14240);numerator   = BigInteger.ZERO;
            __CLR4_4_1az8az8lb90p7vd.R.inc(14241);denominator = BigInteger.ONE;
        } }else {{

            // reduce numerator and denominator by greatest common denominator
            __CLR4_4_1az8az8lb90p7vd.R.inc(14242);final BigInteger gcd = num.gcd(den);
            __CLR4_4_1az8az8lb90p7vd.R.inc(14243);if ((((BigInteger.ONE.compareTo(gcd) < 0)&&(__CLR4_4_1az8az8lb90p7vd.R.iget(14244)!=0|true))||(__CLR4_4_1az8az8lb90p7vd.R.iget(14245)==0&false))) {{
                __CLR4_4_1az8az8lb90p7vd.R.inc(14246);num = num.divide(gcd);
                __CLR4_4_1az8az8lb90p7vd.R.inc(14247);den = den.divide(gcd);
            }

            // move sign to numerator
            }__CLR4_4_1az8az8lb90p7vd.R.inc(14248);if ((((BigInteger.ZERO.compareTo(den) > 0)&&(__CLR4_4_1az8az8lb90p7vd.R.iget(14249)!=0|true))||(__CLR4_4_1az8az8lb90p7vd.R.iget(14250)==0&false))) {{
                __CLR4_4_1az8az8lb90p7vd.R.inc(14251);num = num.negate();
                __CLR4_4_1az8az8lb90p7vd.R.inc(14252);den = den.negate();
            }

            // store the values in the final fields
            }__CLR4_4_1az8az8lb90p7vd.R.inc(14253);numerator   = num;
            __CLR4_4_1az8az8lb90p7vd.R.inc(14254);denominator = den;

        }
    }}finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * Create a fraction given the double value.
     * <p>
     * This constructor behaves <em>differently</em> from
     * {@link #BigFraction(double, double, int)}. It converts the double value
     * exactly, considering its internal bits representation. This works for all
     * values except NaN and infinities and does not requires any loop or
     * convergence threshold.
     * </p>
     * <p>
     * Since this conversion is exact and since double numbers are sometimes
     * approximated, the fraction created may seem strange in some cases. For example,
     * calling <code>new BigFraction(1.0 / 3.0)</code> does <em>not</em> create
     * the fraction 1/3, but the fraction 6004799503160661 / 18014398509481984
     * because the double number passed to the constructor is not exactly 1/3
     * (this number cannot be stored exactly in IEEE754).
     * </p>
     * @see #BigFraction(double, double, int)
     * @param value the double value to convert to a fraction.
     * @exception MathIllegalArgumentException if value is NaN or infinite
     */
    public BigFraction(final double value) throws MathIllegalArgumentException {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14255);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14256);if ((((Double.isNaN(value))&&(__CLR4_4_1az8az8lb90p7vd.R.iget(14257)!=0|true))||(__CLR4_4_1az8az8lb90p7vd.R.iget(14258)==0&false))) {{
            __CLR4_4_1az8az8lb90p7vd.R.inc(14259);throw new MathIllegalArgumentException(LocalizedFormats.NAN_VALUE_CONVERSION);
        }
        }__CLR4_4_1az8az8lb90p7vd.R.inc(14260);if ((((Double.isInfinite(value))&&(__CLR4_4_1az8az8lb90p7vd.R.iget(14261)!=0|true))||(__CLR4_4_1az8az8lb90p7vd.R.iget(14262)==0&false))) {{
            __CLR4_4_1az8az8lb90p7vd.R.inc(14263);throw new MathIllegalArgumentException(LocalizedFormats.INFINITE_VALUE_CONVERSION);
        }

        // compute m and k such that value = m * 2^k
        }__CLR4_4_1az8az8lb90p7vd.R.inc(14264);final long bits     = Double.doubleToLongBits(value);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14265);final long sign     = bits & 0x8000000000000000L;
        __CLR4_4_1az8az8lb90p7vd.R.inc(14266);final long exponent = bits & 0x7ff0000000000000L;
        __CLR4_4_1az8az8lb90p7vd.R.inc(14267);long m              = bits & 0x000fffffffffffffL;
        __CLR4_4_1az8az8lb90p7vd.R.inc(14268);if ((((exponent != 0)&&(__CLR4_4_1az8az8lb90p7vd.R.iget(14269)!=0|true))||(__CLR4_4_1az8az8lb90p7vd.R.iget(14270)==0&false))) {{
            // this was a normalized number, add the implicit most significant bit
            __CLR4_4_1az8az8lb90p7vd.R.inc(14271);m |= 0x0010000000000000L;
        }
        }__CLR4_4_1az8az8lb90p7vd.R.inc(14272);if ((((sign != 0)&&(__CLR4_4_1az8az8lb90p7vd.R.iget(14273)!=0|true))||(__CLR4_4_1az8az8lb90p7vd.R.iget(14274)==0&false))) {{
            __CLR4_4_1az8az8lb90p7vd.R.inc(14275);m = -m;
        }
        }__CLR4_4_1az8az8lb90p7vd.R.inc(14276);int k = ((int) (exponent >> 52)) - 1075;
        __CLR4_4_1az8az8lb90p7vd.R.inc(14277);while ((((((m & 0x001ffffffffffffeL) != 0) && ((m & 0x1) == 0))&&(__CLR4_4_1az8az8lb90p7vd.R.iget(14278)!=0|true))||(__CLR4_4_1az8az8lb90p7vd.R.iget(14279)==0&false))) {{
            __CLR4_4_1az8az8lb90p7vd.R.inc(14280);m = m >> 1;
            __CLR4_4_1az8az8lb90p7vd.R.inc(14281);++k;
        }

        }__CLR4_4_1az8az8lb90p7vd.R.inc(14282);if ((((k < 0)&&(__CLR4_4_1az8az8lb90p7vd.R.iget(14283)!=0|true))||(__CLR4_4_1az8az8lb90p7vd.R.iget(14284)==0&false))) {{
            __CLR4_4_1az8az8lb90p7vd.R.inc(14285);numerator   = BigInteger.valueOf(m);
            __CLR4_4_1az8az8lb90p7vd.R.inc(14286);denominator = BigInteger.ZERO.flipBit(-k);
        } }else {{
            __CLR4_4_1az8az8lb90p7vd.R.inc(14287);numerator   = BigInteger.valueOf(m).multiply(BigInteger.ZERO.flipBit(k));
            __CLR4_4_1az8az8lb90p7vd.R.inc(14288);denominator = BigInteger.ONE;
        }

    }}finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * Create a fraction given the double value and maximum error allowed.
     * <p>
     * References:
     * <ul>
     * <li><a href="http://mathworld.wolfram.com/ContinuedFraction.html">
     * Continued Fraction</a> equations (11) and (22)-(26)</li>
     * </ul>
     * </p>
     *
     * @param value
     *            the double value to convert to a fraction.
     * @param epsilon
     *            maximum error allowed. The resulting fraction is within
     *            <code>epsilon</code> of <code>value</code>, in absolute terms.
     * @param maxIterations
     *            maximum number of convergents.
     * @throws FractionConversionException
     *             if the continued fraction failed to converge.
     * @see #BigFraction(double)
     */
    public BigFraction(final double value, final double epsilon,
                       final int maxIterations)
        throws FractionConversionException {
        this(value, epsilon, Integer.MAX_VALUE, maxIterations);__CLR4_4_1az8az8lb90p7vd.R.inc(14290);try{__CLR4_4_1az8az8lb90p7vd.R.inc(14289);
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * Create a fraction given the double value and either the maximum error
     * allowed or the maximum number of denominator digits.
     * <p>
     *
     * NOTE: This constructor is called with EITHER - a valid epsilon value and
     * the maxDenominator set to Integer.MAX_VALUE (that way the maxDenominator
     * has no effect). OR - a valid maxDenominator value and the epsilon value
     * set to zero (that way epsilon only has effect if there is an exact match
     * before the maxDenominator value is reached).
     * </p>
     * <p>
     *
     * It has been done this way so that the same code can be (re)used for both
     * scenarios. However this could be confusing to users if it were part of
     * the public API and this constructor should therefore remain PRIVATE.
     * </p>
     *
     * See JIRA issue ticket MATH-181 for more details:
     *
     * https://issues.apache.org/jira/browse/MATH-181
     *
     * @param value
     *            the double value to convert to a fraction.
     * @param epsilon
     *            maximum error allowed. The resulting fraction is within
     *            <code>epsilon</code> of <code>value</code>, in absolute terms.
     * @param maxDenominator
     *            maximum denominator value allowed.
     * @param maxIterations
     *            maximum number of convergents.
     * @throws FractionConversionException
     *             if the continued fraction failed to converge.
     */
    private BigFraction(final double value, final double epsilon,
                        final int maxDenominator, int maxIterations)
        throws FractionConversionException {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14291);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14292);long overflow = Integer.MAX_VALUE;
        __CLR4_4_1az8az8lb90p7vd.R.inc(14293);double r0 = value;
        __CLR4_4_1az8az8lb90p7vd.R.inc(14294);long a0 = (long) FastMath.floor(r0);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14295);if ((((a0 > overflow)&&(__CLR4_4_1az8az8lb90p7vd.R.iget(14296)!=0|true))||(__CLR4_4_1az8az8lb90p7vd.R.iget(14297)==0&false))) {{
            __CLR4_4_1az8az8lb90p7vd.R.inc(14298);throw new FractionConversionException(value, a0, 1l);
        }

        // check for (almost) integer arguments, which should not go
        // to iterations.
        }__CLR4_4_1az8az8lb90p7vd.R.inc(14299);if ((((FastMath.abs(a0 - value) < epsilon)&&(__CLR4_4_1az8az8lb90p7vd.R.iget(14300)!=0|true))||(__CLR4_4_1az8az8lb90p7vd.R.iget(14301)==0&false))) {{
            __CLR4_4_1az8az8lb90p7vd.R.inc(14302);numerator = BigInteger.valueOf(a0);
            __CLR4_4_1az8az8lb90p7vd.R.inc(14303);denominator = BigInteger.ONE;
            __CLR4_4_1az8az8lb90p7vd.R.inc(14304);return;
        }

        }__CLR4_4_1az8az8lb90p7vd.R.inc(14305);long p0 = 1;
        __CLR4_4_1az8az8lb90p7vd.R.inc(14306);long q0 = 0;
        __CLR4_4_1az8az8lb90p7vd.R.inc(14307);long p1 = a0;
        __CLR4_4_1az8az8lb90p7vd.R.inc(14308);long q1 = 1;

        __CLR4_4_1az8az8lb90p7vd.R.inc(14309);long p2 = 0;
        __CLR4_4_1az8az8lb90p7vd.R.inc(14310);long q2 = 1;

        __CLR4_4_1az8az8lb90p7vd.R.inc(14311);int n = 0;
        __CLR4_4_1az8az8lb90p7vd.R.inc(14312);boolean stop = false;
        __CLR4_4_1az8az8lb90p7vd.R.inc(14313);do {{
            __CLR4_4_1az8az8lb90p7vd.R.inc(14314);++n;
            __CLR4_4_1az8az8lb90p7vd.R.inc(14315);final double r1 = 1.0 / (r0 - a0);
            __CLR4_4_1az8az8lb90p7vd.R.inc(14316);final long a1 = (long) FastMath.floor(r1);
            __CLR4_4_1az8az8lb90p7vd.R.inc(14317);p2 = (a1 * p1) + p0;
            __CLR4_4_1az8az8lb90p7vd.R.inc(14318);q2 = (a1 * q1) + q0;
            __CLR4_4_1az8az8lb90p7vd.R.inc(14319);if (((((p2 > overflow) || (q2 > overflow))&&(__CLR4_4_1az8az8lb90p7vd.R.iget(14320)!=0|true))||(__CLR4_4_1az8az8lb90p7vd.R.iget(14321)==0&false))) {{
                // in maxDenominator mode, if the last fraction was very close to the actual value
                // q2 may overflow in the next iteration; in this case return the last one.
                __CLR4_4_1az8az8lb90p7vd.R.inc(14322);if ((((epsilon == 0.0 && FastMath.abs(q1) < maxDenominator)&&(__CLR4_4_1az8az8lb90p7vd.R.iget(14323)!=0|true))||(__CLR4_4_1az8az8lb90p7vd.R.iget(14324)==0&false))) {{
                    __CLR4_4_1az8az8lb90p7vd.R.inc(14325);break;
                }
                }__CLR4_4_1az8az8lb90p7vd.R.inc(14326);throw new FractionConversionException(value, p2, q2);
            }

            }__CLR4_4_1az8az8lb90p7vd.R.inc(14327);final double convergent = (double) p2 / (double) q2;
            __CLR4_4_1az8az8lb90p7vd.R.inc(14328);if (((((n < maxIterations) &&
                (FastMath.abs(convergent - value) > epsilon) &&
                (q2 < maxDenominator))&&(__CLR4_4_1az8az8lb90p7vd.R.iget(14329)!=0|true))||(__CLR4_4_1az8az8lb90p7vd.R.iget(14330)==0&false))) {{
                __CLR4_4_1az8az8lb90p7vd.R.inc(14331);p0 = p1;
                __CLR4_4_1az8az8lb90p7vd.R.inc(14332);p1 = p2;
                __CLR4_4_1az8az8lb90p7vd.R.inc(14333);q0 = q1;
                __CLR4_4_1az8az8lb90p7vd.R.inc(14334);q1 = q2;
                __CLR4_4_1az8az8lb90p7vd.R.inc(14335);a0 = a1;
                __CLR4_4_1az8az8lb90p7vd.R.inc(14336);r0 = r1;
            } }else {{
                __CLR4_4_1az8az8lb90p7vd.R.inc(14337);stop = true;
            }
        }} }while ((((!stop)&&(__CLR4_4_1az8az8lb90p7vd.R.iget(14338)!=0|true))||(__CLR4_4_1az8az8lb90p7vd.R.iget(14339)==0&false)));

        __CLR4_4_1az8az8lb90p7vd.R.inc(14340);if ((((n >= maxIterations)&&(__CLR4_4_1az8az8lb90p7vd.R.iget(14341)!=0|true))||(__CLR4_4_1az8az8lb90p7vd.R.iget(14342)==0&false))) {{
            __CLR4_4_1az8az8lb90p7vd.R.inc(14343);throw new FractionConversionException(value, maxIterations);
        }

        }__CLR4_4_1az8az8lb90p7vd.R.inc(14344);if ((((q2 < maxDenominator)&&(__CLR4_4_1az8az8lb90p7vd.R.iget(14345)!=0|true))||(__CLR4_4_1az8az8lb90p7vd.R.iget(14346)==0&false))) {{
            __CLR4_4_1az8az8lb90p7vd.R.inc(14347);numerator   = BigInteger.valueOf(p2);
            __CLR4_4_1az8az8lb90p7vd.R.inc(14348);denominator = BigInteger.valueOf(q2);
        } }else {{
            __CLR4_4_1az8az8lb90p7vd.R.inc(14349);numerator   = BigInteger.valueOf(p1);
            __CLR4_4_1az8az8lb90p7vd.R.inc(14350);denominator = BigInteger.valueOf(q1);
        }
    }}finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * Create a fraction given the double value and maximum denominator.
     * <p>
     * References:
     * <ul>
     * <li><a href="http://mathworld.wolfram.com/ContinuedFraction.html">
     * Continued Fraction</a> equations (11) and (22)-(26)</li>
     * </ul>
     * </p>
     *
     * @param value
     *            the double value to convert to a fraction.
     * @param maxDenominator
     *            The maximum allowed value for denominator.
     * @throws FractionConversionException
     *             if the continued fraction failed to converge.
     */
    public BigFraction(final double value, final int maxDenominator)
        throws FractionConversionException {
        this(value, 0, maxDenominator, 100);__CLR4_4_1az8az8lb90p7vd.R.inc(14352);try{__CLR4_4_1az8az8lb90p7vd.R.inc(14351);
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Create a {@link BigFraction} equivalent to the passed <tt>int</tt>, ie
     * "num / 1".
     * </p>
     *
     * @param num
     *            the numerator.
     */
    public BigFraction(final int num) {
        this(BigInteger.valueOf(num), BigInteger.ONE);__CLR4_4_1az8az8lb90p7vd.R.inc(14354);try{__CLR4_4_1az8az8lb90p7vd.R.inc(14353);
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Create a {@link BigFraction} given the numerator and denominator as simple
     * <tt>int</tt>. The {@link BigFraction} is reduced to lowest terms.
     * </p>
     *
     * @param num
     *            the numerator.
     * @param den
     *            the denominator.
     */
    public BigFraction(final int num, final int den) {
        this(BigInteger.valueOf(num), BigInteger.valueOf(den));__CLR4_4_1az8az8lb90p7vd.R.inc(14356);try{__CLR4_4_1az8az8lb90p7vd.R.inc(14355);
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Create a {@link BigFraction} equivalent to the passed long, ie "num / 1".
     * </p>
     *
     * @param num
     *            the numerator.
     */
    public BigFraction(final long num) {
        this(BigInteger.valueOf(num), BigInteger.ONE);__CLR4_4_1az8az8lb90p7vd.R.inc(14358);try{__CLR4_4_1az8az8lb90p7vd.R.inc(14357);
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Create a {@link BigFraction} given the numerator and denominator as simple
     * <tt>long</tt>. The {@link BigFraction} is reduced to lowest terms.
     * </p>
     *
     * @param num
     *            the numerator.
     * @param den
     *            the denominator.
     */
    public BigFraction(final long num, final long den) {
        this(BigInteger.valueOf(num), BigInteger.valueOf(den));__CLR4_4_1az8az8lb90p7vd.R.inc(14360);try{__CLR4_4_1az8az8lb90p7vd.R.inc(14359);
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Creates a <code>BigFraction</code> instance with the 2 parts of a fraction
     * Y/Z.
     * </p>
     *
     * <p>
     * Any negative signs are resolved to be on the numerator.
     * </p>
     *
     * @param numerator
     *            the numerator, for example the three in 'three sevenths'.
     * @param denominator
     *            the denominator, for example the seven in 'three sevenths'.
     * @return a new fraction instance, with the numerator and denominator
     *         reduced.
     * @throws ArithmeticException
     *             if the denominator is <code>zero</code>.
     */
    public static BigFraction getReducedFraction(final int numerator,
                                                 final int denominator) {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14361);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14362);if ((((numerator == 0)&&(__CLR4_4_1az8az8lb90p7vd.R.iget(14363)!=0|true))||(__CLR4_4_1az8az8lb90p7vd.R.iget(14364)==0&false))) {{
            __CLR4_4_1az8az8lb90p7vd.R.inc(14365);return ZERO; // normalize zero.
        }

        }__CLR4_4_1az8az8lb90p7vd.R.inc(14366);return new BigFraction(numerator, denominator);
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Returns the absolute value of this {@link BigFraction}.
     * </p>
     *
     * @return the absolute value as a {@link BigFraction}.
     */
    public BigFraction abs() {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14367);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14368);return ((((BigInteger.ZERO.compareTo(numerator) <= 0) )&&(__CLR4_4_1az8az8lb90p7vd.R.iget(14369)!=0|true))||(__CLR4_4_1az8az8lb90p7vd.R.iget(14370)==0&false))? this : negate();
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Adds the value of this fraction to the passed {@link BigInteger},
     * returning the result in reduced form.
     * </p>
     *
     * @param bg
     *            the {@link BigInteger} to add, must'nt be <code>null</code>.
     * @return a <code>BigFraction</code> instance with the resulting values.
     * @throws NullArgumentException
     *             if the {@link BigInteger} is <code>null</code>.
     */
    public BigFraction add(final BigInteger bg) throws NullArgumentException {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14371);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14372);MathUtils.checkNotNull(bg);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14373);return new BigFraction(numerator.add(denominator.multiply(bg)), denominator);
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Adds the value of this fraction to the passed <tt>integer</tt>, returning
     * the result in reduced form.
     * </p>
     *
     * @param i
     *            the <tt>integer</tt> to add.
     * @return a <code>BigFraction</code> instance with the resulting values.
     */
    public BigFraction add(final int i) {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14374);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14375);return add(BigInteger.valueOf(i));
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Adds the value of this fraction to the passed <tt>long</tt>, returning
     * the result in reduced form.
     * </p>
     *
     * @param l
     *            the <tt>long</tt> to add.
     * @return a <code>BigFraction</code> instance with the resulting values.
     */
    public BigFraction add(final long l) {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14376);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14377);return add(BigInteger.valueOf(l));
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Adds the value of this fraction to another, returning the result in
     * reduced form.
     * </p>
     *
     * @param fraction
     *            the {@link BigFraction} to add, must not be <code>null</code>.
     * @return a {@link BigFraction} instance with the resulting values.
     * @throws NullArgumentException if the {@link BigFraction} is {@code null}.
     */
    public BigFraction add(final BigFraction fraction) {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14378);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14379);if ((((fraction == null)&&(__CLR4_4_1az8az8lb90p7vd.R.iget(14380)!=0|true))||(__CLR4_4_1az8az8lb90p7vd.R.iget(14381)==0&false))) {{
            __CLR4_4_1az8az8lb90p7vd.R.inc(14382);throw new NullArgumentException(LocalizedFormats.FRACTION);
        }
        }__CLR4_4_1az8az8lb90p7vd.R.inc(14383);if ((((ZERO.equals(fraction))&&(__CLR4_4_1az8az8lb90p7vd.R.iget(14384)!=0|true))||(__CLR4_4_1az8az8lb90p7vd.R.iget(14385)==0&false))) {{
            __CLR4_4_1az8az8lb90p7vd.R.inc(14386);return this;
        }

        }__CLR4_4_1az8az8lb90p7vd.R.inc(14387);BigInteger num = null;
        __CLR4_4_1az8az8lb90p7vd.R.inc(14388);BigInteger den = null;

        __CLR4_4_1az8az8lb90p7vd.R.inc(14389);if ((((denominator.equals(fraction.denominator))&&(__CLR4_4_1az8az8lb90p7vd.R.iget(14390)!=0|true))||(__CLR4_4_1az8az8lb90p7vd.R.iget(14391)==0&false))) {{
            __CLR4_4_1az8az8lb90p7vd.R.inc(14392);num = numerator.add(fraction.numerator);
            __CLR4_4_1az8az8lb90p7vd.R.inc(14393);den = denominator;
        } }else {{
            __CLR4_4_1az8az8lb90p7vd.R.inc(14394);num = (numerator.multiply(fraction.denominator)).add((fraction.numerator).multiply(denominator));
            __CLR4_4_1az8az8lb90p7vd.R.inc(14395);den = denominator.multiply(fraction.denominator);
        }
        }__CLR4_4_1az8az8lb90p7vd.R.inc(14396);return new BigFraction(num, den);

    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Gets the fraction as a <code>BigDecimal</code>. This calculates the
     * fraction as the numerator divided by denominator.
     * </p>
     *
     * @return the fraction as a <code>BigDecimal</code>.
     * @throws ArithmeticException
     *             if the exact quotient does not have a terminating decimal
     *             expansion.
     * @see BigDecimal
     */
    public BigDecimal bigDecimalValue() {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14397);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14398);return new BigDecimal(numerator).divide(new BigDecimal(denominator));
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Gets the fraction as a <code>BigDecimal</code> following the passed
     * rounding mode. This calculates the fraction as the numerator divided by
     * denominator.
     * </p>
     *
     * @param roundingMode
     *            rounding mode to apply. see {@link BigDecimal} constants.
     * @return the fraction as a <code>BigDecimal</code>.
     * @throws IllegalArgumentException
     *             if <tt>roundingMode</tt> does not represent a valid rounding
     *             mode.
     * @see BigDecimal
     */
    public BigDecimal bigDecimalValue(final int roundingMode) {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14399);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14400);return new BigDecimal(numerator).divide(new BigDecimal(denominator), roundingMode);
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Gets the fraction as a <code>BigDecimal</code> following the passed scale
     * and rounding mode. This calculates the fraction as the numerator divided
     * by denominator.
     * </p>
     *
     * @param scale
     *            scale of the <code>BigDecimal</code> quotient to be returned.
     *            see {@link BigDecimal} for more information.
     * @param roundingMode
     *            rounding mode to apply. see {@link BigDecimal} constants.
     * @return the fraction as a <code>BigDecimal</code>.
     * @see BigDecimal
     */
    public BigDecimal bigDecimalValue(final int scale, final int roundingMode) {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14401);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14402);return new BigDecimal(numerator).divide(new BigDecimal(denominator), scale, roundingMode);
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Compares this object to another based on size.
     * </p>
     *
     * @param object
     *            the object to compare to, must not be <code>null</code>.
     * @return -1 if this is less than <tt>object</tt>, +1 if this is greater
     *         than <tt>object</tt>, 0 if they are equal.
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    public int compareTo(final BigFraction object) {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14403);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14404);BigInteger nOd = numerator.multiply(object.denominator);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14405);BigInteger dOn = denominator.multiply(object.numerator);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14406);return nOd.compareTo(dOn);
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Divide the value of this fraction by the passed {@code BigInteger},
     * ie {@code this * 1 / bg}, returning the result in reduced form.
     * </p>
     *
     * @param bg the {@code BigInteger} to divide by, must not be {@code null}
     * @return a {@link BigFraction} instance with the resulting values
     * @throws NullArgumentException if the {@code BigInteger} is {@code null}
     * @throws MathArithmeticException if the fraction to divide by is zero
     */
    public BigFraction divide(final BigInteger bg) {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14407);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14408);if ((((bg == null)&&(__CLR4_4_1az8az8lb90p7vd.R.iget(14409)!=0|true))||(__CLR4_4_1az8az8lb90p7vd.R.iget(14410)==0&false))) {{
            __CLR4_4_1az8az8lb90p7vd.R.inc(14411);throw new NullArgumentException(LocalizedFormats.FRACTION);
        }
        }__CLR4_4_1az8az8lb90p7vd.R.inc(14412);if ((((BigInteger.ZERO.equals(bg))&&(__CLR4_4_1az8az8lb90p7vd.R.iget(14413)!=0|true))||(__CLR4_4_1az8az8lb90p7vd.R.iget(14414)==0&false))) {{
            __CLR4_4_1az8az8lb90p7vd.R.inc(14415);throw new MathArithmeticException(LocalizedFormats.ZERO_DENOMINATOR);
        }
        }__CLR4_4_1az8az8lb90p7vd.R.inc(14416);return new BigFraction(numerator, denominator.multiply(bg));
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Divide the value of this fraction by the passed {@code int}, ie
     * {@code this * 1 / i}, returning the result in reduced form.
     * </p>
     *
     * @param i the {@code int} to divide by
     * @return a {@link BigFraction} instance with the resulting values
     * @throws MathArithmeticException if the fraction to divide by is zero
     */
    public BigFraction divide(final int i) {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14417);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14418);return divide(BigInteger.valueOf(i));
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Divide the value of this fraction by the passed {@code long}, ie
     * {@code this * 1 / l}, returning the result in reduced form.
     * </p>
     *
     * @param l the {@code long} to divide by
     * @return a {@link BigFraction} instance with the resulting values
     * @throws MathArithmeticException if the fraction to divide by is zero
     */
    public BigFraction divide(final long l) {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14419);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14420);return divide(BigInteger.valueOf(l));
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Divide the value of this fraction by another, returning the result in
     * reduced form.
     * </p>
     *
     * @param fraction Fraction to divide by, must not be {@code null}.
     * @return a {@link BigFraction} instance with the resulting values.
     * @throws NullArgumentException if the {@code fraction} is {@code null}.
     * @throws MathArithmeticException if the fraction to divide by is zero
     */
    public BigFraction divide(final BigFraction fraction) {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14421);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14422);if ((((fraction == null)&&(__CLR4_4_1az8az8lb90p7vd.R.iget(14423)!=0|true))||(__CLR4_4_1az8az8lb90p7vd.R.iget(14424)==0&false))) {{
            __CLR4_4_1az8az8lb90p7vd.R.inc(14425);throw new NullArgumentException(LocalizedFormats.FRACTION);
        }
        }__CLR4_4_1az8az8lb90p7vd.R.inc(14426);if ((((BigInteger.ZERO.equals(fraction.numerator))&&(__CLR4_4_1az8az8lb90p7vd.R.iget(14427)!=0|true))||(__CLR4_4_1az8az8lb90p7vd.R.iget(14428)==0&false))) {{
            __CLR4_4_1az8az8lb90p7vd.R.inc(14429);throw new MathArithmeticException(LocalizedFormats.ZERO_DENOMINATOR);
        }

        }__CLR4_4_1az8az8lb90p7vd.R.inc(14430);return multiply(fraction.reciprocal());
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Gets the fraction as a <tt>double</tt>. This calculates the fraction as
     * the numerator divided by denominator.
     * </p>
     *
     * @return the fraction as a <tt>double</tt>
     * @see java.lang.Number#doubleValue()
     */
    @Override
    public double doubleValue() {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14431);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14432);double result = numerator.doubleValue() / denominator.doubleValue();
        __CLR4_4_1az8az8lb90p7vd.R.inc(14433);if ((((Double.isNaN(result))&&(__CLR4_4_1az8az8lb90p7vd.R.iget(14434)!=0|true))||(__CLR4_4_1az8az8lb90p7vd.R.iget(14435)==0&false))) {{
            // Numerator and/or denominator must be out of range:
            // Calculate how far to shift them to put them in range.
            __CLR4_4_1az8az8lb90p7vd.R.inc(14436);int shift = Math.max(numerator.bitLength(),
                                 denominator.bitLength()) - FastMath.getExponent(Double.MAX_VALUE);
            __CLR4_4_1az8az8lb90p7vd.R.inc(14437);result = numerator.shiftRight(shift).doubleValue() /
                denominator.shiftRight(shift).doubleValue();
        }
        }__CLR4_4_1az8az8lb90p7vd.R.inc(14438);return result;
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Test for the equality of two fractions. If the lowest term numerator and
     * denominators are the same for both fractions, the two fractions are
     * considered to be equal.
     * </p>
     *
     * @param other
     *            fraction to test for equality to this fraction, can be
     *            <code>null</code>.
     * @return true if two fractions are equal, false if object is
     *         <code>null</code>, not an instance of {@link BigFraction}, or not
     *         equal to this fraction instance.
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(final Object other) {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14439);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14440);boolean ret = false;

        __CLR4_4_1az8az8lb90p7vd.R.inc(14441);if ((((this == other)&&(__CLR4_4_1az8az8lb90p7vd.R.iget(14442)!=0|true))||(__CLR4_4_1az8az8lb90p7vd.R.iget(14443)==0&false))) {{
            __CLR4_4_1az8az8lb90p7vd.R.inc(14444);ret = true;
        } }else {__CLR4_4_1az8az8lb90p7vd.R.inc(14445);if ((((other instanceof BigFraction)&&(__CLR4_4_1az8az8lb90p7vd.R.iget(14446)!=0|true))||(__CLR4_4_1az8az8lb90p7vd.R.iget(14447)==0&false))) {{
            __CLR4_4_1az8az8lb90p7vd.R.inc(14448);BigFraction rhs = ((BigFraction) other).reduce();
            __CLR4_4_1az8az8lb90p7vd.R.inc(14449);BigFraction thisOne = this.reduce();
            __CLR4_4_1az8az8lb90p7vd.R.inc(14450);ret = thisOne.numerator.equals(rhs.numerator) && thisOne.denominator.equals(rhs.denominator);
        }

        }}__CLR4_4_1az8az8lb90p7vd.R.inc(14451);return ret;
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Gets the fraction as a <tt>float</tt>. This calculates the fraction as
     * the numerator divided by denominator.
     * </p>
     *
     * @return the fraction as a <tt>float</tt>.
     * @see java.lang.Number#floatValue()
     */
    @Override
    public float floatValue() {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14452);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14453);float result = numerator.floatValue() / denominator.floatValue();
        __CLR4_4_1az8az8lb90p7vd.R.inc(14454);if ((((Double.isNaN(result))&&(__CLR4_4_1az8az8lb90p7vd.R.iget(14455)!=0|true))||(__CLR4_4_1az8az8lb90p7vd.R.iget(14456)==0&false))) {{
            // Numerator and/or denominator must be out of range:
            // Calculate how far to shift them to put them in range.
            __CLR4_4_1az8az8lb90p7vd.R.inc(14457);int shift = Math.max(numerator.bitLength(),
                                 denominator.bitLength()) - FastMath.getExponent(Float.MAX_VALUE);
            __CLR4_4_1az8az8lb90p7vd.R.inc(14458);result = numerator.shiftRight(shift).floatValue() /
                denominator.shiftRight(shift).floatValue();
        }
        }__CLR4_4_1az8az8lb90p7vd.R.inc(14459);return result;
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Access the denominator as a <code>BigInteger</code>.
     * </p>
     *
     * @return the denominator as a <code>BigInteger</code>.
     */
    public BigInteger getDenominator() {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14460);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14461);return denominator;
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Access the denominator as a <tt>int</tt>.
     * </p>
     *
     * @return the denominator as a <tt>int</tt>.
     */
    public int getDenominatorAsInt() {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14462);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14463);return denominator.intValue();
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Access the denominator as a <tt>long</tt>.
     * </p>
     *
     * @return the denominator as a <tt>long</tt>.
     */
    public long getDenominatorAsLong() {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14464);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14465);return denominator.longValue();
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Access the numerator as a <code>BigInteger</code>.
     * </p>
     *
     * @return the numerator as a <code>BigInteger</code>.
     */
    public BigInteger getNumerator() {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14466);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14467);return numerator;
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Access the numerator as a <tt>int</tt>.
     * </p>
     *
     * @return the numerator as a <tt>int</tt>.
     */
    public int getNumeratorAsInt() {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14468);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14469);return numerator.intValue();
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Access the numerator as a <tt>long</tt>.
     * </p>
     *
     * @return the numerator as a <tt>long</tt>.
     */
    public long getNumeratorAsLong() {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14470);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14471);return numerator.longValue();
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Gets a hashCode for the fraction.
     * </p>
     *
     * @return a hash code value for this object.
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14472);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14473);return 37 * (37 * 17 + numerator.hashCode()) + denominator.hashCode();
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Gets the fraction as an <tt>int</tt>. This returns the whole number part
     * of the fraction.
     * </p>
     *
     * @return the whole number fraction part.
     * @see java.lang.Number#intValue()
     */
    @Override
    public int intValue() {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14474);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14475);return numerator.divide(denominator).intValue();
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Gets the fraction as a <tt>long</tt>. This returns the whole number part
     * of the fraction.
     * </p>
     *
     * @return the whole number fraction part.
     * @see java.lang.Number#longValue()
     */
    @Override
    public long longValue() {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14476);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14477);return numerator.divide(denominator).longValue();
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Multiplies the value of this fraction by the passed
     * <code>BigInteger</code>, returning the result in reduced form.
     * </p>
     *
     * @param bg the {@code BigInteger} to multiply by.
     * @return a {@code BigFraction} instance with the resulting values.
     * @throws NullArgumentException if {@code bg} is {@code null}.
     */
    public BigFraction multiply(final BigInteger bg) {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14478);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14479);if ((((bg == null)&&(__CLR4_4_1az8az8lb90p7vd.R.iget(14480)!=0|true))||(__CLR4_4_1az8az8lb90p7vd.R.iget(14481)==0&false))) {{
            __CLR4_4_1az8az8lb90p7vd.R.inc(14482);throw new NullArgumentException();
        }
        }__CLR4_4_1az8az8lb90p7vd.R.inc(14483);return new BigFraction(bg.multiply(numerator), denominator);
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Multiply the value of this fraction by the passed <tt>int</tt>, returning
     * the result in reduced form.
     * </p>
     *
     * @param i
     *            the <tt>int</tt> to multiply by.
     * @return a {@link BigFraction} instance with the resulting values.
     */
    public BigFraction multiply(final int i) {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14484);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14485);return multiply(BigInteger.valueOf(i));
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Multiply the value of this fraction by the passed <tt>long</tt>,
     * returning the result in reduced form.
     * </p>
     *
     * @param l
     *            the <tt>long</tt> to multiply by.
     * @return a {@link BigFraction} instance with the resulting values.
     */
    public BigFraction multiply(final long l) {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14486);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14487);return multiply(BigInteger.valueOf(l));
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Multiplies the value of this fraction by another, returning the result in
     * reduced form.
     * </p>
     *
     * @param fraction Fraction to multiply by, must not be {@code null}.
     * @return a {@link BigFraction} instance with the resulting values.
     * @throws NullArgumentException if {@code fraction} is {@code null}.
     */
    public BigFraction multiply(final BigFraction fraction) {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14488);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14489);if ((((fraction == null)&&(__CLR4_4_1az8az8lb90p7vd.R.iget(14490)!=0|true))||(__CLR4_4_1az8az8lb90p7vd.R.iget(14491)==0&false))) {{
            __CLR4_4_1az8az8lb90p7vd.R.inc(14492);throw new NullArgumentException(LocalizedFormats.FRACTION);
        }
        }__CLR4_4_1az8az8lb90p7vd.R.inc(14493);if ((((numerator.equals(BigInteger.ZERO) ||
            fraction.numerator.equals(BigInteger.ZERO))&&(__CLR4_4_1az8az8lb90p7vd.R.iget(14494)!=0|true))||(__CLR4_4_1az8az8lb90p7vd.R.iget(14495)==0&false))) {{
            __CLR4_4_1az8az8lb90p7vd.R.inc(14496);return ZERO;
        }
        }__CLR4_4_1az8az8lb90p7vd.R.inc(14497);return new BigFraction(numerator.multiply(fraction.numerator),
                               denominator.multiply(fraction.denominator));
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Return the additive inverse of this fraction, returning the result in
     * reduced form.
     * </p>
     *
     * @return the negation of this fraction.
     */
    public BigFraction negate() {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14498);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14499);return new BigFraction(numerator.negate(), denominator);
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Gets the fraction percentage as a <tt>double</tt>. This calculates the
     * fraction as the numerator divided by denominator multiplied by 100.
     * </p>
     *
     * @return the fraction percentage as a <tt>double</tt>.
     */
    public double percentageValue() {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14500);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14501);return multiply(ONE_HUNDRED).doubleValue();
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Returns a {@code BigFraction} whose value is
     * {@code (this<sup>exponent</sup>)}, returning the result in reduced form.
     * </p>
     *
     * @param exponent
     *            exponent to which this {@code BigFraction} is to be
     *            raised.
     * @return <tt>this<sup>exponent</sup></tt>.
     */
    public BigFraction pow(final int exponent) {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14502);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14503);if ((((exponent < 0)&&(__CLR4_4_1az8az8lb90p7vd.R.iget(14504)!=0|true))||(__CLR4_4_1az8az8lb90p7vd.R.iget(14505)==0&false))) {{
            __CLR4_4_1az8az8lb90p7vd.R.inc(14506);return new BigFraction(denominator.pow(-exponent), numerator.pow(-exponent));
        }
        }__CLR4_4_1az8az8lb90p7vd.R.inc(14507);return new BigFraction(numerator.pow(exponent), denominator.pow(exponent));
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Returns a <code>BigFraction</code> whose value is
     * <tt>(this<sup>exponent</sup>)</tt>, returning the result in reduced form.
     * </p>
     *
     * @param exponent
     *            exponent to which this <code>BigFraction</code> is to be raised.
     * @return <tt>this<sup>exponent</sup></tt> as a <code>BigFraction</code>.
     */
    public BigFraction pow(final long exponent) {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14508);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14509);if ((((exponent < 0)&&(__CLR4_4_1az8az8lb90p7vd.R.iget(14510)!=0|true))||(__CLR4_4_1az8az8lb90p7vd.R.iget(14511)==0&false))) {{
            __CLR4_4_1az8az8lb90p7vd.R.inc(14512);return new BigFraction(ArithmeticUtils.pow(denominator, -exponent),
                                   ArithmeticUtils.pow(numerator,   -exponent));
        }
        }__CLR4_4_1az8az8lb90p7vd.R.inc(14513);return new BigFraction(ArithmeticUtils.pow(numerator,   exponent),
                               ArithmeticUtils.pow(denominator, exponent));
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Returns a <code>BigFraction</code> whose value is
     * <tt>(this<sup>exponent</sup>)</tt>, returning the result in reduced form.
     * </p>
     *
     * @param exponent
     *            exponent to which this <code>BigFraction</code> is to be raised.
     * @return <tt>this<sup>exponent</sup></tt> as a <code>BigFraction</code>.
     */
    public BigFraction pow(final BigInteger exponent) {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14514);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14515);if ((((exponent.compareTo(BigInteger.ZERO) < 0)&&(__CLR4_4_1az8az8lb90p7vd.R.iget(14516)!=0|true))||(__CLR4_4_1az8az8lb90p7vd.R.iget(14517)==0&false))) {{
            __CLR4_4_1az8az8lb90p7vd.R.inc(14518);final BigInteger eNeg = exponent.negate();
            __CLR4_4_1az8az8lb90p7vd.R.inc(14519);return new BigFraction(ArithmeticUtils.pow(denominator, eNeg),
                                   ArithmeticUtils.pow(numerator,   eNeg));
        }
        }__CLR4_4_1az8az8lb90p7vd.R.inc(14520);return new BigFraction(ArithmeticUtils.pow(numerator,   exponent),
                               ArithmeticUtils.pow(denominator, exponent));
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Returns a <code>double</code> whose value is
     * <tt>(this<sup>exponent</sup>)</tt>, returning the result in reduced form.
     * </p>
     *
     * @param exponent
     *            exponent to which this <code>BigFraction</code> is to be raised.
     * @return <tt>this<sup>exponent</sup></tt>.
     */
    public double pow(final double exponent) {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14521);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14522);return FastMath.pow(numerator.doubleValue(),   exponent) /
               FastMath.pow(denominator.doubleValue(), exponent);
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Return the multiplicative inverse of this fraction.
     * </p>
     *
     * @return the reciprocal fraction.
     */
    public BigFraction reciprocal() {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14523);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14524);return new BigFraction(denominator, numerator);
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Reduce this <code>BigFraction</code> to its lowest terms.
     * </p>
     *
     * @return the reduced <code>BigFraction</code>. It doesn't change anything if
     *         the fraction can be reduced.
     */
    public BigFraction reduce() {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14525);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14526);final BigInteger gcd = numerator.gcd(denominator);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14527);return new BigFraction(numerator.divide(gcd), denominator.divide(gcd));
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Subtracts the value of an {@link BigInteger} from the value of this
     * {@code BigFraction}, returning the result in reduced form.
     * </p>
     *
     * @param bg the {@link BigInteger} to subtract, cannot be {@code null}.
     * @return a {@code BigFraction} instance with the resulting values.
     * @throws NullArgumentException if the {@link BigInteger} is {@code null}.
     */
    public BigFraction subtract(final BigInteger bg) {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14528);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14529);if ((((bg == null)&&(__CLR4_4_1az8az8lb90p7vd.R.iget(14530)!=0|true))||(__CLR4_4_1az8az8lb90p7vd.R.iget(14531)==0&false))) {{
            __CLR4_4_1az8az8lb90p7vd.R.inc(14532);throw new NullArgumentException();
        }
        }__CLR4_4_1az8az8lb90p7vd.R.inc(14533);return new BigFraction(numerator.subtract(denominator.multiply(bg)), denominator);
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Subtracts the value of an {@code integer} from the value of this
     * {@code BigFraction}, returning the result in reduced form.
     * </p>
     *
     * @param i the {@code integer} to subtract.
     * @return a {@code BigFraction} instance with the resulting values.
     */
    public BigFraction subtract(final int i) {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14534);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14535);return subtract(BigInteger.valueOf(i));
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Subtracts the value of a {@code long} from the value of this
     * {@code BigFraction}, returning the result in reduced form.
     * </p>
     *
     * @param l the {@code long} to subtract.
     * @return a {@code BigFraction} instance with the resulting values.
     */
    public BigFraction subtract(final long l) {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14536);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14537);return subtract(BigInteger.valueOf(l));
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Subtracts the value of another fraction from the value of this one,
     * returning the result in reduced form.
     * </p>
     *
     * @param fraction {@link BigFraction} to subtract, must not be {@code null}.
     * @return a {@link BigFraction} instance with the resulting values
     * @throws NullArgumentException if the {@code fraction} is {@code null}.
     */
    public BigFraction subtract(final BigFraction fraction) {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14538);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14539);if ((((fraction == null)&&(__CLR4_4_1az8az8lb90p7vd.R.iget(14540)!=0|true))||(__CLR4_4_1az8az8lb90p7vd.R.iget(14541)==0&false))) {{
            __CLR4_4_1az8az8lb90p7vd.R.inc(14542);throw new NullArgumentException(LocalizedFormats.FRACTION);
        }
        }__CLR4_4_1az8az8lb90p7vd.R.inc(14543);if ((((ZERO.equals(fraction))&&(__CLR4_4_1az8az8lb90p7vd.R.iget(14544)!=0|true))||(__CLR4_4_1az8az8lb90p7vd.R.iget(14545)==0&false))) {{
            __CLR4_4_1az8az8lb90p7vd.R.inc(14546);return this;
        }

        }__CLR4_4_1az8az8lb90p7vd.R.inc(14547);BigInteger num = null;
        __CLR4_4_1az8az8lb90p7vd.R.inc(14548);BigInteger den = null;
        __CLR4_4_1az8az8lb90p7vd.R.inc(14549);if ((((denominator.equals(fraction.denominator))&&(__CLR4_4_1az8az8lb90p7vd.R.iget(14550)!=0|true))||(__CLR4_4_1az8az8lb90p7vd.R.iget(14551)==0&false))) {{
            __CLR4_4_1az8az8lb90p7vd.R.inc(14552);num = numerator.subtract(fraction.numerator);
            __CLR4_4_1az8az8lb90p7vd.R.inc(14553);den = denominator;
        } }else {{
            __CLR4_4_1az8az8lb90p7vd.R.inc(14554);num = (numerator.multiply(fraction.denominator)).subtract((fraction.numerator).multiply(denominator));
            __CLR4_4_1az8az8lb90p7vd.R.inc(14555);den = denominator.multiply(fraction.denominator);
        }
        }__CLR4_4_1az8az8lb90p7vd.R.inc(14556);return new BigFraction(num, den);

    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /**
     * <p>
     * Returns the <code>String</code> representing this fraction, ie
     * "num / dem" or just "num" if the denominator is one.
     * </p>
     *
     * @return a string representation of the fraction.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14557);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14558);String str = null;
        __CLR4_4_1az8az8lb90p7vd.R.inc(14559);if ((((BigInteger.ONE.equals(denominator))&&(__CLR4_4_1az8az8lb90p7vd.R.iget(14560)!=0|true))||(__CLR4_4_1az8az8lb90p7vd.R.iget(14561)==0&false))) {{
            __CLR4_4_1az8az8lb90p7vd.R.inc(14562);str = numerator.toString();
        } }else {__CLR4_4_1az8az8lb90p7vd.R.inc(14563);if ((((BigInteger.ZERO.equals(numerator))&&(__CLR4_4_1az8az8lb90p7vd.R.iget(14564)!=0|true))||(__CLR4_4_1az8az8lb90p7vd.R.iget(14565)==0&false))) {{
            __CLR4_4_1az8az8lb90p7vd.R.inc(14566);str = "0";
        } }else {{
            __CLR4_4_1az8az8lb90p7vd.R.inc(14567);str = numerator + " / " + denominator;
        }
        }}__CLR4_4_1az8az8lb90p7vd.R.inc(14568);return str;
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

    /** {@inheritDoc} */
    public BigFractionField getField() {try{__CLR4_4_1az8az8lb90p7vd.R.inc(14569);
        __CLR4_4_1az8az8lb90p7vd.R.inc(14570);return BigFractionField.getInstance();
    }finally{__CLR4_4_1az8az8lb90p7vd.R.flushNeeded();}}

}
