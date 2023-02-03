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
package org.apache.commons.math3.analysis.differentiation;

import org.apache.commons.math3.analysis.MultivariateMatrixFunction;

/** Class representing the Jacobian of a multivariate vector function.
 * <p>
 * The rows iterate on the model functions while the columns iterate on the parameters; thus,
 * the numbers of rows is equal to the dimension of the underlying function vector
 * value and the number of columns is equal to the number of free parameters of
 * the underlying function.
 * </p>
 * @version $Id$
 * @since 3.1
 */
public class JacobianFunction implements MultivariateMatrixFunction {public static class __CLR4_4_11dc1dclb90p6fv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,1797,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Underlying vector-valued function. */
    private final MultivariateDifferentiableVectorFunction f;

    /** Simple constructor.
     * @param f underlying vector-valued function
     */
    public JacobianFunction(final MultivariateDifferentiableVectorFunction f) {try{__CLR4_4_11dc1dclb90p6fv.R.inc(1776);
        __CLR4_4_11dc1dclb90p6fv.R.inc(1777);this.f = f;
    }finally{__CLR4_4_11dc1dclb90p6fv.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double[][] value(double[] point) {try{__CLR4_4_11dc1dclb90p6fv.R.inc(1778);

        // set up parameters
        __CLR4_4_11dc1dclb90p6fv.R.inc(1779);final DerivativeStructure[] dsX = new DerivativeStructure[point.length];
        __CLR4_4_11dc1dclb90p6fv.R.inc(1780);for (int i = 0; (((i < point.length)&&(__CLR4_4_11dc1dclb90p6fv.R.iget(1781)!=0|true))||(__CLR4_4_11dc1dclb90p6fv.R.iget(1782)==0&false)); ++i) {{
            __CLR4_4_11dc1dclb90p6fv.R.inc(1783);dsX[i] = new DerivativeStructure(point.length, 1, i, point[i]);
        }

        // compute the derivatives
        }__CLR4_4_11dc1dclb90p6fv.R.inc(1784);final DerivativeStructure[] dsY = f.value(dsX);

        // extract the Jacobian
        __CLR4_4_11dc1dclb90p6fv.R.inc(1785);final double[][] y = new double[dsY.length][point.length];
        __CLR4_4_11dc1dclb90p6fv.R.inc(1786);final int[] orders = new int[point.length];
        __CLR4_4_11dc1dclb90p6fv.R.inc(1787);for (int i = 0; (((i < dsY.length)&&(__CLR4_4_11dc1dclb90p6fv.R.iget(1788)!=0|true))||(__CLR4_4_11dc1dclb90p6fv.R.iget(1789)==0&false)); ++i) {{
            __CLR4_4_11dc1dclb90p6fv.R.inc(1790);for (int j = 0; (((j < point.length)&&(__CLR4_4_11dc1dclb90p6fv.R.iget(1791)!=0|true))||(__CLR4_4_11dc1dclb90p6fv.R.iget(1792)==0&false)); ++j) {{
                __CLR4_4_11dc1dclb90p6fv.R.inc(1793);orders[j] = 1;
                __CLR4_4_11dc1dclb90p6fv.R.inc(1794);y[i][j] = dsY[i].getPartialDerivative(orders);
                __CLR4_4_11dc1dclb90p6fv.R.inc(1795);orders[j] = 0;
            }
        }}

        }__CLR4_4_11dc1dclb90p6fv.R.inc(1796);return y;

    }finally{__CLR4_4_11dc1dclb90p6fv.R.flushNeeded();}}

}
