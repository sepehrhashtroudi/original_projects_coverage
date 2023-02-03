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

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

import org.apache.commons.math3.Field;
import org.apache.commons.math3.FieldElement;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.ZeroException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.fraction.BigFraction;
import org.apache.commons.math3.fraction.Fraction;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathArrays;
import org.apache.commons.math3.util.Precision;

/**
 * A collection of static methods that operate on or return matrices.
 *
 * @version $Id$
 */
public class MatrixUtils {public static class __CLR4_4_1l62l62lb90p8yb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,27846,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * The default format for {@link RealMatrix} objects.
     * @since 3.1
     */
    public static final RealMatrixFormat DEFAULT_FORMAT = RealMatrixFormat.getInstance();

    /**
     * A format for {@link RealMatrix} objects compatible with octave.
     * @since 3.1
     */
    public static final RealMatrixFormat OCTAVE_FORMAT = new RealMatrixFormat("[", "]", "", "", "; ", ", ");

    /**
     * Private constructor.
     */
    private MatrixUtils() {
        super();__CLR4_4_1l62l62lb90p8yb.R.inc(27435);try{__CLR4_4_1l62l62lb90p8yb.R.inc(27434);
    }finally{__CLR4_4_1l62l62lb90p8yb.R.flushNeeded();}}

