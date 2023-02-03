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
package org.apache.commons.math3.analysis.polynomials;

import java.io.Serializable;
import java.util.Arrays;

import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.analysis.DifferentiableUnivariateFunction;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.ParametricUnivariateFunction;
import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathUtils;

/**
 * Immutable representation of a real polynomial function with real coefficients.
 * <p>
 * <a href="http://mathworld.wolfram.com/HornersMethod.html">Horner's Method</a>
 * is used to evaluate the function.</p>
 *
 * @version $Id$
 */
public class PolynomialFunction implements UnivariateDifferentiableFunction, DifferentiableUnivariateFunction, Serializable {public static class __CLR4_4_13g23g2lb90p6zh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,4659,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Serialization identifier
     */
    private static final long serialVersionUID = -7726511984200295583L;
    /**
     * The coefficients of the polynomial, ordered by degree -- i.e.,
     * coefficients[0] is the constant term and coefficients[n] is the
     * coefficient of x^n where n is the degree of the polynomial.
     */
    private final double coefficients[];

    /**
     * Construct a polynomial with the given coefficients.  The first element
     * of the coefficients array is the constant term.  Higher degree
     * coefficients follow in sequence.  The degree of the resulting polynomial
     * is the index of the last non-null element of the array, or 0 if all elements
     * are null.
     * <p>
     * The constructor makes a copy of the input array and assigns the copy to
     * the coefficients property.</p>
     *
     * @param c Polynomial coefficients.
     * @throws NullArgumentException if {@code c} is {@code null}.
     * @throws NoDataException if {@code c} is empty.
     */
    public PolynomialFunction(double c[])
        throws NullArgumentException, NoDataException {
        super();__CLR4_4_13g23g2lb90p6zh.R.inc(4467);try{__CLR4_4_13g23g2lb90p6zh.R.inc(4466);
        __CLR4_4_13g23g2lb90p6zh.R.inc(4468);MathUtils.checkNotNull(c);
        __CLR4_4_13g23g2lb90p6zh.R.inc(4469);int n = c.length;
        __CLR4_4_13g23g2lb90p6zh.R.inc(4470);if ((((n == 0)&&(__CLR4_4_13g23g2lb90p6zh.R.iget(4471)!=0|true))||(__CLR4_4_13g23g2lb90p6zh.R.iget(4472)==0&false))) {{
            __CLR4_4_13g23g2lb90p6zh.R.inc(4473);throw new NoDataException(LocalizedFormats.EMPTY_POLYNOMIALS_COEFFICIENTS_ARRAY);
        }
        }__CLR4_4_13g23g2lb90p6zh.R.inc(4474);while (((((n > 1) && (c[n - 1] == 0))&&(__CLR4_4_13g23g2lb90p6zh.R.iget(4475)!=0|true))||(__CLR4_4_13g23g2lb90p6zh.R.iget(4476)==0&false))) {{
            __CLR4_4_13g23g2lb90p6zh.R.inc(4477);--n;
        }
        }__CLR4_4_13g23g2lb90p6zh.R.inc(4478);this.coefficients = new double[n];
        __CLR4_4_13g23g2lb90p6zh.R.inc(4479);System.arraycopy(c, 0, this.coefficients, 0, n);
    }finally{__CLR4_4_13g23g2lb90p6zh.R.flushNeeded();}}

    /**
     * Compute the value of the function for the given argument.
     * <p>
     *  The value returned is <br/>
     *  <code>coefficients[n] * x^n + ... + coefficients[1] * x  + coefficients[0]</code>
     * </p>
     *
     * @param x Argument for which the function value should be computed.
     * @return the value of the polynomial at the given point.
     * @see UnivariateFunction#value(double)
     */
    public double value(double x) {try{__CLR4_4_13g23g2lb90p6zh.R.inc(4480);
       __CLR4_4_13g23g2lb90p6zh.R.inc(4481);return evaluate(coefficients, x);
    }finally{__CLR4_4_13g23g2lb90p6zh.R.flushNeeded();}}

    /**
     * Returns the degree of the polynomial.
     *
     * @return the degree of the polynomial.
     */
    public int degree() {try{__CLR4_4_13g23g2lb90p6zh.R.inc(4482);
        __CLR4_4_13g23g2lb90p6zh.R.inc(4483);return coefficients.length - 1;
    }finally{__CLR4_4_13g23g2lb90p6zh.R.flushNeeded();}}

