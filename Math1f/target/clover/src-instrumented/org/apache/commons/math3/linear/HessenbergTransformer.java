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
import org.apache.commons.math3.util.Precision;

/**
 * Class transforming a general real matrix to Hessenberg form.
 * <p>A m &times; m matrix A can be written as the product of three matrices: A = P
 * &times; H &times; P<sup>T</sup> with P an orthogonal matrix and H a Hessenberg
 * matrix. Both P and H are m &times; m matrices.</p>
 * <p>Transformation to Hessenberg form is often not a goal by itself, but it is an
 * intermediate step in more general decomposition algorithms like
 * {@link EigenDecomposition eigen decomposition}. This class is therefore
 * intended for internal use by the library and is not public. As a consequence
 * of this explicitly limited scope, many methods directly returns references to
 * internal arrays, not copies.</p>
 * <p>This class is based on the method orthes in class EigenvalueDecomposition
 * from the <a href="http://math.nist.gov/javanumerics/jama/">JAMA</a> library.</p>
 *
 * @see <a href="http://mathworld.wolfram.com/HessenbergDecomposition.html">MathWorld</a>
 * @see <a href="http://en.wikipedia.org/wiki/Householder_transformation">Householder Transformations</a>
 * @version $Id$
 * @since 3.1
 */
class HessenbergTransformer {public static class __CLR4_4_1ktjktjlb90p8wq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,27116,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Householder vectors. */
    private final double householderVectors[][];
    /** Temporary storage vector. */
    private final double ort[];
    /** Cached value of P. */
    private RealMatrix cachedP;
    /** Cached value of Pt. */
    private RealMatrix cachedPt;
    /** Cached value of H. */
    private RealMatrix cachedH;

    /**
     * Build the transformation to Hessenberg form of a general matrix.
     *
     * @param matrix matrix to transform
     * @throws NonSquareMatrixException if the matrix is not square
     */
    public HessenbergTransformer(final RealMatrix matrix) {try{__CLR4_4_1ktjktjlb90p8wq.R.inc(26983);
        __CLR4_4_1ktjktjlb90p8wq.R.inc(26984);if ((((!matrix.isSquare())&&(__CLR4_4_1ktjktjlb90p8wq.R.iget(26985)!=0|true))||(__CLR4_4_1ktjktjlb90p8wq.R.iget(26986)==0&false))) {{
            __CLR4_4_1ktjktjlb90p8wq.R.inc(26987);throw new NonSquareMatrixException(matrix.getRowDimension(),
                    matrix.getColumnDimension());
        }

        }__CLR4_4_1ktjktjlb90p8wq.R.inc(26988);final int m = matrix.getRowDimension();
        __CLR4_4_1ktjktjlb90p8wq.R.inc(26989);householderVectors = matrix.getData();
        __CLR4_4_1ktjktjlb90p8wq.R.inc(26990);ort = new double[m];
        __CLR4_4_1ktjktjlb90p8wq.R.inc(26991);cachedP = null;
        __CLR4_4_1ktjktjlb90p8wq.R.inc(26992);cachedPt = null;
        __CLR4_4_1ktjktjlb90p8wq.R.inc(26993);cachedH = null;

        // transform matrix
        __CLR4_4_1ktjktjlb90p8wq.R.inc(26994);transform();
    }finally{__CLR4_4_1ktjktjlb90p8wq.R.flushNeeded();}}

