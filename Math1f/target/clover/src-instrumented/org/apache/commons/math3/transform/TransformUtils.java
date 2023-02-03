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
package org.apache.commons.math3.transform;

import java.util.Arrays;

import org.apache.commons.math3.complex.Complex;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.util.LocalizedFormats;

/**
 * Useful functions for the implementation of various transforms.
 *
 * @version $Id$
 * @since 3.0
 */
public class TransformUtils {public static class __CLR4_4_116xy16xylb90pau0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,55704,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Table of the powers of 2 to facilitate binary search lookup.
     *
     * @see #exactLog2(int)
     */
    private static final int[] POWERS_OF_TWO = {
        0x00000001, 0x00000002, 0x00000004, 0x00000008, 0x00000010, 0x00000020,
        0x00000040, 0x00000080, 0x00000100, 0x00000200, 0x00000400, 0x00000800,
        0x00001000, 0x00002000, 0x00004000, 0x00008000, 0x00010000, 0x00020000,
        0x00040000, 0x00080000, 0x00100000, 0x00200000, 0x00400000, 0x00800000,
        0x01000000, 0x02000000, 0x04000000, 0x08000000, 0x10000000, 0x20000000,
        0x40000000
    };

    /** Private constructor. */
    private TransformUtils() {
        super();__CLR4_4_116xy16xylb90pau0.R.inc(55655);try{__CLR4_4_116xy16xylb90pau0.R.inc(55654);
    }finally{__CLR4_4_116xy16xylb90pau0.R.flushNeeded();}}

    /**
     * Multiply every component in the given real array by the
     * given real number. The change is made in place.
     *
     * @param f the real array to be scaled
     * @param d the real scaling coefficient
     * @return a reference to the scaled array
     */
    public static double[] scaleArray(double[] f, double d) {try{__CLR4_4_116xy16xylb90pau0.R.inc(55656);

        __CLR4_4_116xy16xylb90pau0.R.inc(55657);for (int i = 0; (((i < f.length)&&(__CLR4_4_116xy16xylb90pau0.R.iget(55658)!=0|true))||(__CLR4_4_116xy16xylb90pau0.R.iget(55659)==0&false)); i++) {{
            __CLR4_4_116xy16xylb90pau0.R.inc(55660);f[i] *= d;
        }
        }__CLR4_4_116xy16xylb90pau0.R.inc(55661);return f;
    }finally{__CLR4_4_116xy16xylb90pau0.R.flushNeeded();}}

    /**
     * Multiply every component in the given complex array by the
     * given real number. The change is made in place.
     *
     * @param f the complex array to be scaled
     * @param d the real scaling coefficient
     * @return a reference to the scaled array
     */
    public static Complex[] scaleArray(Complex[] f, double d) {try{__CLR4_4_116xy16xylb90pau0.R.inc(55662);

        __CLR4_4_116xy16xylb90pau0.R.inc(55663);for (int i = 0; (((i < f.length)&&(__CLR4_4_116xy16xylb90pau0.R.iget(55664)!=0|true))||(__CLR4_4_116xy16xylb90pau0.R.iget(55665)==0&false)); i++) {{
            __CLR4_4_116xy16xylb90pau0.R.inc(55666);f[i] = new Complex(d * f[i].getReal(), d * f[i].getImaginary());
        }
        }__CLR4_4_116xy16xylb90pau0.R.inc(55667);return f;
    }finally{__CLR4_4_116xy16xylb90pau0.R.flushNeeded();}}


    /**
     * Builds a new two dimensional array of {@code double} filled with the real
     * and imaginary parts of the specified {@link Complex} numbers. In the
     * returned array {@code dataRI}, the data is laid out as follows
     * <ul>
     * <li>{@code dataRI[0][i] = dataC[i].getReal()},</li>
     * <li>{@code dataRI[1][i] = dataC[i].getImaginary()}.</li>
     * </ul>
     *
     * @param dataC the array of {@link Complex} data to be transformed
     * @return a two dimensional array filled with the real and imaginary parts
     *   of the specified complex input
     */
    public static double[][] createRealImaginaryArray(final Complex[] dataC) {try{__CLR4_4_116xy16xylb90pau0.R.inc(55668);
        __CLR4_4_116xy16xylb90pau0.R.inc(55669);final double[][] dataRI = new double[2][dataC.length];
        __CLR4_4_116xy16xylb90pau0.R.inc(55670);final double[] dataR = dataRI[0];
        __CLR4_4_116xy16xylb90pau0.R.inc(55671);final double[] dataI = dataRI[1];
        __CLR4_4_116xy16xylb90pau0.R.inc(55672);for (int i = 0; (((i < dataC.length)&&(__CLR4_4_116xy16xylb90pau0.R.iget(55673)!=0|true))||(__CLR4_4_116xy16xylb90pau0.R.iget(55674)==0&false)); i++) {{
            __CLR4_4_116xy16xylb90pau0.R.inc(55675);final Complex c = dataC[i];
            __CLR4_4_116xy16xylb90pau0.R.inc(55676);dataR[i] = c.getReal();
            __CLR4_4_116xy16xylb90pau0.R.inc(55677);dataI[i] = c.getImaginary();
        }
        }__CLR4_4_116xy16xylb90pau0.R.inc(55678);return dataRI;
    }finally{__CLR4_4_116xy16xylb90pau0.R.flushNeeded();}}

