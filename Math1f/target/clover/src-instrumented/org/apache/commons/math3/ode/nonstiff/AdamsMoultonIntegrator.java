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

import java.util.Arrays;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.NoBracketingException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrixPreservingVisitor;
import org.apache.commons.math3.ode.EquationsMapper;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator;
import org.apache.commons.math3.util.FastMath;


/**
 * This class implements implicit Adams-Moulton integrators for Ordinary
 * Differential Equations.
 *
 * <p>Adams-Moulton methods (in fact due to Adams alone) are implicit
 * multistep ODE solvers. This implementation is a variation of the classical
 * one: it uses adaptive stepsize to implement error control, whereas
 * classical implementations are fixed step size. The value of state vector
 * at step n+1 is a simple combination of the value at step n and of the
 * derivatives at steps n+1, n, n-1 ... Since y'<sub>n+1</sub> is needed to
 * compute y<sub>n+1</sub>, another method must be used to compute a first
 * estimate of y<sub>n+1</sub>, then compute y'<sub>n+1</sub>, then compute
 * a final estimate of y<sub>n+1</sub> using the following formulas. Depending
 * on the number k of previous steps one wants to use for computing the next
 * value, different formulas are available for the final estimate:</p>
 * <ul>
 *   <li>k = 1: y<sub>n+1</sub> = y<sub>n</sub> + h y'<sub>n+1</sub></li>
 *   <li>k = 2: y<sub>n+1</sub> = y<sub>n</sub> + h (y'<sub>n+1</sub>+y'<sub>n</sub>)/2</li>
 *   <li>k = 3: y<sub>n+1</sub> = y<sub>n</sub> + h (5y'<sub>n+1</sub>+8y'<sub>n</sub>-y'<sub>n-1</sub>)/12</li>
 *   <li>k = 4: y<sub>n+1</sub> = y<sub>n</sub> + h (9y'<sub>n+1</sub>+19y'<sub>n</sub>-5y'<sub>n-1</sub>+y'<sub>n-2</sub>)/24</li>
 *   <li>...</li>
 * </ul>
 *
 * <p>A k-steps Adams-Moulton method is of order k+1.</p>
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
 * Adams-Moulton methods can be written:
 * <ul>
 *   <li>k = 1: y<sub>n+1</sub> = y<sub>n</sub> + s<sub>1</sub>(n+1)</li>
 *   <li>k = 2: y<sub>n+1</sub> = y<sub>n</sub> + 1/2 s<sub>1</sub>(n+1) + [ 1/2 ] q<sub>n+1</sub></li>
 *   <li>k = 3: y<sub>n+1</sub> = y<sub>n</sub> + 5/12 s<sub>1</sub>(n+1) + [ 8/12 -1/12 ] q<sub>n+1</sub></li>
 *   <li>k = 4: y<sub>n+1</sub> = y<sub>n</sub> + 9/24 s<sub>1</sub>(n+1) + [ 19/24 -5/24 1/24 ] q<sub>n+1</sub></li>
 *   <li>...</li>
 * </ul></p>
 *
 * <p>Instead of using the classical representation with first derivatives only (y<sub>n</sub>,
 * s<sub>1</sub>(n+1) and q<sub>n+1</sub>), our implementation uses the Nordsieck vector with
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
 * <p>The predicted Nordsieck vector at step n+1 is computed from the Nordsieck vector at step
 * n as follows:
 * <ul>
 *   <li>Y<sub>n+1</sub> = y<sub>n</sub> + s<sub>1</sub>(n) + u<sup>T</sup> r<sub>n</sub></li>
 *   <li>S<sub>1</sub>(n+1) = h f(t<sub>n+1</sub>, Y<sub>n+1</sub>)</li>
 *   <li>R<sub>n+1</sub> = (s<sub>1</sub>(n) - S<sub>1</sub>(n+1)) P<sup>-1</sup> u + P<sup>-1</sup> A P r<sub>n</sub></li>
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
 * </pre>
 * From this predicted vector, the corrected vector is computed as follows:
 * <ul>
 *   <li>y<sub>n+1</sub> = y<sub>n</sub> + S<sub>1</sub>(n+1) + [ -1 +1 -1 +1 ... &plusmn;1 ] r<sub>n+1</sub></li>
 *   <li>s<sub>1</sub>(n+1) = h f(t<sub>n+1</sub>, y<sub>n+1</sub>)</li>
 *   <li>r<sub>n+1</sub> = R<sub>n+1</sub> + (s<sub>1</sub>(n+1) - S<sub>1</sub>(n+1)) P<sup>-1</sup> u</li>
 * </ul>
 * where the upper case Y<sub>n+1</sub>, S<sub>1</sub>(n+1) and R<sub>n+1</sub> represent the
 * predicted states whereas the lower case y<sub>n+1</sub>, s<sub>n+1</sub> and r<sub>n+1</sub>
 * represent the corrected states.</p>
 *
 * <p>The P<sup>-1</sup>u vector and the P<sup>-1</sup> A P matrix do not depend on the state,
 * they only depend on k and therefore are precomputed once for all.</p>
 *
 * @version $Id$
 * @since 2.0
 */
