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

import java.util.Arrays;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.util.FastMath;


/**
 * Calculates the QR-decomposition of a matrix.
 * <p>The QR-decomposition of a matrix A consists of two matrices Q and R
 * that satisfy: A = QR, Q is orthogonal (Q<sup>T</sup>Q = I), and R is
 * upper triangular. If A is m&times;n, Q is m&times;m and R m&times;n.</p>
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
 * @since 1.2 (changed to concrete class in 3.0)
 */
public class QRDecomposition {public static class __CLR4_4_1lzmlzmlb90p90g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,28750,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * A packed TRANSPOSED representation of the QR decomposition.
     * <p>The elements BELOW the diagonal are the elements of the UPPER triangular
     * matrix R, and the rows ABOVE the diagonal are the Householder reflector vectors
     * from which an explicit form of Q can be recomputed if desired.</p>
     */
    private double[][] qrt;
    /** The diagonal elements of R. */
    private double[] rDiag;
    /** Cached value of Q. */
    private RealMatrix cachedQ;
    /** Cached value of QT. */
    private RealMatrix cachedQT;
    /** Cached value of R. */
    private RealMatrix cachedR;
    /** Cached value of H. */
    private RealMatrix cachedH;
    /** Singularity threshold. */
    private final double threshold;

    /**
     * Calculates the QR-decomposition of the given matrix.
     * The singularity threshold defaults to zero.
     *
     * @param matrix The matrix to decompose.
     *
     * @see #QRDecomposition(RealMatrix,double)
     */
    public QRDecomposition(RealMatrix matrix) {
        this(matrix, 0d);__CLR4_4_1lzmlzmlb90p90g.R.inc(28499);try{__CLR4_4_1lzmlzmlb90p90g.R.inc(28498);
    }finally{__CLR4_4_1lzmlzmlb90p90g.R.flushNeeded();}}

    /**
     * Calculates the QR-decomposition of the given matrix.
     *
     * @param matrix The matrix to decompose.
     * @param threshold Singularity threshold.
     */
    public QRDecomposition(RealMatrix matrix,
                           double threshold) {try{__CLR4_4_1lzmlzmlb90p90g.R.inc(28500);
        __CLR4_4_1lzmlzmlb90p90g.R.inc(28501);this.threshold = threshold;

        __CLR4_4_1lzmlzmlb90p90g.R.inc(28502);final int m = matrix.getRowDimension();
        __CLR4_4_1lzmlzmlb90p90g.R.inc(28503);final int n = matrix.getColumnDimension();
        __CLR4_4_1lzmlzmlb90p90g.R.inc(28504);qrt = matrix.transpose().getData();
        __CLR4_4_1lzmlzmlb90p90g.R.inc(28505);rDiag = new double[FastMath.min(m, n)];
        __CLR4_4_1lzmlzmlb90p90g.R.inc(28506);cachedQ  = null;
        __CLR4_4_1lzmlzmlb90p90g.R.inc(28507);cachedQT = null;
        __CLR4_4_1lzmlzmlb90p90g.R.inc(28508);cachedR  = null;
        __CLR4_4_1lzmlzmlb90p90g.R.inc(28509);cachedH  = null;

        __CLR4_4_1lzmlzmlb90p90g.R.inc(28510);decompose(qrt);

    }finally{__CLR4_4_1lzmlzmlb90p90g.R.flushNeeded();}}

    /** Decompose matrix.
     * @param matrix transposed matrix
     * @since 3.2
     */
    protected void decompose(double[][] matrix) {try{__CLR4_4_1lzmlzmlb90p90g.R.inc(28511);
        __CLR4_4_1lzmlzmlb90p90g.R.inc(28512);for (int minor = 0; (((minor < FastMath.min(qrt.length, qrt[0].length))&&(__CLR4_4_1lzmlzmlb90p90g.R.iget(28513)!=0|true))||(__CLR4_4_1lzmlzmlb90p90g.R.iget(28514)==0&false)); minor++) {{
            __CLR4_4_1lzmlzmlb90p90g.R.inc(28515);performHouseholderReflection(minor, qrt);
        }
    }}finally{__CLR4_4_1lzmlzmlb90p90g.R.flushNeeded();}}

