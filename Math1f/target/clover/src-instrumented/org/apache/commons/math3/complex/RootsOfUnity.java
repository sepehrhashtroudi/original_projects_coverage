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

import java.io.Serializable;

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.ZeroException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.FastMath;

/**
 * A helper class for the computation and caching of the {@code n}-th roots of
 * unity.
 *
 * @version $Id$
 * @since 3.0
 */
public class RootsOfUnity implements Serializable {public static class __CLR4_4_15b55b5lb90p79f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,6944,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version id. */
    private static final long serialVersionUID = 20120201L;

    /** Number of roots of unity. */
    private int omegaCount;

    /** Real part of the roots. */
    private double[] omegaReal;

    /**
     * Imaginary part of the {@code n}-th roots of unity, for positive values
     * of {@code n}. In this array, the roots are stored in counter-clockwise
     * order.
     */
    private double[] omegaImaginaryCounterClockwise;

    /**
     * Imaginary part of the {@code n}-th roots of unity, for negative values
     * of {@code n}. In this array, the roots are stored in clockwise order.
     */
    private double[] omegaImaginaryClockwise;

    /**
     * {@code true} if {@link #computeRoots(int)} was called with a positive
     * value of its argument {@code n}. In this case, counter-clockwise ordering
     * of the roots of unity should be used.
     */
    private boolean isCounterClockWise;

    /**
     * Build an engine for computing the {@code n}-th roots of unity.
     */
    public RootsOfUnity() {try{__CLR4_4_15b55b5lb90p79f.R.inc(6881);

        __CLR4_4_15b55b5lb90p79f.R.inc(6882);omegaCount = 0;
        __CLR4_4_15b55b5lb90p79f.R.inc(6883);omegaReal = null;
        __CLR4_4_15b55b5lb90p79f.R.inc(6884);omegaImaginaryCounterClockwise = null;
        __CLR4_4_15b55b5lb90p79f.R.inc(6885);omegaImaginaryClockwise = null;
        __CLR4_4_15b55b5lb90p79f.R.inc(6886);isCounterClockWise = true;
    }finally{__CLR4_4_15b55b5lb90p79f.R.flushNeeded();}}

    /**
     * Returns {@code true} if {@link #computeRoots(int)} was called with a
     * positive value of its argument {@code n}. If {@code true}, then
     * counter-clockwise ordering of the roots of unity should be used.
     *
     * @return {@code true} if the roots of unity are stored in
     * counter-clockwise order
     * @throws MathIllegalStateException if no roots of unity have been computed
     * yet
     */
    public synchronized boolean isCounterClockWise()
            throws MathIllegalStateException {try{__CLR4_4_15b55b5lb90p79f.R.inc(6887);

        __CLR4_4_15b55b5lb90p79f.R.inc(6888);if ((((omegaCount == 0)&&(__CLR4_4_15b55b5lb90p79f.R.iget(6889)!=0|true))||(__CLR4_4_15b55b5lb90p79f.R.iget(6890)==0&false))) {{
            __CLR4_4_15b55b5lb90p79f.R.inc(6891);throw new MathIllegalStateException(
                    LocalizedFormats.ROOTS_OF_UNITY_NOT_COMPUTED_YET);
        }
        }__CLR4_4_15b55b5lb90p79f.R.inc(6892);return isCounterClockWise;
    }finally{__CLR4_4_15b55b5lb90p79f.R.flushNeeded();}}

