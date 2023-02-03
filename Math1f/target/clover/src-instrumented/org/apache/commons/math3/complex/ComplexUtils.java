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

package org.apache.commons.math3.complex;

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.FastMath;

/**
 * Static implementations of common
 * {@link org.apache.commons.math3.complex.Complex} utilities functions.
 *
 * @version $Id$
 */
public class ComplexUtils {public static class __CLR4_4_157o57olb90p78v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,6770,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Default constructor.
     */
    private ComplexUtils() {try{__CLR4_4_157o57olb90p78v.R.inc(6756);}finally{__CLR4_4_157o57olb90p78v.R.flushNeeded();}}

    /**
     * Creates a complex number from the given polar representation.
     * <p>
     * The value returned is <code>r&middot;e<sup>i&middot;theta</sup></code>,
     * computed as <code>r&middot;cos(theta) + r&middot;sin(theta)i</code></p>
     * <p>
     * If either <code>r</code> or <code>theta</code> is NaN, or
     * <code>theta</code> is infinite, {@link Complex#NaN} is returned.</p>
     * <p>
     * If <code>r</code> is infinite and <code>theta</code> is finite,
     * infinite or NaN values may be returned in parts of the result, following
     * the rules for double arithmetic.<pre>
     * Examples:
     * <code>
     * polar2Complex(INFINITY, &pi;/4) = INFINITY + INFINITY i
     * polar2Complex(INFINITY, 0) = INFINITY + NaN i
     * polar2Complex(INFINITY, -&pi;/4) = INFINITY - INFINITY i
     * polar2Complex(INFINITY, 5&pi;/4) = -INFINITY - INFINITY i </code></pre></p>
     *
     * @param r the modulus of the complex number to create
     * @param theta  the argument of the complex number to create
     * @return <code>r&middot;e<sup>i&middot;theta</sup></code>
     * @throws MathIllegalArgumentException if {@code r} is negative.
     * @since 1.1
     */
    public static Complex polar2Complex(double r, double theta) throws MathIllegalArgumentException {try{__CLR4_4_157o57olb90p78v.R.inc(6757);
        __CLR4_4_157o57olb90p78v.R.inc(6758);if ((((r < 0)&&(__CLR4_4_157o57olb90p78v.R.iget(6759)!=0|true))||(__CLR4_4_157o57olb90p78v.R.iget(6760)==0&false))) {{
            __CLR4_4_157o57olb90p78v.R.inc(6761);throw new MathIllegalArgumentException(
                  LocalizedFormats.NEGATIVE_COMPLEX_MODULE, r);
        }
        }__CLR4_4_157o57olb90p78v.R.inc(6762);return new Complex(r * FastMath.cos(theta), r * FastMath.sin(theta));
    }finally{__CLR4_4_157o57olb90p78v.R.flushNeeded();}}

    /**
     * Convert an array of primitive doubles to an array of {@code Complex} objects.
     *
     * @param real Array of numbers to be converted to their {@code Complex}
     * equivalent.
     * @return an array of {@code Complex} objects.
     *
     * @since 3.1
     */
    public static Complex[] convertToComplex(double[] real) {try{__CLR4_4_157o57olb90p78v.R.inc(6763);
        __CLR4_4_157o57olb90p78v.R.inc(6764);final Complex c[] = new Complex[real.length];
        __CLR4_4_157o57olb90p78v.R.inc(6765);for (int i = 0; (((i < real.length)&&(__CLR4_4_157o57olb90p78v.R.iget(6766)!=0|true))||(__CLR4_4_157o57olb90p78v.R.iget(6767)==0&false)); i++) {{
            __CLR4_4_157o57olb90p78v.R.inc(6768);c[i] = new Complex(real[i], 0);
        }

        }__CLR4_4_157o57olb90p78v.R.inc(6769);return c;
    }finally{__CLR4_4_157o57olb90p78v.R.flushNeeded();}}
}
