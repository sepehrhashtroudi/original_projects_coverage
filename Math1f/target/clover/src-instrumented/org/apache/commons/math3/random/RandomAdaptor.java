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

/**
 * Extension of <code>java.util.Random</code> wrapping a
 * {@link RandomGenerator}.
 *
 * @since 1.1
 * @version $Id$
 */
public class RandomAdaptor extends Random implements RandomGenerator {public static class __CLR4_4_111071107lb90pacw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,47996,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier. */
    private static final long serialVersionUID = 2306581345647615033L;

    /** Wrapped randomGenerator instance */
    private final RandomGenerator randomGenerator;

    /**
     * Prevent instantiation without a generator argument
     */
    @SuppressWarnings("unused")
    private RandomAdaptor() {try{__CLR4_4_111071107lb90pacw.R.inc(47959); __CLR4_4_111071107lb90pacw.R.inc(47960);randomGenerator = null; }finally{__CLR4_4_111071107lb90pacw.R.flushNeeded();}}

    /**
     * Construct a RandomAdaptor wrapping the supplied RandomGenerator.
     *
     * @param randomGenerator  the wrapped generator
     */
    public RandomAdaptor(RandomGenerator randomGenerator) {try{__CLR4_4_111071107lb90pacw.R.inc(47961);
        __CLR4_4_111071107lb90pacw.R.inc(47962);this.randomGenerator = randomGenerator;
    }finally{__CLR4_4_111071107lb90pacw.R.flushNeeded();}}

    /**
     * Factory method to create a <code>Random</code> using the supplied
     * <code>RandomGenerator</code>.
     *
     * @param randomGenerator  wrapped RandomGenerator instance
     * @return a Random instance wrapping the RandomGenerator
     */
    public static Random createAdaptor(RandomGenerator randomGenerator) {try{__CLR4_4_111071107lb90pacw.R.inc(47963);
        __CLR4_4_111071107lb90pacw.R.inc(47964);return new RandomAdaptor(randomGenerator);
    }finally{__CLR4_4_111071107lb90pacw.R.flushNeeded();}}

    /**
     * Returns the next pseudorandom, uniformly distributed
     * <code>boolean</code> value from this random number generator's
     * sequence.
     *
     * @return  the next pseudorandom, uniformly distributed
     * <code>boolean</code> value from this random number generator's
     * sequence
     */
    @Override
    public boolean nextBoolean() {try{__CLR4_4_111071107lb90pacw.R.inc(47965);
        __CLR4_4_111071107lb90pacw.R.inc(47966);return randomGenerator.nextBoolean();
    }finally{__CLR4_4_111071107lb90pacw.R.flushNeeded();}}

     /**
     * Generates random bytes and places them into a user-supplied
     * byte array.  The number of random bytes produced is equal to
     * the length of the byte array.
     *
     * @param bytes the non-null byte array in which to put the
     * random bytes
     */
    @Override
    public void nextBytes(byte[] bytes) {try{__CLR4_4_111071107lb90pacw.R.inc(47967);
        __CLR4_4_111071107lb90pacw.R.inc(47968);randomGenerator.nextBytes(bytes);
    }finally{__CLR4_4_111071107lb90pacw.R.flushNeeded();}}

     /**
     * Returns the next pseudorandom, uniformly distributed
     * <code>double</code> value between <code>0.0</code> and
     * <code>1.0</code> from this random number generator's sequence.
     *
     * @return  the next pseudorandom, uniformly distributed
     *  <code>double</code> value between <code>0.0</code> and
     *  <code>1.0</code> from this random number generator's sequence
     */
    @Override
    public double nextDouble() {try{__CLR4_4_111071107lb90pacw.R.inc(47969);
        __CLR4_4_111071107lb90pacw.R.inc(47970);return randomGenerator.nextDouble();
    }finally{__CLR4_4_111071107lb90pacw.R.flushNeeded();}}

    /**
     * Returns the next pseudorandom, uniformly distributed <code>float</code>
     * value between <code>0.0</code> and <code>1.0</code> from this random
     * number generator's sequence.
     *
     * @return  the next pseudorandom, uniformly distributed <code>float</code>
     * value between <code>0.0</code> and <code>1.0</code> from this
     * random number generator's sequence
     */
    @Override
    public float nextFloat() {try{__CLR4_4_111071107lb90pacw.R.inc(47971);
        __CLR4_4_111071107lb90pacw.R.inc(47972);return randomGenerator.nextFloat();
    }finally{__CLR4_4_111071107lb90pacw.R.flushNeeded();}}