    /**
     * Returns a copy of the coefficients array.
     * <p>
     * Changes made to the returned copy will not affect the coefficients of
     * the polynomial.</p>
     *
     * @return a fresh copy of the coefficients array.
     */
    public double[] getCoefficients() {try{__CLR4_4_13g23g2lb90p6zh.R.inc(4484);
        __CLR4_4_13g23g2lb90p6zh.R.inc(4485);return coefficients.clone();
    }finally{__CLR4_4_13g23g2lb90p6zh.R.flushNeeded();}}

    /**
     * Uses Horner's Method to evaluate the polynomial with the given coefficients at
     * the argument.
     *
     * @param coefficients Coefficients of the polynomial to evaluate.
     * @param argument Input value.
     * @return the value of the polynomial.
     * @throws NoDataException if {@code coefficients} is empty.
     * @throws NullArgumentException if {@code coefficients} is {@code null}.
     */
    protected static double evaluate(double[] coefficients, double argument)
        throws NullArgumentException, NoDataException {try{__CLR4_4_13g23g2lb90p6zh.R.inc(4486);
        __CLR4_4_13g23g2lb90p6zh.R.inc(4487);MathUtils.checkNotNull(coefficients);
        __CLR4_4_13g23g2lb90p6zh.R.inc(4488);int n = coefficients.length;
        __CLR4_4_13g23g2lb90p6zh.R.inc(4489);if ((((n == 0)&&(__CLR4_4_13g23g2lb90p6zh.R.iget(4490)!=0|true))||(__CLR4_4_13g23g2lb90p6zh.R.iget(4491)==0&false))) {{
            __CLR4_4_13g23g2lb90p6zh.R.inc(4492);throw new NoDataException(LocalizedFormats.EMPTY_POLYNOMIALS_COEFFICIENTS_ARRAY);
        }
        }__CLR4_4_13g23g2lb90p6zh.R.inc(4493);double result = coefficients[n - 1];
        __CLR4_4_13g23g2lb90p6zh.R.inc(4494);for (int j = n - 2; (((j >= 0)&&(__CLR4_4_13g23g2lb90p6zh.R.iget(4495)!=0|true))||(__CLR4_4_13g23g2lb90p6zh.R.iget(4496)==0&false)); j--) {{
            __CLR4_4_13g23g2lb90p6zh.R.inc(4497);result = argument * result + coefficients[j];
        }
        }__CLR4_4_13g23g2lb90p6zh.R.inc(4498);return result;
    }finally{__CLR4_4_13g23g2lb90p6zh.R.flushNeeded();}}


    /** {@inheritDoc}
     * @since 3.1
     * @throws NoDataException if {@code coefficients} is empty.
     * @throws NullArgumentException if {@code coefficients} is {@code null}.
     */
    public DerivativeStructure value(final DerivativeStructure t)
        throws NullArgumentException, NoDataException {try{__CLR4_4_13g23g2lb90p6zh.R.inc(4499);
        __CLR4_4_13g23g2lb90p6zh.R.inc(4500);MathUtils.checkNotNull(coefficients);
        __CLR4_4_13g23g2lb90p6zh.R.inc(4501);int n = coefficients.length;
        __CLR4_4_13g23g2lb90p6zh.R.inc(4502);if ((((n == 0)&&(__CLR4_4_13g23g2lb90p6zh.R.iget(4503)!=0|true))||(__CLR4_4_13g23g2lb90p6zh.R.iget(4504)==0&false))) {{
            __CLR4_4_13g23g2lb90p6zh.R.inc(4505);throw new NoDataException(LocalizedFormats.EMPTY_POLYNOMIALS_COEFFICIENTS_ARRAY);
        }
        }__CLR4_4_13g23g2lb90p6zh.R.inc(4506);DerivativeStructure result =
                new DerivativeStructure(t.getFreeParameters(), t.getOrder(), coefficients[n - 1]);
        __CLR4_4_13g23g2lb90p6zh.R.inc(4507);for (int j = n - 2; (((j >= 0)&&(__CLR4_4_13g23g2lb90p6zh.R.iget(4508)!=0|true))||(__CLR4_4_13g23g2lb90p6zh.R.iget(4509)==0&false)); j--) {{
            __CLR4_4_13g23g2lb90p6zh.R.inc(4510);result = result.multiply(t).add(coefficients[j]);
        }
        }__CLR4_4_13g23g2lb90p6zh.R.inc(4511);return result;
    }finally{__CLR4_4_13g23g2lb90p6zh.R.flushNeeded();}}

