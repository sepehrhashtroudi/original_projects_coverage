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
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.ode.AbstractIntegrator;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.util.FastMath;

/**
 * This abstract class holds the common part of all adaptive
 * stepsize integrators for Ordinary Differential Equations.
 *
 * <p>These algorithms perform integration with stepsize control, which
 * means the user does not specify the integration step but rather a
 * tolerance on error. The error threshold is computed as
 * <pre>
 * threshold_i = absTol_i + relTol_i * max (abs (ym), abs (ym+1))
 * </pre>
 * where absTol_i is the absolute tolerance for component i of the
 * state vector and relTol_i is the relative tolerance for the same
 * component. The user can also use only two scalar values absTol and
 * relTol which will be used for all components.
 * </p>
 * <p>
 * If the Ordinary Differential Equations is an {@link ExpandableStatefulODE
 * extended ODE} rather than a {@link
 * org.apache.commons.math3.ode.FirstOrderDifferentialEquations basic ODE}, then
 * <em>only</em> the {@link ExpandableStatefulODE#getPrimaryState() primary part}
 * of the state vector is used for stepsize control, not the complete state vector.
 * </p>
 *
 * <p>If the estimated error for ym+1 is such that
 * <pre>
 * sqrt((sum (errEst_i / threshold_i)^2 ) / n) < 1
 * </pre>
 *
 * (where n is the main set dimension) then the step is accepted,
 * otherwise the step is rejected and a new attempt is made with a new
 * stepsize.</p>
 *
 * @version $Id$
 * @since 1.2
 *
 */

