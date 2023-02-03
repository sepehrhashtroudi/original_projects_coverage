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

package org.apache.commons.math3.ode.sampling;

import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.Precision;

/**
 * This class wraps an object implementing {@link FixedStepHandler}
 * into a {@link StepHandler}.

 * <p>This wrapper allows to use fixed step handlers with general
 * integrators which cannot guaranty their integration steps will
 * remain constant and therefore only accept general step
 * handlers.</p>
 *
 * <p>The stepsize used is selected at construction time. The {@link
 * FixedStepHandler#handleStep handleStep} method of the underlying
 * {@link FixedStepHandler} object is called at normalized times. The
 * normalized times can be influenced by the {@link StepNormalizerMode} and
 * {@link StepNormalizerBounds}.</p>
 *
 * <p>There is no constraint on the integrator, it can use any time step
 * it needs (time steps longer or shorter than the fixed time step and
 * non-integer ratios are all allowed).</p>
 *
 * <p>
 * <table border="1" align="center">
 * <tr BGCOLOR="#CCCCFF"><td colspan=6><font size="+2">Examples (step size = 0.5)</font></td></tr>
 * <tr BGCOLOR="#EEEEFF"><font size="+1"><td>Start time</td><td>End time</td>
 *  <td>Direction</td><td>{@link StepNormalizerMode Mode}</td>
 *  <td>{@link StepNormalizerBounds Bounds}</td><td>Output</td></font></tr>
 * <tr><td>0.3</td><td>3.1</td><td>forward</td><td>{@link StepNormalizerMode#INCREMENT INCREMENT}</td><td>{@link StepNormalizerBounds#NEITHER NEITHER}</td><td>0.8, 1.3, 1.8, 2.3, 2.8</td></tr>
 * <tr><td>0.3</td><td>3.1</td><td>forward</td><td>{@link StepNormalizerMode#INCREMENT INCREMENT}</td><td>{@link StepNormalizerBounds#FIRST FIRST}</td><td>0.3, 0.8, 1.3, 1.8, 2.3, 2.8</td></tr>
 * <tr><td>0.3</td><td>3.1</td><td>forward</td><td>{@link StepNormalizerMode#INCREMENT INCREMENT}</td><td>{@link StepNormalizerBounds#LAST LAST}</td><td>0.8, 1.3, 1.8, 2.3, 2.8, 3.1</td></tr>
 * <tr><td>0.3</td><td>3.1</td><td>forward</td><td>{@link StepNormalizerMode#INCREMENT INCREMENT}</td><td>{@link StepNormalizerBounds#BOTH BOTH}</td><td>0.3, 0.8, 1.3, 1.8, 2.3, 2.8, 3.1</td></tr>
 * <tr><td>0.3</td><td>3.1</td><td>forward</td><td>{@link StepNormalizerMode#MULTIPLES MULTIPLES}</td><td>{@link StepNormalizerBounds#NEITHER NEITHER}</td><td>0.5, 1.0, 1.5, 2.0, 2.5, 3.0</td></tr>
 * <tr><td>0.3</td><td>3.1</td><td>forward</td><td>{@link StepNormalizerMode#MULTIPLES MULTIPLES}</td><td>{@link StepNormalizerBounds#FIRST FIRST}</td><td>0.3, 0.5, 1.0, 1.5, 2.0, 2.5, 3.0</td></tr>
 * <tr><td>0.3</td><td>3.1</td><td>forward</td><td>{@link StepNormalizerMode#MULTIPLES MULTIPLES}</td><td>{@link StepNormalizerBounds#LAST LAST}</td><td>0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.1</td></tr>
 * <tr><td>0.3</td><td>3.1</td><td>forward</td><td>{@link StepNormalizerMode#MULTIPLES MULTIPLES}</td><td>{@link StepNormalizerBounds#BOTH BOTH}</td><td>0.3, 0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.1</td></tr>
 * <tr><td>0.0</td><td>3.0</td><td>forward</td><td>{@link StepNormalizerMode#INCREMENT INCREMENT}</td><td>{@link StepNormalizerBounds#NEITHER NEITHER}</td><td>0.5, 1.0, 1.5, 2.0, 2.5, 3.0</td></tr>
 * <tr><td>0.0</td><td>3.0</td><td>forward</td><td>{@link StepNormalizerMode#INCREMENT INCREMENT}</td><td>{@link StepNormalizerBounds#FIRST FIRST}</td><td>0.0, 0.5, 1.0, 1.5, 2.0, 2.5, 3.0</td></tr>
 * <tr><td>0.0</td><td>3.0</td><td>forward</td><td>{@link StepNormalizerMode#INCREMENT INCREMENT}</td><td>{@link StepNormalizerBounds#LAST LAST}</td><td>0.5, 1.0, 1.5, 2.0, 2.5, 3.0</td></tr>
 * <tr><td>0.0</td><td>3.0</td><td>forward</td><td>{@link StepNormalizerMode#INCREMENT INCREMENT}</td><td>{@link StepNormalizerBounds#BOTH BOTH}</td><td>0.0, 0.5, 1.0, 1.5, 2.0, 2.5, 3.0</td></tr>
 * <tr><td>0.0</td><td>3.0</td><td>forward</td><td>{@link StepNormalizerMode#MULTIPLES MULTIPLES}</td><td>{@link StepNormalizerBounds#NEITHER NEITHER}</td><td>0.5, 1.0, 1.5, 2.0, 2.5, 3.0</td></tr>
 * <tr><td>0.0</td><td>3.0</td><td>forward</td><td>{@link StepNormalizerMode#MULTIPLES MULTIPLES}</td><td>{@link StepNormalizerBounds#FIRST FIRST}</td><td>0.0, 0.5, 1.0, 1.5, 2.0, 2.5, 3.0</td></tr>
 * <tr><td>0.0</td><td>3.0</td><td>forward</td><td>{@link StepNormalizerMode#MULTIPLES MULTIPLES}</td><td>{@link StepNormalizerBounds#LAST LAST}</td><td>0.5, 1.0, 1.5, 2.0, 2.5, 3.0</td></tr>
 * <tr><td>0.0</td><td>3.0</td><td>forward</td><td>{@link StepNormalizerMode#MULTIPLES MULTIPLES}</td><td>{@link StepNormalizerBounds#BOTH BOTH}</td><td>0.0, 0.5, 1.0, 1.5, 2.0, 2.5, 3.0</td></tr>
 * <tr><td>3.1</td><td>0.3</td><td>backward</td><td>{@link StepNormalizerMode#INCREMENT INCREMENT}</td><td>{@link StepNormalizerBounds#NEITHER NEITHER}</td><td>2.6, 2.1, 1.6, 1.1, 0.6</td></tr>
 * <tr><td>3.1</td><td>0.3</td><td>backward</td><td>{@link StepNormalizerMode#INCREMENT INCREMENT}</td><td>{@link StepNormalizerBounds#FIRST FIRST}</td><td>3.1, 2.6, 2.1, 1.6, 1.1, 0.6</td></tr>
 * <tr><td>3.1</td><td>0.3</td><td>backward</td><td>{@link StepNormalizerMode#INCREMENT INCREMENT}</td><td>{@link StepNormalizerBounds#LAST LAST}</td><td>2.6, 2.1, 1.6, 1.1, 0.6, 0.3</td></tr>
 * <tr><td>3.1</td><td>0.3</td><td>backward</td><td>{@link StepNormalizerMode#INCREMENT INCREMENT}</td><td>{@link StepNormalizerBounds#BOTH BOTH}</td><td>3.1, 2.6, 2.1, 1.6, 1.1, 0.6, 0.3</td></tr>
 * <tr><td>3.1</td><td>0.3</td><td>backward</td><td>{@link StepNormalizerMode#MULTIPLES MULTIPLES}</td><td>{@link StepNormalizerBounds#NEITHER NEITHER}</td><td>3.0, 2.5, 2.0, 1.5, 1.0, 0.5</td></tr>
 * <tr><td>3.1</td><td>0.3</td><td>backward</td><td>{@link StepNormalizerMode#MULTIPLES MULTIPLES}</td><td>{@link StepNormalizerBounds#FIRST FIRST}</td><td>3.1, 3.0, 2.5, 2.0, 1.5, 1.0, 0.5</td></tr>
 * <tr><td>3.1</td><td>0.3</td><td>backward</td><td>{@link StepNormalizerMode#MULTIPLES MULTIPLES}</td><td>{@link StepNormalizerBounds#LAST LAST}</td><td>3.0, 2.5, 2.0, 1.5, 1.0, 0.5, 0.3</td></tr>
 * <tr><td>3.1</td><td>0.3</td><td>backward</td><td>{@link StepNormalizerMode#MULTIPLES MULTIPLES}</td><td>{@link StepNormalizerBounds#BOTH BOTH}</td><td>3.1, 3.0, 2.5, 2.0, 1.5, 1.0, 0.5, 0.3</td></tr>
 * <tr><td>3.0</td><td>0.0</td><td>backward</td><td>{@link StepNormalizerMode#INCREMENT INCREMENT}</td><td>{@link StepNormalizerBounds#NEITHER NEITHER}</td><td>2.5, 2.0, 1.5, 1.0, 0.5, 0.0</td></tr>
 * <tr><td>3.0</td><td>0.0</td><td>backward</td><td>{@link StepNormalizerMode#INCREMENT INCREMENT}</td><td>{@link StepNormalizerBounds#FIRST FIRST}</td><td>3.0, 2.5, 2.0, 1.5, 1.0, 0.5, 0.0</td></tr>
 * <tr><td>3.0</td><td>0.0</td><td>backward</td><td>{@link StepNormalizerMode#INCREMENT INCREMENT}</td><td>{@link StepNormalizerBounds#LAST LAST}</td><td>2.5, 2.0, 1.5, 1.0, 0.5, 0.0</td></tr>
 * <tr><td>3.0</td><td>0.0</td><td>backward</td><td>{@link StepNormalizerMode#INCREMENT INCREMENT}</td><td>{@link StepNormalizerBounds#BOTH BOTH}</td><td>3.0, 2.5, 2.0, 1.5, 1.0, 0.5, 0.0</td></tr>
 * <tr><td>3.0</td><td>0.0</td><td>backward</td><td>{@link StepNormalizerMode#MULTIPLES MULTIPLES}</td><td>{@link StepNormalizerBounds#NEITHER NEITHER}</td><td>2.5, 2.0, 1.5, 1.0, 0.5, 0.0</td></tr>
 * <tr><td>3.0</td><td>0.0</td><td>backward</td><td>{@link StepNormalizerMode#MULTIPLES MULTIPLES}</td><td>{@link StepNormalizerBounds#FIRST FIRST}</td><td>3.0, 2.5, 2.0, 1.5, 1.0, 0.5, 0.0</td></tr>
 * <tr><td>3.0</td><td>0.0</td><td>backward</td><td>{@link StepNormalizerMode#MULTIPLES MULTIPLES}</td><td>{@link StepNormalizerBounds#LAST LAST}</td><td>2.5, 2.0, 1.5, 1.0, 0.5, 0.0</td></tr>
 * <tr><td>3.0</td><td>0.0</td><td>backward</td><td>{@link StepNormalizerMode#MULTIPLES MULTIPLES}</td><td>{@link StepNormalizerBounds#BOTH BOTH}</td><td>3.0, 2.5, 2.0, 1.5, 1.0, 0.5, 0.0</td></tr>
 * </table>
 * </p>
 *
 * @see StepHandler
 * @see FixedStepHandler
 * @see StepNormalizerMode
 * @see StepNormalizerBounds
 * @version $Id$
 * @since 1.2
 */

