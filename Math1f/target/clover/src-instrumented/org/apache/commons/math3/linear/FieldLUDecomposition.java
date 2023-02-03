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

import org.apache.commons.math3.Field;
import org.apache.commons.math3.FieldElement;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.util.MathArrays;

/**
 * Calculates the LUP-decomposition of a square matrix.
 * <p>The LUP-decomposition of a matrix A consists of three matrices
 * L, U and P that satisfy: PA = LU, L is lower triangular, and U is
 * upper triangular and P is a permutation matrix. All matrices are
 * m&times;m.</p>
 * <p>Since {@link FieldElement field elements} do not provide an ordering
 * operator, the permutation matrix is computed here only in order to avoid
 * a zero pivot element, no attempt is done to get the largest pivot
 * element.</p>
 * <p>This class is based on the class with similar name from the
 * <a href="http://math.nist.gov/javanumerics/jama/">JAMA</a> library.</p>
 * <ul>
 *   <li>a {@link #getP() getP} method has been added,</li>
 *   <li>the {@code det} method has been renamed as {@link #getDeterminant()
 *   getDeterminant},</li>
 *   <li>the {@code getDoublePivot} method has been removed (but the int based
 *   {@link #getPivot() getPivot} method has been kept),</li>
 *   <li>the {@code solve} and {@code isNonSingular} methods have been replaced
 *   by a {@link #getSolver() getSolver} method and the equivalent methods
 *   provided by the returned {@link DecompositionSolver}.</li>
 * </ul>
 *
 * @param <T> the type of the field elements
 * @see <a href="http://mathworld.wolfram.com/LUDecomposition.html">MathWorld</a>
 * @see <a href="http://en.wikipedia.org/wiki/LU_decomposition">Wikipedia</a>
 * @version $Id$
 * @since 2.0 (changed to concrete class in 3.0)
 */
public class FieldLUDecomposition<T extends FieldElement<T>> {public static class __CLR4_4_1km1km1lb90p8w0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,26983,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Field to which the elements belong. */
    private final Field<T> field;

    /** Entries of LU decomposition. */
    private T[][] lu;

    /** Pivot permutation associated with LU decomposition. */
    private int[] pivot;

    /** Parity of the permutation associated with the LU decomposition. */
    private boolean even;

    /** Singularity indicator. */
    private boolean singular;

    /** Cached value of L. */
    private FieldMatrix<T> cachedL;

    /** Cached value of U. */
    private FieldMatrix<T> cachedU;

    /** Cached value of P. */
    private FieldMatrix<T> cachedP;

    /**
     * Calculates the LU-decomposition of the given matrix.
     * @param matrix The matrix to decompose.
     * @throws NonSquareMatrixException if matrix is not square
     */
    public FieldLUDecomposition(FieldMatrix<T> matrix) {try{__CLR4_4_1km1km1lb90p8w0.R.inc(26713);
        __CLR4_4_1km1km1lb90p8w0.R.inc(26714);if ((((!matrix.isSquare())&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26715)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26716)==0&false))) {{
            __CLR4_4_1km1km1lb90p8w0.R.inc(26717);throw new NonSquareMatrixException(matrix.getRowDimension(),
                                               matrix.getColumnDimension());
        }

        }__CLR4_4_1km1km1lb90p8w0.R.inc(26718);final int m = matrix.getColumnDimension();
        __CLR4_4_1km1km1lb90p8w0.R.inc(26719);field = matrix.getField();
        __CLR4_4_1km1km1lb90p8w0.R.inc(26720);lu = matrix.getData();
        __CLR4_4_1km1km1lb90p8w0.R.inc(26721);pivot = new int[m];
        __CLR4_4_1km1km1lb90p8w0.R.inc(26722);cachedL = null;
        __CLR4_4_1km1km1lb90p8w0.R.inc(26723);cachedU = null;
        __CLR4_4_1km1km1lb90p8w0.R.inc(26724);cachedP = null;

