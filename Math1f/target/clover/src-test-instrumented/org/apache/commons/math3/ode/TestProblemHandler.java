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

import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.ode.sampling.StepHandler;
import org.apache.commons.math3.ode.sampling.StepInterpolator;
import org.apache.commons.math3.util.FastMath;

/**
 * This class is used to handle steps for the test problems
 * integrated during the junit tests for the ODE integrators.
 */
public class TestProblemHandler
  implements StepHandler {static class __CLR4_4_11yrv1yrvlb90pdiq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,91782,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  /** Associated problem. */
  private TestProblemAbstract problem;

  /** Maximal errors encountered during the integration. */
  private double maxValueError;
  private double maxTimeError;

  /** Error at the end of the integration. */
  private double lastError;

  /** Time at the end of integration. */
  private double lastTime;

  /** ODE solver used. */
  private ODEIntegrator integrator;

  /** Expected start for step. */
  private double expectedStepStart;

  /**
   * Simple constructor.
   * @param problem problem for which steps should be handled
   * @param integrator ODE solver used
   */
  public TestProblemHandler(TestProblemAbstract problem, ODEIntegrator integrator) {try{__CLR4_4_11yrv1yrvlb90pdiq.R.inc(91723);
    __CLR4_4_11yrv1yrvlb90pdiq.R.inc(91724);this.problem = problem;
    __CLR4_4_11yrv1yrvlb90pdiq.R.inc(91725);this.integrator = integrator;
    __CLR4_4_11yrv1yrvlb90pdiq.R.inc(91726);maxValueError = 0;
    __CLR4_4_11yrv1yrvlb90pdiq.R.inc(91727);maxTimeError  = 0;
    __CLR4_4_11yrv1yrvlb90pdiq.R.inc(91728);lastError     = 0;
    __CLR4_4_11yrv1yrvlb90pdiq.R.inc(91729);expectedStepStart = Double.NaN;
  }finally{__CLR4_4_11yrv1yrvlb90pdiq.R.flushNeeded();}}

  public void init(double t0, double[] y0, double t) {try{__CLR4_4_11yrv1yrvlb90pdiq.R.inc(91730);
    __CLR4_4_11yrv1yrvlb90pdiq.R.inc(91731);maxValueError = 0;
    __CLR4_4_11yrv1yrvlb90pdiq.R.inc(91732);maxTimeError  = 0;
    __CLR4_4_11yrv1yrvlb90pdiq.R.inc(91733);lastError     = 0;
    __CLR4_4_11yrv1yrvlb90pdiq.R.inc(91734);expectedStepStart = Double.NaN;
  }finally{__CLR4_4_11yrv1yrvlb90pdiq.R.flushNeeded();}}

  public void handleStep(StepInterpolator interpolator, boolean isLast) throws MaxCountExceededException {try{__CLR4_4_11yrv1yrvlb90pdiq.R.inc(91735);

    __CLR4_4_11yrv1yrvlb90pdiq.R.inc(91736);double start = integrator.getCurrentStepStart();
    __CLR4_4_11yrv1yrvlb90pdiq.R.inc(91737);if ((((FastMath.abs((start - problem.getInitialTime()) / integrator.getCurrentSignedStepsize()) > 0.001)&&(__CLR4_4_11yrv1yrvlb90pdiq.R.iget(91738)!=0|true))||(__CLR4_4_11yrv1yrvlb90pdiq.R.iget(91739)==0&false))) {{
        // multistep integrators do not handle the first steps themselves
        // so we have to make sure the integrator we look at has really started its work
        __CLR4_4_11yrv1yrvlb90pdiq.R.inc(91740);if ((((!Double.isNaN(expectedStepStart))&&(__CLR4_4_11yrv1yrvlb90pdiq.R.iget(91741)!=0|true))||(__CLR4_4_11yrv1yrvlb90pdiq.R.iget(91742)==0&false))) {{
            // the step should either start at the end of the integrator step
            // or at an event if the step is split into several substeps
            __CLR4_4_11yrv1yrvlb90pdiq.R.inc(91743);double stepError = FastMath.max(maxTimeError, FastMath.abs(start - expectedStepStart));
            __CLR4_4_11yrv1yrvlb90pdiq.R.inc(91744);for (double eventTime : problem.getTheoreticalEventsTimes()) {{
                __CLR4_4_11yrv1yrvlb90pdiq.R.inc(91745);stepError = FastMath.min(stepError, FastMath.abs(start - eventTime));
            }
            }__CLR4_4_11yrv1yrvlb90pdiq.R.inc(91746);maxTimeError = FastMath.max(maxTimeError, stepError);
        }
        }__CLR4_4_11yrv1yrvlb90pdiq.R.inc(91747);expectedStepStart = start + integrator.getCurrentSignedStepsize();
    }

    }__CLR4_4_11yrv1yrvlb90pdiq.R.inc(91748);double pT = interpolator.getPreviousTime();
    __CLR4_4_11yrv1yrvlb90pdiq.R.inc(91749);double cT = interpolator.getCurrentTime();
    __CLR4_4_11yrv1yrvlb90pdiq.R.inc(91750);double[] errorScale = problem.getErrorScale();

    // store the error at the last step
    __CLR4_4_11yrv1yrvlb90pdiq.R.inc(91751);if ((((isLast)&&(__CLR4_4_11yrv1yrvlb90pdiq.R.iget(91752)!=0|true))||(__CLR4_4_11yrv1yrvlb90pdiq.R.iget(91753)==0&false))) {{
      __CLR4_4_11yrv1yrvlb90pdiq.R.inc(91754);double[] interpolatedY = interpolator.getInterpolatedState();
      __CLR4_4_11yrv1yrvlb90pdiq.R.inc(91755);double[] theoreticalY  = problem.computeTheoreticalState(cT);
      __CLR4_4_11yrv1yrvlb90pdiq.R.inc(91756);for (int i = 0; (((i < interpolatedY.length)&&(__CLR4_4_11yrv1yrvlb90pdiq.R.iget(91757)!=0|true))||(__CLR4_4_11yrv1yrvlb90pdiq.R.iget(91758)==0&false)); ++i) {{
        __CLR4_4_11yrv1yrvlb90pdiq.R.inc(91759);double error = FastMath.abs(interpolatedY[i] - theoreticalY[i]);
        __CLR4_4_11yrv1yrvlb90pdiq.R.inc(91760);lastError = FastMath.max(error, lastError);
      }
      }__CLR4_4_11yrv1yrvlb90pdiq.R.inc(91761);lastTime = cT;
    }

    // walk through the step
    }__CLR4_4_11yrv1yrvlb90pdiq.R.inc(91762);for (int k = 0; (((k <= 20)&&(__CLR4_4_11yrv1yrvlb90pdiq.R.iget(91763)!=0|true))||(__CLR4_4_11yrv1yrvlb90pdiq.R.iget(91764)==0&false)); ++k) {{

      __CLR4_4_11yrv1yrvlb90pdiq.R.inc(91765);double time = pT + (k * (cT - pT)) / 20;
      __CLR4_4_11yrv1yrvlb90pdiq.R.inc(91766);interpolator.setInterpolatedTime(time);
      __CLR4_4_11yrv1yrvlb90pdiq.R.inc(91767);double[] interpolatedY = interpolator.getInterpolatedState();
      __CLR4_4_11yrv1yrvlb90pdiq.R.inc(91768);double[] theoreticalY  = problem.computeTheoreticalState(interpolator.getInterpolatedTime());

      // update the errors
      __CLR4_4_11yrv1yrvlb90pdiq.R.inc(91769);for (int i = 0; (((i < interpolatedY.length)&&(__CLR4_4_11yrv1yrvlb90pdiq.R.iget(91770)!=0|true))||(__CLR4_4_11yrv1yrvlb90pdiq.R.iget(91771)==0&false)); ++i) {{
        __CLR4_4_11yrv1yrvlb90pdiq.R.inc(91772);double error = errorScale[i] * FastMath.abs(interpolatedY[i] - theoreticalY[i]);
        __CLR4_4_11yrv1yrvlb90pdiq.R.inc(91773);maxValueError = FastMath.max(error, maxValueError);
      }
    }}
  }}finally{__CLR4_4_11yrv1yrvlb90pdiq.R.flushNeeded();}}

  /**
   * Get the maximal value error encountered during integration.
   * @return maximal value error
   */
  public double getMaximalValueError() {try{__CLR4_4_11yrv1yrvlb90pdiq.R.inc(91774);
    __CLR4_4_11yrv1yrvlb90pdiq.R.inc(91775);return maxValueError;
  }finally{__CLR4_4_11yrv1yrvlb90pdiq.R.flushNeeded();}}

  /**
   * Get the maximal time error encountered during integration.
   * @return maximal time error
   */
  public double getMaximalTimeError() {try{__CLR4_4_11yrv1yrvlb90pdiq.R.inc(91776);
    __CLR4_4_11yrv1yrvlb90pdiq.R.inc(91777);return maxTimeError;
  }finally{__CLR4_4_11yrv1yrvlb90pdiq.R.flushNeeded();}}

  /**
   * Get the error at the end of the integration.
   * @return error at the end of the integration
   */
  public double getLastError() {try{__CLR4_4_11yrv1yrvlb90pdiq.R.inc(91778);
    __CLR4_4_11yrv1yrvlb90pdiq.R.inc(91779);return lastError;
  }finally{__CLR4_4_11yrv1yrvlb90pdiq.R.flushNeeded();}}

  /**
   * Get the time at the end of the integration.
   * @return time at the end of the integration.
   */
  public double getLastTime() {try{__CLR4_4_11yrv1yrvlb90pdiq.R.inc(91780);
    __CLR4_4_11yrv1yrvlb90pdiq.R.inc(91781);return lastTime;
  }finally{__CLR4_4_11yrv1yrvlb90pdiq.R.flushNeeded();}}

}
