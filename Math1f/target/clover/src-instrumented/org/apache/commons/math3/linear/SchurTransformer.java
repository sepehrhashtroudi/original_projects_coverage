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

import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.Precision;

/**
 * Class transforming a general real matrix to Schur form.
 * <p>A m &times; m matrix A can be written as the product of three matrices: A = P
 * &times; T &times; P<sup>T</sup> with P an orthogonal matrix and T an quasi-triangular
 * matrix. Both P and T are m &times; m matrices.</p>
 * <p>Transformation to Schur form is often not a goal by itself, but it is an
 * intermediate step in more general decomposition algorithms like
 * {@link EigenDecomposition eigen decomposition}. This class is therefore
 * intended for internal use by the library and is not public. As a consequence
 * of this explicitly limited scope, many methods directly returns references to
 * internal arrays, not copies.</p>
 * <p>This class is based on the method hqr2 in class EigenvalueDecomposition
 * from the <a href="http://math.nist.gov/javanumerics/jama/">JAMA</a> library.</p>
 *
 * @see <a href="http://mathworld.wolfram.com/SchurDecomposition.html">Schur Decomposition - MathWorld</a>
 * @see <a href="http://en.wikipedia.org/wiki/Schur_decomposition">Schur Decomposition - Wikipedia</a>
 * @see <a href="http://en.wikipedia.org/wiki/Householder_transformation">Householder Transformations</a>
 * @version $Id$
 * @since 3.1
 */
class SchurTransformer {public static class __CLR4_4_1muzmuzlb90p93l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,29905,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Maximum allowed iterations for convergence of the transformation. */
    private static final int MAX_ITERATIONS = 100;

    /** P matrix. */
    private final double matrixP[][];
    /** T matrix. */
    private final double matrixT[][];
    /** Cached value of P. */
    private RealMatrix cachedP;
    /** Cached value of T. */
    private RealMatrix cachedT;
    /** Cached value of PT. */
    private RealMatrix cachedPt;

    /** Epsilon criteria taken from JAMA code (originally was 2^-52). */
    private final double epsilon = Precision.EPSILON;

    /**
     * Build the transformation to Schur form of a general real matrix.
     *
     * @param matrix matrix to transform
     * @throws NonSquareMatrixException if the matrix is not square
     */
    public SchurTransformer(final RealMatrix matrix) {try{__CLR4_4_1muzmuzlb90p93l.R.inc(29627);
        __CLR4_4_1muzmuzlb90p93l.R.inc(29628);if ((((!matrix.isSquare())&&(__CLR4_4_1muzmuzlb90p93l.R.iget(29629)!=0|true))||(__CLR4_4_1muzmuzlb90p93l.R.iget(29630)==0&false))) {{
            __CLR4_4_1muzmuzlb90p93l.R.inc(29631);throw new NonSquareMatrixException(matrix.getRowDimension(),
                                               matrix.getColumnDimension());
        }

        }__CLR4_4_1muzmuzlb90p93l.R.inc(29632);HessenbergTransformer transformer = new HessenbergTransformer(matrix);
        __CLR4_4_1muzmuzlb90p93l.R.inc(29633);matrixT = transformer.getH().getData();
        __CLR4_4_1muzmuzlb90p93l.R.inc(29634);matrixP = transformer.getP().getData();
        __CLR4_4_1muzmuzlb90p93l.R.inc(29635);cachedT = null;
        __CLR4_4_1muzmuzlb90p93l.R.inc(29636);cachedP = null;
        __CLR4_4_1muzmuzlb90p93l.R.inc(29637);cachedPt = null;

        // transform matrix
        __CLR4_4_1muzmuzlb90p93l.R.inc(29638);transform();
    }finally{__CLR4_4_1muzmuzlb90p93l.R.flushNeeded();}}

    /**
     * Returns the matrix P of the transform.
     * <p>P is an orthogonal matrix, i.e. its inverse is also its transpose.</p>
     *
     * @return the P matrix
     */
    public RealMatrix getP() {try{__CLR4_4_1muzmuzlb90p93l.R.inc(29639);
        __CLR4_4_1muzmuzlb90p93l.R.inc(29640);if ((((cachedP == null)&&(__CLR4_4_1muzmuzlb90p93l.R.iget(29641)!=0|true))||(__CLR4_4_1muzmuzlb90p93l.R.iget(29642)==0&false))) {{
            __CLR4_4_1muzmuzlb90p93l.R.inc(29643);cachedP = MatrixUtils.createRealMatrix(matrixP);
        }
        }__CLR4_4_1muzmuzlb90p93l.R.inc(29644);return cachedP;
    }finally{__CLR4_4_1muzmuzlb90p93l.R.flushNeeded();}}