    /**
     * Returns the matrix P of the transform.
     * <p>P is an orthogonal matrix, i.e. its inverse is also its transpose.</p>
     *
     * @return the P matrix
     */
    public RealMatrix getP() {try{__CLR4_4_1ktjktjlb90p8wq.R.inc(26995);
        __CLR4_4_1ktjktjlb90p8wq.R.inc(26996);if ((((cachedP == null)&&(__CLR4_4_1ktjktjlb90p8wq.R.iget(26997)!=0|true))||(__CLR4_4_1ktjktjlb90p8wq.R.iget(26998)==0&false))) {{
            __CLR4_4_1ktjktjlb90p8wq.R.inc(26999);final int n = householderVectors.length;
            __CLR4_4_1ktjktjlb90p8wq.R.inc(27000);final int high = n - 1;
            __CLR4_4_1ktjktjlb90p8wq.R.inc(27001);final double[][] pa = new double[n][n];

            __CLR4_4_1ktjktjlb90p8wq.R.inc(27002);for (int i = 0; (((i < n)&&(__CLR4_4_1ktjktjlb90p8wq.R.iget(27003)!=0|true))||(__CLR4_4_1ktjktjlb90p8wq.R.iget(27004)==0&false)); i++) {{
                __CLR4_4_1ktjktjlb90p8wq.R.inc(27005);for (int j = 0; (((j < n)&&(__CLR4_4_1ktjktjlb90p8wq.R.iget(27006)!=0|true))||(__CLR4_4_1ktjktjlb90p8wq.R.iget(27007)==0&false)); j++) {{
                    __CLR4_4_1ktjktjlb90p8wq.R.inc(27008);pa[i][j] = ((((i == j) )&&(__CLR4_4_1ktjktjlb90p8wq.R.iget(27009)!=0|true))||(__CLR4_4_1ktjktjlb90p8wq.R.iget(27010)==0&false))? 1 : 0;
                }
            }}

            }__CLR4_4_1ktjktjlb90p8wq.R.inc(27011);for (int m = high - 1; (((m >= 1)&&(__CLR4_4_1ktjktjlb90p8wq.R.iget(27012)!=0|true))||(__CLR4_4_1ktjktjlb90p8wq.R.iget(27013)==0&false)); m--) {{
                __CLR4_4_1ktjktjlb90p8wq.R.inc(27014);if ((((householderVectors[m][m - 1] != 0.0)&&(__CLR4_4_1ktjktjlb90p8wq.R.iget(27015)!=0|true))||(__CLR4_4_1ktjktjlb90p8wq.R.iget(27016)==0&false))) {{
                    __CLR4_4_1ktjktjlb90p8wq.R.inc(27017);for (int i = m + 1; (((i <= high)&&(__CLR4_4_1ktjktjlb90p8wq.R.iget(27018)!=0|true))||(__CLR4_4_1ktjktjlb90p8wq.R.iget(27019)==0&false)); i++) {{
                        __CLR4_4_1ktjktjlb90p8wq.R.inc(27020);ort[i] = householderVectors[i][m - 1];
                    }

                    }__CLR4_4_1ktjktjlb90p8wq.R.inc(27021);for (int j = m; (((j <= high)&&(__CLR4_4_1ktjktjlb90p8wq.R.iget(27022)!=0|true))||(__CLR4_4_1ktjktjlb90p8wq.R.iget(27023)==0&false)); j++) {{
                        __CLR4_4_1ktjktjlb90p8wq.R.inc(27024);double g = 0.0;

                        __CLR4_4_1ktjktjlb90p8wq.R.inc(27025);for (int i = m; (((i <= high)&&(__CLR4_4_1ktjktjlb90p8wq.R.iget(27026)!=0|true))||(__CLR4_4_1ktjktjlb90p8wq.R.iget(27027)==0&false)); i++) {{
                            __CLR4_4_1ktjktjlb90p8wq.R.inc(27028);g += ort[i] * pa[i][j];
                        }

                        // Double division avoids possible underflow
                        }__CLR4_4_1ktjktjlb90p8wq.R.inc(27029);g = (g / ort[m]) / householderVectors[m][m - 1];

                        __CLR4_4_1ktjktjlb90p8wq.R.inc(27030);for (int i = m; (((i <= high)&&(__CLR4_4_1ktjktjlb90p8wq.R.iget(27031)!=0|true))||(__CLR4_4_1ktjktjlb90p8wq.R.iget(27032)==0&false)); i++) {{
                            __CLR4_4_1ktjktjlb90p8wq.R.inc(27033);pa[i][j] += g * ort[i];
                        }
                    }}
                }}
            }}

            }__CLR4_4_1ktjktjlb90p8wq.R.inc(27034);cachedP = MatrixUtils.createRealMatrix(pa);
        }
        }__CLR4_4_1ktjktjlb90p8wq.R.inc(27035);return cachedP;
    }finally{__CLR4_4_1ktjktjlb90p8wq.R.flushNeeded();}}

    /**
     * Returns the transpose of the matrix P of the transform.
     * <p>P is an orthogonal matrix, i.e. its inverse is also its transpose.</p>
     *
     * @return the transpose of the P matrix
     */
    public RealMatrix getPT() {try{__CLR4_4_1ktjktjlb90p8wq.R.inc(27036);
        __CLR4_4_1ktjktjlb90p8wq.R.inc(27037);if ((((cachedPt == null)&&(__CLR4_4_1ktjktjlb90p8wq.R.iget(27038)!=0|true))||(__CLR4_4_1ktjktjlb90p8wq.R.iget(27039)==0&false))) {{
            __CLR4_4_1ktjktjlb90p8wq.R.inc(27040);cachedPt = getP().transpose();
        }

        // return the cached matrix
        }__CLR4_4_1ktjktjlb90p8wq.R.inc(27041);return cachedPt;
    }finally{__CLR4_4_1ktjktjlb90p8wq.R.flushNeeded();}}

