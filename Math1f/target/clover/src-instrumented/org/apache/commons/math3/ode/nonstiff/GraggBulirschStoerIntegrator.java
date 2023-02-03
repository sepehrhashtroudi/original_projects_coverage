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

import org.apache.commons.math3.analysis.solvers.UnivariateSolver;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.NoBracketingException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.ode.sampling.AbstractStepInterpolator;
import org.apache.commons.math3.ode.sampling.StepHandler;
import org.apache.commons.math3.util.FastMath;

/**
 * This class implements a Gragg-Bulirsch-Stoer integrator for
 * Ordinary Differential Equations.
 *
 * <p>The Gragg-Bulirsch-Stoer algorithm is one of the most efficient
 * ones currently available for smooth problems. It uses Richardson
 * extrapolation to estimate what would be the solution if the step
 * size could be decreased down to zero.</p>
 *
 * <p>
 * This method changes both the step size and the order during
 * integration, in order to minimize computation cost. It is
 * particularly well suited when a very high precision is needed. The
 * limit where this method becomes more efficient than high-order
 * embedded Runge-Kutta methods like {@link DormandPrince853Integrator
 * Dormand-Prince 8(5,3)} depends on the problem. Results given in the
 * Hairer, Norsett and Wanner book show for example that this limit
 * occurs for accuracy around 1e-6 when integrating Saltzam-Lorenz
 * equations (the authors note this problem is <i>extremely sensitive
 * to the errors in the first integration steps</i>), and around 1e-11
 * for a two dimensional celestial mechanics problems with seven
 * bodies (pleiades problem, involving quasi-collisions for which
 * <i>automatic step size control is essential</i>).
 * </p>
 *
 * <p>
 * This implementation is basically a reimplementation in Java of the
 * <a
 * href="http://www.unige.ch/math/folks/hairer/prog/nonstiff/odex.f">odex</a>
 * fortran code by E. Hairer and G. Wanner. The redistribution policy
 * for this code is available <a
 * href="http://www.unige.ch/~hairer/prog/licence.txt">here</a>, for
 * convenience, it is reproduced below.</p>
 * </p>
 *
 * <table border="0" width="80%" cellpadding="10" align="center" bgcolor="#E0E0E0">
 * <tr><td>Copyright (c) 2004, Ernst Hairer</td></tr>
 *
 * <tr><td>Redistribution and use in source and binary forms, with or
 * without modification, are permitted provided that the following
 * conditions are met:
 * <ul>
 *  <li>Redistributions of source code must retain the above copyright
 *      notice, this list of conditions and the following disclaimer.</li>
 *  <li>Redistributions in binary form must reproduce the above copyright
 *      notice, this list of conditions and the following disclaimer in the
 *      documentation and/or other materials provided with the distribution.</li>
 * </ul></td></tr>
 *
 * <tr><td><strong>THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND
 * CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING,
 * BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
 * FOR A  PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE REGENTS OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.</strong></td></tr>
 * </table>
 *
 * @version $Id$
 * @since 1.2
 */

