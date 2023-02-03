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

package org.apache.commons.math3.ode.nonstiff;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.NoBracketingException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.ode.EquationsMapper;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator;
import org.apache.commons.math3.util.FastMath;


/**
 * This class implements explicit Adams-Bashforth integrators for Ordinary
 * Differential Equations.
 *
 * <p>Adams-Bashforth methods (in fact due to Adams alone) are explicit
 * multistep ODE solvers. This implementation is a variation of the classical
 * one: it uses adaptive stepsize to implement error control, whereas
 * classical implementations are fixed step size. The value of state vector
 * at step n+1 is a simple combination of the value at step n and of the
 * derivatives at steps n, n-1, n-2 ... Depending on the number k of previous
 * steps one wants to use for computing the next value, different formulas
 * are available:</p>
 * <ul>
 *   <li>k = 1: y<sub>n+1</sub> = y<sub>n</sub> + h y'<sub>n</sub></li>
 *   <li>k = 2: y<sub>n+1</sub> = y<sub>n</sub> + h (3y'<sub>n</sub>-y'<sub>n-1</sub>)/2</li>
 *   <li>k = 3: y<sub>n+1</sub> = y<sub>n</sub> + h (23y'<sub>n</sub>-16y'<sub>n-1</sub>+5y'<sub>n-2</sub>)/12</li>
 *   <li>k = 4: y<sub>n+1</sub> = y<sub>n</sub> + h (55y'<sub>n</sub>-59y'<sub>n-1</sub>+37y'<sub>n-2</sub>-9y'<sub>n-3</sub>)/24</li>
 *   <li>...</li>
 * </ul>
 *
 * <p>A k-steps Adams-Bashforth method is of order k.</p>
 *
 * <h3>Implementation details</h3>
 *
 * <p>We define scaled derivatives s<sub>i</sub>(n) at step n as:
 * <pre>
 * s<sub>1</sub>(n) = h y'<sub>n</sub> for first derivative
 * s<sub>2</sub>(n) = h<sup>2</sup>/2 y''<sub>n</sub> for second derivative
 * s<sub>3</sub>(n) = h<sup>3</sup>/6 y'''<sub>n</sub> for third derivative
 * ...
 * s<sub>k</sub>(n) = h<sup>k</sup>/k! y<sup>(k)</sup><sub>n</sub> for k<sup>th</sup> derivative
 * </pre></p>
 *
 * <p>The definitions above use the classical representation with several previous first
 * derivatives. Lets define
 * <pre>
 *   q<sub>n</sub> = [ s<sub>1</sub>(n-1) s<sub>1</sub>(n-2) ... s<sub>1</sub>(n-(k-1)) ]<sup>T</sup>
 * </pre>
 * (we omit the k index in the notation for clarity). With these definitions,
 * Adams-Bashforth methods can be written:
 * <ul>
 *   <li>k = 1: y<sub>n+1</sub> = y<sub>n</sub> + s<sub>1</sub>(n)</li>
 *   <li>k = 2: y<sub>n+1</sub> = y<sub>n</sub> + 3/2 s<sub>1</sub>(n) + [ -1/2 ] q<sub>n</sub></li>
 *   <li>k = 3: y<sub>n+1</sub> = y<sub>n</sub> + 23/12 s<sub>1</sub>(n) + [ -16/12 5/12 ] q<sub>n</sub></li>
 *   <li>k = 4: y<sub>n+1</sub> = y<sub>n</sub> + 55/24 s<sub>1</sub>(n) + [ -59/24 37/24 -9/24 ] q<sub>n</sub></li>
 *   <li>...</li>
 * </ul></p>
 *
 * <p>Instead of using the classical representation with first derivatives only (y<sub>n</sub>,
 * s<sub>1</sub>(n) and q<sub>n</sub>), our implementation uses the Nordsieck vector with
 * higher degrees scaled derivatives all taken at the same step (y<sub>n</sub>, s<sub>1</sub>(n)
 * and r<sub>n</sub>) where r<sub>n</sub> is defined as:
 * <pre>
 * r<sub>n</sub> = [ s<sub>2</sub>(n), s<sub>3</sub>(n) ... s<sub>k</sub>(n) ]<sup>T</sup>
 * </pre>
 * (here again we omit the k index in the notation for clarity)
 * </p>
 *
 * <p>Taylor series formulas show that for any index offset i, s<sub>1</sub>(n-i) can be
 * computed from s<sub>1</sub>(n), s<sub>2</sub>(n) ... s<sub>k</sub>(n), the formula being exact
 * for degree k polynomials.
 * <pre>
 * s<sub>1</sub>(n-i) = s<sub>1</sub>(n) + &sum;<sub>j</sub> j (-i)<sup>j-1</sup> s<sub>j</sub>(n)
 * </pre>
 * The previous formula can be used with several values for i to compute the transform between
 * classical representation and Nordsieck vector. The transform between r<sub>n</sub>
 * and q<sub>n</sub> resulting from the Taylor series formulas above is:
 * <pre>
 * q<sub>n</sub> = s<sub>1</sub>(n) u + P r<sub>n</sub>
 * </pre>
 * where u is the [ 1 1 ... 1 ]<sup>T</sup> vector and P is the (k-1)&times;(k-1) matrix built
 * with the j (-i)<sup>j-1</sup> terms:
 * <pre>
 *        [  -2   3   -4    5  ... ]
 *        [  -4  12  -32   80  ... ]
 *   P =  [  -6  27 -108  405  ... ]
 *        [  -8  48 -256 1280  ... ]
 *        [          ...           ]
 * </pre></p>
 *
 * <p>Using the Nordsieck vector has several advantages:
 * <ul>
 *   <li>it greatly simplifies step interpolation as the interpolator mainly applies
 *   Taylor series formulas,</li>
 *   <li>it simplifies step changes that occur when discrete events that truncate
 *   the step are triggered,</li>
 *   <li>it allows to extend the methods in order to support adaptive stepsize.</li>
 * </ul></p>
 *
 * <p>The Nordsieck vector at step n+1 is computed from the Nordsieck vector at step n as follows:
 * <ul>
 *   <li>y<sub>n+1</sub> = y<sub>n</sub> + s<sub>1</sub>(n) + u<sup>T</sup> r<sub>n</sub></li>
 *   <li>s<sub>1</sub>(n+1) = h f(t<sub>n+1</sub>, y<sub>n+1</sub>)</li>
 *   <li>r<sub>n+1</sub> = (s<sub>1</sub>(n) - s<sub>1</sub>(n+1)) P<sup>-1</sup> u + P<sup>-1</sup> A P r<sub>n</sub></li>
 * </ul>
 * where A is a rows shifting matrix (the lower left part is an identity matrix):
 * <pre>
 *        [ 0 0   ...  0 0 | 0 ]
 *        [ ---------------+---]
 *        [ 1 0   ...  0 0 | 0 ]
 *    A = [ 0 1   ...  0 0 | 0 ]
 *        [       ...      | 0 ]
 *        [ 0 0   ...  1 0 | 0 ]
 *        [ 0 0   ...  0 1 | 0 ]
 * </pre></p>
 *
 * <p>The P<sup>-1</sup>u vector and the P<sup>-1</sup> A P matrix do not depend on the state,
 * they only depend on k and therefore are precomputed once for all.</p>
 *
 * @version $Id$
 * @since 2.0
 */