public class StepNormalizer implements StepHandler {public static class __CLR4_4_1ramramlb90p9ka{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,35451,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Fixed time step. */
    private double h;

    /** Underlying step handler. */
    private final FixedStepHandler handler;

    /** First step time. */
    private double firstTime;

    /** Last step time. */
    private double lastTime;

    /** Last state vector. */
    private double[] lastState;

    /** Last derivatives vector. */
    private double[] lastDerivatives;

    /** Integration direction indicator. */
    private boolean forward;

    /** The step normalizer bounds settings to use. */
    private final StepNormalizerBounds bounds;

    /** The step normalizer mode to use. */
    private final StepNormalizerMode mode;

    /** Simple constructor. Uses {@link StepNormalizerMode#INCREMENT INCREMENT}
     * mode, and {@link StepNormalizerBounds#FIRST FIRST} bounds setting, for
     * backwards compatibility.
     * @param h fixed time step (sign is not used)
     * @param handler fixed time step handler to wrap
     */
    public StepNormalizer(final double h, final FixedStepHandler handler) {
        this(h, handler, StepNormalizerMode.INCREMENT,
             StepNormalizerBounds.FIRST);__CLR4_4_1ramramlb90p9ka.R.inc(35375);try{__CLR4_4_1ramramlb90p9ka.R.inc(35374);
    }finally{__CLR4_4_1ramramlb90p9ka.R.flushNeeded();}}

