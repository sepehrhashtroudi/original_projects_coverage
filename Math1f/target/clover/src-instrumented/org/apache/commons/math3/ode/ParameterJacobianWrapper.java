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

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MaxCountExceededException;

/** Wrapper class to compute Jacobian matrices by finite differences for ODE
 *  which do not compute them by themselves.
 *
 * @version $Id$
 * @since 3.0
 */
class ParameterJacobianWrapper implements ParameterJacobianProvider {public static class __CLR4_4_1p5cp5clb90p9bj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,32622,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Main ODE set. */
    private final FirstOrderDifferentialEquations fode;

    /** Raw ODE without Jacobian computation skill to be wrapped into a ParameterJacobianProvider. */
    private final ParameterizedODE pode;

    /** Steps for finite difference computation of the Jacobian df/dp w.r.t. parameters. */
    private final Map<String, Double> hParam;

    /** Wrap a {@link ParameterizedODE} into a {@link ParameterJacobianProvider}.
     * @param fode main first order differential equations set
     * @param pode secondary problem, without parameter Jacobian computation skill
     * @param paramsAndSteps parameters and steps to compute the Jacobians df/dp
     * @see JacobianMatrices#setParameterStep(String, double)
     */
    public ParameterJacobianWrapper(final FirstOrderDifferentialEquations fode,
                                    final ParameterizedODE pode,
                                    final ParameterConfiguration[] paramsAndSteps) {try{__CLR4_4_1p5cp5clb90p9bj.R.inc(32592);
        __CLR4_4_1p5cp5clb90p9bj.R.inc(32593);this.fode = fode;
        __CLR4_4_1p5cp5clb90p9bj.R.inc(32594);this.pode = pode;
        __CLR4_4_1p5cp5clb90p9bj.R.inc(32595);this.hParam = new HashMap<String, Double>();

        // set up parameters for jacobian computation
        __CLR4_4_1p5cp5clb90p9bj.R.inc(32596);for (final ParameterConfiguration param : paramsAndSteps) {{
            __CLR4_4_1p5cp5clb90p9bj.R.inc(32597);final String name = param.getParameterName();
            __CLR4_4_1p5cp5clb90p9bj.R.inc(32598);if ((((pode.isSupported(name))&&(__CLR4_4_1p5cp5clb90p9bj.R.iget(32599)!=0|true))||(__CLR4_4_1p5cp5clb90p9bj.R.iget(32600)==0&false))) {{
                __CLR4_4_1p5cp5clb90p9bj.R.inc(32601);hParam.put(name, param.getHP());
            }
        }}
    }}finally{__CLR4_4_1p5cp5clb90p9bj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Collection<String> getParametersNames() {try{__CLR4_4_1p5cp5clb90p9bj.R.inc(32602);
        __CLR4_4_1p5cp5clb90p9bj.R.inc(32603);return pode.getParametersNames();
    }finally{__CLR4_4_1p5cp5clb90p9bj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isSupported(String name) {try{__CLR4_4_1p5cp5clb90p9bj.R.inc(32604);
        __CLR4_4_1p5cp5clb90p9bj.R.inc(32605);return pode.isSupported(name);
    }finally{__CLR4_4_1p5cp5clb90p9bj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void computeParameterJacobian(double t, double[] y, double[] yDot,
                                         String paramName, double[] dFdP)
        throws DimensionMismatchException, MaxCountExceededException {try{__CLR4_4_1p5cp5clb90p9bj.R.inc(32606);

        __CLR4_4_1p5cp5clb90p9bj.R.inc(32607);final int n = fode.getDimension();
        __CLR4_4_1p5cp5clb90p9bj.R.inc(32608);if ((((pode.isSupported(paramName))&&(__CLR4_4_1p5cp5clb90p9bj.R.iget(32609)!=0|true))||(__CLR4_4_1p5cp5clb90p9bj.R.iget(32610)==0&false))) {{
            __CLR4_4_1p5cp5clb90p9bj.R.inc(32611);final double[] tmpDot = new double[n];

            // compute the jacobian df/dp w.r.t. parameter
            __CLR4_4_1p5cp5clb90p9bj.R.inc(32612);final double p  = pode.getParameter(paramName);
            __CLR4_4_1p5cp5clb90p9bj.R.inc(32613);final double hP = hParam.get(paramName);
            __CLR4_4_1p5cp5clb90p9bj.R.inc(32614);pode.setParameter(paramName, p + hP);
            __CLR4_4_1p5cp5clb90p9bj.R.inc(32615);fode.computeDerivatives(t, y, tmpDot);
            __CLR4_4_1p5cp5clb90p9bj.R.inc(32616);for (int i = 0; (((i < n)&&(__CLR4_4_1p5cp5clb90p9bj.R.iget(32617)!=0|true))||(__CLR4_4_1p5cp5clb90p9bj.R.iget(32618)==0&false)); ++i) {{
                __CLR4_4_1p5cp5clb90p9bj.R.inc(32619);dFdP[i] = (tmpDot[i] - yDot[i]) / hP;
            }
            }__CLR4_4_1p5cp5clb90p9bj.R.inc(32620);pode.setParameter(paramName, p);
        } }else {{
            __CLR4_4_1p5cp5clb90p9bj.R.inc(32621);Arrays.fill(dFdP, 0, n, 0.0);
        }

    }}finally{__CLR4_4_1p5cp5clb90p9bj.R.flushNeeded();}}

}
