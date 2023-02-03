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

import org.apache.commons.math3.ode.AbstractIntegrator;
import org.apache.commons.math3.ode.EquationsMapper;
import org.apache.commons.math3.ode.sampling.StepInterpolator;

/**
 * This class represents an interpolator over the last step during an
 * ODE integration for the 5(4) Dormand-Prince integrator.
 *
 * @see DormandPrince54Integrator
 *
 * @version $Id$
 * @since 1.2
 */

class DormandPrince54StepInterpolator
  extends RungeKuttaStepInterpolator {public static class __CLR4_4_1pvppvplb90p9f3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,33618,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Last row of the Butcher-array internal weights, element 0. */
    private static final double A70 =    35.0 /  384.0;

    // element 1 is zero, so it is neither stored nor used

    /** Last row of the Butcher-array internal weights, element 2. */
    private static final double A72 =   500.0 / 1113.0;

    /** Last row of the Butcher-array internal weights, element 3. */
    private static final double A73 =   125.0 /  192.0;

    /** Last row of the Butcher-array internal weights, element 4. */
    private static final double A74 = -2187.0 / 6784.0;

    /** Last row of the Butcher-array internal weights, element 5. */
    private static final double A75 =    11.0 /   84.0;

    /** Shampine (1986) Dense output, element 0. */
    private static final double D0 =  -12715105075.0 /  11282082432.0;

    // element 1 is zero, so it is neither stored nor used

    /** Shampine (1986) Dense output, element 2. */
    private static final double D2 =   87487479700.0 /  32700410799.0;

    /** Shampine (1986) Dense output, element 3. */
    private static final double D3 =  -10690763975.0 /   1880347072.0;

    /** Shampine (1986) Dense output, element 4. */
    private static final double D4 =  701980252875.0 / 199316789632.0;

    /** Shampine (1986) Dense output, element 5. */
    private static final double D5 =   -1453857185.0 /    822651844.0;

    /** Shampine (1986) Dense output, element 6. */
    private static final double D6 =      69997945.0 /     29380423.0;

    /** Serializable version identifier. */
    private static final long serialVersionUID = 20111120L;

    /** First vector for interpolation. */
    private double[] v1;

    /** Second vector for interpolation. */
    private double[] v2;

    /** Third vector for interpolation. */
    private double[] v3;

    /** Fourth vector for interpolation. */
    private double[] v4;

    /** Initialization indicator for the interpolation vectors. */
    private boolean vectorsInitialized;

  /** Simple constructor.
   * This constructor builds an instance that is not usable yet, the
   * {@link #reinitialize} method should be called before using the
   * instance in order to initialize the internal arrays. This
   * constructor is used only in order to delay the initialization in
   * some cases. The {@link EmbeddedRungeKuttaIntegrator} uses the
   * prototyping design pattern to create the step interpolators by
   * cloning an uninitialized model and latter initializing the copy.
   */
  public DormandPrince54StepInterpolator() {
    super();__CLR4_4_1pvppvplb90p9f3.R.inc(33542);try{__CLR4_4_1pvppvplb90p9f3.R.inc(33541);
    __CLR4_4_1pvppvplb90p9f3.R.inc(33543);v1 = null;
    __CLR4_4_1pvppvplb90p9f3.R.inc(33544);v2 = null;
    __CLR4_4_1pvppvplb90p9f3.R.inc(33545);v3 = null;
    __CLR4_4_1pvppvplb90p9f3.R.inc(33546);v4 = null;
    __CLR4_4_1pvppvplb90p9f3.R.inc(33547);vectorsInitialized = false;
  }finally{__CLR4_4_1pvppvplb90p9f3.R.flushNeeded();}}

  /** Copy constructor.
   * @param interpolator interpolator to copy from. The copy is a deep
   * copy: its arrays are separated from the original arrays of the
   * instance
   */
  public DormandPrince54StepInterpolator(final DormandPrince54StepInterpolator interpolator) {

    super(interpolator);__CLR4_4_1pvppvplb90p9f3.R.inc(33549);try{__CLR4_4_1pvppvplb90p9f3.R.inc(33548);

    __CLR4_4_1pvppvplb90p9f3.R.inc(33550);if ((((interpolator.v1 == null)&&(__CLR4_4_1pvppvplb90p9f3.R.iget(33551)!=0|true))||(__CLR4_4_1pvppvplb90p9f3.R.iget(33552)==0&false))) {{

      __CLR4_4_1pvppvplb90p9f3.R.inc(33553);v1 = null;
      __CLR4_4_1pvppvplb90p9f3.R.inc(33554);v2 = null;
      __CLR4_4_1pvppvplb90p9f3.R.inc(33555);v3 = null;
      __CLR4_4_1pvppvplb90p9f3.R.inc(33556);v4 = null;
      __CLR4_4_1pvppvplb90p9f3.R.inc(33557);vectorsInitialized = false;

    } }else {{

      __CLR4_4_1pvppvplb90p9f3.R.inc(33558);v1 = interpolator.v1.clone();
      __CLR4_4_1pvppvplb90p9f3.R.inc(33559);v2 = interpolator.v2.clone();
      __CLR4_4_1pvppvplb90p9f3.R.inc(33560);v3 = interpolator.v3.clone();
      __CLR4_4_1pvppvplb90p9f3.R.inc(33561);v4 = interpolator.v4.clone();
      __CLR4_4_1pvppvplb90p9f3.R.inc(33562);vectorsInitialized = interpolator.vectorsInitialized;

    }

  }}finally{__CLR4_4_1pvppvplb90p9f3.R.flushNeeded();}}

  /** {@inheritDoc} */
  @Override
  protected StepInterpolator doCopy() {try{__CLR4_4_1pvppvplb90p9f3.R.inc(33563);
    __CLR4_4_1pvppvplb90p9f3.R.inc(33564);return new DormandPrince54StepInterpolator(this);
  }finally{__CLR4_4_1pvppvplb90p9f3.R.flushNeeded();}}


  /** {@inheritDoc} */
  @Override
  public void reinitialize(final AbstractIntegrator integrator,
                           final double[] y, final double[][] yDotK, final boolean forward,
                           final EquationsMapper primaryMapper,
                           final EquationsMapper[] secondaryMappers) {try{__CLR4_4_1pvppvplb90p9f3.R.inc(33565);
    __CLR4_4_1pvppvplb90p9f3.R.inc(33566);super.reinitialize(integrator, y, yDotK, forward, primaryMapper, secondaryMappers);
    __CLR4_4_1pvppvplb90p9f3.R.inc(33567);v1 = null;
    __CLR4_4_1pvppvplb90p9f3.R.inc(33568);v2 = null;
    __CLR4_4_1pvppvplb90p9f3.R.inc(33569);v3 = null;
    __CLR4_4_1pvppvplb90p9f3.R.inc(33570);v4 = null;
    __CLR4_4_1pvppvplb90p9f3.R.inc(33571);vectorsInitialized = false;
  }finally{__CLR4_4_1pvppvplb90p9f3.R.flushNeeded();}}

  /** {@inheritDoc} */
  @Override
  public void storeTime(final double t) {try{__CLR4_4_1pvppvplb90p9f3.R.inc(33572);
    __CLR4_4_1pvppvplb90p9f3.R.inc(33573);super.storeTime(t);
    __CLR4_4_1pvppvplb90p9f3.R.inc(33574);vectorsInitialized = false;
  }finally{__CLR4_4_1pvppvplb90p9f3.R.flushNeeded();}}

  /** {@inheritDoc} */
  @Override
  protected void computeInterpolatedStateAndDerivatives(final double theta,
                                          final double oneMinusThetaH) {try{__CLR4_4_1pvppvplb90p9f3.R.inc(33575);

    __CLR4_4_1pvppvplb90p9f3.R.inc(33576);if ((((! vectorsInitialized)&&(__CLR4_4_1pvppvplb90p9f3.R.iget(33577)!=0|true))||(__CLR4_4_1pvppvplb90p9f3.R.iget(33578)==0&false))) {{

      __CLR4_4_1pvppvplb90p9f3.R.inc(33579);if ((((v1 == null)&&(__CLR4_4_1pvppvplb90p9f3.R.iget(33580)!=0|true))||(__CLR4_4_1pvppvplb90p9f3.R.iget(33581)==0&false))) {{
        __CLR4_4_1pvppvplb90p9f3.R.inc(33582);v1 = new double[interpolatedState.length];
        __CLR4_4_1pvppvplb90p9f3.R.inc(33583);v2 = new double[interpolatedState.length];
        __CLR4_4_1pvppvplb90p9f3.R.inc(33584);v3 = new double[interpolatedState.length];
        __CLR4_4_1pvppvplb90p9f3.R.inc(33585);v4 = new double[interpolatedState.length];
      }

      // no step finalization is needed for this interpolator

      // we need to compute the interpolation vectors for this time step
      }__CLR4_4_1pvppvplb90p9f3.R.inc(33586);for (int i = 0; (((i < interpolatedState.length)&&(__CLR4_4_1pvppvplb90p9f3.R.iget(33587)!=0|true))||(__CLR4_4_1pvppvplb90p9f3.R.iget(33588)==0&false)); ++i) {{
          __CLR4_4_1pvppvplb90p9f3.R.inc(33589);final double yDot0 = yDotK[0][i];
          __CLR4_4_1pvppvplb90p9f3.R.inc(33590);final double yDot2 = yDotK[2][i];
          __CLR4_4_1pvppvplb90p9f3.R.inc(33591);final double yDot3 = yDotK[3][i];
          __CLR4_4_1pvppvplb90p9f3.R.inc(33592);final double yDot4 = yDotK[4][i];
          __CLR4_4_1pvppvplb90p9f3.R.inc(33593);final double yDot5 = yDotK[5][i];
          __CLR4_4_1pvppvplb90p9f3.R.inc(33594);final double yDot6 = yDotK[6][i];
          __CLR4_4_1pvppvplb90p9f3.R.inc(33595);v1[i] = A70 * yDot0 + A72 * yDot2 + A73 * yDot3 + A74 * yDot4 + A75 * yDot5;
          __CLR4_4_1pvppvplb90p9f3.R.inc(33596);v2[i] = yDot0 - v1[i];
          __CLR4_4_1pvppvplb90p9f3.R.inc(33597);v3[i] = v1[i] - v2[i] - yDot6;
          __CLR4_4_1pvppvplb90p9f3.R.inc(33598);v4[i] = D0 * yDot0 + D2 * yDot2 + D3 * yDot3 + D4 * yDot4 + D5 * yDot5 + D6 * yDot6;
      }

      }__CLR4_4_1pvppvplb90p9f3.R.inc(33599);vectorsInitialized = true;

    }

    // interpolate
    }__CLR4_4_1pvppvplb90p9f3.R.inc(33600);final double eta = 1 - theta;
    __CLR4_4_1pvppvplb90p9f3.R.inc(33601);final double twoTheta = 2 * theta;
    __CLR4_4_1pvppvplb90p9f3.R.inc(33602);final double dot2 = 1 - twoTheta;
    __CLR4_4_1pvppvplb90p9f3.R.inc(33603);final double dot3 = theta * (2 - 3 * theta);
    __CLR4_4_1pvppvplb90p9f3.R.inc(33604);final double dot4 = twoTheta * (1 + theta * (twoTheta - 3));
    __CLR4_4_1pvppvplb90p9f3.R.inc(33605);if (((((previousState != null) && (theta <= 0.5))&&(__CLR4_4_1pvppvplb90p9f3.R.iget(33606)!=0|true))||(__CLR4_4_1pvppvplb90p9f3.R.iget(33607)==0&false))) {{
        __CLR4_4_1pvppvplb90p9f3.R.inc(33608);for (int i = 0; (((i < interpolatedState.length)&&(__CLR4_4_1pvppvplb90p9f3.R.iget(33609)!=0|true))||(__CLR4_4_1pvppvplb90p9f3.R.iget(33610)==0&false)); ++i) {{
            __CLR4_4_1pvppvplb90p9f3.R.inc(33611);interpolatedState[i] =
                    previousState[i] + theta * h * (v1[i] + eta * (v2[i] + theta * (v3[i] + eta * v4[i])));
            __CLR4_4_1pvppvplb90p9f3.R.inc(33612);interpolatedDerivatives[i] = v1[i] + dot2 * v2[i] + dot3 * v3[i] + dot4 * v4[i];
        }
    }} }else {{
        __CLR4_4_1pvppvplb90p9f3.R.inc(33613);for (int i = 0; (((i < interpolatedState.length)&&(__CLR4_4_1pvppvplb90p9f3.R.iget(33614)!=0|true))||(__CLR4_4_1pvppvplb90p9f3.R.iget(33615)==0&false)); ++i) {{
            __CLR4_4_1pvppvplb90p9f3.R.inc(33616);interpolatedState[i] =
                    currentState[i] - oneMinusThetaH * (v1[i] - theta * (v2[i] + theta * (v3[i] + eta * v4[i])));
            __CLR4_4_1pvppvplb90p9f3.R.inc(33617);interpolatedDerivatives[i] = v1[i] + dot2 * v2[i] + dot3 * v3[i] + dot4 * v4[i];
        }
    }}

  }}finally{__CLR4_4_1pvppvplb90p9f3.R.flushNeeded();}}

}
