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

import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.util.FastMath;

/**
 * This class is used in the junit tests for the ODE integrators.

 * <p>This specific problem is the following differential equation :
 * <pre>
 *    x'' = -x
 * </pre>
 * And when x decreases down to 0, the state should be changed as follows :
 * <pre>
 *   x' -> -x'
 * </pre>
 * The theoretical solution of this problem is x = |sin(t+a)|
 * </p>

 */
public class TestProblem4
  extends TestProblemAbstract {static class __CLR4_4_11yo61yo6lb90pdif{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,91638,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  /** Time offset. */
  private double a;

  /** theoretical state */
  private double[] y;

  /** Simple constructor. */
  public TestProblem4() {
    super();__CLR4_4_11yo61yo6lb90pdif.R.inc(91591);try{__CLR4_4_11yo61yo6lb90pdif.R.inc(91590);
    __CLR4_4_11yo61yo6lb90pdif.R.inc(91592);a = 1.2;
    __CLR4_4_11yo61yo6lb90pdif.R.inc(91593);double[] y0 = { FastMath.sin(a), FastMath.cos(a) };
    __CLR4_4_11yo61yo6lb90pdif.R.inc(91594);setInitialConditions(0.0, y0);
    __CLR4_4_11yo61yo6lb90pdif.R.inc(91595);setFinalConditions(15);
    __CLR4_4_11yo61yo6lb90pdif.R.inc(91596);double[] errorScale = { 1.0, 0.0 };
    __CLR4_4_11yo61yo6lb90pdif.R.inc(91597);setErrorScale(errorScale);
    __CLR4_4_11yo61yo6lb90pdif.R.inc(91598);y = new double[y0.length];
  }finally{__CLR4_4_11yo61yo6lb90pdif.R.flushNeeded();}}

  /**
   * Copy constructor.
   * @param problem problem to copy
   */
  public TestProblem4(TestProblem4 problem) {
    super(problem);__CLR4_4_11yo61yo6lb90pdif.R.inc(91600);try{__CLR4_4_11yo61yo6lb90pdif.R.inc(91599);
    __CLR4_4_11yo61yo6lb90pdif.R.inc(91601);a = problem.a;
    __CLR4_4_11yo61yo6lb90pdif.R.inc(91602);y = problem.y.clone();
  }finally{__CLR4_4_11yo61yo6lb90pdif.R.flushNeeded();}}

  /** {@inheritDoc} */
  @Override
public TestProblem4 copy() {try{__CLR4_4_11yo61yo6lb90pdif.R.inc(91603);
    __CLR4_4_11yo61yo6lb90pdif.R.inc(91604);return new TestProblem4(this);
  }finally{__CLR4_4_11yo61yo6lb90pdif.R.flushNeeded();}}

  @Override
  public EventHandler[] getEventsHandlers() {try{__CLR4_4_11yo61yo6lb90pdif.R.inc(91605);
    __CLR4_4_11yo61yo6lb90pdif.R.inc(91606);return new EventHandler[] { new Bounce(), new Stop() };
  }finally{__CLR4_4_11yo61yo6lb90pdif.R.flushNeeded();}}

  /**
   * Get the theoretical events times.
   * @return theoretical events times
   */
  @Override
  public double[] getTheoreticalEventsTimes() {try{__CLR4_4_11yo61yo6lb90pdif.R.inc(91607);
      __CLR4_4_11yo61yo6lb90pdif.R.inc(91608);return new double[] {
          1 * FastMath.PI - a,
          2 * FastMath.PI - a,
          3 * FastMath.PI - a,
          4 * FastMath.PI - a,
          12.0
      };
  }finally{__CLR4_4_11yo61yo6lb90pdif.R.flushNeeded();}}

  @Override
  public void doComputeDerivatives(double t, double[] y, double[] yDot) {try{__CLR4_4_11yo61yo6lb90pdif.R.inc(91609);
    __CLR4_4_11yo61yo6lb90pdif.R.inc(91610);yDot[0] =  y[1];
    __CLR4_4_11yo61yo6lb90pdif.R.inc(91611);yDot[1] = -y[0];
  }finally{__CLR4_4_11yo61yo6lb90pdif.R.flushNeeded();}}

  @Override
  public double[] computeTheoreticalState(double t) {try{__CLR4_4_11yo61yo6lb90pdif.R.inc(91612);
    __CLR4_4_11yo61yo6lb90pdif.R.inc(91613);double sin = FastMath.sin(t + a);
    __CLR4_4_11yo61yo6lb90pdif.R.inc(91614);double cos = FastMath.cos(t + a);
    __CLR4_4_11yo61yo6lb90pdif.R.inc(91615);y[0] = FastMath.abs(sin);
    __CLR4_4_11yo61yo6lb90pdif.R.inc(91616);y[1] = ((((sin >= 0) )&&(__CLR4_4_11yo61yo6lb90pdif.R.iget(91617)!=0|true))||(__CLR4_4_11yo61yo6lb90pdif.R.iget(91618)==0&false))? cos : -cos;
    __CLR4_4_11yo61yo6lb90pdif.R.inc(91619);return y;
  }finally{__CLR4_4_11yo61yo6lb90pdif.R.flushNeeded();}}

  private static class Bounce implements EventHandler {

    private int sign;

    public Bounce() {try{__CLR4_4_11yo61yo6lb90pdif.R.inc(91620);
      __CLR4_4_11yo61yo6lb90pdif.R.inc(91621);sign = +1;
    }finally{__CLR4_4_11yo61yo6lb90pdif.R.flushNeeded();}}

    public void init(double t0, double[] y0, double t) {try{__CLR4_4_11yo61yo6lb90pdif.R.inc(91622);
    }finally{__CLR4_4_11yo61yo6lb90pdif.R.flushNeeded();}}

    public double g(double t, double[] y) {try{__CLR4_4_11yo61yo6lb90pdif.R.inc(91623);
      __CLR4_4_11yo61yo6lb90pdif.R.inc(91624);return sign * y[0];
    }finally{__CLR4_4_11yo61yo6lb90pdif.R.flushNeeded();}}

    public Action eventOccurred(double t, double[] y, boolean increasing) {try{__CLR4_4_11yo61yo6lb90pdif.R.inc(91625);
      // this sign change is needed because the state will be reset soon
      __CLR4_4_11yo61yo6lb90pdif.R.inc(91626);sign = -sign;
      __CLR4_4_11yo61yo6lb90pdif.R.inc(91627);return Action.RESET_STATE;
    }finally{__CLR4_4_11yo61yo6lb90pdif.R.flushNeeded();}}

    public void resetState(double t, double[] y) {try{__CLR4_4_11yo61yo6lb90pdif.R.inc(91628);
      __CLR4_4_11yo61yo6lb90pdif.R.inc(91629);y[0] = -y[0];
      __CLR4_4_11yo61yo6lb90pdif.R.inc(91630);y[1] = -y[1];
    }finally{__CLR4_4_11yo61yo6lb90pdif.R.flushNeeded();}}

  }

  private static class Stop implements EventHandler {

    public Stop() {try{__CLR4_4_11yo61yo6lb90pdif.R.inc(91631);
    }finally{__CLR4_4_11yo61yo6lb90pdif.R.flushNeeded();}}

    public void init(double t0, double[] y0, double t) {try{__CLR4_4_11yo61yo6lb90pdif.R.inc(91632);
    }finally{__CLR4_4_11yo61yo6lb90pdif.R.flushNeeded();}}

    public double g(double t, double[] y) {try{__CLR4_4_11yo61yo6lb90pdif.R.inc(91633);
      __CLR4_4_11yo61yo6lb90pdif.R.inc(91634);return t - 12.0;
    }finally{__CLR4_4_11yo61yo6lb90pdif.R.flushNeeded();}}

    public Action eventOccurred(double t, double[] y, boolean increasing) {try{__CLR4_4_11yo61yo6lb90pdif.R.inc(91635);
      __CLR4_4_11yo61yo6lb90pdif.R.inc(91636);return Action.STOP;
    }finally{__CLR4_4_11yo61yo6lb90pdif.R.flushNeeded();}}

    public void resetState(double t, double[] y) {try{__CLR4_4_11yo61yo6lb90pdif.R.inc(91637);
    }finally{__CLR4_4_11yo61yo6lb90pdif.R.flushNeeded();}}

  }

}
