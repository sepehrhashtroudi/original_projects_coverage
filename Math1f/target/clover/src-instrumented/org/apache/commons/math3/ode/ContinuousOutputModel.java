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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.ode.sampling.StepHandler;
import org.apache.commons.math3.ode.sampling.StepInterpolator;
import org.apache.commons.math3.util.FastMath;

/**
 * This class stores all information provided by an ODE integrator
 * during the integration process and build a continuous model of the
 * solution from this.
 *
 * <p>This class act as a step handler from the integrator point of
 * view. It is called iteratively during the integration process and
 * stores a copy of all steps information in a sorted collection for
 * later use. Once the integration process is over, the user can use
 * the {@link #setInterpolatedTime setInterpolatedTime} and {@link
 * #getInterpolatedState getInterpolatedState} to retrieve this
 * information at any time. It is important to wait for the
 * integration to be over before attempting to call {@link
 * #setInterpolatedTime setInterpolatedTime} because some internal
 * variables are set only once the last step has been handled.</p>
 *
 * <p>This is useful for example if the main loop of the user
 * application should remain independent from the integration process
 * or if one needs to mimic the behaviour of an analytical model
 * despite a numerical model is used (i.e. one needs the ability to
 * get the model value at any time or to navigate through the
 * data).</p>
 *
 * <p>If problem modeling is done with several separate
 * integration phases for contiguous intervals, the same
 * ContinuousOutputModel can be used as step handler for all
 * integration phases as long as they are performed in order and in
 * the same direction. As an example, one can extrapolate the
 * trajectory of a satellite with one model (i.e. one set of
 * differential equations) up to the beginning of a maneuver, use
 * another more complex model including thrusters modeling and
 * accurate attitude control during the maneuver, and revert to the
 * first model after the end of the maneuver. If the same continuous
 * output model handles the steps of all integration phases, the user
 * do not need to bother when the maneuver begins or ends, he has all
 * the data available in a transparent manner.</p>
 *
 * <p>An important feature of this class is that it implements the
 * <code>Serializable</code> interface. This means that the result of
 * an integration can be serialized and reused later (if stored into a
 * persistent medium like a filesystem or a database) or elsewhere (if
 * sent to another application). Only the result of the integration is
 * stored, there is no reference to the integrated problem by
 * itself.</p>
 *
 * <p>One should be aware that the amount of data stored in a
 * ContinuousOutputModel instance can be important if the state vector
 * is large, if the integration interval is long or if the steps are
 * small (which can result from small tolerance settings in {@link
 * org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator adaptive
 * step size integrators}).</p>
 *
 * @see StepHandler
 * @see StepInterpolator
 * @version $Id$
 * @since 1.2
 */