    /** Perform Householder reflection for a minor A(minor, minor) of A.
     * @param minor minor index
     * @param matrix transposed matrix
     * @since 3.2
     */
    protected void performHouseholderReflection(int minor, double[][] matrix) {try{__CLR4_4_1lzmlzmlb90p90g.R.inc(28516);

        __CLR4_4_1lzmlzmlb90p90g.R.inc(28517);final double[] qrtMinor = qrt[minor];

        /*
         * Let x be the first column of the minor, and a^2 = |x|^2.
         * x will be in the positions qr[minor][minor] through qr[m][minor].
         * The first column of the transformed minor will be (a,0,0,..)'
         * The sign of a is chosen to be opposite to the sign of the first
         * component of x. Let's find a:
         */
        __CLR4_4_1lzmlzmlb90p90g.R.inc(28518);double xNormSqr = 0;
        __CLR4_4_1lzmlzmlb90p90g.R.inc(28519);for (int row = minor; (((row < qrtMinor.length)&&(__CLR4_4_1lzmlzmlb90p90g.R.iget(28520)!=0|true))||(__CLR4_4_1lzmlzmlb90p90g.R.iget(28521)==0&false)); row++) {{
            __CLR4_4_1lzmlzmlb90p90g.R.inc(28522);final double c = qrtMinor[row];
            __CLR4_4_1lzmlzmlb90p90g.R.inc(28523);xNormSqr += c * c;
        }
        }__CLR4_4_1lzmlzmlb90p90g.R.inc(28524);final double a = ((((qrtMinor[minor] > 0) )&&(__CLR4_4_1lzmlzmlb90p90g.R.iget(28525)!=0|true))||(__CLR4_4_1lzmlzmlb90p90g.R.iget(28526)==0&false))? -FastMath.sqrt(xNormSqr) : FastMath.sqrt(xNormSqr);
        __CLR4_4_1lzmlzmlb90p90g.R.inc(28527);rDiag[minor] = a;

        __CLR4_4_1lzmlzmlb90p90g.R.inc(28528);if ((((a != 0.0)&&(__CLR4_4_1lzmlzmlb90p90g.R.iget(28529)!=0|true))||(__CLR4_4_1lzmlzmlb90p90g.R.iget(28530)==0&false))) {{

            /*
             * Calculate the normalized reflection vector v and transform
             * the first column. We know the norm of v beforehand: v = x-ae
             * so |v|^2 = <x-ae,x-ae> = <x,x>-2a<x,e>+a^2<e,e> =
             * a^2+a^2-2a<x,e> = 2a*(a - <x,e>).
             * Here <x, e> is now qr[minor][minor].
             * v = x-ae is stored in the column at qr:
             */
            __CLR4_4_1lzmlzmlb90p90g.R.inc(28531);qrtMinor[minor] -= a; // now |v|^2 = -2a*(qr[minor][minor])

            /*
             * Transform the rest of the columns of the minor:
             * They will be transformed by the matrix H = I-2vv'/|v|^2.
             * If x is a column vector of the minor, then
             * Hx = (I-2vv'/|v|^2)x = x-2vv'x/|v|^2 = x - 2<x,v>/|v|^2 v.
             * Therefore the transformation is easily calculated by
             * subtracting the column vector (2<x,v>/|v|^2)v from x.
             *
             * Let 2<x,v>/|v|^2 = alpha. From above we have
             * |v|^2 = -2a*(qr[minor][minor]), so
             * alpha = -<x,v>/(a*qr[minor][minor])
             */
            __CLR4_4_1lzmlzmlb90p90g.R.inc(28532);for (int col = minor+1; (((col < qrt.length)&&(__CLR4_4_1lzmlzmlb90p90g.R.iget(28533)!=0|true))||(__CLR4_4_1lzmlzmlb90p90g.R.iget(28534)==0&false)); col++) {{
                __CLR4_4_1lzmlzmlb90p90g.R.inc(28535);final double[] qrtCol = qrt[col];
                __CLR4_4_1lzmlzmlb90p90g.R.inc(28536);double alpha = 0;
                __CLR4_4_1lzmlzmlb90p90g.R.inc(28537);for (int row = minor; (((row < qrtCol.length)&&(__CLR4_4_1lzmlzmlb90p90g.R.iget(28538)!=0|true))||(__CLR4_4_1lzmlzmlb90p90g.R.iget(28539)==0&false)); row++) {{
                    __CLR4_4_1lzmlzmlb90p90g.R.inc(28540);alpha -= qrtCol[row] * qrtMinor[row];
                }
                }__CLR4_4_1lzmlzmlb90p90g.R.inc(28541);alpha /= a * qrtMinor[minor];

                // Subtract the column vector alpha*v from x.
                __CLR4_4_1lzmlzmlb90p90g.R.inc(28542);for (int row = minor; (((row < qrtCol.length)&&(__CLR4_4_1lzmlzmlb90p90g.R.iget(28543)!=0|true))||(__CLR4_4_1lzmlzmlb90p90g.R.iget(28544)==0&false)); row++) {{
                    __CLR4_4_1lzmlzmlb90p90g.R.inc(28545);qrtCol[row] -= alpha * qrtMinor[row];
                }
            }}
        }}
    }}finally{__CLR4_4_1lzmlzmlb90p90g.R.flushNeeded();}}


