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
 * Class transforming any matrix to bi-diagonal shape.
 * <p>Any m &times; n matrix A can be written as the product of three matrices:
 * A = U &times; B &times; V<sup>T</sup> with U an m &times; m orthogonal matrix,
 * B an m &times; n bi-diagonal matrix (lower diagonal if m &lt; n, upper diagonal
 * otherwise), and V an n &times; n orthogonal matrix.</p>
 * <p>Transformation to bi-diagonal shape is often not a goal by itself, but it is
 * an intermediate step in more general decomposition algorithms like {@link
 * SingularValueDecomposition Singular Value Decomposition}. This class is therefore
 * intended for internal use by the library and is not public. As a consequence of
 * this explicitly limited scope, many methods directly returns references to
 * internal arrays, not copies.</p>
 * @version $Id$
 * @since 2.0
 */
class BiDiagonalTransformer {public static class __CLR4_4_1i3ai3alb90p8oz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,23718,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Householder vectors. */
    private final double householderVectors[][];

    /** Main diagonal. */
    private final double[] main;

    /** Secondary diagonal. */
    private final double[] secondary;

    /** Cached value of U. */
    private RealMatrix cachedU;

    /** Cached value of B. */
    private RealMatrix cachedB;

    /** Cached value of V. */
    private RealMatrix cachedV;

