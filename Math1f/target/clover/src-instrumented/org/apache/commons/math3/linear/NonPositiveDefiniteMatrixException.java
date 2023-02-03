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
package org.apache.commons.math3.linear;

import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.exception.util.ExceptionContext;

/**
 * Exception to be thrown when a positive definite matrix is expected.
 *
 * @since 3.0
 * @version $Id$
 */
public class NonPositiveDefiniteMatrixException extends NumberIsTooSmallException {public static class __CLR4_4_1lhilhilb90p8yi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,27859,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Serializable version Id. */
    private static final long serialVersionUID = 1641613838113738061L;
    /** Index (diagonal element). */
    private final int index;
    /** Threshold. */
    private final double threshold;

    /**
     * Construct an exception.
     *
     * @param wrong Value that fails the positivity check.
     * @param index Row (and column) index.
     * @param threshold Absolute positivity threshold.
     */
    public NonPositiveDefiniteMatrixException(double wrong,
                                              int index,
                                              double threshold) {
        super(wrong, threshold, false);__CLR4_4_1lhilhilb90p8yi.R.inc(27847);try{__CLR4_4_1lhilhilb90p8yi.R.inc(27846);
        __CLR4_4_1lhilhilb90p8yi.R.inc(27848);this.index = index;
        __CLR4_4_1lhilhilb90p8yi.R.inc(27849);this.threshold = threshold;

        __CLR4_4_1lhilhilb90p8yi.R.inc(27850);final ExceptionContext context = getContext();
        __CLR4_4_1lhilhilb90p8yi.R.inc(27851);context.addMessage(LocalizedFormats.NOT_POSITIVE_DEFINITE_MATRIX);
        __CLR4_4_1lhilhilb90p8yi.R.inc(27852);context.addMessage(LocalizedFormats.ARRAY_ELEMENT, wrong, index);
    }finally{__CLR4_4_1lhilhilb90p8yi.R.flushNeeded();}}

    /**
     * @return the row index.
     */
    public int getRow() {try{__CLR4_4_1lhilhilb90p8yi.R.inc(27853);
        __CLR4_4_1lhilhilb90p8yi.R.inc(27854);return index;
    }finally{__CLR4_4_1lhilhilb90p8yi.R.flushNeeded();}}
    /**
     * @return the column index.
     */
    public int getColumn() {try{__CLR4_4_1lhilhilb90p8yi.R.inc(27855);
        __CLR4_4_1lhilhilb90p8yi.R.inc(27856);return index;
    }finally{__CLR4_4_1lhilhilb90p8yi.R.flushNeeded();}}
    /**
     * @return the absolute positivity threshold.
     */
    public double getThreshold() {try{__CLR4_4_1lhilhilb90p8yi.R.inc(27857);
        __CLR4_4_1lhilhilb90p8yi.R.inc(27858);return threshold;
    }finally{__CLR4_4_1lhilhilb90p8yi.R.flushNeeded();}}
}