    /**
     * Add a polynomial to the instance.
     *
     * @param p Polynomial to add.
     * @return a new polynomial which is the sum of the instance and {@code p}.
     */
    public PolynomialFunction add(final PolynomialFunction p) {try{__CLR4_4_13g23g2lb90p6zh.R.inc(4512);
        // identify the lowest degree polynomial
        __CLR4_4_13g23g2lb90p6zh.R.inc(4513);final int lowLength  = FastMath.min(coefficients.length, p.coefficients.length);
        __CLR4_4_13g23g2lb90p6zh.R.inc(4514);final int highLength = FastMath.max(coefficients.length, p.coefficients.length);

        // build the coefficients array
        __CLR4_4_13g23g2lb90p6zh.R.inc(4515);double[] newCoefficients = new double[highLength];
        __CLR4_4_13g23g2lb90p6zh.R.inc(4516);for (int i = 0; (((i < lowLength)&&(__CLR4_4_13g23g2lb90p6zh.R.iget(4517)!=0|true))||(__CLR4_4_13g23g2lb90p6zh.R.iget(4518)==0&false)); ++i) {{
            __CLR4_4_13g23g2lb90p6zh.R.inc(4519);newCoefficients[i] = coefficients[i] + p.coefficients[i];
        }
        }__CLR4_4_13g23g2lb90p6zh.R.inc(4520);System.arraycopy(((((coefficients.length < p.coefficients.length) )&&(__CLR4_4_13g23g2lb90p6zh.R.iget(4521)!=0|true))||(__CLR4_4_13g23g2lb90p6zh.R.iget(4522)==0&false))?
                         p.coefficients : coefficients,
                         lowLength,
                         newCoefficients, lowLength,
                         highLength - lowLength);

        __CLR4_4_13g23g2lb90p6zh.R.inc(4523);return new PolynomialFunction(newCoefficients);
    }finally{__CLR4_4_13g23g2lb90p6zh.R.flushNeeded();}}

    /**
     * Subtract a polynomial from the instance.
     *
     * @param p Polynomial to subtract.
     * @return a new polynomial which is the difference the instance minus {@code p}.
     */
    public PolynomialFunction subtract(final PolynomialFunction p) {try{__CLR4_4_13g23g2lb90p6zh.R.inc(4524);
        // identify the lowest degree polynomial
        __CLR4_4_13g23g2lb90p6zh.R.inc(4525);int lowLength  = FastMath.min(coefficients.length, p.coefficients.length);
        __CLR4_4_13g23g2lb90p6zh.R.inc(4526);int highLength = FastMath.max(coefficients.length, p.coefficients.length);

        // build the coefficients array
        __CLR4_4_13g23g2lb90p6zh.R.inc(4527);double[] newCoefficients = new double[highLength];
        __CLR4_4_13g23g2lb90p6zh.R.inc(4528);for (int i = 0; (((i < lowLength)&&(__CLR4_4_13g23g2lb90p6zh.R.iget(4529)!=0|true))||(__CLR4_4_13g23g2lb90p6zh.R.iget(4530)==0&false)); ++i) {{
            __CLR4_4_13g23g2lb90p6zh.R.inc(4531);newCoefficients[i] = coefficients[i] - p.coefficients[i];
        }
        }__CLR4_4_13g23g2lb90p6zh.R.inc(4532);if ((((coefficients.length < p.coefficients.length)&&(__CLR4_4_13g23g2lb90p6zh.R.iget(4533)!=0|true))||(__CLR4_4_13g23g2lb90p6zh.R.iget(4534)==0&false))) {{
            __CLR4_4_13g23g2lb90p6zh.R.inc(4535);for (int i = lowLength; (((i < highLength)&&(__CLR4_4_13g23g2lb90p6zh.R.iget(4536)!=0|true))||(__CLR4_4_13g23g2lb90p6zh.R.iget(4537)==0&false)); ++i) {{
                __CLR4_4_13g23g2lb90p6zh.R.inc(4538);newCoefficients[i] = -p.coefficients[i];
            }
        }} }else {{
            __CLR4_4_13g23g2lb90p6zh.R.inc(4539);System.arraycopy(coefficients, lowLength, newCoefficients, lowLength,
                             highLength - lowLength);
        }

        }__CLR4_4_13g23g2lb90p6zh.R.inc(4540);return new PolynomialFunction(newCoefficients);
    }finally{__CLR4_4_13g23g2lb90p6zh.R.flushNeeded();}}

