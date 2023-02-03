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

import org.apache.commons.math3.Field;
import org.apache.commons.math3.FieldElement;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.MathArrays;
import org.apache.commons.math3.util.MathUtils;

/**
 * Implementation of FieldMatrix<T> using a {@link FieldElement}[][] array to store entries.
 * <p>
 * As specified in the {@link FieldMatrix} interface, matrix element indexing
 * is 0-based -- e.g., <code>getEntry(0, 0)</code>
 * returns the element in the first row, first column of the matrix.</li></ul>
 * </p>
 *
 * @param <T> the type of the field elements
 * @version $Id$
 */
public class Array2DRowFieldMatrix<T extends FieldElement<T>>
    extends AbstractFieldMatrix<T>
    implements Serializable {public static class __CLR4_4_1gw1gw1lb90p8lp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,22198,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Serializable version identifier */
    private static final long serialVersionUID = 7260756672015356458L;
    /** Entries of the matrix */
    private T[][] data;

    /**
     * Creates a matrix with no data
     * @param field field to which the elements belong
     */
    public Array2DRowFieldMatrix(final Field<T> field) {
        super(field);__CLR4_4_1gw1gw1lb90p8lp.R.inc(21890);try{__CLR4_4_1gw1gw1lb90p8lp.R.inc(21889);
    }finally{__CLR4_4_1gw1gw1lb90p8lp.R.flushNeeded();}}

    /**
     * Create a new {@code FieldMatrix<T>} with the supplied row and column dimensions.
     *
     * @param field Field to which the elements belong.
     * @param rowDimension Number of rows in the new matrix.
     * @param columnDimension Number of columns in the new matrix.
     * @throws NotStrictlyPositiveException if row or column dimension is not positive.
     */
    public Array2DRowFieldMatrix(final Field<T> field, final int rowDimension,
                                 final int columnDimension)
        throws NotStrictlyPositiveException {
        super(field, rowDimension, columnDimension);__CLR4_4_1gw1gw1lb90p8lp.R.inc(21892);try{__CLR4_4_1gw1gw1lb90p8lp.R.inc(21891);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(21893);data = MathArrays.buildArray(field, rowDimension, columnDimension);
    }finally{__CLR4_4_1gw1gw1lb90p8lp.R.flushNeeded();}}

    /**
     * Create a new {@code FieldMatrix<T>} using the input array as the underlying
     * data array.
     * <p>The input array is copied, not referenced. This constructor has
     * the same effect as calling {@link #Array2DRowFieldMatrix(FieldElement[][], boolean)}
     * with the second argument set to {@code true}.</p>
     *
     * @param d Data for the new matrix.
     * @throws DimensionMismatchException if {@code d} is not rectangular.
     * @throws NullArgumentException if {@code d} is {@code null}.
     * @throws NoDataException if there are not at least one row and one column.
     * @see #Array2DRowFieldMatrix(FieldElement[][], boolean)
     */
    public Array2DRowFieldMatrix(final T[][] d)
        throws DimensionMismatchException, NullArgumentException,
        NoDataException {
        this(extractField(d), d);__CLR4_4_1gw1gw1lb90p8lp.R.inc(21895);try{__CLR4_4_1gw1gw1lb90p8lp.R.inc(21894);
    }finally{__CLR4_4_1gw1gw1lb90p8lp.R.flushNeeded();}}

    /**
     * Create a new {@code FieldMatrix<T>} using the input array as the underlying
     * data array.
     * <p>The input array is copied, not referenced. This constructor has
     * the same effect as calling {@link #Array2DRowFieldMatrix(FieldElement[][], boolean)}
     * with the second argument set to {@code true}.</p>
     *
     * @param field Field to which the elements belong.
     * @param d Data for the new matrix.
     * @throws DimensionMismatchException if {@code d} is not rectangular.
     * @throws NullArgumentException if {@code d} is {@code null}.
     * @throws NoDataException if there are not at least one row and one column.
     * @see #Array2DRowFieldMatrix(FieldElement[][], boolean)
     */
    public Array2DRowFieldMatrix(final Field<T> field, final T[][] d)
        throws DimensionMismatchException, NullArgumentException,
        NoDataException {
        super(field);__CLR4_4_1gw1gw1lb90p8lp.R.inc(21897);try{__CLR4_4_1gw1gw1lb90p8lp.R.inc(21896);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(21898);copyIn(d);
    }finally{__CLR4_4_1gw1gw1lb90p8lp.R.flushNeeded();}}

    /**
     * Create a new {@code FieldMatrix<T>} using the input array as the underlying
     * data array.
     * <p>If an array is built specially in order to be embedded in a
     * {@code FieldMatrix<T>} and not used directly, the {@code copyArray} may be
     * set to {@code false}. This will prevent the copying and improve
     * performance as no new array will be built and no data will be copied.</p>
     *
     * @param d Data for the new matrix.
     * @param copyArray Whether to copy or reference the input array.
     * @throws DimensionMismatchException if {@code d} is not rectangular.
     * @throws NoDataException if there are not at least one row and one column.
     * @throws NullArgumentException if {@code d} is {@code null}.
     * @see #Array2DRowFieldMatrix(FieldElement[][])
     */
    public Array2DRowFieldMatrix(final T[][] d, final boolean copyArray)
        throws DimensionMismatchException, NoDataException,
        NullArgumentException {
        this(extractField(d), d, copyArray);__CLR4_4_1gw1gw1lb90p8lp.R.inc(21900);try{__CLR4_4_1gw1gw1lb90p8lp.R.inc(21899);
    }finally{__CLR4_4_1gw1gw1lb90p8lp.R.flushNeeded();}}

    /**
     * Create a new {@code FieldMatrix<T>} using the input array as the underlying
     * data array.
     * <p>If an array is built specially in order to be embedded in a
     * {@code FieldMatrix<T>} and not used directly, the {@code copyArray} may be
     * set to {@code false}. This will prevent the copying and improve
     * performance as no new array will be built and no data will be copied.</p>
     *
     * @param field Field to which the elements belong.
     * @param d Data for the new matrix.
     * @param copyArray Whether to copy or reference the input array.
     * @throws DimensionMismatchException if {@code d} is not rectangular.
     * @throws NoDataException if there are not at least one row and one column.
     * @throws NullArgumentException if {@code d} is {@code null}.
     * @see #Array2DRowFieldMatrix(FieldElement[][])
     */
    public Array2DRowFieldMatrix(final Field<T> field, final T[][] d, final boolean copyArray)
        throws DimensionMismatchException, NoDataException, NullArgumentException {
        super(field);__CLR4_4_1gw1gw1lb90p8lp.R.inc(21902);try{__CLR4_4_1gw1gw1lb90p8lp.R.inc(21901);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(21903);if ((((copyArray)&&(__CLR4_4_1gw1gw1lb90p8lp.R.iget(21904)!=0|true))||(__CLR4_4_1gw1gw1lb90p8lp.R.iget(21905)==0&false))) {{
            __CLR4_4_1gw1gw1lb90p8lp.R.inc(21906);copyIn(d);
        } }else {{
            __CLR4_4_1gw1gw1lb90p8lp.R.inc(21907);MathUtils.checkNotNull(d);
            __CLR4_4_1gw1gw1lb90p8lp.R.inc(21908);final int nRows = d.length;
            __CLR4_4_1gw1gw1lb90p8lp.R.inc(21909);if ((((nRows == 0)&&(__CLR4_4_1gw1gw1lb90p8lp.R.iget(21910)!=0|true))||(__CLR4_4_1gw1gw1lb90p8lp.R.iget(21911)==0&false))) {{
                __CLR4_4_1gw1gw1lb90p8lp.R.inc(21912);throw new NoDataException(LocalizedFormats.AT_LEAST_ONE_ROW);
            }
            }__CLR4_4_1gw1gw1lb90p8lp.R.inc(21913);final int nCols = d[0].length;
            __CLR4_4_1gw1gw1lb90p8lp.R.inc(21914);if ((((nCols == 0)&&(__CLR4_4_1gw1gw1lb90p8lp.R.iget(21915)!=0|true))||(__CLR4_4_1gw1gw1lb90p8lp.R.iget(21916)==0&false))) {{
                __CLR4_4_1gw1gw1lb90p8lp.R.inc(21917);throw new NoDataException(LocalizedFormats.AT_LEAST_ONE_COLUMN);
            }
            }__CLR4_4_1gw1gw1lb90p8lp.R.inc(21918);for (int r = 1; (((r < nRows)&&(__CLR4_4_1gw1gw1lb90p8lp.R.iget(21919)!=0|true))||(__CLR4_4_1gw1gw1lb90p8lp.R.iget(21920)==0&false)); r++) {{
                __CLR4_4_1gw1gw1lb90p8lp.R.inc(21921);if ((((d[r].length != nCols)&&(__CLR4_4_1gw1gw1lb90p8lp.R.iget(21922)!=0|true))||(__CLR4_4_1gw1gw1lb90p8lp.R.iget(21923)==0&false))) {{
                    __CLR4_4_1gw1gw1lb90p8lp.R.inc(21924);throw new DimensionMismatchException(nCols, d[r].length);
                }
            }}
            }__CLR4_4_1gw1gw1lb90p8lp.R.inc(21925);data = d;
        }
    }}finally{__CLR4_4_1gw1gw1lb90p8lp.R.flushNeeded();}}

    /**
     * Create a new (column) {@code FieldMatrix<T>} using {@code v} as the
     * data for the unique column of the created matrix.
     * The input array is copied.
     *
     * @param v Column vector holding data for new matrix.
     * @throws NoDataException if v is empty
     */
    public Array2DRowFieldMatrix(final T[] v) throws NoDataException {
        this(extractField(v), v);__CLR4_4_1gw1gw1lb90p8lp.R.inc(21927);try{__CLR4_4_1gw1gw1lb90p8lp.R.inc(21926);
    }finally{__CLR4_4_1gw1gw1lb90p8lp.R.flushNeeded();}}

    /**
     * Create a new (column) {@code FieldMatrix<T>} using {@code v} as the
     * data for the unique column of the created matrix.
     * The input array is copied.
     *
     * @param field Field to which the elements belong.
     * @param v Column vector holding data for new matrix.
     */
    public Array2DRowFieldMatrix(final Field<T> field, final T[] v) {
        super(field);__CLR4_4_1gw1gw1lb90p8lp.R.inc(21929);try{__CLR4_4_1gw1gw1lb90p8lp.R.inc(21928);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(21930);final int nRows = v.length;
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(21931);data = MathArrays.buildArray(getField(), nRows, 1);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(21932);for (int row = 0; (((row < nRows)&&(__CLR4_4_1gw1gw1lb90p8lp.R.iget(21933)!=0|true))||(__CLR4_4_1gw1gw1lb90p8lp.R.iget(21934)==0&false)); row++) {{
            __CLR4_4_1gw1gw1lb90p8lp.R.inc(21935);data[row][0] = v[row];
        }
    }}finally{__CLR4_4_1gw1gw1lb90p8lp.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public FieldMatrix<T> createMatrix(final int rowDimension,
                                       final int columnDimension)
        throws NotStrictlyPositiveException {try{__CLR4_4_1gw1gw1lb90p8lp.R.inc(21936);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(21937);return new Array2DRowFieldMatrix<T>(getField(), rowDimension, columnDimension);
    }finally{__CLR4_4_1gw1gw1lb90p8lp.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public FieldMatrix<T> copy() {try{__CLR4_4_1gw1gw1lb90p8lp.R.inc(21938);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(21939);return new Array2DRowFieldMatrix<T>(getField(), copyOut(), false);
    }finally{__CLR4_4_1gw1gw1lb90p8lp.R.flushNeeded();}}

    /**
     * Add {@code m} to this matrix.
     *
     * @param m Matrix to be added.
     * @return {@code this} + m.
     * @throws MatrixDimensionMismatchException if {@code m} is not the same
     * size as this matrix.
     */
    public Array2DRowFieldMatrix<T> add(final Array2DRowFieldMatrix<T> m)
        throws MatrixDimensionMismatchException {try{__CLR4_4_1gw1gw1lb90p8lp.R.inc(21940);
        // safety check
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(21941);checkAdditionCompatible(m);

        __CLR4_4_1gw1gw1lb90p8lp.R.inc(21942);final int rowCount    = getRowDimension();
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(21943);final int columnCount = getColumnDimension();
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(21944);final T[][] outData = MathArrays.buildArray(getField(), rowCount, columnCount);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(21945);for (int row = 0; (((row < rowCount)&&(__CLR4_4_1gw1gw1lb90p8lp.R.iget(21946)!=0|true))||(__CLR4_4_1gw1gw1lb90p8lp.R.iget(21947)==0&false)); row++) {{
            __CLR4_4_1gw1gw1lb90p8lp.R.inc(21948);final T[] dataRow    = data[row];
            __CLR4_4_1gw1gw1lb90p8lp.R.inc(21949);final T[] mRow       = m.data[row];
            __CLR4_4_1gw1gw1lb90p8lp.R.inc(21950);final T[] outDataRow = outData[row];
            __CLR4_4_1gw1gw1lb90p8lp.R.inc(21951);for (int col = 0; (((col < columnCount)&&(__CLR4_4_1gw1gw1lb90p8lp.R.iget(21952)!=0|true))||(__CLR4_4_1gw1gw1lb90p8lp.R.iget(21953)==0&false)); col++) {{
                __CLR4_4_1gw1gw1lb90p8lp.R.inc(21954);outDataRow[col] = dataRow[col].add(mRow[col]);
            }
        }}

        }__CLR4_4_1gw1gw1lb90p8lp.R.inc(21955);return new Array2DRowFieldMatrix<T>(getField(), outData, false);
    }finally{__CLR4_4_1gw1gw1lb90p8lp.R.flushNeeded();}}

    /**
     * Subtract {@code m} from this matrix.
     *
     * @param m Matrix to be subtracted.
     * @return {@code this} + m.
     * @throws MatrixDimensionMismatchException if {@code m} is not the same
     * size as this matrix.
     */
    public Array2DRowFieldMatrix<T> subtract(final Array2DRowFieldMatrix<T> m)
        throws MatrixDimensionMismatchException {try{__CLR4_4_1gw1gw1lb90p8lp.R.inc(21956);
        // safety check
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(21957);checkSubtractionCompatible(m);

        __CLR4_4_1gw1gw1lb90p8lp.R.inc(21958);final int rowCount    = getRowDimension();
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(21959);final int columnCount = getColumnDimension();
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(21960);final T[][] outData = MathArrays.buildArray(getField(), rowCount, columnCount);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(21961);for (int row = 0; (((row < rowCount)&&(__CLR4_4_1gw1gw1lb90p8lp.R.iget(21962)!=0|true))||(__CLR4_4_1gw1gw1lb90p8lp.R.iget(21963)==0&false)); row++) {{
            __CLR4_4_1gw1gw1lb90p8lp.R.inc(21964);final T[] dataRow    = data[row];
            __CLR4_4_1gw1gw1lb90p8lp.R.inc(21965);final T[] mRow       = m.data[row];
            __CLR4_4_1gw1gw1lb90p8lp.R.inc(21966);final T[] outDataRow = outData[row];
            __CLR4_4_1gw1gw1lb90p8lp.R.inc(21967);for (int col = 0; (((col < columnCount)&&(__CLR4_4_1gw1gw1lb90p8lp.R.iget(21968)!=0|true))||(__CLR4_4_1gw1gw1lb90p8lp.R.iget(21969)==0&false)); col++) {{
                __CLR4_4_1gw1gw1lb90p8lp.R.inc(21970);outDataRow[col] = dataRow[col].subtract(mRow[col]);
            }
        }}

        }__CLR4_4_1gw1gw1lb90p8lp.R.inc(21971);return new Array2DRowFieldMatrix<T>(getField(), outData, false);

    }finally{__CLR4_4_1gw1gw1lb90p8lp.R.flushNeeded();}}

    /**
     * Postmultiplying this matrix by {@code m}.
     *
     * @param m Matrix to postmultiply by.
     * @return {@code this} * m.
     * @throws DimensionMismatchException if the number of columns of this
     * matrix is not equal to the number of rows of {@code m}.
     */
    public Array2DRowFieldMatrix<T> multiply(final Array2DRowFieldMatrix<T> m)
        throws DimensionMismatchException {try{__CLR4_4_1gw1gw1lb90p8lp.R.inc(21972);
        // safety check
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(21973);checkMultiplicationCompatible(m);

        __CLR4_4_1gw1gw1lb90p8lp.R.inc(21974);final int nRows = this.getRowDimension();
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(21975);final int nCols = m.getColumnDimension();
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(21976);final int nSum = this.getColumnDimension();
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(21977);final T[][] outData = MathArrays.buildArray(getField(), nRows, nCols);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(21978);for (int row = 0; (((row < nRows)&&(__CLR4_4_1gw1gw1lb90p8lp.R.iget(21979)!=0|true))||(__CLR4_4_1gw1gw1lb90p8lp.R.iget(21980)==0&false)); row++) {{
            __CLR4_4_1gw1gw1lb90p8lp.R.inc(21981);final T[] dataRow    = data[row];
            __CLR4_4_1gw1gw1lb90p8lp.R.inc(21982);final T[] outDataRow = outData[row];
            __CLR4_4_1gw1gw1lb90p8lp.R.inc(21983);for (int col = 0; (((col < nCols)&&(__CLR4_4_1gw1gw1lb90p8lp.R.iget(21984)!=0|true))||(__CLR4_4_1gw1gw1lb90p8lp.R.iget(21985)==0&false)); col++) {{
                __CLR4_4_1gw1gw1lb90p8lp.R.inc(21986);T sum = getField().getZero();
                __CLR4_4_1gw1gw1lb90p8lp.R.inc(21987);for (int i = 0; (((i < nSum)&&(__CLR4_4_1gw1gw1lb90p8lp.R.iget(21988)!=0|true))||(__CLR4_4_1gw1gw1lb90p8lp.R.iget(21989)==0&false)); i++) {{
                    __CLR4_4_1gw1gw1lb90p8lp.R.inc(21990);sum = sum.add(dataRow[i].multiply(m.data[i][col]));
                }
                }__CLR4_4_1gw1gw1lb90p8lp.R.inc(21991);outDataRow[col] = sum;
            }
        }}

        }__CLR4_4_1gw1gw1lb90p8lp.R.inc(21992);return new Array2DRowFieldMatrix<T>(getField(), outData, false);

    }finally{__CLR4_4_1gw1gw1lb90p8lp.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public T[][] getData() {try{__CLR4_4_1gw1gw1lb90p8lp.R.inc(21993);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(21994);return copyOut();
    }finally{__CLR4_4_1gw1gw1lb90p8lp.R.flushNeeded();}}

    /**
     * Get a reference to the underlying data array.
     * This methods returns internal data, <strong>not</strong> fresh copy of it.
     *
     * @return the 2-dimensional array of entries.
     */
    public T[][] getDataRef() {try{__CLR4_4_1gw1gw1lb90p8lp.R.inc(21995);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(21996);return data;
    }finally{__CLR4_4_1gw1gw1lb90p8lp.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void setSubMatrix(final T[][] subMatrix, final int row,
                             final int column)
        throws OutOfRangeException, NullArgumentException, NoDataException,
        DimensionMismatchException {try{__CLR4_4_1gw1gw1lb90p8lp.R.inc(21997);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(21998);if ((((data == null)&&(__CLR4_4_1gw1gw1lb90p8lp.R.iget(21999)!=0|true))||(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22000)==0&false))) {{
            __CLR4_4_1gw1gw1lb90p8lp.R.inc(22001);if ((((row > 0)&&(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22002)!=0|true))||(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22003)==0&false))) {{
                __CLR4_4_1gw1gw1lb90p8lp.R.inc(22004);throw new MathIllegalStateException(LocalizedFormats.FIRST_ROWS_NOT_INITIALIZED_YET, row);
            }
            }__CLR4_4_1gw1gw1lb90p8lp.R.inc(22005);if ((((column > 0)&&(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22006)!=0|true))||(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22007)==0&false))) {{
                __CLR4_4_1gw1gw1lb90p8lp.R.inc(22008);throw new MathIllegalStateException(LocalizedFormats.FIRST_COLUMNS_NOT_INITIALIZED_YET, column);
            }
            }__CLR4_4_1gw1gw1lb90p8lp.R.inc(22009);final int nRows = subMatrix.length;
            __CLR4_4_1gw1gw1lb90p8lp.R.inc(22010);if ((((nRows == 0)&&(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22011)!=0|true))||(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22012)==0&false))) {{
                __CLR4_4_1gw1gw1lb90p8lp.R.inc(22013);throw new NoDataException(LocalizedFormats.AT_LEAST_ONE_ROW);
            }

            }__CLR4_4_1gw1gw1lb90p8lp.R.inc(22014);final int nCols = subMatrix[0].length;
            __CLR4_4_1gw1gw1lb90p8lp.R.inc(22015);if ((((nCols == 0)&&(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22016)!=0|true))||(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22017)==0&false))) {{
                __CLR4_4_1gw1gw1lb90p8lp.R.inc(22018);throw new NoDataException(LocalizedFormats.AT_LEAST_ONE_COLUMN);
            }
            }__CLR4_4_1gw1gw1lb90p8lp.R.inc(22019);data = MathArrays.buildArray(getField(), subMatrix.length, nCols);
            __CLR4_4_1gw1gw1lb90p8lp.R.inc(22020);for (int i = 0; (((i < data.length)&&(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22021)!=0|true))||(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22022)==0&false)); ++i) {{
                __CLR4_4_1gw1gw1lb90p8lp.R.inc(22023);if ((((subMatrix[i].length != nCols)&&(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22024)!=0|true))||(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22025)==0&false))) {{
                    __CLR4_4_1gw1gw1lb90p8lp.R.inc(22026);throw new DimensionMismatchException(nCols, subMatrix[i].length);
                }
                }__CLR4_4_1gw1gw1lb90p8lp.R.inc(22027);System.arraycopy(subMatrix[i], 0, data[i + row], column, nCols);
            }
        }} }else {{
            __CLR4_4_1gw1gw1lb90p8lp.R.inc(22028);super.setSubMatrix(subMatrix, row, column);
        }

    }}finally{__CLR4_4_1gw1gw1lb90p8lp.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public T getEntry(final int row, final int column)
        throws OutOfRangeException {try{__CLR4_4_1gw1gw1lb90p8lp.R.inc(22029);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22030);checkRowIndex(row);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22031);checkColumnIndex(column);

        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22032);return data[row][column];
    }finally{__CLR4_4_1gw1gw1lb90p8lp.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void setEntry(final int row, final int column, final T value)
        throws OutOfRangeException {try{__CLR4_4_1gw1gw1lb90p8lp.R.inc(22033);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22034);checkRowIndex(row);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22035);checkColumnIndex(column);

        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22036);data[row][column] = value;
    }finally{__CLR4_4_1gw1gw1lb90p8lp.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void addToEntry(final int row, final int column, final T increment)
        throws OutOfRangeException {try{__CLR4_4_1gw1gw1lb90p8lp.R.inc(22037);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22038);checkRowIndex(row);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22039);checkColumnIndex(column);

        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22040);data[row][column] = data[row][column].add(increment);
    }finally{__CLR4_4_1gw1gw1lb90p8lp.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void multiplyEntry(final int row, final int column, final T factor)
        throws OutOfRangeException {try{__CLR4_4_1gw1gw1lb90p8lp.R.inc(22041);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22042);checkRowIndex(row);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22043);checkColumnIndex(column);

        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22044);data[row][column] = data[row][column].multiply(factor);
    }finally{__CLR4_4_1gw1gw1lb90p8lp.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public int getRowDimension() {try{__CLR4_4_1gw1gw1lb90p8lp.R.inc(22045);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22046);return ((((data == null) )&&(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22047)!=0|true))||(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22048)==0&false))? 0 : data.length;
    }finally{__CLR4_4_1gw1gw1lb90p8lp.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public int getColumnDimension() {try{__CLR4_4_1gw1gw1lb90p8lp.R.inc(22049);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22050);return (((((data == null) || (data[0] == null)) )&&(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22051)!=0|true))||(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22052)==0&false))? 0 : data[0].length;
    }finally{__CLR4_4_1gw1gw1lb90p8lp.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public T[] operate(final T[] v) throws DimensionMismatchException {try{__CLR4_4_1gw1gw1lb90p8lp.R.inc(22053);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22054);final int nRows = this.getRowDimension();
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22055);final int nCols = this.getColumnDimension();
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22056);if ((((v.length != nCols)&&(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22057)!=0|true))||(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22058)==0&false))) {{
            __CLR4_4_1gw1gw1lb90p8lp.R.inc(22059);throw new DimensionMismatchException(v.length, nCols);
        }
        }__CLR4_4_1gw1gw1lb90p8lp.R.inc(22060);final T[] out = MathArrays.buildArray(getField(), nRows);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22061);for (int row = 0; (((row < nRows)&&(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22062)!=0|true))||(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22063)==0&false)); row++) {{
            __CLR4_4_1gw1gw1lb90p8lp.R.inc(22064);final T[] dataRow = data[row];
            __CLR4_4_1gw1gw1lb90p8lp.R.inc(22065);T sum = getField().getZero();
            __CLR4_4_1gw1gw1lb90p8lp.R.inc(22066);for (int i = 0; (((i < nCols)&&(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22067)!=0|true))||(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22068)==0&false)); i++) {{
                __CLR4_4_1gw1gw1lb90p8lp.R.inc(22069);sum = sum.add(dataRow[i].multiply(v[i]));
            }
            }__CLR4_4_1gw1gw1lb90p8lp.R.inc(22070);out[row] = sum;
        }
        }__CLR4_4_1gw1gw1lb90p8lp.R.inc(22071);return out;
    }finally{__CLR4_4_1gw1gw1lb90p8lp.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public T[] preMultiply(final T[] v) throws DimensionMismatchException {try{__CLR4_4_1gw1gw1lb90p8lp.R.inc(22072);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22073);final int nRows = getRowDimension();
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22074);final int nCols = getColumnDimension();
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22075);if ((((v.length != nRows)&&(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22076)!=0|true))||(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22077)==0&false))) {{
            __CLR4_4_1gw1gw1lb90p8lp.R.inc(22078);throw new DimensionMismatchException(v.length, nRows);
        }

        }__CLR4_4_1gw1gw1lb90p8lp.R.inc(22079);final T[] out = MathArrays.buildArray(getField(), nCols);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22080);for (int col = 0; (((col < nCols)&&(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22081)!=0|true))||(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22082)==0&false)); ++col) {{
            __CLR4_4_1gw1gw1lb90p8lp.R.inc(22083);T sum = getField().getZero();
            __CLR4_4_1gw1gw1lb90p8lp.R.inc(22084);for (int i = 0; (((i < nRows)&&(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22085)!=0|true))||(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22086)==0&false)); ++i) {{
                __CLR4_4_1gw1gw1lb90p8lp.R.inc(22087);sum = sum.add(data[i][col].multiply(v[i]));
            }
            }__CLR4_4_1gw1gw1lb90p8lp.R.inc(22088);out[col] = sum;
        }

        }__CLR4_4_1gw1gw1lb90p8lp.R.inc(22089);return out;
    }finally{__CLR4_4_1gw1gw1lb90p8lp.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public T walkInRowOrder(final FieldMatrixChangingVisitor<T> visitor) {try{__CLR4_4_1gw1gw1lb90p8lp.R.inc(22090);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22091);final int rows    = getRowDimension();
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22092);final int columns = getColumnDimension();
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22093);visitor.start(rows, columns, 0, rows - 1, 0, columns - 1);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22094);for (int i = 0; (((i < rows)&&(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22095)!=0|true))||(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22096)==0&false)); ++i) {{
            __CLR4_4_1gw1gw1lb90p8lp.R.inc(22097);final T[] rowI = data[i];
            __CLR4_4_1gw1gw1lb90p8lp.R.inc(22098);for (int j = 0; (((j < columns)&&(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22099)!=0|true))||(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22100)==0&false)); ++j) {{
                __CLR4_4_1gw1gw1lb90p8lp.R.inc(22101);rowI[j] = visitor.visit(i, j, rowI[j]);
            }
        }}
        }__CLR4_4_1gw1gw1lb90p8lp.R.inc(22102);return visitor.end();
    }finally{__CLR4_4_1gw1gw1lb90p8lp.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public T walkInRowOrder(final FieldMatrixPreservingVisitor<T> visitor) {try{__CLR4_4_1gw1gw1lb90p8lp.R.inc(22103);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22104);final int rows    = getRowDimension();
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22105);final int columns = getColumnDimension();
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22106);visitor.start(rows, columns, 0, rows - 1, 0, columns - 1);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22107);for (int i = 0; (((i < rows)&&(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22108)!=0|true))||(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22109)==0&false)); ++i) {{
            __CLR4_4_1gw1gw1lb90p8lp.R.inc(22110);final T[] rowI = data[i];
            __CLR4_4_1gw1gw1lb90p8lp.R.inc(22111);for (int j = 0; (((j < columns)&&(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22112)!=0|true))||(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22113)==0&false)); ++j) {{
                __CLR4_4_1gw1gw1lb90p8lp.R.inc(22114);visitor.visit(i, j, rowI[j]);
            }
        }}
        }__CLR4_4_1gw1gw1lb90p8lp.R.inc(22115);return visitor.end();
    }finally{__CLR4_4_1gw1gw1lb90p8lp.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public T walkInRowOrder(final FieldMatrixChangingVisitor<T> visitor,
                            final int startRow, final int endRow,
                            final int startColumn, final int endColumn)
        throws OutOfRangeException, NumberIsTooSmallException {try{__CLR4_4_1gw1gw1lb90p8lp.R.inc(22116);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22117);checkSubMatrixIndex(startRow, endRow, startColumn, endColumn);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22118);visitor.start(getRowDimension(), getColumnDimension(),
                      startRow, endRow, startColumn, endColumn);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22119);for (int i = startRow; (((i <= endRow)&&(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22120)!=0|true))||(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22121)==0&false)); ++i) {{
            __CLR4_4_1gw1gw1lb90p8lp.R.inc(22122);final T[] rowI = data[i];
            __CLR4_4_1gw1gw1lb90p8lp.R.inc(22123);for (int j = startColumn; (((j <= endColumn)&&(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22124)!=0|true))||(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22125)==0&false)); ++j) {{
                __CLR4_4_1gw1gw1lb90p8lp.R.inc(22126);rowI[j] = visitor.visit(i, j, rowI[j]);
            }
        }}
        }__CLR4_4_1gw1gw1lb90p8lp.R.inc(22127);return visitor.end();
    }finally{__CLR4_4_1gw1gw1lb90p8lp.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public T walkInRowOrder(final FieldMatrixPreservingVisitor<T> visitor,
                            final int startRow, final int endRow,
                            final int startColumn, final int endColumn)
        throws OutOfRangeException, NumberIsTooSmallException {try{__CLR4_4_1gw1gw1lb90p8lp.R.inc(22128);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22129);checkSubMatrixIndex(startRow, endRow, startColumn, endColumn);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22130);visitor.start(getRowDimension(), getColumnDimension(),
                      startRow, endRow, startColumn, endColumn);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22131);for (int i = startRow; (((i <= endRow)&&(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22132)!=0|true))||(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22133)==0&false)); ++i) {{
            __CLR4_4_1gw1gw1lb90p8lp.R.inc(22134);final T[] rowI = data[i];
            __CLR4_4_1gw1gw1lb90p8lp.R.inc(22135);for (int j = startColumn; (((j <= endColumn)&&(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22136)!=0|true))||(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22137)==0&false)); ++j) {{
                __CLR4_4_1gw1gw1lb90p8lp.R.inc(22138);visitor.visit(i, j, rowI[j]);
            }
        }}
        }__CLR4_4_1gw1gw1lb90p8lp.R.inc(22139);return visitor.end();
    }finally{__CLR4_4_1gw1gw1lb90p8lp.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public T walkInColumnOrder(final FieldMatrixChangingVisitor<T> visitor) {try{__CLR4_4_1gw1gw1lb90p8lp.R.inc(22140);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22141);final int rows    = getRowDimension();
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22142);final int columns = getColumnDimension();
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22143);visitor.start(rows, columns, 0, rows - 1, 0, columns - 1);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22144);for (int j = 0; (((j < columns)&&(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22145)!=0|true))||(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22146)==0&false)); ++j) {{
            __CLR4_4_1gw1gw1lb90p8lp.R.inc(22147);for (int i = 0; (((i < rows)&&(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22148)!=0|true))||(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22149)==0&false)); ++i) {{
                __CLR4_4_1gw1gw1lb90p8lp.R.inc(22150);final T[] rowI = data[i];
                __CLR4_4_1gw1gw1lb90p8lp.R.inc(22151);rowI[j] = visitor.visit(i, j, rowI[j]);
            }
        }}
        }__CLR4_4_1gw1gw1lb90p8lp.R.inc(22152);return visitor.end();
    }finally{__CLR4_4_1gw1gw1lb90p8lp.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public T walkInColumnOrder(final FieldMatrixPreservingVisitor<T> visitor) {try{__CLR4_4_1gw1gw1lb90p8lp.R.inc(22153);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22154);final int rows    = getRowDimension();
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22155);final int columns = getColumnDimension();
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22156);visitor.start(rows, columns, 0, rows - 1, 0, columns - 1);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22157);for (int j = 0; (((j < columns)&&(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22158)!=0|true))||(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22159)==0&false)); ++j) {{
            __CLR4_4_1gw1gw1lb90p8lp.R.inc(22160);for (int i = 0; (((i < rows)&&(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22161)!=0|true))||(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22162)==0&false)); ++i) {{
                __CLR4_4_1gw1gw1lb90p8lp.R.inc(22163);visitor.visit(i, j, data[i][j]);
            }
        }}
        }__CLR4_4_1gw1gw1lb90p8lp.R.inc(22164);return visitor.end();
    }finally{__CLR4_4_1gw1gw1lb90p8lp.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public T walkInColumnOrder(final FieldMatrixChangingVisitor<T> visitor,
                               final int startRow, final int endRow,
                               final int startColumn, final int endColumn)
        throws OutOfRangeException, NumberIsTooSmallException {try{__CLR4_4_1gw1gw1lb90p8lp.R.inc(22165);
    __CLR4_4_1gw1gw1lb90p8lp.R.inc(22166);checkSubMatrixIndex(startRow, endRow, startColumn, endColumn);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22167);visitor.start(getRowDimension(), getColumnDimension(),
                      startRow, endRow, startColumn, endColumn);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22168);for (int j = startColumn; (((j <= endColumn)&&(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22169)!=0|true))||(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22170)==0&false)); ++j) {{
            __CLR4_4_1gw1gw1lb90p8lp.R.inc(22171);for (int i = startRow; (((i <= endRow)&&(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22172)!=0|true))||(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22173)==0&false)); ++i) {{
                __CLR4_4_1gw1gw1lb90p8lp.R.inc(22174);final T[] rowI = data[i];
                __CLR4_4_1gw1gw1lb90p8lp.R.inc(22175);rowI[j] = visitor.visit(i, j, rowI[j]);
            }
        }}
        }__CLR4_4_1gw1gw1lb90p8lp.R.inc(22176);return visitor.end();
    }finally{__CLR4_4_1gw1gw1lb90p8lp.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public T walkInColumnOrder(final FieldMatrixPreservingVisitor<T> visitor,
                               final int startRow, final int endRow,
                               final int startColumn, final int endColumn)
        throws OutOfRangeException, NumberIsTooSmallException {try{__CLR4_4_1gw1gw1lb90p8lp.R.inc(22177);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22178);checkSubMatrixIndex(startRow, endRow, startColumn, endColumn);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22179);visitor.start(getRowDimension(), getColumnDimension(),
                      startRow, endRow, startColumn, endColumn);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22180);for (int j = startColumn; (((j <= endColumn)&&(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22181)!=0|true))||(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22182)==0&false)); ++j) {{
            __CLR4_4_1gw1gw1lb90p8lp.R.inc(22183);for (int i = startRow; (((i <= endRow)&&(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22184)!=0|true))||(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22185)==0&false)); ++i) {{
                __CLR4_4_1gw1gw1lb90p8lp.R.inc(22186);visitor.visit(i, j, data[i][j]);
            }
        }}
        }__CLR4_4_1gw1gw1lb90p8lp.R.inc(22187);return visitor.end();
    }finally{__CLR4_4_1gw1gw1lb90p8lp.R.flushNeeded();}}

    /**
     * Get a fresh copy of the underlying data array.
     *
     * @return a copy of the underlying data array.
     */
    private T[][] copyOut() {try{__CLR4_4_1gw1gw1lb90p8lp.R.inc(22188);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22189);final int nRows = this.getRowDimension();
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22190);final T[][] out = MathArrays.buildArray(getField(), nRows, getColumnDimension());
        // can't copy 2-d array in one shot, otherwise get row references
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22191);for (int i = 0; (((i < nRows)&&(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22192)!=0|true))||(__CLR4_4_1gw1gw1lb90p8lp.R.iget(22193)==0&false)); i++) {{
            __CLR4_4_1gw1gw1lb90p8lp.R.inc(22194);System.arraycopy(data[i], 0, out[i], 0, data[i].length);
        }
        }__CLR4_4_1gw1gw1lb90p8lp.R.inc(22195);return out;
    }finally{__CLR4_4_1gw1gw1lb90p8lp.R.flushNeeded();}}

    /**
     * Replace data with a fresh copy of the input array.
     *
     * @param in Data to copy.
     * @throws NoDataException if the input array is empty.
     * @throws DimensionMismatchException if the input array is not rectangular.
     * @throws NullArgumentException if the input array is {@code null}.
     */
    private void copyIn(final T[][] in)
        throws NullArgumentException, NoDataException,
        DimensionMismatchException {try{__CLR4_4_1gw1gw1lb90p8lp.R.inc(22196);
        __CLR4_4_1gw1gw1lb90p8lp.R.inc(22197);setSubMatrix(in, 0, 0);
    }finally{__CLR4_4_1gw1gw1lb90p8lp.R.flushNeeded();}}
}
