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
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.util.FastMath;

/**
 * This class implements the common part of all embedded Runge-Kutta
 * integrators for Ordinary Differential Equations.
 *
 * <p>These methods are embedded explicit Runge-Kutta methods with two
 * sets of coefficients allowing to estimate the error, their Butcher
 * arrays are as follows :
 * <pre>
 *    0  |
 *   c2  | a21
 *   c3  | a31  a32
 *   ... |        ...
 *   cs  | as1  as2  ...  ass-1
 *       |--------------------------
 *       |  b1   b2  ...   bs-1  bs
 *       |  b'1  b'2 ...   b's-1 b's
 * </pre>
 * </p>
 *
 * <p>In fact, we rather use the array defined by ej = bj - b'j to
 * compute directly the error rather than computing two estimates and
 * then comparing them.</p>
 *
 * <p>Some methods are qualified as <i>fsal</i> (first same as last)
 * methods. This means the last evaluation of the derivatives in one
 * step is the same as the first in the next step. Then, this
 * evaluation can be reused from one step to the next one and the cost
 * of such a method is really s-1 evaluations despite the method still
 * has s stages. This behaviour is true only for successful steps, if
 * the step is rejected after the error estimation phase, no
 * evaluation is saved. For an <i>fsal</i> method, we have cs = 1 and
 * asi = bi for all i.</p>
 *
 * @version $Id$
 * @since 1.2
 */

