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

package org.apache.commons.math3.geometry.euclidean.oned;

import java.io.Serializable;

import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.geometry.Space;

/**
 * This class implements a one-dimensional space.
 * @version $Id$
 * @since 3.0
 */
public class Euclidean1D implements Serializable, Space {public static class __CLR4_4_1c9zc9zlb90p81l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,15920,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier. */
    private static final long serialVersionUID = -1178039568877797126L;

    /** Private constructor for the singleton.
     */
    private Euclidean1D() {try{__CLR4_4_1c9zc9zlb90p81l.R.inc(15911);
    }finally{__CLR4_4_1c9zc9zlb90p81l.R.flushNeeded();}}

    /** Get the unique instance.
     * @return the unique instance
     */
    public static Euclidean1D getInstance() {try{__CLR4_4_1c9zc9zlb90p81l.R.inc(15912);
        __CLR4_4_1c9zc9zlb90p81l.R.inc(15913);return LazyHolder.INSTANCE;
    }finally{__CLR4_4_1c9zc9zlb90p81l.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int getDimension() {try{__CLR4_4_1c9zc9zlb90p81l.R.inc(15914);
        __CLR4_4_1c9zc9zlb90p81l.R.inc(15915);return 1;
    }finally{__CLR4_4_1c9zc9zlb90p81l.R.flushNeeded();}}

    /** {@inheritDoc}
     * <p>
     * As the 1-dimension Euclidean space does not have proper sub-spaces,
     * this method always throws a {@link MathUnsupportedOperationException}
     * </p>
     * @return nothing
     * @throws MathUnsupportedOperationException in all cases
     */
    public Space getSubSpace() throws MathUnsupportedOperationException {try{__CLR4_4_1c9zc9zlb90p81l.R.inc(15916);
        __CLR4_4_1c9zc9zlb90p81l.R.inc(15917);throw new MathUnsupportedOperationException(LocalizedFormats.NOT_SUPPORTED_IN_DIMENSION_N, 1);
    }finally{__CLR4_4_1c9zc9zlb90p81l.R.flushNeeded();}}

    // CHECKSTYLE: stop HideUtilityClassConstructor
    /** Holder for the instance.
     * <p>We use here the Initialization On Demand Holder Idiom.</p>
     */
    private static class LazyHolder {
        /** Cached field instance. */
        private static final Euclidean1D INSTANCE = new Euclidean1D();
    }
    // CHECKSTYLE: resume HideUtilityClassConstructor

    /** Handle deserialization of the singleton.
     * @return the singleton instance
     */
    private Object readResolve() {try{__CLR4_4_1c9zc9zlb90p81l.R.inc(15918);
        // return the singleton instance
        __CLR4_4_1c9zc9zlb90p81l.R.inc(15919);return LazyHolder.INSTANCE;
    }finally{__CLR4_4_1c9zc9zlb90p81l.R.flushNeeded();}}

}