public class AdamsMoultonIntegrator extends AdamsIntegrator {public static class __CLR4_4_1pkhpkhlb90p9dr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,33264,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Integrator method name. */
    private static final String METHOD_NAME = "Adams-Moulton";

    /**
     * Build an Adams-Moulton integrator with the given order and error control parameters.
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
    public AdamsMoultonIntegrator(final int nSteps,
                                  final double minStep, final double maxStep,
                                  final double scalAbsoluteTolerance,
                                  final double scalRelativeTolerance)
        throws NumberIsTooSmallException {
        super(METHOD_NAME, nSteps, nSteps + 1, minStep, maxStep,
              scalAbsoluteTolerance, scalRelativeTolerance);__CLR4_4_1pkhpkhlb90p9dr.R.inc(33138);try{__CLR4_4_1pkhpkhlb90p9dr.R.inc(33137);
    }finally{__CLR4_4_1pkhpkhlb90p9dr.R.flushNeeded();}}

    /**
     * Build an Adams-Moulton integrator with the given order and error control parameters.
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
    public AdamsMoultonIntegrator(final int nSteps,
                                  final double minStep, final double maxStep,
                                  final double[] vecAbsoluteTolerance,
                                  final double[] vecRelativeTolerance)
        throws IllegalArgumentException {
        super(METHOD_NAME, nSteps, nSteps + 1, minStep, maxStep,
              vecAbsoluteTolerance, vecRelativeTolerance);__CLR4_4_1pkhpkhlb90p9dr.R.inc(33140);try{__CLR4_4_1pkhpkhlb90p9dr.R.inc(33139);
    }finally{__CLR4_4_1pkhpkhlb90p9dr.R.flushNeeded();}}


    /** {@inheritDoc} */
    @Override
    public void integrate(final ExpandableStatefulODE equations,final double t)
        throws NumberIsTooSmallException, DimensionMismatchException,
               MaxCountExceededException, NoBracketingException {try{__CLR4_4_1pkhpkhlb90p9dr.R.inc(33141);

        __CLR4_4_1pkhpkhlb90p9dr.R.inc(33142);sanityChecks(equations, t);
        __CLR4_4_1pkhpkhlb90p9dr.R.inc(33143);setEquations(equations);
        __CLR4_4_1pkhpkhlb90p9dr.R.inc(33144);final boolean forward = t > equations.getTime();

        // initialize working arrays
        __CLR4_4_1pkhpkhlb90p9dr.R.inc(33145);final double[] y0   = equations.getCompleteState();
        __CLR4_4_1pkhpkhlb90p9dr.R.inc(33146);final double[] y    = y0.clone();
        __CLR4_4_1pkhpkhlb90p9dr.R.inc(33147);final double[] yDot = new double[y.length];
        __CLR4_4_1pkhpkhlb90p9dr.R.inc(33148);final double[] yTmp = new double[y.length];
        __CLR4_4_1pkhpkhlb90p9dr.R.inc(33149);final double[] predictedScaled = new double[y.length];
        __CLR4_4_1pkhpkhlb90p9dr.R.inc(33150);Array2DRowRealMatrix nordsieckTmp = null;

        // set up two interpolators sharing the integrator arrays
        __CLR4_4_1pkhpkhlb90p9dr.R.inc(33151);final NordsieckStepInterpolator interpolator = new NordsieckStepInterpolator();
        __CLR4_4_1pkhpkhlb90p9dr.R.inc(33152);interpolator.reinitialize(y, forward,
                                  equations.getPrimaryMapper(), equations.getSecondaryMappers());

        // set up integration control objects
        __CLR4_4_1pkhpkhlb90p9dr.R.inc(33153);initIntegration(equations.getTime(), y0, t);

        // compute the initial Nordsieck vector using the configured starter integrator
        __CLR4_4_1pkhpkhlb90p9dr.R.inc(33154);start(equations.getTime(), y, t);
        __CLR4_4_1pkhpkhlb90p9dr.R.inc(33155);interpolator.reinitialize(stepStart, stepSize, scaled, nordsieck);
        __CLR4_4_1pkhpkhlb90p9dr.R.inc(33156);interpolator.storeTime(stepStart);

        __CLR4_4_1pkhpkhlb90p9dr.R.inc(33157);double hNew = stepSize;
        __CLR4_4_1pkhpkhlb90p9dr.R.inc(33158);interpolator.rescale(hNew);

        __CLR4_4_1pkhpkhlb90p9dr.R.inc(33159);isLastStep = false;
        __CLR4_4_1pkhpkhlb90p9dr.R.inc(33160);do {{

            __CLR4_4_1pkhpkhlb90p9dr.R.inc(33161);double error = 10;
            __CLR4_4_1pkhpkhlb90p9dr.R.inc(33162);while ((((error >= 1.0)&&(__CLR4_4_1pkhpkhlb90p9dr.R.iget(33163)!=0|true))||(__CLR4_4_1pkhpkhlb90p9dr.R.iget(33164)==0&false))) {{

                __CLR4_4_1pkhpkhlb90p9dr.R.inc(33165);stepSize = hNew;

                // predict a first estimate of the state at step end (P in the PECE sequence)
                __CLR4_4_1pkhpkhlb90p9dr.R.inc(33166);final double stepEnd = stepStart + stepSize;
                __CLR4_4_1pkhpkhlb90p9dr.R.inc(33167);interpolator.setInterpolatedTime(stepEnd);
                __CLR4_4_1pkhpkhlb90p9dr.R.inc(33168);final ExpandableStatefulODE expandable = getExpandable();
                __CLR4_4_1pkhpkhlb90p9dr.R.inc(33169);final EquationsMapper primary = expandable.getPrimaryMapper();
                __CLR4_4_1pkhpkhlb90p9dr.R.inc(33170);primary.insertEquationData(interpolator.getInterpolatedState(), yTmp);
                __CLR4_4_1pkhpkhlb90p9dr.R.inc(33171);int index = 0;
                __CLR4_4_1pkhpkhlb90p9dr.R.inc(33172);for (final EquationsMapper secondary : expandable.getSecondaryMappers()) {{
                    __CLR4_4_1pkhpkhlb90p9dr.R.inc(33173);secondary.insertEquationData(interpolator.getInterpolatedSecondaryState(index), yTmp);
                    __CLR4_4_1pkhpkhlb90p9dr.R.inc(33174);++index;
                }

                // evaluate a first estimate of the derivative (first E in the PECE sequence)
                }__CLR4_4_1pkhpkhlb90p9dr.R.inc(33175);computeDerivatives(stepEnd, yTmp, yDot);

                // update Nordsieck vector
                __CLR4_4_1pkhpkhlb90p9dr.R.inc(33176);for (int j = 0; (((j < y0.length)&&(__CLR4_4_1pkhpkhlb90p9dr.R.iget(33177)!=0|true))||(__CLR4_4_1pkhpkhlb90p9dr.R.iget(33178)==0&false)); ++j) {{
                    __CLR4_4_1pkhpkhlb90p9dr.R.inc(33179);predictedScaled[j] = stepSize * yDot[j];
                }
                }__CLR4_4_1pkhpkhlb90p9dr.R.inc(33180);nordsieckTmp = updateHighOrderDerivativesPhase1(nordsieck);
                __CLR4_4_1pkhpkhlb90p9dr.R.inc(33181);updateHighOrderDerivativesPhase2(scaled, predictedScaled, nordsieckTmp);

                // apply correction (C in the PECE sequence)
                __CLR4_4_1pkhpkhlb90p9dr.R.inc(33182);error = nordsieckTmp.walkInOptimizedOrder(new Corrector(y, predictedScaled, yTmp));

                __CLR4_4_1pkhpkhlb90p9dr.R.inc(33183);if ((((error >= 1.0)&&(__CLR4_4_1pkhpkhlb90p9dr.R.iget(33184)!=0|true))||(__CLR4_4_1pkhpkhlb90p9dr.R.iget(33185)==0&false))) {{
                    // reject the step and attempt to reduce error by stepsize control
                    __CLR4_4_1pkhpkhlb90p9dr.R.inc(33186);final double factor = computeStepGrowShrinkFactor(error);
                    __CLR4_4_1pkhpkhlb90p9dr.R.inc(33187);hNew = filterStep(stepSize * factor, forward, false);
                    __CLR4_4_1pkhpkhlb90p9dr.R.inc(33188);interpolator.rescale(hNew);
                }
            }}

            // evaluate a final estimate of the derivative (second E in the PECE sequence)
            }__CLR4_4_1pkhpkhlb90p9dr.R.inc(33189);final double stepEnd = stepStart + stepSize;
            __CLR4_4_1pkhpkhlb90p9dr.R.inc(33190);computeDerivatives(stepEnd, yTmp, yDot);

            // update Nordsieck vector
            __CLR4_4_1pkhpkhlb90p9dr.R.inc(33191);final double[] correctedScaled = new double[y0.length];
            __CLR4_4_1pkhpkhlb90p9dr.R.inc(33192);for (int j = 0; (((j < y0.length)&&(__CLR4_4_1pkhpkhlb90p9dr.R.iget(33193)!=0|true))||(__CLR4_4_1pkhpkhlb90p9dr.R.iget(33194)==0&false)); ++j) {{
                __CLR4_4_1pkhpkhlb90p9dr.R.inc(33195);correctedScaled[j] = stepSize * yDot[j];
            }
            }__CLR4_4_1pkhpkhlb90p9dr.R.inc(33196);updateHighOrderDerivativesPhase2(predictedScaled, correctedScaled, nordsieckTmp);

            // discrete events handling
            __CLR4_4_1pkhpkhlb90p9dr.R.inc(33197);System.arraycopy(yTmp, 0, y, 0, y.length);
            __CLR4_4_1pkhpkhlb90p9dr.R.inc(33198);interpolator.reinitialize(stepEnd, stepSize, correctedScaled, nordsieckTmp);
            __CLR4_4_1pkhpkhlb90p9dr.R.inc(33199);interpolator.storeTime(stepStart);
            __CLR4_4_1pkhpkhlb90p9dr.R.inc(33200);interpolator.shift();
            __CLR4_4_1pkhpkhlb90p9dr.R.inc(33201);interpolator.storeTime(stepEnd);
            __CLR4_4_1pkhpkhlb90p9dr.R.inc(33202);stepStart = acceptStep(interpolator, y, yDot, t);
            __CLR4_4_1pkhpkhlb90p9dr.R.inc(33203);scaled    = correctedScaled;
            __CLR4_4_1pkhpkhlb90p9dr.R.inc(33204);nordsieck = nordsieckTmp;

            __CLR4_4_1pkhpkhlb90p9dr.R.inc(33205);if ((((!isLastStep)&&(__CLR4_4_1pkhpkhlb90p9dr.R.iget(33206)!=0|true))||(__CLR4_4_1pkhpkhlb90p9dr.R.iget(33207)==0&false))) {{

                // prepare next step
                __CLR4_4_1pkhpkhlb90p9dr.R.inc(33208);interpolator.storeTime(stepStart);

                __CLR4_4_1pkhpkhlb90p9dr.R.inc(33209);if ((((resetOccurred)&&(__CLR4_4_1pkhpkhlb90p9dr.R.iget(33210)!=0|true))||(__CLR4_4_1pkhpkhlb90p9dr.R.iget(33211)==0&false))) {{
                    // some events handler has triggered changes that
                    // invalidate the derivatives, we need to restart from scratch
                    __CLR4_4_1pkhpkhlb90p9dr.R.inc(33212);start(stepStart, y, t);
                    __CLR4_4_1pkhpkhlb90p9dr.R.inc(33213);interpolator.reinitialize(stepStart, stepSize, scaled, nordsieck);

                }

                // stepsize control for next step
                }__CLR4_4_1pkhpkhlb90p9dr.R.inc(33214);final double  factor     = computeStepGrowShrinkFactor(error);
                __CLR4_4_1pkhpkhlb90p9dr.R.inc(33215);final double  scaledH    = stepSize * factor;
                __CLR4_4_1pkhpkhlb90p9dr.R.inc(33216);final double  nextT      = stepStart + scaledH;
                __CLR4_4_1pkhpkhlb90p9dr.R.inc(33217);final boolean nextIsLast = (((forward )&&(__CLR4_4_1pkhpkhlb90p9dr.R.iget(33218)!=0|true))||(__CLR4_4_1pkhpkhlb90p9dr.R.iget(33219)==0&false))? (nextT >= t) : (nextT <= t);
                __CLR4_4_1pkhpkhlb90p9dr.R.inc(33220);hNew = filterStep(scaledH, forward, nextIsLast);

                __CLR4_4_1pkhpkhlb90p9dr.R.inc(33221);final double  filteredNextT      = stepStart + hNew;
                __CLR4_4_1pkhpkhlb90p9dr.R.inc(33222);final boolean filteredNextIsLast = (((forward )&&(__CLR4_4_1pkhpkhlb90p9dr.R.iget(33223)!=0|true))||(__CLR4_4_1pkhpkhlb90p9dr.R.iget(33224)==0&false))? (filteredNextT >= t) : (filteredNextT <= t);
                __CLR4_4_1pkhpkhlb90p9dr.R.inc(33225);if ((((filteredNextIsLast)&&(__CLR4_4_1pkhpkhlb90p9dr.R.iget(33226)!=0|true))||(__CLR4_4_1pkhpkhlb90p9dr.R.iget(33227)==0&false))) {{
                    __CLR4_4_1pkhpkhlb90p9dr.R.inc(33228);hNew = t - stepStart;
                }

                }__CLR4_4_1pkhpkhlb90p9dr.R.inc(33229);interpolator.rescale(hNew);
            }

        }} }while ((((!isLastStep)&&(__CLR4_4_1pkhpkhlb90p9dr.R.iget(33230)!=0|true))||(__CLR4_4_1pkhpkhlb90p9dr.R.iget(33231)==0&false)));

        // dispatch results
        __CLR4_4_1pkhpkhlb90p9dr.R.inc(33232);equations.setTime(stepStart);
        __CLR4_4_1pkhpkhlb90p9dr.R.inc(33233);equations.setCompleteState(y);

        __CLR4_4_1pkhpkhlb90p9dr.R.inc(33234);resetInternalState();

    }finally{__CLR4_4_1pkhpkhlb90p9dr.R.flushNeeded();}}

