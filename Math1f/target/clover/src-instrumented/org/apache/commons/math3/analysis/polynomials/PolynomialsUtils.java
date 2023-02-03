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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.math3.fraction.BigFraction;
import org.apache.commons.math3.util.CombinatoricsUtils;
import org.apache.commons.math3.util.FastMath;

/**
 * A collection of static methods that operate on or return polynomials.
 *
 * @version $Id$
 * @since 2.0
 */
public class PolynomialsUtils {public static class __CLR4_4_13t43t4lb90p71i{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,5064,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Coefficients for Chebyshev polynomials. */
    private static final List<BigFraction> CHEBYSHEV_COEFFICIENTS;

    /** Coefficients for Hermite polynomials. */
    private static final List<BigFraction> HERMITE_COEFFICIENTS;

    /** Coefficients for Laguerre polynomials. */
    private static final List<BigFraction> LAGUERRE_COEFFICIENTS;

    /** Coefficients for Legendre polynomials. */
    private static final List<BigFraction> LEGENDRE_COEFFICIENTS;

    /** Coefficients for Jacobi polynomials. */
    private static final Map<JacobiKey, List<BigFraction>> JACOBI_COEFFICIENTS;

    static {try{__CLR4_4_13t43t4lb90p71i.R.inc(4936);

        // initialize recurrence for Chebyshev polynomials
        // T0(X) = 1, T1(X) = 0 + 1 * X
        __CLR4_4_13t43t4lb90p71i.R.inc(4937);CHEBYSHEV_COEFFICIENTS = new ArrayList<BigFraction>();
        __CLR4_4_13t43t4lb90p71i.R.inc(4938);CHEBYSHEV_COEFFICIENTS.add(BigFraction.ONE);
        __CLR4_4_13t43t4lb90p71i.R.inc(4939);CHEBYSHEV_COEFFICIENTS.add(BigFraction.ZERO);
        __CLR4_4_13t43t4lb90p71i.R.inc(4940);CHEBYSHEV_COEFFICIENTS.add(BigFraction.ONE);

        // initialize recurrence for Hermite polynomials
        // H0(X) = 1, H1(X) = 0 + 2 * X
        __CLR4_4_13t43t4lb90p71i.R.inc(4941);HERMITE_COEFFICIENTS = new ArrayList<BigFraction>();
        __CLR4_4_13t43t4lb90p71i.R.inc(4942);HERMITE_COEFFICIENTS.add(BigFraction.ONE);
        __CLR4_4_13t43t4lb90p71i.R.inc(4943);HERMITE_COEFFICIENTS.add(BigFraction.ZERO);
        __CLR4_4_13t43t4lb90p71i.R.inc(4944);HERMITE_COEFFICIENTS.add(BigFraction.TWO);

        // initialize recurrence for Laguerre polynomials
        // L0(X) = 1, L1(X) = 1 - 1 * X
        __CLR4_4_13t43t4lb90p71i.R.inc(4945);LAGUERRE_COEFFICIENTS = new ArrayList<BigFraction>();
        __CLR4_4_13t43t4lb90p71i.R.inc(4946);LAGUERRE_COEFFICIENTS.add(BigFraction.ONE);
        __CLR4_4_13t43t4lb90p71i.R.inc(4947);LAGUERRE_COEFFICIENTS.add(BigFraction.ONE);
        __CLR4_4_13t43t4lb90p71i.R.inc(4948);LAGUERRE_COEFFICIENTS.add(BigFraction.MINUS_ONE);

        // initialize recurrence for Legendre polynomials
        // P0(X) = 1, P1(X) = 0 + 1 * X
        __CLR4_4_13t43t4lb90p71i.R.inc(4949);LEGENDRE_COEFFICIENTS = new ArrayList<BigFraction>();
        __CLR4_4_13t43t4lb90p71i.R.inc(4950);LEGENDRE_COEFFICIENTS.add(BigFraction.ONE);
        __CLR4_4_13t43t4lb90p71i.R.inc(4951);LEGENDRE_COEFFICIENTS.add(BigFraction.ZERO);
        __CLR4_4_13t43t4lb90p71i.R.inc(4952);LEGENDRE_COEFFICIENTS.add(BigFraction.ONE);

        // initialize map for Jacobi polynomials
        __CLR4_4_13t43t4lb90p71i.R.inc(4953);JACOBI_COEFFICIENTS = new HashMap<JacobiKey, List<BigFraction>>();

    }finally{__CLR4_4_13t43t4lb90p71i.R.flushNeeded();}}

