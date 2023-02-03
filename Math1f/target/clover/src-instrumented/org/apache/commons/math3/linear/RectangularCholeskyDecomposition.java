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

package org.apache.commons.math3.linear;

import org.apache.commons.math3.util.FastMath;

/**
 * Calculates the rectangular Cholesky decomposition of a matrix.
 * <p>The rectangular Cholesky decomposition of a real symmetric positive
 * semidefinite matrix A consists of a rectangular matrix B with the same
 * number of rows such that: A is almost equal to BB<sup>T</sup>, depending
 * on a user-defined tolerance. In a sense, this is the square root of A.</p>
 * <p>The difference with respect to the regular {@link CholeskyDecomposition}
 * is that rows/columns may be permuted (hence the rectangular shape instead
 * of the traditional triangular shape) and there is a threshold to ignore
 * small diagonal elements. This is used for example to generate {@link
 * org.apache.commons.math3.random.CorrelatedRandomVectorGenerator correlated
 * random n-dimensions vectors} in a p-dimension subspace (p < n).
 * In other words, it allows generating random vectors from a covariance
 * matrix that is only positive semidefinite, and not positive definite.</p>
 * <p>Rectangular Cholesky decomposition is <em>not</em> suited for solving
 * linear systems, so it does not provide any {@link DecompositionSolver
 * decomposition solver}.</p>
 *
 * @see <a href="http://mathworld.wolfram.com/CholeskyDecomposition.html">MathWorld</a>
 * @see <a href="http://en.wikipedia.org/wiki/Cholesky_decomposition">Wikipedia</a>
 * @version $Id$
 * @since 2.0 (changed to concrete class in 3.0)
 */
public class RectangularCholeskyDecomposition {public static class __CLR4_4_1mspmsplb90p930{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,29627,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Permutated Cholesky root of the symmetric positive semidefinite matrix. */
    private final RealMatrix root;

    /** Rank of the symmetric positive semidefinite matrix. */
    private int rank;

    /**
     * Decompose a symmetric positive semidefinite matrix.
     * <p>
     * <b>Note:</b> this constructor follows the linpack method to detect dependent
     * columns by proceeding with the Cholesky algorithm until a nonpositive diagonal
     * element is encountered.
     *
     * @see <a href="http://eprints.ma.man.ac.uk/1193/01/covered/MIMS_ep2008_56.pdf">
     * Analysis of the Cholesky Decomposition of a Semi-definite Matrix</a>
     *
     * @param matrix Symmetric positive semidefinite matrix.
     * @exception NonPositiveDefiniteMatrixException if the matrix is not
     * positive semidefinite.
     * @since 3.1
     */
    public RectangularCholeskyDecomposition(RealMatrix matrix)
        throws NonPositiveDefiniteMatrixException {
        this(matrix, 0);__CLR4_4_1mspmsplb90p930.R.inc(29546);try{__CLR4_4_1mspmsplb90p930.R.inc(29545);
    }finally{__CLR4_4_1mspmsplb90p930.R.flushNeeded();}}

