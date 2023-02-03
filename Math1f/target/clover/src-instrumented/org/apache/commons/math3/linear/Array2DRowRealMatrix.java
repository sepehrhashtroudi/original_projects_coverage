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

import java.io.Serializable;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.MathUtils;

/**
 * Implementation of {@link RealMatrix} using a {@code double[][]} array to
 * store entries.
 *
 * @version $Id$
 */
public class Array2DRowRealMatrix extends AbstractRealMatrix implements Serializable {public static class __CLR4_4_1h4mh4mlb90p8ma{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,22502,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Serializable version identifier. */
    private static final long serialVersionUID = -1067294169172445528L;

    /** Entries of the matrix. */
    private double data[][];

    /**
     * Creates a matrix with no data
     */
    public Array2DRowRealMatrix() {try{__CLR4_4_1h4mh4mlb90p8ma.R.inc(22198);}finally{__CLR4_4_1h4mh4mlb90p8ma.R.flushNeeded();}}

    /**
     * Create a new RealMatrix with the supplied row and column dimensions.
     *
     * @param rowDimension Number of rows in the new matrix.
     * @param columnDimension Number of columns in the new matrix.
     * @throws NotStrictlyPositiveException if the row or column dimension is
     * not positive.
     */
    public Array2DRowRealMatrix(final int rowDimension,
                                final int columnDimension)
        throws NotStrictlyPositiveException {
        super(rowDimension, columnDimension);__CLR4_4_1h4mh4mlb90p8ma.R.inc(22200);try{__CLR4_4_1h4mh4mlb90p8ma.R.inc(22199);
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22201);data = new double[rowDimension][columnDimension];
    }finally{__CLR4_4_1h4mh4mlb90p8ma.R.flushNeeded();}}

