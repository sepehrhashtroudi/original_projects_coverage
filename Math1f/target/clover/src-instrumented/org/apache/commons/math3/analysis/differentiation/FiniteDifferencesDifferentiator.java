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
package org.apache.commons.math3.analysis.differentiation;

import java.io.Serializable;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.UnivariateMatrixFunction;
import org.apache.commons.math3.analysis.UnivariateVectorFunction;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.util.FastMath;

/** Univariate functions differentiator using finite differences.
 * <p>
 * This class creates some wrapper objects around regular
 * {@link UnivariateFunction univariate functions} (or {@link
 * UnivariateVectorFunction univariate vector functions} or {@link
 * UnivariateMatrixFunction univariate matrix functions}). These
 * wrapper objects compute derivatives in addition to function
 * value.
 * </p>
 * <p>
 * The wrapper objects work by calling the underlying function on
 * a sampling grid around the current point and performing polynomial
 * interpolation. A finite differences scheme with n points is
 * theoretically able to compute derivatives up to order n-1, but
 * it is generally better to have a slight margin. The step size must
 * also be small enough in order for the polynomial approximation to
 * be good in the current point neighborhood, but it should not be too
 * small because numerical instability appears quickly (there are several
 * differences of close points). Choosing the number of points and
 * the step size is highly problem dependent.
 * </p>
 * <p>
 * As an example of good and bad settings, lets consider the quintic
 * polynomial function {@code f(x) = (x-1)*(x-0.5)*x*(x+0.5)*(x+1)}.
 * Since it is a polynomial, finite differences with at least 6 points
 * should theoretically recover the exact same polynomial and hence
 * compute accurate derivatives for any order. However, due to numerical
 * errors, we get the following results for a 7 points finite differences
 * for abscissae in the [-10, 10] range:
 * <ul>
 *   <li>step size = 0.25, second order derivative error about 9.97e-10</li>
 *   <li>step size = 0.25, fourth order derivative error about 5.43e-8</li>
 *   <li>step size = 1.0e-6, second order derivative error about 148</li>
 *   <li>step size = 1.0e-6, fourth order derivative error about 6.35e+14</li>
 * </ul>
 * This example shows that the small step size is really bad, even simply
 * for second order derivative!
 * </p>
 * @version $Id$
 * @since 3.1
 */
