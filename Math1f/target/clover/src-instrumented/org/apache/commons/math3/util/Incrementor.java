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
package org.apache.commons.math3.util;

import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.NullArgumentException;

/**
 * Utility that increments a counter until a maximum is reached, at
 * which point, the instance will by default throw a
 * {@link MaxCountExceededException}.
 * However, the user is able to override this behaviour by defining a
 * custom {@link MaxCountExceededCallback callback}, in order to e.g.
 * select which exception must be thrown.
 *
 * @since 3.0
 * @version $Id$
 */
public class Incrementor {public static class __CLR4_4_119s319s3lb90pb7u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,59364,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Upper limit for the counter.
     */
    private int maximalCount;
    /**
     * Current count.
     */
    private int count = 0;
    /**
     * Function called at counter exhaustion.
     */
    private final MaxCountExceededCallback maxCountCallback;

    /**
     * Default constructor.
     * For the new instance to be useful, the maximal count must be set
     * by calling {@link #setMaximalCount(int) setMaximalCount}.
     */
    public Incrementor() {
        this(0);__CLR4_4_119s319s3lb90pb7u.R.inc(59332);try{__CLR4_4_119s319s3lb90pb7u.R.inc(59331);
    }finally{__CLR4_4_119s319s3lb90pb7u.R.flushNeeded();}}

    /**
     * Defines a maximal count.
     *
     * @param max Maximal count.
     */
    public Incrementor(int max) {
        this(max,
             new MaxCountExceededCallback() {
                 /** {@inheritDoc} */
                 public void trigger(int max) throws MaxCountExceededException {try{__CLR4_4_119s319s3lb90pb7u.R.inc(59334);
                     __CLR4_4_119s319s3lb90pb7u.R.inc(59335);throw new MaxCountExceededException(max);
                 }finally{__CLR4_4_119s319s3lb90pb7u.R.flushNeeded();}}
             });__CLR4_4_119s319s3lb90pb7u.R.inc(59336);try{__CLR4_4_119s319s3lb90pb7u.R.inc(59333);
    }finally{__CLR4_4_119s319s3lb90pb7u.R.flushNeeded();}}

    /**
     * Defines a maximal count and a callback method to be triggered at
     * counter exhaustion.
     *
     * @param max Maximal count.
     * @param cb Function to be called when the maximal count has been reached.
     * @throws NullArgumentException if {@code cb} is {@code null}
     */
    public Incrementor(int max, MaxCountExceededCallback cb)
        throws NullArgumentException {try{__CLR4_4_119s319s3lb90pb7u.R.inc(59337);
        __CLR4_4_119s319s3lb90pb7u.R.inc(59338);if ((((cb == null)&&(__CLR4_4_119s319s3lb90pb7u.R.iget(59339)!=0|true))||(__CLR4_4_119s319s3lb90pb7u.R.iget(59340)==0&false))){{
            __CLR4_4_119s319s3lb90pb7u.R.inc(59341);throw new NullArgumentException();
        }
        }__CLR4_4_119s319s3lb90pb7u.R.inc(59342);maximalCount = max;
        __CLR4_4_119s319s3lb90pb7u.R.inc(59343);maxCountCallback = cb;
    }finally{__CLR4_4_119s319s3lb90pb7u.R.flushNeeded();}}

    /**
     * Sets the upper limit for the counter.
     * This does not automatically reset the current count to zero (see
     * {@link #resetCount()}).
     *
     * @param max Upper limit of the counter.
     */
    public void setMaximalCount(int max) {try{__CLR4_4_119s319s3lb90pb7u.R.inc(59344);
        __CLR4_4_119s319s3lb90pb7u.R.inc(59345);maximalCount = max;
    }finally{__CLR4_4_119s319s3lb90pb7u.R.flushNeeded();}}