    /**
     * Returns the transpose of the matrix P of the transform.
     * <p>P is an orthogonal matrix, i.e. its inverse is also its transpose.</p>
     *
     * @return the transpose of the P matrix
     */
    public RealMatrix getPT() {try{__CLR4_4_1muzmuzlb90p93l.R.inc(29645);
        __CLR4_4_1muzmuzlb90p93l.R.inc(29646);if ((((cachedPt == null)&&(__CLR4_4_1muzmuzlb90p93l.R.iget(29647)!=0|true))||(__CLR4_4_1muzmuzlb90p93l.R.iget(29648)==0&false))) {{
            __CLR4_4_1muzmuzlb90p93l.R.inc(29649);cachedPt = getP().transpose();
        }

        // return the cached matrix
        }__CLR4_4_1muzmuzlb90p93l.R.inc(29650);return cachedPt;
    }finally{__CLR4_4_1muzmuzlb90p93l.R.flushNeeded();}}

    /**
     * Returns the quasi-triangular Schur matrix T of the transform.
     *
     * @return the T matrix
     */
    public RealMatrix getT() {try{__CLR4_4_1muzmuzlb90p93l.R.inc(29651);
        __CLR4_4_1muzmuzlb90p93l.R.inc(29652);if ((((cachedT == null)&&(__CLR4_4_1muzmuzlb90p93l.R.iget(29653)!=0|true))||(__CLR4_4_1muzmuzlb90p93l.R.iget(29654)==0&false))) {{
            __CLR4_4_1muzmuzlb90p93l.R.inc(29655);cachedT = MatrixUtils.createRealMatrix(matrixT);
        }

        // return the cached matrix
        }__CLR4_4_1muzmuzlb90p93l.R.inc(29656);return cachedT;
    }finally{__CLR4_4_1muzmuzlb90p93l.R.flushNeeded();}}

