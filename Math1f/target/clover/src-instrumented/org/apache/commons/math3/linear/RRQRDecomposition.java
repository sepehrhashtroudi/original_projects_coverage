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
 * Calculates the rank-revealing QR-decomposition of a matrix, with column pivoting.
 * <p>The rank-revealing QR-decomposition of a matrix A consists of three matrices Q,
 * R and P such that AP=QR.  Q is orthogonal (Q<sup>T</sup>Q = I), and R is upper triangular.
 * If A is m&times;n, Q is m&times;m and R is m&times;n and P is n&times;n.</p>
 * <p>QR decomposition with column pivoting produces a rank-revealing QR
 * decomposition and the {@link #getRank(double)} method may be used to return the rank of the
 * input matrix A.</p>
 * <p>This class compute the decomposition using Householder reflectors.</p>
 * <p>For efficiency purposes, the decomposition in packed form is transposed.
 * This allows inner loop to iterate inside rows, which is much more cache-efficient
 * in Java.</p>
 * <p>This class is based on the class with similar name from the
 * <a href="http://math.nist.gov/javanumerics/jama/">JAMA</a> library, with the
 * following changes:</p>
 * <ul>
 *   <li>a {@link #getQT() getQT} method has been added,</li>
 *   <li>the {@code solve} and {@code isFullRank} methods have been replaced
 *   by a {@link #getSolver() getSolver} method and the equivalent methods
 *   provided by the returned {@link DecompositionSolver}.</li>
 * </ul>
 *
 * @see <a href="http://mathworld.wolfram.com/QRDecomposition.html">MathWorld</a>
 * @see <a href="http://en.wikipedia.org/wiki/QR_decomposition">Wikipedia</a>
 *
 * @version $Id$
 * @since 3.2
 */
public class RRQRDecomposition extends QRDecomposition {public static class __CLR4_4_1m6mm6mlb90p90p{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,28829,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** An array to record the column pivoting for later creation of P. */
    private int[] p;

    /** Cached value of P. */
    private RealMatrix cachedP;


    /**
     * Calculates the QR-decomposition of the given matrix.
     * The singularity threshold defaults to zero.
     *
     * @param matrix The matrix to decompose.
     *
     * @see #RRQRDecomposition(RealMatrix, double)
     */
    public RRQRDecomposition(RealMatrix matrix) {
        this(matrix, 0d);__CLR4_4_1m6mm6mlb90p90p.R.inc(28751);try{__CLR4_4_1m6mm6mlb90p90p.R.inc(28750);
    }finally{__CLR4_4_1m6mm6mlb90p90p.R.flushNeeded();}}

   /**
     * Calculates the QR-decomposition of the given matrix.
     *
     * @param matrix The matrix to decompose.
     * @param threshold Singularity threshold.
     * @see #RRQRDecomposition(RealMatrix)
     */
    public RRQRDecomposition(RealMatrix matrix,  double threshold) {
        super(matrix, threshold);__CLR4_4_1m6mm6mlb90p90p.R.inc(28753);try{__CLR4_4_1m6mm6mlb90p90p.R.inc(28752);
    }finally{__CLR4_4_1m6mm6mlb90p90p.R.flushNeeded();}}

    /** Decompose matrix.
     * @param qrt transposed matrix
     */
    @Override
    protected void decompose(double[][] qrt) {try{__CLR4_4_1m6mm6mlb90p90p.R.inc(28754);
        __CLR4_4_1m6mm6mlb90p90p.R.inc(28755);p = new int[qrt.length];
        __CLR4_4_1m6mm6mlb90p90p.R.inc(28756);for (int i = 0; (((i < p.length)&&(__CLR4_4_1m6mm6mlb90p90p.R.iget(28757)!=0|true))||(__CLR4_4_1m6mm6mlb90p90p.R.iget(28758)==0&false)); i++) {{
            __CLR4_4_1m6mm6mlb90p90p.R.inc(28759);p[i] = i;
        }
        }__CLR4_4_1m6mm6mlb90p90p.R.inc(28760);super.decompose(qrt);
    }finally{__CLR4_4_1m6mm6mlb90p90p.R.flushNeeded();}}

    /** Perform Householder reflection for a minor A(minor, minor) of A.
     * @param minor minor index
     * @param qrt transposed matrix
     */
    @Override
    protected void performHouseholderReflection(int minor, double[][] qrt) {try{__CLR4_4_1m6mm6mlb90p90p.R.inc(28761);

        __CLR4_4_1m6mm6mlb90p90p.R.inc(28762);double l2NormSquaredMax = 0;
        // Find the unreduced column with the greatest L2-Norm
        __CLR4_4_1m6mm6mlb90p90p.R.inc(28763);int l2NormSquaredMaxIndex = minor;
        __CLR4_4_1m6mm6mlb90p90p.R.inc(28764);for (int i = minor; (((i < qrt.length)&&(__CLR4_4_1m6mm6mlb90p90p.R.iget(28765)!=0|true))||(__CLR4_4_1m6mm6mlb90p90p.R.iget(28766)==0&false)); i++) {{
            __CLR4_4_1m6mm6mlb90p90p.R.inc(28767);double l2NormSquared = 0;
            __CLR4_4_1m6mm6mlb90p90p.R.inc(28768);for (int j = 0; (((j < qrt[i].length)&&(__CLR4_4_1m6mm6mlb90p90p.R.iget(28769)!=0|true))||(__CLR4_4_1m6mm6mlb90p90p.R.iget(28770)==0&false)); j++) {{
                __CLR4_4_1m6mm6mlb90p90p.R.inc(28771);l2NormSquared += qrt[i][j] * qrt[i][j];
            }
            }__CLR4_4_1m6mm6mlb90p90p.R.inc(28772);if ((((l2NormSquared > l2NormSquaredMax)&&(__CLR4_4_1m6mm6mlb90p90p.R.iget(28773)!=0|true))||(__CLR4_4_1m6mm6mlb90p90p.R.iget(28774)==0&false))) {{
                __CLR4_4_1m6mm6mlb90p90p.R.inc(28775);l2NormSquaredMax = l2NormSquared;
                __CLR4_4_1m6mm6mlb90p90p.R.inc(28776);l2NormSquaredMaxIndex = i;
            }
        }}
        // swap the current column with that with the greated L2-Norm and record in p
        }__CLR4_4_1m6mm6mlb90p90p.R.inc(28777);if ((((l2NormSquaredMaxIndex != minor)&&(__CLR4_4_1m6mm6mlb90p90p.R.iget(28778)!=0|true))||(__CLR4_4_1m6mm6mlb90p90p.R.iget(28779)==0&false))) {{
            __CLR4_4_1m6mm6mlb90p90p.R.inc(28780);double[] tmp1 = qrt[minor];
            __CLR4_4_1m6mm6mlb90p90p.R.inc(28781);qrt[minor] = qrt[l2NormSquaredMaxIndex];
            __CLR4_4_1m6mm6mlb90p90p.R.inc(28782);qrt[l2NormSquaredMaxIndex] = tmp1;
            __CLR4_4_1m6mm6mlb90p90p.R.inc(28783);int tmp2 = p[minor];
            __CLR4_4_1m6mm6mlb90p90p.R.inc(28784);p[minor] = p[l2NormSquaredMaxIndex];
            __CLR4_4_1m6mm6mlb90p90p.R.inc(28785);p[l2NormSquaredMaxIndex] = tmp2;
        }

        }__CLR4_4_1m6mm6mlb90p90p.R.inc(28786);super.performHouseholderReflection(minor, qrt);

    }finally{__CLR4_4_1m6mm6mlb90p90p.R.flushNeeded();}}


    /**
     * Returns the pivot matrix, P, used in the QR Decomposition of matrix A such that AP = QR.
     *
     * If no pivoting is used in this decomposition then P is equal to the identity matrix.
     *
     * @return a permutation matrix.
     */
    public RealMatrix getP() {try{__CLR4_4_1m6mm6mlb90p90p.R.inc(28787);
        __CLR4_4_1m6mm6mlb90p90p.R.inc(28788);if ((((cachedP == null)&&(__CLR4_4_1m6mm6mlb90p90p.R.iget(28789)!=0|true))||(__CLR4_4_1m6mm6mlb90p90p.R.iget(28790)==0&false))) {{
            __CLR4_4_1m6mm6mlb90p90p.R.inc(28791);int n = p.length;
            __CLR4_4_1m6mm6mlb90p90p.R.inc(28792);cachedP = MatrixUtils.createRealMatrix(n,n);
            __CLR4_4_1m6mm6mlb90p90p.R.inc(28793);for (int i = 0; (((i < n)&&(__CLR4_4_1m6mm6mlb90p90p.R.iget(28794)!=0|true))||(__CLR4_4_1m6mm6mlb90p90p.R.iget(28795)==0&false)); i++) {{
                __CLR4_4_1m6mm6mlb90p90p.R.inc(28796);cachedP.setEntry(p[i], i, 1);
            }
        }}
        }__CLR4_4_1m6mm6mlb90p90p.R.inc(28797);return cachedP ;
    }finally{__CLR4_4_1m6mm6mlb90p90p.R.flushNeeded();}}

    /**
     * Return the effective numerical matrix rank.
     * <p>The effective numerical rank is the number of non-negligible
     * singular values.</p>
     * <p>This implementation looks at Frobenius norms of the sequence of
     * bottom right submatrices.  When a large fall in norm is seen,
     * the rank is returned. The drop is computed as:</p>
     * <pre>
     *   (thisNorm/lastNorm) * rNorm < dropThreshold
     * </pre>
     * <p>
     * where thisNorm is the Frobenius norm of the current submatrix,
     * lastNorm is the Frobenius norm of the previous submatrix,
     * rNorm is is the Frobenius norm of the complete matrix
     * </p>
     *
     * @param dropThreshold threshold triggering rank computation
     * @return effective numerical matrix rank
     */
    public int getRank(final double dropThreshold) {try{__CLR4_4_1m6mm6mlb90p90p.R.inc(28798);
        __CLR4_4_1m6mm6mlb90p90p.R.inc(28799);RealMatrix r    = getR();
        __CLR4_4_1m6mm6mlb90p90p.R.inc(28800);int rows        = r.getRowDimension();
        __CLR4_4_1m6mm6mlb90p90p.R.inc(28801);int columns     = r.getColumnDimension();
        __CLR4_4_1m6mm6mlb90p90p.R.inc(28802);int rank        = 1;
        __CLR4_4_1m6mm6mlb90p90p.R.inc(28803);double lastNorm = r.getFrobeniusNorm();
        __CLR4_4_1m6mm6mlb90p90p.R.inc(28804);double rNorm    = lastNorm;
        __CLR4_4_1m6mm6mlb90p90p.R.inc(28805);while ((((rank < FastMath.min(rows, columns))&&(__CLR4_4_1m6mm6mlb90p90p.R.iget(28806)!=0|true))||(__CLR4_4_1m6mm6mlb90p90p.R.iget(28807)==0&false))) {{
            __CLR4_4_1m6mm6mlb90p90p.R.inc(28808);double thisNorm = r.getSubMatrix(rank, rows - 1, rank, columns - 1).getFrobeniusNorm();
            __CLR4_4_1m6mm6mlb90p90p.R.inc(28809);if ((((thisNorm == 0 || (thisNorm / lastNorm) * rNorm < dropThreshold)&&(__CLR4_4_1m6mm6mlb90p90p.R.iget(28810)!=0|true))||(__CLR4_4_1m6mm6mlb90p90p.R.iget(28811)==0&false))) {{
                __CLR4_4_1m6mm6mlb90p90p.R.inc(28812);break;
            }
            }__CLR4_4_1m6mm6mlb90p90p.R.inc(28813);lastNorm = thisNorm;
            __CLR4_4_1m6mm6mlb90p90p.R.inc(28814);rank++;
        }
        }__CLR4_4_1m6mm6mlb90p90p.R.inc(28815);return rank;
    }finally{__CLR4_4_1m6mm6mlb90p90p.R.flushNeeded();}}

    /**
     * Get a solver for finding the A &times; X = B solution in least square sense.
     * @return a solver
     */
    @Override
    public DecompositionSolver getSolver() {try{__CLR4_4_1m6mm6mlb90p90p.R.inc(28816);
        __CLR4_4_1m6mm6mlb90p90p.R.inc(28817);return new Solver(super.getSolver(), this.getP());
    }finally{__CLR4_4_1m6mm6mlb90p90p.R.flushNeeded();}}

    /** Specialized solver. */
    private static class Solver implements DecompositionSolver {

        /** Upper level solver. */
        private final DecompositionSolver upper;

        /** A permutation matrix for the pivots used in the QR decomposition */
        private RealMatrix p;

        /**
         * Build a solver from decomposed matrix.
         *
         * @param upper upper level solver.
         * @param p permutation matrix
         */
        private Solver(final DecompositionSolver upper, final RealMatrix p) {try{__CLR4_4_1m6mm6mlb90p90p.R.inc(28818);
            __CLR4_4_1m6mm6mlb90p90p.R.inc(28819);this.upper = upper;
            __CLR4_4_1m6mm6mlb90p90p.R.inc(28820);this.p     = p;
        }finally{__CLR4_4_1m6mm6mlb90p90p.R.flushNeeded();}}

        /** {@inheritDoc} */
        public boolean isNonSingular() {try{__CLR4_4_1m6mm6mlb90p90p.R.inc(28821);
            __CLR4_4_1m6mm6mlb90p90p.R.inc(28822);return upper.isNonSingular();
        }finally{__CLR4_4_1m6mm6mlb90p90p.R.flushNeeded();}}

        /** {@inheritDoc} */
        public RealVector solve(RealVector b) {try{__CLR4_4_1m6mm6mlb90p90p.R.inc(28823);
            __CLR4_4_1m6mm6mlb90p90p.R.inc(28824);return p.operate(upper.solve(b));
        }finally{__CLR4_4_1m6mm6mlb90p90p.R.flushNeeded();}}

        /** {@inheritDoc} */
        public RealMatrix solve(RealMatrix b) {try{__CLR4_4_1m6mm6mlb90p90p.R.inc(28825);
            __CLR4_4_1m6mm6mlb90p90p.R.inc(28826);return p.multiply(upper.solve(b));
        }finally{__CLR4_4_1m6mm6mlb90p90p.R.flushNeeded();}}

        /** {@inheritDoc} */
        public RealMatrix getInverse() {try{__CLR4_4_1m6mm6mlb90p90p.R.inc(28827);
            __CLR4_4_1m6mm6mlb90p90p.R.inc(28828);return solve(MatrixUtils.createRealIdentityMatrix(p.getRowDimension()));
        }finally{__CLR4_4_1m6mm6mlb90p90p.R.flushNeeded();}}
    }
}
