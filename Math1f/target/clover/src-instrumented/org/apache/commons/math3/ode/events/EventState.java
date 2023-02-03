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

package org.apache.commons.math3.ode.events;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.solvers.AllowedSolution;
import org.apache.commons.math3.analysis.solvers.BracketedUnivariateSolver;
import org.apache.commons.math3.analysis.solvers.PegasusSolver;
import org.apache.commons.math3.analysis.solvers.UnivariateSolver;
import org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.NoBracketingException;
import org.apache.commons.math3.ode.EquationsMapper;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.sampling.StepInterpolator;
import org.apache.commons.math3.util.FastMath;

/** This class handles the state for one {@link EventHandler
 * event handler} during integration steps.
 *
 * <p>Each time the integrator proposes a step, the event handler
 * switching function should be checked. This class handles the state
 * of one handler during one integration step, with references to the
 * state at the end of the preceding step. This information is used to
 * decide if the handler should trigger an event or not during the
 * proposed step.</p>
 *
 * @version $Id$
 * @since 1.2
 */
public class EventState {public static class __CLR4_4_1p8np8nlb90p9co{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,32857,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Event handler. */
    private final EventHandler handler;

    /** Maximal time interval between events handler checks. */
    private final double maxCheckInterval;

    /** Convergence threshold for event localization. */
    private final double convergence;

    /** Upper limit in the iteration count for event localization. */
    private final int maxIterationCount;

    /** Equation being integrated. */
    private ExpandableStatefulODE expandable;

    /** Time at the beginning of the step. */
    private double t0;

    /** Value of the events handler at the beginning of the step. */
    private double g0;

    /** Simulated sign of g0 (we cheat when crossing events). */
    private boolean g0Positive;

    /** Indicator of event expected during the step. */
    private boolean pendingEvent;

    /** Occurrence time of the pending event. */
    private double pendingEventTime;

    /** Occurrence time of the previous event. */
    private double previousEventTime;

    /** Integration direction. */
    private boolean forward;

    /** Variation direction around pending event.
     *  (this is considered with respect to the integration direction)
     */
    private boolean increasing;

    /** Next action indicator. */
    private EventHandler.Action nextAction;

    /** Root-finding algorithm to use to detect state events. */
    private final UnivariateSolver solver;

    /** Simple constructor.
     * @param handler event handler
     * @param maxCheckInterval maximal time interval between switching
     * function checks (this interval prevents missing sign changes in
     * case the integration steps becomes very large)
     * @param convergence convergence threshold in the event time search
     * @param maxIterationCount upper limit of the iteration count in
     * the event time search
     * @param solver Root-finding algorithm to use to detect state events
     */
    public EventState(final EventHandler handler, final double maxCheckInterval,
                      final double convergence, final int maxIterationCount,
                      final UnivariateSolver solver) {try{__CLR4_4_1p8np8nlb90p9co.R.inc(32711);
        __CLR4_4_1p8np8nlb90p9co.R.inc(32712);this.handler           = handler;
        __CLR4_4_1p8np8nlb90p9co.R.inc(32713);this.maxCheckInterval  = maxCheckInterval;
        __CLR4_4_1p8np8nlb90p9co.R.inc(32714);this.convergence       = FastMath.abs(convergence);
        __CLR4_4_1p8np8nlb90p9co.R.inc(32715);this.maxIterationCount = maxIterationCount;
        __CLR4_4_1p8np8nlb90p9co.R.inc(32716);this.solver            = solver;

        // some dummy values ...
        __CLR4_4_1p8np8nlb90p9co.R.inc(32717);expandable        = null;
        __CLR4_4_1p8np8nlb90p9co.R.inc(32718);t0                = Double.NaN;
        __CLR4_4_1p8np8nlb90p9co.R.inc(32719);g0                = Double.NaN;
        __CLR4_4_1p8np8nlb90p9co.R.inc(32720);g0Positive        = true;
        __CLR4_4_1p8np8nlb90p9co.R.inc(32721);pendingEvent      = false;
        __CLR4_4_1p8np8nlb90p9co.R.inc(32722);pendingEventTime  = Double.NaN;
        __CLR4_4_1p8np8nlb90p9co.R.inc(32723);previousEventTime = Double.NaN;
        __CLR4_4_1p8np8nlb90p9co.R.inc(32724);increasing        = true;
        __CLR4_4_1p8np8nlb90p9co.R.inc(32725);nextAction        = EventHandler.Action.CONTINUE;

    }finally{__CLR4_4_1p8np8nlb90p9co.R.flushNeeded();}}

