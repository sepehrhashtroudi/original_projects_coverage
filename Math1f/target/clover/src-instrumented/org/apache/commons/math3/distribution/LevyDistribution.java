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

import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.special.Erf;
import org.apache.commons.math3.util.FastMath;

/**
 * This class implements the <a href="http://en.wikipedia.org/wiki/L%C3%A9vy_distribution">
 * L&eacute;vy distribution</a>.
 *
 * @version $Id$
 * @since 3.2
 */
public class LevyDistribution extends AbstractRealDistribution {public static class __CLR4_4_18kr8krlb90p7ix{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,11159,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable UID. */
    private static final long serialVersionUID = 20130314L;

    /** Location parameter. */
    private final double mu;

    /** Scale parameter. */
    private final double c;  // Setting this to 1 returns a cumProb of 1.0

    /** Half of c (for calculations). */
    private final double halfC;

    /**
     * Creates a LevyDistribution.
     * @param rng random generator to be used for sampling
     * @param mu location
     * @param c scale parameter
     */
    public LevyDistribution(final RandomGenerator rng, final double mu, final double c) {
        super(rng);__CLR4_4_18kr8krlb90p7ix.R.inc(11116);try{__CLR4_4_18kr8krlb90p7ix.R.inc(11115);
        __CLR4_4_18kr8krlb90p7ix.R.inc(11117);this.mu    = mu;
        __CLR4_4_18kr8krlb90p7ix.R.inc(11118);this.c     = c;
        __CLR4_4_18kr8krlb90p7ix.R.inc(11119);this.halfC = 0.5 * c;
    }finally{__CLR4_4_18kr8krlb90p7ix.R.flushNeeded();}}

    /** {@inheritDoc}
    * <p>
    * From Wikipedia: The probability density function of the L&eacute;vy distribution
    * over the domain is
    * </p>
    * <pre>
    * f(x; &mu;, c) = &radic;(c / 2&pi;) * e<sup>-c / 2 (x - &mu;)</sup> / (x - &mu;)<sup>3/2</sup>
    * </pre>
    * <p>
    * For this distribution, {@code X}, this method returns {@code P(X < x)}.
    * If {@code x} is less than location parameter &mu;, {@code Double.NaN} is
    * returned, as in these cases the distribution is not defined.
    * </p>
    */
    public double density(final double x) {try{__CLR4_4_18kr8krlb90p7ix.R.inc(11120);
        __CLR4_4_18kr8krlb90p7ix.R.inc(11121);if ((((x < mu)&&(__CLR4_4_18kr8krlb90p7ix.R.iget(11122)!=0|true))||(__CLR4_4_18kr8krlb90p7ix.R.iget(11123)==0&false))) {{
            __CLR4_4_18kr8krlb90p7ix.R.inc(11124);return Double.NaN;
        }

        }__CLR4_4_18kr8krlb90p7ix.R.inc(11125);final double delta = x - mu;
        __CLR4_4_18kr8krlb90p7ix.R.inc(11126);final double f     = halfC / delta;
        __CLR4_4_18kr8krlb90p7ix.R.inc(11127);return FastMath.sqrt(f / FastMath.PI) * FastMath.exp(-f) /delta;
    }finally{__CLR4_4_18kr8krlb90p7ix.R.flushNeeded();}}

