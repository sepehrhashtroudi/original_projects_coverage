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

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.util.FastMath;

/**
 * Calculates the LUP-decomposition of a square matrix.
 * <p>The LUP-decomposition of a matrix A consists of three matrices L, U and
 * P that satisfy: P&times;A = L&times;U. L is lower triangular (with unit
 * diagonal terms), U is upper triangular and P is a permutation matrix. All
 * matrices are m&times;m.</p>
 * <p>As shown by the presence of the P matrix, this decomposition is
 * implemented using partial pivoting.</p>
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
 * @see <a href="http://mathworld.wolfram.com/LUDecomposition.html">MathWorld</a>
 * @see <a href="http://en.wikipedia.org/wiki/LU_decomposition">Wikipedia</a>
 * @version $Id$
 * @since 2.0 (changed to concrete class in 3.0)
 */
public class LUDecomposition {public static class __CLR4_4_1kzfkzflb90p8xe{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,27424,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Default bound to determine effective singularity in LU decomposition. */
    private static final double DEFAULT_TOO_SMALL = 1e-11;
    /** Entries of LU decomposition. */
    private final double[][] lu;
    /** Pivot permutation associated with LU decomposition. */
    private final int[] pivot;
    /** Parity of the permutation associated with the LU decomposition. */
    private boolean even;
    /** Singularity indicator. */
    private boolean singular;
    /** Cached value of L. */
    private RealMatrix cachedL;
    /** Cached value of U. */
    private RealMatrix cachedU;
    /** Cached value of P. */
    private RealMatrix cachedP;

    /**
     * Calculates the LU-decomposition of the given matrix.
     * This constructor uses 1e-11 as default value for the singularity
     * threshold.
     *
     * @param matrix Matrix to decompose.
     * @throws NonSquareMatrixException if matrix is not square.
     */
    public LUDecomposition(RealMatrix matrix) {
        this(matrix, DEFAULT_TOO_SMALL);__CLR4_4_1kzfkzflb90p8xe.R.inc(27196);try{__CLR4_4_1kzfkzflb90p8xe.R.inc(27195);
    }finally{__CLR4_4_1kzfkzflb90p8xe.R.flushNeeded();}}

