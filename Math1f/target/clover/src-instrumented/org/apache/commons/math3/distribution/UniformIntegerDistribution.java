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
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;

/**
 * Implementation of the uniform integer distribution.
 *
 * @see <a href="http://en.wikipedia.org/wiki/Uniform_distribution_(discrete)"
 * >Uniform distribution (discrete), at Wikipedia</a>
 *
 * @version $Id$
 * @since 3.0
 */
public class UniformIntegerDistribution extends AbstractIntegerDistribution {public static class __CLR4_4_198b98blb90p7lp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,12012,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Serializable version identifier. */
    private static final long serialVersionUID = 20120109L;
    /** Lower bound (inclusive) of this distribution. */
    private final int lower;
    /** Upper bound (inclusive) of this distribution. */
    private final int upper;

    /**
     * Creates a new uniform integer distribution using the given lower and
     * upper bounds (both inclusive).
     *
     * @param lower Lower bound (inclusive) of this distribution.
     * @param upper Upper bound (inclusive) of this distribution.
     * @throws NumberIsTooLargeException if {@code lower >= upper}.
     */
    public UniformIntegerDistribution(int lower, int upper)
        throws NumberIsTooLargeException {
        this(new Well19937c(), lower, upper);__CLR4_4_198b98blb90p7lp.R.inc(11964);try{__CLR4_4_198b98blb90p7lp.R.inc(11963);
    }finally{__CLR4_4_198b98blb90p7lp.R.flushNeeded();}}