    /**
     * Private constructor, to prevent instantiation.
     */
    private PolynomialsUtils() {try{__CLR4_4_13t43t4lb90p71i.R.inc(4954);
    }finally{__CLR4_4_13t43t4lb90p71i.R.flushNeeded();}}

    /**
     * Create a Chebyshev polynomial of the first kind.
     * <p><a href="http://mathworld.wolfram.com/ChebyshevPolynomialoftheFirstKind.html">Chebyshev
     * polynomials of the first kind</a> are orthogonal polynomials.
     * They can be defined by the following recurrence relations:
     * <pre>
     *  T<sub>0</sub>(X)   = 1
     *  T<sub>1</sub>(X)   = X
     *  T<sub>k+1</sub>(X) = 2X T<sub>k</sub>(X) - T<sub>k-1</sub>(X)
     * </pre></p>
     * @param degree degree of the polynomial
     * @return Chebyshev polynomial of specified degree
     */
    public static PolynomialFunction createChebyshevPolynomial(final int degree) {try{__CLR4_4_13t43t4lb90p71i.R.inc(4955);
        __CLR4_4_13t43t4lb90p71i.R.inc(4956);return buildPolynomial(degree, CHEBYSHEV_COEFFICIENTS,
                new RecurrenceCoefficientsGenerator() {
            private final BigFraction[] coeffs = { BigFraction.ZERO, BigFraction.TWO, BigFraction.ONE };
            /** {@inheritDoc} */
            public BigFraction[] generate(int k) {try{__CLR4_4_13t43t4lb90p71i.R.inc(4957);
                __CLR4_4_13t43t4lb90p71i.R.inc(4958);return coeffs;
            }finally{__CLR4_4_13t43t4lb90p71i.R.flushNeeded();}}
        });
    }finally{__CLR4_4_13t43t4lb90p71i.R.flushNeeded();}}

    /**
     * Create a Hermite polynomial.
     * <p><a href="http://mathworld.wolfram.com/HermitePolynomial.html">Hermite
     * polynomials</a> are orthogonal polynomials.
     * They can be defined by the following recurrence relations:
     * <pre>
     *  H<sub>0</sub>(X)   = 1
     *  H<sub>1</sub>(X)   = 2X
     *  H<sub>k+1</sub>(X) = 2X H<sub>k</sub>(X) - 2k H<sub>k-1</sub>(X)
     * </pre></p>

     * @param degree degree of the polynomial
     * @return Hermite polynomial of specified degree
     */
    public static PolynomialFunction createHermitePolynomial(final int degree) {try{__CLR4_4_13t43t4lb90p71i.R.inc(4959);
        __CLR4_4_13t43t4lb90p71i.R.inc(4960);return buildPolynomial(degree, HERMITE_COEFFICIENTS,
                new RecurrenceCoefficientsGenerator() {
            /** {@inheritDoc} */
            public BigFraction[] generate(int k) {try{__CLR4_4_13t43t4lb90p71i.R.inc(4961);
                __CLR4_4_13t43t4lb90p71i.R.inc(4962);return new BigFraction[] {
                        BigFraction.ZERO,
                        BigFraction.TWO,
                        new BigFraction(2 * k)};
            }finally{__CLR4_4_13t43t4lb90p71i.R.flushNeeded();}}
        });
    }finally{__CLR4_4_13t43t4lb90p71i.R.flushNeeded();}}