    /**
     * Transform original matrix to Schur form.
     * @throws MaxCountExceededException if the transformation does not converge
     */
    private void transform() {try{__CLR4_4_1muzmuzlb90p93l.R.inc(29657);
        __CLR4_4_1muzmuzlb90p93l.R.inc(29658);final int n = matrixT.length;

        // compute matrix norm
        __CLR4_4_1muzmuzlb90p93l.R.inc(29659);final double norm = getNorm();

        // shift information
        __CLR4_4_1muzmuzlb90p93l.R.inc(29660);final ShiftInfo shift = new ShiftInfo();

        // Outer loop over eigenvalue index
        __CLR4_4_1muzmuzlb90p93l.R.inc(29661);int iteration = 0;
        __CLR4_4_1muzmuzlb90p93l.R.inc(29662);int iu = n - 1;
        __CLR4_4_1muzmuzlb90p93l.R.inc(29663);while ((((iu >= 0)&&(__CLR4_4_1muzmuzlb90p93l.R.iget(29664)!=0|true))||(__CLR4_4_1muzmuzlb90p93l.R.iget(29665)==0&false))) {{

            // Look for single small sub-diagonal element
            __CLR4_4_1muzmuzlb90p93l.R.inc(29666);final int il = findSmallSubDiagonalElement(iu, norm);

            // Check for convergence
            __CLR4_4_1muzmuzlb90p93l.R.inc(29667);if ((((il == iu)&&(__CLR4_4_1muzmuzlb90p93l.R.iget(29668)!=0|true))||(__CLR4_4_1muzmuzlb90p93l.R.iget(29669)==0&false))) {{
                // One root found
                __CLR4_4_1muzmuzlb90p93l.R.inc(29670);matrixT[iu][iu] = matrixT[iu][iu] + shift.exShift;
                __CLR4_4_1muzmuzlb90p93l.R.inc(29671);iu--;
                __CLR4_4_1muzmuzlb90p93l.R.inc(29672);iteration = 0;
            } }else {__CLR4_4_1muzmuzlb90p93l.R.inc(29673);if ((((il == iu - 1)&&(__CLR4_4_1muzmuzlb90p93l.R.iget(29674)!=0|true))||(__CLR4_4_1muzmuzlb90p93l.R.iget(29675)==0&false))) {{
                // Two roots found
                __CLR4_4_1muzmuzlb90p93l.R.inc(29676);double p = (matrixT[iu - 1][iu - 1] - matrixT[iu][iu]) / 2.0;
                __CLR4_4_1muzmuzlb90p93l.R.inc(29677);double q = p * p + matrixT[iu][iu - 1] * matrixT[iu - 1][iu];
                __CLR4_4_1muzmuzlb90p93l.R.inc(29678);matrixT[iu][iu] += shift.exShift;
                __CLR4_4_1muzmuzlb90p93l.R.inc(29679);matrixT[iu - 1][iu - 1] += shift.exShift;

                __CLR4_4_1muzmuzlb90p93l.R.inc(29680);if ((((q >= 0)&&(__CLR4_4_1muzmuzlb90p93l.R.iget(29681)!=0|true))||(__CLR4_4_1muzmuzlb90p93l.R.iget(29682)==0&false))) {{
                    __CLR4_4_1muzmuzlb90p93l.R.inc(29683);double z = FastMath.sqrt(FastMath.abs(q));
                    __CLR4_4_1muzmuzlb90p93l.R.inc(29684);if ((((p >= 0)&&(__CLR4_4_1muzmuzlb90p93l.R.iget(29685)!=0|true))||(__CLR4_4_1muzmuzlb90p93l.R.iget(29686)==0&false))) {{
                        __CLR4_4_1muzmuzlb90p93l.R.inc(29687);z = p + z;
                    } }else {{
                        __CLR4_4_1muzmuzlb90p93l.R.inc(29688);z = p - z;
                    }
                    }__CLR4_4_1muzmuzlb90p93l.R.inc(29689);final double x = matrixT[iu][iu - 1];
                    __CLR4_4_1muzmuzlb90p93l.R.inc(29690);final double s = FastMath.abs(x) + FastMath.abs(z);
                    __CLR4_4_1muzmuzlb90p93l.R.inc(29691);p = x / s;
                    __CLR4_4_1muzmuzlb90p93l.R.inc(29692);q = z / s;
                    __CLR4_4_1muzmuzlb90p93l.R.inc(29693);final double r = FastMath.sqrt(p * p + q * q);
                    __CLR4_4_1muzmuzlb90p93l.R.inc(29694);p = p / r;
                    __CLR4_4_1muzmuzlb90p93l.R.inc(29695);q = q / r;

                    // Row modification
                    __CLR4_4_1muzmuzlb90p93l.R.inc(29696);for (int j = iu - 1; (((j < n)&&(__CLR4_4_1muzmuzlb90p93l.R.iget(29697)!=0|true))||(__CLR4_4_1muzmuzlb90p93l.R.iget(29698)==0&false)); j++) {{
                        __CLR4_4_1muzmuzlb90p93l.R.inc(29699);z = matrixT[iu - 1][j];
                        __CLR4_4_1muzmuzlb90p93l.R.inc(29700);matrixT[iu - 1][j] = q * z + p * matrixT[iu][j];
                        __CLR4_4_1muzmuzlb90p93l.R.inc(29701);matrixT[iu][j] = q * matrixT[iu][j] - p * z;
                    }

                    // Column modification
                    }__CLR4_4_1muzmuzlb90p93l.R.inc(29702);for (int i = 0; (((i <= iu)&&(__CLR4_4_1muzmuzlb90p93l.R.iget(29703)!=0|true))||(__CLR4_4_1muzmuzlb90p93l.R.iget(29704)==0&false)); i++) {{
                        __CLR4_4_1muzmuzlb90p93l.R.inc(29705);z = matrixT[i][iu - 1];
                        __CLR4_4_1muzmuzlb90p93l.R.inc(29706);matrixT[i][iu - 1] = q * z + p * matrixT[i][iu];
                        __CLR4_4_1muzmuzlb90p93l.R.inc(29707);matrixT[i][iu] = q * matrixT[i][iu] - p * z;
                    }

                    // Accumulate transformations
                    }__CLR4_4_1muzmuzlb90p93l.R.inc(29708);for (int i = 0; (((i <= n - 1)&&(__CLR4_4_1muzmuzlb90p93l.R.iget(29709)!=0|true))||(__CLR4_4_1muzmuzlb90p93l.R.iget(29710)==0&false)); i++) {{
                        __CLR4_4_1muzmuzlb90p93l.R.inc(29711);z = matrixP[i][iu - 1];
                        __CLR4_4_1muzmuzlb90p93l.R.inc(29712);matrixP[i][iu - 1] = q * z + p * matrixP[i][iu];
                        __CLR4_4_1muzmuzlb90p93l.R.inc(29713);matrixP[i][iu] = q * matrixP[i][iu] - p * z;
                    }
                }}
                }__CLR4_4_1muzmuzlb90p93l.R.inc(29714);iu -= 2;
                __CLR4_4_1muzmuzlb90p93l.R.inc(29715);iteration = 0;
            } }else {{
                // No convergence yet
                __CLR4_4_1muzmuzlb90p93l.R.inc(29716);computeShift(il, iu, iteration, shift);

                // stop transformation after too many iterations
                __CLR4_4_1muzmuzlb90p93l.R.inc(29717);if ((((++iteration > MAX_ITERATIONS)&&(__CLR4_4_1muzmuzlb90p93l.R.iget(29718)!=0|true))||(__CLR4_4_1muzmuzlb90p93l.R.iget(29719)==0&false))) {{
                    __CLR4_4_1muzmuzlb90p93l.R.inc(29720);throw new MaxCountExceededException(LocalizedFormats.CONVERGENCE_FAILED,
                                                        MAX_ITERATIONS);
                }

                // the initial houseHolder vector for the QR step
                }__CLR4_4_1muzmuzlb90p93l.R.inc(29721);final double[] hVec = new double[3];

                __CLR4_4_1muzmuzlb90p93l.R.inc(29722);final int im = initQRStep(il, iu, shift, hVec);
                __CLR4_4_1muzmuzlb90p93l.R.inc(29723);performDoubleQRStep(il, im, iu, shift, hVec);
            }
        }}}
    }}finally{__CLR4_4_1muzmuzlb90p93l.R.flushNeeded();}}