    /** Get the underlying event handler.
     * @return underlying event handler
     */
    public EventHandler getEventHandler() {try{__CLR4_4_1p8np8nlb90p9co.R.inc(32726);
        __CLR4_4_1p8np8nlb90p9co.R.inc(32727);return handler;
    }finally{__CLR4_4_1p8np8nlb90p9co.R.flushNeeded();}}

    /** Set the equation.
     * @param expandable equation being integrated
     */
    public void setExpandable(final ExpandableStatefulODE expandable) {try{__CLR4_4_1p8np8nlb90p9co.R.inc(32728);
        __CLR4_4_1p8np8nlb90p9co.R.inc(32729);this.expandable = expandable;
    }finally{__CLR4_4_1p8np8nlb90p9co.R.flushNeeded();}}

    /** Get the maximal time interval between events handler checks.
     * @return maximal time interval between events handler checks
     */
    public double getMaxCheckInterval() {try{__CLR4_4_1p8np8nlb90p9co.R.inc(32730);
        __CLR4_4_1p8np8nlb90p9co.R.inc(32731);return maxCheckInterval;
    }finally{__CLR4_4_1p8np8nlb90p9co.R.flushNeeded();}}

    /** Get the convergence threshold for event localization.
     * @return convergence threshold for event localization
     */
    public double getConvergence() {try{__CLR4_4_1p8np8nlb90p9co.R.inc(32732);
        __CLR4_4_1p8np8nlb90p9co.R.inc(32733);return convergence;
    }finally{__CLR4_4_1p8np8nlb90p9co.R.flushNeeded();}}

    /** Get the upper limit in the iteration count for event localization.
     * @return upper limit in the iteration count for event localization
     */
    public int getMaxIterationCount() {try{__CLR4_4_1p8np8nlb90p9co.R.inc(32734);
        __CLR4_4_1p8np8nlb90p9co.R.inc(32735);return maxIterationCount;
    }finally{__CLR4_4_1p8np8nlb90p9co.R.flushNeeded();}}

    /** Reinitialize the beginning of the step.
     * @param interpolator valid for the current step
     * @exception MaxCountExceededException if the interpolator throws one because
     * the number of functions evaluations is exceeded
     */
    public void reinitializeBegin(final StepInterpolator interpolator)
        throws MaxCountExceededException {try{__CLR4_4_1p8np8nlb90p9co.R.inc(32736);

        __CLR4_4_1p8np8nlb90p9co.R.inc(32737);t0 = interpolator.getPreviousTime();
        __CLR4_4_1p8np8nlb90p9co.R.inc(32738);interpolator.setInterpolatedTime(t0);
        __CLR4_4_1p8np8nlb90p9co.R.inc(32739);g0 = handler.g(t0, getCompleteState(interpolator));
        __CLR4_4_1p8np8nlb90p9co.R.inc(32740);if ((((g0 == 0)&&(__CLR4_4_1p8np8nlb90p9co.R.iget(32741)!=0|true))||(__CLR4_4_1p8np8nlb90p9co.R.iget(32742)==0&false))) {{
            // excerpt from MATH-421 issue:
            // If an ODE solver is setup with an EventHandler that return STOP
            // when the even is triggered, the integrator stops (which is exactly
            // the expected behavior). If however the user wants to restart the
            // solver from the final state reached at the event with the same
            // configuration (expecting the event to be triggered again at a
            // later time), then the integrator may fail to start. It can get stuck
            // at the previous event. The use case for the bug MATH-421 is fairly
            // general, so events occurring exactly at start in the first step should
            // be ignored.

            // extremely rare case: there is a zero EXACTLY at interval start
            // we will use the sign slightly after step beginning to force ignoring this zero
            __CLR4_4_1p8np8nlb90p9co.R.inc(32743);final double epsilon = FastMath.max(solver.getAbsoluteAccuracy(),
                                                FastMath.abs(solver.getRelativeAccuracy() * t0));
            __CLR4_4_1p8np8nlb90p9co.R.inc(32744);final double tStart = t0 + 0.5 * epsilon;
            __CLR4_4_1p8np8nlb90p9co.R.inc(32745);interpolator.setInterpolatedTime(tStart);
            __CLR4_4_1p8np8nlb90p9co.R.inc(32746);g0 = handler.g(tStart, getCompleteState(interpolator));
        }
        }__CLR4_4_1p8np8nlb90p9co.R.inc(32747);g0Positive = g0 >= 0;

    }finally{__CLR4_4_1p8np8nlb90p9co.R.flushNeeded();}}