public abstract class AdaptiveStepsizeIntegrator
  extends AbstractIntegrator {public static class __CLR4_4_1pqipqilb90p9ef{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,33480,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Allowed absolute scalar error. */
    protected double scalAbsoluteTolerance;

    /** Allowed relative scalar error. */
    protected double scalRelativeTolerance;

    /** Allowed absolute vectorial error. */
    protected double[] vecAbsoluteTolerance;

    /** Allowed relative vectorial error. */
    protected double[] vecRelativeTolerance;

    /** Main set dimension. */
    protected int mainSetDimension;

    /** User supplied initial step. */
    private double initialStep;

    /** Minimal step. */
    private double minStep;

    /** Maximal step. */
    private double maxStep;

  /** Build an integrator with the given stepsize bounds.
   * The default step handler does nothing.
   * @param name name of the method
   * @param minStep minimal step (sign is irrelevant, regardless of
   * integration direction, forward or backward), the last step can
   * be smaller than this
   * @param maxStep maximal step (sign is irrelevant, regardless of
   * integration direction, forward or backward), the last step can
   * be smaller than this
   * @param scalAbsoluteTolerance allowed absolute error
   * @param scalRelativeTolerance allowed relative error
   */
  public AdaptiveStepsizeIntegrator(final String name,
                                    final double minStep, final double maxStep,
                                    final double scalAbsoluteTolerance,
                                    final double scalRelativeTolerance) {

    super(name);__CLR4_4_1pqipqilb90p9ef.R.inc(33355);try{__CLR4_4_1pqipqilb90p9ef.R.inc(33354);
    __CLR4_4_1pqipqilb90p9ef.R.inc(33356);setStepSizeControl(minStep, maxStep, scalAbsoluteTolerance, scalRelativeTolerance);
    __CLR4_4_1pqipqilb90p9ef.R.inc(33357);resetInternalState();

  }finally{__CLR4_4_1pqipqilb90p9ef.R.flushNeeded();}}

  /** Build an integrator with the given stepsize bounds.
   * The default step handler does nothing.
   * @param name name of the method
   * @param minStep minimal step (sign is irrelevant, regardless of
   * integration direction, forward or backward), the last step can
   * be smaller than this
   * @param maxStep maximal step (sign is irrelevant, regardless of
   * integration direction, forward or backward), the last step can
   * be smaller than this
   * @param vecAbsoluteTolerance allowed absolute error
   * @param vecRelativeTolerance allowed relative error
   */
  public AdaptiveStepsizeIntegrator(final String name,
                                    final double minStep, final double maxStep,
                                    final double[] vecAbsoluteTolerance,
                                    final double[] vecRelativeTolerance) {

    super(name);__CLR4_4_1pqipqilb90p9ef.R.inc(33359);try{__CLR4_4_1pqipqilb90p9ef.R.inc(33358);
    __CLR4_4_1pqipqilb90p9ef.R.inc(33360);setStepSizeControl(minStep, maxStep, vecAbsoluteTolerance, vecRelativeTolerance);
    __CLR4_4_1pqipqilb90p9ef.R.inc(33361);resetInternalState();

  }finally{__CLR4_4_1pqipqilb90p9ef.R.flushNeeded();}}

  /** Set the adaptive step size control parameters.
   * <p>
   * A side effect of this method is to also reset the initial
   * step so it will be automatically computed by the integrator
   * if {@link #setInitialStepSize(double) setInitialStepSize}
   * is not called by the user.
   * </p>
   * @param minimalStep minimal step (must be positive even for backward
   * integration), the last step can be smaller than this
   * @param maximalStep maximal step (must be positive even for backward
   * integration)
   * @param absoluteTolerance allowed absolute error
   * @param relativeTolerance allowed relative error
   */
  public void setStepSizeControl(final double minimalStep, final double maximalStep,
                                 final double absoluteTolerance,
                                 final double relativeTolerance) {try{__CLR4_4_1pqipqilb90p9ef.R.inc(33362);

      __CLR4_4_1pqipqilb90p9ef.R.inc(33363);minStep     = FastMath.abs(minimalStep);
      __CLR4_4_1pqipqilb90p9ef.R.inc(33364);maxStep     = FastMath.abs(maximalStep);
      __CLR4_4_1pqipqilb90p9ef.R.inc(33365);initialStep = -1;

      __CLR4_4_1pqipqilb90p9ef.R.inc(33366);scalAbsoluteTolerance = absoluteTolerance;
      __CLR4_4_1pqipqilb90p9ef.R.inc(33367);scalRelativeTolerance = relativeTolerance;
      __CLR4_4_1pqipqilb90p9ef.R.inc(33368);vecAbsoluteTolerance  = null;
      __CLR4_4_1pqipqilb90p9ef.R.inc(33369);vecRelativeTolerance  = null;

  }finally{__CLR4_4_1pqipqilb90p9ef.R.flushNeeded();}}

  /** Set the adaptive step size control parameters.
   * <p>
   * A side effect of this method is to also reset the initial
   * step so it will be automatically computed by the integrator
   * if {@link #setInitialStepSize(double) setInitialStepSize}
   * is not called by the user.
   * </p>
   * @param minimalStep minimal step (must be positive even for backward
   * integration), the last step can be smaller than this
   * @param maximalStep maximal step (must be positive even for backward
   * integration)
   * @param absoluteTolerance allowed absolute error
   * @param relativeTolerance allowed relative error
   */
  public void setStepSizeControl(final double minimalStep, final double maximalStep,
                                 final double[] absoluteTolerance,
                                 final double[] relativeTolerance) {try{__CLR4_4_1pqipqilb90p9ef.R.inc(33370);

      __CLR4_4_1pqipqilb90p9ef.R.inc(33371);minStep     = FastMath.abs(minimalStep);
      __CLR4_4_1pqipqilb90p9ef.R.inc(33372);maxStep     = FastMath.abs(maximalStep);
      __CLR4_4_1pqipqilb90p9ef.R.inc(33373);initialStep = -1;

      __CLR4_4_1pqipqilb90p9ef.R.inc(33374);scalAbsoluteTolerance = 0;
      __CLR4_4_1pqipqilb90p9ef.R.inc(33375);scalRelativeTolerance = 0;
      __CLR4_4_1pqipqilb90p9ef.R.inc(33376);vecAbsoluteTolerance  = absoluteTolerance.clone();
      __CLR4_4_1pqipqilb90p9ef.R.inc(33377);vecRelativeTolerance  = relativeTolerance.clone();

  }finally{__CLR4_4_1pqipqilb90p9ef.R.flushNeeded();}}

  /** Set the initial step size.
   * <p>This method allows the user to specify an initial positive
   * step size instead of letting the integrator guess it by
   * itself. If this method is not called before integration is
   * started, the initial step size will be estimated by the
   * integrator.</p>
   * @param initialStepSize initial step size to use (must be positive even
   * for backward integration ; providing a negative value or a value
   * outside of the min/max step interval will lead the integrator to
   * ignore the value and compute the initial step size by itself)
   */
  public void setInitialStepSize(final double initialStepSize) {try{__CLR4_4_1pqipqilb90p9ef.R.inc(33378);
    __CLR4_4_1pqipqilb90p9ef.R.inc(33379);if (((((initialStepSize < minStep) || (initialStepSize > maxStep))&&(__CLR4_4_1pqipqilb90p9ef.R.iget(33380)!=0|true))||(__CLR4_4_1pqipqilb90p9ef.R.iget(33381)==0&false))) {{
      __CLR4_4_1pqipqilb90p9ef.R.inc(33382);initialStep = -1.0;
    } }else {{
      __CLR4_4_1pqipqilb90p9ef.R.inc(33383);initialStep = initialStepSize;
    }
  }}finally{__CLR4_4_1pqipqilb90p9ef.R.flushNeeded();}}

  /** {@inheritDoc} */
  @Override
  protected void sanityChecks(final ExpandableStatefulODE equations, final double t)
      throws DimensionMismatchException, NumberIsTooSmallException {try{__CLR4_4_1pqipqilb90p9ef.R.inc(33384);

      __CLR4_4_1pqipqilb90p9ef.R.inc(33385);super.sanityChecks(equations, t);

      __CLR4_4_1pqipqilb90p9ef.R.inc(33386);mainSetDimension = equations.getPrimaryMapper().getDimension();

      __CLR4_4_1pqipqilb90p9ef.R.inc(33387);if (((((vecAbsoluteTolerance != null) && (vecAbsoluteTolerance.length != mainSetDimension))&&(__CLR4_4_1pqipqilb90p9ef.R.iget(33388)!=0|true))||(__CLR4_4_1pqipqilb90p9ef.R.iget(33389)==0&false))) {{
          __CLR4_4_1pqipqilb90p9ef.R.inc(33390);throw new DimensionMismatchException(mainSetDimension, vecAbsoluteTolerance.length);
      }

      }__CLR4_4_1pqipqilb90p9ef.R.inc(33391);if (((((vecRelativeTolerance != null) && (vecRelativeTolerance.length != mainSetDimension))&&(__CLR4_4_1pqipqilb90p9ef.R.iget(33392)!=0|true))||(__CLR4_4_1pqipqilb90p9ef.R.iget(33393)==0&false))) {{
          __CLR4_4_1pqipqilb90p9ef.R.inc(33394);throw new DimensionMismatchException(mainSetDimension, vecRelativeTolerance.length);
      }

  }}finally{__CLR4_4_1pqipqilb90p9ef.R.flushNeeded();}}

  /** Initialize the integration step.
   * @param forward forward integration indicator
   * @param order order of the method
   * @param scale scaling vector for the state vector (can be shorter than state vector)
   * @param t0 start time
   * @param y0 state vector at t0
   * @param yDot0 first time derivative of y0
   * @param y1 work array for a state vector
   * @param yDot1 work array for the first time derivative of y1
   * @return first integration step
   * @exception MaxCountExceededException if the number of functions evaluations is exceeded
   * @exception DimensionMismatchException if arrays dimensions do not match equations settings
   */
  public double initializeStep(final boolean forward, final int order, final double[] scale,
                               final double t0, final double[] y0, final double[] yDot0,
                               final double[] y1, final double[] yDot1)
      throws MaxCountExceededException, DimensionMismatchException {try{__CLR4_4_1pqipqilb90p9ef.R.inc(33395);

    __CLR4_4_1pqipqilb90p9ef.R.inc(33396);if ((((initialStep > 0)&&(__CLR4_4_1pqipqilb90p9ef.R.iget(33397)!=0|true))||(__CLR4_4_1pqipqilb90p9ef.R.iget(33398)==0&false))) {{
      // use the user provided value
      __CLR4_4_1pqipqilb90p9ef.R.inc(33399);return (((forward )&&(__CLR4_4_1pqipqilb90p9ef.R.iget(33400)!=0|true))||(__CLR4_4_1pqipqilb90p9ef.R.iget(33401)==0&false))? initialStep : -initialStep;
    }

    // very rough first guess : h = 0.01 * ||y/scale|| / ||y'/scale||
    // this guess will be used to perform an Euler step
    }__CLR4_4_1pqipqilb90p9ef.R.inc(33402);double ratio;
    __CLR4_4_1pqipqilb90p9ef.R.inc(33403);double yOnScale2 = 0;
    __CLR4_4_1pqipqilb90p9ef.R.inc(33404);double yDotOnScale2 = 0;
    __CLR4_4_1pqipqilb90p9ef.R.inc(33405);for (int j = 0; (((j < scale.length)&&(__CLR4_4_1pqipqilb90p9ef.R.iget(33406)!=0|true))||(__CLR4_4_1pqipqilb90p9ef.R.iget(33407)==0&false)); ++j) {{
      __CLR4_4_1pqipqilb90p9ef.R.inc(33408);ratio         = y0[j] / scale[j];
      __CLR4_4_1pqipqilb90p9ef.R.inc(33409);yOnScale2    += ratio * ratio;
      __CLR4_4_1pqipqilb90p9ef.R.inc(33410);ratio         = yDot0[j] / scale[j];
      __CLR4_4_1pqipqilb90p9ef.R.inc(33411);yDotOnScale2 += ratio * ratio;
    }

    }__CLR4_4_1pqipqilb90p9ef.R.inc(33412);double h = (((((yOnScale2 < 1.0e-10) || (yDotOnScale2 < 1.0e-10)) )&&(__CLR4_4_1pqipqilb90p9ef.R.iget(33413)!=0|true))||(__CLR4_4_1pqipqilb90p9ef.R.iget(33414)==0&false))?
               1.0e-6 : (0.01 * FastMath.sqrt(yOnScale2 / yDotOnScale2));
    __CLR4_4_1pqipqilb90p9ef.R.inc(33415);if ((((! forward)&&(__CLR4_4_1pqipqilb90p9ef.R.iget(33416)!=0|true))||(__CLR4_4_1pqipqilb90p9ef.R.iget(33417)==0&false))) {{
      __CLR4_4_1pqipqilb90p9ef.R.inc(33418);h = -h;
    }

    // perform an Euler step using the preceding rough guess
    }__CLR4_4_1pqipqilb90p9ef.R.inc(33419);for (int j = 0; (((j < y0.length)&&(__CLR4_4_1pqipqilb90p9ef.R.iget(33420)!=0|true))||(__CLR4_4_1pqipqilb90p9ef.R.iget(33421)==0&false)); ++j) {{
      __CLR4_4_1pqipqilb90p9ef.R.inc(33422);y1[j] = y0[j] + h * yDot0[j];
    }
    }__CLR4_4_1pqipqilb90p9ef.R.inc(33423);computeDerivatives(t0 + h, y1, yDot1);

    // estimate the second derivative of the solution
    __CLR4_4_1pqipqilb90p9ef.R.inc(33424);double yDDotOnScale = 0;
    __CLR4_4_1pqipqilb90p9ef.R.inc(33425);for (int j = 0; (((j < scale.length)&&(__CLR4_4_1pqipqilb90p9ef.R.iget(33426)!=0|true))||(__CLR4_4_1pqipqilb90p9ef.R.iget(33427)==0&false)); ++j) {{
      __CLR4_4_1pqipqilb90p9ef.R.inc(33428);ratio         = (yDot1[j] - yDot0[j]) / scale[j];
      __CLR4_4_1pqipqilb90p9ef.R.inc(33429);yDDotOnScale += ratio * ratio;
    }
    }__CLR4_4_1pqipqilb90p9ef.R.inc(33430);yDDotOnScale = FastMath.sqrt(yDDotOnScale) / h;

    // step size is computed such that
    // h^order * max (||y'/tol||, ||y''/tol||) = 0.01
    __CLR4_4_1pqipqilb90p9ef.R.inc(33431);final double maxInv2 = FastMath.max(FastMath.sqrt(yDotOnScale2), yDDotOnScale);
    __CLR4_4_1pqipqilb90p9ef.R.inc(33432);final double h1 = ((((maxInv2 < 1.0e-15) )&&(__CLR4_4_1pqipqilb90p9ef.R.iget(33433)!=0|true))||(__CLR4_4_1pqipqilb90p9ef.R.iget(33434)==0&false))?
                      FastMath.max(1.0e-6, 0.001 * FastMath.abs(h)) :
                      FastMath.pow(0.01 / maxInv2, 1.0 / order);
    __CLR4_4_1pqipqilb90p9ef.R.inc(33435);h = FastMath.min(100.0 * FastMath.abs(h), h1);
    __CLR4_4_1pqipqilb90p9ef.R.inc(33436);h = FastMath.max(h, 1.0e-12 * FastMath.abs(t0));  // avoids cancellation when computing t1 - t0
    __CLR4_4_1pqipqilb90p9ef.R.inc(33437);if ((((h < getMinStep())&&(__CLR4_4_1pqipqilb90p9ef.R.iget(33438)!=0|true))||(__CLR4_4_1pqipqilb90p9ef.R.iget(33439)==0&false))) {{
      __CLR4_4_1pqipqilb90p9ef.R.inc(33440);h = getMinStep();
    }
    }__CLR4_4_1pqipqilb90p9ef.R.inc(33441);if ((((h > getMaxStep())&&(__CLR4_4_1pqipqilb90p9ef.R.iget(33442)!=0|true))||(__CLR4_4_1pqipqilb90p9ef.R.iget(33443)==0&false))) {{
      __CLR4_4_1pqipqilb90p9ef.R.inc(33444);h = getMaxStep();
    }
    }__CLR4_4_1pqipqilb90p9ef.R.inc(33445);if ((((! forward)&&(__CLR4_4_1pqipqilb90p9ef.R.iget(33446)!=0|true))||(__CLR4_4_1pqipqilb90p9ef.R.iget(33447)==0&false))) {{
      __CLR4_4_1pqipqilb90p9ef.R.inc(33448);h = -h;
    }

    }__CLR4_4_1pqipqilb90p9ef.R.inc(33449);return h;

  }finally{__CLR4_4_1pqipqilb90p9ef.R.flushNeeded();}}

  /** Filter the integration step.
   * @param h signed step
   * @param forward forward integration indicator
   * @param acceptSmall if true, steps smaller than the minimal value
   * are silently increased up to this value, if false such small
   * steps generate an exception
   * @return a bounded integration step (h if no bound is reach, or a bounded value)
   * @exception NumberIsTooSmallException if the step is too small and acceptSmall is false
   */
  protected double filterStep(final double h, final boolean forward, final boolean acceptSmall)
    throws NumberIsTooSmallException {try{__CLR4_4_1pqipqilb90p9ef.R.inc(33450);

      __CLR4_4_1pqipqilb90p9ef.R.inc(33451);double filteredH = h;
      __CLR4_4_1pqipqilb90p9ef.R.inc(33452);if ((((FastMath.abs(h) < minStep)&&(__CLR4_4_1pqipqilb90p9ef.R.iget(33453)!=0|true))||(__CLR4_4_1pqipqilb90p9ef.R.iget(33454)==0&false))) {{
          __CLR4_4_1pqipqilb90p9ef.R.inc(33455);if ((((acceptSmall)&&(__CLR4_4_1pqipqilb90p9ef.R.iget(33456)!=0|true))||(__CLR4_4_1pqipqilb90p9ef.R.iget(33457)==0&false))) {{
              __CLR4_4_1pqipqilb90p9ef.R.inc(33458);filteredH = (((forward )&&(__CLR4_4_1pqipqilb90p9ef.R.iget(33459)!=0|true))||(__CLR4_4_1pqipqilb90p9ef.R.iget(33460)==0&false))? minStep : -minStep;
          } }else {{
              __CLR4_4_1pqipqilb90p9ef.R.inc(33461);throw new NumberIsTooSmallException(LocalizedFormats.MINIMAL_STEPSIZE_REACHED_DURING_INTEGRATION,
                                                  FastMath.abs(h), minStep, true);
          }
      }}

      }__CLR4_4_1pqipqilb90p9ef.R.inc(33462);if ((((filteredH > maxStep)&&(__CLR4_4_1pqipqilb90p9ef.R.iget(33463)!=0|true))||(__CLR4_4_1pqipqilb90p9ef.R.iget(33464)==0&false))) {{
          __CLR4_4_1pqipqilb90p9ef.R.inc(33465);filteredH = maxStep;
      } }else {__CLR4_4_1pqipqilb90p9ef.R.inc(33466);if ((((filteredH < -maxStep)&&(__CLR4_4_1pqipqilb90p9ef.R.iget(33467)!=0|true))||(__CLR4_4_1pqipqilb90p9ef.R.iget(33468)==0&false))) {{
          __CLR4_4_1pqipqilb90p9ef.R.inc(33469);filteredH = -maxStep;
      }

      }}__CLR4_4_1pqipqilb90p9ef.R.inc(33470);return filteredH;

  }finally{__CLR4_4_1pqipqilb90p9ef.R.flushNeeded();}}

  /** {@inheritDoc} */
  @Override
  public abstract void integrate (ExpandableStatefulODE equations, double t)
      throws NumberIsTooSmallException, DimensionMismatchException,
             MaxCountExceededException, NoBracketingException;

  /** {@inheritDoc} */
  @Override
  public double getCurrentStepStart() {try{__CLR4_4_1pqipqilb90p9ef.R.inc(33471);
    __CLR4_4_1pqipqilb90p9ef.R.inc(33472);return stepStart;
  }finally{__CLR4_4_1pqipqilb90p9ef.R.flushNeeded();}}

  /** Reset internal state to dummy values. */
  protected void resetInternalState() {try{__CLR4_4_1pqipqilb90p9ef.R.inc(33473);
    __CLR4_4_1pqipqilb90p9ef.R.inc(33474);stepStart = Double.NaN;
    __CLR4_4_1pqipqilb90p9ef.R.inc(33475);stepSize  = FastMath.sqrt(minStep * maxStep);
  }finally{__CLR4_4_1pqipqilb90p9ef.R.flushNeeded();}}

  /** Get the minimal step.
   * @return minimal step
   */
  public double getMinStep() {try{__CLR4_4_1pqipqilb90p9ef.R.inc(33476);
    __CLR4_4_1pqipqilb90p9ef.R.inc(33477);return minStep;
  }finally{__CLR4_4_1pqipqilb90p9ef.R.flushNeeded();}}

  /** Get the maximal step.
   * @return maximal step
   */
  public double getMaxStep() {try{__CLR4_4_1pqipqilb90p9ef.R.inc(33478);
    __CLR4_4_1pqipqilb90p9ef.R.inc(33479);return maxStep;
  }finally{__CLR4_4_1pqipqilb90p9ef.R.flushNeeded();}}

}
