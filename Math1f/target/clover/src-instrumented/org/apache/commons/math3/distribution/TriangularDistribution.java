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

import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;

/**
 * Implementation of the triangular real distribution.
 *
 * @see <a href="http://en.wikipedia.org/wiki/Triangular_distribution">
 * Triangular distribution (Wikipedia)</a>
 *
 * @version $Id$
 * @since 3.0
 */
public class TriangularDistribution extends AbstractRealDistribution {public static class __CLR4_4_195j95jlb90p7lk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,11963,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Serializable version identifier. */
    private static final long serialVersionUID = 20120112L;
    /** Lower limit of this distribution (inclusive). */
    private final double a;
    /** Upper limit of this distribution (inclusive). */
    private final double b;
    /** Mode of this distribution. */
    private final double c;
    /** Inverse cumulative probability accuracy. */
    private final double solverAbsoluteAccuracy;

    /**
     * Creates a triangular real distribution using the given lower limit,
     * upper limit, and mode.
     *
     * @param a Lower limit of this distribution (inclusive).
     * @param b Upper limit of this distribution (inclusive).
     * @param c Mode of this distribution.
     * @throws NumberIsTooLargeException if {@code a >= b} or if {@code c > b}.
     * @throws NumberIsTooSmallException if {@code c < a}.
     */
    public TriangularDistribution(double a, double c, double b)
        throws NumberIsTooLargeException, NumberIsTooSmallException {
        this(new Well19937c(), a, c, b);__CLR4_4_195j95jlb90p7lk.R.inc(11864);try{__CLR4_4_195j95jlb90p7lk.R.inc(11863);
    }finally{__CLR4_4_195j95jlb90p7lk.R.flushNeeded();}}

    /**
     * Creates a triangular distribution.
     *
     * @param rng Random number generator.
     * @param a Lower limit of this distribution (inclusive).
     * @param b Upper limit of this distribution (inclusive).
     * @param c Mode of this distribution.
     * @throws NumberIsTooLargeException if {@code a >= b} or if {@code c > b}.
     * @throws NumberIsTooSmallException if {@code c < a}.
     * @since 3.1
     */
    public TriangularDistribution(RandomGenerator rng,
                                  double a,
                                  double c,
                                  double b)
        throws NumberIsTooLargeException, NumberIsTooSmallException {
        super(rng);__CLR4_4_195j95jlb90p7lk.R.inc(11866);try{__CLR4_4_195j95jlb90p7lk.R.inc(11865);

        __CLR4_4_195j95jlb90p7lk.R.inc(11867);if ((((a >= b)&&(__CLR4_4_195j95jlb90p7lk.R.iget(11868)!=0|true))||(__CLR4_4_195j95jlb90p7lk.R.iget(11869)==0&false))) {{
            __CLR4_4_195j95jlb90p7lk.R.inc(11870);throw new NumberIsTooLargeException(
                            LocalizedFormats.LOWER_BOUND_NOT_BELOW_UPPER_BOUND,
                            a, b, false);
        }
        }__CLR4_4_195j95jlb90p7lk.R.inc(11871);if ((((c < a)&&(__CLR4_4_195j95jlb90p7lk.R.iget(11872)!=0|true))||(__CLR4_4_195j95jlb90p7lk.R.iget(11873)==0&false))) {{
            __CLR4_4_195j95jlb90p7lk.R.inc(11874);throw new NumberIsTooSmallException(
                    LocalizedFormats.NUMBER_TOO_SMALL, c, a, true);
        }
        }__CLR4_4_195j95jlb90p7lk.R.inc(11875);if ((((c > b)&&(__CLR4_4_195j95jlb90p7lk.R.iget(11876)!=0|true))||(__CLR4_4_195j95jlb90p7lk.R.iget(11877)==0&false))) {{
            __CLR4_4_195j95jlb90p7lk.R.inc(11878);throw new NumberIsTooLargeException(
                    LocalizedFormats.NUMBER_TOO_LARGE, c, b, true);
        }

        }__CLR4_4_195j95jlb90p7lk.R.inc(11879);this.a = a;
        __CLR4_4_195j95jlb90p7lk.R.inc(11880);this.c = c;
        __CLR4_4_195j95jlb90p7lk.R.inc(11881);this.b = b;
        __CLR4_4_195j95jlb90p7lk.R.inc(11882);solverAbsoluteAccuracy = FastMath.max(FastMath.ulp(a), FastMath.ulp(b));
    }finally{__CLR4_4_195j95jlb90p7lk.R.flushNeeded();}}

