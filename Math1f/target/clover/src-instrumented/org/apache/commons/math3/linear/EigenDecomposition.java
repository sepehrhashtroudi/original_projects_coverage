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

import org.apache.commons.math3.complex.Complex;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.Precision;
import org.apache.commons.math3.util.FastMath;

/**
 * Calculates the eigen decomposition of a real matrix.
 * <p>The eigen decomposition of matrix A is a set of two matrices:
 * V and D such that A = V &times; D &times; V<sup>T</sup>.
 * A, V and D are all m &times; m matrices.</p>
 * <p>This class is similar in spirit to the <code>EigenvalueDecomposition</code>
 * class from the <a href="http://math.nist.gov/javanumerics/jama/">JAMA</a>
 * library, with the following changes:</p>
 * <ul>
 *   <li>a {@link #getVT() getVt} method has been added,</li>
 *   <li>two {@link #getRealEigenvalue(int) getRealEigenvalue} and {@link #getImagEigenvalue(int)
 *   getImagEigenvalue} methods to pick up a single eigenvalue have been added,</li>
 *   <li>a {@link #getEigenvector(int) getEigenvector} method to pick up a single
 *   eigenvector has been added,</li>
 *   <li>a {@link #getDeterminant() getDeterminant} method has been added.</li>
 *   <li>a {@link #getSolver() getSolver} method has been added.</li>
 * </ul>
 * <p>
 * As of 3.1, this class supports general real matrices (both symmetric and non-symmetric):
 * </p>
 * <p>
 * If A is symmetric, then A = V*D*V' where the eigenvalue matrix D is diagonal and the eigenvector
 * matrix V is orthogonal, i.e. A = V.multiply(D.multiply(V.transpose())) and
 * V.multiply(V.transpose()) equals the identity matrix.
 * </p>
 * <p>
 * If A is not symmetric, then the eigenvalue matrix D is block diagonal with the real eigenvalues
 * in 1-by-1 blocks and any complex eigenvalues, lambda + i*mu, in 2-by-2 blocks:
 * <pre>
 *    [lambda, mu    ]
 *    [   -mu, lambda]
 * </pre>
 * The columns of V represent the eigenvectors in the sense that A*V = V*D,
 * i.e. A.multiply(V) equals V.multiply(D).
 * The matrix V may be badly conditioned, or even singular, so the validity of the equation
 * A = V*D*inverse(V) depends upon the condition of V.
 * </p>
 * <p>
 * This implementation is based on the paper by A. Drubrulle, R.S. Martin and
 * J.H. Wilkinson "The Implicit QL Algorithm" in Wilksinson and Reinsch (1971)
 * Handbook for automatic computation, vol. 2, Linear algebra, Springer-Verlag,
 * New-York
 * </p>
 * @see <a href="http://mathworld.wolfram.com/EigenDecomposition.html">MathWorld</a>
 * @see <a href="http://en.wikipedia.org/wiki/Eigendecomposition_of_a_matrix">Wikipedia</a>
 * @version $Id$
 * @since 2.0 (changed to concrete class in 3.0)
 */
public class EigenDecomposition {public static class __CLR4_4_1k66k66lb90p8vh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,26713,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Internally used epsilon criteria. */
    private static final double EPSILON = 1e-12;
    /** Maximum number of iterations accepted in the implicit QL transformation */
    private byte maxIter = 30;
    /** Main diagonal of the tridiagonal matrix. */
    private double[] main;
    /** Secondary diagonal of the tridiagonal matrix. */
    private double[] secondary;
    /**
     * Transformer to tridiagonal (may be null if matrix is already
     * tridiagonal).
     */
    private TriDiagonalTransformer transformer;
    /** Real part of the realEigenvalues. */
    private double[] realEigenvalues;
    /** Imaginary part of the realEigenvalues. */
    private double[] imagEigenvalues;
    /** Eigenvectors. */
    private ArrayRealVector[] eigenvectors;
    /** Cached value of V. */
    private RealMatrix cachedV;
    /** Cached value of D. */
    private RealMatrix cachedD;
    /** Cached value of Vt. */
    private RealMatrix cachedVt;
    /** Whether the matrix is symmetric. */
    private final boolean isSymmetric;

