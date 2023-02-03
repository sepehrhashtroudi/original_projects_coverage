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


import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.NoBracketingException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.ode.AbstractIntegrator;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.util.FastMath;

/**
 * This class implements the common part of all fixed step Runge-Kutta
 * integrators for Ordinary Differential Equations.
 *
 * <p>These methods are explicit Runge-Kutta methods, their Butcher
 * arrays are as follows :
 * <pre>
 *    0  |
 *   c2  | a21
 *   c3  | a31  a32
 *   ... |        ...
 *   cs  | as1  as2  ...  ass-1
 *       |--------------------------
 *       |  b1   b2  ...   bs-1  bs
 * </pre>
 * </p>
 *
 * @see EulerIntegrator
 * @see ClassicalRungeKuttaIntegrator
 * @see GillIntegrator
 * @see MidpointIntegrator
 * @version $Id$
 * @since 1.2
 */

public abstract class RungeKuttaIntegrator extends AbstractIntegrator {public static class __CLR4_4_1qv4qv4lb90p9iw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,34893,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Time steps from Butcher array (without the first zero). */
    private final double[] c;

    /** Internal weights from Butcher array (without the first empty row). */
    private final double[][] a;

    /** External weights for the high order method from Butcher array. */
    private final double[] b;

    /** Prototype of the step interpolator. */
    private final RungeKuttaStepInterpolator prototype;

    /** Integration step. */
    private final double step;

  /** Simple constructor.
   * Build a Runge-Kutta integrator with the given
   * step. The default step handler does nothing.
   * @param name name of the method
   * @param c time steps from Butcher array (without the first zero)
   * @param a internal weights from Butcher array (without the first empty row)
   * @param b propagation weights for the high order method from Butcher array
   * @param prototype prototype of the step interpolator to use
   * @param step integration step
   */
  protected RungeKuttaIntegrator(final String name,
                                 final double[] c, final double[][] a, final double[] b,
                                 final RungeKuttaStepInterpolator prototype,
                                 final double step) {
    super(name);__CLR4_4_1qv4qv4lb90p9iw.R.inc(34817);try{__CLR4_4_1qv4qv4lb90p9iw.R.inc(34816);
    __CLR4_4_1qv4qv4lb90p9iw.R.inc(34818);this.c          = c;
    __CLR4_4_1qv4qv4lb90p9iw.R.inc(34819);this.a          = a;
    __CLR4_4_1qv4qv4lb90p9iw.R.inc(34820);this.b          = b;
    __CLR4_4_1qv4qv4lb90p9iw.R.inc(34821);this.prototype  = prototype;
    __CLR4_4_1qv4qv4lb90p9iw.R.inc(34822);this.step       = FastMath.abs(step);
  }finally{__CLR4_4_1qv4qv4lb90p9iw.R.flushNeeded();}}

