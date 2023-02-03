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

import org.apache.commons.math3.ode.AbstractIntegrator;
import org.apache.commons.math3.ode.EquationsMapper;
import org.apache.commons.math3.ode.sampling.AbstractStepInterpolator;

/** This class represents an interpolator over the last step during an
 * ODE integration for Runge-Kutta and embedded Runge-Kutta integrators.
 *
 * @see RungeKuttaIntegrator
 * @see EmbeddedRungeKuttaIntegrator
 *
 * @version $Id$
 * @since 1.2
 */

abstract class RungeKuttaStepInterpolator
  extends AbstractStepInterpolator {public static class __CLR4_4_1qx9qx9lb90p9j2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,34973,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Previous state. */
    protected double[] previousState;

    /** Slopes at the intermediate points */
    protected double[][] yDotK;

    /** Reference to the integrator. */
    protected AbstractIntegrator integrator;

  /** Simple constructor.
   * This constructor builds an instance that is not usable yet, the
   * {@link #reinitialize} method should be called before using the
   * instance in order to initialize the internal arrays. This
   * constructor is used only in order to delay the initialization in
   * some cases. The {@link RungeKuttaIntegrator} and {@link
   * EmbeddedRungeKuttaIntegrator} classes use the prototyping design
   * pattern to create the step interpolators by cloning an
   * uninitialized model and latter initializing the copy.
   */
  protected RungeKuttaStepInterpolator() {try{__CLR4_4_1qx9qx9lb90p9j2.R.inc(34893);
    __CLR4_4_1qx9qx9lb90p9j2.R.inc(34894);previousState = null;
    __CLR4_4_1qx9qx9lb90p9j2.R.inc(34895);yDotK         = null;
    __CLR4_4_1qx9qx9lb90p9j2.R.inc(34896);integrator    = null;
  }finally{__CLR4_4_1qx9qx9lb90p9j2.R.flushNeeded();}}

  /** Copy constructor.

  * <p>The copied interpolator should have been finalized before the
  * copy, otherwise the copy will not be able to perform correctly any
  * interpolation and will throw a {@link NullPointerException}
  * later. Since we don't want this constructor to throw the
  * exceptions finalization may involve and since we don't want this
  * method to modify the state of the copied interpolator,
  * finalization is <strong>not</strong> done automatically, it
  * remains under user control.</p>

  * <p>The copy is a deep copy: its arrays are separated from the
  * original arrays of the instance.</p>

  * @param interpolator interpolator to copy from.

  */
  public RungeKuttaStepInterpolator(final RungeKuttaStepInterpolator interpolator) {

    super(interpolator);__CLR4_4_1qx9qx9lb90p9j2.R.inc(34898);try{__CLR4_4_1qx9qx9lb90p9j2.R.inc(34897);

    __CLR4_4_1qx9qx9lb90p9j2.R.inc(34899);if ((((interpolator.currentState != null)&&(__CLR4_4_1qx9qx9lb90p9j2.R.iget(34900)!=0|true))||(__CLR4_4_1qx9qx9lb90p9j2.R.iget(34901)==0&false))) {{

      __CLR4_4_1qx9qx9lb90p9j2.R.inc(34902);previousState = interpolator.previousState.clone();

      __CLR4_4_1qx9qx9lb90p9j2.R.inc(34903);yDotK = new double[interpolator.yDotK.length][];
      __CLR4_4_1qx9qx9lb90p9j2.R.inc(34904);for (int k = 0; (((k < interpolator.yDotK.length)&&(__CLR4_4_1qx9qx9lb90p9j2.R.iget(34905)!=0|true))||(__CLR4_4_1qx9qx9lb90p9j2.R.iget(34906)==0&false)); ++k) {{
        __CLR4_4_1qx9qx9lb90p9j2.R.inc(34907);yDotK[k] = interpolator.yDotK[k].clone();
      }

    }} }else {{
      __CLR4_4_1qx9qx9lb90p9j2.R.inc(34908);previousState = null;
      __CLR4_4_1qx9qx9lb90p9j2.R.inc(34909);yDotK = null;
    }

    // we cannot keep any reference to the equations in the copy
    // the interpolator should have been finalized before
    }__CLR4_4_1qx9qx9lb90p9j2.R.inc(34910);integrator = null;

  }finally{__CLR4_4_1qx9qx9lb90p9j2.R.flushNeeded();}}

  /** Reinitialize the instance
   * <p>Some Runge-Kutta integrators need fewer functions evaluations
   * than their counterpart step interpolators. So the interpolator
   * should perform the last evaluations they need by themselves. The
   * {@link RungeKuttaIntegrator RungeKuttaIntegrator} and {@link
   * EmbeddedRungeKuttaIntegrator EmbeddedRungeKuttaIntegrator}
   * abstract classes call this method in order to let the step
   * interpolator perform the evaluations it needs. These evaluations
   * will be performed during the call to <code>doFinalize</code> if
   * any, i.e. only if the step handler either calls the {@link
   * AbstractStepInterpolator#finalizeStep finalizeStep} method or the
   * {@link AbstractStepInterpolator#getInterpolatedState
   * getInterpolatedState} method (for an interpolator which needs a
   * finalization) or if it clones the step interpolator.</p>
   * @param rkIntegrator integrator being used
   * @param y reference to the integrator array holding the state at
   * the end of the step
   * @param yDotArray reference to the integrator array holding all the
   * intermediate slopes
   * @param forward integration direction indicator
   * @param primaryMapper equations mapper for the primary equations set
   * @param secondaryMappers equations mappers for the secondary equations sets
   */
  public void reinitialize(final AbstractIntegrator rkIntegrator,
                           final double[] y, final double[][] yDotArray, final boolean forward,
                           final EquationsMapper primaryMapper,
                           final EquationsMapper[] secondaryMappers) {try{__CLR4_4_1qx9qx9lb90p9j2.R.inc(34911);
    __CLR4_4_1qx9qx9lb90p9j2.R.inc(34912);reinitialize(y, forward, primaryMapper, secondaryMappers);
    __CLR4_4_1qx9qx9lb90p9j2.R.inc(34913);this.previousState = null;
    __CLR4_4_1qx9qx9lb90p9j2.R.inc(34914);this.yDotK = yDotArray;
    __CLR4_4_1qx9qx9lb90p9j2.R.inc(34915);this.integrator = rkIntegrator;
  }finally{__CLR4_4_1qx9qx9lb90p9j2.R.flushNeeded();}}

  /** {@inheritDoc} */
  @Override
  public void shift() {try{__CLR4_4_1qx9qx9lb90p9j2.R.inc(34916);
    __CLR4_4_1qx9qx9lb90p9j2.R.inc(34917);previousState = currentState.clone();
    __CLR4_4_1qx9qx9lb90p9j2.R.inc(34918);super.shift();
  }finally{__CLR4_4_1qx9qx9lb90p9j2.R.flushNeeded();}}

  /** {@inheritDoc} */
  @Override
  public void writeExternal(final ObjectOutput out)
    throws IOException {try{__CLR4_4_1qx9qx9lb90p9j2.R.inc(34919);

    // save the state of the base class
    __CLR4_4_1qx9qx9lb90p9j2.R.inc(34920);writeBaseExternal(out);

    // save the local attributes
    __CLR4_4_1qx9qx9lb90p9j2.R.inc(34921);final int n = ((((currentState == null) )&&(__CLR4_4_1qx9qx9lb90p9j2.R.iget(34922)!=0|true))||(__CLR4_4_1qx9qx9lb90p9j2.R.iget(34923)==0&false))? -1 : currentState.length;
    __CLR4_4_1qx9qx9lb90p9j2.R.inc(34924);for (int i = 0; (((i < n)&&(__CLR4_4_1qx9qx9lb90p9j2.R.iget(34925)!=0|true))||(__CLR4_4_1qx9qx9lb90p9j2.R.iget(34926)==0&false)); ++i) {{
      __CLR4_4_1qx9qx9lb90p9j2.R.inc(34927);out.writeDouble(previousState[i]);
    }

    }__CLR4_4_1qx9qx9lb90p9j2.R.inc(34928);final int kMax = ((((yDotK == null) )&&(__CLR4_4_1qx9qx9lb90p9j2.R.iget(34929)!=0|true))||(__CLR4_4_1qx9qx9lb90p9j2.R.iget(34930)==0&false))? -1 : yDotK.length;
    __CLR4_4_1qx9qx9lb90p9j2.R.inc(34931);out.writeInt(kMax);
    __CLR4_4_1qx9qx9lb90p9j2.R.inc(34932);for (int k = 0; (((k < kMax)&&(__CLR4_4_1qx9qx9lb90p9j2.R.iget(34933)!=0|true))||(__CLR4_4_1qx9qx9lb90p9j2.R.iget(34934)==0&false)); ++k) {{
      __CLR4_4_1qx9qx9lb90p9j2.R.inc(34935);for (int i = 0; (((i < n)&&(__CLR4_4_1qx9qx9lb90p9j2.R.iget(34936)!=0|true))||(__CLR4_4_1qx9qx9lb90p9j2.R.iget(34937)==0&false)); ++i) {{
        __CLR4_4_1qx9qx9lb90p9j2.R.inc(34938);out.writeDouble(yDotK[k][i]);
      }
    }}

    // we do not save any reference to the equations

  }}finally{__CLR4_4_1qx9qx9lb90p9j2.R.flushNeeded();}}

  /** {@inheritDoc} */
  @Override
  public void readExternal(final ObjectInput in)
    throws IOException, ClassNotFoundException {try{__CLR4_4_1qx9qx9lb90p9j2.R.inc(34939);

    // read the base class
    __CLR4_4_1qx9qx9lb90p9j2.R.inc(34940);final double t = readBaseExternal(in);

    // read the local attributes
    __CLR4_4_1qx9qx9lb90p9j2.R.inc(34941);final int n = ((((currentState == null) )&&(__CLR4_4_1qx9qx9lb90p9j2.R.iget(34942)!=0|true))||(__CLR4_4_1qx9qx9lb90p9j2.R.iget(34943)==0&false))? -1 : currentState.length;
    __CLR4_4_1qx9qx9lb90p9j2.R.inc(34944);if ((((n < 0)&&(__CLR4_4_1qx9qx9lb90p9j2.R.iget(34945)!=0|true))||(__CLR4_4_1qx9qx9lb90p9j2.R.iget(34946)==0&false))) {{
      __CLR4_4_1qx9qx9lb90p9j2.R.inc(34947);previousState = null;
    } }else {{
      __CLR4_4_1qx9qx9lb90p9j2.R.inc(34948);previousState = new double[n];
      __CLR4_4_1qx9qx9lb90p9j2.R.inc(34949);for (int i = 0; (((i < n)&&(__CLR4_4_1qx9qx9lb90p9j2.R.iget(34950)!=0|true))||(__CLR4_4_1qx9qx9lb90p9j2.R.iget(34951)==0&false)); ++i) {{
        __CLR4_4_1qx9qx9lb90p9j2.R.inc(34952);previousState[i] = in.readDouble();
      }
    }}

    }__CLR4_4_1qx9qx9lb90p9j2.R.inc(34953);final int kMax = in.readInt();
    __CLR4_4_1qx9qx9lb90p9j2.R.inc(34954);yDotK = ((((kMax < 0) )&&(__CLR4_4_1qx9qx9lb90p9j2.R.iget(34955)!=0|true))||(__CLR4_4_1qx9qx9lb90p9j2.R.iget(34956)==0&false))? null : new double[kMax][];
    __CLR4_4_1qx9qx9lb90p9j2.R.inc(34957);for (int k = 0; (((k < kMax)&&(__CLR4_4_1qx9qx9lb90p9j2.R.iget(34958)!=0|true))||(__CLR4_4_1qx9qx9lb90p9j2.R.iget(34959)==0&false)); ++k) {{
      __CLR4_4_1qx9qx9lb90p9j2.R.inc(34960);yDotK[k] = ((((n < 0) )&&(__CLR4_4_1qx9qx9lb90p9j2.R.iget(34961)!=0|true))||(__CLR4_4_1qx9qx9lb90p9j2.R.iget(34962)==0&false))? null : new double[n];
      __CLR4_4_1qx9qx9lb90p9j2.R.inc(34963);for (int i = 0; (((i < n)&&(__CLR4_4_1qx9qx9lb90p9j2.R.iget(34964)!=0|true))||(__CLR4_4_1qx9qx9lb90p9j2.R.iget(34965)==0&false)); ++i) {{
        __CLR4_4_1qx9qx9lb90p9j2.R.inc(34966);yDotK[k][i] = in.readDouble();
      }
    }}

    }__CLR4_4_1qx9qx9lb90p9j2.R.inc(34967);integrator = null;

    __CLR4_4_1qx9qx9lb90p9j2.R.inc(34968);if ((((currentState != null)&&(__CLR4_4_1qx9qx9lb90p9j2.R.iget(34969)!=0|true))||(__CLR4_4_1qx9qx9lb90p9j2.R.iget(34970)==0&false))) {{
        // we can now set the interpolated time and state
        __CLR4_4_1qx9qx9lb90p9j2.R.inc(34971);setInterpolatedTime(t);
    } }else {{
        __CLR4_4_1qx9qx9lb90p9j2.R.inc(34972);interpolatedTime = t;
    }

  }}finally{__CLR4_4_1qx9qx9lb90p9j2.R.flushNeeded();}}

}