@java.lang.SuppressWarnings({"fallthrough"}) public class GraggBulirschStoerIntegrator extends AdaptiveStepsizeIntegrator {public static class __CLR4_4_1q9dq9dlb90p9hs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,34522,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Integrator method name. */
    private static final String METHOD_NAME = "Gragg-Bulirsch-Stoer";

    /** maximal order. */
    private int maxOrder;

    /** step size sequence. */
    private int[] sequence;

    /** overall cost of applying step reduction up to iteration k+1, in number of calls. */
    private int[] costPerStep;

    /** cost per unit step. */
    private double[] costPerTimeUnit;

    /** optimal steps for each order. */
    private double[] optimalStep;

    /** extrapolation coefficients. */
    private double[][] coeff;

    /** stability check enabling parameter. */
    private boolean performTest;

    /** maximal number of checks for each iteration. */
    private int maxChecks;

    /** maximal number of iterations for which checks are performed. */
    private int maxIter;

    /** stepsize reduction factor in case of stability check failure. */
    private double stabilityReduction;

    /** first stepsize control factor. */
    private double stepControl1;

    /** second stepsize control factor. */
    private double stepControl2;

    /** third stepsize control factor. */
    private double stepControl3;

    /** fourth stepsize control factor. */
    private double stepControl4;

    /** first order control factor. */
    private double orderControl1;

    /** second order control factor. */
    private double orderControl2;

    /** use interpolation error in stepsize control. */
    private boolean useInterpolationError;

    /** interpolation order control parameter. */
    private int mudif;

  /** Simple constructor.
   * Build a Gragg-Bulirsch-Stoer integrator with the given step
   * bounds. All tuning parameters are set to their default
   * values. The default step handler does nothing.
   * @param minStep minimal step (sign is irrelevant, regardless of
   * integration direction, forward or backward), the last step can
   * be smaller than this
   * @param maxStep maximal step (sign is irrelevant, regardless of
   * integration direction, forward or backward), the last step can
   * be smaller than this
   * @param scalAbsoluteTolerance allowed absolute error
   * @param scalRelativeTolerance allowed relative error
   */
  public GraggBulirschStoerIntegrator(final double minStep, final double maxStep,
                                      final double scalAbsoluteTolerance,
                                      final double scalRelativeTolerance) {
    super(METHOD_NAME, minStep, maxStep,
          scalAbsoluteTolerance, scalRelativeTolerance);__CLR4_4_1q9dq9dlb90p9hs.R.inc(34034);try{__CLR4_4_1q9dq9dlb90p9hs.R.inc(34033);
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34035);setStabilityCheck(true, -1, -1, -1);
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34036);setControlFactors(-1, -1, -1, -1);
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34037);setOrderControl(-1, -1, -1);
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34038);setInterpolationControl(true, -1);
  }finally{__CLR4_4_1q9dq9dlb90p9hs.R.flushNeeded();}}

  /** Simple constructor.
   * Build a Gragg-Bulirsch-Stoer integrator with the given step
   * bounds. All tuning parameters are set to their default
   * values. The default step handler does nothing.
   * @param minStep minimal step (must be positive even for backward
   * integration), the last step can be smaller than this
   * @param maxStep maximal step (must be positive even for backward
   * integration)
   * @param vecAbsoluteTolerance allowed absolute error
   * @param vecRelativeTolerance allowed relative error
   */
  public GraggBulirschStoerIntegrator(final double minStep, final double maxStep,
                                      final double[] vecAbsoluteTolerance,
                                      final double[] vecRelativeTolerance) {
    super(METHOD_NAME, minStep, maxStep,
          vecAbsoluteTolerance, vecRelativeTolerance);__CLR4_4_1q9dq9dlb90p9hs.R.inc(34040);try{__CLR4_4_1q9dq9dlb90p9hs.R.inc(34039);
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34041);setStabilityCheck(true, -1, -1, -1);
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34042);setControlFactors(-1, -1, -1, -1);
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34043);setOrderControl(-1, -1, -1);
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34044);setInterpolationControl(true, -1);
  }finally{__CLR4_4_1q9dq9dlb90p9hs.R.flushNeeded();}}

  /** Set the stability check controls.
   * <p>The stability check is performed on the first few iterations of
   * the extrapolation scheme. If this test fails, the step is rejected
   * and the stepsize is reduced.</p>
   * <p>By default, the test is performed, at most during two
   * iterations at each step, and at most once for each of these
   * iterations. The default stepsize reduction factor is 0.5.</p>
   * @param performStabilityCheck if true, stability check will be performed,
     if false, the check will be skipped
   * @param maxNumIter maximal number of iterations for which checks are
   * performed (the number of iterations is reset to default if negative
   * or null)
   * @param maxNumChecks maximal number of checks for each iteration
   * (the number of checks is reset to default if negative or null)
   * @param stepsizeReductionFactor stepsize reduction factor in case of
   * failure (the factor is reset to default if lower than 0.0001 or
   * greater than 0.9999)
   */
  public void setStabilityCheck(final boolean performStabilityCheck,
                                final int maxNumIter, final int maxNumChecks,
                                final double stepsizeReductionFactor) {try{__CLR4_4_1q9dq9dlb90p9hs.R.inc(34045);

    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34046);this.performTest = performStabilityCheck;
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34047);this.maxIter     = ((((maxNumIter   <= 0) )&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34048)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34049)==0&false))? 2 : maxNumIter;
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34050);this.maxChecks   = ((((maxNumChecks <= 0) )&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34051)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34052)==0&false))? 1 : maxNumChecks;

    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34053);if (((((stepsizeReductionFactor < 0.0001) || (stepsizeReductionFactor > 0.9999))&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34054)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34055)==0&false))) {{
      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34056);this.stabilityReduction = 0.5;
    } }else {{
      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34057);this.stabilityReduction = stepsizeReductionFactor;
    }

  }}finally{__CLR4_4_1q9dq9dlb90p9hs.R.flushNeeded();}}

  /** Set the step size control factors.

   * <p>The new step size hNew is computed from the old one h by:
   * <pre>
   * hNew = h * stepControl2 / (err/stepControl1)^(1/(2k+1))
   * </pre>
   * where err is the scaled error and k the iteration number of the
   * extrapolation scheme (counting from 0). The default values are
   * 0.65 for stepControl1 and 0.94 for stepControl2.</p>
   * <p>The step size is subject to the restriction:
   * <pre>
   * stepControl3^(1/(2k+1))/stepControl4 <= hNew/h <= 1/stepControl3^(1/(2k+1))
   * </pre>
   * The default values are 0.02 for stepControl3 and 4.0 for
   * stepControl4.</p>
   * @param control1 first stepsize control factor (the factor is
   * reset to default if lower than 0.0001 or greater than 0.9999)
   * @param control2 second stepsize control factor (the factor
   * is reset to default if lower than 0.0001 or greater than 0.9999)
   * @param control3 third stepsize control factor (the factor is
   * reset to default if lower than 0.0001 or greater than 0.9999)
   * @param control4 fourth stepsize control factor (the factor
   * is reset to default if lower than 1.0001 or greater than 999.9)
   */
  public void setControlFactors(final double control1, final double control2,
                                final double control3, final double control4) {try{__CLR4_4_1q9dq9dlb90p9hs.R.inc(34058);

    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34059);if (((((control1 < 0.0001) || (control1 > 0.9999))&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34060)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34061)==0&false))) {{
      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34062);this.stepControl1 = 0.65;
    } }else {{
      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34063);this.stepControl1 = control1;
    }

    }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34064);if (((((control2 < 0.0001) || (control2 > 0.9999))&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34065)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34066)==0&false))) {{
      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34067);this.stepControl2 = 0.94;
    } }else {{
      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34068);this.stepControl2 = control2;
    }

    }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34069);if (((((control3 < 0.0001) || (control3 > 0.9999))&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34070)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34071)==0&false))) {{
      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34072);this.stepControl3 = 0.02;
    } }else {{
      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34073);this.stepControl3 = control3;
    }

    }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34074);if (((((control4 < 1.0001) || (control4 > 999.9))&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34075)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34076)==0&false))) {{
      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34077);this.stepControl4 = 4.0;
    } }else {{
      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34078);this.stepControl4 = control4;
    }

  }}finally{__CLR4_4_1q9dq9dlb90p9hs.R.flushNeeded();}}

  /** Set the order control parameters.
   * <p>The Gragg-Bulirsch-Stoer method changes both the step size and
   * the order during integration, in order to minimize computation
   * cost. Each extrapolation step increases the order by 2, so the
   * maximal order that will be used is always even, it is twice the
   * maximal number of columns in the extrapolation table.</p>
   * <pre>
   * order is decreased if w(k-1) <= w(k)   * orderControl1
   * order is increased if w(k)   <= w(k-1) * orderControl2
   * </pre>
   * <p>where w is the table of work per unit step for each order
   * (number of function calls divided by the step length), and k is
   * the current order.</p>
   * <p>The default maximal order after construction is 18 (i.e. the
   * maximal number of columns is 9). The default values are 0.8 for
   * orderControl1 and 0.9 for orderControl2.</p>
   * @param maximalOrder maximal order in the extrapolation table (the
   * maximal order is reset to default if order <= 6 or odd)
   * @param control1 first order control factor (the factor is
   * reset to default if lower than 0.0001 or greater than 0.9999)
   * @param control2 second order control factor (the factor
   * is reset to default if lower than 0.0001 or greater than 0.9999)
   */
  public void setOrderControl(final int maximalOrder,
                              final double control1, final double control2) {try{__CLR4_4_1q9dq9dlb90p9hs.R.inc(34079);

    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34080);if (((((maximalOrder <= 6) || (maximalOrder % 2 != 0))&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34081)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34082)==0&false))) {{
      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34083);this.maxOrder = 18;
    }

    }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34084);if (((((control1 < 0.0001) || (control1 > 0.9999))&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34085)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34086)==0&false))) {{
      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34087);this.orderControl1 = 0.8;
    } }else {{
      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34088);this.orderControl1 = control1;
    }

    }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34089);if (((((control2 < 0.0001) || (control2 > 0.9999))&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34090)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34091)==0&false))) {{
      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34092);this.orderControl2 = 0.9;
    } }else {{
      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34093);this.orderControl2 = control2;
    }

    // reinitialize the arrays
    }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34094);initializeArrays();

  }finally{__CLR4_4_1q9dq9dlb90p9hs.R.flushNeeded();}}

  /** {@inheritDoc} */
  @Override
  public void addStepHandler (final StepHandler handler) {try{__CLR4_4_1q9dq9dlb90p9hs.R.inc(34095);

    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34096);super.addStepHandler(handler);

    // reinitialize the arrays
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34097);initializeArrays();

  }finally{__CLR4_4_1q9dq9dlb90p9hs.R.flushNeeded();}}

  /** {@inheritDoc} */
  @Override
  public void addEventHandler(final EventHandler function,
                              final double maxCheckInterval,
                              final double convergence,
                              final int maxIterationCount,
                              final UnivariateSolver solver) {try{__CLR4_4_1q9dq9dlb90p9hs.R.inc(34098);
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34099);super.addEventHandler(function, maxCheckInterval, convergence,
                          maxIterationCount, solver);

    // reinitialize the arrays
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34100);initializeArrays();

  }finally{__CLR4_4_1q9dq9dlb90p9hs.R.flushNeeded();}}

  /** Initialize the integrator internal arrays. */
  private void initializeArrays() {try{__CLR4_4_1q9dq9dlb90p9hs.R.inc(34101);

    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34102);final int size = maxOrder / 2;

    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34103);if (((((sequence == null) || (sequence.length != size))&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34104)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34105)==0&false))) {{
      // all arrays should be reallocated with the right size
      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34106);sequence        = new int[size];
      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34107);costPerStep     = new int[size];
      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34108);coeff           = new double[size][];
      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34109);costPerTimeUnit = new double[size];
      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34110);optimalStep     = new double[size];
    }

    // step size sequence: 2, 6, 10, 14, ...
    }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34111);for (int k = 0; (((k < size)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34112)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34113)==0&false)); ++k) {{
        __CLR4_4_1q9dq9dlb90p9hs.R.inc(34114);sequence[k] = 4 * k + 2;
    }

    // initialize the order selection cost array
    // (number of function calls for each column of the extrapolation table)
    }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34115);costPerStep[0] = sequence[0] + 1;
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34116);for (int k = 1; (((k < size)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34117)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34118)==0&false)); ++k) {{
      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34119);costPerStep[k] = costPerStep[k-1] + sequence[k];
    }

    // initialize the extrapolation tables
    }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34120);for (int k = 0; (((k < size)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34121)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34122)==0&false)); ++k) {{
      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34123);coeff[k] = ((((k > 0) )&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34124)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34125)==0&false))? new double[k] : null;
      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34126);for (int l = 0; (((l < k)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34127)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34128)==0&false)); ++l) {{
        __CLR4_4_1q9dq9dlb90p9hs.R.inc(34129);final double ratio = ((double) sequence[k]) / sequence[k-l-1];
        __CLR4_4_1q9dq9dlb90p9hs.R.inc(34130);coeff[k][l] = 1.0 / (ratio * ratio - 1.0);
      }
    }}

  }}finally{__CLR4_4_1q9dq9dlb90p9hs.R.flushNeeded();}}

  /** Set the interpolation order control parameter.
   * The interpolation order for dense output is 2k - mudif + 1. The
   * default value for mudif is 4 and the interpolation error is used
   * in stepsize control by default.

   * @param useInterpolationErrorForControl if true, interpolation error is used
   * for stepsize control
   * @param mudifControlParameter interpolation order control parameter (the parameter
   * is reset to default if <= 0 or >= 7)
   */
  public void setInterpolationControl(final boolean useInterpolationErrorForControl,
                                      final int mudifControlParameter) {try{__CLR4_4_1q9dq9dlb90p9hs.R.inc(34131);

    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34132);this.useInterpolationError = useInterpolationErrorForControl;

    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34133);if (((((mudifControlParameter <= 0) || (mudifControlParameter >= 7))&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34134)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34135)==0&false))) {{
      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34136);this.mudif = 4;
    } }else {{
      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34137);this.mudif = mudifControlParameter;
    }

  }}finally{__CLR4_4_1q9dq9dlb90p9hs.R.flushNeeded();}}

  /** Update scaling array.
   * @param y1 first state vector to use for scaling
   * @param y2 second state vector to use for scaling
   * @param scale scaling array to update (can be shorter than state)
   */
  private void rescale(final double[] y1, final double[] y2, final double[] scale) {try{__CLR4_4_1q9dq9dlb90p9hs.R.inc(34138);
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34139);if ((((vecAbsoluteTolerance == null)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34140)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34141)==0&false))) {{
      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34142);for (int i = 0; (((i < scale.length)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34143)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34144)==0&false)); ++i) {{
        __CLR4_4_1q9dq9dlb90p9hs.R.inc(34145);final double yi = FastMath.max(FastMath.abs(y1[i]), FastMath.abs(y2[i]));
        __CLR4_4_1q9dq9dlb90p9hs.R.inc(34146);scale[i] = scalAbsoluteTolerance + scalRelativeTolerance * yi;
      }
    }} }else {{
      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34147);for (int i = 0; (((i < scale.length)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34148)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34149)==0&false)); ++i) {{
        __CLR4_4_1q9dq9dlb90p9hs.R.inc(34150);final double yi = FastMath.max(FastMath.abs(y1[i]), FastMath.abs(y2[i]));
        __CLR4_4_1q9dq9dlb90p9hs.R.inc(34151);scale[i] = vecAbsoluteTolerance[i] + vecRelativeTolerance[i] * yi;
      }
    }}
  }}finally{__CLR4_4_1q9dq9dlb90p9hs.R.flushNeeded();}}

  /** Perform integration over one step using substeps of a modified
   * midpoint method.
   * @param t0 initial time
   * @param y0 initial value of the state vector at t0
   * @param step global step
   * @param k iteration number (from 0 to sequence.length - 1)
   * @param scale scaling array (can be shorter than state)
   * @param f placeholder where to put the state vector derivatives at each substep
   *          (element 0 already contains initial derivative)
   * @param yMiddle placeholder where to put the state vector at the middle of the step
   * @param yEnd placeholder where to put the state vector at the end
   * @param yTmp placeholder for one state vector
   * @return true if computation was done properly,
   *         false if stability check failed before end of computation
   * @exception MaxCountExceededException if the number of functions evaluations is exceeded
   * @exception DimensionMismatchException if arrays dimensions do not match equations settings
   */
  private boolean tryStep(final double t0, final double[] y0, final double step, final int k,
                          final double[] scale, final double[][] f,
                          final double[] yMiddle, final double[] yEnd,
                          final double[] yTmp)
      throws MaxCountExceededException, DimensionMismatchException {try{__CLR4_4_1q9dq9dlb90p9hs.R.inc(34152);

    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34153);final int    n        = sequence[k];
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34154);final double subStep  = step / n;
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34155);final double subStep2 = 2 * subStep;

    // first substep
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34156);double t = t0 + subStep;
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34157);for (int i = 0; (((i < y0.length)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34158)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34159)==0&false)); ++i) {{
      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34160);yTmp[i] = y0[i];
      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34161);yEnd[i] = y0[i] + subStep * f[0][i];
    }
    }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34162);computeDerivatives(t, yEnd, f[1]);

    // other substeps
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34163);for (int j = 1; (((j < n)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34164)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34165)==0&false)); ++j) {{

      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34166);if ((((2 * j == n)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34167)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34168)==0&false))) {{
        // save the point at the middle of the step
        __CLR4_4_1q9dq9dlb90p9hs.R.inc(34169);System.arraycopy(yEnd, 0, yMiddle, 0, y0.length);
      }

      }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34170);t += subStep;
      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34171);for (int i = 0; (((i < y0.length)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34172)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34173)==0&false)); ++i) {{
        __CLR4_4_1q9dq9dlb90p9hs.R.inc(34174);final double middle = yEnd[i];
        __CLR4_4_1q9dq9dlb90p9hs.R.inc(34175);yEnd[i]       = yTmp[i] + subStep2 * f[j][i];
        __CLR4_4_1q9dq9dlb90p9hs.R.inc(34176);yTmp[i]       = middle;
      }

      }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34177);computeDerivatives(t, yEnd, f[j+1]);

      // stability check
      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34178);if ((((performTest && (j <= maxChecks) && (k < maxIter))&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34179)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34180)==0&false))) {{
        __CLR4_4_1q9dq9dlb90p9hs.R.inc(34181);double initialNorm = 0.0;
        __CLR4_4_1q9dq9dlb90p9hs.R.inc(34182);for (int l = 0; (((l < scale.length)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34183)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34184)==0&false)); ++l) {{
          __CLR4_4_1q9dq9dlb90p9hs.R.inc(34185);final double ratio = f[0][l] / scale[l];
          __CLR4_4_1q9dq9dlb90p9hs.R.inc(34186);initialNorm += ratio * ratio;
        }
        }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34187);double deltaNorm = 0.0;
        __CLR4_4_1q9dq9dlb90p9hs.R.inc(34188);for (int l = 0; (((l < scale.length)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34189)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34190)==0&false)); ++l) {{
          __CLR4_4_1q9dq9dlb90p9hs.R.inc(34191);final double ratio = (f[j+1][l] - f[0][l]) / scale[l];
          __CLR4_4_1q9dq9dlb90p9hs.R.inc(34192);deltaNorm += ratio * ratio;
        }
        }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34193);if ((((deltaNorm > 4 * FastMath.max(1.0e-15, initialNorm))&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34194)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34195)==0&false))) {{
          __CLR4_4_1q9dq9dlb90p9hs.R.inc(34196);return false;
        }
      }}

    }}

    // correction of the last substep (at t0 + step)
    }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34197);for (int i = 0; (((i < y0.length)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34198)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34199)==0&false)); ++i) {{
      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34200);yEnd[i] = 0.5 * (yTmp[i] + yEnd[i] + subStep * f[n][i]);
    }

    }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34201);return true;

  }finally{__CLR4_4_1q9dq9dlb90p9hs.R.flushNeeded();}}

  /** Extrapolate a vector.
   * @param offset offset to use in the coefficients table
   * @param k index of the last updated point
   * @param diag working diagonal of the Aitken-Neville's
   * triangle, without the last element
   * @param last last element
   */
  private void extrapolate(final int offset, final int k,
                           final double[][] diag, final double[] last) {try{__CLR4_4_1q9dq9dlb90p9hs.R.inc(34202);

    // update the diagonal
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34203);for (int j = 1; (((j < k)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34204)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34205)==0&false)); ++j) {{
      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34206);for (int i = 0; (((i < last.length)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34207)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34208)==0&false)); ++i) {{
        // Aitken-Neville's recursive formula
        __CLR4_4_1q9dq9dlb90p9hs.R.inc(34209);diag[k-j-1][i] = diag[k-j][i] +
                         coeff[k+offset][j-1] * (diag[k-j][i] - diag[k-j-1][i]);
      }
    }}

    // update the last element
    }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34210);for (int i = 0; (((i < last.length)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34211)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34212)==0&false)); ++i) {{
      // Aitken-Neville's recursive formula
      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34213);last[i] = diag[0][i] + coeff[k+offset][k-1] * (diag[0][i] - last[i]);
    }
  }}finally{__CLR4_4_1q9dq9dlb90p9hs.R.flushNeeded();}}

  /** {@inheritDoc} */
  @Override
  public void integrate(final ExpandableStatefulODE equations, final double t)
      throws NumberIsTooSmallException, DimensionMismatchException,
             MaxCountExceededException, NoBracketingException {try{__CLR4_4_1q9dq9dlb90p9hs.R.inc(34214);

    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34215);sanityChecks(equations, t);
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34216);setEquations(equations);
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34217);final boolean forward = t > equations.getTime();

    // create some internal working arrays
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34218);final double[] y0      = equations.getCompleteState();
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34219);final double[] y       = y0.clone();
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34220);final double[] yDot0   = new double[y.length];
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34221);final double[] y1      = new double[y.length];
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34222);final double[] yTmp    = new double[y.length];
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34223);final double[] yTmpDot = new double[y.length];

    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34224);final double[][] diagonal = new double[sequence.length-1][];
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34225);final double[][] y1Diag = new double[sequence.length-1][];
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34226);for (int k = 0; (((k < sequence.length-1)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34227)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34228)==0&false)); ++k) {{
      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34229);diagonal[k] = new double[y.length];
      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34230);y1Diag[k] = new double[y.length];
    }

    }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34231);final double[][][] fk  = new double[sequence.length][][];
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34232);for (int k = 0; (((k < sequence.length)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34233)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34234)==0&false)); ++k) {{

      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34235);fk[k]    = new double[sequence[k] + 1][];

      // all substeps start at the same point, so share the first array
      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34236);fk[k][0] = yDot0;

      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34237);for (int l = 0; (((l < sequence[k])&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34238)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34239)==0&false)); ++l) {{
        __CLR4_4_1q9dq9dlb90p9hs.R.inc(34240);fk[k][l+1] = new double[y0.length];
      }

    }}

    }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34241);if ((((y != y0)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34242)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34243)==0&false))) {{
      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34244);System.arraycopy(y0, 0, y, 0, y0.length);
    }

    }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34245);final double[] yDot1 = new double[y0.length];
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34246);final double[][] yMidDots = new double[1 + 2 * sequence.length][y0.length];

    // initial scaling
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34247);final double[] scale = new double[mainSetDimension];
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34248);rescale(y, y, scale);

    // initial order selection
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34249);final double tol =
        ((((vecRelativeTolerance == null) )&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34250)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34251)==0&false))? scalRelativeTolerance : vecRelativeTolerance[0];
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34252);final double log10R = FastMath.log10(FastMath.max(1.0e-10, tol));
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34253);int targetIter = FastMath.max(1,
                              FastMath.min(sequence.length - 2,
                                       (int) FastMath.floor(0.5 - 0.6 * log10R)));

    // set up an interpolator sharing the integrator arrays
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34254);final AbstractStepInterpolator interpolator =
            new GraggBulirschStoerStepInterpolator(y, yDot0,
                                                   y1, yDot1,
                                                   yMidDots, forward,
                                                   equations.getPrimaryMapper(),
                                                   equations.getSecondaryMappers());
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34255);interpolator.storeTime(equations.getTime());

    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34256);stepStart = equations.getTime();
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34257);double  hNew             = 0;
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34258);double  maxError         = Double.MAX_VALUE;
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34259);boolean previousRejected = false;
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34260);boolean firstTime        = true;
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34261);boolean newStep          = true;
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34262);boolean firstStepAlreadyComputed = false;
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34263);initIntegration(equations.getTime(), y0, t);
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34264);costPerTimeUnit[0] = 0;
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34265);isLastStep = false;
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34266);do {{

      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34267);double error;
      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34268);boolean reject = false;

      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34269);if ((((newStep)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34270)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34271)==0&false))) {{

        __CLR4_4_1q9dq9dlb90p9hs.R.inc(34272);interpolator.shift();

        // first evaluation, at the beginning of the step
        __CLR4_4_1q9dq9dlb90p9hs.R.inc(34273);if ((((! firstStepAlreadyComputed)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34274)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34275)==0&false))) {{
          __CLR4_4_1q9dq9dlb90p9hs.R.inc(34276);computeDerivatives(stepStart, y, yDot0);
        }

        }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34277);if ((((firstTime)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34278)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34279)==0&false))) {{
          __CLR4_4_1q9dq9dlb90p9hs.R.inc(34280);hNew = initializeStep(forward, 2 * targetIter + 1, scale,
                                stepStart, y, yDot0, yTmp, yTmpDot);
        }

        }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34281);newStep = false;

      }

      }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34282);stepSize = hNew;

      // step adjustment near bounds
      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34283);if (((((forward && (stepStart + stepSize > t)) ||
          ((! forward) && (stepStart + stepSize < t)))&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34284)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34285)==0&false))) {{
        __CLR4_4_1q9dq9dlb90p9hs.R.inc(34286);stepSize = t - stepStart;
      }
      }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34287);final double nextT = stepStart + stepSize;
      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34288);isLastStep = (((forward )&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34289)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34290)==0&false))? (nextT >= t) : (nextT <= t);

      // iterate over several substep sizes
      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34291);int k = -1;
      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34292);for (boolean loop = true; (((loop)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34293)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34294)==0&false)); ) {{

        __CLR4_4_1q9dq9dlb90p9hs.R.inc(34295);++k;

        // modified midpoint integration with the current substep
        __CLR4_4_1q9dq9dlb90p9hs.R.inc(34296);if ( (((! tryStep(stepStart, y, stepSize, k, scale, fk[k],
                       ((((k == 0) )&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34297)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34298)==0&false))? yMidDots[0] : diagonal[k-1],
                       ((((k == 0) )&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34299)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34300)==0&false))? y1 : y1Diag[k-1],
                       yTmp))&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34301)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34302)==0&false))) {{

          // the stability check failed, we reduce the global step
          __CLR4_4_1q9dq9dlb90p9hs.R.inc(34303);hNew   = FastMath.abs(filterStep(stepSize * stabilityReduction, forward, false));
          __CLR4_4_1q9dq9dlb90p9hs.R.inc(34304);reject = true;
          __CLR4_4_1q9dq9dlb90p9hs.R.inc(34305);loop   = false;

        } }else {{

          // the substep was computed successfully
          __CLR4_4_1q9dq9dlb90p9hs.R.inc(34306);if ((((k > 0)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34307)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34308)==0&false))) {{

            // extrapolate the state at the end of the step
            // using last iteration data
            __CLR4_4_1q9dq9dlb90p9hs.R.inc(34309);extrapolate(0, k, y1Diag, y1);
            __CLR4_4_1q9dq9dlb90p9hs.R.inc(34310);rescale(y, y1, scale);

            // estimate the error at the end of the step.
            __CLR4_4_1q9dq9dlb90p9hs.R.inc(34311);error = 0;
            __CLR4_4_1q9dq9dlb90p9hs.R.inc(34312);for (int j = 0; (((j < mainSetDimension)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34313)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34314)==0&false)); ++j) {{
              __CLR4_4_1q9dq9dlb90p9hs.R.inc(34315);final double e = FastMath.abs(y1[j] - y1Diag[0][j]) / scale[j];
              __CLR4_4_1q9dq9dlb90p9hs.R.inc(34316);error += e * e;
            }
            }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34317);error = FastMath.sqrt(error / mainSetDimension);

            __CLR4_4_1q9dq9dlb90p9hs.R.inc(34318);if (((((error > 1.0e15) || ((k > 1) && (error > maxError)))&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34319)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34320)==0&false))) {{
              // error is too big, we reduce the global step
              __CLR4_4_1q9dq9dlb90p9hs.R.inc(34321);hNew   = FastMath.abs(filterStep(stepSize * stabilityReduction, forward, false));
              __CLR4_4_1q9dq9dlb90p9hs.R.inc(34322);reject = true;
              __CLR4_4_1q9dq9dlb90p9hs.R.inc(34323);loop   = false;
            } }else {{

              __CLR4_4_1q9dq9dlb90p9hs.R.inc(34324);maxError = FastMath.max(4 * error, 1.0);

              // compute optimal stepsize for this order
              __CLR4_4_1q9dq9dlb90p9hs.R.inc(34325);final double exp = 1.0 / (2 * k + 1);
              __CLR4_4_1q9dq9dlb90p9hs.R.inc(34326);double fac = stepControl2 / FastMath.pow(error / stepControl1, exp);
              __CLR4_4_1q9dq9dlb90p9hs.R.inc(34327);final double pow = FastMath.pow(stepControl3, exp);
              __CLR4_4_1q9dq9dlb90p9hs.R.inc(34328);fac = FastMath.max(pow / stepControl4, FastMath.min(1 / pow, fac));
              __CLR4_4_1q9dq9dlb90p9hs.R.inc(34329);optimalStep[k]     = FastMath.abs(filterStep(stepSize * fac, forward, true));
              __CLR4_4_1q9dq9dlb90p9hs.R.inc(34330);costPerTimeUnit[k] = costPerStep[k] / optimalStep[k];

              // check convergence
              boolean __CLB4_4_1_bool0=false;__CLR4_4_1q9dq9dlb90p9hs.R.inc(34331);switch (k - targetIter) {

              case -1 :if (!__CLB4_4_1_bool0) {__CLR4_4_1q9dq9dlb90p9hs.R.inc(34332);__CLB4_4_1_bool0=true;}
                __CLR4_4_1q9dq9dlb90p9hs.R.inc(34333);if (((((targetIter > 1) && ! previousRejected)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34334)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34335)==0&false))) {{

                  // check if we can stop iterations now
                  __CLR4_4_1q9dq9dlb90p9hs.R.inc(34336);if ((((error <= 1.0)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34337)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34338)==0&false))) {{
                    // convergence have been reached just before targetIter
                    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34339);loop = false;
                  } }else {{
                    // estimate if there is a chance convergence will
                    // be reached on next iteration, using the
                    // asymptotic evolution of error
                    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34340);final double ratio = ((double) sequence [targetIter] * sequence[targetIter + 1]) /
                                         (sequence[0] * sequence[0]);
                    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34341);if ((((error > ratio * ratio)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34342)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34343)==0&false))) {{
                      // we don't expect to converge on next iteration
                      // we reject the step immediately and reduce order
                      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34344);reject = true;
                      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34345);loop   = false;
                      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34346);targetIter = k;
                      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34347);if (((((targetIter > 1) &&
                          (costPerTimeUnit[targetIter-1] <
                           orderControl1 * costPerTimeUnit[targetIter]))&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34348)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34349)==0&false))) {{
                        __CLR4_4_1q9dq9dlb90p9hs.R.inc(34350);--targetIter;
                      }
                      }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34351);hNew = optimalStep[targetIter];
                    }
                  }}
                }}
                }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34352);break;

              case 0:if (!__CLB4_4_1_bool0) {__CLR4_4_1q9dq9dlb90p9hs.R.inc(34353);__CLB4_4_1_bool0=true;}
                __CLR4_4_1q9dq9dlb90p9hs.R.inc(34354);if ((((error <= 1.0)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34355)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34356)==0&false))) {{
                  // convergence has been reached exactly at targetIter
                  __CLR4_4_1q9dq9dlb90p9hs.R.inc(34357);loop = false;
                } }else {{
                  // estimate if there is a chance convergence will
                  // be reached on next iteration, using the
                  // asymptotic evolution of error
                  __CLR4_4_1q9dq9dlb90p9hs.R.inc(34358);final double ratio = ((double) sequence[k+1]) / sequence[0];
                  __CLR4_4_1q9dq9dlb90p9hs.R.inc(34359);if ((((error > ratio * ratio)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34360)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34361)==0&false))) {{
                    // we don't expect to converge on next iteration
                    // we reject the step immediately
                    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34362);reject = true;
                    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34363);loop = false;
                    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34364);if (((((targetIter > 1) &&
                        (costPerTimeUnit[targetIter-1] <
                         orderControl1 * costPerTimeUnit[targetIter]))&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34365)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34366)==0&false))) {{
                      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34367);--targetIter;
                    }
                    }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34368);hNew = optimalStep[targetIter];
                  }
                }}
                }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34369);break;

              case 1 :if (!__CLB4_4_1_bool0) {__CLR4_4_1q9dq9dlb90p9hs.R.inc(34370);__CLB4_4_1_bool0=true;}
                __CLR4_4_1q9dq9dlb90p9hs.R.inc(34371);if ((((error > 1.0)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34372)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34373)==0&false))) {{
                  __CLR4_4_1q9dq9dlb90p9hs.R.inc(34374);reject = true;
                  __CLR4_4_1q9dq9dlb90p9hs.R.inc(34375);if (((((targetIter > 1) &&
                      (costPerTimeUnit[targetIter-1] <
                       orderControl1 * costPerTimeUnit[targetIter]))&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34376)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34377)==0&false))) {{
                    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34378);--targetIter;
                  }
                  }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34379);hNew = optimalStep[targetIter];
                }
                }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34380);loop = false;
                __CLR4_4_1q9dq9dlb90p9hs.R.inc(34381);break;

              default :if (!__CLB4_4_1_bool0) {__CLR4_4_1q9dq9dlb90p9hs.R.inc(34382);__CLB4_4_1_bool0=true;}
                __CLR4_4_1q9dq9dlb90p9hs.R.inc(34383);if (((((firstTime || isLastStep) && (error <= 1.0))&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34384)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34385)==0&false))) {{
                  __CLR4_4_1q9dq9dlb90p9hs.R.inc(34386);loop = false;
                }
                }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34387);break;

              }

            }
          }}
        }}
      }}

      }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34388);if ((((! reject)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34389)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34390)==0&false))) {{
          // derivatives at end of step
          __CLR4_4_1q9dq9dlb90p9hs.R.inc(34391);computeDerivatives(stepStart + stepSize, y1, yDot1);
      }

      // dense output handling
      }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34392);double hInt = getMaxStep();
      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34393);if ((((! reject)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34394)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34395)==0&false))) {{

        // extrapolate state at middle point of the step
        __CLR4_4_1q9dq9dlb90p9hs.R.inc(34396);for (int j = 1; (((j <= k)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34397)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34398)==0&false)); ++j) {{
          __CLR4_4_1q9dq9dlb90p9hs.R.inc(34399);extrapolate(0, j, diagonal, yMidDots[0]);
        }

        }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34400);final int mu = 2 * k - mudif + 3;

        __CLR4_4_1q9dq9dlb90p9hs.R.inc(34401);for (int l = 0; (((l < mu)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34402)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34403)==0&false)); ++l) {{

          // derivative at middle point of the step
          __CLR4_4_1q9dq9dlb90p9hs.R.inc(34404);final int l2 = l / 2;
          __CLR4_4_1q9dq9dlb90p9hs.R.inc(34405);double factor = FastMath.pow(0.5 * sequence[l2], l);
          __CLR4_4_1q9dq9dlb90p9hs.R.inc(34406);int middleIndex = fk[l2].length / 2;
          __CLR4_4_1q9dq9dlb90p9hs.R.inc(34407);for (int i = 0; (((i < y0.length)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34408)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34409)==0&false)); ++i) {{
            __CLR4_4_1q9dq9dlb90p9hs.R.inc(34410);yMidDots[l+1][i] = factor * fk[l2][middleIndex + l][i];
          }
          }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34411);for (int j = 1; (((j <= k - l2)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34412)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34413)==0&false)); ++j) {{
            __CLR4_4_1q9dq9dlb90p9hs.R.inc(34414);factor = FastMath.pow(0.5 * sequence[j + l2], l);
            __CLR4_4_1q9dq9dlb90p9hs.R.inc(34415);middleIndex = fk[l2+j].length / 2;
            __CLR4_4_1q9dq9dlb90p9hs.R.inc(34416);for (int i = 0; (((i < y0.length)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34417)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34418)==0&false)); ++i) {{
              __CLR4_4_1q9dq9dlb90p9hs.R.inc(34419);diagonal[j-1][i] = factor * fk[l2+j][middleIndex+l][i];
            }
            }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34420);extrapolate(l2, j, diagonal, yMidDots[l+1]);
          }
          }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34421);for (int i = 0; (((i < y0.length)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34422)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34423)==0&false)); ++i) {{
            __CLR4_4_1q9dq9dlb90p9hs.R.inc(34424);yMidDots[l+1][i] *= stepSize;
          }

          // compute centered differences to evaluate next derivatives
          }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34425);for (int j = (l + 1) / 2; (((j <= k)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34426)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34427)==0&false)); ++j) {{
            __CLR4_4_1q9dq9dlb90p9hs.R.inc(34428);for (int m = fk[j].length - 1; (((m >= 2 * (l + 1))&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34429)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34430)==0&false)); --m) {{
              __CLR4_4_1q9dq9dlb90p9hs.R.inc(34431);for (int i = 0; (((i < y0.length)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34432)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34433)==0&false)); ++i) {{
                __CLR4_4_1q9dq9dlb90p9hs.R.inc(34434);fk[j][m][i] -= fk[j][m-2][i];
              }
            }}
          }}

        }}

        }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34435);if ((((mu >= 0)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34436)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34437)==0&false))) {{

          // estimate the dense output coefficients
          __CLR4_4_1q9dq9dlb90p9hs.R.inc(34438);final GraggBulirschStoerStepInterpolator gbsInterpolator
            = (GraggBulirschStoerStepInterpolator) interpolator;
          __CLR4_4_1q9dq9dlb90p9hs.R.inc(34439);gbsInterpolator.computeCoefficients(mu, stepSize);

          __CLR4_4_1q9dq9dlb90p9hs.R.inc(34440);if ((((useInterpolationError)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34441)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34442)==0&false))) {{
            // use the interpolation error to limit stepsize
            __CLR4_4_1q9dq9dlb90p9hs.R.inc(34443);final double interpError = gbsInterpolator.estimateError(scale);
            __CLR4_4_1q9dq9dlb90p9hs.R.inc(34444);hInt = FastMath.abs(stepSize / FastMath.max(FastMath.pow(interpError, 1.0 / (mu+4)),
                                                0.01));
            __CLR4_4_1q9dq9dlb90p9hs.R.inc(34445);if ((((interpError > 10.0)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34446)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34447)==0&false))) {{
              __CLR4_4_1q9dq9dlb90p9hs.R.inc(34448);hNew = hInt;
              __CLR4_4_1q9dq9dlb90p9hs.R.inc(34449);reject = true;
            }
          }}

        }}

      }}

      }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34450);if ((((! reject)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34451)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34452)==0&false))) {{

        // Discrete events handling
        __CLR4_4_1q9dq9dlb90p9hs.R.inc(34453);interpolator.storeTime(stepStart + stepSize);
        __CLR4_4_1q9dq9dlb90p9hs.R.inc(34454);stepStart = acceptStep(interpolator, y1, yDot1, t);

        // prepare next step
        __CLR4_4_1q9dq9dlb90p9hs.R.inc(34455);interpolator.storeTime(stepStart);
        __CLR4_4_1q9dq9dlb90p9hs.R.inc(34456);System.arraycopy(y1, 0, y, 0, y0.length);
        __CLR4_4_1q9dq9dlb90p9hs.R.inc(34457);System.arraycopy(yDot1, 0, yDot0, 0, y0.length);
        __CLR4_4_1q9dq9dlb90p9hs.R.inc(34458);firstStepAlreadyComputed = true;

        __CLR4_4_1q9dq9dlb90p9hs.R.inc(34459);int optimalIter;
        __CLR4_4_1q9dq9dlb90p9hs.R.inc(34460);if ((((k == 1)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34461)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34462)==0&false))) {{
          __CLR4_4_1q9dq9dlb90p9hs.R.inc(34463);optimalIter = 2;
          __CLR4_4_1q9dq9dlb90p9hs.R.inc(34464);if ((((previousRejected)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34465)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34466)==0&false))) {{
            __CLR4_4_1q9dq9dlb90p9hs.R.inc(34467);optimalIter = 1;
          }
        }} }else {__CLR4_4_1q9dq9dlb90p9hs.R.inc(34468);if ((((k <= targetIter)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34469)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34470)==0&false))) {{
          __CLR4_4_1q9dq9dlb90p9hs.R.inc(34471);optimalIter = k;
          __CLR4_4_1q9dq9dlb90p9hs.R.inc(34472);if ((((costPerTimeUnit[k-1] < orderControl1 * costPerTimeUnit[k])&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34473)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34474)==0&false))) {{
            __CLR4_4_1q9dq9dlb90p9hs.R.inc(34475);optimalIter = k-1;
          } }else {__CLR4_4_1q9dq9dlb90p9hs.R.inc(34476);if ((((costPerTimeUnit[k] < orderControl2 * costPerTimeUnit[k-1])&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34477)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34478)==0&false))) {{
            __CLR4_4_1q9dq9dlb90p9hs.R.inc(34479);optimalIter = FastMath.min(k+1, sequence.length - 2);
          }
        }}} }else {{
          __CLR4_4_1q9dq9dlb90p9hs.R.inc(34480);optimalIter = k - 1;
          __CLR4_4_1q9dq9dlb90p9hs.R.inc(34481);if (((((k > 2) &&
              (costPerTimeUnit[k-2] < orderControl1 * costPerTimeUnit[k-1]))&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34482)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34483)==0&false))) {{
            __CLR4_4_1q9dq9dlb90p9hs.R.inc(34484);optimalIter = k - 2;
          }
          }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34485);if ((((costPerTimeUnit[k] < orderControl2 * costPerTimeUnit[optimalIter])&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34486)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34487)==0&false))) {{
            __CLR4_4_1q9dq9dlb90p9hs.R.inc(34488);optimalIter = FastMath.min(k, sequence.length - 2);
          }
        }}

        }}__CLR4_4_1q9dq9dlb90p9hs.R.inc(34489);if ((((previousRejected)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34490)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34491)==0&false))) {{
          // after a rejected step neither order nor stepsize
          // should increase
          __CLR4_4_1q9dq9dlb90p9hs.R.inc(34492);targetIter = FastMath.min(optimalIter, k);
          __CLR4_4_1q9dq9dlb90p9hs.R.inc(34493);hNew = FastMath.min(FastMath.abs(stepSize), optimalStep[targetIter]);
        } }else {{
          // stepsize control
          __CLR4_4_1q9dq9dlb90p9hs.R.inc(34494);if ((((optimalIter <= k)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34495)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34496)==0&false))) {{
            __CLR4_4_1q9dq9dlb90p9hs.R.inc(34497);hNew = optimalStep[optimalIter];
          } }else {{
            __CLR4_4_1q9dq9dlb90p9hs.R.inc(34498);if (((((k < targetIter) &&
                (costPerTimeUnit[k] < orderControl2 * costPerTimeUnit[k-1]))&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34499)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34500)==0&false))) {{
              __CLR4_4_1q9dq9dlb90p9hs.R.inc(34501);hNew = filterStep(optimalStep[k] * costPerStep[optimalIter+1] / costPerStep[k],
                               forward, false);
            } }else {{
              __CLR4_4_1q9dq9dlb90p9hs.R.inc(34502);hNew = filterStep(optimalStep[k] * costPerStep[optimalIter] / costPerStep[k],
                                forward, false);
            }
          }}

          }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34503);targetIter = optimalIter;

        }

        }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34504);newStep = true;

      }

      }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34505);hNew = FastMath.min(hNew, hInt);
      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34506);if ((((! forward)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34507)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34508)==0&false))) {{
        __CLR4_4_1q9dq9dlb90p9hs.R.inc(34509);hNew = -hNew;
      }

      }__CLR4_4_1q9dq9dlb90p9hs.R.inc(34510);firstTime = false;

      __CLR4_4_1q9dq9dlb90p9hs.R.inc(34511);if ((((reject)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34512)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34513)==0&false))) {{
        __CLR4_4_1q9dq9dlb90p9hs.R.inc(34514);isLastStep = false;
        __CLR4_4_1q9dq9dlb90p9hs.R.inc(34515);previousRejected = true;
      } }else {{
        __CLR4_4_1q9dq9dlb90p9hs.R.inc(34516);previousRejected = false;
      }

    }} }while ((((!isLastStep)&&(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34517)!=0|true))||(__CLR4_4_1q9dq9dlb90p9hs.R.iget(34518)==0&false)));

    // dispatch results
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34519);equations.setTime(stepStart);
    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34520);equations.setCompleteState(y);

    __CLR4_4_1q9dq9dlb90p9hs.R.inc(34521);resetInternalState();

  }finally{__CLR4_4_1q9dq9dlb90p9hs.R.flushNeeded();}}

}
