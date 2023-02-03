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

package org.apache.commons.math3.complex;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.FieldElement;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathUtils;

/**
 * Representation of a Complex number, i.e. a number which has both a
 * real and imaginary part.
 * <br/>
 * Implementations of arithmetic operations handle {@code NaN} and
 * infinite values according to the rules for {@link java.lang.Double}, i.e.
 * {@link #equals} is an equivalence relation for all instances that have
 * a {@code NaN} in either real or imaginary part, e.g. the following are
 * considered equal:
 * <ul>
 *  <li>{@code 1 + NaNi}</li>
 *  <li>{@code NaN + i}</li>
 *  <li>{@code NaN + NaNi}</li>
 * </ul>
 * Note that this is in contradiction with the IEEE-754 standard for floating
 * point numbers (according to which the test {@code x == x} must fail if
 * {@code x} is {@code NaN}). The method
 * {@link org.apache.commons.math3.util.Precision#equals(double,double,int)
 * equals for primitive double} in {@link org.apache.commons.math3.util.Precision}
 * conforms with IEEE-754 while this class conforms with the standard behavior
 * for Java object types.
 * <br/>
 * Implements Serializable since 2.0
 *
 * @version $Id$
 */
public class Complex implements FieldElement<Complex>, Serializable  {public static class __CLR4_4_14t84t8lb90p785{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,6589,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** The square root of -1. A number representing "0.0 + 1.0i" */
    public static final Complex I = new Complex(0.0, 1.0);
    // CHECKSTYLE: stop ConstantName
    /** A complex number representing "NaN + NaNi" */
    public static final Complex NaN = new Complex(Double.NaN, Double.NaN);
    // CHECKSTYLE: resume ConstantName
    /** A complex number representing "+INF + INFi" */
    public static final Complex INF = new Complex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
    /** A complex number representing "1.0 + 0.0i" */
    public static final Complex ONE = new Complex(1.0, 0.0);
    /** A complex number representing "0.0 + 0.0i" */
    public static final Complex ZERO = new Complex(0.0, 0.0);

    /** Serializable version identifier */
    private static final long serialVersionUID = -6195664516687396620L;

    /** The imaginary part. */
    private final double imaginary;
    /** The real part. */
    private final double real;
    /** Record whether this complex number is equal to NaN. */
    private final transient boolean isNaN;
    /** Record whether this complex number is infinite. */
    private final transient boolean isInfinite;

    /**
     * Create a complex number given only the real part.
     *
     * @param real Real part.
     */
    public Complex(double real) {
        this(real, 0.0);__CLR4_4_14t84t8lb90p785.R.inc(6237);try{__CLR4_4_14t84t8lb90p785.R.inc(6236);
    }finally{__CLR4_4_14t84t8lb90p785.R.flushNeeded();}}

    /**
     * Create a complex number given the real and imaginary parts.
     *
     * @param real Real part.
     * @param imaginary Imaginary part.
     */
    public Complex(double real, double imaginary) {try{__CLR4_4_14t84t8lb90p785.R.inc(6238);
        __CLR4_4_14t84t8lb90p785.R.inc(6239);this.real = real;
        __CLR4_4_14t84t8lb90p785.R.inc(6240);this.imaginary = imaginary;

        __CLR4_4_14t84t8lb90p785.R.inc(6241);isNaN = Double.isNaN(real) || Double.isNaN(imaginary);
        __CLR4_4_14t84t8lb90p785.R.inc(6242);isInfinite = !isNaN &&
            (Double.isInfinite(real) || Double.isInfinite(imaginary));
    }finally{__CLR4_4_14t84t8lb90p785.R.flushNeeded();}}

    /**
     * Return the absolute value of this complex number.
     * Returns {@code NaN} if either real or imaginary part is {@code NaN}
     * and {@code Double.POSITIVE_INFINITY} if neither part is {@code NaN},
     * but at least one part is infinite.
     *
     * @return the absolute value.
     */
    public double abs() {try{__CLR4_4_14t84t8lb90p785.R.inc(6243);
        __CLR4_4_14t84t8lb90p785.R.inc(6244);if ((((isNaN)&&(__CLR4_4_14t84t8lb90p785.R.iget(6245)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6246)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6247);return Double.NaN;
        }
        }__CLR4_4_14t84t8lb90p785.R.inc(6248);if ((((isInfinite())&&(__CLR4_4_14t84t8lb90p785.R.iget(6249)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6250)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6251);return Double.POSITIVE_INFINITY;
        }
        }__CLR4_4_14t84t8lb90p785.R.inc(6252);if ((((FastMath.abs(real) < FastMath.abs(imaginary))&&(__CLR4_4_14t84t8lb90p785.R.iget(6253)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6254)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6255);if ((((imaginary == 0.0)&&(__CLR4_4_14t84t8lb90p785.R.iget(6256)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6257)==0&false))) {{
                __CLR4_4_14t84t8lb90p785.R.inc(6258);return FastMath.abs(real);
            }
            }__CLR4_4_14t84t8lb90p785.R.inc(6259);double q = real / imaginary;
            __CLR4_4_14t84t8lb90p785.R.inc(6260);return FastMath.abs(imaginary) * FastMath.sqrt(1 + q * q);
        } }else {{
            __CLR4_4_14t84t8lb90p785.R.inc(6261);if ((((real == 0.0)&&(__CLR4_4_14t84t8lb90p785.R.iget(6262)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6263)==0&false))) {{
                __CLR4_4_14t84t8lb90p785.R.inc(6264);return FastMath.abs(imaginary);
            }
            }__CLR4_4_14t84t8lb90p785.R.inc(6265);double q = imaginary / real;
            __CLR4_4_14t84t8lb90p785.R.inc(6266);return FastMath.abs(real) * FastMath.sqrt(1 + q * q);
        }
    }}finally{__CLR4_4_14t84t8lb90p785.R.flushNeeded();}}

    /**
     * Returns a {@code Complex} whose value is
     * {@code (this + addend)}.
     * Uses the definitional formula
     * <pre>
     *  <code>
     *   (a + bi) + (c + di) = (a+c) + (b+d)i
     *  </code>
     * </pre>
     * <br/>
     * If either {@code this} or {@code addend} has a {@code NaN} value in
     * either part, {@link #NaN} is returned; otherwise {@code Infinite}
     * and {@code NaN} values are returned in the parts of the result
     * according to the rules for {@link java.lang.Double} arithmetic.
     *
     * @param  addend Value to be added to this {@code Complex}.
     * @return {@code this + addend}.
     * @throws NullArgumentException if {@code addend} is {@code null}.
     */
    public Complex add(Complex addend) throws NullArgumentException {try{__CLR4_4_14t84t8lb90p785.R.inc(6267);
        __CLR4_4_14t84t8lb90p785.R.inc(6268);MathUtils.checkNotNull(addend);
        __CLR4_4_14t84t8lb90p785.R.inc(6269);if ((((isNaN || addend.isNaN)&&(__CLR4_4_14t84t8lb90p785.R.iget(6270)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6271)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6272);return NaN;
        }

        }__CLR4_4_14t84t8lb90p785.R.inc(6273);return createComplex(real + addend.getReal(),
                             imaginary + addend.getImaginary());
    }finally{__CLR4_4_14t84t8lb90p785.R.flushNeeded();}}

    /**
     * Returns a {@code Complex} whose value is {@code (this + addend)},
     * with {@code addend} interpreted as a real number.
     *
     * @param addend Value to be added to this {@code Complex}.
     * @return {@code this + addend}.
     * @see #add(Complex)
     */
    public Complex add(double addend) {try{__CLR4_4_14t84t8lb90p785.R.inc(6274);
        __CLR4_4_14t84t8lb90p785.R.inc(6275);if ((((isNaN || Double.isNaN(addend))&&(__CLR4_4_14t84t8lb90p785.R.iget(6276)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6277)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6278);return NaN;
        }

        }__CLR4_4_14t84t8lb90p785.R.inc(6279);return createComplex(real + addend, imaginary);
    }finally{__CLR4_4_14t84t8lb90p785.R.flushNeeded();}}