    /**
     * Calculates the LU-decomposition of the given matrix.
     * @param matrix The matrix to decompose.
     * @param singularityThreshold threshold (based on partial row norm)
     * under which a matrix is considered singular
     * @throws NonSquareMatrixException if matrix is not square
     */
    public LUDecomposition(RealMatrix matrix, double singularityThreshold) {try{__CLR4_4_1kzfkzflb90p8xe.R.inc(27197);
        __CLR4_4_1kzfkzflb90p8xe.R.inc(27198);if ((((!matrix.isSquare())&&(__CLR4_4_1kzfkzflb90p8xe.R.iget(27199)!=0|true))||(__CLR4_4_1kzfkzflb90p8xe.R.iget(27200)==0&false))) {{
            __CLR4_4_1kzfkzflb90p8xe.R.inc(27201);throw new NonSquareMatrixException(matrix.getRowDimension(),
                                               matrix.getColumnDimension());
        }

        }__CLR4_4_1kzfkzflb90p8xe.R.inc(27202);final int m = matrix.getColumnDimension();
        __CLR4_4_1kzfkzflb90p8xe.R.inc(27203);lu = matrix.getData();
        __CLR4_4_1kzfkzflb90p8xe.R.inc(27204);pivot = new int[m];
        __CLR4_4_1kzfkzflb90p8xe.R.inc(27205);cachedL = null;
        __CLR4_4_1kzfkzflb90p8xe.R.inc(27206);cachedU = null;
        __CLR4_4_1kzfkzflb90p8xe.R.inc(27207);cachedP = null;

        // Initialize permutation array and parity
        __CLR4_4_1kzfkzflb90p8xe.R.inc(27208);for (int row = 0; (((row < m)&&(__CLR4_4_1kzfkzflb90p8xe.R.iget(27209)!=0|true))||(__CLR4_4_1kzfkzflb90p8xe.R.iget(27210)==0&false)); row++) {{
            __CLR4_4_1kzfkzflb90p8xe.R.inc(27211);pivot[row] = row;
        }
        }__CLR4_4_1kzfkzflb90p8xe.R.inc(27212);even     = true;
        __CLR4_4_1kzfkzflb90p8xe.R.inc(27213);singular = false;

        // Loop over columns
        __CLR4_4_1kzfkzflb90p8xe.R.inc(27214);for (int col = 0; (((col < m)&&(__CLR4_4_1kzfkzflb90p8xe.R.iget(27215)!=0|true))||(__CLR4_4_1kzfkzflb90p8xe.R.iget(27216)==0&false)); col++) {{

            // upper
            __CLR4_4_1kzfkzflb90p8xe.R.inc(27217);for (int row = 0; (((row < col)&&(__CLR4_4_1kzfkzflb90p8xe.R.iget(27218)!=0|true))||(__CLR4_4_1kzfkzflb90p8xe.R.iget(27219)==0&false)); row++) {{
                __CLR4_4_1kzfkzflb90p8xe.R.inc(27220);final double[] luRow = lu[row];
                __CLR4_4_1kzfkzflb90p8xe.R.inc(27221);double sum = luRow[col];
                __CLR4_4_1kzfkzflb90p8xe.R.inc(27222);for (int i = 0; (((i < row)&&(__CLR4_4_1kzfkzflb90p8xe.R.iget(27223)!=0|true))||(__CLR4_4_1kzfkzflb90p8xe.R.iget(27224)==0&false)); i++) {{
                    __CLR4_4_1kzfkzflb90p8xe.R.inc(27225);sum -= luRow[i] * lu[i][col];
                }
                }__CLR4_4_1kzfkzflb90p8xe.R.inc(27226);luRow[col] = sum;
            }

            // lower
            }__CLR4_4_1kzfkzflb90p8xe.R.inc(27227);int max = col; // permutation row
            __CLR4_4_1kzfkzflb90p8xe.R.inc(27228);double largest = Double.NEGATIVE_INFINITY;
            __CLR4_4_1kzfkzflb90p8xe.R.inc(27229);for (int row = col; (((row < m)&&(__CLR4_4_1kzfkzflb90p8xe.R.iget(27230)!=0|true))||(__CLR4_4_1kzfkzflb90p8xe.R.iget(27231)==0&false)); row++) {{
                __CLR4_4_1kzfkzflb90p8xe.R.inc(27232);final double[] luRow = lu[row];
                __CLR4_4_1kzfkzflb90p8xe.R.inc(27233);double sum = luRow[col];
                __CLR4_4_1kzfkzflb90p8xe.R.inc(27234);for (int i = 0; (((i < col)&&(__CLR4_4_1kzfkzflb90p8xe.R.iget(27235)!=0|true))||(__CLR4_4_1kzfkzflb90p8xe.R.iget(27236)==0&false)); i++) {{
                    __CLR4_4_1kzfkzflb90p8xe.R.inc(27237);sum -= luRow[i] * lu[i][col];
                }
                }__CLR4_4_1kzfkzflb90p8xe.R.inc(27238);luRow[col] = sum;

                // maintain best permutation choice
                __CLR4_4_1kzfkzflb90p8xe.R.inc(27239);if ((((FastMath.abs(sum) > largest)&&(__CLR4_4_1kzfkzflb90p8xe.R.iget(27240)!=0|true))||(__CLR4_4_1kzfkzflb90p8xe.R.iget(27241)==0&false))) {{
                    __CLR4_4_1kzfkzflb90p8xe.R.inc(27242);largest = FastMath.abs(sum);
                    __CLR4_4_1kzfkzflb90p8xe.R.inc(27243);max = row;
                }
            }}

            // Singularity check
            }__CLR4_4_1kzfkzflb90p8xe.R.inc(27244);if ((((FastMath.abs(lu[max][col]) < singularityThreshold)&&(__CLR4_4_1kzfkzflb90p8xe.R.iget(27245)!=0|true))||(__CLR4_4_1kzfkzflb90p8xe.R.iget(27246)==0&false))) {{
                __CLR4_4_1kzfkzflb90p8xe.R.inc(27247);singular = true;
                __CLR4_4_1kzfkzflb90p8xe.R.inc(27248);return;
            }

            // Pivot if necessary
            }__CLR4_4_1kzfkzflb90p8xe.R.inc(27249);if ((((max != col)&&(__CLR4_4_1kzfkzflb90p8xe.R.iget(27250)!=0|true))||(__CLR4_4_1kzfkzflb90p8xe.R.iget(27251)==0&false))) {{
                __CLR4_4_1kzfkzflb90p8xe.R.inc(27252);double tmp = 0;
                __CLR4_4_1kzfkzflb90p8xe.R.inc(27253);final double[] luMax = lu[max];
                __CLR4_4_1kzfkzflb90p8xe.R.inc(27254);final double[] luCol = lu[col];
                __CLR4_4_1kzfkzflb90p8xe.R.inc(27255);for (int i = 0; (((i < m)&&(__CLR4_4_1kzfkzflb90p8xe.R.iget(27256)!=0|true))||(__CLR4_4_1kzfkzflb90p8xe.R.iget(27257)==0&false)); i++) {{
                    __CLR4_4_1kzfkzflb90p8xe.R.inc(27258);tmp = luMax[i];
                    __CLR4_4_1kzfkzflb90p8xe.R.inc(27259);luMax[i] = luCol[i];
                    __CLR4_4_1kzfkzflb90p8xe.R.inc(27260);luCol[i] = tmp;
                }
                }__CLR4_4_1kzfkzflb90p8xe.R.inc(27261);int temp = pivot[max];
                __CLR4_4_1kzfkzflb90p8xe.R.inc(27262);pivot[max] = pivot[col];
                __CLR4_4_1kzfkzflb90p8xe.R.inc(27263);pivot[col] = temp;
                __CLR4_4_1kzfkzflb90p8xe.R.inc(27264);even = !even;
            }

            // Divide the lower elements by the "winning" diagonal elt.
            }__CLR4_4_1kzfkzflb90p8xe.R.inc(27265);final double luDiag = lu[col][col];
            __CLR4_4_1kzfkzflb90p8xe.R.inc(27266);for (int row = col + 1; (((row < m)&&(__CLR4_4_1kzfkzflb90p8xe.R.iget(27267)!=0|true))||(__CLR4_4_1kzfkzflb90p8xe.R.iget(27268)==0&false)); row++) {{
                __CLR4_4_1kzfkzflb90p8xe.R.inc(27269);lu[row][col] /= luDiag;
            }
        }}
    }}finally{__CLR4_4_1kzfkzflb90p8xe.R.flushNeeded();}}

