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
import org.apache.commons.math3.util.FastMath;

/**
 * This class implements a step interpolator for the Gill fourth
 * order Runge-Kutta integrator.
 *
 * <p>This interpolator allows to compute dense output inside the last
 * step computed. The interpolation equation is consistent with the
 * integration scheme :
 * <ul>
 *   <li>Using reference point at step start:<br>
 *   y(t<sub>n</sub> + &theta; h) = y (t<sub>n</sub>)
 *                    + &theta; (h/6) [ (6 - 9 &theta; + 4 &theta;<sup>2</sup>) y'<sub>1</sub>
 *                                    + (    6 &theta; - 4 &theta;<sup>2</sup>) ((1-1/&radic;2) y'<sub>2</sub> + (1+1/&radic;2)) y'<sub>3</sub>)
 *                                    + (  - 3 &theta; + 4 &theta;<sup>2</sup>) y'<sub>4</sub>
 *                                    ]
 *   </li>
 *   <li>Using reference point at step start:<br>
 *   y(t<sub>n</sub> + &theta; h) = y (t<sub>n</sub> + h)
 *                    - (1 - &theta;) (h/6) [ (1 - 5 &theta; + 4 &theta;<sup>2</sup>) y'<sub>1</sub>
 *                                          + (2 + 2 &theta; - 4 &theta;<sup>2</sup>) ((1-1/&radic;2) y'<sub>2</sub> + (1+1/&radic;2)) y'<sub>3</sub>)
 *                                          + (1 +   &theta; + 4 &theta;<sup>2</sup>) y'<sub>4</sub>
 *                                          ]
 *   </li>
 * </ul>
 * </p>
 * where &theta; belongs to [0 ; 1] and where y'<sub>1</sub> to y'<sub>4</sub>
 * are the four evaluations of the derivatives already computed during
 * the step.</p>
 *
 * @see GillIntegrator
 * @version $Id$
 * @since 1.2
 */