    /** Get the complete state (primary and secondary).
     * @param interpolator interpolator to use
     * @return complete state
     */
    private double[] getCompleteState(final StepInterpolator interpolator) {try{__CLR4_4_1p8np8nlb90p9co.R.inc(32748);

        __CLR4_4_1p8np8nlb90p9co.R.inc(32749);final double[] complete = new double[expandable.getTotalDimension()];

        __CLR4_4_1p8np8nlb90p9co.R.inc(32750);expandable.getPrimaryMapper().insertEquationData(interpolator.getInterpolatedState(),
                                                         complete);
        __CLR4_4_1p8np8nlb90p9co.R.inc(32751);int index = 0;
        __CLR4_4_1p8np8nlb90p9co.R.inc(32752);for (EquationsMapper secondary : expandable.getSecondaryMappers()) {{
            __CLR4_4_1p8np8nlb90p9co.R.inc(32753);secondary.insertEquationData(interpolator.getInterpolatedSecondaryState(index++),
                                         complete);
        }

        }__CLR4_4_1p8np8nlb90p9co.R.inc(32754);return complete;

    }finally{__CLR4_4_1p8np8nlb90p9co.R.flushNeeded();}}

    /** Evaluate the impact of the proposed step on the event handler.
     * @param interpolator step interpolator for the proposed step
     * @return true if the event handler triggers an event before
     * the end of the proposed step
     * @exception MaxCountExceededException if the interpolator throws one because
     * the number of functions evaluations is exceeded
     * @exception NoBracketingException if the event cannot be bracketed
     */
    public boolean evaluateStep(final StepInterpolator interpolator)
        throws MaxCountExceededException, NoBracketingException {try{__CLR4_4_1p8np8nlb90p9co.R.inc(32755);

        __CLR4_4_1p8np8nlb90p9co.R.inc(32756);try {
            __CLR4_4_1p8np8nlb90p9co.R.inc(32757);forward = interpolator.isForward();
            __CLR4_4_1p8np8nlb90p9co.R.inc(32758);final double t1 = interpolator.getCurrentTime();
            __CLR4_4_1p8np8nlb90p9co.R.inc(32759);final double dt = t1 - t0;
            __CLR4_4_1p8np8nlb90p9co.R.inc(32760);if ((((FastMath.abs(dt) < convergence)&&(__CLR4_4_1p8np8nlb90p9co.R.iget(32761)!=0|true))||(__CLR4_4_1p8np8nlb90p9co.R.iget(32762)==0&false))) {{
                // we cannot do anything on such a small step, don't trigger any events
                __CLR4_4_1p8np8nlb90p9co.R.inc(32763);return false;
            }
            }__CLR4_4_1p8np8nlb90p9co.R.inc(32764);final int    n = FastMath.max(1, (int) FastMath.ceil(FastMath.abs(dt) / maxCheckInterval));
            __CLR4_4_1p8np8nlb90p9co.R.inc(32765);final double h = dt / n;

            __CLR4_4_1p8np8nlb90p9co.R.inc(32766);final UnivariateFunction f = new UnivariateFunction() {
                public double value(final double t) throws LocalMaxCountExceededException {try{__CLR4_4_1p8np8nlb90p9co.R.inc(32767);
                    __CLR4_4_1p8np8nlb90p9co.R.inc(32768);try {
                        __CLR4_4_1p8np8nlb90p9co.R.inc(32769);interpolator.setInterpolatedTime(t);
                        __CLR4_4_1p8np8nlb90p9co.R.inc(32770);return handler.g(t, getCompleteState(interpolator));
                    } catch (MaxCountExceededException mcee) {
                        __CLR4_4_1p8np8nlb90p9co.R.inc(32771);throw new LocalMaxCountExceededException(mcee);
                    }
                }finally{__CLR4_4_1p8np8nlb90p9co.R.flushNeeded();}}
            };

            __CLR4_4_1p8np8nlb90p9co.R.inc(32772);double ta = t0;
            __CLR4_4_1p8np8nlb90p9co.R.inc(32773);double ga = g0;
            __CLR4_4_1p8np8nlb90p9co.R.inc(32774);for (int i = 0; (((i < n)&&(__CLR4_4_1p8np8nlb90p9co.R.iget(32775)!=0|true))||(__CLR4_4_1p8np8nlb90p9co.R.iget(32776)==0&false)); ++i) {{

                // evaluate handler value at the end of the substep
                __CLR4_4_1p8np8nlb90p9co.R.inc(32777);final double tb = t0 + (i + 1) * h;
                __CLR4_4_1p8np8nlb90p9co.R.inc(32778);interpolator.setInterpolatedTime(tb);
                __CLR4_4_1p8np8nlb90p9co.R.inc(32779);final double gb = handler.g(tb, getCompleteState(interpolator));

                // check events occurrence
                __CLR4_4_1p8np8nlb90p9co.R.inc(32780);if ((((g0Positive ^ (gb >= 0))&&(__CLR4_4_1p8np8nlb90p9co.R.iget(32781)!=0|true))||(__CLR4_4_1p8np8nlb90p9co.R.iget(32782)==0&false))) {{
                    // there is a sign change: an event is expected during this step

                    // variation direction, with respect to the integration direction
                    __CLR4_4_1p8np8nlb90p9co.R.inc(32783);increasing = gb >= ga;

                    // find the event time making sure we select a solution just at or past the exact root
                    __CLR4_4_1p8np8nlb90p9co.R.inc(32784);final double root;
                    __CLR4_4_1p8np8nlb90p9co.R.inc(32785);if ((((solver instanceof BracketedUnivariateSolver<?>)&&(__CLR4_4_1p8np8nlb90p9co.R.iget(32786)!=0|true))||(__CLR4_4_1p8np8nlb90p9co.R.iget(32787)==0&false))) {{
                        __CLR4_4_1p8np8nlb90p9co.R.inc(32788);@SuppressWarnings("unchecked")
                        BracketedUnivariateSolver<UnivariateFunction> bracketing =
                                (BracketedUnivariateSolver<UnivariateFunction>) solver;
                        __CLR4_4_1p8np8nlb90p9co.R.inc(32789);root = (((forward )&&(__CLR4_4_1p8np8nlb90p9co.R.iget(32790)!=0|true))||(__CLR4_4_1p8np8nlb90p9co.R.iget(32791)==0&false))?
                               bracketing.solve(maxIterationCount, f, ta, tb, AllowedSolution.RIGHT_SIDE) :
                               bracketing.solve(maxIterationCount, f, tb, ta, AllowedSolution.LEFT_SIDE);
                    } }else {{
                        __CLR4_4_1p8np8nlb90p9co.R.inc(32792);final double baseRoot = (((forward )&&(__CLR4_4_1p8np8nlb90p9co.R.iget(32793)!=0|true))||(__CLR4_4_1p8np8nlb90p9co.R.iget(32794)==0&false))?
                                                solver.solve(maxIterationCount, f, ta, tb) :
                                                solver.solve(maxIterationCount, f, tb, ta);
                        __CLR4_4_1p8np8nlb90p9co.R.inc(32795);final int remainingEval = maxIterationCount - solver.getEvaluations();
                        __CLR4_4_1p8np8nlb90p9co.R.inc(32796);BracketedUnivariateSolver<UnivariateFunction> bracketing =
                                new PegasusSolver(solver.getRelativeAccuracy(), solver.getAbsoluteAccuracy());
                        __CLR4_4_1p8np8nlb90p9co.R.inc(32797);root = (((forward )&&(__CLR4_4_1p8np8nlb90p9co.R.iget(32798)!=0|true))||(__CLR4_4_1p8np8nlb90p9co.R.iget(32799)==0&false))?
                               UnivariateSolverUtils.forceSide(remainingEval, f, bracketing,
                                                                   baseRoot, ta, tb, AllowedSolution.RIGHT_SIDE) :
                               UnivariateSolverUtils.forceSide(remainingEval, f, bracketing,
                                                                   baseRoot, tb, ta, AllowedSolution.LEFT_SIDE);
                    }

                    }__CLR4_4_1p8np8nlb90p9co.R.inc(32800);if (((((!Double.isNaN(previousEventTime)) &&
                        (FastMath.abs(root - ta) <= convergence) &&
                        (FastMath.abs(root - previousEventTime) <= convergence))&&(__CLR4_4_1p8np8nlb90p9co.R.iget(32801)!=0|true))||(__CLR4_4_1p8np8nlb90p9co.R.iget(32802)==0&false))) {{
                        // we have either found nothing or found (again ?) a past event,
                        // retry the substep excluding this value
                        __CLR4_4_1p8np8nlb90p9co.R.inc(32803);ta = (((forward )&&(__CLR4_4_1p8np8nlb90p9co.R.iget(32804)!=0|true))||(__CLR4_4_1p8np8nlb90p9co.R.iget(32805)==0&false))? ta + convergence : ta - convergence;
                        __CLR4_4_1p8np8nlb90p9co.R.inc(32806);ga = f.value(ta);
                        __CLR4_4_1p8np8nlb90p9co.R.inc(32807);--i;
                    } }else {__CLR4_4_1p8np8nlb90p9co.R.inc(32808);if ((((Double.isNaN(previousEventTime) ||
                               (FastMath.abs(previousEventTime - root) > convergence))&&(__CLR4_4_1p8np8nlb90p9co.R.iget(32809)!=0|true))||(__CLR4_4_1p8np8nlb90p9co.R.iget(32810)==0&false))) {{
                        __CLR4_4_1p8np8nlb90p9co.R.inc(32811);pendingEventTime = root;
                        __CLR4_4_1p8np8nlb90p9co.R.inc(32812);pendingEvent = true;
                        __CLR4_4_1p8np8nlb90p9co.R.inc(32813);return true;
                    } }else {{
                        // no sign change: there is no event for now
                        __CLR4_4_1p8np8nlb90p9co.R.inc(32814);ta = tb;
                        __CLR4_4_1p8np8nlb90p9co.R.inc(32815);ga = gb;
                    }

                }}} }else {{
                    // no sign change: there is no event for now
                    __CLR4_4_1p8np8nlb90p9co.R.inc(32816);ta = tb;
                    __CLR4_4_1p8np8nlb90p9co.R.inc(32817);ga = gb;
                }

            }}

            // no event during the whole step
            }__CLR4_4_1p8np8nlb90p9co.R.inc(32818);pendingEvent     = false;
            __CLR4_4_1p8np8nlb90p9co.R.inc(32819);pendingEventTime = Double.NaN;
            __CLR4_4_1p8np8nlb90p9co.R.inc(32820);return false;

        } catch (LocalMaxCountExceededException lmcee) {
            __CLR4_4_1p8np8nlb90p9co.R.inc(32821);throw lmcee.getException();
        }

    }finally{__CLR4_4_1p8np8nlb90p9co.R.flushNeeded();}}