    /** Simple constructor. Uses {@link StepNormalizerBounds#FIRST FIRST}
     * bounds setting.
     * @param h fixed time step (sign is not used)
     * @param handler fixed time step handler to wrap
     * @param mode step normalizer mode to use
     * @since 3.0
     */
    public StepNormalizer(final double h, final FixedStepHandler handler,
                          final StepNormalizerMode mode) {
        this(h, handler, mode, StepNormalizerBounds.FIRST);__CLR4_4_1ramramlb90p9ka.R.inc(35377);try{__CLR4_4_1ramramlb90p9ka.R.inc(35376);
    }finally{__CLR4_4_1ramramlb90p9ka.R.flushNeeded();}}

    /** Simple constructor. Uses {@link StepNormalizerMode#INCREMENT INCREMENT}
     * mode.
     * @param h fixed time step (sign is not used)
     * @param handler fixed time step handler to wrap
     * @param bounds step normalizer bounds setting to use
     * @since 3.0
     */
    public StepNormalizer(final double h, final FixedStepHandler handler,
                          final StepNormalizerBounds bounds) {
        this(h, handler, StepNormalizerMode.INCREMENT, bounds);__CLR4_4_1ramramlb90p9ka.R.inc(35379);try{__CLR4_4_1ramramlb90p9ka.R.inc(35378);
    }finally{__CLR4_4_1ramramlb90p9ka.R.flushNeeded();}}

