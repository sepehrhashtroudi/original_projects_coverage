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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math3.analysis.solvers.UnivariateSolver;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.NoBracketingException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.ode.events.EventState;
import org.apache.commons.math3.ode.sampling.AbstractStepInterpolator;
import org.apache.commons.math3.ode.sampling.StepHandler;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.Incrementor;
import org.apache.commons.math3.util.Precision;

/**
 * Base class managing common boilerplate for all integrators.
 * @version $Id$
 * @since 2.0
 */
public abstract class AbstractIntegrator implements FirstOrderIntegrator {public static class __CLR4_4_1ok9ok9lb90p996{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,31993,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Step handler. */
    protected Collection<StepHandler> stepHandlers;

    /** Current step start time. */
    protected double stepStart;

    /** Current stepsize. */
    protected double stepSize;

    /** Indicator for last step. */
    protected boolean isLastStep;

    /** Indicator that a state or derivative reset was triggered by some event. */
    protected boolean resetOccurred;

    /** Events states. */
    private Collection<EventState> eventsStates;

    /** Initialization indicator of events states. */
    private boolean statesInitialized;

    /** Name of the method. */
    private final String name;

    /** Counter for number of evaluations. */
    private Incrementor evaluations;

    /** Differential equations to integrate. */
    private transient ExpandableStatefulODE expandable;

    /** Build an instance.
     * @param name name of the method
     */
    public AbstractIntegrator(final String name) {try{__CLR4_4_1ok9ok9lb90p996.R.inc(31833);
        __CLR4_4_1ok9ok9lb90p996.R.inc(31834);this.name = name;
        __CLR4_4_1ok9ok9lb90p996.R.inc(31835);stepHandlers = new ArrayList<StepHandler>();
        __CLR4_4_1ok9ok9lb90p996.R.inc(31836);stepStart = Double.NaN;
        __CLR4_4_1ok9ok9lb90p996.R.inc(31837);stepSize  = Double.NaN;
        __CLR4_4_1ok9ok9lb90p996.R.inc(31838);eventsStates = new ArrayList<EventState>();
        __CLR4_4_1ok9ok9lb90p996.R.inc(31839);statesInitialized = false;
        __CLR4_4_1ok9ok9lb90p996.R.inc(31840);evaluations = new Incrementor();
        __CLR4_4_1ok9ok9lb90p996.R.inc(31841);setMaxEvaluations(-1);
        __CLR4_4_1ok9ok9lb90p996.R.inc(31842);evaluations.resetCount();
    }finally{__CLR4_4_1ok9ok9lb90p996.R.flushNeeded();}}

    /** Build an instance with a null name.
     */
    protected AbstractIntegrator() {
        this(null);__CLR4_4_1ok9ok9lb90p996.R.inc(31844);try{__CLR4_4_1ok9ok9lb90p996.R.inc(31843);
    }finally{__CLR4_4_1ok9ok9lb90p996.R.flushNeeded();}}

