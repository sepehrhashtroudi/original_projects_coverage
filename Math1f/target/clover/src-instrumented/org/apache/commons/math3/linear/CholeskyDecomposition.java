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
 * Calculates the Cholesky decomposition of a matrix.
 * <p>The Cholesky decomposition of a real symmetric positive-definite
 * matrix A consists of a lower triangular matrix L with same size such
 * that: A = LL<sup>T</sup>. In a sense, this is the square root of A.</p>
 * <p>This class is based on the class with similar name from the
 * <a href="http://math.nist.gov/javanumerics/jama/">JAMA</a> library, with the
 * following changes:</p>
 * <ul>
 *   <li>a {@link #getLT() getLT} method has been added,</li>
 *   <li>the {@code isspd} method has been removed, since the constructor of
 *   this class throws a {@link NonPositiveDefiniteMatrixException} when a
 *   matrix cannot be decomposed,</li>
 *   <li>a {@link #getDeterminant() getDeterminant} method has been added,</li>
 *   <li>the {@code solve} method has been replaced by a {@link #getSolver()
 *   getSolver} method and the equivalent method provided by the returned
 *   {@link DecompositionSolver}.</li>
 * </ul>
 *
 * @see <a href="http://mathworld.wolfram.com/CholeskyDecomposition.html">MathWorld</a>
 * @see <a href="http://en.wikipedia.org/wiki/Cholesky_decomposition">Wikipedia</a>
 * @version $Id$
 * @since 2.0 (changed to concrete class in 3.0)
 */
public class CholeskyDecomposition {public static class __CLR4_4_1jv4jv4lb90p8tt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,25891,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Default threshold above which off-diagonal elements are considered too different
     * and matrix not symmetric.
     */
    public static final double DEFAULT_RELATIVE_SYMMETRY_THRESHOLD = 1.0e-15;
    /**
     * Default threshold below which diagonal elements are considered null
     * and matrix not positive definite.
     */
    public static final double DEFAULT_ABSOLUTE_POSITIVITY_THRESHOLD = 1.0e-10;
    /** Row-oriented storage for L<sup>T</sup> matrix data. */
    private double[][] lTData;
    /** Cached value of L. */
    private RealMatrix cachedL;
    /** Cached value of LT. */
    private RealMatrix cachedLT;

    /**
     * Calculates the Cholesky decomposition of the given matrix.
     * <p>
     * Calling this constructor is equivalent to call {@link
     * #CholeskyDecomposition(RealMatrix, double, double)} with the
     * thresholds set to the default values {@link
     * #DEFAULT_RELATIVE_SYMMETRY_THRESHOLD} and {@link
     * #DEFAULT_ABSOLUTE_POSITIVITY_THRESHOLD}
     * </p>
     * @param matrix the matrix to decompose
     * @throws NonSquareMatrixException if the matrix is not square.
     * @throws NonSymmetricMatrixException if the matrix is not symmetric.
     * @throws NonPositiveDefiniteMatrixException if the matrix is not
     * strictly positive definite.
     * @see #CholeskyDecomposition(RealMatrix, double, double)
     * @see #DEFAULT_RELATIVE_SYMMETRY_THRESHOLD
     * @see #DEFAULT_ABSOLUTE_POSITIVITY_THRESHOLD
     */
    public CholeskyDecomposition(final RealMatrix matrix) {
        this(matrix, DEFAULT_RELATIVE_SYMMETRY_THRESHOLD,
             DEFAULT_ABSOLUTE_POSITIVITY_THRESHOLD);__CLR4_4_1jv4jv4lb90p8tt.R.inc(25745);try{__CLR4_4_1jv4jv4lb90p8tt.R.inc(25744);
    }finally{__CLR4_4_1jv4jv4lb90p8tt.R.flushNeeded();}}

    /**
     * Calculates the Cholesky decomposition of the given matrix.
     * @param matrix the matrix to decompose
     * @param relativeSymmetryThreshold threshold above which off-diagonal
     * elements are considered too different and matrix not symmetric
     * @param absolutePositivityThreshold threshold below which diagonal
     * elements are considered null and matrix not positive definite
     * @throws NonSquareMatrixException if the matrix is not square.
     * @throws NonSymmetricMatrixException if the matrix is not symmetric.
     * @throws NonPositiveDefiniteMatrixException if the matrix is not
     * strictly positive definite.
     * @see #CholeskyDecomposition(RealMatrix)
     * @see #DEFAULT_RELATIVE_SYMMETRY_THRESHOLD
     * @see #DEFAULT_ABSOLUTE_POSITIVITY_THRESHOLD
     */
    public CholeskyDecomposition(final RealMatrix matrix,
                                     final double relativeSymmetryThreshold,
                                     final double absolutePositivityThreshold) {try{__CLR4_4_1jv4jv4lb90p8tt.R.inc(25746);
        __CLR4_4_1jv4jv4lb90p8tt.R.inc(25747);if ((((!matrix.isSquare())&&(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25748)!=0|true))||(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25749)==0&false))) {{
            __CLR4_4_1jv4jv4lb90p8tt.R.inc(25750);throw new NonSquareMatrixException(matrix.getRowDimension(),
                                               matrix.getColumnDimension());
        }

        }__CLR4_4_1jv4jv4lb90p8tt.R.inc(25751);final int order = matrix.getRowDimension();
        __CLR4_4_1jv4jv4lb90p8tt.R.inc(25752);lTData   = matrix.getData();
        __CLR4_4_1jv4jv4lb90p8tt.R.inc(25753);cachedL  = null;
        __CLR4_4_1jv4jv4lb90p8tt.R.inc(25754);cachedLT = null;

        // check the matrix before transformation
        __CLR4_4_1jv4jv4lb90p8tt.R.inc(25755);for (int i = 0; (((i < order)&&(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25756)!=0|true))||(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25757)==0&false)); ++i) {{
            __CLR4_4_1jv4jv4lb90p8tt.R.inc(25758);final double[] lI = lTData[i];

            // check off-diagonal elements (and reset them to 0)
            __CLR4_4_1jv4jv4lb90p8tt.R.inc(25759);for (int j = i + 1; (((j < order)&&(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25760)!=0|true))||(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25761)==0&false)); ++j) {{
                __CLR4_4_1jv4jv4lb90p8tt.R.inc(25762);final double[] lJ = lTData[j];
                __CLR4_4_1jv4jv4lb90p8tt.R.inc(25763);final double lIJ = lI[j];
                __CLR4_4_1jv4jv4lb90p8tt.R.inc(25764);final double lJI = lJ[i];
                __CLR4_4_1jv4jv4lb90p8tt.R.inc(25765);final double maxDelta =
                    relativeSymmetryThreshold * FastMath.max(FastMath.abs(lIJ), FastMath.abs(lJI));
                __CLR4_4_1jv4jv4lb90p8tt.R.inc(25766);if ((((FastMath.abs(lIJ - lJI) > maxDelta)&&(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25767)!=0|true))||(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25768)==0&false))) {{
                    __CLR4_4_1jv4jv4lb90p8tt.R.inc(25769);throw new NonSymmetricMatrixException(i, j, relativeSymmetryThreshold);
                }
                }__CLR4_4_1jv4jv4lb90p8tt.R.inc(25770);lJ[i] = 0;
           }
        }}

        // transform the matrix
        }__CLR4_4_1jv4jv4lb90p8tt.R.inc(25771);for (int i = 0; (((i < order)&&(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25772)!=0|true))||(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25773)==0&false)); ++i) {{

            __CLR4_4_1jv4jv4lb90p8tt.R.inc(25774);final double[] ltI = lTData[i];

            // check diagonal element
            __CLR4_4_1jv4jv4lb90p8tt.R.inc(25775);if ((((ltI[i] <= absolutePositivityThreshold)&&(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25776)!=0|true))||(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25777)==0&false))) {{
                __CLR4_4_1jv4jv4lb90p8tt.R.inc(25778);throw new NonPositiveDefiniteMatrixException(ltI[i], i, absolutePositivityThreshold);
            }

            }__CLR4_4_1jv4jv4lb90p8tt.R.inc(25779);ltI[i] = FastMath.sqrt(ltI[i]);
            __CLR4_4_1jv4jv4lb90p8tt.R.inc(25780);final double inverse = 1.0 / ltI[i];

            __CLR4_4_1jv4jv4lb90p8tt.R.inc(25781);for (int q = order - 1; (((q > i)&&(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25782)!=0|true))||(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25783)==0&false)); --q) {{
                __CLR4_4_1jv4jv4lb90p8tt.R.inc(25784);ltI[q] *= inverse;
                __CLR4_4_1jv4jv4lb90p8tt.R.inc(25785);final double[] ltQ = lTData[q];
                __CLR4_4_1jv4jv4lb90p8tt.R.inc(25786);for (int p = q; (((p < order)&&(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25787)!=0|true))||(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25788)==0&false)); ++p) {{
                    __CLR4_4_1jv4jv4lb90p8tt.R.inc(25789);ltQ[p] -= ltI[q] * ltI[p];
                }
            }}
        }}
    }}finally{__CLR4_4_1jv4jv4lb90p8tt.R.flushNeeded();}}

    /**
     * Returns the matrix L of the decomposition.
     * <p>L is an lower-triangular matrix</p>
     * @return the L matrix
     */
    public RealMatrix getL() {try{__CLR4_4_1jv4jv4lb90p8tt.R.inc(25790);
        __CLR4_4_1jv4jv4lb90p8tt.R.inc(25791);if ((((cachedL == null)&&(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25792)!=0|true))||(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25793)==0&false))) {{
            __CLR4_4_1jv4jv4lb90p8tt.R.inc(25794);cachedL = getLT().transpose();
        }
        }__CLR4_4_1jv4jv4lb90p8tt.R.inc(25795);return cachedL;
    }finally{__CLR4_4_1jv4jv4lb90p8tt.R.flushNeeded();}}

    /**
     * Returns the transpose of the matrix L of the decomposition.
     * <p>L<sup>T</sup> is an upper-triangular matrix</p>
     * @return the transpose of the matrix L of the decomposition
     */
    public RealMatrix getLT() {try{__CLR4_4_1jv4jv4lb90p8tt.R.inc(25796);

        __CLR4_4_1jv4jv4lb90p8tt.R.inc(25797);if ((((cachedLT == null)&&(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25798)!=0|true))||(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25799)==0&false))) {{
            __CLR4_4_1jv4jv4lb90p8tt.R.inc(25800);cachedLT = MatrixUtils.createRealMatrix(lTData);
        }

        // return the cached matrix
        }__CLR4_4_1jv4jv4lb90p8tt.R.inc(25801);return cachedLT;
    }finally{__CLR4_4_1jv4jv4lb90p8tt.R.flushNeeded();}}

    /**
     * Return the determinant of the matrix
     * @return determinant of the matrix
     */
    public double getDeterminant() {try{__CLR4_4_1jv4jv4lb90p8tt.R.inc(25802);
        __CLR4_4_1jv4jv4lb90p8tt.R.inc(25803);double determinant = 1.0;
        __CLR4_4_1jv4jv4lb90p8tt.R.inc(25804);for (int i = 0; (((i < lTData.length)&&(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25805)!=0|true))||(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25806)==0&false)); ++i) {{
            __CLR4_4_1jv4jv4lb90p8tt.R.inc(25807);double lTii = lTData[i][i];
            __CLR4_4_1jv4jv4lb90p8tt.R.inc(25808);determinant *= lTii * lTii;
        }
        }__CLR4_4_1jv4jv4lb90p8tt.R.inc(25809);return determinant;
    }finally{__CLR4_4_1jv4jv4lb90p8tt.R.flushNeeded();}}

    /**
     * Get a solver for finding the A &times; X = B solution in least square sense.
     * @return a solver
     */
    public DecompositionSolver getSolver() {try{__CLR4_4_1jv4jv4lb90p8tt.R.inc(25810);
        __CLR4_4_1jv4jv4lb90p8tt.R.inc(25811);return new Solver(lTData);
    }finally{__CLR4_4_1jv4jv4lb90p8tt.R.flushNeeded();}}

    /** Specialized solver. */
    private static class Solver implements DecompositionSolver {
        /** Row-oriented storage for L<sup>T</sup> matrix data. */
        private final double[][] lTData;

        /**
         * Build a solver from decomposed matrix.
         * @param lTData row-oriented storage for L<sup>T</sup> matrix data
         */
        private Solver(final double[][] lTData) {try{__CLR4_4_1jv4jv4lb90p8tt.R.inc(25812);
            __CLR4_4_1jv4jv4lb90p8tt.R.inc(25813);this.lTData = lTData;
        }finally{__CLR4_4_1jv4jv4lb90p8tt.R.flushNeeded();}}

        /** {@inheritDoc} */
        public boolean isNonSingular() {try{__CLR4_4_1jv4jv4lb90p8tt.R.inc(25814);
            // if we get this far, the matrix was positive definite, hence non-singular
            __CLR4_4_1jv4jv4lb90p8tt.R.inc(25815);return true;
        }finally{__CLR4_4_1jv4jv4lb90p8tt.R.flushNeeded();}}

        /** {@inheritDoc} */
        public RealVector solve(final RealVector b) {try{__CLR4_4_1jv4jv4lb90p8tt.R.inc(25816);
            __CLR4_4_1jv4jv4lb90p8tt.R.inc(25817);final int m = lTData.length;
            __CLR4_4_1jv4jv4lb90p8tt.R.inc(25818);if ((((b.getDimension() != m)&&(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25819)!=0|true))||(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25820)==0&false))) {{
                __CLR4_4_1jv4jv4lb90p8tt.R.inc(25821);throw new DimensionMismatchException(b.getDimension(), m);
            }

            }__CLR4_4_1jv4jv4lb90p8tt.R.inc(25822);final double[] x = b.toArray();

            // Solve LY = b
            __CLR4_4_1jv4jv4lb90p8tt.R.inc(25823);for (int j = 0; (((j < m)&&(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25824)!=0|true))||(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25825)==0&false)); j++) {{
                __CLR4_4_1jv4jv4lb90p8tt.R.inc(25826);final double[] lJ = lTData[j];
                __CLR4_4_1jv4jv4lb90p8tt.R.inc(25827);x[j] /= lJ[j];
                __CLR4_4_1jv4jv4lb90p8tt.R.inc(25828);final double xJ = x[j];
                __CLR4_4_1jv4jv4lb90p8tt.R.inc(25829);for (int i = j + 1; (((i < m)&&(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25830)!=0|true))||(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25831)==0&false)); i++) {{
                    __CLR4_4_1jv4jv4lb90p8tt.R.inc(25832);x[i] -= xJ * lJ[i];
                }
            }}

            // Solve LTX = Y
            }__CLR4_4_1jv4jv4lb90p8tt.R.inc(25833);for (int j = m - 1; (((j >= 0)&&(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25834)!=0|true))||(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25835)==0&false)); j--) {{
                __CLR4_4_1jv4jv4lb90p8tt.R.inc(25836);x[j] /= lTData[j][j];
                __CLR4_4_1jv4jv4lb90p8tt.R.inc(25837);final double xJ = x[j];
                __CLR4_4_1jv4jv4lb90p8tt.R.inc(25838);for (int i = 0; (((i < j)&&(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25839)!=0|true))||(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25840)==0&false)); i++) {{
                    __CLR4_4_1jv4jv4lb90p8tt.R.inc(25841);x[i] -= xJ * lTData[i][j];
                }
            }}

            }__CLR4_4_1jv4jv4lb90p8tt.R.inc(25842);return new ArrayRealVector(x, false);
        }finally{__CLR4_4_1jv4jv4lb90p8tt.R.flushNeeded();}}

        /** {@inheritDoc} */
        public RealMatrix solve(RealMatrix b) {try{__CLR4_4_1jv4jv4lb90p8tt.R.inc(25843);
            __CLR4_4_1jv4jv4lb90p8tt.R.inc(25844);final int m = lTData.length;
            __CLR4_4_1jv4jv4lb90p8tt.R.inc(25845);if ((((b.getRowDimension() != m)&&(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25846)!=0|true))||(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25847)==0&false))) {{
                __CLR4_4_1jv4jv4lb90p8tt.R.inc(25848);throw new DimensionMismatchException(b.getRowDimension(), m);
            }

            }__CLR4_4_1jv4jv4lb90p8tt.R.inc(25849);final int nColB = b.getColumnDimension();
            __CLR4_4_1jv4jv4lb90p8tt.R.inc(25850);final double[][] x = b.getData();

            // Solve LY = b
            __CLR4_4_1jv4jv4lb90p8tt.R.inc(25851);for (int j = 0; (((j < m)&&(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25852)!=0|true))||(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25853)==0&false)); j++) {{
                __CLR4_4_1jv4jv4lb90p8tt.R.inc(25854);final double[] lJ = lTData[j];
                __CLR4_4_1jv4jv4lb90p8tt.R.inc(25855);final double lJJ = lJ[j];
                __CLR4_4_1jv4jv4lb90p8tt.R.inc(25856);final double[] xJ = x[j];
                __CLR4_4_1jv4jv4lb90p8tt.R.inc(25857);for (int k = 0; (((k < nColB)&&(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25858)!=0|true))||(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25859)==0&false)); ++k) {{
                    __CLR4_4_1jv4jv4lb90p8tt.R.inc(25860);xJ[k] /= lJJ;
                }
                }__CLR4_4_1jv4jv4lb90p8tt.R.inc(25861);for (int i = j + 1; (((i < m)&&(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25862)!=0|true))||(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25863)==0&false)); i++) {{
                    __CLR4_4_1jv4jv4lb90p8tt.R.inc(25864);final double[] xI = x[i];
                    __CLR4_4_1jv4jv4lb90p8tt.R.inc(25865);final double lJI = lJ[i];
                    __CLR4_4_1jv4jv4lb90p8tt.R.inc(25866);for (int k = 0; (((k < nColB)&&(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25867)!=0|true))||(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25868)==0&false)); ++k) {{
                        __CLR4_4_1jv4jv4lb90p8tt.R.inc(25869);xI[k] -= xJ[k] * lJI;
                    }
                }}
            }}

            // Solve LTX = Y
            }__CLR4_4_1jv4jv4lb90p8tt.R.inc(25870);for (int j = m - 1; (((j >= 0)&&(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25871)!=0|true))||(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25872)==0&false)); j--) {{
                __CLR4_4_1jv4jv4lb90p8tt.R.inc(25873);final double lJJ = lTData[j][j];
                __CLR4_4_1jv4jv4lb90p8tt.R.inc(25874);final double[] xJ = x[j];
                __CLR4_4_1jv4jv4lb90p8tt.R.inc(25875);for (int k = 0; (((k < nColB)&&(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25876)!=0|true))||(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25877)==0&false)); ++k) {{
                    __CLR4_4_1jv4jv4lb90p8tt.R.inc(25878);xJ[k] /= lJJ;
                }
                }__CLR4_4_1jv4jv4lb90p8tt.R.inc(25879);for (int i = 0; (((i < j)&&(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25880)!=0|true))||(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25881)==0&false)); i++) {{
                    __CLR4_4_1jv4jv4lb90p8tt.R.inc(25882);final double[] xI = x[i];
                    __CLR4_4_1jv4jv4lb90p8tt.R.inc(25883);final double lIJ = lTData[i][j];
                    __CLR4_4_1jv4jv4lb90p8tt.R.inc(25884);for (int k = 0; (((k < nColB)&&(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25885)!=0|true))||(__CLR4_4_1jv4jv4lb90p8tt.R.iget(25886)==0&false)); ++k) {{
                        __CLR4_4_1jv4jv4lb90p8tt.R.inc(25887);xI[k] -= xJ[k] * lIJ;
                    }
                }}
            }}

            }__CLR4_4_1jv4jv4lb90p8tt.R.inc(25888);return new Array2DRowRealMatrix(x);
        }finally{__CLR4_4_1jv4jv4lb90p8tt.R.flushNeeded();}}

        /** {@inheritDoc} */
        public RealMatrix getInverse() {try{__CLR4_4_1jv4jv4lb90p8tt.R.inc(25889);
            __CLR4_4_1jv4jv4lb90p8tt.R.inc(25890);return solve(MatrixUtils.createRealIdentityMatrix(lTData.length));
        }finally{__CLR4_4_1jv4jv4lb90p8tt.R.flushNeeded();}}
    }
}