    /**
     * Create a Laguerre polynomial.
     * <p><a href="http://mathworld.wolfram.com/LaguerrePolynomial.html">Laguerre
     * polynomials</a> are orthogonal polynomials.
     * They can be defined by the following recurrence relations:
     * <pre>
     *        L<sub>0</sub>(X)   = 1
     *        L<sub>1</sub>(X)   = 1 - X
     *  (k+1) L<sub>k+1</sub>(X) = (2k + 1 - X) L<sub>k</sub>(X) - k L<sub>k-1</sub>(X)
     * </pre></p>
     * @param degree degree of the polynomial
     * @return Laguerre polynomial of specified degree
     */
    public static PolynomialFunction createLaguerrePolynomial(final int degree) {try{__CLR4_4_13t43t4lb90p71i.R.inc(4963);
        __CLR4_4_13t43t4lb90p71i.R.inc(4964);return buildPolynomial(degree, LAGUERRE_COEFFICIENTS,
                new RecurrenceCoefficientsGenerator() {
            /** {@inheritDoc} */
            public BigFraction[] generate(int k) {try{__CLR4_4_13t43t4lb90p71i.R.inc(4965);
                __CLR4_4_13t43t4lb90p71i.R.inc(4966);final int kP1 = k + 1;
                __CLR4_4_13t43t4lb90p71i.R.inc(4967);return new BigFraction[] {
                        new BigFraction(2 * k + 1, kP1),
                        new BigFraction(-1, kP1),
                        new BigFraction(k, kP1)};
            }finally{__CLR4_4_13t43t4lb90p71i.R.flushNeeded();}}
        });
    }finally{__CLR4_4_13t43t4lb90p71i.R.flushNeeded();}}

    /**
     * Create a Legendre polynomial.
     * <p><a href="http://mathworld.wolfram.com/LegendrePolynomial.html">Legendre
     * polynomials</a> are orthogonal polynomials.
     * They can be defined by the following recurrence relations:
     * <pre>
     *        P<sub>0</sub>(X)   = 1
     *        P<sub>1</sub>(X)   = X
     *  (k+1) P<sub>k+1</sub>(X) = (2k+1) X P<sub>k</sub>(X) - k P<sub>k-1</sub>(X)
     * </pre></p>
     * @param degree degree of the polynomial
     * @return Legendre polynomial of specified degree
     */
    public static PolynomialFunction createLegendrePolynomial(final int degree) {try{__CLR4_4_13t43t4lb90p71i.R.inc(4968);
        __CLR4_4_13t43t4lb90p71i.R.inc(4969);return buildPolynomial(degree, LEGENDRE_COEFFICIENTS,
                               new RecurrenceCoefficientsGenerator() {
            /** {@inheritDoc} */
            public BigFraction[] generate(int k) {try{__CLR4_4_13t43t4lb90p71i.R.inc(4970);
                __CLR4_4_13t43t4lb90p71i.R.inc(4971);final int kP1 = k + 1;
                __CLR4_4_13t43t4lb90p71i.R.inc(4972);return new BigFraction[] {
                        BigFraction.ZERO,
                        new BigFraction(k + kP1, kP1),
                        new BigFraction(k, kP1)};
            }finally{__CLR4_4_13t43t4lb90p71i.R.flushNeeded();}}
        });
    }finally{__CLR4_4_13t43t4lb90p71i.R.flushNeeded();}}

