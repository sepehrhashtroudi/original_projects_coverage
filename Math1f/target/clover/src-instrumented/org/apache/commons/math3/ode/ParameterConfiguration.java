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

import java.io.Serializable;

/** Simple container pairing a parameter name with a step in order to compute
 *  the associated Jacobian matrix by finite difference.
 *
 * @version $Id$
 * @since 3.0
 */
class ParameterConfiguration implements Serializable {public static class __CLR4_4_1p53p53lb90p9bf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,32592,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable UID. */
    private static final long serialVersionUID = 2247518849090889379L;

    /** Parameter name. */
    private String parameterName;

    /** Parameter step for finite difference computation. */
    private double hP;

    /** Parameter name and step pair constructor.
     * @param parameterName parameter name
     * @param hP parameter step
     */
    public ParameterConfiguration(final String parameterName, final double hP) {try{__CLR4_4_1p53p53lb90p9bf.R.inc(32583);
        __CLR4_4_1p53p53lb90p9bf.R.inc(32584);this.parameterName = parameterName;
        __CLR4_4_1p53p53lb90p9bf.R.inc(32585);this.hP = hP;
    }finally{__CLR4_4_1p53p53lb90p9bf.R.flushNeeded();}}

    /** Get parameter name.
     * @return parameterName parameter name
     */
    public String getParameterName() {try{__CLR4_4_1p53p53lb90p9bf.R.inc(32586);
        __CLR4_4_1p53p53lb90p9bf.R.inc(32587);return parameterName;
    }finally{__CLR4_4_1p53p53lb90p9bf.R.flushNeeded();}}

    /** Get parameter step.
     * @return hP parameter step
     */
    public double getHP() {try{__CLR4_4_1p53p53lb90p9bf.R.inc(32588);
        __CLR4_4_1p53p53lb90p9bf.R.inc(32589);return hP;
    }finally{__CLR4_4_1p53p53lb90p9bf.R.flushNeeded();}}

    /** Set parameter step.
     * @param hParam parameter step
     */
    public void setHP(final double hParam) {try{__CLR4_4_1p53p53lb90p9bf.R.inc(32590);
        __CLR4_4_1p53p53lb90p9bf.R.inc(32591);this.hP = hParam;
    }finally{__CLR4_4_1p53p53lb90p9bf.R.flushNeeded();}}

}