    /**
     * Returns the matrix R of the decomposition.
     * <p>R is an upper-triangular matrix</p>
     * @return the R matrix
     */
    public RealMatrix getR() {try{__CLR4_4_1lzmlzmlb90p90g.R.inc(28546);

        __CLR4_4_1lzmlzmlb90p90g.R.inc(28547);if ((((cachedR == null)&&(__CLR4_4_1lzmlzmlb90p90g.R.iget(28548)!=0|true))||(__CLR4_4_1lzmlzmlb90p90g.R.iget(28549)==0&false))) {{

            // R is supposed to be m x n
            __CLR4_4_1lzmlzmlb90p90g.R.inc(28550);final int n = qrt.length;
            __CLR4_4_1lzmlzmlb90p90g.R.inc(28551);final int m = qrt[0].length;
            __CLR4_4_1lzmlzmlb90p90g.R.inc(28552);double[][] ra = new double[m][n];
            // copy the diagonal from rDiag and the upper triangle of qr
            __CLR4_4_1lzmlzmlb90p90g.R.inc(28553);for (int row = FastMath.min(m, n) - 1; (((row >= 0)&&(__CLR4_4_1lzmlzmlb90p90g.R.iget(28554)!=0|true))||(__CLR4_4_1lzmlzmlb90p90g.R.iget(28555)==0&false)); row--) {{
                __CLR4_4_1lzmlzmlb90p90g.R.inc(28556);ra[row][row] = rDiag[row];
                __CLR4_4_1lzmlzmlb90p90g.R.inc(28557);for (int col = row + 1; (((col < n)&&(__CLR4_4_1lzmlzmlb90p90g.R.iget(28558)!=0|true))||(__CLR4_4_1lzmlzmlb90p90g.R.iget(28559)==0&false)); col++) {{
                    __CLR4_4_1lzmlzmlb90p90g.R.inc(28560);ra[row][col] = qrt[col][row];
                }
            }}
            }__CLR4_4_1lzmlzmlb90p90g.R.inc(28561);cachedR = MatrixUtils.createRealMatrix(ra);
        }

        // return the cached matrix
        }__CLR4_4_1lzmlzmlb90p90g.R.inc(28562);return cachedR;
    }finally{__CLR4_4_1lzmlzmlb90p90g.R.flushNeeded();}}

    /**
     * Returns the matrix Q of the decomposition.
     * <p>Q is an orthogonal matrix</p>
     * @return the Q matrix
     */
    public RealMatrix getQ() {try{__CLR4_4_1lzmlzmlb90p90g.R.inc(28563);
        __CLR4_4_1lzmlzmlb90p90g.R.inc(28564);if ((((cachedQ == null)&&(__CLR4_4_1lzmlzmlb90p90g.R.iget(28565)!=0|true))||(__CLR4_4_1lzmlzmlb90p90g.R.iget(28566)==0&false))) {{
            __CLR4_4_1lzmlzmlb90p90g.R.inc(28567);cachedQ = getQT().transpose();
        }
        }__CLR4_4_1lzmlzmlb90p90g.R.inc(28568);return cachedQ;
    }finally{__CLR4_4_1lzmlzmlb90p90g.R.flushNeeded();}}