    /**
     * Build the transformation to bi-diagonal shape of a matrix.
     * @param matrix the matrix to transform.
     */
    public BiDiagonalTransformer(RealMatrix matrix) {try{__CLR4_4_1i3ai3alb90p8oz.R.inc(23446);

        __CLR4_4_1i3ai3alb90p8oz.R.inc(23447);final int m = matrix.getRowDimension();
        __CLR4_4_1i3ai3alb90p8oz.R.inc(23448);final int n = matrix.getColumnDimension();
        __CLR4_4_1i3ai3alb90p8oz.R.inc(23449);final int p = FastMath.min(m, n);
        __CLR4_4_1i3ai3alb90p8oz.R.inc(23450);householderVectors = matrix.getData();
        __CLR4_4_1i3ai3alb90p8oz.R.inc(23451);main      = new double[p];
        __CLR4_4_1i3ai3alb90p8oz.R.inc(23452);secondary = new double[p - 1];
        __CLR4_4_1i3ai3alb90p8oz.R.inc(23453);cachedU   = null;
        __CLR4_4_1i3ai3alb90p8oz.R.inc(23454);cachedB   = null;
        __CLR4_4_1i3ai3alb90p8oz.R.inc(23455);cachedV   = null;

        // transform matrix
        __CLR4_4_1i3ai3alb90p8oz.R.inc(23456);if ((((m >= n)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23457)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23458)==0&false))) {{
            __CLR4_4_1i3ai3alb90p8oz.R.inc(23459);transformToUpperBiDiagonal();
        } }else {{
            __CLR4_4_1i3ai3alb90p8oz.R.inc(23460);transformToLowerBiDiagonal();
        }

    }}finally{__CLR4_4_1i3ai3alb90p8oz.R.flushNeeded();}}

    /**
     * Returns the matrix U of the transform.
     * <p>U is an orthogonal matrix, i.e. its transpose is also its inverse.</p>
     * @return the U matrix
     */
    public RealMatrix getU() {try{__CLR4_4_1i3ai3alb90p8oz.R.inc(23461);

        __CLR4_4_1i3ai3alb90p8oz.R.inc(23462);if ((((cachedU == null)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23463)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23464)==0&false))) {{

            __CLR4_4_1i3ai3alb90p8oz.R.inc(23465);final int m = householderVectors.length;
            __CLR4_4_1i3ai3alb90p8oz.R.inc(23466);final int n = householderVectors[0].length;
            __CLR4_4_1i3ai3alb90p8oz.R.inc(23467);final int p = main.length;
            __CLR4_4_1i3ai3alb90p8oz.R.inc(23468);final int diagOffset    = ((((m >= n) )&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23469)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23470)==0&false))? 0 : 1;
            __CLR4_4_1i3ai3alb90p8oz.R.inc(23471);final double[] diagonal = ((((m >= n) )&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23472)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23473)==0&false))? main : secondary;
            __CLR4_4_1i3ai3alb90p8oz.R.inc(23474);double[][] ua = new double[m][m];

            // fill up the part of the matrix not affected by Householder transforms
            __CLR4_4_1i3ai3alb90p8oz.R.inc(23475);for (int k = m - 1; (((k >= p)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23476)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23477)==0&false)); --k) {{
                __CLR4_4_1i3ai3alb90p8oz.R.inc(23478);ua[k][k] = 1;
            }

            // build up first part of the matrix by applying Householder transforms
            }__CLR4_4_1i3ai3alb90p8oz.R.inc(23479);for (int k = p - 1; (((k >= diagOffset)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23480)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23481)==0&false)); --k) {{
                __CLR4_4_1i3ai3alb90p8oz.R.inc(23482);final double[] hK = householderVectors[k];
                __CLR4_4_1i3ai3alb90p8oz.R.inc(23483);ua[k][k] = 1;
                __CLR4_4_1i3ai3alb90p8oz.R.inc(23484);if ((((hK[k - diagOffset] != 0.0)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23485)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23486)==0&false))) {{
                    __CLR4_4_1i3ai3alb90p8oz.R.inc(23487);for (int j = k; (((j < m)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23488)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23489)==0&false)); ++j) {{
                        __CLR4_4_1i3ai3alb90p8oz.R.inc(23490);double alpha = 0;
                        __CLR4_4_1i3ai3alb90p8oz.R.inc(23491);for (int i = k; (((i < m)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23492)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23493)==0&false)); ++i) {{
                            __CLR4_4_1i3ai3alb90p8oz.R.inc(23494);alpha -= ua[i][j] * householderVectors[i][k - diagOffset];
                        }
                        }__CLR4_4_1i3ai3alb90p8oz.R.inc(23495);alpha /= diagonal[k - diagOffset] * hK[k - diagOffset];

                        __CLR4_4_1i3ai3alb90p8oz.R.inc(23496);for (int i = k; (((i < m)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23497)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23498)==0&false)); ++i) {{
                            __CLR4_4_1i3ai3alb90p8oz.R.inc(23499);ua[i][j] += -alpha * householderVectors[i][k - diagOffset];
                        }
                    }}
                }}
            }}
            }__CLR4_4_1i3ai3alb90p8oz.R.inc(23500);if ((((diagOffset > 0)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23501)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23502)==0&false))) {{
                __CLR4_4_1i3ai3alb90p8oz.R.inc(23503);ua[0][0] = 1;
            }
            }__CLR4_4_1i3ai3alb90p8oz.R.inc(23504);cachedU = MatrixUtils.createRealMatrix(ua);
        }

        // return the cached matrix
        }__CLR4_4_1i3ai3alb90p8oz.R.inc(23505);return cachedU;

    }finally{__CLR4_4_1i3ai3alb90p8oz.R.flushNeeded();}}

    /**
     * Returns the bi-diagonal matrix B of the transform.
     * @return the B matrix
     */
    public RealMatrix getB() {try{__CLR4_4_1i3ai3alb90p8oz.R.inc(23506);

        __CLR4_4_1i3ai3alb90p8oz.R.inc(23507);if ((((cachedB == null)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23508)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23509)==0&false))) {{

            __CLR4_4_1i3ai3alb90p8oz.R.inc(23510);final int m = householderVectors.length;
            __CLR4_4_1i3ai3alb90p8oz.R.inc(23511);final int n = householderVectors[0].length;
            __CLR4_4_1i3ai3alb90p8oz.R.inc(23512);double[][] ba = new double[m][n];
            __CLR4_4_1i3ai3alb90p8oz.R.inc(23513);for (int i = 0; (((i < main.length)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23514)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23515)==0&false)); ++i) {{
                __CLR4_4_1i3ai3alb90p8oz.R.inc(23516);ba[i][i] = main[i];
                __CLR4_4_1i3ai3alb90p8oz.R.inc(23517);if ((((m < n)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23518)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23519)==0&false))) {{
                    __CLR4_4_1i3ai3alb90p8oz.R.inc(23520);if ((((i > 0)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23521)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23522)==0&false))) {{
                        __CLR4_4_1i3ai3alb90p8oz.R.inc(23523);ba[i][i-1] = secondary[i - 1];
                    }
                }} }else {{
                    __CLR4_4_1i3ai3alb90p8oz.R.inc(23524);if ((((i < main.length - 1)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23525)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23526)==0&false))) {{
                        __CLR4_4_1i3ai3alb90p8oz.R.inc(23527);ba[i][i+1] = secondary[i];
                    }
                }}
            }}
            }__CLR4_4_1i3ai3alb90p8oz.R.inc(23528);cachedB = MatrixUtils.createRealMatrix(ba);
        }

        // return the cached matrix
        }__CLR4_4_1i3ai3alb90p8oz.R.inc(23529);return cachedB;

    }finally{__CLR4_4_1i3ai3alb90p8oz.R.flushNeeded();}}

    /**
     * Returns the matrix V of the transform.
     * <p>V is an orthogonal matrix, i.e. its transpose is also its inverse.</p>
     * @return the V matrix
     */
    public RealMatrix getV() {try{__CLR4_4_1i3ai3alb90p8oz.R.inc(23530);

        __CLR4_4_1i3ai3alb90p8oz.R.inc(23531);if ((((cachedV == null)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23532)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23533)==0&false))) {{

            __CLR4_4_1i3ai3alb90p8oz.R.inc(23534);final int m = householderVectors.length;
            __CLR4_4_1i3ai3alb90p8oz.R.inc(23535);final int n = householderVectors[0].length;
            __CLR4_4_1i3ai3alb90p8oz.R.inc(23536);final int p = main.length;
            __CLR4_4_1i3ai3alb90p8oz.R.inc(23537);final int diagOffset    = ((((m >= n) )&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23538)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23539)==0&false))? 1 : 0;
            __CLR4_4_1i3ai3alb90p8oz.R.inc(23540);final double[] diagonal = ((((m >= n) )&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23541)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23542)==0&false))? secondary : main;
            __CLR4_4_1i3ai3alb90p8oz.R.inc(23543);double[][] va = new double[n][n];

            // fill up the part of the matrix not affected by Householder transforms
            __CLR4_4_1i3ai3alb90p8oz.R.inc(23544);for (int k = n - 1; (((k >= p)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23545)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23546)==0&false)); --k) {{
                __CLR4_4_1i3ai3alb90p8oz.R.inc(23547);va[k][k] = 1;
            }

            // build up first part of the matrix by applying Householder transforms
            }__CLR4_4_1i3ai3alb90p8oz.R.inc(23548);for (int k = p - 1; (((k >= diagOffset)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23549)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23550)==0&false)); --k) {{
                __CLR4_4_1i3ai3alb90p8oz.R.inc(23551);final double[] hK = householderVectors[k - diagOffset];
                __CLR4_4_1i3ai3alb90p8oz.R.inc(23552);va[k][k] = 1;
                __CLR4_4_1i3ai3alb90p8oz.R.inc(23553);if ((((hK[k] != 0.0)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23554)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23555)==0&false))) {{
                    __CLR4_4_1i3ai3alb90p8oz.R.inc(23556);for (int j = k; (((j < n)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23557)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23558)==0&false)); ++j) {{
                        __CLR4_4_1i3ai3alb90p8oz.R.inc(23559);double beta = 0;
                        __CLR4_4_1i3ai3alb90p8oz.R.inc(23560);for (int i = k; (((i < n)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23561)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23562)==0&false)); ++i) {{
                            __CLR4_4_1i3ai3alb90p8oz.R.inc(23563);beta -= va[i][j] * hK[i];
                        }
                        }__CLR4_4_1i3ai3alb90p8oz.R.inc(23564);beta /= diagonal[k - diagOffset] * hK[k];

                        __CLR4_4_1i3ai3alb90p8oz.R.inc(23565);for (int i = k; (((i < n)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23566)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23567)==0&false)); ++i) {{
                            __CLR4_4_1i3ai3alb90p8oz.R.inc(23568);va[i][j] += -beta * hK[i];
                        }
                    }}
                }}
            }}
            }__CLR4_4_1i3ai3alb90p8oz.R.inc(23569);if ((((diagOffset > 0)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23570)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23571)==0&false))) {{
                __CLR4_4_1i3ai3alb90p8oz.R.inc(23572);va[0][0] = 1;
            }
            }__CLR4_4_1i3ai3alb90p8oz.R.inc(23573);cachedV = MatrixUtils.createRealMatrix(va);
        }

        // return the cached matrix
        }__CLR4_4_1i3ai3alb90p8oz.R.inc(23574);return cachedV;

    }finally{__CLR4_4_1i3ai3alb90p8oz.R.flushNeeded();}}

    /**
     * Get the Householder vectors of the transform.
     * <p>Note that since this class is only intended for internal use,
     * it returns directly a reference to its internal arrays, not a copy.</p>
     * @return the main diagonal elements of the B matrix
     */
    double[][] getHouseholderVectorsRef() {try{__CLR4_4_1i3ai3alb90p8oz.R.inc(23575);
        __CLR4_4_1i3ai3alb90p8oz.R.inc(23576);return householderVectors;
    }finally{__CLR4_4_1i3ai3alb90p8oz.R.flushNeeded();}}

    /**
     * Get the main diagonal elements of the matrix B of the transform.
     * <p>Note that since this class is only intended for internal use,
     * it returns directly a reference to its internal arrays, not a copy.</p>
     * @return the main diagonal elements of the B matrix
     */
    double[] getMainDiagonalRef() {try{__CLR4_4_1i3ai3alb90p8oz.R.inc(23577);
        __CLR4_4_1i3ai3alb90p8oz.R.inc(23578);return main;
    }finally{__CLR4_4_1i3ai3alb90p8oz.R.flushNeeded();}}

    /**
     * Get the secondary diagonal elements of the matrix B of the transform.
     * <p>Note that since this class is only intended for internal use,
     * it returns directly a reference to its internal arrays, not a copy.</p>
     * @return the secondary diagonal elements of the B matrix
     */
    double[] getSecondaryDiagonalRef() {try{__CLR4_4_1i3ai3alb90p8oz.R.inc(23579);
        __CLR4_4_1i3ai3alb90p8oz.R.inc(23580);return secondary;
    }finally{__CLR4_4_1i3ai3alb90p8oz.R.flushNeeded();}}

    /**
     * Check if the matrix is transformed to upper bi-diagonal.
     * @return true if the matrix is transformed to upper bi-diagonal
     */
    boolean isUpperBiDiagonal() {try{__CLR4_4_1i3ai3alb90p8oz.R.inc(23581);
        __CLR4_4_1i3ai3alb90p8oz.R.inc(23582);return householderVectors.length >=  householderVectors[0].length;
    }finally{__CLR4_4_1i3ai3alb90p8oz.R.flushNeeded();}}

    /**
     * Transform original matrix to upper bi-diagonal form.
     * <p>Transformation is done using alternate Householder transforms
     * on columns and rows.</p>
     */
    private void transformToUpperBiDiagonal() {try{__CLR4_4_1i3ai3alb90p8oz.R.inc(23583);

        __CLR4_4_1i3ai3alb90p8oz.R.inc(23584);final int m = householderVectors.length;
        __CLR4_4_1i3ai3alb90p8oz.R.inc(23585);final int n = householderVectors[0].length;
        __CLR4_4_1i3ai3alb90p8oz.R.inc(23586);for (int k = 0; (((k < n)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23587)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23588)==0&false)); k++) {{

            //zero-out a column
            __CLR4_4_1i3ai3alb90p8oz.R.inc(23589);double xNormSqr = 0;
            __CLR4_4_1i3ai3alb90p8oz.R.inc(23590);for (int i = k; (((i < m)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23591)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23592)==0&false)); ++i) {{
                __CLR4_4_1i3ai3alb90p8oz.R.inc(23593);final double c = householderVectors[i][k];
                __CLR4_4_1i3ai3alb90p8oz.R.inc(23594);xNormSqr += c * c;
            }
            }__CLR4_4_1i3ai3alb90p8oz.R.inc(23595);final double[] hK = householderVectors[k];
            __CLR4_4_1i3ai3alb90p8oz.R.inc(23596);final double a = ((((hK[k] > 0) )&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23597)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23598)==0&false))? -FastMath.sqrt(xNormSqr) : FastMath.sqrt(xNormSqr);
            __CLR4_4_1i3ai3alb90p8oz.R.inc(23599);main[k] = a;
            __CLR4_4_1i3ai3alb90p8oz.R.inc(23600);if ((((a != 0.0)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23601)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23602)==0&false))) {{
                __CLR4_4_1i3ai3alb90p8oz.R.inc(23603);hK[k] -= a;
                __CLR4_4_1i3ai3alb90p8oz.R.inc(23604);for (int j = k + 1; (((j < n)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23605)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23606)==0&false)); ++j) {{
                    __CLR4_4_1i3ai3alb90p8oz.R.inc(23607);double alpha = 0;
                    __CLR4_4_1i3ai3alb90p8oz.R.inc(23608);for (int i = k; (((i < m)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23609)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23610)==0&false)); ++i) {{
                        __CLR4_4_1i3ai3alb90p8oz.R.inc(23611);final double[] hI = householderVectors[i];
                        __CLR4_4_1i3ai3alb90p8oz.R.inc(23612);alpha -= hI[j] * hI[k];
                    }
                    }__CLR4_4_1i3ai3alb90p8oz.R.inc(23613);alpha /= a * householderVectors[k][k];
                    __CLR4_4_1i3ai3alb90p8oz.R.inc(23614);for (int i = k; (((i < m)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23615)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23616)==0&false)); ++i) {{
                        __CLR4_4_1i3ai3alb90p8oz.R.inc(23617);final double[] hI = householderVectors[i];
                        __CLR4_4_1i3ai3alb90p8oz.R.inc(23618);hI[j] -= alpha * hI[k];
                    }
                }}
            }}

            }__CLR4_4_1i3ai3alb90p8oz.R.inc(23619);if ((((k < n - 1)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23620)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23621)==0&false))) {{
                //zero-out a row
                __CLR4_4_1i3ai3alb90p8oz.R.inc(23622);xNormSqr = 0;
                __CLR4_4_1i3ai3alb90p8oz.R.inc(23623);for (int j = k + 1; (((j < n)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23624)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23625)==0&false)); ++j) {{
                    __CLR4_4_1i3ai3alb90p8oz.R.inc(23626);final double c = hK[j];
                    __CLR4_4_1i3ai3alb90p8oz.R.inc(23627);xNormSqr += c * c;
                }
                }__CLR4_4_1i3ai3alb90p8oz.R.inc(23628);final double b = ((((hK[k + 1] > 0) )&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23629)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23630)==0&false))? -FastMath.sqrt(xNormSqr) : FastMath.sqrt(xNormSqr);
                __CLR4_4_1i3ai3alb90p8oz.R.inc(23631);secondary[k] = b;
                __CLR4_4_1i3ai3alb90p8oz.R.inc(23632);if ((((b != 0.0)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23633)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23634)==0&false))) {{
                    __CLR4_4_1i3ai3alb90p8oz.R.inc(23635);hK[k + 1] -= b;
                    __CLR4_4_1i3ai3alb90p8oz.R.inc(23636);for (int i = k + 1; (((i < m)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23637)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23638)==0&false)); ++i) {{
                        __CLR4_4_1i3ai3alb90p8oz.R.inc(23639);final double[] hI = householderVectors[i];
                        __CLR4_4_1i3ai3alb90p8oz.R.inc(23640);double beta = 0;
                        __CLR4_4_1i3ai3alb90p8oz.R.inc(23641);for (int j = k + 1; (((j < n)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23642)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23643)==0&false)); ++j) {{
                            __CLR4_4_1i3ai3alb90p8oz.R.inc(23644);beta -= hI[j] * hK[j];
                        }
                        }__CLR4_4_1i3ai3alb90p8oz.R.inc(23645);beta /= b * hK[k + 1];
                        __CLR4_4_1i3ai3alb90p8oz.R.inc(23646);for (int j = k + 1; (((j < n)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23647)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23648)==0&false)); ++j) {{
                            __CLR4_4_1i3ai3alb90p8oz.R.inc(23649);hI[j] -= beta * hK[j];
                        }
                    }}
                }}
            }}

        }}
    }}finally{__CLR4_4_1i3ai3alb90p8oz.R.flushNeeded();}}

    /**
     * Transform original matrix to lower bi-diagonal form.
     * <p>Transformation is done using alternate Householder transforms
     * on rows and columns.</p>
     */
    private void transformToLowerBiDiagonal() {try{__CLR4_4_1i3ai3alb90p8oz.R.inc(23650);

        __CLR4_4_1i3ai3alb90p8oz.R.inc(23651);final int m = householderVectors.length;
        __CLR4_4_1i3ai3alb90p8oz.R.inc(23652);final int n = householderVectors[0].length;
        __CLR4_4_1i3ai3alb90p8oz.R.inc(23653);for (int k = 0; (((k < m)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23654)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23655)==0&false)); k++) {{

            //zero-out a row
            __CLR4_4_1i3ai3alb90p8oz.R.inc(23656);final double[] hK = householderVectors[k];
            __CLR4_4_1i3ai3alb90p8oz.R.inc(23657);double xNormSqr = 0;
            __CLR4_4_1i3ai3alb90p8oz.R.inc(23658);for (int j = k; (((j < n)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23659)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23660)==0&false)); ++j) {{
                __CLR4_4_1i3ai3alb90p8oz.R.inc(23661);final double c = hK[j];
                __CLR4_4_1i3ai3alb90p8oz.R.inc(23662);xNormSqr += c * c;
            }
            }__CLR4_4_1i3ai3alb90p8oz.R.inc(23663);final double a = ((((hK[k] > 0) )&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23664)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23665)==0&false))? -FastMath.sqrt(xNormSqr) : FastMath.sqrt(xNormSqr);
            __CLR4_4_1i3ai3alb90p8oz.R.inc(23666);main[k] = a;
            __CLR4_4_1i3ai3alb90p8oz.R.inc(23667);if ((((a != 0.0)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23668)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23669)==0&false))) {{
                __CLR4_4_1i3ai3alb90p8oz.R.inc(23670);hK[k] -= a;
                __CLR4_4_1i3ai3alb90p8oz.R.inc(23671);for (int i = k + 1; (((i < m)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23672)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23673)==0&false)); ++i) {{
                    __CLR4_4_1i3ai3alb90p8oz.R.inc(23674);final double[] hI = householderVectors[i];
                    __CLR4_4_1i3ai3alb90p8oz.R.inc(23675);double alpha = 0;
                    __CLR4_4_1i3ai3alb90p8oz.R.inc(23676);for (int j = k; (((j < n)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23677)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23678)==0&false)); ++j) {{
                        __CLR4_4_1i3ai3alb90p8oz.R.inc(23679);alpha -= hI[j] * hK[j];
                    }
                    }__CLR4_4_1i3ai3alb90p8oz.R.inc(23680);alpha /= a * householderVectors[k][k];
                    __CLR4_4_1i3ai3alb90p8oz.R.inc(23681);for (int j = k; (((j < n)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23682)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23683)==0&false)); ++j) {{
                        __CLR4_4_1i3ai3alb90p8oz.R.inc(23684);hI[j] -= alpha * hK[j];
                    }
                }}
            }}

            }__CLR4_4_1i3ai3alb90p8oz.R.inc(23685);if ((((k < m - 1)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23686)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23687)==0&false))) {{
                //zero-out a column
                __CLR4_4_1i3ai3alb90p8oz.R.inc(23688);final double[] hKp1 = householderVectors[k + 1];
                __CLR4_4_1i3ai3alb90p8oz.R.inc(23689);xNormSqr = 0;
                __CLR4_4_1i3ai3alb90p8oz.R.inc(23690);for (int i = k + 1; (((i < m)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23691)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23692)==0&false)); ++i) {{
                    __CLR4_4_1i3ai3alb90p8oz.R.inc(23693);final double c = householderVectors[i][k];
                    __CLR4_4_1i3ai3alb90p8oz.R.inc(23694);xNormSqr += c * c;
                }
                }__CLR4_4_1i3ai3alb90p8oz.R.inc(23695);final double b = ((((hKp1[k] > 0) )&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23696)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23697)==0&false))? -FastMath.sqrt(xNormSqr) : FastMath.sqrt(xNormSqr);
                __CLR4_4_1i3ai3alb90p8oz.R.inc(23698);secondary[k] = b;
                __CLR4_4_1i3ai3alb90p8oz.R.inc(23699);if ((((b != 0.0)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23700)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23701)==0&false))) {{
                    __CLR4_4_1i3ai3alb90p8oz.R.inc(23702);hKp1[k] -= b;
                    __CLR4_4_1i3ai3alb90p8oz.R.inc(23703);for (int j = k + 1; (((j < n)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23704)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23705)==0&false)); ++j) {{
                        __CLR4_4_1i3ai3alb90p8oz.R.inc(23706);double beta = 0;
                        __CLR4_4_1i3ai3alb90p8oz.R.inc(23707);for (int i = k + 1; (((i < m)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23708)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23709)==0&false)); ++i) {{
                            __CLR4_4_1i3ai3alb90p8oz.R.inc(23710);final double[] hI = householderVectors[i];
                            __CLR4_4_1i3ai3alb90p8oz.R.inc(23711);beta -= hI[j] * hI[k];
                        }
                        }__CLR4_4_1i3ai3alb90p8oz.R.inc(23712);beta /= b * hKp1[k];
                        __CLR4_4_1i3ai3alb90p8oz.R.inc(23713);for (int i = k + 1; (((i < m)&&(__CLR4_4_1i3ai3alb90p8oz.R.iget(23714)!=0|true))||(__CLR4_4_1i3ai3alb90p8oz.R.iget(23715)==0&false)); ++i) {{
                            __CLR4_4_1i3ai3alb90p8oz.R.inc(23716);final double[] hI = householderVectors[i];
                            __CLR4_4_1i3ai3alb90p8oz.R.inc(23717);hI[j] -= beta * hI[k];
                        }
                    }}
                }}
            }}

        }}
    }}finally{__CLR4_4_1i3ai3alb90p8oz.R.flushNeeded();}}

}