public abstract class EmbeddedRungeKuttaIntegrator
  extends AdaptiveStepsizeIntegrator {public static class __CLR4_4_1q38q38lb90p9gs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,33964,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Indicator for <i>fsal</i> methods. */
    private final boolean fsal;

    /** Time steps from Butcher array (without the first zero). */
    private final double[] c;

    /** Internal weights from Butcher array (without the first empty row). */
    private final double[][] a;

    /** External weights for the high order method from Butcher array. */
    private final double[] b;

    /** Prototype of the step interpolator. */
    private final RungeKuttaStepInterpolator prototype;

    /** Stepsize control exponent. */
    private final double exp;

    /** Safety factor for stepsize control. */
    private double safety;

    /** Minimal reduction factor for stepsize control. */
    private double minReduction;

    /** Maximal growth factor for stepsize control. */
    private double maxGrowth;

  /** Build a Runge-Kutta integrator with the given Butcher array.
   * @param name name of the method
   * @param fsal indicate that the method is an <i>fsal</i>
   * @param c time steps from Butcher array (without the first zero)
   * @param a internal weights from Butcher array (without the first empty row)
   * @param b propagation weights for the high order method from Butcher array
   * @param prototype prototype of the step interpolator to use
   * @param minStep minimal step (sign is irrelevant, regardless of
   * integration direction, forward or backward), the last step can
   * be smaller than this
   * @param maxStep maximal step (sign is irrelevant, regardless of
   * integration direction, forward or backward), the last step can
   * be smaller than this
   * @param scalAbsoluteTolerance allowed absolute error
   * @param scalRelativeTolerance allowed relative error
   */
  protected EmbeddedRungeKuttaIntegrator(final String name, final boolean fsal,
                                         final double[] c, final double[][] a, final double[] b,
                                         final RungeKuttaStepInterpolator prototype,
                                         final double minStep, final double maxStep,
                                         final double scalAbsoluteTolerance,
                                         final double scalRelativeTolerance) {

    super(name, minStep, maxStep, scalAbsoluteTolerance, scalRelativeTolerance);__CLR4_4_1q38q38lb90p9gs.R.inc(33813);try{__CLR4_4_1q38q38lb90p9gs.R.inc(33812);

    __CLR4_4_1q38q38lb90p9gs.R.inc(33814);this.fsal      = fsal;
    __CLR4_4_1q38q38lb90p9gs.R.inc(33815);this.c         = c;
    __CLR4_4_1q38q38lb90p9gs.R.inc(33816);this.a         = a;
    __CLR4_4_1q38q38lb90p9gs.R.inc(33817);this.b         = b;
    __CLR4_4_1q38q38lb90p9gs.R.inc(33818);this.prototype = prototype;

    __CLR4_4_1q38q38lb90p9gs.R.inc(33819);exp = -1.0 / getOrder();

    // set the default values of the algorithm control parameters
    __CLR4_4_1q38q38lb90p9gs.R.inc(33820);setSafety(0.9);
    __CLR4_4_1q38q38lb90p9gs.R.inc(33821);setMinReduction(0.2);
    __CLR4_4_1q38q38lb90p9gs.R.inc(33822);setMaxGrowth(10.0);

  }finally{__CLR4_4_1q38q38lb90p9gs.R.flushNeeded();}}

  /** Build a Runge-Kutta integrator with the given Butcher array.
   * @param name name of the method
   * @param fsal indicate that the method is an <i>fsal</i>
   * @param c time steps from Butcher array (without the first zero)
   * @param a internal weights from Butcher array (without the first empty row)
   * @param b propagation weights for the high order method from Butcher array
   * @param prototype prototype of the step interpolator to use
   * @param minStep minimal step (must be positive even for backward
   * integration), the last step can be smaller than this
   * @param maxStep maximal step (must be positive even for backward
   * integration)
   * @param vecAbsoluteTolerance allowed absolute error
   * @param vecRelativeTolerance allowed relative error
   */
  protected EmbeddedRungeKuttaIntegrator(final String name, final boolean fsal,
                                         final double[] c, final double[][] a, final double[] b,
                                         final RungeKuttaStepInterpolator prototype,
                                         final double   minStep, final double maxStep,
                                         final double[] vecAbsoluteTolerance,
                                         final double[] vecRelativeTolerance) {

    super(name, minStep, maxStep, vecAbsoluteTolerance, vecRelativeTolerance);__CLR4_4_1q38q38lb90p9gs.R.inc(33824);try{__CLR4_4_1q38q38lb90p9gs.R.inc(33823);

    __CLR4_4_1q38q38lb90p9gs.R.inc(33825);this.fsal      = fsal;
    __CLR4_4_1q38q38lb90p9gs.R.inc(33826);this.c         = c;
    __CLR4_4_1q38q38lb90p9gs.R.inc(33827);this.a         = a;
    __CLR4_4_1q38q38lb90p9gs.R.inc(33828);this.b         = b;
    __CLR4_4_1q38q38lb90p9gs.R.inc(33829);this.prototype = prototype;

    __CLR4_4_1q38q38lb90p9gs.R.inc(33830);exp = -1.0 / getOrder();

    // set the default values of the algorithm control parameters
    __CLR4_4_1q38q38lb90p9gs.R.inc(33831);setSafety(0.9);
    __CLR4_4_1q38q38lb90p9gs.R.inc(33832);setMinReduction(0.2);
    __CLR4_4_1q38q38lb90p9gs.R.inc(33833);setMaxGrowth(10.0);

  }finally{__CLR4_4_1q38q38lb90p9gs.R.flushNeeded();}}

  /** Get the order of the method.
   * @return order of the method
   */
  public abstract int getOrder();

  /** Get the safety factor for stepsize control.
   * @return safety factor
   */
  public double getSafety() {try{__CLR4_4_1q38q38lb90p9gs.R.inc(33834);
    __CLR4_4_1q38q38lb90p9gs.R.inc(33835);return safety;
  }finally{__CLR4_4_1q38q38lb90p9gs.R.flushNeeded();}}

  /** Set the safety factor for stepsize control.
   * @param safety safety factor
   */
  public void setSafety(final double safety) {try{__CLR4_4_1q38q38lb90p9gs.R.inc(33836);
    __CLR4_4_1q38q38lb90p9gs.R.inc(33837);this.safety = safety;
  }finally{__CLR4_4_1q38q38lb90p9gs.R.flushNeeded();}}

  /** {@inheritDoc} */
  @Override
  public void integrate(final ExpandableStatefulODE equations, final double t)
      throws NumberIsTooSmallException, DimensionMismatchException,
             MaxCountExceededException, NoBracketingException {try{__CLR4_4_1q38q38lb90p9gs.R.inc(33838);

    __CLR4_4_1q38q38lb90p9gs.R.inc(33839);sanityChecks(equations, t);
    __CLR4_4_1q38q38lb90p9gs.R.inc(33840);setEquations(equations);
    __CLR4_4_1q38q38lb90p9gs.R.inc(33841);final boolean forward = t > equations.getTime();

    // create some internal working arrays
    __CLR4_4_1q38q38lb90p9gs.R.inc(33842);final double[] y0  = equations.getCompleteState();
    __CLR4_4_1q38q38lb90p9gs.R.inc(33843);final double[] y = y0.clone();
    __CLR4_4_1q38q38lb90p9gs.R.inc(33844);final int stages = c.length + 1;
    __CLR4_4_1q38q38lb90p9gs.R.inc(33845);final double[][] yDotK = new double[stages][y.length];
    __CLR4_4_1q38q38lb90p9gs.R.inc(33846);final double[] yTmp    = y0.clone();
    __CLR4_4_1q38q38lb90p9gs.R.inc(33847);final double[] yDotTmp = new double[y.length];

    // set up an interpolator sharing the integrator arrays
    __CLR4_4_1q38q38lb90p9gs.R.inc(33848);final RungeKuttaStepInterpolator interpolator = (RungeKuttaStepInterpolator) prototype.copy();
    __CLR4_4_1q38q38lb90p9gs.R.inc(33849);interpolator.reinitialize(this, yTmp, yDotK, forward,
                              equations.getPrimaryMapper(), equations.getSecondaryMappers());
    __CLR4_4_1q38q38lb90p9gs.R.inc(33850);interpolator.storeTime(equations.getTime());

    // set up integration control objects
    __CLR4_4_1q38q38lb90p9gs.R.inc(33851);stepStart         = equations.getTime();
    __CLR4_4_1q38q38lb90p9gs.R.inc(33852);double  hNew      = 0;
    __CLR4_4_1q38q38lb90p9gs.R.inc(33853);boolean firstTime = true;
    __CLR4_4_1q38q38lb90p9gs.R.inc(33854);initIntegration(equations.getTime(), y0, t);

    // main integration loop
    __CLR4_4_1q38q38lb90p9gs.R.inc(33855);isLastStep = false;
    __CLR4_4_1q38q38lb90p9gs.R.inc(33856);do {{

      __CLR4_4_1q38q38lb90p9gs.R.inc(33857);interpolator.shift();

      // iterate over step size, ensuring local normalized error is smaller than 1
      __CLR4_4_1q38q38lb90p9gs.R.inc(33858);double error = 10;
      __CLR4_4_1q38q38lb90p9gs.R.inc(33859);while ((((error >= 1.0)&&(__CLR4_4_1q38q38lb90p9gs.R.iget(33860)!=0|true))||(__CLR4_4_1q38q38lb90p9gs.R.iget(33861)==0&false))) {{

        __CLR4_4_1q38q38lb90p9gs.R.inc(33862);if ((((firstTime || !fsal)&&(__CLR4_4_1q38q38lb90p9gs.R.iget(33863)!=0|true))||(__CLR4_4_1q38q38lb90p9gs.R.iget(33864)==0&false))) {{
          // first stage
          __CLR4_4_1q38q38lb90p9gs.R.inc(33865);computeDerivatives(stepStart, y, yDotK[0]);
        }

        }__CLR4_4_1q38q38lb90p9gs.R.inc(33866);if ((((firstTime)&&(__CLR4_4_1q38q38lb90p9gs.R.iget(33867)!=0|true))||(__CLR4_4_1q38q38lb90p9gs.R.iget(33868)==0&false))) {{
          __CLR4_4_1q38q38lb90p9gs.R.inc(33869);final double[] scale = new double[mainSetDimension];
          __CLR4_4_1q38q38lb90p9gs.R.inc(33870);if ((((vecAbsoluteTolerance == null)&&(__CLR4_4_1q38q38lb90p9gs.R.iget(33871)!=0|true))||(__CLR4_4_1q38q38lb90p9gs.R.iget(33872)==0&false))) {{
              __CLR4_4_1q38q38lb90p9gs.R.inc(33873);for (int i = 0; (((i < scale.length)&&(__CLR4_4_1q38q38lb90p9gs.R.iget(33874)!=0|true))||(__CLR4_4_1q38q38lb90p9gs.R.iget(33875)==0&false)); ++i) {{
                __CLR4_4_1q38q38lb90p9gs.R.inc(33876);scale[i] = scalAbsoluteTolerance + scalRelativeTolerance * FastMath.abs(y[i]);
              }
          }} }else {{
              __CLR4_4_1q38q38lb90p9gs.R.inc(33877);for (int i = 0; (((i < scale.length)&&(__CLR4_4_1q38q38lb90p9gs.R.iget(33878)!=0|true))||(__CLR4_4_1q38q38lb90p9gs.R.iget(33879)==0&false)); ++i) {{
                __CLR4_4_1q38q38lb90p9gs.R.inc(33880);scale[i] = vecAbsoluteTolerance[i] + vecRelativeTolerance[i] * FastMath.abs(y[i]);
              }
          }}
          }__CLR4_4_1q38q38lb90p9gs.R.inc(33881);hNew = initializeStep(forward, getOrder(), scale,
                                stepStart, y, yDotK[0], yTmp, yDotK[1]);
          __CLR4_4_1q38q38lb90p9gs.R.inc(33882);firstTime = false;
        }

        }__CLR4_4_1q38q38lb90p9gs.R.inc(33883);stepSize = hNew;
        __CLR4_4_1q38q38lb90p9gs.R.inc(33884);if ((((forward)&&(__CLR4_4_1q38q38lb90p9gs.R.iget(33885)!=0|true))||(__CLR4_4_1q38q38lb90p9gs.R.iget(33886)==0&false))) {{
            __CLR4_4_1q38q38lb90p9gs.R.inc(33887);if ((((stepStart + stepSize >= t)&&(__CLR4_4_1q38q38lb90p9gs.R.iget(33888)!=0|true))||(__CLR4_4_1q38q38lb90p9gs.R.iget(33889)==0&false))) {{
                __CLR4_4_1q38q38lb90p9gs.R.inc(33890);stepSize = t - stepStart;
            }
        }} }else {{
            __CLR4_4_1q38q38lb90p9gs.R.inc(33891);if ((((stepStart + stepSize <= t)&&(__CLR4_4_1q38q38lb90p9gs.R.iget(33892)!=0|true))||(__CLR4_4_1q38q38lb90p9gs.R.iget(33893)==0&false))) {{
                __CLR4_4_1q38q38lb90p9gs.R.inc(33894);stepSize = t - stepStart;
            }
        }}

        // next stages
        }__CLR4_4_1q38q38lb90p9gs.R.inc(33895);for (int k = 1; (((k < stages)&&(__CLR4_4_1q38q38lb90p9gs.R.iget(33896)!=0|true))||(__CLR4_4_1q38q38lb90p9gs.R.iget(33897)==0&false)); ++k) {{

          __CLR4_4_1q38q38lb90p9gs.R.inc(33898);for (int j = 0; (((j < y0.length)&&(__CLR4_4_1q38q38lb90p9gs.R.iget(33899)!=0|true))||(__CLR4_4_1q38q38lb90p9gs.R.iget(33900)==0&false)); ++j) {{
            __CLR4_4_1q38q38lb90p9gs.R.inc(33901);double sum = a[k-1][0] * yDotK[0][j];
            __CLR4_4_1q38q38lb90p9gs.R.inc(33902);for (int l = 1; (((l < k)&&(__CLR4_4_1q38q38lb90p9gs.R.iget(33903)!=0|true))||(__CLR4_4_1q38q38lb90p9gs.R.iget(33904)==0&false)); ++l) {{
              __CLR4_4_1q38q38lb90p9gs.R.inc(33905);sum += a[k-1][l] * yDotK[l][j];
            }
            }__CLR4_4_1q38q38lb90p9gs.R.inc(33906);yTmp[j] = y[j] + stepSize * sum;
          }

          }__CLR4_4_1q38q38lb90p9gs.R.inc(33907);computeDerivatives(stepStart + c[k-1] * stepSize, yTmp, yDotK[k]);

        }

        // estimate the state at the end of the step
        }__CLR4_4_1q38q38lb90p9gs.R.inc(33908);for (int j = 0; (((j < y0.length)&&(__CLR4_4_1q38q38lb90p9gs.R.iget(33909)!=0|true))||(__CLR4_4_1q38q38lb90p9gs.R.iget(33910)==0&false)); ++j) {{
          __CLR4_4_1q38q38lb90p9gs.R.inc(33911);double sum    = b[0] * yDotK[0][j];
          __CLR4_4_1q38q38lb90p9gs.R.inc(33912);for (int l = 1; (((l < stages)&&(__CLR4_4_1q38q38lb90p9gs.R.iget(33913)!=0|true))||(__CLR4_4_1q38q38lb90p9gs.R.iget(33914)==0&false)); ++l) {{
            __CLR4_4_1q38q38lb90p9gs.R.inc(33915);sum    += b[l] * yDotK[l][j];
          }
          }__CLR4_4_1q38q38lb90p9gs.R.inc(33916);yTmp[j] = y[j] + stepSize * sum;
        }

        // estimate the error at the end of the step
        }__CLR4_4_1q38q38lb90p9gs.R.inc(33917);error = estimateError(yDotK, y, yTmp, stepSize);
        __CLR4_4_1q38q38lb90p9gs.R.inc(33918);if ((((error >= 1.0)&&(__CLR4_4_1q38q38lb90p9gs.R.iget(33919)!=0|true))||(__CLR4_4_1q38q38lb90p9gs.R.iget(33920)==0&false))) {{
          // reject the step and attempt to reduce error by stepsize control
          __CLR4_4_1q38q38lb90p9gs.R.inc(33921);final double factor =
              FastMath.min(maxGrowth,
                           FastMath.max(minReduction, safety * FastMath.pow(error, exp)));
          __CLR4_4_1q38q38lb90p9gs.R.inc(33922);hNew = filterStep(stepSize * factor, forward, false);
        }

      }}

      // local error is small enough: accept the step, trigger events and step handlers
      }__CLR4_4_1q38q38lb90p9gs.R.inc(33923);interpolator.storeTime(stepStart + stepSize);
      __CLR4_4_1q38q38lb90p9gs.R.inc(33924);System.arraycopy(yTmp, 0, y, 0, y0.length);
      __CLR4_4_1q38q38lb90p9gs.R.inc(33925);System.arraycopy(yDotK[stages - 1], 0, yDotTmp, 0, y0.length);
      __CLR4_4_1q38q38lb90p9gs.R.inc(33926);stepStart = acceptStep(interpolator, y, yDotTmp, t);
      __CLR4_4_1q38q38lb90p9gs.R.inc(33927);System.arraycopy(y, 0, yTmp, 0, y.length);

      __CLR4_4_1q38q38lb90p9gs.R.inc(33928);if ((((!isLastStep)&&(__CLR4_4_1q38q38lb90p9gs.R.iget(33929)!=0|true))||(__CLR4_4_1q38q38lb90p9gs.R.iget(33930)==0&false))) {{

          // prepare next step
          __CLR4_4_1q38q38lb90p9gs.R.inc(33931);interpolator.storeTime(stepStart);

          __CLR4_4_1q38q38lb90p9gs.R.inc(33932);if ((((fsal)&&(__CLR4_4_1q38q38lb90p9gs.R.iget(33933)!=0|true))||(__CLR4_4_1q38q38lb90p9gs.R.iget(33934)==0&false))) {{
              // save the last evaluation for the next step
              __CLR4_4_1q38q38lb90p9gs.R.inc(33935);System.arraycopy(yDotTmp, 0, yDotK[0], 0, y0.length);
          }

          // stepsize control for next step
          }__CLR4_4_1q38q38lb90p9gs.R.inc(33936);final double factor =
              FastMath.min(maxGrowth, FastMath.max(minReduction, safety * FastMath.pow(error, exp)));
          __CLR4_4_1q38q38lb90p9gs.R.inc(33937);final double  scaledH    = stepSize * factor;
          __CLR4_4_1q38q38lb90p9gs.R.inc(33938);final double  nextT      = stepStart + scaledH;
          __CLR4_4_1q38q38lb90p9gs.R.inc(33939);final boolean nextIsLast = (((forward )&&(__CLR4_4_1q38q38lb90p9gs.R.iget(33940)!=0|true))||(__CLR4_4_1q38q38lb90p9gs.R.iget(33941)==0&false))? (nextT >= t) : (nextT <= t);
          __CLR4_4_1q38q38lb90p9gs.R.inc(33942);hNew = filterStep(scaledH, forward, nextIsLast);

          __CLR4_4_1q38q38lb90p9gs.R.inc(33943);final double  filteredNextT      = stepStart + hNew;
          __CLR4_4_1q38q38lb90p9gs.R.inc(33944);final boolean filteredNextIsLast = (((forward )&&(__CLR4_4_1q38q38lb90p9gs.R.iget(33945)!=0|true))||(__CLR4_4_1q38q38lb90p9gs.R.iget(33946)==0&false))? (filteredNextT >= t) : (filteredNextT <= t);
          __CLR4_4_1q38q38lb90p9gs.R.inc(33947);if ((((filteredNextIsLast)&&(__CLR4_4_1q38q38lb90p9gs.R.iget(33948)!=0|true))||(__CLR4_4_1q38q38lb90p9gs.R.iget(33949)==0&false))) {{
              __CLR4_4_1q38q38lb90p9gs.R.inc(33950);hNew = t - stepStart;
          }

      }}

    }} }while ((((!isLastStep)&&(__CLR4_4_1q38q38lb90p9gs.R.iget(33951)!=0|true))||(__CLR4_4_1q38q38lb90p9gs.R.iget(33952)==0&false)));

    // dispatch results
    __CLR4_4_1q38q38lb90p9gs.R.inc(33953);equations.setTime(stepStart);
    __CLR4_4_1q38q38lb90p9gs.R.inc(33954);equations.setCompleteState(y);

    __CLR4_4_1q38q38lb90p9gs.R.inc(33955);resetInternalState();

  }finally{__CLR4_4_1q38q38lb90p9gs.R.flushNeeded();}}

  /** Get the minimal reduction factor for stepsize control.
   * @return minimal reduction factor
   */
  public double getMinReduction() {try{__CLR4_4_1q38q38lb90p9gs.R.inc(33956);
    __CLR4_4_1q38q38lb90p9gs.R.inc(33957);return minReduction;
  }finally{__CLR4_4_1q38q38lb90p9gs.R.flushNeeded();}}

  /** Set the minimal reduction factor for stepsize control.
   * @param minReduction minimal reduction factor
   */
  public void setMinReduction(final double minReduction) {try{__CLR4_4_1q38q38lb90p9gs.R.inc(33958);
    __CLR4_4_1q38q38lb90p9gs.R.inc(33959);this.minReduction = minReduction;
  }finally{__CLR4_4_1q38q38lb90p9gs.R.flushNeeded();}}

  /** Get the maximal growth factor for stepsize control.
   * @return maximal growth factor
   */
  public double getMaxGrowth() {try{__CLR4_4_1q38q38lb90p9gs.R.inc(33960);
    __CLR4_4_1q38q38lb90p9gs.R.inc(33961);return maxGrowth;
  }finally{__CLR4_4_1q38q38lb90p9gs.R.flushNeeded();}}

  /** Set the maximal growth factor for stepsize control.
   * @param maxGrowth maximal growth factor
   */
  public void setMaxGrowth(final double maxGrowth) {try{__CLR4_4_1q38q38lb90p9gs.R.inc(33962);
    __CLR4_4_1q38q38lb90p9gs.R.inc(33963);this.maxGrowth = maxGrowth;
  }finally{__CLR4_4_1q38q38lb90p9gs.R.flushNeeded();}}

  /** Compute the error ratio.
   * @param yDotK derivatives computed during the first stages
   * @param y0 estimate of the step at the start of the step
   * @param y1 estimate of the step at the end of the step
   * @param h  current step
   * @return error ratio, greater than 1 if step should be rejected
   */
  protected abstract double estimateError(double[][] yDotK,
                                          double[] y0, double[] y1,
                                          double h);

}