    /**
     * Returns the transpose of the matrix Q of the decomposition.
     * <p>Q is an orthogonal matrix</p>
     * @return the transpose of the Q matrix, Q<sup>T</sup>
     */
    public RealMatrix getQT() {try{__CLR4_4_1lzmlzmlb90p90g.R.inc(28569);
        __CLR4_4_1lzmlzmlb90p90g.R.inc(28570);if ((((cachedQT == null)&&(__CLR4_4_1lzmlzmlb90p90g.R.iget(28571)!=0|true))||(__CLR4_4_1lzmlzmlb90p90g.R.iget(28572)==0&false))) {{

            // QT is supposed to be m x m
            __CLR4_4_1lzmlzmlb90p90g.R.inc(28573);final int n = qrt.length;
            __CLR4_4_1lzmlzmlb90p90g.R.inc(28574);final int m = qrt[0].length;
            __CLR4_4_1lzmlzmlb90p90g.R.inc(28575);double[][] qta = new double[m][m];

            /*
             * Q = Q1 Q2 ... Q_m, so Q is formed by first constructing Q_m and then
             * applying the Householder transformations Q_(m-1),Q_(m-2),...,Q1 in
             * succession to the result
             */
            __CLR4_4_1lzmlzmlb90p90g.R.inc(28576);for (int minor = m - 1; (((minor >= FastMath.min(m, n))&&(__CLR4_4_1lzmlzmlb90p90g.R.iget(28577)!=0|true))||(__CLR4_4_1lzmlzmlb90p90g.R.iget(28578)==0&false)); minor--) {{
                __CLR4_4_1lzmlzmlb90p90g.R.inc(28579);qta[minor][minor] = 1.0d;
            }

            }__CLR4_4_1lzmlzmlb90p90g.R.inc(28580);for (int minor = FastMath.min(m, n)-1; (((minor >= 0)&&(__CLR4_4_1lzmlzmlb90p90g.R.iget(28581)!=0|true))||(__CLR4_4_1lzmlzmlb90p90g.R.iget(28582)==0&false)); minor--){{
                __CLR4_4_1lzmlzmlb90p90g.R.inc(28583);final double[] qrtMinor = qrt[minor];
                __CLR4_4_1lzmlzmlb90p90g.R.inc(28584);qta[minor][minor] = 1.0d;
                __CLR4_4_1lzmlzmlb90p90g.R.inc(28585);if ((((qrtMinor[minor] != 0.0)&&(__CLR4_4_1lzmlzmlb90p90g.R.iget(28586)!=0|true))||(__CLR4_4_1lzmlzmlb90p90g.R.iget(28587)==0&false))) {{
                    __CLR4_4_1lzmlzmlb90p90g.R.inc(28588);for (int col = minor; (((col < m)&&(__CLR4_4_1lzmlzmlb90p90g.R.iget(28589)!=0|true))||(__CLR4_4_1lzmlzmlb90p90g.R.iget(28590)==0&false)); col++) {{
                        __CLR4_4_1lzmlzmlb90p90g.R.inc(28591);double alpha = 0;
                        __CLR4_4_1lzmlzmlb90p90g.R.inc(28592);for (int row = minor; (((row < m)&&(__CLR4_4_1lzmlzmlb90p90g.R.iget(28593)!=0|true))||(__CLR4_4_1lzmlzmlb90p90g.R.iget(28594)==0&false)); row++) {{
                            __CLR4_4_1lzmlzmlb90p90g.R.inc(28595);alpha -= qta[col][row] * qrtMinor[row];
                        }
                        }__CLR4_4_1lzmlzmlb90p90g.R.inc(28596);alpha /= rDiag[minor] * qrtMinor[minor];

                        __CLR4_4_1lzmlzmlb90p90g.R.inc(28597);for (int row = minor; (((row < m)&&(__CLR4_4_1lzmlzmlb90p90g.R.iget(28598)!=0|true))||(__CLR4_4_1lzmlzmlb90p90g.R.iget(28599)==0&false)); row++) {{
                            __CLR4_4_1lzmlzmlb90p90g.R.inc(28600);qta[col][row] += -alpha * qrtMinor[row];
                        }
                    }}
                }}
            }}
            }__CLR4_4_1lzmlzmlb90p90g.R.inc(28601);cachedQT = MatrixUtils.createRealMatrix(qta);
        }

        // return the cached matrix
        }__CLR4_4_1lzmlzmlb90p90g.R.inc(28602);return cachedQT;
    }finally{__CLR4_4_1lzmlzmlb90p90g.R.flushNeeded();}}

    /**
     * Returns the Householder reflector vectors.
     * <p>H is a lower trapezoidal matrix whose columns represent
     * each successive Householder reflector vector. This matrix is used
     * to compute Q.</p>
     * @return a matrix containing the Householder reflector vectors
     */
    public RealMatrix getH() {try{__CLR4_4_1lzmlzmlb90p90g.R.inc(28603);
        __CLR4_4_1lzmlzmlb90p90g.R.inc(28604);if ((((cachedH == null)&&(__CLR4_4_1lzmlzmlb90p90g.R.iget(28605)!=0|true))||(__CLR4_4_1lzmlzmlb90p90g.R.iget(28606)==0&false))) {{

            __CLR4_4_1lzmlzmlb90p90g.R.inc(28607);final int n = qrt.length;
            __CLR4_4_1lzmlzmlb90p90g.R.inc(28608);final int m = qrt[0].length;
            __CLR4_4_1lzmlzmlb90p90g.R.inc(28609);double[][] ha = new double[m][n];
            __CLR4_4_1lzmlzmlb90p90g.R.inc(28610);for (int i = 0; (((i < m)&&(__CLR4_4_1lzmlzmlb90p90g.R.iget(28611)!=0|true))||(__CLR4_4_1lzmlzmlb90p90g.R.iget(28612)==0&false)); ++i) {{
                __CLR4_4_1lzmlzmlb90p90g.R.inc(28613);for (int j = 0; (((j < FastMath.min(i + 1, n))&&(__CLR4_4_1lzmlzmlb90p90g.R.iget(28614)!=0|true))||(__CLR4_4_1lzmlzmlb90p90g.R.iget(28615)==0&false)); ++j) {{
                    __CLR4_4_1lzmlzmlb90p90g.R.inc(28616);ha[i][j] = qrt[j][i] / -rDiag[j];
                }
            }}
            }__CLR4_4_1lzmlzmlb90p90g.R.inc(28617);cachedH = MatrixUtils.createRealMatrix(ha);
        }

        // return the cached matrix
        }__CLR4_4_1lzmlzmlb90p90g.R.inc(28618);return cachedH;
    }finally{__CLR4_4_1lzmlzmlb90p90g.R.flushNeeded();}}