    /**
     * <p>
     * Computes the {@code n}-th roots of unity. The roots are stored in
     * {@code omega[]}, such that {@code omega[k] = w ^ k}, where
     * {@code k = 0, ..., n - 1}, {@code w = exp(2 * pi * i / n)} and
     * {@code i = sqrt(-1)}.
     * </p>
     * <p>
     * Note that {@code n} can be positive of negative
     * </p>
     * <ul>
     * <li>{@code abs(n)} is always the number of roots of unity.</li>
     * <li>If {@code n > 0}, then the roots are stored in counter-clockwise order.</li>
     * <li>If {@code n < 0}, then the roots are stored in clockwise order.</p>
     * </ul>
     *
     * @param n the (signed) number of roots of unity to be computed
     * @throws ZeroException if {@code n = 0}
     */
    public synchronized void computeRoots(int n) throws ZeroException {try{__CLR4_4_15b55b5lb90p79f.R.inc(6893);

        __CLR4_4_15b55b5lb90p79f.R.inc(6894);if ((((n == 0)&&(__CLR4_4_15b55b5lb90p79f.R.iget(6895)!=0|true))||(__CLR4_4_15b55b5lb90p79f.R.iget(6896)==0&false))) {{
            __CLR4_4_15b55b5lb90p79f.R.inc(6897);throw new ZeroException(
                    LocalizedFormats.CANNOT_COMPUTE_0TH_ROOT_OF_UNITY);
        }

        }__CLR4_4_15b55b5lb90p79f.R.inc(6898);isCounterClockWise = n > 0;

        // avoid repetitive calculations
        __CLR4_4_15b55b5lb90p79f.R.inc(6899);final int absN = FastMath.abs(n);

        __CLR4_4_15b55b5lb90p79f.R.inc(6900);if ((((absN == omegaCount)&&(__CLR4_4_15b55b5lb90p79f.R.iget(6901)!=0|true))||(__CLR4_4_15b55b5lb90p79f.R.iget(6902)==0&false))) {{
            __CLR4_4_15b55b5lb90p79f.R.inc(6903);return;
        }

        // calculate everything from scratch
        }__CLR4_4_15b55b5lb90p79f.R.inc(6904);final double t = 2.0 * FastMath.PI / absN;
        __CLR4_4_15b55b5lb90p79f.R.inc(6905);final double cosT = FastMath.cos(t);
        __CLR4_4_15b55b5lb90p79f.R.inc(6906);final double sinT = FastMath.sin(t);
        __CLR4_4_15b55b5lb90p79f.R.inc(6907);omegaReal = new double[absN];
        __CLR4_4_15b55b5lb90p79f.R.inc(6908);omegaImaginaryCounterClockwise = new double[absN];
        __CLR4_4_15b55b5lb90p79f.R.inc(6909);omegaImaginaryClockwise = new double[absN];
        __CLR4_4_15b55b5lb90p79f.R.inc(6910);omegaReal[0] = 1.0;
        __CLR4_4_15b55b5lb90p79f.R.inc(6911);omegaImaginaryCounterClockwise[0] = 0.0;
        __CLR4_4_15b55b5lb90p79f.R.inc(6912);omegaImaginaryClockwise[0] = 0.0;
        __CLR4_4_15b55b5lb90p79f.R.inc(6913);for (int i = 1; (((i < absN)&&(__CLR4_4_15b55b5lb90p79f.R.iget(6914)!=0|true))||(__CLR4_4_15b55b5lb90p79f.R.iget(6915)==0&false)); i++) {{
            __CLR4_4_15b55b5lb90p79f.R.inc(6916);omegaReal[i] = omegaReal[i - 1] * cosT -
                    omegaImaginaryCounterClockwise[i - 1] * sinT;
            __CLR4_4_15b55b5lb90p79f.R.inc(6917);omegaImaginaryCounterClockwise[i] = omegaReal[i - 1] * sinT +
                    omegaImaginaryCounterClockwise[i - 1] * cosT;
            __CLR4_4_15b55b5lb90p79f.R.inc(6918);omegaImaginaryClockwise[i] = -omegaImaginaryCounterClockwise[i];
        }
        }__CLR4_4_15b55b5lb90p79f.R.inc(6919);omegaCount = absN;
    }finally{__CLR4_4_15b55b5lb90p79f.R.flushNeeded();}}