    /**
     * Computes the L1 norm of the (quasi-)triangular matrix T.
     *
     * @return the L1 norm of matrix T
     */
    private double getNorm() {try{__CLR4_4_1muzmuzlb90p93l.R.inc(29724);
        __CLR4_4_1muzmuzlb90p93l.R.inc(29725);double norm = 0.0;
        __CLR4_4_1muzmuzlb90p93l.R.inc(29726);for (int i = 0; (((i < matrixT.length)&&(__CLR4_4_1muzmuzlb90p93l.R.iget(29727)!=0|true))||(__CLR4_4_1muzmuzlb90p93l.R.iget(29728)==0&false)); i++) {{
            // as matrix T is (quasi-)triangular, also take the sub-diagonal element into account
            __CLR4_4_1muzmuzlb90p93l.R.inc(29729);for (int j = FastMath.max(i - 1, 0); (((j < matrixT.length)&&(__CLR4_4_1muzmuzlb90p93l.R.iget(29730)!=0|true))||(__CLR4_4_1muzmuzlb90p93l.R.iget(29731)==0&false)); j++) {{
                __CLR4_4_1muzmuzlb90p93l.R.inc(29732);norm += FastMath.abs(matrixT[i][j]);
            }
        }}
        }__CLR4_4_1muzmuzlb90p93l.R.inc(29733);return norm;
    }finally{__CLR4_4_1muzmuzlb90p93l.R.flushNeeded();}}

    /**
     * Find the first small sub-diagonal element and returns its index.
     *
     * @param startIdx the starting index for the search
     * @param norm the L1 norm of the matrix
     * @return the index of the first small sub-diagonal element
     */
    private int findSmallSubDiagonalElement(final int startIdx, final double norm) {try{__CLR4_4_1muzmuzlb90p93l.R.inc(29734);
        __CLR4_4_1muzmuzlb90p93l.R.inc(29735);int l = startIdx;
        __CLR4_4_1muzmuzlb90p93l.R.inc(29736);while ((((l > 0)&&(__CLR4_4_1muzmuzlb90p93l.R.iget(29737)!=0|true))||(__CLR4_4_1muzmuzlb90p93l.R.iget(29738)==0&false))) {{
            __CLR4_4_1muzmuzlb90p93l.R.inc(29739);double s = FastMath.abs(matrixT[l - 1][l - 1]) + FastMath.abs(matrixT[l][l]);
            __CLR4_4_1muzmuzlb90p93l.R.inc(29740);if ((((s == 0.0)&&(__CLR4_4_1muzmuzlb90p93l.R.iget(29741)!=0|true))||(__CLR4_4_1muzmuzlb90p93l.R.iget(29742)==0&false))) {{
                __CLR4_4_1muzmuzlb90p93l.R.inc(29743);s = norm;
            }
            }__CLR4_4_1muzmuzlb90p93l.R.inc(29744);if ((((FastMath.abs(matrixT[l][l - 1]) < epsilon * s)&&(__CLR4_4_1muzmuzlb90p93l.R.iget(29745)!=0|true))||(__CLR4_4_1muzmuzlb90p93l.R.iget(29746)==0&false))) {{
                __CLR4_4_1muzmuzlb90p93l.R.inc(29747);break;
            }
            }__CLR4_4_1muzmuzlb90p93l.R.inc(29748);l--;
        }
        }__CLR4_4_1muzmuzlb90p93l.R.inc(29749);return l;
    }finally{__CLR4_4_1muzmuzlb90p93l.R.flushNeeded();}}

