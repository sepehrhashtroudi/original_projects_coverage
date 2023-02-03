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
import org.apache.commons.math3.special.Gamma;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;

/**
 * Implementation of the Gamma distribution.
 *
 * @see <a href="http://en.wikipedia.org/wiki/Gamma_distribution">Gamma distribution (Wikipedia)</a>
 * @see <a href="http://mathworld.wolfram.com/GammaDistribution.html">Gamma distribution (MathWorld)</a>
 * @version $Id$
 */
public class GammaDistribution extends AbstractRealDistribution {public static class __CLR4_4_18a48a4lb90p7hu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,10845,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Default inverse cumulative probability accuracy.
     * @since 2.1
     */
    public static final double DEFAULT_INVERSE_ABSOLUTE_ACCURACY = 1e-9;
    /** Serializable version identifier. */
    private static final long serialVersionUID = 20120524L;
    /** The shape parameter. */
    private final double shape;
    /** The scale parameter. */
    private final double scale;
    /**
     * The constant value of {@code shape + g + 0.5}, where {@code g} is the
     * Lanczos constant {@link Gamma#LANCZOS_G}.
     */
    private final double shiftedShape;
    /**
     * The constant value of
     * {@code shape / scale * sqrt(e / (2 * pi * (shape + g + 0.5))) / L(shape)},
     * where {@code L(shape)} is the Lanczos approximation returned by
     * {@link Gamma#lanczos(double)}. This prefactor is used in
     * {@link #density(double)}, when no overflow occurs with the natural
     * calculation.
     */
    private final double densityPrefactor1;
    /**
     * The constant value of
     * {@code shape * sqrt(e / (2 * pi * (shape + g + 0.5))) / L(shape)},
     * where {@code L(shape)} is the Lanczos approximation returned by
     * {@link Gamma#lanczos(double)}. This prefactor is used in
     * {@link #density(double)}, when overflow occurs with the natural
     * calculation.
     */
    private final double densityPrefactor2;
    /**
     * Lower bound on {@code y = x / scale} for the selection of the computation
     * method in {@link #density(double)}. For {@code y <= minY}, the natural
     * calculation overflows.
     */
    private final double minY;
    /**
     * Upper bound on {@code log(y)} ({@code y = x / scale}) for the selection
     * of the computation method in {@link #density(double)}. For
     * {@code log(y) >= maxLogY}, the natural calculation overflows.
     */
    private final double maxLogY;
    /** Inverse cumulative probability accuracy. */
    private final double solverAbsoluteAccuracy;

    /**
     * Creates a new gamma distribution with specified values of the shape and
     * scale parameters.
     *
     * @param shape the shape parameter
     * @param scale the scale parameter
     * @throws NotStrictlyPositiveException if {@code shape <= 0} or
     * {@code scale <= 0}.
     */
    public GammaDistribution(double shape, double scale) throws NotStrictlyPositiveException {
        this(shape, scale, DEFAULT_INVERSE_ABSOLUTE_ACCURACY);__CLR4_4_18a48a4lb90p7hu.R.inc(10733);try{__CLR4_4_18a48a4lb90p7hu.R.inc(10732);
    }finally{__CLR4_4_18a48a4lb90p7hu.R.flushNeeded();}}

    /**
     * Creates a new gamma distribution with specified values of the shape and
     * scale parameters.
     *
     * @param shape the shape parameter
     * @param scale the scale parameter
     * @param inverseCumAccuracy the maximum absolute error in inverse
     * cumulative probability estimates (defaults to
     * {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).
     * @throws NotStrictlyPositiveException if {@code shape <= 0} or
     * {@code scale <= 0}.
     * @since 2.1
     */
    public GammaDistribution(double shape, double scale, double inverseCumAccuracy)
        throws NotStrictlyPositiveException {
        this(new Well19937c(), shape, scale, inverseCumAccuracy);__CLR4_4_18a48a4lb90p7hu.R.inc(10735);try{__CLR4_4_18a48a4lb90p7hu.R.inc(10734);
    }finally{__CLR4_4_18a48a4lb90p7hu.R.flushNeeded();}}