        // Initialize permutation array and parity
        __CLR4_4_1km1km1lb90p8w0.R.inc(26725);for (int row = 0; (((row < m)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26726)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26727)==0&false)); row++) {{
            __CLR4_4_1km1km1lb90p8w0.R.inc(26728);pivot[row] = row;
        }
        }__CLR4_4_1km1km1lb90p8w0.R.inc(26729);even     = true;
        __CLR4_4_1km1km1lb90p8w0.R.inc(26730);singular = false;

        // Loop over columns
        __CLR4_4_1km1km1lb90p8w0.R.inc(26731);for (int col = 0; (((col < m)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26732)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26733)==0&false)); col++) {{

            __CLR4_4_1km1km1lb90p8w0.R.inc(26734);T sum = field.getZero();

            // upper
            __CLR4_4_1km1km1lb90p8w0.R.inc(26735);for (int row = 0; (((row < col)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26736)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26737)==0&false)); row++) {{
                __CLR4_4_1km1km1lb90p8w0.R.inc(26738);final T[] luRow = lu[row];
                __CLR4_4_1km1km1lb90p8w0.R.inc(26739);sum = luRow[col];
                __CLR4_4_1km1km1lb90p8w0.R.inc(26740);for (int i = 0; (((i < row)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26741)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26742)==0&false)); i++) {{
                    __CLR4_4_1km1km1lb90p8w0.R.inc(26743);sum = sum.subtract(luRow[i].multiply(lu[i][col]));
                }
                }__CLR4_4_1km1km1lb90p8w0.R.inc(26744);luRow[col] = sum;
            }

            // lower
            }__CLR4_4_1km1km1lb90p8w0.R.inc(26745);int nonZero = col; // permutation row
            __CLR4_4_1km1km1lb90p8w0.R.inc(26746);for (int row = col; (((row < m)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26747)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26748)==0&false)); row++) {{
                __CLR4_4_1km1km1lb90p8w0.R.inc(26749);final T[] luRow = lu[row];
                __CLR4_4_1km1km1lb90p8w0.R.inc(26750);sum = luRow[col];
                __CLR4_4_1km1km1lb90p8w0.R.inc(26751);for (int i = 0; (((i < col)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26752)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26753)==0&false)); i++) {{
                    __CLR4_4_1km1km1lb90p8w0.R.inc(26754);sum = sum.subtract(luRow[i].multiply(lu[i][col]));
                }
                }__CLR4_4_1km1km1lb90p8w0.R.inc(26755);luRow[col] = sum;

                __CLR4_4_1km1km1lb90p8w0.R.inc(26756);if ((((lu[nonZero][col].equals(field.getZero()))&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26757)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26758)==0&false))) {{
                    // try to select a better permutation choice
                    __CLR4_4_1km1km1lb90p8w0.R.inc(26759);++nonZero;
                }
            }}

            // Singularity check
            }__CLR4_4_1km1km1lb90p8w0.R.inc(26760);if ((((nonZero >= m)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26761)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26762)==0&false))) {{
                __CLR4_4_1km1km1lb90p8w0.R.inc(26763);singular = true;
                __CLR4_4_1km1km1lb90p8w0.R.inc(26764);return;
            }

            // Pivot if necessary
            }__CLR4_4_1km1km1lb90p8w0.R.inc(26765);if ((((nonZero != col)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26766)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26767)==0&false))) {{
                __CLR4_4_1km1km1lb90p8w0.R.inc(26768);T tmp = field.getZero();
                __CLR4_4_1km1km1lb90p8w0.R.inc(26769);for (int i = 0; (((i < m)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26770)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26771)==0&false)); i++) {{
                    __CLR4_4_1km1km1lb90p8w0.R.inc(26772);tmp = lu[nonZero][i];
                    __CLR4_4_1km1km1lb90p8w0.R.inc(26773);lu[nonZero][i] = lu[col][i];
                    __CLR4_4_1km1km1lb90p8w0.R.inc(26774);lu[col][i] = tmp;
                }
                }__CLR4_4_1km1km1lb90p8w0.R.inc(26775);int temp = pivot[nonZero];
                __CLR4_4_1km1km1lb90p8w0.R.inc(26776);pivot[nonZero] = pivot[col];
                __CLR4_4_1km1km1lb90p8w0.R.inc(26777);pivot[col] = temp;
                __CLR4_4_1km1km1lb90p8w0.R.inc(26778);even = !even;
            }

            // Divide the lower elements by the "winning" diagonal elt.
            }__CLR4_4_1km1km1lb90p8w0.R.inc(26779);final T luDiag = lu[col][col];
            __CLR4_4_1km1km1lb90p8w0.R.inc(26780);for (int row = col + 1; (((row < m)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26781)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26782)==0&false)); row++) {{
                __CLR4_4_1km1km1lb90p8w0.R.inc(26783);final T[] luRow = lu[row];
                __CLR4_4_1km1km1lb90p8w0.R.inc(26784);luRow[col] = luRow[col].divide(luDiag);
            }
        }}

    }}finally{__CLR4_4_1km1km1lb90p8w0.R.flushNeeded();}}

    /**
     * Returns the matrix L of the decomposition.
     * <p>L is a lower-triangular matrix</p>
     * @return the L matrix (or null if decomposed matrix is singular)
     */
    public FieldMatrix<T> getL() {try{__CLR4_4_1km1km1lb90p8w0.R.inc(26785);
        __CLR4_4_1km1km1lb90p8w0.R.inc(26786);if (((((cachedL == null) && !singular)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26787)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26788)==0&false))) {{
            __CLR4_4_1km1km1lb90p8w0.R.inc(26789);final int m = pivot.length;
            __CLR4_4_1km1km1lb90p8w0.R.inc(26790);cachedL = new Array2DRowFieldMatrix<T>(field, m, m);
            __CLR4_4_1km1km1lb90p8w0.R.inc(26791);for (int i = 0; (((i < m)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26792)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26793)==0&false)); ++i) {{
                __CLR4_4_1km1km1lb90p8w0.R.inc(26794);final T[] luI = lu[i];
                __CLR4_4_1km1km1lb90p8w0.R.inc(26795);for (int j = 0; (((j < i)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26796)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26797)==0&false)); ++j) {{
                    __CLR4_4_1km1km1lb90p8w0.R.inc(26798);cachedL.setEntry(i, j, luI[j]);
                }
                }__CLR4_4_1km1km1lb90p8w0.R.inc(26799);cachedL.setEntry(i, i, field.getOne());
            }
        }}
        }__CLR4_4_1km1km1lb90p8w0.R.inc(26800);return cachedL;
    }finally{__CLR4_4_1km1km1lb90p8w0.R.flushNeeded();}}

    /**
     * Returns the matrix U of the decomposition.
     * <p>U is an upper-triangular matrix</p>
     * @return the U matrix (or null if decomposed matrix is singular)
     */
    public FieldMatrix<T> getU() {try{__CLR4_4_1km1km1lb90p8w0.R.inc(26801);
        __CLR4_4_1km1km1lb90p8w0.R.inc(26802);if (((((cachedU == null) && !singular)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26803)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26804)==0&false))) {{
            __CLR4_4_1km1km1lb90p8w0.R.inc(26805);final int m = pivot.length;
            __CLR4_4_1km1km1lb90p8w0.R.inc(26806);cachedU = new Array2DRowFieldMatrix<T>(field, m, m);
            __CLR4_4_1km1km1lb90p8w0.R.inc(26807);for (int i = 0; (((i < m)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26808)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26809)==0&false)); ++i) {{
                __CLR4_4_1km1km1lb90p8w0.R.inc(26810);final T[] luI = lu[i];
                __CLR4_4_1km1km1lb90p8w0.R.inc(26811);for (int j = i; (((j < m)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26812)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26813)==0&false)); ++j) {{
                    __CLR4_4_1km1km1lb90p8w0.R.inc(26814);cachedU.setEntry(i, j, luI[j]);
                }
            }}
        }}
        }__CLR4_4_1km1km1lb90p8w0.R.inc(26815);return cachedU;
    }finally{__CLR4_4_1km1km1lb90p8w0.R.flushNeeded();}}

    /**
     * Returns the P rows permutation matrix.
     * <p>P is a sparse matrix with exactly one element set to 1.0 in
     * each row and each column, all other elements being set to 0.0.</p>
     * <p>The positions of the 1 elements are given by the {@link #getPivot()
     * pivot permutation vector}.</p>
     * @return the P rows permutation matrix (or null if decomposed matrix is singular)
     * @see #getPivot()
     */
    public FieldMatrix<T> getP() {try{__CLR4_4_1km1km1lb90p8w0.R.inc(26816);
        __CLR4_4_1km1km1lb90p8w0.R.inc(26817);if (((((cachedP == null) && !singular)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26818)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26819)==0&false))) {{
            __CLR4_4_1km1km1lb90p8w0.R.inc(26820);final int m = pivot.length;
            __CLR4_4_1km1km1lb90p8w0.R.inc(26821);cachedP = new Array2DRowFieldMatrix<T>(field, m, m);
            __CLR4_4_1km1km1lb90p8w0.R.inc(26822);for (int i = 0; (((i < m)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26823)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26824)==0&false)); ++i) {{
                __CLR4_4_1km1km1lb90p8w0.R.inc(26825);cachedP.setEntry(i, pivot[i], field.getOne());
            }
        }}
        }__CLR4_4_1km1km1lb90p8w0.R.inc(26826);return cachedP;
    }finally{__CLR4_4_1km1km1lb90p8w0.R.flushNeeded();}}

    /**
     * Returns the pivot permutation vector.
     * @return the pivot permutation vector
     * @see #getP()
     */
    public int[] getPivot() {try{__CLR4_4_1km1km1lb90p8w0.R.inc(26827);
        __CLR4_4_1km1km1lb90p8w0.R.inc(26828);return pivot.clone();
    }finally{__CLR4_4_1km1km1lb90p8w0.R.flushNeeded();}}

    /**
     * Return the determinant of the matrix.
     * @return determinant of the matrix
     */
    public T getDeterminant() {try{__CLR4_4_1km1km1lb90p8w0.R.inc(26829);
        __CLR4_4_1km1km1lb90p8w0.R.inc(26830);if ((((singular)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26831)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26832)==0&false))) {{
            __CLR4_4_1km1km1lb90p8w0.R.inc(26833);return field.getZero();
        } }else {{
            __CLR4_4_1km1km1lb90p8w0.R.inc(26834);final int m = pivot.length;
            __CLR4_4_1km1km1lb90p8w0.R.inc(26835);T determinant = (((even )&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26836)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26837)==0&false))? field.getOne() : field.getZero().subtract(field.getOne());
            __CLR4_4_1km1km1lb90p8w0.R.inc(26838);for (int i = 0; (((i < m)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26839)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26840)==0&false)); i++) {{
                __CLR4_4_1km1km1lb90p8w0.R.inc(26841);determinant = determinant.multiply(lu[i][i]);
            }
            }__CLR4_4_1km1km1lb90p8w0.R.inc(26842);return determinant;
        }
    }}finally{__CLR4_4_1km1km1lb90p8w0.R.flushNeeded();}}

    /**
     * Get a solver for finding the A &times; X = B solution in exact linear sense.
     * @return a solver
     */
    public FieldDecompositionSolver<T> getSolver() {try{__CLR4_4_1km1km1lb90p8w0.R.inc(26843);
        __CLR4_4_1km1km1lb90p8w0.R.inc(26844);return new Solver<T>(field, lu, pivot, singular);
    }finally{__CLR4_4_1km1km1lb90p8w0.R.flushNeeded();}}

    /** Specialized solver. */
    private static class Solver<T extends FieldElement<T>> implements FieldDecompositionSolver<T> {

        /** Field to which the elements belong. */
        private final Field<T> field;

        /** Entries of LU decomposition. */
        private final T[][] lu;

        /** Pivot permutation associated with LU decomposition. */
        private final int[] pivot;

        /** Singularity indicator. */
        private final boolean singular;

        /**
         * Build a solver from decomposed matrix.
         * @param field field to which the matrix elements belong
         * @param lu entries of LU decomposition
         * @param pivot pivot permutation associated with LU decomposition
         * @param singular singularity indicator
         */
        private Solver(final Field<T> field, final T[][] lu,
                       final int[] pivot, final boolean singular) {try{__CLR4_4_1km1km1lb90p8w0.R.inc(26845);
            __CLR4_4_1km1km1lb90p8w0.R.inc(26846);this.field    = field;
            __CLR4_4_1km1km1lb90p8w0.R.inc(26847);this.lu       = lu;
            __CLR4_4_1km1km1lb90p8w0.R.inc(26848);this.pivot    = pivot;
            __CLR4_4_1km1km1lb90p8w0.R.inc(26849);this.singular = singular;
        }finally{__CLR4_4_1km1km1lb90p8w0.R.flushNeeded();}}

        /** {@inheritDoc} */
        public boolean isNonSingular() {try{__CLR4_4_1km1km1lb90p8w0.R.inc(26850);
            __CLR4_4_1km1km1lb90p8w0.R.inc(26851);return !singular;
        }finally{__CLR4_4_1km1km1lb90p8w0.R.flushNeeded();}}

        /** {@inheritDoc} */
        public FieldVector<T> solve(FieldVector<T> b) {try{__CLR4_4_1km1km1lb90p8w0.R.inc(26852);
            __CLR4_4_1km1km1lb90p8w0.R.inc(26853);try {
                __CLR4_4_1km1km1lb90p8w0.R.inc(26854);return solve((ArrayFieldVector<T>) b);
            } catch (ClassCastException cce) {

                __CLR4_4_1km1km1lb90p8w0.R.inc(26855);final int m = pivot.length;
                __CLR4_4_1km1km1lb90p8w0.R.inc(26856);if ((((b.getDimension() != m)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26857)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26858)==0&false))) {{
                    __CLR4_4_1km1km1lb90p8w0.R.inc(26859);throw new DimensionMismatchException(b.getDimension(), m);
                }
                }__CLR4_4_1km1km1lb90p8w0.R.inc(26860);if ((((singular)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26861)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26862)==0&false))) {{
                    __CLR4_4_1km1km1lb90p8w0.R.inc(26863);throw new SingularMatrixException();
                }

                // Apply permutations to b
                }__CLR4_4_1km1km1lb90p8w0.R.inc(26864);final T[] bp = MathArrays.buildArray(field, m);
                __CLR4_4_1km1km1lb90p8w0.R.inc(26865);for (int row = 0; (((row < m)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26866)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26867)==0&false)); row++) {{
                    __CLR4_4_1km1km1lb90p8w0.R.inc(26868);bp[row] = b.getEntry(pivot[row]);
                }

                // Solve LY = b
                }__CLR4_4_1km1km1lb90p8w0.R.inc(26869);for (int col = 0; (((col < m)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26870)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26871)==0&false)); col++) {{
                    __CLR4_4_1km1km1lb90p8w0.R.inc(26872);final T bpCol = bp[col];
                    __CLR4_4_1km1km1lb90p8w0.R.inc(26873);for (int i = col + 1; (((i < m)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26874)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26875)==0&false)); i++) {{
                        __CLR4_4_1km1km1lb90p8w0.R.inc(26876);bp[i] = bp[i].subtract(bpCol.multiply(lu[i][col]));
                    }
                }}

                // Solve UX = Y
                }__CLR4_4_1km1km1lb90p8w0.R.inc(26877);for (int col = m - 1; (((col >= 0)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26878)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26879)==0&false)); col--) {{
                    __CLR4_4_1km1km1lb90p8w0.R.inc(26880);bp[col] = bp[col].divide(lu[col][col]);
                    __CLR4_4_1km1km1lb90p8w0.R.inc(26881);final T bpCol = bp[col];
                    __CLR4_4_1km1km1lb90p8w0.R.inc(26882);for (int i = 0; (((i < col)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26883)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26884)==0&false)); i++) {{
                        __CLR4_4_1km1km1lb90p8w0.R.inc(26885);bp[i] = bp[i].subtract(bpCol.multiply(lu[i][col]));
                    }
                }}

                }__CLR4_4_1km1km1lb90p8w0.R.inc(26886);return new ArrayFieldVector<T>(field, bp, false);

            }
        }finally{__CLR4_4_1km1km1lb90p8w0.R.flushNeeded();}}

        /** Solve the linear equation A &times; X = B.
         * <p>The A matrix is implicit here. It is </p>
         * @param b right-hand side of the equation A &times; X = B
         * @return a vector X such that A &times; X = B
         * @throws DimensionMismatchException if the matrices dimensions do not match.
         * @throws SingularMatrixException if the decomposed matrix is singular.
         */
        public ArrayFieldVector<T> solve(ArrayFieldVector<T> b) {try{__CLR4_4_1km1km1lb90p8w0.R.inc(26887);
            __CLR4_4_1km1km1lb90p8w0.R.inc(26888);final int m = pivot.length;
            __CLR4_4_1km1km1lb90p8w0.R.inc(26889);final int length = b.getDimension();
            __CLR4_4_1km1km1lb90p8w0.R.inc(26890);if ((((length != m)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26891)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26892)==0&false))) {{
                __CLR4_4_1km1km1lb90p8w0.R.inc(26893);throw new DimensionMismatchException(length, m);
            }
            }__CLR4_4_1km1km1lb90p8w0.R.inc(26894);if ((((singular)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26895)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26896)==0&false))) {{
                __CLR4_4_1km1km1lb90p8w0.R.inc(26897);throw new SingularMatrixException();
            }

            // Apply permutations to b
            }__CLR4_4_1km1km1lb90p8w0.R.inc(26898);final T[] bp = MathArrays.buildArray(field, m);
            __CLR4_4_1km1km1lb90p8w0.R.inc(26899);for (int row = 0; (((row < m)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26900)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26901)==0&false)); row++) {{
                __CLR4_4_1km1km1lb90p8w0.R.inc(26902);bp[row] = b.getEntry(pivot[row]);
            }

            // Solve LY = b
            }__CLR4_4_1km1km1lb90p8w0.R.inc(26903);for (int col = 0; (((col < m)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26904)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26905)==0&false)); col++) {{
                __CLR4_4_1km1km1lb90p8w0.R.inc(26906);final T bpCol = bp[col];
                __CLR4_4_1km1km1lb90p8w0.R.inc(26907);for (int i = col + 1; (((i < m)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26908)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26909)==0&false)); i++) {{
                    __CLR4_4_1km1km1lb90p8w0.R.inc(26910);bp[i] = bp[i].subtract(bpCol.multiply(lu[i][col]));
                }
            }}

            // Solve UX = Y
            }__CLR4_4_1km1km1lb90p8w0.R.inc(26911);for (int col = m - 1; (((col >= 0)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26912)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26913)==0&false)); col--) {{
                __CLR4_4_1km1km1lb90p8w0.R.inc(26914);bp[col] = bp[col].divide(lu[col][col]);
                __CLR4_4_1km1km1lb90p8w0.R.inc(26915);final T bpCol = bp[col];
                __CLR4_4_1km1km1lb90p8w0.R.inc(26916);for (int i = 0; (((i < col)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26917)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26918)==0&false)); i++) {{
                    __CLR4_4_1km1km1lb90p8w0.R.inc(26919);bp[i] = bp[i].subtract(bpCol.multiply(lu[i][col]));
                }
            }}

            }__CLR4_4_1km1km1lb90p8w0.R.inc(26920);return new ArrayFieldVector<T>(bp, false);
        }finally{__CLR4_4_1km1km1lb90p8w0.R.flushNeeded();}}

        /** {@inheritDoc} */
        public FieldMatrix<T> solve(FieldMatrix<T> b) {try{__CLR4_4_1km1km1lb90p8w0.R.inc(26921);
            __CLR4_4_1km1km1lb90p8w0.R.inc(26922);final int m = pivot.length;
            __CLR4_4_1km1km1lb90p8w0.R.inc(26923);if ((((b.getRowDimension() != m)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26924)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26925)==0&false))) {{
                __CLR4_4_1km1km1lb90p8w0.R.inc(26926);throw new DimensionMismatchException(b.getRowDimension(), m);
            }
            }__CLR4_4_1km1km1lb90p8w0.R.inc(26927);if ((((singular)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26928)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26929)==0&false))) {{
                __CLR4_4_1km1km1lb90p8w0.R.inc(26930);throw new SingularMatrixException();
            }

            }__CLR4_4_1km1km1lb90p8w0.R.inc(26931);final int nColB = b.getColumnDimension();

            // Apply permutations to b
            __CLR4_4_1km1km1lb90p8w0.R.inc(26932);final T[][] bp = MathArrays.buildArray(field, m, nColB);
            __CLR4_4_1km1km1lb90p8w0.R.inc(26933);for (int row = 0; (((row < m)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26934)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26935)==0&false)); row++) {{
                __CLR4_4_1km1km1lb90p8w0.R.inc(26936);final T[] bpRow = bp[row];
                __CLR4_4_1km1km1lb90p8w0.R.inc(26937);final int pRow = pivot[row];
                __CLR4_4_1km1km1lb90p8w0.R.inc(26938);for (int col = 0; (((col < nColB)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26939)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26940)==0&false)); col++) {{
                    __CLR4_4_1km1km1lb90p8w0.R.inc(26941);bpRow[col] = b.getEntry(pRow, col);
                }
            }}

            // Solve LY = b
            }__CLR4_4_1km1km1lb90p8w0.R.inc(26942);for (int col = 0; (((col < m)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26943)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26944)==0&false)); col++) {{
                __CLR4_4_1km1km1lb90p8w0.R.inc(26945);final T[] bpCol = bp[col];
                __CLR4_4_1km1km1lb90p8w0.R.inc(26946);for (int i = col + 1; (((i < m)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26947)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26948)==0&false)); i++) {{
                    __CLR4_4_1km1km1lb90p8w0.R.inc(26949);final T[] bpI = bp[i];
                    __CLR4_4_1km1km1lb90p8w0.R.inc(26950);final T luICol = lu[i][col];
                    __CLR4_4_1km1km1lb90p8w0.R.inc(26951);for (int j = 0; (((j < nColB)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26952)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26953)==0&false)); j++) {{
                        __CLR4_4_1km1km1lb90p8w0.R.inc(26954);bpI[j] = bpI[j].subtract(bpCol[j].multiply(luICol));
                    }
                }}
            }}

            // Solve UX = Y
            }__CLR4_4_1km1km1lb90p8w0.R.inc(26955);for (int col = m - 1; (((col >= 0)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26956)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26957)==0&false)); col--) {{
                __CLR4_4_1km1km1lb90p8w0.R.inc(26958);final T[] bpCol = bp[col];
                __CLR4_4_1km1km1lb90p8w0.R.inc(26959);final T luDiag = lu[col][col];
                __CLR4_4_1km1km1lb90p8w0.R.inc(26960);for (int j = 0; (((j < nColB)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26961)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26962)==0&false)); j++) {{
                    __CLR4_4_1km1km1lb90p8w0.R.inc(26963);bpCol[j] = bpCol[j].divide(luDiag);
                }
                }__CLR4_4_1km1km1lb90p8w0.R.inc(26964);for (int i = 0; (((i < col)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26965)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26966)==0&false)); i++) {{
                    __CLR4_4_1km1km1lb90p8w0.R.inc(26967);final T[] bpI = bp[i];
                    __CLR4_4_1km1km1lb90p8w0.R.inc(26968);final T luICol = lu[i][col];
                    __CLR4_4_1km1km1lb90p8w0.R.inc(26969);for (int j = 0; (((j < nColB)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26970)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26971)==0&false)); j++) {{
                        __CLR4_4_1km1km1lb90p8w0.R.inc(26972);bpI[j] = bpI[j].subtract(bpCol[j].multiply(luICol));
                    }
                }}
            }}

            }__CLR4_4_1km1km1lb90p8w0.R.inc(26973);return new Array2DRowFieldMatrix<T>(field, bp, false);

        }finally{__CLR4_4_1km1km1lb90p8w0.R.flushNeeded();}}

        /** {@inheritDoc} */
        public FieldMatrix<T> getInverse() {try{__CLR4_4_1km1km1lb90p8w0.R.inc(26974);
            __CLR4_4_1km1km1lb90p8w0.R.inc(26975);final int m = pivot.length;
            __CLR4_4_1km1km1lb90p8w0.R.inc(26976);final T one = field.getOne();
            __CLR4_4_1km1km1lb90p8w0.R.inc(26977);FieldMatrix<T> identity = new Array2DRowFieldMatrix<T>(field, m, m);
            __CLR4_4_1km1km1lb90p8w0.R.inc(26978);for (int i = 0; (((i < m)&&(__CLR4_4_1km1km1lb90p8w0.R.iget(26979)!=0|true))||(__CLR4_4_1km1km1lb90p8w0.R.iget(26980)==0&false)); ++i) {{
                __CLR4_4_1km1km1lb90p8w0.R.inc(26981);identity.setEntry(i, i, one);
            }
            }__CLR4_4_1km1km1lb90p8w0.R.inc(26982);return solve(identity);
        }finally{__CLR4_4_1km1km1lb90p8w0.R.flushNeeded();}}
    }
}
