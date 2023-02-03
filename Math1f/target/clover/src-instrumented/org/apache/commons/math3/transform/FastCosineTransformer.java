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
 * Implements the Fast Cosine Transform for transformation of one-dimensional
 * real data sets. For reference, see James S. Walker, <em>Fast Fourier
 * Transforms</em>, chapter 3 (ISBN 0849371635).
 * <p>
 * There are several variants of the discrete cosine transform. The present
 * implementation corresponds to DCT-I, with various normalization conventions,
 * which are specified by the parameter {@link DctNormalization}.
 * <p>
 * DCT-I is equivalent to DFT of an <em>even extension</em> of the data series.
 * More precisely, if x<sub>0</sub>, &hellip;, x<sub>N-1</sub> is the data set
 * to be cosine transformed, the extended data set
 * x<sub>0</sub><sup>&#35;</sup>, &hellip;, x<sub>2N-3</sub><sup>&#35;</sup>
 * is defined as follows
 * <ul>
 * <li>x<sub>k</sub><sup>&#35;</sup> = x<sub>k</sub> if 0 &le; k &lt; N,</li>
 * <li>x<sub>k</sub><sup>&#35;</sup> = x<sub>2N-2-k</sub>
 * if N &le; k &lt; 2N - 2.</li>
 * </ul>
 * <p>
 * Then, the standard DCT-I y<sub>0</sub>, &hellip;, y<sub>N-1</sub> of the real
 * data set x<sub>0</sub>, &hellip;, x<sub>N-1</sub> is equal to <em>half</em>
 * of the N first elements of the DFT of the extended data set
 * x<sub>0</sub><sup>&#35;</sup>, &hellip;, x<sub>2N-3</sub><sup>&#35;</sup>
 * <br/>
 * y<sub>n</sub> = (1 / 2) &sum;<sub>k=0</sub><sup>2N-3</sup>
 * x<sub>k</sub><sup>&#35;</sup> exp[-2&pi;i nk / (2N - 2)]
 * &nbsp;&nbsp;&nbsp;&nbsp;k = 0, &hellip;, N-1.
 * <p>
 * The present implementation of the discrete cosine transform as a fast cosine
 * transform requires the length of the data set to be a power of two plus one
 * (N&nbsp;=&nbsp;2<sup>n</sup>&nbsp;+&nbsp;1). Besides, it implicitly assumes
 * that the sampled function is even.
 *
 * @version $Id$
 * @since 1.2
 */
public class FastCosineTransformer implements RealTransformer, Serializable {public static class __CLR4_4_116kh16khlb90pat1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,55230,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier. */
    static final long serialVersionUID = 20120212L;

    /** The type of DCT to be performed. */
    private final DctNormalization normalization;