    /** Get the occurrence time of the event triggered in the current step.
     * @return occurrence time of the event triggered in the current
     * step or infinity if no events are triggered
     */
    public double getEventTime() {try{__CLR4_4_1p8np8nlb90p9co.R.inc(32822);
        __CLR4_4_1p8np8nlb90p9co.R.inc(32823);return (((pendingEvent )&&(__CLR4_4_1p8np8nlb90p9co.R.iget(32824)!=0|true))||(__CLR4_4_1p8np8nlb90p9co.R.iget(32825)==0&false))?
               pendingEventTime :
               ((((forward )&&(__CLR4_4_1p8np8nlb90p9co.R.iget(32826)!=0|true))||(__CLR4_4_1p8np8nlb90p9co.R.iget(32827)==0&false))? Double.POSITIVE_INFINITY : Double.NEGATIVE_INFINITY);
    }finally{__CLR4_4_1p8np8nlb90p9co.R.flushNeeded();}}

    /** Acknowledge the fact the step has been accepted by the integrator.
     * @param t value of the independent <i>time</i> variable at the
     * end of the step
     * @param y array containing the current value of the state vector
     * at the end of the step
     */
    public void stepAccepted(final double t, final double[] y) {try{__CLR4_4_1p8np8nlb90p9co.R.inc(32828);

        __CLR4_4_1p8np8nlb90p9co.R.inc(32829);t0 = t;
        __CLR4_4_1p8np8nlb90p9co.R.inc(32830);g0 = handler.g(t, y);

        __CLR4_4_1p8np8nlb90p9co.R.inc(32831);if ((((pendingEvent && (FastMath.abs(pendingEventTime - t) <= convergence))&&(__CLR4_4_1p8np8nlb90p9co.R.iget(32832)!=0|true))||(__CLR4_4_1p8np8nlb90p9co.R.iget(32833)==0&false))) {{
            // force the sign to its value "just after the event"
            __CLR4_4_1p8np8nlb90p9co.R.inc(32834);previousEventTime = t;
            __CLR4_4_1p8np8nlb90p9co.R.inc(32835);g0Positive        = increasing;
            __CLR4_4_1p8np8nlb90p9co.R.inc(32836);nextAction        = handler.eventOccurred(t, y, !(increasing ^ forward));
        } }else {{
            __CLR4_4_1p8np8nlb90p9co.R.inc(32837);g0Positive = g0 >= 0;
            __CLR4_4_1p8np8nlb90p9co.R.inc(32838);nextAction = EventHandler.Action.CONTINUE;
        }
    }}finally{__CLR4_4_1p8np8nlb90p9co.R.flushNeeded();}}

