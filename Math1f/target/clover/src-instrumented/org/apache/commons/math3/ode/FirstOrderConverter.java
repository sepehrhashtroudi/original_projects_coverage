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


/** This class converts second order differential equations to first
 * order ones.
 *
 * <p>This class is a wrapper around a {@link
 * SecondOrderDifferentialEquations} which allow to use a {@link
 * FirstOrderIntegrator} to integrate it.</p>
 *
 * <p>The transformation is done by changing the n dimension state
 * vector to a 2n dimension vector, where the first n components are
 * the initial state variables and the n last components are their
 * first time derivative. The first time derivative of this state
 * vector then really contains both the first and second time
 * derivative of the initial state vector, which can be handled by the
 * underlying second order equations set.</p>
 *
 * <p>One should be aware that the data is duplicated during the
 * transformation process and that for each call to {@link
 * #computeDerivatives computeDerivatives}, this wrapper does copy 4n
 * scalars : 2n before the call to {@link
 * SecondOrderDifferentialEquations#computeSecondDerivatives
 * computeSecondDerivatives} in order to dispatch the y state vector
 * into z and zDot, and 2n after the call to gather zDot and zDDot
 * into yDot. Since the underlying problem by itself perhaps also
 * needs to copy data and dispatch the arrays into domain objects,
 * this has an impact on both memory and CPU usage. The only way to
 * avoid this duplication is to perform the transformation at the
 * problem level, i.e. to implement the problem as a first order one
 * and then avoid using this class.</p>
 *
 * @see FirstOrderIntegrator
 * @see FirstOrderDifferentialEquations
 * @see SecondOrderDifferentialEquations
 * @version $Id$
 * @since 1.2
 */

public class FirstOrderConverter implements FirstOrderDifferentialEquations {public static class __CLR4_4_1owlowllb90p9a9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,32291,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Underlying second order equations set. */
    private final SecondOrderDifferentialEquations equations;

    /** second order problem dimension. */
    private final int dimension;

    /** state vector. */
    private final double[] z;

    /** first time derivative of the state vector. */
    private final double[] zDot;

    /** second time derivative of the state vector. */
    private final double[] zDDot;

  /** Simple constructor.
   * Build a converter around a second order equations set.
   * @param equations second order equations set to convert
   */
  public FirstOrderConverter (final SecondOrderDifferentialEquations equations) {try{__CLR4_4_1owlowllb90p9a9.R.inc(32277);
      __CLR4_4_1owlowllb90p9a9.R.inc(32278);this.equations = equations;
      __CLR4_4_1owlowllb90p9a9.R.inc(32279);dimension      = equations.getDimension();
      __CLR4_4_1owlowllb90p9a9.R.inc(32280);z              = new double[dimension];
      __CLR4_4_1owlowllb90p9a9.R.inc(32281);zDot           = new double[dimension];
      __CLR4_4_1owlowllb90p9a9.R.inc(32282);zDDot          = new double[dimension];
  }finally{__CLR4_4_1owlowllb90p9a9.R.flushNeeded();}}

  /** Get the dimension of the problem.
   * <p>The dimension of the first order problem is twice the
   * dimension of the underlying second order problem.</p>
   * @return dimension of the problem
   */
  public int getDimension() {try{__CLR4_4_1owlowllb90p9a9.R.inc(32283);
    __CLR4_4_1owlowllb90p9a9.R.inc(32284);return 2 * dimension;
  }finally{__CLR4_4_1owlowllb90p9a9.R.flushNeeded();}}

  /** Get the current time derivative of the state vector.
   * @param t current value of the independent <I>time</I> variable
   * @param y array containing the current value of the state vector
   * @param yDot placeholder array where to put the time derivative of the state vector
   */
  public void computeDerivatives(final double t, final double[] y, final double[] yDot) {try{__CLR4_4_1owlowllb90p9a9.R.inc(32285);

    // split the state vector in two
    __CLR4_4_1owlowllb90p9a9.R.inc(32286);System.arraycopy(y, 0,         z,    0, dimension);
    __CLR4_4_1owlowllb90p9a9.R.inc(32287);System.arraycopy(y, dimension, zDot, 0, dimension);

    // apply the underlying equations set
    __CLR4_4_1owlowllb90p9a9.R.inc(32288);equations.computeSecondDerivatives(t, z, zDot, zDDot);

    // build the result state derivative
    __CLR4_4_1owlowllb90p9a9.R.inc(32289);System.arraycopy(zDot,  0, yDot, 0,         dimension);
    __CLR4_4_1owlowllb90p9a9.R.inc(32290);System.arraycopy(zDDot, 0, yDot, dimension, dimension);

  }finally{__CLR4_4_1owlowllb90p9a9.R.flushNeeded();}}

}
