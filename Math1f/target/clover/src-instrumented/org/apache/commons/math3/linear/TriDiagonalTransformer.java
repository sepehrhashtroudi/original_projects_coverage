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

import org.apache.commons.math3.util.FastMath;


/**
 * Class transforming a symmetrical matrix to tridiagonal shape.
 * <p>A symmetrical m &times; m matrix A can be written as the product of three matrices:
 * A = Q &times; T &times; Q<sup>T</sup> with Q an orthogonal matrix and T a symmetrical
 * tridiagonal matrix. Both Q and T are m &times; m matrices.</p>
 * <p>This implementation only uses the upper part of the matrix, the part below the
 * diagonal is not accessed at all.</p>
 * <p>Transformation to tridiagonal shape is often not a goal by itself, but it is
 * an intermediate step in more general decomposition algorithms like {@link
 * EigenDecomposition eigen decomposition}. This class is therefore intended for internal
 * use by the library and is not public. As a consequence of this explicitly limited scope,
 * many methods directly returns references to internal arrays, not copies.</p>
 * @version $Id$
 * @since 2.0
 */
class TriDiagonalTransformer {public static class __CLR4_4_1o0jo0jlb90p971{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,31262,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Householder vectors. */
    private final double householderVectors[][];
    /** Main diagonal. */
    private final double[] main;
    /** Secondary diagonal. */
    private final double[] secondary;
    /** Cached value of Q. */
    private RealMatrix cachedQ;
    /** Cached value of Qt. */
    private RealMatrix cachedQt;
    /** Cached value of T. */
    private RealMatrix cachedT;

    /**
     * Build the transformation to tridiagonal shape of a symmetrical matrix.
     * <p>The specified matrix is assumed to be symmetrical without any check.
     * Only the upper triangular part of the matrix is used.</p>
     *
     * @param matrix Symmetrical matrix to transform.
     * @throws NonSquareMatrixException if the matrix is not square.
     */
    public TriDiagonalTransformer(RealMatrix matrix) {try{__CLR4_4_1o0jo0jlb90p971.R.inc(31123);
        __CLR4_4_1o0jo0jlb90p971.R.inc(31124);if ((((!matrix.isSquare())&&(__CLR4_4_1o0jo0jlb90p971.R.iget(31125)!=0|true))||(__CLR4_4_1o0jo0jlb90p971.R.iget(31126)==0&false))) {{
            __CLR4_4_1o0jo0jlb90p971.R.inc(31127);throw new NonSquareMatrixException(matrix.getRowDimension(),
                                               matrix.getColumnDimension());
        }

        }__CLR4_4_1o0jo0jlb90p971.R.inc(31128);final int m = matrix.getRowDimension();
        __CLR4_4_1o0jo0jlb90p971.R.inc(31129);householderVectors = matrix.getData();
        __CLR4_4_1o0jo0jlb90p971.R.inc(31130);main      = new double[m];
        __CLR4_4_1o0jo0jlb90p971.R.inc(31131);secondary = new double[m - 1];
        __CLR4_4_1o0jo0jlb90p971.R.inc(31132);cachedQ   = null;
        __CLR4_4_1o0jo0jlb90p971.R.inc(31133);cachedQt  = null;
        __CLR4_4_1o0jo0jlb90p971.R.inc(31134);cachedT   = null;

        // transform matrix
        __CLR4_4_1o0jo0jlb90p971.R.inc(31135);transform();
    }finally{__CLR4_4_1o0jo0jlb90p971.R.flushNeeded();}}

    /**
     * Returns the matrix Q of the transform.
     * <p>Q is an orthogonal matrix, i.e. its transpose is also its inverse.</p>
     * @return the Q matrix
     */
    public RealMatrix getQ() {try{__CLR4_4_1o0jo0jlb90p971.R.inc(31136);
        __CLR4_4_1o0jo0jlb90p971.R.inc(31137);if ((((cachedQ == null)&&(__CLR4_4_1o0jo0jlb90p971.R.iget(31138)!=0|true))||(__CLR4_4_1o0jo0jlb90p971.R.iget(31139)==0&false))) {{
            __CLR4_4_1o0jo0jlb90p971.R.inc(31140);cachedQ = getQT().transpose();
        }
        }__CLR4_4_1o0jo0jlb90p971.R.inc(31141);return cachedQ;
    }finally{__CLR4_4_1o0jo0jlb90p971.R.flushNeeded();}}

