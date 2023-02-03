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

import org.apache.commons.math3.ode.sampling.StepInterpolator;

/**
 * This class implements a linear interpolator for step.
 *
 * <p>This interpolator computes dense output inside the last
 * step computed. The interpolation equation is consistent with the
 * integration scheme :
 * <ul>
 *   <li>Using reference point at step start:<br>
 *     y(t<sub>n</sub> + &theta; h) = y (t<sub>n</sub>) + &theta; h y'
 *   </li>
 *   <li>Using reference point at step end:<br>
 *     y(t<sub>n</sub> + &theta; h) = y (t<sub>n</sub> + h) - (1-&theta;) h y'
 *   </li>
 * </ul>
 * </p>
 *
 * where &theta; belongs to [0 ; 1] and where y' is the evaluation of
 * the derivatives already computed during the step.</p>
 *
 * @see EulerIntegrator
 * @version $Id$
 * @since 1.2
 */

class EulerStepInterpolator
  extends RungeKuttaStepInterpolator {public static class __CLR4_4_1q7iq7ilb90p9gx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,33985,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  /** Serializable version identifier. */
  private static final long serialVersionUID = 20111120L;

  /** Simple constructor.
   * This constructor builds an instance that is not usable yet, the
   * {@link
   * org.apache.commons.math3.ode.sampling.AbstractStepInterpolator#reinitialize}
   * method should be called before using the instance in order to
   * initialize the internal arrays. This constructor is used only
   * in order to delay the initialization in some cases. The {@link
   * RungeKuttaIntegrator} class uses the prototyping design pattern
   * to create the step interpolators by cloning an uninitialized model
   * and later initializing the copy.
   */
  public EulerStepInterpolator() {try{__CLR4_4_1q7iq7ilb90p9gx.R.inc(33966);
  }finally{__CLR4_4_1q7iq7ilb90p9gx.R.flushNeeded();}}

  /** Copy constructor.
   * @param interpolator interpolator to copy from. The copy is a deep
   * copy: its arrays are separated from the original arrays of the
   * instance
   */
  public EulerStepInterpolator(final EulerStepInterpolator interpolator) {
    super(interpolator);__CLR4_4_1q7iq7ilb90p9gx.R.inc(33968);try{__CLR4_4_1q7iq7ilb90p9gx.R.inc(33967);
  }finally{__CLR4_4_1q7iq7ilb90p9gx.R.flushNeeded();}}

  /** {@inheritDoc} */
  @Override
  protected StepInterpolator doCopy() {try{__CLR4_4_1q7iq7ilb90p9gx.R.inc(33969);
    __CLR4_4_1q7iq7ilb90p9gx.R.inc(33970);return new EulerStepInterpolator(this);
  }finally{__CLR4_4_1q7iq7ilb90p9gx.R.flushNeeded();}}


  /** {@inheritDoc} */
  @Override
  protected void computeInterpolatedStateAndDerivatives(final double theta,
                                          final double oneMinusThetaH) {try{__CLR4_4_1q7iq7ilb90p9gx.R.inc(33971);
      __CLR4_4_1q7iq7ilb90p9gx.R.inc(33972);if (((((previousState != null) && (theta <= 0.5))&&(__CLR4_4_1q7iq7ilb90p9gx.R.iget(33973)!=0|true))||(__CLR4_4_1q7iq7ilb90p9gx.R.iget(33974)==0&false))) {{
          __CLR4_4_1q7iq7ilb90p9gx.R.inc(33975);for (int i = 0; (((i < interpolatedState.length)&&(__CLR4_4_1q7iq7ilb90p9gx.R.iget(33976)!=0|true))||(__CLR4_4_1q7iq7ilb90p9gx.R.iget(33977)==0&false)); ++i) {{
              __CLR4_4_1q7iq7ilb90p9gx.R.inc(33978);interpolatedState[i] = previousState[i] + theta * h * yDotK[0][i];
          }
          }__CLR4_4_1q7iq7ilb90p9gx.R.inc(33979);System.arraycopy(yDotK[0], 0, interpolatedDerivatives, 0, interpolatedDerivatives.length);
      } }else {{
          __CLR4_4_1q7iq7ilb90p9gx.R.inc(33980);for (int i = 0; (((i < interpolatedState.length)&&(__CLR4_4_1q7iq7ilb90p9gx.R.iget(33981)!=0|true))||(__CLR4_4_1q7iq7ilb90p9gx.R.iget(33982)==0&false)); ++i) {{
              __CLR4_4_1q7iq7ilb90p9gx.R.inc(33983);interpolatedState[i] = currentState[i] - oneMinusThetaH * yDotK[0][i];
          }
          }__CLR4_4_1q7iq7ilb90p9gx.R.inc(33984);System.arraycopy(yDotK[0], 0, interpolatedDerivatives, 0, interpolatedDerivatives.length);
      }

  }}finally{__CLR4_4_1q7iq7ilb90p9gx.R.flushNeeded();}}

}