    /** Simple constructor.
     * @param h fixed time step (sign is not used)
     * @param handler fixed time step handler to wrap
     * @param mode step normalizer mode to use
     * @param bounds step normalizer bounds setting to use
     * @since 3.0
     */
    public StepNormalizer(final double h, final FixedStepHandler handler,
                          final StepNormalizerMode mode,
                          final StepNormalizerBounds bounds) {try{__CLR4_4_1ramramlb90p9ka.R.inc(35380);
        __CLR4_4_1ramramlb90p9ka.R.inc(35381);this.h          = FastMath.abs(h);
        __CLR4_4_1ramramlb90p9ka.R.inc(35382);this.handler    = handler;
        __CLR4_4_1ramramlb90p9ka.R.inc(35383);this.mode       = mode;
        __CLR4_4_1ramramlb90p9ka.R.inc(35384);this.bounds     = bounds;
        __CLR4_4_1ramramlb90p9ka.R.inc(35385);firstTime       = Double.NaN;
        __CLR4_4_1ramramlb90p9ka.R.inc(35386);lastTime        = Double.NaN;
        __CLR4_4_1ramramlb90p9ka.R.inc(35387);lastState       = null;
        __CLR4_4_1ramramlb90p9ka.R.inc(35388);lastDerivatives = null;
        __CLR4_4_1ramramlb90p9ka.R.inc(35389);forward         = true;
    }finally{__CLR4_4_1ramramlb90p9ka.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void init(double t0, double[] y0, double t) {try{__CLR4_4_1ramramlb90p9ka.R.inc(35390);

        __CLR4_4_1ramramlb90p9ka.R.inc(35391);firstTime       = Double.NaN;
        __CLR4_4_1ramramlb90p9ka.R.inc(35392);lastTime        = Double.NaN;
        __CLR4_4_1ramramlb90p9ka.R.inc(35393);lastState       = null;
        __CLR4_4_1ramramlb90p9ka.R.inc(35394);lastDerivatives = null;
        __CLR4_4_1ramramlb90p9ka.R.inc(35395);forward         = true;

        // initialize the underlying handler
        __CLR4_4_1ramramlb90p9ka.R.inc(35396);handler.init(t0, y0, t);

    }finally{__CLR4_4_1ramramlb90p9ka.R.flushNeeded();}}

    /**
     * Handle the last accepted step
     * @param interpolator interpolator for the last accepted step. For
     * efficiency purposes, the various integrators reuse the same
     * object on each call, so if the instance wants to keep it across
     * all calls (for example to provide at the end of the integration a
     * continuous model valid throughout the integration range), it
     * should build a local copy using the clone method and store this
     * copy.
     * @param isLast true if the step is the last one
     * @exception MaxCountExceededException if the interpolator throws one because
     * the number of functions evaluations is exceeded
     */
    public void handleStep(final StepInterpolator interpolator, final boolean isLast)
        throws MaxCountExceededException {try{__CLR4_4_1ramramlb90p9ka.R.inc(35397);
        // The first time, update the last state with the start information.
        __CLR4_4_1ramramlb90p9ka.R.inc(35398);if ((((lastState == null)&&(__CLR4_4_1ramramlb90p9ka.R.iget(35399)!=0|true))||(__CLR4_4_1ramramlb90p9ka.R.iget(35400)==0&false))) {{
            __CLR4_4_1ramramlb90p9ka.R.inc(35401);firstTime = interpolator.getPreviousTime();
            __CLR4_4_1ramramlb90p9ka.R.inc(35402);lastTime = interpolator.getPreviousTime();
            __CLR4_4_1ramramlb90p9ka.R.inc(35403);interpolator.setInterpolatedTime(lastTime);
            __CLR4_4_1ramramlb90p9ka.R.inc(35404);lastState = interpolator.getInterpolatedState().clone();
            __CLR4_4_1ramramlb90p9ka.R.inc(35405);lastDerivatives = interpolator.getInterpolatedDerivatives().clone();

            // Take the integration direction into account.
            __CLR4_4_1ramramlb90p9ka.R.inc(35406);forward = interpolator.getCurrentTime() >= lastTime;
            __CLR4_4_1ramramlb90p9ka.R.inc(35407);if ((((!forward)&&(__CLR4_4_1ramramlb90p9ka.R.iget(35408)!=0|true))||(__CLR4_4_1ramramlb90p9ka.R.iget(35409)==0&false))) {{
                __CLR4_4_1ramramlb90p9ka.R.inc(35410);h = -h;
            }
        }}

        // Calculate next normalized step time.
        }__CLR4_4_1ramramlb90p9ka.R.inc(35411);double nextTime = ((((mode == StepNormalizerMode.INCREMENT) )&&(__CLR4_4_1ramramlb90p9ka.R.iget(35412)!=0|true))||(__CLR4_4_1ramramlb90p9ka.R.iget(35413)==0&false))?
                          lastTime + h :
                          (FastMath.floor(lastTime / h) + 1) * h;
        __CLR4_4_1ramramlb90p9ka.R.inc(35414);if ((((mode == StepNormalizerMode.MULTIPLES &&
            Precision.equals(nextTime, lastTime, 1))&&(__CLR4_4_1ramramlb90p9ka.R.iget(35415)!=0|true))||(__CLR4_4_1ramramlb90p9ka.R.iget(35416)==0&false))) {{
            __CLR4_4_1ramramlb90p9ka.R.inc(35417);nextTime += h;
        }

        // Process normalized steps as long as they are in the current step.
        }__CLR4_4_1ramramlb90p9ka.R.inc(35418);boolean nextInStep = isNextInStep(nextTime, interpolator);
        __CLR4_4_1ramramlb90p9ka.R.inc(35419);while ((((nextInStep)&&(__CLR4_4_1ramramlb90p9ka.R.iget(35420)!=0|true))||(__CLR4_4_1ramramlb90p9ka.R.iget(35421)==0&false))) {{
            // Output the stored previous step.
            __CLR4_4_1ramramlb90p9ka.R.inc(35422);doNormalizedStep(false);

            // Store the next step as last step.
            __CLR4_4_1ramramlb90p9ka.R.inc(35423);storeStep(interpolator, nextTime);

            // Move on to the next step.
            __CLR4_4_1ramramlb90p9ka.R.inc(35424);nextTime += h;
            __CLR4_4_1ramramlb90p9ka.R.inc(35425);nextInStep = isNextInStep(nextTime, interpolator);
        }

        }__CLR4_4_1ramramlb90p9ka.R.inc(35426);if ((((isLast)&&(__CLR4_4_1ramramlb90p9ka.R.iget(35427)!=0|true))||(__CLR4_4_1ramramlb90p9ka.R.iget(35428)==0&false))) {{
            // There will be no more steps. The stored one should be given to
            // the handler. We may have to output one more step. Only the last
            // one of those should be flagged as being the last.
            __CLR4_4_1ramramlb90p9ka.R.inc(35429);boolean addLast = bounds.lastIncluded() &&
                              lastTime != interpolator.getCurrentTime();
            __CLR4_4_1ramramlb90p9ka.R.inc(35430);doNormalizedStep(!addLast);
            __CLR4_4_1ramramlb90p9ka.R.inc(35431);if ((((addLast)&&(__CLR4_4_1ramramlb90p9ka.R.iget(35432)!=0|true))||(__CLR4_4_1ramramlb90p9ka.R.iget(35433)==0&false))) {{
                __CLR4_4_1ramramlb90p9ka.R.inc(35434);storeStep(interpolator, interpolator.getCurrentTime());
                __CLR4_4_1ramramlb90p9ka.R.inc(35435);doNormalizedStep(true);
            }
        }}
    }}finally{__CLR4_4_1ramramlb90p9ka.R.flushNeeded();}}

    /**
     * Returns a value indicating whether the next normalized time is in the
     * current step.
     * @param nextTime the next normalized time
     * @param interpolator interpolator for the last accepted step, to use to
     * get the end time of the current step
     * @return value indicating whether the next normalized time is in the
     * current step
     */
    private boolean isNextInStep(double nextTime,
                                 StepInterpolator interpolator) {try{__CLR4_4_1ramramlb90p9ka.R.inc(35436);
        __CLR4_4_1ramramlb90p9ka.R.inc(35437);return (((forward )&&(__CLR4_4_1ramramlb90p9ka.R.iget(35438)!=0|true))||(__CLR4_4_1ramramlb90p9ka.R.iget(35439)==0&false))?
               nextTime <= interpolator.getCurrentTime() :
               nextTime >= interpolator.getCurrentTime();
    }finally{__CLR4_4_1ramramlb90p9ka.R.flushNeeded();}}

    /**
     * Invokes the underlying step handler for the current normalized step.
     * @param isLast true if the step is the last one
     */
    private void doNormalizedStep(boolean isLast) {try{__CLR4_4_1ramramlb90p9ka.R.inc(35440);
        __CLR4_4_1ramramlb90p9ka.R.inc(35441);if ((((!bounds.firstIncluded() && firstTime == lastTime)&&(__CLR4_4_1ramramlb90p9ka.R.iget(35442)!=0|true))||(__CLR4_4_1ramramlb90p9ka.R.iget(35443)==0&false))) {{
            __CLR4_4_1ramramlb90p9ka.R.inc(35444);return;
        }
        }__CLR4_4_1ramramlb90p9ka.R.inc(35445);handler.handleStep(lastTime, lastState, lastDerivatives, isLast);
    }finally{__CLR4_4_1ramramlb90p9ka.R.flushNeeded();}}

    /** Stores the interpolated information for the given time in the current
     * state.
     * @param interpolator interpolator for the last accepted step, to use to
     * get the interpolated information
     * @param t the time for which to store the interpolated information
     * @exception MaxCountExceededException if the interpolator throws one because
     * the number of functions evaluations is exceeded
     */
    private void storeStep(StepInterpolator interpolator, double t)
        throws MaxCountExceededException {try{__CLR4_4_1ramramlb90p9ka.R.inc(35446);
        __CLR4_4_1ramramlb90p9ka.R.inc(35447);lastTime = t;
        __CLR4_4_1ramramlb90p9ka.R.inc(35448);interpolator.setInterpolatedTime(lastTime);
        __CLR4_4_1ramramlb90p9ka.R.inc(35449);System.arraycopy(interpolator.getInterpolatedState(), 0,
                         lastState, 0, lastState.length);
        __CLR4_4_1ramramlb90p9ka.R.inc(35450);System.arraycopy(interpolator.getInterpolatedDerivatives(), 0,
                         lastDerivatives, 0, lastDerivatives.length);
    }finally{__CLR4_4_1ramramlb90p9ka.R.flushNeeded();}}
}