public class ContinuousOutputModel
  implements StepHandler, Serializable {public static class __CLR4_4_1opaopalb90p99q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,32168,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier */
    private static final long serialVersionUID = -1417964919405031606L;

    /** Initial integration time. */
    private double initialTime;

    /** Final integration time. */
    private double finalTime;

    /** Integration direction indicator. */
    private boolean forward;

    /** Current interpolator index. */
    private int index;

    /** Steps table. */
    private List<StepInterpolator> steps;

  /** Simple constructor.
   * Build an empty continuous output model.
   */
  public ContinuousOutputModel() {try{__CLR4_4_1opaopalb90p99q.R.inc(32014);
    __CLR4_4_1opaopalb90p99q.R.inc(32015);steps = new ArrayList<StepInterpolator>();
    __CLR4_4_1opaopalb90p99q.R.inc(32016);initialTime = Double.NaN;
    __CLR4_4_1opaopalb90p99q.R.inc(32017);finalTime   = Double.NaN;
    __CLR4_4_1opaopalb90p99q.R.inc(32018);forward     = true;
    __CLR4_4_1opaopalb90p99q.R.inc(32019);index       = 0;
  }finally{__CLR4_4_1opaopalb90p99q.R.flushNeeded();}}

  /** Append another model at the end of the instance.
   * @param model model to add at the end of the instance
   * @exception MathIllegalArgumentException if the model to append is not
   * compatible with the instance (dimension of the state vector,
   * propagation direction, hole between the dates)
   * @exception MaxCountExceededException if the number of functions evaluations is exceeded
   * during step finalization
   */
  public void append(final ContinuousOutputModel model)
    throws MathIllegalArgumentException, MaxCountExceededException {try{__CLR4_4_1opaopalb90p99q.R.inc(32020);

    __CLR4_4_1opaopalb90p99q.R.inc(32021);if ((((model.steps.size() == 0)&&(__CLR4_4_1opaopalb90p99q.R.iget(32022)!=0|true))||(__CLR4_4_1opaopalb90p99q.R.iget(32023)==0&false))) {{
      __CLR4_4_1opaopalb90p99q.R.inc(32024);return;
    }

    }__CLR4_4_1opaopalb90p99q.R.inc(32025);if ((((steps.size() == 0)&&(__CLR4_4_1opaopalb90p99q.R.iget(32026)!=0|true))||(__CLR4_4_1opaopalb90p99q.R.iget(32027)==0&false))) {{
      __CLR4_4_1opaopalb90p99q.R.inc(32028);initialTime = model.initialTime;
      __CLR4_4_1opaopalb90p99q.R.inc(32029);forward     = model.forward;
    } }else {{

      __CLR4_4_1opaopalb90p99q.R.inc(32030);if ((((getInterpolatedState().length != model.getInterpolatedState().length)&&(__CLR4_4_1opaopalb90p99q.R.iget(32031)!=0|true))||(__CLR4_4_1opaopalb90p99q.R.iget(32032)==0&false))) {{
          __CLR4_4_1opaopalb90p99q.R.inc(32033);throw new DimensionMismatchException(model.getInterpolatedState().length,
                                               getInterpolatedState().length);
      }

      }__CLR4_4_1opaopalb90p99q.R.inc(32034);if ((((forward ^ model.forward)&&(__CLR4_4_1opaopalb90p99q.R.iget(32035)!=0|true))||(__CLR4_4_1opaopalb90p99q.R.iget(32036)==0&false))) {{
          __CLR4_4_1opaopalb90p99q.R.inc(32037);throw new MathIllegalArgumentException(LocalizedFormats.PROPAGATION_DIRECTION_MISMATCH);
      }

      }__CLR4_4_1opaopalb90p99q.R.inc(32038);final StepInterpolator lastInterpolator = steps.get(index);
      __CLR4_4_1opaopalb90p99q.R.inc(32039);final double current  = lastInterpolator.getCurrentTime();
      __CLR4_4_1opaopalb90p99q.R.inc(32040);final double previous = lastInterpolator.getPreviousTime();
      __CLR4_4_1opaopalb90p99q.R.inc(32041);final double step = current - previous;
      __CLR4_4_1opaopalb90p99q.R.inc(32042);final double gap = model.getInitialTime() - current;
      __CLR4_4_1opaopalb90p99q.R.inc(32043);if ((((FastMath.abs(gap) > 1.0e-3 * FastMath.abs(step))&&(__CLR4_4_1opaopalb90p99q.R.iget(32044)!=0|true))||(__CLR4_4_1opaopalb90p99q.R.iget(32045)==0&false))) {{
        __CLR4_4_1opaopalb90p99q.R.inc(32046);throw new MathIllegalArgumentException(LocalizedFormats.HOLE_BETWEEN_MODELS_TIME_RANGES,
                                               FastMath.abs(gap));
      }

    }}

    }__CLR4_4_1opaopalb90p99q.R.inc(32047);for (StepInterpolator interpolator : model.steps) {{
      __CLR4_4_1opaopalb90p99q.R.inc(32048);steps.add(interpolator.copy());
    }

    }__CLR4_4_1opaopalb90p99q.R.inc(32049);index = steps.size() - 1;
    __CLR4_4_1opaopalb90p99q.R.inc(32050);finalTime = (steps.get(index)).getCurrentTime();

  }finally{__CLR4_4_1opaopalb90p99q.R.flushNeeded();}}

  /** {@inheritDoc} */
  public void init(double t0, double[] y0, double t) {try{__CLR4_4_1opaopalb90p99q.R.inc(32051);
    __CLR4_4_1opaopalb90p99q.R.inc(32052);initialTime = Double.NaN;
    __CLR4_4_1opaopalb90p99q.R.inc(32053);finalTime   = Double.NaN;
    __CLR4_4_1opaopalb90p99q.R.inc(32054);forward     = true;
    __CLR4_4_1opaopalb90p99q.R.inc(32055);index       = 0;
    __CLR4_4_1opaopalb90p99q.R.inc(32056);steps.clear();
  }finally{__CLR4_4_1opaopalb90p99q.R.flushNeeded();}}

  /** Handle the last accepted step.
   * A copy of the information provided by the last step is stored in
   * the instance for later use.
   * @param interpolator interpolator for the last accepted step.
   * @param isLast true if the step is the last one
   * @exception MaxCountExceededException if the number of functions evaluations is exceeded
   * during step finalization
   */
  public void handleStep(final StepInterpolator interpolator, final boolean isLast)
      throws MaxCountExceededException {try{__CLR4_4_1opaopalb90p99q.R.inc(32057);

    __CLR4_4_1opaopalb90p99q.R.inc(32058);if ((((steps.size() == 0)&&(__CLR4_4_1opaopalb90p99q.R.iget(32059)!=0|true))||(__CLR4_4_1opaopalb90p99q.R.iget(32060)==0&false))) {{
      __CLR4_4_1opaopalb90p99q.R.inc(32061);initialTime = interpolator.getPreviousTime();
      __CLR4_4_1opaopalb90p99q.R.inc(32062);forward     = interpolator.isForward();
    }

    }__CLR4_4_1opaopalb90p99q.R.inc(32063);steps.add(interpolator.copy());

    __CLR4_4_1opaopalb90p99q.R.inc(32064);if ((((isLast)&&(__CLR4_4_1opaopalb90p99q.R.iget(32065)!=0|true))||(__CLR4_4_1opaopalb90p99q.R.iget(32066)==0&false))) {{
      __CLR4_4_1opaopalb90p99q.R.inc(32067);finalTime = interpolator.getCurrentTime();
      __CLR4_4_1opaopalb90p99q.R.inc(32068);index     = steps.size() - 1;
    }

  }}finally{__CLR4_4_1opaopalb90p99q.R.flushNeeded();}}

  /**
   * Get the initial integration time.
   * @return initial integration time
   */
  public double getInitialTime() {try{__CLR4_4_1opaopalb90p99q.R.inc(32069);
    __CLR4_4_1opaopalb90p99q.R.inc(32070);return initialTime;
  }finally{__CLR4_4_1opaopalb90p99q.R.flushNeeded();}}

  /**
   * Get the final integration time.
   * @return final integration time
   */
  public double getFinalTime() {try{__CLR4_4_1opaopalb90p99q.R.inc(32071);
    __CLR4_4_1opaopalb90p99q.R.inc(32072);return finalTime;
  }finally{__CLR4_4_1opaopalb90p99q.R.flushNeeded();}}

  /**
   * Get the time of the interpolated point.
   * If {@link #setInterpolatedTime} has not been called, it returns
   * the final integration time.
   * @return interpolation point time
   */
  public double getInterpolatedTime() {try{__CLR4_4_1opaopalb90p99q.R.inc(32073);
    __CLR4_4_1opaopalb90p99q.R.inc(32074);return steps.get(index).getInterpolatedTime();
  }finally{__CLR4_4_1opaopalb90p99q.R.flushNeeded();}}

  /** Set the time of the interpolated point.
   * <p>This method should <strong>not</strong> be called before the
   * integration is over because some internal variables are set only
   * once the last step has been handled.</p>
   * <p>Setting the time outside of the integration interval is now
   * allowed (it was not allowed up to version 5.9 of Mantissa), but
   * should be used with care since the accuracy of the interpolator
   * will probably be very poor far from this interval. This allowance
   * has been added to simplify implementation of search algorithms
   * near the interval endpoints.</p>
   * @param time time of the interpolated point
   */
  public void setInterpolatedTime(final double time) {try{__CLR4_4_1opaopalb90p99q.R.inc(32075);

      // initialize the search with the complete steps table
      __CLR4_4_1opaopalb90p99q.R.inc(32076);int iMin = 0;
      __CLR4_4_1opaopalb90p99q.R.inc(32077);final StepInterpolator sMin = steps.get(iMin);
      __CLR4_4_1opaopalb90p99q.R.inc(32078);double tMin = 0.5 * (sMin.getPreviousTime() + sMin.getCurrentTime());

      __CLR4_4_1opaopalb90p99q.R.inc(32079);int iMax = steps.size() - 1;
      __CLR4_4_1opaopalb90p99q.R.inc(32080);final StepInterpolator sMax = steps.get(iMax);
      __CLR4_4_1opaopalb90p99q.R.inc(32081);double tMax = 0.5 * (sMax.getPreviousTime() + sMax.getCurrentTime());

      // handle points outside of the integration interval
      // or in the first and last step
      __CLR4_4_1opaopalb90p99q.R.inc(32082);if ((((locatePoint(time, sMin) <= 0)&&(__CLR4_4_1opaopalb90p99q.R.iget(32083)!=0|true))||(__CLR4_4_1opaopalb90p99q.R.iget(32084)==0&false))) {{
        __CLR4_4_1opaopalb90p99q.R.inc(32085);index = iMin;
        __CLR4_4_1opaopalb90p99q.R.inc(32086);sMin.setInterpolatedTime(time);
        __CLR4_4_1opaopalb90p99q.R.inc(32087);return;
      }
      }__CLR4_4_1opaopalb90p99q.R.inc(32088);if ((((locatePoint(time, sMax) >= 0)&&(__CLR4_4_1opaopalb90p99q.R.iget(32089)!=0|true))||(__CLR4_4_1opaopalb90p99q.R.iget(32090)==0&false))) {{
        __CLR4_4_1opaopalb90p99q.R.inc(32091);index = iMax;
        __CLR4_4_1opaopalb90p99q.R.inc(32092);sMax.setInterpolatedTime(time);
        __CLR4_4_1opaopalb90p99q.R.inc(32093);return;
      }

      // reduction of the table slice size
      }__CLR4_4_1opaopalb90p99q.R.inc(32094);while ((((iMax - iMin > 5)&&(__CLR4_4_1opaopalb90p99q.R.iget(32095)!=0|true))||(__CLR4_4_1opaopalb90p99q.R.iget(32096)==0&false))) {{

        // use the last estimated index as the splitting index
        __CLR4_4_1opaopalb90p99q.R.inc(32097);final StepInterpolator si = steps.get(index);
        __CLR4_4_1opaopalb90p99q.R.inc(32098);final int location = locatePoint(time, si);
        __CLR4_4_1opaopalb90p99q.R.inc(32099);if ((((location < 0)&&(__CLR4_4_1opaopalb90p99q.R.iget(32100)!=0|true))||(__CLR4_4_1opaopalb90p99q.R.iget(32101)==0&false))) {{
          __CLR4_4_1opaopalb90p99q.R.inc(32102);iMax = index;
          __CLR4_4_1opaopalb90p99q.R.inc(32103);tMax = 0.5 * (si.getPreviousTime() + si.getCurrentTime());
        } }else {__CLR4_4_1opaopalb90p99q.R.inc(32104);if ((((location > 0)&&(__CLR4_4_1opaopalb90p99q.R.iget(32105)!=0|true))||(__CLR4_4_1opaopalb90p99q.R.iget(32106)==0&false))) {{
          __CLR4_4_1opaopalb90p99q.R.inc(32107);iMin = index;
          __CLR4_4_1opaopalb90p99q.R.inc(32108);tMin = 0.5 * (si.getPreviousTime() + si.getCurrentTime());
        } }else {{
          // we have found the target step, no need to continue searching
          __CLR4_4_1opaopalb90p99q.R.inc(32109);si.setInterpolatedTime(time);
          __CLR4_4_1opaopalb90p99q.R.inc(32110);return;
        }

        // compute a new estimate of the index in the reduced table slice
        }}__CLR4_4_1opaopalb90p99q.R.inc(32111);final int iMed = (iMin + iMax) / 2;
        __CLR4_4_1opaopalb90p99q.R.inc(32112);final StepInterpolator sMed = steps.get(iMed);
        __CLR4_4_1opaopalb90p99q.R.inc(32113);final double tMed = 0.5 * (sMed.getPreviousTime() + sMed.getCurrentTime());

        __CLR4_4_1opaopalb90p99q.R.inc(32114);if (((((FastMath.abs(tMed - tMin) < 1e-6) || (FastMath.abs(tMax - tMed) < 1e-6))&&(__CLR4_4_1opaopalb90p99q.R.iget(32115)!=0|true))||(__CLR4_4_1opaopalb90p99q.R.iget(32116)==0&false))) {{
          // too close to the bounds, we estimate using a simple dichotomy
          __CLR4_4_1opaopalb90p99q.R.inc(32117);index = iMed;
        } }else {{
          // estimate the index using a reverse quadratic polynom
          // (reverse means we have i = P(t), thus allowing to simply
          // compute index = P(time) rather than solving a quadratic equation)
          __CLR4_4_1opaopalb90p99q.R.inc(32118);final double d12 = tMax - tMed;
          __CLR4_4_1opaopalb90p99q.R.inc(32119);final double d23 = tMed - tMin;
          __CLR4_4_1opaopalb90p99q.R.inc(32120);final double d13 = tMax - tMin;
          __CLR4_4_1opaopalb90p99q.R.inc(32121);final double dt1 = time - tMax;
          __CLR4_4_1opaopalb90p99q.R.inc(32122);final double dt2 = time - tMed;
          __CLR4_4_1opaopalb90p99q.R.inc(32123);final double dt3 = time - tMin;
          __CLR4_4_1opaopalb90p99q.R.inc(32124);final double iLagrange = ((dt2 * dt3 * d23) * iMax -
                                    (dt1 * dt3 * d13) * iMed +
                                    (dt1 * dt2 * d12) * iMin) /
                                   (d12 * d23 * d13);
          __CLR4_4_1opaopalb90p99q.R.inc(32125);index = (int) FastMath.rint(iLagrange);
        }

        // force the next size reduction to be at least one tenth
        }__CLR4_4_1opaopalb90p99q.R.inc(32126);final int low  = FastMath.max(iMin + 1, (9 * iMin + iMax) / 10);
        __CLR4_4_1opaopalb90p99q.R.inc(32127);final int high = FastMath.min(iMax - 1, (iMin + 9 * iMax) / 10);
        __CLR4_4_1opaopalb90p99q.R.inc(32128);if ((((index < low)&&(__CLR4_4_1opaopalb90p99q.R.iget(32129)!=0|true))||(__CLR4_4_1opaopalb90p99q.R.iget(32130)==0&false))) {{
          __CLR4_4_1opaopalb90p99q.R.inc(32131);index = low;
        } }else {__CLR4_4_1opaopalb90p99q.R.inc(32132);if ((((index > high)&&(__CLR4_4_1opaopalb90p99q.R.iget(32133)!=0|true))||(__CLR4_4_1opaopalb90p99q.R.iget(32134)==0&false))) {{
          __CLR4_4_1opaopalb90p99q.R.inc(32135);index = high;
        }

      }}}

      // now the table slice is very small, we perform an iterative search
      }__CLR4_4_1opaopalb90p99q.R.inc(32136);index = iMin;
      __CLR4_4_1opaopalb90p99q.R.inc(32137);while (((((index <= iMax) && (locatePoint(time, steps.get(index)) > 0))&&(__CLR4_4_1opaopalb90p99q.R.iget(32138)!=0|true))||(__CLR4_4_1opaopalb90p99q.R.iget(32139)==0&false))) {{
        __CLR4_4_1opaopalb90p99q.R.inc(32140);++index;
      }

      }__CLR4_4_1opaopalb90p99q.R.inc(32141);steps.get(index).setInterpolatedTime(time);

  }finally{__CLR4_4_1opaopalb90p99q.R.flushNeeded();}}

  /**
   * Get the state vector of the interpolated point.
   * @return state vector at time {@link #getInterpolatedTime}
   * @exception MaxCountExceededException if the number of functions evaluations is exceeded
   * @see #getInterpolatedSecondaryState(int)
   */
  public double[] getInterpolatedState() throws MaxCountExceededException {try{__CLR4_4_1opaopalb90p99q.R.inc(32142);
    __CLR4_4_1opaopalb90p99q.R.inc(32143);return steps.get(index).getInterpolatedState();
  }finally{__CLR4_4_1opaopalb90p99q.R.flushNeeded();}}

  /** Get the interpolated secondary state corresponding to the secondary equations.
   * @param secondaryStateIndex index of the secondary set, as returned by {@link
   * org.apache.commons.math3.ode.ExpandableStatefulODE#addSecondaryEquations(
   * org.apache.commons.math3.ode.SecondaryEquations)
   * ExpandableStatefulODE.addSecondaryEquations(SecondaryEquations)}
   * @return interpolated secondary state at the current interpolation date
   * @see #getInterpolatedState()
   * @since 3.2
   * @exception MaxCountExceededException if the number of functions evaluations is exceeded
   */
  public double[] getInterpolatedSecondaryState(final int secondaryStateIndex)
    throws MaxCountExceededException {try{__CLR4_4_1opaopalb90p99q.R.inc(32144);
    __CLR4_4_1opaopalb90p99q.R.inc(32145);return steps.get(index).getInterpolatedSecondaryState(secondaryStateIndex);
  }finally{__CLR4_4_1opaopalb90p99q.R.flushNeeded();}}

  /** Compare a step interval and a double.
   * @param time point to locate
   * @param interval step interval
   * @return -1 if the double is before the interval, 0 if it is in
   * the interval, and +1 if it is after the interval, according to
   * the interval direction
   */
  private int locatePoint(final double time, final StepInterpolator interval) {try{__CLR4_4_1opaopalb90p99q.R.inc(32146);
    __CLR4_4_1opaopalb90p99q.R.inc(32147);if ((((forward)&&(__CLR4_4_1opaopalb90p99q.R.iget(32148)!=0|true))||(__CLR4_4_1opaopalb90p99q.R.iget(32149)==0&false))) {{
      __CLR4_4_1opaopalb90p99q.R.inc(32150);if ((((time < interval.getPreviousTime())&&(__CLR4_4_1opaopalb90p99q.R.iget(32151)!=0|true))||(__CLR4_4_1opaopalb90p99q.R.iget(32152)==0&false))) {{
        __CLR4_4_1opaopalb90p99q.R.inc(32153);return -1;
      } }else {__CLR4_4_1opaopalb90p99q.R.inc(32154);if ((((time > interval.getCurrentTime())&&(__CLR4_4_1opaopalb90p99q.R.iget(32155)!=0|true))||(__CLR4_4_1opaopalb90p99q.R.iget(32156)==0&false))) {{
        __CLR4_4_1opaopalb90p99q.R.inc(32157);return +1;
      } }else {{
        __CLR4_4_1opaopalb90p99q.R.inc(32158);return 0;
      }
    }}}
    }__CLR4_4_1opaopalb90p99q.R.inc(32159);if ((((time > interval.getPreviousTime())&&(__CLR4_4_1opaopalb90p99q.R.iget(32160)!=0|true))||(__CLR4_4_1opaopalb90p99q.R.iget(32161)==0&false))) {{
      __CLR4_4_1opaopalb90p99q.R.inc(32162);return -1;
    } }else {__CLR4_4_1opaopalb90p99q.R.inc(32163);if ((((time < interval.getCurrentTime())&&(__CLR4_4_1opaopalb90p99q.R.iget(32164)!=0|true))||(__CLR4_4_1opaopalb90p99q.R.iget(32165)==0&false))) {{
      __CLR4_4_1opaopalb90p99q.R.inc(32166);return +1;
    } }else {{
      __CLR4_4_1opaopalb90p99q.R.inc(32167);return 0;
    }
  }}}finally{__CLR4_4_1opaopalb90p99q.R.flushNeeded();}}

}