    /**
     * Get a solver for finding the A &times; X = B solution in least square sense.
     * @return a solver
     */
    public DecompositionSolver getSolver() {try{__CLR4_4_1lzmlzmlb90p90g.R.inc(28619);
        __CLR4_4_1lzmlzmlb90p90g.R.inc(28620);return new Solver(qrt, rDiag, threshold);
    }finally{__CLR4_4_1lzmlzmlb90p90g.R.flushNeeded();}}

    /** Specialized solver. */
    private static class Solver implements DecompositionSolver {
        /**
         * A packed TRANSPOSED representation of the QR decomposition.
         * <p>The elements BELOW the diagonal are the elements of the UPPER triangular
         * matrix R, and the rows ABOVE the diagonal are the Householder reflector vectors
         * from which an explicit form of Q can be recomputed if desired.</p>
         */
        private final double[][] qrt;
        /** The diagonal elements of R. */
        private final double[] rDiag;
        /** Singularity threshold. */
        private final double threshold;

        /**
         * Build a solver from decomposed matrix.
         *
         * @param qrt Packed TRANSPOSED representation of the QR decomposition.
         * @param rDiag Diagonal elements of R.
         * @param threshold Singularity threshold.
         */
        private Solver(final double[][] qrt,
                       final double[] rDiag,
                       final double threshold) {try{__CLR4_4_1lzmlzmlb90p90g.R.inc(28621);
            __CLR4_4_1lzmlzmlb90p90g.R.inc(28622);this.qrt   = qrt;
            __CLR4_4_1lzmlzmlb90p90g.R.inc(28623);this.rDiag = rDiag;
            __CLR4_4_1lzmlzmlb90p90g.R.inc(28624);this.threshold = threshold;
        }finally{__CLR4_4_1lzmlzmlb90p90g.R.flushNeeded();}}

        /** {@inheritDoc} */
        public boolean isNonSingular() {try{__CLR4_4_1lzmlzmlb90p90g.R.inc(28625);
            __CLR4_4_1lzmlzmlb90p90g.R.inc(28626);for (double diag : rDiag) {{
                __CLR4_4_1lzmlzmlb90p90g.R.inc(28627);if ((((FastMath.abs(diag) <= threshold)&&(__CLR4_4_1lzmlzmlb90p90g.R.iget(28628)!=0|true))||(__CLR4_4_1lzmlzmlb90p90g.R.iget(28629)==0&false))) {{
                    __CLR4_4_1lzmlzmlb90p90g.R.inc(28630);return false;
                }
            }}
            }__CLR4_4_1lzmlzmlb90p90g.R.inc(28631);return true;
        }finally{__CLR4_4_1lzmlzmlb90p90g.R.flushNeeded();}}