    /**
     * Create a Jacobi polynomial.
     * <p><a href="http://mathworld.wolfram.com/JacobiPolynomial.html">Jacobi
     * polynomials</a> are orthogonal polynomials.
     * They can be defined by the following recurrence relations:
     * <pre>
     *        P<sub>0</sub><sup>vw</sup>(X)   = 1
     *        P<sub>-1</sub><sup>vw</sup>(X)  = 0
     *  2k(k + v + w)(2k + v + w - 2) P<sub>k</sub><sup>vw</sup>(X) =
     *  (2k + v + w - 1)[(2k + v + w)(2k + v + w - 2) X + v<sup>2</sup> - w<sup>2</sup>] P<sub>k-1</sub><sup>vw</sup>(X)
     *  - 2(k + v - 1)(k + w - 1)(2k + v + w) P<sub>k-2</sub><sup>vw</sup>(X)
     * </pre></p>
     * @param degree degree of the polynomial
     * @param v first exponent
     * @param w second exponent
     * @return Jacobi polynomial of specified degree
     */
    public static PolynomialFunction createJacobiPolynomial(final int degree, final int v, final int w) {try{__CLR4_4_13t43t4lb90p71i.R.inc(4973);

        // select the appropriate list
        __CLR4_4_13t43t4lb90p71i.R.inc(4974);final JacobiKey key = new JacobiKey(v, w);

        __CLR4_4_13t43t4lb90p71i.R.inc(4975);if ((((!JACOBI_COEFFICIENTS.containsKey(key))&&(__CLR4_4_13t43t4lb90p71i.R.iget(4976)!=0|true))||(__CLR4_4_13t43t4lb90p71i.R.iget(4977)==0&false))) {{

            // allocate a new list for v, w
            __CLR4_4_13t43t4lb90p71i.R.inc(4978);final List<BigFraction> list = new ArrayList<BigFraction>();
            __CLR4_4_13t43t4lb90p71i.R.inc(4979);JACOBI_COEFFICIENTS.put(key, list);

            // Pv,w,0(x) = 1;
            __CLR4_4_13t43t4lb90p71i.R.inc(4980);list.add(BigFraction.ONE);

            // P1(x) = (v - w) / 2 + (2 + v + w) * X / 2
            __CLR4_4_13t43t4lb90p71i.R.inc(4981);list.add(new BigFraction(v - w, 2));
            __CLR4_4_13t43t4lb90p71i.R.inc(4982);list.add(new BigFraction(2 + v + w, 2));

        }

        }__CLR4_4_13t43t4lb90p71i.R.inc(4983);return buildPolynomial(degree, JACOBI_COEFFICIENTS.get(key),
                               new RecurrenceCoefficientsGenerator() {
            /** {@inheritDoc} */
            public BigFraction[] generate(int k) {try{__CLR4_4_13t43t4lb90p71i.R.inc(4984);
                __CLR4_4_13t43t4lb90p71i.R.inc(4985);k++;
                __CLR4_4_13t43t4lb90p71i.R.inc(4986);final int kvw      = k + v + w;
                __CLR4_4_13t43t4lb90p71i.R.inc(4987);final int twoKvw   = kvw + k;
                __CLR4_4_13t43t4lb90p71i.R.inc(4988);final int twoKvwM1 = twoKvw - 1;
                __CLR4_4_13t43t4lb90p71i.R.inc(4989);final int twoKvwM2 = twoKvw - 2;
                __CLR4_4_13t43t4lb90p71i.R.inc(4990);final int den      = 2 * k *  kvw * twoKvwM2;

                __CLR4_4_13t43t4lb90p71i.R.inc(4991);return new BigFraction[] {
                    new BigFraction(twoKvwM1 * (v * v - w * w), den),
                    new BigFraction(twoKvwM1 * twoKvw * twoKvwM2, den),
                    new BigFraction(2 * (k + v - 1) * (k + w - 1) * twoKvw, den)
                };
            }finally{__CLR4_4_13t43t4lb90p71i.R.flushNeeded();}}
        });

    }finally{__CLR4_4_13t43t4lb90p71i.R.flushNeeded();}}

    /** Inner class for Jacobi polynomials keys. */
    private static class JacobiKey {

        /** First exponent. */
        private final int v;

        /** Second exponent. */
        private final int w;

        /** Simple constructor.
         * @param v first exponent
         * @param w second exponent
         */
        public JacobiKey(final int v, final int w) {try{__CLR4_4_13t43t4lb90p71i.R.inc(4992);
            __CLR4_4_13t43t4lb90p71i.R.inc(4993);this.v = v;
            __CLR4_4_13t43t4lb90p71i.R.inc(4994);this.w = w;
        }finally{__CLR4_4_13t43t4lb90p71i.R.flushNeeded();}}