    /**
     * Returns the transpose of the matrix Q of the transform.
     * <p>Q is an orthogonal matrix, i.e. its transpose is also its inverse.</p>
     * @return the Q matrix
     */
    public RealMatrix getQT() {try{__CLR4_4_1o0jo0jlb90p971.R.inc(31142);
        __CLR4_4_1o0jo0jlb90p971.R.inc(31143);if ((((cachedQt == null)&&(__CLR4_4_1o0jo0jlb90p971.R.iget(31144)!=0|true))||(__CLR4_4_1o0jo0jlb90p971.R.iget(31145)==0&false))) {{
            __CLR4_4_1o0jo0jlb90p971.R.inc(31146);final int m = householderVectors.length;
            __CLR4_4_1o0jo0jlb90p971.R.inc(31147);double[][] qta = new double[m][m];

            // build up first part of the matrix by applying Householder transforms
            __CLR4_4_1o0jo0jlb90p971.R.inc(31148);for (int k = m - 1; (((k >= 1)&&(__CLR4_4_1o0jo0jlb90p971.R.iget(31149)!=0|true))||(__CLR4_4_1o0jo0jlb90p971.R.iget(31150)==0&false)); --k) {{
                __CLR4_4_1o0jo0jlb90p971.R.inc(31151);final double[] hK = householderVectors[k - 1];
                __CLR4_4_1o0jo0jlb90p971.R.inc(31152);qta[k][k] = 1;
                __CLR4_4_1o0jo0jlb90p971.R.inc(31153);if ((((hK[k] != 0.0)&&(__CLR4_4_1o0jo0jlb90p971.R.iget(31154)!=0|true))||(__CLR4_4_1o0jo0jlb90p971.R.iget(31155)==0&false))) {{
                    __CLR4_4_1o0jo0jlb90p971.R.inc(31156);final double inv = 1.0 / (secondary[k - 1] * hK[k]);
                    __CLR4_4_1o0jo0jlb90p971.R.inc(31157);double beta = 1.0 / secondary[k - 1];
                    __CLR4_4_1o0jo0jlb90p971.R.inc(31158);qta[k][k] = 1 + beta * hK[k];
                    __CLR4_4_1o0jo0jlb90p971.R.inc(31159);for (int i = k + 1; (((i < m)&&(__CLR4_4_1o0jo0jlb90p971.R.iget(31160)!=0|true))||(__CLR4_4_1o0jo0jlb90p971.R.iget(31161)==0&false)); ++i) {{
                        __CLR4_4_1o0jo0jlb90p971.R.inc(31162);qta[k][i] = beta * hK[i];
                    }
                    }__CLR4_4_1o0jo0jlb90p971.R.inc(31163);for (int j = k + 1; (((j < m)&&(__CLR4_4_1o0jo0jlb90p971.R.iget(31164)!=0|true))||(__CLR4_4_1o0jo0jlb90p971.R.iget(31165)==0&false)); ++j) {{
                        __CLR4_4_1o0jo0jlb90p971.R.inc(31166);beta = 0;
                        __CLR4_4_1o0jo0jlb90p971.R.inc(31167);for (int i = k + 1; (((i < m)&&(__CLR4_4_1o0jo0jlb90p971.R.iget(31168)!=0|true))||(__CLR4_4_1o0jo0jlb90p971.R.iget(31169)==0&false)); ++i) {{
                            __CLR4_4_1o0jo0jlb90p971.R.inc(31170);beta += qta[j][i] * hK[i];
                        }
                        }__CLR4_4_1o0jo0jlb90p971.R.inc(31171);beta *= inv;
                        __CLR4_4_1o0jo0jlb90p971.R.inc(31172);qta[j][k] = beta * hK[k];
                        __CLR4_4_1o0jo0jlb90p971.R.inc(31173);for (int i = k + 1; (((i < m)&&(__CLR4_4_1o0jo0jlb90p971.R.iget(31174)!=0|true))||(__CLR4_4_1o0jo0jlb90p971.R.iget(31175)==0&false)); ++i) {{
                            __CLR4_4_1o0jo0jlb90p971.R.inc(31176);qta[j][i] += beta * hK[i];
                        }
                    }}
                }}
            }}
            }__CLR4_4_1o0jo0jlb90p971.R.inc(31177);qta[0][0] = 1;
            __CLR4_4_1o0jo0jlb90p971.R.inc(31178);cachedQt = MatrixUtils.createRealMatrix(qta);
        }

        // return the cached matrix
        }__CLR4_4_1o0jo0jlb90p971.R.inc(31179);return cachedQt;
    }finally{__CLR4_4_1o0jo0jlb90p971.R.flushNeeded();}}

