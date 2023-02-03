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
package org.apache.commons.math3.analysis.differentiation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.MathInternalError;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.util.CombinatoricsUtils;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathArrays;

/** Class holding "compiled" computation rules for derivative structures.
 * <p>This class implements the computation rules described in Dan Kalman's paper <a
 * href="http://www1.american.edu/cas/mathstat/People/kalman/pdffiles/mmgautodiff.pdf">Doubly
 * Recursive Multivariate Automatic Differentiation</a>, Mathematics Magazine, vol. 75,
 * no. 3, June 2002. However, in order to avoid performances bottlenecks, the recursive
 * rules are "compiled" once in an unfold form. This class does this recursion unrolling
 * and stores the computation rules as simple loops with pre-computed indirection arrays.</p>
 * <p>
 * This class maps all derivative computation into single dimension arrays that hold the
 * value and partial derivatives. The class does not hold these arrays, which remains under
 * the responsibility of the caller. For each combination of number of free parameters and
 * derivation order, only one compiler is necessary, and this compiler will be used to
 * perform computations on all arrays provided to it, which can represent hundreds or
 * thousands of different parameters kept together with all theur partial derivatives.
 * </p>
 * <p>
 * The arrays on which compilers operate contain only the partial derivatives together
 * with the 0<sup>th</sup> derivative, i.e. the value. The partial derivatives are stored in
 * a compiler-specific order, which can be retrieved using methods {@link
 * #getPartialDerivativeIndex(int...) getPartialDerivativeIndex} and {@link
 * #getPartialDerivativeOrders(int)}. The value is guaranteed to be stored as the first element
 * (i.e. the {@link #getPartialDerivativeIndex(int...) getPartialDerivativeIndex} method returns
 * 0 when called with 0 for all derivation orders and {@link #getPartialDerivativeOrders(int)
 * getPartialDerivativeOrders} returns an array filled with 0 when called with 0 as the index).
 * </p>
 * <p>
 * Note that the ordering changes with number of parameters and derivation order. For example
 * given 2 parameters x and y, df/dy is stored at index 2 when derivation order is set to 1 (in
 * this case the array has three elements: f, df/dx and df/dy). If derivation order is set to
 * 2, then df/dy will be stored at index 3 (in this case the array has six elements: f, df/dx,
 * df/dxdx, df/dy, df/dxdy and df/dydy).
 * </p>
 * <p>
 * Given this structure, users can perform some simple operations like adding, subtracting
 * or multiplying constants and negating the elements by themselves, knowing if they want to
 * mutate their array or create a new array. These simple operations are not provided by
 * the compiler. The compiler provides only the more complex operations between several arrays.
 * </p>
 * <p>This class is mainly used as the engine for scalar variable {@link DerivativeStructure}.
 * It can also be used directly to hold several variables in arrays for more complex data
 * structures. User can for example store a vector of n variables depending on three x, y
 * and z free parameters in one array as follows:
 * <pre>
 *   // parameter 0 is x, parameter 1 is y, parameter 2 is z
 *   int parameters = 3;
 *   DSCompiler compiler = DSCompiler.getCompiler(parameters, order);
 *   int size = compiler.getSize();
 *
 *   // pack all elements in a single array
 *   double[] array = new double[n * size];
 *   for (int i = 0; i < n; ++i) {
 *
 *     // we know value is guaranteed to be the first element
 *     array[i * size] = v[i];
 *
 *     // we don't know where first derivatives are stored, so we ask the compiler
 *     array[i * size + compiler.getPartialDerivativeIndex(1, 0, 0) = dvOnDx[i][0];
 *     array[i * size + compiler.getPartialDerivativeIndex(0, 1, 0) = dvOnDy[i][0];
 *     array[i * size + compiler.getPartialDerivativeIndex(0, 0, 1) = dvOnDz[i][0];
 *
 *     // we let all higher order derivatives set to 0
 *
 *   }
 * </pre>
 * Then in another function, user can perform some operations on all elements stored
 * in the single array, such as a simple product of all variables:
 * <pre>
 *   // compute the product of all elements
 *   double[] product = new double[size];
 *   prod[0] = 1.0;
 *   for (int i = 0; i < n; ++i) {
 *     double[] tmp = product.clone();
 *     compiler.multiply(tmp, 0, array, i * size, product, 0);
 *   }
 *
 *   // value
 *   double p = product[0];
 *
 *   // first derivatives
 *   double dPdX = product[compiler.getPartialDerivativeIndex(1, 0, 0)];
 *   double dPdY = product[compiler.getPartialDerivativeIndex(0, 1, 0)];
 *   double dPdZ = product[compiler.getPartialDerivativeIndex(0, 0, 1)];
 *
 *   // cross derivatives (assuming order was at least 2)
 *   double dPdXdX = product[compiler.getPartialDerivativeIndex(2, 0, 0)];
 *   double dPdXdY = product[compiler.getPartialDerivativeIndex(1, 1, 0)];
 *   double dPdXdZ = product[compiler.getPartialDerivativeIndex(1, 0, 1)];
 *   double dPdYdY = product[compiler.getPartialDerivativeIndex(0, 2, 0)];
 *   double dPdYdZ = product[compiler.getPartialDerivativeIndex(0, 1, 1)];
 *   double dPdZdZ = product[compiler.getPartialDerivativeIndex(0, 0, 2)];
 * </p>
 * @see DerivativeStructure
 * @version $Id$
 * @since 3.1
 */
public class DSCompiler {public static class __CLR4_4_1a5a5lb90p6ar{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,1212,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Array of all compilers created so far. */
    private static AtomicReference<DSCompiler[][]> compilers =
            new AtomicReference<DSCompiler[][]>(null);

    /** Number of free parameters. */
    private final int parameters;

    /** Derivation order. */
    private final int order;

    /** Number of partial derivatives (including the single 0 order derivative element). */
    private final int[][] sizes;

    /** Indirection array for partial derivatives. */
    private final int[][] derivativesIndirection;

    /** Indirection array of the lower derivative elements. */
    private final int[] lowerIndirection;

    /** Indirection arrays for multiplication. */
    private final int[][][] multIndirection;

    /** Indirection arrays for function composition. */
    private final int[][][] compIndirection;