public class AdamsBashforthIntegrator extends AdamsIntegrator {public static class __CLR4_4_1phfphflb90p9da{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,33125,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Integrator method name. */
    private static final String METHOD_NAME = "Adams-Bashforth";

    /**
     * Build an Adams-Bashforth integrator with the given order and step control parameters.
     * @param nSteps number of steps of the method excluding the one being computed
     * @param minStep minimal step (sign is irrelevant, regardless of
     * integration direction, forward or backward), the last step can
     * be smaller than this
     * @param maxStep maximal step (sign is irrelevant, regardless of
     * integration direction, forward or backward), the last step can
     * be smaller than this
     * @param scalAbsoluteTolerance allowed absolute error
     * @param scalRelativeTolerance allowed relative error
     * @exception NumberIsTooSmallException if order is 1 or less
     */
    public AdamsBashforthIntegrator(final int nSteps,
                                    final double minStep, final double maxStep,
                                    final double scalAbsoluteTolerance,
                                    final double scalRelativeTolerance)
        throws NumberIsTooSmallException {
        super(METHOD_NAME, nSteps, nSteps, minStep, maxStep,
              scalAbsoluteTolerance, scalRelativeTolerance);__CLR4_4_1phfphflb90p9da.R.inc(33028);try{__CLR4_4_1phfphflb90p9da.R.inc(33027);
    }finally{__CLR4_4_1phfphflb90p9da.R.flushNeeded();}}