    /**
     * Returns the matrix L of the decomposition.
     * <p>L is a lower-triangular matrix</p>
     * @return the L matrix (or null if decomposed matrix is singular)
     */
    public RealMatrix getL() {try{__CLR4_4_1kzfkzflb90p8xe.R.inc(27270);
        __CLR4_4_1kzfkzflb90p8xe.R.inc(27271);if (((((cachedL == null) && !singular)&&(__CLR4_4_1kzfkzflb90p8xe.R.iget(27272)!=0|true))||(__CLR4_4_1kzfkzflb90p8xe.R.iget(27273)==0&false))) {{
            __CLR4_4_1kzfkzflb90p8xe.R.inc(27274);final int m = pivot.length;
            __CLR4_4_1kzfkzflb90p8xe.R.inc(27275);cachedL = MatrixUtils.createRealMatrix(m, m);
            __CLR4_4_1kzfkzflb90p8xe.R.inc(27276);for (int i = 0; (((i < m)&&(__CLR4_4_1kzfkzflb90p8xe.R.iget(27277)!=0|true))||(__CLR4_4_1kzfkzflb90p8xe.R.iget(27278)==0&false)); ++i) {{
                __CLR4_4_1kzfkzflb90p8xe.R.inc(27279);final double[] luI = lu[i];
                __CLR4_4_1kzfkzflb90p8xe.R.inc(27280);for (int j = 0; (((j < i)&&(__CLR4_4_1kzfkzflb90p8xe.R.iget(27281)!=0|true))||(__CLR4_4_1kzfkzflb90p8xe.R.iget(27282)==0&false)); ++j) {{
                    __CLR4_4_1kzfkzflb90p8xe.R.inc(27283);cachedL.setEntry(i, j, luI[j]);
                }
                }__CLR4_4_1kzfkzflb90p8xe.R.inc(27284);cachedL.setEntry(i, i, 1.0);
            }
        }}
        }__CLR4_4_1kzfkzflb90p8xe.R.inc(27285);return cachedL;
    }finally{__CLR4_4_1kzfkzflb90p8xe.R.flushNeeded();}}