     /**
     * Return the conjugate of this complex number.
     * The conjugate of {@code a + bi} is {@code a - bi}.
     * <br/>
     * {@link #NaN} is returned if either the real or imaginary
     * part of this Complex number equals {@code Double.NaN}.
     * <br/>
     * If the imaginary part is infinite, and the real part is not
     * {@code NaN}, the returned value has infinite imaginary part
     * of the opposite sign, e.g. the conjugate of
     * {@code 1 + POSITIVE_INFINITY i} is {@code 1 - NEGATIVE_INFINITY i}.
     *
     * @return the conjugate of this Complex object.
     */
    public Complex conjugate() {try{__CLR4_4_14t84t8lb90p785.R.inc(6280);
        __CLR4_4_14t84t8lb90p785.R.inc(6281);if ((((isNaN)&&(__CLR4_4_14t84t8lb90p785.R.iget(6282)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6283)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6284);return NaN;
        }

        }__CLR4_4_14t84t8lb90p785.R.inc(6285);return createComplex(real, -imaginary);
    }finally{__CLR4_4_14t84t8lb90p785.R.flushNeeded();}}

    /**
     * Returns a {@code Complex} whose value is
     * {@code (this / divisor)}.
     * Implements the definitional formula
     * <pre>
     *  <code>
     *    a + bi          ac + bd + (bc - ad)i
     *    ----------- = -------------------------
     *    c + di         c<sup>2</sup> + d<sup>2</sup>
     *  </code>
     * </pre>
     * but uses
     * <a href="http://doi.acm.org/10.1145/1039813.1039814">
     * prescaling of operands</a> to limit the effects of overflows and
     * underflows in the computation.
     * <br/>
     * {@code Infinite} and {@code NaN} values are handled according to the
     * following rules, applied in the order presented:
     * <ul>
     *  <li>If either {@code this} or {@code divisor} has a {@code NaN} value
     *   in either part, {@link #NaN} is returned.
     *  </li>
     *  <li>If {@code divisor} equals {@link #ZERO}, {@link #NaN} is returned.
     *  </li>
     *  <li>If {@code this} and {@code divisor} are both infinite,
     *   {@link #NaN} is returned.
     *  </li>
     *  <li>If {@code this} is finite (i.e., has no {@code Infinite} or
     *   {@code NaN} parts) and {@code divisor} is infinite (one or both parts
     *   infinite), {@link #ZERO} is returned.
     *  </li>
     *  <li>If {@code this} is infinite and {@code divisor} is finite,
     *   {@code NaN} values are returned in the parts of the result if the
     *   {@link java.lang.Double} rules applied to the definitional formula
     *   force {@code NaN} results.
     *  </li>
     * </ul>
     *
     * @param divisor Value by which this {@code Complex} is to be divided.
     * @return {@code this / divisor}.
     * @throws NullArgumentException if {@code divisor} is {@code null}.
     */
    public Complex divide(Complex divisor)
        throws NullArgumentException {try{__CLR4_4_14t84t8lb90p785.R.inc(6286);
        __CLR4_4_14t84t8lb90p785.R.inc(6287);MathUtils.checkNotNull(divisor);
        __CLR4_4_14t84t8lb90p785.R.inc(6288);if ((((isNaN || divisor.isNaN)&&(__CLR4_4_14t84t8lb90p785.R.iget(6289)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6290)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6291);return NaN;
        }

        }__CLR4_4_14t84t8lb90p785.R.inc(6292);final double c = divisor.getReal();
        __CLR4_4_14t84t8lb90p785.R.inc(6293);final double d = divisor.getImaginary();
        __CLR4_4_14t84t8lb90p785.R.inc(6294);if ((((c == 0.0 && d == 0.0)&&(__CLR4_4_14t84t8lb90p785.R.iget(6295)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6296)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6297);return NaN;
        }

        }__CLR4_4_14t84t8lb90p785.R.inc(6298);if ((((divisor.isInfinite() && !isInfinite())&&(__CLR4_4_14t84t8lb90p785.R.iget(6299)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6300)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6301);return ZERO;
        }

        }__CLR4_4_14t84t8lb90p785.R.inc(6302);if ((((FastMath.abs(c) < FastMath.abs(d))&&(__CLR4_4_14t84t8lb90p785.R.iget(6303)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6304)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6305);double q = c / d;
            __CLR4_4_14t84t8lb90p785.R.inc(6306);double denominator = c * q + d;
            __CLR4_4_14t84t8lb90p785.R.inc(6307);return createComplex((real * q + imaginary) / denominator,
                (imaginary * q - real) / denominator);
        } }else {{
            __CLR4_4_14t84t8lb90p785.R.inc(6308);double q = d / c;
            __CLR4_4_14t84t8lb90p785.R.inc(6309);double denominator = d * q + c;
            __CLR4_4_14t84t8lb90p785.R.inc(6310);return createComplex((imaginary * q + real) / denominator,
                (imaginary - real * q) / denominator);
        }
    }}finally{__CLR4_4_14t84t8lb90p785.R.flushNeeded();}}

