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

import java.io.Serializable;

import org.apache.commons.math3.analysis.FunctionUtils;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.complex.Complex;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.ArithmeticUtils;
import org.apache.commons.math3.util.FastMath;

/**
 * Implements the Fast Sine Transform for transformation of one-dimensional real
 * data sets. For reference, see James S. Walker, <em>Fast Fourier
 * Transforms</em>, chapter 3 (ISBN 0849371635).
 * <p>
 * There are several variants of the discrete sine transform. The present
 * implementation corresponds to DST-I, with various normalization conventions,
 * which are specified by the parameter {@link DstNormalization}.
 * <strong>It should be noted that regardless to the convention, the first
 * element of the dataset to be transformed must be zero.</strong>
 * <p>
 * DST-I is equivalent to DFT of an <em>odd extension</em> of the data series.
 * More precisely, if x<sub>0</sub>, &hellip;, x<sub>N-1</sub> is the data set
 * to be sine transformed, the extended data set x<sub>0</sub><sup>&#35;</sup>,
 * &hellip;, x<sub>2N-1</sub><sup>&#35;</sup> is defined as follows
 * <ul>
 * <li>x<sub>0</sub><sup>&#35;</sup> = x<sub>0</sub> = 0,</li>
 * <li>x<sub>k</sub><sup>&#35;</sup> = x<sub>k</sub> if 1 &le; k &lt; N,</li>
 * <li>x<sub>N</sub><sup>&#35;</sup> = 0,</li>
 * <li>x<sub>k</sub><sup>&#35;</sup> = -x<sub>2N-k</sub> if N + 1 &le; k &lt;
 * 2N.</li>
 * </ul>
 * <p>
 * Then, the standard DST-I y<sub>0</sub>, &hellip;, y<sub>N-1</sub> of the real
 * data set x<sub>0</sub>, &hellip;, x<sub>N-1</sub> is equal to <em>half</em>
 * of i (the pure imaginary number) times the N first elements of the DFT of the
 * extended data set x<sub>0</sub><sup>&#35;</sup>, &hellip;,
 * x<sub>2N-1</sub><sup>&#35;</sup> <br />
 * y<sub>n</sub> = (i / 2) &sum;<sub>k=0</sub><sup>2N-1</sup>
 * x<sub>k</sub><sup>&#35;</sup> exp[-2&pi;i nk / (2N)]
 * &nbsp;&nbsp;&nbsp;&nbsp;k = 0, &hellip;, N-1.
 * <p>
 * The present implementation of the discrete sine transform as a fast sine
 * transform requires the length of the data to be a power of two. Besides,
 * it implicitly assumes that the sampled function is odd. In particular, the
 * first element of the data set must be 0, which is enforced in
 * {@link #transform(UnivariateFunction, double, double, int, TransformType)},
 * after sampling.
 *
 * @version $Id$
 * @since 1.2
 */
public class FastSineTransformer implements RealTransformer, Serializable {public static class __CLR4_4_116wf16wflb90pats{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,55654,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier. */
    static final long serialVersionUID = 20120211L;

    /** The type of DST to be performed. */
    private final DstNormalization normalization;