    /**
     * Returns the matrix U of the decomposition.
     * <p>U is an upper-triangular matrix</p>
     * @return the U matrix (or null if decomposed matrix is singular)
     */
    public RealMatrix getU() {try{__CLR4_4_1kzfkzflb90p8xe.R.inc(27286);
        __CLR4_4_1kzfkzflb90p8xe.R.inc(27287);if (((((cachedU == null) && !singular)&&(__CLR4_4_1kzfkzflb90p8xe.R.iget(27288)!=0|true))||(__CLR4_4_1kzfkzflb90p8xe.R.iget(27289)==0&false))) {{
            __CLR4_4_1kzfkzflb90p8xe.R.inc(27290);final int m = pivot.length;
            __CLR4_4_1kzfkzflb90p8xe.R.inc(27291);cachedU = MatrixUtils.createRealMatrix(m, m);
            __CLR4_4_1kzfkzflb90p8xe.R.inc(27292);for (int i = 0; (((i < m)&&(__CLR4_4_1kzfkzflb90p8xe.R.iget(27293)!=0|true))||(__CLR4_4_1kzfkzflb90p8xe.R.iget(27294)==0&false)); ++i) {{
                __CLR4_4_1kzfkzflb90p8xe.R.inc(27295);final double[] luI = lu[i];
                __CLR4_4_1kzfkzflb90p8xe.R.inc(27296);for (int j = i; (((j < m)&&(__CLR4_4_1kzfkzflb90p8xe.R.iget(27297)!=0|true))||(__CLR4_4_1kzfkzflb90p8xe.R.iget(27298)==0&false)); ++j) {{
                    __CLR4_4_1kzfkzflb90p8xe.R.inc(27299);cachedU.setEntry(i, j, luI[j]);
                }
            }}
        }}
        }__CLR4_4_1kzfkzflb90p8xe.R.inc(27300);return cachedU;
    }finally{__CLR4_4_1kzfkzflb90p8xe.R.flushNeeded();}}