    /**
     * Compute the shift for the current iteration.
     *
     * @param l the index of the small sub-diagonal element
     * @param idx the current eigenvalue index
     * @param iteration the current iteration
     * @param shift holder for shift information
     */
    private void computeShift(final int l, final int idx, final int iteration, final ShiftInfo shift) {try{__CLR4_4_1muzmuzlb90p93l.R.inc(29750);
        // Form shift
        __CLR4_4_1muzmuzlb90p93l.R.inc(29751);shift.x = matrixT[idx][idx];
        __CLR4_4_1muzmuzlb90p93l.R.inc(29752);shift.y = shift.w = 0.0;
        __CLR4_4_1muzmuzlb90p93l.R.inc(29753);if ((((l < idx)&&(__CLR4_4_1muzmuzlb90p93l.R.iget(29754)!=0|true))||(__CLR4_4_1muzmuzlb90p93l.R.iget(29755)==0&false))) {{
            __CLR4_4_1muzmuzlb90p93l.R.inc(29756);shift.y = matrixT[idx - 1][idx - 1];
            __CLR4_4_1muzmuzlb90p93l.R.inc(29757);shift.w = matrixT[idx][idx - 1] * matrixT[idx - 1][idx];
        }

        // Wilkinson's original ad hoc shift
        }__CLR4_4_1muzmuzlb90p93l.R.inc(29758);if ((((iteration == 10)&&(__CLR4_4_1muzmuzlb90p93l.R.iget(29759)!=0|true))||(__CLR4_4_1muzmuzlb90p93l.R.iget(29760)==0&false))) {{
            __CLR4_4_1muzmuzlb90p93l.R.inc(29761);shift.exShift += shift.x;
            __CLR4_4_1muzmuzlb90p93l.R.inc(29762);for (int i = 0; (((i <= idx)&&(__CLR4_4_1muzmuzlb90p93l.R.iget(29763)!=0|true))||(__CLR4_4_1muzmuzlb90p93l.R.iget(29764)==0&false)); i++) {{
                __CLR4_4_1muzmuzlb90p93l.R.inc(29765);matrixT[i][i] -= shift.x;
            }
            }__CLR4_4_1muzmuzlb90p93l.R.inc(29766);final double s = FastMath.abs(matrixT[idx][idx - 1]) + FastMath.abs(matrixT[idx - 1][idx - 2]);
            __CLR4_4_1muzmuzlb90p93l.R.inc(29767);shift.x = 0.75 * s;
            __CLR4_4_1muzmuzlb90p93l.R.inc(29768);shift.y = 0.75 * s;
            __CLR4_4_1muzmuzlb90p93l.R.inc(29769);shift.w = -0.4375 * s * s;
        }

        // MATLAB's new ad hoc shift
        }__CLR4_4_1muzmuzlb90p93l.R.inc(29770);if ((((iteration == 30)&&(__CLR4_4_1muzmuzlb90p93l.R.iget(29771)!=0|true))||(__CLR4_4_1muzmuzlb90p93l.R.iget(29772)==0&false))) {{
            __CLR4_4_1muzmuzlb90p93l.R.inc(29773);double s = (shift.y - shift.x) / 2.0;
            __CLR4_4_1muzmuzlb90p93l.R.inc(29774);s = s * s + shift.w;
            __CLR4_4_1muzmuzlb90p93l.R.inc(29775);if ((((s > 0.0)&&(__CLR4_4_1muzmuzlb90p93l.R.iget(29776)!=0|true))||(__CLR4_4_1muzmuzlb90p93l.R.iget(29777)==0&false))) {{
                __CLR4_4_1muzmuzlb90p93l.R.inc(29778);s = FastMath.sqrt(s);
                __CLR4_4_1muzmuzlb90p93l.R.inc(29779);if ((((shift.y < shift.x)&&(__CLR4_4_1muzmuzlb90p93l.R.iget(29780)!=0|true))||(__CLR4_4_1muzmuzlb90p93l.R.iget(29781)==0&false))) {{
                    __CLR4_4_1muzmuzlb90p93l.R.inc(29782);s = -s;
                }
                }__CLR4_4_1muzmuzlb90p93l.R.inc(29783);s = shift.x - shift.w / ((shift.y - shift.x) / 2.0 + s);
                __CLR4_4_1muzmuzlb90p93l.R.inc(29784);for (int i = 0; (((i <= idx)&&(__CLR4_4_1muzmuzlb90p93l.R.iget(29785)!=0|true))||(__CLR4_4_1muzmuzlb90p93l.R.iget(29786)==0&false)); i++) {{
                    __CLR4_4_1muzmuzlb90p93l.R.inc(29787);matrixT[i][i] -= s;
                }
                }__CLR4_4_1muzmuzlb90p93l.R.inc(29788);shift.exShift += s;
                __CLR4_4_1muzmuzlb90p93l.R.inc(29789);shift.x = shift.y = shift.w = 0.964;
            }
        }}
    }}finally{__CLR4_4_1muzmuzlb90p93l.R.flushNeeded();}}