    /**
     * Negate the instance.
     *
     * @return a new polynomial.
     */
    public PolynomialFunction negate() {try{__CLR4_4_13g23g2lb90p6zh.R.inc(4541);
        __CLR4_4_13g23g2lb90p6zh.R.inc(4542);double[] newCoefficients = new double[coefficients.length];
        __CLR4_4_13g23g2lb90p6zh.R.inc(4543);for (int i = 0; (((i < coefficients.length)&&(__CLR4_4_13g23g2lb90p6zh.R.iget(4544)!=0|true))||(__CLR4_4_13g23g2lb90p6zh.R.iget(4545)==0&false)); ++i) {{
            __CLR4_4_13g23g2lb90p6zh.R.inc(4546);newCoefficients[i] = -coefficients[i];
        }
        }__CLR4_4_13g23g2lb90p6zh.R.inc(4547);return new PolynomialFunction(newCoefficients);
    }finally{__CLR4_4_13g23g2lb90p6zh.R.flushNeeded();}}

    /**
     * Multiply the instance by a polynomial.
     *
     * @param p Polynomial to multiply by.
     * @return a new polynomial.
     */
    public PolynomialFunction multiply(final PolynomialFunction p) {try{__CLR4_4_13g23g2lb90p6zh.R.inc(4548);
        __CLR4_4_13g23g2lb90p6zh.R.inc(4549);double[] newCoefficients = new double[coefficients.length + p.coefficients.length - 1];

        __CLR4_4_13g23g2lb90p6zh.R.inc(4550);for (int i = 0; (((i < newCoefficients.length)&&(__CLR4_4_13g23g2lb90p6zh.R.iget(4551)!=0|true))||(__CLR4_4_13g23g2lb90p6zh.R.iget(4552)==0&false)); ++i) {{
            __CLR4_4_13g23g2lb90p6zh.R.inc(4553);newCoefficients[i] = 0.0;
            __CLR4_4_13g23g2lb90p6zh.R.inc(4554);for (int j = FastMath.max(0, i + 1 - p.coefficients.length);
                 (((j < FastMath.min(coefficients.length, i + 1))&&(__CLR4_4_13g23g2lb90p6zh.R.iget(4555)!=0|true))||(__CLR4_4_13g23g2lb90p6zh.R.iget(4556)==0&false));
                 ++j) {{
                __CLR4_4_13g23g2lb90p6zh.R.inc(4557);newCoefficients[i] += coefficients[j] * p.coefficients[i-j];
            }
        }}

        }__CLR4_4_13g23g2lb90p6zh.R.inc(4558);return new PolynomialFunction(newCoefficients);
    }finally{__CLR4_4_13g23g2lb90p6zh.R.flushNeeded();}}