    /**
     * Create a new {@code RealMatrix} using the input array as the underlying
     * data array.
     * <p>The input array is copied, not referenced. This constructor has
     * the same effect as calling {@link #Array2DRowRealMatrix(double[][], boolean)}
     * with the second argument set to {@code true}.</p>
     *
     * @param d Data for the new matrix.
     * @throws DimensionMismatchException if {@code d} is not rectangular.
     * @throws NoDataException if {@code d} row or column dimension is zero.
     * @throws NullArgumentException if {@code d} is {@code null}.
     * @see #Array2DRowRealMatrix(double[][], boolean)
     */
    public Array2DRowRealMatrix(final double[][] d)
        throws DimensionMismatchException, NoDataException, NullArgumentException {try{__CLR4_4_1h4mh4mlb90p8ma.R.inc(22202);
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22203);copyIn(d);
    }finally{__CLR4_4_1h4mh4mlb90p8ma.R.flushNeeded();}}

    /**
     * Create a new RealMatrix using the input array as the underlying
     * data array.
     * If an array is built specially in order to be embedded in a
     * RealMatrix and not used directly, the {@code copyArray} may be
     * set to {@code false}. This will prevent the copying and improve
     * performance as no new array will be built and no data will be copied.
     *
     * @param d Data for new matrix.
     * @param copyArray if {@code true}, the input array will be copied,
     * otherwise it will be referenced.
     * @throws DimensionMismatchException if {@code d} is not rectangular.
     * @throws NoDataException if {@code d} row or column dimension is zero.
     * @throws NullArgumentException if {@code d} is {@code null}.
     * @see #Array2DRowRealMatrix(double[][])
     */
    public Array2DRowRealMatrix(final double[][] d, final boolean copyArray)
        throws DimensionMismatchException, NoDataException,
        NullArgumentException {try{__CLR4_4_1h4mh4mlb90p8ma.R.inc(22204);
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22205);if ((((copyArray)&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22206)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22207)==0&false))) {{
            __CLR4_4_1h4mh4mlb90p8ma.R.inc(22208);copyIn(d);
        } }else {{
            __CLR4_4_1h4mh4mlb90p8ma.R.inc(22209);if ((((d == null)&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22210)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22211)==0&false))) {{
                __CLR4_4_1h4mh4mlb90p8ma.R.inc(22212);throw new NullArgumentException();
            }
            }__CLR4_4_1h4mh4mlb90p8ma.R.inc(22213);final int nRows = d.length;
            __CLR4_4_1h4mh4mlb90p8ma.R.inc(22214);if ((((nRows == 0)&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22215)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22216)==0&false))) {{
                __CLR4_4_1h4mh4mlb90p8ma.R.inc(22217);throw new NoDataException(LocalizedFormats.AT_LEAST_ONE_ROW);
            }
            }__CLR4_4_1h4mh4mlb90p8ma.R.inc(22218);final int nCols = d[0].length;
            __CLR4_4_1h4mh4mlb90p8ma.R.inc(22219);if ((((nCols == 0)&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22220)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22221)==0&false))) {{
                __CLR4_4_1h4mh4mlb90p8ma.R.inc(22222);throw new NoDataException(LocalizedFormats.AT_LEAST_ONE_COLUMN);
            }
            }__CLR4_4_1h4mh4mlb90p8ma.R.inc(22223);for (int r = 1; (((r < nRows)&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22224)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22225)==0&false)); r++) {{
                __CLR4_4_1h4mh4mlb90p8ma.R.inc(22226);if ((((d[r].length != nCols)&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22227)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22228)==0&false))) {{
                    __CLR4_4_1h4mh4mlb90p8ma.R.inc(22229);throw new DimensionMismatchException(d[r].length, nCols);
                }
            }}
            }__CLR4_4_1h4mh4mlb90p8ma.R.inc(22230);data = d;
        }
    }}finally{__CLR4_4_1h4mh4mlb90p8ma.R.flushNeeded();}}

    /**
     * Create a new (column) RealMatrix using {@code v} as the
     * data for the unique column of the created matrix.
     * The input array is copied.
     *
     * @param v Column vector holding data for new matrix.
     */
    public Array2DRowRealMatrix(final double[] v) {try{__CLR4_4_1h4mh4mlb90p8ma.R.inc(22231);
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22232);final int nRows = v.length;
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22233);data = new double[nRows][1];
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22234);for (int row = 0; (((row < nRows)&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22235)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22236)==0&false)); row++) {{
            __CLR4_4_1h4mh4mlb90p8ma.R.inc(22237);data[row][0] = v[row];
        }
    }}finally{__CLR4_4_1h4mh4mlb90p8ma.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public RealMatrix createMatrix(final int rowDimension,
                                   final int columnDimension)
        throws NotStrictlyPositiveException {try{__CLR4_4_1h4mh4mlb90p8ma.R.inc(22238);
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22239);return new Array2DRowRealMatrix(rowDimension, columnDimension);
    }finally{__CLR4_4_1h4mh4mlb90p8ma.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public RealMatrix copy() {try{__CLR4_4_1h4mh4mlb90p8ma.R.inc(22240);
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22241);return new Array2DRowRealMatrix(copyOut(), false);
    }finally{__CLR4_4_1h4mh4mlb90p8ma.R.flushNeeded();}}

    /**
     * Compute the sum of {@code this} and {@code m}.
     *
     * @param m Matrix to be added.
     * @return {@code this + m}.
     * @throws MatrixDimensionMismatchException if {@code m} is not the same
     * size as {@code this}.
     */
    public Array2DRowRealMatrix add(final Array2DRowRealMatrix m)
        throws MatrixDimensionMismatchException {try{__CLR4_4_1h4mh4mlb90p8ma.R.inc(22242);
        // Safety check.
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22243);MatrixUtils.checkAdditionCompatible(this, m);

        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22244);final int rowCount    = getRowDimension();
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22245);final int columnCount = getColumnDimension();
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22246);final double[][] outData = new double[rowCount][columnCount];
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22247);for (int row = 0; (((row < rowCount)&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22248)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22249)==0&false)); row++) {{
            __CLR4_4_1h4mh4mlb90p8ma.R.inc(22250);final double[] dataRow    = data[row];
            __CLR4_4_1h4mh4mlb90p8ma.R.inc(22251);final double[] mRow       = m.data[row];
            __CLR4_4_1h4mh4mlb90p8ma.R.inc(22252);final double[] outDataRow = outData[row];
            __CLR4_4_1h4mh4mlb90p8ma.R.inc(22253);for (int col = 0; (((col < columnCount)&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22254)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22255)==0&false)); col++) {{
                __CLR4_4_1h4mh4mlb90p8ma.R.inc(22256);outDataRow[col] = dataRow[col] + mRow[col];
            }
        }}

        }__CLR4_4_1h4mh4mlb90p8ma.R.inc(22257);return new Array2DRowRealMatrix(outData, false);
    }finally{__CLR4_4_1h4mh4mlb90p8ma.R.flushNeeded();}}

    /**
     * Returns {@code this} minus {@code m}.
     *
     * @param m Matrix to be subtracted.
     * @return {@code this - m}
     * @throws MatrixDimensionMismatchException if {@code m} is not the same
     * size as {@code this}.
     */
    public Array2DRowRealMatrix subtract(final Array2DRowRealMatrix m)
        throws MatrixDimensionMismatchException {try{__CLR4_4_1h4mh4mlb90p8ma.R.inc(22258);
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22259);MatrixUtils.checkSubtractionCompatible(this, m);

        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22260);final int rowCount    = getRowDimension();
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22261);final int columnCount = getColumnDimension();
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22262);final double[][] outData = new double[rowCount][columnCount];
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22263);for (int row = 0; (((row < rowCount)&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22264)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22265)==0&false)); row++) {{
            __CLR4_4_1h4mh4mlb90p8ma.R.inc(22266);final double[] dataRow    = data[row];
            __CLR4_4_1h4mh4mlb90p8ma.R.inc(22267);final double[] mRow       = m.data[row];
            __CLR4_4_1h4mh4mlb90p8ma.R.inc(22268);final double[] outDataRow = outData[row];
            __CLR4_4_1h4mh4mlb90p8ma.R.inc(22269);for (int col = 0; (((col < columnCount)&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22270)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22271)==0&false)); col++) {{
                __CLR4_4_1h4mh4mlb90p8ma.R.inc(22272);outDataRow[col] = dataRow[col] - mRow[col];
            }
        }}

        }__CLR4_4_1h4mh4mlb90p8ma.R.inc(22273);return new Array2DRowRealMatrix(outData, false);
    }finally{__CLR4_4_1h4mh4mlb90p8ma.R.flushNeeded();}}

    /**
     * Returns the result of postmultiplying {@code this} by {@code m}.
     *
     * @param m matrix to postmultiply by
     * @return {@code this * m}
     * @throws DimensionMismatchException if
     * {@code columnDimension(this) != rowDimension(m)}
     */
    public Array2DRowRealMatrix multiply(final Array2DRowRealMatrix m)
        throws DimensionMismatchException {try{__CLR4_4_1h4mh4mlb90p8ma.R.inc(22274);
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22275);MatrixUtils.checkMultiplicationCompatible(this, m);

        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22276);final int nRows = this.getRowDimension();
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22277);final int nCols = m.getColumnDimension();
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22278);final int nSum = this.getColumnDimension();

        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22279);final double[][] outData = new double[nRows][nCols];
        // Will hold a column of "m".
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22280);final double[] mCol = new double[nSum];
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22281);final double[][] mData = m.data;

        // Multiply.
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22282);for (int col = 0; (((col < nCols)&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22283)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22284)==0&false)); col++) {{
            // Copy all elements of column "col" of "m" so that
            // will be in contiguous memory.
            __CLR4_4_1h4mh4mlb90p8ma.R.inc(22285);for (int mRow = 0; (((mRow < nSum)&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22286)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22287)==0&false)); mRow++) {{
                __CLR4_4_1h4mh4mlb90p8ma.R.inc(22288);mCol[mRow] = mData[mRow][col];
            }

            }__CLR4_4_1h4mh4mlb90p8ma.R.inc(22289);for (int row = 0; (((row < nRows)&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22290)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22291)==0&false)); row++) {{
                __CLR4_4_1h4mh4mlb90p8ma.R.inc(22292);final double[] dataRow = data[row];
                __CLR4_4_1h4mh4mlb90p8ma.R.inc(22293);double sum = 0;
                __CLR4_4_1h4mh4mlb90p8ma.R.inc(22294);for (int i = 0; (((i < nSum)&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22295)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22296)==0&false)); i++) {{
                    __CLR4_4_1h4mh4mlb90p8ma.R.inc(22297);sum += dataRow[i] * mCol[i];
                }
                }__CLR4_4_1h4mh4mlb90p8ma.R.inc(22298);outData[row][col] = sum;
            }
        }}

        }__CLR4_4_1h4mh4mlb90p8ma.R.inc(22299);return new Array2DRowRealMatrix(outData, false);
    }finally{__CLR4_4_1h4mh4mlb90p8ma.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double[][] getData() {try{__CLR4_4_1h4mh4mlb90p8ma.R.inc(22300);
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22301);return copyOut();
    }finally{__CLR4_4_1h4mh4mlb90p8ma.R.flushNeeded();}}

    /**
     * Get a reference to the underlying data array.
     *
     * @return 2-dimensional array of entries.
     */
    public double[][] getDataRef() {try{__CLR4_4_1h4mh4mlb90p8ma.R.inc(22302);
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22303);return data;
    }finally{__CLR4_4_1h4mh4mlb90p8ma.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void setSubMatrix(final double[][] subMatrix, final int row,
                             final int column)
        throws NoDataException, OutOfRangeException,
        DimensionMismatchException, NullArgumentException {try{__CLR4_4_1h4mh4mlb90p8ma.R.inc(22304);
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22305);if ((((data == null)&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22306)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22307)==0&false))) {{
            __CLR4_4_1h4mh4mlb90p8ma.R.inc(22308);if ((((row > 0)&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22309)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22310)==0&false))) {{
                __CLR4_4_1h4mh4mlb90p8ma.R.inc(22311);throw new MathIllegalStateException(LocalizedFormats.FIRST_ROWS_NOT_INITIALIZED_YET, row);
            }
            }__CLR4_4_1h4mh4mlb90p8ma.R.inc(22312);if ((((column > 0)&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22313)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22314)==0&false))) {{
                __CLR4_4_1h4mh4mlb90p8ma.R.inc(22315);throw new MathIllegalStateException(LocalizedFormats.FIRST_COLUMNS_NOT_INITIALIZED_YET, column);
            }
            }__CLR4_4_1h4mh4mlb90p8ma.R.inc(22316);MathUtils.checkNotNull(subMatrix);
            __CLR4_4_1h4mh4mlb90p8ma.R.inc(22317);final int nRows = subMatrix.length;
            __CLR4_4_1h4mh4mlb90p8ma.R.inc(22318);if ((((nRows == 0)&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22319)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22320)==0&false))) {{
                __CLR4_4_1h4mh4mlb90p8ma.R.inc(22321);throw new NoDataException(LocalizedFormats.AT_LEAST_ONE_ROW);
            }

            }__CLR4_4_1h4mh4mlb90p8ma.R.inc(22322);final int nCols = subMatrix[0].length;
            __CLR4_4_1h4mh4mlb90p8ma.R.inc(22323);if ((((nCols == 0)&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22324)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22325)==0&false))) {{
                __CLR4_4_1h4mh4mlb90p8ma.R.inc(22326);throw new NoDataException(LocalizedFormats.AT_LEAST_ONE_COLUMN);
            }
            }__CLR4_4_1h4mh4mlb90p8ma.R.inc(22327);data = new double[subMatrix.length][nCols];
            __CLR4_4_1h4mh4mlb90p8ma.R.inc(22328);for (int i = 0; (((i < data.length)&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22329)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22330)==0&false)); ++i) {{
                __CLR4_4_1h4mh4mlb90p8ma.R.inc(22331);if ((((subMatrix[i].length != nCols)&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22332)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22333)==0&false))) {{
                    __CLR4_4_1h4mh4mlb90p8ma.R.inc(22334);throw new DimensionMismatchException(subMatrix[i].length, nCols);
                }
                }__CLR4_4_1h4mh4mlb90p8ma.R.inc(22335);System.arraycopy(subMatrix[i], 0, data[i + row], column, nCols);
            }
        }} }else {{
            __CLR4_4_1h4mh4mlb90p8ma.R.inc(22336);super.setSubMatrix(subMatrix, row, column);
        }

    }}finally{__CLR4_4_1h4mh4mlb90p8ma.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double getEntry(final int row, final int column)
        throws OutOfRangeException {try{__CLR4_4_1h4mh4mlb90p8ma.R.inc(22337);
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22338);MatrixUtils.checkMatrixIndex(this, row, column);
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22339);return data[row][column];
    }finally{__CLR4_4_1h4mh4mlb90p8ma.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void setEntry(final int row, final int column, final double value)
        throws OutOfRangeException {try{__CLR4_4_1h4mh4mlb90p8ma.R.inc(22340);
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22341);MatrixUtils.checkMatrixIndex(this, row, column);
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22342);data[row][column] = value;
    }finally{__CLR4_4_1h4mh4mlb90p8ma.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void addToEntry(final int row, final int column,
                           final double increment)
        throws OutOfRangeException {try{__CLR4_4_1h4mh4mlb90p8ma.R.inc(22343);
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22344);MatrixUtils.checkMatrixIndex(this, row, column);
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22345);data[row][column] += increment;
    }finally{__CLR4_4_1h4mh4mlb90p8ma.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void multiplyEntry(final int row, final int column,
                              final double factor)
        throws OutOfRangeException {try{__CLR4_4_1h4mh4mlb90p8ma.R.inc(22346);
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22347);MatrixUtils.checkMatrixIndex(this, row, column);
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22348);data[row][column] *= factor;
    }finally{__CLR4_4_1h4mh4mlb90p8ma.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public int getRowDimension() {try{__CLR4_4_1h4mh4mlb90p8ma.R.inc(22349);
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22350);return ((((data == null) )&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22351)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22352)==0&false))? 0 : data.length;
    }finally{__CLR4_4_1h4mh4mlb90p8ma.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public int getColumnDimension() {try{__CLR4_4_1h4mh4mlb90p8ma.R.inc(22353);
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22354);return (((((data == null) || (data[0] == null)) )&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22355)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22356)==0&false))? 0 : data[0].length;
    }finally{__CLR4_4_1h4mh4mlb90p8ma.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double[] operate(final double[] v)
        throws DimensionMismatchException {try{__CLR4_4_1h4mh4mlb90p8ma.R.inc(22357);
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22358);final int nRows = this.getRowDimension();
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22359);final int nCols = this.getColumnDimension();
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22360);if ((((v.length != nCols)&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22361)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22362)==0&false))) {{
            __CLR4_4_1h4mh4mlb90p8ma.R.inc(22363);throw new DimensionMismatchException(v.length, nCols);
        }
        }__CLR4_4_1h4mh4mlb90p8ma.R.inc(22364);final double[] out = new double[nRows];
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22365);for (int row = 0; (((row < nRows)&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22366)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22367)==0&false)); row++) {{
            __CLR4_4_1h4mh4mlb90p8ma.R.inc(22368);final double[] dataRow = data[row];
            __CLR4_4_1h4mh4mlb90p8ma.R.inc(22369);double sum = 0;
            __CLR4_4_1h4mh4mlb90p8ma.R.inc(22370);for (int i = 0; (((i < nCols)&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22371)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22372)==0&false)); i++) {{
                __CLR4_4_1h4mh4mlb90p8ma.R.inc(22373);sum += dataRow[i] * v[i];
            }
            }__CLR4_4_1h4mh4mlb90p8ma.R.inc(22374);out[row] = sum;
        }
        }__CLR4_4_1h4mh4mlb90p8ma.R.inc(22375);return out;
    }finally{__CLR4_4_1h4mh4mlb90p8ma.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double[] preMultiply(final double[] v)
        throws DimensionMismatchException {try{__CLR4_4_1h4mh4mlb90p8ma.R.inc(22376);
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22377);final int nRows = getRowDimension();
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22378);final int nCols = getColumnDimension();
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22379);if ((((v.length != nRows)&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22380)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22381)==0&false))) {{
            __CLR4_4_1h4mh4mlb90p8ma.R.inc(22382);throw new DimensionMismatchException(v.length, nRows);
        }

        }__CLR4_4_1h4mh4mlb90p8ma.R.inc(22383);final double[] out = new double[nCols];
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22384);for (int col = 0; (((col < nCols)&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22385)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22386)==0&false)); ++col) {{
            __CLR4_4_1h4mh4mlb90p8ma.R.inc(22387);double sum = 0;
            __CLR4_4_1h4mh4mlb90p8ma.R.inc(22388);for (int i = 0; (((i < nRows)&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22389)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22390)==0&false)); ++i) {{
                __CLR4_4_1h4mh4mlb90p8ma.R.inc(22391);sum += data[i][col] * v[i];
            }
            }__CLR4_4_1h4mh4mlb90p8ma.R.inc(22392);out[col] = sum;
        }

        }__CLR4_4_1h4mh4mlb90p8ma.R.inc(22393);return out;

    }finally{__CLR4_4_1h4mh4mlb90p8ma.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double walkInRowOrder(final RealMatrixChangingVisitor visitor) {try{__CLR4_4_1h4mh4mlb90p8ma.R.inc(22394);
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22395);final int rows    = getRowDimension();
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22396);final int columns = getColumnDimension();
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22397);visitor.start(rows, columns, 0, rows - 1, 0, columns - 1);
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22398);for (int i = 0; (((i < rows)&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22399)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22400)==0&false)); ++i) {{
            __CLR4_4_1h4mh4mlb90p8ma.R.inc(22401);final double[] rowI = data[i];
            __CLR4_4_1h4mh4mlb90p8ma.R.inc(22402);for (int j = 0; (((j < columns)&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22403)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22404)==0&false)); ++j) {{
                __CLR4_4_1h4mh4mlb90p8ma.R.inc(22405);rowI[j] = visitor.visit(i, j, rowI[j]);
            }
        }}
        }__CLR4_4_1h4mh4mlb90p8ma.R.inc(22406);return visitor.end();
    }finally{__CLR4_4_1h4mh4mlb90p8ma.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double walkInRowOrder(final RealMatrixPreservingVisitor visitor) {try{__CLR4_4_1h4mh4mlb90p8ma.R.inc(22407);
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22408);final int rows    = getRowDimension();
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22409);final int columns = getColumnDimension();
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22410);visitor.start(rows, columns, 0, rows - 1, 0, columns - 1);
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22411);for (int i = 0; (((i < rows)&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22412)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22413)==0&false)); ++i) {{
            __CLR4_4_1h4mh4mlb90p8ma.R.inc(22414);final double[] rowI = data[i];
            __CLR4_4_1h4mh4mlb90p8ma.R.inc(22415);for (int j = 0; (((j < columns)&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22416)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22417)==0&false)); ++j) {{
                __CLR4_4_1h4mh4mlb90p8ma.R.inc(22418);visitor.visit(i, j, rowI[j]);
            }
        }}
        }__CLR4_4_1h4mh4mlb90p8ma.R.inc(22419);return visitor.end();
    }finally{__CLR4_4_1h4mh4mlb90p8ma.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double walkInRowOrder(final RealMatrixChangingVisitor visitor,
                                 final int startRow, final int endRow,
                                 final int startColumn, final int endColumn)
        throws OutOfRangeException, NumberIsTooSmallException {try{__CLR4_4_1h4mh4mlb90p8ma.R.inc(22420);
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22421);MatrixUtils.checkSubMatrixIndex(this, startRow, endRow, startColumn, endColumn);
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22422);visitor.start(getRowDimension(), getColumnDimension(),
                      startRow, endRow, startColumn, endColumn);
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22423);for (int i = startRow; (((i <= endRow)&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22424)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22425)==0&false)); ++i) {{
            __CLR4_4_1h4mh4mlb90p8ma.R.inc(22426);final double[] rowI = data[i];
            __CLR4_4_1h4mh4mlb90p8ma.R.inc(22427);for (int j = startColumn; (((j <= endColumn)&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22428)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22429)==0&false)); ++j) {{
                __CLR4_4_1h4mh4mlb90p8ma.R.inc(22430);rowI[j] = visitor.visit(i, j, rowI[j]);
            }
        }}
        }__CLR4_4_1h4mh4mlb90p8ma.R.inc(22431);return visitor.end();
    }finally{__CLR4_4_1h4mh4mlb90p8ma.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double walkInRowOrder(final RealMatrixPreservingVisitor visitor,
                                 final int startRow, final int endRow,
                                 final int startColumn, final int endColumn)
        throws OutOfRangeException, NumberIsTooSmallException {try{__CLR4_4_1h4mh4mlb90p8ma.R.inc(22432);
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22433);MatrixUtils.checkSubMatrixIndex(this, startRow, endRow, startColumn, endColumn);
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22434);visitor.start(getRowDimension(), getColumnDimension(),
                      startRow, endRow, startColumn, endColumn);
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22435);for (int i = startRow; (((i <= endRow)&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22436)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22437)==0&false)); ++i) {{
            __CLR4_4_1h4mh4mlb90p8ma.R.inc(22438);final double[] rowI = data[i];
            __CLR4_4_1h4mh4mlb90p8ma.R.inc(22439);for (int j = startColumn; (((j <= endColumn)&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22440)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22441)==0&false)); ++j) {{
                __CLR4_4_1h4mh4mlb90p8ma.R.inc(22442);visitor.visit(i, j, rowI[j]);
            }
        }}
        }__CLR4_4_1h4mh4mlb90p8ma.R.inc(22443);return visitor.end();
    }finally{__CLR4_4_1h4mh4mlb90p8ma.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double walkInColumnOrder(final RealMatrixChangingVisitor visitor) {try{__CLR4_4_1h4mh4mlb90p8ma.R.inc(22444);
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22445);final int rows    = getRowDimension();
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22446);final int columns = getColumnDimension();
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22447);visitor.start(rows, columns, 0, rows - 1, 0, columns - 1);
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22448);for (int j = 0; (((j < columns)&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22449)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22450)==0&false)); ++j) {{
            __CLR4_4_1h4mh4mlb90p8ma.R.inc(22451);for (int i = 0; (((i < rows)&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22452)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22453)==0&false)); ++i) {{
                __CLR4_4_1h4mh4mlb90p8ma.R.inc(22454);final double[] rowI = data[i];
                __CLR4_4_1h4mh4mlb90p8ma.R.inc(22455);rowI[j] = visitor.visit(i, j, rowI[j]);
            }
        }}
        }__CLR4_4_1h4mh4mlb90p8ma.R.inc(22456);return visitor.end();
    }finally{__CLR4_4_1h4mh4mlb90p8ma.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double walkInColumnOrder(final RealMatrixPreservingVisitor visitor) {try{__CLR4_4_1h4mh4mlb90p8ma.R.inc(22457);
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22458);final int rows    = getRowDimension();
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22459);final int columns = getColumnDimension();
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22460);visitor.start(rows, columns, 0, rows - 1, 0, columns - 1);
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22461);for (int j = 0; (((j < columns)&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22462)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22463)==0&false)); ++j) {{
            __CLR4_4_1h4mh4mlb90p8ma.R.inc(22464);for (int i = 0; (((i < rows)&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22465)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22466)==0&false)); ++i) {{
                __CLR4_4_1h4mh4mlb90p8ma.R.inc(22467);visitor.visit(i, j, data[i][j]);
            }
        }}
        }__CLR4_4_1h4mh4mlb90p8ma.R.inc(22468);return visitor.end();
    }finally{__CLR4_4_1h4mh4mlb90p8ma.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double walkInColumnOrder(final RealMatrixChangingVisitor visitor,
                                    final int startRow, final int endRow,
                                    final int startColumn, final int endColumn)
        throws OutOfRangeException, NumberIsTooSmallException {try{__CLR4_4_1h4mh4mlb90p8ma.R.inc(22469);
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22470);MatrixUtils.checkSubMatrixIndex(this, startRow, endRow, startColumn, endColumn);
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22471);visitor.start(getRowDimension(), getColumnDimension(),
                      startRow, endRow, startColumn, endColumn);
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22472);for (int j = startColumn; (((j <= endColumn)&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22473)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22474)==0&false)); ++j) {{
            __CLR4_4_1h4mh4mlb90p8ma.R.inc(22475);for (int i = startRow; (((i <= endRow)&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22476)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22477)==0&false)); ++i) {{
                __CLR4_4_1h4mh4mlb90p8ma.R.inc(22478);final double[] rowI = data[i];
                __CLR4_4_1h4mh4mlb90p8ma.R.inc(22479);rowI[j] = visitor.visit(i, j, rowI[j]);
            }
        }}
        }__CLR4_4_1h4mh4mlb90p8ma.R.inc(22480);return visitor.end();
    }finally{__CLR4_4_1h4mh4mlb90p8ma.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double walkInColumnOrder(final RealMatrixPreservingVisitor visitor,
                                    final int startRow, final int endRow,
                                    final int startColumn, final int endColumn)
        throws OutOfRangeException, NumberIsTooSmallException {try{__CLR4_4_1h4mh4mlb90p8ma.R.inc(22481);
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22482);MatrixUtils.checkSubMatrixIndex(this, startRow, endRow, startColumn, endColumn);
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22483);visitor.start(getRowDimension(), getColumnDimension(),
                      startRow, endRow, startColumn, endColumn);
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22484);for (int j = startColumn; (((j <= endColumn)&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22485)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22486)==0&false)); ++j) {{
            __CLR4_4_1h4mh4mlb90p8ma.R.inc(22487);for (int i = startRow; (((i <= endRow)&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22488)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22489)==0&false)); ++i) {{
                __CLR4_4_1h4mh4mlb90p8ma.R.inc(22490);visitor.visit(i, j, data[i][j]);
            }
        }}
        }__CLR4_4_1h4mh4mlb90p8ma.R.inc(22491);return visitor.end();
    }finally{__CLR4_4_1h4mh4mlb90p8ma.R.flushNeeded();}}

    /**
     * Get a fresh copy of the underlying data array.
     *
     * @return a copy of the underlying data array.
     */
    private double[][] copyOut() {try{__CLR4_4_1h4mh4mlb90p8ma.R.inc(22492);
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22493);final int nRows = this.getRowDimension();
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22494);final double[][] out = new double[nRows][this.getColumnDimension()];
        // can't copy 2-d array in one shot, otherwise get row references
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22495);for (int i = 0; (((i < nRows)&&(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22496)!=0|true))||(__CLR4_4_1h4mh4mlb90p8ma.R.iget(22497)==0&false)); i++) {{
            __CLR4_4_1h4mh4mlb90p8ma.R.inc(22498);System.arraycopy(data[i], 0, out[i], 0, data[i].length);
        }
        }__CLR4_4_1h4mh4mlb90p8ma.R.inc(22499);return out;
    }finally{__CLR4_4_1h4mh4mlb90p8ma.R.flushNeeded();}}

    /**
     * Replace data with a fresh copy of the input array.
     *
     * @param in Data to copy.
     * @throws NoDataException if the input array is empty.
     * @throws DimensionMismatchException if the input array is not rectangular.
     * @throws NullArgumentException if the input array is {@code null}.
     */
    private void copyIn(final double[][] in)
        throws DimensionMismatchException, NoDataException, NullArgumentException {try{__CLR4_4_1h4mh4mlb90p8ma.R.inc(22500);
        __CLR4_4_1h4mh4mlb90p8ma.R.inc(22501);setSubMatrix(in, 0, 0);
    }finally{__CLR4_4_1h4mh4mlb90p8ma.R.flushNeeded();}}
}