    /**
     * Returns a {@code Complex} whose value is {@code (this / divisor)},
     * with {@code divisor} interpreted as a real number.
     *
     * @param  divisor Value by which this {@code Complex} is to be divided.
     * @return {@code this / divisor}.
     * @see #divide(Complex)
     */
    public Complex divide(double divisor) {try{__CLR4_4_14t84t8lb90p785.R.inc(6311);
        __CLR4_4_14t84t8lb90p785.R.inc(6312);if ((((isNaN || Double.isNaN(divisor))&&(__CLR4_4_14t84t8lb90p785.R.iget(6313)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6314)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6315);return NaN;
        }
        }__CLR4_4_14t84t8lb90p785.R.inc(6316);if ((((divisor == 0d)&&(__CLR4_4_14t84t8lb90p785.R.iget(6317)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6318)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6319);return NaN;
        }
        }__CLR4_4_14t84t8lb90p785.R.inc(6320);if ((((Double.isInfinite(divisor))&&(__CLR4_4_14t84t8lb90p785.R.iget(6321)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6322)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6323);return (((!isInfinite() )&&(__CLR4_4_14t84t8lb90p785.R.iget(6324)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6325)==0&false))? ZERO : NaN;
        }
        }__CLR4_4_14t84t8lb90p785.R.inc(6326);return createComplex(real / divisor,
                             imaginary  / divisor);
    }finally{__CLR4_4_14t84t8lb90p785.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Complex reciprocal() {try{__CLR4_4_14t84t8lb90p785.R.inc(6327);
        __CLR4_4_14t84t8lb90p785.R.inc(6328);if ((((isNaN)&&(__CLR4_4_14t84t8lb90p785.R.iget(6329)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6330)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6331);return NaN;
        }

        }__CLR4_4_14t84t8lb90p785.R.inc(6332);if ((((real == 0.0 && imaginary == 0.0)&&(__CLR4_4_14t84t8lb90p785.R.iget(6333)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6334)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6335);return INF;
        }

        }__CLR4_4_14t84t8lb90p785.R.inc(6336);if ((((isInfinite)&&(__CLR4_4_14t84t8lb90p785.R.iget(6337)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6338)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6339);return ZERO;
        }

        }__CLR4_4_14t84t8lb90p785.R.inc(6340);if ((((FastMath.abs(real) < FastMath.abs(imaginary))&&(__CLR4_4_14t84t8lb90p785.R.iget(6341)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6342)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6343);double q = real / imaginary;
            __CLR4_4_14t84t8lb90p785.R.inc(6344);double scale = 1. / (real * q + imaginary);
            __CLR4_4_14t84t8lb90p785.R.inc(6345);return createComplex(scale * q, -scale);
        } }else {{
            __CLR4_4_14t84t8lb90p785.R.inc(6346);double q = imaginary / real;
            __CLR4_4_14t84t8lb90p785.R.inc(6347);double scale = 1. / (imaginary * q + real);
            __CLR4_4_14t84t8lb90p785.R.inc(6348);return createComplex(scale, -scale * q);
        }
    }}finally{__CLR4_4_14t84t8lb90p785.R.flushNeeded();}}

    /**
     * Test for the equality of two Complex objects.
     * If both the real and imaginary parts of two complex numbers
     * are exactly the same, and neither is {@code Double.NaN}, the two
     * Complex objects are considered to be equal.
     * All {@code NaN} values are considered to be equal - i.e, if either
     * (or both) real and imaginary parts of the complex number are equal
     * to {@code Double.NaN}, the complex number is equal to
     * {@code NaN}.
     *
     * @param other Object to test for equality to this
     * @return true if two Complex objects are equal, false if object is
     * {@code null}, not an instance of Complex, or not equal to this Complex
     * instance.
     */
    @Override
    public boolean equals(Object other) {try{__CLR4_4_14t84t8lb90p785.R.inc(6349);
        __CLR4_4_14t84t8lb90p785.R.inc(6350);if ((((this == other)&&(__CLR4_4_14t84t8lb90p785.R.iget(6351)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6352)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6353);return true;
        }
        }__CLR4_4_14t84t8lb90p785.R.inc(6354);if ((((other instanceof Complex)&&(__CLR4_4_14t84t8lb90p785.R.iget(6355)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6356)==0&false))){{
            __CLR4_4_14t84t8lb90p785.R.inc(6357);Complex c = (Complex)other;
            __CLR4_4_14t84t8lb90p785.R.inc(6358);if ((((c.isNaN)&&(__CLR4_4_14t84t8lb90p785.R.iget(6359)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6360)==0&false))) {{
                __CLR4_4_14t84t8lb90p785.R.inc(6361);return isNaN;
            } }else {{
                __CLR4_4_14t84t8lb90p785.R.inc(6362);return (real == c.real) && (imaginary == c.imaginary);
            }
        }}
        }__CLR4_4_14t84t8lb90p785.R.inc(6363);return false;
    }finally{__CLR4_4_14t84t8lb90p785.R.flushNeeded();}}

    /**
     * Get a hashCode for the complex number.
     * Any {@code Double.NaN} value in real or imaginary part produces
     * the same hash code {@code 7}.
     *
     * @return a hash code value for this object.
     */
    @Override
    public int hashCode() {try{__CLR4_4_14t84t8lb90p785.R.inc(6364);
        __CLR4_4_14t84t8lb90p785.R.inc(6365);if ((((isNaN)&&(__CLR4_4_14t84t8lb90p785.R.iget(6366)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6367)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6368);return 7;
        }
        }__CLR4_4_14t84t8lb90p785.R.inc(6369);return 37 * (17 * MathUtils.hash(imaginary) +
            MathUtils.hash(real));
    }finally{__CLR4_4_14t84t8lb90p785.R.flushNeeded();}}

    /**
     * Access the imaginary part.
     *
     * @return the imaginary part.
     */
    public double getImaginary() {try{__CLR4_4_14t84t8lb90p785.R.inc(6370);
        __CLR4_4_14t84t8lb90p785.R.inc(6371);return imaginary;
    }finally{__CLR4_4_14t84t8lb90p785.R.flushNeeded();}}

    /**
     * Access the real part.
     *
     * @return the real part.
     */
    public double getReal() {try{__CLR4_4_14t84t8lb90p785.R.inc(6372);
        __CLR4_4_14t84t8lb90p785.R.inc(6373);return real;
    }finally{__CLR4_4_14t84t8lb90p785.R.flushNeeded();}}

    /**
     * Checks whether either or both parts of this complex number is
     * {@code NaN}.
     *
     * @return true if either or both parts of this complex number is
     * {@code NaN}; false otherwise.
     */
    public boolean isNaN() {try{__CLR4_4_14t84t8lb90p785.R.inc(6374);
        __CLR4_4_14t84t8lb90p785.R.inc(6375);return isNaN;
    }finally{__CLR4_4_14t84t8lb90p785.R.flushNeeded();}}

    /**
     * Checks whether either the real or imaginary part of this complex number
     * takes an infinite value (either {@code Double.POSITIVE_INFINITY} or
     * {@code Double.NEGATIVE_INFINITY}) and neither part
     * is {@code NaN}.
     *
     * @return true if one or both parts of this complex number are infinite
     * and neither part is {@code NaN}.
     */
    public boolean isInfinite() {try{__CLR4_4_14t84t8lb90p785.R.inc(6376);
        __CLR4_4_14t84t8lb90p785.R.inc(6377);return isInfinite;
    }finally{__CLR4_4_14t84t8lb90p785.R.flushNeeded();}}

    /**
     * Returns a {@code Complex} whose value is {@code this * factor}.
     * Implements preliminary checks for {@code NaN} and infinity followed by
     * the definitional formula:
     * <pre>
     *  <code>
     *   (a + bi)(c + di) = (ac - bd) + (ad + bc)i
     *  </code>
     * </pre>
     * Returns {@link #NaN} if either {@code this} or {@code factor} has one or
     * more {@code NaN} parts.
     * <br/>
     * Returns {@link #INF} if neither {@code this} nor {@code factor} has one
     * or more {@code NaN} parts and if either {@code this} or {@code factor}
     * has one or more infinite parts (same result is returned regardless of
     * the sign of the components).
     * <br/>
     * Returns finite values in components of the result per the definitional
     * formula in all remaining cases.
     *
     * @param  factor value to be multiplied by this {@code Complex}.
     * @return {@code this * factor}.
     * @throws NullArgumentException if {@code factor} is {@code null}.
     */
    public Complex multiply(Complex factor)
        throws NullArgumentException {try{__CLR4_4_14t84t8lb90p785.R.inc(6378);
        __CLR4_4_14t84t8lb90p785.R.inc(6379);MathUtils.checkNotNull(factor);
        __CLR4_4_14t84t8lb90p785.R.inc(6380);if ((((isNaN || factor.isNaN)&&(__CLR4_4_14t84t8lb90p785.R.iget(6381)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6382)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6383);return NaN;
        }
        }__CLR4_4_14t84t8lb90p785.R.inc(6384);if ((((Double.isInfinite(real) ||
            Double.isInfinite(imaginary) ||
            Double.isInfinite(factor.real) ||
            Double.isInfinite(factor.imaginary))&&(__CLR4_4_14t84t8lb90p785.R.iget(6385)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6386)==0&false))) {{
            // we don't use isInfinite() to avoid testing for NaN again
            __CLR4_4_14t84t8lb90p785.R.inc(6387);return INF;
        }
        }__CLR4_4_14t84t8lb90p785.R.inc(6388);return createComplex(real * factor.real - imaginary * factor.imaginary,
                             real * factor.imaginary + imaginary * factor.real);
    }finally{__CLR4_4_14t84t8lb90p785.R.flushNeeded();}}

    /**
     * Returns a {@code Complex} whose value is {@code this * factor}, with {@code factor}
     * interpreted as a integer number.
     *
     * @param  factor value to be multiplied by this {@code Complex}.
     * @return {@code this * factor}.
     * @see #multiply(Complex)
     */
    public Complex multiply(final int factor) {try{__CLR4_4_14t84t8lb90p785.R.inc(6389);
        __CLR4_4_14t84t8lb90p785.R.inc(6390);if ((((isNaN)&&(__CLR4_4_14t84t8lb90p785.R.iget(6391)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6392)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6393);return NaN;
        }
        }__CLR4_4_14t84t8lb90p785.R.inc(6394);if ((((Double.isInfinite(real) ||
            Double.isInfinite(imaginary))&&(__CLR4_4_14t84t8lb90p785.R.iget(6395)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6396)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6397);return INF;
        }
        }__CLR4_4_14t84t8lb90p785.R.inc(6398);return createComplex(real * factor, imaginary * factor);
    }finally{__CLR4_4_14t84t8lb90p785.R.flushNeeded();}}

    /**
     * Returns a {@code Complex} whose value is {@code this * factor}, with {@code factor}
     * interpreted as a real number.
     *
     * @param  factor value to be multiplied by this {@code Complex}.
     * @return {@code this * factor}.
     * @see #multiply(Complex)
     */
    public Complex multiply(double factor) {try{__CLR4_4_14t84t8lb90p785.R.inc(6399);
        __CLR4_4_14t84t8lb90p785.R.inc(6400);if ((((isNaN || Double.isNaN(factor))&&(__CLR4_4_14t84t8lb90p785.R.iget(6401)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6402)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6403);return NaN;
        }
        }__CLR4_4_14t84t8lb90p785.R.inc(6404);if ((((Double.isInfinite(real) ||
            Double.isInfinite(imaginary) ||
            Double.isInfinite(factor))&&(__CLR4_4_14t84t8lb90p785.R.iget(6405)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6406)==0&false))) {{
            // we don't use isInfinite() to avoid testing for NaN again
            __CLR4_4_14t84t8lb90p785.R.inc(6407);return INF;
        }
        }__CLR4_4_14t84t8lb90p785.R.inc(6408);return createComplex(real * factor, imaginary * factor);
    }finally{__CLR4_4_14t84t8lb90p785.R.flushNeeded();}}

    /**
     * Returns a {@code Complex} whose value is {@code (-this)}.
     * Returns {@code NaN} if either real or imaginary
     * part of this Complex number equals {@code Double.NaN}.
     *
     * @return {@code -this}.
     */
    public Complex negate() {try{__CLR4_4_14t84t8lb90p785.R.inc(6409);
        __CLR4_4_14t84t8lb90p785.R.inc(6410);if ((((isNaN)&&(__CLR4_4_14t84t8lb90p785.R.iget(6411)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6412)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6413);return NaN;
        }

        }__CLR4_4_14t84t8lb90p785.R.inc(6414);return createComplex(-real, -imaginary);
    }finally{__CLR4_4_14t84t8lb90p785.R.flushNeeded();}}

    /**
     * Returns a {@code Complex} whose value is
     * {@code (this - subtrahend)}.
     * Uses the definitional formula
     * <pre>
     *  <code>
     *   (a + bi) - (c + di) = (a-c) + (b-d)i
     *  </code>
     * </pre>
     * If either {@code this} or {@code subtrahend} has a {@code NaN]} value in either part,
     * {@link #NaN} is returned; otherwise infinite and {@code NaN} values are
     * returned in the parts of the result according to the rules for
     * {@link java.lang.Double} arithmetic.
     *
     * @param  subtrahend value to be subtracted from this {@code Complex}.
     * @return {@code this - subtrahend}.
     * @throws NullArgumentException if {@code subtrahend} is {@code null}.
     */
    public Complex subtract(Complex subtrahend)
        throws NullArgumentException {try{__CLR4_4_14t84t8lb90p785.R.inc(6415);
        __CLR4_4_14t84t8lb90p785.R.inc(6416);MathUtils.checkNotNull(subtrahend);
        __CLR4_4_14t84t8lb90p785.R.inc(6417);if ((((isNaN || subtrahend.isNaN)&&(__CLR4_4_14t84t8lb90p785.R.iget(6418)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6419)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6420);return NaN;
        }

        }__CLR4_4_14t84t8lb90p785.R.inc(6421);return createComplex(real - subtrahend.getReal(),
                             imaginary - subtrahend.getImaginary());
    }finally{__CLR4_4_14t84t8lb90p785.R.flushNeeded();}}

    /**
     * Returns a {@code Complex} whose value is
     * {@code (this - subtrahend)}.
     *
     * @param  subtrahend value to be subtracted from this {@code Complex}.
     * @return {@code this - subtrahend}.
     * @see #subtract(Complex)
     */
    public Complex subtract(double subtrahend) {try{__CLR4_4_14t84t8lb90p785.R.inc(6422);
        __CLR4_4_14t84t8lb90p785.R.inc(6423);if ((((isNaN || Double.isNaN(subtrahend))&&(__CLR4_4_14t84t8lb90p785.R.iget(6424)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6425)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6426);return NaN;
        }
        }__CLR4_4_14t84t8lb90p785.R.inc(6427);return createComplex(real - subtrahend, imaginary);
    }finally{__CLR4_4_14t84t8lb90p785.R.flushNeeded();}}

    /**
     * Compute the
     * <a href="http://mathworld.wolfram.com/InverseCosine.html" TARGET="_top">
     * inverse cosine</a> of this complex number.
     * Implements the formula:
     * <pre>
     *  <code>
     *   acos(z) = -i (log(z + i (sqrt(1 - z<sup>2</sup>))))
     *  </code>
     * </pre>
     * Returns {@link Complex#NaN} if either real or imaginary part of the
     * input argument is {@code NaN} or infinite.
     *
     * @return the inverse cosine of this complex number.
     * @since 1.2
     */
    public Complex acos() {try{__CLR4_4_14t84t8lb90p785.R.inc(6428);
        __CLR4_4_14t84t8lb90p785.R.inc(6429);if ((((isNaN)&&(__CLR4_4_14t84t8lb90p785.R.iget(6430)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6431)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6432);return NaN;
        }

        }__CLR4_4_14t84t8lb90p785.R.inc(6433);return this.add(this.sqrt1z().multiply(I)).log().multiply(I.negate());
    }finally{__CLR4_4_14t84t8lb90p785.R.flushNeeded();}}

    /**
     * Compute the
     * <a href="http://mathworld.wolfram.com/InverseSine.html" TARGET="_top">
     * inverse sine</a> of this complex number.
     * Implements the formula:
     * <pre>
     *  <code>
     *   asin(z) = -i (log(sqrt(1 - z<sup>2</sup>) + iz))
     *  </code>
     * </pre>
     * Returns {@link Complex#NaN} if either real or imaginary part of the
     * input argument is {@code NaN} or infinite.
     *
     * @return the inverse sine of this complex number.
     * @since 1.2
     */
    public Complex asin() {try{__CLR4_4_14t84t8lb90p785.R.inc(6434);
        __CLR4_4_14t84t8lb90p785.R.inc(6435);if ((((isNaN)&&(__CLR4_4_14t84t8lb90p785.R.iget(6436)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6437)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6438);return NaN;
        }

        }__CLR4_4_14t84t8lb90p785.R.inc(6439);return sqrt1z().add(this.multiply(I)).log().multiply(I.negate());
    }finally{__CLR4_4_14t84t8lb90p785.R.flushNeeded();}}

    /**
     * Compute the
     * <a href="http://mathworld.wolfram.com/InverseTangent.html" TARGET="_top">
     * inverse tangent</a> of this complex number.
     * Implements the formula:
     * <pre>
     *  <code>
     *   atan(z) = (i/2) log((i + z)/(i - z))
     *  </code>
     * </pre>
     * Returns {@link Complex#NaN} if either real or imaginary part of the
     * input argument is {@code NaN} or infinite.
     *
     * @return the inverse tangent of this complex number
     * @since 1.2
     */
    public Complex atan() {try{__CLR4_4_14t84t8lb90p785.R.inc(6440);
        __CLR4_4_14t84t8lb90p785.R.inc(6441);if ((((isNaN)&&(__CLR4_4_14t84t8lb90p785.R.iget(6442)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6443)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6444);return NaN;
        }

        }__CLR4_4_14t84t8lb90p785.R.inc(6445);return this.add(I).divide(I.subtract(this)).log()
                .multiply(I.divide(createComplex(2.0, 0.0)));
    }finally{__CLR4_4_14t84t8lb90p785.R.flushNeeded();}}

    /**
     * Compute the
     * <a href="http://mathworld.wolfram.com/Cosine.html" TARGET="_top">
     * cosine</a>
     * of this complex number.
     * Implements the formula:
     * <pre>
     *  <code>
     *   cos(a + bi) = cos(a)cosh(b) - sin(a)sinh(b)i
     *  </code>
     * </pre>
     * where the (real) functions on the right-hand side are
     * {@link java.lang.Math#sin}, {@link java.lang.Math#cos},
     * {@link FastMath#cosh} and {@link FastMath#sinh}.
     * <br/>
     * Returns {@link Complex#NaN} if either real or imaginary part of the
     * input argument is {@code NaN}.
     * <br/>
     * Infinite values in real or imaginary parts of the input may result in
     * infinite or NaN values returned in parts of the result.
     * <pre>
     *  Examples:
     *  <code>
     *   cos(1 &plusmn; INFINITY i) = 1 &#x2213; INFINITY i
     *   cos(&plusmn;INFINITY + i) = NaN + NaN i
     *   cos(&plusmn;INFINITY &plusmn; INFINITY i) = NaN + NaN i
     *  </code>
     * </pre>
     *
     * @return the cosine of this complex number.
     * @since 1.2
     */
    public Complex cos() {try{__CLR4_4_14t84t8lb90p785.R.inc(6446);
        __CLR4_4_14t84t8lb90p785.R.inc(6447);if ((((isNaN)&&(__CLR4_4_14t84t8lb90p785.R.iget(6448)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6449)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6450);return NaN;
        }

        }__CLR4_4_14t84t8lb90p785.R.inc(6451);return createComplex(FastMath.cos(real) * FastMath.cosh(imaginary),
                             -FastMath.sin(real) * FastMath.sinh(imaginary));
    }finally{__CLR4_4_14t84t8lb90p785.R.flushNeeded();}}

    /**
     * Compute the
     * <a href="http://mathworld.wolfram.com/HyperbolicCosine.html" TARGET="_top">
     * hyperbolic cosine</a> of this complex number.
     * Implements the formula:
     * <pre>
     *  <code>
     *   cosh(a + bi) = cosh(a)cos(b) + sinh(a)sin(b)i}
     *  </code>
     * </pre>
     * where the (real) functions on the right-hand side are
     * {@link java.lang.Math#sin}, {@link java.lang.Math#cos},
     * {@link FastMath#cosh} and {@link FastMath#sinh}.
     * <br/>
     * Returns {@link Complex#NaN} if either real or imaginary part of the
     * input argument is {@code NaN}.
     * <br/>
     * Infinite values in real or imaginary parts of the input may result in
     * infinite or NaN values returned in parts of the result.
     * <pre>
     *  Examples:
     *  <code>
     *   cosh(1 &plusmn; INFINITY i) = NaN + NaN i
     *   cosh(&plusmn;INFINITY + i) = INFINITY &plusmn; INFINITY i
     *   cosh(&plusmn;INFINITY &plusmn; INFINITY i) = NaN + NaN i
     *  </code>
     * </pre>
     *
     * @return the hyperbolic cosine of this complex number.
     * @since 1.2
     */
    public Complex cosh() {try{__CLR4_4_14t84t8lb90p785.R.inc(6452);
        __CLR4_4_14t84t8lb90p785.R.inc(6453);if ((((isNaN)&&(__CLR4_4_14t84t8lb90p785.R.iget(6454)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6455)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6456);return NaN;
        }

        }__CLR4_4_14t84t8lb90p785.R.inc(6457);return createComplex(FastMath.cosh(real) * FastMath.cos(imaginary),
                             FastMath.sinh(real) * FastMath.sin(imaginary));
    }finally{__CLR4_4_14t84t8lb90p785.R.flushNeeded();}}

    /**
     * Compute the
     * <a href="http://mathworld.wolfram.com/ExponentialFunction.html" TARGET="_top">
     * exponential function</a> of this complex number.
     * Implements the formula:
     * <pre>
     *  <code>
     *   exp(a + bi) = exp(a)cos(b) + exp(a)sin(b)i
     *  </code>
     * </pre>
     * where the (real) functions on the right-hand side are
     * {@link java.lang.Math#exp}, {@link java.lang.Math#cos}, and
     * {@link java.lang.Math#sin}.
     * <br/>
     * Returns {@link Complex#NaN} if either real or imaginary part of the
     * input argument is {@code NaN}.
     * <br/>
     * Infinite values in real or imaginary parts of the input may result in
     * infinite or NaN values returned in parts of the result.
     * <pre>
     *  Examples:
     *  <code>
     *   exp(1 &plusmn; INFINITY i) = NaN + NaN i
     *   exp(INFINITY + i) = INFINITY + INFINITY i
     *   exp(-INFINITY + i) = 0 + 0i
     *   exp(&plusmn;INFINITY &plusmn; INFINITY i) = NaN + NaN i
     *  </code>
     * </pre>
     *
     * @return <code><i>e</i><sup>this</sup></code>.
     * @since 1.2
     */
    public Complex exp() {try{__CLR4_4_14t84t8lb90p785.R.inc(6458);
        __CLR4_4_14t84t8lb90p785.R.inc(6459);if ((((isNaN)&&(__CLR4_4_14t84t8lb90p785.R.iget(6460)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6461)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6462);return NaN;
        }

        }__CLR4_4_14t84t8lb90p785.R.inc(6463);double expReal = FastMath.exp(real);
        __CLR4_4_14t84t8lb90p785.R.inc(6464);return createComplex(expReal *  FastMath.cos(imaginary),
                             expReal * FastMath.sin(imaginary));
    }finally{__CLR4_4_14t84t8lb90p785.R.flushNeeded();}}

    /**
     * Compute the
     * <a href="http://mathworld.wolfram.com/NaturalLogarithm.html" TARGET="_top">
     * natural logarithm</a> of this complex number.
     * Implements the formula:
     * <pre>
     *  <code>
     *   log(a + bi) = ln(|a + bi|) + arg(a + bi)i
     *  </code>
     * </pre>
     * where ln on the right hand side is {@link java.lang.Math#log},
     * {@code |a + bi|} is the modulus, {@link Complex#abs},  and
     * {@code arg(a + bi) = }{@link java.lang.Math#atan2}(b, a).
     * <br/>
     * Returns {@link Complex#NaN} if either real or imaginary part of the
     * input argument is {@code NaN}.
     * <br/>
     * Infinite (or critical) values in real or imaginary parts of the input may
     * result in infinite or NaN values returned in parts of the result.
     * <pre>
     *  Examples:
     *  <code>
     *   log(1 &plusmn; INFINITY i) = INFINITY &plusmn; (&pi;/2)i
     *   log(INFINITY + i) = INFINITY + 0i
     *   log(-INFINITY + i) = INFINITY + &pi;i
     *   log(INFINITY &plusmn; INFINITY i) = INFINITY &plusmn; (&pi;/4)i
     *   log(-INFINITY &plusmn; INFINITY i) = INFINITY &plusmn; (3&pi;/4)i
     *   log(0 + 0i) = -INFINITY + 0i
     *  </code>
     * </pre>
     *
     * @return the value <code>ln &nbsp; this</code>, the natural logarithm
     * of {@code this}.
     * @since 1.2
     */
    public Complex log() {try{__CLR4_4_14t84t8lb90p785.R.inc(6465);
        __CLR4_4_14t84t8lb90p785.R.inc(6466);if ((((isNaN)&&(__CLR4_4_14t84t8lb90p785.R.iget(6467)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6468)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6469);return NaN;
        }

        }__CLR4_4_14t84t8lb90p785.R.inc(6470);return createComplex(FastMath.log(abs()),
                             FastMath.atan2(imaginary, real));
    }finally{__CLR4_4_14t84t8lb90p785.R.flushNeeded();}}

    /**
     * Returns of value of this complex number raised to the power of {@code x}.
     * Implements the formula:
     * <pre>
     *  <code>
     *   y<sup>x</sup> = exp(x&middot;log(y))
     *  </code>
     * </pre>
     * where {@code exp} and {@code log} are {@link #exp} and
     * {@link #log}, respectively.
     * <br/>
     * Returns {@link Complex#NaN} if either real or imaginary part of the
     * input argument is {@code NaN} or infinite, or if {@code y}
     * equals {@link Complex#ZERO}.
     *
     * @param  x exponent to which this {@code Complex} is to be raised.
     * @return <code> this<sup>{@code x}</sup></code>.
     * @throws NullArgumentException if x is {@code null}.
     * @since 1.2
     */
    public Complex pow(Complex x)
        throws NullArgumentException {try{__CLR4_4_14t84t8lb90p785.R.inc(6471);
        __CLR4_4_14t84t8lb90p785.R.inc(6472);MathUtils.checkNotNull(x);
        __CLR4_4_14t84t8lb90p785.R.inc(6473);return this.log().multiply(x).exp();
    }finally{__CLR4_4_14t84t8lb90p785.R.flushNeeded();}}

    /**
     * Returns of value of this complex number raised to the power of {@code x}.
     *
     * @param  x exponent to which this {@code Complex} is to be raised.
     * @return <code>this<sup>x</sup></code>.
     * @see #pow(Complex)
     */
     public Complex pow(double x) {try{__CLR4_4_14t84t8lb90p785.R.inc(6474);
        __CLR4_4_14t84t8lb90p785.R.inc(6475);return this.log().multiply(x).exp();
    }finally{__CLR4_4_14t84t8lb90p785.R.flushNeeded();}}

    /**
     * Compute the
     * <a href="http://mathworld.wolfram.com/Sine.html" TARGET="_top">
     * sine</a>
     * of this complex number.
     * Implements the formula:
     * <pre>
     *  <code>
     *   sin(a + bi) = sin(a)cosh(b) - cos(a)sinh(b)i
     *  </code>
     * </pre>
     * where the (real) functions on the right-hand side are
     * {@link java.lang.Math#sin}, {@link java.lang.Math#cos},
     * {@link FastMath#cosh} and {@link FastMath#sinh}.
     * <br/>
     * Returns {@link Complex#NaN} if either real or imaginary part of the
     * input argument is {@code NaN}.
     * <br/>
     * Infinite values in real or imaginary parts of the input may result in
     * infinite or {@code NaN} values returned in parts of the result.
     * <pre>
     *  Examples:
     *  <code>
     *   sin(1 &plusmn; INFINITY i) = 1 &plusmn; INFINITY i
     *   sin(&plusmn;INFINITY + i) = NaN + NaN i
     *   sin(&plusmn;INFINITY &plusmn; INFINITY i) = NaN + NaN i
     *  </code>
     * </pre>
     *
     * @return the sine of this complex number.
     * @since 1.2
     */
    public Complex sin() {try{__CLR4_4_14t84t8lb90p785.R.inc(6476);
        __CLR4_4_14t84t8lb90p785.R.inc(6477);if ((((isNaN)&&(__CLR4_4_14t84t8lb90p785.R.iget(6478)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6479)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6480);return NaN;
        }

        }__CLR4_4_14t84t8lb90p785.R.inc(6481);return createComplex(FastMath.sin(real) * FastMath.cosh(imaginary),
                             FastMath.cos(real) * FastMath.sinh(imaginary));
    }finally{__CLR4_4_14t84t8lb90p785.R.flushNeeded();}}

    /**
     * Compute the
     * <a href="http://mathworld.wolfram.com/HyperbolicSine.html" TARGET="_top">
     * hyperbolic sine</a> of this complex number.
     * Implements the formula:
     * <pre>
     *  <code>
     *   sinh(a + bi) = sinh(a)cos(b)) + cosh(a)sin(b)i
     *  </code>
     * </pre>
     * where the (real) functions on the right-hand side are
     * {@link java.lang.Math#sin}, {@link java.lang.Math#cos},
     * {@link FastMath#cosh} and {@link FastMath#sinh}.
     * <br/>
     * Returns {@link Complex#NaN} if either real or imaginary part of the
     * input argument is {@code NaN}.
     * <br/>
     * Infinite values in real or imaginary parts of the input may result in
     * infinite or NaN values returned in parts of the result.
     * <pre>
     *  Examples:
     *  <code>
     *   sinh(1 &plusmn; INFINITY i) = NaN + NaN i
     *   sinh(&plusmn;INFINITY + i) = &plusmn; INFINITY + INFINITY i
     *   sinh(&plusmn;INFINITY &plusmn; INFINITY i) = NaN + NaN i
     *  </code>
     * </pre>
     *
     * @return the hyperbolic sine of {@code this}.
     * @since 1.2
     */
    public Complex sinh() {try{__CLR4_4_14t84t8lb90p785.R.inc(6482);
        __CLR4_4_14t84t8lb90p785.R.inc(6483);if ((((isNaN)&&(__CLR4_4_14t84t8lb90p785.R.iget(6484)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6485)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6486);return NaN;
        }

        }__CLR4_4_14t84t8lb90p785.R.inc(6487);return createComplex(FastMath.sinh(real) * FastMath.cos(imaginary),
            FastMath.cosh(real) * FastMath.sin(imaginary));
    }finally{__CLR4_4_14t84t8lb90p785.R.flushNeeded();}}

    /**
     * Compute the
     * <a href="http://mathworld.wolfram.com/SquareRoot.html" TARGET="_top">
     * square root</a> of this complex number.
     * Implements the following algorithm to compute {@code sqrt(a + bi)}:
     * <ol><li>Let {@code t = sqrt((|a| + |a + bi|) / 2)}</li>
     * <li><pre>if {@code  a &#8805; 0} return {@code t + (b/2t)i}
     *  else return {@code |b|/2t + sign(b)t i }</pre></li>
     * </ol>
     * where <ul>
     * <li>{@code |a| = }{@link Math#abs}(a)</li>
     * <li>{@code |a + bi| = }{@link Complex#abs}(a + bi)</li>
     * <li>{@code sign(b) =  }{@link FastMath#copySign(double,double) copySign(1d, b)}
     * </ul>
     * <br/>
     * Returns {@link Complex#NaN} if either real or imaginary part of the
     * input argument is {@code NaN}.
     * <br/>
     * Infinite values in real or imaginary parts of the input may result in
     * infinite or NaN values returned in parts of the result.
     * <pre>
     *  Examples:
     *  <code>
     *   sqrt(1 &plusmn; INFINITY i) = INFINITY + NaN i
     *   sqrt(INFINITY + i) = INFINITY + 0i
     *   sqrt(-INFINITY + i) = 0 + INFINITY i
     *   sqrt(INFINITY &plusmn; INFINITY i) = INFINITY + NaN i
     *   sqrt(-INFINITY &plusmn; INFINITY i) = NaN &plusmn; INFINITY i
     *  </code>
     * </pre>
     *
     * @return the square root of {@code this}.
     * @since 1.2
     */
    public Complex sqrt() {try{__CLR4_4_14t84t8lb90p785.R.inc(6488);
        __CLR4_4_14t84t8lb90p785.R.inc(6489);if ((((isNaN)&&(__CLR4_4_14t84t8lb90p785.R.iget(6490)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6491)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6492);return NaN;
        }

        }__CLR4_4_14t84t8lb90p785.R.inc(6493);if ((((real == 0.0 && imaginary == 0.0)&&(__CLR4_4_14t84t8lb90p785.R.iget(6494)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6495)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6496);return createComplex(0.0, 0.0);
        }

        }__CLR4_4_14t84t8lb90p785.R.inc(6497);double t = FastMath.sqrt((FastMath.abs(real) + abs()) / 2.0);
        __CLR4_4_14t84t8lb90p785.R.inc(6498);if ((((real >= 0.0)&&(__CLR4_4_14t84t8lb90p785.R.iget(6499)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6500)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6501);return createComplex(t, imaginary / (2.0 * t));
        } }else {{
            __CLR4_4_14t84t8lb90p785.R.inc(6502);return createComplex(FastMath.abs(imaginary) / (2.0 * t),
                                 FastMath.copySign(1d, imaginary) * t);
        }
    }}finally{__CLR4_4_14t84t8lb90p785.R.flushNeeded();}}

    /**
     * Compute the
     * <a href="http://mathworld.wolfram.com/SquareRoot.html" TARGET="_top">
     * square root</a> of <code>1 - this<sup>2</sup></code> for this complex
     * number.
     * Computes the result directly as
     * {@code sqrt(ONE.subtract(z.multiply(z)))}.
     * <br/>
     * Returns {@link Complex#NaN} if either real or imaginary part of the
     * input argument is {@code NaN}.
     * <br/>
     * Infinite values in real or imaginary parts of the input may result in
     * infinite or NaN values returned in parts of the result.
     *
     * @return the square root of <code>1 - this<sup>2</sup></code>.
     * @since 1.2
     */
    public Complex sqrt1z() {try{__CLR4_4_14t84t8lb90p785.R.inc(6503);
        __CLR4_4_14t84t8lb90p785.R.inc(6504);return createComplex(1.0, 0.0).subtract(this.multiply(this)).sqrt();
    }finally{__CLR4_4_14t84t8lb90p785.R.flushNeeded();}}

    /**
     * Compute the
     * <a href="http://mathworld.wolfram.com/Tangent.html" TARGET="_top">
     * tangent</a> of this complex number.
     * Implements the formula:
     * <pre>
     *  <code>
     *   tan(a + bi) = sin(2a)/(cos(2a)+cosh(2b)) + [sinh(2b)/(cos(2a)+cosh(2b))]i
     *  </code>
     * </pre>
     * where the (real) functions on the right-hand side are
     * {@link FastMath#sin}, {@link FastMath#cos}, {@link FastMath#cosh} and
     * {@link FastMath#sinh}.
     * <br/>
     * Returns {@link Complex#NaN} if either real or imaginary part of the
     * input argument is {@code NaN}.
     * <br/>
     * Infinite (or critical) values in real or imaginary parts of the input may
     * result in infinite or NaN values returned in parts of the result.
     * <pre>
     *  Examples:
     *  <code>
     *   tan(a &plusmn; INFINITY i) = 0 &plusmn; i
     *   tan(&plusmn;INFINITY + bi) = NaN + NaN i
     *   tan(&plusmn;INFINITY &plusmn; INFINITY i) = NaN + NaN i
     *   tan(&plusmn;&pi;/2 + 0 i) = &plusmn;INFINITY + NaN i
     *  </code>
     * </pre>
     *
     * @return the tangent of {@code this}.
     * @since 1.2
     */
    public Complex tan() {try{__CLR4_4_14t84t8lb90p785.R.inc(6505);
        __CLR4_4_14t84t8lb90p785.R.inc(6506);if ((((isNaN || Double.isInfinite(real))&&(__CLR4_4_14t84t8lb90p785.R.iget(6507)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6508)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6509);return NaN;
        }
        }__CLR4_4_14t84t8lb90p785.R.inc(6510);if ((((imaginary > 20.0)&&(__CLR4_4_14t84t8lb90p785.R.iget(6511)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6512)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6513);return createComplex(0.0, 1.0);
        }
        }__CLR4_4_14t84t8lb90p785.R.inc(6514);if ((((imaginary < -20.0)&&(__CLR4_4_14t84t8lb90p785.R.iget(6515)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6516)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6517);return createComplex(0.0, -1.0);
        }

        }__CLR4_4_14t84t8lb90p785.R.inc(6518);double real2 = 2.0 * real;
        __CLR4_4_14t84t8lb90p785.R.inc(6519);double imaginary2 = 2.0 * imaginary;
        __CLR4_4_14t84t8lb90p785.R.inc(6520);double d = FastMath.cos(real2) + FastMath.cosh(imaginary2);

        __CLR4_4_14t84t8lb90p785.R.inc(6521);return createComplex(FastMath.sin(real2) / d,
                             FastMath.sinh(imaginary2) / d);
    }finally{__CLR4_4_14t84t8lb90p785.R.flushNeeded();}}

    /**
     * Compute the
     * <a href="http://mathworld.wolfram.com/HyperbolicTangent.html" TARGET="_top">
     * hyperbolic tangent</a> of this complex number.
     * Implements the formula:
     * <pre>
     *  <code>
     *   tan(a + bi) = sinh(2a)/(cosh(2a)+cos(2b)) + [sin(2b)/(cosh(2a)+cos(2b))]i
     *  </code>
     * </pre>
     * where the (real) functions on the right-hand side are
     * {@link FastMath#sin}, {@link FastMath#cos}, {@link FastMath#cosh} and
     * {@link FastMath#sinh}.
     * <br/>
     * Returns {@link Complex#NaN} if either real or imaginary part of the
     * input argument is {@code NaN}.
     * <br/>
     * Infinite values in real or imaginary parts of the input may result in
     * infinite or NaN values returned in parts of the result.
     * <pre>
     *  Examples:
     *  <code>
     *   tanh(a &plusmn; INFINITY i) = NaN + NaN i
     *   tanh(&plusmn;INFINITY + bi) = &plusmn;1 + 0 i
     *   tanh(&plusmn;INFINITY &plusmn; INFINITY i) = NaN + NaN i
     *   tanh(0 + (&pi;/2)i) = NaN + INFINITY i
     *  </code>
     * </pre>
     *
     * @return the hyperbolic tangent of {@code this}.
     * @since 1.2
     */
    public Complex tanh() {try{__CLR4_4_14t84t8lb90p785.R.inc(6522);
        __CLR4_4_14t84t8lb90p785.R.inc(6523);if ((((isNaN || Double.isInfinite(imaginary))&&(__CLR4_4_14t84t8lb90p785.R.iget(6524)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6525)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6526);return NaN;
        }
        }__CLR4_4_14t84t8lb90p785.R.inc(6527);if ((((real > 20.0)&&(__CLR4_4_14t84t8lb90p785.R.iget(6528)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6529)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6530);return createComplex(1.0, 0.0);
        }
        }__CLR4_4_14t84t8lb90p785.R.inc(6531);if ((((real < -20.0)&&(__CLR4_4_14t84t8lb90p785.R.iget(6532)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6533)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6534);return createComplex(-1.0, 0.0);
        }
        }__CLR4_4_14t84t8lb90p785.R.inc(6535);double real2 = 2.0 * real;
        __CLR4_4_14t84t8lb90p785.R.inc(6536);double imaginary2 = 2.0 * imaginary;
        __CLR4_4_14t84t8lb90p785.R.inc(6537);double d = FastMath.cosh(real2) + FastMath.cos(imaginary2);

        __CLR4_4_14t84t8lb90p785.R.inc(6538);return createComplex(FastMath.sinh(real2) / d,
                             FastMath.sin(imaginary2) / d);
    }finally{__CLR4_4_14t84t8lb90p785.R.flushNeeded();}}



    /**
     * Compute the argument of this complex number.
     * The argument is the angle phi between the positive real axis and
     * the point representing this number in the complex plane.
     * The value returned is between -PI (not inclusive)
     * and PI (inclusive), with negative values returned for numbers with
     * negative imaginary parts.
     * <br/>
     * If either real or imaginary part (or both) is NaN, NaN is returned.
     * Infinite parts are handled as {@code Math.atan2} handles them,
     * essentially treating finite parts as zero in the presence of an
     * infinite coordinate and returning a multiple of pi/4 depending on
     * the signs of the infinite parts.
     * See the javadoc for {@code Math.atan2} for full details.
     *
     * @return the argument of {@code this}.
     */
    public double getArgument() {try{__CLR4_4_14t84t8lb90p785.R.inc(6539);
        __CLR4_4_14t84t8lb90p785.R.inc(6540);return FastMath.atan2(getImaginary(), getReal());
    }finally{__CLR4_4_14t84t8lb90p785.R.flushNeeded();}}

    /**
     * Computes the n-th roots of this complex number.
     * The nth roots are defined by the formula:
     * <pre>
     *  <code>
     *   z<sub>k</sub> = abs<sup>1/n</sup> (cos(phi + 2&pi;k/n) + i (sin(phi + 2&pi;k/n))
     *  </code>
     * </pre>
     * for <i>{@code k=0, 1, ..., n-1}</i>, where {@code abs} and {@code phi}
     * are respectively the {@link #abs() modulus} and
     * {@link #getArgument() argument} of this complex number.
     * <br/>
     * If one or both parts of this complex number is NaN, a list with just
     * one element, {@link #NaN} is returned.
     * if neither part is NaN, but at least one part is infinite, the result
     * is a one-element list containing {@link #INF}.
     *
     * @param n Degree of root.
     * @return a List<Complex> of all {@code n}-th roots of {@code this}.
     * @throws NotPositiveException if {@code n <= 0}.
     * @since 2.0
     */
    public List<Complex> nthRoot(int n) throws NotPositiveException {try{__CLR4_4_14t84t8lb90p785.R.inc(6541);

        __CLR4_4_14t84t8lb90p785.R.inc(6542);if ((((n <= 0)&&(__CLR4_4_14t84t8lb90p785.R.iget(6543)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6544)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6545);throw new NotPositiveException(LocalizedFormats.CANNOT_COMPUTE_NTH_ROOT_FOR_NEGATIVE_N,
                                           n);
        }

        }__CLR4_4_14t84t8lb90p785.R.inc(6546);final List<Complex> result = new ArrayList<Complex>();

        __CLR4_4_14t84t8lb90p785.R.inc(6547);if ((((isNaN)&&(__CLR4_4_14t84t8lb90p785.R.iget(6548)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6549)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6550);result.add(NaN);
            __CLR4_4_14t84t8lb90p785.R.inc(6551);return result;
        }
        }__CLR4_4_14t84t8lb90p785.R.inc(6552);if ((((isInfinite())&&(__CLR4_4_14t84t8lb90p785.R.iget(6553)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6554)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6555);result.add(INF);
            __CLR4_4_14t84t8lb90p785.R.inc(6556);return result;
        }

        // nth root of abs -- faster / more accurate to use a solver here?
        }__CLR4_4_14t84t8lb90p785.R.inc(6557);final double nthRootOfAbs = FastMath.pow(abs(), 1.0 / n);

        // Compute nth roots of complex number with k = 0, 1, ... n-1
        __CLR4_4_14t84t8lb90p785.R.inc(6558);final double nthPhi = getArgument() / n;
        __CLR4_4_14t84t8lb90p785.R.inc(6559);final double slice = 2 * FastMath.PI / n;
        __CLR4_4_14t84t8lb90p785.R.inc(6560);double innerPart = nthPhi;
        __CLR4_4_14t84t8lb90p785.R.inc(6561);for (int k = 0; (((k < n )&&(__CLR4_4_14t84t8lb90p785.R.iget(6562)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6563)==0&false)); k++) {{
            // inner part
            __CLR4_4_14t84t8lb90p785.R.inc(6564);final double realPart = nthRootOfAbs *  FastMath.cos(innerPart);
            __CLR4_4_14t84t8lb90p785.R.inc(6565);final double imaginaryPart = nthRootOfAbs *  FastMath.sin(innerPart);
            __CLR4_4_14t84t8lb90p785.R.inc(6566);result.add(createComplex(realPart, imaginaryPart));
            __CLR4_4_14t84t8lb90p785.R.inc(6567);innerPart += slice;
        }

        }__CLR4_4_14t84t8lb90p785.R.inc(6568);return result;
    }finally{__CLR4_4_14t84t8lb90p785.R.flushNeeded();}}

    /**
     * Create a complex number given the real and imaginary parts.
     *
     * @param realPart Real part.
     * @param imaginaryPart Imaginary part.
     * @return a new complex number instance.
     * @since 1.2
     * @see #valueOf(double, double)
     */
    protected Complex createComplex(double realPart,
                                    double imaginaryPart) {try{__CLR4_4_14t84t8lb90p785.R.inc(6569);
        __CLR4_4_14t84t8lb90p785.R.inc(6570);return new Complex(realPart, imaginaryPart);
    }finally{__CLR4_4_14t84t8lb90p785.R.flushNeeded();}}

    /**
     * Create a complex number given the real and imaginary parts.
     *
     * @param realPart Real part.
     * @param imaginaryPart Imaginary part.
     * @return a Complex instance.
     */
    public static Complex valueOf(double realPart,
                                  double imaginaryPart) {try{__CLR4_4_14t84t8lb90p785.R.inc(6571);
        __CLR4_4_14t84t8lb90p785.R.inc(6572);if ((((Double.isNaN(realPart) ||
            Double.isNaN(imaginaryPart))&&(__CLR4_4_14t84t8lb90p785.R.iget(6573)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6574)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6575);return NaN;
        }
        }__CLR4_4_14t84t8lb90p785.R.inc(6576);return new Complex(realPart, imaginaryPart);
    }finally{__CLR4_4_14t84t8lb90p785.R.flushNeeded();}}

    /**
     * Create a complex number given only the real part.
     *
     * @param realPart Real part.
     * @return a Complex instance.
     */
    public static Complex valueOf(double realPart) {try{__CLR4_4_14t84t8lb90p785.R.inc(6577);
        __CLR4_4_14t84t8lb90p785.R.inc(6578);if ((((Double.isNaN(realPart))&&(__CLR4_4_14t84t8lb90p785.R.iget(6579)!=0|true))||(__CLR4_4_14t84t8lb90p785.R.iget(6580)==0&false))) {{
            __CLR4_4_14t84t8lb90p785.R.inc(6581);return NaN;
        }
        }__CLR4_4_14t84t8lb90p785.R.inc(6582);return new Complex(realPart);
    }finally{__CLR4_4_14t84t8lb90p785.R.flushNeeded();}}

    /**
     * Resolve the transient fields in a deserialized Complex Object.
     * Subclasses will need to override {@link #createComplex} to
     * deserialize properly.
     *
     * @return A Complex instance with all fields resolved.
     * @since 2.0
     */
    protected final Object readResolve() {try{__CLR4_4_14t84t8lb90p785.R.inc(6583);
        __CLR4_4_14t84t8lb90p785.R.inc(6584);return createComplex(real, imaginary);
    }finally{__CLR4_4_14t84t8lb90p785.R.flushNeeded();}}

    /** {@inheritDoc} */
    public ComplexField getField() {try{__CLR4_4_14t84t8lb90p785.R.inc(6585);
        __CLR4_4_14t84t8lb90p785.R.inc(6586);return ComplexField.getInstance();
    }finally{__CLR4_4_14t84t8lb90p785.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public String toString() {try{__CLR4_4_14t84t8lb90p785.R.inc(6587);
        __CLR4_4_14t84t8lb90p785.R.inc(6588);return "(" + real + ", " + imaginary + ")";
    }finally{__CLR4_4_14t84t8lb90p785.R.flushNeeded();}}

}
