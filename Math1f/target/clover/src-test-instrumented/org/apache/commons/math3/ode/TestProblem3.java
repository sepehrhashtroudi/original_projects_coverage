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

import org.apache.commons.math3.util.FastMath;

/**
 * This class is used in the junit tests for the ODE integrators.

 * <p>This specific problem is the following differential equation :
 * <pre>
 *    y1'' = -y1/r^3  y1 (0) = 1-e  y1' (0) = 0
 *    y2'' = -y2/r^3  y2 (0) = 0    y2' (0) =sqrt((1+e)/(1-e))
 *    r = sqrt (y1^2 + y2^2), e = 0.9
 * </pre>
 * This is a two-body problem in the plane which can be solved by
 * Kepler's equation
 * <pre>
 *   y1 (t) = ...
 * </pre>
 * </p>

 */
public class TestProblem3
  extends TestProblemAbstract {static class __CLR4_4_11ymx1ymxlb90pdic{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,91590,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  /** Eccentricity */
  double e;

  /** theoretical state */
  private double[] y;

  /**
   * Simple constructor.
   * @param e eccentricity
   */
  public TestProblem3(double e) {
    super();__CLR4_4_11ymx1ymxlb90pdic.R.inc(91546);try{__CLR4_4_11ymx1ymxlb90pdic.R.inc(91545);
    __CLR4_4_11ymx1ymxlb90pdic.R.inc(91547);this.e = e;
    __CLR4_4_11ymx1ymxlb90pdic.R.inc(91548);double[] y0 = { 1 - e, 0, 0, FastMath.sqrt((1+e)/(1-e)) };
    __CLR4_4_11ymx1ymxlb90pdic.R.inc(91549);setInitialConditions(0.0, y0);
    __CLR4_4_11ymx1ymxlb90pdic.R.inc(91550);setFinalConditions(20.0);
    __CLR4_4_11ymx1ymxlb90pdic.R.inc(91551);double[] errorScale = { 1.0, 1.0, 1.0, 1.0 };
    __CLR4_4_11ymx1ymxlb90pdic.R.inc(91552);setErrorScale(errorScale);
    __CLR4_4_11ymx1ymxlb90pdic.R.inc(91553);y = new double[y0.length];
  }finally{__CLR4_4_11ymx1ymxlb90pdic.R.flushNeeded();}}

  /**
   * Simple constructor.
   */
  public TestProblem3() {
    this(0.1);__CLR4_4_11ymx1ymxlb90pdic.R.inc(91555);try{__CLR4_4_11ymx1ymxlb90pdic.R.inc(91554);
  }finally{__CLR4_4_11ymx1ymxlb90pdic.R.flushNeeded();}}

  /**
   * Copy constructor.
   * @param problem problem to copy
   */
  public TestProblem3(TestProblem3 problem) {
    super(problem);__CLR4_4_11ymx1ymxlb90pdic.R.inc(91557);try{__CLR4_4_11ymx1ymxlb90pdic.R.inc(91556);
    __CLR4_4_11ymx1ymxlb90pdic.R.inc(91558);e = problem.e;
    __CLR4_4_11ymx1ymxlb90pdic.R.inc(91559);y = problem.y.clone();
  }finally{__CLR4_4_11ymx1ymxlb90pdic.R.flushNeeded();}}

  /** {@inheritDoc} */
  @Override
public TestProblem3 copy() {try{__CLR4_4_11ymx1ymxlb90pdic.R.inc(91560);
    __CLR4_4_11ymx1ymxlb90pdic.R.inc(91561);return new TestProblem3(this);
  }finally{__CLR4_4_11ymx1ymxlb90pdic.R.flushNeeded();}}

  @Override
  public void doComputeDerivatives(double t, double[] y, double[] yDot) {try{__CLR4_4_11ymx1ymxlb90pdic.R.inc(91562);

    // current radius
    __CLR4_4_11ymx1ymxlb90pdic.R.inc(91563);double r2 = y[0] * y[0] + y[1] * y[1];
    __CLR4_4_11ymx1ymxlb90pdic.R.inc(91564);double invR3 = 1 / (r2 * FastMath.sqrt(r2));

    // compute the derivatives
    __CLR4_4_11ymx1ymxlb90pdic.R.inc(91565);yDot[0] = y[2];
    __CLR4_4_11ymx1ymxlb90pdic.R.inc(91566);yDot[1] = y[3];
    __CLR4_4_11ymx1ymxlb90pdic.R.inc(91567);yDot[2] = -invR3  * y[0];
    __CLR4_4_11ymx1ymxlb90pdic.R.inc(91568);yDot[3] = -invR3  * y[1];

  }finally{__CLR4_4_11ymx1ymxlb90pdic.R.flushNeeded();}}

  @Override
  public double[] computeTheoreticalState(double t) {try{__CLR4_4_11ymx1ymxlb90pdic.R.inc(91569);

    // solve Kepler's equation
    __CLR4_4_11ymx1ymxlb90pdic.R.inc(91570);double E = t;
    __CLR4_4_11ymx1ymxlb90pdic.R.inc(91571);double d = 0;
    __CLR4_4_11ymx1ymxlb90pdic.R.inc(91572);double corr = 999.0;
    __CLR4_4_11ymx1ymxlb90pdic.R.inc(91573);for (int i = 0; ((((i < 50) && (FastMath.abs(corr) > 1.0e-12))&&(__CLR4_4_11ymx1ymxlb90pdic.R.iget(91574)!=0|true))||(__CLR4_4_11ymx1ymxlb90pdic.R.iget(91575)==0&false)); ++i) {{
      __CLR4_4_11ymx1ymxlb90pdic.R.inc(91576);double f2  = e * FastMath.sin(E);
      __CLR4_4_11ymx1ymxlb90pdic.R.inc(91577);double f0  = d - f2;
      __CLR4_4_11ymx1ymxlb90pdic.R.inc(91578);double f1  = 1 - e * FastMath.cos(E);
      __CLR4_4_11ymx1ymxlb90pdic.R.inc(91579);double f12 = f1 + f1;
      __CLR4_4_11ymx1ymxlb90pdic.R.inc(91580);corr  = f0 * f12 / (f1 * f12 - f0 * f2);
      __CLR4_4_11ymx1ymxlb90pdic.R.inc(91581);d -= corr;
      __CLR4_4_11ymx1ymxlb90pdic.R.inc(91582);E = t + d;
    }

    }__CLR4_4_11ymx1ymxlb90pdic.R.inc(91583);double cosE = FastMath.cos(E);
    __CLR4_4_11ymx1ymxlb90pdic.R.inc(91584);double sinE = FastMath.sin(E);

    __CLR4_4_11ymx1ymxlb90pdic.R.inc(91585);y[0] = cosE - e;
    __CLR4_4_11ymx1ymxlb90pdic.R.inc(91586);y[1] = FastMath.sqrt(1 - e * e) * sinE;
    __CLR4_4_11ymx1ymxlb90pdic.R.inc(91587);y[2] = -sinE / (1 - e * cosE);
    __CLR4_4_11ymx1ymxlb90pdic.R.inc(91588);y[3] = FastMath.sqrt(1 - e * e) * cosE / (1 - e * cosE);

    __CLR4_4_11ymx1ymxlb90pdic.R.inc(91589);return y;
  }finally{__CLR4_4_11ymx1ymxlb90pdic.R.flushNeeded();}}

}