    /**
     * Initialize the householder vectors for the QR step.
     *
     * @param il the index of the small sub-diagonal element
     * @param iu the current eigenvalue index
     * @param shift shift information holder
     * @param hVec the initial houseHolder vector
     * @return the start index for the QR step
     */
    private int initQRStep(int il, final int iu, final ShiftInfo shift, double[] hVec) {try{__CLR4_4_1muzmuzlb90p93l.R.inc(29790);
        // Look for two consecutive small sub-diagonal elements
        __CLR4_4_1muzmuzlb90p93l.R.inc(29791);int im = iu - 2;
        __CLR4_4_1muzmuzlb90p93l.R.inc(29792);while ((((im >= il)&&(__CLR4_4_1muzmuzlb90p93l.R.iget(29793)!=0|true))||(__CLR4_4_1muzmuzlb90p93l.R.iget(29794)==0&false))) {{
            __CLR4_4_1muzmuzlb90p93l.R.inc(29795);final double z = matrixT[im][im];
            __CLR4_4_1muzmuzlb90p93l.R.inc(29796);final double r = shift.x - z;
            __CLR4_4_1muzmuzlb90p93l.R.inc(29797);double s = shift.y - z;
            __CLR4_4_1muzmuzlb90p93l.R.inc(29798);hVec[0] = (r * s - shift.w) / matrixT[im + 1][im] + matrixT[im][im + 1];
            __CLR4_4_1muzmuzlb90p93l.R.inc(29799);hVec[1] = matrixT[im + 1][im + 1] - z - r - s;
            __CLR4_4_1muzmuzlb90p93l.R.inc(29800);hVec[2] = matrixT[im + 2][im + 1];

            __CLR4_4_1muzmuzlb90p93l.R.inc(29801);if ((((im == il)&&(__CLR4_4_1muzmuzlb90p93l.R.iget(29802)!=0|true))||(__CLR4_4_1muzmuzlb90p93l.R.iget(29803)==0&false))) {{
                __CLR4_4_1muzmuzlb90p93l.R.inc(29804);break;
            }

            }__CLR4_4_1muzmuzlb90p93l.R.inc(29805);final double lhs = FastMath.abs(matrixT[im][im - 1]) * (FastMath.abs(hVec[1]) + FastMath.abs(hVec[2]));
            __CLR4_4_1muzmuzlb90p93l.R.inc(29806);final double rhs = FastMath.abs(hVec[0]) * (FastMath.abs(matrixT[im - 1][im - 1]) +
                                                        FastMath.abs(z) +
                                                        FastMath.abs(matrixT[im + 1][im + 1]));

            __CLR4_4_1muzmuzlb90p93l.R.inc(29807);if ((((lhs < epsilon * rhs)&&(__CLR4_4_1muzmuzlb90p93l.R.iget(29808)!=0|true))||(__CLR4_4_1muzmuzlb90p93l.R.iget(29809)==0&false))) {{
                __CLR4_4_1muzmuzlb90p93l.R.inc(29810);break;
            }
            }__CLR4_4_1muzmuzlb90p93l.R.inc(29811);im--;
        }

        }__CLR4_4_1muzmuzlb90p93l.R.inc(29812);return im;
    }finally{__CLR4_4_1muzmuzlb90p93l.R.flushNeeded();}}