    /**
     * Returns the tridiagonal matrix T of the transform.
     * @return the T matrix
     */
    public RealMatrix getT() {try{__CLR4_4_1o0jo0jlb90p971.R.inc(31180);
        __CLR4_4_1o0jo0jlb90p971.R.inc(31181);if ((((cachedT == null)&&(__CLR4_4_1o0jo0jlb90p971.R.iget(31182)!=0|true))||(__CLR4_4_1o0jo0jlb90p971.R.iget(31183)==0&false))) {{
            __CLR4_4_1o0jo0jlb90p971.R.inc(31184);final int m = main.length;
            __CLR4_4_1o0jo0jlb90p971.R.inc(31185);double[][] ta = new double[m][m];
            __CLR4_4_1o0jo0jlb90p971.R.inc(31186);for (int i = 0; (((i < m)&&(__CLR4_4_1o0jo0jlb90p971.R.iget(31187)!=0|true))||(__CLR4_4_1o0jo0jlb90p971.R.iget(31188)==0&false)); ++i) {{
                __CLR4_4_1o0jo0jlb90p971.R.inc(31189);ta[i][i] = main[i];
                __CLR4_4_1o0jo0jlb90p971.R.inc(31190);if ((((i > 0)&&(__CLR4_4_1o0jo0jlb90p971.R.iget(31191)!=0|true))||(__CLR4_4_1o0jo0jlb90p971.R.iget(31192)==0&false))) {{
                    __CLR4_4_1o0jo0jlb90p971.R.inc(31193);ta[i][i - 1] = secondary[i - 1];
                }
                }__CLR4_4_1o0jo0jlb90p971.R.inc(31194);if ((((i < main.length - 1)&&(__CLR4_4_1o0jo0jlb90p971.R.iget(31195)!=0|true))||(__CLR4_4_1o0jo0jlb90p971.R.iget(31196)==0&false))) {{
                    __CLR4_4_1o0jo0jlb90p971.R.inc(31197);ta[i][i + 1] = secondary[i];
                }
            }}
            }__CLR4_4_1o0jo0jlb90p971.R.inc(31198);cachedT = MatrixUtils.createRealMatrix(ta);
        }

        // return the cached matrix
        }__CLR4_4_1o0jo0jlb90p971.R.inc(31199);return cachedT;
    }finally{__CLR4_4_1o0jo0jlb90p971.R.flushNeeded();}}

    /**
     * Get the Householder vectors of the transform.
     * <p>Note that since this class is only intended for internal use,
     * it returns directly a reference to its internal arrays, not a copy.</p>
     * @return the main diagonal elements of the B matrix
     */
    double[][] getHouseholderVectorsRef() {try{__CLR4_4_1o0jo0jlb90p971.R.inc(31200);
        __CLR4_4_1o0jo0jlb90p971.R.inc(31201);return householderVectors;
    }finally{__CLR4_4_1o0jo0jlb90p971.R.flushNeeded();}}