    /**
     * Returns the mode {@code c} of this distribution.
     *
     * @return the mode {@code c} of this distribution
     */
    public double getMode() {try{__CLR4_4_195j95jlb90p7lk.R.inc(11883);
        __CLR4_4_195j95jlb90p7lk.R.inc(11884);return c;
    }finally{__CLR4_4_195j95jlb90p7lk.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * <p>
     * For this distribution, the returned value is not really meaningful,
     * since exact formulas are implemented for the computation of the
     * {@link #inverseCumulativeProbability(double)} (no solver is invoked).
     * </p>
     * <p>
     * For lower limit {@code a} and upper limit {@code b}, the current
     * implementation returns {@code max(ulp(a), ulp(b)}.
     * </p>
     */
    @Override
    protected double getSolverAbsoluteAccuracy() {try{__CLR4_4_195j95jlb90p7lk.R.inc(11885);
        __CLR4_4_195j95jlb90p7lk.R.inc(11886);return solverAbsoluteAccuracy;
    }finally{__CLR4_4_195j95jlb90p7lk.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * For lower limit {@code a}, upper limit {@code b} and mode {@code c}, the
     * PDF is given by
     * <ul>
     * <li>{@code 2 * (x - a) / [(b - a) * (c - a)]} if {@code a <= x < c},</li>
     * <li>{@code 2 / (b - a)} if {@code x = c},</li>
     * <li>{@code 2 * (b - x) / [(b - a) * (b - c)]} if {@code c < x <= b},</li>
     * <li>{@code 0} otherwise.
     * </ul>
     */
    public double density(double x) {try{__CLR4_4_195j95jlb90p7lk.R.inc(11887);
        __CLR4_4_195j95jlb90p7lk.R.inc(11888);if ((((x < a)&&(__CLR4_4_195j95jlb90p7lk.R.iget(11889)!=0|true))||(__CLR4_4_195j95jlb90p7lk.R.iget(11890)==0&false))) {{
            __CLR4_4_195j95jlb90p7lk.R.inc(11891);return 0;
        }
        }__CLR4_4_195j95jlb90p7lk.R.inc(11892);if ((((a <= x && x < c)&&(__CLR4_4_195j95jlb90p7lk.R.iget(11893)!=0|true))||(__CLR4_4_195j95jlb90p7lk.R.iget(11894)==0&false))) {{
            __CLR4_4_195j95jlb90p7lk.R.inc(11895);double divident = 2 * (x - a);
            __CLR4_4_195j95jlb90p7lk.R.inc(11896);double divisor = (b - a) * (c - a);
            __CLR4_4_195j95jlb90p7lk.R.inc(11897);return divident / divisor;
        }
        }__CLR4_4_195j95jlb90p7lk.R.inc(11898);if ((((x == c)&&(__CLR4_4_195j95jlb90p7lk.R.iget(11899)!=0|true))||(__CLR4_4_195j95jlb90p7lk.R.iget(11900)==0&false))) {{
            __CLR4_4_195j95jlb90p7lk.R.inc(11901);return 2 / (b - a);
        }
        }__CLR4_4_195j95jlb90p7lk.R.inc(11902);if ((((c < x && x <= b)&&(__CLR4_4_195j95jlb90p7lk.R.iget(11903)!=0|true))||(__CLR4_4_195j95jlb90p7lk.R.iget(11904)==0&false))) {{
            __CLR4_4_195j95jlb90p7lk.R.inc(11905);double divident = 2 * (b - x);
            __CLR4_4_195j95jlb90p7lk.R.inc(11906);double divisor = (b - a) * (b - c);
            __CLR4_4_195j95jlb90p7lk.R.inc(11907);return divident / divisor;
        }
        }__CLR4_4_195j95jlb90p7lk.R.inc(11908);return 0;
    }finally{__CLR4_4_195j95jlb90p7lk.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * For lower limit {@code a}, upper limit {@code b} and mode {@code c}, the
     * CDF is given by
     * <ul>
     * <li>{@code 0} if {@code x < a},</li>
     * <li>{@code (x - a)^2 / [(b - a) * (c - a)]} if {@code a <= x < c},</li>
     * <li>{@code (c - a) / (b - a)} if {@code x = c},</li>
     * <li>{@code 1 - (b - x)^2 / [(b - a) * (b - c)]} if {@code c < x <= b},</li>
     * <li>{@code 1} if {@code x > b}.</li>
     * </ul>
     */
    public double cumulativeProbability(double x)  {try{__CLR4_4_195j95jlb90p7lk.R.inc(11909);
        __CLR4_4_195j95jlb90p7lk.R.inc(11910);if ((((x < a)&&(__CLR4_4_195j95jlb90p7lk.R.iget(11911)!=0|true))||(__CLR4_4_195j95jlb90p7lk.R.iget(11912)==0&false))) {{
            __CLR4_4_195j95jlb90p7lk.R.inc(11913);return 0;
        }
        }__CLR4_4_195j95jlb90p7lk.R.inc(11914);if ((((a <= x && x < c)&&(__CLR4_4_195j95jlb90p7lk.R.iget(11915)!=0|true))||(__CLR4_4_195j95jlb90p7lk.R.iget(11916)==0&false))) {{
            __CLR4_4_195j95jlb90p7lk.R.inc(11917);double divident = (x - a) * (x - a);
            __CLR4_4_195j95jlb90p7lk.R.inc(11918);double divisor = (b - a) * (c - a);
            __CLR4_4_195j95jlb90p7lk.R.inc(11919);return divident / divisor;
        }
        }__CLR4_4_195j95jlb90p7lk.R.inc(11920);if ((((x == c)&&(__CLR4_4_195j95jlb90p7lk.R.iget(11921)!=0|true))||(__CLR4_4_195j95jlb90p7lk.R.iget(11922)==0&false))) {{
            __CLR4_4_195j95jlb90p7lk.R.inc(11923);return (c - a) / (b - a);
        }
        }__CLR4_4_195j95jlb90p7lk.R.inc(11924);if ((((c < x && x <= b)&&(__CLR4_4_195j95jlb90p7lk.R.iget(11925)!=0|true))||(__CLR4_4_195j95jlb90p7lk.R.iget(11926)==0&false))) {{
            __CLR4_4_195j95jlb90p7lk.R.inc(11927);double divident = (b - x) * (b - x);
            __CLR4_4_195j95jlb90p7lk.R.inc(11928);double divisor = (b - a) * (b - c);
            __CLR4_4_195j95jlb90p7lk.R.inc(11929);return 1 - (divident / divisor);
        }
        }__CLR4_4_195j95jlb90p7lk.R.inc(11930);return 1;
    }finally{__CLR4_4_195j95jlb90p7lk.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * For lower limit {@code a}, upper limit {@code b}, and mode {@code c},
     * the mean is {@code (a + b + c) / 3}.
     */
    public double getNumericalMean() {try{__CLR4_4_195j95jlb90p7lk.R.inc(11931);
        __CLR4_4_195j95jlb90p7lk.R.inc(11932);return (a + b + c) / 3;
    }finally{__CLR4_4_195j95jlb90p7lk.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * For lower limit {@code a}, upper limit {@code b}, and mode {@code c},
     * the variance is {@code (a^2 + b^2 + c^2 - a * b - a * c - b * c) / 18}.
     */
    public double getNumericalVariance() {try{__CLR4_4_195j95jlb90p7lk.R.inc(11933);
        __CLR4_4_195j95jlb90p7lk.R.inc(11934);return (a * a + b * b + c * c - a * b - a * c - b * c) / 18;
    }finally{__CLR4_4_195j95jlb90p7lk.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The lower bound of the support is equal to the lower limit parameter
     * {@code a} of the distribution.
     *
     * @return lower bound of the support
     */
    public double getSupportLowerBound() {try{__CLR4_4_195j95jlb90p7lk.R.inc(11935);
        __CLR4_4_195j95jlb90p7lk.R.inc(11936);return a;
    }finally{__CLR4_4_195j95jlb90p7lk.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The upper bound of the support is equal to the upper limit parameter
     * {@code b} of the distribution.
     *
     * @return upper bound of the support
     */
    public double getSupportUpperBound() {try{__CLR4_4_195j95jlb90p7lk.R.inc(11937);
        __CLR4_4_195j95jlb90p7lk.R.inc(11938);return b;
    }finally{__CLR4_4_195j95jlb90p7lk.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isSupportLowerBoundInclusive() {try{__CLR4_4_195j95jlb90p7lk.R.inc(11939);
        __CLR4_4_195j95jlb90p7lk.R.inc(11940);return true;
    }finally{__CLR4_4_195j95jlb90p7lk.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isSupportUpperBoundInclusive() {try{__CLR4_4_195j95jlb90p7lk.R.inc(11941);
        __CLR4_4_195j95jlb90p7lk.R.inc(11942);return true;
    }finally{__CLR4_4_195j95jlb90p7lk.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The support of this distribution is connected.
     *
     * @return {@code true}
     */
    public boolean isSupportConnected() {try{__CLR4_4_195j95jlb90p7lk.R.inc(11943);
        __CLR4_4_195j95jlb90p7lk.R.inc(11944);return true;
    }finally{__CLR4_4_195j95jlb90p7lk.R.flushNeeded();}}

    @Override
    public double inverseCumulativeProbability(double p)
        throws OutOfRangeException {try{__CLR4_4_195j95jlb90p7lk.R.inc(11945);
        __CLR4_4_195j95jlb90p7lk.R.inc(11946);if ((((p < 0 || p > 1)&&(__CLR4_4_195j95jlb90p7lk.R.iget(11947)!=0|true))||(__CLR4_4_195j95jlb90p7lk.R.iget(11948)==0&false))) {{
            __CLR4_4_195j95jlb90p7lk.R.inc(11949);throw new OutOfRangeException(p, 0, 1);
        }
        }__CLR4_4_195j95jlb90p7lk.R.inc(11950);if ((((p == 0)&&(__CLR4_4_195j95jlb90p7lk.R.iget(11951)!=0|true))||(__CLR4_4_195j95jlb90p7lk.R.iget(11952)==0&false))) {{
            __CLR4_4_195j95jlb90p7lk.R.inc(11953);return a;
        }
        }__CLR4_4_195j95jlb90p7lk.R.inc(11954);if ((((p == 1)&&(__CLR4_4_195j95jlb90p7lk.R.iget(11955)!=0|true))||(__CLR4_4_195j95jlb90p7lk.R.iget(11956)==0&false))) {{
            __CLR4_4_195j95jlb90p7lk.R.inc(11957);return b;
        }
        }__CLR4_4_195j95jlb90p7lk.R.inc(11958);if ((((p < (c - a) / (b - a))&&(__CLR4_4_195j95jlb90p7lk.R.iget(11959)!=0|true))||(__CLR4_4_195j95jlb90p7lk.R.iget(11960)==0&false))) {{
            __CLR4_4_195j95jlb90p7lk.R.inc(11961);return a + FastMath.sqrt(p * (b - a) * (c - a));
        }
        }__CLR4_4_195j95jlb90p7lk.R.inc(11962);return b - FastMath.sqrt((1 - p) * (b - a) * (b - c));
    }finally{__CLR4_4_195j95jlb90p7lk.R.flushNeeded();}}
}