    /**
     * Builds a new array of {@link Complex} from the specified two dimensional
     * array of real and imaginary parts. In the returned array {@code dataC},
     * the data is laid out as follows
     * <ul>
     * <li>{@code dataC[i].getReal() = dataRI[0][i]},</li>
     * <li>{@code dataC[i].getImaginary() = dataRI[1][i]}.</li>
     * </ul>
     *
     * @param dataRI the array of real and imaginary parts to be transformed
     * @return an array of {@link Complex} with specified real and imaginary parts.
     * @throws DimensionMismatchException if the number of rows of the specified
     *   array is not two, or the array is not rectangular
     */
    public static Complex[] createComplexArray(final double[][] dataRI)
        throws DimensionMismatchException{try{__CLR4_4_116xy16xylb90pau0.R.inc(55679);

        __CLR4_4_116xy16xylb90pau0.R.inc(55680);if ((((dataRI.length != 2)&&(__CLR4_4_116xy16xylb90pau0.R.iget(55681)!=0|true))||(__CLR4_4_116xy16xylb90pau0.R.iget(55682)==0&false))) {{
            __CLR4_4_116xy16xylb90pau0.R.inc(55683);throw new DimensionMismatchException(dataRI.length, 2);
        }
        }__CLR4_4_116xy16xylb90pau0.R.inc(55684);final double[] dataR = dataRI[0];
        __CLR4_4_116xy16xylb90pau0.R.inc(55685);final double[] dataI = dataRI[1];
        __CLR4_4_116xy16xylb90pau0.R.inc(55686);if ((((dataR.length != dataI.length)&&(__CLR4_4_116xy16xylb90pau0.R.iget(55687)!=0|true))||(__CLR4_4_116xy16xylb90pau0.R.iget(55688)==0&false))) {{
            __CLR4_4_116xy16xylb90pau0.R.inc(55689);throw new DimensionMismatchException(dataI.length, dataR.length);
        }

        }__CLR4_4_116xy16xylb90pau0.R.inc(55690);final int n = dataR.length;
        __CLR4_4_116xy16xylb90pau0.R.inc(55691);final Complex[] c = new Complex[n];
        __CLR4_4_116xy16xylb90pau0.R.inc(55692);for (int i = 0; (((i < n)&&(__CLR4_4_116xy16xylb90pau0.R.iget(55693)!=0|true))||(__CLR4_4_116xy16xylb90pau0.R.iget(55694)==0&false)); i++) {{
            __CLR4_4_116xy16xylb90pau0.R.inc(55695);c[i] = new Complex(dataR[i], dataI[i]);
        }
        }__CLR4_4_116xy16xylb90pau0.R.inc(55696);return c;
    }finally{__CLR4_4_116xy16xylb90pau0.R.flushNeeded();}}


    /**
     * Returns the base-2 logarithm of the specified {@code int}. Throws an
     * exception if {@code n} is not a power of two.
     *
     * @param n the {@code int} whose base-2 logarithm is to be evaluated
     * @return the base-2 logarithm of {@code n}
     * @throws MathIllegalArgumentException if {@code n} is not a power of two
     */
    public static int exactLog2(final int n)
        throws MathIllegalArgumentException {try{__CLR4_4_116xy16xylb90pau0.R.inc(55697);

        __CLR4_4_116xy16xylb90pau0.R.inc(55698);int index = Arrays.binarySearch(TransformUtils.POWERS_OF_TWO, n);
        __CLR4_4_116xy16xylb90pau0.R.inc(55699);if ((((index < 0)&&(__CLR4_4_116xy16xylb90pau0.R.iget(55700)!=0|true))||(__CLR4_4_116xy16xylb90pau0.R.iget(55701)==0&false))) {{
            __CLR4_4_116xy16xylb90pau0.R.inc(55702);throw new MathIllegalArgumentException(
                    LocalizedFormats.NOT_POWER_OF_TWO_CONSIDER_PADDING,
                    Integer.valueOf(n));
        }
        }__CLR4_4_116xy16xylb90pau0.R.inc(55703);return index;
    }finally{__CLR4_4_116xy16xylb90pau0.R.flushNeeded();}}
}