    /**
     * Decompose a symmetric positive semidefinite matrix.
     *
     * @param matrix Symmetric positive semidefinite matrix.
     * @param small Diagonal elements threshold under which columns are
     * considered to be dependent on previous ones and are discarded.
     * @exception NonPositiveDefiniteMatrixException if the matrix is not
     * positive semidefinite.
     */
    public RectangularCholeskyDecomposition(RealMatrix matrix, double small)
        throws NonPositiveDefiniteMatrixException {try{__CLR4_4_1mspmsplb90p930.R.inc(29547);

        __CLR4_4_1mspmsplb90p930.R.inc(29548);final int order = matrix.getRowDimension();
        __CLR4_4_1mspmsplb90p930.R.inc(29549);final double[][] c = matrix.getData();
        __CLR4_4_1mspmsplb90p930.R.inc(29550);final double[][] b = new double[order][order];

        __CLR4_4_1mspmsplb90p930.R.inc(29551);int[] index = new int[order];
        __CLR4_4_1mspmsplb90p930.R.inc(29552);for (int i = 0; (((i < order)&&(__CLR4_4_1mspmsplb90p930.R.iget(29553)!=0|true))||(__CLR4_4_1mspmsplb90p930.R.iget(29554)==0&false)); ++i) {{
            __CLR4_4_1mspmsplb90p930.R.inc(29555);index[i] = i;
        }

        }__CLR4_4_1mspmsplb90p930.R.inc(29556);int r = 0;
        __CLR4_4_1mspmsplb90p930.R.inc(29557);for (boolean loop = true; (((loop)&&(__CLR4_4_1mspmsplb90p930.R.iget(29558)!=0|true))||(__CLR4_4_1mspmsplb90p930.R.iget(29559)==0&false));) {{

            // find maximal diagonal element
            __CLR4_4_1mspmsplb90p930.R.inc(29560);int swapR = r;
            __CLR4_4_1mspmsplb90p930.R.inc(29561);for (int i = r + 1; (((i < order)&&(__CLR4_4_1mspmsplb90p930.R.iget(29562)!=0|true))||(__CLR4_4_1mspmsplb90p930.R.iget(29563)==0&false)); ++i) {{
                __CLR4_4_1mspmsplb90p930.R.inc(29564);int ii  = index[i];
                __CLR4_4_1mspmsplb90p930.R.inc(29565);int isr = index[swapR];
                __CLR4_4_1mspmsplb90p930.R.inc(29566);if ((((c[ii][ii] > c[isr][isr])&&(__CLR4_4_1mspmsplb90p930.R.iget(29567)!=0|true))||(__CLR4_4_1mspmsplb90p930.R.iget(29568)==0&false))) {{
                    __CLR4_4_1mspmsplb90p930.R.inc(29569);swapR = i;
                }
            }}


            // swap elements
            }__CLR4_4_1mspmsplb90p930.R.inc(29570);if ((((swapR != r)&&(__CLR4_4_1mspmsplb90p930.R.iget(29571)!=0|true))||(__CLR4_4_1mspmsplb90p930.R.iget(29572)==0&false))) {{
                __CLR4_4_1mspmsplb90p930.R.inc(29573);final int tmpIndex    = index[r];
                __CLR4_4_1mspmsplb90p930.R.inc(29574);index[r]              = index[swapR];
                __CLR4_4_1mspmsplb90p930.R.inc(29575);index[swapR]          = tmpIndex;
                __CLR4_4_1mspmsplb90p930.R.inc(29576);final double[] tmpRow = b[r];
                __CLR4_4_1mspmsplb90p930.R.inc(29577);b[r]                  = b[swapR];
                __CLR4_4_1mspmsplb90p930.R.inc(29578);b[swapR]              = tmpRow;
            }

            // check diagonal element
            }__CLR4_4_1mspmsplb90p930.R.inc(29579);int ir = index[r];
            __CLR4_4_1mspmsplb90p930.R.inc(29580);if ((((c[ir][ir] <= small)&&(__CLR4_4_1mspmsplb90p930.R.iget(29581)!=0|true))||(__CLR4_4_1mspmsplb90p930.R.iget(29582)==0&false))) {{

                __CLR4_4_1mspmsplb90p930.R.inc(29583);if ((((r == 0)&&(__CLR4_4_1mspmsplb90p930.R.iget(29584)!=0|true))||(__CLR4_4_1mspmsplb90p930.R.iget(29585)==0&false))) {{
                    __CLR4_4_1mspmsplb90p930.R.inc(29586);throw new NonPositiveDefiniteMatrixException(c[ir][ir], ir, small);
                }

                // check remaining diagonal elements
                }__CLR4_4_1mspmsplb90p930.R.inc(29587);for (int i = r; (((i < order)&&(__CLR4_4_1mspmsplb90p930.R.iget(29588)!=0|true))||(__CLR4_4_1mspmsplb90p930.R.iget(29589)==0&false)); ++i) {{
                    __CLR4_4_1mspmsplb90p930.R.inc(29590);if ((((c[index[i]][index[i]] < -small)&&(__CLR4_4_1mspmsplb90p930.R.iget(29591)!=0|true))||(__CLR4_4_1mspmsplb90p930.R.iget(29592)==0&false))) {{
                        // there is at least one sufficiently negative diagonal element,
                        // the symmetric positive semidefinite matrix is wrong
                        __CLR4_4_1mspmsplb90p930.R.inc(29593);throw new NonPositiveDefiniteMatrixException(c[index[i]][index[i]], i, small);
                    }
                }}

                // all remaining diagonal elements are close to zero, we consider we have
                // found the rank of the symmetric positive semidefinite matrix
                }__CLR4_4_1mspmsplb90p930.R.inc(29594);loop = false;

            } }else {{

                // transform the matrix
                __CLR4_4_1mspmsplb90p930.R.inc(29595);final double sqrt = FastMath.sqrt(c[ir][ir]);
                __CLR4_4_1mspmsplb90p930.R.inc(29596);b[r][r] = sqrt;
                __CLR4_4_1mspmsplb90p930.R.inc(29597);final double inverse  = 1 / sqrt;
                __CLR4_4_1mspmsplb90p930.R.inc(29598);final double inverse2 = 1 / c[ir][ir];
                __CLR4_4_1mspmsplb90p930.R.inc(29599);for (int i = r + 1; (((i < order)&&(__CLR4_4_1mspmsplb90p930.R.iget(29600)!=0|true))||(__CLR4_4_1mspmsplb90p930.R.iget(29601)==0&false)); ++i) {{
                    __CLR4_4_1mspmsplb90p930.R.inc(29602);final int ii = index[i];
                    __CLR4_4_1mspmsplb90p930.R.inc(29603);final double e = inverse * c[ii][ir];
                    __CLR4_4_1mspmsplb90p930.R.inc(29604);b[i][r] = e;
                    __CLR4_4_1mspmsplb90p930.R.inc(29605);c[ii][ii] -= c[ii][ir] * c[ii][ir] * inverse2;
                    __CLR4_4_1mspmsplb90p930.R.inc(29606);for (int j = r + 1; (((j < i)&&(__CLR4_4_1mspmsplb90p930.R.iget(29607)!=0|true))||(__CLR4_4_1mspmsplb90p930.R.iget(29608)==0&false)); ++j) {{
                        __CLR4_4_1mspmsplb90p930.R.inc(29609);final int ij = index[j];
                        __CLR4_4_1mspmsplb90p930.R.inc(29610);final double f = c[ii][ij] - e * b[j][r];
                        __CLR4_4_1mspmsplb90p930.R.inc(29611);c[ii][ij] = f;
                        __CLR4_4_1mspmsplb90p930.R.inc(29612);c[ij][ii] = f;
                    }
                }}

                // prepare next iteration
                }__CLR4_4_1mspmsplb90p930.R.inc(29613);loop = ++r < order;
            }
        }}

        // build the root matrix
        }__CLR4_4_1mspmsplb90p930.R.inc(29614);rank = r;
        __CLR4_4_1mspmsplb90p930.R.inc(29615);root = MatrixUtils.createRealMatrix(order, r);
        __CLR4_4_1mspmsplb90p930.R.inc(29616);for (int i = 0; (((i < order)&&(__CLR4_4_1mspmsplb90p930.R.iget(29617)!=0|true))||(__CLR4_4_1mspmsplb90p930.R.iget(29618)==0&false)); ++i) {{
            __CLR4_4_1mspmsplb90p930.R.inc(29619);for (int j = 0; (((j < r)&&(__CLR4_4_1mspmsplb90p930.R.iget(29620)!=0|true))||(__CLR4_4_1mspmsplb90p930.R.iget(29621)==0&false)); ++j) {{
                __CLR4_4_1mspmsplb90p930.R.inc(29622);root.setEntry(index[i], j, b[i][j]);
            }
        }}

    }}finally{__CLR4_4_1mspmsplb90p930.R.flushNeeded();}}

    /** Get the root of the covariance matrix.
     * The root is the rectangular matrix <code>B</code> such that
     * the covariance matrix is equal to <code>B.B<sup>T</sup></code>
     * @return root of the square matrix
     * @see #getRank()
     */
    public RealMatrix getRootMatrix() {try{__CLR4_4_1mspmsplb90p930.R.inc(29623);
        __CLR4_4_1mspmsplb90p930.R.inc(29624);return root;
    }finally{__CLR4_4_1mspmsplb90p930.R.flushNeeded();}}

    /** Get the rank of the symmetric positive semidefinite matrix.
     * The r is the number of independent rows in the symmetric positive semidefinite
     * matrix, it is also the number of columns of the rectangular
     * matrix of the decomposition.
     * @return r of the square matrix.
     * @see #getRootMatrix()
     */
    public int getRank() {try{__CLR4_4_1mspmsplb90p930.R.inc(29625);
        __CLR4_4_1mspmsplb90p930.R.inc(29626);return rank;
    }finally{__CLR4_4_1mspmsplb90p930.R.flushNeeded();}}

}
