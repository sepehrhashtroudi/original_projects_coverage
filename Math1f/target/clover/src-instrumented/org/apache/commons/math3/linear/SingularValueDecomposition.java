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

import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.Precision;

/**
 * Calculates the compact Singular Value Decomposition of a matrix.
 * <p>
 * The Singular Value Decomposition of matrix A is a set of three matrices: U,
 * &Sigma; and V such that A = U &times; &Sigma; &times; V<sup>T</sup>. Let A be
 * a m &times; n matrix, then U is a m &times; p orthogonal matrix, &Sigma; is a
 * p &times; p diagonal matrix with positive or null elements, V is a p &times;
 * n orthogonal matrix (hence V<sup>T</sup> is also orthogonal) where
 * p=min(m,n).
 * </p>
 * <p>This class is similar to the class with similar name from the
 * <a href="http://math.nist.gov/javanumerics/jama/">JAMA</a> library, with the
 * following changes:</p>
 * <ul>
 *   <li>the {@code norm2} method which has been renamed as {@link #getNorm()
 *   getNorm},</li>
 *   <li>the {@code cond} method which has been renamed as {@link
 *   #getConditionNumber() getConditionNumber},</li>
 *   <li>the {@code rank} method which has been renamed as {@link #getRank()
 *   getRank},</li>
 *   <li>a {@link #getUT() getUT} method has been added,</li>
 *   <li>a {@link #getVT() getVT} method has been added,</li>
 *   <li>a {@link #getSolver() getSolver} method has been added,</li>
 *   <li>a {@link #getCovariance(double) getCovariance} method has been added.</li>
 * </ul>
 * @see <a href="http://mathworld.wolfram.com/SingularValueDecomposition.html">MathWorld</a>
 * @see <a href="http://en.wikipedia.org/wiki/Singular_value_decomposition">Wikipedia</a>
 * @version $Id$
 * @since 2.0 (changed to concrete class in 3.0)
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class SingularValueDecomposition {public static class __CLR4_4_1n2tn2tlb90p94l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,30392,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Relative threshold for small singular values. */
    private static final double EPS = 0x1.0p-52;
    /** Absolute threshold for small singular values. */
    private static final double TINY = 0x1.0p-966;
    /** Computed singular values. */
    private final double[] singularValues;
    /** max(row dimension, column dimension). */
    private final int m;
    /** min(row dimension, column dimension). */
    private final int n;
    /** Indicator for transposed matrix. */
    private final boolean transposed;
    /** Cached value of U matrix. */
    private final RealMatrix cachedU;
    /** Cached value of transposed U matrix. */
    private RealMatrix cachedUt;
    /** Cached value of S (diagonal) matrix. */
    private RealMatrix cachedS;
    /** Cached value of V matrix. */
    private final RealMatrix cachedV;
    /** Cached value of transposed V matrix. */
    private RealMatrix cachedVt;
    /**
     * Tolerance value for small singular values, calculated once we have
     * populated "singularValues".
     **/
    private final double tol;

    /**
     * Calculates the compact Singular Value Decomposition of the given matrix.
     *
     * @param matrix Matrix to decompose.
     */
    public SingularValueDecomposition(final RealMatrix matrix) {try{__CLR4_4_1n2tn2tlb90p94l.R.inc(29909);
        __CLR4_4_1n2tn2tlb90p94l.R.inc(29910);final double[][] A;

         // "m" is always the largest dimension.
        __CLR4_4_1n2tn2tlb90p94l.R.inc(29911);if ((((matrix.getRowDimension() < matrix.getColumnDimension())&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(29912)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(29913)==0&false))) {{
            __CLR4_4_1n2tn2tlb90p94l.R.inc(29914);transposed = true;
            __CLR4_4_1n2tn2tlb90p94l.R.inc(29915);A = matrix.transpose().getData();
            __CLR4_4_1n2tn2tlb90p94l.R.inc(29916);m = matrix.getColumnDimension();
            __CLR4_4_1n2tn2tlb90p94l.R.inc(29917);n = matrix.getRowDimension();
        } }else {{
            __CLR4_4_1n2tn2tlb90p94l.R.inc(29918);transposed = false;
            __CLR4_4_1n2tn2tlb90p94l.R.inc(29919);A = matrix.getData();
            __CLR4_4_1n2tn2tlb90p94l.R.inc(29920);m = matrix.getRowDimension();
            __CLR4_4_1n2tn2tlb90p94l.R.inc(29921);n = matrix.getColumnDimension();
        }

        }__CLR4_4_1n2tn2tlb90p94l.R.inc(29922);singularValues = new double[n];
        __CLR4_4_1n2tn2tlb90p94l.R.inc(29923);final double[][] U = new double[m][n];
        __CLR4_4_1n2tn2tlb90p94l.R.inc(29924);final double[][] V = new double[n][n];
        __CLR4_4_1n2tn2tlb90p94l.R.inc(29925);final double[] e = new double[n];
        __CLR4_4_1n2tn2tlb90p94l.R.inc(29926);final double[] work = new double[m];
        // Reduce A to bidiagonal form, storing the diagonal elements
        // in s and the super-diagonal elements in e.
        __CLR4_4_1n2tn2tlb90p94l.R.inc(29927);final int nct = FastMath.min(m - 1, n);
        __CLR4_4_1n2tn2tlb90p94l.R.inc(29928);final int nrt = FastMath.max(0, n - 2);
        __CLR4_4_1n2tn2tlb90p94l.R.inc(29929);for (int k = 0; (((k < FastMath.max(nct, nrt))&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(29930)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(29931)==0&false)); k++) {{
            __CLR4_4_1n2tn2tlb90p94l.R.inc(29932);if ((((k < nct)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(29933)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(29934)==0&false))) {{
                // Compute the transformation for the k-th column and
                // place the k-th diagonal in s[k].
                // Compute 2-norm of k-th column without under/overflow.
                __CLR4_4_1n2tn2tlb90p94l.R.inc(29935);singularValues[k] = 0;
                __CLR4_4_1n2tn2tlb90p94l.R.inc(29936);for (int i = k; (((i < m)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(29937)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(29938)==0&false)); i++) {{
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(29939);singularValues[k] = FastMath.hypot(singularValues[k], A[i][k]);
                }
                }__CLR4_4_1n2tn2tlb90p94l.R.inc(29940);if ((((singularValues[k] != 0)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(29941)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(29942)==0&false))) {{
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(29943);if ((((A[k][k] < 0)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(29944)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(29945)==0&false))) {{
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(29946);singularValues[k] = -singularValues[k];
                    }
                    }__CLR4_4_1n2tn2tlb90p94l.R.inc(29947);for (int i = k; (((i < m)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(29948)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(29949)==0&false)); i++) {{
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(29950);A[i][k] /= singularValues[k];
                    }
                    }__CLR4_4_1n2tn2tlb90p94l.R.inc(29951);A[k][k] += 1;
                }
                }__CLR4_4_1n2tn2tlb90p94l.R.inc(29952);singularValues[k] = -singularValues[k];
            }
            }__CLR4_4_1n2tn2tlb90p94l.R.inc(29953);for (int j = k + 1; (((j < n)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(29954)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(29955)==0&false)); j++) {{
                __CLR4_4_1n2tn2tlb90p94l.R.inc(29956);if ((((k < nct &&
                    singularValues[k] != 0)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(29957)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(29958)==0&false))) {{
                    // Apply the transformation.
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(29959);double t = 0;
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(29960);for (int i = k; (((i < m)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(29961)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(29962)==0&false)); i++) {{
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(29963);t += A[i][k] * A[i][j];
                    }
                    }__CLR4_4_1n2tn2tlb90p94l.R.inc(29964);t = -t / A[k][k];
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(29965);for (int i = k; (((i < m)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(29966)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(29967)==0&false)); i++) {{
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(29968);A[i][j] += t * A[i][k];
                    }
                }}
                // Place the k-th row of A into e for the
                // subsequent calculation of the row transformation.
                }__CLR4_4_1n2tn2tlb90p94l.R.inc(29969);e[j] = A[k][j];
            }
            }__CLR4_4_1n2tn2tlb90p94l.R.inc(29970);if ((((k < nct)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(29971)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(29972)==0&false))) {{
                // Place the transformation in U for subsequent back
                // multiplication.
                __CLR4_4_1n2tn2tlb90p94l.R.inc(29973);for (int i = k; (((i < m)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(29974)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(29975)==0&false)); i++) {{
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(29976);U[i][k] = A[i][k];
                }
            }}
            }__CLR4_4_1n2tn2tlb90p94l.R.inc(29977);if ((((k < nrt)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(29978)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(29979)==0&false))) {{
                // Compute the k-th row transformation and place the
                // k-th super-diagonal in e[k].
                // Compute 2-norm without under/overflow.
                __CLR4_4_1n2tn2tlb90p94l.R.inc(29980);e[k] = 0;
                __CLR4_4_1n2tn2tlb90p94l.R.inc(29981);for (int i = k + 1; (((i < n)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(29982)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(29983)==0&false)); i++) {{
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(29984);e[k] = FastMath.hypot(e[k], e[i]);
                }
                }__CLR4_4_1n2tn2tlb90p94l.R.inc(29985);if ((((e[k] != 0)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(29986)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(29987)==0&false))) {{
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(29988);if ((((e[k + 1] < 0)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(29989)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(29990)==0&false))) {{
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(29991);e[k] = -e[k];
                    }
                    }__CLR4_4_1n2tn2tlb90p94l.R.inc(29992);for (int i = k + 1; (((i < n)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(29993)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(29994)==0&false)); i++) {{
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(29995);e[i] /= e[k];
                    }
                    }__CLR4_4_1n2tn2tlb90p94l.R.inc(29996);e[k + 1] += 1;
                }
                }__CLR4_4_1n2tn2tlb90p94l.R.inc(29997);e[k] = -e[k];
                __CLR4_4_1n2tn2tlb90p94l.R.inc(29998);if ((((k + 1 < m &&
                    e[k] != 0)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(29999)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30000)==0&false))) {{
                    // Apply the transformation.
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(30001);for (int i = k + 1; (((i < m)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30002)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30003)==0&false)); i++) {{
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30004);work[i] = 0;
                    }
                    }__CLR4_4_1n2tn2tlb90p94l.R.inc(30005);for (int j = k + 1; (((j < n)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30006)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30007)==0&false)); j++) {{
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30008);for (int i = k + 1; (((i < m)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30009)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30010)==0&false)); i++) {{
                            __CLR4_4_1n2tn2tlb90p94l.R.inc(30011);work[i] += e[j] * A[i][j];
                        }
                    }}
                    }__CLR4_4_1n2tn2tlb90p94l.R.inc(30012);for (int j = k + 1; (((j < n)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30013)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30014)==0&false)); j++) {{
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30015);final double t = -e[j] / e[k + 1];
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30016);for (int i = k + 1; (((i < m)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30017)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30018)==0&false)); i++) {{
                            __CLR4_4_1n2tn2tlb90p94l.R.inc(30019);A[i][j] += t * work[i];
                        }
                    }}
                }}

                // Place the transformation in V for subsequent
                // back multiplication.
                }__CLR4_4_1n2tn2tlb90p94l.R.inc(30020);for (int i = k + 1; (((i < n)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30021)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30022)==0&false)); i++) {{
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(30023);V[i][k] = e[i];
                }
            }}
        }}
        // Set up the final bidiagonal matrix or order p.
        }__CLR4_4_1n2tn2tlb90p94l.R.inc(30024);int p = n;
        __CLR4_4_1n2tn2tlb90p94l.R.inc(30025);if ((((nct < n)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30026)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30027)==0&false))) {{
            __CLR4_4_1n2tn2tlb90p94l.R.inc(30028);singularValues[nct] = A[nct][nct];
        }
        }__CLR4_4_1n2tn2tlb90p94l.R.inc(30029);if ((((m < p)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30030)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30031)==0&false))) {{
            __CLR4_4_1n2tn2tlb90p94l.R.inc(30032);singularValues[p - 1] = 0;
        }
        }__CLR4_4_1n2tn2tlb90p94l.R.inc(30033);if ((((nrt + 1 < p)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30034)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30035)==0&false))) {{
            __CLR4_4_1n2tn2tlb90p94l.R.inc(30036);e[nrt] = A[nrt][p - 1];
        }
        }__CLR4_4_1n2tn2tlb90p94l.R.inc(30037);e[p - 1] = 0;

        // Generate U.
        __CLR4_4_1n2tn2tlb90p94l.R.inc(30038);for (int j = nct; (((j < n)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30039)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30040)==0&false)); j++) {{
            __CLR4_4_1n2tn2tlb90p94l.R.inc(30041);for (int i = 0; (((i < m)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30042)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30043)==0&false)); i++) {{
                __CLR4_4_1n2tn2tlb90p94l.R.inc(30044);U[i][j] = 0;
            }
            }__CLR4_4_1n2tn2tlb90p94l.R.inc(30045);U[j][j] = 1;
        }
        }__CLR4_4_1n2tn2tlb90p94l.R.inc(30046);for (int k = nct - 1; (((k >= 0)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30047)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30048)==0&false)); k--) {{
            __CLR4_4_1n2tn2tlb90p94l.R.inc(30049);if ((((singularValues[k] != 0)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30050)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30051)==0&false))) {{
                __CLR4_4_1n2tn2tlb90p94l.R.inc(30052);for (int j = k + 1; (((j < n)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30053)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30054)==0&false)); j++) {{
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(30055);double t = 0;
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(30056);for (int i = k; (((i < m)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30057)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30058)==0&false)); i++) {{
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30059);t += U[i][k] * U[i][j];
                    }
                    }__CLR4_4_1n2tn2tlb90p94l.R.inc(30060);t = -t / U[k][k];
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(30061);for (int i = k; (((i < m)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30062)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30063)==0&false)); i++) {{
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30064);U[i][j] += t * U[i][k];
                    }
                }}
                }__CLR4_4_1n2tn2tlb90p94l.R.inc(30065);for (int i = k; (((i < m)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30066)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30067)==0&false)); i++) {{
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(30068);U[i][k] = -U[i][k];
                }
                }__CLR4_4_1n2tn2tlb90p94l.R.inc(30069);U[k][k] = 1 + U[k][k];
                __CLR4_4_1n2tn2tlb90p94l.R.inc(30070);for (int i = 0; (((i < k - 1)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30071)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30072)==0&false)); i++) {{
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(30073);U[i][k] = 0;
                }
            }} }else {{
                __CLR4_4_1n2tn2tlb90p94l.R.inc(30074);for (int i = 0; (((i < m)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30075)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30076)==0&false)); i++) {{
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(30077);U[i][k] = 0;
                }
                }__CLR4_4_1n2tn2tlb90p94l.R.inc(30078);U[k][k] = 1;
            }
        }}

        // Generate V.
        }__CLR4_4_1n2tn2tlb90p94l.R.inc(30079);for (int k = n - 1; (((k >= 0)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30080)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30081)==0&false)); k--) {{
            __CLR4_4_1n2tn2tlb90p94l.R.inc(30082);if ((((k < nrt &&
                e[k] != 0)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30083)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30084)==0&false))) {{
                __CLR4_4_1n2tn2tlb90p94l.R.inc(30085);for (int j = k + 1; (((j < n)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30086)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30087)==0&false)); j++) {{
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(30088);double t = 0;
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(30089);for (int i = k + 1; (((i < n)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30090)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30091)==0&false)); i++) {{
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30092);t += V[i][k] * V[i][j];
                    }
                    }__CLR4_4_1n2tn2tlb90p94l.R.inc(30093);t = -t / V[k + 1][k];
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(30094);for (int i = k + 1; (((i < n)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30095)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30096)==0&false)); i++) {{
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30097);V[i][j] += t * V[i][k];
                    }
                }}
            }}
            }__CLR4_4_1n2tn2tlb90p94l.R.inc(30098);for (int i = 0; (((i < n)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30099)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30100)==0&false)); i++) {{
                __CLR4_4_1n2tn2tlb90p94l.R.inc(30101);V[i][k] = 0;
            }
            }__CLR4_4_1n2tn2tlb90p94l.R.inc(30102);V[k][k] = 1;
        }

        // Main iteration loop for the singular values.
        }__CLR4_4_1n2tn2tlb90p94l.R.inc(30103);final int pp = p - 1;
        __CLR4_4_1n2tn2tlb90p94l.R.inc(30104);int iter = 0;
        __CLR4_4_1n2tn2tlb90p94l.R.inc(30105);while ((((p > 0)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30106)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30107)==0&false))) {{
            __CLR4_4_1n2tn2tlb90p94l.R.inc(30108);int k;
            __CLR4_4_1n2tn2tlb90p94l.R.inc(30109);int kase;
            // Here is where a test for too many iterations would go.
            // This section of the program inspects for
            // negligible elements in the s and e arrays.  On
            // completion the variables kase and k are set as follows.
            // kase = 1     if s(p) and e[k-1] are negligible and k<p
            // kase = 2     if s(k) is negligible and k<p
            // kase = 3     if e[k-1] is negligible, k<p, and
            //              s(k), ..., s(p) are not negligible (qr step).
            // kase = 4     if e(p-1) is negligible (convergence).
            __CLR4_4_1n2tn2tlb90p94l.R.inc(30110);for (k = p - 2; (((k >= 0)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30111)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30112)==0&false)); k--) {{
                __CLR4_4_1n2tn2tlb90p94l.R.inc(30113);final double threshold
                    = TINY + EPS * (FastMath.abs(singularValues[k]) +
                                    FastMath.abs(singularValues[k + 1]));

                // the following condition is written this way in order
                // to break out of the loop when NaN occurs, writing it
                // as "if (FastMath.abs(e[k]) <= threshold)" would loop
                // indefinitely in case of NaNs because comparison on NaNs
                // always return false, regardless of what is checked
                // see issue MATH-947
                __CLR4_4_1n2tn2tlb90p94l.R.inc(30114);if ((((!(FastMath.abs(e[k]) > threshold))&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30115)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30116)==0&false))) {{
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(30117);e[k] = 0;
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(30118);break;
                }

            }}

            }__CLR4_4_1n2tn2tlb90p94l.R.inc(30119);if ((((k == p - 2)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30120)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30121)==0&false))) {{
                __CLR4_4_1n2tn2tlb90p94l.R.inc(30122);kase = 4;
            } }else {{
                __CLR4_4_1n2tn2tlb90p94l.R.inc(30123);int ks;
                __CLR4_4_1n2tn2tlb90p94l.R.inc(30124);for (ks = p - 1; (((ks >= k)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30125)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30126)==0&false)); ks--) {{
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(30127);if ((((ks == k)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30128)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30129)==0&false))) {{
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30130);break;
                    }
                    }__CLR4_4_1n2tn2tlb90p94l.R.inc(30131);final double t = ((((ks != p )&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30132)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30133)==0&false))? FastMath.abs(e[ks]) : 0) +
                        ((((ks != k + 1 )&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30134)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30135)==0&false))? FastMath.abs(e[ks - 1]) : 0);
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(30136);if ((((FastMath.abs(singularValues[ks]) <= TINY + EPS * t)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30137)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30138)==0&false))) {{
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30139);singularValues[ks] = 0;
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30140);break;
                    }
                }}
                }__CLR4_4_1n2tn2tlb90p94l.R.inc(30141);if ((((ks == k)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30142)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30143)==0&false))) {{
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(30144);kase = 3;
                } }else {__CLR4_4_1n2tn2tlb90p94l.R.inc(30145);if ((((ks == p - 1)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30146)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30147)==0&false))) {{
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(30148);kase = 1;
                } }else {{
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(30149);kase = 2;
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(30150);k = ks;
                }
            }}}
            }__CLR4_4_1n2tn2tlb90p94l.R.inc(30151);k++;
            // Perform the task indicated by kase.
            boolean __CLB4_4_1_bool0=false;__CLR4_4_1n2tn2tlb90p94l.R.inc(30152);switch (kase) {
                // Deflate negligible s(p).
                case 1:if (!__CLB4_4_1_bool0) {__CLR4_4_1n2tn2tlb90p94l.R.inc(30153);__CLB4_4_1_bool0=true;} {
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(30154);double f = e[p - 2];
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(30155);e[p - 2] = 0;
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(30156);for (int j = p - 2; (((j >= k)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30157)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30158)==0&false)); j--) {{
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30159);double t = FastMath.hypot(singularValues[j], f);
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30160);final double cs = singularValues[j] / t;
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30161);final double sn = f / t;
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30162);singularValues[j] = t;
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30163);if ((((j != k)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30164)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30165)==0&false))) {{
                            __CLR4_4_1n2tn2tlb90p94l.R.inc(30166);f = -sn * e[j - 1];
                            __CLR4_4_1n2tn2tlb90p94l.R.inc(30167);e[j - 1] = cs * e[j - 1];
                        }

                        }__CLR4_4_1n2tn2tlb90p94l.R.inc(30168);for (int i = 0; (((i < n)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30169)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30170)==0&false)); i++) {{
                            __CLR4_4_1n2tn2tlb90p94l.R.inc(30171);t = cs * V[i][j] + sn * V[i][p - 1];
                            __CLR4_4_1n2tn2tlb90p94l.R.inc(30172);V[i][p - 1] = -sn * V[i][j] + cs * V[i][p - 1];
                            __CLR4_4_1n2tn2tlb90p94l.R.inc(30173);V[i][j] = t;
                        }
                    }}
                }}
                __CLR4_4_1n2tn2tlb90p94l.R.inc(30174);break;
                // Split at negligible s(k).
                case 2:if (!__CLB4_4_1_bool0) {__CLR4_4_1n2tn2tlb90p94l.R.inc(30175);__CLB4_4_1_bool0=true;} {
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(30176);double f = e[k - 1];
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(30177);e[k - 1] = 0;
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(30178);for (int j = k; (((j < p)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30179)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30180)==0&false)); j++) {{
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30181);double t = FastMath.hypot(singularValues[j], f);
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30182);final double cs = singularValues[j] / t;
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30183);final double sn = f / t;
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30184);singularValues[j] = t;
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30185);f = -sn * e[j];
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30186);e[j] = cs * e[j];

                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30187);for (int i = 0; (((i < m)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30188)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30189)==0&false)); i++) {{
                            __CLR4_4_1n2tn2tlb90p94l.R.inc(30190);t = cs * U[i][j] + sn * U[i][k - 1];
                            __CLR4_4_1n2tn2tlb90p94l.R.inc(30191);U[i][k - 1] = -sn * U[i][j] + cs * U[i][k - 1];
                            __CLR4_4_1n2tn2tlb90p94l.R.inc(30192);U[i][j] = t;
                        }
                    }}
                }}
                __CLR4_4_1n2tn2tlb90p94l.R.inc(30193);break;
                // Perform one qr step.
                case 3:if (!__CLB4_4_1_bool0) {__CLR4_4_1n2tn2tlb90p94l.R.inc(30194);__CLB4_4_1_bool0=true;} {
                    // Calculate the shift.
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(30195);final double maxPm1Pm2 = FastMath.max(FastMath.abs(singularValues[p - 1]),
                                                          FastMath.abs(singularValues[p - 2]));
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(30196);final double scale = FastMath.max(FastMath.max(FastMath.max(maxPm1Pm2,
                                                                                FastMath.abs(e[p - 2])),
                                                                   FastMath.abs(singularValues[k])),
                                                      FastMath.abs(e[k]));
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(30197);final double sp = singularValues[p - 1] / scale;
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(30198);final double spm1 = singularValues[p - 2] / scale;
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(30199);final double epm1 = e[p - 2] / scale;
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(30200);final double sk = singularValues[k] / scale;
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(30201);final double ek = e[k] / scale;
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(30202);final double b = ((spm1 + sp) * (spm1 - sp) + epm1 * epm1) / 2.0;
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(30203);final double c = (sp * epm1) * (sp * epm1);
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(30204);double shift = 0;
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(30205);if ((((b != 0 ||
                        c != 0)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30206)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30207)==0&false))) {{
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30208);shift = FastMath.sqrt(b * b + c);
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30209);if ((((b < 0)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30210)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30211)==0&false))) {{
                            __CLR4_4_1n2tn2tlb90p94l.R.inc(30212);shift = -shift;
                        }
                        }__CLR4_4_1n2tn2tlb90p94l.R.inc(30213);shift = c / (b + shift);
                    }
                    }__CLR4_4_1n2tn2tlb90p94l.R.inc(30214);double f = (sk + sp) * (sk - sp) + shift;
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(30215);double g = sk * ek;
                    // Chase zeros.
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(30216);for (int j = k; (((j < p - 1)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30217)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30218)==0&false)); j++) {{
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30219);double t = FastMath.hypot(f, g);
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30220);double cs = f / t;
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30221);double sn = g / t;
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30222);if ((((j != k)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30223)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30224)==0&false))) {{
                            __CLR4_4_1n2tn2tlb90p94l.R.inc(30225);e[j - 1] = t;
                        }
                        }__CLR4_4_1n2tn2tlb90p94l.R.inc(30226);f = cs * singularValues[j] + sn * e[j];
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30227);e[j] = cs * e[j] - sn * singularValues[j];
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30228);g = sn * singularValues[j + 1];
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30229);singularValues[j + 1] = cs * singularValues[j + 1];

                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30230);for (int i = 0; (((i < n)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30231)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30232)==0&false)); i++) {{
                            __CLR4_4_1n2tn2tlb90p94l.R.inc(30233);t = cs * V[i][j] + sn * V[i][j + 1];
                            __CLR4_4_1n2tn2tlb90p94l.R.inc(30234);V[i][j + 1] = -sn * V[i][j] + cs * V[i][j + 1];
                            __CLR4_4_1n2tn2tlb90p94l.R.inc(30235);V[i][j] = t;
                        }
                        }__CLR4_4_1n2tn2tlb90p94l.R.inc(30236);t = FastMath.hypot(f, g);
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30237);cs = f / t;
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30238);sn = g / t;
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30239);singularValues[j] = t;
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30240);f = cs * e[j] + sn * singularValues[j + 1];
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30241);singularValues[j + 1] = -sn * e[j] + cs * singularValues[j + 1];
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30242);g = sn * e[j + 1];
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30243);e[j + 1] = cs * e[j + 1];
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30244);if ((((j < m - 1)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30245)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30246)==0&false))) {{
                            __CLR4_4_1n2tn2tlb90p94l.R.inc(30247);for (int i = 0; (((i < m)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30248)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30249)==0&false)); i++) {{
                                __CLR4_4_1n2tn2tlb90p94l.R.inc(30250);t = cs * U[i][j] + sn * U[i][j + 1];
                                __CLR4_4_1n2tn2tlb90p94l.R.inc(30251);U[i][j + 1] = -sn * U[i][j] + cs * U[i][j + 1];
                                __CLR4_4_1n2tn2tlb90p94l.R.inc(30252);U[i][j] = t;
                            }
                        }}
                    }}
                    }__CLR4_4_1n2tn2tlb90p94l.R.inc(30253);e[p - 2] = f;
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(30254);iter = iter + 1;
                }
                __CLR4_4_1n2tn2tlb90p94l.R.inc(30255);break;
                // Convergence.
                default:if (!__CLB4_4_1_bool0) {__CLR4_4_1n2tn2tlb90p94l.R.inc(30256);__CLB4_4_1_bool0=true;} {
                    // Make the singular values positive.
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(30257);if ((((singularValues[k] <= 0)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30258)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30259)==0&false))) {{
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30260);singularValues[k] = (((singularValues[k] < 0 )&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30261)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30262)==0&false))? -singularValues[k] : 0;

                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30263);for (int i = 0; (((i <= pp)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30264)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30265)==0&false)); i++) {{
                            __CLR4_4_1n2tn2tlb90p94l.R.inc(30266);V[i][k] = -V[i][k];
                        }
                    }}
                    // Order the singular values.
                    }__CLR4_4_1n2tn2tlb90p94l.R.inc(30267);while ((((k < pp)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30268)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30269)==0&false))) {{
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30270);if ((((singularValues[k] >= singularValues[k + 1])&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30271)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30272)==0&false))) {{
                            __CLR4_4_1n2tn2tlb90p94l.R.inc(30273);break;
                        }
                        }__CLR4_4_1n2tn2tlb90p94l.R.inc(30274);double t = singularValues[k];
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30275);singularValues[k] = singularValues[k + 1];
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30276);singularValues[k + 1] = t;
                        __CLR4_4_1n2tn2tlb90p94l.R.inc(30277);if ((((k < n - 1)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30278)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30279)==0&false))) {{
                            __CLR4_4_1n2tn2tlb90p94l.R.inc(30280);for (int i = 0; (((i < n)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30281)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30282)==0&false)); i++) {{
                                __CLR4_4_1n2tn2tlb90p94l.R.inc(30283);t = V[i][k + 1];
                                __CLR4_4_1n2tn2tlb90p94l.R.inc(30284);V[i][k + 1] = V[i][k];
                                __CLR4_4_1n2tn2tlb90p94l.R.inc(30285);V[i][k] = t;
                            }
                        }}
                        }__CLR4_4_1n2tn2tlb90p94l.R.inc(30286);if ((((k < m - 1)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30287)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30288)==0&false))) {{
                            __CLR4_4_1n2tn2tlb90p94l.R.inc(30289);for (int i = 0; (((i < m)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30290)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30291)==0&false)); i++) {{
                                __CLR4_4_1n2tn2tlb90p94l.R.inc(30292);t = U[i][k + 1];
                                __CLR4_4_1n2tn2tlb90p94l.R.inc(30293);U[i][k + 1] = U[i][k];
                                __CLR4_4_1n2tn2tlb90p94l.R.inc(30294);U[i][k] = t;
                            }
                        }}
                        }__CLR4_4_1n2tn2tlb90p94l.R.inc(30295);k++;
                    }
                    }__CLR4_4_1n2tn2tlb90p94l.R.inc(30296);iter = 0;
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(30297);p--;
                }
                __CLR4_4_1n2tn2tlb90p94l.R.inc(30298);break;
            }
        }

        // Set the small value tolerance used to calculate rank and pseudo-inverse
        }__CLR4_4_1n2tn2tlb90p94l.R.inc(30299);tol = FastMath.max(m * singularValues[0] * EPS,
                           FastMath.sqrt(Precision.SAFE_MIN));

        __CLR4_4_1n2tn2tlb90p94l.R.inc(30300);if ((((!transposed)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30301)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30302)==0&false))) {{
            __CLR4_4_1n2tn2tlb90p94l.R.inc(30303);cachedU = MatrixUtils.createRealMatrix(U);
            __CLR4_4_1n2tn2tlb90p94l.R.inc(30304);cachedV = MatrixUtils.createRealMatrix(V);
        } }else {{
            __CLR4_4_1n2tn2tlb90p94l.R.inc(30305);cachedU = MatrixUtils.createRealMatrix(V);
            __CLR4_4_1n2tn2tlb90p94l.R.inc(30306);cachedV = MatrixUtils.createRealMatrix(U);
        }
    }}finally{__CLR4_4_1n2tn2tlb90p94l.R.flushNeeded();}}

    /**
     * Returns the matrix U of the decomposition.
     * <p>U is an orthogonal matrix, i.e. its transpose is also its inverse.</p>
     * @return the U matrix
     * @see #getUT()
     */
    public RealMatrix getU() {try{__CLR4_4_1n2tn2tlb90p94l.R.inc(30307);
        // return the cached matrix
        __CLR4_4_1n2tn2tlb90p94l.R.inc(30308);return cachedU;

    }finally{__CLR4_4_1n2tn2tlb90p94l.R.flushNeeded();}}

    /**
     * Returns the transpose of the matrix U of the decomposition.
     * <p>U is an orthogonal matrix, i.e. its transpose is also its inverse.</p>
     * @return the U matrix (or null if decomposed matrix is singular)
     * @see #getU()
     */
    public RealMatrix getUT() {try{__CLR4_4_1n2tn2tlb90p94l.R.inc(30309);
        __CLR4_4_1n2tn2tlb90p94l.R.inc(30310);if ((((cachedUt == null)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30311)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30312)==0&false))) {{
            __CLR4_4_1n2tn2tlb90p94l.R.inc(30313);cachedUt = getU().transpose();
        }
        // return the cached matrix
        }__CLR4_4_1n2tn2tlb90p94l.R.inc(30314);return cachedUt;
    }finally{__CLR4_4_1n2tn2tlb90p94l.R.flushNeeded();}}

    /**
     * Returns the diagonal matrix &Sigma; of the decomposition.
     * <p>&Sigma; is a diagonal matrix. The singular values are provided in
     * non-increasing order, for compatibility with Jama.</p>
     * @return the &Sigma; matrix
     */
    public RealMatrix getS() {try{__CLR4_4_1n2tn2tlb90p94l.R.inc(30315);
        __CLR4_4_1n2tn2tlb90p94l.R.inc(30316);if ((((cachedS == null)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30317)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30318)==0&false))) {{
            // cache the matrix for subsequent calls
            __CLR4_4_1n2tn2tlb90p94l.R.inc(30319);cachedS = MatrixUtils.createRealDiagonalMatrix(singularValues);
        }
        }__CLR4_4_1n2tn2tlb90p94l.R.inc(30320);return cachedS;
    }finally{__CLR4_4_1n2tn2tlb90p94l.R.flushNeeded();}}

    /**
     * Returns the diagonal elements of the matrix &Sigma; of the decomposition.
     * <p>The singular values are provided in non-increasing order, for
     * compatibility with Jama.</p>
     * @return the diagonal elements of the &Sigma; matrix
     */
    public double[] getSingularValues() {try{__CLR4_4_1n2tn2tlb90p94l.R.inc(30321);
        __CLR4_4_1n2tn2tlb90p94l.R.inc(30322);return singularValues.clone();
    }finally{__CLR4_4_1n2tn2tlb90p94l.R.flushNeeded();}}

    /**
     * Returns the matrix V of the decomposition.
     * <p>V is an orthogonal matrix, i.e. its transpose is also its inverse.</p>
     * @return the V matrix (or null if decomposed matrix is singular)
     * @see #getVT()
     */
    public RealMatrix getV() {try{__CLR4_4_1n2tn2tlb90p94l.R.inc(30323);
        // return the cached matrix
        __CLR4_4_1n2tn2tlb90p94l.R.inc(30324);return cachedV;
    }finally{__CLR4_4_1n2tn2tlb90p94l.R.flushNeeded();}}

    /**
     * Returns the transpose of the matrix V of the decomposition.
     * <p>V is an orthogonal matrix, i.e. its transpose is also its inverse.</p>
     * @return the V matrix (or null if decomposed matrix is singular)
     * @see #getV()
     */
    public RealMatrix getVT() {try{__CLR4_4_1n2tn2tlb90p94l.R.inc(30325);
        __CLR4_4_1n2tn2tlb90p94l.R.inc(30326);if ((((cachedVt == null)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30327)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30328)==0&false))) {{
            __CLR4_4_1n2tn2tlb90p94l.R.inc(30329);cachedVt = getV().transpose();
        }
        // return the cached matrix
        }__CLR4_4_1n2tn2tlb90p94l.R.inc(30330);return cachedVt;
    }finally{__CLR4_4_1n2tn2tlb90p94l.R.flushNeeded();}}

    /**
     * Returns the n &times; n covariance matrix.
     * <p>The covariance matrix is V &times; J &times; V<sup>T</sup>
     * where J is the diagonal matrix of the inverse of the squares of
     * the singular values.</p>
     * @param minSingularValue value below which singular values are ignored
     * (a 0 or negative value implies all singular value will be used)
     * @return covariance matrix
     * @exception IllegalArgumentException if minSingularValue is larger than
     * the largest singular value, meaning all singular values are ignored
     */
    public RealMatrix getCovariance(final double minSingularValue) {try{__CLR4_4_1n2tn2tlb90p94l.R.inc(30331);
        // get the number of singular values to consider
        __CLR4_4_1n2tn2tlb90p94l.R.inc(30332);final int p = singularValues.length;
        __CLR4_4_1n2tn2tlb90p94l.R.inc(30333);int dimension = 0;
        __CLR4_4_1n2tn2tlb90p94l.R.inc(30334);while ((((dimension < p &&
               singularValues[dimension] >= minSingularValue)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30335)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30336)==0&false))) {{
            __CLR4_4_1n2tn2tlb90p94l.R.inc(30337);++dimension;
        }

        }__CLR4_4_1n2tn2tlb90p94l.R.inc(30338);if ((((dimension == 0)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30339)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30340)==0&false))) {{
            __CLR4_4_1n2tn2tlb90p94l.R.inc(30341);throw new NumberIsTooLargeException(LocalizedFormats.TOO_LARGE_CUTOFF_SINGULAR_VALUE,
                                                minSingularValue, singularValues[0], true);
        }

        }__CLR4_4_1n2tn2tlb90p94l.R.inc(30342);final double[][] data = new double[dimension][p];
        __CLR4_4_1n2tn2tlb90p94l.R.inc(30343);getVT().walkInOptimizedOrder(new DefaultRealMatrixPreservingVisitor() {
            /** {@inheritDoc} */
            @Override
            public void visit(final int row, final int column,
                    final double value) {try{__CLR4_4_1n2tn2tlb90p94l.R.inc(30344);
                __CLR4_4_1n2tn2tlb90p94l.R.inc(30345);data[row][column] = value / singularValues[row];
            }finally{__CLR4_4_1n2tn2tlb90p94l.R.flushNeeded();}}
        }, 0, dimension - 1, 0, p - 1);

        __CLR4_4_1n2tn2tlb90p94l.R.inc(30346);RealMatrix jv = new Array2DRowRealMatrix(data, false);
        __CLR4_4_1n2tn2tlb90p94l.R.inc(30347);return jv.transpose().multiply(jv);
    }finally{__CLR4_4_1n2tn2tlb90p94l.R.flushNeeded();}}

    /**
     * Returns the L<sub>2</sub> norm of the matrix.
     * <p>The L<sub>2</sub> norm is max(|A &times; u|<sub>2</sub> /
     * |u|<sub>2</sub>), where |.|<sub>2</sub> denotes the vectorial 2-norm
     * (i.e. the traditional euclidian norm).</p>
     * @return norm
     */
    public double getNorm() {try{__CLR4_4_1n2tn2tlb90p94l.R.inc(30348);
        __CLR4_4_1n2tn2tlb90p94l.R.inc(30349);return singularValues[0];
    }finally{__CLR4_4_1n2tn2tlb90p94l.R.flushNeeded();}}

    /**
     * Return the condition number of the matrix.
     * @return condition number of the matrix
     */
    public double getConditionNumber() {try{__CLR4_4_1n2tn2tlb90p94l.R.inc(30350);
        __CLR4_4_1n2tn2tlb90p94l.R.inc(30351);return singularValues[0] / singularValues[n - 1];
    }finally{__CLR4_4_1n2tn2tlb90p94l.R.flushNeeded();}}

    /**
     * Computes the inverse of the condition number.
     * In cases of rank deficiency, the {@link #getConditionNumber() condition
     * number} will become undefined.
     *
     * @return the inverse of the condition number.
     */
    public double getInverseConditionNumber() {try{__CLR4_4_1n2tn2tlb90p94l.R.inc(30352);
        __CLR4_4_1n2tn2tlb90p94l.R.inc(30353);return singularValues[n - 1] / singularValues[0];
    }finally{__CLR4_4_1n2tn2tlb90p94l.R.flushNeeded();}}

    /**
     * Return the effective numerical matrix rank.
     * <p>The effective numerical rank is the number of non-negligible
     * singular values. The threshold used to identify non-negligible
     * terms is max(m,n) &times; ulp(s<sub>1</sub>) where ulp(s<sub>1</sub>)
     * is the least significant bit of the largest singular value.</p>
     * @return effective numerical matrix rank
     */
    public int getRank() {try{__CLR4_4_1n2tn2tlb90p94l.R.inc(30354);
        __CLR4_4_1n2tn2tlb90p94l.R.inc(30355);int r = 0;
        __CLR4_4_1n2tn2tlb90p94l.R.inc(30356);for (int i = 0; (((i < singularValues.length)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30357)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30358)==0&false)); i++) {{
            __CLR4_4_1n2tn2tlb90p94l.R.inc(30359);if ((((singularValues[i] > tol)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30360)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30361)==0&false))) {{
                __CLR4_4_1n2tn2tlb90p94l.R.inc(30362);r++;
            }
        }}
        }__CLR4_4_1n2tn2tlb90p94l.R.inc(30363);return r;
    }finally{__CLR4_4_1n2tn2tlb90p94l.R.flushNeeded();}}

    /**
     * Get a solver for finding the A &times; X = B solution in least square sense.
     * @return a solver
     */
    public DecompositionSolver getSolver() {try{__CLR4_4_1n2tn2tlb90p94l.R.inc(30364);
        __CLR4_4_1n2tn2tlb90p94l.R.inc(30365);return new Solver(singularValues, getUT(), getV(), getRank() == m, tol);
    }finally{__CLR4_4_1n2tn2tlb90p94l.R.flushNeeded();}}

    /** Specialized solver. */
    private static class Solver implements DecompositionSolver {
        /** Pseudo-inverse of the initial matrix. */
        private final RealMatrix pseudoInverse;
        /** Singularity indicator. */
        private boolean nonSingular;

        /**
         * Build a solver from decomposed matrix.
         *
         * @param singularValues Singular values.
         * @param uT U<sup>T</sup> matrix of the decomposition.
         * @param v V matrix of the decomposition.
         * @param nonSingular Singularity indicator.
         * @param tol tolerance for singular values
         */
        private Solver(final double[] singularValues, final RealMatrix uT,
                       final RealMatrix v, final boolean nonSingular, final double tol) {try{__CLR4_4_1n2tn2tlb90p94l.R.inc(30366);
            __CLR4_4_1n2tn2tlb90p94l.R.inc(30367);final double[][] suT = uT.getData();
            __CLR4_4_1n2tn2tlb90p94l.R.inc(30368);for (int i = 0; (((i < singularValues.length)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30369)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30370)==0&false)); ++i) {{
                __CLR4_4_1n2tn2tlb90p94l.R.inc(30371);final double a;
                __CLR4_4_1n2tn2tlb90p94l.R.inc(30372);if ((((singularValues[i] > tol)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30373)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30374)==0&false))) {{
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(30375);a = 1 / singularValues[i];
                } }else {{
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(30376);a = 0;
                }
                }__CLR4_4_1n2tn2tlb90p94l.R.inc(30377);final double[] suTi = suT[i];
                __CLR4_4_1n2tn2tlb90p94l.R.inc(30378);for (int j = 0; (((j < suTi.length)&&(__CLR4_4_1n2tn2tlb90p94l.R.iget(30379)!=0|true))||(__CLR4_4_1n2tn2tlb90p94l.R.iget(30380)==0&false)); ++j) {{
                    __CLR4_4_1n2tn2tlb90p94l.R.inc(30381);suTi[j] *= a;
                }
            }}
            }__CLR4_4_1n2tn2tlb90p94l.R.inc(30382);pseudoInverse = v.multiply(new Array2DRowRealMatrix(suT, false));
            __CLR4_4_1n2tn2tlb90p94l.R.inc(30383);this.nonSingular = nonSingular;
        }finally{__CLR4_4_1n2tn2tlb90p94l.R.flushNeeded();}}

        /**
         * Solve the linear equation A &times; X = B in least square sense.
         * <p>
         * The m&times;n matrix A may not be square, the solution X is such that
         * ||A &times; X - B|| is minimal.
         * </p>
         * @param b Right-hand side of the equation A &times; X = B
         * @return a vector X that minimizes the two norm of A &times; X - B
         * @throws org.apache.commons.math3.exception.DimensionMismatchException
         * if the matrices dimensions do not match.
         */
        public RealVector solve(final RealVector b) {try{__CLR4_4_1n2tn2tlb90p94l.R.inc(30384);
            __CLR4_4_1n2tn2tlb90p94l.R.inc(30385);return pseudoInverse.operate(b);
        }finally{__CLR4_4_1n2tn2tlb90p94l.R.flushNeeded();}}

        /**
         * Solve the linear equation A &times; X = B in least square sense.
         * <p>
         * The m&times;n matrix A may not be square, the solution X is such that
         * ||A &times; X - B|| is minimal.
         * </p>
         *
         * @param b Right-hand side of the equation A &times; X = B
         * @return a matrix X that minimizes the two norm of A &times; X - B
         * @throws org.apache.commons.math3.exception.DimensionMismatchException
         * if the matrices dimensions do not match.
         */
        public RealMatrix solve(final RealMatrix b) {try{__CLR4_4_1n2tn2tlb90p94l.R.inc(30386);
            __CLR4_4_1n2tn2tlb90p94l.R.inc(30387);return pseudoInverse.multiply(b);
        }finally{__CLR4_4_1n2tn2tlb90p94l.R.flushNeeded();}}

        /**
         * Check if the decomposed matrix is non-singular.
         *
         * @return {@code true} if the decomposed matrix is non-singular.
         */
        public boolean isNonSingular() {try{__CLR4_4_1n2tn2tlb90p94l.R.inc(30388);
            __CLR4_4_1n2tn2tlb90p94l.R.inc(30389);return nonSingular;
        }finally{__CLR4_4_1n2tn2tlb90p94l.R.flushNeeded();}}

        /**
         * Get the pseudo-inverse of the decomposed matrix.
         *
         * @return the inverse matrix.
         */
        public RealMatrix getInverse() {try{__CLR4_4_1n2tn2tlb90p94l.R.inc(30390);
            __CLR4_4_1n2tn2tlb90p94l.R.inc(30391);return pseudoInverse;
        }finally{__CLR4_4_1n2tn2tlb90p94l.R.flushNeeded();}}
    }
}
