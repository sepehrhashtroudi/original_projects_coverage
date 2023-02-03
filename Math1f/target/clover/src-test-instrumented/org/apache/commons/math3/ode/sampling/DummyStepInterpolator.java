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

package org.apache.commons.math3.ode.sampling;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import org.apache.commons.math3.ode.EquationsMapper;

/** This class is a step interpolator that does nothing.
 *
 * <p>This class is used when the {@link StepHandler "step handler"}
 * set up by the user does not need step interpolation. It does not
 * recompute the state when {@link AbstractStepInterpolator#setInterpolatedTime
 * setInterpolatedTime} is called. This implies the interpolated state
 * is always the state at the end of the current step.</p>
 *
 * @see StepHandler
 *
 * @version $Id$
 * @since 1.2
 */

public class DummyStepInterpolator
  extends AbstractStepInterpolator {public static class __CLR4_4_120nh20nhlb90pdo5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,94192,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  /** Serializable version identifier. */
  private static final long serialVersionUID = 1708010296707839488L;

  /** Current derivative. */
  private double[] currentDerivative;

  /** Simple constructor.
   * This constructor builds an instance that is not usable yet, the
   * <code>AbstractStepInterpolator.reinitialize</code> protected method
   * should be called before using the instance in order to initialize
   * the internal arrays. This constructor is used only in order to delay
   * the initialization in some cases. As an example, the {@link
   * org.apache.commons.math3.ode.nonstiff.EmbeddedRungeKuttaIntegrator} uses
   * the prototyping design pattern to create the step interpolators by
   * cloning an uninitialized model and latter initializing the copy.
   */
  public DummyStepInterpolator() {
    super();__CLR4_4_120nh20nhlb90pdo5.R.inc(94158);try{__CLR4_4_120nh20nhlb90pdo5.R.inc(94157);
    __CLR4_4_120nh20nhlb90pdo5.R.inc(94159);currentDerivative = null;
  }finally{__CLR4_4_120nh20nhlb90pdo5.R.flushNeeded();}}

  /** Simple constructor.
   * @param y reference to the integrator array holding the state at
   * the end of the step
   * @param yDot reference to the integrator array holding the state
   * derivative at some arbitrary point within the step
   * @param forward integration direction indicator
   */
  public DummyStepInterpolator(final double[] y, final double[] yDot, final boolean forward) {
    super(y, forward, new EquationsMapper(0, y.length), new EquationsMapper[0]);__CLR4_4_120nh20nhlb90pdo5.R.inc(94161);try{__CLR4_4_120nh20nhlb90pdo5.R.inc(94160);
    __CLR4_4_120nh20nhlb90pdo5.R.inc(94162);currentDerivative = yDot;
  }finally{__CLR4_4_120nh20nhlb90pdo5.R.flushNeeded();}}

  /** Copy constructor.
   * @param interpolator interpolator to copy from. The copy is a deep
   * copy: its arrays are separated from the original arrays of the
   * instance
   */
  public DummyStepInterpolator(final DummyStepInterpolator interpolator) {
    super(interpolator);__CLR4_4_120nh20nhlb90pdo5.R.inc(94164);try{__CLR4_4_120nh20nhlb90pdo5.R.inc(94163);
    __CLR4_4_120nh20nhlb90pdo5.R.inc(94165);currentDerivative = interpolator.currentDerivative.clone();
  }finally{__CLR4_4_120nh20nhlb90pdo5.R.flushNeeded();}}

  /** Really copy the finalized instance.
   * @return a copy of the finalized instance
   */
  @Override
  protected StepInterpolator doCopy() {try{__CLR4_4_120nh20nhlb90pdo5.R.inc(94166);
    __CLR4_4_120nh20nhlb90pdo5.R.inc(94167);return new DummyStepInterpolator(this);
  }finally{__CLR4_4_120nh20nhlb90pdo5.R.flushNeeded();}}

  /** Compute the state at the interpolated time.
   * In this class, this method does nothing: the interpolated state
   * is always the state at the end of the current step.
   * @param theta normalized interpolation abscissa within the step
   * (theta is zero at the previous time step and one at the current time step)
   * @param oneMinusThetaH time gap between the interpolated time and
   * the current time
   */
  @Override
  protected void computeInterpolatedStateAndDerivatives(final double theta, final double oneMinusThetaH) {try{__CLR4_4_120nh20nhlb90pdo5.R.inc(94168);
      __CLR4_4_120nh20nhlb90pdo5.R.inc(94169);System.arraycopy(currentState,      0, interpolatedState,       0, currentState.length);
      __CLR4_4_120nh20nhlb90pdo5.R.inc(94170);System.arraycopy(currentDerivative, 0, interpolatedDerivatives, 0, currentDerivative.length);
  }finally{__CLR4_4_120nh20nhlb90pdo5.R.flushNeeded();}}

  /** Write the instance to an output channel.
   * @param out output channel
   * @exception IOException if the instance cannot be written
   */
  @Override
  public void writeExternal(final ObjectOutput out)
    throws IOException {try{__CLR4_4_120nh20nhlb90pdo5.R.inc(94171);

      // save the state of the base class
    __CLR4_4_120nh20nhlb90pdo5.R.inc(94172);writeBaseExternal(out);

    __CLR4_4_120nh20nhlb90pdo5.R.inc(94173);if ((((currentDerivative != null)&&(__CLR4_4_120nh20nhlb90pdo5.R.iget(94174)!=0|true))||(__CLR4_4_120nh20nhlb90pdo5.R.iget(94175)==0&false))) {{
        __CLR4_4_120nh20nhlb90pdo5.R.inc(94176);for (int i = 0; (((i < currentDerivative.length)&&(__CLR4_4_120nh20nhlb90pdo5.R.iget(94177)!=0|true))||(__CLR4_4_120nh20nhlb90pdo5.R.iget(94178)==0&false)); ++i) {{
            __CLR4_4_120nh20nhlb90pdo5.R.inc(94179);out.writeDouble(currentDerivative[i]);
        }
    }}

  }}finally{__CLR4_4_120nh20nhlb90pdo5.R.flushNeeded();}}

  /** Read the instance from an input channel.
   * @param in input channel
   * @exception IOException if the instance cannot be read
   */
  @Override
  public void readExternal(final ObjectInput in)
    throws IOException, ClassNotFoundException {try{__CLR4_4_120nh20nhlb90pdo5.R.inc(94180);

    // read the base class
    __CLR4_4_120nh20nhlb90pdo5.R.inc(94181);final double t = readBaseExternal(in);

    __CLR4_4_120nh20nhlb90pdo5.R.inc(94182);if ((((currentState == null)&&(__CLR4_4_120nh20nhlb90pdo5.R.iget(94183)!=0|true))||(__CLR4_4_120nh20nhlb90pdo5.R.iget(94184)==0&false))) {{
        __CLR4_4_120nh20nhlb90pdo5.R.inc(94185);currentDerivative = null;
    } }else {{
        __CLR4_4_120nh20nhlb90pdo5.R.inc(94186);currentDerivative  = new double[currentState.length];
        __CLR4_4_120nh20nhlb90pdo5.R.inc(94187);for (int i = 0; (((i < currentDerivative.length)&&(__CLR4_4_120nh20nhlb90pdo5.R.iget(94188)!=0|true))||(__CLR4_4_120nh20nhlb90pdo5.R.iget(94189)==0&false)); ++i) {{
            __CLR4_4_120nh20nhlb90pdo5.R.inc(94190);currentDerivative[i] = in.readDouble();
        }
    }}

    // we can now set the interpolated time and state
    }__CLR4_4_120nh20nhlb90pdo5.R.inc(94191);setInterpolatedTime(t);

  }finally{__CLR4_4_120nh20nhlb90pdo5.R.flushNeeded();}}

}