    /** Private constructor, reserved for the factory method {@link #getCompiler(int, int)}.
     * @param parameters number of free parameters
     * @param order derivation order
     * @param valueCompiler compiler for the value part
     * @param derivativeCompiler compiler for the derivative part
     * @throws NumberIsTooLargeException if order is too large
     */
    private DSCompiler(final int parameters, final int order,
                       final DSCompiler valueCompiler, final DSCompiler derivativeCompiler)
        throws NumberIsTooLargeException {try{__CLR4_4_1a5a5lb90p6ar.R.inc(365);

        __CLR4_4_1a5a5lb90p6ar.R.inc(366);this.parameters = parameters;
        __CLR4_4_1a5a5lb90p6ar.R.inc(367);this.order      = order;
        __CLR4_4_1a5a5lb90p6ar.R.inc(368);this.sizes      = compileSizes(parameters, order, valueCompiler);
        __CLR4_4_1a5a5lb90p6ar.R.inc(369);this.derivativesIndirection =
                compileDerivativesIndirection(parameters, order,
                                              valueCompiler, derivativeCompiler);
        __CLR4_4_1a5a5lb90p6ar.R.inc(370);this.lowerIndirection =
                compileLowerIndirection(parameters, order,
                                        valueCompiler, derivativeCompiler);
        __CLR4_4_1a5a5lb90p6ar.R.inc(371);this.multIndirection =
                compileMultiplicationIndirection(parameters, order,
                                                 valueCompiler, derivativeCompiler, lowerIndirection);
        __CLR4_4_1a5a5lb90p6ar.R.inc(372);this.compIndirection =
                compileCompositionIndirection(parameters, order,
                                              valueCompiler, derivativeCompiler,
                                              sizes, derivativesIndirection);

    }finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Get the compiler for number of free parameters and order.
     * @param parameters number of free parameters
     * @param order derivation order
     * @return cached rules set
     * @throws NumberIsTooLargeException if order is too large
     */
    public static DSCompiler getCompiler(int parameters, int order)
        throws NumberIsTooLargeException {try{__CLR4_4_1a5a5lb90p6ar.R.inc(373);

        // get the cached compilers
        __CLR4_4_1a5a5lb90p6ar.R.inc(374);final DSCompiler[][] cache = compilers.get();
        __CLR4_4_1a5a5lb90p6ar.R.inc(375);if ((((cache != null && cache.length > parameters &&
            cache[parameters].length > order && cache[parameters][order] != null)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(376)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(377)==0&false))) {{
            // the compiler has already been created
            __CLR4_4_1a5a5lb90p6ar.R.inc(378);return cache[parameters][order];
        }

        // we need to create more compilers
        }__CLR4_4_1a5a5lb90p6ar.R.inc(379);final int maxParameters = FastMath.max(parameters, (((cache == null )&&(__CLR4_4_1a5a5lb90p6ar.R.iget(380)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(381)==0&false))? 0 : cache.length);
        __CLR4_4_1a5a5lb90p6ar.R.inc(382);final int maxOrder      = FastMath.max(order,     (((cache == null )&&(__CLR4_4_1a5a5lb90p6ar.R.iget(383)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(384)==0&false))? 0 : cache[0].length);
        __CLR4_4_1a5a5lb90p6ar.R.inc(385);final DSCompiler[][] newCache = new DSCompiler[maxParameters + 1][maxOrder + 1];

        __CLR4_4_1a5a5lb90p6ar.R.inc(386);if ((((cache != null)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(387)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(388)==0&false))) {{
            // preserve the already created compilers
            __CLR4_4_1a5a5lb90p6ar.R.inc(389);for (int i = 0; (((i < cache.length)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(390)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(391)==0&false)); ++i) {{
                __CLR4_4_1a5a5lb90p6ar.R.inc(392);System.arraycopy(cache[i], 0, newCache[i], 0, cache[i].length);
            }
        }}

        // create the array in increasing diagonal order
        }__CLR4_4_1a5a5lb90p6ar.R.inc(393);for (int diag = 0; (((diag <= parameters + order)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(394)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(395)==0&false)); ++diag) {{
            __CLR4_4_1a5a5lb90p6ar.R.inc(396);for (int o = FastMath.max(0, diag - parameters); (((o <= FastMath.min(order, diag))&&(__CLR4_4_1a5a5lb90p6ar.R.iget(397)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(398)==0&false)); ++o) {{
                __CLR4_4_1a5a5lb90p6ar.R.inc(399);final int p = diag - o;
                __CLR4_4_1a5a5lb90p6ar.R.inc(400);if ((((newCache[p][o] == null)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(401)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(402)==0&false))) {{
                    __CLR4_4_1a5a5lb90p6ar.R.inc(403);final DSCompiler valueCompiler      = ((((p == 0) )&&(__CLR4_4_1a5a5lb90p6ar.R.iget(404)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(405)==0&false))? null : newCache[p - 1][o];
                    __CLR4_4_1a5a5lb90p6ar.R.inc(406);final DSCompiler derivativeCompiler = ((((o == 0) )&&(__CLR4_4_1a5a5lb90p6ar.R.iget(407)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(408)==0&false))? null : newCache[p][o - 1];
                    __CLR4_4_1a5a5lb90p6ar.R.inc(409);newCache[p][o] = new DSCompiler(p, o, valueCompiler, derivativeCompiler);
                }
            }}
        }}

        // atomically reset the cached compilers array
        }__CLR4_4_1a5a5lb90p6ar.R.inc(410);compilers.compareAndSet(cache, newCache);

        __CLR4_4_1a5a5lb90p6ar.R.inc(411);return newCache[parameters][order];

    }finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Compile the sizes array.
     * @param parameters number of free parameters
     * @param order derivation order
     * @param valueCompiler compiler for the value part
     * @return sizes array
     */
    private static int[][] compileSizes(final int parameters, final int order,
                                        final DSCompiler valueCompiler) {try{__CLR4_4_1a5a5lb90p6ar.R.inc(412);

        __CLR4_4_1a5a5lb90p6ar.R.inc(413);final int[][] sizes = new int[parameters + 1][order + 1];
        __CLR4_4_1a5a5lb90p6ar.R.inc(414);if ((((parameters == 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(415)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(416)==0&false))) {{
            __CLR4_4_1a5a5lb90p6ar.R.inc(417);Arrays.fill(sizes[0], 1);
        } }else {{
            __CLR4_4_1a5a5lb90p6ar.R.inc(418);System.arraycopy(valueCompiler.sizes, 0, sizes, 0, parameters);
            __CLR4_4_1a5a5lb90p6ar.R.inc(419);sizes[parameters][0] = 1;
            __CLR4_4_1a5a5lb90p6ar.R.inc(420);for (int i = 0; (((i < order)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(421)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(422)==0&false)); ++i) {{
                __CLR4_4_1a5a5lb90p6ar.R.inc(423);sizes[parameters][i + 1] = sizes[parameters][i] + sizes[parameters - 1][i + 1];
            }
        }}

        }__CLR4_4_1a5a5lb90p6ar.R.inc(424);return sizes;

    }finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Compile the derivatives indirection array.
     * @param parameters number of free parameters
     * @param order derivation order
     * @param valueCompiler compiler for the value part
     * @param derivativeCompiler compiler for the derivative part
     * @return derivatives indirection array
     */
    private static int[][] compileDerivativesIndirection(final int parameters, final int order,
                                                      final DSCompiler valueCompiler,
                                                      final DSCompiler derivativeCompiler) {try{__CLR4_4_1a5a5lb90p6ar.R.inc(425);

        __CLR4_4_1a5a5lb90p6ar.R.inc(426);if ((((parameters == 0 || order == 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(427)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(428)==0&false))) {{
            __CLR4_4_1a5a5lb90p6ar.R.inc(429);return new int[1][parameters];
        }

        }__CLR4_4_1a5a5lb90p6ar.R.inc(430);final int vSize = valueCompiler.derivativesIndirection.length;
        __CLR4_4_1a5a5lb90p6ar.R.inc(431);final int dSize = derivativeCompiler.derivativesIndirection.length;
        __CLR4_4_1a5a5lb90p6ar.R.inc(432);final int[][] derivativesIndirection = new int[vSize + dSize][parameters];

        // set up the indices for the value part
        __CLR4_4_1a5a5lb90p6ar.R.inc(433);for (int i = 0; (((i < vSize)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(434)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(435)==0&false)); ++i) {{
            // copy the first indices, the last one remaining set to 0
            __CLR4_4_1a5a5lb90p6ar.R.inc(436);System.arraycopy(valueCompiler.derivativesIndirection[i], 0,
                             derivativesIndirection[i], 0,
                             parameters - 1);
        }

        // set up the indices for the derivative part
        }__CLR4_4_1a5a5lb90p6ar.R.inc(437);for (int i = 0; (((i < dSize)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(438)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(439)==0&false)); ++i) {{

            // copy the indices
            __CLR4_4_1a5a5lb90p6ar.R.inc(440);System.arraycopy(derivativeCompiler.derivativesIndirection[i], 0,
                             derivativesIndirection[vSize + i], 0,
                             parameters);

            // increment the derivation order for the last parameter
            __CLR4_4_1a5a5lb90p6ar.R.inc(441);derivativesIndirection[vSize + i][parameters - 1]++;

        }

        }__CLR4_4_1a5a5lb90p6ar.R.inc(442);return derivativesIndirection;

    }finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Compile the lower derivatives indirection array.
     * <p>
     * This indirection array contains the indices of all elements
     * except derivatives for last derivation order.
     * </p>
     * @param parameters number of free parameters
     * @param order derivation order
     * @param valueCompiler compiler for the value part
     * @param derivativeCompiler compiler for the derivative part
     * @return lower derivatives indirection array
     */
    private static int[] compileLowerIndirection(final int parameters, final int order,
                                              final DSCompiler valueCompiler,
                                              final DSCompiler derivativeCompiler) {try{__CLR4_4_1a5a5lb90p6ar.R.inc(443);

        __CLR4_4_1a5a5lb90p6ar.R.inc(444);if ((((parameters == 0 || order <= 1)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(445)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(446)==0&false))) {{
            __CLR4_4_1a5a5lb90p6ar.R.inc(447);return new int[] { 0 };
        }

        // this is an implementation of definition 6 in Dan Kalman's paper.
        }__CLR4_4_1a5a5lb90p6ar.R.inc(448);final int vSize = valueCompiler.lowerIndirection.length;
        __CLR4_4_1a5a5lb90p6ar.R.inc(449);final int dSize = derivativeCompiler.lowerIndirection.length;
        __CLR4_4_1a5a5lb90p6ar.R.inc(450);final int[] lowerIndirection = new int[vSize + dSize];
        __CLR4_4_1a5a5lb90p6ar.R.inc(451);System.arraycopy(valueCompiler.lowerIndirection, 0, lowerIndirection, 0, vSize);
        __CLR4_4_1a5a5lb90p6ar.R.inc(452);for (int i = 0; (((i < dSize)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(453)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(454)==0&false)); ++i) {{
            __CLR4_4_1a5a5lb90p6ar.R.inc(455);lowerIndirection[vSize + i] = valueCompiler.getSize() + derivativeCompiler.lowerIndirection[i];
        }

        }__CLR4_4_1a5a5lb90p6ar.R.inc(456);return lowerIndirection;

    }finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Compile the multiplication indirection array.
     * <p>
     * This indirection array contains the indices of all pairs of elements
     * involved when computing a multiplication. This allows a straightforward
     * loop-based multiplication (see {@link #multiply(double[], int, double[], int, double[], int)}).
     * </p>
     * @param parameters number of free parameters
     * @param order derivation order
     * @param valueCompiler compiler for the value part
     * @param derivativeCompiler compiler for the derivative part
     * @param lowerIndirection lower derivatives indirection array
     * @return multiplication indirection array
     */
    private static int[][][] compileMultiplicationIndirection(final int parameters, final int order,
                                                           final DSCompiler valueCompiler,
                                                           final DSCompiler derivativeCompiler,
                                                           final int[] lowerIndirection) {try{__CLR4_4_1a5a5lb90p6ar.R.inc(457);

        __CLR4_4_1a5a5lb90p6ar.R.inc(458);if (((((parameters == 0) || (order == 0))&&(__CLR4_4_1a5a5lb90p6ar.R.iget(459)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(460)==0&false))) {{
            __CLR4_4_1a5a5lb90p6ar.R.inc(461);return new int[][][] { { { 1, 0, 0 } } };
        }

        // this is an implementation of definition 3 in Dan Kalman's paper.
        }__CLR4_4_1a5a5lb90p6ar.R.inc(462);final int vSize = valueCompiler.multIndirection.length;
        __CLR4_4_1a5a5lb90p6ar.R.inc(463);final int dSize = derivativeCompiler.multIndirection.length;
        __CLR4_4_1a5a5lb90p6ar.R.inc(464);final int[][][] multIndirection = new int[vSize + dSize][][];

        __CLR4_4_1a5a5lb90p6ar.R.inc(465);System.arraycopy(valueCompiler.multIndirection, 0, multIndirection, 0, vSize);

        __CLR4_4_1a5a5lb90p6ar.R.inc(466);for (int i = 0; (((i < dSize)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(467)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(468)==0&false)); ++i) {{
            __CLR4_4_1a5a5lb90p6ar.R.inc(469);final int[][] dRow = derivativeCompiler.multIndirection[i];
            __CLR4_4_1a5a5lb90p6ar.R.inc(470);List<int[]> row = new ArrayList<int[]>(dRow.length * 2);
            __CLR4_4_1a5a5lb90p6ar.R.inc(471);for (int j = 0; (((j < dRow.length)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(472)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(473)==0&false)); ++j) {{
                __CLR4_4_1a5a5lb90p6ar.R.inc(474);row.add(new int[] { dRow[j][0], lowerIndirection[dRow[j][1]], vSize + dRow[j][2] });
                __CLR4_4_1a5a5lb90p6ar.R.inc(475);row.add(new int[] { dRow[j][0], vSize + dRow[j][1], lowerIndirection[dRow[j][2]] });
            }

            // combine terms with similar derivation orders
            }__CLR4_4_1a5a5lb90p6ar.R.inc(476);final List<int[]> combined = new ArrayList<int[]>(row.size());
            __CLR4_4_1a5a5lb90p6ar.R.inc(477);for (int j = 0; (((j < row.size())&&(__CLR4_4_1a5a5lb90p6ar.R.iget(478)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(479)==0&false)); ++j) {{
                __CLR4_4_1a5a5lb90p6ar.R.inc(480);final int[] termJ = row.get(j);
                __CLR4_4_1a5a5lb90p6ar.R.inc(481);if ((((termJ[0] > 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(482)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(483)==0&false))) {{
                    __CLR4_4_1a5a5lb90p6ar.R.inc(484);for (int k = j + 1; (((k < row.size())&&(__CLR4_4_1a5a5lb90p6ar.R.iget(485)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(486)==0&false)); ++k) {{
                        __CLR4_4_1a5a5lb90p6ar.R.inc(487);final int[] termK = row.get(k);
                        __CLR4_4_1a5a5lb90p6ar.R.inc(488);if ((((termJ[1] == termK[1] && termJ[2] == termK[2])&&(__CLR4_4_1a5a5lb90p6ar.R.iget(489)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(490)==0&false))) {{
                            // combine termJ and termK
                            __CLR4_4_1a5a5lb90p6ar.R.inc(491);termJ[0] += termK[0];
                            // make sure we will skip termK later on in the outer loop
                            __CLR4_4_1a5a5lb90p6ar.R.inc(492);termK[0] = 0;
                        }
                    }}
                    }__CLR4_4_1a5a5lb90p6ar.R.inc(493);combined.add(termJ);
                }
            }}

            }__CLR4_4_1a5a5lb90p6ar.R.inc(494);multIndirection[vSize + i] = combined.toArray(new int[combined.size()][]);

        }

        }__CLR4_4_1a5a5lb90p6ar.R.inc(495);return multIndirection;

    }finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Compile the function composition indirection array.
     * <p>
     * This indirection array contains the indices of all sets of elements
     * involved when computing a composition. This allows a straightforward
     * loop-based composition (see {@link #compose(double[], int, double[], double[], int)}).
     * </p>
     * @param parameters number of free parameters
     * @param order derivation order
     * @param valueCompiler compiler for the value part
     * @param derivativeCompiler compiler for the derivative part
     * @param sizes sizes array
     * @param derivativesIndirection derivatives indirection array
     * @return multiplication indirection array
     * @throws NumberIsTooLargeException if order is too large
     */
    private static int[][][] compileCompositionIndirection(final int parameters, final int order,
                                                           final DSCompiler valueCompiler,
                                                           final DSCompiler derivativeCompiler,
                                                           final int[][] sizes,
                                                           final int[][] derivativesIndirection)
       throws NumberIsTooLargeException {try{__CLR4_4_1a5a5lb90p6ar.R.inc(496);

        __CLR4_4_1a5a5lb90p6ar.R.inc(497);if (((((parameters == 0) || (order == 0))&&(__CLR4_4_1a5a5lb90p6ar.R.iget(498)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(499)==0&false))) {{
            __CLR4_4_1a5a5lb90p6ar.R.inc(500);return new int[][][] { { { 1, 0 } } };
        }

        }__CLR4_4_1a5a5lb90p6ar.R.inc(501);final int vSize = valueCompiler.compIndirection.length;
        __CLR4_4_1a5a5lb90p6ar.R.inc(502);final int dSize = derivativeCompiler.compIndirection.length;
        __CLR4_4_1a5a5lb90p6ar.R.inc(503);final int[][][] compIndirection = new int[vSize + dSize][][];

        // the composition rules from the value part can be reused as is
        __CLR4_4_1a5a5lb90p6ar.R.inc(504);System.arraycopy(valueCompiler.compIndirection, 0, compIndirection, 0, vSize);

        // the composition rules for the derivative part are deduced by
        // differentiation the rules from the underlying compiler once
        // with respect to the parameter this compiler handles and the
        // underlying one did not handle
        __CLR4_4_1a5a5lb90p6ar.R.inc(505);for (int i = 0; (((i < dSize)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(506)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(507)==0&false)); ++i) {{
            __CLR4_4_1a5a5lb90p6ar.R.inc(508);List<int[]> row = new ArrayList<int[]>();
            __CLR4_4_1a5a5lb90p6ar.R.inc(509);for (int[] term : derivativeCompiler.compIndirection[i]) {{

                // handle term p * f_k(g(x)) * g_l1(x) * g_l2(x) * ... * g_lp(x)

                // derive the first factor in the term: f_k with respect to new parameter
                __CLR4_4_1a5a5lb90p6ar.R.inc(510);int[] derivedTermF = new int[term.length + 1];
                __CLR4_4_1a5a5lb90p6ar.R.inc(511);derivedTermF[0] = term[0];     // p
                __CLR4_4_1a5a5lb90p6ar.R.inc(512);derivedTermF[1] = term[1] + 1; // f_(k+1)
                __CLR4_4_1a5a5lb90p6ar.R.inc(513);int[] orders = new int[parameters];
                __CLR4_4_1a5a5lb90p6ar.R.inc(514);orders[parameters - 1] = 1;
                __CLR4_4_1a5a5lb90p6ar.R.inc(515);derivedTermF[term.length] = getPartialDerivativeIndex(parameters, order, sizes, orders);  // g_1
                __CLR4_4_1a5a5lb90p6ar.R.inc(516);for (int j = 2; (((j < term.length)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(517)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(518)==0&false)); ++j) {{
                    // convert the indices as the mapping for the current order
                    // is different from the mapping with one less order
                    __CLR4_4_1a5a5lb90p6ar.R.inc(519);derivedTermF[j] = convertIndex(term[j], parameters,
                                                   derivativeCompiler.derivativesIndirection,
                                                   parameters, order, sizes);
                }
                }__CLR4_4_1a5a5lb90p6ar.R.inc(520);Arrays.sort(derivedTermF, 2, derivedTermF.length);
                __CLR4_4_1a5a5lb90p6ar.R.inc(521);row.add(derivedTermF);

                // derive the various g_l
                __CLR4_4_1a5a5lb90p6ar.R.inc(522);for (int l = 2; (((l < term.length)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(523)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(524)==0&false)); ++l) {{
                    __CLR4_4_1a5a5lb90p6ar.R.inc(525);int[] derivedTermG = new int[term.length];
                    __CLR4_4_1a5a5lb90p6ar.R.inc(526);derivedTermG[0] = term[0];
                    __CLR4_4_1a5a5lb90p6ar.R.inc(527);derivedTermG[1] = term[1];
                    __CLR4_4_1a5a5lb90p6ar.R.inc(528);for (int j = 2; (((j < term.length)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(529)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(530)==0&false)); ++j) {{
                        // convert the indices as the mapping for the current order
                        // is different from the mapping with one less order
                        __CLR4_4_1a5a5lb90p6ar.R.inc(531);derivedTermG[j] = convertIndex(term[j], parameters,
                                                       derivativeCompiler.derivativesIndirection,
                                                       parameters, order, sizes);
                        __CLR4_4_1a5a5lb90p6ar.R.inc(532);if ((((j == l)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(533)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(534)==0&false))) {{
                            // derive this term
                            __CLR4_4_1a5a5lb90p6ar.R.inc(535);System.arraycopy(derivativesIndirection[derivedTermG[j]], 0, orders, 0, parameters);
                            __CLR4_4_1a5a5lb90p6ar.R.inc(536);orders[parameters - 1]++;
                            __CLR4_4_1a5a5lb90p6ar.R.inc(537);derivedTermG[j] = getPartialDerivativeIndex(parameters, order, sizes, orders);
                        }
                    }}
                    }__CLR4_4_1a5a5lb90p6ar.R.inc(538);Arrays.sort(derivedTermG, 2, derivedTermG.length);
                    __CLR4_4_1a5a5lb90p6ar.R.inc(539);row.add(derivedTermG);
                }

            }}

            // combine terms with similar derivation orders
            }__CLR4_4_1a5a5lb90p6ar.R.inc(540);final List<int[]> combined = new ArrayList<int[]>(row.size());
            __CLR4_4_1a5a5lb90p6ar.R.inc(541);for (int j = 0; (((j < row.size())&&(__CLR4_4_1a5a5lb90p6ar.R.iget(542)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(543)==0&false)); ++j) {{
                __CLR4_4_1a5a5lb90p6ar.R.inc(544);final int[] termJ = row.get(j);
                __CLR4_4_1a5a5lb90p6ar.R.inc(545);if ((((termJ[0] > 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(546)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(547)==0&false))) {{
                    __CLR4_4_1a5a5lb90p6ar.R.inc(548);for (int k = j + 1; (((k < row.size())&&(__CLR4_4_1a5a5lb90p6ar.R.iget(549)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(550)==0&false)); ++k) {{
                        __CLR4_4_1a5a5lb90p6ar.R.inc(551);final int[] termK = row.get(k);
                        __CLR4_4_1a5a5lb90p6ar.R.inc(552);boolean equals = termJ.length == termK.length;
                        __CLR4_4_1a5a5lb90p6ar.R.inc(553);for (int l = 1; (((equals && l < termJ.length)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(554)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(555)==0&false)); ++l) {{
                            __CLR4_4_1a5a5lb90p6ar.R.inc(556);equals &= termJ[l] == termK[l];
                        }
                        }__CLR4_4_1a5a5lb90p6ar.R.inc(557);if ((((equals)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(558)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(559)==0&false))) {{
                            // combine termJ and termK
                            __CLR4_4_1a5a5lb90p6ar.R.inc(560);termJ[0] += termK[0];
                            // make sure we will skip termK later on in the outer loop
                            __CLR4_4_1a5a5lb90p6ar.R.inc(561);termK[0] = 0;
                        }
                    }}
                    }__CLR4_4_1a5a5lb90p6ar.R.inc(562);combined.add(termJ);
                }
            }}

            }__CLR4_4_1a5a5lb90p6ar.R.inc(563);compIndirection[vSize + i] = combined.toArray(new int[combined.size()][]);

        }

        }__CLR4_4_1a5a5lb90p6ar.R.inc(564);return compIndirection;

    }finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Get the index of a partial derivative in the array.
     * <p>
     * If all orders are set to 0, then the 0<sup>th</sup> order derivative
     * is returned, which is the value of the function.
     * </p>
     * <p>The indices of derivatives are between 0 and {@link #getSize() getSize()} - 1.
     * Their specific order is fixed for a given compiler, but otherwise not
     * publicly specified. There are however some simple cases which have guaranteed
     * indices:
     * </p>
     * <ul>
     *   <li>the index of 0<sup>th</sup> order derivative is always 0</li>
     *   <li>if there is only 1 {@link #getFreeParameters() free parameter}, then the
     *   derivatives are sorted in increasing derivation order (i.e. f at index 0, df/dp
     *   at index 1, d<sup>2</sup>f/dp<sup>2</sup> at index 2 ...
     *   d<sup>k</sup>f/dp<sup>k</sup> at index k),</li>
     *   <li>if the {@link #getOrder() derivation order} is 1, then the derivatives
     *   are sorted in increasing free parameter order (i.e. f at index 0, df/dx<sub>1</sub>
     *   at index 1, df/dx<sub>2</sub> at index 2 ... df/dx<sub>k</sub> at index k),</li>
     *   <li>all other cases are not publicly specified</li>
     * </ul>
     * <p>
     * This method is the inverse of method {@link #getPartialDerivativeOrders(int)}
     * </p>
     * @param orders derivation orders with respect to each parameter
     * @return index of the partial derivative
     * @exception DimensionMismatchException if the numbers of parameters does not
     * match the instance
     * @exception NumberIsTooLargeException if sum of derivation orders is larger
     * than the instance limits
     * @see #getPartialDerivativeOrders(int)
     */
    public int getPartialDerivativeIndex(final int ... orders)
            throws DimensionMismatchException, NumberIsTooLargeException {try{__CLR4_4_1a5a5lb90p6ar.R.inc(565);

        // safety check
        __CLR4_4_1a5a5lb90p6ar.R.inc(566);if ((((orders.length != getFreeParameters())&&(__CLR4_4_1a5a5lb90p6ar.R.iget(567)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(568)==0&false))) {{
            __CLR4_4_1a5a5lb90p6ar.R.inc(569);throw new DimensionMismatchException(orders.length, getFreeParameters());
        }

        }__CLR4_4_1a5a5lb90p6ar.R.inc(570);return getPartialDerivativeIndex(parameters, order, sizes, orders);

    }finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Get the index of a partial derivative in an array.
     * @param parameters number of free parameters
     * @param order derivation order
     * @param sizes sizes array
     * @param orders derivation orders with respect to each parameter
     * (the lenght of this array must match the number of parameters)
     * @return index of the partial derivative
     * @exception NumberIsTooLargeException if sum of derivation orders is larger
     * than the instance limits
     */
    private static int getPartialDerivativeIndex(final int parameters, final int order,
                                                 final int[][] sizes, final int ... orders)
        throws NumberIsTooLargeException {try{__CLR4_4_1a5a5lb90p6ar.R.inc(571);

        // the value is obtained by diving into the recursive Dan Kalman's structure
        // this is theorem 2 of his paper, with recursion replaced by iteration
        __CLR4_4_1a5a5lb90p6ar.R.inc(572);int index     = 0;
        __CLR4_4_1a5a5lb90p6ar.R.inc(573);int m         = order;
        __CLR4_4_1a5a5lb90p6ar.R.inc(574);int ordersSum = 0;
        __CLR4_4_1a5a5lb90p6ar.R.inc(575);for (int i = parameters - 1; (((i >= 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(576)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(577)==0&false)); --i) {{

            // derivative order for current free parameter
            __CLR4_4_1a5a5lb90p6ar.R.inc(578);int derivativeOrder = orders[i];

            // safety check
            __CLR4_4_1a5a5lb90p6ar.R.inc(579);ordersSum += derivativeOrder;
            __CLR4_4_1a5a5lb90p6ar.R.inc(580);if ((((ordersSum > order)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(581)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(582)==0&false))) {{
                __CLR4_4_1a5a5lb90p6ar.R.inc(583);throw new NumberIsTooLargeException(ordersSum, order, true);
            }

            }__CLR4_4_1a5a5lb90p6ar.R.inc(584);while ((((derivativeOrder-- > 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(585)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(586)==0&false))) {{
                // as long as we differentiate according to current free parameter,
                // we have to skip the value part and dive into the derivative part
                // so we add the size of the value part to the base index
                __CLR4_4_1a5a5lb90p6ar.R.inc(587);index += sizes[i][m--];
            }

        }}

        }__CLR4_4_1a5a5lb90p6ar.R.inc(588);return index;

    }finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Convert an index from one (parameters, order) structure to another.
     * @param index index of a partial derivative in source derivative structure
     * @param srcP number of free parameters in source derivative structure
     * @param srcDerivativesIndirection derivatives indirection array for the source
     * derivative structure
     * @param destP number of free parameters in destination derivative structure
     * @param destO derivation order in destination derivative structure
     * @param destSizes sizes array for the destination derivative structure
     * @return index of the partial derivative with the <em>same</em> characteristics
     * in destination derivative structure
     * @throws NumberIsTooLargeException if order is too large
     */
    private static int convertIndex(final int index,
                                    final int srcP, final int[][] srcDerivativesIndirection,
                                    final int destP, final int destO, final int[][] destSizes)
        throws NumberIsTooLargeException {try{__CLR4_4_1a5a5lb90p6ar.R.inc(589);
        __CLR4_4_1a5a5lb90p6ar.R.inc(590);int[] orders = new int[destP];
        __CLR4_4_1a5a5lb90p6ar.R.inc(591);System.arraycopy(srcDerivativesIndirection[index], 0, orders, 0, FastMath.min(srcP, destP));
        __CLR4_4_1a5a5lb90p6ar.R.inc(592);return getPartialDerivativeIndex(destP, destO, destSizes, orders);
    }finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Get the derivation orders for a specific index in the array.
     * <p>
     * This method is the inverse of {@link #getPartialDerivativeIndex(int...)}.
     * </p>
     * @param index of the partial derivative
     * @return orders derivation orders with respect to each parameter
     * @see #getPartialDerivativeIndex(int...)
     */
    public int[] getPartialDerivativeOrders(final int index) {try{__CLR4_4_1a5a5lb90p6ar.R.inc(593);
        __CLR4_4_1a5a5lb90p6ar.R.inc(594);return derivativesIndirection[index];
    }finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Get the number of free parameters.
     * @return number of free parameters
     */
    public int getFreeParameters() {try{__CLR4_4_1a5a5lb90p6ar.R.inc(595);
        __CLR4_4_1a5a5lb90p6ar.R.inc(596);return parameters;
    }finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Get the derivation order.
     * @return derivation order
     */
    public int getOrder() {try{__CLR4_4_1a5a5lb90p6ar.R.inc(597);
        __CLR4_4_1a5a5lb90p6ar.R.inc(598);return order;
    }finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Get the array size required for holding partial derivatives data.
     * <p>
     * This number includes the single 0 order derivative element, which is
     * guaranteed to be stored in the first element of the array.
     * </p>
     * @return array size required for holding partial derivatives data
     */
    public int getSize() {try{__CLR4_4_1a5a5lb90p6ar.R.inc(599);
        __CLR4_4_1a5a5lb90p6ar.R.inc(600);return sizes[parameters][order];
    }finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Compute linear combination.
     * The derivative structure built will be a1 * ds1 + a2 * ds2
     * @param a1 first scale factor
     * @param c1 first base (unscaled) component
     * @param offset1 offset of first operand in its array
     * @param a2 second scale factor
     * @param c2 second base (unscaled) component
     * @param offset2 offset of second operand in its array
     * @param result array where result must be stored (it may be
     * one of the input arrays)
     * @param resultOffset offset of the result in its array
     */
    public void linearCombination(final double a1, final double[] c1, final int offset1,
                                  final double a2, final double[] c2, final int offset2,
                                  final double[] result, final int resultOffset) {try{__CLR4_4_1a5a5lb90p6ar.R.inc(601);
        __CLR4_4_1a5a5lb90p6ar.R.inc(602);for (int i = 0; (((i < getSize())&&(__CLR4_4_1a5a5lb90p6ar.R.iget(603)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(604)==0&false)); ++i) {{
            __CLR4_4_1a5a5lb90p6ar.R.inc(605);result[resultOffset + i] =
                    MathArrays.linearCombination(a1, c1[offset1 + i], a2, c2[offset2 + i]);
        }
    }}finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Compute linear combination.
     * The derivative structure built will be a1 * ds1 + a2 * ds2 + a3 * ds3 + a4 * ds4
     * @param a1 first scale factor
     * @param c1 first base (unscaled) component
     * @param offset1 offset of first operand in its array
     * @param a2 second scale factor
     * @param c2 second base (unscaled) component
     * @param offset2 offset of second operand in its array
     * @param a3 third scale factor
     * @param c3 third base (unscaled) component
     * @param offset3 offset of third operand in its array
     * @param result array where result must be stored (it may be
     * one of the input arrays)
     * @param resultOffset offset of the result in its array
     */
    public void linearCombination(final double a1, final double[] c1, final int offset1,
                                  final double a2, final double[] c2, final int offset2,
                                  final double a3, final double[] c3, final int offset3,
                                  final double[] result, final int resultOffset) {try{__CLR4_4_1a5a5lb90p6ar.R.inc(606);
        __CLR4_4_1a5a5lb90p6ar.R.inc(607);for (int i = 0; (((i < getSize())&&(__CLR4_4_1a5a5lb90p6ar.R.iget(608)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(609)==0&false)); ++i) {{
            __CLR4_4_1a5a5lb90p6ar.R.inc(610);result[resultOffset + i] =
                    MathArrays.linearCombination(a1, c1[offset1 + i],
                                                 a2, c2[offset2 + i],
                                                 a3, c3[offset3 + i]);
        }
    }}finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Compute linear combination.
     * The derivative structure built will be a1 * ds1 + a2 * ds2 + a3 * ds3 + a4 * ds4
     * @param a1 first scale factor
     * @param c1 first base (unscaled) component
     * @param offset1 offset of first operand in its array
     * @param a2 second scale factor
     * @param c2 second base (unscaled) component
     * @param offset2 offset of second operand in its array
     * @param a3 third scale factor
     * @param c3 third base (unscaled) component
     * @param offset3 offset of third operand in its array
     * @param a4 fourth scale factor
     * @param c4 fourth base (unscaled) component
     * @param offset4 offset of fourth operand in its array
     * @param result array where result must be stored (it may be
     * one of the input arrays)
     * @param resultOffset offset of the result in its array
     */
    public void linearCombination(final double a1, final double[] c1, final int offset1,
                                  final double a2, final double[] c2, final int offset2,
                                  final double a3, final double[] c3, final int offset3,
                                  final double a4, final double[] c4, final int offset4,
                                  final double[] result, final int resultOffset) {try{__CLR4_4_1a5a5lb90p6ar.R.inc(611);
        __CLR4_4_1a5a5lb90p6ar.R.inc(612);for (int i = 0; (((i < getSize())&&(__CLR4_4_1a5a5lb90p6ar.R.iget(613)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(614)==0&false)); ++i) {{
            __CLR4_4_1a5a5lb90p6ar.R.inc(615);result[resultOffset + i] =
                    MathArrays.linearCombination(a1, c1[offset1 + i],
                                                 a2, c2[offset2 + i],
                                                 a3, c3[offset3 + i],
                                                 a4, c4[offset4 + i]);
        }
    }}finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Perform addition of two derivative structures.
     * @param lhs array holding left hand side of addition
     * @param lhsOffset offset of the left hand side in its array
     * @param rhs array right hand side of addition
     * @param rhsOffset offset of the right hand side in its array
     * @param result array where result must be stored (it may be
     * one of the input arrays)
     * @param resultOffset offset of the result in its array
     */
    public void add(final double[] lhs, final int lhsOffset,
                    final double[] rhs, final int rhsOffset,
                    final double[] result, final int resultOffset) {try{__CLR4_4_1a5a5lb90p6ar.R.inc(616);
        __CLR4_4_1a5a5lb90p6ar.R.inc(617);for (int i = 0; (((i < getSize())&&(__CLR4_4_1a5a5lb90p6ar.R.iget(618)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(619)==0&false)); ++i) {{
            __CLR4_4_1a5a5lb90p6ar.R.inc(620);result[resultOffset + i] = lhs[lhsOffset + i] + rhs[rhsOffset + i];
        }
    }}finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}
    /** Perform subtraction of two derivative structures.
     * @param lhs array holding left hand side of subtraction
     * @param lhsOffset offset of the left hand side in its array
     * @param rhs array right hand side of subtraction
     * @param rhsOffset offset of the right hand side in its array
     * @param result array where result must be stored (it may be
     * one of the input arrays)
     * @param resultOffset offset of the result in its array
     */
    public void subtract(final double[] lhs, final int lhsOffset,
                         final double[] rhs, final int rhsOffset,
                         final double[] result, final int resultOffset) {try{__CLR4_4_1a5a5lb90p6ar.R.inc(621);
        __CLR4_4_1a5a5lb90p6ar.R.inc(622);for (int i = 0; (((i < getSize())&&(__CLR4_4_1a5a5lb90p6ar.R.iget(623)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(624)==0&false)); ++i) {{
            __CLR4_4_1a5a5lb90p6ar.R.inc(625);result[resultOffset + i] = lhs[lhsOffset + i] - rhs[rhsOffset + i];
        }
    }}finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Perform multiplication of two derivative structures.
     * @param lhs array holding left hand side of multiplication
     * @param lhsOffset offset of the left hand side in its array
     * @param rhs array right hand side of multiplication
     * @param rhsOffset offset of the right hand side in its array
     * @param result array where result must be stored (for
     * multiplication the result array <em>cannot</em> be one of
     * the input arrays)
     * @param resultOffset offset of the result in its array
     */
    public void multiply(final double[] lhs, final int lhsOffset,
                         final double[] rhs, final int rhsOffset,
                         final double[] result, final int resultOffset) {try{__CLR4_4_1a5a5lb90p6ar.R.inc(626);
        __CLR4_4_1a5a5lb90p6ar.R.inc(627);for (int i = 0; (((i < multIndirection.length)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(628)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(629)==0&false)); ++i) {{
            __CLR4_4_1a5a5lb90p6ar.R.inc(630);final int[][] mappingI = multIndirection[i];
            __CLR4_4_1a5a5lb90p6ar.R.inc(631);double r = 0;
            __CLR4_4_1a5a5lb90p6ar.R.inc(632);for (int j = 0; (((j < mappingI.length)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(633)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(634)==0&false)); ++j) {{
                __CLR4_4_1a5a5lb90p6ar.R.inc(635);r += mappingI[j][0] *
                     lhs[lhsOffset + mappingI[j][1]] *
                     rhs[rhsOffset + mappingI[j][2]];
            }
            }__CLR4_4_1a5a5lb90p6ar.R.inc(636);result[resultOffset + i] = r;
        }
    }}finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Perform division of two derivative structures.
     * @param lhs array holding left hand side of division
     * @param lhsOffset offset of the left hand side in its array
     * @param rhs array right hand side of division
     * @param rhsOffset offset of the right hand side in its array
     * @param result array where result must be stored (for
     * division the result array <em>cannot</em> be one of
     * the input arrays)
     * @param resultOffset offset of the result in its array
     */
    public void divide(final double[] lhs, final int lhsOffset,
                       final double[] rhs, final int rhsOffset,
                       final double[] result, final int resultOffset) {try{__CLR4_4_1a5a5lb90p6ar.R.inc(637);
        __CLR4_4_1a5a5lb90p6ar.R.inc(638);final double[] reciprocal = new double[getSize()];
        __CLR4_4_1a5a5lb90p6ar.R.inc(639);pow(rhs, lhsOffset, -1, reciprocal, 0);
        __CLR4_4_1a5a5lb90p6ar.R.inc(640);multiply(lhs, lhsOffset, reciprocal, 0, result, resultOffset);
    }finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Perform remainder of two derivative structures.
     * @param lhs array holding left hand side of remainder
     * @param lhsOffset offset of the left hand side in its array
     * @param rhs array right hand side of remainder
     * @param rhsOffset offset of the right hand side in its array
     * @param result array where result must be stored (it may be
     * one of the input arrays)
     * @param resultOffset offset of the result in its array
     */
    public void remainder(final double[] lhs, final int lhsOffset,
                          final double[] rhs, final int rhsOffset,
                          final double[] result, final int resultOffset) {try{__CLR4_4_1a5a5lb90p6ar.R.inc(641);

        // compute k such that lhs % rhs = lhs - k rhs
        __CLR4_4_1a5a5lb90p6ar.R.inc(642);final double rem = FastMath.IEEEremainder(lhs[lhsOffset], rhs[rhsOffset]);
        __CLR4_4_1a5a5lb90p6ar.R.inc(643);final double k   = FastMath.rint((lhs[lhsOffset] - rem) / rhs[rhsOffset]);

        // set up value
        __CLR4_4_1a5a5lb90p6ar.R.inc(644);result[resultOffset] = rem;

        // set up partial derivatives
        __CLR4_4_1a5a5lb90p6ar.R.inc(645);for (int i = 1; (((i < getSize())&&(__CLR4_4_1a5a5lb90p6ar.R.iget(646)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(647)==0&false)); ++i) {{
            __CLR4_4_1a5a5lb90p6ar.R.inc(648);result[resultOffset + i] = lhs[lhsOffset + i] - k * rhs[rhsOffset + i];
        }

    }}finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Compute power of a double to a derivative structure.
     * @param a number to exponentiate
     * @param operand array holding the power
     * @param operandOffset offset of the power in its array
     * @param result array where result must be stored (for
     * power the result array <em>cannot</em> be the input
     * array)
     * @param resultOffset offset of the result in its array
     * @since 3.3
     */
    public void pow(final double a,
                    final double[] operand, final int operandOffset,
                    final double[] result, final int resultOffset) {try{__CLR4_4_1a5a5lb90p6ar.R.inc(649);

        // create the function value and derivatives
        // [a^x, ln(a) a^x, ln(a)^2 a^x,, ln(a)^3 a^x, ... ]
        __CLR4_4_1a5a5lb90p6ar.R.inc(650);final double[] function = new double[1 + order];
        __CLR4_4_1a5a5lb90p6ar.R.inc(651);if ((((a == 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(652)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(653)==0&false))) {{
            __CLR4_4_1a5a5lb90p6ar.R.inc(654);if ((((operand[operandOffset] == 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(655)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(656)==0&false))) {{
                __CLR4_4_1a5a5lb90p6ar.R.inc(657);function[0] = 1;
                __CLR4_4_1a5a5lb90p6ar.R.inc(658);double infinity = Double.POSITIVE_INFINITY;
                __CLR4_4_1a5a5lb90p6ar.R.inc(659);for (int i = 1; (((i < function.length)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(660)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(661)==0&false)); ++i) {{
                    __CLR4_4_1a5a5lb90p6ar.R.inc(662);infinity = -infinity;
                    __CLR4_4_1a5a5lb90p6ar.R.inc(663);function[i] = infinity;
                }
            }} }else {__CLR4_4_1a5a5lb90p6ar.R.inc(664);if ((((operand[operandOffset] < 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(665)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(666)==0&false))) {{
                __CLR4_4_1a5a5lb90p6ar.R.inc(667);Arrays.fill(function, Double.NaN);
            }
        }}} }else {{
            __CLR4_4_1a5a5lb90p6ar.R.inc(668);function[0] = FastMath.pow(a, operand[operandOffset]);
            __CLR4_4_1a5a5lb90p6ar.R.inc(669);final double lnA = FastMath.log(a);
            __CLR4_4_1a5a5lb90p6ar.R.inc(670);for (int i = 1; (((i < function.length)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(671)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(672)==0&false)); ++i) {{
                __CLR4_4_1a5a5lb90p6ar.R.inc(673);function[i] = lnA * function[i - 1];
            }
        }}


        // apply function composition
        }__CLR4_4_1a5a5lb90p6ar.R.inc(674);compose(operand, operandOffset, function, result, resultOffset);

    }finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Compute power of a derivative structure.
     * @param operand array holding the operand
     * @param operandOffset offset of the operand in its array
     * @param p power to apply
     * @param result array where result must be stored (for
     * power the result array <em>cannot</em> be the input
     * array)
     * @param resultOffset offset of the result in its array
     */
    public void pow(final double[] operand, final int operandOffset, final double p,
                    final double[] result, final int resultOffset) {try{__CLR4_4_1a5a5lb90p6ar.R.inc(675);

        // create the function value and derivatives
        // [x^p, px^(p-1), p(p-1)x^(p-2), ... ]
        __CLR4_4_1a5a5lb90p6ar.R.inc(676);double[] function = new double[1 + order];
        __CLR4_4_1a5a5lb90p6ar.R.inc(677);double xk = FastMath.pow(operand[operandOffset], p - order);
        __CLR4_4_1a5a5lb90p6ar.R.inc(678);for (int i = order; (((i > 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(679)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(680)==0&false)); --i) {{
            __CLR4_4_1a5a5lb90p6ar.R.inc(681);function[i] = xk;
            __CLR4_4_1a5a5lb90p6ar.R.inc(682);xk *= operand[operandOffset];
        }
        }__CLR4_4_1a5a5lb90p6ar.R.inc(683);function[0] = xk;
        __CLR4_4_1a5a5lb90p6ar.R.inc(684);double coefficient = p;
        __CLR4_4_1a5a5lb90p6ar.R.inc(685);for (int i = 1; (((i <= order)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(686)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(687)==0&false)); ++i) {{
            __CLR4_4_1a5a5lb90p6ar.R.inc(688);function[i] *= coefficient;
            __CLR4_4_1a5a5lb90p6ar.R.inc(689);coefficient *= p - i;
        }

        // apply function composition
        }__CLR4_4_1a5a5lb90p6ar.R.inc(690);compose(operand, operandOffset, function, result, resultOffset);

    }finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Compute integer power of a derivative structure.
     * @param operand array holding the operand
     * @param operandOffset offset of the operand in its array
     * @param n power to apply
     * @param result array where result must be stored (for
     * power the result array <em>cannot</em> be the input
     * array)
     * @param resultOffset offset of the result in its array
     */
    public void pow(final double[] operand, final int operandOffset, final int n,
                    final double[] result, final int resultOffset) {try{__CLR4_4_1a5a5lb90p6ar.R.inc(691);

        __CLR4_4_1a5a5lb90p6ar.R.inc(692);if ((((n == 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(693)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(694)==0&false))) {{
            // special case, x^0 = 1 for all x
            __CLR4_4_1a5a5lb90p6ar.R.inc(695);result[resultOffset] = 1.0;
            __CLR4_4_1a5a5lb90p6ar.R.inc(696);Arrays.fill(result, resultOffset + 1, resultOffset + getSize(), 0);
            __CLR4_4_1a5a5lb90p6ar.R.inc(697);return;
        }

        // create the power function value and derivatives
        // [x^n, nx^(n-1), n(n-1)x^(n-2), ... ]
        }__CLR4_4_1a5a5lb90p6ar.R.inc(698);double[] function = new double[1 + order];

        __CLR4_4_1a5a5lb90p6ar.R.inc(699);if ((((n > 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(700)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(701)==0&false))) {{
            // strictly positive power
            __CLR4_4_1a5a5lb90p6ar.R.inc(702);final int maxOrder = FastMath.min(order, n);
            __CLR4_4_1a5a5lb90p6ar.R.inc(703);double xk = FastMath.pow(operand[operandOffset], n - maxOrder);
            __CLR4_4_1a5a5lb90p6ar.R.inc(704);for (int i = maxOrder; (((i > 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(705)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(706)==0&false)); --i) {{
                __CLR4_4_1a5a5lb90p6ar.R.inc(707);function[i] = xk;
                __CLR4_4_1a5a5lb90p6ar.R.inc(708);xk *= operand[operandOffset];
            }
            }__CLR4_4_1a5a5lb90p6ar.R.inc(709);function[0] = xk;
        } }else {{
            // strictly negative power
            __CLR4_4_1a5a5lb90p6ar.R.inc(710);final double inv = 1.0 / operand[operandOffset];
            __CLR4_4_1a5a5lb90p6ar.R.inc(711);double xk = FastMath.pow(inv, -n);
            __CLR4_4_1a5a5lb90p6ar.R.inc(712);for (int i = 0; (((i <= order)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(713)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(714)==0&false)); ++i) {{
                __CLR4_4_1a5a5lb90p6ar.R.inc(715);function[i] = xk;
                __CLR4_4_1a5a5lb90p6ar.R.inc(716);xk *= inv;
            }
        }}

        }__CLR4_4_1a5a5lb90p6ar.R.inc(717);double coefficient = n;
        __CLR4_4_1a5a5lb90p6ar.R.inc(718);for (int i = 1; (((i <= order)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(719)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(720)==0&false)); ++i) {{
            __CLR4_4_1a5a5lb90p6ar.R.inc(721);function[i] *= coefficient;
            __CLR4_4_1a5a5lb90p6ar.R.inc(722);coefficient *= n - i;
        }

        // apply function composition
        }__CLR4_4_1a5a5lb90p6ar.R.inc(723);compose(operand, operandOffset, function, result, resultOffset);

    }finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Compute power of a derivative structure.
     * @param x array holding the base
     * @param xOffset offset of the base in its array
     * @param y array holding the exponent
     * @param yOffset offset of the exponent in its array
     * @param result array where result must be stored (for
     * power the result array <em>cannot</em> be the input
     * array)
     * @param resultOffset offset of the result in its array
     */
    public void pow(final double[] x, final int xOffset,
                    final double[] y, final int yOffset,
                    final double[] result, final int resultOffset) {try{__CLR4_4_1a5a5lb90p6ar.R.inc(724);
        __CLR4_4_1a5a5lb90p6ar.R.inc(725);final double[] logX = new double[getSize()];
        __CLR4_4_1a5a5lb90p6ar.R.inc(726);log(x, xOffset, logX, 0);
        __CLR4_4_1a5a5lb90p6ar.R.inc(727);final double[] yLogX = new double[getSize()];
        __CLR4_4_1a5a5lb90p6ar.R.inc(728);multiply(logX, 0, y, yOffset, yLogX, 0);
        __CLR4_4_1a5a5lb90p6ar.R.inc(729);exp(yLogX, 0, result, resultOffset);
    }finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Compute n<sup>th</sup> root of a derivative structure.
     * @param operand array holding the operand
     * @param operandOffset offset of the operand in its array
     * @param n order of the root
     * @param result array where result must be stored (for
     * n<sup>th</sup> root the result array <em>cannot</em> be the input
     * array)
     * @param resultOffset offset of the result in its array
     */
    public void rootN(final double[] operand, final int operandOffset, final int n,
                      final double[] result, final int resultOffset) {try{__CLR4_4_1a5a5lb90p6ar.R.inc(730);

        // create the function value and derivatives
        // [x^(1/n), (1/n)x^((1/n)-1), (1-n)/n^2x^((1/n)-2), ... ]
        __CLR4_4_1a5a5lb90p6ar.R.inc(731);double[] function = new double[1 + order];
        __CLR4_4_1a5a5lb90p6ar.R.inc(732);double xk;
        __CLR4_4_1a5a5lb90p6ar.R.inc(733);if ((((n == 2)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(734)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(735)==0&false))) {{
            __CLR4_4_1a5a5lb90p6ar.R.inc(736);function[0] = FastMath.sqrt(operand[operandOffset]);
            __CLR4_4_1a5a5lb90p6ar.R.inc(737);xk          = 0.5 / function[0];
        } }else {__CLR4_4_1a5a5lb90p6ar.R.inc(738);if ((((n == 3)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(739)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(740)==0&false))) {{
            __CLR4_4_1a5a5lb90p6ar.R.inc(741);function[0] = FastMath.cbrt(operand[operandOffset]);
            __CLR4_4_1a5a5lb90p6ar.R.inc(742);xk          = 1.0 / (3.0 * function[0] * function[0]);
        } }else {{
            __CLR4_4_1a5a5lb90p6ar.R.inc(743);function[0] = FastMath.pow(operand[operandOffset], 1.0 / n);
            __CLR4_4_1a5a5lb90p6ar.R.inc(744);xk          = 1.0 / (n * FastMath.pow(function[0], n - 1));
        }
        }}__CLR4_4_1a5a5lb90p6ar.R.inc(745);final double nReciprocal = 1.0 / n;
        __CLR4_4_1a5a5lb90p6ar.R.inc(746);final double xReciprocal = 1.0 / operand[operandOffset];
        __CLR4_4_1a5a5lb90p6ar.R.inc(747);for (int i = 1; (((i <= order)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(748)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(749)==0&false)); ++i) {{
            __CLR4_4_1a5a5lb90p6ar.R.inc(750);function[i] = xk;
            __CLR4_4_1a5a5lb90p6ar.R.inc(751);xk *= xReciprocal * (nReciprocal - i);
        }

        // apply function composition
        }__CLR4_4_1a5a5lb90p6ar.R.inc(752);compose(operand, operandOffset, function, result, resultOffset);

    }finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Compute exponential of a derivative structure.
     * @param operand array holding the operand
     * @param operandOffset offset of the operand in its array
     * @param result array where result must be stored (for
     * exponential the result array <em>cannot</em> be the input
     * array)
     * @param resultOffset offset of the result in its array
     */
    public void exp(final double[] operand, final int operandOffset,
                    final double[] result, final int resultOffset) {try{__CLR4_4_1a5a5lb90p6ar.R.inc(753);

        // create the function value and derivatives
        __CLR4_4_1a5a5lb90p6ar.R.inc(754);double[] function = new double[1 + order];
        __CLR4_4_1a5a5lb90p6ar.R.inc(755);Arrays.fill(function, FastMath.exp(operand[operandOffset]));

        // apply function composition
        __CLR4_4_1a5a5lb90p6ar.R.inc(756);compose(operand, operandOffset, function, result, resultOffset);

    }finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Compute exp(x) - 1 of a derivative structure.
     * @param operand array holding the operand
     * @param operandOffset offset of the operand in its array
     * @param result array where result must be stored (for
     * exponential the result array <em>cannot</em> be the input
     * array)
     * @param resultOffset offset of the result in its array
     */
    public void expm1(final double[] operand, final int operandOffset,
                      final double[] result, final int resultOffset) {try{__CLR4_4_1a5a5lb90p6ar.R.inc(757);

        // create the function value and derivatives
        __CLR4_4_1a5a5lb90p6ar.R.inc(758);double[] function = new double[1 + order];
        __CLR4_4_1a5a5lb90p6ar.R.inc(759);function[0] = FastMath.expm1(operand[operandOffset]);
        __CLR4_4_1a5a5lb90p6ar.R.inc(760);Arrays.fill(function, 1, 1 + order, FastMath.exp(operand[operandOffset]));

        // apply function composition
        __CLR4_4_1a5a5lb90p6ar.R.inc(761);compose(operand, operandOffset, function, result, resultOffset);

    }finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Compute natural logarithm of a derivative structure.
     * @param operand array holding the operand
     * @param operandOffset offset of the operand in its array
     * @param result array where result must be stored (for
     * logarithm the result array <em>cannot</em> be the input
     * array)
     * @param resultOffset offset of the result in its array
     */
    public void log(final double[] operand, final int operandOffset,
                    final double[] result, final int resultOffset) {try{__CLR4_4_1a5a5lb90p6ar.R.inc(762);

        // create the function value and derivatives
        __CLR4_4_1a5a5lb90p6ar.R.inc(763);double[] function = new double[1 + order];
        __CLR4_4_1a5a5lb90p6ar.R.inc(764);function[0] = FastMath.log(operand[operandOffset]);
        __CLR4_4_1a5a5lb90p6ar.R.inc(765);if ((((order > 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(766)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(767)==0&false))) {{
            __CLR4_4_1a5a5lb90p6ar.R.inc(768);double inv = 1.0 / operand[operandOffset];
            __CLR4_4_1a5a5lb90p6ar.R.inc(769);double xk  = inv;
            __CLR4_4_1a5a5lb90p6ar.R.inc(770);for (int i = 1; (((i <= order)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(771)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(772)==0&false)); ++i) {{
                __CLR4_4_1a5a5lb90p6ar.R.inc(773);function[i] = xk;
                __CLR4_4_1a5a5lb90p6ar.R.inc(774);xk *= -i * inv;
            }
        }}

        // apply function composition
        }__CLR4_4_1a5a5lb90p6ar.R.inc(775);compose(operand, operandOffset, function, result, resultOffset);

    }finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Computes shifted logarithm of a derivative structure.
     * @param operand array holding the operand
     * @param operandOffset offset of the operand in its array
     * @param result array where result must be stored (for
     * shifted logarithm the result array <em>cannot</em> be the input array)
     * @param resultOffset offset of the result in its array
     */
    public void log1p(final double[] operand, final int operandOffset,
                      final double[] result, final int resultOffset) {try{__CLR4_4_1a5a5lb90p6ar.R.inc(776);

        // create the function value and derivatives
        __CLR4_4_1a5a5lb90p6ar.R.inc(777);double[] function = new double[1 + order];
        __CLR4_4_1a5a5lb90p6ar.R.inc(778);function[0] = FastMath.log1p(operand[operandOffset]);
        __CLR4_4_1a5a5lb90p6ar.R.inc(779);if ((((order > 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(780)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(781)==0&false))) {{
            __CLR4_4_1a5a5lb90p6ar.R.inc(782);double inv = 1.0 / (1.0 + operand[operandOffset]);
            __CLR4_4_1a5a5lb90p6ar.R.inc(783);double xk  = inv;
            __CLR4_4_1a5a5lb90p6ar.R.inc(784);for (int i = 1; (((i <= order)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(785)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(786)==0&false)); ++i) {{
                __CLR4_4_1a5a5lb90p6ar.R.inc(787);function[i] = xk;
                __CLR4_4_1a5a5lb90p6ar.R.inc(788);xk *= -i * inv;
            }
        }}

        // apply function composition
        }__CLR4_4_1a5a5lb90p6ar.R.inc(789);compose(operand, operandOffset, function, result, resultOffset);

    }finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Computes base 10 logarithm of a derivative structure.
     * @param operand array holding the operand
     * @param operandOffset offset of the operand in its array
     * @param result array where result must be stored (for
     * base 10 logarithm the result array <em>cannot</em> be the input array)
     * @param resultOffset offset of the result in its array
     */
    public void log10(final double[] operand, final int operandOffset,
                      final double[] result, final int resultOffset) {try{__CLR4_4_1a5a5lb90p6ar.R.inc(790);

        // create the function value and derivatives
        __CLR4_4_1a5a5lb90p6ar.R.inc(791);double[] function = new double[1 + order];
        __CLR4_4_1a5a5lb90p6ar.R.inc(792);function[0] = FastMath.log10(operand[operandOffset]);
        __CLR4_4_1a5a5lb90p6ar.R.inc(793);if ((((order > 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(794)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(795)==0&false))) {{
            __CLR4_4_1a5a5lb90p6ar.R.inc(796);double inv = 1.0 / operand[operandOffset];
            __CLR4_4_1a5a5lb90p6ar.R.inc(797);double xk  = inv / FastMath.log(10.0);
            __CLR4_4_1a5a5lb90p6ar.R.inc(798);for (int i = 1; (((i <= order)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(799)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(800)==0&false)); ++i) {{
                __CLR4_4_1a5a5lb90p6ar.R.inc(801);function[i] = xk;
                __CLR4_4_1a5a5lb90p6ar.R.inc(802);xk *= -i * inv;
            }
        }}

        // apply function composition
        }__CLR4_4_1a5a5lb90p6ar.R.inc(803);compose(operand, operandOffset, function, result, resultOffset);

    }finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Compute cosine of a derivative structure.
     * @param operand array holding the operand
     * @param operandOffset offset of the operand in its array
     * @param result array where result must be stored (for
     * cosine the result array <em>cannot</em> be the input
     * array)
     * @param resultOffset offset of the result in its array
     */
    public void cos(final double[] operand, final int operandOffset,
                    final double[] result, final int resultOffset) {try{__CLR4_4_1a5a5lb90p6ar.R.inc(804);

        // create the function value and derivatives
        __CLR4_4_1a5a5lb90p6ar.R.inc(805);double[] function = new double[1 + order];
        __CLR4_4_1a5a5lb90p6ar.R.inc(806);function[0] = FastMath.cos(operand[operandOffset]);
        __CLR4_4_1a5a5lb90p6ar.R.inc(807);if ((((order > 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(808)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(809)==0&false))) {{
            __CLR4_4_1a5a5lb90p6ar.R.inc(810);function[1] = -FastMath.sin(operand[operandOffset]);
            __CLR4_4_1a5a5lb90p6ar.R.inc(811);for (int i = 2; (((i <= order)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(812)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(813)==0&false)); ++i) {{
                __CLR4_4_1a5a5lb90p6ar.R.inc(814);function[i] = -function[i - 2];
            }
        }}

        // apply function composition
        }__CLR4_4_1a5a5lb90p6ar.R.inc(815);compose(operand, operandOffset, function, result, resultOffset);

    }finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Compute sine of a derivative structure.
     * @param operand array holding the operand
     * @param operandOffset offset of the operand in its array
     * @param result array where result must be stored (for
     * sine the result array <em>cannot</em> be the input
     * array)
     * @param resultOffset offset of the result in its array
     */
    public void sin(final double[] operand, final int operandOffset,
                    final double[] result, final int resultOffset) {try{__CLR4_4_1a5a5lb90p6ar.R.inc(816);

        // create the function value and derivatives
        __CLR4_4_1a5a5lb90p6ar.R.inc(817);double[] function = new double[1 + order];
        __CLR4_4_1a5a5lb90p6ar.R.inc(818);function[0] = FastMath.sin(operand[operandOffset]);
        __CLR4_4_1a5a5lb90p6ar.R.inc(819);if ((((order > 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(820)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(821)==0&false))) {{
            __CLR4_4_1a5a5lb90p6ar.R.inc(822);function[1] = FastMath.cos(operand[operandOffset]);
            __CLR4_4_1a5a5lb90p6ar.R.inc(823);for (int i = 2; (((i <= order)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(824)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(825)==0&false)); ++i) {{
                __CLR4_4_1a5a5lb90p6ar.R.inc(826);function[i] = -function[i - 2];
            }
        }}

        // apply function composition
        }__CLR4_4_1a5a5lb90p6ar.R.inc(827);compose(operand, operandOffset, function, result, resultOffset);

    }finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Compute tangent of a derivative structure.
     * @param operand array holding the operand
     * @param operandOffset offset of the operand in its array
     * @param result array where result must be stored (for
     * tangent the result array <em>cannot</em> be the input
     * array)
     * @param resultOffset offset of the result in its array
     */
    public void tan(final double[] operand, final int operandOffset,
                    final double[] result, final int resultOffset) {try{__CLR4_4_1a5a5lb90p6ar.R.inc(828);

        // create the function value and derivatives
        __CLR4_4_1a5a5lb90p6ar.R.inc(829);final double[] function = new double[1 + order];
        __CLR4_4_1a5a5lb90p6ar.R.inc(830);final double t = FastMath.tan(operand[operandOffset]);
        __CLR4_4_1a5a5lb90p6ar.R.inc(831);function[0] = t;

        __CLR4_4_1a5a5lb90p6ar.R.inc(832);if ((((order > 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(833)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(834)==0&false))) {{

            // the nth order derivative of tan has the form:
            // dn(tan(x)/dxn = P_n(tan(x))
            // where P_n(t) is a degree n+1 polynomial with same parity as n+1
            // P_0(t) = t, P_1(t) = 1 + t^2, P_2(t) = 2 t (1 + t^2) ...
            // the general recurrence relation for P_n is:
            // P_n(x) = (1+t^2) P_(n-1)'(t)
            // as per polynomial parity, we can store coefficients of both P_(n-1) and P_n in the same array
            __CLR4_4_1a5a5lb90p6ar.R.inc(835);final double[] p = new double[order + 2];
            __CLR4_4_1a5a5lb90p6ar.R.inc(836);p[1] = 1;
            __CLR4_4_1a5a5lb90p6ar.R.inc(837);final double t2 = t * t;
            __CLR4_4_1a5a5lb90p6ar.R.inc(838);for (int n = 1; (((n <= order)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(839)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(840)==0&false)); ++n) {{

                // update and evaluate polynomial P_n(t)
                __CLR4_4_1a5a5lb90p6ar.R.inc(841);double v = 0;
                __CLR4_4_1a5a5lb90p6ar.R.inc(842);p[n + 1] = n * p[n];
                __CLR4_4_1a5a5lb90p6ar.R.inc(843);for (int k = n + 1; (((k >= 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(844)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(845)==0&false)); k -= 2) {{
                    __CLR4_4_1a5a5lb90p6ar.R.inc(846);v = v * t2 + p[k];
                    __CLR4_4_1a5a5lb90p6ar.R.inc(847);if ((((k > 2)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(848)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(849)==0&false))) {{
                        __CLR4_4_1a5a5lb90p6ar.R.inc(850);p[k - 2] = (k - 1) * p[k - 1] + (k - 3) * p[k - 3];
                    } }else {__CLR4_4_1a5a5lb90p6ar.R.inc(851);if ((((k == 2)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(852)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(853)==0&false))) {{
                        __CLR4_4_1a5a5lb90p6ar.R.inc(854);p[0] = p[1];
                    }
                }}}
                }__CLR4_4_1a5a5lb90p6ar.R.inc(855);if (((((n & 0x1) == 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(856)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(857)==0&false))) {{
                    __CLR4_4_1a5a5lb90p6ar.R.inc(858);v *= t;
                }

                }__CLR4_4_1a5a5lb90p6ar.R.inc(859);function[n] = v;

            }
        }}

        // apply function composition
        }__CLR4_4_1a5a5lb90p6ar.R.inc(860);compose(operand, operandOffset, function, result, resultOffset);

    }finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Compute arc cosine of a derivative structure.
     * @param operand array holding the operand
     * @param operandOffset offset of the operand in its array
     * @param result array where result must be stored (for
     * arc cosine the result array <em>cannot</em> be the input
     * array)
     * @param resultOffset offset of the result in its array
     */
    public void acos(final double[] operand, final int operandOffset,
                    final double[] result, final int resultOffset) {try{__CLR4_4_1a5a5lb90p6ar.R.inc(861);

        // create the function value and derivatives
        __CLR4_4_1a5a5lb90p6ar.R.inc(862);double[] function = new double[1 + order];
        __CLR4_4_1a5a5lb90p6ar.R.inc(863);final double x = operand[operandOffset];
        __CLR4_4_1a5a5lb90p6ar.R.inc(864);function[0] = FastMath.acos(x);
        __CLR4_4_1a5a5lb90p6ar.R.inc(865);if ((((order > 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(866)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(867)==0&false))) {{
            // the nth order derivative of acos has the form:
            // dn(acos(x)/dxn = P_n(x) / [1 - x^2]^((2n-1)/2)
            // where P_n(x) is a degree n-1 polynomial with same parity as n-1
            // P_1(x) = -1, P_2(x) = -x, P_3(x) = -2x^2 - 1 ...
            // the general recurrence relation for P_n is:
            // P_n(x) = (1-x^2) P_(n-1)'(x) + (2n-3) x P_(n-1)(x)
            // as per polynomial parity, we can store coefficients of both P_(n-1) and P_n in the same array
            __CLR4_4_1a5a5lb90p6ar.R.inc(868);final double[] p = new double[order];
            __CLR4_4_1a5a5lb90p6ar.R.inc(869);p[0] = -1;
            __CLR4_4_1a5a5lb90p6ar.R.inc(870);final double x2    = x * x;
            __CLR4_4_1a5a5lb90p6ar.R.inc(871);final double f     = 1.0 / (1 - x2);
            __CLR4_4_1a5a5lb90p6ar.R.inc(872);double coeff = FastMath.sqrt(f);
            __CLR4_4_1a5a5lb90p6ar.R.inc(873);function[1] = coeff * p[0];
            __CLR4_4_1a5a5lb90p6ar.R.inc(874);for (int n = 2; (((n <= order)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(875)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(876)==0&false)); ++n) {{

                // update and evaluate polynomial P_n(x)
                __CLR4_4_1a5a5lb90p6ar.R.inc(877);double v = 0;
                __CLR4_4_1a5a5lb90p6ar.R.inc(878);p[n - 1] = (n - 1) * p[n - 2];
                __CLR4_4_1a5a5lb90p6ar.R.inc(879);for (int k = n - 1; (((k >= 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(880)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(881)==0&false)); k -= 2) {{
                    __CLR4_4_1a5a5lb90p6ar.R.inc(882);v = v * x2 + p[k];
                    __CLR4_4_1a5a5lb90p6ar.R.inc(883);if ((((k > 2)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(884)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(885)==0&false))) {{
                        __CLR4_4_1a5a5lb90p6ar.R.inc(886);p[k - 2] = (k - 1) * p[k - 1] + (2 * n - k) * p[k - 3];
                    } }else {__CLR4_4_1a5a5lb90p6ar.R.inc(887);if ((((k == 2)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(888)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(889)==0&false))) {{
                        __CLR4_4_1a5a5lb90p6ar.R.inc(890);p[0] = p[1];
                    }
                }}}
                }__CLR4_4_1a5a5lb90p6ar.R.inc(891);if (((((n & 0x1) == 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(892)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(893)==0&false))) {{
                    __CLR4_4_1a5a5lb90p6ar.R.inc(894);v *= x;
                }

                }__CLR4_4_1a5a5lb90p6ar.R.inc(895);coeff *= f;
                __CLR4_4_1a5a5lb90p6ar.R.inc(896);function[n] = coeff * v;

            }
        }}

        // apply function composition
        }__CLR4_4_1a5a5lb90p6ar.R.inc(897);compose(operand, operandOffset, function, result, resultOffset);

    }finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Compute arc sine of a derivative structure.
     * @param operand array holding the operand
     * @param operandOffset offset of the operand in its array
     * @param result array where result must be stored (for
     * arc sine the result array <em>cannot</em> be the input
     * array)
     * @param resultOffset offset of the result in its array
     */
    public void asin(final double[] operand, final int operandOffset,
                    final double[] result, final int resultOffset) {try{__CLR4_4_1a5a5lb90p6ar.R.inc(898);

        // create the function value and derivatives
        __CLR4_4_1a5a5lb90p6ar.R.inc(899);double[] function = new double[1 + order];
        __CLR4_4_1a5a5lb90p6ar.R.inc(900);final double x = operand[operandOffset];
        __CLR4_4_1a5a5lb90p6ar.R.inc(901);function[0] = FastMath.asin(x);
        __CLR4_4_1a5a5lb90p6ar.R.inc(902);if ((((order > 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(903)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(904)==0&false))) {{
            // the nth order derivative of asin has the form:
            // dn(asin(x)/dxn = P_n(x) / [1 - x^2]^((2n-1)/2)
            // where P_n(x) is a degree n-1 polynomial with same parity as n-1
            // P_1(x) = 1, P_2(x) = x, P_3(x) = 2x^2 + 1 ...
            // the general recurrence relation for P_n is:
            // P_n(x) = (1-x^2) P_(n-1)'(x) + (2n-3) x P_(n-1)(x)
            // as per polynomial parity, we can store coefficients of both P_(n-1) and P_n in the same array
            __CLR4_4_1a5a5lb90p6ar.R.inc(905);final double[] p = new double[order];
            __CLR4_4_1a5a5lb90p6ar.R.inc(906);p[0] = 1;
            __CLR4_4_1a5a5lb90p6ar.R.inc(907);final double x2    = x * x;
            __CLR4_4_1a5a5lb90p6ar.R.inc(908);final double f     = 1.0 / (1 - x2);
            __CLR4_4_1a5a5lb90p6ar.R.inc(909);double coeff = FastMath.sqrt(f);
            __CLR4_4_1a5a5lb90p6ar.R.inc(910);function[1] = coeff * p[0];
            __CLR4_4_1a5a5lb90p6ar.R.inc(911);for (int n = 2; (((n <= order)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(912)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(913)==0&false)); ++n) {{

                // update and evaluate polynomial P_n(x)
                __CLR4_4_1a5a5lb90p6ar.R.inc(914);double v = 0;
                __CLR4_4_1a5a5lb90p6ar.R.inc(915);p[n - 1] = (n - 1) * p[n - 2];
                __CLR4_4_1a5a5lb90p6ar.R.inc(916);for (int k = n - 1; (((k >= 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(917)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(918)==0&false)); k -= 2) {{
                    __CLR4_4_1a5a5lb90p6ar.R.inc(919);v = v * x2 + p[k];
                    __CLR4_4_1a5a5lb90p6ar.R.inc(920);if ((((k > 2)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(921)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(922)==0&false))) {{
                        __CLR4_4_1a5a5lb90p6ar.R.inc(923);p[k - 2] = (k - 1) * p[k - 1] + (2 * n - k) * p[k - 3];
                    } }else {__CLR4_4_1a5a5lb90p6ar.R.inc(924);if ((((k == 2)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(925)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(926)==0&false))) {{
                        __CLR4_4_1a5a5lb90p6ar.R.inc(927);p[0] = p[1];
                    }
                }}}
                }__CLR4_4_1a5a5lb90p6ar.R.inc(928);if (((((n & 0x1) == 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(929)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(930)==0&false))) {{
                    __CLR4_4_1a5a5lb90p6ar.R.inc(931);v *= x;
                }

                }__CLR4_4_1a5a5lb90p6ar.R.inc(932);coeff *= f;
                __CLR4_4_1a5a5lb90p6ar.R.inc(933);function[n] = coeff * v;

            }
        }}

        // apply function composition
        }__CLR4_4_1a5a5lb90p6ar.R.inc(934);compose(operand, operandOffset, function, result, resultOffset);

    }finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Compute arc tangent of a derivative structure.
     * @param operand array holding the operand
     * @param operandOffset offset of the operand in its array
     * @param result array where result must be stored (for
     * arc tangent the result array <em>cannot</em> be the input
     * array)
     * @param resultOffset offset of the result in its array
     */
    public void atan(final double[] operand, final int operandOffset,
                     final double[] result, final int resultOffset) {try{__CLR4_4_1a5a5lb90p6ar.R.inc(935);

        // create the function value and derivatives
        __CLR4_4_1a5a5lb90p6ar.R.inc(936);double[] function = new double[1 + order];
        __CLR4_4_1a5a5lb90p6ar.R.inc(937);final double x = operand[operandOffset];
        __CLR4_4_1a5a5lb90p6ar.R.inc(938);function[0] = FastMath.atan(x);
        __CLR4_4_1a5a5lb90p6ar.R.inc(939);if ((((order > 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(940)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(941)==0&false))) {{
            // the nth order derivative of atan has the form:
            // dn(atan(x)/dxn = Q_n(x) / (1 + x^2)^n
            // where Q_n(x) is a degree n-1 polynomial with same parity as n-1
            // Q_1(x) = 1, Q_2(x) = -2x, Q_3(x) = 6x^2 - 2 ...
            // the general recurrence relation for Q_n is:
            // Q_n(x) = (1+x^2) Q_(n-1)'(x) - 2(n-1) x Q_(n-1)(x)
            // as per polynomial parity, we can store coefficients of both Q_(n-1) and Q_n in the same array
            __CLR4_4_1a5a5lb90p6ar.R.inc(942);final double[] q = new double[order];
            __CLR4_4_1a5a5lb90p6ar.R.inc(943);q[0] = 1;
            __CLR4_4_1a5a5lb90p6ar.R.inc(944);final double x2    = x * x;
            __CLR4_4_1a5a5lb90p6ar.R.inc(945);final double f     = 1.0 / (1 + x2);
            __CLR4_4_1a5a5lb90p6ar.R.inc(946);double coeff = f;
            __CLR4_4_1a5a5lb90p6ar.R.inc(947);function[1] = coeff * q[0];
            __CLR4_4_1a5a5lb90p6ar.R.inc(948);for (int n = 2; (((n <= order)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(949)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(950)==0&false)); ++n) {{

                // update and evaluate polynomial Q_n(x)
                __CLR4_4_1a5a5lb90p6ar.R.inc(951);double v = 0;
                __CLR4_4_1a5a5lb90p6ar.R.inc(952);q[n - 1] = -n * q[n - 2];
                __CLR4_4_1a5a5lb90p6ar.R.inc(953);for (int k = n - 1; (((k >= 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(954)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(955)==0&false)); k -= 2) {{
                    __CLR4_4_1a5a5lb90p6ar.R.inc(956);v = v * x2 + q[k];
                    __CLR4_4_1a5a5lb90p6ar.R.inc(957);if ((((k > 2)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(958)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(959)==0&false))) {{
                        __CLR4_4_1a5a5lb90p6ar.R.inc(960);q[k - 2] = (k - 1) * q[k - 1] + (k - 1 - 2 * n) * q[k - 3];
                    } }else {__CLR4_4_1a5a5lb90p6ar.R.inc(961);if ((((k == 2)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(962)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(963)==0&false))) {{
                        __CLR4_4_1a5a5lb90p6ar.R.inc(964);q[0] = q[1];
                    }
                }}}
                }__CLR4_4_1a5a5lb90p6ar.R.inc(965);if (((((n & 0x1) == 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(966)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(967)==0&false))) {{
                    __CLR4_4_1a5a5lb90p6ar.R.inc(968);v *= x;
                }

                }__CLR4_4_1a5a5lb90p6ar.R.inc(969);coeff *= f;
                __CLR4_4_1a5a5lb90p6ar.R.inc(970);function[n] = coeff * v;

            }
        }}

        // apply function composition
        }__CLR4_4_1a5a5lb90p6ar.R.inc(971);compose(operand, operandOffset, function, result, resultOffset);

    }finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Compute two arguments arc tangent of a derivative structure.
     * @param y array holding the first operand
     * @param yOffset offset of the first operand in its array
     * @param x array holding the second operand
     * @param xOffset offset of the second operand in its array
     * @param result array where result must be stored (for
     * two arguments arc tangent the result array <em>cannot</em>
     * be the input array)
     * @param resultOffset offset of the result in its array
     */
    public void atan2(final double[] y, final int yOffset,
                      final double[] x, final int xOffset,
                      final double[] result, final int resultOffset) {try{__CLR4_4_1a5a5lb90p6ar.R.inc(972);

        // compute r = sqrt(x^2+y^2)
        __CLR4_4_1a5a5lb90p6ar.R.inc(973);double[] tmp1 = new double[getSize()];
        __CLR4_4_1a5a5lb90p6ar.R.inc(974);multiply(x, xOffset, x, xOffset, tmp1, 0);      // x^2
        __CLR4_4_1a5a5lb90p6ar.R.inc(975);double[] tmp2 = new double[getSize()];
        __CLR4_4_1a5a5lb90p6ar.R.inc(976);multiply(y, yOffset, y, yOffset, tmp2, 0);      // y^2
        __CLR4_4_1a5a5lb90p6ar.R.inc(977);add(tmp1, 0, tmp2, 0, tmp2, 0);                 // x^2 + y^2
        __CLR4_4_1a5a5lb90p6ar.R.inc(978);rootN(tmp2, 0, 2, tmp1, 0);                     // r = sqrt(x^2 + y^2)

        __CLR4_4_1a5a5lb90p6ar.R.inc(979);if ((((x[xOffset] >= 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(980)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(981)==0&false))) {{

            // compute atan2(y, x) = 2 atan(y / (r + x))
            __CLR4_4_1a5a5lb90p6ar.R.inc(982);add(tmp1, 0, x, xOffset, tmp2, 0);          // r + x
            __CLR4_4_1a5a5lb90p6ar.R.inc(983);divide(y, yOffset, tmp2, 0, tmp1, 0);       // y /(r + x)
            __CLR4_4_1a5a5lb90p6ar.R.inc(984);atan(tmp1, 0, tmp2, 0);                     // atan(y / (r + x))
            __CLR4_4_1a5a5lb90p6ar.R.inc(985);for (int i = 0; (((i < tmp2.length)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(986)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(987)==0&false)); ++i) {{
                __CLR4_4_1a5a5lb90p6ar.R.inc(988);result[resultOffset + i] = 2 * tmp2[i]; // 2 * atan(y / (r + x))
            }

        }} }else {{

            // compute atan2(y, x) = +/- pi - 2 atan(y / (r - x))
            __CLR4_4_1a5a5lb90p6ar.R.inc(989);subtract(tmp1, 0, x, xOffset, tmp2, 0);     // r - x
            __CLR4_4_1a5a5lb90p6ar.R.inc(990);divide(y, yOffset, tmp2, 0, tmp1, 0);       // y /(r - x)
            __CLR4_4_1a5a5lb90p6ar.R.inc(991);atan(tmp1, 0, tmp2, 0);                     // atan(y / (r - x))
            __CLR4_4_1a5a5lb90p6ar.R.inc(992);result[resultOffset] =
                    (((((tmp2[0] <= 0) )&&(__CLR4_4_1a5a5lb90p6ar.R.iget(993)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(994)==0&false))? -FastMath.PI : FastMath.PI) - 2 * tmp2[0]; // +/-pi - 2 * atan(y / (r - x))
            __CLR4_4_1a5a5lb90p6ar.R.inc(995);for (int i = 1; (((i < tmp2.length)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(996)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(997)==0&false)); ++i) {{
                __CLR4_4_1a5a5lb90p6ar.R.inc(998);result[resultOffset + i] = -2 * tmp2[i]; // +/-pi - 2 * atan(y / (r - x))
            }

        }}

        // fix value to take special cases (+0/+0, +0/-0, -0/+0, -0/-0, +/-infinity) correctly
        }__CLR4_4_1a5a5lb90p6ar.R.inc(999);result[resultOffset] = FastMath.atan2(y[yOffset], x[xOffset]);

    }finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Compute hyperbolic cosine of a derivative structure.
     * @param operand array holding the operand
     * @param operandOffset offset of the operand in its array
     * @param result array where result must be stored (for
     * hyperbolic cosine the result array <em>cannot</em> be the input
     * array)
     * @param resultOffset offset of the result in its array
     */
    public void cosh(final double[] operand, final int operandOffset,
                     final double[] result, final int resultOffset) {try{__CLR4_4_1a5a5lb90p6ar.R.inc(1000);

        // create the function value and derivatives
        __CLR4_4_1a5a5lb90p6ar.R.inc(1001);double[] function = new double[1 + order];
        __CLR4_4_1a5a5lb90p6ar.R.inc(1002);function[0] = FastMath.cosh(operand[operandOffset]);
        __CLR4_4_1a5a5lb90p6ar.R.inc(1003);if ((((order > 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(1004)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(1005)==0&false))) {{
            __CLR4_4_1a5a5lb90p6ar.R.inc(1006);function[1] = FastMath.sinh(operand[operandOffset]);
            __CLR4_4_1a5a5lb90p6ar.R.inc(1007);for (int i = 2; (((i <= order)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(1008)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(1009)==0&false)); ++i) {{
                __CLR4_4_1a5a5lb90p6ar.R.inc(1010);function[i] = function[i - 2];
            }
        }}

        // apply function composition
        }__CLR4_4_1a5a5lb90p6ar.R.inc(1011);compose(operand, operandOffset, function, result, resultOffset);

    }finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Compute hyperbolic sine of a derivative structure.
     * @param operand array holding the operand
     * @param operandOffset offset of the operand in its array
     * @param result array where result must be stored (for
     * hyperbolic sine the result array <em>cannot</em> be the input
     * array)
     * @param resultOffset offset of the result in its array
     */
    public void sinh(final double[] operand, final int operandOffset,
                     final double[] result, final int resultOffset) {try{__CLR4_4_1a5a5lb90p6ar.R.inc(1012);

        // create the function value and derivatives
        __CLR4_4_1a5a5lb90p6ar.R.inc(1013);double[] function = new double[1 + order];
        __CLR4_4_1a5a5lb90p6ar.R.inc(1014);function[0] = FastMath.sinh(operand[operandOffset]);
        __CLR4_4_1a5a5lb90p6ar.R.inc(1015);if ((((order > 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(1016)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(1017)==0&false))) {{
            __CLR4_4_1a5a5lb90p6ar.R.inc(1018);function[1] = FastMath.cosh(operand[operandOffset]);
            __CLR4_4_1a5a5lb90p6ar.R.inc(1019);for (int i = 2; (((i <= order)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(1020)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(1021)==0&false)); ++i) {{
                __CLR4_4_1a5a5lb90p6ar.R.inc(1022);function[i] = function[i - 2];
            }
        }}

        // apply function composition
        }__CLR4_4_1a5a5lb90p6ar.R.inc(1023);compose(operand, operandOffset, function, result, resultOffset);

    }finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Compute hyperbolic tangent of a derivative structure.
     * @param operand array holding the operand
     * @param operandOffset offset of the operand in its array
     * @param result array where result must be stored (for
     * hyperbolic tangent the result array <em>cannot</em> be the input
     * array)
     * @param resultOffset offset of the result in its array
     */
    public void tanh(final double[] operand, final int operandOffset,
                     final double[] result, final int resultOffset) {try{__CLR4_4_1a5a5lb90p6ar.R.inc(1024);

        // create the function value and derivatives
        __CLR4_4_1a5a5lb90p6ar.R.inc(1025);final double[] function = new double[1 + order];
        __CLR4_4_1a5a5lb90p6ar.R.inc(1026);final double t = FastMath.tanh(operand[operandOffset]);
        __CLR4_4_1a5a5lb90p6ar.R.inc(1027);function[0] = t;

        __CLR4_4_1a5a5lb90p6ar.R.inc(1028);if ((((order > 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(1029)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(1030)==0&false))) {{

            // the nth order derivative of tanh has the form:
            // dn(tanh(x)/dxn = P_n(tanh(x))
            // where P_n(t) is a degree n+1 polynomial with same parity as n+1
            // P_0(t) = t, P_1(t) = 1 - t^2, P_2(t) = -2 t (1 - t^2) ...
            // the general recurrence relation for P_n is:
            // P_n(x) = (1-t^2) P_(n-1)'(t)
            // as per polynomial parity, we can store coefficients of both P_(n-1) and P_n in the same array
            __CLR4_4_1a5a5lb90p6ar.R.inc(1031);final double[] p = new double[order + 2];
            __CLR4_4_1a5a5lb90p6ar.R.inc(1032);p[1] = 1;
            __CLR4_4_1a5a5lb90p6ar.R.inc(1033);final double t2 = t * t;
            __CLR4_4_1a5a5lb90p6ar.R.inc(1034);for (int n = 1; (((n <= order)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(1035)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(1036)==0&false)); ++n) {{

                // update and evaluate polynomial P_n(t)
                __CLR4_4_1a5a5lb90p6ar.R.inc(1037);double v = 0;
                __CLR4_4_1a5a5lb90p6ar.R.inc(1038);p[n + 1] = -n * p[n];
                __CLR4_4_1a5a5lb90p6ar.R.inc(1039);for (int k = n + 1; (((k >= 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(1040)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(1041)==0&false)); k -= 2) {{
                    __CLR4_4_1a5a5lb90p6ar.R.inc(1042);v = v * t2 + p[k];
                    __CLR4_4_1a5a5lb90p6ar.R.inc(1043);if ((((k > 2)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(1044)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(1045)==0&false))) {{
                        __CLR4_4_1a5a5lb90p6ar.R.inc(1046);p[k - 2] = (k - 1) * p[k - 1] - (k - 3) * p[k - 3];
                    } }else {__CLR4_4_1a5a5lb90p6ar.R.inc(1047);if ((((k == 2)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(1048)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(1049)==0&false))) {{
                        __CLR4_4_1a5a5lb90p6ar.R.inc(1050);p[0] = p[1];
                    }
                }}}
                }__CLR4_4_1a5a5lb90p6ar.R.inc(1051);if (((((n & 0x1) == 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(1052)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(1053)==0&false))) {{
                    __CLR4_4_1a5a5lb90p6ar.R.inc(1054);v *= t;
                }

                }__CLR4_4_1a5a5lb90p6ar.R.inc(1055);function[n] = v;

            }
        }}

        // apply function composition
        }__CLR4_4_1a5a5lb90p6ar.R.inc(1056);compose(operand, operandOffset, function, result, resultOffset);

    }finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Compute inverse hyperbolic cosine of a derivative structure.
     * @param operand array holding the operand
     * @param operandOffset offset of the operand in its array
     * @param result array where result must be stored (for
     * inverse hyperbolic cosine the result array <em>cannot</em> be the input
     * array)
     * @param resultOffset offset of the result in its array
     */
    public void acosh(final double[] operand, final int operandOffset,
                     final double[] result, final int resultOffset) {try{__CLR4_4_1a5a5lb90p6ar.R.inc(1057);

        // create the function value and derivatives
        __CLR4_4_1a5a5lb90p6ar.R.inc(1058);double[] function = new double[1 + order];
        __CLR4_4_1a5a5lb90p6ar.R.inc(1059);final double x = operand[operandOffset];
        __CLR4_4_1a5a5lb90p6ar.R.inc(1060);function[0] = FastMath.acosh(x);
        __CLR4_4_1a5a5lb90p6ar.R.inc(1061);if ((((order > 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(1062)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(1063)==0&false))) {{
            // the nth order derivative of acosh has the form:
            // dn(acosh(x)/dxn = P_n(x) / [x^2 - 1]^((2n-1)/2)
            // where P_n(x) is a degree n-1 polynomial with same parity as n-1
            // P_1(x) = 1, P_2(x) = -x, P_3(x) = 2x^2 + 1 ...
            // the general recurrence relation for P_n is:
            // P_n(x) = (x^2-1) P_(n-1)'(x) - (2n-3) x P_(n-1)(x)
            // as per polynomial parity, we can store coefficients of both P_(n-1) and P_n in the same array
            __CLR4_4_1a5a5lb90p6ar.R.inc(1064);final double[] p = new double[order];
            __CLR4_4_1a5a5lb90p6ar.R.inc(1065);p[0] = 1;
            __CLR4_4_1a5a5lb90p6ar.R.inc(1066);final double x2  = x * x;
            __CLR4_4_1a5a5lb90p6ar.R.inc(1067);final double f   = 1.0 / (x2 - 1);
            __CLR4_4_1a5a5lb90p6ar.R.inc(1068);double coeff = FastMath.sqrt(f);
            __CLR4_4_1a5a5lb90p6ar.R.inc(1069);function[1] = coeff * p[0];
            __CLR4_4_1a5a5lb90p6ar.R.inc(1070);for (int n = 2; (((n <= order)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(1071)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(1072)==0&false)); ++n) {{

                // update and evaluate polynomial P_n(x)
                __CLR4_4_1a5a5lb90p6ar.R.inc(1073);double v = 0;
                __CLR4_4_1a5a5lb90p6ar.R.inc(1074);p[n - 1] = (1 - n) * p[n - 2];
                __CLR4_4_1a5a5lb90p6ar.R.inc(1075);for (int k = n - 1; (((k >= 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(1076)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(1077)==0&false)); k -= 2) {{
                    __CLR4_4_1a5a5lb90p6ar.R.inc(1078);v = v * x2 + p[k];
                    __CLR4_4_1a5a5lb90p6ar.R.inc(1079);if ((((k > 2)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(1080)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(1081)==0&false))) {{
                        __CLR4_4_1a5a5lb90p6ar.R.inc(1082);p[k - 2] = (1 - k) * p[k - 1] + (k - 2 * n) * p[k - 3];
                    } }else {__CLR4_4_1a5a5lb90p6ar.R.inc(1083);if ((((k == 2)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(1084)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(1085)==0&false))) {{
                        __CLR4_4_1a5a5lb90p6ar.R.inc(1086);p[0] = -p[1];
                    }
                }}}
                }__CLR4_4_1a5a5lb90p6ar.R.inc(1087);if (((((n & 0x1) == 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(1088)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(1089)==0&false))) {{
                    __CLR4_4_1a5a5lb90p6ar.R.inc(1090);v *= x;
                }

                }__CLR4_4_1a5a5lb90p6ar.R.inc(1091);coeff *= f;
                __CLR4_4_1a5a5lb90p6ar.R.inc(1092);function[n] = coeff * v;

            }
        }}

        // apply function composition
        }__CLR4_4_1a5a5lb90p6ar.R.inc(1093);compose(operand, operandOffset, function, result, resultOffset);

    }finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Compute inverse hyperbolic sine of a derivative structure.
     * @param operand array holding the operand
     * @param operandOffset offset of the operand in its array
     * @param result array where result must be stored (for
     * inverse hyperbolic sine the result array <em>cannot</em> be the input
     * array)
     * @param resultOffset offset of the result in its array
     */
    public void asinh(final double[] operand, final int operandOffset,
                     final double[] result, final int resultOffset) {try{__CLR4_4_1a5a5lb90p6ar.R.inc(1094);

        // create the function value and derivatives
        __CLR4_4_1a5a5lb90p6ar.R.inc(1095);double[] function = new double[1 + order];
        __CLR4_4_1a5a5lb90p6ar.R.inc(1096);final double x = operand[operandOffset];
        __CLR4_4_1a5a5lb90p6ar.R.inc(1097);function[0] = FastMath.asinh(x);
        __CLR4_4_1a5a5lb90p6ar.R.inc(1098);if ((((order > 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(1099)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(1100)==0&false))) {{
            // the nth order derivative of asinh has the form:
            // dn(asinh(x)/dxn = P_n(x) / [x^2 + 1]^((2n-1)/2)
            // where P_n(x) is a degree n-1 polynomial with same parity as n-1
            // P_1(x) = 1, P_2(x) = -x, P_3(x) = 2x^2 - 1 ...
            // the general recurrence relation for P_n is:
            // P_n(x) = (x^2+1) P_(n-1)'(x) - (2n-3) x P_(n-1)(x)
            // as per polynomial parity, we can store coefficients of both P_(n-1) and P_n in the same array
            __CLR4_4_1a5a5lb90p6ar.R.inc(1101);final double[] p = new double[order];
            __CLR4_4_1a5a5lb90p6ar.R.inc(1102);p[0] = 1;
            __CLR4_4_1a5a5lb90p6ar.R.inc(1103);final double x2    = x * x;
            __CLR4_4_1a5a5lb90p6ar.R.inc(1104);final double f     = 1.0 / (1 + x2);
            __CLR4_4_1a5a5lb90p6ar.R.inc(1105);double coeff = FastMath.sqrt(f);
            __CLR4_4_1a5a5lb90p6ar.R.inc(1106);function[1] = coeff * p[0];
            __CLR4_4_1a5a5lb90p6ar.R.inc(1107);for (int n = 2; (((n <= order)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(1108)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(1109)==0&false)); ++n) {{

                // update and evaluate polynomial P_n(x)
                __CLR4_4_1a5a5lb90p6ar.R.inc(1110);double v = 0;
                __CLR4_4_1a5a5lb90p6ar.R.inc(1111);p[n - 1] = (1 - n) * p[n - 2];
                __CLR4_4_1a5a5lb90p6ar.R.inc(1112);for (int k = n - 1; (((k >= 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(1113)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(1114)==0&false)); k -= 2) {{
                    __CLR4_4_1a5a5lb90p6ar.R.inc(1115);v = v * x2 + p[k];
                    __CLR4_4_1a5a5lb90p6ar.R.inc(1116);if ((((k > 2)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(1117)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(1118)==0&false))) {{
                        __CLR4_4_1a5a5lb90p6ar.R.inc(1119);p[k - 2] = (k - 1) * p[k - 1] + (k - 2 * n) * p[k - 3];
                    } }else {__CLR4_4_1a5a5lb90p6ar.R.inc(1120);if ((((k == 2)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(1121)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(1122)==0&false))) {{
                        __CLR4_4_1a5a5lb90p6ar.R.inc(1123);p[0] = p[1];
                    }
                }}}
                }__CLR4_4_1a5a5lb90p6ar.R.inc(1124);if (((((n & 0x1) == 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(1125)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(1126)==0&false))) {{
                    __CLR4_4_1a5a5lb90p6ar.R.inc(1127);v *= x;
                }

                }__CLR4_4_1a5a5lb90p6ar.R.inc(1128);coeff *= f;
                __CLR4_4_1a5a5lb90p6ar.R.inc(1129);function[n] = coeff * v;

            }
        }}

        // apply function composition
        }__CLR4_4_1a5a5lb90p6ar.R.inc(1130);compose(operand, operandOffset, function, result, resultOffset);

    }finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Compute inverse hyperbolic tangent of a derivative structure.
     * @param operand array holding the operand
     * @param operandOffset offset of the operand in its array
     * @param result array where result must be stored (for
     * inverse hyperbolic tangent the result array <em>cannot</em> be the input
     * array)
     * @param resultOffset offset of the result in its array
     */
    public void atanh(final double[] operand, final int operandOffset,
                      final double[] result, final int resultOffset) {try{__CLR4_4_1a5a5lb90p6ar.R.inc(1131);

        // create the function value and derivatives
        __CLR4_4_1a5a5lb90p6ar.R.inc(1132);double[] function = new double[1 + order];
        __CLR4_4_1a5a5lb90p6ar.R.inc(1133);final double x = operand[operandOffset];
        __CLR4_4_1a5a5lb90p6ar.R.inc(1134);function[0] = FastMath.atanh(x);
        __CLR4_4_1a5a5lb90p6ar.R.inc(1135);if ((((order > 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(1136)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(1137)==0&false))) {{
            // the nth order derivative of atanh has the form:
            // dn(atanh(x)/dxn = Q_n(x) / (1 - x^2)^n
            // where Q_n(x) is a degree n-1 polynomial with same parity as n-1
            // Q_1(x) = 1, Q_2(x) = 2x, Q_3(x) = 6x^2 + 2 ...
            // the general recurrence relation for Q_n is:
            // Q_n(x) = (1-x^2) Q_(n-1)'(x) + 2(n-1) x Q_(n-1)(x)
            // as per polynomial parity, we can store coefficients of both Q_(n-1) and Q_n in the same array
            __CLR4_4_1a5a5lb90p6ar.R.inc(1138);final double[] q = new double[order];
            __CLR4_4_1a5a5lb90p6ar.R.inc(1139);q[0] = 1;
            __CLR4_4_1a5a5lb90p6ar.R.inc(1140);final double x2 = x * x;
            __CLR4_4_1a5a5lb90p6ar.R.inc(1141);final double f  = 1.0 / (1 - x2);
            __CLR4_4_1a5a5lb90p6ar.R.inc(1142);double coeff = f;
            __CLR4_4_1a5a5lb90p6ar.R.inc(1143);function[1] = coeff * q[0];
            __CLR4_4_1a5a5lb90p6ar.R.inc(1144);for (int n = 2; (((n <= order)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(1145)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(1146)==0&false)); ++n) {{

                // update and evaluate polynomial Q_n(x)
                __CLR4_4_1a5a5lb90p6ar.R.inc(1147);double v = 0;
                __CLR4_4_1a5a5lb90p6ar.R.inc(1148);q[n - 1] = n * q[n - 2];
                __CLR4_4_1a5a5lb90p6ar.R.inc(1149);for (int k = n - 1; (((k >= 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(1150)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(1151)==0&false)); k -= 2) {{
                    __CLR4_4_1a5a5lb90p6ar.R.inc(1152);v = v * x2 + q[k];
                    __CLR4_4_1a5a5lb90p6ar.R.inc(1153);if ((((k > 2)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(1154)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(1155)==0&false))) {{
                        __CLR4_4_1a5a5lb90p6ar.R.inc(1156);q[k - 2] = (k - 1) * q[k - 1] + (2 * n - k + 1) * q[k - 3];
                    } }else {__CLR4_4_1a5a5lb90p6ar.R.inc(1157);if ((((k == 2)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(1158)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(1159)==0&false))) {{
                        __CLR4_4_1a5a5lb90p6ar.R.inc(1160);q[0] = q[1];
                    }
                }}}
                }__CLR4_4_1a5a5lb90p6ar.R.inc(1161);if (((((n & 0x1) == 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(1162)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(1163)==0&false))) {{
                    __CLR4_4_1a5a5lb90p6ar.R.inc(1164);v *= x;
                }

                }__CLR4_4_1a5a5lb90p6ar.R.inc(1165);coeff *= f;
                __CLR4_4_1a5a5lb90p6ar.R.inc(1166);function[n] = coeff * v;

            }
        }}

        // apply function composition
        }__CLR4_4_1a5a5lb90p6ar.R.inc(1167);compose(operand, operandOffset, function, result, resultOffset);

    }finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Compute composition of a derivative structure by a function.
     * @param operand array holding the operand
     * @param operandOffset offset of the operand in its array
     * @param f array of value and derivatives of the function at
     * the current point (i.e. at {@code operand[operandOffset]}).
     * @param result array where result must be stored (for
     * composition the result array <em>cannot</em> be the input
     * array)
     * @param resultOffset offset of the result in its array
     */
    public void compose(final double[] operand, final int operandOffset, final double[] f,
                        final double[] result, final int resultOffset) {try{__CLR4_4_1a5a5lb90p6ar.R.inc(1168);
        __CLR4_4_1a5a5lb90p6ar.R.inc(1169);for (int i = 0; (((i < compIndirection.length)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(1170)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(1171)==0&false)); ++i) {{
            __CLR4_4_1a5a5lb90p6ar.R.inc(1172);final int[][] mappingI = compIndirection[i];
            __CLR4_4_1a5a5lb90p6ar.R.inc(1173);double r = 0;
            __CLR4_4_1a5a5lb90p6ar.R.inc(1174);for (int j = 0; (((j < mappingI.length)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(1175)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(1176)==0&false)); ++j) {{
                __CLR4_4_1a5a5lb90p6ar.R.inc(1177);final int[] mappingIJ = mappingI[j];
                __CLR4_4_1a5a5lb90p6ar.R.inc(1178);double product = mappingIJ[0] * f[mappingIJ[1]];
                __CLR4_4_1a5a5lb90p6ar.R.inc(1179);for (int k = 2; (((k < mappingIJ.length)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(1180)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(1181)==0&false)); ++k) {{
                    __CLR4_4_1a5a5lb90p6ar.R.inc(1182);product *= operand[operandOffset + mappingIJ[k]];
                }
                }__CLR4_4_1a5a5lb90p6ar.R.inc(1183);r += product;
            }
            }__CLR4_4_1a5a5lb90p6ar.R.inc(1184);result[resultOffset + i] = r;
        }
    }}finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Evaluate Taylor expansion of a derivative structure.
     * @param ds array holding the derivative structure
     * @param dsOffset offset of the derivative structure in its array
     * @param delta parameters offsets (&Delta;x, &Delta;y, ...)
     * @return value of the Taylor expansion at x + &Delta;x, y + &Delta;y, ...
     * @throws MathArithmeticException if factorials becomes too large
     */
    public double taylor(final double[] ds, final int dsOffset, final double ... delta)
       throws MathArithmeticException {try{__CLR4_4_1a5a5lb90p6ar.R.inc(1185);
        __CLR4_4_1a5a5lb90p6ar.R.inc(1186);double value = 0;
        __CLR4_4_1a5a5lb90p6ar.R.inc(1187);for (int i = getSize() - 1; (((i >= 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(1188)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(1189)==0&false)); --i) {{
            __CLR4_4_1a5a5lb90p6ar.R.inc(1190);final int[] orders = getPartialDerivativeOrders(i);
            __CLR4_4_1a5a5lb90p6ar.R.inc(1191);double term = ds[dsOffset + i];
            __CLR4_4_1a5a5lb90p6ar.R.inc(1192);for (int k = 0; (((k < orders.length)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(1193)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(1194)==0&false)); ++k) {{
                __CLR4_4_1a5a5lb90p6ar.R.inc(1195);if ((((orders[k] > 0)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(1196)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(1197)==0&false))) {{
                    __CLR4_4_1a5a5lb90p6ar.R.inc(1198);try {
                        __CLR4_4_1a5a5lb90p6ar.R.inc(1199);term *= FastMath.pow(delta[k], orders[k]) /
                        CombinatoricsUtils.factorial(orders[k]);
                    } catch (NotPositiveException e) {
                        // this cannot happen
                        __CLR4_4_1a5a5lb90p6ar.R.inc(1200);throw new MathInternalError(e);
                    }
                }
            }}
            }__CLR4_4_1a5a5lb90p6ar.R.inc(1201);value += term;
        }
        }__CLR4_4_1a5a5lb90p6ar.R.inc(1202);return value;
    }finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

    /** Check rules set compatibility.
     * @param compiler other compiler to check against instance
     * @exception DimensionMismatchException if number of free parameters or orders are inconsistent
     */
    public void checkCompatibility(final DSCompiler compiler)
            throws DimensionMismatchException {try{__CLR4_4_1a5a5lb90p6ar.R.inc(1203);
        __CLR4_4_1a5a5lb90p6ar.R.inc(1204);if ((((parameters != compiler.parameters)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(1205)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(1206)==0&false))) {{
            __CLR4_4_1a5a5lb90p6ar.R.inc(1207);throw new DimensionMismatchException(parameters, compiler.parameters);
        }
        }__CLR4_4_1a5a5lb90p6ar.R.inc(1208);if ((((order != compiler.order)&&(__CLR4_4_1a5a5lb90p6ar.R.iget(1209)!=0|true))||(__CLR4_4_1a5a5lb90p6ar.R.iget(1210)==0&false))) {{
            __CLR4_4_1a5a5lb90p6ar.R.inc(1211);throw new DimensionMismatchException(order, compiler.order);
        }
    }}finally{__CLR4_4_1a5a5lb90p6ar.R.flushNeeded();}}

}