    /** Corrector for current state in Adams-Moulton method.
     * <p>
     * This visitor implements the Taylor series formula:
     * <pre>
     * Y<sub>n+1</sub> = y<sub>n</sub> + s<sub>1</sub>(n+1) + [ -1 +1 -1 +1 ... &plusmn;1 ] r<sub>n+1</sub>
     * </pre>
     * </p>
     */
    private class Corrector implements RealMatrixPreservingVisitor {

        /** Previous state. */
        private final double[] previous;

        /** Current scaled first derivative. */
        private final double[] scaled;

        /** Current state before correction. */
        private final double[] before;

        /** Current state after correction. */
        private final double[] after;

        /** Simple constructor.
         * @param previous previous state
         * @param scaled current scaled first derivative
         * @param state state to correct (will be overwritten after visit)
         */
        public Corrector(final double[] previous, final double[] scaled, final double[] state) {try{__CLR4_4_1pkhpkhlb90p9dr.R.inc(33235);
            __CLR4_4_1pkhpkhlb90p9dr.R.inc(33236);this.previous = previous;
            __CLR4_4_1pkhpkhlb90p9dr.R.inc(33237);this.scaled   = scaled;
            __CLR4_4_1pkhpkhlb90p9dr.R.inc(33238);this.after    = state;
            __CLR4_4_1pkhpkhlb90p9dr.R.inc(33239);this.before   = state.clone();
        }finally{__CLR4_4_1pkhpkhlb90p9dr.R.flushNeeded();}}