    /** {@inheritDoc} */
    public String getName() {try{__CLR4_4_1ok9ok9lb90p996.R.inc(31845);
        __CLR4_4_1ok9ok9lb90p996.R.inc(31846);return name;
    }finally{__CLR4_4_1ok9ok9lb90p996.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void addStepHandler(final StepHandler handler) {try{__CLR4_4_1ok9ok9lb90p996.R.inc(31847);
        __CLR4_4_1ok9ok9lb90p996.R.inc(31848);stepHandlers.add(handler);
    }finally{__CLR4_4_1ok9ok9lb90p996.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Collection<StepHandler> getStepHandlers() {try{__CLR4_4_1ok9ok9lb90p996.R.inc(31849);
        __CLR4_4_1ok9ok9lb90p996.R.inc(31850);return Collections.unmodifiableCollection(stepHandlers);
    }finally{__CLR4_4_1ok9ok9lb90p996.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void clearStepHandlers() {try{__CLR4_4_1ok9ok9lb90p996.R.inc(31851);
        __CLR4_4_1ok9ok9lb90p996.R.inc(31852);stepHandlers.clear();
    }finally{__CLR4_4_1ok9ok9lb90p996.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void addEventHandler(final EventHandler handler,
                                final double maxCheckInterval,
                                final double convergence,
                                final int maxIterationCount) {try{__CLR4_4_1ok9ok9lb90p996.R.inc(31853);
        __CLR4_4_1ok9ok9lb90p996.R.inc(31854);addEventHandler(handler, maxCheckInterval, convergence,
                        maxIterationCount,
                        new BracketingNthOrderBrentSolver(convergence, 5));
    }finally{__CLR4_4_1ok9ok9lb90p996.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void addEventHandler(final EventHandler handler,
                                final double maxCheckInterval,
                                final double convergence,
                                final int maxIterationCount,
                                final UnivariateSolver solver) {try{__CLR4_4_1ok9ok9lb90p996.R.inc(31855);
        __CLR4_4_1ok9ok9lb90p996.R.inc(31856);eventsStates.add(new EventState(handler, maxCheckInterval, convergence,
                                        maxIterationCount, solver));
    }finally{__CLR4_4_1ok9ok9lb90p996.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Collection<EventHandler> getEventHandlers() {try{__CLR4_4_1ok9ok9lb90p996.R.inc(31857);
        __CLR4_4_1ok9ok9lb90p996.R.inc(31858);final List<EventHandler> list = new ArrayList<EventHandler>(eventsStates.size());
        __CLR4_4_1ok9ok9lb90p996.R.inc(31859);for (EventState state : eventsStates) {{
            __CLR4_4_1ok9ok9lb90p996.R.inc(31860);list.add(state.getEventHandler());
        }
        }__CLR4_4_1ok9ok9lb90p996.R.inc(31861);return Collections.unmodifiableCollection(list);
    }finally{__CLR4_4_1ok9ok9lb90p996.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void clearEventHandlers() {try{__CLR4_4_1ok9ok9lb90p996.R.inc(31862);
        __CLR4_4_1ok9ok9lb90p996.R.inc(31863);eventsStates.clear();
    }finally{__CLR4_4_1ok9ok9lb90p996.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double getCurrentStepStart() {try{__CLR4_4_1ok9ok9lb90p996.R.inc(31864);
        __CLR4_4_1ok9ok9lb90p996.R.inc(31865);return stepStart;
    }finally{__CLR4_4_1ok9ok9lb90p996.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double getCurrentSignedStepsize() {try{__CLR4_4_1ok9ok9lb90p996.R.inc(31866);
        __CLR4_4_1ok9ok9lb90p996.R.inc(31867);return stepSize;
    }finally{__CLR4_4_1ok9ok9lb90p996.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void setMaxEvaluations(int maxEvaluations) {try{__CLR4_4_1ok9ok9lb90p996.R.inc(31868);
        __CLR4_4_1ok9ok9lb90p996.R.inc(31869);evaluations.setMaximalCount(((((maxEvaluations < 0) )&&(__CLR4_4_1ok9ok9lb90p996.R.iget(31870)!=0|true))||(__CLR4_4_1ok9ok9lb90p996.R.iget(31871)==0&false))? Integer.MAX_VALUE : maxEvaluations);
    }finally{__CLR4_4_1ok9ok9lb90p996.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int getMaxEvaluations() {try{__CLR4_4_1ok9ok9lb90p996.R.inc(31872);
        __CLR4_4_1ok9ok9lb90p996.R.inc(31873);return evaluations.getMaximalCount();
    }finally{__CLR4_4_1ok9ok9lb90p996.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int getEvaluations() {try{__CLR4_4_1ok9ok9lb90p996.R.inc(31874);
        __CLR4_4_1ok9ok9lb90p996.R.inc(31875);return evaluations.getCount();
    }finally{__CLR4_4_1ok9ok9lb90p996.R.flushNeeded();}}

    /** Prepare the start of an integration.
     * @param t0 start value of the independent <i>time</i> variable
     * @param y0 array containing the start value of the state vector
     * @param t target time for the integration
     */
    protected void initIntegration(final double t0, final double[] y0, final double t) {try{__CLR4_4_1ok9ok9lb90p996.R.inc(31876);

        __CLR4_4_1ok9ok9lb90p996.R.inc(31877);evaluations.resetCount();

        __CLR4_4_1ok9ok9lb90p996.R.inc(31878);for (final EventState state : eventsStates) {{
            __CLR4_4_1ok9ok9lb90p996.R.inc(31879);state.setExpandable(expandable);
            __CLR4_4_1ok9ok9lb90p996.R.inc(31880);state.getEventHandler().init(t0, y0, t);
        }

        }__CLR4_4_1ok9ok9lb90p996.R.inc(31881);for (StepHandler handler : stepHandlers) {{
            __CLR4_4_1ok9ok9lb90p996.R.inc(31882);handler.init(t0, y0, t);
        }

        }__CLR4_4_1ok9ok9lb90p996.R.inc(31883);setStateInitialized(false);

    }finally{__CLR4_4_1ok9ok9lb90p996.R.flushNeeded();}}

    /** Set the equations.
     * @param equations equations to set
     */
    protected void setEquations(final ExpandableStatefulODE equations) {try{__CLR4_4_1ok9ok9lb90p996.R.inc(31884);
        __CLR4_4_1ok9ok9lb90p996.R.inc(31885);this.expandable = equations;
    }finally{__CLR4_4_1ok9ok9lb90p996.R.flushNeeded();}}

    /** Get the differential equations to integrate.
     * @return differential equations to integrate
     * @since 3.2
     */
    protected ExpandableStatefulODE getExpandable() {try{__CLR4_4_1ok9ok9lb90p996.R.inc(31886);
        __CLR4_4_1ok9ok9lb90p996.R.inc(31887);return expandable;
    }finally{__CLR4_4_1ok9ok9lb90p996.R.flushNeeded();}}

    /** Get the evaluations counter.
     * @return evaluations counter
     * @since 3.2
     */
    protected Incrementor getEvaluationsCounter() {try{__CLR4_4_1ok9ok9lb90p996.R.inc(31888);
        __CLR4_4_1ok9ok9lb90p996.R.inc(31889);return evaluations;
    }finally{__CLR4_4_1ok9ok9lb90p996.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double integrate(final FirstOrderDifferentialEquations equations,
                            final double t0, final double[] y0, final double t, final double[] y)
        throws DimensionMismatchException, NumberIsTooSmallException,
               MaxCountExceededException, NoBracketingException {try{__CLR4_4_1ok9ok9lb90p996.R.inc(31890);

        __CLR4_4_1ok9ok9lb90p996.R.inc(31891);if ((((y0.length != equations.getDimension())&&(__CLR4_4_1ok9ok9lb90p996.R.iget(31892)!=0|true))||(__CLR4_4_1ok9ok9lb90p996.R.iget(31893)==0&false))) {{
            __CLR4_4_1ok9ok9lb90p996.R.inc(31894);throw new DimensionMismatchException(y0.length, equations.getDimension());
        }
        }__CLR4_4_1ok9ok9lb90p996.R.inc(31895);if ((((y.length != equations.getDimension())&&(__CLR4_4_1ok9ok9lb90p996.R.iget(31896)!=0|true))||(__CLR4_4_1ok9ok9lb90p996.R.iget(31897)==0&false))) {{
            __CLR4_4_1ok9ok9lb90p996.R.inc(31898);throw new DimensionMismatchException(y.length, equations.getDimension());
        }

        // prepare expandable stateful equations
        }__CLR4_4_1ok9ok9lb90p996.R.inc(31899);final ExpandableStatefulODE expandableODE = new ExpandableStatefulODE(equations);
        __CLR4_4_1ok9ok9lb90p996.R.inc(31900);expandableODE.setTime(t0);
        __CLR4_4_1ok9ok9lb90p996.R.inc(31901);expandableODE.setPrimaryState(y0);

        // perform integration
        __CLR4_4_1ok9ok9lb90p996.R.inc(31902);integrate(expandableODE, t);

        // extract results back from the stateful equations
        __CLR4_4_1ok9ok9lb90p996.R.inc(31903);System.arraycopy(expandableODE.getPrimaryState(), 0, y, 0, y.length);
        __CLR4_4_1ok9ok9lb90p996.R.inc(31904);return expandableODE.getTime();

    }finally{__CLR4_4_1ok9ok9lb90p996.R.flushNeeded();}}

    /** Integrate a set of differential equations up to the given time.
     * <p>This method solves an Initial Value Problem (IVP).</p>
     * <p>The set of differential equations is composed of a main set, which
     * can be extended by some sets of secondary equations. The set of
     * equations must be already set up with initial time and partial states.
     * At integration completion, the final time and partial states will be
     * available in the same object.</p>
     * <p>Since this method stores some internal state variables made
     * available in its public interface during integration ({@link
     * #getCurrentSignedStepsize()}), it is <em>not</em> thread-safe.</p>
     * @param equations complete set of differential equations to integrate
     * @param t target time for the integration
     * (can be set to a value smaller than <code>t0</code> for backward integration)
     * @exception NumberIsTooSmallException if integration step is too small
     * @throws DimensionMismatchException if the dimension of the complete state does not
     * match the complete equations sets dimension
     * @exception MaxCountExceededException if the number of functions evaluations is exceeded
     * @exception NoBracketingException if the location of an event cannot be bracketed
     */
    public abstract void integrate(ExpandableStatefulODE equations, double t)
        throws NumberIsTooSmallException, DimensionMismatchException,
               MaxCountExceededException, NoBracketingException;

    /** Compute the derivatives and check the number of evaluations.
     * @param t current value of the independent <I>time</I> variable
     * @param y array containing the current value of the state vector
     * @param yDot placeholder array where to put the time derivative of the state vector
     * @exception MaxCountExceededException if the number of functions evaluations is exceeded
     * @exception DimensionMismatchException if arrays dimensions do not match equations settings
     */
    public void computeDerivatives(final double t, final double[] y, final double[] yDot)
        throws MaxCountExceededException, DimensionMismatchException {try{__CLR4_4_1ok9ok9lb90p996.R.inc(31905);
        __CLR4_4_1ok9ok9lb90p996.R.inc(31906);evaluations.incrementCount();
        __CLR4_4_1ok9ok9lb90p996.R.inc(31907);expandable.computeDerivatives(t, y, yDot);
    }finally{__CLR4_4_1ok9ok9lb90p996.R.flushNeeded();}}

    /** Set the stateInitialized flag.
     * <p>This method must be called by integrators with the value
     * {@code false} before they start integration, so a proper lazy
     * initialization is done automatically on the first step.</p>
     * @param stateInitialized new value for the flag
     * @since 2.2
     */
    protected void setStateInitialized(final boolean stateInitialized) {try{__CLR4_4_1ok9ok9lb90p996.R.inc(31908);
        __CLR4_4_1ok9ok9lb90p996.R.inc(31909);this.statesInitialized = stateInitialized;
    }finally{__CLR4_4_1ok9ok9lb90p996.R.flushNeeded();}}

    /** Accept a step, triggering events and step handlers.
     * @param interpolator step interpolator
     * @param y state vector at step end time, must be reset if an event
     * asks for resetting or if an events stops integration during the step
     * @param yDot placeholder array where to put the time derivative of the state vector
     * @param tEnd final integration time
     * @return time at end of step
     * @exception MaxCountExceededException if the interpolator throws one because
     * the number of functions evaluations is exceeded
     * @exception NoBracketingException if the location of an event cannot be bracketed
     * @exception DimensionMismatchException if arrays dimensions do not match equations settings
     * @since 2.2
     */
    protected double acceptStep(final AbstractStepInterpolator interpolator,
                                final double[] y, final double[] yDot, final double tEnd)
        throws MaxCountExceededException, DimensionMismatchException, NoBracketingException {try{__CLR4_4_1ok9ok9lb90p996.R.inc(31910);

            __CLR4_4_1ok9ok9lb90p996.R.inc(31911);double previousT = interpolator.getGlobalPreviousTime();
            __CLR4_4_1ok9ok9lb90p996.R.inc(31912);final double currentT = interpolator.getGlobalCurrentTime();

            // initialize the events states if needed
            __CLR4_4_1ok9ok9lb90p996.R.inc(31913);if ((((! statesInitialized)&&(__CLR4_4_1ok9ok9lb90p996.R.iget(31914)!=0|true))||(__CLR4_4_1ok9ok9lb90p996.R.iget(31915)==0&false))) {{
                __CLR4_4_1ok9ok9lb90p996.R.inc(31916);for (EventState state : eventsStates) {{
                    __CLR4_4_1ok9ok9lb90p996.R.inc(31917);state.reinitializeBegin(interpolator);
                }
                }__CLR4_4_1ok9ok9lb90p996.R.inc(31918);statesInitialized = true;
            }

            // search for next events that may occur during the step
            }__CLR4_4_1ok9ok9lb90p996.R.inc(31919);final int orderingSign = (((interpolator.isForward() )&&(__CLR4_4_1ok9ok9lb90p996.R.iget(31920)!=0|true))||(__CLR4_4_1ok9ok9lb90p996.R.iget(31921)==0&false))? +1 : -1;
            __CLR4_4_1ok9ok9lb90p996.R.inc(31922);SortedSet<EventState> occurringEvents = new TreeSet<EventState>(new Comparator<EventState>() {

                /** {@inheritDoc} */
                public int compare(EventState es0, EventState es1) {try{__CLR4_4_1ok9ok9lb90p996.R.inc(31923);
                    __CLR4_4_1ok9ok9lb90p996.R.inc(31924);return orderingSign * Double.compare(es0.getEventTime(), es1.getEventTime());
                }finally{__CLR4_4_1ok9ok9lb90p996.R.flushNeeded();}}

            });

            __CLR4_4_1ok9ok9lb90p996.R.inc(31925);for (final EventState state : eventsStates) {{
                __CLR4_4_1ok9ok9lb90p996.R.inc(31926);if ((((state.evaluateStep(interpolator))&&(__CLR4_4_1ok9ok9lb90p996.R.iget(31927)!=0|true))||(__CLR4_4_1ok9ok9lb90p996.R.iget(31928)==0&false))) {{
                    // the event occurs during the current step
                    __CLR4_4_1ok9ok9lb90p996.R.inc(31929);occurringEvents.add(state);
                }
            }}

            }__CLR4_4_1ok9ok9lb90p996.R.inc(31930);while ((((!occurringEvents.isEmpty())&&(__CLR4_4_1ok9ok9lb90p996.R.iget(31931)!=0|true))||(__CLR4_4_1ok9ok9lb90p996.R.iget(31932)==0&false))) {{

                // handle the chronologically first event
                __CLR4_4_1ok9ok9lb90p996.R.inc(31933);final Iterator<EventState> iterator = occurringEvents.iterator();
                __CLR4_4_1ok9ok9lb90p996.R.inc(31934);final EventState currentEvent = iterator.next();
                __CLR4_4_1ok9ok9lb90p996.R.inc(31935);iterator.remove();

                // restrict the interpolator to the first part of the step, up to the event
                __CLR4_4_1ok9ok9lb90p996.R.inc(31936);final double eventT = currentEvent.getEventTime();
                __CLR4_4_1ok9ok9lb90p996.R.inc(31937);interpolator.setSoftPreviousTime(previousT);
                __CLR4_4_1ok9ok9lb90p996.R.inc(31938);interpolator.setSoftCurrentTime(eventT);

                // get state at event time
                __CLR4_4_1ok9ok9lb90p996.R.inc(31939);interpolator.setInterpolatedTime(eventT);
                __CLR4_4_1ok9ok9lb90p996.R.inc(31940);final double[] eventYComplete = new double[y.length];
                __CLR4_4_1ok9ok9lb90p996.R.inc(31941);expandable.getPrimaryMapper().insertEquationData(interpolator.getInterpolatedState(),
                                                                 eventYComplete);
                __CLR4_4_1ok9ok9lb90p996.R.inc(31942);int index = 0;
                __CLR4_4_1ok9ok9lb90p996.R.inc(31943);for (EquationsMapper secondary : expandable.getSecondaryMappers()) {{
                    __CLR4_4_1ok9ok9lb90p996.R.inc(31944);secondary.insertEquationData(interpolator.getInterpolatedSecondaryState(index++),
                                                 eventYComplete);
                }

                // advance all event states to current time
                }__CLR4_4_1ok9ok9lb90p996.R.inc(31945);for (final EventState state : eventsStates) {{
                    __CLR4_4_1ok9ok9lb90p996.R.inc(31946);state.stepAccepted(eventT, eventYComplete);
                    __CLR4_4_1ok9ok9lb90p996.R.inc(31947);isLastStep = isLastStep || state.stop();
                }

                // handle the first part of the step, up to the event
                }__CLR4_4_1ok9ok9lb90p996.R.inc(31948);for (final StepHandler handler : stepHandlers) {{
                    __CLR4_4_1ok9ok9lb90p996.R.inc(31949);handler.handleStep(interpolator, isLastStep);
                }

                }__CLR4_4_1ok9ok9lb90p996.R.inc(31950);if ((((isLastStep)&&(__CLR4_4_1ok9ok9lb90p996.R.iget(31951)!=0|true))||(__CLR4_4_1ok9ok9lb90p996.R.iget(31952)==0&false))) {{
                    // the event asked to stop integration
                    __CLR4_4_1ok9ok9lb90p996.R.inc(31953);System.arraycopy(eventYComplete, 0, y, 0, y.length);
                    __CLR4_4_1ok9ok9lb90p996.R.inc(31954);return eventT;
                }

                }__CLR4_4_1ok9ok9lb90p996.R.inc(31955);boolean needReset = false;
                __CLR4_4_1ok9ok9lb90p996.R.inc(31956);for (final EventState state : eventsStates) {{
                    __CLR4_4_1ok9ok9lb90p996.R.inc(31957);needReset =  needReset || state.reset(eventT, eventYComplete);
                }
                }__CLR4_4_1ok9ok9lb90p996.R.inc(31958);if ((((needReset)&&(__CLR4_4_1ok9ok9lb90p996.R.iget(31959)!=0|true))||(__CLR4_4_1ok9ok9lb90p996.R.iget(31960)==0&false))) {{
                    // some event handler has triggered changes that
                    // invalidate the derivatives, we need to recompute them
                    __CLR4_4_1ok9ok9lb90p996.R.inc(31961);interpolator.setInterpolatedTime(eventT);
                    __CLR4_4_1ok9ok9lb90p996.R.inc(31962);System.arraycopy(eventYComplete, 0, y, 0, y.length);
                    __CLR4_4_1ok9ok9lb90p996.R.inc(31963);computeDerivatives(eventT, y, yDot);
                    __CLR4_4_1ok9ok9lb90p996.R.inc(31964);resetOccurred = true;
                    __CLR4_4_1ok9ok9lb90p996.R.inc(31965);return eventT;
                }

                // prepare handling of the remaining part of the step
                }__CLR4_4_1ok9ok9lb90p996.R.inc(31966);previousT = eventT;
                __CLR4_4_1ok9ok9lb90p996.R.inc(31967);interpolator.setSoftPreviousTime(eventT);
                __CLR4_4_1ok9ok9lb90p996.R.inc(31968);interpolator.setSoftCurrentTime(currentT);

                // check if the same event occurs again in the remaining part of the step
                __CLR4_4_1ok9ok9lb90p996.R.inc(31969);if ((((currentEvent.evaluateStep(interpolator))&&(__CLR4_4_1ok9ok9lb90p996.R.iget(31970)!=0|true))||(__CLR4_4_1ok9ok9lb90p996.R.iget(31971)==0&false))) {{
                    // the event occurs during the current step
                    __CLR4_4_1ok9ok9lb90p996.R.inc(31972);occurringEvents.add(currentEvent);
                }

            }}

            // last part of the step, after the last event
            }__CLR4_4_1ok9ok9lb90p996.R.inc(31973);interpolator.setInterpolatedTime(currentT);
            __CLR4_4_1ok9ok9lb90p996.R.inc(31974);final double[] currentY = new double[y.length];
            __CLR4_4_1ok9ok9lb90p996.R.inc(31975);expandable.getPrimaryMapper().insertEquationData(interpolator.getInterpolatedState(),
                                                             currentY);
            __CLR4_4_1ok9ok9lb90p996.R.inc(31976);int index = 0;
            __CLR4_4_1ok9ok9lb90p996.R.inc(31977);for (EquationsMapper secondary : expandable.getSecondaryMappers()) {{
                __CLR4_4_1ok9ok9lb90p996.R.inc(31978);secondary.insertEquationData(interpolator.getInterpolatedSecondaryState(index++),
                                             currentY);
            }
            }__CLR4_4_1ok9ok9lb90p996.R.inc(31979);for (final EventState state : eventsStates) {{
                __CLR4_4_1ok9ok9lb90p996.R.inc(31980);state.stepAccepted(currentT, currentY);
                __CLR4_4_1ok9ok9lb90p996.R.inc(31981);isLastStep = isLastStep || state.stop();
            }
            }__CLR4_4_1ok9ok9lb90p996.R.inc(31982);isLastStep = isLastStep || Precision.equals(currentT, tEnd, 1);

            // handle the remaining part of the step, after all events if any
            __CLR4_4_1ok9ok9lb90p996.R.inc(31983);for (StepHandler handler : stepHandlers) {{
                __CLR4_4_1ok9ok9lb90p996.R.inc(31984);handler.handleStep(interpolator, isLastStep);
            }

            }__CLR4_4_1ok9ok9lb90p996.R.inc(31985);return currentT;

    }finally{__CLR4_4_1ok9ok9lb90p996.R.flushNeeded();}}

    /** Check the integration span.
     * @param equations set of differential equations
     * @param t target time for the integration
     * @exception NumberIsTooSmallException if integration span is too small
     * @exception DimensionMismatchException if adaptive step size integrators
     * tolerance arrays dimensions are not compatible with equations settings
     */
    protected void sanityChecks(final ExpandableStatefulODE equations, final double t)
        throws NumberIsTooSmallException, DimensionMismatchException {try{__CLR4_4_1ok9ok9lb90p996.R.inc(31986);

        __CLR4_4_1ok9ok9lb90p996.R.inc(31987);final double threshold = 1000 * FastMath.ulp(FastMath.max(FastMath.abs(equations.getTime()),
                                                                  FastMath.abs(t)));
        __CLR4_4_1ok9ok9lb90p996.R.inc(31988);final double dt = FastMath.abs(equations.getTime() - t);
        __CLR4_4_1ok9ok9lb90p996.R.inc(31989);if ((((dt <= threshold)&&(__CLR4_4_1ok9ok9lb90p996.R.iget(31990)!=0|true))||(__CLR4_4_1ok9ok9lb90p996.R.iget(31991)==0&false))) {{
            __CLR4_4_1ok9ok9lb90p996.R.inc(31992);throw new NumberIsTooSmallException(LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL,
                                                dt, threshold, false);
        }

    }}finally{__CLR4_4_1ok9ok9lb90p996.R.flushNeeded();}}

}