    /**
     * Returns a {@link RealMatrix} with specified dimensions.
     * <p>The type of matrix returned depends on the dimension. Below
     * 2<sup>12</sup> elements (i.e. 4096 elements or 64&times;64 for a
     * square matrix) which can be stored in a 32kB array, a {@link
     * Array2DRowRealMatrix} instance is built. Above this threshold a {@link
     * BlockRealMatrix} instance is built.</p>
     * <p>The matrix elements are all set to 0.0.</p>
     * @param rows number of rows of the matrix
     * @param columns number of columns of the matrix
     * @return  RealMatrix with specified dimensions
     * @see #createRealMatrix(double[][])
     */
    public static RealMatrix createRealMatrix(final int rows, final int columns) {try{__CLR4_4_1l62l62lb90p8yb.R.inc(27436);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27437);return ((((rows * columns <= 4096) )&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27438)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27439)==0&false))?
                new Array2DRowRealMatrix(rows, columns) : new BlockRealMatrix(rows, columns);
    }finally{__CLR4_4_1l62l62lb90p8yb.R.flushNeeded();}}

    /**
     * Returns a {@link FieldMatrix} with specified dimensions.
     * <p>The type of matrix returned depends on the dimension. Below
     * 2<sup>12</sup> elements (i.e. 4096 elements or 64&times;64 for a
     * square matrix), a {@link FieldMatrix} instance is built. Above
     * this threshold a {@link BlockFieldMatrix} instance is built.</p>
     * <p>The matrix elements are all set to field.getZero().</p>
     * @param <T> the type of the field elements
     * @param field field to which the matrix elements belong
     * @param rows number of rows of the matrix
     * @param columns number of columns of the matrix
     * @return  FieldMatrix with specified dimensions
     * @see #createFieldMatrix(FieldElement[][])
     * @since 2.0
     */
    public static <T extends FieldElement<T>> FieldMatrix<T> createFieldMatrix(final Field<T> field,
                                                                               final int rows,
                                                                               final int columns) {try{__CLR4_4_1l62l62lb90p8yb.R.inc(27440);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27441);return ((((rows * columns <= 4096) )&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27442)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27443)==0&false))?
                new Array2DRowFieldMatrix<T>(field, rows, columns) : new BlockFieldMatrix<T>(field, rows, columns);
    }finally{__CLR4_4_1l62l62lb90p8yb.R.flushNeeded();}}

    /**
     * Returns a {@link RealMatrix} whose entries are the the values in the
     * the input array.
     * <p>The type of matrix returned depends on the dimension. Below
     * 2<sup>12</sup> elements (i.e. 4096 elements or 64&times;64 for a
     * square matrix) which can be stored in a 32kB array, a {@link
     * Array2DRowRealMatrix} instance is built. Above this threshold a {@link
     * BlockRealMatrix} instance is built.</p>
     * <p>The input array is copied, not referenced.</p>
     *
     * @param data input array
     * @return  RealMatrix containing the values of the array
     * @throws org.apache.commons.math3.exception.DimensionMismatchException
     * if {@code data} is not rectangular (not all rows have the same length).
     * @throws NoDataException if a row or column is empty.
     * @throws NullArgumentException if either {@code data} or {@code data[0]}
     * is {@code null}.
     * @throws DimensionMismatchException if {@code data} is not rectangular.
     * @see #createRealMatrix(int, int)
     */
    public static RealMatrix createRealMatrix(double[][] data)
        throws NullArgumentException, DimensionMismatchException,
        NoDataException {try{__CLR4_4_1l62l62lb90p8yb.R.inc(27444);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27445);if ((((data == null ||
            data[0] == null)&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27446)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27447)==0&false))) {{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27448);throw new NullArgumentException();
        }
        }__CLR4_4_1l62l62lb90p8yb.R.inc(27449);return ((((data.length * data[0].length <= 4096) )&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27450)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27451)==0&false))?
                new Array2DRowRealMatrix(data) : new BlockRealMatrix(data);
    }finally{__CLR4_4_1l62l62lb90p8yb.R.flushNeeded();}}

    /**
     * Returns a {@link FieldMatrix} whose entries are the the values in the
     * the input array.
     * <p>The type of matrix returned depends on the dimension. Below
     * 2<sup>12</sup> elements (i.e. 4096 elements or 64&times;64 for a
     * square matrix), a {@link FieldMatrix} instance is built. Above
     * this threshold a {@link BlockFieldMatrix} instance is built.</p>
     * <p>The input array is copied, not referenced.</p>
     * @param <T> the type of the field elements
     * @param data input array
     * @return a matrix containing the values of the array.
     * @throws org.apache.commons.math3.exception.DimensionMismatchException
     * if {@code data} is not rectangular (not all rows have the same length).
     * @throws NoDataException if a row or column is empty.
     * @throws NullArgumentException if either {@code data} or {@code data[0]}
     * is {@code null}.
     * @see #createFieldMatrix(Field, int, int)
     * @since 2.0
     */
    public static <T extends FieldElement<T>> FieldMatrix<T> createFieldMatrix(T[][] data)
        throws DimensionMismatchException, NoDataException, NullArgumentException {try{__CLR4_4_1l62l62lb90p8yb.R.inc(27452);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27453);if ((((data == null ||
            data[0] == null)&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27454)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27455)==0&false))) {{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27456);throw new NullArgumentException();
        }
        }__CLR4_4_1l62l62lb90p8yb.R.inc(27457);return ((((data.length * data[0].length <= 4096) )&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27458)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27459)==0&false))?
                new Array2DRowFieldMatrix<T>(data) : new BlockFieldMatrix<T>(data);
    }finally{__CLR4_4_1l62l62lb90p8yb.R.flushNeeded();}}

    /**
     * Returns <code>dimension x dimension</code> identity matrix.
     *
     * @param dimension dimension of identity matrix to generate
     * @return identity matrix
     * @throws IllegalArgumentException if dimension is not positive
     * @since 1.1
     */
    public static RealMatrix createRealIdentityMatrix(int dimension) {try{__CLR4_4_1l62l62lb90p8yb.R.inc(27460);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27461);final RealMatrix m = createRealMatrix(dimension, dimension);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27462);for (int i = 0; (((i < dimension)&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27463)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27464)==0&false)); ++i) {{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27465);m.setEntry(i, i, 1.0);
        }
        }__CLR4_4_1l62l62lb90p8yb.R.inc(27466);return m;
    }finally{__CLR4_4_1l62l62lb90p8yb.R.flushNeeded();}}

    /**
     * Returns <code>dimension x dimension</code> identity matrix.
     *
     * @param <T> the type of the field elements
     * @param field field to which the elements belong
     * @param dimension dimension of identity matrix to generate
     * @return identity matrix
     * @throws IllegalArgumentException if dimension is not positive
     * @since 2.0
     */
    public static <T extends FieldElement<T>> FieldMatrix<T>
        createFieldIdentityMatrix(final Field<T> field, final int dimension) {try{__CLR4_4_1l62l62lb90p8yb.R.inc(27467);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27468);final T zero = field.getZero();
        __CLR4_4_1l62l62lb90p8yb.R.inc(27469);final T one  = field.getOne();
        __CLR4_4_1l62l62lb90p8yb.R.inc(27470);final T[][] d = MathArrays.buildArray(field, dimension, dimension);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27471);for (int row = 0; (((row < dimension)&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27472)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27473)==0&false)); row++) {{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27474);final T[] dRow = d[row];
            __CLR4_4_1l62l62lb90p8yb.R.inc(27475);Arrays.fill(dRow, zero);
            __CLR4_4_1l62l62lb90p8yb.R.inc(27476);dRow[row] = one;
        }
        }__CLR4_4_1l62l62lb90p8yb.R.inc(27477);return new Array2DRowFieldMatrix<T>(field, d, false);
    }finally{__CLR4_4_1l62l62lb90p8yb.R.flushNeeded();}}

    /**
     * Returns a diagonal matrix with specified elements.
     *
     * @param diagonal diagonal elements of the matrix (the array elements
     * will be copied)
     * @return diagonal matrix
     * @since 2.0
     */
    public static RealMatrix createRealDiagonalMatrix(final double[] diagonal) {try{__CLR4_4_1l62l62lb90p8yb.R.inc(27478);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27479);final RealMatrix m = createRealMatrix(diagonal.length, diagonal.length);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27480);for (int i = 0; (((i < diagonal.length)&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27481)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27482)==0&false)); ++i) {{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27483);m.setEntry(i, i, diagonal[i]);
        }
        }__CLR4_4_1l62l62lb90p8yb.R.inc(27484);return m;
    }finally{__CLR4_4_1l62l62lb90p8yb.R.flushNeeded();}}

    /**
     * Returns a diagonal matrix with specified elements.
     *
     * @param <T> the type of the field elements
     * @param diagonal diagonal elements of the matrix (the array elements
     * will be copied)
     * @return diagonal matrix
     * @since 2.0
     */
    public static <T extends FieldElement<T>> FieldMatrix<T>
        createFieldDiagonalMatrix(final T[] diagonal) {try{__CLR4_4_1l62l62lb90p8yb.R.inc(27485);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27486);final FieldMatrix<T> m =
            createFieldMatrix(diagonal[0].getField(), diagonal.length, diagonal.length);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27487);for (int i = 0; (((i < diagonal.length)&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27488)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27489)==0&false)); ++i) {{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27490);m.setEntry(i, i, diagonal[i]);
        }
        }__CLR4_4_1l62l62lb90p8yb.R.inc(27491);return m;
    }finally{__CLR4_4_1l62l62lb90p8yb.R.flushNeeded();}}

    /**
     * Creates a {@link RealVector} using the data from the input array.
     *
     * @param data the input data
     * @return a data.length RealVector
     * @throws NoDataException if {@code data} is empty.
     * @throws NullArgumentException if {@code data} is {@code null}.
     */
    public static RealVector createRealVector(double[] data)
        throws NoDataException, NullArgumentException {try{__CLR4_4_1l62l62lb90p8yb.R.inc(27492);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27493);if ((((data == null)&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27494)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27495)==0&false))) {{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27496);throw new NullArgumentException();
        }
        }__CLR4_4_1l62l62lb90p8yb.R.inc(27497);return new ArrayRealVector(data, true);
    }finally{__CLR4_4_1l62l62lb90p8yb.R.flushNeeded();}}

    /**
     * Creates a {@link FieldVector} using the data from the input array.
     *
     * @param <T> the type of the field elements
     * @param data the input data
     * @return a data.length FieldVector
     * @throws NoDataException if {@code data} is empty.
     * @throws NullArgumentException if {@code data} is {@code null}.
     * @throws ZeroException if {@code data} has 0 elements
     */
    public static <T extends FieldElement<T>> FieldVector<T> createFieldVector(final T[] data)
        throws NoDataException, NullArgumentException, ZeroException {try{__CLR4_4_1l62l62lb90p8yb.R.inc(27498);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27499);if ((((data == null)&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27500)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27501)==0&false))) {{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27502);throw new NullArgumentException();
        }
        }__CLR4_4_1l62l62lb90p8yb.R.inc(27503);if ((((data.length == 0)&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27504)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27505)==0&false))) {{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27506);throw new ZeroException(LocalizedFormats.VECTOR_MUST_HAVE_AT_LEAST_ONE_ELEMENT);
        }
        }__CLR4_4_1l62l62lb90p8yb.R.inc(27507);return new ArrayFieldVector<T>(data[0].getField(), data, true);
    }finally{__CLR4_4_1l62l62lb90p8yb.R.flushNeeded();}}

    /**
     * Create a row {@link RealMatrix} using the data from the input
     * array.
     *
     * @param rowData the input row data
     * @return a 1 x rowData.length RealMatrix
     * @throws NoDataException if {@code rowData} is empty.
     * @throws NullArgumentException if {@code rowData} is {@code null}.
     */
    public static RealMatrix createRowRealMatrix(double[] rowData)
        throws NoDataException, NullArgumentException {try{__CLR4_4_1l62l62lb90p8yb.R.inc(27508);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27509);if ((((rowData == null)&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27510)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27511)==0&false))) {{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27512);throw new NullArgumentException();
        }
        }__CLR4_4_1l62l62lb90p8yb.R.inc(27513);final int nCols = rowData.length;
        __CLR4_4_1l62l62lb90p8yb.R.inc(27514);final RealMatrix m = createRealMatrix(1, nCols);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27515);for (int i = 0; (((i < nCols)&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27516)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27517)==0&false)); ++i) {{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27518);m.setEntry(0, i, rowData[i]);
        }
        }__CLR4_4_1l62l62lb90p8yb.R.inc(27519);return m;
    }finally{__CLR4_4_1l62l62lb90p8yb.R.flushNeeded();}}

    /**
     * Create a row {@link FieldMatrix} using the data from the input
     * array.
     *
     * @param <T> the type of the field elements
     * @param rowData the input row data
     * @return a 1 x rowData.length FieldMatrix
     * @throws NoDataException if {@code rowData} is empty.
     * @throws NullArgumentException if {@code rowData} is {@code null}.
     */
    public static <T extends FieldElement<T>> FieldMatrix<T>
        createRowFieldMatrix(final T[] rowData)
        throws NoDataException, NullArgumentException {try{__CLR4_4_1l62l62lb90p8yb.R.inc(27520);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27521);if ((((rowData == null)&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27522)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27523)==0&false))) {{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27524);throw new NullArgumentException();
        }
        }__CLR4_4_1l62l62lb90p8yb.R.inc(27525);final int nCols = rowData.length;
        __CLR4_4_1l62l62lb90p8yb.R.inc(27526);if ((((nCols == 0)&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27527)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27528)==0&false))) {{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27529);throw new NoDataException(LocalizedFormats.AT_LEAST_ONE_COLUMN);
        }
        }__CLR4_4_1l62l62lb90p8yb.R.inc(27530);final FieldMatrix<T> m = createFieldMatrix(rowData[0].getField(), 1, nCols);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27531);for (int i = 0; (((i < nCols)&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27532)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27533)==0&false)); ++i) {{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27534);m.setEntry(0, i, rowData[i]);
        }
        }__CLR4_4_1l62l62lb90p8yb.R.inc(27535);return m;
    }finally{__CLR4_4_1l62l62lb90p8yb.R.flushNeeded();}}

    /**
     * Creates a column {@link RealMatrix} using the data from the input
     * array.
     *
     * @param columnData  the input column data
     * @return a columnData x 1 RealMatrix
     * @throws NoDataException if {@code columnData} is empty.
     * @throws NullArgumentException if {@code columnData} is {@code null}.
     */
    public static RealMatrix createColumnRealMatrix(double[] columnData)
        throws NoDataException, NullArgumentException {try{__CLR4_4_1l62l62lb90p8yb.R.inc(27536);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27537);if ((((columnData == null)&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27538)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27539)==0&false))) {{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27540);throw new NullArgumentException();
        }
        }__CLR4_4_1l62l62lb90p8yb.R.inc(27541);final int nRows = columnData.length;
        __CLR4_4_1l62l62lb90p8yb.R.inc(27542);final RealMatrix m = createRealMatrix(nRows, 1);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27543);for (int i = 0; (((i < nRows)&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27544)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27545)==0&false)); ++i) {{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27546);m.setEntry(i, 0, columnData[i]);
        }
        }__CLR4_4_1l62l62lb90p8yb.R.inc(27547);return m;
    }finally{__CLR4_4_1l62l62lb90p8yb.R.flushNeeded();}}

    /**
     * Creates a column {@link FieldMatrix} using the data from the input
     * array.
     *
     * @param <T> the type of the field elements
     * @param columnData  the input column data
     * @return a columnData x 1 FieldMatrix
     * @throws NoDataException if {@code data} is empty.
     * @throws NullArgumentException if {@code columnData} is {@code null}.
     */
    public static <T extends FieldElement<T>> FieldMatrix<T>
        createColumnFieldMatrix(final T[] columnData)
        throws NoDataException, NullArgumentException {try{__CLR4_4_1l62l62lb90p8yb.R.inc(27548);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27549);if ((((columnData == null)&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27550)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27551)==0&false))) {{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27552);throw new NullArgumentException();
        }
        }__CLR4_4_1l62l62lb90p8yb.R.inc(27553);final int nRows = columnData.length;
        __CLR4_4_1l62l62lb90p8yb.R.inc(27554);if ((((nRows == 0)&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27555)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27556)==0&false))) {{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27557);throw new NoDataException(LocalizedFormats.AT_LEAST_ONE_ROW);
        }
        }__CLR4_4_1l62l62lb90p8yb.R.inc(27558);final FieldMatrix<T> m = createFieldMatrix(columnData[0].getField(), nRows, 1);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27559);for (int i = 0; (((i < nRows)&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27560)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27561)==0&false)); ++i) {{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27562);m.setEntry(i, 0, columnData[i]);
        }
        }__CLR4_4_1l62l62lb90p8yb.R.inc(27563);return m;
    }finally{__CLR4_4_1l62l62lb90p8yb.R.flushNeeded();}}

    /**
     * Checks whether a matrix is symmetric, within a given relative tolerance.
     *
     * @param matrix Matrix to check.
     * @param relativeTolerance Tolerance of the symmetry check.
     * @param raiseException If {@code true}, an exception will be raised if
     * the matrix is not symmetric.
     * @return {@code true} if {@code matrix} is symmetric.
     * @throws NonSquareMatrixException if the matrix is not square.
     * @throws NonSymmetricMatrixException if the matrix is not symmetric.
     */
    private static boolean isSymmetricInternal(RealMatrix matrix,
                                               double relativeTolerance,
                                               boolean raiseException) {try{__CLR4_4_1l62l62lb90p8yb.R.inc(27564);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27565);final int rows = matrix.getRowDimension();
        __CLR4_4_1l62l62lb90p8yb.R.inc(27566);if ((((rows != matrix.getColumnDimension())&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27567)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27568)==0&false))) {{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27569);if ((((raiseException)&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27570)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27571)==0&false))) {{
                __CLR4_4_1l62l62lb90p8yb.R.inc(27572);throw new NonSquareMatrixException(rows, matrix.getColumnDimension());
            } }else {{
                __CLR4_4_1l62l62lb90p8yb.R.inc(27573);return false;
            }
        }}
        }__CLR4_4_1l62l62lb90p8yb.R.inc(27574);for (int i = 0; (((i < rows)&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27575)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27576)==0&false)); i++) {{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27577);for (int j = i + 1; (((j < rows)&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27578)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27579)==0&false)); j++) {{
                __CLR4_4_1l62l62lb90p8yb.R.inc(27580);final double mij = matrix.getEntry(i, j);
                __CLR4_4_1l62l62lb90p8yb.R.inc(27581);final double mji = matrix.getEntry(j, i);
                __CLR4_4_1l62l62lb90p8yb.R.inc(27582);if ((((FastMath.abs(mij - mji) >
                    FastMath.max(FastMath.abs(mij), FastMath.abs(mji)) * relativeTolerance)&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27583)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27584)==0&false))) {{
                    __CLR4_4_1l62l62lb90p8yb.R.inc(27585);if ((((raiseException)&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27586)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27587)==0&false))) {{
                        __CLR4_4_1l62l62lb90p8yb.R.inc(27588);throw new NonSymmetricMatrixException(i, j, relativeTolerance);
                    } }else {{
                        __CLR4_4_1l62l62lb90p8yb.R.inc(27589);return false;
                    }
                }}
            }}
        }}
        }__CLR4_4_1l62l62lb90p8yb.R.inc(27590);return true;
    }finally{__CLR4_4_1l62l62lb90p8yb.R.flushNeeded();}}

    /**
     * Checks whether a matrix is symmetric.
     *
     * @param matrix Matrix to check.
     * @param eps Relative tolerance.
     * @throws NonSquareMatrixException if the matrix is not square.
     * @throws NonSymmetricMatrixException if the matrix is not symmetric.
     * @since 3.1
     */
    public static void checkSymmetric(RealMatrix matrix,
                                      double eps) {try{__CLR4_4_1l62l62lb90p8yb.R.inc(27591);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27592);isSymmetricInternal(matrix, eps, true);
    }finally{__CLR4_4_1l62l62lb90p8yb.R.flushNeeded();}}

    /**
     * Checks whether a matrix is symmetric.
     *
     * @param matrix Matrix to check.
     * @param eps Relative tolerance.
     * @return {@code true} if {@code matrix} is symmetric.
     * @since 3.1
     */
    public static boolean isSymmetric(RealMatrix matrix,
                                      double eps) {try{__CLR4_4_1l62l62lb90p8yb.R.inc(27593);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27594);return isSymmetricInternal(matrix, eps, false);
    }finally{__CLR4_4_1l62l62lb90p8yb.R.flushNeeded();}}

    /**
     * Check if matrix indices are valid.
     *
     * @param m Matrix.
     * @param row Row index to check.
     * @param column Column index to check.
     * @throws OutOfRangeException if {@code row} or {@code column} is not
     * a valid index.
     */
    public static void checkMatrixIndex(final AnyMatrix m,
                                        final int row, final int column)
        throws OutOfRangeException {try{__CLR4_4_1l62l62lb90p8yb.R.inc(27595);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27596);checkRowIndex(m, row);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27597);checkColumnIndex(m, column);
    }finally{__CLR4_4_1l62l62lb90p8yb.R.flushNeeded();}}

    /**
     * Check if a row index is valid.
     *
     * @param m Matrix.
     * @param row Row index to check.
     * @throws OutOfRangeException if {@code row} is not a valid index.
     */
    public static void checkRowIndex(final AnyMatrix m, final int row)
        throws OutOfRangeException {try{__CLR4_4_1l62l62lb90p8yb.R.inc(27598);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27599);if ((((row < 0 ||
            row >= m.getRowDimension())&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27600)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27601)==0&false))) {{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27602);throw new OutOfRangeException(LocalizedFormats.ROW_INDEX,
                                          row, 0, m.getRowDimension() - 1);
        }
    }}finally{__CLR4_4_1l62l62lb90p8yb.R.flushNeeded();}}

    /**
     * Check if a column index is valid.
     *
     * @param m Matrix.
     * @param column Column index to check.
     * @throws OutOfRangeException if {@code column} is not a valid index.
     */
    public static void checkColumnIndex(final AnyMatrix m, final int column)
        throws OutOfRangeException {try{__CLR4_4_1l62l62lb90p8yb.R.inc(27603);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27604);if ((((column < 0 || column >= m.getColumnDimension())&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27605)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27606)==0&false))) {{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27607);throw new OutOfRangeException(LocalizedFormats.COLUMN_INDEX,
                                           column, 0, m.getColumnDimension() - 1);
        }
    }}finally{__CLR4_4_1l62l62lb90p8yb.R.flushNeeded();}}

    /**
     * Check if submatrix ranges indices are valid.
     * Rows and columns are indicated counting from 0 to {@code n - 1}.
     *
     * @param m Matrix.
     * @param startRow Initial row index.
     * @param endRow Final row index.
     * @param startColumn Initial column index.
     * @param endColumn Final column index.
     * @throws OutOfRangeException if the indices are invalid.
     * @throws NumberIsTooSmallException if {@code endRow < startRow} or
     * {@code endColumn < startColumn}.
     */
    public static void checkSubMatrixIndex(final AnyMatrix m,
                                           final int startRow, final int endRow,
                                           final int startColumn, final int endColumn)
        throws NumberIsTooSmallException, OutOfRangeException {try{__CLR4_4_1l62l62lb90p8yb.R.inc(27608);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27609);checkRowIndex(m, startRow);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27610);checkRowIndex(m, endRow);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27611);if ((((endRow < startRow)&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27612)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27613)==0&false))) {{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27614);throw new NumberIsTooSmallException(LocalizedFormats.INITIAL_ROW_AFTER_FINAL_ROW,
                                                endRow, startRow, false);
        }

        }__CLR4_4_1l62l62lb90p8yb.R.inc(27615);checkColumnIndex(m, startColumn);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27616);checkColumnIndex(m, endColumn);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27617);if ((((endColumn < startColumn)&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27618)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27619)==0&false))) {{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27620);throw new NumberIsTooSmallException(LocalizedFormats.INITIAL_COLUMN_AFTER_FINAL_COLUMN,
                                                endColumn, startColumn, false);
        }


    }}finally{__CLR4_4_1l62l62lb90p8yb.R.flushNeeded();}}

    /**
     * Check if submatrix ranges indices are valid.
     * Rows and columns are indicated counting from 0 to n-1.
     *
     * @param m Matrix.
     * @param selectedRows Array of row indices.
     * @param selectedColumns Array of column indices.
     * @throws NullArgumentException if {@code selectedRows} or
     * {@code selectedColumns} are {@code null}.
     * @throws NoDataException if the row or column selections are empty (zero
     * length).
     * @throws OutOfRangeException if row or column selections are not valid.
     */
    public static void checkSubMatrixIndex(final AnyMatrix m,
                                           final int[] selectedRows,
                                           final int[] selectedColumns)
        throws NoDataException, NullArgumentException, OutOfRangeException {try{__CLR4_4_1l62l62lb90p8yb.R.inc(27621);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27622);if ((((selectedRows == null)&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27623)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27624)==0&false))) {{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27625);throw new NullArgumentException();
        }
        }__CLR4_4_1l62l62lb90p8yb.R.inc(27626);if ((((selectedColumns == null)&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27627)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27628)==0&false))) {{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27629);throw new NullArgumentException();
        }
        }__CLR4_4_1l62l62lb90p8yb.R.inc(27630);if ((((selectedRows.length == 0)&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27631)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27632)==0&false))) {{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27633);throw new NoDataException(LocalizedFormats.EMPTY_SELECTED_ROW_INDEX_ARRAY);
        }
        }__CLR4_4_1l62l62lb90p8yb.R.inc(27634);if ((((selectedColumns.length == 0)&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27635)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27636)==0&false))) {{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27637);throw new NoDataException(LocalizedFormats.EMPTY_SELECTED_COLUMN_INDEX_ARRAY);
        }

        }__CLR4_4_1l62l62lb90p8yb.R.inc(27638);for (final int row : selectedRows) {{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27639);checkRowIndex(m, row);
        }
        }__CLR4_4_1l62l62lb90p8yb.R.inc(27640);for (final int column : selectedColumns) {{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27641);checkColumnIndex(m, column);
        }
    }}finally{__CLR4_4_1l62l62lb90p8yb.R.flushNeeded();}}

    /**
     * Check if matrices are addition compatible.
     *
     * @param left Left hand side matrix.
     * @param right Right hand side matrix.
     * @throws MatrixDimensionMismatchException if the matrices are not addition
     * compatible.
     */
    public static void checkAdditionCompatible(final AnyMatrix left, final AnyMatrix right)
        throws MatrixDimensionMismatchException {try{__CLR4_4_1l62l62lb90p8yb.R.inc(27642);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27643);if (((((left.getRowDimension()    != right.getRowDimension()) ||
            (left.getColumnDimension() != right.getColumnDimension()))&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27644)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27645)==0&false))) {{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27646);throw new MatrixDimensionMismatchException(left.getRowDimension(), left.getColumnDimension(),
                                                       right.getRowDimension(), right.getColumnDimension());
        }
    }}finally{__CLR4_4_1l62l62lb90p8yb.R.flushNeeded();}}

    /**
     * Check if matrices are subtraction compatible
     *
     * @param left Left hand side matrix.
     * @param right Right hand side matrix.
     * @throws MatrixDimensionMismatchException if the matrices are not addition
     * compatible.
     */
    public static void checkSubtractionCompatible(final AnyMatrix left, final AnyMatrix right)
        throws MatrixDimensionMismatchException {try{__CLR4_4_1l62l62lb90p8yb.R.inc(27647);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27648);if (((((left.getRowDimension()    != right.getRowDimension()) ||
            (left.getColumnDimension() != right.getColumnDimension()))&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27649)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27650)==0&false))) {{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27651);throw new MatrixDimensionMismatchException(left.getRowDimension(), left.getColumnDimension(),
                                                       right.getRowDimension(), right.getColumnDimension());
        }
    }}finally{__CLR4_4_1l62l62lb90p8yb.R.flushNeeded();}}

    /**
     * Check if matrices are multiplication compatible
     *
     * @param left Left hand side matrix.
     * @param right Right hand side matrix.
     * @throws DimensionMismatchException if matrices are not multiplication
     * compatible.
     */
    public static void checkMultiplicationCompatible(final AnyMatrix left, final AnyMatrix right)
        throws DimensionMismatchException {try{__CLR4_4_1l62l62lb90p8yb.R.inc(27652);

        __CLR4_4_1l62l62lb90p8yb.R.inc(27653);if ((((left.getColumnDimension() != right.getRowDimension())&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27654)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27655)==0&false))) {{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27656);throw new DimensionMismatchException(left.getColumnDimension(),
                                                 right.getRowDimension());
        }
    }}finally{__CLR4_4_1l62l62lb90p8yb.R.flushNeeded();}}

    /**
     * Convert a {@link FieldMatrix}/{@link Fraction} matrix to a {@link RealMatrix}.
     * @param m Matrix to convert.
     * @return the converted matrix.
     */
    public static Array2DRowRealMatrix fractionMatrixToRealMatrix(final FieldMatrix<Fraction> m) {try{__CLR4_4_1l62l62lb90p8yb.R.inc(27657);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27658);final FractionMatrixConverter converter = new FractionMatrixConverter();
        __CLR4_4_1l62l62lb90p8yb.R.inc(27659);m.walkInOptimizedOrder(converter);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27660);return converter.getConvertedMatrix();
    }finally{__CLR4_4_1l62l62lb90p8yb.R.flushNeeded();}}

    /** Converter for {@link FieldMatrix}/{@link Fraction}. */
    private static class FractionMatrixConverter extends DefaultFieldMatrixPreservingVisitor<Fraction> {
        /** Converted array. */
        private double[][] data;
        /** Simple constructor. */
        public FractionMatrixConverter() {
            super(Fraction.ZERO);__CLR4_4_1l62l62lb90p8yb.R.inc(27662);try{__CLR4_4_1l62l62lb90p8yb.R.inc(27661);
        }finally{__CLR4_4_1l62l62lb90p8yb.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public void start(int rows, int columns,
                          int startRow, int endRow, int startColumn, int endColumn) {try{__CLR4_4_1l62l62lb90p8yb.R.inc(27663);
            __CLR4_4_1l62l62lb90p8yb.R.inc(27664);data = new double[rows][columns];
        }finally{__CLR4_4_1l62l62lb90p8yb.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public void visit(int row, int column, Fraction value) {try{__CLR4_4_1l62l62lb90p8yb.R.inc(27665);
            __CLR4_4_1l62l62lb90p8yb.R.inc(27666);data[row][column] = value.doubleValue();
        }finally{__CLR4_4_1l62l62lb90p8yb.R.flushNeeded();}}

        /**
         * Get the converted matrix.
         *
         * @return the converted matrix.
         */
        Array2DRowRealMatrix getConvertedMatrix() {try{__CLR4_4_1l62l62lb90p8yb.R.inc(27667);
            __CLR4_4_1l62l62lb90p8yb.R.inc(27668);return new Array2DRowRealMatrix(data, false);
        }finally{__CLR4_4_1l62l62lb90p8yb.R.flushNeeded();}}

    }

    /**
     * Convert a {@link FieldMatrix}/{@link BigFraction} matrix to a {@link RealMatrix}.
     *
     * @param m Matrix to convert.
     * @return the converted matrix.
     */
    public static Array2DRowRealMatrix bigFractionMatrixToRealMatrix(final FieldMatrix<BigFraction> m) {try{__CLR4_4_1l62l62lb90p8yb.R.inc(27669);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27670);final BigFractionMatrixConverter converter = new BigFractionMatrixConverter();
        __CLR4_4_1l62l62lb90p8yb.R.inc(27671);m.walkInOptimizedOrder(converter);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27672);return converter.getConvertedMatrix();
    }finally{__CLR4_4_1l62l62lb90p8yb.R.flushNeeded();}}

    /** Converter for {@link FieldMatrix}/{@link BigFraction}. */
    private static class BigFractionMatrixConverter extends DefaultFieldMatrixPreservingVisitor<BigFraction> {
        /** Converted array. */
        private double[][] data;
        /** Simple constructor. */
        public BigFractionMatrixConverter() {
            super(BigFraction.ZERO);__CLR4_4_1l62l62lb90p8yb.R.inc(27674);try{__CLR4_4_1l62l62lb90p8yb.R.inc(27673);
        }finally{__CLR4_4_1l62l62lb90p8yb.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public void start(int rows, int columns,
                          int startRow, int endRow, int startColumn, int endColumn) {try{__CLR4_4_1l62l62lb90p8yb.R.inc(27675);
            __CLR4_4_1l62l62lb90p8yb.R.inc(27676);data = new double[rows][columns];
        }finally{__CLR4_4_1l62l62lb90p8yb.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public void visit(int row, int column, BigFraction value) {try{__CLR4_4_1l62l62lb90p8yb.R.inc(27677);
            __CLR4_4_1l62l62lb90p8yb.R.inc(27678);data[row][column] = value.doubleValue();
        }finally{__CLR4_4_1l62l62lb90p8yb.R.flushNeeded();}}

        /**
         * Get the converted matrix.
         *
         * @return the converted matrix.
         */
        Array2DRowRealMatrix getConvertedMatrix() {try{__CLR4_4_1l62l62lb90p8yb.R.inc(27679);
            __CLR4_4_1l62l62lb90p8yb.R.inc(27680);return new Array2DRowRealMatrix(data, false);
        }finally{__CLR4_4_1l62l62lb90p8yb.R.flushNeeded();}}
    }

    /** Serialize a {@link RealVector}.
     * <p>
     * This method is intended to be called from within a private
     * <code>writeObject</code> method (after a call to
     * <code>oos.defaultWriteObject()</code>) in a class that has a
     * {@link RealVector} field, which should be declared <code>transient</code>.
     * This way, the default handling does not serialize the vector (the {@link
     * RealVector} interface is not serializable by default) but this method does
     * serialize it specifically.
     * </p>
     * <p>
     * The following example shows how a simple class with a name and a real vector
     * should be written:
     * <pre><code>
     * public class NamedVector implements Serializable {
     *
     *     private final String name;
     *     private final transient RealVector coefficients;
     *
     *     // omitted constructors, getters ...
     *
     *     private void writeObject(ObjectOutputStream oos) throws IOException {
     *         oos.defaultWriteObject();  // takes care of name field
     *         MatrixUtils.serializeRealVector(coefficients, oos);
     *     }
     *
     *     private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
     *         ois.defaultReadObject();  // takes care of name field
     *         MatrixUtils.deserializeRealVector(this, "coefficients", ois);
     *     }
     *
     * }
     * </code></pre>
     * </p>
     *
     * @param vector real vector to serialize
     * @param oos stream where the real vector should be written
     * @exception IOException if object cannot be written to stream
     * @see #deserializeRealVector(Object, String, ObjectInputStream)
     */
    public static void serializeRealVector(final RealVector vector,
                                           final ObjectOutputStream oos)
        throws IOException {try{__CLR4_4_1l62l62lb90p8yb.R.inc(27681);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27682);final int n = vector.getDimension();
        __CLR4_4_1l62l62lb90p8yb.R.inc(27683);oos.writeInt(n);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27684);for (int i = 0; (((i < n)&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27685)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27686)==0&false)); ++i) {{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27687);oos.writeDouble(vector.getEntry(i));
        }
    }}finally{__CLR4_4_1l62l62lb90p8yb.R.flushNeeded();}}

    /** Deserialize  a {@link RealVector} field in a class.
     * <p>
     * This method is intended to be called from within a private
     * <code>readObject</code> method (after a call to
     * <code>ois.defaultReadObject()</code>) in a class that has a
     * {@link RealVector} field, which should be declared <code>transient</code>.
     * This way, the default handling does not deserialize the vector (the {@link
     * RealVector} interface is not serializable by default) but this method does
     * deserialize it specifically.
     * </p>
     * @param instance instance in which the field must be set up
     * @param fieldName name of the field within the class (may be private and final)
     * @param ois stream from which the real vector should be read
     * @exception ClassNotFoundException if a class in the stream cannot be found
     * @exception IOException if object cannot be read from the stream
     * @see #serializeRealVector(RealVector, ObjectOutputStream)
     */
    public static void deserializeRealVector(final Object instance,
                                             final String fieldName,
                                             final ObjectInputStream ois)
      throws ClassNotFoundException, IOException {try{__CLR4_4_1l62l62lb90p8yb.R.inc(27688);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27689);try {

            // read the vector data
            __CLR4_4_1l62l62lb90p8yb.R.inc(27690);final int n = ois.readInt();
            __CLR4_4_1l62l62lb90p8yb.R.inc(27691);final double[] data = new double[n];
            __CLR4_4_1l62l62lb90p8yb.R.inc(27692);for (int i = 0; (((i < n)&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27693)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27694)==0&false)); ++i) {{
                __CLR4_4_1l62l62lb90p8yb.R.inc(27695);data[i] = ois.readDouble();
            }

            // create the instance
            }__CLR4_4_1l62l62lb90p8yb.R.inc(27696);final RealVector vector = new ArrayRealVector(data, false);

            // set up the field
            __CLR4_4_1l62l62lb90p8yb.R.inc(27697);final java.lang.reflect.Field f =
                instance.getClass().getDeclaredField(fieldName);
            __CLR4_4_1l62l62lb90p8yb.R.inc(27698);f.setAccessible(true);
            __CLR4_4_1l62l62lb90p8yb.R.inc(27699);f.set(instance, vector);

        } catch (NoSuchFieldException nsfe) {
            __CLR4_4_1l62l62lb90p8yb.R.inc(27700);IOException ioe = new IOException();
            __CLR4_4_1l62l62lb90p8yb.R.inc(27701);ioe.initCause(nsfe);
            __CLR4_4_1l62l62lb90p8yb.R.inc(27702);throw ioe;
        } catch (IllegalAccessException iae) {
            __CLR4_4_1l62l62lb90p8yb.R.inc(27703);IOException ioe = new IOException();
            __CLR4_4_1l62l62lb90p8yb.R.inc(27704);ioe.initCause(iae);
            __CLR4_4_1l62l62lb90p8yb.R.inc(27705);throw ioe;
        }

    }finally{__CLR4_4_1l62l62lb90p8yb.R.flushNeeded();}}

    /** Serialize a {@link RealMatrix}.
     * <p>
     * This method is intended to be called from within a private
     * <code>writeObject</code> method (after a call to
     * <code>oos.defaultWriteObject()</code>) in a class that has a
     * {@link RealMatrix} field, which should be declared <code>transient</code>.
     * This way, the default handling does not serialize the matrix (the {@link
     * RealMatrix} interface is not serializable by default) but this method does
     * serialize it specifically.
     * </p>
     * <p>
     * The following example shows how a simple class with a name and a real matrix
     * should be written:
     * <pre><code>
     * public class NamedMatrix implements Serializable {
     *
     *     private final String name;
     *     private final transient RealMatrix coefficients;
     *
     *     // omitted constructors, getters ...
     *
     *     private void writeObject(ObjectOutputStream oos) throws IOException {
     *         oos.defaultWriteObject();  // takes care of name field
     *         MatrixUtils.serializeRealMatrix(coefficients, oos);
     *     }
     *
     *     private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
     *         ois.defaultReadObject();  // takes care of name field
     *         MatrixUtils.deserializeRealMatrix(this, "coefficients", ois);
     *     }
     *
     * }
     * </code></pre>
     * </p>
     *
     * @param matrix real matrix to serialize
     * @param oos stream where the real matrix should be written
     * @exception IOException if object cannot be written to stream
     * @see #deserializeRealMatrix(Object, String, ObjectInputStream)
     */
    public static void serializeRealMatrix(final RealMatrix matrix,
                                           final ObjectOutputStream oos)
        throws IOException {try{__CLR4_4_1l62l62lb90p8yb.R.inc(27706);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27707);final int n = matrix.getRowDimension();
        __CLR4_4_1l62l62lb90p8yb.R.inc(27708);final int m = matrix.getColumnDimension();
        __CLR4_4_1l62l62lb90p8yb.R.inc(27709);oos.writeInt(n);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27710);oos.writeInt(m);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27711);for (int i = 0; (((i < n)&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27712)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27713)==0&false)); ++i) {{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27714);for (int j = 0; (((j < m)&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27715)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27716)==0&false)); ++j) {{
                __CLR4_4_1l62l62lb90p8yb.R.inc(27717);oos.writeDouble(matrix.getEntry(i, j));
            }
        }}
    }}finally{__CLR4_4_1l62l62lb90p8yb.R.flushNeeded();}}

    /** Deserialize  a {@link RealMatrix} field in a class.
     * <p>
     * This method is intended to be called from within a private
     * <code>readObject</code> method (after a call to
     * <code>ois.defaultReadObject()</code>) in a class that has a
     * {@link RealMatrix} field, which should be declared <code>transient</code>.
     * This way, the default handling does not deserialize the matrix (the {@link
     * RealMatrix} interface is not serializable by default) but this method does
     * deserialize it specifically.
     * </p>
     * @param instance instance in which the field must be set up
     * @param fieldName name of the field within the class (may be private and final)
     * @param ois stream from which the real matrix should be read
     * @exception ClassNotFoundException if a class in the stream cannot be found
     * @exception IOException if object cannot be read from the stream
     * @see #serializeRealMatrix(RealMatrix, ObjectOutputStream)
     */
    public static void deserializeRealMatrix(final Object instance,
                                             final String fieldName,
                                             final ObjectInputStream ois)
      throws ClassNotFoundException, IOException {try{__CLR4_4_1l62l62lb90p8yb.R.inc(27718);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27719);try {

            // read the matrix data
            __CLR4_4_1l62l62lb90p8yb.R.inc(27720);final int n = ois.readInt();
            __CLR4_4_1l62l62lb90p8yb.R.inc(27721);final int m = ois.readInt();
            __CLR4_4_1l62l62lb90p8yb.R.inc(27722);final double[][] data = new double[n][m];
            __CLR4_4_1l62l62lb90p8yb.R.inc(27723);for (int i = 0; (((i < n)&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27724)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27725)==0&false)); ++i) {{
                __CLR4_4_1l62l62lb90p8yb.R.inc(27726);final double[] dataI = data[i];
                __CLR4_4_1l62l62lb90p8yb.R.inc(27727);for (int j = 0; (((j < m)&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27728)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27729)==0&false)); ++j) {{
                    __CLR4_4_1l62l62lb90p8yb.R.inc(27730);dataI[j] = ois.readDouble();
                }
            }}

            // create the instance
            }__CLR4_4_1l62l62lb90p8yb.R.inc(27731);final RealMatrix matrix = new Array2DRowRealMatrix(data, false);

            // set up the field
            __CLR4_4_1l62l62lb90p8yb.R.inc(27732);final java.lang.reflect.Field f =
                instance.getClass().getDeclaredField(fieldName);
            __CLR4_4_1l62l62lb90p8yb.R.inc(27733);f.setAccessible(true);
            __CLR4_4_1l62l62lb90p8yb.R.inc(27734);f.set(instance, matrix);

        } catch (NoSuchFieldException nsfe) {
            __CLR4_4_1l62l62lb90p8yb.R.inc(27735);IOException ioe = new IOException();
            __CLR4_4_1l62l62lb90p8yb.R.inc(27736);ioe.initCause(nsfe);
            __CLR4_4_1l62l62lb90p8yb.R.inc(27737);throw ioe;
        } catch (IllegalAccessException iae) {
            __CLR4_4_1l62l62lb90p8yb.R.inc(27738);IOException ioe = new IOException();
            __CLR4_4_1l62l62lb90p8yb.R.inc(27739);ioe.initCause(iae);
            __CLR4_4_1l62l62lb90p8yb.R.inc(27740);throw ioe;
        }
    }finally{__CLR4_4_1l62l62lb90p8yb.R.flushNeeded();}}

    /**Solve  a  system of composed of a Lower Triangular Matrix
     * {@link RealMatrix}.
     * <p>
     * This method is called to solve systems of equations which are
     * of the lower triangular form. The matrix {@link RealMatrix}
     * is assumed, though not checked, to be in lower triangular form.
     * The vector {@link RealVector} is overwritten with the solution.
     * The matrix is checked that it is square and its dimensions match
     * the length of the vector.
     * </p>
     * @param rm RealMatrix which is lower triangular
     * @param b  RealVector this is overwritten
     * @throws DimensionMismatchException if the matrix and vector are not
     * conformable
     * @throws NonSquareMatrixException if the matrix {@code rm} is not square
     * @throws MathArithmeticException if the absolute value of one of the diagonal
     * coefficient of {@code rm} is lower than {@link Precision#SAFE_MIN}
     */
    public static void solveLowerTriangularSystem(RealMatrix rm, RealVector b)
        throws DimensionMismatchException, MathArithmeticException,
        NonSquareMatrixException {try{__CLR4_4_1l62l62lb90p8yb.R.inc(27741);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27742);if (((((rm == null) || (b == null) || ( rm.getRowDimension() != b.getDimension()))&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27743)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27744)==0&false))) {{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27745);throw new DimensionMismatchException(
                    ((((rm == null) )&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27746)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27747)==0&false))? 0 : rm.getRowDimension(),
                    ((((b == null) )&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27748)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27749)==0&false))? 0 : b.getDimension());
        }
        }__CLR4_4_1l62l62lb90p8yb.R.inc(27750);if( (((rm.getColumnDimension() != rm.getRowDimension() )&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27751)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27752)==0&false))){{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27753);throw new NonSquareMatrixException(rm.getRowDimension(),
                                               rm.getColumnDimension());
        }
        }__CLR4_4_1l62l62lb90p8yb.R.inc(27754);int rows = rm.getRowDimension();
        __CLR4_4_1l62l62lb90p8yb.R.inc(27755);for( int i = 0 ; (((i < rows )&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27756)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27757)==0&false)); i++ ){{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27758);double diag = rm.getEntry(i, i);
            __CLR4_4_1l62l62lb90p8yb.R.inc(27759);if( (((FastMath.abs(diag) < Precision.SAFE_MIN )&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27760)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27761)==0&false))){{
                __CLR4_4_1l62l62lb90p8yb.R.inc(27762);throw new MathArithmeticException(LocalizedFormats.ZERO_DENOMINATOR);
            }
            }__CLR4_4_1l62l62lb90p8yb.R.inc(27763);double bi = b.getEntry(i)/diag;
            __CLR4_4_1l62l62lb90p8yb.R.inc(27764);b.setEntry(i,  bi );
            __CLR4_4_1l62l62lb90p8yb.R.inc(27765);for( int j = i+1; (((j< rows)&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27766)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27767)==0&false)); j++ ){{
                __CLR4_4_1l62l62lb90p8yb.R.inc(27768);b.setEntry(j, b.getEntry(j)-bi*rm.getEntry(j,i)  );
            }
        }}
    }}finally{__CLR4_4_1l62l62lb90p8yb.R.flushNeeded();}}

    /** Solver a  system composed  of an Upper Triangular Matrix
     * {@link RealMatrix}.
     * <p>
     * This method is called to solve systems of equations which are
     * of the lower triangular form. The matrix {@link RealMatrix}
     * is assumed, though not checked, to be in upper triangular form.
     * The vector {@link RealVector} is overwritten with the solution.
     * The matrix is checked that it is square and its dimensions match
     * the length of the vector.
     * </p>
     * @param rm RealMatrix which is upper triangular
     * @param b  RealVector this is overwritten
     * @throws DimensionMismatchException if the matrix and vector are not
     * conformable
     * @throws NonSquareMatrixException if the matrix {@code rm} is not
     * square
     * @throws MathArithmeticException if the absolute value of one of the diagonal
     * coefficient of {@code rm} is lower than {@link Precision#SAFE_MIN}
     */
    public static void solveUpperTriangularSystem(RealMatrix rm, RealVector b)
        throws DimensionMismatchException, MathArithmeticException,
        NonSquareMatrixException {try{__CLR4_4_1l62l62lb90p8yb.R.inc(27769);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27770);if (((((rm == null) || (b == null) || ( rm.getRowDimension() != b.getDimension()))&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27771)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27772)==0&false))) {{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27773);throw new DimensionMismatchException(
                    ((((rm == null) )&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27774)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27775)==0&false))? 0 : rm.getRowDimension(),
                    ((((b == null) )&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27776)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27777)==0&false))? 0 : b.getDimension());
        }
        }__CLR4_4_1l62l62lb90p8yb.R.inc(27778);if( (((rm.getColumnDimension() != rm.getRowDimension() )&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27779)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27780)==0&false))){{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27781);throw new NonSquareMatrixException(rm.getRowDimension(),
                                               rm.getColumnDimension());
        }
        }__CLR4_4_1l62l62lb90p8yb.R.inc(27782);int rows = rm.getRowDimension();
        __CLR4_4_1l62l62lb90p8yb.R.inc(27783);for( int i = rows-1 ; (((i >-1 )&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27784)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27785)==0&false)); i-- ){{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27786);double diag = rm.getEntry(i, i);
            __CLR4_4_1l62l62lb90p8yb.R.inc(27787);if( (((FastMath.abs(diag) < Precision.SAFE_MIN )&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27788)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27789)==0&false))){{
                __CLR4_4_1l62l62lb90p8yb.R.inc(27790);throw new MathArithmeticException(LocalizedFormats.ZERO_DENOMINATOR);
            }
            }__CLR4_4_1l62l62lb90p8yb.R.inc(27791);double bi = b.getEntry(i)/diag;
            __CLR4_4_1l62l62lb90p8yb.R.inc(27792);b.setEntry(i,  bi );
            __CLR4_4_1l62l62lb90p8yb.R.inc(27793);for( int j = i-1; (((j>-1)&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27794)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27795)==0&false)); j-- ){{
                __CLR4_4_1l62l62lb90p8yb.R.inc(27796);b.setEntry(j, b.getEntry(j)-bi*rm.getEntry(j,i)  );
            }
        }}
    }}finally{__CLR4_4_1l62l62lb90p8yb.R.flushNeeded();}}

    /**
     * Computes the inverse of the given matrix by splitting it into
     * 4 sub-matrices.
     *
     * @param m Matrix whose inverse must be computed.
     * @param splitIndex Index that determines the "split" line and
     * column.
     * The element corresponding to this index will part of the
     * upper-left sub-matrix.
     * @return the inverse of {@code m}.
     * @throws NonSquareMatrixException if {@code m} is not square.
     */
    public static RealMatrix blockInverse(RealMatrix m,
                                          int splitIndex) {try{__CLR4_4_1l62l62lb90p8yb.R.inc(27797);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27798);final int n = m.getRowDimension();
        __CLR4_4_1l62l62lb90p8yb.R.inc(27799);if ((((m.getColumnDimension() != n)&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27800)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27801)==0&false))) {{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27802);throw new NonSquareMatrixException(m.getRowDimension(),
                                               m.getColumnDimension());
        }

        }__CLR4_4_1l62l62lb90p8yb.R.inc(27803);final int splitIndex1 = splitIndex + 1;

        __CLR4_4_1l62l62lb90p8yb.R.inc(27804);final RealMatrix a = m.getSubMatrix(0, splitIndex, 0, splitIndex);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27805);final RealMatrix b = m.getSubMatrix(0, splitIndex, splitIndex1, n - 1);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27806);final RealMatrix c = m.getSubMatrix(splitIndex1, n - 1, 0, splitIndex);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27807);final RealMatrix d = m.getSubMatrix(splitIndex1, n - 1, splitIndex1, n - 1);

        __CLR4_4_1l62l62lb90p8yb.R.inc(27808);final SingularValueDecomposition aDec = new SingularValueDecomposition(a);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27809);final DecompositionSolver aSolver = aDec.getSolver();
        __CLR4_4_1l62l62lb90p8yb.R.inc(27810);if ((((!aSolver.isNonSingular())&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27811)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27812)==0&false))) {{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27813);throw new SingularMatrixException();
        }
        }__CLR4_4_1l62l62lb90p8yb.R.inc(27814);final RealMatrix aInv = aSolver.getInverse();

        __CLR4_4_1l62l62lb90p8yb.R.inc(27815);final SingularValueDecomposition dDec = new SingularValueDecomposition(d);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27816);final DecompositionSolver dSolver = dDec.getSolver();
        __CLR4_4_1l62l62lb90p8yb.R.inc(27817);if ((((!dSolver.isNonSingular())&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27818)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27819)==0&false))) {{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27820);throw new SingularMatrixException();
        }
        }__CLR4_4_1l62l62lb90p8yb.R.inc(27821);final RealMatrix dInv = dSolver.getInverse();

        __CLR4_4_1l62l62lb90p8yb.R.inc(27822);final RealMatrix tmp1 = a.subtract(b.multiply(dInv).multiply(c));
        __CLR4_4_1l62l62lb90p8yb.R.inc(27823);final SingularValueDecomposition tmp1Dec = new SingularValueDecomposition(tmp1);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27824);final DecompositionSolver tmp1Solver = tmp1Dec.getSolver();
        __CLR4_4_1l62l62lb90p8yb.R.inc(27825);if ((((!tmp1Solver.isNonSingular())&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27826)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27827)==0&false))) {{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27828);throw new SingularMatrixException();
        }
        }__CLR4_4_1l62l62lb90p8yb.R.inc(27829);final RealMatrix result00 = tmp1Solver.getInverse();

        __CLR4_4_1l62l62lb90p8yb.R.inc(27830);final RealMatrix tmp2 = d.subtract(c.multiply(aInv).multiply(b));
        __CLR4_4_1l62l62lb90p8yb.R.inc(27831);final SingularValueDecomposition tmp2Dec = new SingularValueDecomposition(tmp2);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27832);final DecompositionSolver tmp2Solver = tmp2Dec.getSolver();
        __CLR4_4_1l62l62lb90p8yb.R.inc(27833);if ((((!tmp2Solver.isNonSingular())&&(__CLR4_4_1l62l62lb90p8yb.R.iget(27834)!=0|true))||(__CLR4_4_1l62l62lb90p8yb.R.iget(27835)==0&false))) {{
            __CLR4_4_1l62l62lb90p8yb.R.inc(27836);throw new SingularMatrixException();
        }
        }__CLR4_4_1l62l62lb90p8yb.R.inc(27837);final RealMatrix result11 = tmp2Solver.getInverse();

        __CLR4_4_1l62l62lb90p8yb.R.inc(27838);final RealMatrix result01 = aInv.multiply(b).multiply(result11).scalarMultiply(-1);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27839);final RealMatrix result10 = dInv.multiply(c).multiply(result00).scalarMultiply(-1);

        __CLR4_4_1l62l62lb90p8yb.R.inc(27840);final RealMatrix result = new Array2DRowRealMatrix(n, n);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27841);result.setSubMatrix(result00.getData(), 0, 0);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27842);result.setSubMatrix(result01.getData(), 0, splitIndex1);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27843);result.setSubMatrix(result10.getData(), splitIndex1, 0);
        __CLR4_4_1l62l62lb90p8yb.R.inc(27844);result.setSubMatrix(result11.getData(), splitIndex1, splitIndex1);

        __CLR4_4_1l62l62lb90p8yb.R.inc(27845);return result;
    }finally{__CLR4_4_1l62l62lb90p8yb.R.flushNeeded();}}
}