    /**
     * Returns the coefficients of the derivative of the polynomial with the given coefficients.
     *
     * @param coefficients Coefficients of the polynomial to differentiate.
     * @return the coefficients of the derivative or {@code null} if coefficients has length 1.
     * @throws NoDataException if {@code coefficients} is empty.
     * @throws NullArgumentException if {@code coefficients} is {@code null}.
     */
    protected static double[] differentiate(double[] coefficients)
        throws NullArgumentException, NoDataException {try{__CLR4_4_13g23g2lb90p6zh.R.inc(4559);
        __CLR4_4_13g23g2lb90p6zh.R.inc(4560);MathUtils.checkNotNull(coefficients);
        __CLR4_4_13g23g2lb90p6zh.R.inc(4561);int n = coefficients.length;
        __CLR4_4_13g23g2lb90p6zh.R.inc(4562);if ((((n == 0)&&(__CLR4_4_13g23g2lb90p6zh.R.iget(4563)!=0|true))||(__CLR4_4_13g23g2lb90p6zh.R.iget(4564)==0&false))) {{
            __CLR4_4_13g23g2lb90p6zh.R.inc(4565);throw new NoDataException(LocalizedFormats.EMPTY_POLYNOMIALS_COEFFICIENTS_ARRAY);
        }
        }__CLR4_4_13g23g2lb90p6zh.R.inc(4566);if ((((n == 1)&&(__CLR4_4_13g23g2lb90p6zh.R.iget(4567)!=0|true))||(__CLR4_4_13g23g2lb90p6zh.R.iget(4568)==0&false))) {{
            __CLR4_4_13g23g2lb90p6zh.R.inc(4569);return new double[]{0};
        }
        }__CLR4_4_13g23g2lb90p6zh.R.inc(4570);double[] result = new double[n - 1];
        __CLR4_4_13g23g2lb90p6zh.R.inc(4571);for (int i = n - 1; (((i > 0)&&(__CLR4_4_13g23g2lb90p6zh.R.iget(4572)!=0|true))||(__CLR4_4_13g23g2lb90p6zh.R.iget(4573)==0&false)); i--) {{
            __CLR4_4_13g23g2lb90p6zh.R.inc(4574);result[i - 1] = i * coefficients[i];
        }
        }__CLR4_4_13g23g2lb90p6zh.R.inc(4575);return result;
    }finally{__CLR4_4_13g23g2lb90p6zh.R.flushNeeded();}}

    /**
     * Returns the derivative as a {@link PolynomialFunction}.
     *
     * @return the derivative polynomial.
     */
    public PolynomialFunction polynomialDerivative() {try{__CLR4_4_13g23g2lb90p6zh.R.inc(4576);
        __CLR4_4_13g23g2lb90p6zh.R.inc(4577);return new PolynomialFunction(differentiate(coefficients));
    }finally{__CLR4_4_13g23g2lb90p6zh.R.flushNeeded();}}

    /**
     * Returns the derivative as a {@link UnivariateFunction}.
     *
     * @return the derivative function.
     */
    public UnivariateFunction derivative() {try{__CLR4_4_13g23g2lb90p6zh.R.inc(4578);
        __CLR4_4_13g23g2lb90p6zh.R.inc(4579);return polynomialDerivative();
    }finally{__CLR4_4_13g23g2lb90p6zh.R.flushNeeded();}}