    /**
     * Creates a new uniform integer distribution using the given lower and
     * upper bounds (both inclusive).
     *
     * @param rng Random number generator.
     * @param lower Lower bound (inclusive) of this distribution.
     * @param upper Upper bound (inclusive) of this distribution.
     * @throws NumberIsTooLargeException if {@code lower >= upper}.
     * @since 3.1
     */
    public UniformIntegerDistribution(RandomGenerator rng,
                                      int lower,
                                      int upper)
        throws NumberIsTooLargeException {
        super(rng);__CLR4_4_198b98blb90p7lp.R.inc(11966);try{__CLR4_4_198b98blb90p7lp.R.inc(11965);

        __CLR4_4_198b98blb90p7lp.R.inc(11967);if ((((lower >= upper)&&(__CLR4_4_198b98blb90p7lp.R.iget(11968)!=0|true))||(__CLR4_4_198b98blb90p7lp.R.iget(11969)==0&false))) {{
            __CLR4_4_198b98blb90p7lp.R.inc(11970);throw new NumberIsTooLargeException(
                            LocalizedFormats.LOWER_BOUND_NOT_BELOW_UPPER_BOUND,
                            lower, upper, false);
        }
        }__CLR4_4_198b98blb90p7lp.R.inc(11971);this.lower = lower;
        __CLR4_4_198b98blb90p7lp.R.inc(11972);this.upper = upper;
    }finally{__CLR4_4_198b98blb90p7lp.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double probability(int x) {try{__CLR4_4_198b98blb90p7lp.R.inc(11973);
        __CLR4_4_198b98blb90p7lp.R.inc(11974);if ((((x < lower || x > upper)&&(__CLR4_4_198b98blb90p7lp.R.iget(11975)!=0|true))||(__CLR4_4_198b98blb90p7lp.R.iget(11976)==0&false))) {{
            __CLR4_4_198b98blb90p7lp.R.inc(11977);return 0;
        }
        }__CLR4_4_198b98blb90p7lp.R.inc(11978);return 1.0 / (upper - lower + 1);
    }finally{__CLR4_4_198b98blb90p7lp.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double cumulativeProbability(int x) {try{__CLR4_4_198b98blb90p7lp.R.inc(11979);
        __CLR4_4_198b98blb90p7lp.R.inc(11980);if ((((x < lower)&&(__CLR4_4_198b98blb90p7lp.R.iget(11981)!=0|true))||(__CLR4_4_198b98blb90p7lp.R.iget(11982)==0&false))) {{
            __CLR4_4_198b98blb90p7lp.R.inc(11983);return 0;
        }
        }__CLR4_4_198b98blb90p7lp.R.inc(11984);if ((((x > upper)&&(__CLR4_4_198b98blb90p7lp.R.iget(11985)!=0|true))||(__CLR4_4_198b98blb90p7lp.R.iget(11986)==0&false))) {{
            __CLR4_4_198b98blb90p7lp.R.inc(11987);return 1;
        }
        }__CLR4_4_198b98blb90p7lp.R.inc(11988);return (x - lower + 1.0) / (upper - lower + 1.0);
    }finally{__CLR4_4_198b98blb90p7lp.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * For lower bound {@code lower} and upper bound {@code upper}, the mean is
     * {@code 0.5 * (lower + upper)}.
     */
    public double getNumericalMean() {try{__CLR4_4_198b98blb90p7lp.R.inc(11989);
        __CLR4_4_198b98blb90p7lp.R.inc(11990);return 0.5 * (lower + upper);
    }finally{__CLR4_4_198b98blb90p7lp.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * For lower bound {@code lower} and upper bound {@code upper}, and
     * {@code n = upper - lower + 1}, the variance is {@code (n^2 - 1) / 12}.
     */
    public double getNumericalVariance() {try{__CLR4_4_198b98blb90p7lp.R.inc(11991);
        __CLR4_4_198b98blb90p7lp.R.inc(11992);double n = upper - lower + 1;
        __CLR4_4_198b98blb90p7lp.R.inc(11993);return (n * n - 1) / 12.0;
    }finally{__CLR4_4_198b98blb90p7lp.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The lower bound of the support is equal to the lower bound parameter
     * of the distribution.
     *
     * @return lower bound of the support
     */
    public int getSupportLowerBound() {try{__CLR4_4_198b98blb90p7lp.R.inc(11994);
        __CLR4_4_198b98blb90p7lp.R.inc(11995);return lower;
    }finally{__CLR4_4_198b98blb90p7lp.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The upper bound of the support is equal to the upper bound parameter
     * of the distribution.
     *
     * @return upper bound of the support
     */
    public int getSupportUpperBound() {try{__CLR4_4_198b98blb90p7lp.R.inc(11996);
        __CLR4_4_198b98blb90p7lp.R.inc(11997);return upper;
    }finally{__CLR4_4_198b98blb90p7lp.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The support of this distribution is connected.
     *
     * @return {@code true}
     */
    public boolean isSupportConnected() {try{__CLR4_4_198b98blb90p7lp.R.inc(11998);
        __CLR4_4_198b98blb90p7lp.R.inc(11999);return true;
    }finally{__CLR4_4_198b98blb90p7lp.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public int sample() {try{__CLR4_4_198b98blb90p7lp.R.inc(12000);
        __CLR4_4_198b98blb90p7lp.R.inc(12001);final int max = (upper - lower) + 1;
        __CLR4_4_198b98blb90p7lp.R.inc(12002);if ((((max <= 0)&&(__CLR4_4_198b98blb90p7lp.R.iget(12003)!=0|true))||(__CLR4_4_198b98blb90p7lp.R.iget(12004)==0&false))) {{
            // The range is too wide to fit in a positive int (larger
            // than 2^31); as it covers more than half the integer range,
            // we use a simple rejection method.
            __CLR4_4_198b98blb90p7lp.R.inc(12005);while (true) {{
                __CLR4_4_198b98blb90p7lp.R.inc(12006);final int r = random.nextInt();
                __CLR4_4_198b98blb90p7lp.R.inc(12007);if ((((r >= lower &&
                    r <= upper)&&(__CLR4_4_198b98blb90p7lp.R.iget(12008)!=0|true))||(__CLR4_4_198b98blb90p7lp.R.iget(12009)==0&false))) {{
                    __CLR4_4_198b98blb90p7lp.R.inc(12010);return r;
                }
            }}
        }} }else {{
            // We can shift the range and directly generate a positive int.
            __CLR4_4_198b98blb90p7lp.R.inc(12011);return lower + random.nextInt(max);
        }
    }}finally{__CLR4_4_198b98blb90p7lp.R.flushNeeded();}}
}