    /**
     * Returns the P rows permutation matrix.
     * <p>P is a sparse matrix with exactly one element set to 1.0 in
     * each row and each column, all other elements being set to 0.0.</p>
     * <p>The positions of the 1 elements are given by the {@link #getPivot()
     * pivot permutation vector}.</p>
     * @return the P rows permutation matrix (or null if decomposed matrix is singular)
     * @see #getPivot()
     */
    public RealMatrix getP() {try{__CLR4_4_1kzfkzflb90p8xe.R.inc(27301);
        __CLR4_4_1kzfkzflb90p8xe.R.inc(27302);if (((((cachedP == null) && !singular)&&(__CLR4_4_1kzfkzflb90p8xe.R.iget(27303)!=0|true))||(__CLR4_4_1kzfkzflb90p8xe.R.iget(27304)==0&false))) {{
            __CLR4_4_1kzfkzflb90p8xe.R.inc(27305);final int m = pivot.length;
            __CLR4_4_1kzfkzflb90p8xe.R.inc(27306);cachedP = MatrixUtils.createRealMatrix(m, m);
            __CLR4_4_1kzfkzflb90p8xe.R.inc(27307);for (int i = 0; (((i < m)&&(__CLR4_4_1kzfkzflb90p8xe.R.iget(27308)!=0|true))||(__CLR4_4_1kzfkzflb90p8xe.R.iget(27309)==0&false)); ++i) {{
                __CLR4_4_1kzfkzflb90p8xe.R.inc(27310);cachedP.setEntry(i, pivot[i], 1.0);
            }
        }}
        }__CLR4_4_1kzfkzflb90p8xe.R.inc(27311);return cachedP;
    }finally{__CLR4_4_1kzfkzflb90p8xe.R.flushNeeded();}}

    /**
     * Returns the pivot permutation vector.
     * @return the pivot permutation vector
     * @see #getP()
     */
    public int[] getPivot() {try{__CLR4_4_1kzfkzflb90p8xe.R.inc(27312);
        __CLR4_4_1kzfkzflb90p8xe.R.inc(27313);return pivot.clone();
    }finally{__CLR4_4_1kzfkzflb90p8xe.R.flushNeeded();}}

    /**
     * Return the determinant of the matrix
     * @return determinant of the matrix
     */
    public double getDeterminant() {try{__CLR4_4_1kzfkzflb90p8xe.R.inc(27314);
        __CLR4_4_1kzfkzflb90p8xe.R.inc(27315);if ((((singular)&&(__CLR4_4_1kzfkzflb90p8xe.R.iget(27316)!=0|true))||(__CLR4_4_1kzfkzflb90p8xe.R.iget(27317)==0&false))) {{
            __CLR4_4_1kzfkzflb90p8xe.R.inc(27318);return 0;
        } }else {{
            __CLR4_4_1kzfkzflb90p8xe.R.inc(27319);final int m = pivot.length;
            __CLR4_4_1kzfkzflb90p8xe.R.inc(27320);double determinant = (((even )&&(__CLR4_4_1kzfkzflb90p8xe.R.iget(27321)!=0|true))||(__CLR4_4_1kzfkzflb90p8xe.R.iget(27322)==0&false))? 1 : -1;
            __CLR4_4_1kzfkzflb90p8xe.R.inc(27323);for (int i = 0; (((i < m)&&(__CLR4_4_1kzfkzflb90p8xe.R.iget(27324)!=0|true))||(__CLR4_4_1kzfkzflb90p8xe.R.iget(27325)==0&false)); i++) {{
                __CLR4_4_1kzfkzflb90p8xe.R.inc(27326);determinant *= lu[i][i];
            }
            }__CLR4_4_1kzfkzflb90p8xe.R.inc(27327);return determinant;
        }
    }}finally{__CLR4_4_1kzfkzflb90p8xe.R.flushNeeded();}}

    /**
     * Get a solver for finding the A &times; X = B solution in exact linear
     * sense.
     * @return a solver
     */
    public DecompositionSolver getSolver() {try{__CLR4_4_1kzfkzflb90p8xe.R.inc(27328);
        __CLR4_4_1kzfkzflb90p8xe.R.inc(27329);return new Solver(lu, pivot, singular);
    }finally{__CLR4_4_1kzfkzflb90p8xe.R.flushNeeded();}}

    /** Specialized solver. */
    private static class Solver implements DecompositionSolver {

        /** Entries of LU decomposition. */
        private final double[][] lu;

        /** Pivot permutation associated with LU decomposition. */
        private final int[] pivot;

        /** Singularity indicator. */
        private final boolean singular;

