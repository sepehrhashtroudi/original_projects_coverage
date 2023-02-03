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
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;

/**
 * Implementation of the geometric distribution.
 *
 * @see <a href="http://en.wikipedia.org/wiki/Geometric_distribution">Geometric distribution (Wikipedia)</a>
 * @see <a href="http://mathworld.wolfram.com/GeometricDistribution.html">Geometric Distribution (MathWorld)</a>
 * @version $Id$
 * @since 3.3
 */
public class GeometricDistribution extends AbstractIntegerDistribution {public static class __CLR4_4_18d98d9lb90p7i0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,10886,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier. */
    private static final long serialVersionUID = 20130507L;
    /** The probability of success. */
    private final double probabilityOfSuccess;

    /**
     * Create a geometric distribution with the given probability of success.
     *
     * @param p probability of success.
     * @throws OutOfRangeException if {@code p <= 0} or {@code p > 1}.
     */
    public GeometricDistribution(double p) {
        this(new Well19937c(), p);__CLR4_4_18d98d9lb90p7i0.R.inc(10846);try{__CLR4_4_18d98d9lb90p7i0.R.inc(10845);
    }finally{__CLR4_4_18d98d9lb90p7i0.R.flushNeeded();}}

    /**
     * Creates a geometric distribution.
     *
     * @param rng Random number generator.
     * @param p Probability of success.
     * @throws OutOfRangeException if {@code p <= 0} or {@code p > 1}.
     */
    public GeometricDistribution(RandomGenerator rng, double p) {
        super(rng);__CLR4_4_18d98d9lb90p7i0.R.inc(10848);try{__CLR4_4_18d98d9lb90p7i0.R.inc(10847);

        __CLR4_4_18d98d9lb90p7i0.R.inc(10849);if ((((p <= 0 || p > 1)&&(__CLR4_4_18d98d9lb90p7i0.R.iget(10850)!=0|true))||(__CLR4_4_18d98d9lb90p7i0.R.iget(10851)==0&false))) {{
            __CLR4_4_18d98d9lb90p7i0.R.inc(10852);throw new OutOfRangeException(LocalizedFormats.OUT_OF_RANGE_LEFT, p, 0, 1);
        }

        }__CLR4_4_18d98d9lb90p7i0.R.inc(10853);probabilityOfSuccess = p;
    }finally{__CLR4_4_18d98d9lb90p7i0.R.flushNeeded();}}

    /**
     * Access the probability of success for this distribution.
     *
     * @return the probability of success.
     */
    public double getProbabilityOfSuccess() {try{__CLR4_4_18d98d9lb90p7i0.R.inc(10854);
        __CLR4_4_18d98d9lb90p7i0.R.inc(10855);return probabilityOfSuccess;
    }finally{__CLR4_4_18d98d9lb90p7i0.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double probability(int x) {try{__CLR4_4_18d98d9lb90p7i0.R.inc(10856);
        __CLR4_4_18d98d9lb90p7i0.R.inc(10857);double ret;
        __CLR4_4_18d98d9lb90p7i0.R.inc(10858);if ((((x < 0)&&(__CLR4_4_18d98d9lb90p7i0.R.iget(10859)!=0|true))||(__CLR4_4_18d98d9lb90p7i0.R.iget(10860)==0&false))) {{
            __CLR4_4_18d98d9lb90p7i0.R.inc(10861);ret = 0.0;
        } }else {{
            __CLR4_4_18d98d9lb90p7i0.R.inc(10862);final double p = probabilityOfSuccess;
            __CLR4_4_18d98d9lb90p7i0.R.inc(10863);ret = FastMath.pow(1 - p, x) * p;
        }
        }__CLR4_4_18d98d9lb90p7i0.R.inc(10864);return ret;
    }finally{__CLR4_4_18d98d9lb90p7i0.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double cumulativeProbability(int x) {try{__CLR4_4_18d98d9lb90p7i0.R.inc(10865);
        __CLR4_4_18d98d9lb90p7i0.R.inc(10866);double ret;
        __CLR4_4_18d98d9lb90p7i0.R.inc(10867);if ((((x < 0)&&(__CLR4_4_18d98d9lb90p7i0.R.iget(10868)!=0|true))||(__CLR4_4_18d98d9lb90p7i0.R.iget(10869)==0&false))) {{
            __CLR4_4_18d98d9lb90p7i0.R.inc(10870);ret = 0.0;
        } }else {{
            __CLR4_4_18d98d9lb90p7i0.R.inc(10871);final double p = probabilityOfSuccess;
            __CLR4_4_18d98d9lb90p7i0.R.inc(10872);ret = 1.0 - FastMath.pow(1 - p, x + 1);
        }
        }__CLR4_4_18d98d9lb90p7i0.R.inc(10873);return ret;
    }finally{__CLR4_4_18d98d9lb90p7i0.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * For probability parameter {@code p}, the mean is {@code (1 - p) / p}.
     */
    public double getNumericalMean() {try{__CLR4_4_18d98d9lb90p7i0.R.inc(10874);
        __CLR4_4_18d98d9lb90p7i0.R.inc(10875);final double p = probabilityOfSuccess;
        __CLR4_4_18d98d9lb90p7i0.R.inc(10876);return (1 - p) / p;
    }finally{__CLR4_4_18d98d9lb90p7i0.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * For probability parameter {@code p}, the variance is
     * {@code (1 - p) / (p * p)}.
     */
    public double getNumericalVariance() {try{__CLR4_4_18d98d9lb90p7i0.R.inc(10877);
        __CLR4_4_18d98d9lb90p7i0.R.inc(10878);final double p = probabilityOfSuccess;
        __CLR4_4_18d98d9lb90p7i0.R.inc(10879);return (1 - p) / (p * p);
    }finally{__CLR4_4_18d98d9lb90p7i0.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The lower bound of the support is always 0.
     *
     * @return lower bound of the support (always 0)
     */
    public int getSupportLowerBound() {try{__CLR4_4_18d98d9lb90p7i0.R.inc(10880);
        __CLR4_4_18d98d9lb90p7i0.R.inc(10881);return 0;
    }finally{__CLR4_4_18d98d9lb90p7i0.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The upper bound of the support is infinite (which we approximate as
     * {@code Integer.MAX_VALUE}).
     *
     * @return upper bound of the support (always Integer.MAX_VALUE)
     */
    public int getSupportUpperBound() {try{__CLR4_4_18d98d9lb90p7i0.R.inc(10882);
        __CLR4_4_18d98d9lb90p7i0.R.inc(10883);return Integer.MAX_VALUE;
    }finally{__CLR4_4_18d98d9lb90p7i0.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The support of this distribution is connected.
     *
     * @return {@code true}
     */
    public boolean isSupportConnected() {try{__CLR4_4_18d98d9lb90p7i0.R.inc(10884);
        __CLR4_4_18d98d9lb90p7i0.R.inc(10885);return true;
    }finally{__CLR4_4_18d98d9lb90p7i0.R.flushNeeded();}}
}