        /** Get hash code.
         * @return hash code
         */
        @Override
        public int hashCode() {try{__CLR4_4_13t43t4lb90p71i.R.inc(4995);
            __CLR4_4_13t43t4lb90p71i.R.inc(4996);return (v << 16) ^ w;
        }finally{__CLR4_4_13t43t4lb90p71i.R.flushNeeded();}}

        /** Check if the instance represent the same key as another instance.
         * @param key other key
         * @return true if the instance and the other key refer to the same polynomial
         */
        @Override
        public boolean equals(final Object key) {try{__CLR4_4_13t43t4lb90p71i.R.inc(4997);

            __CLR4_4_13t43t4lb90p71i.R.inc(4998);if (((((key == null) || !(key instanceof JacobiKey))&&(__CLR4_4_13t43t4lb90p71i.R.iget(4999)!=0|true))||(__CLR4_4_13t43t4lb90p71i.R.iget(5000)==0&false))) {{
                __CLR4_4_13t43t4lb90p71i.R.inc(5001);return false;
            }

            }__CLR4_4_13t43t4lb90p71i.R.inc(5002);final JacobiKey otherK = (JacobiKey) key;
            __CLR4_4_13t43t4lb90p71i.R.inc(5003);return (v == otherK.v) && (w == otherK.w);

        }finally{__CLR4_4_13t43t4lb90p71i.R.flushNeeded();}}
    }

    /**
     * Compute the coefficients of the polynomial <code>P<sub>s</sub>(x)</code>
     * whose values at point {@code x} will be the same as the those from the
     * original polynomial <code>P(x)</code> when computed at {@code x + shift}.
     * Thus, if <code>P(x) = &Sigma;<sub>i</sub> a<sub>i</sub> x<sup>i</sup></code>,
     * then
     * <pre>
     *  <table>
     *   <tr>
     *    <td><code>P<sub>s</sub>(x)</td>
     *    <td>= &Sigma;<sub>i</sub> b<sub>i</sub> x<sup>i</sup></code></td>
     *   </tr>
     *   <tr>
     *    <td></td>
     *    <td>= &Sigma;<sub>i</sub> a<sub>i</sub> (x + shift)<sup>i</sup></code></td>
     *   </tr>
     *  </table>
     * </pre>
     *
     * @param coefficients Coefficients of the original polynomial.
     * @param shift Shift value.
     * @return the coefficients <code>b<sub>i</sub></code> of the shifted
     * polynomial.
     */
    public static double[] shift(final double[] coefficients,
                                 final double shift) {try{__CLR4_4_13t43t4lb90p71i.R.inc(5004);
        __CLR4_4_13t43t4lb90p71i.R.inc(5005);final int dp1 = coefficients.length;
        __CLR4_4_13t43t4lb90p71i.R.inc(5006);final double[] newCoefficients = new double[dp1];

        // Pascal triangle.
        __CLR4_4_13t43t4lb90p71i.R.inc(5007);final int[][] coeff = new int[dp1][dp1];
        __CLR4_4_13t43t4lb90p71i.R.inc(5008);for (int i = 0; (((i < dp1)&&(__CLR4_4_13t43t4lb90p71i.R.iget(5009)!=0|true))||(__CLR4_4_13t43t4lb90p71i.R.iget(5010)==0&false)); i++){{
            __CLR4_4_13t43t4lb90p71i.R.inc(5011);for(int j = 0; (((j <= i)&&(__CLR4_4_13t43t4lb90p71i.R.iget(5012)!=0|true))||(__CLR4_4_13t43t4lb90p71i.R.iget(5013)==0&false)); j++){{
                __CLR4_4_13t43t4lb90p71i.R.inc(5014);coeff[i][j] = (int) CombinatoricsUtils.binomialCoefficient(i, j);
            }
        }}

        // First polynomial coefficient.
        }__CLR4_4_13t43t4lb90p71i.R.inc(5015);for (int i = 0; (((i < dp1)&&(__CLR4_4_13t43t4lb90p71i.R.iget(5016)!=0|true))||(__CLR4_4_13t43t4lb90p71i.R.iget(5017)==0&false)); i++){{
            __CLR4_4_13t43t4lb90p71i.R.inc(5018);newCoefficients[0] += coefficients[i] * FastMath.pow(shift, i);
        }

        // Superior order.
        }__CLR4_4_13t43t4lb90p71i.R.inc(5019);final int d = dp1 - 1;
        __CLR4_4_13t43t4lb90p71i.R.inc(5020);for (int i = 0; (((i < d)&&(__CLR4_4_13t43t4lb90p71i.R.iget(5021)!=0|true))||(__CLR4_4_13t43t4lb90p71i.R.iget(5022)==0&false)); i++) {{
            __CLR4_4_13t43t4lb90p71i.R.inc(5023);for (int j = i; (((j < d)&&(__CLR4_4_13t43t4lb90p71i.R.iget(5024)!=0|true))||(__CLR4_4_13t43t4lb90p71i.R.iget(5025)==0&false)); j++){{
                __CLR4_4_13t43t4lb90p71i.R.inc(5026);newCoefficients[i + 1] += coeff[j + 1][j - i] *
                    coefficients[j + 1] * FastMath.pow(shift, j - i);
            }
        }}

        }__CLR4_4_13t43t4lb90p71i.R.inc(5027);return newCoefficients;
    }finally{__CLR4_4_13t43t4lb90p71i.R.flushNeeded();}}


