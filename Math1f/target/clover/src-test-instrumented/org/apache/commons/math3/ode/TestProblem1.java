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
 *    y' = -y
 * </pre>
 * the solution of this equation is a simple exponential function :
 * <pre>
 *   y (t) = y (t0) exp (t0-t)
 * </pre>
 * </p>

 */
public class TestProblem1
  extends TestProblemAbstract {static class __CLR4_4_11yli1ylilb90pdi6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,91519,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  /** theoretical state */
  private double[] y;

  /**
   * Simple constructor.
   */
  public TestProblem1() {
    super();__CLR4_4_11yli1ylilb90pdi6.R.inc(91495);try{__CLR4_4_11yli1ylilb90pdi6.R.inc(91494);
    __CLR4_4_11yli1ylilb90pdi6.R.inc(91496);double[] y0 = { 1.0, 0.1 };
    __CLR4_4_11yli1ylilb90pdi6.R.inc(91497);setInitialConditions(0.0, y0);
    __CLR4_4_11yli1ylilb90pdi6.R.inc(91498);setFinalConditions(4.0);
    __CLR4_4_11yli1ylilb90pdi6.R.inc(91499);double[] errorScale = { 1.0, 1.0 };
    __CLR4_4_11yli1ylilb90pdi6.R.inc(91500);setErrorScale(errorScale);
    __CLR4_4_11yli1ylilb90pdi6.R.inc(91501);y = new double[y0.length];
  }finally{__CLR4_4_11yli1ylilb90pdi6.R.flushNeeded();}}

  /**
   * Copy constructor.
   * @param problem problem to copy
   */
  public TestProblem1(TestProblem1 problem) {
    super(problem);__CLR4_4_11yli1ylilb90pdi6.R.inc(91503);try{__CLR4_4_11yli1ylilb90pdi6.R.inc(91502);
    __CLR4_4_11yli1ylilb90pdi6.R.inc(91504);y = problem.y.clone();
  }finally{__CLR4_4_11yli1ylilb90pdi6.R.flushNeeded();}}

  /** {@inheritDoc} */
  @Override
public TestProblem1 copy() {try{__CLR4_4_11yli1ylilb90pdi6.R.inc(91505);
    __CLR4_4_11yli1ylilb90pdi6.R.inc(91506);return new TestProblem1(this);
  }finally{__CLR4_4_11yli1ylilb90pdi6.R.flushNeeded();}}

  @Override
  public void doComputeDerivatives(double t, double[] y, double[] yDot) {try{__CLR4_4_11yli1ylilb90pdi6.R.inc(91507);

    // compute the derivatives
    __CLR4_4_11yli1ylilb90pdi6.R.inc(91508);for (int i = 0; (((i < n)&&(__CLR4_4_11yli1ylilb90pdi6.R.iget(91509)!=0|true))||(__CLR4_4_11yli1ylilb90pdi6.R.iget(91510)==0&false)); ++i)
      {__CLR4_4_11yli1ylilb90pdi6.R.inc(91511);yDot[i] = -y[i];

  }}finally{__CLR4_4_11yli1ylilb90pdi6.R.flushNeeded();}}

  @Override
  public double[] computeTheoreticalState(double t) {try{__CLR4_4_11yli1ylilb90pdi6.R.inc(91512);
    __CLR4_4_11yli1ylilb90pdi6.R.inc(91513);double c = FastMath.exp (t0 - t);
    __CLR4_4_11yli1ylilb90pdi6.R.inc(91514);for (int i = 0; (((i < n)&&(__CLR4_4_11yli1ylilb90pdi6.R.iget(91515)!=0|true))||(__CLR4_4_11yli1ylilb90pdi6.R.iget(91516)==0&false)); ++i) {{
      __CLR4_4_11yli1ylilb90pdi6.R.inc(91517);y[i] = c * y0[i];
    }
    }__CLR4_4_11yli1ylilb90pdi6.R.inc(91518);return y;
  }finally{__CLR4_4_11yli1ylilb90pdi6.R.flushNeeded();}}

}