        /** {@inheritDoc} */
        public RealVector solve(RealVector b) {try{__CLR4_4_1lzmlzmlb90p90g.R.inc(28632);
            __CLR4_4_1lzmlzmlb90p90g.R.inc(28633);final int n = qrt.length;
            __CLR4_4_1lzmlzmlb90p90g.R.inc(28634);final int m = qrt[0].length;
            __CLR4_4_1lzmlzmlb90p90g.R.inc(28635);if ((((b.getDimension() != m)&&(__CLR4_4_1lzmlzmlb90p90g.R.iget(28636)!=0|true))||(__CLR4_4_1lzmlzmlb90p90g.R.iget(28637)==0&false))) {{
                __CLR4_4_1lzmlzmlb90p90g.R.inc(28638);throw new DimensionMismatchException(b.getDimension(), m);
            }
            }__CLR4_4_1lzmlzmlb90p90g.R.inc(28639);if ((((!isNonSingular())&&(__CLR4_4_1lzmlzmlb90p90g.R.iget(28640)!=0|true))||(__CLR4_4_1lzmlzmlb90p90g.R.iget(28641)==0&false))) {{
                __CLR4_4_1lzmlzmlb90p90g.R.inc(28642);throw new SingularMatrixException();
            }

            }__CLR4_4_1lzmlzmlb90p90g.R.inc(28643);final double[] x = new double[n];
            __CLR4_4_1lzmlzmlb90p90g.R.inc(28644);final double[] y = b.toArray();

            // apply Householder transforms to solve Q.y = b
            __CLR4_4_1lzmlzmlb90p90g.R.inc(28645);for (int minor = 0; (((minor < FastMath.min(m, n))&&(__CLR4_4_1lzmlzmlb90p90g.R.iget(28646)!=0|true))||(__CLR4_4_1lzmlzmlb90p90g.R.iget(28647)==0&false)); minor++) {{

                __CLR4_4_1lzmlzmlb90p90g.R.inc(28648);final double[] qrtMinor = qrt[minor];
                __CLR4_4_1lzmlzmlb90p90g.R.inc(28649);double dotProduct = 0;
                __CLR4_4_1lzmlzmlb90p90g.R.inc(28650);for (int row = minor; (((row < m)&&(__CLR4_4_1lzmlzmlb90p90g.R.iget(28651)!=0|true))||(__CLR4_4_1lzmlzmlb90p90g.R.iget(28652)==0&false)); row++) {{
                    __CLR4_4_1lzmlzmlb90p90g.R.inc(28653);dotProduct += y[row] * qrtMinor[row];
                }
                }__CLR4_4_1lzmlzmlb90p90g.R.inc(28654);dotProduct /= rDiag[minor] * qrtMinor[minor];

                __CLR4_4_1lzmlzmlb90p90g.R.inc(28655);for (int row = minor; (((row < m)&&(__CLR4_4_1lzmlzmlb90p90g.R.iget(28656)!=0|true))||(__CLR4_4_1lzmlzmlb90p90g.R.iget(28657)==0&false)); row++) {{
                    __CLR4_4_1lzmlzmlb90p90g.R.inc(28658);y[row] += dotProduct * qrtMinor[row];
                }
            }}

            // solve triangular system R.x = y
            }__CLR4_4_1lzmlzmlb90p90g.R.inc(28659);for (int row = rDiag.length - 1; (((row >= 0)&&(__CLR4_4_1lzmlzmlb90p90g.R.iget(28660)!=0|true))||(__CLR4_4_1lzmlzmlb90p90g.R.iget(28661)==0&false)); --row) {{
                __CLR4_4_1lzmlzmlb90p90g.R.inc(28662);y[row] /= rDiag[row];
                __CLR4_4_1lzmlzmlb90p90g.R.inc(28663);final double yRow = y[row];
                __CLR4_4_1lzmlzmlb90p90g.R.inc(28664);final double[] qrtRow = qrt[row];
                __CLR4_4_1lzmlzmlb90p90g.R.inc(28665);x[row] = yRow;
                __CLR4_4_1lzmlzmlb90p90g.R.inc(28666);for (int i = 0; (((i < row)&&(__CLR4_4_1lzmlzmlb90p90g.R.iget(28667)!=0|true))||(__CLR4_4_1lzmlzmlb90p90g.R.iget(28668)==0&false)); i++) {{
                    __CLR4_4_1lzmlzmlb90p90g.R.inc(28669);y[i] -= yRow * qrtRow[i];
                }
            }}

            }__CLR4_4_1lzmlzmlb90p90g.R.inc(28670);return new ArrayRealVector(x, false);
        }finally{__CLR4_4_1lzmlzmlb90p90g.R.flushNeeded();}}