    /**
     * Creates a Gamma distribution.
     *
     * @param rng Random number generator.
     * @param shape the shape parameter
     * @param scale the scale parameter
     * @param inverseCumAccuracy the maximum absolute error in inverse
     * cumulative probability estimates (defaults to
     * {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).
     * @throws NotStrictlyPositiveException if {@code shape <= 0} or
     * {@code scale <= 0}.
     * @since 3.1
     */
    public GammaDistribution(RandomGenerator rng,
                             double shape,
                             double scale,
                             double inverseCumAccuracy)
        throws NotStrictlyPositiveException {
        super(rng);__CLR4_4_18a48a4lb90p7hu.R.inc(10737);try{__CLR4_4_18a48a4lb90p7hu.R.inc(10736);

        __CLR4_4_18a48a4lb90p7hu.R.inc(10738);if ((((shape <= 0)&&(__CLR4_4_18a48a4lb90p7hu.R.iget(10739)!=0|true))||(__CLR4_4_18a48a4lb90p7hu.R.iget(10740)==0&false))) {{
            __CLR4_4_18a48a4lb90p7hu.R.inc(10741);throw new NotStrictlyPositiveException(LocalizedFormats.SHAPE, shape);
        }
        }__CLR4_4_18a48a4lb90p7hu.R.inc(10742);if ((((scale <= 0)&&(__CLR4_4_18a48a4lb90p7hu.R.iget(10743)!=0|true))||(__CLR4_4_18a48a4lb90p7hu.R.iget(10744)==0&false))) {{
            __CLR4_4_18a48a4lb90p7hu.R.inc(10745);throw new NotStrictlyPositiveException(LocalizedFormats.SCALE, scale);
        }

        }__CLR4_4_18a48a4lb90p7hu.R.inc(10746);this.shape = shape;
        __CLR4_4_18a48a4lb90p7hu.R.inc(10747);this.scale = scale;
        __CLR4_4_18a48a4lb90p7hu.R.inc(10748);this.solverAbsoluteAccuracy = inverseCumAccuracy;
        __CLR4_4_18a48a4lb90p7hu.R.inc(10749);this.shiftedShape = shape + Gamma.LANCZOS_G + 0.5;
        __CLR4_4_18a48a4lb90p7hu.R.inc(10750);final double aux = FastMath.E / (2.0 * FastMath.PI * shiftedShape);
        __CLR4_4_18a48a4lb90p7hu.R.inc(10751);this.densityPrefactor2 = shape * FastMath.sqrt(aux) / Gamma.lanczos(shape);
        __CLR4_4_18a48a4lb90p7hu.R.inc(10752);this.densityPrefactor1 = this.densityPrefactor2 / scale *
                FastMath.pow(shiftedShape, -shape) *
                FastMath.exp(shape + Gamma.LANCZOS_G);
        __CLR4_4_18a48a4lb90p7hu.R.inc(10753);this.minY = shape + Gamma.LANCZOS_G - FastMath.log(Double.MAX_VALUE);
        __CLR4_4_18a48a4lb90p7hu.R.inc(10754);this.maxLogY = FastMath.log(Double.MAX_VALUE) / (shape - 1.0);
    }finally{__CLR4_4_18a48a4lb90p7hu.R.flushNeeded();}}

    /**
     * Returns the shape parameter of {@code this} distribution.
     *
     * @return the shape parameter
     * @deprecated as of version 3.1, {@link #getShape()} should be preferred.
     * This method will be removed in version 4.0.
     */
    @Deprecated
    public double getAlpha() {try{__CLR4_4_18a48a4lb90p7hu.R.inc(10755);
        __CLR4_4_18a48a4lb90p7hu.R.inc(10756);return shape;
    }finally{__CLR4_4_18a48a4lb90p7hu.R.flushNeeded();}}

    /**
     * Returns the shape parameter of {@code this} distribution.
     *
     * @return the shape parameter
     * @since 3.1
     */
    public double getShape() {try{__CLR4_4_18a48a4lb90p7hu.R.inc(10757);
        __CLR4_4_18a48a4lb90p7hu.R.inc(10758);return shape;
    }finally{__CLR4_4_18a48a4lb90p7hu.R.flushNeeded();}}

    /**
     * Returns the scale parameter of {@code this} distribution.
     *
     * @return the scale parameter
     * @deprecated as of version 3.1, {@link #getScale()} should be preferred.
     * This method will be removed in version 4.0.
     */
    @Deprecated
    public double getBeta() {try{__CLR4_4_18a48a4lb90p7hu.R.inc(10759);
        __CLR4_4_18a48a4lb90p7hu.R.inc(10760);return scale;
    }finally{__CLR4_4_18a48a4lb90p7hu.R.flushNeeded();}}

