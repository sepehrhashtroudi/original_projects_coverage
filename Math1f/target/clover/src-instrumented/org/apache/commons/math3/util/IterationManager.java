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

import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;

import org.apache.commons.math3.exception.MaxCountExceededException;

/**
 * This abstract class provides a general framework for managing iterative
 * algorithms. The maximum number of iterations can be set, and methods are
 * provided to monitor the current iteration count. A lightweight event
 * framework is also provided.
 *
 * @version $Id$
 */
public class IterationManager {public static class __CLR4_4_119t519t5lb90pb81{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,59399,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Keeps a count of the number of iterations. */
    private final Incrementor iterations;

    /** The collection of all listeners attached to this iterative algorithm. */
    private final Collection<IterationListener> listeners;

    /**
     * Creates a new instance of this class.
     *
     * @param maxIterations the maximum number of iterations
     */
    public IterationManager(final int maxIterations) {try{__CLR4_4_119t519t5lb90pb81.R.inc(59369);
        __CLR4_4_119t519t5lb90pb81.R.inc(59370);this.iterations = new Incrementor(maxIterations);
        __CLR4_4_119t519t5lb90pb81.R.inc(59371);this.listeners = new CopyOnWriteArrayList<IterationListener>();
    }finally{__CLR4_4_119t519t5lb90pb81.R.flushNeeded();}}

    /**
     * Creates a new instance of this class.
     *
     * @param maxIterations the maximum number of iterations
     * @param callBack the function to be called when the maximum number of
     * iterations has been reached
     * @throws org.apache.commons.math3.exception.NullArgumentException if {@code callBack} is {@code null}
     * @since 3.1
     */
    public IterationManager(final int maxIterations,
                            final Incrementor.MaxCountExceededCallback callBack) {try{__CLR4_4_119t519t5lb90pb81.R.inc(59372);
        __CLR4_4_119t519t5lb90pb81.R.inc(59373);this.iterations = new Incrementor(maxIterations, callBack);
        __CLR4_4_119t519t5lb90pb81.R.inc(59374);this.listeners = new CopyOnWriteArrayList<IterationListener>();
    }finally{__CLR4_4_119t519t5lb90pb81.R.flushNeeded();}}

    /**
     * Attaches a listener to this manager.
     *
     * @param listener A {@code IterationListener} object.
     */
    public void addIterationListener(final IterationListener listener) {try{__CLR4_4_119t519t5lb90pb81.R.inc(59375);
        __CLR4_4_119t519t5lb90pb81.R.inc(59376);listeners.add(listener);
    }finally{__CLR4_4_119t519t5lb90pb81.R.flushNeeded();}}

    /**
     * Informs all registered listeners that the initial phase (prior to the
     * main iteration loop) has been completed.
     *
     * @param e The {@link IterationEvent} object.
     */
    public void fireInitializationEvent(final IterationEvent e) {try{__CLR4_4_119t519t5lb90pb81.R.inc(59377);
        __CLR4_4_119t519t5lb90pb81.R.inc(59378);for (IterationListener l : listeners) {{
            __CLR4_4_119t519t5lb90pb81.R.inc(59379);l.initializationPerformed(e);
        }
    }}finally{__CLR4_4_119t519t5lb90pb81.R.flushNeeded();}}

    /**
     * Informs all registered listeners that a new iteration (in the main
     * iteration loop) has been performed.
     *
     * @param e The {@link IterationEvent} object.
     */
    public void fireIterationPerformedEvent(final IterationEvent e) {try{__CLR4_4_119t519t5lb90pb81.R.inc(59380);
        __CLR4_4_119t519t5lb90pb81.R.inc(59381);for (IterationListener l : listeners) {{
            __CLR4_4_119t519t5lb90pb81.R.inc(59382);l.iterationPerformed(e);
        }
    }}finally{__CLR4_4_119t519t5lb90pb81.R.flushNeeded();}}

    /**
     * Informs all registered listeners that a new iteration (in the main
     * iteration loop) has been started.
     *
     * @param e The {@link IterationEvent} object.
     */
    public void fireIterationStartedEvent(final IterationEvent e) {try{__CLR4_4_119t519t5lb90pb81.R.inc(59383);
        __CLR4_4_119t519t5lb90pb81.R.inc(59384);for (IterationListener l : listeners) {{
            __CLR4_4_119t519t5lb90pb81.R.inc(59385);l.iterationStarted(e);
        }
    }}finally{__CLR4_4_119t519t5lb90pb81.R.flushNeeded();}}

    /**
     * Informs all registered listeners that the final phase (post-iterations)
     * has been completed.
     *
     * @param e The {@link IterationEvent} object.
     */
    public void fireTerminationEvent(final IterationEvent e) {try{__CLR4_4_119t519t5lb90pb81.R.inc(59386);
        __CLR4_4_119t519t5lb90pb81.R.inc(59387);for (IterationListener l : listeners) {{
            __CLR4_4_119t519t5lb90pb81.R.inc(59388);l.terminationPerformed(e);
        }
    }}finally{__CLR4_4_119t519t5lb90pb81.R.flushNeeded();}}

    /**
     * Returns the number of iterations of this solver, 0 if no iterations has
     * been performed yet.
     *
     * @return the number of iterations.
     */
    public int getIterations() {try{__CLR4_4_119t519t5lb90pb81.R.inc(59389);
        __CLR4_4_119t519t5lb90pb81.R.inc(59390);return iterations.getCount();
    }finally{__CLR4_4_119t519t5lb90pb81.R.flushNeeded();}}

    /**
     * Returns the maximum number of iterations.
     *
     * @return the maximum number of iterations.
     */
    public int getMaxIterations() {try{__CLR4_4_119t519t5lb90pb81.R.inc(59391);
        __CLR4_4_119t519t5lb90pb81.R.inc(59392);return iterations.getMaximalCount();
    }finally{__CLR4_4_119t519t5lb90pb81.R.flushNeeded();}}

    /**
     * Increments the iteration count by one, and throws an exception if the
     * maximum number of iterations is reached. This method should be called at
     * the beginning of a new iteration.
     *
     * @throws MaxCountExceededException if the maximum number of iterations is
     * reached.
     */
    public void incrementIterationCount()
        throws MaxCountExceededException {try{__CLR4_4_119t519t5lb90pb81.R.inc(59393);
        __CLR4_4_119t519t5lb90pb81.R.inc(59394);iterations.incrementCount();
    }finally{__CLR4_4_119t519t5lb90pb81.R.flushNeeded();}}

    /**
     * Removes the specified iteration listener from the list of listeners
     * currently attached to {@code this} object. Attempting to remove a
     * listener which was <em>not</em> previously registered does not cause any
     * error.
     *
     * @param listener The {@link IterationListener} to be removed.
     */
    public void removeIterationListener(final IterationListener listener) {try{__CLR4_4_119t519t5lb90pb81.R.inc(59395);
        __CLR4_4_119t519t5lb90pb81.R.inc(59396);listeners.remove(listener);
    }finally{__CLR4_4_119t519t5lb90pb81.R.flushNeeded();}}

    /**
     * Sets the iteration count to 0. This method must be called during the
     * initial phase.
     */
    public void resetIterationCount() {try{__CLR4_4_119t519t5lb90pb81.R.inc(59397);
        __CLR4_4_119t519t5lb90pb81.R.inc(59398);iterations.resetCount();
    }finally{__CLR4_4_119t519t5lb90pb81.R.flushNeeded();}}
}
