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

import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.ode.EquationsMapper;

/** This abstract class represents an interpolator over the last step
 * during an ODE integration.
 *
 * <p>The various ODE integrators provide objects extending this class
 * to the step handlers. The handlers can use these objects to
 * retrieve the state vector at intermediate times between the
 * previous and the current grid points (dense output).</p>
 *
 * @see org.apache.commons.math3.ode.FirstOrderIntegrator
 * @see org.apache.commons.math3.ode.SecondOrderIntegrator
 * @see StepHandler
 *
 * @version $Id$
 * @since 1.2
 *
 */

public abstract class AbstractStepInterpolator
  implements StepInterpolator {public static class __CLR4_4_1r0qr0qlb90p9jm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,35243,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  /** current time step */
  protected double h;

  /** current state */
  protected double[] currentState;

  /** interpolated time */
  protected double interpolatedTime;

  /** interpolated state */
  protected double[] interpolatedState;

  /** interpolated derivatives */
  protected double[] interpolatedDerivatives;

  /** interpolated primary state */
  protected double[] interpolatedPrimaryState;

  /** interpolated primary derivatives */
  protected double[] interpolatedPrimaryDerivatives;

  /** interpolated secondary state */
  protected double[][] interpolatedSecondaryState;

  /** interpolated secondary derivatives */
  protected double[][] interpolatedSecondaryDerivatives;

  /** global previous time */
  private double globalPreviousTime;

  /** global current time */
  private double globalCurrentTime;

  /** soft previous time */
  private double softPreviousTime;

  /** soft current time */
  private double softCurrentTime;

  /** indicate if the step has been finalized or not. */
  private boolean finalized;

  /** integration direction. */
  private boolean forward;

  /** indicator for dirty state. */
  private boolean dirtyState;

  /** Equations mapper for the primary equations set. */
  private EquationsMapper primaryMapper;

  /** Equations mappers for the secondary equations sets. */
  private EquationsMapper[] secondaryMappers;

  /** Simple constructor.
   * This constructor builds an instance that is not usable yet, the
   * {@link #reinitialize} method should be called before using the
   * instance in order to initialize the internal arrays. This
   * constructor is used only in order to delay the initialization in
   * some cases. As an example, the {@link
   * org.apache.commons.math3.ode.nonstiff.EmbeddedRungeKuttaIntegrator}
   * class uses the prototyping design pattern to create the step
   * interpolators by cloning an uninitialized model and latter
   * initializing the copy.
   */
  protected AbstractStepInterpolator() {try{__CLR4_4_1r0qr0qlb90p9jm.R.inc(35018);
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35019);globalPreviousTime = Double.NaN;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35020);globalCurrentTime  = Double.NaN;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35021);softPreviousTime   = Double.NaN;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35022);softCurrentTime    = Double.NaN;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35023);h                  = Double.NaN;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35024);interpolatedTime   = Double.NaN;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35025);currentState       = null;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35026);finalized          = false;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35027);this.forward       = true;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35028);this.dirtyState    = true;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35029);primaryMapper      = null;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35030);secondaryMappers   = null;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35031);allocateInterpolatedArrays(-1);
  }finally{__CLR4_4_1r0qr0qlb90p9jm.R.flushNeeded();}}

  /** Simple constructor.
   * @param y reference to the integrator array holding the state at
   * the end of the step
   * @param forward integration direction indicator
   * @param primaryMapper equations mapper for the primary equations set
   * @param secondaryMappers equations mappers for the secondary equations sets
   */
  protected AbstractStepInterpolator(final double[] y, final boolean forward,
                                     final EquationsMapper primaryMapper,
                                     final EquationsMapper[] secondaryMappers) {try{__CLR4_4_1r0qr0qlb90p9jm.R.inc(35032);

    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35033);globalPreviousTime    = Double.NaN;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35034);globalCurrentTime     = Double.NaN;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35035);softPreviousTime      = Double.NaN;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35036);softCurrentTime       = Double.NaN;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35037);h                     = Double.NaN;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35038);interpolatedTime      = Double.NaN;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35039);currentState          = y;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35040);finalized             = false;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35041);this.forward          = forward;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35042);this.dirtyState       = true;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35043);this.primaryMapper    = primaryMapper;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35044);this.secondaryMappers = ((((secondaryMappers == null) )&&(__CLR4_4_1r0qr0qlb90p9jm.R.iget(35045)!=0|true))||(__CLR4_4_1r0qr0qlb90p9jm.R.iget(35046)==0&false))? null : secondaryMappers.clone();
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35047);allocateInterpolatedArrays(y.length);

  }finally{__CLR4_4_1r0qr0qlb90p9jm.R.flushNeeded();}}

  /** Copy constructor.

   * <p>The copied interpolator should have been finalized before the
   * copy, otherwise the copy will not be able to perform correctly
   * any derivative computation and will throw a {@link
   * NullPointerException} later. Since we don't want this constructor
   * to throw the exceptions finalization may involve and since we
   * don't want this method to modify the state of the copied
   * interpolator, finalization is <strong>not</strong> done
   * automatically, it remains under user control.</p>

   * <p>The copy is a deep copy: its arrays are separated from the
   * original arrays of the instance.</p>

   * @param interpolator interpolator to copy from.

   */
  protected AbstractStepInterpolator(final AbstractStepInterpolator interpolator) {try{__CLR4_4_1r0qr0qlb90p9jm.R.inc(35048);

    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35049);globalPreviousTime = interpolator.globalPreviousTime;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35050);globalCurrentTime  = interpolator.globalCurrentTime;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35051);softPreviousTime   = interpolator.softPreviousTime;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35052);softCurrentTime    = interpolator.softCurrentTime;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35053);h                  = interpolator.h;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35054);interpolatedTime   = interpolator.interpolatedTime;

    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35055);if ((((interpolator.currentState == null)&&(__CLR4_4_1r0qr0qlb90p9jm.R.iget(35056)!=0|true))||(__CLR4_4_1r0qr0qlb90p9jm.R.iget(35057)==0&false))) {{
        __CLR4_4_1r0qr0qlb90p9jm.R.inc(35058);currentState     = null;
        __CLR4_4_1r0qr0qlb90p9jm.R.inc(35059);primaryMapper    = null;
        __CLR4_4_1r0qr0qlb90p9jm.R.inc(35060);secondaryMappers = null;
        __CLR4_4_1r0qr0qlb90p9jm.R.inc(35061);allocateInterpolatedArrays(-1);
    } }else {{
      __CLR4_4_1r0qr0qlb90p9jm.R.inc(35062);currentState                     = interpolator.currentState.clone();
      __CLR4_4_1r0qr0qlb90p9jm.R.inc(35063);interpolatedState                = interpolator.interpolatedState.clone();
      __CLR4_4_1r0qr0qlb90p9jm.R.inc(35064);interpolatedDerivatives          = interpolator.interpolatedDerivatives.clone();
      __CLR4_4_1r0qr0qlb90p9jm.R.inc(35065);interpolatedPrimaryState         = interpolator.interpolatedPrimaryState.clone();
      __CLR4_4_1r0qr0qlb90p9jm.R.inc(35066);interpolatedPrimaryDerivatives   = interpolator.interpolatedPrimaryDerivatives.clone();
      __CLR4_4_1r0qr0qlb90p9jm.R.inc(35067);interpolatedSecondaryState       = new double[interpolator.interpolatedSecondaryState.length][];
      __CLR4_4_1r0qr0qlb90p9jm.R.inc(35068);interpolatedSecondaryDerivatives = new double[interpolator.interpolatedSecondaryDerivatives.length][];
      __CLR4_4_1r0qr0qlb90p9jm.R.inc(35069);for (int i = 0; (((i < interpolatedSecondaryState.length)&&(__CLR4_4_1r0qr0qlb90p9jm.R.iget(35070)!=0|true))||(__CLR4_4_1r0qr0qlb90p9jm.R.iget(35071)==0&false)); ++i) {{
          __CLR4_4_1r0qr0qlb90p9jm.R.inc(35072);interpolatedSecondaryState[i]       = interpolator.interpolatedSecondaryState[i].clone();
          __CLR4_4_1r0qr0qlb90p9jm.R.inc(35073);interpolatedSecondaryDerivatives[i] = interpolator.interpolatedSecondaryDerivatives[i].clone();
      }
    }}

    }__CLR4_4_1r0qr0qlb90p9jm.R.inc(35074);finalized        = interpolator.finalized;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35075);forward          = interpolator.forward;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35076);dirtyState       = interpolator.dirtyState;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35077);primaryMapper    = interpolator.primaryMapper;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35078);secondaryMappers = ((((interpolator.secondaryMappers == null) )&&(__CLR4_4_1r0qr0qlb90p9jm.R.iget(35079)!=0|true))||(__CLR4_4_1r0qr0qlb90p9jm.R.iget(35080)==0&false))?
                       null : interpolator.secondaryMappers.clone();

  }finally{__CLR4_4_1r0qr0qlb90p9jm.R.flushNeeded();}}

  /** Allocate the various interpolated states arrays.
   * @param dimension total dimension (negative if arrays should be set to null)
   */
  private void allocateInterpolatedArrays(final int dimension) {try{__CLR4_4_1r0qr0qlb90p9jm.R.inc(35081);
      __CLR4_4_1r0qr0qlb90p9jm.R.inc(35082);if ((((dimension < 0)&&(__CLR4_4_1r0qr0qlb90p9jm.R.iget(35083)!=0|true))||(__CLR4_4_1r0qr0qlb90p9jm.R.iget(35084)==0&false))) {{
          __CLR4_4_1r0qr0qlb90p9jm.R.inc(35085);interpolatedState                = null;
          __CLR4_4_1r0qr0qlb90p9jm.R.inc(35086);interpolatedDerivatives          = null;
          __CLR4_4_1r0qr0qlb90p9jm.R.inc(35087);interpolatedPrimaryState         = null;
          __CLR4_4_1r0qr0qlb90p9jm.R.inc(35088);interpolatedPrimaryDerivatives   = null;
          __CLR4_4_1r0qr0qlb90p9jm.R.inc(35089);interpolatedSecondaryState       = null;
          __CLR4_4_1r0qr0qlb90p9jm.R.inc(35090);interpolatedSecondaryDerivatives = null;
      } }else {{
          __CLR4_4_1r0qr0qlb90p9jm.R.inc(35091);interpolatedState                = new double[dimension];
          __CLR4_4_1r0qr0qlb90p9jm.R.inc(35092);interpolatedDerivatives          = new double[dimension];
          __CLR4_4_1r0qr0qlb90p9jm.R.inc(35093);interpolatedPrimaryState         = new double[primaryMapper.getDimension()];
          __CLR4_4_1r0qr0qlb90p9jm.R.inc(35094);interpolatedPrimaryDerivatives   = new double[primaryMapper.getDimension()];
          __CLR4_4_1r0qr0qlb90p9jm.R.inc(35095);if ((((secondaryMappers == null)&&(__CLR4_4_1r0qr0qlb90p9jm.R.iget(35096)!=0|true))||(__CLR4_4_1r0qr0qlb90p9jm.R.iget(35097)==0&false))) {{
              __CLR4_4_1r0qr0qlb90p9jm.R.inc(35098);interpolatedSecondaryState       = null;
              __CLR4_4_1r0qr0qlb90p9jm.R.inc(35099);interpolatedSecondaryDerivatives = null;
          } }else {{
              __CLR4_4_1r0qr0qlb90p9jm.R.inc(35100);interpolatedSecondaryState       = new double[secondaryMappers.length][];
              __CLR4_4_1r0qr0qlb90p9jm.R.inc(35101);interpolatedSecondaryDerivatives = new double[secondaryMappers.length][];
              __CLR4_4_1r0qr0qlb90p9jm.R.inc(35102);for (int i = 0; (((i < secondaryMappers.length)&&(__CLR4_4_1r0qr0qlb90p9jm.R.iget(35103)!=0|true))||(__CLR4_4_1r0qr0qlb90p9jm.R.iget(35104)==0&false)); ++i) {{
                  __CLR4_4_1r0qr0qlb90p9jm.R.inc(35105);interpolatedSecondaryState[i]       = new double[secondaryMappers[i].getDimension()];
                  __CLR4_4_1r0qr0qlb90p9jm.R.inc(35106);interpolatedSecondaryDerivatives[i] = new double[secondaryMappers[i].getDimension()];
              }
          }}
      }}
  }}finally{__CLR4_4_1r0qr0qlb90p9jm.R.flushNeeded();}}

  /** Reinitialize the instance
   * @param y reference to the integrator array holding the state at the end of the step
   * @param isForward integration direction indicator
   * @param primary equations mapper for the primary equations set
   * @param secondary equations mappers for the secondary equations sets
   */
  protected void reinitialize(final double[] y, final boolean isForward,
                              final EquationsMapper primary,
                              final EquationsMapper[] secondary) {try{__CLR4_4_1r0qr0qlb90p9jm.R.inc(35107);

    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35108);globalPreviousTime    = Double.NaN;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35109);globalCurrentTime     = Double.NaN;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35110);softPreviousTime      = Double.NaN;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35111);softCurrentTime       = Double.NaN;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35112);h                     = Double.NaN;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35113);interpolatedTime      = Double.NaN;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35114);currentState          = y;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35115);finalized             = false;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35116);this.forward          = isForward;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35117);this.dirtyState       = true;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35118);this.primaryMapper    = primary;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35119);this.secondaryMappers = secondary.clone();
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35120);allocateInterpolatedArrays(y.length);

  }finally{__CLR4_4_1r0qr0qlb90p9jm.R.flushNeeded();}}

  /** {@inheritDoc} */
   public StepInterpolator copy() throws MaxCountExceededException {try{__CLR4_4_1r0qr0qlb90p9jm.R.inc(35121);

     // finalize the step before performing copy
     __CLR4_4_1r0qr0qlb90p9jm.R.inc(35122);finalizeStep();

     // create the new independent instance
     __CLR4_4_1r0qr0qlb90p9jm.R.inc(35123);return doCopy();

   }finally{__CLR4_4_1r0qr0qlb90p9jm.R.flushNeeded();}}

   /** Really copy the finalized instance.
    * <p>This method is called by {@link #copy()} after the
    * step has been finalized. It must perform a deep copy
    * to have an new instance completely independent for the
    * original instance.
    * @return a copy of the finalized instance
    */
   protected abstract StepInterpolator doCopy();

  /** Shift one step forward.
   * Copy the current time into the previous time, hence preparing the
   * interpolator for future calls to {@link #storeTime storeTime}
   */
  public void shift() {try{__CLR4_4_1r0qr0qlb90p9jm.R.inc(35124);
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35125);globalPreviousTime = globalCurrentTime;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35126);softPreviousTime   = globalPreviousTime;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35127);softCurrentTime    = globalCurrentTime;
  }finally{__CLR4_4_1r0qr0qlb90p9jm.R.flushNeeded();}}

  /** Store the current step time.
   * @param t current time
   */
  public void storeTime(final double t) {try{__CLR4_4_1r0qr0qlb90p9jm.R.inc(35128);

    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35129);globalCurrentTime = t;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35130);softCurrentTime   = globalCurrentTime;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35131);h                 = globalCurrentTime - globalPreviousTime;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35132);setInterpolatedTime(t);

    // the step is not finalized anymore
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35133);finalized  = false;

  }finally{__CLR4_4_1r0qr0qlb90p9jm.R.flushNeeded();}}

  /** Restrict step range to a limited part of the global step.
   * <p>
   * This method can be used to restrict a step and make it appear
   * as if the original step was smaller. Calling this method
   * <em>only</em> changes the value returned by {@link #getPreviousTime()},
   * it does not change any other property
   * </p>
   * @param softPreviousTime start of the restricted step
   * @since 2.2
   */
  public void setSoftPreviousTime(final double softPreviousTime) {try{__CLR4_4_1r0qr0qlb90p9jm.R.inc(35134);
      __CLR4_4_1r0qr0qlb90p9jm.R.inc(35135);this.softPreviousTime = softPreviousTime;
  }finally{__CLR4_4_1r0qr0qlb90p9jm.R.flushNeeded();}}

  /** Restrict step range to a limited part of the global step.
   * <p>
   * This method can be used to restrict a step and make it appear
   * as if the original step was smaller. Calling this method
   * <em>only</em> changes the value returned by {@link #getCurrentTime()},
   * it does not change any other property
   * </p>
   * @param softCurrentTime end of the restricted step
   * @since 2.2
   */
  public void setSoftCurrentTime(final double softCurrentTime) {try{__CLR4_4_1r0qr0qlb90p9jm.R.inc(35136);
      __CLR4_4_1r0qr0qlb90p9jm.R.inc(35137);this.softCurrentTime  = softCurrentTime;
  }finally{__CLR4_4_1r0qr0qlb90p9jm.R.flushNeeded();}}

  /**
   * Get the previous global grid point time.
   * @return previous global grid point time
   */
  public double getGlobalPreviousTime() {try{__CLR4_4_1r0qr0qlb90p9jm.R.inc(35138);
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35139);return globalPreviousTime;
  }finally{__CLR4_4_1r0qr0qlb90p9jm.R.flushNeeded();}}

  /**
   * Get the current global grid point time.
   * @return current global grid point time
   */
  public double getGlobalCurrentTime() {try{__CLR4_4_1r0qr0qlb90p9jm.R.inc(35140);
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35141);return globalCurrentTime;
  }finally{__CLR4_4_1r0qr0qlb90p9jm.R.flushNeeded();}}

  /**
   * Get the previous soft grid point time.
   * @return previous soft grid point time
   * @see #setSoftPreviousTime(double)
   */
  public double getPreviousTime() {try{__CLR4_4_1r0qr0qlb90p9jm.R.inc(35142);
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35143);return softPreviousTime;
  }finally{__CLR4_4_1r0qr0qlb90p9jm.R.flushNeeded();}}

  /**
   * Get the current soft grid point time.
   * @return current soft grid point time
   * @see #setSoftCurrentTime(double)
   */
  public double getCurrentTime() {try{__CLR4_4_1r0qr0qlb90p9jm.R.inc(35144);
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35145);return softCurrentTime;
  }finally{__CLR4_4_1r0qr0qlb90p9jm.R.flushNeeded();}}

  /** {@inheritDoc} */
  public double getInterpolatedTime() {try{__CLR4_4_1r0qr0qlb90p9jm.R.inc(35146);
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35147);return interpolatedTime;
  }finally{__CLR4_4_1r0qr0qlb90p9jm.R.flushNeeded();}}

  /** {@inheritDoc} */
  public void setInterpolatedTime(final double time) {try{__CLR4_4_1r0qr0qlb90p9jm.R.inc(35148);
      __CLR4_4_1r0qr0qlb90p9jm.R.inc(35149);interpolatedTime = time;
      __CLR4_4_1r0qr0qlb90p9jm.R.inc(35150);dirtyState       = true;
  }finally{__CLR4_4_1r0qr0qlb90p9jm.R.flushNeeded();}}

  /** {@inheritDoc} */
  public boolean isForward() {try{__CLR4_4_1r0qr0qlb90p9jm.R.inc(35151);
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35152);return forward;
  }finally{__CLR4_4_1r0qr0qlb90p9jm.R.flushNeeded();}}

  /** Compute the state and derivatives at the interpolated time.
   * This is the main processing method that should be implemented by
   * the derived classes to perform the interpolation.
   * @param theta normalized interpolation abscissa within the step
   * (theta is zero at the previous time step and one at the current time step)
   * @param oneMinusThetaH time gap between the interpolated time and
   * the current time
   * @exception MaxCountExceededException if the number of functions evaluations is exceeded
   */
  protected abstract void computeInterpolatedStateAndDerivatives(double theta,
                                                                 double oneMinusThetaH)
      throws MaxCountExceededException;

  /** Lazy evaluation of complete interpolated state.
   * @exception MaxCountExceededException if the number of functions evaluations is exceeded
   */
  private void evaluateCompleteInterpolatedState()
      throws MaxCountExceededException {try{__CLR4_4_1r0qr0qlb90p9jm.R.inc(35153);
      // lazy evaluation of the state
      __CLR4_4_1r0qr0qlb90p9jm.R.inc(35154);if ((((dirtyState)&&(__CLR4_4_1r0qr0qlb90p9jm.R.iget(35155)!=0|true))||(__CLR4_4_1r0qr0qlb90p9jm.R.iget(35156)==0&false))) {{
          __CLR4_4_1r0qr0qlb90p9jm.R.inc(35157);final double oneMinusThetaH = globalCurrentTime - interpolatedTime;
          __CLR4_4_1r0qr0qlb90p9jm.R.inc(35158);final double theta = ((((h == 0) )&&(__CLR4_4_1r0qr0qlb90p9jm.R.iget(35159)!=0|true))||(__CLR4_4_1r0qr0qlb90p9jm.R.iget(35160)==0&false))? 0 : (h - oneMinusThetaH) / h;
          __CLR4_4_1r0qr0qlb90p9jm.R.inc(35161);computeInterpolatedStateAndDerivatives(theta, oneMinusThetaH);
          __CLR4_4_1r0qr0qlb90p9jm.R.inc(35162);dirtyState = false;
      }
  }}finally{__CLR4_4_1r0qr0qlb90p9jm.R.flushNeeded();}}

  /** {@inheritDoc} */
  public double[] getInterpolatedState() throws MaxCountExceededException {try{__CLR4_4_1r0qr0qlb90p9jm.R.inc(35163);
      __CLR4_4_1r0qr0qlb90p9jm.R.inc(35164);evaluateCompleteInterpolatedState();
      __CLR4_4_1r0qr0qlb90p9jm.R.inc(35165);primaryMapper.extractEquationData(interpolatedState,
                                        interpolatedPrimaryState);
      __CLR4_4_1r0qr0qlb90p9jm.R.inc(35166);return interpolatedPrimaryState;
  }finally{__CLR4_4_1r0qr0qlb90p9jm.R.flushNeeded();}}

  /** {@inheritDoc} */
  public double[] getInterpolatedDerivatives() throws MaxCountExceededException {try{__CLR4_4_1r0qr0qlb90p9jm.R.inc(35167);
      __CLR4_4_1r0qr0qlb90p9jm.R.inc(35168);evaluateCompleteInterpolatedState();
      __CLR4_4_1r0qr0qlb90p9jm.R.inc(35169);primaryMapper.extractEquationData(interpolatedDerivatives,
                                        interpolatedPrimaryDerivatives);
      __CLR4_4_1r0qr0qlb90p9jm.R.inc(35170);return interpolatedPrimaryDerivatives;
  }finally{__CLR4_4_1r0qr0qlb90p9jm.R.flushNeeded();}}

  /** {@inheritDoc} */
  public double[] getInterpolatedSecondaryState(final int index) throws MaxCountExceededException {try{__CLR4_4_1r0qr0qlb90p9jm.R.inc(35171);
      __CLR4_4_1r0qr0qlb90p9jm.R.inc(35172);evaluateCompleteInterpolatedState();
      __CLR4_4_1r0qr0qlb90p9jm.R.inc(35173);secondaryMappers[index].extractEquationData(interpolatedState,
                                                  interpolatedSecondaryState[index]);
      __CLR4_4_1r0qr0qlb90p9jm.R.inc(35174);return interpolatedSecondaryState[index];
  }finally{__CLR4_4_1r0qr0qlb90p9jm.R.flushNeeded();}}

  /** {@inheritDoc} */
  public double[] getInterpolatedSecondaryDerivatives(final int index) throws MaxCountExceededException {try{__CLR4_4_1r0qr0qlb90p9jm.R.inc(35175);
      __CLR4_4_1r0qr0qlb90p9jm.R.inc(35176);evaluateCompleteInterpolatedState();
      __CLR4_4_1r0qr0qlb90p9jm.R.inc(35177);secondaryMappers[index].extractEquationData(interpolatedDerivatives,
                                                  interpolatedSecondaryDerivatives[index]);
      __CLR4_4_1r0qr0qlb90p9jm.R.inc(35178);return interpolatedSecondaryDerivatives[index];
  }finally{__CLR4_4_1r0qr0qlb90p9jm.R.flushNeeded();}}

  /**
   * Finalize the step.

   * <p>Some embedded Runge-Kutta integrators need fewer functions
   * evaluations than their counterpart step interpolators. These
   * interpolators should perform the last evaluations they need by
   * themselves only if they need them. This method triggers these
   * extra evaluations. It can be called directly by the user step
   * handler and it is called automatically if {@link
   * #setInterpolatedTime} is called.</p>

   * <p>Once this method has been called, <strong>no</strong> other
   * evaluation will be performed on this step. If there is a need to
   * have some side effects between the step handler and the
   * differential equations (for example update some data in the
   * equations once the step has been done), it is advised to call
   * this method explicitly from the step handler before these side
   * effects are set up. If the step handler induces no side effect,
   * then this method can safely be ignored, it will be called
   * transparently as needed.</p>

   * <p><strong>Warning</strong>: since the step interpolator provided
   * to the step handler as a parameter of the {@link
   * StepHandler#handleStep handleStep} is valid only for the duration
   * of the {@link StepHandler#handleStep handleStep} call, one cannot
   * simply store a reference and reuse it later. One should first
   * finalize the instance, then copy this finalized instance into a
   * new object that can be kept.</p>

   * <p>This method calls the protected <code>doFinalize</code> method
   * if it has never been called during this step and set a flag
   * indicating that it has been called once. It is the <code>
   * doFinalize</code> method which should perform the evaluations.
   * This wrapping prevents from calling <code>doFinalize</code> several
   * times and hence evaluating the differential equations too often.
   * Therefore, subclasses are not allowed not reimplement it, they
   * should rather reimplement <code>doFinalize</code>.</p>

   * @exception MaxCountExceededException if the number of functions evaluations is exceeded

   */
  public final void finalizeStep() throws MaxCountExceededException {try{__CLR4_4_1r0qr0qlb90p9jm.R.inc(35179);
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35180);if ((((! finalized)&&(__CLR4_4_1r0qr0qlb90p9jm.R.iget(35181)!=0|true))||(__CLR4_4_1r0qr0qlb90p9jm.R.iget(35182)==0&false))) {{
      __CLR4_4_1r0qr0qlb90p9jm.R.inc(35183);doFinalize();
      __CLR4_4_1r0qr0qlb90p9jm.R.inc(35184);finalized = true;
    }
  }}finally{__CLR4_4_1r0qr0qlb90p9jm.R.flushNeeded();}}

  /**
   * Really finalize the step.
   * The default implementation of this method does nothing.
   * @exception MaxCountExceededException if the number of functions evaluations is exceeded
   */
  protected void doFinalize() throws MaxCountExceededException {try{__CLR4_4_1r0qr0qlb90p9jm.R.inc(35185);
  }finally{__CLR4_4_1r0qr0qlb90p9jm.R.flushNeeded();}}

  /** {@inheritDoc} */
  public abstract void writeExternal(ObjectOutput out)
    throws IOException;

  /** {@inheritDoc} */
  public abstract void readExternal(ObjectInput in)
    throws IOException, ClassNotFoundException;

  /** Save the base state of the instance.
   * This method performs step finalization if it has not been done
   * before.
   * @param out stream where to save the state
   * @exception IOException in case of write error
   */
  protected void writeBaseExternal(final ObjectOutput out)
    throws IOException {try{__CLR4_4_1r0qr0qlb90p9jm.R.inc(35186);

    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35187);if ((((currentState == null)&&(__CLR4_4_1r0qr0qlb90p9jm.R.iget(35188)!=0|true))||(__CLR4_4_1r0qr0qlb90p9jm.R.iget(35189)==0&false))) {{
        __CLR4_4_1r0qr0qlb90p9jm.R.inc(35190);out.writeInt(-1);
    } }else {{
        __CLR4_4_1r0qr0qlb90p9jm.R.inc(35191);out.writeInt(currentState.length);
    }
    }__CLR4_4_1r0qr0qlb90p9jm.R.inc(35192);out.writeDouble(globalPreviousTime);
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35193);out.writeDouble(globalCurrentTime);
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35194);out.writeDouble(softPreviousTime);
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35195);out.writeDouble(softCurrentTime);
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35196);out.writeDouble(h);
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35197);out.writeBoolean(forward);
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35198);out.writeObject(primaryMapper);
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35199);out.write(secondaryMappers.length);
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35200);for (final EquationsMapper  mapper : secondaryMappers) {{
        __CLR4_4_1r0qr0qlb90p9jm.R.inc(35201);out.writeObject(mapper);
    }

    }__CLR4_4_1r0qr0qlb90p9jm.R.inc(35202);if ((((currentState != null)&&(__CLR4_4_1r0qr0qlb90p9jm.R.iget(35203)!=0|true))||(__CLR4_4_1r0qr0qlb90p9jm.R.iget(35204)==0&false))) {{
        __CLR4_4_1r0qr0qlb90p9jm.R.inc(35205);for (int i = 0; (((i < currentState.length)&&(__CLR4_4_1r0qr0qlb90p9jm.R.iget(35206)!=0|true))||(__CLR4_4_1r0qr0qlb90p9jm.R.iget(35207)==0&false)); ++i) {{
            __CLR4_4_1r0qr0qlb90p9jm.R.inc(35208);out.writeDouble(currentState[i]);
        }
    }}

    }__CLR4_4_1r0qr0qlb90p9jm.R.inc(35209);out.writeDouble(interpolatedTime);

    // we do not store the interpolated state,
    // it will be recomputed as needed after reading

    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35210);try {
        // finalize the step (and don't bother saving the now true flag)
        __CLR4_4_1r0qr0qlb90p9jm.R.inc(35211);finalizeStep();
    } catch (MaxCountExceededException mcee) {
        __CLR4_4_1r0qr0qlb90p9jm.R.inc(35212);final IOException ioe = new IOException(mcee.getLocalizedMessage());
        __CLR4_4_1r0qr0qlb90p9jm.R.inc(35213);ioe.initCause(mcee);
        __CLR4_4_1r0qr0qlb90p9jm.R.inc(35214);throw ioe;
    }

  }finally{__CLR4_4_1r0qr0qlb90p9jm.R.flushNeeded();}}

  /** Read the base state of the instance.
   * This method does <strong>neither</strong> set the interpolated
   * time nor state. It is up to the derived class to reset it
   * properly calling the {@link #setInterpolatedTime} method later,
   * once all rest of the object state has been set up properly.
   * @param in stream where to read the state from
   * @return interpolated time to be set later by the caller
   * @exception IOException in case of read error
   * @exception ClassNotFoundException if an equation mapper class
   * cannot be found
   */
  protected double readBaseExternal(final ObjectInput in)
    throws IOException, ClassNotFoundException {try{__CLR4_4_1r0qr0qlb90p9jm.R.inc(35215);

    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35216);final int dimension = in.readInt();
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35217);globalPreviousTime  = in.readDouble();
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35218);globalCurrentTime   = in.readDouble();
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35219);softPreviousTime    = in.readDouble();
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35220);softCurrentTime     = in.readDouble();
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35221);h                   = in.readDouble();
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35222);forward             = in.readBoolean();
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35223);primaryMapper       = (EquationsMapper) in.readObject();
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35224);secondaryMappers    = new EquationsMapper[in.read()];
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35225);for (int i = 0; (((i < secondaryMappers.length)&&(__CLR4_4_1r0qr0qlb90p9jm.R.iget(35226)!=0|true))||(__CLR4_4_1r0qr0qlb90p9jm.R.iget(35227)==0&false)); ++i) {{
        __CLR4_4_1r0qr0qlb90p9jm.R.inc(35228);secondaryMappers[i] = (EquationsMapper) in.readObject();
    }
    }__CLR4_4_1r0qr0qlb90p9jm.R.inc(35229);dirtyState          = true;

    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35230);if ((((dimension < 0)&&(__CLR4_4_1r0qr0qlb90p9jm.R.iget(35231)!=0|true))||(__CLR4_4_1r0qr0qlb90p9jm.R.iget(35232)==0&false))) {{
        __CLR4_4_1r0qr0qlb90p9jm.R.inc(35233);currentState = null;
    } }else {{
        __CLR4_4_1r0qr0qlb90p9jm.R.inc(35234);currentState  = new double[dimension];
        __CLR4_4_1r0qr0qlb90p9jm.R.inc(35235);for (int i = 0; (((i < currentState.length)&&(__CLR4_4_1r0qr0qlb90p9jm.R.iget(35236)!=0|true))||(__CLR4_4_1r0qr0qlb90p9jm.R.iget(35237)==0&false)); ++i) {{
            __CLR4_4_1r0qr0qlb90p9jm.R.inc(35238);currentState[i] = in.readDouble();
        }
    }}

    // we do NOT handle the interpolated time and state here
    }__CLR4_4_1r0qr0qlb90p9jm.R.inc(35239);interpolatedTime = Double.NaN;
    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35240);allocateInterpolatedArrays(dimension);

    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35241);finalized = true;

    __CLR4_4_1r0qr0qlb90p9jm.R.inc(35242);return in.readDouble();

  }finally{__CLR4_4_1r0qr0qlb90p9jm.R.flushNeeded();}}

}