        /** {@inheritDoc} */
        public void start(int rows, int columns,
                          int startRow, int endRow, int startColumn, int endColumn) {try{__CLR4_4_1pkhpkhlb90p9dr.R.inc(33240);
            __CLR4_4_1pkhpkhlb90p9dr.R.inc(33241);Arrays.fill(after, 0.0);
        }finally{__CLR4_4_1pkhpkhlb90p9dr.R.flushNeeded();}}

        /** {@inheritDoc} */
        public void visit(int row, int column, double value) {try{__CLR4_4_1pkhpkhlb90p9dr.R.inc(33242);
            __CLR4_4_1pkhpkhlb90p9dr.R.inc(33243);if (((((row & 0x1) == 0)&&(__CLR4_4_1pkhpkhlb90p9dr.R.iget(33244)!=0|true))||(__CLR4_4_1pkhpkhlb90p9dr.R.iget(33245)==0&false))) {{
                __CLR4_4_1pkhpkhlb90p9dr.R.inc(33246);after[column] -= value;
            } }else {{
                __CLR4_4_1pkhpkhlb90p9dr.R.inc(33247);after[column] += value;
            }
        }}finally{__CLR4_4_1pkhpkhlb90p9dr.R.flushNeeded();}}

        /**
         * End visiting the Nordsieck vector.
         * <p>The correction is used to control stepsize. So its amplitude is
         * considered to be an error, which must be normalized according to
         * error control settings. If the normalized value is greater than 1,
         * the correction was too large and the step must be rejected.</p>
         * @return the normalized correction, if greater than 1, the step
         * must be rejected
         */
        public double end() {try{__CLR4_4_1pkhpkhlb90p9dr.R.inc(33248);

            __CLR4_4_1pkhpkhlb90p9dr.R.inc(33249);double error = 0;
            __CLR4_4_1pkhpkhlb90p9dr.R.inc(33250);for (int i = 0; (((i < after.length)&&(__CLR4_4_1pkhpkhlb90p9dr.R.iget(33251)!=0|true))||(__CLR4_4_1pkhpkhlb90p9dr.R.iget(33252)==0&false)); ++i) {{
                __CLR4_4_1pkhpkhlb90p9dr.R.inc(33253);after[i] += previous[i] + scaled[i];
                __CLR4_4_1pkhpkhlb90p9dr.R.inc(33254);if ((((i < mainSetDimension)&&(__CLR4_4_1pkhpkhlb90p9dr.R.iget(33255)!=0|true))||(__CLR4_4_1pkhpkhlb90p9dr.R.iget(33256)==0&false))) {{
                    __CLR4_4_1pkhpkhlb90p9dr.R.inc(33257);final double yScale = FastMath.max(FastMath.abs(previous[i]), FastMath.abs(after[i]));
                    __CLR4_4_1pkhpkhlb90p9dr.R.inc(33258);final double tol = ((((vecAbsoluteTolerance == null) )&&(__CLR4_4_1pkhpkhlb90p9dr.R.iget(33259)!=0|true))||(__CLR4_4_1pkhpkhlb90p9dr.R.iget(33260)==0&false))?
                                       (scalAbsoluteTolerance + scalRelativeTolerance * yScale) :
                                       (vecAbsoluteTolerance[i] + vecRelativeTolerance[i] * yScale);
                    __CLR4_4_1pkhpkhlb90p9dr.R.inc(33261);final double ratio  = (after[i] - before[i]) / tol;
                    __CLR4_4_1pkhpkhlb90p9dr.R.inc(33262);error += ratio * ratio;
                }
            }}

            }__CLR4_4_1pkhpkhlb90p9dr.R.inc(33263);return FastMath.sqrt(error / mainSetDimension);

        }finally{__CLR4_4_1pkhpkhlb90p9dr.R.flushNeeded();}}
    }

}