    /**
     * Calculates the eigen decomposition of the given real matrix.
     * <p>
     * Supports decomposition of a general matrix since 3.1.
     *
     * @param matrix Matrix to decompose.
     * @throws MaxCountExceededException if the algorithm fails to converge.
     * @throws MathArithmeticException if the decomposition of a general matrix
     * results in a matrix with zero norm
     * @since 3.1
     */
    public EigenDecomposition(final RealMatrix matrix)
        throws MathArithmeticException {try{__CLR4_4_1k66k66lb90p8vh.R.inc(26142);
        __CLR4_4_1k66k66lb90p8vh.R.inc(26143);final double symTol = 10 * matrix.getRowDimension() * matrix.getColumnDimension() * Precision.EPSILON;
        __CLR4_4_1k66k66lb90p8vh.R.inc(26144);isSymmetric = MatrixUtils.isSymmetric(matrix, symTol);
        __CLR4_4_1k66k66lb90p8vh.R.inc(26145);if ((((isSymmetric)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26146)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26147)==0&false))) {{
            __CLR4_4_1k66k66lb90p8vh.R.inc(26148);transformToTridiagonal(matrix);
            __CLR4_4_1k66k66lb90p8vh.R.inc(26149);findEigenVectors(transformer.getQ().getData());
        } }else {{
            __CLR4_4_1k66k66lb90p8vh.R.inc(26150);final SchurTransformer t = transformToSchur(matrix);
            __CLR4_4_1k66k66lb90p8vh.R.inc(26151);findEigenVectorsFromSchur(t);
        }
    }}finally{__CLR4_4_1k66k66lb90p8vh.R.flushNeeded();}}

    /**
     * Calculates the eigen decomposition of the given real matrix.
     *
     * @param matrix Matrix to decompose.
     * @param splitTolerance Dummy parameter (present for backward
     * compatibility only).
     * @throws MathArithmeticException  if the decomposition of a general matrix
     * results in a matrix with zero norm
     * @throws MaxCountExceededException if the algorithm fails to converge.
     * @deprecated in 3.1 (to be removed in 4.0) due to unused parameter
     */
    @Deprecated
    public EigenDecomposition(final RealMatrix matrix,
                              final double splitTolerance)
        throws MathArithmeticException {
        this(matrix);__CLR4_4_1k66k66lb90p8vh.R.inc(26153);try{__CLR4_4_1k66k66lb90p8vh.R.inc(26152);
    }finally{__CLR4_4_1k66k66lb90p8vh.R.flushNeeded();}}

    /**
     * Calculates the eigen decomposition of the symmetric tridiagonal
     * matrix.  The Householder matrix is assumed to be the identity matrix.
     *
     * @param main Main diagonal of the symmetric tridiagonal form.
     * @param secondary Secondary of the tridiagonal form.
     * @throws MaxCountExceededException if the algorithm fails to converge.
     * @since 3.1
     */
    public EigenDecomposition(final double[] main, final double[] secondary) {try{__CLR4_4_1k66k66lb90p8vh.R.inc(26154);
        __CLR4_4_1k66k66lb90p8vh.R.inc(26155);isSymmetric = true;
        __CLR4_4_1k66k66lb90p8vh.R.inc(26156);this.main      = main.clone();
        __CLR4_4_1k66k66lb90p8vh.R.inc(26157);this.secondary = secondary.clone();
        __CLR4_4_1k66k66lb90p8vh.R.inc(26158);transformer    = null;
        __CLR4_4_1k66k66lb90p8vh.R.inc(26159);final int size = main.length;
        __CLR4_4_1k66k66lb90p8vh.R.inc(26160);final double[][] z = new double[size][size];
        __CLR4_4_1k66k66lb90p8vh.R.inc(26161);for (int i = 0; (((i < size)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26162)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26163)==0&false)); i++) {{
            __CLR4_4_1k66k66lb90p8vh.R.inc(26164);z[i][i] = 1.0;
        }
        }__CLR4_4_1k66k66lb90p8vh.R.inc(26165);findEigenVectors(z);
    }finally{__CLR4_4_1k66k66lb90p8vh.R.flushNeeded();}}

    /**
     * Calculates the eigen decomposition of the symmetric tridiagonal
     * matrix.  The Householder matrix is assumed to be the identity matrix.
     *
     * @param main Main diagonal of the symmetric tridiagonal form.
     * @param secondary Secondary of the tridiagonal form.
     * @param splitTolerance Dummy parameter (present for backward
     * compatibility only).
     * @throws MaxCountExceededException if the algorithm fails to converge.
     * @deprecated in 3.1 (to be removed in 4.0) due to unused parameter
     */
    @Deprecated
    public EigenDecomposition(final double[] main, final double[] secondary,
                              final double splitTolerance) {
        this(main, secondary);__CLR4_4_1k66k66lb90p8vh.R.inc(26167);try{__CLR4_4_1k66k66lb90p8vh.R.inc(26166);
    }finally{__CLR4_4_1k66k66lb90p8vh.R.flushNeeded();}}

    /**
     * Gets the matrix V of the decomposition.
     * V is an orthogonal matrix, i.e. its transpose is also its inverse.
     * The columns of V are the eigenvectors of the original matrix.
     * No assumption is made about the orientation of the system axes formed
     * by the columns of V (e.g. in a 3-dimension space, V can form a left-
     * or right-handed system).
     *
     * @return the V matrix.
     */
    public RealMatrix getV() {try{__CLR4_4_1k66k66lb90p8vh.R.inc(26168);

        __CLR4_4_1k66k66lb90p8vh.R.inc(26169);if ((((cachedV == null)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26170)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26171)==0&false))) {{
            __CLR4_4_1k66k66lb90p8vh.R.inc(26172);final int m = eigenvectors.length;
            __CLR4_4_1k66k66lb90p8vh.R.inc(26173);cachedV = MatrixUtils.createRealMatrix(m, m);
            __CLR4_4_1k66k66lb90p8vh.R.inc(26174);for (int k = 0; (((k < m)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26175)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26176)==0&false)); ++k) {{
                __CLR4_4_1k66k66lb90p8vh.R.inc(26177);cachedV.setColumnVector(k, eigenvectors[k]);
            }
        }}
        // return the cached matrix
        }__CLR4_4_1k66k66lb90p8vh.R.inc(26178);return cachedV;
    }finally{__CLR4_4_1k66k66lb90p8vh.R.flushNeeded();}}

    /**
     * Gets the block diagonal matrix D of the decomposition.
     * D is a block diagonal matrix.
     * Real eigenvalues are on the diagonal while complex values are on
     * 2x2 blocks { {real +imaginary}, {-imaginary, real} }.
     *
     * @return the D matrix.
     *
     * @see #getRealEigenvalues()
     * @see #getImagEigenvalues()
     */
    public RealMatrix getD() {try{__CLR4_4_1k66k66lb90p8vh.R.inc(26179);

        __CLR4_4_1k66k66lb90p8vh.R.inc(26180);if ((((cachedD == null)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26181)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26182)==0&false))) {{
            // cache the matrix for subsequent calls
            __CLR4_4_1k66k66lb90p8vh.R.inc(26183);cachedD = MatrixUtils.createRealDiagonalMatrix(realEigenvalues);

            __CLR4_4_1k66k66lb90p8vh.R.inc(26184);for (int i = 0; (((i < imagEigenvalues.length)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26185)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26186)==0&false)); i++) {{
                __CLR4_4_1k66k66lb90p8vh.R.inc(26187);if ((((Precision.compareTo(imagEigenvalues[i], 0.0, EPSILON) > 0)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26188)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26189)==0&false))) {{
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26190);cachedD.setEntry(i, i+1, imagEigenvalues[i]);
                } }else {__CLR4_4_1k66k66lb90p8vh.R.inc(26191);if ((((Precision.compareTo(imagEigenvalues[i], 0.0, EPSILON) < 0)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26192)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26193)==0&false))) {{
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26194);cachedD.setEntry(i, i-1, imagEigenvalues[i]);
                }
            }}}
        }}
        }__CLR4_4_1k66k66lb90p8vh.R.inc(26195);return cachedD;
    }finally{__CLR4_4_1k66k66lb90p8vh.R.flushNeeded();}}

    /**
     * Gets the transpose of the matrix V of the decomposition.
     * V is an orthogonal matrix, i.e. its transpose is also its inverse.
     * The columns of V are the eigenvectors of the original matrix.
     * No assumption is made about the orientation of the system axes formed
     * by the columns of V (e.g. in a 3-dimension space, V can form a left-
     * or right-handed system).
     *
     * @return the transpose of the V matrix.
     */
    public RealMatrix getVT() {try{__CLR4_4_1k66k66lb90p8vh.R.inc(26196);

        __CLR4_4_1k66k66lb90p8vh.R.inc(26197);if ((((cachedVt == null)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26198)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26199)==0&false))) {{
            __CLR4_4_1k66k66lb90p8vh.R.inc(26200);final int m = eigenvectors.length;
            __CLR4_4_1k66k66lb90p8vh.R.inc(26201);cachedVt = MatrixUtils.createRealMatrix(m, m);
            __CLR4_4_1k66k66lb90p8vh.R.inc(26202);for (int k = 0; (((k < m)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26203)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26204)==0&false)); ++k) {{
                __CLR4_4_1k66k66lb90p8vh.R.inc(26205);cachedVt.setRowVector(k, eigenvectors[k]);
            }
        }}

        // return the cached matrix
        }__CLR4_4_1k66k66lb90p8vh.R.inc(26206);return cachedVt;
    }finally{__CLR4_4_1k66k66lb90p8vh.R.flushNeeded();}}

    /**
     * Returns whether the calculated eigen values are complex or real.
     * <p>The method performs a zero check for each element of the
     * {@link #getImagEigenvalues()} array and returns {@code true} if any
     * element is not equal to zero.
     *
     * @return {@code true} if the eigen values are complex, {@code false} otherwise
     * @since 3.1
     */
    public boolean hasComplexEigenvalues() {try{__CLR4_4_1k66k66lb90p8vh.R.inc(26207);
        __CLR4_4_1k66k66lb90p8vh.R.inc(26208);for (int i = 0; (((i < imagEigenvalues.length)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26209)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26210)==0&false)); i++) {{
            __CLR4_4_1k66k66lb90p8vh.R.inc(26211);if ((((!Precision.equals(imagEigenvalues[i], 0.0, EPSILON))&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26212)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26213)==0&false))) {{
                __CLR4_4_1k66k66lb90p8vh.R.inc(26214);return true;
            }
        }}
        }__CLR4_4_1k66k66lb90p8vh.R.inc(26215);return false;
    }finally{__CLR4_4_1k66k66lb90p8vh.R.flushNeeded();}}

    /**
     * Gets a copy of the real parts of the eigenvalues of the original matrix.
     *
     * @return a copy of the real parts of the eigenvalues of the original matrix.
     *
     * @see #getD()
     * @see #getRealEigenvalue(int)
     * @see #getImagEigenvalues()
     */
    public double[] getRealEigenvalues() {try{__CLR4_4_1k66k66lb90p8vh.R.inc(26216);
        __CLR4_4_1k66k66lb90p8vh.R.inc(26217);return realEigenvalues.clone();
    }finally{__CLR4_4_1k66k66lb90p8vh.R.flushNeeded();}}

    /**
     * Returns the real part of the i<sup>th</sup> eigenvalue of the original
     * matrix.
     *
     * @param i index of the eigenvalue (counting from 0)
     * @return real part of the i<sup>th</sup> eigenvalue of the original
     * matrix.
     *
     * @see #getD()
     * @see #getRealEigenvalues()
     * @see #getImagEigenvalue(int)
     */
    public double getRealEigenvalue(final int i) {try{__CLR4_4_1k66k66lb90p8vh.R.inc(26218);
        __CLR4_4_1k66k66lb90p8vh.R.inc(26219);return realEigenvalues[i];
    }finally{__CLR4_4_1k66k66lb90p8vh.R.flushNeeded();}}

    /**
     * Gets a copy of the imaginary parts of the eigenvalues of the original
     * matrix.
     *
     * @return a copy of the imaginary parts of the eigenvalues of the original
     * matrix.
     *
     * @see #getD()
     * @see #getImagEigenvalue(int)
     * @see #getRealEigenvalues()
     */
    public double[] getImagEigenvalues() {try{__CLR4_4_1k66k66lb90p8vh.R.inc(26220);
        __CLR4_4_1k66k66lb90p8vh.R.inc(26221);return imagEigenvalues.clone();
    }finally{__CLR4_4_1k66k66lb90p8vh.R.flushNeeded();}}

    /**
     * Gets the imaginary part of the i<sup>th</sup> eigenvalue of the original
     * matrix.
     *
     * @param i Index of the eigenvalue (counting from 0).
     * @return the imaginary part of the i<sup>th</sup> eigenvalue of the original
     * matrix.
     *
     * @see #getD()
     * @see #getImagEigenvalues()
     * @see #getRealEigenvalue(int)
     */
    public double getImagEigenvalue(final int i) {try{__CLR4_4_1k66k66lb90p8vh.R.inc(26222);
        __CLR4_4_1k66k66lb90p8vh.R.inc(26223);return imagEigenvalues[i];
    }finally{__CLR4_4_1k66k66lb90p8vh.R.flushNeeded();}}

    /**
     * Gets a copy of the i<sup>th</sup> eigenvector of the original matrix.
     *
     * @param i Index of the eigenvector (counting from 0).
     * @return a copy of the i<sup>th</sup> eigenvector of the original matrix.
     * @see #getD()
     */
    public RealVector getEigenvector(final int i) {try{__CLR4_4_1k66k66lb90p8vh.R.inc(26224);
        __CLR4_4_1k66k66lb90p8vh.R.inc(26225);return eigenvectors[i].copy();
    }finally{__CLR4_4_1k66k66lb90p8vh.R.flushNeeded();}}

    /**
     * Computes the determinant of the matrix.
     *
     * @return the determinant of the matrix.
     */
    public double getDeterminant() {try{__CLR4_4_1k66k66lb90p8vh.R.inc(26226);
        __CLR4_4_1k66k66lb90p8vh.R.inc(26227);double determinant = 1;
        __CLR4_4_1k66k66lb90p8vh.R.inc(26228);for (double lambda : realEigenvalues) {{
            __CLR4_4_1k66k66lb90p8vh.R.inc(26229);determinant *= lambda;
        }
        }__CLR4_4_1k66k66lb90p8vh.R.inc(26230);return determinant;
    }finally{__CLR4_4_1k66k66lb90p8vh.R.flushNeeded();}}

    /**
     * Computes the square-root of the matrix.
     * This implementation assumes that the matrix is symmetric and positive
     * definite.
     *
     * @return the square-root of the matrix.
     * @throws MathUnsupportedOperationException if the matrix is not
     * symmetric or not positive definite.
     * @since 3.1
     */
    public RealMatrix getSquareRoot() {try{__CLR4_4_1k66k66lb90p8vh.R.inc(26231);
        __CLR4_4_1k66k66lb90p8vh.R.inc(26232);if ((((!isSymmetric)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26233)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26234)==0&false))) {{
            __CLR4_4_1k66k66lb90p8vh.R.inc(26235);throw new MathUnsupportedOperationException();
        }

        }__CLR4_4_1k66k66lb90p8vh.R.inc(26236);final double[] sqrtEigenValues = new double[realEigenvalues.length];
        __CLR4_4_1k66k66lb90p8vh.R.inc(26237);for (int i = 0; (((i < realEigenvalues.length)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26238)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26239)==0&false)); i++) {{
            __CLR4_4_1k66k66lb90p8vh.R.inc(26240);final double eigen = realEigenvalues[i];
            __CLR4_4_1k66k66lb90p8vh.R.inc(26241);if ((((eigen <= 0)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26242)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26243)==0&false))) {{
                __CLR4_4_1k66k66lb90p8vh.R.inc(26244);throw new MathUnsupportedOperationException();
            }
            }__CLR4_4_1k66k66lb90p8vh.R.inc(26245);sqrtEigenValues[i] = FastMath.sqrt(eigen);
        }
        }__CLR4_4_1k66k66lb90p8vh.R.inc(26246);final RealMatrix sqrtEigen = MatrixUtils.createRealDiagonalMatrix(sqrtEigenValues);
        __CLR4_4_1k66k66lb90p8vh.R.inc(26247);final RealMatrix v = getV();
        __CLR4_4_1k66k66lb90p8vh.R.inc(26248);final RealMatrix vT = getVT();

        __CLR4_4_1k66k66lb90p8vh.R.inc(26249);return v.multiply(sqrtEigen).multiply(vT);
    }finally{__CLR4_4_1k66k66lb90p8vh.R.flushNeeded();}}

    /**
     * Gets a solver for finding the A &times; X = B solution in exact
     * linear sense.
     * <p>
     * Since 3.1, eigen decomposition of a general matrix is supported,
     * but the {@link DecompositionSolver} only supports real eigenvalues.
     *
     * @return a solver
     * @throws MathUnsupportedOperationException if the decomposition resulted in
     * complex eigenvalues
     */
    public DecompositionSolver getSolver() {try{__CLR4_4_1k66k66lb90p8vh.R.inc(26250);
        __CLR4_4_1k66k66lb90p8vh.R.inc(26251);if ((((hasComplexEigenvalues())&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26252)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26253)==0&false))) {{
            __CLR4_4_1k66k66lb90p8vh.R.inc(26254);throw new MathUnsupportedOperationException();
        }
        }__CLR4_4_1k66k66lb90p8vh.R.inc(26255);return new Solver(realEigenvalues, imagEigenvalues, eigenvectors);
    }finally{__CLR4_4_1k66k66lb90p8vh.R.flushNeeded();}}

    /** Specialized solver. */
    private static class Solver implements DecompositionSolver {
        /** Real part of the realEigenvalues. */
        private double[] realEigenvalues;
        /** Imaginary part of the realEigenvalues. */
        private double[] imagEigenvalues;
        /** Eigenvectors. */
        private final ArrayRealVector[] eigenvectors;

        /**
         * Builds a solver from decomposed matrix.
         *
         * @param realEigenvalues Real parts of the eigenvalues.
         * @param imagEigenvalues Imaginary parts of the eigenvalues.
         * @param eigenvectors Eigenvectors.
         */
        private Solver(final double[] realEigenvalues,
                final double[] imagEigenvalues,
                final ArrayRealVector[] eigenvectors) {try{__CLR4_4_1k66k66lb90p8vh.R.inc(26256);
            __CLR4_4_1k66k66lb90p8vh.R.inc(26257);this.realEigenvalues = realEigenvalues;
            __CLR4_4_1k66k66lb90p8vh.R.inc(26258);this.imagEigenvalues = imagEigenvalues;
            __CLR4_4_1k66k66lb90p8vh.R.inc(26259);this.eigenvectors = eigenvectors;
        }finally{__CLR4_4_1k66k66lb90p8vh.R.flushNeeded();}}

        /**
         * Solves the linear equation A &times; X = B for symmetric matrices A.
         * <p>
         * This method only finds exact linear solutions, i.e. solutions for
         * which ||A &times; X - B|| is exactly 0.
         * </p>
         *
         * @param b Right-hand side of the equation A &times; X = B.
         * @return a Vector X that minimizes the two norm of A &times; X - B.
         *
         * @throws DimensionMismatchException if the matrices dimensions do not match.
         * @throws SingularMatrixException if the decomposed matrix is singular.
         */
        public RealVector solve(final RealVector b) {try{__CLR4_4_1k66k66lb90p8vh.R.inc(26260);
            __CLR4_4_1k66k66lb90p8vh.R.inc(26261);if ((((!isNonSingular())&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26262)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26263)==0&false))) {{
                __CLR4_4_1k66k66lb90p8vh.R.inc(26264);throw new SingularMatrixException();
            }

            }__CLR4_4_1k66k66lb90p8vh.R.inc(26265);final int m = realEigenvalues.length;
            __CLR4_4_1k66k66lb90p8vh.R.inc(26266);if ((((b.getDimension() != m)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26267)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26268)==0&false))) {{
                __CLR4_4_1k66k66lb90p8vh.R.inc(26269);throw new DimensionMismatchException(b.getDimension(), m);
            }

            }__CLR4_4_1k66k66lb90p8vh.R.inc(26270);final double[] bp = new double[m];
            __CLR4_4_1k66k66lb90p8vh.R.inc(26271);for (int i = 0; (((i < m)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26272)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26273)==0&false)); ++i) {{
                __CLR4_4_1k66k66lb90p8vh.R.inc(26274);final ArrayRealVector v = eigenvectors[i];
                __CLR4_4_1k66k66lb90p8vh.R.inc(26275);final double[] vData = v.getDataRef();
                __CLR4_4_1k66k66lb90p8vh.R.inc(26276);final double s = v.dotProduct(b) / realEigenvalues[i];
                __CLR4_4_1k66k66lb90p8vh.R.inc(26277);for (int j = 0; (((j < m)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26278)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26279)==0&false)); ++j) {{
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26280);bp[j] += s * vData[j];
                }
            }}

            }__CLR4_4_1k66k66lb90p8vh.R.inc(26281);return new ArrayRealVector(bp, false);
        }finally{__CLR4_4_1k66k66lb90p8vh.R.flushNeeded();}}

        /** {@inheritDoc} */
        public RealMatrix solve(RealMatrix b) {try{__CLR4_4_1k66k66lb90p8vh.R.inc(26282);

            __CLR4_4_1k66k66lb90p8vh.R.inc(26283);if ((((!isNonSingular())&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26284)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26285)==0&false))) {{
                __CLR4_4_1k66k66lb90p8vh.R.inc(26286);throw new SingularMatrixException();
            }

            }__CLR4_4_1k66k66lb90p8vh.R.inc(26287);final int m = realEigenvalues.length;
            __CLR4_4_1k66k66lb90p8vh.R.inc(26288);if ((((b.getRowDimension() != m)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26289)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26290)==0&false))) {{
                __CLR4_4_1k66k66lb90p8vh.R.inc(26291);throw new DimensionMismatchException(b.getRowDimension(), m);
            }

            }__CLR4_4_1k66k66lb90p8vh.R.inc(26292);final int nColB = b.getColumnDimension();
            __CLR4_4_1k66k66lb90p8vh.R.inc(26293);final double[][] bp = new double[m][nColB];
            __CLR4_4_1k66k66lb90p8vh.R.inc(26294);final double[] tmpCol = new double[m];
            __CLR4_4_1k66k66lb90p8vh.R.inc(26295);for (int k = 0; (((k < nColB)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26296)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26297)==0&false)); ++k) {{
                __CLR4_4_1k66k66lb90p8vh.R.inc(26298);for (int i = 0; (((i < m)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26299)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26300)==0&false)); ++i) {{
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26301);tmpCol[i] = b.getEntry(i, k);
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26302);bp[i][k]  = 0;
                }
                }__CLR4_4_1k66k66lb90p8vh.R.inc(26303);for (int i = 0; (((i < m)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26304)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26305)==0&false)); ++i) {{
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26306);final ArrayRealVector v = eigenvectors[i];
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26307);final double[] vData = v.getDataRef();
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26308);double s = 0;
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26309);for (int j = 0; (((j < m)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26310)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26311)==0&false)); ++j) {{
                        __CLR4_4_1k66k66lb90p8vh.R.inc(26312);s += v.getEntry(j) * tmpCol[j];
                    }
                    }__CLR4_4_1k66k66lb90p8vh.R.inc(26313);s /= realEigenvalues[i];
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26314);for (int j = 0; (((j < m)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26315)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26316)==0&false)); ++j) {{
                        __CLR4_4_1k66k66lb90p8vh.R.inc(26317);bp[j][k] += s * vData[j];
                    }
                }}
            }}

            }__CLR4_4_1k66k66lb90p8vh.R.inc(26318);return new Array2DRowRealMatrix(bp, false);

        }finally{__CLR4_4_1k66k66lb90p8vh.R.flushNeeded();}}

        /**
         * Checks whether the decomposed matrix is non-singular.
         *
         * @return true if the decomposed matrix is non-singular.
         */
        public boolean isNonSingular() {try{__CLR4_4_1k66k66lb90p8vh.R.inc(26319);
            __CLR4_4_1k66k66lb90p8vh.R.inc(26320);for (int i = 0; (((i < realEigenvalues.length)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26321)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26322)==0&false)); ++i) {{
                __CLR4_4_1k66k66lb90p8vh.R.inc(26323);if ((((realEigenvalues[i] == 0 &&
                    imagEigenvalues[i] == 0)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26324)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26325)==0&false))) {{
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26326);return false;
                }
            }}
            }__CLR4_4_1k66k66lb90p8vh.R.inc(26327);return true;
        }finally{__CLR4_4_1k66k66lb90p8vh.R.flushNeeded();}}

        /**
         * Get the inverse of the decomposed matrix.
         *
         * @return the inverse matrix.
         * @throws SingularMatrixException if the decomposed matrix is singular.
         */
        public RealMatrix getInverse() {try{__CLR4_4_1k66k66lb90p8vh.R.inc(26328);
            __CLR4_4_1k66k66lb90p8vh.R.inc(26329);if ((((!isNonSingular())&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26330)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26331)==0&false))) {{
                __CLR4_4_1k66k66lb90p8vh.R.inc(26332);throw new SingularMatrixException();
            }

            }__CLR4_4_1k66k66lb90p8vh.R.inc(26333);final int m = realEigenvalues.length;
            __CLR4_4_1k66k66lb90p8vh.R.inc(26334);final double[][] invData = new double[m][m];

            __CLR4_4_1k66k66lb90p8vh.R.inc(26335);for (int i = 0; (((i < m)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26336)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26337)==0&false)); ++i) {{
                __CLR4_4_1k66k66lb90p8vh.R.inc(26338);final double[] invI = invData[i];
                __CLR4_4_1k66k66lb90p8vh.R.inc(26339);for (int j = 0; (((j < m)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26340)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26341)==0&false)); ++j) {{
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26342);double invIJ = 0;
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26343);for (int k = 0; (((k < m)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26344)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26345)==0&false)); ++k) {{
                        __CLR4_4_1k66k66lb90p8vh.R.inc(26346);final double[] vK = eigenvectors[k].getDataRef();
                        __CLR4_4_1k66k66lb90p8vh.R.inc(26347);invIJ += vK[i] * vK[j] / realEigenvalues[k];
                    }
                    }__CLR4_4_1k66k66lb90p8vh.R.inc(26348);invI[j] = invIJ;
                }
            }}
            }__CLR4_4_1k66k66lb90p8vh.R.inc(26349);return MatrixUtils.createRealMatrix(invData);
        }finally{__CLR4_4_1k66k66lb90p8vh.R.flushNeeded();}}
    }

    /**
     * Transforms the matrix to tridiagonal form.
     *
     * @param matrix Matrix to transform.
     */
    private void transformToTridiagonal(final RealMatrix matrix) {try{__CLR4_4_1k66k66lb90p8vh.R.inc(26350);
        // transform the matrix to tridiagonal
        __CLR4_4_1k66k66lb90p8vh.R.inc(26351);transformer = new TriDiagonalTransformer(matrix);
        __CLR4_4_1k66k66lb90p8vh.R.inc(26352);main = transformer.getMainDiagonalRef();
        __CLR4_4_1k66k66lb90p8vh.R.inc(26353);secondary = transformer.getSecondaryDiagonalRef();
    }finally{__CLR4_4_1k66k66lb90p8vh.R.flushNeeded();}}

    /**
     * Find eigenvalues and eigenvectors (Dubrulle et al., 1971)
     *
     * @param householderMatrix Householder matrix of the transformation
     * to tridiagonal form.
     */
    private void findEigenVectors(final double[][] householderMatrix) {try{__CLR4_4_1k66k66lb90p8vh.R.inc(26354);
        __CLR4_4_1k66k66lb90p8vh.R.inc(26355);final double[][]z = householderMatrix.clone();
        __CLR4_4_1k66k66lb90p8vh.R.inc(26356);final int n = main.length;
        __CLR4_4_1k66k66lb90p8vh.R.inc(26357);realEigenvalues = new double[n];
        __CLR4_4_1k66k66lb90p8vh.R.inc(26358);imagEigenvalues = new double[n];
        __CLR4_4_1k66k66lb90p8vh.R.inc(26359);final double[] e = new double[n];
        __CLR4_4_1k66k66lb90p8vh.R.inc(26360);for (int i = 0; (((i < n - 1)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26361)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26362)==0&false)); i++) {{
            __CLR4_4_1k66k66lb90p8vh.R.inc(26363);realEigenvalues[i] = main[i];
            __CLR4_4_1k66k66lb90p8vh.R.inc(26364);e[i] = secondary[i];
        }
        }__CLR4_4_1k66k66lb90p8vh.R.inc(26365);realEigenvalues[n - 1] = main[n - 1];
        __CLR4_4_1k66k66lb90p8vh.R.inc(26366);e[n - 1] = 0;

        // Determine the largest main and secondary value in absolute term.
        __CLR4_4_1k66k66lb90p8vh.R.inc(26367);double maxAbsoluteValue = 0;
        __CLR4_4_1k66k66lb90p8vh.R.inc(26368);for (int i = 0; (((i < n)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26369)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26370)==0&false)); i++) {{
            __CLR4_4_1k66k66lb90p8vh.R.inc(26371);if ((((FastMath.abs(realEigenvalues[i]) > maxAbsoluteValue)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26372)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26373)==0&false))) {{
                __CLR4_4_1k66k66lb90p8vh.R.inc(26374);maxAbsoluteValue = FastMath.abs(realEigenvalues[i]);
            }
            }__CLR4_4_1k66k66lb90p8vh.R.inc(26375);if ((((FastMath.abs(e[i]) > maxAbsoluteValue)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26376)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26377)==0&false))) {{
                __CLR4_4_1k66k66lb90p8vh.R.inc(26378);maxAbsoluteValue = FastMath.abs(e[i]);
            }
        }}
        // Make null any main and secondary value too small to be significant
        }__CLR4_4_1k66k66lb90p8vh.R.inc(26379);if ((((maxAbsoluteValue != 0)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26380)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26381)==0&false))) {{
            __CLR4_4_1k66k66lb90p8vh.R.inc(26382);for (int i=0; (((i < n)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26383)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26384)==0&false)); i++) {{
                __CLR4_4_1k66k66lb90p8vh.R.inc(26385);if ((((FastMath.abs(realEigenvalues[i]) <= Precision.EPSILON * maxAbsoluteValue)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26386)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26387)==0&false))) {{
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26388);realEigenvalues[i] = 0;
                }
                }__CLR4_4_1k66k66lb90p8vh.R.inc(26389);if ((((FastMath.abs(e[i]) <= Precision.EPSILON * maxAbsoluteValue)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26390)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26391)==0&false))) {{
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26392);e[i]=0;
                }
            }}
        }}

        }__CLR4_4_1k66k66lb90p8vh.R.inc(26393);for (int j = 0; (((j < n)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26394)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26395)==0&false)); j++) {{
            __CLR4_4_1k66k66lb90p8vh.R.inc(26396);int its = 0;
            __CLR4_4_1k66k66lb90p8vh.R.inc(26397);int m;
            __CLR4_4_1k66k66lb90p8vh.R.inc(26398);do {{
                __CLR4_4_1k66k66lb90p8vh.R.inc(26399);for (m = j; (((m < n - 1)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26400)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26401)==0&false)); m++) {{
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26402);double delta = FastMath.abs(realEigenvalues[m]) +
                        FastMath.abs(realEigenvalues[m + 1]);
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26403);if ((((FastMath.abs(e[m]) + delta == delta)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26404)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26405)==0&false))) {{
                        __CLR4_4_1k66k66lb90p8vh.R.inc(26406);break;
                    }
                }}
                }__CLR4_4_1k66k66lb90p8vh.R.inc(26407);if ((((m != j)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26408)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26409)==0&false))) {{
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26410);if ((((its == maxIter)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26411)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26412)==0&false))) {{
                        __CLR4_4_1k66k66lb90p8vh.R.inc(26413);throw new MaxCountExceededException(LocalizedFormats.CONVERGENCE_FAILED,
                                                            maxIter);
                    }
                    }__CLR4_4_1k66k66lb90p8vh.R.inc(26414);its++;
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26415);double q = (realEigenvalues[j + 1] - realEigenvalues[j]) / (2 * e[j]);
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26416);double t = FastMath.sqrt(1 + q * q);
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26417);if ((((q < 0.0)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26418)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26419)==0&false))) {{
                        __CLR4_4_1k66k66lb90p8vh.R.inc(26420);q = realEigenvalues[m] - realEigenvalues[j] + e[j] / (q - t);
                    } }else {{
                        __CLR4_4_1k66k66lb90p8vh.R.inc(26421);q = realEigenvalues[m] - realEigenvalues[j] + e[j] / (q + t);
                    }
                    }__CLR4_4_1k66k66lb90p8vh.R.inc(26422);double u = 0.0;
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26423);double s = 1.0;
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26424);double c = 1.0;
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26425);int i;
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26426);for (i = m - 1; (((i >= j)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26427)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26428)==0&false)); i--) {{
                        __CLR4_4_1k66k66lb90p8vh.R.inc(26429);double p = s * e[i];
                        __CLR4_4_1k66k66lb90p8vh.R.inc(26430);double h = c * e[i];
                        __CLR4_4_1k66k66lb90p8vh.R.inc(26431);if ((((FastMath.abs(p) >= FastMath.abs(q))&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26432)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26433)==0&false))) {{
                            __CLR4_4_1k66k66lb90p8vh.R.inc(26434);c = q / p;
                            __CLR4_4_1k66k66lb90p8vh.R.inc(26435);t = FastMath.sqrt(c * c + 1.0);
                            __CLR4_4_1k66k66lb90p8vh.R.inc(26436);e[i + 1] = p * t;
                            __CLR4_4_1k66k66lb90p8vh.R.inc(26437);s = 1.0 / t;
                            __CLR4_4_1k66k66lb90p8vh.R.inc(26438);c = c * s;
                        } }else {{
                            __CLR4_4_1k66k66lb90p8vh.R.inc(26439);s = p / q;
                            __CLR4_4_1k66k66lb90p8vh.R.inc(26440);t = FastMath.sqrt(s * s + 1.0);
                            __CLR4_4_1k66k66lb90p8vh.R.inc(26441);e[i + 1] = q * t;
                            __CLR4_4_1k66k66lb90p8vh.R.inc(26442);c = 1.0 / t;
                            __CLR4_4_1k66k66lb90p8vh.R.inc(26443);s = s * c;
                        }
                        }__CLR4_4_1k66k66lb90p8vh.R.inc(26444);if ((((e[i + 1] == 0.0)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26445)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26446)==0&false))) {{
                            __CLR4_4_1k66k66lb90p8vh.R.inc(26447);realEigenvalues[i + 1] -= u;
                            __CLR4_4_1k66k66lb90p8vh.R.inc(26448);e[m] = 0.0;
                            __CLR4_4_1k66k66lb90p8vh.R.inc(26449);break;
                        }
                        }__CLR4_4_1k66k66lb90p8vh.R.inc(26450);q = realEigenvalues[i + 1] - u;
                        __CLR4_4_1k66k66lb90p8vh.R.inc(26451);t = (realEigenvalues[i] - q) * s + 2.0 * c * h;
                        __CLR4_4_1k66k66lb90p8vh.R.inc(26452);u = s * t;
                        __CLR4_4_1k66k66lb90p8vh.R.inc(26453);realEigenvalues[i + 1] = q + u;
                        __CLR4_4_1k66k66lb90p8vh.R.inc(26454);q = c * t - h;
                        __CLR4_4_1k66k66lb90p8vh.R.inc(26455);for (int ia = 0; (((ia < n)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26456)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26457)==0&false)); ia++) {{
                            __CLR4_4_1k66k66lb90p8vh.R.inc(26458);p = z[ia][i + 1];
                            __CLR4_4_1k66k66lb90p8vh.R.inc(26459);z[ia][i + 1] = s * z[ia][i] + c * p;
                            __CLR4_4_1k66k66lb90p8vh.R.inc(26460);z[ia][i] = c * z[ia][i] - s * p;
                        }
                    }}
                    }__CLR4_4_1k66k66lb90p8vh.R.inc(26461);if ((((t == 0.0 && i >= j)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26462)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26463)==0&false))) {{
                        __CLR4_4_1k66k66lb90p8vh.R.inc(26464);continue;
                    }
                    }__CLR4_4_1k66k66lb90p8vh.R.inc(26465);realEigenvalues[j] -= u;
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26466);e[j] = q;
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26467);e[m] = 0.0;
                }
            }} }while ((((m != j)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26468)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26469)==0&false)));
        }

        //Sort the eigen values (and vectors) in increase order
        }__CLR4_4_1k66k66lb90p8vh.R.inc(26470);for (int i = 0; (((i < n)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26471)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26472)==0&false)); i++) {{
            __CLR4_4_1k66k66lb90p8vh.R.inc(26473);int k = i;
            __CLR4_4_1k66k66lb90p8vh.R.inc(26474);double p = realEigenvalues[i];
            __CLR4_4_1k66k66lb90p8vh.R.inc(26475);for (int j = i + 1; (((j < n)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26476)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26477)==0&false)); j++) {{
                __CLR4_4_1k66k66lb90p8vh.R.inc(26478);if ((((realEigenvalues[j] > p)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26479)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26480)==0&false))) {{
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26481);k = j;
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26482);p = realEigenvalues[j];
                }
            }}
            }__CLR4_4_1k66k66lb90p8vh.R.inc(26483);if ((((k != i)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26484)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26485)==0&false))) {{
                __CLR4_4_1k66k66lb90p8vh.R.inc(26486);realEigenvalues[k] = realEigenvalues[i];
                __CLR4_4_1k66k66lb90p8vh.R.inc(26487);realEigenvalues[i] = p;
                __CLR4_4_1k66k66lb90p8vh.R.inc(26488);for (int j = 0; (((j < n)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26489)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26490)==0&false)); j++) {{
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26491);p = z[j][i];
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26492);z[j][i] = z[j][k];
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26493);z[j][k] = p;
                }
            }}
        }}

        // Determine the largest eigen value in absolute term.
        }__CLR4_4_1k66k66lb90p8vh.R.inc(26494);maxAbsoluteValue = 0;
        __CLR4_4_1k66k66lb90p8vh.R.inc(26495);for (int i = 0; (((i < n)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26496)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26497)==0&false)); i++) {{
            __CLR4_4_1k66k66lb90p8vh.R.inc(26498);if ((((FastMath.abs(realEigenvalues[i]) > maxAbsoluteValue)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26499)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26500)==0&false))) {{
                __CLR4_4_1k66k66lb90p8vh.R.inc(26501);maxAbsoluteValue=FastMath.abs(realEigenvalues[i]);
            }
        }}
        // Make null any eigen value too small to be significant
        }__CLR4_4_1k66k66lb90p8vh.R.inc(26502);if ((((maxAbsoluteValue != 0.0)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26503)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26504)==0&false))) {{
            __CLR4_4_1k66k66lb90p8vh.R.inc(26505);for (int i=0; (((i < n)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26506)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26507)==0&false)); i++) {{
                __CLR4_4_1k66k66lb90p8vh.R.inc(26508);if ((((FastMath.abs(realEigenvalues[i]) < Precision.EPSILON * maxAbsoluteValue)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26509)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26510)==0&false))) {{
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26511);realEigenvalues[i] = 0;
                }
            }}
        }}
        }__CLR4_4_1k66k66lb90p8vh.R.inc(26512);eigenvectors = new ArrayRealVector[n];
        __CLR4_4_1k66k66lb90p8vh.R.inc(26513);final double[] tmp = new double[n];
        __CLR4_4_1k66k66lb90p8vh.R.inc(26514);for (int i = 0; (((i < n)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26515)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26516)==0&false)); i++) {{
            __CLR4_4_1k66k66lb90p8vh.R.inc(26517);for (int j = 0; (((j < n)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26518)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26519)==0&false)); j++) {{
                __CLR4_4_1k66k66lb90p8vh.R.inc(26520);tmp[j] = z[j][i];
            }
            }__CLR4_4_1k66k66lb90p8vh.R.inc(26521);eigenvectors[i] = new ArrayRealVector(tmp);
        }
    }}finally{__CLR4_4_1k66k66lb90p8vh.R.flushNeeded();}}

    /**
     * Transforms the matrix to Schur form and calculates the eigenvalues.
     *
     * @param matrix Matrix to transform.
     * @return the {@link SchurTransformer Shur transform} for this matrix
     */
    private SchurTransformer transformToSchur(final RealMatrix matrix) {try{__CLR4_4_1k66k66lb90p8vh.R.inc(26522);
        __CLR4_4_1k66k66lb90p8vh.R.inc(26523);final SchurTransformer schurTransform = new SchurTransformer(matrix);
        __CLR4_4_1k66k66lb90p8vh.R.inc(26524);final double[][] matT = schurTransform.getT().getData();

        __CLR4_4_1k66k66lb90p8vh.R.inc(26525);realEigenvalues = new double[matT.length];
        __CLR4_4_1k66k66lb90p8vh.R.inc(26526);imagEigenvalues = new double[matT.length];

        __CLR4_4_1k66k66lb90p8vh.R.inc(26527);for (int i = 0; (((i < realEigenvalues.length)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26528)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26529)==0&false)); i++) {{
            __CLR4_4_1k66k66lb90p8vh.R.inc(26530);if ((((i == (realEigenvalues.length - 1) ||
                Precision.equals(matT[i + 1][i], 0.0, EPSILON))&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26531)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26532)==0&false))) {{
                __CLR4_4_1k66k66lb90p8vh.R.inc(26533);realEigenvalues[i] = matT[i][i];
            } }else {{
                __CLR4_4_1k66k66lb90p8vh.R.inc(26534);final double x = matT[i + 1][i + 1];
                __CLR4_4_1k66k66lb90p8vh.R.inc(26535);final double p = 0.5 * (matT[i][i] - x);
                __CLR4_4_1k66k66lb90p8vh.R.inc(26536);final double z = FastMath.sqrt(FastMath.abs(p * p + matT[i + 1][i] * matT[i][i + 1]));
                __CLR4_4_1k66k66lb90p8vh.R.inc(26537);realEigenvalues[i] = x + p;
                __CLR4_4_1k66k66lb90p8vh.R.inc(26538);imagEigenvalues[i] = z;
                __CLR4_4_1k66k66lb90p8vh.R.inc(26539);realEigenvalues[i + 1] = x + p;
                __CLR4_4_1k66k66lb90p8vh.R.inc(26540);imagEigenvalues[i + 1] = -z;
                __CLR4_4_1k66k66lb90p8vh.R.inc(26541);i++;
            }
        }}
        }__CLR4_4_1k66k66lb90p8vh.R.inc(26542);return schurTransform;
    }finally{__CLR4_4_1k66k66lb90p8vh.R.flushNeeded();}}

    /**
     * Performs a division of two complex numbers.
     *
     * @param xr real part of the first number
     * @param xi imaginary part of the first number
     * @param yr real part of the second number
     * @param yi imaginary part of the second number
     * @return result of the complex division
     */
    private Complex cdiv(final double xr, final double xi,
                         final double yr, final double yi) {try{__CLR4_4_1k66k66lb90p8vh.R.inc(26543);
        __CLR4_4_1k66k66lb90p8vh.R.inc(26544);return new Complex(xr, xi).divide(new Complex(yr, yi));
    }finally{__CLR4_4_1k66k66lb90p8vh.R.flushNeeded();}}

    /**
     * Find eigenvectors from a matrix transformed to Schur form.
     *
     * @param schur the schur transformation of the matrix
     * @throws MathArithmeticException if the Schur form has a norm of zero
     */
    private void findEigenVectorsFromSchur(final SchurTransformer schur)
        throws MathArithmeticException {try{__CLR4_4_1k66k66lb90p8vh.R.inc(26545);
        __CLR4_4_1k66k66lb90p8vh.R.inc(26546);final double[][] matrixT = schur.getT().getData();
        __CLR4_4_1k66k66lb90p8vh.R.inc(26547);final double[][] matrixP = schur.getP().getData();

        __CLR4_4_1k66k66lb90p8vh.R.inc(26548);final int n = matrixT.length;

        // compute matrix norm
        __CLR4_4_1k66k66lb90p8vh.R.inc(26549);double norm = 0.0;
        __CLR4_4_1k66k66lb90p8vh.R.inc(26550);for (int i = 0; (((i < n)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26551)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26552)==0&false)); i++) {{
           __CLR4_4_1k66k66lb90p8vh.R.inc(26553);for (int j = FastMath.max(i - 1, 0); (((j < n)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26554)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26555)==0&false)); j++) {{
              __CLR4_4_1k66k66lb90p8vh.R.inc(26556);norm = norm + FastMath.abs(matrixT[i][j]);
           }
        }}

        // we can not handle a matrix with zero norm
        }__CLR4_4_1k66k66lb90p8vh.R.inc(26557);if ((((Precision.equals(norm, 0.0, EPSILON))&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26558)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26559)==0&false))) {{
           __CLR4_4_1k66k66lb90p8vh.R.inc(26560);throw new MathArithmeticException(LocalizedFormats.ZERO_NORM);
        }

        // Backsubstitute to find vectors of upper triangular form

        }__CLR4_4_1k66k66lb90p8vh.R.inc(26561);double r = 0.0;
        __CLR4_4_1k66k66lb90p8vh.R.inc(26562);double s = 0.0;
        __CLR4_4_1k66k66lb90p8vh.R.inc(26563);double z = 0.0;

        __CLR4_4_1k66k66lb90p8vh.R.inc(26564);for (int idx = n - 1; (((idx >= 0)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26565)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26566)==0&false)); idx--) {{
            __CLR4_4_1k66k66lb90p8vh.R.inc(26567);double p = realEigenvalues[idx];
            __CLR4_4_1k66k66lb90p8vh.R.inc(26568);double q = imagEigenvalues[idx];

            __CLR4_4_1k66k66lb90p8vh.R.inc(26569);if ((((Precision.equals(q, 0.0))&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26570)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26571)==0&false))) {{
                // Real vector
                __CLR4_4_1k66k66lb90p8vh.R.inc(26572);int l = idx;
                __CLR4_4_1k66k66lb90p8vh.R.inc(26573);matrixT[idx][idx] = 1.0;
                __CLR4_4_1k66k66lb90p8vh.R.inc(26574);for (int i = idx - 1; (((i >= 0)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26575)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26576)==0&false)); i--) {{
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26577);double w = matrixT[i][i] - p;
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26578);r = 0.0;
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26579);for (int j = l; (((j <= idx)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26580)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26581)==0&false)); j++) {{
                        __CLR4_4_1k66k66lb90p8vh.R.inc(26582);r = r + matrixT[i][j] * matrixT[j][idx];
                    }
                    }__CLR4_4_1k66k66lb90p8vh.R.inc(26583);if ((((Precision.compareTo(imagEigenvalues[i], 0.0, EPSILON) < 0.0)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26584)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26585)==0&false))) {{
                        __CLR4_4_1k66k66lb90p8vh.R.inc(26586);z = w;
                        __CLR4_4_1k66k66lb90p8vh.R.inc(26587);s = r;
                    } }else {{
                        __CLR4_4_1k66k66lb90p8vh.R.inc(26588);l = i;
                        __CLR4_4_1k66k66lb90p8vh.R.inc(26589);if ((((Precision.equals(imagEigenvalues[i], 0.0))&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26590)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26591)==0&false))) {{
                            __CLR4_4_1k66k66lb90p8vh.R.inc(26592);if ((((w != 0.0)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26593)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26594)==0&false))) {{
                                __CLR4_4_1k66k66lb90p8vh.R.inc(26595);matrixT[i][idx] = -r / w;
                            } }else {{
                                __CLR4_4_1k66k66lb90p8vh.R.inc(26596);matrixT[i][idx] = -r / (Precision.EPSILON * norm);
                            }
                        }} }else {{
                            // Solve real equations
                            __CLR4_4_1k66k66lb90p8vh.R.inc(26597);double x = matrixT[i][i + 1];
                            __CLR4_4_1k66k66lb90p8vh.R.inc(26598);double y = matrixT[i + 1][i];
                            __CLR4_4_1k66k66lb90p8vh.R.inc(26599);q = (realEigenvalues[i] - p) * (realEigenvalues[i] - p) +
                                imagEigenvalues[i] * imagEigenvalues[i];
                            __CLR4_4_1k66k66lb90p8vh.R.inc(26600);double t = (x * s - z * r) / q;
                            __CLR4_4_1k66k66lb90p8vh.R.inc(26601);matrixT[i][idx] = t;
                            __CLR4_4_1k66k66lb90p8vh.R.inc(26602);if ((((FastMath.abs(x) > FastMath.abs(z))&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26603)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26604)==0&false))) {{
                                __CLR4_4_1k66k66lb90p8vh.R.inc(26605);matrixT[i + 1][idx] = (-r - w * t) / x;
                            } }else {{
                                __CLR4_4_1k66k66lb90p8vh.R.inc(26606);matrixT[i + 1][idx] = (-s - y * t) / z;
                            }
                        }}

                        // Overflow control
                        }__CLR4_4_1k66k66lb90p8vh.R.inc(26607);double t = FastMath.abs(matrixT[i][idx]);
                        __CLR4_4_1k66k66lb90p8vh.R.inc(26608);if (((((Precision.EPSILON * t) * t > 1)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26609)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26610)==0&false))) {{
                            __CLR4_4_1k66k66lb90p8vh.R.inc(26611);for (int j = i; (((j <= idx)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26612)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26613)==0&false)); j++) {{
                                __CLR4_4_1k66k66lb90p8vh.R.inc(26614);matrixT[j][idx] = matrixT[j][idx] / t;
                            }
                        }}
                    }}
                }}
            }} }else {__CLR4_4_1k66k66lb90p8vh.R.inc(26615);if ((((q < 0.0)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26616)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26617)==0&false))) {{
                // Complex vector
                __CLR4_4_1k66k66lb90p8vh.R.inc(26618);int l = idx - 1;

                // Last vector component imaginary so matrix is triangular
                __CLR4_4_1k66k66lb90p8vh.R.inc(26619);if ((((FastMath.abs(matrixT[idx][idx - 1]) > FastMath.abs(matrixT[idx - 1][idx]))&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26620)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26621)==0&false))) {{
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26622);matrixT[idx - 1][idx - 1] = q / matrixT[idx][idx - 1];
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26623);matrixT[idx - 1][idx]     = -(matrixT[idx][idx] - p) / matrixT[idx][idx - 1];
                } }else {{
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26624);final Complex result = cdiv(0.0, -matrixT[idx - 1][idx],
                                                matrixT[idx - 1][idx - 1] - p, q);
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26625);matrixT[idx - 1][idx - 1] = result.getReal();
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26626);matrixT[idx - 1][idx]     = result.getImaginary();
                }

                }__CLR4_4_1k66k66lb90p8vh.R.inc(26627);matrixT[idx][idx - 1] = 0.0;
                __CLR4_4_1k66k66lb90p8vh.R.inc(26628);matrixT[idx][idx]     = 1.0;

                __CLR4_4_1k66k66lb90p8vh.R.inc(26629);for (int i = idx - 2; (((i >= 0)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26630)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26631)==0&false)); i--) {{
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26632);double ra = 0.0;
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26633);double sa = 0.0;
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26634);for (int j = l; (((j <= idx)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26635)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26636)==0&false)); j++) {{
                        __CLR4_4_1k66k66lb90p8vh.R.inc(26637);ra = ra + matrixT[i][j] * matrixT[j][idx - 1];
                        __CLR4_4_1k66k66lb90p8vh.R.inc(26638);sa = sa + matrixT[i][j] * matrixT[j][idx];
                    }
                    }__CLR4_4_1k66k66lb90p8vh.R.inc(26639);double w = matrixT[i][i] - p;

                    __CLR4_4_1k66k66lb90p8vh.R.inc(26640);if ((((Precision.compareTo(imagEigenvalues[i], 0.0, EPSILON) < 0.0)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26641)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26642)==0&false))) {{
                        __CLR4_4_1k66k66lb90p8vh.R.inc(26643);z = w;
                        __CLR4_4_1k66k66lb90p8vh.R.inc(26644);r = ra;
                        __CLR4_4_1k66k66lb90p8vh.R.inc(26645);s = sa;
                    } }else {{
                        __CLR4_4_1k66k66lb90p8vh.R.inc(26646);l = i;
                        __CLR4_4_1k66k66lb90p8vh.R.inc(26647);if ((((Precision.equals(imagEigenvalues[i], 0.0))&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26648)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26649)==0&false))) {{
                            __CLR4_4_1k66k66lb90p8vh.R.inc(26650);final Complex c = cdiv(-ra, -sa, w, q);
                            __CLR4_4_1k66k66lb90p8vh.R.inc(26651);matrixT[i][idx - 1] = c.getReal();
                            __CLR4_4_1k66k66lb90p8vh.R.inc(26652);matrixT[i][idx] = c.getImaginary();
                        } }else {{
                            // Solve complex equations
                            __CLR4_4_1k66k66lb90p8vh.R.inc(26653);double x = matrixT[i][i + 1];
                            __CLR4_4_1k66k66lb90p8vh.R.inc(26654);double y = matrixT[i + 1][i];
                            __CLR4_4_1k66k66lb90p8vh.R.inc(26655);double vr = (realEigenvalues[i] - p) * (realEigenvalues[i] - p) +
                                        imagEigenvalues[i] * imagEigenvalues[i] - q * q;
                            __CLR4_4_1k66k66lb90p8vh.R.inc(26656);final double vi = (realEigenvalues[i] - p) * 2.0 * q;
                            __CLR4_4_1k66k66lb90p8vh.R.inc(26657);if ((((Precision.equals(vr, 0.0) && Precision.equals(vi, 0.0))&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26658)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26659)==0&false))) {{
                                __CLR4_4_1k66k66lb90p8vh.R.inc(26660);vr = Precision.EPSILON * norm *
                                     (FastMath.abs(w) + FastMath.abs(q) + FastMath.abs(x) +
                                      FastMath.abs(y) + FastMath.abs(z));
                            }
                            }__CLR4_4_1k66k66lb90p8vh.R.inc(26661);final Complex c     = cdiv(x * r - z * ra + q * sa,
                                                       x * s - z * sa - q * ra, vr, vi);
                            __CLR4_4_1k66k66lb90p8vh.R.inc(26662);matrixT[i][idx - 1] = c.getReal();
                            __CLR4_4_1k66k66lb90p8vh.R.inc(26663);matrixT[i][idx]     = c.getImaginary();

                            __CLR4_4_1k66k66lb90p8vh.R.inc(26664);if ((((FastMath.abs(x) > (FastMath.abs(z) + FastMath.abs(q)))&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26665)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26666)==0&false))) {{
                                __CLR4_4_1k66k66lb90p8vh.R.inc(26667);matrixT[i + 1][idx - 1] = (-ra - w * matrixT[i][idx - 1] +
                                                           q * matrixT[i][idx]) / x;
                                __CLR4_4_1k66k66lb90p8vh.R.inc(26668);matrixT[i + 1][idx]     = (-sa - w * matrixT[i][idx] -
                                                           q * matrixT[i][idx - 1]) / x;
                            } }else {{
                                __CLR4_4_1k66k66lb90p8vh.R.inc(26669);final Complex c2        = cdiv(-r - y * matrixT[i][idx - 1],
                                                               -s - y * matrixT[i][idx], z, q);
                                __CLR4_4_1k66k66lb90p8vh.R.inc(26670);matrixT[i + 1][idx - 1] = c2.getReal();
                                __CLR4_4_1k66k66lb90p8vh.R.inc(26671);matrixT[i + 1][idx]     = c2.getImaginary();
                            }
                        }}

                        // Overflow control
                        }__CLR4_4_1k66k66lb90p8vh.R.inc(26672);double t = FastMath.max(FastMath.abs(matrixT[i][idx - 1]),
                                                FastMath.abs(matrixT[i][idx]));
                        __CLR4_4_1k66k66lb90p8vh.R.inc(26673);if (((((Precision.EPSILON * t) * t > 1)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26674)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26675)==0&false))) {{
                            __CLR4_4_1k66k66lb90p8vh.R.inc(26676);for (int j = i; (((j <= idx)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26677)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26678)==0&false)); j++) {{
                                __CLR4_4_1k66k66lb90p8vh.R.inc(26679);matrixT[j][idx - 1] = matrixT[j][idx - 1] / t;
                                __CLR4_4_1k66k66lb90p8vh.R.inc(26680);matrixT[j][idx]     = matrixT[j][idx] / t;
                            }
                        }}
                    }}
                }}
            }}
        }}}

        // Vectors of isolated roots
        }__CLR4_4_1k66k66lb90p8vh.R.inc(26681);for (int i = 0; (((i < n)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26682)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26683)==0&false)); i++) {{
            __CLR4_4_1k66k66lb90p8vh.R.inc(26684);if ((((i < 0 | i > n - 1)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26685)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26686)==0&false))) {{
                __CLR4_4_1k66k66lb90p8vh.R.inc(26687);for (int j = i; (((j < n)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26688)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26689)==0&false)); j++) {{
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26690);matrixP[i][j] = matrixT[i][j];
                }
            }}
        }}

        // Back transformation to get eigenvectors of original matrix
        }__CLR4_4_1k66k66lb90p8vh.R.inc(26691);for (int j = n - 1; (((j >= 0)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26692)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26693)==0&false)); j--) {{
            __CLR4_4_1k66k66lb90p8vh.R.inc(26694);for (int i = 0; (((i <= n - 1)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26695)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26696)==0&false)); i++) {{
                __CLR4_4_1k66k66lb90p8vh.R.inc(26697);z = 0.0;
                __CLR4_4_1k66k66lb90p8vh.R.inc(26698);for (int k = 0; (((k <= FastMath.min(j, n - 1))&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26699)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26700)==0&false)); k++) {{
                    __CLR4_4_1k66k66lb90p8vh.R.inc(26701);z = z + matrixP[i][k] * matrixT[k][j];
                }
                }__CLR4_4_1k66k66lb90p8vh.R.inc(26702);matrixP[i][j] = z;
            }
        }}

        }__CLR4_4_1k66k66lb90p8vh.R.inc(26703);eigenvectors = new ArrayRealVector[n];
        __CLR4_4_1k66k66lb90p8vh.R.inc(26704);final double[] tmp = new double[n];
        __CLR4_4_1k66k66lb90p8vh.R.inc(26705);for (int i = 0; (((i < n)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26706)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26707)==0&false)); i++) {{
            __CLR4_4_1k66k66lb90p8vh.R.inc(26708);for (int j = 0; (((j < n)&&(__CLR4_4_1k66k66lb90p8vh.R.iget(26709)!=0|true))||(__CLR4_4_1k66k66lb90p8vh.R.iget(26710)==0&false)); j++) {{
                __CLR4_4_1k66k66lb90p8vh.R.inc(26711);tmp[j] = matrixP[j][i];
            }
            }__CLR4_4_1k66k66lb90p8vh.R.inc(26712);eigenvectors[i] = new ArrayRealVector(tmp);
        }
    }}finally{__CLR4_4_1k66k66lb90p8vh.R.flushNeeded();}}
}
