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
 * This class represents an interpolator over the last step during an
 * ODE integration for the 5(4) Higham and Hall integrator.
 *
 * @see HighamHall54Integrator
 *
 * @version $Id$
 * @since 1.2
 */

class HighamHall54StepInterpolator
  extends RungeKuttaStepInterpolator {public static class __CLR4_4_1qsyqsylb90p9in{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,34785,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  /** Serializable version identifier */
  private static final long serialVersionUID = 20111120L;

  /** Simple constructor.
   * This constructor builds an instance that is not usable yet, the
   * {@link
   * org.apache.commons.math3.ode.sampling.AbstractStepInterpolator#reinitialize}
   * method should be called before using the instance in order to
   * initialize the internal arrays. This constructor is used only
   * in order to delay the initialization in some cases. The {@link
   * EmbeddedRungeKuttaIntegrator} uses the prototyping design pattern
   * to create the step interpolators by cloning an uninitialized model
   * and later initializing the copy.
   */
  public HighamHall54StepInterpolator() {
    super();__CLR4_4_1qsyqsylb90p9in.R.inc(34739);try{__CLR4_4_1qsyqsylb90p9in.R.inc(34738);
  }finally{__CLR4_4_1qsyqsylb90p9in.R.flushNeeded();}}

  /** Copy constructor.
   * @param interpolator interpolator to copy from. The copy is a deep
   * copy: its arrays are separated from the original arrays of the
   * instance
   */
  public HighamHall54StepInterpolator(final HighamHall54StepInterpolator interpolator) {
    super(interpolator);__CLR4_4_1qsyqsylb90p9in.R.inc(34741);try{__CLR4_4_1qsyqsylb90p9in.R.inc(34740);
  }finally{__CLR4_4_1qsyqsylb90p9in.R.flushNeeded();}}

  /** {@inheritDoc} */
  @Override
  protected StepInterpolator doCopy() {try{__CLR4_4_1qsyqsylb90p9in.R.inc(34742);
    __CLR4_4_1qsyqsylb90p9in.R.inc(34743);return new HighamHall54StepInterpolator(this);
  }finally{__CLR4_4_1qsyqsylb90p9in.R.flushNeeded();}}


  /** {@inheritDoc} */
  @Override
  protected void computeInterpolatedStateAndDerivatives(final double theta,
                                          final double oneMinusThetaH) {try{__CLR4_4_1qsyqsylb90p9in.R.inc(34744);

    __CLR4_4_1qsyqsylb90p9in.R.inc(34745);final double bDot0 = 1 + theta * (-15.0/2.0 + theta * (16.0 - 10.0 * theta));
    __CLR4_4_1qsyqsylb90p9in.R.inc(34746);final double bDot2 = theta * (459.0/16.0 + theta * (-729.0/8.0 + 135.0/2.0 * theta));
    __CLR4_4_1qsyqsylb90p9in.R.inc(34747);final double bDot3 = theta * (-44.0 + theta * (152.0 - 120.0 * theta));
    __CLR4_4_1qsyqsylb90p9in.R.inc(34748);final double bDot4 = theta * (375.0/16.0 + theta * (-625.0/8.0 + 125.0/2.0 * theta));
    __CLR4_4_1qsyqsylb90p9in.R.inc(34749);final double bDot5 = theta * 5.0/8.0 * (2 * theta - 1);

    __CLR4_4_1qsyqsylb90p9in.R.inc(34750);if (((((previousState != null) && (theta <= 0.5))&&(__CLR4_4_1qsyqsylb90p9in.R.iget(34751)!=0|true))||(__CLR4_4_1qsyqsylb90p9in.R.iget(34752)==0&false))) {{
        __CLR4_4_1qsyqsylb90p9in.R.inc(34753);final double hTheta = h * theta;
        __CLR4_4_1qsyqsylb90p9in.R.inc(34754);final double b0 = hTheta * (1.0 + theta * (-15.0/4.0  + theta * (16.0/3.0 - 5.0/2.0 * theta)));
        __CLR4_4_1qsyqsylb90p9in.R.inc(34755);final double b2 = hTheta * (      theta * (459.0/32.0 + theta * (-243.0/8.0 + theta * 135.0/8.0)));
        __CLR4_4_1qsyqsylb90p9in.R.inc(34756);final double b3 = hTheta * (      theta * (-22.0      + theta * (152.0/3.0  + theta * -30.0)));
        __CLR4_4_1qsyqsylb90p9in.R.inc(34757);final double b4 = hTheta * (      theta * (375.0/32.0 + theta * (-625.0/24.0 + theta * 125.0/8.0)));
        __CLR4_4_1qsyqsylb90p9in.R.inc(34758);final double b5 = hTheta * (      theta * (-5.0/16.0  + theta *  5.0/12.0));
        __CLR4_4_1qsyqsylb90p9in.R.inc(34759);for (int i = 0; (((i < interpolatedState.length)&&(__CLR4_4_1qsyqsylb90p9in.R.iget(34760)!=0|true))||(__CLR4_4_1qsyqsylb90p9in.R.iget(34761)==0&false)); ++i) {{
            __CLR4_4_1qsyqsylb90p9in.R.inc(34762);final double yDot0 = yDotK[0][i];
            __CLR4_4_1qsyqsylb90p9in.R.inc(34763);final double yDot2 = yDotK[2][i];
            __CLR4_4_1qsyqsylb90p9in.R.inc(34764);final double yDot3 = yDotK[3][i];
            __CLR4_4_1qsyqsylb90p9in.R.inc(34765);final double yDot4 = yDotK[4][i];
            __CLR4_4_1qsyqsylb90p9in.R.inc(34766);final double yDot5 = yDotK[5][i];
            __CLR4_4_1qsyqsylb90p9in.R.inc(34767);interpolatedState[i] =
                    previousState[i] + b0 * yDot0 + b2 * yDot2 + b3 * yDot3 + b4 * yDot4 + b5 * yDot5;
            __CLR4_4_1qsyqsylb90p9in.R.inc(34768);interpolatedDerivatives[i] =
                    bDot0 * yDot0 + bDot2 * yDot2 + bDot3 * yDot3 + bDot4 * yDot4 + bDot5 * yDot5;
        }
    }} }else {{
        __CLR4_4_1qsyqsylb90p9in.R.inc(34769);final double theta2 = theta * theta;
        __CLR4_4_1qsyqsylb90p9in.R.inc(34770);final double b0 = h * (-1.0/12.0 + theta * (1.0 + theta * (-15.0/4.0 + theta * (16.0/3.0 + theta * -5.0/2.0))));
        __CLR4_4_1qsyqsylb90p9in.R.inc(34771);final double b2 = h * (-27.0/32.0 + theta2 * (459.0/32.0 + theta * (-243.0/8.0 + theta * 135.0/8.0)));
        __CLR4_4_1qsyqsylb90p9in.R.inc(34772);final double b3 = h * (4.0/3.0 + theta2 * (-22.0 + theta * (152.0/3.0  + theta * -30.0)));
        __CLR4_4_1qsyqsylb90p9in.R.inc(34773);final double b4 = h * (-125.0/96.0 + theta2 * (375.0/32.0 + theta * (-625.0/24.0 + theta * 125.0/8.0)));
        __CLR4_4_1qsyqsylb90p9in.R.inc(34774);final double b5 = h * (-5.0/48.0 + theta2 * (-5.0/16.0 + theta * 5.0/12.0));
        __CLR4_4_1qsyqsylb90p9in.R.inc(34775);for (int i = 0; (((i < interpolatedState.length)&&(__CLR4_4_1qsyqsylb90p9in.R.iget(34776)!=0|true))||(__CLR4_4_1qsyqsylb90p9in.R.iget(34777)==0&false)); ++i) {{
            __CLR4_4_1qsyqsylb90p9in.R.inc(34778);final double yDot0 = yDotK[0][i];
            __CLR4_4_1qsyqsylb90p9in.R.inc(34779);final double yDot2 = yDotK[2][i];
            __CLR4_4_1qsyqsylb90p9in.R.inc(34780);final double yDot3 = yDotK[3][i];
            __CLR4_4_1qsyqsylb90p9in.R.inc(34781);final double yDot4 = yDotK[4][i];
            __CLR4_4_1qsyqsylb90p9in.R.inc(34782);final double yDot5 = yDotK[5][i];
            __CLR4_4_1qsyqsylb90p9in.R.inc(34783);interpolatedState[i] =
                    currentState[i] + b0 * yDot0 + b2 * yDot2 + b3 * yDot3 + b4 * yDot4 + b5 * yDot5;
            __CLR4_4_1qsyqsylb90p9in.R.inc(34784);interpolatedDerivatives[i] =
                    bDot0 * yDot0 + bDot2 * yDot2 + bDot3 * yDot3 + bDot4 * yDot4 + bDot5 * yDot5;
        }
    }}

  }}finally{__CLR4_4_1qsyqsylb90p9in.R.flushNeeded();}}

}
