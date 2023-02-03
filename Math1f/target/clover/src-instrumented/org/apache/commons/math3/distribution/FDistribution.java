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

package org.apache.commons.math3.distribution;

import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.special.Beta;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;

/**
 * Implementation of the F-distribution.
 *
 * @see <a href="http://en.wikipedia.org/wiki/F-distribution">F-distribution (Wikipedia)</a>
 * @see <a href="http://mathworld.wolfram.com/F-Distribution.html">F-distribution (MathWorld)</a>
 * @version $Id$
 */
public class FDistribution extends AbstractRealDistribution {public static class __CLR4_4_1882882lb90p7hk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,10732,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Default inverse cumulative probability accuracy.
     * @since 2.1
     */
    public static final double DEFAULT_INVERSE_ABSOLUTE_ACCURACY = 1e-9;
    /** Serializable version identifier. */
    private static final long serialVersionUID = -8516354193418641566L;
    /** The numerator degrees of freedom. */
    private final double numeratorDegreesOfFreedom;
    /** The numerator degrees of freedom. */
    private final double denominatorDegreesOfFreedom;
    /** Inverse cumulative probability accuracy. */
    private final double solverAbsoluteAccuracy;
    /** Cached numerical variance */
    private double numericalVariance = Double.NaN;
    /** Whether or not the numerical variance has been calculated */
    private boolean numericalVarianceIsCalculated = false;

    /**
     * Creates an F distribution using the given degrees of freedom.
     *
     * @param numeratorDegreesOfFreedom Numerator degrees of freedom.
     * @param denominatorDegreesOfFreedom Denominator degrees of freedom.
     * @throws NotStrictlyPositiveException if
     * {@code numeratorDegreesOfFreedom <= 0} or
     * {@code denominatorDegreesOfFreedom <= 0}.
     */
    public FDistribution(double numeratorDegreesOfFreedom,
                         double denominatorDegreesOfFreedom)
        throws NotStrictlyPositiveException {
        this(numeratorDegreesOfFreedom, denominatorDegreesOfFreedom,
             DEFAULT_INVERSE_ABSOLUTE_ACCURACY);__CLR4_4_1882882lb90p7hk.R.inc(10659);try{__CLR4_4_1882882lb90p7hk.R.inc(10658);
    }finally{__CLR4_4_1882882lb90p7hk.R.flushNeeded();}}

    /**
     * Creates an F distribution using the given degrees of freedom
     * and inverse cumulative probability accuracy.
     *
     * @param numeratorDegreesOfFreedom Numerator degrees of freedom.
     * @param denominatorDegreesOfFreedom Denominator degrees of freedom.
     * @param inverseCumAccuracy the maximum absolute error in inverse
     * cumulative probability estimates.
     * @throws NotStrictlyPositiveException if
     * {@code numeratorDegreesOfFreedom <= 0} or
     * {@code denominatorDegreesOfFreedom <= 0}.
     * @since 2.1
     */
    public FDistribution(double numeratorDegreesOfFreedom,
                         double denominatorDegreesOfFreedom,
                         double inverseCumAccuracy)
        throws NotStrictlyPositiveException {
        this(new Well19937c(), numeratorDegreesOfFreedom,
             denominatorDegreesOfFreedom, inverseCumAccuracy);__CLR4_4_1882882lb90p7hk.R.inc(10661);try{__CLR4_4_1882882lb90p7hk.R.inc(10660);
    }finally{__CLR4_4_1882882lb90p7hk.R.flushNeeded();}}