    /**
     * Returns the Hessenberg matrix H of the transform.
     *
     * @return the H matrix
     */
    public RealMatrix getH() {try{__CLR4_4_1ktjktjlb90p8wq.R.inc(27042);
        __CLR4_4_1ktjktjlb90p8wq.R.inc(27043);if ((((cachedH == null)&&(__CLR4_4_1ktjktjlb90p8wq.R.iget(27044)!=0|true))||(__CLR4_4_1ktjktjlb90p8wq.R.iget(27045)==0&false))) {{
            __CLR4_4_1ktjktjlb90p8wq.R.inc(27046);final int m = householderVectors.length;
            __CLR4_4_1ktjktjlb90p8wq.R.inc(27047);final double[][] h = new double[m][m];
            __CLR4_4_1ktjktjlb90p8wq.R.inc(27048);for (int i = 0; (((i < m)&&(__CLR4_4_1ktjktjlb90p8wq.R.iget(27049)!=0|true))||(__CLR4_4_1ktjktjlb90p8wq.R.iget(27050)==0&false)); ++i) {{
                __CLR4_4_1ktjktjlb90p8wq.R.inc(27051);if ((((i > 0)&&(__CLR4_4_1ktjktjlb90p8wq.R.iget(27052)!=0|true))||(__CLR4_4_1ktjktjlb90p8wq.R.iget(27053)==0&false))) {{
                    // copy the entry of the lower sub-diagonal
                    __CLR4_4_1ktjktjlb90p8wq.R.inc(27054);h[i][i - 1] = householderVectors[i][i - 1];
                }

                // copy upper triangular part of the matrix
                }__CLR4_4_1ktjktjlb90p8wq.R.inc(27055);for (int j = i; (((j < m)&&(__CLR4_4_1ktjktjlb90p8wq.R.iget(27056)!=0|true))||(__CLR4_4_1ktjktjlb90p8wq.R.iget(27057)==0&false)); ++j) {{
                    __CLR4_4_1ktjktjlb90p8wq.R.inc(27058);h[i][j] = householderVectors[i][j];
                }
            }}
            }__CLR4_4_1ktjktjlb90p8wq.R.inc(27059);cachedH = MatrixUtils.createRealMatrix(h);
        }

        // return the cached matrix
        }__CLR4_4_1ktjktjlb90p8wq.R.inc(27060);return cachedH;
    }finally{__CLR4_4_1ktjktjlb90p8wq.R.flushNeeded();}}

    /**
     * Get the Householder vectors of the transform.
     * <p>Note that since this class is only intended for internal use, it returns
     * directly a reference to its internal arrays, not a copy.</p>
     *
     * @return the main diagonal elements of the B matrix
     */
    double[][] getHouseholderVectorsRef() {try{__CLR4_4_1ktjktjlb90p8wq.R.inc(27061);
        __CLR4_4_1ktjktjlb90p8wq.R.inc(27062);return householderVectors;
    }finally{__CLR4_4_1ktjktjlb90p8wq.R.flushNeeded();}}