    /** Get the coefficients array for a given degree.
     * @param degree degree of the polynomial
     * @param coefficients list where the computed coefficients are stored
     * @param generator recurrence coefficients generator
     * @return coefficients array
     */
    private static PolynomialFunction buildPolynomial(final int degree,
                                                      final List<BigFraction> coefficients,
                                                      final RecurrenceCoefficientsGenerator generator) {try{__CLR4_4_13t43t4lb90p71i.R.inc(5028);

        __CLR4_4_13t43t4lb90p71i.R.inc(5029);final int maxDegree = (int) FastMath.floor(FastMath.sqrt(2 * coefficients.size())) - 1;
        __CLR4_4_13t43t4lb90p71i.R.inc(5030);synchronized (PolynomialsUtils.class) {
            __CLR4_4_13t43t4lb90p71i.R.inc(5031);if ((((degree > maxDegree)&&(__CLR4_4_13t43t4lb90p71i.R.iget(5032)!=0|true))||(__CLR4_4_13t43t4lb90p71i.R.iget(5033)==0&false))) {{
                __CLR4_4_13t43t4lb90p71i.R.inc(5034);computeUpToDegree(degree, maxDegree, generator, coefficients);
            }
        }}

        // coefficient  for polynomial 0 is  l [0]
        // coefficients for polynomial 1 are l [1] ... l [2] (degrees 0 ... 1)
        // coefficients for polynomial 2 are l [3] ... l [5] (degrees 0 ... 2)
        // coefficients for polynomial 3 are l [6] ... l [9] (degrees 0 ... 3)
        // coefficients for polynomial 4 are l[10] ... l[14] (degrees 0 ... 4)
        // coefficients for polynomial 5 are l[15] ... l[20] (degrees 0 ... 5)
        // coefficients for polynomial 6 are l[21] ... l[27] (degrees 0 ... 6)
        // ...
        __CLR4_4_13t43t4lb90p71i.R.inc(5035);final int start = degree * (degree + 1) / 2;

        __CLR4_4_13t43t4lb90p71i.R.inc(5036);final double[] a = new double[degree + 1];
        __CLR4_4_13t43t4lb90p71i.R.inc(5037);for (int i = 0; (((i <= degree)&&(__CLR4_4_13t43t4lb90p71i.R.iget(5038)!=0|true))||(__CLR4_4_13t43t4lb90p71i.R.iget(5039)==0&false)); ++i) {{
            __CLR4_4_13t43t4lb90p71i.R.inc(5040);a[i] = coefficients.get(start + i).doubleValue();
        }

        // build the polynomial
        }__CLR4_4_13t43t4lb90p71i.R.inc(5041);return new PolynomialFunction(a);

    }finally{__CLR4_4_13t43t4lb90p71i.R.flushNeeded();}}

