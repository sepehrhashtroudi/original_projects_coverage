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
import org.apache.commons.math3.random.RandomGenerator;

/**
 * Base class for multivariate probability distributions.
 *
 * @version $Id$
 * @since 3.1
 */
public abstract class AbstractMultivariateRealDistribution
    implements MultivariateRealDistribution {public static class __CLR4_4_17qf7qflb90p7fn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,10041,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** RNG instance used to generate samples from the distribution. */
    protected final RandomGenerator random;
    /** The number of dimensions or columns in the multivariate distribution. */
    private final int dimension;

    /**
     * @param rng Random number generator.
     * @param n Number of dimensions.
     */
    protected AbstractMultivariateRealDistribution(RandomGenerator rng,
                                                   int n) {try{__CLR4_4_17qf7qflb90p7fn.R.inc(10023);
        __CLR4_4_17qf7qflb90p7fn.R.inc(10024);random = rng;
        __CLR4_4_17qf7qflb90p7fn.R.inc(10025);dimension = n;
    }finally{__CLR4_4_17qf7qflb90p7fn.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void reseedRandomGenerator(long seed) {try{__CLR4_4_17qf7qflb90p7fn.R.inc(10026);
        __CLR4_4_17qf7qflb90p7fn.R.inc(10027);random.setSeed(seed);
    }finally{__CLR4_4_17qf7qflb90p7fn.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int getDimension() {try{__CLR4_4_17qf7qflb90p7fn.R.inc(10028);
        __CLR4_4_17qf7qflb90p7fn.R.inc(10029);return dimension;
    }finally{__CLR4_4_17qf7qflb90p7fn.R.flushNeeded();}}

    /** {@inheritDoc} */
    public abstract double[] sample();

    /** {@inheritDoc} */
    public double[][] sample(final int sampleSize) {try{__CLR4_4_17qf7qflb90p7fn.R.inc(10030);
        __CLR4_4_17qf7qflb90p7fn.R.inc(10031);if ((((sampleSize <= 0)&&(__CLR4_4_17qf7qflb90p7fn.R.iget(10032)!=0|true))||(__CLR4_4_17qf7qflb90p7fn.R.iget(10033)==0&false))) {{
            __CLR4_4_17qf7qflb90p7fn.R.inc(10034);throw new NotStrictlyPositiveException(LocalizedFormats.NUMBER_OF_SAMPLES,
                                                   sampleSize);
        }
        }__CLR4_4_17qf7qflb90p7fn.R.inc(10035);final double[][] out = new double[sampleSize][dimension];
        __CLR4_4_17qf7qflb90p7fn.R.inc(10036);for (int i = 0; (((i < sampleSize)&&(__CLR4_4_17qf7qflb90p7fn.R.iget(10037)!=0|true))||(__CLR4_4_17qf7qflb90p7fn.R.iget(10038)==0&false)); i++) {{
            __CLR4_4_17qf7qflb90p7fn.R.inc(10039);out[i] = sample();
        }
        }__CLR4_4_17qf7qflb90p7fn.R.inc(10040);return out;
    }finally{__CLR4_4_17qf7qflb90p7fn.R.flushNeeded();}}
}