    /**
     * Perform a double QR step involving rows l:idx and columns m:n
     *
     * @param il the index of the small sub-diagonal element
     * @param im the start index for the QR step
     * @param iu the current eigenvalue index
     * @param shift shift information holder
     * @param hVec the initial houseHolder vector
     */
    private void performDoubleQRStep(final int il, final int im, final int iu,
                                     final ShiftInfo shift, final double[] hVec) {try{__CLR4_4_1muzmuzlb90p93l.R.inc(29813);

        __CLR4_4_1muzmuzlb90p93l.R.inc(29814);final int n = matrixT.length;
        __CLR4_4_1muzmuzlb90p93l.R.inc(29815);double p = hVec[0];
        __CLR4_4_1muzmuzlb90p93l.R.inc(29816);double q = hVec[1];
        __CLR4_4_1muzmuzlb90p93l.R.inc(29817);double r = hVec[2];

        __CLR4_4_1muzmuzlb90p93l.R.inc(29818);for (int k = im; (((k <= iu - 1)&&(__CLR4_4_1muzmuzlb90p93l.R.iget(29819)!=0|true))||(__CLR4_4_1muzmuzlb90p93l.R.iget(29820)==0&false)); k++) {{
            __CLR4_4_1muzmuzlb90p93l.R.inc(29821);boolean notlast = k != (iu - 1);
            __CLR4_4_1muzmuzlb90p93l.R.inc(29822);if ((((k != im)&&(__CLR4_4_1muzmuzlb90p93l.R.iget(29823)!=0|true))||(__CLR4_4_1muzmuzlb90p93l.R.iget(29824)==0&false))) {{
                __CLR4_4_1muzmuzlb90p93l.R.inc(29825);p = matrixT[k][k - 1];
                __CLR4_4_1muzmuzlb90p93l.R.inc(29826);q = matrixT[k + 1][k - 1];
                __CLR4_4_1muzmuzlb90p93l.R.inc(29827);r = (((notlast )&&(__CLR4_4_1muzmuzlb90p93l.R.iget(29828)!=0|true))||(__CLR4_4_1muzmuzlb90p93l.R.iget(29829)==0&false))? matrixT[k + 2][k - 1] : 0.0;
                __CLR4_4_1muzmuzlb90p93l.R.inc(29830);shift.x = FastMath.abs(p) + FastMath.abs(q) + FastMath.abs(r);
                __CLR4_4_1muzmuzlb90p93l.R.inc(29831);if ((((!Precision.equals(shift.x, 0.0, epsilon))&&(__CLR4_4_1muzmuzlb90p93l.R.iget(29832)!=0|true))||(__CLR4_4_1muzmuzlb90p93l.R.iget(29833)==0&false))) {{
                    __CLR4_4_1muzmuzlb90p93l.R.inc(29834);p = p / shift.x;
                    __CLR4_4_1muzmuzlb90p93l.R.inc(29835);q = q / shift.x;
                    __CLR4_4_1muzmuzlb90p93l.R.inc(29836);r = r / shift.x;
                }
            }}
            }__CLR4_4_1muzmuzlb90p93l.R.inc(29837);if ((((shift.x == 0.0)&&(__CLR4_4_1muzmuzlb90p93l.R.iget(29838)!=0|true))||(__CLR4_4_1muzmuzlb90p93l.R.iget(29839)==0&false))) {{
                __CLR4_4_1muzmuzlb90p93l.R.inc(29840);break;
            }
            }__CLR4_4_1muzmuzlb90p93l.R.inc(29841);double s = FastMath.sqrt(p * p + q * q + r * r);
            __CLR4_4_1muzmuzlb90p93l.R.inc(29842);if ((((p < 0.0)&&(__CLR4_4_1muzmuzlb90p93l.R.iget(29843)!=0|true))||(__CLR4_4_1muzmuzlb90p93l.R.iget(29844)==0&false))) {{
                __CLR4_4_1muzmuzlb90p93l.R.inc(29845);s = -s;
            }
            }__CLR4_4_1muzmuzlb90p93l.R.inc(29846);if ((((s != 0.0)&&(__CLR4_4_1muzmuzlb90p93l.R.iget(29847)!=0|true))||(__CLR4_4_1muzmuzlb90p93l.R.iget(29848)==0&false))) {{
                __CLR4_4_1muzmuzlb90p93l.R.inc(29849);if ((((k != im)&&(__CLR4_4_1muzmuzlb90p93l.R.iget(29850)!=0|true))||(__CLR4_4_1muzmuzlb90p93l.R.iget(29851)==0&false))) {{
                    __CLR4_4_1muzmuzlb90p93l.R.inc(29852);matrixT[k][k - 1] = -s * shift.x;
                } }else {__CLR4_4_1muzmuzlb90p93l.R.inc(29853);if ((((il != im)&&(__CLR4_4_1muzmuzlb90p93l.R.iget(29854)!=0|true))||(__CLR4_4_1muzmuzlb90p93l.R.iget(29855)==0&false))) {{
                    __CLR4_4_1muzmuzlb90p93l.R.inc(29856);matrixT[k][k - 1] = -matrixT[k][k - 1];
                }
                }}__CLR4_4_1muzmuzlb90p93l.R.inc(29857);p = p + s;
                __CLR4_4_1muzmuzlb90p93l.R.inc(29858);shift.x = p / s;
                __CLR4_4_1muzmuzlb90p93l.R.inc(29859);shift.y = q / s;
                __CLR4_4_1muzmuzlb90p93l.R.inc(29860);double z = r / s;
                __CLR4_4_1muzmuzlb90p93l.R.inc(29861);q = q / p;
                __CLR4_4_1muzmuzlb90p93l.R.inc(29862);r = r / p;

                // Row modification
                __CLR4_4_1muzmuzlb90p93l.R.inc(29863);for (int j = k; (((j < n)&&(__CLR4_4_1muzmuzlb90p93l.R.iget(29864)!=0|true))||(__CLR4_4_1muzmuzlb90p93l.R.iget(29865)==0&false)); j++) {{
                    __CLR4_4_1muzmuzlb90p93l.R.inc(29866);p = matrixT[k][j] + q * matrixT[k + 1][j];
                    __CLR4_4_1muzmuzlb90p93l.R.inc(29867);if ((((notlast)&&(__CLR4_4_1muzmuzlb90p93l.R.iget(29868)!=0|true))||(__CLR4_4_1muzmuzlb90p93l.R.iget(29869)==0&false))) {{
                        __CLR4_4_1muzmuzlb90p93l.R.inc(29870);p = p + r * matrixT[k + 2][j];
                        __CLR4_4_1muzmuzlb90p93l.R.inc(29871);matrixT[k + 2][j] = matrixT[k + 2][j] - p * z;
                    }
                    }__CLR4_4_1muzmuzlb90p93l.R.inc(29872);matrixT[k][j] = matrixT[k][j] - p * shift.x;
                    __CLR4_4_1muzmuzlb90p93l.R.inc(29873);matrixT[k + 1][j] = matrixT[k + 1][j] - p * shift.y;
                }

                // Column modification
                }__CLR4_4_1muzmuzlb90p93l.R.inc(29874);for (int i = 0; (((i <= FastMath.min(iu, k + 3))&&(__CLR4_4_1muzmuzlb90p93l.R.iget(29875)!=0|true))||(__CLR4_4_1muzmuzlb90p93l.R.iget(29876)==0&false)); i++) {{
                    __CLR4_4_1muzmuzlb90p93l.R.inc(29877);p = shift.x * matrixT[i][k] + shift.y * matrixT[i][k + 1];
                    __CLR4_4_1muzmuzlb90p93l.R.inc(29878);if ((((notlast)&&(__CLR4_4_1muzmuzlb90p93l.R.iget(29879)!=0|true))||(__CLR4_4_1muzmuzlb90p93l.R.iget(29880)==0&false))) {{
                        __CLR4_4_1muzmuzlb90p93l.R.inc(29881);p = p + z * matrixT[i][k + 2];
                        __CLR4_4_1muzmuzlb90p93l.R.inc(29882);matrixT[i][k + 2] = matrixT[i][k + 2] - p * r;
                    }
                    }__CLR4_4_1muzmuzlb90p93l.R.inc(29883);matrixT[i][k] = matrixT[i][k] - p;
                    __CLR4_4_1muzmuzlb90p93l.R.inc(29884);matrixT[i][k + 1] = matrixT[i][k + 1] - p * q;
                }

                // Accumulate transformations
                }__CLR4_4_1muzmuzlb90p93l.R.inc(29885);final int high = matrixT.length - 1;
                __CLR4_4_1muzmuzlb90p93l.R.inc(29886);for (int i = 0; (((i <= high)&&(__CLR4_4_1muzmuzlb90p93l.R.iget(29887)!=0|true))||(__CLR4_4_1muzmuzlb90p93l.R.iget(29888)==0&false)); i++) {{
                    __CLR4_4_1muzmuzlb90p93l.R.inc(29889);p = shift.x * matrixP[i][k] + shift.y * matrixP[i][k + 1];
                    __CLR4_4_1muzmuzlb90p93l.R.inc(29890);if ((((notlast)&&(__CLR4_4_1muzmuzlb90p93l.R.iget(29891)!=0|true))||(__CLR4_4_1muzmuzlb90p93l.R.iget(29892)==0&false))) {{
                        __CLR4_4_1muzmuzlb90p93l.R.inc(29893);p = p + z * matrixP[i][k + 2];
                        __CLR4_4_1muzmuzlb90p93l.R.inc(29894);matrixP[i][k + 2] = matrixP[i][k + 2] - p * r;
                    }
                    }__CLR4_4_1muzmuzlb90p93l.R.inc(29895);matrixP[i][k] = matrixP[i][k] - p;
                    __CLR4_4_1muzmuzlb90p93l.R.inc(29896);matrixP[i][k + 1] = matrixP[i][k + 1] - p * q;
                }
            }}  // (s != 0)
        }}  // k loop

        // clean up pollution due to round-off errors
        }__CLR4_4_1muzmuzlb90p93l.R.inc(29897);for (int i = im + 2; (((i <= iu)&&(__CLR4_4_1muzmuzlb90p93l.R.iget(29898)!=0|true))||(__CLR4_4_1muzmuzlb90p93l.R.iget(29899)==0&false)); i++) {{
            __CLR4_4_1muzmuzlb90p93l.R.inc(29900);matrixT[i][i-2] = 0.0;
            __CLR4_4_1muzmuzlb90p93l.R.inc(29901);if ((((i > im + 2)&&(__CLR4_4_1muzmuzlb90p93l.R.iget(29902)!=0|true))||(__CLR4_4_1muzmuzlb90p93l.R.iget(29903)==0&false))) {{
                __CLR4_4_1muzmuzlb90p93l.R.inc(29904);matrixT[i][i-3] = 0.0;
            }
        }}
    }}finally{__CLR4_4_1muzmuzlb90p93l.R.flushNeeded();}}

    /**
     * Internal data structure holding the current shift information.
     * Contains variable names as present in the original JAMA code.
     */
    private static class ShiftInfo {
        // CHECKSTYLE: stop all

        /** x shift info */
        double x;
        /** y shift info */
        double y;
        /** w shift info */
        double w;
        /** Indicates an exceptional shift. */
        double exShift;

        // CHECKSTYLE: resume all
    }
}