class GillStepInterpolator
  extends RungeKuttaStepInterpolator {public static class __CLR4_4_1q83q83lb90p9h6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,34033,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** First Gill coefficient. */
    private static final double ONE_MINUS_INV_SQRT_2 = 1 - FastMath.sqrt(0.5);

    /** Second Gill coefficient. */
    private static final double ONE_PLUS_INV_SQRT_2 = 1 + FastMath.sqrt(0.5);

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
  public GillStepInterpolator() {try{__CLR4_4_1q83q83lb90p9h6.R.inc(33987);
  }finally{__CLR4_4_1q83q83lb90p9h6.R.flushNeeded();}}

  /** Copy constructor.
   * @param interpolator interpolator to copy from. The copy is a deep
   * copy: its arrays are separated from the original arrays of the
   * instance
   */
  public GillStepInterpolator(final GillStepInterpolator interpolator) {
    super(interpolator);__CLR4_4_1q83q83lb90p9h6.R.inc(33989);try{__CLR4_4_1q83q83lb90p9h6.R.inc(33988);
  }finally{__CLR4_4_1q83q83lb90p9h6.R.flushNeeded();}}

  /** {@inheritDoc} */
  @Override
  protected StepInterpolator doCopy() {try{__CLR4_4_1q83q83lb90p9h6.R.inc(33990);
    __CLR4_4_1q83q83lb90p9h6.R.inc(33991);return new GillStepInterpolator(this);
  }finally{__CLR4_4_1q83q83lb90p9h6.R.flushNeeded();}}


  /** {@inheritDoc} */
  @Override
  protected void computeInterpolatedStateAndDerivatives(final double theta,
                                          final double oneMinusThetaH) {try{__CLR4_4_1q83q83lb90p9h6.R.inc(33992);

    __CLR4_4_1q83q83lb90p9h6.R.inc(33993);final double twoTheta   = 2 * theta;
    __CLR4_4_1q83q83lb90p9h6.R.inc(33994);final double fourTheta2 = twoTheta * twoTheta;
    __CLR4_4_1q83q83lb90p9h6.R.inc(33995);final double coeffDot1  = theta * (twoTheta - 3) + 1;
    __CLR4_4_1q83q83lb90p9h6.R.inc(33996);final double cDot23     = twoTheta * (1 - theta);
    __CLR4_4_1q83q83lb90p9h6.R.inc(33997);final double coeffDot2  = cDot23  * ONE_MINUS_INV_SQRT_2;
    __CLR4_4_1q83q83lb90p9h6.R.inc(33998);final double coeffDot3  = cDot23  * ONE_PLUS_INV_SQRT_2;
    __CLR4_4_1q83q83lb90p9h6.R.inc(33999);final double coeffDot4  = theta * (twoTheta - 1);

    __CLR4_4_1q83q83lb90p9h6.R.inc(34000);if (((((previousState != null) && (theta <= 0.5))&&(__CLR4_4_1q83q83lb90p9h6.R.iget(34001)!=0|true))||(__CLR4_4_1q83q83lb90p9h6.R.iget(34002)==0&false))) {{
        __CLR4_4_1q83q83lb90p9h6.R.inc(34003);final double s         = theta * h / 6.0;
        __CLR4_4_1q83q83lb90p9h6.R.inc(34004);final double c23       = s * (6 * theta - fourTheta2);
        __CLR4_4_1q83q83lb90p9h6.R.inc(34005);final double coeff1    = s * (6 - 9 * theta + fourTheta2);
        __CLR4_4_1q83q83lb90p9h6.R.inc(34006);final double coeff2    = c23  * ONE_MINUS_INV_SQRT_2;
        __CLR4_4_1q83q83lb90p9h6.R.inc(34007);final double coeff3    = c23  * ONE_PLUS_INV_SQRT_2;
        __CLR4_4_1q83q83lb90p9h6.R.inc(34008);final double coeff4    = s * (-3 * theta + fourTheta2);
        __CLR4_4_1q83q83lb90p9h6.R.inc(34009);for (int i = 0; (((i < interpolatedState.length)&&(__CLR4_4_1q83q83lb90p9h6.R.iget(34010)!=0|true))||(__CLR4_4_1q83q83lb90p9h6.R.iget(34011)==0&false)); ++i) {{
            __CLR4_4_1q83q83lb90p9h6.R.inc(34012);final double yDot1 = yDotK[0][i];
            __CLR4_4_1q83q83lb90p9h6.R.inc(34013);final double yDot2 = yDotK[1][i];
            __CLR4_4_1q83q83lb90p9h6.R.inc(34014);final double yDot3 = yDotK[2][i];
            __CLR4_4_1q83q83lb90p9h6.R.inc(34015);final double yDot4 = yDotK[3][i];
            __CLR4_4_1q83q83lb90p9h6.R.inc(34016);interpolatedState[i] =
                    previousState[i] + coeff1 * yDot1 + coeff2 * yDot2 + coeff3 * yDot3 + coeff4 * yDot4;
            __CLR4_4_1q83q83lb90p9h6.R.inc(34017);interpolatedDerivatives[i] =
                    coeffDot1 * yDot1 + coeffDot2 * yDot2 + coeffDot3 * yDot3 + coeffDot4 * yDot4;
        }
    }} }else {{
        __CLR4_4_1q83q83lb90p9h6.R.inc(34018);final double s      = oneMinusThetaH / 6.0;
        __CLR4_4_1q83q83lb90p9h6.R.inc(34019);final double c23    = s * (2 + twoTheta - fourTheta2);
        __CLR4_4_1q83q83lb90p9h6.R.inc(34020);final double coeff1 = s * (1 - 5 * theta + fourTheta2);
        __CLR4_4_1q83q83lb90p9h6.R.inc(34021);final double coeff2 = c23  * ONE_MINUS_INV_SQRT_2;
        __CLR4_4_1q83q83lb90p9h6.R.inc(34022);final double coeff3 = c23  * ONE_PLUS_INV_SQRT_2;
        __CLR4_4_1q83q83lb90p9h6.R.inc(34023);final double coeff4 = s * (1 + theta + fourTheta2);
        __CLR4_4_1q83q83lb90p9h6.R.inc(34024);for (int i = 0; (((i < interpolatedState.length)&&(__CLR4_4_1q83q83lb90p9h6.R.iget(34025)!=0|true))||(__CLR4_4_1q83q83lb90p9h6.R.iget(34026)==0&false)); ++i) {{
            __CLR4_4_1q83q83lb90p9h6.R.inc(34027);final double yDot1 = yDotK[0][i];
            __CLR4_4_1q83q83lb90p9h6.R.inc(34028);final double yDot2 = yDotK[1][i];
            __CLR4_4_1q83q83lb90p9h6.R.inc(34029);final double yDot3 = yDotK[2][i];
            __CLR4_4_1q83q83lb90p9h6.R.inc(34030);final double yDot4 = yDotK[3][i];
            __CLR4_4_1q83q83lb90p9h6.R.inc(34031);interpolatedState[i] =
                    currentState[i] - coeff1 * yDot1 - coeff2 * yDot2 - coeff3 * yDot3 - coeff4 * yDot4;
            __CLR4_4_1q83q83lb90p9h6.R.inc(34032);interpolatedDerivatives[i] =
                    coeffDot1 * yDot1 + coeffDot2 * yDot2 + coeffDot3 * yDot3 + coeffDot4 * yDot4;
        }
    }}

  }}finally{__CLR4_4_1q83q83lb90p9h6.R.flushNeeded();}}

}
