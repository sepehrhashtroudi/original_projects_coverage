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
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.ArithmeticUtils;

/**
 * Implements the <a href="http://www.archive.chipcenter.com/dsp/DSP000517F1.html">Fast Hadamard Transform</a> (FHT).
 * Transformation of an input vector x to the output vector y.
 * <p>
 * In addition to transformation of real vectors, the Hadamard transform can
 * transform integer vectors into integer vectors. However, this integer transform
 * cannot be inverted directly. Due to a scaling factor it may lead to rational results.
 * As an example, the inverse transform of integer vector (0, 1, 0, 1) is rational
 * vector (1/2, -1/2, 0, 0).
 *
 * @version $Id$
 * @since 2.0
 */
public class FastHadamardTransformer implements RealTransformer, Serializable {public static class __CLR4_4_116up16uplb90patl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,55599,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier. */
    static final long serialVersionUID = 20120211L;

    /**
     * {@inheritDoc}
     *
     * @throws MathIllegalArgumentException if the length of the data array is
     * not a power of two
     */
    public double[] transform(final double[] f, final TransformType type) {try{__CLR4_4_116up16uplb90patl.R.inc(55537);
        __CLR4_4_116up16uplb90patl.R.inc(55538);if ((((type == TransformType.FORWARD)&&(__CLR4_4_116up16uplb90patl.R.iget(55539)!=0|true))||(__CLR4_4_116up16uplb90patl.R.iget(55540)==0&false))) {{
            __CLR4_4_116up16uplb90patl.R.inc(55541);return fht(f);
        }
        }__CLR4_4_116up16uplb90patl.R.inc(55542);return TransformUtils.scaleArray(fht(f), 1.0 / f.length);
    }finally{__CLR4_4_116up16uplb90patl.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * @throws org.apache.commons.math3.exception.NonMonotonicSequenceException
     *   if the lower bound is greater than, or equal to the upper bound
     * @throws org.apache.commons.math3.exception.NotStrictlyPositiveException
     *   if the number of sample points is negative
     * @throws MathIllegalArgumentException if the number of sample points is not a power of two
     */
    public double[] transform(final UnivariateFunction f,
        final double min, final double max, final int n,
        final TransformType type) {try{__CLR4_4_116up16uplb90patl.R.inc(55543);

        __CLR4_4_116up16uplb90patl.R.inc(55544);return transform(FunctionUtils.sample(f, min, max, n), type);
    }finally{__CLR4_4_116up16uplb90patl.R.flushNeeded();}}

    /**
     * Returns the forward transform of the specified integer data set.The
     * integer transform cannot be inverted directly, due to a scaling factor
     * which may lead to double results.
     *
     * @param f the integer data array to be transformed (signal)
     * @return the integer transformed array (spectrum)
     * @throws MathIllegalArgumentException if the length of the data array is not a power of two
     */
    public int[] transform(final int[] f) {try{__CLR4_4_116up16uplb90patl.R.inc(55545);
        __CLR4_4_116up16uplb90patl.R.inc(55546);return fht(f);
    }finally{__CLR4_4_116up16uplb90patl.R.flushNeeded();}}

    /**
     * The FHT (Fast Hadamard Transformation) which uses only subtraction and
     * addition. Requires {@code N * log2(N) = n * 2^n} additions.
     *
     * <h3>Short Table of manual calculation for N=8</h3>
     * <ol>
     * <li><b>x</b> is the input vector to be transformed,</li>
     * <li><b>y</b> is the output vector (Fast Hadamard transform of <b>x</b>),</li>
     * <li>a and b are helper rows.</li>
     * </ol>
     * <table align="center" border="1" cellpadding="3">
     * <tbody align="center">
     * <tr>
     *     <th>x</th>
     *     <th>a</th>
     *     <th>b</th>
     *     <th>y</th>
     * </tr>
     * <tr>
     *     <th>x<sub>0</sub></th>
     *     <td>a<sub>0</sub> = x<sub>0</sub> + x<sub>1</sub></td>
     *     <td>b<sub>0</sub> = a<sub>0</sub> + a<sub>1</sub></td>
     *     <td>y<sub>0</sub> = b<sub>0</sub >+ b<sub>1</sub></td>
     * </tr>
     * <tr>
     *     <th>x<sub>1</sub></th>
     *     <td>a<sub>1</sub> = x<sub>2</sub> + x<sub>3</sub></td>
     *     <td>b<sub>0</sub> = a<sub>2</sub> + a<sub>3</sub></td>
     *     <td>y<sub>0</sub> = b<sub>2</sub> + b<sub>3</sub></td>
     * </tr>
     * <tr>
     *     <th>x<sub>2</sub></th>
     *     <td>a<sub>2</sub> = x<sub>4</sub> + x<sub>5</sub></td>
     *     <td>b<sub>0</sub> = a<sub>4</sub> + a<sub>5</sub></td>
     *     <td>y<sub>0</sub> = b<sub>4</sub> + b<sub>5</sub></td>
     * </tr>
     * <tr>
     *     <th>x<sub>3</sub></th>
     *     <td>a<sub>3</sub> = x<sub>6</sub> + x<sub>7</sub></td>
     *     <td>b<sub>0</sub> = a<sub>6</sub> + a<sub>7</sub></td>
     *     <td>y<sub>0</sub> = b<sub>6</sub> + b<sub>7</sub></td>
     * </tr>
     * <tr>
     *     <th>x<sub>4</sub></th>
     *     <td>a<sub>0</sub> = x<sub>0</sub> - x<sub>1</sub></td>
     *     <td>b<sub>0</sub> = a<sub>0</sub> - a<sub>1</sub></td>
     *     <td>y<sub>0</sub> = b<sub>0</sub> - b<sub>1</sub></td>
     * </tr>
     * <tr>
     *     <th>x<sub>5</sub></th>
     *     <td>a<sub>1</sub> = x<sub>2</sub> - x<sub>3</sub></td>
     *     <td>b<sub>0</sub> = a<sub>2</sub> - a<sub>3</sub></td>
     *     <td>y<sub>0</sub> = b<sub>2</sub> - b<sub>3</sub></td>
     * </tr>
     * <tr>
     *     <th>x<sub>6</sub></th>
     *     <td>a<sub>2</sub> = x<sub>4</sub> - x<sub>5</sub></td>
     *     <td>b<sub>0</sub> = a<sub>4</sub> - a<sub>5</sub></td>
     *     <td>y<sub>0</sub> = b<sub>4</sub> - b<sub>5</sub></td>
     * </tr>
     * <tr>
     *     <th>x<sub>7</sub></th>
     *     <td>a<sub>3</sub> = x<sub>6</sub> - x<sub>7</sub></td>
     *     <td>b<sub>0</sub> = a<sub>6</sub> - a<sub>7</sub></td>
     *     <td>y<sub>0</sub> = b<sub>6</sub> - b<sub>7</sub></td>
     * </tr>
     * </tbody>
     * </table>
     *
     * <h3>How it works</h3>
     * <ol>
     * <li>Construct a matrix with {@code N} rows and {@code n + 1} columns,
     * {@code hadm[n+1][N]}.<br/>
     * <em>(If I use [x][y] it always means [row-offset][column-offset] of a
     * Matrix with n rows and m columns. Its entries go from M[0][0]
     * to M[n][N])</em></li>
     * <li>Place the input vector {@code x[N]} in the first column of the
     * matrix {@code hadm}.</li>
     * <li>The entries of the submatrix {@code D_top} are calculated as follows
     *     <ul>
     *         <li>{@code D_top} goes from entry {@code [0][1]} to
     *         {@code [N / 2 - 1][n + 1]},</li>
     *         <li>the columns of {@code D_top} are the pairwise mutually
     *         exclusive sums of the previous column.</li>
     *     </ul>
     * </li>
     * <li>The entries of the submatrix {@code D_bottom} are calculated as
     * follows
     *     <ul>
     *         <li>{@code D_bottom} goes from entry {@code [N / 2][1]} to
     *         {@code [N][n + 1]},</li>
     *         <li>the columns of {@code D_bottom} are the pairwise differences
     *         of the previous column.</li>
     *     </ul>
     * </li>
     * <li>The consputation of {@code D_top} and {@code D_bottom} are best
     * understood with the above example (for {@code N = 8}).
     * <li>The output vector {@code y} is now in the last column of
     * {@code hadm}.</li>
     * <li><em>Algorithm from <a href="http://www.archive.chipcenter.com/dsp/DSP000517F1.html">chipcenter</a>.</em></li>
     * </ol>
     * <h3>Visually</h3>
     * <table border="1" align="center" cellpadding="3">
     * <tbody align="center">
     * <tr>
     *     <td></td><th>0</th><th>1</th><th>2</th><th>3</th>
     *     <th>&hellip;</th>
     *     <th>n + 1</th>
     * </tr>
     * <tr>
     *     <th>0</th>
     *     <td>x<sub>0</sub></td>
     *     <td colspan="5" rowspan="5" align="center" valign="middle">
     *         &uarr;<br/>
     *         &larr; D<sub>top</sub> &rarr;<br/>
     *         &darr;
     *     </td>
     * </tr>
     * <tr><th>1</th><td>x<sub>1</sub></td></tr>
     * <tr><th>2</th><td>x<sub>2</sub></td></tr>
     * <tr><th>&hellip;</th><td>&hellip;</td></tr>
     * <tr><th>N / 2 - 1</th><td>x<sub>N/2-1</sub></td></tr>
     * <tr>
     *     <th>N / 2</th>
     *     <td>x<sub>N/2</sub></td>
     *     <td colspan="5" rowspan="5" align="center" valign="middle">
     *         &uarr;<br/>
     *         &larr; D<sub>bottom</sub> &rarr;<br/>
     *         &darr;
     *     </td>
     * </tr>
     * <tr><th>N / 2 + 1</th><td>x<sub>N/2+1</sub></td></tr>
     * <tr><th>N / 2 + 2</th><td>x<sub>N/2+2</sub></td></tr>
     * <tr><th>&hellip;</th><td>&hellip;</td></tr>
     * <tr><th>N</th><td>x<sub>N</sub></td></tr>
     * </tbody>
     * </table>
     *
     * @param x the real data array to be transformed
     * @return the real transformed array, {@code y}
     * @throws MathIllegalArgumentException if the length of the data array is not a power of two
     */
    protected double[] fht(double[] x) throws MathIllegalArgumentException {try{__CLR4_4_116up16uplb90patl.R.inc(55547);

        __CLR4_4_116up16uplb90patl.R.inc(55548);final int n     = x.length;
        __CLR4_4_116up16uplb90patl.R.inc(55549);final int halfN = n / 2;

        __CLR4_4_116up16uplb90patl.R.inc(55550);if ((((!ArithmeticUtils.isPowerOfTwo(n))&&(__CLR4_4_116up16uplb90patl.R.iget(55551)!=0|true))||(__CLR4_4_116up16uplb90patl.R.iget(55552)==0&false))) {{
            __CLR4_4_116up16uplb90patl.R.inc(55553);throw new MathIllegalArgumentException(
                    LocalizedFormats.NOT_POWER_OF_TWO,
                    Integer.valueOf(n));
        }

        /*
         * Instead of creating a matrix with p+1 columns and n rows, we use two
         * one dimension arrays which we are used in an alternating way.
         */
        }__CLR4_4_116up16uplb90patl.R.inc(55554);double[] yPrevious = new double[n];
        __CLR4_4_116up16uplb90patl.R.inc(55555);double[] yCurrent  = x.clone();

        // iterate from left to right (column)
        __CLR4_4_116up16uplb90patl.R.inc(55556);for (int j = 1; (((j < n)&&(__CLR4_4_116up16uplb90patl.R.iget(55557)!=0|true))||(__CLR4_4_116up16uplb90patl.R.iget(55558)==0&false)); j <<= 1) {{

            // switch columns
            __CLR4_4_116up16uplb90patl.R.inc(55559);final double[] yTmp = yCurrent;
            __CLR4_4_116up16uplb90patl.R.inc(55560);yCurrent  = yPrevious;
            __CLR4_4_116up16uplb90patl.R.inc(55561);yPrevious = yTmp;

            // iterate from top to bottom (row)
            __CLR4_4_116up16uplb90patl.R.inc(55562);for (int i = 0; (((i < halfN)&&(__CLR4_4_116up16uplb90patl.R.iget(55563)!=0|true))||(__CLR4_4_116up16uplb90patl.R.iget(55564)==0&false)); ++i) {{
                // Dtop: the top part works with addition
                __CLR4_4_116up16uplb90patl.R.inc(55565);final int twoI = 2 * i;
                __CLR4_4_116up16uplb90patl.R.inc(55566);yCurrent[i] = yPrevious[twoI] + yPrevious[twoI + 1];
            }
            }__CLR4_4_116up16uplb90patl.R.inc(55567);for (int i = halfN; (((i < n)&&(__CLR4_4_116up16uplb90patl.R.iget(55568)!=0|true))||(__CLR4_4_116up16uplb90patl.R.iget(55569)==0&false)); ++i) {{
                // Dbottom: the bottom part works with subtraction
                __CLR4_4_116up16uplb90patl.R.inc(55570);final int twoI = 2 * i;
                __CLR4_4_116up16uplb90patl.R.inc(55571);yCurrent[i] = yPrevious[twoI - n] - yPrevious[twoI - n + 1];
            }
        }}

        }__CLR4_4_116up16uplb90patl.R.inc(55572);return yCurrent;

    }finally{__CLR4_4_116up16uplb90patl.R.flushNeeded();}}

    /**
     * Returns the forward transform of the specified integer data set. The FHT
     * (Fast Hadamard Transform) uses only subtraction and addition.
     *
     * @param x the integer data array to be transformed
     * @return the integer transformed array, {@code y}
     * @throws MathIllegalArgumentException if the length of the data array is not a power of two
     */
    protected int[] fht(int[] x) throws MathIllegalArgumentException {try{__CLR4_4_116up16uplb90patl.R.inc(55573);

        __CLR4_4_116up16uplb90patl.R.inc(55574);final int n     = x.length;
        __CLR4_4_116up16uplb90patl.R.inc(55575);final int halfN = n / 2;

        __CLR4_4_116up16uplb90patl.R.inc(55576);if ((((!ArithmeticUtils.isPowerOfTwo(n))&&(__CLR4_4_116up16uplb90patl.R.iget(55577)!=0|true))||(__CLR4_4_116up16uplb90patl.R.iget(55578)==0&false))) {{
            __CLR4_4_116up16uplb90patl.R.inc(55579);throw new MathIllegalArgumentException(
                    LocalizedFormats.NOT_POWER_OF_TWO,
                    Integer.valueOf(n));
        }

        /*
         * Instead of creating a matrix with p+1 columns and n rows, we use two
         * one dimension arrays which we are used in an alternating way.
         */
        }__CLR4_4_116up16uplb90patl.R.inc(55580);int[] yPrevious = new int[n];
        __CLR4_4_116up16uplb90patl.R.inc(55581);int[] yCurrent  = x.clone();

        // iterate from left to right (column)
        __CLR4_4_116up16uplb90patl.R.inc(55582);for (int j = 1; (((j < n)&&(__CLR4_4_116up16uplb90patl.R.iget(55583)!=0|true))||(__CLR4_4_116up16uplb90patl.R.iget(55584)==0&false)); j <<= 1) {{

            // switch columns
            __CLR4_4_116up16uplb90patl.R.inc(55585);final int[] yTmp = yCurrent;
            __CLR4_4_116up16uplb90patl.R.inc(55586);yCurrent  = yPrevious;
            __CLR4_4_116up16uplb90patl.R.inc(55587);yPrevious = yTmp;

            // iterate from top to bottom (row)
            __CLR4_4_116up16uplb90patl.R.inc(55588);for (int i = 0; (((i < halfN)&&(__CLR4_4_116up16uplb90patl.R.iget(55589)!=0|true))||(__CLR4_4_116up16uplb90patl.R.iget(55590)==0&false)); ++i) {{
                // Dtop: the top part works with addition
                __CLR4_4_116up16uplb90patl.R.inc(55591);final int twoI = 2 * i;
                __CLR4_4_116up16uplb90patl.R.inc(55592);yCurrent[i] = yPrevious[twoI] + yPrevious[twoI + 1];
            }
            }__CLR4_4_116up16uplb90patl.R.inc(55593);for (int i = halfN; (((i < n)&&(__CLR4_4_116up16uplb90patl.R.iget(55594)!=0|true))||(__CLR4_4_116up16uplb90patl.R.iget(55595)==0&false)); ++i) {{
                // Dbottom: the bottom part works with subtraction
                __CLR4_4_116up16uplb90patl.R.inc(55596);final int twoI = 2 * i;
                __CLR4_4_116up16uplb90patl.R.inc(55597);yCurrent[i] = yPrevious[twoI - n] - yPrevious[twoI - n + 1];
            }
        }}

        // return the last computed output vector y
        }__CLR4_4_116up16uplb90patl.R.inc(55598);return yCurrent;

    }finally{__CLR4_4_116up16uplb90patl.R.flushNeeded();}}

}