        /**
         * Build a solver from decomposed matrix.
         * @param lu entries of LU decomposition
         * @param pivot pivot permutation associated with LU decomposition
         * @param singular singularity indicator
         */
        private Solver(final double[][] lu, final int[] pivot, final boolean singular) {try{__CLR4_4_1kzfkzflb90p8xe.R.inc(27330);
            __CLR4_4_1kzfkzflb90p8xe.R.inc(27331);this.lu       = lu;
            __CLR4_4_1kzfkzflb90p8xe.R.inc(27332);this.pivot    = pivot;
            __CLR4_4_1kzfkzflb90p8xe.R.inc(27333);this.singular = singular;
        }finally{__CLR4_4_1kzfkzflb90p8xe.R.flushNeeded();}}

        /** {@inheritDoc} */
        public boolean isNonSingular() {try{__CLR4_4_1kzfkzflb90p8xe.R.inc(27334);
            __CLR4_4_1kzfkzflb90p8xe.R.inc(27335);return !singular;
        }finally{__CLR4_4_1kzfkzflb90p8xe.R.flushNeeded();}}

        /** {@inheritDoc} */
        public RealVector solve(RealVector b) {try{__CLR4_4_1kzfkzflb90p8xe.R.inc(27336);
            __CLR4_4_1kzfkzflb90p8xe.R.inc(27337);final int m = pivot.length;
            __CLR4_4_1kzfkzflb90p8xe.R.inc(27338);if ((((b.getDimension() != m)&&(__CLR4_4_1kzfkzflb90p8xe.R.iget(27339)!=0|true))||(__CLR4_4_1kzfkzflb90p8xe.R.iget(27340)==0&false))) {{
                __CLR4_4_1kzfkzflb90p8xe.R.inc(27341);throw new DimensionMismatchException(b.getDimension(), m);
            }
            }__CLR4_4_1kzfkzflb90p8xe.R.inc(27342);if ((((singular)&&(__CLR4_4_1kzfkzflb90p8xe.R.iget(27343)!=0|true))||(__CLR4_4_1kzfkzflb90p8xe.R.iget(27344)==0&false))) {{
                __CLR4_4_1kzfkzflb90p8xe.R.inc(27345);throw new SingularMatrixException();
            }

            }__CLR4_4_1kzfkzflb90p8xe.R.inc(27346);final double[] bp = new double[m];

            // Apply permutations to b
            __CLR4_4_1kzfkzflb90p8xe.R.inc(27347);for (int row = 0; (((row < m)&&(__CLR4_4_1kzfkzflb90p8xe.R.iget(27348)!=0|true))||(__CLR4_4_1kzfkzflb90p8xe.R.iget(27349)==0&false)); row++) {{
                __CLR4_4_1kzfkzflb90p8xe.R.inc(27350);bp[row] = b.getEntry(pivot[row]);
            }

            // Solve LY = b
            }__CLR4_4_1kzfkzflb90p8xe.R.inc(27351);for (int col = 0; (((col < m)&&(__CLR4_4_1kzfkzflb90p8xe.R.iget(27352)!=0|true))||(__CLR4_4_1kzfkzflb90p8xe.R.iget(27353)==0&false)); col++) {{
                __CLR4_4_1kzfkzflb90p8xe.R.inc(27354);final double bpCol = bp[col];
                __CLR4_4_1kzfkzflb90p8xe.R.inc(27355);for (int i = col + 1; (((i < m)&&(__CLR4_4_1kzfkzflb90p8xe.R.iget(27356)!=0|true))||(__CLR4_4_1kzfkzflb90p8xe.R.iget(27357)==0&false)); i++) {{
                    __CLR4_4_1kzfkzflb90p8xe.R.inc(27358);bp[i] -= bpCol * lu[i][col];
                }
            }}

            // Solve UX = Y
            }__CLR4_4_1kzfkzflb90p8xe.R.inc(27359);for (int col = m - 1; (((col >= 0)&&(__CLR4_4_1kzfkzflb90p8xe.R.iget(27360)!=0|true))||(__CLR4_4_1kzfkzflb90p8xe.R.iget(27361)==0&false)); col--) {{
                __CLR4_4_1kzfkzflb90p8xe.R.inc(27362);bp[col] /= lu[col][col];
                __CLR4_4_1kzfkzflb90p8xe.R.inc(27363);final double bpCol = bp[col];
                __CLR4_4_1kzfkzflb90p8xe.R.inc(27364);for (int i = 0; (((i < col)&&(__CLR4_4_1kzfkzflb90p8xe.R.iget(27365)!=0|true))||(__CLR4_4_1kzfkzflb90p8xe.R.iget(27366)==0&false)); i++) {{
                    __CLR4_4_1kzfkzflb90p8xe.R.inc(27367);bp[i] -= bpCol * lu[i][col];
                }
            }}

            }__CLR4_4_1kzfkzflb90p8xe.R.inc(27368);return new ArrayRealVector(bp, false);
        }finally{__CLR4_4_1kzfkzflb90p8xe.R.flushNeeded();}}