    /**
     * Creates a new instance of this class, with various normalization
     * conventions.
     *
     * @param normalization the type of normalization to be applied to the
     * transformed data
     */
    public FastCosineTransformer(final DctNormalization normalization) {try{__CLR4_4_116kh16khlb90pat1.R.inc(55169);
        __CLR4_4_116kh16khlb90pat1.R.inc(55170);this.normalization = normalization;
    }finally{__CLR4_4_116kh16khlb90pat1.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * @throws MathIllegalArgumentException if the length of the data array is
     * not a power of two plus one
     */
    public double[] transform(final double[] f, final TransformType type)
      throws MathIllegalArgumentException {try{__CLR4_4_116kh16khlb90pat1.R.inc(55171);
        __CLR4_4_116kh16khlb90pat1.R.inc(55172);if ((((type == TransformType.FORWARD)&&(__CLR4_4_116kh16khlb90pat1.R.iget(55173)!=0|true))||(__CLR4_4_116kh16khlb90pat1.R.iget(55174)==0&false))) {{
            __CLR4_4_116kh16khlb90pat1.R.inc(55175);if ((((normalization == DctNormalization.ORTHOGONAL_DCT_I)&&(__CLR4_4_116kh16khlb90pat1.R.iget(55176)!=0|true))||(__CLR4_4_116kh16khlb90pat1.R.iget(55177)==0&false))) {{
                __CLR4_4_116kh16khlb90pat1.R.inc(55178);final double s = FastMath.sqrt(2.0 / (f.length - 1));
                __CLR4_4_116kh16khlb90pat1.R.inc(55179);return TransformUtils.scaleArray(fct(f), s);
            }
            }__CLR4_4_116kh16khlb90pat1.R.inc(55180);return fct(f);
        }
        }__CLR4_4_116kh16khlb90pat1.R.inc(55181);final double s2 = 2.0 / (f.length - 1);
        __CLR4_4_116kh16khlb90pat1.R.inc(55182);final double s1;
        __CLR4_4_116kh16khlb90pat1.R.inc(55183);if ((((normalization == DctNormalization.ORTHOGONAL_DCT_I)&&(__CLR4_4_116kh16khlb90pat1.R.iget(55184)!=0|true))||(__CLR4_4_116kh16khlb90pat1.R.iget(55185)==0&false))) {{
            __CLR4_4_116kh16khlb90pat1.R.inc(55186);s1 = FastMath.sqrt(s2);
        } }else {{
            __CLR4_4_116kh16khlb90pat1.R.inc(55187);s1 = s2;
        }
        }__CLR4_4_116kh16khlb90pat1.R.inc(55188);return TransformUtils.scaleArray(fct(f), s1);
    }finally{__CLR4_4_116kh16khlb90pat1.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * @throws org.apache.commons.math3.exception.NonMonotonicSequenceException
     * if the lower bound is greater than, or equal to the upper bound
     * @throws org.apache.commons.math3.exception.NotStrictlyPositiveException
     * if the number of sample points is negative
     * @throws MathIllegalArgumentException if the number of sample points is
     * not a power of two plus one
     */
    public double[] transform(final UnivariateFunction f,
        final double min, final double max, final int n,
        final TransformType type) throws MathIllegalArgumentException {try{__CLR4_4_116kh16khlb90pat1.R.inc(55189);

        __CLR4_4_116kh16khlb90pat1.R.inc(55190);final double[] data = FunctionUtils.sample(f, min, max, n);
        __CLR4_4_116kh16khlb90pat1.R.inc(55191);return transform(data, type);
    }finally{__CLR4_4_116kh16khlb90pat1.R.flushNeeded();}}

    /**
     * Perform the FCT algorithm (including inverse).
     *
     * @param f the real data array to be transformed
     * @return the real transformed array
     * @throws MathIllegalArgumentException if the length of the data array is
     * not a power of two plus one
     */
    protected double[] fct(double[] f)
        throws MathIllegalArgumentException {try{__CLR4_4_116kh16khlb90pat1.R.inc(55192);

        __CLR4_4_116kh16khlb90pat1.R.inc(55193);final double[] transformed = new double[f.length];

        __CLR4_4_116kh16khlb90pat1.R.inc(55194);final int n = f.length - 1;
        __CLR4_4_116kh16khlb90pat1.R.inc(55195);if ((((!ArithmeticUtils.isPowerOfTwo(n))&&(__CLR4_4_116kh16khlb90pat1.R.iget(55196)!=0|true))||(__CLR4_4_116kh16khlb90pat1.R.iget(55197)==0&false))) {{
            __CLR4_4_116kh16khlb90pat1.R.inc(55198);throw new MathIllegalArgumentException(
                LocalizedFormats.NOT_POWER_OF_TWO_PLUS_ONE,
                Integer.valueOf(f.length));
        }
        }__CLR4_4_116kh16khlb90pat1.R.inc(55199);if ((((n == 1)&&(__CLR4_4_116kh16khlb90pat1.R.iget(55200)!=0|true))||(__CLR4_4_116kh16khlb90pat1.R.iget(55201)==0&false))) {{       // trivial case
            __CLR4_4_116kh16khlb90pat1.R.inc(55202);transformed[0] = 0.5 * (f[0] + f[1]);
            __CLR4_4_116kh16khlb90pat1.R.inc(55203);transformed[1] = 0.5 * (f[0] - f[1]);
            __CLR4_4_116kh16khlb90pat1.R.inc(55204);return transformed;
        }

        // construct a new array and perform FFT on it
        }__CLR4_4_116kh16khlb90pat1.R.inc(55205);final double[] x = new double[n];
        __CLR4_4_116kh16khlb90pat1.R.inc(55206);x[0] = 0.5 * (f[0] + f[n]);
        __CLR4_4_116kh16khlb90pat1.R.inc(55207);x[n >> 1] = f[n >> 1];
        // temporary variable for transformed[1]
        __CLR4_4_116kh16khlb90pat1.R.inc(55208);double t1 = 0.5 * (f[0] - f[n]);
        __CLR4_4_116kh16khlb90pat1.R.inc(55209);for (int i = 1; (((i < (n >> 1))&&(__CLR4_4_116kh16khlb90pat1.R.iget(55210)!=0|true))||(__CLR4_4_116kh16khlb90pat1.R.iget(55211)==0&false)); i++) {{
            __CLR4_4_116kh16khlb90pat1.R.inc(55212);final double a = 0.5 * (f[i] + f[n - i]);
            __CLR4_4_116kh16khlb90pat1.R.inc(55213);final double b = FastMath.sin(i * FastMath.PI / n) * (f[i] - f[n - i]);
            __CLR4_4_116kh16khlb90pat1.R.inc(55214);final double c = FastMath.cos(i * FastMath.PI / n) * (f[i] - f[n - i]);
            __CLR4_4_116kh16khlb90pat1.R.inc(55215);x[i] = a - b;
            __CLR4_4_116kh16khlb90pat1.R.inc(55216);x[n - i] = a + b;
            __CLR4_4_116kh16khlb90pat1.R.inc(55217);t1 += c;
        }
        }__CLR4_4_116kh16khlb90pat1.R.inc(55218);FastFourierTransformer transformer;
        __CLR4_4_116kh16khlb90pat1.R.inc(55219);transformer = new FastFourierTransformer(DftNormalization.STANDARD);
        __CLR4_4_116kh16khlb90pat1.R.inc(55220);Complex[] y = transformer.transform(x, TransformType.FORWARD);

        // reconstruct the FCT result for the original array
        __CLR4_4_116kh16khlb90pat1.R.inc(55221);transformed[0] = y[0].getReal();
        __CLR4_4_116kh16khlb90pat1.R.inc(55222);transformed[1] = t1;
        __CLR4_4_116kh16khlb90pat1.R.inc(55223);for (int i = 1; (((i < (n >> 1))&&(__CLR4_4_116kh16khlb90pat1.R.iget(55224)!=0|true))||(__CLR4_4_116kh16khlb90pat1.R.iget(55225)==0&false)); i++) {{
            __CLR4_4_116kh16khlb90pat1.R.inc(55226);transformed[2 * i]     = y[i].getReal();
            __CLR4_4_116kh16khlb90pat1.R.inc(55227);transformed[2 * i + 1] = transformed[2 * i - 1] - y[i].getImaginary();
        }
        }__CLR4_4_116kh16khlb90pat1.R.inc(55228);transformed[n] = y[n >> 1].getReal();

        __CLR4_4_116kh16khlb90pat1.R.inc(55229);return transformed;
    }finally{__CLR4_4_116kh16khlb90pat1.R.flushNeeded();}}
}