    /**
     * Transform original matrix to Hessenberg form.
     * <p>Transformation is done using Householder transforms.</p>
     */
    private void transform() {try{__CLR4_4_1ktjktjlb90p8wq.R.inc(27063);
        __CLR4_4_1ktjktjlb90p8wq.R.inc(27064);final int n = householderVectors.length;
        __CLR4_4_1ktjktjlb90p8wq.R.inc(27065);final int high = n - 1;

        __CLR4_4_1ktjktjlb90p8wq.R.inc(27066);for (int m = 1; (((m <= high - 1)&&(__CLR4_4_1ktjktjlb90p8wq.R.iget(27067)!=0|true))||(__CLR4_4_1ktjktjlb90p8wq.R.iget(27068)==0&false)); m++) {{
            // Scale column.
            __CLR4_4_1ktjktjlb90p8wq.R.inc(27069);double scale = 0;
            __CLR4_4_1ktjktjlb90p8wq.R.inc(27070);for (int i = m; (((i <= high)&&(__CLR4_4_1ktjktjlb90p8wq.R.iget(27071)!=0|true))||(__CLR4_4_1ktjktjlb90p8wq.R.iget(27072)==0&false)); i++) {{
                __CLR4_4_1ktjktjlb90p8wq.R.inc(27073);scale += FastMath.abs(householderVectors[i][m - 1]);
            }

            }__CLR4_4_1ktjktjlb90p8wq.R.inc(27074);if ((((!Precision.equals(scale, 0))&&(__CLR4_4_1ktjktjlb90p8wq.R.iget(27075)!=0|true))||(__CLR4_4_1ktjktjlb90p8wq.R.iget(27076)==0&false))) {{
                // Compute Householder transformation.
                __CLR4_4_1ktjktjlb90p8wq.R.inc(27077);double h = 0;
                __CLR4_4_1ktjktjlb90p8wq.R.inc(27078);for (int i = high; (((i >= m)&&(__CLR4_4_1ktjktjlb90p8wq.R.iget(27079)!=0|true))||(__CLR4_4_1ktjktjlb90p8wq.R.iget(27080)==0&false)); i--) {{
                    __CLR4_4_1ktjktjlb90p8wq.R.inc(27081);ort[i] = householderVectors[i][m - 1] / scale;
                    __CLR4_4_1ktjktjlb90p8wq.R.inc(27082);h += ort[i] * ort[i];
                }
                }__CLR4_4_1ktjktjlb90p8wq.R.inc(27083);final double g = ((((ort[m] > 0) )&&(__CLR4_4_1ktjktjlb90p8wq.R.iget(27084)!=0|true))||(__CLR4_4_1ktjktjlb90p8wq.R.iget(27085)==0&false))? -FastMath.sqrt(h) : FastMath.sqrt(h);

                __CLR4_4_1ktjktjlb90p8wq.R.inc(27086);h = h - ort[m] * g;
                __CLR4_4_1ktjktjlb90p8wq.R.inc(27087);ort[m] = ort[m] - g;

                // Apply Householder similarity transformation
                // H = (I - u*u' / h) * H * (I - u*u' / h)

                __CLR4_4_1ktjktjlb90p8wq.R.inc(27088);for (int j = m; (((j < n)&&(__CLR4_4_1ktjktjlb90p8wq.R.iget(27089)!=0|true))||(__CLR4_4_1ktjktjlb90p8wq.R.iget(27090)==0&false)); j++) {{
                    __CLR4_4_1ktjktjlb90p8wq.R.inc(27091);double f = 0;
                    __CLR4_4_1ktjktjlb90p8wq.R.inc(27092);for (int i = high; (((i >= m)&&(__CLR4_4_1ktjktjlb90p8wq.R.iget(27093)!=0|true))||(__CLR4_4_1ktjktjlb90p8wq.R.iget(27094)==0&false)); i--) {{
                        __CLR4_4_1ktjktjlb90p8wq.R.inc(27095);f += ort[i] * householderVectors[i][j];
                    }
                    }__CLR4_4_1ktjktjlb90p8wq.R.inc(27096);f = f / h;
                    __CLR4_4_1ktjktjlb90p8wq.R.inc(27097);for (int i = m; (((i <= high)&&(__CLR4_4_1ktjktjlb90p8wq.R.iget(27098)!=0|true))||(__CLR4_4_1ktjktjlb90p8wq.R.iget(27099)==0&false)); i++) {{
                        __CLR4_4_1ktjktjlb90p8wq.R.inc(27100);householderVectors[i][j] -= f * ort[i];
                    }
                }}

                }__CLR4_4_1ktjktjlb90p8wq.R.inc(27101);for (int i = 0; (((i <= high)&&(__CLR4_4_1ktjktjlb90p8wq.R.iget(27102)!=0|true))||(__CLR4_4_1ktjktjlb90p8wq.R.iget(27103)==0&false)); i++) {{
                    __CLR4_4_1ktjktjlb90p8wq.R.inc(27104);double f = 0;
                    __CLR4_4_1ktjktjlb90p8wq.R.inc(27105);for (int j = high; (((j >= m)&&(__CLR4_4_1ktjktjlb90p8wq.R.iget(27106)!=0|true))||(__CLR4_4_1ktjktjlb90p8wq.R.iget(27107)==0&false)); j--) {{
                        __CLR4_4_1ktjktjlb90p8wq.R.inc(27108);f += ort[j] * householderVectors[i][j];
                    }
                    }__CLR4_4_1ktjktjlb90p8wq.R.inc(27109);f = f / h;
                    __CLR4_4_1ktjktjlb90p8wq.R.inc(27110);for (int j = m; (((j <= high)&&(__CLR4_4_1ktjktjlb90p8wq.R.iget(27111)!=0|true))||(__CLR4_4_1ktjktjlb90p8wq.R.iget(27112)==0&false)); j++) {{
                        __CLR4_4_1ktjktjlb90p8wq.R.inc(27113);householderVectors[i][j] -= f * ort[j];
                    }
                }}

                }__CLR4_4_1ktjktjlb90p8wq.R.inc(27114);ort[m] = scale * ort[m];
                __CLR4_4_1ktjktjlb90p8wq.R.inc(27115);householderVectors[m][m - 1] = scale * g;
            }
        }}
    }}finally{__CLR4_4_1ktjktjlb90p8wq.R.flushNeeded();}}
}
