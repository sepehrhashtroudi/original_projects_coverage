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

import java.util.ArrayList;
import java.util.Collection;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MaxCountExceededException;

/** Wrapper class enabling {@link FirstOrderDifferentialEquations basic simple}
 *  ODE instances to be used when processing {@link JacobianMatrices}.
 *
 * @version $Id$
 * @since 3.0
 */
class ParameterizedWrapper implements ParameterizedODE {public static class __CLR4_4_1p66p66lb90p9bo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,32639,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Basic FODE without parameter. */
    private final FirstOrderDifferentialEquations fode;

    /** Simple constructor.
     * @param ode original first order differential equations
     */
    public ParameterizedWrapper(final FirstOrderDifferentialEquations ode) {try{__CLR4_4_1p66p66lb90p9bo.R.inc(32622);
        __CLR4_4_1p66p66lb90p9bo.R.inc(32623);this.fode = ode;
    }finally{__CLR4_4_1p66p66lb90p9bo.R.flushNeeded();}}

    /** Get the dimension of the underlying FODE.
     * @return dimension of the underlying FODE
     */
    public int getDimension() {try{__CLR4_4_1p66p66lb90p9bo.R.inc(32624);
        __CLR4_4_1p66p66lb90p9bo.R.inc(32625);return fode.getDimension();
    }finally{__CLR4_4_1p66p66lb90p9bo.R.flushNeeded();}}

    /** Get the current time derivative of the state vector of the underlying FODE.
     * @param t current value of the independent <I>time</I> variable
     * @param y array containing the current value of the state vector
     * @param yDot placeholder array where to put the time derivative of the state vector
     * @exception MaxCountExceededException if the number of functions evaluations is exceeded
     * @exception DimensionMismatchException if arrays dimensions do not match equations settings
     */
    public void computeDerivatives(double t, double[] y, double[] yDot)
        throws MaxCountExceededException, DimensionMismatchException {try{__CLR4_4_1p66p66lb90p9bo.R.inc(32626);
        __CLR4_4_1p66p66lb90p9bo.R.inc(32627);fode.computeDerivatives(t, y, yDot);
    }finally{__CLR4_4_1p66p66lb90p9bo.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Collection<String> getParametersNames() {try{__CLR4_4_1p66p66lb90p9bo.R.inc(32628);
        __CLR4_4_1p66p66lb90p9bo.R.inc(32629);return new ArrayList<String>();
    }finally{__CLR4_4_1p66p66lb90p9bo.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isSupported(String name) {try{__CLR4_4_1p66p66lb90p9bo.R.inc(32630);
        __CLR4_4_1p66p66lb90p9bo.R.inc(32631);return false;
    }finally{__CLR4_4_1p66p66lb90p9bo.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double getParameter(String name)
        throws UnknownParameterException {try{__CLR4_4_1p66p66lb90p9bo.R.inc(32632);
        __CLR4_4_1p66p66lb90p9bo.R.inc(32633);if ((((!isSupported(name))&&(__CLR4_4_1p66p66lb90p9bo.R.iget(32634)!=0|true))||(__CLR4_4_1p66p66lb90p9bo.R.iget(32635)==0&false))) {{
            __CLR4_4_1p66p66lb90p9bo.R.inc(32636);throw new UnknownParameterException(name);
        }
        }__CLR4_4_1p66p66lb90p9bo.R.inc(32637);return Double.NaN;
    }finally{__CLR4_4_1p66p66lb90p9bo.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void setParameter(String name, double value) {try{__CLR4_4_1p66p66lb90p9bo.R.inc(32638);
    }finally{__CLR4_4_1p66p66lb90p9bo.R.flushNeeded();}}

}