        /** {@inheritDoc} */
        public RealMatrix solve(RealMatrix b) {try{__CLR4_4_1lzmlzmlb90p90g.R.inc(28671);
            __CLR4_4_1lzmlzmlb90p90g.R.inc(28672);final int n = qrt.length;
            __CLR4_4_1lzmlzmlb90p90g.R.inc(28673);final int m = qrt[0].length;
            __CLR4_4_1lzmlzmlb90p90g.R.inc(28674);if ((((b.getRowDimension() != m)&&(__CLR4_4_1lzmlzmlb90p90g.R.iget(28675)!=0|true))||(__CLR4_4_1lzmlzmlb90p90g.R.iget(28676)==0&false))) {{
                __CLR4_4_1lzmlzmlb90p90g.R.inc(28677);throw new DimensionMismatchException(b.getRowDimension(), m);
            }
            }__CLR4_4_1lzmlzmlb90p90g.R.inc(28678);if ((((!isNonSingular())&&(__CLR4_4_1lzmlzmlb90p90g.R.iget(28679)!=0|true))||(__CLR4_4_1lzmlzmlb90p90g.R.iget(28680)==0&false))) {{
                __CLR4_4_1lzmlzmlb90p90g.R.inc(28681);throw new SingularMatrixException();
            }

            }__CLR4_4_1lzmlzmlb90p90g.R.inc(28682);final int columns        = b.getColumnDimension();
            __CLR4_4_1lzmlzmlb90p90g.R.inc(28683);final int blockSize      = BlockRealMatrix.BLOCK_SIZE;
            __CLR4_4_1lzmlzmlb90p90g.R.inc(28684);final int cBlocks        = (columns + blockSize - 1) / blockSize;
            __CLR4_4_1lzmlzmlb90p90g.R.inc(28685);final double[][] xBlocks = BlockRealMatrix.createBlocksLayout(n, columns);
            __CLR4_4_1lzmlzmlb90p90g.R.inc(28686);final double[][] y       = new double[b.getRowDimension()][blockSize];
            __CLR4_4_1lzmlzmlb90p90g.R.inc(28687);final double[]   alpha   = new double[blockSize];

            __CLR4_4_1lzmlzmlb90p90g.R.inc(28688);for (int kBlock = 0; (((kBlock < cBlocks)&&(__CLR4_4_1lzmlzmlb90p90g.R.iget(28689)!=0|true))||(__CLR4_4_1lzmlzmlb90p90g.R.iget(28690)==0&false)); ++kBlock) {{
                __CLR4_4_1lzmlzmlb90p90g.R.inc(28691);final int kStart = kBlock * blockSize;
                __CLR4_4_1lzmlzmlb90p90g.R.inc(28692);final int kEnd   = FastMath.min(kStart + blockSize, columns);
                __CLR4_4_1lzmlzmlb90p90g.R.inc(28693);final int kWidth = kEnd - kStart;

                // get the right hand side vector
                __CLR4_4_1lzmlzmlb90p90g.R.inc(28694);b.copySubMatrix(0, m - 1, kStart, kEnd - 1, y);

                // apply Householder transforms to solve Q.y = b
                __CLR4_4_1lzmlzmlb90p90g.R.inc(28695);for (int minor = 0; (((minor < FastMath.min(m, n))&&(__CLR4_4_1lzmlzmlb90p90g.R.iget(28696)!=0|true))||(__CLR4_4_1lzmlzmlb90p90g.R.iget(28697)==0&false)); minor++) {{
                    __CLR4_4_1lzmlzmlb90p90g.R.inc(28698);final double[] qrtMinor = qrt[minor];
                    __CLR4_4_1lzmlzmlb90p90g.R.inc(28699);final double factor     = 1.0 / (rDiag[minor] * qrtMinor[minor]);

                    __CLR4_4_1lzmlzmlb90p90g.R.inc(28700);Arrays.fill(alpha, 0, kWidth, 0.0);
                    __CLR4_4_1lzmlzmlb90p90g.R.inc(28701);for (int row = minor; (((row < m)&&(__CLR4_4_1lzmlzmlb90p90g.R.iget(28702)!=0|true))||(__CLR4_4_1lzmlzmlb90p90g.R.iget(28703)==0&false)); ++row) {{
                        __CLR4_4_1lzmlzmlb90p90g.R.inc(28704);final double   d    = qrtMinor[row];
                        __CLR4_4_1lzmlzmlb90p90g.R.inc(28705);final double[] yRow = y[row];
                        __CLR4_4_1lzmlzmlb90p90g.R.inc(28706);for (int k = 0; (((k < kWidth)&&(__CLR4_4_1lzmlzmlb90p90g.R.iget(28707)!=0|true))||(__CLR4_4_1lzmlzmlb90p90g.R.iget(28708)==0&false)); ++k) {{
                            __CLR4_4_1lzmlzmlb90p90g.R.inc(28709);alpha[k] += d * yRow[k];
                        }
                    }}
                    }__CLR4_4_1lzmlzmlb90p90g.R.inc(28710);for (int k = 0; (((k < kWidth)&&(__CLR4_4_1lzmlzmlb90p90g.R.iget(28711)!=0|true))||(__CLR4_4_1lzmlzmlb90p90g.R.iget(28712)==0&false)); ++k) {{
                        __CLR4_4_1lzmlzmlb90p90g.R.inc(28713);alpha[k] *= factor;
                    }

                    }__CLR4_4_1lzmlzmlb90p90g.R.inc(28714);for (int row = minor; (((row < m)&&(__CLR4_4_1lzmlzmlb90p90g.R.iget(28715)!=0|true))||(__CLR4_4_1lzmlzmlb90p90g.R.iget(28716)==0&false)); ++row) {{
                        __CLR4_4_1lzmlzmlb90p90g.R.inc(28717);final double   d    = qrtMinor[row];
                        __CLR4_4_1lzmlzmlb90p90g.R.inc(28718);final double[] yRow = y[row];
                        __CLR4_4_1lzmlzmlb90p90g.R.inc(28719);for (int k = 0; (((k < kWidth)&&(__CLR4_4_1lzmlzmlb90p90g.R.iget(28720)!=0|true))||(__CLR4_4_1lzmlzmlb90p90g.R.iget(28721)==0&false)); ++k) {{
                            __CLR4_4_1lzmlzmlb90p90g.R.inc(28722);yRow[k] += alpha[k] * d;
                        }
                    }}
                }}

                // solve triangular system R.x = y
                }__CLR4_4_1lzmlzmlb90p90g.R.inc(28723);for (int j = rDiag.length - 1; (((j >= 0)&&(__CLR4_4_1lzmlzmlb90p90g.R.iget(28724)!=0|true))||(__CLR4_4_1lzmlzmlb90p90g.R.iget(28725)==0&false)); --j) {{
                    __CLR4_4_1lzmlzmlb90p90g.R.inc(28726);final int      jBlock = j / blockSize;
                    __CLR4_4_1lzmlzmlb90p90g.R.inc(28727);final int      jStart = jBlock * blockSize;
                    __CLR4_4_1lzmlzmlb90p90g.R.inc(28728);final double   factor = 1.0 / rDiag[j];
                    __CLR4_4_1lzmlzmlb90p90g.R.inc(28729);final double[] yJ     = y[j];
                    __CLR4_4_1lzmlzmlb90p90g.R.inc(28730);final double[] xBlock = xBlocks[jBlock * cBlocks + kBlock];
                    __CLR4_4_1lzmlzmlb90p90g.R.inc(28731);int index = (j - jStart) * kWidth;
                    __CLR4_4_1lzmlzmlb90p90g.R.inc(28732);for (int k = 0; (((k < kWidth)&&(__CLR4_4_1lzmlzmlb90p90g.R.iget(28733)!=0|true))||(__CLR4_4_1lzmlzmlb90p90g.R.iget(28734)==0&false)); ++k) {{
                        __CLR4_4_1lzmlzmlb90p90g.R.inc(28735);yJ[k]          *= factor;
                        __CLR4_4_1lzmlzmlb90p90g.R.inc(28736);xBlock[index++] = yJ[k];
                    }

                    }__CLR4_4_1lzmlzmlb90p90g.R.inc(28737);final double[] qrtJ = qrt[j];
                    __CLR4_4_1lzmlzmlb90p90g.R.inc(28738);for (int i = 0; (((i < j)&&(__CLR4_4_1lzmlzmlb90p90g.R.iget(28739)!=0|true))||(__CLR4_4_1lzmlzmlb90p90g.R.iget(28740)==0&false)); ++i) {{
                        __CLR4_4_1lzmlzmlb90p90g.R.inc(28741);final double rIJ  = qrtJ[i];
                        __CLR4_4_1lzmlzmlb90p90g.R.inc(28742);final double[] yI = y[i];
                        __CLR4_4_1lzmlzmlb90p90g.R.inc(28743);for (int k = 0; (((k < kWidth)&&(__CLR4_4_1lzmlzmlb90p90g.R.iget(28744)!=0|true))||(__CLR4_4_1lzmlzmlb90p90g.R.iget(28745)==0&false)); ++k) {{
                            __CLR4_4_1lzmlzmlb90p90g.R.inc(28746);yI[k] -= yJ[k] * rIJ;
                        }
                    }}
                }}
            }}

            }__CLR4_4_1lzmlzmlb90p90g.R.inc(28747);return new BlockRealMatrix(n, columns, xBlocks, false);
        }finally{__CLR4_4_1lzmlzmlb90p90g.R.flushNeeded();}}

        /** {@inheritDoc} */
        public RealMatrix getInverse() {try{__CLR4_4_1lzmlzmlb90p90g.R.inc(28748);
            __CLR4_4_1lzmlzmlb90p90g.R.inc(28749);return solve(MatrixUtils.createRealIdentityMatrix(rDiag.length));
        }finally{__CLR4_4_1lzmlzmlb90p90g.R.flushNeeded();}}
    }
}