public class FiniteDifferencesDifferentiator
    implements UnivariateFunctionDifferentiator, UnivariateVectorFunctionDifferentiator,
               UnivariateMatrixFunctionDifferentiator, Serializable {public static class __CLR4_4_1193193lb90p6fe{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,1758,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable UID. */
    private static final long serialVersionUID = 20120917L;

    /** Number of points to use. */
    private final int nbPoints;

    /** Step size. */
    private final double stepSize;

    /** Half sample span. */
    private final double halfSampleSpan;

    /** Lower bound for independent variable. */
    private final double tMin;

    /** Upper bound for independent variable. */
    private final double tMax;

    /**
     * Build a differentiator with number of points and step size when independent variable is unbounded.
     * <p>
     * Beware that wrong settings for the finite differences differentiator
     * can lead to highly unstable and inaccurate results, especially for
     * high derivation orders. Using very small step sizes is often a
     * <em>bad</em> idea.
     * </p>
     * @param nbPoints number of points to use
     * @param stepSize step size (gap between each point)
     * @exception NotPositiveException if {@code stepsize <= 0} (note that
     * {@link NotPositiveException} extends {@link NumberIsTooSmallException})
     * @exception NumberIsTooSmallException {@code nbPoint <= 1}
     */
    public FiniteDifferencesDifferentiator(final int nbPoints, final double stepSize)
        throws NotPositiveException, NumberIsTooSmallException {
        this(nbPoints, stepSize, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);__CLR4_4_1193193lb90p6fe.R.inc(1624);try{__CLR4_4_1193193lb90p6fe.R.inc(1623);
    }finally{__CLR4_4_1193193lb90p6fe.R.flushNeeded();}}

    /**
     * Build a differentiator with number of points and step size when independent variable is bounded.
     * <p>
     * When the independent variable is bounded (tLower &lt; t &lt; tUpper), the sampling
     * points used for differentiation will be adapted to ensure the constraint holds
     * even near the boundaries. This means the sample will not be centered anymore in
     * these cases. At an extreme case, computing derivatives exactly at the lower bound
     * will lead the sample to be entirely on the right side of the derivation point.
     * </p>
     * <p>
     * Note that the boundaries are considered to be excluded for function evaluation.
     * </p>
     * <p>
     * Beware that wrong settings for the finite differences differentiator
     * can lead to highly unstable and inaccurate results, especially for
     * high derivation orders. Using very small step sizes is often a
     * <em>bad</em> idea.
     * </p>
     * @param nbPoints number of points to use
     * @param stepSize step size (gap between each point)
     * @param tLower lower bound for independent variable (may be {@code Double.NEGATIVE_INFINITY}
     * if there are no lower bounds)
     * @param tUpper upper bound for independent variable (may be {@code Double.POSITIVE_INFINITY}
     * if there are no upper bounds)
     * @exception NotPositiveException if {@code stepsize <= 0} (note that
     * {@link NotPositiveException} extends {@link NumberIsTooSmallException})
     * @exception NumberIsTooSmallException {@code nbPoint <= 1}
     * @exception NumberIsTooLargeException {@code stepSize * (nbPoints - 1) >= tUpper - tLower}
     */
    public FiniteDifferencesDifferentiator(final int nbPoints, final double stepSize,
                                           final double tLower, final double tUpper)
            throws NotPositiveException, NumberIsTooSmallException, NumberIsTooLargeException {try{__CLR4_4_1193193lb90p6fe.R.inc(1625);

        __CLR4_4_1193193lb90p6fe.R.inc(1626);if ((((nbPoints <= 1)&&(__CLR4_4_1193193lb90p6fe.R.iget(1627)!=0|true))||(__CLR4_4_1193193lb90p6fe.R.iget(1628)==0&false))) {{
            __CLR4_4_1193193lb90p6fe.R.inc(1629);throw new NumberIsTooSmallException(stepSize, 1, false);
        }
        }__CLR4_4_1193193lb90p6fe.R.inc(1630);this.nbPoints = nbPoints;

        __CLR4_4_1193193lb90p6fe.R.inc(1631);if ((((stepSize <= 0)&&(__CLR4_4_1193193lb90p6fe.R.iget(1632)!=0|true))||(__CLR4_4_1193193lb90p6fe.R.iget(1633)==0&false))) {{
            __CLR4_4_1193193lb90p6fe.R.inc(1634);throw new NotPositiveException(stepSize);
        }
        }__CLR4_4_1193193lb90p6fe.R.inc(1635);this.stepSize = stepSize;

        __CLR4_4_1193193lb90p6fe.R.inc(1636);halfSampleSpan = 0.5 * stepSize * (nbPoints - 1);
        __CLR4_4_1193193lb90p6fe.R.inc(1637);if ((((2 * halfSampleSpan >= tUpper - tLower)&&(__CLR4_4_1193193lb90p6fe.R.iget(1638)!=0|true))||(__CLR4_4_1193193lb90p6fe.R.iget(1639)==0&false))) {{
            __CLR4_4_1193193lb90p6fe.R.inc(1640);throw new NumberIsTooLargeException(2 * halfSampleSpan, tUpper - tLower, false);
        }
        }__CLR4_4_1193193lb90p6fe.R.inc(1641);final double safety = FastMath.ulp(halfSampleSpan);
        __CLR4_4_1193193lb90p6fe.R.inc(1642);this.tMin = tLower + halfSampleSpan + safety;
        __CLR4_4_1193193lb90p6fe.R.inc(1643);this.tMax = tUpper - halfSampleSpan - safety;

    }finally{__CLR4_4_1193193lb90p6fe.R.flushNeeded();}}

    /**
     * Get the number of points to use.
     * @return number of points to use
     */
    public int getNbPoints() {try{__CLR4_4_1193193lb90p6fe.R.inc(1644);
        __CLR4_4_1193193lb90p6fe.R.inc(1645);return nbPoints;
    }finally{__CLR4_4_1193193lb90p6fe.R.flushNeeded();}}

    /**
     * Get the step size.
     * @return step size
     */
    public double getStepSize() {try{__CLR4_4_1193193lb90p6fe.R.inc(1646);
        __CLR4_4_1193193lb90p6fe.R.inc(1647);return stepSize;
    }finally{__CLR4_4_1193193lb90p6fe.R.flushNeeded();}}

    /**
     * Evaluate derivatives from a sample.
     * <p>
     * Evaluation is done using divided differences.
     * </p>
     * @param t evaluation abscissa value and derivatives
     * @param t0 first sample point abscissa
     * @param y function values sample {@code y[i] = f(t[i]) = f(t0 + i * stepSize)}
     * @return value and derivatives at {@code t}
     * @exception NumberIsTooLargeException if the requested derivation order
     * is larger or equal to the number of points
     */
    private DerivativeStructure evaluate(final DerivativeStructure t, final double t0,
                                         final double[] y)
        throws NumberIsTooLargeException {try{__CLR4_4_1193193lb90p6fe.R.inc(1648);

        // create divided differences diagonal arrays
        __CLR4_4_1193193lb90p6fe.R.inc(1649);final double[] top    = new double[nbPoints];
        __CLR4_4_1193193lb90p6fe.R.inc(1650);final double[] bottom = new double[nbPoints];

        __CLR4_4_1193193lb90p6fe.R.inc(1651);for (int i = 0; (((i < nbPoints)&&(__CLR4_4_1193193lb90p6fe.R.iget(1652)!=0|true))||(__CLR4_4_1193193lb90p6fe.R.iget(1653)==0&false)); ++i) {{

            // update the bottom diagonal of the divided differences array
            __CLR4_4_1193193lb90p6fe.R.inc(1654);bottom[i] = y[i];
            __CLR4_4_1193193lb90p6fe.R.inc(1655);for (int j = 1; (((j <= i)&&(__CLR4_4_1193193lb90p6fe.R.iget(1656)!=0|true))||(__CLR4_4_1193193lb90p6fe.R.iget(1657)==0&false)); ++j) {{
                __CLR4_4_1193193lb90p6fe.R.inc(1658);bottom[i - j] = (bottom[i - j + 1] - bottom[i - j]) / (j * stepSize);
            }

            // update the top diagonal of the divided differences array
            }__CLR4_4_1193193lb90p6fe.R.inc(1659);top[i] = bottom[0];

        }

        // evaluate interpolation polynomial (represented by top diagonal) at t
        }__CLR4_4_1193193lb90p6fe.R.inc(1660);final int order            = t.getOrder();
        __CLR4_4_1193193lb90p6fe.R.inc(1661);final int parameters       = t.getFreeParameters();
        __CLR4_4_1193193lb90p6fe.R.inc(1662);final double[] derivatives = t.getAllDerivatives();
        __CLR4_4_1193193lb90p6fe.R.inc(1663);final double dt0           = t.getValue() - t0;
        __CLR4_4_1193193lb90p6fe.R.inc(1664);DerivativeStructure interpolation = new DerivativeStructure(parameters, order, 0.0);
        __CLR4_4_1193193lb90p6fe.R.inc(1665);DerivativeStructure monomial = null;
        __CLR4_4_1193193lb90p6fe.R.inc(1666);for (int i = 0; (((i < nbPoints)&&(__CLR4_4_1193193lb90p6fe.R.iget(1667)!=0|true))||(__CLR4_4_1193193lb90p6fe.R.iget(1668)==0&false)); ++i) {{
            __CLR4_4_1193193lb90p6fe.R.inc(1669);if ((((i == 0)&&(__CLR4_4_1193193lb90p6fe.R.iget(1670)!=0|true))||(__CLR4_4_1193193lb90p6fe.R.iget(1671)==0&false))) {{
                // start with monomial(t) = 1
                __CLR4_4_1193193lb90p6fe.R.inc(1672);monomial = new DerivativeStructure(parameters, order, 1.0);
            } }else {{
                // monomial(t) = (t - t0) * (t - t1) * ... * (t - t(i-1))
                __CLR4_4_1193193lb90p6fe.R.inc(1673);derivatives[0] = dt0 - (i - 1) * stepSize;
                __CLR4_4_1193193lb90p6fe.R.inc(1674);final DerivativeStructure deltaX = new DerivativeStructure(parameters, order, derivatives);
                __CLR4_4_1193193lb90p6fe.R.inc(1675);monomial = monomial.multiply(deltaX);
            }
            }__CLR4_4_1193193lb90p6fe.R.inc(1676);interpolation = interpolation.add(monomial.multiply(top[i]));
        }

        }__CLR4_4_1193193lb90p6fe.R.inc(1677);return interpolation;

    }finally{__CLR4_4_1193193lb90p6fe.R.flushNeeded();}}

    /** {@inheritDoc}
     * <p>The returned object cannot compute derivatives to arbitrary orders. The
     * value function will throw a {@link NumberIsTooLargeException} if the requested
     * derivation order is larger or equal to the number of points.
     * </p>
     */
    public UnivariateDifferentiableFunction differentiate(final UnivariateFunction function) {try{__CLR4_4_1193193lb90p6fe.R.inc(1678);
        __CLR4_4_1193193lb90p6fe.R.inc(1679);return new UnivariateDifferentiableFunction() {

            /** {@inheritDoc} */
            public double value(final double x) throws MathIllegalArgumentException {try{__CLR4_4_1193193lb90p6fe.R.inc(1680);
                __CLR4_4_1193193lb90p6fe.R.inc(1681);return function.value(x);
            }finally{__CLR4_4_1193193lb90p6fe.R.flushNeeded();}}

            /** {@inheritDoc} */
            public DerivativeStructure value(final DerivativeStructure t)
                throws MathIllegalArgumentException {try{__CLR4_4_1193193lb90p6fe.R.inc(1682);

                // check we can achieve the requested derivation order with the sample
                __CLR4_4_1193193lb90p6fe.R.inc(1683);if ((((t.getOrder() >= nbPoints)&&(__CLR4_4_1193193lb90p6fe.R.iget(1684)!=0|true))||(__CLR4_4_1193193lb90p6fe.R.iget(1685)==0&false))) {{
                    __CLR4_4_1193193lb90p6fe.R.inc(1686);throw new NumberIsTooLargeException(t.getOrder(), nbPoints, false);
                }

                // compute sample position, trying to be centered if possible
                }__CLR4_4_1193193lb90p6fe.R.inc(1687);final double t0 = FastMath.max(FastMath.min(t.getValue(), tMax), tMin) - halfSampleSpan;

                // compute sample points
                __CLR4_4_1193193lb90p6fe.R.inc(1688);final double[] y = new double[nbPoints];
                __CLR4_4_1193193lb90p6fe.R.inc(1689);for (int i = 0; (((i < nbPoints)&&(__CLR4_4_1193193lb90p6fe.R.iget(1690)!=0|true))||(__CLR4_4_1193193lb90p6fe.R.iget(1691)==0&false)); ++i) {{
                    __CLR4_4_1193193lb90p6fe.R.inc(1692);y[i] = function.value(t0 + i * stepSize);
                }

                // evaluate derivatives
                }__CLR4_4_1193193lb90p6fe.R.inc(1693);return evaluate(t, t0, y);

            }finally{__CLR4_4_1193193lb90p6fe.R.flushNeeded();}}

        };
    }finally{__CLR4_4_1193193lb90p6fe.R.flushNeeded();}}

    /** {@inheritDoc}
     * <p>The returned object cannot compute derivatives to arbitrary orders. The
     * value function will throw a {@link NumberIsTooLargeException} if the requested
     * derivation order is larger or equal to the number of points.
     * </p>
     */
    public UnivariateDifferentiableVectorFunction differentiate(final UnivariateVectorFunction function) {try{__CLR4_4_1193193lb90p6fe.R.inc(1694);
        __CLR4_4_1193193lb90p6fe.R.inc(1695);return new UnivariateDifferentiableVectorFunction() {

            /** {@inheritDoc} */
            public double[]value(final double x) throws MathIllegalArgumentException {try{__CLR4_4_1193193lb90p6fe.R.inc(1696);
                __CLR4_4_1193193lb90p6fe.R.inc(1697);return function.value(x);
            }finally{__CLR4_4_1193193lb90p6fe.R.flushNeeded();}}

            /** {@inheritDoc} */
            public DerivativeStructure[] value(final DerivativeStructure t)
                throws MathIllegalArgumentException {try{__CLR4_4_1193193lb90p6fe.R.inc(1698);

                // check we can achieve the requested derivation order with the sample
                __CLR4_4_1193193lb90p6fe.R.inc(1699);if ((((t.getOrder() >= nbPoints)&&(__CLR4_4_1193193lb90p6fe.R.iget(1700)!=0|true))||(__CLR4_4_1193193lb90p6fe.R.iget(1701)==0&false))) {{
                    __CLR4_4_1193193lb90p6fe.R.inc(1702);throw new NumberIsTooLargeException(t.getOrder(), nbPoints, false);
                }

                // compute sample position, trying to be centered if possible
                }__CLR4_4_1193193lb90p6fe.R.inc(1703);final double t0 = FastMath.max(FastMath.min(t.getValue(), tMax), tMin) - halfSampleSpan;

                // compute sample points
                __CLR4_4_1193193lb90p6fe.R.inc(1704);double[][] y = null;
                __CLR4_4_1193193lb90p6fe.R.inc(1705);for (int i = 0; (((i < nbPoints)&&(__CLR4_4_1193193lb90p6fe.R.iget(1706)!=0|true))||(__CLR4_4_1193193lb90p6fe.R.iget(1707)==0&false)); ++i) {{
                    __CLR4_4_1193193lb90p6fe.R.inc(1708);final double[] v = function.value(t0 + i * stepSize);
                    __CLR4_4_1193193lb90p6fe.R.inc(1709);if ((((i == 0)&&(__CLR4_4_1193193lb90p6fe.R.iget(1710)!=0|true))||(__CLR4_4_1193193lb90p6fe.R.iget(1711)==0&false))) {{
                        __CLR4_4_1193193lb90p6fe.R.inc(1712);y = new double[v.length][nbPoints];
                    }
                    }__CLR4_4_1193193lb90p6fe.R.inc(1713);for (int j = 0; (((j < v.length)&&(__CLR4_4_1193193lb90p6fe.R.iget(1714)!=0|true))||(__CLR4_4_1193193lb90p6fe.R.iget(1715)==0&false)); ++j) {{
                        __CLR4_4_1193193lb90p6fe.R.inc(1716);y[j][i] = v[j];
                    }
                }}

                // evaluate derivatives
                }__CLR4_4_1193193lb90p6fe.R.inc(1717);final DerivativeStructure[] value = new DerivativeStructure[y.length];
                __CLR4_4_1193193lb90p6fe.R.inc(1718);for (int j = 0; (((j < value.length)&&(__CLR4_4_1193193lb90p6fe.R.iget(1719)!=0|true))||(__CLR4_4_1193193lb90p6fe.R.iget(1720)==0&false)); ++j) {{
                    __CLR4_4_1193193lb90p6fe.R.inc(1721);value[j] = evaluate(t, t0, y[j]);
                }

                }__CLR4_4_1193193lb90p6fe.R.inc(1722);return value;

            }finally{__CLR4_4_1193193lb90p6fe.R.flushNeeded();}}

        };
    }finally{__CLR4_4_1193193lb90p6fe.R.flushNeeded();}}

    /** {@inheritDoc}
     * <p>The returned object cannot compute derivatives to arbitrary orders. The
     * value function will throw a {@link NumberIsTooLargeException} if the requested
     * derivation order is larger or equal to the number of points.
     * </p>
     */
    public UnivariateDifferentiableMatrixFunction differentiate(final UnivariateMatrixFunction function) {try{__CLR4_4_1193193lb90p6fe.R.inc(1723);
        __CLR4_4_1193193lb90p6fe.R.inc(1724);return new UnivariateDifferentiableMatrixFunction() {

            /** {@inheritDoc} */
            public double[][]  value(final double x) throws MathIllegalArgumentException {try{__CLR4_4_1193193lb90p6fe.R.inc(1725);
                __CLR4_4_1193193lb90p6fe.R.inc(1726);return function.value(x);
            }finally{__CLR4_4_1193193lb90p6fe.R.flushNeeded();}}

            /** {@inheritDoc} */
            public DerivativeStructure[][]  value(final DerivativeStructure t)
                throws MathIllegalArgumentException {try{__CLR4_4_1193193lb90p6fe.R.inc(1727);

                // check we can achieve the requested derivation order with the sample
                __CLR4_4_1193193lb90p6fe.R.inc(1728);if ((((t.getOrder() >= nbPoints)&&(__CLR4_4_1193193lb90p6fe.R.iget(1729)!=0|true))||(__CLR4_4_1193193lb90p6fe.R.iget(1730)==0&false))) {{
                    __CLR4_4_1193193lb90p6fe.R.inc(1731);throw new NumberIsTooLargeException(t.getOrder(), nbPoints, false);
                }

                // compute sample position, trying to be centered if possible
                }__CLR4_4_1193193lb90p6fe.R.inc(1732);final double t0 = FastMath.max(FastMath.min(t.getValue(), tMax), tMin) - halfSampleSpan;

                // compute sample points
                __CLR4_4_1193193lb90p6fe.R.inc(1733);double[][][] y = null;
                __CLR4_4_1193193lb90p6fe.R.inc(1734);for (int i = 0; (((i < nbPoints)&&(__CLR4_4_1193193lb90p6fe.R.iget(1735)!=0|true))||(__CLR4_4_1193193lb90p6fe.R.iget(1736)==0&false)); ++i) {{
                    __CLR4_4_1193193lb90p6fe.R.inc(1737);final double[][] v = function.value(t0 + i * stepSize);
                    __CLR4_4_1193193lb90p6fe.R.inc(1738);if ((((i == 0)&&(__CLR4_4_1193193lb90p6fe.R.iget(1739)!=0|true))||(__CLR4_4_1193193lb90p6fe.R.iget(1740)==0&false))) {{
                        __CLR4_4_1193193lb90p6fe.R.inc(1741);y = new double[v.length][v[0].length][nbPoints];
                    }
                    }__CLR4_4_1193193lb90p6fe.R.inc(1742);for (int j = 0; (((j < v.length)&&(__CLR4_4_1193193lb90p6fe.R.iget(1743)!=0|true))||(__CLR4_4_1193193lb90p6fe.R.iget(1744)==0&false)); ++j) {{
                        __CLR4_4_1193193lb90p6fe.R.inc(1745);for (int k = 0; (((k < v[j].length)&&(__CLR4_4_1193193lb90p6fe.R.iget(1746)!=0|true))||(__CLR4_4_1193193lb90p6fe.R.iget(1747)==0&false)); ++k) {{
                            __CLR4_4_1193193lb90p6fe.R.inc(1748);y[j][k][i] = v[j][k];
                        }
                    }}
                }}

                // evaluate derivatives
                }__CLR4_4_1193193lb90p6fe.R.inc(1749);final DerivativeStructure[][] value = new DerivativeStructure[y.length][y[0].length];
                __CLR4_4_1193193lb90p6fe.R.inc(1750);for (int j = 0; (((j < value.length)&&(__CLR4_4_1193193lb90p6fe.R.iget(1751)!=0|true))||(__CLR4_4_1193193lb90p6fe.R.iget(1752)==0&false)); ++j) {{
                    __CLR4_4_1193193lb90p6fe.R.inc(1753);for (int k = 0; (((k < y[j].length)&&(__CLR4_4_1193193lb90p6fe.R.iget(1754)!=0|true))||(__CLR4_4_1193193lb90p6fe.R.iget(1755)==0&false)); ++k) {{
                        __CLR4_4_1193193lb90p6fe.R.inc(1756);value[j][k] = evaluate(t, t0, y[j][k]);
                    }
                }}

                }__CLR4_4_1193193lb90p6fe.R.inc(1757);return value;

            }finally{__CLR4_4_1193193lb90p6fe.R.flushNeeded();}}

        };
    }finally{__CLR4_4_1193193lb90p6fe.R.flushNeeded();}}

}