    /** {@inheritDoc}
     * <p>
     * From Wikipedia: the cumulative distribution function is
     * </p>
     * <pre>
     * f(x; u, c) = erfc (&radic; (c / 2 (x - u )))
     * </pre>
     */
    public double cumulativeProbability(final double x) {try{__CLR4_4_18kr8krlb90p7ix.R.inc(11128);
        __CLR4_4_18kr8krlb90p7ix.R.inc(11129);if ((((x < mu)&&(__CLR4_4_18kr8krlb90p7ix.R.iget(11130)!=0|true))||(__CLR4_4_18kr8krlb90p7ix.R.iget(11131)==0&false))) {{
            __CLR4_4_18kr8krlb90p7ix.R.inc(11132);return Double.NaN;
        }
        }__CLR4_4_18kr8krlb90p7ix.R.inc(11133);return Erf.erfc(FastMath.sqrt(halfC / (x - mu)));
    }finally{__CLR4_4_18kr8krlb90p7ix.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double inverseCumulativeProbability(final double p) throws OutOfRangeException {try{__CLR4_4_18kr8krlb90p7ix.R.inc(11134);
        __CLR4_4_18kr8krlb90p7ix.R.inc(11135);if ((((p < 0.0 || p > 1.0)&&(__CLR4_4_18kr8krlb90p7ix.R.iget(11136)!=0|true))||(__CLR4_4_18kr8krlb90p7ix.R.iget(11137)==0&false))) {{
            __CLR4_4_18kr8krlb90p7ix.R.inc(11138);throw new OutOfRangeException(p, 0, 1);
        }
        }__CLR4_4_18kr8krlb90p7ix.R.inc(11139);final double t = Erf.erfcInv(p);
        __CLR4_4_18kr8krlb90p7ix.R.inc(11140);return mu + halfC / (t * t);
    }finally{__CLR4_4_18kr8krlb90p7ix.R.flushNeeded();}}

    /** Get the scale parameter of the distribution.
     * @return scale parameter of the distribution
     */
    public double getScale() {try{__CLR4_4_18kr8krlb90p7ix.R.inc(11141);
        __CLR4_4_18kr8krlb90p7ix.R.inc(11142);return c;
    }finally{__CLR4_4_18kr8krlb90p7ix.R.flushNeeded();}}

    /** Get the location parameter of the distribution.
     * @return location parameter of the distribution
     */
    public double getLocation() {try{__CLR4_4_18kr8krlb90p7ix.R.inc(11143);
        __CLR4_4_18kr8krlb90p7ix.R.inc(11144);return mu;
    }finally{__CLR4_4_18kr8krlb90p7ix.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double getNumericalMean() {try{__CLR4_4_18kr8krlb90p7ix.R.inc(11145);
        __CLR4_4_18kr8krlb90p7ix.R.inc(11146);return Double.POSITIVE_INFINITY;
    }finally{__CLR4_4_18kr8krlb90p7ix.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double getNumericalVariance() {try{__CLR4_4_18kr8krlb90p7ix.R.inc(11147);
        __CLR4_4_18kr8krlb90p7ix.R.inc(11148);return Double.POSITIVE_INFINITY;
    }finally{__CLR4_4_18kr8krlb90p7ix.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double getSupportLowerBound() {try{__CLR4_4_18kr8krlb90p7ix.R.inc(11149);
        __CLR4_4_18kr8krlb90p7ix.R.inc(11150);return mu;
    }finally{__CLR4_4_18kr8krlb90p7ix.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double getSupportUpperBound() {try{__CLR4_4_18kr8krlb90p7ix.R.inc(11151);
        __CLR4_4_18kr8krlb90p7ix.R.inc(11152);return Double.POSITIVE_INFINITY;
    }finally{__CLR4_4_18kr8krlb90p7ix.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isSupportLowerBoundInclusive() {try{__CLR4_4_18kr8krlb90p7ix.R.inc(11153);
        // there is a division by x-mu in the computation, so density
        // is not finite at lower bound, bound must be excluded
        __CLR4_4_18kr8krlb90p7ix.R.inc(11154);return false;
    }finally{__CLR4_4_18kr8krlb90p7ix.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isSupportUpperBoundInclusive() {try{__CLR4_4_18kr8krlb90p7ix.R.inc(11155);
        // upper bound is infinite, so it must be excluded
        __CLR4_4_18kr8krlb90p7ix.R.inc(11156);return false;
    }finally{__CLR4_4_18kr8krlb90p7ix.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isSupportConnected() {try{__CLR4_4_18kr8krlb90p7ix.R.inc(11157);
        __CLR4_4_18kr8krlb90p7ix.R.inc(11158);return true;
    }finally{__CLR4_4_18kr8krlb90p7ix.R.flushNeeded();}}

}
