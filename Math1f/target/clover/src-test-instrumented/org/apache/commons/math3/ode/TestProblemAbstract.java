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

import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math3.ode.events.EventHandler;

/**
 * This class is used as the base class of the problems that are
 * integrated during the junit tests for the ODE integrators.
 */
public abstract class TestProblemAbstract
  implements FirstOrderDifferentialEquations {static class __CLR4_4_11yqe1yqelb90pdil{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,91720,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  /** Dimension of the problem. */
  protected int n;

  /** Number of functions calls. */
  protected int calls;

  /** Initial time */
  protected double t0;

  /** Initial state */
  protected double[] y0;

  /** Final time */
  protected double t1;

  /** Error scale */
  protected double[] errorScale;

  /**
   * Simple constructor.
   */
  protected TestProblemAbstract() {try{__CLR4_4_11yqe1yqelb90pdil.R.inc(91670);
    __CLR4_4_11yqe1yqelb90pdil.R.inc(91671);n          = 0;
    __CLR4_4_11yqe1yqelb90pdil.R.inc(91672);calls      = 0;
    __CLR4_4_11yqe1yqelb90pdil.R.inc(91673);t0         = 0;
    __CLR4_4_11yqe1yqelb90pdil.R.inc(91674);y0         = null;
    __CLR4_4_11yqe1yqelb90pdil.R.inc(91675);t1         = 0;
    __CLR4_4_11yqe1yqelb90pdil.R.inc(91676);errorScale = null;
  }finally{__CLR4_4_11yqe1yqelb90pdil.R.flushNeeded();}}

  /**
   * Copy constructor.
   * @param problem problem to copy
   */
  protected TestProblemAbstract(TestProblemAbstract problem) {try{__CLR4_4_11yqe1yqelb90pdil.R.inc(91677);
    __CLR4_4_11yqe1yqelb90pdil.R.inc(91678);n     = problem.n;
    __CLR4_4_11yqe1yqelb90pdil.R.inc(91679);calls = problem.calls;
    __CLR4_4_11yqe1yqelb90pdil.R.inc(91680);t0    = problem.t0;
    __CLR4_4_11yqe1yqelb90pdil.R.inc(91681);if ((((problem.y0 == null)&&(__CLR4_4_11yqe1yqelb90pdil.R.iget(91682)!=0|true))||(__CLR4_4_11yqe1yqelb90pdil.R.iget(91683)==0&false))) {{
      __CLR4_4_11yqe1yqelb90pdil.R.inc(91684);y0 = null;
    } }else {{
      __CLR4_4_11yqe1yqelb90pdil.R.inc(91685);y0 = problem.y0.clone();
    }
    }__CLR4_4_11yqe1yqelb90pdil.R.inc(91686);if ((((problem.errorScale == null)&&(__CLR4_4_11yqe1yqelb90pdil.R.iget(91687)!=0|true))||(__CLR4_4_11yqe1yqelb90pdil.R.iget(91688)==0&false))) {{
      __CLR4_4_11yqe1yqelb90pdil.R.inc(91689);errorScale = null;
    } }else {{
      __CLR4_4_11yqe1yqelb90pdil.R.inc(91690);errorScale = problem.errorScale.clone();
    }
    }__CLR4_4_11yqe1yqelb90pdil.R.inc(91691);t1 = problem.t1;
  }finally{__CLR4_4_11yqe1yqelb90pdil.R.flushNeeded();}}

  /**
   * Copy operation.
   * @return a copy of the instance
   */
  public abstract TestProblemAbstract copy();

  /**
   * Set the initial conditions
   * @param t0 initial time
   * @param y0 initial state vector
   */
  protected void setInitialConditions(double t0, double[] y0) {try{__CLR4_4_11yqe1yqelb90pdil.R.inc(91692);
    __CLR4_4_11yqe1yqelb90pdil.R.inc(91693);calls     = 0;
    __CLR4_4_11yqe1yqelb90pdil.R.inc(91694);n         = y0.length;
    __CLR4_4_11yqe1yqelb90pdil.R.inc(91695);this.t0   = t0;
    __CLR4_4_11yqe1yqelb90pdil.R.inc(91696);this.y0   = y0.clone();
   }finally{__CLR4_4_11yqe1yqelb90pdil.R.flushNeeded();}}

  /**
   * Set the final conditions.
   * @param t1 final time
   */
  protected void setFinalConditions(double t1) {try{__CLR4_4_11yqe1yqelb90pdil.R.inc(91697);
    __CLR4_4_11yqe1yqelb90pdil.R.inc(91698);this.t1 = t1;
  }finally{__CLR4_4_11yqe1yqelb90pdil.R.flushNeeded();}}

  /**
   * Set the error scale
   * @param errorScale error scale
   */
  protected void setErrorScale(double[] errorScale) {try{__CLR4_4_11yqe1yqelb90pdil.R.inc(91699);
    __CLR4_4_11yqe1yqelb90pdil.R.inc(91700);this.errorScale = errorScale.clone();
  }finally{__CLR4_4_11yqe1yqelb90pdil.R.flushNeeded();}}

  public int getDimension() {try{__CLR4_4_11yqe1yqelb90pdil.R.inc(91701);
    __CLR4_4_11yqe1yqelb90pdil.R.inc(91702);return n;
  }finally{__CLR4_4_11yqe1yqelb90pdil.R.flushNeeded();}}

  /**
   * Get the initial time.
   * @return initial time
   */
  public double getInitialTime() {try{__CLR4_4_11yqe1yqelb90pdil.R.inc(91703);
    __CLR4_4_11yqe1yqelb90pdil.R.inc(91704);return t0;
  }finally{__CLR4_4_11yqe1yqelb90pdil.R.flushNeeded();}}

  /**
   * Get the initial state vector.
   * @return initial state vector
   */
  public double[] getInitialState() {try{__CLR4_4_11yqe1yqelb90pdil.R.inc(91705);
    __CLR4_4_11yqe1yqelb90pdil.R.inc(91706);return y0;
  }finally{__CLR4_4_11yqe1yqelb90pdil.R.flushNeeded();}}

  /**
   * Get the final time.
   * @return final time
   */
  public double getFinalTime() {try{__CLR4_4_11yqe1yqelb90pdil.R.inc(91707);
    __CLR4_4_11yqe1yqelb90pdil.R.inc(91708);return t1;
  }finally{__CLR4_4_11yqe1yqelb90pdil.R.flushNeeded();}}

  /**
   * Get the error scale.
   * @return error scale
   */
  public double[] getErrorScale() {try{__CLR4_4_11yqe1yqelb90pdil.R.inc(91709);
    __CLR4_4_11yqe1yqelb90pdil.R.inc(91710);return errorScale;
  }finally{__CLR4_4_11yqe1yqelb90pdil.R.flushNeeded();}}

  /**
   * Get the events handlers.
   * @return events handlers   */
  public EventHandler[] getEventsHandlers() {try{__CLR4_4_11yqe1yqelb90pdil.R.inc(91711);
    __CLR4_4_11yqe1yqelb90pdil.R.inc(91712);return new EventHandler[0];
  }finally{__CLR4_4_11yqe1yqelb90pdil.R.flushNeeded();}}

  /**
   * Get the theoretical events times.
   * @return theoretical events times
   */
  public double[] getTheoreticalEventsTimes() {try{__CLR4_4_11yqe1yqelb90pdil.R.inc(91713);
      __CLR4_4_11yqe1yqelb90pdil.R.inc(91714);return new double[0];
  }finally{__CLR4_4_11yqe1yqelb90pdil.R.flushNeeded();}}

  /**
   * Get the number of calls.
   * @return nuber of calls
   */
  public int getCalls() {try{__CLR4_4_11yqe1yqelb90pdil.R.inc(91715);
    __CLR4_4_11yqe1yqelb90pdil.R.inc(91716);return calls;
  }finally{__CLR4_4_11yqe1yqelb90pdil.R.flushNeeded();}}

  public void computeDerivatives(double t, double[] y, double[] yDot) {try{__CLR4_4_11yqe1yqelb90pdil.R.inc(91717);
    __CLR4_4_11yqe1yqelb90pdil.R.inc(91718);++calls;
    __CLR4_4_11yqe1yqelb90pdil.R.inc(91719);doComputeDerivatives(t, y, yDot);
  }finally{__CLR4_4_11yqe1yqelb90pdil.R.flushNeeded();}}

  abstract public void doComputeDerivatives(double t, double[] y, double[] yDot);

  /**
   * Compute the theoretical state at the specified time.
   * @param t time at which the state is required
   * @return state vector at time t
   */
  abstract public double[] computeTheoreticalState(double t);

}
