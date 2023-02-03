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

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.ode.AbstractIntegrator;
import org.apache.commons.math3.ode.EquationsMapper;
import org.apache.commons.math3.ode.sampling.StepInterpolator;

/**
 * This class represents an interpolator over the last step during an
 * ODE integration for the 8(5,3) Dormand-Prince integrator.
 *
 * @see DormandPrince853Integrator
 *
 * @version $Id$
 * @since 1.2
 */

class DormandPrince853StepInterpolator
  extends RungeKuttaStepInterpolator {public static class __CLR4_4_1pympymlb90p9gh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,33812,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier. */
    private static final long serialVersionUID = 20111120L;

    /** Propagation weights, element 1. */
    private static final double B_01 =         104257.0 / 1920240.0;

    // elements 2 to 5 are zero, so they are neither stored nor used

    /** Propagation weights, element 6. */
    private static final double B_06 =        3399327.0 / 763840.0;

    /** Propagation weights, element 7. */
    private static final double B_07 =       66578432.0 / 35198415.0;

    /** Propagation weights, element 8. */
    private static final double B_08 =    -1674902723.0 / 288716400.0;

    /** Propagation weights, element 9. */
    private static final double B_09 = 54980371265625.0 / 176692375811392.0;

    /** Propagation weights, element 10. */
    private static final double B_10 =        -734375.0 / 4826304.0;

    /** Propagation weights, element 11. */
    private static final double B_11 =      171414593.0 / 851261400.0;

    /** Propagation weights, element 12. */
    private static final double B_12 =         137909.0 / 3084480.0;

    /** Time step for stage 14 (interpolation only). */
    private static final double C14    = 1.0 / 10.0;

    /** Internal weights for stage 14, element 1. */
    private static final double K14_01 =       13481885573.0 / 240030000000.0      - B_01;

    // elements 2 to 5 are zero, so they are neither stored nor used

    /** Internal weights for stage 14, element 6. */
    private static final double K14_06 =                 0.0                       - B_06;

    /** Internal weights for stage 14, element 7. */
    private static final double K14_07 =      139418837528.0 / 549975234375.0      - B_07;

    /** Internal weights for stage 14, element 8. */
    private static final double K14_08 =   -11108320068443.0 / 45111937500000.0    - B_08;

    /** Internal weights for stage 14, element 9. */
    private static final double K14_09 = -1769651421925959.0 / 14249385146080000.0 - B_09;

    /** Internal weights for stage 14, element 10. */
    private static final double K14_10 =          57799439.0 / 377055000.0         - B_10;

    /** Internal weights for stage 14, element 11. */
    private static final double K14_11 =      793322643029.0 / 96734250000000.0    - B_11;

    /** Internal weights for stage 14, element 12. */
    private static final double K14_12 =        1458939311.0 / 192780000000.0      - B_12;

    /** Internal weights for stage 14, element 13. */
    private static final double K14_13 =             -4149.0 / 500000.0;

    /** Time step for stage 15 (interpolation only). */
    private static final double C15    = 1.0 / 5.0;


    /** Internal weights for stage 15, element 1. */
    private static final double K15_01 =     1595561272731.0 / 50120273500000.0    - B_01;

    // elements 2 to 5 are zero, so they are neither stored nor used

    /** Internal weights for stage 15, element 6. */
    private static final double K15_06 =      975183916491.0 / 34457688031250.0    - B_06;

    /** Internal weights for stage 15, element 7. */
    private static final double K15_07 =    38492013932672.0 / 718912673015625.0   - B_07;

    /** Internal weights for stage 15, element 8. */
    private static final double K15_08 = -1114881286517557.0 / 20298710767500000.0 - B_08;

    /** Internal weights for stage 15, element 9. */
    private static final double K15_09 =                 0.0                       - B_09;

    /** Internal weights for stage 15, element 10. */
    private static final double K15_10 =                 0.0                       - B_10;

    /** Internal weights for stage 15, element 11. */
    private static final double K15_11 =    -2538710946863.0 / 23431227861250000.0 - B_11;

    /** Internal weights for stage 15, element 12. */
    private static final double K15_12 =        8824659001.0 / 23066716781250.0    - B_12;

    /** Internal weights for stage 15, element 13. */
    private static final double K15_13 =      -11518334563.0 / 33831184612500.0;

    /** Internal weights for stage 15, element 14. */
    private static final double K15_14 =        1912306948.0 / 13532473845.0;

    /** Time step for stage 16 (interpolation only). */
    private static final double C16    = 7.0 / 9.0;


    /** Internal weights for stage 16, element 1. */
    private static final double K16_01 =      -13613986967.0 / 31741908048.0       - B_01;

    // elements 2 to 5 are zero, so they are neither stored nor used

    /** Internal weights for stage 16, element 6. */
    private static final double K16_06 =       -4755612631.0 / 1012344804.0        - B_06;

    /** Internal weights for stage 16, element 7. */
    private static final double K16_07 =    42939257944576.0 / 5588559685701.0     - B_07;

    /** Internal weights for stage 16, element 8. */
    private static final double K16_08 =    77881972900277.0 / 19140370552944.0    - B_08;

    /** Internal weights for stage 16, element 9. */
    private static final double K16_09 =    22719829234375.0 / 63689648654052.0    - B_09;

    /** Internal weights for stage 16, element 10. */
    private static final double K16_10 =                 0.0                       - B_10;

    /** Internal weights for stage 16, element 11. */
    private static final double K16_11 =                 0.0                       - B_11;

    /** Internal weights for stage 16, element 12. */
    private static final double K16_12 =                 0.0                       - B_12;

    /** Internal weights for stage 16, element 13. */
    private static final double K16_13 =       -1199007803.0 / 857031517296.0;

    /** Internal weights for stage 16, element 14. */
    private static final double K16_14 =      157882067000.0 / 53564469831.0;

    /** Internal weights for stage 16, element 15. */
    private static final double K16_15 =     -290468882375.0 / 31741908048.0;

    /** Interpolation weights.
     * (beware that only the non-null values are in the table)
     */
    private static final double[][] D = {

      {        -17751989329.0 / 2106076560.0,               4272954039.0 / 7539864640.0,
              -118476319744.0 / 38604839385.0,            755123450731.0 / 316657731600.0,
        3692384461234828125.0 / 1744130441634250432.0,     -4612609375.0 / 5293382976.0,
              2091772278379.0 / 933644586600.0,             2136624137.0 / 3382989120.0,
                    -126493.0 / 1421424.0,                    98350000.0 / 5419179.0,
                  -18878125.0 / 2053168.0,                 -1944542619.0 / 438351368.0},

      {         32941697297.0 / 3159114840.0,             456696183123.0 / 1884966160.0,
             19132610714624.0 / 115814518155.0,       -177904688592943.0 / 474986597400.0,
       -4821139941836765625.0 / 218016305204281304.0,      30702015625.0 / 3970037232.0,
            -85916079474274.0 / 2800933759800.0,           -5919468007.0 / 634310460.0,
                    2479159.0 / 157936.0,                    -18750000.0 / 602131.0,
                  -19203125.0 / 2053168.0,                 15700361463.0 / 438351368.0},

      {         12627015655.0 / 631822968.0,              -72955222965.0 / 188496616.0,
            -13145744952320.0 / 69488710893.0,          30084216194513.0 / 56998391688.0,
        -296858761006640625.0 / 25648977082856624.0,         569140625.0 / 82709109.0,
               -18684190637.0 / 18672891732.0,                69644045.0 / 89549712.0,
                  -11847025.0 / 4264272.0,                  -978650000.0 / 16257537.0,
                  519371875.0 / 6159504.0,                  5256837225.0 / 438351368.0},

      {          -450944925.0 / 17550638.0,               -14532122925.0 / 94248308.0,
              -595876966400.0 / 2573655959.0,             188748653015.0 / 527762886.0,
        2545485458115234375.0 / 27252038150535163.0,       -1376953125.0 / 36759604.0,
                53995596795.0 / 518691437.0,                 210311225.0 / 7047894.0,
                   -1718875.0 / 39484.0,                      58000000.0 / 602131.0,
                   -1546875.0 / 39484.0,                   -1262172375.0 / 8429834.0}

    };

    /** Last evaluations. */
    private double[][] yDotKLast;

    /** Vectors for interpolation. */
    private double[][] v;

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
  public DormandPrince853StepInterpolator() {
    super();__CLR4_4_1pympymlb90p9gh.R.inc(33647);try{__CLR4_4_1pympymlb90p9gh.R.inc(33646);
    __CLR4_4_1pympymlb90p9gh.R.inc(33648);yDotKLast = null;
    __CLR4_4_1pympymlb90p9gh.R.inc(33649);v         = null;
    __CLR4_4_1pympymlb90p9gh.R.inc(33650);vectorsInitialized = false;
  }finally{__CLR4_4_1pympymlb90p9gh.R.flushNeeded();}}

  /** Copy constructor.
   * @param interpolator interpolator to copy from. The copy is a deep
   * copy: its arrays are separated from the original arrays of the
   * instance
   */
  public DormandPrince853StepInterpolator(final DormandPrince853StepInterpolator interpolator) {

    super(interpolator);__CLR4_4_1pympymlb90p9gh.R.inc(33652);try{__CLR4_4_1pympymlb90p9gh.R.inc(33651);

    __CLR4_4_1pympymlb90p9gh.R.inc(33653);if ((((interpolator.currentState == null)&&(__CLR4_4_1pympymlb90p9gh.R.iget(33654)!=0|true))||(__CLR4_4_1pympymlb90p9gh.R.iget(33655)==0&false))) {{

      __CLR4_4_1pympymlb90p9gh.R.inc(33656);yDotKLast = null;
      __CLR4_4_1pympymlb90p9gh.R.inc(33657);v         = null;
      __CLR4_4_1pympymlb90p9gh.R.inc(33658);vectorsInitialized = false;

    } }else {{

      __CLR4_4_1pympymlb90p9gh.R.inc(33659);final int dimension = interpolator.currentState.length;

      __CLR4_4_1pympymlb90p9gh.R.inc(33660);yDotKLast    = new double[3][];
      __CLR4_4_1pympymlb90p9gh.R.inc(33661);for (int k = 0; (((k < yDotKLast.length)&&(__CLR4_4_1pympymlb90p9gh.R.iget(33662)!=0|true))||(__CLR4_4_1pympymlb90p9gh.R.iget(33663)==0&false)); ++k) {{
        __CLR4_4_1pympymlb90p9gh.R.inc(33664);yDotKLast[k] = new double[dimension];
        __CLR4_4_1pympymlb90p9gh.R.inc(33665);System.arraycopy(interpolator.yDotKLast[k], 0, yDotKLast[k], 0,
                         dimension);
      }

      }__CLR4_4_1pympymlb90p9gh.R.inc(33666);v = new double[7][];
      __CLR4_4_1pympymlb90p9gh.R.inc(33667);for (int k = 0; (((k < v.length)&&(__CLR4_4_1pympymlb90p9gh.R.iget(33668)!=0|true))||(__CLR4_4_1pympymlb90p9gh.R.iget(33669)==0&false)); ++k) {{
        __CLR4_4_1pympymlb90p9gh.R.inc(33670);v[k] = new double[dimension];
        __CLR4_4_1pympymlb90p9gh.R.inc(33671);System.arraycopy(interpolator.v[k], 0, v[k], 0, dimension);
      }

      }__CLR4_4_1pympymlb90p9gh.R.inc(33672);vectorsInitialized = interpolator.vectorsInitialized;

    }

  }}finally{__CLR4_4_1pympymlb90p9gh.R.flushNeeded();}}

  /** {@inheritDoc} */
  @Override
  protected StepInterpolator doCopy() {try{__CLR4_4_1pympymlb90p9gh.R.inc(33673);
    __CLR4_4_1pympymlb90p9gh.R.inc(33674);return new DormandPrince853StepInterpolator(this);
  }finally{__CLR4_4_1pympymlb90p9gh.R.flushNeeded();}}

  /** {@inheritDoc} */
  @Override
  public void reinitialize(final AbstractIntegrator integrator,
                           final double[] y, final double[][] yDotK, final boolean forward,
                           final EquationsMapper primaryMapper,
                           final EquationsMapper[] secondaryMappers) {try{__CLR4_4_1pympymlb90p9gh.R.inc(33675);

    __CLR4_4_1pympymlb90p9gh.R.inc(33676);super.reinitialize(integrator, y, yDotK, forward, primaryMapper, secondaryMappers);

    __CLR4_4_1pympymlb90p9gh.R.inc(33677);final int dimension = currentState.length;

    __CLR4_4_1pympymlb90p9gh.R.inc(33678);yDotKLast = new double[3][];
    __CLR4_4_1pympymlb90p9gh.R.inc(33679);for (int k = 0; (((k < yDotKLast.length)&&(__CLR4_4_1pympymlb90p9gh.R.iget(33680)!=0|true))||(__CLR4_4_1pympymlb90p9gh.R.iget(33681)==0&false)); ++k) {{
      __CLR4_4_1pympymlb90p9gh.R.inc(33682);yDotKLast[k] = new double[dimension];
    }

    }__CLR4_4_1pympymlb90p9gh.R.inc(33683);v = new double[7][];
    __CLR4_4_1pympymlb90p9gh.R.inc(33684);for (int k = 0; (((k < v.length)&&(__CLR4_4_1pympymlb90p9gh.R.iget(33685)!=0|true))||(__CLR4_4_1pympymlb90p9gh.R.iget(33686)==0&false)); ++k) {{
      __CLR4_4_1pympymlb90p9gh.R.inc(33687);v[k]  = new double[dimension];
    }

    }__CLR4_4_1pympymlb90p9gh.R.inc(33688);vectorsInitialized = false;

  }finally{__CLR4_4_1pympymlb90p9gh.R.flushNeeded();}}

  /** {@inheritDoc} */
  @Override
  public void storeTime(final double t) {try{__CLR4_4_1pympymlb90p9gh.R.inc(33689);
    __CLR4_4_1pympymlb90p9gh.R.inc(33690);super.storeTime(t);
    __CLR4_4_1pympymlb90p9gh.R.inc(33691);vectorsInitialized = false;
  }finally{__CLR4_4_1pympymlb90p9gh.R.flushNeeded();}}

  /** {@inheritDoc} */
  @Override
  protected void computeInterpolatedStateAndDerivatives(final double theta,
                                          final double oneMinusThetaH)
      throws MaxCountExceededException {try{__CLR4_4_1pympymlb90p9gh.R.inc(33692);

    __CLR4_4_1pympymlb90p9gh.R.inc(33693);if ((((! vectorsInitialized)&&(__CLR4_4_1pympymlb90p9gh.R.iget(33694)!=0|true))||(__CLR4_4_1pympymlb90p9gh.R.iget(33695)==0&false))) {{

      __CLR4_4_1pympymlb90p9gh.R.inc(33696);if ((((v == null)&&(__CLR4_4_1pympymlb90p9gh.R.iget(33697)!=0|true))||(__CLR4_4_1pympymlb90p9gh.R.iget(33698)==0&false))) {{
        __CLR4_4_1pympymlb90p9gh.R.inc(33699);v = new double[7][];
        __CLR4_4_1pympymlb90p9gh.R.inc(33700);for (int k = 0; (((k < 7)&&(__CLR4_4_1pympymlb90p9gh.R.iget(33701)!=0|true))||(__CLR4_4_1pympymlb90p9gh.R.iget(33702)==0&false)); ++k) {{
          __CLR4_4_1pympymlb90p9gh.R.inc(33703);v[k] = new double[interpolatedState.length];
        }
      }}

      // perform the last evaluations if they have not been done yet
      }__CLR4_4_1pympymlb90p9gh.R.inc(33704);finalizeStep();

      // compute the interpolation vectors for this time step
      __CLR4_4_1pympymlb90p9gh.R.inc(33705);for (int i = 0; (((i < interpolatedState.length)&&(__CLR4_4_1pympymlb90p9gh.R.iget(33706)!=0|true))||(__CLR4_4_1pympymlb90p9gh.R.iget(33707)==0&false)); ++i) {{
          __CLR4_4_1pympymlb90p9gh.R.inc(33708);final double yDot1  = yDotK[0][i];
          __CLR4_4_1pympymlb90p9gh.R.inc(33709);final double yDot6  = yDotK[5][i];
          __CLR4_4_1pympymlb90p9gh.R.inc(33710);final double yDot7  = yDotK[6][i];
          __CLR4_4_1pympymlb90p9gh.R.inc(33711);final double yDot8  = yDotK[7][i];
          __CLR4_4_1pympymlb90p9gh.R.inc(33712);final double yDot9  = yDotK[8][i];
          __CLR4_4_1pympymlb90p9gh.R.inc(33713);final double yDot10 = yDotK[9][i];
          __CLR4_4_1pympymlb90p9gh.R.inc(33714);final double yDot11 = yDotK[10][i];
          __CLR4_4_1pympymlb90p9gh.R.inc(33715);final double yDot12 = yDotK[11][i];
          __CLR4_4_1pympymlb90p9gh.R.inc(33716);final double yDot13 = yDotK[12][i];
          __CLR4_4_1pympymlb90p9gh.R.inc(33717);final double yDot14 = yDotKLast[0][i];
          __CLR4_4_1pympymlb90p9gh.R.inc(33718);final double yDot15 = yDotKLast[1][i];
          __CLR4_4_1pympymlb90p9gh.R.inc(33719);final double yDot16 = yDotKLast[2][i];
          __CLR4_4_1pympymlb90p9gh.R.inc(33720);v[0][i] = B_01 * yDot1  + B_06 * yDot6 + B_07 * yDot7 +
                    B_08 * yDot8  + B_09 * yDot9 + B_10 * yDot10 +
                    B_11 * yDot11 + B_12 * yDot12;
          __CLR4_4_1pympymlb90p9gh.R.inc(33721);v[1][i] = yDot1 - v[0][i];
          __CLR4_4_1pympymlb90p9gh.R.inc(33722);v[2][i] = v[0][i] - v[1][i] - yDotK[12][i];
          __CLR4_4_1pympymlb90p9gh.R.inc(33723);for (int k = 0; (((k < D.length)&&(__CLR4_4_1pympymlb90p9gh.R.iget(33724)!=0|true))||(__CLR4_4_1pympymlb90p9gh.R.iget(33725)==0&false)); ++k) {{
              __CLR4_4_1pympymlb90p9gh.R.inc(33726);v[k+3][i] = D[k][0] * yDot1  + D[k][1]  * yDot6  + D[k][2]  * yDot7  +
                          D[k][3] * yDot8  + D[k][4]  * yDot9  + D[k][5]  * yDot10 +
                          D[k][6] * yDot11 + D[k][7]  * yDot12 + D[k][8]  * yDot13 +
                          D[k][9] * yDot14 + D[k][10] * yDot15 + D[k][11] * yDot16;
          }
      }}

      }__CLR4_4_1pympymlb90p9gh.R.inc(33727);vectorsInitialized = true;

    }

    }__CLR4_4_1pympymlb90p9gh.R.inc(33728);final double eta      = 1 - theta;
    __CLR4_4_1pympymlb90p9gh.R.inc(33729);final double twoTheta = 2 * theta;
    __CLR4_4_1pympymlb90p9gh.R.inc(33730);final double theta2   = theta * theta;
    __CLR4_4_1pympymlb90p9gh.R.inc(33731);final double dot1 = 1 - twoTheta;
    __CLR4_4_1pympymlb90p9gh.R.inc(33732);final double dot2 = theta * (2 - 3 * theta);
    __CLR4_4_1pympymlb90p9gh.R.inc(33733);final double dot3 = twoTheta * (1 + theta * (twoTheta -3));
    __CLR4_4_1pympymlb90p9gh.R.inc(33734);final double dot4 = theta2 * (3 + theta * (5 * theta - 8));
    __CLR4_4_1pympymlb90p9gh.R.inc(33735);final double dot5 = theta2 * (3 + theta * (-12 + theta * (15 - 6 * theta)));
    __CLR4_4_1pympymlb90p9gh.R.inc(33736);final double dot6 = theta2 * theta * (4 + theta * (-15 + theta * (18 - 7 * theta)));

    __CLR4_4_1pympymlb90p9gh.R.inc(33737);if (((((previousState != null) && (theta <= 0.5))&&(__CLR4_4_1pympymlb90p9gh.R.iget(33738)!=0|true))||(__CLR4_4_1pympymlb90p9gh.R.iget(33739)==0&false))) {{
        __CLR4_4_1pympymlb90p9gh.R.inc(33740);for (int i = 0; (((i < interpolatedState.length)&&(__CLR4_4_1pympymlb90p9gh.R.iget(33741)!=0|true))||(__CLR4_4_1pympymlb90p9gh.R.iget(33742)==0&false)); ++i) {{
            __CLR4_4_1pympymlb90p9gh.R.inc(33743);interpolatedState[i] = previousState[i] +
                    theta * h * (v[0][i] +
                            eta * (v[1][i] +
                                    theta * (v[2][i] +
                                            eta * (v[3][i] +
                                                    theta * (v[4][i] +
                                                            eta * (v[5][i] +
                                                                    theta * (v[6][i])))))));
            __CLR4_4_1pympymlb90p9gh.R.inc(33744);interpolatedDerivatives[i] =  v[0][i] + dot1 * v[1][i] + dot2 * v[2][i] +
                    dot3 * v[3][i] + dot4 * v[4][i] +
                    dot5 * v[5][i] + dot6 * v[6][i];
        }
    }} }else {{
        __CLR4_4_1pympymlb90p9gh.R.inc(33745);for (int i = 0; (((i < interpolatedState.length)&&(__CLR4_4_1pympymlb90p9gh.R.iget(33746)!=0|true))||(__CLR4_4_1pympymlb90p9gh.R.iget(33747)==0&false)); ++i) {{
            __CLR4_4_1pympymlb90p9gh.R.inc(33748);interpolatedState[i] = currentState[i] -
                    oneMinusThetaH * (v[0][i] -
                            theta * (v[1][i] +
                                    theta * (v[2][i] +
                                            eta * (v[3][i] +
                                                    theta * (v[4][i] +
                                                            eta * (v[5][i] +
                                                                    theta * (v[6][i])))))));
            __CLR4_4_1pympymlb90p9gh.R.inc(33749);interpolatedDerivatives[i] =  v[0][i] + dot1 * v[1][i] + dot2 * v[2][i] +
                    dot3 * v[3][i] + dot4 * v[4][i] +
                    dot5 * v[5][i] + dot6 * v[6][i];
        }
    }}

  }}finally{__CLR4_4_1pympymlb90p9gh.R.flushNeeded();}}

  /** {@inheritDoc} */
  @Override
  protected void doFinalize() throws MaxCountExceededException {try{__CLR4_4_1pympymlb90p9gh.R.inc(33750);

      __CLR4_4_1pympymlb90p9gh.R.inc(33751);if ((((currentState == null)&&(__CLR4_4_1pympymlb90p9gh.R.iget(33752)!=0|true))||(__CLR4_4_1pympymlb90p9gh.R.iget(33753)==0&false))) {{
          // we are finalizing an uninitialized instance
          __CLR4_4_1pympymlb90p9gh.R.inc(33754);return;
      }

      }__CLR4_4_1pympymlb90p9gh.R.inc(33755);double s;
      __CLR4_4_1pympymlb90p9gh.R.inc(33756);final double[] yTmp = new double[currentState.length];
      __CLR4_4_1pympymlb90p9gh.R.inc(33757);final double pT = getGlobalPreviousTime();

      // k14
      __CLR4_4_1pympymlb90p9gh.R.inc(33758);for (int j = 0; (((j < currentState.length)&&(__CLR4_4_1pympymlb90p9gh.R.iget(33759)!=0|true))||(__CLR4_4_1pympymlb90p9gh.R.iget(33760)==0&false)); ++j) {{
          __CLR4_4_1pympymlb90p9gh.R.inc(33761);s = K14_01 * yDotK[0][j]  + K14_06 * yDotK[5][j]  + K14_07 * yDotK[6][j] +
                  K14_08 * yDotK[7][j]  + K14_09 * yDotK[8][j]  + K14_10 * yDotK[9][j] +
                  K14_11 * yDotK[10][j] + K14_12 * yDotK[11][j] + K14_13 * yDotK[12][j];
          __CLR4_4_1pympymlb90p9gh.R.inc(33762);yTmp[j] = currentState[j] + h * s;
      }
      }__CLR4_4_1pympymlb90p9gh.R.inc(33763);integrator.computeDerivatives(pT + C14 * h, yTmp, yDotKLast[0]);

      // k15
      __CLR4_4_1pympymlb90p9gh.R.inc(33764);for (int j = 0; (((j < currentState.length)&&(__CLR4_4_1pympymlb90p9gh.R.iget(33765)!=0|true))||(__CLR4_4_1pympymlb90p9gh.R.iget(33766)==0&false)); ++j) {{
          __CLR4_4_1pympymlb90p9gh.R.inc(33767);s = K15_01 * yDotK[0][j]  + K15_06 * yDotK[5][j]  + K15_07 * yDotK[6][j] +
                  K15_08 * yDotK[7][j]  + K15_09 * yDotK[8][j]  + K15_10 * yDotK[9][j] +
                  K15_11 * yDotK[10][j] + K15_12 * yDotK[11][j] + K15_13 * yDotK[12][j] +
                  K15_14 * yDotKLast[0][j];
          __CLR4_4_1pympymlb90p9gh.R.inc(33768);yTmp[j] = currentState[j] + h * s;
      }
      }__CLR4_4_1pympymlb90p9gh.R.inc(33769);integrator.computeDerivatives(pT + C15 * h, yTmp, yDotKLast[1]);

      // k16
      __CLR4_4_1pympymlb90p9gh.R.inc(33770);for (int j = 0; (((j < currentState.length)&&(__CLR4_4_1pympymlb90p9gh.R.iget(33771)!=0|true))||(__CLR4_4_1pympymlb90p9gh.R.iget(33772)==0&false)); ++j) {{
          __CLR4_4_1pympymlb90p9gh.R.inc(33773);s = K16_01 * yDotK[0][j]  + K16_06 * yDotK[5][j]  + K16_07 * yDotK[6][j] +
                  K16_08 * yDotK[7][j]  + K16_09 * yDotK[8][j]  + K16_10 * yDotK[9][j] +
                  K16_11 * yDotK[10][j] + K16_12 * yDotK[11][j] + K16_13 * yDotK[12][j] +
                  K16_14 * yDotKLast[0][j] +  K16_15 * yDotKLast[1][j];
          __CLR4_4_1pympymlb90p9gh.R.inc(33774);yTmp[j] = currentState[j] + h * s;
      }
      }__CLR4_4_1pympymlb90p9gh.R.inc(33775);integrator.computeDerivatives(pT + C16 * h, yTmp, yDotKLast[2]);

  }finally{__CLR4_4_1pympymlb90p9gh.R.flushNeeded();}}

  /** {@inheritDoc} */
  @Override
  public void writeExternal(final ObjectOutput out)
    throws IOException {try{__CLR4_4_1pympymlb90p9gh.R.inc(33776);

    __CLR4_4_1pympymlb90p9gh.R.inc(33777);try {
        // save the local attributes
        __CLR4_4_1pympymlb90p9gh.R.inc(33778);finalizeStep();
    } catch (MaxCountExceededException mcee) {
        __CLR4_4_1pympymlb90p9gh.R.inc(33779);final IOException ioe = new IOException(mcee.getLocalizedMessage());
        __CLR4_4_1pympymlb90p9gh.R.inc(33780);ioe.initCause(mcee);
        __CLR4_4_1pympymlb90p9gh.R.inc(33781);throw ioe;
    }

    __CLR4_4_1pympymlb90p9gh.R.inc(33782);final int dimension = ((((currentState == null) )&&(__CLR4_4_1pympymlb90p9gh.R.iget(33783)!=0|true))||(__CLR4_4_1pympymlb90p9gh.R.iget(33784)==0&false))? -1 : currentState.length;
    __CLR4_4_1pympymlb90p9gh.R.inc(33785);out.writeInt(dimension);
    __CLR4_4_1pympymlb90p9gh.R.inc(33786);for (int i = 0; (((i < dimension)&&(__CLR4_4_1pympymlb90p9gh.R.iget(33787)!=0|true))||(__CLR4_4_1pympymlb90p9gh.R.iget(33788)==0&false)); ++i) {{
      __CLR4_4_1pympymlb90p9gh.R.inc(33789);out.writeDouble(yDotKLast[0][i]);
      __CLR4_4_1pympymlb90p9gh.R.inc(33790);out.writeDouble(yDotKLast[1][i]);
      __CLR4_4_1pympymlb90p9gh.R.inc(33791);out.writeDouble(yDotKLast[2][i]);
    }

    // save the state of the base class
    }__CLR4_4_1pympymlb90p9gh.R.inc(33792);super.writeExternal(out);

  }finally{__CLR4_4_1pympymlb90p9gh.R.flushNeeded();}}

  /** {@inheritDoc} */
  @Override
  public void readExternal(final ObjectInput in)
    throws IOException, ClassNotFoundException {try{__CLR4_4_1pympymlb90p9gh.R.inc(33793);

    // read the local attributes
    __CLR4_4_1pympymlb90p9gh.R.inc(33794);yDotKLast = new double[3][];
    __CLR4_4_1pympymlb90p9gh.R.inc(33795);final int dimension = in.readInt();
    __CLR4_4_1pympymlb90p9gh.R.inc(33796);yDotKLast[0] = ((((dimension < 0) )&&(__CLR4_4_1pympymlb90p9gh.R.iget(33797)!=0|true))||(__CLR4_4_1pympymlb90p9gh.R.iget(33798)==0&false))? null : new double[dimension];
    __CLR4_4_1pympymlb90p9gh.R.inc(33799);yDotKLast[1] = ((((dimension < 0) )&&(__CLR4_4_1pympymlb90p9gh.R.iget(33800)!=0|true))||(__CLR4_4_1pympymlb90p9gh.R.iget(33801)==0&false))? null : new double[dimension];
    __CLR4_4_1pympymlb90p9gh.R.inc(33802);yDotKLast[2] = ((((dimension < 0) )&&(__CLR4_4_1pympymlb90p9gh.R.iget(33803)!=0|true))||(__CLR4_4_1pympymlb90p9gh.R.iget(33804)==0&false))? null : new double[dimension];

    __CLR4_4_1pympymlb90p9gh.R.inc(33805);for (int i = 0; (((i < dimension)&&(__CLR4_4_1pympymlb90p9gh.R.iget(33806)!=0|true))||(__CLR4_4_1pympymlb90p9gh.R.iget(33807)==0&false)); ++i) {{
      __CLR4_4_1pympymlb90p9gh.R.inc(33808);yDotKLast[0][i] = in.readDouble();
      __CLR4_4_1pympymlb90p9gh.R.inc(33809);yDotKLast[1][i] = in.readDouble();
      __CLR4_4_1pympymlb90p9gh.R.inc(33810);yDotKLast[2][i] = in.readDouble();
    }

    // read the base state
    }__CLR4_4_1pympymlb90p9gh.R.inc(33811);super.readExternal(in);

  }finally{__CLR4_4_1pympymlb90p9gh.R.flushNeeded();}}

}
