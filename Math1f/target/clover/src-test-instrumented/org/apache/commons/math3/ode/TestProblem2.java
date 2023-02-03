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
 *    y' = t^3 - t y
 * </pre>
 * with the initial condition y (0) = 0. The solution of this equation
 * is the following function :
 * <pre>
 *   y (t) = t^2 + 2 (exp (- t^2 / 2) - 1)
 * </pre>
 * </p>

 */
public class TestProblem2
  extends TestProblemAbstract {static class __CLR4_4_11ym71ym7lb90pdi8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,91545,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  /** theoretical state */
  private double[] y;

  /**
   * Simple constructor.
   */
  public TestProblem2() {
    super();__CLR4_4_11ym71ym7lb90pdi8.R.inc(91520);try{__CLR4_4_11ym71ym7lb90pdi8.R.inc(91519);
    __CLR4_4_11ym71ym7lb90pdi8.R.inc(91521);double[] y0 = { 0.0 };
    __CLR4_4_11ym71ym7lb90pdi8.R.inc(91522);setInitialConditions(0.0, y0);
    __CLR4_4_11ym71ym7lb90pdi8.R.inc(91523);setFinalConditions(1.0);
    __CLR4_4_11ym71ym7lb90pdi8.R.inc(91524);double[] errorScale = { 1.0 };
    __CLR4_4_11ym71ym7lb90pdi8.R.inc(91525);setErrorScale(errorScale);
    __CLR4_4_11ym71ym7lb90pdi8.R.inc(91526);y = new double[y0.length];
  }finally{__CLR4_4_11ym71ym7lb90pdi8.R.flushNeeded();}}

  /**
   * Copy constructor.
   * @param problem problem to copy
   */
  public TestProblem2(TestProblem2 problem) {
    super(problem);__CLR4_4_11ym71ym7lb90pdi8.R.inc(91528);try{__CLR4_4_11ym71ym7lb90pdi8.R.inc(91527);
    __CLR4_4_11ym71ym7lb90pdi8.R.inc(91529);y = problem.y.clone();
  }finally{__CLR4_4_11ym71ym7lb90pdi8.R.flushNeeded();}}

  /** {@inheritDoc} */
  @Override
public TestProblem2 copy() {try{__CLR4_4_11ym71ym7lb90pdi8.R.inc(91530);
    __CLR4_4_11ym71ym7lb90pdi8.R.inc(91531);return new TestProblem2(this);
  }finally{__CLR4_4_11ym71ym7lb90pdi8.R.flushNeeded();}}

  @Override
  public void doComputeDerivatives(double t, double[] y, double[] yDot) {try{__CLR4_4_11ym71ym7lb90pdi8.R.inc(91532);

    // compute the derivatives
    __CLR4_4_11ym71ym7lb90pdi8.R.inc(91533);for (int i = 0; (((i < n)&&(__CLR4_4_11ym71ym7lb90pdi8.R.iget(91534)!=0|true))||(__CLR4_4_11ym71ym7lb90pdi8.R.iget(91535)==0&false)); ++i)
      {__CLR4_4_11ym71ym7lb90pdi8.R.inc(91536);yDot[i] = t * (t * t - y[i]);

  }}finally{__CLR4_4_11ym71ym7lb90pdi8.R.flushNeeded();}}

  @Override
  public double[] computeTheoreticalState(double t) {try{__CLR4_4_11ym71ym7lb90pdi8.R.inc(91537);
    __CLR4_4_11ym71ym7lb90pdi8.R.inc(91538);double t2 = t * t;
    __CLR4_4_11ym71ym7lb90pdi8.R.inc(91539);double c = t2 + 2 * (FastMath.exp (-0.5 * t2) - 1);
    __CLR4_4_11ym71ym7lb90pdi8.R.inc(91540);for (int i = 0; (((i < n)&&(__CLR4_4_11ym71ym7lb90pdi8.R.iget(91541)!=0|true))||(__CLR4_4_11ym71ym7lb90pdi8.R.iget(91542)==0&false)); ++i) {{
      __CLR4_4_11ym71ym7lb90pdi8.R.inc(91543);y[i] = c;
    }
    }__CLR4_4_11ym71ym7lb90pdi8.R.inc(91544);return y;
  }finally{__CLR4_4_11ym71ym7lb90pdi8.R.flushNeeded();}}

}
