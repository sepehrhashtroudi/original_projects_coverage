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
package org.apache.commons.math3.random;

import java.util.Random;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;

/**
 * Utilities for creating {@link RandomGenerator} instances.
 *
 * @since 3.3
 * @version $Id$
 */
public class RandomGeneratorFactory {public static class __CLR4_4_1119q119qlb90paeb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,48337,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Class contains only static methods.
     */
    private RandomGeneratorFactory() {try{__CLR4_4_1119q119qlb90paeb.R.inc(48302);}finally{__CLR4_4_1119q119qlb90paeb.R.flushNeeded();}}

    /**
     * Creates a {@link RandomDataGenerator} instance that wraps a
     * {@link Random} instance.
     *
     * @param rng JDK {@link Random} instance that will generate the
     * the random data.
     * @return the given RNG, wrapped in a {@link RandomGenerator}.
     */
    public static RandomGenerator createRandomGenerator(final Random rng) {try{__CLR4_4_1119q119qlb90paeb.R.inc(48303);
        __CLR4_4_1119q119qlb90paeb.R.inc(48304);return new RandomGenerator() {
            /** {@inheritDoc} */
            public void setSeed(int seed) {try{__CLR4_4_1119q119qlb90paeb.R.inc(48305);
                __CLR4_4_1119q119qlb90paeb.R.inc(48306);rng.setSeed((long) seed);
            }finally{__CLR4_4_1119q119qlb90paeb.R.flushNeeded();}}

            /** {@inheritDoc} */
            public void setSeed(int[] seed) {try{__CLR4_4_1119q119qlb90paeb.R.inc(48307);
                __CLR4_4_1119q119qlb90paeb.R.inc(48308);rng.setSeed(convertToLong(seed));
            }finally{__CLR4_4_1119q119qlb90paeb.R.flushNeeded();}}

            /** {@inheritDoc} */
            public void setSeed(long seed) {try{__CLR4_4_1119q119qlb90paeb.R.inc(48309);
                __CLR4_4_1119q119qlb90paeb.R.inc(48310);rng.setSeed(seed);
            }finally{__CLR4_4_1119q119qlb90paeb.R.flushNeeded();}}

            /** {@inheritDoc} */
            public void nextBytes(byte[] bytes) {try{__CLR4_4_1119q119qlb90paeb.R.inc(48311);
                __CLR4_4_1119q119qlb90paeb.R.inc(48312);rng.nextBytes(bytes);
            }finally{__CLR4_4_1119q119qlb90paeb.R.flushNeeded();}}

            /** {@inheritDoc} */
            public int nextInt() {try{__CLR4_4_1119q119qlb90paeb.R.inc(48313);
                __CLR4_4_1119q119qlb90paeb.R.inc(48314);return rng.nextInt();
            }finally{__CLR4_4_1119q119qlb90paeb.R.flushNeeded();}}

            /** {@inheritDoc} */
            public int nextInt(int n) {try{__CLR4_4_1119q119qlb90paeb.R.inc(48315);
                __CLR4_4_1119q119qlb90paeb.R.inc(48316);if ((((n <= 0)&&(__CLR4_4_1119q119qlb90paeb.R.iget(48317)!=0|true))||(__CLR4_4_1119q119qlb90paeb.R.iget(48318)==0&false))) {{
                    __CLR4_4_1119q119qlb90paeb.R.inc(48319);throw new NotStrictlyPositiveException(n);
                }
                }__CLR4_4_1119q119qlb90paeb.R.inc(48320);return rng.nextInt(n);
            }finally{__CLR4_4_1119q119qlb90paeb.R.flushNeeded();}}

            /** {@inheritDoc} */
            public long nextLong() {try{__CLR4_4_1119q119qlb90paeb.R.inc(48321);
                __CLR4_4_1119q119qlb90paeb.R.inc(48322);return rng.nextLong();
            }finally{__CLR4_4_1119q119qlb90paeb.R.flushNeeded();}}

            /** {@inheritDoc} */
            public boolean nextBoolean() {try{__CLR4_4_1119q119qlb90paeb.R.inc(48323);
                __CLR4_4_1119q119qlb90paeb.R.inc(48324);return rng.nextBoolean();
            }finally{__CLR4_4_1119q119qlb90paeb.R.flushNeeded();}}

            /** {@inheritDoc} */
            public float nextFloat() {try{__CLR4_4_1119q119qlb90paeb.R.inc(48325);
                __CLR4_4_1119q119qlb90paeb.R.inc(48326);return rng.nextFloat();
            }finally{__CLR4_4_1119q119qlb90paeb.R.flushNeeded();}}

            /** {@inheritDoc} */
            public double nextDouble() {try{__CLR4_4_1119q119qlb90paeb.R.inc(48327);
                __CLR4_4_1119q119qlb90paeb.R.inc(48328);return rng.nextDouble();
            }finally{__CLR4_4_1119q119qlb90paeb.R.flushNeeded();}}

            /** {@inheritDoc} */
            public double nextGaussian() {try{__CLR4_4_1119q119qlb90paeb.R.inc(48329);
                __CLR4_4_1119q119qlb90paeb.R.inc(48330);return rng.nextGaussian();
            }finally{__CLR4_4_1119q119qlb90paeb.R.flushNeeded();}}
        };
    }finally{__CLR4_4_1119q119qlb90paeb.R.flushNeeded();}}

    /**
     * Converts seed from one representation to another.
     *
     * @param seed Original seed.
     * @return the converted seed.
     */
    public static long convertToLong(int[] seed) {try{__CLR4_4_1119q119qlb90paeb.R.inc(48331);
        // The following number is the largest prime that fits
        // in 32 bits (i.e. 2^32 - 5).
        __CLR4_4_1119q119qlb90paeb.R.inc(48332);final long prime = 4294967291l;

        __CLR4_4_1119q119qlb90paeb.R.inc(48333);long combined = 0l;
        __CLR4_4_1119q119qlb90paeb.R.inc(48334);for (int s : seed) {{
            __CLR4_4_1119q119qlb90paeb.R.inc(48335);combined = combined * prime + s;
        }

        }__CLR4_4_1119q119qlb90paeb.R.inc(48336);return combined;
    }finally{__CLR4_4_1119q119qlb90paeb.R.flushNeeded();}}
}