    /**
     * Creates an F distribution.
     *
     * @param rng Random number generator.
     * @param numeratorDegreesOfFreedom Numerator degrees of freedom.
     * @param denominatorDegreesOfFreedom Denominator degrees of freedom.
     * @param inverseCumAccuracy the maximum absolute error in inverse
     * cumulative probability estimates.
     * @throws NotStrictlyPositiveException if
     * {@code numeratorDegreesOfFreedom <= 0} or
     * {@code denominatorDegreesOfFreedom <= 0}.
     * @since 3.1
     */
    public FDistribution(RandomGenerator rng,
                         double numeratorDegreesOfFreedom,
                         double denominatorDegreesOfFreedom,
                         double inverseCumAccuracy)
        throws NotStrictlyPositiveException {
        super(rng);__CLR4_4_1882882lb90p7hk.R.inc(10663);try{__CLR4_4_1882882lb90p7hk.R.inc(10662);

        __CLR4_4_1882882lb90p7hk.R.inc(10664);if ((((numeratorDegreesOfFreedom <= 0)&&(__CLR4_4_1882882lb90p7hk.R.iget(10665)!=0|true))||(__CLR4_4_1882882lb90p7hk.R.iget(10666)==0&false))) {{
            __CLR4_4_1882882lb90p7hk.R.inc(10667);throw new NotStrictlyPositiveException(LocalizedFormats.DEGREES_OF_FREEDOM,
                                                   numeratorDegreesOfFreedom);
        }
        }__CLR4_4_1882882lb90p7hk.R.inc(10668);if ((((denominatorDegreesOfFreedom <= 0)&&(__CLR4_4_1882882lb90p7hk.R.iget(10669)!=0|true))||(__CLR4_4_1882882lb90p7hk.R.iget(10670)==0&false))) {{
            __CLR4_4_1882882lb90p7hk.R.inc(10671);throw new NotStrictlyPositiveException(LocalizedFormats.DEGREES_OF_FREEDOM,
                                                   denominatorDegreesOfFreedom);
        }
        }__CLR4_4_1882882lb90p7hk.R.inc(10672);this.numeratorDegreesOfFreedom = numeratorDegreesOfFreedom;
        __CLR4_4_1882882lb90p7hk.R.inc(10673);this.denominatorDegreesOfFreedom = denominatorDegreesOfFreedom;
        __CLR4_4_1882882lb90p7hk.R.inc(10674);solverAbsoluteAccuracy = inverseCumAccuracy;
    }finally{__CLR4_4_1882882lb90p7hk.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * @since 2.1
     */
    public double density(double x) {try{__CLR4_4_1882882lb90p7hk.R.inc(10675);
        __CLR4_4_1882882lb90p7hk.R.inc(10676);final double nhalf = numeratorDegreesOfFreedom / 2;
        __CLR4_4_1882882lb90p7hk.R.inc(10677);final double mhalf = denominatorDegreesOfFreedom / 2;
        __CLR4_4_1882882lb90p7hk.R.inc(10678);final double logx = FastMath.log(x);
        __CLR4_4_1882882lb90p7hk.R.inc(10679);final double logn = FastMath.log(numeratorDegreesOfFreedom);
        __CLR4_4_1882882lb90p7hk.R.inc(10680);final double logm = FastMath.log(denominatorDegreesOfFreedom);
        __CLR4_4_1882882lb90p7hk.R.inc(10681);final double lognxm = FastMath.log(numeratorDegreesOfFreedom * x +
                                           denominatorDegreesOfFreedom);
        __CLR4_4_1882882lb90p7hk.R.inc(10682);return FastMath.exp(nhalf * logn + nhalf * logx - logx +
                            mhalf * logm - nhalf * lognxm - mhalf * lognxm -
                            Beta.logBeta(nhalf, mhalf));
    }finally{__CLR4_4_1882882lb90p7hk.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The implementation of this method is based on
     * <ul>
     *  <li>
     *   <a href="http://mathworld.wolfram.com/F-Distribution.html">
     *   F-Distribution</a>, equation (4).
     *  </li>
     * </ul>
     */
    public double cumulativeProbability(double x)  {try{__CLR4_4_1882882lb90p7hk.R.inc(10683);
        __CLR4_4_1882882lb90p7hk.R.inc(10684);double ret;
        __CLR4_4_1882882lb90p7hk.R.inc(10685);if ((((x <= 0)&&(__CLR4_4_1882882lb90p7hk.R.iget(10686)!=0|true))||(__CLR4_4_1882882lb90p7hk.R.iget(10687)==0&false))) {{
            __CLR4_4_1882882lb90p7hk.R.inc(10688);ret = 0;
        } }else {{
            __CLR4_4_1882882lb90p7hk.R.inc(10689);double n = numeratorDegreesOfFreedom;
            __CLR4_4_1882882lb90p7hk.R.inc(10690);double m = denominatorDegreesOfFreedom;

            __CLR4_4_1882882lb90p7hk.R.inc(10691);ret = Beta.regularizedBeta((n * x) / (m + n * x),
                0.5 * n,
                0.5 * m);
        }
        }__CLR4_4_1882882lb90p7hk.R.inc(10692);return ret;
    }finally{__CLR4_4_1882882lb90p7hk.R.flushNeeded();}}

    /**
     * Access the numerator degrees of freedom.
     *
     * @return the numerator degrees of freedom.
     */
    public double getNumeratorDegreesOfFreedom() {try{__CLR4_4_1882882lb90p7hk.R.inc(10693);
        __CLR4_4_1882882lb90p7hk.R.inc(10694);return numeratorDegreesOfFreedom;
    }finally{__CLR4_4_1882882lb90p7hk.R.flushNeeded();}}

    /**
     * Access the denominator degrees of freedom.
     *
     * @return the denominator degrees of freedom.
     */
    public double getDenominatorDegreesOfFreedom() {try{__CLR4_4_1882882lb90p7hk.R.inc(10695);
        __CLR4_4_1882882lb90p7hk.R.inc(10696);return denominatorDegreesOfFreedom;
    }finally{__CLR4_4_1882882lb90p7hk.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected double getSolverAbsoluteAccuracy() {try{__CLR4_4_1882882lb90p7hk.R.inc(10697);
        __CLR4_4_1882882lb90p7hk.R.inc(10698);return solverAbsoluteAccuracy;
    }finally{__CLR4_4_1882882lb90p7hk.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * For denominator degrees of freedom parameter {@code b}, the mean is
     * <ul>
     *  <li>if {@code b > 2} then {@code b / (b - 2)},</li>
     *  <li>else undefined ({@code Double.NaN}).
     * </ul>
     */
    public double getNumericalMean() {try{__CLR4_4_1882882lb90p7hk.R.inc(10699);
        __CLR4_4_1882882lb90p7hk.R.inc(10700);final double denominatorDF = getDenominatorDegreesOfFreedom();

        __CLR4_4_1882882lb90p7hk.R.inc(10701);if ((((denominatorDF > 2)&&(__CLR4_4_1882882lb90p7hk.R.iget(10702)!=0|true))||(__CLR4_4_1882882lb90p7hk.R.iget(10703)==0&false))) {{
            __CLR4_4_1882882lb90p7hk.R.inc(10704);return denominatorDF / (denominatorDF - 2);
        }

        }__CLR4_4_1882882lb90p7hk.R.inc(10705);return Double.NaN;
    }finally{__CLR4_4_1882882lb90p7hk.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * For numerator degrees of freedom parameter {@code a} and denominator
     * degrees of freedom parameter {@code b}, the variance is
     * <ul>
     *  <li>
     *    if {@code b > 4} then
     *    {@code [2 * b^2 * (a + b - 2)] / [a * (b - 2)^2 * (b - 4)]},
     *  </li>
     *  <li>else undefined ({@code Double.NaN}).
     * </ul>
     */
    public double getNumericalVariance() {try{__CLR4_4_1882882lb90p7hk.R.inc(10706);
        __CLR4_4_1882882lb90p7hk.R.inc(10707);if ((((!numericalVarianceIsCalculated)&&(__CLR4_4_1882882lb90p7hk.R.iget(10708)!=0|true))||(__CLR4_4_1882882lb90p7hk.R.iget(10709)==0&false))) {{
            __CLR4_4_1882882lb90p7hk.R.inc(10710);numericalVariance = calculateNumericalVariance();
            __CLR4_4_1882882lb90p7hk.R.inc(10711);numericalVarianceIsCalculated = true;
        }
        }__CLR4_4_1882882lb90p7hk.R.inc(10712);return numericalVariance;
    }finally{__CLR4_4_1882882lb90p7hk.R.flushNeeded();}}

    /**
     * used by {@link #getNumericalVariance()}
     *
     * @return the variance of this distribution
     */
    protected double calculateNumericalVariance() {try{__CLR4_4_1882882lb90p7hk.R.inc(10713);
        __CLR4_4_1882882lb90p7hk.R.inc(10714);final double denominatorDF = getDenominatorDegreesOfFreedom();

        __CLR4_4_1882882lb90p7hk.R.inc(10715);if ((((denominatorDF > 4)&&(__CLR4_4_1882882lb90p7hk.R.iget(10716)!=0|true))||(__CLR4_4_1882882lb90p7hk.R.iget(10717)==0&false))) {{
            __CLR4_4_1882882lb90p7hk.R.inc(10718);final double numeratorDF = getNumeratorDegreesOfFreedom();
            __CLR4_4_1882882lb90p7hk.R.inc(10719);final double denomDFMinusTwo = denominatorDF - 2;

            __CLR4_4_1882882lb90p7hk.R.inc(10720);return ( 2 * (denominatorDF * denominatorDF) * (numeratorDF + denominatorDF - 2) ) /
                   ( (numeratorDF * (denomDFMinusTwo * denomDFMinusTwo) * (denominatorDF - 4)) );
        }

        }__CLR4_4_1882882lb90p7hk.R.inc(10721);return Double.NaN;
    }finally{__CLR4_4_1882882lb90p7hk.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The lower bound of the support is always 0 no matter the parameters.
     *
     * @return lower bound of the support (always 0)
     */
    public double getSupportLowerBound() {try{__CLR4_4_1882882lb90p7hk.R.inc(10722);
        __CLR4_4_1882882lb90p7hk.R.inc(10723);return 0;
    }finally{__CLR4_4_1882882lb90p7hk.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The upper bound of the support is always positive infinity
     * no matter the parameters.
     *
     * @return upper bound of the support (always Double.POSITIVE_INFINITY)
     */
    public double getSupportUpperBound() {try{__CLR4_4_1882882lb90p7hk.R.inc(10724);
        __CLR4_4_1882882lb90p7hk.R.inc(10725);return Double.POSITIVE_INFINITY;
    }finally{__CLR4_4_1882882lb90p7hk.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isSupportLowerBoundInclusive() {try{__CLR4_4_1882882lb90p7hk.R.inc(10726);
        __CLR4_4_1882882lb90p7hk.R.inc(10727);return false;
    }finally{__CLR4_4_1882882lb90p7hk.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isSupportUpperBoundInclusive() {try{__CLR4_4_1882882lb90p7hk.R.inc(10728);
        __CLR4_4_1882882lb90p7hk.R.inc(10729);return false;
    }finally{__CLR4_4_1882882lb90p7hk.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The support of this distribution is connected.
     *
     * @return {@code true}
     */
    public boolean isSupportConnected() {try{__CLR4_4_1882882lb90p7hk.R.inc(10730);
        __CLR4_4_1882882lb90p7hk.R.inc(10731);return true;
    }finally{__CLR4_4_1882882lb90p7hk.R.flushNeeded();}}
}