    /**
     * Get the main diagonal elements of the matrix T of the transform.
     * <p>Note that since this class is only intended for internal use,
     * it returns directly a reference to its internal arrays, not a copy.</p>
     * @return the main diagonal elements of the T matrix
     */
    double[] getMainDiagonalRef() {try{__CLR4_4_1o0jo0jlb90p971.R.inc(31202);
        __CLR4_4_1o0jo0jlb90p971.R.inc(31203);return main;
    }finally{__CLR4_4_1o0jo0jlb90p971.R.flushNeeded();}}

    /**
     * Get the secondary diagonal elements of the matrix T of the transform.
     * <p>Note that since this class is only intended for internal use,
     * it returns directly a reference to its internal arrays, not a copy.</p>
     * @return the secondary diagonal elements of the T matrix
     */
    double[] getSecondaryDiagonalRef() {try{__CLR4_4_1o0jo0jlb90p971.R.inc(31204);
        __CLR4_4_1o0jo0jlb90p971.R.inc(31205);return secondary;
    }finally{__CLR4_4_1o0jo0jlb90p971.R.flushNeeded();}}

    /**
     * Transform original matrix to tridiagonal form.
     * <p>Transformation is done using Householder transforms.</p>
     */
    private void transform() {try{__CLR4_4_1o0jo0jlb90p971.R.inc(31206);
        __CLR4_4_1o0jo0jlb90p971.R.inc(31207);final int m = householderVectors.length;
        __CLR4_4_1o0jo0jlb90p971.R.inc(31208);final double[] z = new double[m];
        __CLR4_4_1o0jo0jlb90p971.R.inc(31209);for (int k = 0; (((k < m - 1)&&(__CLR4_4_1o0jo0jlb90p971.R.iget(31210)!=0|true))||(__CLR4_4_1o0jo0jlb90p971.R.iget(31211)==0&false)); k++) {{

            //zero-out a row and a column simultaneously
            __CLR4_4_1o0jo0jlb90p971.R.inc(31212);final double[] hK = householderVectors[k];
            __CLR4_4_1o0jo0jlb90p971.R.inc(31213);main[k] = hK[k];
            __CLR4_4_1o0jo0jlb90p971.R.inc(31214);double xNormSqr = 0;
            __CLR4_4_1o0jo0jlb90p971.R.inc(31215);for (int j = k + 1; (((j < m)&&(__CLR4_4_1o0jo0jlb90p971.R.iget(31216)!=0|true))||(__CLR4_4_1o0jo0jlb90p971.R.iget(31217)==0&false)); ++j) {{
                __CLR4_4_1o0jo0jlb90p971.R.inc(31218);final double c = hK[j];
                __CLR4_4_1o0jo0jlb90p971.R.inc(31219);xNormSqr += c * c;
            }
            }__CLR4_4_1o0jo0jlb90p971.R.inc(31220);final double a = ((((hK[k + 1] > 0) )&&(__CLR4_4_1o0jo0jlb90p971.R.iget(31221)!=0|true))||(__CLR4_4_1o0jo0jlb90p971.R.iget(31222)==0&false))? -FastMath.sqrt(xNormSqr) : FastMath.sqrt(xNormSqr);
            __CLR4_4_1o0jo0jlb90p971.R.inc(31223);secondary[k] = a;
            __CLR4_4_1o0jo0jlb90p971.R.inc(31224);if ((((a != 0.0)&&(__CLR4_4_1o0jo0jlb90p971.R.iget(31225)!=0|true))||(__CLR4_4_1o0jo0jlb90p971.R.iget(31226)==0&false))) {{
                // apply Householder transform from left and right simultaneously

                __CLR4_4_1o0jo0jlb90p971.R.inc(31227);hK[k + 1] -= a;
                __CLR4_4_1o0jo0jlb90p971.R.inc(31228);final double beta = -1 / (a * hK[k + 1]);

                // compute a = beta A v, where v is the Householder vector
                // this loop is written in such a way
                //   1) only the upper triangular part of the matrix is accessed
                //   2) access is cache-friendly for a matrix stored in rows
                __CLR4_4_1o0jo0jlb90p971.R.inc(31229);Arrays.fill(z, k + 1, m, 0);
                __CLR4_4_1o0jo0jlb90p971.R.inc(31230);for (int i = k + 1; (((i < m)&&(__CLR4_4_1o0jo0jlb90p971.R.iget(31231)!=0|true))||(__CLR4_4_1o0jo0jlb90p971.R.iget(31232)==0&false)); ++i) {{
                    __CLR4_4_1o0jo0jlb90p971.R.inc(31233);final double[] hI = householderVectors[i];
                    __CLR4_4_1o0jo0jlb90p971.R.inc(31234);final double hKI = hK[i];
                    __CLR4_4_1o0jo0jlb90p971.R.inc(31235);double zI = hI[i] * hKI;
                    __CLR4_4_1o0jo0jlb90p971.R.inc(31236);for (int j = i + 1; (((j < m)&&(__CLR4_4_1o0jo0jlb90p971.R.iget(31237)!=0|true))||(__CLR4_4_1o0jo0jlb90p971.R.iget(31238)==0&false)); ++j) {{
                        __CLR4_4_1o0jo0jlb90p971.R.inc(31239);final double hIJ = hI[j];
                        __CLR4_4_1o0jo0jlb90p971.R.inc(31240);zI   += hIJ * hK[j];
                        __CLR4_4_1o0jo0jlb90p971.R.inc(31241);z[j] += hIJ * hKI;
                    }
                    }__CLR4_4_1o0jo0jlb90p971.R.inc(31242);z[i] = beta * (z[i] + zI);
                }

                // compute gamma = beta vT z / 2
                }__CLR4_4_1o0jo0jlb90p971.R.inc(31243);double gamma = 0;
                __CLR4_4_1o0jo0jlb90p971.R.inc(31244);for (int i = k + 1; (((i < m)&&(__CLR4_4_1o0jo0jlb90p971.R.iget(31245)!=0|true))||(__CLR4_4_1o0jo0jlb90p971.R.iget(31246)==0&false)); ++i) {{
                    __CLR4_4_1o0jo0jlb90p971.R.inc(31247);gamma += z[i] * hK[i];
                }
                }__CLR4_4_1o0jo0jlb90p971.R.inc(31248);gamma *= beta / 2;

                // compute z = z - gamma v
                __CLR4_4_1o0jo0jlb90p971.R.inc(31249);for (int i = k + 1; (((i < m)&&(__CLR4_4_1o0jo0jlb90p971.R.iget(31250)!=0|true))||(__CLR4_4_1o0jo0jlb90p971.R.iget(31251)==0&false)); ++i) {{
                    __CLR4_4_1o0jo0jlb90p971.R.inc(31252);z[i] -= gamma * hK[i];
                }

                // update matrix: A = A - v zT - z vT
                // only the upper triangular part of the matrix is updated
                }__CLR4_4_1o0jo0jlb90p971.R.inc(31253);for (int i = k + 1; (((i < m)&&(__CLR4_4_1o0jo0jlb90p971.R.iget(31254)!=0|true))||(__CLR4_4_1o0jo0jlb90p971.R.iget(31255)==0&false)); ++i) {{
                    __CLR4_4_1o0jo0jlb90p971.R.inc(31256);final double[] hI = householderVectors[i];
                    __CLR4_4_1o0jo0jlb90p971.R.inc(31257);for (int j = i; (((j < m)&&(__CLR4_4_1o0jo0jlb90p971.R.iget(31258)!=0|true))||(__CLR4_4_1o0jo0jlb90p971.R.iget(31259)==0&false)); ++j) {{
                        __CLR4_4_1o0jo0jlb90p971.R.inc(31260);hI[j] -= hK[i] * z[j] + z[i] * hK[j];
                    }
                }}
            }}
        }}
        }__CLR4_4_1o0jo0jlb90p971.R.inc(31261);main[m - 1] = householderVectors[m - 1][m - 1];
    }finally{__CLR4_4_1o0jo0jlb90p971.R.flushNeeded();}}
}