    /**
     * Returns the scale parameter of {@code this} distribution.
     *
     * @return the scale parameter
     * @since 3.1
     */
    public double getScale() {try{__CLR4_4_18a48a4lb90p7hu.R.inc(10761);
        __CLR4_4_18a48a4lb90p7hu.R.inc(10762);return scale;
    }finally{__CLR4_4_18a48a4lb90p7hu.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double density(double x) {try{__CLR4_4_18a48a4lb90p7hu.R.inc(10763);
       /* The present method must return the value of
        *
        *     1       x a     - x
        * ---------- (-)  exp(---)
        * x Gamma(a)  b        b
        *
        * where a is the shape parameter, and b the scale parameter.
        * Substituting the Lanczos approximation of Gamma(a) leads to the
        * following expression of the density
        *
        * a              e            1         y      a
        * - sqrt(------------------) ---- (-----------)  exp(a - y + g),
        * x      2 pi (a + g + 0.5)  L(a)  a + g + 0.5
        *
        * where y = x / b. The above formula is the "natural" computation, which
        * is implemented when no overflow is likely to occur. If overflow occurs
        * with the natural computation, the following identity is used. It is
        * based on the BOOST library
        * http://www.boost.org/doc/libs/1_35_0/libs/math/doc/sf_and_dist/html/math_toolkit/special/sf_gamma/igamma.html
        * Formula (15) needs adaptations, which are detailed below.
        *
        *       y      a
        * (-----------)  exp(a - y + g)
        *  a + g + 0.5
        *                              y - a - g - 0.5    y (g + 0.5)
        *               = exp(a log1pm(---------------) - ----------- + g),
        *                                a + g + 0.5      a + g + 0.5
        *
        *  where log1pm(z) = log(1 + z) - z. Therefore, the value to be
        *  returned is
        *
        * a              e            1
        * - sqrt(------------------) ----
        * x      2 pi (a + g + 0.5)  L(a)
        *                              y - a - g - 0.5    y (g + 0.5)
        *               * exp(a log1pm(---------------) - ----------- + g).
        *                                a + g + 0.5      a + g + 0.5
        */
        __CLR4_4_18a48a4lb90p7hu.R.inc(10764);if ((((x < 0)&&(__CLR4_4_18a48a4lb90p7hu.R.iget(10765)!=0|true))||(__CLR4_4_18a48a4lb90p7hu.R.iget(10766)==0&false))) {{
            __CLR4_4_18a48a4lb90p7hu.R.inc(10767);return 0;
        }
        }__CLR4_4_18a48a4lb90p7hu.R.inc(10768);final double y = x / scale;
        __CLR4_4_18a48a4lb90p7hu.R.inc(10769);if (((((y <= minY) || (FastMath.log(y) >= maxLogY))&&(__CLR4_4_18a48a4lb90p7hu.R.iget(10770)!=0|true))||(__CLR4_4_18a48a4lb90p7hu.R.iget(10771)==0&false))) {{
            /*
             * Overflow.
             */
            __CLR4_4_18a48a4lb90p7hu.R.inc(10772);final double aux1 = (y - shiftedShape) / shiftedShape;
            __CLR4_4_18a48a4lb90p7hu.R.inc(10773);final double aux2 = shape * (FastMath.log1p(aux1) - aux1);
            __CLR4_4_18a48a4lb90p7hu.R.inc(10774);final double aux3 = -y * (Gamma.LANCZOS_G + 0.5) / shiftedShape +
                    Gamma.LANCZOS_G + aux2;
            __CLR4_4_18a48a4lb90p7hu.R.inc(10775);return densityPrefactor2 / x * FastMath.exp(aux3);
        }
        /*
         * Natural calculation.
         */
        }__CLR4_4_18a48a4lb90p7hu.R.inc(10776);return densityPrefactor1  * FastMath.exp(-y) *
                FastMath.pow(y, shape - 1);
    }finally{__CLR4_4_18a48a4lb90p7hu.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The implementation of this method is based on:
     * <ul>
     *  <li>
     *   <a href="http://mathworld.wolfram.com/Chi-SquaredDistribution.html">
     *    Chi-Squared Distribution</a>, equation (9).
     *  </li>
     *  <li>Casella, G., & Berger, R. (1990). <i>Statistical Inference</i>.
     *    Belmont, CA: Duxbury Press.
     *  </li>
     * </ul>
     */
    public double cumulativeProbability(double x) {try{__CLR4_4_18a48a4lb90p7hu.R.inc(10777);
        __CLR4_4_18a48a4lb90p7hu.R.inc(10778);double ret;

        __CLR4_4_18a48a4lb90p7hu.R.inc(10779);if ((((x <= 0)&&(__CLR4_4_18a48a4lb90p7hu.R.iget(10780)!=0|true))||(__CLR4_4_18a48a4lb90p7hu.R.iget(10781)==0&false))) {{
            __CLR4_4_18a48a4lb90p7hu.R.inc(10782);ret = 0;
        } }else {{
            __CLR4_4_18a48a4lb90p7hu.R.inc(10783);ret = Gamma.regularizedGammaP(shape, x / scale);
        }

        }__CLR4_4_18a48a4lb90p7hu.R.inc(10784);return ret;
    }finally{__CLR4_4_18a48a4lb90p7hu.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected double getSolverAbsoluteAccuracy() {try{__CLR4_4_18a48a4lb90p7hu.R.inc(10785);
        __CLR4_4_18a48a4lb90p7hu.R.inc(10786);return solverAbsoluteAccuracy;
    }finally{__CLR4_4_18a48a4lb90p7hu.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * For shape parameter {@code alpha} and scale parameter {@code beta}, the
     * mean is {@code alpha * beta}.
     */
    public double getNumericalMean() {try{__CLR4_4_18a48a4lb90p7hu.R.inc(10787);
        __CLR4_4_18a48a4lb90p7hu.R.inc(10788);return shape * scale;
    }finally{__CLR4_4_18a48a4lb90p7hu.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * For shape parameter {@code alpha} and scale parameter {@code beta}, the
     * variance is {@code alpha * beta^2}.
     *
     * @return {@inheritDoc}
     */
    public double getNumericalVariance() {try{__CLR4_4_18a48a4lb90p7hu.R.inc(10789);
        __CLR4_4_18a48a4lb90p7hu.R.inc(10790);return shape * scale * scale;
    }finally{__CLR4_4_18a48a4lb90p7hu.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The lower bound of the support is always 0 no matter the parameters.
     *
     * @return lower bound of the support (always 0)
     */
    public double getSupportLowerBound() {try{__CLR4_4_18a48a4lb90p7hu.R.inc(10791);
        __CLR4_4_18a48a4lb90p7hu.R.inc(10792);return 0;
    }finally{__CLR4_4_18a48a4lb90p7hu.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The upper bound of the support is always positive infinity
     * no matter the parameters.
     *
     * @return upper bound of the support (always Double.POSITIVE_INFINITY)
     */
    public double getSupportUpperBound() {try{__CLR4_4_18a48a4lb90p7hu.R.inc(10793);
        __CLR4_4_18a48a4lb90p7hu.R.inc(10794);return Double.POSITIVE_INFINITY;
    }finally{__CLR4_4_18a48a4lb90p7hu.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isSupportLowerBoundInclusive() {try{__CLR4_4_18a48a4lb90p7hu.R.inc(10795);
        __CLR4_4_18a48a4lb90p7hu.R.inc(10796);return true;
    }finally{__CLR4_4_18a48a4lb90p7hu.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isSupportUpperBoundInclusive() {try{__CLR4_4_18a48a4lb90p7hu.R.inc(10797);
        __CLR4_4_18a48a4lb90p7hu.R.inc(10798);return false;
    }finally{__CLR4_4_18a48a4lb90p7hu.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The support of this distribution is connected.
     *
     * @return {@code true}
     */
    public boolean isSupportConnected() {try{__CLR4_4_18a48a4lb90p7hu.R.inc(10799);
        __CLR4_4_18a48a4lb90p7hu.R.inc(10800);return true;
    }finally{__CLR4_4_18a48a4lb90p7hu.R.flushNeeded();}}

    /**
     * <p>This implementation uses the following algorithms: </p>
     *
     * <p>For 0 < shape < 1: <br/>
     * Ahrens, J. H. and Dieter, U., <i>Computer methods for
     * sampling from gamma, beta, Poisson and binomial distributions.</i>
     * Computing, 12, 223-246, 1974.</p>
     *
     * <p>For shape >= 1: <br/>
     * Marsaglia and Tsang, <i>A Simple Method for Generating
     * Gamma Variables.</i> ACM Transactions on Mathematical Software,
     * Volume 26 Issue 3, September, 2000.</p>
     *
     * @return random value sampled from the Gamma(shape, scale) distribution
     */
    @Override
    public double sample()  {try{__CLR4_4_18a48a4lb90p7hu.R.inc(10801);
        __CLR4_4_18a48a4lb90p7hu.R.inc(10802);if ((((shape < 1)&&(__CLR4_4_18a48a4lb90p7hu.R.iget(10803)!=0|true))||(__CLR4_4_18a48a4lb90p7hu.R.iget(10804)==0&false))) {{
            // [1]: p. 228, Algorithm GS

            __CLR4_4_18a48a4lb90p7hu.R.inc(10805);while (true) {{
                // Step 1:
                __CLR4_4_18a48a4lb90p7hu.R.inc(10806);final double u = random.nextDouble();
                __CLR4_4_18a48a4lb90p7hu.R.inc(10807);final double bGS = 1 + shape / FastMath.E;
                __CLR4_4_18a48a4lb90p7hu.R.inc(10808);final double p = bGS * u;

                __CLR4_4_18a48a4lb90p7hu.R.inc(10809);if ((((p <= 1)&&(__CLR4_4_18a48a4lb90p7hu.R.iget(10810)!=0|true))||(__CLR4_4_18a48a4lb90p7hu.R.iget(10811)==0&false))) {{
                    // Step 2:

                    __CLR4_4_18a48a4lb90p7hu.R.inc(10812);final double x = FastMath.pow(p, 1 / shape);
                    __CLR4_4_18a48a4lb90p7hu.R.inc(10813);final double u2 = random.nextDouble();

                    __CLR4_4_18a48a4lb90p7hu.R.inc(10814);if ((((u2 > FastMath.exp(-x))&&(__CLR4_4_18a48a4lb90p7hu.R.iget(10815)!=0|true))||(__CLR4_4_18a48a4lb90p7hu.R.iget(10816)==0&false))) {{
                        // Reject
                        __CLR4_4_18a48a4lb90p7hu.R.inc(10817);continue;
                    } }else {{
                        __CLR4_4_18a48a4lb90p7hu.R.inc(10818);return scale * x;
                    }
                }} }else {{
                    // Step 3:

                    __CLR4_4_18a48a4lb90p7hu.R.inc(10819);final double x = -1 * FastMath.log((bGS - p) / shape);
                    __CLR4_4_18a48a4lb90p7hu.R.inc(10820);final double u2 = random.nextDouble();

                    __CLR4_4_18a48a4lb90p7hu.R.inc(10821);if ((((u2 > FastMath.pow(x, shape - 1))&&(__CLR4_4_18a48a4lb90p7hu.R.iget(10822)!=0|true))||(__CLR4_4_18a48a4lb90p7hu.R.iget(10823)==0&false))) {{
                        // Reject
                        __CLR4_4_18a48a4lb90p7hu.R.inc(10824);continue;
                    } }else {{
                        __CLR4_4_18a48a4lb90p7hu.R.inc(10825);return scale * x;
                    }
                }}
            }}
        }}

        // Now shape >= 1

        }__CLR4_4_18a48a4lb90p7hu.R.inc(10826);final double d = shape - 0.333333333333333333;
        __CLR4_4_18a48a4lb90p7hu.R.inc(10827);final double c = 1 / (3 * FastMath.sqrt(d));

        __CLR4_4_18a48a4lb90p7hu.R.inc(10828);while (true) {{
            __CLR4_4_18a48a4lb90p7hu.R.inc(10829);final double x = random.nextGaussian();
            __CLR4_4_18a48a4lb90p7hu.R.inc(10830);final double v = (1 + c * x) * (1 + c * x) * (1 + c * x);

            __CLR4_4_18a48a4lb90p7hu.R.inc(10831);if ((((v <= 0)&&(__CLR4_4_18a48a4lb90p7hu.R.iget(10832)!=0|true))||(__CLR4_4_18a48a4lb90p7hu.R.iget(10833)==0&false))) {{
                __CLR4_4_18a48a4lb90p7hu.R.inc(10834);continue;
            }

            }__CLR4_4_18a48a4lb90p7hu.R.inc(10835);final double x2 = x * x;
            __CLR4_4_18a48a4lb90p7hu.R.inc(10836);final double u = random.nextDouble();

            // Squeeze
            __CLR4_4_18a48a4lb90p7hu.R.inc(10837);if ((((u < 1 - 0.0331 * x2 * x2)&&(__CLR4_4_18a48a4lb90p7hu.R.iget(10838)!=0|true))||(__CLR4_4_18a48a4lb90p7hu.R.iget(10839)==0&false))) {{
                __CLR4_4_18a48a4lb90p7hu.R.inc(10840);return scale * d * v;
            }

            }__CLR4_4_18a48a4lb90p7hu.R.inc(10841);if ((((FastMath.log(u) < 0.5 * x2 + d * (1 - v + FastMath.log(v)))&&(__CLR4_4_18a48a4lb90p7hu.R.iget(10842)!=0|true))||(__CLR4_4_18a48a4lb90p7hu.R.iget(10843)==0&false))) {{
                __CLR4_4_18a48a4lb90p7hu.R.inc(10844);return scale * d * v;
            }
        }}
    }}finally{__CLR4_4_18a48a4lb90p7hu.R.flushNeeded();}}
}
