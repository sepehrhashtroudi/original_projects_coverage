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

package org.apache.commons.math3.ode;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.NoBracketingException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math3.ode.sampling.StepHandler;
import org.apache.commons.math3.ode.sampling.StepInterpolator;
import org.apache.commons.math3.util.FastMath;

/**
 * This class is the base class for multistep integrators for Ordinary
 * Differential Equations.
 * <p>We define scaled derivatives s<sub>i</sub>(n) at step n as:
 * <pre>
 * s<sub>1</sub>(n) = h y'<sub>n</sub> for first derivative
 * s<sub>2</sub>(n) = h<sup>2</sup>/2 y''<sub>n</sub> for second derivative
 * s<sub>3</sub>(n) = h<sup>3</sup>/6 y'''<sub>n</sub> for third derivative
 * ...
 * s<sub>k</sub>(n) = h<sup>k</sup>/k! y<sup>(k)</sup><sub>n</sub> for k<sup>th</sup> derivative
 * </pre></p>
 * <p>Rather than storing several previous steps separately, this implementation uses
 * the Nordsieck vector with higher degrees scaled derivatives all taken at the same
 * step (y<sub>n</sub>, s<sub>1</sub>(n) and r<sub>n</sub>) where r<sub>n</sub> is defined as:
 * <pre>
 * r<sub>n</sub> = [ s<sub>2</sub>(n), s<sub>3</sub>(n) ... s<sub>k</sub>(n) ]<sup>T</sup>
 * </pre>
 * (we omit the k index in the notation for clarity)</p>
 * <p>
 * Multistep integrators with Nordsieck representation are highly sensitive to
 * large step changes because when the step is multiplied by factor a, the
 * k<sup>th</sup> component of the Nordsieck vector is multiplied by a<sup>k</sup>
 * and the last components are the least accurate ones. The default max growth
 * factor is therefore set to a quite low value: 2<sup>1/order</sup>.
 * </p>
 *
 * @see org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator
 * @see org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator
 * @version $Id$
 * @since 2.0
 */