    /**
     * Gets the upper limit of the counter.
     *
     * @return the counter upper limit.
     */
    public int getMaximalCount() {try{__CLR4_4_119s319s3lb90pb7u.R.inc(59346);
        __CLR4_4_119s319s3lb90pb7u.R.inc(59347);return maximalCount;
    }finally{__CLR4_4_119s319s3lb90pb7u.R.flushNeeded();}}

    /**
     * Gets the current count.
     *
     * @return the current count.
     */
    public int getCount() {try{__CLR4_4_119s319s3lb90pb7u.R.inc(59348);
        __CLR4_4_119s319s3lb90pb7u.R.inc(59349);return count;
    }finally{__CLR4_4_119s319s3lb90pb7u.R.flushNeeded();}}

    /**
     * Checks whether a single increment is allowed.
     *
     * @return {@code false} if the next call to {@link #incrementCount(int)
     * incrementCount} will trigger a {@code MaxCountExceededException},
     * {@code true} otherwise.
     */
    public boolean canIncrement() {try{__CLR4_4_119s319s3lb90pb7u.R.inc(59350);
        __CLR4_4_119s319s3lb90pb7u.R.inc(59351);return count < maximalCount;
    }finally{__CLR4_4_119s319s3lb90pb7u.R.flushNeeded();}}

    /**
     * Performs multiple increments.
     * See the other {@link #incrementCount() incrementCount} method).
     *
     * @param value Number of increments.
     * @throws MaxCountExceededException at counter exhaustion.
     */
    public void incrementCount(int value) throws MaxCountExceededException {try{__CLR4_4_119s319s3lb90pb7u.R.inc(59352);
        __CLR4_4_119s319s3lb90pb7u.R.inc(59353);for (int i = 0; (((i < value)&&(__CLR4_4_119s319s3lb90pb7u.R.iget(59354)!=0|true))||(__CLR4_4_119s319s3lb90pb7u.R.iget(59355)==0&false)); i++) {{
            __CLR4_4_119s319s3lb90pb7u.R.inc(59356);incrementCount();
        }
    }}finally{__CLR4_4_119s319s3lb90pb7u.R.flushNeeded();}}

    /**
     * Adds one to the current iteration count.
     * At counter exhaustion, this method will call the
     * {@link MaxCountExceededCallback#trigger(int) trigger} method of the
     * callback object passed to the
     * {@link #Incrementor(int,MaxCountExceededCallback) constructor}.
     * If not explictly set, a default callback is used that will throw
     * a {@code MaxCountExceededException}.
     *
     * @throws MaxCountExceededException at counter exhaustion, unless a
     * custom {@link MaxCountExceededCallback callback} has been set at
     * construction.
     */
    public void incrementCount() throws MaxCountExceededException {try{__CLR4_4_119s319s3lb90pb7u.R.inc(59357);
        __CLR4_4_119s319s3lb90pb7u.R.inc(59358);if ((((++count > maximalCount)&&(__CLR4_4_119s319s3lb90pb7u.R.iget(59359)!=0|true))||(__CLR4_4_119s319s3lb90pb7u.R.iget(59360)==0&false))) {{
            __CLR4_4_119s319s3lb90pb7u.R.inc(59361);maxCountCallback.trigger(maximalCount);
        }
    }}finally{__CLR4_4_119s319s3lb90pb7u.R.flushNeeded();}}

    /**
     * Resets the counter to 0.
     */
    public void resetCount() {try{__CLR4_4_119s319s3lb90pb7u.R.inc(59362);
        __CLR4_4_119s319s3lb90pb7u.R.inc(59363);count = 0;
    }finally{__CLR4_4_119s319s3lb90pb7u.R.flushNeeded();}}

    /**
     * Defines a method to be called at counter exhaustion.
     * The {@link #trigger(int) trigger} method should usually throw an exception.
     */
    public interface MaxCountExceededCallback {
        /**
         * Function called when the maximal count has been reached.
         *
         * @param maximalCount Maximal count.
         * @throws MaxCountExceededException at counter exhaustion
         */
        void trigger(int maximalCount) throws MaxCountExceededException;
    }
}
