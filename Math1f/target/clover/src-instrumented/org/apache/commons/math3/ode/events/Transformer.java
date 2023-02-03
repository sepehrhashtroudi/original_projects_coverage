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

package org.apache.commons.math3.ode.events;

import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.Precision;


/** Transformer for {@link EventHandler#g(double, double[]) g functions}.
 * @see EventFilter
 * @see FilterType
 * @version $Id$
 * @since 3.2
 */
enum Transformer {

    /** Transformer computing transformed = 0.
     * <p>
     * This transformer is used when we initialize the filter, until we get at
     * least one non-zero value to select the proper transformer.
     * </p>
     */
    UNINITIALIZED {
        /**  {@inheritDoc} */
        @Override
        protected double transformed(final double g) {try{__CLR4_4_1ph5ph5lb90p9cy.R.inc(33017);
            __CLR4_4_1ph5ph5lb90p9cy.R.inc(33018);return 0;
        }finally{__CLR4_4_1ph5ph5lb90p9cy.R.flushNeeded();}}
    },

    /** Transformer computing transformed = g.
     * <p>
     * When this transformer is applied, the roots of the original function
     * are preserved, with the same {@code increasing/decreasing} status.
     * </p>
     */
    PLUS {
        /**  {@inheritDoc} */
        @Override
        protected double transformed(final double g) {try{__CLR4_4_1ph5ph5lb90p9cy.R.inc(33019);
            __CLR4_4_1ph5ph5lb90p9cy.R.inc(33020);return g;
        }finally{__CLR4_4_1ph5ph5lb90p9cy.R.flushNeeded();}}
    },

    /** Transformer computing transformed = -g.
     * <p>
     * When this transformer is applied, the roots of the original function
     * are preserved, with reversed {@code increasing/decreasing} status.
     * </p>
     */
    MINUS {
        /**  {@inheritDoc} */
        @Override
        protected double transformed(final double g) {try{__CLR4_4_1ph5ph5lb90p9cy.R.inc(33021);
            __CLR4_4_1ph5ph5lb90p9cy.R.inc(33022);return -g;
        }finally{__CLR4_4_1ph5ph5lb90p9cy.R.flushNeeded();}}
    },

    /** Transformer computing transformed = min(-{@link Precision#SAFE_MIN}, -g, +g).
     * <p>
     * When this transformer is applied, the transformed function is
     * guaranteed to be always strictly negative (i.e. there are no roots).
     * </p>
     */
    MIN {
        /**  {@inheritDoc} */
        @Override
        protected double transformed(final double g) {try{__CLR4_4_1ph5ph5lb90p9cy.R.inc(33023);
            __CLR4_4_1ph5ph5lb90p9cy.R.inc(33024);return FastMath.min(-Precision.SAFE_MIN, FastMath.min(-g, +g));
        }finally{__CLR4_4_1ph5ph5lb90p9cy.R.flushNeeded();}}
    },

    /** Transformer computing transformed = max(+{@link Precision#SAFE_MIN}, -g, +g).
     * <p>
     * When this transformer is applied, the transformed function is
     * guaranteed to be always strictly positive (i.e. there are no roots).
     * </p>
     */
    MAX {
        /**  {@inheritDoc} */
        @Override
        protected double transformed(final double g) {try{__CLR4_4_1ph5ph5lb90p9cy.R.inc(33025);
            __CLR4_4_1ph5ph5lb90p9cy.R.inc(33026);return FastMath.max(+Precision.SAFE_MIN, FastMath.max(-g, +g));
        }finally{__CLR4_4_1ph5ph5lb90p9cy.R.flushNeeded();}}
    };

    /** Transform value of function g.
     * @param g raw value of function g
     * @return transformed value of function g
     */
    protected abstract double transformed(double g);

;public static class __CLR4_4_1ph5ph5lb90p9cy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,33027,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;}