    /**
     * Returns a string representation of the polynomial.
     *
     * <p>The representation is user oriented. Terms are displayed lowest
     * degrees first. The multiplications signs, coefficients equals to
     * one and null terms are not displayed (except if the polynomial is 0,
     * in which case the 0 constant term is displayed). Addition of terms
     * with negative coefficients are replaced by subtraction of terms
     * with positive coefficients except for the first displayed term
     * (i.e. we display <code>-3</code> for a constant negative polynomial,
     * but <code>1 - 3 x + x^2</code> if the negative coefficient is not
     * the first one displayed).</p>
     *
     * @return a string representation of the polynomial.
     */
    @Override
    public String toString() {try{__CLR4_4_13g23g2lb90p6zh.R.inc(4580);
        __CLR4_4_13g23g2lb90p6zh.R.inc(4581);StringBuilder s = new StringBuilder();
        __CLR4_4_13g23g2lb90p6zh.R.inc(4582);if ((((coefficients[0] == 0.0)&&(__CLR4_4_13g23g2lb90p6zh.R.iget(4583)!=0|true))||(__CLR4_4_13g23g2lb90p6zh.R.iget(4584)==0&false))) {{
            __CLR4_4_13g23g2lb90p6zh.R.inc(4585);if ((((coefficients.length == 1)&&(__CLR4_4_13g23g2lb90p6zh.R.iget(4586)!=0|true))||(__CLR4_4_13g23g2lb90p6zh.R.iget(4587)==0&false))) {{
                __CLR4_4_13g23g2lb90p6zh.R.inc(4588);return "0";
            }
        }} }else {{
            __CLR4_4_13g23g2lb90p6zh.R.inc(4589);s.append(toString(coefficients[0]));
        }

        }__CLR4_4_13g23g2lb90p6zh.R.inc(4590);for (int i = 1; (((i < coefficients.length)&&(__CLR4_4_13g23g2lb90p6zh.R.iget(4591)!=0|true))||(__CLR4_4_13g23g2lb90p6zh.R.iget(4592)==0&false)); ++i) {{
            __CLR4_4_13g23g2lb90p6zh.R.inc(4593);if ((((coefficients[i] != 0)&&(__CLR4_4_13g23g2lb90p6zh.R.iget(4594)!=0|true))||(__CLR4_4_13g23g2lb90p6zh.R.iget(4595)==0&false))) {{
                __CLR4_4_13g23g2lb90p6zh.R.inc(4596);if ((((s.length() > 0)&&(__CLR4_4_13g23g2lb90p6zh.R.iget(4597)!=0|true))||(__CLR4_4_13g23g2lb90p6zh.R.iget(4598)==0&false))) {{
                    __CLR4_4_13g23g2lb90p6zh.R.inc(4599);if ((((coefficients[i] < 0)&&(__CLR4_4_13g23g2lb90p6zh.R.iget(4600)!=0|true))||(__CLR4_4_13g23g2lb90p6zh.R.iget(4601)==0&false))) {{
                        __CLR4_4_13g23g2lb90p6zh.R.inc(4602);s.append(" - ");
                    } }else {{
                        __CLR4_4_13g23g2lb90p6zh.R.inc(4603);s.append(" + ");
                    }
                }} }else {{
                    __CLR4_4_13g23g2lb90p6zh.R.inc(4604);if ((((coefficients[i] < 0)&&(__CLR4_4_13g23g2lb90p6zh.R.iget(4605)!=0|true))||(__CLR4_4_13g23g2lb90p6zh.R.iget(4606)==0&false))) {{
                        __CLR4_4_13g23g2lb90p6zh.R.inc(4607);s.append("-");
                    }
                }}

                }__CLR4_4_13g23g2lb90p6zh.R.inc(4608);double absAi = FastMath.abs(coefficients[i]);
                __CLR4_4_13g23g2lb90p6zh.R.inc(4609);if (((((absAi - 1) != 0)&&(__CLR4_4_13g23g2lb90p6zh.R.iget(4610)!=0|true))||(__CLR4_4_13g23g2lb90p6zh.R.iget(4611)==0&false))) {{
                    __CLR4_4_13g23g2lb90p6zh.R.inc(4612);s.append(toString(absAi));
                    __CLR4_4_13g23g2lb90p6zh.R.inc(4613);s.append(' ');
                }

                }__CLR4_4_13g23g2lb90p6zh.R.inc(4614);s.append("x");
                __CLR4_4_13g23g2lb90p6zh.R.inc(4615);if ((((i > 1)&&(__CLR4_4_13g23g2lb90p6zh.R.iget(4616)!=0|true))||(__CLR4_4_13g23g2lb90p6zh.R.iget(4617)==0&false))) {{
                    __CLR4_4_13g23g2lb90p6zh.R.inc(4618);s.append('^');
                    __CLR4_4_13g23g2lb90p6zh.R.inc(4619);s.append(Integer.toString(i));
                }
            }}
        }}

        }__CLR4_4_13g23g2lb90p6zh.R.inc(4620);return s.toString();
    }finally{__CLR4_4_13g23g2lb90p6zh.R.flushNeeded();}}