    /**
     * Build an Adams-Bashforth integrator with the given order and step control parameters.
     * @param nSteps number of steps of the method excluding the one being computed
     * @param minStep minimal step (sign is irrelevant, regardless of
     * integration direction, forward or backward), the last step can
     * be smaller than this
     * @param maxStep maximal step (sign is irrelevant, regardless of
     * integration direction, forward or backward), the last step can
     * be smaller than this
     * @param vecAbsoluteTolerance allowed absolute error
     * @param vecRelativeTolerance allowed relative error
     * @exception IllegalArgumentException if order is 1 or less
     */
    public AdamsBashforthIntegrator(final int nSteps,
                                    final double minStep, final double maxStep,
                                    final double[] vecAbsoluteTolerance,
                                    final double[] vecRelativeTolerance)
        throws IllegalArgumentException {
        super(METHOD_NAME, nSteps, nSteps, minStep, maxStep,
              vecAbsoluteTolerance, vecRelativeTolerance);__CLR4_4_1phfphflb90p9da.R.inc(33030);try{__CLR4_4_1phfphflb90p9da.R.inc(33029);
    }finally{__CLR4_4_1phfphflb90p9da.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void integrate(final ExpandableStatefulODE equations, final double t)
        throws NumberIsTooSmallException, DimensionMismatchException,
               MaxCountExceededException, NoBracketingException {try{__CLR4_4_1phfphflb90p9da.R.inc(33031);

        __CLR4_4_1phfphflb90p9da.R.inc(33032);sanityChecks(equations, t);
        __CLR4_4_1phfphflb90p9da.R.inc(33033);setEquations(equations);
        __CLR4_4_1phfphflb90p9da.R.inc(33034);final boolean forward = t > equations.getTime();

        // initialize working arrays
        __CLR4_4_1phfphflb90p9da.R.inc(33035);final double[] y0   = equations.getCompleteState();
        __CLR4_4_1phfphflb90p9da.R.inc(33036);final double[] y    = y0.clone();
        __CLR4_4_1phfphflb90p9da.R.inc(33037);final double[] yDot = new double[y.length];

        // set up an interpolator sharing the integrator arrays
        __CLR4_4_1phfphflb90p9da.R.inc(33038);final NordsieckStepInterpolator interpolator = new NordsieckStepInterpolator();
        __CLR4_4_1phfphflb90p9da.R.inc(33039);interpolator.reinitialize(y, forward,
                                  equations.getPrimaryMapper(), equations.getSecondaryMappers());

        // set up integration control objects
        __CLR4_4_1phfphflb90p9da.R.inc(33040);initIntegration(equations.getTime(), y0, t);

        // compute the initial Nordsieck vector using the configured starter integrator
        __CLR4_4_1phfphflb90p9da.R.inc(33041);start(equations.getTime(), y, t);
        __CLR4_4_1phfphflb90p9da.R.inc(33042);interpolator.reinitialize(stepStart, stepSize, scaled, nordsieck);
        __CLR4_4_1phfphflb90p9da.R.inc(33043);interpolator.storeTime(stepStart);
        __CLR4_4_1phfphflb90p9da.R.inc(33044);final int lastRow = nordsieck.getRowDimension() - 1;

        // reuse the step that was chosen by the starter integrator
        __CLR4_4_1phfphflb90p9da.R.inc(33045);double hNew = stepSize;
        __CLR4_4_1phfphflb90p9da.R.inc(33046);interpolator.rescale(hNew);

        // main integration loop
        __CLR4_4_1phfphflb90p9da.R.inc(33047);isLastStep = false;
        __CLR4_4_1phfphflb90p9da.R.inc(33048);do {{

            __CLR4_4_1phfphflb90p9da.R.inc(33049);double error = 10;
            __CLR4_4_1phfphflb90p9da.R.inc(33050);while ((((error >= 1.0)&&(__CLR4_4_1phfphflb90p9da.R.iget(33051)!=0|true))||(__CLR4_4_1phfphflb90p9da.R.iget(33052)==0&false))) {{

                __CLR4_4_1phfphflb90p9da.R.inc(33053);stepSize = hNew;

                // evaluate error using the last term of the Taylor expansion
                __CLR4_4_1phfphflb90p9da.R.inc(33054);error = 0;
                __CLR4_4_1phfphflb90p9da.R.inc(33055);for (int i = 0; (((i < mainSetDimension)&&(__CLR4_4_1phfphflb90p9da.R.iget(33056)!=0|true))||(__CLR4_4_1phfphflb90p9da.R.iget(33057)==0&false)); ++i) {{
                    __CLR4_4_1phfphflb90p9da.R.inc(33058);final double yScale = FastMath.abs(y[i]);
                    __CLR4_4_1phfphflb90p9da.R.inc(33059);final double tol = ((((vecAbsoluteTolerance == null) )&&(__CLR4_4_1phfphflb90p9da.R.iget(33060)!=0|true))||(__CLR4_4_1phfphflb90p9da.R.iget(33061)==0&false))?
                                       (scalAbsoluteTolerance + scalRelativeTolerance * yScale) :
                                       (vecAbsoluteTolerance[i] + vecRelativeTolerance[i] * yScale);
                    __CLR4_4_1phfphflb90p9da.R.inc(33062);final double ratio  = nordsieck.getEntry(lastRow, i) / tol;
                    __CLR4_4_1phfphflb90p9da.R.inc(33063);error += ratio * ratio;
                }
                }__CLR4_4_1phfphflb90p9da.R.inc(33064);error = FastMath.sqrt(error / mainSetDimension);

                __CLR4_4_1phfphflb90p9da.R.inc(33065);if ((((error >= 1.0)&&(__CLR4_4_1phfphflb90p9da.R.iget(33066)!=0|true))||(__CLR4_4_1phfphflb90p9da.R.iget(33067)==0&false))) {{
                    // reject the step and attempt to reduce error by stepsize control
                    __CLR4_4_1phfphflb90p9da.R.inc(33068);final double factor = computeStepGrowShrinkFactor(error);
                    __CLR4_4_1phfphflb90p9da.R.inc(33069);hNew = filterStep(stepSize * factor, forward, false);
                    __CLR4_4_1phfphflb90p9da.R.inc(33070);interpolator.rescale(hNew);

                }
            }}

            // predict a first estimate of the state at step end
            }__CLR4_4_1phfphflb90p9da.R.inc(33071);final double stepEnd = stepStart + stepSize;
            __CLR4_4_1phfphflb90p9da.R.inc(33072);interpolator.shift();
            __CLR4_4_1phfphflb90p9da.R.inc(33073);interpolator.setInterpolatedTime(stepEnd);
            __CLR4_4_1phfphflb90p9da.R.inc(33074);final ExpandableStatefulODE expandable = getExpandable();
            __CLR4_4_1phfphflb90p9da.R.inc(33075);final EquationsMapper primary = expandable.getPrimaryMapper();
            __CLR4_4_1phfphflb90p9da.R.inc(33076);primary.insertEquationData(interpolator.getInterpolatedState(), y);
            __CLR4_4_1phfphflb90p9da.R.inc(33077);int index = 0;
            __CLR4_4_1phfphflb90p9da.R.inc(33078);for (final EquationsMapper secondary : expandable.getSecondaryMappers()) {{
                __CLR4_4_1phfphflb90p9da.R.inc(33079);secondary.insertEquationData(interpolator.getInterpolatedSecondaryState(index), y);
                __CLR4_4_1phfphflb90p9da.R.inc(33080);++index;
            }

            // evaluate the derivative
            }__CLR4_4_1phfphflb90p9da.R.inc(33081);computeDerivatives(stepEnd, y, yDot);

            // update Nordsieck vector
            __CLR4_4_1phfphflb90p9da.R.inc(33082);final double[] predictedScaled = new double[y0.length];
            __CLR4_4_1phfphflb90p9da.R.inc(33083);for (int j = 0; (((j < y0.length)&&(__CLR4_4_1phfphflb90p9da.R.iget(33084)!=0|true))||(__CLR4_4_1phfphflb90p9da.R.iget(33085)==0&false)); ++j) {{
                __CLR4_4_1phfphflb90p9da.R.inc(33086);predictedScaled[j] = stepSize * yDot[j];
            }
            }__CLR4_4_1phfphflb90p9da.R.inc(33087);final Array2DRowRealMatrix nordsieckTmp = updateHighOrderDerivativesPhase1(nordsieck);
            __CLR4_4_1phfphflb90p9da.R.inc(33088);updateHighOrderDerivativesPhase2(scaled, predictedScaled, nordsieckTmp);
            __CLR4_4_1phfphflb90p9da.R.inc(33089);interpolator.reinitialize(stepEnd, stepSize, predictedScaled, nordsieckTmp);

            // discrete events handling
            __CLR4_4_1phfphflb90p9da.R.inc(33090);interpolator.storeTime(stepEnd);
            __CLR4_4_1phfphflb90p9da.R.inc(33091);stepStart = acceptStep(interpolator, y, yDot, t);
            __CLR4_4_1phfphflb90p9da.R.inc(33092);scaled    = predictedScaled;
            __CLR4_4_1phfphflb90p9da.R.inc(33093);nordsieck = nordsieckTmp;
            __CLR4_4_1phfphflb90p9da.R.inc(33094);interpolator.reinitialize(stepEnd, stepSize, scaled, nordsieck);

            __CLR4_4_1phfphflb90p9da.R.inc(33095);if ((((!isLastStep)&&(__CLR4_4_1phfphflb90p9da.R.iget(33096)!=0|true))||(__CLR4_4_1phfphflb90p9da.R.iget(33097)==0&false))) {{

                // prepare next step
                __CLR4_4_1phfphflb90p9da.R.inc(33098);interpolator.storeTime(stepStart);

                __CLR4_4_1phfphflb90p9da.R.inc(33099);if ((((resetOccurred)&&(__CLR4_4_1phfphflb90p9da.R.iget(33100)!=0|true))||(__CLR4_4_1phfphflb90p9da.R.iget(33101)==0&false))) {{
                    // some events handler has triggered changes that
                    // invalidate the derivatives, we need to restart from scratch
                    __CLR4_4_1phfphflb90p9da.R.inc(33102);start(stepStart, y, t);
                    __CLR4_4_1phfphflb90p9da.R.inc(33103);interpolator.reinitialize(stepStart, stepSize, scaled, nordsieck);
                }

                // stepsize control for next step
                }__CLR4_4_1phfphflb90p9da.R.inc(33104);final double  factor     = computeStepGrowShrinkFactor(error);
                __CLR4_4_1phfphflb90p9da.R.inc(33105);final double  scaledH    = stepSize * factor;
                __CLR4_4_1phfphflb90p9da.R.inc(33106);final double  nextT      = stepStart + scaledH;
                __CLR4_4_1phfphflb90p9da.R.inc(33107);final boolean nextIsLast = (((forward )&&(__CLR4_4_1phfphflb90p9da.R.iget(33108)!=0|true))||(__CLR4_4_1phfphflb90p9da.R.iget(33109)==0&false))? (nextT >= t) : (nextT <= t);
                __CLR4_4_1phfphflb90p9da.R.inc(33110);hNew = filterStep(scaledH, forward, nextIsLast);

                __CLR4_4_1phfphflb90p9da.R.inc(33111);final double  filteredNextT      = stepStart + hNew;
                __CLR4_4_1phfphflb90p9da.R.inc(33112);final boolean filteredNextIsLast = (((forward )&&(__CLR4_4_1phfphflb90p9da.R.iget(33113)!=0|true))||(__CLR4_4_1phfphflb90p9da.R.iget(33114)==0&false))? (filteredNextT >= t) : (filteredNextT <= t);
                __CLR4_4_1phfphflb90p9da.R.inc(33115);if ((((filteredNextIsLast)&&(__CLR4_4_1phfphflb90p9da.R.iget(33116)!=0|true))||(__CLR4_4_1phfphflb90p9da.R.iget(33117)==0&false))) {{
                    __CLR4_4_1phfphflb90p9da.R.inc(33118);hNew = t - stepStart;
                }

                }__CLR4_4_1phfphflb90p9da.R.inc(33119);interpolator.rescale(hNew);

            }

        }} }while ((((!isLastStep)&&(__CLR4_4_1phfphflb90p9da.R.iget(33120)!=0|true))||(__CLR4_4_1phfphflb90p9da.R.iget(33121)==0&false)));

        // dispatch results
        __CLR4_4_1phfphflb90p9da.R.inc(33122);equations.setTime(stepStart);
        __CLR4_4_1phfphflb90p9da.R.inc(33123);equations.setCompleteState(y);

        __CLR4_4_1phfphflb90p9da.R.inc(33124);resetInternalState();

    }finally{__CLR4_4_1phfphflb90p9da.R.flushNeeded();}}

}
