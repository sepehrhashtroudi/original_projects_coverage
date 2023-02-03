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

import java.util.ArrayList;

import org.apache.commons.math3.Field;
import org.apache.commons.math3.FieldElement;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.MathArrays;

/**
 * Basic implementation of {@link FieldMatrix} methods regardless of the underlying storage.
 * <p>All the methods implemented here use {@link #getEntry(int, int)} to access
 * matrix elements. Derived class can provide faster implementations. </p>
 *
 * @param <T> Type of the field elements.
 *
 * @version $Id$
 * @since 2.0
 */
public abstract class AbstractFieldMatrix<T extends FieldElement<T>>
    implements FieldMatrix<T> {public static class __CLR4_4_1fwafwalb90p8jj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,21274,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Field to which the elements belong. */
    private final Field<T> field;

    /**
     * Constructor for use with Serializable
     */
    protected AbstractFieldMatrix() {try{__CLR4_4_1fwafwalb90p8jj.R.inc(20602);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20603);field = null;
    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /**
     * Creates a matrix with no data
     * @param field field to which the elements belong
     */
    protected AbstractFieldMatrix(final Field<T> field) {try{__CLR4_4_1fwafwalb90p8jj.R.inc(20604);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20605);this.field = field;
    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /**
     * Create a new FieldMatrix<T> with the supplied row and column dimensions.
     *
     * @param field Field to which the elements belong.
     * @param rowDimension Number of rows in the new matrix.
     * @param columnDimension Number of columns in the new matrix.
     * @throws NotStrictlyPositiveException if row or column dimension is not
     * positive.
     */
    protected AbstractFieldMatrix(final Field<T> field,
                                  final int rowDimension,
                                  final int columnDimension)
        throws NotStrictlyPositiveException {try{__CLR4_4_1fwafwalb90p8jj.R.inc(20606);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20607);if ((((rowDimension <= 0)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20608)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20609)==0&false))) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20610);throw new NotStrictlyPositiveException(LocalizedFormats.DIMENSION,
                                                   rowDimension);
        }
        }__CLR4_4_1fwafwalb90p8jj.R.inc(20611);if ((((columnDimension <= 0)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20612)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20613)==0&false))) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20614);throw new NotStrictlyPositiveException(LocalizedFormats.DIMENSION,
                                                   columnDimension);
        }
        }__CLR4_4_1fwafwalb90p8jj.R.inc(20615);this.field = field;
    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /**
     * Get the elements type from an array.
     *
     * @param <T> Type of the field elements.
     * @param d Data array.
     * @return the field to which the array elements belong.
     * @throws NullArgumentException if the array is {@code null}.
     * @throws NoDataException if the array is empty.
     */
    protected static <T extends FieldElement<T>> Field<T> extractField(final T[][] d)
        throws NoDataException, NullArgumentException {try{__CLR4_4_1fwafwalb90p8jj.R.inc(20616);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20617);if ((((d == null)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20618)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20619)==0&false))) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20620);throw new NullArgumentException();
        }
        }__CLR4_4_1fwafwalb90p8jj.R.inc(20621);if ((((d.length == 0)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20622)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20623)==0&false))) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20624);throw new NoDataException(LocalizedFormats.AT_LEAST_ONE_ROW);
        }
        }__CLR4_4_1fwafwalb90p8jj.R.inc(20625);if ((((d[0].length == 0)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20626)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20627)==0&false))) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20628);throw new NoDataException(LocalizedFormats.AT_LEAST_ONE_COLUMN);
        }
        }__CLR4_4_1fwafwalb90p8jj.R.inc(20629);return d[0][0].getField();
    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /**
     * Get the elements type from an array.
     *
     * @param <T> Type of the field elements.
     * @param d Data array.
     * @return the field to which the array elements belong.
     * @throws NoDataException if array is empty.
     */
    protected static <T extends FieldElement<T>> Field<T> extractField(final T[] d)
        throws NoDataException {try{__CLR4_4_1fwafwalb90p8jj.R.inc(20630);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20631);if ((((d.length == 0)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20632)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20633)==0&false))) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20634);throw new NoDataException(LocalizedFormats.AT_LEAST_ONE_ROW);
        }
        }__CLR4_4_1fwafwalb90p8jj.R.inc(20635);return d[0].getField();
    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** Build an array of elements.
     * <p>
     * Complete arrays are filled with field.getZero()
     * </p>
     * @param <T> Type of the field elements
     * @param field field to which array elements belong
     * @param rows number of rows
     * @param columns number of columns (may be negative to build partial
     * arrays in the same way <code>new Field[rows][]</code> works)
     * @return a new array
     * @deprecated as of 3.2, replaced by {@link MathArrays#buildArray(Field, int, int)}
     */
    @Deprecated
    protected static <T extends FieldElement<T>> T[][] buildArray(final Field<T> field,
                                                                  final int rows,
                                                                  final int columns) {try{__CLR4_4_1fwafwalb90p8jj.R.inc(20636);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20637);return MathArrays.buildArray(field, rows, columns);
    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** Build an array of elements.
     * <p>
     * Arrays are filled with field.getZero()
     * </p>
     * @param <T> the type of the field elements
     * @param field field to which array elements belong
     * @param length of the array
     * @return a new array
     * @deprecated as of 3.2, replaced by {@link MathArrays#buildArray(Field, int)}
     */
    @Deprecated
    protected static <T extends FieldElement<T>> T[] buildArray(final Field<T> field,
                                                                final int length) {try{__CLR4_4_1fwafwalb90p8jj.R.inc(20638);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20639);return MathArrays.buildArray(field, length);
    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public Field<T> getField() {try{__CLR4_4_1fwafwalb90p8jj.R.inc(20640);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20641);return field;
    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public abstract FieldMatrix<T> createMatrix(final int rowDimension,
                                                final int columnDimension)
        throws NotStrictlyPositiveException;

    /** {@inheritDoc} */
    public abstract FieldMatrix<T> copy();

    /** {@inheritDoc} */
    public FieldMatrix<T> add(FieldMatrix<T> m)
        throws MatrixDimensionMismatchException {try{__CLR4_4_1fwafwalb90p8jj.R.inc(20642);
        // safety check
        __CLR4_4_1fwafwalb90p8jj.R.inc(20643);checkAdditionCompatible(m);

        __CLR4_4_1fwafwalb90p8jj.R.inc(20644);final int rowCount    = getRowDimension();
        __CLR4_4_1fwafwalb90p8jj.R.inc(20645);final int columnCount = getColumnDimension();
        __CLR4_4_1fwafwalb90p8jj.R.inc(20646);final FieldMatrix<T> out = createMatrix(rowCount, columnCount);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20647);for (int row = 0; (((row < rowCount)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20648)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20649)==0&false)); ++row) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20650);for (int col = 0; (((col < columnCount)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20651)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20652)==0&false)); ++col) {{
                __CLR4_4_1fwafwalb90p8jj.R.inc(20653);out.setEntry(row, col, getEntry(row, col).add(m.getEntry(row, col)));
            }
        }}

        }__CLR4_4_1fwafwalb90p8jj.R.inc(20654);return out;
    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldMatrix<T> subtract(final FieldMatrix<T> m)
        throws MatrixDimensionMismatchException {try{__CLR4_4_1fwafwalb90p8jj.R.inc(20655);
        // safety check
        __CLR4_4_1fwafwalb90p8jj.R.inc(20656);checkSubtractionCompatible(m);

        __CLR4_4_1fwafwalb90p8jj.R.inc(20657);final int rowCount    = getRowDimension();
        __CLR4_4_1fwafwalb90p8jj.R.inc(20658);final int columnCount = getColumnDimension();
        __CLR4_4_1fwafwalb90p8jj.R.inc(20659);final FieldMatrix<T> out = createMatrix(rowCount, columnCount);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20660);for (int row = 0; (((row < rowCount)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20661)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20662)==0&false)); ++row) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20663);for (int col = 0; (((col < columnCount)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20664)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20665)==0&false)); ++col) {{
                __CLR4_4_1fwafwalb90p8jj.R.inc(20666);out.setEntry(row, col, getEntry(row, col).subtract(m.getEntry(row, col)));
            }
        }}

        }__CLR4_4_1fwafwalb90p8jj.R.inc(20667);return out;
    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldMatrix<T> scalarAdd(final T d) {try{__CLR4_4_1fwafwalb90p8jj.R.inc(20668);

        __CLR4_4_1fwafwalb90p8jj.R.inc(20669);final int rowCount    = getRowDimension();
        __CLR4_4_1fwafwalb90p8jj.R.inc(20670);final int columnCount = getColumnDimension();
        __CLR4_4_1fwafwalb90p8jj.R.inc(20671);final FieldMatrix<T> out = createMatrix(rowCount, columnCount);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20672);for (int row = 0; (((row < rowCount)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20673)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20674)==0&false)); ++row) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20675);for (int col = 0; (((col < columnCount)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20676)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20677)==0&false)); ++col) {{
                __CLR4_4_1fwafwalb90p8jj.R.inc(20678);out.setEntry(row, col, getEntry(row, col).add(d));
            }
        }}

        }__CLR4_4_1fwafwalb90p8jj.R.inc(20679);return out;
    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldMatrix<T> scalarMultiply(final T d) {try{__CLR4_4_1fwafwalb90p8jj.R.inc(20680);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20681);final int rowCount    = getRowDimension();
        __CLR4_4_1fwafwalb90p8jj.R.inc(20682);final int columnCount = getColumnDimension();
        __CLR4_4_1fwafwalb90p8jj.R.inc(20683);final FieldMatrix<T> out = createMatrix(rowCount, columnCount);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20684);for (int row = 0; (((row < rowCount)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20685)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20686)==0&false)); ++row) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20687);for (int col = 0; (((col < columnCount)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20688)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20689)==0&false)); ++col) {{
                __CLR4_4_1fwafwalb90p8jj.R.inc(20690);out.setEntry(row, col, getEntry(row, col).multiply(d));
            }
        }}

        }__CLR4_4_1fwafwalb90p8jj.R.inc(20691);return out;
    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldMatrix<T> multiply(final FieldMatrix<T> m)
        throws DimensionMismatchException {try{__CLR4_4_1fwafwalb90p8jj.R.inc(20692);
        // safety check
        __CLR4_4_1fwafwalb90p8jj.R.inc(20693);checkMultiplicationCompatible(m);

        __CLR4_4_1fwafwalb90p8jj.R.inc(20694);final int nRows = getRowDimension();
        __CLR4_4_1fwafwalb90p8jj.R.inc(20695);final int nCols = m.getColumnDimension();
        __CLR4_4_1fwafwalb90p8jj.R.inc(20696);final int nSum  = getColumnDimension();
        __CLR4_4_1fwafwalb90p8jj.R.inc(20697);final FieldMatrix<T> out = createMatrix(nRows, nCols);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20698);for (int row = 0; (((row < nRows)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20699)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20700)==0&false)); ++row) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20701);for (int col = 0; (((col < nCols)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20702)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20703)==0&false)); ++col) {{
                __CLR4_4_1fwafwalb90p8jj.R.inc(20704);T sum = field.getZero();
                __CLR4_4_1fwafwalb90p8jj.R.inc(20705);for (int i = 0; (((i < nSum)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20706)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20707)==0&false)); ++i) {{
                    __CLR4_4_1fwafwalb90p8jj.R.inc(20708);sum = sum.add(getEntry(row, i).multiply(m.getEntry(i, col)));
                }
                }__CLR4_4_1fwafwalb90p8jj.R.inc(20709);out.setEntry(row, col, sum);
            }
        }}

        }__CLR4_4_1fwafwalb90p8jj.R.inc(20710);return out;
    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldMatrix<T> preMultiply(final FieldMatrix<T> m)
        throws DimensionMismatchException {try{__CLR4_4_1fwafwalb90p8jj.R.inc(20711);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20712);return m.multiply(this);
    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldMatrix<T> power(final int p) throws NonSquareMatrixException,
    NotPositiveException {try{__CLR4_4_1fwafwalb90p8jj.R.inc(20713);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20714);if ((((p < 0)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20715)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20716)==0&false))) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20717);throw new NotPositiveException(p);
        }

        }__CLR4_4_1fwafwalb90p8jj.R.inc(20718);if ((((!isSquare())&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20719)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20720)==0&false))) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20721);throw new NonSquareMatrixException(getRowDimension(), getColumnDimension());
        }

        }__CLR4_4_1fwafwalb90p8jj.R.inc(20722);if ((((p == 0)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20723)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20724)==0&false))) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20725);return MatrixUtils.createFieldIdentityMatrix(this.getField(), this.getRowDimension());
        }

        }__CLR4_4_1fwafwalb90p8jj.R.inc(20726);if ((((p == 1)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20727)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20728)==0&false))) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20729);return this.copy();
        }

        }__CLR4_4_1fwafwalb90p8jj.R.inc(20730);final int power = p - 1;

        /*
         * Only log_2(p) operations is used by doing as follows:
         * 5^214 = 5^128 * 5^64 * 5^16 * 5^4 * 5^2
         *
         * In general, the same approach is used for A^p.
         */

        __CLR4_4_1fwafwalb90p8jj.R.inc(20731);final char[] binaryRepresentation = Integer.toBinaryString(power)
                .toCharArray();
        __CLR4_4_1fwafwalb90p8jj.R.inc(20732);final ArrayList<Integer> nonZeroPositions = new ArrayList<Integer>();

        __CLR4_4_1fwafwalb90p8jj.R.inc(20733);for (int i = 0; (((i < binaryRepresentation.length)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20734)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20735)==0&false)); ++i) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20736);if ((((binaryRepresentation[i] == '1')&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20737)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20738)==0&false))) {{
                __CLR4_4_1fwafwalb90p8jj.R.inc(20739);final int pos = binaryRepresentation.length - i - 1;
                __CLR4_4_1fwafwalb90p8jj.R.inc(20740);nonZeroPositions.add(pos);
            }
        }}

        }__CLR4_4_1fwafwalb90p8jj.R.inc(20741);ArrayList<FieldMatrix<T>> results = new ArrayList<FieldMatrix<T>>(
                binaryRepresentation.length);

        __CLR4_4_1fwafwalb90p8jj.R.inc(20742);results.add(0, this.copy());

        __CLR4_4_1fwafwalb90p8jj.R.inc(20743);for (int i = 1; (((i < binaryRepresentation.length)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20744)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20745)==0&false)); ++i) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20746);final FieldMatrix<T> s = results.get(i - 1);
            __CLR4_4_1fwafwalb90p8jj.R.inc(20747);final FieldMatrix<T> r = s.multiply(s);
            __CLR4_4_1fwafwalb90p8jj.R.inc(20748);results.add(i, r);
        }

        }__CLR4_4_1fwafwalb90p8jj.R.inc(20749);FieldMatrix<T> result = this.copy();

        __CLR4_4_1fwafwalb90p8jj.R.inc(20750);for (Integer i : nonZeroPositions) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20751);result = result.multiply(results.get(i));
        }

        }__CLR4_4_1fwafwalb90p8jj.R.inc(20752);return result;
    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public T[][] getData() {try{__CLR4_4_1fwafwalb90p8jj.R.inc(20753);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20754);final T[][] data = MathArrays.buildArray(field, getRowDimension(), getColumnDimension());

        __CLR4_4_1fwafwalb90p8jj.R.inc(20755);for (int i = 0; (((i < data.length)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20756)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20757)==0&false)); ++i) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20758);final T[] dataI = data[i];
            __CLR4_4_1fwafwalb90p8jj.R.inc(20759);for (int j = 0; (((j < dataI.length)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20760)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20761)==0&false)); ++j) {{
                __CLR4_4_1fwafwalb90p8jj.R.inc(20762);dataI[j] = getEntry(i, j);
            }
        }}

        }__CLR4_4_1fwafwalb90p8jj.R.inc(20763);return data;
    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldMatrix<T> getSubMatrix(final int startRow, final int endRow,
                                       final int startColumn, final int endColumn)
        throws NumberIsTooSmallException, OutOfRangeException {try{__CLR4_4_1fwafwalb90p8jj.R.inc(20764);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20765);checkSubMatrixIndex(startRow, endRow, startColumn, endColumn);

        __CLR4_4_1fwafwalb90p8jj.R.inc(20766);final FieldMatrix<T> subMatrix =
            createMatrix(endRow - startRow + 1, endColumn - startColumn + 1);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20767);for (int i = startRow; (((i <= endRow)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20768)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20769)==0&false)); ++i) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20770);for (int j = startColumn; (((j <= endColumn)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20771)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20772)==0&false)); ++j) {{
                __CLR4_4_1fwafwalb90p8jj.R.inc(20773);subMatrix.setEntry(i - startRow, j - startColumn, getEntry(i, j));
            }
        }}

        }__CLR4_4_1fwafwalb90p8jj.R.inc(20774);return subMatrix;

    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldMatrix<T> getSubMatrix(final int[] selectedRows,
                                       final int[] selectedColumns)
    throws NoDataException, NullArgumentException, OutOfRangeException {try{__CLR4_4_1fwafwalb90p8jj.R.inc(20775);

        // safety checks
        __CLR4_4_1fwafwalb90p8jj.R.inc(20776);checkSubMatrixIndex(selectedRows, selectedColumns);

        // copy entries
        __CLR4_4_1fwafwalb90p8jj.R.inc(20777);final FieldMatrix<T> subMatrix =
            createMatrix(selectedRows.length, selectedColumns.length);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20778);subMatrix.walkInOptimizedOrder(new DefaultFieldMatrixChangingVisitor<T>(field.getZero()) {

            /** {@inheritDoc} */
            @Override
            public T visit(final int row, final int column, final T value) {try{__CLR4_4_1fwafwalb90p8jj.R.inc(20779);
                __CLR4_4_1fwafwalb90p8jj.R.inc(20780);return getEntry(selectedRows[row], selectedColumns[column]);
            }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

        });

        __CLR4_4_1fwafwalb90p8jj.R.inc(20781);return subMatrix;

    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void copySubMatrix(final int startRow, final int endRow,
                              final int startColumn, final int endColumn,
                              final T[][] destination)
    throws MatrixDimensionMismatchException, NumberIsTooSmallException,
    OutOfRangeException{try{__CLR4_4_1fwafwalb90p8jj.R.inc(20782);
        // safety checks
        __CLR4_4_1fwafwalb90p8jj.R.inc(20783);checkSubMatrixIndex(startRow, endRow, startColumn, endColumn);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20784);final int rowsCount    = endRow + 1 - startRow;
        __CLR4_4_1fwafwalb90p8jj.R.inc(20785);final int columnsCount = endColumn + 1 - startColumn;
        __CLR4_4_1fwafwalb90p8jj.R.inc(20786);if (((((destination.length < rowsCount) || (destination[0].length < columnsCount))&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20787)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20788)==0&false))) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20789);throw new MatrixDimensionMismatchException(destination.length,
                                                       destination[0].length,
                                                       rowsCount,
                                                       columnsCount);
        }

        // copy entries
        }__CLR4_4_1fwafwalb90p8jj.R.inc(20790);walkInOptimizedOrder(new DefaultFieldMatrixPreservingVisitor<T>(field.getZero()) {

            /** Initial row index. */
            private int startRow;

            /** Initial column index. */
            private int startColumn;

            /** {@inheritDoc} */
            @Override
            public void start(final int rows, final int columns,
                              final int startRow, final int endRow,
                              final int startColumn, final int endColumn) {try{__CLR4_4_1fwafwalb90p8jj.R.inc(20791);
                __CLR4_4_1fwafwalb90p8jj.R.inc(20792);this.startRow    = startRow;
                __CLR4_4_1fwafwalb90p8jj.R.inc(20793);this.startColumn = startColumn;
            }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

            /** {@inheritDoc} */
            @Override
            public void visit(final int row, final int column, final T value) {try{__CLR4_4_1fwafwalb90p8jj.R.inc(20794);
                __CLR4_4_1fwafwalb90p8jj.R.inc(20795);destination[row - startRow][column - startColumn] = value;
            }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

        }, startRow, endRow, startColumn, endColumn);

    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void copySubMatrix(int[] selectedRows, int[] selectedColumns, T[][] destination)
        throws MatrixDimensionMismatchException, NoDataException,
        NullArgumentException, OutOfRangeException {try{__CLR4_4_1fwafwalb90p8jj.R.inc(20796);
        // safety checks
        __CLR4_4_1fwafwalb90p8jj.R.inc(20797);checkSubMatrixIndex(selectedRows, selectedColumns);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20798);if (((((destination.length < selectedRows.length) ||
            (destination[0].length < selectedColumns.length))&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20799)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20800)==0&false))) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20801);throw new MatrixDimensionMismatchException(destination.length,
                                                       destination[0].length,
                                                       selectedRows.length,
                                                       selectedColumns.length);
        }

        // copy entries
        }__CLR4_4_1fwafwalb90p8jj.R.inc(20802);for (int i = 0; (((i < selectedRows.length)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20803)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20804)==0&false)); i++) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20805);final T[] destinationI = destination[i];
            __CLR4_4_1fwafwalb90p8jj.R.inc(20806);for (int j = 0; (((j < selectedColumns.length)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20807)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20808)==0&false)); j++) {{
                __CLR4_4_1fwafwalb90p8jj.R.inc(20809);destinationI[j] = getEntry(selectedRows[i], selectedColumns[j]);
            }
        }}

    }}finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void setSubMatrix(final T[][] subMatrix, final int row,
                             final int column)
        throws DimensionMismatchException, OutOfRangeException,
        NoDataException, NullArgumentException {try{__CLR4_4_1fwafwalb90p8jj.R.inc(20810);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20811);if ((((subMatrix == null)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20812)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20813)==0&false))) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20814);throw new NullArgumentException();
        }
        }__CLR4_4_1fwafwalb90p8jj.R.inc(20815);final int nRows = subMatrix.length;
        __CLR4_4_1fwafwalb90p8jj.R.inc(20816);if ((((nRows == 0)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20817)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20818)==0&false))) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20819);throw new NoDataException(LocalizedFormats.AT_LEAST_ONE_ROW);
        }

        }__CLR4_4_1fwafwalb90p8jj.R.inc(20820);final int nCols = subMatrix[0].length;
        __CLR4_4_1fwafwalb90p8jj.R.inc(20821);if ((((nCols == 0)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20822)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20823)==0&false))) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20824);throw new NoDataException(LocalizedFormats.AT_LEAST_ONE_COLUMN);
        }

        }__CLR4_4_1fwafwalb90p8jj.R.inc(20825);for (int r = 1; (((r < nRows)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20826)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20827)==0&false)); ++r) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20828);if ((((subMatrix[r].length != nCols)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20829)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20830)==0&false))) {{
                __CLR4_4_1fwafwalb90p8jj.R.inc(20831);throw new DimensionMismatchException(nCols, subMatrix[r].length);
            }
        }}

        }__CLR4_4_1fwafwalb90p8jj.R.inc(20832);checkRowIndex(row);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20833);checkColumnIndex(column);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20834);checkRowIndex(nRows + row - 1);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20835);checkColumnIndex(nCols + column - 1);

        __CLR4_4_1fwafwalb90p8jj.R.inc(20836);for (int i = 0; (((i < nRows)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20837)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20838)==0&false)); ++i) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20839);for (int j = 0; (((j < nCols)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20840)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20841)==0&false)); ++j) {{
                __CLR4_4_1fwafwalb90p8jj.R.inc(20842);setEntry(row + i, column + j, subMatrix[i][j]);
            }
        }}
    }}finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldMatrix<T> getRowMatrix(final int row) throws OutOfRangeException {try{__CLR4_4_1fwafwalb90p8jj.R.inc(20843);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20844);checkRowIndex(row);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20845);final int nCols = getColumnDimension();
        __CLR4_4_1fwafwalb90p8jj.R.inc(20846);final FieldMatrix<T> out = createMatrix(1, nCols);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20847);for (int i = 0; (((i < nCols)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20848)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20849)==0&false)); ++i) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20850);out.setEntry(0, i, getEntry(row, i));
        }

        }__CLR4_4_1fwafwalb90p8jj.R.inc(20851);return out;

    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void setRowMatrix(final int row, final FieldMatrix<T> matrix)
        throws OutOfRangeException, MatrixDimensionMismatchException {try{__CLR4_4_1fwafwalb90p8jj.R.inc(20852);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20853);checkRowIndex(row);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20854);final int nCols = getColumnDimension();
        __CLR4_4_1fwafwalb90p8jj.R.inc(20855);if (((((matrix.getRowDimension() != 1) ||
            (matrix.getColumnDimension() != nCols))&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20856)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20857)==0&false))) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20858);throw new MatrixDimensionMismatchException(matrix.getRowDimension(),
                                                       matrix.getColumnDimension(),
                                                       1, nCols);
        }
        }__CLR4_4_1fwafwalb90p8jj.R.inc(20859);for (int i = 0; (((i < nCols)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20860)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20861)==0&false)); ++i) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20862);setEntry(row, i, matrix.getEntry(0, i));
        }

    }}finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldMatrix<T> getColumnMatrix(final int column)
    throws OutOfRangeException {try{__CLR4_4_1fwafwalb90p8jj.R.inc(20863);

        __CLR4_4_1fwafwalb90p8jj.R.inc(20864);checkColumnIndex(column);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20865);final int nRows = getRowDimension();
        __CLR4_4_1fwafwalb90p8jj.R.inc(20866);final FieldMatrix<T> out = createMatrix(nRows, 1);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20867);for (int i = 0; (((i < nRows)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20868)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20869)==0&false)); ++i) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20870);out.setEntry(i, 0, getEntry(i, column));
        }

        }__CLR4_4_1fwafwalb90p8jj.R.inc(20871);return out;

    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void setColumnMatrix(final int column, final FieldMatrix<T> matrix)
        throws OutOfRangeException, MatrixDimensionMismatchException {try{__CLR4_4_1fwafwalb90p8jj.R.inc(20872);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20873);checkColumnIndex(column);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20874);final int nRows = getRowDimension();
        __CLR4_4_1fwafwalb90p8jj.R.inc(20875);if (((((matrix.getRowDimension() != nRows) ||
            (matrix.getColumnDimension() != 1))&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20876)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20877)==0&false))) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20878);throw new MatrixDimensionMismatchException(matrix.getRowDimension(),
                                                       matrix.getColumnDimension(),
                                                       nRows, 1);
        }
        }__CLR4_4_1fwafwalb90p8jj.R.inc(20879);for (int i = 0; (((i < nRows)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20880)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20881)==0&false)); ++i) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20882);setEntry(i, column, matrix.getEntry(i, 0));
        }

    }}finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldVector<T> getRowVector(final int row)
        throws OutOfRangeException {try{__CLR4_4_1fwafwalb90p8jj.R.inc(20883);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20884);return new ArrayFieldVector<T>(field, getRow(row), false);
    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void setRowVector(final int row, final FieldVector<T> vector)
        throws OutOfRangeException, MatrixDimensionMismatchException {try{__CLR4_4_1fwafwalb90p8jj.R.inc(20885);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20886);checkRowIndex(row);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20887);final int nCols = getColumnDimension();
        __CLR4_4_1fwafwalb90p8jj.R.inc(20888);if ((((vector.getDimension() != nCols)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20889)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20890)==0&false))) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20891);throw new MatrixDimensionMismatchException(1, vector.getDimension(),
                                                       1, nCols);
        }
        }__CLR4_4_1fwafwalb90p8jj.R.inc(20892);for (int i = 0; (((i < nCols)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20893)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20894)==0&false)); ++i) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20895);setEntry(row, i, vector.getEntry(i));
        }

    }}finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldVector<T> getColumnVector(final int column)
        throws OutOfRangeException {try{__CLR4_4_1fwafwalb90p8jj.R.inc(20896);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20897);return new ArrayFieldVector<T>(field, getColumn(column), false);
    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void setColumnVector(final int column, final FieldVector<T> vector)
        throws OutOfRangeException, MatrixDimensionMismatchException {try{__CLR4_4_1fwafwalb90p8jj.R.inc(20898);

        __CLR4_4_1fwafwalb90p8jj.R.inc(20899);checkColumnIndex(column);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20900);final int nRows = getRowDimension();
        __CLR4_4_1fwafwalb90p8jj.R.inc(20901);if ((((vector.getDimension() != nRows)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20902)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20903)==0&false))) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20904);throw new MatrixDimensionMismatchException(vector.getDimension(), 1,
                                                       nRows, 1);
        }
        }__CLR4_4_1fwafwalb90p8jj.R.inc(20905);for (int i = 0; (((i < nRows)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20906)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20907)==0&false)); ++i) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20908);setEntry(i, column, vector.getEntry(i));
        }

    }}finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public T[] getRow(final int row) throws OutOfRangeException {try{__CLR4_4_1fwafwalb90p8jj.R.inc(20909);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20910);checkRowIndex(row);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20911);final int nCols = getColumnDimension();
        __CLR4_4_1fwafwalb90p8jj.R.inc(20912);final T[] out = MathArrays.buildArray(field, nCols);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20913);for (int i = 0; (((i < nCols)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20914)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20915)==0&false)); ++i) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20916);out[i] = getEntry(row, i);
        }

        }__CLR4_4_1fwafwalb90p8jj.R.inc(20917);return out;

    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void setRow(final int row, final T[] array)
        throws OutOfRangeException, MatrixDimensionMismatchException {try{__CLR4_4_1fwafwalb90p8jj.R.inc(20918);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20919);checkRowIndex(row);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20920);final int nCols = getColumnDimension();
        __CLR4_4_1fwafwalb90p8jj.R.inc(20921);if ((((array.length != nCols)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20922)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20923)==0&false))) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20924);throw new MatrixDimensionMismatchException(1, array.length, 1, nCols);
        }
        }__CLR4_4_1fwafwalb90p8jj.R.inc(20925);for (int i = 0; (((i < nCols)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20926)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20927)==0&false)); ++i) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20928);setEntry(row, i, array[i]);
        }

    }}finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public T[] getColumn(final int column) throws OutOfRangeException {try{__CLR4_4_1fwafwalb90p8jj.R.inc(20929);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20930);checkColumnIndex(column);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20931);final int nRows = getRowDimension();
        __CLR4_4_1fwafwalb90p8jj.R.inc(20932);final T[] out = MathArrays.buildArray(field, nRows);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20933);for (int i = 0; (((i < nRows)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20934)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20935)==0&false)); ++i) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20936);out[i] = getEntry(i, column);
        }

        }__CLR4_4_1fwafwalb90p8jj.R.inc(20937);return out;

    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void setColumn(final int column, final T[] array)
        throws OutOfRangeException, MatrixDimensionMismatchException {try{__CLR4_4_1fwafwalb90p8jj.R.inc(20938);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20939);checkColumnIndex(column);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20940);final int nRows = getRowDimension();
        __CLR4_4_1fwafwalb90p8jj.R.inc(20941);if ((((array.length != nRows)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20942)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20943)==0&false))) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20944);throw new MatrixDimensionMismatchException(array.length, 1, nRows, 1);
        }
        }__CLR4_4_1fwafwalb90p8jj.R.inc(20945);for (int i = 0; (((i < nRows)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20946)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20947)==0&false)); ++i) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20948);setEntry(i, column, array[i]);
        }
    }}finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public abstract T getEntry(int row, int column) throws OutOfRangeException;

    /** {@inheritDoc} */
    public abstract void setEntry(int row, int column, T value) throws OutOfRangeException;

    /** {@inheritDoc} */
    public abstract void addToEntry(int row, int column, T increment) throws OutOfRangeException;

    /** {@inheritDoc} */
    public abstract void multiplyEntry(int row, int column, T factor) throws OutOfRangeException;

    /** {@inheritDoc} */
    public FieldMatrix<T> transpose() {try{__CLR4_4_1fwafwalb90p8jj.R.inc(20949);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20950);final int nRows = getRowDimension();
        __CLR4_4_1fwafwalb90p8jj.R.inc(20951);final int nCols = getColumnDimension();
        __CLR4_4_1fwafwalb90p8jj.R.inc(20952);final FieldMatrix<T> out = createMatrix(nCols, nRows);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20953);walkInOptimizedOrder(new DefaultFieldMatrixPreservingVisitor<T>(field.getZero()) {
            /** {@inheritDoc} */
            @Override
            public void visit(final int row, final int column, final T value) {try{__CLR4_4_1fwafwalb90p8jj.R.inc(20954);
                __CLR4_4_1fwafwalb90p8jj.R.inc(20955);out.setEntry(column, row, value);
            }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}
        });

        __CLR4_4_1fwafwalb90p8jj.R.inc(20956);return out;
    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean isSquare() {try{__CLR4_4_1fwafwalb90p8jj.R.inc(20957);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20958);return getColumnDimension() == getRowDimension();
    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public abstract int getRowDimension();

    /** {@inheritDoc} */
    public abstract int getColumnDimension();

    /** {@inheritDoc} */
    public T getTrace() throws NonSquareMatrixException {try{__CLR4_4_1fwafwalb90p8jj.R.inc(20959);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20960);final int nRows = getRowDimension();
        __CLR4_4_1fwafwalb90p8jj.R.inc(20961);final int nCols = getColumnDimension();
        __CLR4_4_1fwafwalb90p8jj.R.inc(20962);if ((((nRows != nCols)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20963)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20964)==0&false))) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20965);throw new NonSquareMatrixException(nRows, nCols);
       }
        }__CLR4_4_1fwafwalb90p8jj.R.inc(20966);T trace = field.getZero();
        __CLR4_4_1fwafwalb90p8jj.R.inc(20967);for (int i = 0; (((i < nRows)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20968)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20969)==0&false)); ++i) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20970);trace = trace.add(getEntry(i, i));
        }
        }__CLR4_4_1fwafwalb90p8jj.R.inc(20971);return trace;
    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public T[] operate(final T[] v) throws DimensionMismatchException {try{__CLR4_4_1fwafwalb90p8jj.R.inc(20972);

        __CLR4_4_1fwafwalb90p8jj.R.inc(20973);final int nRows = getRowDimension();
        __CLR4_4_1fwafwalb90p8jj.R.inc(20974);final int nCols = getColumnDimension();
        __CLR4_4_1fwafwalb90p8jj.R.inc(20975);if ((((v.length != nCols)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20976)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20977)==0&false))) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20978);throw new DimensionMismatchException(v.length, nCols);
        }

        }__CLR4_4_1fwafwalb90p8jj.R.inc(20979);final T[] out = MathArrays.buildArray(field, nRows);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20980);for (int row = 0; (((row < nRows)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20981)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20982)==0&false)); ++row) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(20983);T sum = field.getZero();
            __CLR4_4_1fwafwalb90p8jj.R.inc(20984);for (int i = 0; (((i < nCols)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20985)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20986)==0&false)); ++i) {{
                __CLR4_4_1fwafwalb90p8jj.R.inc(20987);sum = sum.add(getEntry(row, i).multiply(v[i]));
            }
            }__CLR4_4_1fwafwalb90p8jj.R.inc(20988);out[row] = sum;
        }

        }__CLR4_4_1fwafwalb90p8jj.R.inc(20989);return out;
    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldVector<T> operate(final FieldVector<T> v)
        throws DimensionMismatchException {try{__CLR4_4_1fwafwalb90p8jj.R.inc(20990);
        __CLR4_4_1fwafwalb90p8jj.R.inc(20991);try {
            __CLR4_4_1fwafwalb90p8jj.R.inc(20992);return new ArrayFieldVector<T>(field, operate(((ArrayFieldVector<T>) v).getDataRef()), false);
        } catch (ClassCastException cce) {
            __CLR4_4_1fwafwalb90p8jj.R.inc(20993);final int nRows = getRowDimension();
            __CLR4_4_1fwafwalb90p8jj.R.inc(20994);final int nCols = getColumnDimension();
            __CLR4_4_1fwafwalb90p8jj.R.inc(20995);if ((((v.getDimension() != nCols)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(20996)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(20997)==0&false))) {{
                __CLR4_4_1fwafwalb90p8jj.R.inc(20998);throw new DimensionMismatchException(v.getDimension(), nCols);
            }

            }__CLR4_4_1fwafwalb90p8jj.R.inc(20999);final T[] out = MathArrays.buildArray(field, nRows);
            __CLR4_4_1fwafwalb90p8jj.R.inc(21000);for (int row = 0; (((row < nRows)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(21001)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(21002)==0&false)); ++row) {{
                __CLR4_4_1fwafwalb90p8jj.R.inc(21003);T sum = field.getZero();
                __CLR4_4_1fwafwalb90p8jj.R.inc(21004);for (int i = 0; (((i < nCols)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(21005)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(21006)==0&false)); ++i) {{
                    __CLR4_4_1fwafwalb90p8jj.R.inc(21007);sum = sum.add(getEntry(row, i).multiply(v.getEntry(i)));
                }
                }__CLR4_4_1fwafwalb90p8jj.R.inc(21008);out[row] = sum;
            }

            }__CLR4_4_1fwafwalb90p8jj.R.inc(21009);return new ArrayFieldVector<T>(field, out, false);
        }
    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public T[] preMultiply(final T[] v) throws DimensionMismatchException {try{__CLR4_4_1fwafwalb90p8jj.R.inc(21010);

        __CLR4_4_1fwafwalb90p8jj.R.inc(21011);final int nRows = getRowDimension();
        __CLR4_4_1fwafwalb90p8jj.R.inc(21012);final int nCols = getColumnDimension();
        __CLR4_4_1fwafwalb90p8jj.R.inc(21013);if ((((v.length != nRows)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(21014)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(21015)==0&false))) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(21016);throw new DimensionMismatchException(v.length, nRows);
        }

        }__CLR4_4_1fwafwalb90p8jj.R.inc(21017);final T[] out = MathArrays.buildArray(field, nCols);
        __CLR4_4_1fwafwalb90p8jj.R.inc(21018);for (int col = 0; (((col < nCols)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(21019)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(21020)==0&false)); ++col) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(21021);T sum = field.getZero();
            __CLR4_4_1fwafwalb90p8jj.R.inc(21022);for (int i = 0; (((i < nRows)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(21023)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(21024)==0&false)); ++i) {{
                __CLR4_4_1fwafwalb90p8jj.R.inc(21025);sum = sum.add(getEntry(i, col).multiply(v[i]));
            }
            }__CLR4_4_1fwafwalb90p8jj.R.inc(21026);out[col] = sum;
        }

        }__CLR4_4_1fwafwalb90p8jj.R.inc(21027);return out;
    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public FieldVector<T> preMultiply(final FieldVector<T> v)
        throws DimensionMismatchException {try{__CLR4_4_1fwafwalb90p8jj.R.inc(21028);
        __CLR4_4_1fwafwalb90p8jj.R.inc(21029);try {
            __CLR4_4_1fwafwalb90p8jj.R.inc(21030);return new ArrayFieldVector<T>(field, preMultiply(((ArrayFieldVector<T>) v).getDataRef()), false);
        } catch (ClassCastException cce) {
            __CLR4_4_1fwafwalb90p8jj.R.inc(21031);final int nRows = getRowDimension();
            __CLR4_4_1fwafwalb90p8jj.R.inc(21032);final int nCols = getColumnDimension();
            __CLR4_4_1fwafwalb90p8jj.R.inc(21033);if ((((v.getDimension() != nRows)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(21034)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(21035)==0&false))) {{
                __CLR4_4_1fwafwalb90p8jj.R.inc(21036);throw new DimensionMismatchException(v.getDimension(), nRows);
            }

            }__CLR4_4_1fwafwalb90p8jj.R.inc(21037);final T[] out = MathArrays.buildArray(field, nCols);
            __CLR4_4_1fwafwalb90p8jj.R.inc(21038);for (int col = 0; (((col < nCols)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(21039)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(21040)==0&false)); ++col) {{
                __CLR4_4_1fwafwalb90p8jj.R.inc(21041);T sum = field.getZero();
                __CLR4_4_1fwafwalb90p8jj.R.inc(21042);for (int i = 0; (((i < nRows)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(21043)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(21044)==0&false)); ++i) {{
                    __CLR4_4_1fwafwalb90p8jj.R.inc(21045);sum = sum.add(getEntry(i, col).multiply(v.getEntry(i)));
                }
                }__CLR4_4_1fwafwalb90p8jj.R.inc(21046);out[col] = sum;
            }

            }__CLR4_4_1fwafwalb90p8jj.R.inc(21047);return new ArrayFieldVector<T>(field, out, false);
        }
    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public T walkInRowOrder(final FieldMatrixChangingVisitor<T> visitor) {try{__CLR4_4_1fwafwalb90p8jj.R.inc(21048);
        __CLR4_4_1fwafwalb90p8jj.R.inc(21049);final int rows    = getRowDimension();
        __CLR4_4_1fwafwalb90p8jj.R.inc(21050);final int columns = getColumnDimension();
        __CLR4_4_1fwafwalb90p8jj.R.inc(21051);visitor.start(rows, columns, 0, rows - 1, 0, columns - 1);
        __CLR4_4_1fwafwalb90p8jj.R.inc(21052);for (int row = 0; (((row < rows)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(21053)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(21054)==0&false)); ++row) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(21055);for (int column = 0; (((column < columns)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(21056)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(21057)==0&false)); ++column) {{
                __CLR4_4_1fwafwalb90p8jj.R.inc(21058);final T oldValue = getEntry(row, column);
                __CLR4_4_1fwafwalb90p8jj.R.inc(21059);final T newValue = visitor.visit(row, column, oldValue);
                __CLR4_4_1fwafwalb90p8jj.R.inc(21060);setEntry(row, column, newValue);
            }
        }}
        }__CLR4_4_1fwafwalb90p8jj.R.inc(21061);return visitor.end();
    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public T walkInRowOrder(final FieldMatrixPreservingVisitor<T> visitor) {try{__CLR4_4_1fwafwalb90p8jj.R.inc(21062);
        __CLR4_4_1fwafwalb90p8jj.R.inc(21063);final int rows    = getRowDimension();
        __CLR4_4_1fwafwalb90p8jj.R.inc(21064);final int columns = getColumnDimension();
        __CLR4_4_1fwafwalb90p8jj.R.inc(21065);visitor.start(rows, columns, 0, rows - 1, 0, columns - 1);
        __CLR4_4_1fwafwalb90p8jj.R.inc(21066);for (int row = 0; (((row < rows)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(21067)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(21068)==0&false)); ++row) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(21069);for (int column = 0; (((column < columns)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(21070)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(21071)==0&false)); ++column) {{
                __CLR4_4_1fwafwalb90p8jj.R.inc(21072);visitor.visit(row, column, getEntry(row, column));
            }
        }}
        }__CLR4_4_1fwafwalb90p8jj.R.inc(21073);return visitor.end();
    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public T walkInRowOrder(final FieldMatrixChangingVisitor<T> visitor,
                            final int startRow, final int endRow,
                            final int startColumn, final int endColumn)
        throws NumberIsTooSmallException, OutOfRangeException {try{__CLR4_4_1fwafwalb90p8jj.R.inc(21074);
        __CLR4_4_1fwafwalb90p8jj.R.inc(21075);checkSubMatrixIndex(startRow, endRow, startColumn, endColumn);
        __CLR4_4_1fwafwalb90p8jj.R.inc(21076);visitor.start(getRowDimension(), getColumnDimension(),
                      startRow, endRow, startColumn, endColumn);
        __CLR4_4_1fwafwalb90p8jj.R.inc(21077);for (int row = startRow; (((row <= endRow)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(21078)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(21079)==0&false)); ++row) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(21080);for (int column = startColumn; (((column <= endColumn)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(21081)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(21082)==0&false)); ++column) {{
                __CLR4_4_1fwafwalb90p8jj.R.inc(21083);final T oldValue = getEntry(row, column);
                __CLR4_4_1fwafwalb90p8jj.R.inc(21084);final T newValue = visitor.visit(row, column, oldValue);
                __CLR4_4_1fwafwalb90p8jj.R.inc(21085);setEntry(row, column, newValue);
            }
        }}
        }__CLR4_4_1fwafwalb90p8jj.R.inc(21086);return visitor.end();
    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public T walkInRowOrder(final FieldMatrixPreservingVisitor<T> visitor,
                            final int startRow, final int endRow,
                            final int startColumn, final int endColumn)
        throws NumberIsTooSmallException, OutOfRangeException {try{__CLR4_4_1fwafwalb90p8jj.R.inc(21087);
        __CLR4_4_1fwafwalb90p8jj.R.inc(21088);checkSubMatrixIndex(startRow, endRow, startColumn, endColumn);
        __CLR4_4_1fwafwalb90p8jj.R.inc(21089);visitor.start(getRowDimension(), getColumnDimension(),
                      startRow, endRow, startColumn, endColumn);
        __CLR4_4_1fwafwalb90p8jj.R.inc(21090);for (int row = startRow; (((row <= endRow)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(21091)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(21092)==0&false)); ++row) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(21093);for (int column = startColumn; (((column <= endColumn)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(21094)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(21095)==0&false)); ++column) {{
                __CLR4_4_1fwafwalb90p8jj.R.inc(21096);visitor.visit(row, column, getEntry(row, column));
            }
        }}
        }__CLR4_4_1fwafwalb90p8jj.R.inc(21097);return visitor.end();
    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public T walkInColumnOrder(final FieldMatrixChangingVisitor<T> visitor) {try{__CLR4_4_1fwafwalb90p8jj.R.inc(21098);
        __CLR4_4_1fwafwalb90p8jj.R.inc(21099);final int rows    = getRowDimension();
        __CLR4_4_1fwafwalb90p8jj.R.inc(21100);final int columns = getColumnDimension();
        __CLR4_4_1fwafwalb90p8jj.R.inc(21101);visitor.start(rows, columns, 0, rows - 1, 0, columns - 1);
        __CLR4_4_1fwafwalb90p8jj.R.inc(21102);for (int column = 0; (((column < columns)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(21103)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(21104)==0&false)); ++column) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(21105);for (int row = 0; (((row < rows)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(21106)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(21107)==0&false)); ++row) {{
                __CLR4_4_1fwafwalb90p8jj.R.inc(21108);final T oldValue = getEntry(row, column);
                __CLR4_4_1fwafwalb90p8jj.R.inc(21109);final T newValue = visitor.visit(row, column, oldValue);
                __CLR4_4_1fwafwalb90p8jj.R.inc(21110);setEntry(row, column, newValue);
            }
        }}
        }__CLR4_4_1fwafwalb90p8jj.R.inc(21111);return visitor.end();
    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public T walkInColumnOrder(final FieldMatrixPreservingVisitor<T> visitor) {try{__CLR4_4_1fwafwalb90p8jj.R.inc(21112);
        __CLR4_4_1fwafwalb90p8jj.R.inc(21113);final int rows    = getRowDimension();
        __CLR4_4_1fwafwalb90p8jj.R.inc(21114);final int columns = getColumnDimension();
        __CLR4_4_1fwafwalb90p8jj.R.inc(21115);visitor.start(rows, columns, 0, rows - 1, 0, columns - 1);
        __CLR4_4_1fwafwalb90p8jj.R.inc(21116);for (int column = 0; (((column < columns)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(21117)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(21118)==0&false)); ++column) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(21119);for (int row = 0; (((row < rows)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(21120)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(21121)==0&false)); ++row) {{
                __CLR4_4_1fwafwalb90p8jj.R.inc(21122);visitor.visit(row, column, getEntry(row, column));
            }
        }}
        }__CLR4_4_1fwafwalb90p8jj.R.inc(21123);return visitor.end();
    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public T walkInColumnOrder(final FieldMatrixChangingVisitor<T> visitor,
                               final int startRow, final int endRow,
                               final int startColumn, final int endColumn)
    throws NumberIsTooSmallException, OutOfRangeException {try{__CLR4_4_1fwafwalb90p8jj.R.inc(21124);
        __CLR4_4_1fwafwalb90p8jj.R.inc(21125);checkSubMatrixIndex(startRow, endRow, startColumn, endColumn);
        __CLR4_4_1fwafwalb90p8jj.R.inc(21126);visitor.start(getRowDimension(), getColumnDimension(),
                      startRow, endRow, startColumn, endColumn);
        __CLR4_4_1fwafwalb90p8jj.R.inc(21127);for (int column = startColumn; (((column <= endColumn)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(21128)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(21129)==0&false)); ++column) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(21130);for (int row = startRow; (((row <= endRow)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(21131)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(21132)==0&false)); ++row) {{
                __CLR4_4_1fwafwalb90p8jj.R.inc(21133);final T oldValue = getEntry(row, column);
                __CLR4_4_1fwafwalb90p8jj.R.inc(21134);final T newValue = visitor.visit(row, column, oldValue);
                __CLR4_4_1fwafwalb90p8jj.R.inc(21135);setEntry(row, column, newValue);
            }
        }}
        }__CLR4_4_1fwafwalb90p8jj.R.inc(21136);return visitor.end();
    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public T walkInColumnOrder(final FieldMatrixPreservingVisitor<T> visitor,
                               final int startRow, final int endRow,
                               final int startColumn, final int endColumn)
    throws NumberIsTooSmallException, OutOfRangeException{try{__CLR4_4_1fwafwalb90p8jj.R.inc(21137);
        __CLR4_4_1fwafwalb90p8jj.R.inc(21138);checkSubMatrixIndex(startRow, endRow, startColumn, endColumn);
        __CLR4_4_1fwafwalb90p8jj.R.inc(21139);visitor.start(getRowDimension(), getColumnDimension(),
                      startRow, endRow, startColumn, endColumn);
        __CLR4_4_1fwafwalb90p8jj.R.inc(21140);for (int column = startColumn; (((column <= endColumn)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(21141)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(21142)==0&false)); ++column) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(21143);for (int row = startRow; (((row <= endRow)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(21144)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(21145)==0&false)); ++row) {{
                __CLR4_4_1fwafwalb90p8jj.R.inc(21146);visitor.visit(row, column, getEntry(row, column));
            }
        }}
        }__CLR4_4_1fwafwalb90p8jj.R.inc(21147);return visitor.end();
    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public T walkInOptimizedOrder(final FieldMatrixChangingVisitor<T> visitor) {try{__CLR4_4_1fwafwalb90p8jj.R.inc(21148);
        __CLR4_4_1fwafwalb90p8jj.R.inc(21149);return walkInRowOrder(visitor);
    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public T walkInOptimizedOrder(final FieldMatrixPreservingVisitor<T> visitor) {try{__CLR4_4_1fwafwalb90p8jj.R.inc(21150);
        __CLR4_4_1fwafwalb90p8jj.R.inc(21151);return walkInRowOrder(visitor);
    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public T walkInOptimizedOrder(final FieldMatrixChangingVisitor<T> visitor,
                                  final int startRow, final int endRow,
                                  final int startColumn, final int endColumn)
        throws NumberIsTooSmallException, OutOfRangeException {try{__CLR4_4_1fwafwalb90p8jj.R.inc(21152);
        __CLR4_4_1fwafwalb90p8jj.R.inc(21153);return walkInRowOrder(visitor, startRow, endRow, startColumn, endColumn);
    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public T walkInOptimizedOrder(final FieldMatrixPreservingVisitor<T> visitor,
                                  final int startRow, final int endRow,
                                  final int startColumn, final int endColumn)
        throws NumberIsTooSmallException, OutOfRangeException {try{__CLR4_4_1fwafwalb90p8jj.R.inc(21154);
        __CLR4_4_1fwafwalb90p8jj.R.inc(21155);return walkInRowOrder(visitor, startRow, endRow, startColumn, endColumn);
    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /**
     * Get a string representation for this matrix.
     * @return a string representation for this matrix
     */
    @Override
    public String toString() {try{__CLR4_4_1fwafwalb90p8jj.R.inc(21156);
        __CLR4_4_1fwafwalb90p8jj.R.inc(21157);final int nRows = getRowDimension();
        __CLR4_4_1fwafwalb90p8jj.R.inc(21158);final int nCols = getColumnDimension();
        __CLR4_4_1fwafwalb90p8jj.R.inc(21159);final StringBuffer res = new StringBuffer();
        __CLR4_4_1fwafwalb90p8jj.R.inc(21160);String fullClassName = getClass().getName();
        __CLR4_4_1fwafwalb90p8jj.R.inc(21161);String shortClassName = fullClassName.substring(fullClassName.lastIndexOf('.') + 1);
        __CLR4_4_1fwafwalb90p8jj.R.inc(21162);res.append(shortClassName).append("{");

        __CLR4_4_1fwafwalb90p8jj.R.inc(21163);for (int i = 0; (((i < nRows)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(21164)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(21165)==0&false)); ++i) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(21166);if ((((i > 0)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(21167)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(21168)==0&false))) {{
                __CLR4_4_1fwafwalb90p8jj.R.inc(21169);res.append(",");
            }
            }__CLR4_4_1fwafwalb90p8jj.R.inc(21170);res.append("{");
            __CLR4_4_1fwafwalb90p8jj.R.inc(21171);for (int j = 0; (((j < nCols)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(21172)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(21173)==0&false)); ++j) {{
                __CLR4_4_1fwafwalb90p8jj.R.inc(21174);if ((((j > 0)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(21175)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(21176)==0&false))) {{
                    __CLR4_4_1fwafwalb90p8jj.R.inc(21177);res.append(",");
                }
                }__CLR4_4_1fwafwalb90p8jj.R.inc(21178);res.append(getEntry(i, j));
            }
            }__CLR4_4_1fwafwalb90p8jj.R.inc(21179);res.append("}");
        }

        }__CLR4_4_1fwafwalb90p8jj.R.inc(21180);res.append("}");
        __CLR4_4_1fwafwalb90p8jj.R.inc(21181);return res.toString();
    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /**
     * Returns true iff <code>object</code> is a
     * <code>FieldMatrix</code> instance with the same dimensions as this
     * and all corresponding matrix entries are equal.
     *
     * @param object the object to test equality against.
     * @return true if object equals this
     */
    @Override
    public boolean equals(final Object object) {try{__CLR4_4_1fwafwalb90p8jj.R.inc(21182);
        __CLR4_4_1fwafwalb90p8jj.R.inc(21183);if ((((object == this )&&(__CLR4_4_1fwafwalb90p8jj.R.iget(21184)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(21185)==0&false))) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(21186);return true;
        }
        }__CLR4_4_1fwafwalb90p8jj.R.inc(21187);if ((((object instanceof FieldMatrix<?> == false)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(21188)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(21189)==0&false))) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(21190);return false;
        }
        }__CLR4_4_1fwafwalb90p8jj.R.inc(21191);FieldMatrix<?> m = (FieldMatrix<?>) object;
        __CLR4_4_1fwafwalb90p8jj.R.inc(21192);final int nRows = getRowDimension();
        __CLR4_4_1fwafwalb90p8jj.R.inc(21193);final int nCols = getColumnDimension();
        __CLR4_4_1fwafwalb90p8jj.R.inc(21194);if ((((m.getColumnDimension() != nCols || m.getRowDimension() != nRows)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(21195)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(21196)==0&false))) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(21197);return false;
        }
        }__CLR4_4_1fwafwalb90p8jj.R.inc(21198);for (int row = 0; (((row < nRows)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(21199)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(21200)==0&false)); ++row) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(21201);for (int col = 0; (((col < nCols)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(21202)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(21203)==0&false)); ++col) {{
                __CLR4_4_1fwafwalb90p8jj.R.inc(21204);if ((((!getEntry(row, col).equals(m.getEntry(row, col)))&&(__CLR4_4_1fwafwalb90p8jj.R.iget(21205)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(21206)==0&false))) {{
                    __CLR4_4_1fwafwalb90p8jj.R.inc(21207);return false;
                }
            }}
        }}
        }__CLR4_4_1fwafwalb90p8jj.R.inc(21208);return true;
    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /**
     * Computes a hashcode for the matrix.
     *
     * @return hashcode for matrix
     */
    @Override
    public int hashCode() {try{__CLR4_4_1fwafwalb90p8jj.R.inc(21209);
        __CLR4_4_1fwafwalb90p8jj.R.inc(21210);int ret = 322562;
        __CLR4_4_1fwafwalb90p8jj.R.inc(21211);final int nRows = getRowDimension();
        __CLR4_4_1fwafwalb90p8jj.R.inc(21212);final int nCols = getColumnDimension();
        __CLR4_4_1fwafwalb90p8jj.R.inc(21213);ret = ret * 31 + nRows;
        __CLR4_4_1fwafwalb90p8jj.R.inc(21214);ret = ret * 31 + nCols;
        __CLR4_4_1fwafwalb90p8jj.R.inc(21215);for (int row = 0; (((row < nRows)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(21216)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(21217)==0&false)); ++row) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(21218);for (int col = 0; (((col < nCols)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(21219)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(21220)==0&false)); ++col) {{
               __CLR4_4_1fwafwalb90p8jj.R.inc(21221);ret = ret * 31 + (11 * (row+1) + 17 * (col+1)) * getEntry(row, col).hashCode();
           }
        }}
        }__CLR4_4_1fwafwalb90p8jj.R.inc(21222);return ret;
    }finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /**
     * Check if a row index is valid.
     *
     * @param row Row index to check.
     * @throws OutOfRangeException if {@code index} is not valid.
     */
    protected void checkRowIndex(final int row) throws OutOfRangeException {try{__CLR4_4_1fwafwalb90p8jj.R.inc(21223);
        __CLR4_4_1fwafwalb90p8jj.R.inc(21224);if ((((row < 0 || row >= getRowDimension())&&(__CLR4_4_1fwafwalb90p8jj.R.iget(21225)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(21226)==0&false))) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(21227);throw new OutOfRangeException(LocalizedFormats.ROW_INDEX,
                                          row, 0, getRowDimension() - 1);
        }
    }}finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /**
     * Check if a column index is valid.
     *
     * @param column Column index to check.
     * @throws OutOfRangeException if {@code index} is not valid.
     */
    protected void checkColumnIndex(final int column)
        throws OutOfRangeException {try{__CLR4_4_1fwafwalb90p8jj.R.inc(21228);
        __CLR4_4_1fwafwalb90p8jj.R.inc(21229);if ((((column < 0 || column >= getColumnDimension())&&(__CLR4_4_1fwafwalb90p8jj.R.iget(21230)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(21231)==0&false))) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(21232);throw new OutOfRangeException(LocalizedFormats.COLUMN_INDEX,
                                          column, 0, getColumnDimension() - 1);
        }
    }}finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /**
     * Check if submatrix ranges indices are valid.
     * Rows and columns are indicated counting from 0 to n-1.
     *
     * @param startRow Initial row index.
     * @param endRow Final row index.
     * @param startColumn Initial column index.
     * @param endColumn Final column index.
     * @throws OutOfRangeException if the indices are not valid.
     * @throws NumberIsTooSmallException if {@code endRow < startRow} or
     * {@code endColumn < startColumn}.
     */
    protected void checkSubMatrixIndex(final int startRow, final int endRow,
                                       final int startColumn, final int endColumn)
        throws NumberIsTooSmallException, OutOfRangeException {try{__CLR4_4_1fwafwalb90p8jj.R.inc(21233);
        __CLR4_4_1fwafwalb90p8jj.R.inc(21234);checkRowIndex(startRow);
        __CLR4_4_1fwafwalb90p8jj.R.inc(21235);checkRowIndex(endRow);
        __CLR4_4_1fwafwalb90p8jj.R.inc(21236);if ((((endRow < startRow)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(21237)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(21238)==0&false))) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(21239);throw new NumberIsTooSmallException(LocalizedFormats.INITIAL_ROW_AFTER_FINAL_ROW,
                                                endRow, startRow, true);
        }

        }__CLR4_4_1fwafwalb90p8jj.R.inc(21240);checkColumnIndex(startColumn);
        __CLR4_4_1fwafwalb90p8jj.R.inc(21241);checkColumnIndex(endColumn);
        __CLR4_4_1fwafwalb90p8jj.R.inc(21242);if ((((endColumn < startColumn)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(21243)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(21244)==0&false))) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(21245);throw new NumberIsTooSmallException(LocalizedFormats.INITIAL_COLUMN_AFTER_FINAL_COLUMN,
                                                endColumn, startColumn, true);
        }
    }}finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /**
     * Check if submatrix ranges indices are valid.
     * Rows and columns are indicated counting from 0 to n-1.
     *
     * @param selectedRows Array of row indices.
     * @param selectedColumns Array of column indices.
     * @throws NullArgumentException if the arrays are {@code null}.
     * @throws NoDataException if the arrays have zero length.
     * @throws OutOfRangeException if row or column selections are not valid.
     */
    protected void checkSubMatrixIndex(final int[] selectedRows, final int[] selectedColumns)
        throws NoDataException, NullArgumentException, OutOfRangeException {try{__CLR4_4_1fwafwalb90p8jj.R.inc(21246);
        __CLR4_4_1fwafwalb90p8jj.R.inc(21247);if ((((selectedRows == null ||
            selectedColumns == null)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(21248)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(21249)==0&false))) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(21250);throw new NullArgumentException();
        }
        }__CLR4_4_1fwafwalb90p8jj.R.inc(21251);if ((((selectedRows.length == 0 ||
            selectedColumns.length == 0)&&(__CLR4_4_1fwafwalb90p8jj.R.iget(21252)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(21253)==0&false))) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(21254);throw new NoDataException();
        }

        }__CLR4_4_1fwafwalb90p8jj.R.inc(21255);for (final int row : selectedRows) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(21256);checkRowIndex(row);
        }
        }__CLR4_4_1fwafwalb90p8jj.R.inc(21257);for (final int column : selectedColumns) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(21258);checkColumnIndex(column);
        }
    }}finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /**
     * Check if a matrix is addition compatible with the instance.
     *
     * @param m Matrix to check.
     * @throws MatrixDimensionMismatchException if the matrix is not
     * addition-compatible with instance.
     */
    protected void checkAdditionCompatible(final FieldMatrix<T> m)
        throws MatrixDimensionMismatchException {try{__CLR4_4_1fwafwalb90p8jj.R.inc(21259);
        __CLR4_4_1fwafwalb90p8jj.R.inc(21260);if (((((getRowDimension() != m.getRowDimension()) ||
            (getColumnDimension() != m.getColumnDimension()))&&(__CLR4_4_1fwafwalb90p8jj.R.iget(21261)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(21262)==0&false))) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(21263);throw new MatrixDimensionMismatchException(m.getRowDimension(), m.getColumnDimension(),
                                                       getRowDimension(), getColumnDimension());
        }
    }}finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /**
     * Check if a matrix is subtraction compatible with the instance.
     *
     * @param m Matrix to check.
     * @throws MatrixDimensionMismatchException if the matrix is not
     * subtraction-compatible with instance.
     */
    protected void checkSubtractionCompatible(final FieldMatrix<T> m)
        throws MatrixDimensionMismatchException {try{__CLR4_4_1fwafwalb90p8jj.R.inc(21264);
        __CLR4_4_1fwafwalb90p8jj.R.inc(21265);if (((((getRowDimension() != m.getRowDimension()) ||
            (getColumnDimension() != m.getColumnDimension()))&&(__CLR4_4_1fwafwalb90p8jj.R.iget(21266)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(21267)==0&false))) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(21268);throw new MatrixDimensionMismatchException(m.getRowDimension(), m.getColumnDimension(),
                                                       getRowDimension(), getColumnDimension());
        }
    }}finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}

    /**
     * Check if a matrix is multiplication compatible with the instance.
     *
     * @param m Matrix to check.
     * @throws DimensionMismatchException if the matrix is not
     * multiplication-compatible with instance.
     */
    protected void checkMultiplicationCompatible(final FieldMatrix<T> m)
        throws DimensionMismatchException {try{__CLR4_4_1fwafwalb90p8jj.R.inc(21269);
        __CLR4_4_1fwafwalb90p8jj.R.inc(21270);if ((((getColumnDimension() != m.getRowDimension())&&(__CLR4_4_1fwafwalb90p8jj.R.iget(21271)!=0|true))||(__CLR4_4_1fwafwalb90p8jj.R.iget(21272)==0&false))) {{
            __CLR4_4_1fwafwalb90p8jj.R.inc(21273);throw new DimensionMismatchException(m.getRowDimension(), getColumnDimension());
        }
    }}finally{__CLR4_4_1fwafwalb90p8jj.R.flushNeeded();}}
}