    /**
     * Get the real part of the {@code k}-th {@code n}-th root of unity.
     *
     * @param k index of the {@code n}-th root of unity
     * @return real part of the {@code k}-th {@code n}-th root of unity
     * @throws MathIllegalStateException if no roots of unity have been
     * computed yet
     * @throws MathIllegalArgumentException if {@code k} is out of range
     */
    public synchronized double getReal(int k)
            throws MathIllegalStateException, MathIllegalArgumentException {try{__CLR4_4_15b55b5lb90p79f.R.inc(6920);

        __CLR4_4_15b55b5lb90p79f.R.inc(6921);if ((((omegaCount == 0)&&(__CLR4_4_15b55b5lb90p79f.R.iget(6922)!=0|true))||(__CLR4_4_15b55b5lb90p79f.R.iget(6923)==0&false))) {{
            __CLR4_4_15b55b5lb90p79f.R.inc(6924);throw new MathIllegalStateException(
                    LocalizedFormats.ROOTS_OF_UNITY_NOT_COMPUTED_YET);
        }
        }__CLR4_4_15b55b5lb90p79f.R.inc(6925);if (((((k < 0) || (k >= omegaCount))&&(__CLR4_4_15b55b5lb90p79f.R.iget(6926)!=0|true))||(__CLR4_4_15b55b5lb90p79f.R.iget(6927)==0&false))) {{
            __CLR4_4_15b55b5lb90p79f.R.inc(6928);throw new OutOfRangeException(
                    LocalizedFormats.OUT_OF_RANGE_ROOT_OF_UNITY_INDEX,
                    Integer.valueOf(k),
                    Integer.valueOf(0),
                    Integer.valueOf(omegaCount - 1));
        }

        }__CLR4_4_15b55b5lb90p79f.R.inc(6929);return omegaReal[k];
    }finally{__CLR4_4_15b55b5lb90p79f.R.flushNeeded();}}

    /**
     * Get the imaginary part of the {@code k}-th {@code n}-th root of unity.
     *
     * @param k index of the {@code n}-th root of unity
     * @return imaginary part of the {@code k}-th {@code n}-th root of unity
     * @throws MathIllegalStateException if no roots of unity have been
     * computed yet
     * @throws OutOfRangeException if {@code k} is out of range
     */
    public synchronized double getImaginary(int k)
            throws MathIllegalStateException, OutOfRangeException {try{__CLR4_4_15b55b5lb90p79f.R.inc(6930);

        __CLR4_4_15b55b5lb90p79f.R.inc(6931);if ((((omegaCount == 0)&&(__CLR4_4_15b55b5lb90p79f.R.iget(6932)!=0|true))||(__CLR4_4_15b55b5lb90p79f.R.iget(6933)==0&false))) {{
            __CLR4_4_15b55b5lb90p79f.R.inc(6934);throw new MathIllegalStateException(
                    LocalizedFormats.ROOTS_OF_UNITY_NOT_COMPUTED_YET);
        }
        }__CLR4_4_15b55b5lb90p79f.R.inc(6935);if (((((k < 0) || (k >= omegaCount))&&(__CLR4_4_15b55b5lb90p79f.R.iget(6936)!=0|true))||(__CLR4_4_15b55b5lb90p79f.R.iget(6937)==0&false))) {{
            __CLR4_4_15b55b5lb90p79f.R.inc(6938);throw new OutOfRangeException(
                    LocalizedFormats.OUT_OF_RANGE_ROOT_OF_UNITY_INDEX,
                    Integer.valueOf(k),
                    Integer.valueOf(0),
                    Integer.valueOf(omegaCount - 1));
        }

        }__CLR4_4_15b55b5lb90p79f.R.inc(6939);return (((isCounterClockWise )&&(__CLR4_4_15b55b5lb90p79f.R.iget(6940)!=0|true))||(__CLR4_4_15b55b5lb90p79f.R.iget(6941)==0&false))? omegaImaginaryCounterClockwise[k] :
            omegaImaginaryClockwise[k];
    }finally{__CLR4_4_15b55b5lb90p79f.R.flushNeeded();}}

    /**
     * Returns the number of roots of unity currently stored. If
     * {@link #computeRoots(int)} was called with {@code n}, then this method
     * returns {@code abs(n)}. If no roots of unity have been computed yet, this
     * method returns 0.
     *
     * @return the number of roots of unity currently stored
     */
    public synchronized int getNumberOfRoots() {try{__CLR4_4_15b55b5lb90p79f.R.inc(6942);
        __CLR4_4_15b55b5lb90p79f.R.inc(6943);return omegaCount;
    }finally{__CLR4_4_15b55b5lb90p79f.R.flushNeeded();}}
}