  /** {@inheritDoc} */
  @Override
  public void integrate(final ExpandableStatefulODE equations, final double t)
      throws NumberIsTooSmallException, DimensionMismatchException,
             MaxCountExceededException, NoBracketingException {try{__CLR4_4_1qv4qv4lb90p9iw.R.inc(34823);

    __CLR4_4_1qv4qv4lb90p9iw.R.inc(34824);sanityChecks(equations, t);
    __CLR4_4_1qv4qv4lb90p9iw.R.inc(34825);setEquations(equations);
    __CLR4_4_1qv4qv4lb90p9iw.R.inc(34826);final boolean forward = t > equations.getTime();

    // create some internal working arrays
    __CLR4_4_1qv4qv4lb90p9iw.R.inc(34827);final double[] y0      = equations.getCompleteState();
    __CLR4_4_1qv4qv4lb90p9iw.R.inc(34828);final double[] y       = y0.clone();
    __CLR4_4_1qv4qv4lb90p9iw.R.inc(34829);final int stages       = c.length + 1;
    __CLR4_4_1qv4qv4lb90p9iw.R.inc(34830);final double[][] yDotK = new double[stages][];
    __CLR4_4_1qv4qv4lb90p9iw.R.inc(34831);for (int i = 0; (((i < stages)&&(__CLR4_4_1qv4qv4lb90p9iw.R.iget(34832)!=0|true))||(__CLR4_4_1qv4qv4lb90p9iw.R.iget(34833)==0&false)); ++i) {{
      __CLR4_4_1qv4qv4lb90p9iw.R.inc(34834);yDotK [i] = new double[y0.length];
    }
    }__CLR4_4_1qv4qv4lb90p9iw.R.inc(34835);final double[] yTmp    = y0.clone();
    __CLR4_4_1qv4qv4lb90p9iw.R.inc(34836);final double[] yDotTmp = new double[y0.length];

    // set up an interpolator sharing the integrator arrays
    __CLR4_4_1qv4qv4lb90p9iw.R.inc(34837);final RungeKuttaStepInterpolator interpolator = (RungeKuttaStepInterpolator) prototype.copy();
    __CLR4_4_1qv4qv4lb90p9iw.R.inc(34838);interpolator.reinitialize(this, yTmp, yDotK, forward,
                              equations.getPrimaryMapper(), equations.getSecondaryMappers());
    __CLR4_4_1qv4qv4lb90p9iw.R.inc(34839);interpolator.storeTime(equations.getTime());

    // set up integration control objects
    __CLR4_4_1qv4qv4lb90p9iw.R.inc(34840);stepStart = equations.getTime();
    __CLR4_4_1qv4qv4lb90p9iw.R.inc(34841);stepSize  = (((forward )&&(__CLR4_4_1qv4qv4lb90p9iw.R.iget(34842)!=0|true))||(__CLR4_4_1qv4qv4lb90p9iw.R.iget(34843)==0&false))? step : -step;
    __CLR4_4_1qv4qv4lb90p9iw.R.inc(34844);initIntegration(equations.getTime(), y0, t);

    // main integration loop
    __CLR4_4_1qv4qv4lb90p9iw.R.inc(34845);isLastStep = false;
    __CLR4_4_1qv4qv4lb90p9iw.R.inc(34846);do {{

      __CLR4_4_1qv4qv4lb90p9iw.R.inc(34847);interpolator.shift();

      // first stage
      __CLR4_4_1qv4qv4lb90p9iw.R.inc(34848);computeDerivatives(stepStart, y, yDotK[0]);

      // next stages
      __CLR4_4_1qv4qv4lb90p9iw.R.inc(34849);for (int k = 1; (((k < stages)&&(__CLR4_4_1qv4qv4lb90p9iw.R.iget(34850)!=0|true))||(__CLR4_4_1qv4qv4lb90p9iw.R.iget(34851)==0&false)); ++k) {{

          __CLR4_4_1qv4qv4lb90p9iw.R.inc(34852);for (int j = 0; (((j < y0.length)&&(__CLR4_4_1qv4qv4lb90p9iw.R.iget(34853)!=0|true))||(__CLR4_4_1qv4qv4lb90p9iw.R.iget(34854)==0&false)); ++j) {{
              __CLR4_4_1qv4qv4lb90p9iw.R.inc(34855);double sum = a[k-1][0] * yDotK[0][j];
              __CLR4_4_1qv4qv4lb90p9iw.R.inc(34856);for (int l = 1; (((l < k)&&(__CLR4_4_1qv4qv4lb90p9iw.R.iget(34857)!=0|true))||(__CLR4_4_1qv4qv4lb90p9iw.R.iget(34858)==0&false)); ++l) {{
                  __CLR4_4_1qv4qv4lb90p9iw.R.inc(34859);sum += a[k-1][l] * yDotK[l][j];
              }
              }__CLR4_4_1qv4qv4lb90p9iw.R.inc(34860);yTmp[j] = y[j] + stepSize * sum;
          }

          }__CLR4_4_1qv4qv4lb90p9iw.R.inc(34861);computeDerivatives(stepStart + c[k-1] * stepSize, yTmp, yDotK[k]);

      }

      // estimate the state at the end of the step
      }__CLR4_4_1qv4qv4lb90p9iw.R.inc(34862);for (int j = 0; (((j < y0.length)&&(__CLR4_4_1qv4qv4lb90p9iw.R.iget(34863)!=0|true))||(__CLR4_4_1qv4qv4lb90p9iw.R.iget(34864)==0&false)); ++j) {{
          __CLR4_4_1qv4qv4lb90p9iw.R.inc(34865);double sum    = b[0] * yDotK[0][j];
          __CLR4_4_1qv4qv4lb90p9iw.R.inc(34866);for (int l = 1; (((l < stages)&&(__CLR4_4_1qv4qv4lb90p9iw.R.iget(34867)!=0|true))||(__CLR4_4_1qv4qv4lb90p9iw.R.iget(34868)==0&false)); ++l) {{
              __CLR4_4_1qv4qv4lb90p9iw.R.inc(34869);sum    += b[l] * yDotK[l][j];
          }
          }__CLR4_4_1qv4qv4lb90p9iw.R.inc(34870);yTmp[j] = y[j] + stepSize * sum;
      }

      // discrete events handling
      }__CLR4_4_1qv4qv4lb90p9iw.R.inc(34871);interpolator.storeTime(stepStart + stepSize);
      __CLR4_4_1qv4qv4lb90p9iw.R.inc(34872);System.arraycopy(yTmp, 0, y, 0, y0.length);
      __CLR4_4_1qv4qv4lb90p9iw.R.inc(34873);System.arraycopy(yDotK[stages - 1], 0, yDotTmp, 0, y0.length);
      __CLR4_4_1qv4qv4lb90p9iw.R.inc(34874);stepStart = acceptStep(interpolator, y, yDotTmp, t);

      __CLR4_4_1qv4qv4lb90p9iw.R.inc(34875);if ((((!isLastStep)&&(__CLR4_4_1qv4qv4lb90p9iw.R.iget(34876)!=0|true))||(__CLR4_4_1qv4qv4lb90p9iw.R.iget(34877)==0&false))) {{

          // prepare next step
          __CLR4_4_1qv4qv4lb90p9iw.R.inc(34878);interpolator.storeTime(stepStart);

          // stepsize control for next step
          __CLR4_4_1qv4qv4lb90p9iw.R.inc(34879);final double  nextT      = stepStart + stepSize;
          __CLR4_4_1qv4qv4lb90p9iw.R.inc(34880);final boolean nextIsLast = (((forward )&&(__CLR4_4_1qv4qv4lb90p9iw.R.iget(34881)!=0|true))||(__CLR4_4_1qv4qv4lb90p9iw.R.iget(34882)==0&false))? (nextT >= t) : (nextT <= t);
          __CLR4_4_1qv4qv4lb90p9iw.R.inc(34883);if ((((nextIsLast)&&(__CLR4_4_1qv4qv4lb90p9iw.R.iget(34884)!=0|true))||(__CLR4_4_1qv4qv4lb90p9iw.R.iget(34885)==0&false))) {{
              __CLR4_4_1qv4qv4lb90p9iw.R.inc(34886);stepSize = t - stepStart;
          }
      }}

    }} }while ((((!isLastStep)&&(__CLR4_4_1qv4qv4lb90p9iw.R.iget(34887)!=0|true))||(__CLR4_4_1qv4qv4lb90p9iw.R.iget(34888)==0&false)));

    // dispatch results
    __CLR4_4_1qv4qv4lb90p9iw.R.inc(34889);equations.setTime(stepStart);
    __CLR4_4_1qv4qv4lb90p9iw.R.inc(34890);equations.setCompleteState(y);

    __CLR4_4_1qv4qv4lb90p9iw.R.inc(34891);stepStart = Double.NaN;
    __CLR4_4_1qv4qv4lb90p9iw.R.inc(34892);stepSize  = Double.NaN;

  }finally{__CLR4_4_1qv4qv4lb90p9iw.R.flushNeeded();}}

}