public abstract class MultistepIntegrator extends AdaptiveStepsizeIntegrator {public static class __CLR4_4_1p28p28lb90p9b9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,32583,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** First scaled derivative (h y'). */
    protected double[] scaled;

    /** Nordsieck matrix of the higher scaled derivatives.
     * <p>(h<sup>2</sup>/2 y'', h<sup>3</sup>/6 y''' ..., h<sup>k</sup>/k! y<sup>(k)</sup>)</p>
     */
    protected Array2DRowRealMatrix nordsieck;

    /** Starter integrator. */
    private FirstOrderIntegrator starter;

    /** Number of steps of the multistep method (excluding the one being computed). */
    private final int nSteps;

    /** Stepsize control exponent. */
    private double exp;

    /** Safety factor for stepsize control. */
    private double safety;

    /** Minimal reduction factor for stepsize control. */
    private double minReduction;

    /** Maximal growth factor for stepsize control. */
    private double maxGrowth;

    /**
     * Build a multistep integrator with the given stepsize bounds.
     * <p>The default starter integrator is set to the {@link
     * DormandPrince853Integrator Dormand-Prince 8(5,3)} integrator with
     * some defaults settings.</p>
     * <p>
     * The default max growth factor is set to a quite low value: 2<sup>1/order</sup>.
     * </p>
     * @param name name of the method
     * @param nSteps number of steps of the multistep method
     * (excluding the one being computed)
     * @param order order of the method
     * @param minStep minimal step (must be positive even for backward
     * integration), the last step can be smaller than this
     * @param maxStep maximal step (must be positive even for backward
     * integration)
     * @param scalAbsoluteTolerance allowed absolute error
     * @param scalRelativeTolerance allowed relative error
     * @exception NumberIsTooSmallException if number of steps is smaller than 2
     */
    protected MultistepIntegrator(final String name, final int nSteps,
                                  final int order,
                                  final double minStep, final double maxStep,
                                  final double scalAbsoluteTolerance,
                                  final double scalRelativeTolerance)
        throws NumberIsTooSmallException {

        super(name, minStep, maxStep, scalAbsoluteTolerance, scalRelativeTolerance);__CLR4_4_1p28p28lb90p9b9.R.inc(32481);try{__CLR4_4_1p28p28lb90p9b9.R.inc(32480);

        __CLR4_4_1p28p28lb90p9b9.R.inc(32482);if ((((nSteps < 2)&&(__CLR4_4_1p28p28lb90p9b9.R.iget(32483)!=0|true))||(__CLR4_4_1p28p28lb90p9b9.R.iget(32484)==0&false))) {{
            __CLR4_4_1p28p28lb90p9b9.R.inc(32485);throw new NumberIsTooSmallException(
                  LocalizedFormats.INTEGRATION_METHOD_NEEDS_AT_LEAST_TWO_PREVIOUS_POINTS,
                  nSteps, 2, true);
        }

        }__CLR4_4_1p28p28lb90p9b9.R.inc(32486);starter = new DormandPrince853Integrator(minStep, maxStep,
                                                 scalAbsoluteTolerance,
                                                 scalRelativeTolerance);
        __CLR4_4_1p28p28lb90p9b9.R.inc(32487);this.nSteps = nSteps;

        __CLR4_4_1p28p28lb90p9b9.R.inc(32488);exp = -1.0 / order;

        // set the default values of the algorithm control parameters
        __CLR4_4_1p28p28lb90p9b9.R.inc(32489);setSafety(0.9);
        __CLR4_4_1p28p28lb90p9b9.R.inc(32490);setMinReduction(0.2);
        __CLR4_4_1p28p28lb90p9b9.R.inc(32491);setMaxGrowth(FastMath.pow(2.0, -exp));

    }finally{__CLR4_4_1p28p28lb90p9b9.R.flushNeeded();}}

    /**
     * Build a multistep integrator with the given stepsize bounds.
     * <p>The default starter integrator is set to the {@link
     * DormandPrince853Integrator Dormand-Prince 8(5,3)} integrator with
     * some defaults settings.</p>
     * <p>
     * The default max growth factor is set to a quite low value: 2<sup>1/order</sup>.
     * </p>
     * @param name name of the method
     * @param nSteps number of steps of the multistep method
     * (excluding the one being computed)
     * @param order order of the method
     * @param minStep minimal step (must be positive even for backward
     * integration), the last step can be smaller than this
     * @param maxStep maximal step (must be positive even for backward
     * integration)
     * @param vecAbsoluteTolerance allowed absolute error
     * @param vecRelativeTolerance allowed relative error
     */
    protected MultistepIntegrator(final String name, final int nSteps,
                                  final int order,
                                  final double minStep, final double maxStep,
                                  final double[] vecAbsoluteTolerance,
                                  final double[] vecRelativeTolerance) {
        super(name, minStep, maxStep, vecAbsoluteTolerance, vecRelativeTolerance);__CLR4_4_1p28p28lb90p9b9.R.inc(32493);try{__CLR4_4_1p28p28lb90p9b9.R.inc(32492);
        __CLR4_4_1p28p28lb90p9b9.R.inc(32494);starter = new DormandPrince853Integrator(minStep, maxStep,
                                                 vecAbsoluteTolerance,
                                                 vecRelativeTolerance);
        __CLR4_4_1p28p28lb90p9b9.R.inc(32495);this.nSteps = nSteps;

        __CLR4_4_1p28p28lb90p9b9.R.inc(32496);exp = -1.0 / order;

        // set the default values of the algorithm control parameters
        __CLR4_4_1p28p28lb90p9b9.R.inc(32497);setSafety(0.9);
        __CLR4_4_1p28p28lb90p9b9.R.inc(32498);setMinReduction(0.2);
        __CLR4_4_1p28p28lb90p9b9.R.inc(32499);setMaxGrowth(FastMath.pow(2.0, -exp));

    }finally{__CLR4_4_1p28p28lb90p9b9.R.flushNeeded();}}

    /**
     * Get the starter integrator.
     * @return starter integrator
     */
    public ODEIntegrator getStarterIntegrator() {try{__CLR4_4_1p28p28lb90p9b9.R.inc(32500);
        __CLR4_4_1p28p28lb90p9b9.R.inc(32501);return starter;
    }finally{__CLR4_4_1p28p28lb90p9b9.R.flushNeeded();}}

    /**
     * Set the starter integrator.
     * <p>The various step and event handlers for this starter integrator
     * will be managed automatically by the multi-step integrator. Any
     * user configuration for these elements will be cleared before use.</p>
     * @param starterIntegrator starter integrator
     */
    public void setStarterIntegrator(FirstOrderIntegrator starterIntegrator) {try{__CLR4_4_1p28p28lb90p9b9.R.inc(32502);
        __CLR4_4_1p28p28lb90p9b9.R.inc(32503);this.starter = starterIntegrator;
    }finally{__CLR4_4_1p28p28lb90p9b9.R.flushNeeded();}}

    /** Start the integration.
     * <p>This method computes one step using the underlying starter integrator,
     * and initializes the Nordsieck vector at step start. The starter integrator
     * purpose is only to establish initial conditions, it does not really change
     * time by itself. The top level multistep integrator remains in charge of
     * handling time propagation and events handling as it will starts its own
     * computation right from the beginning. In a sense, the starter integrator
     * can be seen as a dummy one and so it will never trigger any user event nor
     * call any user step handler.</p>
     * @param t0 initial time
     * @param y0 initial value of the state vector at t0
     * @param t target time for the integration
     * (can be set to a value smaller than <code>t0</code> for backward integration)
     * @exception DimensionMismatchException if arrays dimension do not match equations settings
     * @exception NumberIsTooSmallException if integration step is too small
     * @exception MaxCountExceededException if the number of functions evaluations is exceeded
     * @exception NoBracketingException if the location of an event cannot be bracketed
     */
    protected void start(final double t0, final double[] y0, final double t)
        throws DimensionMismatchException, NumberIsTooSmallException,
               MaxCountExceededException, NoBracketingException {try{__CLR4_4_1p28p28lb90p9b9.R.inc(32504);

        // make sure NO user event nor user step handler is triggered,
        // this is the task of the top level integrator, not the task
        // of the starter integrator
        __CLR4_4_1p28p28lb90p9b9.R.inc(32505);starter.clearEventHandlers();
        __CLR4_4_1p28p28lb90p9b9.R.inc(32506);starter.clearStepHandlers();

        // set up one specific step handler to extract initial Nordsieck vector
        __CLR4_4_1p28p28lb90p9b9.R.inc(32507);starter.addStepHandler(new NordsieckInitializer(nSteps, y0.length));

        // start integration, expecting a InitializationCompletedMarkerException
        __CLR4_4_1p28p28lb90p9b9.R.inc(32508);try {

            __CLR4_4_1p28p28lb90p9b9.R.inc(32509);if ((((starter instanceof AbstractIntegrator)&&(__CLR4_4_1p28p28lb90p9b9.R.iget(32510)!=0|true))||(__CLR4_4_1p28p28lb90p9b9.R.iget(32511)==0&false))) {{
                __CLR4_4_1p28p28lb90p9b9.R.inc(32512);((AbstractIntegrator) starter).integrate(getExpandable(), t);
            } }else {{
                __CLR4_4_1p28p28lb90p9b9.R.inc(32513);starter.integrate(new FirstOrderDifferentialEquations() {

                    /** {@inheritDoc} */
                    public int getDimension() {try{__CLR4_4_1p28p28lb90p9b9.R.inc(32514);
                        __CLR4_4_1p28p28lb90p9b9.R.inc(32515);return getExpandable().getTotalDimension();
                    }finally{__CLR4_4_1p28p28lb90p9b9.R.flushNeeded();}}

                    /** {@inheritDoc} */
                    public void computeDerivatives(double t, double[] y, double[] yDot) {try{__CLR4_4_1p28p28lb90p9b9.R.inc(32516);
                        __CLR4_4_1p28p28lb90p9b9.R.inc(32517);getExpandable().computeDerivatives(t, y, yDot);
                    }finally{__CLR4_4_1p28p28lb90p9b9.R.flushNeeded();}}

                }, t0, y0, t, new double[y0.length]);
            }

        }} catch (InitializationCompletedMarkerException icme) { // NOPMD
            // this is the expected nominal interruption of the start integrator

            // count the evaluations used by the starter
            __CLR4_4_1p28p28lb90p9b9.R.inc(32518);getEvaluationsCounter().incrementCount(starter.getEvaluations());

        }

        // remove the specific step handler
        __CLR4_4_1p28p28lb90p9b9.R.inc(32519);starter.clearStepHandlers();

    }finally{__CLR4_4_1p28p28lb90p9b9.R.flushNeeded();}}

    /** Initialize the high order scaled derivatives at step start.
     * @param h step size to use for scaling
     * @param t first steps times
     * @param y first steps states
     * @param yDot first steps derivatives
     * @return Nordieck vector at first step (h<sup>2</sup>/2 y''<sub>n</sub>,
     * h<sup>3</sup>/6 y'''<sub>n</sub> ... h<sup>k</sup>/k! y<sup>(k)</sup><sub>n</sub>)
     */
    protected abstract Array2DRowRealMatrix initializeHighOrderDerivatives(final double h, final double[] t,
                                                                           final double[][] y,
                                                                           final double[][] yDot);

    /** Get the minimal reduction factor for stepsize control.
     * @return minimal reduction factor
     */
    public double getMinReduction() {try{__CLR4_4_1p28p28lb90p9b9.R.inc(32520);
        __CLR4_4_1p28p28lb90p9b9.R.inc(32521);return minReduction;
    }finally{__CLR4_4_1p28p28lb90p9b9.R.flushNeeded();}}

    /** Set the minimal reduction factor for stepsize control.
     * @param minReduction minimal reduction factor
     */
    public void setMinReduction(final double minReduction) {try{__CLR4_4_1p28p28lb90p9b9.R.inc(32522);
        __CLR4_4_1p28p28lb90p9b9.R.inc(32523);this.minReduction = minReduction;
    }finally{__CLR4_4_1p28p28lb90p9b9.R.flushNeeded();}}

    /** Get the maximal growth factor for stepsize control.
     * @return maximal growth factor
     */
    public double getMaxGrowth() {try{__CLR4_4_1p28p28lb90p9b9.R.inc(32524);
        __CLR4_4_1p28p28lb90p9b9.R.inc(32525);return maxGrowth;
    }finally{__CLR4_4_1p28p28lb90p9b9.R.flushNeeded();}}

    /** Set the maximal growth factor for stepsize control.
     * @param maxGrowth maximal growth factor
     */
    public void setMaxGrowth(final double maxGrowth) {try{__CLR4_4_1p28p28lb90p9b9.R.inc(32526);
        __CLR4_4_1p28p28lb90p9b9.R.inc(32527);this.maxGrowth = maxGrowth;
    }finally{__CLR4_4_1p28p28lb90p9b9.R.flushNeeded();}}

    /** Get the safety factor for stepsize control.
     * @return safety factor
     */
    public double getSafety() {try{__CLR4_4_1p28p28lb90p9b9.R.inc(32528);
      __CLR4_4_1p28p28lb90p9b9.R.inc(32529);return safety;
    }finally{__CLR4_4_1p28p28lb90p9b9.R.flushNeeded();}}

    /** Set the safety factor for stepsize control.
     * @param safety safety factor
     */
    public void setSafety(final double safety) {try{__CLR4_4_1p28p28lb90p9b9.R.inc(32530);
      __CLR4_4_1p28p28lb90p9b9.R.inc(32531);this.safety = safety;
    }finally{__CLR4_4_1p28p28lb90p9b9.R.flushNeeded();}}

    /** Compute step grow/shrink factor according to normalized error.
     * @param error normalized error of the current step
     * @return grow/shrink factor for next step
     */
    protected double computeStepGrowShrinkFactor(final double error) {try{__CLR4_4_1p28p28lb90p9b9.R.inc(32532);
        __CLR4_4_1p28p28lb90p9b9.R.inc(32533);return FastMath.min(maxGrowth, FastMath.max(minReduction, safety * FastMath.pow(error, exp)));
    }finally{__CLR4_4_1p28p28lb90p9b9.R.flushNeeded();}}

    /** Transformer used to convert the first step to Nordsieck representation. */
    public interface NordsieckTransformer {
        /** Initialize the high order scaled derivatives at step start.
         * @param h step size to use for scaling
         * @param t first steps times
         * @param y first steps states
         * @param yDot first steps derivatives
         * @return Nordieck vector at first step (h<sup>2</sup>/2 y''<sub>n</sub>,
         * h<sup>3</sup>/6 y'''<sub>n</sub> ... h<sup>k</sup>/k! y<sup>(k)</sup><sub>n</sub>)
         */
        Array2DRowRealMatrix initializeHighOrderDerivatives(final double h, final double[] t,
                                                            final double[][] y,
                                                            final double[][] yDot);
    }

    /** Specialized step handler storing the first step. */
    private class NordsieckInitializer implements StepHandler {

        /** Steps counter. */
        private int count;

        /** First steps times. */
        private final double[] t;

        /** First steps states. */
        private final double[][] y;

        /** First steps derivatives. */
        private final double[][] yDot;

        /** Simple constructor.
         * @param nSteps number of steps of the multistep method (excluding the one being computed)
         * @param n problem dimension
         */
        public NordsieckInitializer(final int nSteps, final int n) {try{__CLR4_4_1p28p28lb90p9b9.R.inc(32534);
            __CLR4_4_1p28p28lb90p9b9.R.inc(32535);this.count = 0;
            __CLR4_4_1p28p28lb90p9b9.R.inc(32536);this.t     = new double[nSteps];
            __CLR4_4_1p28p28lb90p9b9.R.inc(32537);this.y     = new double[nSteps][n];
            __CLR4_4_1p28p28lb90p9b9.R.inc(32538);this.yDot  = new double[nSteps][n];
        }finally{__CLR4_4_1p28p28lb90p9b9.R.flushNeeded();}}

        /** {@inheritDoc} */
        public void handleStep(StepInterpolator interpolator, boolean isLast)
            throws MaxCountExceededException {try{__CLR4_4_1p28p28lb90p9b9.R.inc(32539);

            __CLR4_4_1p28p28lb90p9b9.R.inc(32540);final double prev = interpolator.getPreviousTime();
            __CLR4_4_1p28p28lb90p9b9.R.inc(32541);final double curr = interpolator.getCurrentTime();

            __CLR4_4_1p28p28lb90p9b9.R.inc(32542);if ((((count == 0)&&(__CLR4_4_1p28p28lb90p9b9.R.iget(32543)!=0|true))||(__CLR4_4_1p28p28lb90p9b9.R.iget(32544)==0&false))) {{
                // first step, we need to store also the beginning of the step
                __CLR4_4_1p28p28lb90p9b9.R.inc(32545);interpolator.setInterpolatedTime(prev);
                __CLR4_4_1p28p28lb90p9b9.R.inc(32546);t[0] = prev;
                __CLR4_4_1p28p28lb90p9b9.R.inc(32547);final ExpandableStatefulODE expandable = getExpandable();
                __CLR4_4_1p28p28lb90p9b9.R.inc(32548);final EquationsMapper primary = expandable.getPrimaryMapper();
                __CLR4_4_1p28p28lb90p9b9.R.inc(32549);primary.insertEquationData(interpolator.getInterpolatedState(), y[count]);
                __CLR4_4_1p28p28lb90p9b9.R.inc(32550);primary.insertEquationData(interpolator.getInterpolatedDerivatives(), yDot[count]);
                __CLR4_4_1p28p28lb90p9b9.R.inc(32551);int index = 0;
                __CLR4_4_1p28p28lb90p9b9.R.inc(32552);for (final EquationsMapper secondary : expandable.getSecondaryMappers()) {{
                    __CLR4_4_1p28p28lb90p9b9.R.inc(32553);secondary.insertEquationData(interpolator.getInterpolatedSecondaryState(index), y[count]);
                    __CLR4_4_1p28p28lb90p9b9.R.inc(32554);secondary.insertEquationData(interpolator.getInterpolatedSecondaryDerivatives(index), yDot[count]);
                    __CLR4_4_1p28p28lb90p9b9.R.inc(32555);++index;
                }
            }}

            // store the end of the step
            }__CLR4_4_1p28p28lb90p9b9.R.inc(32556);++count;
            __CLR4_4_1p28p28lb90p9b9.R.inc(32557);interpolator.setInterpolatedTime(curr);
            __CLR4_4_1p28p28lb90p9b9.R.inc(32558);t[count] = curr;

            __CLR4_4_1p28p28lb90p9b9.R.inc(32559);final ExpandableStatefulODE expandable = getExpandable();
            __CLR4_4_1p28p28lb90p9b9.R.inc(32560);final EquationsMapper primary = expandable.getPrimaryMapper();
            __CLR4_4_1p28p28lb90p9b9.R.inc(32561);primary.insertEquationData(interpolator.getInterpolatedState(), y[count]);
            __CLR4_4_1p28p28lb90p9b9.R.inc(32562);primary.insertEquationData(interpolator.getInterpolatedDerivatives(), yDot[count]);
            __CLR4_4_1p28p28lb90p9b9.R.inc(32563);int index = 0;
            __CLR4_4_1p28p28lb90p9b9.R.inc(32564);for (final EquationsMapper secondary : expandable.getSecondaryMappers()) {{
                __CLR4_4_1p28p28lb90p9b9.R.inc(32565);secondary.insertEquationData(interpolator.getInterpolatedSecondaryState(index), y[count]);
                __CLR4_4_1p28p28lb90p9b9.R.inc(32566);secondary.insertEquationData(interpolator.getInterpolatedSecondaryDerivatives(index), yDot[count]);
                __CLR4_4_1p28p28lb90p9b9.R.inc(32567);++index;
            }

            }__CLR4_4_1p28p28lb90p9b9.R.inc(32568);if ((((count == t.length - 1)&&(__CLR4_4_1p28p28lb90p9b9.R.iget(32569)!=0|true))||(__CLR4_4_1p28p28lb90p9b9.R.iget(32570)==0&false))) {{

                // this was the last step we needed, we can compute the derivatives
                __CLR4_4_1p28p28lb90p9b9.R.inc(32571);stepStart = t[0];
                __CLR4_4_1p28p28lb90p9b9.R.inc(32572);stepSize  = (t[t.length - 1] - t[0]) / (t.length - 1);

                // first scaled derivative
                __CLR4_4_1p28p28lb90p9b9.R.inc(32573);scaled = yDot[0].clone();
                __CLR4_4_1p28p28lb90p9b9.R.inc(32574);for (int j = 0; (((j < scaled.length)&&(__CLR4_4_1p28p28lb90p9b9.R.iget(32575)!=0|true))||(__CLR4_4_1p28p28lb90p9b9.R.iget(32576)==0&false)); ++j) {{
                    __CLR4_4_1p28p28lb90p9b9.R.inc(32577);scaled[j] *= stepSize;
                }

                // higher order derivatives
                }__CLR4_4_1p28p28lb90p9b9.R.inc(32578);nordsieck = initializeHighOrderDerivatives(stepSize, t, y, yDot);

                // stop the integrator now that all needed steps have been handled
                __CLR4_4_1p28p28lb90p9b9.R.inc(32579);throw new InitializationCompletedMarkerException();

            }

        }}finally{__CLR4_4_1p28p28lb90p9b9.R.flushNeeded();}}

        /** {@inheritDoc} */
        public void init(double t0, double[] y0, double time) {try{__CLR4_4_1p28p28lb90p9b9.R.inc(32580);
            // nothing to do
        }finally{__CLR4_4_1p28p28lb90p9b9.R.flushNeeded();}}

    }

    /** Marker exception used ONLY to stop the starter integrator after first step. */
    private static class InitializationCompletedMarkerException
        extends RuntimeException {

        /** Serializable version identifier. */
        private static final long serialVersionUID = -1914085471038046418L;

        /** Simple constructor. */
        public InitializationCompletedMarkerException() {
            super((Throwable) null);__CLR4_4_1p28p28lb90p9b9.R.inc(32582);try{__CLR4_4_1p28p28lb90p9b9.R.inc(32581);
        }finally{__CLR4_4_1p28p28lb90p9b9.R.flushNeeded();}}

    }

}