    /**
     * Returns the next pseudorandom, Gaussian ("normally") distributed
     * <code>double</code> value with mean <code>0.0</code> and standard
     * deviation <code>1.0</code> from this random number generator's sequence.
     *
     * @return  the next pseudorandom, Gaussian ("normally") distributed
     * <code>double</code> value with mean <code>0.0</code> and
     * standard deviation <code>1.0</code> from this random number
     *  generator's sequence
     */
    @Override
    public double nextGaussian() {try{__CLR4_4_111071107lb90pacw.R.inc(47973);
        __CLR4_4_111071107lb90pacw.R.inc(47974);return randomGenerator.nextGaussian();
    }finally{__CLR4_4_111071107lb90pacw.R.flushNeeded();}}

     /**
     * Returns the next pseudorandom, uniformly distributed <code>int</code>
     * value from this random number generator's sequence.
     * All 2<font size="-1"><sup>32</sup></font> possible <tt>int</tt> values
     * should be produced with  (approximately) equal probability.
     *
     * @return the next pseudorandom, uniformly distributed <code>int</code>
     *  value from this random number generator's sequence
     */
    @Override
    public int nextInt() {try{__CLR4_4_111071107lb90pacw.R.inc(47975);
        __CLR4_4_111071107lb90pacw.R.inc(47976);return randomGenerator.nextInt();
    }finally{__CLR4_4_111071107lb90pacw.R.flushNeeded();}}

    /**
     * Returns a pseudorandom, uniformly distributed <tt>int</tt> value
     * between 0 (inclusive) and the specified value (exclusive), drawn from
     * this random number generator's sequence.
     *
     * @param n the bound on the random number to be returned.  Must be
     * positive.
     * @return  a pseudorandom, uniformly distributed <tt>int</tt>
     * value between 0 (inclusive) and n (exclusive).
     * @throws IllegalArgumentException  if n is not positive.
     */
    @Override
    public int nextInt(int n) {try{__CLR4_4_111071107lb90pacw.R.inc(47977);
        __CLR4_4_111071107lb90pacw.R.inc(47978);return randomGenerator.nextInt(n);
    }finally{__CLR4_4_111071107lb90pacw.R.flushNeeded();}}

    /**
     * Returns the next pseudorandom, uniformly distributed <code>long</code>
     * value from this random number generator's sequence.  All
     * 2<font size="-1"><sup>64</sup></font> possible <tt>long</tt> values
     * should be produced with (approximately) equal probability.
     *
     * @return  the next pseudorandom, uniformly distributed <code>long</code>
     *value from this random number generator's sequence
     */
    @Override
    public long nextLong() {try{__CLR4_4_111071107lb90pacw.R.inc(47979);
        __CLR4_4_111071107lb90pacw.R.inc(47980);return randomGenerator.nextLong();
    }finally{__CLR4_4_111071107lb90pacw.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void setSeed(int seed) {try{__CLR4_4_111071107lb90pacw.R.inc(47981);
        __CLR4_4_111071107lb90pacw.R.inc(47982);if ((((randomGenerator != null)&&(__CLR4_4_111071107lb90pacw.R.iget(47983)!=0|true))||(__CLR4_4_111071107lb90pacw.R.iget(47984)==0&false))) {{  // required to avoid NPE in constructor
            __CLR4_4_111071107lb90pacw.R.inc(47985);randomGenerator.setSeed(seed);
        }
    }}finally{__CLR4_4_111071107lb90pacw.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void setSeed(int[] seed) {try{__CLR4_4_111071107lb90pacw.R.inc(47986);
        __CLR4_4_111071107lb90pacw.R.inc(47987);if ((((randomGenerator != null)&&(__CLR4_4_111071107lb90pacw.R.iget(47988)!=0|true))||(__CLR4_4_111071107lb90pacw.R.iget(47989)==0&false))) {{  // required to avoid NPE in constructor
            __CLR4_4_111071107lb90pacw.R.inc(47990);randomGenerator.setSeed(seed);
        }
    }}finally{__CLR4_4_111071107lb90pacw.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void setSeed(long seed) {try{__CLR4_4_111071107lb90pacw.R.inc(47991);
        __CLR4_4_111071107lb90pacw.R.inc(47992);if ((((randomGenerator != null)&&(__CLR4_4_111071107lb90pacw.R.iget(47993)!=0|true))||(__CLR4_4_111071107lb90pacw.R.iget(47994)==0&false))) {{  // required to avoid NPE in constructor
            __CLR4_4_111071107lb90pacw.R.inc(47995);randomGenerator.setSeed(seed);
        }
    }}finally{__CLR4_4_111071107lb90pacw.R.flushNeeded();}}

}