    /**
     * Creates a string representing a coefficient, removing ".0" endings.
     *
     * @param coeff Coefficient.
     * @return a string representation of {@code coeff}.
     */
    private static String toString(double coeff) {try{__CLR4_4_13g23g2lb90p6zh.R.inc(4621);
        __CLR4_4_13g23g2lb90p6zh.R.inc(4622);final String c = Double.toString(coeff);
        __CLR4_4_13g23g2lb90p6zh.R.inc(4623);if ((((c.endsWith(".0"))&&(__CLR4_4_13g23g2lb90p6zh.R.iget(4624)!=0|true))||(__CLR4_4_13g23g2lb90p6zh.R.iget(4625)==0&false))) {{
            __CLR4_4_13g23g2lb90p6zh.R.inc(4626);return c.substring(0, c.length() - 2);
        } }else {{
            __CLR4_4_13g23g2lb90p6zh.R.inc(4627);return c;
        }
    }}finally{__CLR4_4_13g23g2lb90p6zh.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public int hashCode() {try{__CLR4_4_13g23g2lb90p6zh.R.inc(4628);
        __CLR4_4_13g23g2lb90p6zh.R.inc(4629);final int prime = 31;
        __CLR4_4_13g23g2lb90p6zh.R.inc(4630);int result = 1;
        __CLR4_4_13g23g2lb90p6zh.R.inc(4631);result = prime * result + Arrays.hashCode(coefficients);
        __CLR4_4_13g23g2lb90p6zh.R.inc(4632);return result;
    }finally{__CLR4_4_13g23g2lb90p6zh.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public boolean equals(Object obj) {try{__CLR4_4_13g23g2lb90p6zh.R.inc(4633);
        __CLR4_4_13g23g2lb90p6zh.R.inc(4634);if ((((this == obj)&&(__CLR4_4_13g23g2lb90p6zh.R.iget(4635)!=0|true))||(__CLR4_4_13g23g2lb90p6zh.R.iget(4636)==0&false))) {{
            __CLR4_4_13g23g2lb90p6zh.R.inc(4637);return true;
        }
        }__CLR4_4_13g23g2lb90p6zh.R.inc(4638);if ((((!(obj instanceof PolynomialFunction))&&(__CLR4_4_13g23g2lb90p6zh.R.iget(4639)!=0|true))||(__CLR4_4_13g23g2lb90p6zh.R.iget(4640)==0&false))) {{
            __CLR4_4_13g23g2lb90p6zh.R.inc(4641);return false;
        }
        }__CLR4_4_13g23g2lb90p6zh.R.inc(4642);PolynomialFunction other = (PolynomialFunction) obj;
        __CLR4_4_13g23g2lb90p6zh.R.inc(4643);if ((((!Arrays.equals(coefficients, other.coefficients))&&(__CLR4_4_13g23g2lb90p6zh.R.iget(4644)!=0|true))||(__CLR4_4_13g23g2lb90p6zh.R.iget(4645)==0&false))) {{
            __CLR4_4_13g23g2lb90p6zh.R.inc(4646);return false;
        }
        }__CLR4_4_13g23g2lb90p6zh.R.inc(4647);return true;
    }finally{__CLR4_4_13g23g2lb90p6zh.R.flushNeeded();}}

    /**
     * Dedicated parametric polynomial class.
     *
     * @since 3.0
     */
    public static class Parametric implements ParametricUnivariateFunction {
        /** {@inheritDoc} */
        public double[] gradient(double x, double ... parameters) {try{__CLR4_4_13g23g2lb90p6zh.R.inc(4648);
            __CLR4_4_13g23g2lb90p6zh.R.inc(4649);final double[] gradient = new double[parameters.length];
            __CLR4_4_13g23g2lb90p6zh.R.inc(4650);double xn = 1.0;
            __CLR4_4_13g23g2lb90p6zh.R.inc(4651);for (int i = 0; (((i < parameters.length)&&(__CLR4_4_13g23g2lb90p6zh.R.iget(4652)!=0|true))||(__CLR4_4_13g23g2lb90p6zh.R.iget(4653)==0&false)); ++i) {{
                __CLR4_4_13g23g2lb90p6zh.R.inc(4654);gradient[i] = xn;
                __CLR4_4_13g23g2lb90p6zh.R.inc(4655);xn *= x;
            }
            }__CLR4_4_13g23g2lb90p6zh.R.inc(4656);return gradient;
        }finally{__CLR4_4_13g23g2lb90p6zh.R.flushNeeded();}}

        /** {@inheritDoc} */
        public double value(final double x, final double ... parameters)
            throws NoDataException {try{__CLR4_4_13g23g2lb90p6zh.R.inc(4657);
            __CLR4_4_13g23g2lb90p6zh.R.inc(4658);return PolynomialFunction.evaluate(parameters, x);
        }finally{__CLR4_4_13g23g2lb90p6zh.R.flushNeeded();}}
    }
}