    /** Check if the integration should be stopped at the end of the
     * current step.
     * @return true if the integration should be stopped
     */
    public boolean stop() {try{__CLR4_4_1p8np8nlb90p9co.R.inc(32839);
        __CLR4_4_1p8np8nlb90p9co.R.inc(32840);return nextAction == EventHandler.Action.STOP;
    }finally{__CLR4_4_1p8np8nlb90p9co.R.flushNeeded();}}

    /** Let the event handler reset the state if it wants.
     * @param t value of the independent <i>time</i> variable at the
     * beginning of the next step
     * @param y array were to put the desired state vector at the beginning
     * of the next step
     * @return true if the integrator should reset the derivatives too
     */
    public boolean reset(final double t, final double[] y) {try{__CLR4_4_1p8np8nlb90p9co.R.inc(32841);

        __CLR4_4_1p8np8nlb90p9co.R.inc(32842);if ((((!(pendingEvent && (FastMath.abs(pendingEventTime - t) <= convergence)))&&(__CLR4_4_1p8np8nlb90p9co.R.iget(32843)!=0|true))||(__CLR4_4_1p8np8nlb90p9co.R.iget(32844)==0&false))) {{
            __CLR4_4_1p8np8nlb90p9co.R.inc(32845);return false;
        }

        }__CLR4_4_1p8np8nlb90p9co.R.inc(32846);if ((((nextAction == EventHandler.Action.RESET_STATE)&&(__CLR4_4_1p8np8nlb90p9co.R.iget(32847)!=0|true))||(__CLR4_4_1p8np8nlb90p9co.R.iget(32848)==0&false))) {{
            __CLR4_4_1p8np8nlb90p9co.R.inc(32849);handler.resetState(t, y);
        }
        }__CLR4_4_1p8np8nlb90p9co.R.inc(32850);pendingEvent      = false;
        __CLR4_4_1p8np8nlb90p9co.R.inc(32851);pendingEventTime  = Double.NaN;

        __CLR4_4_1p8np8nlb90p9co.R.inc(32852);return (nextAction == EventHandler.Action.RESET_STATE) ||
               (nextAction == EventHandler.Action.RESET_DERIVATIVES);

    }finally{__CLR4_4_1p8np8nlb90p9co.R.flushNeeded();}}

    /** Local wrapper to propagate exceptions. */
    private static class LocalMaxCountExceededException extends RuntimeException {

        /** Serializable UID. */
        private static final long serialVersionUID = 20120901L;

        /** Wrapped exception. */
        private final MaxCountExceededException wrapped;

        /** Simple constructor.
         * @param exception exception to wrap
         */
        public LocalMaxCountExceededException(final MaxCountExceededException exception) {try{__CLR4_4_1p8np8nlb90p9co.R.inc(32853);
            __CLR4_4_1p8np8nlb90p9co.R.inc(32854);wrapped = exception;
        }finally{__CLR4_4_1p8np8nlb90p9co.R.flushNeeded();}}

        /** Get the wrapped exception.
         * @return wrapped exception
         */
        public MaxCountExceededException getException() {try{__CLR4_4_1p8np8nlb90p9co.R.inc(32855);
            __CLR4_4_1p8np8nlb90p9co.R.inc(32856);return wrapped;
        }finally{__CLR4_4_1p8np8nlb90p9co.R.flushNeeded();}}

    }

}