    /**
     * Creates a new instance of this class, with various normalization conventions.
     *
     * @param normalization the type of normalization to be applied to the transformed data
     */
    public FastSineTransformer(final DstNormalization normalization) {try{__CLR4_4_116wf16wflb90pats.R.inc(55599);
        __CLR4_4_116wf16wflb90pats.R.inc(55600);this.normalization = normalization;
    }finally{__CLR4_4_116wf16wflb90pats.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * The first element of the specified data set is required to be {@code 0}.
     *
     * @throws MathIllegalArgumentException if the length of the data array is
     *   not a power of two, or the first element of the data array is not zero
     */
    public double[] transform(final double[] f, final TransformType type) {try{__CLR4_4_116wf16wflb90pats.R.inc(55601);
        __CLR4_4_116wf16wflb90pats.R.inc(55602);if ((((normalization == DstNormalization.ORTHOGONAL_DST_I)&&(__CLR4_4_116wf16wflb90pats.R.iget(55603)!=0|true))||(__CLR4_4_116wf16wflb90pats.R.iget(55604)==0&false))) {{
            __CLR4_4_116wf16wflb90pats.R.inc(55605);final double s = FastMath.sqrt(2.0 / f.length);
            __CLR4_4_116wf16wflb90pats.R.inc(55606);return TransformUtils.scaleArray(fst(f), s);
        }
        }__CLR4_4_116wf16wflb90pats.R.inc(55607);if ((((type == TransformType.FORWARD)&&(__CLR4_4_116wf16wflb90pats.R.iget(55608)!=0|true))||(__CLR4_4_116wf16wflb90pats.R.iget(55609)==0&false))) {{
            __CLR4_4_116wf16wflb90pats.R.inc(55610);return fst(f);
        }
        }__CLR4_4_116wf16wflb90pats.R.inc(55611);final double s = 2.0 / f.length;
        __CLR4_4_116wf16wflb90pats.R.inc(55612);return TransformUtils.scaleArray(fst(f), s);
    }finally{__CLR4_4_116wf16wflb90pats.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * This implementation enforces {@code f(x) = 0.0} at {@code x = 0.0}.
     *
     * @throws org.apache.commons.math3.exception.NonMonotonicSequenceException
     *   if the lower bound is greater than, or equal to the upper bound
     * @throws org.apache.commons.math3.exception.NotStrictlyPositiveException
     *   if the number of sample points is negative
     * @throws MathIllegalArgumentException if the number of sample points is not a power of two
     */
    public double[] transform(final UnivariateFunction f,
        final double min, final double max, final int n,
        final TransformType type) {try{__CLR4_4_116wf16wflb90pats.R.inc(55613);

        __CLR4_4_116wf16wflb90pats.R.inc(55614);final double[] data = FunctionUtils.sample(f, min, max, n);
        __CLR4_4_116wf16wflb90pats.R.inc(55615);data[0] = 0.0;
        __CLR4_4_116wf16wflb90pats.R.inc(55616);return transform(data, type);
    }finally{__CLR4_4_116wf16wflb90pats.R.flushNeeded();}}

    /**
     * Perform the FST algorithm (including inverse). The first element of the
     * data set is required to be {@code 0}.
     *
     * @param f the real data array to be transformed
     * @return the real transformed array
     * @throws MathIllegalArgumentException if the length of the data array is
     *   not a power of two, or the first element of the data array is not zero
     */
    protected double[] fst(double[] f) throws MathIllegalArgumentException {try{__CLR4_4_116wf16wflb90pats.R.inc(55617);

        __CLR4_4_116wf16wflb90pats.R.inc(55618);final double[] transformed = new double[f.length];

        __CLR4_4_116wf16wflb90pats.R.inc(55619);if ((((!ArithmeticUtils.isPowerOfTwo(f.length))&&(__CLR4_4_116wf16wflb90pats.R.iget(55620)!=0|true))||(__CLR4_4_116wf16wflb90pats.R.iget(55621)==0&false))) {{
            __CLR4_4_116wf16wflb90pats.R.inc(55622);throw new MathIllegalArgumentException(
                    LocalizedFormats.NOT_POWER_OF_TWO_CONSIDER_PADDING,
                    Integer.valueOf(f.length));
        }
        }__CLR4_4_116wf16wflb90pats.R.inc(55623);if ((((f[0] != 0.0)&&(__CLR4_4_116wf16wflb90pats.R.iget(55624)!=0|true))||(__CLR4_4_116wf16wflb90pats.R.iget(55625)==0&false))) {{
            __CLR4_4_116wf16wflb90pats.R.inc(55626);throw new MathIllegalArgumentException(
                    LocalizedFormats.FIRST_ELEMENT_NOT_ZERO,
                    Double.valueOf(f[0]));
        }
        }__CLR4_4_116wf16wflb90pats.R.inc(55627);final int n = f.length;
        __CLR4_4_116wf16wflb90pats.R.inc(55628);if ((((n == 1)&&(__CLR4_4_116wf16wflb90pats.R.iget(55629)!=0|true))||(__CLR4_4_116wf16wflb90pats.R.iget(55630)==0&false))) {{       // trivial case
            __CLR4_4_116wf16wflb90pats.R.inc(55631);transformed[0] = 0.0;
            __CLR4_4_116wf16wflb90pats.R.inc(55632);return transformed;
        }

        // construct a new array and perform FFT on it
        }__CLR4_4_116wf16wflb90pats.R.inc(55633);final double[] x = new double[n];
        __CLR4_4_116wf16wflb90pats.R.inc(55634);x[0] = 0.0;
        __CLR4_4_116wf16wflb90pats.R.inc(55635);x[n >> 1] = 2.0 * f[n >> 1];
        __CLR4_4_116wf16wflb90pats.R.inc(55636);for (int i = 1; (((i < (n >> 1))&&(__CLR4_4_116wf16wflb90pats.R.iget(55637)!=0|true))||(__CLR4_4_116wf16wflb90pats.R.iget(55638)==0&false)); i++) {{
            __CLR4_4_116wf16wflb90pats.R.inc(55639);final double a = FastMath.sin(i * FastMath.PI / n) * (f[i] + f[n - i]);
            __CLR4_4_116wf16wflb90pats.R.inc(55640);final double b = 0.5 * (f[i] - f[n - i]);
            __CLR4_4_116wf16wflb90pats.R.inc(55641);x[i]     = a + b;
            __CLR4_4_116wf16wflb90pats.R.inc(55642);x[n - i] = a - b;
        }
        }__CLR4_4_116wf16wflb90pats.R.inc(55643);FastFourierTransformer transformer;
        __CLR4_4_116wf16wflb90pats.R.inc(55644);transformer = new FastFourierTransformer(DftNormalization.STANDARD);
        __CLR4_4_116wf16wflb90pats.R.inc(55645);Complex[] y = transformer.transform(x, TransformType.FORWARD);

        // reconstruct the FST result for the original array
        __CLR4_4_116wf16wflb90pats.R.inc(55646);transformed[0] = 0.0;
        __CLR4_4_116wf16wflb90pats.R.inc(55647);transformed[1] = 0.5 * y[0].getReal();
        __CLR4_4_116wf16wflb90pats.R.inc(55648);for (int i = 1; (((i < (n >> 1))&&(__CLR4_4_116wf16wflb90pats.R.iget(55649)!=0|true))||(__CLR4_4_116wf16wflb90pats.R.iget(55650)==0&false)); i++) {{
            __CLR4_4_116wf16wflb90pats.R.inc(55651);transformed[2 * i]     = -y[i].getImaginary();
            __CLR4_4_116wf16wflb90pats.R.inc(55652);transformed[2 * i + 1] = y[i].getReal() + transformed[2 * i - 1];
        }

        }__CLR4_4_116wf16wflb90pats.R.inc(55653);return transformed;
    }finally{__CLR4_4_116wf16wflb90pats.R.flushNeeded();}}
}