    /** Compute polynomial coefficients up to a given degree.
     * @param degree maximal degree
     * @param maxDegree current maximal degree
     * @param generator recurrence coefficients generator
     * @param coefficients list where the computed coefficients should be appended
     */
    private static void computeUpToDegree(final int degree, final int maxDegree,
                                          final RecurrenceCoefficientsGenerator generator,
                                          final List<BigFraction> coefficients) {try{__CLR4_4_13t43t4lb90p71i.R.inc(5042);

        __CLR4_4_13t43t4lb90p71i.R.inc(5043);int startK = (maxDegree - 1) * maxDegree / 2;
        __CLR4_4_13t43t4lb90p71i.R.inc(5044);for (int k = maxDegree; (((k < degree)&&(__CLR4_4_13t43t4lb90p71i.R.iget(5045)!=0|true))||(__CLR4_4_13t43t4lb90p71i.R.iget(5046)==0&false)); ++k) {{

            // start indices of two previous polynomials Pk(X) and Pk-1(X)
            __CLR4_4_13t43t4lb90p71i.R.inc(5047);int startKm1 = startK;
            __CLR4_4_13t43t4lb90p71i.R.inc(5048);startK += k;

            // Pk+1(X) = (a[0] + a[1] X) Pk(X) - a[2] Pk-1(X)
            __CLR4_4_13t43t4lb90p71i.R.inc(5049);BigFraction[] ai = generator.generate(k);

            __CLR4_4_13t43t4lb90p71i.R.inc(5050);BigFraction ck     = coefficients.get(startK);
            __CLR4_4_13t43t4lb90p71i.R.inc(5051);BigFraction ckm1   = coefficients.get(startKm1);

            // degree 0 coefficient
            __CLR4_4_13t43t4lb90p71i.R.inc(5052);coefficients.add(ck.multiply(ai[0]).subtract(ckm1.multiply(ai[2])));

            // degree 1 to degree k-1 coefficients
            __CLR4_4_13t43t4lb90p71i.R.inc(5053);for (int i = 1; (((i < k)&&(__CLR4_4_13t43t4lb90p71i.R.iget(5054)!=0|true))||(__CLR4_4_13t43t4lb90p71i.R.iget(5055)==0&false)); ++i) {{
                __CLR4_4_13t43t4lb90p71i.R.inc(5056);final BigFraction ckPrev = ck;
                __CLR4_4_13t43t4lb90p71i.R.inc(5057);ck     = coefficients.get(startK + i);
                __CLR4_4_13t43t4lb90p71i.R.inc(5058);ckm1   = coefficients.get(startKm1 + i);
                __CLR4_4_13t43t4lb90p71i.R.inc(5059);coefficients.add(ck.multiply(ai[0]).add(ckPrev.multiply(ai[1])).subtract(ckm1.multiply(ai[2])));
            }

            // degree k coefficient
            }__CLR4_4_13t43t4lb90p71i.R.inc(5060);final BigFraction ckPrev = ck;
            __CLR4_4_13t43t4lb90p71i.R.inc(5061);ck = coefficients.get(startK + k);
            __CLR4_4_13t43t4lb90p71i.R.inc(5062);coefficients.add(ck.multiply(ai[0]).add(ckPrev.multiply(ai[1])));

            // degree k+1 coefficient
            __CLR4_4_13t43t4lb90p71i.R.inc(5063);coefficients.add(ck.multiply(ai[1]));

        }

    }}finally{__CLR4_4_13t43t4lb90p71i.R.flushNeeded();}}

    /** Interface for recurrence coefficients generation. */
    private interface RecurrenceCoefficientsGenerator {
        /**
         * Generate recurrence coefficients.
         * @param k highest degree of the polynomials used in the recurrence
         * @return an array of three coefficients such that
         * P<sub>k+1</sub>(X) = (a[0] + a[1] X) P<sub>k</sub>(X) - a[2] P<sub>k-1</sub>(X)
         */
        BigFraction[] generate(int k);
    }

}
