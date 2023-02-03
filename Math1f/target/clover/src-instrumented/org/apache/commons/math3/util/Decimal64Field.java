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
package org.apache.commons.math3.util;

import org.apache.commons.math3.Field;
import org.apache.commons.math3.FieldElement;

/**
 * The field of double precision floating-point numbers.
 *
 * @since 3.1
 * @version $Id$
 * @see Decimal64
 */
public class Decimal64Field implements Field<Decimal64> {public static class __CLR4_4_117sx17sxlb90pavr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,56778,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** The unique instance of this class. */
    private static final Decimal64Field INSTANCE = new Decimal64Field();

    /** Default constructor. */
    private Decimal64Field() {try{__CLR4_4_117sx17sxlb90pavr.R.inc(56769);
        // Do nothing
    }finally{__CLR4_4_117sx17sxlb90pavr.R.flushNeeded();}}

    /**
     * Returns the unique instance of this class.
     *
     * @return the unique instance of this class
     */
    public static final Decimal64Field getInstance() {try{__CLR4_4_117sx17sxlb90pavr.R.inc(56770);
        __CLR4_4_117sx17sxlb90pavr.R.inc(56771);return INSTANCE;
    }finally{__CLR4_4_117sx17sxlb90pavr.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Decimal64 getZero() {try{__CLR4_4_117sx17sxlb90pavr.R.inc(56772);
        __CLR4_4_117sx17sxlb90pavr.R.inc(56773);return Decimal64.ZERO;
    }finally{__CLR4_4_117sx17sxlb90pavr.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Decimal64 getOne() {try{__CLR4_4_117sx17sxlb90pavr.R.inc(56774);
        __CLR4_4_117sx17sxlb90pavr.R.inc(56775);return Decimal64.ONE;
    }finally{__CLR4_4_117sx17sxlb90pavr.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Class<? extends FieldElement<Decimal64>> getRuntimeClass() {try{__CLR4_4_117sx17sxlb90pavr.R.inc(56776);
        __CLR4_4_117sx17sxlb90pavr.R.inc(56777);return Decimal64.class;
    }finally{__CLR4_4_117sx17sxlb90pavr.R.flushNeeded();}}
}