        /** {@inheritDoc} */
        public RealMatrix solve(RealMatrix b) {try{__CLR4_4_1kzfkzflb90p8xe.R.inc(27369);

            __CLR4_4_1kzfkzflb90p8xe.R.inc(27370);final int m = pivot.length;
            __CLR4_4_1kzfkzflb90p8xe.R.inc(27371);if ((((b.getRowDimension() != m)&&(__CLR4_4_1kzfkzflb90p8xe.R.iget(27372)!=0|true))||(__CLR4_4_1kzfkzflb90p8xe.R.iget(27373)==0&false))) {{
                __CLR4_4_1kzfkzflb90p8xe.R.inc(27374);throw new DimensionMismatchException(b.getRowDimension(), m);
            }
            }__CLR4_4_1kzfkzflb90p8xe.R.inc(27375);if ((((singular)&&(__CLR4_4_1kzfkzflb90p8xe.R.iget(27376)!=0|true))||(__CLR4_4_1kzfkzflb90p8xe.R.iget(27377)==0&false))) {{
                __CLR4_4_1kzfkzflb90p8xe.R.inc(27378);throw new SingularMatrixException();
            }

            }__CLR4_4_1kzfkzflb90p8xe.R.inc(27379);final int nColB = b.getColumnDimension();

            // Apply permutations to b
            __CLR4_4_1kzfkzflb90p8xe.R.inc(27380);final double[][] bp = new double[m][nColB];
            __CLR4_4_1kzfkzflb90p8xe.R.inc(27381);for (int row = 0; (((row < m)&&(__CLR4_4_1kzfkzflb90p8xe.R.iget(27382)!=0|true))||(__CLR4_4_1kzfkzflb90p8xe.R.iget(27383)==0&false)); row++) {{
                __CLR4_4_1kzfkzflb90p8xe.R.inc(27384);final double[] bpRow = bp[row];
                __CLR4_4_1kzfkzflb90p8xe.R.inc(27385);final int pRow = pivot[row];
                __CLR4_4_1kzfkzflb90p8xe.R.inc(27386);for (int col = 0; (((col < nColB)&&(__CLR4_4_1kzfkzflb90p8xe.R.iget(27387)!=0|true))||(__CLR4_4_1kzfkzflb90p8xe.R.iget(27388)==0&false)); col++) {{
                    __CLR4_4_1kzfkzflb90p8xe.R.inc(27389);bpRow[col] = b.getEntry(pRow, col);
                }
            }}

            // Solve LY = b
            }__CLR4_4_1kzfkzflb90p8xe.R.inc(27390);for (int col = 0; (((col < m)&&(__CLR4_4_1kzfkzflb90p8xe.R.iget(27391)!=0|true))||(__CLR4_4_1kzfkzflb90p8xe.R.iget(27392)==0&false)); col++) {{
                __CLR4_4_1kzfkzflb90p8xe.R.inc(27393);final double[] bpCol = bp[col];
                __CLR4_4_1kzfkzflb90p8xe.R.inc(27394);for (int i = col + 1; (((i < m)&&(__CLR4_4_1kzfkzflb90p8xe.R.iget(27395)!=0|true))||(__CLR4_4_1kzfkzflb90p8xe.R.iget(27396)==0&false)); i++) {{
                    __CLR4_4_1kzfkzflb90p8xe.R.inc(27397);final double[] bpI = bp[i];
                    __CLR4_4_1kzfkzflb90p8xe.R.inc(27398);final double luICol = lu[i][col];
                    __CLR4_4_1kzfkzflb90p8xe.R.inc(27399);for (int j = 0; (((j < nColB)&&(__CLR4_4_1kzfkzflb90p8xe.R.iget(27400)!=0|true))||(__CLR4_4_1kzfkzflb90p8xe.R.iget(27401)==0&false)); j++) {{
                        __CLR4_4_1kzfkzflb90p8xe.R.inc(27402);bpI[j] -= bpCol[j] * luICol;
                    }
                }}
            }}

            // Solve UX = Y
            }__CLR4_4_1kzfkzflb90p8xe.R.inc(27403);for (int col = m - 1; (((col >= 0)&&(__CLR4_4_1kzfkzflb90p8xe.R.iget(27404)!=0|true))||(__CLR4_4_1kzfkzflb90p8xe.R.iget(27405)==0&false)); col--) {{
                __CLR4_4_1kzfkzflb90p8xe.R.inc(27406);final double[] bpCol = bp[col];
                __CLR4_4_1kzfkzflb90p8xe.R.inc(27407);final double luDiag = lu[col][col];
                __CLR4_4_1kzfkzflb90p8xe.R.inc(27408);for (int j = 0; (((j < nColB)&&(__CLR4_4_1kzfkzflb90p8xe.R.iget(27409)!=0|true))||(__CLR4_4_1kzfkzflb90p8xe.R.iget(27410)==0&false)); j++) {{
                    __CLR4_4_1kzfkzflb90p8xe.R.inc(27411);bpCol[j] /= luDiag;
                }
                }__CLR4_4_1kzfkzflb90p8xe.R.inc(27412);for (int i = 0; (((i < col)&&(__CLR4_4_1kzfkzflb90p8xe.R.iget(27413)!=0|true))||(__CLR4_4_1kzfkzflb90p8xe.R.iget(27414)==0&false)); i++) {{
                    __CLR4_4_1kzfkzflb90p8xe.R.inc(27415);final double[] bpI = bp[i];
                    __CLR4_4_1kzfkzflb90p8xe.R.inc(27416);final double luICol = lu[i][col];
                    __CLR4_4_1kzfkzflb90p8xe.R.inc(27417);for (int j = 0; (((j < nColB)&&(__CLR4_4_1kzfkzflb90p8xe.R.iget(27418)!=0|true))||(__CLR4_4_1kzfkzflb90p8xe.R.iget(27419)==0&false)); j++) {{
                        __CLR4_4_1kzfkzflb90p8xe.R.inc(27420);bpI[j] -= bpCol[j] * luICol;
                    }
                }}
            }}

            }__CLR4_4_1kzfkzflb90p8xe.R.inc(27421);return new Array2DRowRealMatrix(bp, false);
        }finally{__CLR4_4_1kzfkzflb90p8xe.R.flushNeeded();}}

        /** {@inheritDoc} */
        public RealMatrix getInverse() {try{__CLR4_4_1kzfkzflb90p8xe.R.inc(27422);
            __CLR4_4_1kzfkzflb90p8xe.R.inc(27423);return solve(MatrixUtils.createRealIdentityMatrix(pivot.length));
        }finally{__CLR4_4_1kzfkzflb90p8xe.R.flushNeeded();}}
    }
}
